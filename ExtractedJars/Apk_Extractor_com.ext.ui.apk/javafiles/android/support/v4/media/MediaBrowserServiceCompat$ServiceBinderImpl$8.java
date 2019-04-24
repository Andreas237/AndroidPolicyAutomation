// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import android.support.v4.util.ArrayMap;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$ServiceBinderImpl$8
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) (val$callbacks.asBinder()));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
	//    2    4:invokeinterface #47  <Method android.os.IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
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
	//*  13   29:ifnonnull       61
		{
			Log.w("MBServiceCompat", (new StringBuilder()).append("search for callback that isn't registered query=").append(val$query).toString());
	//   14   32:ldc1            #65  <String "MBServiceCompat">
	//   15   34:new             #67  <Class StringBuilder>
	//   16   37:dup             
	//   17   38:invokespecial   #68  <Method void StringBuilder()>
	//   18   41:ldc1            #70  <String "search for callback that isn't registered query=">
	//   19   43:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   20   46:aload_0         
	//   21   47:getfield        #32  <Field String val$query>
	//   22   50:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   23   53:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   24   56:invokestatic    #84  <Method int Log.w(String, String)>
	//   25   59:pop             
			return;
	//   26   60:return          
		} else
		{
			performSearch(val$query, val$extras, ((MediaBrowserServiceCompat.ConnectionRecord) (obj)), val$receiver);
	//   27   61:aload_0         
	//   28   62:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
	//   29   65:getfield        #51  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
	//   30   68:aload_0         
	//   31   69:getfield        #32  <Field String val$query>
	//   32   72:aload_0         
	//   33   73:getfield        #34  <Field Bundle val$extras>
	//   34   76:aload_1         
	//   35   77:aload_0         
	//   36   78:getfield        #36  <Field ResultReceiver val$receiver>
	//   37   81:invokevirtual   #88  <Method void MediaBrowserServiceCompat.performSearch(String, Bundle, MediaBrowserServiceCompat$ConnectionRecord, ResultReceiver)>
			return;
	//   38   84:return          
		}
	}

	final MediaBrowserServiceCompat.ServiceBinderImpl this$1;
	final MediaBrowserServiceCompat.ServiceCallbacks val$callbacks;
	final Bundle val$extras;
	final String val$query;
	final ResultReceiver val$receiver;

	MediaBrowserServiceCompat$ServiceBinderImpl$8()
	{
		this$1 = final_servicebinderimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
		val$callbacks = servicecallbacks;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
		val$query = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #32  <Field String val$query>
		val$extras = bundle;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #34  <Field Bundle val$extras>
		val$receiver = ResultReceiver.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #36  <Field ResultReceiver val$receiver>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #39  <Method void Object()>
	//   17   31:return          
	}
}
