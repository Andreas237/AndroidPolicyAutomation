// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.util.ArrayMap;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$4
	implements Runnable
{

	public void run()
	{
		for(int i = 0; i < mConnections.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #26  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
	//*   5    7:getfield        #41  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.this$0>
	//*   6   10:getfield        #45  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
	//*   7   13:invokevirtual   #51  <Method int ArrayMap.size()>
	//*   8   16:icmpge          74
		{
			MediaBrowserServiceCompat.ConnectionRecord connectionrecord = (MediaBrowserServiceCompat.ConnectionRecord)mConnections.valueAt(i);
	//    9   19:aload_0         
	//   10   20:getfield        #26  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
	//   11   23:getfield        #41  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.this$0>
	//   12   26:getfield        #45  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
	//   13   29:iload_1         
	//   14   30:invokevirtual   #55  <Method Object ArrayMap.valueAt(int)>
	//   15   33:checkcast       #57  <Class MediaBrowserServiceCompat$ConnectionRecord>
	//   16   36:astore_2        
			if(connectionrecord.browserInfo.equals(((Object) (val$remoteUserInfo))))
	//*  17   37:aload_2         
	//*  18   38:getfield        #60  <Field MediaSessionManager$RemoteUserInfo MediaBrowserServiceCompat$ConnectionRecord.browserInfo>
	//*  19   41:aload_0         
	//*  20   42:getfield        #28  <Field MediaSessionManager$RemoteUserInfo val$remoteUserInfo>
	//*  21   45:invokevirtual   #66  <Method boolean MediaSessionManager$RemoteUserInfo.equals(Object)>
	//*  22   48:ifeq            67
				notifyChildrenChangedForCompatOnHandler(connectionrecord, val$parentId, val$options);
	//   23   51:aload_0         
	//   24   52:getfield        #26  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
	//   25   55:aload_2         
	//   26   56:aload_0         
	//   27   57:getfield        #30  <Field String val$parentId>
	//   28   60:aload_0         
	//   29   61:getfield        #32  <Field Bundle val$options>
	//   30   64:invokevirtual   #70  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.notifyChildrenChangedForCompatOnHandler(MediaBrowserServiceCompat$ConnectionRecord, String, Bundle)>
		}

	//   31   67:iload_1         
	//   32   68:iconst_1        
	//   33   69:iadd            
	//   34   70:istore_1        
	//*  35   71:goto            2
	//   36   74:return          
	}

	final MediaBrowserServiceCompat.MediaBrowserServiceImplApi21 this$1;
	final Bundle val$options;
	final String val$parentId;
	final MediaSessionManager.RemoteUserInfo val$remoteUserInfo;

	MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$4()
	{
		this$1 = final_mediabrowserserviceimplapi21;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
		val$remoteUserInfo = remoteuserinfo;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field MediaSessionManager$RemoteUserInfo val$remoteUserInfo>
		val$parentId = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field String val$parentId>
		val$options = Bundle.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #32  <Field Bundle val$options>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #35  <Method void Object()>
	//   14   25:return          
	}
}
