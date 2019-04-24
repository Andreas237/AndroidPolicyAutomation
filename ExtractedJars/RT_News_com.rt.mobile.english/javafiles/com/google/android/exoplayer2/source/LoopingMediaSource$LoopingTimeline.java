// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Assertions;

// Referenced classes of package com.google.android.exoplayer2.source:
//			AbstractConcatenatedTimeline, LoopingMediaSource

private static final class LoopingMediaSource$LoopingTimeline extends AbstractConcatenatedTimeline
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

	public LoopingMediaSource$LoopingTimeline(Timeline timeline, int i)
	{
		  = new (i);
	//    0    0:new             #17  <Class ShuffleOrder$UnshuffledShuffleOrder>
	//    1    3:dup             
	//    2    4:iload_2         
	//    3    5:invokespecial   #20  <Method void ShuffleOrder$UnshuffledShuffleOrder(int)>
	//    4    8:astore          4
		boolean flag = false;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		super(false, ((ShuffleOrder) ()));
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
