// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.source:
//			CompositeMediaSource, MediaSource, ShuffleOrder, DeferredMediaPeriod, 
//			MediaPeriod, AbstractConcatenatedTimeline, ForwardingTimeline

public class ConcatenatingMediaSource extends CompositeMediaSource
	implements com.google.android.exoplayer2.PlayerMessage.Target
{
	private static final class ConcatenatedTimeline extends AbstractConcatenatedTimeline
	{

		protected int getChildIndexByChildUid(Object obj)
		{
			obj = ((Object) ((Integer)childIndexByUid.get(obj)));
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field HashMap childIndexByUid>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #103 <Method Object HashMap.get(Object)>
		//    4    8:checkcast       #86  <Class Integer>
		//    5   11:astore_1        
			if(obj == null)
		//*   6   12:aload_1         
		//*   7   13:ifnonnull       18
				return -1;
		//    8   16:iconst_m1       
		//    9   17:ireturn         
			else
				return ((Integer) (obj)).intValue();
		//   10   18:aload_1         
		//   11   19:invokevirtual   #106 <Method int Integer.intValue()>
		//   12   22:ireturn         
		}

		protected int getChildIndexByPeriodIndex(int i)
		{
			return Util.binarySearchFloor(firstPeriodInChildIndices, i + 1, false, false);
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field int[] firstPeriodInChildIndices>
		//    2    4:iload_1         
		//    3    5:iconst_1        
		//    4    6:iadd            
		//    5    7:iconst_0        
		//    6    8:iconst_0        
		//    7    9:invokestatic    #114 <Method int Util.binarySearchFloor(int[], int, boolean, boolean)>
		//    8   12:ireturn         
		}

		protected int getChildIndexByWindowIndex(int i)
		{
			return Util.binarySearchFloor(firstWindowInChildIndices, i + 1, false, false);
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field int[] firstWindowInChildIndices>
		//    2    4:iload_1         
		//    3    5:iconst_1        
		//    4    6:iadd            
		//    5    7:iconst_0        
		//    6    8:iconst_0        
		//    7    9:invokestatic    #114 <Method int Util.binarySearchFloor(int[], int, boolean, boolean)>
		//    8   12:ireturn         
		}

		protected Object getChildUidByChildIndex(int i)
		{
			return uids[i];
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field Object[] uids>
		//    2    4:iload_1         
		//    3    5:aaload          
		//    4    6:areturn         
		}

		protected int getFirstPeriodIndexByChildIndex(int i)
		{
			return firstPeriodInChildIndices[i];
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field int[] firstPeriodInChildIndices>
		//    2    4:iload_1         
		//    3    5:iaload          
		//    4    6:ireturn         
		}

		protected int getFirstWindowIndexByChildIndex(int i)
		{
			return firstWindowInChildIndices[i];
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field int[] firstWindowInChildIndices>
		//    2    4:iload_1         
		//    3    5:iaload          
		//    4    6:ireturn         
		}

		public int getPeriodCount()
		{
			return periodCount;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field int periodCount>
		//    2    4:ireturn         
		}

		protected Timeline getTimelineByChildIndex(int i)
		{
			return timelines[i];
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field Timeline[] timelines>
		//    2    4:iload_1         
		//    3    5:aaload          
		//    4    6:areturn         
		}

		public int getWindowCount()
		{
			return windowCount;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field int windowCount>
		//    2    4:ireturn         
		}

		private final HashMap childIndexByUid = new HashMap();
		private final int firstPeriodInChildIndices[];
		private final int firstWindowInChildIndices[];
		private final int periodCount;
		private final Timeline timelines[];
		private final Object uids[];
		private final int windowCount;

		public ConcatenatedTimeline(Collection collection, int i, int j, ShuffleOrder shuffleorder, boolean flag)
		{
			super(flag, shuffleorder);
		//    0    0:aload_0         
		//    1    1:iload           5
		//    2    3:aload           4
		//    3    5:invokespecial   #25  <Method void AbstractConcatenatedTimeline(boolean, ShuffleOrder)>
			windowCount = i;
		//    4    8:aload_0         
		//    5    9:iload_2         
		//    6   10:putfield        #27  <Field int windowCount>
			periodCount = j;
		//    7   13:aload_0         
		//    8   14:iload_3         
		//    9   15:putfield        #29  <Field int periodCount>
			i = collection.size();
		//   10   18:aload_1         
		//   11   19:invokeinterface #35  <Method int Collection.size()>
		//   12   24:istore_2        
			firstPeriodInChildIndices = new int[i];
		//   13   25:aload_0         
		//   14   26:iload_2         
		//   15   27:newarray        int[]
		//   16   29:putfield        #37  <Field int[] firstPeriodInChildIndices>
			firstWindowInChildIndices = new int[i];
		//   17   32:aload_0         
		//   18   33:iload_2         
		//   19   34:newarray        int[]
		//   20   36:putfield        #39  <Field int[] firstWindowInChildIndices>
			timelines = new Timeline[i];
		//   21   39:aload_0         
		//   22   40:iload_2         
		//   23   41:anewarray       Timeline[]
		//   24   44:putfield        #43  <Field Timeline[] timelines>
			uids = new Object[i];
		//   25   47:aload_0         
		//   26   48:iload_2         
		//   27   49:anewarray       Object[]
		//   28   52:putfield        #47  <Field Object[] uids>
		//   29   55:aload_0         
		//   30   56:new             #49  <Class HashMap>
		//   31   59:dup             
		//   32   60:invokespecial   #52  <Method void HashMap()>
		//   33   63:putfield        #54  <Field HashMap childIndexByUid>
			collection = ((Collection) (collection.iterator()));
		//   34   66:aload_1         
		//   35   67:invokeinterface #58  <Method Iterator Collection.iterator()>
		//   36   72:astore_1        
			for(i = 0; ((Iterator) (collection)).hasNext(); i++)
		//*  37   73:iconst_0        
		//*  38   74:istore_2        
		//*  39   75:aload_1         
		//*  40   76:invokeinterface #64  <Method boolean Iterator.hasNext()>
		//*  41   81:ifeq            164
			{
				shuffleorder = ((ShuffleOrder) ((MediaSourceHolder)((Iterator) (collection)).next()));
		//   42   84:aload_1         
		//   43   85:invokeinterface #68  <Method Object Iterator.next()>
		//   44   90:checkcast       #70  <Class ConcatenatingMediaSource$MediaSourceHolder>
		//   45   93:astore          4
				timelines[i] = ((Timeline) (((MediaSourceHolder) (shuffleorder)).timeline));
		//   46   95:aload_0         
		//   47   96:getfield        #43  <Field Timeline[] timelines>
		//   48   99:iload_2         
		//   49  100:aload           4
		//   50  102:getfield        #74  <Field ConcatenatingMediaSource$DeferredTimeline ConcatenatingMediaSource$MediaSourceHolder.timeline>
		//   51  105:aastore         
				firstPeriodInChildIndices[i] = ((MediaSourceHolder) (shuffleorder)).firstPeriodIndexInChild;
		//   52  106:aload_0         
		//   53  107:getfield        #37  <Field int[] firstPeriodInChildIndices>
		//   54  110:iload_2         
		//   55  111:aload           4
		//   56  113:getfield        #77  <Field int ConcatenatingMediaSource$MediaSourceHolder.firstPeriodIndexInChild>
		//   57  116:iastore         
				firstWindowInChildIndices[i] = ((MediaSourceHolder) (shuffleorder)).firstWindowIndexInChild;
		//   58  117:aload_0         
		//   59  118:getfield        #39  <Field int[] firstWindowInChildIndices>
		//   60  121:iload_2         
		//   61  122:aload           4
		//   62  124:getfield        #80  <Field int ConcatenatingMediaSource$MediaSourceHolder.firstWindowIndexInChild>
		//   63  127:iastore         
				uids[i] = ((MediaSourceHolder) (shuffleorder)).uid;
		//   64  128:aload_0         
		//   65  129:getfield        #47  <Field Object[] uids>
		//   66  132:iload_2         
		//   67  133:aload           4
		//   68  135:getfield        #84  <Field Object ConcatenatingMediaSource$MediaSourceHolder.uid>
		//   69  138:aastore         
				childIndexByUid.put(uids[i], ((Object) (Integer.valueOf(i))));
		//   70  139:aload_0         
		//   71  140:getfield        #54  <Field HashMap childIndexByUid>
		//   72  143:aload_0         
		//   73  144:getfield        #47  <Field Object[] uids>
		//   74  147:iload_2         
		//   75  148:aaload          
		//   76  149:iload_2         
		//   77  150:invokestatic    #90  <Method Integer Integer.valueOf(int)>
		//   78  153:invokevirtual   #94  <Method Object HashMap.put(Object, Object)>
		//   79  156:pop             
			}

		//   80  157:iload_2         
		//   81  158:iconst_1        
		//   82  159:iadd            
		//   83  160:istore_2        
		//*  84  161:goto            75
		//   85  164:return          
		}
	}

	private static final class DeferredTimeline extends ForwardingTimeline
	{

		public DeferredTimeline cloneWithNewTimeline(Timeline timeline)
		{
			Object obj;
			if(replacedId == null && timeline.getPeriodCount() > 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #44  <Field Object replacedId>
		//*   2    4:ifnonnull       30
		//*   3    7:aload_1         
		//*   4    8:invokevirtual   #52  <Method int Timeline.getPeriodCount()>
		//*   5   11:ifle            30
				obj = timeline.getPeriod(0, period, true).uid;
		//    6   14:aload_1         
		//    7   15:iconst_0        
		//    8   16:getstatic       #28  <Field com.google.android.exoplayer2.Timeline$Period period>
		//    9   19:iconst_1        
		//   10   20:invokevirtual   #56  <Method com.google.android.exoplayer2.Timeline$Period Timeline.getPeriod(int, com.google.android.exoplayer2.Timeline$Period, boolean)>
		//   11   23:getfield        #59  <Field Object com.google.android.exoplayer2.Timeline$Period.uid>
		//   12   26:astore_2        
			else
		//*  13   27:goto            35
				obj = replacedId;
		//   14   30:aload_0         
		//   15   31:getfield        #44  <Field Object replacedId>
		//   16   34:astore_2        
			return new DeferredTimeline(timeline, obj);
		//   17   35:new             #2   <Class ConcatenatingMediaSource$DeferredTimeline>
		//   18   38:dup             
		//   19   39:aload_1         
		//   20   40:aload_2         
		//   21   41:invokespecial   #39  <Method void ConcatenatingMediaSource$DeferredTimeline(Timeline, Object)>
		//   22   44:areturn         
		}

		public int getIndexOfPeriod(Object obj)
		{
			Timeline timeline = this.timeline;
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Timeline timeline>
		//    2    4:astore_3        
			Object obj1 = obj;
		//    3    5:aload_1         
		//    4    6:astore_2        
			if(DUMMY_ID.equals(obj))
		//*   5    7:getstatic       #23  <Field Object DUMMY_ID>
		//*   6   10:aload_1         
		//*   7   11:invokevirtual   #69  <Method boolean Object.equals(Object)>
		//*   8   14:ifeq            22
				obj1 = replacedId;
		//    9   17:aload_0         
		//   10   18:getfield        #44  <Field Object replacedId>
		//   11   21:astore_2        
			return timeline.getIndexOfPeriod(obj1);
		//   12   22:aload_3         
		//   13   23:aload_2         
		//   14   24:invokevirtual   #71  <Method int Timeline.getIndexOfPeriod(Object)>
		//   15   27:ireturn         
		}

		public com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period1, boolean flag)
		{
			timeline.getPeriod(i, period1, flag);
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Timeline timeline>
		//    2    4:iload_1         
		//    3    5:aload_2         
		//    4    6:iload_3         
		//    5    7:invokevirtual   #56  <Method com.google.android.exoplayer2.Timeline$Period Timeline.getPeriod(int, com.google.android.exoplayer2.Timeline$Period, boolean)>
		//    6   10:pop             
			if(Util.areEqual(period1.uid, replacedId))
		//*   7   11:aload_2         
		//*   8   12:getfield        #59  <Field Object com.google.android.exoplayer2.Timeline$Period.uid>
		//*   9   15:aload_0         
		//*  10   16:getfield        #44  <Field Object replacedId>
		//*  11   19:invokestatic    #77  <Method boolean Util.areEqual(Object, Object)>
		//*  12   22:ifeq            32
				period1.uid = DUMMY_ID;
		//   13   25:aload_2         
		//   14   26:getstatic       #23  <Field Object DUMMY_ID>
		//   15   29:putfield        #59  <Field Object com.google.android.exoplayer2.Timeline$Period.uid>
			return period1;
		//   16   32:aload_2         
		//   17   33:areturn         
		}

		public Timeline getTimeline()
		{
			return timeline;
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Timeline timeline>
		//    2    4:areturn         
		}

		private static final Object DUMMY_ID = new Object();
		private static final DummyTimeline dummyTimeline = new DummyTimeline();
		private static final com.google.android.exoplayer2.Timeline.Period period = new com.google.android.exoplayer2.Timeline.Period();
		private final Object replacedId;

		static 
		{
		//    0    0:new             #18  <Class Object>
		//    1    3:dup             
		//    2    4:invokespecial   #21  <Method void Object()>
		//    3    7:putstatic       #23  <Field Object DUMMY_ID>
		//    4   10:new             #25  <Class com.google.android.exoplayer2.Timeline$Period>
		//    5   13:dup             
		//    6   14:invokespecial   #26  <Method void com.google.android.exoplayer2.Timeline$Period()>
		//    7   17:putstatic       #28  <Field com.google.android.exoplayer2.Timeline$Period period>
		//    8   20:new             #30  <Class ConcatenatingMediaSource$DummyTimeline>
		//    9   23:dup             
		//   10   24:aconst_null     
		//   11   25:invokespecial   #33  <Method void ConcatenatingMediaSource$DummyTimeline(ConcatenatingMediaSource$1)>
		//   12   28:putstatic       #35  <Field ConcatenatingMediaSource$DummyTimeline dummyTimeline>
		//*  13   31:return          
		}

		public DeferredTimeline()
		{
			this(((Timeline) (dummyTimeline)), ((Object) (null)));
		//    0    0:aload_0         
		//    1    1:getstatic       #35  <Field ConcatenatingMediaSource$DummyTimeline dummyTimeline>
		//    2    4:aconst_null     
		//    3    5:invokespecial   #39  <Method void ConcatenatingMediaSource$DeferredTimeline(Timeline, Object)>
		//    4    8:return          
		}

		private DeferredTimeline(Timeline timeline, Object obj)
		{
			super(timeline);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #42  <Method void ForwardingTimeline(Timeline)>
			replacedId = obj;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #44  <Field Object replacedId>
		//    6   10:return          
		}
	}

	private static final class DummyTimeline extends Timeline
	{

		public int getIndexOfPeriod(Object obj)
		{
			return obj != null ? -1 : 0;
		//    0    0:aload_1         
		//    1    1:ifnonnull       6
		//    2    4:iconst_0        
		//    3    5:ireturn         
		//    4    6:iconst_m1       
		//    5    7:ireturn         
		}

		public com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period, boolean flag)
		{
			return period.set(((Object) (null)), ((Object) (null)), 0, 0x1L, 0L);
		//    0    0:aload_2         
		//    1    1:aconst_null     
		//    2    2:aconst_null     
		//    3    3:iconst_0        
		//    4    4:ldc2w           #19  <Long 0x1L>
		//    5    7:lconst_0        
		//    6    8:invokevirtual   #26  <Method com.google.android.exoplayer2.Timeline$Period com.google.android.exoplayer2.Timeline$Period.set(Object, Object, int, long, long)>
		//    7   11:areturn         
		}

		public int getPeriodCount()
		{
			return 1;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public com.google.android.exoplayer2.Timeline.Window getWindow(int i, com.google.android.exoplayer2.Timeline.Window window1, boolean flag, long l)
		{
			long l1 = 0L;
		//    0    0:lconst_0        
		//    1    1:lstore          6
			if(l > 0L)
		//*   2    3:lload           4
		//*   3    5:lconst_0        
		//*   4    6:lcmp            
		//*   5    7:ifle            15
				l1 = 0x1L;
		//    6   10:ldc2w           #19  <Long 0x1L>
		//    7   13:lstore          6
			return window1.set(((Object) (null)), 0x1L, 0x1L, false, true, l1, 0x1L, 0, 0, 0L);
		//    8   15:aload_2         
		//    9   16:aconst_null     
		//   10   17:ldc2w           #19  <Long 0x1L>
		//   11   20:ldc2w           #19  <Long 0x1L>
		//   12   23:iconst_0        
		//   13   24:iconst_1        
		//   14   25:lload           6
		//   15   27:ldc2w           #19  <Long 0x1L>
		//   16   30:iconst_0        
		//   17   31:iconst_0        
		//   18   32:lconst_0        
		//   19   33:invokevirtual   #35  <Method com.google.android.exoplayer2.Timeline$Window com.google.android.exoplayer2.Timeline$Window.set(Object, long, long, boolean, boolean, long, long, int, int, long)>
		//   20   36:areturn         
		}

		public int getWindowCount()
		{
			return 1;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		private DummyTimeline()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Timeline()>
		//    2    4:return          
		}

	}

	private static final class EventDispatcher
	{

		public void dispatchEvent()
		{
			eventHandler.post(runnable);
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field Handler eventHandler>
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field Runnable runnable>
		//    4    8:invokevirtual   #40  <Method boolean Handler.post(Runnable)>
		//    5   11:pop             
		//    6   12:return          
		}

		public final Handler eventHandler;
		public final Runnable runnable;

		public EventDispatcher(Runnable runnable1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			runnable = runnable1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field Runnable runnable>
			if(Looper.myLooper() != null)
		//*   5    9:invokestatic    #24  <Method Looper Looper.myLooper()>
		//*   6   12:ifnull          22
				runnable1 = ((Runnable) (Looper.myLooper()));
		//    7   15:invokestatic    #24  <Method Looper Looper.myLooper()>
		//    8   18:astore_1        
			else
		//*   9   19:goto            26
				runnable1 = ((Runnable) (Looper.getMainLooper()));
		//   10   22:invokestatic    #27  <Method Looper Looper.getMainLooper()>
		//   11   25:astore_1        
			eventHandler = new Handler(((Looper) (runnable1)));
		//   12   26:aload_0         
		//   13   27:new             #29  <Class Handler>
		//   14   30:dup             
		//   15   31:aload_1         
		//   16   32:invokespecial   #32  <Method void Handler(Looper)>
		//   17   35:putfield        #34  <Field Handler eventHandler>
		//   18   38:return          
		}
	}

	static final class MediaSourceHolder
		implements Comparable
	{

		public int compareTo(MediaSourceHolder mediasourceholder)
		{
			return firstPeriodIndexInChild - mediasourceholder.firstPeriodIndexInChild;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field int firstPeriodIndexInChild>
		//    2    4:aload_1         
		//    3    5:getfield        #51  <Field int firstPeriodIndexInChild>
		//    4    8:isub            
		//    5    9:ireturn         
		}

		public volatile int compareTo(Object obj)
		{
			return compareTo((MediaSourceHolder)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #2   <Class ConcatenatingMediaSource$MediaSourceHolder>
		//    3    5:invokevirtual   #55  <Method int compareTo(ConcatenatingMediaSource$MediaSourceHolder)>
		//    4    8:ireturn         
		}

		public void reset(int i, int j, int k)
		{
			childIndex = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #59  <Field int childIndex>
			firstWindowIndexInChild = j;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #61  <Field int firstWindowIndexInChild>
			firstPeriodIndexInChild = k;
		//    6   10:aload_0         
		//    7   11:iload_3         
		//    8   12:putfield        #51  <Field int firstPeriodIndexInChild>
			isPrepared = false;
		//    9   15:aload_0         
		//   10   16:iconst_0        
		//   11   17:putfield        #63  <Field boolean isPrepared>
			isRemoved = false;
		//   12   20:aload_0         
		//   13   21:iconst_0        
		//   14   22:putfield        #65  <Field boolean isRemoved>
			activeMediaPeriods.clear();
		//   15   25:aload_0         
		//   16   26:getfield        #43  <Field List activeMediaPeriods>
		//   17   29:invokeinterface #70  <Method void List.clear()>
		//   18   34:return          
		}

		public List activeMediaPeriods;
		public int childIndex;
		public int firstPeriodIndexInChild;
		public int firstWindowIndexInChild;
		public boolean isPrepared;
		public boolean isRemoved;
		public final MediaSource mediaSource;
		public DeferredTimeline timeline;
		public final Object uid = new Object();

		public MediaSourceHolder(MediaSource mediasource)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
			mediaSource = mediasource;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #33  <Field MediaSource mediaSource>
			timeline = new DeferredTimeline();
		//    5    9:aload_0         
		//    6   10:new             #35  <Class ConcatenatingMediaSource$DeferredTimeline>
		//    7   13:dup             
		//    8   14:invokespecial   #36  <Method void ConcatenatingMediaSource$DeferredTimeline()>
		//    9   17:putfield        #38  <Field ConcatenatingMediaSource$DeferredTimeline timeline>
			activeMediaPeriods = ((List) (new ArrayList()));
		//   10   20:aload_0         
		//   11   21:new             #40  <Class ArrayList>
		//   12   24:dup             
		//   13   25:invokespecial   #41  <Method void ArrayList()>
		//   14   28:putfield        #43  <Field List activeMediaPeriods>
		//   15   31:aload_0         
		//   16   32:new             #5   <Class Object>
		//   17   35:dup             
		//   18   36:invokespecial   #31  <Method void Object()>
		//   19   39:putfield        #45  <Field Object uid>
		//   20   42:return          
		}
	}

	private static final class MessageData
	{

		public final EventDispatcher actionOnCompletion;
		public final Object customData;
		public final int index;

		public MessageData(int i, Object obj, Runnable runnable)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			index = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #23  <Field int index>
			if(runnable != null)
		//*   5    9:aload_3         
		//*   6   10:ifnull          25
				runnable = ((Runnable) (new EventDispatcher(runnable)));
		//    7   13:new             #25  <Class ConcatenatingMediaSource$EventDispatcher>
		//    8   16:dup             
		//    9   17:aload_3         
		//   10   18:invokespecial   #28  <Method void ConcatenatingMediaSource$EventDispatcher(Runnable)>
		//   11   21:astore_3        
			else
		//*  12   22:goto            27
				runnable = null;
		//   13   25:aconst_null     
		//   14   26:astore_3        
			actionOnCompletion = ((EventDispatcher) (runnable));
		//   15   27:aload_0         
		//   16   28:aload_3         
		//   17   29:putfield        #30  <Field ConcatenatingMediaSource$EventDispatcher actionOnCompletion>
			customData = obj;
		//   18   32:aload_0         
		//   19   33:aload_2         
		//   20   34:putfield        #32  <Field Object customData>
		//   21   37:return          
		}
	}


	public ConcatenatingMediaSource()
	{
		this(false, ((ShuffleOrder) (new ShuffleOrder.DefaultShuffleOrder(0))));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:new             #68  <Class ShuffleOrder$DefaultShuffleOrder>
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:invokespecial   #71  <Method void ShuffleOrder$DefaultShuffleOrder(int)>
	//    6   10:invokespecial   #74  <Method void ConcatenatingMediaSource(boolean, ShuffleOrder)>
	//    7   13:return          
	}

	public ConcatenatingMediaSource(boolean flag)
	{
		this(flag, ((ShuffleOrder) (new ShuffleOrder.DefaultShuffleOrder(0))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:new             #68  <Class ShuffleOrder$DefaultShuffleOrder>
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:invokespecial   #71  <Method void ShuffleOrder$DefaultShuffleOrder(int)>
	//    6   10:invokespecial   #74  <Method void ConcatenatingMediaSource(boolean, ShuffleOrder)>
	//    7   13:return          
	}

	public ConcatenatingMediaSource(boolean flag, ShuffleOrder shuffleorder)
	{
		this(flag, shuffleorder, new MediaSource[0]);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:anewarray       MediaSource[]
	//    5    7:invokespecial   #81  <Method void ConcatenatingMediaSource(boolean, ShuffleOrder, MediaSource[])>
	//    6   10:return          
	}

	public transient ConcatenatingMediaSource(boolean flag, ShuffleOrder shuffleorder, MediaSource amediasource[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #83  <Method void CompositeMediaSource()>
		int i = 0;
	//    2    4:iconst_0        
	//    3    5:istore          4
		for(int j = amediasource.length; i < j; i++)
	//*   4    7:aload_3         
	//*   5    8:arraylength     
	//*   6    9:istore          5
	//*   7   11:iload           4
	//*   8   13:iload           5
	//*   9   15:icmpge          35
			Assertions.checkNotNull(((Object) (amediasource[i])));
	//   10   18:aload_3         
	//   11   19:iload           4
	//   12   21:aaload          
	//   13   22:invokestatic    #89  <Method Object Assertions.checkNotNull(Object)>
	//   14   25:pop             

	//   15   26:iload           4
	//   16   28:iconst_1        
	//   17   29:iadd            
	//   18   30:istore          4
	//*  19   32:goto            11
		ShuffleOrder shuffleorder1 = shuffleorder;
	//   20   35:aload_2         
	//   21   36:astore          6
		if(shuffleorder.getLength() > 0)
	//*  22   38:aload_2         
	//*  23   39:invokeinterface #95  <Method int ShuffleOrder.getLength()>
	//*  24   44:ifle            55
			shuffleorder1 = shuffleorder.cloneAndClear();
	//   25   47:aload_2         
	//   26   48:invokeinterface #99  <Method ShuffleOrder ShuffleOrder.cloneAndClear()>
	//   27   53:astore          6
		shuffleOrder = shuffleorder1;
	//   28   55:aload_0         
	//   29   56:aload           6
	//   30   58:putfield        #101 <Field ShuffleOrder shuffleOrder>
		mediaSourceByMediaPeriod = ((Map) (new IdentityHashMap()));
	//   31   61:aload_0         
	//   32   62:new             #103 <Class IdentityHashMap>
	//   33   65:dup             
	//   34   66:invokespecial   #104 <Method void IdentityHashMap()>
	//   35   69:putfield        #106 <Field Map mediaSourceByMediaPeriod>
		mediaSourcesPublic = ((List) (new ArrayList()));
	//   36   72:aload_0         
	//   37   73:new             #108 <Class ArrayList>
	//   38   76:dup             
	//   39   77:invokespecial   #109 <Method void ArrayList()>
	//   40   80:putfield        #111 <Field List mediaSourcesPublic>
		mediaSourceHolders = ((List) (new ArrayList()));
	//   41   83:aload_0         
	//   42   84:new             #108 <Class ArrayList>
	//   43   87:dup             
	//   44   88:invokespecial   #109 <Method void ArrayList()>
	//   45   91:putfield        #113 <Field List mediaSourceHolders>
		pendingOnCompletionActions = ((List) (new ArrayList()));
	//   46   94:aload_0         
	//   47   95:new             #108 <Class ArrayList>
	//   48   98:dup             
	//   49   99:invokespecial   #109 <Method void ArrayList()>
	//   50  102:putfield        #115 <Field List pendingOnCompletionActions>
		query = new MediaSourceHolder(((MediaSource) (null)));
	//   51  105:aload_0         
	//   52  106:new             #23  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//   53  109:dup             
	//   54  110:aconst_null     
	//   55  111:invokespecial   #118 <Method void ConcatenatingMediaSource$MediaSourceHolder(MediaSource)>
	//   56  114:putfield        #120 <Field ConcatenatingMediaSource$MediaSourceHolder query>
		isAtomic = flag;
	//   57  117:aload_0         
	//   58  118:iload_1         
	//   59  119:putfield        #122 <Field boolean isAtomic>
		window = new com.google.android.exoplayer2.Timeline.Window();
	//   60  122:aload_0         
	//   61  123:new             #124 <Class com.google.android.exoplayer2.Timeline$Window>
	//   62  126:dup             
	//   63  127:invokespecial   #125 <Method void com.google.android.exoplayer2.Timeline$Window()>
	//   64  130:putfield        #127 <Field com.google.android.exoplayer2.Timeline$Window window>
		addMediaSources(((Collection) (Arrays.asList(((Object []) (amediasource))))));
	//   65  133:aload_0         
	//   66  134:aload_3         
	//   67  135:invokestatic    #133 <Method List Arrays.asList(Object[])>
	//   68  138:invokevirtual   #137 <Method void addMediaSources(Collection)>
	//   69  141:return          
	}

	public transient ConcatenatingMediaSource(boolean flag, MediaSource amediasource[])
	{
		this(flag, ((ShuffleOrder) (new ShuffleOrder.DefaultShuffleOrder(0))), amediasource);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:new             #68  <Class ShuffleOrder$DefaultShuffleOrder>
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:invokespecial   #71  <Method void ShuffleOrder$DefaultShuffleOrder(int)>
	//    6   10:aload_2         
	//    7   11:invokespecial   #81  <Method void ConcatenatingMediaSource(boolean, ShuffleOrder, MediaSource[])>
	//    8   14:return          
	}

	public transient ConcatenatingMediaSource(MediaSource amediasource[])
	{
		this(false, amediasource);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:invokespecial   #141 <Method void ConcatenatingMediaSource(boolean, MediaSource[])>
	//    4    6:return          
	}

	private void addMediaSourceInternal(int i, MediaSourceHolder mediasourceholder)
	{
		if(i > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            52
		{
			MediaSourceHolder mediasourceholder1 = (MediaSourceHolder)mediaSourceHolders.get(i - 1);
	//    2    4:aload_0         
	//    3    5:getfield        #113 <Field List mediaSourceHolders>
	//    4    8:iload_1         
	//    5    9:iconst_1        
	//    6   10:isub            
	//    7   11:invokeinterface #149 <Method Object List.get(int)>
	//    8   16:checkcast       #23  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//    9   19:astore_3        
			mediasourceholder.reset(i, mediasourceholder1.firstWindowIndexInChild + mediasourceholder1.timeline.getWindowCount(), mediasourceholder1.firstPeriodIndexInChild + mediasourceholder1.timeline.getPeriodCount());
	//   10   20:aload_2         
	//   11   21:iload_1         
	//   12   22:aload_3         
	//   13   23:getfield        #152 <Field int ConcatenatingMediaSource$MediaSourceHolder.firstWindowIndexInChild>
	//   14   26:aload_3         
	//   15   27:getfield        #156 <Field ConcatenatingMediaSource$DeferredTimeline ConcatenatingMediaSource$MediaSourceHolder.timeline>
	//   16   30:invokevirtual   #159 <Method int ConcatenatingMediaSource$DeferredTimeline.getWindowCount()>
	//   17   33:iadd            
	//   18   34:aload_3         
	//   19   35:getfield        #162 <Field int ConcatenatingMediaSource$MediaSourceHolder.firstPeriodIndexInChild>
	//   20   38:aload_3         
	//   21   39:getfield        #156 <Field ConcatenatingMediaSource$DeferredTimeline ConcatenatingMediaSource$MediaSourceHolder.timeline>
	//   22   42:invokevirtual   #165 <Method int ConcatenatingMediaSource$DeferredTimeline.getPeriodCount()>
	//   23   45:iadd            
	//   24   46:invokevirtual   #169 <Method void ConcatenatingMediaSource$MediaSourceHolder.reset(int, int, int)>
		} else
	//*  25   49:goto            59
		{
			mediasourceholder.reset(i, 0, 0);
	//   26   52:aload_2         
	//   27   53:iload_1         
	//   28   54:iconst_0        
	//   29   55:iconst_0        
	//   30   56:invokevirtual   #169 <Method void ConcatenatingMediaSource$MediaSourceHolder.reset(int, int, int)>
		}
		correctOffsets(i, 1, mediasourceholder.timeline.getWindowCount(), mediasourceholder.timeline.getPeriodCount());
	//   31   59:aload_0         
	//   32   60:iload_1         
	//   33   61:iconst_1        
	//   34   62:aload_2         
	//   35   63:getfield        #156 <Field ConcatenatingMediaSource$DeferredTimeline ConcatenatingMediaSource$MediaSourceHolder.timeline>
	//   36   66:invokevirtual   #159 <Method int ConcatenatingMediaSource$DeferredTimeline.getWindowCount()>
	//   37   69:aload_2         
	//   38   70:getfield        #156 <Field ConcatenatingMediaSource$DeferredTimeline ConcatenatingMediaSource$MediaSourceHolder.timeline>
	//   39   73:invokevirtual   #165 <Method int ConcatenatingMediaSource$DeferredTimeline.getPeriodCount()>
	//   40   76:invokespecial   #173 <Method void correctOffsets(int, int, int, int)>
		mediaSourceHolders.add(i, ((Object) (mediasourceholder)));
	//   41   79:aload_0         
	//   42   80:getfield        #113 <Field List mediaSourceHolders>
	//   43   83:iload_1         
	//   44   84:aload_2         
	//   45   85:invokeinterface #177 <Method void List.add(int, Object)>
		prepareChildSource(((Object) (mediasourceholder)), mediasourceholder.mediaSource);
	//   46   90:aload_0         
	//   47   91:aload_2         
	//   48   92:aload_2         
	//   49   93:getfield        #181 <Field MediaSource ConcatenatingMediaSource$MediaSourceHolder.mediaSource>
	//   50   96:invokevirtual   #185 <Method void prepareChildSource(Object, MediaSource)>
	//   51   99:return          
	}

	private void addMediaSourcesInternal(int i, Collection collection)
	{
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*   0    0:aload_2         
	//*   1    1:invokeinterface #193 <Method Iterator Collection.iterator()>
	//*   2    6:astore_2        
	//*   3    7:aload_2         
	//*   4    8:invokeinterface #199 <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            37
		{
			addMediaSourceInternal(i, (MediaSourceHolder)((Iterator) (collection)).next());
	//    6   16:aload_0         
	//    7   17:iload_1         
	//    8   18:aload_2         
	//    9   19:invokeinterface #203 <Method Object Iterator.next()>
	//   10   24:checkcast       #23  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//   11   27:invokespecial   #205 <Method void addMediaSourceInternal(int, ConcatenatingMediaSource$MediaSourceHolder)>
			i++;
	//   12   30:iload_1         
	//   13   31:iconst_1        
	//   14   32:iadd            
	//   15   33:istore_1        
		}

	//*  16   34:goto            7
	//   17   37:return          
	}

	private void clearInternal()
	{
		for(int i = mediaSourceHolders.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field List mediaSourceHolders>
	//*   2    4:invokeinterface #211 <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:isub            
	//*   5   11:istore_1        
	//*   6   12:iload_1         
	//*   7   13:iflt            28
			removeMediaSourceInternal(i);
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokespecial   #214 <Method void removeMediaSourceInternal(int)>

	//   11   21:iload_1         
	//   12   22:iconst_1        
	//   13   23:isub            
	//   14   24:istore_1        
	//*  15   25:goto            12
	//   16   28:return          
	}

	private void correctOffsets(int i, int j, int k, int l)
	{
		windowCount = windowCount + k;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #216 <Field int windowCount>
	//    3    5:iload_3         
	//    4    6:iadd            
	//    5    7:putfield        #216 <Field int windowCount>
		periodCount = periodCount + l;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #218 <Field int periodCount>
	//    9   15:iload           4
	//   10   17:iadd            
	//   11   18:putfield        #218 <Field int periodCount>
		for(; i < mediaSourceHolders.size(); i++)
	//*  12   21:iload_1         
	//*  13   22:aload_0         
	//*  14   23:getfield        #113 <Field List mediaSourceHolders>
	//*  15   26:invokeinterface #211 <Method int List.size()>
	//*  16   31:icmpge          123
		{
			MediaSourceHolder mediasourceholder = (MediaSourceHolder)mediaSourceHolders.get(i);
	//   17   34:aload_0         
	//   18   35:getfield        #113 <Field List mediaSourceHolders>
	//   19   38:iload_1         
	//   20   39:invokeinterface #149 <Method Object List.get(int)>
	//   21   44:checkcast       #23  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//   22   47:astore          5
			mediasourceholder.childIndex = mediasourceholder.childIndex + j;
	//   23   49:aload           5
	//   24   51:aload           5
	//   25   53:getfield        #221 <Field int ConcatenatingMediaSource$MediaSourceHolder.childIndex>
	//   26   56:iload_2         
	//   27   57:iadd            
	//   28   58:putfield        #221 <Field int ConcatenatingMediaSource$MediaSourceHolder.childIndex>
			mediasourceholder = (MediaSourceHolder)mediaSourceHolders.get(i);
	//   29   61:aload_0         
	//   30   62:getfield        #113 <Field List mediaSourceHolders>
	//   31   65:iload_1         
	//   32   66:invokeinterface #149 <Method Object List.get(int)>
	//   33   71:checkcast       #23  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//   34   74:astore          5
			mediasourceholder.firstWindowIndexInChild = mediasourceholder.firstWindowIndexInChild + k;
	//   35   76:aload           5
	//   36   78:aload           5
	//   37   80:getfield        #152 <Field int ConcatenatingMediaSource$MediaSourceHolder.firstWindowIndexInChild>
	//   38   83:iload_3         
	//   39   84:iadd            
	//   40   85:putfield        #152 <Field int ConcatenatingMediaSource$MediaSourceHolder.firstWindowIndexInChild>
			mediasourceholder = (MediaSourceHolder)mediaSourceHolders.get(i);
	//   41   88:aload_0         
	//   42   89:getfield        #113 <Field List mediaSourceHolders>
	//   43   92:iload_1         
	//   44   93:invokeinterface #149 <Method Object List.get(int)>
	//   45   98:checkcast       #23  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//   46  101:astore          5
			mediasourceholder.firstPeriodIndexInChild = mediasourceholder.firstPeriodIndexInChild + l;
	//   47  103:aload           5
	//   48  105:aload           5
	//   49  107:getfield        #162 <Field int ConcatenatingMediaSource$MediaSourceHolder.firstPeriodIndexInChild>
	//   50  110:iload           4
	//   51  112:iadd            
	//   52  113:putfield        #162 <Field int ConcatenatingMediaSource$MediaSourceHolder.firstPeriodIndexInChild>
		}

	//   53  116:iload_1         
	//   54  117:iconst_1        
	//   55  118:iadd            
	//   56  119:istore_1        
	//*  57  120:goto            21
	//   58  123:return          
	}

	private int findMediaSourceHolderByPeriodIndex(int i)
	{
		query.firstPeriodIndexInChild = i;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field ConcatenatingMediaSource$MediaSourceHolder query>
	//    2    4:iload_1         
	//    3    5:putfield        #162 <Field int ConcatenatingMediaSource$MediaSourceHolder.firstPeriodIndexInChild>
		int k = Collections.binarySearch(mediaSourceHolders, ((Object) (query)));
	//    4    8:aload_0         
	//    5    9:getfield        #113 <Field List mediaSourceHolders>
	//    6   12:aload_0         
	//    7   13:getfield        #120 <Field ConcatenatingMediaSource$MediaSourceHolder query>
	//    8   16:invokestatic    #229 <Method int Collections.binarySearch(List, Object)>
	//    9   19:istore_3        
		int j = k;
	//   10   20:iload_3         
	//   11   21:istore_2        
		if(k < 0)
	//*  12   22:iload_3         
	//*  13   23:ifge            31
			return -k - 2;
	//   14   26:iload_3         
	//   15   27:ineg            
	//   16   28:iconst_2        
	//   17   29:isub            
	//   18   30:ireturn         
		do
		{
			if(j >= mediaSourceHolders.size() - 1)
				break;
	//   19   31:iload_2         
	//   20   32:aload_0         
	//   21   33:getfield        #113 <Field List mediaSourceHolders>
	//   22   36:invokeinterface #211 <Method int List.size()>
	//   23   41:iconst_1        
	//   24   42:isub            
	//   25   43:icmpge          79
			List list = mediaSourceHolders;
	//   26   46:aload_0         
	//   27   47:getfield        #113 <Field List mediaSourceHolders>
	//   28   50:astore          4
			int l = j + 1;
	//   29   52:iload_2         
	//   30   53:iconst_1        
	//   31   54:iadd            
	//   32   55:istore_3        
			if(((MediaSourceHolder)list.get(l)).firstPeriodIndexInChild != i)
				break;
	//   33   56:aload           4
	//   34   58:iload_3         
	//   35   59:invokeinterface #149 <Method Object List.get(int)>
	//   36   64:checkcast       #23  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//   37   67:getfield        #162 <Field int ConcatenatingMediaSource$MediaSourceHolder.firstPeriodIndexInChild>
	//   38   70:iload_1         
	//   39   71:icmpne          79
			j = l;
	//   40   74:iload_3         
	//   41   75:istore_2        
		} while(true);
	//   42   76:goto            31
		return j;
	//   43   79:iload_2         
	//   44   80:ireturn         
	}

	private void moveMediaSourceInternal(int i, int j)
	{
		int l = Math.min(i, j);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #237 <Method int Math.min(int, int)>
	//    3    5:istore          4
		int j1 = Math.max(i, j);
	//    4    7:iload_1         
	//    5    8:iload_2         
	//    6    9:invokestatic    #240 <Method int Math.max(int, int)>
	//    7   12:istore          6
		int k = ((MediaSourceHolder)mediaSourceHolders.get(l)).firstWindowIndexInChild;
	//    8   14:aload_0         
	//    9   15:getfield        #113 <Field List mediaSourceHolders>
	//   10   18:iload           4
	//   11   20:invokeinterface #149 <Method Object List.get(int)>
	//   12   25:checkcast       #23  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//   13   28:getfield        #152 <Field int ConcatenatingMediaSource$MediaSourceHolder.firstWindowIndexInChild>
	//   14   31:istore_3        
		int i1 = ((MediaSourceHolder)mediaSourceHolders.get(l)).firstPeriodIndexInChild;
	//   15   32:aload_0         
	//   16   33:getfield        #113 <Field List mediaSourceHolders>
	//   17   36:iload           4
	//   18   38:invokeinterface #149 <Method Object List.get(int)>
	//   19   43:checkcast       #23  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//   20   46:getfield        #162 <Field int ConcatenatingMediaSource$MediaSourceHolder.firstPeriodIndexInChild>
	//   21   49:istore          5
		mediaSourceHolders.add(j, mediaSourceHolders.remove(i));
	//   22   51:aload_0         
	//   23   52:getfield        #113 <Field List mediaSourceHolders>
	//   24   55:iload_2         
	//   25   56:aload_0         
	//   26   57:getfield        #113 <Field List mediaSourceHolders>
	//   27   60:iload_1         
	//   28   61:invokeinterface #243 <Method Object List.remove(int)>
	//   29   66:invokeinterface #177 <Method void List.add(int, Object)>
		i = i1;
	//   30   71:iload           5
	//   31   73:istore_1        
		for(j = l; j <= j1; j++)
	//*  32   74:iload           4
	//*  33   76:istore_2        
	//*  34   77:iload_2         
	//*  35   78:iload           6
	//*  36   80:icmpgt          139
		{
			MediaSourceHolder mediasourceholder = (MediaSourceHolder)mediaSourceHolders.get(j);
	//   37   83:aload_0         
	//   38   84:getfield        #113 <Field List mediaSourceHolders>
	//   39   87:iload_2         
	//   40   88:invokeinterface #149 <Method Object List.get(int)>
	//   41   93:checkcast       #23  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//   42   96:astore          7
			mediasourceholder.firstWindowIndexInChild = k;
	//   43   98:aload           7
	//   44  100:iload_3         
	//   45  101:putfield        #152 <Field int ConcatenatingMediaSource$MediaSourceHolder.firstWindowIndexInChild>
			mediasourceholder.firstPeriodIndexInChild = i;
	//   46  104:aload           7
	//   47  106:iload_1         
	//   48  107:putfield        #162 <Field int ConcatenatingMediaSource$MediaSourceHolder.firstPeriodIndexInChild>
			k += mediasourceholder.timeline.getWindowCount();
	//   49  110:iload_3         
	//   50  111:aload           7
	//   51  113:getfield        #156 <Field ConcatenatingMediaSource$DeferredTimeline ConcatenatingMediaSource$MediaSourceHolder.timeline>
	//   52  116:invokevirtual   #159 <Method int ConcatenatingMediaSource$DeferredTimeline.getWindowCount()>
	//   53  119:iadd            
	//   54  120:istore_3        
			i += mediasourceholder.timeline.getPeriodCount();
	//   55  121:iload_1         
	//   56  122:aload           7
	//   57  124:getfield        #156 <Field ConcatenatingMediaSource$DeferredTimeline ConcatenatingMediaSource$MediaSourceHolder.timeline>
	//   58  127:invokevirtual   #165 <Method int ConcatenatingMediaSource$DeferredTimeline.getPeriodCount()>
	//   59  130:iadd            
	//   60  131:istore_1        
		}

	//   61  132:iload_2         
	//   62  133:iconst_1        
	//   63  134:iadd            
	//   64  135:istore_2        
	//*  65  136:goto            77
	//   66  139:return          
	}

	private void notifyListener()
	{
		listenerNotificationScheduled = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #246 <Field boolean listenerNotificationScheduled>
		Object obj;
		if(pendingOnCompletionActions.isEmpty())
	//*   3    5:aload_0         
	//*   4    6:getfield        #115 <Field List pendingOnCompletionActions>
	//*   5    9:invokeinterface #249 <Method boolean List.isEmpty()>
	//*   6   14:ifeq            24
			obj = ((Object) (Collections.emptyList()));
	//    7   17:invokestatic    #253 <Method List Collections.emptyList()>
	//    8   20:astore_1        
		else
	//*   9   21:goto            36
			obj = ((Object) (new ArrayList(((Collection) (pendingOnCompletionActions)))));
	//   10   24:new             #108 <Class ArrayList>
	//   11   27:dup             
	//   12   28:aload_0         
	//   13   29:getfield        #115 <Field List pendingOnCompletionActions>
	//   14   32:invokespecial   #255 <Method void ArrayList(Collection)>
	//   15   35:astore_1        
		pendingOnCompletionActions.clear();
	//   16   36:aload_0         
	//   17   37:getfield        #115 <Field List pendingOnCompletionActions>
	//   18   40:invokeinterface #258 <Method void List.clear()>
		refreshSourceInfo(((Timeline) (new ConcatenatedTimeline(((Collection) (mediaSourceHolders)), windowCount, periodCount, shuffleOrder, isAtomic))), ((Object) (null)));
	//   19   45:aload_0         
	//   20   46:new             #11  <Class ConcatenatingMediaSource$ConcatenatedTimeline>
	//   21   49:dup             
	//   22   50:aload_0         
	//   23   51:getfield        #113 <Field List mediaSourceHolders>
	//   24   54:aload_0         
	//   25   55:getfield        #216 <Field int windowCount>
	//   26   58:aload_0         
	//   27   59:getfield        #218 <Field int periodCount>
	//   28   62:aload_0         
	//   29   63:getfield        #101 <Field ShuffleOrder shuffleOrder>
	//   30   66:aload_0         
	//   31   67:getfield        #122 <Field boolean isAtomic>
	//   32   70:invokespecial   #261 <Method void ConcatenatingMediaSource$ConcatenatedTimeline(Collection, int, int, ShuffleOrder, boolean)>
	//   33   73:aconst_null     
	//   34   74:invokevirtual   #265 <Method void refreshSourceInfo(Timeline, Object)>
		if(!((List) (obj)).isEmpty())
	//*  35   77:aload_1         
	//*  36   78:invokeinterface #249 <Method boolean List.isEmpty()>
	//*  37   83:ifne            109
			player.createMessage(((com.google.android.exoplayer2.PlayerMessage.Target) (this))).setType(6).setPayload(obj).send();
	//   38   86:aload_0         
	//   39   87:getfield        #267 <Field ExoPlayer player>
	//   40   90:aload_0         
	//   41   91:invokeinterface #273 <Method PlayerMessage ExoPlayer.createMessage(com.google.android.exoplayer2.PlayerMessage$Target)>
	//   42   96:bipush          6
	//   43   98:invokevirtual   #279 <Method PlayerMessage PlayerMessage.setType(int)>
	//   44  101:aload_1         
	//   45  102:invokevirtual   #283 <Method PlayerMessage PlayerMessage.setPayload(Object)>
	//   46  105:invokevirtual   #287 <Method PlayerMessage PlayerMessage.send()>
	//   47  108:pop             
	//   48  109:return          
	}

	private void removeMediaSourceInternal(int i)
	{
		MediaSourceHolder mediasourceholder = (MediaSourceHolder)mediaSourceHolders.remove(i);
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field List mediaSourceHolders>
	//    2    4:iload_1         
	//    3    5:invokeinterface #243 <Method Object List.remove(int)>
	//    4   10:checkcast       #23  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//    5   13:astore_2        
		DeferredTimeline deferredtimeline = mediasourceholder.timeline;
	//    6   14:aload_2         
	//    7   15:getfield        #156 <Field ConcatenatingMediaSource$DeferredTimeline ConcatenatingMediaSource$MediaSourceHolder.timeline>
	//    8   18:astore_3        
		correctOffsets(i, -1, -((Timeline) (deferredtimeline)).getWindowCount(), -((Timeline) (deferredtimeline)).getPeriodCount());
	//    9   19:aload_0         
	//   10   20:iload_1         
	//   11   21:iconst_m1       
	//   12   22:aload_3         
	//   13   23:invokevirtual   #290 <Method int Timeline.getWindowCount()>
	//   14   26:ineg            
	//   15   27:aload_3         
	//   16   28:invokevirtual   #291 <Method int Timeline.getPeriodCount()>
	//   17   31:ineg            
	//   18   32:invokespecial   #173 <Method void correctOffsets(int, int, int, int)>
		mediasourceholder.isRemoved = true;
	//   19   35:aload_2         
	//   20   36:iconst_1        
	//   21   37:putfield        #294 <Field boolean ConcatenatingMediaSource$MediaSourceHolder.isRemoved>
		if(mediasourceholder.activeMediaPeriods.isEmpty())
	//*  22   40:aload_2         
	//*  23   41:getfield        #297 <Field List ConcatenatingMediaSource$MediaSourceHolder.activeMediaPeriods>
	//*  24   44:invokeinterface #249 <Method boolean List.isEmpty()>
	//*  25   49:ifeq            57
			releaseChildSource(((Object) (mediasourceholder)));
	//   26   52:aload_0         
	//   27   53:aload_2         
	//   28   54:invokevirtual   #301 <Method void releaseChildSource(Object)>
	//   29   57:return          
	}

	private void scheduleListenerNotification(EventDispatcher eventdispatcher)
	{
		if(!listenerNotificationScheduled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #246 <Field boolean listenerNotificationScheduled>
	//*   2    4:ifne            30
		{
			player.createMessage(((com.google.android.exoplayer2.PlayerMessage.Target) (this))).setType(5).send();
	//    3    7:aload_0         
	//    4    8:getfield        #267 <Field ExoPlayer player>
	//    5   11:aload_0         
	//    6   12:invokeinterface #273 <Method PlayerMessage ExoPlayer.createMessage(com.google.android.exoplayer2.PlayerMessage$Target)>
	//    7   17:iconst_5        
	//    8   18:invokevirtual   #279 <Method PlayerMessage PlayerMessage.setType(int)>
	//    9   21:invokevirtual   #287 <Method PlayerMessage PlayerMessage.send()>
	//   10   24:pop             
			listenerNotificationScheduled = true;
	//   11   25:aload_0         
	//   12   26:iconst_1        
	//   13   27:putfield        #246 <Field boolean listenerNotificationScheduled>
		}
		if(eventdispatcher != null)
	//*  14   30:aload_1         
	//*  15   31:ifnull          45
			pendingOnCompletionActions.add(((Object) (eventdispatcher)));
	//   16   34:aload_0         
	//   17   35:getfield        #115 <Field List pendingOnCompletionActions>
	//   18   38:aload_1         
	//   19   39:invokeinterface #307 <Method boolean List.add(Object)>
	//   20   44:pop             
	//   21   45:return          
	}

	private void updateMediaSourceInternal(MediaSourceHolder mediasourceholder, Timeline timeline)
	{
		if(mediasourceholder == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
			throw new IllegalArgumentException();
	//    2    4:new             #312 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:invokespecial   #313 <Method void IllegalArgumentException()>
	//    5   11:athrow          
		DeferredTimeline deferredtimeline = mediasourceholder.timeline;
	//    6   12:aload_1         
	//    7   13:getfield        #156 <Field ConcatenatingMediaSource$DeferredTimeline ConcatenatingMediaSource$MediaSourceHolder.timeline>
	//    8   16:astore          10
		if(deferredtimeline.getTimeline() == timeline)
	//*   9   18:aload           10
	//*  10   20:invokevirtual   #317 <Method Timeline ConcatenatingMediaSource$DeferredTimeline.getTimeline()>
	//*  11   23:aload_2         
	//*  12   24:if_acmpne       28
			return;
	//   13   27:return          
		int j = timeline.getWindowCount() - deferredtimeline.getWindowCount();
	//   14   28:aload_2         
	//   15   29:invokevirtual   #290 <Method int Timeline.getWindowCount()>
	//   16   32:aload           10
	//   17   34:invokevirtual   #159 <Method int ConcatenatingMediaSource$DeferredTimeline.getWindowCount()>
	//   18   37:isub            
	//   19   38:istore          4
		int k = timeline.getPeriodCount() - deferredtimeline.getPeriodCount();
	//   20   40:aload_2         
	//   21   41:invokevirtual   #291 <Method int Timeline.getPeriodCount()>
	//   22   44:aload           10
	//   23   46:invokevirtual   #165 <Method int ConcatenatingMediaSource$DeferredTimeline.getPeriodCount()>
	//   24   49:isub            
	//   25   50:istore          5
		int i = 0;
	//   26   52:iconst_0        
	//   27   53:istore_3        
		if(j != 0 || k != 0)
	//*  28   54:iload           4
	//*  29   56:ifne            64
	//*  30   59:iload           5
	//*  31   61:ifeq            79
			correctOffsets(mediasourceholder.childIndex + 1, 0, j, k);
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:getfield        #221 <Field int ConcatenatingMediaSource$MediaSourceHolder.childIndex>
	//   35   69:iconst_1        
	//   36   70:iadd            
	//   37   71:iconst_0        
	//   38   72:iload           4
	//   39   74:iload           5
	//   40   76:invokespecial   #173 <Method void correctOffsets(int, int, int, int)>
		mediasourceholder.timeline = deferredtimeline.cloneWithNewTimeline(timeline);
	//   41   79:aload_1         
	//   42   80:aload           10
	//   43   82:aload_2         
	//   44   83:invokevirtual   #321 <Method ConcatenatingMediaSource$DeferredTimeline ConcatenatingMediaSource$DeferredTimeline.cloneWithNewTimeline(Timeline)>
	//   45   86:putfield        #156 <Field ConcatenatingMediaSource$DeferredTimeline ConcatenatingMediaSource$MediaSourceHolder.timeline>
		if(!mediasourceholder.isPrepared && !timeline.isEmpty())
	//*  46   89:aload_1         
	//*  47   90:getfield        #324 <Field boolean ConcatenatingMediaSource$MediaSourceHolder.isPrepared>
	//*  48   93:ifne            183
	//*  49   96:aload_2         
	//*  50   97:invokevirtual   #325 <Method boolean Timeline.isEmpty()>
	//*  51  100:ifne            183
		{
			timeline.getWindow(0, window);
	//   52  103:aload_2         
	//   53  104:iconst_0        
	//   54  105:aload_0         
	//   55  106:getfield        #127 <Field com.google.android.exoplayer2.Timeline$Window window>
	//   56  109:invokevirtual   #329 <Method com.google.android.exoplayer2.Timeline$Window Timeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window)>
	//   57  112:pop             
			long l = window.getPositionInFirstPeriodUs();
	//   58  113:aload_0         
	//   59  114:getfield        #127 <Field com.google.android.exoplayer2.Timeline$Window window>
	//   60  117:invokevirtual   #333 <Method long com.google.android.exoplayer2.Timeline$Window.getPositionInFirstPeriodUs()>
	//   61  120:lstore          6
			long l1 = window.getDefaultPositionUs();
	//   62  122:aload_0         
	//   63  123:getfield        #127 <Field com.google.android.exoplayer2.Timeline$Window window>
	//   64  126:invokevirtual   #336 <Method long com.google.android.exoplayer2.Timeline$Window.getDefaultPositionUs()>
	//   65  129:lstore          8
			for(; i < mediasourceholder.activeMediaPeriods.size(); i++)
	//*  66  131:iload_3         
	//*  67  132:aload_1         
	//*  68  133:getfield        #297 <Field List ConcatenatingMediaSource$MediaSourceHolder.activeMediaPeriods>
	//*  69  136:invokeinterface #211 <Method int List.size()>
	//*  70  141:icmpge          178
			{
				timeline = ((Timeline) ((DeferredMediaPeriod)mediasourceholder.activeMediaPeriods.get(i)));
	//   71  144:aload_1         
	//   72  145:getfield        #297 <Field List ConcatenatingMediaSource$MediaSourceHolder.activeMediaPeriods>
	//   73  148:iload_3         
	//   74  149:invokeinterface #149 <Method Object List.get(int)>
	//   75  154:checkcast       #338 <Class DeferredMediaPeriod>
	//   76  157:astore_2        
				((DeferredMediaPeriod) (timeline)).setDefaultPreparePositionUs(l + l1);
	//   77  158:aload_2         
	//   78  159:lload           6
	//   79  161:lload           8
	//   80  163:ladd            
	//   81  164:invokevirtual   #342 <Method void DeferredMediaPeriod.setDefaultPreparePositionUs(long)>
				((DeferredMediaPeriod) (timeline)).createPeriod();
	//   82  167:aload_2         
	//   83  168:invokevirtual   #345 <Method void DeferredMediaPeriod.createPeriod()>
			}

	//   84  171:iload_3         
	//   85  172:iconst_1        
	//   86  173:iadd            
	//   87  174:istore_3        
	//*  88  175:goto            131
			mediasourceholder.isPrepared = true;
	//   89  178:aload_1         
	//   90  179:iconst_1        
	//   91  180:putfield        #324 <Field boolean ConcatenatingMediaSource$MediaSourceHolder.isPrepared>
		}
		scheduleListenerNotification(((EventDispatcher) (null)));
	//   92  183:aload_0         
	//   93  184:aconst_null     
	//   94  185:invokespecial   #347 <Method void scheduleListenerNotification(ConcatenatingMediaSource$EventDispatcher)>
	//   95  188:return          
	}

	public final void addMediaSource(int i, MediaSource mediasource)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		addMediaSource(i, mediasource, ((Runnable) (null)));
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:aload_2         
	//    5    5:aconst_null     
	//    6    6:invokevirtual   #352 <Method void addMediaSource(int, MediaSource, Runnable)>
		this;
	//    7    9:aload_0         
		JVM INSTR monitorexit ;
	//    8   10:monitorexit     
		return;
	//    9   11:return          
		mediasource;
	//   10   12:astore_2        
	//*  11   13:aload_0         
		throw mediasource;
	//   12   14:monitorexit     
	//   13   15:aload_2         
	//   14   16:athrow          
	}

	public final void addMediaSource(int i, MediaSource mediasource, Runnable runnable)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Assertions.checkNotNull(((Object) (mediasource)));
	//    2    2:aload_2         
	//    3    3:invokestatic    #89  <Method Object Assertions.checkNotNull(Object)>
	//    4    6:pop             
		mediasource = ((MediaSource) (new MediaSourceHolder(mediasource)));
	//    5    7:new             #23  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//    6   10:dup             
	//    7   11:aload_2         
	//    8   12:invokespecial   #118 <Method void ConcatenatingMediaSource$MediaSourceHolder(MediaSource)>
	//    9   15:astore_2        
		mediaSourcesPublic.add(i, ((Object) (mediasource)));
	//   10   16:aload_0         
	//   11   17:getfield        #111 <Field List mediaSourcesPublic>
	//   12   20:iload_1         
	//   13   21:aload_2         
	//   14   22:invokeinterface #177 <Method void List.add(int, Object)>
		if(player != null)
	//*  15   27:aload_0         
	//*  16   28:getfield        #267 <Field ExoPlayer player>
	//*  17   31:ifnull          68
		{
			player.createMessage(((com.google.android.exoplayer2.PlayerMessage.Target) (this))).setType(0).setPayload(((Object) (new MessageData(i, ((Object) (mediasource)), runnable)))).send();
	//   18   34:aload_0         
	//   19   35:getfield        #267 <Field ExoPlayer player>
	//   20   38:aload_0         
	//   21   39:invokeinterface #273 <Method PlayerMessage ExoPlayer.createMessage(com.google.android.exoplayer2.PlayerMessage$Target)>
	//   22   44:iconst_0        
	//   23   45:invokevirtual   #279 <Method PlayerMessage PlayerMessage.setType(int)>
	//   24   48:new             #26  <Class ConcatenatingMediaSource$MessageData>
	//   25   51:dup             
	//   26   52:iload_1         
	//   27   53:aload_2         
	//   28   54:aload_3         
	//   29   55:invokespecial   #355 <Method void ConcatenatingMediaSource$MessageData(int, Object, Runnable)>
	//   30   58:invokevirtual   #283 <Method PlayerMessage PlayerMessage.setPayload(Object)>
	//   31   61:invokevirtual   #287 <Method PlayerMessage PlayerMessage.send()>
	//   32   64:pop             
			break MISSING_BLOCK_LABEL_78;
	//   33   65:goto            78
		}
		if(runnable == null)
			break MISSING_BLOCK_LABEL_78;
	//   34   68:aload_3         
	//   35   69:ifnull          78
		runnable.run();
	//   36   72:aload_3         
	//   37   73:invokeinterface #360 <Method void Runnable.run()>
		this;
	//   38   78:aload_0         
		JVM INSTR monitorexit ;
	//   39   79:monitorexit     
		return;
	//   40   80:return          
		mediasource;
	//   41   81:astore_2        
	//*  42   82:aload_0         
		throw mediasource;
	//   43   83:monitorexit     
	//   44   84:aload_2         
	//   45   85:athrow          
	}

	public final void addMediaSource(MediaSource mediasource)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		addMediaSource(mediaSourcesPublic.size(), mediasource, ((Runnable) (null)));
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #111 <Field List mediaSourcesPublic>
	//    5    7:invokeinterface #211 <Method int List.size()>
	//    6   12:aload_1         
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #352 <Method void addMediaSource(int, MediaSource, Runnable)>
		this;
	//    9   17:aload_0         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return;
	//   11   19:return          
		mediasource;
	//   12   20:astore_1        
	//*  13   21:aload_0         
		throw mediasource;
	//   14   22:monitorexit     
	//   15   23:aload_1         
	//   16   24:athrow          
	}

	public final void addMediaSource(MediaSource mediasource, Runnable runnable)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		addMediaSource(mediaSourcesPublic.size(), mediasource, runnable);
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #111 <Field List mediaSourcesPublic>
	//    5    7:invokeinterface #211 <Method int List.size()>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #352 <Method void addMediaSource(int, MediaSource, Runnable)>
		this;
	//    9   17:aload_0         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return;
	//   11   19:return          
		mediasource;
	//   12   20:astore_1        
	//*  13   21:aload_0         
		throw mediasource;
	//   14   22:monitorexit     
	//   15   23:aload_1         
	//   16   24:athrow          
	}

	public final void addMediaSources(int i, Collection collection)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		addMediaSources(i, collection, ((Runnable) (null)));
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:aload_2         
	//    5    5:aconst_null     
	//    6    6:invokevirtual   #364 <Method void addMediaSources(int, Collection, Runnable)>
		this;
	//    7    9:aload_0         
		JVM INSTR monitorexit ;
	//    8   10:monitorexit     
		return;
	//    9   11:return          
		collection;
	//   10   12:astore_2        
	//*  11   13:aload_0         
		throw collection;
	//   12   14:monitorexit     
	//   13   15:aload_2         
	//   14   16:athrow          
	}

	public final void addMediaSources(int i, Collection collection, Runnable runnable)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		for(Iterator iterator = collection.iterator(); iterator.hasNext(); Assertions.checkNotNull(((Object) ((MediaSource)iterator.next()))));
	//    2    2:aload_2         
	//    3    3:invokeinterface #193 <Method Iterator Collection.iterator()>
	//    4    8:astore          4
	//    5   10:aload           4
	//    6   12:invokeinterface #199 <Method boolean Iterator.hasNext()>
	//    7   17:ifeq            37
	//    8   20:aload           4
	//    9   22:invokeinterface #203 <Method Object Iterator.next()>
	//   10   27:checkcast       #78  <Class MediaSource>
	//   11   30:invokestatic    #89  <Method Object Assertions.checkNotNull(Object)>
	//   12   33:pop             
	//*  13   34:goto            10
		ArrayList arraylist;
		arraylist = new ArrayList(collection.size());
	//   14   37:new             #108 <Class ArrayList>
	//   15   40:dup             
	//   16   41:aload_2         
	//   17   42:invokeinterface #366 <Method int Collection.size()>
	//   18   47:invokespecial   #367 <Method void ArrayList(int)>
	//   19   50:astore          4
		for(Iterator iterator1 = collection.iterator(); iterator1.hasNext(); ((List) (arraylist)).add(((Object) (new MediaSourceHolder((MediaSource)iterator1.next())))));
	//   20   52:aload_2         
	//   21   53:invokeinterface #193 <Method Iterator Collection.iterator()>
	//   22   58:astore          5
	//   23   60:aload           5
	//   24   62:invokeinterface #199 <Method boolean Iterator.hasNext()>
	//   25   67:ifeq            98
	//   26   70:aload           4
	//   27   72:new             #23  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//   28   75:dup             
	//   29   76:aload           5
	//   30   78:invokeinterface #203 <Method Object Iterator.next()>
	//   31   83:checkcast       #78  <Class MediaSource>
	//   32   86:invokespecial   #118 <Method void ConcatenatingMediaSource$MediaSourceHolder(MediaSource)>
	//   33   89:invokeinterface #307 <Method boolean List.add(Object)>
	//   34   94:pop             
	//*  35   95:goto            60
		mediaSourcesPublic.addAll(i, ((Collection) (arraylist)));
	//   36   98:aload_0         
	//   37   99:getfield        #111 <Field List mediaSourcesPublic>
	//   38  102:iload_1         
	//   39  103:aload           4
	//   40  105:invokeinterface #371 <Method boolean List.addAll(int, Collection)>
	//   41  110:pop             
		if(player != null && !collection.isEmpty())
	//*  42  111:aload_0         
	//*  43  112:getfield        #267 <Field ExoPlayer player>
	//*  44  115:ifnull          162
	//*  45  118:aload_2         
	//*  46  119:invokeinterface #372 <Method boolean Collection.isEmpty()>
	//*  47  124:ifne            162
		{
			player.createMessage(((com.google.android.exoplayer2.PlayerMessage.Target) (this))).setType(1).setPayload(((Object) (new MessageData(i, ((Object) (arraylist)), runnable)))).send();
	//   48  127:aload_0         
	//   49  128:getfield        #267 <Field ExoPlayer player>
	//   50  131:aload_0         
	//   51  132:invokeinterface #273 <Method PlayerMessage ExoPlayer.createMessage(com.google.android.exoplayer2.PlayerMessage$Target)>
	//   52  137:iconst_1        
	//   53  138:invokevirtual   #279 <Method PlayerMessage PlayerMessage.setType(int)>
	//   54  141:new             #26  <Class ConcatenatingMediaSource$MessageData>
	//   55  144:dup             
	//   56  145:iload_1         
	//   57  146:aload           4
	//   58  148:aload_3         
	//   59  149:invokespecial   #355 <Method void ConcatenatingMediaSource$MessageData(int, Object, Runnable)>
	//   60  152:invokevirtual   #283 <Method PlayerMessage PlayerMessage.setPayload(Object)>
	//   61  155:invokevirtual   #287 <Method PlayerMessage PlayerMessage.send()>
	//   62  158:pop             
			break MISSING_BLOCK_LABEL_172;
	//   63  159:goto            172
		}
		if(runnable == null)
			break MISSING_BLOCK_LABEL_172;
	//   64  162:aload_3         
	//   65  163:ifnull          172
		runnable.run();
	//   66  166:aload_3         
	//   67  167:invokeinterface #360 <Method void Runnable.run()>
		this;
	//   68  172:aload_0         
		JVM INSTR monitorexit ;
	//   69  173:monitorexit     
		return;
	//   70  174:return          
		collection;
	//   71  175:astore_2        
	//*  72  176:aload_0         
		throw collection;
	//   73  177:monitorexit     
	//   74  178:aload_2         
	//   75  179:athrow          
	}

	public final void addMediaSources(Collection collection)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		addMediaSources(mediaSourcesPublic.size(), collection, ((Runnable) (null)));
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #111 <Field List mediaSourcesPublic>
	//    5    7:invokeinterface #211 <Method int List.size()>
	//    6   12:aload_1         
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #364 <Method void addMediaSources(int, Collection, Runnable)>
		this;
	//    9   17:aload_0         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return;
	//   11   19:return          
		collection;
	//   12   20:astore_1        
	//*  13   21:aload_0         
		throw collection;
	//   14   22:monitorexit     
	//   15   23:aload_1         
	//   16   24:athrow          
	}

	public final void addMediaSources(Collection collection, Runnable runnable)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		addMediaSources(mediaSourcesPublic.size(), collection, runnable);
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #111 <Field List mediaSourcesPublic>
	//    5    7:invokeinterface #211 <Method int List.size()>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #364 <Method void addMediaSources(int, Collection, Runnable)>
		this;
	//    9   17:aload_0         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return;
	//   11   19:return          
		collection;
	//   12   20:astore_1        
	//*  13   21:aload_0         
		throw collection;
	//   14   22:monitorexit     
	//   15   23:aload_1         
	//   16   24:athrow          
	}

	public final void clear()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		clear(((Runnable) (null)));
	//    2    2:aload_0         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #379 <Method void clear(Runnable)>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		Exception exception;
		exception;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw exception;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public final void clear(Runnable runnable)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mediaSourcesPublic.clear();
	//    2    2:aload_0         
	//    3    3:getfield        #111 <Field List mediaSourcesPublic>
	//    4    6:invokeinterface #258 <Method void List.clear()>
		if(player == null) goto _L2; else goto _L1
	//    5   11:aload_0         
	//    6   12:getfield        #267 <Field ExoPlayer player>
	//    7   15:ifnull          61
_L1:
		PlayerMessage playermessage = player.createMessage(((com.google.android.exoplayer2.PlayerMessage.Target) (this))).setType(4);
	//    8   18:aload_0         
	//    9   19:getfield        #267 <Field ExoPlayer player>
	//   10   22:aload_0         
	//   11   23:invokeinterface #273 <Method PlayerMessage ExoPlayer.createMessage(com.google.android.exoplayer2.PlayerMessage$Target)>
	//   12   28:iconst_4        
	//   13   29:invokevirtual   #279 <Method PlayerMessage PlayerMessage.setType(int)>
	//   14   32:astore_2        
		if(runnable == null) goto _L4; else goto _L3
	//   15   33:aload_1         
	//   16   34:ifnull          79
_L3:
		runnable = ((Runnable) (new EventDispatcher(runnable)));
	//   17   37:new             #20  <Class ConcatenatingMediaSource$EventDispatcher>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #381 <Method void ConcatenatingMediaSource$EventDispatcher(Runnable)>
	//   21   45:astore_1        
	//*  22   46:goto            49
_L8:
		playermessage.setPayload(((Object) (runnable))).send();
	//   23   49:aload_2         
	//   24   50:aload_1         
	//   25   51:invokevirtual   #283 <Method PlayerMessage PlayerMessage.setPayload(Object)>
	//   26   54:invokevirtual   #287 <Method PlayerMessage PlayerMessage.send()>
	//   27   57:pop             
		  goto _L5
	//*  28   58:goto            71
_L2:
		if(runnable == null) goto _L5; else goto _L6
	//   29   61:aload_1         
	//   30   62:ifnull          71
_L6:
		runnable.run();
	//   31   65:aload_1         
	//   32   66:invokeinterface #360 <Method void Runnable.run()>
_L5:
		this;
	//   33   71:aload_0         
		JVM INSTR monitorexit ;
	//   34   72:monitorexit     
		return;
	//   35   73:return          
		runnable;
	//   36   74:astore_1        
	//*  37   75:aload_0         
		throw runnable;
	//   38   76:monitorexit     
	//   39   77:aload_1         
	//   40   78:athrow          
_L4:
		runnable = null;
	//   41   79:aconst_null     
	//   42   80:astore_1        
		if(true) goto _L8; else goto _L7
	//   43   81:goto            49
_L7:
	}

	public final MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaperiodid, Allocator allocator)
	{
		int i = findMediaSourceHolderByPeriodIndex(mediaperiodid.periodIndex);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #387 <Field int MediaSource$MediaPeriodId.periodIndex>
	//    3    5:invokespecial   #389 <Method int findMediaSourceHolderByPeriodIndex(int)>
	//    4    8:istore_3        
		MediaSourceHolder mediasourceholder = (MediaSourceHolder)mediaSourceHolders.get(i);
	//    5    9:aload_0         
	//    6   10:getfield        #113 <Field List mediaSourceHolders>
	//    7   13:iload_3         
	//    8   14:invokeinterface #149 <Method Object List.get(int)>
	//    9   19:checkcast       #23  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//   10   22:astore          4
		mediaperiodid = mediaperiodid.copyWithPeriodIndex(mediaperiodid.periodIndex - mediasourceholder.firstPeriodIndexInChild);
	//   11   24:aload_1         
	//   12   25:aload_1         
	//   13   26:getfield        #387 <Field int MediaSource$MediaPeriodId.periodIndex>
	//   14   29:aload           4
	//   15   31:getfield        #162 <Field int ConcatenatingMediaSource$MediaSourceHolder.firstPeriodIndexInChild>
	//   16   34:isub            
	//   17   35:invokevirtual   #393 <Method MediaSource$MediaPeriodId MediaSource$MediaPeriodId.copyWithPeriodIndex(int)>
	//   18   38:astore_1        
		mediaperiodid = ((MediaSource.MediaPeriodId) (new DeferredMediaPeriod(mediasourceholder.mediaSource, mediaperiodid, allocator)));
	//   19   39:new             #338 <Class DeferredMediaPeriod>
	//   20   42:dup             
	//   21   43:aload           4
	//   22   45:getfield        #181 <Field MediaSource ConcatenatingMediaSource$MediaSourceHolder.mediaSource>
	//   23   48:aload_1         
	//   24   49:aload_2         
	//   25   50:invokespecial   #396 <Method void DeferredMediaPeriod(MediaSource, MediaSource$MediaPeriodId, Allocator)>
	//   26   53:astore_1        
		mediaSourceByMediaPeriod.put(((Object) (mediaperiodid)), ((Object) (mediasourceholder)));
	//   27   54:aload_0         
	//   28   55:getfield        #106 <Field Map mediaSourceByMediaPeriod>
	//   29   58:aload_1         
	//   30   59:aload           4
	//   31   61:invokeinterface #402 <Method Object Map.put(Object, Object)>
	//   32   66:pop             
		mediasourceholder.activeMediaPeriods.add(((Object) (mediaperiodid)));
	//   33   67:aload           4
	//   34   69:getfield        #297 <Field List ConcatenatingMediaSource$MediaSourceHolder.activeMediaPeriods>
	//   35   72:aload_1         
	//   36   73:invokeinterface #307 <Method boolean List.add(Object)>
	//   37   78:pop             
		if(mediasourceholder.isPrepared)
	//*  38   79:aload           4
	//*  39   81:getfield        #324 <Field boolean ConcatenatingMediaSource$MediaSourceHolder.isPrepared>
	//*  40   84:ifeq            91
			((DeferredMediaPeriod) (mediaperiodid)).createPeriod();
	//   41   87:aload_1         
	//   42   88:invokevirtual   #345 <Method void DeferredMediaPeriod.createPeriod()>
		return ((MediaPeriod) (mediaperiodid));
	//   43   91:aload_1         
	//   44   92:areturn         
	}

	protected MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSourceHolder mediasourceholder, MediaSource.MediaPeriodId mediaperiodid)
	{
		for(int i = 0; i < mediasourceholder.activeMediaPeriods.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_1         
	//*   4    4:getfield        #297 <Field List ConcatenatingMediaSource$MediaSourceHolder.activeMediaPeriods>
	//*   5    7:invokeinterface #211 <Method int List.size()>
	//*   6   12:icmpge          63
			if(((DeferredMediaPeriod)mediasourceholder.activeMediaPeriods.get(i)).id.windowSequenceNumber == mediaperiodid.windowSequenceNumber)
	//*   7   15:aload_1         
	//*   8   16:getfield        #297 <Field List ConcatenatingMediaSource$MediaSourceHolder.activeMediaPeriods>
	//*   9   19:iload_3         
	//*  10   20:invokeinterface #149 <Method Object List.get(int)>
	//*  11   25:checkcast       #338 <Class DeferredMediaPeriod>
	//*  12   28:getfield        #408 <Field MediaSource$MediaPeriodId DeferredMediaPeriod.id>
	//*  13   31:getfield        #412 <Field long MediaSource$MediaPeriodId.windowSequenceNumber>
	//*  14   34:aload_2         
	//*  15   35:getfield        #412 <Field long MediaSource$MediaPeriodId.windowSequenceNumber>
	//*  16   38:lcmp            
	//*  17   39:ifne            56
				return mediaperiodid.copyWithPeriodIndex(mediaperiodid.periodIndex + mediasourceholder.firstPeriodIndexInChild);
	//   18   42:aload_2         
	//   19   43:aload_2         
	//   20   44:getfield        #387 <Field int MediaSource$MediaPeriodId.periodIndex>
	//   21   47:aload_1         
	//   22   48:getfield        #162 <Field int ConcatenatingMediaSource$MediaSourceHolder.firstPeriodIndexInChild>
	//   23   51:iadd            
	//   24   52:invokevirtual   #393 <Method MediaSource$MediaPeriodId MediaSource$MediaPeriodId.copyWithPeriodIndex(int)>
	//   25   55:areturn         

	//   26   56:iload_3         
	//   27   57:iconst_1        
	//   28   58:iadd            
	//   29   59:istore_3        
	//*  30   60:goto            2
		return null;
	//   31   63:aconst_null     
	//   32   64:areturn         
	}

	protected volatile MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Object obj, MediaSource.MediaPeriodId mediaperiodid)
	{
		return getMediaPeriodIdForChildMediaPeriodId((MediaSourceHolder)obj, mediaperiodid);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #416 <Method MediaSource$MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(ConcatenatingMediaSource$MediaSourceHolder, MediaSource$MediaPeriodId)>
	//    5    9:areturn         
	}

	public final MediaSource getMediaSource(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		MediaSource mediasource = ((MediaSourceHolder)mediaSourcesPublic.get(i)).mediaSource;
	//    2    2:aload_0         
	//    3    3:getfield        #111 <Field List mediaSourcesPublic>
	//    4    6:iload_1         
	//    5    7:invokeinterface #149 <Method Object List.get(int)>
	//    6   12:checkcast       #23  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//    7   15:getfield        #181 <Field MediaSource ConcatenatingMediaSource$MediaSourceHolder.mediaSource>
	//    8   18:astore_2        
		this;
	//    9   19:aload_0         
		JVM INSTR monitorexit ;
	//   10   20:monitorexit     
		return mediasource;
	//   11   21:aload_2         
	//   12   22:areturn         
		Exception exception;
		exception;
	//   13   23:astore_2        
	//*  14   24:aload_0         
		throw exception;
	//   15   25:monitorexit     
	//   16   26:aload_2         
	//   17   27:athrow          
	}

	public final int getSize()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = mediaSourcesPublic.size();
	//    2    2:aload_0         
	//    3    3:getfield        #111 <Field List mediaSourcesPublic>
	//    4    6:invokeinterface #211 <Method int List.size()>
	//    5   11:istore_1        
		this;
	//    6   12:aload_0         
		JVM INSTR monitorexit ;
	//    7   13:monitorexit     
		return i;
	//    8   14:iload_1         
	//    9   15:ireturn         
		Exception exception;
		exception;
	//   10   16:astore_2        
	//*  11   17:aload_0         
		throw exception;
	//   12   18:monitorexit     
	//   13   19:aload_2         
	//   14   20:athrow          
	}

	protected int getWindowIndexForChildWindowIndex(MediaSourceHolder mediasourceholder, int i)
	{
		return i + mediasourceholder.firstWindowIndexInChild;
	//    0    0:iload_2         
	//    1    1:aload_1         
	//    2    2:getfield        #152 <Field int ConcatenatingMediaSource$MediaSourceHolder.firstWindowIndexInChild>
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	protected volatile int getWindowIndexForChildWindowIndex(Object obj, int i)
	{
		return getWindowIndexForChildWindowIndex((MediaSourceHolder)obj, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #424 <Method int getWindowIndexForChildWindowIndex(ConcatenatingMediaSource$MediaSourceHolder, int)>
	//    5    9:ireturn         
	}

	public final void handleMessage(int i, Object obj)
		throws ExoPlaybackException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 6: default 44
	//	               0 277
	//	               1 219
	//	               2 180
	//	               3 107
	//	               4 94
	//	               5 89
	//	               6 52
		default:
			throw new IllegalStateException();
	//    2   44:new             #429 <Class IllegalStateException>
	//    3   47:dup             
	//    4   48:invokespecial   #430 <Method void IllegalStateException()>
	//    5   51:athrow          

		case 6: // '\006'
			obj = ((Object) ((List)obj));
	//    6   52:aload_2         
	//    7   53:checkcast       #145 <Class List>
	//    8   56:astore_2        
			for(i = 0; i < ((List) (obj)).size(); i++)
	//*   9   57:iconst_0        
	//*  10   58:istore_1        
	//*  11   59:iload_1         
	//*  12   60:aload_2         
	//*  13   61:invokeinterface #211 <Method int List.size()>
	//*  14   66:icmpge          323
				((EventDispatcher)((List) (obj)).get(i)).dispatchEvent();
	//   15   69:aload_2         
	//   16   70:iload_1         
	//   17   71:invokeinterface #149 <Method Object List.get(int)>
	//   18   76:checkcast       #20  <Class ConcatenatingMediaSource$EventDispatcher>
	//   19   79:invokevirtual   #433 <Method void ConcatenatingMediaSource$EventDispatcher.dispatchEvent()>

	//   20   82:iload_1         
	//   21   83:iconst_1        
	//   22   84:iadd            
	//   23   85:istore_1        
			break;

	//*  24   86:goto            59
		case 5: // '\005'
			notifyListener();
	//   25   89:aload_0         
	//   26   90:invokespecial   #435 <Method void notifyListener()>
			return;
	//   27   93:return          

		case 4: // '\004'
			clearInternal();
	//   28   94:aload_0         
	//   29   95:invokespecial   #437 <Method void clearInternal()>
			scheduleListenerNotification((EventDispatcher)obj);
	//   30   98:aload_0         
	//   31   99:aload_2         
	//   32  100:checkcast       #20  <Class ConcatenatingMediaSource$EventDispatcher>
	//   33  103:invokespecial   #347 <Method void scheduleListenerNotification(ConcatenatingMediaSource$EventDispatcher)>
			return;
	//   34  106:return          

		case 3: // '\003'
			obj = ((Object) ((MessageData)obj));
	//   35  107:aload_2         
	//   36  108:checkcast       #26  <Class ConcatenatingMediaSource$MessageData>
	//   37  111:astore_2        
			shuffleOrder = shuffleOrder.cloneAndRemove(((MessageData) (obj)).index);
	//   38  112:aload_0         
	//   39  113:aload_0         
	//   40  114:getfield        #101 <Field ShuffleOrder shuffleOrder>
	//   41  117:aload_2         
	//   42  118:getfield        #440 <Field int ConcatenatingMediaSource$MessageData.index>
	//   43  121:invokeinterface #444 <Method ShuffleOrder ShuffleOrder.cloneAndRemove(int)>
	//   44  126:putfield        #101 <Field ShuffleOrder shuffleOrder>
			shuffleOrder = shuffleOrder.cloneAndInsert(((Integer)((MessageData) (obj)).customData).intValue(), 1);
	//   45  129:aload_0         
	//   46  130:aload_0         
	//   47  131:getfield        #101 <Field ShuffleOrder shuffleOrder>
	//   48  134:aload_2         
	//   49  135:getfield        #448 <Field Object ConcatenatingMediaSource$MessageData.customData>
	//   50  138:checkcast       #450 <Class Integer>
	//   51  141:invokevirtual   #453 <Method int Integer.intValue()>
	//   52  144:iconst_1        
	//   53  145:invokeinterface #457 <Method ShuffleOrder ShuffleOrder.cloneAndInsert(int, int)>
	//   54  150:putfield        #101 <Field ShuffleOrder shuffleOrder>
			moveMediaSourceInternal(((MessageData) (obj)).index, ((Integer)((MessageData) (obj)).customData).intValue());
	//   55  153:aload_0         
	//   56  154:aload_2         
	//   57  155:getfield        #440 <Field int ConcatenatingMediaSource$MessageData.index>
	//   58  158:aload_2         
	//   59  159:getfield        #448 <Field Object ConcatenatingMediaSource$MessageData.customData>
	//   60  162:checkcast       #450 <Class Integer>
	//   61  165:invokevirtual   #453 <Method int Integer.intValue()>
	//   62  168:invokespecial   #459 <Method void moveMediaSourceInternal(int, int)>
			scheduleListenerNotification(((MessageData) (obj)).actionOnCompletion);
	//   63  171:aload_0         
	//   64  172:aload_2         
	//   65  173:getfield        #463 <Field ConcatenatingMediaSource$EventDispatcher ConcatenatingMediaSource$MessageData.actionOnCompletion>
	//   66  176:invokespecial   #347 <Method void scheduleListenerNotification(ConcatenatingMediaSource$EventDispatcher)>
			return;
	//   67  179:return          

		case 2: // '\002'
			obj = ((Object) ((MessageData)obj));
	//   68  180:aload_2         
	//   69  181:checkcast       #26  <Class ConcatenatingMediaSource$MessageData>
	//   70  184:astore_2        
			shuffleOrder = shuffleOrder.cloneAndRemove(((MessageData) (obj)).index);
	//   71  185:aload_0         
	//   72  186:aload_0         
	//   73  187:getfield        #101 <Field ShuffleOrder shuffleOrder>
	//   74  190:aload_2         
	//   75  191:getfield        #440 <Field int ConcatenatingMediaSource$MessageData.index>
	//   76  194:invokeinterface #444 <Method ShuffleOrder ShuffleOrder.cloneAndRemove(int)>
	//   77  199:putfield        #101 <Field ShuffleOrder shuffleOrder>
			removeMediaSourceInternal(((MessageData) (obj)).index);
	//   78  202:aload_0         
	//   79  203:aload_2         
	//   80  204:getfield        #440 <Field int ConcatenatingMediaSource$MessageData.index>
	//   81  207:invokespecial   #214 <Method void removeMediaSourceInternal(int)>
			scheduleListenerNotification(((MessageData) (obj)).actionOnCompletion);
	//   82  210:aload_0         
	//   83  211:aload_2         
	//   84  212:getfield        #463 <Field ConcatenatingMediaSource$EventDispatcher ConcatenatingMediaSource$MessageData.actionOnCompletion>
	//   85  215:invokespecial   #347 <Method void scheduleListenerNotification(ConcatenatingMediaSource$EventDispatcher)>
			return;
	//   86  218:return          

		case 1: // '\001'
			obj = ((Object) ((MessageData)obj));
	//   87  219:aload_2         
	//   88  220:checkcast       #26  <Class ConcatenatingMediaSource$MessageData>
	//   89  223:astore_2        
			shuffleOrder = shuffleOrder.cloneAndInsert(((MessageData) (obj)).index, ((Collection)((MessageData) (obj)).customData).size());
	//   90  224:aload_0         
	//   91  225:aload_0         
	//   92  226:getfield        #101 <Field ShuffleOrder shuffleOrder>
	//   93  229:aload_2         
	//   94  230:getfield        #440 <Field int ConcatenatingMediaSource$MessageData.index>
	//   95  233:aload_2         
	//   96  234:getfield        #448 <Field Object ConcatenatingMediaSource$MessageData.customData>
	//   97  237:checkcast       #189 <Class Collection>
	//   98  240:invokeinterface #366 <Method int Collection.size()>
	//   99  245:invokeinterface #457 <Method ShuffleOrder ShuffleOrder.cloneAndInsert(int, int)>
	//  100  250:putfield        #101 <Field ShuffleOrder shuffleOrder>
			addMediaSourcesInternal(((MessageData) (obj)).index, (Collection)((MessageData) (obj)).customData);
	//  101  253:aload_0         
	//  102  254:aload_2         
	//  103  255:getfield        #440 <Field int ConcatenatingMediaSource$MessageData.index>
	//  104  258:aload_2         
	//  105  259:getfield        #448 <Field Object ConcatenatingMediaSource$MessageData.customData>
	//  106  262:checkcast       #189 <Class Collection>
	//  107  265:invokespecial   #465 <Method void addMediaSourcesInternal(int, Collection)>
			scheduleListenerNotification(((MessageData) (obj)).actionOnCompletion);
	//  108  268:aload_0         
	//  109  269:aload_2         
	//  110  270:getfield        #463 <Field ConcatenatingMediaSource$EventDispatcher ConcatenatingMediaSource$MessageData.actionOnCompletion>
	//  111  273:invokespecial   #347 <Method void scheduleListenerNotification(ConcatenatingMediaSource$EventDispatcher)>
			return;
	//  112  276:return          

		case 0: // '\0'
			obj = ((Object) ((MessageData)obj));
	//  113  277:aload_2         
	//  114  278:checkcast       #26  <Class ConcatenatingMediaSource$MessageData>
	//  115  281:astore_2        
			shuffleOrder = shuffleOrder.cloneAndInsert(((MessageData) (obj)).index, 1);
	//  116  282:aload_0         
	//  117  283:aload_0         
	//  118  284:getfield        #101 <Field ShuffleOrder shuffleOrder>
	//  119  287:aload_2         
	//  120  288:getfield        #440 <Field int ConcatenatingMediaSource$MessageData.index>
	//  121  291:iconst_1        
	//  122  292:invokeinterface #457 <Method ShuffleOrder ShuffleOrder.cloneAndInsert(int, int)>
	//  123  297:putfield        #101 <Field ShuffleOrder shuffleOrder>
			addMediaSourceInternal(((MessageData) (obj)).index, (MediaSourceHolder)((MessageData) (obj)).customData);
	//  124  300:aload_0         
	//  125  301:aload_2         
	//  126  302:getfield        #440 <Field int ConcatenatingMediaSource$MessageData.index>
	//  127  305:aload_2         
	//  128  306:getfield        #448 <Field Object ConcatenatingMediaSource$MessageData.customData>
	//  129  309:checkcast       #23  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//  130  312:invokespecial   #205 <Method void addMediaSourceInternal(int, ConcatenatingMediaSource$MediaSourceHolder)>
			scheduleListenerNotification(((MessageData) (obj)).actionOnCompletion);
	//  131  315:aload_0         
	//  132  316:aload_2         
	//  133  317:getfield        #463 <Field ConcatenatingMediaSource$EventDispatcher ConcatenatingMediaSource$MessageData.actionOnCompletion>
	//  134  320:invokespecial   #347 <Method void scheduleListenerNotification(ConcatenatingMediaSource$EventDispatcher)>
			break;
		}
	//  135  323:return          
	}

	public final void moveMediaSource(int i, int j)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		moveMediaSource(i, j, ((Runnable) (null)));
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:iload_2         
	//    5    5:aconst_null     
	//    6    6:invokevirtual   #470 <Method void moveMediaSource(int, int, Runnable)>
		this;
	//    7    9:aload_0         
		JVM INSTR monitorexit ;
	//    8   10:monitorexit     
		return;
	//    9   11:return          
		Exception exception;
		exception;
	//   10   12:astore_3        
	//*  11   13:aload_0         
		throw exception;
	//   12   14:monitorexit     
	//   13   15:aload_3         
	//   14   16:athrow          
	}

	public final void moveMediaSource(int i, int j, Runnable runnable)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(i == j)
	//*   2    2:iload_1         
	//*   3    3:iload_2         
	//*   4    4:icmpne          10
	//*   5    7:aload_0         
			return;
	//    6    8:monitorexit     
	//    7    9:return          
		mediaSourcesPublic.add(j, mediaSourcesPublic.remove(i));
	//    8   10:aload_0         
	//    9   11:getfield        #111 <Field List mediaSourcesPublic>
	//   10   14:iload_2         
	//   11   15:aload_0         
	//   12   16:getfield        #111 <Field List mediaSourcesPublic>
	//   13   19:iload_1         
	//   14   20:invokeinterface #243 <Method Object List.remove(int)>
	//   15   25:invokeinterface #177 <Method void List.add(int, Object)>
		if(player != null)
	//*  16   30:aload_0         
	//*  17   31:getfield        #267 <Field ExoPlayer player>
	//*  18   34:ifnull          74
		{
			player.createMessage(((com.google.android.exoplayer2.PlayerMessage.Target) (this))).setType(3).setPayload(((Object) (new MessageData(i, ((Object) (Integer.valueOf(j))), runnable)))).send();
	//   19   37:aload_0         
	//   20   38:getfield        #267 <Field ExoPlayer player>
	//   21   41:aload_0         
	//   22   42:invokeinterface #273 <Method PlayerMessage ExoPlayer.createMessage(com.google.android.exoplayer2.PlayerMessage$Target)>
	//   23   47:iconst_3        
	//   24   48:invokevirtual   #279 <Method PlayerMessage PlayerMessage.setType(int)>
	//   25   51:new             #26  <Class ConcatenatingMediaSource$MessageData>
	//   26   54:dup             
	//   27   55:iload_1         
	//   28   56:iload_2         
	//   29   57:invokestatic    #474 <Method Integer Integer.valueOf(int)>
	//   30   60:aload_3         
	//   31   61:invokespecial   #355 <Method void ConcatenatingMediaSource$MessageData(int, Object, Runnable)>
	//   32   64:invokevirtual   #283 <Method PlayerMessage PlayerMessage.setPayload(Object)>
	//   33   67:invokevirtual   #287 <Method PlayerMessage PlayerMessage.send()>
	//   34   70:pop             
			break MISSING_BLOCK_LABEL_84;
	//   35   71:goto            84
		}
		if(runnable == null)
			break MISSING_BLOCK_LABEL_84;
	//   36   74:aload_3         
	//   37   75:ifnull          84
		runnable.run();
	//   38   78:aload_3         
	//   39   79:invokeinterface #360 <Method void Runnable.run()>
		this;
	//   40   84:aload_0         
		JVM INSTR monitorexit ;
	//   41   85:monitorexit     
		return;
	//   42   86:return          
		runnable;
	//   43   87:astore_3        
	//*  44   88:aload_0         
		throw runnable;
	//   45   89:monitorexit     
	//   46   90:aload_3         
	//   47   91:athrow          
	}

	protected final void onChildSourceInfoRefreshed(MediaSourceHolder mediasourceholder, MediaSource mediasource, Timeline timeline, Object obj)
	{
		updateMediaSourceInternal(mediasourceholder, timeline);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #478 <Method void updateMediaSourceInternal(ConcatenatingMediaSource$MediaSourceHolder, Timeline)>
	//    4    6:return          
	}

	protected volatile void onChildSourceInfoRefreshed(Object obj, MediaSource mediasource, Timeline timeline, Object obj1)
	{
		onChildSourceInfoRefreshed((MediaSourceHolder)obj, mediasource, timeline, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #481 <Method void onChildSourceInfoRefreshed(ConcatenatingMediaSource$MediaSourceHolder, MediaSource, Timeline, Object)>
	//    7   12:return          
	}

	public final void prepareSourceInternal(ExoPlayer exoplayer, boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		super.prepareSourceInternal(exoplayer, flag);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:iload_2         
	//    5    5:invokespecial   #485 <Method void CompositeMediaSource.prepareSourceInternal(ExoPlayer, boolean)>
		player = exoplayer;
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:putfield        #267 <Field ExoPlayer player>
		if(mediaSourcesPublic.isEmpty())
	//*   9   13:aload_0         
	//*  10   14:getfield        #111 <Field List mediaSourcesPublic>
	//*  11   17:invokeinterface #249 <Method boolean List.isEmpty()>
	//*  12   22:ifeq            32
		{
			notifyListener();
	//   13   25:aload_0         
	//   14   26:invokespecial   #435 <Method void notifyListener()>
			break MISSING_BLOCK_LABEL_69;
	//   15   29:goto            69
		}
		shuffleOrder = shuffleOrder.cloneAndInsert(0, mediaSourcesPublic.size());
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #101 <Field ShuffleOrder shuffleOrder>
	//   19   37:iconst_0        
	//   20   38:aload_0         
	//   21   39:getfield        #111 <Field List mediaSourcesPublic>
	//   22   42:invokeinterface #211 <Method int List.size()>
	//   23   47:invokeinterface #457 <Method ShuffleOrder ShuffleOrder.cloneAndInsert(int, int)>
	//   24   52:putfield        #101 <Field ShuffleOrder shuffleOrder>
		addMediaSourcesInternal(0, ((Collection) (mediaSourcesPublic)));
	//   25   55:aload_0         
	//   26   56:iconst_0        
	//   27   57:aload_0         
	//   28   58:getfield        #111 <Field List mediaSourcesPublic>
	//   29   61:invokespecial   #465 <Method void addMediaSourcesInternal(int, Collection)>
		scheduleListenerNotification(((EventDispatcher) (null)));
	//   30   64:aload_0         
	//   31   65:aconst_null     
	//   32   66:invokespecial   #347 <Method void scheduleListenerNotification(ConcatenatingMediaSource$EventDispatcher)>
		this;
	//   33   69:aload_0         
		JVM INSTR monitorexit ;
	//   34   70:monitorexit     
		return;
	//   35   71:return          
		exoplayer;
	//   36   72:astore_1        
	//*  37   73:aload_0         
		throw exoplayer;
	//   38   74:monitorexit     
	//   39   75:aload_1         
	//   40   76:athrow          
	}

	public final void releasePeriod(MediaPeriod mediaperiod)
	{
		MediaSourceHolder mediasourceholder = (MediaSourceHolder)mediaSourceByMediaPeriod.remove(((Object) (mediaperiod)));
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field Map mediaSourceByMediaPeriod>
	//    2    4:aload_1         
	//    3    5:invokeinterface #489 <Method Object Map.remove(Object)>
	//    4   10:checkcast       #23  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//    5   13:astore_2        
		((DeferredMediaPeriod)mediaperiod).releasePeriod();
	//    6   14:aload_1         
	//    7   15:checkcast       #338 <Class DeferredMediaPeriod>
	//    8   18:invokevirtual   #491 <Method void DeferredMediaPeriod.releasePeriod()>
		mediasourceholder.activeMediaPeriods.remove(((Object) (mediaperiod)));
	//    9   21:aload_2         
	//   10   22:getfield        #297 <Field List ConcatenatingMediaSource$MediaSourceHolder.activeMediaPeriods>
	//   11   25:aload_1         
	//   12   26:invokeinterface #493 <Method boolean List.remove(Object)>
	//   13   31:pop             
		if(mediasourceholder.activeMediaPeriods.isEmpty() && mediasourceholder.isRemoved)
	//*  14   32:aload_2         
	//*  15   33:getfield        #297 <Field List ConcatenatingMediaSource$MediaSourceHolder.activeMediaPeriods>
	//*  16   36:invokeinterface #249 <Method boolean List.isEmpty()>
	//*  17   41:ifeq            56
	//*  18   44:aload_2         
	//*  19   45:getfield        #294 <Field boolean ConcatenatingMediaSource$MediaSourceHolder.isRemoved>
	//*  20   48:ifeq            56
			releaseChildSource(((Object) (mediasourceholder)));
	//   21   51:aload_0         
	//   22   52:aload_2         
	//   23   53:invokevirtual   #301 <Method void releaseChildSource(Object)>
	//   24   56:return          
	}

	public final void releaseSourceInternal()
	{
		super.releaseSourceInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #496 <Method void CompositeMediaSource.releaseSourceInternal()>
		mediaSourceHolders.clear();
	//    2    4:aload_0         
	//    3    5:getfield        #113 <Field List mediaSourceHolders>
	//    4    8:invokeinterface #258 <Method void List.clear()>
		player = null;
	//    5   13:aload_0         
	//    6   14:aconst_null     
	//    7   15:putfield        #267 <Field ExoPlayer player>
		shuffleOrder = shuffleOrder.cloneAndClear();
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #101 <Field ShuffleOrder shuffleOrder>
	//   11   23:invokeinterface #99  <Method ShuffleOrder ShuffleOrder.cloneAndClear()>
	//   12   28:putfield        #101 <Field ShuffleOrder shuffleOrder>
		windowCount = 0;
	//   13   31:aload_0         
	//   14   32:iconst_0        
	//   15   33:putfield        #216 <Field int windowCount>
		periodCount = 0;
	//   16   36:aload_0         
	//   17   37:iconst_0        
	//   18   38:putfield        #218 <Field int periodCount>
	//   19   41:return          
	}

	public final void removeMediaSource(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		removeMediaSource(i, ((Runnable) (null)));
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #500 <Method void removeMediaSource(int, Runnable)>
		this;
	//    6    8:aload_0         
		JVM INSTR monitorexit ;
	//    7    9:monitorexit     
		return;
	//    8   10:return          
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public final void removeMediaSource(int i, Runnable runnable)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mediaSourcesPublic.remove(i);
	//    2    2:aload_0         
	//    3    3:getfield        #111 <Field List mediaSourcesPublic>
	//    4    6:iload_1         
	//    5    7:invokeinterface #243 <Method Object List.remove(int)>
	//    6   12:pop             
		if(player != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #267 <Field ExoPlayer player>
	//*   9   17:ifnull          54
		{
			player.createMessage(((com.google.android.exoplayer2.PlayerMessage.Target) (this))).setType(2).setPayload(((Object) (new MessageData(i, ((Object) (null)), runnable)))).send();
	//   10   20:aload_0         
	//   11   21:getfield        #267 <Field ExoPlayer player>
	//   12   24:aload_0         
	//   13   25:invokeinterface #273 <Method PlayerMessage ExoPlayer.createMessage(com.google.android.exoplayer2.PlayerMessage$Target)>
	//   14   30:iconst_2        
	//   15   31:invokevirtual   #279 <Method PlayerMessage PlayerMessage.setType(int)>
	//   16   34:new             #26  <Class ConcatenatingMediaSource$MessageData>
	//   17   37:dup             
	//   18   38:iload_1         
	//   19   39:aconst_null     
	//   20   40:aload_2         
	//   21   41:invokespecial   #355 <Method void ConcatenatingMediaSource$MessageData(int, Object, Runnable)>
	//   22   44:invokevirtual   #283 <Method PlayerMessage PlayerMessage.setPayload(Object)>
	//   23   47:invokevirtual   #287 <Method PlayerMessage PlayerMessage.send()>
	//   24   50:pop             
			break MISSING_BLOCK_LABEL_64;
	//   25   51:goto            64
		}
		if(runnable == null)
			break MISSING_BLOCK_LABEL_64;
	//   26   54:aload_2         
	//   27   55:ifnull          64
		runnable.run();
	//   28   58:aload_2         
	//   29   59:invokeinterface #360 <Method void Runnable.run()>
		this;
	//   30   64:aload_0         
		JVM INSTR monitorexit ;
	//   31   65:monitorexit     
		return;
	//   32   66:return          
		runnable;
	//   33   67:astore_2        
	//*  34   68:aload_0         
		throw runnable;
	//   35   69:monitorexit     
	//   36   70:aload_2         
	//   37   71:athrow          
	}

	private static final int MSG_ADD = 0;
	private static final int MSG_ADD_MULTIPLE = 1;
	private static final int MSG_CLEAR = 4;
	private static final int MSG_MOVE = 3;
	private static final int MSG_NOTIFY_LISTENER = 5;
	private static final int MSG_ON_COMPLETION = 6;
	private static final int MSG_REMOVE = 2;
	private final boolean isAtomic;
	private boolean listenerNotificationScheduled;
	private final Map mediaSourceByMediaPeriod;
	private final List mediaSourceHolders;
	private final List mediaSourcesPublic;
	private final List pendingOnCompletionActions;
	private int periodCount;
	private ExoPlayer player;
	private final MediaSourceHolder query;
	private ShuffleOrder shuffleOrder;
	private final com.google.android.exoplayer2.Timeline.Window window;
	private int windowCount;
}
