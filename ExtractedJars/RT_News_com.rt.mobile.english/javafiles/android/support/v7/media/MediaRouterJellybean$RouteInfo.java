// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.Context;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.media:
//			MediaRouterJellybean

public static final class MediaRouterJellybean$RouteInfo
{

	public static Object getCategory(Object obj)
	{
		return ((Object) (((android.media.MediaRouter.RouteInfo)obj).getCategory()));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteInfo>
	//    2    4:invokevirtual   #19  <Method android.media.MediaRouter$RouteCategory android.media.MediaRouter$RouteInfo.getCategory()>
	//    3    7:areturn         
	}

	public static Object getGroup(Object obj)
	{
		return ((Object) (((android.media.MediaRouter.RouteInfo)obj).getGroup()));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteInfo>
	//    2    4:invokevirtual   #23  <Method android.media.MediaRouter$RouteGroup android.media.MediaRouter$RouteInfo.getGroup()>
	//    3    7:areturn         
	}

	public static Drawable getIconDrawable(Object obj)
	{
		return ((android.media.MediaRouter.RouteInfo)obj).getIconDrawable();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteInfo>
	//    2    4:invokevirtual   #28  <Method Drawable android.media.MediaRouter$RouteInfo.getIconDrawable()>
	//    3    7:areturn         
	}

	public static CharSequence getName(Object obj, Context context)
	{
		return ((android.media.MediaRouter.RouteInfo)obj).getName(context);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #33  <Method CharSequence android.media.MediaRouter$RouteInfo.getName(Context)>
	//    4    8:areturn         
	}

	public static int getPlaybackStream(Object obj)
	{
		return ((android.media.MediaRouter.RouteInfo)obj).getPlaybackStream();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteInfo>
	//    2    4:invokevirtual   #38  <Method int android.media.MediaRouter$RouteInfo.getPlaybackStream()>
	//    3    7:ireturn         
	}

	public static int getPlaybackType(Object obj)
	{
		return ((android.media.MediaRouter.RouteInfo)obj).getPlaybackType();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteInfo>
	//    2    4:invokevirtual   #41  <Method int android.media.MediaRouter$RouteInfo.getPlaybackType()>
	//    3    7:ireturn         
	}

	public static CharSequence getStatus(Object obj)
	{
		return ((android.media.MediaRouter.RouteInfo)obj).getStatus();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteInfo>
	//    2    4:invokevirtual   #46  <Method CharSequence android.media.MediaRouter$RouteInfo.getStatus()>
	//    3    7:areturn         
	}

	public static int getSupportedTypes(Object obj)
	{
		return ((android.media.MediaRouter.RouteInfo)obj).getSupportedTypes();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteInfo>
	//    2    4:invokevirtual   #49  <Method int android.media.MediaRouter$RouteInfo.getSupportedTypes()>
	//    3    7:ireturn         
	}

	public static Object getTag(Object obj)
	{
		return ((android.media.MediaRouter.RouteInfo)obj).getTag();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteInfo>
	//    2    4:invokevirtual   #53  <Method Object android.media.MediaRouter$RouteInfo.getTag()>
	//    3    7:areturn         
	}

	public static int getVolume(Object obj)
	{
		return ((android.media.MediaRouter.RouteInfo)obj).getVolume();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteInfo>
	//    2    4:invokevirtual   #56  <Method int android.media.MediaRouter$RouteInfo.getVolume()>
	//    3    7:ireturn         
	}

	public static int getVolumeHandling(Object obj)
	{
		return ((android.media.MediaRouter.RouteInfo)obj).getVolumeHandling();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteInfo>
	//    2    4:invokevirtual   #59  <Method int android.media.MediaRouter$RouteInfo.getVolumeHandling()>
	//    3    7:ireturn         
	}

	public static int getVolumeMax(Object obj)
	{
		return ((android.media.MediaRouter.RouteInfo)obj).getVolumeMax();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteInfo>
	//    2    4:invokevirtual   #62  <Method int android.media.MediaRouter$RouteInfo.getVolumeMax()>
	//    3    7:ireturn         
	}

	public static boolean isGroup(Object obj)
	{
		return obj instanceof android.media.MediaRouter.RouteGroup;
	//    0    0:aload_0         
	//    1    1:instanceof      #66  <Class android.media.MediaRouter$RouteGroup>
	//    2    4:ireturn         
	}

	public static void requestSetVolume(Object obj, int i)
	{
		((android.media.MediaRouter.RouteInfo)obj).requestSetVolume(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #71  <Method void android.media.MediaRouter$RouteInfo.requestSetVolume(int)>
	//    4    8:return          
	}

	public static void requestUpdateVolume(Object obj, int i)
	{
		((android.media.MediaRouter.RouteInfo)obj).requestUpdateVolume(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #74  <Method void android.media.MediaRouter$RouteInfo.requestUpdateVolume(int)>
	//    4    8:return          
	}

	public static void setTag(Object obj, Object obj1)
	{
		((android.media.MediaRouter.RouteInfo)obj).setTag(obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #79  <Method void android.media.MediaRouter$RouteInfo.setTag(Object)>
	//    4    8:return          
	}

	public MediaRouterJellybean$RouteInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
