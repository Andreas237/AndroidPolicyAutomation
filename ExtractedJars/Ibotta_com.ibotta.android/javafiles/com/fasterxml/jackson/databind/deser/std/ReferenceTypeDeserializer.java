// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer

public abstract class ReferenceTypeDeserializer extends StdDeserializer
	implements ContextualDeserializer
{

	public ReferenceTypeDeserializer(JavaType javatype, ValueInstantiator valueinstantiator, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
	{
		super(javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void StdDeserializer(JavaType)>
		_valueInstantiator = valueinstantiator;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field ValueInstantiator _valueInstantiator>
		_fullType = javatype;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #29  <Field JavaType _fullType>
		_valueDeserializer = jsondeserializer;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #31  <Field JsonDeserializer _valueDeserializer>
		_valueTypeDeserializer = typedeserializer;
	//   12   21:aload_0         
	//   13   22:aload_3         
	//   14   23:putfield        #33  <Field TypeDeserializer _valueTypeDeserializer>
	//   15   26:return          
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj = ((Object) (_valueDeserializer));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field JsonDeserializer _valueDeserializer>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       25
			deserializationcontext = ((DeserializationContext) (deserializationcontext.findContextualValueDeserializer(_fullType.getReferencedType(), beanproperty)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #29  <Field JavaType _fullType>
	//    8   14:invokevirtual   #46  <Method JavaType JavaType.getReferencedType()>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #52  <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   11   21:astore_1        
		else
	//*  12   22:goto            39
			deserializationcontext = ((DeserializationContext) (deserializationcontext.handleSecondaryContextualization(((JsonDeserializer) (obj)), beanproperty, _fullType.getReferencedType())));
	//   13   25:aload_1         
	//   14   26:aload_3         
	//   15   27:aload_2         
	//   16   28:aload_0         
	//   17   29:getfield        #29  <Field JavaType _fullType>
	//   18   32:invokevirtual   #46  <Method JavaType JavaType.getReferencedType()>
	//   19   35:invokevirtual   #56  <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//   20   38:astore_1        
		TypeDeserializer typedeserializer = _valueTypeDeserializer;
	//   21   39:aload_0         
	//   22   40:getfield        #33  <Field TypeDeserializer _valueTypeDeserializer>
	//   23   43:astore          4
		obj = ((Object) (typedeserializer));
	//   24   45:aload           4
	//   25   47:astore_3        
		if(typedeserializer != null)
	//*  26   48:aload           4
	//*  27   50:ifnull          60
			obj = ((Object) (typedeserializer.forProperty(beanproperty)));
	//   28   53:aload           4
	//   29   55:aload_2         
	//   30   56:invokevirtual   #62  <Method TypeDeserializer TypeDeserializer.forProperty(BeanProperty)>
	//   31   59:astore_3        
		if(deserializationcontext == _valueDeserializer && obj == _valueTypeDeserializer)
	//*  32   60:aload_1         
	//*  33   61:aload_0         
	//*  34   62:getfield        #31  <Field JsonDeserializer _valueDeserializer>
	//*  35   65:if_acmpne       78
	//*  36   68:aload_3         
	//*  37   69:aload_0         
	//*  38   70:getfield        #33  <Field TypeDeserializer _valueTypeDeserializer>
	//*  39   73:if_acmpne       78
			return ((JsonDeserializer) (this));
	//   40   76:aload_0         
	//   41   77:areturn         
		else
			return ((JsonDeserializer) (withResolved(((TypeDeserializer) (obj)), ((JsonDeserializer) (deserializationcontext)))));
	//   42   78:aload_0         
	//   43   79:aload_3         
	//   44   80:aload_1         
	//   45   81:invokevirtual   #66  <Method ReferenceTypeDeserializer withResolved(TypeDeserializer, JsonDeserializer)>
	//   46   84:areturn         
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj = ((Object) (_valueInstantiator));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ValueInstantiator _valueInstantiator>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          21
			return deserialize(jsonparser, deserializationcontext, ((ValueInstantiator) (obj)).createUsingDefault(deserializationcontext));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #78  <Method Object ValueInstantiator.createUsingDefault(DeserializationContext)>
	//   11   17:invokevirtual   #81  <Method Object deserialize(JsonParser, DeserializationContext, Object)>
	//   12   20:areturn         
		obj = ((Object) (_valueTypeDeserializer));
	//   13   21:aload_0         
	//   14   22:getfield        #33  <Field TypeDeserializer _valueTypeDeserializer>
	//   15   25:astore_3        
		if(obj == null)
	//*  16   26:aload_3         
	//*  17   27:ifnonnull       43
			jsonparser = ((JsonParser) (_valueDeserializer.deserialize(jsonparser, deserializationcontext)));
	//   18   30:aload_0         
	//   19   31:getfield        #31  <Field JsonDeserializer _valueDeserializer>
	//   20   34:aload_1         
	//   21   35:aload_2         
	//   22   36:invokevirtual   #85  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   23   39:astore_1        
		else
	//*  24   40:goto            54
			jsonparser = ((JsonParser) (_valueDeserializer.deserializeWithType(jsonparser, deserializationcontext, ((TypeDeserializer) (obj)))));
	//   25   43:aload_0         
	//   26   44:getfield        #31  <Field JsonDeserializer _valueDeserializer>
	//   27   47:aload_1         
	//   28   48:aload_2         
	//   29   49:aload_3         
	//   30   50:invokevirtual   #89  <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//   31   53:astore_1        
		return referenceValue(((Object) (jsonparser)));
	//   32   54:aload_0         
	//   33   55:aload_1         
	//   34   56:invokevirtual   #93  <Method Object referenceValue(Object)>
	//   35   59:areturn         
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		if(!_valueDeserializer.supportsUpdate(deserializationcontext.getConfig()).equals(((Object) (Boolean.FALSE))) && _valueTypeDeserializer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field JsonDeserializer _valueDeserializer>
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #98  <Method DeserializationConfig DeserializationContext.getConfig()>
	//*   4    8:invokevirtual   #102 <Method Boolean JsonDeserializer.supportsUpdate(DeserializationConfig)>
	//*   5   11:getstatic       #108 <Field Boolean Boolean.FALSE>
	//*   6   14:invokevirtual   #112 <Method boolean Boolean.equals(Object)>
	//*   7   17:ifne            96
	//*   8   20:aload_0         
	//*   9   21:getfield        #33  <Field TypeDeserializer _valueTypeDeserializer>
	//*  10   24:ifnull          30
	//*  11   27:goto            96
		{
			Object obj1 = getReferenced(obj);
	//   12   30:aload_0         
	//   13   31:aload_3         
	//   14   32:invokevirtual   #115 <Method Object getReferenced(Object)>
	//   15   35:astore          4
			if(obj1 == null)
	//*  16   37:aload           4
	//*  17   39:ifnonnull       81
			{
				obj = ((Object) (_valueTypeDeserializer));
	//   18   42:aload_0         
	//   19   43:getfield        #33  <Field TypeDeserializer _valueTypeDeserializer>
	//   20   46:astore_3        
				if(obj == null)
	//*  21   47:aload_3         
	//*  22   48:ifnonnull       64
					jsonparser = ((JsonParser) (_valueDeserializer.deserialize(jsonparser, deserializationcontext)));
	//   23   51:aload_0         
	//   24   52:getfield        #31  <Field JsonDeserializer _valueDeserializer>
	//   25   55:aload_1         
	//   26   56:aload_2         
	//   27   57:invokevirtual   #85  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   28   60:astore_1        
				else
	//*  29   61:goto            75
					jsonparser = ((JsonParser) (_valueDeserializer.deserializeWithType(jsonparser, deserializationcontext, ((TypeDeserializer) (obj)))));
	//   30   64:aload_0         
	//   31   65:getfield        #31  <Field JsonDeserializer _valueDeserializer>
	//   32   68:aload_1         
	//   33   69:aload_2         
	//   34   70:aload_3         
	//   35   71:invokevirtual   #89  <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//   36   74:astore_1        
				return referenceValue(((Object) (jsonparser)));
	//   37   75:aload_0         
	//   38   76:aload_1         
	//   39   77:invokevirtual   #93  <Method Object referenceValue(Object)>
	//   40   80:areturn         
			}
			jsonparser = ((JsonParser) (_valueDeserializer.deserialize(jsonparser, deserializationcontext, obj1)));
	//   41   81:aload_0         
	//   42   82:getfield        #31  <Field JsonDeserializer _valueDeserializer>
	//   43   85:aload_1         
	//   44   86:aload_2         
	//   45   87:aload           4
	//   46   89:invokevirtual   #116 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//   47   92:astore_1        
		} else
	//*  48   93:goto            132
		{
			TypeDeserializer typedeserializer = _valueTypeDeserializer;
	//   49   96:aload_0         
	//   50   97:getfield        #33  <Field TypeDeserializer _valueTypeDeserializer>
	//   51  100:astore          4
			if(typedeserializer == null)
	//*  52  102:aload           4
	//*  53  104:ifnonnull       120
				jsonparser = ((JsonParser) (_valueDeserializer.deserialize(jsonparser, deserializationcontext)));
	//   54  107:aload_0         
	//   55  108:getfield        #31  <Field JsonDeserializer _valueDeserializer>
	//   56  111:aload_1         
	//   57  112:aload_2         
	//   58  113:invokevirtual   #85  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   59  116:astore_1        
			else
	//*  60  117:goto            132
				jsonparser = ((JsonParser) (_valueDeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
	//   61  120:aload_0         
	//   62  121:getfield        #31  <Field JsonDeserializer _valueDeserializer>
	//   63  124:aload_1         
	//   64  125:aload_2         
	//   65  126:aload           4
	//   66  128:invokevirtual   #89  <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//   67  131:astore_1        
		}
		return updateReference(obj, ((Object) (jsonparser)));
	//   68  132:aload_0         
	//   69  133:aload_3         
	//   70  134:aload_1         
	//   71  135:invokevirtual   #120 <Method Object updateReference(Object, Object)>
	//   72  138:areturn         
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		if(jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #127 <Method JsonToken JsonParser.getCurrentToken()>
	//*   2    4:getstatic       #133 <Field JsonToken JsonToken.VALUE_NULL>
	//*   3    7:if_acmpne       16
			return getNullValue(deserializationcontext);
	//    4   10:aload_0         
	//    5   11:aload_2         
	//    6   12:invokevirtual   #136 <Method Object getNullValue(DeserializationContext)>
	//    7   15:areturn         
		typedeserializer = _valueTypeDeserializer;
	//    8   16:aload_0         
	//    9   17:getfield        #33  <Field TypeDeserializer _valueTypeDeserializer>
	//   10   20:astore_3        
		if(typedeserializer == null)
	//*  11   21:aload_3         
	//*  12   22:ifnonnull       32
			return deserialize(jsonparser, deserializationcontext);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:invokevirtual   #137 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   17   31:areturn         
		else
			return referenceValue(typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext));
	//   18   32:aload_0         
	//   19   33:aload_3         
	//   20   34:aload_1         
	//   21   35:aload_2         
	//   22   36:invokevirtual   #140 <Method Object TypeDeserializer.deserializeTypedFromAny(JsonParser, DeserializationContext)>
	//   23   39:invokevirtual   #93  <Method Object referenceValue(Object)>
	//   24   42:areturn         
	}

	public AccessPattern getEmptyAccessPattern()
	{
		return AccessPattern.DYNAMIC;
	//    0    0:getstatic       #148 <Field AccessPattern AccessPattern.DYNAMIC>
	//    1    3:areturn         
	}

	public Object getEmptyValue(DeserializationContext deserializationcontext)
	{
		return getNullValue(deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #136 <Method Object getNullValue(DeserializationContext)>
	//    3    5:areturn         
	}

	public AccessPattern getNullAccessPattern()
	{
		return AccessPattern.DYNAMIC;
	//    0    0:getstatic       #148 <Field AccessPattern AccessPattern.DYNAMIC>
	//    1    3:areturn         
	}

	public abstract Object getNullValue(DeserializationContext deserializationcontext);

	public abstract Object getReferenced(Object obj);

	public JavaType getValueType()
	{
		return _fullType;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field JavaType _fullType>
	//    2    4:areturn         
	}

	public abstract Object referenceValue(Object obj);

	public Boolean supportsUpdate(DeserializationConfig deserializationconfig)
	{
		JsonDeserializer jsondeserializer = _valueDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field JsonDeserializer _valueDeserializer>
	//    2    4:astore_2        
		if(jsondeserializer == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return jsondeserializer.supportsUpdate(deserializationconfig);
	//    7   11:aload_2         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #102 <Method Boolean JsonDeserializer.supportsUpdate(DeserializationConfig)>
	//   10   16:areturn         
	}

	public abstract Object updateReference(Object obj, Object obj1);

	protected abstract ReferenceTypeDeserializer withResolved(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer);

	private static final long serialVersionUID = 2L;
	protected final JavaType _fullType;
	protected final JsonDeserializer _valueDeserializer;
	protected final ValueInstantiator _valueInstantiator;
	protected final TypeDeserializer _valueTypeDeserializer;
}
