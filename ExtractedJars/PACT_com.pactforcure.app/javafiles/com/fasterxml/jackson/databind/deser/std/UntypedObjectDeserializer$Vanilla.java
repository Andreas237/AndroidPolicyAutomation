// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer, UntypedObjectDeserializer

public static class UntypedObjectDeserializer$Vanilla extends StdDeserializer
{

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		switch(jsonparser.getCurrentTokenId())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #38  <Method int JsonParser.getCurrentTokenId()>
		{
	//*   2    4:tableswitch     1 12: default 68
	//	               1 75
	//	               2 223
	//	               3 101
	//	               4 68
	//	               5 94
	//	               6 163
	//	               7 168
	//	               8 190
	//	               9 213
	//	               10 217
	//	               11 221
	//	               12 158
		case 4: // '\004'
		default:
			throw deserializationcontext.mappingException(java/lang/Object);
	//    3   68:aload_2         
	//    4   69:ldc1            #25  <Class Object>
	//    5   71:invokevirtual   #44  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(Class)>
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
	//	               1 75
	//	               2 68
	//	               3 75
	//	               4 68
	//	               5 75
	//	               6 82
	//	               7 87
	//	               8 107
	//	               9 130
	//	               10 134
	//	               11 143
	//	               12 138
		case 2: // '\002'
		case 4: // '\004'
		default:
			throw deserializationcontext.mappingException(java/lang/Object);
	//    3   68:aload_2         
	//    4   69:ldc1            #25  <Class Object>
	//    5   71:invokevirtual   #44  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(Class)>
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
				objectbuffer.completeAndClearBuffer(aobj, i, ((java.util.List) (jsonparser)));
	//  108  190:aload           8
	//  109  192:aload           6
	//  110  194:iload_3         
	//  111  195:aload_1         
	//  112  196:invokevirtual   #177 <Method void ObjectBuffer.completeAndClearBuffer(Object[], int, java.util.List)>
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
	public static final UntypedObjectDeserializer$Vanilla std = new UntypedObjectDeserializer$Vanilla();

	static 
	{
	//    0    0:new             #2   <Class UntypedObjectDeserializer$Vanilla>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void UntypedObjectDeserializer$Vanilla()>
	//    3    7:putstatic       #22  <Field UntypedObjectDeserializer$Vanilla std>
	//*   4   10:return          
	}

	public UntypedObjectDeserializer$Vanilla()
	{
		super(java/lang/Object);
	//    0    0:aload_0         
	//    1    1:ldc1            #25  <Class Object>
	//    2    3:invokespecial   #28  <Method void StdDeserializer(Class)>
	//    3    6:return          
	}
}
