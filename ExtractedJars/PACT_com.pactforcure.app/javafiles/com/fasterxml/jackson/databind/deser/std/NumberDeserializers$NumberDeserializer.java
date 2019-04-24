// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdScalarDeserializer, NumberDeserializers

public static class NumberDeserializers$NumberDeserializer extends StdScalarDeserializer
{

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		jsonparser.getCurrentTokenId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #36  <Method int JsonParser.getCurrentTokenId()>
		JVM INSTR tableswitch 3 8: default 44
	//	               3 301
	//	               4 44
	//	               5 44
	//	               6 106
	//	               7 57
	//	               8 83;
	//    2    4:tableswitch     3 8: default 44
	//	               3 301
	//	               4 44
	//	               5 44
	//	               6 106
	//	               7 57
	//	               8 83
		   goto _L1 _L2 _L1 _L1 _L3 _L4 _L5
_L1:
		throw deserializationcontext.mappingException(_valueClass, jsonparser.getCurrentToken());
	//    3   44:aload_2         
	//    4   45:aload_0         
	//    5   46:getfield        #40  <Field Class _valueClass>
	//    6   49:aload_1         
	//    7   50:invokevirtual   #44  <Method JsonToken JsonParser.getCurrentToken()>
	//    8   53:invokevirtual   #50  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//    9   56:athrow          
_L4:
		if(!deserializationcontext.hasSomeOfFeatures(F_MASK_INT_COERCIONS)) goto _L7; else goto _L6
	//   10   57:aload_2         
	//   11   58:getstatic       #54  <Field int F_MASK_INT_COERCIONS>
	//   12   61:invokevirtual   #58  <Method boolean DeserializationContext.hasSomeOfFeatures(int)>
	//   13   64:ifeq            78
_L6:
		Object obj = _coerceIntegral(jsonparser, deserializationcontext);
	//   14   67:aload_0         
	//   15   68:aload_1         
	//   16   69:aload_2         
	//   17   70:invokevirtual   #61  <Method Object _coerceIntegral(JsonParser, DeserializationContext)>
	//   18   73:astore          5
_L9:
		return obj;
	//   19   75:aload           5
	//   20   77:areturn         
_L7:
		return ((Object) (jsonparser.getNumberValue()));
	//   21   78:aload_1         
	//   22   79:invokevirtual   #65  <Method Number JsonParser.getNumberValue()>
	//   23   82:areturn         
_L5:
		if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
	//*  24   83:aload_2         
	//*  25   84:getstatic       #71  <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
	//*  26   87:invokevirtual   #75  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  27   90:ifeq            98
			return ((Object) (jsonparser.getDecimalValue()));
	//   28   93:aload_1         
	//   29   94:invokevirtual   #79  <Method BigDecimal JsonParser.getDecimalValue()>
	//   30   97:areturn         
		else
			return ((Object) (Double.valueOf(jsonparser.getDoubleValue())));
	//   31   98:aload_1         
	//   32   99:invokevirtual   #83  <Method double JsonParser.getDoubleValue()>
	//   33  102:invokestatic    #89  <Method Double Double.valueOf(double)>
	//   34  105:areturn         
_L3:
		jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   35  106:aload_1         
	//   36  107:invokevirtual   #93  <Method String JsonParser.getText()>
	//   37  110:invokevirtual   #98  <Method String String.trim()>
	//   38  113:astore_1        
		if(((String) (jsonparser)).length() == 0)
	//*  39  114:aload_1         
	//*  40  115:invokevirtual   #101 <Method int String.length()>
	//*  41  118:ifne            127
			return getEmptyValue(deserializationcontext);
	//   42  121:aload_0         
	//   43  122:aload_2         
	//   44  123:invokevirtual   #105 <Method Object getEmptyValue(DeserializationContext)>
	//   45  126:areturn         
		if(_hasTextualNull(((String) (jsonparser))))
	//*  46  127:aload_0         
	//*  47  128:aload_1         
	//*  48  129:invokevirtual   #109 <Method boolean _hasTextualNull(String)>
	//*  49  132:ifeq            141
			return getNullValue(deserializationcontext);
	//   50  135:aload_0         
	//   51  136:aload_2         
	//   52  137:invokevirtual   #112 <Method Object getNullValue(DeserializationContext)>
	//   53  140:areturn         
		if(_isPosInf(((String) (jsonparser))))
	//*  54  141:aload_0         
	//*  55  142:aload_1         
	//*  56  143:invokevirtual   #115 <Method boolean _isPosInf(String)>
	//*  57  146:ifeq            156
			return ((Object) (Double.valueOf((1.0D / 0.0D))));
	//   58  149:ldc2w           #116 <Double (1.0D / 0.0D)>
	//   59  152:invokestatic    #89  <Method Double Double.valueOf(double)>
	//   60  155:areturn         
		if(_isNegInf(((String) (jsonparser))))
	//*  61  156:aload_0         
	//*  62  157:aload_1         
	//*  63  158:invokevirtual   #120 <Method boolean _isNegInf(String)>
	//*  64  161:ifeq            171
			return ((Object) (Double.valueOf((-1.0D / 0.0D))));
	//   65  164:ldc2w           #121 <Double (-1.0D / 0.0D)>
	//   66  167:invokestatic    #89  <Method Double Double.valueOf(double)>
	//   67  170:areturn         
		if(_isNaN(((String) (jsonparser))))
	//*  68  171:aload_0         
	//*  69  172:aload_1         
	//*  70  173:invokevirtual   #125 <Method boolean _isNaN(String)>
	//*  71  176:ifeq            186
			return ((Object) (Double.valueOf((0.0D / 0.0D))));
	//   72  179:ldc2w           #126 <Double (0.0D / 0.0D)>
	//   73  182:invokestatic    #89  <Method Double Double.valueOf(double)>
	//   74  185:areturn         
		if(_isIntNumber(((String) (jsonparser))))
			break MISSING_BLOCK_LABEL_240;
	//   75  186:aload_0         
	//   76  187:aload_1         
	//   77  188:invokevirtual   #130 <Method boolean _isIntNumber(String)>
	//   78  191:ifne            240
		if(!deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
			break MISSING_BLOCK_LABEL_231;
	//   79  194:aload_2         
	//   80  195:getstatic       #71  <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
	//   81  198:invokevirtual   #75  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//   82  201:ifeq            231
		obj = ((Object) (new BigDecimal(((String) (jsonparser)))));
	//   83  204:new             #132 <Class BigDecimal>
	//   84  207:dup             
	//   85  208:aload_1         
	//   86  209:invokespecial   #135 <Method void BigDecimal(String)>
	//   87  212:astore          5
		return obj;
	//   88  214:aload           5
	//   89  216:areturn         
	//*  90  217:astore          5
	//*  91  219:aload_2         
	//*  92  220:aload_1         
	//*  93  221:aload_0         
	//*  94  222:getfield        #40  <Field Class _valueClass>
	//*  95  225:ldc1            #137 <String "not a valid number">
	//*  96  227:invokevirtual   #141 <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//*  97  230:athrow          
		return ((Object) (new Double(((String) (jsonparser)))));
	//   98  231:new             #85  <Class Double>
	//   99  234:dup             
	//  100  235:aload_1         
	//  101  236:invokespecial   #142 <Method void Double(String)>
	//  102  239:areturn         
		long l;
		if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS))
	//* 103  240:aload_2         
	//* 104  241:getstatic       #145 <Field DeserializationFeature DeserializationFeature.USE_BIG_INTEGER_FOR_INTS>
	//* 105  244:invokevirtual   #75  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//* 106  247:ifeq            259
			return ((Object) (new BigInteger(((String) (jsonparser)))));
	//  107  250:new             #147 <Class BigInteger>
	//  108  253:dup             
	//  109  254:aload_1         
	//  110  255:invokespecial   #148 <Method void BigInteger(String)>
	//  111  258:areturn         
		l = Long.parseLong(((String) (jsonparser)));
	//  112  259:aload_1         
	//  113  260:invokestatic    #154 <Method long Long.parseLong(String)>
	//  114  263:lstore_3        
		if(!deserializationcontext.isEnabled(DeserializationFeature.USE_LONG_FOR_INTS) && l <= 0x7fffffffL && l >= 0x80000000L)
	//* 115  264:aload_2         
	//* 116  265:getstatic       #157 <Field DeserializationFeature DeserializationFeature.USE_LONG_FOR_INTS>
	//* 117  268:invokevirtual   #75  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//* 118  271:ifne            296
	//* 119  274:lload_3         
	//* 120  275:ldc2w           #158 <Long 0x7fffffffL>
	//* 121  278:lcmp            
	//* 122  279:ifgt            296
	//* 123  282:lload_3         
	//* 124  283:ldc2w           #160 <Long 0x80000000L>
	//* 125  286:lcmp            
	//* 126  287:iflt            296
			try
			{
				return ((Object) (Integer.valueOf((int)l)));
	//  127  290:lload_3         
	//  128  291:l2i             
	//  129  292:invokestatic    #166 <Method Integer Integer.valueOf(int)>
	//  130  295:areturn         
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
			{
				throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, "not a valid number");
			}
		else
			return ((Object) (Long.valueOf(l)));
	//  131  296:lload_3         
	//  132  297:invokestatic    #169 <Method Long Long.valueOf(long)>
	//  133  300:areturn         
_L2:
		if(!deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
			continue; /* Loop/switch isn't completed */
	//  134  301:aload_2         
	//  135  302:getstatic       #172 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//  136  305:invokevirtual   #75  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//  137  308:ifeq            44
		jsonparser.nextToken();
	//  138  311:aload_1         
	//  139  312:invokevirtual   #175 <Method JsonToken JsonParser.nextToken()>
	//  140  315:pop             
		obj = deserialize(jsonparser, deserializationcontext);
	//  141  316:aload_0         
	//  142  317:aload_1         
	//  143  318:aload_2         
	//  144  319:invokevirtual   #177 <Method Object deserialize(JsonParser, DeserializationContext)>
	//  145  322:astore          5
		if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//* 146  324:aload_1         
	//* 147  325:invokevirtual   #175 <Method JsonToken JsonParser.nextToken()>
	//* 148  328:getstatic       #183 <Field JsonToken JsonToken.END_ARRAY>
	//* 149  331:if_acmpeq       75
			throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, (new StringBuilder()).append("Attempted to unwrap single value array for single '").append(_valueClass.getName()).append("' value but there was more than a single value in the array").toString());
	//  150  334:aload_2         
	//  151  335:aload_1         
	//  152  336:getstatic       #183 <Field JsonToken JsonToken.END_ARRAY>
	//  153  339:new             #185 <Class StringBuilder>
	//  154  342:dup             
	//  155  343:invokespecial   #186 <Method void StringBuilder()>
	//  156  346:ldc1            #188 <String "Attempted to unwrap single value array for single '">
	//  157  348:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//  158  351:aload_0         
	//  159  352:getfield        #40  <Field Class _valueClass>
	//  160  355:invokevirtual   #197 <Method String Class.getName()>
	//  161  358:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//  162  361:ldc1            #199 <String "' value but there was more than a single value in the array">
	//  163  363:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//  164  366:invokevirtual   #202 <Method String StringBuilder.toString()>
	//  165  369:invokevirtual   #206 <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//  166  372:athrow          
		if(true) goto _L9; else goto _L8
_L8:
		if(true) goto _L1; else goto _L10
_L10:
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		switch(jsonparser.getCurrentTokenId())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #36  <Method int JsonParser.getCurrentTokenId()>
		{
	//*   2    4:tableswitch     6 8: default 32
	//	               6 39
	//	               7 39
	//	               8 39
		default:
			return typedeserializer.deserializeTypedFromScalar(jsonparser, deserializationcontext);
	//    3   32:aload_3         
	//    4   33:aload_1         
	//    5   34:aload_2         
	//    6   35:invokevirtual   #214 <Method Object TypeDeserializer.deserializeTypedFromScalar(JsonParser, DeserializationContext)>
	//    7   38:areturn         

		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
			return deserialize(jsonparser, deserializationcontext);
	//    8   39:aload_0         
	//    9   40:aload_1         
	//   10   41:aload_2         
	//   11   42:invokevirtual   #177 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   12   45:areturn         
		}
	}

	public static final NumberDeserializers$NumberDeserializer instance = new NumberDeserializers$NumberDeserializer();

	static 
	{
	//    0    0:new             #2   <Class NumberDeserializers$NumberDeserializer>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void NumberDeserializers$NumberDeserializer()>
	//    3    7:putstatic       #18  <Field NumberDeserializers$NumberDeserializer instance>
	//*   4   10:return          
	}

	public NumberDeserializers$NumberDeserializer()
	{
		super(java/lang/Number);
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <Class Number>
	//    2    3:invokespecial   #24  <Method void StdScalarDeserializer(Class)>
	//    3    6:return          
	}
}
