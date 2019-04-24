// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.IBinder;
import android.support.v4.util.ArrayMap;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$ServiceBinderImpl$2
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) (val$callbacks.asBinder()));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
	//    2    4:invokeinterface #35  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
	//    3    9:astore_1        
		obj = ((Object) ((MediaBrowserServiceCompat.ConnectionRecord)mConnections.remove(obj)));
	//    4   10:aload_0         
	//    5   11:getfield        #22  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
	//    6   14:getfield        #39  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
	//    7   17:getfield        #43  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #49  <Method Object ArrayMap.remove(Object)>
	//   10   24:checkcast       #51  <Class MediaBrowserServiceCompat$ConnectionRecord>
	//   11   27:astore_1        
		if(obj != null)
	//*  12   28:aload_1         
	//*  13   29:ifnull          49
			((MediaBrowserServiceCompat.ConnectionRecord) (obj)).callbacks.asBinder().unlinkToDeath(((android.os.IBinder.DeathRecipient) (obj)), 0);
	//   14   32:aload_1         
	//   15   33:getfield        #54  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
	//   16   36:invokeinterface #35  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
	//   17   41:aload_1         
	//   18   42:iconst_0        
	//   19   43:invokeinterface #60  <Method boolean IBinder.unlinkToDeath(android.os.IBinder$DeathRecipient, int)>
	//   20   48:pop             
	//   21   49:return          
	}

	final MediaBrowserServiceCompat.ServiceBinderImpl this$1;
	final MediaBrowserServiceCompat.ServiceCallbacks val$callbacks;

	MediaBrowserServiceCompat$ServiceBinderImpl$2()
	{
		this$1 = final_servicebinderimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
		val$callbacks = MediaBrowserServiceCompat.ServiceCallbacks.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
