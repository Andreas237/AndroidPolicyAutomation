// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;


// Referenced classes of package com.google.gson:
//			JsonElement

public final class JsonNull extends JsonElement
{

	public JsonNull()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void JsonElement()>
	//    2    4:return          
	}

	public volatile JsonElement deepCopy()
	{
		return ((JsonElement) (deepCopy()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method JsonNull deepCopy()>
	//    2    4:areturn         
	}

	public JsonNull deepCopy()
	{
		return INSTANCE;
	//    0    0:getstatic       #13  <Field JsonNull INSTANCE>
	//    1    3:areturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof JsonNull);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       12
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class JsonNull>
	//    5    9:ifeq            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public int hashCode()
	{
		return ((Object) (com/google/gson/JsonNull)).hashCode();
	//    0    0:ldc1            #2   <Class JsonNull>
	//    1    2:invokevirtual   #30  <Method int Object.hashCode()>
	//    2    5:ireturn         
	}

	public static final JsonNull INSTANCE = new JsonNull();

	static 
	{
	//    0    0:new             #2   <Class JsonNull>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void JsonNull()>
	//    3    7:putstatic       #13  <Field JsonNull INSTANCE>
	//*   4   10:return          
	}
}
