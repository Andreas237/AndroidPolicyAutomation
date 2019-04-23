// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;


final class MediaRouterJellybeanMr1
{

	private MediaRouterJellybeanMr1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static Object createCallback(Callback callback)
	{
		return ((Object) (new CallbackProxy(callback)));
	//    0    0:new             #17  <Class MediaRouterJellybeanMr1$CallbackProxy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void MediaRouterJellybeanMr1$CallbackProxy(MediaRouterJellybeanMr1$Callback)>
	//    4    8:areturn         
	}

	private static final String TAG = "MediaRouterJellybeanMr1";

	private class CallbackProxy extends MediaRouterJellybean.CallbackProxy
	{

		public void onRoutePresentationDisplayChanged(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
		{
			((Callback)mCallback).onRoutePresentationDisplayChanged(((Object) (routeinfo)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaRouterJellybean$Callback mCallback>
		//    2    4:checkcast       #18  <Class MediaRouterJellybeanMr1$Callback>
		//    3    7:aload_2         
		//    4    8:invokeinterface #21  <Method void MediaRouterJellybeanMr1$Callback.onRoutePresentationDisplayChanged(Object)>
		//    5   13:return          
		}

		public CallbackProxy(Callback callback)
		{
			super(((MediaRouterJellybean.Callback) (callback)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #9   <Method void MediaRouterJellybean$CallbackProxy(MediaRouterJellybean$Callback)>
		//    3    5:return          
		}

		private class Callback
			implements MediaRouterJellybean.Callback
		{

			public abstract void onRoutePresentationDisplayChanged(Object obj);
		}

	}

}
