// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer, StdKeySerializers

public static class StdKeySerializers$Dynamic extends StdSerializer
{

	protected JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		class1 = ((Class) (propertyserializermap.findAndAddKeySerializer(class1, serializerprovider, ((com.fasterxml.jackson.databind.BeanProperty) (null)))));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #34  <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddKeySerializer(Class, SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)>
	//    5    7:astore_2        
		if(propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.alizerAndMapResult) (class1)).map)
	//*   6    8:aload_1         
	//*   7    9:aload_2         
	//*   8   10:getfield        #39  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//*   9   13:if_acmpeq       24
			_dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.alizerAndMapResult) (class1)).map;
	//   10   16:aload_0         
	//   11   17:aload_2         
	//   12   18:getfield        #39  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//   13   21:putfield        #25  <Field PropertySerializerMap _dynamicSerializers>
		return ((com.fasterxml.jackson.databind.ser.impl.alizerAndMapResult) (class1)).serializer;
	//   14   24:aload_2         
	//   15   25:getfield        #43  <Field JsonSerializer com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.serializer>
	//   16   28:areturn         
	}

	Object readResolve()
	{
		_dynamicSerializers = PropertySerializerMap.emptyForProperties();
	//    0    0:aload_0         
	//    1    1:invokestatic    #23  <Method PropertySerializerMap PropertySerializerMap.emptyForProperties()>
	//    2    4:putfield        #25  <Field PropertySerializerMap _dynamicSerializers>
		return ((Object) (this));
	//    3    7:aload_0         
	//    4    8:areturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		Class class1 = obj.getClass();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #58  <Method Class Object.getClass()>
	//    2    4:astore          6
		PropertySerializerMap propertyserializermap = _dynamicSerializers;
	//    3    6:aload_0         
	//    4    7:getfield        #25  <Field PropertySerializerMap _dynamicSerializers>
	//    5   10:astore          7
		JsonSerializer jsonserializer1 = propertyserializermap.serializerFor(class1);
	//    6   12:aload           7
	//    7   14:aload           6
	//    8   16:invokevirtual   #62  <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//    9   19:astore          5
		JsonSerializer jsonserializer = jsonserializer1;
	//   10   21:aload           5
	//   11   23:astore          4
		if(jsonserializer1 == null)
	//*  12   25:aload           5
	//*  13   27:ifnonnull       41
			jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
	//   14   30:aload_0         
	//   15   31:aload           7
	//   16   33:aload           6
	//   17   35:aload_3         
	//   18   36:invokevirtual   #64  <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//   19   39:astore          4
		jsonserializer.serialize(obj, jsongenerator, serializerprovider);
	//   20   41:aload           4
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:aload_3         
	//   24   46:invokevirtual   #68  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//   25   49:return          
	}

	protected transient PropertySerializerMap _dynamicSerializers;

	public StdKeySerializers$Dynamic()
	{
		super(java/lang/String, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <Class String>
	//    2    3:iconst_0        
	//    3    4:invokespecial   #17  <Method void StdSerializer(Class, boolean)>
		_dynamicSerializers = PropertySerializerMap.emptyForProperties();
	//    4    7:aload_0         
	//    5    8:invokestatic    #23  <Method PropertySerializerMap PropertySerializerMap.emptyForProperties()>
	//    6   11:putfield        #25  <Field PropertySerializerMap _dynamicSerializers>
	//    7   14:return          
	}
}
