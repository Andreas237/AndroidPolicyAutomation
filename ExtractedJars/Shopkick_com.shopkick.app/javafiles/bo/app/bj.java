// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import com.appboy.Appboy;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;

// Referenced classes of package bo.app:
//			dp, dw

public class bj
{

	public bj(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		c = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field Context c>
	//    5    9:return          
	}

	public static boolean a(Context context, AppboyConfigurationProvider appboyconfigurationprovider)
	{
		if(StringUtils.isNullOrEmpty(appboyconfigurationprovider.getFirebaseCloudMessagingSenderIdKey()))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #42  <Method String AppboyConfigurationProvider.getFirebaseCloudMessagingSenderIdKey()>
	//*   2    4:invokestatic    #48  <Method boolean StringUtils.isNullOrEmpty(String)>
	//*   3    7:ifeq            21
		{
			AppboyLogger.w(a, "Firebase Cloud Messaging requires a non-null and non-empty sender ID.");
	//    4   10:getstatic       #20  <Field String a>
	//    5   13:ldc1            #50  <String "Firebase Cloud Messaging requires a non-null and non-empty sender ID.">
	//    6   15:invokestatic    #54  <Method int AppboyLogger.w(String, String)>
	//    7   18:pop             
			return false;
	//    8   19:iconst_0        
	//    9   20:ireturn         
		}
		if(!dp.b(context))
	//*  10   21:aload_0         
	//*  11   22:invokestatic    #59  <Method boolean dp.b(Context)>
	//*  12   25:ifne            39
		{
			AppboyLogger.w(a, "Firebase Cloud Messaging requires the Google Play Store to be installed.");
	//   13   28:getstatic       #20  <Field String a>
	//   14   31:ldc1            #61  <String "Firebase Cloud Messaging requires the Google Play Store to be installed.">
	//   15   33:invokestatic    #54  <Method int AppboyLogger.w(String, String)>
	//   16   36:pop             
			return false;
	//   17   37:iconst_0        
	//   18   38:ireturn         
		}
		int i;
		int j;
		String as[];
		StringBuilder stringbuilder;
		try
		{
			appboyconfigurationprovider = ((AppboyConfigurationProvider) (((Class) (bo/app/bj)).getClassLoader()));
	//   19   39:ldc1            #2   <Class bj>
	//   20   41:invokevirtual   #67  <Method ClassLoader Class.getClassLoader()>
	//   21   44:astore_1        
			as = b;
	//   22   45:getstatic       #26  <Field String[] b>
	//   23   48:astore          4
			j = as.length;
	//   24   50:aload           4
	//   25   52:arraylength     
	//   26   53:istore_3        
		}
	//*  27   54:iconst_0        
	//*  28   55:istore_2        
	//*  29   56:iload_2         
	//*  30   57:iload_3         
	//*  31   58:icmpge          122
	//*  32   61:aload           4
	//*  33   63:iload_2         
	//*  34   64:aaload          
	//*  35   65:astore_0        
	//*  36   66:aload_0         
	//*  37   67:iconst_0        
	//*  38   68:aload_1         
	//*  39   69:invokestatic    #71  <Method Class Class.forName(String, boolean, ClassLoader)>
	//*  40   72:ifnonnull       115
	//*  41   75:getstatic       #20  <Field String a>
	//*  42   78:astore_1        
	//*  43   79:new             #73  <Class StringBuilder>
	//*  44   82:dup             
	//*  45   83:invokespecial   #74  <Method void StringBuilder()>
	//*  46   86:astore          4
	//*  47   88:aload           4
	//*  48   90:ldc1            #76  <String "Automatic registration for Firebase Cloud Messaging requires the following class to be present: ">
	//*  49   92:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//*  50   95:pop             
	//*  51   96:aload           4
	//*  52   98:aload_0         
	//*  53   99:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//*  54  102:pop             
	//*  55  103:aload_1         
	//*  56  104:aload           4
	//*  57  106:invokevirtual   #83  <Method String StringBuilder.toString()>
	//*  58  109:invokestatic    #54  <Method int AppboyLogger.w(String, String)>
	//*  59  112:pop             
	//*  60  113:iconst_0        
	//*  61  114:ireturn         
	//*  62  115:iload_2         
	//*  63  116:iconst_1        
	//*  64  117:iadd            
	//*  65  118:istore_2        
	//*  66  119:goto            56
	//*  67  122:iconst_1        
	//*  68  123:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  69  124:astore_0        
		{
			AppboyLogger.e(a, "Caught error while checking for required classes for Firebase Cloud Messaging.", ((Throwable) (context)));
	//   70  125:getstatic       #20  <Field String a>
	//   71  128:ldc1            #85  <String "Caught error while checking for required classes for Firebase Cloud Messaging.">
	//   72  130:aload_0         
	//   73  131:invokestatic    #89  <Method int AppboyLogger.e(String, String, Throwable)>
	//   74  134:pop             
			return false;
	//   75  135:iconst_0        
	//   76  136:ireturn         
		}
		i = 0;
		if(i >= j)
			break;
		context = ((Context) (as[i]));
		if(Class.forName(((String) (context)), false, ((ClassLoader) (appboyconfigurationprovider))) != null)
			break MISSING_BLOCK_LABEL_115;
		appboyconfigurationprovider = ((AppboyConfigurationProvider) (a));
		stringbuilder = new StringBuilder();
		stringbuilder.append("Automatic registration for Firebase Cloud Messaging requires the following class to be present: ");
		stringbuilder.append(((String) (context)));
		AppboyLogger.w(((String) (appboyconfigurationprovider)), stringbuilder.toString());
		return false;
		for(i++; true;)
			break MISSING_BLOCK_LABEL_56;

		return true;
	}

	private static String b(String s)
	{
		Object obj;
		java.lang.reflect.Method method;
		try
		{
			obj = ((Object) (dw.a("com.google.firebase.iid.FirebaseInstanceId", "getInstance", new Class[0])));
	//    0    0:ldc1            #24  <String "com.google.firebase.iid.FirebaseInstanceId">
	//    1    2:ldc1            #93  <String "getInstance">
	//    2    4:iconst_0        
	//    3    5:anewarray       Class[]
	//    4    8:invokestatic    #98  <Method java.lang.reflect.Method dw.a(String, String, Class[])>
	//    5   11:astore_1        
		}
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       27
	//*   8   16:getstatic       #20  <Field String a>
	//*   9   19:ldc1            #100 <String "Firebase Cloud Messaging 'getInstance' method could not obtained. Not registering for Firebase Cloud Messaging.">
	//*  10   21:invokestatic    #103 <Method int AppboyLogger.d(String, String)>
	//*  11   24:pop             
	//*  12   25:aconst_null     
	//*  13   26:areturn         
	//*  14   27:aconst_null     
	//*  15   28:aload_1         
	//*  16   29:iconst_0        
	//*  17   30:anewarray       Object[]
	//*  18   33:invokestatic    #106 <Method Object dw.a(Object, java.lang.reflect.Method, Object[])>
	//*  19   36:astore_1        
	//*  20   37:aload_1         
	//*  21   38:ifnonnull       52
	//*  22   41:getstatic       #20  <Field String a>
	//*  23   44:ldc1            #108 <String "Firebase Cloud Messaging 'InstanceId' object could not invoked. Not registering for Firebase Cloud Messaging.">
	//*  24   46:invokestatic    #103 <Method int AppboyLogger.d(String, String)>
	//*  25   49:pop             
	//*  26   50:aconst_null     
	//*  27   51:areturn         
	//*  28   52:aload_1         
	//*  29   53:invokevirtual   #112 <Method Class Object.getClass()>
	//*  30   56:ldc1            #114 <String "getToken">
	//*  31   58:iconst_2        
	//*  32   59:anewarray       Class[]
	//*  33   62:dup             
	//*  34   63:iconst_0        
	//*  35   64:ldc1            #22  <Class String>
	//*  36   66:aastore         
	//*  37   67:dup             
	//*  38   68:iconst_1        
	//*  39   69:ldc1            #22  <Class String>
	//*  40   71:aastore         
	//*  41   72:invokestatic    #117 <Method java.lang.reflect.Method dw.a(Class, String, Class[])>
	//*  42   75:astore_2        
	//*  43   76:aload_2         
	//*  44   77:ifnonnull       91
	//*  45   80:getstatic       #20  <Field String a>
	//*  46   83:ldc1            #119 <String "Firebase Cloud Messaging 'FirebaseInstanceId.getInstance().getToken()' method could not obtained. Not registering for Firebase Cloud Messaging.">
	//*  47   85:invokestatic    #103 <Method int AppboyLogger.d(String, String)>
	//*  48   88:pop             
	//*  49   89:aconst_null     
	//*  50   90:areturn         
	//*  51   91:aload_1         
	//*  52   92:aload_2         
	//*  53   93:iconst_2        
	//*  54   94:anewarray       Object[]
	//*  55   97:dup             
	//*  56   98:iconst_0        
	//*  57   99:aload_0         
	//*  58  100:aastore         
	//*  59  101:dup             
	//*  60  102:iconst_1        
	//*  61  103:ldc1            #121 <String "FCM">
	//*  62  105:aastore         
	//*  63  106:invokestatic    #106 <Method Object dw.a(Object, java.lang.reflect.Method, Object[])>
	//*  64  109:astore_0        
	//*  65  110:aload_0         
	//*  66  111:ifnull          128
	//*  67  114:aload_0         
	//*  68  115:instanceof      #22  <Class String>
	//*  69  118:ifeq            128
	//*  70  121:aload_0         
	//*  71  122:checkcast       #22  <Class String>
	//*  72  125:astore_0        
	//*  73  126:aload_0         
	//*  74  127:areturn         
	//*  75  128:aconst_null     
	//*  76  129:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  77  130:astore_0        
		{
			AppboyLogger.e(a, "Failed to register for Firebase Cloud Messaging", ((Throwable) (s)));
	//   78  131:getstatic       #20  <Field String a>
	//   79  134:ldc1            #123 <String "Failed to register for Firebase Cloud Messaging">
	//   80  136:aload_0         
	//   81  137:invokestatic    #89  <Method int AppboyLogger.e(String, String, Throwable)>
	//   82  140:pop             
			return null;
	//   83  141:aconst_null     
	//   84  142:areturn         
		}
		if(obj != null)
			break MISSING_BLOCK_LABEL_27;
		AppboyLogger.d(a, "Firebase Cloud Messaging 'getInstance' method could not obtained. Not registering for Firebase Cloud Messaging.");
		return null;
		obj = dw.a(((Object) (null)), ((java.lang.reflect.Method) (obj)), new Object[0]);
		if(obj != null)
			break MISSING_BLOCK_LABEL_52;
		AppboyLogger.d(a, "Firebase Cloud Messaging 'InstanceId' object could not invoked. Not registering for Firebase Cloud Messaging.");
		return null;
		method = dw.a(obj.getClass(), "getToken", new Class[] {
			java/lang/String, java/lang/String
		});
		if(method != null)
			break MISSING_BLOCK_LABEL_91;
		AppboyLogger.d(a, "Firebase Cloud Messaging 'FirebaseInstanceId.getInstance().getToken()' method could not obtained. Not registering for Firebase Cloud Messaging.");
		return null;
		s = ((String) (dw.a(obj, method, new Object[] {
			s, "FCM"
		})));
		if(s == null)
			break MISSING_BLOCK_LABEL_128;
		if(!(s instanceof String))
			break MISSING_BLOCK_LABEL_128;
		s = (String)s;
		return s;
		return null;
	}

	public void a(String s)
	{
		s = b(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #127 <Method String b(String)>
	//    2    4:astore_1        
		if(!StringUtils.isNullOrEmpty(s))
	//*   3    5:aload_1         
	//*   4    6:invokestatic    #48  <Method boolean StringUtils.isNullOrEmpty(String)>
	//*   5    9:ifne            24
		{
			Appboy.getInstance(c).registerAppboyPushMessages(s);
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field Context c>
	//    8   16:invokestatic    #132 <Method Appboy Appboy.getInstance(Context)>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #135 <Method void Appboy.registerAppboyPushMessages(String)>
			return;
	//   11   23:return          
		} else
		{
			AppboyLogger.w(a, "Obtained an empty or null Firebase Cloud Messaging registration token. Not registering token.");
	//   12   24:getstatic       #20  <Field String a>
	//   13   27:ldc1            #137 <String "Obtained an empty or null Firebase Cloud Messaging registration token. Not registering token.">
	//   14   29:invokestatic    #54  <Method int AppboyLogger.w(String, String)>
	//   15   32:pop             
			return;
	//   16   33:return          
		}
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/bj);
	private static final String b[] = {
		"com.google.firebase.iid.FirebaseInstanceId"
	};
	private final Context c;

	static 
	{
	//    0    0:ldc1            #2   <Class bj>
	//    1    2:invokestatic    #18  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #20  <Field String a>
	//    3    8:iconst_1        
	//    4    9:anewarray       String[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:ldc1            #24  <String "com.google.firebase.iid.FirebaseInstanceId">
	//    8   16:aastore         
	//    9   17:putstatic       #26  <Field String[] b>
	//*  10   20:return          
	}
}
