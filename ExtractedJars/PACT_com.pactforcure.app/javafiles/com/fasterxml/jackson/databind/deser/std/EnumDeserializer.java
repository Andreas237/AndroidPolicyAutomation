// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.*;
import java.io.IOException;
import java.lang.reflect.Method;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdScalarDeserializer, StdDeserializer

public class EnumDeserializer extends StdScalarDeserializer
{
	protected static class FactoryBasedDeserializer extends StdDeserializer
		implements ContextualDeserializer
	{

		public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
			throws JsonMappingException
		{
			FactoryBasedDeserializer factorybaseddeserializer = this;
		//    0    0:aload_0         
		//    1    1:astore_3        
			if(_deser == null)
		//*   2    2:aload_0         
		//*   3    3:getfield        #36  <Field JsonDeserializer _deser>
		//*   4    6:ifnonnull       42
			{
				factorybaseddeserializer = this;
		//    5    9:aload_0         
		//    6   10:astore_3        
				if(_inputType != java/lang/String)
		//*   7   11:aload_0         
		//*   8   12:getfield        #32  <Field Class _inputType>
		//*   9   15:ldc1            #53  <Class String>
		//*  10   17:if_acmpeq       42
					factorybaseddeserializer = new FactoryBasedDeserializer(this, deserializationcontext.findContextualValueDeserializer(deserializationcontext.constructType(_inputType), beanproperty));
		//   11   20:new             #2   <Class EnumDeserializer$FactoryBasedDeserializer>
		//   12   23:dup             
		//   13   24:aload_0         
		//   14   25:aload_1         
		//   15   26:aload_1         
		//   16   27:aload_0         
		//   17   28:getfield        #32  <Field Class _inputType>
		//   18   31:invokevirtual   #59  <Method com.fasterxml.jackson.databind.JavaType DeserializationContext.constructType(Class)>
		//   19   34:aload_2         
		//   20   35:invokevirtual   #63  <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType, BeanProperty)>
		//   21   38:invokespecial   #65  <Method void EnumDeserializer$FactoryBasedDeserializer(EnumDeserializer$FactoryBasedDeserializer, JsonDeserializer)>
		//   22   41:astore_3        
			}
			return ((JsonDeserializer) (factorybaseddeserializer));
		//   23   42:aload_3         
		//   24   43:areturn         
		}

		public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
			throws IOException
		{
			if(_deser != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #36  <Field JsonDeserializer _deser>
		//*   2    4:ifnull          39
			{
				jsonparser = ((JsonParser) (_deser.deserialize(jsonparser, deserializationcontext)));
		//    3    7:aload_0         
		//    4    8:getfield        #36  <Field JsonDeserializer _deser>
		//    5   11:aload_1         
		//    6   12:aload_2         
		//    7   13:invokevirtual   #77  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
		//    8   16:astore_1        
			} else
		//*   9   17:aload_0         
		//*  10   18:getfield        #34  <Field Method _factory>
		//*  11   21:aload_0         
		//*  12   22:getfield        #27  <Field Class _valueClass>
		//*  13   25:iconst_1        
		//*  14   26:anewarray       Object[]
		//*  15   29:dup             
		//*  16   30:iconst_0        
		//*  17   31:aload_1         
		//*  18   32:aastore         
		//*  19   33:invokevirtual   #85  <Method Object Method.invoke(Object, Object[])>
		//*  20   36:astore_1        
		//*  21   37:aload_1         
		//*  22   38:areturn         
			{
				JsonToken jsontoken = jsonparser.getCurrentToken();
		//   23   39:aload_1         
		//   24   40:invokevirtual   #91  <Method JsonToken JsonParser.getCurrentToken()>
		//   25   43:astore_3        
				if(jsontoken == JsonToken.VALUE_STRING || jsontoken == JsonToken.FIELD_NAME)
		//*  26   44:aload_3         
		//*  27   45:getstatic       #97  <Field JsonToken JsonToken.VALUE_STRING>
		//*  28   48:if_acmpeq       58
		//*  29   51:aload_3         
		//*  30   52:getstatic       #100 <Field JsonToken JsonToken.FIELD_NAME>
		//*  31   55:if_acmpne       66
					jsonparser = ((JsonParser) (jsonparser.getText()));
		//   32   58:aload_1         
		//   33   59:invokevirtual   #104 <Method String JsonParser.getText()>
		//   34   62:astore_1        
				else
		//*  35   63:goto            17
					jsonparser = ((JsonParser) (jsonparser.getValueAsString()));
		//   36   66:aload_1         
		//   37   67:invokevirtual   #107 <Method String JsonParser.getValueAsString()>
		//   38   70:astore_1        
			}
			try
			{
				jsonparser = ((JsonParser) (_factory.invoke(((Object) (_valueClass)), new Object[] {
					jsonparser
				})));
			}
		//*  39   71:goto            17
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
		//*  40   74:astore_1        
			{
				jsonparser = ((JsonParser) (ClassUtil.getRootCause(((Throwable) (jsonparser)))));
		//   41   75:aload_1         
		//   42   76:invokestatic    #113 <Method Throwable ClassUtil.getRootCause(Throwable)>
		//   43   79:astore_1        
				if(jsonparser instanceof IOException)
		//*  44   80:aload_1         
		//*  45   81:instanceof      #71  <Class IOException>
		//*  46   84:ifeq            92
					throw (IOException)jsonparser;
		//   47   87:aload_1         
		//   48   88:checkcast       #71  <Class IOException>
		//   49   91:athrow          
				else
					throw deserializationcontext.instantiationException(_valueClass, ((Throwable) (jsonparser)));
		//   50   92:aload_2         
		//   51   93:aload_0         
		//   52   94:getfield        #27  <Field Class _valueClass>
		//   53   97:aload_1         
		//   54   98:invokevirtual   #117 <Method JsonMappingException DeserializationContext.instantiationException(Class, Throwable)>
		//   55  101:athrow          
			}
			return ((Object) (jsonparser));
		}

		public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
			throws IOException
		{
			if(_deser == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #36  <Field JsonDeserializer _deser>
		//*   2    4:ifnonnull       14
				return deserialize(jsonparser, deserializationcontext);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokevirtual   #120 <Method Object deserialize(JsonParser, DeserializationContext)>
		//    7   13:areturn         
			else
				return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
		//    8   14:aload_3         
		//    9   15:aload_1         
		//   10   16:aload_2         
		//   11   17:invokevirtual   #125 <Method Object TypeDeserializer.deserializeTypedFromAny(JsonParser, DeserializationContext)>
		//   12   20:areturn         
		}

		private static final long serialVersionUID = 1L;
		protected final JsonDeserializer _deser;
		protected final Method _factory;
		protected final Class _inputType;

		protected FactoryBasedDeserializer(FactoryBasedDeserializer factorybaseddeserializer, JsonDeserializer jsondeserializer)
		{
			super(factorybaseddeserializer._valueClass);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #27  <Field Class _valueClass>
		//    3    5:invokespecial   #30  <Method void StdDeserializer(Class)>
			_inputType = factorybaseddeserializer._inputType;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:getfield        #32  <Field Class _inputType>
		//    7   13:putfield        #32  <Field Class _inputType>
			_factory = factorybaseddeserializer._factory;
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:getfield        #34  <Field Method _factory>
		//   11   21:putfield        #34  <Field Method _factory>
			_deser = jsondeserializer;
		//   12   24:aload_0         
		//   13   25:aload_2         
		//   14   26:putfield        #36  <Field JsonDeserializer _deser>
		//   15   29:return          
		}

		public FactoryBasedDeserializer(Class class1, AnnotatedMethod annotatedmethod, Class class2)
		{
			super(class1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #30  <Method void StdDeserializer(Class)>
			_factory = annotatedmethod.getAnnotated();
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokevirtual   #46  <Method Method AnnotatedMethod.getAnnotated()>
		//    6   10:putfield        #34  <Field Method _factory>
			_inputType = class2;
		//    7   13:aload_0         
		//    8   14:aload_3         
		//    9   15:putfield        #32  <Field Class _inputType>
			_deser = null;
		//   10   18:aload_0         
		//   11   19:aconst_null     
		//   12   20:putfield        #36  <Field JsonDeserializer _deser>
		//   13   23:return          
		}
	}


	public EnumDeserializer(EnumResolver enumresolver)
	{
		super(enumresolver.getEnumClass());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #25  <Method Class EnumResolver.getEnumClass()>
	//    3    5:invokespecial   #28  <Method void StdScalarDeserializer(Class)>
		_enumLookup = enumresolver.constructLookup();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #32  <Method CompactStringObjectMap EnumResolver.constructLookup()>
	//    7   13:putfield        #34  <Field CompactStringObjectMap _enumLookup>
		_enumsByIndex = ((Object []) (enumresolver.getRawEnums()));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #38  <Method Enum[] EnumResolver.getRawEnums()>
	//   11   21:putfield        #40  <Field Object[] _enumsByIndex>
	//   12   24:return          
	}

	private final Object _deserializeAltString(JsonParser jsonparser, DeserializationContext deserializationcontext, String s)
		throws IOException
	{
		s = s.trim();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #53  <Method String String.trim()>
	//    2    4:astore_3        
		if(s.length() != 0) goto _L2; else goto _L1
	//    3    5:aload_3         
	//    4    6:invokevirtual   #57  <Method int String.length()>
	//    5    9:ifne            24
_L1:
		if(!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) goto _L4; else goto _L3
	//    6   12:aload_2         
	//    7   13:getstatic       #63  <Field DeserializationFeature DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT>
	//    8   16:invokevirtual   #69  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//    9   19:ifeq            95
_L3:
		return ((Object) (null));
	//   10   22:aconst_null     
	//   11   23:areturn         
_L2:
		char c = s.charAt(0);
	//   12   24:aload_3         
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #73  <Method char String.charAt(int)>
	//   15   29:istore          4
		if(c < '0' || c > '9')
			continue; /* Loop/switch isn't completed */
	//   16   31:iload           4
	//   17   33:bipush          48
	//   18   35:icmplt          95
	//   19   38:iload           4
	//   20   40:bipush          57
	//   21   42:icmpgt          95
		int i;
		i = Integer.parseInt(s);
	//   22   45:aload_3         
	//   23   46:invokestatic    #79  <Method int Integer.parseInt(String)>
	//   24   49:istore          4
		if(deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS))
	//*  25   51:aload_2         
	//*  26   52:getstatic       #82  <Field DeserializationFeature DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS>
	//*  27   55:invokevirtual   #69  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  28   58:ifeq            69
			_failOnNumber(deserializationcontext, jsonparser, i);
	//   29   61:aload_0         
	//   30   62:aload_2         
	//   31   63:aload_1         
	//   32   64:iload           4
	//   33   66:invokevirtual   #86  <Method void _failOnNumber(DeserializationContext, JsonParser, int)>
		if(i < 0)
			continue; /* Loop/switch isn't completed */
	//   34   69:iload           4
	//   35   71:iflt            95
		if(i > _enumsByIndex.length)
			continue; /* Loop/switch isn't completed */
	//   36   74:iload           4
	//   37   76:aload_0         
	//   38   77:getfield        #40  <Field Object[] _enumsByIndex>
	//   39   80:arraylength     
	//   40   81:icmpgt          95
		jsonparser = ((JsonParser) (_enumsByIndex[i]));
	//   41   84:aload_0         
	//   42   85:getfield        #40  <Field Object[] _enumsByIndex>
	//   43   88:iload           4
	//   44   90:aaload          
	//   45   91:astore_1        
		return ((Object) (jsonparser));
	//   46   92:aload_1         
	//   47   93:areturn         
		jsonparser;
	//   48   94:astore_1        
_L4:
		if(deserializationcontext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) goto _L3; else goto _L5
	//   49   95:aload_2         
	//   50   96:getstatic       #89  <Field DeserializationFeature DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL>
	//   51   99:invokevirtual   #69  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//   52  102:ifne            22
_L5:
		throw deserializationcontext.weirdStringException(s, _enumClass(), (new StringBuilder()).append("value not one of declared Enum instance names: ").append(((Object) (_enumLookup.keys()))).toString());
	//   53  105:aload_2         
	//   54  106:aload_3         
	//   55  107:aload_0         
	//   56  108:invokevirtual   #92  <Method Class _enumClass()>
	//   57  111:new             #94  <Class StringBuilder>
	//   58  114:dup             
	//   59  115:invokespecial   #97  <Method void StringBuilder()>
	//   60  118:ldc1            #99  <String "value not one of declared Enum instance names: ">
	//   61  120:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   62  123:aload_0         
	//   63  124:getfield        #34  <Field CompactStringObjectMap _enumLookup>
	//   64  127:invokevirtual   #109 <Method java.util.List CompactStringObjectMap.keys()>
	//   65  130:invokevirtual   #112 <Method StringBuilder StringBuilder.append(Object)>
	//   66  133:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   67  136:invokevirtual   #119 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   68  139:athrow          
	}

	public static JsonDeserializer deserializerForCreator(DeserializationConfig deserializationconfig, Class class1, AnnotatedMethod annotatedmethod)
	{
		Class class2 = annotatedmethod.getRawParameterType(0);
	//    0    0:aload_2         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #128 <Method Class AnnotatedMethod.getRawParameterType(int)>
	//    3    5:astore_3        
		if(deserializationconfig.canOverrideAccessModifiers())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #134 <Method boolean DeserializationConfig.canOverrideAccessModifiers()>
	//*   6   10:ifeq            27
			ClassUtil.checkAndFixAccess(((java.lang.reflect.Member) (annotatedmethod.getMember())), deserializationconfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
	//    7   13:aload_2         
	//    8   14:invokevirtual   #138 <Method Method AnnotatedMethod.getMember()>
	//    9   17:aload_0         
	//   10   18:getstatic       #144 <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//   11   21:invokevirtual   #147 <Method boolean DeserializationConfig.isEnabled(MapperFeature)>
	//   12   24:invokestatic    #153 <Method void ClassUtil.checkAndFixAccess(java.lang.reflect.Member, boolean)>
		return ((JsonDeserializer) (new FactoryBasedDeserializer(class1, annotatedmethod, class2)));
	//   13   27:new             #7   <Class EnumDeserializer$FactoryBasedDeserializer>
	//   14   30:dup             
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:aload_3         
	//   18   34:invokespecial   #156 <Method void EnumDeserializer$FactoryBasedDeserializer(Class, AnnotatedMethod, Class)>
	//   19   37:areturn         
	}

	protected Object _deserializeOther(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		jsonparser.getCurrentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #166 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:pop             
		if(deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS) && jsonparser.isExpectedStartArrayToken())
	//*   3    5:aload_2         
	//*   4    6:getstatic       #169 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*   5    9:invokevirtual   #69  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*   6   12:ifeq            83
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #172 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   9   19:ifeq            83
		{
			jsonparser.nextToken();
	//   10   22:aload_1         
	//   11   23:invokevirtual   #175 <Method JsonToken JsonParser.nextToken()>
	//   12   26:pop             
			Object obj = deserialize(jsonparser, deserializationcontext);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:invokevirtual   #178 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   17   33:astore_3        
			if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//*  18   34:aload_1         
	//*  19   35:invokevirtual   #175 <Method JsonToken JsonParser.nextToken()>
	//*  20   38:getstatic       #184 <Field JsonToken JsonToken.END_ARRAY>
	//*  21   41:if_acmpeq       92
				throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, (new StringBuilder()).append("Attempted to unwrap single value array for single '").append(_enumClass().getName()).append("' value but there was more than a single value in the array").toString());
	//   22   44:aload_2         
	//   23   45:aload_1         
	//   24   46:getstatic       #184 <Field JsonToken JsonToken.END_ARRAY>
	//   25   49:new             #94  <Class StringBuilder>
	//   26   52:dup             
	//   27   53:invokespecial   #97  <Method void StringBuilder()>
	//   28   56:ldc1            #186 <String "Attempted to unwrap single value array for single '">
	//   29   58:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   30   61:aload_0         
	//   31   62:invokevirtual   #92  <Method Class _enumClass()>
	//   32   65:invokevirtual   #191 <Method String Class.getName()>
	//   33   68:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   34   71:ldc1            #193 <String "' value but there was more than a single value in the array">
	//   35   73:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   36   76:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   37   79:invokevirtual   #197 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//   38   82:athrow          
			else
	//*  39   83:aload_2         
	//*  40   84:aload_0         
	//*  41   85:invokevirtual   #92  <Method Class _enumClass()>
	//*  42   88:invokevirtual   #201 <Method JsonMappingException DeserializationContext.mappingException(Class)>
	//*  43   91:athrow          
				return obj;
	//   44   92:aload_3         
	//   45   93:areturn         
		} else
		{
			throw deserializationcontext.mappingException(_enumClass());
		}
	}

	protected Class _enumClass()
	{
		return handledType();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #204 <Method Class handledType()>
	//    2    4:areturn         
	}

	protected void _failOnNumber(DeserializationContext deserializationcontext, JsonParser jsonparser, int i)
		throws IOException
	{
		throw InvalidFormatException.from(jsonparser, String.format("Not allowed to deserialize Enum value out of JSON number (%d): disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[] {
			Integer.valueOf(i)
		}), ((Object) (Integer.valueOf(i))), _enumClass());
	//    0    0:aload_2         
	//    1    1:ldc1            #207 <String "Not allowed to deserialize Enum value out of JSON number (%d): disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow">
	//    2    3:iconst_1        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:iload_3         
	//    7   10:invokestatic    #213 <Method Integer Integer.valueOf(int)>
	//    8   13:aastore         
	//    9   14:invokestatic    #217 <Method String String.format(String, Object[])>
	//   10   17:iload_3         
	//   11   18:invokestatic    #213 <Method Integer Integer.valueOf(int)>
	//   12   21:aload_0         
	//   13   22:invokevirtual   #92  <Method Class _enumClass()>
	//   14   25:invokestatic    #223 <Method InvalidFormatException InvalidFormatException.from(JsonParser, String, Object, Class)>
	//   15   28:athrow          
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj = ((Object) (jsonparser.getCurrentToken()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #166 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          4
		if(obj == JsonToken.VALUE_STRING || obj == JsonToken.FIELD_NAME)
	//*   3    6:aload           4
	//*   4    8:getstatic       #226 <Field JsonToken JsonToken.VALUE_STRING>
	//*   5   11:if_acmpeq       22
	//*   6   14:aload           4
	//*   7   16:getstatic       #229 <Field JsonToken JsonToken.FIELD_NAME>
	//*   8   19:if_acmpne       61
		{
			String s = jsonparser.getText();
	//    9   22:aload_1         
	//   10   23:invokevirtual   #232 <Method String JsonParser.getText()>
	//   11   26:astore          6
			Object obj1 = _enumLookup.find(s);
	//   12   28:aload_0         
	//   13   29:getfield        #34  <Field CompactStringObjectMap _enumLookup>
	//   14   32:aload           6
	//   15   34:invokevirtual   #236 <Method Object CompactStringObjectMap.find(String)>
	//   16   37:astore          5
			obj = obj1;
	//   17   39:aload           5
	//   18   41:astore          4
			if(obj1 == null)
	//*  19   43:aload           5
	//*  20   45:ifnonnull       58
				obj = _deserializeAltString(jsonparser, deserializationcontext, s);
	//   21   48:aload_0         
	//   22   49:aload_1         
	//   23   50:aload_2         
	//   24   51:aload           6
	//   25   53:invokespecial   #238 <Method Object _deserializeAltString(JsonParser, DeserializationContext, String)>
	//   26   56:astore          4
			return obj;
	//   27   58:aload           4
	//   28   60:areturn         
		}
		if(obj == JsonToken.VALUE_NUMBER_INT)
	//*  29   61:aload           4
	//*  30   63:getstatic       #241 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  31   66:if_acmpne       166
		{
			int i = jsonparser.getIntValue();
	//   32   69:aload_1         
	//   33   70:invokevirtual   #244 <Method int JsonParser.getIntValue()>
	//   34   73:istore_3        
			if(deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS))
	//*  35   74:aload_2         
	//*  36   75:getstatic       #82  <Field DeserializationFeature DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS>
	//*  37   78:invokevirtual   #69  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  38   81:ifeq            91
				_failOnNumber(deserializationcontext, jsonparser, i);
	//   39   84:aload_0         
	//   40   85:aload_2         
	//   41   86:aload_1         
	//   42   87:iload_3         
	//   43   88:invokevirtual   #86  <Method void _failOnNumber(DeserializationContext, JsonParser, int)>
			if(i >= 0 && i <= _enumsByIndex.length)
	//*  44   91:iload_3         
	//*  45   92:iflt            111
	//*  46   95:iload_3         
	//*  47   96:aload_0         
	//*  48   97:getfield        #40  <Field Object[] _enumsByIndex>
	//*  49  100:arraylength     
	//*  50  101:icmpgt          111
				return _enumsByIndex[i];
	//   51  104:aload_0         
	//   52  105:getfield        #40  <Field Object[] _enumsByIndex>
	//   53  108:iload_3         
	//   54  109:aaload          
	//   55  110:areturn         
			if(!deserializationcontext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
	//*  56  111:aload_2         
	//*  57  112:getstatic       #89  <Field DeserializationFeature DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL>
	//*  58  115:invokevirtual   #69  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  59  118:ifne            164
				throw deserializationcontext.weirdNumberException(((Number) (Integer.valueOf(i))), _enumClass(), (new StringBuilder()).append("index value outside legal index range [0..").append(_enumsByIndex.length - 1).append("]").toString());
	//   60  121:aload_2         
	//   61  122:iload_3         
	//   62  123:invokestatic    #213 <Method Integer Integer.valueOf(int)>
	//   63  126:aload_0         
	//   64  127:invokevirtual   #92  <Method Class _enumClass()>
	//   65  130:new             #94  <Class StringBuilder>
	//   66  133:dup             
	//   67  134:invokespecial   #97  <Method void StringBuilder()>
	//   68  137:ldc1            #246 <String "index value outside legal index range [0..">
	//   69  139:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   70  142:aload_0         
	//   71  143:getfield        #40  <Field Object[] _enumsByIndex>
	//   72  146:arraylength     
	//   73  147:iconst_1        
	//   74  148:isub            
	//   75  149:invokevirtual   #249 <Method StringBuilder StringBuilder.append(int)>
	//   76  152:ldc1            #251 <String "]">
	//   77  154:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   78  157:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   79  160:invokevirtual   #255 <Method JsonMappingException DeserializationContext.weirdNumberException(Number, Class, String)>
	//   80  163:athrow          
			else
				return ((Object) (null));
	//   81  164:aconst_null     
	//   82  165:areturn         
		} else
		{
			return _deserializeOther(jsonparser, deserializationcontext);
	//   83  166:aload_0         
	//   84  167:aload_1         
	//   85  168:aload_2         
	//   86  169:invokevirtual   #257 <Method Object _deserializeOther(JsonParser, DeserializationContext)>
	//   87  172:areturn         
		}
	}

	public boolean isCachable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final long serialVersionUID = 1L;
	protected final CompactStringObjectMap _enumLookup;
	protected Object _enumsByIndex[];
}
