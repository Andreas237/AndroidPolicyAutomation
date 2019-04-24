// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;


// Referenced classes of package android.support.v7.media:
//			SystemMediaRouteProvider

protected static final class SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord
{

	public final MediaRouter.RouteInfo mRoute;
	public final Object mRouteObj;

	public SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord(MediaRouter.RouteInfo routeinfo, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mRoute = routeinfo;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field MediaRouter$RouteInfo mRoute>
		mRouteObj = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field Object mRouteObj>
	//    8   14:return          
	}
}
