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

public static class NumberDeserializers$DoubleDeserializer extends eserializer
{

	protected final Double _parseDouble(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		IllegalArgumentException illegalargumentexception;
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          6
		if(jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    6:aload           6
	//*   4    8:getstatic       #60  <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5   11:if_acmpeq       245
	//*   6   14:aload           6
	//*   7   16:getstatic       #63  <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   19:if_acmpne       25
	//*   9   22:goto            245
		{
			if(jsontoken == JsonToken.VALUE_STRING)
	//*  10   25:aload           6
	//*  11   27:getstatic       #66  <Field JsonToken JsonToken.VALUE_STRING>
	//*  12   30:if_acmpne       193
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
					return (Double)_coerceEmptyString(deserializationcontext, _primitive);
	//   20   48:aload_0         
	//   21   49:aload_2         
	//   22   50:aload_0         
	//   23   51:getfield        #83  <Field boolean _primitive>
	//   24   54:invokevirtual   #87  <Method Object _coerceEmptyString(DeserializationContext, boolean)>
	//   25   57:checkcast       #20  <Class Double>
	//   26   60:areturn         
				if(_hasTextualNull(((String) (jsonparser))))
	//*  27   61:aload_0         
	//*  28   62:aload_1         
	//*  29   63:invokevirtual   #91  <Method boolean _hasTextualNull(String)>
	//*  30   66:ifeq            82
					return (Double)_coerceTextualNull(deserializationcontext, _primitive);
	//   31   69:aload_0         
	//   32   70:aload_2         
	//   33   71:aload_0         
	//   34   72:getfield        #83  <Field boolean _primitive>
	//   35   75:invokevirtual   #94  <Method Object _coerceTextualNull(DeserializationContext, boolean)>
	//   36   78:checkcast       #20  <Class Double>
	//   37   81:areturn         
				char c = ((String) (jsonparser)).charAt(0);
	//   38   82:aload_1         
	//   39   83:iconst_0        
	//   40   84:invokevirtual   #98  <Method char String.charAt(int)>
	//   41   87:istore          5
				if(c != '-')
	//*  42   89:iload           5
	//*  43   91:bipush          45
	//*  44   93:icmpeq          143
				{
					if(c != 'I')
	//*  45   96:iload           5
	//*  46   98:bipush          73
	//*  47  100:icmpeq          128
					{
						if(c == 'N' && _isNaN(((String) (jsonparser))))
	//*  48  103:iload           5
	//*  49  105:bipush          78
	//*  50  107:icmpeq          113
	//*  51  110:goto            158
	//*  52  113:aload_0         
	//*  53  114:aload_1         
	//*  54  115:invokevirtual   #101 <Method boolean _isNaN(String)>
	//*  55  118:ifeq            158
							return Double.valueOf((0.0D / 0.0D));
	//   56  121:ldc2w           #102 <Double (0.0D / 0.0D)>
	//   57  124:invokestatic    #28  <Method Double Double.valueOf(double)>
	//   58  127:areturn         
					} else
					if(_isPosInf(((String) (jsonparser))))
	//*  59  128:aload_0         
	//*  60  129:aload_1         
	//*  61  130:invokevirtual   #106 <Method boolean _isPosInf(String)>
	//*  62  133:ifeq            158
						return Double.valueOf((1.0D / 0.0D));
	//   63  136:ldc2w           #107 <Double (1.0D / 0.0D)>
	//   64  139:invokestatic    #28  <Method Double Double.valueOf(double)>
	//   65  142:areturn         
				} else
				if(_isNegInf(((String) (jsonparser))))
	//*  66  143:aload_0         
	//*  67  144:aload_1         
	//*  68  145:invokevirtual   #111 <Method boolean _isNegInf(String)>
	//*  69  148:ifeq            158
					return Double.valueOf((-1.0D / 0.0D));
	//   70  151:ldc2w           #112 <Double (-1.0D / 0.0D)>
	//   71  154:invokestatic    #28  <Method Double Double.valueOf(double)>
	//   72  157:areturn         
				_verifyStringForScalarCoercion(deserializationcontext, ((String) (jsonparser)));
	//   73  158:aload_0         
	//   74  159:aload_2         
	//   75  160:aload_1         
	//   76  161:invokevirtual   #117 <Method void _verifyStringForScalarCoercion(DeserializationContext, String)>
				double d;
				try
				{
					d = parseDouble(((String) (jsonparser)));
	//   77  164:aload_1         
	//   78  165:invokestatic    #121 <Method double parseDouble(String)>
	//   79  168:dstore_3        
				}
	//*  80  169:dload_3         
	//*  81  170:invokestatic    #28  <Method Double Double.valueOf(double)>
	//*  82  173:areturn         
	//*  83  174:aload_2         
	//*  84  175:aload_0         
	//*  85  176:getfield        #124 <Field Class _valueClass>
	//*  86  179:aload_1         
	//*  87  180:ldc1            #126 <String "not a valid Double value">
	//*  88  182:iconst_0        
	//*  89  183:anewarray       Object[]
	//*  90  186:invokevirtual   #134 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//*  91  189:checkcast       #20  <Class Double>
	//*  92  192:areturn         
	//*  93  193:aload           6
	//*  94  195:getstatic       #137 <Field JsonToken JsonToken.VALUE_NULL>
	//*  95  198:if_acmpne       214
	//*  96  201:aload_0         
	//*  97  202:aload_2         
	//*  98  203:aload_0         
	//*  99  204:getfield        #83  <Field boolean _primitive>
	//* 100  207:invokevirtual   #140 <Method Object _coerceNullToken(DeserializationContext, boolean)>
	//* 101  210:checkcast       #20  <Class Double>
	//* 102  213:areturn         
	//* 103  214:aload           6
	//* 104  216:getstatic       #143 <Field JsonToken JsonToken.START_ARRAY>
	//* 105  219:if_acmpne       232
	//* 106  222:aload_0         
	//* 107  223:aload_1         
	//* 108  224:aload_2         
	//* 109  225:invokevirtual   #147 <Method Object _deserializeFromArray(JsonParser, DeserializationContext)>
	//* 110  228:checkcast       #20  <Class Double>
	//* 111  231:areturn         
	//* 112  232:aload_2         
	//* 113  233:aload_0         
	//* 114  234:getfield        #124 <Field Class _valueClass>
	//* 115  237:aload_1         
	//* 116  238:invokevirtual   #151 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//* 117  241:checkcast       #20  <Class Double>
	//* 118  244:areturn         
	//* 119  245:aload_1         
	//* 120  246:invokevirtual   #155 <Method double JsonParser.getDoubleValue()>
	//* 121  249:invokestatic    #28  <Method Double Double.valueOf(double)>
	//* 122  252:areturn         
				// Misplaced declaration of an exception variable
				catch(IllegalArgumentException illegalargumentexception)
				{
					return (Double)deserializationcontext.handleWeirdStringValue(_valueClass, ((String) (jsonparser)), "not a valid Double value", new Object[0]);
				}
				return Double.valueOf(d);
			}
			if(jsontoken == JsonToken.VALUE_NULL)
				return (Double)_coerceNullToken(deserializationcontext, _primitive);
			if(jsontoken == JsonToken.START_ARRAY)
				return (Double)_deserializeFromArray(jsonparser, deserializationcontext);
			else
				return (Double)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
		} else
		{
			return Double.valueOf(jsonparser.getDoubleValue());
		}
	//* 123  253:astore          6
	//* 124  255:goto            174
	}

	public Double deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _parseDouble(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #159 <Method Double _parseDouble(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #163 <Method Double deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Double deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return _parseDouble(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #159 <Method Double _parseDouble(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return ((Object) (deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #168 <Method Double deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//    5    7:areturn         
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

	static final NumberDeserializers$DoubleDeserializer primitiveInstance;
	private static final long serialVersionUID = 1L;
	static final NumberDeserializers$DoubleDeserializer wrapperInstance = new NumberDeserializers$DoubleDeserializer(java/lang/Double, ((Double) (null)));

	static 
	{
		primitiveInstance = new NumberDeserializers$DoubleDeserializer(Double.TYPE, Double.valueOf(0.0D));
	//    0    0:new             #2   <Class NumberDeserializers$DoubleDeserializer>
	//    1    3:dup             
	//    2    4:getstatic       #24  <Field Class Double.TYPE>
	//    3    7:dconst_0        
	//    4    8:invokestatic    #28  <Method Double Double.valueOf(double)>
	//    5   11:invokespecial   #32  <Method void NumberDeserializers$DoubleDeserializer(Class, Double)>
	//    6   14:putstatic       #34  <Field NumberDeserializers$DoubleDeserializer primitiveInstance>
	//    7   17:new             #2   <Class NumberDeserializers$DoubleDeserializer>
	//    8   20:dup             
	//    9   21:ldc1            #20  <Class Double>
	//   10   23:aconst_null     
	//   11   24:invokespecial   #32  <Method void NumberDeserializers$DoubleDeserializer(Class, Double)>
	//   12   27:putstatic       #36  <Field NumberDeserializers$DoubleDeserializer wrapperInstance>
	//*  13   30:return          
	}

	public NumberDeserializers$DoubleDeserializer(Class class1, Double double1)
	{
		super(class1, ((Object) (double1)), ((Object) (Double.valueOf(0.0D))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:dconst_0        
	//    4    4:invokestatic    #28  <Method Double Double.valueOf(double)>
	//    5    7:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object, Object)>
	//    6   10:return          
	}
}
