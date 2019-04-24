// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.util.ArrayMap;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$ServiceBinderImpl$6
	implements Runnable
{

	public void run()
	{
		android.os.IBinder ibinder = val$callbacks.asBinder();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
	//    2    4:invokeinterface #39  <Method android.os.IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
	//    3    9:astore_1        
		mConnections.remove(((Object) (ibinder)));
	//    4   10:aload_0         
	//    5   11:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
	//    6   14:getfield        #43  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
	//    7   17:getfield        #47  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #53  <Method Object ArrayMap.remove(Object)>
	//   10   24:pop             
		MediaBrowserServiceCompat.ConnectionRecord connectionrecord = new MediaBrowserServiceCompat.ConnectionRecord();
	//   11   25:new             #55  <Class MediaBrowserServiceCompat$ConnectionRecord>
	//   12   28:dup             
	//   13   29:invokespecial   #56  <Method void MediaBrowserServiceCompat$ConnectionRecord()>
	//   14   32:astore_2        
		connectionrecord.callbacks = val$callbacks;
	//   15   33:aload_2         
	//   16   34:aload_0         
	//   17   35:getfield        #26  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
	//   18   38:putfield        #59  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
		connectionrecord.rootHints = val$rootHints;
	//   19   41:aload_2         
	//   20   42:aload_0         
	//   21   43:getfield        #28  <Field Bundle val$rootHints>
	//   22   46:putfield        #62  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
		mConnections.put(((Object) (ibinder)), ((Object) (connectionrecord)));
	//   23   49:aload_0         
	//   24   50:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
	//   25   53:getfield        #43  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
	//   26   56:getfield        #47  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
	//   27   59:aload_1         
	//   28   60:aload_2         
	//   29   61:invokevirtual   #66  <Method Object ArrayMap.put(Object, Object)>
	//   30   64:pop             
	//   31   65:return          
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
