// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text;

import java.util.List;

// Referenced classes of package com.google.android.exoplayer.text:
//			Subtitle

final class PlayableSubtitle
	implements Subtitle
{

	public PlayableSubtitle(Subtitle subtitle1, boolean flag, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		subtitle = subtitle1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Subtitle subtitle>
		startTimeUs = l;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #20  <Field long startTimeUs>
		if(!flag)
	//*   8   14:iload_2         
	//*   9   15:ifeq            21
	//*  10   18:goto            23
			l = 0L;
	//   11   21:lconst_0        
	//   12   22:lstore_3        
		offsetUs = l + l1;
	//   13   23:aload_0         
	//   14   24:lload_3         
	//   15   25:lload           5
	//   16   27:ladd            
	//   17   28:putfield        #22  <Field long offsetUs>
	//   18   31:return          
	}

	public List getCues(long l)
	{
		return subtitle.getCues(l - offsetUs);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Subtitle subtitle>
	//    2    4:lload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field long offsetUs>
	//    5    9:lsub            
	//    6   10:invokeinterface #27  <Method List Subtitle.getCues(long)>
	//    7   15:areturn         
	}

	public long getEventTime(int i)
	{
		return subtitle.getEventTime(i) + offsetUs;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Subtitle subtitle>
	//    2    4:iload_1         
	//    3    5:invokeinterface #33  <Method long Subtitle.getEventTime(int)>
	//    4   10:aload_0         
	//    5   11:getfield        #22  <Field long offsetUs>
	//    6   14:ladd            
	//    7   15:lreturn         
	}

	public int getEventTimeCount()
	{
		return subtitle.getEventTimeCount();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Subtitle subtitle>
	//    2    4:invokeinterface #37  <Method int Subtitle.getEventTimeCount()>
	//    3    9:ireturn         
	}

	public long getLastEventTime()
	{
		return subtitle.getLastEventTime() + offsetUs;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Subtitle subtitle>
	//    2    4:invokeinterface #41  <Method long Subtitle.getLastEventTime()>
	//    3    9:aload_0         
	//    4   10:getfield        #22  <Field long offsetUs>
	//    5   13:ladd            
	//    6   14:lreturn         
	}

	public int getNextEventTimeIndex(long l)
	{
		return subtitle.getNextEventTimeIndex(l - offsetUs);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Subtitle subtitle>
	//    2    4:lload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field long offsetUs>
	//    5    9:lsub            
	//    6   10:invokeinterface #45  <Method int Subtitle.getNextEventTimeIndex(long)>
	//    7   15:ireturn         
	}

	private final long offsetUs;
	public final long startTimeUs;
	private final Subtitle subtitle;
}
