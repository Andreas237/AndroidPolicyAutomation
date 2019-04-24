// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;


// Referenced classes of package com.fasterxml.jackson.annotation:
//			JsonTypeInfo

public static final class JsonTypeInfo$As extends Enum
{

	public static JsonTypeInfo$As valueOf(String s)
	{
		return (JsonTypeInfo$As)Enum.valueOf(com/fasterxml/jackson/annotation/JsonTypeInfo$As, s);
	//    0    0:ldc1            #2   <Class JsonTypeInfo$As>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonTypeInfo$As>
	//    4    9:areturn         
	}

	public static JsonTypeInfo$As[] values()
	{
		return (JsonTypeInfo$As[])((JsonTypeInfo$As []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field JsonTypeInfo$As[] $VALUES>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.fasterxml.jackson.annotation.JsonTypeInfo$As_3B_.clone()>
	//    2    6:checkcast       #50  <Class JsonTypeInfo$As[]>
	//    3    9:areturn         
	}

	private static final JsonTypeInfo$As $VALUES[];
	public static final JsonTypeInfo$As EXISTING_PROPERTY;
	public static final JsonTypeInfo$As EXTERNAL_PROPERTY;
	public static final JsonTypeInfo$As PROPERTY;
	public static final JsonTypeInfo$As WRAPPER_ARRAY;
	public static final JsonTypeInfo$As WRAPPER_OBJECT;

	static 
	{
		PROPERTY = new JsonTypeInfo$As("PROPERTY", 0);
	//    0    0:new             #2   <Class JsonTypeInfo$As>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "PROPERTY">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void JsonTypeInfo$As(String, int)>
	//    5   10:putstatic       #25  <Field JsonTypeInfo$As PROPERTY>
		WRAPPER_OBJECT = new JsonTypeInfo$As("WRAPPER_OBJECT", 1);
	//    6   13:new             #2   <Class JsonTypeInfo$As>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "WRAPPER_OBJECT">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void JsonTypeInfo$As(String, int)>
	//   11   23:putstatic       #28  <Field JsonTypeInfo$As WRAPPER_OBJECT>
		WRAPPER_ARRAY = new JsonTypeInfo$As("WRAPPER_ARRAY", 2);
	//   12   26:new             #2   <Class JsonTypeInfo$As>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "WRAPPER_ARRAY">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void JsonTypeInfo$As(String, int)>
	//   17   36:putstatic       #31  <Field JsonTypeInfo$As WRAPPER_ARRAY>
		EXTERNAL_PROPERTY = new JsonTypeInfo$As("EXTERNAL_PROPERTY", 3);
	//   18   39:new             #2   <Class JsonTypeInfo$As>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "EXTERNAL_PROPERTY">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void JsonTypeInfo$As(String, int)>
	//   23   49:putstatic       #34  <Field JsonTypeInfo$As EXTERNAL_PROPERTY>
		EXISTING_PROPERTY = new JsonTypeInfo$As("EXISTING_PROPERTY", 4);
	//   24   52:new             #2   <Class JsonTypeInfo$As>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "EXISTING_PROPERTY">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void JsonTypeInfo$As(String, int)>
	//   29   62:putstatic       #37  <Field JsonTypeInfo$As EXISTING_PROPERTY>
		$VALUES = (new JsonTypeInfo$As[] {
			PROPERTY, WRAPPER_OBJECT, WRAPPER_ARRAY, EXTERNAL_PROPERTY, EXISTING_PROPERTY
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       JsonTypeInfo$As[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #25  <Field JsonTypeInfo$As PROPERTY>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #28  <Field JsonTypeInfo$As WRAPPER_OBJECT>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #31  <Field JsonTypeInfo$As WRAPPER_ARRAY>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #34  <Field JsonTypeInfo$As EXTERNAL_PROPERTY>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #37  <Field JsonTypeInfo$As EXISTING_PROPERTY>
	//   51   98:aastore         
	//   52   99:putstatic       #39  <Field JsonTypeInfo$As[] $VALUES>
	//*  53  102:return          
	}

	private JsonTypeInfo$As(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
