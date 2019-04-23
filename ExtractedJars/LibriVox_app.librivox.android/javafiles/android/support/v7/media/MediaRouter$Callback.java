// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;


// Referenced classes of package android.support.v7.media:
//			MediaRouter

public abstract class MediaRouter$Callback
{

	public void onProviderAdded(MediaRouter mediarouter, nfo nfo)
	{
	//    0    0:return          
	}

	public void onProviderChanged(MediaRouter mediarouter, nfo nfo)
	{
	//    0    0:return          
	}

	public void onProviderRemoved(MediaRouter mediarouter, nfo nfo)
	{
	//    0    0:return          
	}

	public void onRouteAdded(MediaRouter mediarouter,  )
	{
	//    0    0:return          
	}

	public void onRouteChanged(MediaRouter mediarouter,  )
	{
	//    0    0:return          
	}

	public void onRoutePresentationDisplayChanged(MediaRouter mediarouter,  )
	{
	//    0    0:return          
	}

	public void onRouteRemoved(MediaRouter mediarouter,  )
	{
	//    0    0:return          
	}

	public void onRouteSelected(MediaRouter mediarouter,  )
	{
	//    0    0:return          
	}

	public void onRouteUnselected(MediaRouter mediarouter,  )
	{
	//    0    0:return          
	}

	public void onRouteUnselected(MediaRouter mediarouter,  , int i)
	{
		onRouteUnselected(mediarouter, );
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #23  <Method void onRouteUnselected(MediaRouter, MediaRouter$RouteInfo)>
	//    4    6:return          
	}

	public void onRouteVolumeChanged(MediaRouter mediarouter,  )
	{
	//    0    0:return          
	}

	public MediaRouter$Callback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}
}
