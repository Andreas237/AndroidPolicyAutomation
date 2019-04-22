// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.*;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.AppboyLogger;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package bo.app:
//			bu, ck, do, bv, 
//			en

public class br
	implements bu
{

	public br(Context context, AppboyConfigurationProvider appboyconfigurationprovider, bv bv1, do do1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		if(context != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          30
		{
			b = context;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #34  <Field Context b>
			f = appboyconfigurationprovider;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #36  <Field AppboyConfigurationProvider f>
			c = bv1;
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:putfield        #38  <Field bv c>
			d = do1;
	//   13   23:aload_0         
	//   14   24:aload           4
	//   15   26:putfield        #40  <Field do d>
			return;
	//   16   29:return          
		} else
		{
			throw new NullPointerException();
	//   17   30:new             #42  <Class NullPointerException>
	//   18   33:dup             
	//   19   34:invokespecial   #43  <Method void NullPointerException()>
	//   20   37:athrow          
		}
	}

	static String a(DisplayMetrics displaymetrics, boolean flag)
	{
		int i1 = displaymetrics.widthPixels;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field int DisplayMetrics.widthPixels>
	//    2    4:istore_2        
		int j1 = displaymetrics.heightPixels;
	//    3    5:aload_0         
	//    4    6:getfield        #54  <Field int DisplayMetrics.heightPixels>
	//    5    9:istore_3        
		if(flag)
	//*   6   10:iload_1         
	//*   7   11:ifeq            46
		{
			displaymetrics = ((DisplayMetrics) (new StringBuilder()));
	//    8   14:new             #56  <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #57  <Method void StringBuilder()>
	//   11   21:astore_0        
			((StringBuilder) (displaymetrics)).append(j1);
	//   12   22:aload_0         
	//   13   23:iload_3         
	//   14   24:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   15   27:pop             
			((StringBuilder) (displaymetrics)).append("x");
	//   16   28:aload_0         
	//   17   29:ldc1            #63  <String "x">
	//   18   31:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
			((StringBuilder) (displaymetrics)).append(i1);
	//   20   35:aload_0         
	//   21   36:iload_2         
	//   22   37:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   23   40:pop             
			return ((StringBuilder) (displaymetrics)).toString();
	//   24   41:aload_0         
	//   25   42:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   26   45:areturn         
		} else
		{
			displaymetrics = ((DisplayMetrics) (new StringBuilder()));
	//   27   46:new             #56  <Class StringBuilder>
	//   28   49:dup             
	//   29   50:invokespecial   #57  <Method void StringBuilder()>
	//   30   53:astore_0        
			((StringBuilder) (displaymetrics)).append(i1);
	//   31   54:aload_0         
	//   32   55:iload_2         
	//   33   56:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   34   59:pop             
			((StringBuilder) (displaymetrics)).append("x");
	//   35   60:aload_0         
	//   36   61:ldc1            #63  <String "x">
	//   37   63:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   38   66:pop             
			((StringBuilder) (displaymetrics)).append(j1);
	//   39   67:aload_0         
	//   40   68:iload_3         
	//   41   69:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   42   72:pop             
			return ((StringBuilder) (displaymetrics)).toString();
	//   43   73:aload_0         
	//   44   74:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   45   77:areturn         
		}
	}

	static String a(Locale locale)
	{
		return locale.toString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method String Locale.toString()>
	//    2    4:areturn         
	}

	private String f()
	{
		return String.valueOf(android.os.Build.VERSION.SDK_INT);
	//    0    0:getstatic       #80  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:invokestatic    #86  <Method String String.valueOf(int)>
	//    2    6:areturn         
	}

	private String g()
	{
		Object obj = ((Object) ((TelephonyManager)b.getSystemService("phone")));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Context b>
	//    2    4:ldc1            #93  <String "phone">
	//    3    6:invokevirtual   #99  <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #101 <Class TelephonyManager>
	//    5   12:astore_1        
		((TelephonyManager) (obj)).getPhoneType();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #105 <Method int TelephonyManager.getPhoneType()>
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
		obj = ((Object) (a));
	//    9   44:getstatic       #27  <Field String a>
	//   10   47:astore_1        
		  goto _L4
	//*  11   48:goto            56
_L3:
		return ((TelephonyManager) (obj)).getNetworkOperatorName();
	//   12   51:aload_1         
	//   13   52:invokevirtual   #108 <Method String TelephonyManager.getNetworkOperatorName()>
	//   14   55:areturn         
_L4:
		AppboyLogger.w(((String) (obj)), "Unknown phone type");
	//   15   56:aload_1         
	//   16   57:ldc1            #110 <String "Unknown phone type">
	//   17   59:invokestatic    #114 <Method int AppboyLogger.w(String, String)>
	//   18   62:pop             
		return null;
	//   19   63:aconst_null     
	//   20   64:areturn         
		Object obj1;
		obj1;
	//   21   65:astore_1        
		AppboyLogger.e(a, "Caught security exception while reading the phone carrier name.", ((Throwable) (obj1)));
	//   22   66:getstatic       #27  <Field String a>
	//   23   69:ldc1            #116 <String "Caught security exception while reading the phone carrier name.">
	//   24   71:aload_1         
	//   25   72:invokestatic    #119 <Method int AppboyLogger.e(String, String, Throwable)>
	//   26   75:pop             
		return null;
	//   27   76:aconst_null     
	//   28   77:areturn         
		obj1;
	//   29   78:astore_1        
		AppboyLogger.e(a, "Caught resources not found exception while reading the phone carrier name.", ((Throwable) (obj1)));
	//   30   79:getstatic       #27  <Field String a>
	//   31   82:ldc1            #121 <String "Caught resources not found exception while reading the phone carrier name.">
	//   32   84:aload_1         
	//   33   85:invokestatic    #119 <Method int AppboyLogger.e(String, String, Throwable)>
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
	//    0    0:getstatic       #127 <Field String Build.MODEL>
	//    1    3:areturn         
	}

	private Locale i()
	{
		return Locale.getDefault();
	//    0    0:invokestatic    #132 <Method Locale Locale.getDefault()>
	//    1    3:areturn         
	}

	private TimeZone j()
	{
		return TimeZone.getDefault();
	//    0    0:invokestatic    #138 <Method TimeZone TimeZone.getDefault()>
	//    1    3:areturn         
	}

	private DisplayMetrics k()
	{
		WindowManager windowmanager = (WindowManager)b.getSystemService("window");
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Context b>
	//    2    4:ldc1            #142 <String "window">
	//    3    6:invokevirtual   #99  <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #144 <Class WindowManager>
	//    5   12:astore_1        
		DisplayMetrics displaymetrics = new DisplayMetrics();
	//    6   13:new             #47  <Class DisplayMetrics>
	//    7   16:dup             
	//    8   17:invokespecial   #145 <Method void DisplayMetrics()>
	//    9   20:astore_2        
		windowmanager.getDefaultDisplay().getMetrics(displaymetrics);
	//   10   21:aload_1         
	//   11   22:invokeinterface #149 <Method Display WindowManager.getDefaultDisplay()>
	//   12   27:aload_2         
	//   13   28:invokevirtual   #155 <Method void Display.getMetrics(DisplayMetrics)>
		return displaymetrics;
	//   14   31:aload_2         
	//   15   32:areturn         
	}

	private boolean l()
	{
		int i1 = ((WindowManager)b.getSystemService("window")).getDefaultDisplay().getRotation();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Context b>
	//    2    4:ldc1            #142 <String "window">
	//    3    6:invokevirtual   #99  <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #144 <Class WindowManager>
	//    5   12:invokeinterface #149 <Method Display WindowManager.getDefaultDisplay()>
	//    6   17:invokevirtual   #160 <Method int Display.getRotation()>
	//    7   20:istore_1        
		boolean flag = true;
	//    8   21:iconst_1        
	//    9   22:istore_2        
		if(i1 != 1)
	//*  10   23:iload_1         
	//*  11   24:iconst_1        
	//*  12   25:icmpeq          37
		{
			if(i1 == 3)
	//*  13   28:iload_1         
	//*  14   29:iconst_3        
	//*  15   30:icmpne          35
				return true;
	//   16   33:iconst_1        
	//   17   34:ireturn         
			flag = false;
	//   18   35:iconst_0        
	//   19   36:istore_2        
		}
		return flag;
	//   20   37:iload_2         
	//   21   38:ireturn         
	}

	public ck a()
	{
		return new ck(f, f(), g(), h(), a(i()), j().getID(), a(k(), l()), Boolean.valueOf(d()));
	//    0    0:new             #163 <Class ck>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field AppboyConfigurationProvider f>
	//    4    8:aload_0         
	//    5    9:invokespecial   #165 <Method String f()>
	//    6   12:aload_0         
	//    7   13:invokespecial   #167 <Method String g()>
	//    8   16:aload_0         
	//    9   17:invokespecial   #169 <Method String h()>
	//   10   20:aload_0         
	//   11   21:invokespecial   #171 <Method Locale i()>
	//   12   24:invokestatic    #173 <Method String a(Locale)>
	//   13   27:aload_0         
	//   14   28:invokespecial   #175 <Method TimeZone j()>
	//   15   31:invokevirtual   #178 <Method String TimeZone.getID()>
	//   16   34:aload_0         
	//   17   35:invokespecial   #180 <Method DisplayMetrics k()>
	//   18   38:aload_0         
	//   19   39:invokespecial   #182 <Method boolean l()>
	//   20   42:invokestatic    #184 <Method String a(DisplayMetrics, boolean)>
	//   21   45:aload_0         
	//   22   46:invokevirtual   #186 <Method boolean d()>
	//   23   49:invokestatic    #191 <Method Boolean Boolean.valueOf(boolean)>
	//   24   52:invokespecial   #194 <Method void ck(AppboyConfigurationProvider, String, String, String, String, String, String, Boolean)>
	//   25   55:areturn         
	}

	public ck b()
	{
		d.a(a());
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field do d>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #196 <Method ck a()>
	//    4    8:invokevirtual   #201 <Method void do.a(ck)>
		return (ck)d.b();
	//    5   11:aload_0         
	//    6   12:getfield        #40  <Field do d>
	//    7   15:invokevirtual   #204 <Method Object do.b()>
	//    8   18:checkcast       #163 <Class ck>
	//    9   21:areturn         
	}

	public String c()
	{
		String s = c.a();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field bv c>
	//    2    4:invokeinterface #208 <Method String bv.a()>
	//    3    9:astore_1        
		if(s == null)
	//*   4   10:aload_1         
	//*   5   11:ifnonnull       23
			AppboyLogger.e(a, "Error reading deviceId, received a null value.");
	//    6   14:getstatic       #27  <Field String a>
	//    7   17:ldc1            #210 <String "Error reading deviceId, received a null value.">
	//    8   19:invokestatic    #212 <Method int AppboyLogger.e(String, String)>
	//    9   22:pop             
		return s;
	//   10   23:aload_1         
	//   11   24:areturn         
	}

	boolean d()
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #80  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          32
		{
			NotificationManager notificationmanager = (NotificationManager)b.getSystemService("notification");
	//    3    8:aload_0         
	//    4    9:getfield        #34  <Field Context b>
	//    5   12:ldc1            #216 <String "notification">
	//    6   14:invokevirtual   #99  <Method Object Context.getSystemService(String)>
	//    7   17:checkcast       #218 <Class NotificationManager>
	//    8   20:astore_2        
			if(notificationmanager != null)
	//*   9   21:aload_2         
	//*  10   22:ifnull          30
				return notificationmanager.areNotificationsEnabled();
	//   11   25:aload_2         
	//   12   26:invokevirtual   #221 <Method boolean NotificationManager.areNotificationsEnabled()>
	//   13   29:ireturn         
			else
				return true;
	//   14   30:iconst_1        
	//   15   31:ireturn         
		}
		if(android.os.Build.VERSION.SDK_INT < 19)
			break MISSING_BLOCK_LABEL_177;
	//   16   32:getstatic       #80  <Field int android.os.Build$VERSION.SDK_INT>
	//   17   35:bipush          19
	//   18   37:icmplt          177
		boolean flag;
		Object obj;
		java.lang.reflect.Method method;
		try
		{
			method = en.a("android.support.v4.app.NotificationManagerCompat", "from", new Class[] {
				android/content/Context
			});
	//   19   40:ldc1            #223 <String "android.support.v4.app.NotificationManagerCompat">
	//   20   42:ldc1            #225 <String "from">
	//   21   44:iconst_1        
	//   22   45:anewarray       Class[]
	//   23   48:dup             
	//   24   49:iconst_0        
	//   25   50:ldc1            #95  <Class Context>
	//   26   52:aastore         
	//   27   53:invokestatic    #232 <Method java.lang.reflect.Method en.a(String, String, Class[])>
	//   28   56:astore_3        
		}
	//*  29   57:aload_3         
	//*  30   58:astore_2        
	//*  31   59:aload_3         
	//*  32   60:ifnonnull       88
	//*  33   63:ldc1            #234 <String "androidx.core.app.NotificationManagerCompat">
	//*  34   65:ldc1            #225 <String "from">
	//*  35   67:iconst_1        
	//*  36   68:anewarray       Class[]
	//*  37   71:dup             
	//*  38   72:iconst_0        
	//*  39   73:ldc1            #95  <Class Context>
	//*  40   75:aastore         
	//*  41   76:invokestatic    #232 <Method java.lang.reflect.Method en.a(String, String, Class[])>
	//*  42   79:astore_3        
	//*  43   80:aload_3         
	//*  44   81:astore_2        
	//*  45   82:aload_3         
	//*  46   83:ifnonnull       88
	//*  47   86:iconst_1        
	//*  48   87:ireturn         
	//*  49   88:aconst_null     
	//*  50   89:aload_2         
	//*  51   90:iconst_1        
	//*  52   91:anewarray       Object[]
	//*  53   94:dup             
	//*  54   95:iconst_0        
	//*  55   96:aload_0         
	//*  56   97:getfield        #34  <Field Context b>
	//*  57  100:aastore         
	//*  58  101:invokestatic    #237 <Method Object en.a(Object, java.lang.reflect.Method, Object[])>
	//*  59  104:astore_2        
	//*  60  105:aload_2         
	//*  61  106:ifnonnull       111
	//*  62  109:iconst_1        
	//*  63  110:ireturn         
	//*  64  111:aload_2         
	//*  65  112:invokevirtual   #241 <Method Class Object.getClass()>
	//*  66  115:ldc1            #242 <String "areNotificationsEnabled">
	//*  67  117:iconst_0        
	//*  68  118:anewarray       Class[]
	//*  69  121:invokestatic    #245 <Method java.lang.reflect.Method en.a(Class, String, Class[])>
	//*  70  124:astore_3        
	//*  71  125:aload_3         
	//*  72  126:ifnonnull       131
	//*  73  129:iconst_1        
	//*  74  130:ireturn         
	//*  75  131:aload_2         
	//*  76  132:aload_3         
	//*  77  133:iconst_0        
	//*  78  134:anewarray       Object[]
	//*  79  137:invokestatic    #237 <Method Object en.a(Object, java.lang.reflect.Method, Object[])>
	//*  80  140:astore_2        
	//*  81  141:aload_2         
	//*  82  142:ifnull          162
	//*  83  145:aload_2         
	//*  84  146:instanceof      #188 <Class Boolean>
	//*  85  149:ifeq            162
	//*  86  152:aload_2         
	//*  87  153:checkcast       #188 <Class Boolean>
	//*  88  156:invokevirtual   #248 <Method boolean Boolean.booleanValue()>
	//*  89  159:istore_1        
	//*  90  160:iload_1         
	//*  91  161:ireturn         
	//*  92  162:iconst_1        
	//*  93  163:ireturn         
		catch(Exception exception)
	//*  94  164:astore_2        
		{
			AppboyLogger.e(a, "Failed to read notifications enabled state from NotificationManagerCompat.", ((Throwable) (exception)));
	//   95  165:getstatic       #27  <Field String a>
	//   96  168:ldc1            #250 <String "Failed to read notifications enabled state from NotificationManagerCompat.">
	//   97  170:aload_2         
	//   98  171:invokestatic    #119 <Method int AppboyLogger.e(String, String, Throwable)>
	//   99  174:pop             
			return true;
	//  100  175:iconst_1        
	//  101  176:ireturn         
		}
		obj = ((Object) (method));
		if(method != null)
			break MISSING_BLOCK_LABEL_88;
		method = en.a("androidx.core.app.NotificationManagerCompat", "from", new Class[] {
			android/content/Context
		});
		obj = ((Object) (method));
		if(method == null)
			return true;
		obj = en.a(((Object) (null)), ((java.lang.reflect.Method) (obj)), new Object[] {
			b
		});
		if(obj == null)
			return true;
		method = en.a(obj.getClass(), "areNotificationsEnabled", new Class[0]);
		if(method == null)
			return true;
		obj = en.a(obj, method, new Object[0]);
		if(obj == null)
			break MISSING_BLOCK_LABEL_162;
		if(!(obj instanceof Boolean))
			break MISSING_BLOCK_LABEL_162;
		flag = ((Boolean)obj).booleanValue();
		return flag;
		return true;
		return true;
	//  102  177:iconst_1        
	//  103  178:ireturn         
	}

	public String e()
	{
		Object obj = ((Object) (e));
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field String e>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return ((String) (obj));
	//    5    9:aload_1         
	//    6   10:areturn         
		Object obj1 = ((Object) (b.getPackageName()));
	//    7   11:aload_0         
	//    8   12:getfield        #34  <Field Context b>
	//    9   15:invokevirtual   #257 <Method String Context.getPackageName()>
	//   10   18:astore_2        
		try
		{
			obj = ((Object) (b.getPackageManager().getPackageInfo(((String) (obj1)), 0)));
	//   11   19:aload_0         
	//   12   20:getfield        #34  <Field Context b>
	//   13   23:invokevirtual   #261 <Method PackageManager Context.getPackageManager()>
	//   14   26:aload_2         
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #267 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   17   31:astore_1        
		}
	//*  18   32:goto            87
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  19   35:astore_1        
		{
			String s = a;
	//   20   36:getstatic       #27  <Field String a>
	//   21   39:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   22   40:new             #56  <Class StringBuilder>
	//   23   43:dup             
	//   24   44:invokespecial   #57  <Method void StringBuilder()>
	//   25   47:astore          4
			stringbuilder.append("Unable to inspect package [");
	//   26   49:aload           4
	//   27   51:ldc2            #269 <String "Unable to inspect package [">
	//   28   54:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
			stringbuilder.append(((String) (obj1)));
	//   30   58:aload           4
	//   31   60:aload_2         
	//   32   61:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   33   64:pop             
			stringbuilder.append("]");
	//   34   65:aload           4
	//   35   67:ldc2            #271 <String "]">
	//   36   70:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   37   73:pop             
			AppboyLogger.e(s, stringbuilder.toString(), ((Throwable) (obj)));
	//   38   74:aload_3         
	//   39   75:aload           4
	//   40   77:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   41   80:aload_1         
	//   42   81:invokestatic    #119 <Method int AppboyLogger.e(String, String, Throwable)>
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
			ApplicationInfo applicationinfo = b.getApplicationInfo();
	//   50   93:aload_0         
	//   51   94:getfield        #34  <Field Context b>
	//   52   97:invokevirtual   #275 <Method ApplicationInfo Context.getApplicationInfo()>
	//   53  100:astore_1        
			obj1 = ((Object) (b.getPackageManager().getPackageArchiveInfo(applicationinfo.sourceDir, 0)));
	//   54  101:aload_0         
	//   55  102:getfield        #34  <Field Context b>
	//   56  105:invokevirtual   #261 <Method PackageManager Context.getPackageManager()>
	//   57  108:aload_1         
	//   58  109:getfield        #280 <Field String ApplicationInfo.sourceDir>
	//   59  112:iconst_0        
	//   60  113:invokevirtual   #283 <Method PackageInfo PackageManager.getPackageArchiveInfo(String, int)>
	//   61  116:astore_2        
		}
		if(obj1 != null)
	//*  62  117:aload_2         
	//*  63  118:ifnull          134
		{
			e = ((PackageInfo) (obj1)).versionName;
	//   64  121:aload_0         
	//   65  122:aload_2         
	//   66  123:getfield        #288 <Field String PackageInfo.versionName>
	//   67  126:putfield        #254 <Field String e>
			return e;
	//   68  129:aload_0         
	//   69  130:getfield        #254 <Field String e>
	//   70  133:areturn         
		} else
		{
			AppboyLogger.d(a, "App version could not be read. Returning null");
	//   71  134:getstatic       #27  <Field String a>
	//   72  137:ldc2            #290 <String "App version could not be read. Returning null">
	//   73  140:invokestatic    #292 <Method int AppboyLogger.d(String, String)>
	//   74  143:pop             
			return null;
	//   75  144:aconst_null     
	//   76  145:areturn         
		}
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/br);
	private final Context b;
	private final bv c;
	private final do d;
	private String e;
	private final AppboyConfigurationProvider f;

	static 
	{
	//    0    0:ldc1            #2   <Class br>
	//    1    2:invokestatic    #25  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #27  <Field String a>
	//*   3    8:return          
	}
}
