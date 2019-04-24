// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			ValueNode, JsonNodeType

public final class MissingNode extends ValueNode
{

	private MissingNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ValueNode()>
	//    2    4:return          
	}

	public static MissingNode getInstance()
	{
		return instance;
	//    0    0:getstatic       #13  <Field MissingNode instance>
	//    1    3:areturn         
	}

	public String asText()
	{
		return "";
	//    0    0:ldc1            #21  <String "">
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
		return JsonToken.NOT_AVAILABLE;
	//    0    0:getstatic       #30  <Field JsonToken JsonToken.NOT_AVAILABLE>
	//    1    3:areturn         
	}

	public JsonNode deepCopy()
	{
		return ((JsonNode) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
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
		return JsonNodeType.MISSING;
	//    0    0:getstatic       #44  <Field JsonNodeType JsonNodeType.MISSING>
	//    1    3:areturn         
	}

	public int hashCode()
	{
		return JsonNodeType.MISSING.ordinal();
	//    0    0:getstatic       #44  <Field JsonNodeType JsonNodeType.MISSING>
	//    1    3:invokevirtual   #49  <Method int JsonNodeType.ordinal()>
	//    2    6:ireturn         
	}

	public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonProcessingException
	{
		jsongenerator.writeNull();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #60  <Method void JsonGenerator.writeNull()>
	//    2    4:return          
	}

	public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException, JsonProcessingException
	{
		jsongenerator.writeNull();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #60  <Method void JsonGenerator.writeNull()>
	//    2    4:return          
	}

	public String toString()
	{
		return "";
	//    0    0:ldc1            #21  <String "">
	//    1    2:areturn         
	}

	private static final MissingNode instance = new MissingNode();

	static 
	{
	//    0    0:new             #2   <Class MissingNode>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void MissingNode()>
	//    3    7:putstatic       #13  <Field MissingNode instance>
	//*   4   10:return          
	}
}
