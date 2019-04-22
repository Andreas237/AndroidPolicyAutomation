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
		//*   1    1:invokevirtual   #45  <Method boolean JsonParser.isExpectedStartArrayToken()>
		//*   2    4:ifeq            18
				return deserializeArray(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory());
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:aload_2         
		//    7   11:invokevirtual   #51  <Method JsonNodeFactory DeserializationContext.getNodeFactory()>
		//    8   14:invokevirtual   #55  <Method ArrayNode deserializeArray(JsonParser, DeserializationContext, JsonNodeFactory)>
		//    9   17:areturn         
			else
				return (ArrayNode)deserializationcontext.handleUnexpectedToken(com/fasterxml/jackson/databind/node/ArrayNode, jsonparser);
		//   10   18:aload_2         
		//   11   19:ldc1            #24  <Class ArrayNode>
		//   12   21:aload_1         
		//   13   22:invokevirtual   #59  <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
		//   14   25:checkcast       #24  <Class ArrayNode>
		//   15   28:areturn         
		}

		public ArrayNode deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, ArrayNode arraynode)
			throws IOException
		{
			if(jsonparser.isExpectedStartArrayToken())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #45  <Method boolean JsonParser.isExpectedStartArrayToken()>
		//*   2    4:ifeq            18
				return (ArrayNode)updateArray(jsonparser, deserializationcontext, arraynode);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:aload_3         
		//    7   11:invokevirtual   #65  <Method JsonNode updateArray(JsonParser, DeserializationContext, ArrayNode)>
		//    8   14:checkcast       #24  <Class ArrayNode>
		//    9   17:areturn         
			else
				return (ArrayNode)deserializationcontext.handleUnexpectedToken(com/fasterxml/jackson/databind/node/ArrayNode, jsonparser);
		//   10   18:aload_2         
		//   11   19:ldc1            #24  <Class ArrayNode>
		//   12   21:aload_1         
		//   13   22:invokevirtual   #59  <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
		//   14   25:checkcast       #24  <Class ArrayNode>
		//   15   28:areturn         
		}

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #70  <Method ArrayNode deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
			throws IOException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext, (ArrayNode)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:checkcast       #24  <Class ArrayNode>
		//    5    7:invokevirtual   #73  <Method ArrayNode deserialize(JsonParser, DeserializationContext, ArrayNode)>
		//    6   10:areturn         
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
			super(com/fasterxml/jackson/databind/node/ArrayNode, Boolean.valueOf(true));
		//    0    0:aload_0         
		//    1    1:ldc1            #24  <Class ArrayNode>
		//    2    3:iconst_1        
		//    3    4:invokestatic    #30  <Method Boolean Boolean.valueOf(boolean)>
		//    4    7:invokespecial   #33  <Method void BaseNodeDeserializer(Class, Boolean)>
		//    5   10:return          
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
		//   18   35:invokevirtual   #87  <Method JsonNode updateObject(JsonParser, DeserializationContext, ObjectNode)>
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
			super(com/fasterxml/jackson/databind/node/ObjectNode, Boolean.valueOf(true));
		//    0    0:aload_0         
		//    1    1:ldc1            #24  <Class ObjectNode>
		//    2    3:iconst_1        
		//    3    4:invokestatic    #30  <Method Boolean Boolean.valueOf(boolean)>
		//    4    7:invokespecial   #33  <Method void BaseNodeDeserializer(Class, Boolean)>
		//    5   10:return          
		}
	}


	protected JsonNodeDeserializer()
	{
		super(com/fasterxml/jackson/databind/JsonNode, ((Boolean) (null)));
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <Class JsonNode>
	//    2    3:aconst_null     
	//    3    4:invokespecial   #26  <Method void BaseNodeDeserializer(Class, Boolean)>
	//    4    7:return          
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
		int i = jsonparser.getCurrentTokenId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #51  <Method int JsonParser.getCurrentTokenId()>
	//    2    4:istore_3        
		if(i != 1)
	//*   3    5:iload_3         
	//*   4    6:iconst_1        
	//*   5    7:icmpeq          37
		{
			if(i != 3)
	//*   6   10:iload_3         
	//*   7   11:iconst_3        
	//*   8   12:icmpeq          26
				return deserializeAny(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory());
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:aload_2         
	//   13   19:invokevirtual   #57  <Method JsonNodeFactory DeserializationContext.getNodeFactory()>
	//   14   22:invokevirtual   #61  <Method JsonNode deserializeAny(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   15   25:areturn         
			else
				return ((JsonNode) (deserializeArray(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory())));
	//   16   26:aload_0         
	//   17   27:aload_1         
	//   18   28:aload_2         
	//   19   29:aload_2         
	//   20   30:invokevirtual   #57  <Method JsonNodeFactory DeserializationContext.getNodeFactory()>
	//   21   33:invokevirtual   #65  <Method ArrayNode deserializeArray(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   22   36:areturn         
		} else
		{
			return ((JsonNode) (deserializeObject(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory())));
	//   23   37:aload_0         
	//   24   38:aload_1         
	//   25   39:aload_2         
	//   26   40:aload_2         
	//   27   41:invokevirtual   #57  <Method JsonNodeFactory DeserializationContext.getNodeFactory()>
	//   28   44:invokevirtual   #69  <Method ObjectNode deserializeObject(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   29   47:areturn         
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

	public JsonNode getNullValue(DeserializationContext deserializationcontext)
	{
		return ((JsonNode) (NullNode.getInstance()));
	//    0    0:invokestatic    #86  <Method NullNode NullNode.getInstance()>
	//    1    3:areturn         
	}

	public volatile Object getNullValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return ((Object) (getNullValue(deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #91  <Method JsonNode getNullValue(DeserializationContext)>
	//    3    5:areturn         
	}

	public volatile boolean isCachable()
	{
		return super.isCachable();
	//    0    0:aload_0         
	//    1    1:invokespecial   #95  <Method boolean BaseNodeDeserializer.isCachable()>
	//    2    4:ireturn         
	}

	public volatile Boolean supportsUpdate(DeserializationConfig deserializationconfig)
	{
		return super.supportsUpdate(deserializationconfig);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #99  <Method Boolean BaseNodeDeserializer.supportsUpdate(DeserializationConfig)>
	//    3    5:areturn         
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
