// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			NumberDeserializers

public static final class NumberDeserializers$BooleanDeserializer extends serializer
{

	protected final Boolean _parseBoolean(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore_3        
		if(jsontoken == JsonToken.VALUE_NULL)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #58  <Field JsonToken JsonToken.VALUE_NULL>
	//*   5    9:if_acmpne       25
			return (Boolean)_coerceNullToken(deserializationcontext, _primitive);
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:aload_0         
	//    9   15:getfield        #62  <Field boolean _primitive>
	//   10   18:invokevirtual   #66  <Method Object _coerceNullToken(DeserializationContext, boolean)>
	//   11   21:checkcast       #20  <Class Boolean>
	//   12   24:areturn         
		if(jsontoken == JsonToken.START_ARRAY)
	//*  13   25:aload_3         
	//*  14   26:getstatic       #69  <Field JsonToken JsonToken.START_ARRAY>
	//*  15   29:if_acmpne       42
			return (Boolean)_deserializeFromArray(jsonparser, deserializationcontext);
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:aload_2         
	//   19   35:invokevirtual   #73  <Method Object _deserializeFromArray(JsonParser, DeserializationContext)>
	//   20   38:checkcast       #20  <Class Boolean>
	//   21   41:areturn         
		if(jsontoken == JsonToken.VALUE_NUMBER_INT)
	//*  22   42:aload_3         
	//*  23   43:getstatic       #76  <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  24   46:if_acmpne       59
			return Boolean.valueOf(_parseBooleanFromInt(jsonparser, deserializationcontext));
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:aload_2         
	//   28   52:invokevirtual   #80  <Method boolean _parseBooleanFromInt(JsonParser, DeserializationContext)>
	//   29   55:invokestatic    #84  <Method Boolean Boolean.valueOf(boolean)>
	//   30   58:areturn         
		if(jsontoken == JsonToken.VALUE_STRING)
	//*  31   59:aload_3         
	//*  32   60:getstatic       #87  <Field JsonToken JsonToken.VALUE_STRING>
	//*  33   63:if_acmpne       196
		{
			jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   34   66:aload_1         
	//   35   67:invokevirtual   #91  <Method String JsonParser.getText()>
	//   36   70:invokevirtual   #96  <Method String String.trim()>
	//   37   73:astore_1        
			if(!"true".equals(((Object) (jsonparser))) && !"True".equals(((Object) (jsonparser))))
	//*  38   74:ldc1            #98  <String "true">
	//*  39   76:aload_1         
	//*  40   77:invokevirtual   #102 <Method boolean String.equals(Object)>
	//*  41   80:ifne            186
	//*  42   83:ldc1            #104 <String "True">
	//*  43   85:aload_1         
	//*  44   86:invokevirtual   #102 <Method boolean String.equals(Object)>
	//*  45   89:ifeq            95
	//*  46   92:goto            186
			{
				if(!"false".equals(((Object) (jsonparser))) && !"False".equals(((Object) (jsonparser))))
	//*  47   95:ldc1            #106 <String "false">
	//*  48   97:aload_1         
	//*  49   98:invokevirtual   #102 <Method boolean String.equals(Object)>
	//*  50  101:ifne            176
	//*  51  104:ldc1            #108 <String "False">
	//*  52  106:aload_1         
	//*  53  107:invokevirtual   #102 <Method boolean String.equals(Object)>
	//*  54  110:ifeq            116
	//*  55  113:goto            176
				{
					if(((String) (jsonparser)).length() == 0)
	//*  56  116:aload_1         
	//*  57  117:invokevirtual   #112 <Method int String.length()>
	//*  58  120:ifne            136
						return (Boolean)_coerceEmptyString(deserializationcontext, _primitive);
	//   59  123:aload_0         
	//   60  124:aload_2         
	//   61  125:aload_0         
	//   62  126:getfield        #62  <Field boolean _primitive>
	//   63  129:invokevirtual   #115 <Method Object _coerceEmptyString(DeserializationContext, boolean)>
	//   64  132:checkcast       #20  <Class Boolean>
	//   65  135:areturn         
					if(_hasTextualNull(((String) (jsonparser))))
	//*  66  136:aload_0         
	//*  67  137:aload_1         
	//*  68  138:invokevirtual   #119 <Method boolean _hasTextualNull(String)>
	//*  69  141:ifeq            157
						return (Boolean)_coerceTextualNull(deserializationcontext, _primitive);
	//   70  144:aload_0         
	//   71  145:aload_2         
	//   72  146:aload_0         
	//   73  147:getfield        #62  <Field boolean _primitive>
	//   74  150:invokevirtual   #122 <Method Object _coerceTextualNull(DeserializationContext, boolean)>
	//   75  153:checkcast       #20  <Class Boolean>
	//   76  156:areturn         
					else
						return (Boolean)deserializationcontext.handleWeirdStringValue(_valueClass, ((String) (jsonparser)), "only \"true\" or \"false\" recognized", new Object[0]);
	//   77  157:aload_2         
	//   78  158:aload_0         
	//   79  159:getfield        #125 <Field Class _valueClass>
	//   80  162:aload_1         
	//   81  163:ldc1            #127 <String "only \"true\" or \"false\" recognized">
	//   82  165:iconst_0        
	//   83  166:anewarray       Object[]
	//   84  169:invokevirtual   #135 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//   85  172:checkcast       #20  <Class Boolean>
	//   86  175:areturn         
				} else
				{
					_verifyStringForScalarCoercion(deserializationcontext, ((String) (jsonparser)));
	//   87  176:aload_0         
	//   88  177:aload_2         
	//   89  178:aload_1         
	//   90  179:invokevirtual   #139 <Method void _verifyStringForScalarCoercion(DeserializationContext, String)>
					return Boolean.FALSE;
	//   91  182:getstatic       #28  <Field Boolean Boolean.FALSE>
	//   92  185:areturn         
				}
			} else
			{
				_verifyStringForScalarCoercion(deserializationcontext, ((String) (jsonparser)));
	//   93  186:aload_0         
	//   94  187:aload_2         
	//   95  188:aload_1         
	//   96  189:invokevirtual   #139 <Method void _verifyStringForScalarCoercion(DeserializationContext, String)>
				return Boolean.TRUE;
	//   97  192:getstatic       #142 <Field Boolean Boolean.TRUE>
	//   98  195:areturn         
			}
		}
		if(jsontoken == JsonToken.VALUE_TRUE)
	//*  99  196:aload_3         
	//* 100  197:getstatic       #145 <Field JsonToken JsonToken.VALUE_TRUE>
	//* 101  200:if_acmpne       207
			return Boolean.TRUE;
	//  102  203:getstatic       #142 <Field Boolean Boolean.TRUE>
	//  103  206:areturn         
		if(jsontoken == JsonToken.VALUE_FALSE)
	//* 104  207:aload_3         
	//* 105  208:getstatic       #148 <Field JsonToken JsonToken.VALUE_FALSE>
	//* 106  211:if_acmpne       218
			return Boolean.FALSE;
	//  107  214:getstatic       #28  <Field Boolean Boolean.FALSE>
	//  108  217:areturn         
		else
			return (Boolean)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
	//  109  218:aload_2         
	//  110  219:aload_0         
	//  111  220:getfield        #125 <Field Class _valueClass>
	//  112  223:aload_1         
	//  113  224:invokevirtual   #152 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//  114  227:checkcast       #20  <Class Boolean>
	//  115  230:areturn         
	}

	public Boolean deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore_3        
		if(jsontoken == JsonToken.VALUE_TRUE)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #145 <Field JsonToken JsonToken.VALUE_TRUE>
	//*   5    9:if_acmpne       16
			return Boolean.TRUE;
	//    6   12:getstatic       #142 <Field Boolean Boolean.TRUE>
	//    7   15:areturn         
		if(jsontoken == JsonToken.VALUE_FALSE)
	//*   8   16:aload_3         
	//*   9   17:getstatic       #148 <Field JsonToken JsonToken.VALUE_FALSE>
	//*  10   20:if_acmpne       27
			return Boolean.FALSE;
	//   11   23:getstatic       #28  <Field Boolean Boolean.FALSE>
	//   12   26:areturn         
		else
			return _parseBoolean(jsonparser, deserializationcontext);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:invokevirtual   #156 <Method Boolean _parseBoolean(JsonParser, DeserializationContext)>
	//   17   33:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #160 <Method Boolean deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Boolean deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		typedeserializer = ((TypeDeserializer) (jsonparser.getCurrentToken()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore_3        
		if(typedeserializer == JsonToken.VALUE_TRUE)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #145 <Field JsonToken JsonToken.VALUE_TRUE>
	//*   5    9:if_acmpne       16
			return Boolean.TRUE;
	//    6   12:getstatic       #142 <Field Boolean Boolean.TRUE>
	//    7   15:areturn         
		if(typedeserializer == JsonToken.VALUE_FALSE)
	//*   8   16:aload_3         
	//*   9   17:getstatic       #148 <Field JsonToken JsonToken.VALUE_FALSE>
	//*  10   20:if_acmpne       27
			return Boolean.FALSE;
	//   11   23:getstatic       #28  <Field Boolean Boolean.FALSE>
	//   12   26:areturn         
		else
			return _parseBoolean(jsonparser, deserializationcontext);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:invokevirtual   #156 <Method Boolean _parseBoolean(JsonParser, DeserializationContext)>
	//   17   33:areturn         
	}

	public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return ((Object) (deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #165 <Method Boolean deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//    5    7:areturn         
	}

	public volatile Object getEmptyValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return super.getEmptyValue(deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #171 <Method Object NumberDeserializers$PrimitiveOrWrapperDeserializer.getEmptyValue(DeserializationContext)>
	//    3    5:areturn         
	}

	public volatile AccessPattern getNullAccessPattern()
	{
		return super.getNullAccessPattern();
	//    0    0:aload_0         
	//    1    1:invokespecial   #175 <Method AccessPattern NumberDeserializers$PrimitiveOrWrapperDeserializer.getNullAccessPattern()>
	//    2    4:areturn         
	}

	static final NumberDeserializers$BooleanDeserializer primitiveInstance;
	private static final long serialVersionUID = 1L;
	static final NumberDeserializers$BooleanDeserializer wrapperInstance = new NumberDeserializers$BooleanDeserializer(java/lang/Boolean, ((Boolean) (null)));

	static 
	{
		primitiveInstance = new NumberDeserializers$BooleanDeserializer(Boolean.TYPE, Boolean.FALSE);
	//    0    0:new             #2   <Class NumberDeserializers$BooleanDeserializer>
	//    1    3:dup             
	//    2    4:getstatic       #24  <Field Class Boolean.TYPE>
	//    3    7:getstatic       #28  <Field Boolean Boolean.FALSE>
	//    4   10:invokespecial   #32  <Method void NumberDeserializers$BooleanDeserializer(Class, Boolean)>
	//    5   13:putstatic       #34  <Field NumberDeserializers$BooleanDeserializer primitiveInstance>
	//    6   16:new             #2   <Class NumberDeserializers$BooleanDeserializer>
	//    7   19:dup             
	//    8   20:ldc1            #20  <Class Boolean>
	//    9   22:aconst_null     
	//   10   23:invokespecial   #32  <Method void NumberDeserializers$BooleanDeserializer(Class, Boolean)>
	//   11   26:putstatic       #36  <Field NumberDeserializers$BooleanDeserializer wrapperInstance>
	//*  12   29:return          
	}

	public NumberDeserializers$BooleanDeserializer(Class class1, Boolean boolean1)
	{
		super(class1, ((Object) (boolean1)), ((Object) (Boolean.FALSE)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #28  <Field Boolean Boolean.FALSE>
	//    4    6:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object, Object)>
	//    5    9:return          
	}
}
