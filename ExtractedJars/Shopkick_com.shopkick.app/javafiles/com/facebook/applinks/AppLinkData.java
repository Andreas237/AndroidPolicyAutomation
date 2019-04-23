// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.applinks;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.*;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.*;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.*;

public class AppLinkData
{
	public static interface CompletionHandler
	{

		public abstract void onDeferredAppLinkDataFetched(AppLinkData applinkdata);
	}


	private AppLinkData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void Object()>
	//    2    4:return          
	}

	public static AppLinkData createFromActivity(Activity activity)
	{
		Validate.notNull(((Object) (activity)), "activity");
	//    0    0:aload_0         
	//    1    1:ldc1            #107 <String "activity">
	//    2    3:invokestatic    #113 <Method void Validate.notNull(Object, String)>
		Intent intent = activity.getIntent();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #119 <Method Intent Activity.getIntent()>
	//    5   10:astore_2        
		if(intent == null)
	//*   6   11:aload_2         
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		Object obj = ((Object) (createFromAlApplinkData(intent)));
	//   10   17:aload_2         
	//   11   18:invokestatic    #123 <Method AppLinkData createFromAlApplinkData(Intent)>
	//   12   21:astore_1        
		activity = ((Activity) (obj));
	//   13   22:aload_1         
	//   14   23:astore_0        
		if(obj == null)
	//*  15   24:aload_1         
	//*  16   25:ifnonnull       38
			activity = ((Activity) (createFromJson(intent.getStringExtra("com.facebook.platform.APPLINK_ARGS"))));
	//   17   28:aload_2         
	//   18   29:ldc1            #43  <String "com.facebook.platform.APPLINK_ARGS">
	//   19   31:invokevirtual   #129 <Method String Intent.getStringExtra(String)>
	//   20   34:invokestatic    #133 <Method AppLinkData createFromJson(String)>
	//   21   37:astore_0        
		obj = ((Object) (activity));
	//   22   38:aload_0         
	//   23   39:astore_1        
		if(activity == null)
	//*  24   40:aload_0         
	//*  25   41:ifnonnull       52
			obj = ((Object) (createFromUri(intent.getData())));
	//   26   44:aload_2         
	//   27   45:invokevirtual   #137 <Method Uri Intent.getData()>
	//   28   48:invokestatic    #141 <Method AppLinkData createFromUri(Uri)>
	//   29   51:astore_1        
		return ((AppLinkData) (obj));
	//   30   52:aload_1         
	//   31   53:areturn         
	}

	public static AppLinkData createFromAlApplinkData(Intent intent)
	{
		AppLinkData applinkdata;
		if(intent == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Bundle bundle = intent.getBundleExtra("al_applink_data");
	//    4    6:aload_0         
	//    5    7:ldc1            #40  <String "al_applink_data">
	//    6    9:invokevirtual   #147 <Method Bundle Intent.getBundleExtra(String)>
	//    7   12:astore_2        
		if(bundle == null)
	//*   8   13:aload_2         
	//*   9   14:ifnonnull       19
			return null;
	//   10   17:aconst_null     
	//   11   18:areturn         
		applinkdata = new AppLinkData();
	//   12   19:new             #2   <Class AppLinkData>
	//   13   22:dup             
	//   14   23:invokespecial   #148 <Method void AppLinkData()>
	//   15   26:astore_1        
		applinkdata.targetUri = intent.getData();
	//   16   27:aload_1         
	//   17   28:aload_0         
	//   18   29:invokevirtual   #137 <Method Uri Intent.getData()>
	//   19   32:putfield        #150 <Field Uri targetUri>
		if(applinkdata.targetUri == null)
	//*  20   35:aload_1         
	//*  21   36:getfield        #150 <Field Uri targetUri>
	//*  22   39:ifnonnull       61
		{
			intent = ((Intent) (bundle.getString("target_url")));
	//   23   42:aload_2         
	//   24   43:ldc1            #70  <String "target_url">
	//   25   45:invokevirtual   #155 <Method String Bundle.getString(String)>
	//   26   48:astore_0        
			if(intent != null)
	//*  27   49:aload_0         
	//*  28   50:ifnull          61
				applinkdata.targetUri = Uri.parse(((String) (intent)));
	//   29   53:aload_1         
	//   30   54:aload_0         
	//   31   55:invokestatic    #161 <Method Uri Uri.parse(String)>
	//   32   58:putfield        #150 <Field Uri targetUri>
		}
		applinkdata.argumentBundle = bundle;
	//   33   61:aload_1         
	//   34   62:aload_2         
	//   35   63:putfield        #163 <Field Bundle argumentBundle>
		applinkdata.arguments = null;
	//   36   66:aload_1         
	//   37   67:aconst_null     
	//   38   68:putfield        #165 <Field JSONObject arguments>
		intent = ((Intent) (bundle.getBundle("referer_data")));
	//   39   71:aload_2         
	//   40   72:ldc1            #31  <String "referer_data">
	//   41   74:invokevirtual   #168 <Method Bundle Bundle.getBundle(String)>
	//   42   77:astore_0        
		if(intent != null)
	//*  43   78:aload_0         
	//*  44   79:ifnull          92
			applinkdata.ref = ((Bundle) (intent)).getString("fb_ref");
	//   45   82:aload_1         
	//   46   83:aload_0         
	//   47   84:ldc1            #76  <String "fb_ref">
	//   48   86:invokevirtual   #155 <Method String Bundle.getString(String)>
	//   49   89:putfield        #170 <Field String ref>
		intent = ((Intent) (bundle.getBundle("extras")));
	//   50   92:aload_2         
	//   51   93:ldc1            #22  <String "extras">
	//   52   95:invokevirtual   #168 <Method Bundle Bundle.getBundle(String)>
	//   53   98:astore_0        
		if(intent == null)
			break MISSING_BLOCK_LABEL_154;
	//   54   99:aload_0         
	//   55  100:ifnull          154
		intent = ((Intent) (((Bundle) (intent)).getString("deeplink_context")));
	//   56  103:aload_0         
	//   57  104:ldc1            #64  <String "deeplink_context">
	//   58  106:invokevirtual   #155 <Method String Bundle.getString(String)>
	//   59  109:astore_0        
		if(intent == null)
			break MISSING_BLOCK_LABEL_154;
	//   60  110:aload_0         
	//   61  111:ifnull          154
		intent = ((Intent) (new JSONObject(((String) (intent)))));
	//   62  114:new             #172 <Class JSONObject>
	//   63  117:dup             
	//   64  118:aload_0         
	//   65  119:invokespecial   #175 <Method void JSONObject(String)>
	//   66  122:astore_0        
		if(!((JSONObject) (intent)).has("promo_code"))
			break MISSING_BLOCK_LABEL_154;
	//   67  123:aload_0         
	//   68  124:ldc1            #73  <String "promo_code">
	//   69  126:invokevirtual   #179 <Method boolean JSONObject.has(String)>
	//   70  129:ifeq            154
		applinkdata.promotionCode = ((JSONObject) (intent)).getString("promo_code");
	//   71  132:aload_1         
	//   72  133:aload_0         
	//   73  134:ldc1            #73  <String "promo_code">
	//   74  136:invokevirtual   #180 <Method String JSONObject.getString(String)>
	//   75  139:putfield        #182 <Field String promotionCode>
		return applinkdata;
	//   76  142:aload_1         
	//   77  143:areturn         
		intent;
	//   78  144:astore_0        
		Utility.logd(TAG, "Unable to parse deeplink_context JSON", ((Throwable) (intent)));
	//   79  145:getstatic       #94  <Field String TAG>
	//   80  148:ldc1            #184 <String "Unable to parse deeplink_context JSON">
	//   81  150:aload_0         
	//   82  151:invokestatic    #190 <Method void Utility.logd(String, String, Throwable)>
		return applinkdata;
	//   83  154:aload_1         
	//   84  155:areturn         
	}

	private static AppLinkData createFromJson(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		JSONObject jsonobject = new JSONObject(s);
	//    4    6:new             #172 <Class JSONObject>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #175 <Method void JSONObject(String)>
	//    8   14:astore_1        
		s = jsonobject.getString("version");
	//    9   15:aload_1         
	//   10   16:ldc1            #19  <String "version">
	//   11   18:invokevirtual   #180 <Method String JSONObject.getString(String)>
	//   12   21:astore_0        
		if(!jsonobject.getJSONObject("bridge_args").getString("method").equals("applink") || !s.equals("2"))
			break MISSING_BLOCK_LABEL_257;
	//   13   22:aload_1         
	//   14   23:ldc1            #13  <String "bridge_args">
	//   15   25:invokevirtual   #196 <Method JSONObject JSONObject.getJSONObject(String)>
	//   16   28:ldc1            #37  <String "method">
	//   17   30:invokevirtual   #180 <Method String JSONObject.getString(String)>
	//   18   33:ldc1            #198 <String "applink">
	//   19   35:invokevirtual   #204 <Method boolean String.equals(Object)>
	//   20   38:ifeq            257
	//   21   41:aload_0         
	//   22   42:ldc1            #206 <String "2">
	//   23   44:invokevirtual   #204 <Method boolean String.equals(Object)>
	//   24   47:ifeq            257
		s = ((String) (new AppLinkData()));
	//   25   50:new             #2   <Class AppLinkData>
	//   26   53:dup             
	//   27   54:invokespecial   #148 <Method void AppLinkData()>
	//   28   57:astore_0        
		s.arguments = jsonobject.getJSONObject("method_args");
	//   29   58:aload_0         
	//   30   59:aload_1         
	//   31   60:ldc1            #16  <String "method_args">
	//   32   62:invokevirtual   #196 <Method JSONObject JSONObject.getJSONObject(String)>
	//   33   65:putfield        #165 <Field JSONObject arguments>
		if(((AppLinkData) (s)).arguments.has("ref"))
	//*  34   68:aload_0         
	//*  35   69:getfield        #165 <Field JSONObject arguments>
	//*  36   72:ldc1            #67  <String "ref">
	//*  37   74:invokevirtual   #179 <Method boolean JSONObject.has(String)>
	//*  38   77:ifeq            96
		{
			s.ref = ((AppLinkData) (s)).arguments.getString("ref");
	//   39   80:aload_0         
	//   40   81:aload_0         
	//   41   82:getfield        #165 <Field JSONObject arguments>
	//   42   85:ldc1            #67  <String "ref">
	//   43   87:invokevirtual   #180 <Method String JSONObject.getString(String)>
	//   44   90:putfield        #170 <Field String ref>
			break MISSING_BLOCK_LABEL_137;
	//   45   93:goto            137
		}
		if(((AppLinkData) (s)).arguments.has("referer_data"))
	//*  46   96:aload_0         
	//*  47   97:getfield        #165 <Field JSONObject arguments>
	//*  48  100:ldc1            #31  <String "referer_data">
	//*  49  102:invokevirtual   #179 <Method boolean JSONObject.has(String)>
	//*  50  105:ifeq            137
		{
			JSONObject jsonobject1 = ((AppLinkData) (s)).arguments.getJSONObject("referer_data");
	//   51  108:aload_0         
	//   52  109:getfield        #165 <Field JSONObject arguments>
	//   53  112:ldc1            #31  <String "referer_data">
	//   54  114:invokevirtual   #196 <Method JSONObject JSONObject.getJSONObject(String)>
	//   55  117:astore_1        
			if(jsonobject1.has("fb_ref"))
	//*  56  118:aload_1         
	//*  57  119:ldc1            #76  <String "fb_ref">
	//*  58  121:invokevirtual   #179 <Method boolean JSONObject.has(String)>
	//*  59  124:ifeq            137
				s.ref = jsonobject1.getString("fb_ref");
	//   60  127:aload_0         
	//   61  128:aload_1         
	//   62  129:ldc1            #76  <String "fb_ref">
	//   63  131:invokevirtual   #180 <Method String JSONObject.getString(String)>
	//   64  134:putfield        #170 <Field String ref>
		}
		if(((AppLinkData) (s)).arguments.has("target_url"))
	//*  65  137:aload_0         
	//*  66  138:getfield        #165 <Field JSONObject arguments>
	//*  67  141:ldc1            #70  <String "target_url">
	//*  68  143:invokevirtual   #179 <Method boolean JSONObject.has(String)>
	//*  69  146:ifeq            165
			s.targetUri = Uri.parse(((AppLinkData) (s)).arguments.getString("target_url"));
	//   70  149:aload_0         
	//   71  150:aload_0         
	//   72  151:getfield        #165 <Field JSONObject arguments>
	//   73  154:ldc1            #70  <String "target_url">
	//   74  156:invokevirtual   #180 <Method String JSONObject.getString(String)>
	//   75  159:invokestatic    #161 <Method Uri Uri.parse(String)>
	//   76  162:putfield        #150 <Field Uri targetUri>
		if(((AppLinkData) (s)).arguments.has("extras"))
	//*  77  165:aload_0         
	//*  78  166:getfield        #165 <Field JSONObject arguments>
	//*  79  169:ldc1            #22  <String "extras">
	//*  80  171:invokevirtual   #179 <Method boolean JSONObject.has(String)>
	//*  81  174:ifeq            222
		{
			JSONObject jsonobject2 = ((AppLinkData) (s)).arguments.getJSONObject("extras");
	//   82  177:aload_0         
	//   83  178:getfield        #165 <Field JSONObject arguments>
	//   84  181:ldc1            #22  <String "extras">
	//   85  183:invokevirtual   #196 <Method JSONObject JSONObject.getJSONObject(String)>
	//   86  186:astore_1        
			if(jsonobject2.has("deeplink_context"))
	//*  87  187:aload_1         
	//*  88  188:ldc1            #64  <String "deeplink_context">
	//*  89  190:invokevirtual   #179 <Method boolean JSONObject.has(String)>
	//*  90  193:ifeq            222
			{
				jsonobject2 = jsonobject2.getJSONObject("deeplink_context");
	//   91  196:aload_1         
	//   92  197:ldc1            #64  <String "deeplink_context">
	//   93  199:invokevirtual   #196 <Method JSONObject JSONObject.getJSONObject(String)>
	//   94  202:astore_1        
				if(jsonobject2.has("promo_code"))
	//*  95  203:aload_1         
	//*  96  204:ldc1            #73  <String "promo_code">
	//*  97  206:invokevirtual   #179 <Method boolean JSONObject.has(String)>
	//*  98  209:ifeq            222
					s.promotionCode = jsonobject2.getString("promo_code");
	//   99  212:aload_0         
	//  100  213:aload_1         
	//  101  214:ldc1            #73  <String "promo_code">
	//  102  216:invokevirtual   #180 <Method String JSONObject.getString(String)>
	//  103  219:putfield        #182 <Field String promotionCode>
			}
		}
		s.argumentBundle = toBundle(((AppLinkData) (s)).arguments);
	//  104  222:aload_0         
	//  105  223:aload_0         
	//  106  224:getfield        #165 <Field JSONObject arguments>
	//  107  227:invokestatic    #210 <Method Bundle toBundle(JSONObject)>
	//  108  230:putfield        #163 <Field Bundle argumentBundle>
		return ((AppLinkData) (s));
	//  109  233:aload_0         
	//  110  234:areturn         
		s;
	//  111  235:astore_0        
		Utility.logd(TAG, "Unable to parse AppLink JSON", ((Throwable) (s)));
	//  112  236:getstatic       #94  <Field String TAG>
	//  113  239:ldc1            #212 <String "Unable to parse AppLink JSON">
	//  114  241:aload_0         
	//  115  242:invokestatic    #190 <Method void Utility.logd(String, String, Throwable)>
		return null;
	//  116  245:aconst_null     
	//  117  246:areturn         
		s;
	//  118  247:astore_0        
		Utility.logd(TAG, "Unable to parse AppLink JSON", ((Throwable) (s)));
	//  119  248:getstatic       #94  <Field String TAG>
	//  120  251:ldc1            #212 <String "Unable to parse AppLink JSON">
	//  121  253:aload_0         
	//  122  254:invokestatic    #190 <Method void Utility.logd(String, String, Throwable)>
		return null;
	//  123  257:aconst_null     
	//  124  258:areturn         
	}

	private static AppLinkData createFromUri(Uri uri)
	{
		if(uri == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
		{
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		} else
		{
			AppLinkData applinkdata = new AppLinkData();
	//    4    6:new             #2   <Class AppLinkData>
	//    5    9:dup             
	//    6   10:invokespecial   #148 <Method void AppLinkData()>
	//    7   13:astore_1        
			applinkdata.targetUri = uri;
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:putfield        #150 <Field Uri targetUri>
			return applinkdata;
	//   11   19:aload_1         
	//   12   20:areturn         
		}
	}

	public static void fetchDeferredAppLinkData(Context context, CompletionHandler completionhandler)
	{
		fetchDeferredAppLinkData(context, ((String) (null)), completionhandler);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokestatic    #216 <Method void fetchDeferredAppLinkData(Context, String, AppLinkData$CompletionHandler)>
	//    4    6:return          
	}

	public static void fetchDeferredAppLinkData(Context context, String s, CompletionHandler completionhandler)
	{
		Validate.notNull(((Object) (context)), "context");
	//    0    0:aload_0         
	//    1    1:ldc1            #218 <String "context">
	//    2    3:invokestatic    #113 <Method void Validate.notNull(Object, String)>
		Validate.notNull(((Object) (completionhandler)), "completionHandler");
	//    3    6:aload_2         
	//    4    7:ldc1            #220 <String "completionHandler">
	//    5    9:invokestatic    #113 <Method void Validate.notNull(Object, String)>
		String s1 = s;
	//    6   12:aload_1         
	//    7   13:astore_3        
		if(s == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       23
			s1 = Utility.getMetadataApplicationId(context);
	//   10   18:aload_0         
	//   11   19:invokestatic    #224 <Method String Utility.getMetadataApplicationId(Context)>
	//   12   22:astore_3        
		Validate.notNull(((Object) (s1)), "applicationId");
	//   13   23:aload_3         
	//   14   24:ldc1            #226 <String "applicationId">
	//   15   26:invokestatic    #113 <Method void Validate.notNull(Object, String)>
		context = context.getApplicationContext();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #232 <Method Context Context.getApplicationContext()>
	//   18   33:astore_0        
		FacebookSdk.getExecutor().execute(new Runnable(context, s1, completionhandler) {

			public void run()
			{
				AppLinkData.fetchDeferredAppLinkFromServer(applicationContext, applicationIdCopy, completionHandler);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field Context val$applicationContext>
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field String val$applicationIdCopy>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field AppLinkData$CompletionHandler val$completionHandler>
			//    6   12:invokestatic    #32  <Method void AppLinkData.access$000(Context, String, AppLinkData$CompletionHandler)>
			//    7   15:return          
			}

			final Context val$applicationContext;
			final String val$applicationIdCopy;
			final CompletionHandler val$completionHandler;

			
			{
				applicationContext = context;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Context val$applicationContext>
				applicationIdCopy = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field String val$applicationIdCopy>
				completionHandler = completionhandler;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field AppLinkData$CompletionHandler val$completionHandler>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   19   34:invokestatic    #238 <Method Executor FacebookSdk.getExecutor()>
	//   20   37:new             #6   <Class AppLinkData$1>
	//   21   40:dup             
	//   22   41:aload_0         
	//   23   42:aload_3         
	//   24   43:aload_2         
	//   25   44:invokespecial   #240 <Method void AppLinkData$1(Context, String, AppLinkData$CompletionHandler)>
	//   26   47:invokeinterface #246 <Method void Executor.execute(Runnable)>
	//   27   52:return          
	}

	private static void fetchDeferredAppLinkFromServer(Context context, String s, CompletionHandler completionhandler)
	{
		Object obj1 = ((Object) (new JSONObject()));
	//    0    0:new             #172 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #249 <Method void JSONObject()>
	//    3    7:astore          7
		long l;
		AppLinkData applinkdata;
		Object obj;
		Object obj2;
		String s1;
		try
		{
			((JSONObject) (obj1)).put("event", "DEFERRED_APP_LINK");
	//    4    9:aload           7
	//    5   11:ldc1            #251 <String "event">
	//    6   13:ldc1            #55  <String "DEFERRED_APP_LINK">
	//    7   15:invokevirtual   #255 <Method JSONObject JSONObject.put(String, Object)>
	//    8   18:pop             
			Utility.setAppEventAttributionParameters(((JSONObject) (obj1)), AttributionIdentifiers.getAttributionIdentifiers(context), AppEventsLogger.getAnonymousAppDeviceGUID(context), FacebookSdk.getLimitEventAndDataUsage(context));
	//    9   19:aload           7
	//   10   21:aload_0         
	//   11   22:invokestatic    #261 <Method AttributionIdentifiers AttributionIdentifiers.getAttributionIdentifiers(Context)>
	//   12   25:aload_0         
	//   13   26:invokestatic    #266 <Method String AppEventsLogger.getAnonymousAppDeviceGUID(Context)>
	//   14   29:aload_0         
	//   15   30:invokestatic    #270 <Method boolean FacebookSdk.getLimitEventAndDataUsage(Context)>
	//   16   33:invokestatic    #274 <Method void Utility.setAppEventAttributionParameters(JSONObject, AttributionIdentifiers, String, boolean)>
			Utility.setAppEventExtendedDeviceInfoParameters(((JSONObject) (obj1)), FacebookSdk.getApplicationContext());
	//   17   36:aload           7
	//   18   38:invokestatic    #275 <Method Context FacebookSdk.getApplicationContext()>
	//   19   41:invokestatic    #279 <Method void Utility.setAppEventExtendedDeviceInfoParameters(JSONObject, Context)>
			((JSONObject) (obj1)).put("application_package_name", ((Object) (context.getPackageName())));
	//   20   44:aload           7
	//   21   46:ldc2            #281 <String "application_package_name">
	//   22   49:aload_0         
	//   23   50:invokevirtual   #284 <Method String Context.getPackageName()>
	//   24   53:invokevirtual   #255 <Method JSONObject JSONObject.put(String, Object)>
	//   25   56:pop             
		}
	//*  26   57:ldc1            #58  <String "%s/activities">
	//*  27   59:iconst_1        
	//*  28   60:anewarray       Object[]
	//*  29   63:dup             
	//*  30   64:iconst_0        
	//*  31   65:aload_1         
	//*  32   66:aastore         
	//*  33   67:invokestatic    #288 <Method String String.format(String, Object[])>
	//*  34   70:astore_1        
	//*  35   71:aconst_null     
	//*  36   72:astore          6
	//*  37   74:aconst_null     
	//*  38   75:astore          5
	//*  39   77:aload           6
	//*  40   79:astore_0        
	//*  41   80:aconst_null     
	//*  42   81:aload_1         
	//*  43   82:aload           7
	//*  44   84:aconst_null     
	//*  45   85:invokestatic    #294 <Method GraphRequest GraphRequest.newPostRequest(com.facebook.AccessToken, String, JSONObject, com.facebook.GraphRequest$Callback)>
	//*  46   88:invokevirtual   #298 <Method GraphResponse GraphRequest.executeAndWait()>
	//*  47   91:invokevirtual   #303 <Method JSONObject GraphResponse.getJSONObject()>
	//*  48   94:astore          8
	//*  49   96:aload           5
	//*  50   98:astore_1        
	//*  51   99:aload           8
	//*  52  101:ifnull          427
	//*  53  104:aload           6
	//*  54  106:astore_0        
	//*  55  107:aload           8
	//*  56  109:ldc1            #46  <String "applink_args">
	//*  57  111:invokevirtual   #306 <Method String JSONObject.optString(String)>
	//*  58  114:astore          9
	//*  59  116:aload           6
	//*  60  118:astore_0        
	//*  61  119:aload           8
	//*  62  121:ldc1            #52  <String "click_time">
	//*  63  123:ldc2w           #307 <Long -1L>
	//*  64  126:invokevirtual   #312 <Method long JSONObject.optLong(String, long)>
	//*  65  129:lstore_3        
	//*  66  130:aload           6
	//*  67  132:astore_0        
	//*  68  133:aload           8
	//*  69  135:ldc1            #49  <String "applink_class">
	//*  70  137:invokevirtual   #306 <Method String JSONObject.optString(String)>
	//*  71  140:astore          7
	//*  72  142:aload           6
	//*  73  144:astore_0        
	//*  74  145:aload           8
	//*  75  147:ldc1            #61  <String "applink_url">
	//*  76  149:invokevirtual   #306 <Method String JSONObject.optString(String)>
	//*  77  152:astore          8
	//*  78  154:aload           5
	//*  79  156:astore_1        
	//*  80  157:aload           6
	//*  81  159:astore_0        
	//*  82  160:aload           9
	//*  83  162:invokestatic    #318 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  84  165:ifne            427
	//*  85  168:aload           6
	//*  86  170:astore_0        
	//*  87  171:aload           9
	//*  88  173:invokestatic    #133 <Method AppLinkData createFromJson(String)>
	//*  89  176:astore          5
	//*  90  178:lload_3         
	//*  91  179:ldc2w           #307 <Long -1L>
	//*  92  182:lcmp            
	//*  93  183:ifeq            255
	//*  94  186:aload           5
	//*  95  188:astore_0        
	//*  96  189:aload           5
	//*  97  191:getfield        #165 <Field JSONObject arguments>
	//*  98  194:ifnull          212
	//*  99  197:aload           5
	//* 100  199:astore_0        
	//* 101  200:aload           5
	//* 102  202:getfield        #165 <Field JSONObject arguments>
	//* 103  205:ldc1            #34  <String "com.facebook.platform.APPLINK_TAP_TIME_UTC">
	//* 104  207:lload_3         
	//* 105  208:invokevirtual   #321 <Method JSONObject JSONObject.put(String, long)>
	//* 106  211:pop             
	//* 107  212:aload           5
	//* 108  214:astore_0        
	//* 109  215:aload           5
	//* 110  217:getfield        #163 <Field Bundle argumentBundle>
	//* 111  220:ifnull          255
	//* 112  223:aload           5
	//* 113  225:astore_0        
	//* 114  226:aload           5
	//* 115  228:getfield        #163 <Field Bundle argumentBundle>
	//* 116  231:ldc1            #34  <String "com.facebook.platform.APPLINK_TAP_TIME_UTC">
	//* 117  233:lload_3         
	//* 118  234:invokestatic    #327 <Method String Long.toString(long)>
	//* 119  237:invokevirtual   #331 <Method void Bundle.putString(String, String)>
	//* 120  240:goto            255
	//* 121  243:aload           5
	//* 122  245:astore_0        
	//* 123  246:getstatic       #94  <Field String TAG>
	//* 124  249:ldc2            #333 <String "Unable to put tap time in AppLinkData.arguments">
	//* 125  252:invokestatic    #335 <Method void Utility.logd(String, String)>
	//* 126  255:aload           7
	//* 127  257:ifnull          328
	//* 128  260:aload           5
	//* 129  262:astore_0        
	//* 130  263:aload           5
	//* 131  265:getfield        #165 <Field JSONObject arguments>
	//* 132  268:ifnull          287
	//* 133  271:aload           5
	//* 134  273:astore_0        
	//* 135  274:aload           5
	//* 136  276:getfield        #165 <Field JSONObject arguments>
	//* 137  279:ldc1            #25  <String "com.facebook.platform.APPLINK_NATIVE_CLASS">
	//* 138  281:aload           7
	//* 139  283:invokevirtual   #255 <Method JSONObject JSONObject.put(String, Object)>
	//* 140  286:pop             
	//* 141  287:aload           5
	//* 142  289:astore_0        
	//* 143  290:aload           5
	//* 144  292:getfield        #163 <Field Bundle argumentBundle>
	//* 145  295:ifnull          328
	//* 146  298:aload           5
	//* 147  300:astore_0        
	//* 148  301:aload           5
	//* 149  303:getfield        #163 <Field Bundle argumentBundle>
	//* 150  306:ldc1            #25  <String "com.facebook.platform.APPLINK_NATIVE_CLASS">
	//* 151  308:aload           7
	//* 152  310:invokevirtual   #331 <Method void Bundle.putString(String, String)>
	//* 153  313:goto            328
	//* 154  316:aload           5
	//* 155  318:astore_0        
	//* 156  319:getstatic       #94  <Field String TAG>
	//* 157  322:ldc2            #333 <String "Unable to put tap time in AppLinkData.arguments">
	//* 158  325:invokestatic    #335 <Method void Utility.logd(String, String)>
	//* 159  328:aload           5
	//* 160  330:astore_1        
	//* 161  331:aload           8
	//* 162  333:ifnull          427
	//* 163  336:aload           5
	//* 164  338:astore_0        
	//* 165  339:aload           5
	//* 166  341:getfield        #165 <Field JSONObject arguments>
	//* 167  344:ifnull          363
	//* 168  347:aload           5
	//* 169  349:astore_0        
	//* 170  350:aload           5
	//* 171  352:getfield        #165 <Field JSONObject arguments>
	//* 172  355:ldc1            #28  <String "com.facebook.platform.APPLINK_NATIVE_URL">
	//* 173  357:aload           8
	//* 174  359:invokevirtual   #255 <Method JSONObject JSONObject.put(String, Object)>
	//* 175  362:pop             
	//* 176  363:aload           5
	//* 177  365:astore_1        
	//* 178  366:aload           5
	//* 179  368:astore_0        
	//* 180  369:aload           5
	//* 181  371:getfield        #163 <Field Bundle argumentBundle>
	//* 182  374:ifnull          427
	//* 183  377:aload           5
	//* 184  379:astore_0        
	//* 185  380:aload           5
	//* 186  382:getfield        #163 <Field Bundle argumentBundle>
	//* 187  385:ldc1            #28  <String "com.facebook.platform.APPLINK_NATIVE_URL">
	//* 188  387:aload           8
	//* 189  389:invokevirtual   #331 <Method void Bundle.putString(String, String)>
	//* 190  392:aload           5
	//* 191  394:astore_1        
	//* 192  395:goto            427
	//* 193  398:aload           5
	//* 194  400:astore_0        
	//* 195  401:getstatic       #94  <Field String TAG>
	//* 196  404:ldc2            #333 <String "Unable to put tap time in AppLinkData.arguments">
	//* 197  407:invokestatic    #335 <Method void Utility.logd(String, String)>
	//* 198  410:aload           5
	//* 199  412:astore_1        
	//* 200  413:goto            427
	//* 201  416:getstatic       #94  <Field String TAG>
	//* 202  419:ldc2            #337 <String "Unable to fetch deferred applink from server">
	//* 203  422:invokestatic    #335 <Method void Utility.logd(String, String)>
	//* 204  425:aload_0         
	//* 205  426:astore_1        
	//* 206  427:aload_2         
	//* 207  428:aload_1         
	//* 208  429:invokeinterface #341 <Method void AppLinkData$CompletionHandler.onDeferredAppLinkDataFetched(AppLinkData)>
	//* 209  434:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 210  435:astore_0        
		{
			throw new FacebookException("An error occurred while preparing deferred app link", ((Throwable) (context)));
	//  211  436:new             #192 <Class FacebookException>
	//  212  439:dup             
	//  213  440:ldc2            #343 <String "An error occurred while preparing deferred app link">
	//  214  443:aload_0         
	//  215  444:invokespecial   #346 <Method void FacebookException(String, Throwable)>
	//  216  447:athrow          
		}
		s = String.format("%s/activities", new Object[] {
			s
		});
		obj = null;
		applinkdata = null;
		context = ((Context) (obj));
		obj2 = ((Object) (GraphRequest.newPostRequest(((com.facebook.AccessToken) (null)), s, ((JSONObject) (obj1)), ((com.facebook.GraphRequest.Callback) (null))).executeAndWait().getJSONObject()));
		s = ((String) (applinkdata));
		if(obj2 == null) goto _L2; else goto _L1
_L1:
		context = ((Context) (obj));
		s1 = ((JSONObject) (obj2)).optString("applink_args");
		context = ((Context) (obj));
		l = ((JSONObject) (obj2)).optLong("click_time", -1L);
		context = ((Context) (obj));
		obj1 = ((Object) (((JSONObject) (obj2)).optString("applink_class")));
		context = ((Context) (obj));
		obj2 = ((Object) (((JSONObject) (obj2)).optString("applink_url")));
		s = ((String) (applinkdata));
		context = ((Context) (obj));
		if(TextUtils.isEmpty(((CharSequence) (s1)))) goto _L2; else goto _L3
_L3:
		context = ((Context) (obj));
		applinkdata = createFromJson(s1);
		if(l == -1L) goto _L5; else goto _L4
_L4:
		context = ((Context) (applinkdata));
		if(applinkdata.arguments == null)
			break MISSING_BLOCK_LABEL_212;
		context = ((Context) (applinkdata));
		applinkdata.arguments.put("com.facebook.platform.APPLINK_TAP_TIME_UTC", l);
		context = ((Context) (applinkdata));
		if(applinkdata.argumentBundle == null) goto _L5; else goto _L6
_L6:
		context = ((Context) (applinkdata));
		applinkdata.argumentBundle.putString("com.facebook.platform.APPLINK_TAP_TIME_UTC", Long.toString(l));
		  goto _L5
_L14:
		context = ((Context) (applinkdata));
		Utility.logd(TAG, "Unable to put tap time in AppLinkData.arguments");
_L5:
		if(obj1 == null) goto _L8; else goto _L7
_L7:
		context = ((Context) (applinkdata));
		if(applinkdata.arguments == null)
			break MISSING_BLOCK_LABEL_287;
		context = ((Context) (applinkdata));
		applinkdata.arguments.put("com.facebook.platform.APPLINK_NATIVE_CLASS", obj1);
		context = ((Context) (applinkdata));
		if(applinkdata.argumentBundle == null) goto _L8; else goto _L9
_L9:
		context = ((Context) (applinkdata));
		applinkdata.argumentBundle.putString("com.facebook.platform.APPLINK_NATIVE_CLASS", ((String) (obj1)));
		  goto _L8
_L15:
		context = ((Context) (applinkdata));
		Utility.logd(TAG, "Unable to put tap time in AppLinkData.arguments");
_L8:
		s = ((String) (applinkdata));
		if(obj2 == null) goto _L2; else goto _L10
_L10:
		context = ((Context) (applinkdata));
		if(applinkdata.arguments == null)
			break MISSING_BLOCK_LABEL_363;
		context = ((Context) (applinkdata));
		applinkdata.arguments.put("com.facebook.platform.APPLINK_NATIVE_URL", obj2);
		s = ((String) (applinkdata));
		context = ((Context) (applinkdata));
		if(applinkdata.argumentBundle == null) goto _L2; else goto _L11
_L11:
		context = ((Context) (applinkdata));
		applinkdata.argumentBundle.putString("com.facebook.platform.APPLINK_NATIVE_URL", ((String) (obj2)));
		s = ((String) (applinkdata));
		  goto _L2
_L16:
		context = ((Context) (applinkdata));
		Utility.logd(TAG, "Unable to put tap time in AppLinkData.arguments");
		s = ((String) (applinkdata));
		  goto _L2
_L13:
		Utility.logd(TAG, "Unable to fetch deferred applink from server");
		s = ((String) (context));
_L2:
		completionhandler.onDeferredAppLinkDataFetched(((AppLinkData) (s)));
		return;
		s;
	//  217  448:astore_1        
		if(true) goto _L13; else goto _L12
	//  218  449:goto            416
_L12:
		context;
	//  219  452:astore_0        
		  goto _L14
	//* 220  453:goto            243
		context;
	//  221  456:astore_0        
		  goto _L15
	//* 222  457:goto            316
		context;
	//  223  460:astore_0        
		  goto _L16
	//* 224  461:goto            398
	}

	private static Bundle toBundle(JSONObject jsonobject)
		throws JSONException
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #152 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #347 <Method void Bundle()>
	//    3    7:astore          4
		for(Iterator iterator = jsonobject.keys(); iterator.hasNext();)
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #351 <Method Iterator JSONObject.keys()>
	//*   6   13:astore          5
	//*   7   15:aload           5
	//*   8   17:invokeinterface #357 <Method boolean Iterator.hasNext()>
	//*   9   22:ifeq            268
		{
			String s = (String)iterator.next();
	//   10   25:aload           5
	//   11   27:invokeinterface #361 <Method Object Iterator.next()>
	//   12   32:checkcast       #200 <Class String>
	//   13   35:astore          6
			Object obj = jsonobject.get(s);
	//   14   37:aload_0         
	//   15   38:aload           6
	//   16   40:invokevirtual   #365 <Method Object JSONObject.get(String)>
	//   17   43:astore          7
			if(obj instanceof JSONObject)
	//*  18   45:aload           7
	//*  19   47:instanceof      #172 <Class JSONObject>
	//*  20   50:ifeq            71
				bundle.putBundle(s, toBundle((JSONObject)obj));
	//   21   53:aload           4
	//   22   55:aload           6
	//   23   57:aload           7
	//   24   59:checkcast       #172 <Class JSONObject>
	//   25   62:invokestatic    #210 <Method Bundle toBundle(JSONObject)>
	//   26   65:invokevirtual   #369 <Method void Bundle.putBundle(String, Bundle)>
			else
	//*  27   68:goto            15
			if(obj instanceof JSONArray)
	//*  28   71:aload           7
	//*  29   73:instanceof      #371 <Class JSONArray>
	//*  30   76:ifeq            253
			{
				obj = ((Object) ((JSONArray)obj));
	//   31   79:aload           7
	//   32   81:checkcast       #371 <Class JSONArray>
	//   33   84:astore          7
				int k = ((JSONArray) (obj)).length();
	//   34   86:aload           7
	//   35   88:invokevirtual   #375 <Method int JSONArray.length()>
	//   36   91:istore_3        
				boolean flag = false;
	//   37   92:iconst_0        
	//   38   93:istore_2        
				int i = 0;
	//   39   94:iconst_0        
	//   40   95:istore_1        
				if(k == 0)
	//*  41   96:iload_3         
	//*  42   97:ifne            114
				{
					bundle.putStringArray(s, new String[0]);
	//   43  100:aload           4
	//   44  102:aload           6
	//   45  104:iconst_0        
	//   46  105:anewarray       String[]
	//   47  108:invokevirtual   #379 <Method void Bundle.putStringArray(String, String[])>
				} else
	//*  48  111:goto            15
				{
					android.os.Parcelable aparcelable[] = ((android.os.Parcelable []) (((JSONArray) (obj)).get(0)));
	//   49  114:aload           7
	//   50  116:iconst_0        
	//   51  117:invokevirtual   #382 <Method Object JSONArray.get(int)>
	//   52  120:astore          8
					if(aparcelable instanceof JSONObject)
	//*  53  122:aload           8
	//*  54  124:instanceof      #172 <Class JSONObject>
	//*  55  127:ifeq            181
					{
						aparcelable = ((android.os.Parcelable []) (new Bundle[((JSONArray) (obj)).length()]));
	//   56  130:aload           7
	//   57  132:invokevirtual   #375 <Method int JSONArray.length()>
	//   58  135:anewarray       Bundle[]
	//   59  138:astore          8
						for(; i < ((JSONArray) (obj)).length(); i++)
	//*  60  140:iload_1         
	//*  61  141:aload           7
	//*  62  143:invokevirtual   #375 <Method int JSONArray.length()>
	//*  63  146:icmpge          169
							aparcelable[i] = ((/*<invalid signature>*/java.lang.Object) (toBundle(((JSONArray) (obj)).getJSONObject(i))));
	//   64  149:aload           8
	//   65  151:iload_1         
	//   66  152:aload           7
	//   67  154:iload_1         
	//   68  155:invokevirtual   #385 <Method JSONObject JSONArray.getJSONObject(int)>
	//   69  158:invokestatic    #210 <Method Bundle toBundle(JSONObject)>
	//   70  161:aastore         

	//   71  162:iload_1         
	//   72  163:iconst_1        
	//   73  164:iadd            
	//   74  165:istore_1        
	//*  75  166:goto            140
						bundle.putParcelableArray(s, aparcelable);
	//   76  169:aload           4
	//   77  171:aload           6
	//   78  173:aload           8
	//   79  175:invokevirtual   #389 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
					} else
	//*  80  178:goto            15
					if(!(aparcelable instanceof JSONArray))
	//*  81  181:aload           8
	//*  82  183:instanceof      #371 <Class JSONArray>
	//*  83  186:ifne            242
					{
						String as[] = new String[((JSONArray) (obj)).length()];
	//   84  189:aload           7
	//   85  191:invokevirtual   #375 <Method int JSONArray.length()>
	//   86  194:anewarray       String[]
	//   87  197:astore          8
						for(int j = ((int) (flag)); j < ((JSONArray) (obj)).length(); j++)
	//*  88  199:iload_2         
	//*  89  200:istore_1        
	//*  90  201:iload_1         
	//*  91  202:aload           7
	//*  92  204:invokevirtual   #375 <Method int JSONArray.length()>
	//*  93  207:icmpge          230
							as[j] = ((JSONArray) (obj)).get(j).toString();
	//   94  210:aload           8
	//   95  212:iload_1         
	//   96  213:aload           7
	//   97  215:iload_1         
	//   98  216:invokevirtual   #382 <Method Object JSONArray.get(int)>
	//   99  219:invokevirtual   #391 <Method String Object.toString()>
	//  100  222:aastore         

	//  101  223:iload_1         
	//  102  224:iconst_1        
	//  103  225:iadd            
	//  104  226:istore_1        
	//* 105  227:goto            201
						bundle.putStringArray(s, as);
	//  106  230:aload           4
	//  107  232:aload           6
	//  108  234:aload           8
	//  109  236:invokevirtual   #379 <Method void Bundle.putStringArray(String, String[])>
					} else
	//* 110  239:goto            15
					{
						throw new FacebookException("Nested arrays are not supported.");
	//  111  242:new             #192 <Class FacebookException>
	//  112  245:dup             
	//  113  246:ldc2            #393 <String "Nested arrays are not supported.">
	//  114  249:invokespecial   #394 <Method void FacebookException(String)>
	//  115  252:athrow          
					}
				}
			} else
			{
				bundle.putString(s, obj.toString());
	//  116  253:aload           4
	//  117  255:aload           6
	//  118  257:aload           7
	//  119  259:invokevirtual   #391 <Method String Object.toString()>
	//  120  262:invokevirtual   #331 <Method void Bundle.putString(String, String)>
			}
		}

	//* 121  265:goto            15
		return bundle;
	//  122  268:aload           4
	//  123  270:areturn         
	}

	public Bundle getArgumentBundle()
	{
		return argumentBundle;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field Bundle argumentBundle>
	//    2    4:areturn         
	}

	public String getPromotionCode()
	{
		return promotionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field String promotionCode>
	//    2    4:areturn         
	}

	public String getRef()
	{
		return ref;
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field String ref>
	//    2    4:areturn         
	}

	public Bundle getRefererData()
	{
		Bundle bundle = argumentBundle;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field Bundle argumentBundle>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			return bundle.getBundle("referer_data");
	//    5    9:aload_1         
	//    6   10:ldc1            #31  <String "referer_data">
	//    7   12:invokevirtual   #168 <Method Bundle Bundle.getBundle(String)>
	//    8   15:areturn         
		else
			return null;
	//    9   16:aconst_null     
	//   10   17:areturn         
	}

	public Uri getTargetUri()
	{
		return targetUri;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field Uri targetUri>
	//    2    4:areturn         
	}

	private static final String APPLINK_BRIDGE_ARGS_KEY = "bridge_args";
	private static final String APPLINK_METHOD_ARGS_KEY = "method_args";
	private static final String APPLINK_VERSION_KEY = "version";
	public static final String ARGUMENTS_EXTRAS_KEY = "extras";
	public static final String ARGUMENTS_NATIVE_CLASS_KEY = "com.facebook.platform.APPLINK_NATIVE_CLASS";
	public static final String ARGUMENTS_NATIVE_URL = "com.facebook.platform.APPLINK_NATIVE_URL";
	public static final String ARGUMENTS_REFERER_DATA_KEY = "referer_data";
	public static final String ARGUMENTS_TAPTIME_KEY = "com.facebook.platform.APPLINK_TAP_TIME_UTC";
	private static final String BRIDGE_ARGS_METHOD_KEY = "method";
	private static final String BUNDLE_AL_APPLINK_DATA_KEY = "al_applink_data";
	static final String BUNDLE_APPLINK_ARGS_KEY = "com.facebook.platform.APPLINK_ARGS";
	private static final String DEFERRED_APP_LINK_ARGS_FIELD = "applink_args";
	private static final String DEFERRED_APP_LINK_CLASS_FIELD = "applink_class";
	private static final String DEFERRED_APP_LINK_CLICK_TIME_FIELD = "click_time";
	private static final String DEFERRED_APP_LINK_EVENT = "DEFERRED_APP_LINK";
	private static final String DEFERRED_APP_LINK_PATH = "%s/activities";
	private static final String DEFERRED_APP_LINK_URL_FIELD = "applink_url";
	private static final String EXTRAS_DEEPLINK_CONTEXT_KEY = "deeplink_context";
	private static final String METHOD_ARGS_REF_KEY = "ref";
	private static final String METHOD_ARGS_TARGET_URL_KEY = "target_url";
	private static final String PROMOTION_CODE_KEY = "promo_code";
	private static final String REFERER_DATA_REF_KEY = "fb_ref";
	private static final String TAG = ((Class) (com/facebook/applinks/AppLinkData)).getCanonicalName();
	private Bundle argumentBundle;
	private JSONObject arguments;
	private String promotionCode;
	private String ref;
	private Uri targetUri;

	static 
	{
	//    0    0:ldc1            #2   <Class AppLinkData>
	//    1    2:invokevirtual   #92  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #94  <Field String TAG>
	//*   3    8:return          
	}


/*
	static void access$000(Context context, String s, CompletionHandler completionhandler)
	{
		fetchDeferredAppLinkFromServer(context, s, completionhandler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #103 <Method void fetchDeferredAppLinkFromServer(Context, String, AppLinkData$CompletionHandler)>
		return;
	//    4    6:return          
	}

*/
}
