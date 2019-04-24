// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$4 extends sult
{

	void onErrorSent(Bundle bundle)
	{
		val$receiver.send(-1, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ResultReceiver val$receiver>
	//    2    4:iconst_m1       
	//    3    5:aload_1         
	//    4    6:invokevirtual   #32  <Method void ResultReceiver.send(int, Bundle)>
	//    5    9:return          
	}

	void onProgressUpdateSent(Bundle bundle)
	{
		val$receiver.send(1, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ResultReceiver val$receiver>
	//    2    4:iconst_1        
	//    3    5:aload_1         
	//    4    6:invokevirtual   #32  <Method void ResultReceiver.send(int, Bundle)>
	//    5    9:return          
	}

	void onResultSent(Bundle bundle)
	{
		val$receiver.send(0, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ResultReceiver val$receiver>
	//    2    4:iconst_0        
	//    3    5:aload_1         
	//    4    6:invokevirtual   #32  <Method void ResultReceiver.send(int, Bundle)>
	//    5    9:return          
	}

	volatile void onResultSent(Object obj)
	{
		onResultSent((Bundle)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class Bundle>
	//    3    5:invokevirtual   #38  <Method void onResultSent(Bundle)>
	//    4    8:return          
	}

	final MediaBrowserServiceCompat this$0;
	final ResultReceiver val$receiver;

	MediaBrowserServiceCompat$4(ResultReceiver resultreceiver)
	{
		this$0 = final_mediabrowserservicecompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field MediaBrowserServiceCompat this$0>
		val$receiver = resultreceiver;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #20  <Field ResultReceiver val$receiver>
		super(Object.this);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #23  <Method void MediaBrowserServiceCompat$Result(Object)>
	//    9   15:return          
	}
}
