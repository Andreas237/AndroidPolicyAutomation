// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;

public class NioPathSerializer extends StdScalarSerializer
{

	public NioPathSerializer()
	{
		super(java/nio/file/Path);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Class Path>
	//    2    3:invokespecial   #16  <Method void StdScalarSerializer(Class)>
	//    3    6:return          
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((Path)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #13  <Class Path>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #24  <Method void serialize(Path, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(Path path, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeString(path.toUri().toString());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokeinterface #29  <Method URI Path.toUri()>
	//    3    7:invokevirtual   #35  <Method String URI.toString()>
	//    4   10:invokevirtual   #41  <Method void JsonGenerator.writeString(String)>
	//    5   13:return          
	}

	public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serializeWithType((Path)obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #13  <Class Path>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #46  <Method void serializeWithType(Path, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public void serializeWithType(Path path, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		com.fasterxml.jackson.core.type.WritableTypeId writabletypeid = typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(((Object) (path)), java/nio/file/Path, JsonToken.VALUE_STRING));
	//    0    0:aload           4
	//    1    2:aload_2         
	//    2    3:aload           4
	//    3    5:aload_1         
	//    4    6:ldc1            #13  <Class Path>
	//    5    8:getstatic       #52  <Field JsonToken JsonToken.VALUE_STRING>
	//    6   11:invokevirtual   #58  <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, Class, JsonToken)>
	//    7   14:invokevirtual   #62  <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//    8   17:astore          5
		serialize(path, jsongenerator, serializerprovider);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #24  <Method void serialize(Path, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//   14   26:aload           4
	//   15   28:aload_2         
	//   16   29:aload           5
	//   17   31:invokevirtual   #65  <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   18   34:pop             
	//   19   35:return          
	}

	private static final long serialVersionUID = 1L;
}
