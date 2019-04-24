// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdScalarDeserializer, NumberDeserializers

public static class NumberDeserializers$BigIntegerDeserializer extends StdScalarDeserializer
{

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #33  <Method BigInteger deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public BigInteger deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		jsonparser.getCurrentTokenId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #42  <Method int JsonParser.getCurrentTokenId()>
		JVM INSTR tableswitch 3 8: default 44
	//	               3 132
	//	               4 44
	//	               5 44
	//	               6 175
	//	               7 57
	//	               8 106;
	//    2    4:tableswitch     3 8: default 44
	//	               3 132
	//	               4 44
	//	               5 44
	//	               6 175
	//	               7 57
	//	               8 106
		   goto _L1 _L2 _L1 _L1 _L3 _L4 _L5
_L7:
		throw deserializationcontext.mappingException(_valueClass, jsonparser.getCurrentToken());
	//    3   44:aload_2         
	//    4   45:aload_0         
	//    5   46:getfield        #46  <Field Class _valueClass>
	//    6   49:aload_1         
	//    7   50:invokevirtual   #50  <Method JsonToken JsonParser.getCurrentToken()>
	//    8   53:invokevirtual   #56  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//    9   56:athrow          
_L4:
		BigInteger biginteger;
		switch(NumberDeserializers._cls1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[jsonparser.getNumberType().ordinal()])
	//*  10   57:getstatic       #62  <Field int[] NumberDeserializers$1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
	//*  11   60:aload_1         
	//*  12   61:invokevirtual   #66  <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
	//*  13   64:invokevirtual   #71  <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
	//*  14   67:iaload          
		{
		default:
			break;

	//*  15   68:tableswitch     1 3: default 96
	//	               1 99
	//	               2 99
	//	               3 99
	//*  16   96:goto            44
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
			biginteger = jsonparser.getBigIntegerValue();
	//   17   99:aload_1         
	//   18  100:invokevirtual   #75  <Method BigInteger JsonParser.getBigIntegerValue()>
	//   19  103:astore_3        
			break; /* Loop/switch isn't completed */
		}
_L1:
		if(true) goto _L7; else goto _L6
_L6:
		return biginteger;
	//   20  104:aload_3         
	//   21  105:areturn         
_L5:
		if(!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT))
	//*  22  106:aload_2         
	//*  23  107:getstatic       #81  <Field DeserializationFeature DeserializationFeature.ACCEPT_FLOAT_AS_INT>
	//*  24  110:invokevirtual   #85  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  25  113:ifne            124
			_failDoubleToIntCoercion(jsonparser, deserializationcontext, "java.math.BigInteger");
	//   26  116:aload_0         
	//   27  117:aload_1         
	//   28  118:aload_2         
	//   29  119:ldc1            #87  <String "java.math.BigInteger">
	//   30  121:invokevirtual   #91  <Method void _failDoubleToIntCoercion(JsonParser, DeserializationContext, String)>
		return jsonparser.getDecimalValue().toBigInteger();
	//   31  124:aload_1         
	//   32  125:invokevirtual   #95  <Method BigDecimal JsonParser.getDecimalValue()>
	//   33  128:invokevirtual   #100 <Method BigInteger BigDecimal.toBigInteger()>
	//   34  131:areturn         
_L2:
		if(!deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) goto _L7; else goto _L8
	//   35  132:aload_2         
	//   36  133:getstatic       #103 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//   37  136:invokevirtual   #85  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//   38  139:ifeq            44
_L8:
		jsonparser.nextToken();
	//   39  142:aload_1         
	//   40  143:invokevirtual   #106 <Method JsonToken JsonParser.nextToken()>
	//   41  146:pop             
		biginteger = deserialize(jsonparser, deserializationcontext);
	//   42  147:aload_0         
	//   43  148:aload_1         
	//   44  149:aload_2         
	//   45  150:invokevirtual   #33  <Method BigInteger deserialize(JsonParser, DeserializationContext)>
	//   46  153:astore_3        
		if(jsonparser.nextToken() == JsonToken.END_ARRAY) goto _L6; else goto _L9
	//   47  154:aload_1         
	//   48  155:invokevirtual   #106 <Method JsonToken JsonParser.nextToken()>
	//   49  158:getstatic       #112 <Field JsonToken JsonToken.END_ARRAY>
	//   50  161:if_acmpeq       104
_L9:
		throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'BigInteger' value but there was more than a single value in the array");
	//   51  164:aload_2         
	//   52  165:aload_1         
	//   53  166:getstatic       #112 <Field JsonToken JsonToken.END_ARRAY>
	//   54  169:ldc1            #114 <String "Attempted to unwrap single value array for single 'BigInteger' value but there was more than a single value in the array">
	//   55  171:invokevirtual   #118 <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//   56  174:athrow          
_L3:
		jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   57  175:aload_1         
	//   58  176:invokevirtual   #122 <Method String JsonParser.getText()>
	//   59  179:invokevirtual   #127 <Method String String.trim()>
	//   60  182:astore_1        
		if(((String) (jsonparser)).length() == 0)
	//*  61  183:aload_1         
	//*  62  184:invokevirtual   #130 <Method int String.length()>
	//*  63  187:ifne            192
			return null;
	//   64  190:aconst_null     
	//   65  191:areturn         
		BigInteger biginteger1;
		try
		{
			biginteger1 = new BigInteger(((String) (jsonparser)));
	//   66  192:new             #21  <Class BigInteger>
	//   67  195:dup             
	//   68  196:aload_1         
	//   69  197:invokespecial   #133 <Method void BigInteger(String)>
	//   70  200:astore_3        
		}
	//*  71  201:aload_3         
	//*  72  202:areturn         
		catch(IllegalArgumentException illegalargumentexception)
	//*  73  203:astore_3        
		{
			throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, "not a valid representation");
	//   74  204:aload_2         
	//   75  205:aload_1         
	//   76  206:aload_0         
	//   77  207:getfield        #46  <Field Class _valueClass>
	//   78  210:ldc1            #135 <String "not a valid representation">
	//   79  212:invokevirtual   #139 <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   80  215:athrow          
		}
		return biginteger1;
	}

	public static final NumberDeserializers$BigIntegerDeserializer instance = new NumberDeserializers$BigIntegerDeserializer();

	static 
	{
	//    0    0:new             #2   <Class NumberDeserializers$BigIntegerDeserializer>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void NumberDeserializers$BigIntegerDeserializer()>
	//    3    7:putstatic       #18  <Field NumberDeserializers$BigIntegerDeserializer instance>
	//*   4   10:return          
	}

	public NumberDeserializers$BigIntegerDeserializer()
	{
		super(java/math/BigInteger);
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <Class BigInteger>
	//    2    3:invokespecial   #24  <Method void StdScalarDeserializer(Class)>
	//    3    6:return          
	}
}
