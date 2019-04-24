// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.media:
//			MediaRouterJellybeanMr1

public static final class MediaRouterJellybeanMr1$ActiveScanWorkaround
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

	public MediaRouterJellybeanMr1$ActiveScanWorkaround(Context context, Handler handler)
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
