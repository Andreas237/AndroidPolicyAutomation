// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.*;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package bo.app:
//			bm, cb, ce, cz, 
//			bn, dw

public class bi
	implements bm
{

	public bi(Context context, AppboyConfigurationProvider appboyconfigurationprovider, String s, bn bn1, cz cz1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		if(context != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          75
		{
			c = context;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #34  <Field Context c>
			d = bn1;
	//    7   13:aload_0         
	//    8   14:aload           4
	//    9   16:putfield        #36  <Field bn d>
			e = cz1;
	//   10   19:aload_0         
	//   11   20:aload           5
	//   12   22:putfield        #38  <Field cz e>
			bn1 = ((bn) (new StringBuilder()));
	//   13   25:new             #40  <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #41  <Method void StringBuilder()>
	//   16   32:astore          4
			((StringBuilder) (bn1)).append("com.appboy.storage.device_ad_info");
	//   17   34:aload           4
	//   18   36:ldc1            #43  <String "com.appboy.storage.device_ad_info">
	//   19   38:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
			((StringBuilder) (bn1)).append(StringUtils.getCacheFileSuffix(context, s, appboyconfigurationprovider.getAppboyApiKey().toString()));
	//   21   42:aload           4
	//   22   44:aload_1         
	//   23   45:aload_3         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #53  <Method cb AppboyConfigurationProvider.getAppboyApiKey()>
	//   26   50:invokevirtual   #59  <Method String cb.toString()>
	//   27   53:invokestatic    #65  <Method String StringUtils.getCacheFileSuffix(Context, String, String)>
	//   28   56:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   29   59:pop             
			a = context.getSharedPreferences(((StringBuilder) (bn1)).toString(), 0);
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:aload           4
	//   33   64:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   34   67:iconst_0        
	//   35   68:invokevirtual   #72  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   36   71:putfield        #74  <Field SharedPreferences a>
			return;
	//   37   74:return          
		} else
		{
			throw new NullPointerException();
	//   38   75:new             #76  <Class NullPointerException>
	//   39   78:dup             
	//   40   79:invokespecial   #77  <Method void NullPointerException()>
	//   41   82:athrow          
		}
	}

	static String a(DisplayMetrics displaymetrics)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #40  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(displaymetrics.widthPixels);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #85  <Field int DisplayMetrics.widthPixels>
	//    7   13:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//    8   16:pop             
		stringbuilder.append("x");
	//    9   17:aload_1         
	//   10   18:ldc1            #90  <String "x">
	//   11   20:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(displaymetrics.heightPixels);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #93  <Field int DisplayMetrics.heightPixels>
	//   16   29:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   17   32:pop             
		return stringbuilder.toString();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   20   37:areturn         
	}

	static String a(Locale locale)
	{
		return locale.toString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method String Locale.toString()>
	//    2    4:areturn         
	}

	private String f()
	{
		return String.valueOf(android.os.Build.VERSION.SDK_INT);
	//    0    0:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:invokestatic    #109 <Method String String.valueOf(int)>
	//    2    6:areturn         
	}

	private String g()
	{
		Object obj = ((Object) ((TelephonyManager)c.getSystemService("phone")));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Context c>
	//    2    4:ldc1            #116 <String "phone">
	//    3    6:invokevirtual   #120 <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #122 <Class TelephonyManager>
	//    5   12:astore_1        
		((TelephonyManager) (obj)).getPhoneType();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #126 <Method int TelephonyManager.getPhoneType()>
		JVM INSTR tableswitch 0 2: default 91
	//	               0 89
	//	               1 51
	//	               2 51;
	//    8   17:tableswitch     0 2: default 91
	//	               0 89
	//	               1 51
	//	               2 51
		   goto _L1 _L2 _L3 _L3
_L1:
		obj = ((Object) (b));
	//    9   44:getstatic       #27  <Field String b>
	//   10   47:astore_1        
		  goto _L4
	//*  11   48:goto            56
_L3:
		return ((TelephonyManager) (obj)).getNetworkOperatorName();
	//   12   51:aload_1         
	//   13   52:invokevirtual   #129 <Method String TelephonyManager.getNetworkOperatorName()>
	//   14   55:areturn         
_L4:
		AppboyLogger.w(((String) (obj)), "Unknown phone type");
	//   15   56:aload_1         
	//   16   57:ldc1            #131 <String "Unknown phone type">
	//   17   59:invokestatic    #135 <Method int AppboyLogger.w(String, String)>
	//   18   62:pop             
		return null;
	//   19   63:aconst_null     
	//   20   64:areturn         
		Object obj1;
		obj1;
	//   21   65:astore_1        
		AppboyLogger.e(b, "Caught security exception while reading the phone carrier name.", ((Throwable) (obj1)));
	//   22   66:getstatic       #27  <Field String b>
	//   23   69:ldc1            #137 <String "Caught security exception while reading the phone carrier name.">
	//   24   71:aload_1         
	//   25   72:invokestatic    #140 <Method int AppboyLogger.e(String, String, Throwable)>
	//   26   75:pop             
		return null;
	//   27   76:aconst_null     
	//   28   77:areturn         
		obj1;
	//   29   78:astore_1        
		AppboyLogger.e(b, "Caught resources not found exception while reading the phone carrier name.", ((Throwable) (obj1)));
	//   30   79:getstatic       #27  <Field String b>
	//   31   82:ldc1            #142 <String "Caught resources not found exception while reading the phone carrier name.">
	//   32   84:aload_1         
	//   33   85:invokestatic    #140 <Method int AppboyLogger.e(String, String, Throwable)>
	//   34   88:pop             
_L2:
		return null;
	//   35   89:aconst_null     
	//   36   90:areturn         
	//*  37   91:goto            44
	}

	private String h()
	{
		return Build.MODEL;
	//    0    0:getstatic       #148 <Field String Build.MODEL>
	//    1    3:areturn         
	}

	private Locale i()
	{
		return Locale.getDefault();
	//    0    0:invokestatic    #153 <Method Locale Locale.getDefault()>
	//    1    3:areturn         
	}

	private TimeZone j()
	{
		return TimeZone.getDefault();
	//    0    0:invokestatic    #159 <Method TimeZone TimeZone.getDefault()>
	//    1    3:areturn         
	}

	private DisplayMetrics k()
	{
		WindowManager windowmanager = (WindowManager)c.getSystemService("window");
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Context c>
	//    2    4:ldc1            #163 <String "window">
	//    3    6:invokevirtual   #120 <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #165 <Class WindowManager>
	//    5   12:astore_1        
		DisplayMetrics displaymetrics = new DisplayMetrics();
	//    6   13:new             #81  <Class DisplayMetrics>
	//    7   16:dup             
	//    8   17:invokespecial   #166 <Method void DisplayMetrics()>
	//    9   20:astore_2        
		windowmanager.getDefaultDisplay().getMetrics(displaymetrics);
	//   10   21:aload_1         
	//   11   22:invokeinterface #170 <Method Display WindowManager.getDefaultDisplay()>
	//   12   27:aload_2         
	//   13   28:invokevirtual   #176 <Method void Display.getMetrics(DisplayMetrics)>
		return displaymetrics;
	//   14   31:aload_2         
	//   15   32:areturn         
	}

	public ce a()
	{
		return new ce(f(), g(), h(), a(i()), j().getID(), a(k()), Boolean.valueOf(d()));
	//    0    0:new             #179 <Class ce>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #181 <Method String f()>
	//    4    8:aload_0         
	//    5    9:invokespecial   #183 <Method String g()>
	//    6   12:aload_0         
	//    7   13:invokespecial   #185 <Method String h()>
	//    8   16:aload_0         
	//    9   17:invokespecial   #187 <Method Locale i()>
	//   10   20:invokestatic    #189 <Method String a(Locale)>
	//   11   23:aload_0         
	//   12   24:invokespecial   #191 <Method TimeZone j()>
	//   13   27:invokevirtual   #194 <Method String TimeZone.getID()>
	//   14   30:aload_0         
	//   15   31:invokespecial   #196 <Method DisplayMetrics k()>
	//   16   34:invokestatic    #198 <Method String a(DisplayMetrics)>
	//   17   37:aload_0         
	//   18   38:invokevirtual   #201 <Method boolean d()>
	//   19   41:invokestatic    #206 <Method Boolean Boolean.valueOf(boolean)>
	//   20   44:invokespecial   #209 <Method void ce(String, String, String, String, String, String, Boolean)>
	//   21   47:areturn         
	}

	public ce b()
	{
		e.a(a());
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field cz e>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #211 <Method ce a()>
	//    4    8:invokevirtual   #216 <Method void cz.a(ce)>
		return (ce)e.b();
	//    5   11:aload_0         
	//    6   12:getfield        #38  <Field cz e>
	//    7   15:invokevirtual   #219 <Method Object cz.b()>
	//    8   18:checkcast       #179 <Class ce>
	//    9   21:areturn         
	}

	public String c()
	{
		String s = d.a();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field bn d>
	//    2    4:invokeinterface #223 <Method String bn.a()>
	//    3    9:astore_1        
		if(s == null)
	//*   4   10:aload_1         
	//*   5   11:ifnonnull       23
			AppboyLogger.e(b, "Error reading deviceId, received a null value.");
	//    6   14:getstatic       #27  <Field String b>
	//    7   17:ldc1            #225 <String "Error reading deviceId, received a null value.">
	//    8   19:invokestatic    #227 <Method int AppboyLogger.e(String, String)>
	//    9   22:pop             
		return s;
	//   10   23:aload_1         
	//   11   24:areturn         
	}

	boolean d()
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          32
		{
			NotificationManager notificationmanager = (NotificationManager)c.getSystemService("notification");
	//    3    8:aload_0         
	//    4    9:getfield        #34  <Field Context c>
	//    5   12:ldc1            #231 <String "notification">
	//    6   14:invokevirtual   #120 <Method Object Context.getSystemService(String)>
	//    7   17:checkcast       #233 <Class NotificationManager>
	//    8   20:astore_2        
			if(notificationmanager != null)
	//*   9   21:aload_2         
	//*  10   22:ifnull          30
				return notificationmanager.areNotificationsEnabled();
	//   11   25:aload_2         
	//   12   26:invokevirtual   #236 <Method boolean NotificationManager.areNotificationsEnabled()>
	//   13   29:ireturn         
			else
				return true;
	//   14   30:iconst_1        
	//   15   31:ireturn         
		}
		if(android.os.Build.VERSION.SDK_INT < 19)
			break MISSING_BLOCK_LABEL_153;
	//   16   32:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
	//   17   35:bipush          19
	//   18   37:icmplt          153
		boolean flag;
		Object obj;
		java.lang.reflect.Method method;
		try
		{
			obj = ((Object) (dw.a("android.support.v4.app.NotificationManagerCompat", "from", new Class[] {
				android/content/Context
			})));
	//   19   40:ldc1            #238 <String "android.support.v4.app.NotificationManagerCompat">
	//   20   42:ldc1            #240 <String "from">
	//   21   44:iconst_1        
	//   22   45:anewarray       Class[]
	//   23   48:dup             
	//   24   49:iconst_0        
	//   25   50:ldc1            #68  <Class Context>
	//   26   52:aastore         
	//   27   53:invokestatic    #247 <Method java.lang.reflect.Method dw.a(String, String, Class[])>
	//   28   56:astore_2        
		}
	//*  29   57:aload_2         
	//*  30   58:ifnonnull       63
	//*  31   61:iconst_1        
	//*  32   62:ireturn         
	//*  33   63:aconst_null     
	//*  34   64:aload_2         
	//*  35   65:iconst_1        
	//*  36   66:anewarray       Object[]
	//*  37   69:dup             
	//*  38   70:iconst_0        
	//*  39   71:aload_0         
	//*  40   72:getfield        #34  <Field Context c>
	//*  41   75:aastore         
	//*  42   76:invokestatic    #250 <Method Object dw.a(Object, java.lang.reflect.Method, Object[])>
	//*  43   79:astore_2        
	//*  44   80:aload_2         
	//*  45   81:ifnonnull       86
	//*  46   84:iconst_1        
	//*  47   85:ireturn         
	//*  48   86:aload_2         
	//*  49   87:invokevirtual   #254 <Method Class Object.getClass()>
	//*  50   90:ldc1            #255 <String "areNotificationsEnabled">
	//*  51   92:iconst_0        
	//*  52   93:anewarray       Class[]
	//*  53   96:invokestatic    #258 <Method java.lang.reflect.Method dw.a(Class, String, Class[])>
	//*  54   99:astore_3        
	//*  55  100:aload_3         
	//*  56  101:ifnonnull       106
	//*  57  104:iconst_1        
	//*  58  105:ireturn         
	//*  59  106:aload_2         
	//*  60  107:aload_3         
	//*  61  108:iconst_0        
	//*  62  109:anewarray       Object[]
	//*  63  112:invokestatic    #250 <Method Object dw.a(Object, java.lang.reflect.Method, Object[])>
	//*  64  115:astore_2        
	//*  65  116:aload_2         
	//*  66  117:ifnull          137
	//*  67  120:aload_2         
	//*  68  121:instanceof      #203 <Class Boolean>
	//*  69  124:ifeq            137
	//*  70  127:aload_2         
	//*  71  128:checkcast       #203 <Class Boolean>
	//*  72  131:invokevirtual   #261 <Method boolean Boolean.booleanValue()>
	//*  73  134:istore_1        
	//*  74  135:iload_1         
	//*  75  136:ireturn         
	//*  76  137:iconst_1        
	//*  77  138:ireturn         
		catch(Exception exception)
	//*  78  139:astore_2        
		{
			AppboyLogger.e(b, "Failed to read notifications enabled state from NotificationManagerCompat.", ((Throwable) (exception)));
	//   79  140:getstatic       #27  <Field String b>
	//   80  143:ldc2            #263 <String "Failed to read notifications enabled state from NotificationManagerCompat.">
	//   81  146:aload_2         
	//   82  147:invokestatic    #140 <Method int AppboyLogger.e(String, String, Throwable)>
	//   83  150:pop             
			return true;
	//   84  151:iconst_1        
	//   85  152:ireturn         
		}
		if(obj == null)
			return true;
		obj = dw.a(((Object) (null)), ((java.lang.reflect.Method) (obj)), new Object[] {
			c
		});
		if(obj == null)
			return true;
		method = dw.a(obj.getClass(), "areNotificationsEnabled", new Class[0]);
		if(method == null)
			return true;
		obj = dw.a(obj, method, new Object[0]);
		if(obj == null)
			break MISSING_BLOCK_LABEL_137;
		if(!(obj instanceof Boolean))
			break MISSING_BLOCK_LABEL_137;
		flag = ((Boolean)obj).booleanValue();
		return flag;
		return true;
		return true;
	//   86  153:iconst_1        
	//   87  154:ireturn         
	}

	public String e()
	{
		Object obj = ((Object) (f));
	//    0    0:aload_0         
	//    1    1:getfield        #267 <Field String f>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return ((String) (obj));
	//    5    9:aload_1         
	//    6   10:areturn         
		Object obj1 = ((Object) (c.getPackageName()));
	//    7   11:aload_0         
	//    8   12:getfield        #34  <Field Context c>
	//    9   15:invokevirtual   #270 <Method String Context.getPackageName()>
	//   10   18:astore_2        
		try
		{
			obj = ((Object) (c.getPackageManager().getPackageInfo(((String) (obj1)), 0)));
	//   11   19:aload_0         
	//   12   20:getfield        #34  <Field Context c>
	//   13   23:invokevirtual   #274 <Method PackageManager Context.getPackageManager()>
	//   14   26:aload_2         
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #280 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   17   31:astore_1        
		}
	//*  18   32:goto            87
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  19   35:astore_1        
		{
			String s = b;
	//   20   36:getstatic       #27  <Field String b>
	//   21   39:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   22   40:new             #40  <Class StringBuilder>
	//   23   43:dup             
	//   24   44:invokespecial   #41  <Method void StringBuilder()>
	//   25   47:astore          4
			stringbuilder.append("Unable to inspect package [");
	//   26   49:aload           4
	//   27   51:ldc2            #282 <String "Unable to inspect package [">
	//   28   54:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
			stringbuilder.append(((String) (obj1)));
	//   30   58:aload           4
	//   31   60:aload_2         
	//   32   61:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   33   64:pop             
			stringbuilder.append("]");
	//   34   65:aload           4
	//   35   67:ldc2            #284 <String "]">
	//   36   70:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   37   73:pop             
			AppboyLogger.e(s, stringbuilder.toString(), ((Throwable) (obj)));
	//   38   74:aload_3         
	//   39   75:aload           4
	//   40   77:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   41   80:aload_1         
	//   42   81:invokestatic    #140 <Method int AppboyLogger.e(String, String, Throwable)>
	//   43   84:pop             
			obj = null;
	//   44   85:aconst_null     
	//   45   86:astore_1        
		}
		obj1 = obj;
	//   46   87:aload_1         
	//   47   88:astore_2        
		if(obj == null)
	//*  48   89:aload_1         
	//*  49   90:ifnonnull       117
		{
			ApplicationInfo applicationinfo = c.getApplicationInfo();
	//   50   93:aload_0         
	//   51   94:getfield        #34  <Field Context c>
	//   52   97:invokevirtual   #288 <Method ApplicationInfo Context.getApplicationInfo()>
	//   53  100:astore_1        
			obj1 = ((Object) (c.getPackageManager().getPackageArchiveInfo(applicationinfo.sourceDir, 0)));
	//   54  101:aload_0         
	//   55  102:getfield        #34  <Field Context c>
	//   56  105:invokevirtual   #274 <Method PackageManager Context.getPackageManager()>
	//   57  108:aload_1         
	//   58  109:getfield        #293 <Field String ApplicationInfo.sourceDir>
	//   59  112:iconst_0        
	//   60  113:invokevirtual   #296 <Method PackageInfo PackageManager.getPackageArchiveInfo(String, int)>
	//   61  116:astore_2        
		}
		if(obj1 != null)
	//*  62  117:aload_2         
	//*  63  118:ifnull          134
		{
			f = ((PackageInfo) (obj1)).versionName;
	//   64  121:aload_0         
	//   65  122:aload_2         
	//   66  123:getfield        #301 <Field String PackageInfo.versionName>
	//   67  126:putfield        #267 <Field String f>
			return f;
	//   68  129:aload_0         
	//   69  130:getfield        #267 <Field String f>
	//   70  133:areturn         
		} else
		{
			AppboyLogger.d(b, "App version could not be read. Returning null");
	//   71  134:getstatic       #27  <Field String b>
	//   72  137:ldc2            #303 <String "App version could not be read. Returning null">
	//   73  140:invokestatic    #305 <Method int AppboyLogger.d(String, String)>
	//   74  143:pop             
			return null;
	//   75  144:aconst_null     
	//   76  145:areturn         
		}
	}

	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/bi);
	final SharedPreferences a;
	private final Context c;
	private final bn d;
	private final cz e;
	private String f;

	static 
	{
	//    0    0:ldc1            #2   <Class bi>
	//    1    2:invokestatic    #25  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #27  <Field String b>
	//*   3    8:return          
	}
}
