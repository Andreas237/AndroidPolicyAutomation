// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppEventUtility
{

	public AppEventUtility()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static void assertIsMainThread()
	{
	//    0    0:return          
	}

	public static void assertIsNotMainThread()
	{
	//    0    0:return          
	}

	public static String bytesToHex(byte abyte0[])
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #19  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void StringBuffer()>
	//    3    7:astore_3        
		int j = abyte0.length;
	//    4    8:aload_0         
	//    5    9:arraylength     
	//    6   10:istore_2        
		for(int i = 0; i < j; i++)
	//*   7   11:iconst_0        
	//*   8   12:istore_1        
	//*   9   13:iload_1         
	//*  10   14:iload_2         
	//*  11   15:icmpge          48
			stringbuffer.append(String.format("%02x", new Object[] {
				Byte.valueOf(abyte0[i])
			}));
	//   12   18:aload_3         
	//   13   19:ldc1            #22  <String "%02x">
	//   14   21:iconst_1        
	//   15   22:anewarray       Object[]
	//   16   25:dup             
	//   17   26:iconst_0        
	//   18   27:aload_0         
	//   19   28:iload_1         
	//   20   29:baload          
	//   21   30:invokestatic    #28  <Method Byte Byte.valueOf(byte)>
	//   22   33:aastore         
	//   23   34:invokestatic    #34  <Method String String.format(String, Object[])>
	//   24   37:invokevirtual   #38  <Method StringBuffer StringBuffer.append(String)>
	//   25   40:pop             

	//   26   41:iload_1         
	//   27   42:iconst_1        
	//   28   43:iadd            
	//   29   44:istore_1        
	//*  30   45:goto            13
		return stringbuffer.toString();
	//   31   48:aload_3         
	//   32   49:invokevirtual   #42  <Method String StringBuffer.toString()>
	//   33   52:areturn         
	}

	public static String getAppVersion()
	{
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		Object obj = ((Object) (FacebookSdk.getApplicationContext()));
	//    0    0:invokestatic    #51  <Method Context FacebookSdk.getApplicationContext()>
	//    1    3:astore_0        
		try
		{
			obj = ((Object) (((Context) (obj)).getPackageManager().getPackageInfo(((Context) (obj)).getPackageName(), 0).versionName));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #57  <Method PackageManager Context.getPackageManager()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #60  <Method String Context.getPackageName()>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #66  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    8   16:getfield        #71  <Field String PackageInfo.versionName>
	//    9   19:astore_0        
		}
	//*  10   20:aload_0         
	//*  11   21:areturn         
	//*  12   22:ldc1            #73  <String "">
	//*  13   24:areturn         
		// Misplaced declaration of an exception variable
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
		{
			return "";
		}
		return ((String) (obj));
	//*  14   25:astore_0        
	//*  15   26:goto            22
	}

	public static boolean isEmulator()
	{
		return Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic") || "google_sdk".equals(((Object) (Build.PRODUCT)));
	//    0    0:getstatic       #80  <Field String Build.FINGERPRINT>
	//    1    3:ldc1            #82  <String "generic">
	//    2    5:invokevirtual   #86  <Method boolean String.startsWith(String)>
	//    3    8:ifne            104
	//    4   11:getstatic       #80  <Field String Build.FINGERPRINT>
	//    5   14:ldc1            #88  <String "unknown">
	//    6   16:invokevirtual   #86  <Method boolean String.startsWith(String)>
	//    7   19:ifne            104
	//    8   22:getstatic       #91  <Field String Build.MODEL>
	//    9   25:ldc1            #93  <String "google_sdk">
	//   10   27:invokevirtual   #97  <Method boolean String.contains(CharSequence)>
	//   11   30:ifne            104
	//   12   33:getstatic       #91  <Field String Build.MODEL>
	//   13   36:ldc1            #99  <String "Emulator">
	//   14   38:invokevirtual   #97  <Method boolean String.contains(CharSequence)>
	//   15   41:ifne            104
	//   16   44:getstatic       #91  <Field String Build.MODEL>
	//   17   47:ldc1            #101 <String "Android SDK built for x86">
	//   18   49:invokevirtual   #97  <Method boolean String.contains(CharSequence)>
	//   19   52:ifne            104
	//   20   55:getstatic       #104 <Field String Build.MANUFACTURER>
	//   21   58:ldc1            #106 <String "Genymotion">
	//   22   60:invokevirtual   #97  <Method boolean String.contains(CharSequence)>
	//   23   63:ifne            104
	//   24   66:getstatic       #109 <Field String Build.BRAND>
	//   25   69:ldc1            #82  <String "generic">
	//   26   71:invokevirtual   #86  <Method boolean String.startsWith(String)>
	//   27   74:ifeq            88
	//   28   77:getstatic       #112 <Field String Build.DEVICE>
	//   29   80:ldc1            #82  <String "generic">
	//   30   82:invokevirtual   #86  <Method boolean String.startsWith(String)>
	//   31   85:ifne            104
	//   32   88:ldc1            #93  <String "google_sdk">
	//   33   90:getstatic       #115 <Field String Build.PRODUCT>
	//   34   93:invokevirtual   #119 <Method boolean String.equals(Object)>
	//   35   96:ifeq            102
	//   36   99:goto            104
	//   37  102:iconst_0        
	//   38  103:ireturn         
	//   39  104:iconst_1        
	//   40  105:ireturn         
	}

	private static boolean isMainThread()
	{
		return Looper.myLooper() == Looper.getMainLooper();
	//    0    0:invokestatic    #126 <Method Looper Looper.myLooper()>
	//    1    3:invokestatic    #129 <Method Looper Looper.getMainLooper()>
	//    2    6:if_acmpne       11
	//    3    9:iconst_1        
	//    4   10:ireturn         
	//    5   11:iconst_0        
	//    6   12:ireturn         
	}

	public static double normalizePrice(String s)
	{
label0:
		{
			double d;
			try
			{
				s = ((String) (Pattern.compile("[-+]*\\d+([\\,\\.]\\d+)*([\\.\\,]\\d+)?", 8).matcher(((CharSequence) (s)))));
	//    0    0:ldc1            #8   <String "[-+]*\\d+([\\,\\.]\\d+)*([\\.\\,]\\d+)?">
	//    1    2:bipush          8
	//    2    4:invokestatic    #139 <Method Pattern Pattern.compile(String, int)>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #143 <Method Matcher Pattern.matcher(CharSequence)>
	//    5   11:astore_0        
				if(!((Matcher) (s)).find())
					break label0;
	//    6   12:aload_0         
	//    7   13:invokevirtual   #148 <Method boolean Matcher.find()>
	//    8   16:ifeq            41
				s = ((Matcher) (s)).group(0);
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #152 <Method String Matcher.group(int)>
	//   12   24:astore_0        
				d = NumberFormat.getNumberInstance(Utility.getCurrentLocale()).parse(s).doubleValue();
	//   13   25:invokestatic    #158 <Method java.util.Locale Utility.getCurrentLocale()>
	//   14   28:invokestatic    #164 <Method NumberFormat NumberFormat.getNumberInstance(java.util.Locale)>
	//   15   31:aload_0         
	//   16   32:invokevirtual   #168 <Method Number NumberFormat.parse(String)>
	//   17   35:invokevirtual   #174 <Method double Number.doubleValue()>
	//   18   38:dstore_1        
			}
	//*  19   39:dload_1         
	//*  20   40:dreturn         
	//*  21   41:dconst_0        
	//*  22   42:dreturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  23   43:astore_0        
			{
				return 0.0D;
	//   24   44:dconst_0        
	//   25   45:dreturn         
			}
			return d;
		}
		return 0.0D;
	}

	private static final String regex = "[-+]*\\d+([\\,\\.]\\d+)*([\\.\\,]\\d+)?";
}
