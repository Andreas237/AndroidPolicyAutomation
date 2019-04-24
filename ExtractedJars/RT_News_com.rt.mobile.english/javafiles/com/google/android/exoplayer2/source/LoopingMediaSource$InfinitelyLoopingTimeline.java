// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;

// Referenced classes of package com.google.android.exoplayer2.source:
//			ForwardingTimeline, LoopingMediaSource

private static final class LoopingMediaSource$InfinitelyLoopingTimeline extends ForwardingTimeline
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

	public LoopingMediaSource$InfinitelyLoopingTimeline(Timeline timeline)
	{
		super(timeline);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void ForwardingTimeline(Timeline)>
	//    3    5:return          
	}
}
