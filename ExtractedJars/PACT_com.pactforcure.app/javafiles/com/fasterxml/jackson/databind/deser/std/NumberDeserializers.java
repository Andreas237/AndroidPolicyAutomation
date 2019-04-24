// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
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
			jsonparser.getCurrentTokenId();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #42  <Method int JsonParser.getCurrentTokenId()>
			JVM INSTR tableswitch 3 8: default 44
		//		               3 105
		//		               4 44
		//		               5 44
		//		               6 64
		//		               7 57
		//		               8 57;
		//    2    4:tableswitch     3 8: default 44
		//		               3 105
		//		               4 44
		//		               5 44
		//		               6 64
		//		               7 57
		//		               8 57
			   goto _L1 _L2 _L1 _L1 _L3 _L4 _L4
_L1:
			throw deserializationcontext.mappingException(_valueClass, jsonparser.getCurrentToken());
		//    3   44:aload_2         
		//    4   45:aload_0         
		//    5   46:getfield        #46  <Field Class _valueClass>
		//    6   49:aload_1         
		//    7   50:invokevirtual   #50  <Method JsonToken JsonParser.getCurrentToken()>
		//    8   53:invokevirtual   #56  <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
		//    9   56:athrow          
_L4:
			Object obj = ((Object) (jsonparser.getDecimalValue()));
		//   10   57:aload_1         
		//   11   58:invokevirtual   #60  <Method BigDecimal JsonParser.getDecimalValue()>
		//   12   61:astore_3        
_L6:
			return ((BigDecimal) (obj));
		//   13   62:aload_3         
		//   14   63:areturn         
_L3:
			jsonparser = ((JsonParser) (jsonparser.getText().trim()));
		//   15   64:aload_1         
		//   16   65:invokevirtual   #64  <Method String JsonParser.getText()>
		//   17   68:invokevirtual   #69  <Method String String.trim()>
		//   18   71:astore_1        
			if(((String) (jsonparser)).length() == 0)
		//*  19   72:aload_1         
		//*  20   73:invokevirtual   #72  <Method int String.length()>
		//*  21   76:ifne            81
				return null;
		//   22   79:aconst_null     
		//   23   80:areturn         
			try
			{
				obj = ((Object) (new BigDecimal(((String) (jsonparser)))));
		//   24   81:new             #21  <Class BigDecimal>
		//   25   84:dup             
		//   26   85:aload_1         
		//   27   86:invokespecial   #75  <Method void BigDecimal(String)>
		//   28   89:astore_3        
			}
		//*  29   90:aload_3         
		//*  30   91:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
		//*  31   92:astore_3        
			{
				throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, "not a valid representation");
		//   32   93:aload_2         
		//   33   94:aload_1         
		//   34   95:aload_0         
		//   35   96:getfield        #46  <Field Class _valueClass>
		//   36   99:ldc1            #77  <String "not a valid representation">
		//   37  101:invokevirtual   #81  <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
		//   38  104:athrow          
			}
			return ((BigDecimal) (obj));
_L2:
			if(!deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
				continue; /* Loop/switch isn't completed */
		//   39  105:aload_2         
		//   40  106:getstatic       #87  <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
		//   41  109:invokevirtual   #91  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//   42  112:ifeq            44
			jsonparser.nextToken();
		//   43  115:aload_1         
		//   44  116:invokevirtual   #94  <Method JsonToken JsonParser.nextToken()>
		//   45  119:pop             
			obj = ((Object) (deserialize(jsonparser, deserializationcontext)));
		//   46  120:aload_0         
		//   47  121:aload_1         
		//   48  122:aload_2         
		//   49  123:invokevirtual   #33  <Method BigDecimal deserialize(JsonParser, DeserializationContext)>
		//   50  126:astore_3        
			if(jsonparser.nextToken() != JsonToken.END_ARRAY)
		//*  51  127:aload_1         
		//*  52  128:invokevirtual   #94  <Method JsonToken JsonParser.nextToken()>
		//*  53  131:getstatic       #100 <Field JsonToken JsonToken.END_ARRAY>
		//*  54  134:if_acmpeq       62
				throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'BigDecimal' value but there was more than a single value in the array");
		//   55  137:aload_2         
		//   56  138:aload_1         
		//   57  139:getstatic       #100 <Field JsonToken JsonToken.END_ARRAY>
		//   58  142:ldc1            #102 <String "Attempted to unwrap single value array for single 'BigDecimal' value but there was more than a single value in the array">
		//   59  144:invokevirtual   #106 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
		//   60  147:athrow          
			if(true) goto _L6; else goto _L5
_L5:
			if(true) goto _L1; else goto _L7
_L7:
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
			jsonparser.getCurrentTokenId();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #42  <Method int JsonParser.getCurrentTokenId()>
			JVM INSTR tableswitch 3 8: default 44
		//		               3 132
		//		               4 44
		//		               5 44
		//		               6 175
		//		               7 57
		//		               8 106;
		//    2    4:tableswitch     3 8: default 44
		//		               3 132
		//		               4 44
		//		               5 44
		//		               6 175
		//		               7 57
		//		               8 106
			   goto _L1 _L2 _L1 _L1 _L3 _L4 _L5
_L7:
			throw deserializationcontext.mappingException(_valueClass, jsonparser.getCurrentToken());
		//    3   44:aload_2         
		//    4   45:aload_0         
		//    5   46:getfield        #46  <Field Class _valueClass>
		//    6   49:aload_1         
		//    7   50:invokevirtual   #50  <Method JsonToken JsonParser.getCurrentToken()>
		//    8   53:invokevirtual   #56  <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
		//    9   56:athrow          
_L4:
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
				//*  20   43:astore_0        
				//*  21   44:return          
				//*  22   45:astore_0        
				//*  23   46:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   24   49:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.LONG.ordinal()] = 2;
					}
					catch(NoSuchFieldError nosuchfielderror1) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER.ordinal()] = 3;
					}
					catch(NoSuchFieldError nosuchfielderror)
					{
						return;
					}
				//*  25   50:goto            20
				}
			}

			BigInteger biginteger;
			switch(_cls1..SwitchMap.com.fasterxml.jackson.core.JsonParser.NumberType[jsonparser.getNumberType().ordinal()])
		//*  10   57:getstatic       #62  <Field int[] NumberDeserializers$1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
		//*  11   60:aload_1         
		//*  12   61:invokevirtual   #66  <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
		//*  13   64:invokevirtual   #71  <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
		//*  14   67:iaload          
			{
			default:
				break;

		//*  15   68:tableswitch     1 3: default 96
		//		               1 99
		//		               2 99
		//		               3 99
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
		//   55  171:invokevirtual   #118 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
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
		//   79  212:invokevirtual   #139 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
		//   80  215:athrow          
			}
			return biginteger1;
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

		public Boolean deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return _parseBoolean(jsonparser, deserializationcontext);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #49  <Method Boolean _parseBoolean(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #55  <Method Boolean deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public Boolean deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
			throws IOException
		{
			return _parseBoolean(jsonparser, deserializationcontext);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #49  <Method Boolean _parseBoolean(JsonParser, DeserializationContext)>
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
		//    4    4:invokevirtual   #60  <Method Boolean deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
		//    5    7:areturn         
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
			super(class1, ((Object) (boolean1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object)>
		//    4    6:return          
		}
	}

	public static class ByteDeserializer extends PrimitiveOrWrapperDeserializer
	{

		public Byte deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return _parseByte(jsonparser, deserializationcontext);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #49  <Method Byte _parseByte(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #55  <Method Byte deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
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
			super(class1, ((Object) (byte1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object)>
		//    4    6:return          
		}
	}

	public static class CharacterDeserializer extends PrimitiveOrWrapperDeserializer
	{

		public Character deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			jsonparser.getCurrentTokenId();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #52  <Method int JsonParser.getCurrentTokenId()>
			JVM INSTR tableswitch 3 7: default 40
		//		               3 116
		//		               4 40
		//		               5 40
		//		               6 74
		//		               7 53;
		//    2    4:tableswitch     3 7: default 40
		//		               3 116
		//		               4 40
		//		               5 40
		//		               6 74
		//		               7 53
			   goto _L1 _L2 _L1 _L1 _L3 _L4
_L1:
			int i;
			throw deserializationcontext.mappingException(_valueClass, jsonparser.getCurrentToken());
		//    3   40:aload_2         
		//    4   41:aload_0         
		//    5   42:getfield        #55  <Field Class _valueClass>
		//    6   45:aload_1         
		//    7   46:invokevirtual   #59  <Method JsonToken JsonParser.getCurrentToken()>
		//    8   49:invokevirtual   #65  <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
		//    9   52:athrow          
		//*  10   53:aload_1         
		//*  11   54:invokevirtual   #68  <Method int JsonParser.getIntValue()>
		//*  12   57:istore_3        
_L4:
			if((i = jsonparser.getIntValue()) >= 0 && i <= 65535)
		//*  13   58:iload_3         
		//*  14   59:iflt            40
		//*  15   62:iload_3         
		//*  16   63:ldc1            #69  <Int 65535>
		//*  17   65:icmpgt          40
				return Character.valueOf((char)i);
		//   18   68:iload_3         
		//   19   69:int2char        
		//   20   70:invokestatic    #28  <Method Character Character.valueOf(char)>
		//   21   73:areturn         
			continue; /* Loop/switch isn't completed */
_L3:
			String s = jsonparser.getText();
		//   22   74:aload_1         
		//   23   75:invokevirtual   #73  <Method String JsonParser.getText()>
		//   24   78:astore          4
			if(s.length() == 1)
		//*  25   80:aload           4
		//*  26   82:invokevirtual   #78  <Method int String.length()>
		//*  27   85:iconst_1        
		//*  28   86:icmpne          99
				return Character.valueOf(s.charAt(0));
		//   29   89:aload           4
		//   30   91:iconst_0        
		//   31   92:invokevirtual   #82  <Method char String.charAt(int)>
		//   32   95:invokestatic    #28  <Method Character Character.valueOf(char)>
		//   33   98:areturn         
			if(s.length() == 0)
		//*  34   99:aload           4
		//*  35  101:invokevirtual   #78  <Method int String.length()>
		//*  36  104:ifne            40
				return (Character)getEmptyValue(deserializationcontext);
		//   37  107:aload_0         
		//   38  108:aload_2         
		//   39  109:invokevirtual   #86  <Method Object getEmptyValue(DeserializationContext)>
		//   40  112:checkcast       #20  <Class Character>
		//   41  115:areturn         
			continue; /* Loop/switch isn't completed */
_L2:
			if(deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
		//*  42  116:aload_2         
		//*  43  117:getstatic       #92  <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
		//*  44  120:invokevirtual   #96  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//*  45  123:ifeq            40
			{
				jsonparser.nextToken();
		//   46  126:aload_1         
		//   47  127:invokevirtual   #99  <Method JsonToken JsonParser.nextToken()>
		//   48  130:pop             
				Character character = deserialize(jsonparser, deserializationcontext);
		//   49  131:aload_0         
		//   50  132:aload_1         
		//   51  133:aload_2         
		//   52  134:invokevirtual   #101 <Method Character deserialize(JsonParser, DeserializationContext)>
		//   53  137:astore          4
				if(jsonparser.nextToken() != JsonToken.END_ARRAY)
		//*  54  139:aload_1         
		//*  55  140:invokevirtual   #99  <Method JsonToken JsonParser.nextToken()>
		//*  56  143:getstatic       #107 <Field JsonToken JsonToken.END_ARRAY>
		//*  57  146:if_acmpeq       188
					throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, (new StringBuilder()).append("Attempted to unwrap single value array for single '").append(_valueClass.getName()).append("' value but there was more than a single value in the array").toString());
		//   58  149:aload_2         
		//   59  150:aload_1         
		//   60  151:getstatic       #107 <Field JsonToken JsonToken.END_ARRAY>
		//   61  154:new             #109 <Class StringBuilder>
		//   62  157:dup             
		//   63  158:invokespecial   #111 <Method void StringBuilder()>
		//   64  161:ldc1            #113 <String "Attempted to unwrap single value array for single '">
		//   65  163:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
		//   66  166:aload_0         
		//   67  167:getfield        #55  <Field Class _valueClass>
		//   68  170:invokevirtual   #122 <Method String Class.getName()>
		//   69  173:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
		//   70  176:ldc1            #124 <String "' value but there was more than a single value in the array">
		//   71  178:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
		//   72  181:invokevirtual   #127 <Method String StringBuilder.toString()>
		//   73  184:invokevirtual   #131 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
		//   74  187:athrow          
				else
					return character;
		//   75  188:aload           4
		//   76  190:areturn         
			}
			if(true) goto _L1; else goto _L5
_L5:
		}

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #101 <Method Character deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
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
			super(class1, ((Object) (character)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object)>
		//    4    6:return          
		}
	}

	public static class DoubleDeserializer extends PrimitiveOrWrapperDeserializer
	{

		public Double deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return _parseDouble(jsonparser, deserializationcontext);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #49  <Method Double _parseDouble(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #55  <Method Double deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public Double deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
			throws IOException
		{
			return _parseDouble(jsonparser, deserializationcontext);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #49  <Method Double _parseDouble(JsonParser, DeserializationContext)>
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
		//    4    4:invokevirtual   #60  <Method Double deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
		//    5    7:areturn         
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
			super(class1, ((Object) (double1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object)>
		//    4    6:return          
		}
	}

	public static class FloatDeserializer extends PrimitiveOrWrapperDeserializer
	{

		public Float deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return _parseFloat(jsonparser, deserializationcontext);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #49  <Method Float _parseFloat(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #55  <Method Float deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
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
			super(class1, ((Object) (float1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object)>
		//    4    6:return          
		}
	}

	public static final class IntegerDeserializer extends PrimitiveOrWrapperDeserializer
	{

		public Integer deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			if(jsonparser.hasToken(JsonToken.VALUE_NUMBER_INT))
		//*   0    0:aload_1         
		//*   1    1:getstatic       #52  <Field JsonToken JsonToken.VALUE_NUMBER_INT>
		//*   2    4:invokevirtual   #58  <Method boolean JsonParser.hasToken(JsonToken)>
		//*   3    7:ifeq            18
				return Integer.valueOf(jsonparser.getIntValue());
		//    4   10:aload_1         
		//    5   11:invokevirtual   #62  <Method int JsonParser.getIntValue()>
		//    6   14:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//    7   17:areturn         
			else
				return _parseInteger(jsonparser, deserializationcontext);
		//    8   18:aload_0         
		//    9   19:aload_1         
		//   10   20:aload_2         
		//   11   21:invokevirtual   #65  <Method Integer _parseInteger(JsonParser, DeserializationContext)>
		//   12   24:areturn         
		}

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #71  <Method Integer deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public Integer deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
			throws IOException
		{
			if(jsonparser.hasToken(JsonToken.VALUE_NUMBER_INT))
		//*   0    0:aload_1         
		//*   1    1:getstatic       #52  <Field JsonToken JsonToken.VALUE_NUMBER_INT>
		//*   2    4:invokevirtual   #58  <Method boolean JsonParser.hasToken(JsonToken)>
		//*   3    7:ifeq            18
				return Integer.valueOf(jsonparser.getIntValue());
		//    4   10:aload_1         
		//    5   11:invokevirtual   #62  <Method int JsonParser.getIntValue()>
		//    6   14:invokestatic    #28  <Method Integer Integer.valueOf(int)>
		//    7   17:areturn         
			else
				return _parseInteger(jsonparser, deserializationcontext);
		//    8   18:aload_0         
		//    9   19:aload_1         
		//   10   20:aload_2         
		//   11   21:invokevirtual   #65  <Method Integer _parseInteger(JsonParser, DeserializationContext)>
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
		//    4    4:invokevirtual   #76  <Method Integer deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
		//    5    7:areturn         
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
			super(class1, ((Object) (integer)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object)>
		//    4    6:return          
		}
	}

	public static final class LongDeserializer extends PrimitiveOrWrapperDeserializer
	{

		public Long deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			if(jsonparser.hasToken(JsonToken.VALUE_NUMBER_INT))
		//*   0    0:aload_1         
		//*   1    1:getstatic       #52  <Field JsonToken JsonToken.VALUE_NUMBER_INT>
		//*   2    4:invokevirtual   #58  <Method boolean JsonParser.hasToken(JsonToken)>
		//*   3    7:ifeq            18
				return Long.valueOf(jsonparser.getLongValue());
		//    4   10:aload_1         
		//    5   11:invokevirtual   #62  <Method long JsonParser.getLongValue()>
		//    6   14:invokestatic    #28  <Method Long Long.valueOf(long)>
		//    7   17:areturn         
			else
				return _parseLong(jsonparser, deserializationcontext);
		//    8   18:aload_0         
		//    9   19:aload_1         
		//   10   20:aload_2         
		//   11   21:invokevirtual   #65  <Method Long _parseLong(JsonParser, DeserializationContext)>
		//   12   24:areturn         
		}

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #71  <Method Long deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
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
			super(class1, ((Object) (long1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object)>
		//    4    6:return          
		}
	}

	public static class NumberDeserializer extends StdScalarDeserializer
	{

		public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			jsonparser.getCurrentTokenId();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #36  <Method int JsonParser.getCurrentTokenId()>
			JVM INSTR tableswitch 3 8: default 44
		//		               3 301
		//		               4 44
		//		               5 44
		//		               6 106
		//		               7 57
		//		               8 83;
		//    2    4:tableswitch     3 8: default 44
		//		               3 301
		//		               4 44
		//		               5 44
		//		               6 106
		//		               7 57
		//		               8 83
			   goto _L1 _L2 _L1 _L1 _L3 _L4 _L5
_L1:
			throw deserializationcontext.mappingException(_valueClass, jsonparser.getCurrentToken());
		//    3   44:aload_2         
		//    4   45:aload_0         
		//    5   46:getfield        #40  <Field Class _valueClass>
		//    6   49:aload_1         
		//    7   50:invokevirtual   #44  <Method JsonToken JsonParser.getCurrentToken()>
		//    8   53:invokevirtual   #50  <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
		//    9   56:athrow          
_L4:
			if(!deserializationcontext.hasSomeOfFeatures(F_MASK_INT_COERCIONS)) goto _L7; else goto _L6
		//   10   57:aload_2         
		//   11   58:getstatic       #54  <Field int F_MASK_INT_COERCIONS>
		//   12   61:invokevirtual   #58  <Method boolean DeserializationContext.hasSomeOfFeatures(int)>
		//   13   64:ifeq            78
_L6:
			Object obj = _coerceIntegral(jsonparser, deserializationcontext);
		//   14   67:aload_0         
		//   15   68:aload_1         
		//   16   69:aload_2         
		//   17   70:invokevirtual   #61  <Method Object _coerceIntegral(JsonParser, DeserializationContext)>
		//   18   73:astore          5
_L9:
			return obj;
		//   19   75:aload           5
		//   20   77:areturn         
_L7:
			return ((Object) (jsonparser.getNumberValue()));
		//   21   78:aload_1         
		//   22   79:invokevirtual   #65  <Method Number JsonParser.getNumberValue()>
		//   23   82:areturn         
_L5:
			if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
		//*  24   83:aload_2         
		//*  25   84:getstatic       #71  <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
		//*  26   87:invokevirtual   #75  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//*  27   90:ifeq            98
				return ((Object) (jsonparser.getDecimalValue()));
		//   28   93:aload_1         
		//   29   94:invokevirtual   #79  <Method BigDecimal JsonParser.getDecimalValue()>
		//   30   97:areturn         
			else
				return ((Object) (Double.valueOf(jsonparser.getDoubleValue())));
		//   31   98:aload_1         
		//   32   99:invokevirtual   #83  <Method double JsonParser.getDoubleValue()>
		//   33  102:invokestatic    #89  <Method Double Double.valueOf(double)>
		//   34  105:areturn         
_L3:
			jsonparser = ((JsonParser) (jsonparser.getText().trim()));
		//   35  106:aload_1         
		//   36  107:invokevirtual   #93  <Method String JsonParser.getText()>
		//   37  110:invokevirtual   #98  <Method String String.trim()>
		//   38  113:astore_1        
			if(((String) (jsonparser)).length() == 0)
		//*  39  114:aload_1         
		//*  40  115:invokevirtual   #101 <Method int String.length()>
		//*  41  118:ifne            127
				return getEmptyValue(deserializationcontext);
		//   42  121:aload_0         
		//   43  122:aload_2         
		//   44  123:invokevirtual   #105 <Method Object getEmptyValue(DeserializationContext)>
		//   45  126:areturn         
			if(_hasTextualNull(((String) (jsonparser))))
		//*  46  127:aload_0         
		//*  47  128:aload_1         
		//*  48  129:invokevirtual   #109 <Method boolean _hasTextualNull(String)>
		//*  49  132:ifeq            141
				return getNullValue(deserializationcontext);
		//   50  135:aload_0         
		//   51  136:aload_2         
		//   52  137:invokevirtual   #112 <Method Object getNullValue(DeserializationContext)>
		//   53  140:areturn         
			if(_isPosInf(((String) (jsonparser))))
		//*  54  141:aload_0         
		//*  55  142:aload_1         
		//*  56  143:invokevirtual   #115 <Method boolean _isPosInf(String)>
		//*  57  146:ifeq            156
				return ((Object) (Double.valueOf((1.0D / 0.0D))));
		//   58  149:ldc2w           #116 <Double (1.0D / 0.0D)>
		//   59  152:invokestatic    #89  <Method Double Double.valueOf(double)>
		//   60  155:areturn         
			if(_isNegInf(((String) (jsonparser))))
		//*  61  156:aload_0         
		//*  62  157:aload_1         
		//*  63  158:invokevirtual   #120 <Method boolean _isNegInf(String)>
		//*  64  161:ifeq            171
				return ((Object) (Double.valueOf((-1.0D / 0.0D))));
		//   65  164:ldc2w           #121 <Double (-1.0D / 0.0D)>
		//   66  167:invokestatic    #89  <Method Double Double.valueOf(double)>
		//   67  170:areturn         
			if(_isNaN(((String) (jsonparser))))
		//*  68  171:aload_0         
		//*  69  172:aload_1         
		//*  70  173:invokevirtual   #125 <Method boolean _isNaN(String)>
		//*  71  176:ifeq            186
				return ((Object) (Double.valueOf((0.0D / 0.0D))));
		//   72  179:ldc2w           #126 <Double (0.0D / 0.0D)>
		//   73  182:invokestatic    #89  <Method Double Double.valueOf(double)>
		//   74  185:areturn         
			if(_isIntNumber(((String) (jsonparser))))
				break MISSING_BLOCK_LABEL_240;
		//   75  186:aload_0         
		//   76  187:aload_1         
		//   77  188:invokevirtual   #130 <Method boolean _isIntNumber(String)>
		//   78  191:ifne            240
			if(!deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
				break MISSING_BLOCK_LABEL_231;
		//   79  194:aload_2         
		//   80  195:getstatic       #71  <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
		//   81  198:invokevirtual   #75  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//   82  201:ifeq            231
			obj = ((Object) (new BigDecimal(((String) (jsonparser)))));
		//   83  204:new             #132 <Class BigDecimal>
		//   84  207:dup             
		//   85  208:aload_1         
		//   86  209:invokespecial   #135 <Method void BigDecimal(String)>
		//   87  212:astore          5
			return obj;
		//   88  214:aload           5
		//   89  216:areturn         
		//*  90  217:astore          5
		//*  91  219:aload_2         
		//*  92  220:aload_1         
		//*  93  221:aload_0         
		//*  94  222:getfield        #40  <Field Class _valueClass>
		//*  95  225:ldc1            #137 <String "not a valid number">
		//*  96  227:invokevirtual   #141 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
		//*  97  230:athrow          
			return ((Object) (new Double(((String) (jsonparser)))));
		//   98  231:new             #85  <Class Double>
		//   99  234:dup             
		//  100  235:aload_1         
		//  101  236:invokespecial   #142 <Method void Double(String)>
		//  102  239:areturn         
			long l;
			if(deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS))
		//* 103  240:aload_2         
		//* 104  241:getstatic       #145 <Field DeserializationFeature DeserializationFeature.USE_BIG_INTEGER_FOR_INTS>
		//* 105  244:invokevirtual   #75  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//* 106  247:ifeq            259
				return ((Object) (new BigInteger(((String) (jsonparser)))));
		//  107  250:new             #147 <Class BigInteger>
		//  108  253:dup             
		//  109  254:aload_1         
		//  110  255:invokespecial   #148 <Method void BigInteger(String)>
		//  111  258:areturn         
			l = Long.parseLong(((String) (jsonparser)));
		//  112  259:aload_1         
		//  113  260:invokestatic    #154 <Method long Long.parseLong(String)>
		//  114  263:lstore_3        
			if(!deserializationcontext.isEnabled(DeserializationFeature.USE_LONG_FOR_INTS) && l <= 0x7fffffffL && l >= 0x80000000L)
		//* 115  264:aload_2         
		//* 116  265:getstatic       #157 <Field DeserializationFeature DeserializationFeature.USE_LONG_FOR_INTS>
		//* 117  268:invokevirtual   #75  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//* 118  271:ifne            296
		//* 119  274:lload_3         
		//* 120  275:ldc2w           #158 <Long 0x7fffffffL>
		//* 121  278:lcmp            
		//* 122  279:ifgt            296
		//* 123  282:lload_3         
		//* 124  283:ldc2w           #160 <Long 0x80000000L>
		//* 125  286:lcmp            
		//* 126  287:iflt            296
				try
				{
					return ((Object) (Integer.valueOf((int)l)));
		//  127  290:lload_3         
		//  128  291:l2i             
		//  129  292:invokestatic    #166 <Method Integer Integer.valueOf(int)>
		//  130  295:areturn         
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
				{
					throw deserializationcontext.weirdStringException(((String) (jsonparser)), _valueClass, "not a valid number");
				}
			else
				return ((Object) (Long.valueOf(l)));
		//  131  296:lload_3         
		//  132  297:invokestatic    #169 <Method Long Long.valueOf(long)>
		//  133  300:areturn         
_L2:
			if(!deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
				continue; /* Loop/switch isn't completed */
		//  134  301:aload_2         
		//  135  302:getstatic       #172 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
		//  136  305:invokevirtual   #75  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//  137  308:ifeq            44
			jsonparser.nextToken();
		//  138  311:aload_1         
		//  139  312:invokevirtual   #175 <Method JsonToken JsonParser.nextToken()>
		//  140  315:pop             
			obj = deserialize(jsonparser, deserializationcontext);
		//  141  316:aload_0         
		//  142  317:aload_1         
		//  143  318:aload_2         
		//  144  319:invokevirtual   #177 <Method Object deserialize(JsonParser, DeserializationContext)>
		//  145  322:astore          5
			if(jsonparser.nextToken() != JsonToken.END_ARRAY)
		//* 146  324:aload_1         
		//* 147  325:invokevirtual   #175 <Method JsonToken JsonParser.nextToken()>
		//* 148  328:getstatic       #183 <Field JsonToken JsonToken.END_ARRAY>
		//* 149  331:if_acmpeq       75
				throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, (new StringBuilder()).append("Attempted to unwrap single value array for single '").append(_valueClass.getName()).append("' value but there was more than a single value in the array").toString());
		//  150  334:aload_2         
		//  151  335:aload_1         
		//  152  336:getstatic       #183 <Field JsonToken JsonToken.END_ARRAY>
		//  153  339:new             #185 <Class StringBuilder>
		//  154  342:dup             
		//  155  343:invokespecial   #186 <Method void StringBuilder()>
		//  156  346:ldc1            #188 <String "Attempted to unwrap single value array for single '">
		//  157  348:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
		//  158  351:aload_0         
		//  159  352:getfield        #40  <Field Class _valueClass>
		//  160  355:invokevirtual   #197 <Method String Class.getName()>
		//  161  358:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
		//  162  361:ldc1            #199 <String "' value but there was more than a single value in the array">
		//  163  363:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
		//  164  366:invokevirtual   #202 <Method String StringBuilder.toString()>
		//  165  369:invokevirtual   #206 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
		//  166  372:athrow          
			if(true) goto _L9; else goto _L8
_L8:
			if(true) goto _L1; else goto _L10
_L10:
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
		//    6   35:invokevirtual   #214 <Method Object TypeDeserializer.deserializeTypedFromScalar(JsonParser, DeserializationContext)>
		//    7   38:areturn         

			case 6: // '\006'
			case 7: // '\007'
			case 8: // '\b'
				return deserialize(jsonparser, deserializationcontext);
		//    8   39:aload_0         
		//    9   40:aload_1         
		//   10   41:aload_2         
		//   11   42:invokevirtual   #177 <Method Object deserialize(JsonParser, DeserializationContext)>
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
			if(_primitive && deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES))
		//*   0    0:aload_0         
		//*   1    1:getfield        #32  <Field boolean _primitive>
		//*   2    4:ifeq            38
		//*   3    7:aload_1         
		//*   4    8:getstatic       #45  <Field DeserializationFeature DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES>
		//*   5   11:invokevirtual   #51  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//*   6   14:ifeq            38
				throw deserializationcontext.mappingException("Can not map Empty String as null into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", new Object[] {
					handledType().toString()
				});
		//    7   17:aload_1         
		//    8   18:ldc1            #53  <String "Can not map Empty String as null into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)">
		//    9   20:iconst_1        
		//   10   21:anewarray       Object[]
		//   11   24:dup             
		//   12   25:iconst_0        
		//   13   26:aload_0         
		//   14   27:invokevirtual   #59  <Method Class handledType()>
		//   15   30:invokevirtual   #63  <Method String Class.toString()>
		//   16   33:aastore         
		//   17   34:invokevirtual   #67  <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
		//   18   37:athrow          
			else
				return _nullValue;
		//   19   38:aload_0         
		//   20   39:getfield        #24  <Field Object _nullValue>
		//   21   42:areturn         
		}

		public final Object getNullValue()
		{
			return _nullValue;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Object _nullValue>
		//    2    4:areturn         
		}

		public final Object getNullValue(DeserializationContext deserializationcontext)
			throws JsonMappingException
		{
			if(_primitive && deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES))
		//*   0    0:aload_0         
		//*   1    1:getfield        #32  <Field boolean _primitive>
		//*   2    4:ifeq            38
		//*   3    7:aload_1         
		//*   4    8:getstatic       #45  <Field DeserializationFeature DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES>
		//*   5   11:invokevirtual   #51  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
		//*   6   14:ifeq            38
				throw deserializationcontext.mappingException("Can not map JSON null into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", new Object[] {
					handledType().toString()
				});
		//    7   17:aload_1         
		//    8   18:ldc1            #76  <String "Can not map JSON null into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)">
		//    9   20:iconst_1        
		//   10   21:anewarray       Object[]
		//   11   24:dup             
		//   12   25:iconst_0        
		//   13   26:aload_0         
		//   14   27:invokevirtual   #59  <Method Class handledType()>
		//   15   30:invokevirtual   #63  <Method String Class.toString()>
		//   16   33:aastore         
		//   17   34:invokevirtual   #67  <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
		//   18   37:athrow          
			else
				return _nullValue;
		//   19   38:aload_0         
		//   20   39:getfield        #24  <Field Object _nullValue>
		//   21   42:areturn         
		}

		private static final long serialVersionUID = 1L;
		protected final Object _nullValue;
		protected final boolean _primitive;

		protected PrimitiveOrWrapperDeserializer(Class class1, Object obj)
		{
			super(class1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #22  <Method void StdScalarDeserializer(Class)>
			_nullValue = obj;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #24  <Field Object _nullValue>
			_primitive = class1.isPrimitive();
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:invokevirtual   #30  <Method boolean Class.isPrimitive()>
		//    9   15:putfield        #32  <Field boolean _primitive>
		//   10   18:return          
		}
	}

	public static class ShortDeserializer extends PrimitiveOrWrapperDeserializer
	{

		public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #51  <Method Short deserialize(JsonParser, DeserializationContext)>
		//    4    6:areturn         
		}

		public Short deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			return _parseShort(jsonparser, deserializationcontext);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #55  <Method Short _parseShort(JsonParser, DeserializationContext)>
		//    4    6:areturn         
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
			super(class1, ((Object) (short1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object)>
		//    4    6:return          
		}
	}


	public NumberDeserializers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method void Object()>
	//    2    4:return          
	}

	public static JsonDeserializer find(Class class1, String s)
	{
		if(class1.isPrimitive())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #94  <Method boolean Class.isPrimitive()>
	//*   2    4:ifeq            95
		{
			if(class1 == Integer.TYPE)
	//*   3    7:aload_0         
	//*   4    8:getstatic       #98  <Field Class Integer.TYPE>
	//*   5   11:if_acmpne       18
				return ((JsonDeserializer) (IntegerDeserializer.primitiveInstance));
	//    6   14:getstatic       #102 <Field NumberDeserializers$IntegerDeserializer NumberDeserializers$IntegerDeserializer.primitiveInstance>
	//    7   17:areturn         
			if(class1 == Boolean.TYPE)
	//*   8   18:aload_0         
	//*   9   19:getstatic       #103 <Field Class Boolean.TYPE>
	//*  10   22:if_acmpne       29
				return ((JsonDeserializer) (BooleanDeserializer.primitiveInstance));
	//   11   25:getstatic       #106 <Field NumberDeserializers$BooleanDeserializer NumberDeserializers$BooleanDeserializer.primitiveInstance>
	//   12   28:areturn         
			if(class1 == Long.TYPE)
	//*  13   29:aload_0         
	//*  14   30:getstatic       #107 <Field Class Long.TYPE>
	//*  15   33:if_acmpne       40
				return ((JsonDeserializer) (LongDeserializer.primitiveInstance));
	//   16   36:getstatic       #110 <Field NumberDeserializers$LongDeserializer NumberDeserializers$LongDeserializer.primitiveInstance>
	//   17   39:areturn         
			if(class1 == Double.TYPE)
	//*  18   40:aload_0         
	//*  19   41:getstatic       #111 <Field Class Double.TYPE>
	//*  20   44:if_acmpne       51
				return ((JsonDeserializer) (DoubleDeserializer.primitiveInstance));
	//   21   47:getstatic       #114 <Field NumberDeserializers$DoubleDeserializer NumberDeserializers$DoubleDeserializer.primitiveInstance>
	//   22   50:areturn         
			if(class1 == Character.TYPE)
	//*  23   51:aload_0         
	//*  24   52:getstatic       #115 <Field Class Character.TYPE>
	//*  25   55:if_acmpne       62
				return ((JsonDeserializer) (CharacterDeserializer.primitiveInstance));
	//   26   58:getstatic       #118 <Field NumberDeserializers$CharacterDeserializer NumberDeserializers$CharacterDeserializer.primitiveInstance>
	//   27   61:areturn         
			if(class1 == Byte.TYPE)
	//*  28   62:aload_0         
	//*  29   63:getstatic       #119 <Field Class Byte.TYPE>
	//*  30   66:if_acmpne       73
				return ((JsonDeserializer) (ByteDeserializer.primitiveInstance));
	//   31   69:getstatic       #122 <Field NumberDeserializers$ByteDeserializer NumberDeserializers$ByteDeserializer.primitiveInstance>
	//   32   72:areturn         
			if(class1 == Short.TYPE)
	//*  33   73:aload_0         
	//*  34   74:getstatic       #123 <Field Class Short.TYPE>
	//*  35   77:if_acmpne       84
				return ((JsonDeserializer) (ShortDeserializer.primitiveInstance));
	//   36   80:getstatic       #126 <Field NumberDeserializers$ShortDeserializer NumberDeserializers$ShortDeserializer.primitiveInstance>
	//   37   83:areturn         
			if(class1 == Float.TYPE)
	//*  38   84:aload_0         
	//*  39   85:getstatic       #127 <Field Class Float.TYPE>
	//*  40   88:if_acmpne       217
				return ((JsonDeserializer) (FloatDeserializer.primitiveInstance));
	//   41   91:getstatic       #130 <Field NumberDeserializers$FloatDeserializer NumberDeserializers$FloatDeserializer.primitiveInstance>
	//   42   94:areturn         
		} else
		if(_classNames.contains(((Object) (s))))
	//*  43   95:getstatic       #54  <Field HashSet _classNames>
	//*  44   98:aload_1         
	//*  45   99:invokevirtual   #133 <Method boolean HashSet.contains(Object)>
	//*  46  102:ifeq            215
		{
			if(class1 == java/lang/Integer)
	//*  47  105:aload_0         
	//*  48  106:ldc1            #66  <Class Integer>
	//*  49  108:if_acmpne       115
				return ((JsonDeserializer) (IntegerDeserializer.wrapperInstance));
	//   50  111:getstatic       #136 <Field NumberDeserializers$IntegerDeserializer NumberDeserializers$IntegerDeserializer.wrapperInstance>
	//   51  114:areturn         
			if(class1 == java/lang/Boolean)
	//*  52  115:aload_0         
	//*  53  116:ldc1            #58  <Class Boolean>
	//*  54  118:if_acmpne       125
				return ((JsonDeserializer) (BooleanDeserializer.wrapperInstance));
	//   55  121:getstatic       #138 <Field NumberDeserializers$BooleanDeserializer NumberDeserializers$BooleanDeserializer.wrapperInstance>
	//   56  124:areturn         
			if(class1 == java/lang/Long)
	//*  57  125:aload_0         
	//*  58  126:ldc1            #68  <Class Long>
	//*  59  128:if_acmpne       135
				return ((JsonDeserializer) (LongDeserializer.wrapperInstance));
	//   60  131:getstatic       #140 <Field NumberDeserializers$LongDeserializer NumberDeserializers$LongDeserializer.wrapperInstance>
	//   61  134:areturn         
			if(class1 == java/lang/Double)
	//*  62  135:aload_0         
	//*  63  136:ldc1            #72  <Class Double>
	//*  64  138:if_acmpne       145
				return ((JsonDeserializer) (DoubleDeserializer.wrapperInstance));
	//   65  141:getstatic       #142 <Field NumberDeserializers$DoubleDeserializer NumberDeserializers$DoubleDeserializer.wrapperInstance>
	//   66  144:areturn         
			if(class1 == java/lang/Character)
	//*  67  145:aload_0         
	//*  68  146:ldc1            #64  <Class Character>
	//*  69  148:if_acmpne       155
				return ((JsonDeserializer) (CharacterDeserializer.wrapperInstance));
	//   70  151:getstatic       #144 <Field NumberDeserializers$CharacterDeserializer NumberDeserializers$CharacterDeserializer.wrapperInstance>
	//   71  154:areturn         
			if(class1 == java/lang/Byte)
	//*  72  155:aload_0         
	//*  73  156:ldc1            #60  <Class Byte>
	//*  74  158:if_acmpne       165
				return ((JsonDeserializer) (ByteDeserializer.wrapperInstance));
	//   75  161:getstatic       #146 <Field NumberDeserializers$ByteDeserializer NumberDeserializers$ByteDeserializer.wrapperInstance>
	//   76  164:areturn         
			if(class1 == java/lang/Short)
	//*  77  165:aload_0         
	//*  78  166:ldc1            #62  <Class Short>
	//*  79  168:if_acmpne       175
				return ((JsonDeserializer) (ShortDeserializer.wrapperInstance));
	//   80  171:getstatic       #148 <Field NumberDeserializers$ShortDeserializer NumberDeserializers$ShortDeserializer.wrapperInstance>
	//   81  174:areturn         
			if(class1 == java/lang/Float)
	//*  82  175:aload_0         
	//*  83  176:ldc1            #70  <Class Float>
	//*  84  178:if_acmpne       185
				return ((JsonDeserializer) (FloatDeserializer.wrapperInstance));
	//   85  181:getstatic       #150 <Field NumberDeserializers$FloatDeserializer NumberDeserializers$FloatDeserializer.wrapperInstance>
	//   86  184:areturn         
			if(class1 == java/lang/Number)
	//*  87  185:aload_0         
	//*  88  186:ldc1            #74  <Class Number>
	//*  89  188:if_acmpne       195
				return ((JsonDeserializer) (NumberDeserializer.instance));
	//   90  191:getstatic       #154 <Field NumberDeserializers$NumberDeserializer NumberDeserializers$NumberDeserializer.instance>
	//   91  194:areturn         
			if(class1 == java/math/BigDecimal)
	//*  92  195:aload_0         
	//*  93  196:ldc1            #76  <Class BigDecimal>
	//*  94  198:if_acmpne       205
				return ((JsonDeserializer) (BigDecimalDeserializer.instance));
	//   95  201:getstatic       #157 <Field NumberDeserializers$BigDecimalDeserializer NumberDeserializers$BigDecimalDeserializer.instance>
	//   96  204:areturn         
			if(class1 == java/math/BigInteger)
	//*  97  205:aload_0         
	//*  98  206:ldc1            #78  <Class BigInteger>
	//*  99  208:if_acmpne       217
				return ((JsonDeserializer) (BigIntegerDeserializer.instance));
	//  100  211:getstatic       #160 <Field NumberDeserializers$BigIntegerDeserializer NumberDeserializers$BigIntegerDeserializer.instance>
	//  101  214:areturn         
		} else
		{
			return null;
	//  102  215:aconst_null     
	//  103  216:areturn         
		}
		throw new IllegalArgumentException((new StringBuilder()).append("Internal error: can't find deserializer for ").append(class1.getName()).toString());
	//  104  217:new             #162 <Class IllegalArgumentException>
	//  105  220:dup             
	//  106  221:new             #164 <Class StringBuilder>
	//  107  224:dup             
	//  108  225:invokespecial   #165 <Method void StringBuilder()>
	//  109  228:ldc1            #167 <String "Internal error: can't find deserializer for ">
	//  110  230:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//  111  233:aload_0         
	//  112  234:invokevirtual   #82  <Method String Class.getName()>
	//  113  237:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//  114  240:invokevirtual   #174 <Method String StringBuilder.toString()>
	//  115  243:invokespecial   #177 <Method void IllegalArgumentException(String)>
	//  116  246:athrow          
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
		aclass[0] = java/lang/Boolean;
	//    7   16:aload_2         
	//    8   17:iconst_0        
	//    9   18:ldc1            #58  <Class Boolean>
	//   10   20:aastore         
		aclass[1] = java/lang/Byte;
	//   11   21:aload_2         
	//   12   22:iconst_1        
	//   13   23:ldc1            #60  <Class Byte>
	//   14   25:aastore         
		aclass[2] = java/lang/Short;
	//   15   26:aload_2         
	//   16   27:iconst_2        
	//   17   28:ldc1            #62  <Class Short>
	//   18   30:aastore         
		aclass[3] = java/lang/Character;
	//   19   31:aload_2         
	//   20   32:iconst_3        
	//   21   33:ldc1            #64  <Class Character>
	//   22   35:aastore         
		aclass[4] = java/lang/Integer;
	//   23   36:aload_2         
	//   24   37:iconst_4        
	//   25   38:ldc1            #66  <Class Integer>
	//   26   40:aastore         
		aclass[5] = java/lang/Long;
	//   27   41:aload_2         
	//   28   42:iconst_5        
	//   29   43:ldc1            #68  <Class Long>
	//   30   45:aastore         
		aclass[6] = java/lang/Float;
	//   31   46:aload_2         
	//   32   47:bipush          6
	//   33   49:ldc1            #70  <Class Float>
	//   34   51:aastore         
		aclass[7] = java/lang/Double;
	//   35   52:aload_2         
	//   36   53:bipush          7
	//   37   55:ldc1            #72  <Class Double>
	//   38   57:aastore         
		aclass[8] = java/lang/Number;
	//   39   58:aload_2         
	//   40   59:bipush          8
	//   41   61:ldc1            #74  <Class Number>
	//   42   63:aastore         
		aclass[9] = java/math/BigDecimal;
	//   43   64:aload_2         
	//   44   65:bipush          9
	//   45   67:ldc1            #76  <Class BigDecimal>
	//   46   69:aastore         
		aclass[10] = java/math/BigInteger;
	//   47   70:aload_2         
	//   48   71:bipush          10
	//   49   73:ldc1            #78  <Class BigInteger>
	//   50   75:aastore         
		int j = aclass.length;
	//   51   76:aload_2         
	//   52   77:arraylength     
	//   53   78:istore_1        
		for(int i = 0; i < j; i++)
	//*  54   79:iconst_0        
	//*  55   80:istore_0        
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
