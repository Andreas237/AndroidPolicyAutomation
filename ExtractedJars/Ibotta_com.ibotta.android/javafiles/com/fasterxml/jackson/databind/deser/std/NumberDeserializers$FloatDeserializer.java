// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			NumberDeserializers

public static class NumberDeserializers$FloatDeserializer extends Deserializer
{

	protected final Float _parseFloat(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		IllegalArgumentException illegalargumentexception;
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          5
		if(jsontoken != JsonToken.VALUE_NUMBER_FLOAT && jsontoken != JsonToken.VALUE_NUMBER_INT)
	//*   3    6:aload           5
	//*   4    8:getstatic       #60  <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   5   11:if_acmpeq       242
	//*   6   14:aload           5
	//*   7   16:getstatic       #63  <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   8   19:if_acmpne       25
	//*   9   22:goto            242
		{
			if(jsontoken == JsonToken.VALUE_STRING)
	//*  10   25:aload           5
	//*  11   27:getstatic       #66  <Field JsonToken JsonToken.VALUE_STRING>
	//*  12   30:if_acmpne       190
			{
				jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   13   33:aload_1         
	//   14   34:invokevirtual   #70  <Method String JsonParser.getText()>
	//   15   37:invokevirtual   #75  <Method String String.trim()>
	//   16   40:astore_1        
				if(((String) (jsonparser)).length() == 0)
	//*  17   41:aload_1         
	//*  18   42:invokevirtual   #79  <Method int String.length()>
	//*  19   45:ifne            61
					return (Float)_coerceEmptyString(deserializationcontext, _primitive);
	//   20   48:aload_0         
	//   21   49:aload_2         
	//   22   50:aload_0         
	//   23   51:getfield        #83  <Field boolean _primitive>
	//   24   54:invokevirtual   #87  <Method Object _coerceEmptyString(DeserializationContext, boolean)>
	//   25   57:checkcast       #20  <Class Float>
	//   26   60:areturn         
				if(_hasTextualNull(((String) (jsonparser))))
	//*  27   61:aload_0         
	//*  28   62:aload_1         
	//*  29   63:invokevirtual   #91  <Method boolean _hasTextualNull(String)>
	//*  30   66:ifeq            82
					return (Float)_coerceTextualNull(deserializationcontext, _primitive);
	//   31   69:aload_0         
	//   32   70:aload_2         
	//   33   71:aload_0         
	//   34   72:getfield        #83  <Field boolean _primitive>
	//   35   75:invokevirtual   #94  <Method Object _coerceTextualNull(DeserializationContext, boolean)>
	//   36   78:checkcast       #20  <Class Float>
	//   37   81:areturn         
				char c = ((String) (jsonparser)).charAt(0);
	//   38   82:aload_1         
	//   39   83:iconst_0        
	//   40   84:invokevirtual   #98  <Method char String.charAt(int)>
	//   41   87:istore          4
				if(c != '-')
	//*  42   89:iload           4
	//*  43   91:bipush          45
	//*  44   93:icmpeq          141
				{
					if(c != 'I')
	//*  45   96:iload           4
	//*  46   98:bipush          73
	//*  47  100:icmpeq          127
					{
						if(c == 'N' && _isNaN(((String) (jsonparser))))
	//*  48  103:iload           4
	//*  49  105:bipush          78
	//*  50  107:icmpeq          113
	//*  51  110:goto            155
	//*  52  113:aload_0         
	//*  53  114:aload_1         
	//*  54  115:invokevirtual   #101 <Method boolean _isNaN(String)>
	//*  55  118:ifeq            155
							return Float.valueOf((0.0F / 0.0F));
	//   56  121:ldc1            #102 <Float (0.0F / 0.0F)>
	//   57  123:invokestatic    #28  <Method Float Float.valueOf(float)>
	//   58  126:areturn         
					} else
					if(_isPosInf(((String) (jsonparser))))
	//*  59  127:aload_0         
	//*  60  128:aload_1         
	//*  61  129:invokevirtual   #105 <Method boolean _isPosInf(String)>
	//*  62  132:ifeq            155
						return Float.valueOf((1.0F / 0.0F));
	//   63  135:ldc1            #106 <Float (1.0F / 0.0F)>
	//   64  137:invokestatic    #28  <Method Float Float.valueOf(float)>
	//   65  140:areturn         
				} else
				if(_isNegInf(((String) (jsonparser))))
	//*  66  141:aload_0         
	//*  67  142:aload_1         
	//*  68  143:invokevirtual   #109 <Method boolean _isNegInf(String)>
	//*  69  146:ifeq            155
					return Float.valueOf((-1.0F / 0.0F));
	//   70  149:ldc1            #110 <Float (-1.0F / 0.0F)>
	//   71  151:invokestatic    #28  <Method Float Float.valueOf(float)>
	//   72  154:areturn         
				_verifyStringForScalarCoercion(deserializationcontext, ((String) (jsonparser)));
	//   73  155:aload_0         
	//   74  156:aload_2         
	//   75  157:aload_1         
	//   76  158:invokevirtual   #114 <Method void _verifyStringForScalarCoercion(DeserializationContext, String)>
				float f;
				try
				{
					f = Float.parseFloat(((String) (jsonparser)));
	//   77  161:aload_1         
	//   78  162:invokestatic    #118 <Method float Float.parseFloat(String)>
	//   79  165:fstore_3        
				}
	//*  80  166:fload_3         
	//*  81  167:invokestatic    #28  <Method Float Float.valueOf(float)>
	//*  82  170:areturn         
	//*  83  171:aload_2         
	//*  84  172:aload_0         
	//*  85  173:getfield        #121 <Field Class _valueClass>
	//*  86  176:aload_1         
	//*  87  177:ldc1            #123 <String "not a valid Float value">
	//*  88  179:iconst_0        
	//*  89  180:anewarray       Object[]
	//*  90  183:invokevirtual   #131 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//*  91  186:checkcast       #20  <Class Float>
	//*  92  189:areturn         
	//*  93  190:aload           5
	//*  94  192:getstatic       #134 <Field JsonToken JsonToken.VALUE_NULL>
	//*  95  195:if_acmpne       211
	//*  96  198:aload_0         
	//*  97  199:aload_2         
	//*  98  200:aload_0         
	//*  99  201:getfield        #83  <Field boolean _primitive>
	//* 100  204:invokevirtual   #137 <Method Object _coerceNullToken(DeserializationContext, boolean)>
	//* 101  207:checkcast       #20  <Class Float>
	//* 102  210:areturn         
	//* 103  211:aload           5
	//* 104  213:getstatic       #140 <Field JsonToken JsonToken.START_ARRAY>
	//* 105  216:if_acmpne       229
	//* 106  219:aload_0         
	//* 107  220:aload_1         
	//* 108  221:aload_2         
	//* 109  222:invokevirtual   #144 <Method Object _deserializeFromArray(JsonParser, DeserializationContext)>
	//* 110  225:checkcast       #20  <Class Float>
	//* 111  228:areturn         
	//* 112  229:aload_2         
	//* 113  230:aload_0         
	//* 114  231:getfield        #121 <Field Class _valueClass>
	//* 115  234:aload_1         
	//* 116  235:invokevirtual   #148 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//* 117  238:checkcast       #20  <Class Float>
	//* 118  241:areturn         
	//* 119  242:aload_1         
	//* 120  243:invokevirtual   #152 <Method float JsonParser.getFloatValue()>
	//* 121  246:invokestatic    #28  <Method Float Float.valueOf(float)>
	//* 122  249:areturn         
				// Misplaced declaration of an exception variable
				catch(IllegalArgumentException illegalargumentexception)
				{
					return (Float)deserializationcontext.handleWeirdStringValue(_valueClass, ((String) (jsonparser)), "not a valid Float value", new Object[0]);
				}
				return Float.valueOf(f);
			}
			if(jsontoken == JsonToken.VALUE_NULL)
				return (Float)_coerceNullToken(deserializationcontext, _primitive);
			if(jsontoken == JsonToken.START_ARRAY)
				return (Float)_deserializeFromArray(jsonparser, deserializationcontext);
			else
				return (Float)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
		} else
		{
			return Float.valueOf(jsonparser.getFloatValue());
		}
	//* 123  250:astore          5
	//* 124  252:goto            171
	}

	public Float deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _parseFloat(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #156 <Method Float _parseFloat(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #160 <Method Float deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object getEmptyValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return super.getEmptyValue(deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #166 <Method Object NumberDeserializers$PrimitiveOrWrapperDeserializer.getEmptyValue(DeserializationContext)>
	//    3    5:areturn         
	}

	public volatile AccessPattern getNullAccessPattern()
	{
		return super.getNullAccessPattern();
	//    0    0:aload_0         
	//    1    1:invokespecial   #170 <Method AccessPattern NumberDeserializers$PrimitiveOrWrapperDeserializer.getNullAccessPattern()>
	//    2    4:areturn         
	}

	static final NumberDeserializers$FloatDeserializer primitiveInstance;
	private static final long serialVersionUID = 1L;
	static final NumberDeserializers$FloatDeserializer wrapperInstance = new NumberDeserializers$FloatDeserializer(java/lang/Float, ((Float) (null)));

	static 
	{
		primitiveInstance = new NumberDeserializers$FloatDeserializer(Float.TYPE, Float.valueOf(0.0F));
	//    0    0:new             #2   <Class NumberDeserializers$FloatDeserializer>
	//    1    3:dup             
	//    2    4:getstatic       #24  <Field Class Float.TYPE>
	//    3    7:fconst_0        
	//    4    8:invokestatic    #28  <Method Float Float.valueOf(float)>
	//    5   11:invokespecial   #32  <Method void NumberDeserializers$FloatDeserializer(Class, Float)>
	//    6   14:putstatic       #34  <Field NumberDeserializers$FloatDeserializer primitiveInstance>
	//    7   17:new             #2   <Class NumberDeserializers$FloatDeserializer>
	//    8   20:dup             
	//    9   21:ldc1            #20  <Class Float>
	//   10   23:aconst_null     
	//   11   24:invokespecial   #32  <Method void NumberDeserializers$FloatDeserializer(Class, Float)>
	//   12   27:putstatic       #36  <Field NumberDeserializers$FloatDeserializer wrapperInstance>
	//*  13   30:return          
	}

	public NumberDeserializers$FloatDeserializer(Class class1, Float float1)
	{
		super(class1, ((Object) (float1)), ((Object) (Float.valueOf(0.0F))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:fconst_0        
	//    4    4:invokestatic    #28  <Method Float Float.valueOf(float)>
	//    5    7:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object, Object)>
	//    6   10:return          
	}
}
