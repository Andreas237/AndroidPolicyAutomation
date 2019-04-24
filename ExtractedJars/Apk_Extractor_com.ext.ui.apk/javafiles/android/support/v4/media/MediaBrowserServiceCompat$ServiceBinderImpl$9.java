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

class MediaBrowserServiceCompat$ServiceBinderImpl$9
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
	//*  13   29:ifnonnull       73
		{
			Log.w("MBServiceCompat", (new StringBuilder()).append("sendCustomAction for callback that isn't registered action=").append(val$action).append(", extras=").append(((Object) (val$extras))).toString());
	//   14   32:ldc1            #65  <String "MBServiceCompat">
	//   15   34:new             #67  <Class StringBuilder>
	//   16   37:dup             
	//   17   38:invokespecial   #68  <Method void StringBuilder()>
	//   18   41:ldc1            #70  <String "sendCustomAction for callback that isn't registered action=">
	//   19   43:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   20   46:aload_0         
	//   21   47:getfield        #32  <Field String val$action>
	//   22   50:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   23   53:ldc1            #76  <String ", extras=">
	//   24   55:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   25   58:aload_0         
	//   26   59:getfield        #34  <Field Bundle val$extras>
	//   27   62:invokevirtual   #79  <Method StringBuilder StringBuilder.append(Object)>
	//   28   65:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   29   68:invokestatic    #89  <Method int Log.w(String, String)>
	//   30   71:pop             
			return;
	//   31   72:return          
		} else
		{
			performCustomAction(val$action, val$extras, ((MediaBrowserServiceCompat.ConnectionRecord) (obj)), val$receiver);
	//   32   73:aload_0         
	//   33   74:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
	//   34   77:getfield        #51  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
	//   35   80:aload_0         
	//   36   81:getfield        #32  <Field String val$action>
	//   37   84:aload_0         
	//   38   85:getfield        #34  <Field Bundle val$extras>
	//   39   88:aload_1         
	//   40   89:aload_0         
	//   41   90:getfield        #36  <Field ResultReceiver val$receiver>
	//   42   93:invokevirtual   #93  <Method void MediaBrowserServiceCompat.performCustomAction(String, Bundle, MediaBrowserServiceCompat$ConnectionRecord, ResultReceiver)>
			return;
	//   43   96:return          
		}
	}

	final MediaBrowserServiceCompat.ServiceBinderImpl this$1;
	final String val$action;
	final MediaBrowserServiceCompat.ServiceCallbacks val$callbacks;
	final Bundle val$extras;
	final ResultReceiver val$receiver;

	MediaBrowserServiceCompat$ServiceBinderImpl$9()
	{
		this$1 = final_servicebinderimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
		val$callbacks = servicecallbacks;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
		val$action = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #32  <Field String val$action>
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
