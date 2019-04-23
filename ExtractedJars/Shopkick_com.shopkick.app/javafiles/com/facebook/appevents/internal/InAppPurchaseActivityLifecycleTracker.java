// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.*;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.FacebookSdk;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.appevents.internal:
//			InAppPurchaseEventManager, AutomaticAnalyticsLogger, SubscriptionType

public class InAppPurchaseActivityLifecycleTracker
{

	public InAppPurchaseActivityLifecycleTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Object()>
	//    2    4:return          
	}

	private static void initializeIfNotInitialized()
	{
		ClassNotFoundException classnotfoundexception;
		if(hasBillingService != null)
	//*   0    0:getstatic       #53  <Field Boolean hasBillingService>
	//*   1    3:ifnull          7
			return;
	//    2    6:return          
		try
		{
			Class.forName("com.android.vending.billing.IInAppBillingService$Stub");
	//    3    7:ldc1            #19  <String "com.android.vending.billing.IInAppBillingService$Stub">
	//    4    9:invokestatic    #83  <Method Class Class.forName(String)>
	//    5   12:pop             
			hasBillingService = Boolean.valueOf(true);
	//    6   13:iconst_1        
	//    7   14:invokestatic    #89  <Method Boolean Boolean.valueOf(boolean)>
	//    8   17:putstatic       #53  <Field Boolean hasBillingService>
		}
	//*   9   20:ldc1            #16  <String "com.android.billingclient.api.ProxyBillingActivity">
	//*  10   22:invokestatic    #83  <Method Class Class.forName(String)>
	//*  11   25:pop             
	//*  12   26:iconst_1        
	//*  13   27:invokestatic    #89  <Method Boolean Boolean.valueOf(boolean)>
	//*  14   30:putstatic       #55  <Field Boolean hasBiillingActivity>
	//*  15   33:goto            43
	//*  16   36:iconst_0        
	//*  17   37:invokestatic    #89  <Method Boolean Boolean.valueOf(boolean)>
	//*  18   40:putstatic       #55  <Field Boolean hasBiillingActivity>
	//*  19   43:invokestatic    #94  <Method void InAppPurchaseEventManager.clearSkuDetailsCache()>
	//*  20   46:new             #96  <Class Intent>
	//*  21   49:dup             
	//*  22   50:ldc1            #98  <String "com.android.vending.billing.InAppBillingService.BIND">
	//*  23   52:invokespecial   #101 <Method void Intent(String)>
	//*  24   55:ldc1            #103 <String "com.android.vending">
	//*  25   57:invokevirtual   #107 <Method Intent Intent.setPackage(String)>
	//*  26   60:putstatic       #109 <Field Intent intent>
	//*  27   63:new             #6   <Class InAppPurchaseActivityLifecycleTracker$1>
	//*  28   66:dup             
	//*  29   67:invokespecial   #110 <Method void InAppPurchaseActivityLifecycleTracker$1()>
	//*  30   70:putstatic       #112 <Field ServiceConnection serviceConnection>
	//*  31   73:new             #8   <Class InAppPurchaseActivityLifecycleTracker$2>
	//*  32   76:dup             
	//*  33   77:invokespecial   #113 <Method void InAppPurchaseActivityLifecycleTracker$2()>
	//*  34   80:putstatic       #115 <Field android.app.Application$ActivityLifecycleCallbacks callbacks>
	//*  35   83:return          
	//*  36   84:iconst_0        
	//*  37   85:invokestatic    #89  <Method Boolean Boolean.valueOf(boolean)>
	//*  38   88:putstatic       #53  <Field Boolean hasBillingService>
	//*  39   91:return          
		// Misplaced declaration of an exception variable
		catch(ClassNotFoundException classnotfoundexception)
		{
			hasBillingService = Boolean.valueOf(false);
			return;
		}
		try
		{
			Class.forName("com.android.billingclient.api.ProxyBillingActivity");
			hasBiillingActivity = Boolean.valueOf(true);
		}
	//*  40   92:astore_0        
	//*  41   93:goto            84
		// Misplaced declaration of an exception variable
		catch(ClassNotFoundException classnotfoundexception)
		{
			hasBiillingActivity = Boolean.valueOf(false);
		}
		InAppPurchaseEventManager.clearSkuDetailsCache();
		intent = (new Intent("com.android.vending.billing.InAppBillingService.BIND")).setPackage("com.android.vending");
		serviceConnection = new ServiceConnection() {

			public void onServiceConnected(ComponentName componentname, IBinder ibinder)
			{
				InAppPurchaseActivityLifecycleTracker.inAppBillingObj = InAppPurchaseEventManager.asInterface(FacebookSdk.getApplicationContext(), ibinder);
			//    0    0:invokestatic    #23  <Method Context FacebookSdk.getApplicationContext()>
			//    1    3:aload_2         
			//    2    4:invokestatic    #29  <Method Object InAppPurchaseEventManager.asInterface(Context, IBinder)>
			//    3    7:invokestatic    #33  <Method Object InAppPurchaseActivityLifecycleTracker.access$002(Object)>
			//    4   10:pop             
			//    5   11:return          
			}

			public void onServiceDisconnected(ComponentName componentname)
			{
			//    0    0:return          
			}

		}
;
		callbacks = new android.app.Application.ActivityLifecycleCallbacks() {

			public void onActivityCreated(Activity activity, Bundle bundle)
			{
			//    0    0:return          
			}

			public void onActivityDestroyed(Activity activity)
			{
			//    0    0:return          
			}

			public void onActivityPaused(Activity activity)
			{
			//    0    0:return          
			}

			public void onActivityResumed(Activity activity)
			{
				FacebookSdk.getExecutor().execute(new Runnable() {

					public void run()
					{
						Context context = FacebookSdk.getApplicationContext();
					//    0    0:invokestatic    #28  <Method Context FacebookSdk.getApplicationContext()>
					//    1    3:astore_1        
						InAppPurchaseActivityLifecycleTracker.logPurchaseInapp(context, InAppPurchaseEventManager.getPurchasesInapp(context, InAppPurchaseActivityLifecycleTracker.inAppBillingObj));
					//    2    4:aload_1         
					//    3    5:aload_1         
					//    4    6:invokestatic    #34  <Method Object InAppPurchaseActivityLifecycleTracker.access$000()>
					//    5    9:invokestatic    #40  <Method ArrayList InAppPurchaseEventManager.getPurchasesInapp(Context, Object)>
					//    6   12:invokestatic    #44  <Method void InAppPurchaseActivityLifecycleTracker.access$100(Context, ArrayList)>
						Map map = InAppPurchaseEventManager.getPurchasesSubs(context, InAppPurchaseActivityLifecycleTracker.inAppBillingObj);
					//    7   15:aload_1         
					//    8   16:invokestatic    #34  <Method Object InAppPurchaseActivityLifecycleTracker.access$000()>
					//    9   19:invokestatic    #48  <Method Map InAppPurchaseEventManager.getPurchasesSubs(Context, Object)>
					//   10   22:astore_2        
						for(Iterator iterator = InAppPurchaseEventManager.getPurchasesSubsExpire(context, InAppPurchaseActivityLifecycleTracker.inAppBillingObj).iterator(); iterator.hasNext(); map.put(((Object) ((String)iterator.next())), ((Object) (SubscriptionType.EXPIRE))));
					//   11   23:aload_1         
					//   12   24:invokestatic    #34  <Method Object InAppPurchaseActivityLifecycleTracker.access$000()>
					//   13   27:invokestatic    #51  <Method ArrayList InAppPurchaseEventManager.getPurchasesSubsExpire(Context, Object)>
					//   14   30:invokevirtual   #57  <Method Iterator ArrayList.iterator()>
					//   15   33:astore_3        
					//   16   34:aload_3         
					//   17   35:invokeinterface #63  <Method boolean Iterator.hasNext()>
					//   18   40:ifeq            65
					//   19   43:aload_2         
					//   20   44:aload_3         
					//   21   45:invokeinterface #66  <Method Object Iterator.next()>
					//   22   50:checkcast       #68  <Class String>
					//   23   53:getstatic       #74  <Field SubscriptionType SubscriptionType.EXPIRE>
					//   24   56:invokeinterface #80  <Method Object Map.put(Object, Object)>
					//   25   61:pop             
					//*  26   62:goto            34
						InAppPurchaseActivityLifecycleTracker.logPurchaseSubs(context, map);
					//   27   65:aload_1         
					//   28   66:aload_2         
					//   29   67:invokestatic    #84  <Method void InAppPurchaseActivityLifecycleTracker.access$200(Context, Map)>
					//   30   70:return          
					}

					final _cls2 this$0;

			
			{
				this$0 = _cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field InAppPurchaseActivityLifecycleTracker$2 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
				}
);
			//    0    0:invokestatic    #31  <Method Executor FacebookSdk.getExecutor()>
			//    1    3:new             #13  <Class InAppPurchaseActivityLifecycleTracker$2$1>
			//    2    6:dup             
			//    3    7:aload_0         
			//    4    8:invokespecial   #34  <Method void InAppPurchaseActivityLifecycleTracker$2$1(InAppPurchaseActivityLifecycleTracker$2)>
			//    5   11:invokeinterface #40  <Method void Executor.execute(Runnable)>
			//    6   16:return          
			}

			public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
			{
			//    0    0:return          
			}

			public void onActivityStarted(Activity activity)
			{
			//    0    0:return          
			}

			public void onActivityStopped(Activity activity)
			{
				if(InAppPurchaseActivityLifecycleTracker.hasBiillingActivity.booleanValue() && activity.getLocalClassName().equals("com.android.billingclient.api.ProxyBillingActivity"))
			//*   0    0:invokestatic    #47  <Method Boolean InAppPurchaseActivityLifecycleTracker.access$300()>
			//*   1    3:invokevirtual   #53  <Method boolean Boolean.booleanValue()>
			//*   2    6:ifeq            37
			//*   3    9:aload_1         
			//*   4   10:invokevirtual   #59  <Method String Activity.getLocalClassName()>
			//*   5   13:ldc1            #61  <String "com.android.billingclient.api.ProxyBillingActivity">
			//*   6   15:invokevirtual   #67  <Method boolean String.equals(Object)>
			//*   7   18:ifeq            37
					FacebookSdk.getExecutor().execute(new Runnable() {

						public void run()
						{
							Context context = FacebookSdk.getApplicationContext();
						//    0    0:invokestatic    #28  <Method Context FacebookSdk.getApplicationContext()>
						//    1    3:astore_3        
							ArrayList arraylist1 = InAppPurchaseEventManager.getPurchasesInapp(context, InAppPurchaseActivityLifecycleTracker.inAppBillingObj);
						//    2    4:aload_3         
						//    3    5:invokestatic    #34  <Method Object InAppPurchaseActivityLifecycleTracker.access$000()>
						//    4    8:invokestatic    #40  <Method ArrayList InAppPurchaseEventManager.getPurchasesInapp(Context, Object)>
						//    5   11:astore_2        
							ArrayList arraylist = arraylist1;
						//    6   12:aload_2         
						//    7   13:astore_1        
							if(arraylist1.isEmpty())
						//*   8   14:aload_2         
						//*   9   15:invokevirtual   #46  <Method boolean ArrayList.isEmpty()>
						//*  10   18:ifeq            29
								arraylist = InAppPurchaseEventManager.getPurchaseHistoryInapp(context, InAppPurchaseActivityLifecycleTracker.inAppBillingObj);
						//   11   21:aload_3         
						//   12   22:invokestatic    #34  <Method Object InAppPurchaseActivityLifecycleTracker.access$000()>
						//   13   25:invokestatic    #49  <Method ArrayList InAppPurchaseEventManager.getPurchaseHistoryInapp(Context, Object)>
						//   14   28:astore_1        
							InAppPurchaseActivityLifecycleTracker.logPurchaseInapp(context, arraylist);
						//   15   29:aload_3         
						//   16   30:aload_1         
						//   17   31:invokestatic    #53  <Method void InAppPurchaseActivityLifecycleTracker.access$100(Context, ArrayList)>
						//   18   34:return          
						}

						final _cls2 this$0;

			
			{
				this$0 = _cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field InAppPurchaseActivityLifecycleTracker$2 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
					}
);
			//    8   21:invokestatic    #31  <Method Executor FacebookSdk.getExecutor()>
			//    9   24:new             #15  <Class InAppPurchaseActivityLifecycleTracker$2$2>
			//   10   27:dup             
			//   11   28:aload_0         
			//   12   29:invokespecial   #68  <Method void InAppPurchaseActivityLifecycleTracker$2$2(InAppPurchaseActivityLifecycleTracker$2)>
			//   13   32:invokeinterface #40  <Method void Executor.execute(Runnable)>
			//   14   37:return          
			}

		}
;
	//*  42   96:astore_0        
	//*  43   97:goto            36
	}

	private static void logPurchaseInapp(Context context, ArrayList arraylist)
	{
		if(arraylist.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #123 <Method boolean ArrayList.isEmpty()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		HashMap hashmap = new HashMap();
	//    4    8:new             #125 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #126 <Method void HashMap()>
	//    7   15:astore_2        
		ArrayList arraylist1 = new ArrayList();
	//    8   16:new             #119 <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #127 <Method void ArrayList()>
	//   11   23:astore_3        
		for(arraylist = ((ArrayList) (arraylist.iterator())); ((Iterator) (arraylist)).hasNext();)
	//*  12   24:aload_1         
	//*  13   25:invokevirtual   #131 <Method Iterator ArrayList.iterator()>
	//*  14   28:astore_1        
	//*  15   29:aload_1         
	//*  16   30:invokeinterface #136 <Method boolean Iterator.hasNext()>
	//*  17   35:ifeq            102
		{
			String s = (String)((Iterator) (arraylist)).next();
	//   18   38:aload_1         
	//   19   39:invokeinterface #139 <Method Object Iterator.next()>
	//   20   44:checkcast       #141 <Class String>
	//   21   47:astore          4
			try
			{
				String s1 = (new JSONObject(s)).getString("productId");
	//   22   49:new             #143 <Class JSONObject>
	//   23   52:dup             
	//   24   53:aload           4
	//   25   55:invokespecial   #144 <Method void JSONObject(String)>
	//   26   58:ldc1            #146 <String "productId">
	//   27   60:invokevirtual   #150 <Method String JSONObject.getString(String)>
	//   28   63:astore          5
				((Map) (hashmap)).put(((Object) (s1)), ((Object) (s)));
	//   29   65:aload_2         
	//   30   66:aload           5
	//   31   68:aload           4
	//   32   70:invokeinterface #156 <Method Object Map.put(Object, Object)>
	//   33   75:pop             
				arraylist1.add(((Object) (s1)));
	//   34   76:aload_3         
	//   35   77:aload           5
	//   36   79:invokevirtual   #160 <Method boolean ArrayList.add(Object)>
	//   37   82:pop             
			}
	//*  38   83:goto            29
			catch(JSONException jsonexception)
	//*  39   86:astore          4
			{
				Log.e(TAG, "Error parsing in-app purchase data.", ((Throwable) (jsonexception)));
	//   40   88:getstatic       #43  <Field String TAG>
	//   41   91:ldc1            #162 <String "Error parsing in-app purchase data.">
	//   42   93:aload           4
	//   43   95:invokestatic    #168 <Method int Log.e(String, String, Throwable)>
	//   44   98:pop             
			}
		}

	//*  45   99:goto            29
		for(context = ((Context) (InAppPurchaseEventManager.getSkuDetails(context, arraylist1, inAppBillingObj, false).entrySet().iterator())); ((Iterator) (context)).hasNext(); AutomaticAnalyticsLogger.logPurchaseInapp((String)((Map) (hashmap)).get(((java.util.Map.Entry) (arraylist)).getKey()), (String)((java.util.Map.Entry) (arraylist)).getValue()))
	//*  46  102:aload_0         
	//*  47  103:aload_3         
	//*  48  104:getstatic       #62  <Field Object inAppBillingObj>
	//*  49  107:iconst_0        
	//*  50  108:invokestatic    #172 <Method Map InAppPurchaseEventManager.getSkuDetails(Context, ArrayList, Object, boolean)>
	//*  51  111:invokeinterface #176 <Method Set Map.entrySet()>
	//*  52  116:invokeinterface #179 <Method Iterator Set.iterator()>
	//*  53  121:astore_0        
	//*  54  122:aload_0         
	//*  55  123:invokeinterface #136 <Method boolean Iterator.hasNext()>
	//*  56  128:ifeq            171
			arraylist = ((ArrayList) ((java.util.Map.Entry)((Iterator) (context)).next()));
	//   57  131:aload_0         
	//   58  132:invokeinterface #139 <Method Object Iterator.next()>
	//   59  137:checkcast       #181 <Class java.util.Map$Entry>
	//   60  140:astore_1        

	//   61  141:aload_2         
	//   62  142:aload_1         
	//   63  143:invokeinterface #184 <Method Object java.util.Map$Entry.getKey()>
	//   64  148:invokeinterface #187 <Method Object Map.get(Object)>
	//   65  153:checkcast       #141 <Class String>
	//   66  156:aload_1         
	//   67  157:invokeinterface #190 <Method Object java.util.Map$Entry.getValue()>
	//   68  162:checkcast       #141 <Class String>
	//   69  165:invokestatic    #195 <Method void AutomaticAnalyticsLogger.logPurchaseInapp(String, String)>
	//*  70  168:goto            122
	//   71  171:return          
	}

	private static void logPurchaseSubs(Context context, Map map)
	{
		if(map.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #198 <Method boolean Map.isEmpty()>
	//*   2    6:ifeq            10
			return;
	//    3    9:return          
		HashMap hashmap = new HashMap();
	//    4   10:new             #125 <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #126 <Method void HashMap()>
	//    7   17:astore_2        
		ArrayList arraylist = new ArrayList();
	//    8   18:new             #119 <Class ArrayList>
	//    9   21:dup             
	//   10   22:invokespecial   #127 <Method void ArrayList()>
	//   11   25:astore_3        
		for(Iterator iterator1 = map.keySet().iterator(); iterator1.hasNext();)
	//*  12   26:aload_1         
	//*  13   27:invokeinterface #201 <Method Set Map.keySet()>
	//*  14   32:invokeinterface #179 <Method Iterator Set.iterator()>
	//*  15   37:astore          4
	//*  16   39:aload           4
	//*  17   41:invokeinterface #136 <Method boolean Iterator.hasNext()>
	//*  18   46:ifeq            114
		{
			String s1 = (String)iterator1.next();
	//   19   49:aload           4
	//   20   51:invokeinterface #139 <Method Object Iterator.next()>
	//   21   56:checkcast       #141 <Class String>
	//   22   59:astore          5
			try
			{
				String s3 = (new JSONObject(s1)).getString("productId");
	//   23   61:new             #143 <Class JSONObject>
	//   24   64:dup             
	//   25   65:aload           5
	//   26   67:invokespecial   #144 <Method void JSONObject(String)>
	//   27   70:ldc1            #146 <String "productId">
	//   28   72:invokevirtual   #150 <Method String JSONObject.getString(String)>
	//   29   75:astore          6
				arraylist.add(((Object) (s3)));
	//   30   77:aload_3         
	//   31   78:aload           6
	//   32   80:invokevirtual   #160 <Method boolean ArrayList.add(Object)>
	//   33   83:pop             
				((Map) (hashmap)).put(((Object) (s3)), ((Object) (s1)));
	//   34   84:aload_2         
	//   35   85:aload           6
	//   36   87:aload           5
	//   37   89:invokeinterface #156 <Method Object Map.put(Object, Object)>
	//   38   94:pop             
			}
	//*  39   95:goto            39
			catch(JSONException jsonexception)
	//*  40   98:astore          5
			{
				Log.e(TAG, "Error parsing in-app purchase data.", ((Throwable) (jsonexception)));
	//   41  100:getstatic       #43  <Field String TAG>
	//   42  103:ldc1            #162 <String "Error parsing in-app purchase data.">
	//   43  105:aload           5
	//   44  107:invokestatic    #168 <Method int Log.e(String, String, Throwable)>
	//   45  110:pop             
			}
		}

	//*  46  111:goto            39
		context = ((Context) (InAppPurchaseEventManager.getSkuDetails(context, arraylist, inAppBillingObj, true)));
	//   47  114:aload_0         
	//   48  115:aload_3         
	//   49  116:getstatic       #62  <Field Object inAppBillingObj>
	//   50  119:iconst_1        
	//   51  120:invokestatic    #172 <Method Map InAppPurchaseEventManager.getSkuDetails(Context, ArrayList, Object, boolean)>
	//   52  123:astore_0        
		String s;
		String s2;
		for(Iterator iterator = ((Map) (context)).keySet().iterator(); iterator.hasNext(); AutomaticAnalyticsLogger.logPurchaseSubs((SubscriptionType)map.get(((Object) (s))), s, s2))
	//*  53  124:aload_0         
	//*  54  125:invokeinterface #201 <Method Set Map.keySet()>
	//*  55  130:invokeinterface #179 <Method Iterator Set.iterator()>
	//*  56  135:astore_3        
	//*  57  136:aload_3         
	//*  58  137:invokeinterface #136 <Method boolean Iterator.hasNext()>
	//*  59  142:ifeq            203
		{
			s2 = (String)iterator.next();
	//   60  145:aload_3         
	//   61  146:invokeinterface #139 <Method Object Iterator.next()>
	//   62  151:checkcast       #141 <Class String>
	//   63  154:astore          5
			s = (String)((Map) (hashmap)).get(((Object) (s2)));
	//   64  156:aload_2         
	//   65  157:aload           5
	//   66  159:invokeinterface #187 <Method Object Map.get(Object)>
	//   67  164:checkcast       #141 <Class String>
	//   68  167:astore          4
			s2 = (String)((Map) (context)).get(((Object) (s2)));
	//   69  169:aload_0         
	//   70  170:aload           5
	//   71  172:invokeinterface #187 <Method Object Map.get(Object)>
	//   72  177:checkcast       #141 <Class String>
	//   73  180:astore          5
		}

	//   74  182:aload_1         
	//   75  183:aload           4
	//   76  185:invokeinterface #187 <Method Object Map.get(Object)>
	//   77  190:checkcast       #203 <Class SubscriptionType>
	//   78  193:aload           4
	//   79  195:aload           5
	//   80  197:invokestatic    #206 <Method void AutomaticAnalyticsLogger.logPurchaseSubs(SubscriptionType, String, String)>
	//*  81  200:goto            136
	//   82  203:return          
	}

	private static void startTracking()
	{
		if(!isTracking.compareAndSet(false, true))
	//*   0    0:getstatic       #51  <Field AtomicBoolean isTracking>
	//*   1    3:iconst_0        
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #212 <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   4    8:ifne            12
			return;
	//    5   11:return          
		Context context = FacebookSdk.getApplicationContext();
	//    6   12:invokestatic    #218 <Method Context FacebookSdk.getApplicationContext()>
	//    7   15:astore_0        
		if(context instanceof Application)
	//*   8   16:aload_0         
	//*   9   17:instanceof      #220 <Class Application>
	//*  10   20:ifeq            45
		{
			((Application)context).registerActivityLifecycleCallbacks(callbacks);
	//   11   23:aload_0         
	//   12   24:checkcast       #220 <Class Application>
	//   13   27:getstatic       #115 <Field android.app.Application$ActivityLifecycleCallbacks callbacks>
	//   14   30:invokevirtual   #224 <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
			context.bindService(intent, serviceConnection, 1);
	//   15   33:aload_0         
	//   16   34:getstatic       #109 <Field Intent intent>
	//   17   37:getstatic       #112 <Field ServiceConnection serviceConnection>
	//   18   40:iconst_1        
	//   19   41:invokevirtual   #230 <Method boolean Context.bindService(Intent, ServiceConnection, int)>
	//   20   44:pop             
		}
	//   21   45:return          
	}

	public static void update()
	{
		initializeIfNotInitialized();
	//    0    0:invokestatic    #233 <Method void initializeIfNotInitialized()>
		if(!hasBillingService.booleanValue())
	//*   1    3:getstatic       #53  <Field Boolean hasBillingService>
	//*   2    6:invokevirtual   #236 <Method boolean Boolean.booleanValue()>
	//*   3    9:ifne            13
			return;
	//    4   12:return          
		if(AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled())
	//*   5   13:invokestatic    #239 <Method boolean AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled()>
	//*   6   16:ifeq            22
			startTracking();
	//    7   19:invokestatic    #241 <Method void startTracking()>
	//    8   22:return          
	}

	private static final String BILLING_ACTIVITY_NAME = "com.android.billingclient.api.ProxyBillingActivity";
	private static final String SERVICE_INTERFACE_NAME = "com.android.vending.billing.IInAppBillingService$Stub";
	private static final String TAG = ((Class) (com/facebook/appevents/internal/InAppPurchaseActivityLifecycleTracker)).getCanonicalName();
	private static android.app.Application.ActivityLifecycleCallbacks callbacks;
	private static Boolean hasBiillingActivity = null;
	private static Boolean hasBillingService = null;
	private static Object inAppBillingObj;
	private static Intent intent;
	private static final AtomicBoolean isTracking = new AtomicBoolean(false);
	private static ServiceConnection serviceConnection;

	static 
	{
	//    0    0:ldc1            #2   <Class InAppPurchaseActivityLifecycleTracker>
	//    1    2:invokevirtual   #41  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #43  <Field String TAG>
	//    3    8:new             #45  <Class AtomicBoolean>
	//    4   11:dup             
	//    5   12:iconst_0        
	//    6   13:invokespecial   #49  <Method void AtomicBoolean(boolean)>
	//    7   16:putstatic       #51  <Field AtomicBoolean isTracking>
	//    8   19:aconst_null     
	//    9   20:putstatic       #53  <Field Boolean hasBillingService>
	//   10   23:aconst_null     
	//   11   24:putstatic       #55  <Field Boolean hasBiillingActivity>
	//*  12   27:return          
	}


/*
	static Object access$000()
	{
		return inAppBillingObj;
	//    0    0:getstatic       #62  <Field Object inAppBillingObj>
	//    1    3:areturn         
	}

*/


/*
	static Object access$002(Object obj)
	{
		inAppBillingObj = obj;
	//    0    0:aload_0         
	//    1    1:putstatic       #62  <Field Object inAppBillingObj>
		return obj;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/


/*
	static void access$100(Context context, ArrayList arraylist)
	{
		logPurchaseInapp(context, arraylist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #69  <Method void logPurchaseInapp(Context, ArrayList)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$200(Context context, Map map)
	{
		logPurchaseSubs(context, map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #74  <Method void logPurchaseSubs(Context, Map)>
		return;
	//    3    5:return          
	}

*/


/*
	static Boolean access$300()
	{
		return hasBiillingActivity;
	//    0    0:getstatic       #55  <Field Boolean hasBiillingActivity>
	//    1    3:areturn         
	}

*/
}
