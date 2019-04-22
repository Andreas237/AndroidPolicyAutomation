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
		if(jsonparser.isExpectedStartObjectToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #45  <Method boolean JsonParser.isExpectedStartObjectToken()>
	//*   2    4:ifeq            18
			return deserializeObject(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory());
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #51  <Method JsonNodeFactory DeserializationContext.getNodeFactory()>
	//    8   14:invokevirtual   #55  <Method ObjectNode deserializeObject(JsonParser, DeserializationContext, JsonNodeFactory)>
	//    9   17:areturn         
		if(jsonparser.hasToken(JsonToken.FIELD_NAME))
	//*  10   18:aload_1         
	//*  11   19:getstatic       #61  <Field JsonToken JsonToken.FIELD_NAME>
	//*  12   22:invokevirtual   #65  <Method boolean JsonParser.hasToken(JsonToken)>
	//*  13   25:ifeq            39
			return deserializeObjectAtName(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory());
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #51  <Method JsonNodeFactory DeserializationContext.getNodeFactory()>
	//   19   35:invokevirtual   #68  <Method ObjectNode deserializeObjectAtName(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   20   38:areturn         
		if(jsonparser.hasToken(JsonToken.END_OBJECT))
	//*  21   39:aload_1         
	//*  22   40:getstatic       #71  <Field JsonToken JsonToken.END_OBJECT>
	//*  23   43:invokevirtual   #65  <Method boolean JsonParser.hasToken(JsonToken)>
	//*  24   46:ifeq            57
			return deserializationcontext.getNodeFactory().objectNode();
	//   25   49:aload_2         
	//   26   50:invokevirtual   #51  <Method JsonNodeFactory DeserializationContext.getNodeFactory()>
	//   27   53:invokevirtual   #77  <Method ObjectNode JsonNodeFactory.objectNode()>
	//   28   56:areturn         
		else
			return (ObjectNode)deserializationcontext.handleUnexpectedToken(com/fasterxml/jackson/databind/node/ObjectNode, jsonparser);
	//   29   57:aload_2         
	//   30   58:ldc1            #24  <Class ObjectNode>
	//   31   60:aload_1         
	//   32   61:invokevirtual   #81  <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   33   64:checkcast       #24  <Class ObjectNode>
	//   34   67:areturn         
	}

	public ObjectNode deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, ObjectNode objectnode)
		throws IOException
	{
		if(!jsonparser.isExpectedStartObjectToken() && !jsonparser.hasToken(JsonToken.FIELD_NAME))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #45  <Method boolean JsonParser.isExpectedStartObjectToken()>
	//*   2    4:ifne            31
	//*   3    7:aload_1         
	//*   4    8:getstatic       #61  <Field JsonToken JsonToken.FIELD_NAME>
	//*   5   11:invokevirtual   #65  <Method boolean JsonParser.hasToken(JsonToken)>
	//*   6   14:ifeq            20
	//*   7   17:goto            31
			return (ObjectNode)deserializationcontext.handleUnexpectedToken(com/fasterxml/jackson/databind/node/ObjectNode, jsonparser);
	//    8   20:aload_2         
	//    9   21:ldc1            #24  <Class ObjectNode>
	//   10   23:aload_1         
	//   11   24:invokevirtual   #81  <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   12   27:checkcast       #24  <Class ObjectNode>
	//   13   30:areturn         
		else
			return (ObjectNode)updateObject(jsonparser, deserializationcontext, objectnode);
	//   14   31:aload_0         
	//   15   32:aload_1         
	//   16   33:aload_2         
	//   17   34:aload_3         
	//   18   35:invokevirtual   #87  <Method com.fasterxml.jackson.databind.JsonNode updateObject(JsonParser, DeserializationContext, ObjectNode)>
	//   19   38:checkcast       #24  <Class ObjectNode>
	//   20   41:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #92  <Method ObjectNode deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext, (ObjectNode)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:checkcast       #24  <Class ObjectNode>
	//    5    7:invokevirtual   #95  <Method ObjectNode deserialize(JsonParser, DeserializationContext, ObjectNode)>
	//    6   10:areturn         
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
		super(com/fasterxml/jackson/databind/node/ObjectNode, Boolean.valueOf(true));
	//    0    0:aload_0         
	//    1    1:ldc1            #24  <Class ObjectNode>
	//    2    3:iconst_1        
	//    3    4:invokestatic    #30  <Method Boolean Boolean.valueOf(boolean)>
	//    4    7:invokespecial   #33  <Method void BaseNodeDeserializer(Class, Boolean)>
	//    5   10:return          
	}
}
