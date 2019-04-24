// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			BaseNodeDeserializer, JsonNodeDeserializer

static final class JsonNodeDeserializer$ArrayDeserializer extends BaseNodeDeserializer
{

	public static JsonNodeDeserializer$ArrayDeserializer getInstance()
	{
		return _instance;
	//    0    0:getstatic       #21  <Field JsonNodeDeserializer$ArrayDeserializer _instance>
	//    1    3:areturn         
	}

	public ArrayNode deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #39  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifeq            18
			return deserializeArray(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory());
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #45  <Method com.fasterxml.jackson.databind.node.JsonNodeFactory DeserializationContext.getNodeFactory()>
	//    8   14:invokevirtual   #49  <Method ArrayNode deserializeArray(JsonParser, DeserializationContext, com.fasterxml.jackson.databind.node.JsonNodeFactory)>
	//    9   17:areturn         
		else
			throw deserializationcontext.mappingException(com/fasterxml/jackson/databind/node/ArrayNode);
	//   10   18:aload_2         
	//   11   19:ldc1            #24  <Class ArrayNode>
	//   12   21:invokevirtual   #53  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(Class)>
	//   13   24:athrow          
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #59  <Method ArrayNode deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected static final JsonNodeDeserializer$ArrayDeserializer _instance = new JsonNodeDeserializer$ArrayDeserializer();
	private static final long serialVersionUID = 1L;

	static 
	{
	//    0    0:new             #2   <Class JsonNodeDeserializer$ArrayDeserializer>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void JsonNodeDeserializer$ArrayDeserializer()>
	//    3    7:putstatic       #21  <Field JsonNodeDeserializer$ArrayDeserializer _instance>
	//*   4   10:return          
	}

	protected JsonNodeDeserializer$ArrayDeserializer()
	{
		super(com/fasterxml/jackson/databind/node/ArrayNode);
	//    0    0:aload_0         
	//    1    1:ldc1            #24  <Class ArrayNode>
	//    2    3:invokespecial   #27  <Method void BaseNodeDeserializer(Class)>
	//    3    6:return          
	}
}
