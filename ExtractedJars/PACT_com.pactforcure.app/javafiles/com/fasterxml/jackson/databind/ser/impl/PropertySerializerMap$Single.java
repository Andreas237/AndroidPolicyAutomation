// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//			PropertySerializerMap

private static final class PropertySerializerMap$Single extends PropertySerializerMap
{

	public PropertySerializerMap newWith(Class class1, JsonSerializer jsonserializer)
	{
		return ((PropertySerializerMap) (new PropertySerializerMap$Double(((PropertySerializerMap) (this)), _type, _serializer, class1, jsonserializer)));
	//    0    0:new             #27  <Class PropertySerializerMap$Double>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field Class _type>
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field JsonSerializer _serializer>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokespecial   #30  <Method void PropertySerializerMap$Double(PropertySerializerMap, Class, JsonSerializer, Class, JsonSerializer)>
	//   10   18:areturn         
	}

	public JsonSerializer serializerFor(Class class1)
	{
		if(class1 == _type)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #18  <Field Class _type>
	//*   3    5:if_acmpne       13
			return _serializer;
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field JsonSerializer _serializer>
	//    6   12:areturn         
		else
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
	}

	private final JsonSerializer _serializer;
	private final Class _type;

	public PropertySerializerMap$Single(PropertySerializerMap propertyserializermap, Class class1, JsonSerializer jsonserializer)
	{
		super(propertyserializermap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void PropertySerializerMap(PropertySerializerMap)>
		_type = class1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field Class _type>
		_serializer = jsonserializer;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field JsonSerializer _serializer>
	//    9   15:return          
	}
}
