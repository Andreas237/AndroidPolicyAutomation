// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat

class MediaSessionCompatApi23
{
	public static interface Callback
		extends MediaSessionCompatApi21.Callback
	{

		public abstract void onPlayFromUri(Uri uri, Bundle bundle);
	}

	static class CallbackProxy extends MediaSessionCompatApi21.CallbackProxy
	{

		public void onPlayFromUri(Uri uri, Bundle bundle)
		{
			MediaSessionCompat.ensureClassLoader(bundle);
		//    0    0:aload_2         
		//    1    1:invokestatic    #24  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			((Callback)mCallback).onPlayFromUri(uri, bundle);
		//    2    4:aload_0         
		//    3    5:getfield        #28  <Field MediaSessionCompatApi21$Callback mCallback>
		//    4    8:checkcast       #30  <Class MediaSessionCompatApi23$Callback>
		//    5   11:aload_1         
		//    6   12:aload_2         
		//    7   13:invokeinterface #32  <Method void MediaSessionCompatApi23$Callback.onPlayFromUri(Uri, Bundle)>
		//    8   18:return          
		}

		public CallbackProxy(Callback callback)
		{
			super(((MediaSessionCompatApi21.Callback) (callback)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #13  <Method void MediaSessionCompatApi21$CallbackProxy(MediaSessionCompatApi21$Callback)>
		//    3    5:return          
		}
	}


	private MediaSessionCompatApi23()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static Object createCallback(Callback callback)
	{
		return ((Object) (new CallbackProxy(callback)));
	//    0    0:new             #9   <Class MediaSessionCompatApi23$CallbackProxy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #23  <Method void MediaSessionCompatApi23$CallbackProxy(MediaSessionCompatApi23$Callback)>
	//    4    8:areturn         
	}
}
