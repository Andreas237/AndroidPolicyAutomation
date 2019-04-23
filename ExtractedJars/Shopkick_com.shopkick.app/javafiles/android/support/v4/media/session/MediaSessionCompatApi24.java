// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat

class MediaSessionCompatApi24
{
	public static interface Callback
		extends MediaSessionCompatApi23.Callback
	{

		public abstract void onPrepare();

		public abstract void onPrepareFromMediaId(String s, Bundle bundle);

		public abstract void onPrepareFromSearch(String s, Bundle bundle);

		public abstract void onPrepareFromUri(Uri uri, Bundle bundle);
	}

	static class CallbackProxy extends MediaSessionCompatApi23.CallbackProxy
	{

		public void onPrepare()
		{
			((Callback)mCallback).onPrepare();
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
			((Callback)mCallback).onPrepareFromMediaId(s, bundle);
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
			((Callback)mCallback).onPrepareFromSearch(s, bundle);
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
			((Callback)mCallback).onPrepareFromUri(uri, bundle);
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field MediaSessionCompatApi21$Callback mCallback>
		//    4    8:checkcast       #24  <Class MediaSessionCompatApi24$Callback>
		//    5   11:aload_1         
		//    6   12:aload_2         
		//    7   13:invokeinterface #43  <Method void MediaSessionCompatApi24$Callback.onPrepareFromUri(Uri, Bundle)>
		//    8   18:return          
		}

		public CallbackProxy(Callback callback)
		{
			super(((MediaSessionCompatApi23.Callback) (callback)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #13  <Method void MediaSessionCompatApi23$CallbackProxy(MediaSessionCompatApi23$Callback)>
		//    3    5:return          
		}
	}


	private MediaSessionCompatApi24()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public static Object createCallback(Callback callback)
	{
		return ((Object) (new CallbackProxy(callback)));
	//    0    0:new             #9   <Class MediaSessionCompatApi24$CallbackProxy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #27  <Method void MediaSessionCompatApi24$CallbackProxy(MediaSessionCompatApi24$Callback)>
	//    4    8:areturn         
	}

	public static String getCallingPackage(Object obj)
	{
		obj = ((Object) ((MediaSession)obj));
	//    0    0:aload_0         
	//    1    1:checkcast       #37  <Class MediaSession>
	//    2    4:astore_0        
		obj = ((Object) ((String)obj.getClass().getMethod("getCallingPackage", new Class[0]).invoke(obj, new Object[0])));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #41  <Method Class Object.getClass()>
	//    5    9:ldc1            #42  <String "getCallingPackage">
	//    6   11:iconst_0        
	//    7   12:anewarray       Class[]
	//    8   15:invokevirtual   #48  <Method Method Class.getMethod(String, Class[])>
	//    9   18:aload_0         
	//   10   19:iconst_0        
	//   11   20:anewarray       Object[]
	//   12   23:invokevirtual   #54  <Method Object Method.invoke(Object, Object[])>
	//   13   26:checkcast       #56  <Class String>
	//   14   29:astore_0        
		return ((String) (obj));
	//   15   30:aload_0         
	//   16   31:areturn         
		obj;
	//   17   32:astore_0        
		break MISSING_BLOCK_LABEL_41;
	//   18   33:goto            41
		obj;
	//   19   36:astore_0        
		break MISSING_BLOCK_LABEL_41;
	//   20   37:goto            41
		obj;
	//   21   40:astore_0        
		Log.e("MediaSessionCompatApi24", "Cannot execute MediaSession.getCallingPackage()", ((Throwable) (obj)));
	//   22   41:ldc1            #17  <String "MediaSessionCompatApi24">
	//   23   43:ldc1            #58  <String "Cannot execute MediaSession.getCallingPackage()">
	//   24   45:aload_0         
	//   25   46:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   26   49:pop             
		return null;
	//   27   50:aconst_null     
	//   28   51:areturn         
	}

	private static final String TAG = "MediaSessionCompatApi24";
}
