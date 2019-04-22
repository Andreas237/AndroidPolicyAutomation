// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.app.Application;
import android.content.*;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.*;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.math.BigDecimal;
import java.util.Currency;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.appevents.internal:
//			InAppPurchaseEventManager

public class AutomaticAnalyticsLogger
{

	public AutomaticAnalyticsLogger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	public static boolean isImplicitPurchaseLoggingEnabled()
	{
		FetchedAppSettings fetchedappsettings = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
	//    0    0:invokestatic    #39  <Method String FacebookSdk.getApplicationId()>
	//    1    3:invokestatic    #45  <Method FetchedAppSettings FetchedAppSettingsManager.getAppSettingsWithoutQuery(String)>
	//    2    6:astore_2        
		boolean flag1 = false;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		if(fetchedappsettings == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		boolean flag = flag1;
	//    9   15:iload_1         
	//   10   16:istore_0        
		if(FacebookSdk.getAutoLogAppEventsEnabled())
	//*  11   17:invokestatic    #48  <Method boolean FacebookSdk.getAutoLogAppEventsEnabled()>
	//*  12   20:ifeq            34
		{
			flag = flag1;
	//   13   23:iload_1         
	//   14   24:istore_0        
			if(fetchedappsettings.getIAPAutomaticLoggingEnabled())
	//*  15   25:aload_2         
	//*  16   26:invokevirtual   #53  <Method boolean FetchedAppSettings.getIAPAutomaticLoggingEnabled()>
	//*  17   29:ifeq            34
				flag = true;
	//   18   32:iconst_1        
	//   19   33:istore_0        
		}
		return flag;
	//   20   34:iload_0         
	//   21   35:ireturn         
	}

	public static void logActivateAppEvent()
	{
		Context context = FacebookSdk.getApplicationContext();
	//    0    0:invokestatic    #58  <Method Context FacebookSdk.getApplicationContext()>
	//    1    3:astore_1        
		String s = FacebookSdk.getApplicationId();
	//    2    4:invokestatic    #39  <Method String FacebookSdk.getApplicationId()>
	//    3    7:astore_2        
		boolean flag = FacebookSdk.getAutoLogAppEventsEnabled();
	//    4    8:invokestatic    #48  <Method boolean FacebookSdk.getAutoLogAppEventsEnabled()>
	//    5   11:istore_0        
		Validate.notNull(((Object) (context)), "context");
	//    6   12:aload_1         
	//    7   13:ldc1            #60  <String "context">
	//    8   15:invokestatic    #66  <Method void Validate.notNull(Object, String)>
		if(flag)
	//*   9   18:iload_0         
	//*  10   19:ifeq            47
		{
			if(context instanceof Application)
	//*  11   22:aload_1         
	//*  12   23:instanceof      #68  <Class Application>
	//*  13   26:ifeq            38
			{
				AppEventsLogger.activateApp((Application)context, s);
	//   14   29:aload_1         
	//   15   30:checkcast       #68  <Class Application>
	//   16   33:aload_2         
	//   17   34:invokestatic    #74  <Method void AppEventsLogger.activateApp(Application, String)>
				return;
	//   18   37:return          
			}
			Log.w(TAG, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
	//   19   38:getstatic       #21  <Field String TAG>
	//   20   41:ldc1            #76  <String "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.">
	//   21   43:invokestatic    #82  <Method int Log.w(String, String)>
	//   22   46:pop             
		}
	//   23   47:return          
	}

	public static void logActivityTimeSpentEvent(String s, long l)
	{
		Object obj = ((Object) (FacebookSdk.getApplicationContext()));
	//    0    0:invokestatic    #58  <Method Context FacebookSdk.getApplicationContext()>
	//    1    3:astore_3        
		Object obj1 = ((Object) (FacebookSdk.getApplicationId()));
	//    2    4:invokestatic    #39  <Method String FacebookSdk.getApplicationId()>
	//    3    7:astore          4
		Validate.notNull(obj, "context");
	//    4    9:aload_3         
	//    5   10:ldc1            #60  <String "context">
	//    6   12:invokestatic    #66  <Method void Validate.notNull(Object, String)>
		obj1 = ((Object) (FetchedAppSettingsManager.queryAppSettings(((String) (obj1)), false)));
	//    7   15:aload           4
	//    8   17:iconst_0        
	//    9   18:invokestatic    #88  <Method FetchedAppSettings FetchedAppSettingsManager.queryAppSettings(String, boolean)>
	//   10   21:astore          4
		if(obj1 != null && ((FetchedAppSettings) (obj1)).getAutomaticLoggingEnabled() && l > 0L)
	//*  11   23:aload           4
	//*  12   25:ifnull          75
	//*  13   28:aload           4
	//*  14   30:invokevirtual   #91  <Method boolean FetchedAppSettings.getAutomaticLoggingEnabled()>
	//*  15   33:ifeq            75
	//*  16   36:lload_1         
	//*  17   37:lconst_0        
	//*  18   38:lcmp            
	//*  19   39:ifle            75
		{
			obj = ((Object) (AppEventsLogger.newLogger(((Context) (obj)))));
	//   20   42:aload_3         
	//   21   43:invokestatic    #95  <Method AppEventsLogger AppEventsLogger.newLogger(Context)>
	//   22   46:astore_3        
			Bundle bundle = new Bundle(1);
	//   23   47:new             #97  <Class Bundle>
	//   24   50:dup             
	//   25   51:iconst_1        
	//   26   52:invokespecial   #100 <Method void Bundle(int)>
	//   27   55:astore          4
			bundle.putCharSequence("fb_aa_time_spent_view_name", ((CharSequence) (s)));
	//   28   57:aload           4
	//   29   59:ldc1            #102 <String "fb_aa_time_spent_view_name">
	//   30   61:aload_0         
	//   31   62:invokevirtual   #106 <Method void Bundle.putCharSequence(String, CharSequence)>
			((AppEventsLogger) (obj)).logEvent("fb_aa_time_spent_on_view", l, bundle);
	//   32   65:aload_3         
	//   33   66:ldc1            #108 <String "fb_aa_time_spent_on_view">
	//   34   68:lload_1         
	//   35   69:l2d             
	//   36   70:aload           4
	//   37   72:invokevirtual   #112 <Method void AppEventsLogger.logEvent(String, double, Bundle)>
		}
	//   38   75:return          
	}

	public static boolean logInAppPurchaseEvent(Context context, int i, Intent intent)
	{
		if(intent != null && isImplicitPurchaseLoggingEnabled())
	//*   0    0:aload_2         
	//*   1    1:ifnull          62
	//*   2    4:invokestatic    #116 <Method boolean isImplicitPurchaseLoggingEnabled()>
	//*   3    7:ifne            13
	//*   4   10:goto            62
		{
			intent = ((Intent) (intent.getStringExtra("INAPP_PURCHASE_DATA")));
	//    5   13:aload_2         
	//    6   14:ldc1            #118 <String "INAPP_PURCHASE_DATA">
	//    7   16:invokevirtual   #124 <Method String Intent.getStringExtra(String)>
	//    8   19:astore_2        
			if(i == -1)
	//*   9   20:iload_1         
	//*  10   21:iconst_m1       
	//*  11   22:icmpne          60
			{
				intent = ((Intent) (new ServiceConnection(context, ((String) (intent))) {

					public void onServiceConnected(ComponentName componentname, IBinder ibinder)
					{
						AutomaticAnalyticsLogger.inAppBillingObj = InAppPurchaseEventManager.getServiceInterface(context, ibinder);
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field Context val$context>
					//    2    4:aload_2         
					//    3    5:invokestatic    #36  <Method Object InAppPurchaseEventManager.getServiceInterface(Context, IBinder)>
					//    4    8:invokestatic    #40  <Method Object AutomaticAnalyticsLogger.access$002(Object)>
					//    5   11:pop             
						boolean flag;
						Object obj;
						componentname = ((ComponentName) (JSONObjectInstrumentation.init(purchaseData)));
					//    6   12:aload_0         
					//    7   13:getfield        #22  <Field String val$purchaseData>
					//    8   16:invokestatic    #46  <Method JSONObject JSONObjectInstrumentation.init(String)>
					//    9   19:astore_1        
						ibinder = ((IBinder) (((JSONObject) (componentname)).getString("productId")));
					//   10   20:aload_1         
					//   11   21:ldc1            #48  <String "productId">
					//   12   23:invokevirtual   #54  <Method String JSONObject.getString(String)>
					//   13   26:astore_2        
						flag = ((JSONObject) (componentname)).has("autoRenewing");
					//   14   27:aload_1         
					//   15   28:ldc1            #56  <String "autoRenewing">
					//   16   30:invokevirtual   #60  <Method boolean JSONObject.has(String)>
					//   17   33:istore_3        
						obj = ((Object) (InAppPurchaseEventManager.getPurchaseDetails(context, ((String) (ibinder)), AutomaticAnalyticsLogger.inAppBillingObj, flag)));
					//   18   34:aload_0         
					//   19   35:getfield        #20  <Field Context val$context>
					//   20   38:aload_2         
					//   21   39:invokestatic    #64  <Method Object AutomaticAnalyticsLogger.access$000()>
					//   22   42:iload_3         
					//   23   43:invokestatic    #68  <Method String InAppPurchaseEventManager.getPurchaseDetails(Context, String, Object, boolean)>
					//   24   46:astore          4
						flag = ((String) (obj)).equals("");
					//   25   48:aload           4
					//   26   50:ldc1            #70  <String "">
					//   27   52:invokevirtual   #76  <Method boolean String.equals(Object)>
					//   28   55:istore_3        
						if(flag)
					//*  29   56:iload_3         
					//*  30   57:ifeq            69
						{
							context.unbindService(((ServiceConnection) (this)));
					//   31   60:aload_0         
					//   32   61:getfield        #20  <Field Context val$context>
					//   33   64:aload_0         
					//   34   65:invokevirtual   #82  <Method void Context.unbindService(ServiceConnection)>
							return;
					//   35   68:return          
						}
						try
						{
							obj = ((Object) (JSONObjectInstrumentation.init(((String) (obj)))));
					//   36   69:aload           4
					//   37   71:invokestatic    #46  <Method JSONObject JSONObjectInstrumentation.init(String)>
					//   38   74:astore          4
							AppEventsLogger appeventslogger = AppEventsLogger.newLogger(context);
					//   39   76:aload_0         
					//   40   77:getfield        #20  <Field Context val$context>
					//   41   80:invokestatic    #88  <Method AppEventsLogger AppEventsLogger.newLogger(Context)>
					//   42   83:astore          5
							Bundle bundle = new Bundle(1);
					//   43   85:new             #90  <Class Bundle>
					//   44   88:dup             
					//   45   89:iconst_1        
					//   46   90:invokespecial   #93  <Method void Bundle(int)>
					//   47   93:astore          6
							bundle.putCharSequence("fb_iap_product_id", ((CharSequence) (ibinder)));
					//   48   95:aload           6
					//   49   97:ldc1            #95  <String "fb_iap_product_id">
					//   50   99:aload_2         
					//   51  100:invokevirtual   #99  <Method void Bundle.putCharSequence(String, CharSequence)>
							bundle.putCharSequence("fb_iap_purchase_time", ((CharSequence) (((JSONObject) (componentname)).getString("purchaseTime"))));
					//   52  103:aload           6
					//   53  105:ldc1            #101 <String "fb_iap_purchase_time">
					//   54  107:aload_1         
					//   55  108:ldc1            #103 <String "purchaseTime">
					//   56  110:invokevirtual   #54  <Method String JSONObject.getString(String)>
					//   57  113:invokevirtual   #99  <Method void Bundle.putCharSequence(String, CharSequence)>
							bundle.putCharSequence("fb_iap_purchase_state", ((CharSequence) (((JSONObject) (componentname)).getString("purchaseState"))));
					//   58  116:aload           6
					//   59  118:ldc1            #105 <String "fb_iap_purchase_state">
					//   60  120:aload_1         
					//   61  121:ldc1            #107 <String "purchaseState">
					//   62  123:invokevirtual   #54  <Method String JSONObject.getString(String)>
					//   63  126:invokevirtual   #99  <Method void Bundle.putCharSequence(String, CharSequence)>
							bundle.putCharSequence("fb_iap_purchase_token", ((CharSequence) (((JSONObject) (componentname)).getString("purchaseToken"))));
					//   64  129:aload           6
					//   65  131:ldc1            #109 <String "fb_iap_purchase_token">
					//   66  133:aload_1         
					//   67  134:ldc1            #111 <String "purchaseToken">
					//   68  136:invokevirtual   #54  <Method String JSONObject.getString(String)>
					//   69  139:invokevirtual   #99  <Method void Bundle.putCharSequence(String, CharSequence)>
							bundle.putCharSequence("fb_iap_package_name", ((CharSequence) (((JSONObject) (componentname)).getString("packageName"))));
					//   70  142:aload           6
					//   71  144:ldc1            #113 <String "fb_iap_package_name">
					//   72  146:aload_1         
					//   73  147:ldc1            #115 <String "packageName">
					//   74  149:invokevirtual   #54  <Method String JSONObject.getString(String)>
					//   75  152:invokevirtual   #99  <Method void Bundle.putCharSequence(String, CharSequence)>
							bundle.putCharSequence("fb_iap_product_type", ((CharSequence) (((JSONObject) (obj)).getString("type"))));
					//   76  155:aload           6
					//   77  157:ldc1            #117 <String "fb_iap_product_type">
					//   78  159:aload           4
					//   79  161:ldc1            #119 <String "type">
					//   80  163:invokevirtual   #54  <Method String JSONObject.getString(String)>
					//   81  166:invokevirtual   #99  <Method void Bundle.putCharSequence(String, CharSequence)>
							bundle.putCharSequence("fb_iap_product_title", ((CharSequence) (((JSONObject) (obj)).getString("title"))));
					//   82  169:aload           6
					//   83  171:ldc1            #121 <String "fb_iap_product_title">
					//   84  173:aload           4
					//   85  175:ldc1            #123 <String "title">
					//   86  177:invokevirtual   #54  <Method String JSONObject.getString(String)>
					//   87  180:invokevirtual   #99  <Method void Bundle.putCharSequence(String, CharSequence)>
							bundle.putCharSequence("fb_iap_product_description", ((CharSequence) (((JSONObject) (obj)).getString("description"))));
					//   88  183:aload           6
					//   89  185:ldc1            #125 <String "fb_iap_product_description">
					//   90  187:aload           4
					//   91  189:ldc1            #127 <String "description">
					//   92  191:invokevirtual   #54  <Method String JSONObject.getString(String)>
					//   93  194:invokevirtual   #99  <Method void Bundle.putCharSequence(String, CharSequence)>
							bundle.putCharSequence("fb_iap_subs_auto_renewing", ((CharSequence) (Boolean.toString(((JSONObject) (componentname)).optBoolean("autoRenewing", false)))));
					//   94  197:aload           6
					//   95  199:ldc1            #129 <String "fb_iap_subs_auto_renewing">
					//   96  201:aload_1         
					//   97  202:ldc1            #56  <String "autoRenewing">
					//   98  204:iconst_0        
					//   99  205:invokevirtual   #133 <Method boolean JSONObject.optBoolean(String, boolean)>
					//  100  208:invokestatic    #139 <Method String Boolean.toString(boolean)>
					//  101  211:invokevirtual   #99  <Method void Bundle.putCharSequence(String, CharSequence)>
							bundle.putCharSequence("fb_iap_subs_period", ((CharSequence) (((JSONObject) (obj)).optString("subscriptionPeriod"))));
					//  102  214:aload           6
					//  103  216:ldc1            #141 <String "fb_iap_subs_period">
					//  104  218:aload           4
					//  105  220:ldc1            #143 <String "subscriptionPeriod">
					//  106  222:invokevirtual   #146 <Method String JSONObject.optString(String)>
					//  107  225:invokevirtual   #99  <Method void Bundle.putCharSequence(String, CharSequence)>
							bundle.putCharSequence("fb_free_trial_period", ((CharSequence) (((JSONObject) (obj)).optString("freeTrialPeriod"))));
					//  108  228:aload           6
					//  109  230:ldc1            #148 <String "fb_free_trial_period">
					//  110  232:aload           4
					//  111  234:ldc1            #150 <String "freeTrialPeriod">
					//  112  236:invokevirtual   #146 <Method String JSONObject.optString(String)>
					//  113  239:invokevirtual   #99  <Method void Bundle.putCharSequence(String, CharSequence)>
							bundle.putCharSequence("fb_intro_price_amount_micros", ((CharSequence) (((JSONObject) (obj)).optString("introductoryPriceAmountMicros"))));
					//  114  242:aload           6
					//  115  244:ldc1            #152 <String "fb_intro_price_amount_micros">
					//  116  246:aload           4
					//  117  248:ldc1            #154 <String "introductoryPriceAmountMicros">
					//  118  250:invokevirtual   #146 <Method String JSONObject.optString(String)>
					//  119  253:invokevirtual   #99  <Method void Bundle.putCharSequence(String, CharSequence)>
							bundle.putCharSequence("fb_intro_price_cycles", ((CharSequence) (((JSONObject) (obj)).optString("introductoryPriceCycles"))));
					//  120  256:aload           6
					//  121  258:ldc1            #156 <String "fb_intro_price_cycles">
					//  122  260:aload           4
					//  123  262:ldc1            #158 <String "introductoryPriceCycles">
					//  124  264:invokevirtual   #146 <Method String JSONObject.optString(String)>
					//  125  267:invokevirtual   #99  <Method void Bundle.putCharSequence(String, CharSequence)>
							appeventslogger.logPurchaseImplicitly(new BigDecimal((double)((JSONObject) (obj)).getLong("price_amount_micros") / 1000000D), Currency.getInstance(((JSONObject) (obj)).getString("price_currency_code")), bundle);
					//  126  270:aload           5
					//  127  272:new             #160 <Class BigDecimal>
					//  128  275:dup             
					//  129  276:aload           4
					//  130  278:ldc1            #162 <String "price_amount_micros">
					//  131  280:invokevirtual   #166 <Method long JSONObject.getLong(String)>
					//  132  283:l2d             
					//  133  284:ldc2w           #167 <Double 1000000D>
					//  134  287:ddiv            
					//  135  288:invokespecial   #171 <Method void BigDecimal(double)>
					//  136  291:aload           4
					//  137  293:ldc1            #173 <String "price_currency_code">
					//  138  295:invokevirtual   #54  <Method String JSONObject.getString(String)>
					//  139  298:invokestatic    #179 <Method Currency Currency.getInstance(String)>
					//  140  301:aload           6
					//  141  303:invokevirtual   #183 <Method void AppEventsLogger.logPurchaseImplicitly(BigDecimal, Currency, Bundle)>
							break MISSING_BLOCK_LABEL_324;
					//  142  306:goto            324
						}
					//* 143  309:astore_1        
					//* 144  310:goto            333
						// Misplaced declaration of an exception variable
						catch(ComponentName componentname) { }
					//  145  313:astore_1        
						break MISSING_BLOCK_LABEL_314;
						componentname;
						break MISSING_BLOCK_LABEL_333;
						Log.e(AutomaticAnalyticsLogger.TAG, "Error parsing in-app purchase data.", ((Throwable) (componentname)));
					//  146  314:invokestatic    #187 <Method String AutomaticAnalyticsLogger.access$100()>
					//  147  317:ldc1            #189 <String "Error parsing in-app purchase data.">
					//  148  319:aload_1         
					//  149  320:invokestatic    #195 <Method int Log.e(String, String, Throwable)>
					//  150  323:pop             
						context.unbindService(((ServiceConnection) (this)));
					//  151  324:aload_0         
					//  152  325:getfield        #20  <Field Context val$context>
					//  153  328:aload_0         
					//  154  329:invokevirtual   #82  <Method void Context.unbindService(ServiceConnection)>
						return;
					//  155  332:return          
						context.unbindService(((ServiceConnection) (this)));
					//  156  333:aload_0         
					//  157  334:getfield        #20  <Field Context val$context>
					//  158  337:aload_0         
					//  159  338:invokevirtual   #82  <Method void Context.unbindService(ServiceConnection)>
						throw componentname;
					//  160  341:aload_1         
					//  161  342:athrow          
					}

					public void onServiceDisconnected(ComponentName componentname)
					{
						AutomaticAnalyticsLogger.inAppBillingObj = ((Object) (null));
					//    0    0:aconst_null     
					//    1    1:invokestatic    #40  <Method Object AutomaticAnalyticsLogger.access$002(Object)>
					//    2    4:pop             
						Utility.logd(AutomaticAnalyticsLogger.TAG, "In-app billing service disconnected");
					//    3    5:invokestatic    #187 <Method String AutomaticAnalyticsLogger.access$100()>
					//    4    8:ldc1            #199 <String "In-app billing service disconnected">
					//    5   10:invokestatic    #205 <Method void Utility.logd(String, String)>
					//    6   13:return          
					}

					final Context val$context;
					final String val$purchaseData;

			
			{
				context = context1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Context val$context>
				purchaseData = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field String val$purchaseData>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
				}
));
	//   12   25:new             #6   <Class AutomaticAnalyticsLogger$1>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:aload_2         
	//   16   31:invokespecial   #127 <Method void AutomaticAnalyticsLogger$1(Context, String)>
	//   17   34:astore_2        
				Intent intent1 = new Intent("com.android.vending.billing.InAppBillingService.BIND");
	//   18   35:new             #120 <Class Intent>
	//   19   38:dup             
	//   20   39:ldc1            #129 <String "com.android.vending.billing.InAppBillingService.BIND">
	//   21   41:invokespecial   #132 <Method void Intent(String)>
	//   22   44:astore_3        
				intent1.setPackage("com.android.vending");
	//   23   45:aload_3         
	//   24   46:ldc1            #134 <String "com.android.vending">
	//   25   48:invokevirtual   #138 <Method Intent Intent.setPackage(String)>
	//   26   51:pop             
				context.bindService(intent1, ((ServiceConnection) (intent)), 1);
	//   27   52:aload_0         
	//   28   53:aload_3         
	//   29   54:aload_2         
	//   30   55:iconst_1        
	//   31   56:invokevirtual   #144 <Method boolean Context.bindService(Intent, ServiceConnection, int)>
	//   32   59:pop             
			}
			return true;
	//   33   60:iconst_1        
	//   34   61:ireturn         
		} else
		{
			return false;
	//   35   62:iconst_0        
	//   36   63:ireturn         
		}
	}

	private static final String TAG = ((Class) (com/facebook/appevents/internal/AutomaticAnalyticsLogger)).getCanonicalName();
	private static Object inAppBillingObj;

	static 
	{
	//    0    0:ldc1            #2   <Class AutomaticAnalyticsLogger>
	//    1    2:invokevirtual   #19  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #21  <Field String TAG>
	//*   3    8:return          
	}


/*
	static Object access$000()
	{
		return inAppBillingObj;
	//    0    0:getstatic       #29  <Field Object inAppBillingObj>
	//    1    3:areturn         
	}

*/


/*
	static Object access$002(Object obj)
	{
		inAppBillingObj = obj;
	//    0    0:aload_0         
	//    1    1:putstatic       #29  <Field Object inAppBillingObj>
		return obj;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/


/*
	static String access$100()
	{
		return TAG;
	//    0    0:getstatic       #21  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
