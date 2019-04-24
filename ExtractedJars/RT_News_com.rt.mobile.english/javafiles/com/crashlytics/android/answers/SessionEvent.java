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
	//    1    1:invokespecial   #39  <Method void Object()>
		sessionEventMetadata = sessioneventmetadata;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #41  <Field SessionEventMetadata sessionEventMetadata>
		timestamp = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #43  <Field long timestamp>
		type = type1;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #45  <Field SessionEvent$Type type>
		details = map;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #47  <Field Map details>
		customType = s;
	//   14   26:aload_0         
	//   15   27:aload           6
	//   16   29:putfield        #49  <Field String customType>
		customAttributes = map1;
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:putfield        #51  <Field Map customAttributes>
		predefinedType = s1;
	//   20   38:aload_0         
	//   21   39:aload           8
	//   22   41:putfield        #53  <Field String predefinedType>
		predefinedAttributes = map2;
	//   23   44:aload_0         
	//   24   45:aload           9
	//   25   47:putfield        #55  <Field Map predefinedAttributes>
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
	//    9   15:invokespecial   #61  <Method void SessionEvent(SessionEventMetadata, long, SessionEvent$Type, Map, String, Map, String, Map)>
	//   10   18:return          
	}

	public static Builder crashEventBuilder(String s)
	{
		s = ((String) (Collections.singletonMap("sessionId", ((Object) (s)))));
	//    0    0:ldc1            #19  <String "sessionId">
	//    1    2:aload_0         
	//    2    3:invokestatic    #69  <Method Map Collections.singletonMap(Object, Object)>
	//    3    6:astore_0        
		return (new Builder(Type.CRASH)).details(((Map) (s)));
	//    4    7:new             #8   <Class SessionEvent$Builder>
	//    5   10:dup             
	//    6   11:getstatic       #72  <Field SessionEvent$Type SessionEvent$Type.CRASH>
	//    7   14:invokespecial   #75  <Method void SessionEvent$Builder(SessionEvent$Type)>
	//    8   17:aload_0         
	//    9   18:invokevirtual   #78  <Method SessionEvent$Builder SessionEvent$Builder.details(Map)>
	//   10   21:areturn         
	}

	public static Builder customEventBuilder(CustomEvent customevent)
	{
		return (new Builder(Type.CUSTOM)).customType(customevent.getCustomType()).customAttributes(customevent.getCustomAttributes());
	//    0    0:new             #8   <Class SessionEvent$Builder>
	//    1    3:dup             
	//    2    4:getstatic       #83  <Field SessionEvent$Type SessionEvent$Type.CUSTOM>
	//    3    7:invokespecial   #75  <Method void SessionEvent$Builder(SessionEvent$Type)>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #89  <Method String CustomEvent.getCustomType()>
	//    6   14:invokevirtual   #91  <Method SessionEvent$Builder SessionEvent$Builder.customType(String)>
	//    7   17:aload_0         
	//    8   18:invokevirtual   #95  <Method Map CustomEvent.getCustomAttributes()>
	//    9   21:invokevirtual   #97  <Method SessionEvent$Builder SessionEvent$Builder.customAttributes(Map)>
	//   10   24:areturn         
	}

	public static Builder installEventBuilder()
	{
		return new Builder(Type.INSTALL);
	//    0    0:new             #8   <Class SessionEvent$Builder>
	//    1    3:dup             
	//    2    4:getstatic       #102 <Field SessionEvent$Type SessionEvent$Type.INSTALL>
	//    3    7:invokespecial   #75  <Method void SessionEvent$Builder(SessionEvent$Type)>
	//    4   10:areturn         
	}

	public static Builder lifecycleEventBuilder(Type type1, Activity activity)
	{
		activity = ((Activity) (Collections.singletonMap("activity", ((Object) (((Object) (activity)).getClass().getName())))));
	//    0    0:ldc1            #16  <String "activity">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #108 <Method Class Object.getClass()>
	//    3    6:invokevirtual   #113 <Method String Class.getName()>
	//    4    9:invokestatic    #69  <Method Map Collections.singletonMap(Object, Object)>
	//    5   12:astore_1        
		return (new Builder(type1)).details(((Map) (activity)));
	//    6   13:new             #8   <Class SessionEvent$Builder>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #75  <Method void SessionEvent$Builder(SessionEvent$Type)>
	//   10   21:aload_1         
	//   11   22:invokevirtual   #78  <Method SessionEvent$Builder SessionEvent$Builder.details(Map)>
	//   12   25:areturn         
	}

	public static Builder predefinedEventBuilder(PredefinedEvent predefinedevent)
	{
		return (new Builder(Type.PREDEFINED)).predefinedType(predefinedevent.getPredefinedType()).predefinedAttributes(predefinedevent.getPredefinedAttributes()).customAttributes(predefinedevent.getCustomAttributes());
	//    0    0:new             #8   <Class SessionEvent$Builder>
	//    1    3:dup             
	//    2    4:getstatic       #118 <Field SessionEvent$Type SessionEvent$Type.PREDEFINED>
	//    3    7:invokespecial   #75  <Method void SessionEvent$Builder(SessionEvent$Type)>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #123 <Method String PredefinedEvent.getPredefinedType()>
	//    6   14:invokevirtual   #125 <Method SessionEvent$Builder SessionEvent$Builder.predefinedType(String)>
	//    7   17:aload_0         
	//    8   18:invokevirtual   #128 <Method Map PredefinedEvent.getPredefinedAttributes()>
	//    9   21:invokevirtual   #130 <Method SessionEvent$Builder SessionEvent$Builder.predefinedAttributes(Map)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #131 <Method Map PredefinedEvent.getCustomAttributes()>
	//   12   28:invokevirtual   #97  <Method SessionEvent$Builder SessionEvent$Builder.customAttributes(Map)>
	//   13   31:areturn         
	}

	public String toString()
	{
		if(stringRepresentation == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #135 <Field String stringRepresentation>
	//*   2    4:ifnonnull       184
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #137 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #138 <Method void StringBuilder()>
	//    6   14:astore_1        
			stringbuilder.append("[");
	//    7   15:aload_1         
	//    8   16:ldc1            #140 <String "[">
	//    9   18:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			stringbuilder.append(((Object)this).getClass().getSimpleName());
	//   11   22:aload_1         
	//   12   23:aload_0         
	//   13   24:invokevirtual   #108 <Method Class Object.getClass()>
	//   14   27:invokevirtual   #147 <Method String Class.getSimpleName()>
	//   15   30:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			stringbuilder.append(": ");
	//   17   34:aload_1         
	//   18   35:ldc1            #149 <String ": ">
	//   19   37:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
			stringbuilder.append("timestamp=");
	//   21   41:aload_1         
	//   22   42:ldc1            #151 <String "timestamp=">
	//   23   44:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
			stringbuilder.append(timestamp);
	//   25   48:aload_1         
	//   26   49:aload_0         
	//   27   50:getfield        #43  <Field long timestamp>
	//   28   53:invokevirtual   #154 <Method StringBuilder StringBuilder.append(long)>
	//   29   56:pop             
			stringbuilder.append(", type=");
	//   30   57:aload_1         
	//   31   58:ldc1            #156 <String ", type=">
	//   32   60:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
			stringbuilder.append(((Object) (type)));
	//   34   64:aload_1         
	//   35   65:aload_0         
	//   36   66:getfield        #45  <Field SessionEvent$Type type>
	//   37   69:invokevirtual   #159 <Method StringBuilder StringBuilder.append(Object)>
	//   38   72:pop             
			stringbuilder.append(", details=");
	//   39   73:aload_1         
	//   40   74:ldc1            #161 <String ", details=">
	//   41   76:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   42   79:pop             
			stringbuilder.append(((Object) (details)));
	//   43   80:aload_1         
	//   44   81:aload_0         
	//   45   82:getfield        #47  <Field Map details>
	//   46   85:invokevirtual   #159 <Method StringBuilder StringBuilder.append(Object)>
	//   47   88:pop             
			stringbuilder.append(", customType=");
	//   48   89:aload_1         
	//   49   90:ldc1            #163 <String ", customType=">
	//   50   92:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   51   95:pop             
			stringbuilder.append(customType);
	//   52   96:aload_1         
	//   53   97:aload_0         
	//   54   98:getfield        #49  <Field String customType>
	//   55  101:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   56  104:pop             
			stringbuilder.append(", customAttributes=");
	//   57  105:aload_1         
	//   58  106:ldc1            #165 <String ", customAttributes=">
	//   59  108:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   60  111:pop             
			stringbuilder.append(((Object) (customAttributes)));
	//   61  112:aload_1         
	//   62  113:aload_0         
	//   63  114:getfield        #51  <Field Map customAttributes>
	//   64  117:invokevirtual   #159 <Method StringBuilder StringBuilder.append(Object)>
	//   65  120:pop             
			stringbuilder.append(", predefinedType=");
	//   66  121:aload_1         
	//   67  122:ldc1            #167 <String ", predefinedType=">
	//   68  124:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   69  127:pop             
			stringbuilder.append(predefinedType);
	//   70  128:aload_1         
	//   71  129:aload_0         
	//   72  130:getfield        #53  <Field String predefinedType>
	//   73  133:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   74  136:pop             
			stringbuilder.append(", predefinedAttributes=");
	//   75  137:aload_1         
	//   76  138:ldc1            #169 <String ", predefinedAttributes=">
	//   77  140:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   78  143:pop             
			stringbuilder.append(((Object) (predefinedAttributes)));
	//   79  144:aload_1         
	//   80  145:aload_0         
	//   81  146:getfield        #55  <Field Map predefinedAttributes>
	//   82  149:invokevirtual   #159 <Method StringBuilder StringBuilder.append(Object)>
	//   83  152:pop             
			stringbuilder.append(", metadata=[");
	//   84  153:aload_1         
	//   85  154:ldc1            #171 <String ", metadata=[">
	//   86  156:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   87  159:pop             
			stringbuilder.append(((Object) (sessionEventMetadata)));
	//   88  160:aload_1         
	//   89  161:aload_0         
	//   90  162:getfield        #41  <Field SessionEventMetadata sessionEventMetadata>
	//   91  165:invokevirtual   #159 <Method StringBuilder StringBuilder.append(Object)>
	//   92  168:pop             
			stringbuilder.append("]]");
	//   93  169:aload_1         
	//   94  170:ldc1            #173 <String "]]">
	//   95  172:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   96  175:pop             
			stringRepresentation = stringbuilder.toString();
	//   97  176:aload_0         
	//   98  177:aload_1         
	//   99  178:invokevirtual   #175 <Method String StringBuilder.toString()>
	//  100  181:putfield        #135 <Field String stringRepresentation>
		}
		return stringRepresentation;
	//  101  184:aload_0         
	//  102  185:getfield        #135 <Field String stringRepresentation>
	//  103  188:areturn         
	}

	static final String ACTIVITY_KEY = "activity";
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
