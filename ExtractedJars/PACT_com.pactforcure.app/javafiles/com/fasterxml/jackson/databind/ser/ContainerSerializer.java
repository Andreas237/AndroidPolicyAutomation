// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public abstract class ContainerSerializer extends StdSerializer
{

	protected ContainerSerializer(JavaType javatype)
	{
		super(javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void StdSerializer(JavaType)>
	//    3    5:return          
	}

	protected ContainerSerializer(ContainerSerializer containerserializer)
	{
		super(containerserializer._handledType, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #15  <Field Class _handledType>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #18  <Method void StdSerializer(Class, boolean)>
	//    5    9:return          
	}

	protected ContainerSerializer(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void StdSerializer(Class)>
	//    3    5:return          
	}

	protected ContainerSerializer(Class class1, boolean flag)
	{
		super(class1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #18  <Method void StdSerializer(Class, boolean)>
	//    4    6:return          
	}

	protected abstract ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer);

	public abstract JsonSerializer getContentSerializer();

	public abstract JavaType getContentType();

	protected boolean hasContentTypeAnnotation(SerializerProvider serializerprovider, BeanProperty beanproperty)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract boolean hasSingleElement(Object obj);

	public boolean isEmpty(Object obj)
	{
		return isEmpty(((SerializerProvider) (null)), obj);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokevirtual   #41  <Method boolean isEmpty(SerializerProvider, Object)>
	//    4    6:ireturn         
	}

	public ContainerSerializer withValueTypeSerializer(TypeSerializer typeserializer)
	{
		if(typeserializer == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return _withValueTypeSerializer(typeserializer);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #45  <Method ContainerSerializer _withValueTypeSerializer(TypeSerializer)>
	//    7   11:areturn         
	}
}
