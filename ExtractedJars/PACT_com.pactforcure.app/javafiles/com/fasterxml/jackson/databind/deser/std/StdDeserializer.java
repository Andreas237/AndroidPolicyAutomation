// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDelegatingDeserializer

public abstract class StdDeserializer extends JsonDeserializer
	implements Serializable
{

	protected StdDeserializer(JavaType javatype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void JsonDeserializer()>
		if(javatype == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       16
			javatype = null;
	//    4    8:aconst_null     
	//    5    9:astore_1        
		else
	//*   6   10:aload_0         
	//*   7   11:aload_1         
	//*   8   12:putfield        #40  <Field Class _valueClass>
	//*   9   15:return          
			javatype = ((JavaType) (javatype.getRawClass()));
	//   10   16:aload_1         
	//   11   17:invokevirtual   #46  <Method Class JavaType.getRawClass()>
	//   12   20:astore_1        
		_valueClass = ((Class) (javatype));
	//*  13   21:goto            10
	}

	protected StdDeserializer(StdDeserializer stddeserializer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void JsonDeserializer()>
		_valueClass = stddeserializer._valueClass;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #40  <Field Class _valueClass>
	//    5    9:putfield        #40  <Field Class _valueClass>
	//    6   12:return          
	}

	protected StdDeserializer(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void JsonDeserializer()>
		_valueClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field Class _valueClass>
	//    5    9:return          
	}

	protected static final double parseDouble(String s)
		throws NumberFormatException
	{
		if("2.2250738585072012e-308".equals(((Object) (s))))
	//*   0    0:ldc1            #57  <String "2.2250738585072012e-308">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #63  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            13
			return 2.2250738585072014E-308D;
	//    4    9:ldc2w           #64  <Double 2.2250738585072014E-308D>
	//    5   12:dreturn         
		else
			return Double.parseDouble(s);
	//    6   13:aload_0         
	//    7   14:invokestatic    #69  <Method double Double.parseDouble(String)>
	//    8   17:dreturn         
	}

	protected Object _coerceIntegral(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		int i = deserializationcontext.getDeserializationFeatures();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #79  <Method int DeserializationContext.getDeserializationFeatures()>
	//    2    4:istore_3        
		if(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(i))
	//*   3    5:getstatic       #24  <Field DeserializationFeature DeserializationFeature.USE_BIG_INTEGER_FOR_INTS>
	//*   4    8:iload_3         
	//*   5    9:invokevirtual   #83  <Method boolean DeserializationFeature.enabledIn(int)>
	//*   6   12:ifeq            20
			return ((Object) (jsonparser.getBigIntegerValue()));
	//    7   15:aload_1         
	//    8   16:invokevirtual   #89  <Method java.math.BigInteger JsonParser.getBigIntegerValue()>
	//    9   19:areturn         
		if(DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(i))
	//*  10   20:getstatic       #31  <Field DeserializationFeature DeserializationFeature.USE_LONG_FOR_INTS>
	//*  11   23:iload_3         
	//*  12   24:invokevirtual   #83  <Method boolean DeserializationFeature.enabledIn(int)>
	//*  13   27:ifeq            38
			return ((Object) (Long.valueOf(jsonparser.getLongValue())));
	//   14   30:aload_1         
	//   15   31:invokevirtual   #93  <Method long JsonParser.getLongValue()>
	//   16   34:invokestatic    #99  <Method Long Long.valueOf(long)>
	//   17   37:areturn         
		else
			return ((Object) (jsonparser.getBigIntegerValue()));
	//   18   38:aload_1         
	//   19   39:invokevirtual   #89  <Method java.math.BigInteger JsonParser.getBigIntegerValue()>
	//   20   42:areturn         
	}

	protected Object _deserializeFromEmpty(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #104 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore_3        
		if(jsontoken != JsonToken.START_ARRAY) goto _L2; else goto _L1
	//    3    5:aload_3         
	//    4    6:getstatic       #110 <Field JsonToken JsonToken.START_ARRAY>
	//    5    9:if_acmpne       46
_L1:
		if(!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) goto _L4; else goto _L3
	//    6   12:aload_2         
	//    7   13:getstatic       #113 <Field DeserializationFeature DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT>
	//    8   16:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//    9   19:ifeq            76
_L3:
		if(jsonparser.nextToken() != JsonToken.END_ARRAY) goto _L6; else goto _L5
	//   10   22:aload_1         
	//   11   23:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//   12   26:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//   13   29:if_acmpne       34
_L5:
		return ((Object) (null));
	//   14   32:aconst_null     
	//   15   33:areturn         
_L6:
		throw deserializationcontext.mappingException(handledType(), JsonToken.START_ARRAY);
	//   16   34:aload_2         
	//   17   35:aload_0         
	//   18   36:invokevirtual   #126 <Method Class handledType()>
	//   19   39:getstatic       #110 <Field JsonToken JsonToken.START_ARRAY>
	//   20   42:invokevirtual   #130 <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//   21   45:athrow          
_L2:
		if(jsontoken == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().trim().isEmpty()) goto _L5; else goto _L4
	//   22   46:aload_3         
	//   23   47:getstatic       #133 <Field JsonToken JsonToken.VALUE_STRING>
	//   24   50:if_acmpne       76
	//   25   53:aload_2         
	//   26   54:getstatic       #136 <Field DeserializationFeature DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT>
	//   27   57:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//   28   60:ifeq            76
	//   29   63:aload_1         
	//   30   64:invokevirtual   #140 <Method String JsonParser.getText()>
	//   31   67:invokevirtual   #143 <Method String String.trim()>
	//   32   70:invokevirtual   #147 <Method boolean String.isEmpty()>
	//   33   73:ifne            32
_L4:
		throw deserializationcontext.mappingException(handledType());
	//   34   76:aload_2         
	//   35   77:aload_0         
	//   36   78:invokevirtual   #126 <Method Class handledType()>
	//   37   81:invokevirtual   #150 <Method JsonMappingException DeserializationContext.mappingException(Class)>
	//   38   84:athrow          
	}

	protected void _failDoubleToIntCoercion(JsonParser jsonparser, DeserializationContext deserializationcontext, String s)
		throws IOException
	{
		throw deserializationcontext.mappingException("Can not coerce a floating-point value ('%s') into %s; enable `DeserializationFeature.ACCEPT_FLOAT_AS_INT` to allow", new Object[] {
			jsonparser.getValueAsString(), s
		});
	//    0    0:aload_2         
	//    1    1:ldc1            #155 <String "Can not coerce a floating-point value ('%s') into %s; enable `DeserializationFeature.ACCEPT_FLOAT_AS_INT` to allow">
	//    2    3:iconst_2        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_1         
	//    7   10:invokevirtual   #160 <Method String JsonParser.getValueAsString()>
	//    8   13:aastore         
	//    9   14:dup             
	//   10   15:iconst_1        
	//   11   16:aload_3         
	//   12   17:aastore         
	//   13   18:invokevirtual   #163 <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   14   21:athrow          
	}

	protected boolean _hasTextualNull(String s)
	{
		return "null".equals(((Object) (s)));
	//    0    0:ldc1            #167 <String "null">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #63  <Method boolean String.equals(Object)>
	//    3    6:ireturn         
	}

	protected final boolean _isIntNumber(String s)
	{
		int j = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #171 <Method int String.length()>
	//    2    4:istore_3        
		if(j <= 0) goto _L2; else goto _L1
	//    3    5:iload_3         
	//    4    6:ifle            55
_L1:
		int i;
		i = ((int) (s.charAt(0)));
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #175 <Method char String.charAt(int)>
	//    8   14:istore_2        
		char c;
		if(i == '-' || i == '+')
	//*   9   15:iload_2         
	//*  10   16:bipush          45
	//*  11   18:icmpeq          27
	//*  12   21:iload_2         
	//*  13   22:bipush          43
	//*  14   24:icmpne          57
			i = 1;
	//   15   27:iconst_1        
	//   16   28:istore_2        
		else
	//*  17   29:iload_2         
	//*  18   30:iload_3         
	//*  19   31:icmpge          69
	//*  20   34:aload_1         
	//*  21   35:iload_2         
	//*  22   36:invokevirtual   #175 <Method char String.charAt(int)>
	//*  23   39:istore          4
	//*  24   41:iload           4
	//*  25   43:bipush          57
	//*  26   45:icmpgt          55
	//*  27   48:iload           4
	//*  28   50:bipush          48
	//*  29   52:icmpge          62
	//*  30   55:iconst_0        
	//*  31   56:ireturn         
			i = 0;
	//   32   57:iconst_0        
	//   33   58:istore_2        
_L5:
		if(i >= j)
			break; /* Loop/switch isn't completed */
		c = s.charAt(i);
		if(c <= '9' && c >= '0') goto _L3; else goto _L2
_L2:
		return false;
	//*  34   59:goto            29
_L3:
		i++;
	//   35   62:iload_2         
	//   36   63:iconst_1        
	//   37   64:iadd            
	//   38   65:istore_2        
		if(true) goto _L5; else goto _L4
	//   39   66:goto            29
_L4:
		return true;
	//   40   69:iconst_1        
	//   41   70:ireturn         
	}

	protected final boolean _isNaN(String s)
	{
		return "NaN".equals(((Object) (s)));
	//    0    0:ldc1            #178 <String "NaN">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #63  <Method boolean String.equals(Object)>
	//    3    6:ireturn         
	}

	protected final boolean _isNegInf(String s)
	{
		return "-Infinity".equals(((Object) (s))) || "-INF".equals(((Object) (s)));
	//    0    0:ldc1            #181 <String "-Infinity">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #63  <Method boolean String.equals(Object)>
	//    3    6:ifne            18
	//    4    9:ldc1            #183 <String "-INF">
	//    5   11:aload_1         
	//    6   12:invokevirtual   #63  <Method boolean String.equals(Object)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	protected final boolean _isPosInf(String s)
	{
		return "Infinity".equals(((Object) (s))) || "INF".equals(((Object) (s)));
	//    0    0:ldc1            #186 <String "Infinity">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #63  <Method boolean String.equals(Object)>
	//    3    6:ifne            18
	//    4    9:ldc1            #188 <String "INF">
	//    5   11:aload_1         
	//    6   12:invokevirtual   #63  <Method boolean String.equals(Object)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	protected final Boolean _parseBoolean(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj = ((Object) (jsonparser.getCurrentToken()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #104 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore_3        
		if(obj == JsonToken.VALUE_TRUE)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #193 <Field JsonToken JsonToken.VALUE_TRUE>
	//*   5    9:if_acmpne       16
			return Boolean.TRUE;
	//    6   12:getstatic       #199 <Field Boolean Boolean.TRUE>
	//    7   15:areturn         
		if(obj == JsonToken.VALUE_FALSE)
	//*   8   16:aload_3         
	//*   9   17:getstatic       #202 <Field JsonToken JsonToken.VALUE_FALSE>
	//*  10   20:if_acmpne       27
			return Boolean.FALSE;
	//   11   23:getstatic       #205 <Field Boolean Boolean.FALSE>
	//   12   26:areturn         
		if(obj == JsonToken.VALUE_NUMBER_INT)
	//*  13   27:aload_3         
	//*  14   28:getstatic       #208 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  15   31:if_acmpne       69
			if(jsonparser.getNumberType() == com.fasterxml.jackson.core.JsonParser.NumberType.INT)
	//*  16   34:aload_1         
	//*  17   35:invokevirtual   #212 <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
	//*  18   38:getstatic       #218 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
	//*  19   41:if_acmpne       59
			{
				if(jsonparser.getIntValue() == 0)
	//*  20   44:aload_1         
	//*  21   45:invokevirtual   #221 <Method int JsonParser.getIntValue()>
	//*  22   48:ifne            55
					return Boolean.FALSE;
	//   23   51:getstatic       #205 <Field Boolean Boolean.FALSE>
	//   24   54:areturn         
				else
					return Boolean.TRUE;
	//   25   55:getstatic       #199 <Field Boolean Boolean.TRUE>
	//   26   58:areturn         
			} else
			{
				return Boolean.valueOf(_parseBooleanFromOther(jsonparser, deserializationcontext));
	//   27   59:aload_0         
	//   28   60:aload_1         
	//   29   61:aload_2         
	//   30   62:invokevirtual   #225 <Method boolean _parseBooleanFromOther(JsonParser, DeserializationContext)>
	//   31   65:invokestatic    #228 <Method Boolean Boolean.valueOf(boolean)>
	//   32   68:areturn         
			}
		if(obj == JsonToken.VALUE_NULL)
	//*  33   69:aload_3         
	//*  34   70:getstatic       #231 <Field JsonToken JsonToken.VALUE_NULL>
	//*  35   73:if_acmpne       85
			return (Boolean)getNullValue(deserializationcontext);
	//   36   76:aload_0         
	//   37   77:aload_2         
	//   38   78:invokevirtual   #235 <Method Object getNullValue(DeserializationContext)>
	//   39   81:checkcast       #195 <Class Boolean>
	//   40   84:areturn         
		if(obj == JsonToken.VALUE_STRING)
	//*  41   85:aload_3         
	//*  42   86:getstatic       #133 <Field JsonToken JsonToken.VALUE_STRING>
	//*  43   89:if_acmpne       189
		{
			jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   44   92:aload_1         
	//   45   93:invokevirtual   #140 <Method String JsonParser.getText()>
	//   46   96:invokevirtual   #143 <Method String String.trim()>
	//   47   99:astore_1        
			if("true".equals(((Object) (jsonparser))) || "True".equals(((Object) (jsonparser))))
	//*  48  100:ldc1            #237 <String "true">
	//*  49  102:aload_1         
	//*  50  103:invokevirtual   #63  <Method boolean String.equals(Object)>
	//*  51  106:ifne            118
	//*  52  109:ldc1            #239 <String "True">
	//*  53  111:aload_1         
	//*  54  112:invokevirtual   #63  <Method boolean String.equals(Object)>
	//*  55  115:ifeq            122
				return Boolean.TRUE;
	//   56  118:getstatic       #199 <Field Boolean Boolean.TRUE>
	//   57  121:areturn         
			if("false".equals(((Object) (jsonparser))) || "False".equals(((Object) (jsonparser))))
	//*  58  122:ldc1            #241 <String "false">
	//*  59  124:aload_1         
	//*  60  125:invokevirtual   #63  <Method boolean String.equals(Object)>
	//*  61  128:ifne            140
	//*  62  131:ldc1            #243 <String "False">
	//*  63  133:aload_1         
	//*  64  134:invokevirtual   #63  <Method boolean String.equals(Object)>
	//*  65  137:ifeq            144
				return Boolean.FALSE;
	//   66  140:getstatic       #205 <Field Boolean Boolean.FALSE>
	//   67  143:areturn         
			if(((String) (jsonparser)).length() == 0)
	//*  68  144:aload_1         
	//*  69  145:invokevirtual   #171 <Method int String.length()>
	//*  70  148:ifne            160
				return (Boolean)getEmptyValue(deserializationcontext);
	//   71  151:aload_0         
	//   72  152:aload_2         
	//   73  153:invokevirtual   #246 <Method Object getEmptyValue(DeserializationContext)>
	//   74  156:checkcast       #195 <Class Boolean>
	//   75  159:areturn         
			if(_hasTextualNull(((String) (jsonparser))))
	//*  76  160:aload_0         
	//*  77  161:aload_1         
	//*  78  162:invokevirtual   #248 <Method boolean _hasTextualNull(String)>
	//*  79  165:ifeq            177
				return (Boolean)getNullValue(deserializationcontext);
	//   80  168:aload_0         
	//   81  169:aload_2         
	//   82  170:invokevirtual   #235 <Method Object getNullValue(DeserializationContext)>
	//   83  173:checkcast       #195 <Class Boolean>
	//   84  176:areturn         
			else
				throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, "only \"true\" or \"false\" recognized");
	//   85  177:aload_2         
	//   86  178:aload_1         
	//   87  179:aload_0         
	//   88  180:getfield        #40  <Field Class _valueClass>
	//   89  183:ldc1            #250 <String "only \"true\" or \"false\" recognized">
	//   90  185:invokevirtual   #254 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   91  188:athrow          
		}
		if(obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  92  189:aload_3         
	//*  93  190:getstatic       #110 <Field JsonToken JsonToken.START_ARRAY>
	//*  94  193:if_acmpne       242
	//*  95  196:aload_2         
	//*  96  197:getstatic       #257 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  97  200:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  98  203:ifeq            242
		{
			jsonparser.nextToken();
	//   99  206:aload_1         
	//  100  207:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//  101  210:pop             
			obj = ((Object) (_parseBoolean(jsonparser, deserializationcontext)));
	//  102  211:aload_0         
	//  103  212:aload_1         
	//  104  213:aload_2         
	//  105  214:invokevirtual   #259 <Method Boolean _parseBoolean(JsonParser, DeserializationContext)>
	//  106  217:astore_3        
			if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//* 107  218:aload_1         
	//* 108  219:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//* 109  222:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//* 110  225:if_acmpeq       240
				throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'Boolean' value but there was more than a single value in the array");
	//  111  228:aload_2         
	//  112  229:aload_1         
	//  113  230:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//  114  233:ldc2            #261 <String "Attempted to unwrap single value array for single 'Boolean' value but there was more than a single value in the array">
	//  115  236:invokevirtual   #265 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//  116  239:athrow          
			else
				return ((Boolean) (obj));
	//  117  240:aload_3         
	//  118  241:areturn         
		} else
		{
			throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
	//  119  242:aload_2         
	//  120  243:aload_0         
	//  121  244:getfield        #40  <Field Class _valueClass>
	//  122  247:aload_3         
	//  123  248:invokevirtual   #130 <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//  124  251:athrow          
		}
	}

	protected final boolean _parseBooleanFromOther(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.getNumberType() == com.fasterxml.jackson.core.JsonParser.NumberType.LONG)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #212 <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
	//*   2    4:getstatic       #268 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
	//*   3    7:if_acmpne       35
		{
			if(jsonparser.getLongValue() == 0L)
	//*   4   10:aload_1         
	//*   5   11:invokevirtual   #93  <Method long JsonParser.getLongValue()>
	//*   6   14:lconst_0        
	//*   7   15:lcmp            
	//*   8   16:ifne            28
				jsonparser = ((JsonParser) (Boolean.FALSE));
	//    9   19:getstatic       #205 <Field Boolean Boolean.FALSE>
	//   10   22:astore_1        
			else
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #271 <Method boolean Boolean.booleanValue()>
	//*  13   27:ireturn         
				jsonparser = ((JsonParser) (Boolean.TRUE));
	//   14   28:getstatic       #199 <Field Boolean Boolean.TRUE>
	//   15   31:astore_1        
			return ((Boolean) (jsonparser)).booleanValue();
		}
	//*  16   32:goto            23
		jsonparser = ((JsonParser) (jsonparser.getText()));
	//   17   35:aload_1         
	//   18   36:invokevirtual   #140 <Method String JsonParser.getText()>
	//   19   39:astore_1        
		if("0.0".equals(((Object) (jsonparser))) || "0".equals(((Object) (jsonparser))))
	//*  20   40:ldc2            #273 <String "0.0">
	//*  21   43:aload_1         
	//*  22   44:invokevirtual   #63  <Method boolean String.equals(Object)>
	//*  23   47:ifne            60
	//*  24   50:ldc2            #275 <String "0">
	//*  25   53:aload_1         
	//*  26   54:invokevirtual   #63  <Method boolean String.equals(Object)>
	//*  27   57:ifeq            67
			return Boolean.FALSE.booleanValue();
	//   28   60:getstatic       #205 <Field Boolean Boolean.FALSE>
	//   29   63:invokevirtual   #271 <Method boolean Boolean.booleanValue()>
	//   30   66:ireturn         
		else
			return Boolean.TRUE.booleanValue();
	//   31   67:getstatic       #199 <Field Boolean Boolean.TRUE>
	//   32   70:invokevirtual   #271 <Method boolean Boolean.booleanValue()>
	//   33   73:ireturn         
	}

	protected final boolean _parseBooleanPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		boolean flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		boolean flag3 = false;
	//    2    3:iconst_0        
	//    3    4:istore          5
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #104 <Method JsonToken JsonParser.getCurrentToken()>
	//    6   10:astore          6
		boolean flag;
		if(jsontoken == JsonToken.VALUE_TRUE)
	//*   7   12:aload           6
	//*   8   14:getstatic       #193 <Field JsonToken JsonToken.VALUE_TRUE>
	//*   9   17:if_acmpne       24
		{
			flag = true;
	//   10   20:iconst_1        
	//   11   21:istore_3        
		} else
	//*  12   22:iload_3         
	//*  13   23:ireturn         
		{
			flag = flag3;
	//   14   24:iload           5
	//   15   26:istore_3        
			if(jsontoken != JsonToken.VALUE_FALSE)
	//*  16   27:aload           6
	//*  17   29:getstatic       #202 <Field JsonToken JsonToken.VALUE_FALSE>
	//*  18   32:if_acmpeq       22
			{
				flag = flag3;
	//   19   35:iload           5
	//   20   37:istore_3        
				if(jsontoken != JsonToken.VALUE_NULL)
	//*  21   38:aload           6
	//*  22   40:getstatic       #231 <Field JsonToken JsonToken.VALUE_NULL>
	//*  23   43:if_acmpeq       22
				{
					if(jsontoken == JsonToken.VALUE_NUMBER_INT)
	//*  24   46:aload           6
	//*  25   48:getstatic       #208 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  26   51:if_acmpne       88
						if(jsonparser.getNumberType() == com.fasterxml.jackson.core.JsonParser.NumberType.INT)
	//*  27   54:aload_1         
	//*  28   55:invokevirtual   #212 <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
	//*  29   58:getstatic       #218 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
	//*  30   61:if_acmpne       81
						{
							if(jsonparser.getIntValue() != 0)
	//*  31   64:aload_1         
	//*  32   65:invokevirtual   #221 <Method int JsonParser.getIntValue()>
	//*  33   68:ifeq            76
								flag = flag2;
	//   34   71:iload           4
	//   35   73:istore_3        
							else
	//*  36   74:iload_3         
	//*  37   75:ireturn         
								flag = false;
	//   38   76:iconst_0        
	//   39   77:istore_3        
							return flag;
						} else
	//*  40   78:goto            74
						{
							return _parseBooleanFromOther(jsonparser, deserializationcontext);
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:aload_2         
	//   44   84:invokevirtual   #225 <Method boolean _parseBooleanFromOther(JsonParser, DeserializationContext)>
	//   45   87:ireturn         
						}
					if(jsontoken == JsonToken.VALUE_STRING)
	//*  46   88:aload           6
	//*  47   90:getstatic       #133 <Field JsonToken JsonToken.VALUE_STRING>
	//*  48   93:if_acmpne       181
					{
						jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   49   96:aload_1         
	//   50   97:invokevirtual   #140 <Method String JsonParser.getText()>
	//   51  100:invokevirtual   #143 <Method String String.trim()>
	//   52  103:astore_1        
						if("true".equals(((Object) (jsonparser))) || "True".equals(((Object) (jsonparser))))
	//*  53  104:ldc1            #237 <String "true">
	//*  54  106:aload_1         
	//*  55  107:invokevirtual   #63  <Method boolean String.equals(Object)>
	//*  56  110:ifne            122
	//*  57  113:ldc1            #239 <String "True">
	//*  58  115:aload_1         
	//*  59  116:invokevirtual   #63  <Method boolean String.equals(Object)>
	//*  60  119:ifeq            124
							return true;
	//   61  122:iconst_1        
	//   62  123:ireturn         
						flag = flag3;
	//   63  124:iload           5
	//   64  126:istore_3        
						if(!"false".equals(((Object) (jsonparser))))
	//*  65  127:ldc1            #241 <String "false">
	//*  66  129:aload_1         
	//*  67  130:invokevirtual   #63  <Method boolean String.equals(Object)>
	//*  68  133:ifne            22
						{
							flag = flag3;
	//   69  136:iload           5
	//   70  138:istore_3        
							if(!"False".equals(((Object) (jsonparser))))
	//*  71  139:ldc1            #243 <String "False">
	//*  72  141:aload_1         
	//*  73  142:invokevirtual   #63  <Method boolean String.equals(Object)>
	//*  74  145:ifne            22
							{
								flag = flag3;
	//   75  148:iload           5
	//   76  150:istore_3        
								if(((String) (jsonparser)).length() != 0)
	//*  77  151:aload_1         
	//*  78  152:invokevirtual   #171 <Method int String.length()>
	//*  79  155:ifeq            22
								{
									flag = flag3;
	//   80  158:iload           5
	//   81  160:istore_3        
									if(!_hasTextualNull(((String) (jsonparser))))
	//*  82  161:aload_0         
	//*  83  162:aload_1         
	//*  84  163:invokevirtual   #248 <Method boolean _hasTextualNull(String)>
	//*  85  166:ifne            22
										throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, "only \"true\" or \"false\" recognized");
	//   86  169:aload_2         
	//   87  170:aload_1         
	//   88  171:aload_0         
	//   89  172:getfield        #40  <Field Class _valueClass>
	//   90  175:ldc1            #250 <String "only \"true\" or \"false\" recognized">
	//   91  177:invokevirtual   #254 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   92  180:athrow          
								}
							}
						}
					} else
					if(jsontoken == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  93  181:aload           6
	//*  94  183:getstatic       #110 <Field JsonToken JsonToken.START_ARRAY>
	//*  95  186:if_acmpne       235
	//*  96  189:aload_2         
	//*  97  190:getstatic       #257 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  98  193:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  99  196:ifeq            235
					{
						jsonparser.nextToken();
	//  100  199:aload_1         
	//  101  200:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//  102  203:pop             
						boolean flag1 = _parseBooleanPrimitive(jsonparser, deserializationcontext);
	//  103  204:aload_0         
	//  104  205:aload_1         
	//  105  206:aload_2         
	//  106  207:invokevirtual   #278 <Method boolean _parseBooleanPrimitive(JsonParser, DeserializationContext)>
	//  107  210:istore_3        
						if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//* 108  211:aload_1         
	//* 109  212:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//* 110  215:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//* 111  218:if_acmpeq       233
							throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'boolean' value but there was more than a single value in the array");
	//  112  221:aload_2         
	//  113  222:aload_1         
	//  114  223:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//  115  226:ldc2            #280 <String "Attempted to unwrap single value array for single 'boolean' value but there was more than a single value in the array">
	//  116  229:invokevirtual   #265 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//  117  232:athrow          
						else
							return flag1;
	//  118  233:iload_3         
	//  119  234:ireturn         
					} else
					{
						throw deserializationcontext.mappingException(_valueClass, jsontoken);
	//  120  235:aload_2         
	//  121  236:aload_0         
	//  122  237:getfield        #40  <Field Class _valueClass>
	//  123  240:aload           6
	//  124  242:invokevirtual   #130 <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//  125  245:athrow          
					}
				}
			}
		}
		return flag;
	}

	protected Byte _parseByte(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj = ((Object) (jsonparser.getCurrentToken()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #104 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          4
		if(obj == JsonToken.VALUE_NUMBER_INT)
	//*   3    6:aload           4
	//*   4    8:getstatic       #208 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5   11:if_acmpne       22
			return Byte.valueOf(jsonparser.getByteValue());
	//    6   14:aload_1         
	//    7   15:invokevirtual   #288 <Method byte JsonParser.getByteValue()>
	//    8   18:invokestatic    #293 <Method Byte Byte.valueOf(byte)>
	//    9   21:areturn         
		if(obj == JsonToken.VALUE_STRING)
	//*  10   22:aload           4
	//*  11   24:getstatic       #133 <Field JsonToken JsonToken.VALUE_STRING>
	//*  12   27:if_acmpne       123
		{
			jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   13   30:aload_1         
	//   14   31:invokevirtual   #140 <Method String JsonParser.getText()>
	//   15   34:invokevirtual   #143 <Method String String.trim()>
	//   16   37:astore_1        
			if(_hasTextualNull(((String) (jsonparser))))
	//*  17   38:aload_0         
	//*  18   39:aload_1         
	//*  19   40:invokevirtual   #248 <Method boolean _hasTextualNull(String)>
	//*  20   43:ifeq            55
				return (Byte)getNullValue(deserializationcontext);
	//   21   46:aload_0         
	//   22   47:aload_2         
	//   23   48:invokevirtual   #235 <Method Object getNullValue(DeserializationContext)>
	//   24   51:checkcast       #290 <Class Byte>
	//   25   54:areturn         
			int i;
			try
			{
				if(((String) (jsonparser)).length() == 0)
	//*  26   55:aload_1         
	//*  27   56:invokevirtual   #171 <Method int String.length()>
	//*  28   59:ifne            71
					return (Byte)getEmptyValue(deserializationcontext);
	//   29   62:aload_0         
	//   30   63:aload_2         
	//   31   64:invokevirtual   #246 <Method Object getEmptyValue(DeserializationContext)>
	//   32   67:checkcast       #290 <Class Byte>
	//   33   70:areturn         
				i = NumberInput.parseInt(((String) (jsonparser)));
	//   34   71:aload_1         
	//   35   72:invokestatic    #299 <Method int NumberInput.parseInt(String)>
	//   36   75:istore_3        
			}
	//*  37   76:iload_3         
	//*  38   77:bipush          -128
	//*  39   79:icmplt          89
	//*  40   82:iload_3         
	//*  41   83:sipush          255
	//*  42   86:icmple          117
	//*  43   89:aload_2         
	//*  44   90:aload_1         
	//*  45   91:aload_0         
	//*  46   92:getfield        #40  <Field Class _valueClass>
	//*  47   95:ldc2            #301 <String "overflow, value can not be represented as 8-bit value">
	//*  48   98:invokevirtual   #254 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//*  49  101:athrow          
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  50  102:astore          4
			{
				throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, "not a valid Byte value");
	//   51  104:aload_2         
	//   52  105:aload_1         
	//   53  106:aload_0         
	//   54  107:getfield        #40  <Field Class _valueClass>
	//   55  110:ldc2            #303 <String "not a valid Byte value">
	//   56  113:invokevirtual   #254 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   57  116:athrow          
			}
			if(i < -128 || i > 255)
				throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, "overflow, value can not be represented as 8-bit value");
			else
				return Byte.valueOf((byte)i);
	//   58  117:iload_3         
	//   59  118:int2byte        
	//   60  119:invokestatic    #293 <Method Byte Byte.valueOf(byte)>
	//   61  122:areturn         
		}
		if(obj == JsonToken.VALUE_NUMBER_FLOAT)
	//*  62  123:aload           4
	//*  63  125:getstatic       #306 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*  64  128:if_acmpne       158
		{
			if(!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT))
	//*  65  131:aload_2         
	//*  66  132:getstatic       #309 <Field DeserializationFeature DeserializationFeature.ACCEPT_FLOAT_AS_INT>
	//*  67  135:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  68  138:ifne            150
				_failDoubleToIntCoercion(jsonparser, deserializationcontext, "Byte");
	//   69  141:aload_0         
	//   70  142:aload_1         
	//   71  143:aload_2         
	//   72  144:ldc2            #311 <String "Byte">
	//   73  147:invokevirtual   #313 <Method void _failDoubleToIntCoercion(JsonParser, DeserializationContext, String)>
			return Byte.valueOf(jsonparser.getByteValue());
	//   74  150:aload_1         
	//   75  151:invokevirtual   #288 <Method byte JsonParser.getByteValue()>
	//   76  154:invokestatic    #293 <Method Byte Byte.valueOf(byte)>
	//   77  157:areturn         
		}
		if(obj == JsonToken.VALUE_NULL)
	//*  78  158:aload           4
	//*  79  160:getstatic       #231 <Field JsonToken JsonToken.VALUE_NULL>
	//*  80  163:if_acmpne       175
			return (Byte)getNullValue(deserializationcontext);
	//   81  166:aload_0         
	//   82  167:aload_2         
	//   83  168:invokevirtual   #235 <Method Object getNullValue(DeserializationContext)>
	//   84  171:checkcast       #290 <Class Byte>
	//   85  174:areturn         
		if(obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  86  175:aload           4
	//*  87  177:getstatic       #110 <Field JsonToken JsonToken.START_ARRAY>
	//*  88  180:if_acmpne       231
	//*  89  183:aload_2         
	//*  90  184:getstatic       #257 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  91  187:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  92  190:ifeq            231
		{
			jsonparser.nextToken();
	//   93  193:aload_1         
	//   94  194:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//   95  197:pop             
			obj = ((Object) (_parseByte(jsonparser, deserializationcontext)));
	//   96  198:aload_0         
	//   97  199:aload_1         
	//   98  200:aload_2         
	//   99  201:invokevirtual   #315 <Method Byte _parseByte(JsonParser, DeserializationContext)>
	//  100  204:astore          4
			if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//* 101  206:aload_1         
	//* 102  207:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//* 103  210:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//* 104  213:if_acmpeq       228
				throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'Byte' value but there was more than a single value in the array");
	//  105  216:aload_2         
	//  106  217:aload_1         
	//  107  218:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//  108  221:ldc2            #317 <String "Attempted to unwrap single value array for single 'Byte' value but there was more than a single value in the array">
	//  109  224:invokevirtual   #265 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//  110  227:athrow          
			else
				return ((Byte) (obj));
	//  111  228:aload           4
	//  112  230:areturn         
		} else
		{
			throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
	//  113  231:aload_2         
	//  114  232:aload_0         
	//  115  233:getfield        #40  <Field Class _valueClass>
	//  116  236:aload           4
	//  117  238:invokevirtual   #130 <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//  118  241:athrow          
		}
	}

	protected Date _parseDate(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj;
		obj = ((Object) (jsonparser.getCurrentToken()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #104 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore_3        
		if(obj == JsonToken.VALUE_NUMBER_INT)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #208 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5    9:if_acmpne       24
			return new Date(jsonparser.getLongValue());
	//    6   12:new             #321 <Class Date>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokevirtual   #93  <Method long JsonParser.getLongValue()>
	//   10   20:invokespecial   #324 <Method void Date(long)>
	//   11   23:areturn         
		if(obj == JsonToken.VALUE_NULL)
	//*  12   24:aload_3         
	//*  13   25:getstatic       #231 <Field JsonToken JsonToken.VALUE_NULL>
	//*  14   28:if_acmpne       40
			return (Date)getNullValue(deserializationcontext);
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:invokevirtual   #235 <Method Object getNullValue(DeserializationContext)>
	//   18   36:checkcast       #321 <Class Date>
	//   19   39:areturn         
		if(obj != JsonToken.VALUE_STRING)
			break MISSING_BLOCK_LABEL_148;
	//   20   40:aload_3         
	//   21   41:getstatic       #133 <Field JsonToken JsonToken.VALUE_STRING>
	//   22   44:if_acmpne       148
		obj = null;
	//   23   47:aconst_null     
	//   24   48:astore_3        
		try
		{
			jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   25   49:aload_1         
	//   26   50:invokevirtual   #140 <Method String JsonParser.getText()>
	//   27   53:invokevirtual   #143 <Method String String.trim()>
	//   28   56:astore_1        
		}
	//*  29   57:aload_1         
	//*  30   58:astore_3        
	//*  31   59:aload_1         
	//*  32   60:invokevirtual   #171 <Method int String.length()>
	//*  33   63:ifne            77
	//*  34   66:aload_1         
	//*  35   67:astore_3        
	//*  36   68:aload_0         
	//*  37   69:aload_2         
	//*  38   70:invokevirtual   #246 <Method Object getEmptyValue(DeserializationContext)>
	//*  39   73:checkcast       #321 <Class Date>
	//*  40   76:areturn         
	//*  41   77:aload_1         
	//*  42   78:astore_3        
	//*  43   79:aload_0         
	//*  44   80:aload_1         
	//*  45   81:invokevirtual   #248 <Method boolean _hasTextualNull(String)>
	//*  46   84:ifeq            98
	//*  47   87:aload_1         
	//*  48   88:astore_3        
	//*  49   89:aload_0         
	//*  50   90:aload_2         
	//*  51   91:invokevirtual   #235 <Method Object getNullValue(DeserializationContext)>
	//*  52   94:checkcast       #321 <Class Date>
	//*  53   97:areturn         
	//*  54   98:aload_1         
	//*  55   99:astore_3        
	//*  56  100:aload_2         
	//*  57  101:aload_1         
	//*  58  102:invokevirtual   #328 <Method Date DeserializationContext.parseDate(String)>
	//*  59  105:astore_1        
	//*  60  106:aload_1         
	//*  61  107:areturn         
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
	//*  62  108:astore_1        
		{
			throw deserializationcontext.weirdStringException(((String) (obj)), _valueClass, (new StringBuilder()).append("not a valid representation (error: ").append(((IllegalArgumentException) (jsonparser)).getMessage()).append(")").toString());
	//   63  109:aload_2         
	//   64  110:aload_3         
	//   65  111:aload_0         
	//   66  112:getfield        #40  <Field Class _valueClass>
	//   67  115:new             #330 <Class StringBuilder>
	//   68  118:dup             
	//   69  119:invokespecial   #331 <Method void StringBuilder()>
	//   70  122:ldc2            #333 <String "not a valid representation (error: ">
	//   71  125:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//   72  128:aload_1         
	//   73  129:invokevirtual   #340 <Method String IllegalArgumentException.getMessage()>
	//   74  132:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//   75  135:ldc2            #342 <String ")">
	//   76  138:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//   77  141:invokevirtual   #345 <Method String StringBuilder.toString()>
	//   78  144:invokevirtual   #254 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   79  147:athrow          
		}
		obj = ((Object) (jsonparser));
		if(((String) (jsonparser)).length() != 0)
			break MISSING_BLOCK_LABEL_77;
		obj = ((Object) (jsonparser));
		return (Date)getEmptyValue(deserializationcontext);
		obj = ((Object) (jsonparser));
		if(!_hasTextualNull(((String) (jsonparser))))
			break MISSING_BLOCK_LABEL_98;
		obj = ((Object) (jsonparser));
		return (Date)getNullValue(deserializationcontext);
		obj = ((Object) (jsonparser));
		jsonparser = ((JsonParser) (deserializationcontext.parseDate(((String) (jsonparser)))));
		return ((Date) (jsonparser));
		if(obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  80  148:aload_3         
	//*  81  149:getstatic       #110 <Field JsonToken JsonToken.START_ARRAY>
	//*  82  152:if_acmpne       201
	//*  83  155:aload_2         
	//*  84  156:getstatic       #257 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  85  159:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  86  162:ifeq            201
		{
			jsonparser.nextToken();
	//   87  165:aload_1         
	//   88  166:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//   89  169:pop             
			obj = ((Object) (_parseDate(jsonparser, deserializationcontext)));
	//   90  170:aload_0         
	//   91  171:aload_1         
	//   92  172:aload_2         
	//   93  173:invokevirtual   #347 <Method Date _parseDate(JsonParser, DeserializationContext)>
	//   94  176:astore_3        
			if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//*  95  177:aload_1         
	//*  96  178:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//*  97  181:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//*  98  184:if_acmpeq       199
				throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'java.util.Date' value but there was more than a single value in the array");
	//   99  187:aload_2         
	//  100  188:aload_1         
	//  101  189:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//  102  192:ldc2            #349 <String "Attempted to unwrap single value array for single 'java.util.Date' value but there was more than a single value in the array">
	//  103  195:invokevirtual   #265 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//  104  198:athrow          
			else
				return ((Date) (obj));
	//  105  199:aload_3         
	//  106  200:areturn         
		} else
		{
			throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
	//  107  201:aload_2         
	//  108  202:aload_0         
	//  109  203:getfield        #40  <Field Class _valueClass>
	//  110  206:aload_3         
	//  111  207:invokevirtual   #130 <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//  112  210:athrow          
		}
	}

	protected final Double _parseDouble(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj;
		obj = ((Object) (jsonparser.getCurrentToken()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #104 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          5
		if(obj == JsonToken.VALUE_NUMBER_INT || obj == JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    6:aload           5
	//*   4    8:getstatic       #208 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5   11:if_acmpeq       22
	//*   6   14:aload           5
	//*   7   16:getstatic       #306 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   19:if_acmpne       30
			return Double.valueOf(jsonparser.getDoubleValue());
	//    9   22:aload_1         
	//   10   23:invokevirtual   #355 <Method double JsonParser.getDoubleValue()>
	//   11   26:invokestatic    #358 <Method Double Double.valueOf(double)>
	//   12   29:areturn         
		if(obj != JsonToken.VALUE_STRING) goto _L2; else goto _L1
	//   13   30:aload           5
	//   14   32:getstatic       #133 <Field JsonToken JsonToken.VALUE_STRING>
	//   15   35:if_acmpne       190
_L1:
		jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   16   38:aload_1         
	//   17   39:invokevirtual   #140 <Method String JsonParser.getText()>
	//   18   42:invokevirtual   #143 <Method String String.trim()>
	//   19   45:astore_1        
		if(((String) (jsonparser)).length() == 0)
	//*  20   46:aload_1         
	//*  21   47:invokevirtual   #171 <Method int String.length()>
	//*  22   50:ifne            62
			return (Double)getEmptyValue(deserializationcontext);
	//   23   53:aload_0         
	//   24   54:aload_2         
	//   25   55:invokevirtual   #246 <Method Object getEmptyValue(DeserializationContext)>
	//   26   58:checkcast       #67  <Class Double>
	//   27   61:areturn         
		if(_hasTextualNull(((String) (jsonparser))))
	//*  28   62:aload_0         
	//*  29   63:aload_1         
	//*  30   64:invokevirtual   #248 <Method boolean _hasTextualNull(String)>
	//*  31   67:ifeq            79
			return (Double)getNullValue(deserializationcontext);
	//   32   70:aload_0         
	//   33   71:aload_2         
	//   34   72:invokevirtual   #235 <Method Object getNullValue(DeserializationContext)>
	//   35   75:checkcast       #67  <Class Double>
	//   36   78:areturn         
		((String) (jsonparser)).charAt(0);
	//   37   79:aload_1         
	//   38   80:iconst_0        
	//   39   81:invokevirtual   #175 <Method char String.charAt(int)>
		JVM INSTR lookupswitch 3: default 120
	//	               45: 160
	//	               73: 130
	//	               78: 145;
	//   40   84:lookupswitch    3: default 120
	//	               45: 160
	//	               73: 130
	//	               78: 145
		   goto _L3 _L4 _L5 _L6
_L3:
		double d;
		try
		{
			d = parseDouble(((String) (jsonparser)));
	//   41  120:aload_1         
	//   42  121:invokestatic    #359 <Method double parseDouble(String)>
	//   43  124:dstore_3        
		}
	//*  44  125:dload_3         
	//*  45  126:invokestatic    #358 <Method Double Double.valueOf(double)>
	//*  46  129:areturn         
	//*  47  130:aload_0         
	//*  48  131:aload_1         
	//*  49  132:invokevirtual   #361 <Method boolean _isPosInf(String)>
	//*  50  135:ifeq            120
	//*  51  138:ldc2w           #362 <Double (1.0D / 0.0D)>
	//*  52  141:invokestatic    #358 <Method Double Double.valueOf(double)>
	//*  53  144:areturn         
	//*  54  145:aload_0         
	//*  55  146:aload_1         
	//*  56  147:invokevirtual   #365 <Method boolean _isNaN(String)>
	//*  57  150:ifeq            120
	//*  58  153:ldc2w           #366 <Double (0.0D / 0.0D)>
	//*  59  156:invokestatic    #358 <Method Double Double.valueOf(double)>
	//*  60  159:areturn         
	//*  61  160:aload_0         
	//*  62  161:aload_1         
	//*  63  162:invokevirtual   #369 <Method boolean _isNegInf(String)>
	//*  64  165:ifeq            120
	//*  65  168:ldc2w           #370 <Double (-1.0D / 0.0D)>
	//*  66  171:invokestatic    #358 <Method Double Double.valueOf(double)>
	//*  67  174:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  68  175:astore          5
		{
			throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, "not a valid Double value");
	//   69  177:aload_2         
	//   70  178:aload_1         
	//   71  179:aload_0         
	//   72  180:getfield        #40  <Field Class _valueClass>
	//   73  183:ldc2            #373 <String "not a valid Double value">
	//   74  186:invokevirtual   #254 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   75  189:athrow          
		}
		return Double.valueOf(d);
_L5:
		if(!_isPosInf(((String) (jsonparser)))) goto _L3; else goto _L7
_L7:
		return Double.valueOf((1.0D / 0.0D));
_L6:
		if(!_isNaN(((String) (jsonparser)))) goto _L3; else goto _L8
_L8:
		return Double.valueOf((0.0D / 0.0D));
_L4:
		if(!_isNegInf(((String) (jsonparser)))) goto _L3; else goto _L9
_L9:
		return Double.valueOf((-1.0D / 0.0D));
_L2:
		if(obj == JsonToken.VALUE_NULL)
	//*  76  190:aload           5
	//*  77  192:getstatic       #231 <Field JsonToken JsonToken.VALUE_NULL>
	//*  78  195:if_acmpne       207
			return (Double)getNullValue(deserializationcontext);
	//   79  198:aload_0         
	//   80  199:aload_2         
	//   81  200:invokevirtual   #235 <Method Object getNullValue(DeserializationContext)>
	//   82  203:checkcast       #67  <Class Double>
	//   83  206:areturn         
		if(obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  84  207:aload           5
	//*  85  209:getstatic       #110 <Field JsonToken JsonToken.START_ARRAY>
	//*  86  212:if_acmpne       263
	//*  87  215:aload_2         
	//*  88  216:getstatic       #257 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  89  219:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  90  222:ifeq            263
		{
			jsonparser.nextToken();
	//   91  225:aload_1         
	//   92  226:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//   93  229:pop             
			obj = ((Object) (_parseDouble(jsonparser, deserializationcontext)));
	//   94  230:aload_0         
	//   95  231:aload_1         
	//   96  232:aload_2         
	//   97  233:invokevirtual   #375 <Method Double _parseDouble(JsonParser, DeserializationContext)>
	//   98  236:astore          5
			if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//*  99  238:aload_1         
	//* 100  239:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//* 101  242:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//* 102  245:if_acmpeq       260
				throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'Double' value but there was more than a single value in the array");
	//  103  248:aload_2         
	//  104  249:aload_1         
	//  105  250:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//  106  253:ldc2            #377 <String "Attempted to unwrap single value array for single 'Double' value but there was more than a single value in the array">
	//  107  256:invokevirtual   #265 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//  108  259:athrow          
			else
				return ((Double) (obj));
	//  109  260:aload           5
	//  110  262:areturn         
		} else
		{
			throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
	//  111  263:aload_2         
	//  112  264:aload_0         
	//  113  265:getfield        #40  <Field Class _valueClass>
	//  114  268:aload           5
	//  115  270:invokevirtual   #130 <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//  116  273:athrow          
		}
	}

	protected final double _parseDoublePrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		double d1;
		Object obj;
		d1 = 0.0D;
	//    0    0:dconst_0        
	//    1    1:dstore          5
		obj = ((Object) (jsonparser.getCurrentToken()));
	//    2    3:aload_1         
	//    3    4:invokevirtual   #104 <Method JsonToken JsonParser.getCurrentToken()>
	//    4    7:astore          7
		if(obj != JsonToken.VALUE_NUMBER_INT && obj != JsonToken.VALUE_NUMBER_FLOAT) goto _L2; else goto _L1
	//    5    9:aload           7
	//    6   11:getstatic       #208 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//    7   14:if_acmpeq       25
	//    8   17:aload           7
	//    9   19:getstatic       #306 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//   10   22:if_acmpne       32
_L1:
		double d = jsonparser.getDoubleValue();
	//   11   25:aload_1         
	//   12   26:invokevirtual   #355 <Method double JsonParser.getDoubleValue()>
	//   13   29:dstore_3        
_L13:
		return d;
	//   14   30:dload_3         
	//   15   31:dreturn         
_L2:
		if(obj != JsonToken.VALUE_STRING) goto _L4; else goto _L3
	//   16   32:aload           7
	//   17   34:getstatic       #133 <Field JsonToken JsonToken.VALUE_STRING>
	//   18   37:if_acmpne       166
_L3:
		jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   19   40:aload_1         
	//   20   41:invokevirtual   #140 <Method String JsonParser.getText()>
	//   21   44:invokevirtual   #143 <Method String String.trim()>
	//   22   47:astore_1        
		d = d1;
	//   23   48:dload           5
	//   24   50:dstore_3        
		if(((String) (jsonparser)).length() == 0)
			continue; /* Loop/switch isn't completed */
	//   25   51:aload_1         
	//   26   52:invokevirtual   #171 <Method int String.length()>
	//   27   55:ifeq            30
		d = d1;
	//   28   58:dload           5
	//   29   60:dstore_3        
		if(_hasTextualNull(((String) (jsonparser))))
			continue; /* Loop/switch isn't completed */
	//   30   61:aload_0         
	//   31   62:aload_1         
	//   32   63:invokevirtual   #248 <Method boolean _hasTextualNull(String)>
	//   33   66:ifne            30
		((String) (jsonparser)).charAt(0);
	//   34   69:aload_1         
	//   35   70:iconst_0        
	//   36   71:invokevirtual   #175 <Method char String.charAt(int)>
		JVM INSTR lookupswitch 3: default 108
	//	               45: 139
	//	               73: 115
	//	               78: 127;
	//   37   74:lookupswitch    3: default 108
	//	               45: 139
	//	               73: 115
	//	               78: 127
		   goto _L5 _L6 _L7 _L8
_L5:
		try
		{
			d = parseDouble(((String) (jsonparser)));
	//   38  108:aload_1         
	//   39  109:invokestatic    #359 <Method double parseDouble(String)>
	//   40  112:dstore_3        
		}
	//*  41  113:dload_3         
	//*  42  114:dreturn         
	//*  43  115:aload_0         
	//*  44  116:aload_1         
	//*  45  117:invokevirtual   #361 <Method boolean _isPosInf(String)>
	//*  46  120:ifeq            108
	//*  47  123:ldc2w           #362 <Double (1.0D / 0.0D)>
	//*  48  126:dreturn         
	//*  49  127:aload_0         
	//*  50  128:aload_1         
	//*  51  129:invokevirtual   #365 <Method boolean _isNaN(String)>
	//*  52  132:ifeq            108
	//*  53  135:ldc2w           #366 <Double (0.0D / 0.0D)>
	//*  54  138:dreturn         
	//*  55  139:aload_0         
	//*  56  140:aload_1         
	//*  57  141:invokevirtual   #369 <Method boolean _isNegInf(String)>
	//*  58  144:ifeq            108
	//*  59  147:ldc2w           #370 <Double (-1.0D / 0.0D)>
	//*  60  150:dreturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  61  151:astore          7
		{
			throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, "not a valid double value");
	//   62  153:aload_2         
	//   63  154:aload_1         
	//   64  155:aload_0         
	//   65  156:getfield        #40  <Field Class _valueClass>
	//   66  159:ldc2            #381 <String "not a valid double value">
	//   67  162:invokevirtual   #254 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   68  165:athrow          
		}
		return d;
_L7:
		if(!_isPosInf(((String) (jsonparser)))) goto _L5; else goto _L9
_L9:
		return (1.0D / 0.0D);
_L8:
		if(!_isNaN(((String) (jsonparser)))) goto _L5; else goto _L10
_L10:
		return (0.0D / 0.0D);
_L6:
		if(!_isNegInf(((String) (jsonparser)))) goto _L5; else goto _L11
_L11:
		return (-1.0D / 0.0D);
_L4:
		d = d1;
	//   69  166:dload           5
	//   70  168:dstore_3        
		if(obj != JsonToken.VALUE_NULL)
	//*  71  169:aload           7
	//*  72  171:getstatic       #231 <Field JsonToken JsonToken.VALUE_NULL>
	//*  73  174:if_acmpeq       30
			if(obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  74  177:aload           7
	//*  75  179:getstatic       #110 <Field JsonToken JsonToken.START_ARRAY>
	//*  76  182:if_acmpne       229
	//*  77  185:aload_2         
	//*  78  186:getstatic       #257 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  79  189:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  80  192:ifeq            229
			{
				jsonparser.nextToken();
	//   81  195:aload_1         
	//   82  196:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//   83  199:pop             
				d = _parseDoublePrimitive(jsonparser, deserializationcontext);
	//   84  200:aload_0         
	//   85  201:aload_1         
	//   86  202:aload_2         
	//   87  203:invokevirtual   #383 <Method double _parseDoublePrimitive(JsonParser, DeserializationContext)>
	//   88  206:dstore_3        
				if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//*  89  207:aload_1         
	//*  90  208:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//*  91  211:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//*  92  214:if_acmpeq       30
					throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'Byte' value but there was more than a single value in the array");
	//   93  217:aload_2         
	//   94  218:aload_1         
	//   95  219:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//   96  222:ldc2            #317 <String "Attempted to unwrap single value array for single 'Byte' value but there was more than a single value in the array">
	//   97  225:invokevirtual   #265 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//   98  228:athrow          
			} else
			{
				throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
	//   99  229:aload_2         
	//  100  230:aload_0         
	//  101  231:getfield        #40  <Field Class _valueClass>
	//  102  234:aload           7
	//  103  236:invokevirtual   #130 <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//  104  239:athrow          
			}
		if(true) goto _L13; else goto _L12
_L12:
	}

	protected final Float _parseFloat(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj;
		obj = ((Object) (jsonparser.getCurrentToken()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #104 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          4
		if(obj == JsonToken.VALUE_NUMBER_INT || obj == JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    6:aload           4
	//*   4    8:getstatic       #208 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5   11:if_acmpeq       22
	//*   6   14:aload           4
	//*   7   16:getstatic       #306 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   19:if_acmpne       30
			return Float.valueOf(jsonparser.getFloatValue());
	//    9   22:aload_1         
	//   10   23:invokevirtual   #389 <Method float JsonParser.getFloatValue()>
	//   11   26:invokestatic    #394 <Method Float Float.valueOf(float)>
	//   12   29:areturn         
		if(obj != JsonToken.VALUE_STRING) goto _L2; else goto _L1
	//   13   30:aload           4
	//   14   32:getstatic       #133 <Field JsonToken JsonToken.VALUE_STRING>
	//   15   35:if_acmpne       190
_L1:
		jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   16   38:aload_1         
	//   17   39:invokevirtual   #140 <Method String JsonParser.getText()>
	//   18   42:invokevirtual   #143 <Method String String.trim()>
	//   19   45:astore_1        
		if(((String) (jsonparser)).length() == 0)
	//*  20   46:aload_1         
	//*  21   47:invokevirtual   #171 <Method int String.length()>
	//*  22   50:ifne            62
			return (Float)getEmptyValue(deserializationcontext);
	//   23   53:aload_0         
	//   24   54:aload_2         
	//   25   55:invokevirtual   #246 <Method Object getEmptyValue(DeserializationContext)>
	//   26   58:checkcast       #391 <Class Float>
	//   27   61:areturn         
		if(_hasTextualNull(((String) (jsonparser))))
	//*  28   62:aload_0         
	//*  29   63:aload_1         
	//*  30   64:invokevirtual   #248 <Method boolean _hasTextualNull(String)>
	//*  31   67:ifeq            79
			return (Float)getNullValue(deserializationcontext);
	//   32   70:aload_0         
	//   33   71:aload_2         
	//   34   72:invokevirtual   #235 <Method Object getNullValue(DeserializationContext)>
	//   35   75:checkcast       #391 <Class Float>
	//   36   78:areturn         
		((String) (jsonparser)).charAt(0);
	//   37   79:aload_1         
	//   38   80:iconst_0        
	//   39   81:invokevirtual   #175 <Method char String.charAt(int)>
		JVM INSTR lookupswitch 3: default 120
	//	               45: 160
	//	               73: 130
	//	               78: 145;
	//   40   84:lookupswitch    3: default 120
	//	               45: 160
	//	               73: 130
	//	               78: 145
		   goto _L3 _L4 _L5 _L6
_L3:
		float f;
		try
		{
			f = Float.parseFloat(((String) (jsonparser)));
	//   41  120:aload_1         
	//   42  121:invokestatic    #398 <Method float Float.parseFloat(String)>
	//   43  124:fstore_3        
		}
	//*  44  125:fload_3         
	//*  45  126:invokestatic    #394 <Method Float Float.valueOf(float)>
	//*  46  129:areturn         
	//*  47  130:aload_0         
	//*  48  131:aload_1         
	//*  49  132:invokevirtual   #361 <Method boolean _isPosInf(String)>
	//*  50  135:ifeq            120
	//*  51  138:ldc2            #399 <Float (1.0F / 0.0F)>
	//*  52  141:invokestatic    #394 <Method Float Float.valueOf(float)>
	//*  53  144:areturn         
	//*  54  145:aload_0         
	//*  55  146:aload_1         
	//*  56  147:invokevirtual   #365 <Method boolean _isNaN(String)>
	//*  57  150:ifeq            120
	//*  58  153:ldc2            #400 <Float (0.0F / 0.0F)>
	//*  59  156:invokestatic    #394 <Method Float Float.valueOf(float)>
	//*  60  159:areturn         
	//*  61  160:aload_0         
	//*  62  161:aload_1         
	//*  63  162:invokevirtual   #369 <Method boolean _isNegInf(String)>
	//*  64  165:ifeq            120
	//*  65  168:ldc2            #401 <Float (-1.0F / 0.0F)>
	//*  66  171:invokestatic    #394 <Method Float Float.valueOf(float)>
	//*  67  174:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  68  175:astore          4
		{
			throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, "not a valid Float value");
	//   69  177:aload_2         
	//   70  178:aload_1         
	//   71  179:aload_0         
	//   72  180:getfield        #40  <Field Class _valueClass>
	//   73  183:ldc2            #403 <String "not a valid Float value">
	//   74  186:invokevirtual   #254 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   75  189:athrow          
		}
		return Float.valueOf(f);
_L5:
		if(!_isPosInf(((String) (jsonparser)))) goto _L3; else goto _L7
_L7:
		return Float.valueOf((1.0F / 0.0F));
_L6:
		if(!_isNaN(((String) (jsonparser)))) goto _L3; else goto _L8
_L8:
		return Float.valueOf((0.0F / 0.0F));
_L4:
		if(!_isNegInf(((String) (jsonparser)))) goto _L3; else goto _L9
_L9:
		return Float.valueOf((-1.0F / 0.0F));
_L2:
		if(obj == JsonToken.VALUE_NULL)
	//*  76  190:aload           4
	//*  77  192:getstatic       #231 <Field JsonToken JsonToken.VALUE_NULL>
	//*  78  195:if_acmpne       207
			return (Float)getNullValue(deserializationcontext);
	//   79  198:aload_0         
	//   80  199:aload_2         
	//   81  200:invokevirtual   #235 <Method Object getNullValue(DeserializationContext)>
	//   82  203:checkcast       #391 <Class Float>
	//   83  206:areturn         
		if(obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  84  207:aload           4
	//*  85  209:getstatic       #110 <Field JsonToken JsonToken.START_ARRAY>
	//*  86  212:if_acmpne       263
	//*  87  215:aload_2         
	//*  88  216:getstatic       #257 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  89  219:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  90  222:ifeq            263
		{
			jsonparser.nextToken();
	//   91  225:aload_1         
	//   92  226:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//   93  229:pop             
			obj = ((Object) (_parseFloat(jsonparser, deserializationcontext)));
	//   94  230:aload_0         
	//   95  231:aload_1         
	//   96  232:aload_2         
	//   97  233:invokevirtual   #405 <Method Float _parseFloat(JsonParser, DeserializationContext)>
	//   98  236:astore          4
			if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//*  99  238:aload_1         
	//* 100  239:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//* 101  242:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//* 102  245:if_acmpeq       260
				throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'Byte' value but there was more than a single value in the array");
	//  103  248:aload_2         
	//  104  249:aload_1         
	//  105  250:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//  106  253:ldc2            #317 <String "Attempted to unwrap single value array for single 'Byte' value but there was more than a single value in the array">
	//  107  256:invokevirtual   #265 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//  108  259:athrow          
			else
				return ((Float) (obj));
	//  109  260:aload           4
	//  110  262:areturn         
		} else
		{
			throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
	//  111  263:aload_2         
	//  112  264:aload_0         
	//  113  265:getfield        #40  <Field Class _valueClass>
	//  114  268:aload           4
	//  115  270:invokevirtual   #130 <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//  116  273:athrow          
		}
	}

	protected final float _parseFloatPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		float f1;
		Object obj;
		f1 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore          4
		obj = ((Object) (jsonparser.getCurrentToken()));
	//    2    3:aload_1         
	//    3    4:invokevirtual   #104 <Method JsonToken JsonParser.getCurrentToken()>
	//    4    7:astore          5
		if(obj != JsonToken.VALUE_NUMBER_INT && obj != JsonToken.VALUE_NUMBER_FLOAT) goto _L2; else goto _L1
	//    5    9:aload           5
	//    6   11:getstatic       #208 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//    7   14:if_acmpeq       25
	//    8   17:aload           5
	//    9   19:getstatic       #306 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//   10   22:if_acmpne       32
_L1:
		float f = jsonparser.getFloatValue();
	//   11   25:aload_1         
	//   12   26:invokevirtual   #389 <Method float JsonParser.getFloatValue()>
	//   13   29:fstore_3        
_L13:
		return f;
	//   14   30:fload_3         
	//   15   31:freturn         
_L2:
		if(obj != JsonToken.VALUE_STRING) goto _L4; else goto _L3
	//   16   32:aload           5
	//   17   34:getstatic       #133 <Field JsonToken JsonToken.VALUE_STRING>
	//   18   37:if_acmpne       166
_L3:
		jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   19   40:aload_1         
	//   20   41:invokevirtual   #140 <Method String JsonParser.getText()>
	//   21   44:invokevirtual   #143 <Method String String.trim()>
	//   22   47:astore_1        
		f = f1;
	//   23   48:fload           4
	//   24   50:fstore_3        
		if(((String) (jsonparser)).length() == 0)
			continue; /* Loop/switch isn't completed */
	//   25   51:aload_1         
	//   26   52:invokevirtual   #171 <Method int String.length()>
	//   27   55:ifeq            30
		f = f1;
	//   28   58:fload           4
	//   29   60:fstore_3        
		if(_hasTextualNull(((String) (jsonparser))))
			continue; /* Loop/switch isn't completed */
	//   30   61:aload_0         
	//   31   62:aload_1         
	//   32   63:invokevirtual   #248 <Method boolean _hasTextualNull(String)>
	//   33   66:ifne            30
		((String) (jsonparser)).charAt(0);
	//   34   69:aload_1         
	//   35   70:iconst_0        
	//   36   71:invokevirtual   #175 <Method char String.charAt(int)>
		JVM INSTR lookupswitch 3: default 108
	//	               45: 139
	//	               73: 115
	//	               78: 127;
	//   37   74:lookupswitch    3: default 108
	//	               45: 139
	//	               73: 115
	//	               78: 127
		   goto _L5 _L6 _L7 _L8
_L5:
		try
		{
			f = Float.parseFloat(((String) (jsonparser)));
	//   38  108:aload_1         
	//   39  109:invokestatic    #398 <Method float Float.parseFloat(String)>
	//   40  112:fstore_3        
		}
	//*  41  113:fload_3         
	//*  42  114:freturn         
	//*  43  115:aload_0         
	//*  44  116:aload_1         
	//*  45  117:invokevirtual   #361 <Method boolean _isPosInf(String)>
	//*  46  120:ifeq            108
	//*  47  123:ldc2            #399 <Float (1.0F / 0.0F)>
	//*  48  126:freturn         
	//*  49  127:aload_0         
	//*  50  128:aload_1         
	//*  51  129:invokevirtual   #365 <Method boolean _isNaN(String)>
	//*  52  132:ifeq            108
	//*  53  135:ldc2            #400 <Float (0.0F / 0.0F)>
	//*  54  138:freturn         
	//*  55  139:aload_0         
	//*  56  140:aload_1         
	//*  57  141:invokevirtual   #369 <Method boolean _isNegInf(String)>
	//*  58  144:ifeq            108
	//*  59  147:ldc2            #401 <Float (-1.0F / 0.0F)>
	//*  60  150:freturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  61  151:astore          5
		{
			throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, "not a valid float value");
	//   62  153:aload_2         
	//   63  154:aload_1         
	//   64  155:aload_0         
	//   65  156:getfield        #40  <Field Class _valueClass>
	//   66  159:ldc2            #409 <String "not a valid float value">
	//   67  162:invokevirtual   #254 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   68  165:athrow          
		}
		return f;
_L7:
		if(!_isPosInf(((String) (jsonparser)))) goto _L5; else goto _L9
_L9:
		return (1.0F / 0.0F);
_L8:
		if(!_isNaN(((String) (jsonparser)))) goto _L5; else goto _L10
_L10:
		return (0.0F / 0.0F);
_L6:
		if(!_isNegInf(((String) (jsonparser)))) goto _L5; else goto _L11
_L11:
		return (-1.0F / 0.0F);
_L4:
		f = f1;
	//   69  166:fload           4
	//   70  168:fstore_3        
		if(obj != JsonToken.VALUE_NULL)
	//*  71  169:aload           5
	//*  72  171:getstatic       #231 <Field JsonToken JsonToken.VALUE_NULL>
	//*  73  174:if_acmpeq       30
			if(obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  74  177:aload           5
	//*  75  179:getstatic       #110 <Field JsonToken JsonToken.START_ARRAY>
	//*  76  182:if_acmpne       229
	//*  77  185:aload_2         
	//*  78  186:getstatic       #257 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  79  189:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  80  192:ifeq            229
			{
				jsonparser.nextToken();
	//   81  195:aload_1         
	//   82  196:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//   83  199:pop             
				f = _parseFloatPrimitive(jsonparser, deserializationcontext);
	//   84  200:aload_0         
	//   85  201:aload_1         
	//   86  202:aload_2         
	//   87  203:invokevirtual   #411 <Method float _parseFloatPrimitive(JsonParser, DeserializationContext)>
	//   88  206:fstore_3        
				if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//*  89  207:aload_1         
	//*  90  208:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//*  91  211:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//*  92  214:if_acmpeq       30
					throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'float' value but there was more than a single value in the array");
	//   93  217:aload_2         
	//   94  218:aload_1         
	//   95  219:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//   96  222:ldc2            #413 <String "Attempted to unwrap single value array for single 'float' value but there was more than a single value in the array">
	//   97  225:invokevirtual   #265 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//   98  228:athrow          
			} else
			{
				throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
	//   99  229:aload_2         
	//  100  230:aload_0         
	//  101  231:getfield        #40  <Field Class _valueClass>
	//  102  234:aload           5
	//  103  236:invokevirtual   #130 <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//  104  239:athrow          
			}
		if(true) goto _L13; else goto _L12
_L12:
	}

	protected final int _parseIntPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(!jsonparser.hasToken(JsonToken.VALUE_NUMBER_INT)) goto _L2; else goto _L1
	//    2    3:aload_1         
	//    3    4:getstatic       #208 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//    4    7:invokevirtual   #419 <Method boolean JsonParser.hasToken(JsonToken)>
	//    5   10:ifeq            20
_L1:
		int i = jsonparser.getIntValue();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #221 <Method int JsonParser.getIntValue()>
	//    8   17:istore_3        
_L4:
		return i;
	//    9   18:iload_3         
	//   10   19:ireturn         
_L2:
		int j;
		long l;
		Object obj;
		obj = ((Object) (jsonparser.getCurrentToken()));
	//   11   20:aload_1         
	//   12   21:invokevirtual   #104 <Method JsonToken JsonParser.getCurrentToken()>
	//   13   24:astore          8
		if(obj != JsonToken.VALUE_STRING)
			break MISSING_BLOCK_LABEL_184;
	//   14   26:aload           8
	//   15   28:getstatic       #133 <Field JsonToken JsonToken.VALUE_STRING>
	//   16   31:if_acmpne       184
		jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   17   34:aload_1         
	//   18   35:invokevirtual   #140 <Method String JsonParser.getText()>
	//   19   38:invokevirtual   #143 <Method String String.trim()>
	//   20   41:astore_1        
		i = ((int) (flag));
	//   21   42:iload           4
	//   22   44:istore_3        
		if(_hasTextualNull(((String) (jsonparser))))
			continue; /* Loop/switch isn't completed */
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:invokevirtual   #248 <Method boolean _hasTextualNull(String)>
	//   26   50:ifne            18
		try
		{
			j = ((String) (jsonparser)).length();
	//   27   53:aload_1         
	//   28   54:invokevirtual   #171 <Method int String.length()>
	//   29   57:istore          5
		}
	//*  30   59:iload           5
	//*  31   61:bipush          9
	//*  32   63:icmple          169
	//*  33   66:aload_1         
	//*  34   67:invokestatic    #423 <Method long Long.parseLong(String)>
	//*  35   70:lstore          6
	//*  36   72:lload           6
	//*  37   74:ldc2w           #424 <Long 0x80000000L>
	//*  38   77:lcmp            
	//*  39   78:iflt            90
	//*  40   81:lload           6
	//*  41   83:ldc2w           #426 <Long 0x7fffffffL>
	//*  42   86:lcmp            
	//*  43   87:ifle            165
	//*  44   90:aload_2         
	//*  45   91:aload_1         
	//*  46   92:aload_0         
	//*  47   93:getfield        #40  <Field Class _valueClass>
	//*  48   96:new             #330 <Class StringBuilder>
	//*  49   99:dup             
	//*  50  100:invokespecial   #331 <Method void StringBuilder()>
	//*  51  103:ldc2            #429 <String "Overflow: numeric value (">
	//*  52  106:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//*  53  109:aload_1         
	//*  54  110:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//*  55  113:ldc2            #431 <String ") out of range of int (">
	//*  56  116:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//*  57  119:ldc2            #432 <Int 0x80000000>
	//*  58  122:invokevirtual   #435 <Method StringBuilder StringBuilder.append(int)>
	//*  59  125:ldc2            #437 <String " - ">
	//*  60  128:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//*  61  131:ldc2            #438 <Int 0x7fffffff>
	//*  62  134:invokevirtual   #435 <Method StringBuilder StringBuilder.append(int)>
	//*  63  137:ldc2            #342 <String ")">
	//*  64  140:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//*  65  143:invokevirtual   #345 <Method String StringBuilder.toString()>
	//*  66  146:invokevirtual   #254 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//*  67  149:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  68  150:astore          8
		{
			throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, "not a valid int value");
	//   69  152:aload_2         
	//   70  153:aload_1         
	//   71  154:aload_0         
	//   72  155:getfield        #40  <Field Class _valueClass>
	//   73  158:ldc2            #440 <String "not a valid int value">
	//   74  161:invokevirtual   #254 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   75  164:athrow          
		}
		if(j <= 9)
			break MISSING_BLOCK_LABEL_169;
		l = Long.parseLong(((String) (jsonparser)));
		if(l >= 0x80000000L && l <= 0x7fffffffL)
			break MISSING_BLOCK_LABEL_165;
		throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, (new StringBuilder()).append("Overflow: numeric value (").append(((String) (jsonparser))).append(") out of range of int (").append(0x80000000).append(" - ").append(0x7fffffff).append(")").toString());
		return (int)l;
	//   76  165:lload           6
	//   77  167:l2i             
	//   78  168:ireturn         
		i = ((int) (flag));
	//   79  169:iload           4
	//   80  171:istore_3        
		if(j == 0)
			continue; /* Loop/switch isn't completed */
	//   81  172:iload           5
	//   82  174:ifeq            18
		i = NumberInput.parseInt(((String) (jsonparser)));
	//   83  177:aload_1         
	//   84  178:invokestatic    #299 <Method int NumberInput.parseInt(String)>
	//   85  181:istore_3        
		return i;
	//   86  182:iload_3         
	//   87  183:ireturn         
		if(obj == JsonToken.VALUE_NUMBER_FLOAT)
	//*  88  184:aload           8
	//*  89  186:getstatic       #306 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*  90  189:if_acmpne       216
		{
			if(!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT))
	//*  91  192:aload_2         
	//*  92  193:getstatic       #309 <Field DeserializationFeature DeserializationFeature.ACCEPT_FLOAT_AS_INT>
	//*  93  196:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  94  199:ifne            211
				_failDoubleToIntCoercion(jsonparser, deserializationcontext, "int");
	//   95  202:aload_0         
	//   96  203:aload_1         
	//   97  204:aload_2         
	//   98  205:ldc2            #442 <String "int">
	//   99  208:invokevirtual   #313 <Method void _failDoubleToIntCoercion(JsonParser, DeserializationContext, String)>
			return jsonparser.getValueAsInt();
	//  100  211:aload_1         
	//  101  212:invokevirtual   #445 <Method int JsonParser.getValueAsInt()>
	//  102  215:ireturn         
		}
		i = ((int) (flag));
	//  103  216:iload           4
	//  104  218:istore_3        
		if(obj != JsonToken.VALUE_NULL)
	//* 105  219:aload           8
	//* 106  221:getstatic       #231 <Field JsonToken JsonToken.VALUE_NULL>
	//* 107  224:if_acmpeq       18
			if(obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//* 108  227:aload           8
	//* 109  229:getstatic       #110 <Field JsonToken JsonToken.START_ARRAY>
	//* 110  232:if_acmpne       279
	//* 111  235:aload_2         
	//* 112  236:getstatic       #257 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//* 113  239:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//* 114  242:ifeq            279
			{
				jsonparser.nextToken();
	//  115  245:aload_1         
	//  116  246:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//  117  249:pop             
				i = _parseIntPrimitive(jsonparser, deserializationcontext);
	//  118  250:aload_0         
	//  119  251:aload_1         
	//  120  252:aload_2         
	//  121  253:invokevirtual   #447 <Method int _parseIntPrimitive(JsonParser, DeserializationContext)>
	//  122  256:istore_3        
				if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//* 123  257:aload_1         
	//* 124  258:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//* 125  261:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//* 126  264:if_acmpeq       18
					throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'int' value but there was more than a single value in the array");
	//  127  267:aload_2         
	//  128  268:aload_1         
	//  129  269:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//  130  272:ldc2            #449 <String "Attempted to unwrap single value array for single 'int' value but there was more than a single value in the array">
	//  131  275:invokevirtual   #265 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//  132  278:athrow          
			} else
			{
				throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
	//  133  279:aload_2         
	//  134  280:aload_0         
	//  135  281:getfield        #40  <Field Class _valueClass>
	//  136  284:aload           8
	//  137  286:invokevirtual   #130 <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//  138  289:athrow          
			}
		if(true) goto _L4; else goto _L3
_L3:
	}

	protected final Integer _parseInteger(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		jsonparser.getCurrentTokenId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #454 <Method int JsonParser.getCurrentTokenId()>
		JVM INSTR tableswitch 3 11: default 56
	//	               3 280
	//	               4 56
	//	               5 56
	//	               6 104
	//	               7 69
	//	               8 77
	//	               9 56
	//	               10 56
	//	               11 271;
	//    2    4:tableswitch     3 11: default 56
	//	               3 280
	//	               4 56
	//	               5 56
	//	               6 104
	//	               7 69
	//	               8 77
	//	               9 56
	//	               10 56
	//	               11 271
		   goto _L1 _L2 _L1 _L1 _L3 _L4 _L5 _L1 _L1 _L6
_L1:
		throw deserializationcontext.mappingException(_valueClass, jsonparser.getCurrentToken());
	//    3   56:aload_2         
	//    4   57:aload_0         
	//    5   58:getfield        #40  <Field Class _valueClass>
	//    6   61:aload_1         
	//    7   62:invokevirtual   #104 <Method JsonToken JsonParser.getCurrentToken()>
	//    8   65:invokevirtual   #130 <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//    9   68:athrow          
_L4:
		return Integer.valueOf(jsonparser.getIntValue());
	//   10   69:aload_1         
	//   11   70:invokevirtual   #221 <Method int JsonParser.getIntValue()>
	//   12   73:invokestatic    #459 <Method Integer Integer.valueOf(int)>
	//   13   76:areturn         
_L5:
		if(!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT))
	//*  14   77:aload_2         
	//*  15   78:getstatic       #309 <Field DeserializationFeature DeserializationFeature.ACCEPT_FLOAT_AS_INT>
	//*  16   81:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  17   84:ifne            96
			_failDoubleToIntCoercion(jsonparser, deserializationcontext, "Integer");
	//   18   87:aload_0         
	//   19   88:aload_1         
	//   20   89:aload_2         
	//   21   90:ldc2            #461 <String "Integer">
	//   22   93:invokevirtual   #313 <Method void _failDoubleToIntCoercion(JsonParser, DeserializationContext, String)>
		return Integer.valueOf(jsonparser.getValueAsInt());
	//   23   96:aload_1         
	//   24   97:invokevirtual   #445 <Method int JsonParser.getValueAsInt()>
	//   25  100:invokestatic    #459 <Method Integer Integer.valueOf(int)>
	//   26  103:areturn         
_L3:
		int i;
		long l;
		jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   27  104:aload_1         
	//   28  105:invokevirtual   #140 <Method String JsonParser.getText()>
	//   29  108:invokevirtual   #143 <Method String String.trim()>
	//   30  111:astore_1        
		try
		{
			i = ((String) (jsonparser)).length();
	//   31  112:aload_1         
	//   32  113:invokevirtual   #171 <Method int String.length()>
	//   33  116:istore_3        
			if(_hasTextualNull(((String) (jsonparser))))
	//*  34  117:aload_0         
	//*  35  118:aload_1         
	//*  36  119:invokevirtual   #248 <Method boolean _hasTextualNull(String)>
	//*  37  122:ifeq            134
				return (Integer)getNullValue(deserializationcontext);
	//   38  125:aload_0         
	//   39  126:aload_2         
	//   40  127:invokevirtual   #235 <Method Object getNullValue(DeserializationContext)>
	//   41  130:checkcast       #456 <Class Integer>
	//   42  133:areturn         
		}
	//*  43  134:iload_3         
	//*  44  135:bipush          9
	//*  45  137:icmple          248
	//*  46  140:aload_1         
	//*  47  141:invokestatic    #423 <Method long Long.parseLong(String)>
	//*  48  144:lstore          4
	//*  49  146:lload           4
	//*  50  148:ldc2w           #424 <Long 0x80000000L>
	//*  51  151:lcmp            
	//*  52  152:iflt            164
	//*  53  155:lload           4
	//*  54  157:ldc2w           #426 <Long 0x7fffffffL>
	//*  55  160:lcmp            
	//*  56  161:ifle            239
	//*  57  164:aload_2         
	//*  58  165:aload_1         
	//*  59  166:aload_0         
	//*  60  167:getfield        #40  <Field Class _valueClass>
	//*  61  170:new             #330 <Class StringBuilder>
	//*  62  173:dup             
	//*  63  174:invokespecial   #331 <Method void StringBuilder()>
	//*  64  177:ldc2            #429 <String "Overflow: numeric value (">
	//*  65  180:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//*  66  183:aload_1         
	//*  67  184:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//*  68  187:ldc2            #463 <String ") out of range of Integer (">
	//*  69  190:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//*  70  193:ldc2            #432 <Int 0x80000000>
	//*  71  196:invokevirtual   #435 <Method StringBuilder StringBuilder.append(int)>
	//*  72  199:ldc2            #437 <String " - ">
	//*  73  202:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//*  74  205:ldc2            #438 <Int 0x7fffffff>
	//*  75  208:invokevirtual   #435 <Method StringBuilder StringBuilder.append(int)>
	//*  76  211:ldc2            #342 <String ")">
	//*  77  214:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//*  78  217:invokevirtual   #345 <Method String StringBuilder.toString()>
	//*  79  220:invokevirtual   #254 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//*  80  223:athrow          
		catch(IllegalArgumentException illegalargumentexception)
	//*  81  224:astore          6
		{
			throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, "not a valid Integer value");
	//   82  226:aload_2         
	//   83  227:aload_1         
	//   84  228:aload_0         
	//   85  229:getfield        #40  <Field Class _valueClass>
	//   86  232:ldc2            #465 <String "not a valid Integer value">
	//   87  235:invokevirtual   #254 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   88  238:athrow          
		}
		if(i <= 9) goto _L8; else goto _L7
_L7:
		l = Long.parseLong(((String) (jsonparser)));
		if(l >= 0x80000000L && l <= 0x7fffffffL) goto _L10; else goto _L9
_L9:
		throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, (new StringBuilder()).append("Overflow: numeric value (").append(((String) (jsonparser))).append(") out of range of Integer (").append(0x80000000).append(" - ").append(0x7fffffff).append(")").toString());
_L10:
		i = (int)l;
	//   89  239:lload           4
	//   90  241:l2i             
	//   91  242:istore_3        
		return Integer.valueOf(i);
	//   92  243:iload_3         
	//   93  244:invokestatic    #459 <Method Integer Integer.valueOf(int)>
	//   94  247:areturn         
_L8:
		if(i != 0) goto _L12; else goto _L11
	//   95  248:iload_3         
	//   96  249:ifne            261
_L11:
		return (Integer)getEmptyValue(deserializationcontext);
	//   97  252:aload_0         
	//   98  253:aload_2         
	//   99  254:invokevirtual   #246 <Method Object getEmptyValue(DeserializationContext)>
	//  100  257:checkcast       #456 <Class Integer>
	//  101  260:areturn         
_L12:
		i = NumberInput.parseInt(((String) (jsonparser)));
	//  102  261:aload_1         
	//  103  262:invokestatic    #299 <Method int NumberInput.parseInt(String)>
	//  104  265:istore_3        
		return Integer.valueOf(i);
	//  105  266:iload_3         
	//  106  267:invokestatic    #459 <Method Integer Integer.valueOf(int)>
	//  107  270:areturn         
_L6:
		return (Integer)getNullValue(deserializationcontext);
	//  108  271:aload_0         
	//  109  272:aload_2         
	//  110  273:invokevirtual   #235 <Method Object getNullValue(DeserializationContext)>
	//  111  276:checkcast       #456 <Class Integer>
	//  112  279:areturn         
_L2:
		if(deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//* 113  280:aload_2         
	//* 114  281:getstatic       #257 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//* 115  284:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//* 116  287:ifeq            56
		{
			jsonparser.nextToken();
	//  117  290:aload_1         
	//  118  291:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//  119  294:pop             
			Integer integer = _parseInteger(jsonparser, deserializationcontext);
	//  120  295:aload_0         
	//  121  296:aload_1         
	//  122  297:aload_2         
	//  123  298:invokevirtual   #467 <Method Integer _parseInteger(JsonParser, DeserializationContext)>
	//  124  301:astore          6
			if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//* 125  303:aload_1         
	//* 126  304:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//* 127  307:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//* 128  310:if_acmpeq       325
				throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'Integer' value but there was more than a single value in the array");
	//  129  313:aload_2         
	//  130  314:aload_1         
	//  131  315:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//  132  318:ldc2            #469 <String "Attempted to unwrap single value array for single 'Integer' value but there was more than a single value in the array">
	//  133  321:invokevirtual   #265 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//  134  324:athrow          
			else
				return integer;
	//  135  325:aload           6
	//  136  327:areturn         
		}
		if(true) goto _L1; else goto _L13
_L13:
	}

	protected final Long _parseLong(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		jsonparser.getCurrentTokenId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #454 <Method int JsonParser.getCurrentTokenId()>
		JVM INSTR tableswitch 3 11: default 56
	//	               3 179
	//	               4 56
	//	               5 56
	//	               6 104
	//	               7 69
	//	               8 77
	//	               9 56
	//	               10 56
	//	               11 170;
	//    2    4:tableswitch     3 11: default 56
	//	               3 179
	//	               4 56
	//	               5 56
	//	               6 104
	//	               7 69
	//	               8 77
	//	               9 56
	//	               10 56
	//	               11 170
		   goto _L1 _L2 _L1 _L1 _L3 _L4 _L5 _L1 _L1 _L6
_L1:
		throw deserializationcontext.mappingException(_valueClass, jsonparser.getCurrentToken());
	//    3   56:aload_2         
	//    4   57:aload_0         
	//    5   58:getfield        #40  <Field Class _valueClass>
	//    6   61:aload_1         
	//    7   62:invokevirtual   #104 <Method JsonToken JsonParser.getCurrentToken()>
	//    8   65:invokevirtual   #130 <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//    9   68:athrow          
_L4:
		return Long.valueOf(jsonparser.getLongValue());
	//   10   69:aload_1         
	//   11   70:invokevirtual   #93  <Method long JsonParser.getLongValue()>
	//   12   73:invokestatic    #99  <Method Long Long.valueOf(long)>
	//   13   76:areturn         
_L5:
		if(!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT))
	//*  14   77:aload_2         
	//*  15   78:getstatic       #309 <Field DeserializationFeature DeserializationFeature.ACCEPT_FLOAT_AS_INT>
	//*  16   81:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  17   84:ifne            96
			_failDoubleToIntCoercion(jsonparser, deserializationcontext, "Long");
	//   18   87:aload_0         
	//   19   88:aload_1         
	//   20   89:aload_2         
	//   21   90:ldc2            #473 <String "Long">
	//   22   93:invokevirtual   #313 <Method void _failDoubleToIntCoercion(JsonParser, DeserializationContext, String)>
		return Long.valueOf(jsonparser.getValueAsLong());
	//   23   96:aload_1         
	//   24   97:invokevirtual   #476 <Method long JsonParser.getValueAsLong()>
	//   25  100:invokestatic    #99  <Method Long Long.valueOf(long)>
	//   26  103:areturn         
_L3:
		jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   27  104:aload_1         
	//   28  105:invokevirtual   #140 <Method String JsonParser.getText()>
	//   29  108:invokevirtual   #143 <Method String String.trim()>
	//   30  111:astore_1        
		if(((String) (jsonparser)).length() == 0)
	//*  31  112:aload_1         
	//*  32  113:invokevirtual   #171 <Method int String.length()>
	//*  33  116:ifne            128
			return (Long)getEmptyValue(deserializationcontext);
	//   34  119:aload_0         
	//   35  120:aload_2         
	//   36  121:invokevirtual   #246 <Method Object getEmptyValue(DeserializationContext)>
	//   37  124:checkcast       #95  <Class Long>
	//   38  127:areturn         
		if(_hasTextualNull(((String) (jsonparser))))
	//*  39  128:aload_0         
	//*  40  129:aload_1         
	//*  41  130:invokevirtual   #248 <Method boolean _hasTextualNull(String)>
	//*  42  133:ifeq            145
			return (Long)getNullValue(deserializationcontext);
	//   43  136:aload_0         
	//   44  137:aload_2         
	//   45  138:invokevirtual   #235 <Method Object getNullValue(DeserializationContext)>
	//   46  141:checkcast       #95  <Class Long>
	//   47  144:areturn         
		long l;
		try
		{
			l = NumberInput.parseLong(((String) (jsonparser)));
	//   48  145:aload_1         
	//   49  146:invokestatic    #477 <Method long NumberInput.parseLong(String)>
	//   50  149:lstore_3        
		}
	//*  51  150:lload_3         
	//*  52  151:invokestatic    #99  <Method Long Long.valueOf(long)>
	//*  53  154:areturn         
		catch(IllegalArgumentException illegalargumentexception)
	//*  54  155:astore          5
		{
			throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, "not a valid Long value");
	//   55  157:aload_2         
	//   56  158:aload_1         
	//   57  159:aload_0         
	//   58  160:getfield        #40  <Field Class _valueClass>
	//   59  163:ldc2            #479 <String "not a valid Long value">
	//   60  166:invokevirtual   #254 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   61  169:athrow          
		}
		return Long.valueOf(l);
_L6:
		return (Long)getNullValue(deserializationcontext);
	//   62  170:aload_0         
	//   63  171:aload_2         
	//   64  172:invokevirtual   #235 <Method Object getNullValue(DeserializationContext)>
	//   65  175:checkcast       #95  <Class Long>
	//   66  178:areturn         
_L2:
		if(deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  67  179:aload_2         
	//*  68  180:getstatic       #257 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  69  183:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  70  186:ifeq            56
		{
			jsonparser.nextToken();
	//   71  189:aload_1         
	//   72  190:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//   73  193:pop             
			Long long1 = _parseLong(jsonparser, deserializationcontext);
	//   74  194:aload_0         
	//   75  195:aload_1         
	//   76  196:aload_2         
	//   77  197:invokevirtual   #481 <Method Long _parseLong(JsonParser, DeserializationContext)>
	//   78  200:astore          5
			if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//*  79  202:aload_1         
	//*  80  203:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//*  81  206:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//*  82  209:if_acmpeq       224
				throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'Long' value but there was more than a single value in the array");
	//   83  212:aload_2         
	//   84  213:aload_1         
	//   85  214:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//   86  217:ldc2            #483 <String "Attempted to unwrap single value array for single 'Long' value but there was more than a single value in the array">
	//   87  220:invokevirtual   #265 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//   88  223:athrow          
			else
				return long1;
	//   89  224:aload           5
	//   90  226:areturn         
		}
		if(true) goto _L1; else goto _L7
_L7:
	}

	protected final long _parseLongPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		long l;
		long l1;
		l1 = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore          5
		l = l1;
	//    2    3:lload           5
	//    3    5:lstore_3        
		jsonparser.getCurrentTokenId();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #454 <Method int JsonParser.getCurrentTokenId()>
		JVM INSTR tableswitch 3 11: default 60
	//	               3 155
	//	               4 60
	//	               5 60
	//	               6 104
	//	               7 73
	//	               8 80
	//	               9 60
	//	               10 60
	//	               11 78;
	//    6   10:tableswitch     3 11: default 60
	//	               3 155
	//	               4 60
	//	               5 60
	//	               6 104
	//	               7 73
	//	               8 80
	//	               9 60
	//	               10 60
	//	               11 78
		   goto _L1 _L2 _L1 _L1 _L3 _L4 _L5 _L1 _L1 _L6
_L6:
		break; /* Loop/switch isn't completed */
_L1:
		throw deserializationcontext.mappingException(_valueClass, jsonparser.getCurrentToken());
	//    7   60:aload_2         
	//    8   61:aload_0         
	//    9   62:getfield        #40  <Field Class _valueClass>
	//   10   65:aload_1         
	//   11   66:invokevirtual   #104 <Method JsonToken JsonParser.getCurrentToken()>
	//   12   69:invokevirtual   #130 <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//   13   72:athrow          
_L4:
		l = jsonparser.getLongValue();
	//   14   73:aload_1         
	//   15   74:invokevirtual   #93  <Method long JsonParser.getLongValue()>
	//   16   77:lstore_3        
_L8:
		return l;
	//   17   78:lload_3         
	//   18   79:lreturn         
_L5:
		if(!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT))
	//*  19   80:aload_2         
	//*  20   81:getstatic       #309 <Field DeserializationFeature DeserializationFeature.ACCEPT_FLOAT_AS_INT>
	//*  21   84:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  22   87:ifne            99
			_failDoubleToIntCoercion(jsonparser, deserializationcontext, "long");
	//   23   90:aload_0         
	//   24   91:aload_1         
	//   25   92:aload_2         
	//   26   93:ldc2            #487 <String "long">
	//   27   96:invokevirtual   #313 <Method void _failDoubleToIntCoercion(JsonParser, DeserializationContext, String)>
		return jsonparser.getValueAsLong();
	//   28   99:aload_1         
	//   29  100:invokevirtual   #476 <Method long JsonParser.getValueAsLong()>
	//   30  103:lreturn         
_L3:
		jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   31  104:aload_1         
	//   32  105:invokevirtual   #140 <Method String JsonParser.getText()>
	//   33  108:invokevirtual   #143 <Method String String.trim()>
	//   34  111:astore_1        
		l = l1;
	//   35  112:lload           5
	//   36  114:lstore_3        
		if(((String) (jsonparser)).length() != 0)
	//*  37  115:aload_1         
	//*  38  116:invokevirtual   #171 <Method int String.length()>
	//*  39  119:ifeq            78
		{
			l = l1;
	//   40  122:lload           5
	//   41  124:lstore_3        
			if(!_hasTextualNull(((String) (jsonparser))))
	//*  42  125:aload_0         
	//*  43  126:aload_1         
	//*  44  127:invokevirtual   #248 <Method boolean _hasTextualNull(String)>
	//*  45  130:ifne            78
			{
				try
				{
					l = NumberInput.parseLong(((String) (jsonparser)));
	//   46  133:aload_1         
	//   47  134:invokestatic    #477 <Method long NumberInput.parseLong(String)>
	//   48  137:lstore_3        
				}
	//*  49  138:lload_3         
	//*  50  139:lreturn         
				catch(IllegalArgumentException illegalargumentexception)
	//*  51  140:astore          7
				{
					throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, "not a valid long value");
	//   52  142:aload_2         
	//   53  143:aload_1         
	//   54  144:aload_0         
	//   55  145:getfield        #40  <Field Class _valueClass>
	//   56  148:ldc2            #489 <String "not a valid long value">
	//   57  151:invokevirtual   #254 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   58  154:athrow          
				}
				return l;
			}
		}
		continue; /* Loop/switch isn't completed */
_L2:
		if(!deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
			continue; /* Loop/switch isn't completed */
	//   59  155:aload_2         
	//   60  156:getstatic       #257 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//   61  159:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//   62  162:ifeq            60
		jsonparser.nextToken();
	//   63  165:aload_1         
	//   64  166:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//   65  169:pop             
		l = _parseLongPrimitive(jsonparser, deserializationcontext);
	//   66  170:aload_0         
	//   67  171:aload_1         
	//   68  172:aload_2         
	//   69  173:invokevirtual   #491 <Method long _parseLongPrimitive(JsonParser, DeserializationContext)>
	//   70  176:lstore_3        
		if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//*  71  177:aload_1         
	//*  72  178:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//*  73  181:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//*  74  184:if_acmpeq       78
			throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'long' value but there was more than a single value in the array");
	//   75  187:aload_2         
	//   76  188:aload_1         
	//   77  189:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//   78  192:ldc2            #493 <String "Attempted to unwrap single value array for single 'long' value but there was more than a single value in the array">
	//   79  195:invokevirtual   #265 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//   80  198:athrow          
		if(true) goto _L8; else goto _L7
_L7:
		if(true) goto _L1; else goto _L9
_L9:
	}

	protected Short _parseShort(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj = ((Object) (jsonparser.getCurrentToken()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #104 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          4
		if(obj == JsonToken.VALUE_NUMBER_INT)
	//*   3    6:aload           4
	//*   4    8:getstatic       #208 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5   11:if_acmpne       22
			return Short.valueOf(jsonparser.getShortValue());
	//    6   14:aload_1         
	//    7   15:invokevirtual   #499 <Method short JsonParser.getShortValue()>
	//    8   18:invokestatic    #504 <Method Short Short.valueOf(short)>
	//    9   21:areturn         
		if(obj == JsonToken.VALUE_STRING)
	//*  10   22:aload           4
	//*  11   24:getstatic       #133 <Field JsonToken JsonToken.VALUE_STRING>
	//*  12   27:if_acmpne       124
		{
			jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   13   30:aload_1         
	//   14   31:invokevirtual   #140 <Method String JsonParser.getText()>
	//   15   34:invokevirtual   #143 <Method String String.trim()>
	//   16   37:astore_1        
			int i;
			try
			{
				if(((String) (jsonparser)).length() == 0)
	//*  17   38:aload_1         
	//*  18   39:invokevirtual   #171 <Method int String.length()>
	//*  19   42:ifne            54
					return (Short)getEmptyValue(deserializationcontext);
	//   20   45:aload_0         
	//   21   46:aload_2         
	//   22   47:invokevirtual   #246 <Method Object getEmptyValue(DeserializationContext)>
	//   23   50:checkcast       #501 <Class Short>
	//   24   53:areturn         
				if(_hasTextualNull(((String) (jsonparser))))
	//*  25   54:aload_0         
	//*  26   55:aload_1         
	//*  27   56:invokevirtual   #248 <Method boolean _hasTextualNull(String)>
	//*  28   59:ifeq            71
					return (Short)getNullValue(deserializationcontext);
	//   29   62:aload_0         
	//   30   63:aload_2         
	//   31   64:invokevirtual   #235 <Method Object getNullValue(DeserializationContext)>
	//   32   67:checkcast       #501 <Class Short>
	//   33   70:areturn         
				i = NumberInput.parseInt(((String) (jsonparser)));
	//   34   71:aload_1         
	//   35   72:invokestatic    #299 <Method int NumberInput.parseInt(String)>
	//   36   75:istore_3        
			}
	//*  37   76:iload_3         
	//*  38   77:sipush          -32768
	//*  39   80:icmplt          90
	//*  40   83:iload_3         
	//*  41   84:sipush          32767
	//*  42   87:icmple          118
	//*  43   90:aload_2         
	//*  44   91:aload_1         
	//*  45   92:aload_0         
	//*  46   93:getfield        #40  <Field Class _valueClass>
	//*  47   96:ldc2            #506 <String "overflow, value can not be represented as 16-bit value">
	//*  48   99:invokevirtual   #254 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//*  49  102:athrow          
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  50  103:astore          4
			{
				throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, "not a valid Short value");
	//   51  105:aload_2         
	//   52  106:aload_1         
	//   53  107:aload_0         
	//   54  108:getfield        #40  <Field Class _valueClass>
	//   55  111:ldc2            #508 <String "not a valid Short value">
	//   56  114:invokevirtual   #254 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   57  117:athrow          
			}
			if(i < -32768 || i > 32767)
				throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, "overflow, value can not be represented as 16-bit value");
			else
				return Short.valueOf((short)i);
	//   58  118:iload_3         
	//   59  119:int2short       
	//   60  120:invokestatic    #504 <Method Short Short.valueOf(short)>
	//   61  123:areturn         
		}
		if(obj == JsonToken.VALUE_NUMBER_FLOAT)
	//*  62  124:aload           4
	//*  63  126:getstatic       #306 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*  64  129:if_acmpne       159
		{
			if(!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT))
	//*  65  132:aload_2         
	//*  66  133:getstatic       #309 <Field DeserializationFeature DeserializationFeature.ACCEPT_FLOAT_AS_INT>
	//*  67  136:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  68  139:ifne            151
				_failDoubleToIntCoercion(jsonparser, deserializationcontext, "Short");
	//   69  142:aload_0         
	//   70  143:aload_1         
	//   71  144:aload_2         
	//   72  145:ldc2            #510 <String "Short">
	//   73  148:invokevirtual   #313 <Method void _failDoubleToIntCoercion(JsonParser, DeserializationContext, String)>
			return Short.valueOf(jsonparser.getShortValue());
	//   74  151:aload_1         
	//   75  152:invokevirtual   #499 <Method short JsonParser.getShortValue()>
	//   76  155:invokestatic    #504 <Method Short Short.valueOf(short)>
	//   77  158:areturn         
		}
		if(obj == JsonToken.VALUE_NULL)
	//*  78  159:aload           4
	//*  79  161:getstatic       #231 <Field JsonToken JsonToken.VALUE_NULL>
	//*  80  164:if_acmpne       176
			return (Short)getNullValue(deserializationcontext);
	//   81  167:aload_0         
	//   82  168:aload_2         
	//   83  169:invokevirtual   #235 <Method Object getNullValue(DeserializationContext)>
	//   84  172:checkcast       #501 <Class Short>
	//   85  175:areturn         
		if(obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  86  176:aload           4
	//*  87  178:getstatic       #110 <Field JsonToken JsonToken.START_ARRAY>
	//*  88  181:if_acmpne       232
	//*  89  184:aload_2         
	//*  90  185:getstatic       #257 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  91  188:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  92  191:ifeq            232
		{
			jsonparser.nextToken();
	//   93  194:aload_1         
	//   94  195:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//   95  198:pop             
			obj = ((Object) (_parseShort(jsonparser, deserializationcontext)));
	//   96  199:aload_0         
	//   97  200:aload_1         
	//   98  201:aload_2         
	//   99  202:invokevirtual   #512 <Method Short _parseShort(JsonParser, DeserializationContext)>
	//  100  205:astore          4
			if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//* 101  207:aload_1         
	//* 102  208:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//* 103  211:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//* 104  214:if_acmpeq       229
				throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'Short' value but there was more than a single value in the array");
	//  105  217:aload_2         
	//  106  218:aload_1         
	//  107  219:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//  108  222:ldc2            #514 <String "Attempted to unwrap single value array for single 'Short' value but there was more than a single value in the array">
	//  109  225:invokevirtual   #265 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//  110  228:athrow          
			else
				return ((Short) (obj));
	//  111  229:aload           4
	//  112  231:areturn         
		} else
		{
			throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
	//  113  232:aload_2         
	//  114  233:aload_0         
	//  115  234:getfield        #40  <Field Class _valueClass>
	//  116  237:aload           4
	//  117  239:invokevirtual   #130 <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//  118  242:athrow          
		}
	}

	protected final short _parseShortPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		int i = _parseIntPrimitive(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #447 <Method int _parseIntPrimitive(JsonParser, DeserializationContext)>
	//    4    6:istore_3        
		if(i < -32768 || i > 32767)
	//*   5    7:iload_3         
	//*   6    8:sipush          -32768
	//*   7   11:icmplt          21
	//*   8   14:iload_3         
	//*   9   15:sipush          32767
	//*  10   18:icmple          37
			throw deserializationcontext.weirdStringException(String.valueOf(i), _valueClass, "overflow, value can not be represented as 16-bit value");
	//   11   21:aload_2         
	//   12   22:iload_3         
	//   13   23:invokestatic    #519 <Method String String.valueOf(int)>
	//   14   26:aload_0         
	//   15   27:getfield        #40  <Field Class _valueClass>
	//   16   30:ldc2            #506 <String "overflow, value can not be represented as 16-bit value">
	//   17   33:invokevirtual   #254 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   18   36:athrow          
		else
			return (short)i;
	//   19   37:iload_3         
	//   20   38:int2short       
	//   21   39:ireturn         
	}

	protected final String _parseString(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj = ((Object) (jsonparser.getCurrentToken()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #104 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore_3        
		if(obj == JsonToken.VALUE_STRING)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #133 <Field JsonToken JsonToken.VALUE_STRING>
	//*   5    9:if_acmpne       19
			obj = ((Object) (jsonparser.getText()));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #140 <Method String JsonParser.getText()>
	//    8   16:astore_3        
		else
	//*   9   17:aload_3         
	//*  10   18:areturn         
		if(obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  11   19:aload_3         
	//*  12   20:getstatic       #110 <Field JsonToken JsonToken.START_ARRAY>
	//*  13   23:if_acmpne       70
	//*  14   26:aload_2         
	//*  15   27:getstatic       #257 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  16   30:invokevirtual   #117 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  17   33:ifeq            70
		{
			jsonparser.nextToken();
	//   18   36:aload_1         
	//   19   37:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//   20   40:pop             
			obj = ((Object) (_parseString(jsonparser, deserializationcontext)));
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:invokevirtual   #523 <Method String _parseString(JsonParser, DeserializationContext)>
	//   25   47:astore_3        
			if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//*  26   48:aload_1         
	//*  27   49:invokevirtual   #120 <Method JsonToken JsonParser.nextToken()>
	//*  28   52:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//*  29   55:if_acmpeq       17
				throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'String' value but there was more than a single value in the array");
	//   30   58:aload_2         
	//   31   59:aload_1         
	//   32   60:getstatic       #123 <Field JsonToken JsonToken.END_ARRAY>
	//   33   63:ldc2            #525 <String "Attempted to unwrap single value array for single 'String' value but there was more than a single value in the array">
	//   34   66:invokevirtual   #265 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//   35   69:athrow          
		} else
		{
			String s = jsonparser.getValueAsString();
	//   36   70:aload_1         
	//   37   71:invokevirtual   #160 <Method String JsonParser.getValueAsString()>
	//   38   74:astore_3        
			if(s != null)
	//*  39   75:aload_3         
	//*  40   76:ifnull          81
				return s;
	//   41   79:aload_3         
	//   42   80:areturn         
			else
				throw deserializationcontext.mappingException(java/lang/String, jsonparser.getCurrentToken());
	//   43   81:aload_2         
	//   44   82:ldc1            #59  <Class String>
	//   45   84:aload_1         
	//   46   85:invokevirtual   #104 <Method JsonToken JsonParser.getCurrentToken()>
	//   47   88:invokevirtual   #130 <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//   48   91:athrow          
		}
		return ((String) (obj));
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #532 <Method Object TypeDeserializer.deserializeTypedFromAny(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected JsonDeserializer findConvertingContentDeserializer(DeserializationContext deserializationcontext, BeanProperty beanproperty, JsonDeserializer jsondeserializer)
		throws JsonMappingException
	{
		Object obj = ((Object) (deserializationcontext.getAnnotationIntrospector()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #540 <Method AnnotationIntrospector DeserializationContext.getAnnotationIntrospector()>
	//    2    4:astore          4
		if(obj != null && beanproperty != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          99
	//*   5   11:aload_2         
	//*   6   12:ifnull          99
		{
			com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedmember = beanproperty.getMember();
	//    7   15:aload_2         
	//    8   16:invokeinterface #546 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//    9   21:astore          5
			if(annotatedmember != null)
	//*  10   23:aload           5
	//*  11   25:ifnull          99
			{
				obj = ((AnnotationIntrospector) (obj)).findDeserializationContentConverter(annotatedmember);
	//   12   28:aload           4
	//   13   30:aload           5
	//   14   32:invokevirtual   #552 <Method Object AnnotationIntrospector.findDeserializationContentConverter(com.fasterxml.jackson.databind.introspect.AnnotatedMember)>
	//   15   35:astore          4
				if(obj != null)
	//*  16   37:aload           4
	//*  17   39:ifnull          99
				{
					Converter converter = deserializationcontext.converterInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (beanproperty.getMember())), obj);
	//   18   42:aload_1         
	//   19   43:aload_2         
	//   20   44:invokeinterface #546 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//   21   49:aload           4
	//   22   51:invokevirtual   #556 <Method Converter DeserializationContext.converterInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//   23   54:astore          5
					JavaType javatype = converter.getInputType(deserializationcontext.getTypeFactory());
	//   24   56:aload           5
	//   25   58:aload_1         
	//   26   59:invokevirtual   #560 <Method com.fasterxml.jackson.databind.type.TypeFactory DeserializationContext.getTypeFactory()>
	//   27   62:invokeinterface #566 <Method JavaType Converter.getInputType(com.fasterxml.jackson.databind.type.TypeFactory)>
	//   28   67:astore          6
					obj = ((Object) (jsondeserializer));
	//   29   69:aload_3         
	//   30   70:astore          4
					if(jsondeserializer == null)
	//*  31   72:aload_3         
	//*  32   73:ifnonnull       85
						obj = ((Object) (deserializationcontext.findContextualValueDeserializer(javatype, beanproperty)));
	//   33   76:aload_1         
	//   34   77:aload           6
	//   35   79:aload_2         
	//   36   80:invokevirtual   #570 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   37   83:astore          4
					return ((JsonDeserializer) (new StdDelegatingDeserializer(converter, javatype, ((JsonDeserializer) (obj)))));
	//   38   85:new             #572 <Class StdDelegatingDeserializer>
	//   39   88:dup             
	//   40   89:aload           5
	//   41   91:aload           6
	//   42   93:aload           4
	//   43   95:invokespecial   #575 <Method void StdDelegatingDeserializer(Converter, JavaType, JsonDeserializer)>
	//   44   98:areturn         
				}
			}
		}
		return jsondeserializer;
	//   45   99:aload_3         
	//   46  100:areturn         
	}

	protected JsonDeserializer findDeserializer(DeserializationContext deserializationcontext, JavaType javatype, BeanProperty beanproperty)
		throws JsonMappingException
	{
		return deserializationcontext.findContextualValueDeserializer(javatype, beanproperty);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #570 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//    4    6:areturn         
	}

	protected Boolean findFormatFeature(DeserializationContext deserializationcontext, BeanProperty beanproperty, Class class1, com.fasterxml.jackson.annotation.JsonFormat.Feature feature)
	{
		deserializationcontext = ((DeserializationContext) (findFormatOverrides(deserializationcontext, beanproperty, class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #585 <Method com.fasterxml.jackson.annotation.JsonFormat$Value findFormatOverrides(DeserializationContext, BeanProperty, Class)>
	//    5    7:astore_1        
		if(deserializationcontext != null)
	//*   6    8:aload_1         
	//*   7    9:ifnull          19
			return ((com.fasterxml.jackson.annotation.JsonFormat.Value) (deserializationcontext)).getFeature(feature);
	//    8   12:aload_1         
	//    9   13:aload           4
	//   10   15:invokevirtual   #591 <Method Boolean com.fasterxml.jackson.annotation.JsonFormat$Value.getFeature(com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//   11   18:areturn         
		else
			return null;
	//   12   19:aconst_null     
	//   13   20:areturn         
	}

	protected com.fasterxml.jackson.annotation.JsonFormat.Value findFormatOverrides(DeserializationContext deserializationcontext, BeanProperty beanproperty, Class class1)
	{
		if(beanproperty != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          16
			return beanproperty.findPropertyFormat(((com.fasterxml.jackson.databind.cfg.MapperConfig) (deserializationcontext.getConfig())), class1);
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #596 <Method com.fasterxml.jackson.databind.DeserializationConfig DeserializationContext.getConfig()>
	//    5    9:aload_3         
	//    6   10:invokeinterface #600 <Method com.fasterxml.jackson.annotation.JsonFormat$Value BeanProperty.findPropertyFormat(com.fasterxml.jackson.databind.cfg.MapperConfig, Class)>
	//    7   15:areturn         
		else
			return deserializationcontext.getDefaultPropertyFormat(class1);
	//    8   16:aload_1         
	//    9   17:aload_3         
	//   10   18:invokevirtual   #604 <Method com.fasterxml.jackson.annotation.JsonFormat$Value DeserializationContext.getDefaultPropertyFormat(Class)>
	//   11   21:areturn         
	}

	public final Class getValueClass()
	{
		return _valueClass;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Class _valueClass>
	//    2    4:areturn         
	}

	public JavaType getValueType()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected void handleUnknownProperty(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, String s)
		throws IOException
	{
		Object obj1 = obj;
	//    0    0:aload_3         
	//    1    1:astore          5
		if(obj == null)
	//*   2    3:aload_3         
	//*   3    4:ifnonnull       13
			obj1 = ((Object) (handledType()));
	//    4    7:aload_0         
	//    5    8:invokevirtual   #126 <Method Class handledType()>
	//    6   11:astore          5
		if(deserializationcontext.handleUnknownProperty(jsonparser, ((JsonDeserializer) (this)), obj1, s))
	//*   7   13:aload_2         
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:aload           5
	//*  11   18:aload           4
	//*  12   20:invokevirtual   #616 <Method boolean DeserializationContext.handleUnknownProperty(JsonParser, JsonDeserializer, Object, String)>
	//*  13   23:ifeq            27
		{
			return;
	//   14   26:return          
		} else
		{
			deserializationcontext.reportUnknownProperty(obj1, s, ((JsonDeserializer) (this)));
	//   15   27:aload_2         
	//   16   28:aload           5
	//   17   30:aload           4
	//   18   32:aload_0         
	//   19   33:invokevirtual   #620 <Method void DeserializationContext.reportUnknownProperty(Object, String, JsonDeserializer)>
			jsonparser.skipChildren();
	//   20   36:aload_1         
	//   21   37:invokevirtual   #624 <Method JsonParser JsonParser.skipChildren()>
	//   22   40:pop             
			return;
	//   23   41:return          
		}
	}

	public Class handledType()
	{
		return _valueClass;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Class _valueClass>
	//    2    4:areturn         
	}

	protected boolean isDefaultDeserializer(JsonDeserializer jsondeserializer)
	{
		return ClassUtil.isJacksonStdImpl(((Object) (jsondeserializer)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #631 <Method boolean ClassUtil.isJacksonStdImpl(Object)>
	//    2    4:ireturn         
	}

	protected boolean isDefaultKeyDeserializer(KeyDeserializer keydeserializer)
	{
		return ClassUtil.isJacksonStdImpl(((Object) (keydeserializer)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #631 <Method boolean ClassUtil.isJacksonStdImpl(Object)>
	//    2    4:ireturn         
	}

	protected static final int F_MASK_INT_COERCIONS;
	private static final long serialVersionUID = 1L;
	protected final Class _valueClass;

	static 
	{
		F_MASK_INT_COERCIONS = DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.getMask() | DeserializationFeature.USE_LONG_FOR_INTS.getMask();
	//    0    0:getstatic       #24  <Field DeserializationFeature DeserializationFeature.USE_BIG_INTEGER_FOR_INTS>
	//    1    3:invokevirtual   #28  <Method int DeserializationFeature.getMask()>
	//    2    6:getstatic       #31  <Field DeserializationFeature DeserializationFeature.USE_LONG_FOR_INTS>
	//    3    9:invokevirtual   #28  <Method int DeserializationFeature.getMask()>
	//    4   12:ior             
	//    5   13:putstatic       #33  <Field int F_MASK_INT_COERCIONS>
	//*   6   16:return          
	}
}
