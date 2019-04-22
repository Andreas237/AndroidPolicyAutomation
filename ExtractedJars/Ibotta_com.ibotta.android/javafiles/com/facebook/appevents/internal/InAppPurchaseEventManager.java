// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.internal.Utility;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

public class InAppPurchaseEventManager
{

	public InAppPurchaseEventManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}

	public static String getPurchaseDetails(Context context, String s, Object obj, boolean flag)
	{
		if(obj == null || s == "")
	//*   0    0:aload_2         
	//*   1    1:ifnull          303
	//*   2    4:aload_1         
	//*   3    5:ldc1            #44  <String "">
	//*   4    7:if_acmpne       13
			break MISSING_BLOCK_LABEL_303;
	//    5   10:goto            303
		Method method;
		Class class1;
		method = (Method)methodMap.get("iap_get_sku_details");
	//    6   13:getstatic       #20  <Field HashMap methodMap>
	//    7   16:ldc1            #46  <String "iap_get_sku_details">
	//    8   18:invokevirtual   #50  <Method Object HashMap.get(Object)>
	//    9   21:checkcast       #52  <Class Method>
	//   10   24:astore          4
		class1 = (Class)classMap.get("com.android.vending.billing.IInAppBillingService");
	//   11   26:getstatic       #22  <Field HashMap classMap>
	//   12   29:ldc1            #54  <String "com.android.vending.billing.IInAppBillingService">
	//   13   31:invokevirtual   #50  <Method Object HashMap.get(Object)>
	//   14   34:checkcast       #24  <Class Class>
	//   15   37:astore          6
		Object obj1;
		if(method != null)
	//*  16   39:aload           4
	//*  17   41:ifnull          53
		{
			obj1 = ((Object) (class1));
	//   18   44:aload           6
	//   19   46:astore          5
			if(class1 != null)
				break MISSING_BLOCK_LABEL_120;
	//   20   48:aload           6
	//   21   50:ifnonnull       120
		}
		obj1 = ((Object) (context.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService")));
	//   22   53:aload_0         
	//   23   54:invokevirtual   #60  <Method ClassLoader Context.getClassLoader()>
	//   24   57:ldc1            #54  <String "com.android.vending.billing.IInAppBillingService">
	//   25   59:invokevirtual   #66  <Method Class ClassLoader.loadClass(String)>
	//   26   62:astore          5
		method = ((Class) (obj1)).getDeclaredMethod("getSkuDetails", new Class[] {
			Integer.TYPE, java/lang/String, java/lang/String, android/os/Bundle
		});
	//   27   64:aload           5
	//   28   66:ldc1            #68  <String "getSkuDetails">
	//   29   68:iconst_4        
	//   30   69:anewarray       Class[]
	//   31   72:dup             
	//   32   73:iconst_0        
	//   33   74:getstatic       #74  <Field Class Integer.TYPE>
	//   34   77:aastore         
	//   35   78:dup             
	//   36   79:iconst_1        
	//   37   80:ldc1            #76  <Class String>
	//   38   82:aastore         
	//   39   83:dup             
	//   40   84:iconst_2        
	//   41   85:ldc1            #76  <Class String>
	//   42   87:aastore         
	//   43   88:dup             
	//   44   89:iconst_3        
	//   45   90:ldc1            #78  <Class Bundle>
	//   46   92:aastore         
	//   47   93:invokevirtual   #82  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   48   96:astore          4
		methodMap.put("iap_get_sku_details", ((Object) (method)));
	//   49   98:getstatic       #20  <Field HashMap methodMap>
	//   50  101:ldc1            #46  <String "iap_get_sku_details">
	//   51  103:aload           4
	//   52  105:invokevirtual   #86  <Method Object HashMap.put(Object, Object)>
	//   53  108:pop             
		classMap.put("com.android.vending.billing.IInAppBillingService", obj1);
	//   54  109:getstatic       #22  <Field HashMap classMap>
	//   55  112:ldc1            #54  <String "com.android.vending.billing.IInAppBillingService">
	//   56  114:aload           5
	//   57  116:invokevirtual   #86  <Method Object HashMap.put(Object, Object)>
	//   58  119:pop             
		ArrayList arraylist = new ArrayList();
	//   59  120:new             #88  <Class ArrayList>
	//   60  123:dup             
	//   61  124:invokespecial   #89  <Method void ArrayList()>
	//   62  127:astore          6
		arraylist.add(((Object) (s)));
	//   63  129:aload           6
	//   64  131:aload_1         
	//   65  132:invokevirtual   #93  <Method boolean ArrayList.add(Object)>
	//   66  135:pop             
		s = ((String) (new Bundle()));
	//   67  136:new             #78  <Class Bundle>
	//   68  139:dup             
	//   69  140:invokespecial   #94  <Method void Bundle()>
	//   70  143:astore_1        
		((Bundle) (s)).putStringArrayList("ITEM_ID_LIST", arraylist);
	//   71  144:aload_1         
	//   72  145:ldc1            #96  <String "ITEM_ID_LIST">
	//   73  147:aload           6
	//   74  149:invokevirtual   #100 <Method void Bundle.putStringArrayList(String, ArrayList)>
		obj = ((Class) (obj1)).cast(obj);
	//   75  152:aload           5
	//   76  154:aload_2         
	//   77  155:invokevirtual   #103 <Method Object Class.cast(Object)>
	//   78  158:astore_2        
		obj1 = ((Object) (context.getPackageName()));
	//   79  159:aload_0         
	//   80  160:invokevirtual   #106 <Method String Context.getPackageName()>
	//   81  163:astore          5
		if(flag)
	//*  82  165:iload_3         
	//*  83  166:ifeq            306
			context = "subs";
	//   84  169:ldc1            #108 <String "subs">
	//   85  171:astore_0        
		else
	//*  86  172:goto            175
	//*  87  175:aload           4
	//*  88  177:aload_2         
	//*  89  178:iconst_4        
	//*  90  179:anewarray       Object[]
	//*  91  182:dup             
	//*  92  183:iconst_0        
	//*  93  184:iconst_3        
	//*  94  185:invokestatic    #112 <Method Integer Integer.valueOf(int)>
	//*  95  188:aastore         
	//*  96  189:dup             
	//*  97  190:iconst_1        
	//*  98  191:aload           5
	//*  99  193:aastore         
	//* 100  194:dup             
	//* 101  195:iconst_2        
	//* 102  196:aload_0         
	//* 103  197:aastore         
	//* 104  198:dup             
	//* 105  199:iconst_3        
	//* 106  200:aload_1         
	//* 107  201:aastore         
	//* 108  202:invokevirtual   #116 <Method Object Method.invoke(Object, Object[])>
	//* 109  205:checkcast       #78  <Class Bundle>
	//* 110  208:astore_0        
	//* 111  209:aload_0         
	//* 112  210:ldc1            #118 <String "RESPONSE_CODE">
	//* 113  212:invokevirtual   #122 <Method int Bundle.getInt(String)>
	//* 114  215:ifne            300
	//* 115  218:aload_0         
	//* 116  219:ldc1            #124 <String "DETAILS_LIST">
	//* 117  221:invokevirtual   #128 <Method ArrayList Bundle.getStringArrayList(String)>
	//* 118  224:astore_0        
	//* 119  225:aload_0         
	//* 120  226:invokevirtual   #132 <Method int ArrayList.size()>
	//* 121  229:iconst_1        
	//* 122  230:icmpge          236
	//* 123  233:ldc1            #44  <String "">
	//* 124  235:areturn         
	//* 125  236:aload_0         
	//* 126  237:iconst_0        
	//* 127  238:invokevirtual   #135 <Method Object ArrayList.get(int)>
	//* 128  241:checkcast       #76  <Class String>
	//* 129  244:astore_0        
	//* 130  245:aload_0         
	//* 131  246:areturn         
	//* 132  247:astore_0        
	//* 133  248:getstatic       #30  <Field String TAG>
	//* 134  251:ldc1            #137 <String "Illegal access to method com.android.vending.billing.IInAppBillingService.getSkuDetails">
	//* 135  253:aload_0         
	//* 136  254:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
	//* 137  257:pop             
	//* 138  258:goto            300
	//* 139  261:astore_0        
	//* 140  262:getstatic       #30  <Field String TAG>
	//* 141  265:ldc1            #145 <String "Invocation target exception in com.android.vending.billing.IInAppBillingService.getSkuDetails">
	//* 142  267:aload_0         
	//* 143  268:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
	//* 144  271:pop             
	//* 145  272:goto            300
	//* 146  275:astore_0        
	//* 147  276:getstatic       #30  <Field String TAG>
	//* 148  279:ldc1            #147 <String "com.android.vending.billing.IInAppBillingService.getSkuDetails method is not available">
	//* 149  281:aload_0         
	//* 150  282:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
	//* 151  285:pop             
	//* 152  286:goto            300
	//* 153  289:astore_0        
	//* 154  290:getstatic       #30  <Field String TAG>
	//* 155  293:ldc1            #149 <String "com.android.vending.billing.IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to the project, and import the IInAppBillingService.aidl file into this package">
	//* 156  295:aload_0         
	//* 157  296:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
	//* 158  299:pop             
	//* 159  300:ldc1            #44  <String "">
	//* 160  302:areturn         
	//* 161  303:ldc1            #44  <String "">
	//* 162  305:areturn         
			context = "inapp";
	//  163  306:ldc1            #151 <String "inapp">
	//  164  308:astore_0        
		context = ((Context) ((Bundle)method.invoke(obj, new Object[] {
			Integer.valueOf(3), obj1, context, s
		})));
		if(((Bundle) (context)).getInt("RESPONSE_CODE") != 0)
			break MISSING_BLOCK_LABEL_300;
		context = ((Context) (((Bundle) (context)).getStringArrayList("DETAILS_LIST")));
		if(((ArrayList) (context)).size() < 1)
			return "";
		context = ((Context) ((String)((ArrayList) (context)).get(0)));
		return ((String) (context));
		context;
		Log.e(TAG, "Illegal access to method com.android.vending.billing.IInAppBillingService.getSkuDetails", ((Throwable) (context)));
		break MISSING_BLOCK_LABEL_300;
		context;
		Log.e(TAG, "Invocation target exception in com.android.vending.billing.IInAppBillingService.getSkuDetails", ((Throwable) (context)));
		break MISSING_BLOCK_LABEL_300;
		context;
		Log.e(TAG, "com.android.vending.billing.IInAppBillingService.getSkuDetails method is not available", ((Throwable) (context)));
		break MISSING_BLOCK_LABEL_300;
		context;
		Log.e(TAG, "com.android.vending.billing.IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to the project, and import the IInAppBillingService.aidl file into this package", ((Throwable) (context)));
		return "";
		return "";
	//* 165  309:goto            175
	}

	public static Object getServiceInterface(Context context, IBinder ibinder)
	{
		Method method;
		Method method1;
		try
		{
			method1 = (Method)methodMap.get("iap_get_interface");
	//    0    0:getstatic       #20  <Field HashMap methodMap>
	//    1    3:ldc1            #155 <String "iap_get_interface">
	//    2    5:invokevirtual   #50  <Method Object HashMap.get(Object)>
	//    3    8:checkcast       #52  <Class Method>
	//    4   11:astore_3        
		}
	//*   5   12:aload_3         
	//*   6   13:astore_2        
	//*   7   14:aload_3         
	//*   8   15:ifnonnull       52
	//*   9   18:aload_0         
	//*  10   19:invokevirtual   #60  <Method ClassLoader Context.getClassLoader()>
	//*  11   22:ldc1            #157 <String "com.android.vending.billing.IInAppBillingService$Stub">
	//*  12   24:invokevirtual   #66  <Method Class ClassLoader.loadClass(String)>
	//*  13   27:ldc1            #159 <String "asInterface">
	//*  14   29:iconst_1        
	//*  15   30:anewarray       Class[]
	//*  16   33:dup             
	//*  17   34:iconst_0        
	//*  18   35:ldc1            #161 <Class IBinder>
	//*  19   37:aastore         
	//*  20   38:invokevirtual   #82  <Method Method Class.getDeclaredMethod(String, Class[])>
	//*  21   41:astore_2        
	//*  22   42:getstatic       #20  <Field HashMap methodMap>
	//*  23   45:ldc1            #155 <String "iap_get_interface">
	//*  24   47:aload_2         
	//*  25   48:invokevirtual   #86  <Method Object HashMap.put(Object, Object)>
	//*  26   51:pop             
	//*  27   52:getstatic       #30  <Field String TAG>
	//*  28   55:ldc1            #163 <String "In-app billing service connected">
	//*  29   57:invokestatic    #169 <Method void Utility.logd(String, String)>
	//*  30   60:aload_2         
	//*  31   61:aconst_null     
	//*  32   62:iconst_1        
	//*  33   63:anewarray       Object[]
	//*  34   66:dup             
	//*  35   67:iconst_0        
	//*  36   68:aload_1         
	//*  37   69:aastore         
	//*  38   70:invokevirtual   #116 <Method Object Method.invoke(Object, Object[])>
	//*  39   73:astore_0        
	//*  40   74:aload_0         
	//*  41   75:areturn         
	//*  42   76:astore_0        
	//*  43   77:getstatic       #30  <Field String TAG>
	//*  44   80:ldc1            #171 <String "Invocation target exception in com.android.vending.billing.IInAppBillingService$Stub.asInterface">
	//*  45   82:aload_0         
	//*  46   83:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
	//*  47   86:pop             
	//*  48   87:aconst_null     
	//*  49   88:areturn         
	//*  50   89:astore_0        
	//*  51   90:getstatic       #30  <Field String TAG>
	//*  52   93:ldc1            #173 <String "Illegal access to method com.android.vending.billing.IInAppBillingService$Stub.asInterface">
	//*  53   95:aload_0         
	//*  54   96:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
	//*  55   99:pop             
	//*  56  100:aconst_null     
	//*  57  101:areturn         
	//*  58  102:astore_0        
	//*  59  103:getstatic       #30  <Field String TAG>
	//*  60  106:ldc1            #175 <String "com.android.vending.billing.IInAppBillingService$Stub.asInterface method not found">
	//*  61  108:aload_0         
	//*  62  109:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
	//*  63  112:pop             
	//*  64  113:aconst_null     
	//*  65  114:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  66  115:astore_0        
		{
			Log.e(TAG, "com.android.vending.billing.IInAppBillingService$Stub is not available, please add com.android.vending.billing.IInAppBillingService to the project.", ((Throwable) (context)));
	//   67  116:getstatic       #30  <Field String TAG>
	//   68  119:ldc1            #177 <String "com.android.vending.billing.IInAppBillingService$Stub is not available, please add com.android.vending.billing.IInAppBillingService to the project.">
	//   69  121:aload_0         
	//   70  122:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
	//   71  125:pop             
			return ((Object) (null));
	//   72  126:aconst_null     
	//   73  127:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			Log.e(TAG, "com.android.vending.billing.IInAppBillingService$Stub.asInterface method not found", ((Throwable) (context)));
			return ((Object) (null));
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			Log.e(TAG, "Illegal access to method com.android.vending.billing.IInAppBillingService$Stub.asInterface", ((Throwable) (context)));
			return ((Object) (null));
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			Log.e(TAG, "Invocation target exception in com.android.vending.billing.IInAppBillingService$Stub.asInterface", ((Throwable) (context)));
			return ((Object) (null));
		}
		method = method1;
		if(method1 != null)
			break MISSING_BLOCK_LABEL_52;
		method = context.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService$Stub").getDeclaredMethod("asInterface", new Class[] {
			android/os/IBinder
		});
		methodMap.put("iap_get_interface", ((Object) (method)));
		Utility.logd(TAG, "In-app billing service connected");
		context = ((Context) (method.invoke(((Object) (null)), new Object[] {
			ibinder
		})));
		return ((Object) (context));
	}

	private static final String TAG = ((Class) (com/facebook/appevents/internal/InAppPurchaseEventManager)).getCanonicalName();
	private static final HashMap classMap = new HashMap();
	private static final HashMap methodMap = new HashMap();

	static 
	{
	//    0    0:new             #15  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void HashMap()>
	//    3    7:putstatic       #20  <Field HashMap methodMap>
	//    4   10:new             #15  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #18  <Method void HashMap()>
	//    7   17:putstatic       #22  <Field HashMap classMap>
	//    8   20:ldc1            #2   <Class InAppPurchaseEventManager>
	//    9   22:invokevirtual   #28  <Method String Class.getCanonicalName()>
	//   10   25:putstatic       #30  <Field String TAG>
	//*  11   28:return          
	}
}
