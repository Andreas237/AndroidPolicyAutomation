// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer

public class SerializableSerializer extends StdSerializer
{

	protected SerializableSerializer()
	{
		super(com/fasterxml/jackson/databind/JsonSerializable);
	//    0    0:aload_0         
	//    1    1:ldc1            #18  <Class JsonSerializable>
	//    2    3:invokespecial   #21  <Method void StdSerializer(Class)>
	//    3    6:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		jsonformatvisitorwrapper.expectAnyFormat(javatype);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #31  <Method com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor JsonFormatVisitorWrapper.expectAnyFormat(JavaType)>
	//    3    7:pop             
	//    4    8:return          
	}

	public boolean isEmpty(SerializerProvider serializerprovider, JsonSerializable jsonserializable)
	{
		if(jsonserializable instanceof com.fasterxml.jackson.databind.JsonSerializable.Base)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #36  <Class com.fasterxml.jackson.databind.JsonSerializable$Base>
	//*   2    4:ifeq            16
			return ((com.fasterxml.jackson.databind.JsonSerializable.Base)jsonserializable).isEmpty(serializerprovider);
	//    3    7:aload_2         
	//    4    8:checkcast       #36  <Class com.fasterxml.jackson.databind.JsonSerializable$Base>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #39  <Method boolean com.fasterxml.jackson.databind.JsonSerializable$Base.isEmpty(SerializerProvider)>
	//    7   15:ireturn         
		else
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (JsonSerializable)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #18  <Class JsonSerializable>
	//    4    6:invokevirtual   #42  <Method boolean isEmpty(SerializerProvider, JsonSerializable)>
	//    5    9:ireturn         
	}

	public void serialize(JsonSerializable jsonserializable, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsonserializable.serialize(jsongenerator, serializerprovider);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokeinterface #49  <Method void JsonSerializable.serialize(JsonGenerator, SerializerProvider)>
	//    4    8:return          
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((JsonSerializable)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class JsonSerializable>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #52  <Method void serialize(JsonSerializable, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public final void serializeWithType(JsonSerializable jsonserializable, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		jsonserializable.serializeWithType(jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokeinterface #57  <Method void JsonSerializable.serializeWithType(JsonGenerator, SerializerProvider, TypeSerializer)>
	//    5   10:return          
	}

	public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serializeWithType((JsonSerializable)obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class JsonSerializable>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #60  <Method void serializeWithType(JsonSerializable, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public static final SerializableSerializer instance = new SerializableSerializer();

	static 
	{
	//    0    0:new             #2   <Class SerializableSerializer>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void SerializableSerializer()>
	//    3    7:putstatic       #15  <Field SerializableSerializer instance>
	//*   4   10:return          
	}
}
