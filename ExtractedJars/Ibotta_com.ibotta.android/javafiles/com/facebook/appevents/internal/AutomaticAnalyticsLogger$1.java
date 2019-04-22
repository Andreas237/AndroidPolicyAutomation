// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.content.*;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.Utility;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.math.BigDecimal;
import java.util.Currency;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.appevents.internal:
//			AutomaticAnalyticsLogger, InAppPurchaseEventManager

static final class AutomaticAnalyticsLogger$1
	implements ServiceConnection
{

	public void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		AutomaticAnalyticsLogger.access$002(InAppPurchaseEventManager.getServiceInterface(val$context, ibinder));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Context val$context>
	//    2    4:aload_2         
	//    3    5:invokestatic    #36  <Method Object InAppPurchaseEventManager.getServiceInterface(Context, IBinder)>
	//    4    8:invokestatic    #40  <Method Object AutomaticAnalyticsLogger.access$002(Object)>
	//    5   11:pop             
		boolean flag;
		Object obj;
		componentname = ((ComponentName) (JSONObjectInstrumentation.init(val$purchaseData)));
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
		obj = ((Object) (InAppPurchaseEventManager.getPurchaseDetails(val$context, ((String) (ibinder)), AutomaticAnalyticsLogger.access$000(), flag)));
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
			val$context.unbindService(((ServiceConnection) (this)));
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
			AppEventsLogger appeventslogger = AppEventsLogger.newLogger(val$context);
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
		Log.e(AutomaticAnalyticsLogger.access$100(), "Error parsing in-app purchase data.", ((Throwable) (componentname)));
	//  146  314:invokestatic    #187 <Method String AutomaticAnalyticsLogger.access$100()>
	//  147  317:ldc1            #189 <String "Error parsing in-app purchase data.">
	//  148  319:aload_1         
	//  149  320:invokestatic    #195 <Method int Log.e(String, String, Throwable)>
	//  150  323:pop             
		val$context.unbindService(((ServiceConnection) (this)));
	//  151  324:aload_0         
	//  152  325:getfield        #20  <Field Context val$context>
	//  153  328:aload_0         
	//  154  329:invokevirtual   #82  <Method void Context.unbindService(ServiceConnection)>
		return;
	//  155  332:return          
		val$context.unbindService(((ServiceConnection) (this)));
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
		Object _tmp = AutomaticAnalyticsLogger.access$002(((Object) (null)));
	//    0    0:aconst_null     
	//    1    1:invokestatic    #40  <Method Object AutomaticAnalyticsLogger.access$002(Object)>
	//    2    4:pop             
		Utility.logd(AutomaticAnalyticsLogger.access$100(), "In-app billing service disconnected");
	//    3    5:invokestatic    #187 <Method String AutomaticAnalyticsLogger.access$100()>
	//    4    8:ldc1            #199 <String "In-app billing service disconnected">
	//    5   10:invokestatic    #205 <Method void Utility.logd(String, String)>
	//    6   13:return          
	}

	final Context val$context;
	final String val$purchaseData;

	AutomaticAnalyticsLogger$1(Context context1, String s)
	{
		val$context = context1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Context val$context>
		val$purchaseData = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field String val$purchaseData>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
