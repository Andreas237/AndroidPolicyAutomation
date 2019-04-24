// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			ValueNode, JsonNodeType

public final class NullNode extends ValueNode
{

	private NullNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ValueNode()>
	//    2    4:return          
	}

	public static NullNode getInstance()
	{
		return instance;
	//    0    0:getstatic       #13  <Field NullNode instance>
	//    1    3:areturn         
	}

	public String asText()
	{
		return "null";
	//    0    0:ldc1            #21  <String "null">
	//    1    2:areturn         
	}

	public String asText(String s)
	{
		return s;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	public JsonToken asToken()
	{
		return JsonToken.VALUE_NULL;
	//    0    0:getstatic       #30  <Field JsonToken JsonToken.VALUE_NULL>
	//    1    3:areturn         
	}

	public boolean equals(Object obj)
	{
		return obj == this;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:if_acmpne       7
	//    3    5:iconst_1        
	//    4    6:ireturn         
	//    5    7:iconst_0        
	//    6    8:ireturn         
	}

	public JsonNodeType getNodeType()
	{
		return JsonNodeType.NULL;
	//    0    0:getstatic       #40  <Field JsonNodeType JsonNodeType.NULL>
	//    1    3:areturn         
	}

	public int hashCode()
	{
		return JsonNodeType.NULL.ordinal();
	//    0    0:getstatic       #40  <Field JsonNodeType JsonNodeType.NULL>
	//    1    3:invokevirtual   #45  <Method int JsonNodeType.ordinal()>
	//    2    6:ireturn         
	}

	public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serializerprovider.defaultSerializeNull(jsongenerator);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #55  <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
	//    3    5:return          
	}

	public static final NullNode instance = new NullNode();

	static 
	{
	//    0    0:new             #2   <Class NullNode>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void NullNode()>
	//    3    7:putstatic       #13  <Field NullNode instance>
	//*   4   10:return          
	}
}
