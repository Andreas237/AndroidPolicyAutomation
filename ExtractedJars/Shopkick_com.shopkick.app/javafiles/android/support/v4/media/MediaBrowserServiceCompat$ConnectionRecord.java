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
	//    1    1:getfield        #33  <Field MediaBrowserServiceCompat this$0>
	//    2    4:getfield        #64  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
	//    3    7:new             #11  <Class MediaBrowserServiceCompat$ConnectionRecord$1>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #67  <Method void MediaBrowserServiceCompat$ConnectionRecord$1(MediaBrowserServiceCompat$ConnectionRecord)>
	//    7   15:invokevirtual   #73  <Method boolean MediaBrowserServiceCompat$ServiceHandler.post(Runnable)>
	//    8   18:pop             
	//    9   19:return          
	}

	public final MediaSessionManager.RemoteUserInfo browserInfo;
	public final MediaBrowserServiceCompat$ServiceCallbacks callbacks;
	public final int pid;
	public final String pkg;
	public MediaBrowserServiceCompat.BrowserRoot root;
	public final Bundle rootHints;
	public final HashMap subscriptions = new HashMap();
	final MediaBrowserServiceCompat this$0;
	public final int uid;

	MediaBrowserServiceCompat$ConnectionRecord(String s, int i, int j, Bundle bundle, MediaBrowserServiceCompat$ServiceCallbacks mediabrowserservicecompat$servicecallbacks)
	{
		this$0 = MediaBrowserServiceCompat.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field MediaBrowserServiceCompat this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #36  <Method void Object()>
	//    5    9:aload_0         
	//    6   10:new             #38  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #39  <Method void HashMap()>
	//    9   17:putfield        #41  <Field HashMap subscriptions>
		pkg = s;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #43  <Field String pkg>
		pid = i;
	//   13   25:aload_0         
	//   14   26:iload_3         
	//   15   27:putfield        #45  <Field int pid>
		uid = j;
	//   16   30:aload_0         
	//   17   31:iload           4
	//   18   33:putfield        #47  <Field int uid>
		browserInfo = new MediaSessionManager.RemoteUserInfo(s, i, j);
	//   19   36:aload_0         
	//   20   37:new             #49  <Class MediaSessionManager$RemoteUserInfo>
	//   21   40:dup             
	//   22   41:aload_2         
	//   23   42:iload_3         
	//   24   43:iload           4
	//   25   45:invokespecial   #52  <Method void MediaSessionManager$RemoteUserInfo(String, int, int)>
	//   26   48:putfield        #54  <Field MediaSessionManager$RemoteUserInfo browserInfo>
		rootHints = bundle;
	//   27   51:aload_0         
	//   28   52:aload           5
	//   29   54:putfield        #56  <Field Bundle rootHints>
		callbacks = mediabrowserservicecompat$servicecallbacks;
	//   30   57:aload_0         
	//   31   58:aload           6
	//   32   60:putfield        #58  <Field MediaBrowserServiceCompat$ServiceCallbacks callbacks>
	//   33   63:return          
	}
}
