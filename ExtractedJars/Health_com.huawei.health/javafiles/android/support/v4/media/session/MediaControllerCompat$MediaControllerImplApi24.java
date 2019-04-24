// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.content.Context;
import android.os.RemoteException;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, MediaControllerCompatApi21, MediaSessionCompat

static class MediaControllerCompat$MediaControllerImplApi24 extends MediaControllerCompat$MediaControllerImplApi23
{

	public MediaControllerCompat.TransportControls getTransportControls()
	{
		Object obj = MediaControllerCompatApi21.getTransportControls(mControllerObj);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mControllerObj>
	//    2    4:invokestatic    #29  <Method Object MediaControllerCompatApi21.getTransportControls(Object)>
	//    3    7:astore_1        
		if(obj != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          21
			return ((MediaControllerCompat.TransportControls) (new MediaControllerCompat.TransportControlsApi24(obj)));
	//    6   12:new             #31  <Class MediaControllerCompat$TransportControlsApi24>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #34  <Method void MediaControllerCompat$TransportControlsApi24(Object)>
	//   10   20:areturn         
		else
			return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
	}

	public MediaControllerCompat$MediaControllerImplApi24(Context context, MediaSessionCompat.Token token)
		throws RemoteException
	{
		super(context, token);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #13  <Method void MediaControllerCompat$MediaControllerImplApi23(Context, MediaSessionCompat$Token)>
	//    4    6:return          
	}

	public MediaControllerCompat$MediaControllerImplApi24(Context context, MediaSessionCompat mediasessioncompat)
	{
		super(context, mediasessioncompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #18  <Method void MediaControllerCompat$MediaControllerImplApi23(Context, MediaSessionCompat)>
	//    4    6:return          
	}
}
