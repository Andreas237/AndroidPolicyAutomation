// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
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
		this(javatype, valueinstantiator, ((JsonDeserializer) (null)), jsondeserializer, ((Boolean) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:aconst_null     
	//    4    4:aload_2         
	//    5    5:aconst_null     
	//    6    6:invokespecial   #28  <Method void StringCollectionDeserializer(JavaType, ValueInstantiator, JsonDeserializer, JsonDeserializer, Boolean)>
	//    7    9:return          
	}

	protected StringCollectionDeserializer(JavaType javatype, ValueInstantiator valueinstantiator, JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1, Boolean boolean1)
	{
		super(javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method void ContainerDeserializerBase(JavaType)>
		_collectionType = javatype;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #36  <Field JavaType _collectionType>
		_valueDeserializer = jsondeserializer1;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #38  <Field JsonDeserializer _valueDeserializer>
		_valueInstantiator = valueinstantiator;
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:putfield        #40  <Field ValueInstantiator _valueInstantiator>
		_delegateDeserializer = jsondeserializer;
	//   12   21:aload_0         
	//   13   22:aload_3         
	//   14   23:putfield        #42  <Field JsonDeserializer _delegateDeserializer>
		_unwrapSingle = boolean1;
	//   15   26:aload_0         
	//   16   27:aload           5
	//   17   29:putfield        #44  <Field Boolean _unwrapSingle>
	//   18   32:return          
	}

	private Collection deserializeUsingCustom(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection, JsonDeserializer jsondeserializer)
		throws IOException
	{
		do
		{
			Object obj;
			if(jsonparser.nextTextValue() == null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #55  <Method String JsonParser.nextTextValue()>
	//*   2    4:ifnonnull       69
			{
				obj = ((Object) (jsonparser.getCurrentToken()));
	//    3    7:aload_1         
	//    4    8:invokevirtual   #59  <Method JsonToken JsonParser.getCurrentToken()>
	//    5   11:astore          5
				if(obj == JsonToken.END_ARRAY)
	//*   6   13:aload           5
	//*   7   15:getstatic       #65  <Field JsonToken JsonToken.END_ARRAY>
	//*   8   18:if_acmpne       23
					return collection;
	//    9   21:aload_3         
	//   10   22:areturn         
				if(obj == JsonToken.VALUE_NULL)
	//*  11   23:aload           5
	//*  12   25:getstatic       #68  <Field JsonToken JsonToken.VALUE_NULL>
	//*  13   28:if_acmpne       54
					obj = ((Object) ((String)jsondeserializer.getNullValue(deserializationcontext)));
	//   14   31:aload           4
	//   15   33:aload_2         
	//   16   34:invokevirtual   #74  <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   17   37:checkcast       #76  <Class String>
	//   18   40:astore          5
				else
	//*  19   42:aload_3         
	//*  20   43:aload           5
	//*  21   45:invokeinterface #82  <Method boolean Collection.add(Object)>
	//*  22   50:pop             
	//*  23   51:goto            0
					obj = ((Object) ((String)jsondeserializer.deserialize(jsonparser, deserializationcontext)));
	//   24   54:aload           4
	//   25   56:aload_1         
	//   26   57:aload_2         
	//   27   58:invokevirtual   #86  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   28   61:checkcast       #76  <Class String>
	//   29   64:astore          5
			} else
	//*  30   66:goto            42
			{
				obj = ((Object) ((String)jsondeserializer.deserialize(jsonparser, deserializationcontext)));
	//   31   69:aload           4
	//   32   71:aload_1         
	//   33   72:aload_2         
	//   34   73:invokevirtual   #86  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   35   76:checkcast       #76  <Class String>
	//   36   79:astore          5
			}
			collection.add(obj);
		} while(true);
	//   37   81:goto            42
	}

	private final Collection handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
		throws IOException
	{
		boolean flag;
		if(_unwrapSingle == Boolean.TRUE || _unwrapSingle == null && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field Boolean _unwrapSingle>
	//*   2    4:getstatic       #95  <Field Boolean Boolean.TRUE>
	//*   3    7:if_acmpeq       27
	//*   4   10:aload_0         
	//*   5   11:getfield        #44  <Field Boolean _unwrapSingle>
	//*   6   14:ifnonnull       47
	//*   7   17:aload_2         
	//*   8   18:getstatic       #101 <Field DeserializationFeature DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//*   9   21:invokevirtual   #107 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  10   24:ifeq            47
			flag = true;
	//   11   27:iconst_1        
	//   12   28:istore          4
		else
	//*  13   30:iload           4
	//*  14   32:ifne            53
	//*  15   35:aload_2         
	//*  16   36:aload_0         
	//*  17   37:getfield        #36  <Field JavaType _collectionType>
	//*  18   40:invokevirtual   #113 <Method Class JavaType.getRawClass()>
	//*  19   43:invokevirtual   #117 <Method JsonMappingException DeserializationContext.mappingException(Class)>
	//*  20   46:athrow          
			flag = false;
	//   21   47:iconst_0        
	//   22   48:istore          4
		if(!flag)
			throw deserializationcontext.mappingException(_collectionType.getRawClass());
	//*  23   50:goto            30
		JsonDeserializer jsondeserializer = _valueDeserializer;
	//   24   53:aload_0         
	//   25   54:getfield        #38  <Field JsonDeserializer _valueDeserializer>
	//   26   57:astore          5
		if(jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
	//*  27   59:aload_1         
	//*  28   60:invokevirtual   #59  <Method JsonToken JsonParser.getCurrentToken()>
	//*  29   63:getstatic       #68  <Field JsonToken JsonToken.VALUE_NULL>
	//*  30   66:if_acmpne       99
		{
			if(jsondeserializer == null)
	//*  31   69:aload           5
	//*  32   71:ifnonnull       86
				jsonparser = null;
	//   33   74:aconst_null     
	//   34   75:astore_1        
			else
	//*  35   76:aload_3         
	//*  36   77:aload_1         
	//*  37   78:invokeinterface #82  <Method boolean Collection.add(Object)>
	//*  38   83:pop             
	//*  39   84:aload_3         
	//*  40   85:areturn         
				jsonparser = ((JsonParser) ((String)jsondeserializer.getNullValue(deserializationcontext)));
	//   41   86:aload           5
	//   42   88:aload_2         
	//   43   89:invokevirtual   #74  <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   44   92:checkcast       #76  <Class String>
	//   45   95:astore_1        
		} else
	//*  46   96:goto            76
		if(jsondeserializer == null)
	//*  47   99:aload           5
	//*  48  101:ifnonnull       114
			jsonparser = ((JsonParser) (_parseString(jsonparser, deserializationcontext)));
	//   49  104:aload_0         
	//   50  105:aload_1         
	//   51  106:aload_2         
	//   52  107:invokevirtual   #121 <Method String _parseString(JsonParser, DeserializationContext)>
	//   53  110:astore_1        
		else
	//*  54  111:goto            76
			jsonparser = ((JsonParser) ((String)jsondeserializer.deserialize(jsonparser, deserializationcontext)));
	//   55  114:aload           5
	//   56  116:aload_1         
	//   57  117:aload_2         
	//   58  118:invokevirtual   #86  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   59  121:checkcast       #76  <Class String>
	//   60  124:astore_1        
		collection.add(((Object) (jsonparser)));
		return collection;
	//*  61  125:goto            111
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		JsonDeserializer jsondeserializer = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		JsonDeserializer jsondeserializer1 = jsondeserializer;
	//    2    2:aload_3         
	//    3    3:astore          4
		if(_valueInstantiator != null)
	//*   4    5:aload_0         
	//*   5    6:getfield        #40  <Field ValueInstantiator _valueInstantiator>
	//*   6    9:ifnull          44
		{
			jsondeserializer1 = jsondeserializer;
	//    7   12:aload_3         
	//    8   13:astore          4
			if(_valueInstantiator.getDelegateCreator() != null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #40  <Field ValueInstantiator _valueInstantiator>
	//*  11   19:invokevirtual   #132 <Method com.fasterxml.jackson.databind.introspect.AnnotatedWithParams ValueInstantiator.getDelegateCreator()>
	//*  12   22:ifnull          44
				jsondeserializer1 = findDeserializer(deserializationcontext, _valueInstantiator.getDelegateType(deserializationcontext.getConfig()), beanproperty);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #40  <Field ValueInstantiator _valueInstantiator>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #136 <Method com.fasterxml.jackson.databind.DeserializationConfig DeserializationContext.getConfig()>
	//   19   35:invokevirtual   #140 <Method JavaType ValueInstantiator.getDelegateType(com.fasterxml.jackson.databind.DeserializationConfig)>
	//   20   38:aload_2         
	//   21   39:invokevirtual   #144 <Method JsonDeserializer findDeserializer(DeserializationContext, JavaType, BeanProperty)>
	//   22   42:astore          4
		}
		jsondeserializer = _valueDeserializer;
	//   23   44:aload_0         
	//   24   45:getfield        #38  <Field JsonDeserializer _valueDeserializer>
	//   25   48:astore_3        
		JavaType javatype = _collectionType.getContentType();
	//   26   49:aload_0         
	//   27   50:getfield        #36  <Field JavaType _collectionType>
	//   28   53:invokevirtual   #148 <Method JavaType JavaType.getContentType()>
	//   29   56:astore          6
		if(jsondeserializer == null)
	//*  30   58:aload_3         
	//*  31   59:ifnonnull       120
		{
			JsonDeserializer jsondeserializer2 = findConvertingContentDeserializer(deserializationcontext, beanproperty, jsondeserializer);
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:aload_2         
	//   35   65:aload_3         
	//   36   66:invokevirtual   #152 <Method JsonDeserializer findConvertingContentDeserializer(DeserializationContext, BeanProperty, JsonDeserializer)>
	//   37   69:astore          5
			jsondeserializer = jsondeserializer2;
	//   38   71:aload           5
	//   39   73:astore_3        
			if(jsondeserializer2 == null)
	//*  40   74:aload           5
	//*  41   76:ifnonnull       87
				jsondeserializer = deserializationcontext.findContextualValueDeserializer(javatype, beanproperty);
	//   42   79:aload_1         
	//   43   80:aload           6
	//   44   82:aload_2         
	//   45   83:invokevirtual   #156 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   46   86:astore_3        
		} else
	//*  47   87:aload_0         
	//*  48   88:aload_1         
	//*  49   89:aload_2         
	//*  50   90:ldc1            #78  <Class Collection>
	//*  51   92:getstatic       #161 <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//*  52   95:invokevirtual   #165 <Method Boolean findFormatFeature(DeserializationContext, BeanProperty, Class, com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//*  53   98:astore_2        
	//*  54   99:aload_3         
	//*  55  100:astore_1        
	//*  56  101:aload_0         
	//*  57  102:aload_3         
	//*  58  103:invokevirtual   #169 <Method boolean isDefaultDeserializer(JsonDeserializer)>
	//*  59  106:ifeq            111
	//*  60  109:aconst_null     
	//*  61  110:astore_1        
	//*  62  111:aload_0         
	//*  63  112:aload           4
	//*  64  114:aload_1         
	//*  65  115:aload_2         
	//*  66  116:invokevirtual   #173 <Method StringCollectionDeserializer withResolved(JsonDeserializer, JsonDeserializer, Boolean)>
	//*  67  119:areturn         
		{
			jsondeserializer = deserializationcontext.handleSecondaryContextualization(jsondeserializer, beanproperty, javatype);
	//   68  120:aload_1         
	//   69  121:aload_3         
	//   70  122:aload_2         
	//   71  123:aload           6
	//   72  125:invokevirtual   #177 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//   73  128:astore_3        
		}
		beanproperty = ((BeanProperty) (findFormatFeature(deserializationcontext, beanproperty, java/util/Collection, com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)));
		deserializationcontext = ((DeserializationContext) (jsondeserializer));
		if(isDefaultDeserializer(jsondeserializer))
			deserializationcontext = null;
		return ((JsonDeserializer) (withResolved(jsondeserializer1, ((JsonDeserializer) (deserializationcontext)), ((Boolean) (beanproperty)))));
	//*  74  129:goto            87
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #183 <Method Collection deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext, (Collection)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:checkcast       #78  <Class Collection>
	//    5    7:invokevirtual   #186 <Method Collection deserialize(JsonParser, DeserializationContext, Collection)>
	//    6   10:areturn         
	}

	public Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(_delegateDeserializer != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field JsonDeserializer _delegateDeserializer>
	//*   2    4:ifnull          28
			return (Collection)_valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext));
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field ValueInstantiator _valueInstantiator>
	//    5   11:aload_2         
	//    6   12:aload_0         
	//    7   13:getfield        #42  <Field JsonDeserializer _delegateDeserializer>
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #86  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   11   21:invokevirtual   #190 <Method Object ValueInstantiator.createUsingDelegate(DeserializationContext, Object)>
	//   12   24:checkcast       #78  <Class Collection>
	//   13   27:areturn         
		else
			return deserialize(jsonparser, deserializationcontext, (Collection)_valueInstantiator.createUsingDefault(deserializationcontext));
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:aload_0         
	//   18   32:getfield        #40  <Field ValueInstantiator _valueInstantiator>
	//   19   35:aload_2         
	//   20   36:invokevirtual   #193 <Method Object ValueInstantiator.createUsingDefault(DeserializationContext)>
	//   21   39:checkcast       #78  <Class Collection>
	//   22   42:invokevirtual   #186 <Method Collection deserialize(JsonParser, DeserializationContext, Collection)>
	//   23   45:areturn         
	}

	public Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
		throws IOException
	{
		if(jsonparser.isExpectedStartArrayToken()) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokevirtual   #200 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//    2    4:ifne            19
_L1:
		Object obj = ((Object) (handleNonArray(jsonparser, deserializationcontext, collection)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #202 <Method Collection handleNonArray(JsonParser, DeserializationContext, Collection)>
	//    8   14:astore          4
_L5:
		return ((Collection) (obj));
	//    9   16:aload           4
	//   10   18:areturn         
_L2:
		if(_valueDeserializer != null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #38  <Field JsonDeserializer _valueDeserializer>
	//*  13   23:ifnull          38
			return deserializeUsingCustom(jsonparser, deserializationcontext, collection, _valueDeserializer);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:aload_3         
	//   18   30:aload_0         
	//   19   31:getfield        #38  <Field JsonDeserializer _valueDeserializer>
	//   20   34:invokespecial   #204 <Method Collection deserializeUsingCustom(JsonParser, DeserializationContext, Collection, JsonDeserializer)>
	//   21   37:areturn         
_L3:
		String s;
		try
		{
			s = jsonparser.nextTextValue();
	//   22   38:aload_1         
	//   23   39:invokevirtual   #55  <Method String JsonParser.nextTextValue()>
	//   24   42:astore          5
		}
	//*  25   44:aload           5
	//*  26   46:ifnull          74
	//*  27   49:aload_3         
	//*  28   50:aload           5
	//*  29   52:invokeinterface #82  <Method boolean Collection.add(Object)>
	//*  30   57:pop             
	//*  31   58:goto            38
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
	//*  32   61:astore_1        
		{
			throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (collection)), collection.size());
	//   33   62:aload_1         
	//   34   63:aload_3         
	//   35   64:aload_3         
	//   36   65:invokeinterface #208 <Method int Collection.size()>
	//   37   70:invokestatic    #212 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   38   73:athrow          
		}
		if(s == null)
			break MISSING_BLOCK_LABEL_74;
		collection.add(((Object) (s)));
		  goto _L3
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//   39   74:aload_1         
	//   40   75:invokevirtual   #59  <Method JsonToken JsonParser.getCurrentToken()>
	//   41   78:astore          6
		obj = ((Object) (collection));
	//   42   80:aload_3         
	//   43   81:astore          4
		if(jsontoken == JsonToken.END_ARRAY) goto _L5; else goto _L4
	//   44   83:aload           6
	//   45   85:getstatic       #65  <Field JsonToken JsonToken.END_ARRAY>
	//   46   88:if_acmpeq       16
_L4:
		obj = ((Object) (s));
	//   47   91:aload           5
	//   48   93:astore          4
		if(jsontoken != JsonToken.VALUE_NULL)
	//*  49   95:aload           6
	//*  50   97:getstatic       #68  <Field JsonToken JsonToken.VALUE_NULL>
	//*  51  100:if_acmpeq       111
			obj = ((Object) (_parseString(jsonparser, deserializationcontext)));
	//   52  103:aload_0         
	//   53  104:aload_1         
	//   54  105:aload_2         
	//   55  106:invokevirtual   #121 <Method String _parseString(JsonParser, DeserializationContext)>
	//   56  109:astore          4
		collection.add(obj);
	//   57  111:aload_3         
	//   58  112:aload           4
	//   59  114:invokeinterface #82  <Method boolean Collection.add(Object)>
	//   60  119:pop             
		  goto _L3
	//*  61  120:goto            38
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #219 <Method Object TypeDeserializer.deserializeTypedFromArray(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public JsonDeserializer getContentDeserializer()
	{
		return _valueDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field JsonDeserializer _valueDeserializer>
	//    2    4:areturn         
	}

	public JavaType getContentType()
	{
		return _collectionType.getContentType();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field JavaType _collectionType>
	//    2    4:invokevirtual   #148 <Method JavaType JavaType.getContentType()>
	//    3    7:areturn         
	}

	public boolean isCachable()
	{
		return _valueDeserializer == null && _delegateDeserializer == null;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field JsonDeserializer _valueDeserializer>
	//    2    4:ifnonnull       16
	//    3    7:aload_0         
	//    4    8:getfield        #42  <Field JsonDeserializer _delegateDeserializer>
	//    5   11:ifnonnull       16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	protected StringCollectionDeserializer withResolved(JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1, Boolean boolean1)
	{
		if(_unwrapSingle == boolean1 && _valueDeserializer == jsondeserializer1 && _delegateDeserializer == jsondeserializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field Boolean _unwrapSingle>
	//*   2    4:aload_3         
	//*   3    5:if_acmpne       26
	//*   4    8:aload_0         
	//*   5    9:getfield        #38  <Field JsonDeserializer _valueDeserializer>
	//*   6   12:aload_2         
	//*   7   13:if_acmpne       26
	//*   8   16:aload_0         
	//*   9   17:getfield        #42  <Field JsonDeserializer _delegateDeserializer>
	//*  10   20:aload_1         
	//*  11   21:if_acmpne       26
			return this;
	//   12   24:aload_0         
	//   13   25:areturn         
		else
			return new StringCollectionDeserializer(_collectionType, _valueInstantiator, jsondeserializer, jsondeserializer1, boolean1);
	//   14   26:new             #2   <Class StringCollectionDeserializer>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:getfield        #36  <Field JavaType _collectionType>
	//   18   34:aload_0         
	//   19   35:getfield        #40  <Field ValueInstantiator _valueInstantiator>
	//   20   38:aload_1         
	//   21   39:aload_2         
	//   22   40:aload_3         
	//   23   41:invokespecial   #28  <Method void StringCollectionDeserializer(JavaType, ValueInstantiator, JsonDeserializer, JsonDeserializer, Boolean)>
	//   24   44:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final JavaType _collectionType;
	protected final JsonDeserializer _delegateDeserializer;
	protected final Boolean _unwrapSingle;
	protected final JsonDeserializer _valueDeserializer;
	protected final ValueInstantiator _valueInstantiator;
}
