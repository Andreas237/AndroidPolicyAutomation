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
	//    2    3:invokestatic    #63  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonFormat$Shape>
	//    4    9:areturn         
	}

	public static JsonFormat$Shape[] values()
	{
		return (JsonFormat$Shape[])((JsonFormat$Shape []) ($VALUES)).clone();
	//    0    0:getstatic       #55  <Field JsonFormat$Shape[] $VALUES>
	//    1    3:invokevirtual   #70  <Method Object _5B_Lcom.fasterxml.jackson.annotation.JsonFormat$Shape_3B_.clone()>
	//    2    6:checkcast       #66  <Class JsonFormat$Shape[]>
	//    3    9:areturn         
	}

	public boolean isNumeric()
	{
		return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
	//    0    0:aload_0         
	//    1    1:getstatic       #41  <Field JsonFormat$Shape NUMBER>
	//    2    4:if_acmpeq       21
	//    3    7:aload_0         
	//    4    8:getstatic       #47  <Field JsonFormat$Shape NUMBER_INT>
	//    5   11:if_acmpeq       21
	//    6   14:aload_0         
	//    7   15:getstatic       #44  <Field JsonFormat$Shape NUMBER_FLOAT>
	//    8   18:if_acmpne       23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public boolean isStructured()
	{
		return this == OBJECT || this == ARRAY;
	//    0    0:aload_0         
	//    1    1:getstatic       #38  <Field JsonFormat$Shape OBJECT>
	//    2    4:if_acmpeq       14
	//    3    7:aload_0         
	//    4    8:getstatic       #35  <Field JsonFormat$Shape ARRAY>
	//    5   11:if_acmpne       16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private static final JsonFormat$Shape $VALUES[];
	public static final JsonFormat$Shape ANY;
	public static final JsonFormat$Shape ARRAY;
	public static final JsonFormat$Shape BOOLEAN;
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
	//    2    4:ldc1            #23  <String "ANY">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #27  <Method void JsonFormat$Shape(String, int)>
	//    5   10:putstatic       #29  <Field JsonFormat$Shape ANY>
		SCALAR = new JsonFormat$Shape("SCALAR", 1);
	//    6   13:new             #2   <Class JsonFormat$Shape>
	//    7   16:dup             
	//    8   17:ldc1            #30  <String "SCALAR">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #27  <Method void JsonFormat$Shape(String, int)>
	//   11   23:putstatic       #32  <Field JsonFormat$Shape SCALAR>
		ARRAY = new JsonFormat$Shape("ARRAY", 2);
	//   12   26:new             #2   <Class JsonFormat$Shape>
	//   13   29:dup             
	//   14   30:ldc1            #33  <String "ARRAY">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #27  <Method void JsonFormat$Shape(String, int)>
	//   17   36:putstatic       #35  <Field JsonFormat$Shape ARRAY>
		OBJECT = new JsonFormat$Shape("OBJECT", 3);
	//   18   39:new             #2   <Class JsonFormat$Shape>
	//   19   42:dup             
	//   20   43:ldc1            #36  <String "OBJECT">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #27  <Method void JsonFormat$Shape(String, int)>
	//   23   49:putstatic       #38  <Field JsonFormat$Shape OBJECT>
		NUMBER = new JsonFormat$Shape("NUMBER", 4);
	//   24   52:new             #2   <Class JsonFormat$Shape>
	//   25   55:dup             
	//   26   56:ldc1            #39  <String "NUMBER">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #27  <Method void JsonFormat$Shape(String, int)>
	//   29   62:putstatic       #41  <Field JsonFormat$Shape NUMBER>
		NUMBER_FLOAT = new JsonFormat$Shape("NUMBER_FLOAT", 5);
	//   30   65:new             #2   <Class JsonFormat$Shape>
	//   31   68:dup             
	//   32   69:ldc1            #42  <String "NUMBER_FLOAT">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #27  <Method void JsonFormat$Shape(String, int)>
	//   35   75:putstatic       #44  <Field JsonFormat$Shape NUMBER_FLOAT>
		NUMBER_INT = new JsonFormat$Shape("NUMBER_INT", 6);
	//   36   78:new             #2   <Class JsonFormat$Shape>
	//   37   81:dup             
	//   38   82:ldc1            #45  <String "NUMBER_INT">
	//   39   84:bipush          6
	//   40   86:invokespecial   #27  <Method void JsonFormat$Shape(String, int)>
	//   41   89:putstatic       #47  <Field JsonFormat$Shape NUMBER_INT>
		STRING = new JsonFormat$Shape("STRING", 7);
	//   42   92:new             #2   <Class JsonFormat$Shape>
	//   43   95:dup             
	//   44   96:ldc1            #48  <String "STRING">
	//   45   98:bipush          7
	//   46  100:invokespecial   #27  <Method void JsonFormat$Shape(String, int)>
	//   47  103:putstatic       #50  <Field JsonFormat$Shape STRING>
		BOOLEAN = new JsonFormat$Shape("BOOLEAN", 8);
	//   48  106:new             #2   <Class JsonFormat$Shape>
	//   49  109:dup             
	//   50  110:ldc1            #51  <String "BOOLEAN">
	//   51  112:bipush          8
	//   52  114:invokespecial   #27  <Method void JsonFormat$Shape(String, int)>
	//   53  117:putstatic       #53  <Field JsonFormat$Shape BOOLEAN>
		$VALUES = (new JsonFormat$Shape[] {
			ANY, SCALAR, ARRAY, OBJECT, NUMBER, NUMBER_FLOAT, NUMBER_INT, STRING, BOOLEAN
		});
	//   54  120:bipush          9
	//   55  122:anewarray       JsonFormat$Shape[]
	//   56  125:dup             
	//   57  126:iconst_0        
	//   58  127:getstatic       #29  <Field JsonFormat$Shape ANY>
	//   59  130:aastore         
	//   60  131:dup             
	//   61  132:iconst_1        
	//   62  133:getstatic       #32  <Field JsonFormat$Shape SCALAR>
	//   63  136:aastore         
	//   64  137:dup             
	//   65  138:iconst_2        
	//   66  139:getstatic       #35  <Field JsonFormat$Shape ARRAY>
	//   67  142:aastore         
	//   68  143:dup             
	//   69  144:iconst_3        
	//   70  145:getstatic       #38  <Field JsonFormat$Shape OBJECT>
	//   71  148:aastore         
	//   72  149:dup             
	//   73  150:iconst_4        
	//   74  151:getstatic       #41  <Field JsonFormat$Shape NUMBER>
	//   75  154:aastore         
	//   76  155:dup             
	//   77  156:iconst_5        
	//   78  157:getstatic       #44  <Field JsonFormat$Shape NUMBER_FLOAT>
	//   79  160:aastore         
	//   80  161:dup             
	//   81  162:bipush          6
	//   82  164:getstatic       #47  <Field JsonFormat$Shape NUMBER_INT>
	//   83  167:aastore         
	//   84  168:dup             
	//   85  169:bipush          7
	//   86  171:getstatic       #50  <Field JsonFormat$Shape STRING>
	//   87  174:aastore         
	//   88  175:dup             
	//   89  176:bipush          8
	//   90  178:getstatic       #53  <Field JsonFormat$Shape BOOLEAN>
	//   91  181:aastore         
	//   92  182:putstatic       #55  <Field JsonFormat$Shape[] $VALUES>
	//*  93  185:return          
	}

	private JsonFormat$Shape(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #57  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
