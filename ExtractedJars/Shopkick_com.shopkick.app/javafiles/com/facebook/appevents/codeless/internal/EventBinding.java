// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.codeless.internal;

import java.util.*;
import org.json.*;

// Referenced classes of package com.facebook.appevents.codeless.internal:
//			PathComponent, ParameterComponent

public class EventBinding
{
	public static final class ActionType extends Enum
	{

		public static ActionType valueOf(String s)
		{
			return (ActionType)Enum.valueOf(com/facebook/appevents/codeless/internal/EventBinding$ActionType, s);
		//    0    0:ldc1            #2   <Class EventBinding$ActionType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class EventBinding$ActionType>
		//    4    9:areturn         
		}

		public static ActionType[] values()
		{
			return (ActionType[])((ActionType []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field EventBinding$ActionType[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.facebook.appevents.codeless.internal.EventBinding$ActionType_3B_.clone()>
		//    2    6:checkcast       #42  <Class EventBinding$ActionType[]>
		//    3    9:areturn         
		}

		private static final ActionType $VALUES[];
		public static final ActionType CLICK;
		public static final ActionType SELECTED;
		public static final ActionType TEXT_CHANGED;

		static 
		{
			CLICK = new ActionType("CLICK", 0);
		//    0    0:new             #2   <Class EventBinding$ActionType>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "CLICK">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void EventBinding$ActionType(String, int)>
		//    5   10:putstatic       #23  <Field EventBinding$ActionType CLICK>
			SELECTED = new ActionType("SELECTED", 1);
		//    6   13:new             #2   <Class EventBinding$ActionType>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "SELECTED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void EventBinding$ActionType(String, int)>
		//   11   23:putstatic       #26  <Field EventBinding$ActionType SELECTED>
			TEXT_CHANGED = new ActionType("TEXT_CHANGED", 2);
		//   12   26:new             #2   <Class EventBinding$ActionType>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "TEXT_CHANGED">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void EventBinding$ActionType(String, int)>
		//   17   36:putstatic       #29  <Field EventBinding$ActionType TEXT_CHANGED>
			$VALUES = (new ActionType[] {
				CLICK, SELECTED, TEXT_CHANGED
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       ActionType[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field EventBinding$ActionType CLICK>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field EventBinding$ActionType SELECTED>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field EventBinding$ActionType TEXT_CHANGED>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field EventBinding$ActionType[] $VALUES>
		//*  33   64:return          
		}

		private ActionType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class MappingMethod extends Enum
	{

		public static MappingMethod valueOf(String s)
		{
			return (MappingMethod)Enum.valueOf(com/facebook/appevents/codeless/internal/EventBinding$MappingMethod, s);
		//    0    0:ldc1            #2   <Class EventBinding$MappingMethod>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class EventBinding$MappingMethod>
		//    4    9:areturn         
		}

		public static MappingMethod[] values()
		{
			return (MappingMethod[])((MappingMethod []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field EventBinding$MappingMethod[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.appevents.codeless.internal.EventBinding$MappingMethod_3B_.clone()>
		//    2    6:checkcast       #38  <Class EventBinding$MappingMethod[]>
		//    3    9:areturn         
		}

		private static final MappingMethod $VALUES[];
		public static final MappingMethod INFERENCE;
		public static final MappingMethod MANUAL;

		static 
		{
			MANUAL = new MappingMethod("MANUAL", 0);
		//    0    0:new             #2   <Class EventBinding$MappingMethod>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "MANUAL">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void EventBinding$MappingMethod(String, int)>
		//    5   10:putstatic       #22  <Field EventBinding$MappingMethod MANUAL>
			INFERENCE = new MappingMethod("INFERENCE", 1);
		//    6   13:new             #2   <Class EventBinding$MappingMethod>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "INFERENCE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void EventBinding$MappingMethod(String, int)>
		//   11   23:putstatic       #25  <Field EventBinding$MappingMethod INFERENCE>
			$VALUES = (new MappingMethod[] {
				MANUAL, INFERENCE
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       MappingMethod[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field EventBinding$MappingMethod MANUAL>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field EventBinding$MappingMethod INFERENCE>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field EventBinding$MappingMethod[] $VALUES>
		//*  23   45:return          
		}

		private MappingMethod(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public EventBinding(String s, MappingMethod mappingmethod, ActionType actiontype, String s1, List list, List list1, String s2, 
			String s3, String s4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		eventName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field String eventName>
		method = mappingmethod;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #34  <Field EventBinding$MappingMethod method>
		type = actiontype;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #36  <Field EventBinding$ActionType type>
		appVersion = s1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #38  <Field String appVersion>
		path = list;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #40  <Field List path>
		parameters = list1;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #42  <Field List parameters>
		componentId = s2;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #44  <Field String componentId>
		pathType = s3;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #46  <Field String pathType>
		activityName = s4;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #48  <Field String activityName>
	//   29   55:return          
	}

	public static EventBinding getInstanceFromJson(JSONObject jsonobject)
		throws JSONException
	{
		String s = jsonobject.getString("event_name");
	//    0    0:aload_0         
	//    1    1:ldc1            #57  <String "event_name">
	//    2    3:invokevirtual   #63  <Method String JSONObject.getString(String)>
	//    3    6:astore_3        
		MappingMethod mappingmethod = MappingMethod.valueOf(jsonobject.getString("method").toUpperCase());
	//    4    7:aload_0         
	//    5    8:ldc1            #64  <String "method">
	//    6   10:invokevirtual   #63  <Method String JSONObject.getString(String)>
	//    7   13:invokevirtual   #70  <Method String String.toUpperCase()>
	//    8   16:invokestatic    #74  <Method EventBinding$MappingMethod EventBinding$MappingMethod.valueOf(String)>
	//    9   19:astore          4
		ActionType actiontype = ActionType.valueOf(jsonobject.getString("event_type").toUpperCase());
	//   10   21:aload_0         
	//   11   22:ldc1            #76  <String "event_type">
	//   12   24:invokevirtual   #63  <Method String JSONObject.getString(String)>
	//   13   27:invokevirtual   #70  <Method String String.toUpperCase()>
	//   14   30:invokestatic    #79  <Method EventBinding$ActionType EventBinding$ActionType.valueOf(String)>
	//   15   33:astore          5
		String s1 = jsonobject.getString("app_version");
	//   16   35:aload_0         
	//   17   36:ldc1            #81  <String "app_version">
	//   18   38:invokevirtual   #63  <Method String JSONObject.getString(String)>
	//   19   41:astore          6
		Object obj = ((Object) (jsonobject.getJSONArray("path")));
	//   20   43:aload_0         
	//   21   44:ldc1            #82  <String "path">
	//   22   46:invokevirtual   #86  <Method JSONArray JSONObject.getJSONArray(String)>
	//   23   49:astore          8
		ArrayList arraylist = new ArrayList();
	//   24   51:new             #88  <Class ArrayList>
	//   25   54:dup             
	//   26   55:invokespecial   #89  <Method void ArrayList()>
	//   27   58:astore          7
		boolean flag = false;
	//   28   60:iconst_0        
	//   29   61:istore_2        
		for(int i = 0; i < ((JSONArray) (obj)).length(); i++)
	//*  30   62:iconst_0        
	//*  31   63:istore_1        
	//*  32   64:iload_1         
	//*  33   65:aload           8
	//*  34   67:invokevirtual   #95  <Method int JSONArray.length()>
	//*  35   70:icmpge          101
			((List) (arraylist)).add(((Object) (new PathComponent(((JSONArray) (obj)).getJSONObject(i)))));
	//   36   73:aload           7
	//   37   75:new             #97  <Class PathComponent>
	//   38   78:dup             
	//   39   79:aload           8
	//   40   81:iload_1         
	//   41   82:invokevirtual   #101 <Method JSONObject JSONArray.getJSONObject(int)>
	//   42   85:invokespecial   #104 <Method void PathComponent(JSONObject)>
	//   43   88:invokeinterface #110 <Method boolean List.add(Object)>
	//   44   93:pop             

	//   45   94:iload_1         
	//   46   95:iconst_1        
	//   47   96:iadd            
	//   48   97:istore_1        
	//*  49   98:goto            64
		obj = ((Object) (jsonobject.optString("path_type", "absolute")));
	//   50  101:aload_0         
	//   51  102:ldc1            #112 <String "path_type">
	//   52  104:ldc1            #114 <String "absolute">
	//   53  106:invokevirtual   #118 <Method String JSONObject.optString(String, String)>
	//   54  109:astore          8
		JSONArray jsonarray = jsonobject.optJSONArray("parameters");
	//   55  111:aload_0         
	//   56  112:ldc1            #119 <String "parameters">
	//   57  114:invokevirtual   #122 <Method JSONArray JSONObject.optJSONArray(String)>
	//   58  117:astore          9
		ArrayList arraylist1 = new ArrayList();
	//   59  119:new             #88  <Class ArrayList>
	//   60  122:dup             
	//   61  123:invokespecial   #89  <Method void ArrayList()>
	//   62  126:astore          10
		if(jsonarray != null)
	//*  63  128:aload           9
	//*  64  130:ifnull          172
		{
			for(int j = ((int) (flag)); j < jsonarray.length(); j++)
	//*  65  133:iload_2         
	//*  66  134:istore_1        
	//*  67  135:iload_1         
	//*  68  136:aload           9
	//*  69  138:invokevirtual   #95  <Method int JSONArray.length()>
	//*  70  141:icmpge          172
				((List) (arraylist1)).add(((Object) (new ParameterComponent(jsonarray.getJSONObject(j)))));
	//   71  144:aload           10
	//   72  146:new             #124 <Class ParameterComponent>
	//   73  149:dup             
	//   74  150:aload           9
	//   75  152:iload_1         
	//   76  153:invokevirtual   #101 <Method JSONObject JSONArray.getJSONObject(int)>
	//   77  156:invokespecial   #125 <Method void ParameterComponent(JSONObject)>
	//   78  159:invokeinterface #110 <Method boolean List.add(Object)>
	//   79  164:pop             

	//   80  165:iload_1         
	//   81  166:iconst_1        
	//   82  167:iadd            
	//   83  168:istore_1        
		}
	//*  84  169:goto            135
		return new EventBinding(s, mappingmethod, actiontype, s1, ((List) (arraylist)), ((List) (arraylist1)), jsonobject.optString("component_id"), ((String) (obj)), jsonobject.optString("activity_name"));
	//   85  172:new             #2   <Class EventBinding>
	//   86  175:dup             
	//   87  176:aload_3         
	//   88  177:aload           4
	//   89  179:aload           5
	//   90  181:aload           6
	//   91  183:aload           7
	//   92  185:aload           10
	//   93  187:aload_0         
	//   94  188:ldc1            #127 <String "component_id">
	//   95  190:invokevirtual   #129 <Method String JSONObject.optString(String)>
	//   96  193:aload           8
	//   97  195:aload_0         
	//   98  196:ldc1            #131 <String "activity_name">
	//   99  198:invokevirtual   #129 <Method String JSONObject.optString(String)>
	//  100  201:invokespecial   #133 <Method void EventBinding(String, EventBinding$MappingMethod, EventBinding$ActionType, String, List, List, String, String, String)>
	//  101  204:areturn         
	}

	public static List parseArray(JSONArray jsonarray)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #88  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #89  <Method void ArrayList()>
	//    3    7:astore_3        
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
		int j;
		if(jsonarray != null)
	//*   6   10:aload_0         
	//*   7   11:ifnull          54
			try
			{
				j = jsonarray.length();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #95  <Method int JSONArray.length()>
	//   10   18:istore_2        
			}
	//*  11   19:goto            22
	//*  12   22:iload_1         
	//*  13   23:iload_2         
	//*  14   24:icmpge          49
	//*  15   27:aload_3         
	//*  16   28:aload_0         
	//*  17   29:iload_1         
	//*  18   30:invokevirtual   #101 <Method JSONObject JSONArray.getJSONObject(int)>
	//*  19   33:invokestatic    #138 <Method EventBinding getInstanceFromJson(JSONObject)>
	//*  20   36:invokeinterface #110 <Method boolean List.add(Object)>
	//*  21   41:pop             
	//*  22   42:iload_1         
	//*  23   43:iconst_1        
	//*  24   44:iadd            
	//*  25   45:istore_1        
	//*  26   46:goto            22
	//*  27   49:aload_3         
	//*  28   50:areturn         
			// Misplaced declaration of an exception variable
			catch(JSONArray jsonarray)
	//*  29   51:astore_0        
			{
				return ((List) (arraylist));
	//   30   52:aload_3         
	//   31   53:areturn         
			}
		else
			j = 0;
	//   32   54:iconst_0        
	//   33   55:istore_2        
		if(i >= j)
			break; /* Loop/switch isn't completed */
		((List) (arraylist)).add(((Object) (getInstanceFromJson(jsonarray.getJSONObject(i)))));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_22;
_L1:
		return ((List) (arraylist));
	//*  34   56:goto            22
	}

	public String getActivityName()
	{
		return activityName;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String activityName>
	//    2    4:areturn         
	}

	public String getAppVersion()
	{
		return appVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String appVersion>
	//    2    4:areturn         
	}

	public String getComponentId()
	{
		return componentId;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String componentId>
	//    2    4:areturn         
	}

	public String getEventName()
	{
		return eventName;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String eventName>
	//    2    4:areturn         
	}

	public MappingMethod getMethod()
	{
		return method;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field EventBinding$MappingMethod method>
	//    2    4:areturn         
	}

	public String getPathType()
	{
		return pathType;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String pathType>
	//    2    4:areturn         
	}

	public ActionType getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field EventBinding$ActionType type>
	//    2    4:areturn         
	}

	public List getViewParameters()
	{
		return Collections.unmodifiableList(parameters);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field List parameters>
	//    2    4:invokestatic    #156 <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public List getViewPath()
	{
		return Collections.unmodifiableList(path);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field List path>
	//    2    4:invokestatic    #156 <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	private final String activityName;
	private final String appVersion;
	private final String componentId;
	private final String eventName;
	private final MappingMethod method;
	private final List parameters;
	private final List path;
	private final String pathType;
	private final ActionType type;
}
