// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.*;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdScalarDeserializer, FactoryBasedEnumDeserializer

public class EnumDeserializer extends StdScalarDeserializer
	implements ContextualDeserializer
{

	protected EnumDeserializer(EnumDeserializer enumdeserializer, Boolean boolean1)
	{
		super(((StdScalarDeserializer) (enumdeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void StdScalarDeserializer(StdScalarDeserializer)>
		_lookupByName = enumdeserializer._lookupByName;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #29  <Field CompactStringObjectMap _lookupByName>
	//    6   10:putfield        #29  <Field CompactStringObjectMap _lookupByName>
		_enumsByIndex = enumdeserializer._enumsByIndex;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #31  <Field Object[] _enumsByIndex>
	//   10   18:putfield        #31  <Field Object[] _enumsByIndex>
		_enumDefaultValue = enumdeserializer._enumDefaultValue;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getfield        #33  <Field Enum _enumDefaultValue>
	//   14   26:putfield        #33  <Field Enum _enumDefaultValue>
		_caseInsensitive = boolean1;
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #35  <Field Boolean _caseInsensitive>
	//   18   34:return          
	}

	public EnumDeserializer(EnumResolver enumresolver, Boolean boolean1)
	{
		super(enumresolver.getEnumClass());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #43  <Method Class EnumResolver.getEnumClass()>
	//    3    5:invokespecial   #46  <Method void StdScalarDeserializer(Class)>
		_lookupByName = enumresolver.constructLookup();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #50  <Method CompactStringObjectMap EnumResolver.constructLookup()>
	//    7   13:putfield        #29  <Field CompactStringObjectMap _lookupByName>
		_enumsByIndex = ((Object []) (enumresolver.getRawEnums()));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #54  <Method Enum[] EnumResolver.getRawEnums()>
	//   11   21:putfield        #31  <Field Object[] _enumsByIndex>
		_enumDefaultValue = enumresolver.getDefaultValue();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #58  <Method Enum EnumResolver.getDefaultValue()>
	//   15   29:putfield        #33  <Field Enum _enumDefaultValue>
		_caseInsensitive = boolean1;
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:putfield        #35  <Field Boolean _caseInsensitive>
	//   19   37:return          
	}

	private final Object _deserializeAltString(JsonParser jsonparser, DeserializationContext deserializationcontext, CompactStringObjectMap compactstringobjectmap, String s)
		throws IOException
	{
		jsonparser = ((JsonParser) (s.trim()));
	//    0    0:aload           4
	//    1    2:invokevirtual   #70  <Method String String.trim()>
	//    2    5:astore_1        
		if(((String) (jsonparser)).length() == 0)
	//*   3    6:aload_1         
	//*   4    7:invokevirtual   #74  <Method int String.length()>
	//*   5   10:ifne            29
		{
			if(deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT))
	//*   6   13:aload_2         
	//*   7   14:getstatic       #80  <Field DeserializationFeature DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT>
	//*   8   17:invokevirtual   #86  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*   9   20:ifeq            147
				return getEmptyValue(deserializationcontext);
	//   10   23:aload_0         
	//   11   24:aload_2         
	//   12   25:invokevirtual   #90  <Method Object getEmptyValue(DeserializationContext)>
	//   13   28:areturn         
			break MISSING_BLOCK_LABEL_147;
		}
		if(Boolean.TRUE.equals(((Object) (_caseInsensitive))))
	//*  14   29:getstatic       #95  <Field Boolean Boolean.TRUE>
	//*  15   32:aload_0         
	//*  16   33:getfield        #35  <Field Boolean _caseInsensitive>
	//*  17   36:invokevirtual   #99  <Method boolean Boolean.equals(Object)>
	//*  18   39:ifeq            57
		{
			s = ((String) (compactstringobjectmap.findCaseInsensitive(((String) (jsonparser)))));
	//   19   42:aload_3         
	//   20   43:aload_1         
	//   21   44:invokevirtual   #105 <Method Object CompactStringObjectMap.findCaseInsensitive(String)>
	//   22   47:astore          4
			if(s != null)
	//*  23   49:aload           4
	//*  24   51:ifnull          147
				return ((Object) (s));
	//   25   54:aload           4
	//   26   56:areturn         
			break MISSING_BLOCK_LABEL_147;
		}
		if(deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS))
			break MISSING_BLOCK_LABEL_147;
	//   27   57:aload_2         
	//   28   58:getstatic       #108 <Field DeserializationFeature DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS>
	//   29   61:invokevirtual   #86  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//   30   64:ifne            147
		char c = ((String) (jsonparser)).charAt(0);
	//   31   67:aload_1         
	//   32   68:iconst_0        
	//   33   69:invokevirtual   #112 <Method char String.charAt(int)>
	//   34   72:istore          5
		if(c < '0' || c > '9')
			break MISSING_BLOCK_LABEL_147;
	//   35   74:iload           5
	//   36   76:bipush          48
	//   37   78:icmplt          147
	//   38   81:iload           5
	//   39   83:bipush          57
	//   40   85:icmpgt          147
		int i;
		i = Integer.parseInt(((String) (jsonparser)));
	//   41   88:aload_1         
	//   42   89:invokestatic    #118 <Method int Integer.parseInt(String)>
	//   43   92:istore          5
		if(!deserializationcontext.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS))
	//*  44   94:aload_2         
	//*  45   95:getstatic       #124 <Field MapperFeature MapperFeature.ALLOW_COERCION_OF_SCALARS>
	//*  46   98:invokevirtual   #127 <Method boolean DeserializationContext.isEnabled(MapperFeature)>
	//*  47  101:ifne            120
			return deserializationcontext.handleWeirdStringValue(_enumClass(), ((String) (jsonparser)), "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use", new Object[0]);
	//   48  104:aload_2         
	//   49  105:aload_0         
	//   50  106:invokevirtual   #130 <Method Class _enumClass()>
	//   51  109:aload_1         
	//   52  110:ldc1            #132 <String "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use">
	//   53  112:iconst_0        
	//   54  113:anewarray       Object[]
	//   55  116:invokevirtual   #138 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//   56  119:areturn         
		if(i < 0)
			break MISSING_BLOCK_LABEL_147;
	//   57  120:iload           5
	//   58  122:iflt            147
		if(i >= _enumsByIndex.length)
			break MISSING_BLOCK_LABEL_147;
	//   59  125:iload           5
	//   60  127:aload_0         
	//   61  128:getfield        #31  <Field Object[] _enumsByIndex>
	//   62  131:arraylength     
	//   63  132:icmpge          147
		s = ((String) (_enumsByIndex[i]));
	//   64  135:aload_0         
	//   65  136:getfield        #31  <Field Object[] _enumsByIndex>
	//   66  139:iload           5
	//   67  141:aaload          
	//   68  142:astore          4
		return ((Object) (s));
	//   69  144:aload           4
	//   70  146:areturn         
_L2:
		if(_enumDefaultValue != null && deserializationcontext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE))
	//*  71  147:aload_0         
	//*  72  148:getfield        #33  <Field Enum _enumDefaultValue>
	//*  73  151:ifnull          169
	//*  74  154:aload_2         
	//*  75  155:getstatic       #141 <Field DeserializationFeature DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE>
	//*  76  158:invokevirtual   #86  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  77  161:ifeq            169
			return ((Object) (_enumDefaultValue));
	//   78  164:aload_0         
	//   79  165:getfield        #33  <Field Enum _enumDefaultValue>
	//   80  168:areturn         
		if(!deserializationcontext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
	//*  81  169:aload_2         
	//*  82  170:getstatic       #144 <Field DeserializationFeature DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL>
	//*  83  173:invokevirtual   #86  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  84  176:ifne            202
			return deserializationcontext.handleWeirdStringValue(_enumClass(), ((String) (jsonparser)), "value not one of declared Enum instance names: %s", new Object[] {
				compactstringobjectmap.keys()
			});
	//   85  179:aload_2         
	//   86  180:aload_0         
	//   87  181:invokevirtual   #130 <Method Class _enumClass()>
	//   88  184:aload_1         
	//   89  185:ldc1            #146 <String "value not one of declared Enum instance names: %s">
	//   90  187:iconst_1        
	//   91  188:anewarray       Object[]
	//   92  191:dup             
	//   93  192:iconst_0        
	//   94  193:aload_3         
	//   95  194:invokevirtual   #150 <Method java.util.List CompactStringObjectMap.keys()>
	//   96  197:aastore         
	//   97  198:invokevirtual   #138 <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//   98  201:areturn         
		else
			return ((Object) (null));
	//   99  202:aconst_null     
	//  100  203:areturn         
		s;
	//  101  204:astore          4
		if(true) goto _L2; else goto _L1
	//  102  206:goto            147
_L1:
	}

	public static JsonDeserializer deserializerForCreator(DeserializationConfig deserializationconfig, Class class1, AnnotatedMethod annotatedmethod, ValueInstantiator valueinstantiator, SettableBeanProperty asettablebeanproperty[])
	{
		if(deserializationconfig.canOverrideAccessModifiers())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #159 <Method boolean DeserializationConfig.canOverrideAccessModifiers()>
	//*   2    4:ifeq            21
			ClassUtil.checkAndFixAccess(((java.lang.reflect.Member) (annotatedmethod.getMember())), deserializationconfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
	//    3    7:aload_2         
	//    4    8:invokevirtual   #165 <Method java.lang.reflect.Method AnnotatedMethod.getMember()>
	//    5   11:aload_0         
	//    6   12:getstatic       #168 <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//    7   15:invokevirtual   #169 <Method boolean DeserializationConfig.isEnabled(MapperFeature)>
	//    8   18:invokestatic    #175 <Method void ClassUtil.checkAndFixAccess(java.lang.reflect.Member, boolean)>
		return ((JsonDeserializer) (new FactoryBasedEnumDeserializer(class1, annotatedmethod, annotatedmethod.getParameterType(0), valueinstantiator, asettablebeanproperty)));
	//    9   21:new             #177 <Class FactoryBasedEnumDeserializer>
	//   10   24:dup             
	//   11   25:aload_1         
	//   12   26:aload_2         
	//   13   27:aload_2         
	//   14   28:iconst_0        
	//   15   29:invokevirtual   #181 <Method com.fasterxml.jackson.databind.JavaType AnnotatedMethod.getParameterType(int)>
	//   16   32:aload_3         
	//   17   33:aload           4
	//   18   35:invokespecial   #184 <Method void FactoryBasedEnumDeserializer(Class, AnnotatedMethod, com.fasterxml.jackson.databind.JavaType, ValueInstantiator, SettableBeanProperty[])>
	//   19   38:areturn         
	}

	public static JsonDeserializer deserializerForNoArgsCreator(DeserializationConfig deserializationconfig, Class class1, AnnotatedMethod annotatedmethod)
	{
		if(deserializationconfig.canOverrideAccessModifiers())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #159 <Method boolean DeserializationConfig.canOverrideAccessModifiers()>
	//*   2    4:ifeq            21
			ClassUtil.checkAndFixAccess(((java.lang.reflect.Member) (annotatedmethod.getMember())), deserializationconfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
	//    3    7:aload_2         
	//    4    8:invokevirtual   #165 <Method java.lang.reflect.Method AnnotatedMethod.getMember()>
	//    5   11:aload_0         
	//    6   12:getstatic       #168 <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//    7   15:invokevirtual   #169 <Method boolean DeserializationConfig.isEnabled(MapperFeature)>
	//    8   18:invokestatic    #175 <Method void ClassUtil.checkAndFixAccess(java.lang.reflect.Member, boolean)>
		return ((JsonDeserializer) (new FactoryBasedEnumDeserializer(class1, annotatedmethod)));
	//    9   21:new             #177 <Class FactoryBasedEnumDeserializer>
	//   10   24:dup             
	//   11   25:aload_1         
	//   12   26:aload_2         
	//   13   27:invokespecial   #191 <Method void FactoryBasedEnumDeserializer(Class, AnnotatedMethod)>
	//   14   30:areturn         
	}

	protected Object _deserializeOther(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.START_ARRAY))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #200 <Field JsonToken JsonToken.START_ARRAY>
	//*   2    4:invokevirtual   #206 <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            17
			return _deserializeFromArray(jsonparser, deserializationcontext);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #209 <Method Object _deserializeFromArray(JsonParser, DeserializationContext)>
	//    8   16:areturn         
		else
			return deserializationcontext.handleUnexpectedToken(_enumClass(), jsonparser);
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #130 <Method Class _enumClass()>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #213 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   14   26:areturn         
	}

	protected Class _enumClass()
	{
		return handledType();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #216 <Method Class handledType()>
	//    2    4:areturn         
	}

	protected CompactStringObjectMap _getToStringLookup(DeserializationContext deserializationcontext)
	{
		CompactStringObjectMap compactstringobjectmap;
		compactstringobjectmap = _lookupByToString;
	//    0    0:aload_0         
	//    1    1:getfield        #221 <Field CompactStringObjectMap _lookupByToString>
	//    2    4:astore_2        
		if(compactstringobjectmap != null)
			break MISSING_BLOCK_LABEL_40;
	//    3    5:aload_2         
	//    4    6:ifnonnull       40
		this;
	//    5    9:aload_0         
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		deserializationcontext = ((DeserializationContext) (EnumResolver.constructUnsafeUsingToString(_enumClass(), deserializationcontext.getAnnotationIntrospector()).constructLookup()));
	//    7   11:aload_0         
	//    8   12:invokevirtual   #130 <Method Class _enumClass()>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #225 <Method com.fasterxml.jackson.databind.AnnotationIntrospector DeserializationContext.getAnnotationIntrospector()>
	//   11   19:invokestatic    #229 <Method EnumResolver EnumResolver.constructUnsafeUsingToString(Class, com.fasterxml.jackson.databind.AnnotationIntrospector)>
	//   12   22:invokevirtual   #50  <Method CompactStringObjectMap EnumResolver.constructLookup()>
	//   13   25:astore_1        
		this;
	//   14   26:aload_0         
		JVM INSTR monitorexit ;
	//   15   27:monitorexit     
		_lookupByToString = ((CompactStringObjectMap) (deserializationcontext));
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:putfield        #221 <Field CompactStringObjectMap _lookupByToString>
		return ((CompactStringObjectMap) (deserializationcontext));
	//   19   33:aload_1         
	//   20   34:areturn         
		deserializationcontext;
	//   21   35:astore_1        
		this;
	//   22   36:aload_0         
		JVM INSTR monitorexit ;
	//   23   37:monitorexit     
		throw deserializationcontext;
	//   24   38:aload_1         
	//   25   39:athrow          
		return compactstringobjectmap;
	//   26   40:aload_2         
	//   27   41:areturn         
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		beanproperty = ((BeanProperty) (findFormatFeature(deserializationcontext, beanproperty, handledType(), com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:invokevirtual   #216 <Method Class handledType()>
	//    5    7:getstatic       #239 <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES>
	//    6   10:invokevirtual   #243 <Method Boolean findFormatFeature(DeserializationContext, BeanProperty, Class, com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//    7   13:astore_2        
		deserializationcontext = ((DeserializationContext) (beanproperty));
	//    8   14:aload_2         
	//    9   15:astore_1        
		if(beanproperty == null)
	//*  10   16:aload_2         
	//*  11   17:ifnonnull       25
			deserializationcontext = ((DeserializationContext) (_caseInsensitive));
	//   12   20:aload_0         
	//   13   21:getfield        #35  <Field Boolean _caseInsensitive>
	//   14   24:astore_1        
		return ((JsonDeserializer) (withResolved(((Boolean) (deserializationcontext)))));
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:invokevirtual   #247 <Method EnumDeserializer withResolved(Boolean)>
	//   18   30:areturn         
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj = ((Object) (jsonparser.getCurrentToken()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #253 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          4
		if(obj != JsonToken.VALUE_STRING && obj != JsonToken.FIELD_NAME)
	//*   3    6:aload           4
	//*   4    8:getstatic       #256 <Field JsonToken JsonToken.VALUE_STRING>
	//*   5   11:if_acmpeq       161
	//*   6   14:aload           4
	//*   7   16:getstatic       #259 <Field JsonToken JsonToken.FIELD_NAME>
	//*   8   19:if_acmpne       25
	//*   9   22:goto            161
			if(obj == JsonToken.VALUE_NUMBER_INT)
	//*  10   25:aload           4
	//*  11   27:getstatic       #262 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  12   30:if_acmpne       154
			{
				int i = jsonparser.getIntValue();
	//   13   33:aload_1         
	//   14   34:invokevirtual   #265 <Method int JsonParser.getIntValue()>
	//   15   37:istore_3        
				if(deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS))
	//*  16   38:aload_2         
	//*  17   39:getstatic       #108 <Field DeserializationFeature DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS>
	//*  18   42:invokevirtual   #86  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  19   45:ifeq            68
					return deserializationcontext.handleWeirdNumberValue(_enumClass(), ((Number) (Integer.valueOf(i))), "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
	//   20   48:aload_2         
	//   21   49:aload_0         
	//   22   50:invokevirtual   #130 <Method Class _enumClass()>
	//   23   53:iload_3         
	//   24   54:invokestatic    #269 <Method Integer Integer.valueOf(int)>
	//   25   57:ldc2            #271 <String "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow">
	//   26   60:iconst_0        
	//   27   61:anewarray       Object[]
	//   28   64:invokevirtual   #275 <Method Object DeserializationContext.handleWeirdNumberValue(Class, Number, String, Object[])>
	//   29   67:areturn         
				if(i >= 0)
	//*  30   68:iload_3         
	//*  31   69:iflt            87
				{
					jsonparser = ((JsonParser) (_enumsByIndex));
	//   32   72:aload_0         
	//   33   73:getfield        #31  <Field Object[] _enumsByIndex>
	//   34   76:astore_1        
					if(i < jsonparser.length)
	//*  35   77:iload_3         
	//*  36   78:aload_1         
	//*  37   79:arraylength     
	//*  38   80:icmpge          87
						return ((Object) (jsonparser[i]));
	//   39   83:aload_1         
	//   40   84:iload_3         
	//   41   85:aaload          
	//   42   86:areturn         
				}
				if(_enumDefaultValue != null && deserializationcontext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE))
	//*  43   87:aload_0         
	//*  44   88:getfield        #33  <Field Enum _enumDefaultValue>
	//*  45   91:ifnull          109
	//*  46   94:aload_2         
	//*  47   95:getstatic       #141 <Field DeserializationFeature DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE>
	//*  48   98:invokevirtual   #86  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  49  101:ifeq            109
					return ((Object) (_enumDefaultValue));
	//   50  104:aload_0         
	//   51  105:getfield        #33  <Field Enum _enumDefaultValue>
	//   52  108:areturn         
				if(!deserializationcontext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
	//*  53  109:aload_2         
	//*  54  110:getstatic       #144 <Field DeserializationFeature DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL>
	//*  55  113:invokevirtual   #86  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  56  116:ifne            152
					return deserializationcontext.handleWeirdNumberValue(_enumClass(), ((Number) (Integer.valueOf(i))), "index value outside legal index range [0..%s]", new Object[] {
						Integer.valueOf(_enumsByIndex.length - 1)
					});
	//   57  119:aload_2         
	//   58  120:aload_0         
	//   59  121:invokevirtual   #130 <Method Class _enumClass()>
	//   60  124:iload_3         
	//   61  125:invokestatic    #269 <Method Integer Integer.valueOf(int)>
	//   62  128:ldc2            #277 <String "index value outside legal index range [0..%s]">
	//   63  131:iconst_1        
	//   64  132:anewarray       Object[]
	//   65  135:dup             
	//   66  136:iconst_0        
	//   67  137:aload_0         
	//   68  138:getfield        #31  <Field Object[] _enumsByIndex>
	//   69  141:arraylength     
	//   70  142:iconst_1        
	//   71  143:isub            
	//   72  144:invokestatic    #269 <Method Integer Integer.valueOf(int)>
	//   73  147:aastore         
	//   74  148:invokevirtual   #275 <Method Object DeserializationContext.handleWeirdNumberValue(Class, Number, String, Object[])>
	//   75  151:areturn         
				else
					return ((Object) (null));
	//   76  152:aconst_null     
	//   77  153:areturn         
			} else
			{
				return _deserializeOther(jsonparser, deserializationcontext);
	//   78  154:aload_0         
	//   79  155:aload_1         
	//   80  156:aload_2         
	//   81  157:invokevirtual   #279 <Method Object _deserializeOther(JsonParser, DeserializationContext)>
	//   82  160:areturn         
			}
		if(deserializationcontext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING))
	//*  83  161:aload_2         
	//*  84  162:getstatic       #282 <Field DeserializationFeature DeserializationFeature.READ_ENUMS_USING_TO_STRING>
	//*  85  165:invokevirtual   #86  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  86  168:ifeq            181
			obj = ((Object) (_getToStringLookup(deserializationcontext)));
	//   87  171:aload_0         
	//   88  172:aload_2         
	//   89  173:invokevirtual   #284 <Method CompactStringObjectMap _getToStringLookup(DeserializationContext)>
	//   90  176:astore          4
		else
	//*  91  178:goto            187
			obj = ((Object) (_lookupByName));
	//   92  181:aload_0         
	//   93  182:getfield        #29  <Field CompactStringObjectMap _lookupByName>
	//   94  185:astore          4
		String s = jsonparser.getText();
	//   95  187:aload_1         
	//   96  188:invokevirtual   #287 <Method String JsonParser.getText()>
	//   97  191:astore          5
		Object obj1 = ((CompactStringObjectMap) (obj)).find(s);
	//   98  193:aload           4
	//   99  195:aload           5
	//  100  197:invokevirtual   #290 <Method Object CompactStringObjectMap.find(String)>
	//  101  200:astore          6
		if(obj1 == null)
	//* 102  202:aload           6
	//* 103  204:ifnonnull       218
			return _deserializeAltString(jsonparser, deserializationcontext, ((CompactStringObjectMap) (obj)), s);
	//  104  207:aload_0         
	//  105  208:aload_1         
	//  106  209:aload_2         
	//  107  210:aload           4
	//  108  212:aload           5
	//  109  214:invokespecial   #292 <Method Object _deserializeAltString(JsonParser, DeserializationContext, CompactStringObjectMap, String)>
	//  110  217:areturn         
		else
			return obj1;
	//  111  218:aload           6
	//  112  220:areturn         
	}

	public boolean isCachable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public EnumDeserializer withResolved(Boolean boolean1)
	{
		if(_caseInsensitive == boolean1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Boolean _caseInsensitive>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new EnumDeserializer(this, boolean1);
	//    6   10:new             #2   <Class EnumDeserializer>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #295 <Method void EnumDeserializer(EnumDeserializer, Boolean)>
	//   11   19:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final Boolean _caseInsensitive;
	private final Enum _enumDefaultValue;
	protected Object _enumsByIndex[];
	protected final CompactStringObjectMap _lookupByName;
	protected CompactStringObjectMap _lookupByToString;
}
