// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			ArraySerializerBase, StdArraySerializers

protected static abstract class StdArraySerializers$TypedPrimitiveArraySerializer extends ArraySerializerBase
{

	public final ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
	{
		return ((ContainerSerializer) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	protected StdArraySerializers$TypedPrimitiveArraySerializer(StdArraySerializers$TypedPrimitiveArraySerializer stdarrayserializers$typedprimitivearrayserializer, BeanProperty beanproperty, Boolean boolean1)
	{
		super(((ArraySerializerBase) (stdarrayserializers$typedprimitivearrayserializer)), beanproperty, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #13  <Method void ArraySerializerBase(ArraySerializerBase, BeanProperty, Boolean)>
	//    5    7:return          
	}

	protected StdArraySerializers$TypedPrimitiveArraySerializer(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void ArraySerializerBase(Class)>
	//    3    5:return          
	}
}
