// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.FacebookSdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.appevents.internal:
//			SubscriptionType

class InAppPurchaseEventManager
{

	InAppPurchaseEventManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method void Object()>
	//    2    4:return          
	}

	public static Object asInterface(Context context, IBinder ibinder)
	{
		return invokeMethod(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", ((Object) (null)), new Object[] {
			ibinder
		});
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <String "com.android.vending.billing.IInAppBillingService$Stub">
	//    2    3:ldc1            #8   <String "asInterface">
	//    3    5:aconst_null     
	//    4    6:iconst_1        
	//    5    7:anewarray       Object[]
	//    6   10:dup             
	//    7   11:iconst_0        
	//    8   12:aload_1         
	//    9   13:aastore         
	//   10   14:invokestatic    #130 <Method Object invokeMethod(Context, String, String, Object, Object[])>
	//   11   17:areturn         
	}

	public static void clearSkuDetailsCache()
	{
		long l = System.currentTimeMillis() / 1000L;
	//    0    0:invokestatic    #138 <Method long System.currentTimeMillis()>
	//    1    3:ldc2w           #139 <Long 1000L>
	//    2    6:ldiv            
	//    3    7:lstore_0        
		long l1 = skuDetailSharedPrefs.getLong("LAST_CLEARED_TIME", 0L);
	//    4    8:getstatic       #118 <Field SharedPreferences skuDetailSharedPrefs>
	//    5   11:ldc1            #42  <String "LAST_CLEARED_TIME">
	//    6   13:lconst_0        
	//    7   14:invokeinterface #146 <Method long SharedPreferences.getLong(String, long)>
	//    8   19:lstore_2        
		if(l1 == 0L)
	//*   9   20:lload_2         
	//*  10   21:lconst_0        
	//*  11   22:lcmp            
	//*  12   23:ifne            48
		{
			skuDetailSharedPrefs.edit().putLong("LAST_CLEARED_TIME", l).apply();
	//   13   26:getstatic       #118 <Field SharedPreferences skuDetailSharedPrefs>
	//   14   29:invokeinterface #150 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   15   34:ldc1            #42  <String "LAST_CLEARED_TIME">
	//   16   36:lload_0         
	//   17   37:invokeinterface #156 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   18   42:invokeinterface #159 <Method void android.content.SharedPreferences$Editor.apply()>
			return;
	//   19   47:return          
		}
		if(l - l1 > 0x93a80L)
	//*  20   48:lload_0         
	//*  21   49:lload_2         
	//*  22   50:lsub            
	//*  23   51:ldc2w           #160 <Long 0x93a80L>
	//*  24   54:lcmp            
	//*  25   55:ifle            84
			skuDetailSharedPrefs.edit().clear().putLong("LAST_CLEARED_TIME", l).apply();
	//   26   58:getstatic       #118 <Field SharedPreferences skuDetailSharedPrefs>
	//   27   61:invokeinterface #150 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   28   66:invokeinterface #164 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//   29   71:ldc1            #42  <String "LAST_CLEARED_TIME">
	//   30   73:lload_0         
	//   31   74:invokeinterface #156 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   32   79:invokeinterface #159 <Method void android.content.SharedPreferences$Editor.apply()>
	//   33   84:return          
	}

	private static ArrayList filterPurchasesInapp(ArrayList arraylist)
	{
		long l;
		ArrayList arraylist1;
		android.content.SharedPreferences.Editor editor;
		arraylist1 = new ArrayList();
	//    0    0:new             #170 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #171 <Method void ArrayList()>
	//    3    7:astore          5
		editor = purchaseInappSharedPrefs.edit();
	//    4    9:getstatic       #120 <Field SharedPreferences purchaseInappSharedPrefs>
	//    5   12:invokeinterface #150 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    6   17:astore          6
		l = System.currentTimeMillis() / 1000L;
	//    7   19:invokestatic    #138 <Method long System.currentTimeMillis()>
	//    8   22:ldc2w           #139 <Long 1000L>
	//    9   25:ldiv            
	//   10   26:lstore_1        
		arraylist = ((ArrayList) (arraylist.iterator()));
	//   11   27:aload_0         
	//   12   28:invokevirtual   #175 <Method Iterator ArrayList.iterator()>
	//   13   31:astore_0        
_L2:
		String s;
		if(!((Iterator) (arraylist)).hasNext())
			break; /* Loop/switch isn't completed */
	//   14   32:aload_0         
	//   15   33:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//   16   38:ifeq            168
		s = (String)((Iterator) (arraylist)).next();
	//   17   41:aload_0         
	//   18   42:invokeinterface #185 <Method Object Iterator.next()>
	//   19   47:checkcast       #187 <Class String>
	//   20   50:astore          7
		String s1;
		Object obj;
		obj = ((Object) (new JSONObject(s)));
	//   21   52:new             #189 <Class JSONObject>
	//   22   55:dup             
	//   23   56:aload           7
	//   24   58:invokespecial   #192 <Method void JSONObject(String)>
	//   25   61:astore          9
		s1 = ((JSONObject) (obj)).getString("productId");
	//   26   63:aload           9
	//   27   65:ldc1            #194 <String "productId">
	//   28   67:invokevirtual   #198 <Method String JSONObject.getString(String)>
	//   29   70:astore          8
		long l1 = ((JSONObject) (obj)).getLong("purchaseTime");
	//   30   72:aload           9
	//   31   74:ldc1            #200 <String "purchaseTime">
	//   32   76:invokevirtual   #203 <Method long JSONObject.getLong(String)>
	//   33   79:lstore_3        
		obj = ((Object) (((JSONObject) (obj)).getString("purchaseToken")));
	//   34   80:aload           9
	//   35   82:ldc1            #205 <String "purchaseToken">
	//   36   84:invokevirtual   #198 <Method String JSONObject.getString(String)>
	//   37   87:astore          9
		if(l - l1 / 1000L > 43200L)
	//*  38   89:lload_1         
	//*  39   90:lload_3         
	//*  40   91:ldc2w           #139 <Long 1000L>
	//*  41   94:ldiv            
	//*  42   95:lsub            
	//*  43   96:ldc2w           #206 <Long 43200L>
	//*  44   99:lcmp            
	//*  45  100:ifle            106
			continue; /* Loop/switch isn't completed */
	//   46  103:goto            32
		if(!purchaseInappSharedPrefs.getString(s1, "").equals(obj))
	//*  47  106:getstatic       #120 <Field SharedPreferences purchaseInappSharedPrefs>
	//*  48  109:aload           8
	//*  49  111:ldc1            #209 <String "">
	//*  50  113:invokeinterface #212 <Method String SharedPreferences.getString(String, String)>
	//*  51  118:aload           9
	//*  52  120:invokevirtual   #216 <Method boolean String.equals(Object)>
	//*  53  123:ifeq            129
	//*  54  126:goto            32
			try
			{
				editor.putString(s1, ((String) (obj)));
	//   55  129:aload           6
	//   56  131:aload           8
	//   57  133:aload           9
	//   58  135:invokeinterface #220 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   59  140:pop             
				arraylist1.add(((Object) (s)));
	//   60  141:aload           5
	//   61  143:aload           7
	//   62  145:invokevirtual   #223 <Method boolean ArrayList.add(Object)>
	//   63  148:pop             
			}
	//*  64  149:goto            32
			catch(JSONException jsonexception)
	//*  65  152:astore          7
			{
				Log.e(TAG, "parsing purchase failure: ", ((Throwable) (jsonexception)));
	//   66  154:getstatic       #90  <Field String TAG>
	//   67  157:ldc1            #225 <String "parsing purchase failure: ">
	//   68  159:aload           7
	//   69  161:invokestatic    #231 <Method int Log.e(String, String, Throwable)>
	//   70  164:pop             
			}
		if(true) goto _L2; else goto _L1
	//   71  165:goto            32
_L1:
		editor.apply();
	//   72  168:aload           6
	//   73  170:invokeinterface #159 <Method void android.content.SharedPreferences$Editor.apply()>
		return arraylist1;
	//   74  175:aload           5
	//   75  177:areturn         
	}

	private static Class getClass(Context context, String s)
	{
		Object obj = ((Object) ((Class)classMap.get(((Object) (s)))));
	//    0    0:getstatic       #99  <Field HashMap classMap>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #241 <Method Object HashMap.get(Object)>
	//    3    7:checkcast       #84  <Class Class>
	//    4   10:astore_2        
		if(obj != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          17
			return ((Class) (obj));
	//    7   15:aload_2         
	//    8   16:areturn         
		try
		{
			context = ((Context) (context.getClassLoader().loadClass(s)));
	//    9   17:aload_0         
	//   10   18:invokevirtual   #245 <Method ClassLoader Context.getClassLoader()>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #251 <Method Class ClassLoader.loadClass(String)>
	//   13   25:astore_0        
		}
	//*  14   26:aload_0         
	//*  15   27:astore_2        
	//*  16   28:getstatic       #99  <Field HashMap classMap>
	//*  17   31:aload_1         
	//*  18   32:aload_0         
	//*  19   33:invokevirtual   #255 <Method Object HashMap.put(Object, Object)>
	//*  20   36:pop             
	//*  21   37:aload_0         
	//*  22   38:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  23   39:astore_0        
		{
			String s1 = TAG;
	//   24   40:getstatic       #90  <Field String TAG>
	//   25   43:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   26   44:new             #257 <Class StringBuilder>
	//   27   47:dup             
	//   28   48:invokespecial   #258 <Method void StringBuilder()>
	//   29   51:astore          4
			stringbuilder.append(s);
	//   30   53:aload           4
	//   31   55:aload_1         
	//   32   56:invokevirtual   #262 <Method StringBuilder StringBuilder.append(String)>
	//   33   59:pop             
			stringbuilder.append(" is not available, please add ");
	//   34   60:aload           4
	//   35   62:ldc2            #264 <String " is not available, please add ">
	//   36   65:invokevirtual   #262 <Method StringBuilder StringBuilder.append(String)>
	//   37   68:pop             
			stringbuilder.append(s);
	//   38   69:aload           4
	//   39   71:aload_1         
	//   40   72:invokevirtual   #262 <Method StringBuilder StringBuilder.append(String)>
	//   41   75:pop             
			stringbuilder.append(" to the project.");
	//   42   76:aload           4
	//   43   78:ldc2            #266 <String " to the project.">
	//   44   81:invokevirtual   #262 <Method StringBuilder StringBuilder.append(String)>
	//   45   84:pop             
			Log.e(s1, stringbuilder.toString(), ((Throwable) (context)));
	//   46   85:aload_3         
	//   47   86:aload           4
	//   48   88:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   49   91:aload_0         
	//   50   92:invokestatic    #231 <Method int Log.e(String, String, Throwable)>
	//   51   95:pop             
			return ((Class) (obj));
	//   52   96:aload_2         
	//   53   97:areturn         
		}
		obj = ((Object) (context));
		classMap.put(((Object) (s)), ((Object) (context)));
		return ((Class) (context));
	}

	private static Method getMethod(Class class1, String s)
	{
		byte byte0;
		Class aclass[];
		Method method1;
		Method method2;
		method2 = (Method)methodMap.get(((Object) (s)));
	//    0    0:getstatic       #97  <Field HashMap methodMap>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #241 <Method Object HashMap.get(Object)>
	//    3    7:checkcast       #276 <Class Method>
	//    4   10:astore          5
		if(method2 != null)
	//*   5   12:aload           5
	//*   6   14:ifnull          20
			return method2;
	//    7   17:aload           5
	//    8   19:areturn         
		aclass = null;
	//    9   20:aconst_null     
	//   10   21:astore_3        
		byte0 = -1;
	//   11   22:iconst_m1       
	//   12   23:istore_2        
		method1 = method2;
	//   13   24:aload           5
	//   14   26:astore          4
		s.hashCode();
	//   15   28:aload_1         
	//   16   29:invokevirtual   #280 <Method int String.hashCode()>
		JVM INSTR lookupswitch 5: default 429
	//	               -1801122596: 156
	//	               -1450694211: 138
	//	               -1123215065: 120
	//	               -594356707: 102
	//	               -573310373: 84;
	//   17   32:lookupswitch    5: default 429
	//	               -1801122596: 156
	//	               -1450694211: 138
	//	               -1123215065: 120
	//	               -594356707: 102
	//	               -573310373: 84
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
		method1 = method2;
	//   18   84:aload           5
	//   19   86:astore          4
		if(s.equals("getSkuDetails"))
	//*  20   88:aload_1         
	//*  21   89:ldc1            #22  <String "getSkuDetails">
	//*  22   91:invokevirtual   #216 <Method boolean String.equals(Object)>
	//*  23   94:ifeq            429
			byte0 = 1;
	//   24   97:iconst_1        
	//   25   98:istore_2        
		  goto _L1
	//*  26   99:goto            429
_L5:
		method1 = method2;
	//   27  102:aload           5
	//   28  104:astore          4
		if(s.equals("getPurchaseHistory"))
	//*  29  106:aload_1         
	//*  30  107:ldc1            #19  <String "getPurchaseHistory">
	//*  31  109:invokevirtual   #216 <Method boolean String.equals(Object)>
	//*  32  112:ifeq            429
			byte0 = 4;
	//   33  115:iconst_4        
	//   34  116:istore_2        
		  goto _L1
	//*  35  117:goto            429
_L4:
		method1 = method2;
	//   36  120:aload           5
	//   37  122:astore          4
		if(s.equals("asInterface"))
	//*  38  124:aload_1         
	//*  39  125:ldc1            #8   <String "asInterface">
	//*  40  127:invokevirtual   #216 <Method boolean String.equals(Object)>
	//*  41  130:ifeq            429
			byte0 = 0;
	//   42  133:iconst_0        
	//   43  134:istore_2        
		  goto _L1
	//*  44  135:goto            429
_L3:
		method1 = method2;
	//   45  138:aload           5
	//   46  140:astore          4
		if(s.equals("isBillingSupported"))
	//*  47  142:aload_1         
	//*  48  143:ldc1            #38  <String "isBillingSupported">
	//*  49  145:invokevirtual   #216 <Method boolean String.equals(Object)>
	//*  50  148:ifeq            429
			byte0 = 2;
	//   51  151:iconst_2        
	//   52  152:istore_2        
		  goto _L1
	//*  53  153:goto            429
_L2:
		method1 = method2;
	//   54  156:aload           5
	//   55  158:astore          4
		if(s.equals("getPurchases"))
	//*  56  160:aload_1         
	//*  57  161:ldc1            #16  <String "getPurchases">
	//*  58  163:invokevirtual   #216 <Method boolean String.equals(Object)>
	//*  59  166:ifeq            429
			byte0 = 3;
	//   60  169:iconst_3        
	//   61  170:istore_2        
		  goto _L1
	//*  62  171:goto            429
_L14:
		method1 = method2;
	//   63  174:aload           5
	//   64  176:astore          4
		Method method;
		try
		{
			aclass = new Class[5];
	//   65  178:iconst_5        
	//   66  179:anewarray       Class[]
	//   67  182:astore_3        
		}
	//*  68  183:aload           5
	//*  69  185:astore          4
	//*  70  187:aload_3         
	//*  71  188:iconst_0        
	//*  72  189:getstatic       #286 <Field Class Integer.TYPE>
	//*  73  192:aastore         
	//*  74  193:aload_3         
	//*  75  194:iconst_1        
	//*  76  195:ldc1            #187 <Class String>
	//*  77  197:aastore         
	//*  78  198:aload_3         
	//*  79  199:iconst_2        
	//*  80  200:ldc1            #187 <Class String>
	//*  81  202:aastore         
	//*  82  203:aload_3         
	//*  83  204:iconst_3        
	//*  84  205:ldc1            #187 <Class String>
	//*  85  207:aastore         
	//*  86  208:aload_3         
	//*  87  209:iconst_4        
	//*  88  210:ldc2            #288 <Class Bundle>
	//*  89  213:aastore         
	//*  90  214:goto            339
	//*  91  217:aload           5
	//*  92  219:astore          4
	//*  93  221:iconst_4        
	//*  94  222:anewarray       Class[]
	//*  95  225:astore_3        
	//*  96  226:aload           5
	//*  97  228:astore          4
	//*  98  230:aload_3         
	//*  99  231:iconst_0        
	//* 100  232:getstatic       #286 <Field Class Integer.TYPE>
	//* 101  235:aastore         
	//* 102  236:aload_3         
	//* 103  237:iconst_1        
	//* 104  238:ldc1            #187 <Class String>
	//* 105  240:aastore         
	//* 106  241:aload_3         
	//* 107  242:iconst_2        
	//* 108  243:ldc1            #187 <Class String>
	//* 109  245:aastore         
	//* 110  246:aload_3         
	//* 111  247:iconst_3        
	//* 112  248:ldc1            #187 <Class String>
	//* 113  250:aastore         
	//* 114  251:goto            339
	//* 115  254:aload           5
	//* 116  256:astore          4
	//* 117  258:iconst_3        
	//* 118  259:anewarray       Class[]
	//* 119  262:astore_3        
	//* 120  263:aload           5
	//* 121  265:astore          4
	//* 122  267:aload_3         
	//* 123  268:iconst_0        
	//* 124  269:getstatic       #286 <Field Class Integer.TYPE>
	//* 125  272:aastore         
	//* 126  273:aload_3         
	//* 127  274:iconst_1        
	//* 128  275:ldc1            #187 <Class String>
	//* 129  277:aastore         
	//* 130  278:aload_3         
	//* 131  279:iconst_2        
	//* 132  280:ldc1            #187 <Class String>
	//* 133  282:aastore         
	//* 134  283:goto            339
	//* 135  286:aload           5
	//* 136  288:astore          4
	//* 137  290:iconst_4        
	//* 138  291:anewarray       Class[]
	//* 139  294:astore_3        
	//* 140  295:aload           5
	//* 141  297:astore          4
	//* 142  299:aload_3         
	//* 143  300:iconst_0        
	//* 144  301:getstatic       #286 <Field Class Integer.TYPE>
	//* 145  304:aastore         
	//* 146  305:aload_3         
	//* 147  306:iconst_1        
	//* 148  307:ldc1            #187 <Class String>
	//* 149  309:aastore         
	//* 150  310:aload_3         
	//* 151  311:iconst_2        
	//* 152  312:ldc1            #187 <Class String>
	//* 153  314:aastore         
	//* 154  315:aload_3         
	//* 155  316:iconst_3        
	//* 156  317:ldc2            #288 <Class Bundle>
	//* 157  320:aastore         
	//* 158  321:goto            339
	//* 159  324:aload           5
	//* 160  326:astore          4
	//* 161  328:iconst_1        
	//* 162  329:anewarray       Class[]
	//* 163  332:astore_3        
	//* 164  333:aload_3         
	//* 165  334:iconst_0        
	//* 166  335:ldc2            #290 <Class IBinder>
	//* 167  338:aastore         
	//* 168  339:aload           5
	//* 169  341:astore          4
	//* 170  343:aload_0         
	//* 171  344:aload_1         
	//* 172  345:aload_3         
	//* 173  346:invokevirtual   #294 <Method Method Class.getDeclaredMethod(String, Class[])>
	//* 174  349:astore_3        
	//* 175  350:aload_3         
	//* 176  351:astore          4
	//* 177  353:getstatic       #97  <Field HashMap methodMap>
	//* 178  356:aload_1         
	//* 179  357:aload_3         
	//* 180  358:invokevirtual   #255 <Method Object HashMap.put(Object, Object)>
	//* 181  361:pop             
	//* 182  362:aload_3         
	//* 183  363:areturn         
		catch(NoSuchMethodException nosuchmethodexception)
	//* 184  364:astore_3        
		{
			String s1 = TAG;
	//  185  365:getstatic       #90  <Field String TAG>
	//  186  368:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//  187  370:new             #257 <Class StringBuilder>
	//  188  373:dup             
	//  189  374:invokespecial   #258 <Method void StringBuilder()>
	//  190  377:astore          6
			stringbuilder.append(class1.getName());
	//  191  379:aload           6
	//  192  381:aload_0         
	//  193  382:invokevirtual   #297 <Method String Class.getName()>
	//  194  385:invokevirtual   #262 <Method StringBuilder StringBuilder.append(String)>
	//  195  388:pop             
			stringbuilder.append(".");
	//  196  389:aload           6
	//  197  391:ldc2            #299 <String ".">
	//  198  394:invokevirtual   #262 <Method StringBuilder StringBuilder.append(String)>
	//  199  397:pop             
			stringbuilder.append(s);
	//  200  398:aload           6
	//  201  400:aload_1         
	//  202  401:invokevirtual   #262 <Method StringBuilder StringBuilder.append(String)>
	//  203  404:pop             
			stringbuilder.append(" method not found");
	//  204  405:aload           6
	//  205  407:ldc2            #301 <String " method not found">
	//  206  410:invokevirtual   #262 <Method StringBuilder StringBuilder.append(String)>
	//  207  413:pop             
			Log.e(s1, stringbuilder.toString(), ((Throwable) (nosuchmethodexception)));
	//  208  414:aload           5
	//  209  416:aload           6
	//  210  418:invokevirtual   #269 <Method String StringBuilder.toString()>
	//  211  421:aload_3         
	//  212  422:invokestatic    #231 <Method int Log.e(String, String, Throwable)>
	//  213  425:pop             
			return method1;
	//  214  426:aload           4
	//  215  428:areturn         
		}
		method1 = method2;
		aclass[0] = Integer.TYPE;
		aclass[1] = java/lang/String;
		aclass[2] = java/lang/String;
		aclass[3] = java/lang/String;
		aclass[4] = android/os/Bundle;
		  goto _L7
_L11:
		method1 = method2;
		aclass = new Class[4];
		method1 = method2;
		aclass[0] = Integer.TYPE;
		aclass[1] = java/lang/String;
		aclass[2] = java/lang/String;
		aclass[3] = java/lang/String;
		  goto _L7
_L10:
		method1 = method2;
		aclass = new Class[3];
		method1 = method2;
		aclass[0] = Integer.TYPE;
		aclass[1] = java/lang/String;
		aclass[2] = java/lang/String;
		  goto _L7
_L9:
		method1 = method2;
		aclass = new Class[4];
		method1 = method2;
		aclass[0] = Integer.TYPE;
		aclass[1] = java/lang/String;
		aclass[2] = java/lang/String;
		aclass[3] = android/os/Bundle;
		  goto _L7
_L8:
		method1 = method2;
		aclass = new Class[1];
		aclass[0] = android/os/IBinder;
_L7:
		method1 = method2;
		method = class1.getDeclaredMethod(s, aclass);
		method1 = method;
		methodMap.put(((Object) (s)), ((Object) (method)));
		return method;
_L1:
		byte0;
	//  216  429:iload_2         
		JVM INSTR tableswitch 0 4: default 464
	//	               0 324
	//	               1 286
	//	               2 254
	//	               3 217
	//	               4 174;
	//  217  430:tableswitch     0 4: default 464
	//	               0 324
	//	               1 286
	//	               2 254
	//	               3 217
	//	               4 174
		   goto _L7 _L8 _L9 _L10 _L11 _L12
_L12:
		if(true) goto _L14; else goto _L13
_L13:
	//* 218  464:goto            339
	}

	private static ArrayList getPurchaseHistory(Context context, Object obj, String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #170 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #171 <Method void ArrayList()>
	//    3    7:astore          9
		if(!isBillingSupported(context, obj, s).booleanValue()) goto _L2; else goto _L1
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:invokestatic    #306 <Method Boolean isBillingSupported(Context, Object, String)>
	//    8   15:invokevirtual   #311 <Method boolean Boolean.booleanValue()>
	//    9   18:ifeq            273
_L1:
		int i;
		Object obj1;
		Object obj4;
		obj1 = ((Object) (Boolean.valueOf(false)));
	//   10   21:iconst_0        
	//   11   22:invokestatic    #315 <Method Boolean Boolean.valueOf(boolean)>
	//   12   25:astore          6
		i = 0;
	//   13   27:iconst_0        
	//   14   28:istore_3        
		obj4 = null;
	//   15   29:aconst_null     
	//   16   30:astore          8
_L5:
		long l;
		Iterator iterator;
		Object obj2 = invokeMethod(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[] {
			Integer.valueOf(6), PACKAGE_NAME, s, obj4, new Bundle()
		});
	//   17   32:aload_0         
	//   18   33:ldc1            #32  <String "com.android.vending.billing.IInAppBillingService">
	//   19   35:ldc1            #19  <String "getPurchaseHistory">
	//   20   37:aload_1         
	//   21   38:iconst_5        
	//   22   39:anewarray       Object[]
	//   23   42:dup             
	//   24   43:iconst_0        
	//   25   44:bipush          6
	//   26   46:invokestatic    #318 <Method Integer Integer.valueOf(int)>
	//   27   49:aastore         
	//   28   50:dup             
	//   29   51:iconst_1        
	//   30   52:getstatic       #112 <Field String PACKAGE_NAME>
	//   31   55:aastore         
	//   32   56:dup             
	//   33   57:iconst_2        
	//   34   58:aload_2         
	//   35   59:aastore         
	//   36   60:dup             
	//   37   61:iconst_3        
	//   38   62:aload           8
	//   39   64:aastore         
	//   40   65:dup             
	//   41   66:iconst_4        
	//   42   67:new             #288 <Class Bundle>
	//   43   70:dup             
	//   44   71:invokespecial   #319 <Method void Bundle()>
	//   45   74:aastore         
	//   46   75:invokestatic    #130 <Method Object invokeMethod(Context, String, String, Object, Object[])>
	//   47   78:astore          7
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_229;
	//   48   80:aload           7
	//   49   82:ifnull          229
		l = System.currentTimeMillis() / 1000L;
	//   50   85:invokestatic    #138 <Method long System.currentTimeMillis()>
	//   51   88:ldc2w           #139 <Long 1000L>
	//   52   91:ldiv            
	//   53   92:lstore          4
		obj4 = ((Object) ((Bundle)obj2));
	//   54   94:aload           7
	//   55   96:checkcast       #288 <Class Bundle>
	//   56   99:astore          8
		if(((Bundle) (obj4)).getInt("RESPONSE_CODE") != 0)
			break MISSING_BLOCK_LABEL_229;
	//   57  101:aload           8
	//   58  103:ldc1            #59  <String "RESPONSE_CODE">
	//   59  105:invokevirtual   #323 <Method int Bundle.getInt(String)>
	//   60  108:ifne            229
		iterator = ((Bundle) (obj4)).getStringArrayList("INAPP_PURCHASE_DATA_LIST").iterator();
	//   61  111:aload           8
	//   62  113:ldc1            #29  <String "INAPP_PURCHASE_DATA_LIST">
	//   63  115:invokevirtual   #327 <Method ArrayList Bundle.getStringArrayList(String)>
	//   64  118:invokevirtual   #175 <Method Iterator ArrayList.iterator()>
	//   65  121:astore          10
_L4:
		Object obj3;
		obj3 = obj1;
	//   66  123:aload           6
	//   67  125:astore          7
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   68  127:aload           10
	//   69  129:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//   70  134:ifeq            217
		obj3 = ((Object) ((String)iterator.next()));
	//   71  137:aload           10
	//   72  139:invokeinterface #185 <Method Object Iterator.next()>
	//   73  144:checkcast       #187 <Class String>
	//   74  147:astore          7
		if(l - (new JSONObject(((String) (obj3)))).getLong("purchaseTime") / 1000L > 1200L)
	//*  75  149:lload           4
	//*  76  151:new             #189 <Class JSONObject>
	//*  77  154:dup             
	//*  78  155:aload           7
	//*  79  157:invokespecial   #192 <Method void JSONObject(String)>
	//*  80  160:ldc1            #200 <String "purchaseTime">
	//*  81  162:invokevirtual   #203 <Method long JSONObject.getLong(String)>
	//*  82  165:ldc2w           #139 <Long 1000L>
	//*  83  168:ldiv            
	//*  84  169:lsub            
	//*  85  170:ldc2w           #328 <Long 1200L>
	//*  86  173:lcmp            
	//*  87  174:ifle            186
		{
			obj3 = ((Object) (Boolean.valueOf(true)));
	//   88  177:iconst_1        
	//   89  178:invokestatic    #315 <Method Boolean Boolean.valueOf(boolean)>
	//   90  181:astore          7
			break; /* Loop/switch isn't completed */
	//   91  183:goto            217
		}
		arraylist.add(obj3);
	//   92  186:aload           9
	//   93  188:aload           7
	//   94  190:invokevirtual   #223 <Method boolean ArrayList.add(Object)>
	//   95  193:pop             
		i++;
	//   96  194:iload_3         
	//   97  195:iconst_1        
	//   98  196:iadd            
	//   99  197:istore_3        
		continue; /* Loop/switch isn't completed */
	//  100  198:goto            214
		obj3;
	//  101  201:astore          7
		Log.e(TAG, "parsing purchase failure: ", ((Throwable) (obj3)));
	//  102  203:getstatic       #90  <Field String TAG>
	//  103  206:ldc1            #225 <String "parsing purchase failure: ">
	//  104  208:aload           7
	//  105  210:invokestatic    #231 <Method int Log.e(String, String, Throwable)>
	//  106  213:pop             
		if(true) goto _L4; else goto _L3
	//  107  214:goto            123
_L3:
		obj1 = ((Object) (((Bundle) (obj4)).getString("INAPP_CONTINUATION_TOKEN")));
	//  108  217:aload           8
	//  109  219:ldc1            #27  <String "INAPP_CONTINUATION_TOKEN">
	//  110  221:invokevirtual   #330 <Method String Bundle.getString(String)>
	//  111  224:astore          6
		break MISSING_BLOCK_LABEL_240;
	//  112  226:goto            240
		obj4 = null;
	//  113  229:aconst_null     
	//  114  230:astore          8
		obj3 = obj1;
	//  115  232:aload           6
	//  116  234:astore          7
		obj1 = obj4;
	//  117  236:aload           8
	//  118  238:astore          6
		if(i >= 30 || obj1 == null)
			break; /* Loop/switch isn't completed */
	//  119  240:iload_3         
	//  120  241:bipush          30
	//  121  243:icmpge          273
	//  122  246:aload           6
	//  123  248:ifnull          273
		if(((Boolean) (obj3)).booleanValue())
	//* 124  251:aload           7
	//* 125  253:invokevirtual   #311 <Method boolean Boolean.booleanValue()>
	//* 126  256:ifeq            262
			return arraylist;
	//  127  259:aload           9
	//  128  261:areturn         
		obj4 = obj1;
	//  129  262:aload           6
	//  130  264:astore          8
		obj1 = obj3;
	//  131  266:aload           7
	//  132  268:astore          6
		if(true) goto _L5; else goto _L2
	//  133  270:goto            32
_L2:
		return arraylist;
	//  134  273:aload           9
	//  135  275:areturn         
	}

	public static ArrayList getPurchaseHistoryInapp(Context context, Object obj)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #170 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #171 <Method void ArrayList()>
	//    3    7:astore_2        
		if(obj == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       14
			return arraylist;
	//    6   12:aload_2         
	//    7   13:areturn         
		Class class1 = getClass(context, "com.android.vending.billing.IInAppBillingService");
	//    8   14:aload_0         
	//    9   15:ldc1            #32  <String "com.android.vending.billing.IInAppBillingService">
	//   10   17:invokestatic    #335 <Method Class getClass(Context, String)>
	//   11   20:astore_3        
		if(class1 == null)
	//*  12   21:aload_3         
	//*  13   22:ifnonnull       27
			return arraylist;
	//   14   25:aload_2         
	//   15   26:areturn         
		if(getMethod(class1, "getPurchaseHistory") == null)
	//*  16   27:aload_3         
	//*  17   28:ldc1            #19  <String "getPurchaseHistory">
	//*  18   30:invokestatic    #337 <Method Method getMethod(Class, String)>
	//*  19   33:ifnonnull       38
			return arraylist;
	//   20   36:aload_2         
	//   21   37:areturn         
		else
			return filterPurchasesInapp(getPurchaseHistory(context, obj, "inapp"));
	//   22   38:aload_0         
	//   23   39:aload_1         
	//   24   40:ldc1            #25  <String "inapp">
	//   25   42:invokestatic    #339 <Method ArrayList getPurchaseHistory(Context, Object, String)>
	//   26   45:invokestatic    #341 <Method ArrayList filterPurchasesInapp(ArrayList)>
	//   27   48:areturn         
	}

	private static ArrayList getPurchases(Context context, Object obj, String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #170 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #171 <Method void ArrayList()>
	//    3    7:astore          6
		if(obj == null)
	//*   4    9:aload_1         
	//*   5   10:ifnonnull       16
			return arraylist;
	//    6   13:aload           6
	//    7   15:areturn         
		if(isBillingSupported(context, obj, s).booleanValue())
	//*   8   16:aload_0         
	//*   9   17:aload_1         
	//*  10   18:aload_2         
	//*  11   19:invokestatic    #306 <Method Boolean isBillingSupported(Context, Object, String)>
	//*  12   22:invokevirtual   #311 <Method boolean Boolean.booleanValue()>
	//*  13   25:ifeq            152
		{
			int i = 0;
	//   14   28:iconst_0        
	//   15   29:istore_3        
			Object obj2 = null;
	//   16   30:aconst_null     
	//   17   31:astore          5
			Object obj1;
label0:
			do
			{
label1:
				{
					obj1 = invokeMethod(context, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj, new Object[] {
						Integer.valueOf(3), PACKAGE_NAME, s, obj2
					});
	//   18   33:aload_0         
	//   19   34:ldc1            #32  <String "com.android.vending.billing.IInAppBillingService">
	//   20   36:ldc1            #16  <String "getPurchases">
	//   21   38:aload_1         
	//   22   39:iconst_4        
	//   23   40:anewarray       Object[]
	//   24   43:dup             
	//   25   44:iconst_0        
	//   26   45:iconst_3        
	//   27   46:invokestatic    #318 <Method Integer Integer.valueOf(int)>
	//   28   49:aastore         
	//   29   50:dup             
	//   30   51:iconst_1        
	//   31   52:getstatic       #112 <Field String PACKAGE_NAME>
	//   32   55:aastore         
	//   33   56:dup             
	//   34   57:iconst_2        
	//   35   58:aload_2         
	//   36   59:aastore         
	//   37   60:dup             
	//   38   61:iconst_3        
	//   39   62:aload           5
	//   40   64:aastore         
	//   41   65:invokestatic    #130 <Method Object invokeMethod(Context, String, String, Object, Object[])>
	//   42   68:astore          4
					if(obj1 != null)
	//*  43   70:aload           4
	//*  44   72:ifnull          134
					{
						obj1 = ((Object) ((Bundle)obj1));
	//   45   75:aload           4
	//   46   77:checkcast       #288 <Class Bundle>
	//   47   80:astore          4
						if(((Bundle) (obj1)).getInt("RESPONSE_CODE") == 0)
	//*  48   82:aload           4
	//*  49   84:ldc1            #59  <String "RESPONSE_CODE">
	//*  50   86:invokevirtual   #323 <Method int Bundle.getInt(String)>
	//*  51   89:ifne            134
						{
							obj2 = ((Object) (((Bundle) (obj1)).getStringArrayList("INAPP_PURCHASE_DATA_LIST")));
	//   52   92:aload           4
	//   53   94:ldc1            #29  <String "INAPP_PURCHASE_DATA_LIST">
	//   54   96:invokevirtual   #327 <Method ArrayList Bundle.getStringArrayList(String)>
	//   55   99:astore          5
							if(obj2 == null)
								break label0;
	//   56  101:aload           5
	//   57  103:ifnull          152
							i += ((ArrayList) (obj2)).size();
	//   58  106:iload_3         
	//   59  107:aload           5
	//   60  109:invokevirtual   #345 <Method int ArrayList.size()>
	//   61  112:iadd            
	//   62  113:istore_3        
							arraylist.addAll(((java.util.Collection) (obj2)));
	//   63  114:aload           6
	//   64  116:aload           5
	//   65  118:invokevirtual   #349 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   66  121:pop             
							obj1 = ((Object) (((Bundle) (obj1)).getString("INAPP_CONTINUATION_TOKEN")));
	//   67  122:aload           4
	//   68  124:ldc1            #27  <String "INAPP_CONTINUATION_TOKEN">
	//   69  126:invokevirtual   #330 <Method String Bundle.getString(String)>
	//   70  129:astore          4
							break label1;
	//   71  131:goto            137
						}
					}
					obj1 = null;
	//   72  134:aconst_null     
	//   73  135:astore          4
				}
				if(i >= 30)
					break;
	//   74  137:iload_3         
	//   75  138:bipush          30
	//   76  140:icmpge          152
				obj2 = obj1;
	//   77  143:aload           4
	//   78  145:astore          5
			} while(obj1 != null);
	//   79  147:aload           4
	//   80  149:ifnonnull       33
		}
		return arraylist;
	//   81  152:aload           6
	//   82  154:areturn         
	}

	public static ArrayList getPurchasesInapp(Context context, Object obj)
	{
		return filterPurchasesInapp(getPurchases(context, obj, "inapp"));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #25  <String "inapp">
	//    3    4:invokestatic    #352 <Method ArrayList getPurchases(Context, Object, String)>
	//    4    7:invokestatic    #341 <Method ArrayList filterPurchasesInapp(ArrayList)>
	//    5   10:areturn         
	}

	public static Map getPurchasesSubs(Context context, Object obj)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #92  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #95  <Method void HashMap()>
	//    3    7:astore_2        
		context = ((Context) (getPurchases(context, obj, "subs").iterator()));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:ldc1            #66  <String "subs">
	//    7   12:invokestatic    #352 <Method ArrayList getPurchases(Context, Object, String)>
	//    8   15:invokevirtual   #175 <Method Iterator ArrayList.iterator()>
	//    9   18:astore_0        
		do
		{
			if(!((Iterator) (context)).hasNext())
				break;
	//   10   19:aload_0         
	//   11   20:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//   12   25:ifeq            69
			obj = ((Object) ((String)((Iterator) (context)).next()));
	//   13   28:aload_0         
	//   14   29:invokeinterface #185 <Method Object Iterator.next()>
	//   15   34:checkcast       #187 <Class String>
	//   16   37:astore_1        
			SubscriptionType subscriptiontype = getSubsType(((String) (obj)));
	//   17   38:aload_1         
	//   18   39:invokestatic    #358 <Method SubscriptionType getSubsType(String)>
	//   19   42:astore_3        
			if(subscriptiontype != SubscriptionType.DUPLICATED && subscriptiontype != SubscriptionType.UNKNOWN)
	//*  20   43:aload_3         
	//*  21   44:getstatic       #364 <Field SubscriptionType SubscriptionType.DUPLICATED>
	//*  22   47:if_acmpeq       19
	//*  23   50:aload_3         
	//*  24   51:getstatic       #367 <Field SubscriptionType SubscriptionType.UNKNOWN>
	//*  25   54:if_acmpeq       19
				((Map) (hashmap)).put(obj, ((Object) (subscriptiontype)));
	//   26   57:aload_2         
	//   27   58:aload_1         
	//   28   59:aload_3         
	//   29   60:invokeinterface #370 <Method Object Map.put(Object, Object)>
	//   30   65:pop             
		} while(true);
	//   31   66:goto            19
		return ((Map) (hashmap));
	//   32   69:aload_2         
	//   33   70:areturn         
	}

	public static ArrayList getPurchasesSubsExpire(Context context, Object obj)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #170 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #171 <Method void ArrayList()>
	//    3    7:astore_2        
		Object obj1 = ((Object) (purchaseSubsSharedPrefs.getAll()));
	//    4    8:getstatic       #122 <Field SharedPreferences purchaseSubsSharedPrefs>
	//    5   11:invokeinterface #376 <Method Map SharedPreferences.getAll()>
	//    6   16:astore_3        
		if(((Map) (obj1)).isEmpty())
	//*   7   17:aload_3         
	//*   8   18:invokeinterface #379 <Method boolean Map.isEmpty()>
	//*   9   23:ifeq            28
			return arraylist;
	//   10   26:aload_2         
	//   11   27:areturn         
		obj = ((Object) (getPurchases(context, obj, "subs")));
	//   12   28:aload_0         
	//   13   29:aload_1         
	//   14   30:ldc1            #66  <String "subs">
	//   15   32:invokestatic    #352 <Method ArrayList getPurchases(Context, Object, String)>
	//   16   35:astore_1        
		context = ((Context) (new HashSet()));
	//   17   36:new             #381 <Class HashSet>
	//   18   39:dup             
	//   19   40:invokespecial   #382 <Method void HashSet()>
	//   20   43:astore_0        
		for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  21   44:aload_1         
	//*  22   45:invokevirtual   #175 <Method Iterator ArrayList.iterator()>
	//*  23   48:astore_1        
	//*  24   49:aload_1         
	//*  25   50:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//*  26   55:ifeq            110
		{
			String s1 = (String)((Iterator) (obj)).next();
	//   27   58:aload_1         
	//   28   59:invokeinterface #185 <Method Object Iterator.next()>
	//   29   64:checkcast       #187 <Class String>
	//   30   67:astore          4
			try
			{
				((Set) (context)).add(((Object) ((new JSONObject(s1)).getString("productId"))));
	//   31   69:aload_0         
	//   32   70:new             #189 <Class JSONObject>
	//   33   73:dup             
	//   34   74:aload           4
	//   35   76:invokespecial   #192 <Method void JSONObject(String)>
	//   36   79:ldc1            #194 <String "productId">
	//   37   81:invokevirtual   #198 <Method String JSONObject.getString(String)>
	//   38   84:invokeinterface #385 <Method boolean Set.add(Object)>
	//   39   89:pop             
			}
	//*  40   90:goto            49
			catch(JSONException jsonexception)
	//*  41   93:astore          4
			{
				Log.e(TAG, "Error parsing purchase json", ((Throwable) (jsonexception)));
	//   42   95:getstatic       #90  <Field String TAG>
	//   43   98:ldc2            #387 <String "Error parsing purchase json">
	//   44  101:aload           4
	//   45  103:invokestatic    #231 <Method int Log.e(String, String, Throwable)>
	//   46  106:pop             
			}
		}

	//*  47  107:goto            49
		obj = ((Object) (new HashSet()));
	//   48  110:new             #381 <Class HashSet>
	//   49  113:dup             
	//   50  114:invokespecial   #382 <Method void HashSet()>
	//   51  117:astore_1        
		obj1 = ((Object) (((Map) (obj1)).entrySet().iterator()));
	//   52  118:aload_3         
	//   53  119:invokeinterface #391 <Method Set Map.entrySet()>
	//   54  124:invokeinterface #392 <Method Iterator Set.iterator()>
	//   55  129:astore_3        
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break;
	//   56  130:aload_3         
	//   57  131:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//   58  136:ifeq            181
			String s2 = (String)((java.util.Map.Entry)((Iterator) (obj1)).next()).getKey();
	//   59  139:aload_3         
	//   60  140:invokeinterface #185 <Method Object Iterator.next()>
	//   61  145:checkcast       #394 <Class java.util.Map$Entry>
	//   62  148:invokeinterface #397 <Method Object java.util.Map$Entry.getKey()>
	//   63  153:checkcast       #187 <Class String>
	//   64  156:astore          4
			if(!((Set) (context)).contains(((Object) (s2))))
	//*  65  158:aload_0         
	//*  66  159:aload           4
	//*  67  161:invokeinterface #400 <Method boolean Set.contains(Object)>
	//*  68  166:ifne            130
				((Set) (obj)).add(((Object) (s2)));
	//   69  169:aload_1         
	//   70  170:aload           4
	//   71  172:invokeinterface #385 <Method boolean Set.add(Object)>
	//   72  177:pop             
		} while(true);
	//   73  178:goto            130
		context = ((Context) (purchaseSubsSharedPrefs.edit()));
	//   74  181:getstatic       #122 <Field SharedPreferences purchaseSubsSharedPrefs>
	//   75  184:invokeinterface #150 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   76  189:astore_0        
		obj = ((Object) (((Set) (obj)).iterator()));
	//   77  190:aload_1         
	//   78  191:invokeinterface #392 <Method Iterator Set.iterator()>
	//   79  196:astore_1        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   80  197:aload_1         
	//   81  198:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//   82  203:ifeq            264
			String s = (String)((Iterator) (obj)).next();
	//   83  206:aload_1         
	//   84  207:invokeinterface #185 <Method Object Iterator.next()>
	//   85  212:checkcast       #187 <Class String>
	//   86  215:astore_3        
			String s3 = purchaseSubsSharedPrefs.getString(s, "");
	//   87  216:getstatic       #122 <Field SharedPreferences purchaseSubsSharedPrefs>
	//   88  219:aload_3         
	//   89  220:ldc1            #209 <String "">
	//   90  222:invokeinterface #212 <Method String SharedPreferences.getString(String, String)>
	//   91  227:astore          4
			((android.content.SharedPreferences.Editor) (context)).remove(s);
	//   92  229:aload_0         
	//   93  230:aload_3         
	//   94  231:invokeinterface #404 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   95  236:pop             
			if(!s3.isEmpty())
	//*  96  237:aload           4
	//*  97  239:invokevirtual   #405 <Method boolean String.isEmpty()>
	//*  98  242:ifne            197
				arraylist.add(((Object) (purchaseSubsSharedPrefs.getString(s, ""))));
	//   99  245:aload_2         
	//  100  246:getstatic       #122 <Field SharedPreferences purchaseSubsSharedPrefs>
	//  101  249:aload_3         
	//  102  250:ldc1            #209 <String "">
	//  103  252:invokeinterface #212 <Method String SharedPreferences.getString(String, String)>
	//  104  257:invokevirtual   #223 <Method boolean ArrayList.add(Object)>
	//  105  260:pop             
		} while(true);
	//  106  261:goto            197
		((android.content.SharedPreferences.Editor) (context)).apply();
	//  107  264:aload_0         
	//  108  265:invokeinterface #159 <Method void android.content.SharedPreferences$Editor.apply()>
		return arraylist;
	//  109  270:aload_2         
	//  110  271:areturn         
	}

	public static Map getSkuDetails(Context context, ArrayList arraylist, Object obj, boolean flag)
	{
		Map map = readSkuDetailsFromCache(arraylist);
	//    0    0:aload_1         
	//    1    1:invokestatic    #410 <Method Map readSkuDetailsFromCache(ArrayList)>
	//    2    4:astore          4
		ArrayList arraylist1 = new ArrayList();
	//    3    6:new             #170 <Class ArrayList>
	//    4    9:dup             
	//    5   10:invokespecial   #171 <Method void ArrayList()>
	//    6   13:astore          5
		arraylist = ((ArrayList) (arraylist.iterator()));
	//    7   15:aload_1         
	//    8   16:invokevirtual   #175 <Method Iterator ArrayList.iterator()>
	//    9   19:astore_1        
		do
		{
			if(!((Iterator) (arraylist)).hasNext())
				break;
	//   10   20:aload_1         
	//   11   21:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//   12   26:ifeq            63
			String s = (String)((Iterator) (arraylist)).next();
	//   13   29:aload_1         
	//   14   30:invokeinterface #185 <Method Object Iterator.next()>
	//   15   35:checkcast       #187 <Class String>
	//   16   38:astore          6
			if(!map.containsKey(((Object) (s))))
	//*  17   40:aload           4
	//*  18   42:aload           6
	//*  19   44:invokeinterface #413 <Method boolean Map.containsKey(Object)>
	//*  20   49:ifne            20
				arraylist1.add(((Object) (s)));
	//   21   52:aload           5
	//   22   54:aload           6
	//   23   56:invokevirtual   #223 <Method boolean ArrayList.add(Object)>
	//   24   59:pop             
		} while(true);
	//   25   60:goto            20
		map.putAll(getSkuDetailsFromGoogle(context, arraylist1, obj, flag));
	//   26   63:aload           4
	//   27   65:aload_0         
	//   28   66:aload           5
	//   29   68:aload_2         
	//   30   69:iload_3         
	//   31   70:invokestatic    #416 <Method Map getSkuDetailsFromGoogle(Context, ArrayList, Object, boolean)>
	//   32   73:invokeinterface #420 <Method void Map.putAll(Map)>
		return map;
	//   33   78:aload           4
	//   34   80:areturn         
	}

	private static Map getSkuDetailsFromGoogle(Context context, ArrayList arraylist, Object obj, boolean flag)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #92  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #95  <Method void HashMap()>
	//    3    7:astore          6
		if(obj != null)
	//*   4    9:aload_2         
	//*   5   10:ifnull          185
		{
			if(arraylist.isEmpty())
	//*   6   13:aload_1         
	//*   7   14:invokevirtual   #422 <Method boolean ArrayList.isEmpty()>
	//*   8   17:ifeq            23
				return ((Map) (hashmap));
	//    9   20:aload           6
	//   10   22:areturn         
			Bundle bundle = new Bundle();
	//   11   23:new             #288 <Class Bundle>
	//   12   26:dup             
	//   13   27:invokespecial   #319 <Method void Bundle()>
	//   14   30:astore          7
			bundle.putStringArrayList("ITEM_ID_LIST", arraylist);
	//   15   32:aload           7
	//   16   34:ldc1            #40  <String "ITEM_ID_LIST">
	//   17   36:aload_1         
	//   18   37:invokevirtual   #426 <Method void Bundle.putStringArrayList(String, ArrayList)>
			int i = 0;
	//   19   40:iconst_0        
	//   20   41:istore          4
			String s1 = PACKAGE_NAME;
	//   21   43:getstatic       #112 <Field String PACKAGE_NAME>
	//   22   46:astore          8
			String s;
			if(flag)
	//*  23   48:iload_3         
	//*  24   49:ifeq            59
				s = "subs";
	//   25   52:ldc1            #66  <String "subs">
	//   26   54:astore          5
			else
	//*  27   56:goto            63
				s = "inapp";
	//   28   59:ldc1            #25  <String "inapp">
	//   29   61:astore          5
			context = ((Context) (invokeMethod(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, new Object[] {
				Integer.valueOf(3), s1, s, bundle
			})));
	//   30   63:aload_0         
	//   31   64:ldc1            #32  <String "com.android.vending.billing.IInAppBillingService">
	//   32   66:ldc1            #22  <String "getSkuDetails">
	//   33   68:aload_2         
	//   34   69:iconst_4        
	//   35   70:anewarray       Object[]
	//   36   73:dup             
	//   37   74:iconst_0        
	//   38   75:iconst_3        
	//   39   76:invokestatic    #318 <Method Integer Integer.valueOf(int)>
	//   40   79:aastore         
	//   41   80:dup             
	//   42   81:iconst_1        
	//   43   82:aload           8
	//   44   84:aastore         
	//   45   85:dup             
	//   46   86:iconst_2        
	//   47   87:aload           5
	//   48   89:aastore         
	//   49   90:dup             
	//   50   91:iconst_3        
	//   51   92:aload           7
	//   52   94:aastore         
	//   53   95:invokestatic    #130 <Method Object invokeMethod(Context, String, String, Object, Object[])>
	//   54   98:astore_0        
			if(context != null)
	//*  55   99:aload_0         
	//*  56  100:ifnull          182
			{
				context = ((Context) ((Bundle)context));
	//   57  103:aload_0         
	//   58  104:checkcast       #288 <Class Bundle>
	//   59  107:astore_0        
				if(((Bundle) (context)).getInt("RESPONSE_CODE") == 0)
	//*  60  108:aload_0         
	//*  61  109:ldc1            #59  <String "RESPONSE_CODE">
	//*  62  111:invokevirtual   #323 <Method int Bundle.getInt(String)>
	//*  63  114:ifne            182
				{
					context = ((Context) (((Bundle) (context)).getStringArrayList("DETAILS_LIST")));
	//   64  117:aload_0         
	//   65  118:ldc1            #13  <String "DETAILS_LIST">
	//   66  120:invokevirtual   #327 <Method ArrayList Bundle.getStringArrayList(String)>
	//   67  123:astore_0        
					if(context != null && arraylist.size() == ((ArrayList) (context)).size())
	//*  68  124:aload_0         
	//*  69  125:ifnull          177
	//*  70  128:aload_1         
	//*  71  129:invokevirtual   #345 <Method int ArrayList.size()>
	//*  72  132:aload_0         
	//*  73  133:invokevirtual   #345 <Method int ArrayList.size()>
	//*  74  136:icmpne          177
						for(; i < arraylist.size(); i++)
	//*  75  139:iload           4
	//*  76  141:aload_1         
	//*  77  142:invokevirtual   #345 <Method int ArrayList.size()>
	//*  78  145:icmpge          177
							((Map) (hashmap)).put(arraylist.get(i), ((ArrayList) (context)).get(i));
	//   79  148:aload           6
	//   80  150:aload_1         
	//   81  151:iload           4
	//   82  153:invokevirtual   #429 <Method Object ArrayList.get(int)>
	//   83  156:aload_0         
	//   84  157:iload           4
	//   85  159:invokevirtual   #429 <Method Object ArrayList.get(int)>
	//   86  162:invokeinterface #370 <Method Object Map.put(Object, Object)>
	//   87  167:pop             

	//   88  168:iload           4
	//   89  170:iconst_1        
	//   90  171:iadd            
	//   91  172:istore          4
	//*  92  174:goto            139
					writeSkuDetailsToCache(((Map) (hashmap)));
	//   93  177:aload           6
	//   94  179:invokestatic    #432 <Method void writeSkuDetailsToCache(Map)>
				}
			}
			return ((Map) (hashmap));
	//   95  182:aload           6
	//   96  184:areturn         
		} else
		{
			return ((Map) (hashmap));
	//   97  185:aload           6
	//   98  187:areturn         
		}
	}

	private static SubscriptionType getSubsType(String s)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		long l;
		JSONObject jsonobject;
		JSONObject jsonobject1;
		String s1;
		String s2;
		l = System.currentTimeMillis() / 1000L;
	//    2    3:invokestatic    #138 <Method long System.currentTimeMillis()>
	//    3    6:ldc2w           #139 <Long 1000L>
	//    4    9:ldiv            
	//    5   10:lstore_1        
		jsonobject1 = new JSONObject(s);
	//    6   11:new             #189 <Class JSONObject>
	//    7   14:dup             
	//    8   15:aload_0         
	//    9   16:invokespecial   #192 <Method void JSONObject(String)>
	//   10   19:astore          7
		s1 = jsonobject1.getString("productId");
	//   11   21:aload           7
	//   12   23:ldc1            #194 <String "productId">
	//   13   25:invokevirtual   #198 <Method String JSONObject.getString(String)>
	//   14   28:astore          8
		s2 = purchaseSubsSharedPrefs.getString(s1, "");
	//   15   30:getstatic       #122 <Field SharedPreferences purchaseSubsSharedPrefs>
	//   16   33:aload           8
	//   17   35:ldc1            #209 <String "">
	//   18   37:invokeinterface #212 <Method String SharedPreferences.getString(String, String)>
	//   19   42:astore          9
		if(s2.isEmpty())
	//*  20   44:aload           9
	//*  21   46:invokevirtual   #405 <Method boolean String.isEmpty()>
	//*  22   49:ifeq            64
		{
			jsonobject = new JSONObject();
	//   23   52:new             #189 <Class JSONObject>
	//   24   55:dup             
	//   25   56:invokespecial   #433 <Method void JSONObject()>
	//   26   59:astore          6
			break MISSING_BLOCK_LABEL_75;
	//   27   61:goto            75
		}
		jsonobject = new JSONObject(s2);
	//   28   64:new             #189 <Class JSONObject>
	//   29   67:dup             
	//   30   68:aload           9
	//   31   70:invokespecial   #192 <Method void JSONObject(String)>
	//   32   73:astore          6
		if(jsonobject.optString("purchaseToken").equals(jsonobject1.get("purchaseToken")))
			break MISSING_BLOCK_LABEL_128;
	//   33   75:aload           6
	//   34   77:ldc1            #205 <String "purchaseToken">
	//   35   79:invokevirtual   #436 <Method String JSONObject.optString(String)>
	//   36   82:aload           7
	//   37   84:ldc1            #205 <String "purchaseToken">
	//   38   86:invokevirtual   #439 <Method Object JSONObject.get(String)>
	//   39   89:invokevirtual   #216 <Method boolean String.equals(Object)>
	//   40   92:ifne            128
		if(l - jsonobject1.getLong("purchaseTime") / 1000L < 43200L)
	//*  41   95:lload_1         
	//*  42   96:aload           7
	//*  43   98:ldc1            #200 <String "purchaseTime">
	//*  44  100:invokevirtual   #203 <Method long JSONObject.getLong(String)>
	//*  45  103:ldc2w           #139 <Long 1000L>
	//*  46  106:ldiv            
	//*  47  107:lsub            
	//*  48  108:ldc2w           #206 <Long 43200L>
	//*  49  111:lcmp            
	//*  50  112:ifge            123
		{
			obj = ((Object) (SubscriptionType.NEW));
	//   51  115:getstatic       #442 <Field SubscriptionType SubscriptionType.NEW>
	//   52  118:astore          5
			break MISSING_BLOCK_LABEL_128;
	//   53  120:goto            128
		}
		boolean flag;
		boolean flag1;
		try
		{
			obj = ((Object) (SubscriptionType.HEARTBEAT));
	//   54  123:getstatic       #445 <Field SubscriptionType SubscriptionType.HEARTBEAT>
	//   55  126:astore          5
		}
	//*  56  128:aload           5
	//*  57  130:astore_0        
	//*  58  131:aload           5
	//*  59  133:ifnonnull       201
	//*  60  136:aload           5
	//*  61  138:astore_0        
	//*  62  139:aload           9
	//*  63  141:invokevirtual   #405 <Method boolean String.isEmpty()>
	//*  64  144:ifne            201
	//*  65  147:aload           6
	//*  66  149:ldc2            #447 <String "autoRenewing">
	//*  67  152:invokevirtual   #451 <Method boolean JSONObject.getBoolean(String)>
	//*  68  155:istore_3        
	//*  69  156:aload           7
	//*  70  158:ldc2            #447 <String "autoRenewing">
	//*  71  161:invokevirtual   #451 <Method boolean JSONObject.getBoolean(String)>
	//*  72  164:istore          4
	//*  73  166:iload           4
	//*  74  168:ifne            182
	//*  75  171:iload_3         
	//*  76  172:ifeq            182
	//*  77  175:getstatic       #454 <Field SubscriptionType SubscriptionType.CANCEL>
	//*  78  178:astore_0        
	//*  79  179:goto            201
	//*  80  182:aload           5
	//*  81  184:astore_0        
	//*  82  185:iload_3         
	//*  83  186:ifne            201
	//*  84  189:aload           5
	//*  85  191:astore_0        
	//*  86  192:iload           4
	//*  87  194:ifeq            201
	//*  88  197:getstatic       #457 <Field SubscriptionType SubscriptionType.RESTORE>
	//*  89  200:astore_0        
	//*  90  201:aload_0         
	//*  91  202:astore          5
	//*  92  204:aload_0         
	//*  93  205:ifnonnull       248
	//*  94  208:aload_0         
	//*  95  209:astore          5
	//*  96  211:aload           9
	//*  97  213:invokevirtual   #405 <Method boolean String.isEmpty()>
	//*  98  216:ifne            248
	//*  99  219:lload_1         
	//* 100  220:aload           6
	//* 101  222:ldc1            #44  <String "LAST_LOGGED_TIME_SEC">
	//* 102  224:invokevirtual   #203 <Method long JSONObject.getLong(String)>
	//* 103  227:lsub            
	//* 104  228:ldc2w           #69  <Long 0x15180L>
	//* 105  231:lcmp            
	//* 106  232:ifle            243
	//* 107  235:getstatic       #445 <Field SubscriptionType SubscriptionType.HEARTBEAT>
	//* 108  238:astore          5
	//* 109  240:goto            248
	//* 110  243:getstatic       #364 <Field SubscriptionType SubscriptionType.DUPLICATED>
	//* 111  246:astore          5
	//* 112  248:aload           5
	//* 113  250:getstatic       #364 <Field SubscriptionType SubscriptionType.DUPLICATED>
	//* 114  253:if_acmpeq       290
	//* 115  256:aload           7
	//* 116  258:ldc1            #44  <String "LAST_LOGGED_TIME_SEC">
	//* 117  260:lload_1         
	//* 118  261:invokevirtual   #460 <Method JSONObject JSONObject.put(String, long)>
	//* 119  264:pop             
	//* 120  265:getstatic       #122 <Field SharedPreferences purchaseSubsSharedPrefs>
	//* 121  268:invokeinterface #150 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//* 122  273:aload           8
	//* 123  275:aload           7
	//* 124  277:invokevirtual   #461 <Method String JSONObject.toString()>
	//* 125  280:invokeinterface #220 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//* 126  285:invokeinterface #159 <Method void android.content.SharedPreferences$Editor.apply()>
	//* 127  290:aload           5
	//* 128  292:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 129  293:astore_0        
		{
			Log.e(TAG, "parsing purchase failure: ", ((Throwable) (s)));
	//  130  294:getstatic       #90  <Field String TAG>
	//  131  297:ldc1            #225 <String "parsing purchase failure: ">
	//  132  299:aload_0         
	//  133  300:invokestatic    #231 <Method int Log.e(String, String, Throwable)>
	//  134  303:pop             
			return SubscriptionType.UNKNOWN;
	//  135  304:getstatic       #367 <Field SubscriptionType SubscriptionType.UNKNOWN>
	//  136  307:areturn         
		}
		s = ((String) (obj));
		if(obj != null)
			break MISSING_BLOCK_LABEL_201;
		s = ((String) (obj));
		if(s2.isEmpty())
			break MISSING_BLOCK_LABEL_201;
		flag = jsonobject.getBoolean("autoRenewing");
		flag1 = jsonobject1.getBoolean("autoRenewing");
		if(flag1 || !flag)
			break MISSING_BLOCK_LABEL_182;
		s = ((String) (SubscriptionType.CANCEL));
		break MISSING_BLOCK_LABEL_201;
		s = ((String) (obj));
		if(flag)
			break MISSING_BLOCK_LABEL_201;
		s = ((String) (obj));
		if(!flag1)
			break MISSING_BLOCK_LABEL_201;
		s = ((String) (SubscriptionType.RESTORE));
		obj = ((Object) (s));
		if(s != null)
			break MISSING_BLOCK_LABEL_248;
		obj = ((Object) (s));
		if(s2.isEmpty())
			break MISSING_BLOCK_LABEL_248;
		if(l - jsonobject.getLong("LAST_LOGGED_TIME_SEC") > 0x15180L)
		{
			obj = ((Object) (SubscriptionType.HEARTBEAT));
			break MISSING_BLOCK_LABEL_248;
		}
		obj = ((Object) (SubscriptionType.DUPLICATED));
		if(obj != SubscriptionType.DUPLICATED)
		{
			jsonobject1.put("LAST_LOGGED_TIME_SEC", l);
			purchaseSubsSharedPrefs.edit().putString(s1, jsonobject1.toString()).apply();
		}
		return ((SubscriptionType) (obj));
	}

	private static Object invokeMethod(Context context, String s, String s1, Object obj, Object aobj[])
	{
		s = ((String) (getClass(context, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #335 <Method Class getClass(Context, String)>
	//    3    5:astore_1        
		if(s == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
			return ((Object) (null));
	//    6   10:aconst_null     
	//    7   11:areturn         
		s1 = ((String) (getMethod(((Class) (s)), s1)));
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:invokestatic    #337 <Method Method getMethod(Class, String)>
	//   11   17:astore_2        
		if(s1 == null)
	//*  12   18:aload_2         
	//*  13   19:ifnonnull       24
			return ((Object) (null));
	//   14   22:aconst_null     
	//   15   23:areturn         
		context = ((Context) (obj));
	//   16   24:aload_3         
	//   17   25:astore_0        
		if(obj != null)
	//*  18   26:aload_3         
	//*  19   27:ifnull          36
			context = ((Context) (((Class) (s)).cast(obj)));
	//   20   30:aload_1         
	//   21   31:aload_3         
	//   22   32:invokevirtual   #468 <Method Object Class.cast(Object)>
	//   23   35:astore_0        
		try
		{
			context = ((Context) (((Method) (s1)).invoke(((Object) (context)), aobj)));
	//   24   36:aload_2         
	//   25   37:aload_0         
	//   26   38:aload           4
	//   27   40:invokevirtual   #472 <Method Object Method.invoke(Object, Object[])>
	//   28   43:astore_0        
		}
	//*  29   44:aload_0         
	//*  30   45:areturn         
	//*  31   46:astore_0        
	//*  32   47:getstatic       #90  <Field String TAG>
	//*  33   50:astore_3        
	//*  34   51:new             #257 <Class StringBuilder>
	//*  35   54:dup             
	//*  36   55:invokespecial   #258 <Method void StringBuilder()>
	//*  37   58:astore          4
	//*  38   60:aload           4
	//*  39   62:ldc2            #474 <String "Invocation target exception in ">
	//*  40   65:invokevirtual   #262 <Method StringBuilder StringBuilder.append(String)>
	//*  41   68:pop             
	//*  42   69:aload           4
	//*  43   71:aload_1         
	//*  44   72:invokevirtual   #297 <Method String Class.getName()>
	//*  45   75:invokevirtual   #262 <Method StringBuilder StringBuilder.append(String)>
	//*  46   78:pop             
	//*  47   79:aload           4
	//*  48   81:ldc2            #299 <String ".">
	//*  49   84:invokevirtual   #262 <Method StringBuilder StringBuilder.append(String)>
	//*  50   87:pop             
	//*  51   88:aload           4
	//*  52   90:aload_2         
	//*  53   91:invokevirtual   #475 <Method String Method.getName()>
	//*  54   94:invokevirtual   #262 <Method StringBuilder StringBuilder.append(String)>
	//*  55   97:pop             
	//*  56   98:aload_3         
	//*  57   99:aload           4
	//*  58  101:invokevirtual   #269 <Method String StringBuilder.toString()>
	//*  59  104:aload_0         
	//*  60  105:invokestatic    #231 <Method int Log.e(String, String, Throwable)>
	//*  61  108:pop             
	//*  62  109:aconst_null     
	//*  63  110:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  64  111:astore_0        
		{
			obj = ((Object) (TAG));
	//   65  112:getstatic       #90  <Field String TAG>
	//   66  115:astore_3        
			aobj = ((Object []) (new StringBuilder()));
	//   67  116:new             #257 <Class StringBuilder>
	//   68  119:dup             
	//   69  120:invokespecial   #258 <Method void StringBuilder()>
	//   70  123:astore          4
			((StringBuilder) (aobj)).append("Illegal access to method ");
	//   71  125:aload           4
	//   72  127:ldc2            #477 <String "Illegal access to method ">
	//   73  130:invokevirtual   #262 <Method StringBuilder StringBuilder.append(String)>
	//   74  133:pop             
			((StringBuilder) (aobj)).append(((Class) (s)).getName());
	//   75  134:aload           4
	//   76  136:aload_1         
	//   77  137:invokevirtual   #297 <Method String Class.getName()>
	//   78  140:invokevirtual   #262 <Method StringBuilder StringBuilder.append(String)>
	//   79  143:pop             
			((StringBuilder) (aobj)).append(".");
	//   80  144:aload           4
	//   81  146:ldc2            #299 <String ".">
	//   82  149:invokevirtual   #262 <Method StringBuilder StringBuilder.append(String)>
	//   83  152:pop             
			((StringBuilder) (aobj)).append(((Method) (s1)).getName());
	//   84  153:aload           4
	//   85  155:aload_2         
	//   86  156:invokevirtual   #475 <Method String Method.getName()>
	//   87  159:invokevirtual   #262 <Method StringBuilder StringBuilder.append(String)>
	//   88  162:pop             
			Log.e(((String) (obj)), ((StringBuilder) (aobj)).toString(), ((Throwable) (context)));
	//   89  163:aload_3         
	//   90  164:aload           4
	//   91  166:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   92  169:aload_0         
	//   93  170:invokestatic    #231 <Method int Log.e(String, String, Throwable)>
	//   94  173:pop             
			return ((Object) (null));
	//   95  174:aconst_null     
	//   96  175:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			obj = ((Object) (TAG));
			aobj = ((Object []) (new StringBuilder()));
			((StringBuilder) (aobj)).append("Invocation target exception in ");
			((StringBuilder) (aobj)).append(((Class) (s)).getName());
			((StringBuilder) (aobj)).append(".");
			((StringBuilder) (aobj)).append(((Method) (s1)).getName());
			Log.e(((String) (obj)), ((StringBuilder) (aobj)).toString(), ((Throwable) (context)));
			return ((Object) (null));
		}
		return ((Object) (context));
	}

	private static Boolean isBillingSupported(Context context, Object obj, String s)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(obj == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       12
			return Boolean.valueOf(false);
	//    4    7:iconst_0        
	//    5    8:invokestatic    #315 <Method Boolean Boolean.valueOf(boolean)>
	//    6   11:areturn         
		context = ((Context) (invokeMethod(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[] {
			Integer.valueOf(3), PACKAGE_NAME, s
		})));
	//    7   12:aload_0         
	//    8   13:ldc1            #32  <String "com.android.vending.billing.IInAppBillingService">
	//    9   15:ldc1            #38  <String "isBillingSupported">
	//   10   17:aload_1         
	//   11   18:iconst_3        
	//   12   19:anewarray       Object[]
	//   13   22:dup             
	//   14   23:iconst_0        
	//   15   24:iconst_3        
	//   16   25:invokestatic    #318 <Method Integer Integer.valueOf(int)>
	//   17   28:aastore         
	//   18   29:dup             
	//   19   30:iconst_1        
	//   20   31:getstatic       #112 <Field String PACKAGE_NAME>
	//   21   34:aastore         
	//   22   35:dup             
	//   23   36:iconst_2        
	//   24   37:aload_2         
	//   25   38:aastore         
	//   26   39:invokestatic    #130 <Method Object invokeMethod(Context, String, String, Object, Object[])>
	//   27   42:astore_0        
		boolean flag = flag1;
	//   28   43:iload           4
	//   29   45:istore_3        
		if(context != null)
	//*  30   46:aload_0         
	//*  31   47:ifnull          65
		{
			flag = flag1;
	//   32   50:iload           4
	//   33   52:istore_3        
			if(((Integer)context).intValue() == 0)
	//*  34   53:aload_0         
	//*  35   54:checkcast       #282 <Class Integer>
	//*  36   57:invokevirtual   #480 <Method int Integer.intValue()>
	//*  37   60:ifne            65
				flag = true;
	//   38   63:iconst_1        
	//   39   64:istore_3        
		}
		return Boolean.valueOf(flag);
	//   40   65:iload_3         
	//   41   66:invokestatic    #315 <Method Boolean Boolean.valueOf(boolean)>
	//   42   69:areturn         
	}

	private static Map readSkuDetailsFromCache(ArrayList arraylist)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #92  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #95  <Method void HashMap()>
	//    3    7:astore_3        
		long l = System.currentTimeMillis() / 1000L;
	//    4    8:invokestatic    #138 <Method long System.currentTimeMillis()>
	//    5   11:ldc2w           #139 <Long 1000L>
	//    6   14:ldiv            
	//    7   15:lstore_1        
		arraylist = ((ArrayList) (arraylist.iterator()));
	//    8   16:aload_0         
	//    9   17:invokevirtual   #175 <Method Iterator ArrayList.iterator()>
	//   10   20:astore_0        
		do
		{
			if(!((Iterator) (arraylist)).hasNext())
				break;
	//   11   21:aload_0         
	//   12   22:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//   13   27:ifeq            102
			String s = (String)((Iterator) (arraylist)).next();
	//   14   30:aload_0         
	//   15   31:invokeinterface #185 <Method Object Iterator.next()>
	//   16   36:checkcast       #187 <Class String>
	//   17   39:astore          4
			String s1 = skuDetailSharedPrefs.getString(s, ((String) (null)));
	//   18   41:getstatic       #118 <Field SharedPreferences skuDetailSharedPrefs>
	//   19   44:aload           4
	//   20   46:aconst_null     
	//   21   47:invokeinterface #212 <Method String SharedPreferences.getString(String, String)>
	//   22   52:astore          5
			if(s1 != null)
	//*  23   54:aload           5
	//*  24   56:ifnull          21
			{
				String as[] = s1.split(";", 2);
	//   25   59:aload           5
	//   26   61:ldc2            #482 <String ";">
	//   27   64:iconst_2        
	//   28   65:invokevirtual   #486 <Method String[] String.split(String, int)>
	//   29   68:astore          5
				if(l - Long.parseLong(as[0]) < 43200L)
	//*  30   70:lload_1         
	//*  31   71:aload           5
	//*  32   73:iconst_0        
	//*  33   74:aaload          
	//*  34   75:invokestatic    #491 <Method long Long.parseLong(String)>
	//*  35   78:lsub            
	//*  36   79:ldc2w           #206 <Long 43200L>
	//*  37   82:lcmp            
	//*  38   83:ifge            21
					((Map) (hashmap)).put(((Object) (s)), ((Object) (as[1])));
	//   39   86:aload_3         
	//   40   87:aload           4
	//   41   89:aload           5
	//   42   91:iconst_1        
	//   43   92:aaload          
	//   44   93:invokeinterface #370 <Method Object Map.put(Object, Object)>
	//   45   98:pop             
			}
		} while(true);
	//   46   99:goto            21
		return ((Map) (hashmap));
	//   47  102:aload_3         
	//   48  103:areturn         
	}

	private static void writeSkuDetailsToCache(Map map)
	{
		long l = System.currentTimeMillis() / 1000L;
	//    0    0:invokestatic    #138 <Method long System.currentTimeMillis()>
	//    1    3:ldc2w           #139 <Long 1000L>
	//    2    6:ldiv            
	//    3    7:lstore_1        
		android.content.SharedPreferences.Editor editor = skuDetailSharedPrefs.edit();
	//    4    8:getstatic       #118 <Field SharedPreferences skuDetailSharedPrefs>
	//    5   11:invokeinterface #150 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    6   16:astore_3        
		String s;
		StringBuilder stringbuilder;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); editor.putString(s, stringbuilder.toString()))
	//*   7   17:aload_0         
	//*   8   18:invokeinterface #391 <Method Set Map.entrySet()>
	//*   9   23:invokeinterface #392 <Method Iterator Set.iterator()>
	//*  10   28:astore_0        
	//*  11   29:aload_0         
	//*  12   30:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//*  13   35:ifeq            119
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   14   38:aload_0         
	//   15   39:invokeinterface #185 <Method Object Iterator.next()>
	//   16   44:checkcast       #394 <Class java.util.Map$Entry>
	//   17   47:astore          4
			s = (String)entry.getKey();
	//   18   49:aload           4
	//   19   51:invokeinterface #397 <Method Object java.util.Map$Entry.getKey()>
	//   20   56:checkcast       #187 <Class String>
	//   21   59:astore          5
			stringbuilder = new StringBuilder();
	//   22   61:new             #257 <Class StringBuilder>
	//   23   64:dup             
	//   24   65:invokespecial   #258 <Method void StringBuilder()>
	//   25   68:astore          6
			stringbuilder.append(l);
	//   26   70:aload           6
	//   27   72:lload_1         
	//   28   73:invokevirtual   #495 <Method StringBuilder StringBuilder.append(long)>
	//   29   76:pop             
			stringbuilder.append(";");
	//   30   77:aload           6
	//   31   79:ldc2            #482 <String ";">
	//   32   82:invokevirtual   #262 <Method StringBuilder StringBuilder.append(String)>
	//   33   85:pop             
			stringbuilder.append((String)entry.getValue());
	//   34   86:aload           6
	//   35   88:aload           4
	//   36   90:invokeinterface #498 <Method Object java.util.Map$Entry.getValue()>
	//   37   95:checkcast       #187 <Class String>
	//   38   98:invokevirtual   #262 <Method StringBuilder StringBuilder.append(String)>
	//   39  101:pop             
		}

	//   40  102:aload_3         
	//   41  103:aload           5
	//   42  105:aload           6
	//   43  107:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   44  110:invokeinterface #220 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   45  115:pop             
	//*  46  116:goto            29
		editor.apply();
	//   47  119:aload_3         
	//   48  120:invokeinterface #159 <Method void android.content.SharedPreferences$Editor.apply()>
	//   49  125:return          
	}

	private static final String AS_INTERFACE = "asInterface";
	private static final int CACHE_CLEAR_TIME_LIMIT_SEC = 0x93a80;
	private static final String DETAILS_LIST = "DETAILS_LIST";
	private static final String GET_PURCHASES = "getPurchases";
	private static final String GET_PURCHASE_HISTORY = "getPurchaseHistory";
	private static final String GET_SKU_DETAILS = "getSkuDetails";
	private static final String INAPP = "inapp";
	private static final String INAPP_CONTINUATION_TOKEN = "INAPP_CONTINUATION_TOKEN";
	private static final String INAPP_PURCHASE_DATA_LIST = "INAPP_PURCHASE_DATA_LIST";
	private static final String IN_APP_BILLING_SERVICE = "com.android.vending.billing.IInAppBillingService";
	private static final String IN_APP_BILLING_SERVICE_STUB = "com.android.vending.billing.IInAppBillingService$Stub";
	private static final String IS_BILLING_SUPPORTED = "isBillingSupported";
	private static final String ITEM_ID_LIST = "ITEM_ID_LIST";
	private static final String LAST_CLEARED_TIME = "LAST_CLEARED_TIME";
	private static final String LAST_LOGGED_TIME_SEC = "LAST_LOGGED_TIME_SEC";
	private static final int MAX_QUERY_PURCHASE_NUM = 30;
	private static final String PACKAGE_NAME = FacebookSdk.getApplicationContext().getPackageName();
	private static final int PURCHASE_EXPIRE_TIME_SEC = 43200;
	private static final String PURCHASE_INAPP_STORE = "com.facebook.internal.PURCHASE";
	private static final int PURCHASE_STOP_QUERY_TIME_SEC = 1200;
	private static final String PURCHASE_SUBS_STORE = "com.facebook.internal.PURCHASE_SUBS";
	private static final String RESPONSE_CODE = "RESPONSE_CODE";
	private static final String SKU_DETAILS_STORE = "com.facebook.internal.SKU_DETAILS";
	private static final int SKU_DETAIL_EXPIRE_TIME_SEC = 43200;
	private static final String SUBSCRIPTION = "subs";
	private static final long SUBSCRIPTION_HARTBEAT_INTERVAL = 0x15180L;
	private static final String TAG = ((Class) (com/facebook/appevents/internal/InAppPurchaseEventManager)).getCanonicalName();
	private static final HashMap classMap = new HashMap();
	private static final HashMap methodMap = new HashMap();
	private static final SharedPreferences purchaseInappSharedPrefs = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
	private static final SharedPreferences purchaseSubsSharedPrefs = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.PURCHASE_SUBS", 0);
	private static final SharedPreferences skuDetailSharedPrefs = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

	static 
	{
	//    0    0:ldc1            #2   <Class InAppPurchaseEventManager>
	//    1    2:invokevirtual   #88  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #90  <Field String TAG>
	//    3    8:new             #92  <Class HashMap>
	//    4   11:dup             
	//    5   12:invokespecial   #95  <Method void HashMap()>
	//    6   15:putstatic       #97  <Field HashMap methodMap>
	//    7   18:new             #92  <Class HashMap>
	//    8   21:dup             
	//    9   22:invokespecial   #95  <Method void HashMap()>
	//   10   25:putstatic       #99  <Field HashMap classMap>
	//   11   28:invokestatic    #105 <Method Context FacebookSdk.getApplicationContext()>
	//   12   31:invokevirtual   #110 <Method String Context.getPackageName()>
	//   13   34:putstatic       #112 <Field String PACKAGE_NAME>
	//   14   37:invokestatic    #105 <Method Context FacebookSdk.getApplicationContext()>
	//   15   40:ldc1            #62  <String "com.facebook.internal.SKU_DETAILS">
	//   16   42:iconst_0        
	//   17   43:invokevirtual   #116 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   18   46:putstatic       #118 <Field SharedPreferences skuDetailSharedPrefs>
	//   19   49:invokestatic    #105 <Method Context FacebookSdk.getApplicationContext()>
	//   20   52:ldc1            #52  <String "com.facebook.internal.PURCHASE">
	//   21   54:iconst_0        
	//   22   55:invokevirtual   #116 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   23   58:putstatic       #120 <Field SharedPreferences purchaseInappSharedPrefs>
	//   24   61:invokestatic    #105 <Method Context FacebookSdk.getApplicationContext()>
	//   25   64:ldc1            #57  <String "com.facebook.internal.PURCHASE_SUBS">
	//   26   66:iconst_0        
	//   27   67:invokevirtual   #116 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   28   70:putstatic       #122 <Field SharedPreferences purchaseSubsSharedPrefs>
	//*  29   73:return          
	}
}
