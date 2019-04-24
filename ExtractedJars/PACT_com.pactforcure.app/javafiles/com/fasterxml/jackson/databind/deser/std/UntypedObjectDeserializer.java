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
	implements ResolvableDeserializer, ContextualDeserializer
{
	public static class Vanilla extends StdDeserializer
	{

		public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			switch(jsonparser.getCurrentTokenId())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #38  <Method int JsonParser.getCurrentTokenId()>
			{
		//*   2    4:tableswitch     1 12: default 68
		//		               1 75
		//		               2 223
		//		               3 101
		//		               4 68
		//		               5 94
		//		               6 163
		//		               7 168
		//		               8 190
		//		               9 213
		//		               10 217
		//		               11 221
		//		               12 158
			case 4: // '\004'
			default:
				throw deserializationcontext.mappingException(java/lang/Object);
		//    3   68:aload_2         
		//    4   69:ldc1            #25  <Class Object>
		//    5   71:invokevirtual   #44  <Method JsonMappingException DeserializationContext.mappingException(Class)>
		//    6   74:athrow          

			case 1: // '\001'
				if(jsonparser.nextToken() == JsonToken.END_OBJECT)
		//*   7   75:aload_1         
		//*   8   76:invokevirtual   #48  <Method JsonToken JsonParser.nextToken()>
		//*   9   79:getstatic       #54  <Field JsonToken JsonToken.END_OBJECT>
		//*  10   82:if_acmpne       94
					return ((Object) (new LinkedHashMap(2)));
		//   11   85:new             #56  <Class LinkedHashMap>
		//   12   88:dup             
		//   13   89:iconst_2        
		//   14   90:invokespecial   #59  <Method void LinkedHashMap(int)>
		//   15   93:areturn         
				// fall through

			case 5: // '\005'
				return mapObject(jsonparser, deserializationcontext);
		//   16   94:aload_0         
		//   17   95:aload_1         
		//   18   96:aload_2         
		//   19   97:invokevirtual   #62  <Method Object mapObject(JsonParser, DeserializationContext)>
		//   20  100:areturn         

			case 3: // '\003'
				if(jsonparser.nextToken() == JsonToken.END_ARRAY)
		//*  21  101:aload_1         
		//*  22  102:invokevirtual   #48  <Method JsonToken JsonParser.nextToken()>
		//*  23  105:getstatic       #65  <Field JsonToken JsonToken.END_ARRAY>
		//*  24  108:if_acmpne       134
					if(deserializationcontext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY))
		//*  25  111:aload_2         
		//*  26  112:getstatic       #71  <Field DeserializationFeature DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY>
		//*  27  115:invokevirtual   #75  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//*  28  118:ifeq            125
						return ((Object) (UntypedObjectDeserializer.NO_OBJECTS));
		//   29  121:getstatic       #79  <Field Object[] UntypedObjectDeserializer.NO_OBJECTS>
		//   30  124:areturn         
					else
						return ((Object) (new ArrayList(2)));
		//   31  125:new             #81  <Class ArrayList>
		//   32  128:dup             
		//   33  129:iconst_2        
		//   34  130:invokespecial   #82  <Method void ArrayList(int)>
		//   35  133:areturn         
				if(deserializationcontext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY))
		//*  36  134:aload_2         
		//*  37  135:getstatic       #71  <Field DeserializationFeature DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY>
		//*  38  138:invokevirtual   #75  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//*  39  141:ifeq            151
					return ((Object) (mapArrayToArray(jsonparser, deserializationcontext)));
		//   40  144:aload_0         
		//   41  145:aload_1         
		//   42  146:aload_2         
		//   43  147:invokevirtual   #86  <Method Object[] mapArrayToArray(JsonParser, DeserializationContext)>
		//   44  150:areturn         
				else
					return mapArray(jsonparser, deserializationcontext);
		//   45  151:aload_0         
		//   46  152:aload_1         
		//   47  153:aload_2         
		//   48  154:invokevirtual   #89  <Method Object mapArray(JsonParser, DeserializationContext)>
		//   49  157:areturn         

			case 12: // '\f'
				return jsonparser.getEmbeddedObject();
		//   50  158:aload_1         
		//   51  159:invokevirtual   #93  <Method Object JsonParser.getEmbeddedObject()>
		//   52  162:areturn         

			case 6: // '\006'
				return ((Object) (jsonparser.getText()));
		//   53  163:aload_1         
		//   54  164:invokevirtual   #97  <Method String JsonParser.getText()>
		//   55  167:areturn         

			case 7: // '\007'
				if(deserializationcontext.hasSomeOfFeatures(F_MASK_INT_COERCIONS))
		//*  56  168:aload_2         
		//*  57  169:getstatic       #101 <Field int F_MASK_INT_COERCIONS>
		//*  58  172:invokevirtual   #105 <Method boolean DeserializationContext.hasSomeOfFeatures(int)>
		//*  59  175:ifeq            185
					return _coerceIntegral(jsonparser, deserializationcontext);
		//   60  178:aload_0         
		//   61  179:aload_1         
		//   62  180:aload_2         
		//   63  181:invokevirtual   #108 <Method Object _coerceIntegral(JsonParser, DeserializationContext)>
		//   64  184:areturn         
				else
					return ((Object) (jsonparser.getNumberValue()));
		//   65  185:aload_1         
		//   66  186:invokevirtual   #112 <Method Number JsonParser.getNumberValue()>
		//   67  189:areturn         

			case 8: // '\b'
				if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
		//*  68  190:aload_2         
		//*  69  191:getstatic       #115 <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
		//*  70  194:invokevirtual   #75  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//*  71  197:ifeq            205
					return ((Object) (jsonparser.getDecimalValue()));
		//   72  200:aload_1         
		//   73  201:invokevirtual   #119 <Method java.math.BigDecimal JsonParser.getDecimalValue()>
		//   74  204:areturn         
				else
					return ((Object) (Double.valueOf(jsonparser.getDoubleValue())));
		//   75  205:aload_1         
		//   76  206:invokevirtual   #123 <Method double JsonParser.getDoubleValue()>
		//   77  209:invokestatic    #129 <Method Double Double.valueOf(double)>
		//   78  212:areturn         

			case 9: // '\t'
				return ((Object) (Boolean.TRUE));
		//   79  213:getstatic       #135 <Field Boolean Boolean.TRUE>
		//   80  216:areturn         

			case 10: // '\n'
				return ((Object) (Boolean.FALSE));
		//   81  217:getstatic       #138 <Field Boolean Boolean.FALSE>
		//   82  220:areturn         

			case 11: // '\013'
				return ((Object) (null));
		//   83  221:aconst_null     
		//   84  222:areturn         

			case 2: // '\002'
				return ((Object) (new LinkedHashMap(2)));
		//   85  223:new             #56  <Class LinkedHashMap>
		//   86  226:dup             
		//   87  227:iconst_2        
		//   88  228:invokespecial   #59  <Method void LinkedHashMap(int)>
		//   89  231:areturn         
			}
		}

		public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
			throws IOException
		{
			switch(jsonparser.getCurrentTokenId())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #38  <Method int JsonParser.getCurrentTokenId()>
			{
		//*   2    4:tableswitch     1 12: default 68
		//		               1 75
		//		               2 68
		//		               3 75
		//		               4 68
		//		               5 75
		//		               6 82
		//		               7 87
		//		               8 107
		//		               9 130
		//		               10 134
		//		               11 143
		//		               12 138
			case 2: // '\002'
			case 4: // '\004'
			default:
				throw deserializationcontext.mappingException(java/lang/Object);
		//    3   68:aload_2         
		//    4   69:ldc1            #25  <Class Object>
		//    5   71:invokevirtual   #44  <Method JsonMappingException DeserializationContext.mappingException(Class)>
		//    6   74:athrow          

			case 1: // '\001'
			case 3: // '\003'
			case 5: // '\005'
				return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
		//    7   75:aload_3         
		//    8   76:aload_1         
		//    9   77:aload_2         
		//   10   78:invokevirtual   #146 <Method Object TypeDeserializer.deserializeTypedFromAny(JsonParser, DeserializationContext)>
		//   11   81:areturn         

			case 6: // '\006'
				return ((Object) (jsonparser.getText()));
		//   12   82:aload_1         
		//   13   83:invokevirtual   #97  <Method String JsonParser.getText()>
		//   14   86:areturn         

			case 7: // '\007'
				if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS))
		//*  15   87:aload_2         
		//*  16   88:getstatic       #149 <Field DeserializationFeature DeserializationFeature.USE_BIG_INTEGER_FOR_INTS>
		//*  17   91:invokevirtual   #75  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//*  18   94:ifeq            102
					return ((Object) (jsonparser.getBigIntegerValue()));
		//   19   97:aload_1         
		//   20   98:invokevirtual   #153 <Method java.math.BigInteger JsonParser.getBigIntegerValue()>
		//   21  101:areturn         
				else
					return ((Object) (jsonparser.getNumberValue()));
		//   22  102:aload_1         
		//   23  103:invokevirtual   #112 <Method Number JsonParser.getNumberValue()>
		//   24  106:areturn         

			case 8: // '\b'
				if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
		//*  25  107:aload_2         
		//*  26  108:getstatic       #115 <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
		//*  27  111:invokevirtual   #75  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//*  28  114:ifeq            122
					return ((Object) (jsonparser.getDecimalValue()));
		//   29  117:aload_1         
		//   30  118:invokevirtual   #119 <Method java.math.BigDecimal JsonParser.getDecimalValue()>
		//   31  121:areturn         
				else
					return ((Object) (Double.valueOf(jsonparser.getDoubleValue())));
		//   32  122:aload_1         
		//   33  123:invokevirtual   #123 <Method double JsonParser.getDoubleValue()>
		//   34  126:invokestatic    #129 <Method Double Double.valueOf(double)>
		//   35  129:areturn         

			case 9: // '\t'
				return ((Object) (Boolean.TRUE));
		//   36  130:getstatic       #135 <Field Boolean Boolean.TRUE>
		//   37  133:areturn         

			case 10: // '\n'
				return ((Object) (Boolean.FALSE));
		//   38  134:getstatic       #138 <Field Boolean Boolean.FALSE>
		//   39  137:areturn         

			case 12: // '\f'
				return jsonparser.getEmbeddedObject();
		//   40  138:aload_1         
		//   41  139:invokevirtual   #93  <Method Object JsonParser.getEmbeddedObject()>
		//   42  142:areturn         

			case 11: // '\013'
				return ((Object) (null));
		//   43  143:aconst_null     
		//   44  144:areturn         
			}
		}

		protected Object mapArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			Object obj = deserialize(jsonparser, deserializationcontext);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #155 <Method Object deserialize(JsonParser, DeserializationContext)>
		//    4    6:astore          6
			if(jsonparser.nextToken() == JsonToken.END_ARRAY)
		//*   5    8:aload_1         
		//*   6    9:invokevirtual   #48  <Method JsonToken JsonParser.nextToken()>
		//*   7   12:getstatic       #65  <Field JsonToken JsonToken.END_ARRAY>
		//*   8   15:if_acmpne       36
			{
				jsonparser = ((JsonParser) (new ArrayList(2)));
		//    9   18:new             #81  <Class ArrayList>
		//   10   21:dup             
		//   11   22:iconst_2        
		//   12   23:invokespecial   #82  <Method void ArrayList(int)>
		//   13   26:astore_1        
				((ArrayList) (jsonparser)).add(obj);
		//   14   27:aload_1         
		//   15   28:aload           6
		//   16   30:invokevirtual   #159 <Method boolean ArrayList.add(Object)>
		//   17   33:pop             
				return ((Object) (jsonparser));
		//   18   34:aload_1         
		//   19   35:areturn         
			}
			Object obj1 = deserialize(jsonparser, deserializationcontext);
		//   20   36:aload_0         
		//   21   37:aload_1         
		//   22   38:aload_2         
		//   23   39:invokevirtual   #155 <Method Object deserialize(JsonParser, DeserializationContext)>
		//   24   42:astore          9
			if(jsonparser.nextToken() == JsonToken.END_ARRAY)
		//*  25   44:aload_1         
		//*  26   45:invokevirtual   #48  <Method JsonToken JsonParser.nextToken()>
		//*  27   48:getstatic       #65  <Field JsonToken JsonToken.END_ARRAY>
		//*  28   51:if_acmpne       79
			{
				jsonparser = ((JsonParser) (new ArrayList(2)));
		//   29   54:new             #81  <Class ArrayList>
		//   30   57:dup             
		//   31   58:iconst_2        
		//   32   59:invokespecial   #82  <Method void ArrayList(int)>
		//   33   62:astore_1        
				((ArrayList) (jsonparser)).add(obj);
		//   34   63:aload_1         
		//   35   64:aload           6
		//   36   66:invokevirtual   #159 <Method boolean ArrayList.add(Object)>
		//   37   69:pop             
				((ArrayList) (jsonparser)).add(obj1);
		//   38   70:aload_1         
		//   39   71:aload           9
		//   40   73:invokevirtual   #159 <Method boolean ArrayList.add(Object)>
		//   41   76:pop             
				return ((Object) (jsonparser));
		//   42   77:aload_1         
		//   43   78:areturn         
			}
			ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
		//   44   79:aload_2         
		//   45   80:invokevirtual   #163 <Method ObjectBuffer DeserializationContext.leaseObjectBuffer()>
		//   46   83:astore          8
			Object aobj1[] = objectbuffer.resetAndStart();
		//   47   85:aload           8
		//   48   87:invokevirtual   #169 <Method Object[] ObjectBuffer.resetAndStart()>
		//   49   90:astore          7
			int j = 0 + 1;
		//   50   92:iconst_0        
		//   51   93:iconst_1        
		//   52   94:iadd            
		//   53   95:istore          4
			aobj1[0] = obj;
		//   54   97:aload           7
		//   55   99:iconst_0        
		//   56  100:aload           6
		//   57  102:aastore         
			int i = j + 1;
		//   58  103:iload           4
		//   59  105:iconst_1        
		//   60  106:iadd            
		//   61  107:istore_3        
			aobj1[j] = obj1;
		//   62  108:aload           7
		//   63  110:iload           4
		//   64  112:aload           9
		//   65  114:aastore         
			j = i;
		//   66  115:iload_3         
		//   67  116:istore          4
			do
			{
				Object obj2 = deserialize(jsonparser, deserializationcontext);
		//   68  118:aload_0         
		//   69  119:aload_1         
		//   70  120:aload_2         
		//   71  121:invokevirtual   #155 <Method Object deserialize(JsonParser, DeserializationContext)>
		//   72  124:astore          9
				int k = j + 1;
		//   73  126:iload           4
		//   74  128:iconst_1        
		//   75  129:iadd            
		//   76  130:istore          5
				j = i;
		//   77  132:iload_3         
		//   78  133:istore          4
				Object aobj[] = aobj1;
		//   79  135:aload           7
		//   80  137:astore          6
				if(i >= aobj1.length)
		//*  81  139:iload_3         
		//*  82  140:aload           7
		//*  83  142:arraylength     
		//*  84  143:icmplt          158
				{
					aobj = objectbuffer.appendCompletedChunk(aobj1);
		//   85  146:aload           8
		//   86  148:aload           7
		//   87  150:invokevirtual   #173 <Method Object[] ObjectBuffer.appendCompletedChunk(Object[])>
		//   88  153:astore          6
					j = 0;
		//   89  155:iconst_0        
		//   90  156:istore          4
				}
				i = j + 1;
		//   91  158:iload           4
		//   92  160:iconst_1        
		//   93  161:iadd            
		//   94  162:istore_3        
				aobj[j] = obj2;
		//   95  163:aload           6
		//   96  165:iload           4
		//   97  167:aload           9
		//   98  169:aastore         
				if(jsonparser.nextToken() == JsonToken.END_ARRAY)
		//*  99  170:aload_1         
		//* 100  171:invokevirtual   #48  <Method JsonToken JsonParser.nextToken()>
		//* 101  174:getstatic       #65  <Field JsonToken JsonToken.END_ARRAY>
		//* 102  177:if_acmpne       201
				{
					jsonparser = ((JsonParser) (new ArrayList(k)));
		//  103  180:new             #81  <Class ArrayList>
		//  104  183:dup             
		//  105  184:iload           5
		//  106  186:invokespecial   #82  <Method void ArrayList(int)>
		//  107  189:astore_1        
					objectbuffer.completeAndClearBuffer(aobj, i, ((List) (jsonparser)));
		//  108  190:aload           8
		//  109  192:aload           6
		//  110  194:iload_3         
		//  111  195:aload_1         
		//  112  196:invokevirtual   #177 <Method void ObjectBuffer.completeAndClearBuffer(Object[], int, List)>
					return ((Object) (jsonparser));
		//  113  199:aload_1         
		//  114  200:areturn         
				}
				j = k;
		//  115  201:iload           5
		//  116  203:istore          4
				aobj1 = aobj;
		//  117  205:aload           6
		//  118  207:astore          7
			} while(true);
		//  119  209:goto            118
		}

		protected Object[] mapArrayToArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #163 <Method ObjectBuffer DeserializationContext.leaseObjectBuffer()>
		//    2    4:astore          7
			Object aobj[] = objectbuffer.resetAndStart();
		//    3    6:aload           7
		//    4    8:invokevirtual   #169 <Method Object[] ObjectBuffer.resetAndStart()>
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
		//   11   18:invokevirtual   #155 <Method Object deserialize(JsonParser, DeserializationContext)>
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
		//   23   41:invokevirtual   #173 <Method Object[] ObjectBuffer.appendCompletedChunk(Object[])>
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
		//*  36   62:invokevirtual   #48  <Method JsonToken JsonParser.nextToken()>
		//*  37   65:getstatic       #65  <Field JsonToken JsonToken.END_ARRAY>
		//*  38   68:if_acmpne       80
					return objectbuffer.completeAndClearBuffer(aobj1, i);
		//   39   71:aload           7
		//   40   73:aload           6
		//   41   75:iload_3         
		//   42   76:invokevirtual   #180 <Method Object[] ObjectBuffer.completeAndClearBuffer(Object[], int)>
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
		//    1    1:invokevirtual   #97  <Method String JsonParser.getText()>
		//    2    4:astore          4
			jsonparser.nextToken();
		//    3    6:aload_1         
		//    4    7:invokevirtual   #48  <Method JsonToken JsonParser.nextToken()>
		//    5   10:pop             
			Object obj = deserialize(jsonparser, deserializationcontext);
		//    6   11:aload_0         
		//    7   12:aload_1         
		//    8   13:aload_2         
		//    9   14:invokevirtual   #155 <Method Object deserialize(JsonParser, DeserializationContext)>
		//   10   17:astore          5
			String s2 = jsonparser.nextFieldName();
		//   11   19:aload_1         
		//   12   20:invokevirtual   #183 <Method String JsonParser.nextFieldName()>
		//   13   23:astore          7
			if(s2 == null)
		//*  14   25:aload           7
		//*  15   27:ifnonnull       50
			{
				jsonparser = ((JsonParser) (new LinkedHashMap(2)));
		//   16   30:new             #56  <Class LinkedHashMap>
		//   17   33:dup             
		//   18   34:iconst_2        
		//   19   35:invokespecial   #59  <Method void LinkedHashMap(int)>
		//   20   38:astore_1        
				((LinkedHashMap) (jsonparser)).put(((Object) (s1)), obj);
		//   21   39:aload_1         
		//   22   40:aload           4
		//   23   42:aload           5
		//   24   44:invokevirtual   #187 <Method Object LinkedHashMap.put(Object, Object)>
		//   25   47:pop             
				return ((Object) (jsonparser));
		//   26   48:aload_1         
		//   27   49:areturn         
			}
			jsonparser.nextToken();
		//   28   50:aload_1         
		//   29   51:invokevirtual   #48  <Method JsonToken JsonParser.nextToken()>
		//   30   54:pop             
			Object obj1 = deserialize(jsonparser, deserializationcontext);
		//   31   55:aload_0         
		//   32   56:aload_1         
		//   33   57:aload_2         
		//   34   58:invokevirtual   #155 <Method Object deserialize(JsonParser, DeserializationContext)>
		//   35   61:astore          8
			String s = jsonparser.nextFieldName();
		//   36   63:aload_1         
		//   37   64:invokevirtual   #183 <Method String JsonParser.nextFieldName()>
		//   38   67:astore_3        
			if(s == null)
		//*  39   68:aload_3         
		//*  40   69:ifnonnull       101
			{
				jsonparser = ((JsonParser) (new LinkedHashMap(4)));
		//   41   72:new             #56  <Class LinkedHashMap>
		//   42   75:dup             
		//   43   76:iconst_4        
		//   44   77:invokespecial   #59  <Method void LinkedHashMap(int)>
		//   45   80:astore_1        
				((LinkedHashMap) (jsonparser)).put(((Object) (s1)), obj);
		//   46   81:aload_1         
		//   47   82:aload           4
		//   48   84:aload           5
		//   49   86:invokevirtual   #187 <Method Object LinkedHashMap.put(Object, Object)>
		//   50   89:pop             
				((LinkedHashMap) (jsonparser)).put(((Object) (s2)), obj1);
		//   51   90:aload_1         
		//   52   91:aload           7
		//   53   93:aload           8
		//   54   95:invokevirtual   #187 <Method Object LinkedHashMap.put(Object, Object)>
		//   55   98:pop             
				return ((Object) (jsonparser));
		//   56   99:aload_1         
		//   57  100:areturn         
			}
			LinkedHashMap linkedhashmap = new LinkedHashMap();
		//   58  101:new             #56  <Class LinkedHashMap>
		//   59  104:dup             
		//   60  105:invokespecial   #188 <Method void LinkedHashMap()>
		//   61  108:astore          6
			linkedhashmap.put(((Object) (s1)), obj);
		//   62  110:aload           6
		//   63  112:aload           4
		//   64  114:aload           5
		//   65  116:invokevirtual   #187 <Method Object LinkedHashMap.put(Object, Object)>
		//   66  119:pop             
			linkedhashmap.put(((Object) (s2)), obj1);
		//   67  120:aload           6
		//   68  122:aload           7
		//   69  124:aload           8
		//   70  126:invokevirtual   #187 <Method Object LinkedHashMap.put(Object, Object)>
		//   71  129:pop             
			do
			{
				jsonparser.nextToken();
		//   72  130:aload_1         
		//   73  131:invokevirtual   #48  <Method JsonToken JsonParser.nextToken()>
		//   74  134:pop             
				linkedhashmap.put(((Object) (s)), deserialize(jsonparser, deserializationcontext));
		//   75  135:aload           6
		//   76  137:aload_3         
		//   77  138:aload_0         
		//   78  139:aload_1         
		//   79  140:aload_2         
		//   80  141:invokevirtual   #155 <Method Object deserialize(JsonParser, DeserializationContext)>
		//   81  144:invokevirtual   #187 <Method Object LinkedHashMap.put(Object, Object)>
		//   82  147:pop             
				s1 = jsonparser.nextFieldName();
		//   83  148:aload_1         
		//   84  149:invokevirtual   #183 <Method String JsonParser.nextFieldName()>
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

		private static final long serialVersionUID = 1L;
		public static final Vanilla std = new Vanilla();

		static 
		{
		//    0    0:new             #2   <Class UntypedObjectDeserializer$Vanilla>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void UntypedObjectDeserializer$Vanilla()>
		//    3    7:putstatic       #22  <Field UntypedObjectDeserializer$Vanilla std>
		//*   4   10:return          
		}

		public Vanilla()
		{
			super(java/lang/Object);
		//    0    0:aload_0         
		//    1    1:ldc1            #25  <Class Object>
		//    2    3:invokespecial   #28  <Method void StdDeserializer(Class)>
		//    3    6:return          
		}
	}


	public UntypedObjectDeserializer()
	{
		this(((JavaType) (null)), ((JavaType) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:invokespecial   #41  <Method void UntypedObjectDeserializer(JavaType, JavaType)>
	//    4    6:return          
	}

	public UntypedObjectDeserializer(JavaType javatype, JavaType javatype1)
	{
		super(java/lang/Object);
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <Class Object>
	//    2    3:invokespecial   #48  <Method void StdDeserializer(Class)>
		_listType = javatype;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #50  <Field JavaType _listType>
		_mapType = javatype1;
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:putfield        #52  <Field JavaType _mapType>
	//    9   16:return          
	}

	public UntypedObjectDeserializer(UntypedObjectDeserializer untypedobjectdeserializer, JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1, JsonDeserializer jsondeserializer2, JsonDeserializer jsondeserializer3)
	{
		super(java/lang/Object);
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <Class Object>
	//    2    3:invokespecial   #48  <Method void StdDeserializer(Class)>
		_mapDeserializer = jsondeserializer;
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:putfield        #55  <Field JsonDeserializer _mapDeserializer>
		_listDeserializer = jsondeserializer1;
	//    6   11:aload_0         
	//    7   12:aload_3         
	//    8   13:putfield        #57  <Field JsonDeserializer _listDeserializer>
		_stringDeserializer = jsondeserializer2;
	//    9   16:aload_0         
	//   10   17:aload           4
	//   11   19:putfield        #59  <Field JsonDeserializer _stringDeserializer>
		_numberDeserializer = jsondeserializer3;
	//   12   22:aload_0         
	//   13   23:aload           5
	//   14   25:putfield        #61  <Field JsonDeserializer _numberDeserializer>
		_listType = untypedobjectdeserializer._listType;
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:getfield        #50  <Field JavaType _listType>
	//   18   33:putfield        #50  <Field JavaType _listType>
		_mapType = untypedobjectdeserializer._mapType;
	//   19   36:aload_0         
	//   20   37:aload_1         
	//   21   38:getfield        #52  <Field JavaType _mapType>
	//   22   41:putfield        #52  <Field JavaType _mapType>
	//   23   44:return          
	}

	protected JsonDeserializer _clearIfStdImpl(JsonDeserializer jsondeserializer)
	{
		JsonDeserializer jsondeserializer1 = jsondeserializer;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(ClassUtil.isJacksonStdImpl(((Object) (jsondeserializer))))
	//*   2    2:aload_1         
	//*   3    3:invokestatic    #71  <Method boolean ClassUtil.isJacksonStdImpl(Object)>
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
	//    2    2:invokevirtual   #82  <Method JsonDeserializer DeserializationContext.findNonContextualValueDeserializer(JavaType)>
	//    3    5:areturn         
	}

	protected JsonDeserializer _withResolved(JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1, JsonDeserializer jsondeserializer2, JsonDeserializer jsondeserializer3)
	{
		return ((JsonDeserializer) (new UntypedObjectDeserializer(this, jsondeserializer, jsondeserializer1, jsondeserializer2, jsondeserializer3)));
	//    0    0:new             #2   <Class UntypedObjectDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #88  <Method void UntypedObjectDeserializer(UntypedObjectDeserializer, JsonDeserializer, JsonDeserializer, JsonDeserializer, JsonDeserializer)>
	//    8   13:areturn         
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		deserializationcontext = ((DeserializationContext) (this));
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(_stringDeserializer == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #59  <Field JsonDeserializer _stringDeserializer>
	//*   4    6:ifnonnull       51
		{
			deserializationcontext = ((DeserializationContext) (this));
	//    5    9:aload_0         
	//    6   10:astore_1        
			if(_numberDeserializer == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #61  <Field JsonDeserializer _numberDeserializer>
	//*   9   15:ifnonnull       51
			{
				deserializationcontext = ((DeserializationContext) (this));
	//   10   18:aload_0         
	//   11   19:astore_1        
				if(_mapDeserializer == null)
	//*  12   20:aload_0         
	//*  13   21:getfield        #55  <Field JsonDeserializer _mapDeserializer>
	//*  14   24:ifnonnull       51
				{
					deserializationcontext = ((DeserializationContext) (this));
	//   15   27:aload_0         
	//   16   28:astore_1        
					if(_listDeserializer == null)
	//*  17   29:aload_0         
	//*  18   30:getfield        #57  <Field JsonDeserializer _listDeserializer>
	//*  19   33:ifnonnull       51
					{
						deserializationcontext = ((DeserializationContext) (this));
	//   20   36:aload_0         
	//   21   37:astore_1        
						if(((Object)this).getClass() == com/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializer)
	//*  22   38:aload_0         
	//*  23   39:invokevirtual   #95  <Method Class Object.getClass()>
	//*  24   42:ldc1            #2   <Class UntypedObjectDeserializer>
	//*  25   44:if_acmpne       51
							deserializationcontext = ((DeserializationContext) (Vanilla.std));
	//   26   47:getstatic       #99  <Field UntypedObjectDeserializer$Vanilla UntypedObjectDeserializer$Vanilla.std>
	//   27   50:astore_1        
					}
				}
			}
		}
		return ((JsonDeserializer) (deserializationcontext));
	//   28   51:aload_1         
	//   29   52:areturn         
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		switch(jsonparser.getCurrentTokenId())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #110 <Method int JsonParser.getCurrentTokenId()>
		{
	//*   2    4:tableswitch     1 12: default 68
	//	               1 75
	//	               2 75
	//	               3 99
	//	               4 68
	//	               5 75
	//	               6 145
	//	               7 167
	//	               8 206
	//	               9 246
	//	               10 250
	//	               11 254
	//	               12 140
		case 4: // '\004'
		default:
			throw deserializationcontext.mappingException(java/lang/Object);
	//    3   68:aload_2         
	//    4   69:ldc1            #35  <Class Object>
	//    5   71:invokevirtual   #114 <Method JsonMappingException DeserializationContext.mappingException(Class)>
	//    6   74:athrow          

		case 1: // '\001'
		case 2: // '\002'
		case 5: // '\005'
			if(_mapDeserializer != null)
	//*   7   75:aload_0         
	//*   8   76:getfield        #55  <Field JsonDeserializer _mapDeserializer>
	//*   9   79:ifnull          92
				return _mapDeserializer.deserialize(jsonparser, deserializationcontext);
	//   10   82:aload_0         
	//   11   83:getfield        #55  <Field JsonDeserializer _mapDeserializer>
	//   12   86:aload_1         
	//   13   87:aload_2         
	//   14   88:invokevirtual   #118 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   15   91:areturn         
			else
				return mapObject(jsonparser, deserializationcontext);
	//   16   92:aload_0         
	//   17   93:aload_1         
	//   18   94:aload_2         
	//   19   95:invokevirtual   #121 <Method Object mapObject(JsonParser, DeserializationContext)>
	//   20   98:areturn         

		case 3: // '\003'
			if(deserializationcontext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY))
	//*  21   99:aload_2         
	//*  22  100:getstatic       #127 <Field DeserializationFeature DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY>
	//*  23  103:invokevirtual   #131 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  24  106:ifeq            116
				return ((Object) (mapArrayToArray(jsonparser, deserializationcontext)));
	//   25  109:aload_0         
	//   26  110:aload_1         
	//   27  111:aload_2         
	//   28  112:invokevirtual   #135 <Method Object[] mapArrayToArray(JsonParser, DeserializationContext)>
	//   29  115:areturn         
			if(_listDeserializer != null)
	//*  30  116:aload_0         
	//*  31  117:getfield        #57  <Field JsonDeserializer _listDeserializer>
	//*  32  120:ifnull          133
				return _listDeserializer.deserialize(jsonparser, deserializationcontext);
	//   33  123:aload_0         
	//   34  124:getfield        #57  <Field JsonDeserializer _listDeserializer>
	//   35  127:aload_1         
	//   36  128:aload_2         
	//   37  129:invokevirtual   #118 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   38  132:areturn         
			else
				return mapArray(jsonparser, deserializationcontext);
	//   39  133:aload_0         
	//   40  134:aload_1         
	//   41  135:aload_2         
	//   42  136:invokevirtual   #138 <Method Object mapArray(JsonParser, DeserializationContext)>
	//   43  139:areturn         

		case 12: // '\f'
			return jsonparser.getEmbeddedObject();
	//   44  140:aload_1         
	//   45  141:invokevirtual   #142 <Method Object JsonParser.getEmbeddedObject()>
	//   46  144:areturn         

		case 6: // '\006'
			if(_stringDeserializer != null)
	//*  47  145:aload_0         
	//*  48  146:getfield        #59  <Field JsonDeserializer _stringDeserializer>
	//*  49  149:ifnull          162
				return _stringDeserializer.deserialize(jsonparser, deserializationcontext);
	//   50  152:aload_0         
	//   51  153:getfield        #59  <Field JsonDeserializer _stringDeserializer>
	//   52  156:aload_1         
	//   53  157:aload_2         
	//   54  158:invokevirtual   #118 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   55  161:areturn         
			else
				return ((Object) (jsonparser.getText()));
	//   56  162:aload_1         
	//   57  163:invokevirtual   #146 <Method String JsonParser.getText()>
	//   58  166:areturn         

		case 7: // '\007'
			if(_numberDeserializer != null)
	//*  59  167:aload_0         
	//*  60  168:getfield        #61  <Field JsonDeserializer _numberDeserializer>
	//*  61  171:ifnull          184
				return _numberDeserializer.deserialize(jsonparser, deserializationcontext);
	//   62  174:aload_0         
	//   63  175:getfield        #61  <Field JsonDeserializer _numberDeserializer>
	//   64  178:aload_1         
	//   65  179:aload_2         
	//   66  180:invokevirtual   #118 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   67  183:areturn         
			if(deserializationcontext.hasSomeOfFeatures(F_MASK_INT_COERCIONS))
	//*  68  184:aload_2         
	//*  69  185:getstatic       #150 <Field int F_MASK_INT_COERCIONS>
	//*  70  188:invokevirtual   #154 <Method boolean DeserializationContext.hasSomeOfFeatures(int)>
	//*  71  191:ifeq            201
				return _coerceIntegral(jsonparser, deserializationcontext);
	//   72  194:aload_0         
	//   73  195:aload_1         
	//   74  196:aload_2         
	//   75  197:invokevirtual   #157 <Method Object _coerceIntegral(JsonParser, DeserializationContext)>
	//   76  200:areturn         
			else
				return ((Object) (jsonparser.getNumberValue()));
	//   77  201:aload_1         
	//   78  202:invokevirtual   #161 <Method Number JsonParser.getNumberValue()>
	//   79  205:areturn         

		case 8: // '\b'
			if(_numberDeserializer != null)
	//*  80  206:aload_0         
	//*  81  207:getfield        #61  <Field JsonDeserializer _numberDeserializer>
	//*  82  210:ifnull          223
				return _numberDeserializer.deserialize(jsonparser, deserializationcontext);
	//   83  213:aload_0         
	//   84  214:getfield        #61  <Field JsonDeserializer _numberDeserializer>
	//   85  217:aload_1         
	//   86  218:aload_2         
	//   87  219:invokevirtual   #118 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   88  222:areturn         
			if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
	//*  89  223:aload_2         
	//*  90  224:getstatic       #164 <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
	//*  91  227:invokevirtual   #131 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  92  230:ifeq            238
				return ((Object) (jsonparser.getDecimalValue()));
	//   93  233:aload_1         
	//   94  234:invokevirtual   #168 <Method java.math.BigDecimal JsonParser.getDecimalValue()>
	//   95  237:areturn         
			else
				return ((Object) (Double.valueOf(jsonparser.getDoubleValue())));
	//   96  238:aload_1         
	//   97  239:invokevirtual   #172 <Method double JsonParser.getDoubleValue()>
	//   98  242:invokestatic    #178 <Method Double Double.valueOf(double)>
	//   99  245:areturn         

		case 9: // '\t'
			return ((Object) (Boolean.TRUE));
	//  100  246:getstatic       #184 <Field Boolean Boolean.TRUE>
	//  101  249:areturn         

		case 10: // '\n'
			return ((Object) (Boolean.FALSE));
	//  102  250:getstatic       #187 <Field Boolean Boolean.FALSE>
	//  103  253:areturn         

		case 11: // '\013'
			return ((Object) (null));
	//  104  254:aconst_null     
	//  105  255:areturn         
		}
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		switch(jsonparser.getCurrentTokenId())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #110 <Method int JsonParser.getCurrentTokenId()>
		{
	//*   2    4:tableswitch     1 12: default 68
	//	               1 75
	//	               2 68
	//	               3 75
	//	               4 68
	//	               5 75
	//	               6 87
	//	               7 109
	//	               8 148
	//	               9 188
	//	               10 192
	//	               11 196
	//	               12 82
		case 2: // '\002'
		case 4: // '\004'
		default:
			throw deserializationcontext.mappingException(java/lang/Object);
	//    3   68:aload_2         
	//    4   69:ldc1            #35  <Class Object>
	//    5   71:invokevirtual   #114 <Method JsonMappingException DeserializationContext.mappingException(Class)>
	//    6   74:athrow          

		case 1: // '\001'
		case 3: // '\003'
		case 5: // '\005'
			return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
	//    7   75:aload_3         
	//    8   76:aload_1         
	//    9   77:aload_2         
	//   10   78:invokevirtual   #194 <Method Object TypeDeserializer.deserializeTypedFromAny(JsonParser, DeserializationContext)>
	//   11   81:areturn         

		case 12: // '\f'
			return jsonparser.getEmbeddedObject();
	//   12   82:aload_1         
	//   13   83:invokevirtual   #142 <Method Object JsonParser.getEmbeddedObject()>
	//   14   86:areturn         

		case 6: // '\006'
			if(_stringDeserializer != null)
	//*  15   87:aload_0         
	//*  16   88:getfield        #59  <Field JsonDeserializer _stringDeserializer>
	//*  17   91:ifnull          104
				return _stringDeserializer.deserialize(jsonparser, deserializationcontext);
	//   18   94:aload_0         
	//   19   95:getfield        #59  <Field JsonDeserializer _stringDeserializer>
	//   20   98:aload_1         
	//   21   99:aload_2         
	//   22  100:invokevirtual   #118 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   23  103:areturn         
			else
				return ((Object) (jsonparser.getText()));
	//   24  104:aload_1         
	//   25  105:invokevirtual   #146 <Method String JsonParser.getText()>
	//   26  108:areturn         

		case 7: // '\007'
			if(_numberDeserializer != null)
	//*  27  109:aload_0         
	//*  28  110:getfield        #61  <Field JsonDeserializer _numberDeserializer>
	//*  29  113:ifnull          126
				return _numberDeserializer.deserialize(jsonparser, deserializationcontext);
	//   30  116:aload_0         
	//   31  117:getfield        #61  <Field JsonDeserializer _numberDeserializer>
	//   32  120:aload_1         
	//   33  121:aload_2         
	//   34  122:invokevirtual   #118 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   35  125:areturn         
			if(deserializationcontext.hasSomeOfFeatures(F_MASK_INT_COERCIONS))
	//*  36  126:aload_2         
	//*  37  127:getstatic       #150 <Field int F_MASK_INT_COERCIONS>
	//*  38  130:invokevirtual   #154 <Method boolean DeserializationContext.hasSomeOfFeatures(int)>
	//*  39  133:ifeq            143
				return _coerceIntegral(jsonparser, deserializationcontext);
	//   40  136:aload_0         
	//   41  137:aload_1         
	//   42  138:aload_2         
	//   43  139:invokevirtual   #157 <Method Object _coerceIntegral(JsonParser, DeserializationContext)>
	//   44  142:areturn         
			else
				return ((Object) (jsonparser.getNumberValue()));
	//   45  143:aload_1         
	//   46  144:invokevirtual   #161 <Method Number JsonParser.getNumberValue()>
	//   47  147:areturn         

		case 8: // '\b'
			if(_numberDeserializer != null)
	//*  48  148:aload_0         
	//*  49  149:getfield        #61  <Field JsonDeserializer _numberDeserializer>
	//*  50  152:ifnull          165
				return _numberDeserializer.deserialize(jsonparser, deserializationcontext);
	//   51  155:aload_0         
	//   52  156:getfield        #61  <Field JsonDeserializer _numberDeserializer>
	//   53  159:aload_1         
	//   54  160:aload_2         
	//   55  161:invokevirtual   #118 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   56  164:areturn         
			if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
	//*  57  165:aload_2         
	//*  58  166:getstatic       #164 <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
	//*  59  169:invokevirtual   #131 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  60  172:ifeq            180
				return ((Object) (jsonparser.getDecimalValue()));
	//   61  175:aload_1         
	//   62  176:invokevirtual   #168 <Method java.math.BigDecimal JsonParser.getDecimalValue()>
	//   63  179:areturn         
			else
				return ((Object) (Double.valueOf(jsonparser.getDoubleValue())));
	//   64  180:aload_1         
	//   65  181:invokevirtual   #172 <Method double JsonParser.getDoubleValue()>
	//   66  184:invokestatic    #178 <Method Double Double.valueOf(double)>
	//   67  187:areturn         

		case 9: // '\t'
			return ((Object) (Boolean.TRUE));
	//   68  188:getstatic       #184 <Field Boolean Boolean.TRUE>
	//   69  191:areturn         

		case 10: // '\n'
			return ((Object) (Boolean.FALSE));
	//   70  192:getstatic       #187 <Field Boolean Boolean.FALSE>
	//   71  195:areturn         

		case 11: // '\013'
			return ((Object) (null));
	//   72  196:aconst_null     
	//   73  197:areturn         
		}
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
		if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #200 <Method JsonToken JsonParser.nextToken()>
	//*   2    4:getstatic       #206 <Field JsonToken JsonToken.END_ARRAY>
	//*   3    7:if_acmpne       19
			return ((Object) (new ArrayList(2)));
	//    4   10:new             #208 <Class ArrayList>
	//    5   13:dup             
	//    6   14:iconst_2        
	//    7   15:invokespecial   #211 <Method void ArrayList(int)>
	//    8   18:areturn         
		Object obj = deserialize(jsonparser, deserializationcontext);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #212 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   13   25:astore          6
		if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*  14   27:aload_1         
	//*  15   28:invokevirtual   #200 <Method JsonToken JsonParser.nextToken()>
	//*  16   31:getstatic       #206 <Field JsonToken JsonToken.END_ARRAY>
	//*  17   34:if_acmpne       55
		{
			jsonparser = ((JsonParser) (new ArrayList(2)));
	//   18   37:new             #208 <Class ArrayList>
	//   19   40:dup             
	//   20   41:iconst_2        
	//   21   42:invokespecial   #211 <Method void ArrayList(int)>
	//   22   45:astore_1        
			((ArrayList) (jsonparser)).add(obj);
	//   23   46:aload_1         
	//   24   47:aload           6
	//   25   49:invokevirtual   #215 <Method boolean ArrayList.add(Object)>
	//   26   52:pop             
			return ((Object) (jsonparser));
	//   27   53:aload_1         
	//   28   54:areturn         
		}
		Object obj1 = deserialize(jsonparser, deserializationcontext);
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:aload_2         
	//   32   58:invokevirtual   #212 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   33   61:astore          9
		if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*  34   63:aload_1         
	//*  35   64:invokevirtual   #200 <Method JsonToken JsonParser.nextToken()>
	//*  36   67:getstatic       #206 <Field JsonToken JsonToken.END_ARRAY>
	//*  37   70:if_acmpne       98
		{
			jsonparser = ((JsonParser) (new ArrayList(2)));
	//   38   73:new             #208 <Class ArrayList>
	//   39   76:dup             
	//   40   77:iconst_2        
	//   41   78:invokespecial   #211 <Method void ArrayList(int)>
	//   42   81:astore_1        
			((ArrayList) (jsonparser)).add(obj);
	//   43   82:aload_1         
	//   44   83:aload           6
	//   45   85:invokevirtual   #215 <Method boolean ArrayList.add(Object)>
	//   46   88:pop             
			((ArrayList) (jsonparser)).add(obj1);
	//   47   89:aload_1         
	//   48   90:aload           9
	//   49   92:invokevirtual   #215 <Method boolean ArrayList.add(Object)>
	//   50   95:pop             
			return ((Object) (jsonparser));
	//   51   96:aload_1         
	//   52   97:areturn         
		}
		ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
	//   53   98:aload_2         
	//   54   99:invokevirtual   #219 <Method ObjectBuffer DeserializationContext.leaseObjectBuffer()>
	//   55  102:astore          8
		Object aobj1[] = objectbuffer.resetAndStart();
	//   56  104:aload           8
	//   57  106:invokevirtual   #225 <Method Object[] ObjectBuffer.resetAndStart()>
	//   58  109:astore          7
		int j = 0 + 1;
	//   59  111:iconst_0        
	//   60  112:iconst_1        
	//   61  113:iadd            
	//   62  114:istore          4
		aobj1[0] = obj;
	//   63  116:aload           7
	//   64  118:iconst_0        
	//   65  119:aload           6
	//   66  121:aastore         
		int i = j + 1;
	//   67  122:iload           4
	//   68  124:iconst_1        
	//   69  125:iadd            
	//   70  126:istore_3        
		aobj1[j] = obj1;
	//   71  127:aload           7
	//   72  129:iload           4
	//   73  131:aload           9
	//   74  133:aastore         
		j = i;
	//   75  134:iload_3         
	//   76  135:istore          4
		do
		{
			Object obj2 = deserialize(jsonparser, deserializationcontext);
	//   77  137:aload_0         
	//   78  138:aload_1         
	//   79  139:aload_2         
	//   80  140:invokevirtual   #212 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   81  143:astore          9
			int k = j + 1;
	//   82  145:iload           4
	//   83  147:iconst_1        
	//   84  148:iadd            
	//   85  149:istore          5
			j = i;
	//   86  151:iload_3         
	//   87  152:istore          4
			Object aobj[] = aobj1;
	//   88  154:aload           7
	//   89  156:astore          6
			if(i >= aobj1.length)
	//*  90  158:iload_3         
	//*  91  159:aload           7
	//*  92  161:arraylength     
	//*  93  162:icmplt          177
			{
				aobj = objectbuffer.appendCompletedChunk(aobj1);
	//   94  165:aload           8
	//   95  167:aload           7
	//   96  169:invokevirtual   #229 <Method Object[] ObjectBuffer.appendCompletedChunk(Object[])>
	//   97  172:astore          6
				j = 0;
	//   98  174:iconst_0        
	//   99  175:istore          4
			}
			i = j + 1;
	//  100  177:iload           4
	//  101  179:iconst_1        
	//  102  180:iadd            
	//  103  181:istore_3        
			aobj[j] = obj2;
	//  104  182:aload           6
	//  105  184:iload           4
	//  106  186:aload           9
	//  107  188:aastore         
			if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//* 108  189:aload_1         
	//* 109  190:invokevirtual   #200 <Method JsonToken JsonParser.nextToken()>
	//* 110  193:getstatic       #206 <Field JsonToken JsonToken.END_ARRAY>
	//* 111  196:if_acmpne       220
			{
				jsonparser = ((JsonParser) (new ArrayList(k)));
	//  112  199:new             #208 <Class ArrayList>
	//  113  202:dup             
	//  114  203:iload           5
	//  115  205:invokespecial   #211 <Method void ArrayList(int)>
	//  116  208:astore_1        
				objectbuffer.completeAndClearBuffer(aobj, i, ((List) (jsonparser)));
	//  117  209:aload           8
	//  118  211:aload           6
	//  119  213:iload_3         
	//  120  214:aload_1         
	//  121  215:invokevirtual   #233 <Method void ObjectBuffer.completeAndClearBuffer(Object[], int, List)>
				return ((Object) (jsonparser));
	//  122  218:aload_1         
	//  123  219:areturn         
			}
			j = k;
	//  124  220:iload           5
	//  125  222:istore          4
			aobj1 = aobj;
	//  126  224:aload           6
	//  127  226:astore          7
		} while(true);
	//  128  228:goto            137
	}

	protected Object[] mapArrayToArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #200 <Method JsonToken JsonParser.nextToken()>
	//*   2    4:getstatic       #206 <Field JsonToken JsonToken.END_ARRAY>
	//*   3    7:if_acmpne       14
			return NO_OBJECTS;
	//    4   10:getstatic       #37  <Field Object[] NO_OBJECTS>
	//    5   13:areturn         
		ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
	//    6   14:aload_2         
	//    7   15:invokevirtual   #219 <Method ObjectBuffer DeserializationContext.leaseObjectBuffer()>
	//    8   18:astore          7
		Object aobj[] = objectbuffer.resetAndStart();
	//    9   20:aload           7
	//   10   22:invokevirtual   #225 <Method Object[] ObjectBuffer.resetAndStart()>
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
	//   17   32:invokevirtual   #212 <Method Object deserialize(JsonParser, DeserializationContext)>
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
	//   29   55:invokevirtual   #229 <Method Object[] ObjectBuffer.appendCompletedChunk(Object[])>
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
	//*  42   76:invokevirtual   #200 <Method JsonToken JsonParser.nextToken()>
	//*  43   79:getstatic       #206 <Field JsonToken JsonToken.END_ARRAY>
	//*  44   82:if_acmpne       94
				return objectbuffer.completeAndClearBuffer(aobj1, i);
	//   45   85:aload           7
	//   46   87:aload           6
	//   47   89:iload_3         
	//   48   90:invokevirtual   #236 <Method Object[] ObjectBuffer.completeAndClearBuffer(Object[], int)>
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
	//    1    1:invokevirtual   #239 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore_3        
		if(obj == JsonToken.START_OBJECT)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #242 <Field JsonToken JsonToken.START_OBJECT>
	//*   5    9:if_acmpne       30
			obj = ((Object) (jsonparser.nextFieldName()));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #245 <Method String JsonParser.nextFieldName()>
	//    8   16:astore_3        
		else
	//*   9   17:aload_3         
	//*  10   18:ifnonnull       70
	//*  11   21:new             #247 <Class LinkedHashMap>
	//*  12   24:dup             
	//*  13   25:iconst_2        
	//*  14   26:invokespecial   #248 <Method void LinkedHashMap(int)>
	//*  15   29:areturn         
		if(obj == JsonToken.FIELD_NAME)
	//*  16   30:aload_3         
	//*  17   31:getstatic       #251 <Field JsonToken JsonToken.FIELD_NAME>
	//*  18   34:if_acmpne       45
		{
			obj = ((Object) (jsonparser.getCurrentName()));
	//   19   37:aload_1         
	//   20   38:invokevirtual   #254 <Method String JsonParser.getCurrentName()>
	//   21   41:astore_3        
		} else
	//*  22   42:goto            17
		{
			if(obj != JsonToken.END_OBJECT)
	//*  23   45:aload_3         
	//*  24   46:getstatic       #257 <Field JsonToken JsonToken.END_OBJECT>
	//*  25   49:if_acmpeq       65
				throw deserializationcontext.mappingException(handledType(), jsonparser.getCurrentToken());
	//   26   52:aload_2         
	//   27   53:aload_0         
	//   28   54:invokevirtual   #260 <Method Class handledType()>
	//   29   57:aload_1         
	//   30   58:invokevirtual   #239 <Method JsonToken JsonParser.getCurrentToken()>
	//   31   61:invokevirtual   #263 <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//   32   64:athrow          
			obj = null;
	//   33   65:aconst_null     
	//   34   66:astore_3        
		}
		if(obj == null)
			return ((Object) (new LinkedHashMap(2)));
	//*  35   67:goto            17
		jsonparser.nextToken();
	//   36   70:aload_1         
	//   37   71:invokevirtual   #200 <Method JsonToken JsonParser.nextToken()>
	//   38   74:pop             
		Object obj1 = deserialize(jsonparser, deserializationcontext);
	//   39   75:aload_0         
	//   40   76:aload_1         
	//   41   77:aload_2         
	//   42   78:invokevirtual   #212 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   43   81:astore          5
		String s1 = jsonparser.nextFieldName();
	//   44   83:aload_1         
	//   45   84:invokevirtual   #245 <Method String JsonParser.nextFieldName()>
	//   46   87:astore          7
		if(s1 == null)
	//*  47   89:aload           7
	//*  48   91:ifnonnull       113
		{
			jsonparser = ((JsonParser) (new LinkedHashMap(2)));
	//   49   94:new             #247 <Class LinkedHashMap>
	//   50   97:dup             
	//   51   98:iconst_2        
	//   52   99:invokespecial   #248 <Method void LinkedHashMap(int)>
	//   53  102:astore_1        
			((LinkedHashMap) (jsonparser)).put(obj, obj1);
	//   54  103:aload_1         
	//   55  104:aload_3         
	//   56  105:aload           5
	//   57  107:invokevirtual   #267 <Method Object LinkedHashMap.put(Object, Object)>
	//   58  110:pop             
			return ((Object) (jsonparser));
	//   59  111:aload_1         
	//   60  112:areturn         
		}
		jsonparser.nextToken();
	//   61  113:aload_1         
	//   62  114:invokevirtual   #200 <Method JsonToken JsonParser.nextToken()>
	//   63  117:pop             
		Object obj2 = deserialize(jsonparser, deserializationcontext);
	//   64  118:aload_0         
	//   65  119:aload_1         
	//   66  120:aload_2         
	//   67  121:invokevirtual   #212 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   68  124:astore          8
		String s = jsonparser.nextFieldName();
	//   69  126:aload_1         
	//   70  127:invokevirtual   #245 <Method String JsonParser.nextFieldName()>
	//   71  130:astore          4
		if(s == null)
	//*  72  132:aload           4
	//*  73  134:ifnonnull       165
		{
			jsonparser = ((JsonParser) (new LinkedHashMap(4)));
	//   74  137:new             #247 <Class LinkedHashMap>
	//   75  140:dup             
	//   76  141:iconst_4        
	//   77  142:invokespecial   #248 <Method void LinkedHashMap(int)>
	//   78  145:astore_1        
			((LinkedHashMap) (jsonparser)).put(obj, obj1);
	//   79  146:aload_1         
	//   80  147:aload_3         
	//   81  148:aload           5
	//   82  150:invokevirtual   #267 <Method Object LinkedHashMap.put(Object, Object)>
	//   83  153:pop             
			((LinkedHashMap) (jsonparser)).put(((Object) (s1)), obj2);
	//   84  154:aload_1         
	//   85  155:aload           7
	//   86  157:aload           8
	//   87  159:invokevirtual   #267 <Method Object LinkedHashMap.put(Object, Object)>
	//   88  162:pop             
			return ((Object) (jsonparser));
	//   89  163:aload_1         
	//   90  164:areturn         
		}
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//   91  165:new             #247 <Class LinkedHashMap>
	//   92  168:dup             
	//   93  169:invokespecial   #269 <Method void LinkedHashMap()>
	//   94  172:astore          6
		linkedhashmap.put(obj, obj1);
	//   95  174:aload           6
	//   96  176:aload_3         
	//   97  177:aload           5
	//   98  179:invokevirtual   #267 <Method Object LinkedHashMap.put(Object, Object)>
	//   99  182:pop             
		linkedhashmap.put(((Object) (s1)), obj2);
	//  100  183:aload           6
	//  101  185:aload           7
	//  102  187:aload           8
	//  103  189:invokevirtual   #267 <Method Object LinkedHashMap.put(Object, Object)>
	//  104  192:pop             
		obj = ((Object) (s));
	//  105  193:aload           4
	//  106  195:astore_3        
		do
		{
			jsonparser.nextToken();
	//  107  196:aload_1         
	//  108  197:invokevirtual   #200 <Method JsonToken JsonParser.nextToken()>
	//  109  200:pop             
			linkedhashmap.put(obj, deserialize(jsonparser, deserializationcontext));
	//  110  201:aload           6
	//  111  203:aload_3         
	//  112  204:aload_0         
	//  113  205:aload_1         
	//  114  206:aload_2         
	//  115  207:invokevirtual   #212 <Method Object deserialize(JsonParser, DeserializationContext)>
	//  116  210:invokevirtual   #267 <Method Object LinkedHashMap.put(Object, Object)>
	//  117  213:pop             
			s = jsonparser.nextFieldName();
	//  118  214:aload_1         
	//  119  215:invokevirtual   #245 <Method String JsonParser.nextFieldName()>
	//  120  218:astore          4
			obj = ((Object) (s));
	//  121  220:aload           4
	//  122  222:astore_3        
		} while(s != null);
	//  123  223:aload           4
	//  124  225:ifnonnull       196
		return ((Object) (linkedhashmap));
	//  125  228:aload           6
	//  126  230:areturn         
	}

	public void resolve(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		JavaType javatype = deserializationcontext.constructType(java/lang/Object);
	//    0    0:aload_1         
	//    1    1:ldc1            #35  <Class Object>
	//    2    3:invokevirtual   #275 <Method JavaType DeserializationContext.constructType(Class)>
	//    3    6:astore_2        
		JavaType javatype1 = deserializationcontext.constructType(java/lang/String);
	//    4    7:aload_1         
	//    5    8:ldc2            #277 <Class String>
	//    6   11:invokevirtual   #275 <Method JavaType DeserializationContext.constructType(Class)>
	//    7   14:astore_3        
		TypeFactory typefactory = deserializationcontext.getTypeFactory();
	//    8   15:aload_1         
	//    9   16:invokevirtual   #281 <Method TypeFactory DeserializationContext.getTypeFactory()>
	//   10   19:astore          4
		if(_listType == null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #50  <Field JavaType _listType>
	//*  13   25:ifnonnull       176
			_listDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationcontext, ((JavaType) (typefactory.constructCollectionType(java/util/List, javatype)))));
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:aload           4
	//   19   34:ldc2            #283 <Class List>
	//   20   37:aload_2         
	//   21   38:invokevirtual   #289 <Method com.fasterxml.jackson.databind.type.CollectionType TypeFactory.constructCollectionType(Class, JavaType)>
	//   22   41:invokevirtual   #291 <Method JsonDeserializer _findCustomDeser(DeserializationContext, JavaType)>
	//   23   44:invokevirtual   #293 <Method JsonDeserializer _clearIfStdImpl(JsonDeserializer)>
	//   24   47:putfield        #57  <Field JsonDeserializer _listDeserializer>
		else
	//*  25   50:aload_0         
	//*  26   51:getfield        #52  <Field JavaType _mapType>
	//*  27   54:ifnonnull       192
	//*  28   57:aload_0         
	//*  29   58:aload_0         
	//*  30   59:aload_0         
	//*  31   60:aload_1         
	//*  32   61:aload           4
	//*  33   63:ldc2            #295 <Class Map>
	//*  34   66:aload_3         
	//*  35   67:aload_2         
	//*  36   68:invokevirtual   #299 <Method com.fasterxml.jackson.databind.type.MapType TypeFactory.constructMapType(Class, JavaType, JavaType)>
	//*  37   71:invokevirtual   #291 <Method JsonDeserializer _findCustomDeser(DeserializationContext, JavaType)>
	//*  38   74:invokevirtual   #293 <Method JsonDeserializer _clearIfStdImpl(JsonDeserializer)>
	//*  39   77:putfield        #55  <Field JsonDeserializer _mapDeserializer>
	//*  40   80:aload_0         
	//*  41   81:aload_0         
	//*  42   82:aload_0         
	//*  43   83:aload_1         
	//*  44   84:aload_3         
	//*  45   85:invokevirtual   #291 <Method JsonDeserializer _findCustomDeser(DeserializationContext, JavaType)>
	//*  46   88:invokevirtual   #293 <Method JsonDeserializer _clearIfStdImpl(JsonDeserializer)>
	//*  47   91:putfield        #59  <Field JsonDeserializer _stringDeserializer>
	//*  48   94:aload_0         
	//*  49   95:aload_0         
	//*  50   96:aload_0         
	//*  51   97:aload_1         
	//*  52   98:aload           4
	//*  53  100:ldc2            #301 <Class Number>
	//*  54  103:invokevirtual   #304 <Method JavaType TypeFactory.constructType(java.lang.reflect.Type)>
	//*  55  106:invokevirtual   #291 <Method JsonDeserializer _findCustomDeser(DeserializationContext, JavaType)>
	//*  56  109:invokevirtual   #293 <Method JsonDeserializer _clearIfStdImpl(JsonDeserializer)>
	//*  57  112:putfield        #61  <Field JsonDeserializer _numberDeserializer>
	//*  58  115:invokestatic    #308 <Method JavaType TypeFactory.unknownType()>
	//*  59  118:astore_2        
	//*  60  119:aload_0         
	//*  61  120:aload_1         
	//*  62  121:aload_0         
	//*  63  122:getfield        #55  <Field JsonDeserializer _mapDeserializer>
	//*  64  125:aconst_null     
	//*  65  126:aload_2         
	//*  66  127:invokevirtual   #312 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//*  67  130:putfield        #55  <Field JsonDeserializer _mapDeserializer>
	//*  68  133:aload_0         
	//*  69  134:aload_1         
	//*  70  135:aload_0         
	//*  71  136:getfield        #57  <Field JsonDeserializer _listDeserializer>
	//*  72  139:aconst_null     
	//*  73  140:aload_2         
	//*  74  141:invokevirtual   #312 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//*  75  144:putfield        #57  <Field JsonDeserializer _listDeserializer>
	//*  76  147:aload_0         
	//*  77  148:aload_1         
	//*  78  149:aload_0         
	//*  79  150:getfield        #59  <Field JsonDeserializer _stringDeserializer>
	//*  80  153:aconst_null     
	//*  81  154:aload_2         
	//*  82  155:invokevirtual   #312 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//*  83  158:putfield        #59  <Field JsonDeserializer _stringDeserializer>
	//*  84  161:aload_0         
	//*  85  162:aload_1         
	//*  86  163:aload_0         
	//*  87  164:getfield        #61  <Field JsonDeserializer _numberDeserializer>
	//*  88  167:aconst_null     
	//*  89  168:aload_2         
	//*  90  169:invokevirtual   #312 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//*  91  172:putfield        #61  <Field JsonDeserializer _numberDeserializer>
	//*  92  175:return          
			_listDeserializer = _findCustomDeser(deserializationcontext, _listType);
	//   93  176:aload_0         
	//   94  177:aload_0         
	//   95  178:aload_1         
	//   96  179:aload_0         
	//   97  180:getfield        #50  <Field JavaType _listType>
	//   98  183:invokevirtual   #291 <Method JsonDeserializer _findCustomDeser(DeserializationContext, JavaType)>
	//   99  186:putfield        #57  <Field JsonDeserializer _listDeserializer>
		if(_mapType == null)
			_mapDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationcontext, ((JavaType) (typefactory.constructMapType(java/util/Map, javatype1, javatype)))));
		else
	//* 100  189:goto            50
			_mapDeserializer = _findCustomDeser(deserializationcontext, _mapType);
	//  101  192:aload_0         
	//  102  193:aload_0         
	//  103  194:aload_1         
	//  104  195:aload_0         
	//  105  196:getfield        #52  <Field JavaType _mapType>
	//  106  199:invokevirtual   #291 <Method JsonDeserializer _findCustomDeser(DeserializationContext, JavaType)>
	//  107  202:putfield        #55  <Field JsonDeserializer _mapDeserializer>
		_stringDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationcontext, javatype1));
		_numberDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationcontext, typefactory.constructType(java/lang/Number)));
		javatype = TypeFactory.unknownType();
		_mapDeserializer = deserializationcontext.handleSecondaryContextualization(_mapDeserializer, ((BeanProperty) (null)), javatype);
		_listDeserializer = deserializationcontext.handleSecondaryContextualization(_listDeserializer, ((BeanProperty) (null)), javatype);
		_stringDeserializer = deserializationcontext.handleSecondaryContextualization(_stringDeserializer, ((BeanProperty) (null)), javatype);
		_numberDeserializer = deserializationcontext.handleSecondaryContextualization(_numberDeserializer, ((BeanProperty) (null)), javatype);
	//* 108  205:goto            80
	}

	protected static final Object NO_OBJECTS[] = new Object[0];
	public static final UntypedObjectDeserializer instance = new UntypedObjectDeserializer(((JavaType) (null)), ((JavaType) (null)));
	private static final long serialVersionUID = 1L;
	protected JsonDeserializer _listDeserializer;
	protected JavaType _listType;
	protected JsonDeserializer _mapDeserializer;
	protected JavaType _mapType;
	protected JsonDeserializer _numberDeserializer;
	protected JsonDeserializer _stringDeserializer;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       Object[]
	//    2    4:putstatic       #37  <Field Object[] NO_OBJECTS>
	//    3    7:new             #2   <Class UntypedObjectDeserializer>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:aconst_null     
	//    7   13:invokespecial   #41  <Method void UntypedObjectDeserializer(JavaType, JavaType)>
	//    8   16:putstatic       #43  <Field UntypedObjectDeserializer instance>
	//*   9   19:return          
	}
}
