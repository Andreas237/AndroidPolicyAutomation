// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaRouter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

final class MediaRouterJellybean
{

	private MediaRouterJellybean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public static void addCallback(Object obj, int i, Object obj1)
	{
		((MediaRouter)obj).addCallback(i, (android.media.MediaRouter.Callback)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaRouter>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:checkcast       #30  <Class android.media.MediaRouter$Callback>
	//    5    9:invokevirtual   #33  <Method void MediaRouter.addCallback(int, android.media.MediaRouter$Callback)>
	//    6   12:return          
	}

	public static void addUserRoute(Object obj, Object obj1)
	{
		((MediaRouter)obj).addUserRoute((android.media.MediaRouter.UserRouteInfo)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaRouter>
	//    2    4:aload_1         
	//    3    5:checkcast       #37  <Class android.media.MediaRouter$UserRouteInfo>
	//    4    8:invokevirtual   #40  <Method void MediaRouter.addUserRoute(android.media.MediaRouter$UserRouteInfo)>
	//    5   11:return          
	}

	static boolean checkRoutedToBluetooth(Context context)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i;
		try
		{
			context = ((Context) ((AudioManager)context.getSystemService("audio")));
	//    2    2:aload_0         
	//    3    3:ldc1            #46  <String "audio">
	//    4    5:invokevirtual   #52  <Method Object Context.getSystemService(String)>
	//    5    8:checkcast       #54  <Class AudioManager>
	//    6   11:astore_0        
			i = ((Integer)((Object) (context)).getClass().getDeclaredMethod("getDevicesForStream", new Class[] {
				Integer.TYPE
			}).invoke(((Object) (context)), new Object[] {
				Integer.valueOf(3)
			})).intValue();
	//    7   12:aload_0         
	//    8   13:invokevirtual   #58  <Method Class Object.getClass()>
	//    9   16:ldc1            #60  <String "getDevicesForStream">
	//   10   18:iconst_1        
	//   11   19:anewarray       Class[]
	//   12   22:dup             
	//   13   23:iconst_0        
	//   14   24:getstatic       #68  <Field Class Integer.TYPE>
	//   15   27:aastore         
	//   16   28:invokevirtual   #72  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   17   31:aload_0         
	//   18   32:iconst_1        
	//   19   33:anewarray       Object[]
	//   20   36:dup             
	//   21   37:iconst_0        
	//   22   38:iconst_3        
	//   23   39:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   24   42:aastore         
	//   25   43:invokevirtual   #82  <Method Object Method.invoke(Object, Object[])>
	//   26   46:checkcast       #64  <Class Integer>
	//   27   49:invokevirtual   #86  <Method int Integer.intValue()>
	//   28   52:istore_1        
		}
	//*  29   53:iload_1         
	//*  30   54:sipush          896
	//*  31   57:iand            
	//*  32   58:ifeq            63
	//*  33   61:iconst_1        
	//*  34   62:istore_2        
	//*  35   63:iload_2         
	//*  36   64:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  37   65:astore_0        
		{
			return false;
	//   38   66:iconst_0        
	//   39   67:ireturn         
		}
		if((i & 0x380) != 0)
			flag = true;
		return flag;
	}

	public static Object createCallback(Callback callback)
	{
		return ((Object) (new CallbackProxy(callback)));
	//    0    0:new             #90  <Class MediaRouterJellybean$CallbackProxy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #93  <Method void MediaRouterJellybean$CallbackProxy(MediaRouterJellybean$Callback)>
	//    4    8:areturn         
	}

	public static Object createRouteCategory(Object obj, String s, boolean flag)
	{
		return ((Object) (((MediaRouter)obj).createRouteCategory(((CharSequence) (s)), flag)));
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaRouter>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #98  <Method android.media.MediaRouter$RouteCategory MediaRouter.createRouteCategory(CharSequence, boolean)>
	//    5    9:areturn         
	}

	public static Object createUserRoute(Object obj, Object obj1)
	{
		return ((Object) (((MediaRouter)obj).createUserRoute((android.media.MediaRouter.RouteCategory)obj1)));
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaRouter>
	//    2    4:aload_1         
	//    3    5:checkcast       #102 <Class android.media.MediaRouter$RouteCategory>
	//    4    8:invokevirtual   #105 <Method android.media.MediaRouter$UserRouteInfo MediaRouter.createUserRoute(android.media.MediaRouter$RouteCategory)>
	//    5   11:areturn         
	}

	public static Object createVolumeCallback(VolumeCallback volumecallback)
	{
		return ((Object) (new VolumeCallbackProxy(volumecallback)));
	//    0    0:new             #109 <Class MediaRouterJellybean$VolumeCallbackProxy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #112 <Method void MediaRouterJellybean$VolumeCallbackProxy(MediaRouterJellybean$VolumeCallback)>
	//    4    8:areturn         
	}

	public static List getCategories(Object obj)
	{
		obj = ((Object) ((MediaRouter)obj));
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaRouter>
	//    2    4:astore_0        
		int j = ((MediaRouter) (obj)).getCategoryCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #117 <Method int MediaRouter.getCategoryCount()>
	//    5    9:istore_2        
		ArrayList arraylist = new ArrayList(j);
	//    6   10:new             #119 <Class ArrayList>
	//    7   13:dup             
	//    8   14:iload_2         
	//    9   15:invokespecial   #122 <Method void ArrayList(int)>
	//   10   18:astore_3        
		for(int i = 0; i < j; i++)
	//*  11   19:iconst_0        
	//*  12   20:istore_1        
	//*  13   21:iload_1         
	//*  14   22:iload_2         
	//*  15   23:icmpge          45
			((List) (arraylist)).add(((Object) (((MediaRouter) (obj)).getCategoryAt(i))));
	//   16   26:aload_3         
	//   17   27:aload_0         
	//   18   28:iload_1         
	//   19   29:invokevirtual   #126 <Method android.media.MediaRouter$RouteCategory MediaRouter.getCategoryAt(int)>
	//   20   32:invokeinterface #132 <Method boolean List.add(Object)>
	//   21   37:pop             

	//   22   38:iload_1         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_1        
	//*  26   42:goto            21
		return ((List) (arraylist));
	//   27   45:aload_3         
	//   28   46:areturn         
	}

	public static Object getMediaRouter(Context context)
	{
		return context.getSystemService("media_router");
	//    0    0:aload_0         
	//    1    1:ldc1            #136 <String "media_router">
	//    2    3:invokevirtual   #52  <Method Object Context.getSystemService(String)>
	//    3    6:areturn         
	}

	public static List getRoutes(Object obj)
	{
		obj = ((Object) ((MediaRouter)obj));
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaRouter>
	//    2    4:astore_0        
		int j = ((MediaRouter) (obj)).getRouteCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #140 <Method int MediaRouter.getRouteCount()>
	//    5    9:istore_2        
		ArrayList arraylist = new ArrayList(j);
	//    6   10:new             #119 <Class ArrayList>
	//    7   13:dup             
	//    8   14:iload_2         
	//    9   15:invokespecial   #122 <Method void ArrayList(int)>
	//   10   18:astore_3        
		for(int i = 0; i < j; i++)
	//*  11   19:iconst_0        
	//*  12   20:istore_1        
	//*  13   21:iload_1         
	//*  14   22:iload_2         
	//*  15   23:icmpge          45
			((List) (arraylist)).add(((Object) (((MediaRouter) (obj)).getRouteAt(i))));
	//   16   26:aload_3         
	//   17   27:aload_0         
	//   18   28:iload_1         
	//   19   29:invokevirtual   #144 <Method android.media.MediaRouter$RouteInfo MediaRouter.getRouteAt(int)>
	//   20   32:invokeinterface #132 <Method boolean List.add(Object)>
	//   21   37:pop             

	//   22   38:iload_1         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_1        
	//*  26   42:goto            21
		return ((List) (arraylist));
	//   27   45:aload_3         
	//   28   46:areturn         
	}

	public static Object getSelectedRoute(Object obj, int i)
	{
		return ((Object) (((MediaRouter)obj).getSelectedRoute(i)));
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaRouter>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #148 <Method android.media.MediaRouter$RouteInfo MediaRouter.getSelectedRoute(int)>
	//    4    8:areturn         
	}

	public static void removeCallback(Object obj, Object obj1)
	{
		((MediaRouter)obj).removeCallback((android.media.MediaRouter.Callback)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaRouter>
	//    2    4:aload_1         
	//    3    5:checkcast       #30  <Class android.media.MediaRouter$Callback>
	//    4    8:invokevirtual   #152 <Method void MediaRouter.removeCallback(android.media.MediaRouter$Callback)>
	//    5   11:return          
	}

	public static void removeUserRoute(Object obj, Object obj1)
	{
		((MediaRouter)obj).removeUserRoute((android.media.MediaRouter.UserRouteInfo)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaRouter>
	//    2    4:aload_1         
	//    3    5:checkcast       #37  <Class android.media.MediaRouter$UserRouteInfo>
	//    4    8:invokevirtual   #155 <Method void MediaRouter.removeUserRoute(android.media.MediaRouter$UserRouteInfo)>
	//    5   11:return          
	}

	public static void selectRoute(Object obj, int i, Object obj1)
	{
		((MediaRouter)obj).selectRoute(i, (android.media.MediaRouter.RouteInfo)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaRouter>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:checkcast       #158 <Class android.media.MediaRouter$RouteInfo>
	//    5    9:invokevirtual   #161 <Method void MediaRouter.selectRoute(int, android.media.MediaRouter$RouteInfo)>
	//    6   12:return          
	}

	public static final int ALL_ROUTE_TYPES = 0x800003;
	public static final int DEVICE_OUT_BLUETOOTH = 896;
	public static final int ROUTE_TYPE_LIVE_AUDIO = 1;
	public static final int ROUTE_TYPE_LIVE_VIDEO = 2;
	public static final int ROUTE_TYPE_USER = 0x800000;
	private static final String TAG = "MediaRouterJellybean";

	private class CallbackProxy extends android.media.MediaRouter.Callback
	{

		public void onRouteAdded(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
		{
			mCallback.onRouteAdded(((Object) (routeinfo)));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouterJellybean$Callback mCallback>
		//    2    4:aload_2         
		//    3    5:invokeinterface #21  <Method void MediaRouterJellybean$Callback.onRouteAdded(Object)>
		//    4   10:return          
		}

		public void onRouteChanged(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
		{
			mCallback.onRouteChanged(((Object) (routeinfo)));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouterJellybean$Callback mCallback>
		//    2    4:aload_2         
		//    3    5:invokeinterface #24  <Method void MediaRouterJellybean$Callback.onRouteChanged(Object)>
		//    4   10:return          
		}

		public void onRouteGrouped(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo, android.media.MediaRouter.RouteGroup routegroup, int i)
		{
			mCallback.onRouteGrouped(((Object) (routeinfo)), ((Object) (routegroup)), i);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouterJellybean$Callback mCallback>
		//    2    4:aload_2         
		//    3    5:aload_3         
		//    4    6:iload           4
		//    5    8:invokeinterface #29  <Method void MediaRouterJellybean$Callback.onRouteGrouped(Object, Object, int)>
		//    6   13:return          
		}

		public void onRouteRemoved(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
		{
			mCallback.onRouteRemoved(((Object) (routeinfo)));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouterJellybean$Callback mCallback>
		//    2    4:aload_2         
		//    3    5:invokeinterface #32  <Method void MediaRouterJellybean$Callback.onRouteRemoved(Object)>
		//    4   10:return          
		}

		public void onRouteSelected(MediaRouter mediarouter, int i, android.media.MediaRouter.RouteInfo routeinfo)
		{
			mCallback.onRouteSelected(i, ((Object) (routeinfo)));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouterJellybean$Callback mCallback>
		//    2    4:iload_2         
		//    3    5:aload_3         
		//    4    6:invokeinterface #37  <Method void MediaRouterJellybean$Callback.onRouteSelected(int, Object)>
		//    5   11:return          
		}

		public void onRouteUngrouped(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo, android.media.MediaRouter.RouteGroup routegroup)
		{
			mCallback.onRouteUngrouped(((Object) (routeinfo)), ((Object) (routegroup)));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouterJellybean$Callback mCallback>
		//    2    4:aload_2         
		//    3    5:aload_3         
		//    4    6:invokeinterface #42  <Method void MediaRouterJellybean$Callback.onRouteUngrouped(Object, Object)>
		//    5   11:return          
		}

		public void onRouteUnselected(MediaRouter mediarouter, int i, android.media.MediaRouter.RouteInfo routeinfo)
		{
			mCallback.onRouteUnselected(i, ((Object) (routeinfo)));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouterJellybean$Callback mCallback>
		//    2    4:iload_2         
		//    3    5:aload_3         
		//    4    6:invokeinterface #45  <Method void MediaRouterJellybean$Callback.onRouteUnselected(int, Object)>
		//    5   11:return          
		}

		public void onRouteVolumeChanged(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
		{
			mCallback.onRouteVolumeChanged(((Object) (routeinfo)));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouterJellybean$Callback mCallback>
		//    2    4:aload_2         
		//    3    5:invokeinterface #48  <Method void MediaRouterJellybean$Callback.onRouteVolumeChanged(Object)>
		//    4   10:return          
		}

		protected final Callback mCallback;

		public CallbackProxy(Callback callback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void android.media.MediaRouter$Callback()>
			mCallback = callback;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #13  <Field MediaRouterJellybean$Callback mCallback>
		//    5    9:return          
		}

		private class Callback
		{

			public abstract void onRouteAdded(Object obj);

			public abstract void onRouteChanged(Object obj);

			public abstract void onRouteGrouped(Object obj, Object obj1, int i);

			public abstract void onRouteRemoved(Object obj);

			public abstract void onRouteSelected(int i, Object obj);

			public abstract void onRouteUngrouped(Object obj, Object obj1);

			public abstract void onRouteUnselected(int i, Object obj);

			public abstract void onRouteVolumeChanged(Object obj);
		}

	}


	private class VolumeCallbackProxy extends android.media.MediaRouter.VolumeCallback
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

		protected final VolumeCallback mCallback;

		public VolumeCallbackProxy(VolumeCallback volumecallback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void android.media.MediaRouter$VolumeCallback()>
			mCallback = volumecallback;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #13  <Field MediaRouterJellybean$VolumeCallback mCallback>
		//    5    9:return          
		}

		private class VolumeCallback
		{

			public abstract void onVolumeSetRequest(Object obj, int i);

			public abstract void onVolumeUpdateRequest(Object obj, int i);
		}

	}

}
