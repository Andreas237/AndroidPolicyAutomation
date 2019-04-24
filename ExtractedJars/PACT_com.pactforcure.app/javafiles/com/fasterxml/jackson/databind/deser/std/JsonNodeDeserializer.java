// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.*;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			BaseNodeDeserializer

public class JsonNodeDeserializer extends BaseNodeDeserializer
{
	static final class ArrayDeserializer extends BaseNodeDeserializer
	{

		public static ArrayDeserializer getInstance()
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
		//    7   11:invokevirtual   #45  <Method JsonNodeFactory DeserializationContext.getNodeFactory()>
		//    8   14:invokevirtual   #49  <Method ArrayNode deserializeArray(JsonParser, DeserializationContext, JsonNodeFactory)>
		//    9   17:areturn         
			else
				throw deserializationcontext.mappingException(com/fasterxml/jackson/databind/node/ArrayNode);
		//   10   18:aload_2         
		//   11   19:ldc1            #24  <Class ArrayNode>
		//   12   21:invokevirtual   #53  <Method JsonMappingException DeserializationContext.mappingException(Class)>
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

		protected static final ArrayDeserializer _instance = new ArrayDeserializer();
		private static final long serialVersionUID = 1L;

		static 
		{
		//    0    0:new             #2   <Class JsonNodeDeserializer$ArrayDeserializer>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void JsonNodeDeserializer$ArrayDeserializer()>
		//    3    7:putstatic       #21  <Field JsonNodeDeserializer$ArrayDeserializer _instance>
		//*   4   10:return          
		}

		protected ArrayDeserializer()
		{
			super(com/fasterxml/jackson/databind/node/ArrayNode);
		//    0    0:aload_0         
		//    1    1:ldc1            #24  <Class ArrayNode>
		//    2    3:invokespecial   #27  <Method void BaseNodeDeserializer(Class)>
		//    3    6:return          
		}
	}

	static final class ObjectDeserializer extends BaseNodeDeserializer
	{

		public static ObjectDeserializer getInstance()
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
		//   24   49:invokevirtual   #72  <Method JsonMappingException DeserializationContext.mappingException(Class)>
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

		protected static final ObjectDeserializer _instance = new ObjectDeserializer();
		private static final long serialVersionUID = 1L;

		static 
		{
		//    0    0:new             #2   <Class JsonNodeDeserializer$ObjectDeserializer>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void JsonNodeDeserializer$ObjectDeserializer()>
		//    3    7:putstatic       #21  <Field JsonNodeDeserializer$ObjectDeserializer _instance>
		//*   4   10:return          
		}

		protected ObjectDeserializer()
		{
			super(com/fasterxml/jackson/databind/node/ObjectNode);
		//    0    0:aload_0         
		//    1    1:ldc1            #24  <Class ObjectNode>
		//    2    3:invokespecial   #27  <Method void BaseNodeDeserializer(Class)>
		//    3    6:return          
		}
	}


	protected JsonNodeDeserializer()
	{
		super(com/fasterxml/jackson/databind/JsonNode);
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <Class JsonNode>
	//    2    3:invokespecial   #26  <Method void BaseNodeDeserializer(Class)>
	//    3    6:return          
	}

	public static JsonDeserializer getDeserializer(Class class1)
	{
		if(class1 == com/fasterxml/jackson/databind/node/ObjectNode)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #30  <Class ObjectNode>
	//*   2    3:if_acmpne       10
			return ((JsonDeserializer) (ObjectDeserializer.getInstance()));
	//    3    6:invokestatic    #34  <Method JsonNodeDeserializer$ObjectDeserializer JsonNodeDeserializer$ObjectDeserializer.getInstance()>
	//    4    9:areturn         
		if(class1 == com/fasterxml/jackson/databind/node/ArrayNode)
	//*   5   10:aload_0         
	//*   6   11:ldc1            #36  <Class ArrayNode>
	//*   7   13:if_acmpne       20
			return ((JsonDeserializer) (ArrayDeserializer.getInstance()));
	//    8   16:invokestatic    #39  <Method JsonNodeDeserializer$ArrayDeserializer JsonNodeDeserializer$ArrayDeserializer.getInstance()>
	//    9   19:areturn         
		else
			return ((JsonDeserializer) (instance));
	//   10   20:getstatic       #20  <Field JsonNodeDeserializer instance>
	//   11   23:areturn         
	}

	public JsonNode deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		switch(jsonparser.getCurrentTokenId())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #51  <Method int JsonParser.getCurrentTokenId()>
		{
	//*   2    4:tableswitch     1 3: default 32
	//	               1 43
	//	               2 32
	//	               3 54
		case 2: // '\002'
		default:
			return deserializeAny(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory());
	//    3   32:aload_0         
	//    4   33:aload_1         
	//    5   34:aload_2         
	//    6   35:aload_2         
	//    7   36:invokevirtual   #57  <Method JsonNodeFactory DeserializationContext.getNodeFactory()>
	//    8   39:invokevirtual   #61  <Method JsonNode deserializeAny(JsonParser, DeserializationContext, JsonNodeFactory)>
	//    9   42:areturn         

		case 1: // '\001'
			return ((JsonNode) (deserializeObject(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory())));
	//   10   43:aload_0         
	//   11   44:aload_1         
	//   12   45:aload_2         
	//   13   46:aload_2         
	//   14   47:invokevirtual   #57  <Method JsonNodeFactory DeserializationContext.getNodeFactory()>
	//   15   50:invokevirtual   #65  <Method ObjectNode deserializeObject(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   16   53:areturn         

		case 3: // '\003'
			return ((JsonNode) (deserializeArray(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory())));
	//   17   54:aload_0         
	//   18   55:aload_1         
	//   19   56:aload_2         
	//   20   57:aload_2         
	//   21   58:invokevirtual   #57  <Method JsonNodeFactory DeserializationContext.getNodeFactory()>
	//   22   61:invokevirtual   #69  <Method ArrayNode deserializeArray(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   23   64:areturn         
		}
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #75  <Method JsonNode deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return super.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #79  <Method Object BaseNodeDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//    5    7:areturn         
	}

	public JsonNode getNullValue()
	{
		return ((JsonNode) (NullNode.getInstance()));
	//    0    0:invokestatic    #87  <Method NullNode NullNode.getInstance()>
	//    1    3:areturn         
	}

	public JsonNode getNullValue(DeserializationContext deserializationcontext)
	{
		return ((JsonNode) (NullNode.getInstance()));
	//    0    0:invokestatic    #87  <Method NullNode NullNode.getInstance()>
	//    1    3:areturn         
	}

	public volatile Object getNullValue()
	{
		return ((Object) (getNullValue()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method JsonNode getNullValue()>
	//    2    4:areturn         
	}

	public volatile Object getNullValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return ((Object) (getNullValue(deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #97  <Method JsonNode getNullValue(DeserializationContext)>
	//    3    5:areturn         
	}

	public volatile boolean isCachable()
	{
		return super.isCachable();
	//    0    0:aload_0         
	//    1    1:invokespecial   #101 <Method boolean BaseNodeDeserializer.isCachable()>
	//    2    4:ireturn         
	}

	private static final JsonNodeDeserializer instance = new JsonNodeDeserializer();

	static 
	{
	//    0    0:new             #2   <Class JsonNodeDeserializer>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void JsonNodeDeserializer()>
	//    3    7:putstatic       #20  <Field JsonNodeDeserializer instance>
	//*   4   10:return          
	}
}
