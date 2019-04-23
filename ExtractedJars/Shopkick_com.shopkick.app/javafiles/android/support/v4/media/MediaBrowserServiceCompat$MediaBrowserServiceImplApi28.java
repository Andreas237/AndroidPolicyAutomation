// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.service.media.MediaBrowserService;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi28 extends MediaBrowserServiceCompat$MediaBrowserServiceImplApi26
{

	public MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo()
	{
		if(mCurConnection != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field MediaBrowserServiceCompat this$0>
	//*   2    4:getfield        #25  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
	//*   3    7:ifnull          21
			return mCurConnection.browserInfo;
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field MediaBrowserServiceCompat this$0>
	//    6   14:getfield        #25  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
	//    7   17:getfield        #31  <Field MediaSessionManager$RemoteUserInfo MediaBrowserServiceCompat$ConnectionRecord.browserInfo>
	//    8   20:areturn         
		else
			return new MediaSessionManager.RemoteUserInfo(((MediaBrowserService)mServiceObj).getCurrentBrowserInfo());
	//    9   21:new             #33  <Class MediaSessionManager$RemoteUserInfo>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:getfield        #37  <Field Object mServiceObj>
	//   13   29:checkcast       #39  <Class MediaBrowserService>
	//   14   32:invokevirtual   #42  <Method android.media.session.MediaSessionManager$RemoteUserInfo MediaBrowserService.getCurrentBrowserInfo()>
	//   15   35:invokespecial   #45  <Method void MediaSessionManager$RemoteUserInfo(android.media.session.MediaSessionManager$RemoteUserInfo)>
	//   16   38:areturn         
	}

	final MediaBrowserServiceCompat this$0;

	MediaBrowserServiceCompat$MediaBrowserServiceImplApi28()
	{
		this$0 = MediaBrowserServiceCompat.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field MediaBrowserServiceCompat this$0>
		super(MediaBrowserServiceCompat.this);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #18  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi26(MediaBrowserServiceCompat)>
	//    6   10:return          
	}
}
