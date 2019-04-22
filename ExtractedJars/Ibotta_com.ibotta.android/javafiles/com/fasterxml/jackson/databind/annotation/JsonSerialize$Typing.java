// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.annotation;


// Referenced classes of package com.fasterxml.jackson.databind.annotation:
//			JsonSerialize

public static final class JsonSerialize$Typing extends Enum
{

	public static JsonSerialize$Typing valueOf(String s)
	{
		return (JsonSerialize$Typing)Enum.valueOf(com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing, s);
	//    0    0:ldc1            #2   <Class JsonSerialize$Typing>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonSerialize$Typing>
	//    4    9:areturn         
	}

	public static JsonSerialize$Typing[] values()
	{
		return (JsonSerialize$Typing[])((JsonSerialize$Typing []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field JsonSerialize$Typing[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.fasterxml.jackson.databind.annotation.JsonSerialize$Typing_3B_.clone()>
	//    2    6:checkcast       #42  <Class JsonSerialize$Typing[]>
	//    3    9:areturn         
	}

	private static final JsonSerialize$Typing $VALUES[];
	public static final JsonSerialize$Typing DEFAULT_TYPING;
	public static final JsonSerialize$Typing DYNAMIC;
	public static final JsonSerialize$Typing STATIC;

	static 
	{
		DYNAMIC = new JsonSerialize$Typing("DYNAMIC", 0);
	//    0    0:new             #2   <Class JsonSerialize$Typing>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "DYNAMIC">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void JsonSerialize$Typing(String, int)>
	//    5   10:putstatic       #23  <Field JsonSerialize$Typing DYNAMIC>
		STATIC = new JsonSerialize$Typing("STATIC", 1);
	//    6   13:new             #2   <Class JsonSerialize$Typing>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "STATIC">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void JsonSerialize$Typing(String, int)>
	//   11   23:putstatic       #26  <Field JsonSerialize$Typing STATIC>
		DEFAULT_TYPING = new JsonSerialize$Typing("DEFAULT_TYPING", 2);
	//   12   26:new             #2   <Class JsonSerialize$Typing>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "DEFAULT_TYPING">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void JsonSerialize$Typing(String, int)>
	//   17   36:putstatic       #29  <Field JsonSerialize$Typing DEFAULT_TYPING>
		$VALUES = (new JsonSerialize$Typing[] {
			DYNAMIC, STATIC, DEFAULT_TYPING
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       JsonSerialize$Typing[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field JsonSerialize$Typing DYNAMIC>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field JsonSerialize$Typing STATIC>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field JsonSerialize$Typing DEFAULT_TYPING>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field JsonSerialize$Typing[] $VALUES>
	//*  33   64:return          
	}

	private JsonSerialize$Typing(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
