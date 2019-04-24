// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsonFormatVisitors;

import java.util.HashMap;
import java.util.Map;

public final class JsonFormatTypes extends Enum
{

	private JsonFormatTypes(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #78  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static JsonFormatTypes forValue(String s)
	{
		return (JsonFormatTypes)_byLCName.get(((Object) (s)));
	//    0    0:getstatic       #57  <Field Map _byLCName>
	//    1    3:aload_0         
	//    2    4:invokeinterface #86  <Method Object Map.get(Object)>
	//    3    9:checkcast       #2   <Class JsonFormatTypes>
	//    4   12:areturn         
	}

	public static JsonFormatTypes valueOf(String s)
	{
		return (JsonFormatTypes)Enum.valueOf(com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes, s);
	//    0    0:ldc1            #2   <Class JsonFormatTypes>
	//    1    2:aload_0         
	//    2    3:invokestatic    #91  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonFormatTypes>
	//    4    9:areturn         
	}

	public static JsonFormatTypes[] values()
	{
		return (JsonFormatTypes[])((JsonFormatTypes []) ($VALUES)).clone();
	//    0    0:getstatic       #51  <Field JsonFormatTypes[] $VALUES>
	//    1    3:invokevirtual   #96  <Method Object _5B_Lcom.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes_3B_.clone()>
	//    2    6:checkcast       #92  <Class JsonFormatTypes[]>
	//    3    9:areturn         
	}

	public String value()
	{
		return name().toLowerCase();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method String name()>
	//    2    4:invokevirtual   #70  <Method String String.toLowerCase()>
	//    3    7:areturn         
	}

	private static final JsonFormatTypes $VALUES[];
	public static final JsonFormatTypes ANY;
	public static final JsonFormatTypes ARRAY;
	public static final JsonFormatTypes BOOLEAN;
	public static final JsonFormatTypes INTEGER;
	public static final JsonFormatTypes NULL;
	public static final JsonFormatTypes NUMBER;
	public static final JsonFormatTypes OBJECT;
	public static final JsonFormatTypes STRING;
	private static final Map _byLCName;

	static 
	{
		STRING = new JsonFormatTypes("STRING", 0);
	//    0    0:new             #2   <Class JsonFormatTypes>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "STRING">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #26  <Method void JsonFormatTypes(String, int)>
	//    5   10:putstatic       #28  <Field JsonFormatTypes STRING>
		NUMBER = new JsonFormatTypes("NUMBER", 1);
	//    6   13:new             #2   <Class JsonFormatTypes>
	//    7   16:dup             
	//    8   17:ldc1            #29  <String "NUMBER">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #26  <Method void JsonFormatTypes(String, int)>
	//   11   23:putstatic       #31  <Field JsonFormatTypes NUMBER>
		INTEGER = new JsonFormatTypes("INTEGER", 2);
	//   12   26:new             #2   <Class JsonFormatTypes>
	//   13   29:dup             
	//   14   30:ldc1            #32  <String "INTEGER">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #26  <Method void JsonFormatTypes(String, int)>
	//   17   36:putstatic       #34  <Field JsonFormatTypes INTEGER>
		BOOLEAN = new JsonFormatTypes("BOOLEAN", 3);
	//   18   39:new             #2   <Class JsonFormatTypes>
	//   19   42:dup             
	//   20   43:ldc1            #35  <String "BOOLEAN">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #26  <Method void JsonFormatTypes(String, int)>
	//   23   49:putstatic       #37  <Field JsonFormatTypes BOOLEAN>
		OBJECT = new JsonFormatTypes("OBJECT", 4);
	//   24   52:new             #2   <Class JsonFormatTypes>
	//   25   55:dup             
	//   26   56:ldc1            #38  <String "OBJECT">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #26  <Method void JsonFormatTypes(String, int)>
	//   29   62:putstatic       #40  <Field JsonFormatTypes OBJECT>
		ARRAY = new JsonFormatTypes("ARRAY", 5);
	//   30   65:new             #2   <Class JsonFormatTypes>
	//   31   68:dup             
	//   32   69:ldc1            #41  <String "ARRAY">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #26  <Method void JsonFormatTypes(String, int)>
	//   35   75:putstatic       #43  <Field JsonFormatTypes ARRAY>
		NULL = new JsonFormatTypes("NULL", 6);
	//   36   78:new             #2   <Class JsonFormatTypes>
	//   37   81:dup             
	//   38   82:ldc1            #44  <String "NULL">
	//   39   84:bipush          6
	//   40   86:invokespecial   #26  <Method void JsonFormatTypes(String, int)>
	//   41   89:putstatic       #46  <Field JsonFormatTypes NULL>
		ANY = new JsonFormatTypes("ANY", 7);
	//   42   92:new             #2   <Class JsonFormatTypes>
	//   43   95:dup             
	//   44   96:ldc1            #47  <String "ANY">
	//   45   98:bipush          7
	//   46  100:invokespecial   #26  <Method void JsonFormatTypes(String, int)>
	//   47  103:putstatic       #49  <Field JsonFormatTypes ANY>
		$VALUES = (new JsonFormatTypes[] {
			STRING, NUMBER, INTEGER, BOOLEAN, OBJECT, ARRAY, NULL, ANY
		});
	//   48  106:bipush          8
	//   49  108:anewarray       JsonFormatTypes[]
	//   50  111:dup             
	//   51  112:iconst_0        
	//   52  113:getstatic       #28  <Field JsonFormatTypes STRING>
	//   53  116:aastore         
	//   54  117:dup             
	//   55  118:iconst_1        
	//   56  119:getstatic       #31  <Field JsonFormatTypes NUMBER>
	//   57  122:aastore         
	//   58  123:dup             
	//   59  124:iconst_2        
	//   60  125:getstatic       #34  <Field JsonFormatTypes INTEGER>
	//   61  128:aastore         
	//   62  129:dup             
	//   63  130:iconst_3        
	//   64  131:getstatic       #37  <Field JsonFormatTypes BOOLEAN>
	//   65  134:aastore         
	//   66  135:dup             
	//   67  136:iconst_4        
	//   68  137:getstatic       #40  <Field JsonFormatTypes OBJECT>
	//   69  140:aastore         
	//   70  141:dup             
	//   71  142:iconst_5        
	//   72  143:getstatic       #43  <Field JsonFormatTypes ARRAY>
	//   73  146:aastore         
	//   74  147:dup             
	//   75  148:bipush          6
	//   76  150:getstatic       #46  <Field JsonFormatTypes NULL>
	//   77  153:aastore         
	//   78  154:dup             
	//   79  155:bipush          7
	//   80  157:getstatic       #49  <Field JsonFormatTypes ANY>
	//   81  160:aastore         
	//   82  161:putstatic       #51  <Field JsonFormatTypes[] $VALUES>
		_byLCName = ((Map) (new HashMap()));
	//   83  164:new             #53  <Class HashMap>
	//   84  167:dup             
	//   85  168:invokespecial   #55  <Method void HashMap()>
	//   86  171:putstatic       #57  <Field Map _byLCName>
		JsonFormatTypes ajsonformattypes[] = values();
	//   87  174:invokestatic    #61  <Method JsonFormatTypes[] values()>
	//   88  177:astore_2        
		int j = ajsonformattypes.length;
	//   89  178:aload_2         
	//   90  179:arraylength     
	//   91  180:istore_1        
		for(int i = 0; i < j; i++)
	//*  92  181:iconst_0        
	//*  93  182:istore_0        
	//*  94  183:iload_0         
	//*  95  184:iload_1         
	//*  96  185:icmpge          216
		{
			JsonFormatTypes jsonformattypes = ajsonformattypes[i];
	//   97  188:aload_2         
	//   98  189:iload_0         
	//   99  190:aaload          
	//  100  191:astore_3        
			_byLCName.put(((Object) (jsonformattypes.name().toLowerCase())), ((Object) (jsonformattypes)));
	//  101  192:getstatic       #57  <Field Map _byLCName>
	//  102  195:aload_3         
	//  103  196:invokevirtual   #65  <Method String name()>
	//  104  199:invokevirtual   #70  <Method String String.toLowerCase()>
	//  105  202:aload_3         
	//  106  203:invokeinterface #76  <Method Object Map.put(Object, Object)>
	//  107  208:pop             
		}

	//  108  209:iload_0         
	//  109  210:iconst_1        
	//  110  211:iadd            
	//  111  212:istore_0        
	//* 112  213:goto            183
	//* 113  216:return          
	}
}
