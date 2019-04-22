// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			NumberDeserializers

public static class NumberDeserializers$ByteDeserializer extends rDeserializer
{

	protected Byte _parseByte(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		IllegalArgumentException illegalargumentexception;
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          4
		if(jsontoken == JsonToken.VALUE_STRING)
	//*   3    6:aload           4
	//*   4    8:getstatic       #60  <Field JsonToken JsonToken.VALUE_STRING>
	//*   5   11:if_acmpne       126
		{
			jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//    6   14:aload_1         
	//    7   15:invokevirtual   #64  <Method String JsonParser.getText()>
	//    8   18:invokevirtual   #69  <Method String String.trim()>
	//    9   21:astore_1        
			if(_hasTextualNull(((String) (jsonparser))))
	//*  10   22:aload_0         
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #73  <Method boolean _hasTextualNull(String)>
	//*  13   27:ifeq            43
				return (Byte)_coerceTextualNull(deserializationcontext, _primitive);
	//   14   30:aload_0         
	//   15   31:aload_2         
	//   16   32:aload_0         
	//   17   33:getfield        #77  <Field boolean _primitive>
	//   18   36:invokevirtual   #81  <Method Object _coerceTextualNull(DeserializationContext, boolean)>
	//   19   39:checkcast       #20  <Class Byte>
	//   20   42:areturn         
			if(((String) (jsonparser)).length() == 0)
	//*  21   43:aload_1         
	//*  22   44:invokevirtual   #85  <Method int String.length()>
	//*  23   47:ifne            63
				return (Byte)_coerceEmptyString(deserializationcontext, _primitive);
	//   24   50:aload_0         
	//   25   51:aload_2         
	//   26   52:aload_0         
	//   27   53:getfield        #77  <Field boolean _primitive>
	//   28   56:invokevirtual   #88  <Method Object _coerceEmptyString(DeserializationContext, boolean)>
	//   29   59:checkcast       #20  <Class Byte>
	//   30   62:areturn         
			_verifyStringForScalarCoercion(deserializationcontext, ((String) (jsonparser)));
	//   31   63:aload_0         
	//   32   64:aload_2         
	//   33   65:aload_1         
	//   34   66:invokevirtual   #92  <Method void _verifyStringForScalarCoercion(DeserializationContext, String)>
			int i;
			try
			{
				i = NumberInput.parseInt(((String) (jsonparser)));
	//   35   69:aload_1         
	//   36   70:invokestatic    #98  <Method int NumberInput.parseInt(String)>
	//   37   73:istore_3        
			}
	//*  38   74:aload_0         
	//*  39   75:iload_3         
	//*  40   76:invokevirtual   #102 <Method boolean _byteOverflow(int)>
	//*  41   79:ifeq            101
	//*  42   82:aload_2         
	//*  43   83:aload_0         
	//*  44   84:getfield        #105 <Field Class _valueClass>
	//*  45   87:aload_1         
	//*  46   88:ldc1            #107 <String "overflow, value cannot be represented as 8-bit value">
	//*  47   90:iconst_0        
	//*  48   91:anewarray       Object[]
	//*  49   94:invokevirtual   #115 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//*  50   97:checkcast       #20  <Class Byte>
	//*  51  100:areturn         
	//*  52  101:iload_3         
	//*  53  102:int2byte        
	//*  54  103:invokestatic    #28  <Method Byte Byte.valueOf(byte)>
	//*  55  106:areturn         
	//*  56  107:aload_2         
	//*  57  108:aload_0         
	//*  58  109:getfield        #105 <Field Class _valueClass>
	//*  59  112:aload_1         
	//*  60  113:ldc1            #117 <String "not a valid Byte value">
	//*  61  115:iconst_0        
	//*  62  116:anewarray       Object[]
	//*  63  119:invokevirtual   #115 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//*  64  122:checkcast       #20  <Class Byte>
	//*  65  125:areturn         
	//*  66  126:aload           4
	//*  67  128:getstatic       #120 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*  68  131:if_acmpne       160
	//*  69  134:aload_2         
	//*  70  135:getstatic       #126 <Field DeserializationFeature DeserializationFeature.ACCEPT_FLOAT_AS_INT>
	//*  71  138:invokevirtual   #130 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  72  141:ifne            152
	//*  73  144:aload_0         
	//*  74  145:aload_1         
	//*  75  146:aload_2         
	//*  76  147:ldc1            #132 <String "Byte">
	//*  77  149:invokevirtual   #136 <Method void _failDoubleToIntCoercion(JsonParser, DeserializationContext, String)>
	//*  78  152:aload_1         
	//*  79  153:invokevirtual   #140 <Method byte JsonParser.getByteValue()>
	//*  80  156:invokestatic    #28  <Method Byte Byte.valueOf(byte)>
	//*  81  159:areturn         
	//*  82  160:aload           4
	//*  83  162:getstatic       #143 <Field JsonToken JsonToken.VALUE_NULL>
	//*  84  165:if_acmpne       181
	//*  85  168:aload_0         
	//*  86  169:aload_2         
	//*  87  170:aload_0         
	//*  88  171:getfield        #77  <Field boolean _primitive>
	//*  89  174:invokevirtual   #146 <Method Object _coerceNullToken(DeserializationContext, boolean)>
	//*  90  177:checkcast       #20  <Class Byte>
	//*  91  180:areturn         
	//*  92  181:aload           4
	//*  93  183:getstatic       #149 <Field JsonToken JsonToken.START_ARRAY>
	//*  94  186:if_acmpne       199
	//*  95  189:aload_0         
	//*  96  190:aload_1         
	//*  97  191:aload_2         
	//*  98  192:invokevirtual   #153 <Method Object _deserializeFromArray(JsonParser, DeserializationContext)>
	//*  99  195:checkcast       #20  <Class Byte>
	//* 100  198:areturn         
	//* 101  199:aload           4
	//* 102  201:getstatic       #156 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//* 103  204:if_acmpne       215
	//* 104  207:aload_1         
	//* 105  208:invokevirtual   #140 <Method byte JsonParser.getByteValue()>
	//* 106  211:invokestatic    #28  <Method Byte Byte.valueOf(byte)>
	//* 107  214:areturn         
	//* 108  215:aload_2         
	//* 109  216:aload_0         
	//* 110  217:getfield        #105 <Field Class _valueClass>
	//* 111  220:aload_1         
	//* 112  221:invokevirtual   #160 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//* 113  224:checkcast       #20  <Class Byte>
	//* 114  227:areturn         
			// Misplaced declaration of an exception variable
			catch(IllegalArgumentException illegalargumentexception)
			{
				return (Byte)deserializationcontext.handleWeirdStringValue(_valueClass, ((String) (jsonparser)), "not a valid Byte value", new Object[0]);
			}
			if(_byteOverflow(i))
				return (Byte)deserializationcontext.handleWeirdStringValue(_valueClass, ((String) (jsonparser)), "overflow, value cannot be represented as 8-bit value", new Object[0]);
			else
				return Byte.valueOf((byte)i);
		}
		if(jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
		{
			if(!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT))
				_failDoubleToIntCoercion(jsonparser, deserializationcontext, "Byte");
			return Byte.valueOf(jsonparser.getByteValue());
		}
		if(jsontoken == JsonToken.VALUE_NULL)
			return (Byte)_coerceNullToken(deserializationcontext, _primitive);
		if(jsontoken == JsonToken.START_ARRAY)
			return (Byte)_deserializeFromArray(jsonparser, deserializationcontext);
		if(jsontoken == JsonToken.VALUE_NUMBER_INT)
			return Byte.valueOf(jsonparser.getByteValue());
		else
			return (Byte)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
	//* 115  228:astore          4
	//* 116  230:goto            107
	}

	public Byte deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_NUMBER_INT))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #156 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   2    4:invokevirtual   #166 <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            18
			return Byte.valueOf(jsonparser.getByteValue());
	//    4   10:aload_1         
	//    5   11:invokevirtual   #140 <Method byte JsonParser.getByteValue()>
	//    6   14:invokestatic    #28  <Method Byte Byte.valueOf(byte)>
	//    7   17:areturn         
		else
			return _parseByte(jsonparser, deserializationcontext);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #168 <Method Byte _parseByte(JsonParser, DeserializationContext)>
	//   12   24:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #172 <Method Byte deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object getEmptyValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return super.getEmptyValue(deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #178 <Method Object NumberDeserializers$PrimitiveOrWrapperDeserializer.getEmptyValue(DeserializationContext)>
	//    3    5:areturn         
	}

	public volatile AccessPattern getNullAccessPattern()
	{
		return super.getNullAccessPattern();
	//    0    0:aload_0         
	//    1    1:invokespecial   #182 <Method AccessPattern NumberDeserializers$PrimitiveOrWrapperDeserializer.getNullAccessPattern()>
	//    2    4:areturn         
	}

	static final NumberDeserializers$ByteDeserializer primitiveInstance;
	private static final long serialVersionUID = 1L;
	static final NumberDeserializers$ByteDeserializer wrapperInstance = new NumberDeserializers$ByteDeserializer(java/lang/Byte, ((Byte) (null)));

	static 
	{
		primitiveInstance = new NumberDeserializers$ByteDeserializer(Byte.TYPE, Byte.valueOf((byte)0));
	//    0    0:new             #2   <Class NumberDeserializers$ByteDeserializer>
	//    1    3:dup             
	//    2    4:getstatic       #24  <Field Class Byte.TYPE>
	//    3    7:iconst_0        
	//    4    8:invokestatic    #28  <Method Byte Byte.valueOf(byte)>
	//    5   11:invokespecial   #32  <Method void NumberDeserializers$ByteDeserializer(Class, Byte)>
	//    6   14:putstatic       #34  <Field NumberDeserializers$ByteDeserializer primitiveInstance>
	//    7   17:new             #2   <Class NumberDeserializers$ByteDeserializer>
	//    8   20:dup             
	//    9   21:ldc1            #20  <Class Byte>
	//   10   23:aconst_null     
	//   11   24:invokespecial   #32  <Method void NumberDeserializers$ByteDeserializer(Class, Byte)>
	//   12   27:putstatic       #36  <Field NumberDeserializers$ByteDeserializer wrapperInstance>
	//*  13   30:return          
	}

	public NumberDeserializers$ByteDeserializer(Class class1, Byte byte1)
	{
		super(class1, ((Object) (byte1)), ((Object) (Byte.valueOf((byte)0))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #28  <Method Byte Byte.valueOf(byte)>
	//    5    7:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object, Object)>
	//    6   10:return          
	}
}
