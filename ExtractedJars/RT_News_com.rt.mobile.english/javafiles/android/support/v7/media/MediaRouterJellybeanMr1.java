// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaRouter;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import java.lang.reflect.*;

final class MediaRouterJellybeanMr1
{
	public static final class ActiveScanWorkaround
		implements Runnable
	{

		public void run()
		{
			if(mActivelyScanningWifiDisplays)
		//*   0    0:aload_0         
		//*   1    1:getfield        #67  <Field boolean mActivelyScanningWifiDisplays>
		//*   2    4:ifeq            61
			{
				try
				{
					mScanWifiDisplaysMethod.invoke(((Object) (mDisplayManager)), new Object[0]);
		//    3    7:aload_0         
		//    4    8:getfield        #59  <Field Method mScanWifiDisplaysMethod>
		//    5   11:aload_0         
		//    6   12:getfield        #47  <Field DisplayManager mDisplayManager>
		//    7   15:iconst_0        
		//    8   16:anewarray       Object[]
		//    9   19:invokevirtual   #73  <Method Object Method.invoke(Object, Object[])>
		//   10   22:pop             
				}
		//*  11   23:goto            49
		//*  12   26:astore_1        
		//*  13   27:ldc1            #75  <String "MediaRouterJellybeanMr1">
		//*  14   29:ldc1            #77  <String "Cannot scan for wifi displays.">
		//*  15   31:aload_1         
		//*  16   32:invokestatic    #83  <Method int Log.w(String, String, Throwable)>
		//*  17   35:pop             
		//*  18   36:goto            49
				catch(IllegalAccessException illegalaccessexception)
		//*  19   39:astore_1        
				{
					Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", ((Throwable) (illegalaccessexception)));
		//   20   40:ldc1            #75  <String "MediaRouterJellybeanMr1">
		//   21   42:ldc1            #77  <String "Cannot scan for wifi displays.">
		//   22   44:aload_1         
		//   23   45:invokestatic    #83  <Method int Log.w(String, String, Throwable)>
		//   24   48:pop             
				}
				catch(InvocationTargetException invocationtargetexception)
				{
					Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", ((Throwable) (invocationtargetexception)));
				}
				mHandler.postDelayed(((Runnable) (this)), 15000L);
		//   25   49:aload_0         
		//   26   50:getfield        #49  <Field Handler mHandler>
		//   27   53:aload_0         
		//   28   54:ldc2w           #84  <Long 15000L>
		//   29   57:invokevirtual   #91  <Method boolean Handler.postDelayed(Runnable, long)>
		//   30   60:pop             
			}
		//   31   61:return          
		}

		public void setActiveScanRouteTypes(int i)
		{
			if((i & 2) != 0)
		//*   0    0:iload_1         
		//*   1    1:iconst_2        
		//*   2    2:iand            
		//*   3    3:ifeq            44
			{
				if(!mActivelyScanningWifiDisplays)
		//*   4    6:aload_0         
		//*   5    7:getfield        #67  <Field boolean mActivelyScanningWifiDisplays>
		//*   6   10:ifne            64
					if(mScanWifiDisplaysMethod != null)
		//*   7   13:aload_0         
		//*   8   14:getfield        #59  <Field Method mScanWifiDisplaysMethod>
		//*   9   17:ifnull          35
					{
						mActivelyScanningWifiDisplays = true;
		//   10   20:aload_0         
		//   11   21:iconst_1        
		//   12   22:putfield        #67  <Field boolean mActivelyScanningWifiDisplays>
						mHandler.post(((Runnable) (this)));
		//   13   25:aload_0         
		//   14   26:getfield        #49  <Field Handler mHandler>
		//   15   29:aload_0         
		//   16   30:invokevirtual   #97  <Method boolean Handler.post(Runnable)>
		//   17   33:pop             
						return;
		//   18   34:return          
					} else
					{
						Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.");
		//   19   35:ldc1            #75  <String "MediaRouterJellybeanMr1">
		//   20   37:ldc1            #99  <String "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.">
		//   21   39:invokestatic    #102 <Method int Log.w(String, String)>
		//   22   42:pop             
						return;
		//   23   43:return          
					}
			} else
			if(mActivelyScanningWifiDisplays)
		//*  24   44:aload_0         
		//*  25   45:getfield        #67  <Field boolean mActivelyScanningWifiDisplays>
		//*  26   48:ifeq            64
			{
				mActivelyScanningWifiDisplays = false;
		//   27   51:aload_0         
		//   28   52:iconst_0        
		//   29   53:putfield        #67  <Field boolean mActivelyScanningWifiDisplays>
				mHandler.removeCallbacks(((Runnable) (this)));
		//   30   56:aload_0         
		//   31   57:getfield        #49  <Field Handler mHandler>
		//   32   60:aload_0         
		//   33   61:invokevirtual   #106 <Method void Handler.removeCallbacks(Runnable)>
			}
		//   34   64:return          
		}

		private static final int WIFI_DISPLAY_SCAN_INTERVAL = 15000;
		private boolean mActivelyScanningWifiDisplays;
		private final DisplayManager mDisplayManager;
		private final Handler mHandler;
		private Method mScanWifiDisplaysMethod;

		public ActiveScanWorkaround(Context context, Handler handler)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
			if(android.os.Build.VERSION.SDK_INT != 17)
		//*   2    4:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          17
		//*   4    9:icmpeq          20
				throw new UnsupportedOperationException();
		//    5   12:new             #34  <Class UnsupportedOperationException>
		//    6   15:dup             
		//    7   16:invokespecial   #35  <Method void UnsupportedOperationException()>
		//    8   19:athrow          
			mDisplayManager = (DisplayManager)context.getSystemService("display");
		//    9   20:aload_0         
		//   10   21:aload_1         
		//   11   22:ldc1            #37  <String "display">
		//   12   24:invokevirtual   #43  <Method Object Context.getSystemService(String)>
		//   13   27:checkcast       #45  <Class DisplayManager>
		//   14   30:putfield        #47  <Field DisplayManager mDisplayManager>
			mHandler = handler;
		//   15   33:aload_0         
		//   16   34:aload_2         
		//   17   35:putfield        #49  <Field Handler mHandler>
			try
			{
				mScanWifiDisplaysMethod = ((Class) (android/hardware/display/DisplayManager)).getMethod("scanWifiDisplays", new Class[0]);
		//   18   38:aload_0         
		//   19   39:ldc1            #45  <Class DisplayManager>
		//   20   41:ldc1            #51  <String "scanWifiDisplays">
		//   21   43:iconst_0        
		//   22   44:anewarray       Class[]
		//   23   47:invokevirtual   #57  <Method Method Class.getMethod(String, Class[])>
		//   24   50:putfield        #59  <Field Method mScanWifiDisplaysMethod>
				return;
		//   25   53:return          
			}
			// Misplaced declaration of an exception variable
			catch(Context context)
		//*  26   54:astore_1        
			{
				return;
		//   27   55:return          
			}
		}
	}

	public static interface Callback
		extends MediaRouterJellybean.Callback
	{

		public abstract void onRoutePresentationDisplayChanged(Object obj);
	}

	static class CallbackProxy extends MediaRouterJellybean.CallbackProxy
	{

		public void onRoutePresentationDisplayChanged(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
		{
			((Callback)mCallback).onRoutePresentationDisplayChanged(((Object) (routeinfo)));
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field MediaRouterJellybean$Callback mCallback>
		//    2    4:checkcast       #24  <Class MediaRouterJellybeanMr1$Callback>
		//    3    7:aload_2         
		//    4    8:invokeinterface #27  <Method void MediaRouterJellybeanMr1$Callback.onRoutePresentationDisplayChanged(Object)>
		//    5   13:return          
		}

		public CallbackProxy(Callback callback)
		{
			super(((MediaRouterJellybean.Callback) (callback)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #13  <Method void MediaRouterJellybean$CallbackProxy(MediaRouterJellybean$Callback)>
		//    3    5:return          
		}
	}

	public static final class IsConnectingWorkaround
	{

		public boolean isConnecting(Object obj)
		{
			boolean flag;
			obj = ((Object) ((android.media.MediaRouter.RouteInfo)obj));
		//    0    0:aload_1         
		//    1    1:checkcast       #31  <Class android.media.MediaRouter$RouteInfo>
		//    2    4:astore_1        
			Method method = mGetStatusCodeMethod;
		//    3    5:aload_0         
		//    4    6:getfield        #55  <Field Method mGetStatusCodeMethod>
		//    5    9:astore          5
			flag = false;
		//    6   11:iconst_0        
		//    7   12:istore          4
			if(method == null)
				break MISSING_BLOCK_LABEL_54;
		//    8   14:aload           5
		//    9   16:ifnull          54
			int i;
			int j;
			try
			{
				i = ((Integer)mGetStatusCodeMethod.invoke(obj, new Object[0])).intValue();
		//   10   19:aload_0         
		//   11   20:getfield        #55  <Field Method mGetStatusCodeMethod>
		//   12   23:aload_1         
		//   13   24:iconst_0        
		//   14   25:anewarray       Object[]
		//   15   28:invokevirtual   #66  <Method Object Method.invoke(Object, Object[])>
		//   16   31:checkcast       #68  <Class Integer>
		//   17   34:invokevirtual   #72  <Method int Integer.intValue()>
		//   18   37:istore_2        
				j = mStatusConnecting;
		//   19   38:aload_0         
		//   20   39:getfield        #47  <Field int mStatusConnecting>
		//   21   42:istore_3        
			}
		//*  22   43:iload_2         
		//*  23   44:iload_3         
		//*  24   45:icmpne          51
		//*  25   48:iconst_1        
		//*  26   49:istore          4
		//*  27   51:iload           4
		//*  28   53:ireturn         
		//*  29   54:iconst_0        
		//*  30   55:ireturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
		//*  31   56:astore_1        
			{
				return false;
		//   32   57:iconst_0        
		//   33   58:ireturn         
			}
			if(i == j)
				flag = true;
			return flag;
			return false;
		}

		private Method mGetStatusCodeMethod;
		private int mStatusConnecting;

		public IsConnectingWorkaround()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			if(android.os.Build.VERSION.SDK_INT != 17)
		//*   2    4:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          17
		//*   4    9:icmpeq          20
				throw new UnsupportedOperationException();
		//    5   12:new             #28  <Class UnsupportedOperationException>
		//    6   15:dup             
		//    7   16:invokespecial   #29  <Method void UnsupportedOperationException()>
		//    8   19:athrow          
			try
			{
				mStatusConnecting = ((Class) (android/media/MediaRouter$RouteInfo)).getField("STATUS_CONNECTING").getInt(((Object) (null)));
		//    9   20:aload_0         
		//   10   21:ldc1            #31  <Class android.media.MediaRouter$RouteInfo>
		//   11   23:ldc1            #33  <String "STATUS_CONNECTING">
		//   12   25:invokevirtual   #39  <Method Field Class.getField(String)>
		//   13   28:aconst_null     
		//   14   29:invokevirtual   #45  <Method int Field.getInt(Object)>
		//   15   32:putfield        #47  <Field int mStatusConnecting>
				mGetStatusCodeMethod = ((Class) (android/media/MediaRouter$RouteInfo)).getMethod("getStatusCode", new Class[0]);
		//   16   35:aload_0         
		//   17   36:ldc1            #31  <Class android.media.MediaRouter$RouteInfo>
		//   18   38:ldc1            #49  <String "getStatusCode">
		//   19   40:iconst_0        
		//   20   41:anewarray       Class[]
		//   21   44:invokevirtual   #53  <Method Method Class.getMethod(String, Class[])>
		//   22   47:putfield        #55  <Field Method mGetStatusCodeMethod>
				return;
		//   23   50:return          
			}
			catch(Object obj)
		//*  24   51:astore_1        
			{
				return;
		//   25   52:return          
			}
		}
	}

	public static final class RouteInfo
	{

		public static Display getPresentationDisplay(Object obj)
		{
			try
			{
				obj = ((Object) (((android.media.MediaRouter.RouteInfo)obj).getPresentationDisplay()));
		//    0    0:aload_0         
		//    1    1:checkcast       #18  <Class android.media.MediaRouter$RouteInfo>
		//    2    4:invokevirtual   #21  <Method Display android.media.MediaRouter$RouteInfo.getPresentationDisplay()>
		//    3    7:astore_0        
			}
		//*   4    8:aload_0         
		//*   5    9:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
		//*   6   10:astore_0        
			{
				Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", ((Throwable) (obj)));
		//    7   11:ldc1            #23  <String "MediaRouterJellybeanMr1">
		//    8   13:ldc1            #25  <String "Cannot get presentation display for the route.">
		//    9   15:aload_0         
		//   10   16:invokestatic    #31  <Method int Log.w(String, String, Throwable)>
		//   11   19:pop             
				return null;
		//   12   20:aconst_null     
		//   13   21:areturn         
			}
			return ((Display) (obj));
		}

		public static boolean isEnabled(Object obj)
		{
			return ((android.media.MediaRouter.RouteInfo)obj).isEnabled();
		//    0    0:aload_0         
		//    1    1:checkcast       #18  <Class android.media.MediaRouter$RouteInfo>
		//    2    4:invokevirtual   #36  <Method boolean android.media.MediaRouter$RouteInfo.isEnabled()>
		//    3    7:ireturn         
		}

		public RouteInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	MediaRouterJellybeanMr1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	public static Object createCallback(Callback callback)
	{
		return ((Object) (new CallbackProxy(callback)));
	//    0    0:new             #12  <Class MediaRouterJellybeanMr1$CallbackProxy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #36  <Method void MediaRouterJellybeanMr1$CallbackProxy(MediaRouterJellybeanMr1$Callback)>
	//    4    8:areturn         
	}

	private static final String TAG = "MediaRouterJellybeanMr1";
}
