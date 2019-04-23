// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.*;
import java.math.BigDecimal;
import java.util.Currency;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.appevents.internal:
//			InternalAppEventsLogger, SubscriptionType

public class AutomaticAnalyticsLogger
{
	private static class PurchaseLoggingParameters
	{

		Currency currency;
		Bundle param;
		BigDecimal purchaseAmount;

		PurchaseLoggingParameters(BigDecimal bigdecimal, Currency currency1, Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			purchaseAmount = bigdecimal;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field BigDecimal purchaseAmount>
			currency = currency1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field Currency currency>
			param = bundle;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #24  <Field Bundle param>
		//   11   19:return          
		}
	}


	public AutomaticAnalyticsLogger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
	//    2    4:return          
	}

	private static PurchaseLoggingParameters getPurchaseLoggingParameters(String s, String s1)
	{
		try
		{
			s = ((String) (new JSONObject(s)));
	//    0    0:new             #47  <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #50  <Method void JSONObject(String)>
	//    4    8:astore_0        
			s1 = ((String) (new JSONObject(s1)));
	//    5    9:new             #47  <Class JSONObject>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #50  <Method void JSONObject(String)>
	//    9   17:astore_1        
			Bundle bundle = new Bundle(1);
	//   10   18:new             #52  <Class Bundle>
	//   11   21:dup             
	//   12   22:iconst_1        
	//   13   23:invokespecial   #55  <Method void Bundle(int)>
	//   14   26:astore_2        
			bundle.putCharSequence("fb_iap_product_id", ((CharSequence) (((JSONObject) (s)).getString("productId"))));
	//   15   27:aload_2         
	//   16   28:ldc1            #57  <String "fb_iap_product_id">
	//   17   30:aload_0         
	//   18   31:ldc1            #59  <String "productId">
	//   19   33:invokevirtual   #63  <Method String JSONObject.getString(String)>
	//   20   36:invokevirtual   #67  <Method void Bundle.putCharSequence(String, CharSequence)>
			bundle.putCharSequence("fb_iap_purchase_time", ((CharSequence) (((JSONObject) (s)).getString("purchaseTime"))));
	//   21   39:aload_2         
	//   22   40:ldc1            #69  <String "fb_iap_purchase_time">
	//   23   42:aload_0         
	//   24   43:ldc1            #71  <String "purchaseTime">
	//   25   45:invokevirtual   #63  <Method String JSONObject.getString(String)>
	//   26   48:invokevirtual   #67  <Method void Bundle.putCharSequence(String, CharSequence)>
			bundle.putCharSequence("fb_iap_purchase_token", ((CharSequence) (((JSONObject) (s)).getString("purchaseToken"))));
	//   27   51:aload_2         
	//   28   52:ldc1            #73  <String "fb_iap_purchase_token">
	//   29   54:aload_0         
	//   30   55:ldc1            #75  <String "purchaseToken">
	//   31   57:invokevirtual   #63  <Method String JSONObject.getString(String)>
	//   32   60:invokevirtual   #67  <Method void Bundle.putCharSequence(String, CharSequence)>
			bundle.putCharSequence("fb_iap_package_name", ((CharSequence) (((JSONObject) (s)).optString("packageName"))));
	//   33   63:aload_2         
	//   34   64:ldc1            #77  <String "fb_iap_package_name">
	//   35   66:aload_0         
	//   36   67:ldc1            #79  <String "packageName">
	//   37   69:invokevirtual   #82  <Method String JSONObject.optString(String)>
	//   38   72:invokevirtual   #67  <Method void Bundle.putCharSequence(String, CharSequence)>
			bundle.putCharSequence("fb_iap_product_title", ((CharSequence) (((JSONObject) (s1)).optString("title"))));
	//   39   75:aload_2         
	//   40   76:ldc1            #84  <String "fb_iap_product_title">
	//   41   78:aload_1         
	//   42   79:ldc1            #86  <String "title">
	//   43   81:invokevirtual   #82  <Method String JSONObject.optString(String)>
	//   44   84:invokevirtual   #67  <Method void Bundle.putCharSequence(String, CharSequence)>
			bundle.putCharSequence("fb_iap_product_description", ((CharSequence) (((JSONObject) (s1)).optString("description"))));
	//   45   87:aload_2         
	//   46   88:ldc1            #88  <String "fb_iap_product_description">
	//   47   90:aload_1         
	//   48   91:ldc1            #90  <String "description">
	//   49   93:invokevirtual   #82  <Method String JSONObject.optString(String)>
	//   50   96:invokevirtual   #67  <Method void Bundle.putCharSequence(String, CharSequence)>
			String s2 = ((JSONObject) (s1)).optString("type");
	//   51   99:aload_1         
	//   52  100:ldc1            #92  <String "type">
	//   53  102:invokevirtual   #82  <Method String JSONObject.optString(String)>
	//   54  105:astore_3        
			bundle.putCharSequence("fb_iap_product_type", ((CharSequence) (s2)));
	//   55  106:aload_2         
	//   56  107:ldc1            #94  <String "fb_iap_product_type">
	//   57  109:aload_3         
	//   58  110:invokevirtual   #67  <Method void Bundle.putCharSequence(String, CharSequence)>
			if(s2.equals("subs"))
	//*  59  113:aload_3         
	//*  60  114:ldc1            #96  <String "subs">
	//*  61  116:invokevirtual   #102 <Method boolean String.equals(Object)>
	//*  62  119:ifeq            195
			{
				bundle.putCharSequence("fb_iap_subs_auto_renewing", ((CharSequence) (Boolean.toString(((JSONObject) (s)).optBoolean("autoRenewing", false)))));
	//   63  122:aload_2         
	//   64  123:ldc1            #104 <String "fb_iap_subs_auto_renewing">
	//   65  125:aload_0         
	//   66  126:ldc1            #106 <String "autoRenewing">
	//   67  128:iconst_0        
	//   68  129:invokevirtual   #110 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   69  132:invokestatic    #116 <Method String Boolean.toString(boolean)>
	//   70  135:invokevirtual   #67  <Method void Bundle.putCharSequence(String, CharSequence)>
				bundle.putCharSequence("fb_iap_subs_period", ((CharSequence) (((JSONObject) (s1)).optString("subscriptionPeriod"))));
	//   71  138:aload_2         
	//   72  139:ldc1            #118 <String "fb_iap_subs_period">
	//   73  141:aload_1         
	//   74  142:ldc1            #120 <String "subscriptionPeriod">
	//   75  144:invokevirtual   #82  <Method String JSONObject.optString(String)>
	//   76  147:invokevirtual   #67  <Method void Bundle.putCharSequence(String, CharSequence)>
				bundle.putCharSequence("fb_free_trial_period", ((CharSequence) (((JSONObject) (s1)).optString("freeTrialPeriod"))));
	//   77  150:aload_2         
	//   78  151:ldc1            #122 <String "fb_free_trial_period">
	//   79  153:aload_1         
	//   80  154:ldc1            #124 <String "freeTrialPeriod">
	//   81  156:invokevirtual   #82  <Method String JSONObject.optString(String)>
	//   82  159:invokevirtual   #67  <Method void Bundle.putCharSequence(String, CharSequence)>
				s = ((JSONObject) (s1)).optString("introductoryPriceCycles");
	//   83  162:aload_1         
	//   84  163:ldc1            #126 <String "introductoryPriceCycles">
	//   85  165:invokevirtual   #82  <Method String JSONObject.optString(String)>
	//   86  168:astore_0        
				if(!s.isEmpty())
	//*  87  169:aload_0         
	//*  88  170:invokevirtual   #130 <Method boolean String.isEmpty()>
	//*  89  173:ifne            195
				{
					bundle.putCharSequence("fb_intro_price_amount_micros", ((CharSequence) (((JSONObject) (s1)).optString("introductoryPriceAmountMicros"))));
	//   90  176:aload_2         
	//   91  177:ldc1            #132 <String "fb_intro_price_amount_micros">
	//   92  179:aload_1         
	//   93  180:ldc1            #134 <String "introductoryPriceAmountMicros">
	//   94  182:invokevirtual   #82  <Method String JSONObject.optString(String)>
	//   95  185:invokevirtual   #67  <Method void Bundle.putCharSequence(String, CharSequence)>
					bundle.putCharSequence("fb_intro_price_cycles", ((CharSequence) (s)));
	//   96  188:aload_2         
	//   97  189:ldc1            #136 <String "fb_intro_price_cycles">
	//   98  191:aload_0         
	//   99  192:invokevirtual   #67  <Method void Bundle.putCharSequence(String, CharSequence)>
				}
			}
			s = ((String) (new PurchaseLoggingParameters(new BigDecimal((double)((JSONObject) (s1)).getLong("price_amount_micros") / 1000000D), Currency.getInstance(((JSONObject) (s1)).getString("price_currency_code")), bundle)));
	//  100  195:new             #8   <Class AutomaticAnalyticsLogger$PurchaseLoggingParameters>
	//  101  198:dup             
	//  102  199:new             #138 <Class BigDecimal>
	//  103  202:dup             
	//  104  203:aload_1         
	//  105  204:ldc1            #140 <String "price_amount_micros">
	//  106  206:invokevirtual   #144 <Method long JSONObject.getLong(String)>
	//  107  209:l2d             
	//  108  210:ldc2w           #145 <Double 1000000D>
	//  109  213:ddiv            
	//  110  214:invokespecial   #149 <Method void BigDecimal(double)>
	//  111  217:aload_1         
	//  112  218:ldc1            #151 <String "price_currency_code">
	//  113  220:invokevirtual   #63  <Method String JSONObject.getString(String)>
	//  114  223:invokestatic    #157 <Method Currency Currency.getInstance(String)>
	//  115  226:aload_2         
	//  116  227:invokespecial   #160 <Method void AutomaticAnalyticsLogger$PurchaseLoggingParameters(BigDecimal, Currency, Bundle)>
	//  117  230:astore_0        
		}
	//* 118  231:aload_0         
	//* 119  232:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 120  233:astore_0        
		{
			Log.e(TAG, "Error parsing in-app subscription data.", ((Throwable) (s)));
	//  121  234:getstatic       #23  <Field String TAG>
	//  122  237:ldc1            #162 <String "Error parsing in-app subscription data.">
	//  123  239:aload_0         
	//  124  240:invokestatic    #168 <Method int Log.e(String, String, Throwable)>
	//  125  243:pop             
			return null;
	//  126  244:aconst_null     
	//  127  245:areturn         
		}
		return ((PurchaseLoggingParameters) (s));
	}

	public static boolean isImplicitPurchaseLoggingEnabled()
	{
		FetchedAppSettings fetchedappsettings = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
	//    0    0:invokestatic    #173 <Method String FacebookSdk.getApplicationId()>
	//    1    3:invokestatic    #179 <Method FetchedAppSettings FetchedAppSettingsManager.getAppSettingsWithoutQuery(String)>
	//    2    6:astore_0        
		return fetchedappsettings != null && FacebookSdk.getAutoLogAppEventsEnabled() && fetchedappsettings.getIAPAutomaticLoggingEnabled();
	//    3    7:aload_0         
	//    4    8:ifnull          26
	//    5   11:invokestatic    #182 <Method boolean FacebookSdk.getAutoLogAppEventsEnabled()>
	//    6   14:ifeq            26
	//    7   17:aload_0         
	//    8   18:invokevirtual   #187 <Method boolean FetchedAppSettings.getIAPAutomaticLoggingEnabled()>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public static void logActivateAppEvent()
	{
		android.content.Context context = FacebookSdk.getApplicationContext();
	//    0    0:invokestatic    #31  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    1    3:astore_1        
		String s = FacebookSdk.getApplicationId();
	//    2    4:invokestatic    #173 <Method String FacebookSdk.getApplicationId()>
	//    3    7:astore_2        
		boolean flag = FacebookSdk.getAutoLogAppEventsEnabled();
	//    4    8:invokestatic    #182 <Method boolean FacebookSdk.getAutoLogAppEventsEnabled()>
	//    5   11:istore_0        
		Validate.notNull(((Object) (context)), "context");
	//    6   12:aload_1         
	//    7   13:ldc1            #190 <String "context">
	//    8   15:invokestatic    #196 <Method void Validate.notNull(Object, String)>
		if(flag)
	//*   9   18:iload_0         
	//*  10   19:ifeq            47
		{
			if(context instanceof Application)
	//*  11   22:aload_1         
	//*  12   23:instanceof      #198 <Class Application>
	//*  13   26:ifeq            38
			{
				AppEventsLogger.activateApp((Application)context, s);
	//   14   29:aload_1         
	//   15   30:checkcast       #198 <Class Application>
	//   16   33:aload_2         
	//   17   34:invokestatic    #204 <Method void AppEventsLogger.activateApp(Application, String)>
				return;
	//   18   37:return          
			}
			Log.w(TAG, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
	//   19   38:getstatic       #23  <Field String TAG>
	//   20   41:ldc1            #206 <String "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.">
	//   21   43:invokestatic    #210 <Method int Log.w(String, String)>
	//   22   46:pop             
		}
	//   23   47:return          
	}

	public static void logActivityTimeSpentEvent(String s, long l)
	{
		Object obj = ((Object) (FacebookSdk.getApplicationContext()));
	//    0    0:invokestatic    #31  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    1    3:astore_3        
		Object obj1 = ((Object) (FacebookSdk.getApplicationId()));
	//    2    4:invokestatic    #173 <Method String FacebookSdk.getApplicationId()>
	//    3    7:astore          4
		Validate.notNull(obj, "context");
	//    4    9:aload_3         
	//    5   10:ldc1            #190 <String "context">
	//    6   12:invokestatic    #196 <Method void Validate.notNull(Object, String)>
		obj1 = ((Object) (FetchedAppSettingsManager.queryAppSettings(((String) (obj1)), false)));
	//    7   15:aload           4
	//    8   17:iconst_0        
	//    9   18:invokestatic    #216 <Method FetchedAppSettings FetchedAppSettingsManager.queryAppSettings(String, boolean)>
	//   10   21:astore          4
		if(obj1 != null && ((FetchedAppSettings) (obj1)).getAutomaticLoggingEnabled() && l > 0L)
	//*  11   23:aload           4
	//*  12   25:ifnull          75
	//*  13   28:aload           4
	//*  14   30:invokevirtual   #219 <Method boolean FetchedAppSettings.getAutomaticLoggingEnabled()>
	//*  15   33:ifeq            75
	//*  16   36:lload_1         
	//*  17   37:lconst_0        
	//*  18   38:lcmp            
	//*  19   39:ifle            75
		{
			obj = ((Object) (AppEventsLogger.newLogger(((android.content.Context) (obj)))));
	//   20   42:aload_3         
	//   21   43:invokestatic    #223 <Method AppEventsLogger AppEventsLogger.newLogger(android.content.Context)>
	//   22   46:astore_3        
			Bundle bundle = new Bundle(1);
	//   23   47:new             #52  <Class Bundle>
	//   24   50:dup             
	//   25   51:iconst_1        
	//   26   52:invokespecial   #55  <Method void Bundle(int)>
	//   27   55:astore          4
			bundle.putCharSequence("fb_aa_time_spent_view_name", ((CharSequence) (s)));
	//   28   57:aload           4
	//   29   59:ldc1            #225 <String "fb_aa_time_spent_view_name">
	//   30   61:aload_0         
	//   31   62:invokevirtual   #67  <Method void Bundle.putCharSequence(String, CharSequence)>
			((AppEventsLogger) (obj)).logEvent("fb_aa_time_spent_on_view", l, bundle);
	//   32   65:aload_3         
	//   33   66:ldc1            #227 <String "fb_aa_time_spent_on_view">
	//   34   68:lload_1         
	//   35   69:l2d             
	//   36   70:aload           4
	//   37   72:invokevirtual   #231 <Method void AppEventsLogger.logEvent(String, double, Bundle)>
		}
	//   38   75:return          
	}

	public static void logPurchaseInapp(String s, String s1)
	{
		if(!isImplicitPurchaseLoggingEnabled())
	//*   0    0:invokestatic    #235 <Method boolean isImplicitPurchaseLoggingEnabled()>
	//*   1    3:ifne            7
			return;
	//    2    6:return          
		s = ((String) (getPurchaseLoggingParameters(s, s1)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokestatic    #237 <Method AutomaticAnalyticsLogger$PurchaseLoggingParameters getPurchaseLoggingParameters(String, String)>
	//    6   12:astore_0        
		if(s != null)
	//*   7   13:aload_0         
	//*   8   14:ifnull          35
			internalAppEventsLogger.logPurchaseImplicitlyInternal(((PurchaseLoggingParameters) (s)).purchaseAmount, ((PurchaseLoggingParameters) (s)).currency, ((PurchaseLoggingParameters) (s)).param);
	//    9   17:getstatic       #37  <Field InternalAppEventsLogger internalAppEventsLogger>
	//   10   20:aload_0         
	//   11   21:getfield        #241 <Field BigDecimal AutomaticAnalyticsLogger$PurchaseLoggingParameters.purchaseAmount>
	//   12   24:aload_0         
	//   13   25:getfield        #245 <Field Currency AutomaticAnalyticsLogger$PurchaseLoggingParameters.currency>
	//   14   28:aload_0         
	//   15   29:getfield        #249 <Field Bundle AutomaticAnalyticsLogger$PurchaseLoggingParameters.param>
	//   16   32:invokevirtual   #252 <Method void InternalAppEventsLogger.logPurchaseImplicitlyInternal(BigDecimal, Currency, Bundle)>
	//   17   35:return          
	}

	public static void logPurchaseSubs(SubscriptionType subscriptiontype, String s, String s1)
	{
		if(!isImplicitPurchaseLoggingEnabled())
	//*   0    0:invokestatic    #235 <Method boolean isImplicitPurchaseLoggingEnabled()>
	//*   1    3:ifne            7
			return;
	//    2    6:return          
		FacebookSdk.getApplicationId();
	//    3    7:invokestatic    #173 <Method String FacebookSdk.getApplicationId()>
	//    4   10:pop             
		static class _cls1
		{

			static final int $SwitchMap$com$facebook$appevents$internal$SubscriptionType[];

			static 
			{
				$SwitchMap$com$facebook$appevents$internal$SubscriptionType = new int[SubscriptionType.values().length];
			//    0    0:invokestatic    #18  <Method SubscriptionType[] SubscriptionType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$facebook$appevents$internal$SubscriptionType>
				try
				{
					$SwitchMap$com$facebook$appevents$internal$SubscriptionType[SubscriptionType.RESTORE.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$facebook$appevents$internal$SubscriptionType>
			//    5   12:getstatic       #24  <Field SubscriptionType SubscriptionType.RESTORE>
			//    6   15:invokevirtual   #28  <Method int SubscriptionType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$facebook$appevents$internal$SubscriptionType>
			//*  10   23:getstatic       #31  <Field SubscriptionType SubscriptionType.CANCEL>
			//*  11   26:invokevirtual   #28  <Method int SubscriptionType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$facebook$appevents$internal$SubscriptionType>
			//*  15   34:getstatic       #34  <Field SubscriptionType SubscriptionType.HEARTBEAT>
			//*  16   37:invokevirtual   #28  <Method int SubscriptionType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$facebook$appevents$internal$SubscriptionType>
			//*  20   45:getstatic       #37  <Field SubscriptionType SubscriptionType.EXPIRE>
			//*  21   48:invokevirtual   #28  <Method int SubscriptionType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$facebook$appevents$internal$SubscriptionType>
			//*  25   56:getstatic       #40  <Field SubscriptionType SubscriptionType.NEW>
			//*  26   59:invokevirtual   #28  <Method int SubscriptionType.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   30   65:astore_0        
				try
				{
					$SwitchMap$com$facebook$appevents$internal$SubscriptionType[SubscriptionType.CANCEL.ordinal()] = 2;
				}
			//*  31   66:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   32   69:astore_0        
				try
				{
					$SwitchMap$com$facebook$appevents$internal$SubscriptionType[SubscriptionType.HEARTBEAT.ordinal()] = 3;
				}
			//*  33   70:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   34   73:astore_0        
				try
				{
					$SwitchMap$com$facebook$appevents$internal$SubscriptionType[SubscriptionType.EXPIRE.ordinal()] = 4;
				}
			//*  35   74:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   36   77:astore_0        
				try
				{
					$SwitchMap$com$facebook$appevents$internal$SubscriptionType[SubscriptionType.NEW.ordinal()] = 5;
				}
			//*  37   78:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   81:astore_0        
			//*  39   82:return          
			}
		}

		switch(_cls1..SwitchMap.com.facebook.appevents.internal.SubscriptionType[subscriptiontype.ordinal()])
	//*   5   11:getstatic       #258 <Field int[] AutomaticAnalyticsLogger$1.$SwitchMap$com$facebook$appevents$internal$SubscriptionType>
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #264 <Method int SubscriptionType.ordinal()>
	//*   8   18:iaload          
		{
	//*   9   19:tableswitch     1 5: default 52
	//	               1 80
	//	               2 73
	//	               3 66
	//	               4 59
	//	               5 53
		default:
			return;
	//   10   52:return          

		case 5: // '\005'
			logPurchaseInapp(s, s1);
	//   11   53:aload_1         
	//   12   54:aload_2         
	//   13   55:invokestatic    #266 <Method void logPurchaseInapp(String, String)>
			return;
	//   14   58:return          

		case 4: // '\004'
			subscriptiontype = "SubscriptionExpire";
	//   15   59:ldc2            #268 <String "SubscriptionExpire">
	//   16   62:astore_0        
			break;

	//*  17   63:goto            84
		case 3: // '\003'
			subscriptiontype = "SubscriptionHeartbeat";
	//   18   66:ldc2            #270 <String "SubscriptionHeartbeat">
	//   19   69:astore_0        
			break;

	//*  20   70:goto            84
		case 2: // '\002'
			subscriptiontype = "SubscriptionCancel";
	//   21   73:ldc2            #272 <String "SubscriptionCancel">
	//   22   76:astore_0        
			break;

	//*  23   77:goto            84
		case 1: // '\001'
			subscriptiontype = "SubscriptionRestore";
	//   24   80:ldc2            #274 <String "SubscriptionRestore">
	//   25   83:astore_0        
			break;
		}
		s = ((String) (getPurchaseLoggingParameters(s, s1)));
	//   26   84:aload_1         
	//   27   85:aload_2         
	//   28   86:invokestatic    #237 <Method AutomaticAnalyticsLogger$PurchaseLoggingParameters getPurchaseLoggingParameters(String, String)>
	//   29   89:astore_1        
		if(s != null)
	//*  30   90:aload_1         
	//*  31   91:ifnull          113
			internalAppEventsLogger.logEventImplicitly(((String) (subscriptiontype)), ((PurchaseLoggingParameters) (s)).purchaseAmount, ((PurchaseLoggingParameters) (s)).currency, ((PurchaseLoggingParameters) (s)).param);
	//   32   94:getstatic       #37  <Field InternalAppEventsLogger internalAppEventsLogger>
	//   33   97:aload_0         
	//   34   98:aload_1         
	//   35   99:getfield        #241 <Field BigDecimal AutomaticAnalyticsLogger$PurchaseLoggingParameters.purchaseAmount>
	//   36  102:aload_1         
	//   37  103:getfield        #245 <Field Currency AutomaticAnalyticsLogger$PurchaseLoggingParameters.currency>
	//   38  106:aload_1         
	//   39  107:getfield        #249 <Field Bundle AutomaticAnalyticsLogger$PurchaseLoggingParameters.param>
	//   40  110:invokevirtual   #278 <Method void InternalAppEventsLogger.logEventImplicitly(String, BigDecimal, Currency, Bundle)>
	//   41  113:return          
	}

	private static final String TAG = ((Class) (com/facebook/appevents/internal/AutomaticAnalyticsLogger)).getCanonicalName();
	private static final InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(FacebookSdk.getApplicationContext());

	static 
	{
	//    0    0:ldc1            #2   <Class AutomaticAnalyticsLogger>
	//    1    2:invokevirtual   #21  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #23  <Field String TAG>
	//    3    8:new             #25  <Class InternalAppEventsLogger>
	//    4   11:dup             
	//    5   12:invokestatic    #31  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    6   15:invokespecial   #35  <Method void InternalAppEventsLogger(android.content.Context)>
	//    7   18:putstatic       #37  <Field InternalAppEventsLogger internalAppEventsLogger>
	//*   8   21:return          
	}
}
