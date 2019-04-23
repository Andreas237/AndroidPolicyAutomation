// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.Context;

class SystemMediaRouteProvider$Api24Impl extends r2Impl
{

	protected void onBuildSystemRouteDescriptor(mpl.SystemRouteRecord systemrouterecord, MediaRouteDescriptor.Builder builder)
	{
		super.onBuildSystemRouteDescriptor(systemrouterecord, builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #13  <Method void SystemMediaRouteProvider$JellybeanMr2Impl.onBuildSystemRouteDescriptor(SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord, MediaRouteDescriptor$Builder)>
		builder.setDeviceType(MediaRouterApi24.RouteInfo.getDeviceType(systemrouterecord.mRouteObj));
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:getfield        #19  <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
	//    7   11:invokestatic    #25  <Method int MediaRouterApi24$RouteInfo.getDeviceType(Object)>
	//    8   14:invokevirtual   #31  <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setDeviceType(int)>
	//    9   17:pop             
	//   10   18:return          
	}

	public SystemMediaRouteProvider$Api24Impl(Context context, ck ck)
	{
		super(context, ck);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void SystemMediaRouteProvider$JellybeanMr2Impl(Context, SystemMediaRouteProvider$SyncCallback)>
	//    4    6:return          
	}
}
