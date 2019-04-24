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

	public BaseNodeDeserializer(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void StdDeserializer(Class)>
	//    3    5:return          
	}

	protected final JsonNode _fromEmbedded(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
		throws IOException
	{
		jsonparser = ((JsonParser) (jsonparser.getEmbeddedObject()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method Object JsonParser.getEmbeddedObject()>
	//    2    4:astore_1        
		if(jsonparser == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			return ((JsonNode) (jsonnodefactory.nullNode()));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #28  <Method com.fasterxml.jackson.databind.node.NullNode JsonNodeFactory.nullNode()>
	//    7   13:areturn         
		if(((Object) (jsonparser)).getClass() == [B)
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #34  <Method Class Object.getClass()>
	//*  10   18:ldc1            #36  <Class byte[]>
	//*  11   20:if_acmpne       35
			return ((JsonNode) (jsonnodefactory.binaryNode((byte[])(byte[])jsonparser)));
	//   12   23:aload_3         
	//   13   24:aload_1         
	//   14   25:checkcast       #36  <Class byte[]>
	//   15   28:checkcast       #36  <Class byte[]>
	//   16   31:invokevirtual   #40  <Method com.fasterxml.jackson.databind.node.BinaryNode JsonNodeFactory.binaryNode(byte[])>
	//   17   34:areturn         
		if(jsonparser instanceof RawValue)
	//*  18   35:aload_1         
	//*  19   36:instanceof      #42  <Class RawValue>
	//*  20   39:ifeq            51
			return ((JsonNode) (jsonnodefactory.rawValueNode((RawValue)jsonparser)));
	//   21   42:aload_3         
	//   22   43:aload_1         
	//   23   44:checkcast       #42  <Class RawValue>
	//   24   47:invokevirtual   #46  <Method com.fasterxml.jackson.databind.node.ValueNode JsonNodeFactory.rawValueNode(RawValue)>
	//   25   50:areturn         
		if(jsonparser instanceof JsonNode)
	//*  26   51:aload_1         
	//*  27   52:instanceof      #48  <Class JsonNode>
	//*  28   55:ifeq            63
			return (JsonNode)jsonparser;
	//   29   58:aload_1         
	//   30   59:checkcast       #48  <Class JsonNode>
	//   31   62:areturn         
		else
			return ((JsonNode) (jsonnodefactory.pojoNode(((Object) (jsonparser)))));
	//   32   63:aload_3         
	//   33   64:aload_1         
	//   34   65:invokevirtual   #52  <Method com.fasterxml.jackson.databind.node.ValueNode JsonNodeFactory.pojoNode(Object)>
	//   35   68:areturn         
	}

	protected final JsonNode _fromFloat(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
		throws IOException
	{
		if(jsonparser.getNumberType() == com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL || deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #58  <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
	//*   2    4:getstatic       #64  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_DECIMAL>
	//*   3    7:if_acmpeq       20
	//*   4   10:aload_2         
	//*   5   11:getstatic       #70  <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
	//*   6   14:invokevirtual   #76  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*   7   17:ifeq            29
			return ((JsonNode) (jsonnodefactory.numberNode(jsonparser.getDecimalValue())));
	//    8   20:aload_3         
	//    9   21:aload_1         
	//   10   22:invokevirtual   #80  <Method java.math.BigDecimal JsonParser.getDecimalValue()>
	//   11   25:invokevirtual   #84  <Method com.fasterxml.jackson.databind.node.NumericNode JsonNodeFactory.numberNode(java.math.BigDecimal)>
	//   12   28:areturn         
		else
			return ((JsonNode) (jsonnodefactory.numberNode(jsonparser.getDoubleValue())));
	//   13   29:aload_3         
	//   14   30:aload_1         
	//   15   31:invokevirtual   #88  <Method double JsonParser.getDoubleValue()>
	//   16   34:invokevirtual   #91  <Method com.fasterxml.jackson.databind.node.NumericNode JsonNodeFactory.numberNode(double)>
	//   17   37:areturn         
	}

	protected final JsonNode _fromInt(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
		throws IOException
	{
		int i = deserializationcontext.getDeserializationFeatures();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #96  <Method int DeserializationContext.getDeserializationFeatures()>
	//    2    4:istore          4
		if((F_MASK_INT_COERCIONS & i) != 0)
	//*   3    6:getstatic       #100 <Field int F_MASK_INT_COERCIONS>
	//*   4    9:iload           4
	//*   5   11:iand            
	//*   6   12:ifeq            72
		{
			if(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(i))
	//*   7   15:getstatic       #103 <Field DeserializationFeature DeserializationFeature.USE_BIG_INTEGER_FOR_INTS>
	//*   8   18:iload           4
	//*   9   20:invokevirtual   #107 <Method boolean DeserializationFeature.enabledIn(int)>
	//*  10   23:ifeq            46
				deserializationcontext = ((DeserializationContext) (com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER));
	//   11   26:getstatic       #110 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_INTEGER>
	//   12   29:astore_2        
			else
	//*  13   30:aload_2         
	//*  14   31:getstatic       #113 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
	//*  15   34:if_acmpne       80
	//*  16   37:aload_3         
	//*  17   38:aload_1         
	//*  18   39:invokevirtual   #116 <Method int JsonParser.getIntValue()>
	//*  19   42:invokevirtual   #119 <Method com.fasterxml.jackson.databind.node.NumericNode JsonNodeFactory.numberNode(int)>
	//*  20   45:areturn         
			if(DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(i))
	//*  21   46:getstatic       #122 <Field DeserializationFeature DeserializationFeature.USE_LONG_FOR_INTS>
	//*  22   49:iload           4
	//*  23   51:invokevirtual   #107 <Method boolean DeserializationFeature.enabledIn(int)>
	//*  24   54:ifeq            64
				deserializationcontext = ((DeserializationContext) (com.fasterxml.jackson.core.JsonParser.NumberType.LONG));
	//   25   57:getstatic       #125 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
	//   26   60:astore_2        
			else
	//*  27   61:goto            30
				deserializationcontext = ((DeserializationContext) (jsonparser.getNumberType()));
	//   28   64:aload_1         
	//   29   65:invokevirtual   #58  <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
	//   30   68:astore_2        
		} else
	//*  31   69:goto            30
		{
			deserializationcontext = ((DeserializationContext) (jsonparser.getNumberType()));
	//   32   72:aload_1         
	//   33   73:invokevirtual   #58  <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
	//   34   76:astore_2        
		}
		if(deserializationcontext == com.fasterxml.jackson.core.JsonParser.NumberType.INT)
			return ((JsonNode) (jsonnodefactory.numberNode(jsonparser.getIntValue())));
	//*  35   77:goto            30
		if(deserializationcontext == com.fasterxml.jackson.core.JsonParser.NumberType.LONG)
	//*  36   80:aload_2         
	//*  37   81:getstatic       #125 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
	//*  38   84:if_acmpne       96
			return ((JsonNode) (jsonnodefactory.numberNode(jsonparser.getLongValue())));
	//   39   87:aload_3         
	//   40   88:aload_1         
	//   41   89:invokevirtual   #129 <Method long JsonParser.getLongValue()>
	//   42   92:invokevirtual   #132 <Method com.fasterxml.jackson.databind.node.NumericNode JsonNodeFactory.numberNode(long)>
	//   43   95:areturn         
		else
			return ((JsonNode) (jsonnodefactory.numberNode(jsonparser.getBigIntegerValue())));
	//   44   96:aload_3         
	//   45   97:aload_1         
	//   46   98:invokevirtual   #136 <Method java.math.BigInteger JsonParser.getBigIntegerValue()>
	//   47  101:invokevirtual   #139 <Method com.fasterxml.jackson.databind.node.NumericNode JsonNodeFactory.numberNode(java.math.BigInteger)>
	//   48  104:areturn         
	}

	protected void _handleDuplicateField(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory, String s, ObjectNode objectnode, JsonNode jsonnode, JsonNode jsonnode1)
		throws JsonProcessingException
	{
		if(deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY))
	//*   0    0:aload_2         
	//*   1    1:getstatic       #146 <Field DeserializationFeature DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY>
	//*   2    4:invokevirtual   #76  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*   3    7:ifeq            40
			_reportProblem(jsonparser, (new StringBuilder()).append("Duplicate field '").append(s).append("' for ObjectNode: not allowed when FAIL_ON_READING_DUP_TREE_KEY enabled").toString());
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:new             #148 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #151 <Method void StringBuilder()>
	//    9   19:ldc1            #153 <String "Duplicate field '">
	//   10   21:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:aload           4
	//   12   26:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:ldc1            #159 <String "' for ObjectNode: not allowed when FAIL_ON_READING_DUP_TREE_KEY enabled">
	//   14   31:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   15   34:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   16   37:invokevirtual   #167 <Method void _reportProblem(JsonParser, String)>
	//   17   40:return          
	}

	protected void _reportProblem(JsonParser jsonparser, String s)
		throws JsonMappingException
	{
		throw JsonMappingException.from(jsonparser, s);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #173 <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//    3    5:athrow          
	}

	protected final JsonNode deserializeAny(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
		throws IOException
	{
		switch(jsonparser.getCurrentTokenId())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #177 <Method int JsonParser.getCurrentTokenId()>
		{
	//*   2    4:tableswitch     1 12: default 68
	//	               1 77
	//	               2 77
	//	               3 85
	//	               4 68
	//	               5 77
	//	               6 101
	//	               7 110
	//	               8 118
	//	               9 126
	//	               10 132
	//	               11 138
	//	               12 93
		case 4: // '\004'
		default:
			throw deserializationcontext.mappingException(handledType());
	//    3   68:aload_2         
	//    4   69:aload_0         
	//    5   70:invokevirtual   #180 <Method Class handledType()>
	//    6   73:invokevirtual   #184 <Method JsonMappingException DeserializationContext.mappingException(Class)>
	//    7   76:athrow          

		case 1: // '\001'
		case 2: // '\002'
		case 5: // '\005'
			return ((JsonNode) (deserializeObject(jsonparser, deserializationcontext, jsonnodefactory)));
	//    8   77:aload_0         
	//    9   78:aload_1         
	//   10   79:aload_2         
	//   11   80:aload_3         
	//   12   81:invokevirtual   #188 <Method ObjectNode deserializeObject(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   13   84:areturn         

		case 3: // '\003'
			return ((JsonNode) (deserializeArray(jsonparser, deserializationcontext, jsonnodefactory)));
	//   14   85:aload_0         
	//   15   86:aload_1         
	//   16   87:aload_2         
	//   17   88:aload_3         
	//   18   89:invokevirtual   #192 <Method ArrayNode deserializeArray(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   19   92:areturn         

		case 12: // '\f'
			return _fromEmbedded(jsonparser, deserializationcontext, jsonnodefactory);
	//   20   93:aload_0         
	//   21   94:aload_1         
	//   22   95:aload_2         
	//   23   96:aload_3         
	//   24   97:invokevirtual   #194 <Method JsonNode _fromEmbedded(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   25  100:areturn         

		case 6: // '\006'
			return ((JsonNode) (jsonnodefactory.textNode(jsonparser.getText())));
	//   26  101:aload_3         
	//   27  102:aload_1         
	//   28  103:invokevirtual   #197 <Method String JsonParser.getText()>
	//   29  106:invokevirtual   #201 <Method com.fasterxml.jackson.databind.node.TextNode JsonNodeFactory.textNode(String)>
	//   30  109:areturn         

		case 7: // '\007'
			return _fromInt(jsonparser, deserializationcontext, jsonnodefactory);
	//   31  110:aload_0         
	//   32  111:aload_1         
	//   33  112:aload_2         
	//   34  113:aload_3         
	//   35  114:invokevirtual   #203 <Method JsonNode _fromInt(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   36  117:areturn         

		case 8: // '\b'
			return _fromFloat(jsonparser, deserializationcontext, jsonnodefactory);
	//   37  118:aload_0         
	//   38  119:aload_1         
	//   39  120:aload_2         
	//   40  121:aload_3         
	//   41  122:invokevirtual   #205 <Method JsonNode _fromFloat(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   42  125:areturn         

		case 9: // '\t'
			return ((JsonNode) (jsonnodefactory.booleanNode(true)));
	//   43  126:aload_3         
	//   44  127:iconst_1        
	//   45  128:invokevirtual   #209 <Method com.fasterxml.jackson.databind.node.BooleanNode JsonNodeFactory.booleanNode(boolean)>
	//   46  131:areturn         

		case 10: // '\n'
			return ((JsonNode) (jsonnodefactory.booleanNode(false)));
	//   47  132:aload_3         
	//   48  133:iconst_0        
	//   49  134:invokevirtual   #209 <Method com.fasterxml.jackson.databind.node.BooleanNode JsonNodeFactory.booleanNode(boolean)>
	//   50  137:areturn         

		case 11: // '\013'
			return ((JsonNode) (jsonnodefactory.nullNode()));
	//   51  138:aload_3         
	//   52  139:invokevirtual   #28  <Method com.fasterxml.jackson.databind.node.NullNode JsonNodeFactory.nullNode()>
	//   53  142:areturn         
		}
	}

	protected final ArrayNode deserializeArray(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
		throws IOException
	{
		ArrayNode arraynode = jsonnodefactory.arrayNode();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #213 <Method ArrayNode JsonNodeFactory.arrayNode()>
	//    2    4:astore          4
		do
		{
			JsonToken jsontoken = jsonparser.nextToken();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #217 <Method JsonToken JsonParser.nextToken()>
	//    5   10:astore          5
			if(jsontoken == null)
	//*   6   12:aload           5
	//*   7   14:ifnonnull       24
				throw deserializationcontext.mappingException("Unexpected end-of-input when binding data into ArrayNode");
	//    8   17:aload_2         
	//    9   18:ldc1            #219 <String "Unexpected end-of-input when binding data into ArrayNode">
	//   10   20:invokevirtual   #222 <Method JsonMappingException DeserializationContext.mappingException(String)>
	//   11   23:athrow          
			switch(jsontoken.id())
	//*  12   24:aload           5
	//*  13   26:invokevirtual   #227 <Method int JsonToken.id()>
			{
	//*  14   29:tableswitch     1 12: default 92
	//	               1 108
	//	               2 92
	//	               3 124
	//	               4 230
	//	               5 92
	//	               6 156
	//	               7 173
	//	               8 92
	//	               9 189
	//	               10 203
	//	               11 217
	//	               12 140
			case 2: // '\002'
			case 5: // '\005'
			case 8: // '\b'
			default:
				arraynode.add(deserializeAny(jsonparser, deserializationcontext, jsonnodefactory));
	//   15   92:aload           4
	//   16   94:aload_0         
	//   17   95:aload_1         
	//   18   96:aload_2         
	//   19   97:aload_3         
	//   20   98:invokevirtual   #229 <Method JsonNode deserializeAny(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   21  101:invokevirtual   #235 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   22  104:pop             
				break;

	//*  23  105:goto            6
			case 1: // '\001'
				arraynode.add(((JsonNode) (deserializeObject(jsonparser, deserializationcontext, jsonnodefactory))));
	//   24  108:aload           4
	//   25  110:aload_0         
	//   26  111:aload_1         
	//   27  112:aload_2         
	//   28  113:aload_3         
	//   29  114:invokevirtual   #188 <Method ObjectNode deserializeObject(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   30  117:invokevirtual   #235 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   31  120:pop             
				break;

	//*  32  121:goto            6
			case 3: // '\003'
				arraynode.add(((JsonNode) (deserializeArray(jsonparser, deserializationcontext, jsonnodefactory))));
	//   33  124:aload           4
	//   34  126:aload_0         
	//   35  127:aload_1         
	//   36  128:aload_2         
	//   37  129:aload_3         
	//   38  130:invokevirtual   #192 <Method ArrayNode deserializeArray(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   39  133:invokevirtual   #235 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   40  136:pop             
				break;

	//*  41  137:goto            6
			case 12: // '\f'
				arraynode.add(_fromEmbedded(jsonparser, deserializationcontext, jsonnodefactory));
	//   42  140:aload           4
	//   43  142:aload_0         
	//   44  143:aload_1         
	//   45  144:aload_2         
	//   46  145:aload_3         
	//   47  146:invokevirtual   #194 <Method JsonNode _fromEmbedded(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   48  149:invokevirtual   #235 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   49  152:pop             
				break;

	//*  50  153:goto            6
			case 6: // '\006'
				arraynode.add(((JsonNode) (jsonnodefactory.textNode(jsonparser.getText()))));
	//   51  156:aload           4
	//   52  158:aload_3         
	//   53  159:aload_1         
	//   54  160:invokevirtual   #197 <Method String JsonParser.getText()>
	//   55  163:invokevirtual   #201 <Method com.fasterxml.jackson.databind.node.TextNode JsonNodeFactory.textNode(String)>
	//   56  166:invokevirtual   #235 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   57  169:pop             
				break;

	//*  58  170:goto            6
			case 7: // '\007'
				arraynode.add(_fromInt(jsonparser, deserializationcontext, jsonnodefactory));
	//   59  173:aload           4
	//   60  175:aload_0         
	//   61  176:aload_1         
	//   62  177:aload_2         
	//   63  178:aload_3         
	//   64  179:invokevirtual   #203 <Method JsonNode _fromInt(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   65  182:invokevirtual   #235 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   66  185:pop             
				break;

	//*  67  186:goto            6
			case 9: // '\t'
				arraynode.add(((JsonNode) (jsonnodefactory.booleanNode(true))));
	//   68  189:aload           4
	//   69  191:aload_3         
	//   70  192:iconst_1        
	//   71  193:invokevirtual   #209 <Method com.fasterxml.jackson.databind.node.BooleanNode JsonNodeFactory.booleanNode(boolean)>
	//   72  196:invokevirtual   #235 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   73  199:pop             
				break;

	//*  74  200:goto            6
			case 10: // '\n'
				arraynode.add(((JsonNode) (jsonnodefactory.booleanNode(false))));
	//   75  203:aload           4
	//   76  205:aload_3         
	//   77  206:iconst_0        
	//   78  207:invokevirtual   #209 <Method com.fasterxml.jackson.databind.node.BooleanNode JsonNodeFactory.booleanNode(boolean)>
	//   79  210:invokevirtual   #235 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   80  213:pop             
				break;

	//*  81  214:goto            6
			case 11: // '\013'
				arraynode.add(((JsonNode) (jsonnodefactory.nullNode())));
	//   82  217:aload           4
	//   83  219:aload_3         
	//   84  220:invokevirtual   #28  <Method com.fasterxml.jackson.databind.node.NullNode JsonNodeFactory.nullNode()>
	//   85  223:invokevirtual   #235 <Method ArrayNode ArrayNode.add(JsonNode)>
	//   86  226:pop             
				break;

	//*  87  227:goto            6
			case 4: // '\004'
				return arraynode;
	//   88  230:aload           4
	//   89  232:areturn         
			}
		} while(true);
	}

	protected final ObjectNode deserializeObject(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
		throws IOException
	{
		ObjectNode objectnode = jsonnodefactory.objectNode();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #239 <Method ObjectNode JsonNodeFactory.objectNode()>
	//    2    4:astore          6
		if(!jsonparser.isExpectedStartObjectToken()) goto _L2; else goto _L1
	//    3    6:aload_1         
	//    4    7:invokevirtual   #243 <Method boolean JsonParser.isExpectedStartObjectToken()>
	//    5   10:ifeq            141
_L1:
		String s = jsonparser.nextFieldName();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #246 <Method String JsonParser.nextFieldName()>
	//    8   17:astore          5
_L14:
		if(s == null) goto _L4; else goto _L3
	//    9   19:aload           5
	//   10   21:ifnull          155
_L3:
		jsonparser.nextToken().id();
	//   11   24:aload_1         
	//   12   25:invokevirtual   #217 <Method JsonToken JsonParser.nextToken()>
	//   13   28:invokevirtual   #227 <Method int JsonToken.id()>
		JVM INSTR tableswitch 1 12: default 92
	//	               1 188
	//	               2 92
	//	               3 200
	//	               4 92
	//	               5 92
	//	               6 224
	//	               7 237
	//	               8 92
	//	               9 249
	//	               10 259
	//	               11 269
	//	               12 212;
	//   14   31:tableswitch     1 12: default 92
	//	               1 188
	//	               2 92
	//	               3 200
	//	               4 92
	//	               5 92
	//	               6 224
	//	               7 237
	//	               8 92
	//	               9 249
	//	               10 259
	//	               11 269
	//	               12 212
		   goto _L5 _L6 _L5 _L7 _L5 _L5 _L8 _L9 _L5 _L10 _L11 _L12 _L13
_L12:
		break MISSING_BLOCK_LABEL_269;
_L5:
		Object obj = ((Object) (deserializeAny(jsonparser, deserializationcontext, jsonnodefactory)));
	//   15   92:aload_0         
	//   16   93:aload_1         
	//   17   94:aload_2         
	//   18   95:aload_3         
	//   19   96:invokevirtual   #229 <Method JsonNode deserializeAny(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   20   99:astore          4
_L16:
		JsonNode jsonnode = objectnode.replace(s, ((JsonNode) (obj)));
	//   21  101:aload           6
	//   22  103:aload           5
	//   23  105:aload           4
	//   24  107:invokevirtual   #252 <Method JsonNode ObjectNode.replace(String, JsonNode)>
	//   25  110:astore          7
		if(jsonnode != null)
	//*  26  112:aload           7
	//*  27  114:ifnull          132
			_handleDuplicateField(jsonparser, deserializationcontext, jsonnodefactory, s, objectnode, jsonnode, ((JsonNode) (obj)));
	//   28  117:aload_0         
	//   29  118:aload_1         
	//   30  119:aload_2         
	//   31  120:aload_3         
	//   32  121:aload           5
	//   33  123:aload           6
	//   34  125:aload           7
	//   35  127:aload           4
	//   36  129:invokevirtual   #254 <Method void _handleDuplicateField(JsonParser, DeserializationContext, JsonNodeFactory, String, ObjectNode, JsonNode, JsonNode)>
		s = jsonparser.nextFieldName();
	//   37  132:aload_1         
	//   38  133:invokevirtual   #246 <Method String JsonParser.nextFieldName()>
	//   39  136:astore          5
		  goto _L14
	//*  40  138:goto            19
_L2:
		obj = ((Object) (jsonparser.getCurrentToken()));
	//   41  141:aload_1         
	//   42  142:invokevirtual   #257 <Method JsonToken JsonParser.getCurrentToken()>
	//   43  145:astore          4
		if(obj != JsonToken.END_OBJECT) goto _L15; else goto _L4
	//   44  147:aload           4
	//   45  149:getstatic       #261 <Field JsonToken JsonToken.END_OBJECT>
	//   46  152:if_acmpne       158
_L4:
		return objectnode;
	//   47  155:aload           6
	//   48  157:areturn         
_L15:
		if(obj != JsonToken.FIELD_NAME)
	//*  49  158:aload           4
	//*  50  160:getstatic       #264 <Field JsonToken JsonToken.FIELD_NAME>
	//*  51  163:if_acmpeq       179
			throw deserializationcontext.mappingException(handledType(), jsonparser.getCurrentToken());
	//   52  166:aload_2         
	//   53  167:aload_0         
	//   54  168:invokevirtual   #180 <Method Class handledType()>
	//   55  171:aload_1         
	//   56  172:invokevirtual   #257 <Method JsonToken JsonParser.getCurrentToken()>
	//   57  175:invokevirtual   #267 <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//   58  178:athrow          
		s = jsonparser.getCurrentName();
	//   59  179:aload_1         
	//   60  180:invokevirtual   #270 <Method String JsonParser.getCurrentName()>
	//   61  183:astore          5
		  goto _L14
	//*  62  185:goto            19
_L6:
		obj = ((Object) (deserializeObject(jsonparser, deserializationcontext, jsonnodefactory)));
	//   63  188:aload_0         
	//   64  189:aload_1         
	//   65  190:aload_2         
	//   66  191:aload_3         
	//   67  192:invokevirtual   #188 <Method ObjectNode deserializeObject(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   68  195:astore          4
		  goto _L16
	//*  69  197:goto            101
_L7:
		obj = ((Object) (deserializeArray(jsonparser, deserializationcontext, jsonnodefactory)));
	//   70  200:aload_0         
	//   71  201:aload_1         
	//   72  202:aload_2         
	//   73  203:aload_3         
	//   74  204:invokevirtual   #192 <Method ArrayNode deserializeArray(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   75  207:astore          4
		  goto _L16
	//*  76  209:goto            101
_L13:
		obj = ((Object) (_fromEmbedded(jsonparser, deserializationcontext, jsonnodefactory)));
	//   77  212:aload_0         
	//   78  213:aload_1         
	//   79  214:aload_2         
	//   80  215:aload_3         
	//   81  216:invokevirtual   #194 <Method JsonNode _fromEmbedded(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   82  219:astore          4
		  goto _L16
	//*  83  221:goto            101
_L8:
		obj = ((Object) (jsonnodefactory.textNode(jsonparser.getText())));
	//   84  224:aload_3         
	//   85  225:aload_1         
	//   86  226:invokevirtual   #197 <Method String JsonParser.getText()>
	//   87  229:invokevirtual   #201 <Method com.fasterxml.jackson.databind.node.TextNode JsonNodeFactory.textNode(String)>
	//   88  232:astore          4
		  goto _L16
	//*  89  234:goto            101
_L9:
		obj = ((Object) (_fromInt(jsonparser, deserializationcontext, jsonnodefactory)));
	//   90  237:aload_0         
	//   91  238:aload_1         
	//   92  239:aload_2         
	//   93  240:aload_3         
	//   94  241:invokevirtual   #203 <Method JsonNode _fromInt(JsonParser, DeserializationContext, JsonNodeFactory)>
	//   95  244:astore          4
		  goto _L16
	//*  96  246:goto            101
_L10:
		obj = ((Object) (jsonnodefactory.booleanNode(true)));
	//   97  249:aload_3         
	//   98  250:iconst_1        
	//   99  251:invokevirtual   #209 <Method com.fasterxml.jackson.databind.node.BooleanNode JsonNodeFactory.booleanNode(boolean)>
	//  100  254:astore          4
		  goto _L16
	//* 101  256:goto            101
_L11:
		obj = ((Object) (jsonnodefactory.booleanNode(false)));
	//  102  259:aload_3         
	//  103  260:iconst_0        
	//  104  261:invokevirtual   #209 <Method com.fasterxml.jackson.databind.node.BooleanNode JsonNodeFactory.booleanNode(boolean)>
	//  105  264:astore          4
		  goto _L16
	//* 106  266:goto            101
		obj = ((Object) (jsonnodefactory.nullNode()));
	//  107  269:aload_3         
	//  108  270:invokevirtual   #28  <Method com.fasterxml.jackson.databind.node.NullNode JsonNodeFactory.nullNode()>
	//  109  273:astore          4
		  goto _L16
	//* 110  275:goto            101
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #278 <Method Object TypeDeserializer.deserializeTypedFromAny(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public boolean isCachable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}
}
