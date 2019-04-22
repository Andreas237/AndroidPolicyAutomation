// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer

public class UntypedObjectDeserializer extends StdDeserializer
	implements ContextualDeserializer, ResolvableDeserializer
{
	public static class Vanilla extends StdDeserializer
	{

		public static Vanilla instance(boolean flag)
		{
			if(flag)
		//*   0    0:iload_0         
		//*   1    1:ifeq            13
				return new Vanilla(true);
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
		//		               1 204
		//		               2 195
		//		               3 138
		//		               4 68
		//		               5 223
		//		               6 133
		//		               7 111
		//		               8 91
		//		               9 87
		//		               10 83
		//		               11 81
		//		               12 76
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
		//		               1 108
		//		               2 106
		//		               3 55
		//		               4 106
		//		               5 120
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
		//		               5 136
		//		               6 131
		//		               7 111
		//		               8 91
		//		               9 87
		//		               10 83
		//		               11 81
		//		               12 76
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
					((ObjectBuffer) (obj1)).completeAndClearBuffer(aobj, i, ((List) (jsonparser)));
		//  106  189:aload           8
		//  107  191:aload           6
		//  108  193:iload_3         
		//  109  194:aload_1         
		//  110  195:invokevirtual   #198 <Method void ObjectBuffer.completeAndClearBuffer(Object[], int, List)>
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
		public static final Vanilla std = new Vanilla();
		protected final boolean _nonMerging;

		static 
		{
		//    0    0:new             #2   <Class UntypedObjectDeserializer$Vanilla>
		//    1    3:dup             
		//    2    4:invokespecial   #22  <Method void UntypedObjectDeserializer$Vanilla()>
		//    3    7:putstatic       #24  <Field UntypedObjectDeserializer$Vanilla std>
		//*   4   10:return          
		}

		public Vanilla()
		{
			this(false);
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:invokespecial   #28  <Method void UntypedObjectDeserializer$Vanilla(boolean)>
		//    3    5:return          
		}

		protected Vanilla(boolean flag)
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


	public UntypedObjectDeserializer()
	{
		this(((JavaType) (null)), ((JavaType) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:invokespecial   #42  <Method void UntypedObjectDeserializer(JavaType, JavaType)>
	//    4    6:return          
	}

	public UntypedObjectDeserializer(JavaType javatype, JavaType javatype1)
	{
		super(java/lang/Object);
	//    0    0:aload_0         
	//    1    1:ldc1            #34  <Class Object>
	//    2    3:invokespecial   #46  <Method void StdDeserializer(Class)>
		_listType = javatype;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #48  <Field JavaType _listType>
		_mapType = javatype1;
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:putfield        #50  <Field JavaType _mapType>
		_nonMerging = false;
	//    9   16:aload_0         
	//   10   17:iconst_0        
	//   11   18:putfield        #52  <Field boolean _nonMerging>
	//   12   21:return          
	}

	protected UntypedObjectDeserializer(UntypedObjectDeserializer untypedobjectdeserializer, boolean flag)
	{
		super(java/lang/Object);
	//    0    0:aload_0         
	//    1    1:ldc1            #34  <Class Object>
	//    2    3:invokespecial   #46  <Method void StdDeserializer(Class)>
		_mapDeserializer = untypedobjectdeserializer._mapDeserializer;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:getfield        #55  <Field JsonDeserializer _mapDeserializer>
	//    6   11:putfield        #55  <Field JsonDeserializer _mapDeserializer>
		_listDeserializer = untypedobjectdeserializer._listDeserializer;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:getfield        #57  <Field JsonDeserializer _listDeserializer>
	//   10   19:putfield        #57  <Field JsonDeserializer _listDeserializer>
		_stringDeserializer = untypedobjectdeserializer._stringDeserializer;
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:getfield        #59  <Field JsonDeserializer _stringDeserializer>
	//   14   27:putfield        #59  <Field JsonDeserializer _stringDeserializer>
		_numberDeserializer = untypedobjectdeserializer._numberDeserializer;
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:getfield        #61  <Field JsonDeserializer _numberDeserializer>
	//   18   35:putfield        #61  <Field JsonDeserializer _numberDeserializer>
		_listType = untypedobjectdeserializer._listType;
	//   19   38:aload_0         
	//   20   39:aload_1         
	//   21   40:getfield        #48  <Field JavaType _listType>
	//   22   43:putfield        #48  <Field JavaType _listType>
		_mapType = untypedobjectdeserializer._mapType;
	//   23   46:aload_0         
	//   24   47:aload_1         
	//   25   48:getfield        #50  <Field JavaType _mapType>
	//   26   51:putfield        #50  <Field JavaType _mapType>
		_nonMerging = flag;
	//   27   54:aload_0         
	//   28   55:iload_2         
	//   29   56:putfield        #52  <Field boolean _nonMerging>
	//   30   59:return          
	}

	protected JsonDeserializer _clearIfStdImpl(JsonDeserializer jsondeserializer)
	{
		JsonDeserializer jsondeserializer1 = jsondeserializer;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(ClassUtil.isJacksonStdImpl(((Object) (jsondeserializer))))
	//*   2    2:aload_1         
	//*   3    3:invokestatic    #69  <Method boolean ClassUtil.isJacksonStdImpl(Object)>
	//*   4    6:ifeq            11
			jsondeserializer1 = null;
	//    5    9:aconst_null     
	//    6   10:astore_2        
		return jsondeserializer1;
	//    7   11:aload_2         
	//    8   12:areturn         
	}

	protected JsonDeserializer _findCustomDeser(DeserializationContext deserializationcontext, JavaType javatype)
		throws JsonMappingException
	{
		return deserializationcontext.findNonContextualValueDeserializer(javatype);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #81  <Method JsonDeserializer DeserializationContext.findNonContextualValueDeserializer(JavaType)>
	//    3    5:areturn         
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		boolean flag;
		if(beanproperty == null && Boolean.FALSE.equals(((Object) (deserializationcontext.getConfig().getDefaultMergeable(java/lang/Object)))))
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       27
	//*   2    4:getstatic       #91  <Field Boolean Boolean.FALSE>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #95  <Method DeserializationConfig DeserializationContext.getConfig()>
	//*   5   11:ldc1            #34  <Class Object>
	//*   6   13:invokevirtual   #101 <Method Boolean DeserializationConfig.getDefaultMergeable(Class)>
	//*   7   16:invokevirtual   #104 <Method boolean Boolean.equals(Object)>
	//*   8   19:ifeq            27
			flag = true;
	//    9   22:iconst_1        
	//   10   23:istore_3        
		else
	//*  11   24:goto            29
			flag = false;
	//   12   27:iconst_0        
	//   13   28:istore_3        
		if(_stringDeserializer == null && _numberDeserializer == null && _mapDeserializer == null && _listDeserializer == null && ((Object)this).getClass() == com/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializer)
	//*  14   29:aload_0         
	//*  15   30:getfield        #59  <Field JsonDeserializer _stringDeserializer>
	//*  16   33:ifnonnull       71
	//*  17   36:aload_0         
	//*  18   37:getfield        #61  <Field JsonDeserializer _numberDeserializer>
	//*  19   40:ifnonnull       71
	//*  20   43:aload_0         
	//*  21   44:getfield        #55  <Field JsonDeserializer _mapDeserializer>
	//*  22   47:ifnonnull       71
	//*  23   50:aload_0         
	//*  24   51:getfield        #57  <Field JsonDeserializer _listDeserializer>
	//*  25   54:ifnonnull       71
	//*  26   57:aload_0         
	//*  27   58:invokevirtual   #108 <Method Class Object.getClass()>
	//*  28   61:ldc1            #2   <Class UntypedObjectDeserializer>
	//*  29   63:if_acmpne       71
			return ((JsonDeserializer) (Vanilla.instance(flag)));
	//   30   66:iload_3         
	//   31   67:invokestatic    #112 <Method UntypedObjectDeserializer$Vanilla UntypedObjectDeserializer$Vanilla.instance(boolean)>
	//   32   70:areturn         
		if(flag != _nonMerging)
	//*  33   71:iload_3         
	//*  34   72:aload_0         
	//*  35   73:getfield        #52  <Field boolean _nonMerging>
	//*  36   76:icmpeq          89
			return ((JsonDeserializer) (new UntypedObjectDeserializer(this, flag)));
	//   37   79:new             #2   <Class UntypedObjectDeserializer>
	//   38   82:dup             
	//   39   83:aload_0         
	//   40   84:iload_3         
	//   41   85:invokespecial   #114 <Method void UntypedObjectDeserializer(UntypedObjectDeserializer, boolean)>
	//   42   88:areturn         
		else
			return ((JsonDeserializer) (this));
	//   43   89:aload_0         
	//   44   90:areturn         
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		JsonDeserializer jsondeserializer4;
		switch(jsonparser.getCurrentTokenId())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #125 <Method int JsonParser.getCurrentTokenId()>
		{
	//*   2    4:tableswitch     1 12: default 68
	//	               1 226
	//	               2 226
	//	               3 186
	//	               4 68
	//	               5 226
	//	               6 165
	//	               7 127
	//	               8 91
	//	               9 87
	//	               10 83
	//	               11 81
	//	               12 76
		case 4: // '\004'
		default:
			return deserializationcontext.handleUnexpectedToken(java/lang/Object, jsonparser);
	//    3   68:aload_2         
	//    4   69:ldc1            #34  <Class Object>
	//    5   71:aload_1         
	//    6   72:invokevirtual   #129 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//    7   75:areturn         

		case 12: // '\f'
			return jsonparser.getEmbeddedObject();
	//    8   76:aload_1         
	//    9   77:invokevirtual   #133 <Method Object JsonParser.getEmbeddedObject()>
	//   10   80:areturn         

		case 11: // '\013'
			return ((Object) (null));
	//   11   81:aconst_null     
	//   12   82:areturn         

		case 10: // '\n'
			return ((Object) (Boolean.FALSE));
	//   13   83:getstatic       #91  <Field Boolean Boolean.FALSE>
	//   14   86:areturn         

		case 9: // '\t'
			return ((Object) (Boolean.TRUE));
	//   15   87:getstatic       #136 <Field Boolean Boolean.TRUE>
	//   16   90:areturn         

		case 8: // '\b'
			JsonDeserializer jsondeserializer = _numberDeserializer;
	//   17   91:aload_0         
	//   18   92:getfield        #61  <Field JsonDeserializer _numberDeserializer>
	//   19   95:astore_3        
			if(jsondeserializer != null)
	//*  20   96:aload_3         
	//*  21   97:ifnull          107
				return jsondeserializer.deserialize(jsonparser, deserializationcontext);
	//   22  100:aload_3         
	//   23  101:aload_1         
	//   24  102:aload_2         
	//   25  103:invokevirtual   #140 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   26  106:areturn         
			if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
	//*  27  107:aload_2         
	//*  28  108:getstatic       #146 <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
	//*  29  111:invokevirtual   #150 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  30  114:ifeq            122
				return ((Object) (jsonparser.getDecimalValue()));
	//   31  117:aload_1         
	//   32  118:invokevirtual   #154 <Method java.math.BigDecimal JsonParser.getDecimalValue()>
	//   33  121:areturn         
			else
				return ((Object) (jsonparser.getNumberValue()));
	//   34  122:aload_1         
	//   35  123:invokevirtual   #158 <Method Number JsonParser.getNumberValue()>
	//   36  126:areturn         

		case 7: // '\007'
			JsonDeserializer jsondeserializer1 = _numberDeserializer;
	//   37  127:aload_0         
	//   38  128:getfield        #61  <Field JsonDeserializer _numberDeserializer>
	//   39  131:astore_3        
			if(jsondeserializer1 != null)
	//*  40  132:aload_3         
	//*  41  133:ifnull          143
				return jsondeserializer1.deserialize(jsonparser, deserializationcontext);
	//   42  136:aload_3         
	//   43  137:aload_1         
	//   44  138:aload_2         
	//   45  139:invokevirtual   #140 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   46  142:areturn         
			if(deserializationcontext.hasSomeOfFeatures(F_MASK_INT_COERCIONS))
	//*  47  143:aload_2         
	//*  48  144:getstatic       #162 <Field int F_MASK_INT_COERCIONS>
	//*  49  147:invokevirtual   #166 <Method boolean DeserializationContext.hasSomeOfFeatures(int)>
	//*  50  150:ifeq            160
				return _coerceIntegral(jsonparser, deserializationcontext);
	//   51  153:aload_0         
	//   52  154:aload_1         
	//   53  155:aload_2         
	//   54  156:invokevirtual   #169 <Method Object _coerceIntegral(JsonParser, DeserializationContext)>
	//   55  159:areturn         
			else
				return ((Object) (jsonparser.getNumberValue()));
	//   56  160:aload_1         
	//   57  161:invokevirtual   #158 <Method Number JsonParser.getNumberValue()>
	//   58  164:areturn         

		case 6: // '\006'
			JsonDeserializer jsondeserializer2 = _stringDeserializer;
	//   59  165:aload_0         
	//   60  166:getfield        #59  <Field JsonDeserializer _stringDeserializer>
	//   61  169:astore_3        
			if(jsondeserializer2 != null)
	//*  62  170:aload_3         
	//*  63  171:ifnull          181
				return jsondeserializer2.deserialize(jsonparser, deserializationcontext);
	//   64  174:aload_3         
	//   65  175:aload_1         
	//   66  176:aload_2         
	//   67  177:invokevirtual   #140 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   68  180:areturn         
			else
				return ((Object) (jsonparser.getText()));
	//   69  181:aload_1         
	//   70  182:invokevirtual   #173 <Method String JsonParser.getText()>
	//   71  185:areturn         

		case 3: // '\003'
			if(deserializationcontext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY))
	//*  72  186:aload_2         
	//*  73  187:getstatic       #176 <Field DeserializationFeature DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY>
	//*  74  190:invokevirtual   #150 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  75  193:ifeq            203
				return ((Object) (mapArrayToArray(jsonparser, deserializationcontext)));
	//   76  196:aload_0         
	//   77  197:aload_1         
	//   78  198:aload_2         
	//   79  199:invokevirtual   #180 <Method Object[] mapArrayToArray(JsonParser, DeserializationContext)>
	//   80  202:areturn         
			JsonDeserializer jsondeserializer3 = _listDeserializer;
	//   81  203:aload_0         
	//   82  204:getfield        #57  <Field JsonDeserializer _listDeserializer>
	//   83  207:astore_3        
			if(jsondeserializer3 != null)
	//*  84  208:aload_3         
	//*  85  209:ifnull          219
				return jsondeserializer3.deserialize(jsonparser, deserializationcontext);
	//   86  212:aload_3         
	//   87  213:aload_1         
	//   88  214:aload_2         
	//   89  215:invokevirtual   #140 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   90  218:areturn         
			else
				return mapArray(jsonparser, deserializationcontext);
	//   91  219:aload_0         
	//   92  220:aload_1         
	//   93  221:aload_2         
	//   94  222:invokevirtual   #183 <Method Object mapArray(JsonParser, DeserializationContext)>
	//   95  225:areturn         

		case 1: // '\001'
		case 2: // '\002'
		case 5: // '\005'
			jsondeserializer4 = _mapDeserializer;
	//   96  226:aload_0         
	//   97  227:getfield        #55  <Field JsonDeserializer _mapDeserializer>
	//   98  230:astore_3        
			break;
		}
		if(jsondeserializer4 != null)
	//*  99  231:aload_3         
	//* 100  232:ifnull          242
			return jsondeserializer4.deserialize(jsonparser, deserializationcontext);
	//  101  235:aload_3         
	//  102  236:aload_1         
	//  103  237:aload_2         
	//  104  238:invokevirtual   #140 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//  105  241:areturn         
		else
			return mapObject(jsonparser, deserializationcontext);
	//  106  242:aload_0         
	//  107  243:aload_1         
	//  108  244:aload_2         
	//  109  245:invokevirtual   #186 <Method Object mapObject(JsonParser, DeserializationContext)>
	//  110  248:areturn         
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(_nonMerging)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean _nonMerging>
	//*   2    4:ifeq            14
			return deserialize(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #188 <Method Object deserialize(JsonParser, DeserializationContext)>
	//    7   13:areturn         
		JsonDeserializer jsondeserializer4;
		switch(jsonparser.getCurrentTokenId())
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #125 <Method int JsonParser.getCurrentTokenId()>
		{
	//*  10   18:tableswitch     1 12: default 80
	//	               1 271
	//	               2 271
	//	               3 209
	//	               4 80
	//	               5 271
	//	               6 184
	//	               7 142
	//	               8 102
	//	               9 98
	//	               10 94
	//	               11 92
	//	               12 87
		case 4: // '\004'
		default:
			return deserialize(jsonparser, deserializationcontext);
	//   11   80:aload_0         
	//   12   81:aload_1         
	//   13   82:aload_2         
	//   14   83:invokevirtual   #188 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   15   86:areturn         

		case 12: // '\f'
			return jsonparser.getEmbeddedObject();
	//   16   87:aload_1         
	//   17   88:invokevirtual   #133 <Method Object JsonParser.getEmbeddedObject()>
	//   18   91:areturn         

		case 11: // '\013'
			return ((Object) (null));
	//   19   92:aconst_null     
	//   20   93:areturn         

		case 10: // '\n'
			return ((Object) (Boolean.FALSE));
	//   21   94:getstatic       #91  <Field Boolean Boolean.FALSE>
	//   22   97:areturn         

		case 9: // '\t'
			return ((Object) (Boolean.TRUE));
	//   23   98:getstatic       #136 <Field Boolean Boolean.TRUE>
	//   24  101:areturn         

		case 8: // '\b'
			JsonDeserializer jsondeserializer = _numberDeserializer;
	//   25  102:aload_0         
	//   26  103:getfield        #61  <Field JsonDeserializer _numberDeserializer>
	//   27  106:astore          4
			if(jsondeserializer != null)
	//*  28  108:aload           4
	//*  29  110:ifnull          122
				return jsondeserializer.deserialize(jsonparser, deserializationcontext, obj);
	//   30  113:aload           4
	//   31  115:aload_1         
	//   32  116:aload_2         
	//   33  117:aload_3         
	//   34  118:invokevirtual   #190 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//   35  121:areturn         
			if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
	//*  36  122:aload_2         
	//*  37  123:getstatic       #146 <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
	//*  38  126:invokevirtual   #150 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  39  129:ifeq            137
				return ((Object) (jsonparser.getDecimalValue()));
	//   40  132:aload_1         
	//   41  133:invokevirtual   #154 <Method java.math.BigDecimal JsonParser.getDecimalValue()>
	//   42  136:areturn         
			else
				return ((Object) (jsonparser.getNumberValue()));
	//   43  137:aload_1         
	//   44  138:invokevirtual   #158 <Method Number JsonParser.getNumberValue()>
	//   45  141:areturn         

		case 7: // '\007'
			JsonDeserializer jsondeserializer1 = _numberDeserializer;
	//   46  142:aload_0         
	//   47  143:getfield        #61  <Field JsonDeserializer _numberDeserializer>
	//   48  146:astore          4
			if(jsondeserializer1 != null)
	//*  49  148:aload           4
	//*  50  150:ifnull          162
				return jsondeserializer1.deserialize(jsonparser, deserializationcontext, obj);
	//   51  153:aload           4
	//   52  155:aload_1         
	//   53  156:aload_2         
	//   54  157:aload_3         
	//   55  158:invokevirtual   #190 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//   56  161:areturn         
			if(deserializationcontext.hasSomeOfFeatures(F_MASK_INT_COERCIONS))
	//*  57  162:aload_2         
	//*  58  163:getstatic       #162 <Field int F_MASK_INT_COERCIONS>
	//*  59  166:invokevirtual   #166 <Method boolean DeserializationContext.hasSomeOfFeatures(int)>
	//*  60  169:ifeq            179
				return _coerceIntegral(jsonparser, deserializationcontext);
	//   61  172:aload_0         
	//   62  173:aload_1         
	//   63  174:aload_2         
	//   64  175:invokevirtual   #169 <Method Object _coerceIntegral(JsonParser, DeserializationContext)>
	//   65  178:areturn         
			else
				return ((Object) (jsonparser.getNumberValue()));
	//   66  179:aload_1         
	//   67  180:invokevirtual   #158 <Method Number JsonParser.getNumberValue()>
	//   68  183:areturn         

		case 6: // '\006'
			JsonDeserializer jsondeserializer2 = _stringDeserializer;
	//   69  184:aload_0         
	//   70  185:getfield        #59  <Field JsonDeserializer _stringDeserializer>
	//   71  188:astore          4
			if(jsondeserializer2 != null)
	//*  72  190:aload           4
	//*  73  192:ifnull          204
				return jsondeserializer2.deserialize(jsonparser, deserializationcontext, obj);
	//   74  195:aload           4
	//   75  197:aload_1         
	//   76  198:aload_2         
	//   77  199:aload_3         
	//   78  200:invokevirtual   #190 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//   79  203:areturn         
			else
				return ((Object) (jsonparser.getText()));
	//   80  204:aload_1         
	//   81  205:invokevirtual   #173 <Method String JsonParser.getText()>
	//   82  208:areturn         

		case 3: // '\003'
			JsonDeserializer jsondeserializer3 = _listDeserializer;
	//   83  209:aload_0         
	//   84  210:getfield        #57  <Field JsonDeserializer _listDeserializer>
	//   85  213:astore          4
			if(jsondeserializer3 != null)
	//*  86  215:aload           4
	//*  87  217:ifnull          229
				return jsondeserializer3.deserialize(jsonparser, deserializationcontext, obj);
	//   88  220:aload           4
	//   89  222:aload_1         
	//   90  223:aload_2         
	//   91  224:aload_3         
	//   92  225:invokevirtual   #190 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//   93  228:areturn         
			if(obj instanceof Collection)
	//*  94  229:aload_3         
	//*  95  230:instanceof      #192 <Class Collection>
	//*  96  233:ifeq            247
				return mapArray(jsonparser, deserializationcontext, (Collection)obj);
	//   97  236:aload_0         
	//   98  237:aload_1         
	//   99  238:aload_2         
	//  100  239:aload_3         
	//  101  240:checkcast       #192 <Class Collection>
	//  102  243:invokevirtual   #195 <Method Object mapArray(JsonParser, DeserializationContext, Collection)>
	//  103  246:areturn         
			if(deserializationcontext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY))
	//* 104  247:aload_2         
	//* 105  248:getstatic       #176 <Field DeserializationFeature DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY>
	//* 106  251:invokevirtual   #150 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//* 107  254:ifeq            264
				return ((Object) (mapArrayToArray(jsonparser, deserializationcontext)));
	//  108  257:aload_0         
	//  109  258:aload_1         
	//  110  259:aload_2         
	//  111  260:invokevirtual   #180 <Method Object[] mapArrayToArray(JsonParser, DeserializationContext)>
	//  112  263:areturn         
			else
				return mapArray(jsonparser, deserializationcontext);
	//  113  264:aload_0         
	//  114  265:aload_1         
	//  115  266:aload_2         
	//  116  267:invokevirtual   #183 <Method Object mapArray(JsonParser, DeserializationContext)>
	//  117  270:areturn         

		case 1: // '\001'
		case 2: // '\002'
		case 5: // '\005'
			jsondeserializer4 = _mapDeserializer;
	//  118  271:aload_0         
	//  119  272:getfield        #55  <Field JsonDeserializer _mapDeserializer>
	//  120  275:astore          4
			break;
		}
		if(jsondeserializer4 != null)
	//* 121  277:aload           4
	//* 122  279:ifnull          291
			return jsondeserializer4.deserialize(jsonparser, deserializationcontext, obj);
	//  123  282:aload           4
	//  124  284:aload_1         
	//  125  285:aload_2         
	//  126  286:aload_3         
	//  127  287:invokevirtual   #190 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//  128  290:areturn         
		if(obj instanceof Map)
	//* 129  291:aload_3         
	//* 130  292:instanceof      #197 <Class Map>
	//* 131  295:ifeq            309
			return mapObject(jsonparser, deserializationcontext, (Map)obj);
	//  132  298:aload_0         
	//  133  299:aload_1         
	//  134  300:aload_2         
	//  135  301:aload_3         
	//  136  302:checkcast       #197 <Class Map>
	//  137  305:invokevirtual   #200 <Method Object mapObject(JsonParser, DeserializationContext, Map)>
	//  138  308:areturn         
		else
			return mapObject(jsonparser, deserializationcontext);
	//  139  309:aload_0         
	//  140  310:aload_1         
	//  141  311:aload_2         
	//  142  312:invokevirtual   #186 <Method Object mapObject(JsonParser, DeserializationContext)>
	//  143  315:areturn         
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		int i = jsonparser.getCurrentTokenId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #125 <Method int JsonParser.getCurrentTokenId()>
	//    2    4:istore          4
		if(i != 1 && i != 3)
	//*   3    6:iload           4
	//*   4    8:iconst_1        
	//*   5    9:icmpeq          186
	//*   6   12:iload           4
	//*   7   14:iconst_3        
	//*   8   15:icmpeq          186
			switch(i)
	//*   9   18:iload           4
			{
	//*  10   20:tableswitch     5 12: default 68
	//	               5 186
	//	               6 165
	//	               7 127
	//	               8 91
	//	               9 87
	//	               10 83
	//	               11 81
	//	               12 76
			default:
				return deserializationcontext.handleUnexpectedToken(java/lang/Object, jsonparser);
	//   11   68:aload_2         
	//   12   69:ldc1            #34  <Class Object>
	//   13   71:aload_1         
	//   14   72:invokevirtual   #129 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   15   75:areturn         

			case 12: // '\f'
				return jsonparser.getEmbeddedObject();
	//   16   76:aload_1         
	//   17   77:invokevirtual   #133 <Method Object JsonParser.getEmbeddedObject()>
	//   18   80:areturn         

			case 11: // '\013'
				return ((Object) (null));
	//   19   81:aconst_null     
	//   20   82:areturn         

			case 10: // '\n'
				return ((Object) (Boolean.FALSE));
	//   21   83:getstatic       #91  <Field Boolean Boolean.FALSE>
	//   22   86:areturn         

			case 9: // '\t'
				return ((Object) (Boolean.TRUE));
	//   23   87:getstatic       #136 <Field Boolean Boolean.TRUE>
	//   24   90:areturn         

			case 8: // '\b'
				typedeserializer = ((TypeDeserializer) (_numberDeserializer));
	//   25   91:aload_0         
	//   26   92:getfield        #61  <Field JsonDeserializer _numberDeserializer>
	//   27   95:astore_3        
				if(typedeserializer != null)
	//*  28   96:aload_3         
	//*  29   97:ifnull          107
					return ((JsonDeserializer) (typedeserializer)).deserialize(jsonparser, deserializationcontext);
	//   30  100:aload_3         
	//   31  101:aload_1         
	//   32  102:aload_2         
	//   33  103:invokevirtual   #140 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   34  106:areturn         
				if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
	//*  35  107:aload_2         
	//*  36  108:getstatic       #146 <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
	//*  37  111:invokevirtual   #150 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  38  114:ifeq            122
					return ((Object) (jsonparser.getDecimalValue()));
	//   39  117:aload_1         
	//   40  118:invokevirtual   #154 <Method java.math.BigDecimal JsonParser.getDecimalValue()>
	//   41  121:areturn         
				else
					return ((Object) (jsonparser.getNumberValue()));
	//   42  122:aload_1         
	//   43  123:invokevirtual   #158 <Method Number JsonParser.getNumberValue()>
	//   44  126:areturn         

			case 7: // '\007'
				typedeserializer = ((TypeDeserializer) (_numberDeserializer));
	//   45  127:aload_0         
	//   46  128:getfield        #61  <Field JsonDeserializer _numberDeserializer>
	//   47  131:astore_3        
				if(typedeserializer != null)
	//*  48  132:aload_3         
	//*  49  133:ifnull          143
					return ((JsonDeserializer) (typedeserializer)).deserialize(jsonparser, deserializationcontext);
	//   50  136:aload_3         
	//   51  137:aload_1         
	//   52  138:aload_2         
	//   53  139:invokevirtual   #140 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   54  142:areturn         
				if(deserializationcontext.hasSomeOfFeatures(F_MASK_INT_COERCIONS))
	//*  55  143:aload_2         
	//*  56  144:getstatic       #162 <Field int F_MASK_INT_COERCIONS>
	//*  57  147:invokevirtual   #166 <Method boolean DeserializationContext.hasSomeOfFeatures(int)>
	//*  58  150:ifeq            160
					return _coerceIntegral(jsonparser, deserializationcontext);
	//   59  153:aload_0         
	//   60  154:aload_1         
	//   61  155:aload_2         
	//   62  156:invokevirtual   #169 <Method Object _coerceIntegral(JsonParser, DeserializationContext)>
	//   63  159:areturn         
				else
					return ((Object) (jsonparser.getNumberValue()));
	//   64  160:aload_1         
	//   65  161:invokevirtual   #158 <Method Number JsonParser.getNumberValue()>
	//   66  164:areturn         

			case 6: // '\006'
				typedeserializer = ((TypeDeserializer) (_stringDeserializer));
	//   67  165:aload_0         
	//   68  166:getfield        #59  <Field JsonDeserializer _stringDeserializer>
	//   69  169:astore_3        
				if(typedeserializer != null)
	//*  70  170:aload_3         
	//*  71  171:ifnull          181
					return ((JsonDeserializer) (typedeserializer)).deserialize(jsonparser, deserializationcontext);
	//   72  174:aload_3         
	//   73  175:aload_1         
	//   74  176:aload_2         
	//   75  177:invokevirtual   #140 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   76  180:areturn         
				else
					return ((Object) (jsonparser.getText()));
	//   77  181:aload_1         
	//   78  182:invokevirtual   #173 <Method String JsonParser.getText()>
	//   79  185:areturn         

			case 5: // '\005'
				break;
			}
		return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
	//   80  186:aload_3         
	//   81  187:aload_1         
	//   82  188:aload_2         
	//   83  189:invokevirtual   #207 <Method Object TypeDeserializer.deserializeTypedFromAny(JsonParser, DeserializationContext)>
	//   84  192:areturn         
	}

	public boolean isCachable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected Object mapArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj = ((Object) (jsonparser.nextToken()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #213 <Method JsonToken JsonParser.nextToken()>
	//    2    4:astore          6
		JsonToken jsontoken = JsonToken.END_ARRAY;
	//    3    6:getstatic       #219 <Field JsonToken JsonToken.END_ARRAY>
	//    4    9:astore          7
		int j = 2;
	//    5   11:iconst_2        
	//    6   12:istore          4
		if(obj == jsontoken)
	//*   7   14:aload           6
	//*   8   16:aload           7
	//*   9   18:if_acmpne       30
			return ((Object) (new ArrayList(2)));
	//   10   21:new             #221 <Class ArrayList>
	//   11   24:dup             
	//   12   25:iconst_2        
	//   13   26:invokespecial   #224 <Method void ArrayList(int)>
	//   14   29:areturn         
		obj = deserialize(jsonparser, deserializationcontext);
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:aload_2         
	//   18   33:invokevirtual   #188 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   19   36:astore          6
		if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*  20   38:aload_1         
	//*  21   39:invokevirtual   #213 <Method JsonToken JsonParser.nextToken()>
	//*  22   42:getstatic       #219 <Field JsonToken JsonToken.END_ARRAY>
	//*  23   45:if_acmpne       66
		{
			jsonparser = ((JsonParser) (new ArrayList(2)));
	//   24   48:new             #221 <Class ArrayList>
	//   25   51:dup             
	//   26   52:iconst_2        
	//   27   53:invokespecial   #224 <Method void ArrayList(int)>
	//   28   56:astore_1        
			((ArrayList) (jsonparser)).add(obj);
	//   29   57:aload_1         
	//   30   58:aload           6
	//   31   60:invokevirtual   #227 <Method boolean ArrayList.add(Object)>
	//   32   63:pop             
			return ((Object) (jsonparser));
	//   33   64:aload_1         
	//   34   65:areturn         
		}
		Object obj1 = deserialize(jsonparser, deserializationcontext);
	//   35   66:aload_0         
	//   36   67:aload_1         
	//   37   68:aload_2         
	//   38   69:invokevirtual   #188 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   39   72:astore          9
		if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*  40   74:aload_1         
	//*  41   75:invokevirtual   #213 <Method JsonToken JsonParser.nextToken()>
	//*  42   78:getstatic       #219 <Field JsonToken JsonToken.END_ARRAY>
	//*  43   81:if_acmpne       109
		{
			jsonparser = ((JsonParser) (new ArrayList(2)));
	//   44   84:new             #221 <Class ArrayList>
	//   45   87:dup             
	//   46   88:iconst_2        
	//   47   89:invokespecial   #224 <Method void ArrayList(int)>
	//   48   92:astore_1        
			((ArrayList) (jsonparser)).add(obj);
	//   49   93:aload_1         
	//   50   94:aload           6
	//   51   96:invokevirtual   #227 <Method boolean ArrayList.add(Object)>
	//   52   99:pop             
			((ArrayList) (jsonparser)).add(obj1);
	//   53  100:aload_1         
	//   54  101:aload           9
	//   55  103:invokevirtual   #227 <Method boolean ArrayList.add(Object)>
	//   56  106:pop             
			return ((Object) (jsonparser));
	//   57  107:aload_1         
	//   58  108:areturn         
		}
		ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
	//   59  109:aload_2         
	//   60  110:invokevirtual   #231 <Method ObjectBuffer DeserializationContext.leaseObjectBuffer()>
	//   61  113:astore          8
		Object aobj1[] = objectbuffer.resetAndStart();
	//   62  115:aload           8
	//   63  117:invokevirtual   #237 <Method Object[] ObjectBuffer.resetAndStart()>
	//   64  120:astore          7
		aobj1[0] = obj;
	//   65  122:aload           7
	//   66  124:iconst_0        
	//   67  125:aload           6
	//   68  127:aastore         
		aobj1[1] = obj1;
	//   69  128:aload           7
	//   70  130:iconst_1        
	//   71  131:aload           9
	//   72  133:aastore         
		int i = 2;
	//   73  134:iconst_2        
	//   74  135:istore_3        
		do
		{
			Object obj2 = deserialize(jsonparser, deserializationcontext);
	//   75  136:aload_0         
	//   76  137:aload_1         
	//   77  138:aload_2         
	//   78  139:invokevirtual   #188 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   79  142:astore          9
			int k = j + 1;
	//   80  144:iload           4
	//   81  146:iconst_1        
	//   82  147:iadd            
	//   83  148:istore          5
			j = i;
	//   84  150:iload_3         
	//   85  151:istore          4
			Object aobj[] = aobj1;
	//   86  153:aload           7
	//   87  155:astore          6
			if(i >= aobj1.length)
	//*  88  157:iload_3         
	//*  89  158:aload           7
	//*  90  160:arraylength     
	//*  91  161:icmplt          176
			{
				aobj = objectbuffer.appendCompletedChunk(aobj1);
	//   92  164:aload           8
	//   93  166:aload           7
	//   94  168:invokevirtual   #241 <Method Object[] ObjectBuffer.appendCompletedChunk(Object[])>
	//   95  171:astore          6
				j = 0;
	//   96  173:iconst_0        
	//   97  174:istore          4
			}
			i = j + 1;
	//   98  176:iload           4
	//   99  178:iconst_1        
	//  100  179:iadd            
	//  101  180:istore_3        
			aobj[j] = obj2;
	//  102  181:aload           6
	//  103  183:iload           4
	//  104  185:aload           9
	//  105  187:aastore         
			if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//* 106  188:aload_1         
	//* 107  189:invokevirtual   #213 <Method JsonToken JsonParser.nextToken()>
	//* 108  192:getstatic       #219 <Field JsonToken JsonToken.END_ARRAY>
	//* 109  195:if_acmpne       219
			{
				jsonparser = ((JsonParser) (new ArrayList(k)));
	//  110  198:new             #221 <Class ArrayList>
	//  111  201:dup             
	//  112  202:iload           5
	//  113  204:invokespecial   #224 <Method void ArrayList(int)>
	//  114  207:astore_1        
				objectbuffer.completeAndClearBuffer(aobj, i, ((List) (jsonparser)));
	//  115  208:aload           8
	//  116  210:aload           6
	//  117  212:iload_3         
	//  118  213:aload_1         
	//  119  214:invokevirtual   #245 <Method void ObjectBuffer.completeAndClearBuffer(Object[], int, List)>
				return ((Object) (jsonparser));
	//  120  217:aload_1         
	//  121  218:areturn         
			}
			j = k;
	//  122  219:iload           5
	//  123  221:istore          4
			aobj1 = aobj;
	//  124  223:aload           6
	//  125  225:astore          7
		} while(true);
	//  126  227:goto            136
	}

	protected Object mapArray(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
		throws IOException
	{
		for(; jsonparser.nextToken() != JsonToken.END_ARRAY; collection.add(deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #213 <Method JsonToken JsonParser.nextToken()>
	//    2    4:getstatic       #219 <Field JsonToken JsonToken.END_ARRAY>
	//    3    7:if_acmpeq       26
	//    4   10:aload_3         
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #188 <Method Object deserialize(JsonParser, DeserializationContext)>
	//    9   17:invokeinterface #246 <Method boolean Collection.add(Object)>
	//   10   22:pop             
	//*  11   23:goto            0
		return ((Object) (collection));
	//   12   26:aload_3         
	//   13   27:areturn         
	}

	protected Object[] mapArrayToArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #213 <Method JsonToken JsonParser.nextToken()>
	//*   2    4:getstatic       #219 <Field JsonToken JsonToken.END_ARRAY>
	//*   3    7:if_acmpne       14
			return NO_OBJECTS;
	//    4   10:getstatic       #36  <Field Object[] NO_OBJECTS>
	//    5   13:areturn         
		ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
	//    6   14:aload_2         
	//    7   15:invokevirtual   #231 <Method ObjectBuffer DeserializationContext.leaseObjectBuffer()>
	//    8   18:astore          7
		Object aobj[] = objectbuffer.resetAndStart();
	//    9   20:aload           7
	//   10   22:invokevirtual   #237 <Method Object[] ObjectBuffer.resetAndStart()>
	//   11   25:astore          5
		int i = 0;
	//   12   27:iconst_0        
	//   13   28:istore_3        
		do
		{
			Object obj = deserialize(jsonparser, deserializationcontext);
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:aload_2         
	//   17   32:invokevirtual   #188 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   18   35:astore          8
			int j = i;
	//   19   37:iload_3         
	//   20   38:istore          4
			Object aobj1[] = aobj;
	//   21   40:aload           5
	//   22   42:astore          6
			if(i >= aobj.length)
	//*  23   44:iload_3         
	//*  24   45:aload           5
	//*  25   47:arraylength     
	//*  26   48:icmplt          63
			{
				aobj1 = objectbuffer.appendCompletedChunk(aobj);
	//   27   51:aload           7
	//   28   53:aload           5
	//   29   55:invokevirtual   #241 <Method Object[] ObjectBuffer.appendCompletedChunk(Object[])>
	//   30   58:astore          6
				j = 0;
	//   31   60:iconst_0        
	//   32   61:istore          4
			}
			i = j + 1;
	//   33   63:iload           4
	//   34   65:iconst_1        
	//   35   66:iadd            
	//   36   67:istore_3        
			aobj1[j] = obj;
	//   37   68:aload           6
	//   38   70:iload           4
	//   39   72:aload           8
	//   40   74:aastore         
			if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*  41   75:aload_1         
	//*  42   76:invokevirtual   #213 <Method JsonToken JsonParser.nextToken()>
	//*  43   79:getstatic       #219 <Field JsonToken JsonToken.END_ARRAY>
	//*  44   82:if_acmpne       94
				return objectbuffer.completeAndClearBuffer(aobj1, i);
	//   45   85:aload           7
	//   46   87:aload           6
	//   47   89:iload_3         
	//   48   90:invokevirtual   #250 <Method Object[] ObjectBuffer.completeAndClearBuffer(Object[], int)>
	//   49   93:areturn         
			aobj = aobj1;
	//   50   94:aload           6
	//   51   96:astore          5
		} while(true);
	//   52   98:goto            29
	}

	protected Object mapObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj = ((Object) (jsonparser.getCurrentToken()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #253 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore_3        
		if(obj == JsonToken.START_OBJECT)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #256 <Field JsonToken JsonToken.START_OBJECT>
	//*   5    9:if_acmpne       20
			obj = ((Object) (jsonparser.nextFieldName()));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #259 <Method String JsonParser.nextFieldName()>
	//    8   16:astore_3        
		else
	//*   9   17:goto            54
		if(obj == JsonToken.FIELD_NAME)
	//*  10   20:aload_3         
	//*  11   21:getstatic       #262 <Field JsonToken JsonToken.FIELD_NAME>
	//*  12   24:if_acmpne       35
		{
			obj = ((Object) (jsonparser.getCurrentName()));
	//   13   27:aload_1         
	//   14   28:invokevirtual   #265 <Method String JsonParser.getCurrentName()>
	//   15   31:astore_3        
		} else
	//*  16   32:goto            54
		{
			if(obj != JsonToken.END_OBJECT)
	//*  17   35:aload_3         
	//*  18   36:getstatic       #268 <Field JsonToken JsonToken.END_OBJECT>
	//*  19   39:if_acmpeq       52
				return deserializationcontext.handleUnexpectedToken(handledType(), jsonparser);
	//   20   42:aload_2         
	//   21   43:aload_0         
	//   22   44:invokevirtual   #271 <Method Class handledType()>
	//   23   47:aload_1         
	//   24   48:invokevirtual   #129 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   25   51:areturn         
			obj = null;
	//   26   52:aconst_null     
	//   27   53:astore_3        
		}
		if(obj == null)
	//*  28   54:aload_3         
	//*  29   55:ifnonnull       67
			return ((Object) (new LinkedHashMap(2)));
	//   30   58:new             #273 <Class LinkedHashMap>
	//   31   61:dup             
	//   32   62:iconst_2        
	//   33   63:invokespecial   #274 <Method void LinkedHashMap(int)>
	//   34   66:areturn         
		jsonparser.nextToken();
	//   35   67:aload_1         
	//   36   68:invokevirtual   #213 <Method JsonToken JsonParser.nextToken()>
	//   37   71:pop             
		Object obj1 = deserialize(jsonparser, deserializationcontext);
	//   38   72:aload_0         
	//   39   73:aload_1         
	//   40   74:aload_2         
	//   41   75:invokevirtual   #188 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   42   78:astore          5
		String s1 = jsonparser.nextFieldName();
	//   43   80:aload_1         
	//   44   81:invokevirtual   #259 <Method String JsonParser.nextFieldName()>
	//   45   84:astore          7
		if(s1 == null)
	//*  46   86:aload           7
	//*  47   88:ifnonnull       110
		{
			jsonparser = ((JsonParser) (new LinkedHashMap(2)));
	//   48   91:new             #273 <Class LinkedHashMap>
	//   49   94:dup             
	//   50   95:iconst_2        
	//   51   96:invokespecial   #274 <Method void LinkedHashMap(int)>
	//   52   99:astore_1        
			((LinkedHashMap) (jsonparser)).put(obj, obj1);
	//   53  100:aload_1         
	//   54  101:aload_3         
	//   55  102:aload           5
	//   56  104:invokevirtual   #278 <Method Object LinkedHashMap.put(Object, Object)>
	//   57  107:pop             
			return ((Object) (jsonparser));
	//   58  108:aload_1         
	//   59  109:areturn         
		}
		jsonparser.nextToken();
	//   60  110:aload_1         
	//   61  111:invokevirtual   #213 <Method JsonToken JsonParser.nextToken()>
	//   62  114:pop             
		Object obj2 = deserialize(jsonparser, deserializationcontext);
	//   63  115:aload_0         
	//   64  116:aload_1         
	//   65  117:aload_2         
	//   66  118:invokevirtual   #188 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   67  121:astore          8
		String s = jsonparser.nextFieldName();
	//   68  123:aload_1         
	//   69  124:invokevirtual   #259 <Method String JsonParser.nextFieldName()>
	//   70  127:astore          4
		if(s == null)
	//*  71  129:aload           4
	//*  72  131:ifnonnull       162
		{
			jsonparser = ((JsonParser) (new LinkedHashMap(4)));
	//   73  134:new             #273 <Class LinkedHashMap>
	//   74  137:dup             
	//   75  138:iconst_4        
	//   76  139:invokespecial   #274 <Method void LinkedHashMap(int)>
	//   77  142:astore_1        
			((LinkedHashMap) (jsonparser)).put(obj, obj1);
	//   78  143:aload_1         
	//   79  144:aload_3         
	//   80  145:aload           5
	//   81  147:invokevirtual   #278 <Method Object LinkedHashMap.put(Object, Object)>
	//   82  150:pop             
			((LinkedHashMap) (jsonparser)).put(((Object) (s1)), obj2);
	//   83  151:aload_1         
	//   84  152:aload           7
	//   85  154:aload           8
	//   86  156:invokevirtual   #278 <Method Object LinkedHashMap.put(Object, Object)>
	//   87  159:pop             
			return ((Object) (jsonparser));
	//   88  160:aload_1         
	//   89  161:areturn         
		}
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//   90  162:new             #273 <Class LinkedHashMap>
	//   91  165:dup             
	//   92  166:invokespecial   #280 <Method void LinkedHashMap()>
	//   93  169:astore          6
		linkedhashmap.put(obj, obj1);
	//   94  171:aload           6
	//   95  173:aload_3         
	//   96  174:aload           5
	//   97  176:invokevirtual   #278 <Method Object LinkedHashMap.put(Object, Object)>
	//   98  179:pop             
		linkedhashmap.put(((Object) (s1)), obj2);
	//   99  180:aload           6
	//  100  182:aload           7
	//  101  184:aload           8
	//  102  186:invokevirtual   #278 <Method Object LinkedHashMap.put(Object, Object)>
	//  103  189:pop             
		obj = ((Object) (s));
	//  104  190:aload           4
	//  105  192:astore_3        
		do
		{
			jsonparser.nextToken();
	//  106  193:aload_1         
	//  107  194:invokevirtual   #213 <Method JsonToken JsonParser.nextToken()>
	//  108  197:pop             
			linkedhashmap.put(obj, deserialize(jsonparser, deserializationcontext));
	//  109  198:aload           6
	//  110  200:aload_3         
	//  111  201:aload_0         
	//  112  202:aload_1         
	//  113  203:aload_2         
	//  114  204:invokevirtual   #188 <Method Object deserialize(JsonParser, DeserializationContext)>
	//  115  207:invokevirtual   #278 <Method Object LinkedHashMap.put(Object, Object)>
	//  116  210:pop             
			s = jsonparser.nextFieldName();
	//  117  211:aload_1         
	//  118  212:invokevirtual   #259 <Method String JsonParser.nextFieldName()>
	//  119  215:astore          4
			obj = ((Object) (s));
	//  120  217:aload           4
	//  121  219:astore_3        
		} while(s != null);
	//  122  220:aload           4
	//  123  222:ifnonnull       193
		return ((Object) (linkedhashmap));
	//  124  225:aload           6
	//  125  227:areturn         
	}

	protected Object mapObject(JsonParser jsonparser, DeserializationContext deserializationcontext, Map map)
		throws IOException
	{
		Object obj1 = ((Object) (jsonparser.getCurrentToken()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #253 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          5
		Object obj = obj1;
	//    3    6:aload           5
	//    4    8:astore          4
		if(obj1 == JsonToken.START_OBJECT)
	//*   5   10:aload           5
	//*   6   12:getstatic       #256 <Field JsonToken JsonToken.START_OBJECT>
	//*   7   15:if_acmpne       24
			obj = ((Object) (jsonparser.nextToken()));
	//    8   18:aload_1         
	//    9   19:invokevirtual   #213 <Method JsonToken JsonParser.nextToken()>
	//   10   22:astore          4
		if(obj == JsonToken.END_OBJECT)
	//*  11   24:aload           4
	//*  12   26:getstatic       #268 <Field JsonToken JsonToken.END_OBJECT>
	//*  13   29:if_acmpne       34
			return ((Object) (map));
	//   14   32:aload_3         
	//   15   33:areturn         
		obj = ((Object) (jsonparser.getCurrentName()));
	//   16   34:aload_1         
	//   17   35:invokevirtual   #265 <Method String JsonParser.getCurrentName()>
	//   18   38:astore          4
		do
		{
			jsonparser.nextToken();
	//   19   40:aload_1         
	//   20   41:invokevirtual   #213 <Method JsonToken JsonParser.nextToken()>
	//   21   44:pop             
			Object obj2 = map.get(obj);
	//   22   45:aload_3         
	//   23   46:aload           4
	//   24   48:invokeinterface #284 <Method Object Map.get(Object)>
	//   25   53:astore          6
			if(obj2 != null)
	//*  26   55:aload           6
	//*  27   57:ifnull          73
				obj1 = deserialize(jsonparser, deserializationcontext, obj2);
	//   28   60:aload_0         
	//   29   61:aload_1         
	//   30   62:aload_2         
	//   31   63:aload           6
	//   32   65:invokevirtual   #285 <Method Object deserialize(JsonParser, DeserializationContext, Object)>
	//   33   68:astore          5
			else
	//*  34   70:goto            81
				obj1 = deserialize(jsonparser, deserializationcontext);
	//   35   73:aload_0         
	//   36   74:aload_1         
	//   37   75:aload_2         
	//   38   76:invokevirtual   #188 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   39   79:astore          5
			if(obj1 != obj2)
	//*  40   81:aload           5
	//*  41   83:aload           6
	//*  42   85:if_acmpeq       99
				map.put(obj, obj1);
	//   43   88:aload_3         
	//   44   89:aload           4
	//   45   91:aload           5
	//   46   93:invokeinterface #286 <Method Object Map.put(Object, Object)>
	//   47   98:pop             
			obj1 = ((Object) (jsonparser.nextFieldName()));
	//   48   99:aload_1         
	//   49  100:invokevirtual   #259 <Method String JsonParser.nextFieldName()>
	//   50  103:astore          5
			obj = obj1;
	//   51  105:aload           5
	//   52  107:astore          4
		} while(obj1 != null);
	//   53  109:aload           5
	//   54  111:ifnonnull       40
		return ((Object) (map));
	//   55  114:aload_3         
	//   56  115:areturn         
	}

	public void resolve(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		JavaType javatype = deserializationcontext.constructType(java/lang/Object);
	//    0    0:aload_1         
	//    1    1:ldc1            #34  <Class Object>
	//    2    3:invokevirtual   #293 <Method JavaType DeserializationContext.constructType(Class)>
	//    3    6:astore_2        
		JavaType javatype1 = deserializationcontext.constructType(java/lang/String);
	//    4    7:aload_1         
	//    5    8:ldc2            #295 <Class String>
	//    6   11:invokevirtual   #293 <Method JavaType DeserializationContext.constructType(Class)>
	//    7   14:astore_3        
		TypeFactory typefactory = deserializationcontext.getTypeFactory();
	//    8   15:aload_1         
	//    9   16:invokevirtual   #299 <Method TypeFactory DeserializationContext.getTypeFactory()>
	//   10   19:astore          4
		JavaType javatype2 = _listType;
	//   11   21:aload_0         
	//   12   22:getfield        #48  <Field JavaType _listType>
	//   13   25:astore          5
		if(javatype2 == null)
	//*  14   27:aload           5
	//*  15   29:ifnonnull       57
			_listDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationcontext, ((JavaType) (typefactory.constructCollectionType(java/util/List, javatype)))));
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:aload           4
	//   21   38:ldc2            #301 <Class List>
	//   22   41:aload_2         
	//   23   42:invokevirtual   #307 <Method com.fasterxml.jackson.databind.type.CollectionType TypeFactory.constructCollectionType(Class, JavaType)>
	//   24   45:invokevirtual   #309 <Method JsonDeserializer _findCustomDeser(DeserializationContext, JavaType)>
	//   25   48:invokevirtual   #311 <Method JsonDeserializer _clearIfStdImpl(JsonDeserializer)>
	//   26   51:putfield        #57  <Field JsonDeserializer _listDeserializer>
		else
	//*  27   54:goto            68
			_listDeserializer = _findCustomDeser(deserializationcontext, javatype2);
	//   28   57:aload_0         
	//   29   58:aload_0         
	//   30   59:aload_1         
	//   31   60:aload           5
	//   32   62:invokevirtual   #309 <Method JsonDeserializer _findCustomDeser(DeserializationContext, JavaType)>
	//   33   65:putfield        #57  <Field JsonDeserializer _listDeserializer>
		javatype2 = _mapType;
	//   34   68:aload_0         
	//   35   69:getfield        #50  <Field JavaType _mapType>
	//   36   72:astore          5
		if(javatype2 == null)
	//*  37   74:aload           5
	//*  38   76:ifnonnull       104
			_mapDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationcontext, ((JavaType) (typefactory.constructMapType(java/util/Map, javatype1, javatype)))));
	//   39   79:aload_0         
	//   40   80:aload_0         
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:aload           4
	//   44   85:ldc1            #197 <Class Map>
	//   45   87:aload_3         
	//   46   88:aload_2         
	//   47   89:invokevirtual   #315 <Method com.fasterxml.jackson.databind.type.MapType TypeFactory.constructMapType(Class, JavaType, JavaType)>
	//   48   92:invokevirtual   #309 <Method JsonDeserializer _findCustomDeser(DeserializationContext, JavaType)>
	//   49   95:invokevirtual   #311 <Method JsonDeserializer _clearIfStdImpl(JsonDeserializer)>
	//   50   98:putfield        #55  <Field JsonDeserializer _mapDeserializer>
		else
	//*  51  101:goto            115
			_mapDeserializer = _findCustomDeser(deserializationcontext, javatype2);
	//   52  104:aload_0         
	//   53  105:aload_0         
	//   54  106:aload_1         
	//   55  107:aload           5
	//   56  109:invokevirtual   #309 <Method JsonDeserializer _findCustomDeser(DeserializationContext, JavaType)>
	//   57  112:putfield        #55  <Field JsonDeserializer _mapDeserializer>
		_stringDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationcontext, javatype1));
	//   58  115:aload_0         
	//   59  116:aload_0         
	//   60  117:aload_0         
	//   61  118:aload_1         
	//   62  119:aload_3         
	//   63  120:invokevirtual   #309 <Method JsonDeserializer _findCustomDeser(DeserializationContext, JavaType)>
	//   64  123:invokevirtual   #311 <Method JsonDeserializer _clearIfStdImpl(JsonDeserializer)>
	//   65  126:putfield        #59  <Field JsonDeserializer _stringDeserializer>
		_numberDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationcontext, typefactory.constructType(java/lang/Number)));
	//   66  129:aload_0         
	//   67  130:aload_0         
	//   68  131:aload_0         
	//   69  132:aload_1         
	//   70  133:aload           4
	//   71  135:ldc2            #317 <Class Number>
	//   72  138:invokevirtual   #320 <Method JavaType TypeFactory.constructType(java.lang.reflect.Type)>
	//   73  141:invokevirtual   #309 <Method JsonDeserializer _findCustomDeser(DeserializationContext, JavaType)>
	//   74  144:invokevirtual   #311 <Method JsonDeserializer _clearIfStdImpl(JsonDeserializer)>
	//   75  147:putfield        #61  <Field JsonDeserializer _numberDeserializer>
		javatype = TypeFactory.unknownType();
	//   76  150:invokestatic    #324 <Method JavaType TypeFactory.unknownType()>
	//   77  153:astore_2        
		_mapDeserializer = deserializationcontext.handleSecondaryContextualization(_mapDeserializer, ((BeanProperty) (null)), javatype);
	//   78  154:aload_0         
	//   79  155:aload_1         
	//   80  156:aload_0         
	//   81  157:getfield        #55  <Field JsonDeserializer _mapDeserializer>
	//   82  160:aconst_null     
	//   83  161:aload_2         
	//   84  162:invokevirtual   #328 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//   85  165:putfield        #55  <Field JsonDeserializer _mapDeserializer>
		_listDeserializer = deserializationcontext.handleSecondaryContextualization(_listDeserializer, ((BeanProperty) (null)), javatype);
	//   86  168:aload_0         
	//   87  169:aload_1         
	//   88  170:aload_0         
	//   89  171:getfield        #57  <Field JsonDeserializer _listDeserializer>
	//   90  174:aconst_null     
	//   91  175:aload_2         
	//   92  176:invokevirtual   #328 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//   93  179:putfield        #57  <Field JsonDeserializer _listDeserializer>
		_stringDeserializer = deserializationcontext.handleSecondaryContextualization(_stringDeserializer, ((BeanProperty) (null)), javatype);
	//   94  182:aload_0         
	//   95  183:aload_1         
	//   96  184:aload_0         
	//   97  185:getfield        #59  <Field JsonDeserializer _stringDeserializer>
	//   98  188:aconst_null     
	//   99  189:aload_2         
	//  100  190:invokevirtual   #328 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//  101  193:putfield        #59  <Field JsonDeserializer _stringDeserializer>
		_numberDeserializer = deserializationcontext.handleSecondaryContextualization(_numberDeserializer, ((BeanProperty) (null)), javatype);
	//  102  196:aload_0         
	//  103  197:aload_1         
	//  104  198:aload_0         
	//  105  199:getfield        #61  <Field JsonDeserializer _numberDeserializer>
	//  106  202:aconst_null     
	//  107  203:aload_2         
	//  108  204:invokevirtual   #328 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//  109  207:putfield        #61  <Field JsonDeserializer _numberDeserializer>
	//  110  210:return          
	}

	public Boolean supportsUpdate(DeserializationConfig deserializationconfig)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected static final Object NO_OBJECTS[] = new Object[0];
	private static final long serialVersionUID = 1L;
	protected JsonDeserializer _listDeserializer;
	protected JavaType _listType;
	protected JsonDeserializer _mapDeserializer;
	protected JavaType _mapType;
	protected final boolean _nonMerging;
	protected JsonDeserializer _numberDeserializer;
	protected JsonDeserializer _stringDeserializer;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       Object[]
	//    2    4:putstatic       #36  <Field Object[] NO_OBJECTS>
	//*   3    7:return          
	}
}
