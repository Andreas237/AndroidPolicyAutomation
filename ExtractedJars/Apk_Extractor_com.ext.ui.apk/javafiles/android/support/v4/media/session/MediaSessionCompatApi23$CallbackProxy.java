// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompatApi23

static class MediaSessionCompatApi23$CallbackProxy extends MediaSessionCompatApi21$CallbackProxy
{

	public void onPlayFromUri(Uri uri, Bundle bundle)
	{
		((MediaSessionCompatApi23.Callback)mCallback).onPlayFromUri(uri, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:checkcast       #24  <Class MediaSessionCompatApi23$Callback>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #26  <Method void MediaSessionCompatApi23$Callback.onPlayFromUri(Uri, Bundle)>
	//    6   14:return          
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
