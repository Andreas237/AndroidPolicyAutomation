// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.media.MediaRouter;

final class MediaRouterJellybeanMr2
{

	private MediaRouterJellybeanMr2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void addCallback(Object obj, int i, Object obj1, int j)
	{
		((MediaRouter)obj).addCallback(i, (android.media.MediaRouter.Callback)obj1, j);
	//    0    0:aload_0         
	//    1    1:checkcast       #13  <Class MediaRouter>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:checkcast       #15  <Class android.media.MediaRouter$Callback>
	//    5    9:iload_3         
	//    6   10:invokevirtual   #18  <Method void MediaRouter.addCallback(int, android.media.MediaRouter$Callback, int)>
	//    7   13:return          
	}

	public static Object getDefaultRoute(Object obj)
	{
		return ((Object) (((MediaRouter)obj).getDefaultRoute()));
	//    0    0:aload_0         
	//    1    1:checkcast       #13  <Class MediaRouter>
	//    2    4:invokevirtual   #23  <Method android.media.MediaRouter$RouteInfo MediaRouter.getDefaultRoute()>
	//    3    7:areturn         
	}
}
