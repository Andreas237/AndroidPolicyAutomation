// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.source:
//			AbstractConcatenatedTimeline, ConcatenatingMediaSource, ShuffleOrder

private static final class ConcatenatingMediaSource$ConcatenatedTimeline extends AbstractConcatenatedTimeline
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

	public ConcatenatingMediaSource$ConcatenatedTimeline(Collection collection, int i, int j, ShuffleOrder shuffleorder, boolean flag)
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
			shuffleorder = ((ShuffleOrder) ((ConcatenatingMediaSource.MediaSourceHolder)((Iterator) (collection)).next()));
	//   42   84:aload_1         
	//   43   85:invokeinterface #68  <Method Object Iterator.next()>
	//   44   90:checkcast       #70  <Class ConcatenatingMediaSource$MediaSourceHolder>
	//   45   93:astore          4
			timelines[i] = ((Timeline) (((ConcatenatingMediaSource.MediaSourceHolder) (shuffleorder)).timeline));
	//   46   95:aload_0         
	//   47   96:getfield        #43  <Field Timeline[] timelines>
	//   48   99:iload_2         
	//   49  100:aload           4
	//   50  102:getfield        #74  <Field ConcatenatingMediaSource$DeferredTimeline ConcatenatingMediaSource$MediaSourceHolder.timeline>
	//   51  105:aastore         
			firstPeriodInChildIndices[i] = ((ConcatenatingMediaSource.MediaSourceHolder) (shuffleorder)).firstPeriodIndexInChild;
	//   52  106:aload_0         
	//   53  107:getfield        #37  <Field int[] firstPeriodInChildIndices>
	//   54  110:iload_2         
	//   55  111:aload           4
	//   56  113:getfield        #77  <Field int ConcatenatingMediaSource$MediaSourceHolder.firstPeriodIndexInChild>
	//   57  116:iastore         
			firstWindowInChildIndices[i] = ((ConcatenatingMediaSource.MediaSourceHolder) (shuffleorder)).firstWindowIndexInChild;
	//   58  117:aload_0         
	//   59  118:getfield        #39  <Field int[] firstWindowInChildIndices>
	//   60  121:iload_2         
	//   61  122:aload           4
	//   62  124:getfield        #80  <Field int ConcatenatingMediaSource$MediaSourceHolder.firstWindowIndexInChild>
	//   63  127:iastore         
			uids[i] = ((ConcatenatingMediaSource.MediaSourceHolder) (shuffleorder)).uid;
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
