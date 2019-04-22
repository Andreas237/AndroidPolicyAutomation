// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.content.Context;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.*;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppEventsLoggerUtility
{
	public static final class GraphAPIActivityType extends Enum
	{

		public static GraphAPIActivityType valueOf(String s)
		{
			return (GraphAPIActivityType)Enum.valueOf(com/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType, s);
		//    0    0:ldc1            #2   <Class AppEventsLoggerUtility$GraphAPIActivityType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AppEventsLoggerUtility$GraphAPIActivityType>
		//    4    9:areturn         
		}

		public static GraphAPIActivityType[] values()
		{
			return (GraphAPIActivityType[])((GraphAPIActivityType []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field AppEventsLoggerUtility$GraphAPIActivityType[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.appevents.internal.AppEventsLoggerUtility$GraphAPIActivityType_3B_.clone()>
		//    2    6:checkcast       #38  <Class AppEventsLoggerUtility$GraphAPIActivityType[]>
		//    3    9:areturn         
		}

		private static final GraphAPIActivityType $VALUES[];
		public static final GraphAPIActivityType CUSTOM_APP_EVENTS;
		public static final GraphAPIActivityType MOBILE_INSTALL_EVENT;

		static 
		{
			MOBILE_INSTALL_EVENT = new GraphAPIActivityType("MOBILE_INSTALL_EVENT", 0);
		//    0    0:new             #2   <Class AppEventsLoggerUtility$GraphAPIActivityType>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "MOBILE_INSTALL_EVENT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void AppEventsLoggerUtility$GraphAPIActivityType(String, int)>
		//    5   10:putstatic       #22  <Field AppEventsLoggerUtility$GraphAPIActivityType MOBILE_INSTALL_EVENT>
			CUSTOM_APP_EVENTS = new GraphAPIActivityType("CUSTOM_APP_EVENTS", 1);
		//    6   13:new             #2   <Class AppEventsLoggerUtility$GraphAPIActivityType>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "CUSTOM_APP_EVENTS">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void AppEventsLoggerUtility$GraphAPIActivityType(String, int)>
		//   11   23:putstatic       #25  <Field AppEventsLoggerUtility$GraphAPIActivityType CUSTOM_APP_EVENTS>
			$VALUES = (new GraphAPIActivityType[] {
				MOBILE_INSTALL_EVENT, CUSTOM_APP_EVENTS
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       GraphAPIActivityType[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field AppEventsLoggerUtility$GraphAPIActivityType MOBILE_INSTALL_EVENT>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field AppEventsLoggerUtility$GraphAPIActivityType CUSTOM_APP_EVENTS>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field AppEventsLoggerUtility$GraphAPIActivityType[] $VALUES>
		//*  23   45:return          
		}

		private GraphAPIActivityType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public static JSONObject getJSONObjectForGraphAPICall(GraphAPIActivityType graphapiactivitytype, AttributionIdentifiers attributionidentifiers, String s, boolean flag, Context context)
		throws JSONException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #28  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void JSONObject()>
	//    3    7:astore          5
		jsonobject.put("event", API_ACTIVITY_TYPE_TO_STRING.get(((Object) (graphapiactivitytype))));
	//    4    9:aload           5
	//    5   11:ldc1            #31  <String "event">
	//    6   13:getstatic       #19  <Field Map API_ACTIVITY_TYPE_TO_STRING>
	//    7   16:aload_0         
	//    8   17:invokeinterface #37  <Method Object Map.get(Object)>
	//    9   22:invokevirtual   #41  <Method JSONObject JSONObject.put(String, Object)>
	//   10   25:pop             
		graphapiactivitytype = ((GraphAPIActivityType) (AppEventsLogger.getUserID()));
	//   11   26:invokestatic    #47  <Method String AppEventsLogger.getUserID()>
	//   12   29:astore_0        
		if(graphapiactivitytype != null)
	//*  13   30:aload_0         
	//*  14   31:ifnull          43
			jsonobject.put("app_user_id", ((Object) (graphapiactivitytype)));
	//   15   34:aload           5
	//   16   36:ldc1            #49  <String "app_user_id">
	//   17   38:aload_0         
	//   18   39:invokevirtual   #41  <Method JSONObject JSONObject.put(String, Object)>
	//   19   42:pop             
		Utility.setAppEventAttributionParameters(jsonobject, attributionidentifiers, s, flag);
	//   20   43:aload           5
	//   21   45:aload_1         
	//   22   46:aload_2         
	//   23   47:iload_3         
	//   24   48:invokestatic    #55  <Method void Utility.setAppEventAttributionParameters(JSONObject, AttributionIdentifiers, String, boolean)>
		try
		{
			Utility.setAppEventExtendedDeviceInfoParameters(jsonobject, context);
	//   25   51:aload           5
	//   26   53:aload           4
	//   27   55:invokestatic    #59  <Method void Utility.setAppEventExtendedDeviceInfoParameters(JSONObject, Context)>
		}
	//*  28   58:goto            83
		// Misplaced declaration of an exception variable
		catch(GraphAPIActivityType graphapiactivitytype)
	//*  29   61:astore_0        
		{
			Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", new Object[] {
				((Exception) (graphapiactivitytype)).toString()
			});
	//   30   62:getstatic       #65  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//   31   65:ldc1            #67  <String "AppEvents">
	//   32   67:ldc1            #69  <String "Fetching extended device info parameters failed: '%s'">
	//   33   69:iconst_1        
	//   34   70:anewarray       Object[]
	//   35   73:dup             
	//   36   74:iconst_0        
	//   37   75:aload_0         
	//   38   76:invokevirtual   #72  <Method String Exception.toString()>
	//   39   79:aastore         
	//   40   80:invokestatic    #78  <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		}
		jsonobject.put("application_package_name", ((Object) (context.getPackageName())));
	//   41   83:aload           5
	//   42   85:ldc1            #80  <String "application_package_name">
	//   43   87:aload           4
	//   44   89:invokevirtual   #85  <Method String Context.getPackageName()>
	//   45   92:invokevirtual   #41  <Method JSONObject JSONObject.put(String, Object)>
	//   46   95:pop             
		return jsonobject;
	//   47   96:aload           5
	//   48   98:areturn         
	}

	private static final Map API_ACTIVITY_TYPE_TO_STRING = new HashMap() {

			
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #11  <Method void HashMap()>
				put(((Object) (GraphAPIActivityType.MOBILE_INSTALL_EVENT)), "MOBILE_APP_INSTALL");
			//    2    4:aload_0         
			//    3    5:getstatic       #17  <Field AppEventsLoggerUtility$GraphAPIActivityType AppEventsLoggerUtility$GraphAPIActivityType.MOBILE_INSTALL_EVENT>
			//    4    8:ldc1            #19  <String "MOBILE_APP_INSTALL">
			//    5   10:invokevirtual   #23  <Method Object put(Object, Object)>
			//    6   13:pop             
				put(((Object) (GraphAPIActivityType.CUSTOM_APP_EVENTS)), "CUSTOM_APP_EVENTS");
			//    7   14:aload_0         
			//    8   15:getstatic       #26  <Field AppEventsLoggerUtility$GraphAPIActivityType AppEventsLoggerUtility$GraphAPIActivityType.CUSTOM_APP_EVENTS>
			//    9   18:ldc1            #27  <String "CUSTOM_APP_EVENTS">
			//   10   20:invokevirtual   #23  <Method Object put(Object, Object)>
			//   11   23:pop             
			//   12   24:return          
			}
	}
;

	static 
	{
	//    0    0:new             #6   <Class AppEventsLoggerUtility$1>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void AppEventsLoggerUtility$1()>
	//    3    7:putstatic       #19  <Field Map API_ACTIVITY_TYPE_TO_STRING>
	//*   4   10:return          
	}
}
