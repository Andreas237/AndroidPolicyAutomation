// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//			PropertySerializerMap

public static final class PropertySerializerMap$SerializerAndMapResult
{

	public final PropertySerializerMap map;
	public final JsonSerializer serializer;

	public PropertySerializerMap$SerializerAndMapResult(JsonSerializer jsonserializer, PropertySerializerMap propertyserializermap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		serializer = jsonserializer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field JsonSerializer serializer>
		map = propertyserializermap;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field PropertySerializerMap map>
	//    8   14:return          
	}
}
