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
	//*  13   29:ifnonnull       83
		{
			obj = ((Object) (new StringBuilder()));
	//   14   32:new             #65  <Class StringBuilder>
	//   15   35:dup             
	//   16   36:invokespecial   #66  <Method void StringBuilder()>
	//   17   39:astore_1        
			((StringBuilder) (obj)).append("sendCustomAction for callback that isn't registered action=");
	//   18   40:aload_1         
	//   19   41:ldc1            #68  <String "sendCustomAction for callback that isn't registered action=">
	//   20   43:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   21   46:pop             
			((StringBuilder) (obj)).append(val$action);
	//   22   47:aload_1         
	//   23   48:aload_0         
	//   24   49:getfield        #32  <Field String val$action>
	//   25   52:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   26   55:pop             
			((StringBuilder) (obj)).append(", extras=");
	//   27   56:aload_1         
	//   28   57:ldc1            #74  <String ", extras=">
	//   29   59:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   30   62:pop             
			((StringBuilder) (obj)).append(((Object) (val$extras)));
	//   31   63:aload_1         
	//   32   64:aload_0         
	//   33   65:getfield        #34  <Field Bundle val$extras>
	//   34   68:invokevirtual   #77  <Method StringBuilder StringBuilder.append(Object)>
	//   35   71:pop             
			Log.w("MBServiceCompat", ((StringBuilder) (obj)).toString());
	//   36   72:ldc1            #79  <String "MBServiceCompat">
	//   37   74:aload_1         
	//   38   75:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   39   78:invokestatic    #89  <Method int Log.w(String, String)>
	//   40   81:pop             
			return;
	//   41   82:return          
		} else
		{
			performCustomAction(val$action, val$extras, ((MediaBrowserServiceCompat.ConnectionRecord) (obj)), val$receiver);
	//   42   83:aload_0         
	//   43   84:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
	//   44   87:getfield        #51  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
	//   45   90:aload_0         
	//   46   91:getfield        #32  <Field String val$action>
	//   47   94:aload_0         
	//   48   95:getfield        #34  <Field Bundle val$extras>
	//   49   98:aload_1         
	//   50   99:aload_0         
	//   51  100:getfield        #36  <Field ResultReceiver val$receiver>
	//   52  103:invokevirtual   #93  <Method void MediaBrowserServiceCompat.performCustomAction(String, Bundle, MediaBrowserServiceCompat$ConnectionRecord, ResultReceiver)>
			return;
	//   53  106:return          
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
