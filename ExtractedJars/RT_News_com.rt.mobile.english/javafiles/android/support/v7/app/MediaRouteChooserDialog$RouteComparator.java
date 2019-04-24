// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import java.util.Comparator;

// Referenced classes of package android.support.v7.app:
//			MediaRouteChooserDialog

static final class MediaRouteChooserDialog$RouteComparator
	implements Comparator
{

	public int compare(android.support.v7.media.MediaRouter.RouteInfo routeinfo, android.support.v7.media.MediaRouter.RouteInfo routeinfo1)
	{
		return routeinfo.getName().compareToIgnoreCase(routeinfo1.getName());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #29  <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
	//    4    8:invokevirtual   #35  <Method int String.compareToIgnoreCase(String)>
	//    5   11:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((android.support.v7.media.MediaRouter.RouteInfo)obj, (android.support.v7.media.MediaRouter.RouteInfo)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class android.support.v7.media.MediaRouter$RouteInfo>
	//    3    5:aload_2         
	//    4    6:checkcast       #25  <Class android.support.v7.media.MediaRouter$RouteInfo>
	//    5    9:invokevirtual   #38  <Method int compare(android.support.v7.media.MediaRouter$RouteInfo, android.support.v7.media.MediaRouter$RouteInfo)>
	//    6   12:ireturn         
	}

	public static final MediaRouteChooserDialog$RouteComparator sInstance = new MediaRouteChooserDialog$RouteComparator();

	static 
	{
	//    0    0:new             #2   <Class MediaRouteChooserDialog$RouteComparator>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void MediaRouteChooserDialog$RouteComparator()>
	//    3    7:putstatic       #19  <Field MediaRouteChooserDialog$RouteComparator sInstance>
	//*   4   10:return          
	}

	MediaRouteChooserDialog$RouteComparator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}
}
