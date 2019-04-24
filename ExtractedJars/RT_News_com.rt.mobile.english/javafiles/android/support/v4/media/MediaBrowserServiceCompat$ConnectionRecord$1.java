// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.support.v4.util.ArrayMap;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$ConnectionRecord$1
	implements Runnable
{

	public void run()
	{
		mConnections.remove(((Object) (callbacks.asBinder())));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field MediaBrowserServiceCompat$ConnectionRecord this$1>
	//    2    4:getfield        #28  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ConnectionRecord.this$0>
	//    3    7:getfield        #32  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
	//    4   10:aload_0         
	//    5   11:getfield        #20  <Field MediaBrowserServiceCompat$ConnectionRecord this$1>
	//    6   14:getfield        #36  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
	//    7   17:invokeinterface #42  <Method android.os.IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
	//    8   22:invokevirtual   #48  <Method Object ArrayMap.remove(Object)>
	//    9   25:pop             
	//   10   26:return          
	}

	final MediaBrowserServiceCompat.ConnectionRecord this$1;

	MediaBrowserServiceCompat$ConnectionRecord$1()
	{
		this$1 = MediaBrowserServiceCompat.ConnectionRecord.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field MediaBrowserServiceCompat$ConnectionRecord this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}
}
