// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.applinks;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.*;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.*;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
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
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:return          
	}

	private static AppLinkData createFromJson(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		JSONObject jsonobject = JSONObjectInstrumentation.init(s);
	//    4    6:aload_0         
	//    5    7:invokestatic    #51  <Method JSONObject JSONObjectInstrumentation.init(String)>
	//    6   10:astore_1        
		s = jsonobject.getString("version");
	//    7   11:aload_1         
	//    8   12:ldc1            #53  <String "version">
	//    9   14:invokevirtual   #59  <Method String JSONObject.getString(String)>
	//   10   17:astore_0        
		if(!jsonobject.getJSONObject("bridge_args").getString("method").equals("applink") || !s.equals("2"))
			break MISSING_BLOCK_LABEL_255;
	//   11   18:aload_1         
	//   12   19:ldc1            #61  <String "bridge_args">
	//   13   21:invokevirtual   #64  <Method JSONObject JSONObject.getJSONObject(String)>
	//   14   24:ldc1            #66  <String "method">
	//   15   26:invokevirtual   #59  <Method String JSONObject.getString(String)>
	//   16   29:ldc1            #68  <String "applink">
	//   17   31:invokevirtual   #74  <Method boolean String.equals(Object)>
	//   18   34:ifeq            255
	//   19   37:aload_0         
	//   20   38:ldc1            #76  <String "2">
	//   21   40:invokevirtual   #74  <Method boolean String.equals(Object)>
	//   22   43:ifeq            255
		s = ((String) (new AppLinkData()));
	//   23   46:new             #2   <Class AppLinkData>
	//   24   49:dup             
	//   25   50:invokespecial   #77  <Method void AppLinkData()>
	//   26   53:astore_0        
		s.arguments = jsonobject.getJSONObject("method_args");
	//   27   54:aload_0         
	//   28   55:aload_1         
	//   29   56:ldc1            #79  <String "method_args">
	//   30   58:invokevirtual   #64  <Method JSONObject JSONObject.getJSONObject(String)>
	//   31   61:putfield        #81  <Field JSONObject arguments>
		if(((AppLinkData) (s)).arguments.has("ref"))
	//*  32   64:aload_0         
	//*  33   65:getfield        #81  <Field JSONObject arguments>
	//*  34   68:ldc1            #82  <String "ref">
	//*  35   70:invokevirtual   #86  <Method boolean JSONObject.has(String)>
	//*  36   73:ifeq            92
		{
			s.ref = ((AppLinkData) (s)).arguments.getString("ref");
	//   37   76:aload_0         
	//   38   77:aload_0         
	//   39   78:getfield        #81  <Field JSONObject arguments>
	//   40   81:ldc1            #82  <String "ref">
	//   41   83:invokevirtual   #59  <Method String JSONObject.getString(String)>
	//   42   86:putfield        #88  <Field String ref>
			break MISSING_BLOCK_LABEL_133;
	//   43   89:goto            133
		}
		if(((AppLinkData) (s)).arguments.has("referer_data"))
	//*  44   92:aload_0         
	//*  45   93:getfield        #81  <Field JSONObject arguments>
	//*  46   96:ldc1            #90  <String "referer_data">
	//*  47   98:invokevirtual   #86  <Method boolean JSONObject.has(String)>
	//*  48  101:ifeq            133
		{
			JSONObject jsonobject1 = ((AppLinkData) (s)).arguments.getJSONObject("referer_data");
	//   49  104:aload_0         
	//   50  105:getfield        #81  <Field JSONObject arguments>
	//   51  108:ldc1            #90  <String "referer_data">
	//   52  110:invokevirtual   #64  <Method JSONObject JSONObject.getJSONObject(String)>
	//   53  113:astore_1        
			if(jsonobject1.has("fb_ref"))
	//*  54  114:aload_1         
	//*  55  115:ldc1            #92  <String "fb_ref">
	//*  56  117:invokevirtual   #86  <Method boolean JSONObject.has(String)>
	//*  57  120:ifeq            133
				s.ref = jsonobject1.getString("fb_ref");
	//   58  123:aload_0         
	//   59  124:aload_1         
	//   60  125:ldc1            #92  <String "fb_ref">
	//   61  127:invokevirtual   #59  <Method String JSONObject.getString(String)>
	//   62  130:putfield        #88  <Field String ref>
		}
		if(((AppLinkData) (s)).arguments.has("target_url"))
	//*  63  133:aload_0         
	//*  64  134:getfield        #81  <Field JSONObject arguments>
	//*  65  137:ldc1            #94  <String "target_url">
	//*  66  139:invokevirtual   #86  <Method boolean JSONObject.has(String)>
	//*  67  142:ifeq            161
			s.targetUri = Uri.parse(((AppLinkData) (s)).arguments.getString("target_url"));
	//   68  145:aload_0         
	//   69  146:aload_0         
	//   70  147:getfield        #81  <Field JSONObject arguments>
	//   71  150:ldc1            #94  <String "target_url">
	//   72  152:invokevirtual   #59  <Method String JSONObject.getString(String)>
	//   73  155:invokestatic    #100 <Method Uri Uri.parse(String)>
	//   74  158:putfield        #102 <Field Uri targetUri>
		if(((AppLinkData) (s)).arguments.has("extras"))
	//*  75  161:aload_0         
	//*  76  162:getfield        #81  <Field JSONObject arguments>
	//*  77  165:ldc1            #104 <String "extras">
	//*  78  167:invokevirtual   #86  <Method boolean JSONObject.has(String)>
	//*  79  170:ifeq            218
		{
			JSONObject jsonobject2 = ((AppLinkData) (s)).arguments.getJSONObject("extras");
	//   80  173:aload_0         
	//   81  174:getfield        #81  <Field JSONObject arguments>
	//   82  177:ldc1            #104 <String "extras">
	//   83  179:invokevirtual   #64  <Method JSONObject JSONObject.getJSONObject(String)>
	//   84  182:astore_1        
			if(jsonobject2.has("deeplink_context"))
	//*  85  183:aload_1         
	//*  86  184:ldc1            #106 <String "deeplink_context">
	//*  87  186:invokevirtual   #86  <Method boolean JSONObject.has(String)>
	//*  88  189:ifeq            218
			{
				jsonobject2 = jsonobject2.getJSONObject("deeplink_context");
	//   89  192:aload_1         
	//   90  193:ldc1            #106 <String "deeplink_context">
	//   91  195:invokevirtual   #64  <Method JSONObject JSONObject.getJSONObject(String)>
	//   92  198:astore_1        
				if(jsonobject2.has("promo_code"))
	//*  93  199:aload_1         
	//*  94  200:ldc1            #108 <String "promo_code">
	//*  95  202:invokevirtual   #86  <Method boolean JSONObject.has(String)>
	//*  96  205:ifeq            218
					s.promotionCode = jsonobject2.getString("promo_code");
	//   97  208:aload_0         
	//   98  209:aload_1         
	//   99  210:ldc1            #108 <String "promo_code">
	//  100  212:invokevirtual   #59  <Method String JSONObject.getString(String)>
	//  101  215:putfield        #110 <Field String promotionCode>
			}
		}
		s.argumentBundle = toBundle(((AppLinkData) (s)).arguments);
	//  102  218:aload_0         
	//  103  219:aload_0         
	//  104  220:getfield        #81  <Field JSONObject arguments>
	//  105  223:invokestatic    #114 <Method Bundle toBundle(JSONObject)>
	//  106  226:putfield        #116 <Field Bundle argumentBundle>
		return ((AppLinkData) (s));
	//  107  229:aload_0         
	//  108  230:areturn         
		s;
	//  109  231:astore_0        
		Log.d(TAG, "Unable to parse AppLink JSON", ((Throwable) (s)));
	//  110  232:getstatic       #30  <Field String TAG>
	//  111  235:ldc1            #118 <String "Unable to parse AppLink JSON">
	//  112  237:aload_0         
	//  113  238:invokestatic    #124 <Method int Log.d(String, String, Throwable)>
	//  114  241:pop             
		return null;
	//  115  242:aconst_null     
	//  116  243:areturn         
		s;
	//  117  244:astore_0        
		Log.d(TAG, "Unable to parse AppLink JSON", ((Throwable) (s)));
	//  118  245:getstatic       #30  <Field String TAG>
	//  119  248:ldc1            #118 <String "Unable to parse AppLink JSON">
	//  120  250:aload_0         
	//  121  251:invokestatic    #124 <Method int Log.d(String, String, Throwable)>
	//  122  254:pop             
		return null;
	//  123  255:aconst_null     
	//  124  256:areturn         
	}

	public static void fetchDeferredAppLinkData(Context context, CompletionHandler completionhandler)
	{
		fetchDeferredAppLinkData(context, ((String) (null)), completionhandler);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokestatic    #128 <Method void fetchDeferredAppLinkData(Context, String, AppLinkData$CompletionHandler)>
	//    4    6:return          
	}

	public static void fetchDeferredAppLinkData(Context context, String s, CompletionHandler completionhandler)
	{
		Validate.notNull(((Object) (context)), "context");
	//    0    0:aload_0         
	//    1    1:ldc1            #130 <String "context">
	//    2    3:invokestatic    #136 <Method void Validate.notNull(Object, String)>
		Validate.notNull(((Object) (completionhandler)), "completionHandler");
	//    3    6:aload_2         
	//    4    7:ldc1            #138 <String "completionHandler">
	//    5    9:invokestatic    #136 <Method void Validate.notNull(Object, String)>
		String s1 = s;
	//    6   12:aload_1         
	//    7   13:astore_3        
		if(s == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       23
			s1 = Utility.getMetadataApplicationId(context);
	//   10   18:aload_0         
	//   11   19:invokestatic    #144 <Method String Utility.getMetadataApplicationId(Context)>
	//   12   22:astore_3        
		Validate.notNull(((Object) (s1)), "applicationId");
	//   13   23:aload_3         
	//   14   24:ldc1            #146 <String "applicationId">
	//   15   26:invokestatic    #136 <Method void Validate.notNull(Object, String)>
		context = context.getApplicationContext();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #152 <Method Context Context.getApplicationContext()>
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
	//   19   34:invokestatic    #158 <Method Executor FacebookSdk.getExecutor()>
	//   20   37:new             #6   <Class AppLinkData$1>
	//   21   40:dup             
	//   22   41:aload_0         
	//   23   42:aload_3         
	//   24   43:aload_2         
	//   25   44:invokespecial   #160 <Method void AppLinkData$1(Context, String, AppLinkData$CompletionHandler)>
	//   26   47:invokeinterface #166 <Method void Executor.execute(Runnable)>
	//   27   52:return          
	}

	private static void fetchDeferredAppLinkFromServer(Context context, String s, CompletionHandler completionhandler)
	{
		Object obj1 = ((Object) (new JSONObject()));
	//    0    0:new             #55  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #169 <Method void JSONObject()>
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
	//    5   11:ldc1            #171 <String "event">
	//    6   13:ldc1            #173 <String "DEFERRED_APP_LINK">
	//    7   15:invokevirtual   #177 <Method JSONObject JSONObject.put(String, Object)>
	//    8   18:pop             
			Utility.setAppEventAttributionParameters(((JSONObject) (obj1)), AttributionIdentifiers.getAttributionIdentifiers(context), AppEventsLogger.getAnonymousAppDeviceGUID(context), FacebookSdk.getLimitEventAndDataUsage(context));
	//    9   19:aload           7
	//   10   21:aload_0         
	//   11   22:invokestatic    #183 <Method AttributionIdentifiers AttributionIdentifiers.getAttributionIdentifiers(Context)>
	//   12   25:aload_0         
	//   13   26:invokestatic    #188 <Method String AppEventsLogger.getAnonymousAppDeviceGUID(Context)>
	//   14   29:aload_0         
	//   15   30:invokestatic    #192 <Method boolean FacebookSdk.getLimitEventAndDataUsage(Context)>
	//   16   33:invokestatic    #196 <Method void Utility.setAppEventAttributionParameters(JSONObject, AttributionIdentifiers, String, boolean)>
			Utility.setAppEventExtendedDeviceInfoParameters(((JSONObject) (obj1)), FacebookSdk.getApplicationContext());
	//   17   36:aload           7
	//   18   38:invokestatic    #197 <Method Context FacebookSdk.getApplicationContext()>
	//   19   41:invokestatic    #201 <Method void Utility.setAppEventExtendedDeviceInfoParameters(JSONObject, Context)>
			((JSONObject) (obj1)).put("application_package_name", ((Object) (context.getPackageName())));
	//   20   44:aload           7
	//   21   46:ldc1            #203 <String "application_package_name">
	//   22   48:aload_0         
	//   23   49:invokevirtual   #206 <Method String Context.getPackageName()>
	//   24   52:invokevirtual   #177 <Method JSONObject JSONObject.put(String, Object)>
	//   25   55:pop             
		}
	//*  26   56:ldc1            #208 <String "%s/activities">
	//*  27   58:iconst_1        
	//*  28   59:anewarray       Object[]
	//*  29   62:dup             
	//*  30   63:iconst_0        
	//*  31   64:aload_1         
	//*  32   65:aastore         
	//*  33   66:invokestatic    #212 <Method String String.format(String, Object[])>
	//*  34   69:astore_1        
	//*  35   70:aconst_null     
	//*  36   71:astore          6
	//*  37   73:aconst_null     
	//*  38   74:astore          5
	//*  39   76:aload           6
	//*  40   78:astore_0        
	//*  41   79:aconst_null     
	//*  42   80:aload_1         
	//*  43   81:aload           7
	//*  44   83:aconst_null     
	//*  45   84:invokestatic    #218 <Method GraphRequest GraphRequest.newPostRequest(com.facebook.AccessToken, String, JSONObject, com.facebook.GraphRequest$Callback)>
	//*  46   87:invokevirtual   #222 <Method GraphResponse GraphRequest.executeAndWait()>
	//*  47   90:invokevirtual   #227 <Method JSONObject GraphResponse.getJSONObject()>
	//*  48   93:astore          8
	//*  49   95:aload           5
	//*  50   97:astore_1        
	//*  51   98:aload           8
	//*  52  100:ifnull          433
	//*  53  103:aload           6
	//*  54  105:astore_0        
	//*  55  106:aload           8
	//*  56  108:ldc1            #229 <String "applink_args">
	//*  57  110:invokevirtual   #232 <Method String JSONObject.optString(String)>
	//*  58  113:astore          9
	//*  59  115:aload           6
	//*  60  117:astore_0        
	//*  61  118:aload           8
	//*  62  120:ldc1            #234 <String "click_time">
	//*  63  122:ldc2w           #235 <Long -1L>
	//*  64  125:invokevirtual   #240 <Method long JSONObject.optLong(String, long)>
	//*  65  128:lstore_3        
	//*  66  129:aload           6
	//*  67  131:astore_0        
	//*  68  132:aload           8
	//*  69  134:ldc1            #242 <String "applink_class">
	//*  70  136:invokevirtual   #232 <Method String JSONObject.optString(String)>
	//*  71  139:astore          7
	//*  72  141:aload           6
	//*  73  143:astore_0        
	//*  74  144:aload           8
	//*  75  146:ldc1            #244 <String "applink_url">
	//*  76  148:invokevirtual   #232 <Method String JSONObject.optString(String)>
	//*  77  151:astore          8
	//*  78  153:aload           5
	//*  79  155:astore_1        
	//*  80  156:aload           6
	//*  81  158:astore_0        
	//*  82  159:aload           9
	//*  83  161:invokestatic    #250 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  84  164:ifne            433
	//*  85  167:aload           6
	//*  86  169:astore_0        
	//*  87  170:aload           9
	//*  88  172:invokestatic    #252 <Method AppLinkData createFromJson(String)>
	//*  89  175:astore          5
	//*  90  177:lload_3         
	//*  91  178:ldc2w           #235 <Long -1L>
	//*  92  181:lcmp            
	//*  93  182:ifeq            255
	//*  94  185:aload           5
	//*  95  187:astore_0        
	//*  96  188:aload           5
	//*  97  190:getfield        #81  <Field JSONObject arguments>
	//*  98  193:ifnull          211
	//*  99  196:aload           5
	//* 100  198:astore_0        
	//* 101  199:aload           5
	//* 102  201:getfield        #81  <Field JSONObject arguments>
	//* 103  204:ldc1            #254 <String "com.facebook.platform.APPLINK_TAP_TIME_UTC">
	//* 104  206:lload_3         
	//* 105  207:invokevirtual   #257 <Method JSONObject JSONObject.put(String, long)>
	//* 106  210:pop             
	//* 107  211:aload           5
	//* 108  213:astore_0        
	//* 109  214:aload           5
	//* 110  216:getfield        #116 <Field Bundle argumentBundle>
	//* 111  219:ifnull          255
	//* 112  222:aload           5
	//* 113  224:astore_0        
	//* 114  225:aload           5
	//* 115  227:getfield        #116 <Field Bundle argumentBundle>
	//* 116  230:ldc1            #254 <String "com.facebook.platform.APPLINK_TAP_TIME_UTC">
	//* 117  232:lload_3         
	//* 118  233:invokestatic    #263 <Method String Long.toString(long)>
	//* 119  236:invokevirtual   #269 <Method void Bundle.putString(String, String)>
	//* 120  239:goto            255
	//* 121  242:aload           5
	//* 122  244:astore_0        
	//* 123  245:getstatic       #30  <Field String TAG>
	//* 124  248:ldc2            #271 <String "Unable to put tap time in AppLinkData.arguments">
	//* 125  251:invokestatic    #274 <Method int Log.d(String, String)>
	//* 126  254:pop             
	//* 127  255:aload           7
	//* 128  257:ifnull          331
	//* 129  260:aload           5
	//* 130  262:astore_0        
	//* 131  263:aload           5
	//* 132  265:getfield        #81  <Field JSONObject arguments>
	//* 133  268:ifnull          288
	//* 134  271:aload           5
	//* 135  273:astore_0        
	//* 136  274:aload           5
	//* 137  276:getfield        #81  <Field JSONObject arguments>
	//* 138  279:ldc2            #276 <String "com.facebook.platform.APPLINK_NATIVE_CLASS">
	//* 139  282:aload           7
	//* 140  284:invokevirtual   #177 <Method JSONObject JSONObject.put(String, Object)>
	//* 141  287:pop             
	//* 142  288:aload           5
	//* 143  290:astore_0        
	//* 144  291:aload           5
	//* 145  293:getfield        #116 <Field Bundle argumentBundle>
	//* 146  296:ifnull          331
	//* 147  299:aload           5
	//* 148  301:astore_0        
	//* 149  302:aload           5
	//* 150  304:getfield        #116 <Field Bundle argumentBundle>
	//* 151  307:ldc2            #276 <String "com.facebook.platform.APPLINK_NATIVE_CLASS">
	//* 152  310:aload           7
	//* 153  312:invokevirtual   #269 <Method void Bundle.putString(String, String)>
	//* 154  315:goto            331
	//* 155  318:aload           5
	//* 156  320:astore_0        
	//* 157  321:getstatic       #30  <Field String TAG>
	//* 158  324:ldc2            #271 <String "Unable to put tap time in AppLinkData.arguments">
	//* 159  327:invokestatic    #274 <Method int Log.d(String, String)>
	//* 160  330:pop             
	//* 161  331:aload           5
	//* 162  333:astore_1        
	//* 163  334:aload           8
	//* 164  336:ifnull          433
	//* 165  339:aload           5
	//* 166  341:astore_0        
	//* 167  342:aload           5
	//* 168  344:getfield        #81  <Field JSONObject arguments>
	//* 169  347:ifnull          367
	//* 170  350:aload           5
	//* 171  352:astore_0        
	//* 172  353:aload           5
	//* 173  355:getfield        #81  <Field JSONObject arguments>
	//* 174  358:ldc2            #278 <String "com.facebook.platform.APPLINK_NATIVE_URL">
	//* 175  361:aload           8
	//* 176  363:invokevirtual   #177 <Method JSONObject JSONObject.put(String, Object)>
	//* 177  366:pop             
	//* 178  367:aload           5
	//* 179  369:astore_1        
	//* 180  370:aload           5
	//* 181  372:astore_0        
	//* 182  373:aload           5
	//* 183  375:getfield        #116 <Field Bundle argumentBundle>
	//* 184  378:ifnull          433
	//* 185  381:aload           5
	//* 186  383:astore_0        
	//* 187  384:aload           5
	//* 188  386:getfield        #116 <Field Bundle argumentBundle>
	//* 189  389:ldc2            #278 <String "com.facebook.platform.APPLINK_NATIVE_URL">
	//* 190  392:aload           8
	//* 191  394:invokevirtual   #269 <Method void Bundle.putString(String, String)>
	//* 192  397:aload           5
	//* 193  399:astore_1        
	//* 194  400:goto            433
	//* 195  403:aload           5
	//* 196  405:astore_0        
	//* 197  406:getstatic       #30  <Field String TAG>
	//* 198  409:ldc2            #271 <String "Unable to put tap time in AppLinkData.arguments">
	//* 199  412:invokestatic    #274 <Method int Log.d(String, String)>
	//* 200  415:pop             
	//* 201  416:aload           5
	//* 202  418:astore_1        
	//* 203  419:goto            433
	//* 204  422:getstatic       #30  <Field String TAG>
	//* 205  425:ldc2            #280 <String "Unable to fetch deferred applink from server">
	//* 206  428:invokestatic    #283 <Method void Utility.logd(String, String)>
	//* 207  431:aload_0         
	//* 208  432:astore_1        
	//* 209  433:aload_2         
	//* 210  434:aload_1         
	//* 211  435:invokeinterface #287 <Method void AppLinkData$CompletionHandler.onDeferredAppLinkDataFetched(AppLinkData)>
	//* 212  440:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 213  441:astore_0        
		{
			throw new FacebookException("An error occurred while preparing deferred app link", ((Throwable) (context)));
	//  214  442:new             #45  <Class FacebookException>
	//  215  445:dup             
	//  216  446:ldc2            #289 <String "An error occurred while preparing deferred app link">
	//  217  449:aload_0         
	//  218  450:invokespecial   #292 <Method void FacebookException(String, Throwable)>
	//  219  453:athrow          
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
			break MISSING_BLOCK_LABEL_211;
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
		Log.d(TAG, "Unable to put tap time in AppLinkData.arguments");
_L5:
		if(obj1 == null) goto _L8; else goto _L7
_L7:
		context = ((Context) (applinkdata));
		if(applinkdata.arguments == null)
			break MISSING_BLOCK_LABEL_288;
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
		Log.d(TAG, "Unable to put tap time in AppLinkData.arguments");
_L8:
		s = ((String) (applinkdata));
		if(obj2 == null) goto _L2; else goto _L10
_L10:
		context = ((Context) (applinkdata));
		if(applinkdata.arguments == null)
			break MISSING_BLOCK_LABEL_367;
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
		Log.d(TAG, "Unable to put tap time in AppLinkData.arguments");
		s = ((String) (applinkdata));
		  goto _L2
_L13:
		Utility.logd(TAG, "Unable to fetch deferred applink from server");
		s = ((String) (context));
_L2:
		completionhandler.onDeferredAppLinkDataFetched(((AppLinkData) (s)));
		return;
		s;
	//  220  454:astore_1        
		if(true) goto _L13; else goto _L12
	//  221  455:goto            422
_L12:
		context;
	//  222  458:astore_0        
		  goto _L14
	//* 223  459:goto            242
		context;
	//  224  462:astore_0        
		  goto _L15
	//* 225  463:goto            318
		context;
	//  226  466:astore_0        
		  goto _L16
	//* 227  467:goto            403
	}

	private static Bundle toBundle(JSONObject jsonobject)
		throws JSONException
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #265 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #293 <Method void Bundle()>
	//    3    7:astore          4
		for(Iterator iterator = jsonobject.keys(); iterator.hasNext();)
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #297 <Method Iterator JSONObject.keys()>
	//*   6   13:astore          5
	//*   7   15:aload           5
	//*   8   17:invokeinterface #303 <Method boolean Iterator.hasNext()>
	//*   9   22:ifeq            268
		{
			String s = (String)iterator.next();
	//   10   25:aload           5
	//   11   27:invokeinterface #307 <Method Object Iterator.next()>
	//   12   32:checkcast       #70  <Class String>
	//   13   35:astore          6
			Object obj = jsonobject.get(s);
	//   14   37:aload_0         
	//   15   38:aload           6
	//   16   40:invokevirtual   #311 <Method Object JSONObject.get(String)>
	//   17   43:astore          7
			if(obj instanceof JSONObject)
	//*  18   45:aload           7
	//*  19   47:instanceof      #55  <Class JSONObject>
	//*  20   50:ifeq            71
				bundle.putBundle(s, toBundle((JSONObject)obj));
	//   21   53:aload           4
	//   22   55:aload           6
	//   23   57:aload           7
	//   24   59:checkcast       #55  <Class JSONObject>
	//   25   62:invokestatic    #114 <Method Bundle toBundle(JSONObject)>
	//   26   65:invokevirtual   #315 <Method void Bundle.putBundle(String, Bundle)>
			else
	//*  27   68:goto            15
			if(obj instanceof JSONArray)
	//*  28   71:aload           7
	//*  29   73:instanceof      #317 <Class JSONArray>
	//*  30   76:ifeq            253
			{
				obj = ((Object) ((JSONArray)obj));
	//   31   79:aload           7
	//   32   81:checkcast       #317 <Class JSONArray>
	//   33   84:astore          7
				int k = ((JSONArray) (obj)).length();
	//   34   86:aload           7
	//   35   88:invokevirtual   #321 <Method int JSONArray.length()>
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
	//   47  108:invokevirtual   #325 <Method void Bundle.putStringArray(String, String[])>
				} else
	//*  48  111:goto            15
				{
					android.os.Parcelable aparcelable[] = ((android.os.Parcelable []) (((JSONArray) (obj)).get(0)));
	//   49  114:aload           7
	//   50  116:iconst_0        
	//   51  117:invokevirtual   #328 <Method Object JSONArray.get(int)>
	//   52  120:astore          8
					if(aparcelable instanceof JSONObject)
	//*  53  122:aload           8
	//*  54  124:instanceof      #55  <Class JSONObject>
	//*  55  127:ifeq            181
					{
						aparcelable = ((android.os.Parcelable []) (new Bundle[((JSONArray) (obj)).length()]));
	//   56  130:aload           7
	//   57  132:invokevirtual   #321 <Method int JSONArray.length()>
	//   58  135:anewarray       Bundle[]
	//   59  138:astore          8
						for(; i < ((JSONArray) (obj)).length(); i++)
	//*  60  140:iload_1         
	//*  61  141:aload           7
	//*  62  143:invokevirtual   #321 <Method int JSONArray.length()>
	//*  63  146:icmpge          169
							aparcelable[i] = ((/*<invalid signature>*/java.lang.Object) (toBundle(((JSONArray) (obj)).getJSONObject(i))));
	//   64  149:aload           8
	//   65  151:iload_1         
	//   66  152:aload           7
	//   67  154:iload_1         
	//   68  155:invokevirtual   #331 <Method JSONObject JSONArray.getJSONObject(int)>
	//   69  158:invokestatic    #114 <Method Bundle toBundle(JSONObject)>
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
	//   79  175:invokevirtual   #335 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
					} else
	//*  80  178:goto            15
					if(!(aparcelable instanceof JSONArray))
	//*  81  181:aload           8
	//*  82  183:instanceof      #317 <Class JSONArray>
	//*  83  186:ifne            242
					{
						String as[] = new String[((JSONArray) (obj)).length()];
	//   84  189:aload           7
	//   85  191:invokevirtual   #321 <Method int JSONArray.length()>
	//   86  194:anewarray       String[]
	//   87  197:astore          8
						for(int j = ((int) (flag)); j < ((JSONArray) (obj)).length(); j++)
	//*  88  199:iload_2         
	//*  89  200:istore_1        
	//*  90  201:iload_1         
	//*  91  202:aload           7
	//*  92  204:invokevirtual   #321 <Method int JSONArray.length()>
	//*  93  207:icmpge          230
							as[j] = ((JSONArray) (obj)).get(j).toString();
	//   94  210:aload           8
	//   95  212:iload_1         
	//   96  213:aload           7
	//   97  215:iload_1         
	//   98  216:invokevirtual   #328 <Method Object JSONArray.get(int)>
	//   99  219:invokevirtual   #337 <Method String Object.toString()>
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
	//  109  236:invokevirtual   #325 <Method void Bundle.putStringArray(String, String[])>
					} else
	//* 110  239:goto            15
					{
						throw new FacebookException("Nested arrays are not supported.");
	//  111  242:new             #45  <Class FacebookException>
	//  112  245:dup             
	//  113  246:ldc2            #339 <String "Nested arrays are not supported.">
	//  114  249:invokespecial   #342 <Method void FacebookException(String)>
	//  115  252:athrow          
					}
				}
			} else
			{
				bundle.putString(s, obj.toString());
	//  116  253:aload           4
	//  117  255:aload           6
	//  118  257:aload           7
	//  119  259:invokevirtual   #337 <Method String Object.toString()>
	//  120  262:invokevirtual   #269 <Method void Bundle.putString(String, String)>
			}
		}

	//* 121  265:goto            15
		return bundle;
	//  122  268:aload           4
	//  123  270:areturn         
	}

	public Uri getTargetUri()
	{
		return targetUri;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field Uri targetUri>
	//    2    4:areturn         
	}

	private static final String TAG = ((Class) (com/facebook/applinks/AppLinkData)).getCanonicalName();
	private Bundle argumentBundle;
	private JSONObject arguments;
	private String promotionCode;
	private String ref;
	private Uri targetUri;

	static 
	{
	//    0    0:ldc1            #2   <Class AppLinkData>
	//    1    2:invokevirtual   #28  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #30  <Field String TAG>
	//*   3    8:return          
	}


/*
	static void access$000(Context context, String s, CompletionHandler completionhandler)
	{
		fetchDeferredAppLinkFromServer(context, s, completionhandler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #39  <Method void fetchDeferredAppLinkFromServer(Context, String, AppLinkData$CompletionHandler)>
		return;
	//    4    6:return          
	}

*/
}
