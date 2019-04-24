// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ForwardingTimeline;
import com.google.android.exoplayer2.util.Assertions;

// Referenced classes of package com.google.android.exoplayer2.source.ads:
//			AdPlaybackState

final class SinglePeriodAdTimeline extends ForwardingTimeline
{

	public SinglePeriodAdTimeline(Timeline timeline, AdPlaybackState adplaybackstate)
	{
		super(timeline);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void ForwardingTimeline(Timeline)>
		int i = timeline.getPeriodCount();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #17  <Method int Timeline.getPeriodCount()>
	//    5    9:istore_3        
		boolean flag1 = false;
	//    6   10:iconst_0        
	//    7   11:istore          5
		boolean flag;
		if(i == 1)
	//*   8   13:iload_3         
	//*   9   14:iconst_1        
	//*  10   15:icmpne          24
			flag = true;
	//   11   18:iconst_1        
	//   12   19:istore          4
		else
	//*  13   21:goto            27
			flag = false;
	//   14   24:iconst_0        
	//   15   25:istore          4
		Assertions.checkState(flag);
	//   16   27:iload           4
	//   17   29:invokestatic    #23  <Method void Assertions.checkState(boolean)>
		flag = flag1;
	//   18   32:iload           5
	//   19   34:istore          4
		if(timeline.getWindowCount() == 1)
	//*  20   36:aload_1         
	//*  21   37:invokevirtual   #26  <Method int Timeline.getWindowCount()>
	//*  22   40:iconst_1        
	//*  23   41:icmpne          47
			flag = true;
	//   24   44:iconst_1        
	//   25   45:istore          4
		Assertions.checkState(flag);
	//   26   47:iload           4
	//   27   49:invokestatic    #23  <Method void Assertions.checkState(boolean)>
		adPlaybackState = adplaybackstate;
	//   28   52:aload_0         
	//   29   53:aload_2         
	//   30   54:putfield        #28  <Field AdPlaybackState adPlaybackState>
	//   31   57:return          
	}

	public com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period, boolean flag)
	{
		timeline.getPeriod(i, period, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Timeline timeline>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #37  <Method com.google.android.exoplayer2.Timeline$Period Timeline.getPeriod(int, com.google.android.exoplayer2.Timeline$Period, boolean)>
	//    6   10:pop             
		period.set(period.id, period.uid, period.windowIndex, period.durationUs, period.getPositionInWindowUs(), adPlaybackState);
	//    7   11:aload_2         
	//    8   12:aload_2         
	//    9   13:getfield        #43  <Field Object com.google.android.exoplayer2.Timeline$Period.id>
	//   10   16:aload_2         
	//   11   17:getfield        #46  <Field Object com.google.android.exoplayer2.Timeline$Period.uid>
	//   12   20:aload_2         
	//   13   21:getfield        #50  <Field int com.google.android.exoplayer2.Timeline$Period.windowIndex>
	//   14   24:aload_2         
	//   15   25:getfield        #54  <Field long com.google.android.exoplayer2.Timeline$Period.durationUs>
	//   16   28:aload_2         
	//   17   29:invokevirtual   #58  <Method long com.google.android.exoplayer2.Timeline$Period.getPositionInWindowUs()>
	//   18   32:aload_0         
	//   19   33:getfield        #28  <Field AdPlaybackState adPlaybackState>
	//   20   36:invokevirtual   #62  <Method com.google.android.exoplayer2.Timeline$Period com.google.android.exoplayer2.Timeline$Period.set(Object, Object, int, long, long, AdPlaybackState)>
	//   21   39:pop             
		return period;
	//   22   40:aload_2         
	//   23   41:areturn         
	}

	public com.google.android.exoplayer2.Timeline.Window getWindow(int i, com.google.android.exoplayer2.Timeline.Window window, boolean flag, long l)
	{
		window = super.getWindow(i, window, flag, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:lload           4
	//    5    6:invokespecial   #66  <Method com.google.android.exoplayer2.Timeline$Window ForwardingTimeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window, boolean, long)>
	//    6    9:astore_2        
		if(window.durationUs == 0x1L)
	//*   7   10:aload_2         
	//*   8   11:getfield        #69  <Field long com.google.android.exoplayer2.Timeline$Window.durationUs>
	//*   9   14:ldc2w           #70  <Long 0x1L>
	//*  10   17:lcmp            
	//*  11   18:ifne            32
			window.durationUs = adPlaybackState.contentDurationUs;
	//   12   21:aload_2         
	//   13   22:aload_0         
	//   14   23:getfield        #28  <Field AdPlaybackState adPlaybackState>
	//   15   26:getfield        #76  <Field long AdPlaybackState.contentDurationUs>
	//   16   29:putfield        #69  <Field long com.google.android.exoplayer2.Timeline$Window.durationUs>
		return window;
	//   17   32:aload_2         
	//   18   33:areturn         
	}

	private final AdPlaybackState adPlaybackState;
}
