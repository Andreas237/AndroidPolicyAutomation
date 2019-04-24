// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.media.MediaRouter;

final class MediaRouterJellybeanMr2
{
	public static final class RouteInfo
	{

		public static CharSequence getDescription(Object obj)
		{
			return ((android.media.MediaRouter.RouteInfo)obj).getDescription();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteInfo>
		//    2    4:invokevirtual   #19  <Method CharSequence android.media.MediaRouter$RouteInfo.getDescription()>
		//    3    7:areturn         
		}

		public static boolean isConnecting(Object obj)
		{
			return ((android.media.MediaRouter.RouteInfo)obj).isConnecting();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteInfo>
		//    2    4:invokevirtual   #24  <Method boolean android.media.MediaRouter$RouteInfo.isConnecting()>
		//    3    7:ireturn         
		}

		public RouteInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class UserRouteInfo
	{

		public static void setDescription(Object obj, CharSequence charsequence)
		{
			((android.media.MediaRouter.UserRouteInfo)obj).setDescription(charsequence);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaRouter$UserRouteInfo>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #19  <Method void android.media.MediaRouter$UserRouteInfo.setDescription(CharSequence)>
		//    4    8:return          
		}

		public UserRouteInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	MediaRouterJellybeanMr2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static void addCallback(Object obj, int i, Object obj1, int j)
	{
		((MediaRouter)obj).addCallback(i, (android.media.MediaRouter.Callback)obj1, j);
	//    0    0:aload_0         
	//    1    1:checkcast       #22  <Class MediaRouter>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:checkcast       #24  <Class android.media.MediaRouter$Callback>
	//    5    9:iload_3         
	//    6   10:invokevirtual   #27  <Method void MediaRouter.addCallback(int, android.media.MediaRouter$Callback, int)>
	//    7   13:return          
	}

	public static Object getDefaultRoute(Object obj)
	{
		return ((Object) (((MediaRouter)obj).getDefaultRoute()));
	//    0    0:aload_0         
	//    1    1:checkcast       #22  <Class MediaRouter>
	//    2    4:invokevirtual   #32  <Method android.media.MediaRouter$RouteInfo MediaRouter.getDefaultRoute()>
	//    3    7:areturn         
	}
}
