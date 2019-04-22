// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.marketing.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.facebook.FacebookSdk;

public class MarketingUtils
{

	public MarketingUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static String getAppVersion()
	{
		Object obj = ((Object) (FacebookSdk.getApplicationContext()));
	//    0    0:invokestatic    #29  <Method Context FacebookSdk.getApplicationContext()>
	//    1    3:astore_0        
		try
		{
			obj = ((Object) (((Context) (obj)).getPackageManager().getPackageInfo(((Context) (obj)).getPackageName(), 0).versionName));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #35  <Method PackageManager Context.getPackageManager()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #38  <Method String Context.getPackageName()>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #44  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    8   16:getfield        #49  <Field String PackageInfo.versionName>
	//    9   19:astore_0        
		}
	//*  10   20:aload_0         
	//*  11   21:areturn         
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
	//*  12   22:astore_0        
		{
			Log.e(TAG, "Failed to get app version.", ((Throwable) (namenotfoundexception)));
	//   13   23:getstatic       #16  <Field String TAG>
	//   14   26:ldc1            #51  <String "Failed to get app version.">
	//   15   28:aload_0         
	//   16   29:invokestatic    #57  <Method int Log.e(String, String, Throwable)>
	//   17   32:pop             
			return "";
	//   18   33:ldc1            #59  <String "">
	//   19   35:areturn         
		}
		return ((String) (obj));
	}

	public static boolean isEmulator()
	{
		return Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic") || "google_sdk".equals(((Object) (Build.PRODUCT)));
	//    0    0:getstatic       #66  <Field String Build.FINGERPRINT>
	//    1    3:ldc1            #68  <String "generic">
	//    2    5:invokevirtual   #74  <Method boolean String.startsWith(String)>
	//    3    8:ifne            104
	//    4   11:getstatic       #66  <Field String Build.FINGERPRINT>
	//    5   14:ldc1            #76  <String "unknown">
	//    6   16:invokevirtual   #74  <Method boolean String.startsWith(String)>
	//    7   19:ifne            104
	//    8   22:getstatic       #79  <Field String Build.MODEL>
	//    9   25:ldc1            #81  <String "google_sdk">
	//   10   27:invokevirtual   #85  <Method boolean String.contains(CharSequence)>
	//   11   30:ifne            104
	//   12   33:getstatic       #79  <Field String Build.MODEL>
	//   13   36:ldc1            #87  <String "Emulator">
	//   14   38:invokevirtual   #85  <Method boolean String.contains(CharSequence)>
	//   15   41:ifne            104
	//   16   44:getstatic       #79  <Field String Build.MODEL>
	//   17   47:ldc1            #89  <String "Android SDK built for x86">
	//   18   49:invokevirtual   #85  <Method boolean String.contains(CharSequence)>
	//   19   52:ifne            104
	//   20   55:getstatic       #92  <Field String Build.MANUFACTURER>
	//   21   58:ldc1            #94  <String "Genymotion">
	//   22   60:invokevirtual   #85  <Method boolean String.contains(CharSequence)>
	//   23   63:ifne            104
	//   24   66:getstatic       #97  <Field String Build.BRAND>
	//   25   69:ldc1            #68  <String "generic">
	//   26   71:invokevirtual   #74  <Method boolean String.startsWith(String)>
	//   27   74:ifeq            88
	//   28   77:getstatic       #100 <Field String Build.DEVICE>
	//   29   80:ldc1            #68  <String "generic">
	//   30   82:invokevirtual   #74  <Method boolean String.startsWith(String)>
	//   31   85:ifne            104
	//   32   88:ldc1            #81  <String "google_sdk">
	//   33   90:getstatic       #103 <Field String Build.PRODUCT>
	//   34   93:invokevirtual   #107 <Method boolean String.equals(Object)>
	//   35   96:ifeq            102
	//   36   99:goto            104
	//   37  102:iconst_0        
	//   38  103:ireturn         
	//   39  104:iconst_1        
	//   40  105:ireturn         
	}

	private static final String TAG = ((Class) (com/facebook/marketing/internal/MarketingUtils)).getCanonicalName();

	static 
	{
	//    0    0:ldc1            #2   <Class MarketingUtils>
	//    1    2:invokevirtual   #14  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #16  <Field String TAG>
	//*   3    8:return          
	}
}
