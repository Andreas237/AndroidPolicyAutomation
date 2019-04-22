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

	public static JsonFormatTypes valueOf(String s)
	{
		return (JsonFormatTypes)Enum.valueOf(com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes, s);
	//    0    0:ldc1            #2   <Class JsonFormatTypes>
	//    1    2:aload_0         
	//    2    3:invokestatic    #84  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonFormatTypes>
	//    4    9:areturn         
	}

	public static JsonFormatTypes[] values()
	{
		return (JsonFormatTypes[])((JsonFormatTypes []) ($VALUES)).clone();
	//    0    0:getstatic       #51  <Field JsonFormatTypes[] $VALUES>
	//    1    3:invokevirtual   #89  <Method Object _5B_Lcom.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes_3B_.clone()>
	//    2    6:checkcast       #85  <Class JsonFormatTypes[]>
	//    3    9:areturn         
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
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_0        
		STRING = new JsonFormatTypes("STRING", 0);
	//    2    2:new             #2   <Class JsonFormatTypes>
	//    3    5:dup             
	//    4    6:ldc1            #22  <String "STRING">
	//    5    8:iconst_0        
	//    6    9:invokespecial   #26  <Method void JsonFormatTypes(String, int)>
	//    7   12:putstatic       #28  <Field JsonFormatTypes STRING>
		NUMBER = new JsonFormatTypes("NUMBER", 1);
	//    8   15:new             #2   <Class JsonFormatTypes>
	//    9   18:dup             
	//   10   19:ldc1            #29  <String "NUMBER">
	//   11   21:iconst_1        
	//   12   22:invokespecial   #26  <Method void JsonFormatTypes(String, int)>
	//   13   25:putstatic       #31  <Field JsonFormatTypes NUMBER>
		INTEGER = new JsonFormatTypes("INTEGER", 2);
	//   14   28:new             #2   <Class JsonFormatTypes>
	//   15   31:dup             
	//   16   32:ldc1            #32  <String "INTEGER">
	//   17   34:iconst_2        
	//   18   35:invokespecial   #26  <Method void JsonFormatTypes(String, int)>
	//   19   38:putstatic       #34  <Field JsonFormatTypes INTEGER>
		BOOLEAN = new JsonFormatTypes("BOOLEAN", 3);
	//   20   41:new             #2   <Class JsonFormatTypes>
	//   21   44:dup             
	//   22   45:ldc1            #35  <String "BOOLEAN">
	//   23   47:iconst_3        
	//   24   48:invokespecial   #26  <Method void JsonFormatTypes(String, int)>
	//   25   51:putstatic       #37  <Field JsonFormatTypes BOOLEAN>
		OBJECT = new JsonFormatTypes("OBJECT", 4);
	//   26   54:new             #2   <Class JsonFormatTypes>
	//   27   57:dup             
	//   28   58:ldc1            #38  <String "OBJECT">
	//   29   60:iconst_4        
	//   30   61:invokespecial   #26  <Method void JsonFormatTypes(String, int)>
	//   31   64:putstatic       #40  <Field JsonFormatTypes OBJECT>
		ARRAY = new JsonFormatTypes("ARRAY", 5);
	//   32   67:new             #2   <Class JsonFormatTypes>
	//   33   70:dup             
	//   34   71:ldc1            #41  <String "ARRAY">
	//   35   73:iconst_5        
	//   36   74:invokespecial   #26  <Method void JsonFormatTypes(String, int)>
	//   37   77:putstatic       #43  <Field JsonFormatTypes ARRAY>
		NULL = new JsonFormatTypes("NULL", 6);
	//   38   80:new             #2   <Class JsonFormatTypes>
	//   39   83:dup             
	//   40   84:ldc1            #44  <String "NULL">
	//   41   86:bipush          6
	//   42   88:invokespecial   #26  <Method void JsonFormatTypes(String, int)>
	//   43   91:putstatic       #46  <Field JsonFormatTypes NULL>
		ANY = new JsonFormatTypes("ANY", 7);
	//   44   94:new             #2   <Class JsonFormatTypes>
	//   45   97:dup             
	//   46   98:ldc1            #47  <String "ANY">
	//   47  100:bipush          7
	//   48  102:invokespecial   #26  <Method void JsonFormatTypes(String, int)>
	//   49  105:putstatic       #49  <Field JsonFormatTypes ANY>
		$VALUES = (new JsonFormatTypes[] {
			STRING, NUMBER, INTEGER, BOOLEAN, OBJECT, ARRAY, NULL, ANY
		});
	//   50  108:bipush          8
	//   51  110:anewarray       JsonFormatTypes[]
	//   52  113:dup             
	//   53  114:iconst_0        
	//   54  115:getstatic       #28  <Field JsonFormatTypes STRING>
	//   55  118:aastore         
	//   56  119:dup             
	//   57  120:iconst_1        
	//   58  121:getstatic       #31  <Field JsonFormatTypes NUMBER>
	//   59  124:aastore         
	//   60  125:dup             
	//   61  126:iconst_2        
	//   62  127:getstatic       #34  <Field JsonFormatTypes INTEGER>
	//   63  130:aastore         
	//   64  131:dup             
	//   65  132:iconst_3        
	//   66  133:getstatic       #37  <Field JsonFormatTypes BOOLEAN>
	//   67  136:aastore         
	//   68  137:dup             
	//   69  138:iconst_4        
	//   70  139:getstatic       #40  <Field JsonFormatTypes OBJECT>
	//   71  142:aastore         
	//   72  143:dup             
	//   73  144:iconst_5        
	//   74  145:getstatic       #43  <Field JsonFormatTypes ARRAY>
	//   75  148:aastore         
	//   76  149:dup             
	//   77  150:bipush          6
	//   78  152:getstatic       #46  <Field JsonFormatTypes NULL>
	//   79  155:aastore         
	//   80  156:dup             
	//   81  157:bipush          7
	//   82  159:getstatic       #49  <Field JsonFormatTypes ANY>
	//   83  162:aastore         
	//   84  163:putstatic       #51  <Field JsonFormatTypes[] $VALUES>
		_byLCName = ((Map) (new HashMap()));
	//   85  166:new             #53  <Class HashMap>
	//   86  169:dup             
	//   87  170:invokespecial   #55  <Method void HashMap()>
	//   88  173:putstatic       #57  <Field Map _byLCName>
		JsonFormatTypes ajsonformattypes[] = values();
	//   89  176:invokestatic    #61  <Method JsonFormatTypes[] values()>
	//   90  179:astore_2        
		for(int j = ajsonformattypes.length; i < j; i++)
	//*  91  180:aload_2         
	//*  92  181:arraylength     
	//*  93  182:istore_1        
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
