// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer

public class AtomicReferenceDeserializer extends StdDeserializer
	implements ContextualDeserializer
{

	public AtomicReferenceDeserializer(JavaType javatype)
	{
		this(javatype, ((TypeDeserializer) (null)), ((JsonDeserializer) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #23  <Method void AtomicReferenceDeserializer(JavaType, TypeDeserializer, JsonDeserializer)>
	//    5    7:return          
	}

	public AtomicReferenceDeserializer(JavaType javatype, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
	{
		super(java/util/concurrent/atomic/AtomicReference);
	//    0    0:aload_0         
	//    1    1:ldc1            #26  <Class AtomicReference>
	//    2    3:invokespecial   #29  <Method void StdDeserializer(Class)>
		_referencedType = javatype;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #31  <Field JavaType _referencedType>
		_valueDeserializer = jsondeserializer;
	//    6   11:aload_0         
	//    7   12:aload_3         
	//    8   13:putfield        #33  <Field JsonDeserializer _valueDeserializer>
		_valueTypeDeserializer = typedeserializer;
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:putfield        #35  <Field TypeDeserializer _valueTypeDeserializer>
	//   12   21:return          
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj = ((Object) (_valueDeserializer));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field JsonDeserializer _valueDeserializer>
	//    2    4:astore_3        
		TypeDeserializer typedeserializer = _valueTypeDeserializer;
	//    3    5:aload_0         
	//    4    6:getfield        #35  <Field TypeDeserializer _valueTypeDeserializer>
	//    5    9:astore          4
		if(obj == null)
	//*   6   11:aload_3         
	//*   7   12:ifnonnull       47
			deserializationcontext = ((DeserializationContext) (deserializationcontext.findContextualValueDeserializer(_referencedType, beanproperty)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #31  <Field JavaType _referencedType>
	//   11   20:aload_2         
	//   12   21:invokevirtual   #47  <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   13   24:astore_1        
		else
	//*  14   25:aload           4
	//*  15   27:astore_3        
	//*  16   28:aload           4
	//*  17   30:ifnull          40
	//*  18   33:aload           4
	//*  19   35:aload_2         
	//*  20   36:invokevirtual   #53  <Method TypeDeserializer TypeDeserializer.forProperty(BeanProperty)>
	//*  21   39:astore_3        
	//*  22   40:aload_0         
	//*  23   41:aload_3         
	//*  24   42:aload_1         
	//*  25   43:invokevirtual   #57  <Method AtomicReferenceDeserializer withResolved(TypeDeserializer, JsonDeserializer)>
	//*  26   46:areturn         
			deserializationcontext = ((DeserializationContext) (deserializationcontext.handleSecondaryContextualization(((JsonDeserializer) (obj)), beanproperty, _referencedType)));
	//   27   47:aload_1         
	//   28   48:aload_3         
	//   29   49:aload_2         
	//   30   50:aload_0         
	//   31   51:getfield        #31  <Field JavaType _referencedType>
	//   32   54:invokevirtual   #61  <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//   33   57:astore_1        
		obj = ((Object) (typedeserializer));
		if(typedeserializer != null)
			obj = ((Object) (typedeserializer.forProperty(beanproperty)));
		return ((JsonDeserializer) (withResolved(((TypeDeserializer) (obj)), ((JsonDeserializer) (deserializationcontext)))));
	//*  34   58:goto            25
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #72  <Method AtomicReference deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public AtomicReference deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(_valueTypeDeserializer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field TypeDeserializer _valueTypeDeserializer>
	//*   2    4:ifnonnull       26
			jsonparser = ((JsonParser) (_valueDeserializer.deserialize(jsonparser, deserializationcontext)));
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field JsonDeserializer _valueDeserializer>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #76  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//    8   16:astore_1        
		else
	//*   9   17:new             #26  <Class AtomicReference>
	//*  10   20:dup             
	//*  11   21:aload_1         
	//*  12   22:invokespecial   #79  <Method void AtomicReference(Object)>
	//*  13   25:areturn         
			jsonparser = ((JsonParser) (_valueDeserializer.deserializeWithType(jsonparser, deserializationcontext, _valueTypeDeserializer)));
	//   14   26:aload_0         
	//   15   27:getfield        #33  <Field JsonDeserializer _valueDeserializer>
	//   16   30:aload_1         
	//   17   31:aload_2         
	//   18   32:aload_0         
	//   19   33:getfield        #35  <Field TypeDeserializer _valueTypeDeserializer>
	//   20   36:invokevirtual   #83  <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//   21   39:astore_1        
		return new AtomicReference(((Object) (jsonparser)));
	//*  22   40:goto            17
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #90  <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          4
		if(jsontoken == JsonToken.VALUE_NULL)
	//*   3    6:aload           4
	//*   4    8:getstatic       #96  <Field JsonToken JsonToken.VALUE_NULL>
	//*   5   11:if_acmpne       20
			return ((Object) (getNullValue(deserializationcontext)));
	//    6   14:aload_0         
	//    7   15:aload_2         
	//    8   16:invokevirtual   #100 <Method AtomicReference getNullValue(DeserializationContext)>
	//    9   19:areturn         
		if(jsontoken != null && jsontoken.isScalarValue())
	//*  10   20:aload           4
	//*  11   22:ifnull          40
	//*  12   25:aload           4
	//*  13   27:invokevirtual   #104 <Method boolean JsonToken.isScalarValue()>
	//*  14   30:ifeq            40
			return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:aload_2         
	//   18   36:invokevirtual   #72  <Method AtomicReference deserialize(JsonParser, DeserializationContext)>
	//   19   39:areturn         
		else
			return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
	//   20   40:aload_3         
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:invokevirtual   #107 <Method Object TypeDeserializer.deserializeTypedFromAny(JsonParser, DeserializationContext)>
	//   24   46:areturn         
	}

	public volatile Object getNullValue()
	{
		return ((Object) (getNullValue()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #111 <Method AtomicReference getNullValue()>
	//    2    4:areturn         
	}

	public volatile Object getNullValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return ((Object) (getNullValue(deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #100 <Method AtomicReference getNullValue(DeserializationContext)>
	//    3    5:areturn         
	}

	public AtomicReference getNullValue()
	{
		return new AtomicReference();
	//    0    0:new             #26  <Class AtomicReference>
	//    1    3:dup             
	//    2    4:invokespecial   #116 <Method void AtomicReference()>
	//    3    7:areturn         
	}

	public AtomicReference getNullValue(DeserializationContext deserializationcontext)
	{
		return new AtomicReference();
	//    0    0:new             #26  <Class AtomicReference>
	//    1    3:dup             
	//    2    4:invokespecial   #116 <Method void AtomicReference()>
	//    3    7:areturn         
	}

	public AtomicReferenceDeserializer withResolved(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
	{
		if(jsondeserializer == _valueDeserializer && typedeserializer == _valueTypeDeserializer)
	//*   0    0:aload_2         
	//*   1    1:aload_0         
	//*   2    2:getfield        #33  <Field JsonDeserializer _valueDeserializer>
	//*   3    5:if_acmpne       18
	//*   4    8:aload_1         
	//*   5    9:aload_0         
	//*   6   10:getfield        #35  <Field TypeDeserializer _valueTypeDeserializer>
	//*   7   13:if_acmpne       18
			return this;
	//    8   16:aload_0         
	//    9   17:areturn         
		else
			return new AtomicReferenceDeserializer(_referencedType, typedeserializer, jsondeserializer);
	//   10   18:new             #2   <Class AtomicReferenceDeserializer>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #31  <Field JavaType _referencedType>
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:invokespecial   #23  <Method void AtomicReferenceDeserializer(JavaType, TypeDeserializer, JsonDeserializer)>
	//   17   31:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final JavaType _referencedType;
	protected final JsonDeserializer _valueDeserializer;
	protected final TypeDeserializer _valueTypeDeserializer;
}
