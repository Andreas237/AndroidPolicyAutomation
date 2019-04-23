// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.app.BundleCompat;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat

private static class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver
{

	protected void onReceiveResult(int i, Bundle bundle)
	{
		MediaControllerCompat.MediaControllerImplApi21 mediacontrollerimplapi21 = (MediaControllerCompat.MediaControllerImplApi21)mMediaControllerImpl.get();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field WeakReference mMediaControllerImpl>
	//    2    4:invokevirtual   #32  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$MediaControllerImplApi21>
	//    4   10:astore          4
		if(mediacontrollerimplapi21 != null)
	//*   5   12:aload           4
	//*   6   14:ifnull          74
		{
			if(bundle == null)
	//*   7   17:aload_2         
	//*   8   18:ifnonnull       22
				return;
	//    9   21:return          
			synchronized(mediacontrollerimplapi21.mLock)
	//*  10   22:aload           4
	//*  11   24:getfield        #36  <Field Object MediaControllerCompat$MediaControllerImplApi21.mLock>
	//*  12   27:astore_3        
	//*  13   28:aload_3         
	//*  14   29:monitorenter    
			{
				mediacontrollerimplapi21.mSessionToken.setExtraBinder(IMediaSession.Stub.asInterface(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
	//   15   30:aload           4
	//   16   32:getfield        #40  <Field MediaSessionCompat$Token MediaControllerCompat$MediaControllerImplApi21.mSessionToken>
	//   17   35:aload_2         
	//   18   36:ldc1            #42  <String "android.support.v4.media.session.EXTRA_BINDER">
	//   19   38:invokestatic    #48  <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//   20   41:invokestatic    #54  <Method IMediaSession IMediaSession$Stub.asInterface(android.os.IBinder)>
	//   21   44:invokevirtual   #60  <Method void MediaSessionCompat$Token.setExtraBinder(IMediaSession)>
				mediacontrollerimplapi21.mSessionToken.setSessionToken2Bundle(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
	//   22   47:aload           4
	//   23   49:getfield        #40  <Field MediaSessionCompat$Token MediaControllerCompat$MediaControllerImplApi21.mSessionToken>
	//   24   52:aload_2         
	//   25   53:ldc1            #62  <String "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE">
	//   26   55:invokevirtual   #68  <Method Bundle Bundle.getBundle(String)>
	//   27   58:invokevirtual   #72  <Method void MediaSessionCompat$Token.setSessionToken2Bundle(Bundle)>
				mediacontrollerimplapi21.processPendingCallbacksLocked();
	//   28   61:aload           4
	//   29   63:invokevirtual   #76  <Method void MediaControllerCompat$MediaControllerImplApi21.processPendingCallbacksLocked()>
			}
	//   30   66:aload_3         
	//   31   67:monitorexit     
			return;
	//   32   68:return          
		} else
	//*  33   69:astore_2        
	//*  34   70:aload_3         
	//*  35   71:monitorexit     
	//*  36   72:aload_2         
	//*  37   73:athrow          
		{
			return;
	//   38   74:return          
		}
		bundle;
		obj;
		JVM INSTR monitorexit ;
		throw bundle;
	}

	private WeakReference mMediaControllerImpl;

	MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(MediaControllerCompat.MediaControllerImplApi21 mediacontrollerimplapi21)
	{
		super(((android.os.Handler) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #18  <Method void ResultReceiver(android.os.Handler)>
		mMediaControllerImpl = new WeakReference(((Object) (mediacontrollerimplapi21)));
	//    3    5:aload_0         
	//    4    6:new             #20  <Class WeakReference>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokespecial   #23  <Method void WeakReference(Object)>
	//    8   14:putfield        #25  <Field WeakReference mMediaControllerImpl>
	//    9   17:return          
	}
}
