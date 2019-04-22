// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;


// Referenced classes of package com.fasterxml.jackson.annotation:
//			JsonFormat

public static final class JsonFormat$Shape extends Enum
{

	public static JsonFormat$Shape valueOf(String s)
	{
		return (JsonFormat$Shape)Enum.valueOf(com/fasterxml/jackson/annotation/JsonFormat$Shape, s);
	//    0    0:ldc1            #2   <Class JsonFormat$Shape>
	//    1    2:aload_0         
	//    2    3:invokestatic    #67  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonFormat$Shape>
	//    4    9:areturn         
	}

	public static JsonFormat$Shape[] values()
	{
		return (JsonFormat$Shape[])((JsonFormat$Shape []) ($VALUES)).clone();
	//    0    0:getstatic       #59  <Field JsonFormat$Shape[] $VALUES>
	//    1    3:invokevirtual   #74  <Method Object _5B_Lcom.fasterxml.jackson.annotation.JsonFormat$Shape_3B_.clone()>
	//    2    6:checkcast       #70  <Class JsonFormat$Shape[]>
	//    3    9:areturn         
	}

	public boolean isNumeric()
	{
		return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
	//    0    0:aload_0         
	//    1    1:getstatic       #45  <Field JsonFormat$Shape NUMBER>
	//    2    4:if_acmpeq       26
	//    3    7:aload_0         
	//    4    8:getstatic       #51  <Field JsonFormat$Shape NUMBER_INT>
	//    5   11:if_acmpeq       26
	//    6   14:aload_0         
	//    7   15:getstatic       #48  <Field JsonFormat$Shape NUMBER_FLOAT>
	//    8   18:if_acmpne       24
	//    9   21:goto            26
	//   10   24:iconst_0        
	//   11   25:ireturn         
	//   12   26:iconst_1        
	//   13   27:ireturn         
	}

	private static final JsonFormat$Shape $VALUES[];
	public static final JsonFormat$Shape ANY;
	public static final JsonFormat$Shape ARRAY;
	public static final JsonFormat$Shape BOOLEAN;
	public static final JsonFormat$Shape NATURAL;
	public static final JsonFormat$Shape NUMBER;
	public static final JsonFormat$Shape NUMBER_FLOAT;
	public static final JsonFormat$Shape NUMBER_INT;
	public static final JsonFormat$Shape OBJECT;
	public static final JsonFormat$Shape SCALAR;
	public static final JsonFormat$Shape STRING;

	static 
	{
		ANY = new JsonFormat$Shape("ANY", 0);
	//    0    0:new             #2   <Class JsonFormat$Shape>
	//    1    3:dup             
	//    2    4:ldc1            #24  <String "ANY">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #28  <Method void JsonFormat$Shape(String, int)>
	//    5   10:putstatic       #30  <Field JsonFormat$Shape ANY>
		NATURAL = new JsonFormat$Shape("NATURAL", 1);
	//    6   13:new             #2   <Class JsonFormat$Shape>
	//    7   16:dup             
	//    8   17:ldc1            #31  <String "NATURAL">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #28  <Method void JsonFormat$Shape(String, int)>
	//   11   23:putstatic       #33  <Field JsonFormat$Shape NATURAL>
		SCALAR = new JsonFormat$Shape("SCALAR", 2);
	//   12   26:new             #2   <Class JsonFormat$Shape>
	//   13   29:dup             
	//   14   30:ldc1            #34  <String "SCALAR">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #28  <Method void JsonFormat$Shape(String, int)>
	//   17   36:putstatic       #36  <Field JsonFormat$Shape SCALAR>
		ARRAY = new JsonFormat$Shape("ARRAY", 3);
	//   18   39:new             #2   <Class JsonFormat$Shape>
	//   19   42:dup             
	//   20   43:ldc1            #37  <String "ARRAY">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #28  <Method void JsonFormat$Shape(String, int)>
	//   23   49:putstatic       #39  <Field JsonFormat$Shape ARRAY>
		OBJECT = new JsonFormat$Shape("OBJECT", 4);
	//   24   52:new             #2   <Class JsonFormat$Shape>
	//   25   55:dup             
	//   26   56:ldc1            #40  <String "OBJECT">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #28  <Method void JsonFormat$Shape(String, int)>
	//   29   62:putstatic       #42  <Field JsonFormat$Shape OBJECT>
		NUMBER = new JsonFormat$Shape("NUMBER", 5);
	//   30   65:new             #2   <Class JsonFormat$Shape>
	//   31   68:dup             
	//   32   69:ldc1            #43  <String "NUMBER">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #28  <Method void JsonFormat$Shape(String, int)>
	//   35   75:putstatic       #45  <Field JsonFormat$Shape NUMBER>
		NUMBER_FLOAT = new JsonFormat$Shape("NUMBER_FLOAT", 6);
	//   36   78:new             #2   <Class JsonFormat$Shape>
	//   37   81:dup             
	//   38   82:ldc1            #46  <String "NUMBER_FLOAT">
	//   39   84:bipush          6
	//   40   86:invokespecial   #28  <Method void JsonFormat$Shape(String, int)>
	//   41   89:putstatic       #48  <Field JsonFormat$Shape NUMBER_FLOAT>
		NUMBER_INT = new JsonFormat$Shape("NUMBER_INT", 7);
	//   42   92:new             #2   <Class JsonFormat$Shape>
	//   43   95:dup             
	//   44   96:ldc1            #49  <String "NUMBER_INT">
	//   45   98:bipush          7
	//   46  100:invokespecial   #28  <Method void JsonFormat$Shape(String, int)>
	//   47  103:putstatic       #51  <Field JsonFormat$Shape NUMBER_INT>
		STRING = new JsonFormat$Shape("STRING", 8);
	//   48  106:new             #2   <Class JsonFormat$Shape>
	//   49  109:dup             
	//   50  110:ldc1            #52  <String "STRING">
	//   51  112:bipush          8
	//   52  114:invokespecial   #28  <Method void JsonFormat$Shape(String, int)>
	//   53  117:putstatic       #54  <Field JsonFormat$Shape STRING>
		BOOLEAN = new JsonFormat$Shape("BOOLEAN", 9);
	//   54  120:new             #2   <Class JsonFormat$Shape>
	//   55  123:dup             
	//   56  124:ldc1            #55  <String "BOOLEAN">
	//   57  126:bipush          9
	//   58  128:invokespecial   #28  <Method void JsonFormat$Shape(String, int)>
	//   59  131:putstatic       #57  <Field JsonFormat$Shape BOOLEAN>
		$VALUES = (new JsonFormat$Shape[] {
			ANY, NATURAL, SCALAR, ARRAY, OBJECT, NUMBER, NUMBER_FLOAT, NUMBER_INT, STRING, BOOLEAN
		});
	//   60  134:bipush          10
	//   61  136:anewarray       JsonFormat$Shape[]
	//   62  139:dup             
	//   63  140:iconst_0        
	//   64  141:getstatic       #30  <Field JsonFormat$Shape ANY>
	//   65  144:aastore         
	//   66  145:dup             
	//   67  146:iconst_1        
	//   68  147:getstatic       #33  <Field JsonFormat$Shape NATURAL>
	//   69  150:aastore         
	//   70  151:dup             
	//   71  152:iconst_2        
	//   72  153:getstatic       #36  <Field JsonFormat$Shape SCALAR>
	//   73  156:aastore         
	//   74  157:dup             
	//   75  158:iconst_3        
	//   76  159:getstatic       #39  <Field JsonFormat$Shape ARRAY>
	//   77  162:aastore         
	//   78  163:dup             
	//   79  164:iconst_4        
	//   80  165:getstatic       #42  <Field JsonFormat$Shape OBJECT>
	//   81  168:aastore         
	//   82  169:dup             
	//   83  170:iconst_5        
	//   84  171:getstatic       #45  <Field JsonFormat$Shape NUMBER>
	//   85  174:aastore         
	//   86  175:dup             
	//   87  176:bipush          6
	//   88  178:getstatic       #48  <Field JsonFormat$Shape NUMBER_FLOAT>
	//   89  181:aastore         
	//   90  182:dup             
	//   91  183:bipush          7
	//   92  185:getstatic       #51  <Field JsonFormat$Shape NUMBER_INT>
	//   93  188:aastore         
	//   94  189:dup             
	//   95  190:bipush          8
	//   96  192:getstatic       #54  <Field JsonFormat$Shape STRING>
	//   97  195:aastore         
	//   98  196:dup             
	//   99  197:bipush          9
	//  100  199:getstatic       #57  <Field JsonFormat$Shape BOOLEAN>
	//  101  202:aastore         
	//  102  203:putstatic       #59  <Field JsonFormat$Shape[] $VALUES>
	//* 103  206:return          
	}

	private JsonFormat$Shape(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #61  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
