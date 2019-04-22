// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDelegatingDeserializer

public abstract class StdDeserializer extends JsonDeserializer
	implements Serializable
{

	protected StdDeserializer(JavaType javatype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void JsonDeserializer()>
		if(javatype == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       14
			javatype = java/lang/Object;
	//    4    8:ldc1            #49  <Class Object>
	//    5   10:astore_1        
		else
	//*   6   11:goto            19
			javatype = ((JavaType) (javatype.getRawClass()));
	//    7   14:aload_1         
	//    8   15:invokevirtual   #55  <Method Class JavaType.getRawClass()>
	//    9   18:astore_1        
		_valueClass = ((Class) (javatype));
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:putfield        #57  <Field Class _valueClass>
	//   13   24:return          
	}

	protected StdDeserializer(StdDeserializer stddeserializer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void JsonDeserializer()>
		_valueClass = stddeserializer._valueClass;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #57  <Field Class _valueClass>
	//    5    9:putfield        #57  <Field Class _valueClass>
	//    6   12:return          
	}

	protected StdDeserializer(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void JsonDeserializer()>
		_valueClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #57  <Field Class _valueClass>
	//    5    9:return          
	}

	protected static final boolean _neitherNull(Object obj, Object obj1)
	{
		return obj != null && obj1 != null;
	//    0    0:aload_0         
	//    1    1:ifnull          10
	//    2    4:aload_1         
	//    3    5:ifnull          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	protected static final double parseDouble(String s)
		throws NumberFormatException
	{
		if("2.2250738585072012e-308".equals(((Object) (s))))
	//*   0    0:ldc1            #70  <String "2.2250738585072012e-308">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            13
			return 2.2250738585072014E-308D;
	//    4    9:ldc2w           #77  <Double 2.2250738585072014E-308D>
	//    5   12:dreturn         
		else
			return Double.parseDouble(s);
	//    6   13:aload_0         
	//    7   14:invokestatic    #82  <Method double Double.parseDouble(String)>
	//    8   17:dreturn         
	}

	protected final boolean _byteOverflow(int i)
	{
		return i < -128 || i > 255;
	//    0    0:iload_1         
	//    1    1:bipush          -128
	//    2    3:icmplt          18
	//    3    6:iload_1         
	//    4    7:sipush          255
	//    5   10:icmple          16
	//    6   13:goto            18
	//    7   16:iconst_0        
	//    8   17:ireturn         
	//    9   18:iconst_1        
	//   10   19:ireturn         
	}

	protected Object _coerceEmptyString(DeserializationContext deserializationcontext, boolean flag)
		throws JsonMappingException
	{
label0:
		{
			Object obj;
			if(!deserializationcontext.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #95  <Field MapperFeature MapperFeature.ALLOW_COERCION_OF_SCALARS>
	//*   2    4:invokevirtual   #101 <Method boolean DeserializationContext.isEnabled(MapperFeature)>
	//*   3    7:ifne            19
			{
				obj = ((Object) (MapperFeature.ALLOW_COERCION_OF_SCALARS));
	//    4   10:getstatic       #95  <Field MapperFeature MapperFeature.ALLOW_COERCION_OF_SCALARS>
	//    5   13:astore_3        
				flag = true;
	//    6   14:iconst_1        
	//    7   15:istore_2        
			} else
	//*   8   16:goto            39
			{
				if(!flag || !deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES))
					break label0;
	//    9   19:iload_2         
	//   10   20:ifeq            50
	//   11   23:aload_1         
	//   12   24:getstatic       #104 <Field DeserializationFeature DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES>
	//   13   27:invokevirtual   #107 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//   14   30:ifeq            50
				obj = ((Object) (DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES));
	//   15   33:getstatic       #104 <Field DeserializationFeature DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES>
	//   16   36:astore_3        
				flag = false;
	//   17   37:iconst_0        
	//   18   38:istore_2        
			}
			_reportFailedNullCoerce(deserializationcontext, flag, ((Enum) (obj)), "empty String (\"\")");
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:iload_2         
	//   22   42:aload_3         
	//   23   43:ldc1            #109 <String "empty String (\"\")">
	//   24   45:invokevirtual   #113 <Method void _reportFailedNullCoerce(DeserializationContext, boolean, Enum, String)>
			return ((Object) (null));
	//   25   48:aconst_null     
	//   26   49:areturn         
		}
		return getNullValue(deserializationcontext);
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #117 <Method Object getNullValue(DeserializationContext)>
	//   30   55:areturn         
	}

	protected Object _coerceIntegral(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		int i = deserializationcontext.getDeserializationFeatures();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #124 <Method int DeserializationContext.getDeserializationFeatures()>
	//    2    4:istore_3        
		if(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(i))
	//*   3    5:getstatic       #25  <Field DeserializationFeature DeserializationFeature.USE_BIG_INTEGER_FOR_INTS>
	//*   4    8:iload_3         
	//*   5    9:invokevirtual   #127 <Method boolean DeserializationFeature.enabledIn(int)>
	//*   6   12:ifeq            20
			return ((Object) (jsonparser.getBigIntegerValue()));
	//    7   15:aload_1         
	//    8   16:invokevirtual   #133 <Method java.math.BigInteger JsonParser.getBigIntegerValue()>
	//    9   19:areturn         
		if(DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(i))
	//*  10   20:getstatic       #32  <Field DeserializationFeature DeserializationFeature.USE_LONG_FOR_INTS>
	//*  11   23:iload_3         
	//*  12   24:invokevirtual   #127 <Method boolean DeserializationFeature.enabledIn(int)>
	//*  13   27:ifeq            38
			return ((Object) (Long.valueOf(jsonparser.getLongValue())));
	//   14   30:aload_1         
	//   15   31:invokevirtual   #137 <Method long JsonParser.getLongValue()>
	//   16   34:invokestatic    #143 <Method Long Long.valueOf(long)>
	//   17   37:areturn         
		else
			return ((Object) (jsonparser.getBigIntegerValue()));
	//   18   38:aload_1         
	//   19   39:invokevirtual   #133 <Method java.math.BigInteger JsonParser.getBigIntegerValue()>
	//   20   42:areturn         
	}

	protected Object _coerceNullToken(DeserializationContext deserializationcontext, boolean flag)
		throws JsonMappingException
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            9
			_verifyNullForPrimitive(deserializationcontext);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #148 <Method void _verifyNullForPrimitive(DeserializationContext)>
		return getNullValue(deserializationcontext);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #117 <Method Object getNullValue(DeserializationContext)>
	//    8   14:areturn         
	}

	protected Object _coerceTextualNull(DeserializationContext deserializationcontext, boolean flag)
		throws JsonMappingException
	{
label0:
		{
			Object obj;
			if(!deserializationcontext.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #95  <Field MapperFeature MapperFeature.ALLOW_COERCION_OF_SCALARS>
	//*   2    4:invokevirtual   #101 <Method boolean DeserializationContext.isEnabled(MapperFeature)>
	//*   3    7:ifne            19
			{
				obj = ((Object) (MapperFeature.ALLOW_COERCION_OF_SCALARS));
	//    4   10:getstatic       #95  <Field MapperFeature MapperFeature.ALLOW_COERCION_OF_SCALARS>
	//    5   13:astore_3        
				flag = true;
	//    6   14:iconst_1        
	//    7   15:istore_2        
			} else
	//*   8   16:goto            39
			{
				if(!flag || !deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES))
					break label0;
	//    9   19:iload_2         
	//   10   20:ifeq            50
	//   11   23:aload_1         
	//   12   24:getstatic       #104 <Field DeserializationFeature DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES>
	//   13   27:invokevirtual   #107 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//   14   30:ifeq            50
				obj = ((Object) (DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES));
	//   15   33:getstatic       #104 <Field DeserializationFeature DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES>
	//   16   36:astore_3        
				flag = false;
	//   17   37:iconst_0        
	//   18   38:istore_2        
			}
			_reportFailedNullCoerce(deserializationcontext, flag, ((Enum) (obj)), "String \"null\"");
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:iload_2         
	//   22   42:aload_3         
	//   23   43:ldc1            #151 <String "String \"null\"">
	//   24   45:invokevirtual   #113 <Method void _reportFailedNullCoerce(DeserializationContext, boolean, Enum, String)>
			return ((Object) (null));
	//   25   48:aconst_null     
	//   26   49:areturn         
		}
		return getNullValue(deserializationcontext);
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #117 <Method Object getNullValue(DeserializationContext)>
	//   30   55:areturn         
	}

	protected String _coercedTypeDesc()
	{
		boolean flag;
		Object obj;
label0:
		{
label1:
			{
				obj = ((Object) (getValueType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #157 <Method JavaType getValueType()>
	//    2    4:astore_3        
				boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
				flag = false;
	//    5    7:iconst_0        
	//    6    8:istore_1        
				if(obj != null && !((JavaType) (obj)).isPrimitive())
	//*   7    9:aload_3         
	//*   8   10:ifnull          80
	//*   9   13:aload_3         
	//*  10   14:invokevirtual   #161 <Method boolean JavaType.isPrimitive()>
	//*  11   17:ifne            80
				{
					if(((JavaType) (obj)).isContainerType() || ((JavaType) (obj)).isReferenceType())
	//*  12   20:aload_3         
	//*  13   21:invokevirtual   #164 <Method boolean JavaType.isContainerType()>
	//*  14   24:ifne            34
	//*  15   27:aload_3         
	//*  16   28:invokevirtual   #167 <Method boolean JavaType.isReferenceType()>
	//*  17   31:ifeq            36
						flag = true;
	//   18   34:iconst_1        
	//   19   35:istore_1        
					StringBuilder stringbuilder = new StringBuilder();
	//   20   36:new             #169 <Class StringBuilder>
	//   21   39:dup             
	//   22   40:invokespecial   #170 <Method void StringBuilder()>
	//   23   43:astore          4
					stringbuilder.append("'");
	//   24   45:aload           4
	//   25   47:ldc1            #172 <String "'">
	//   26   49:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
					stringbuilder.append(((JavaType) (obj)).toString());
	//   28   53:aload           4
	//   29   55:aload_3         
	//   30   56:invokevirtual   #179 <Method String JavaType.toString()>
	//   31   59:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   32   62:pop             
					stringbuilder.append("'");
	//   33   63:aload           4
	//   34   65:ldc1            #172 <String "'">
	//   35   67:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   36   70:pop             
					obj = ((Object) (stringbuilder.toString()));
	//   37   71:aload           4
	//   38   73:invokevirtual   #180 <Method String StringBuilder.toString()>
	//   39   76:astore_3        
					break label0;
	//   40   77:goto            119
				}
				obj = ((Object) (handledType()));
	//   41   80:aload_0         
	//   42   81:invokevirtual   #183 <Method Class handledType()>
	//   43   84:astore_3        
				if(!((Class) (obj)).isArray() && !((Class) (java/util/Collection)).isAssignableFrom(((Class) (obj))))
	//*  44   85:aload_3         
	//*  45   86:invokevirtual   #188 <Method boolean Class.isArray()>
	//*  46   89:ifne            112
	//*  47   92:ldc1            #190 <Class Collection>
	//*  48   94:aload_3         
	//*  49   95:invokevirtual   #194 <Method boolean Class.isAssignableFrom(Class)>
	//*  50   98:ifne            112
				{
					flag = flag1;
	//   51  101:iload_2         
	//   52  102:istore_1        
					if(!((Class) (java/util/Map)).isAssignableFrom(((Class) (obj))))
						break label1;
	//   53  103:ldc1            #196 <Class Map>
	//   54  105:aload_3         
	//   55  106:invokevirtual   #194 <Method boolean Class.isAssignableFrom(Class)>
	//   56  109:ifeq            114
				}
				flag = true;
	//   57  112:iconst_1        
	//   58  113:istore_1        
			}
			obj = ((Object) (ClassUtil.nameOf(((Class) (obj)))));
	//   59  114:aload_3         
	//   60  115:invokestatic    #202 <Method String ClassUtil.nameOf(Class)>
	//   61  118:astore_3        
		}
		if(flag)
	//*  62  119:iload_1         
	//*  63  120:ifeq            153
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   64  123:new             #169 <Class StringBuilder>
	//   65  126:dup             
	//   66  127:invokespecial   #170 <Method void StringBuilder()>
	//   67  130:astore          4
			stringbuilder1.append("as content of type ");
	//   68  132:aload           4
	//   69  134:ldc1            #204 <String "as content of type ">
	//   70  136:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   71  139:pop             
			stringbuilder1.append(((String) (obj)));
	//   72  140:aload           4
	//   73  142:aload_3         
	//   74  143:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   75  146:pop             
			return stringbuilder1.toString();
	//   76  147:aload           4
	//   77  149:invokevirtual   #180 <Method String StringBuilder.toString()>
	//   78  152:areturn         
		} else
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//   79  153:new             #169 <Class StringBuilder>
	//   80  156:dup             
	//   81  157:invokespecial   #170 <Method void StringBuilder()>
	//   82  160:astore          4
			stringbuilder2.append("for type ");
	//   83  162:aload           4
	//   84  164:ldc1            #206 <String "for type ">
	//   85  166:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   86  169:pop             
			stringbuilder2.append(((String) (obj)));
	//   87  170:aload           4
	//   88  172:aload_3         
	//   89  173:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   90  176:pop             
			return stringbuilder2.toString();
	//   91  177:aload           4
	//   92  179:invokevirtual   #180 <Method String StringBuilder.toString()>
	//   93  182:areturn         
		}
	}

	protected Object _deserializeFromArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj;
		if(deserializationcontext.hasSomeOfFeatures(F_MASK_ACCEPT_ARRAYS))
	//*   0    0:aload_2         
	//*   1    1:getstatic       #42  <Field int F_MASK_ACCEPT_ARRAYS>
	//*   2    4:invokevirtual   #210 <Method boolean DeserializationContext.hasSomeOfFeatures(int)>
	//*   3    7:ifeq            76
		{
			obj = ((Object) (jsonparser.nextToken()));
	//    4   10:aload_1         
	//    5   11:invokevirtual   #214 <Method JsonToken JsonParser.nextToken()>
	//    6   14:astore_3        
			if(obj == JsonToken.END_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT))
	//*   7   15:aload_3         
	//*   8   16:getstatic       #220 <Field JsonToken JsonToken.END_ARRAY>
	//*   9   19:if_acmpne       38
	//*  10   22:aload_2         
	//*  11   23:getstatic       #40  <Field DeserializationFeature DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT>
	//*  12   26:invokevirtual   #107 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  13   29:ifeq            38
				return getNullValue(deserializationcontext);
	//   14   32:aload_0         
	//   15   33:aload_2         
	//   16   34:invokevirtual   #117 <Method Object getNullValue(DeserializationContext)>
	//   17   37:areturn         
			if(deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  18   38:aload_2         
	//*  19   39:getstatic       #37  <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  20   42:invokevirtual   #107 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  21   45:ifeq            73
			{
				obj = deserialize(jsonparser, deserializationcontext);
	//   22   48:aload_0         
	//   23   49:aload_1         
	//   24   50:aload_2         
	//   25   51:invokevirtual   #223 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   26   54:astore_3        
				if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//*  27   55:aload_1         
	//*  28   56:invokevirtual   #214 <Method JsonToken JsonParser.nextToken()>
	//*  29   59:getstatic       #220 <Field JsonToken JsonToken.END_ARRAY>
	//*  30   62:if_acmpeq       71
					handleMissingEndArrayForSingle(jsonparser, deserializationcontext);
	//   31   65:aload_0         
	//   32   66:aload_1         
	//   33   67:aload_2         
	//   34   68:invokevirtual   #227 <Method void handleMissingEndArrayForSingle(JsonParser, DeserializationContext)>
				return obj;
	//   35   71:aload_3         
	//   36   72:areturn         
			}
		} else
	//*  37   73:goto            81
		{
			obj = ((Object) (jsonparser.getCurrentToken()));
	//   38   76:aload_1         
	//   39   77:invokevirtual   #230 <Method JsonToken JsonParser.getCurrentToken()>
	//   40   80:astore_3        
		}
		return deserializationcontext.handleUnexpectedToken(_valueClass, ((JsonToken) (obj)), jsonparser, ((String) (null)), new Object[0]);
	//   41   81:aload_2         
	//   42   82:aload_0         
	//   43   83:getfield        #57  <Field Class _valueClass>
	//   44   86:aload_3         
	//   45   87:aload_1         
	//   46   88:aconst_null     
	//   47   89:iconst_0        
	//   48   90:anewarray       Object[]
	//   49   93:invokevirtual   #234 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonToken, JsonParser, String, Object[])>
	//   50   96:areturn         
	}

	protected Object _deserializeFromEmpty(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #230 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore_3        
		if(jsontoken == JsonToken.START_ARRAY)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #239 <Field JsonToken JsonToken.START_ARRAY>
	//*   5    9:if_acmpne       44
		{
			if(deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT))
	//*   6   12:aload_2         
	//*   7   13:getstatic       #40  <Field DeserializationFeature DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT>
	//*   8   16:invokevirtual   #107 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*   9   19:ifeq            76
				if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #214 <Method JsonToken JsonParser.nextToken()>
	//*  12   26:getstatic       #220 <Field JsonToken JsonToken.END_ARRAY>
	//*  13   29:if_acmpne       34
					return ((Object) (null));
	//   14   32:aconst_null     
	//   15   33:areturn         
				else
					return deserializationcontext.handleUnexpectedToken(handledType(), jsonparser);
	//   16   34:aload_2         
	//   17   35:aload_0         
	//   18   36:invokevirtual   #183 <Method Class handledType()>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #242 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   21   43:areturn         
		} else
		if(jsontoken == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().trim().isEmpty())
	//*  22   44:aload_3         
	//*  23   45:getstatic       #245 <Field JsonToken JsonToken.VALUE_STRING>
	//*  24   48:if_acmpne       76
	//*  25   51:aload_2         
	//*  26   52:getstatic       #248 <Field DeserializationFeature DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT>
	//*  27   55:invokevirtual   #107 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  28   58:ifeq            76
	//*  29   61:aload_1         
	//*  30   62:invokevirtual   #251 <Method String JsonParser.getText()>
	//*  31   65:invokevirtual   #254 <Method String String.trim()>
	//*  32   68:invokevirtual   #257 <Method boolean String.isEmpty()>
	//*  33   71:ifeq            76
			return ((Object) (null));
	//   34   74:aconst_null     
	//   35   75:areturn         
		return deserializationcontext.handleUnexpectedToken(handledType(), jsonparser);
	//   36   76:aload_2         
	//   37   77:aload_0         
	//   38   78:invokevirtual   #183 <Method Class handledType()>
	//   39   81:aload_1         
	//   40   82:invokevirtual   #242 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   41   85:areturn         
	}

	protected Object _deserializeWrappedValue(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.START_ARRAY))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #239 <Field JsonToken JsonToken.START_ARRAY>
	//*   2    4:invokevirtual   #262 <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            62
		{
			String s = String.format("Cannot deserialize instance of %s out of %s token: nested Arrays not allowed with %s", new Object[] {
				ClassUtil.nameOf(_valueClass), JsonToken.START_ARRAY, "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS"
			});
	//    4   10:ldc2            #264 <String "Cannot deserialize instance of %s out of %s token: nested Arrays not allowed with %s">
	//    5   13:iconst_3        
	//    6   14:anewarray       Object[]
	//    7   17:dup             
	//    8   18:iconst_0        
	//    9   19:aload_0         
	//   10   20:getfield        #57  <Field Class _valueClass>
	//   11   23:invokestatic    #202 <Method String ClassUtil.nameOf(Class)>
	//   12   26:aastore         
	//   13   27:dup             
	//   14   28:iconst_1        
	//   15   29:getstatic       #239 <Field JsonToken JsonToken.START_ARRAY>
	//   16   32:aastore         
	//   17   33:dup             
	//   18   34:iconst_2        
	//   19   35:ldc2            #266 <String "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS">
	//   20   38:aastore         
	//   21   39:invokestatic    #270 <Method String String.format(String, Object[])>
	//   22   42:astore_3        
			return deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser.getCurrentToken(), jsonparser, s, new Object[0]);
	//   23   43:aload_2         
	//   24   44:aload_0         
	//   25   45:getfield        #57  <Field Class _valueClass>
	//   26   48:aload_1         
	//   27   49:invokevirtual   #230 <Method JsonToken JsonParser.getCurrentToken()>
	//   28   52:aload_1         
	//   29   53:aload_3         
	//   30   54:iconst_0        
	//   31   55:anewarray       Object[]
	//   32   58:invokevirtual   #234 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonToken, JsonParser, String, Object[])>
	//   33   61:areturn         
		} else
		{
			return deserialize(jsonparser, deserializationcontext);
	//   34   62:aload_0         
	//   35   63:aload_1         
	//   36   64:aload_2         
	//   37   65:invokevirtual   #223 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   38   68:areturn         
		}
	}

	protected void _failDoubleToIntCoercion(JsonParser jsonparser, DeserializationContext deserializationcontext, String s)
		throws IOException
	{
		deserializationcontext.reportInputMismatch(handledType(), "Cannot coerce a floating-point value ('%s') into %s (enable `DeserializationFeature.ACCEPT_FLOAT_AS_INT` to allow)", new Object[] {
			jsonparser.getValueAsString(), s
		});
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #183 <Method Class handledType()>
	//    3    5:ldc2            #274 <String "Cannot coerce a floating-point value ('%s') into %s (enable `DeserializationFeature.ACCEPT_FLOAT_AS_INT` to allow)">
	//    4    8:iconst_2        
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:invokevirtual   #277 <Method String JsonParser.getValueAsString()>
	//   10   18:aastore         
	//   11   19:dup             
	//   12   20:iconst_1        
	//   13   21:aload_3         
	//   14   22:aastore         
	//   15   23:invokevirtual   #281 <Method Object DeserializationContext.reportInputMismatch(Class, String, Object[])>
	//   16   26:pop             
	//   17   27:return          
	}

	protected final NullValueProvider _findNullProvider(DeserializationContext deserializationcontext, BeanProperty beanproperty, Nulls nulls, JsonDeserializer jsondeserializer)
		throws JsonMappingException
	{
		if(nulls == Nulls.FAIL)
	//*   0    0:aload_3         
	//*   1    1:getstatic       #289 <Field Nulls Nulls.FAIL>
	//*   2    4:if_acmpne       29
			if(beanproperty == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       24
				return ((NullValueProvider) (NullsFailProvider.constructForRootValue(deserializationcontext.constructType(jsondeserializer.handledType()))));
	//    5   11:aload_1         
	//    6   12:aload           4
	//    7   14:invokevirtual   #290 <Method Class JsonDeserializer.handledType()>
	//    8   17:invokevirtual   #294 <Method JavaType DeserializationContext.constructType(Class)>
	//    9   20:invokestatic    #300 <Method NullsFailProvider NullsFailProvider.constructForRootValue(JavaType)>
	//   10   23:areturn         
			else
				return ((NullValueProvider) (NullsFailProvider.constructForProperty(beanproperty)));
	//   11   24:aload_2         
	//   12   25:invokestatic    #304 <Method NullsFailProvider NullsFailProvider.constructForProperty(BeanProperty)>
	//   13   28:areturn         
		if(nulls == Nulls.AS_EMPTY)
	//*  14   29:aload_3         
	//*  15   30:getstatic       #307 <Field Nulls Nulls.AS_EMPTY>
	//*  16   33:if_acmpne       136
		{
			if(jsondeserializer == null)
	//*  17   36:aload           4
	//*  18   38:ifnonnull       43
				return null;
	//   19   41:aconst_null     
	//   20   42:areturn         
			if((jsondeserializer instanceof BeanDeserializerBase) && !((BeanDeserializerBase)jsondeserializer).getValueInstantiator().canCreateUsingDefault())
	//*  21   43:aload           4
	//*  22   45:instanceof      #309 <Class BeanDeserializerBase>
	//*  23   48:ifeq            92
	//*  24   51:aload           4
	//*  25   53:checkcast       #309 <Class BeanDeserializerBase>
	//*  26   56:invokevirtual   #313 <Method ValueInstantiator BeanDeserializerBase.getValueInstantiator()>
	//*  27   59:invokevirtual   #318 <Method boolean ValueInstantiator.canCreateUsingDefault()>
	//*  28   62:ifne            92
			{
				beanproperty = ((BeanProperty) (beanproperty.getType()));
	//   29   65:aload_2         
	//   30   66:invokeinterface #323 <Method JavaType BeanProperty.getType()>
	//   31   71:astore_2        
				deserializationcontext.reportBadDefinition(((JavaType) (beanproperty)), String.format("Cannot create empty instance of %s, no default Creator", new Object[] {
					beanproperty
				}));
	//   32   72:aload_1         
	//   33   73:aload_2         
	//   34   74:ldc2            #325 <String "Cannot create empty instance of %s, no default Creator">
	//   35   77:iconst_1        
	//   36   78:anewarray       Object[]
	//   37   81:dup             
	//   38   82:iconst_0        
	//   39   83:aload_2         
	//   40   84:aastore         
	//   41   85:invokestatic    #270 <Method String String.format(String, Object[])>
	//   42   88:invokevirtual   #329 <Method Object DeserializationContext.reportBadDefinition(JavaType, String)>
	//   43   91:pop             
			}
			beanproperty = ((BeanProperty) (jsondeserializer.getEmptyAccessPattern()));
	//   44   92:aload           4
	//   45   94:invokevirtual   #333 <Method AccessPattern JsonDeserializer.getEmptyAccessPattern()>
	//   46   97:astore_2        
			if(beanproperty == AccessPattern.ALWAYS_NULL)
	//*  47   98:aload_2         
	//*  48   99:getstatic       #339 <Field AccessPattern AccessPattern.ALWAYS_NULL>
	//*  49  102:if_acmpne       109
				return ((NullValueProvider) (NullsConstantProvider.nuller()));
	//   50  105:invokestatic    #345 <Method NullsConstantProvider NullsConstantProvider.nuller()>
	//   51  108:areturn         
			if(beanproperty == AccessPattern.CONSTANT)
	//*  52  109:aload_2         
	//*  53  110:getstatic       #348 <Field AccessPattern AccessPattern.CONSTANT>
	//*  54  113:if_acmpne       126
				return ((NullValueProvider) (NullsConstantProvider.forValue(jsondeserializer.getEmptyValue(deserializationcontext))));
	//   55  116:aload           4
	//   56  118:aload_1         
	//   57  119:invokevirtual   #351 <Method Object JsonDeserializer.getEmptyValue(DeserializationContext)>
	//   58  122:invokestatic    #355 <Method NullsConstantProvider NullsConstantProvider.forValue(Object)>
	//   59  125:areturn         
			else
				return ((NullValueProvider) (new NullsAsEmptyProvider(jsondeserializer)));
	//   60  126:new             #357 <Class NullsAsEmptyProvider>
	//   61  129:dup             
	//   62  130:aload           4
	//   63  132:invokespecial   #360 <Method void NullsAsEmptyProvider(JsonDeserializer)>
	//   64  135:areturn         
		}
		if(nulls == Nulls.SKIP)
	//*  65  136:aload_3         
	//*  66  137:getstatic       #363 <Field Nulls Nulls.SKIP>
	//*  67  140:if_acmpne       147
			return ((NullValueProvider) (NullsConstantProvider.skipper()));
	//   68  143:invokestatic    #366 <Method NullsConstantProvider NullsConstantProvider.skipper()>
	//   69  146:areturn         
		else
			return null;
	//   70  147:aconst_null     
	//   71  148:areturn         
	}

	protected boolean _hasTextualNull(String s)
	{
		return "null".equals(((Object) (s)));
	//    0    0:ldc2            #371 <String "null">
	//    1    3:aload_1         
	//    2    4:invokevirtual   #76  <Method boolean String.equals(Object)>
	//    3    7:ireturn         
	}

	protected final boolean _intOverflow(long l)
	{
		return l < 0x80000000L || l > 0x7fffffffL;
	//    0    0:lload_1         
	//    1    1:ldc2w           #374 <Long 0x80000000L>
	//    2    4:lcmp            
	//    3    5:iflt            21
	//    4    8:lload_1         
	//    5    9:ldc2w           #376 <Long 0x7fffffffL>
	//    6   12:lcmp            
	//    7   13:ifle            19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	protected boolean _isEmptyOrTextualNull(String s)
	{
		return s.isEmpty() || "null".equals(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #257 <Method boolean String.isEmpty()>
	//    2    4:ifne            22
	//    3    7:ldc2            #371 <String "null">
	//    4   10:aload_1         
	//    5   11:invokevirtual   #76  <Method boolean String.equals(Object)>
	//    6   14:ifeq            20
	//    7   17:goto            22
	//    8   20:iconst_0        
	//    9   21:ireturn         
	//   10   22:iconst_1        
	//   11   23:ireturn         
	}

	protected final boolean _isIntNumber(String s)
	{
		int j = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #382 <Method int String.length()>
	//    2    4:istore_3        
		if(j > 0)
	//*   3    5:iload_3         
	//*   4    6:ifle            76
		{
			int i = ((int) (s.charAt(0)));
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #386 <Method char String.charAt(int)>
	//    8   14:istore_2        
			if(i != '-' && i != '+')
	//*   9   15:iload_2         
	//*  10   16:bipush          45
	//*  11   18:icmpeq          35
	//*  12   21:iload_2         
	//*  13   22:bipush          43
	//*  14   24:icmpne          30
	//*  15   27:goto            35
				i = 0;
	//   16   30:iconst_0        
	//   17   31:istore_2        
			else
	//*  18   32:goto            37
				i = 1;
	//   19   35:iconst_1        
	//   20   36:istore_2        
			while(i < j) 
	//*  21   37:iload_2         
	//*  22   38:iload_3         
	//*  23   39:icmpge          74
			{
				char c = s.charAt(i);
	//   24   42:aload_1         
	//   25   43:iload_2         
	//   26   44:invokevirtual   #386 <Method char String.charAt(int)>
	//   27   47:istore          4
				if(c <= '9')
	//*  28   49:iload           4
	//*  29   51:bipush          57
	//*  30   53:icmpgt          72
				{
					if(c < '0')
	//*  31   56:iload           4
	//*  32   58:bipush          48
	//*  33   60:icmpge          65
						return false;
	//   34   63:iconst_0        
	//   35   64:ireturn         
					i++;
	//   36   65:iload_2         
	//   37   66:iconst_1        
	//   38   67:iadd            
	//   39   68:istore_2        
				} else
	//*  40   69:goto            37
				{
					return false;
	//   41   72:iconst_0        
	//   42   73:ireturn         
				}
			}
			return true;
	//   43   74:iconst_1        
	//   44   75:ireturn         
		} else
		{
			return false;
	//   45   76:iconst_0        
	//   46   77:ireturn         
		}
	}

	protected final boolean _isNaN(String s)
	{
		return "NaN".equals(((Object) (s)));
	//    0    0:ldc2            #389 <String "NaN">
	//    1    3:aload_1         
	//    2    4:invokevirtual   #76  <Method boolean String.equals(Object)>
	//    3    7:ireturn         
	}

	protected final boolean _isNegInf(String s)
	{
		return "-Infinity".equals(((Object) (s))) || "-INF".equals(((Object) (s)));
	//    0    0:ldc2            #392 <String "-Infinity">
	//    1    3:aload_1         
	//    2    4:invokevirtual   #76  <Method boolean String.equals(Object)>
	//    3    7:ifne            25
	//    4   10:ldc2            #394 <String "-INF">
	//    5   13:aload_1         
	//    6   14:invokevirtual   #76  <Method boolean String.equals(Object)>
	//    7   17:ifeq            23
	//    8   20:goto            25
	//    9   23:iconst_0        
	//   10   24:ireturn         
	//   11   25:iconst_1        
	//   12   26:ireturn         
	}

	protected final boolean _isPosInf(String s)
	{
		return "Infinity".equals(((Object) (s))) || "INF".equals(((Object) (s)));
	//    0    0:ldc2            #397 <String "Infinity">
	//    1    3:aload_1         
	//    2    4:invokevirtual   #76  <Method boolean String.equals(Object)>
	//    3    7:ifne            25
	//    4   10:ldc2            #399 <String "INF">
	//    5   13:aload_1         
	//    6   14:invokevirtual   #76  <Method boolean String.equals(Object)>
	//    7   17:ifeq            23
	//    8   20:goto            25
	//    9   23:iconst_0        
	//   10   24:ireturn         
	//   11   25:iconst_1        
	//   12   26:ireturn         
	}

	protected Number _nonNullNumber(Number number)
	{
		Object obj = ((Object) (number));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(number == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       11
			obj = ((Object) (Integer.valueOf(0)));
	//    4    6:iconst_0        
	//    5    7:invokestatic    #406 <Method Integer Integer.valueOf(int)>
	//    6   10:astore_2        
		return ((Number) (obj));
	//    7   11:aload_2         
	//    8   12:areturn         
	}

	protected boolean _parseBooleanFromInt(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		_verifyNumberForScalarCoercion(deserializationcontext, jsonparser);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #412 <Method void _verifyNumberForScalarCoercion(DeserializationContext, JsonParser)>
		return "0".equals(((Object) (jsonparser.getText()))) ^ true;
	//    4    6:ldc2            #414 <String "0">
	//    5    9:aload_1         
	//    6   10:invokevirtual   #251 <Method String JsonParser.getText()>
	//    7   13:invokevirtual   #76  <Method boolean String.equals(Object)>
	//    8   16:iconst_1        
	//    9   17:ixor            
	//   10   18:ireturn         
	}

	protected final boolean _parseBooleanPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #230 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          4
		if(jsontoken == JsonToken.VALUE_TRUE)
	//*   3    6:aload           4
	//*   4    8:getstatic       #418 <Field JsonToken JsonToken.VALUE_TRUE>
	//*   5   11:if_acmpne       16
			return true;
	//    6   14:iconst_1        
	//    7   15:ireturn         
		if(jsontoken == JsonToken.VALUE_FALSE)
	//*   8   16:aload           4
	//*   9   18:getstatic       #421 <Field JsonToken JsonToken.VALUE_FALSE>
	//*  10   21:if_acmpne       26
			return false;
	//   11   24:iconst_0        
	//   12   25:ireturn         
		if(jsontoken == JsonToken.VALUE_NULL)
	//*  13   26:aload           4
	//*  14   28:getstatic       #424 <Field JsonToken JsonToken.VALUE_NULL>
	//*  15   31:if_acmpne       41
		{
			_verifyNullForPrimitive(deserializationcontext);
	//   16   34:aload_0         
	//   17   35:aload_2         
	//   18   36:invokevirtual   #148 <Method void _verifyNullForPrimitive(DeserializationContext)>
			return false;
	//   19   39:iconst_0        
	//   20   40:ireturn         
		}
		if(jsontoken == JsonToken.VALUE_NUMBER_INT)
	//*  21   41:aload           4
	//*  22   43:getstatic       #427 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  23   46:if_acmpne       56
			return _parseBooleanFromInt(jsonparser, deserializationcontext);
	//   24   49:aload_0         
	//   25   50:aload_1         
	//   26   51:aload_2         
	//   27   52:invokevirtual   #429 <Method boolean _parseBooleanFromInt(JsonParser, DeserializationContext)>
	//   28   55:ireturn         
		if(jsontoken == JsonToken.VALUE_STRING)
	//*  29   56:aload           4
	//*  30   58:getstatic       #245 <Field JsonToken JsonToken.VALUE_STRING>
	//*  31   61:if_acmpne       164
		{
			jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   32   64:aload_1         
	//   33   65:invokevirtual   #251 <Method String JsonParser.getText()>
	//   34   68:invokevirtual   #254 <Method String String.trim()>
	//   35   71:astore_1        
			if(!"true".equals(((Object) (jsonparser))))
	//*  36   72:ldc2            #431 <String "true">
	//*  37   75:aload_1         
	//*  38   76:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  39   79:ifne            162
			{
				if("True".equals(((Object) (jsonparser))))
	//*  40   82:ldc2            #433 <String "True">
	//*  41   85:aload_1         
	//*  42   86:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  43   89:ifeq            94
					return true;
	//   44   92:iconst_1        
	//   45   93:ireturn         
				if(!"false".equals(((Object) (jsonparser))))
	//*  46   94:ldc2            #435 <String "false">
	//*  47   97:aload_1         
	//*  48   98:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  49  101:ifne            160
				{
					if("False".equals(((Object) (jsonparser))))
	//*  50  104:ldc2            #437 <String "False">
	//*  51  107:aload_1         
	//*  52  108:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  53  111:ifeq            116
						return false;
	//   54  114:iconst_0        
	//   55  115:ireturn         
					if(_isEmptyOrTextualNull(((String) (jsonparser))))
	//*  56  116:aload_0         
	//*  57  117:aload_1         
	//*  58  118:invokevirtual   #439 <Method boolean _isEmptyOrTextualNull(String)>
	//*  59  121:ifeq            132
					{
						_verifyNullForPrimitiveCoercion(deserializationcontext, ((String) (jsonparser)));
	//   60  124:aload_0         
	//   61  125:aload_2         
	//   62  126:aload_1         
	//   63  127:invokevirtual   #443 <Method void _verifyNullForPrimitiveCoercion(DeserializationContext, String)>
						return false;
	//   64  130:iconst_0        
	//   65  131:ireturn         
					} else
					{
						jsonparser = ((JsonParser) ((Boolean)deserializationcontext.handleWeirdStringValue(_valueClass, ((String) (jsonparser)), "only \"true\" or \"false\" recognized", new Object[0])));
	//   66  132:aload_2         
	//   67  133:aload_0         
	//   68  134:getfield        #57  <Field Class _valueClass>
	//   69  137:aload_1         
	//   70  138:ldc2            #445 <String "only \"true\" or \"false\" recognized">
	//   71  141:iconst_0        
	//   72  142:anewarray       Object[]
	//   73  145:invokevirtual   #449 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//   74  148:checkcast       #451 <Class Boolean>
	//   75  151:astore_1        
						return Boolean.TRUE.equals(((Object) (jsonparser)));
	//   76  152:getstatic       #455 <Field Boolean Boolean.TRUE>
	//   77  155:aload_1         
	//   78  156:invokevirtual   #456 <Method boolean Boolean.equals(Object)>
	//   79  159:ireturn         
					}
				} else
				{
					return false;
	//   80  160:iconst_0        
	//   81  161:ireturn         
				}
			} else
			{
				return true;
	//   82  162:iconst_1        
	//   83  163:ireturn         
			}
		}
		if(jsontoken == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  84  164:aload           4
	//*  85  166:getstatic       #239 <Field JsonToken JsonToken.START_ARRAY>
	//*  86  169:if_acmpne       202
	//*  87  172:aload_2         
	//*  88  173:getstatic       #37  <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  89  176:invokevirtual   #107 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  90  179:ifeq            202
		{
			jsonparser.nextToken();
	//   91  182:aload_1         
	//   92  183:invokevirtual   #214 <Method JsonToken JsonParser.nextToken()>
	//   93  186:pop             
			boolean flag = _parseBooleanPrimitive(jsonparser, deserializationcontext);
	//   94  187:aload_0         
	//   95  188:aload_1         
	//   96  189:aload_2         
	//   97  190:invokevirtual   #458 <Method boolean _parseBooleanPrimitive(JsonParser, DeserializationContext)>
	//   98  193:istore_3        
			_verifyEndArrayForSingle(jsonparser, deserializationcontext);
	//   99  194:aload_0         
	//  100  195:aload_1         
	//  101  196:aload_2         
	//  102  197:invokevirtual   #461 <Method void _verifyEndArrayForSingle(JsonParser, DeserializationContext)>
			return flag;
	//  103  200:iload_3         
	//  104  201:ireturn         
		} else
		{
			return ((Boolean)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser)).booleanValue();
	//  105  202:aload_2         
	//  106  203:aload_0         
	//  107  204:getfield        #57  <Field Class _valueClass>
	//  108  207:aload_1         
	//  109  208:invokevirtual   #242 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//  110  211:checkcast       #451 <Class Boolean>
	//  111  214:invokevirtual   #464 <Method boolean Boolean.booleanValue()>
	//  112  217:ireturn         
		}
	}

	protected final byte _parseBytePrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		int i = _parseIntPrimitive(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #470 <Method int _parseIntPrimitive(JsonParser, DeserializationContext)>
	//    4    6:istore_3        
		if(_byteOverflow(i))
	//*   5    7:aload_0         
	//*   6    8:iload_3         
	//*   7    9:invokevirtual   #472 <Method boolean _byteOverflow(int)>
	//*   8   12:ifeq            45
			return _nonNullNumber((Number)deserializationcontext.handleWeirdStringValue(_valueClass, String.valueOf(i), "overflow, value cannot be represented as 8-bit value", new Object[0])).byteValue();
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:aload_0         
	//   12   18:getfield        #57  <Field Class _valueClass>
	//   13   21:iload_3         
	//   14   22:invokestatic    #475 <Method String String.valueOf(int)>
	//   15   25:ldc2            #477 <String "overflow, value cannot be represented as 8-bit value">
	//   16   28:iconst_0        
	//   17   29:anewarray       Object[]
	//   18   32:invokevirtual   #449 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//   19   35:checkcast       #479 <Class Number>
	//   20   38:invokevirtual   #481 <Method Number _nonNullNumber(Number)>
	//   21   41:invokevirtual   #485 <Method byte Number.byteValue()>
	//   22   44:ireturn         
		else
			return (byte)i;
	//   23   45:iload_3         
	//   24   46:int2byte        
	//   25   47:ireturn         
	}

	protected Date _parseDate(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		JsonParseException jsonparseexception;
		int i = jsonparser.getCurrentTokenId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #492 <Method int JsonParser.getCurrentTokenId()>
	//    2    4:istore_3        
		if(i != 3)
	//*   3    5:iload_3         
	//*   4    6:iconst_3        
	//*   5    7:icmpeq          121
		{
			if(i != 11)
	//*   6   10:iload_3         
	//*   7   11:bipush          11
	//*   8   13:icmpeq          112
				switch(i)
	//*   9   16:iload_3         
				{
	//*  10   17:tableswitch     6 7: default 40
	//	               6 99
	//	               7 53
				default:
					return (Date)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
	//   11   40:aload_2         
	//   12   41:aload_0         
	//   13   42:getfield        #57  <Field Class _valueClass>
	//   14   45:aload_1         
	//   15   46:invokevirtual   #242 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   16   49:checkcast       #494 <Class Date>
	//   17   52:areturn         

				case 7: // '\007'
					long l;
					try
					{
						l = jsonparser.getLongValue();
	//   18   53:aload_1         
	//   19   54:invokevirtual   #137 <Method long JsonParser.getLongValue()>
	//   20   57:lstore          4
					}
	//*  21   59:goto            89
	//*  22   62:aload_2         
	//*  23   63:aload_0         
	//*  24   64:getfield        #57  <Field Class _valueClass>
	//*  25   67:aload_1         
	//*  26   68:invokevirtual   #498 <Method Number JsonParser.getNumberValue()>
	//*  27   71:ldc2            #500 <String "not a valid 64-bit long for creating `java.util.Date`">
	//*  28   74:iconst_0        
	//*  29   75:anewarray       Object[]
	//*  30   78:invokevirtual   #504 <Method Object DeserializationContext.handleWeirdNumberValue(Class, Number, String, Object[])>
	//*  31   81:checkcast       #479 <Class Number>
	//*  32   84:invokevirtual   #507 <Method long Number.longValue()>
	//*  33   87:lstore          4
	//*  34   89:new             #494 <Class Date>
	//*  35   92:dup             
	//*  36   93:lload           4
	//*  37   95:invokespecial   #510 <Method void Date(long)>
	//*  38   98:areturn         
	//*  39   99:aload_0         
	//*  40  100:aload_1         
	//*  41  101:invokevirtual   #251 <Method String JsonParser.getText()>
	//*  42  104:invokevirtual   #254 <Method String String.trim()>
	//*  43  107:aload_2         
	//*  44  108:invokevirtual   #513 <Method Date _parseDate(String, DeserializationContext)>
	//*  45  111:areturn         
	//*  46  112:aload_0         
	//*  47  113:aload_2         
	//*  48  114:invokevirtual   #117 <Method Object getNullValue(DeserializationContext)>
	//*  49  117:checkcast       #494 <Class Date>
	//*  50  120:areturn         
	//*  51  121:aload_0         
	//*  52  122:aload_1         
	//*  53  123:aload_2         
	//*  54  124:invokevirtual   #516 <Method Date _parseDateFromArray(JsonParser, DeserializationContext)>
	//*  55  127:areturn         
					// Misplaced declaration of an exception variable
					catch(JsonParseException jsonparseexception)
					{
						l = ((Number)deserializationcontext.handleWeirdNumberValue(_valueClass, jsonparser.getNumberValue(), "not a valid 64-bit long for creating `java.util.Date`", new Object[0])).longValue();
					}
					return new Date(l);

				case 6: // '\006'
					return _parseDate(jsonparser.getText().trim(), deserializationcontext);
				}
			else
				return (Date)getNullValue(deserializationcontext);
		} else
		{
			return _parseDateFromArray(jsonparser, deserializationcontext);
		}
	//*  56  128:astore          6
	//*  57  130:goto            62
	}

	protected Date _parseDate(String s, DeserializationContext deserializationcontext)
		throws IOException
	{
		Date date;
		try
		{
			if(_isEmptyOrTextualNull(s))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #439 <Method boolean _isEmptyOrTextualNull(String)>
	//*   3    5:ifeq            17
				return (Date)getNullValue(deserializationcontext);
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #117 <Method Object getNullValue(DeserializationContext)>
	//    7   13:checkcast       #494 <Class Date>
	//    8   16:areturn         
			date = deserializationcontext.parseDate(s);
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #522 <Method Date DeserializationContext.parseDate(String)>
	//   12   22:astore_3        
		}
	//*  13   23:aload_3         
	//*  14   24:areturn         
		catch(IllegalArgumentException illegalargumentexception)
	//*  15   25:astore_3        
		{
			return (Date)deserializationcontext.handleWeirdStringValue(_valueClass, s, "not a valid representation (error: %s)", new Object[] {
				illegalargumentexception.getMessage()
			});
	//   16   26:aload_2         
	//   17   27:aload_0         
	//   18   28:getfield        #57  <Field Class _valueClass>
	//   19   31:aload_1         
	//   20   32:ldc2            #524 <String "not a valid representation (error: %s)">
	//   21   35:iconst_1        
	//   22   36:anewarray       Object[]
	//   23   39:dup             
	//   24   40:iconst_0        
	//   25   41:aload_3         
	//   26   42:invokevirtual   #527 <Method String IllegalArgumentException.getMessage()>
	//   27   45:aastore         
	//   28   46:invokevirtual   #449 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//   29   49:checkcast       #494 <Class Date>
	//   30   52:areturn         
		}
		return date;
	}

	protected Date _parseDateFromArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj;
		if(deserializationcontext.hasSomeOfFeatures(F_MASK_ACCEPT_ARRAYS))
	//*   0    0:aload_2         
	//*   1    1:getstatic       #42  <Field int F_MASK_ACCEPT_ARRAYS>
	//*   2    4:invokevirtual   #210 <Method boolean DeserializationContext.hasSomeOfFeatures(int)>
	//*   3    7:ifeq            69
		{
			obj = ((Object) (jsonparser.nextToken()));
	//    4   10:aload_1         
	//    5   11:invokevirtual   #214 <Method JsonToken JsonParser.nextToken()>
	//    6   14:astore_3        
			if(obj == JsonToken.END_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT))
	//*   7   15:aload_3         
	//*   8   16:getstatic       #220 <Field JsonToken JsonToken.END_ARRAY>
	//*   9   19:if_acmpne       41
	//*  10   22:aload_2         
	//*  11   23:getstatic       #40  <Field DeserializationFeature DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT>
	//*  12   26:invokevirtual   #107 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  13   29:ifeq            41
				return (Date)getNullValue(deserializationcontext);
	//   14   32:aload_0         
	//   15   33:aload_2         
	//   16   34:invokevirtual   #117 <Method Object getNullValue(DeserializationContext)>
	//   17   37:checkcast       #494 <Class Date>
	//   18   40:areturn         
			if(deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  19   41:aload_2         
	//*  20   42:getstatic       #37  <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  21   45:invokevirtual   #107 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  22   48:ifeq            66
			{
				obj = ((Object) (_parseDate(jsonparser, deserializationcontext)));
	//   23   51:aload_0         
	//   24   52:aload_1         
	//   25   53:aload_2         
	//   26   54:invokevirtual   #529 <Method Date _parseDate(JsonParser, DeserializationContext)>
	//   27   57:astore_3        
				_verifyEndArrayForSingle(jsonparser, deserializationcontext);
	//   28   58:aload_0         
	//   29   59:aload_1         
	//   30   60:aload_2         
	//   31   61:invokevirtual   #461 <Method void _verifyEndArrayForSingle(JsonParser, DeserializationContext)>
				return ((Date) (obj));
	//   32   64:aload_3         
	//   33   65:areturn         
			}
		} else
	//*  34   66:goto            74
		{
			obj = ((Object) (jsonparser.getCurrentToken()));
	//   35   69:aload_1         
	//   36   70:invokevirtual   #230 <Method JsonToken JsonParser.getCurrentToken()>
	//   37   73:astore_3        
		}
		return (Date)deserializationcontext.handleUnexpectedToken(_valueClass, ((JsonToken) (obj)), jsonparser, ((String) (null)), new Object[0]);
	//   38   74:aload_2         
	//   39   75:aload_0         
	//   40   76:getfield        #57  <Field Class _valueClass>
	//   41   79:aload_3         
	//   42   80:aload_1         
	//   43   81:aconst_null     
	//   44   82:iconst_0        
	//   45   83:anewarray       Object[]
	//   46   86:invokevirtual   #234 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonToken, JsonParser, String, Object[])>
	//   47   89:checkcast       #494 <Class Date>
	//   48   92:areturn         
	}

	protected final double _parseDoublePrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_NUMBER_FLOAT))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #534 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   2    4:invokevirtual   #262 <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            15
			return jsonparser.getDoubleValue();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #538 <Method double JsonParser.getDoubleValue()>
	//    6   14:dreturn         
		int i = jsonparser.getCurrentTokenId();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #492 <Method int JsonParser.getCurrentTokenId()>
	//    9   19:istore          5
		if(i != 3)
	//*  10   21:iload           5
	//*  11   23:iconst_3        
	//*  12   24:icmpeq          106
		{
			if(i != 11)
	//*  13   27:iload           5
	//*  14   29:bipush          11
	//*  15   31:icmpeq          99
			{
				switch(i)
	//*  16   34:iload           5
				{
	//*  17   36:tableswitch     6 7: default 60
	//	               6 68
	//	               7 63
	//*  18   60:goto            136
				case 7: // '\007'
					return jsonparser.getDoubleValue();
	//   19   63:aload_1         
	//   20   64:invokevirtual   #538 <Method double JsonParser.getDoubleValue()>
	//   21   67:dreturn         

				case 6: // '\006'
					jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   22   68:aload_1         
	//   23   69:invokevirtual   #251 <Method String JsonParser.getText()>
	//   24   72:invokevirtual   #254 <Method String String.trim()>
	//   25   75:astore_1        
					if(_isEmptyOrTextualNull(((String) (jsonparser))))
	//*  26   76:aload_0         
	//*  27   77:aload_1         
	//*  28   78:invokevirtual   #439 <Method boolean _isEmptyOrTextualNull(String)>
	//*  29   81:ifeq            92
					{
						_verifyNullForPrimitiveCoercion(deserializationcontext, ((String) (jsonparser)));
	//   30   84:aload_0         
	//   31   85:aload_2         
	//   32   86:aload_1         
	//   33   87:invokevirtual   #443 <Method void _verifyNullForPrimitiveCoercion(DeserializationContext, String)>
						return 0.0D;
	//   34   90:dconst_0        
	//   35   91:dreturn         
					} else
					{
						return _parseDoublePrimitive(deserializationcontext, ((String) (jsonparser)));
	//   36   92:aload_0         
	//   37   93:aload_2         
	//   38   94:aload_1         
	//   39   95:invokevirtual   #541 <Method double _parseDoublePrimitive(DeserializationContext, String)>
	//   40   98:dreturn         
					}
				}
			} else
			{
				_verifyNullForPrimitive(deserializationcontext);
	//   41   99:aload_0         
	//   42  100:aload_2         
	//   43  101:invokevirtual   #148 <Method void _verifyNullForPrimitive(DeserializationContext)>
				return 0.0D;
	//   44  104:dconst_0        
	//   45  105:dreturn         
			}
		} else
		if(deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  46  106:aload_2         
	//*  47  107:getstatic       #37  <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  48  110:invokevirtual   #107 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  49  113:ifeq            136
		{
			jsonparser.nextToken();
	//   50  116:aload_1         
	//   51  117:invokevirtual   #214 <Method JsonToken JsonParser.nextToken()>
	//   52  120:pop             
			double d = _parseDoublePrimitive(jsonparser, deserializationcontext);
	//   53  121:aload_0         
	//   54  122:aload_1         
	//   55  123:aload_2         
	//   56  124:invokevirtual   #543 <Method double _parseDoublePrimitive(JsonParser, DeserializationContext)>
	//   57  127:dstore_3        
			_verifyEndArrayForSingle(jsonparser, deserializationcontext);
	//   58  128:aload_0         
	//   59  129:aload_1         
	//   60  130:aload_2         
	//   61  131:invokevirtual   #461 <Method void _verifyEndArrayForSingle(JsonParser, DeserializationContext)>
			return d;
	//   62  134:dload_3         
	//   63  135:dreturn         
		}
		return ((Number)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser)).doubleValue();
	//   64  136:aload_2         
	//   65  137:aload_0         
	//   66  138:getfield        #57  <Field Class _valueClass>
	//   67  141:aload_1         
	//   68  142:invokevirtual   #242 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   69  145:checkcast       #479 <Class Number>
	//   70  148:invokevirtual   #546 <Method double Number.doubleValue()>
	//   71  151:dreturn         
	}

	protected final double _parseDoublePrimitive(DeserializationContext deserializationcontext, String s)
		throws IOException
	{
		IllegalArgumentException illegalargumentexception;
		char c = s.charAt(0);
	//    0    0:aload_2         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #386 <Method char String.charAt(int)>
	//    3    5:istore          5
		if(c != '-')
	//*   4    7:iload           5
	//*   5    9:bipush          45
	//*   6   11:icmpeq          55
		{
			if(c != 'I')
	//*   7   14:iload           5
	//*   8   16:bipush          73
	//*   9   18:icmpeq          43
			{
				if(c == 'N' && _isNaN(s))
	//*  10   21:iload           5
	//*  11   23:bipush          78
	//*  12   25:icmpeq          31
	//*  13   28:goto            67
	//*  14   31:aload_0         
	//*  15   32:aload_2         
	//*  16   33:invokevirtual   #548 <Method boolean _isNaN(String)>
	//*  17   36:ifeq            67
					return (0.0D / 0.0D);
	//   18   39:ldc2w           #549 <Double (0.0D / 0.0D)>
	//   19   42:dreturn         
			} else
			if(_isPosInf(s))
	//*  20   43:aload_0         
	//*  21   44:aload_2         
	//*  22   45:invokevirtual   #552 <Method boolean _isPosInf(String)>
	//*  23   48:ifeq            67
				return (1.0D / 0.0D);
	//   24   51:ldc2w           #553 <Double (1.0D / 0.0D)>
	//   25   54:dreturn         
		} else
		if(_isNegInf(s))
	//*  26   55:aload_0         
	//*  27   56:aload_2         
	//*  28   57:invokevirtual   #556 <Method boolean _isNegInf(String)>
	//*  29   60:ifeq            67
			return (-1.0D / 0.0D);
	//   30   63:ldc2w           #557 <Double (-1.0D / 0.0D)>
	//   31   66:dreturn         
		double d;
		try
		{
			d = parseDouble(s);
	//   32   67:aload_2         
	//   33   68:invokestatic    #559 <Method double parseDouble(String)>
	//   34   71:dstore_3        
		}
	//*  35   72:dload_3         
	//*  36   73:dreturn         
	//*  37   74:aload_0         
	//*  38   75:aload_1         
	//*  39   76:aload_0         
	//*  40   77:getfield        #57  <Field Class _valueClass>
	//*  41   80:aload_2         
	//*  42   81:ldc2            #561 <String "not a valid double value (as String to convert)">
	//*  43   84:iconst_0        
	//*  44   85:anewarray       Object[]
	//*  45   88:invokevirtual   #449 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//*  46   91:checkcast       #479 <Class Number>
	//*  47   94:invokevirtual   #481 <Method Number _nonNullNumber(Number)>
	//*  48   97:invokevirtual   #546 <Method double Number.doubleValue()>
	//*  49  100:dreturn         
		// Misplaced declaration of an exception variable
		catch(IllegalArgumentException illegalargumentexception)
		{
			return _nonNullNumber((Number)deserializationcontext.handleWeirdStringValue(_valueClass, s, "not a valid double value (as String to convert)", new Object[0])).doubleValue();
		}
		return d;
	//*  50  101:astore          6
	//*  51  103:goto            74
	}

	protected final float _parseFloatPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_NUMBER_FLOAT))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #534 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   2    4:invokevirtual   #262 <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            15
			return jsonparser.getFloatValue();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #567 <Method float JsonParser.getFloatValue()>
	//    6   14:freturn         
		int i = jsonparser.getCurrentTokenId();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #492 <Method int JsonParser.getCurrentTokenId()>
	//    9   19:istore          4
		if(i != 3)
	//*  10   21:iload           4
	//*  11   23:iconst_3        
	//*  12   24:icmpeq          106
		{
			if(i != 11)
	//*  13   27:iload           4
	//*  14   29:bipush          11
	//*  15   31:icmpeq          99
			{
				switch(i)
	//*  16   34:iload           4
				{
	//*  17   36:tableswitch     6 7: default 60
	//	               6 68
	//	               7 63
	//*  18   60:goto            136
				case 7: // '\007'
					return jsonparser.getFloatValue();
	//   19   63:aload_1         
	//   20   64:invokevirtual   #567 <Method float JsonParser.getFloatValue()>
	//   21   67:freturn         

				case 6: // '\006'
					jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   22   68:aload_1         
	//   23   69:invokevirtual   #251 <Method String JsonParser.getText()>
	//   24   72:invokevirtual   #254 <Method String String.trim()>
	//   25   75:astore_1        
					if(_isEmptyOrTextualNull(((String) (jsonparser))))
	//*  26   76:aload_0         
	//*  27   77:aload_1         
	//*  28   78:invokevirtual   #439 <Method boolean _isEmptyOrTextualNull(String)>
	//*  29   81:ifeq            92
					{
						_verifyNullForPrimitiveCoercion(deserializationcontext, ((String) (jsonparser)));
	//   30   84:aload_0         
	//   31   85:aload_2         
	//   32   86:aload_1         
	//   33   87:invokevirtual   #443 <Method void _verifyNullForPrimitiveCoercion(DeserializationContext, String)>
						return 0.0F;
	//   34   90:fconst_0        
	//   35   91:freturn         
					} else
					{
						return _parseFloatPrimitive(deserializationcontext, ((String) (jsonparser)));
	//   36   92:aload_0         
	//   37   93:aload_2         
	//   38   94:aload_1         
	//   39   95:invokevirtual   #570 <Method float _parseFloatPrimitive(DeserializationContext, String)>
	//   40   98:freturn         
					}
				}
			} else
			{
				_verifyNullForPrimitive(deserializationcontext);
	//   41   99:aload_0         
	//   42  100:aload_2         
	//   43  101:invokevirtual   #148 <Method void _verifyNullForPrimitive(DeserializationContext)>
				return 0.0F;
	//   44  104:fconst_0        
	//   45  105:freturn         
			}
		} else
		if(deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  46  106:aload_2         
	//*  47  107:getstatic       #37  <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  48  110:invokevirtual   #107 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  49  113:ifeq            136
		{
			jsonparser.nextToken();
	//   50  116:aload_1         
	//   51  117:invokevirtual   #214 <Method JsonToken JsonParser.nextToken()>
	//   52  120:pop             
			float f = _parseFloatPrimitive(jsonparser, deserializationcontext);
	//   53  121:aload_0         
	//   54  122:aload_1         
	//   55  123:aload_2         
	//   56  124:invokevirtual   #572 <Method float _parseFloatPrimitive(JsonParser, DeserializationContext)>
	//   57  127:fstore_3        
			_verifyEndArrayForSingle(jsonparser, deserializationcontext);
	//   58  128:aload_0         
	//   59  129:aload_1         
	//   60  130:aload_2         
	//   61  131:invokevirtual   #461 <Method void _verifyEndArrayForSingle(JsonParser, DeserializationContext)>
			return f;
	//   62  134:fload_3         
	//   63  135:freturn         
		}
		return ((Number)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser)).floatValue();
	//   64  136:aload_2         
	//   65  137:aload_0         
	//   66  138:getfield        #57  <Field Class _valueClass>
	//   67  141:aload_1         
	//   68  142:invokevirtual   #242 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   69  145:checkcast       #479 <Class Number>
	//   70  148:invokevirtual   #575 <Method float Number.floatValue()>
	//   71  151:freturn         
	}

	protected final float _parseFloatPrimitive(DeserializationContext deserializationcontext, String s)
		throws IOException
	{
		IllegalArgumentException illegalargumentexception;
		char c = s.charAt(0);
	//    0    0:aload_2         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #386 <Method char String.charAt(int)>
	//    3    5:istore          4
		if(c != '-')
	//*   4    7:iload           4
	//*   5    9:bipush          45
	//*   6   11:icmpeq          55
		{
			if(c != 'I')
	//*   7   14:iload           4
	//*   8   16:bipush          73
	//*   9   18:icmpeq          43
			{
				if(c == 'N' && _isNaN(s))
	//*  10   21:iload           4
	//*  11   23:bipush          78
	//*  12   25:icmpeq          31
	//*  13   28:goto            67
	//*  14   31:aload_0         
	//*  15   32:aload_2         
	//*  16   33:invokevirtual   #548 <Method boolean _isNaN(String)>
	//*  17   36:ifeq            67
					return (0.0F / 0.0F);
	//   18   39:ldc2            #576 <Float (0.0F / 0.0F)>
	//   19   42:freturn         
			} else
			if(_isPosInf(s))
	//*  20   43:aload_0         
	//*  21   44:aload_2         
	//*  22   45:invokevirtual   #552 <Method boolean _isPosInf(String)>
	//*  23   48:ifeq            67
				return (1.0F / 0.0F);
	//   24   51:ldc2            #577 <Float (1.0F / 0.0F)>
	//   25   54:freturn         
		} else
		if(_isNegInf(s))
	//*  26   55:aload_0         
	//*  27   56:aload_2         
	//*  28   57:invokevirtual   #556 <Method boolean _isNegInf(String)>
	//*  29   60:ifeq            67
			return (-1.0F / 0.0F);
	//   30   63:ldc2            #578 <Float (-1.0F / 0.0F)>
	//   31   66:freturn         
		float f;
		try
		{
			f = Float.parseFloat(s);
	//   32   67:aload_2         
	//   33   68:invokestatic    #584 <Method float Float.parseFloat(String)>
	//   34   71:fstore_3        
		}
	//*  35   72:fload_3         
	//*  36   73:freturn         
	//*  37   74:aload_0         
	//*  38   75:aload_1         
	//*  39   76:aload_0         
	//*  40   77:getfield        #57  <Field Class _valueClass>
	//*  41   80:aload_2         
	//*  42   81:ldc2            #586 <String "not a valid float value">
	//*  43   84:iconst_0        
	//*  44   85:anewarray       Object[]
	//*  45   88:invokevirtual   #449 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//*  46   91:checkcast       #479 <Class Number>
	//*  47   94:invokevirtual   #481 <Method Number _nonNullNumber(Number)>
	//*  48   97:invokevirtual   #575 <Method float Number.floatValue()>
	//*  49  100:freturn         
		// Misplaced declaration of an exception variable
		catch(IllegalArgumentException illegalargumentexception)
		{
			return _nonNullNumber((Number)deserializationcontext.handleWeirdStringValue(_valueClass, s, "not a valid float value", new Object[0])).floatValue();
		}
		return f;
	//*  50  101:astore          5
	//*  51  103:goto            74
	}

	protected final int _parseIntPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_NUMBER_INT))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #427 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   2    4:invokevirtual   #262 <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            15
			return jsonparser.getIntValue();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #589 <Method int JsonParser.getIntValue()>
	//    6   14:ireturn         
		int i = jsonparser.getCurrentTokenId();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #492 <Method int JsonParser.getCurrentTokenId()>
	//    9   19:istore_3        
		if(i != 3)
	//*  10   20:iload_3         
	//*  11   21:iconst_3        
	//*  12   22:icmpeq          108
		{
			if(i != 6)
	//*  13   25:iload_3         
	//*  14   26:bipush          6
	//*  15   28:icmpeq          77
			{
				if(i != 8)
	//*  16   31:iload_3         
	//*  17   32:bipush          8
	//*  18   34:icmpeq          53
				{
					if(i == 11)
	//*  19   37:iload_3         
	//*  20   38:bipush          11
	//*  21   40:icmpeq          46
	//*  22   43:goto            138
					{
						_verifyNullForPrimitive(deserializationcontext);
	//   23   46:aload_0         
	//   24   47:aload_2         
	//   25   48:invokevirtual   #148 <Method void _verifyNullForPrimitive(DeserializationContext)>
						return 0;
	//   26   51:iconst_0        
	//   27   52:ireturn         
					}
				} else
				{
					if(!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT))
	//*  28   53:aload_2         
	//*  29   54:getstatic       #592 <Field DeserializationFeature DeserializationFeature.ACCEPT_FLOAT_AS_INT>
	//*  30   57:invokevirtual   #107 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  31   60:ifne            72
						_failDoubleToIntCoercion(jsonparser, deserializationcontext, "int");
	//   32   63:aload_0         
	//   33   64:aload_1         
	//   34   65:aload_2         
	//   35   66:ldc2            #594 <String "int">
	//   36   69:invokevirtual   #596 <Method void _failDoubleToIntCoercion(JsonParser, DeserializationContext, String)>
					return jsonparser.getValueAsInt();
	//   37   72:aload_1         
	//   38   73:invokevirtual   #599 <Method int JsonParser.getValueAsInt()>
	//   39   76:ireturn         
				}
			} else
			{
				jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   40   77:aload_1         
	//   41   78:invokevirtual   #251 <Method String JsonParser.getText()>
	//   42   81:invokevirtual   #254 <Method String String.trim()>
	//   43   84:astore_1        
				if(_isEmptyOrTextualNull(((String) (jsonparser))))
	//*  44   85:aload_0         
	//*  45   86:aload_1         
	//*  46   87:invokevirtual   #439 <Method boolean _isEmptyOrTextualNull(String)>
	//*  47   90:ifeq            101
				{
					_verifyNullForPrimitiveCoercion(deserializationcontext, ((String) (jsonparser)));
	//   48   93:aload_0         
	//   49   94:aload_2         
	//   50   95:aload_1         
	//   51   96:invokevirtual   #443 <Method void _verifyNullForPrimitiveCoercion(DeserializationContext, String)>
					return 0;
	//   52   99:iconst_0        
	//   53  100:ireturn         
				} else
				{
					return _parseIntPrimitive(deserializationcontext, ((String) (jsonparser)));
	//   54  101:aload_0         
	//   55  102:aload_2         
	//   56  103:aload_1         
	//   57  104:invokevirtual   #602 <Method int _parseIntPrimitive(DeserializationContext, String)>
	//   58  107:ireturn         
				}
			}
		} else
		if(deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  59  108:aload_2         
	//*  60  109:getstatic       #37  <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  61  112:invokevirtual   #107 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  62  115:ifeq            138
		{
			jsonparser.nextToken();
	//   63  118:aload_1         
	//   64  119:invokevirtual   #214 <Method JsonToken JsonParser.nextToken()>
	//   65  122:pop             
			int j = _parseIntPrimitive(jsonparser, deserializationcontext);
	//   66  123:aload_0         
	//   67  124:aload_1         
	//   68  125:aload_2         
	//   69  126:invokevirtual   #470 <Method int _parseIntPrimitive(JsonParser, DeserializationContext)>
	//   70  129:istore_3        
			_verifyEndArrayForSingle(jsonparser, deserializationcontext);
	//   71  130:aload_0         
	//   72  131:aload_1         
	//   73  132:aload_2         
	//   74  133:invokevirtual   #461 <Method void _verifyEndArrayForSingle(JsonParser, DeserializationContext)>
			return j;
	//   75  136:iload_3         
	//   76  137:ireturn         
		}
		return ((Number)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser)).intValue();
	//   77  138:aload_2         
	//   78  139:aload_0         
	//   79  140:getfield        #57  <Field Class _valueClass>
	//   80  143:aload_1         
	//   81  144:invokevirtual   #242 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   82  147:checkcast       #479 <Class Number>
	//   83  150:invokevirtual   #605 <Method int Number.intValue()>
	//   84  153:ireturn         
	}

	protected final int _parseIntPrimitive(DeserializationContext deserializationcontext, String s)
		throws IOException
	{
		long l;
		IllegalArgumentException illegalargumentexception;
label0:
		{
			int i;
			try
			{
				if(s.length() > 9)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #382 <Method int String.length()>
	//*   2    4:bipush          9
	//*   3    6:icmple          73
				{
					l = Long.parseLong(s);
	//    4    9:aload_2         
	//    5   10:invokestatic    #609 <Method long Long.parseLong(String)>
	//    6   13:lstore          4
					if(_intOverflow(l))
	//*   7   15:aload_0         
	//*   8   16:lload           4
	//*   9   18:invokevirtual   #611 <Method boolean _intOverflow(long)>
	//*  10   21:ifeq            112
						return _nonNullNumber((Number)deserializationcontext.handleWeirdStringValue(_valueClass, s, "Overflow: numeric value (%s) out of range of int (%d -%d)", new Object[] {
							s, Integer.valueOf(0x80000000), Integer.valueOf(0x7fffffff)
						})).intValue();
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:aload_0         
	//   14   27:getfield        #57  <Field Class _valueClass>
	//   15   30:aload_2         
	//   16   31:ldc2            #613 <String "Overflow: numeric value (%s) out of range of int (%d -%d)">
	//   17   34:iconst_3        
	//   18   35:anewarray       Object[]
	//   19   38:dup             
	//   20   39:iconst_0        
	//   21   40:aload_2         
	//   22   41:aastore         
	//   23   42:dup             
	//   24   43:iconst_1        
	//   25   44:ldc2            #614 <Int 0x80000000>
	//   26   47:invokestatic    #406 <Method Integer Integer.valueOf(int)>
	//   27   50:aastore         
	//   28   51:dup             
	//   29   52:iconst_2        
	//   30   53:ldc2            #615 <Int 0x7fffffff>
	//   31   56:invokestatic    #406 <Method Integer Integer.valueOf(int)>
	//   32   59:aastore         
	//   33   60:invokevirtual   #449 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//   34   63:checkcast       #479 <Class Number>
	//   35   66:invokevirtual   #481 <Method Number _nonNullNumber(Number)>
	//   36   69:invokevirtual   #605 <Method int Number.intValue()>
	//   37   72:ireturn         
					break label0;
				}
				i = NumberInput.parseInt(s);
	//   38   73:aload_2         
	//   39   74:invokestatic    #621 <Method int NumberInput.parseInt(String)>
	//   40   77:istore_3        
			}
	//*  41   78:iload_3         
	//*  42   79:ireturn         
	//*  43   80:aload_0         
	//*  44   81:aload_1         
	//*  45   82:aload_0         
	//*  46   83:getfield        #57  <Field Class _valueClass>
	//*  47   86:aload_2         
	//*  48   87:ldc2            #623 <String "not a valid int value">
	//*  49   90:iconst_0        
	//*  50   91:anewarray       Object[]
	//*  51   94:invokevirtual   #449 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//*  52   97:checkcast       #479 <Class Number>
	//*  53  100:invokevirtual   #481 <Method Number _nonNullNumber(Number)>
	//*  54  103:invokevirtual   #605 <Method int Number.intValue()>
	//*  55  106:ireturn         
			// Misplaced declaration of an exception variable
			catch(IllegalArgumentException illegalargumentexception)
			{
				return _nonNullNumber((Number)deserializationcontext.handleWeirdStringValue(_valueClass, s, "not a valid int value", new Object[0])).intValue();
			}
			return i;
		}
	//*  56  107:astore          6
	//*  57  109:goto            80
		return (int)l;
	//   58  112:lload           4
	//   59  114:l2i             
	//   60  115:ireturn         
	}

	protected final long _parseLongPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_NUMBER_INT))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #427 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   2    4:invokevirtual   #262 <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            15
			return jsonparser.getLongValue();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #137 <Method long JsonParser.getLongValue()>
	//    6   14:lreturn         
		int i = jsonparser.getCurrentTokenId();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #492 <Method int JsonParser.getCurrentTokenId()>
	//    9   19:istore_3        
		if(i != 3)
	//*  10   20:iload_3         
	//*  11   21:iconst_3        
	//*  12   22:icmpeq          108
		{
			if(i != 6)
	//*  13   25:iload_3         
	//*  14   26:bipush          6
	//*  15   28:icmpeq          77
			{
				if(i != 8)
	//*  16   31:iload_3         
	//*  17   32:bipush          8
	//*  18   34:icmpeq          53
				{
					if(i == 11)
	//*  19   37:iload_3         
	//*  20   38:bipush          11
	//*  21   40:icmpeq          46
	//*  22   43:goto            140
					{
						_verifyNullForPrimitive(deserializationcontext);
	//   23   46:aload_0         
	//   24   47:aload_2         
	//   25   48:invokevirtual   #148 <Method void _verifyNullForPrimitive(DeserializationContext)>
						return 0L;
	//   26   51:lconst_0        
	//   27   52:lreturn         
					}
				} else
				{
					if(!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT))
	//*  28   53:aload_2         
	//*  29   54:getstatic       #592 <Field DeserializationFeature DeserializationFeature.ACCEPT_FLOAT_AS_INT>
	//*  30   57:invokevirtual   #107 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  31   60:ifne            72
						_failDoubleToIntCoercion(jsonparser, deserializationcontext, "long");
	//   32   63:aload_0         
	//   33   64:aload_1         
	//   34   65:aload_2         
	//   35   66:ldc2            #627 <String "long">
	//   36   69:invokevirtual   #596 <Method void _failDoubleToIntCoercion(JsonParser, DeserializationContext, String)>
					return jsonparser.getValueAsLong();
	//   37   72:aload_1         
	//   38   73:invokevirtual   #630 <Method long JsonParser.getValueAsLong()>
	//   39   76:lreturn         
				}
			} else
			{
				jsonparser = ((JsonParser) (jsonparser.getText().trim()));
	//   40   77:aload_1         
	//   41   78:invokevirtual   #251 <Method String JsonParser.getText()>
	//   42   81:invokevirtual   #254 <Method String String.trim()>
	//   43   84:astore_1        
				if(_isEmptyOrTextualNull(((String) (jsonparser))))
	//*  44   85:aload_0         
	//*  45   86:aload_1         
	//*  46   87:invokevirtual   #439 <Method boolean _isEmptyOrTextualNull(String)>
	//*  47   90:ifeq            101
				{
					_verifyNullForPrimitiveCoercion(deserializationcontext, ((String) (jsonparser)));
	//   48   93:aload_0         
	//   49   94:aload_2         
	//   50   95:aload_1         
	//   51   96:invokevirtual   #443 <Method void _verifyNullForPrimitiveCoercion(DeserializationContext, String)>
					return 0L;
	//   52   99:lconst_0        
	//   53  100:lreturn         
				} else
				{
					return _parseLongPrimitive(deserializationcontext, ((String) (jsonparser)));
	//   54  101:aload_0         
	//   55  102:aload_2         
	//   56  103:aload_1         
	//   57  104:invokevirtual   #633 <Method long _parseLongPrimitive(DeserializationContext, String)>
	//   58  107:lreturn         
				}
			}
		} else
		if(deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  59  108:aload_2         
	//*  60  109:getstatic       #37  <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  61  112:invokevirtual   #107 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  62  115:ifeq            140
		{
			jsonparser.nextToken();
	//   63  118:aload_1         
	//   64  119:invokevirtual   #214 <Method JsonToken JsonParser.nextToken()>
	//   65  122:pop             
			long l = _parseLongPrimitive(jsonparser, deserializationcontext);
	//   66  123:aload_0         
	//   67  124:aload_1         
	//   68  125:aload_2         
	//   69  126:invokevirtual   #635 <Method long _parseLongPrimitive(JsonParser, DeserializationContext)>
	//   70  129:lstore          4
			_verifyEndArrayForSingle(jsonparser, deserializationcontext);
	//   71  131:aload_0         
	//   72  132:aload_1         
	//   73  133:aload_2         
	//   74  134:invokevirtual   #461 <Method void _verifyEndArrayForSingle(JsonParser, DeserializationContext)>
			return l;
	//   75  137:lload           4
	//   76  139:lreturn         
		}
		return ((Number)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser)).longValue();
	//   77  140:aload_2         
	//   78  141:aload_0         
	//   79  142:getfield        #57  <Field Class _valueClass>
	//   80  145:aload_1         
	//   81  146:invokevirtual   #242 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   82  149:checkcast       #479 <Class Number>
	//   83  152:invokevirtual   #507 <Method long Number.longValue()>
	//   84  155:lreturn         
	}

	protected final long _parseLongPrimitive(DeserializationContext deserializationcontext, String s)
		throws IOException
	{
		IllegalArgumentException illegalargumentexception;
		long l;
		try
		{
			l = NumberInput.parseLong(s);
	//    0    0:aload_2         
	//    1    1:invokestatic    #636 <Method long NumberInput.parseLong(String)>
	//    2    4:lstore_3        
		}
	//*   3    5:lload_3         
	//*   4    6:lreturn         
	//*   5    7:aload_0         
	//*   6    8:aload_1         
	//*   7    9:aload_0         
	//*   8   10:getfield        #57  <Field Class _valueClass>
	//*   9   13:aload_2         
	//*  10   14:ldc2            #638 <String "not a valid long value">
	//*  11   17:iconst_0        
	//*  12   18:anewarray       Object[]
	//*  13   21:invokevirtual   #449 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//*  14   24:checkcast       #479 <Class Number>
	//*  15   27:invokevirtual   #481 <Method Number _nonNullNumber(Number)>
	//*  16   30:invokevirtual   #507 <Method long Number.longValue()>
	//*  17   33:lreturn         
		// Misplaced declaration of an exception variable
		catch(IllegalArgumentException illegalargumentexception)
		{
			return _nonNullNumber((Number)deserializationcontext.handleWeirdStringValue(_valueClass, s, "not a valid long value", new Object[0])).longValue();
		}
		return l;
	//*  18   34:astore          5
	//*  19   36:goto            7
	}

	protected final short _parseShortPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		int i = _parseIntPrimitive(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #470 <Method int _parseIntPrimitive(JsonParser, DeserializationContext)>
	//    4    6:istore_3        
		if(_shortOverflow(i))
	//*   5    7:aload_0         
	//*   6    8:iload_3         
	//*   7    9:invokevirtual   #643 <Method boolean _shortOverflow(int)>
	//*   8   12:ifeq            45
			return _nonNullNumber((Number)deserializationcontext.handleWeirdStringValue(_valueClass, String.valueOf(i), "overflow, value cannot be represented as 16-bit value", new Object[0])).shortValue();
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:aload_0         
	//   12   18:getfield        #57  <Field Class _valueClass>
	//   13   21:iload_3         
	//   14   22:invokestatic    #475 <Method String String.valueOf(int)>
	//   15   25:ldc2            #645 <String "overflow, value cannot be represented as 16-bit value">
	//   16   28:iconst_0        
	//   17   29:anewarray       Object[]
	//   18   32:invokevirtual   #449 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//   19   35:checkcast       #479 <Class Number>
	//   20   38:invokevirtual   #481 <Method Number _nonNullNumber(Number)>
	//   21   41:invokevirtual   #649 <Method short Number.shortValue()>
	//   22   44:ireturn         
		else
			return (short)i;
	//   23   45:iload_3         
	//   24   46:int2short       
	//   25   47:ireturn         
	}

	protected final String _parseString(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.getCurrentToken() == JsonToken.VALUE_STRING)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #230 <Method JsonToken JsonParser.getCurrentToken()>
	//*   2    4:getstatic       #245 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       15
			return jsonparser.getText();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #251 <Method String JsonParser.getText()>
	//    6   14:areturn         
		String s = jsonparser.getValueAsString();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #277 <Method String JsonParser.getValueAsString()>
	//    9   19:astore_3        
		if(s != null)
	//*  10   20:aload_3         
	//*  11   21:ifnull          26
			return s;
	//   12   24:aload_3         
	//   13   25:areturn         
		else
			return (String)deserializationcontext.handleUnexpectedToken(java/lang/String, jsonparser);
	//   14   26:aload_2         
	//   15   27:ldc1            #72  <Class String>
	//   16   29:aload_1         
	//   17   30:invokevirtual   #242 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   18   33:checkcast       #72  <Class String>
	//   19   36:areturn         
	}

	protected void _reportFailedNullCoerce(DeserializationContext deserializationcontext, boolean flag, Enum enum, String s)
		throws JsonMappingException
	{
		String s1;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            12
			s1 = "enable";
	//    2    4:ldc2            #653 <String "enable">
	//    3    7:astore          5
		else
	//*   4    9:goto            17
			s1 = "disable";
	//    5   12:ldc2            #655 <String "disable">
	//    6   15:astore          5
		deserializationcontext.reportInputMismatch(((JsonDeserializer) (this)), "Cannot coerce %s to Null value %s (%s `%s.%s` to allow)", new Object[] {
			s, _coercedTypeDesc(), s1, ((Object) (enum)).getClass().getSimpleName(), enum.name()
		});
	//    7   17:aload_1         
	//    8   18:aload_0         
	//    9   19:ldc2            #657 <String "Cannot coerce %s to Null value %s (%s `%s.%s` to allow)">
	//   10   22:iconst_5        
	//   11   23:anewarray       Object[]
	//   12   26:dup             
	//   13   27:iconst_0        
	//   14   28:aload           4
	//   15   30:aastore         
	//   16   31:dup             
	//   17   32:iconst_1        
	//   18   33:aload_0         
	//   19   34:invokevirtual   #659 <Method String _coercedTypeDesc()>
	//   20   37:aastore         
	//   21   38:dup             
	//   22   39:iconst_2        
	//   23   40:aload           5
	//   24   42:aastore         
	//   25   43:dup             
	//   26   44:iconst_3        
	//   27   45:aload_3         
	//   28   46:invokevirtual   #662 <Method Class Object.getClass()>
	//   29   49:invokevirtual   #665 <Method String Class.getSimpleName()>
	//   30   52:aastore         
	//   31   53:dup             
	//   32   54:iconst_4        
	//   33   55:aload_3         
	//   34   56:invokevirtual   #670 <Method String Enum.name()>
	//   35   59:aastore         
	//   36   60:invokevirtual   #673 <Method Object DeserializationContext.reportInputMismatch(JsonDeserializer, String, Object[])>
	//   37   63:pop             
	//   38   64:return          
	}

	protected final boolean _shortOverflow(int i)
	{
		return i < -32768 || i > 32767;
	//    0    0:iload_1         
	//    1    1:sipush          -32768
	//    2    4:icmplt          19
	//    3    7:iload_1         
	//    4    8:sipush          32767
	//    5   11:icmple          17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	protected void _verifyEndArrayForSingle(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #214 <Method JsonToken JsonParser.nextToken()>
	//*   2    4:getstatic       #220 <Field JsonToken JsonToken.END_ARRAY>
	//*   3    7:if_acmpeq       16
			handleMissingEndArrayForSingle(jsonparser, deserializationcontext);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #227 <Method void handleMissingEndArrayForSingle(JsonParser, DeserializationContext)>
	//    8   16:return          
	}

	protected final void _verifyNullForPrimitive(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		if(deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #104 <Field DeserializationFeature DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES>
	//*   2    4:invokevirtual   #107 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*   3    7:ifeq            30
			deserializationcontext.reportInputMismatch(((JsonDeserializer) (this)), "Cannot coerce `null` %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", new Object[] {
				_coercedTypeDesc()
			});
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:ldc2            #676 <String "Cannot coerce `null` %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)">
	//    7   15:iconst_1        
	//    8   16:anewarray       Object[]
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:aload_0         
	//   12   22:invokevirtual   #659 <Method String _coercedTypeDesc()>
	//   13   25:aastore         
	//   14   26:invokevirtual   #673 <Method Object DeserializationContext.reportInputMismatch(JsonDeserializer, String, Object[])>
	//   15   29:pop             
	//   16   30:return          
	}

	protected final void _verifyNullForPrimitiveCoercion(DeserializationContext deserializationcontext, String s)
		throws JsonMappingException
	{
label0:
		{
			boolean flag;
			Object obj;
			if(!deserializationcontext.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #95  <Field MapperFeature MapperFeature.ALLOW_COERCION_OF_SCALARS>
	//*   2    4:invokevirtual   #101 <Method boolean DeserializationContext.isEnabled(MapperFeature)>
	//*   3    7:ifne            20
			{
				obj = ((Object) (MapperFeature.ALLOW_COERCION_OF_SCALARS));
	//    4   10:getstatic       #95  <Field MapperFeature MapperFeature.ALLOW_COERCION_OF_SCALARS>
	//    5   13:astore          4
				flag = true;
	//    6   15:iconst_1        
	//    7   16:istore_3        
			} else
	//*   8   17:goto            37
			{
				if(!deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES))
					break label0;
	//    9   20:aload_1         
	//   10   21:getstatic       #104 <Field DeserializationFeature DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES>
	//   11   24:invokevirtual   #107 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//   12   27:ifeq            75
				obj = ((Object) (DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES));
	//   13   30:getstatic       #104 <Field DeserializationFeature DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES>
	//   14   33:astore          4
				flag = false;
	//   15   35:iconst_0        
	//   16   36:istore_3        
			}
			if(s.isEmpty())
	//*  17   37:aload_2         
	//*  18   38:invokevirtual   #257 <Method boolean String.isEmpty()>
	//*  19   41:ifeq            50
				s = "empty String (\"\")";
	//   20   44:ldc1            #109 <String "empty String (\"\")">
	//   21   46:astore_2        
			else
	//*  22   47:goto            65
				s = String.format("String \"%s\"", new Object[] {
					s
				});
	//   23   50:ldc2            #678 <String "String \"%s\"">
	//   24   53:iconst_1        
	//   25   54:anewarray       Object[]
	//   26   57:dup             
	//   27   58:iconst_0        
	//   28   59:aload_2         
	//   29   60:aastore         
	//   30   61:invokestatic    #270 <Method String String.format(String, Object[])>
	//   31   64:astore_2        
			_reportFailedNullCoerce(deserializationcontext, flag, ((Enum) (obj)), s);
	//   32   65:aload_0         
	//   33   66:aload_1         
	//   34   67:iload_3         
	//   35   68:aload           4
	//   36   70:aload_2         
	//   37   71:invokevirtual   #113 <Method void _reportFailedNullCoerce(DeserializationContext, boolean, Enum, String)>
			return;
	//   38   74:return          
		}
	//   39   75:return          
	}

	protected final void _verifyNullForScalarCoercion(DeserializationContext deserializationcontext, String s)
		throws JsonMappingException
	{
		if(!deserializationcontext.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #95  <Field MapperFeature MapperFeature.ALLOW_COERCION_OF_SCALARS>
	//*   2    4:invokevirtual   #101 <Method boolean DeserializationContext.isEnabled(MapperFeature)>
	//*   3    7:ifne            48
		{
			if(s.isEmpty())
	//*   4   10:aload_2         
	//*   5   11:invokevirtual   #257 <Method boolean String.isEmpty()>
	//*   6   14:ifeq            23
				s = "empty String (\"\")";
	//    7   17:ldc1            #109 <String "empty String (\"\")">
	//    8   19:astore_2        
			else
	//*   9   20:goto            38
				s = String.format("String \"%s\"", new Object[] {
					s
				});
	//   10   23:ldc2            #678 <String "String \"%s\"">
	//   11   26:iconst_1        
	//   12   27:anewarray       Object[]
	//   13   30:dup             
	//   14   31:iconst_0        
	//   15   32:aload_2         
	//   16   33:aastore         
	//   17   34:invokestatic    #270 <Method String String.format(String, Object[])>
	//   18   37:astore_2        
			_reportFailedNullCoerce(deserializationcontext, true, ((Enum) (MapperFeature.ALLOW_COERCION_OF_SCALARS)), s);
	//   19   38:aload_0         
	//   20   39:aload_1         
	//   21   40:iconst_1        
	//   22   41:getstatic       #95  <Field MapperFeature MapperFeature.ALLOW_COERCION_OF_SCALARS>
	//   23   44:aload_2         
	//   24   45:invokevirtual   #113 <Method void _reportFailedNullCoerce(DeserializationContext, boolean, Enum, String)>
		}
	//   25   48:return          
	}

	protected void _verifyNumberForScalarCoercion(DeserializationContext deserializationcontext, JsonParser jsonparser)
		throws IOException
	{
		MapperFeature mapperfeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
	//    0    0:getstatic       #95  <Field MapperFeature MapperFeature.ALLOW_COERCION_OF_SCALARS>
	//    1    3:astore_3        
		if(!deserializationcontext.isEnabled(mapperfeature))
	//*   2    4:aload_1         
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #101 <Method boolean DeserializationContext.isEnabled(MapperFeature)>
	//*   5    9:ifne            56
			deserializationcontext.reportInputMismatch(((JsonDeserializer) (this)), "Cannot coerce Number (%s) %s (enable `%s.%s` to allow)", new Object[] {
				jsonparser.getText(), _coercedTypeDesc(), ((Object) (mapperfeature)).getClass().getSimpleName(), mapperfeature.name()
			});
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:ldc2            #681 <String "Cannot coerce Number (%s) %s (enable `%s.%s` to allow)">
	//    9   17:iconst_4        
	//   10   18:anewarray       Object[]
	//   11   21:dup             
	//   12   22:iconst_0        
	//   13   23:aload_2         
	//   14   24:invokevirtual   #251 <Method String JsonParser.getText()>
	//   15   27:aastore         
	//   16   28:dup             
	//   17   29:iconst_1        
	//   18   30:aload_0         
	//   19   31:invokevirtual   #659 <Method String _coercedTypeDesc()>
	//   20   34:aastore         
	//   21   35:dup             
	//   22   36:iconst_2        
	//   23   37:aload_3         
	//   24   38:invokevirtual   #662 <Method Class Object.getClass()>
	//   25   41:invokevirtual   #665 <Method String Class.getSimpleName()>
	//   26   44:aastore         
	//   27   45:dup             
	//   28   46:iconst_3        
	//   29   47:aload_3         
	//   30   48:invokevirtual   #682 <Method String MapperFeature.name()>
	//   31   51:aastore         
	//   32   52:invokevirtual   #673 <Method Object DeserializationContext.reportInputMismatch(JsonDeserializer, String, Object[])>
	//   33   55:pop             
	//   34   56:return          
	}

	protected void _verifyStringForScalarCoercion(DeserializationContext deserializationcontext, String s)
		throws JsonMappingException
	{
		MapperFeature mapperfeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
	//    0    0:getstatic       #95  <Field MapperFeature MapperFeature.ALLOW_COERCION_OF_SCALARS>
	//    1    3:astore_3        
		if(!deserializationcontext.isEnabled(mapperfeature))
	//*   2    4:aload_1         
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #101 <Method boolean DeserializationContext.isEnabled(MapperFeature)>
	//*   5    9:ifne            53
			deserializationcontext.reportInputMismatch(((JsonDeserializer) (this)), "Cannot coerce String \"%s\" %s (enable `%s.%s` to allow)", new Object[] {
				s, _coercedTypeDesc(), ((Object) (mapperfeature)).getClass().getSimpleName(), mapperfeature.name()
			});
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:ldc2            #685 <String "Cannot coerce String \"%s\" %s (enable `%s.%s` to allow)">
	//    9   17:iconst_4        
	//   10   18:anewarray       Object[]
	//   11   21:dup             
	//   12   22:iconst_0        
	//   13   23:aload_2         
	//   14   24:aastore         
	//   15   25:dup             
	//   16   26:iconst_1        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #659 <Method String _coercedTypeDesc()>
	//   19   31:aastore         
	//   20   32:dup             
	//   21   33:iconst_2        
	//   22   34:aload_3         
	//   23   35:invokevirtual   #662 <Method Class Object.getClass()>
	//   24   38:invokevirtual   #665 <Method String Class.getSimpleName()>
	//   25   41:aastore         
	//   26   42:dup             
	//   27   43:iconst_3        
	//   28   44:aload_3         
	//   29   45:invokevirtual   #682 <Method String MapperFeature.name()>
	//   30   48:aastore         
	//   31   49:invokevirtual   #673 <Method Object DeserializationContext.reportInputMismatch(JsonDeserializer, String, Object[])>
	//   32   52:pop             
	//   33   53:return          
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #692 <Method Object TypeDeserializer.deserializeTypedFromAny(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected NullValueProvider findContentNullProvider(DeserializationContext deserializationcontext, BeanProperty beanproperty, JsonDeserializer jsondeserializer)
		throws JsonMappingException
	{
		Nulls nulls = findContentNullStyle(deserializationcontext, beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #698 <Method Nulls findContentNullStyle(DeserializationContext, BeanProperty)>
	//    4    6:astore          4
		if(nulls == Nulls.SKIP)
	//*   5    8:aload           4
	//*   6   10:getstatic       #363 <Field Nulls Nulls.SKIP>
	//*   7   13:if_acmpne       20
			return ((NullValueProvider) (NullsConstantProvider.skipper()));
	//    8   16:invokestatic    #366 <Method NullsConstantProvider NullsConstantProvider.skipper()>
	//    9   19:areturn         
		deserializationcontext = ((DeserializationContext) (_findNullProvider(deserializationcontext, beanproperty, nulls, jsondeserializer)));
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:aload           4
	//   14   25:aload_3         
	//   15   26:invokevirtual   #700 <Method NullValueProvider _findNullProvider(DeserializationContext, BeanProperty, Nulls, JsonDeserializer)>
	//   16   29:astore_1        
		if(deserializationcontext != null)
	//*  17   30:aload_1         
	//*  18   31:ifnull          36
			return ((NullValueProvider) (deserializationcontext));
	//   19   34:aload_1         
	//   20   35:areturn         
		else
			return ((NullValueProvider) (jsondeserializer));
	//   21   36:aload_3         
	//   22   37:areturn         
	}

	protected Nulls findContentNullStyle(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		if(beanproperty != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          14
			return beanproperty.getMetadata().getContentNulls();
	//    2    4:aload_2         
	//    3    5:invokeinterface #705 <Method PropertyMetadata BeanProperty.getMetadata()>
	//    4   10:invokevirtual   #711 <Method Nulls PropertyMetadata.getContentNulls()>
	//    5   13:areturn         
		else
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
	}

	protected JsonDeserializer findConvertingContentDeserializer(DeserializationContext deserializationcontext, BeanProperty beanproperty, JsonDeserializer jsondeserializer)
		throws JsonMappingException
	{
		Object obj = ((Object) (deserializationcontext.getAnnotationIntrospector()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #717 <Method AnnotationIntrospector DeserializationContext.getAnnotationIntrospector()>
	//    2    4:astore          4
		if(_neitherNull(obj, ((Object) (beanproperty))))
	//*   3    6:aload           4
	//*   4    8:aload_2         
	//*   5    9:invokestatic    #719 <Method boolean _neitherNull(Object, Object)>
	//*   6   12:ifeq            99
		{
			com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedmember = beanproperty.getMember();
	//    7   15:aload_2         
	//    8   16:invokeinterface #723 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//    9   21:astore          5
			if(annotatedmember != null)
	//*  10   23:aload           5
	//*  11   25:ifnull          99
			{
				obj = ((AnnotationIntrospector) (obj)).findDeserializationContentConverter(annotatedmember);
	//   12   28:aload           4
	//   13   30:aload           5
	//   14   32:invokevirtual   #729 <Method Object AnnotationIntrospector.findDeserializationContentConverter(com.fasterxml.jackson.databind.introspect.AnnotatedMember)>
	//   15   35:astore          4
				if(obj != null)
	//*  16   37:aload           4
	//*  17   39:ifnull          99
				{
					Converter converter = deserializationcontext.converterInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (beanproperty.getMember())), obj);
	//   18   42:aload_1         
	//   19   43:aload_2         
	//   20   44:invokeinterface #723 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//   21   49:aload           4
	//   22   51:invokevirtual   #733 <Method Converter DeserializationContext.converterInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//   23   54:astore          5
					JavaType javatype = converter.getInputType(deserializationcontext.getTypeFactory());
	//   24   56:aload           5
	//   25   58:aload_1         
	//   26   59:invokevirtual   #737 <Method com.fasterxml.jackson.databind.type.TypeFactory DeserializationContext.getTypeFactory()>
	//   27   62:invokeinterface #743 <Method JavaType Converter.getInputType(com.fasterxml.jackson.databind.type.TypeFactory)>
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
	//   36   80:invokevirtual   #747 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   37   83:astore          4
					return ((JsonDeserializer) (new StdDelegatingDeserializer(converter, javatype, ((JsonDeserializer) (obj)))));
	//   38   85:new             #749 <Class StdDelegatingDeserializer>
	//   39   88:dup             
	//   40   89:aload           5
	//   41   91:aload           6
	//   42   93:aload           4
	//   43   95:invokespecial   #752 <Method void StdDelegatingDeserializer(Converter, JavaType, JsonDeserializer)>
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
	//    3    3:invokevirtual   #747 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//    4    6:areturn         
	}

	protected Boolean findFormatFeature(DeserializationContext deserializationcontext, BeanProperty beanproperty, Class class1, com.fasterxml.jackson.annotation.JsonFormat.Feature feature)
	{
		deserializationcontext = ((DeserializationContext) (findFormatOverrides(deserializationcontext, beanproperty, class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #762 <Method com.fasterxml.jackson.annotation.JsonFormat$Value findFormatOverrides(DeserializationContext, BeanProperty, Class)>
	//    5    7:astore_1        
		if(deserializationcontext != null)
	//*   6    8:aload_1         
	//*   7    9:ifnull          19
			return ((com.fasterxml.jackson.annotation.JsonFormat.Value) (deserializationcontext)).getFeature(feature);
	//    8   12:aload_1         
	//    9   13:aload           4
	//   10   15:invokevirtual   #768 <Method Boolean com.fasterxml.jackson.annotation.JsonFormat$Value.getFeature(com.fasterxml.jackson.annotation.JsonFormat$Feature)>
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
	//    4    6:invokevirtual   #773 <Method com.fasterxml.jackson.databind.DeserializationConfig DeserializationContext.getConfig()>
	//    5    9:aload_3         
	//    6   10:invokeinterface #777 <Method com.fasterxml.jackson.annotation.JsonFormat$Value BeanProperty.findPropertyFormat(com.fasterxml.jackson.databind.cfg.MapperConfig, Class)>
	//    7   15:areturn         
		else
			return deserializationcontext.getDefaultPropertyFormat(class1);
	//    8   16:aload_1         
	//    9   17:aload_3         
	//   10   18:invokevirtual   #781 <Method com.fasterxml.jackson.annotation.JsonFormat$Value DeserializationContext.getDefaultPropertyFormat(Class)>
	//   11   21:areturn         
	}

	protected final NullValueProvider findValueNullProvider(DeserializationContext deserializationcontext, SettableBeanProperty settablebeanproperty, PropertyMetadata propertymetadata)
		throws JsonMappingException
	{
		if(settablebeanproperty != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          19
			return _findNullProvider(deserializationcontext, ((BeanProperty) (settablebeanproperty)), propertymetadata.getValueNulls(), settablebeanproperty.getValueDeserializer());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #787 <Method Nulls PropertyMetadata.getValueNulls()>
	//    7   11:aload_2         
	//    8   12:invokevirtual   #793 <Method JsonDeserializer SettableBeanProperty.getValueDeserializer()>
	//    9   15:invokevirtual   #700 <Method NullValueProvider _findNullProvider(DeserializationContext, BeanProperty, Nulls, JsonDeserializer)>
	//   10   18:areturn         
		else
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
	}

	public final Class getValueClass()
	{
		return _valueClass;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Class _valueClass>
	//    2    4:areturn         
	}

	public JavaType getValueType()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected void handleMissingEndArrayForSingle(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		deserializationcontext.reportWrongTokenException(((JsonDeserializer) (this)), JsonToken.END_ARRAY, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", new Object[] {
			handledType().getName()
		});
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getstatic       #220 <Field JsonToken JsonToken.END_ARRAY>
	//    3    5:ldc2            #799 <String "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value">
	//    4    8:iconst_1        
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_0         
	//    9   15:invokevirtual   #183 <Method Class handledType()>
	//   10   18:invokevirtual   #802 <Method String Class.getName()>
	//   11   21:aastore         
	//   12   22:invokevirtual   #806 <Method void DeserializationContext.reportWrongTokenException(JsonDeserializer, JsonToken, String, Object[])>
	//   13   25:return          
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
	//    5    8:invokevirtual   #183 <Method Class handledType()>
	//    6   11:astore          5
		if(deserializationcontext.handleUnknownProperty(jsonparser, ((JsonDeserializer) (this)), obj1, s))
	//*   7   13:aload_2         
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:aload           5
	//*  11   18:aload           4
	//*  12   20:invokevirtual   #811 <Method boolean DeserializationContext.handleUnknownProperty(JsonParser, JsonDeserializer, Object, String)>
	//*  13   23:ifeq            27
		{
			return;
	//   14   26:return          
		} else
		{
			jsonparser.skipChildren();
	//   15   27:aload_1         
	//   16   28:invokevirtual   #815 <Method JsonParser JsonParser.skipChildren()>
	//   17   31:pop             
			return;
	//   18   32:return          
		}
	}

	public Class handledType()
	{
		return _valueClass;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Class _valueClass>
	//    2    4:areturn         
	}

	protected boolean isDefaultDeserializer(JsonDeserializer jsondeserializer)
	{
		return ClassUtil.isJacksonStdImpl(((Object) (jsondeserializer)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #820 <Method boolean ClassUtil.isJacksonStdImpl(Object)>
	//    2    4:ireturn         
	}

	protected boolean isDefaultKeyDeserializer(KeyDeserializer keydeserializer)
	{
		return ClassUtil.isJacksonStdImpl(((Object) (keydeserializer)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #820 <Method boolean ClassUtil.isJacksonStdImpl(Object)>
	//    2    4:ireturn         
	}

	protected static final int F_MASK_ACCEPT_ARRAYS;
	protected static final int F_MASK_INT_COERCIONS;
	private static final long serialVersionUID = 1L;
	protected final Class _valueClass;

	static 
	{
		F_MASK_INT_COERCIONS = DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.getMask() | DeserializationFeature.USE_LONG_FOR_INTS.getMask();
	//    0    0:getstatic       #25  <Field DeserializationFeature DeserializationFeature.USE_BIG_INTEGER_FOR_INTS>
	//    1    3:invokevirtual   #29  <Method int DeserializationFeature.getMask()>
	//    2    6:getstatic       #32  <Field DeserializationFeature DeserializationFeature.USE_LONG_FOR_INTS>
	//    3    9:invokevirtual   #29  <Method int DeserializationFeature.getMask()>
	//    4   12:ior             
	//    5   13:putstatic       #34  <Field int F_MASK_INT_COERCIONS>
		F_MASK_ACCEPT_ARRAYS = DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS.getMask() | DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT.getMask();
	//    6   16:getstatic       #37  <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//    7   19:invokevirtual   #29  <Method int DeserializationFeature.getMask()>
	//    8   22:getstatic       #40  <Field DeserializationFeature DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT>
	//    9   25:invokevirtual   #29  <Method int DeserializationFeature.getMask()>
	//   10   28:ior             
	//   11   29:putstatic       #42  <Field int F_MASK_ACCEPT_ARRAYS>
	//*  12   32:return          
	}
}
