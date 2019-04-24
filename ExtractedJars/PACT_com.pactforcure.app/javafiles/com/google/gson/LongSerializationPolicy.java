// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;


// Referenced classes of package com.google.gson:
//			JsonElement, JsonPrimitive

public abstract class LongSerializationPolicy extends Enum
{

	private LongSerializationPolicy(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #31  <Method void Enum(String, int)>
	//    4    6:return          
	}


	public static LongSerializationPolicy valueOf(String s)
	{
		return (LongSerializationPolicy)Enum.valueOf(com/google/gson/LongSerializationPolicy, s);
	//    0    0:ldc1            #2   <Class LongSerializationPolicy>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class LongSerializationPolicy>
	//    4    9:areturn         
	}

	public static LongSerializationPolicy[] values()
	{
		return (LongSerializationPolicy[])((LongSerializationPolicy []) ($VALUES)).clone();
	//    0    0:getstatic       #29  <Field LongSerializationPolicy[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.google.gson.LongSerializationPolicy_3B_.clone()>
	//    2    6:checkcast       #42  <Class LongSerializationPolicy[]>
	//    3    9:areturn         
	}

	public abstract JsonElement serialize(Long long1);

	private static final LongSerializationPolicy $VALUES[];
	public static final LongSerializationPolicy DEFAULT;
	public static final LongSerializationPolicy STRING;

	static 
	{
		DEFAULT = ((LongSerializationPolicy) (new LongSerializationPolicy("DEFAULT", 0) {

			public JsonElement serialize(Long long1)
			{
				return ((JsonElement) (new JsonPrimitive(((Number) (long1)))));
			//    0    0:new             #14  <Class JsonPrimitive>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #17  <Method void JsonPrimitive(Number)>
			//    4    8:areturn         
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #9   <Method void LongSerializationPolicy(String, int, LongSerializationPolicy$1)>
			//    5    7:return          
			}
		}
));
	//    0    0:new             #7   <Class LongSerializationPolicy$1>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "DEFAULT">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void LongSerializationPolicy$1(String, int)>
	//    5   10:putstatic       #23  <Field LongSerializationPolicy DEFAULT>
		STRING = ((LongSerializationPolicy) (new LongSerializationPolicy("STRING", 1) {

			public JsonElement serialize(Long long1)
			{
				return ((JsonElement) (new JsonPrimitive(String.valueOf(((Object) (long1))))));
			//    0    0:new             #14  <Class JsonPrimitive>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokestatic    #20  <Method String String.valueOf(Object)>
			//    4    8:invokespecial   #23  <Method void JsonPrimitive(String)>
			//    5   11:areturn         
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #9   <Method void LongSerializationPolicy(String, int, LongSerializationPolicy$1)>
			//    5    7:return          
			}
		}
));
	//    6   13:new             #9   <Class LongSerializationPolicy$2>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "STRING">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #25  <Method void LongSerializationPolicy$2(String, int)>
	//   11   23:putstatic       #27  <Field LongSerializationPolicy STRING>
		$VALUES = (new LongSerializationPolicy[] {
			DEFAULT, STRING
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       LongSerializationPolicy[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #23  <Field LongSerializationPolicy DEFAULT>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #27  <Field LongSerializationPolicy STRING>
	//   21   41:aastore         
	//   22   42:putstatic       #29  <Field LongSerializationPolicy[] $VALUES>
	//*  23   45:return          
	}
}
