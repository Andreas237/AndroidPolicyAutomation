// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.util.Log;
import android.view.Display;

public final class MediaRouterJellybeanMr1$RouteInfo
{

	public static Display getPresentationDisplay(Object obj)
	{
		try
		{
			obj = ((Object) (((android.media.MediaRouter.RouteInfo)obj).getPresentationDisplay()));
	//    0    0:aload_0         
	//    1    1:checkcast       #15  <Class android.media.MediaRouter$RouteInfo>
	//    2    4:invokevirtual   #18  <Method Display android.media.MediaRouter$RouteInfo.getPresentationDisplay()>
	//    3    7:astore_0        
		}
	//*   4    8:aload_0         
	//*   5    9:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   6   10:astore_0        
		{
			Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", ((Throwable) (obj)));
	//    7   11:ldc1            #20  <String "MediaRouterJellybeanMr1">
	//    8   13:ldc1            #22  <String "Cannot get presentation display for the route.">
	//    9   15:aload_0         
	//   10   16:invokestatic    #28  <Method int Log.w(String, String, Throwable)>
	//   11   19:pop             
			return null;
	//   12   20:aconst_null     
	//   13   21:areturn         
		}
		return ((Display) (obj));
	}

	public static boolean isEnabled(Object obj)
	{
		return ((android.media.MediaRouter.RouteInfo)obj).isEnabled();
	//    0    0:aload_0         
	//    1    1:checkcast       #15  <Class android.media.MediaRouter$RouteInfo>
	//    2    4:invokevirtual   #33  <Method boolean android.media.MediaRouter$RouteInfo.isEnabled()>
	//    3    7:ireturn         
	}

	private MediaRouterJellybeanMr1$RouteInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}
}
