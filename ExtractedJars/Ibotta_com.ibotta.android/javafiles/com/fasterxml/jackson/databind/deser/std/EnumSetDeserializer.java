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
		if(_enumClass.isEnum())
	//*  10   19:aload_0         
	//*  11   20:getfield        #38  <Field Class _enumClass>
	//*  12   23:invokevirtual   #44  <Method boolean Class.isEnum()>
	//*  13   26:ifeq            40
		{
			_enumDeserializer = jsondeserializer;
	//   14   29:aload_0         
	//   15   30:aload_2         
	//   16   31:putfield        #46  <Field JsonDeserializer _enumDeserializer>
			_unwrapSingle = null;
	//   17   34:aload_0         
	//   18   35:aconst_null     
	//   19   36:putfield        #48  <Field Boolean _unwrapSingle>
			return;
	//   20   39:return          
		} else
		{
			jsondeserializer = ((JsonDeserializer) (new StringBuilder()));
	//   21   40:new             #50  <Class StringBuilder>
	//   22   43:dup             
	//   23   44:invokespecial   #53  <Method void StringBuilder()>
	//   24   47:astore_2        
			((StringBuilder) (jsondeserializer)).append("Type ");
	//   25   48:aload_2         
	//   26   49:ldc1            #55  <String "Type ">
	//   27   51:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   28   54:pop             
			((StringBuilder) (jsondeserializer)).append(((Object) (javatype)));
	//   29   55:aload_2         
	//   30   56:aload_1         
	//   31   57:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
	//   32   60:pop             
			((StringBuilder) (jsondeserializer)).append(" not Java Enum type");
	//   33   61:aload_2         
	//   34   62:ldc1            #64  <String " not Java Enum type">
	//   35   64:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   36   67:pop             
			throw new IllegalArgumentException(((StringBuilder) (jsondeserializer)).toString());
	//   37   68:new             #66  <Class IllegalArgumentException>
	//   38   71:dup             
	//   39   72:aload_2         
	//   40   73:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   41   76:invokespecial   #73  <Method void IllegalArgumentException(String)>
	//   42   79:athrow          
		}
	}

	protected EnumSetDeserializer(EnumSetDeserializer enumsetdeserializer, JsonDeserializer jsondeserializer, Boolean boolean1)
	{
		super(((StdDeserializer) (enumsetdeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #80  <Method void StdDeserializer(StdDeserializer)>
		_enumType = enumsetdeserializer._enumType;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #30  <Field JavaType _enumType>
	//    6   10:putfield        #30  <Field JavaType _enumType>
		_enumClass = enumsetdeserializer._enumClass;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #38  <Field Class _enumClass>
	//   10   18:putfield        #38  <Field Class _enumClass>
		_enumDeserializer = jsondeserializer;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #46  <Field JsonDeserializer _enumDeserializer>
		_unwrapSingle = boolean1;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:putfield        #48  <Field Boolean _unwrapSingle>
	//   17   31:return          
	}

	private EnumSet constructSet()
	{
		return EnumSet.noneOf(_enumClass);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Class _enumClass>
	//    2    4:invokestatic    #87  <Method EnumSet EnumSet.noneOf(Class)>
	//    3    7:areturn         
	}

	protected final EnumSet _deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, EnumSet enumset)
		throws IOException
	{
_L3:
		Object obj = ((Object) (jsonparser.nextToken()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #99  <Method JsonToken JsonParser.nextToken()>
	//    2    4:astore          4
		if(obj == JsonToken.END_ARRAY) goto _L2; else goto _L1
	//    3    6:aload           4
	//    4    8:getstatic       #105 <Field JsonToken JsonToken.END_ARRAY>
	//    5   11:if_acmpeq       64
_L1:
		if(obj == JsonToken.VALUE_NULL)
	//*   6   14:aload           4
	//*   7   16:getstatic       #108 <Field JsonToken JsonToken.VALUE_NULL>
	//*   8   19:if_acmpne       35
			return (EnumSet)deserializationcontext.handleUnexpectedToken(_enumClass, jsonparser);
	//    9   22:aload_2         
	//   10   23:aload_0         
	//   11   24:getfield        #38  <Field Class _enumClass>
	//   12   27:aload_1         
	//   13   28:invokevirtual   #114 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   14   31:checkcast       #25  <Class EnumSet>
	//   15   34:areturn         
		obj = ((Object) ((Enum)_enumDeserializer.deserialize(jsonparser, deserializationcontext)));
	//   16   35:aload_0         
	//   17   36:getfield        #46  <Field JsonDeserializer _enumDeserializer>
	//   18   39:aload_1         
	//   19   40:aload_2         
	//   20   41:invokevirtual   #120 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   21   44:checkcast       #122 <Class Enum>
	//   22   47:astore          4
		if(obj != null)
	//*  23   49:aload           4
	//*  24   51:ifnull          0
			try
			{
				enumset.add(obj);
	//   25   54:aload_3         
	//   26   55:aload           4
	//   27   57:invokevirtual   #126 <Method boolean EnumSet.add(Object)>
	//   28   60:pop             
			}
	//*  29   61:goto            0
	//*  30   64:aload_3         
	//*  31   65:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
	//*  32   66:astore_1        
			{
				throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (enumset)), enumset.size());
	//   33   67:aload_1         
	//   34   68:aload_3         
	//   35   69:aload_3         
	//   36   70:invokevirtual   #130 <Method int EnumSet.size()>
	//   37   73:invokestatic    #136 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   38   76:athrow          
			}
		if(true) goto _L3; else goto _L2
_L2:
		return enumset;
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Boolean boolean1 = findFormatFeature(deserializationcontext, beanproperty, java/util/EnumSet, com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #25  <Class EnumSet>
	//    4    5:getstatic       #146 <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//    5    8:invokevirtual   #150 <Method Boolean findFormatFeature(DeserializationContext, BeanProperty, Class, com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//    6   11:astore_3        
		JsonDeserializer jsondeserializer = _enumDeserializer;
	//    7   12:aload_0         
	//    8   13:getfield        #46  <Field JsonDeserializer _enumDeserializer>
	//    9   16:astore          4
		if(jsondeserializer == null)
	//*  10   18:aload           4
	//*  11   20:ifnonnull       36
			deserializationcontext = ((DeserializationContext) (deserializationcontext.findContextualValueDeserializer(_enumType, beanproperty)));
	//   12   23:aload_1         
	//   13   24:aload_0         
	//   14   25:getfield        #30  <Field JavaType _enumType>
	//   15   28:aload_2         
	//   16   29:invokevirtual   #154 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   17   32:astore_1        
		else
	//*  18   33:goto            48
			deserializationcontext = ((DeserializationContext) (deserializationcontext.handleSecondaryContextualization(jsondeserializer, beanproperty, _enumType)));
	//   19   36:aload_1         
	//   20   37:aload           4
	//   21   39:aload_2         
	//   22   40:aload_0         
	//   23   41:getfield        #30  <Field JavaType _enumType>
	//   24   44:invokevirtual   #158 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//   25   47:astore_1        
		return ((JsonDeserializer) (withResolved(((JsonDeserializer) (deserializationcontext)), boolean1)));
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:aload_3         
	//   29   51:invokevirtual   #162 <Method EnumSetDeserializer withResolved(JsonDeserializer, Boolean)>
	//   30   54:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #168 <Method EnumSet deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext, (EnumSet)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:checkcast       #25  <Class EnumSet>
	//    5    7:invokevirtual   #171 <Method EnumSet deserialize(JsonParser, DeserializationContext, EnumSet)>
	//    6   10:areturn         
	}

	public EnumSet deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		EnumSet enumset = constructSet();
	//    0    0:aload_0         
	//    1    1:invokespecial   #173 <Method EnumSet constructSet()>
	//    2    4:astore_3        
		if(!jsonparser.isExpectedStartArrayToken())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #176 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   5    9:ifne            20
			return handleNonArray(jsonparser, deserializationcontext, enumset);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #179 <Method EnumSet handleNonArray(JsonParser, DeserializationContext, EnumSet)>
	//   11   19:areturn         
		else
			return _deserialize(jsonparser, deserializationcontext, enumset);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:aload_2         
	//   15   23:aload_3         
	//   16   24:invokevirtual   #181 <Method EnumSet _deserialize(JsonParser, DeserializationContext, EnumSet)>
	//   17   27:areturn         
	}

	public EnumSet deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, EnumSet enumset)
		throws IOException
	{
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #176 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            15
			return handleNonArray(jsonparser, deserializationcontext, enumset);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #179 <Method EnumSet handleNonArray(JsonParser, DeserializationContext, EnumSet)>
	//    8   14:areturn         
		else
			return _deserialize(jsonparser, deserializationcontext, enumset);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:aload_3         
	//   13   19:invokevirtual   #181 <Method EnumSet _deserialize(JsonParser, DeserializationContext, EnumSet)>
	//   14   22:areturn         
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException, JsonProcessingException
	{
		return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #190 <Method Object TypeDeserializer.deserializeTypedFromArray(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected EnumSet handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext, EnumSet enumset)
		throws IOException
	{
		boolean flag;
		if(_unwrapSingle != Boolean.TRUE && (_unwrapSingle != null || !deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Boolean _unwrapSingle>
	//*   2    4:getstatic       #195 <Field Boolean Boolean.TRUE>
	//*   3    7:if_acmpeq       36
	//*   4   10:aload_0         
	//*   5   11:getfield        #48  <Field Boolean _unwrapSingle>
	//*   6   14:ifnonnull       30
	//*   7   17:aload_2         
	//*   8   18:getstatic       #200 <Field DeserializationFeature DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//*   9   21:invokevirtual   #204 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  10   24:ifeq            30
	//*  11   27:goto            36
			flag = false;
	//   12   30:iconst_0        
	//   13   31:istore          4
		else
	//*  14   33:goto            39
			flag = true;
	//   15   36:iconst_1        
	//   16   37:istore          4
		if(!flag)
	//*  17   39:iload           4
	//*  18   41:ifne            55
			return (EnumSet)deserializationcontext.handleUnexpectedToken(java/util/EnumSet, jsonparser);
	//   19   44:aload_2         
	//   20   45:ldc1            #25  <Class EnumSet>
	//   21   47:aload_1         
	//   22   48:invokevirtual   #114 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   23   51:checkcast       #25  <Class EnumSet>
	//   24   54:areturn         
		if(jsonparser.hasToken(JsonToken.VALUE_NULL))
	//*  25   55:aload_1         
	//*  26   56:getstatic       #108 <Field JsonToken JsonToken.VALUE_NULL>
	//*  27   59:invokevirtual   #208 <Method boolean JsonParser.hasToken(JsonToken)>
	//*  28   62:ifeq            78
			return (EnumSet)deserializationcontext.handleUnexpectedToken(_enumClass, jsonparser);
	//   29   65:aload_2         
	//   30   66:aload_0         
	//   31   67:getfield        #38  <Field Class _enumClass>
	//   32   70:aload_1         
	//   33   71:invokevirtual   #114 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   34   74:checkcast       #25  <Class EnumSet>
	//   35   77:areturn         
		try
		{
			jsonparser = ((JsonParser) ((Enum)_enumDeserializer.deserialize(jsonparser, deserializationcontext)));
	//   36   78:aload_0         
	//   37   79:getfield        #46  <Field JsonDeserializer _enumDeserializer>
	//   38   82:aload_1         
	//   39   83:aload_2         
	//   40   84:invokevirtual   #120 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   41   87:checkcast       #122 <Class Enum>
	//   42   90:astore_1        
		}
	//*  43   91:aload_1         
	//*  44   92:ifnull          101
	//*  45   95:aload_3         
	//*  46   96:aload_1         
	//*  47   97:invokevirtual   #126 <Method boolean EnumSet.add(Object)>
	//*  48  100:pop             
	//*  49  101:aload_3         
	//*  50  102:areturn         
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
	//*  51  103:astore_1        
		{
			throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (enumset)), enumset.size());
	//   52  104:aload_1         
	//   53  105:aload_3         
	//   54  106:aload_3         
	//   55  107:invokevirtual   #130 <Method int EnumSet.size()>
	//   56  110:invokestatic    #136 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   57  113:athrow          
		}
		if(jsonparser == null)
			break MISSING_BLOCK_LABEL_101;
		enumset.add(((Object) (jsonparser)));
		return enumset;
	}

	public boolean isCachable()
	{
		return _enumType.getValueHandler() == null;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field JavaType _enumType>
	//    2    4:invokevirtual   #213 <Method Object JavaType.getValueHandler()>
	//    3    7:ifnull          12
	//    4   10:iconst_0        
	//    5   11:ireturn         
	//    6   12:iconst_1        
	//    7   13:ireturn         
	}

	public Boolean supportsUpdate(DeserializationConfig deserializationconfig)
	{
		return Boolean.TRUE;
	//    0    0:getstatic       #195 <Field Boolean Boolean.TRUE>
	//    1    3:areturn         
	}

	public EnumSetDeserializer withResolved(JsonDeserializer jsondeserializer, Boolean boolean1)
	{
		if(_unwrapSingle == boolean1 && _enumDeserializer == jsondeserializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Boolean _unwrapSingle>
	//*   2    4:aload_2         
	//*   3    5:if_acmpne       18
	//*   4    8:aload_0         
	//*   5    9:getfield        #46  <Field JsonDeserializer _enumDeserializer>
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
	//   15   25:invokespecial   #217 <Method void EnumSetDeserializer(EnumSetDeserializer, JsonDeserializer, Boolean)>
	//   16   28:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final Class _enumClass;
	protected JsonDeserializer _enumDeserializer;
	protected final JavaType _enumType;
	protected final Boolean _unwrapSingle;
}
