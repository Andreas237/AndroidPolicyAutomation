// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;


// Referenced classes of package com.fasterxml.jackson.core:
//			JsonParser

public static final class JsonParser$NumberType extends Enum
{

	public static JsonParser$NumberType valueOf(String s)
	{
		return (JsonParser$NumberType)Enum.valueOf(com/fasterxml/jackson/core/JsonParser$NumberType, s);
	//    0    0:ldc1            #2   <Class JsonParser$NumberType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonParser$NumberType>
	//    4    9:areturn         
	}

	public static JsonParser$NumberType[] values()
	{
		return (JsonParser$NumberType[])((JsonParser$NumberType []) ($VALUES)).clone();
	//    0    0:getstatic       #43  <Field JsonParser$NumberType[] $VALUES>
	//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.fasterxml.jackson.core.JsonParser$NumberType_3B_.clone()>
	//    2    6:checkcast       #54  <Class JsonParser$NumberType[]>
	//    3    9:areturn         
	}

	private static final JsonParser$NumberType $VALUES[];
	public static final JsonParser$NumberType BIG_DECIMAL;
	public static final JsonParser$NumberType BIG_INTEGER;
	public static final JsonParser$NumberType DOUBLE;
	public static final JsonParser$NumberType FLOAT;
	public static final JsonParser$NumberType INT;
	public static final JsonParser$NumberType LONG;

	static 
	{
		INT = new JsonParser$NumberType("INT", 0);
	//    0    0:new             #2   <Class JsonParser$NumberType>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "INT">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void JsonParser$NumberType(String, int)>
	//    5   10:putstatic       #26  <Field JsonParser$NumberType INT>
		LONG = new JsonParser$NumberType("LONG", 1);
	//    6   13:new             #2   <Class JsonParser$NumberType>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "LONG">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void JsonParser$NumberType(String, int)>
	//   11   23:putstatic       #29  <Field JsonParser$NumberType LONG>
		BIG_INTEGER = new JsonParser$NumberType("BIG_INTEGER", 2);
	//   12   26:new             #2   <Class JsonParser$NumberType>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "BIG_INTEGER">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void JsonParser$NumberType(String, int)>
	//   17   36:putstatic       #32  <Field JsonParser$NumberType BIG_INTEGER>
		FLOAT = new JsonParser$NumberType("FLOAT", 3);
	//   18   39:new             #2   <Class JsonParser$NumberType>
	//   19   42:dup             
	//   20   43:ldc1            #33  <String "FLOAT">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #24  <Method void JsonParser$NumberType(String, int)>
	//   23   49:putstatic       #35  <Field JsonParser$NumberType FLOAT>
		DOUBLE = new JsonParser$NumberType("DOUBLE", 4);
	//   24   52:new             #2   <Class JsonParser$NumberType>
	//   25   55:dup             
	//   26   56:ldc1            #36  <String "DOUBLE">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #24  <Method void JsonParser$NumberType(String, int)>
	//   29   62:putstatic       #38  <Field JsonParser$NumberType DOUBLE>
		BIG_DECIMAL = new JsonParser$NumberType("BIG_DECIMAL", 5);
	//   30   65:new             #2   <Class JsonParser$NumberType>
	//   31   68:dup             
	//   32   69:ldc1            #39  <String "BIG_DECIMAL">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #24  <Method void JsonParser$NumberType(String, int)>
	//   35   75:putstatic       #41  <Field JsonParser$NumberType BIG_DECIMAL>
		$VALUES = (new JsonParser$NumberType[] {
			INT, LONG, BIG_INTEGER, FLOAT, DOUBLE, BIG_DECIMAL
		});
	//   36   78:bipush          6
	//   37   80:anewarray       JsonParser$NumberType[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #26  <Field JsonParser$NumberType INT>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #29  <Field JsonParser$NumberType LONG>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #32  <Field JsonParser$NumberType BIG_INTEGER>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #35  <Field JsonParser$NumberType FLOAT>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #38  <Field JsonParser$NumberType DOUBLE>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #41  <Field JsonParser$NumberType BIG_DECIMAL>
	//   61  118:aastore         
	//   62  119:putstatic       #43  <Field JsonParser$NumberType[] $VALUES>
	//*  63  122:return          
	}

	private JsonParser$NumberType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #45  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
