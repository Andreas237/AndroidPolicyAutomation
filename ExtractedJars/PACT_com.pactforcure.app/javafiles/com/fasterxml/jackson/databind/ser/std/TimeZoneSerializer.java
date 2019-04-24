// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdScalarSerializer

public class TimeZoneSerializer extends StdScalarSerializer
{

	public TimeZoneSerializer()
	{
		super(java/util/TimeZone);
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <Class TimeZone>
	//    2    3:invokespecial   #12  <Method void StdScalarSerializer(Class)>
	//    3    6:return          
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((TimeZone)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class TimeZone>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #20  <Method void serialize(TimeZone, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(TimeZone timezone, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeString(timezone.getID());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #25  <Method String TimeZone.getID()>
	//    3    5:invokevirtual   #31  <Method void JsonGenerator.writeString(String)>
	//    4    8:return          
	}

	public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serializeWithType((TimeZone)obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class TimeZone>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #36  <Method void serializeWithType(TimeZone, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public void serializeWithType(TimeZone timezone, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		typeserializer.writeTypePrefixForScalar(((Object) (timezone)), jsongenerator, java/util/TimeZone);
	//    0    0:aload           4
	//    1    2:aload_1         
	//    2    3:aload_2         
	//    3    4:ldc1            #9   <Class TimeZone>
	//    4    6:invokevirtual   #42  <Method void TypeSerializer.writeTypePrefixForScalar(Object, JsonGenerator, Class)>
		serialize(timezone, jsongenerator, serializerprovider);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokevirtual   #20  <Method void serialize(TimeZone, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffixForScalar(((Object) (timezone)), jsongenerator);
	//   10   16:aload           4
	//   11   18:aload_1         
	//   12   19:aload_2         
	//   13   20:invokevirtual   #46  <Method void TypeSerializer.writeTypeSuffixForScalar(Object, JsonGenerator)>
	//   14   23:return          
	}
}
