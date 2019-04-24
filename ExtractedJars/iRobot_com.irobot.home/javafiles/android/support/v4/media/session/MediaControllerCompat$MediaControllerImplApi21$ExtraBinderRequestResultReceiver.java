// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;
import android.support.v4.app.BundleCompat;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat

private static class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver
{

	protected void onReceiveResult(int i, Bundle bundle)
	{
		MediaControllerCompat.MediaControllerImplApi21 mediacontrollerimplapi21 = (MediaControllerCompat.MediaControllerImplApi21)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field WeakReference a>
	//    2    4:invokevirtual   #32  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$MediaControllerImplApi21>
	//    4   10:astore_3        
		if(mediacontrollerimplapi21 != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          38
		{
			if(bundle == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       20
				return;
	//    9   19:return          
			MediaControllerCompat.MediaControllerImplApi21.a(mediacontrollerimplapi21, b.a.a(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
	//   10   20:aload_3         
	//   11   21:aload_2         
	//   12   22:ldc1            #34  <String "android.support.v4.media.session.EXTRA_BINDER">
	//   13   24:invokestatic    #40  <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//   14   27:invokestatic    #45  <Method b b$a.a(android.os.IBinder)>
	//   15   30:invokestatic    #48  <Method b MediaControllerCompat$MediaControllerImplApi21.a(MediaControllerCompat$MediaControllerImplApi21, b)>
	//   16   33:pop             
			MediaControllerCompat.MediaControllerImplApi21.a(mediacontrollerimplapi21);
	//   17   34:aload_3         
	//   18   35:invokestatic    #51  <Method void MediaControllerCompat$MediaControllerImplApi21.a(MediaControllerCompat$MediaControllerImplApi21)>
		}
	//   19   38:return          
	}

	private WeakReference a;

	public MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(MediaControllerCompat.MediaControllerImplApi21 mediacontrollerimplapi21, Handler handler)
	{
		super(handler);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #18  <Method void ResultReceiver(Handler)>
		a = new WeakReference(((Object) (mediacontrollerimplapi21)));
	//    3    5:aload_0         
	//    4    6:new             #20  <Class WeakReference>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokespecial   #23  <Method void WeakReference(Object)>
	//    8   14:putfield        #25  <Field WeakReference a>
	//    9   17:return          
	}
}
