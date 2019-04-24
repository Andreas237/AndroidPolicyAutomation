// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;


// Referenced classes of package com.google.android.exoplayer2.source.dash:
//			PlayerEmsgHandler

private static final class PlayerEmsgHandler$ManifestExpiryEventInfo
{

	public final long eventTimeUs;
	public final long manifestPublishTimeMsInEmsg;

	public PlayerEmsgHandler$ManifestExpiryEventInfo(long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		eventTimeUs = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #17  <Field long eventTimeUs>
		manifestPublishTimeMsInEmsg = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #19  <Field long manifestPublishTimeMsInEmsg>
	//    8   14:return          
	}
}
