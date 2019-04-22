// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.marketing;

import android.os.Build;
import android.os.Bundle;
import com.facebook.*;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Utility;
import com.facebook.marketing.internal.MarketingLogger;
import com.facebook.marketing.internal.MarketingUtils;
import com.newrelic.agent.android.instrumentation.JSONArrayInstrumentation;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.marketing:
//			CodelessActivityLifecycleTracker, ViewIndexer

static final class CodelessActivityLifecycleTracker$2
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) (Locale.US));
	//    0    0:getstatic       #32  <Field Locale Locale.US>
	//    1    3:astore_2        
		boolean flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_1        
		GraphRequest graphrequest = GraphRequest.newPostRequest(((com.facebook.AccessToken) (null)), String.format(((Locale) (obj)), "%s/app_indexing_session", new Object[] {
			val$applicationId
		}), ((JSONObject) (null)), ((com.facebook.GraphRequest.Callback) (null)));
	//    4    6:aconst_null     
	//    5    7:aload_2         
	//    6    8:ldc1            #34  <String "%s/app_indexing_session">
	//    7   10:iconst_1        
	//    8   11:anewarray       Object[]
	//    9   14:dup             
	//   10   15:iconst_0        
	//   11   16:aload_0         
	//   12   17:getfield        #19  <Field String val$applicationId>
	//   13   20:aastore         
	//   14   21:invokestatic    #40  <Method String String.format(Locale, String, Object[])>
	//   15   24:aconst_null     
	//   16   25:aconst_null     
	//   17   26:invokestatic    #46  <Method GraphRequest GraphRequest.newPostRequest(com.facebook.AccessToken, String, JSONObject, com.facebook.GraphRequest$Callback)>
	//   18   29:astore          4
		Object obj1 = ((Object) (graphrequest.getParameters()));
	//   19   31:aload           4
	//   20   33:invokevirtual   #50  <Method Bundle GraphRequest.getParameters()>
	//   21   36:astore_3        
		obj = obj1;
	//   22   37:aload_3         
	//   23   38:astore_2        
		if(obj1 == null)
	//*  24   39:aload_3         
	//*  25   40:ifnonnull       51
			obj = ((Object) (new Bundle()));
	//   26   43:new             #52  <Class Bundle>
	//   27   46:dup             
	//   28   47:invokespecial   #53  <Method void Bundle()>
	//   29   50:astore_2        
		Object obj2 = ((Object) (AttributionIdentifiers.getAttributionIdentifiers(FacebookSdk.getApplicationContext())));
	//   30   51:invokestatic    #59  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//   31   54:invokestatic    #65  <Method AttributionIdentifiers AttributionIdentifiers.getAttributionIdentifiers(android.content.Context)>
	//   32   57:astore          6
		JSONArray jsonarray = new JSONArray();
	//   33   59:new             #67  <Class JSONArray>
	//   34   62:dup             
	//   35   63:invokespecial   #68  <Method void JSONArray()>
	//   36   66:astore          5
		if(Build.MODEL != null)
	//*  37   68:getstatic       #73  <Field String Build.MODEL>
	//*  38   71:ifnull          81
			obj1 = ((Object) (Build.MODEL));
	//   39   74:getstatic       #73  <Field String Build.MODEL>
	//   40   77:astore_3        
		else
	//*  41   78:goto            84
			obj1 = "";
	//   42   81:ldc1            #75  <String "">
	//   43   83:astore_3        
		jsonarray.put(obj1);
	//   44   84:aload           5
	//   45   86:aload_3         
	//   46   87:invokevirtual   #79  <Method JSONArray JSONArray.put(Object)>
	//   47   90:pop             
		if(obj2 != null && ((AttributionIdentifiers) (obj2)).getAndroidAdvertiserId() != null)
	//*  48   91:aload           6
	//*  49   93:ifnull          118
	//*  50   96:aload           6
	//*  51   98:invokevirtual   #83  <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
	//*  52  101:ifnull          118
			jsonarray.put(((Object) (((AttributionIdentifiers) (obj2)).getAndroidAdvertiserId())));
	//   53  104:aload           5
	//   54  106:aload           6
	//   55  108:invokevirtual   #83  <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
	//   56  111:invokevirtual   #79  <Method JSONArray JSONArray.put(Object)>
	//   57  114:pop             
		else
	//*  58  115:goto            126
			jsonarray.put("");
	//   59  118:aload           5
	//   60  120:ldc1            #75  <String "">
	//   61  122:invokevirtual   #79  <Method JSONArray JSONArray.put(Object)>
	//   62  125:pop             
		jsonarray.put("0");
	//   63  126:aload           5
	//   64  128:ldc1            #85  <String "0">
	//   65  130:invokevirtual   #79  <Method JSONArray JSONArray.put(Object)>
	//   66  133:pop             
		if(MarketingUtils.isEmulator())
	//*  67  134:invokestatic    #91  <Method boolean MarketingUtils.isEmulator()>
	//*  68  137:ifeq            146
			obj1 = "1";
	//   69  140:ldc1            #93  <String "1">
	//   70  142:astore_3        
		else
	//*  71  143:goto            149
			obj1 = "0";
	//   72  146:ldc1            #85  <String "0">
	//   73  148:astore_3        
		jsonarray.put(obj1);
	//   74  149:aload           5
	//   75  151:aload_3         
	//   76  152:invokevirtual   #79  <Method JSONArray JSONArray.put(Object)>
	//   77  155:pop             
		obj1 = ((Object) (Utility.getCurrentLocale()));
	//   78  156:invokestatic    #99  <Method Locale Utility.getCurrentLocale()>
	//   79  159:astore_3        
		obj2 = ((Object) (new StringBuilder()));
	//   80  160:new             #101 <Class StringBuilder>
	//   81  163:dup             
	//   82  164:invokespecial   #102 <Method void StringBuilder()>
	//   83  167:astore          6
		((StringBuilder) (obj2)).append(((Locale) (obj1)).getLanguage());
	//   84  169:aload           6
	//   85  171:aload_3         
	//   86  172:invokevirtual   #105 <Method String Locale.getLanguage()>
	//   87  175:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   88  178:pop             
		((StringBuilder) (obj2)).append("_");
	//   89  179:aload           6
	//   90  181:ldc1            #111 <String "_">
	//   91  183:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   92  186:pop             
		((StringBuilder) (obj2)).append(((Locale) (obj1)).getCountry());
	//   93  187:aload           6
	//   94  189:aload_3         
	//   95  190:invokevirtual   #114 <Method String Locale.getCountry()>
	//   96  193:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   97  196:pop             
		jsonarray.put(((Object) (((StringBuilder) (obj2)).toString())));
	//   98  197:aload           5
	//   99  199:aload           6
	//  100  201:invokevirtual   #117 <Method String StringBuilder.toString()>
	//  101  204:invokevirtual   #79  <Method JSONArray JSONArray.put(Object)>
	//  102  207:pop             
		if(!(jsonarray instanceof JSONArray))
	//* 103  208:aload           5
	//* 104  210:instanceof      #67  <Class JSONArray>
	//* 105  213:ifne            225
			obj1 = ((Object) (jsonarray.toString()));
	//  106  216:aload           5
	//  107  218:invokevirtual   #118 <Method String JSONArray.toString()>
	//  108  221:astore_3        
		else
	//* 109  222:goto            234
			obj1 = ((Object) (JSONArrayInstrumentation.toString((JSONArray)jsonarray)));
	//  110  225:aload           5
	//  111  227:checkcast       #67  <Class JSONArray>
	//  112  230:invokestatic    #123 <Method String JSONArrayInstrumentation.toString(JSONArray)>
	//  113  233:astore_3        
		((Bundle) (obj)).putString("device_session_id", CodelessActivityLifecycleTracker.getCurrentDeviceSessionID());
	//  114  234:aload_2         
	//  115  235:ldc1            #125 <String "device_session_id">
	//  116  237:invokestatic    #128 <Method String CodelessActivityLifecycleTracker.getCurrentDeviceSessionID()>
	//  117  240:invokevirtual   #132 <Method void Bundle.putString(String, String)>
		((Bundle) (obj)).putString("extinfo", ((String) (obj1)));
	//  118  243:aload_2         
	//  119  244:ldc1            #134 <String "extinfo">
	//  120  246:aload_3         
	//  121  247:invokevirtual   #132 <Method void Bundle.putString(String, String)>
		graphrequest.setParameters(((Bundle) (obj)));
	//  122  250:aload           4
	//  123  252:aload_2         
	//  124  253:invokevirtual   #138 <Method void GraphRequest.setParameters(Bundle)>
		if(graphrequest != null)
	//* 125  256:aload           4
	//* 126  258:ifnull          327
		{
			JSONObject jsonobject = graphrequest.executeAndWait().getJSONObject();
	//  127  261:aload           4
	//  128  263:invokevirtual   #142 <Method GraphResponse GraphRequest.executeAndWait()>
	//  129  266:invokevirtual   #148 <Method JSONObject GraphResponse.getJSONObject()>
	//  130  269:astore_2        
			if(jsonobject == null || !jsonobject.optBoolean("is_app_indexing_enabled", false))
	//* 131  270:aload_2         
	//* 132  271:ifnull          287
	//* 133  274:aload_2         
	//* 134  275:ldc1            #150 <String "is_app_indexing_enabled">
	//* 135  277:iconst_0        
	//* 136  278:invokevirtual   #156 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 137  281:ifeq            287
	//* 138  284:goto            289
				flag = false;
	//  139  287:iconst_0        
	//  140  288:istore_1        
			Boolean _tmp = CodelessActivityLifecycleTracker.access$302(Boolean.valueOf(flag));
	//  141  289:iload_1         
	//  142  290:invokestatic    #162 <Method Boolean Boolean.valueOf(boolean)>
	//  143  293:invokestatic    #166 <Method Boolean CodelessActivityLifecycleTracker.access$302(Boolean)>
	//  144  296:pop             
			if(!CodelessActivityLifecycleTracker.access$300().booleanValue())
	//* 145  297:invokestatic    #170 <Method Boolean CodelessActivityLifecycleTracker.access$300()>
	//* 146  300:invokevirtual   #173 <Method boolean Boolean.booleanValue()>
	//* 147  303:ifne            314
			{
				String _tmp1 = CodelessActivityLifecycleTracker.access$402(((String) (null)));
	//  148  306:aconst_null     
	//  149  307:invokestatic    #177 <Method String CodelessActivityLifecycleTracker.access$402(String)>
	//  150  310:pop             
			} else
	//* 151  311:goto            327
			{
				val$logger.logSessionReady();
	//  152  314:aload_0         
	//  153  315:getfield        #21  <Field MarketingLogger val$logger>
	//  154  318:invokevirtual   #182 <Method void MarketingLogger.logSessionReady()>
				CodelessActivityLifecycleTracker.access$100().schedule();
	//  155  321:invokestatic    #186 <Method ViewIndexer CodelessActivityLifecycleTracker.access$100()>
	//  156  324:invokevirtual   #191 <Method void ViewIndexer.schedule()>
			}
		}
		Boolean _tmp2 = CodelessActivityLifecycleTracker.access$502(Boolean.valueOf(false));
	//  157  327:iconst_0        
	//  158  328:invokestatic    #162 <Method Boolean Boolean.valueOf(boolean)>
	//  159  331:invokestatic    #194 <Method Boolean CodelessActivityLifecycleTracker.access$502(Boolean)>
	//  160  334:pop             
	//  161  335:return          
	}

	final String val$applicationId;
	final MarketingLogger val$logger;

	CodelessActivityLifecycleTracker$2(String s, MarketingLogger marketinglogger)
	{
		val$applicationId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field String val$applicationId>
		val$logger = marketinglogger;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field MarketingLogger val$logger>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
