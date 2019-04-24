// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;

// Referenced classes of package com.google.android.exoplayer2.source:
//			CompositeMediaSource, MediaSource, MediaPeriod, ForwardingTimeline, 
//			AbstractConcatenatedTimeline

public final class LoopingMediaSource extends CompositeMediaSource
{
	private static final class InfinitelyLoopingTimeline extends ForwardingTimeline
	{

		public int getNextWindowIndex(int i, int j, boolean flag)
		{
			j = timeline.getNextWindowIndex(i, j, flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Timeline timeline>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:iload_3         
		//    5    7:invokevirtual   #22  <Method int Timeline.getNextWindowIndex(int, int, boolean)>
		//    6   10:istore_2        
			i = j;
		//    7   11:iload_2         
		//    8   12:istore_1        
			if(j == -1)
		//*   9   13:iload_2         
		//*  10   14:iconst_m1       
		//*  11   15:icmpne          24
				i = getFirstWindowIndex(flag);
		//   12   18:aload_0         
		//   13   19:iload_3         
		//   14   20:invokevirtual   #26  <Method int getFirstWindowIndex(boolean)>
		//   15   23:istore_1        
			return i;
		//   16   24:iload_1         
		//   17   25:ireturn         
		}

		public int getPreviousWindowIndex(int i, int j, boolean flag)
		{
			j = timeline.getPreviousWindowIndex(i, j, flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Timeline timeline>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:iload_3         
		//    5    7:invokevirtual   #29  <Method int Timeline.getPreviousWindowIndex(int, int, boolean)>
		//    6   10:istore_2        
			i = j;
		//    7   11:iload_2         
		//    8   12:istore_1        
			if(j == -1)
		//*   9   13:iload_2         
		//*  10   14:iconst_m1       
		//*  11   15:icmpne          24
				i = getLastWindowIndex(flag);
		//   12   18:aload_0         
		//   13   19:iload_3         
		//   14   20:invokevirtual   #32  <Method int getLastWindowIndex(boolean)>
		//   15   23:istore_1        
			return i;
		//   16   24:iload_1         
		//   17   25:ireturn         
		}

		public InfinitelyLoopingTimeline(Timeline timeline)
		{
			super(timeline);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void ForwardingTimeline(Timeline)>
		//    3    5:return          
		}
	}

	private static final class LoopingTimeline extends AbstractConcatenatedTimeline
	{

		protected int getChildIndexByChildUid(Object obj)
		{
			if(!(obj instanceof Integer))
		//*   0    0:aload_1         
		//*   1    1:instanceof      #54  <Class Integer>
		//*   2    4:ifne            9
				return -1;
		//    3    7:iconst_m1       
		//    4    8:ireturn         
			else
				return ((Integer)obj).intValue();
		//    5    9:aload_1         
		//    6   10:checkcast       #54  <Class Integer>
		//    7   13:invokevirtual   #57  <Method int Integer.intValue()>
		//    8   16:ireturn         
		}

		protected int getChildIndexByPeriodIndex(int i)
		{
			return i / childPeriodCount;
		//    0    0:iload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #33  <Field int childPeriodCount>
		//    3    5:idiv            
		//    4    6:ireturn         
		}

		protected int getChildIndexByWindowIndex(int i)
		{
			return i / childWindowCount;
		//    0    0:iload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #38  <Field int childWindowCount>
		//    3    5:idiv            
		//    4    6:ireturn         
		}

		protected Object getChildUidByChildIndex(int i)
		{
			return ((Object) (Integer.valueOf(i)));
		//    0    0:iload_1         
		//    1    1:invokestatic    #66  <Method Integer Integer.valueOf(int)>
		//    2    4:areturn         
		}

		protected int getFirstPeriodIndexByChildIndex(int i)
		{
			return i * childPeriodCount;
		//    0    0:iload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #33  <Field int childPeriodCount>
		//    3    5:imul            
		//    4    6:ireturn         
		}

		protected int getFirstWindowIndexByChildIndex(int i)
		{
			return i * childWindowCount;
		//    0    0:iload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #38  <Field int childWindowCount>
		//    3    5:imul            
		//    4    6:ireturn         
		}

		public int getPeriodCount()
		{
			return childPeriodCount * loopCount;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field int childPeriodCount>
		//    2    4:aload_0         
		//    3    5:getfield        #40  <Field int loopCount>
		//    4    8:imul            
		//    5    9:ireturn         
		}

		protected Timeline getTimelineByChildIndex(int i)
		{
			return childTimeline;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Timeline childTimeline>
		//    2    4:areturn         
		}

		public int getWindowCount()
		{
			return childWindowCount * loopCount;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field int childWindowCount>
		//    2    4:aload_0         
		//    3    5:getfield        #40  <Field int loopCount>
		//    4    8:imul            
		//    5    9:ireturn         
		}

		private final int childPeriodCount;
		private final Timeline childTimeline;
		private final int childWindowCount;
		private final int loopCount;

		public LoopingTimeline(Timeline timeline, int i)
		{
			ShuffleOrder.UnshuffledShuffleOrder unshuffledshuffleorder = new ShuffleOrder.UnshuffledShuffleOrder(i);
		//    0    0:new             #17  <Class ShuffleOrder$UnshuffledShuffleOrder>
		//    1    3:dup             
		//    2    4:iload_2         
		//    3    5:invokespecial   #20  <Method void ShuffleOrder$UnshuffledShuffleOrder(int)>
		//    4    8:astore          4
			boolean flag = false;
		//    5   10:iconst_0        
		//    6   11:istore_3        
			super(false, ((ShuffleOrder) (unshuffledshuffleorder)));
		//    7   12:aload_0         
		//    8   13:iconst_0        
		//    9   14:aload           4
		//   10   16:invokespecial   #23  <Method void AbstractConcatenatedTimeline(boolean, ShuffleOrder)>
			childTimeline = timeline;
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:putfield        #25  <Field Timeline childTimeline>
			childPeriodCount = timeline.getPeriodCount();
		//   14   24:aload_0         
		//   15   25:aload_1         
		//   16   26:invokevirtual   #31  <Method int Timeline.getPeriodCount()>
		//   17   29:putfield        #33  <Field int childPeriodCount>
			childWindowCount = timeline.getWindowCount();
		//   18   32:aload_0         
		//   19   33:aload_1         
		//   20   34:invokevirtual   #36  <Method int Timeline.getWindowCount()>
		//   21   37:putfield        #38  <Field int childWindowCount>
			loopCount = i;
		//   22   40:aload_0         
		//   23   41:iload_2         
		//   24   42:putfield        #40  <Field int loopCount>
			if(childPeriodCount > 0)
		//*  25   45:aload_0         
		//*  26   46:getfield        #33  <Field int childPeriodCount>
		//*  27   49:ifle            71
			{
				if(i <= 0x7fffffff / childPeriodCount)
		//*  28   52:iload_2         
		//*  29   53:ldc1            #41  <Int 0x7fffffff>
		//*  30   55:aload_0         
		//*  31   56:getfield        #33  <Field int childPeriodCount>
		//*  32   59:idiv            
		//*  33   60:icmpgt          65
					flag = true;
		//   34   63:iconst_1        
		//   35   64:istore_3        
				Assertions.checkState(flag, "LoopingMediaSource contains too many periods");
		//   36   65:iload_3         
		//   37   66:ldc1            #43  <String "LoopingMediaSource contains too many periods">
		//   38   68:invokestatic    #49  <Method void Assertions.checkState(boolean, Object)>
			}
		//   39   71:return          
		}
	}


	public LoopingMediaSource(MediaSource mediasource)
	{
		this(mediasource, 0x7fffffff);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #19  <Int 0x7fffffff>
	//    3    4:invokespecial   #22  <Method void LoopingMediaSource(MediaSource, int)>
	//    4    7:return          
	}

	public LoopingMediaSource(MediaSource mediasource, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void CompositeMediaSource()>
		boolean flag;
		if(i > 0)
	//*   2    4:iload_2         
	//*   3    5:ifle            13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_3        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_3        
		Assertions.checkArgument(flag);
	//    9   15:iload_3         
	//   10   16:invokestatic    #32  <Method void Assertions.checkArgument(boolean)>
		childSource = mediasource;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #34  <Field MediaSource childSource>
		loopCount = i;
	//   14   24:aload_0         
	//   15   25:iload_2         
	//   16   26:putfield        #36  <Field int loopCount>
	//   17   29:return          
	}

	public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaperiodid, Allocator allocator)
	{
		if(loopCount != 0x7fffffff)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field int loopCount>
	//*   2    4:ldc1            #19  <Int 0x7fffffff>
	//*   3    6:icmpeq          33
			return childSource.createPeriod(mediaperiodid.copyWithPeriodIndex(mediaperiodid.periodIndex % childPeriodCount), allocator);
	//    4    9:aload_0         
	//    5   10:getfield        #34  <Field MediaSource childSource>
	//    6   13:aload_1         
	//    7   14:aload_1         
	//    8   15:getfield        #43  <Field int MediaSource$MediaPeriodId.periodIndex>
	//    9   18:aload_0         
	//   10   19:getfield        #45  <Field int childPeriodCount>
	//   11   22:irem            
	//   12   23:invokevirtual   #49  <Method MediaSource$MediaPeriodId MediaSource$MediaPeriodId.copyWithPeriodIndex(int)>
	//   13   26:aload_2         
	//   14   27:invokeinterface #53  <Method MediaPeriod MediaSource.createPeriod(MediaSource$MediaPeriodId, Allocator)>
	//   15   32:areturn         
		else
			return childSource.createPeriod(mediaperiodid, allocator);
	//   16   33:aload_0         
	//   17   34:getfield        #34  <Field MediaSource childSource>
	//   18   37:aload_1         
	//   19   38:aload_2         
	//   20   39:invokeinterface #53  <Method MediaPeriod MediaSource.createPeriod(MediaSource$MediaPeriodId, Allocator)>
	//   21   44:areturn         
	}

	protected volatile void onChildSourceInfoRefreshed(Object obj, MediaSource mediasource, Timeline timeline, Object obj1)
	{
		onChildSourceInfoRefreshed((Void)obj, mediasource, timeline, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #58  <Class Void>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #61  <Method void onChildSourceInfoRefreshed(Void, MediaSource, Timeline, Object)>
	//    7   12:return          
	}

	protected void onChildSourceInfoRefreshed(Void void1, MediaSource mediasource, Timeline timeline, Object obj)
	{
		childPeriodCount = timeline.getPeriodCount();
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokevirtual   #68  <Method int Timeline.getPeriodCount()>
	//    3    5:putfield        #45  <Field int childPeriodCount>
		if(loopCount != 0x7fffffff)
	//*   4    8:aload_0         
	//*   5    9:getfield        #36  <Field int loopCount>
	//*   6   12:ldc1            #19  <Int 0x7fffffff>
	//*   7   14:icmpeq          33
			void1 = ((Void) (new LoopingTimeline(timeline, loopCount)));
	//    8   17:new             #10  <Class LoopingMediaSource$LoopingTimeline>
	//    9   20:dup             
	//   10   21:aload_3         
	//   11   22:aload_0         
	//   12   23:getfield        #36  <Field int loopCount>
	//   13   26:invokespecial   #71  <Method void LoopingMediaSource$LoopingTimeline(Timeline, int)>
	//   14   29:astore_1        
		else
	//*  15   30:goto            42
			void1 = ((Void) (new InfinitelyLoopingTimeline(timeline)));
	//   16   33:new             #7   <Class LoopingMediaSource$InfinitelyLoopingTimeline>
	//   17   36:dup             
	//   18   37:aload_3         
	//   19   38:invokespecial   #74  <Method void LoopingMediaSource$InfinitelyLoopingTimeline(Timeline)>
	//   20   41:astore_1        
		refreshSourceInfo(((Timeline) (void1)), obj);
	//   21   42:aload_0         
	//   22   43:aload_1         
	//   23   44:aload           4
	//   24   46:invokevirtual   #78  <Method void refreshSourceInfo(Timeline, Object)>
	//   25   49:return          
	}

	public void prepareSourceInternal(ExoPlayer exoplayer, boolean flag)
	{
		super.prepareSourceInternal(exoplayer, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #82  <Method void CompositeMediaSource.prepareSourceInternal(ExoPlayer, boolean)>
		prepareChildSource(((Object) (null)), childSource);
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:aload_0         
	//    7    9:getfield        #34  <Field MediaSource childSource>
	//    8   12:invokevirtual   #86  <Method void prepareChildSource(Object, MediaSource)>
	//    9   15:return          
	}

	public void releasePeriod(MediaPeriod mediaperiod)
	{
		childSource.releasePeriod(mediaperiod);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field MediaSource childSource>
	//    2    4:aload_1         
	//    3    5:invokeinterface #90  <Method void MediaSource.releasePeriod(MediaPeriod)>
	//    4   10:return          
	}

	public void releaseSourceInternal()
	{
		super.releaseSourceInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method void CompositeMediaSource.releaseSourceInternal()>
		childPeriodCount = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #45  <Field int childPeriodCount>
	//    5    9:return          
	}

	private int childPeriodCount;
	private final MediaSource childSource;
	private final int loopCount;
}
