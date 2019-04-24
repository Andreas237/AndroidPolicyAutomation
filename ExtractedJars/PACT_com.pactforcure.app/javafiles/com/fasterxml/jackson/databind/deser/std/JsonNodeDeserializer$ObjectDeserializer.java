// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			BaseNodeDeserializer, JsonNodeDeserializer

static final class JsonNodeDeserializer$ObjectDeserializer extends BaseNodeDeserializer
{

	public static JsonNodeDeserializer$ObjectDeserializer getInstance()
	{
		return _instance;
	//    0    0:getstatic       #21  <Field JsonNodeDeserializer$ObjectDeserializer _instance>
	//    1    3:areturn         
	}

	public ObjectNode deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.isExpectedStartObjectToken() || jsonparser.hasToken(JsonToken.FIELD_NAME))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #39  <Method boolean JsonParser.isExpectedStartObjectToken()>
	//*   2    4:ifne            17
	//*   3    7:aload_1         
	//*   4    8:getstatic       #45  <Field JsonToken JsonToken.FIELD_NAME>
	//*   5   11:invokevirtual   #49  <Method boolean JsonParser.hasToken(JsonToken)>
	//*   6   14:ifeq            28
			return deserializeObject(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory());
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:aload_2         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #55  <Method JsonNodeFactory DeserializationContext.getNodeFactory()>
	//   12   24:invokevirtual   #59  <Method ObjectNode deserializeObject(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   13   27:areturn         
		if(jsonparser.hasToken(JsonToken.END_OBJECT))
	//*  14   28:aload_1         
	//*  15   29:getstatic       #62  <Field JsonToken JsonToken.END_OBJECT>
	//*  16   32:invokevirtual   #49  <Method boolean JsonParser.hasToken(JsonToken)>
	//*  17   35:ifeq            46
			return deserializationcontext.getNodeFactory().objectNode();
	//   18   38:aload_2         
	//   19   39:invokevirtual   #55  <Method JsonNodeFactory DeserializationContext.getNodeFactory()>
	//   20   42:invokevirtual   #68  <Method ObjectNode JsonNodeFactory.objectNode()>
	//   21   45:areturn         
		else
			throw deserializationcontext.mappingException(com/fasterxml/jackson/databind/node/ObjectNode);
	//   22   46:aload_2         
	//   23   47:ldc1            #24  <Class ObjectNode>
	//   24   49:invokevirtual   #72  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(Class)>
	//   25   52:athrow          
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #78  <Method ObjectNode deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected static final JsonNodeDeserializer$ObjectDeserializer _instance = new JsonNodeDeserializer$ObjectDeserializer();
	private static final long serialVersionUID = 1L;

	static 
	{
	//    0    0:new             #2   <Class JsonNodeDeserializer$ObjectDeserializer>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void JsonNodeDeserializer$ObjectDeserializer()>
	//    3    7:putstatic       #21  <Field JsonNodeDeserializer$ObjectDeserializer _instance>
	//*   4   10:return          
	}

	protected JsonNodeDeserializer$ObjectDeserializer()
	{
		super(com/fasterxml/jackson/databind/node/ObjectNode);
	//    0    0:aload_0         
	//    1    1:ldc1            #24  <Class ObjectNode>
	//    2    3:invokespecial   #27  <Method void BaseNodeDeserializer(Class)>
	//    3    6:return          
	}
}
