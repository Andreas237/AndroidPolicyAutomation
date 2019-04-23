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
	//    1    1:invokespecial   #63  <Method void Object()>
	//    2    4:return          
	}

	public JSONObject buildJsonForEvent(SessionEvent sessionevent)
		throws IOException
	{
		JSONObject jsonobject;
		try
		{
			jsonobject = new JSONObject();
	//    0    0:new             #75  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #76  <Method void JSONObject()>
	//    3    7:astore_2        
			SessionEventMetadata sessioneventmetadata = sessionevent.sessionEventMetadata;
	//    4    8:aload_1         
	//    5    9:getfield        #82  <Field SessionEventMetadata SessionEvent.sessionEventMetadata>
	//    6   12:astore_3        
			jsonobject.put("appBundleId", ((Object) (sessioneventmetadata.appBundleId)));
	//    7   13:aload_2         
	//    8   14:ldc1            #11  <String "appBundleId">
	//    9   16:aload_3         
	//   10   17:getfield        #86  <Field String SessionEventMetadata.appBundleId>
	//   11   20:invokevirtual   #90  <Method JSONObject JSONObject.put(String, Object)>
	//   12   23:pop             
			jsonobject.put("executionId", ((Object) (sessioneventmetadata.executionId)));
	//   13   24:aload_2         
	//   14   25:ldc1            #38  <String "executionId">
	//   15   27:aload_3         
	//   16   28:getfield        #92  <Field String SessionEventMetadata.executionId>
	//   17   31:invokevirtual   #90  <Method JSONObject JSONObject.put(String, Object)>
	//   18   34:pop             
			jsonobject.put("installationId", ((Object) (sessioneventmetadata.installationId)));
	//   19   35:aload_2         
	//   20   36:ldc1            #41  <String "installationId">
	//   21   38:aload_3         
	//   22   39:getfield        #94  <Field String SessionEventMetadata.installationId>
	//   23   42:invokevirtual   #90  <Method JSONObject JSONObject.put(String, Object)>
	//   24   45:pop             
			jsonobject.put("limitAdTrackingEnabled", ((Object) (sessioneventmetadata.limitAdTrackingEnabled)));
	//   25   46:aload_2         
	//   26   47:ldc1            #44  <String "limitAdTrackingEnabled">
	//   27   49:aload_3         
	//   28   50:getfield        #97  <Field Boolean SessionEventMetadata.limitAdTrackingEnabled>
	//   29   53:invokevirtual   #90  <Method JSONObject JSONObject.put(String, Object)>
	//   30   56:pop             
			jsonobject.put("betaDeviceToken", ((Object) (sessioneventmetadata.betaDeviceToken)));
	//   31   57:aload_2         
	//   32   58:ldc1            #20  <String "betaDeviceToken">
	//   33   60:aload_3         
	//   34   61:getfield        #99  <Field String SessionEventMetadata.betaDeviceToken>
	//   35   64:invokevirtual   #90  <Method JSONObject JSONObject.put(String, Object)>
	//   36   67:pop             
			jsonobject.put("buildId", ((Object) (sessioneventmetadata.buildId)));
	//   37   68:aload_2         
	//   38   69:ldc1            #23  <String "buildId">
	//   39   71:aload_3         
	//   40   72:getfield        #101 <Field String SessionEventMetadata.buildId>
	//   41   75:invokevirtual   #90  <Method JSONObject JSONObject.put(String, Object)>
	//   42   78:pop             
			jsonobject.put("osVersion", ((Object) (sessioneventmetadata.osVersion)));
	//   43   79:aload_2         
	//   44   80:ldc1            #47  <String "osVersion">
	//   45   82:aload_3         
	//   46   83:getfield        #103 <Field String SessionEventMetadata.osVersion>
	//   47   86:invokevirtual   #90  <Method JSONObject JSONObject.put(String, Object)>
	//   48   89:pop             
			jsonobject.put("deviceModel", ((Object) (sessioneventmetadata.deviceModel)));
	//   49   90:aload_2         
	//   50   91:ldc1            #35  <String "deviceModel">
	//   51   93:aload_3         
	//   52   94:getfield        #105 <Field String SessionEventMetadata.deviceModel>
	//   53   97:invokevirtual   #90  <Method JSONObject JSONObject.put(String, Object)>
	//   54  100:pop             
			jsonobject.put("appVersionCode", ((Object) (sessioneventmetadata.appVersionCode)));
	//   55  101:aload_2         
	//   56  102:ldc1            #14  <String "appVersionCode">
	//   57  104:aload_3         
	//   58  105:getfield        #107 <Field String SessionEventMetadata.appVersionCode>
	//   59  108:invokevirtual   #90  <Method JSONObject JSONObject.put(String, Object)>
	//   60  111:pop             
			jsonobject.put("appVersionName", ((Object) (sessioneventmetadata.appVersionName)));
	//   61  112:aload_2         
	//   62  113:ldc1            #17  <String "appVersionName">
	//   63  115:aload_3         
	//   64  116:getfield        #109 <Field String SessionEventMetadata.appVersionName>
	//   65  119:invokevirtual   #90  <Method JSONObject JSONObject.put(String, Object)>
	//   66  122:pop             
			jsonobject.put("timestamp", sessionevent.timestamp);
	//   67  123:aload_2         
	//   68  124:ldc1            #56  <String "timestamp">
	//   69  126:aload_1         
	//   70  127:getfield        #112 <Field long SessionEvent.timestamp>
	//   71  130:invokevirtual   #115 <Method JSONObject JSONObject.put(String, long)>
	//   72  133:pop             
			jsonobject.put("type", ((Object) (sessionevent.type.toString())));
	//   73  134:aload_2         
	//   74  135:ldc1            #59  <String "type">
	//   75  137:aload_1         
	//   76  138:getfield        #118 <Field SessionEvent$Type SessionEvent.type>
	//   77  141:invokevirtual   #124 <Method String SessionEvent$Type.toString()>
	//   78  144:invokevirtual   #90  <Method JSONObject JSONObject.put(String, Object)>
	//   79  147:pop             
			if(sessionevent.details != null)
	//*  80  148:aload_1         
	//*  81  149:getfield        #127 <Field java.util.Map SessionEvent.details>
	//*  82  152:ifnull          173
				jsonobject.put("details", ((Object) (new JSONObject(sessionevent.details))));
	//   83  155:aload_2         
	//   84  156:ldc1            #32  <String "details">
	//   85  158:new             #75  <Class JSONObject>
	//   86  161:dup             
	//   87  162:aload_1         
	//   88  163:getfield        #127 <Field java.util.Map SessionEvent.details>
	//   89  166:invokespecial   #130 <Method void JSONObject(java.util.Map)>
	//   90  169:invokevirtual   #90  <Method JSONObject JSONObject.put(String, Object)>
	//   91  172:pop             
			jsonobject.put("customType", ((Object) (sessionevent.customType)));
	//   92  173:aload_2         
	//   93  174:ldc1            #29  <String "customType">
	//   94  176:aload_1         
	//   95  177:getfield        #132 <Field String SessionEvent.customType>
	//   96  180:invokevirtual   #90  <Method JSONObject JSONObject.put(String, Object)>
	//   97  183:pop             
			if(sessionevent.customAttributes != null)
	//*  98  184:aload_1         
	//*  99  185:getfield        #134 <Field java.util.Map SessionEvent.customAttributes>
	//* 100  188:ifnull          209
				jsonobject.put("customAttributes", ((Object) (new JSONObject(sessionevent.customAttributes))));
	//  101  191:aload_2         
	//  102  192:ldc1            #26  <String "customAttributes">
	//  103  194:new             #75  <Class JSONObject>
	//  104  197:dup             
	//  105  198:aload_1         
	//  106  199:getfield        #134 <Field java.util.Map SessionEvent.customAttributes>
	//  107  202:invokespecial   #130 <Method void JSONObject(java.util.Map)>
	//  108  205:invokevirtual   #90  <Method JSONObject JSONObject.put(String, Object)>
	//  109  208:pop             
			jsonobject.put("predefinedType", ((Object) (sessionevent.predefinedType)));
	//  110  209:aload_2         
	//  111  210:ldc1            #53  <String "predefinedType">
	//  112  212:aload_1         
	//  113  213:getfield        #136 <Field String SessionEvent.predefinedType>
	//  114  216:invokevirtual   #90  <Method JSONObject JSONObject.put(String, Object)>
	//  115  219:pop             
			if(sessionevent.predefinedAttributes != null)
	//* 116  220:aload_1         
	//* 117  221:getfield        #138 <Field java.util.Map SessionEvent.predefinedAttributes>
	//* 118  224:ifnull          245
				jsonobject.put("predefinedAttributes", ((Object) (new JSONObject(sessionevent.predefinedAttributes))));
	//  119  227:aload_2         
	//  120  228:ldc1            #50  <String "predefinedAttributes">
	//  121  230:new             #75  <Class JSONObject>
	//  122  233:dup             
	//  123  234:aload_1         
	//  124  235:getfield        #138 <Field java.util.Map SessionEvent.predefinedAttributes>
	//  125  238:invokespecial   #130 <Method void JSONObject(java.util.Map)>
	//  126  241:invokevirtual   #90  <Method JSONObject JSONObject.put(String, Object)>
	//  127  244:pop             
		}
	//* 128  245:aload_2         
	//* 129  246:areturn         
		// Misplaced declaration of an exception variable
		catch(SessionEvent sessionevent)
	//* 130  247:astore_1        
		{
			if(android.os.Build.VERSION.SDK_INT >= 9)
	//* 131  248:getstatic       #144 <Field int android.os.Build$VERSION.SDK_INT>
	//* 132  251:bipush          9
	//* 133  253:icmplt          269
				throw new IOException(((JSONException) (sessionevent)).getMessage(), ((Throwable) (sessionevent)));
	//  134  256:new             #68  <Class IOException>
	//  135  259:dup             
	//  136  260:aload_1         
	//  137  261:invokevirtual   #147 <Method String JSONException.getMessage()>
	//  138  264:aload_1         
	//  139  265:invokespecial   #150 <Method void IOException(String, Throwable)>
	//  140  268:athrow          
			else
				throw new IOException(((JSONException) (sessionevent)).getMessage());
	//  141  269:new             #68  <Class IOException>
	//  142  272:dup             
	//  143  273:aload_1         
	//  144  274:invokevirtual   #147 <Method String JSONException.getMessage()>
	//  145  277:invokespecial   #153 <Method void IOException(String)>
	//  146  280:athrow          
		}
		return jsonobject;
	}

	public byte[] toBytes(SessionEvent sessionevent)
		throws IOException
	{
		return buildJsonForEvent(sessionevent).toString().getBytes("UTF-8");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #159 <Method JSONObject buildJsonForEvent(SessionEvent)>
	//    3    5:invokevirtual   #160 <Method String JSONObject.toString()>
	//    4    8:ldc1            #162 <String "UTF-8">
	//    5   10:invokevirtual   #168 <Method byte[] String.getBytes(String)>
	//    6   13:areturn         
	}

	public volatile byte[] toBytes(Object obj)
		throws IOException
	{
		return toBytes((SessionEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #78  <Class SessionEvent>
	//    3    5:invokevirtual   #171 <Method byte[] toBytes(SessionEvent)>
	//    4    8:areturn         
	}

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
