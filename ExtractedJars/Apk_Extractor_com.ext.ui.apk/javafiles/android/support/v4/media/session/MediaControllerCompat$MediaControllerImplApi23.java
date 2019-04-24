// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.content.Context;
import android.os.RemoteException;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, MediaControllerCompatApi21, MediaSessionCompat

static class MediaControllerCompat$MediaControllerImplApi23 extends MediaControllerCompat$MediaControllerImplApi21
{

	public MediaControllerCompat.TransportControls getTransportControls()
	{
		Object obj = MediaControllerCompatApi21.getTransportControls(mControllerObj);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object mControllerObj>
	//    2    4:invokestatic    #32  <Method Object MediaControllerCompatApi21.getTransportControls(Object)>
	//    3    7:astore_1        
		if(obj != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          21
			return ((MediaControllerCompat.TransportControls) (new MediaControllerCompat.TransportControlsApi23(obj)));
	//    6   12:new             #34  <Class MediaControllerCompat$TransportControlsApi23>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #37  <Method void MediaControllerCompat$TransportControlsApi23(Object)>
	//   10   20:areturn         
		else
			return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
	}

	public MediaControllerCompat$MediaControllerImplApi23(Context context, MediaSessionCompat.Token token)
		throws RemoteException
	{
		super(context, token);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void MediaControllerCompat$MediaControllerImplApi21(Context, MediaSessionCompat$Token)>
	//    4    6:return          
	}

	public MediaControllerCompat$MediaControllerImplApi23(Context context, MediaSessionCompat mediasessioncompat)
	{
		super(context, mediasessioncompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void MediaControllerCompat$MediaControllerImplApi21(Context, MediaSessionCompat)>
	//    4    6:return          
	}
}
