// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Field;

class MediaBrowserServiceCompatApi26
{
	static class ResultWrapper
	{
	}

	public static interface ServiceCompatProxy
		extends MediaBrowserServiceCompatApi23.ServiceCompatProxy
	{

		public abstract void onLoadChildren(String s, ResultWrapper resultwrapper, Bundle bundle);
	}


	private static Field sResultFlags;

	static 
	{
		try
		{
			sResultFlags = ((Class) (android/service/media/MediaBrowserService$Result)).getDeclaredField("mFlags");
	//    0    0:ldc1            #21  <Class android.service.media.MediaBrowserService$Result>
	//    1    2:ldc1            #23  <String "mFlags">
	//    2    4:invokevirtual   #29  <Method Field Class.getDeclaredField(String)>
	//    3    7:putstatic       #31  <Field Field sResultFlags>
			sResultFlags.setAccessible(true);
	//    4   10:getstatic       #31  <Field Field sResultFlags>
	//    5   13:iconst_1        
	//    6   14:invokevirtual   #37  <Method void Field.setAccessible(boolean)>
	//    7   17:return          
		}
		catch(NoSuchFieldException nosuchfieldexception)
	//*   8   18:astore_0        
		{
			Log.w("MBSCompatApi26", ((Throwable) (nosuchfieldexception)));
	//    9   19:ldc1            #39  <String "MBSCompatApi26">
	//   10   21:aload_0         
	//   11   22:invokestatic    #45  <Method int Log.w(String, Throwable)>
	//   12   25:pop             
		}
	//*  13   26:return          
	}
}
