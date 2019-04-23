// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat

static class MediaSessionCompat$MediaSessionImplApi28 extends MediaSessionCompat$MediaSessionImplApi21
{

	public final android.support.v4.media.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo()
	{
		return new android.support.v4.media.MediaSessionManager.RemoteUserInfo(((MediaSession)mSessionObj).getCurrentControllerInfo());
	//    0    0:new             #23  <Class android.support.v4.media.MediaSessionManager$RemoteUserInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field Object mSessionObj>
	//    4    8:checkcast       #29  <Class MediaSession>
	//    5   11:invokevirtual   #32  <Method android.media.session.MediaSessionManager$RemoteUserInfo MediaSession.getCurrentControllerInfo()>
	//    6   14:invokespecial   #35  <Method void android.support.v4.media.MediaSessionManager$RemoteUserInfo(android.media.session.MediaSessionManager$RemoteUserInfo)>
	//    7   17:areturn         
	}

	public void setCurrentControllerInfo(android.support.v4.media.MediaSessionManager.RemoteUserInfo remoteuserinfo)
	{
	//    0    0:return          
	}

	MediaSessionCompat$MediaSessionImplApi28(Context context, String s, Bundle bundle)
	{
		super(context, s, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #14  <Method void MediaSessionCompat$MediaSessionImplApi21(Context, String, Bundle)>
	//    5    7:return          
	}

	MediaSessionCompat$MediaSessionImplApi28(Object obj)
	{
		super(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void MediaSessionCompat$MediaSessionImplApi21(Object)>
	//    3    5:return          
	}
}
