// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;


// Referenced classes of package com.google.android.exoplayer2.upstream:
//			Loader

private static final class Loader$ReleaseTask
	implements Runnable
{

	public void run()
	{
		callback.onLoaderReleased();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Loader$ReleaseCallback callback>
	//    2    4:invokeinterface #25  <Method void Loader$ReleaseCallback.onLoaderReleased()>
	//    3    9:return          
	}

	private final ack callback;

	public Loader$ReleaseTask(ack ack)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		callback = ack;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Loader$ReleaseCallback callback>
	//    5    9:return          
	}
}
