// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompatApi24, MediaSessionCompat

static class MediaSessionCompatApi24$CallbackProxy extends MediaSessionCompatApi23$CallbackProxy
{

	public void onPrepare()
	{
		((MediaSessionCompatApi24.Callback)mCallback).onPrepare();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:checkcast       #24  <Class MediaSessionCompatApi24$Callback>
	//    3    7:invokeinterface #26  <Method void MediaSessionCompatApi24$Callback.onPrepare()>
	//    4   12:return          
	}

	public void onPrepareFromMediaId(String s, Bundle bundle)
	{
		MediaSessionCompat.ensureClassLoader(bundle);
	//    0    0:aload_2         
	//    1    1:invokestatic    #34  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
		((MediaSessionCompatApi24.Callback)mCallback).onPrepareFromMediaId(s, bundle);
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field MediaSessionCompatApi21$Callback mCallback>
	//    4    8:checkcast       #24  <Class MediaSessionCompatApi24$Callback>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokeinterface #36  <Method void MediaSessionCompatApi24$Callback.onPrepareFromMediaId(String, Bundle)>
	//    8   18:return          
	}

	public void onPrepareFromSearch(String s, Bundle bundle)
	{
		MediaSessionCompat.ensureClassLoader(bundle);
	//    0    0:aload_2         
	//    1    1:invokestatic    #34  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
		((MediaSessionCompatApi24.Callback)mCallback).onPrepareFromSearch(s, bundle);
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field MediaSessionCompatApi21$Callback mCallback>
	//    4    8:checkcast       #24  <Class MediaSessionCompatApi24$Callback>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokeinterface #39  <Method void MediaSessionCompatApi24$Callback.onPrepareFromSearch(String, Bundle)>
	//    8   18:return          
	}

	public void onPrepareFromUri(Uri uri, Bundle bundle)
	{
		MediaSessionCompat.ensureClassLoader(bundle);
	//    0    0:aload_2         
	//    1    1:invokestatic    #34  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
		((MediaSessionCompatApi24.Callback)mCallback).onPrepareFromUri(uri, bundle);
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field MediaSessionCompatApi21$Callback mCallback>
	//    4    8:checkcast       #24  <Class MediaSessionCompatApi24$Callback>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokeinterface #43  <Method void MediaSessionCompatApi24$Callback.onPrepareFromUri(Uri, Bundle)>
	//    8   18:return          
	}

	public MediaSessionCompatApi24$CallbackProxy(MediaSessionCompatApi24.Callback callback)
	{
		super(((MediaSessionCompatApi23.Callback) (callback)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void MediaSessionCompatApi23$CallbackProxy(MediaSessionCompatApi23$Callback)>
	//    3    5:return          
	}
}
