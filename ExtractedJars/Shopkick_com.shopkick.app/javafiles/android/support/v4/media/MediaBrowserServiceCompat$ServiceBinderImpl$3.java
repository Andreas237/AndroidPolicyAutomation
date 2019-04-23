// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.util.ArrayMap;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$ServiceBinderImpl$3
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) (val$callbacks.asBinder()));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
	//    2    4:invokeinterface #47  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
	//    3    9:astore_1        
		obj = ((Object) ((MediaBrowserServiceCompat.ConnectionRecord)mConnections.get(obj)));
	//    4   10:aload_0         
	//    5   11:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
	//    6   14:getfield        #51  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
	//    7   17:getfield        #55  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #61  <Method Object ArrayMap.get(Object)>
	//   10   24:checkcast       #63  <Class MediaBrowserServiceCompat$ConnectionRecord>
	//   11   27:astore_1        
		if(obj == null)
	//*  12   28:aload_1         
	//*  13   29:ifnonnull       67
		{
			obj = ((Object) (new StringBuilder()));
	//   14   32:new             #65  <Class StringBuilder>
	//   15   35:dup             
	//   16   36:invokespecial   #66  <Method void StringBuilder()>
	//   17   39:astore_1        
			((StringBuilder) (obj)).append("addSubscription for callback that isn't registered id=");
	//   18   40:aload_1         
	//   19   41:ldc1            #68  <String "addSubscription for callback that isn't registered id=">
	//   20   43:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   21   46:pop             
			((StringBuilder) (obj)).append(val$id);
	//   22   47:aload_1         
	//   23   48:aload_0         
	//   24   49:getfield        #32  <Field String val$id>
	//   25   52:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   26   55:pop             
			Log.w("MBServiceCompat", ((StringBuilder) (obj)).toString());
	//   27   56:ldc1            #74  <String "MBServiceCompat">
	//   28   58:aload_1         
	//   29   59:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   30   62:invokestatic    #84  <Method int Log.w(String, String)>
	//   31   65:pop             
			return;
	//   32   66:return          
		} else
		{
			addSubscription(val$id, ((MediaBrowserServiceCompat.ConnectionRecord) (obj)), val$token, val$options);
	//   33   67:aload_0         
	//   34   68:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
	//   35   71:getfield        #51  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
	//   36   74:aload_0         
	//   37   75:getfield        #32  <Field String val$id>
	//   38   78:aload_1         
	//   39   79:aload_0         
	//   40   80:getfield        #34  <Field IBinder val$token>
	//   41   83:aload_0         
	//   42   84:getfield        #36  <Field Bundle val$options>
	//   43   87:invokevirtual   #87  <Method void MediaBrowserServiceCompat.addSubscription(String, MediaBrowserServiceCompat$ConnectionRecord, IBinder, Bundle)>
			return;
	//   44   90:return          
		}
	}

	final MediaBrowserServiceCompat.ServiceBinderImpl this$1;
	final MediaBrowserServiceCompat.ServiceCallbacks val$callbacks;
	final String val$id;
	final Bundle val$options;
	final IBinder val$token;

	MediaBrowserServiceCompat$ServiceBinderImpl$3()
	{
		this$1 = final_servicebinderimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
		val$callbacks = servicecallbacks;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
		val$id = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #32  <Field String val$id>
		val$token = ibinder;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #34  <Field IBinder val$token>
		val$options = Bundle.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #36  <Field Bundle val$options>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #39  <Method void Object()>
	//   17   31:return          
	}
}
