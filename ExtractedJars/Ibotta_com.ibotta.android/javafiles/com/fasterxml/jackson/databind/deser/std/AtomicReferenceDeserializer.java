// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			ReferenceTypeDeserializer

public class AtomicReferenceDeserializer extends ReferenceTypeDeserializer
{

	public AtomicReferenceDeserializer(JavaType javatype, ValueInstantiator valueinstantiator, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
	{
		super(javatype, valueinstantiator, typedeserializer, jsondeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #13  <Method void ReferenceTypeDeserializer(JavaType, ValueInstantiator, TypeDeserializer, JsonDeserializer)>
	//    6    9:return          
	}

	public Object getEmptyValue(DeserializationContext deserializationcontext)
	{
		return ((Object) (new AtomicReference()));
	//    0    0:new             #20  <Class AtomicReference>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void AtomicReference()>
	//    3    7:areturn         
	}

	public volatile Object getNullValue(DeserializationContext deserializationcontext)
	{
		return ((Object) (getNullValue(deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #27  <Method AtomicReference getNullValue(DeserializationContext)>
	//    3    5:areturn         
	}

	public AtomicReference getNullValue(DeserializationContext deserializationcontext)
	{
		return new AtomicReference();
	//    0    0:new             #20  <Class AtomicReference>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void AtomicReference()>
	//    3    7:areturn         
	}

	public volatile Object getReferenced(Object obj)
	{
		return getReferenced((AtomicReference)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #20  <Class AtomicReference>
	//    3    5:invokevirtual   #33  <Method Object getReferenced(AtomicReference)>
	//    4    8:areturn         
	}

	public Object getReferenced(AtomicReference atomicreference)
	{
		return atomicreference.get();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #37  <Method Object AtomicReference.get()>
	//    2    4:areturn         
	}

	public volatile Object referenceValue(Object obj)
	{
		return ((Object) (referenceValue(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #42  <Method AtomicReference referenceValue(Object)>
	//    3    5:areturn         
	}

	public AtomicReference referenceValue(Object obj)
	{
		return new AtomicReference(obj);
	//    0    0:new             #20  <Class AtomicReference>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #45  <Method void AtomicReference(Object)>
	//    4    8:areturn         
	}

	public Boolean supportsUpdate(DeserializationConfig deserializationconfig)
	{
		return Boolean.TRUE;
	//    0    0:getstatic       #54  <Field Boolean Boolean.TRUE>
	//    1    3:areturn         
	}

	public volatile Object updateReference(Object obj, Object obj1)
	{
		return ((Object) (updateReference((AtomicReference)obj, obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #20  <Class AtomicReference>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #59  <Method AtomicReference updateReference(AtomicReference, Object)>
	//    5    9:areturn         
	}

	public AtomicReference updateReference(AtomicReference atomicreference, Object obj)
	{
		atomicreference.set(obj);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #62  <Method void AtomicReference.set(Object)>
		return atomicreference;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	public AtomicReferenceDeserializer withResolved(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
	{
		return new AtomicReferenceDeserializer(_fullType, _valueInstantiator, typedeserializer, jsondeserializer);
	//    0    0:new             #2   <Class AtomicReferenceDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #69  <Field JavaType _fullType>
	//    4    8:aload_0         
	//    5    9:getfield        #73  <Field ValueInstantiator _valueInstantiator>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokespecial   #74  <Method void AtomicReferenceDeserializer(JavaType, ValueInstantiator, TypeDeserializer, JsonDeserializer)>
	//    9   17:areturn         
	}

	public volatile ReferenceTypeDeserializer withResolved(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
	{
		return ((ReferenceTypeDeserializer) (withResolved(typedeserializer, jsondeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #78  <Method AtomicReferenceDeserializer withResolved(TypeDeserializer, JsonDeserializer)>
	//    4    6:areturn         
	}

	private static final long serialVersionUID = 1L;
}
