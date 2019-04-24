// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.manifest;


// Referenced classes of package com.google.android.exoplayer2.source.dash.manifest:
//			SegmentBase

public static class SegmentBase$SegmentTimelineElement
{

	final long duration;
	final long startTime;

	public SegmentBase$SegmentTimelineElement(long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		startTime = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #17  <Field long startTime>
		duration = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #19  <Field long duration>
	//    8   14:return          
	}
}
