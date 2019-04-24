// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.network.*;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//			SettingsSpiCall, SettingsRequest

class DefaultSettingsSpiCall extends AbstractSpiCall
	implements SettingsSpiCall
{

	public DefaultSettingsSpiCall(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory)
	{
		this(kit, s, s1, httprequestfactory, HttpMethod.GET);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:getstatic       #48  <Field HttpMethod HttpMethod.GET>
	//    6    9:invokespecial   #51  <Method void DefaultSettingsSpiCall(Kit, String, String, HttpRequestFactory, HttpMethod)>
	//    7   12:return          
	}

	DefaultSettingsSpiCall(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory, HttpMethod httpmethod)
	{
		super(kit, s, s1, httprequestfactory, httpmethod);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #53  <Method void AbstractSpiCall(Kit, String, String, HttpRequestFactory, HttpMethod)>
	//    7   11:return          
	}

	private HttpRequest applyHeadersTo(HttpRequest httprequest, SettingsRequest settingsrequest)
	{
		applyNonNullHeader(httprequest, "X-CRASHLYTICS-API-KEY", settingsrequest.apiKey);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #57  <String "X-CRASHLYTICS-API-KEY">
	//    3    4:aload_2         
	//    4    5:getfield        #62  <Field String SettingsRequest.apiKey>
	//    5    8:invokespecial   #66  <Method void applyNonNullHeader(HttpRequest, String, String)>
		applyNonNullHeader(httprequest, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:ldc1            #68  <String "X-CRASHLYTICS-API-CLIENT-TYPE">
	//    9   15:ldc1            #70  <String "android">
	//   10   17:invokespecial   #66  <Method void applyNonNullHeader(HttpRequest, String, String)>
		applyNonNullHeader(httprequest, "X-CRASHLYTICS-API-CLIENT-VERSION", kit.getVersion());
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:ldc1            #72  <String "X-CRASHLYTICS-API-CLIENT-VERSION">
	//   14   24:aload_0         
	//   15   25:getfield        #76  <Field Kit kit>
	//   16   28:invokevirtual   #82  <Method String Kit.getVersion()>
	//   17   31:invokespecial   #66  <Method void applyNonNullHeader(HttpRequest, String, String)>
		applyNonNullHeader(httprequest, "Accept", "application/json");
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:ldc1            #84  <String "Accept">
	//   21   38:ldc1            #86  <String "application/json">
	//   22   40:invokespecial   #66  <Method void applyNonNullHeader(HttpRequest, String, String)>
		applyNonNullHeader(httprequest, "X-CRASHLYTICS-DEVICE-MODEL", settingsrequest.deviceModel);
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:ldc1            #22  <String "X-CRASHLYTICS-DEVICE-MODEL">
	//   26   47:aload_2         
	//   27   48:getfield        #89  <Field String SettingsRequest.deviceModel>
	//   28   51:invokespecial   #66  <Method void applyNonNullHeader(HttpRequest, String, String)>
		applyNonNullHeader(httprequest, "X-CRASHLYTICS-OS-BUILD-VERSION", settingsrequest.osBuildVersion);
	//   29   54:aload_0         
	//   30   55:aload_1         
	//   31   56:ldc1            #28  <String "X-CRASHLYTICS-OS-BUILD-VERSION">
	//   32   58:aload_2         
	//   33   59:getfield        #92  <Field String SettingsRequest.osBuildVersion>
	//   34   62:invokespecial   #66  <Method void applyNonNullHeader(HttpRequest, String, String)>
		applyNonNullHeader(httprequest, "X-CRASHLYTICS-OS-DISPLAY-VERSION", settingsrequest.osDisplayVersion);
	//   35   65:aload_0         
	//   36   66:aload_1         
	//   37   67:ldc1            #31  <String "X-CRASHLYTICS-OS-DISPLAY-VERSION">
	//   38   69:aload_2         
	//   39   70:getfield        #95  <Field String SettingsRequest.osDisplayVersion>
	//   40   73:invokespecial   #66  <Method void applyNonNullHeader(HttpRequest, String, String)>
		applyNonNullHeader(httprequest, "X-CRASHLYTICS-ADVERTISING-TOKEN", settingsrequest.advertisingId);
	//   41   76:aload_0         
	//   42   77:aload_1         
	//   43   78:ldc1            #16  <String "X-CRASHLYTICS-ADVERTISING-TOKEN">
	//   44   80:aload_2         
	//   45   81:getfield        #98  <Field String SettingsRequest.advertisingId>
	//   46   84:invokespecial   #66  <Method void applyNonNullHeader(HttpRequest, String, String)>
		applyNonNullHeader(httprequest, "X-CRASHLYTICS-INSTALLATION-ID", settingsrequest.installationId);
	//   47   87:aload_0         
	//   48   88:aload_1         
	//   49   89:ldc1            #25  <String "X-CRASHLYTICS-INSTALLATION-ID">
	//   50   91:aload_2         
	//   51   92:getfield        #101 <Field String SettingsRequest.installationId>
	//   52   95:invokespecial   #66  <Method void applyNonNullHeader(HttpRequest, String, String)>
		applyNonNullHeader(httprequest, "X-CRASHLYTICS-ANDROID-ID", settingsrequest.androidId);
	//   53   98:aload_0         
	//   54   99:aload_1         
	//   55  100:ldc1            #19  <String "X-CRASHLYTICS-ANDROID-ID">
	//   56  102:aload_2         
	//   57  103:getfield        #104 <Field String SettingsRequest.androidId>
	//   58  106:invokespecial   #66  <Method void applyNonNullHeader(HttpRequest, String, String)>
		return httprequest;
	//   59  109:aload_1         
	//   60  110:areturn         
	}

	private void applyNonNullHeader(HttpRequest httprequest, String s, String s1)
	{
		if(s1 != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          11
			httprequest.header(s, s1);
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #110 <Method HttpRequest HttpRequest.header(String, String)>
	//    6   10:pop             
	//    7   11:return          
	}

	private JSONObject getJsonObjectFrom(String s)
	{
		JSONObject jsonobject;
		try
		{
			jsonobject = new JSONObject(s);
	//    0    0:new             #116 <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #119 <Method void JSONObject(String)>
	//    4    8:astore_2        
		}
	//*   5    9:aload_2         
	//*   6   10:areturn         
		catch(Exception exception)
	//*   7   11:astore_2        
		{
			Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Failed to parse settings JSON from ").append(getUrl()).toString(), ((Throwable) (exception)));
	//    8   12:invokestatic    #125 <Method Logger Fabric.getLogger()>
	//    9   15:ldc1            #127 <String "Fabric">
	//   10   17:new             #129 <Class StringBuilder>
	//   11   20:dup             
	//   12   21:invokespecial   #132 <Method void StringBuilder()>
	//   13   24:ldc1            #134 <String "Failed to parse settings JSON from ">
	//   14   26:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   15   29:aload_0         
	//   16   30:invokevirtual   #141 <Method String getUrl()>
	//   17   33:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   19   39:aload_2         
	//   20   40:invokeinterface #150 <Method void Logger.d(String, String, Throwable)>
			Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Settings response ").append(s).toString());
	//   21   45:invokestatic    #125 <Method Logger Fabric.getLogger()>
	//   22   48:ldc1            #127 <String "Fabric">
	//   23   50:new             #129 <Class StringBuilder>
	//   24   53:dup             
	//   25   54:invokespecial   #132 <Method void StringBuilder()>
	//   26   57:ldc1            #152 <String "Settings response ">
	//   27   59:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   28   62:aload_1         
	//   29   63:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   30   66:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   31   69:invokeinterface #155 <Method void Logger.d(String, String)>
			return null;
	//   32   74:aconst_null     
	//   33   75:areturn         
		}
		return jsonobject;
	}

	private Map getQueryParamsFor(SettingsRequest settingsrequest)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #159 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #160 <Method void HashMap()>
	//    3    7:astore_2        
		((Map) (hashmap)).put("build_version", ((Object) (settingsrequest.buildVersion)));
	//    4    8:aload_2         
	//    5    9:ldc1            #10  <String "build_version">
	//    6   11:aload_1         
	//    7   12:getfield        #163 <Field String SettingsRequest.buildVersion>
	//    8   15:invokeinterface #169 <Method Object Map.put(Object, Object)>
	//    9   20:pop             
		((Map) (hashmap)).put("display_version", ((Object) (settingsrequest.displayVersion)));
	//   10   21:aload_2         
	//   11   22:ldc1            #13  <String "display_version">
	//   12   24:aload_1         
	//   13   25:getfield        #172 <Field String SettingsRequest.displayVersion>
	//   14   28:invokeinterface #169 <Method Object Map.put(Object, Object)>
	//   15   33:pop             
		((Map) (hashmap)).put("source", ((Object) (Integer.toString(settingsrequest.source))));
	//   16   34:aload_2         
	//   17   35:ldc1            #40  <String "source">
	//   18   37:aload_1         
	//   19   38:getfield        #175 <Field int SettingsRequest.source>
	//   20   41:invokestatic    #180 <Method String Integer.toString(int)>
	//   21   44:invokeinterface #169 <Method Object Map.put(Object, Object)>
	//   22   49:pop             
		if(settingsrequest.iconHash != null)
	//*  23   50:aload_1         
	//*  24   51:getfield        #183 <Field String SettingsRequest.iconHash>
	//*  25   54:ifnull          70
			((Map) (hashmap)).put("icon_hash", ((Object) (settingsrequest.iconHash)));
	//   26   57:aload_2         
	//   27   58:ldc1            #34  <String "icon_hash">
	//   28   60:aload_1         
	//   29   61:getfield        #183 <Field String SettingsRequest.iconHash>
	//   30   64:invokeinterface #169 <Method Object Map.put(Object, Object)>
	//   31   69:pop             
		settingsrequest = ((SettingsRequest) (settingsrequest.instanceId));
	//   32   70:aload_1         
	//   33   71:getfield        #186 <Field String SettingsRequest.instanceId>
	//   34   74:astore_1        
		if(!CommonUtils.isNullOrEmpty(((String) (settingsrequest))))
	//*  35   75:aload_1         
	//*  36   76:invokestatic    #192 <Method boolean CommonUtils.isNullOrEmpty(String)>
	//*  37   79:ifne            92
			((Map) (hashmap)).put("instance", ((Object) (settingsrequest)));
	//   38   82:aload_2         
	//   39   83:ldc1            #37  <String "instance">
	//   40   85:aload_1         
	//   41   86:invokeinterface #169 <Method Object Map.put(Object, Object)>
	//   42   91:pop             
		return ((Map) (hashmap));
	//   43   92:aload_2         
	//   44   93:areturn         
	}

	JSONObject handleResponse(HttpRequest httprequest)
	{
		int i = httprequest.code();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #200 <Method int HttpRequest.code()>
	//    2    4:istore_2        
		Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Settings result was: ").append(i).toString());
	//    3    5:invokestatic    #125 <Method Logger Fabric.getLogger()>
	//    4    8:ldc1            #127 <String "Fabric">
	//    5   10:new             #129 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #132 <Method void StringBuilder()>
	//    8   17:ldc1            #202 <String "Settings result was: ">
	//    9   19:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:iload_2         
	//   11   23:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   12   26:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   13   29:invokeinterface #155 <Method void Logger.d(String, String)>
		if(requestWasSuccessful(i))
	//*  14   34:aload_0         
	//*  15   35:iload_2         
	//*  16   36:invokevirtual   #209 <Method boolean requestWasSuccessful(int)>
	//*  17   39:ifeq            51
		{
			return getJsonObjectFrom(httprequest.body());
	//   18   42:aload_0         
	//   19   43:aload_1         
	//   20   44:invokevirtual   #212 <Method String HttpRequest.body()>
	//   21   47:invokespecial   #214 <Method JSONObject getJsonObjectFrom(String)>
	//   22   50:areturn         
		} else
		{
			Fabric.getLogger().e("Fabric", (new StringBuilder()).append("Failed to retrieve settings from ").append(getUrl()).toString());
	//   23   51:invokestatic    #125 <Method Logger Fabric.getLogger()>
	//   24   54:ldc1            #127 <String "Fabric">
	//   25   56:new             #129 <Class StringBuilder>
	//   26   59:dup             
	//   27   60:invokespecial   #132 <Method void StringBuilder()>
	//   28   63:ldc1            #216 <String "Failed to retrieve settings from ">
	//   29   65:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   30   68:aload_0         
	//   31   69:invokevirtual   #141 <Method String getUrl()>
	//   32   72:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   33   75:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   34   78:invokeinterface #219 <Method void Logger.e(String, String)>
			return null;
	//   35   83:aconst_null     
	//   36   84:areturn         
		}
	}

	public JSONObject invoke(SettingsRequest settingsrequest)
	{
		Object obj;
		Object obj1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		obj = obj1;
	//    2    2:aload_3         
	//    3    3:astore_2        
		Map map = getQueryParamsFor(settingsrequest);
	//    4    4:aload_0         
	//    5    5:aload_1         
	//    6    6:invokespecial   #223 <Method Map getQueryParamsFor(SettingsRequest)>
	//    7    9:astore          4
		obj = obj1;
	//    8   11:aload_3         
	//    9   12:astore_2        
		obj1 = ((Object) (getHttpRequest(map)));
	//   10   13:aload_0         
	//   11   14:aload           4
	//   12   16:invokevirtual   #227 <Method HttpRequest getHttpRequest(Map)>
	//   13   19:astore_3        
		obj = obj1;
	//   14   20:aload_3         
	//   15   21:astore_2        
		settingsrequest = ((SettingsRequest) (applyHeadersTo(((HttpRequest) (obj1)), settingsrequest)));
	//   16   22:aload_0         
	//   17   23:aload_3         
	//   18   24:aload_1         
	//   19   25:invokespecial   #229 <Method HttpRequest applyHeadersTo(HttpRequest, SettingsRequest)>
	//   20   28:astore_1        
		obj = ((Object) (settingsrequest));
	//   21   29:aload_1         
	//   22   30:astore_2        
		Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Requesting settings from ").append(getUrl()).toString());
	//   23   31:invokestatic    #125 <Method Logger Fabric.getLogger()>
	//   24   34:ldc1            #127 <String "Fabric">
	//   25   36:new             #129 <Class StringBuilder>
	//   26   39:dup             
	//   27   40:invokespecial   #132 <Method void StringBuilder()>
	//   28   43:ldc1            #231 <String "Requesting settings from ">
	//   29   45:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   30   48:aload_0         
	//   31   49:invokevirtual   #141 <Method String getUrl()>
	//   32   52:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   33   55:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   34   58:invokeinterface #155 <Method void Logger.d(String, String)>
		obj = ((Object) (settingsrequest));
	//   35   63:aload_1         
	//   36   64:astore_2        
		Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Settings query params were: ").append(((Object) (map))).toString());
	//   37   65:invokestatic    #125 <Method Logger Fabric.getLogger()>
	//   38   68:ldc1            #127 <String "Fabric">
	//   39   70:new             #129 <Class StringBuilder>
	//   40   73:dup             
	//   41   74:invokespecial   #132 <Method void StringBuilder()>
	//   42   77:ldc1            #233 <String "Settings query params were: ">
	//   43   79:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   44   82:aload           4
	//   45   84:invokevirtual   #236 <Method StringBuilder StringBuilder.append(Object)>
	//   46   87:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   47   90:invokeinterface #155 <Method void Logger.d(String, String)>
		obj = ((Object) (settingsrequest));
	//   48   95:aload_1         
	//   49   96:astore_2        
		obj1 = ((Object) (handleResponse(((HttpRequest) (settingsrequest)))));
	//   50   97:aload_0         
	//   51   98:aload_1         
	//   52   99:invokevirtual   #238 <Method JSONObject handleResponse(HttpRequest)>
	//   53  102:astore_3        
		if(settingsrequest != null)
	//*  54  103:aload_1         
	//*  55  104:ifnull          141
			Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Settings request ID: ").append(((HttpRequest) (settingsrequest)).header("X-REQUEST-ID")).toString());
	//   56  107:invokestatic    #125 <Method Logger Fabric.getLogger()>
	//   57  110:ldc1            #127 <String "Fabric">
	//   58  112:new             #129 <Class StringBuilder>
	//   59  115:dup             
	//   60  116:invokespecial   #132 <Method void StringBuilder()>
	//   61  119:ldc1            #240 <String "Settings request ID: ">
	//   62  121:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   63  124:aload_1         
	//   64  125:ldc1            #242 <String "X-REQUEST-ID">
	//   65  127:invokevirtual   #245 <Method String HttpRequest.header(String)>
	//   66  130:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   67  133:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   68  136:invokeinterface #155 <Method void Logger.d(String, String)>
		return ((JSONObject) (obj1));
	//   69  141:aload_3         
	//   70  142:areturn         
		settingsrequest;
	//   71  143:astore_1        
		if(obj != null)
	//*  72  144:aload_2         
	//*  73  145:ifnull          182
			Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Settings request ID: ").append(((HttpRequest) (obj)).header("X-REQUEST-ID")).toString());
	//   74  148:invokestatic    #125 <Method Logger Fabric.getLogger()>
	//   75  151:ldc1            #127 <String "Fabric">
	//   76  153:new             #129 <Class StringBuilder>
	//   77  156:dup             
	//   78  157:invokespecial   #132 <Method void StringBuilder()>
	//   79  160:ldc1            #240 <String "Settings request ID: ">
	//   80  162:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   81  165:aload_2         
	//   82  166:ldc1            #242 <String "X-REQUEST-ID">
	//   83  168:invokevirtual   #245 <Method String HttpRequest.header(String)>
	//   84  171:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   85  174:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   86  177:invokeinterface #155 <Method void Logger.d(String, String)>
		throw settingsrequest;
	//   87  182:aload_1         
	//   88  183:athrow          
	}

	boolean requestWasSuccessful(int i)
	{
		return i == 200 || i == 201 || i == 202 || i == 203;
	//    0    0:iload_1         
	//    1    1:sipush          200
	//    2    4:icmpeq          28
	//    3    7:iload_1         
	//    4    8:sipush          201
	//    5   11:icmpeq          28
	//    6   14:iload_1         
	//    7   15:sipush          202
	//    8   18:icmpeq          28
	//    9   21:iload_1         
	//   10   22:sipush          203
	//   11   25:icmpne          30
	//   12   28:iconst_1        
	//   13   29:ireturn         
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	static final String BUILD_VERSION_PARAM = "build_version";
	static final String DISPLAY_VERSION_PARAM = "display_version";
	static final String HEADER_ADVERTISING_TOKEN = "X-CRASHLYTICS-ADVERTISING-TOKEN";
	static final String HEADER_ANDROID_ID = "X-CRASHLYTICS-ANDROID-ID";
	static final String HEADER_DEVICE_MODEL = "X-CRASHLYTICS-DEVICE-MODEL";
	static final String HEADER_INSTALLATION_ID = "X-CRASHLYTICS-INSTALLATION-ID";
	static final String HEADER_OS_BUILD_VERSION = "X-CRASHLYTICS-OS-BUILD-VERSION";
	static final String HEADER_OS_DISPLAY_VERSION = "X-CRASHLYTICS-OS-DISPLAY-VERSION";
	static final String ICON_HASH = "icon_hash";
	static final String INSTANCE_PARAM = "instance";
	static final String SOURCE_PARAM = "source";
}
