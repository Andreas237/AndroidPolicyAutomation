// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;


class MediaRouterJellybean$VolumeCallbackProxy extends android.media.MediaRouter.VolumeCallback
{

	public void onVolumeSetRequest(android.media.MediaRouter.RouteInfo routeinfo, int i)
	{
		mCallback.onVolumeSetRequest(((Object) (routeinfo)), i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field MediaRouterJellybean$VolumeCallback mCallback>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #21  <Method void MediaRouterJellybean$VolumeCallback.onVolumeSetRequest(Object, int)>
	//    5   11:return          
	}

	public void onVolumeUpdateRequest(android.media.MediaRouter.RouteInfo routeinfo, int i)
	{
		mCallback.onVolumeUpdateRequest(((Object) (routeinfo)), i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field MediaRouterJellybean$VolumeCallback mCallback>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #24  <Method void MediaRouterJellybean$VolumeCallback.onVolumeUpdateRequest(Object, int)>
	//    5   11:return          
	}

	protected final MediaRouterJellybean.VolumeCallback mCallback;

	public MediaRouterJellybean$VolumeCallbackProxy(MediaRouterJellybean.VolumeCallback volumecallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void android.media.MediaRouter$VolumeCallback()>
		mCallback = volumecallback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field MediaRouterJellybean$VolumeCallback mCallback>
	//    5    9:return          
	}
}
