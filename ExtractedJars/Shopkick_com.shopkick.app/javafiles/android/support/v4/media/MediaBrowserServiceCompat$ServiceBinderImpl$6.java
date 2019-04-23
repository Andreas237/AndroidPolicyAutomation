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
	//    1    1:getfield        #31  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
	//    2    4:invokeinterface #52  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
	//    3    9:astore_1        
		mConnections.remove(((Object) (ibinder)));
	//    4   10:aload_0         
	//    5   11:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
	//    6   14:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
	//    7   17:getfield        #60  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #66  <Method Object ArrayMap.remove(Object)>
	//   10   24:pop             
		MediaBrowserServiceCompat.ConnectionRecord connectionrecord = new MediaBrowserServiceCompat.ConnectionRecord(this$0, val$pkg, val$pid, val$uid, val$rootHints, val$callbacks);
	//   11   25:new             #68  <Class MediaBrowserServiceCompat$ConnectionRecord>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
	//   15   33:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
	//   16   36:aload_0         
	//   17   37:getfield        #33  <Field String val$pkg>
	//   18   40:aload_0         
	//   19   41:getfield        #35  <Field int val$pid>
	//   20   44:aload_0         
	//   21   45:getfield        #37  <Field int val$uid>
	//   22   48:aload_0         
	//   23   49:getfield        #39  <Field Bundle val$rootHints>
	//   24   52:aload_0         
	//   25   53:getfield        #31  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
	//   26   56:invokespecial   #71  <Method void MediaBrowserServiceCompat$ConnectionRecord(MediaBrowserServiceCompat, String, int, int, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
	//   27   59:astore_2        
		mConnections.put(((Object) (ibinder)), ((Object) (connectionrecord)));
	//   28   60:aload_0         
	//   29   61:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
	//   30   64:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
	//   31   67:getfield        #60  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
	//   32   70:aload_1         
	//   33   71:aload_2         
	//   34   72:invokevirtual   #75  <Method Object ArrayMap.put(Object, Object)>
	//   35   75:pop             
		try
		{
			ibinder.linkToDeath(((android.os.IBinder.DeathRecipient) (connectionrecord)), 0);
	//   36   76:aload_1         
	//   37   77:aload_2         
	//   38   78:iconst_0        
	//   39   79:invokeinterface #81  <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
			return;
	//   40   84:return          
		}
	//*  41   85:ldc1            #83  <String "MBServiceCompat">
	//*  42   87:ldc1            #85  <String "IBinder is already dead.">
	//*  43   89:invokestatic    #91  <Method int Log.w(String, String)>
	//*  44   92:pop             
	//*  45   93:return          
		// Misplaced declaration of an exception variable
		catch(RemoteException remoteexception)
		{
			Log.w("MBServiceCompat", "IBinder is already dead.");
		}
	//*  46   94:astore_1        
	//*  47   95:goto            85
	}

	final MediaBrowserServiceCompat.ServiceBinderImpl this$1;
	final MediaBrowserServiceCompat.ServiceCallbacks val$callbacks;
	final int val$pid;
	final String val$pkg;
	final Bundle val$rootHints;
	final int val$uid;

	MediaBrowserServiceCompat$ServiceBinderImpl$6()
	{
		this$1 = final_servicebinderimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
		val$callbacks = servicecallbacks;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #31  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
		val$pkg = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #33  <Field String val$pkg>
		val$pid = i;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #35  <Field int val$pid>
		val$uid = j;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #37  <Field int val$uid>
		val$rootHints = Bundle.this;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #39  <Field Bundle val$rootHints>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #42  <Method void Object()>
	//   20   37:return          
	}
}
