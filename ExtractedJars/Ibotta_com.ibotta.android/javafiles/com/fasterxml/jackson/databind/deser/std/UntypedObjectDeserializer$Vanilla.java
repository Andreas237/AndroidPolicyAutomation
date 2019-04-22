// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer, UntypedObjectDeserializer

public static class UntypedObjectDeserializer$Vanilla extends StdDeserializer
{

	public static UntypedObjectDeserializer$Vanilla instance(boolean flag)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            13
			return new UntypedObjectDeserializer$Vanilla(true);
	//    2    4:new             #2   <Class UntypedObjectDeserializer$Vanilla>
	//    3    7:dup             
	//    4    8:iconst_1        
	//    5    9:invokespecial   #28  <Method void UntypedObjectDeserializer$Vanilla(boolean)>
	//    6   12:areturn         
		else
			return std;
	//    7   13:getstatic       #24  <Field UntypedObjectDeserializer$Vanilla std>
	//    8   16:areturn         
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		switch(jsonparser.getCurrentTokenId())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #47  <Method int JsonParser.getCurrentTokenId()>
		{
	//*   2    4:tableswitch     1 12: default 68
	//	               1 204
	//	               2 195
	//	               3 138
	//	               4 68
	//	               5 223
	//	               6 133
	//	               7 111
	//	               8 91
	//	               9 87
	//	               10 83
	//	               11 81
	//	               12 76
		case 4: // '\004'
		default:
			return deserializationcontext.handleUnexpectedToken(java/lang/Object, jsonparser);
	//    3   68:aload_2         
	//    4   69:ldc1            #30  <Class Object>
	//    5   71:aload_1         
	//    6   72:invokevirtual   #53  <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//    7   75:areturn         

		case 12: // '\f'
			return jsonparser.getEmbeddedObject();
	//    8   76:aload_1         
	//    9   77:invokevirtual   #57  <Method Object JsonParser.getEmbeddedObject()>
	//   10   80:areturn         

		case 11: // '\013'
			return ((Object) (null));
	//   11   81:aconst_null     
	//   12   82:areturn         

		case 10: // '\n'
			return ((Object) (Boolean.FALSE));
	//   13   83:getstatic       #63  <Field Boolean Boolean.FALSE>
	//   14   86:areturn         

		case 9: // '\t'
			return ((Object) (Boolean.TRUE));
	//   15   87:getstatic       #66  <Field Boolean Boolean.TRUE>
	//   16   90:areturn         

		case 8: // '\b'
			if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
	//*  17   91:aload_2         
	//*  18   92:getstatic       #72  <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
	//*  19   95:invokevirtual   #76  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  20   98:ifeq            106
				return ((Object) (jsonparser.getDecimalValue()));
	//   21  101:aload_1         
	//   22  102:invokevirtual   #80  <Method java.math.BigDecimal JsonParser.getDecimalValue()>
	//   23  105:areturn         
			else
				return ((Object) (jsonparser.getNumberValue()));
	//   24  106:aload_1         
	//   25  107:invokevirtual   #84  <Method Number JsonParser.getNumberValue()>
	//   26  110:areturn         

		case 7: // '\007'
			if(deserializationcontext.hasSomeOfFeatures(F_MASK_INT_COERCIONS))
	//*  27  111:aload_2         
	//*  28  112:getstatic       #88  <Field int F_MASK_INT_COERCIONS>
	//*  29  115:invokevirtual   #92  <Method boolean DeserializationContext.hasSomeOfFeatures(int)>
	//*  30  118:ifeq            128
				return _coerceIntegral(jsonparser, deserializationcontext);
	//   31  121:aload_0         
	//   32  122:aload_1         
	//   33  123:aload_2         
	//   34  124:invokevirtual   #95  <Method Object _coerceIntegral(JsonParser, DeserializationContext)>
	//   35  127:areturn         
			else
				return ((Object) (jsonparser.getNumberValue()));
	//   36  128:aload_1         
	//   37  129:invokevirtual   #84  <Method Number JsonParser.getNumberValue()>
	//   38  132:areturn         

		case 6: // '\006'
			return ((Object) (jsonparser.getText()));
	//   39  133:aload_1         
	//   40  134:invokevirtual   #99  <Method String JsonParser.getText()>
	//   41  137:areturn         

		case 3: // '\003'
			if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*  42  138:aload_1         
	//*  43  139:invokevirtual   #103 <Method JsonToken JsonParser.nextToken()>
	//*  44  142:getstatic       #109 <Field JsonToken JsonToken.END_ARRAY>
	//*  45  145:if_acmpne       171
				if(deserializationcontext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY))
	//*  46  148:aload_2         
	//*  47  149:getstatic       #112 <Field DeserializationFeature DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY>
	//*  48  152:invokevirtual   #76  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  49  155:ifeq            162
					return ((Object) (UntypedObjectDeserializer.NO_OBJECTS));
	//   50  158:getstatic       #116 <Field Object[] UntypedObjectDeserializer.NO_OBJECTS>
	//   51  161:areturn         
				else
					return ((Object) (new ArrayList(2)));
	//   52  162:new             #118 <Class ArrayList>
	//   53  165:dup             
	//   54  166:iconst_2        
	//   55  167:invokespecial   #121 <Method void ArrayList(int)>
	//   56  170:areturn         
			if(deserializationcontext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY))
	//*  57  171:aload_2         
	//*  58  172:getstatic       #112 <Field DeserializationFeature DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY>
	//*  59  175:invokevirtual   #76  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  60  178:ifeq            188
				return ((Object) (mapArrayToArray(jsonparser, deserializationcontext)));
	//   61  181:aload_0         
	//   62  182:aload_1         
	//   63  183:aload_2         
	//   64  184:invokevirtual   #125 <Method Object[] mapArrayToArray(JsonParser, DeserializationContext)>
	//   65  187:areturn         
			else
				return mapArray(jsonparser, deserializationcontext);
	//   66  188:aload_0         
	//   67  189:aload_1         
	//   68  190:aload_2         
	//   69  191:invokevirtual   #128 <Method Object mapArray(JsonParser, DeserializationContext)>
	//   70  194:areturn         

		case 2: // '\002'
			return ((Object) (new LinkedHashMap(2)));
	//   71  195:new             #130 <Class LinkedHashMap>
	//   72  198:dup             
	//   73  199:iconst_2        
	//   74  200:invokespecial   #131 <Method void LinkedHashMap(int)>
	//   75  203:areturn         

		case 1: // '\001'
			if(jsonparser.nextToken() == JsonToken.END_OBJECT)
	//*  76  204:aload_1         
	//*  77  205:invokevirtual   #103 <Method JsonToken JsonParser.nextToken()>
	//*  78  208:getstatic       #134 <Field JsonToken JsonToken.END_OBJECT>
	//*  79  211:if_acmpne       223
				return ((Object) (new LinkedHashMap(2)));
	//   80  214:new             #130 <Class LinkedHashMap>
	//   81  217:dup             
	//   82  218:iconst_2        
	//   83  219:invokespecial   #131 <Method void LinkedHashMap(int)>
	//   84  222:areturn         
			// fall through

		case 5: // '\005'
			return mapObject(jsonparser, deserializationcontext);
	//   85  223:aload_0         
	//   86  224:aload_1         
	//   87  225:aload_2         
	//   88  226:invokevirtual   #137 <Method Object mapObject(JsonParser, DeserializationContext)>
	//   89  229:areturn         
		}
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(_nonMerging)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field boolean _nonMerging>
	//*   2    4:ifeq            14
			return deserialize(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #141 <Method Object deserialize(JsonParser, DeserializationContext)>
	//    7   13:areturn         
		switch(jsonparser.getCurrentTokenId())
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #47  <Method int JsonParser.getCurrentTokenId()>
		{
		default:
			break;

	//*  10   18:tableswitch     1 5: default 52
	//	               1 108
	//	               2 106
	//	               3 55
	//	               4 106
	//	               5 120
	//*  11   52:goto            217
		case 3: // '\003'
			if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*  12   55:aload_1         
	//*  13   56:invokevirtual   #103 <Method JsonToken JsonParser.nextToken()>
	//*  14   59:getstatic       #109 <Field JsonToken JsonToken.END_ARRAY>
	//*  15   62:if_acmpne       67
				return obj;
	//   16   65:aload_3         
	//   17   66:areturn         
			if(obj instanceof Collection)
	//*  18   67:aload_3         
	//*  19   68:instanceof      #143 <Class Collection>
	//*  20   71:ifeq            217
			{
				Collection collection = (Collection)obj;
	//   21   74:aload_3         
	//   22   75:checkcast       #143 <Class Collection>
	//   23   78:astore          4
				do
					collection.add(deserialize(jsonparser, deserializationcontext));
	//   24   80:aload           4
	//   25   82:aload_0         
	//   26   83:aload_1         
	//   27   84:aload_2         
	//   28   85:invokevirtual   #141 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   29   88:invokeinterface #147 <Method boolean Collection.add(Object)>
	//   30   93:pop             
				while(jsonparser.nextToken() != JsonToken.END_ARRAY);
	//   31   94:aload_1         
	//   32   95:invokevirtual   #103 <Method JsonToken JsonParser.nextToken()>
	//   33   98:getstatic       #109 <Field JsonToken JsonToken.END_ARRAY>
	//   34  101:if_acmpne       80
				return obj;
	//   35  104:aload_3         
	//   36  105:areturn         
			}
			break;

		case 2: // '\002'
		case 4: // '\004'
			return obj;
	//   37  106:aload_3         
	//   38  107:areturn         

		case 1: // '\001'
			if(jsonparser.nextToken() == JsonToken.END_OBJECT)
	//*  39  108:aload_1         
	//*  40  109:invokevirtual   #103 <Method JsonToken JsonParser.nextToken()>
	//*  41  112:getstatic       #134 <Field JsonToken JsonToken.END_OBJECT>
	//*  42  115:if_acmpne       120
				return obj;
	//   43  118:aload_3         
	//   44  119:areturn         
			// fall through

		case 5: // '\005'
			if(!(obj instanceof Map))
				break;
	//   45  120:aload_3         
	//   46  121:instanceof      #149 <Class Map>
	//   47  124:ifeq            217
			Map map = (Map)obj;
	//   48  127:aload_3         
	//   49  128:checkcast       #149 <Class Map>
	//   50  131:astore          6
			String s = jsonparser.getCurrentName();
	//   51  133:aload_1         
	//   52  134:invokevirtual   #152 <Method String JsonParser.getCurrentName()>
	//   53  137:astore          4
			Object obj1;
			do
			{
				jsonparser.nextToken();
	//   54  139:aload_1         
	//   55  140:invokevirtual   #103 <Method JsonToken JsonParser.nextToken()>
	//   56  143:pop             
				Object obj2 = map.get(((Object) (s)));
	//   57  144:aload           6
	//   58  146:aload           4
	//   59  148:invokeinterface #156 <Method Object Map.get(Object)>
	//   60  153:astore          7
				if(obj2 != null)
	//*  61  155:aload           7
	//*  62  157:ifnull          173
					obj1 = deserialize(jsonparser, deserializationcontext, obj2);
	//   63  160:aload_0         
	//   64  161:aload_1         
	//   65  162:aload_2         
	//   66  163:aload           7
	//   67  165:invokevirtual   #158 <Method Object deserialize(JsonParser, DeserializationContext, Object)>
	//   68  168:astore          5
				else
	//*  69  170:goto            181
					obj1 = deserialize(jsonparser, deserializationcontext);
	//   70  173:aload_0         
	//   71  174:aload_1         
	//   72  175:aload_2         
	//   73  176:invokevirtual   #141 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   74  179:astore          5
				if(obj1 != obj2)
	//*  75  181:aload           5
	//*  76  183:aload           7
	//*  77  185:if_acmpeq       200
					map.put(((Object) (s)), obj1);
	//   78  188:aload           6
	//   79  190:aload           4
	//   80  192:aload           5
	//   81  194:invokeinterface #162 <Method Object Map.put(Object, Object)>
	//   82  199:pop             
				obj1 = ((Object) (jsonparser.nextFieldName()));
	//   83  200:aload_1         
	//   84  201:invokevirtual   #165 <Method String JsonParser.nextFieldName()>
	//   85  204:astore          5
				s = ((String) (obj1));
	//   86  206:aload           5
	//   87  208:astore          4
			} while(obj1 != null);
	//   88  210:aload           5
	//   89  212:ifnonnull       139
			return obj;
	//   90  215:aload_3         
	//   91  216:areturn         
		}
		return deserialize(jsonparser, deserializationcontext);
	//   92  217:aload_0         
	//   93  218:aload_1         
	//   94  219:aload_2         
	//   95  220:invokevirtual   #141 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   96  223:areturn         
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		int i = jsonparser.getCurrentTokenId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #47  <Method int JsonParser.getCurrentTokenId()>
	//    2    4:istore          4
		if(i != 1 && i != 3)
	//*   3    6:iload           4
	//*   4    8:iconst_1        
	//*   5    9:icmpeq          136
	//*   6   12:iload           4
	//*   7   14:iconst_3        
	//*   8   15:icmpeq          136
			switch(i)
	//*   9   18:iload           4
			{
	//*  10   20:tableswitch     5 12: default 68
	//	               5 136
	//	               6 131
	//	               7 111
	//	               8 91
	//	               9 87
	//	               10 83
	//	               11 81
	//	               12 76
			default:
				return deserializationcontext.handleUnexpectedToken(java/lang/Object, jsonparser);
	//   11   68:aload_2         
	//   12   69:ldc1            #30  <Class Object>
	//   13   71:aload_1         
	//   14   72:invokevirtual   #53  <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   15   75:areturn         

			case 12: // '\f'
				return jsonparser.getEmbeddedObject();
	//   16   76:aload_1         
	//   17   77:invokevirtual   #57  <Method Object JsonParser.getEmbeddedObject()>
	//   18   80:areturn         

			case 11: // '\013'
				return ((Object) (null));
	//   19   81:aconst_null     
	//   20   82:areturn         

			case 10: // '\n'
				return ((Object) (Boolean.FALSE));
	//   21   83:getstatic       #63  <Field Boolean Boolean.FALSE>
	//   22   86:areturn         

			case 9: // '\t'
				return ((Object) (Boolean.TRUE));
	//   23   87:getstatic       #66  <Field Boolean Boolean.TRUE>
	//   24   90:areturn         

			case 8: // '\b'
				if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
	//*  25   91:aload_2         
	//*  26   92:getstatic       #72  <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
	//*  27   95:invokevirtual   #76  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  28   98:ifeq            106
					return ((Object) (jsonparser.getDecimalValue()));
	//   29  101:aload_1         
	//   30  102:invokevirtual   #80  <Method java.math.BigDecimal JsonParser.getDecimalValue()>
	//   31  105:areturn         
				else
					return ((Object) (jsonparser.getNumberValue()));
	//   32  106:aload_1         
	//   33  107:invokevirtual   #84  <Method Number JsonParser.getNumberValue()>
	//   34  110:areturn         

			case 7: // '\007'
				if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS))
	//*  35  111:aload_2         
	//*  36  112:getstatic       #170 <Field DeserializationFeature DeserializationFeature.USE_BIG_INTEGER_FOR_INTS>
	//*  37  115:invokevirtual   #76  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  38  118:ifeq            126
					return ((Object) (jsonparser.getBigIntegerValue()));
	//   39  121:aload_1         
	//   40  122:invokevirtual   #174 <Method java.math.BigInteger JsonParser.getBigIntegerValue()>
	//   41  125:areturn         
				else
					return ((Object) (jsonparser.getNumberValue()));
	//   42  126:aload_1         
	//   43  127:invokevirtual   #84  <Method Number JsonParser.getNumberValue()>
	//   44  130:areturn         

			case 6: // '\006'
				return ((Object) (jsonparser.getText()));
	//   45  131:aload_1         
	//   46  132:invokevirtual   #99  <Method String JsonParser.getText()>
	//   47  135:areturn         

			case 5: // '\005'
				break;
			}
		return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
	//   48  136:aload_3         
	//   49  137:aload_1         
	//   50  138:aload_2         
	//   51  139:invokevirtual   #179 <Method Object TypeDeserializer.deserializeTypedFromAny(JsonParser, DeserializationContext)>
	//   52  142:areturn         
	}

	protected Object mapArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj = deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #141 <Method Object deserialize(JsonParser, DeserializationContext)>
	//    4    6:astore          6
		JsonToken jsontoken = jsonparser.nextToken();
	//    5    8:aload_1         
	//    6    9:invokevirtual   #103 <Method JsonToken JsonParser.nextToken()>
	//    7   12:astore          7
		Object obj1 = ((Object) (JsonToken.END_ARRAY));
	//    8   14:getstatic       #109 <Field JsonToken JsonToken.END_ARRAY>
	//    9   17:astore          8
		int j = 2;
	//   10   19:iconst_2        
	//   11   20:istore          4
		if(jsontoken == obj1)
	//*  12   22:aload           7
	//*  13   24:aload           8
	//*  14   26:if_acmpne       47
		{
			jsonparser = ((JsonParser) (new ArrayList(2)));
	//   15   29:new             #118 <Class ArrayList>
	//   16   32:dup             
	//   17   33:iconst_2        
	//   18   34:invokespecial   #121 <Method void ArrayList(int)>
	//   19   37:astore_1        
			((ArrayList) (jsonparser)).add(obj);
	//   20   38:aload_1         
	//   21   39:aload           6
	//   22   41:invokevirtual   #180 <Method boolean ArrayList.add(Object)>
	//   23   44:pop             
			return ((Object) (jsonparser));
	//   24   45:aload_1         
	//   25   46:areturn         
		}
		Object obj2 = deserialize(jsonparser, deserializationcontext);
	//   26   47:aload_0         
	//   27   48:aload_1         
	//   28   49:aload_2         
	//   29   50:invokevirtual   #141 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   30   53:astore          9
		if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*  31   55:aload_1         
	//*  32   56:invokevirtual   #103 <Method JsonToken JsonParser.nextToken()>
	//*  33   59:getstatic       #109 <Field JsonToken JsonToken.END_ARRAY>
	//*  34   62:if_acmpne       90
		{
			jsonparser = ((JsonParser) (new ArrayList(2)));
	//   35   65:new             #118 <Class ArrayList>
	//   36   68:dup             
	//   37   69:iconst_2        
	//   38   70:invokespecial   #121 <Method void ArrayList(int)>
	//   39   73:astore_1        
			((ArrayList) (jsonparser)).add(obj);
	//   40   74:aload_1         
	//   41   75:aload           6
	//   42   77:invokevirtual   #180 <Method boolean ArrayList.add(Object)>
	//   43   80:pop             
			((ArrayList) (jsonparser)).add(obj2);
	//   44   81:aload_1         
	//   45   82:aload           9
	//   46   84:invokevirtual   #180 <Method boolean ArrayList.add(Object)>
	//   47   87:pop             
			return ((Object) (jsonparser));
	//   48   88:aload_1         
	//   49   89:areturn         
		}
		obj1 = ((Object) (deserializationcontext.leaseObjectBuffer()));
	//   50   90:aload_2         
	//   51   91:invokevirtual   #184 <Method ObjectBuffer DeserializationContext.leaseObjectBuffer()>
	//   52   94:astore          8
		Object aobj1[] = ((ObjectBuffer) (obj1)).resetAndStart();
	//   53   96:aload           8
	//   54   98:invokevirtual   #190 <Method Object[] ObjectBuffer.resetAndStart()>
	//   55  101:astore          7
		aobj1[0] = obj;
	//   56  103:aload           7
	//   57  105:iconst_0        
	//   58  106:aload           6
	//   59  108:aastore         
		aobj1[1] = obj2;
	//   60  109:aload           7
	//   61  111:iconst_1        
	//   62  112:aload           9
	//   63  114:aastore         
		int i = 2;
	//   64  115:iconst_2        
	//   65  116:istore_3        
		do
		{
			Object obj3 = deserialize(jsonparser, deserializationcontext);
	//   66  117:aload_0         
	//   67  118:aload_1         
	//   68  119:aload_2         
	//   69  120:invokevirtual   #141 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   70  123:astore          9
			int k = j + 1;
	//   71  125:iload           4
	//   72  127:iconst_1        
	//   73  128:iadd            
	//   74  129:istore          5
			j = i;
	//   75  131:iload_3         
	//   76  132:istore          4
			Object aobj[] = aobj1;
	//   77  134:aload           7
	//   78  136:astore          6
			if(i >= aobj1.length)
	//*  79  138:iload_3         
	//*  80  139:aload           7
	//*  81  141:arraylength     
	//*  82  142:icmplt          157
			{
				aobj = ((ObjectBuffer) (obj1)).appendCompletedChunk(aobj1);
	//   83  145:aload           8
	//   84  147:aload           7
	//   85  149:invokevirtual   #194 <Method Object[] ObjectBuffer.appendCompletedChunk(Object[])>
	//   86  152:astore          6
				j = 0;
	//   87  154:iconst_0        
	//   88  155:istore          4
			}
			i = j + 1;
	//   89  157:iload           4
	//   90  159:iconst_1        
	//   91  160:iadd            
	//   92  161:istore_3        
			aobj[j] = obj3;
	//   93  162:aload           6
	//   94  164:iload           4
	//   95  166:aload           9
	//   96  168:aastore         
			if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*  97  169:aload_1         
	//*  98  170:invokevirtual   #103 <Method JsonToken JsonParser.nextToken()>
	//*  99  173:getstatic       #109 <Field JsonToken JsonToken.END_ARRAY>
	//* 100  176:if_acmpne       200
			{
				jsonparser = ((JsonParser) (new ArrayList(k)));
	//  101  179:new             #118 <Class ArrayList>
	//  102  182:dup             
	//  103  183:iload           5
	//  104  185:invokespecial   #121 <Method void ArrayList(int)>
	//  105  188:astore_1        
				((ObjectBuffer) (obj1)).completeAndClearBuffer(aobj, i, ((java.util.List) (jsonparser)));
	//  106  189:aload           8
	//  107  191:aload           6
	//  108  193:iload_3         
	//  109  194:aload_1         
	//  110  195:invokevirtual   #198 <Method void ObjectBuffer.completeAndClearBuffer(Object[], int, java.util.List)>
				return ((Object) (jsonparser));
	//  111  198:aload_1         
	//  112  199:areturn         
			}
			j = k;
	//  113  200:iload           5
	//  114  202:istore          4
			aobj1 = aobj;
	//  115  204:aload           6
	//  116  206:astore          7
		} while(true);
	//  117  208:goto            117
	}

	protected Object[] mapArrayToArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #184 <Method ObjectBuffer DeserializationContext.leaseObjectBuffer()>
	//    2    4:astore          7
		Object aobj[] = objectbuffer.resetAndStart();
	//    3    6:aload           7
	//    4    8:invokevirtual   #190 <Method Object[] ObjectBuffer.resetAndStart()>
	//    5   11:astore          5
		int i = 0;
	//    6   13:iconst_0        
	//    7   14:istore_3        
		do
		{
			Object obj = deserialize(jsonparser, deserializationcontext);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:aload_2         
	//   11   18:invokevirtual   #141 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   12   21:astore          8
			int j = i;
	//   13   23:iload_3         
	//   14   24:istore          4
			Object aobj1[] = aobj;
	//   15   26:aload           5
	//   16   28:astore          6
			if(i >= aobj.length)
	//*  17   30:iload_3         
	//*  18   31:aload           5
	//*  19   33:arraylength     
	//*  20   34:icmplt          49
			{
				aobj1 = objectbuffer.appendCompletedChunk(aobj);
	//   21   37:aload           7
	//   22   39:aload           5
	//   23   41:invokevirtual   #194 <Method Object[] ObjectBuffer.appendCompletedChunk(Object[])>
	//   24   44:astore          6
				j = 0;
	//   25   46:iconst_0        
	//   26   47:istore          4
			}
			i = j + 1;
	//   27   49:iload           4
	//   28   51:iconst_1        
	//   29   52:iadd            
	//   30   53:istore_3        
			aobj1[j] = obj;
	//   31   54:aload           6
	//   32   56:iload           4
	//   33   58:aload           8
	//   34   60:aastore         
			if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*  35   61:aload_1         
	//*  36   62:invokevirtual   #103 <Method JsonToken JsonParser.nextToken()>
	//*  37   65:getstatic       #109 <Field JsonToken JsonToken.END_ARRAY>
	//*  38   68:if_acmpne       80
				return objectbuffer.completeAndClearBuffer(aobj1, i);
	//   39   71:aload           7
	//   40   73:aload           6
	//   41   75:iload_3         
	//   42   76:invokevirtual   #201 <Method Object[] ObjectBuffer.completeAndClearBuffer(Object[], int)>
	//   43   79:areturn         
			aobj = aobj1;
	//   44   80:aload           6
	//   45   82:astore          5
		} while(true);
	//   46   84:goto            15
	}

	protected Object mapObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		String s1 = jsonparser.getText();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #99  <Method String JsonParser.getText()>
	//    2    4:astore          4
		jsonparser.nextToken();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #103 <Method JsonToken JsonParser.nextToken()>
	//    5   10:pop             
		Object obj = deserialize(jsonparser, deserializationcontext);
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:aload_2         
	//    9   14:invokevirtual   #141 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   10   17:astore          5
		String s2 = jsonparser.nextFieldName();
	//   11   19:aload_1         
	//   12   20:invokevirtual   #165 <Method String JsonParser.nextFieldName()>
	//   13   23:astore          7
		if(s2 == null)
	//*  14   25:aload           7
	//*  15   27:ifnonnull       50
		{
			jsonparser = ((JsonParser) (new LinkedHashMap(2)));
	//   16   30:new             #130 <Class LinkedHashMap>
	//   17   33:dup             
	//   18   34:iconst_2        
	//   19   35:invokespecial   #131 <Method void LinkedHashMap(int)>
	//   20   38:astore_1        
			((LinkedHashMap) (jsonparser)).put(((Object) (s1)), obj);
	//   21   39:aload_1         
	//   22   40:aload           4
	//   23   42:aload           5
	//   24   44:invokevirtual   #202 <Method Object LinkedHashMap.put(Object, Object)>
	//   25   47:pop             
			return ((Object) (jsonparser));
	//   26   48:aload_1         
	//   27   49:areturn         
		}
		jsonparser.nextToken();
	//   28   50:aload_1         
	//   29   51:invokevirtual   #103 <Method JsonToken JsonParser.nextToken()>
	//   30   54:pop             
		Object obj1 = deserialize(jsonparser, deserializationcontext);
	//   31   55:aload_0         
	//   32   56:aload_1         
	//   33   57:aload_2         
	//   34   58:invokevirtual   #141 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   35   61:astore          8
		String s = jsonparser.nextFieldName();
	//   36   63:aload_1         
	//   37   64:invokevirtual   #165 <Method String JsonParser.nextFieldName()>
	//   38   67:astore_3        
		if(s == null)
	//*  39   68:aload_3         
	//*  40   69:ifnonnull       101
		{
			jsonparser = ((JsonParser) (new LinkedHashMap(4)));
	//   41   72:new             #130 <Class LinkedHashMap>
	//   42   75:dup             
	//   43   76:iconst_4        
	//   44   77:invokespecial   #131 <Method void LinkedHashMap(int)>
	//   45   80:astore_1        
			((LinkedHashMap) (jsonparser)).put(((Object) (s1)), obj);
	//   46   81:aload_1         
	//   47   82:aload           4
	//   48   84:aload           5
	//   49   86:invokevirtual   #202 <Method Object LinkedHashMap.put(Object, Object)>
	//   50   89:pop             
			((LinkedHashMap) (jsonparser)).put(((Object) (s2)), obj1);
	//   51   90:aload_1         
	//   52   91:aload           7
	//   53   93:aload           8
	//   54   95:invokevirtual   #202 <Method Object LinkedHashMap.put(Object, Object)>
	//   55   98:pop             
			return ((Object) (jsonparser));
	//   56   99:aload_1         
	//   57  100:areturn         
		}
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//   58  101:new             #130 <Class LinkedHashMap>
	//   59  104:dup             
	//   60  105:invokespecial   #203 <Method void LinkedHashMap()>
	//   61  108:astore          6
		linkedhashmap.put(((Object) (s1)), obj);
	//   62  110:aload           6
	//   63  112:aload           4
	//   64  114:aload           5
	//   65  116:invokevirtual   #202 <Method Object LinkedHashMap.put(Object, Object)>
	//   66  119:pop             
		linkedhashmap.put(((Object) (s2)), obj1);
	//   67  120:aload           6
	//   68  122:aload           7
	//   69  124:aload           8
	//   70  126:invokevirtual   #202 <Method Object LinkedHashMap.put(Object, Object)>
	//   71  129:pop             
		do
		{
			jsonparser.nextToken();
	//   72  130:aload_1         
	//   73  131:invokevirtual   #103 <Method JsonToken JsonParser.nextToken()>
	//   74  134:pop             
			linkedhashmap.put(((Object) (s)), deserialize(jsonparser, deserializationcontext));
	//   75  135:aload           6
	//   76  137:aload_3         
	//   77  138:aload_0         
	//   78  139:aload_1         
	//   79  140:aload_2         
	//   80  141:invokevirtual   #141 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   81  144:invokevirtual   #202 <Method Object LinkedHashMap.put(Object, Object)>
	//   82  147:pop             
			s1 = jsonparser.nextFieldName();
	//   83  148:aload_1         
	//   84  149:invokevirtual   #165 <Method String JsonParser.nextFieldName()>
	//   85  152:astore          4
			s = s1;
	//   86  154:aload           4
	//   87  156:astore_3        
		} while(s1 != null);
	//   88  157:aload           4
	//   89  159:ifnonnull       130
		return ((Object) (linkedhashmap));
	//   90  162:aload           6
	//   91  164:areturn         
	}

	public Boolean supportsUpdate(DeserializationConfig deserializationconfig)
	{
		if(_nonMerging)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field boolean _nonMerging>
	//*   2    4:ifeq            11
			return Boolean.FALSE;
	//    3    7:getstatic       #63  <Field Boolean Boolean.FALSE>
	//    4   10:areturn         
		else
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
	}

	private static final long serialVersionUID = 1L;
	public static final UntypedObjectDeserializer$Vanilla std = new UntypedObjectDeserializer$Vanilla();
	protected final boolean _nonMerging;

	static 
	{
	//    0    0:new             #2   <Class UntypedObjectDeserializer$Vanilla>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void UntypedObjectDeserializer$Vanilla()>
	//    3    7:putstatic       #24  <Field UntypedObjectDeserializer$Vanilla std>
	//*   4   10:return          
	}

	public UntypedObjectDeserializer$Vanilla()
	{
		this(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #28  <Method void UntypedObjectDeserializer$Vanilla(boolean)>
	//    3    5:return          
	}

	protected UntypedObjectDeserializer$Vanilla(boolean flag)
	{
		super(java/lang/Object);
	//    0    0:aload_0         
	//    1    1:ldc1            #30  <Class Object>
	//    2    3:invokespecial   #33  <Method void StdDeserializer(Class)>
		_nonMerging = flag;
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:putfield        #35  <Field boolean _nonMerging>
	//    6   11:return          
	}
}
