// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;
import java.math.BigDecimal;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdScalarDeserializer, NumberDeserializers

public static class NumberDeserializers$BigDecimalDeserializer extends StdScalarDeserializer
{

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #33  <Method BigDecimal deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public BigDecimal deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
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
	//*   5    7:icmpeq          123
		{
			switch(i)
	//*   6   10:iload_3         
			{
	//*   7   11:tableswitch     6 8: default 36
	//	               6 54
	//	               7 49
	//	               8 49
			default:
				return (BigDecimal)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
	//    8   36:aload_2         
	//    9   37:aload_0         
	//   10   38:getfield        #46  <Field Class _valueClass>
	//   11   41:aload_1         
	//   12   42:invokevirtual   #52  <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   13   45:checkcast       #21  <Class BigDecimal>
	//   14   48:areturn         

			case 7: // '\007'
			case 8: // '\b'
				return jsonparser.getDecimalValue();
	//   15   49:aload_1         
	//   16   50:invokevirtual   #56  <Method BigDecimal JsonParser.getDecimalValue()>
	//   17   53:areturn         

			case 6: // '\006'
				jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   18   54:aload_1         
	//   19   55:invokevirtual   #60  <Method String JsonParser.getText()>
	//   20   58:invokevirtual   #65  <Method String String.trim()>
	//   21   61:astore_1        
				break;
			}
			if(_isEmptyOrTextualNull(((String) (jsonparser))))
	//*  22   62:aload_0         
	//*  23   63:aload_1         
	//*  24   64:invokevirtual   #69  <Method boolean _isEmptyOrTextualNull(String)>
	//*  25   67:ifeq            85
			{
				_verifyNullForScalarCoercion(deserializationcontext, ((String) (jsonparser)));
	//   26   70:aload_0         
	//   27   71:aload_2         
	//   28   72:aload_1         
	//   29   73:invokevirtual   #73  <Method void _verifyNullForScalarCoercion(DeserializationContext, String)>
				return (BigDecimal)getNullValue(deserializationcontext);
	//   30   76:aload_0         
	//   31   77:aload_2         
	//   32   78:invokevirtual   #77  <Method Object getNullValue(DeserializationContext)>
	//   33   81:checkcast       #21  <Class BigDecimal>
	//   34   84:areturn         
			}
			_verifyStringForScalarCoercion(deserializationcontext, ((String) (jsonparser)));
	//   35   85:aload_0         
	//   36   86:aload_2         
	//   37   87:aload_1         
	//   38   88:invokevirtual   #80  <Method void _verifyStringForScalarCoercion(DeserializationContext, String)>
			BigDecimal bigdecimal;
			try
			{
				bigdecimal = new BigDecimal(((String) (jsonparser)));
	//   39   91:new             #21  <Class BigDecimal>
	//   40   94:dup             
	//   41   95:aload_1         
	//   42   96:invokespecial   #83  <Method void BigDecimal(String)>
	//   43   99:astore          4
			}
	//*  44  101:aload           4
	//*  45  103:areturn         
	//*  46  104:aload_2         
	//*  47  105:aload_0         
	//*  48  106:getfield        #46  <Field Class _valueClass>
	//*  49  109:aload_1         
	//*  50  110:ldc1            #85  <String "not a valid representation">
	//*  51  112:iconst_0        
	//*  52  113:anewarray       Object[]
	//*  53  116:invokevirtual   #91  <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//*  54  119:checkcast       #21  <Class BigDecimal>
	//*  55  122:areturn         
	//*  56  123:aload_0         
	//*  57  124:aload_1         
	//*  58  125:aload_2         
	//*  59  126:invokevirtual   #94  <Method Object _deserializeFromArray(JsonParser, DeserializationContext)>
	//*  60  129:checkcast       #21  <Class BigDecimal>
	//*  61  132:areturn         
			// Misplaced declaration of an exception variable
			catch(IllegalArgumentException illegalargumentexception)
			{
				return (BigDecimal)deserializationcontext.handleWeirdStringValue(_valueClass, ((String) (jsonparser)), "not a valid representation", new Object[0]);
			}
			return bigdecimal;
		} else
		{
			return (BigDecimal)_deserializeFromArray(jsonparser, deserializationcontext);
		}
	//*  62  133:astore          4
	//*  63  135:goto            104
	}

	public Object getEmptyValue(DeserializationContext deserializationcontext)
	{
		return ((Object) (BigDecimal.ZERO));
	//    0    0:getstatic       #99  <Field BigDecimal BigDecimal.ZERO>
	//    1    3:areturn         
	}

	public static final NumberDeserializers$BigDecimalDeserializer instance = new NumberDeserializers$BigDecimalDeserializer();

	static 
	{
	//    0    0:new             #2   <Class NumberDeserializers$BigDecimalDeserializer>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void NumberDeserializers$BigDecimalDeserializer()>
	//    3    7:putstatic       #18  <Field NumberDeserializers$BigDecimalDeserializer instance>
	//*   4   10:return          
	}

	public NumberDeserializers$BigDecimalDeserializer()
	{
		super(java/math/BigDecimal);
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <Class BigDecimal>
	//    2    3:invokespecial   #24  <Method void StdScalarDeserializer(Class)>
	//    3    6:return          
	}
}
