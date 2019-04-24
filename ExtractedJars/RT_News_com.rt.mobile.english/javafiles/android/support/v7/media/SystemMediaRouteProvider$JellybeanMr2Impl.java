// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.Context;

// Referenced classes of package android.support.v7.media:
//			SystemMediaRouteProvider, MediaRouterJellybeanMr2, MediaRouterJellybean

private static class SystemMediaRouteProvider$JellybeanMr2Impl extends SystemMediaRouteProvider$JellybeanMr1Impl
{

	protected Object getDefaultRoute()
	{
		return MediaRouterJellybeanMr2.getDefaultRoute(mRouterObj);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object mRouterObj>
	//    2    4:invokestatic    #26  <Method Object MediaRouterJellybeanMr2.getDefaultRoute(Object)>
	//    3    7:areturn         
	}

	protected boolean isConnecting(temRouteRecord temrouterecord)
	{
		return MediaRouterJellybeanMr2.RouteInfo.isConnecting(temrouterecord.mRouteObj);
	//    0    0:aload_1         
	//    1    1:getfield        #33  <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
	//    2    4:invokestatic    #38  <Method boolean MediaRouterJellybeanMr2$RouteInfo.isConnecting(Object)>
	//    3    7:ireturn         
	}

	protected void onBuildSystemRouteDescriptor(temRouteRecord temrouterecord, MediaRouteDescriptor.Builder builder)
	{
		super.onBuildSystemRouteDescriptor(temrouterecord, builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #42  <Method void SystemMediaRouteProvider$JellybeanMr1Impl.onBuildSystemRouteDescriptor(SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord, MediaRouteDescriptor$Builder)>
		temrouterecord = ((temRouteRecord) (MediaRouterJellybeanMr2.RouteInfo.getDescription(temrouterecord.mRouteObj)));
	//    4    6:aload_1         
	//    5    7:getfield        #33  <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
	//    6   10:invokestatic    #46  <Method CharSequence MediaRouterJellybeanMr2$RouteInfo.getDescription(Object)>
	//    7   13:astore_1        
		if(temrouterecord != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          29
			builder.setDescription(((CharSequence) (temrouterecord)).toString());
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokeinterface #52  <Method String CharSequence.toString()>
	//   13   25:invokevirtual   #58  <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setDescription(String)>
	//   14   28:pop             
	//   15   29:return          
	}

	protected void selectRoute(Object obj)
	{
		MediaRouterJellybean.selectRoute(mRouterObj, 0x800003, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object mRouterObj>
	//    2    4:ldc1            #61  <Int 0x800003>
	//    3    6:aload_1         
	//    4    7:invokestatic    #66  <Method void MediaRouterJellybean.selectRoute(Object, int, Object)>
	//    5   10:return          
	}

	protected void updateCallback()
	{
		if(mCallbackRegistered)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field boolean mCallbackRegistered>
	//*   2    4:ifeq            18
			MediaRouterJellybean.removeCallback(mRouterObj, mCallbackObj);
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Object mRouterObj>
	//    5   11:aload_0         
	//    6   12:getfield        #75  <Field Object mCallbackObj>
	//    7   15:invokestatic    #79  <Method void MediaRouterJellybean.removeCallback(Object, Object)>
		mCallbackRegistered = true;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #72  <Field boolean mCallbackRegistered>
		MediaRouterJellybeanMr2.addCallback(mRouterObj, mRouteTypes, mCallbackObj, 2 | mActiveScan);
	//   11   23:aload_0         
	//   12   24:getfield        #21  <Field Object mRouterObj>
	//   13   27:aload_0         
	//   14   28:getfield        #83  <Field int mRouteTypes>
	//   15   31:aload_0         
	//   16   32:getfield        #75  <Field Object mCallbackObj>
	//   17   35:iconst_2        
	//   18   36:aload_0         
	//   19   37:getfield        #86  <Field boolean mActiveScan>
	//   20   40:ior             
	//   21   41:invokestatic    #90  <Method void MediaRouterJellybeanMr2.addCallback(Object, int, Object, int)>
	//   22   44:return          
	}

	protected void updateUserRouteProperties(rRouteRecord rrouterecord)
	{
		super.updateUserRouteProperties(rrouterecord);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #94  <Method void SystemMediaRouteProvider$JellybeanMr1Impl.updateUserRouteProperties(SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord)>
		MediaRouterJellybeanMr2.UserRouteInfo.setDescription(rrouterecord.mRouteObj, ((CharSequence) (rrouterecord.mRoute.getDescription())));
	//    3    5:aload_1         
	//    4    6:getfield        #97  <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
	//    5    9:aload_1         
	//    6   10:getfield        #101 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
	//    7   13:invokevirtual   #105 <Method String MediaRouter$RouteInfo.getDescription()>
	//    8   16:invokestatic    #110 <Method void MediaRouterJellybeanMr2$UserRouteInfo.setDescription(Object, CharSequence)>
	//    9   19:return          
	}

	public SystemMediaRouteProvider$JellybeanMr2Impl(Context context, SystemMediaRouteProvider.SyncCallback synccallback)
	{
		super(context, synccallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #14  <Method void SystemMediaRouteProvider$JellybeanMr1Impl(Context, SystemMediaRouteProvider$SyncCallback)>
	//    4    6:return          
	}
}
