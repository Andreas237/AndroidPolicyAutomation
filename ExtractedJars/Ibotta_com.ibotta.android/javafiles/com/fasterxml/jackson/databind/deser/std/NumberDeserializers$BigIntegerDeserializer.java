// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
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
		IllegalArgumentException illegalargumentexception;
		int i = jsonparser.getCurrentTokenId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #42  <Method int JsonParser.getCurrentTokenId()>
	//    2    4:istore_3        
		if(i != 3)
	//*   3    5:iload_3         
	//*   4    6:iconst_3        
	//*   5    7:icmpeq          194
		{
			switch(i)
	//*   6   10:iload_3         
			{
	//*   7   11:tableswitch     6 8: default 36
	//	               6 125
	//	               7 65
	//	               8 39
	//*   8   36:goto            112
			case 8: // '\b'
				if(!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT))
	//*   9   39:aload_2         
	//*  10   40:getstatic       #48  <Field DeserializationFeature DeserializationFeature.ACCEPT_FLOAT_AS_INT>
	//*  11   43:invokevirtual   #54  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  12   46:ifne            57
					_failDoubleToIntCoercion(jsonparser, deserializationcontext, "java.math.BigInteger");
	//   13   49:aload_0         
	//   14   50:aload_1         
	//   15   51:aload_2         
	//   16   52:ldc1            #56  <String "java.math.BigInteger">
	//   17   54:invokevirtual   #60  <Method void _failDoubleToIntCoercion(JsonParser, DeserializationContext, String)>
				return jsonparser.getDecimalValue().toBigInteger();
	//   18   57:aload_1         
	//   19   58:invokevirtual   #64  <Method BigDecimal JsonParser.getDecimalValue()>
	//   20   61:invokevirtual   #70  <Method BigInteger BigDecimal.toBigInteger()>
	//   21   64:areturn         

			case 7: // '\007'
				switch(NumberDeserializers._cls1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[jsonparser.getNumberType().ordinal()])
	//*  22   65:getstatic       #76  <Field int[] NumberDeserializers$1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
	//*  23   68:aload_1         
	//*  24   69:invokevirtual   #80  <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
	//*  25   72:invokevirtual   #85  <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
	//*  26   75:iaload          
				{
	//*  27   76:tableswitch     1 3: default 104
	//	               1 107
	//	               2 107
	//	               3 107
	//*  28  104:goto            112
				case 1: // '\001'
				case 2: // '\002'
				case 3: // '\003'
					return jsonparser.getBigIntegerValue();
	//   29  107:aload_1         
	//   30  108:invokevirtual   #88  <Method BigInteger JsonParser.getBigIntegerValue()>
	//   31  111:areturn         
				}
				// fall through

			default:
				return (BigInteger)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
	//   32  112:aload_2         
	//   33  113:aload_0         
	//   34  114:getfield        #92  <Field Class _valueClass>
	//   35  117:aload_1         
	//   36  118:invokevirtual   #96  <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   37  121:checkcast       #21  <Class BigInteger>
	//   38  124:areturn         

			case 6: // '\006'
				jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   39  125:aload_1         
	//   40  126:invokevirtual   #100 <Method String JsonParser.getText()>
	//   41  129:invokevirtual   #105 <Method String String.trim()>
	//   42  132:astore_1        
				break;
			}
			if(_isEmptyOrTextualNull(((String) (jsonparser))))
	//*  43  133:aload_0         
	//*  44  134:aload_1         
	//*  45  135:invokevirtual   #109 <Method boolean _isEmptyOrTextualNull(String)>
	//*  46  138:ifeq            156
			{
				_verifyNullForScalarCoercion(deserializationcontext, ((String) (jsonparser)));
	//   47  141:aload_0         
	//   48  142:aload_2         
	//   49  143:aload_1         
	//   50  144:invokevirtual   #113 <Method void _verifyNullForScalarCoercion(DeserializationContext, String)>
				return (BigInteger)getNullValue(deserializationcontext);
	//   51  147:aload_0         
	//   52  148:aload_2         
	//   53  149:invokevirtual   #117 <Method Object getNullValue(DeserializationContext)>
	//   54  152:checkcast       #21  <Class BigInteger>
	//   55  155:areturn         
			}
			_verifyStringForScalarCoercion(deserializationcontext, ((String) (jsonparser)));
	//   56  156:aload_0         
	//   57  157:aload_2         
	//   58  158:aload_1         
	//   59  159:invokevirtual   #120 <Method void _verifyStringForScalarCoercion(DeserializationContext, String)>
			BigInteger biginteger;
			try
			{
				biginteger = new BigInteger(((String) (jsonparser)));
	//   60  162:new             #21  <Class BigInteger>
	//   61  165:dup             
	//   62  166:aload_1         
	//   63  167:invokespecial   #123 <Method void BigInteger(String)>
	//   64  170:astore          4
			}
	//*  65  172:aload           4
	//*  66  174:areturn         
	//*  67  175:aload_2         
	//*  68  176:aload_0         
	//*  69  177:getfield        #92  <Field Class _valueClass>
	//*  70  180:aload_1         
	//*  71  181:ldc1            #125 <String "not a valid representation">
	//*  72  183:iconst_0        
	//*  73  184:anewarray       Object[]
	//*  74  187:invokevirtual   #131 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//*  75  190:checkcast       #21  <Class BigInteger>
	//*  76  193:areturn         
	//*  77  194:aload_0         
	//*  78  195:aload_1         
	//*  79  196:aload_2         
	//*  80  197:invokevirtual   #134 <Method Object _deserializeFromArray(JsonParser, DeserializationContext)>
	//*  81  200:checkcast       #21  <Class BigInteger>
	//*  82  203:areturn         
			// Misplaced declaration of an exception variable
			catch(IllegalArgumentException illegalargumentexception)
			{
				return (BigInteger)deserializationcontext.handleWeirdStringValue(_valueClass, ((String) (jsonparser)), "not a valid representation", new Object[0]);
			}
			return biginteger;
		} else
		{
			return (BigInteger)_deserializeFromArray(jsonparser, deserializationcontext);
		}
	//*  83  204:astore          4
	//*  84  206:goto            175
	}

	public Object getEmptyValue(DeserializationContext deserializationcontext)
	{
		return ((Object) (BigInteger.ZERO));
	//    0    0:getstatic       #139 <Field BigInteger BigInteger.ZERO>
	//    1    3:areturn         
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
