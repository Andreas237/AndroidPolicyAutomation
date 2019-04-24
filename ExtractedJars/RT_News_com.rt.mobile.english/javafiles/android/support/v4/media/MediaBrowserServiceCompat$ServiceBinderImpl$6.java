// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.*;
import android.support.v4.util.ArrayMap;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$ServiceBinderImpl$6
	implements Runnable
{

	public void run()
	{
		RemoteException remoteexception;
		IBinder ibinder = val$callbacks.asBinder();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
	//    2    4:invokeinterface #41  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
	//    3    9:astore_1        
		mConnections.remove(((Object) (ibinder)));
	//    4   10:aload_0         
	//    5   11:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
	//    6   14:getfield        #45  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
	//    7   17:getfield        #49  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #55  <Method Object ArrayMap.remove(Object)>
	//   10   24:pop             
		MediaBrowserServiceCompat.ConnectionRecord connectionrecord = new MediaBrowserServiceCompat.ConnectionRecord(this$0);
	//   11   25:new             #57  <Class MediaBrowserServiceCompat$ConnectionRecord>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
	//   15   33:getfield        #45  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
	//   16   36:invokespecial   #60  <Method void MediaBrowserServiceCompat$ConnectionRecord(MediaBrowserServiceCompat)>
	//   17   39:astore_2        
		connectionrecord.callbacks = val$callbacks;
	//   18   40:aload_2         
	//   19   41:aload_0         
	//   20   42:getfield        #26  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
	//   21   45:putfield        #63  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
		connectionrecord.rootHints = val$rootHints;
	//   22   48:aload_2         
	//   23   49:aload_0         
	//   24   50:getfield        #28  <Field Bundle val$rootHints>
	//   25   53:putfield        #66  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
		mConnections.put(((Object) (ibinder)), ((Object) (connectionrecord)));
	//   26   56:aload_0         
	//   27   57:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
	//   28   60:getfield        #45  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
	//   29   63:getfield        #49  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
	//   30   66:aload_1         
	//   31   67:aload_2         
	//   32   68:invokevirtual   #70  <Method Object ArrayMap.put(Object, Object)>
	//   33   71:pop             
		try
		{
			ibinder.linkToDeath(((android.os.IBinder.DeathRecipient) (connectionrecord)), 0);
	//   34   72:aload_1         
	//   35   73:aload_2         
	//   36   74:iconst_0        
	//   37   75:invokeinterface #76  <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
			return;
	//   38   80:return          
		}
	//*  39   81:ldc1            #78  <String "MBServiceCompat">
	//*  40   83:ldc1            #80  <String "IBinder is already dead.">
	//*  41   85:invokestatic    #86  <Method int Log.w(String, String)>
	//*  42   88:pop             
	//*  43   89:return          
		// Misplaced declaration of an exception variable
		catch(RemoteException remoteexception)
		{
			Log.w("MBServiceCompat", "IBinder is already dead.");
		}
	//*  44   90:astore_1        
	//*  45   91:goto            81
	}

	final MediaBrowserServiceCompat.ServiceBinderImpl this$1;
	final MediaBrowserServiceCompat.ServiceCallbacks val$callbacks;
	final Bundle val$rootHints;

	MediaBrowserServiceCompat$ServiceBinderImpl$6()
	{
		this$1 = final_servicebinderimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
		val$callbacks = servicecallbacks;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
		val$rootHints = Bundle.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field Bundle val$rootHints>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #31  <Method void Object()>
	//   11   19:return          
	}
}
