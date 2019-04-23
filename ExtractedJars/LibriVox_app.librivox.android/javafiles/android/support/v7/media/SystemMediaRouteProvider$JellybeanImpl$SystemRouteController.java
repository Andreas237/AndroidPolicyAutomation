// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;


public final class SystemMediaRouteProvider$JellybeanImpl$SystemRouteController extends MediaRouteProvider.RouteController
{

	public void onSetVolume(int i)
	{
		MediaRouterJellybean.RouteInfo.requestSetVolume(mRouteObj, i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Object mRouteObj>
	//    2    4:iload_1         
	//    3    5:invokestatic    #22  <Method void MediaRouterJellybean$RouteInfo.requestSetVolume(Object, int)>
	//    4    8:return          
	}

	public void onUpdateVolume(int i)
	{
		MediaRouterJellybean.RouteInfo.requestUpdateVolume(mRouteObj, i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Object mRouteObj>
	//    2    4:iload_1         
	//    3    5:invokestatic    #26  <Method void MediaRouterJellybean$RouteInfo.requestUpdateVolume(Object, int)>
	//    4    8:return          
	}

	private final Object mRouteObj;

	public SystemMediaRouteProvider$JellybeanImpl$SystemRouteController(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void MediaRouteProvider$RouteController()>
		mRouteObj = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Object mRouteObj>
	//    5    9:return          
	}
}
