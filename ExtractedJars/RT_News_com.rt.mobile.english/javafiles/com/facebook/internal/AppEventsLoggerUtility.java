// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;
import com.facebook.LoggingBehavior;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//			Utility, Logger, AttributionIdentifiers

public class AppEventsLoggerUtility
{
	public static final class GraphAPIActivityType extends Enum
	{

		public static GraphAPIActivityType valueOf(String s)
		{
			return (GraphAPIActivityType)Enum.valueOf(com/facebook/internal/AppEventsLoggerUtility$GraphAPIActivityType, s);
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
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.internal.AppEventsLoggerUtility$GraphAPIActivityType_3B_.clone()>
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


	public AppEventsLoggerUtility()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public static JSONObject getJSONObjectForGraphAPICall(GraphAPIActivityType graphapiactivitytype, AttributionIdentifiers attributionidentifiers, String s, boolean flag, Context context)
		throws JSONException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #29  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void JSONObject()>
	//    3    7:astore          5
		jsonobject.put("event", API_ACTIVITY_TYPE_TO_STRING.get(((Object) (graphapiactivitytype))));
	//    4    9:aload           5
	//    5   11:ldc1            #32  <String "event">
	//    6   13:getstatic       #19  <Field Map API_ACTIVITY_TYPE_TO_STRING>
	//    7   16:aload_0         
	//    8   17:invokeinterface #38  <Method Object Map.get(Object)>
	//    9   22:invokevirtual   #42  <Method JSONObject JSONObject.put(String, Object)>
	//   10   25:pop             
		Utility.setAppEventAttributionParameters(jsonobject, attributionidentifiers, s, flag);
	//   11   26:aload           5
	//   12   28:aload_1         
	//   13   29:aload_2         
	//   14   30:iload_3         
	//   15   31:invokestatic    #48  <Method void Utility.setAppEventAttributionParameters(JSONObject, AttributionIdentifiers, String, boolean)>
		try
		{
			Utility.setAppEventExtendedDeviceInfoParameters(jsonobject, context);
	//   16   34:aload           5
	//   17   36:aload           4
	//   18   38:invokestatic    #52  <Method void Utility.setAppEventExtendedDeviceInfoParameters(JSONObject, Context)>
		}
	//*  19   41:goto            66
		// Misplaced declaration of an exception variable
		catch(GraphAPIActivityType graphapiactivitytype)
	//*  20   44:astore_0        
		{
			Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", new Object[] {
				((Exception) (graphapiactivitytype)).toString()
			});
	//   21   45:getstatic       #58  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//   22   48:ldc1            #60  <String "AppEvents">
	//   23   50:ldc1            #62  <String "Fetching extended device info parameters failed: '%s'">
	//   24   52:iconst_1        
	//   25   53:anewarray       Object[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:aload_0         
	//   29   59:invokevirtual   #66  <Method String Exception.toString()>
	//   30   62:aastore         
	//   31   63:invokestatic    #72  <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		}
		jsonobject.put("application_package_name", ((Object) (context.getPackageName())));
	//   32   66:aload           5
	//   33   68:ldc1            #74  <String "application_package_name">
	//   34   70:aload           4
	//   35   72:invokevirtual   #79  <Method String Context.getPackageName()>
	//   36   75:invokevirtual   #42  <Method JSONObject JSONObject.put(String, Object)>
	//   37   78:pop             
		return jsonobject;
	//   38   79:aload           5
	//   39   81:areturn         
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
