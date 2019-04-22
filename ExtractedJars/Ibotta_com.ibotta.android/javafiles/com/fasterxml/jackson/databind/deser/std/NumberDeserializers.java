// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdScalarDeserializer

public class NumberDeserializers
{
	public static class BigDecimalDeserializer extends StdScalarDeserializer
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
		//		               6 54
		//		               7 49
		//		               8 49
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

		public static final BigDecimalDeserializer instance = new BigDecimalDeserializer();

		static 
		{
		//    0    0:new             #2   <Class NumberDeserializers$BigDecimalDeserializer>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void NumberDeserializers$BigDecimalDeserializer()>
		//    3    7:putstatic       #18  <Field NumberDeserializers$BigDecimalDeserializer instance>
		//*   4   10:return          
		}

		public BigDecimalDeserializer()
		{
			super(java/math/BigDecimal);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <Class BigDecimal>
		//    2    3:invokespecial   #24  <Method void StdScalarDeserializer(Class)>
		//    3    6:return          
		}
	}

	public static class BigIntegerDeserializer extends StdScalarDeserializer
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
				static class _cls1
				{

					static final int $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[];

					static 
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = new int[com.fasterxml.jackson.core.JsonParser.NumberType.values().length];
					//    0    0:invokestatic    #18  <Method com.fasterxml.jackson.core.JsonParser$NumberType[] com.fasterxml.jackson.core.JsonParser$NumberType.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
						try
						{
							$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.INT.ordinal()] = 1;
					//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
					//    5   12:getstatic       #24  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
					//    6   15:invokevirtual   #28  <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
					//*  10   23:getstatic       #31  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
					//*  11   26:invokevirtual   #28  <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
					//*  15   34:getstatic       #34  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_INTEGER>
					//*  16   37:invokevirtual   #28  <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
					//*  17   40:iconst_3        
					//*  18   41:iastore         
					//*  19   42:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   20   43:astore_0        
						try
						{
							$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.LONG.ordinal()] = 2;
						}
					//*  21   44:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   22   47:astore_0        
						try
						{
							$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER.ordinal()] = 3;
						}
					//*  23   48:goto            31
						catch(NoSuchFieldError nosuchfielderror2) { }
					//   24   51:astore_0        
					//*  25   52:return          
					}
				}

				switch(i)
		//*   6   10:iload_3         
				{
		//*   7   11:tableswitch     6 8: default 36
		//		               6 125
		//		               7 65
		//		               8 39
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
					switch(_cls1..SwitchMap.com.fasterxml.jackson.core.JsonParser.NumberType[jsonparser.getNumberType().ordinal()])
		//*  22   65:getstatic       #76  <Field int[] NumberDeserializers$1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
		//*  23   68:aload_1         
		//*  24   69:invokevirtual   #80  <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
		//*  25   72:invokevirtual   #85  <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
		//*  26   75:iaload          
					{
		//*  27   76:tableswitch     1 3: default 104
		//		               1 107
		//		               2 107
		//		               3 107
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

		public static final BigIntegerDeserializer instance = new BigIntegerDeserializer();

		static 
		{
		//    0    0:new             #2   <Class NumberDeserializers$BigIntegerDeserializer>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void NumberDeserializers$BigIntegerDeserializer()>
		//    3    7:putstatic       #18  <Field NumberDeserializers$BigIntegerDeserializer instance>
		//*   4   10:return          
		}

		public BigIntegerDeserializer()
		{
			super(java/math/BigInteger);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <Class BigInteger>
		//    2    3:invokespecial   #24  <Method void StdScalarDeserializer(Class)>
		//    3    6:return          
		}
	}

	public static final class BooleanDeserializer extends PrimitiveOrWrapperDeserializer
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

		static final BooleanDeserializer primitiveInstance;
		private static final long serialVersionUID = 1L;
		static final BooleanDeserializer wrapperInstance = new BooleanDeserializer(java/lang/Boolean, ((Boolean) (null)));

		static 
		{
			primitiveInstance = new BooleanDeserializer(Boolean.TYPE, Boolean.FALSE);
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

		public BooleanDeserializer(Class class1, Boolean boolean1)
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

	public static class ByteDeserializer extends PrimitiveOrWrapperDeserializer
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

		static final ByteDeserializer primitiveInstance;
		private static final long serialVersionUID = 1L;
		static final ByteDeserializer wrapperInstance = new ByteDeserializer(java/lang/Byte, ((Byte) (null)));

		static 
		{
			primitiveInstance = new ByteDeserializer(Byte.TYPE, Byte.valueOf((byte)0));
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

		public ByteDeserializer(Class class1, Byte byte1)
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

	public static class CharacterDeserializer extends PrimitiveOrWrapperDeserializer
	{

		public Character deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			int i = jsonparser.getCurrentTokenId();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #52  <Method int JsonParser.getCurrentTokenId()>
		//    2    4:istore_3        
			if(i != 3)
		//*   3    5:iload_3         
		//*   4    6:iconst_3        
		//*   5    7:icmpeq          142
			{
				if(i != 11)
		//*   6   10:iload_3         
		//*   7   11:bipush          11
		//*   8   13:icmpeq          129
				{
					switch(i)
		//*   9   16:iload_3         
					{
					default:
						break;

		//*  10   17:tableswitch     6 7: default 40
		//		               6 70
		//		               7 43
		//*  11   40:goto            116
					case 7: // '\007'
						_verifyNumberForScalarCoercion(deserializationcontext, jsonparser);
		//   12   43:aload_0         
		//   13   44:aload_2         
		//   14   45:aload_1         
		//   15   46:invokevirtual   #56  <Method void _verifyNumberForScalarCoercion(DeserializationContext, JsonParser)>
						int j = jsonparser.getIntValue();
		//   16   49:aload_1         
		//   17   50:invokevirtual   #59  <Method int JsonParser.getIntValue()>
		//   18   53:istore_3        
						if(j >= 0 && j <= 65535)
		//*  19   54:iload_3         
		//*  20   55:iflt            116
		//*  21   58:iload_3         
		//*  22   59:ldc1            #60  <Int 65535>
		//*  23   61:icmpgt          116
							return Character.valueOf((char)j);
		//   24   64:iload_3         
		//   25   65:int2char        
		//   26   66:invokestatic    #28  <Method Character Character.valueOf(char)>
		//   27   69:areturn         
						break;

					case 6: // '\006'
						String s = jsonparser.getText();
		//   28   70:aload_1         
		//   29   71:invokevirtual   #64  <Method String JsonParser.getText()>
		//   30   74:astore          4
						if(s.length() == 1)
		//*  31   76:aload           4
		//*  32   78:invokevirtual   #69  <Method int String.length()>
		//*  33   81:iconst_1        
		//*  34   82:icmpne          95
							return Character.valueOf(s.charAt(0));
		//   35   85:aload           4
		//   36   87:iconst_0        
		//   37   88:invokevirtual   #73  <Method char String.charAt(int)>
		//   38   91:invokestatic    #28  <Method Character Character.valueOf(char)>
		//   39   94:areturn         
						if(s.length() == 0)
		//*  40   95:aload           4
		//*  41   97:invokevirtual   #69  <Method int String.length()>
		//*  42  100:ifne            116
							return (Character)_coerceEmptyString(deserializationcontext, _primitive);
		//   43  103:aload_0         
		//   44  104:aload_2         
		//   45  105:aload_0         
		//   46  106:getfield        #77  <Field boolean _primitive>
		//   47  109:invokevirtual   #81  <Method Object _coerceEmptyString(DeserializationContext, boolean)>
		//   48  112:checkcast       #20  <Class Character>
		//   49  115:areturn         
						break;
					}
					return (Character)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
		//   50  116:aload_2         
		//   51  117:aload_0         
		//   52  118:getfield        #84  <Field Class _valueClass>
		//   53  121:aload_1         
		//   54  122:invokevirtual   #90  <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
		//   55  125:checkcast       #20  <Class Character>
		//   56  128:areturn         
				} else
				{
					return (Character)_coerceNullToken(deserializationcontext, _primitive);
		//   57  129:aload_0         
		//   58  130:aload_2         
		//   59  131:aload_0         
		//   60  132:getfield        #77  <Field boolean _primitive>
		//   61  135:invokevirtual   #93  <Method Object _coerceNullToken(DeserializationContext, boolean)>
		//   62  138:checkcast       #20  <Class Character>
		//   63  141:areturn         
				}
			} else
			{
				return (Character)_deserializeFromArray(jsonparser, deserializationcontext);
		//   64  142:aload_0         
		//   65  143:aload_1         
		//   66  144:aload_2         
		//   67  145:invokevirtual   #97  <Method Object _deserializeFromArray(JsonParser, DeserializationContext)>
		//   68  148:checkcast       #20  <Class Character>
		//   69  151:areturn         
			}
		}

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #102 <Method Character deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public volatile Object getEmptyValue(DeserializationContext deserializationcontext)
			throws JsonMappingException
		{
			return super.getEmptyValue(deserializationcontext);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #108 <Method Object NumberDeserializers$PrimitiveOrWrapperDeserializer.getEmptyValue(DeserializationContext)>
		//    3    5:areturn         
		}

		public volatile AccessPattern getNullAccessPattern()
		{
			return super.getNullAccessPattern();
		//    0    0:aload_0         
		//    1    1:invokespecial   #112 <Method AccessPattern NumberDeserializers$PrimitiveOrWrapperDeserializer.getNullAccessPattern()>
		//    2    4:areturn         
		}

		static final CharacterDeserializer primitiveInstance;
		private static final long serialVersionUID = 1L;
		static final CharacterDeserializer wrapperInstance = new CharacterDeserializer(java/lang/Character, ((Character) (null)));

		static 
		{
			primitiveInstance = new CharacterDeserializer(Character.TYPE, Character.valueOf('\0'));
		//    0    0:new             #2   <Class NumberDeserializers$CharacterDeserializer>
		//    1    3:dup             
		//    2    4:getstatic       #24  <Field Class Character.TYPE>
		//    3    7:iconst_0        
		//    4    8:invokestatic    #28  <Method Character Character.valueOf(char)>
		//    5   11:invokespecial   #32  <Method void NumberDeserializers$CharacterDeserializer(Class, Character)>
		//    6   14:putstatic       #34  <Field NumberDeserializers$CharacterDeserializer primitiveInstance>
		//    7   17:new             #2   <Class NumberDeserializers$CharacterDeserializer>
		//    8   20:dup             
		//    9   21:ldc1            #20  <Class Character>
		//   10   23:aconst_null     
		//   11   24:invokespecial   #32  <Method void NumberDeserializers$CharacterDeserializer(Class, Character)>
		//   12   27:putstatic       #36  <Field NumberDeserializers$CharacterDeserializer wrapperInstance>
		//*  13   30:return          
		}

		public CharacterDeserializer(Class class1, Character character)
		{
			super(class1, ((Object) (character)), ((Object) (Character.valueOf('\0'))));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iconst_0        
		//    4    4:invokestatic    #28  <Method Character Character.valueOf(char)>
		//    5    7:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object, Object)>
		//    6   10:return          
		}
	}

	public static class DoubleDeserializer extends PrimitiveOrWrapperDeserializer
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

		static final DoubleDeserializer primitiveInstance;
		private static final long serialVersionUID = 1L;
		static final DoubleDeserializer wrapperInstance = new DoubleDeserializer(java/lang/Double, ((Double) (null)));

		static 
		{
			primitiveInstance = new DoubleDeserializer(Double.TYPE, Double.valueOf(0.0D));
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

		public DoubleDeserializer(Class class1, Double double1)
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

	public static class FloatDeserializer extends PrimitiveOrWrapperDeserializer
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

		static final FloatDeserializer primitiveInstance;
		private static final long serialVersionUID = 1L;
		static final FloatDeserializer wrapperInstance = new FloatDeserializer(java/lang/Float, ((Float) (null)));

		static 
		{
			primitiveInstance = new FloatDeserializer(Float.TYPE, Float.valueOf(0.0F));
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

		public FloatDeserializer(Class class1, Float float1)
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

	public static final class IntegerDeserializer extends PrimitiveOrWrapperDeserializer
	{

		protected final Integer _parseInteger(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			int i = jsonparser.getCurrentTokenId();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #54  <Method int JsonParser.getCurrentTokenId()>
		//    2    4:istore_3        
			if(i == 3) goto _L2; else goto _L1
		//    3    5:iload_3         
		//    4    6:iconst_3        
		//    5    7:icmpeq          264
_L1:
			if(i == 11) goto _L4; else goto _L3
		//    6   10:iload_3         
		//    7   11:bipush          11
		//    8   13:icmpeq          251
_L3:
			switch(i)
		//*   9   16:iload_3         
			{
		//*  10   17:tableswitch     6 8: default 44
		//		               6 91
		//		               7 83
		//		               8 57
			default:
				return (Integer)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
		//   11   44:aload_2         
		//   12   45:aload_0         
		//   13   46:getfield        #57  <Field Class _valueClass>
		//   14   49:aload_1         
		//   15   50:invokevirtual   #63  <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
		//   16   53:checkcast       #20  <Class Integer>
		//   17   56:areturn         

			case 8: // '\b'
				if(!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT))
		//*  18   57:aload_2         
		//*  19   58:getstatic       #69  <Field DeserializationFeature DeserializationFeature.ACCEPT_FLOAT_AS_INT>
		//*  20   61:invokevirtual   #73  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//*  21   64:ifne            75
					_failDoubleToIntCoercion(jsonparser, deserializationcontext, "Integer");
		//   22   67:aload_0         
		//   23   68:aload_1         
		//   24   69:aload_2         
		//   25   70:ldc1            #75  <String "Integer">
		//   26   72:invokevirtual   #79  <Method void _failDoubleToIntCoercion(JsonParser, DeserializationContext, String)>
				return Integer.valueOf(jsonparser.getValueAsInt());
		//   27   75:aload_1         
		//   28   76:invokevirtual   #82  <Method int JsonParser.getValueAsInt()>
		//   29   79:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//   30   82:areturn         

			case 7: // '\007'
				return Integer.valueOf(jsonparser.getIntValue());
		//   31   83:aload_1         
		//   32   84:invokevirtual   #85  <Method int JsonParser.getIntValue()>
		//   33   87:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//   34   90:areturn         

			case 6: // '\006'
				jsonparser = ((JsonParser) (jsonparser.getText().trim()));
		//   35   91:aload_1         
		//   36   92:invokevirtual   #89  <Method String JsonParser.getText()>
		//   37   95:invokevirtual   #94  <Method String String.trim()>
		//   38   98:astore_1        
				i = ((String) (jsonparser)).length();
		//   39   99:aload_1         
		//   40  100:invokevirtual   #97  <Method int String.length()>
		//   41  103:istore_3        
				break;
			}
			if(i == 0)
		//*  42  104:iload_3         
		//*  43  105:ifne            121
				return (Integer)_coerceEmptyString(deserializationcontext, _primitive);
		//   44  108:aload_0         
		//   45  109:aload_2         
		//   46  110:aload_0         
		//   47  111:getfield        #101 <Field boolean _primitive>
		//   48  114:invokevirtual   #105 <Method Object _coerceEmptyString(DeserializationContext, boolean)>
		//   49  117:checkcast       #20  <Class Integer>
		//   50  120:areturn         
			if(_hasTextualNull(((String) (jsonparser))))
		//*  51  121:aload_0         
		//*  52  122:aload_1         
		//*  53  123:invokevirtual   #109 <Method boolean _hasTextualNull(String)>
		//*  54  126:ifeq            142
				return (Integer)_coerceTextualNull(deserializationcontext, _primitive);
		//   55  129:aload_0         
		//   56  130:aload_2         
		//   57  131:aload_0         
		//   58  132:getfield        #101 <Field boolean _primitive>
		//   59  135:invokevirtual   #112 <Method Object _coerceTextualNull(DeserializationContext, boolean)>
		//   60  138:checkcast       #20  <Class Integer>
		//   61  141:areturn         
			_verifyStringForScalarCoercion(deserializationcontext, ((String) (jsonparser)));
		//   62  142:aload_0         
		//   63  143:aload_2         
		//   64  144:aload_1         
		//   65  145:invokevirtual   #116 <Method void _verifyStringForScalarCoercion(DeserializationContext, String)>
			if(i <= 9)
				break MISSING_BLOCK_LABEL_222;
		//   66  148:iload_3         
		//   67  149:bipush          9
		//   68  151:icmple          222
			long l = Long.parseLong(((String) (jsonparser)));
		//   69  154:aload_1         
		//   70  155:invokestatic    #122 <Method long Long.parseLong(String)>
		//   71  158:lstore          4
			if(_intOverflow(l))
		//*  72  160:aload_0         
		//*  73  161:lload           4
		//*  74  163:invokevirtual   #126 <Method boolean _intOverflow(long)>
		//*  75  166:ifeq            215
				return (Integer)deserializationcontext.handleWeirdStringValue(_valueClass, ((String) (jsonparser)), String.format("Overflow: numeric value (%s) out of range of Integer (%d - %d)", new Object[] {
					jsonparser, Integer.valueOf(0x80000000), Integer.valueOf(0x7fffffff)
				}), new Object[0]);
		//   76  169:aload_2         
		//   77  170:aload_0         
		//   78  171:getfield        #57  <Field Class _valueClass>
		//   79  174:aload_1         
		//   80  175:ldc1            #128 <String "Overflow: numeric value (%s) out of range of Integer (%d - %d)">
		//   81  177:iconst_3        
		//   82  178:anewarray       Object[]
		//   83  181:dup             
		//   84  182:iconst_0        
		//   85  183:aload_1         
		//   86  184:aastore         
		//   87  185:dup             
		//   88  186:iconst_1        
		//   89  187:ldc1            #131 <Int 0x80000000>
		//   90  189:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//   91  192:aastore         
		//   92  193:dup             
		//   93  194:iconst_2        
		//   94  195:ldc1            #132 <Int 0x7fffffff>
		//   95  197:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//   96  200:aastore         
		//   97  201:invokestatic    #136 <Method String String.format(String, Object[])>
		//   98  204:iconst_0        
		//   99  205:anewarray       Object[]
		//  100  208:invokevirtual   #140 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
		//  101  211:checkcast       #20  <Class Integer>
		//  102  214:areturn         
			else
				return Integer.valueOf((int)l);
		//  103  215:lload           4
		//  104  217:l2i             
		//  105  218:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//  106  221:areturn         
			i = NumberInput.parseInt(((String) (jsonparser)));
		//  107  222:aload_1         
		//  108  223:invokestatic    #146 <Method int NumberInput.parseInt(String)>
		//  109  226:istore_3        
			return Integer.valueOf(i);
		//  110  227:iload_3         
		//  111  228:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//  112  231:areturn         
_L6:
			return (Integer)deserializationcontext.handleWeirdStringValue(_valueClass, ((String) (jsonparser)), "not a valid Integer value", new Object[0]);
		//  113  232:aload_2         
		//  114  233:aload_0         
		//  115  234:getfield        #57  <Field Class _valueClass>
		//  116  237:aload_1         
		//  117  238:ldc1            #148 <String "not a valid Integer value">
		//  118  240:iconst_0        
		//  119  241:anewarray       Object[]
		//  120  244:invokevirtual   #140 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
		//  121  247:checkcast       #20  <Class Integer>
		//  122  250:areturn         
_L4:
			return (Integer)_coerceNullToken(deserializationcontext, _primitive);
		//  123  251:aload_0         
		//  124  252:aload_2         
		//  125  253:aload_0         
		//  126  254:getfield        #101 <Field boolean _primitive>
		//  127  257:invokevirtual   #151 <Method Object _coerceNullToken(DeserializationContext, boolean)>
		//  128  260:checkcast       #20  <Class Integer>
		//  129  263:areturn         
_L2:
			return (Integer)_deserializeFromArray(jsonparser, deserializationcontext);
		//  130  264:aload_0         
		//  131  265:aload_1         
		//  132  266:aload_2         
		//  133  267:invokevirtual   #155 <Method Object _deserializeFromArray(JsonParser, DeserializationContext)>
		//  134  270:checkcast       #20  <Class Integer>
		//  135  273:areturn         
			IllegalArgumentException illegalargumentexception;
			illegalargumentexception;
		//  136  274:astore          6
			if(true) goto _L6; else goto _L5
		//  137  276:goto            232
_L5:
		}

		public Integer deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			if(jsonparser.hasToken(JsonToken.VALUE_NUMBER_INT))
		//*   0    0:aload_1         
		//*   1    1:getstatic       #163 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
		//*   2    4:invokevirtual   #167 <Method boolean JsonParser.hasToken(JsonToken)>
		//*   3    7:ifeq            18
				return Integer.valueOf(jsonparser.getIntValue());
		//    4   10:aload_1         
		//    5   11:invokevirtual   #85  <Method int JsonParser.getIntValue()>
		//    6   14:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//    7   17:areturn         
			else
				return _parseInteger(jsonparser, deserializationcontext);
		//    8   18:aload_0         
		//    9   19:aload_1         
		//   10   20:aload_2         
		//   11   21:invokevirtual   #169 <Method Integer _parseInteger(JsonParser, DeserializationContext)>
		//   12   24:areturn         
		}

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #173 <Method Integer deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public Integer deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
			throws IOException
		{
			if(jsonparser.hasToken(JsonToken.VALUE_NUMBER_INT))
		//*   0    0:aload_1         
		//*   1    1:getstatic       #163 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
		//*   2    4:invokevirtual   #167 <Method boolean JsonParser.hasToken(JsonToken)>
		//*   3    7:ifeq            18
				return Integer.valueOf(jsonparser.getIntValue());
		//    4   10:aload_1         
		//    5   11:invokevirtual   #85  <Method int JsonParser.getIntValue()>
		//    6   14:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//    7   17:areturn         
			else
				return _parseInteger(jsonparser, deserializationcontext);
		//    8   18:aload_0         
		//    9   19:aload_1         
		//   10   20:aload_2         
		//   11   21:invokevirtual   #169 <Method Integer _parseInteger(JsonParser, DeserializationContext)>
		//   12   24:areturn         
		}

		public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
			throws IOException
		{
			return ((Object) (deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #178 <Method Integer deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
		//    5    7:areturn         
		}

		public volatile Object getEmptyValue(DeserializationContext deserializationcontext)
			throws JsonMappingException
		{
			return super.getEmptyValue(deserializationcontext);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #184 <Method Object NumberDeserializers$PrimitiveOrWrapperDeserializer.getEmptyValue(DeserializationContext)>
		//    3    5:areturn         
		}

		public volatile AccessPattern getNullAccessPattern()
		{
			return super.getNullAccessPattern();
		//    0    0:aload_0         
		//    1    1:invokespecial   #188 <Method AccessPattern NumberDeserializers$PrimitiveOrWrapperDeserializer.getNullAccessPattern()>
		//    2    4:areturn         
		}

		public boolean isCachable()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		static final IntegerDeserializer primitiveInstance;
		private static final long serialVersionUID = 1L;
		static final IntegerDeserializer wrapperInstance = new IntegerDeserializer(java/lang/Integer, ((Integer) (null)));

		static 
		{
			primitiveInstance = new IntegerDeserializer(Integer.TYPE, Integer.valueOf(0));
		//    0    0:new             #2   <Class NumberDeserializers$IntegerDeserializer>
		//    1    3:dup             
		//    2    4:getstatic       #24  <Field Class Integer.TYPE>
		//    3    7:iconst_0        
		//    4    8:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//    5   11:invokespecial   #32  <Method void NumberDeserializers$IntegerDeserializer(Class, Integer)>
		//    6   14:putstatic       #34  <Field NumberDeserializers$IntegerDeserializer primitiveInstance>
		//    7   17:new             #2   <Class NumberDeserializers$IntegerDeserializer>
		//    8   20:dup             
		//    9   21:ldc1            #20  <Class Integer>
		//   10   23:aconst_null     
		//   11   24:invokespecial   #32  <Method void NumberDeserializers$IntegerDeserializer(Class, Integer)>
		//   12   27:putstatic       #36  <Field NumberDeserializers$IntegerDeserializer wrapperInstance>
		//*  13   30:return          
		}

		public IntegerDeserializer(Class class1, Integer integer)
		{
			super(class1, ((Object) (integer)), ((Object) (Integer.valueOf(0))));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iconst_0        
		//    4    4:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//    5    7:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object, Object)>
		//    6   10:return          
		}
	}

	public static final class LongDeserializer extends PrimitiveOrWrapperDeserializer
	{

		protected final Long _parseLong(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			IllegalArgumentException illegalargumentexception;
			int i = jsonparser.getCurrentTokenId();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #54  <Method int JsonParser.getCurrentTokenId()>
		//    2    4:istore_3        
			if(i != 3)
		//*   3    5:iload_3         
		//*   4    6:iconst_3        
		//*   5    7:icmpeq          190
			{
				if(i != 11)
		//*   6   10:iload_3         
		//*   7   11:bipush          11
		//*   8   13:icmpeq          177
				{
					switch(i)
		//*   9   16:iload_3         
					{
		//*  10   17:tableswitch     6 8: default 44
		//		               6 91
		//		               7 83
		//		               8 57
					default:
						return (Long)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
		//   11   44:aload_2         
		//   12   45:aload_0         
		//   13   46:getfield        #57  <Field Class _valueClass>
		//   14   49:aload_1         
		//   15   50:invokevirtual   #63  <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
		//   16   53:checkcast       #20  <Class Long>
		//   17   56:areturn         

					case 8: // '\b'
						if(!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT))
		//*  18   57:aload_2         
		//*  19   58:getstatic       #69  <Field DeserializationFeature DeserializationFeature.ACCEPT_FLOAT_AS_INT>
		//*  20   61:invokevirtual   #73  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//*  21   64:ifne            75
							_failDoubleToIntCoercion(jsonparser, deserializationcontext, "Long");
		//   22   67:aload_0         
		//   23   68:aload_1         
		//   24   69:aload_2         
		//   25   70:ldc1            #75  <String "Long">
		//   26   72:invokevirtual   #79  <Method void _failDoubleToIntCoercion(JsonParser, DeserializationContext, String)>
						return Long.valueOf(jsonparser.getValueAsLong());
		//   27   75:aload_1         
		//   28   76:invokevirtual   #83  <Method long JsonParser.getValueAsLong()>
		//   29   79:invokestatic    #28  <Method Long Long.valueOf(long)>
		//   30   82:areturn         

					case 7: // '\007'
						return Long.valueOf(jsonparser.getLongValue());
		//   31   83:aload_1         
		//   32   84:invokevirtual   #86  <Method long JsonParser.getLongValue()>
		//   33   87:invokestatic    #28  <Method Long Long.valueOf(long)>
		//   34   90:areturn         

					case 6: // '\006'
						jsonparser = ((JsonParser) (jsonparser.getText().trim()));
		//   35   91:aload_1         
		//   36   92:invokevirtual   #90  <Method String JsonParser.getText()>
		//   37   95:invokevirtual   #95  <Method String String.trim()>
		//   38   98:astore_1        
						break;
					}
					if(((String) (jsonparser)).length() == 0)
		//*  39   99:aload_1         
		//*  40  100:invokevirtual   #98  <Method int String.length()>
		//*  41  103:ifne            119
						return (Long)_coerceEmptyString(deserializationcontext, _primitive);
		//   42  106:aload_0         
		//   43  107:aload_2         
		//   44  108:aload_0         
		//   45  109:getfield        #102 <Field boolean _primitive>
		//   46  112:invokevirtual   #106 <Method Object _coerceEmptyString(DeserializationContext, boolean)>
		//   47  115:checkcast       #20  <Class Long>
		//   48  118:areturn         
					if(_hasTextualNull(((String) (jsonparser))))
		//*  49  119:aload_0         
		//*  50  120:aload_1         
		//*  51  121:invokevirtual   #110 <Method boolean _hasTextualNull(String)>
		//*  52  124:ifeq            140
						return (Long)_coerceTextualNull(deserializationcontext, _primitive);
		//   53  127:aload_0         
		//   54  128:aload_2         
		//   55  129:aload_0         
		//   56  130:getfield        #102 <Field boolean _primitive>
		//   57  133:invokevirtual   #113 <Method Object _coerceTextualNull(DeserializationContext, boolean)>
		//   58  136:checkcast       #20  <Class Long>
		//   59  139:areturn         
					_verifyStringForScalarCoercion(deserializationcontext, ((String) (jsonparser)));
		//   60  140:aload_0         
		//   61  141:aload_2         
		//   62  142:aload_1         
		//   63  143:invokevirtual   #117 <Method void _verifyStringForScalarCoercion(DeserializationContext, String)>
					long l;
					try
					{
						l = NumberInput.parseLong(((String) (jsonparser)));
		//   64  146:aload_1         
		//   65  147:invokestatic    #123 <Method long NumberInput.parseLong(String)>
		//   66  150:lstore          4
					}
		//*  67  152:lload           4
		//*  68  154:invokestatic    #28  <Method Long Long.valueOf(long)>
		//*  69  157:areturn         
		//*  70  158:aload_2         
		//*  71  159:aload_0         
		//*  72  160:getfield        #57  <Field Class _valueClass>
		//*  73  163:aload_1         
		//*  74  164:ldc1            #125 <String "not a valid Long value">
		//*  75  166:iconst_0        
		//*  76  167:anewarray       Object[]
		//*  77  170:invokevirtual   #131 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
		//*  78  173:checkcast       #20  <Class Long>
		//*  79  176:areturn         
		//*  80  177:aload_0         
		//*  81  178:aload_2         
		//*  82  179:aload_0         
		//*  83  180:getfield        #102 <Field boolean _primitive>
		//*  84  183:invokevirtual   #134 <Method Object _coerceNullToken(DeserializationContext, boolean)>
		//*  85  186:checkcast       #20  <Class Long>
		//*  86  189:areturn         
		//*  87  190:aload_0         
		//*  88  191:aload_1         
		//*  89  192:aload_2         
		//*  90  193:invokevirtual   #138 <Method Object _deserializeFromArray(JsonParser, DeserializationContext)>
		//*  91  196:checkcast       #20  <Class Long>
		//*  92  199:areturn         
					// Misplaced declaration of an exception variable
					catch(IllegalArgumentException illegalargumentexception)
					{
						return (Long)deserializationcontext.handleWeirdStringValue(_valueClass, ((String) (jsonparser)), "not a valid Long value", new Object[0]);
					}
					return Long.valueOf(l);
				} else
				{
					return (Long)_coerceNullToken(deserializationcontext, _primitive);
				}
			} else
			{
				return (Long)_deserializeFromArray(jsonparser, deserializationcontext);
			}
		//*  93  200:astore          6
		//*  94  202:goto            158
		}

		public Long deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			if(jsonparser.hasToken(JsonToken.VALUE_NUMBER_INT))
		//*   0    0:aload_1         
		//*   1    1:getstatic       #146 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
		//*   2    4:invokevirtual   #150 <Method boolean JsonParser.hasToken(JsonToken)>
		//*   3    7:ifeq            18
				return Long.valueOf(jsonparser.getLongValue());
		//    4   10:aload_1         
		//    5   11:invokevirtual   #86  <Method long JsonParser.getLongValue()>
		//    6   14:invokestatic    #28  <Method Long Long.valueOf(long)>
		//    7   17:areturn         
			else
				return _parseLong(jsonparser, deserializationcontext);
		//    8   18:aload_0         
		//    9   19:aload_1         
		//   10   20:aload_2         
		//   11   21:invokevirtual   #152 <Method Long _parseLong(JsonParser, DeserializationContext)>
		//   12   24:areturn         
		}

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #156 <Method Long deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public volatile Object getEmptyValue(DeserializationContext deserializationcontext)
			throws JsonMappingException
		{
			return super.getEmptyValue(deserializationcontext);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #162 <Method Object NumberDeserializers$PrimitiveOrWrapperDeserializer.getEmptyValue(DeserializationContext)>
		//    3    5:areturn         
		}

		public volatile AccessPattern getNullAccessPattern()
		{
			return super.getNullAccessPattern();
		//    0    0:aload_0         
		//    1    1:invokespecial   #166 <Method AccessPattern NumberDeserializers$PrimitiveOrWrapperDeserializer.getNullAccessPattern()>
		//    2    4:areturn         
		}

		public boolean isCachable()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		static final LongDeserializer primitiveInstance;
		private static final long serialVersionUID = 1L;
		static final LongDeserializer wrapperInstance = new LongDeserializer(java/lang/Long, ((Long) (null)));

		static 
		{
			primitiveInstance = new LongDeserializer(Long.TYPE, Long.valueOf(0L));
		//    0    0:new             #2   <Class NumberDeserializers$LongDeserializer>
		//    1    3:dup             
		//    2    4:getstatic       #24  <Field Class Long.TYPE>
		//    3    7:lconst_0        
		//    4    8:invokestatic    #28  <Method Long Long.valueOf(long)>
		//    5   11:invokespecial   #32  <Method void NumberDeserializers$LongDeserializer(Class, Long)>
		//    6   14:putstatic       #34  <Field NumberDeserializers$LongDeserializer primitiveInstance>
		//    7   17:new             #2   <Class NumberDeserializers$LongDeserializer>
		//    8   20:dup             
		//    9   21:ldc1            #20  <Class Long>
		//   10   23:aconst_null     
		//   11   24:invokespecial   #32  <Method void NumberDeserializers$LongDeserializer(Class, Long)>
		//   12   27:putstatic       #36  <Field NumberDeserializers$LongDeserializer wrapperInstance>
		//*  13   30:return          
		}

		public LongDeserializer(Class class1, Long long1)
		{
			super(class1, ((Object) (long1)), ((Object) (Long.valueOf(0L))));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:lconst_0        
		//    4    4:invokestatic    #28  <Method Long Long.valueOf(long)>
		//    5    7:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object, Object)>
		//    6   10:return          
		}
	}

	public static class NumberDeserializer extends StdScalarDeserializer
	{

		public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			int i = jsonparser.getCurrentTokenId();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #36  <Method int JsonParser.getCurrentTokenId()>
		//    2    4:istore_3        
			if(i == 3)
				break MISSING_BLOCK_LABEL_295;
		//    3    5:iload_3         
		//    4    6:iconst_3        
		//    5    7:icmpeq          295
			switch(i)
		//*   6   10:iload_3         
			{
		//*   7   11:tableswitch     6 8: default 36
		//		               6 95
		//		               7 73
		//		               8 46
			default:
				return deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
		//    8   36:aload_2         
		//    9   37:aload_0         
		//   10   38:getfield        #40  <Field Class _valueClass>
		//   11   41:aload_1         
		//   12   42:invokevirtual   #46  <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
		//   13   45:areturn         

			case 8: // '\b'
				if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) && !jsonparser.isNaN())
		//*  14   46:aload_2         
		//*  15   47:getstatic       #52  <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
		//*  16   50:invokevirtual   #56  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//*  17   53:ifeq            68
		//*  18   56:aload_1         
		//*  19   57:invokevirtual   #60  <Method boolean JsonParser.isNaN()>
		//*  20   60:ifne            68
					return ((Object) (jsonparser.getDecimalValue()));
		//   21   63:aload_1         
		//   22   64:invokevirtual   #64  <Method BigDecimal JsonParser.getDecimalValue()>
		//   23   67:areturn         
				else
					return ((Object) (jsonparser.getNumberValue()));
		//   24   68:aload_1         
		//   25   69:invokevirtual   #68  <Method Number JsonParser.getNumberValue()>
		//   26   72:areturn         

			case 7: // '\007'
				if(deserializationcontext.hasSomeOfFeatures(F_MASK_INT_COERCIONS))
		//*  27   73:aload_2         
		//*  28   74:getstatic       #72  <Field int F_MASK_INT_COERCIONS>
		//*  29   77:invokevirtual   #76  <Method boolean DeserializationContext.hasSomeOfFeatures(int)>
		//*  30   80:ifeq            90
					return _coerceIntegral(jsonparser, deserializationcontext);
		//   31   83:aload_0         
		//   32   84:aload_1         
		//   33   85:aload_2         
		//   34   86:invokevirtual   #79  <Method Object _coerceIntegral(JsonParser, DeserializationContext)>
		//   35   89:areturn         
				else
					return ((Object) (jsonparser.getNumberValue()));
		//   36   90:aload_1         
		//   37   91:invokevirtual   #68  <Method Number JsonParser.getNumberValue()>
		//   38   94:areturn         

			case 6: // '\006'
				jsonparser = ((JsonParser) (jsonparser.getText().trim()));
		//   39   95:aload_1         
		//   40   96:invokevirtual   #83  <Method String JsonParser.getText()>
		//   41   99:invokevirtual   #88  <Method String String.trim()>
		//   42  102:astore_1        
				break;
			}
			if(((String) (jsonparser)).length() == 0)
		//*  43  103:aload_1         
		//*  44  104:invokevirtual   #91  <Method int String.length()>
		//*  45  107:ifne            116
				return getNullValue(deserializationcontext);
		//   46  110:aload_0         
		//   47  111:aload_2         
		//   48  112:invokevirtual   #95  <Method Object getNullValue(DeserializationContext)>
		//   49  115:areturn         
			if(_hasTextualNull(((String) (jsonparser))))
		//*  50  116:aload_0         
		//*  51  117:aload_1         
		//*  52  118:invokevirtual   #99  <Method boolean _hasTextualNull(String)>
		//*  53  121:ifeq            130
				return getNullValue(deserializationcontext);
		//   54  124:aload_0         
		//   55  125:aload_2         
		//   56  126:invokevirtual   #95  <Method Object getNullValue(DeserializationContext)>
		//   57  129:areturn         
			if(_isPosInf(((String) (jsonparser))))
		//*  58  130:aload_0         
		//*  59  131:aload_1         
		//*  60  132:invokevirtual   #102 <Method boolean _isPosInf(String)>
		//*  61  135:ifeq            145
				return ((Object) (Double.valueOf((1.0D / 0.0D))));
		//   62  138:ldc2w           #103 <Double (1.0D / 0.0D)>
		//   63  141:invokestatic    #110 <Method Double Double.valueOf(double)>
		//   64  144:areturn         
			if(_isNegInf(((String) (jsonparser))))
		//*  65  145:aload_0         
		//*  66  146:aload_1         
		//*  67  147:invokevirtual   #113 <Method boolean _isNegInf(String)>
		//*  68  150:ifeq            160
				return ((Object) (Double.valueOf((-1.0D / 0.0D))));
		//   69  153:ldc2w           #114 <Double (-1.0D / 0.0D)>
		//   70  156:invokestatic    #110 <Method Double Double.valueOf(double)>
		//   71  159:areturn         
			if(_isNaN(((String) (jsonparser))))
		//*  72  160:aload_0         
		//*  73  161:aload_1         
		//*  74  162:invokevirtual   #118 <Method boolean _isNaN(String)>
		//*  75  165:ifeq            175
				return ((Object) (Double.valueOf((0.0D / 0.0D))));
		//   76  168:ldc2w           #119 <Double (0.0D / 0.0D)>
		//   77  171:invokestatic    #110 <Method Double Double.valueOf(double)>
		//   78  174:areturn         
			_verifyStringForScalarCoercion(deserializationcontext, ((String) (jsonparser)));
		//   79  175:aload_0         
		//   80  176:aload_2         
		//   81  177:aload_1         
		//   82  178:invokevirtual   #124 <Method void _verifyStringForScalarCoercion(DeserializationContext, String)>
			long l;
			if(!_isIntNumber(((String) (jsonparser))))
		//*  83  181:aload_0         
		//*  84  182:aload_1         
		//*  85  183:invokevirtual   #127 <Method boolean _isIntNumber(String)>
		//*  86  186:ifne            213
				if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
		//*  87  189:aload_2         
		//*  88  190:getstatic       #52  <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
		//*  89  193:invokevirtual   #56  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//*  90  196:ifeq            208
					return ((Object) (new BigDecimal(((String) (jsonparser)))));
		//   91  199:new             #129 <Class BigDecimal>
		//   92  202:dup             
		//   93  203:aload_1         
		//   94  204:invokespecial   #132 <Method void BigDecimal(String)>
		//   95  207:areturn         
				else
					return ((Object) (Double.valueOf(((String) (jsonparser)))));
		//   96  208:aload_1         
		//   97  209:invokestatic    #135 <Method Double Double.valueOf(String)>
		//   98  212:areturn         
			if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS))
		//*  99  213:aload_2         
		//* 100  214:getstatic       #138 <Field DeserializationFeature DeserializationFeature.USE_BIG_INTEGER_FOR_INTS>
		//* 101  217:invokevirtual   #56  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//* 102  220:ifeq            232
				return ((Object) (new BigInteger(((String) (jsonparser)))));
		//  103  223:new             #140 <Class BigInteger>
		//  104  226:dup             
		//  105  227:aload_1         
		//  106  228:invokespecial   #141 <Method void BigInteger(String)>
		//  107  231:areturn         
			l = Long.parseLong(((String) (jsonparser)));
		//  108  232:aload_1         
		//  109  233:invokestatic    #147 <Method long Long.parseLong(String)>
		//  110  236:lstore          4
			if(!deserializationcontext.isEnabled(DeserializationFeature.USE_LONG_FOR_INTS) && l <= 0x7fffffffL && l >= 0x80000000L)
		//* 111  238:aload_2         
		//* 112  239:getstatic       #150 <Field DeserializationFeature DeserializationFeature.USE_LONG_FOR_INTS>
		//* 113  242:invokevirtual   #56  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//* 114  245:ifne            273
		//* 115  248:lload           4
		//* 116  250:ldc2w           #151 <Long 0x7fffffffL>
		//* 117  253:lcmp            
		//* 118  254:ifgt            273
		//* 119  257:lload           4
		//* 120  259:ldc2w           #153 <Long 0x80000000L>
		//* 121  262:lcmp            
		//* 122  263:iflt            273
				try
				{
					return ((Object) (Integer.valueOf((int)l)));
		//  123  266:lload           4
		//  124  268:l2i             
		//  125  269:invokestatic    #159 <Method Integer Integer.valueOf(int)>
		//  126  272:areturn         
				}
		//* 127  273:lload           4
		//* 128  275:invokestatic    #162 <Method Long Long.valueOf(long)>
		//* 129  278:areturn         
		//* 130  279:aload_2         
		//* 131  280:aload_0         
		//* 132  281:getfield        #40  <Field Class _valueClass>
		//* 133  284:aload_1         
		//* 134  285:ldc1            #164 <String "not a valid number">
		//* 135  287:iconst_0        
		//* 136  288:anewarray       Object[]
		//* 137  291:invokevirtual   #170 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
		//* 138  294:areturn         
		//* 139  295:aload_0         
		//* 140  296:aload_1         
		//* 141  297:aload_2         
		//* 142  298:invokevirtual   #173 <Method Object _deserializeFromArray(JsonParser, DeserializationContext)>
		//* 143  301:areturn         
				// Misplaced declaration of an exception variable
				catch(IllegalArgumentException illegalargumentexception)
				{
					return deserializationcontext.handleWeirdStringValue(_valueClass, ((String) (jsonparser)), "not a valid number", new Object[0]);
				}
			else
				return ((Object) (Long.valueOf(l)));
			IllegalArgumentException illegalargumentexception;
			return _deserializeFromArray(jsonparser, deserializationcontext);
		//* 144  302:astore          6
		//* 145  304:goto            279
		}

		public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
			throws IOException
		{
			switch(jsonparser.getCurrentTokenId())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #36  <Method int JsonParser.getCurrentTokenId()>
			{
		//*   2    4:tableswitch     6 8: default 32
		//		               6 39
		//		               7 39
		//		               8 39
			default:
				return typedeserializer.deserializeTypedFromScalar(jsonparser, deserializationcontext);
		//    3   32:aload_3         
		//    4   33:aload_1         
		//    5   34:aload_2         
		//    6   35:invokevirtual   #181 <Method Object TypeDeserializer.deserializeTypedFromScalar(JsonParser, DeserializationContext)>
		//    7   38:areturn         

			case 6: // '\006'
			case 7: // '\007'
			case 8: // '\b'
				return deserialize(jsonparser, deserializationcontext);
		//    8   39:aload_0         
		//    9   40:aload_1         
		//   10   41:aload_2         
		//   11   42:invokevirtual   #183 <Method Object deserialize(JsonParser, DeserializationContext)>
		//   12   45:areturn         
			}
		}

		public static final NumberDeserializer instance = new NumberDeserializer();

		static 
		{
		//    0    0:new             #2   <Class NumberDeserializers$NumberDeserializer>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void NumberDeserializers$NumberDeserializer()>
		//    3    7:putstatic       #18  <Field NumberDeserializers$NumberDeserializer instance>
		//*   4   10:return          
		}

		public NumberDeserializer()
		{
			super(java/lang/Number);
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <Class Number>
		//    2    3:invokespecial   #24  <Method void StdScalarDeserializer(Class)>
		//    3    6:return          
		}
	}

	protected static abstract class PrimitiveOrWrapperDeserializer extends StdScalarDeserializer
	{

		public Object getEmptyValue(DeserializationContext deserializationcontext)
			throws JsonMappingException
		{
			return _emptyValue;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field Object _emptyValue>
		//    2    4:areturn         
		}

		public AccessPattern getNullAccessPattern()
		{
			if(_primitive)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field boolean _primitive>
		//*   2    4:ifeq            11
				return AccessPattern.DYNAMIC;
		//    3    7:getstatic       #51  <Field AccessPattern AccessPattern.DYNAMIC>
		//    4   10:areturn         
			if(_nullValue == null)
		//*   5   11:aload_0         
		//*   6   12:getfield        #25  <Field Object _nullValue>
		//*   7   15:ifnonnull       22
				return AccessPattern.ALWAYS_NULL;
		//    8   18:getstatic       #54  <Field AccessPattern AccessPattern.ALWAYS_NULL>
		//    9   21:areturn         
			else
				return AccessPattern.CONSTANT;
		//   10   22:getstatic       #57  <Field AccessPattern AccessPattern.CONSTANT>
		//   11   25:areturn         
		}

		public final Object getNullValue(DeserializationContext deserializationcontext)
			throws JsonMappingException
		{
			if(_primitive && deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES))
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field boolean _primitive>
		//*   2    4:ifeq            39
		//*   3    7:aload_1         
		//*   4    8:getstatic       #64  <Field DeserializationFeature DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES>
		//*   5   11:invokevirtual   #70  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//*   6   14:ifeq            39
				deserializationcontext.reportInputMismatch(((JsonDeserializer) (this)), "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", new Object[] {
					handledType().toString()
				});
		//    7   17:aload_1         
		//    8   18:aload_0         
		//    9   19:ldc1            #72  <String "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)">
		//   10   21:iconst_1        
		//   11   22:anewarray       Object[]
		//   12   25:dup             
		//   13   26:iconst_0        
		//   14   27:aload_0         
		//   15   28:invokevirtual   #78  <Method Class handledType()>
		//   16   31:invokevirtual   #82  <Method String Class.toString()>
		//   17   34:aastore         
		//   18   35:invokevirtual   #86  <Method Object DeserializationContext.reportInputMismatch(JsonDeserializer, String, Object[])>
		//   19   38:pop             
			return _nullValue;
		//   20   39:aload_0         
		//   21   40:getfield        #25  <Field Object _nullValue>
		//   22   43:areturn         
		}

		private static final long serialVersionUID = 1L;
		protected final Object _emptyValue;
		protected final Object _nullValue;
		protected final boolean _primitive;

		protected PrimitiveOrWrapperDeserializer(Class class1, Object obj, Object obj1)
		{
			super(class1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #23  <Method void StdScalarDeserializer(Class)>
			_nullValue = obj;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #25  <Field Object _nullValue>
			_emptyValue = obj1;
		//    6   10:aload_0         
		//    7   11:aload_3         
		//    8   12:putfield        #27  <Field Object _emptyValue>
			_primitive = class1.isPrimitive();
		//    9   15:aload_0         
		//   10   16:aload_1         
		//   11   17:invokevirtual   #33  <Method boolean Class.isPrimitive()>
		//   12   20:putfield        #35  <Field boolean _primitive>
		//   13   23:return          
		}
	}

	public static class ShortDeserializer extends PrimitiveOrWrapperDeserializer
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

		static final ShortDeserializer primitiveInstance;
		private static final long serialVersionUID = 1L;
		static final ShortDeserializer wrapperInstance = new ShortDeserializer(java/lang/Short, ((Short) (null)));

		static 
		{
			primitiveInstance = new ShortDeserializer(Short.TYPE, Short.valueOf((short)0));
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

		public ShortDeserializer(Class class1, Short short1)
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


	public static JsonDeserializer find(Class class1, String s)
	{
label0:
		{
			if(class1.isPrimitive())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #93  <Method boolean Class.isPrimitive()>
	//*   2    4:ifeq            95
			{
				if(class1 == Integer.TYPE)
	//*   3    7:aload_0         
	//*   4    8:getstatic       #97  <Field Class Integer.TYPE>
	//*   5   11:if_acmpne       18
					return ((JsonDeserializer) (IntegerDeserializer.primitiveInstance));
	//    6   14:getstatic       #101 <Field NumberDeserializers$IntegerDeserializer NumberDeserializers$IntegerDeserializer.primitiveInstance>
	//    7   17:areturn         
				if(class1 == Boolean.TYPE)
	//*   8   18:aload_0         
	//*   9   19:getstatic       #102 <Field Class Boolean.TYPE>
	//*  10   22:if_acmpne       29
					return ((JsonDeserializer) (BooleanDeserializer.primitiveInstance));
	//   11   25:getstatic       #105 <Field NumberDeserializers$BooleanDeserializer NumberDeserializers$BooleanDeserializer.primitiveInstance>
	//   12   28:areturn         
				if(class1 == Long.TYPE)
	//*  13   29:aload_0         
	//*  14   30:getstatic       #106 <Field Class Long.TYPE>
	//*  15   33:if_acmpne       40
					return ((JsonDeserializer) (LongDeserializer.primitiveInstance));
	//   16   36:getstatic       #109 <Field NumberDeserializers$LongDeserializer NumberDeserializers$LongDeserializer.primitiveInstance>
	//   17   39:areturn         
				if(class1 == Double.TYPE)
	//*  18   40:aload_0         
	//*  19   41:getstatic       #110 <Field Class Double.TYPE>
	//*  20   44:if_acmpne       51
					return ((JsonDeserializer) (DoubleDeserializer.primitiveInstance));
	//   21   47:getstatic       #113 <Field NumberDeserializers$DoubleDeserializer NumberDeserializers$DoubleDeserializer.primitiveInstance>
	//   22   50:areturn         
				if(class1 == Character.TYPE)
	//*  23   51:aload_0         
	//*  24   52:getstatic       #114 <Field Class Character.TYPE>
	//*  25   55:if_acmpne       62
					return ((JsonDeserializer) (CharacterDeserializer.primitiveInstance));
	//   26   58:getstatic       #117 <Field NumberDeserializers$CharacterDeserializer NumberDeserializers$CharacterDeserializer.primitiveInstance>
	//   27   61:areturn         
				if(class1 == Byte.TYPE)
	//*  28   62:aload_0         
	//*  29   63:getstatic       #118 <Field Class Byte.TYPE>
	//*  30   66:if_acmpne       73
					return ((JsonDeserializer) (ByteDeserializer.primitiveInstance));
	//   31   69:getstatic       #121 <Field NumberDeserializers$ByteDeserializer NumberDeserializers$ByteDeserializer.primitiveInstance>
	//   32   72:areturn         
				if(class1 == Short.TYPE)
	//*  33   73:aload_0         
	//*  34   74:getstatic       #122 <Field Class Short.TYPE>
	//*  35   77:if_acmpne       84
					return ((JsonDeserializer) (ShortDeserializer.primitiveInstance));
	//   36   80:getstatic       #125 <Field NumberDeserializers$ShortDeserializer NumberDeserializers$ShortDeserializer.primitiveInstance>
	//   37   83:areturn         
				if(class1 == Float.TYPE)
	//*  38   84:aload_0         
	//*  39   85:getstatic       #126 <Field Class Float.TYPE>
	//*  40   88:if_acmpne       215
					return ((JsonDeserializer) (FloatDeserializer.primitiveInstance));
	//   41   91:getstatic       #129 <Field NumberDeserializers$FloatDeserializer NumberDeserializers$FloatDeserializer.primitiveInstance>
	//   42   94:areturn         
			} else
			{
				if(!_classNames.contains(((Object) (s))))
					break label0;
	//   43   95:getstatic       #54  <Field HashSet _classNames>
	//   44   98:aload_1         
	//   45   99:invokevirtual   #132 <Method boolean HashSet.contains(Object)>
	//   46  102:ifeq            251
				if(class1 == java/lang/Integer)
	//*  47  105:aload_0         
	//*  48  106:ldc1            #66  <Class Integer>
	//*  49  108:if_acmpne       115
					return ((JsonDeserializer) (IntegerDeserializer.wrapperInstance));
	//   50  111:getstatic       #135 <Field NumberDeserializers$IntegerDeserializer NumberDeserializers$IntegerDeserializer.wrapperInstance>
	//   51  114:areturn         
				if(class1 == java/lang/Boolean)
	//*  52  115:aload_0         
	//*  53  116:ldc1            #58  <Class Boolean>
	//*  54  118:if_acmpne       125
					return ((JsonDeserializer) (BooleanDeserializer.wrapperInstance));
	//   55  121:getstatic       #137 <Field NumberDeserializers$BooleanDeserializer NumberDeserializers$BooleanDeserializer.wrapperInstance>
	//   56  124:areturn         
				if(class1 == java/lang/Long)
	//*  57  125:aload_0         
	//*  58  126:ldc1            #68  <Class Long>
	//*  59  128:if_acmpne       135
					return ((JsonDeserializer) (LongDeserializer.wrapperInstance));
	//   60  131:getstatic       #139 <Field NumberDeserializers$LongDeserializer NumberDeserializers$LongDeserializer.wrapperInstance>
	//   61  134:areturn         
				if(class1 == java/lang/Double)
	//*  62  135:aload_0         
	//*  63  136:ldc1            #72  <Class Double>
	//*  64  138:if_acmpne       145
					return ((JsonDeserializer) (DoubleDeserializer.wrapperInstance));
	//   65  141:getstatic       #141 <Field NumberDeserializers$DoubleDeserializer NumberDeserializers$DoubleDeserializer.wrapperInstance>
	//   66  144:areturn         
				if(class1 == java/lang/Character)
	//*  67  145:aload_0         
	//*  68  146:ldc1            #64  <Class Character>
	//*  69  148:if_acmpne       155
					return ((JsonDeserializer) (CharacterDeserializer.wrapperInstance));
	//   70  151:getstatic       #143 <Field NumberDeserializers$CharacterDeserializer NumberDeserializers$CharacterDeserializer.wrapperInstance>
	//   71  154:areturn         
				if(class1 == java/lang/Byte)
	//*  72  155:aload_0         
	//*  73  156:ldc1            #60  <Class Byte>
	//*  74  158:if_acmpne       165
					return ((JsonDeserializer) (ByteDeserializer.wrapperInstance));
	//   75  161:getstatic       #145 <Field NumberDeserializers$ByteDeserializer NumberDeserializers$ByteDeserializer.wrapperInstance>
	//   76  164:areturn         
				if(class1 == java/lang/Short)
	//*  77  165:aload_0         
	//*  78  166:ldc1            #62  <Class Short>
	//*  79  168:if_acmpne       175
					return ((JsonDeserializer) (ShortDeserializer.wrapperInstance));
	//   80  171:getstatic       #147 <Field NumberDeserializers$ShortDeserializer NumberDeserializers$ShortDeserializer.wrapperInstance>
	//   81  174:areturn         
				if(class1 == java/lang/Float)
	//*  82  175:aload_0         
	//*  83  176:ldc1            #70  <Class Float>
	//*  84  178:if_acmpne       185
					return ((JsonDeserializer) (FloatDeserializer.wrapperInstance));
	//   85  181:getstatic       #149 <Field NumberDeserializers$FloatDeserializer NumberDeserializers$FloatDeserializer.wrapperInstance>
	//   86  184:areturn         
				if(class1 == java/lang/Number)
	//*  87  185:aload_0         
	//*  88  186:ldc1            #74  <Class Number>
	//*  89  188:if_acmpne       195
					return ((JsonDeserializer) (NumberDeserializer.instance));
	//   90  191:getstatic       #153 <Field NumberDeserializers$NumberDeserializer NumberDeserializers$NumberDeserializer.instance>
	//   91  194:areturn         
				if(class1 == java/math/BigDecimal)
	//*  92  195:aload_0         
	//*  93  196:ldc1            #76  <Class BigDecimal>
	//*  94  198:if_acmpne       205
					return ((JsonDeserializer) (BigDecimalDeserializer.instance));
	//   95  201:getstatic       #156 <Field NumberDeserializers$BigDecimalDeserializer NumberDeserializers$BigDecimalDeserializer.instance>
	//   96  204:areturn         
				if(class1 == java/math/BigInteger)
	//*  97  205:aload_0         
	//*  98  206:ldc1            #78  <Class BigInteger>
	//*  99  208:if_acmpne       215
					return ((JsonDeserializer) (BigIntegerDeserializer.instance));
	//  100  211:getstatic       #159 <Field NumberDeserializers$BigIntegerDeserializer NumberDeserializers$BigIntegerDeserializer.instance>
	//  101  214:areturn         
			}
			s = ((String) (new StringBuilder()));
	//  102  215:new             #161 <Class StringBuilder>
	//  103  218:dup             
	//  104  219:invokespecial   #162 <Method void StringBuilder()>
	//  105  222:astore_1        
			((StringBuilder) (s)).append("Internal error: can't find deserializer for ");
	//  106  223:aload_1         
	//  107  224:ldc1            #164 <String "Internal error: can't find deserializer for ">
	//  108  226:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//  109  229:pop             
			((StringBuilder) (s)).append(class1.getName());
	//  110  230:aload_1         
	//  111  231:aload_0         
	//  112  232:invokevirtual   #82  <Method String Class.getName()>
	//  113  235:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//  114  238:pop             
			throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//  115  239:new             #170 <Class IllegalArgumentException>
	//  116  242:dup             
	//  117  243:aload_1         
	//  118  244:invokevirtual   #173 <Method String StringBuilder.toString()>
	//  119  247:invokespecial   #176 <Method void IllegalArgumentException(String)>
	//  120  250:athrow          
		}
		return null;
	//  121  251:aconst_null     
	//  122  252:areturn         
	}

	private static final HashSet _classNames;

	static 
	{
		_classNames = new HashSet();
	//    0    0:new             #49  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #52  <Method void HashSet()>
	//    3    7:putstatic       #54  <Field HashSet _classNames>
		Class aclass[] = new Class[11];
	//    4   10:bipush          11
	//    5   12:anewarray       Class[]
	//    6   15:astore_2        
		int i = 0;
	//    7   16:iconst_0        
	//    8   17:istore_0        
		aclass[0] = java/lang/Boolean;
	//    9   18:aload_2         
	//   10   19:iconst_0        
	//   11   20:ldc1            #58  <Class Boolean>
	//   12   22:aastore         
		aclass[1] = java/lang/Byte;
	//   13   23:aload_2         
	//   14   24:iconst_1        
	//   15   25:ldc1            #60  <Class Byte>
	//   16   27:aastore         
		aclass[2] = java/lang/Short;
	//   17   28:aload_2         
	//   18   29:iconst_2        
	//   19   30:ldc1            #62  <Class Short>
	//   20   32:aastore         
		aclass[3] = java/lang/Character;
	//   21   33:aload_2         
	//   22   34:iconst_3        
	//   23   35:ldc1            #64  <Class Character>
	//   24   37:aastore         
		aclass[4] = java/lang/Integer;
	//   25   38:aload_2         
	//   26   39:iconst_4        
	//   27   40:ldc1            #66  <Class Integer>
	//   28   42:aastore         
		aclass[5] = java/lang/Long;
	//   29   43:aload_2         
	//   30   44:iconst_5        
	//   31   45:ldc1            #68  <Class Long>
	//   32   47:aastore         
		aclass[6] = java/lang/Float;
	//   33   48:aload_2         
	//   34   49:bipush          6
	//   35   51:ldc1            #70  <Class Float>
	//   36   53:aastore         
		aclass[7] = java/lang/Double;
	//   37   54:aload_2         
	//   38   55:bipush          7
	//   39   57:ldc1            #72  <Class Double>
	//   40   59:aastore         
		aclass[8] = java/lang/Number;
	//   41   60:aload_2         
	//   42   61:bipush          8
	//   43   63:ldc1            #74  <Class Number>
	//   44   65:aastore         
		aclass[9] = java/math/BigDecimal;
	//   45   66:aload_2         
	//   46   67:bipush          9
	//   47   69:ldc1            #76  <Class BigDecimal>
	//   48   71:aastore         
		aclass[10] = java/math/BigInteger;
	//   49   72:aload_2         
	//   50   73:bipush          10
	//   51   75:ldc1            #78  <Class BigInteger>
	//   52   77:aastore         
		for(int j = aclass.length; i < j; i++)
	//*  53   78:aload_2         
	//*  54   79:arraylength     
	//*  55   80:istore_1        
	//*  56   81:iload_0         
	//*  57   82:iload_1         
	//*  58   83:icmpge          108
		{
			Class class1 = aclass[i];
	//   59   86:aload_2         
	//   60   87:iload_0         
	//   61   88:aaload          
	//   62   89:astore_3        
			_classNames.add(((Object) (class1.getName())));
	//   63   90:getstatic       #54  <Field HashSet _classNames>
	//   64   93:aload_3         
	//   65   94:invokevirtual   #82  <Method String Class.getName()>
	//   66   97:invokevirtual   #86  <Method boolean HashSet.add(Object)>
	//   67  100:pop             
		}

	//   68  101:iload_0         
	//   69  102:iconst_1        
	//   70  103:iadd            
	//   71  104:istore_0        
	//*  72  105:goto            81
	//*  73  108:return          
	}
}
