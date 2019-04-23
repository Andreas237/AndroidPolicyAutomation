// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.Context;

// Referenced classes of package android.support.v7.media:
//			MediaRouterJellybeanMr2, MediaRouterJellybean

class SystemMediaRouteProvider$JellybeanMr2Impl extends SystemMediaRouteProvider$JellybeanMr1Impl
{

	protected Object getDefaultRoute()
	{
		return MediaRouterJellybeanMr2.getDefaultRoute(mRouterObj);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Object mRouterObj>
	//    2    4:invokestatic    #20  <Method Object MediaRouterJellybeanMr2.getDefaultRoute(Object)>
	//    3    7:areturn         
	}

	protected boolean isConnecting(temRouteRecord temrouterecord)
	{
		return MediaRouterJellybeanMr2.RouteInfo.isConnecting(temrouterecord.mRouteObj);
	//    0    0:aload_1         
	//    1    1:getfield        #27  <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
	//    2    4:invokestatic    #32  <Method boolean MediaRouterJellybeanMr2$RouteInfo.isConnecting(Object)>
	//    3    7:ireturn         
	}

	protected void onBuildSystemRouteDescriptor(temRouteRecord temrouterecord, MediaRouteDescriptor.Builder builder)
	{
		super.onBuildSystemRouteDescriptor(temrouterecord, builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #36  <Method void SystemMediaRouteProvider$JellybeanMr1Impl.onBuildSystemRouteDescriptor(SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord, MediaRouteDescriptor$Builder)>
		temrouterecord = ((temRouteRecord) (MediaRouterJellybeanMr2.RouteInfo.getDescription(temrouterecord.mRouteObj)));
	//    4    6:aload_1         
	//    5    7:getfield        #27  <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
	//    6   10:invokestatic    #40  <Method CharSequence MediaRouterJellybeanMr2$RouteInfo.getDescription(Object)>
	//    7   13:astore_1        
		if(temrouterecord != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          29
			builder.setDescription(((CharSequence) (temrouterecord)).toString());
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokeinterface #46  <Method String CharSequence.toString()>
	//   13   25:invokevirtual   #52  <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setDescription(String)>
	//   14   28:pop             
	//   15   29:return          
	}

	protected void selectRoute(Object obj)
	{
		MediaRouterJellybean.selectRoute(mRouterObj, 0x800003, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Object mRouterObj>
	//    2    4:ldc1            #55  <Int 0x800003>
	//    3    6:aload_1         
	//    4    7:invokestatic    #60  <Method void MediaRouterJellybean.selectRoute(Object, int, Object)>
	//    5   10:return          
	}

	protected void updateCallback()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #64  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #66  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #71  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	protected void updateUserRouteProperties(rRouteRecord rrouterecord)
	{
		super.updateUserRouteProperties(rrouterecord);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #75  <Method void SystemMediaRouteProvider$JellybeanMr1Impl.updateUserRouteProperties(SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord)>
		MediaRouterJellybeanMr2.UserRouteInfo.setDescription(rrouterecord.mRouteObj, ((CharSequence) (rrouterecord.mRoute.getDescription())));
	//    3    5:aload_1         
	//    4    6:getfield        #78  <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
	//    5    9:aload_1         
	//    6   10:getfield        #82  <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
	//    7   13:invokevirtual   #86  <Method String MediaRouter$RouteInfo.getDescription()>
	//    8   16:invokestatic    #91  <Method void MediaRouterJellybeanMr2$UserRouteInfo.setDescription(Object, CharSequence)>
	//    9   19:return          
	}

	public SystemMediaRouteProvider$JellybeanMr2Impl(Context context, SystemMediaRouteProvider.SyncCallback synccallback)
	{
		super(context, synccallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void SystemMediaRouteProvider$JellybeanMr1Impl(Context, SystemMediaRouteProvider$SyncCallback)>
	//    4    6:return          
	}
}
