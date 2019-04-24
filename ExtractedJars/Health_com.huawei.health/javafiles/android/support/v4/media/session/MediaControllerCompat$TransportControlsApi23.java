// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat

static class MediaControllerCompat$TransportControlsApi23 extends MediaControllerCompat$TransportControlsApi21
{

	public void playFromUri(Uri uri, Bundle bundle)
	{
		MediaControllerCompatApi23$TransportControls.playFromUri(mControlsObj, uri, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object mControlsObj>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #23  <Method void MediaControllerCompatApi23$TransportControls.playFromUri(Object, Uri, Bundle)>
	//    5    9:return          
	}

	public MediaControllerCompat$TransportControlsApi23(Object obj)
	{
		super(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void MediaControllerCompat$TransportControlsApi21(Object)>
	//    3    5:return          
	}
}
