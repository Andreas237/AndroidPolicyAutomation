// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.databind.util.RawValue;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer

abstract class BaseNodeDeserializer extends StdDeserializer
{

	public BaseNodeDeserializer(Class class1, Boolean boolean1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void StdDeserializer(Class)>
		_supportsUpdates = boolean1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #14  <Field Boolean _supportsUpdates>
	//    6   10:return          
	}

	protected final JsonNode _fromEmbedded(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
		throws IOException
	{
		jsonparser = ((JsonParser) (jsonparser.getEmbeddedObject()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method Object JsonParser.getEmbeddedObject()>
	//    2    4:astore_1        
		if(jsonparser == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			return ((JsonNode) (jsonnodefactory.nullNode()));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #33  <Method com.fasterxml.jackson.databind.node.NullNode JsonNodeFactory.nullNode()>
	//    7   13:areturn         
		if(((Object) (jsonparser)).getClass() == [B)
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #39  <Method Class Object.getClass()>
	//*  10   18:ldc1            #41  <Class byte[]>
	//*  11   20:if_acmpne       32
			return ((JsonNode) (jsonnodefactory.binaryNode((byte[])jsonparser)));
	//   12   23:aload_3         
	//   13   24:aload_1         
	//   14   25:checkcast       #41  <Class byte[]>
	//   15   28:invokevirtual   #45  <Method com.fasterxml.jackson.databind.node.BinaryNode JsonNodeFactory.binaryNode(byte[])>
	//   16   31:areturn         
		if(jsonparser instanceof RawValue)
	//*  17   32:aload_1         
	//*  18   33:instanceof      #47  <Class RawValue>
	//*  19   36:ifeq            48
			return ((JsonNode) (jsonnodefactory.rawValueNode((RawValue)jsonparser)));
	//   20   39:aload_3         
	//   21   40:aload_1         
	//   22   41:checkcast       #47  <Class RawValue>
	//   23   44:invokevirtual   #51  <Method com.fasterxml.jackson.databind.node.ValueNode JsonNodeFactory.rawValueNode(RawValue)>
	//   24   47:areturn         
		if(jsonparser instanceof JsonNode)
	//*  25   48:aload_1         
	//*  26   49:instanceof      #53  <Class JsonNode>
	//*  27   52:ifeq            60
			return (JsonNode)jsonparser;
	//   28   55:aload_1         
	//   29   56:checkcast       #53  <Class JsonNode>
	//   30   59:areturn         
		else
			return ((JsonNode) (jsonnodefactory.pojoNode(((Object) (jsonparser)))));
	//   31   60:aload_3         
	//   32   61:aload_1         
	//   33   62:invokevirtual   #57  <Method com.fasterxml.jackson.databind.node.ValueNode JsonNodeFactory.pojoNode(Object)>
	//   34   65:areturn         
	}

	protected final JsonNode _fromFloat(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
		throws IOException
	{
		com.fasterxml.jackson.core.JsonParser.NumberType numbertype = jsonparser.getNumberType();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #63  <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
	//    2    4:astore          4
		if(numbertype == com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL)
	//*   3    6:aload           4
	//*   4    8:getstatic       #69  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_DECIMAL>
	//*   5   11:if_acmpne       23
			return ((JsonNode) (jsonnodefactory.numberNode(jsonparser.getDecimalValue())));
	//    6   14:aload_3         
	//    7   15:aload_1         
	//    8   16:invokevirtual   #73  <Method java.math.BigDecimal JsonParser.getDecimalValue()>
	//    9   19:invokevirtual   #77  <Method com.fasterxml.jackson.databind.node.ValueNode JsonNodeFactory.numberNode(java.math.BigDecimal)>
	//   10   22:areturn         
		if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
	//*  11   23:aload_2         
	//*  12   24:getstatic       #83  <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
	//*  13   27:invokevirtual   #89  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  14   30:ifeq            58
			if(jsonparser.isNaN())
	//*  15   33:aload_1         
	//*  16   34:invokevirtual   #93  <Method boolean JsonParser.isNaN()>
	//*  17   37:ifeq            49
				return ((JsonNode) (jsonnodefactory.numberNode(jsonparser.getDoubleValue())));
	//   18   40:aload_3         
	//   19   41:aload_1         
	//   20   42:invokevirtual   #97  <Method double JsonParser.getDoubleValue()>
	//   21   45:invokevirtual   #100 <Method com.fasterxml.jackson.databind.node.NumericNode JsonNodeFactory.numberNode(double)>
	//   22   48:areturn         
			else
				return ((JsonNode) (jsonnodefactory.numberNode(jsonparser.getDecimalValue())));
	//   23   49:aload_3         
	//   24   50:aload_1         
	//   25   51:invokevirtual   #73  <Method java.math.BigDecimal JsonParser.getDecimalValue()>
	//   26   54:invokevirtual   #77  <Method com.fasterxml.jackson.databind.node.ValueNode JsonNodeFactory.numberNode(java.math.BigDecimal)>
	//   27   57:areturn         
		if(numbertype == com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT)
	//*  28   58:aload           4
	//*  29   60:getstatic       #103 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.FLOAT>
	//*  30   63:if_acmpne       75
			return ((JsonNode) (jsonnodefactory.numberNode(jsonparser.getFloatValue())));
	//   31   66:aload_3         
	//   32   67:aload_1         
	//   33   68:invokevirtual   #107 <Method float JsonParser.getFloatValue()>
	//   34   71:invokevirtual   #110 <Method com.fasterxml.jackson.databind.node.NumericNode JsonNodeFactory.numberNode(float)>
	//   35   74:areturn         
		else
			return ((JsonNode) (jsonnodefactory.numberNode(jsonparser.getDoubleValue())));
	//   36   75:aload_3         
	//   37   76:aload_1         
	//   38   77:invokevirtual   #97  <Method double JsonParser.getDoubleValue()>
	//   39   80:invokevirtual   #100 <Method com.fasterxml.jackson.databind.node.NumericNode JsonNodeFactory.numberNode(double)>
	//   40   83:areturn         
	}

	protected final JsonNode _fromInt(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
		throws IOException
	{
		int i = deserializationcontext.getDeserializationFeatures();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #115 <Method int DeserializationContext.getDeserializationFeatures()>
	//    2    4:istore          4
		if((F_MASK_INT_COERCIONS & i) != 0)
	//*   3    6:getstatic       #119 <Field int F_MASK_INT_COERCIONS>
	//*   4    9:iload           4
	//*   5   11:iand            
	//*   6   12:ifeq            59
		{
			if(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(i))
	//*   7   15:getstatic       #122 <Field DeserializationFeature DeserializationFeature.USE_BIG_INTEGER_FOR_INTS>
	//*   8   18:iload           4
	//*   9   20:invokevirtual   #126 <Method boolean DeserializationFeature.enabledIn(int)>
	//*  10   23:ifeq            33
				deserializationcontext = ((DeserializationContext) (com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER));
	//   11   26:getstatic       #129 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_INTEGER>
	//   12   29:astore_2        
			else
	//*  13   30:goto            64
			if(DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(i))
	//*  14   33:getstatic       #132 <Field DeserializationFeature DeserializationFeature.USE_LONG_FOR_INTS>
	//*  15   36:iload           4
	//*  16   38:invokevirtual   #126 <Method boolean DeserializationFeature.enabledIn(int)>
	//*  17   41:ifeq            51
				deserializationcontext = ((DeserializationContext) (com.fasterxml.jackson.core.JsonParser.NumberType.LONG));
	//   18   44:getstatic       #135 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
	//   19   47:astore_2        
			else
	//*  20   48:goto            64
				deserializationcontext = ((DeserializationContext) (jsonparser.getNumberType()));
	//   21   51:aload_1         
	//   22   52:invokevirtual   #63  <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
	//   23   55:astore_2        
		} else
	//*  24   56:goto            64
		{
			deserializationcontext = ((DeserializationContext) (jsonparser.getNumberType()));
	//   25   59:aload_1         
	//   26   60:invokevirtual   #63  <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
	//   27   63:astore_2        
		}
		if(deserializationcontext == com.fasterxml.jackson.core.JsonParser.NumberType.INT)
	//*  28   64:aload_2         
	//*  29   65:getstatic       #138 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
	//*  30   68:if_acmpne       80
			return ((JsonNode) (jsonnodefactory.numberNode(jsonparser.getIntValue())));
	//   31   71:aload_3         
	//   32   72:aload_1         
	//   33   73:invokevirtual   #141 <Method int JsonParser.getIntValue()>
	//   34   76:invokevirtual   #144 <Method com.fasterxml.jackson.databind.node.NumericNode JsonNodeFactory.numberNode(int)>
	//   35   79:areturn         
		if(deserializationcontext == com.fasterxml.jackson.core.JsonParser.NumberType.LONG)
	//*  36   80:aload_2         
	//*  37   81:getstatic       #135 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
	//*  38   84:if_acmpne       96
			return ((JsonNode) (jsonnodefactory.numberNode(jsonparser.getLongValue())));
	//   39   87:aload_3         
	//   40   88:aload_1         
	//   41   89:invokevirtual   #148 <Method long JsonParser.getLongValue()>
	//   42   92:invokevirtual   #151 <Method com.fasterxml.jackson.databind.node.NumericNode JsonNodeFactory.numberNode(long)>
	//   43   95:areturn         
		else
			return ((JsonNode) (jsonnodefactory.numberNode(jsonparser.getBigIntegerValue())));
	//   44   96:aload_3         
	//   45   97:aload_1         
	//   46   98:invokevirtual   #155 <Method java.math.BigInteger JsonParser.getBigIntegerValue()>
	//   47  101:invokevirtual   #158 <Method com.fasterxml.jackson.databind.node.ValueNode JsonNodeFactory.numberNode(java.math.BigInteger)>
	//   48  104:areturn         
	}

	protected void _handleDuplicateField(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory, String s, ObjectNode objectnode, JsonNode jsonnode, JsonNode jsonnode1)
		throws JsonProcessingException
	{
		if(deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY))
	//*   0    0:aload_2         
	//*   1    1:getstatic       #165 <Field DeserializationFeature DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY>
	//*   2    4:invokevirtual   #89  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*   3    7:ifeq            28
			deserializationcontext.reportInputMismatch(com/fasterxml/jackson/databind/JsonNode, "Duplicate field '%s' for ObjectNode: not allowed when FAIL_ON_READING_DUP_TREE_KEY enabled", new Object[] {
				s
			});
	//    4   10:aload_2         
	//    5   11:ldc1            #53  <Class JsonNode>
	//    6   13:ldc1            #167 <String "Duplicate field '%s' for ObjectNode: not allowed when FAIL_ON_READING_DUP_TREE_KEY enabled">
	//    7   15:iconst_1        
	//    8   16:anewarray       Object[]
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:aload           4
	//   12   23:aastore         
	//   13   24:invokevirtual   #171 <Method Object DeserializationContext.reportInputMismatch(Class, String, Object[])>
	//   14   27:pop             
	//   15   28:return          
	}

	protected final JsonNode deserializeAny(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
		throws IOException
	{
		int i = jsonparser.getCurrentTokenId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #175 <Method int JsonParser.getCurrentTokenId()>
	//    2    4:istore          4
		if(i != 2)
	//*   3    6:iload           4
	//*   4    8:iconst_2        
	//*   5    9:icmpeq          131
			switch(i)
	//*   6   12:iload           4
			{
	//*   7   14:tableswitch     5 12: default 60
	//	               5 123
	//	               6 114
	//	               7 106
	//	               8 98
	//	               9 92
	//	               10 86
	//	               11 81
	//	               12 73
			default:
				return (JsonNode)deserializationcontext.handleUnexpectedToken(handledType(), jsonparser);
	//    8   60:aload_2         
	//    9   61:aload_0         
	//   10   62:invokevirtual   #178 <Method Class handledType()>
	//   11   65:aload_1         
	//   12   66:invokevirtual   #182 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   13   69:checkcast       #53  <Class JsonNode>
	//   14   72:areturn         

			case 12: // '\f'
				return _fromEmbedded(jsonparser, deserializationcontext, jsonnodefactory);
	//   15   73:aload_0         
	//   16   74:aload_1         
	//   17   75:aload_2         
	//   18   76:aload_3         
	//   19   77:invokevirtual   #184 <Method JsonNode _fromEmbedded(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   20   80:areturn         

			case 11: // '\013'
				return ((JsonNode) (jsonnodefactory.nullNode()));
	//   21   81:aload_3         
	//   22   82:invokevirtual   #33  <Method com.fasterxml.jackson.databind.node.NullNode JsonNodeFactory.nullNode()>
	//   23   85:areturn         

			case 10: // '\n'
				return ((JsonNode) (jsonnodefactory.booleanNode(false)));
	//   24   86:aload_3         
	//   25   87:iconst_0        
	//   26   88:invokevirtual   #188 <Method com.fasterxml.jackson.databind.node.BooleanNode JsonNodeFactory.booleanNode(boolean)>
	//   27   91:areturn         

			case 9: // '\t'
				return ((JsonNode) (jsonnodefactory.booleanNode(true)));
	//   28   92:aload_3         
	//   29   93:iconst_1        
	//   30   94:invokevirtual   #188 <Method com.fasterxml.jackson.databind.node.BooleanNode JsonNodeFactory.booleanNode(boolean)>
	//   31   97:areturn         

			case 8: // '\b'
				return _fromFloat(jsonparser, deserializationcontext, jsonnodefactory);
	//   32   98:aload_0         
	//   33   99:aload_1         
	//   34  100:aload_2         
	//   35  101:aload_3         
	//   36  102:invokevirtual   #190 <Method JsonNode _fromFloat(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   37  105:areturn         

			case 7: // '\007'
				return _fromInt(jsonparser, deserializationcontext, jsonnodefactory);
	//   38  106:aload_0         
	//   39  107:aload_1         
	//   40  108:aload_2         
	//   41  109:aload_3         
	//   42  110:invokevirtual   #192 <Method JsonNode _fromInt(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   43  113:areturn         

			case 6: // '\006'
				return ((JsonNode) (jsonnodefactory.textNode(jsonparser.getText())));
	//   44  114:aload_3         
	//   45  115:aload_1         
	//   46  116:invokevirtual   #196 <Method String JsonParser.getText()>
	//   47  119:invokevirtual   #200 <Method com.fasterxml.jackson.databind.node.TextNode JsonNodeFactory.textNode(String)>
	//   48  122:areturn         

			case 5: // '\005'
				return ((JsonNode) (deserializeObjectAtName(jsonparser, deserializationcontext, jsonnodefactory)));
	//   49  123:aload_0         
	//   50  124:aload_1         
	//   51  125:aload_2         
	//   52  126:aload_3         
	//   53  127:invokevirtual   #204 <Method ObjectNode deserializeObjectAtName(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   54  130:areturn         
			}
		else
			return ((JsonNode) (jsonnodefactory.objectNode()));
	//   55  131:aload_3         
	//   56  132:invokevirtual   #208 <Method ObjectNode JsonNodeFactory.objectNode()>
	//   57  135:areturn         
	}

	protected final ArrayNode deserializeArray(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
		throws IOException
	{
		ArrayNode arraynode = jsonnodefactory.arrayNode();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #214 <Method ArrayNode JsonNodeFactory.arrayNode()>
	//    2    4:astore          4
		do
			switch(jsonparser.nextToken().id())
	//*   3    6:aload_1         
	//*   4    7:invokevirtual   #218 <Method JsonToken JsonParser.nextToken()>
	//*   5   10:invokevirtual   #223 <Method int JsonToken.id()>
			{
	//*   6   13:tableswitch     1 12: default 76
	//	               1 201
	//	               2 76
	//	               3 185
	//	               4 182
	//	               5 76
	//	               6 165
	//	               7 149
	//	               8 76
	//	               9 135
	//	               10 121
	//	               11 108
	//	               12 92
			case 2: // '\002'
			case 5: // '\005'
			case 8: // '\b'
			default:
				arraynode.add(deserializeAny(jsonparser, deserializationcontext, jsonnodefactory));
	//    7   76:aload           4
	//    8   78:aload_0         
	//    9   79:aload_1         
	//   10   80:aload_2         
	//   11   81:aload_3         
	//   12   82:invokevirtual   #225 <Method JsonNode deserializeAny(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   13   85:invokevirtual   #231 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   14   88:pop             
				break;

	//*  15   89:goto            6
			case 12: // '\f'
				arraynode.add(_fromEmbedded(jsonparser, deserializationcontext, jsonnodefactory));
	//   16   92:aload           4
	//   17   94:aload_0         
	//   18   95:aload_1         
	//   19   96:aload_2         
	//   20   97:aload_3         
	//   21   98:invokevirtual   #184 <Method JsonNode _fromEmbedded(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   22  101:invokevirtual   #231 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   23  104:pop             
				break;

	//*  24  105:goto            6
			case 11: // '\013'
				arraynode.add(((JsonNode) (jsonnodefactory.nullNode())));
	//   25  108:aload           4
	//   26  110:aload_3         
	//   27  111:invokevirtual   #33  <Method com.fasterxml.jackson.databind.node.NullNode JsonNodeFactory.nullNode()>
	//   28  114:invokevirtual   #231 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   29  117:pop             
				break;

	//*  30  118:goto            6
			case 10: // '\n'
				arraynode.add(((JsonNode) (jsonnodefactory.booleanNode(false))));
	//   31  121:aload           4
	//   32  123:aload_3         
	//   33  124:iconst_0        
	//   34  125:invokevirtual   #188 <Method com.fasterxml.jackson.databind.node.BooleanNode JsonNodeFactory.booleanNode(boolean)>
	//   35  128:invokevirtual   #231 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   36  131:pop             
				break;

	//*  37  132:goto            6
			case 9: // '\t'
				arraynode.add(((JsonNode) (jsonnodefactory.booleanNode(true))));
	//   38  135:aload           4
	//   39  137:aload_3         
	//   40  138:iconst_1        
	//   41  139:invokevirtual   #188 <Method com.fasterxml.jackson.databind.node.BooleanNode JsonNodeFactory.booleanNode(boolean)>
	//   42  142:invokevirtual   #231 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   43  145:pop             
				break;

	//*  44  146:goto            6
			case 7: // '\007'
				arraynode.add(_fromInt(jsonparser, deserializationcontext, jsonnodefactory));
	//   45  149:aload           4
	//   46  151:aload_0         
	//   47  152:aload_1         
	//   48  153:aload_2         
	//   49  154:aload_3         
	//   50  155:invokevirtual   #192 <Method JsonNode _fromInt(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   51  158:invokevirtual   #231 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   52  161:pop             
				break;

	//*  53  162:goto            6
			case 6: // '\006'
				arraynode.add(((JsonNode) (jsonnodefactory.textNode(jsonparser.getText()))));
	//   54  165:aload           4
	//   55  167:aload_3         
	//   56  168:aload_1         
	//   57  169:invokevirtual   #196 <Method String JsonParser.getText()>
	//   58  172:invokevirtual   #200 <Method com.fasterxml.jackson.databind.node.TextNode JsonNodeFactory.textNode(String)>
	//   59  175:invokevirtual   #231 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   60  178:pop             
				break;

	//*  61  179:goto            6
			case 4: // '\004'
				return arraynode;
	//   62  182:aload           4
	//   63  184:areturn         

			case 3: // '\003'
				arraynode.add(((JsonNode) (deserializeArray(jsonparser, deserializationcontext, jsonnodefactory))));
	//   64  185:aload           4
	//   65  187:aload_0         
	//   66  188:aload_1         
	//   67  189:aload_2         
	//   68  190:aload_3         
	//   69  191:invokevirtual   #233 <Method ArrayNode deserializeArray(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   70  194:invokevirtual   #231 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   71  197:pop             
				break;

	//*  72  198:goto            6
			case 1: // '\001'
				arraynode.add(((JsonNode) (deserializeObject(jsonparser, deserializationcontext, jsonnodefactory))));
	//   73  201:aload           4
	//   74  203:aload_0         
	//   75  204:aload_1         
	//   76  205:aload_2         
	//   77  206:aload_3         
	//   78  207:invokevirtual   #236 <Method ObjectNode deserializeObject(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   79  210:invokevirtual   #231 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   80  213:pop             
				break;
			}
		while(true);
	//*  81  214:goto            6
	}

	protected final ObjectNode deserializeObject(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
		throws IOException
	{
		ObjectNode objectnode = jsonnodefactory.objectNode();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #208 <Method ObjectNode JsonNodeFactory.objectNode()>
	//    2    4:astore          7
		for(String s = jsonparser.nextFieldName(); s != null; s = jsonparser.nextFieldName())
	//*   3    6:aload_1         
	//*   4    7:invokevirtual   #239 <Method String JsonParser.nextFieldName()>
	//*   5   10:astore          5
	//*   6   12:aload           5
	//*   7   14:ifnull          243
		{
			Object obj1 = ((Object) (jsonparser.nextToken()));
	//    8   17:aload_1         
	//    9   18:invokevirtual   #218 <Method JsonToken JsonParser.nextToken()>
	//   10   21:astore          6
			Object obj = obj1;
	//   11   23:aload           6
	//   12   25:astore          4
			if(obj1 == null)
	//*  13   27:aload           6
	//*  14   29:ifnonnull       37
				obj = ((Object) (JsonToken.NOT_AVAILABLE));
	//   15   32:getstatic       #243 <Field JsonToken JsonToken.NOT_AVAILABLE>
	//   16   35:astore          4
			switch(((JsonToken) (obj)).id())
	//*  17   37:aload           4
	//*  18   39:invokevirtual   #223 <Method int JsonToken.id()>
			{
	//*  19   42:tableswitch     1 12: default 104
	//	               1 194
	//	               2 104
	//	               3 182
	//	               4 104
	//	               5 104
	//	               6 169
	//	               7 157
	//	               8 104
	//	               9 147
	//	               10 137
	//	               11 128
	//	               12 116
			case 2: // '\002'
			case 4: // '\004'
			case 5: // '\005'
			case 8: // '\b'
			default:
				obj = ((Object) (deserializeAny(jsonparser, deserializationcontext, jsonnodefactory)));
	//   20  104:aload_0         
	//   21  105:aload_1         
	//   22  106:aload_2         
	//   23  107:aload_3         
	//   24  108:invokevirtual   #225 <Method JsonNode deserializeAny(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   25  111:astore          4
				break;

	//*  26  113:goto            203
			case 12: // '\f'
				obj = ((Object) (_fromEmbedded(jsonparser, deserializationcontext, jsonnodefactory)));
	//   27  116:aload_0         
	//   28  117:aload_1         
	//   29  118:aload_2         
	//   30  119:aload_3         
	//   31  120:invokevirtual   #184 <Method JsonNode _fromEmbedded(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   32  123:astore          4
				break;

	//*  33  125:goto            203
			case 11: // '\013'
				obj = ((Object) (jsonnodefactory.nullNode()));
	//   34  128:aload_3         
	//   35  129:invokevirtual   #33  <Method com.fasterxml.jackson.databind.node.NullNode JsonNodeFactory.nullNode()>
	//   36  132:astore          4
				break;

	//*  37  134:goto            203
			case 10: // '\n'
				obj = ((Object) (jsonnodefactory.booleanNode(false)));
	//   38  137:aload_3         
	//   39  138:iconst_0        
	//   40  139:invokevirtual   #188 <Method com.fasterxml.jackson.databind.node.BooleanNode JsonNodeFactory.booleanNode(boolean)>
	//   41  142:astore          4
				break;

	//*  42  144:goto            203
			case 9: // '\t'
				obj = ((Object) (jsonnodefactory.booleanNode(true)));
	//   43  147:aload_3         
	//   44  148:iconst_1        
	//   45  149:invokevirtual   #188 <Method com.fasterxml.jackson.databind.node.BooleanNode JsonNodeFactory.booleanNode(boolean)>
	//   46  152:astore          4
				break;

	//*  47  154:goto            203
			case 7: // '\007'
				obj = ((Object) (_fromInt(jsonparser, deserializationcontext, jsonnodefactory)));
	//   48  157:aload_0         
	//   49  158:aload_1         
	//   50  159:aload_2         
	//   51  160:aload_3         
	//   52  161:invokevirtual   #192 <Method JsonNode _fromInt(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   53  164:astore          4
				break;

	//*  54  166:goto            203
			case 6: // '\006'
				obj = ((Object) (jsonnodefactory.textNode(jsonparser.getText())));
	//   55  169:aload_3         
	//   56  170:aload_1         
	//   57  171:invokevirtual   #196 <Method String JsonParser.getText()>
	//   58  174:invokevirtual   #200 <Method com.fasterxml.jackson.databind.node.TextNode JsonNodeFactory.textNode(String)>
	//   59  177:astore          4
				break;

	//*  60  179:goto            203
			case 3: // '\003'
				obj = ((Object) (deserializeArray(jsonparser, deserializationcontext, jsonnodefactory)));
	//   61  182:aload_0         
	//   62  183:aload_1         
	//   63  184:aload_2         
	//   64  185:aload_3         
	//   65  186:invokevirtual   #233 <Method ArrayNode deserializeArray(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   66  189:astore          4
				break;

	//*  67  191:goto            203
			case 1: // '\001'
				obj = ((Object) (deserializeObject(jsonparser, deserializationcontext, jsonnodefactory)));
	//   68  194:aload_0         
	//   69  195:aload_1         
	//   70  196:aload_2         
	//   71  197:aload_3         
	//   72  198:invokevirtual   #236 <Method ObjectNode deserializeObject(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   73  201:astore          4
				break;
			}
			obj1 = ((Object) (objectnode.replace(s, ((JsonNode) (obj)))));
	//   74  203:aload           7
	//   75  205:aload           5
	//   76  207:aload           4
	//   77  209:invokevirtual   #249 <Method JsonNode ObjectNode.replace(String, JsonNode)>
	//   78  212:astore          6
			if(obj1 != null)
	//*  79  214:aload           6
	//*  80  216:ifnull          234
				_handleDuplicateField(jsonparser, deserializationcontext, jsonnodefactory, s, objectnode, ((JsonNode) (obj1)), ((JsonNode) (obj)));
	//   81  219:aload_0         
	//   82  220:aload_1         
	//   83  221:aload_2         
	//   84  222:aload_3         
	//   85  223:aload           5
	//   86  225:aload           7
	//   87  227:aload           6
	//   88  229:aload           4
	//   89  231:invokevirtual   #251 <Method void _handleDuplicateField(JsonParser, DeserializationContext, JsonNodeFactory, String, ObjectNode, JsonNode, JsonNode)>
		}

	//   90  234:aload_1         
	//   91  235:invokevirtual   #239 <Method String JsonParser.nextFieldName()>
	//   92  238:astore          5
	//*  93  240:goto            12
		return objectnode;
	//   94  243:aload           7
	//   95  245:areturn         
	}

	protected final ObjectNode deserializeObjectAtName(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
		throws IOException
	{
		ObjectNode objectnode = jsonnodefactory.objectNode();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #208 <Method ObjectNode JsonNodeFactory.objectNode()>
	//    2    4:astore          7
		for(String s = jsonparser.getCurrentName(); s != null; s = jsonparser.nextFieldName())
	//*   3    6:aload_1         
	//*   4    7:invokevirtual   #254 <Method String JsonParser.getCurrentName()>
	//*   5   10:astore          5
	//*   6   12:aload           5
	//*   7   14:ifnull          243
		{
			Object obj1 = ((Object) (jsonparser.nextToken()));
	//    8   17:aload_1         
	//    9   18:invokevirtual   #218 <Method JsonToken JsonParser.nextToken()>
	//   10   21:astore          6
			Object obj = obj1;
	//   11   23:aload           6
	//   12   25:astore          4
			if(obj1 == null)
	//*  13   27:aload           6
	//*  14   29:ifnonnull       37
				obj = ((Object) (JsonToken.NOT_AVAILABLE));
	//   15   32:getstatic       #243 <Field JsonToken JsonToken.NOT_AVAILABLE>
	//   16   35:astore          4
			switch(((JsonToken) (obj)).id())
	//*  17   37:aload           4
	//*  18   39:invokevirtual   #223 <Method int JsonToken.id()>
			{
	//*  19   42:tableswitch     1 12: default 104
	//	               1 194
	//	               2 104
	//	               3 182
	//	               4 104
	//	               5 104
	//	               6 169
	//	               7 157
	//	               8 104
	//	               9 147
	//	               10 137
	//	               11 128
	//	               12 116
			case 2: // '\002'
			case 4: // '\004'
			case 5: // '\005'
			case 8: // '\b'
			default:
				obj = ((Object) (deserializeAny(jsonparser, deserializationcontext, jsonnodefactory)));
	//   20  104:aload_0         
	//   21  105:aload_1         
	//   22  106:aload_2         
	//   23  107:aload_3         
	//   24  108:invokevirtual   #225 <Method JsonNode deserializeAny(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   25  111:astore          4
				break;

	//*  26  113:goto            203
			case 12: // '\f'
				obj = ((Object) (_fromEmbedded(jsonparser, deserializationcontext, jsonnodefactory)));
	//   27  116:aload_0         
	//   28  117:aload_1         
	//   29  118:aload_2         
	//   30  119:aload_3         
	//   31  120:invokevirtual   #184 <Method JsonNode _fromEmbedded(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   32  123:astore          4
				break;

	//*  33  125:goto            203
			case 11: // '\013'
				obj = ((Object) (jsonnodefactory.nullNode()));
	//   34  128:aload_3         
	//   35  129:invokevirtual   #33  <Method com.fasterxml.jackson.databind.node.NullNode JsonNodeFactory.nullNode()>
	//   36  132:astore          4
				break;

	//*  37  134:goto            203
			case 10: // '\n'
				obj = ((Object) (jsonnodefactory.booleanNode(false)));
	//   38  137:aload_3         
	//   39  138:iconst_0        
	//   40  139:invokevirtual   #188 <Method com.fasterxml.jackson.databind.node.BooleanNode JsonNodeFactory.booleanNode(boolean)>
	//   41  142:astore          4
				break;

	//*  42  144:goto            203
			case 9: // '\t'
				obj = ((Object) (jsonnodefactory.booleanNode(true)));
	//   43  147:aload_3         
	//   44  148:iconst_1        
	//   45  149:invokevirtual   #188 <Method com.fasterxml.jackson.databind.node.BooleanNode JsonNodeFactory.booleanNode(boolean)>
	//   46  152:astore          4
				break;

	//*  47  154:goto            203
			case 7: // '\007'
				obj = ((Object) (_fromInt(jsonparser, deserializationcontext, jsonnodefactory)));
	//   48  157:aload_0         
	//   49  158:aload_1         
	//   50  159:aload_2         
	//   51  160:aload_3         
	//   52  161:invokevirtual   #192 <Method JsonNode _fromInt(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   53  164:astore          4
				break;

	//*  54  166:goto            203
			case 6: // '\006'
				obj = ((Object) (jsonnodefactory.textNode(jsonparser.getText())));
	//   55  169:aload_3         
	//   56  170:aload_1         
	//   57  171:invokevirtual   #196 <Method String JsonParser.getText()>
	//   58  174:invokevirtual   #200 <Method com.fasterxml.jackson.databind.node.TextNode JsonNodeFactory.textNode(String)>
	//   59  177:astore          4
				break;

	//*  60  179:goto            203
			case 3: // '\003'
				obj = ((Object) (deserializeArray(jsonparser, deserializationcontext, jsonnodefactory)));
	//   61  182:aload_0         
	//   62  183:aload_1         
	//   63  184:aload_2         
	//   64  185:aload_3         
	//   65  186:invokevirtual   #233 <Method ArrayNode deserializeArray(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   66  189:astore          4
				break;

	//*  67  191:goto            203
			case 1: // '\001'
				obj = ((Object) (deserializeObject(jsonparser, deserializationcontext, jsonnodefactory)));
	//   68  194:aload_0         
	//   69  195:aload_1         
	//   70  196:aload_2         
	//   71  197:aload_3         
	//   72  198:invokevirtual   #236 <Method ObjectNode deserializeObject(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   73  201:astore          4
				break;
			}
			obj1 = ((Object) (objectnode.replace(s, ((JsonNode) (obj)))));
	//   74  203:aload           7
	//   75  205:aload           5
	//   76  207:aload           4
	//   77  209:invokevirtual   #249 <Method JsonNode ObjectNode.replace(String, JsonNode)>
	//   78  212:astore          6
			if(obj1 != null)
	//*  79  214:aload           6
	//*  80  216:ifnull          234
				_handleDuplicateField(jsonparser, deserializationcontext, jsonnodefactory, s, objectnode, ((JsonNode) (obj1)), ((JsonNode) (obj)));
	//   81  219:aload_0         
	//   82  220:aload_1         
	//   83  221:aload_2         
	//   84  222:aload_3         
	//   85  223:aload           5
	//   86  225:aload           7
	//   87  227:aload           6
	//   88  229:aload           4
	//   89  231:invokevirtual   #251 <Method void _handleDuplicateField(JsonParser, DeserializationContext, JsonNodeFactory, String, ObjectNode, JsonNode, JsonNode)>
		}

	//   90  234:aload_1         
	//   91  235:invokevirtual   #239 <Method String JsonParser.nextFieldName()>
	//   92  238:astore          5
	//*  93  240:goto            12
		return objectnode;
	//   94  243:aload           7
	//   95  245:areturn         
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #262 <Method Object TypeDeserializer.deserializeTypedFromAny(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public boolean isCachable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public Boolean supportsUpdate(DeserializationConfig deserializationconfig)
	{
		return _supportsUpdates;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Boolean _supportsUpdates>
	//    2    4:areturn         
	}

	protected final JsonNode updateArray(JsonParser jsonparser, DeserializationContext deserializationcontext, ArrayNode arraynode)
		throws IOException
	{
		JsonNodeFactory jsonnodefactory = deserializationcontext.getNodeFactory();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #271 <Method JsonNodeFactory DeserializationContext.getNodeFactory()>
	//    2    4:astore          4
		do
			switch(jsonparser.nextToken().id())
	//*   3    6:aload_1         
	//*   4    7:invokevirtual   #218 <Method JsonToken JsonParser.nextToken()>
	//*   5   10:invokevirtual   #223 <Method int JsonToken.id()>
			{
	//*   6   13:tableswitch     1 12: default 76
	//	               1 200
	//	               2 76
	//	               3 184
	//	               4 182
	//	               5 76
	//	               6 165
	//	               7 149
	//	               8 76
	//	               9 135
	//	               10 121
	//	               11 108
	//	               12 92
			case 2: // '\002'
			case 5: // '\005'
			case 8: // '\b'
			default:
				arraynode.add(deserializeAny(jsonparser, deserializationcontext, jsonnodefactory));
	//    7   76:aload_3         
	//    8   77:aload_0         
	//    9   78:aload_1         
	//   10   79:aload_2         
	//   11   80:aload           4
	//   12   82:invokevirtual   #225 <Method JsonNode deserializeAny(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   13   85:invokevirtual   #231 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   14   88:pop             
				break;

	//*  15   89:goto            6
			case 12: // '\f'
				arraynode.add(_fromEmbedded(jsonparser, deserializationcontext, jsonnodefactory));
	//   16   92:aload_3         
	//   17   93:aload_0         
	//   18   94:aload_1         
	//   19   95:aload_2         
	//   20   96:aload           4
	//   21   98:invokevirtual   #184 <Method JsonNode _fromEmbedded(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   22  101:invokevirtual   #231 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   23  104:pop             
				break;

	//*  24  105:goto            6
			case 11: // '\013'
				arraynode.add(((JsonNode) (jsonnodefactory.nullNode())));
	//   25  108:aload_3         
	//   26  109:aload           4
	//   27  111:invokevirtual   #33  <Method com.fasterxml.jackson.databind.node.NullNode JsonNodeFactory.nullNode()>
	//   28  114:invokevirtual   #231 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   29  117:pop             
				break;

	//*  30  118:goto            6
			case 10: // '\n'
				arraynode.add(((JsonNode) (jsonnodefactory.booleanNode(false))));
	//   31  121:aload_3         
	//   32  122:aload           4
	//   33  124:iconst_0        
	//   34  125:invokevirtual   #188 <Method com.fasterxml.jackson.databind.node.BooleanNode JsonNodeFactory.booleanNode(boolean)>
	//   35  128:invokevirtual   #231 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   36  131:pop             
				break;

	//*  37  132:goto            6
			case 9: // '\t'
				arraynode.add(((JsonNode) (jsonnodefactory.booleanNode(true))));
	//   38  135:aload_3         
	//   39  136:aload           4
	//   40  138:iconst_1        
	//   41  139:invokevirtual   #188 <Method com.fasterxml.jackson.databind.node.BooleanNode JsonNodeFactory.booleanNode(boolean)>
	//   42  142:invokevirtual   #231 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   43  145:pop             
				break;

	//*  44  146:goto            6
			case 7: // '\007'
				arraynode.add(_fromInt(jsonparser, deserializationcontext, jsonnodefactory));
	//   45  149:aload_3         
	//   46  150:aload_0         
	//   47  151:aload_1         
	//   48  152:aload_2         
	//   49  153:aload           4
	//   50  155:invokevirtual   #192 <Method JsonNode _fromInt(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   51  158:invokevirtual   #231 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   52  161:pop             
				break;

	//*  53  162:goto            6
			case 6: // '\006'
				arraynode.add(((JsonNode) (jsonnodefactory.textNode(jsonparser.getText()))));
	//   54  165:aload_3         
	//   55  166:aload           4
	//   56  168:aload_1         
	//   57  169:invokevirtual   #196 <Method String JsonParser.getText()>
	//   58  172:invokevirtual   #200 <Method com.fasterxml.jackson.databind.node.TextNode JsonNodeFactory.textNode(String)>
	//   59  175:invokevirtual   #231 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   60  178:pop             
				break;

	//*  61  179:goto            6
			case 4: // '\004'
				return ((JsonNode) (arraynode));
	//   62  182:aload_3         
	//   63  183:areturn         

			case 3: // '\003'
				arraynode.add(((JsonNode) (deserializeArray(jsonparser, deserializationcontext, jsonnodefactory))));
	//   64  184:aload_3         
	//   65  185:aload_0         
	//   66  186:aload_1         
	//   67  187:aload_2         
	//   68  188:aload           4
	//   69  190:invokevirtual   #233 <Method ArrayNode deserializeArray(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   70  193:invokevirtual   #231 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   71  196:pop             
				break;

	//*  72  197:goto            6
			case 1: // '\001'
				arraynode.add(((JsonNode) (deserializeObject(jsonparser, deserializationcontext, jsonnodefactory))));
	//   73  200:aload_3         
	//   74  201:aload_0         
	//   75  202:aload_1         
	//   76  203:aload_2         
	//   77  204:aload           4
	//   78  206:invokevirtual   #236 <Method ObjectNode deserializeObject(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   79  209:invokevirtual   #231 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   80  212:pop             
				break;
			}
		while(true);
	//*  81  213:goto            6
	}

	protected final JsonNode updateObject(JsonParser jsonparser, DeserializationContext deserializationcontext, ObjectNode objectnode)
		throws IOException
	{
		String s;
		if(jsonparser.isExpectedStartObjectToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #276 <Method boolean JsonParser.isExpectedStartObjectToken()>
	//*   2    4:ifeq            16
		{
			s = jsonparser.nextFieldName();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #239 <Method String JsonParser.nextFieldName()>
	//    5   11:astore          5
		} else
	//*   6   13:goto            42
		{
			if(!jsonparser.hasToken(JsonToken.FIELD_NAME))
	//*   7   16:aload_1         
	//*   8   17:getstatic       #279 <Field JsonToken JsonToken.FIELD_NAME>
	//*   9   20:invokevirtual   #283 <Method boolean JsonParser.hasToken(JsonToken)>
	//*  10   23:ifne            36
				return (JsonNode)deserialize(jsonparser, deserializationcontext);
	//   11   26:aload_0         
	//   12   27:aload_1         
	//   13   28:aload_2         
	//   14   29:invokevirtual   #286 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   15   32:checkcast       #53  <Class JsonNode>
	//   16   35:areturn         
			s = jsonparser.getCurrentName();
	//   17   36:aload_1         
	//   18   37:invokevirtual   #254 <Method String JsonParser.getCurrentName()>
	//   19   40:astore          5
		}
		for(; s != null; s = jsonparser.nextFieldName())
	//*  20   42:aload           5
	//*  21   44:ifnull          378
		{
			Object obj1 = ((Object) (jsonparser.nextToken()));
	//   22   47:aload_1         
	//   23   48:invokevirtual   #218 <Method JsonToken JsonParser.nextToken()>
	//   24   51:astore          6
			JsonNode jsonnode2 = objectnode.get(s);
	//   25   53:aload_3         
	//   26   54:aload           5
	//   27   56:invokevirtual   #290 <Method JsonNode ObjectNode.get(String)>
	//   28   59:astore          7
			if(jsonnode2 != null)
	//*  29   61:aload           7
	//*  30   63:ifnull          146
			{
				if(jsonnode2 instanceof ObjectNode)
	//*  31   66:aload           7
	//*  32   68:instanceof      #245 <Class ObjectNode>
	//*  33   71:ifeq            106
				{
					JsonNode jsonnode = updateObject(jsonparser, deserializationcontext, (ObjectNode)jsonnode2);
	//   34   74:aload_0         
	//   35   75:aload_1         
	//   36   76:aload_2         
	//   37   77:aload           7
	//   38   79:checkcast       #245 <Class ObjectNode>
	//   39   82:invokevirtual   #292 <Method JsonNode updateObject(JsonParser, DeserializationContext, ObjectNode)>
	//   40   85:astore          4
					if(jsonnode != jsonnode2)
	//*  41   87:aload           4
	//*  42   89:aload           7
	//*  43   91:if_acmpeq       369
						objectnode.set(s, jsonnode);
	//   44   94:aload_3         
	//   45   95:aload           5
	//   46   97:aload           4
	//   47   99:invokevirtual   #295 <Method JsonNode ObjectNode.set(String, JsonNode)>
	//   48  102:pop             
					continue;
	//   49  103:goto            369
				}
				if(jsonnode2 instanceof ArrayNode)
	//*  50  106:aload           7
	//*  51  108:instanceof      #227 <Class ArrayNode>
	//*  52  111:ifeq            146
				{
					JsonNode jsonnode1 = updateArray(jsonparser, deserializationcontext, (ArrayNode)jsonnode2);
	//   53  114:aload_0         
	//   54  115:aload_1         
	//   55  116:aload_2         
	//   56  117:aload           7
	//   57  119:checkcast       #227 <Class ArrayNode>
	//   58  122:invokevirtual   #297 <Method JsonNode updateArray(JsonParser, DeserializationContext, ArrayNode)>
	//   59  125:astore          4
					if(jsonnode1 != jsonnode2)
	//*  60  127:aload           4
	//*  61  129:aload           7
	//*  62  131:if_acmpeq       369
						objectnode.set(s, jsonnode1);
	//   63  134:aload_3         
	//   64  135:aload           5
	//   65  137:aload           4
	//   66  139:invokevirtual   #295 <Method JsonNode ObjectNode.set(String, JsonNode)>
	//   67  142:pop             
					continue;
	//   68  143:goto            369
				}
			}
			Object obj = obj1;
	//   69  146:aload           6
	//   70  148:astore          4
			if(obj1 == null)
	//*  71  150:aload           6
	//*  72  152:ifnonnull       160
				obj = ((Object) (JsonToken.NOT_AVAILABLE));
	//   73  155:getstatic       #243 <Field JsonToken JsonToken.NOT_AVAILABLE>
	//   74  158:astore          4
			obj1 = ((Object) (deserializationcontext.getNodeFactory()));
	//   75  160:aload_2         
	//   76  161:invokevirtual   #271 <Method JsonNodeFactory DeserializationContext.getNodeFactory()>
	//   77  164:astore          6
			switch(((JsonToken) (obj)).id())
	//*  78  166:aload           4
	//*  79  168:invokevirtual   #223 <Method int JsonToken.id()>
			{
	//*  80  171:tableswitch     1 12: default 232
	//	               1 330
	//	               2 232
	//	               3 317
	//	               4 232
	//	               5 232
	//	               6 303
	//	               7 290
	//	               8 232
	//	               9 279
	//	               10 268
	//	               11 258
	//	               12 245
			case 2: // '\002'
			case 4: // '\004'
			case 5: // '\005'
			case 8: // '\b'
			default:
				obj = ((Object) (deserializeAny(jsonparser, deserializationcontext, ((JsonNodeFactory) (obj1)))));
	//   81  232:aload_0         
	//   82  233:aload_1         
	//   83  234:aload_2         
	//   84  235:aload           6
	//   85  237:invokevirtual   #225 <Method JsonNode deserializeAny(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   86  240:astore          4
				break;

	//*  87  242:goto            340
			case 12: // '\f'
				obj = ((Object) (_fromEmbedded(jsonparser, deserializationcontext, ((JsonNodeFactory) (obj1)))));
	//   88  245:aload_0         
	//   89  246:aload_1         
	//   90  247:aload_2         
	//   91  248:aload           6
	//   92  250:invokevirtual   #184 <Method JsonNode _fromEmbedded(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   93  253:astore          4
				break;

	//*  94  255:goto            340
			case 11: // '\013'
				obj = ((Object) (((JsonNodeFactory) (obj1)).nullNode()));
	//   95  258:aload           6
	//   96  260:invokevirtual   #33  <Method com.fasterxml.jackson.databind.node.NullNode JsonNodeFactory.nullNode()>
	//   97  263:astore          4
				break;

	//*  98  265:goto            340
			case 10: // '\n'
				obj = ((Object) (((JsonNodeFactory) (obj1)).booleanNode(false)));
	//   99  268:aload           6
	//  100  270:iconst_0        
	//  101  271:invokevirtual   #188 <Method com.fasterxml.jackson.databind.node.BooleanNode JsonNodeFactory.booleanNode(boolean)>
	//  102  274:astore          4
				break;

	//* 103  276:goto            340
			case 9: // '\t'
				obj = ((Object) (((JsonNodeFactory) (obj1)).booleanNode(true)));
	//  104  279:aload           6
	//  105  281:iconst_1        
	//  106  282:invokevirtual   #188 <Method com.fasterxml.jackson.databind.node.BooleanNode JsonNodeFactory.booleanNode(boolean)>
	//  107  285:astore          4
				break;

	//* 108  287:goto            340
			case 7: // '\007'
				obj = ((Object) (_fromInt(jsonparser, deserializationcontext, ((JsonNodeFactory) (obj1)))));
	//  109  290:aload_0         
	//  110  291:aload_1         
	//  111  292:aload_2         
	//  112  293:aload           6
	//  113  295:invokevirtual   #192 <Method JsonNode _fromInt(JsonParser, DeserializationContext, JsonNodeFactory)>
	//  114  298:astore          4
				break;

	//* 115  300:goto            340
			case 6: // '\006'
				obj = ((Object) (((JsonNodeFactory) (obj1)).textNode(jsonparser.getText())));
	//  116  303:aload           6
	//  117  305:aload_1         
	//  118  306:invokevirtual   #196 <Method String JsonParser.getText()>
	//  119  309:invokevirtual   #200 <Method com.fasterxml.jackson.databind.node.TextNode JsonNodeFactory.textNode(String)>
	//  120  312:astore          4
				break;

	//* 121  314:goto            340
			case 3: // '\003'
				obj = ((Object) (deserializeArray(jsonparser, deserializationcontext, ((JsonNodeFactory) (obj1)))));
	//  122  317:aload_0         
	//  123  318:aload_1         
	//  124  319:aload_2         
	//  125  320:aload           6
	//  126  322:invokevirtual   #233 <Method ArrayNode deserializeArray(JsonParser, DeserializationContext, JsonNodeFactory)>
	//  127  325:astore          4
				break;

	//* 128  327:goto            340
			case 1: // '\001'
				obj = ((Object) (deserializeObject(jsonparser, deserializationcontext, ((JsonNodeFactory) (obj1)))));
	//  129  330:aload_0         
	//  130  331:aload_1         
	//  131  332:aload_2         
	//  132  333:aload           6
	//  133  335:invokevirtual   #236 <Method ObjectNode deserializeObject(JsonParser, DeserializationContext, JsonNodeFactory)>
	//  134  338:astore          4
				break;
			}
			if(jsonnode2 != null)
	//* 135  340:aload           7
	//* 136  342:ifnull          360
				_handleDuplicateField(jsonparser, deserializationcontext, ((JsonNodeFactory) (obj1)), s, objectnode, jsonnode2, ((JsonNode) (obj)));
	//  137  345:aload_0         
	//  138  346:aload_1         
	//  139  347:aload_2         
	//  140  348:aload           6
	//  141  350:aload           5
	//  142  352:aload_3         
	//  143  353:aload           7
	//  144  355:aload           4
	//  145  357:invokevirtual   #251 <Method void _handleDuplicateField(JsonParser, DeserializationContext, JsonNodeFactory, String, ObjectNode, JsonNode, JsonNode)>
			objectnode.set(s, ((JsonNode) (obj)));
	//  146  360:aload_3         
	//  147  361:aload           5
	//  148  363:aload           4
	//  149  365:invokevirtual   #295 <Method JsonNode ObjectNode.set(String, JsonNode)>
	//  150  368:pop             
		}

	//  151  369:aload_1         
	//  152  370:invokevirtual   #239 <Method String JsonParser.nextFieldName()>
	//  153  373:astore          5
	//* 154  375:goto            42
		return ((JsonNode) (objectnode));
	//  155  378:aload_3         
	//  156  379:areturn         
	}

	protected final Boolean _supportsUpdates;
}
