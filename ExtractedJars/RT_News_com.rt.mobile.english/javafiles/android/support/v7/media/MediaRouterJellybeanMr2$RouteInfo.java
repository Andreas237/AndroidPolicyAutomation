// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;


// Referenced classes of package android.support.v7.media:
//			MediaRouterJellybeanMr2

public static final class MediaRouterJellybeanMr2$RouteInfo
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

	public MediaRouterJellybeanMr2$RouteInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
