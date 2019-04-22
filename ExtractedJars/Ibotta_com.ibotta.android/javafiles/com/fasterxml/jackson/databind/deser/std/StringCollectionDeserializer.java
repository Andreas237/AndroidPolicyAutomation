// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			ContainerDeserializerBase

public final class StringCollectionDeserializer extends ContainerDeserializerBase
	implements ContextualDeserializer
{

	public StringCollectionDeserializer(JavaType javatype, JsonDeserializer jsondeserializer, ValueInstantiator valueinstantiator)
	{
		this(javatype, valueinstantiator, ((JsonDeserializer) (null)), jsondeserializer, ((NullValueProvider) (jsondeserializer)), ((Boolean) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:aconst_null     
	//    4    4:aload_2         
	//    5    5:aload_2         
	//    6    6:aconst_null     
	//    7    7:invokespecial   #24  <Method void StringCollectionDeserializer(JavaType, ValueInstantiator, JsonDeserializer, JsonDeserializer, NullValueProvider, Boolean)>
	//    8   10:return          
	}

	protected StringCollectionDeserializer(JavaType javatype, ValueInstantiator valueinstantiator, JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1, NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		super(javatype, nullvalueprovider, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload           5
	//    3    4:aload           6
	//    4    6:invokespecial   #30  <Method void ContainerDeserializerBase(JavaType, NullValueProvider, Boolean)>
		_valueDeserializer = jsondeserializer1;
	//    5    9:aload_0         
	//    6   10:aload           4
	//    7   12:putfield        #32  <Field JsonDeserializer _valueDeserializer>
		_valueInstantiator = valueinstantiator;
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:putfield        #34  <Field ValueInstantiator _valueInstantiator>
		_delegateDeserializer = jsondeserializer;
	//   11   20:aload_0         
	//   12   21:aload_3         
	//   13   22:putfield        #36  <Field JsonDeserializer _delegateDeserializer>
	//   14   25:return          
	}

	private Collection deserializeUsingCustom(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection, JsonDeserializer jsondeserializer)
		throws IOException
	{
		do
		{
			Object obj;
			if(jsonparser.nextTextValue() == null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #47  <Method String JsonParser.nextTextValue()>
	//*   2    4:ifnonnull       74
			{
				obj = ((Object) (jsonparser.getCurrentToken()));
	//    3    7:aload_1         
	//    4    8:invokevirtual   #51  <Method JsonToken JsonParser.getCurrentToken()>
	//    5   11:astore          5
				if(obj == JsonToken.END_ARRAY)
	//*   6   13:aload           5
	//*   7   15:getstatic       #57  <Field JsonToken JsonToken.END_ARRAY>
	//*   8   18:if_acmpne       23
					return collection;
	//    9   21:aload_3         
	//   10   22:areturn         
				if(obj == JsonToken.VALUE_NULL)
	//*  11   23:aload           5
	//*  12   25:getstatic       #60  <Field JsonToken JsonToken.VALUE_NULL>
	//*  13   28:if_acmpne       59
				{
					if(_skipNullValues)
	//*  14   31:aload_0         
	//*  15   32:getfield        #64  <Field boolean _skipNullValues>
	//*  16   35:ifeq            41
						continue;
	//   17   38:goto            0
					obj = ((Object) ((String)_nullProvider.getNullValue(deserializationcontext)));
	//   18   41:aload_0         
	//   19   42:getfield        #68  <Field NullValueProvider _nullProvider>
	//   20   45:aload_2         
	//   21   46:invokeinterface #74  <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   22   51:checkcast       #76  <Class String>
	//   23   54:astore          5
				} else
	//*  24   56:goto            86
				{
					obj = ((Object) ((String)jsondeserializer.deserialize(jsonparser, deserializationcontext)));
	//   25   59:aload           4
	//   26   61:aload_1         
	//   27   62:aload_2         
	//   28   63:invokevirtual   #82  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   29   66:checkcast       #76  <Class String>
	//   30   69:astore          5
				}
			} else
	//*  31   71:goto            86
			{
				obj = ((Object) ((String)jsondeserializer.deserialize(jsonparser, deserializationcontext)));
	//   32   74:aload           4
	//   33   76:aload_1         
	//   34   77:aload_2         
	//   35   78:invokevirtual   #82  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   36   81:checkcast       #76  <Class String>
	//   37   84:astore          5
			}
			collection.add(obj);
	//   38   86:aload_3         
	//   39   87:aload           5
	//   40   89:invokeinterface #88  <Method boolean Collection.add(Object)>
	//   41   94:pop             
		} while(true);
	//   42   95:goto            0
	}

	private final Collection handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
		throws IOException
	{
		boolean flag;
		if(_unwrapSingle != Boolean.TRUE && (_unwrapSingle != null || !deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field Boolean _unwrapSingle>
	//*   2    4:getstatic       #101 <Field Boolean Boolean.TRUE>
	//*   3    7:if_acmpeq       36
	//*   4   10:aload_0         
	//*   5   11:getfield        #96  <Field Boolean _unwrapSingle>
	//*   6   14:ifnonnull       30
	//*   7   17:aload_2         
	//*   8   18:getstatic       #107 <Field DeserializationFeature DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//*   9   21:invokevirtual   #113 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
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
	//*  18   41:ifne            60
			return (Collection)deserializationcontext.handleUnexpectedToken(_containerType.getRawClass(), jsonparser);
	//   19   44:aload_2         
	//   20   45:aload_0         
	//   21   46:getfield        #117 <Field JavaType _containerType>
	//   22   49:invokevirtual   #123 <Method Class JavaType.getRawClass()>
	//   23   52:aload_1         
	//   24   53:invokevirtual   #127 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   25   56:checkcast       #84  <Class Collection>
	//   26   59:areturn         
		JsonDeserializer jsondeserializer = _valueDeserializer;
	//   27   60:aload_0         
	//   28   61:getfield        #32  <Field JsonDeserializer _valueDeserializer>
	//   29   64:astore          5
		if(jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
	//*  30   66:aload_1         
	//*  31   67:invokevirtual   #51  <Method JsonToken JsonParser.getCurrentToken()>
	//*  32   70:getstatic       #60  <Field JsonToken JsonToken.VALUE_NULL>
	//*  33   73:if_acmpne       102
		{
			if(_skipNullValues)
	//*  34   76:aload_0         
	//*  35   77:getfield        #64  <Field boolean _skipNullValues>
	//*  36   80:ifeq            85
				return collection;
	//   37   83:aload_3         
	//   38   84:areturn         
			jsonparser = ((JsonParser) ((String)_nullProvider.getNullValue(deserializationcontext)));
	//   39   85:aload_0         
	//   40   86:getfield        #68  <Field NullValueProvider _nullProvider>
	//   41   89:aload_2         
	//   42   90:invokeinterface #74  <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   43   95:checkcast       #76  <Class String>
	//   44   98:astore_1        
		} else
	//*  45   99:goto            128
		if(jsondeserializer == null)
	//*  46  102:aload           5
	//*  47  104:ifnonnull       117
			jsonparser = ((JsonParser) (_parseString(jsonparser, deserializationcontext)));
	//   48  107:aload_0         
	//   49  108:aload_1         
	//   50  109:aload_2         
	//   51  110:invokevirtual   #131 <Method String _parseString(JsonParser, DeserializationContext)>
	//   52  113:astore_1        
		else
	//*  53  114:goto            128
			jsonparser = ((JsonParser) ((String)jsondeserializer.deserialize(jsonparser, deserializationcontext)));
	//   54  117:aload           5
	//   55  119:aload_1         
	//   56  120:aload_2         
	//   57  121:invokevirtual   #82  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   58  124:checkcast       #76  <Class String>
	//   59  127:astore_1        
		collection.add(((Object) (jsonparser)));
	//   60  128:aload_3         
	//   61  129:aload_1         
	//   62  130:invokeinterface #88  <Method boolean Collection.add(Object)>
	//   63  135:pop             
		return collection;
	//   64  136:aload_3         
	//   65  137:areturn         
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj = ((Object) (_valueInstantiator));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ValueInstantiator _valueInstantiator>
	//    2    4:astore_3        
		Object obj1 = null;
	//    3    5:aconst_null     
	//    4    6:astore          5
		JsonDeserializer jsondeserializer;
		if(obj != null && ((ValueInstantiator) (obj)).getDelegateCreator() != null)
	//*   5    8:aload_3         
	//*   6    9:ifnull          41
	//*   7   12:aload_3         
	//*   8   13:invokevirtual   #142 <Method com.fasterxml.jackson.databind.introspect.AnnotatedWithParams ValueInstantiator.getDelegateCreator()>
	//*   9   16:ifnull          41
			jsondeserializer = findDeserializer(deserializationcontext, _valueInstantiator.getDelegateType(deserializationcontext.getConfig()), beanproperty);
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:aload_0         
	//   13   22:getfield        #34  <Field ValueInstantiator _valueInstantiator>
	//   14   25:aload_1         
	//   15   26:invokevirtual   #146 <Method com.fasterxml.jackson.databind.DeserializationConfig DeserializationContext.getConfig()>
	//   16   29:invokevirtual   #150 <Method JavaType ValueInstantiator.getDelegateType(com.fasterxml.jackson.databind.DeserializationConfig)>
	//   17   32:aload_2         
	//   18   33:invokevirtual   #154 <Method JsonDeserializer findDeserializer(DeserializationContext, JavaType, BeanProperty)>
	//   19   36:astore          4
		else
	//*  20   38:goto            44
			jsondeserializer = null;
	//   21   41:aconst_null     
	//   22   42:astore          4
		obj = ((Object) (_valueDeserializer));
	//   23   44:aload_0         
	//   24   45:getfield        #32  <Field JsonDeserializer _valueDeserializer>
	//   25   48:astore_3        
		JavaType javatype = _containerType.getContentType();
	//   26   49:aload_0         
	//   27   50:getfield        #117 <Field JavaType _containerType>
	//   28   53:invokevirtual   #158 <Method JavaType JavaType.getContentType()>
	//   29   56:astore          7
		if(obj == null)
	//*  30   58:aload_3         
	//*  31   59:ifnonnull       90
		{
			JsonDeserializer jsondeserializer1 = findConvertingContentDeserializer(deserializationcontext, beanproperty, ((JsonDeserializer) (obj)));
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:aload_2         
	//   35   65:aload_3         
	//   36   66:invokevirtual   #162 <Method JsonDeserializer findConvertingContentDeserializer(DeserializationContext, BeanProperty, JsonDeserializer)>
	//   37   69:astore          6
			obj = ((Object) (jsondeserializer1));
	//   38   71:aload           6
	//   39   73:astore_3        
			if(jsondeserializer1 == null)
	//*  40   74:aload           6
	//*  41   76:ifnonnull       99
				obj = ((Object) (deserializationcontext.findContextualValueDeserializer(javatype, beanproperty)));
	//   42   79:aload_1         
	//   43   80:aload           7
	//   44   82:aload_2         
	//   45   83:invokevirtual   #166 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   46   86:astore_3        
		} else
	//*  47   87:goto            99
		{
			obj = ((Object) (deserializationcontext.handleSecondaryContextualization(((JsonDeserializer) (obj)), beanproperty, javatype)));
	//   48   90:aload_1         
	//   49   91:aload_3         
	//   50   92:aload_2         
	//   51   93:aload           7
	//   52   95:invokevirtual   #170 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//   53   98:astore_3        
		}
		Boolean boolean1 = findFormatFeature(deserializationcontext, beanproperty, java/util/Collection, com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
	//   54   99:aload_0         
	//   55  100:aload_1         
	//   56  101:aload_2         
	//   57  102:ldc1            #84  <Class Collection>
	//   58  104:getstatic       #175 <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//   59  107:invokevirtual   #179 <Method Boolean findFormatFeature(DeserializationContext, BeanProperty, Class, com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//   60  110:astore          6
		deserializationcontext = ((DeserializationContext) (findContentNullProvider(deserializationcontext, beanproperty, ((JsonDeserializer) (obj)))));
	//   61  112:aload_0         
	//   62  113:aload_1         
	//   63  114:aload_2         
	//   64  115:aload_3         
	//   65  116:invokevirtual   #183 <Method NullValueProvider findContentNullProvider(DeserializationContext, BeanProperty, JsonDeserializer)>
	//   66  119:astore_1        
		if(isDefaultDeserializer(((JsonDeserializer) (obj))))
	//*  67  120:aload_0         
	//*  68  121:aload_3         
	//*  69  122:invokevirtual   #187 <Method boolean isDefaultDeserializer(JsonDeserializer)>
	//*  70  125:ifeq            134
			obj = ((Object) (obj1));
	//   71  128:aload           5
	//   72  130:astore_3        
	//*  73  131:goto            134
		return ((JsonDeserializer) (withResolved(jsondeserializer, ((JsonDeserializer) (obj)), ((NullValueProvider) (deserializationcontext)), boolean1)));
	//   74  134:aload_0         
	//   75  135:aload           4
	//   76  137:aload_3         
	//   77  138:aload_1         
	//   78  139:aload           6
	//   79  141:invokevirtual   #191 <Method StringCollectionDeserializer withResolved(JsonDeserializer, JsonDeserializer, NullValueProvider, Boolean)>
	//   80  144:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #197 <Method Collection deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext, (Collection)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:checkcast       #84  <Class Collection>
	//    5    7:invokevirtual   #200 <Method Collection deserialize(JsonParser, DeserializationContext, Collection)>
	//    6   10:areturn         
	}

	public Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		JsonDeserializer jsondeserializer = _delegateDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field JsonDeserializer _delegateDeserializer>
	//    2    4:astore_3        
		if(jsondeserializer != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          27
			return (Collection)_valueInstantiator.createUsingDelegate(deserializationcontext, jsondeserializer.deserialize(jsonparser, deserializationcontext));
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field ValueInstantiator _valueInstantiator>
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #82  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   12   20:invokevirtual   #204 <Method Object ValueInstantiator.createUsingDelegate(DeserializationContext, Object)>
	//   13   23:checkcast       #84  <Class Collection>
	//   14   26:areturn         
		else
			return deserialize(jsonparser, deserializationcontext, (Collection)_valueInstantiator.createUsingDefault(deserializationcontext));
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:aload_2         
	//   18   30:aload_0         
	//   19   31:getfield        #34  <Field ValueInstantiator _valueInstantiator>
	//   20   34:aload_2         
	//   21   35:invokevirtual   #207 <Method Object ValueInstantiator.createUsingDefault(DeserializationContext)>
	//   22   38:checkcast       #84  <Class Collection>
	//   23   41:invokevirtual   #200 <Method Collection deserialize(JsonParser, DeserializationContext, Collection)>
	//   24   44:areturn         
	}

	public Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
		throws IOException
	{
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #214 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            15
			return handleNonArray(jsonparser, deserializationcontext, collection);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #216 <Method Collection handleNonArray(JsonParser, DeserializationContext, Collection)>
	//    8   14:areturn         
		JsonDeserializer jsondeserializer = _valueDeserializer;
	//    9   15:aload_0         
	//   10   16:getfield        #32  <Field JsonDeserializer _valueDeserializer>
	//   11   19:astore          4
		if(jsondeserializer != null)
	//*  12   21:aload           4
	//*  13   23:ifnull          36
			return deserializeUsingCustom(jsonparser, deserializationcontext, collection, jsondeserializer);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:aload_3         
	//   18   30:aload           4
	//   19   32:invokespecial   #218 <Method Collection deserializeUsingCustom(JsonParser, DeserializationContext, Collection, JsonDeserializer)>
	//   20   35:areturn         
_L1:
		Object obj;
		try
		{
			obj = ((Object) (jsonparser.nextTextValue()));
	//   21   36:aload_1         
	//   22   37:invokevirtual   #47  <Method String JsonParser.nextTextValue()>
	//   23   40:astore          4
		}
	//*  24   42:aload           4
	//*  25   44:ifnull          59
	//*  26   47:aload_3         
	//*  27   48:aload           4
	//*  28   50:invokeinterface #88  <Method boolean Collection.add(Object)>
	//*  29   55:pop             
	//*  30   56:goto            36
	//*  31   59:aload_1         
	//*  32   60:invokevirtual   #51  <Method JsonToken JsonParser.getCurrentToken()>
	//*  33   63:astore          4
	//*  34   65:aload           4
	//*  35   67:getstatic       #57  <Field JsonToken JsonToken.END_ARRAY>
	//*  36   70:if_acmpne       75
	//*  37   73:aload_3         
	//*  38   74:areturn         
	//*  39   75:aload           4
	//*  40   77:getstatic       #60  <Field JsonToken JsonToken.VALUE_NULL>
	//*  41   80:if_acmpne       111
	//*  42   83:aload_0         
	//*  43   84:getfield        #64  <Field boolean _skipNullValues>
	//*  44   87:ifeq            93
	//*  45   90:goto            36
	//*  46   93:aload_0         
	//*  47   94:getfield        #68  <Field NullValueProvider _nullProvider>
	//*  48   97:aload_2         
	//*  49   98:invokeinterface #74  <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//*  50  103:checkcast       #76  <Class String>
	//*  51  106:astore          4
	//*  52  108:goto            119
	//*  53  111:aload_0         
	//*  54  112:aload_1         
	//*  55  113:aload_2         
	//*  56  114:invokevirtual   #131 <Method String _parseString(JsonParser, DeserializationContext)>
	//*  57  117:astore          4
	//*  58  119:aload_3         
	//*  59  120:aload           4
	//*  60  122:invokeinterface #88  <Method boolean Collection.add(Object)>
	//*  61  127:pop             
	//*  62  128:goto            36
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
	//*  63  131:astore_1        
		{
			throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (collection)), collection.size());
	//   64  132:aload_1         
	//   65  133:aload_3         
	//   66  134:aload_3         
	//   67  135:invokeinterface #222 <Method int Collection.size()>
	//   68  140:invokestatic    #226 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   69  143:athrow          
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_59;
		collection.add(obj);
		  goto _L1
		obj = ((Object) (jsonparser.getCurrentToken()));
		if(obj == JsonToken.END_ARRAY)
			return collection;
		if(obj != JsonToken.VALUE_NULL)
			break MISSING_BLOCK_LABEL_111;
		if(!_skipNullValues) goto _L2; else goto _L1
_L2:
		obj = ((Object) ((String)_nullProvider.getNullValue(deserializationcontext)));
		break MISSING_BLOCK_LABEL_119;
		obj = ((Object) (_parseString(jsonparser, deserializationcontext)));
		collection.add(obj);
		  goto _L1
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #233 <Method Object TypeDeserializer.deserializeTypedFromArray(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public JsonDeserializer getContentDeserializer()
	{
		return _valueDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field JsonDeserializer _valueDeserializer>
	//    2    4:areturn         
	}

	public ValueInstantiator getValueInstantiator()
	{
		return _valueInstantiator;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ValueInstantiator _valueInstantiator>
	//    2    4:areturn         
	}

	public boolean isCachable()
	{
		return _valueDeserializer == null && _delegateDeserializer == null;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field JsonDeserializer _valueDeserializer>
	//    2    4:ifnonnull       16
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field JsonDeserializer _delegateDeserializer>
	//    5   11:ifnonnull       16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	protected StringCollectionDeserializer withResolved(JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1, NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		if(_unwrapSingle == boolean1 && _nullProvider == nullvalueprovider && _valueDeserializer == jsondeserializer1 && _delegateDeserializer == jsondeserializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field Boolean _unwrapSingle>
	//*   2    4:aload           4
	//*   3    6:if_acmpne       35
	//*   4    9:aload_0         
	//*   5   10:getfield        #68  <Field NullValueProvider _nullProvider>
	//*   6   13:aload_3         
	//*   7   14:if_acmpne       35
	//*   8   17:aload_0         
	//*   9   18:getfield        #32  <Field JsonDeserializer _valueDeserializer>
	//*  10   21:aload_2         
	//*  11   22:if_acmpne       35
	//*  12   25:aload_0         
	//*  13   26:getfield        #36  <Field JsonDeserializer _delegateDeserializer>
	//*  14   29:aload_1         
	//*  15   30:if_acmpne       35
			return this;
	//   16   33:aload_0         
	//   17   34:areturn         
		else
			return new StringCollectionDeserializer(_containerType, _valueInstantiator, jsondeserializer, jsondeserializer1, nullvalueprovider, boolean1);
	//   18   35:new             #2   <Class StringCollectionDeserializer>
	//   19   38:dup             
	//   20   39:aload_0         
	//   21   40:getfield        #117 <Field JavaType _containerType>
	//   22   43:aload_0         
	//   23   44:getfield        #34  <Field ValueInstantiator _valueInstantiator>
	//   24   47:aload_1         
	//   25   48:aload_2         
	//   26   49:aload_3         
	//   27   50:aload           4
	//   28   52:invokespecial   #24  <Method void StringCollectionDeserializer(JavaType, ValueInstantiator, JsonDeserializer, JsonDeserializer, NullValueProvider, Boolean)>
	//   29   55:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final JsonDeserializer _delegateDeserializer;
	protected final JsonDeserializer _valueDeserializer;
	protected final ValueInstantiator _valueInstantiator;
}
