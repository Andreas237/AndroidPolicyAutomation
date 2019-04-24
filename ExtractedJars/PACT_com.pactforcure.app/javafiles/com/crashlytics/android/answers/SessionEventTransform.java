// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.events.EventTransform;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.answers:
//			SessionEvent, SessionEventMetadata

class SessionEventTransform
	implements EventTransform
{

	SessionEventTransform()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void Object()>
	//    2    4:return          
	}

	public JSONObject buildJsonForEvent(SessionEvent sessionevent)
		throws IOException
	{
		JSONObject jsonobject;
		try
		{
			jsonobject = new JSONObject();
	//    0    0:new             #81  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #82  <Method void JSONObject()>
	//    3    7:astore_2        
			SessionEventMetadata sessioneventmetadata = sessionevent.sessionEventMetadata;
	//    4    8:aload_1         
	//    5    9:getfield        #88  <Field SessionEventMetadata SessionEvent.sessionEventMetadata>
	//    6   12:astore_3        
			jsonobject.put("appBundleId", ((Object) (sessioneventmetadata.appBundleId)));
	//    7   13:aload_2         
	//    8   14:ldc1            #17  <String "appBundleId">
	//    9   16:aload_3         
	//   10   17:getfield        #92  <Field String SessionEventMetadata.appBundleId>
	//   11   20:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//   12   23:pop             
			jsonobject.put("executionId", ((Object) (sessioneventmetadata.executionId)));
	//   13   24:aload_2         
	//   14   25:ldc1            #44  <String "executionId">
	//   15   27:aload_3         
	//   16   28:getfield        #98  <Field String SessionEventMetadata.executionId>
	//   17   31:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//   18   34:pop             
			jsonobject.put("installationId", ((Object) (sessioneventmetadata.installationId)));
	//   19   35:aload_2         
	//   20   36:ldc1            #47  <String "installationId">
	//   21   38:aload_3         
	//   22   39:getfield        #100 <Field String SessionEventMetadata.installationId>
	//   23   42:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//   24   45:pop             
			jsonobject.put("androidId", ((Object) (sessioneventmetadata.androidId)));
	//   25   46:aload_2         
	//   26   47:ldc1            #14  <String "androidId">
	//   27   49:aload_3         
	//   28   50:getfield        #102 <Field String SessionEventMetadata.androidId>
	//   29   53:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//   30   56:pop             
			jsonobject.put("advertisingId", ((Object) (sessioneventmetadata.advertisingId)));
	//   31   57:aload_2         
	//   32   58:ldc1            #11  <String "advertisingId">
	//   33   60:aload_3         
	//   34   61:getfield        #104 <Field String SessionEventMetadata.advertisingId>
	//   35   64:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//   36   67:pop             
			jsonobject.put("limitAdTrackingEnabled", ((Object) (sessioneventmetadata.limitAdTrackingEnabled)));
	//   37   68:aload_2         
	//   38   69:ldc1            #50  <String "limitAdTrackingEnabled">
	//   39   71:aload_3         
	//   40   72:getfield        #107 <Field Boolean SessionEventMetadata.limitAdTrackingEnabled>
	//   41   75:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//   42   78:pop             
			jsonobject.put("betaDeviceToken", ((Object) (sessioneventmetadata.betaDeviceToken)));
	//   43   79:aload_2         
	//   44   80:ldc1            #26  <String "betaDeviceToken">
	//   45   82:aload_3         
	//   46   83:getfield        #109 <Field String SessionEventMetadata.betaDeviceToken>
	//   47   86:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//   48   89:pop             
			jsonobject.put("buildId", ((Object) (sessioneventmetadata.buildId)));
	//   49   90:aload_2         
	//   50   91:ldc1            #29  <String "buildId">
	//   51   93:aload_3         
	//   52   94:getfield        #111 <Field String SessionEventMetadata.buildId>
	//   53   97:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//   54  100:pop             
			jsonobject.put("osVersion", ((Object) (sessioneventmetadata.osVersion)));
	//   55  101:aload_2         
	//   56  102:ldc1            #53  <String "osVersion">
	//   57  104:aload_3         
	//   58  105:getfield        #113 <Field String SessionEventMetadata.osVersion>
	//   59  108:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//   60  111:pop             
			jsonobject.put("deviceModel", ((Object) (sessioneventmetadata.deviceModel)));
	//   61  112:aload_2         
	//   62  113:ldc1            #41  <String "deviceModel">
	//   63  115:aload_3         
	//   64  116:getfield        #115 <Field String SessionEventMetadata.deviceModel>
	//   65  119:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//   66  122:pop             
			jsonobject.put("appVersionCode", ((Object) (sessioneventmetadata.appVersionCode)));
	//   67  123:aload_2         
	//   68  124:ldc1            #20  <String "appVersionCode">
	//   69  126:aload_3         
	//   70  127:getfield        #117 <Field String SessionEventMetadata.appVersionCode>
	//   71  130:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//   72  133:pop             
			jsonobject.put("appVersionName", ((Object) (sessioneventmetadata.appVersionName)));
	//   73  134:aload_2         
	//   74  135:ldc1            #23  <String "appVersionName">
	//   75  137:aload_3         
	//   76  138:getfield        #119 <Field String SessionEventMetadata.appVersionName>
	//   77  141:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//   78  144:pop             
			jsonobject.put("timestamp", sessionevent.timestamp);
	//   79  145:aload_2         
	//   80  146:ldc1            #62  <String "timestamp">
	//   81  148:aload_1         
	//   82  149:getfield        #122 <Field long SessionEvent.timestamp>
	//   83  152:invokevirtual   #125 <Method JSONObject JSONObject.put(String, long)>
	//   84  155:pop             
			jsonobject.put("type", ((Object) (sessionevent.type.toString())));
	//   85  156:aload_2         
	//   86  157:ldc1            #65  <String "type">
	//   87  159:aload_1         
	//   88  160:getfield        #128 <Field SessionEvent$Type SessionEvent.type>
	//   89  163:invokevirtual   #134 <Method String SessionEvent$Type.toString()>
	//   90  166:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//   91  169:pop             
			if(sessionevent.details != null)
	//*  92  170:aload_1         
	//*  93  171:getfield        #137 <Field java.util.Map SessionEvent.details>
	//*  94  174:ifnull          195
				jsonobject.put("details", ((Object) (new JSONObject(sessionevent.details))));
	//   95  177:aload_2         
	//   96  178:ldc1            #38  <String "details">
	//   97  180:new             #81  <Class JSONObject>
	//   98  183:dup             
	//   99  184:aload_1         
	//  100  185:getfield        #137 <Field java.util.Map SessionEvent.details>
	//  101  188:invokespecial   #140 <Method void JSONObject(java.util.Map)>
	//  102  191:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//  103  194:pop             
			jsonobject.put("customType", ((Object) (sessionevent.customType)));
	//  104  195:aload_2         
	//  105  196:ldc1            #35  <String "customType">
	//  106  198:aload_1         
	//  107  199:getfield        #142 <Field String SessionEvent.customType>
	//  108  202:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//  109  205:pop             
			if(sessionevent.customAttributes != null)
	//* 110  206:aload_1         
	//* 111  207:getfield        #144 <Field java.util.Map SessionEvent.customAttributes>
	//* 112  210:ifnull          231
				jsonobject.put("customAttributes", ((Object) (new JSONObject(sessionevent.customAttributes))));
	//  113  213:aload_2         
	//  114  214:ldc1            #32  <String "customAttributes">
	//  115  216:new             #81  <Class JSONObject>
	//  116  219:dup             
	//  117  220:aload_1         
	//  118  221:getfield        #144 <Field java.util.Map SessionEvent.customAttributes>
	//  119  224:invokespecial   #140 <Method void JSONObject(java.util.Map)>
	//  120  227:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//  121  230:pop             
			jsonobject.put("predefinedType", ((Object) (sessionevent.predefinedType)));
	//  122  231:aload_2         
	//  123  232:ldc1            #59  <String "predefinedType">
	//  124  234:aload_1         
	//  125  235:getfield        #146 <Field String SessionEvent.predefinedType>
	//  126  238:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//  127  241:pop             
			if(sessionevent.predefinedAttributes != null)
	//* 128  242:aload_1         
	//* 129  243:getfield        #148 <Field java.util.Map SessionEvent.predefinedAttributes>
	//* 130  246:ifnull          267
				jsonobject.put("predefinedAttributes", ((Object) (new JSONObject(sessionevent.predefinedAttributes))));
	//  131  249:aload_2         
	//  132  250:ldc1            #56  <String "predefinedAttributes">
	//  133  252:new             #81  <Class JSONObject>
	//  134  255:dup             
	//  135  256:aload_1         
	//  136  257:getfield        #148 <Field java.util.Map SessionEvent.predefinedAttributes>
	//  137  260:invokespecial   #140 <Method void JSONObject(java.util.Map)>
	//  138  263:invokevirtual   #96  <Method JSONObject JSONObject.put(String, Object)>
	//  139  266:pop             
		}
	//* 140  267:aload_2         
	//* 141  268:areturn         
		// Misplaced declaration of an exception variable
		catch(SessionEvent sessionevent)
	//* 142  269:astore_1        
		{
			if(android.os.Build.VERSION.SDK_INT >= 9)
	//* 143  270:getstatic       #154 <Field int android.os.Build$VERSION.SDK_INT>
	//* 144  273:bipush          9
	//* 145  275:icmplt          291
				throw new IOException(((JSONException) (sessionevent)).getMessage(), ((Throwable) (sessionevent)));
	//  146  278:new             #74  <Class IOException>
	//  147  281:dup             
	//  148  282:aload_1         
	//  149  283:invokevirtual   #157 <Method String JSONException.getMessage()>
	//  150  286:aload_1         
	//  151  287:invokespecial   #160 <Method void IOException(String, Throwable)>
	//  152  290:athrow          
			else
				throw new IOException(((JSONException) (sessionevent)).getMessage());
	//  153  291:new             #74  <Class IOException>
	//  154  294:dup             
	//  155  295:aload_1         
	//  156  296:invokevirtual   #157 <Method String JSONException.getMessage()>
	//  157  299:invokespecial   #163 <Method void IOException(String)>
	//  158  302:athrow          
		}
		return jsonobject;
	}

	public byte[] toBytes(SessionEvent sessionevent)
		throws IOException
	{
		return buildJsonForEvent(sessionevent).toString().getBytes("UTF-8");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #169 <Method JSONObject buildJsonForEvent(SessionEvent)>
	//    3    5:invokevirtual   #170 <Method String JSONObject.toString()>
	//    4    8:ldc1            #172 <String "UTF-8">
	//    5   10:invokevirtual   #178 <Method byte[] String.getBytes(String)>
	//    6   13:areturn         
	}

	public volatile byte[] toBytes(Object obj)
		throws IOException
	{
		return toBytes((SessionEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #84  <Class SessionEvent>
	//    3    5:invokevirtual   #181 <Method byte[] toBytes(SessionEvent)>
	//    4    8:areturn         
	}

	static final String ADVERTISING_ID_KEY = "advertisingId";
	static final String ANDROID_ID_KEY = "androidId";
	static final String APP_BUNDLE_ID_KEY = "appBundleId";
	static final String APP_VERSION_CODE_KEY = "appVersionCode";
	static final String APP_VERSION_NAME_KEY = "appVersionName";
	static final String BETA_DEVICE_TOKEN_KEY = "betaDeviceToken";
	static final String BUILD_ID_KEY = "buildId";
	static final String CUSTOM_ATTRIBUTES = "customAttributes";
	static final String CUSTOM_TYPE = "customType";
	static final String DETAILS_KEY = "details";
	static final String DEVICE_MODEL_KEY = "deviceModel";
	static final String EXECUTION_ID_KEY = "executionId";
	static final String INSTALLATION_ID_KEY = "installationId";
	static final String LIMIT_AD_TRACKING_ENABLED_KEY = "limitAdTrackingEnabled";
	static final String OS_VERSION_KEY = "osVersion";
	static final String PREDEFINED_ATTRIBUTES = "predefinedAttributes";
	static final String PREDEFINED_TYPE = "predefinedType";
	static final String TIMESTAMP_KEY = "timestamp";
	static final String TYPE_KEY = "type";
}
