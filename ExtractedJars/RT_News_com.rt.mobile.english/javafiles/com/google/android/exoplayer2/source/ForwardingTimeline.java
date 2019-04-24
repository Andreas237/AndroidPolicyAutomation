// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;

public abstract class ForwardingTimeline extends Timeline
{

	public ForwardingTimeline(Timeline timeline1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Timeline()>
		timeline = timeline1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Timeline timeline>
	//    5    9:return          
	}

	public int getFirstWindowIndex(boolean flag)
	{
		return timeline.getFirstWindowIndex(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Timeline timeline>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #18  <Method int Timeline.getFirstWindowIndex(boolean)>
	//    4    8:ireturn         
	}

	public int getIndexOfPeriod(Object obj)
	{
		return timeline.getIndexOfPeriod(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Timeline timeline>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #22  <Method int Timeline.getIndexOfPeriod(Object)>
	//    4    8:ireturn         
	}

	public int getLastWindowIndex(boolean flag)
	{
		return timeline.getLastWindowIndex(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Timeline timeline>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #25  <Method int Timeline.getLastWindowIndex(boolean)>
	//    4    8:ireturn         
	}

	public int getNextWindowIndex(int i, int j, boolean flag)
	{
		return timeline.getNextWindowIndex(i, j, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Timeline timeline>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #29  <Method int Timeline.getNextWindowIndex(int, int, boolean)>
	//    6   10:ireturn         
	}

	public com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period, boolean flag)
	{
		return timeline.getPeriod(i, period, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Timeline timeline>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #33  <Method com.google.android.exoplayer2.Timeline$Period Timeline.getPeriod(int, com.google.android.exoplayer2.Timeline$Period, boolean)>
	//    6   10:areturn         
	}

	public int getPeriodCount()
	{
		return timeline.getPeriodCount();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Timeline timeline>
	//    2    4:invokevirtual   #37  <Method int Timeline.getPeriodCount()>
	//    3    7:ireturn         
	}

	public int getPreviousWindowIndex(int i, int j, boolean flag)
	{
		return timeline.getPreviousWindowIndex(i, j, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Timeline timeline>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #40  <Method int Timeline.getPreviousWindowIndex(int, int, boolean)>
	//    6   10:ireturn         
	}

	public com.google.android.exoplayer2.Timeline.Window getWindow(int i, com.google.android.exoplayer2.Timeline.Window window, boolean flag, long l)
	{
		return timeline.getWindow(i, window, flag, l);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Timeline timeline>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:lload           4
	//    6    9:invokevirtual   #44  <Method com.google.android.exoplayer2.Timeline$Window Timeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window, boolean, long)>
	//    7   12:areturn         
	}

	public int getWindowCount()
	{
		return timeline.getWindowCount();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Timeline timeline>
	//    2    4:invokevirtual   #47  <Method int Timeline.getWindowCount()>
	//    3    7:ireturn         
	}

	protected final Timeline timeline;
}
