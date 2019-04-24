// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer

public abstract class DelegatingDeserializer extends StdDeserializer
	implements ContextualDeserializer, ResolvableDeserializer
{

	public DelegatingDeserializer(JsonDeserializer jsondeserializer)
	{
		super(_figureType(jsondeserializer));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #22  <Method Class _figureType(JsonDeserializer)>
	//    3    5:invokespecial   #25  <Method void StdDeserializer(Class)>
		_delegatee = jsondeserializer;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #27  <Field JsonDeserializer _delegatee>
	//    7   13:return          
	}

	private static Class _figureType(JsonDeserializer jsondeserializer)
	{
		jsondeserializer = ((JsonDeserializer) (jsondeserializer.handledType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #36  <Method Class JsonDeserializer.handledType()>
	//    2    4:astore_0        
		if(jsondeserializer != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          11
			return ((Class) (jsondeserializer));
	//    5    9:aload_0         
	//    6   10:areturn         
		else
			return java/lang/Object;
	//    7   11:ldc1            #38  <Class Object>
	//    8   13:areturn         
	}

	protected JsonDeserializer _createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty, JsonDeserializer jsondeserializer)
	{
		if(jsondeserializer == _delegatee)
	//*   0    0:aload_3         
	//*   1    1:aload_0         
	//*   2    2:getfield        #27  <Field JsonDeserializer _delegatee>
	//*   3    5:if_acmpne       10
			return ((JsonDeserializer) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return newDelegatingInstance(jsondeserializer);
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #46  <Method JsonDeserializer newDelegatingInstance(JsonDeserializer)>
	//    9   15:areturn         
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		com.fasterxml.jackson.databind.JavaType javatype = deserializationcontext.constructType(_delegatee.handledType());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field JsonDeserializer _delegatee>
	//    3    5:invokevirtual   #36  <Method Class JsonDeserializer.handledType()>
	//    4    8:invokevirtual   #58  <Method com.fasterxml.jackson.databind.JavaType DeserializationContext.constructType(Class)>
	//    5   11:astore_3        
		deserializationcontext = ((DeserializationContext) (deserializationcontext.handleSecondaryContextualization(_delegatee, beanproperty, javatype)));
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #27  <Field JsonDeserializer _delegatee>
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:invokevirtual   #62  <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, com.fasterxml.jackson.databind.JavaType)>
	//   12   22:astore_1        
		if(deserializationcontext == _delegatee)
	//*  13   23:aload_1         
	//*  14   24:aload_0         
	//*  15   25:getfield        #27  <Field JsonDeserializer _delegatee>
	//*  16   28:if_acmpne       33
			return ((JsonDeserializer) (this));
	//   17   31:aload_0         
	//   18   32:areturn         
		else
			return newDelegatingInstance(((JsonDeserializer) (deserializationcontext)));
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:invokevirtual   #46  <Method JsonDeserializer newDelegatingInstance(JsonDeserializer)>
	//   22   38:areturn         
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return _delegatee.deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field JsonDeserializer _delegatee>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #72  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//    5    9:areturn         
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException, JsonProcessingException
	{
		return _delegatee.deserialize(jsonparser, deserializationcontext, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field JsonDeserializer _delegatee>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #75  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//    6   10:areturn         
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException, JsonProcessingException
	{
		return _delegatee.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field JsonDeserializer _delegatee>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #79  <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//    6   10:areturn         
	}

	public SettableBeanProperty findBackReference(String s)
	{
		return _delegatee.findBackReference(s);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field JsonDeserializer _delegatee>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #83  <Method SettableBeanProperty JsonDeserializer.findBackReference(String)>
	//    4    8:areturn         
	}

	public JsonDeserializer getDelegatee()
	{
		return _delegatee;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field JsonDeserializer _delegatee>
	//    2    4:areturn         
	}

	public Object getEmptyValue()
	{
		return _delegatee.getEmptyValue();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field JsonDeserializer _delegatee>
	//    2    4:invokevirtual   #90  <Method Object JsonDeserializer.getEmptyValue()>
	//    3    7:areturn         
	}

	public Object getEmptyValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return _delegatee.getEmptyValue(deserializationcontext);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field JsonDeserializer _delegatee>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #93  <Method Object JsonDeserializer.getEmptyValue(DeserializationContext)>
	//    4    8:areturn         
	}

	public Collection getKnownPropertyNames()
	{
		return _delegatee.getKnownPropertyNames();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field JsonDeserializer _delegatee>
	//    2    4:invokevirtual   #97  <Method Collection JsonDeserializer.getKnownPropertyNames()>
	//    3    7:areturn         
	}

	public Object getNullValue()
	{
		return _delegatee.getNullValue();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field JsonDeserializer _delegatee>
	//    2    4:invokevirtual   #101 <Method Object JsonDeserializer.getNullValue()>
	//    3    7:areturn         
	}

	public Object getNullValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return _delegatee.getNullValue(deserializationcontext);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field JsonDeserializer _delegatee>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #103 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//    4    8:areturn         
	}

	public ObjectIdReader getObjectIdReader()
	{
		return _delegatee.getObjectIdReader();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field JsonDeserializer _delegatee>
	//    2    4:invokevirtual   #107 <Method ObjectIdReader JsonDeserializer.getObjectIdReader()>
	//    3    7:areturn         
	}

	public boolean isCachable()
	{
		return _delegatee.isCachable();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field JsonDeserializer _delegatee>
	//    2    4:invokevirtual   #111 <Method boolean JsonDeserializer.isCachable()>
	//    3    7:ireturn         
	}

	protected abstract JsonDeserializer newDelegatingInstance(JsonDeserializer jsondeserializer);

	public JsonDeserializer replaceDelegatee(JsonDeserializer jsondeserializer)
	{
		if(jsondeserializer == _delegatee)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #27  <Field JsonDeserializer _delegatee>
	//*   3    5:if_acmpne       10
			return ((JsonDeserializer) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return newDelegatingInstance(jsondeserializer);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #46  <Method JsonDeserializer newDelegatingInstance(JsonDeserializer)>
	//    9   15:areturn         
	}

	public void resolve(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		if(_delegatee instanceof ResolvableDeserializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field JsonDeserializer _delegatee>
	//*   2    4:instanceof      #9   <Class ResolvableDeserializer>
	//*   3    7:ifeq            23
			((ResolvableDeserializer)_delegatee).resolve(deserializationcontext);
	//    4   10:aload_0         
	//    5   11:getfield        #27  <Field JsonDeserializer _delegatee>
	//    6   14:checkcast       #9   <Class ResolvableDeserializer>
	//    7   17:aload_1         
	//    8   18:invokeinterface #117 <Method void ResolvableDeserializer.resolve(DeserializationContext)>
	//    9   23:return          
	}

	private static final long serialVersionUID = 1L;
	protected final JsonDeserializer _delegatee;
}
