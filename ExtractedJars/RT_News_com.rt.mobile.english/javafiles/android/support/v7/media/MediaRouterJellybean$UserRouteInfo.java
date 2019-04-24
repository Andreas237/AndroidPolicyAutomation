// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.graphics.drawable.Drawable;
import android.media.RemoteControlClient;

// Referenced classes of package android.support.v7.media:
//			MediaRouterJellybean

public static final class MediaRouterJellybean$UserRouteInfo
{

	public static void setIconDrawable(Object obj, Drawable drawable)
	{
		((android.media.MediaRouter.UserRouteInfo)obj).setIconDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$UserRouteInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #19  <Method void android.media.MediaRouter$UserRouteInfo.setIconDrawable(Drawable)>
	//    4    8:return          
	}

	public static void setName(Object obj, CharSequence charsequence)
	{
		((android.media.MediaRouter.UserRouteInfo)obj).setName(charsequence);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$UserRouteInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #24  <Method void android.media.MediaRouter$UserRouteInfo.setName(CharSequence)>
	//    4    8:return          
	}

	public static void setPlaybackStream(Object obj, int i)
	{
		((android.media.MediaRouter.UserRouteInfo)obj).setPlaybackStream(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$UserRouteInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #29  <Method void android.media.MediaRouter$UserRouteInfo.setPlaybackStream(int)>
	//    4    8:return          
	}

	public static void setPlaybackType(Object obj, int i)
	{
		((android.media.MediaRouter.UserRouteInfo)obj).setPlaybackType(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$UserRouteInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #32  <Method void android.media.MediaRouter$UserRouteInfo.setPlaybackType(int)>
	//    4    8:return          
	}

	public static void setRemoteControlClient(Object obj, Object obj1)
	{
		((android.media.MediaRouter.UserRouteInfo)obj).setRemoteControlClient((RemoteControlClient)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$UserRouteInfo>
	//    2    4:aload_1         
	//    3    5:checkcast       #36  <Class RemoteControlClient>
	//    4    8:invokevirtual   #39  <Method void android.media.MediaRouter$UserRouteInfo.setRemoteControlClient(RemoteControlClient)>
	//    5   11:return          
	}

	public static void setStatus(Object obj, CharSequence charsequence)
	{
		((android.media.MediaRouter.UserRouteInfo)obj).setStatus(charsequence);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$UserRouteInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #42  <Method void android.media.MediaRouter$UserRouteInfo.setStatus(CharSequence)>
	//    4    8:return          
	}

	public static void setVolume(Object obj, int i)
	{
		((android.media.MediaRouter.UserRouteInfo)obj).setVolume(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$UserRouteInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #45  <Method void android.media.MediaRouter$UserRouteInfo.setVolume(int)>
	//    4    8:return          
	}

	public static void setVolumeCallback(Object obj, Object obj1)
	{
		((android.media.MediaRouter.UserRouteInfo)obj).setVolumeCallback((android.media.MediaRouter.VolumeCallback)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$UserRouteInfo>
	//    2    4:aload_1         
	//    3    5:checkcast       #48  <Class android.media.MediaRouter$VolumeCallback>
	//    4    8:invokevirtual   #51  <Method void android.media.MediaRouter$UserRouteInfo.setVolumeCallback(android.media.MediaRouter$VolumeCallback)>
	//    5   11:return          
	}

	public static void setVolumeHandling(Object obj, int i)
	{
		((android.media.MediaRouter.UserRouteInfo)obj).setVolumeHandling(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$UserRouteInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #54  <Method void android.media.MediaRouter$UserRouteInfo.setVolumeHandling(int)>
	//    4    8:return          
	}

	public static void setVolumeMax(Object obj, int i)
	{
		((android.media.MediaRouter.UserRouteInfo)obj).setVolumeMax(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$UserRouteInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #57  <Method void android.media.MediaRouter$UserRouteInfo.setVolumeMax(int)>
	//    4    8:return          
	}

	public MediaRouterJellybean$UserRouteInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
