// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.util.EnumSet;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer

public class EnumSetDeserializer extends StdDeserializer
	implements ContextualDeserializer
{

	public EnumSetDeserializer(JavaType javatype, JsonDeserializer jsondeserializer)
	{
		super(java/util/EnumSet);
	//    0    0:aload_0         
	//    1    1:ldc1            #25  <Class EnumSet>
	//    2    3:invokespecial   #28  <Method void StdDeserializer(Class)>
		_enumType = javatype;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #30  <Field JavaType _enumType>
		_enumClass = javatype.getRawClass();
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:invokevirtual   #36  <Method Class JavaType.getRawClass()>
	//    9   16:putfield        #38  <Field Class _enumClass>
		if(!_enumClass.isEnum())
	//*  10   19:aload_0         
	//*  11   20:getfield        #38  <Field Class _enumClass>
	//*  12   23:invokevirtual   #44  <Method boolean Class.isEnum()>
	//*  13   26:ifne            61
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Type ").append(((Object) (javatype))).append(" not Java Enum type").toString());
	//   14   29:new             #46  <Class IllegalArgumentException>
	//   15   32:dup             
	//   16   33:new             #48  <Class StringBuilder>
	//   17   36:dup             
	//   18   37:invokespecial   #51  <Method void StringBuilder()>
	//   19   40:ldc1            #53  <String "Type ">
	//   20   42:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   21   45:aload_1         
	//   22   46:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   23   49:ldc1            #62  <String " not Java Enum type">
	//   24   51:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   25   54:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   26   57:invokespecial   #69  <Method void IllegalArgumentException(String)>
	//   27   60:athrow          
		} else
		{
			_enumDeserializer = jsondeserializer;
	//   28   61:aload_0         
	//   29   62:aload_2         
	//   30   63:putfield        #71  <Field JsonDeserializer _enumDeserializer>
			_unwrapSingle = null;
	//   31   66:aload_0         
	//   32   67:aconst_null     
	//   33   68:putfield        #73  <Field Boolean _unwrapSingle>
			return;
	//   34   71:return          
		}
	}

	protected EnumSetDeserializer(EnumSetDeserializer enumsetdeserializer, JsonDeserializer jsondeserializer, Boolean boolean1)
	{
		super(java/util/EnumSet);
	//    0    0:aload_0         
	//    1    1:ldc1            #25  <Class EnumSet>
	//    2    3:invokespecial   #28  <Method void StdDeserializer(Class)>
		_enumType = enumsetdeserializer._enumType;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:getfield        #30  <Field JavaType _enumType>
	//    6   11:putfield        #30  <Field JavaType _enumType>
		_enumClass = enumsetdeserializer._enumClass;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:getfield        #38  <Field Class _enumClass>
	//   10   19:putfield        #38  <Field Class _enumClass>
		_enumDeserializer = jsondeserializer;
	//   11   22:aload_0         
	//   12   23:aload_2         
	//   13   24:putfield        #71  <Field JsonDeserializer _enumDeserializer>
		_unwrapSingle = boolean1;
	//   14   27:aload_0         
	//   15   28:aload_3         
	//   16   29:putfield        #73  <Field Boolean _unwrapSingle>
	//   17   32:return          
	}

	private EnumSet constructSet()
	{
		return EnumSet.noneOf(_enumClass);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Class _enumClass>
	//    2    4:invokestatic    #84  <Method EnumSet EnumSet.noneOf(Class)>
	//    3    7:areturn         
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Boolean boolean1 = findFormatFeature(deserializationcontext, beanproperty, java/util/EnumSet, com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #25  <Class EnumSet>
	//    4    5:getstatic       #94  <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//    5    8:invokevirtual   #98  <Method Boolean findFormatFeature(DeserializationContext, BeanProperty, Class, com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//    6   11:astore_3        
		JsonDeserializer jsondeserializer = _enumDeserializer;
	//    7   12:aload_0         
	//    8   13:getfield        #71  <Field JsonDeserializer _enumDeserializer>
	//    9   16:astore          4
		if(jsondeserializer == null)
	//*  10   18:aload           4
	//*  11   20:ifnonnull       40
			deserializationcontext = ((DeserializationContext) (deserializationcontext.findContextualValueDeserializer(_enumType, beanproperty)));
	//   12   23:aload_1         
	//   13   24:aload_0         
	//   14   25:getfield        #30  <Field JavaType _enumType>
	//   15   28:aload_2         
	//   16   29:invokevirtual   #104 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   17   32:astore_1        
		else
	//*  18   33:aload_0         
	//*  19   34:aload_1         
	//*  20   35:aload_3         
	//*  21   36:invokevirtual   #108 <Method EnumSetDeserializer withResolved(JsonDeserializer, Boolean)>
	//*  22   39:areturn         
			deserializationcontext = ((DeserializationContext) (deserializationcontext.handleSecondaryContextualization(jsondeserializer, beanproperty, _enumType)));
	//   23   40:aload_1         
	//   24   41:aload           4
	//   25   43:aload_2         
	//   26   44:aload_0         
	//   27   45:getfield        #30  <Field JavaType _enumType>
	//   28   48:invokevirtual   #112 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//   29   51:astore_1        
		return ((JsonDeserializer) (withResolved(((JsonDeserializer) (deserializationcontext)), boolean1)));
	//*  30   52:goto            33
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #123 <Method EnumSet deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public EnumSet deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.isExpectedStartArrayToken()) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokevirtual   #130 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//    2    4:ifne            16
_L1:
		Object obj = ((Object) (handleNonArray(jsonparser, deserializationcontext)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #133 <Method EnumSet handleNonArray(JsonParser, DeserializationContext)>
	//    7   13:astore_3        
_L4:
		return ((EnumSet) (obj));
	//    8   14:aload_3         
	//    9   15:areturn         
_L2:
		EnumSet enumset = constructSet();
	//   10   16:aload_0         
	//   11   17:invokespecial   #135 <Method EnumSet constructSet()>
	//   12   20:astore          4
_L6:
		JsonToken jsontoken;
		try
		{
			jsontoken = jsonparser.nextToken();
	//   13   22:aload_1         
	//   14   23:invokevirtual   #139 <Method JsonToken JsonParser.nextToken()>
	//   15   26:astore          5
		}
	//*  16   28:aload           4
	//*  17   30:astore_3        
	//*  18   31:aload           5
	//*  19   33:getstatic       #145 <Field JsonToken JsonToken.END_ARRAY>
	//*  20   36:if_acmpeq       14
	//*  21   39:aload           5
	//*  22   41:getstatic       #148 <Field JsonToken JsonToken.VALUE_NULL>
	//*  23   44:if_acmpne       69
	//*  24   47:aload_2         
	//*  25   48:aload_0         
	//*  26   49:getfield        #38  <Field Class _enumClass>
	//*  27   52:invokevirtual   #152 <Method JsonMappingException DeserializationContext.mappingException(Class)>
	//*  28   55:athrow          
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
	//*  29   56:astore_1        
		{
			throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (enumset)), enumset.size());
	//   30   57:aload_1         
	//   31   58:aload           4
	//   32   60:aload           4
	//   33   62:invokevirtual   #156 <Method int EnumSet.size()>
	//   34   65:invokestatic    #160 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   35   68:athrow          
		}
		obj = ((Object) (enumset));
		if(jsontoken == JsonToken.END_ARRAY) goto _L4; else goto _L3
_L3:
		if(jsontoken == JsonToken.VALUE_NULL)
			throw deserializationcontext.mappingException(_enumClass);
		obj = ((Object) ((Enum)_enumDeserializer.deserialize(jsonparser, deserializationcontext)));
	//   36   69:aload_0         
	//   37   70:getfield        #71  <Field JsonDeserializer _enumDeserializer>
	//   38   73:aload_1         
	//   39   74:aload_2         
	//   40   75:invokevirtual   #164 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   41   78:checkcast       #166 <Class Enum>
	//   42   81:astore_3        
		if(obj == null) goto _L6; else goto _L5
	//   43   82:aload_3         
	//   44   83:ifnull          22
_L5:
		enumset.add(obj);
	//   45   86:aload           4
	//   46   88:aload_3         
	//   47   89:invokevirtual   #170 <Method boolean EnumSet.add(Object)>
	//   48   92:pop             
		  goto _L6
	//*  49   93:goto            22
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException, JsonProcessingException
	{
		return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #178 <Method Object TypeDeserializer.deserializeTypedFromArray(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected EnumSet handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		boolean flag;
		if(_unwrapSingle == Boolean.TRUE || _unwrapSingle == null && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field Boolean _unwrapSingle>
	//*   2    4:getstatic       #183 <Field Boolean Boolean.TRUE>
	//*   3    7:if_acmpeq       27
	//*   4   10:aload_0         
	//*   5   11:getfield        #73  <Field Boolean _unwrapSingle>
	//*   6   14:ifnonnull       40
	//*   7   17:aload_2         
	//*   8   18:getstatic       #188 <Field DeserializationFeature DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//*   9   21:invokevirtual   #192 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  10   24:ifeq            40
			flag = true;
	//   11   27:iconst_1        
	//   12   28:istore_3        
		else
	//*  13   29:iload_3         
	//*  14   30:ifne            45
	//*  15   33:aload_2         
	//*  16   34:ldc1            #25  <Class EnumSet>
	//*  17   36:invokevirtual   #152 <Method JsonMappingException DeserializationContext.mappingException(Class)>
	//*  18   39:athrow          
			flag = false;
	//   19   40:iconst_0        
	//   20   41:istore_3        
		if(!flag)
			throw deserializationcontext.mappingException(java/util/EnumSet);
	//*  21   42:goto            29
		EnumSet enumset = constructSet();
	//   22   45:aload_0         
	//   23   46:invokespecial   #135 <Method EnumSet constructSet()>
	//   24   49:astore          4
		if(jsonparser.hasToken(JsonToken.VALUE_NULL))
	//*  25   51:aload_1         
	//*  26   52:getstatic       #148 <Field JsonToken JsonToken.VALUE_NULL>
	//*  27   55:invokevirtual   #196 <Method boolean JsonParser.hasToken(JsonToken)>
	//*  28   58:ifeq            70
			throw deserializationcontext.mappingException(_enumClass);
	//   29   61:aload_2         
	//   30   62:aload_0         
	//   31   63:getfield        #38  <Field Class _enumClass>
	//   32   66:invokevirtual   #152 <Method JsonMappingException DeserializationContext.mappingException(Class)>
	//   33   69:athrow          
		try
		{
			jsonparser = ((JsonParser) ((Enum)_enumDeserializer.deserialize(jsonparser, deserializationcontext)));
	//   34   70:aload_0         
	//   35   71:getfield        #71  <Field JsonDeserializer _enumDeserializer>
	//   36   74:aload_1         
	//   37   75:aload_2         
	//   38   76:invokevirtual   #164 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   39   79:checkcast       #166 <Class Enum>
	//   40   82:astore_1        
		}
	//*  41   83:aload_1         
	//*  42   84:ifnull          94
	//*  43   87:aload           4
	//*  44   89:aload_1         
	//*  45   90:invokevirtual   #170 <Method boolean EnumSet.add(Object)>
	//*  46   93:pop             
	//*  47   94:aload           4
	//*  48   96:areturn         
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
	//*  49   97:astore_1        
		{
			throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (enumset)), enumset.size());
	//   50   98:aload_1         
	//   51   99:aload           4
	//   52  101:aload           4
	//   53  103:invokevirtual   #156 <Method int EnumSet.size()>
	//   54  106:invokestatic    #160 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   55  109:athrow          
		}
		if(jsonparser == null)
			break MISSING_BLOCK_LABEL_94;
		enumset.add(((Object) (jsonparser)));
		return enumset;
	}

	public boolean isCachable()
	{
		return _enumType.getValueHandler() == null;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field JavaType _enumType>
	//    2    4:invokevirtual   #201 <Method Object JavaType.getValueHandler()>
	//    3    7:ifnull          12
	//    4   10:iconst_0        
	//    5   11:ireturn         
	//    6   12:iconst_1        
	//    7   13:ireturn         
	}

	public EnumSetDeserializer withDeserializer(JsonDeserializer jsondeserializer)
	{
		if(_enumDeserializer == jsondeserializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field JsonDeserializer _enumDeserializer>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new EnumSetDeserializer(this, jsondeserializer, _unwrapSingle);
	//    6   10:new             #2   <Class EnumSetDeserializer>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #73  <Field Boolean _unwrapSingle>
	//   12   20:invokespecial   #205 <Method void EnumSetDeserializer(EnumSetDeserializer, JsonDeserializer, Boolean)>
	//   13   23:areturn         
	}

	public EnumSetDeserializer withResolved(JsonDeserializer jsondeserializer, Boolean boolean1)
	{
		if(_unwrapSingle == boolean1 && _enumDeserializer == jsondeserializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field Boolean _unwrapSingle>
	//*   2    4:aload_2         
	//*   3    5:if_acmpne       18
	//*   4    8:aload_0         
	//*   5    9:getfield        #71  <Field JsonDeserializer _enumDeserializer>
	//*   6   12:aload_1         
	//*   7   13:if_acmpne       18
			return this;
	//    8   16:aload_0         
	//    9   17:areturn         
		else
			return new EnumSetDeserializer(this, jsondeserializer, boolean1);
	//   10   18:new             #2   <Class EnumSetDeserializer>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:aload_2         
	//   15   25:invokespecial   #205 <Method void EnumSetDeserializer(EnumSetDeserializer, JsonDeserializer, Boolean)>
	//   16   28:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final Class _enumClass;
	protected JsonDeserializer _enumDeserializer;
	protected final JavaType _enumType;
	protected final Boolean _unwrapSingle;
}
