// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.internal;


// Referenced classes of package io.radar.sdk.internal:
//			LocationReceiver

static final class LocationReceiver$goAsyncAndFinish$1
	implements Runnable
{

	public final void run()
	{
		$pending.finish();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field android.content.BroadcastReceiver$PendingResult $pending>
	//    2    4:invokevirtual   #39  <Method void android.content.BroadcastReceiver$PendingResult.finish()>
	//    3    7:return          
	}

	final android.content.BroadcastReceiver.PendingResult $pending;

	LocationReceiver$goAsyncAndFinish$1(android.content.BroadcastReceiver.PendingResult pendingresult)
	{
		$pending = pendingresult;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field android.content.BroadcastReceiver$PendingResult $pending>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #33  <Method void Object()>
	//    5    9:return          
	}
}
