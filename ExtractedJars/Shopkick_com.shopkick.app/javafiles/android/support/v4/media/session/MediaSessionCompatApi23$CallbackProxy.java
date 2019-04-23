// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompatApi23, MediaSessionCompat

static class MediaSessionCompatApi23$CallbackProxy extends MediaSessionCompatApi21$CallbackProxy
{

	public void onPlayFromUri(Uri uri, Bundle bundle)
	{
		MediaSessionCompat.ensureClassLoader(bundle);
	//    0    0:aload_2         
	//    1    1:invokestatic    #24  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
		((MediaSessionCompatApi23.Callback)mCallback).onPlayFromUri(uri, bundle);
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field MediaSessionCompatApi21$Callback mCallback>
	//    4    8:checkcast       #30  <Class MediaSessionCompatApi23$Callback>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokeinterface #32  <Method void MediaSessionCompatApi23$Callback.onPlayFromUri(Uri, Bundle)>
	//    8   18:return          
	}

	public MediaSessionCompatApi23$CallbackProxy(MediaSessionCompatApi23.Callback callback)
	{
		super(((MediaSessionCompatApi21.Callback) (callback)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void MediaSessionCompatApi21$CallbackProxy(MediaSessionCompatApi21$Callback)>
	//    3    5:return          
	}
}
