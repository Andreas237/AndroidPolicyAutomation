// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.os.Build;
import android.os.Bundle;
import com.facebook.*;
import com.facebook.appevents.codeless.ViewIndexer;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Utility;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.appevents.internal:
//			ActivityLifecycleTracker, AppEventUtility

static final class ActivityLifecycleTracker$6
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) (Locale.US));
	//    0    0:getstatic       #27  <Field Locale Locale.US>
	//    1    3:astore_2        
		boolean flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_1        
		GraphRequest graphrequest = GraphRequest.newPostRequest(((com.facebook.AccessToken) (null)), String.format(((Locale) (obj)), "%s/app_indexing_session", new Object[] {
			val$applicationId
		}), ((JSONObject) (null)), ((com.facebook.GraphRequest.Callback) (null)));
	//    4    6:aconst_null     
	//    5    7:aload_2         
	//    6    8:ldc1            #29  <String "%s/app_indexing_session">
	//    7   10:iconst_1        
	//    8   11:anewarray       Object[]
	//    9   14:dup             
	//   10   15:iconst_0        
	//   11   16:aload_0         
	//   12   17:getfield        #16  <Field String val$applicationId>
	//   13   20:aastore         
	//   14   21:invokestatic    #35  <Method String String.format(Locale, String, Object[])>
	//   15   24:aconst_null     
	//   16   25:aconst_null     
	//   17   26:invokestatic    #41  <Method GraphRequest GraphRequest.newPostRequest(com.facebook.AccessToken, String, JSONObject, com.facebook.GraphRequest$Callback)>
	//   18   29:astore          4
		Object obj1 = ((Object) (graphrequest.getParameters()));
	//   19   31:aload           4
	//   20   33:invokevirtual   #45  <Method Bundle GraphRequest.getParameters()>
	//   21   36:astore_3        
		obj = obj1;
	//   22   37:aload_3         
	//   23   38:astore_2        
		if(obj1 == null)
	//*  24   39:aload_3         
	//*  25   40:ifnonnull       51
			obj = ((Object) (new Bundle()));
	//   26   43:new             #47  <Class Bundle>
	//   27   46:dup             
	//   28   47:invokespecial   #48  <Method void Bundle()>
	//   29   50:astore_2        
		Object obj2 = ((Object) (AttributionIdentifiers.getAttributionIdentifiers(FacebookSdk.getApplicationContext())));
	//   30   51:invokestatic    #54  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//   31   54:invokestatic    #60  <Method AttributionIdentifiers AttributionIdentifiers.getAttributionIdentifiers(android.content.Context)>
	//   32   57:astore          6
		JSONArray jsonarray = new JSONArray();
	//   33   59:new             #62  <Class JSONArray>
	//   34   62:dup             
	//   35   63:invokespecial   #63  <Method void JSONArray()>
	//   36   66:astore          5
		if(Build.MODEL != null)
	//*  37   68:getstatic       #68  <Field String Build.MODEL>
	//*  38   71:ifnull          81
			obj1 = ((Object) (Build.MODEL));
	//   39   74:getstatic       #68  <Field String Build.MODEL>
	//   40   77:astore_3        
		else
	//*  41   78:goto            84
			obj1 = "";
	//   42   81:ldc1            #70  <String "">
	//   43   83:astore_3        
		jsonarray.put(obj1);
	//   44   84:aload           5
	//   45   86:aload_3         
	//   46   87:invokevirtual   #74  <Method JSONArray JSONArray.put(Object)>
	//   47   90:pop             
		if(obj2 != null && ((AttributionIdentifiers) (obj2)).getAndroidAdvertiserId() != null)
	//*  48   91:aload           6
	//*  49   93:ifnull          118
	//*  50   96:aload           6
	//*  51   98:invokevirtual   #78  <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
	//*  52  101:ifnull          118
			jsonarray.put(((Object) (((AttributionIdentifiers) (obj2)).getAndroidAdvertiserId())));
	//   53  104:aload           5
	//   54  106:aload           6
	//   55  108:invokevirtual   #78  <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
	//   56  111:invokevirtual   #74  <Method JSONArray JSONArray.put(Object)>
	//   57  114:pop             
		else
	//*  58  115:goto            126
			jsonarray.put("");
	//   59  118:aload           5
	//   60  120:ldc1            #70  <String "">
	//   61  122:invokevirtual   #74  <Method JSONArray JSONArray.put(Object)>
	//   62  125:pop             
		jsonarray.put("0");
	//   63  126:aload           5
	//   64  128:ldc1            #80  <String "0">
	//   65  130:invokevirtual   #74  <Method JSONArray JSONArray.put(Object)>
	//   66  133:pop             
		if(AppEventUtility.isEmulator())
	//*  67  134:invokestatic    #86  <Method boolean AppEventUtility.isEmulator()>
	//*  68  137:ifeq            146
			obj1 = "1";
	//   69  140:ldc1            #88  <String "1">
	//   70  142:astore_3        
		else
	//*  71  143:goto            149
			obj1 = "0";
	//   72  146:ldc1            #80  <String "0">
	//   73  148:astore_3        
		jsonarray.put(obj1);
	//   74  149:aload           5
	//   75  151:aload_3         
	//   76  152:invokevirtual   #74  <Method JSONArray JSONArray.put(Object)>
	//   77  155:pop             
		obj1 = ((Object) (Utility.getCurrentLocale()));
	//   78  156:invokestatic    #94  <Method Locale Utility.getCurrentLocale()>
	//   79  159:astore_3        
		obj2 = ((Object) (new StringBuilder()));
	//   80  160:new             #96  <Class StringBuilder>
	//   81  163:dup             
	//   82  164:invokespecial   #97  <Method void StringBuilder()>
	//   83  167:astore          6
		((StringBuilder) (obj2)).append(((Locale) (obj1)).getLanguage());
	//   84  169:aload           6
	//   85  171:aload_3         
	//   86  172:invokevirtual   #100 <Method String Locale.getLanguage()>
	//   87  175:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   88  178:pop             
		((StringBuilder) (obj2)).append("_");
	//   89  179:aload           6
	//   90  181:ldc1            #106 <String "_">
	//   91  183:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   92  186:pop             
		((StringBuilder) (obj2)).append(((Locale) (obj1)).getCountry());
	//   93  187:aload           6
	//   94  189:aload_3         
	//   95  190:invokevirtual   #109 <Method String Locale.getCountry()>
	//   96  193:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   97  196:pop             
		jsonarray.put(((Object) (((StringBuilder) (obj2)).toString())));
	//   98  197:aload           5
	//   99  199:aload           6
	//  100  201:invokevirtual   #112 <Method String StringBuilder.toString()>
	//  101  204:invokevirtual   #74  <Method JSONArray JSONArray.put(Object)>
	//  102  207:pop             
		obj1 = ((Object) (jsonarray.toString()));
	//  103  208:aload           5
	//  104  210:invokevirtual   #113 <Method String JSONArray.toString()>
	//  105  213:astore_3        
		((Bundle) (obj)).putString("device_session_id", ActivityLifecycleTracker.getCurrentDeviceSessionID());
	//  106  214:aload_2         
	//  107  215:ldc1            #115 <String "device_session_id">
	//  108  217:invokestatic    #118 <Method String ActivityLifecycleTracker.getCurrentDeviceSessionID()>
	//  109  220:invokevirtual   #122 <Method void Bundle.putString(String, String)>
		((Bundle) (obj)).putString("extinfo", ((String) (obj1)));
	//  110  223:aload_2         
	//  111  224:ldc1            #124 <String "extinfo">
	//  112  226:aload_3         
	//  113  227:invokevirtual   #122 <Method void Bundle.putString(String, String)>
		graphrequest.setParameters(((Bundle) (obj)));
	//  114  230:aload           4
	//  115  232:aload_2         
	//  116  233:invokevirtual   #128 <Method void GraphRequest.setParameters(Bundle)>
		if(graphrequest != null)
	//* 117  236:aload           4
	//* 118  238:ifnull          300
		{
			JSONObject jsonobject = graphrequest.executeAndWait().getJSONObject();
	//  119  241:aload           4
	//  120  243:invokevirtual   #132 <Method GraphResponse GraphRequest.executeAndWait()>
	//  121  246:invokevirtual   #138 <Method JSONObject GraphResponse.getJSONObject()>
	//  122  249:astore_2        
			if(jsonobject == null || !jsonobject.optBoolean("is_app_indexing_enabled", false))
	//* 123  250:aload_2         
	//* 124  251:ifnull          267
	//* 125  254:aload_2         
	//* 126  255:ldc1            #140 <String "is_app_indexing_enabled">
	//* 127  257:iconst_0        
	//* 128  258:invokevirtual   #146 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 129  261:ifeq            267
	//* 130  264:goto            269
				flag = false;
	//  131  267:iconst_0        
	//  132  268:istore_1        
			Boolean _tmp = ActivityLifecycleTracker.access$1002(Boolean.valueOf(flag));
	//  133  269:iload_1         
	//  134  270:invokestatic    #152 <Method Boolean Boolean.valueOf(boolean)>
	//  135  273:invokestatic    #156 <Method Boolean ActivityLifecycleTracker.access$1002(Boolean)>
	//  136  276:pop             
			if(!ActivityLifecycleTracker.access$1000().booleanValue())
	//* 137  277:invokestatic    #160 <Method Boolean ActivityLifecycleTracker.access$1000()>
	//* 138  280:invokevirtual   #163 <Method boolean Boolean.booleanValue()>
	//* 139  283:ifne            294
			{
				String _tmp1 = ActivityLifecycleTracker.access$1102(((String) (null)));
	//  140  286:aconst_null     
	//  141  287:invokestatic    #167 <Method String ActivityLifecycleTracker.access$1102(String)>
	//  142  290:pop             
			} else
	//* 143  291:goto            300
				ActivityLifecycleTracker.access$1200().schedule();
	//  144  294:invokestatic    #171 <Method ViewIndexer ActivityLifecycleTracker.access$1200()>
	//  145  297:invokevirtual   #176 <Method void ViewIndexer.schedule()>
		}
		Boolean _tmp2 = ActivityLifecycleTracker.access$1302(Boolean.valueOf(false));
	//  146  300:iconst_0        
	//  147  301:invokestatic    #152 <Method Boolean Boolean.valueOf(boolean)>
	//  148  304:invokestatic    #179 <Method Boolean ActivityLifecycleTracker.access$1302(Boolean)>
	//  149  307:pop             
	//  150  308:return          
	}

	final String val$applicationId;

	ActivityLifecycleTracker$6(String s)
	{
		val$applicationId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field String val$applicationId>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
