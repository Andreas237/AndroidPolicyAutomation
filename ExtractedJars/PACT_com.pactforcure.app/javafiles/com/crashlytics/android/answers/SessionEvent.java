// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.crashlytics.android.answers:
//			CustomEvent, PredefinedEvent, SessionEventMetadata

final class SessionEvent
{
	static class Builder
	{

		public SessionEvent build(SessionEventMetadata sessioneventmetadata)
		{
			return new SessionEvent(sessioneventmetadata, timestamp, type, details, customType, customAttributes, predefinedType, predefinedAttributes);
		//    0    0:new             #6   <Class SessionEvent>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #35  <Field long timestamp>
		//    5    9:aload_0         
		//    6   10:getfield        #27  <Field SessionEvent$Type type>
		//    7   13:aload_0         
		//    8   14:getfield        #37  <Field Map details>
		//    9   17:aload_0         
		//   10   18:getfield        #39  <Field String customType>
		//   11   21:aload_0         
		//   12   22:getfield        #41  <Field Map customAttributes>
		//   13   25:aload_0         
		//   14   26:getfield        #43  <Field String predefinedType>
		//   15   29:aload_0         
		//   16   30:getfield        #45  <Field Map predefinedAttributes>
		//   17   33:aconst_null     
		//   18   34:invokespecial   #51  <Method void SessionEvent(SessionEventMetadata, long, SessionEvent$Type, Map, String, Map, String, Map, SessionEvent$1)>
		//   19   37:areturn         
		}

		public Builder customAttributes(Map map)
		{
			customAttributes = map;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #41  <Field Map customAttributes>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder customType(String s)
		{
			customType = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #39  <Field String customType>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder details(Map map)
		{
			details = map;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #37  <Field Map details>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder predefinedAttributes(Map map)
		{
			predefinedAttributes = map;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #45  <Field Map predefinedAttributes>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder predefinedType(String s)
		{
			predefinedType = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #43  <Field String predefinedType>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		Map customAttributes;
		String customType;
		Map details;
		Map predefinedAttributes;
		String predefinedType;
		final long timestamp = System.currentTimeMillis();
		final Type type;

		public Builder(Type type1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			type = type1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #27  <Field SessionEvent$Type type>
		//    5    9:aload_0         
		//    6   10:invokestatic    #33  <Method long System.currentTimeMillis()>
		//    7   13:putfield        #35  <Field long timestamp>
			details = null;
		//    8   16:aload_0         
		//    9   17:aconst_null     
		//   10   18:putfield        #37  <Field Map details>
			customType = null;
		//   11   21:aload_0         
		//   12   22:aconst_null     
		//   13   23:putfield        #39  <Field String customType>
			customAttributes = null;
		//   14   26:aload_0         
		//   15   27:aconst_null     
		//   16   28:putfield        #41  <Field Map customAttributes>
			predefinedType = null;
		//   17   31:aload_0         
		//   18   32:aconst_null     
		//   19   33:putfield        #43  <Field String predefinedType>
			predefinedAttributes = null;
		//   20   36:aload_0         
		//   21   37:aconst_null     
		//   22   38:putfield        #45  <Field Map predefinedAttributes>
		//   23   41:return          
		}
	}

	static final class Type extends Enum
	{

		public static Type valueOf(String s)
		{
			return (Type)Enum.valueOf(com/crashlytics/android/answers/SessionEvent$Type, s);
		//    0    0:ldc1            #2   <Class SessionEvent$Type>
		//    1    2:aload_0         
		//    2    3:invokestatic    #59  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class SessionEvent$Type>
		//    4    9:areturn         
		}

		public static Type[] values()
		{
			return (Type[])((Type []) ($VALUES)).clone();
		//    0    0:getstatic       #51  <Field SessionEvent$Type[] $VALUES>
		//    1    3:invokevirtual   #66  <Method Object _5B_Lcom.crashlytics.android.answers.SessionEvent$Type_3B_.clone()>
		//    2    6:checkcast       #62  <Class SessionEvent$Type[]>
		//    3    9:areturn         
		}

		private static final Type $VALUES[];
		public static final Type CRASH;
		public static final Type CUSTOM;
		public static final Type INSTALL;
		public static final Type PAUSE;
		public static final Type PREDEFINED;
		public static final Type RESUME;
		public static final Type START;
		public static final Type STOP;

		static 
		{
			START = new Type("START", 0);
		//    0    0:new             #2   <Class SessionEvent$Type>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "START">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #26  <Method void SessionEvent$Type(String, int)>
		//    5   10:putstatic       #28  <Field SessionEvent$Type START>
			RESUME = new Type("RESUME", 1);
		//    6   13:new             #2   <Class SessionEvent$Type>
		//    7   16:dup             
		//    8   17:ldc1            #29  <String "RESUME">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #26  <Method void SessionEvent$Type(String, int)>
		//   11   23:putstatic       #31  <Field SessionEvent$Type RESUME>
			PAUSE = new Type("PAUSE", 2);
		//   12   26:new             #2   <Class SessionEvent$Type>
		//   13   29:dup             
		//   14   30:ldc1            #32  <String "PAUSE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #26  <Method void SessionEvent$Type(String, int)>
		//   17   36:putstatic       #34  <Field SessionEvent$Type PAUSE>
			STOP = new Type("STOP", 3);
		//   18   39:new             #2   <Class SessionEvent$Type>
		//   19   42:dup             
		//   20   43:ldc1            #35  <String "STOP">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #26  <Method void SessionEvent$Type(String, int)>
		//   23   49:putstatic       #37  <Field SessionEvent$Type STOP>
			CRASH = new Type("CRASH", 4);
		//   24   52:new             #2   <Class SessionEvent$Type>
		//   25   55:dup             
		//   26   56:ldc1            #38  <String "CRASH">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #26  <Method void SessionEvent$Type(String, int)>
		//   29   62:putstatic       #40  <Field SessionEvent$Type CRASH>
			INSTALL = new Type("INSTALL", 5);
		//   30   65:new             #2   <Class SessionEvent$Type>
		//   31   68:dup             
		//   32   69:ldc1            #41  <String "INSTALL">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #26  <Method void SessionEvent$Type(String, int)>
		//   35   75:putstatic       #43  <Field SessionEvent$Type INSTALL>
			CUSTOM = new Type("CUSTOM", 6);
		//   36   78:new             #2   <Class SessionEvent$Type>
		//   37   81:dup             
		//   38   82:ldc1            #44  <String "CUSTOM">
		//   39   84:bipush          6
		//   40   86:invokespecial   #26  <Method void SessionEvent$Type(String, int)>
		//   41   89:putstatic       #46  <Field SessionEvent$Type CUSTOM>
			PREDEFINED = new Type("PREDEFINED", 7);
		//   42   92:new             #2   <Class SessionEvent$Type>
		//   43   95:dup             
		//   44   96:ldc1            #47  <String "PREDEFINED">
		//   45   98:bipush          7
		//   46  100:invokespecial   #26  <Method void SessionEvent$Type(String, int)>
		//   47  103:putstatic       #49  <Field SessionEvent$Type PREDEFINED>
			$VALUES = (new Type[] {
				START, RESUME, PAUSE, STOP, CRASH, INSTALL, CUSTOM, PREDEFINED
			});
		//   48  106:bipush          8
		//   49  108:anewarray       Type[]
		//   50  111:dup             
		//   51  112:iconst_0        
		//   52  113:getstatic       #28  <Field SessionEvent$Type START>
		//   53  116:aastore         
		//   54  117:dup             
		//   55  118:iconst_1        
		//   56  119:getstatic       #31  <Field SessionEvent$Type RESUME>
		//   57  122:aastore         
		//   58  123:dup             
		//   59  124:iconst_2        
		//   60  125:getstatic       #34  <Field SessionEvent$Type PAUSE>
		//   61  128:aastore         
		//   62  129:dup             
		//   63  130:iconst_3        
		//   64  131:getstatic       #37  <Field SessionEvent$Type STOP>
		//   65  134:aastore         
		//   66  135:dup             
		//   67  136:iconst_4        
		//   68  137:getstatic       #40  <Field SessionEvent$Type CRASH>
		//   69  140:aastore         
		//   70  141:dup             
		//   71  142:iconst_5        
		//   72  143:getstatic       #43  <Field SessionEvent$Type INSTALL>
		//   73  146:aastore         
		//   74  147:dup             
		//   75  148:bipush          6
		//   76  150:getstatic       #46  <Field SessionEvent$Type CUSTOM>
		//   77  153:aastore         
		//   78  154:dup             
		//   79  155:bipush          7
		//   80  157:getstatic       #49  <Field SessionEvent$Type PREDEFINED>
		//   81  160:aastore         
		//   82  161:putstatic       #51  <Field SessionEvent$Type[] $VALUES>
		//*  83  164:return          
		}

		private Type(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #53  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	private SessionEvent(SessionEventMetadata sessioneventmetadata, long l, Type type1, Map map, String s, Map map1, 
			String s1, Map map2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		sessionEventMetadata = sessioneventmetadata;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #47  <Field SessionEventMetadata sessionEventMetadata>
		timestamp = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #49  <Field long timestamp>
		type = type1;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #51  <Field SessionEvent$Type type>
		details = map;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #53  <Field Map details>
		customType = s;
	//   14   26:aload_0         
	//   15   27:aload           6
	//   16   29:putfield        #55  <Field String customType>
		customAttributes = map1;
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:putfield        #57  <Field Map customAttributes>
		predefinedType = s1;
	//   20   38:aload_0         
	//   21   39:aload           8
	//   22   41:putfield        #59  <Field String predefinedType>
		predefinedAttributes = map2;
	//   23   44:aload_0         
	//   24   45:aload           9
	//   25   47:putfield        #61  <Field Map predefinedAttributes>
	//   26   50:return          
	}

	SessionEvent(SessionEventMetadata sessioneventmetadata, long l, Type type1, Map map, String s, Map map1, 
			String s1, Map map2, _cls1 _pcls1)
	{
		this(sessioneventmetadata, l, type1, map, s, map1, s1, map2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:aload           6
	//    6    9:aload           7
	//    7   11:aload           8
	//    8   13:aload           9
	//    9   15:invokespecial   #67  <Method void SessionEvent(SessionEventMetadata, long, SessionEvent$Type, Map, String, Map, String, Map)>
	//   10   18:return          
	}

	public static Builder crashEventBuilder(String s)
	{
		s = ((String) (Collections.singletonMap("sessionId", ((Object) (s)))));
	//    0    0:ldc1            #25  <String "sessionId">
	//    1    2:aload_0         
	//    2    3:invokestatic    #75  <Method Map Collections.singletonMap(Object, Object)>
	//    3    6:astore_0        
		return (new Builder(Type.CRASH)).details(((Map) (s)));
	//    4    7:new             #8   <Class SessionEvent$Builder>
	//    5   10:dup             
	//    6   11:getstatic       #78  <Field SessionEvent$Type SessionEvent$Type.CRASH>
	//    7   14:invokespecial   #81  <Method void SessionEvent$Builder(SessionEvent$Type)>
	//    8   17:aload_0         
	//    9   18:invokevirtual   #84  <Method SessionEvent$Builder SessionEvent$Builder.details(Map)>
	//   10   21:areturn         
	}

	public static Builder crashEventBuilder(String s, String s1)
	{
		return crashEventBuilder(s).customAttributes(Collections.singletonMap("exceptionName", ((Object) (s1))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #87  <Method SessionEvent$Builder crashEventBuilder(String)>
	//    2    4:ldc1            #19  <String "exceptionName">
	//    3    6:aload_1         
	//    4    7:invokestatic    #75  <Method Map Collections.singletonMap(Object, Object)>
	//    5   10:invokevirtual   #89  <Method SessionEvent$Builder SessionEvent$Builder.customAttributes(Map)>
	//    6   13:areturn         
	}

	public static Builder customEventBuilder(CustomEvent customevent)
	{
		return (new Builder(Type.CUSTOM)).customType(customevent.getCustomType()).customAttributes(customevent.getCustomAttributes());
	//    0    0:new             #8   <Class SessionEvent$Builder>
	//    1    3:dup             
	//    2    4:getstatic       #94  <Field SessionEvent$Type SessionEvent$Type.CUSTOM>
	//    3    7:invokespecial   #81  <Method void SessionEvent$Builder(SessionEvent$Type)>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #100 <Method String CustomEvent.getCustomType()>
	//    6   14:invokevirtual   #102 <Method SessionEvent$Builder SessionEvent$Builder.customType(String)>
	//    7   17:aload_0         
	//    8   18:invokevirtual   #106 <Method Map CustomEvent.getCustomAttributes()>
	//    9   21:invokevirtual   #89  <Method SessionEvent$Builder SessionEvent$Builder.customAttributes(Map)>
	//   10   24:areturn         
	}

	public static Builder installEventBuilder(long l)
	{
		return (new Builder(Type.INSTALL)).details(Collections.singletonMap("installedAt", ((Object) (String.valueOf(l)))));
	//    0    0:new             #8   <Class SessionEvent$Builder>
	//    1    3:dup             
	//    2    4:getstatic       #111 <Field SessionEvent$Type SessionEvent$Type.INSTALL>
	//    3    7:invokespecial   #81  <Method void SessionEvent$Builder(SessionEvent$Type)>
	//    4   10:ldc1            #22  <String "installedAt">
	//    5   12:lload_0         
	//    6   13:invokestatic    #117 <Method String String.valueOf(long)>
	//    7   16:invokestatic    #75  <Method Map Collections.singletonMap(Object, Object)>
	//    8   19:invokevirtual   #84  <Method SessionEvent$Builder SessionEvent$Builder.details(Map)>
	//    9   22:areturn         
	}

	public static Builder lifecycleEventBuilder(Type type1, Activity activity)
	{
		activity = ((Activity) (Collections.singletonMap("activity", ((Object) (((Object) (activity)).getClass().getName())))));
	//    0    0:ldc1            #16  <String "activity">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #123 <Method Class Object.getClass()>
	//    3    6:invokevirtual   #128 <Method String Class.getName()>
	//    4    9:invokestatic    #75  <Method Map Collections.singletonMap(Object, Object)>
	//    5   12:astore_1        
		return (new Builder(type1)).details(((Map) (activity)));
	//    6   13:new             #8   <Class SessionEvent$Builder>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #81  <Method void SessionEvent$Builder(SessionEvent$Type)>
	//   10   21:aload_1         
	//   11   22:invokevirtual   #84  <Method SessionEvent$Builder SessionEvent$Builder.details(Map)>
	//   12   25:areturn         
	}

	public static Builder predefinedEventBuilder(PredefinedEvent predefinedevent)
	{
		return (new Builder(Type.PREDEFINED)).predefinedType(predefinedevent.getPredefinedType()).predefinedAttributes(predefinedevent.getPredefinedAttributes()).customAttributes(predefinedevent.getCustomAttributes());
	//    0    0:new             #8   <Class SessionEvent$Builder>
	//    1    3:dup             
	//    2    4:getstatic       #133 <Field SessionEvent$Type SessionEvent$Type.PREDEFINED>
	//    3    7:invokespecial   #81  <Method void SessionEvent$Builder(SessionEvent$Type)>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #138 <Method String PredefinedEvent.getPredefinedType()>
	//    6   14:invokevirtual   #140 <Method SessionEvent$Builder SessionEvent$Builder.predefinedType(String)>
	//    7   17:aload_0         
	//    8   18:invokevirtual   #143 <Method Map PredefinedEvent.getPredefinedAttributes()>
	//    9   21:invokevirtual   #145 <Method SessionEvent$Builder SessionEvent$Builder.predefinedAttributes(Map)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #146 <Method Map PredefinedEvent.getCustomAttributes()>
	//   12   28:invokevirtual   #89  <Method SessionEvent$Builder SessionEvent$Builder.customAttributes(Map)>
	//   13   31:areturn         
	}

	public String toString()
	{
		if(stringRepresentation == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field String stringRepresentation>
	//*   2    4:ifnonnull       142
			stringRepresentation = (new StringBuilder()).append("[").append(((Object)this).getClass().getSimpleName()).append(": ").append("timestamp=").append(timestamp).append(", type=").append(((Object) (type))).append(", details=").append(((Object) (details))).append(", customType=").append(customType).append(", customAttributes=").append(((Object) (customAttributes))).append(", predefinedType=").append(predefinedType).append(", predefinedAttributes=").append(((Object) (predefinedAttributes))).append(", metadata=[").append(((Object) (sessionEventMetadata))).append("]]").toString();
	//    3    7:aload_0         
	//    4    8:new             #152 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #153 <Method void StringBuilder()>
	//    7   15:ldc1            #155 <String "[">
	//    8   17:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:aload_0         
	//   10   21:invokevirtual   #123 <Method Class Object.getClass()>
	//   11   24:invokevirtual   #162 <Method String Class.getSimpleName()>
	//   12   27:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   13   30:ldc1            #164 <String ": ">
	//   14   32:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:ldc1            #166 <String "timestamp=">
	//   16   37:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   17   40:aload_0         
	//   18   41:getfield        #49  <Field long timestamp>
	//   19   44:invokevirtual   #169 <Method StringBuilder StringBuilder.append(long)>
	//   20   47:ldc1            #171 <String ", type=">
	//   21   49:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   22   52:aload_0         
	//   23   53:getfield        #51  <Field SessionEvent$Type type>
	//   24   56:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
	//   25   59:ldc1            #176 <String ", details=">
	//   26   61:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   27   64:aload_0         
	//   28   65:getfield        #53  <Field Map details>
	//   29   68:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
	//   30   71:ldc1            #178 <String ", customType=">
	//   31   73:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   32   76:aload_0         
	//   33   77:getfield        #55  <Field String customType>
	//   34   80:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   35   83:ldc1            #180 <String ", customAttributes=">
	//   36   85:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   37   88:aload_0         
	//   38   89:getfield        #57  <Field Map customAttributes>
	//   39   92:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
	//   40   95:ldc1            #182 <String ", predefinedType=">
	//   41   97:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   42  100:aload_0         
	//   43  101:getfield        #59  <Field String predefinedType>
	//   44  104:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   45  107:ldc1            #184 <String ", predefinedAttributes=">
	//   46  109:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   47  112:aload_0         
	//   48  113:getfield        #61  <Field Map predefinedAttributes>
	//   49  116:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
	//   50  119:ldc1            #186 <String ", metadata=[">
	//   51  121:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   52  124:aload_0         
	//   53  125:getfield        #47  <Field SessionEventMetadata sessionEventMetadata>
	//   54  128:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
	//   55  131:ldc1            #188 <String "]]">
	//   56  133:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   57  136:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   58  139:putfield        #150 <Field String stringRepresentation>
		return stringRepresentation;
	//   59  142:aload_0         
	//   60  143:getfield        #150 <Field String stringRepresentation>
	//   61  146:areturn         
	}

	static final String ACTIVITY_KEY = "activity";
	static final String EXCEPTION_NAME_KEY = "exceptionName";
	static final String INSTALLED_AT_KEY = "installedAt";
	static final String SESSION_ID_KEY = "sessionId";
	public final Map customAttributes;
	public final String customType;
	public final Map details;
	public final Map predefinedAttributes;
	public final String predefinedType;
	public final SessionEventMetadata sessionEventMetadata;
	private String stringRepresentation;
	public final long timestamp;
	public final Type type;
}
