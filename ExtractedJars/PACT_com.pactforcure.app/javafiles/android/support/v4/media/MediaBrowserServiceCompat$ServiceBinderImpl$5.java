// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.support.v4.os.ResultReceiver;
import android.support.v4.util.ArrayMap;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$ServiceBinderImpl$5
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) (val$callbacks.asBinder()));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
	//    2    4:invokeinterface #43  <Method android.os.IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
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
		{
			Log.w("MBServiceCompat", (new StringBuilder()).append("getMediaItem for callback that isn't registered id=").append(val$mediaId).toString());
	//   14   32:ldc1            #61  <String "MBServiceCompat">
	//   15   34:new             #63  <Class StringBuilder>
	//   16   37:dup             
	//   17   38:invokespecial   #64  <Method void StringBuilder()>
	//   18   41:ldc1            #66  <String "getMediaItem for callback that isn't registered id=">
	//   19   43:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   20   46:aload_0         
	//   21   47:getfield        #30  <Field String val$mediaId>
	//   22   50:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   23   53:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   24   56:invokestatic    #80  <Method int Log.w(String, String)>
	//   25   59:pop             
			return;
	//   26   60:return          
		} else
		{
			performLoadItem(val$mediaId, ((MediaBrowserServiceCompat.ConnectionRecord) (obj)), val$receiver);
	//   27   61:aload_0         
	//   28   62:getfield        #26  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
	//   29   65:getfield        #47  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
	//   30   68:aload_0         
	//   31   69:getfield        #30  <Field String val$mediaId>
	//   32   72:aload_1         
	//   33   73:aload_0         
	//   34   74:getfield        #32  <Field ResultReceiver val$receiver>
	//   35   77:invokevirtual   #84  <Method void MediaBrowserServiceCompat.performLoadItem(String, MediaBrowserServiceCompat$ConnectionRecord, ResultReceiver)>
			return;
	//   36   80:return          
		}
	}

	final MediaBrowserServiceCompat.ServiceBinderImpl this$1;
	final MediaBrowserServiceCompat.ServiceCallbacks val$callbacks;
	final String val$mediaId;
	final ResultReceiver val$receiver;

	MediaBrowserServiceCompat$ServiceBinderImpl$5()
	{
		this$1 = final_servicebinderimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
		val$callbacks = servicecallbacks;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
		val$mediaId = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field String val$mediaId>
		val$receiver = ResultReceiver.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #32  <Field ResultReceiver val$receiver>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #35  <Method void Object()>
	//   14   25:return          
	}
}
