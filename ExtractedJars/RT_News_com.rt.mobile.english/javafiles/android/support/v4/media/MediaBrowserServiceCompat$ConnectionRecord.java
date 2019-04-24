// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import java.util.HashMap;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

private class MediaBrowserServiceCompat$ConnectionRecord
	implements android.os.IBinder.DeathRecipient
{

	public void binderDied()
	{
		mHandler.post(new Runnable() {

			public void run()
			{
				mConnections.remove(((Object) (callbacks.asBinder())));
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field MediaBrowserServiceCompat$ConnectionRecord this$1>
			//    2    4:getfield        #28  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ConnectionRecord.this$0>
			//    3    7:getfield        #32  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
			//    4   10:aload_0         
			//    5   11:getfield        #20  <Field MediaBrowserServiceCompat$ConnectionRecord this$1>
			//    6   14:getfield        #36  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
			//    7   17:invokeinterface #42  <Method android.os.IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
			//    8   22:invokevirtual   #48  <Method Object ArrayMap.remove(Object)>
			//    9   25:pop             
			//   10   26:return          
			}

			final MediaBrowserServiceCompat.ConnectionRecord this$1;

			
			{
				this$1 = MediaBrowserServiceCompat.ConnectionRecord.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field MediaBrowserServiceCompat$ConnectionRecord this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field MediaBrowserServiceCompat this$0>
	//    2    4:getfield        #42  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
	//    3    7:new             #11  <Class MediaBrowserServiceCompat$ConnectionRecord$1>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #45  <Method void MediaBrowserServiceCompat$ConnectionRecord$1(MediaBrowserServiceCompat$ConnectionRecord)>
	//    7   15:invokevirtual   #51  <Method boolean MediaBrowserServiceCompat$ServiceHandler.post(Runnable)>
	//    8   18:pop             
	//    9   19:return          
	}

	MediaBrowserServiceCompat$ServiceCallbacks callbacks;
	String pkg;
	MediaBrowserServiceCompat.BrowserRoot root;
	Bundle rootHints;
	HashMap subscriptions;
	final MediaBrowserServiceCompat this$0;

	MediaBrowserServiceCompat$ConnectionRecord()
	{
		this$0 = MediaBrowserServiceCompat.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field MediaBrowserServiceCompat this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #31  <Method void Object()>
		subscriptions = new HashMap();
	//    5    9:aload_0         
	//    6   10:new             #33  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #34  <Method void HashMap()>
	//    9   17:putfield        #36  <Field HashMap subscriptions>
	//   10   20:return          
	}
}
