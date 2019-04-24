// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.IBinder;
import android.support.v4.util.ArrayMap;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$ServiceBinderImpl$4
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) (val$callbacks.asBinder()));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
	//    2    4:invokeinterface #43  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
	//    3    9:astore_1        
		obj = ((Object) ((MediaBrowserServiceCompat.ConnectionRecord)mConnections.get(obj)));
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
	//    6   14:getfield        #47  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
	//    7   17:getfield        #51  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #57  <Method Object ArrayMap.get(Object)>
	//   10   24:checkcast       #59  <Class MediaBrowserServiceCompat$ConnectionRecord>
	//   11   27:astore_1        
		if(obj == null)
	//*  12   28:aload_1         
	//*  13   29:ifnonnull       61
			Log.w("MBServiceCompat", (new StringBuilder()).append("removeSubscription for callback that isn't registered id=").append(val$id).toString());
	//   14   32:ldc1            #61  <String "MBServiceCompat">
	//   15   34:new             #63  <Class StringBuilder>
	//   16   37:dup             
	//   17   38:invokespecial   #64  <Method void StringBuilder()>
	//   18   41:ldc1            #66  <String "removeSubscription for callback that isn't registered id=">
	//   19   43:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   20   46:aload_0         
	//   21   47:getfield        #30  <Field String val$id>
	//   22   50:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   23   53:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   24   56:invokestatic    #80  <Method int Log.w(String, String)>
	//   25   59:pop             
		else
	//*  26   60:return          
		if(!removeSubscription(val$id, ((MediaBrowserServiceCompat.ConnectionRecord) (obj)), val$token))
	//*  27   61:aload_0         
	//*  28   62:getfield        #26  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
	//*  29   65:getfield        #47  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
	//*  30   68:aload_0         
	//*  31   69:getfield        #30  <Field String val$id>
	//*  32   72:aload_1         
	//*  33   73:aload_0         
	//*  34   74:getfield        #32  <Field IBinder val$token>
	//*  35   77:invokevirtual   #83  <Method boolean MediaBrowserServiceCompat.removeSubscription(String, MediaBrowserServiceCompat$ConnectionRecord, IBinder)>
	//*  36   80:ifne            60
		{
			Log.w("MBServiceCompat", (new StringBuilder()).append("removeSubscription called for ").append(val$id).append(" which is not subscribed").toString());
	//   37   83:ldc1            #61  <String "MBServiceCompat">
	//   38   85:new             #63  <Class StringBuilder>
	//   39   88:dup             
	//   40   89:invokespecial   #64  <Method void StringBuilder()>
	//   41   92:ldc1            #85  <String "removeSubscription called for ">
	//   42   94:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   43   97:aload_0         
	//   44   98:getfield        #30  <Field String val$id>
	//   45  101:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   46  104:ldc1            #87  <String " which is not subscribed">
	//   47  106:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   48  109:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   49  112:invokestatic    #80  <Method int Log.w(String, String)>
	//   50  115:pop             
			return;
	//   51  116:return          
		}
	}

	final MediaBrowserServiceCompat.ServiceBinderImpl this$1;
	final MediaBrowserServiceCompat.ServiceCallbacks val$callbacks;
	final String val$id;
	final IBinder val$token;

	MediaBrowserServiceCompat$ServiceBinderImpl$4()
	{
		this$1 = final_servicebinderimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
		val$callbacks = servicecallbacks;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
		val$id = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field String val$id>
		val$token = IBinder.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #32  <Field IBinder val$token>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #35  <Method void Object()>
	//   14   25:return          
	}
}
