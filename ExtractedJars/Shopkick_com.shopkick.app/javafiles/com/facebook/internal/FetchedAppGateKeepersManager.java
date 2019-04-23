// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.*;

// Referenced classes of package com.facebook.internal:
//			AttributionIdentifiers, Utility

public class FetchedAppGateKeepersManager
{

	public FetchedAppGateKeepersManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void Object()>
	//    2    4:return          
	}

	private static JSONObject getAppGateKeepersQueryResponse(String s)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #86  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void Bundle()>
	//    3    7:astore_3        
		AttributionIdentifiers attributionidentifiers = AttributionIdentifiers.getCachedIdentifiers();
	//    4    8:invokestatic    #93  <Method AttributionIdentifiers AttributionIdentifiers.getCachedIdentifiers()>
	//    5   11:astore          4
		String s2 = "";
	//    6   13:ldc1            #95  <String "">
	//    7   15:astore_2        
		String s1 = s2;
	//    8   16:aload_2         
	//    9   17:astore_1        
		if(attributionidentifiers != null)
	//*  10   18:aload           4
	//*  11   20:ifnull          39
		{
			s1 = s2;
	//   12   23:aload_2         
	//   13   24:astore_1        
			if(attributionidentifiers.getAndroidAdvertiserId() != null)
	//*  14   25:aload           4
	//*  15   27:invokevirtual   #98  <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
	//*  16   30:ifnull          39
				s1 = attributionidentifiers.getAndroidAdvertiserId();
	//   17   33:aload           4
	//   18   35:invokevirtual   #98  <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
	//   19   38:astore_1        
		}
		s2 = FacebookSdk.getSdkVersion();
	//   20   39:invokestatic    #103 <Method String FacebookSdk.getSdkVersion()>
	//   21   42:astore_2        
		bundle.putString("platform", "android");
	//   22   43:aload_3         
	//   23   44:ldc1            #29  <String "platform">
	//   24   46:ldc1            #44  <String "android">
	//   25   48:invokevirtual   #107 <Method void Bundle.putString(String, String)>
		bundle.putString("device_id", s1);
	//   26   51:aload_3         
	//   27   52:ldc1            #10  <String "device_id">
	//   28   54:aload_1         
	//   29   55:invokevirtual   #107 <Method void Bundle.putString(String, String)>
		bundle.putString("sdk_version", s2);
	//   30   58:aload_3         
	//   31   59:ldc1            #32  <String "sdk_version">
	//   32   61:aload_2         
	//   33   62:invokevirtual   #107 <Method void Bundle.putString(String, String)>
		bundle.putString("fields", "gatekeepers");
	//   34   65:aload_3         
	//   35   66:ldc1            #13  <String "fields">
	//   36   68:ldc1            #23  <String "gatekeepers">
	//   37   70:invokevirtual   #107 <Method void Bundle.putString(String, String)>
		s = ((String) (GraphRequest.newGraphPathRequest(((com.facebook.AccessToken) (null)), String.format("%s/%s", new Object[] {
			s, "mobile_sdk_gk"
		}), ((com.facebook.GraphRequest.Callback) (null)))));
	//   38   73:aconst_null     
	//   39   74:ldc1            #109 <String "%s/%s">
	//   40   76:iconst_2        
	//   41   77:anewarray       Object[]
	//   42   80:dup             
	//   43   81:iconst_0        
	//   44   82:aload_0         
	//   45   83:aastore         
	//   46   84:dup             
	//   47   85:iconst_1        
	//   48   86:ldc1            #20  <String "mobile_sdk_gk">
	//   49   88:aastore         
	//   50   89:invokestatic    #115 <Method String String.format(String, Object[])>
	//   51   92:aconst_null     
	//   52   93:invokestatic    #121 <Method GraphRequest GraphRequest.newGraphPathRequest(com.facebook.AccessToken, String, com.facebook.GraphRequest$Callback)>
	//   53   96:astore_0        
		((GraphRequest) (s)).setSkipClientToken(true);
	//   54   97:aload_0         
	//   55   98:iconst_1        
	//   56   99:invokevirtual   #125 <Method void GraphRequest.setSkipClientToken(boolean)>
		((GraphRequest) (s)).setParameters(bundle);
	//   57  102:aload_0         
	//   58  103:aload_3         
	//   59  104:invokevirtual   #129 <Method void GraphRequest.setParameters(Bundle)>
		return ((GraphRequest) (s)).executeAndWait().getJSONObject();
	//   60  107:aload_0         
	//   61  108:invokevirtual   #133 <Method GraphResponse GraphRequest.executeAndWait()>
	//   62  111:invokevirtual   #139 <Method JSONObject GraphResponse.getJSONObject()>
	//   63  114:areturn         
	}

	public static boolean getGateKeeperForKey(String s, String s1, boolean flag)
	{
		loadAppGateKeepersAsync();
	//    0    0:invokestatic    #144 <Method void loadAppGateKeepersAsync()>
		if(s1 != null)
	//*   1    3:aload_1         
	//*   2    4:ifnull          39
		{
			if(!fetchedAppGateKeepers.containsKey(((Object) (s1))))
	//*   3    7:getstatic       #68  <Field Map fetchedAppGateKeepers>
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #150 <Method boolean Map.containsKey(Object)>
	//*   6   16:ifne            21
				return flag;
	//    7   19:iload_2         
	//    8   20:ireturn         
			else
				return ((JSONObject)fetchedAppGateKeepers.get(((Object) (s1)))).optBoolean(s, flag);
	//    9   21:getstatic       #68  <Field Map fetchedAppGateKeepers>
	//   10   24:aload_1         
	//   11   25:invokeinterface #154 <Method Object Map.get(Object)>
	//   12   30:checkcast       #156 <Class JSONObject>
	//   13   33:aload_0         
	//   14   34:iload_2         
	//   15   35:invokevirtual   #160 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   16   38:ireturn         
		} else
		{
			return flag;
	//   17   39:iload_2         
	//   18   40:ireturn         
		}
	}

	private static boolean isTimestampValid(Long long1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(long1 == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		if(System.currentTimeMillis() - long1.longValue() < 0x36ee80L)
	//*   6    8:invokestatic    #168 <Method long System.currentTimeMillis()>
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #173 <Method long Long.longValue()>
	//*   9   15:lsub            
	//*  10   16:ldc2w           #16  <Long 0x36ee80L>
	//*  11   19:lcmp            
	//*  12   20:ifge            25
			flag = true;
	//   13   23:iconst_1        
	//   14   24:istore_1        
		return flag;
	//   15   25:iload_1         
	//   16   26:ireturn         
	}

	public static void loadAppGateKeepersAsync()
	{
		com/facebook/internal/FetchedAppGateKeepersManager;
	//    0    0:ldc1            #2   <Class FetchedAppGateKeepersManager>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag = isTimestampValid(timestamp);
	//    2    3:getstatic       #70  <Field Long timestamp>
	//    3    6:invokestatic    #175 <Method boolean isTimestampValid(Long)>
	//    4    9:istore_0        
		if(!flag)
			break MISSING_BLOCK_LABEL_18;
	//    5   10:iload_0         
	//    6   11:ifeq            18
		com/facebook/internal/FetchedAppGateKeepersManager;
	//    7   14:ldc1            #2   <Class FetchedAppGateKeepersManager>
		JVM INSTR monitorexit ;
	//    8   16:monitorexit     
		return;
	//    9   17:return          
		Context context = FacebookSdk.getApplicationContext();
	//   10   18:invokestatic    #179 <Method Context FacebookSdk.getApplicationContext()>
	//   11   21:astore_1        
		String s = FacebookSdk.getApplicationId();
	//   12   22:invokestatic    #182 <Method String FacebookSdk.getApplicationId()>
	//   13   25:astore_2        
		String s1 = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[] {
			s
		});
	//   14   26:ldc1            #38  <String "com.facebook.internal.APP_GATEKEEPERS.%s">
	//   15   28:iconst_1        
	//   16   29:anewarray       Object[]
	//   17   32:dup             
	//   18   33:iconst_0        
	//   19   34:aload_2         
	//   20   35:aastore         
	//   21   36:invokestatic    #115 <Method String String.format(String, Object[])>
	//   22   39:astore_3        
		FacebookSdk.getExecutor().execute(new Runnable(context, s1, s) {

			public void run()
			{
				JSONObject jsonobject;
				Object obj;
				SharedPreferences sharedpreferences;
				sharedpreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field Context val$context>
			//    2    4:ldc1            #32  <String "com.facebook.internal.preferences.APP_GATEKEEPERS">
			//    3    6:iconst_0        
			//    4    7:invokevirtual   #38  <Method SharedPreferences Context.getSharedPreferences(String, int)>
			//    5   10:astore_3        
				obj = ((Object) (gateKeepersKey));
			//    6   11:aload_0         
			//    7   12:getfield        #22  <Field String val$gateKeepersKey>
			//    8   15:astore_2        
				jsonobject = null;
			//    9   16:aconst_null     
			//   10   17:astore_1        
				obj = ((Object) (sharedpreferences.getString(((String) (obj)), ((String) (null)))));
			//   11   18:aload_3         
			//   12   19:aload_2         
			//   13   20:aconst_null     
			//   14   21:invokeinterface #44  <Method String SharedPreferences.getString(String, String)>
			//   15   26:astore_2        
				if(Utility.isNullOrEmpty(((String) (obj))))
					break MISSING_BLOCK_LABEL_68;
			//   16   27:aload_2         
			//   17   28:invokestatic    #50  <Method boolean Utility.isNullOrEmpty(String)>
			//   18   31:ifne            68
				obj = ((Object) (new JSONObject(((String) (obj)))));
			//   19   34:new             #52  <Class JSONObject>
			//   20   37:dup             
			//   21   38:aload_2         
			//   22   39:invokespecial   #55  <Method void JSONObject(String)>
			//   23   42:astore_2        
				jsonobject = ((JSONObject) (obj));
			//   24   43:aload_2         
			//   25   44:astore_1        
				break MISSING_BLOCK_LABEL_55;
			//   26   45:goto            55
				JSONException jsonexception;
				jsonexception;
			//   27   48:astore_2        
				Utility.logd("FacebookSDK", ((Exception) (jsonexception)));
			//   28   49:ldc1            #57  <String "FacebookSDK">
			//   29   51:aload_2         
			//   30   52:invokestatic    #61  <Method void Utility.logd(String, Exception)>
				if(jsonobject != null)
			//*  31   55:aload_1         
			//*  32   56:ifnull          68
					FetchedAppGateKeepersManager.parseAppGateKeepersFromJSON(applicationId, jsonobject);
			//   33   59:aload_0         
			//   34   60:getfield        #24  <Field String val$applicationId>
			//   35   63:aload_1         
			//   36   64:invokestatic    #65  <Method JSONObject FetchedAppGateKeepersManager.access$000(String, JSONObject)>
			//   37   67:pop             
				JSONObject jsonobject1 = FetchedAppGateKeepersManager.getAppGateKeepersQueryResponse(applicationId);
			//   38   68:aload_0         
			//   39   69:getfield        #24  <Field String val$applicationId>
			//   40   72:invokestatic    #69  <Method JSONObject FetchedAppGateKeepersManager.access$100(String)>
			//   41   75:astore_1        
				if(jsonobject1 != null)
			//*  42   76:aload_1         
			//*  43   77:ifnull          123
				{
					FetchedAppGateKeepersManager.timestamp = Long.valueOf(System.currentTimeMillis());
			//   44   80:invokestatic    #75  <Method long System.currentTimeMillis()>
			//   45   83:invokestatic    #81  <Method Long Long.valueOf(long)>
			//   46   86:invokestatic    #85  <Method Long FetchedAppGateKeepersManager.access$202(Long)>
			//   47   89:pop             
					FetchedAppGateKeepersManager.parseAppGateKeepersFromJSON(applicationId, jsonobject1);
			//   48   90:aload_0         
			//   49   91:getfield        #24  <Field String val$applicationId>
			//   50   94:aload_1         
			//   51   95:invokestatic    #65  <Method JSONObject FetchedAppGateKeepersManager.access$000(String, JSONObject)>
			//   52   98:pop             
					sharedpreferences.edit().putString(gateKeepersKey, jsonobject1.toString()).apply();
			//   53   99:aload_3         
			//   54  100:invokeinterface #89  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
			//   55  105:aload_0         
			//   56  106:getfield        #22  <Field String val$gateKeepersKey>
			//   57  109:aload_1         
			//   58  110:invokevirtual   #93  <Method String JSONObject.toString()>
			//   59  113:invokeinterface #99  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
			//   60  118:invokeinterface #102 <Method void android.content.SharedPreferences$Editor.apply()>
				}
				return;
			//   61  123:return          
			}

			final String val$applicationId;
			final Context val$context;
			final String val$gateKeepersKey;

			
			{
				context = context1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Context val$context>
				gateKeepersKey = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field String val$gateKeepersKey>
				applicationId = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field String val$applicationId>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   23   40:invokestatic    #186 <Method Executor FacebookSdk.getExecutor()>
	//   24   43:new             #6   <Class FetchedAppGateKeepersManager$1>
	//   25   46:dup             
	//   26   47:aload_1         
	//   27   48:aload_3         
	//   28   49:aload_2         
	//   29   50:invokespecial   #189 <Method void FetchedAppGateKeepersManager$1(Context, String, String)>
	//   30   53:invokeinterface #195 <Method void Executor.execute(Runnable)>
		com/facebook/internal/FetchedAppGateKeepersManager;
	//   31   58:ldc1            #2   <Class FetchedAppGateKeepersManager>
		JVM INSTR monitorexit ;
	//   32   60:monitorexit     
		return;
	//   33   61:return          
		Exception exception;
		exception;
	//   34   62:astore_1        
	//*  35   63:ldc1            #2   <Class FetchedAppGateKeepersManager>
		throw exception;
	//   36   65:monitorexit     
	//   37   66:aload_1         
	//   38   67:athrow          
	}

	private static JSONObject parseAppGateKeepersFromJSON(String s, JSONObject jsonobject)
	{
		com/facebook/internal/FetchedAppGateKeepersManager;
	//    0    0:ldc1            #2   <Class FetchedAppGateKeepersManager>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		JSONObject jsonobject1;
		if(fetchedAppGateKeepers.containsKey(((Object) (s))))
	//*   2    3:getstatic       #68  <Field Map fetchedAppGateKeepers>
	//*   3    6:aload_0         
	//*   4    7:invokeinterface #150 <Method boolean Map.containsKey(Object)>
	//*   5   12:ifeq            32
		{
			jsonobject1 = (JSONObject)fetchedAppGateKeepers.get(((Object) (s)));
	//    6   15:getstatic       #68  <Field Map fetchedAppGateKeepers>
	//    7   18:aload_0         
	//    8   19:invokeinterface #154 <Method Object Map.get(Object)>
	//    9   24:checkcast       #156 <Class JSONObject>
	//   10   27:astore          4
			break MISSING_BLOCK_LABEL_41;
	//   11   29:goto            41
		}
		jsonobject1 = new JSONObject();
	//   12   32:new             #156 <Class JSONObject>
	//   13   35:dup             
	//   14   36:invokespecial   #198 <Method void JSONObject()>
	//   15   39:astore          4
		JSONArray jsonarray = jsonobject.optJSONArray("data");
	//   16   41:aload_1         
	//   17   42:ldc1            #26  <String "data">
	//   18   44:invokevirtual   #202 <Method JSONArray JSONObject.optJSONArray(String)>
	//   19   47:astore          5
		int i;
		jsonobject = null;
	//   20   49:aconst_null     
	//   21   50:astore_1        
		i = 0;
	//   22   51:iconst_0        
	//   23   52:istore_2        
		if(jsonarray == null)
			break MISSING_BLOCK_LABEL_65;
	//   24   53:aload           5
	//   25   55:ifnull          65
		jsonobject = jsonarray.optJSONObject(0);
	//   26   58:aload           5
	//   27   60:iconst_0        
	//   28   61:invokevirtual   #208 <Method JSONObject JSONArray.optJSONObject(int)>
	//   29   64:astore_1        
		if(jsonobject == null) goto _L2; else goto _L1
	//   30   65:aload_1         
	//   31   66:ifnull          137
_L1:
		if(jsonobject.optJSONArray("gatekeepers") == null) goto _L2; else goto _L3
	//   32   69:aload_1         
	//   33   70:ldc1            #23  <String "gatekeepers">
	//   34   72:invokevirtual   #202 <Method JSONArray JSONObject.optJSONArray(String)>
	//   35   75:ifnull          137
_L3:
		jsonobject = ((JSONObject) (jsonobject.optJSONArray("gatekeepers")));
	//   36   78:aload_1         
	//   37   79:ldc1            #23  <String "gatekeepers">
	//   38   81:invokevirtual   #202 <Method JSONArray JSONObject.optJSONArray(String)>
	//   39   84:astore_1        
_L5:
		int j = ((JSONArray) (jsonobject)).length();
	//   40   85:aload_1         
	//   41   86:invokevirtual   #212 <Method int JSONArray.length()>
	//   42   89:istore_3        
		if(i >= j) goto _L2; else goto _L4
	//   43   90:iload_2         
	//   44   91:iload_3         
	//   45   92:icmpge          137
_L4:
		JSONObject jsonobject2 = ((JSONArray) (jsonobject)).getJSONObject(i);
	//   46   95:aload_1         
	//   47   96:iload_2         
	//   48   97:invokevirtual   #214 <Method JSONObject JSONArray.getJSONObject(int)>
	//   49  100:astore          5
		jsonobject1.put(jsonobject2.getString("key"), jsonobject2.getBoolean("value"));
	//   50  102:aload           4
	//   51  104:aload           5
	//   52  106:ldc1            #216 <String "key">
	//   53  108:invokevirtual   #220 <Method String JSONObject.getString(String)>
	//   54  111:aload           5
	//   55  113:ldc1            #222 <String "value">
	//   56  115:invokevirtual   #226 <Method boolean JSONObject.getBoolean(String)>
	//   57  118:invokevirtual   #230 <Method JSONObject JSONObject.put(String, boolean)>
	//   58  121:pop             
		break MISSING_BLOCK_LABEL_161;
	//   59  122:goto            161
		JSONException jsonexception;
		jsonexception;
	//   60  125:astore          5
		Utility.logd("FacebookSDK", ((Exception) (jsonexception)));
	//   61  127:ldc1            #232 <String "FacebookSDK">
	//   62  129:aload           5
	//   63  131:invokestatic    #238 <Method void Utility.logd(String, Exception)>
		break MISSING_BLOCK_LABEL_161;
	//   64  134:goto            161
_L2:
		fetchedAppGateKeepers.put(((Object) (s)), ((Object) (jsonobject1)));
	//   65  137:getstatic       #68  <Field Map fetchedAppGateKeepers>
	//   66  140:aload_0         
	//   67  141:aload           4
	//   68  143:invokeinterface #241 <Method Object Map.put(Object, Object)>
	//   69  148:pop             
		com/facebook/internal/FetchedAppGateKeepersManager;
	//   70  149:ldc1            #2   <Class FetchedAppGateKeepersManager>
		JVM INSTR monitorexit ;
	//   71  151:monitorexit     
		return jsonobject1;
	//   72  152:aload           4
	//   73  154:areturn         
		s;
	//   74  155:astore_0        
	//*  75  156:ldc1            #2   <Class FetchedAppGateKeepersManager>
		throw s;
	//   76  158:monitorexit     
	//   77  159:aload_0         
	//   78  160:athrow          
		i++;
	//   79  161:iload_2         
	//   80  162:iconst_1        
	//   81  163:iadd            
	//   82  164:istore_2        
		  goto _L5
	//*  83  165:goto            85
	}

	public static JSONObject queryAppGateKeepers(String s, boolean flag)
	{
		if(!flag && fetchedAppGateKeepers.containsKey(((Object) (s))))
	//*   0    0:iload_1         
	//*   1    1:ifne            29
	//*   2    4:getstatic       #68  <Field Map fetchedAppGateKeepers>
	//*   3    7:aload_0         
	//*   4    8:invokeinterface #150 <Method boolean Map.containsKey(Object)>
	//*   5   13:ifeq            29
			return (JSONObject)fetchedAppGateKeepers.get(((Object) (s)));
	//    6   16:getstatic       #68  <Field Map fetchedAppGateKeepers>
	//    7   19:aload_0         
	//    8   20:invokeinterface #154 <Method Object Map.get(Object)>
	//    9   25:checkcast       #156 <Class JSONObject>
	//   10   28:areturn         
		JSONObject jsonobject = getAppGateKeepersQueryResponse(s);
	//   11   29:aload_0         
	//   12   30:invokestatic    #82  <Method JSONObject getAppGateKeepersQueryResponse(String)>
	//   13   33:astore_2        
		if(jsonobject == null)
	//*  14   34:aload_2         
	//*  15   35:ifnonnull       40
		{
			return null;
	//   16   38:aconst_null     
	//   17   39:areturn         
		} else
		{
			Context context = FacebookSdk.getApplicationContext();
	//   18   40:invokestatic    #179 <Method Context FacebookSdk.getApplicationContext()>
	//   19   43:astore_3        
			String s1 = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[] {
				s
			});
	//   20   44:ldc1            #38  <String "com.facebook.internal.APP_GATEKEEPERS.%s">
	//   21   46:iconst_1        
	//   22   47:anewarray       Object[]
	//   23   50:dup             
	//   24   51:iconst_0        
	//   25   52:aload_0         
	//   26   53:aastore         
	//   27   54:invokestatic    #115 <Method String String.format(String, Object[])>
	//   28   57:astore          4
			context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(s1, jsonobject.toString()).apply();
	//   29   59:aload_3         
	//   30   60:ldc1            #41  <String "com.facebook.internal.preferences.APP_GATEKEEPERS">
	//   31   62:iconst_0        
	//   32   63:invokevirtual   #248 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   33   66:invokeinterface #254 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   34   71:aload           4
	//   35   73:aload_2         
	//   36   74:invokevirtual   #257 <Method String JSONObject.toString()>
	//   37   77:invokeinterface #262 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   38   82:invokeinterface #265 <Method void android.content.SharedPreferences$Editor.apply()>
			return parseAppGateKeepersFromJSON(s, jsonobject);
	//   39   87:aload_0         
	//   40   88:aload_2         
	//   41   89:invokestatic    #77  <Method JSONObject parseAppGateKeepersFromJSON(String, JSONObject)>
	//   42   92:areturn         
		}
	}

	private static final String APPLICATION_DEVICE_ID = "device_id";
	private static final String APPLICATION_FIELDS = "fields";
	private static final long APPLICATION_GATEKEEPER_CACHE_TIMEOUT = 0x36ee80L;
	private static final String APPLICATION_GATEKEEPER_EDGE = "mobile_sdk_gk";
	private static final String APPLICATION_GATEKEEPER_FIELD = "gatekeepers";
	private static final String APPLICATION_GRAPH_DATA = "data";
	private static final String APPLICATION_PLATFORM = "platform";
	private static final String APPLICATION_SDK_VERSION = "sdk_version";
	public static final String APP_EVENTS_IF_AUTO_LOG_SUBS = "app_events_if_auto_log_subs";
	private static final String APP_GATEKEEPERS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_GATEKEEPERS.%s";
	private static final String APP_GATEKEEPERS_PREFS_STORE = "com.facebook.internal.preferences.APP_GATEKEEPERS";
	private static final String APP_PLATFORM = "android";
	private static final String TAG = ((Class) (com/facebook/internal/FetchedAppGateKeepersManager)).getCanonicalName();
	private static final Map fetchedAppGateKeepers = new ConcurrentHashMap();
	private static Long timestamp = null;

	static 
	{
	//    0    0:ldc1            #2   <Class FetchedAppGateKeepersManager>
	//    1    2:invokevirtual   #59  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #61  <Field String TAG>
	//    3    8:new             #63  <Class ConcurrentHashMap>
	//    4   11:dup             
	//    5   12:invokespecial   #66  <Method void ConcurrentHashMap()>
	//    6   15:putstatic       #68  <Field Map fetchedAppGateKeepers>
	//    7   18:aconst_null     
	//    8   19:putstatic       #70  <Field Long timestamp>
	//*   9   22:return          
	}


/*
	static JSONObject access$000(String s, JSONObject jsonobject)
	{
		return parseAppGateKeepersFromJSON(s, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #77  <Method JSONObject parseAppGateKeepersFromJSON(String, JSONObject)>
	//    3    5:areturn         
	}

*/


/*
	static JSONObject access$100(String s)
	{
		return getAppGateKeepersQueryResponse(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #82  <Method JSONObject getAppGateKeepersQueryResponse(String)>
	//    2    4:areturn         
	}

*/


/*
	static Long access$202(Long long1)
	{
		timestamp = long1;
	//    0    0:aload_0         
	//    1    1:putstatic       #70  <Field Long timestamp>
		return long1;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/
}
