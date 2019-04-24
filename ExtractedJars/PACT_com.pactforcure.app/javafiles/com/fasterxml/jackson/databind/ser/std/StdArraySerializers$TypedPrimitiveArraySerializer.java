// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			ArraySerializerBase, StdArraySerializers

protected static abstract class StdArraySerializers$TypedPrimitiveArraySerializer extends ArraySerializerBase
{

	protected final TypeSerializer _valueTypeSerializer;

	protected StdArraySerializers$TypedPrimitiveArraySerializer(StdArraySerializers$TypedPrimitiveArraySerializer stdarrayserializers$typedprimitivearrayserializer, BeanProperty beanproperty, TypeSerializer typeserializer, Boolean boolean1)
	{
		super(((ArraySerializerBase) (stdarrayserializers$typedprimitivearrayserializer)), beanproperty, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload           4
	//    4    5:invokespecial   #15  <Method void ArraySerializerBase(ArraySerializerBase, BeanProperty, Boolean)>
		_valueTypeSerializer = typeserializer;
	//    5    8:aload_0         
	//    6    9:aload_3         
	//    7   10:putfield        #17  <Field TypeSerializer _valueTypeSerializer>
	//    8   13:return          
	}

	protected StdArraySerializers$TypedPrimitiveArraySerializer(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void ArraySerializerBase(Class)>
		_valueTypeSerializer = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #17  <Field TypeSerializer _valueTypeSerializer>
	//    6   10:return          
	}
}
