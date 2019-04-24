// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.content.Context;
import android.os.RemoteException;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, MediaControllerCompatApi26, MediaControllerCompatApi21, MediaSessionCompat

static class MediaControllerCompat$MediaControllerImplApi26 extends MediaControllerCompat$MediaControllerImplApi24
{

	public int getRepeatMode()
	{
		return MediaControllerCompatApi26.getRepeatMode(mControllerObj);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mControllerObj>
	//    2    4:invokestatic    #29  <Method int MediaControllerCompatApi26.getRepeatMode(Object)>
	//    3    7:ireturn         
	}

	public MediaControllerCompat.TransportControls getTransportControls()
	{
		Object obj = MediaControllerCompatApi21.getTransportControls(mControllerObj);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mControllerObj>
	//    2    4:invokestatic    #36  <Method Object MediaControllerCompatApi21.getTransportControls(Object)>
	//    3    7:astore_1        
		if(obj != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          21
			return ((MediaControllerCompat.TransportControls) (new MediaControllerCompat.TransportControlsApi26(obj)));
	//    6   12:new             #38  <Class MediaControllerCompat$TransportControlsApi26>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #41  <Method void MediaControllerCompat$TransportControlsApi26(Object)>
	//   10   20:areturn         
		else
			return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
	}

	public boolean isShuffleModeEnabled()
	{
		return MediaControllerCompatApi26.isShuffleModeEnabled(mControllerObj);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mControllerObj>
	//    2    4:invokestatic    #46  <Method boolean MediaControllerCompatApi26.isShuffleModeEnabled(Object)>
	//    3    7:ireturn         
	}

	MediaControllerCompat$MediaControllerImplApi26(Context context, MediaSessionCompat.Token token)
		throws RemoteException
	{
		super(context, token);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #13  <Method void MediaControllerCompat$MediaControllerImplApi24(Context, MediaSessionCompat$Token)>
	//    4    6:return          
	}

	MediaControllerCompat$MediaControllerImplApi26(Context context, MediaSessionCompat mediasessioncompat)
	{
		super(context, mediasessioncompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #18  <Method void MediaControllerCompat$MediaControllerImplApi24(Context, MediaSessionCompat)>
	//    4    6:return          
	}
}
