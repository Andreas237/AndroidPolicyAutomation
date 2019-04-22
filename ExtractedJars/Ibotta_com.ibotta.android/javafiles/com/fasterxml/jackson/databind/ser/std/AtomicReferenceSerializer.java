// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			ReferenceTypeSerializer

public class AtomicReferenceSerializer extends ReferenceTypeSerializer
{

	protected AtomicReferenceSerializer(AtomicReferenceSerializer atomicreferenceserializer, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, NameTransformer nametransformer, Object obj, boolean flag)
	{
		super(((ReferenceTypeSerializer) (atomicreferenceserializer)), beanproperty, typeserializer, jsonserializer, nametransformer, obj, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:iload           7
	//    8   12:invokespecial   #14  <Method void ReferenceTypeSerializer(ReferenceTypeSerializer, BeanProperty, TypeSerializer, JsonSerializer, NameTransformer, Object, boolean)>
	//    9   15:return          
	}

	public AtomicReferenceSerializer(ReferenceType referencetype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		super(referencetype, flag, typeserializer, jsonserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #20  <Method void ReferenceTypeSerializer(ReferenceType, boolean, TypeSerializer, JsonSerializer)>
	//    6    9:return          
	}

	protected volatile Object _getReferenced(Object obj)
	{
		return _getReferenced((AtomicReference)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class AtomicReference>
	//    3    5:invokevirtual   #28  <Method Object _getReferenced(AtomicReference)>
	//    4    8:areturn         
	}

	protected Object _getReferenced(AtomicReference atomicreference)
	{
		return atomicreference.get();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method Object AtomicReference.get()>
	//    2    4:areturn         
	}

	protected volatile Object _getReferencedIfPresent(Object obj)
	{
		return _getReferencedIfPresent((AtomicReference)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class AtomicReference>
	//    3    5:invokevirtual   #36  <Method Object _getReferencedIfPresent(AtomicReference)>
	//    4    8:areturn         
	}

	protected Object _getReferencedIfPresent(AtomicReference atomicreference)
	{
		return atomicreference.get();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method Object AtomicReference.get()>
	//    2    4:areturn         
	}

	protected volatile boolean _isValuePresent(Object obj)
	{
		return _isValuePresent((AtomicReference)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class AtomicReference>
	//    3    5:invokevirtual   #41  <Method boolean _isValuePresent(AtomicReference)>
	//    4    8:ireturn         
	}

	protected boolean _isValuePresent(AtomicReference atomicreference)
	{
		return atomicreference.get() != null;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method Object AtomicReference.get()>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public ReferenceTypeSerializer withContentInclusion(Object obj, boolean flag)
	{
		return ((ReferenceTypeSerializer) (new AtomicReferenceSerializer(this, _property, _valueTypeSerializer, _valueSerializer, _unwrapper, obj, flag)));
	//    0    0:new             #2   <Class AtomicReferenceSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #48  <Field BeanProperty _property>
	//    5    9:aload_0         
	//    6   10:getfield        #52  <Field TypeSerializer _valueTypeSerializer>
	//    7   13:aload_0         
	//    8   14:getfield        #56  <Field JsonSerializer _valueSerializer>
	//    9   17:aload_0         
	//   10   18:getfield        #60  <Field NameTransformer _unwrapper>
	//   11   21:aload_1         
	//   12   22:iload_2         
	//   13   23:invokespecial   #62  <Method void AtomicReferenceSerializer(AtomicReferenceSerializer, BeanProperty, TypeSerializer, JsonSerializer, NameTransformer, Object, boolean)>
	//   14   26:areturn         
	}

	protected ReferenceTypeSerializer withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, NameTransformer nametransformer)
	{
		return ((ReferenceTypeSerializer) (new AtomicReferenceSerializer(this, beanproperty, typeserializer, jsonserializer, nametransformer, _suppressableValue, _suppressNulls)));
	//    0    0:new             #2   <Class AtomicReferenceSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload_0         
	//    8   11:getfield        #69  <Field Object _suppressableValue>
	//    9   14:aload_0         
	//   10   15:getfield        #73  <Field boolean _suppressNulls>
	//   11   18:invokespecial   #62  <Method void AtomicReferenceSerializer(AtomicReferenceSerializer, BeanProperty, TypeSerializer, JsonSerializer, NameTransformer, Object, boolean)>
	//   12   21:areturn         
	}

	private static final long serialVersionUID = 1L;
}
