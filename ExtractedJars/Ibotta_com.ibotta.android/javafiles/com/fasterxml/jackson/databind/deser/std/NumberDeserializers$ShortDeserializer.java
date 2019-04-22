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

public static class NumberDeserializers$ShortDeserializer extends Deserializer
{

	protected Short _parseShort(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		IllegalArgumentException illegalargumentexception;
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          4
		if(jsontoken == JsonToken.VALUE_NUMBER_INT)
	//*   3    6:aload           4
	//*   4    8:getstatic       #60  <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5   11:if_acmpne       22
			return Short.valueOf(jsonparser.getShortValue());
	//    6   14:aload_1         
	//    7   15:invokevirtual   #64  <Method short JsonParser.getShortValue()>
	//    8   18:invokestatic    #28  <Method Short Short.valueOf(short)>
	//    9   21:areturn         
		if(jsontoken == JsonToken.VALUE_STRING)
	//*  10   22:aload           4
	//*  11   24:getstatic       #67  <Field JsonToken JsonToken.VALUE_STRING>
	//*  12   27:if_acmpne       142
		{
			jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   13   30:aload_1         
	//   14   31:invokevirtual   #71  <Method String JsonParser.getText()>
	//   15   34:invokevirtual   #76  <Method String String.trim()>
	//   16   37:astore_1        
			if(((String) (jsonparser)).length() == 0)
	//*  17   38:aload_1         
	//*  18   39:invokevirtual   #80  <Method int String.length()>
	//*  19   42:ifne            58
				return (Short)_coerceEmptyString(deserializationcontext, _primitive);
	//   20   45:aload_0         
	//   21   46:aload_2         
	//   22   47:aload_0         
	//   23   48:getfield        #84  <Field boolean _primitive>
	//   24   51:invokevirtual   #88  <Method Object _coerceEmptyString(DeserializationContext, boolean)>
	//   25   54:checkcast       #20  <Class Short>
	//   26   57:areturn         
			if(_hasTextualNull(((String) (jsonparser))))
	//*  27   58:aload_0         
	//*  28   59:aload_1         
	//*  29   60:invokevirtual   #92  <Method boolean _hasTextualNull(String)>
	//*  30   63:ifeq            79
				return (Short)_coerceTextualNull(deserializationcontext, _primitive);
	//   31   66:aload_0         
	//   32   67:aload_2         
	//   33   68:aload_0         
	//   34   69:getfield        #84  <Field boolean _primitive>
	//   35   72:invokevirtual   #95  <Method Object _coerceTextualNull(DeserializationContext, boolean)>
	//   36   75:checkcast       #20  <Class Short>
	//   37   78:areturn         
			_verifyStringForScalarCoercion(deserializationcontext, ((String) (jsonparser)));
	//   38   79:aload_0         
	//   39   80:aload_2         
	//   40   81:aload_1         
	//   41   82:invokevirtual   #99  <Method void _verifyStringForScalarCoercion(DeserializationContext, String)>
			int i;
			try
			{
				i = NumberInput.parseInt(((String) (jsonparser)));
	//   42   85:aload_1         
	//   43   86:invokestatic    #105 <Method int NumberInput.parseInt(String)>
	//   44   89:istore_3        
			}
	//*  45   90:aload_0         
	//*  46   91:iload_3         
	//*  47   92:invokevirtual   #109 <Method boolean _shortOverflow(int)>
	//*  48   95:ifeq            117
	//*  49   98:aload_2         
	//*  50   99:aload_0         
	//*  51  100:getfield        #112 <Field Class _valueClass>
	//*  52  103:aload_1         
	//*  53  104:ldc1            #114 <String "overflow, value cannot be represented as 16-bit value">
	//*  54  106:iconst_0        
	//*  55  107:anewarray       Object[]
	//*  56  110:invokevirtual   #122 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//*  57  113:checkcast       #20  <Class Short>
	//*  58  116:areturn         
	//*  59  117:iload_3         
	//*  60  118:int2short       
	//*  61  119:invokestatic    #28  <Method Short Short.valueOf(short)>
	//*  62  122:areturn         
	//*  63  123:aload_2         
	//*  64  124:aload_0         
	//*  65  125:getfield        #112 <Field Class _valueClass>
	//*  66  128:aload_1         
	//*  67  129:ldc1            #124 <String "not a valid Short value">
	//*  68  131:iconst_0        
	//*  69  132:anewarray       Object[]
	//*  70  135:invokevirtual   #122 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//*  71  138:checkcast       #20  <Class Short>
	//*  72  141:areturn         
	//*  73  142:aload           4
	//*  74  144:getstatic       #127 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*  75  147:if_acmpne       176
	//*  76  150:aload_2         
	//*  77  151:getstatic       #133 <Field DeserializationFeature DeserializationFeature.ACCEPT_FLOAT_AS_INT>
	//*  78  154:invokevirtual   #137 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  79  157:ifne            168
	//*  80  160:aload_0         
	//*  81  161:aload_1         
	//*  82  162:aload_2         
	//*  83  163:ldc1            #139 <String "Short">
	//*  84  165:invokevirtual   #143 <Method void _failDoubleToIntCoercion(JsonParser, DeserializationContext, String)>
	//*  85  168:aload_1         
	//*  86  169:invokevirtual   #64  <Method short JsonParser.getShortValue()>
	//*  87  172:invokestatic    #28  <Method Short Short.valueOf(short)>
	//*  88  175:areturn         
	//*  89  176:aload           4
	//*  90  178:getstatic       #146 <Field JsonToken JsonToken.VALUE_NULL>
	//*  91  181:if_acmpne       197
	//*  92  184:aload_0         
	//*  93  185:aload_2         
	//*  94  186:aload_0         
	//*  95  187:getfield        #84  <Field boolean _primitive>
	//*  96  190:invokevirtual   #149 <Method Object _coerceNullToken(DeserializationContext, boolean)>
	//*  97  193:checkcast       #20  <Class Short>
	//*  98  196:areturn         
	//*  99  197:aload           4
	//* 100  199:getstatic       #152 <Field JsonToken JsonToken.START_ARRAY>
	//* 101  202:if_acmpne       215
	//* 102  205:aload_0         
	//* 103  206:aload_1         
	//* 104  207:aload_2         
	//* 105  208:invokevirtual   #156 <Method Object _deserializeFromArray(JsonParser, DeserializationContext)>
	//* 106  211:checkcast       #20  <Class Short>
	//* 107  214:areturn         
	//* 108  215:aload_2         
	//* 109  216:aload_0         
	//* 110  217:getfield        #112 <Field Class _valueClass>
	//* 111  220:aload_1         
	//* 112  221:invokevirtual   #160 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//* 113  224:checkcast       #20  <Class Short>
	//* 114  227:areturn         
			// Misplaced declaration of an exception variable
			catch(IllegalArgumentException illegalargumentexception)
			{
				return (Short)deserializationcontext.handleWeirdStringValue(_valueClass, ((String) (jsonparser)), "not a valid Short value", new Object[0]);
			}
			if(_shortOverflow(i))
				return (Short)deserializationcontext.handleWeirdStringValue(_valueClass, ((String) (jsonparser)), "overflow, value cannot be represented as 16-bit value", new Object[0]);
			else
				return Short.valueOf((short)i);
		}
		if(jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
		{
			if(!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT))
				_failDoubleToIntCoercion(jsonparser, deserializationcontext, "Short");
			return Short.valueOf(jsonparser.getShortValue());
		}
		if(jsontoken == JsonToken.VALUE_NULL)
			return (Short)_coerceNullToken(deserializationcontext, _primitive);
		if(jsontoken == JsonToken.START_ARRAY)
			return (Short)_deserializeFromArray(jsonparser, deserializationcontext);
		else
			return (Short)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
	//* 115  228:astore          4
	//* 116  230:goto            123
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #166 <Method Short deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Short deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _parseShort(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #168 <Method Short _parseShort(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object getEmptyValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return super.getEmptyValue(deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #174 <Method Object NumberDeserializers$PrimitiveOrWrapperDeserializer.getEmptyValue(DeserializationContext)>
	//    3    5:areturn         
	}

	public volatile AccessPattern getNullAccessPattern()
	{
		return super.getNullAccessPattern();
	//    0    0:aload_0         
	//    1    1:invokespecial   #178 <Method AccessPattern NumberDeserializers$PrimitiveOrWrapperDeserializer.getNullAccessPattern()>
	//    2    4:areturn         
	}

	static final NumberDeserializers$ShortDeserializer primitiveInstance;
	private static final long serialVersionUID = 1L;
	static final NumberDeserializers$ShortDeserializer wrapperInstance = new NumberDeserializers$ShortDeserializer(java/lang/Short, ((Short) (null)));

	static 
	{
		primitiveInstance = new NumberDeserializers$ShortDeserializer(Short.TYPE, Short.valueOf((short)0));
	//    0    0:new             #2   <Class NumberDeserializers$ShortDeserializer>
	//    1    3:dup             
	//    2    4:getstatic       #24  <Field Class Short.TYPE>
	//    3    7:iconst_0        
	//    4    8:invokestatic    #28  <Method Short Short.valueOf(short)>
	//    5   11:invokespecial   #32  <Method void NumberDeserializers$ShortDeserializer(Class, Short)>
	//    6   14:putstatic       #34  <Field NumberDeserializers$ShortDeserializer primitiveInstance>
	//    7   17:new             #2   <Class NumberDeserializers$ShortDeserializer>
	//    8   20:dup             
	//    9   21:ldc1            #20  <Class Short>
	//   10   23:aconst_null     
	//   11   24:invokespecial   #32  <Method void NumberDeserializers$ShortDeserializer(Class, Short)>
	//   12   27:putstatic       #36  <Field NumberDeserializers$ShortDeserializer wrapperInstance>
	//*  13   30:return          
	}

	public NumberDeserializers$ShortDeserializer(Class class1, Short short1)
	{
		super(class1, ((Object) (short1)), ((Object) (Short.valueOf((short)0))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #28  <Method Short Short.valueOf(short)>
	//    5    7:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object, Object)>
	//    6   10:return          
	}
}
