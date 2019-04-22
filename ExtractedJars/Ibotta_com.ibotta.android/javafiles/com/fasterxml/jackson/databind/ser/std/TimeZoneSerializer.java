// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
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
		com.fasterxml.jackson.core.type.WritableTypeId writabletypeid = typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(((Object) (timezone)), java/util/TimeZone, JsonToken.VALUE_STRING));
	//    0    0:aload           4
	//    1    2:aload_2         
	//    2    3:aload           4
	//    3    5:aload_1         
	//    4    6:ldc1            #9   <Class TimeZone>
	//    5    8:getstatic       #42  <Field JsonToken JsonToken.VALUE_STRING>
	//    6   11:invokevirtual   #48  <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, Class, JsonToken)>
	//    7   14:invokevirtual   #52  <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//    8   17:astore          5
		serialize(timezone, jsongenerator, serializerprovider);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #20  <Method void serialize(TimeZone, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//   14   26:aload           4
	//   15   28:aload_2         
	//   16   29:aload           5
	//   17   31:invokevirtual   #55  <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   18   34:pop             
	//   19   35:return          
	}
}
