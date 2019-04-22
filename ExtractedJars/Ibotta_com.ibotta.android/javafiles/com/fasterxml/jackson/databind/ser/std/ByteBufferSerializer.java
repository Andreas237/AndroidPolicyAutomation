// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.*;
import com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdScalarSerializer

public class ByteBufferSerializer extends StdScalarSerializer
{

	public ByteBufferSerializer()
	{
		super(java/nio/ByteBuffer);
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <Class ByteBuffer>
	//    2    3:invokespecial   #12  <Method void StdScalarSerializer(Class)>
	//    3    6:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (jsonformatvisitorwrapper.expectArrayFormat(javatype)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #23  <Method JsonArrayFormatVisitor JsonFormatVisitorWrapper.expectArrayFormat(JavaType)>
	//    3    7:astore_1        
		if(jsonformatvisitorwrapper != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          21
			((JsonArrayFormatVisitor) (jsonformatvisitorwrapper)).itemsFormat(JsonFormatTypes.INTEGER);
	//    6   12:aload_1         
	//    7   13:getstatic       #29  <Field JsonFormatTypes JsonFormatTypes.INTEGER>
	//    8   16:invokeinterface #35  <Method void JsonArrayFormatVisitor.itemsFormat(JsonFormatTypes)>
	//    9   21:return          
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((ByteBuffer)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class ByteBuffer>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #43  <Method void serialize(ByteBuffer, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(ByteBuffer bytebuffer, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(bytebuffer.hasArray())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #47  <Method boolean ByteBuffer.hasArray()>
	//*   2    4:ifeq            21
		{
			jsongenerator.writeBinary(bytebuffer.array(), 0, bytebuffer.limit());
	//    3    7:aload_2         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #51  <Method byte[] ByteBuffer.array()>
	//    6   12:iconst_0        
	//    7   13:aload_1         
	//    8   14:invokevirtual   #55  <Method int ByteBuffer.limit()>
	//    9   17:invokevirtual   #61  <Method void JsonGenerator.writeBinary(byte[], int, int)>
			return;
	//   10   20:return          
		}
		bytebuffer = bytebuffer.asReadOnlyBuffer();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #65  <Method ByteBuffer ByteBuffer.asReadOnlyBuffer()>
	//   13   25:astore_1        
		if(bytebuffer.position() > 0)
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #68  <Method int ByteBuffer.position()>
	//*  16   30:ifle            38
			bytebuffer.rewind();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #72  <Method java.nio.Buffer ByteBuffer.rewind()>
	//   19   37:pop             
		serializerprovider = ((SerializerProvider) (new ByteBufferBackedInputStream(bytebuffer)));
	//   20   38:new             #74  <Class ByteBufferBackedInputStream>
	//   21   41:dup             
	//   22   42:aload_1         
	//   23   43:invokespecial   #77  <Method void ByteBufferBackedInputStream(ByteBuffer)>
	//   24   46:astore_3        
		jsongenerator.writeBinary(((InputStream) (serializerprovider)), bytebuffer.remaining());
	//   25   47:aload_2         
	//   26   48:aload_3         
	//   27   49:aload_1         
	//   28   50:invokevirtual   #80  <Method int ByteBuffer.remaining()>
	//   29   53:invokevirtual   #83  <Method int JsonGenerator.writeBinary(InputStream, int)>
	//   30   56:pop             
		((InputStream) (serializerprovider)).close();
	//   31   57:aload_3         
	//   32   58:invokevirtual   #88  <Method void InputStream.close()>
	//   33   61:return          
	}
}
