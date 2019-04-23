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

public final class MediaRouterJellybeanMr1$ActiveScanWorkaround
	implements Runnable
{

	public void run()
	{
		if(mActivelyScanningWifiDisplays)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field boolean mActivelyScanningWifiDisplays>
	//*   2    4:ifeq            61
		{
			try
			{
				mScanWifiDisplaysMethod.invoke(((Object) (mDisplayManager)), new Object[0]);
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field Method mScanWifiDisplaysMethod>
	//    5   11:aload_0         
	//    6   12:getfield        #41  <Field DisplayManager mDisplayManager>
	//    7   15:iconst_0        
	//    8   16:anewarray       Object[]
	//    9   19:invokevirtual   #70  <Method Object Method.invoke(Object, Object[])>
	//   10   22:pop             
			}
	//*  11   23:goto            49
	//*  12   26:astore_1        
	//*  13   27:ldc1            #72  <String "MediaRouterJellybeanMr1">
	//*  14   29:ldc1            #74  <String "Cannot scan for wifi displays.">
	//*  15   31:aload_1         
	//*  16   32:invokestatic    #80  <Method int Log.w(String, String, Throwable)>
	//*  17   35:pop             
	//*  18   36:goto            49
			catch(IllegalAccessException illegalaccessexception)
	//*  19   39:astore_1        
			{
				Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", ((Throwable) (illegalaccessexception)));
	//   20   40:ldc1            #72  <String "MediaRouterJellybeanMr1">
	//   21   42:ldc1            #74  <String "Cannot scan for wifi displays.">
	//   22   44:aload_1         
	//   23   45:invokestatic    #80  <Method int Log.w(String, String, Throwable)>
	//   24   48:pop             
			}
			catch(InvocationTargetException invocationtargetexception)
			{
				Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", ((Throwable) (invocationtargetexception)));
			}
			mHandler.postDelayed(((Runnable) (this)), 15000L);
	//   25   49:aload_0         
	//   26   50:getfield        #43  <Field Handler mHandler>
	//   27   53:aload_0         
	//   28   54:ldc2w           #81  <Long 15000L>
	//   29   57:invokevirtual   #88  <Method boolean Handler.postDelayed(Runnable, long)>
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
	//*   5    7:getfield        #64  <Field boolean mActivelyScanningWifiDisplays>
	//*   6   10:ifne            64
				if(mScanWifiDisplaysMethod != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #53  <Field Method mScanWifiDisplaysMethod>
	//*   9   17:ifnull          35
				{
					mActivelyScanningWifiDisplays = true;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #64  <Field boolean mActivelyScanningWifiDisplays>
					mHandler.post(((Runnable) (this)));
	//   13   25:aload_0         
	//   14   26:getfield        #43  <Field Handler mHandler>
	//   15   29:aload_0         
	//   16   30:invokevirtual   #94  <Method boolean Handler.post(Runnable)>
	//   17   33:pop             
					return;
	//   18   34:return          
				} else
				{
					Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.");
	//   19   35:ldc1            #72  <String "MediaRouterJellybeanMr1">
	//   20   37:ldc1            #96  <String "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.">
	//   21   39:invokestatic    #99  <Method int Log.w(String, String)>
	//   22   42:pop             
					return;
	//   23   43:return          
				}
		} else
		if(mActivelyScanningWifiDisplays)
	//*  24   44:aload_0         
	//*  25   45:getfield        #64  <Field boolean mActivelyScanningWifiDisplays>
	//*  26   48:ifeq            64
		{
			mActivelyScanningWifiDisplays = false;
	//   27   51:aload_0         
	//   28   52:iconst_0        
	//   29   53:putfield        #64  <Field boolean mActivelyScanningWifiDisplays>
			mHandler.removeCallbacks(((Runnable) (this)));
	//   30   56:aload_0         
	//   31   57:getfield        #43  <Field Handler mHandler>
	//   32   60:aload_0         
	//   33   61:invokevirtual   #103 <Method void Handler.removeCallbacks(Runnable)>
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
	//    1    1:invokespecial   #24  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT == 17)
	//*   2    4:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          17
	//*   4    9:icmpne          46
		{
			mDisplayManager = (DisplayManager)context.getSystemService("display");
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:ldc1            #31  <String "display">
	//    8   16:invokevirtual   #37  <Method Object Context.getSystemService(String)>
	//    9   19:checkcast       #39  <Class DisplayManager>
	//   10   22:putfield        #41  <Field DisplayManager mDisplayManager>
			mHandler = handler;
	//   11   25:aload_0         
	//   12   26:aload_2         
	//   13   27:putfield        #43  <Field Handler mHandler>
			try
			{
				mScanWifiDisplaysMethod = ((Class) (android/hardware/display/DisplayManager)).getMethod("scanWifiDisplays", new Class[0]);
	//   14   30:aload_0         
	//   15   31:ldc1            #39  <Class DisplayManager>
	//   16   33:ldc1            #45  <String "scanWifiDisplays">
	//   17   35:iconst_0        
	//   18   36:anewarray       Class[]
	//   19   39:invokevirtual   #51  <Method Method Class.getMethod(String, Class[])>
	//   20   42:putfield        #53  <Field Method mScanWifiDisplaysMethod>
				return;
	//   21   45:return          
			}
	//*  22   46:new             #55  <Class UnsupportedOperationException>
	//*  23   49:dup             
	//*  24   50:invokespecial   #56  <Method void UnsupportedOperationException()>
	//*  25   53:athrow          
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  26   54:astore_1        
			{
				return;
	//   27   55:return          
			}
		} else
		{
			throw new UnsupportedOperationException();
		}
	}
}
