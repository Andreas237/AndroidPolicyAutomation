// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;
import android.support.v4.app.BundleCompat;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat

static class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver
{

	protected void onReceiveResult(int i, Bundle bundle)
	{
		MediaControllerCompat.MediaControllerImplApi21 mediacontrollerimplapi21 = (MediaControllerCompat.MediaControllerImplApi21)mMediaControllerImpl.get();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field WeakReference mMediaControllerImpl>
	//    2    4:invokevirtual   #32  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$MediaControllerImplApi21>
	//    4   10:astore_3        
		if(mediacontrollerimplapi21 == null || bundle == null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          19
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       20
		{
			return;
	//    9   19:return          
		} else
		{
			MediaControllerCompat.MediaControllerImplApi21.access$002(mediacontrollerimplapi21, IMediaSession.Stub.asInterface(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
	//   10   20:aload_3         
	//   11   21:aload_2         
	//   12   22:ldc1            #34  <String "android.support.v4.media.session.EXTRA_BINDER">
	//   13   24:invokestatic    #40  <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//   14   27:invokestatic    #46  <Method IMediaSession IMediaSession$Stub.asInterface(android.os.IBinder)>
	//   15   30:invokestatic    #50  <Method IMediaSession MediaControllerCompat$MediaControllerImplApi21.access$002(MediaControllerCompat$MediaControllerImplApi21, IMediaSession)>
	//   16   33:pop             
			MediaControllerCompat.MediaControllerImplApi21.access$400(mediacontrollerimplapi21);
	//   17   34:aload_3         
	//   18   35:invokestatic    #54  <Method void MediaControllerCompat$MediaControllerImplApi21.access$400(MediaControllerCompat$MediaControllerImplApi21)>
			return;
	//   19   38:return          
		}
	}

	private WeakReference mMediaControllerImpl;

	public MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(MediaControllerCompat.MediaControllerImplApi21 mediacontrollerimplapi21, Handler handler)
	{
		super(handler);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #18  <Method void ResultReceiver(Handler)>
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
