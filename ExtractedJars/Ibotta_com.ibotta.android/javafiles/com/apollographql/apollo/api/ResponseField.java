// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api;

import com.apollographql.apollo.api.internal.Utils;
import java.util.*;

// Referenced classes of package com.apollographql.apollo.api:
//			ScalarType

public class ResponseField
{
	public static final class BooleanCondition extends Condition
	{

		public boolean inverted()
		{
			return inverted;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field boolean inverted>
		//    2    4:ireturn         
		}

		public String variableName()
		{
			return variableName;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field String variableName>
		//    2    4:areturn         
		}

		private final boolean inverted;
		private final String variableName;

		BooleanCondition(String s, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void ResponseField$Condition()>
			variableName = (String)Utils.checkNotNull(((Object) (s)), "variableName == null");
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:ldc1            #19  <String "variableName == null">
		//    5    8:invokestatic    #25  <Method Object Utils.checkNotNull(Object, Object)>
		//    6   11:checkcast       #27  <Class String>
		//    7   14:putfield        #29  <Field String variableName>
			inverted = flag;
		//    8   17:aload_0         
		//    9   18:iload_2         
		//   10   19:putfield        #31  <Field boolean inverted>
		//   11   22:return          
		}
	}

	public static class Condition
	{

		public static BooleanCondition booleanCondition(String s, boolean flag)
		{
			return new BooleanCondition(s, flag);
		//    0    0:new             #17  <Class ResponseField$BooleanCondition>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:invokespecial   #20  <Method void ResponseField$BooleanCondition(String, boolean)>
		//    5    9:areturn         
		}

		public static TypeNameCondition typeCondition(String s)
		{
			return new TypeNameCondition(s);
		//    0    0:new             #26  <Class ResponseField$TypeNameCondition>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #29  <Method void ResponseField$TypeNameCondition(String)>
		//    4    8:areturn         
		}

		Condition()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class CustomTypeField extends ResponseField
	{

		public ScalarType scalarType()
		{
			return scalarType;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ScalarType scalarType>
		//    2    4:areturn         
		}

		private final ScalarType scalarType;

		CustomTypeField(String s, String s1, Map map, boolean flag, ScalarType scalartype, List list)
		{
			super(Type.CUSTOM, s, s1, map, flag, list);
		//    0    0:aload_0         
		//    1    1:getstatic       #15  <Field ResponseField$Type ResponseField$Type.CUSTOM>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:iload           4
		//    6    9:aload           6
		//    7   11:invokespecial   #18  <Method void ResponseField(ResponseField$Type, String, String, Map, boolean, List)>
			scalarType = scalartype;
		//    8   14:aload_0         
		//    9   15:aload           5
		//   10   17:putfield        #20  <Field ScalarType scalarType>
		//   11   20:return          
		}
	}

	public static final class Type extends Enum
	{

		public static Type valueOf(String s)
		{
			return (Type)Enum.valueOf(com/apollographql/apollo/api/ResponseField$Type, s);
		//    0    0:ldc1            #2   <Class ResponseField$Type>
		//    1    2:aload_0         
		//    2    3:invokestatic    #71  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ResponseField$Type>
		//    4    9:areturn         
		}

		public static Type[] values()
		{
			return (Type[])((Type []) ($VALUES)).clone();
		//    0    0:getstatic       #63  <Field ResponseField$Type[] $VALUES>
		//    1    3:invokevirtual   #78  <Method Object _5B_Lcom.apollographql.apollo.api.ResponseField$Type_3B_.clone()>
		//    2    6:checkcast       #74  <Class ResponseField$Type[]>
		//    3    9:areturn         
		}

		private static final Type $VALUES[];
		public static final Type BOOLEAN;
		public static final Type CUSTOM;
		public static final Type DOUBLE;
		public static final Type ENUM;
		public static final Type FRAGMENT;
		public static final Type INLINE_FRAGMENT;
		public static final Type INT;
		public static final Type LIST;
		public static final Type LONG;
		public static final Type OBJECT;
		public static final Type STRING;

		static 
		{
			STRING = new Type("STRING", 0);
		//    0    0:new             #2   <Class ResponseField$Type>
		//    1    3:dup             
		//    2    4:ldc1            #25  <String "STRING">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #29  <Method void ResponseField$Type(String, int)>
		//    5   10:putstatic       #31  <Field ResponseField$Type STRING>
			INT = new Type("INT", 1);
		//    6   13:new             #2   <Class ResponseField$Type>
		//    7   16:dup             
		//    8   17:ldc1            #32  <String "INT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #29  <Method void ResponseField$Type(String, int)>
		//   11   23:putstatic       #34  <Field ResponseField$Type INT>
			LONG = new Type("LONG", 2);
		//   12   26:new             #2   <Class ResponseField$Type>
		//   13   29:dup             
		//   14   30:ldc1            #35  <String "LONG">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #29  <Method void ResponseField$Type(String, int)>
		//   17   36:putstatic       #37  <Field ResponseField$Type LONG>
			DOUBLE = new Type("DOUBLE", 3);
		//   18   39:new             #2   <Class ResponseField$Type>
		//   19   42:dup             
		//   20   43:ldc1            #38  <String "DOUBLE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #29  <Method void ResponseField$Type(String, int)>
		//   23   49:putstatic       #40  <Field ResponseField$Type DOUBLE>
			BOOLEAN = new Type("BOOLEAN", 4);
		//   24   52:new             #2   <Class ResponseField$Type>
		//   25   55:dup             
		//   26   56:ldc1            #41  <String "BOOLEAN">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #29  <Method void ResponseField$Type(String, int)>
		//   29   62:putstatic       #43  <Field ResponseField$Type BOOLEAN>
			ENUM = new Type("ENUM", 5);
		//   30   65:new             #2   <Class ResponseField$Type>
		//   31   68:dup             
		//   32   69:ldc1            #44  <String "ENUM">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #29  <Method void ResponseField$Type(String, int)>
		//   35   75:putstatic       #46  <Field ResponseField$Type ENUM>
			OBJECT = new Type("OBJECT", 6);
		//   36   78:new             #2   <Class ResponseField$Type>
		//   37   81:dup             
		//   38   82:ldc1            #47  <String "OBJECT">
		//   39   84:bipush          6
		//   40   86:invokespecial   #29  <Method void ResponseField$Type(String, int)>
		//   41   89:putstatic       #49  <Field ResponseField$Type OBJECT>
			LIST = new Type("LIST", 7);
		//   42   92:new             #2   <Class ResponseField$Type>
		//   43   95:dup             
		//   44   96:ldc1            #50  <String "LIST">
		//   45   98:bipush          7
		//   46  100:invokespecial   #29  <Method void ResponseField$Type(String, int)>
		//   47  103:putstatic       #52  <Field ResponseField$Type LIST>
			CUSTOM = new Type("CUSTOM", 8);
		//   48  106:new             #2   <Class ResponseField$Type>
		//   49  109:dup             
		//   50  110:ldc1            #53  <String "CUSTOM">
		//   51  112:bipush          8
		//   52  114:invokespecial   #29  <Method void ResponseField$Type(String, int)>
		//   53  117:putstatic       #55  <Field ResponseField$Type CUSTOM>
			FRAGMENT = new Type("FRAGMENT", 9);
		//   54  120:new             #2   <Class ResponseField$Type>
		//   55  123:dup             
		//   56  124:ldc1            #56  <String "FRAGMENT">
		//   57  126:bipush          9
		//   58  128:invokespecial   #29  <Method void ResponseField$Type(String, int)>
		//   59  131:putstatic       #58  <Field ResponseField$Type FRAGMENT>
			INLINE_FRAGMENT = new Type("INLINE_FRAGMENT", 10);
		//   60  134:new             #2   <Class ResponseField$Type>
		//   61  137:dup             
		//   62  138:ldc1            #59  <String "INLINE_FRAGMENT">
		//   63  140:bipush          10
		//   64  142:invokespecial   #29  <Method void ResponseField$Type(String, int)>
		//   65  145:putstatic       #61  <Field ResponseField$Type INLINE_FRAGMENT>
			$VALUES = (new Type[] {
				STRING, INT, LONG, DOUBLE, BOOLEAN, ENUM, OBJECT, LIST, CUSTOM, FRAGMENT, 
				INLINE_FRAGMENT
			});
		//   66  148:bipush          11
		//   67  150:anewarray       Type[]
		//   68  153:dup             
		//   69  154:iconst_0        
		//   70  155:getstatic       #31  <Field ResponseField$Type STRING>
		//   71  158:aastore         
		//   72  159:dup             
		//   73  160:iconst_1        
		//   74  161:getstatic       #34  <Field ResponseField$Type INT>
		//   75  164:aastore         
		//   76  165:dup             
		//   77  166:iconst_2        
		//   78  167:getstatic       #37  <Field ResponseField$Type LONG>
		//   79  170:aastore         
		//   80  171:dup             
		//   81  172:iconst_3        
		//   82  173:getstatic       #40  <Field ResponseField$Type DOUBLE>
		//   83  176:aastore         
		//   84  177:dup             
		//   85  178:iconst_4        
		//   86  179:getstatic       #43  <Field ResponseField$Type BOOLEAN>
		//   87  182:aastore         
		//   88  183:dup             
		//   89  184:iconst_5        
		//   90  185:getstatic       #46  <Field ResponseField$Type ENUM>
		//   91  188:aastore         
		//   92  189:dup             
		//   93  190:bipush          6
		//   94  192:getstatic       #49  <Field ResponseField$Type OBJECT>
		//   95  195:aastore         
		//   96  196:dup             
		//   97  197:bipush          7
		//   98  199:getstatic       #52  <Field ResponseField$Type LIST>
		//   99  202:aastore         
		//  100  203:dup             
		//  101  204:bipush          8
		//  102  206:getstatic       #55  <Field ResponseField$Type CUSTOM>
		//  103  209:aastore         
		//  104  210:dup             
		//  105  211:bipush          9
		//  106  213:getstatic       #58  <Field ResponseField$Type FRAGMENT>
		//  107  216:aastore         
		//  108  217:dup             
		//  109  218:bipush          10
		//  110  220:getstatic       #61  <Field ResponseField$Type INLINE_FRAGMENT>
		//  111  223:aastore         
		//  112  224:putstatic       #63  <Field ResponseField$Type[] $VALUES>
		//* 113  227:return          
		}

		private Type(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #65  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class TypeNameCondition extends Condition
	{

		public String typeName()
		{
			return typeName;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field String typeName>
		//    2    4:areturn         
		}

		private final String typeName;

		TypeNameCondition(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void ResponseField$Condition()>
			typeName = (String)Utils.checkNotNull(((Object) (s)), "typeName == null");
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:ldc1            #16  <String "typeName == null">
		//    5    8:invokestatic    #22  <Method Object Utils.checkNotNull(Object, Object)>
		//    6   11:checkcast       #24  <Class String>
		//    7   14:putfield        #26  <Field String typeName>
		//    8   17:return          
		}
	}


	ResponseField(Type type1, String s, String s1, Map map, boolean flag, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		type = type1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #41  <Field ResponseField$Type type>
		responseName = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #43  <Field String responseName>
		fieldName = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #45  <Field String fieldName>
		if(map == null)
	//*  11   19:aload           4
	//*  12   21:ifnonnull       31
			type1 = ((Type) (Collections.emptyMap()));
	//   13   24:invokestatic    #51  <Method Map Collections.emptyMap()>
	//   14   27:astore_1        
		else
	//*  15   28:goto            37
			type1 = ((Type) (Collections.unmodifiableMap(map)));
	//   16   31:aload           4
	//   17   33:invokestatic    #55  <Method Map Collections.unmodifiableMap(Map)>
	//   18   36:astore_1        
		arguments = ((Map) (type1));
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:putfield        #57  <Field Map arguments>
		optional = flag;
	//   22   42:aload_0         
	//   23   43:iload           5
	//   24   45:putfield        #59  <Field boolean optional>
		if(list == null)
	//*  25   48:aload           6
	//*  26   50:ifnonnull       60
			type1 = ((Type) (Collections.emptyList()));
	//   27   53:invokestatic    #63  <Method List Collections.emptyList()>
	//   28   56:astore_1        
		else
	//*  29   57:goto            66
			type1 = ((Type) (Collections.unmodifiableList(list)));
	//   30   60:aload           6
	//   31   62:invokestatic    #67  <Method List Collections.unmodifiableList(List)>
	//   32   65:astore_1        
		conditions = ((List) (type1));
	//   33   66:aload_0         
	//   34   67:aload_1         
	//   35   68:putfield        #69  <Field List conditions>
	//   36   71:return          
	}

	public static ResponseField forBoolean(String s, String s1, Map map, boolean flag, List list)
	{
		return new ResponseField(Type.BOOLEAN, s, s1, map, flag, list);
	//    0    0:new             #2   <Class ResponseField>
	//    1    3:dup             
	//    2    4:getstatic       #77  <Field ResponseField$Type ResponseField$Type.BOOLEAN>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:invokespecial   #79  <Method void ResponseField(ResponseField$Type, String, String, Map, boolean, List)>
	//    9   16:areturn         
	}

	public static CustomTypeField forCustomType(String s, String s1, Map map, boolean flag, ScalarType scalartype, List list)
	{
		return new CustomTypeField(s, s1, map, flag, scalartype, list);
	//    0    0:new             #14  <Class ResponseField$CustomTypeField>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:invokespecial   #85  <Method void ResponseField$CustomTypeField(String, String, Map, boolean, ScalarType, List)>
	//    9   15:areturn         
	}

	public static ResponseField forDouble(String s, String s1, Map map, boolean flag, List list)
	{
		return new ResponseField(Type.DOUBLE, s, s1, map, flag, list);
	//    0    0:new             #2   <Class ResponseField>
	//    1    3:dup             
	//    2    4:getstatic       #90  <Field ResponseField$Type ResponseField$Type.DOUBLE>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:invokespecial   #79  <Method void ResponseField(ResponseField$Type, String, String, Map, boolean, List)>
	//    9   16:areturn         
	}

	public static ResponseField forFragment(String s, String s1, List list)
	{
		ArrayList arraylist = new ArrayList(list.size());
	//    0    0:new             #94  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokeinterface #100 <Method int List.size()>
	//    4   10:invokespecial   #103 <Method void ArrayList(int)>
	//    5   13:astore_3        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (Condition.typeCondition((String)((Iterator) (list)).next())))));
	//    6   14:aload_2         
	//    7   15:invokeinterface #107 <Method Iterator List.iterator()>
	//    8   20:astore_2        
	//    9   21:aload_2         
	//   10   22:invokeinterface #113 <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            52
	//   12   30:aload_3         
	//   13   31:aload_2         
	//   14   32:invokeinterface #117 <Method Object Iterator.next()>
	//   15   37:checkcast       #119 <Class String>
	//   16   40:invokestatic    #123 <Method ResponseField$TypeNameCondition ResponseField$Condition.typeCondition(String)>
	//   17   43:invokeinterface #127 <Method boolean List.add(Object)>
	//   18   48:pop             
	//*  19   49:goto            21
		return new ResponseField(Type.FRAGMENT, s, s1, Collections.emptyMap(), false, ((List) (arraylist)));
	//   20   52:new             #2   <Class ResponseField>
	//   21   55:dup             
	//   22   56:getstatic       #130 <Field ResponseField$Type ResponseField$Type.FRAGMENT>
	//   23   59:aload_0         
	//   24   60:aload_1         
	//   25   61:invokestatic    #51  <Method Map Collections.emptyMap()>
	//   26   64:iconst_0        
	//   27   65:aload_3         
	//   28   66:invokespecial   #79  <Method void ResponseField(ResponseField$Type, String, String, Map, boolean, List)>
	//   29   69:areturn         
	}

	public static ResponseField forList(String s, String s1, Map map, boolean flag, List list)
	{
		return new ResponseField(Type.LIST, s, s1, map, flag, list);
	//    0    0:new             #2   <Class ResponseField>
	//    1    3:dup             
	//    2    4:getstatic       #135 <Field ResponseField$Type ResponseField$Type.LIST>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:invokespecial   #79  <Method void ResponseField(ResponseField$Type, String, String, Map, boolean, List)>
	//    9   16:areturn         
	}

	public static ResponseField forLong(String s, String s1, Map map, boolean flag, List list)
	{
		return new ResponseField(Type.LONG, s, s1, map, flag, list);
	//    0    0:new             #2   <Class ResponseField>
	//    1    3:dup             
	//    2    4:getstatic       #139 <Field ResponseField$Type ResponseField$Type.LONG>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:invokespecial   #79  <Method void ResponseField(ResponseField$Type, String, String, Map, boolean, List)>
	//    9   16:areturn         
	}

	public static ResponseField forObject(String s, String s1, Map map, boolean flag, List list)
	{
		return new ResponseField(Type.OBJECT, s, s1, map, flag, list);
	//    0    0:new             #2   <Class ResponseField>
	//    1    3:dup             
	//    2    4:getstatic       #143 <Field ResponseField$Type ResponseField$Type.OBJECT>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:invokespecial   #79  <Method void ResponseField(ResponseField$Type, String, String, Map, boolean, List)>
	//    9   16:areturn         
	}

	public static ResponseField forString(String s, String s1, Map map, boolean flag, List list)
	{
		return new ResponseField(Type.STRING, s, s1, map, flag, list);
	//    0    0:new             #2   <Class ResponseField>
	//    1    3:dup             
	//    2    4:getstatic       #147 <Field ResponseField$Type ResponseField$Type.STRING>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:invokespecial   #79  <Method void ResponseField(ResponseField$Type, String, String, Map, boolean, List)>
	//    9   16:areturn         
	}

	private boolean isArgumentValueVariableType(Map map)
	{
		return map.containsKey("kind") && map.get("kind").equals("Variable") && map.containsKey("variableName");
	//    0    0:aload_1         
	//    1    1:ldc1            #151 <String "kind">
	//    2    3:invokeinterface #156 <Method boolean Map.containsKey(Object)>
	//    3    8:ifeq            40
	//    4   11:aload_1         
	//    5   12:ldc1            #151 <String "kind">
	//    6   14:invokeinterface #160 <Method Object Map.get(Object)>
	//    7   19:ldc1            #162 <String "Variable">
	//    8   21:invokevirtual   #165 <Method boolean Object.equals(Object)>
	//    9   24:ifeq            40
	//   10   27:aload_1         
	//   11   28:ldc1            #167 <String "variableName">
	//   12   30:invokeinterface #156 <Method boolean Map.containsKey(Object)>
	//   13   35:ifeq            40
	//   14   38:iconst_1        
	//   15   39:ireturn         
	//   16   40:iconst_0        
	//   17   41:ireturn         
	}

	private String orderIndependentKey(Map map, Operation.Variables variables)
	{
		if(isArgumentValueVariableType(map))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #172 <Method boolean isArgumentValueVariableType(Map)>
	//*   3    5:ifeq            15
			return orderIndependentKeyForVariableArgument(map, variables);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #175 <Method String orderIndependentKeyForVariableArgument(Map, Operation$Variables)>
	//    8   14:areturn         
		ArrayList arraylist = new ArrayList(((java.util.Collection) (map.entrySet())));
	//    9   15:new             #94  <Class ArrayList>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokeinterface #179 <Method java.util.Set Map.entrySet()>
	//   13   25:invokespecial   #182 <Method void ArrayList(java.util.Collection)>
	//   14   28:astore          5
		Collections.sort(((List) (arraylist)), new Comparator() {

			public volatile int compare(Object obj, Object obj1)
			{
				return compare((java.util.Map.Entry)obj, (java.util.Map.Entry)obj1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class java.util.Map$Entry>
			//    3    5:aload_2         
			//    4    6:checkcast       #26  <Class java.util.Map$Entry>
			//    5    9:invokevirtual   #29  <Method int compare(java.util.Map$Entry, java.util.Map$Entry)>
			//    6   12:ireturn         
			}

			public int compare(java.util.Map.Entry entry, java.util.Map.Entry entry1)
			{
				return ((String)entry.getKey()).compareTo((String)entry1.getKey());
			//    0    0:aload_1         
			//    1    1:invokeinterface #33  <Method Object java.util.Map$Entry.getKey()>
			//    2    6:checkcast       #35  <Class String>
			//    3    9:aload_2         
			//    4   10:invokeinterface #33  <Method Object java.util.Map$Entry.getKey()>
			//    5   15:checkcast       #35  <Class String>
			//    6   18:invokevirtual   #39  <Method int String.compareTo(String)>
			//    7   21:ireturn         
			}

			final ResponseField this$0;

			
			{
				this$0 = ResponseField.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ResponseField this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   15   30:aload           5
	//   16   32:new             #6   <Class ResponseField$1>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokespecial   #185 <Method void ResponseField$1(ResponseField)>
	//   20   40:invokestatic    #189 <Method void Collections.sort(List, Comparator)>
		StringBuilder stringbuilder = new StringBuilder();
	//   21   43:new             #191 <Class StringBuilder>
	//   22   46:dup             
	//   23   47:invokespecial   #192 <Method void StringBuilder()>
	//   24   50:astore          6
		for(int i = 0; i < ((List) (arraylist)).size(); i++)
	//*  25   52:iconst_0        
	//*  26   53:istore_3        
	//*  27   54:iload_3         
	//*  28   55:aload           5
	//*  29   57:invokeinterface #100 <Method int List.size()>
	//*  30   62:icmpge          255
		{
			map = ((Map) ((java.util.Map.Entry)((List) (arraylist)).get(i)));
	//   31   65:aload           5
	//   32   67:iload_3         
	//   33   68:invokeinterface #195 <Method Object List.get(int)>
	//   34   73:checkcast       #197 <Class java.util.Map$Entry>
	//   35   76:astore_1        
			if(((java.util.Map.Entry) (map)).getValue() instanceof Map)
	//*  36   77:aload_1         
	//*  37   78:invokeinterface #200 <Method Object java.util.Map$Entry.getValue()>
	//*  38   83:instanceof      #153 <Class Map>
	//*  39   86:ifeq            189
			{
				Map map1 = (Map)((java.util.Map.Entry) (map)).getValue();
	//   40   89:aload_1         
	//   41   90:invokeinterface #200 <Method Object java.util.Map$Entry.getValue()>
	//   42   95:checkcast       #153 <Class Map>
	//   43   98:astore          7
				boolean flag = isArgumentValueVariableType(map1);
	//   44  100:aload_0         
	//   45  101:aload           7
	//   46  103:invokespecial   #172 <Method boolean isArgumentValueVariableType(Map)>
	//   47  106:istore          4
				stringbuilder.append((String)((java.util.Map.Entry) (map)).getKey());
	//   48  108:aload           6
	//   49  110:aload_1         
	//   50  111:invokeinterface #203 <Method Object java.util.Map$Entry.getKey()>
	//   51  116:checkcast       #119 <Class String>
	//   52  119:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   53  122:pop             
				stringbuilder.append(":");
	//   54  123:aload           6
	//   55  125:ldc1            #209 <String ":">
	//   56  127:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   57  130:pop             
				if(flag)
	//*  58  131:iload           4
	//*  59  133:ifeq            142
					map = "";
	//   60  136:ldc1            #211 <String "">
	//   61  138:astore_1        
				else
	//*  62  139:goto            145
					map = "[";
	//   63  142:ldc1            #213 <String "[">
	//   64  144:astore_1        
				stringbuilder.append(((String) (map)));
	//   65  145:aload           6
	//   66  147:aload_1         
	//   67  148:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   68  151:pop             
				stringbuilder.append(orderIndependentKey(map1, variables));
	//   69  152:aload           6
	//   70  154:aload_0         
	//   71  155:aload           7
	//   72  157:aload_2         
	//   73  158:invokespecial   #215 <Method String orderIndependentKey(Map, Operation$Variables)>
	//   74  161:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   75  164:pop             
				if(flag)
	//*  76  165:iload           4
	//*  77  167:ifeq            176
					map = "";
	//   78  170:ldc1            #211 <String "">
	//   79  172:astore_1        
				else
	//*  80  173:goto            179
					map = "]";
	//   81  176:ldc1            #217 <String "]">
	//   82  178:astore_1        
				stringbuilder.append(((String) (map)));
	//   83  179:aload           6
	//   84  181:aload_1         
	//   85  182:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   86  185:pop             
			} else
	//*  87  186:goto            227
			{
				stringbuilder.append((String)((java.util.Map.Entry) (map)).getKey());
	//   88  189:aload           6
	//   89  191:aload_1         
	//   90  192:invokeinterface #203 <Method Object java.util.Map$Entry.getKey()>
	//   91  197:checkcast       #119 <Class String>
	//   92  200:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   93  203:pop             
				stringbuilder.append(":");
	//   94  204:aload           6
	//   95  206:ldc1            #209 <String ":">
	//   96  208:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   97  211:pop             
				stringbuilder.append(((java.util.Map.Entry) (map)).getValue().toString());
	//   98  212:aload           6
	//   99  214:aload_1         
	//  100  215:invokeinterface #200 <Method Object java.util.Map$Entry.getValue()>
	//  101  220:invokevirtual   #221 <Method String Object.toString()>
	//  102  223:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//  103  226:pop             
			}
			if(i < ((List) (arraylist)).size() - 1)
	//* 104  227:iload_3         
	//* 105  228:aload           5
	//* 106  230:invokeinterface #100 <Method int List.size()>
	//* 107  235:iconst_1        
	//* 108  236:isub            
	//* 109  237:icmpge          248
				stringbuilder.append(",");
	//  110  240:aload           6
	//  111  242:ldc1            #223 <String ",">
	//  112  244:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//  113  247:pop             
		}

	//  114  248:iload_3         
	//  115  249:iconst_1        
	//  116  250:iadd            
	//  117  251:istore_3        
	//* 118  252:goto            54
		return stringbuilder.toString();
	//  119  255:aload           6
	//  120  257:invokevirtual   #224 <Method String StringBuilder.toString()>
	//  121  260:areturn         
	}

	private String orderIndependentKeyForVariableArgument(Map map, Operation.Variables variables)
	{
		map = ((Map) (map.get("variableName")));
	//    0    0:aload_1         
	//    1    1:ldc1            #167 <String "variableName">
	//    2    3:invokeinterface #160 <Method Object Map.get(Object)>
	//    3    8:astore_1        
		map = ((Map) (variables.valueMap().get(((Object) (map)))));
	//    4    9:aload_2         
	//    5   10:invokevirtual   #230 <Method Map Operation$Variables.valueMap()>
	//    6   13:aload_1         
	//    7   14:invokeinterface #160 <Method Object Map.get(Object)>
	//    8   19:astore_1        
		if(map == null)
	//*   9   20:aload_1         
	//*  10   21:ifnonnull       26
			return null;
	//   11   24:aconst_null     
	//   12   25:areturn         
		if(map instanceof Map)
	//*  13   26:aload_1         
	//*  14   27:instanceof      #153 <Class Map>
	//*  15   30:ifeq            43
			return orderIndependentKey((Map)map, variables);
	//   16   33:aload_0         
	//   17   34:aload_1         
	//   18   35:checkcast       #153 <Class Map>
	//   19   38:aload_2         
	//   20   39:invokespecial   #215 <Method String orderIndependentKey(Map, Operation$Variables)>
	//   21   42:areturn         
		else
			return ((Object) (map)).toString();
	//   22   43:aload_1         
	//   23   44:invokevirtual   #221 <Method String Object.toString()>
	//   24   47:areturn         
	}

	public Map arguments()
	{
		return arguments;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Map arguments>
	//    2    4:areturn         
	}

	public String cacheKey(Operation.Variables variables)
	{
		if(arguments.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field Map arguments>
	//*   2    4:invokeinterface #236 <Method boolean Map.isEmpty()>
	//*   3    9:ifeq            17
			return fieldName();
	//    4   12:aload_0         
	//    5   13:invokevirtual   #238 <Method String fieldName()>
	//    6   16:areturn         
		else
			return String.format("%s(%s)", new Object[] {
				fieldName(), orderIndependentKey(arguments, variables)
			});
	//    7   17:ldc1            #240 <String "%s(%s)">
	//    8   19:iconst_2        
	//    9   20:anewarray       Object[]
	//   10   23:dup             
	//   11   24:iconst_0        
	//   12   25:aload_0         
	//   13   26:invokevirtual   #238 <Method String fieldName()>
	//   14   29:aastore         
	//   15   30:dup             
	//   16   31:iconst_1        
	//   17   32:aload_0         
	//   18   33:aload_0         
	//   19   34:getfield        #57  <Field Map arguments>
	//   20   37:aload_1         
	//   21   38:invokespecial   #215 <Method String orderIndependentKey(Map, Operation$Variables)>
	//   22   41:aastore         
	//   23   42:invokestatic    #244 <Method String String.format(String, Object[])>
	//   24   45:areturn         
	}

	public List conditions()
	{
		return conditions;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field List conditions>
	//    2    4:areturn         
	}

	public String fieldName()
	{
		return fieldName;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String fieldName>
	//    2    4:areturn         
	}

	public boolean optional()
	{
		return optional;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean optional>
	//    2    4:ireturn         
	}

	public String responseName()
	{
		return responseName;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String responseName>
	//    2    4:areturn         
	}

	public Type type()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ResponseField$Type type>
	//    2    4:areturn         
	}

	private final Map arguments;
	private final List conditions;
	private final String fieldName;
	private final boolean optional;
	private final String responseName;
	private final Type type;
}
