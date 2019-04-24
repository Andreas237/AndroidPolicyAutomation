// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.*;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

final class MediaRouterJellybean
{
	public static interface Callback
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

	static class CallbackProxy extends android.media.MediaRouter.Callback
	{

		public void onRouteAdded(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
		{
			mCallback.onRouteAdded(((Object) (routeinfo)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaRouterJellybean$Callback mCallback>
		//    2    4:aload_2         
		//    3    5:invokeinterface #28  <Method void MediaRouterJellybean$Callback.onRouteAdded(Object)>
		//    4   10:return          
		}

		public void onRouteChanged(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
		{
			mCallback.onRouteChanged(((Object) (routeinfo)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaRouterJellybean$Callback mCallback>
		//    2    4:aload_2         
		//    3    5:invokeinterface #31  <Method void MediaRouterJellybean$Callback.onRouteChanged(Object)>
		//    4   10:return          
		}

		public void onRouteGrouped(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo, android.media.MediaRouter.RouteGroup routegroup, int i)
		{
			mCallback.onRouteGrouped(((Object) (routeinfo)), ((Object) (routegroup)), i);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaRouterJellybean$Callback mCallback>
		//    2    4:aload_2         
		//    3    5:aload_3         
		//    4    6:iload           4
		//    5    8:invokeinterface #36  <Method void MediaRouterJellybean$Callback.onRouteGrouped(Object, Object, int)>
		//    6   13:return          
		}

		public void onRouteRemoved(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
		{
			mCallback.onRouteRemoved(((Object) (routeinfo)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaRouterJellybean$Callback mCallback>
		//    2    4:aload_2         
		//    3    5:invokeinterface #39  <Method void MediaRouterJellybean$Callback.onRouteRemoved(Object)>
		//    4   10:return          
		}

		public void onRouteSelected(MediaRouter mediarouter, int i, android.media.MediaRouter.RouteInfo routeinfo)
		{
			mCallback.onRouteSelected(i, ((Object) (routeinfo)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaRouterJellybean$Callback mCallback>
		//    2    4:iload_2         
		//    3    5:aload_3         
		//    4    6:invokeinterface #44  <Method void MediaRouterJellybean$Callback.onRouteSelected(int, Object)>
		//    5   11:return          
		}

		public void onRouteUngrouped(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo, android.media.MediaRouter.RouteGroup routegroup)
		{
			mCallback.onRouteUngrouped(((Object) (routeinfo)), ((Object) (routegroup)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaRouterJellybean$Callback mCallback>
		//    2    4:aload_2         
		//    3    5:aload_3         
		//    4    6:invokeinterface #49  <Method void MediaRouterJellybean$Callback.onRouteUngrouped(Object, Object)>
		//    5   11:return          
		}

		public void onRouteUnselected(MediaRouter mediarouter, int i, android.media.MediaRouter.RouteInfo routeinfo)
		{
			mCallback.onRouteUnselected(i, ((Object) (routeinfo)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaRouterJellybean$Callback mCallback>
		//    2    4:iload_2         
		//    3    5:aload_3         
		//    4    6:invokeinterface #52  <Method void MediaRouterJellybean$Callback.onRouteUnselected(int, Object)>
		//    5   11:return          
		}

		public void onRouteVolumeChanged(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
		{
			mCallback.onRouteVolumeChanged(((Object) (routeinfo)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaRouterJellybean$Callback mCallback>
		//    2    4:aload_2         
		//    3    5:invokeinterface #55  <Method void MediaRouterJellybean$Callback.onRouteVolumeChanged(Object)>
		//    4   10:return          
		}

		protected final Callback mCallback;

		public CallbackProxy(Callback callback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void android.media.MediaRouter$Callback()>
			mCallback = callback;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field MediaRouterJellybean$Callback mCallback>
		//    5    9:return          
		}
	}

	public static final class GetDefaultRouteWorkaround
	{

		public Object getDefaultRoute(Object obj)
		{
			obj = ((Object) ((MediaRouter)obj));
		//    0    0:aload_1         
		//    1    1:checkcast       #23  <Class MediaRouter>
		//    2    4:astore_1        
			if(mGetSystemAudioRouteMethod == null)
				break MISSING_BLOCK_LABEL_27;
		//    3    5:aload_0         
		//    4    6:getfield        #33  <Field Method mGetSystemAudioRouteMethod>
		//    5    9:ifnull          27
			Object obj1 = mGetSystemAudioRouteMethod.invoke(obj, new Object[0]);
		//    6   12:aload_0         
		//    7   13:getfield        #33  <Field Method mGetSystemAudioRouteMethod>
		//    8   16:aload_1         
		//    9   17:iconst_0        
		//   10   18:anewarray       Object[]
		//   11   21:invokevirtual   #49  <Method Object Method.invoke(Object, Object[])>
		//   12   24:astore_2        
			return obj1;
		//   13   25:aload_2         
		//   14   26:areturn         
_L2:
			return ((Object) (((MediaRouter) (obj)).getRouteAt(0)));
		//   15   27:aload_1         
		//   16   28:iconst_0        
		//   17   29:invokevirtual   #53  <Method android.media.MediaRouter$RouteInfo MediaRouter.getRouteAt(int)>
		//   18   32:areturn         
			Object obj2;
			obj2;
		//   19   33:astore_2        
			if(true) goto _L2; else goto _L1
_L1:
		//*  20   34:goto            27
		}

		private Method mGetSystemAudioRouteMethod;

		public GetDefaultRouteWorkaround()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT <= 17)
		//*   2    4:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          16
		//*   4    9:icmplt          39
		//*   5   12:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
		//*   6   15:bipush          17
		//*   7   17:icmple          23
		//*   8   20:goto            39
				try
				{
					mGetSystemAudioRouteMethod = ((Class) (android/media/MediaRouter)).getMethod("getSystemAudioRoute", new Class[0]);
		//    9   23:aload_0         
		//   10   24:ldc1            #23  <Class MediaRouter>
		//   11   26:ldc1            #25  <String "getSystemAudioRoute">
		//   12   28:iconst_0        
		//   13   29:anewarray       Class[]
		//   14   32:invokevirtual   #31  <Method Method Class.getMethod(String, Class[])>
		//   15   35:putfield        #33  <Field Method mGetSystemAudioRouteMethod>
					return;
		//   16   38:return          
				}
		//*  17   39:new             #35  <Class UnsupportedOperationException>
		//*  18   42:dup             
		//*  19   43:invokespecial   #36  <Method void UnsupportedOperationException()>
		//*  20   46:athrow          
				catch(NoSuchMethodException nosuchmethodexception)
		//*  21   47:astore_1        
				{
					return;
		//   22   48:return          
				}
			else
				throw new UnsupportedOperationException();
		}
	}

	public static final class RouteCategory
	{

		public static CharSequence getName(Object obj, Context context)
		{
			return ((android.media.MediaRouter.RouteCategory)obj).getName(context);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteCategory>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #19  <Method CharSequence android.media.MediaRouter$RouteCategory.getName(Context)>
		//    4    8:areturn         
		}

		public static List getRoutes(Object obj)
		{
			ArrayList arraylist = new ArrayList();
		//    0    0:new             #23  <Class ArrayList>
		//    1    3:dup             
		//    2    4:invokespecial   #24  <Method void ArrayList()>
		//    3    7:astore_1        
			((android.media.MediaRouter.RouteCategory)obj).getRoutes(((List) (arraylist)));
		//    4    8:aload_0         
		//    5    9:checkcast       #16  <Class android.media.MediaRouter$RouteCategory>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #27  <Method List android.media.MediaRouter$RouteCategory.getRoutes(List)>
		//    8   16:pop             
			return ((List) (arraylist));
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public static int getSupportedTypes(Object obj)
		{
			return ((android.media.MediaRouter.RouteCategory)obj).getSupportedTypes();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteCategory>
		//    2    4:invokevirtual   #32  <Method int android.media.MediaRouter$RouteCategory.getSupportedTypes()>
		//    3    7:ireturn         
		}

		public static boolean isGroupable(Object obj)
		{
			return ((android.media.MediaRouter.RouteCategory)obj).isGroupable();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteCategory>
		//    2    4:invokevirtual   #37  <Method boolean android.media.MediaRouter$RouteCategory.isGroupable()>
		//    3    7:ireturn         
		}

		public RouteCategory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class RouteGroup
	{

		public static List getGroupedRoutes(Object obj)
		{
			obj = ((Object) ((android.media.MediaRouter.RouteGroup)obj));
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteGroup>
		//    2    4:astore_0        
			int j = ((android.media.MediaRouter.RouteGroup) (obj)).getRouteCount();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #20  <Method int android.media.MediaRouter$RouteGroup.getRouteCount()>
		//    5    9:istore_2        
			ArrayList arraylist = new ArrayList(j);
		//    6   10:new             #22  <Class ArrayList>
		//    7   13:dup             
		//    8   14:iload_2         
		//    9   15:invokespecial   #25  <Method void ArrayList(int)>
		//   10   18:astore_3        
			for(int i = 0; i < j; i++)
		//*  11   19:iconst_0        
		//*  12   20:istore_1        
		//*  13   21:iload_1         
		//*  14   22:iload_2         
		//*  15   23:icmpge          45
				((List) (arraylist)).add(((Object) (((android.media.MediaRouter.RouteGroup) (obj)).getRouteAt(i))));
		//   16   26:aload_3         
		//   17   27:aload_0         
		//   18   28:iload_1         
		//   19   29:invokevirtual   #29  <Method android.media.MediaRouter$RouteInfo android.media.MediaRouter$RouteGroup.getRouteAt(int)>
		//   20   32:invokeinterface #35  <Method boolean List.add(Object)>
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

		public RouteGroup()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class RouteInfo
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

		public RouteInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class SelectRouteWorkaround
	{

		public void selectRoute(Object obj, int i, Object obj1)
		{
			obj = ((Object) ((MediaRouter)obj));
		//    0    0:aload_1         
		//    1    1:checkcast       #23  <Class MediaRouter>
		//    2    4:astore_1        
			obj1 = ((Object) ((android.media.MediaRouter.RouteInfo)obj1));
		//    3    5:aload_3         
		//    4    6:checkcast       #35  <Class android.media.MediaRouter$RouteInfo>
		//    5    9:astore_3        
			if((((android.media.MediaRouter.RouteInfo) (obj1)).getSupportedTypes() & 0x800000) == 0)
		//*   6   10:aload_3         
		//*   7   11:invokevirtual   #55  <Method int android.media.MediaRouter$RouteInfo.getSupportedTypes()>
		//*   8   14:ldc1            #56  <Int 0x800000>
		//*   9   16:iand            
		//*  10   17:ifne            90
				if(mSelectRouteIntMethod != null)
		//*  11   20:aload_0         
		//*  12   21:getfield        #41  <Field Method mSelectRouteIntMethod>
		//*  13   24:ifnull          82
					try
					{
						mSelectRouteIntMethod.invoke(obj, new Object[] {
							Integer.valueOf(i), obj1
						});
		//   14   27:aload_0         
		//   15   28:getfield        #41  <Field Method mSelectRouteIntMethod>
		//   16   31:aload_1         
		//   17   32:iconst_2        
		//   18   33:anewarray       Object[]
		//   19   36:dup             
		//   20   37:iconst_0        
		//   21   38:iload_2         
		//   22   39:invokestatic    #60  <Method Integer Integer.valueOf(int)>
		//   23   42:aastore         
		//   24   43:dup             
		//   25   44:iconst_1        
		//   26   45:aload_3         
		//   27   46:aastore         
		//   28   47:invokevirtual   #66  <Method Object Method.invoke(Object, Object[])>
		//   29   50:pop             
						return;
		//   30   51:return          
					}
		//*  31   52:astore          4
		//*  32   54:ldc1            #68  <String "MediaRouterJellybean">
		//*  33   56:ldc1            #70  <String "Cannot programmatically select non-user route.  Media routing may not work.">
		//*  34   58:aload           4
		//*  35   60:invokestatic    #76  <Method int Log.w(String, String, Throwable)>
		//*  36   63:pop             
		//*  37   64:goto            90
					catch(IllegalAccessException illegalaccessexception)
		//*  38   67:astore          4
					{
						Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", ((Throwable) (illegalaccessexception)));
		//   39   69:ldc1            #68  <String "MediaRouterJellybean">
		//   40   71:ldc1            #70  <String "Cannot programmatically select non-user route.  Media routing may not work.">
		//   41   73:aload           4
		//   42   75:invokestatic    #76  <Method int Log.w(String, String, Throwable)>
		//   43   78:pop             
					}
					catch(InvocationTargetException invocationtargetexception)
					{
						Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", ((Throwable) (invocationtargetexception)));
					}
				else
		//*  44   79:goto            90
					Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
		//   45   82:ldc1            #68  <String "MediaRouterJellybean">
		//   46   84:ldc1            #78  <String "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.">
		//   47   86:invokestatic    #81  <Method int Log.w(String, String)>
		//   48   89:pop             
			((MediaRouter) (obj)).selectRoute(i, ((android.media.MediaRouter.RouteInfo) (obj1)));
		//   49   90:aload_1         
		//   50   91:iload_2         
		//   51   92:aload_3         
		//   52   93:invokevirtual   #84  <Method void MediaRouter.selectRoute(int, android.media.MediaRouter$RouteInfo)>
		//   53   96:return          
		}

		private Method mSelectRouteIntMethod;

		public SelectRouteWorkaround()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT <= 17)
		//*   2    4:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          16
		//*   4    9:icmplt          50
		//*   5   12:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
		//*   6   15:bipush          17
		//*   7   17:icmple          23
		//*   8   20:goto            50
				try
				{
					mSelectRouteIntMethod = ((Class) (android/media/MediaRouter)).getMethod("selectRouteInt", new Class[] {
						Integer.TYPE, android/media/MediaRouter$RouteInfo
					});
		//    9   23:aload_0         
		//   10   24:ldc1            #23  <Class MediaRouter>
		//   11   26:ldc1            #25  <String "selectRouteInt">
		//   12   28:iconst_2        
		//   13   29:anewarray       Class[]
		//   14   32:dup             
		//   15   33:iconst_0        
		//   16   34:getstatic       #33  <Field Class Integer.TYPE>
		//   17   37:aastore         
		//   18   38:dup             
		//   19   39:iconst_1        
		//   20   40:ldc1            #35  <Class android.media.MediaRouter$RouteInfo>
		//   21   42:aastore         
		//   22   43:invokevirtual   #39  <Method Method Class.getMethod(String, Class[])>
		//   23   46:putfield        #41  <Field Method mSelectRouteIntMethod>
					return;
		//   24   49:return          
				}
		//*  25   50:new             #43  <Class UnsupportedOperationException>
		//*  26   53:dup             
		//*  27   54:invokespecial   #44  <Method void UnsupportedOperationException()>
		//*  28   57:athrow          
				catch(NoSuchMethodException nosuchmethodexception)
		//*  29   58:astore_1        
				{
					return;
		//   30   59:return          
				}
			else
				throw new UnsupportedOperationException();
		}
	}

	public static final class UserRouteInfo
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

		public UserRouteInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface VolumeCallback
	{

		public abstract void onVolumeSetRequest(Object obj, int i);

		public abstract void onVolumeUpdateRequest(Object obj, int i);
	}

	static class VolumeCallbackProxy extends android.media.MediaRouter.VolumeCallback
	{

		public void onVolumeSetRequest(android.media.MediaRouter.RouteInfo routeinfo, int i)
		{
			mCallback.onVolumeSetRequest(((Object) (routeinfo)), i);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaRouterJellybean$VolumeCallback mCallback>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokeinterface #28  <Method void MediaRouterJellybean$VolumeCallback.onVolumeSetRequest(Object, int)>
		//    5   11:return          
		}

		public void onVolumeUpdateRequest(android.media.MediaRouter.RouteInfo routeinfo, int i)
		{
			mCallback.onVolumeUpdateRequest(((Object) (routeinfo)), i);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaRouterJellybean$VolumeCallback mCallback>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokeinterface #31  <Method void MediaRouterJellybean$VolumeCallback.onVolumeUpdateRequest(Object, int)>
		//    5   11:return          
		}

		protected final VolumeCallback mCallback;

		public VolumeCallbackProxy(VolumeCallback volumecallback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void android.media.MediaRouter$VolumeCallback()>
			mCallback = volumecallback;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field MediaRouterJellybean$VolumeCallback mCallback>
		//    5    9:return          
		}
	}


	MediaRouterJellybean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
	//    2    4:return          
	}

	public static void addCallback(Object obj, int i, Object obj1)
	{
		((MediaRouter)obj).addCallback(i, (android.media.MediaRouter.Callback)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #61  <Class MediaRouter>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:checkcast       #63  <Class android.media.MediaRouter$Callback>
	//    5    9:invokevirtual   #66  <Method void MediaRouter.addCallback(int, android.media.MediaRouter$Callback)>
	//    6   12:return          
	}

	public static void addUserRoute(Object obj, Object obj1)
	{
		((MediaRouter)obj).addUserRoute((android.media.MediaRouter.UserRouteInfo)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #61  <Class MediaRouter>
	//    2    4:aload_1         
	//    3    5:checkcast       #70  <Class android.media.MediaRouter$UserRouteInfo>
	//    4    8:invokevirtual   #73  <Method void MediaRouter.addUserRoute(android.media.MediaRouter$UserRouteInfo)>
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
	//    3    3:ldc1            #79  <String "audio">
	//    4    5:invokevirtual   #85  <Method Object Context.getSystemService(String)>
	//    5    8:checkcast       #87  <Class AudioManager>
	//    6   11:astore_0        
			i = ((Integer)((Object) (context)).getClass().getDeclaredMethod("getDevicesForStream", new Class[] {
				Integer.TYPE
			}).invoke(((Object) (context)), new Object[] {
				Integer.valueOf(3)
			})).intValue();
	//    7   12:aload_0         
	//    8   13:invokevirtual   #91  <Method Class Object.getClass()>
	//    9   16:ldc1            #93  <String "getDevicesForStream">
	//   10   18:iconst_1        
	//   11   19:anewarray       Class[]
	//   12   22:dup             
	//   13   23:iconst_0        
	//   14   24:getstatic       #101 <Field Class Integer.TYPE>
	//   15   27:aastore         
	//   16   28:invokevirtual   #105 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   17   31:aload_0         
	//   18   32:iconst_1        
	//   19   33:anewarray       Object[]
	//   20   36:dup             
	//   21   37:iconst_0        
	//   22   38:iconst_3        
	//   23   39:invokestatic    #109 <Method Integer Integer.valueOf(int)>
	//   24   42:aastore         
	//   25   43:invokevirtual   #115 <Method Object Method.invoke(Object, Object[])>
	//   26   46:checkcast       #97  <Class Integer>
	//   27   49:invokevirtual   #119 <Method int Integer.intValue()>
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
	//    0    0:new             #9   <Class MediaRouterJellybean$CallbackProxy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #124 <Method void MediaRouterJellybean$CallbackProxy(MediaRouterJellybean$Callback)>
	//    4    8:areturn         
	}

	public static Object createRouteCategory(Object obj, String s, boolean flag)
	{
		return ((Object) (((MediaRouter)obj).createRouteCategory(((CharSequence) (s)), flag)));
	//    0    0:aload_0         
	//    1    1:checkcast       #61  <Class MediaRouter>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #129 <Method android.media.MediaRouter$RouteCategory MediaRouter.createRouteCategory(CharSequence, boolean)>
	//    5    9:areturn         
	}

	public static Object createUserRoute(Object obj, Object obj1)
	{
		return ((Object) (((MediaRouter)obj).createUserRoute((android.media.MediaRouter.RouteCategory)obj1)));
	//    0    0:aload_0         
	//    1    1:checkcast       #61  <Class MediaRouter>
	//    2    4:aload_1         
	//    3    5:checkcast       #133 <Class android.media.MediaRouter$RouteCategory>
	//    4    8:invokevirtual   #136 <Method android.media.MediaRouter$UserRouteInfo MediaRouter.createUserRoute(android.media.MediaRouter$RouteCategory)>
	//    5   11:areturn         
	}

	public static Object createVolumeCallback(VolumeCallback volumecallback)
	{
		return ((Object) (new VolumeCallbackProxy(volumecallback)));
	//    0    0:new             #33  <Class MediaRouterJellybean$VolumeCallbackProxy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #141 <Method void MediaRouterJellybean$VolumeCallbackProxy(MediaRouterJellybean$VolumeCallback)>
	//    4    8:areturn         
	}

	public static List getCategories(Object obj)
	{
		obj = ((Object) ((MediaRouter)obj));
	//    0    0:aload_0         
	//    1    1:checkcast       #61  <Class MediaRouter>
	//    2    4:astore_0        
		int j = ((MediaRouter) (obj)).getCategoryCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #146 <Method int MediaRouter.getCategoryCount()>
	//    5    9:istore_2        
		ArrayList arraylist = new ArrayList(j);
	//    6   10:new             #148 <Class ArrayList>
	//    7   13:dup             
	//    8   14:iload_2         
	//    9   15:invokespecial   #151 <Method void ArrayList(int)>
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
	//   19   29:invokevirtual   #155 <Method android.media.MediaRouter$RouteCategory MediaRouter.getCategoryAt(int)>
	//   20   32:invokeinterface #161 <Method boolean List.add(Object)>
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
	//    1    1:ldc1            #165 <String "media_router">
	//    2    3:invokevirtual   #85  <Method Object Context.getSystemService(String)>
	//    3    6:areturn         
	}

	public static List getRoutes(Object obj)
	{
		obj = ((Object) ((MediaRouter)obj));
	//    0    0:aload_0         
	//    1    1:checkcast       #61  <Class MediaRouter>
	//    2    4:astore_0        
		int j = ((MediaRouter) (obj)).getRouteCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #169 <Method int MediaRouter.getRouteCount()>
	//    5    9:istore_2        
		ArrayList arraylist = new ArrayList(j);
	//    6   10:new             #148 <Class ArrayList>
	//    7   13:dup             
	//    8   14:iload_2         
	//    9   15:invokespecial   #151 <Method void ArrayList(int)>
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
	//   19   29:invokevirtual   #173 <Method android.media.MediaRouter$RouteInfo MediaRouter.getRouteAt(int)>
	//   20   32:invokeinterface #161 <Method boolean List.add(Object)>
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
	//    1    1:checkcast       #61  <Class MediaRouter>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #177 <Method android.media.MediaRouter$RouteInfo MediaRouter.getSelectedRoute(int)>
	//    4    8:areturn         
	}

	public static void removeCallback(Object obj, Object obj1)
	{
		((MediaRouter)obj).removeCallback((android.media.MediaRouter.Callback)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #61  <Class MediaRouter>
	//    2    4:aload_1         
	//    3    5:checkcast       #63  <Class android.media.MediaRouter$Callback>
	//    4    8:invokevirtual   #181 <Method void MediaRouter.removeCallback(android.media.MediaRouter$Callback)>
	//    5   11:return          
	}

	public static void removeUserRoute(Object obj, Object obj1)
	{
		((MediaRouter)obj).removeUserRoute((android.media.MediaRouter.UserRouteInfo)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #61  <Class MediaRouter>
	//    2    4:aload_1         
	//    3    5:checkcast       #70  <Class android.media.MediaRouter$UserRouteInfo>
	//    4    8:invokevirtual   #184 <Method void MediaRouter.removeUserRoute(android.media.MediaRouter$UserRouteInfo)>
	//    5   11:return          
	}

	public static void selectRoute(Object obj, int i, Object obj1)
	{
		((MediaRouter)obj).selectRoute(i, (android.media.MediaRouter.RouteInfo)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #61  <Class MediaRouter>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:checkcast       #187 <Class android.media.MediaRouter$RouteInfo>
	//    5    9:invokevirtual   #190 <Method void MediaRouter.selectRoute(int, android.media.MediaRouter$RouteInfo)>
	//    6   12:return          
	}

	public static final int ALL_ROUTE_TYPES = 0x800003;
	public static final int DEVICE_OUT_BLUETOOTH = 896;
	public static final int ROUTE_TYPE_LIVE_AUDIO = 1;
	public static final int ROUTE_TYPE_LIVE_VIDEO = 2;
	public static final int ROUTE_TYPE_USER = 0x800000;
	private static final String TAG = "MediaRouterJellybean";
}
