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
import android.util.Log;
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
	//    1    1:invokespecial   #88  <Method void Object()>
	//    2    4:return          
	}

	public static AppLinkData createFromActivity(Activity activity)
	{
		Validate.notNull(((Object) (activity)), "activity");
	//    0    0:aload_0         
	//    1    1:ldc1            #97  <String "activity">
	//    2    3:invokestatic    #103 <Method void Validate.notNull(Object, String)>
		Intent intent = activity.getIntent();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #109 <Method Intent Activity.getIntent()>
	//    5   10:astore_2        
		if(intent == null)
	//*   6   11:aload_2         
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		Object obj = ((Object) (createFromAlApplinkData(intent)));
	//   10   17:aload_2         
	//   11   18:invokestatic    #113 <Method AppLinkData createFromAlApplinkData(Intent)>
	//   12   21:astore_1        
		activity = ((Activity) (obj));
	//   13   22:aload_1         
	//   14   23:astore_0        
		if(obj == null)
	//*  15   24:aload_1         
	//*  16   25:ifnonnull       38
			activity = ((Activity) (createFromJson(intent.getStringExtra("com.facebook.platform.APPLINK_ARGS"))));
	//   17   28:aload_2         
	//   18   29:ldc1            #40  <String "com.facebook.platform.APPLINK_ARGS">
	//   19   31:invokevirtual   #119 <Method String Intent.getStringExtra(String)>
	//   20   34:invokestatic    #123 <Method AppLinkData createFromJson(String)>
	//   21   37:astore_0        
		obj = ((Object) (activity));
	//   22   38:aload_0         
	//   23   39:astore_1        
		if(activity == null)
	//*  24   40:aload_0         
	//*  25   41:ifnonnull       52
			obj = ((Object) (createFromUri(intent.getData())));
	//   26   44:aload_2         
	//   27   45:invokevirtual   #127 <Method Uri Intent.getData()>
	//   28   48:invokestatic    #131 <Method AppLinkData createFromUri(Uri)>
	//   29   51:astore_1        
		return ((AppLinkData) (obj));
	//   30   52:aload_1         
	//   31   53:areturn         
	}

	public static AppLinkData createFromAlApplinkData(Intent intent)
	{
		Bundle bundle = intent.getBundleExtra("al_applink_data");
	//    0    0:aload_0         
	//    1    1:ldc1            #37  <String "al_applink_data">
	//    2    3:invokevirtual   #135 <Method Bundle Intent.getBundleExtra(String)>
	//    3    6:astore_2        
		if(bundle == null)
	//*   4    7:aload_2         
	//*   5    8:ifnonnull       13
			return null;
	//    6   11:aconst_null     
	//    7   12:areturn         
		AppLinkData applinkdata = new AppLinkData();
	//    8   13:new             #2   <Class AppLinkData>
	//    9   16:dup             
	//   10   17:invokespecial   #136 <Method void AppLinkData()>
	//   11   20:astore_1        
		applinkdata.targetUri = intent.getData();
	//   12   21:aload_1         
	//   13   22:aload_0         
	//   14   23:invokevirtual   #127 <Method Uri Intent.getData()>
	//   15   26:putfield        #138 <Field Uri targetUri>
		if(applinkdata.targetUri == null)
	//*  16   29:aload_1         
	//*  17   30:getfield        #138 <Field Uri targetUri>
	//*  18   33:ifnonnull       55
		{
			intent = ((Intent) (bundle.getString("target_url")));
	//   19   36:aload_2         
	//   20   37:ldc1            #64  <String "target_url">
	//   21   39:invokevirtual   #143 <Method String Bundle.getString(String)>
	//   22   42:astore_0        
			if(intent != null)
	//*  23   43:aload_0         
	//*  24   44:ifnull          55
				applinkdata.targetUri = Uri.parse(((String) (intent)));
	//   25   47:aload_1         
	//   26   48:aload_0         
	//   27   49:invokestatic    #149 <Method Uri Uri.parse(String)>
	//   28   52:putfield        #138 <Field Uri targetUri>
		}
		applinkdata.argumentBundle = bundle;
	//   29   55:aload_1         
	//   30   56:aload_2         
	//   31   57:putfield        #151 <Field Bundle argumentBundle>
		applinkdata.arguments = null;
	//   32   60:aload_1         
	//   33   61:aconst_null     
	//   34   62:putfield        #153 <Field JSONObject arguments>
		intent = ((Intent) (bundle.getBundle("referer_data")));
	//   35   65:aload_2         
	//   36   66:ldc1            #28  <String "referer_data">
	//   37   68:invokevirtual   #156 <Method Bundle Bundle.getBundle(String)>
	//   38   71:astore_0        
		if(intent != null)
	//*  39   72:aload_0         
	//*  40   73:ifnull          86
			applinkdata.ref = ((Bundle) (intent)).getString("fb_ref");
	//   41   76:aload_1         
	//   42   77:aload_0         
	//   43   78:ldc1            #67  <String "fb_ref">
	//   44   80:invokevirtual   #143 <Method String Bundle.getString(String)>
	//   45   83:putfield        #158 <Field String ref>
		return applinkdata;
	//   46   86:aload_1         
	//   47   87:areturn         
	}

	private static AppLinkData createFromJson(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Object obj;
		s = ((String) (new JSONObject(s)));
	//    4    6:new             #164 <Class JSONObject>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #167 <Method void JSONObject(String)>
	//    8   14:astore_0        
		obj = ((Object) (((JSONObject) (s)).getString("version")));
	//    9   15:aload_0         
	//   10   16:ldc1            #19  <String "version">
	//   11   18:invokevirtual   #168 <Method String JSONObject.getString(String)>
	//   12   21:astore_1        
		if(!((JSONObject) (s)).getJSONObject("bridge_args").getString("method").equals("applink") || !((String) (obj)).equals("2"))
			break MISSING_BLOCK_LABEL_202;
	//   13   22:aload_0         
	//   14   23:ldc1            #13  <String "bridge_args">
	//   15   25:invokevirtual   #172 <Method JSONObject JSONObject.getJSONObject(String)>
	//   16   28:ldc1            #34  <String "method">
	//   17   30:invokevirtual   #168 <Method String JSONObject.getString(String)>
	//   18   33:ldc1            #174 <String "applink">
	//   19   35:invokevirtual   #180 <Method boolean String.equals(Object)>
	//   20   38:ifeq            202
	//   21   41:aload_1         
	//   22   42:ldc1            #182 <String "2">
	//   23   44:invokevirtual   #180 <Method boolean String.equals(Object)>
	//   24   47:ifeq            202
		obj = ((Object) (new AppLinkData()));
	//   25   50:new             #2   <Class AppLinkData>
	//   26   53:dup             
	//   27   54:invokespecial   #136 <Method void AppLinkData()>
	//   28   57:astore_1        
		obj.arguments = ((JSONObject) (s)).getJSONObject("method_args");
	//   29   58:aload_1         
	//   30   59:aload_0         
	//   31   60:ldc1            #16  <String "method_args">
	//   32   62:invokevirtual   #172 <Method JSONObject JSONObject.getJSONObject(String)>
	//   33   65:putfield        #153 <Field JSONObject arguments>
		if(((AppLinkData) (obj)).arguments.has("ref"))
	//*  34   68:aload_1         
	//*  35   69:getfield        #153 <Field JSONObject arguments>
	//*  36   72:ldc1            #61  <String "ref">
	//*  37   74:invokevirtual   #186 <Method boolean JSONObject.has(String)>
	//*  38   77:ifeq            96
		{
			obj.ref = ((AppLinkData) (obj)).arguments.getString("ref");
	//   39   80:aload_1         
	//   40   81:aload_1         
	//   41   82:getfield        #153 <Field JSONObject arguments>
	//   42   85:ldc1            #61  <String "ref">
	//   43   87:invokevirtual   #168 <Method String JSONObject.getString(String)>
	//   44   90:putfield        #158 <Field String ref>
			break MISSING_BLOCK_LABEL_137;
	//   45   93:goto            137
		}
		if(((AppLinkData) (obj)).arguments.has("referer_data"))
	//*  46   96:aload_1         
	//*  47   97:getfield        #153 <Field JSONObject arguments>
	//*  48  100:ldc1            #28  <String "referer_data">
	//*  49  102:invokevirtual   #186 <Method boolean JSONObject.has(String)>
	//*  50  105:ifeq            137
		{
			s = ((String) (((AppLinkData) (obj)).arguments.getJSONObject("referer_data")));
	//   51  108:aload_1         
	//   52  109:getfield        #153 <Field JSONObject arguments>
	//   53  112:ldc1            #28  <String "referer_data">
	//   54  114:invokevirtual   #172 <Method JSONObject JSONObject.getJSONObject(String)>
	//   55  117:astore_0        
			if(((JSONObject) (s)).has("fb_ref"))
	//*  56  118:aload_0         
	//*  57  119:ldc1            #67  <String "fb_ref">
	//*  58  121:invokevirtual   #186 <Method boolean JSONObject.has(String)>
	//*  59  124:ifeq            137
				obj.ref = ((JSONObject) (s)).getString("fb_ref");
	//   60  127:aload_1         
	//   61  128:aload_0         
	//   62  129:ldc1            #67  <String "fb_ref">
	//   63  131:invokevirtual   #168 <Method String JSONObject.getString(String)>
	//   64  134:putfield        #158 <Field String ref>
		}
		if(((AppLinkData) (obj)).arguments.has("target_url"))
	//*  65  137:aload_1         
	//*  66  138:getfield        #153 <Field JSONObject arguments>
	//*  67  141:ldc1            #64  <String "target_url">
	//*  68  143:invokevirtual   #186 <Method boolean JSONObject.has(String)>
	//*  69  146:ifeq            165
			obj.targetUri = Uri.parse(((AppLinkData) (obj)).arguments.getString("target_url"));
	//   70  149:aload_1         
	//   71  150:aload_1         
	//   72  151:getfield        #153 <Field JSONObject arguments>
	//   73  154:ldc1            #64  <String "target_url">
	//   74  156:invokevirtual   #168 <Method String JSONObject.getString(String)>
	//   75  159:invokestatic    #149 <Method Uri Uri.parse(String)>
	//   76  162:putfield        #138 <Field Uri targetUri>
		obj.argumentBundle = toBundle(((AppLinkData) (obj)).arguments);
	//   77  165:aload_1         
	//   78  166:aload_1         
	//   79  167:getfield        #153 <Field JSONObject arguments>
	//   80  170:invokestatic    #190 <Method Bundle toBundle(JSONObject)>
	//   81  173:putfield        #151 <Field Bundle argumentBundle>
		return ((AppLinkData) (obj));
	//   82  176:aload_1         
	//   83  177:areturn         
		s;
	//   84  178:astore_0        
		Log.d(TAG, "Unable to parse AppLink JSON", ((Throwable) (s)));
	//   85  179:getstatic       #84  <Field String TAG>
	//   86  182:ldc1            #192 <String "Unable to parse AppLink JSON">
	//   87  184:aload_0         
	//   88  185:invokestatic    #198 <Method int Log.d(String, String, Throwable)>
	//   89  188:pop             
		return null;
	//   90  189:aconst_null     
	//   91  190:areturn         
		s;
	//   92  191:astore_0        
		Log.d(TAG, "Unable to parse AppLink JSON", ((Throwable) (s)));
	//   93  192:getstatic       #84  <Field String TAG>
	//   94  195:ldc1            #192 <String "Unable to parse AppLink JSON">
	//   95  197:aload_0         
	//   96  198:invokestatic    #198 <Method int Log.d(String, String, Throwable)>
	//   97  201:pop             
		return null;
	//   98  202:aconst_null     
	//   99  203:areturn         
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
	//    6   10:invokespecial   #136 <Method void AppLinkData()>
	//    7   13:astore_1        
			applinkdata.targetUri = uri;
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:putfield        #138 <Field Uri targetUri>
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
	//    3    3:invokestatic    #202 <Method void fetchDeferredAppLinkData(Context, String, AppLinkData$CompletionHandler)>
	//    4    6:return          
	}

	public static void fetchDeferredAppLinkData(Context context, String s, CompletionHandler completionhandler)
	{
		Validate.notNull(((Object) (context)), "context");
	//    0    0:aload_0         
	//    1    1:ldc1            #204 <String "context">
	//    2    3:invokestatic    #103 <Method void Validate.notNull(Object, String)>
		Validate.notNull(((Object) (completionhandler)), "completionHandler");
	//    3    6:aload_2         
	//    4    7:ldc1            #206 <String "completionHandler">
	//    5    9:invokestatic    #103 <Method void Validate.notNull(Object, String)>
		String s1 = s;
	//    6   12:aload_1         
	//    7   13:astore_3        
		if(s == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       23
			s1 = Utility.getMetadataApplicationId(context);
	//   10   18:aload_0         
	//   11   19:invokestatic    #212 <Method String Utility.getMetadataApplicationId(Context)>
	//   12   22:astore_3        
		Validate.notNull(((Object) (s1)), "applicationId");
	//   13   23:aload_3         
	//   14   24:ldc1            #214 <String "applicationId">
	//   15   26:invokestatic    #103 <Method void Validate.notNull(Object, String)>
		context = context.getApplicationContext();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #220 <Method Context Context.getApplicationContext()>
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
	//   19   34:invokestatic    #226 <Method Executor FacebookSdk.getExecutor()>
	//   20   37:new             #6   <Class AppLinkData$1>
	//   21   40:dup             
	//   22   41:aload_0         
	//   23   42:aload_3         
	//   24   43:aload_2         
	//   25   44:invokespecial   #228 <Method void AppLinkData$1(Context, String, AppLinkData$CompletionHandler)>
	//   26   47:invokeinterface #234 <Method void Executor.execute(Runnable)>
	//   27   52:return          
	}

	private static void fetchDeferredAppLinkFromServer(Context context, String s, CompletionHandler completionhandler)
	{
		Object obj1 = ((Object) (new JSONObject()));
	//    0    0:new             #164 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #237 <Method void JSONObject()>
	//    3    7:astore          6
		long l;
		Object obj;
		Object obj2;
		String s1;
		try
		{
			((JSONObject) (obj1)).put("event", "DEFERRED_APP_LINK");
	//    4    9:aload           6
	//    5   11:ldc1            #239 <String "event">
	//    6   13:ldc1            #52  <String "DEFERRED_APP_LINK">
	//    7   15:invokevirtual   #243 <Method JSONObject JSONObject.put(String, Object)>
	//    8   18:pop             
			Utility.setAppEventAttributionParameters(((JSONObject) (obj1)), AttributionIdentifiers.getAttributionIdentifiers(context), AppEventsLogger.getAnonymousAppDeviceGUID(context), FacebookSdk.getLimitEventAndDataUsage(context));
	//    9   19:aload           6
	//   10   21:aload_0         
	//   11   22:invokestatic    #249 <Method AttributionIdentifiers AttributionIdentifiers.getAttributionIdentifiers(Context)>
	//   12   25:aload_0         
	//   13   26:invokestatic    #254 <Method String AppEventsLogger.getAnonymousAppDeviceGUID(Context)>
	//   14   29:aload_0         
	//   15   30:invokestatic    #258 <Method boolean FacebookSdk.getLimitEventAndDataUsage(Context)>
	//   16   33:invokestatic    #262 <Method void Utility.setAppEventAttributionParameters(JSONObject, AttributionIdentifiers, String, boolean)>
			((JSONObject) (obj1)).put("application_package_name", ((Object) (context.getPackageName())));
	//   17   36:aload           6
	//   18   38:ldc2            #264 <String "application_package_name">
	//   19   41:aload_0         
	//   20   42:invokevirtual   #267 <Method String Context.getPackageName()>
	//   21   45:invokevirtual   #243 <Method JSONObject JSONObject.put(String, Object)>
	//   22   48:pop             
		}
	//*  23   49:ldc1            #55  <String "%s/activities">
	//*  24   51:iconst_1        
	//*  25   52:anewarray       Object[]
	//*  26   55:dup             
	//*  27   56:iconst_0        
	//*  28   57:aload_1         
	//*  29   58:aastore         
	//*  30   59:invokestatic    #271 <Method String String.format(String, Object[])>
	//*  31   62:astore_0        
	//*  32   63:aconst_null     
	//*  33   64:astore          5
	//*  34   66:aconst_null     
	//*  35   67:astore_1        
	//*  36   68:aconst_null     
	//*  37   69:aload_0         
	//*  38   70:aload           6
	//*  39   72:aconst_null     
	//*  40   73:invokestatic    #277 <Method GraphRequest GraphRequest.newPostRequest(com.facebook.AccessToken, String, JSONObject, com.facebook.GraphRequest$Callback)>
	//*  41   76:invokevirtual   #281 <Method GraphResponse GraphRequest.executeAndWait()>
	//*  42   79:invokevirtual   #286 <Method JSONObject GraphResponse.getJSONObject()>
	//*  43   82:astore          7
	//*  44   84:aload           5
	//*  45   86:astore_0        
	//*  46   87:aload           7
	//*  47   89:ifnull          331
	//*  48   92:aload           7
	//*  49   94:ldc1            #43  <String "applink_args">
	//*  50   96:invokevirtual   #289 <Method String JSONObject.optString(String)>
	//*  51   99:astore          8
	//*  52  101:aload           7
	//*  53  103:ldc1            #49  <String "click_time">
	//*  54  105:ldc2w           #290 <Long -1L>
	//*  55  108:invokevirtual   #295 <Method long JSONObject.optLong(String, long)>
	//*  56  111:lstore_3        
	//*  57  112:aload           7
	//*  58  114:ldc1            #46  <String "applink_class">
	//*  59  116:invokevirtual   #289 <Method String JSONObject.optString(String)>
	//*  60  119:astore          6
	//*  61  121:aload           7
	//*  62  123:ldc1            #58  <String "applink_url">
	//*  63  125:invokevirtual   #289 <Method String JSONObject.optString(String)>
	//*  64  128:astore          7
	//*  65  130:aload           5
	//*  66  132:astore_0        
	//*  67  133:aload           8
	//*  68  135:invokestatic    #301 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  69  138:ifne            331
	//*  70  141:aload           8
	//*  71  143:invokestatic    #123 <Method AppLinkData createFromJson(String)>
	//*  72  146:astore_0        
	//*  73  147:lload_3         
	//*  74  148:ldc2w           #290 <Long -1L>
	//*  75  151:lcmp            
	//*  76  152:ifeq            209
	//*  77  155:aload_0         
	//*  78  156:getfield        #153 <Field JSONObject arguments>
	//*  79  159:ifnull          173
	//*  80  162:aload_0         
	//*  81  163:getfield        #153 <Field JSONObject arguments>
	//*  82  166:ldc1            #31  <String "com.facebook.platform.APPLINK_TAP_TIME_UTC">
	//*  83  168:lload_3         
	//*  84  169:invokevirtual   #304 <Method JSONObject JSONObject.put(String, long)>
	//*  85  172:pop             
	//*  86  173:aload_0         
	//*  87  174:getfield        #151 <Field Bundle argumentBundle>
	//*  88  177:ifnull          209
	//*  89  180:aload_0         
	//*  90  181:getfield        #151 <Field Bundle argumentBundle>
	//*  91  184:ldc1            #31  <String "com.facebook.platform.APPLINK_TAP_TIME_UTC">
	//*  92  186:lload_3         
	//*  93  187:invokestatic    #310 <Method String Long.toString(long)>
	//*  94  190:invokevirtual   #314 <Method void Bundle.putString(String, String)>
	//*  95  193:goto            209
	//*  96  196:goto            322
	//*  97  199:getstatic       #84  <Field String TAG>
	//*  98  202:ldc2            #316 <String "Unable to put tap time in AppLinkData.arguments">
	//*  99  205:invokestatic    #319 <Method int Log.d(String, String)>
	//* 100  208:pop             
	//* 101  209:aload           6
	//* 102  211:ifnull          264
	//* 103  214:aload_0         
	//* 104  215:getfield        #153 <Field JSONObject arguments>
	//* 105  218:ifnull          233
	//* 106  221:aload_0         
	//* 107  222:getfield        #153 <Field JSONObject arguments>
	//* 108  225:ldc1            #22  <String "com.facebook.platform.APPLINK_NATIVE_CLASS">
	//* 109  227:aload           6
	//* 110  229:invokevirtual   #243 <Method JSONObject JSONObject.put(String, Object)>
	//* 111  232:pop             
	//* 112  233:aload_0         
	//* 113  234:getfield        #151 <Field Bundle argumentBundle>
	//* 114  237:ifnull          264
	//* 115  240:aload_0         
	//* 116  241:getfield        #151 <Field Bundle argumentBundle>
	//* 117  244:ldc1            #22  <String "com.facebook.platform.APPLINK_NATIVE_CLASS">
	//* 118  246:aload           6
	//* 119  248:invokevirtual   #314 <Method void Bundle.putString(String, String)>
	//* 120  251:goto            264
	//* 121  254:getstatic       #84  <Field String TAG>
	//* 122  257:ldc2            #316 <String "Unable to put tap time in AppLinkData.arguments">
	//* 123  260:invokestatic    #319 <Method int Log.d(String, String)>
	//* 124  263:pop             
	//* 125  264:aload           7
	//* 126  266:ifnull          319
	//* 127  269:aload_0         
	//* 128  270:getfield        #153 <Field JSONObject arguments>
	//* 129  273:ifnull          288
	//* 130  276:aload_0         
	//* 131  277:getfield        #153 <Field JSONObject arguments>
	//* 132  280:ldc1            #25  <String "com.facebook.platform.APPLINK_NATIVE_URL">
	//* 133  282:aload           7
	//* 134  284:invokevirtual   #243 <Method JSONObject JSONObject.put(String, Object)>
	//* 135  287:pop             
	//* 136  288:aload_0         
	//* 137  289:getfield        #151 <Field Bundle argumentBundle>
	//* 138  292:ifnull          319
	//* 139  295:aload_0         
	//* 140  296:getfield        #151 <Field Bundle argumentBundle>
	//* 141  299:ldc1            #25  <String "com.facebook.platform.APPLINK_NATIVE_URL">
	//* 142  301:aload           7
	//* 143  303:invokevirtual   #314 <Method void Bundle.putString(String, String)>
	//* 144  306:goto            319
	//* 145  309:getstatic       #84  <Field String TAG>
	//* 146  312:ldc2            #316 <String "Unable to put tap time in AppLinkData.arguments">
	//* 147  315:invokestatic    #319 <Method int Log.d(String, String)>
	//* 148  318:pop             
	//* 149  319:goto            331
	//* 150  322:getstatic       #84  <Field String TAG>
	//* 151  325:ldc2            #321 <String "Unable to fetch deferred applink from server">
	//* 152  328:invokestatic    #324 <Method void Utility.logd(String, String)>
	//* 153  331:aload_2         
	//* 154  332:aload_0         
	//* 155  333:invokeinterface #328 <Method void AppLinkData$CompletionHandler.onDeferredAppLinkDataFetched(AppLinkData)>
	//* 156  338:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 157  339:astore_0        
		{
			throw new FacebookException("An error occurred while preparing deferred app link", ((Throwable) (context)));
	//  158  340:new             #162 <Class FacebookException>
	//  159  343:dup             
	//  160  344:ldc2            #330 <String "An error occurred while preparing deferred app link">
	//  161  347:aload_0         
	//  162  348:invokespecial   #333 <Method void FacebookException(String, Throwable)>
	//  163  351:athrow          
		}
		context = ((Context) (String.format("%s/activities", new Object[] {
			s
		})));
		obj = null;
		s = null;
		obj2 = ((Object) (GraphRequest.newPostRequest(((com.facebook.AccessToken) (null)), ((String) (context)), ((JSONObject) (obj1)), ((com.facebook.GraphRequest.Callback) (null))).executeAndWait().getJSONObject()));
		context = ((Context) (obj));
		if(obj2 == null) goto _L2; else goto _L1
_L1:
		s1 = ((JSONObject) (obj2)).optString("applink_args");
		l = ((JSONObject) (obj2)).optLong("click_time", -1L);
		obj1 = ((Object) (((JSONObject) (obj2)).optString("applink_class")));
		obj2 = ((Object) (((JSONObject) (obj2)).optString("applink_url")));
		context = ((Context) (obj));
		if(TextUtils.isEmpty(((CharSequence) (s1)))) goto _L2; else goto _L3
_L3:
		context = ((Context) (createFromJson(s1)));
		if(l == -1L) goto _L5; else goto _L4
_L4:
		if(((AppLinkData) (context)).arguments != null)
			((AppLinkData) (context)).arguments.put("com.facebook.platform.APPLINK_TAP_TIME_UTC", l);
		if(((AppLinkData) (context)).argumentBundle != null)
			((AppLinkData) (context)).argumentBundle.putString("com.facebook.platform.APPLINK_TAP_TIME_UTC", Long.toString(l));
		  goto _L5
_L10:
		Log.d(TAG, "Unable to put tap time in AppLinkData.arguments");
_L5:
		if(obj1 == null) goto _L7; else goto _L6
_L6:
		if(((AppLinkData) (context)).arguments != null)
			((AppLinkData) (context)).arguments.put("com.facebook.platform.APPLINK_NATIVE_CLASS", obj1);
		if(((AppLinkData) (context)).argumentBundle != null)
			((AppLinkData) (context)).argumentBundle.putString("com.facebook.platform.APPLINK_NATIVE_CLASS", ((String) (obj1)));
		  goto _L7
_L11:
		Log.d(TAG, "Unable to put tap time in AppLinkData.arguments");
_L7:
		if(obj2 == null) goto _L2; else goto _L8
_L8:
		if(((AppLinkData) (context)).arguments != null)
			((AppLinkData) (context)).arguments.put("com.facebook.platform.APPLINK_NATIVE_URL", obj2);
		if(((AppLinkData) (context)).argumentBundle != null)
			((AppLinkData) (context)).argumentBundle.putString("com.facebook.platform.APPLINK_NATIVE_URL", ((String) (obj2)));
		  goto _L2
_L12:
		Log.d(TAG, "Unable to put tap time in AppLinkData.arguments");
		  goto _L2
_L9:
		Utility.logd(TAG, "Unable to fetch deferred applink from server");
_L2:
		completionhandler.onDeferredAppLinkDataFetched(((AppLinkData) (context)));
		return;
		context;
	//  164  352:astore_0        
		context = ((Context) (s));
	//  165  353:aload_1         
	//  166  354:astore_0        
		  goto _L9
	//* 167  355:goto            322
		s;
	//  168  358:astore_1        
		  goto _L10
	//* 169  359:goto            199
		s;
	//  170  362:astore_1        
		  goto _L9
	//* 171  363:goto            196
		s;
	//  172  366:astore_1        
		  goto _L11
	//* 173  367:goto            254
		s;
	//  174  370:astore_1        
		  goto _L12
	//* 175  371:goto            309
	}

	private static Bundle toBundle(JSONObject jsonobject)
		throws JSONException
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #140 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #334 <Method void Bundle()>
	//    3    7:astore          4
		for(Iterator iterator = jsonobject.keys(); iterator.hasNext();)
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #338 <Method Iterator JSONObject.keys()>
	//*   6   13:astore          5
	//*   7   15:aload           5
	//*   8   17:invokeinterface #344 <Method boolean Iterator.hasNext()>
	//*   9   22:ifeq            268
		{
			String s = (String)iterator.next();
	//   10   25:aload           5
	//   11   27:invokeinterface #348 <Method Object Iterator.next()>
	//   12   32:checkcast       #176 <Class String>
	//   13   35:astore          6
			Object obj = jsonobject.get(s);
	//   14   37:aload_0         
	//   15   38:aload           6
	//   16   40:invokevirtual   #352 <Method Object JSONObject.get(String)>
	//   17   43:astore          7
			if(obj instanceof JSONObject)
	//*  18   45:aload           7
	//*  19   47:instanceof      #164 <Class JSONObject>
	//*  20   50:ifeq            71
				bundle.putBundle(s, toBundle((JSONObject)obj));
	//   21   53:aload           4
	//   22   55:aload           6
	//   23   57:aload           7
	//   24   59:checkcast       #164 <Class JSONObject>
	//   25   62:invokestatic    #190 <Method Bundle toBundle(JSONObject)>
	//   26   65:invokevirtual   #356 <Method void Bundle.putBundle(String, Bundle)>
			else
	//*  27   68:goto            15
			if(obj instanceof JSONArray)
	//*  28   71:aload           7
	//*  29   73:instanceof      #358 <Class JSONArray>
	//*  30   76:ifeq            253
			{
				obj = ((Object) ((JSONArray)obj));
	//   31   79:aload           7
	//   32   81:checkcast       #358 <Class JSONArray>
	//   33   84:astore          7
				int k = ((JSONArray) (obj)).length();
	//   34   86:aload           7
	//   35   88:invokevirtual   #362 <Method int JSONArray.length()>
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
	//   47  108:invokevirtual   #366 <Method void Bundle.putStringArray(String, String[])>
				} else
	//*  48  111:goto            15
				{
					Object aobj[] = ((Object []) (((JSONArray) (obj)).get(0)));
	//   49  114:aload           7
	//   50  116:iconst_0        
	//   51  117:invokevirtual   #369 <Method Object JSONArray.get(int)>
	//   52  120:astore          8
					if(aobj instanceof JSONObject)
	//*  53  122:aload           8
	//*  54  124:instanceof      #164 <Class JSONObject>
	//*  55  127:ifeq            181
					{
						aobj = ((Object []) (new Bundle[((JSONArray) (obj)).length()]));
	//   56  130:aload           7
	//   57  132:invokevirtual   #362 <Method int JSONArray.length()>
	//   58  135:anewarray       Bundle[]
	//   59  138:astore          8
						for(; i < ((JSONArray) (obj)).length(); i++)
	//*  60  140:iload_1         
	//*  61  141:aload           7
	//*  62  143:invokevirtual   #362 <Method int JSONArray.length()>
	//*  63  146:icmpge          169
							aobj[i] = ((/*<invalid signature>*/java.lang.Object) (toBundle(((JSONArray) (obj)).getJSONObject(i))));
	//   64  149:aload           8
	//   65  151:iload_1         
	//   66  152:aload           7
	//   67  154:iload_1         
	//   68  155:invokevirtual   #372 <Method JSONObject JSONArray.getJSONObject(int)>
	//   69  158:invokestatic    #190 <Method Bundle toBundle(JSONObject)>
	//   70  161:aastore         

	//   71  162:iload_1         
	//   72  163:iconst_1        
	//   73  164:iadd            
	//   74  165:istore_1        
	//*  75  166:goto            140
						bundle.putParcelableArray(s, ((android.os.Parcelable []) (aobj)));
	//   76  169:aload           4
	//   77  171:aload           6
	//   78  173:aload           8
	//   79  175:invokevirtual   #376 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
					} else
	//*  80  178:goto            15
					{
						if(aobj instanceof JSONArray)
	//*  81  181:aload           8
	//*  82  183:instanceof      #358 <Class JSONArray>
	//*  83  186:ifeq            200
							throw new FacebookException("Nested arrays are not supported.");
	//   84  189:new             #162 <Class FacebookException>
	//   85  192:dup             
	//   86  193:ldc2            #378 <String "Nested arrays are not supported.">
	//   87  196:invokespecial   #379 <Method void FacebookException(String)>
	//   88  199:athrow          
						aobj = ((Object []) (new String[((JSONArray) (obj)).length()]));
	//   89  200:aload           7
	//   90  202:invokevirtual   #362 <Method int JSONArray.length()>
	//   91  205:anewarray       String[]
	//   92  208:astore          8
						for(int j = ((int) (flag)); j < ((JSONArray) (obj)).length(); j++)
	//*  93  210:iload_2         
	//*  94  211:istore_1        
	//*  95  212:iload_1         
	//*  96  213:aload           7
	//*  97  215:invokevirtual   #362 <Method int JSONArray.length()>
	//*  98  218:icmpge          241
							aobj[j] = ((JSONArray) (obj)).get(j).toString();
	//   99  221:aload           8
	//  100  223:iload_1         
	//  101  224:aload           7
	//  102  226:iload_1         
	//  103  227:invokevirtual   #369 <Method Object JSONArray.get(int)>
	//  104  230:invokevirtual   #381 <Method String Object.toString()>
	//  105  233:aastore         

	//  106  234:iload_1         
	//  107  235:iconst_1        
	//  108  236:iadd            
	//  109  237:istore_1        
	//* 110  238:goto            212
						bundle.putStringArray(s, ((String []) (aobj)));
	//  111  241:aload           4
	//  112  243:aload           6
	//  113  245:aload           8
	//  114  247:invokevirtual   #366 <Method void Bundle.putStringArray(String, String[])>
					}
				}
			} else
	//* 115  250:goto            15
			{
				bundle.putString(s, obj.toString());
	//  116  253:aload           4
	//  117  255:aload           6
	//  118  257:aload           7
	//  119  259:invokevirtual   #381 <Method String Object.toString()>
	//  120  262:invokevirtual   #314 <Method void Bundle.putString(String, String)>
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
	//    1    1:getfield        #151 <Field Bundle argumentBundle>
	//    2    4:areturn         
	}

	public String getRef()
	{
		return ref;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field String ref>
	//    2    4:areturn         
	}

	public Bundle getRefererData()
	{
		if(argumentBundle != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #151 <Field Bundle argumentBundle>
	//*   2    4:ifnull          17
			return argumentBundle.getBundle("referer_data");
	//    3    7:aload_0         
	//    4    8:getfield        #151 <Field Bundle argumentBundle>
	//    5   11:ldc1            #28  <String "referer_data">
	//    6   13:invokevirtual   #156 <Method Bundle Bundle.getBundle(String)>
	//    7   16:areturn         
		else
			return null;
	//    8   17:aconst_null     
	//    9   18:areturn         
	}

	public Uri getTargetUri()
	{
		return targetUri;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field Uri targetUri>
	//    2    4:areturn         
	}

	private static final String APPLINK_BRIDGE_ARGS_KEY = "bridge_args";
	private static final String APPLINK_METHOD_ARGS_KEY = "method_args";
	private static final String APPLINK_VERSION_KEY = "version";
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
	private static final String METHOD_ARGS_REF_KEY = "ref";
	private static final String METHOD_ARGS_TARGET_URL_KEY = "target_url";
	private static final String REFERER_DATA_REF_KEY = "fb_ref";
	private static final String TAG = ((Class) (com/facebook/applinks/AppLinkData)).getCanonicalName();
	private Bundle argumentBundle;
	private JSONObject arguments;
	private String ref;
	private Uri targetUri;

	static 
	{
	//    0    0:ldc1            #2   <Class AppLinkData>
	//    1    2:invokevirtual   #82  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #84  <Field String TAG>
	//*   3    8:return          
	}


/*
	static void access$000(Context context, String s, CompletionHandler completionhandler)
	{
		fetchDeferredAppLinkFromServer(context, s, completionhandler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #93  <Method void fetchDeferredAppLinkFromServer(Context, String, AppLinkData$CompletionHandler)>
		return;
	//    4    6:return          
	}

*/
}
