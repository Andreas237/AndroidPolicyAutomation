// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;


// Referenced classes of package com.fasterxml.jackson.databind:
//			ObjectMapper

public static final class ObjectMapper$DefaultTyping extends Enum
{

	public static ObjectMapper$DefaultTyping valueOf(String s)
	{
		return (ObjectMapper$DefaultTyping)Enum.valueOf(com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping, s);
	//    0    0:ldc1            #2   <Class ObjectMapper$DefaultTyping>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ObjectMapper$DefaultTyping>
	//    4    9:areturn         
	}

	public static ObjectMapper$DefaultTyping[] values()
	{
		return (ObjectMapper$DefaultTyping[])((ObjectMapper$DefaultTyping []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field ObjectMapper$DefaultTyping[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.fasterxml.jackson.databind.ObjectMapper$DefaultTyping_3B_.clone()>
	//    2    6:checkcast       #46  <Class ObjectMapper$DefaultTyping[]>
	//    3    9:areturn         
	}

	private static final ObjectMapper$DefaultTyping $VALUES[];
	public static final ObjectMapper$DefaultTyping JAVA_LANG_OBJECT;
	public static final ObjectMapper$DefaultTyping NON_CONCRETE_AND_ARRAYS;
	public static final ObjectMapper$DefaultTyping NON_FINAL;
	public static final ObjectMapper$DefaultTyping OBJECT_AND_NON_CONCRETE;

	static 
	{
		JAVA_LANG_OBJECT = new ObjectMapper$DefaultTyping("JAVA_LANG_OBJECT", 0);
	//    0    0:new             #2   <Class ObjectMapper$DefaultTyping>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "JAVA_LANG_OBJECT">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void ObjectMapper$DefaultTyping(String, int)>
	//    5   10:putstatic       #24  <Field ObjectMapper$DefaultTyping JAVA_LANG_OBJECT>
		OBJECT_AND_NON_CONCRETE = new ObjectMapper$DefaultTyping("OBJECT_AND_NON_CONCRETE", 1);
	//    6   13:new             #2   <Class ObjectMapper$DefaultTyping>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "OBJECT_AND_NON_CONCRETE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void ObjectMapper$DefaultTyping(String, int)>
	//   11   23:putstatic       #27  <Field ObjectMapper$DefaultTyping OBJECT_AND_NON_CONCRETE>
		NON_CONCRETE_AND_ARRAYS = new ObjectMapper$DefaultTyping("NON_CONCRETE_AND_ARRAYS", 2);
	//   12   26:new             #2   <Class ObjectMapper$DefaultTyping>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "NON_CONCRETE_AND_ARRAYS">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void ObjectMapper$DefaultTyping(String, int)>
	//   17   36:putstatic       #30  <Field ObjectMapper$DefaultTyping NON_CONCRETE_AND_ARRAYS>
		NON_FINAL = new ObjectMapper$DefaultTyping("NON_FINAL", 3);
	//   18   39:new             #2   <Class ObjectMapper$DefaultTyping>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "NON_FINAL">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void ObjectMapper$DefaultTyping(String, int)>
	//   23   49:putstatic       #33  <Field ObjectMapper$DefaultTyping NON_FINAL>
		$VALUES = (new ObjectMapper$DefaultTyping[] {
			JAVA_LANG_OBJECT, OBJECT_AND_NON_CONCRETE, NON_CONCRETE_AND_ARRAYS, NON_FINAL
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       ObjectMapper$DefaultTyping[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field ObjectMapper$DefaultTyping JAVA_LANG_OBJECT>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field ObjectMapper$DefaultTyping OBJECT_AND_NON_CONCRETE>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field ObjectMapper$DefaultTyping NON_CONCRETE_AND_ARRAYS>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field ObjectMapper$DefaultTyping NON_FINAL>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field ObjectMapper$DefaultTyping[] $VALUES>
	//*  43   83:return          
	}

	private ObjectMapper$DefaultTyping(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
