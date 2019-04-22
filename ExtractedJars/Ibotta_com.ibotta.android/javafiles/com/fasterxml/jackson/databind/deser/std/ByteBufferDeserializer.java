// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.util.ByteBufferBackedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdScalarDeserializer

public class ByteBufferDeserializer extends StdScalarDeserializer
{

	protected ByteBufferDeserializer()
	{
		super(java/nio/ByteBuffer);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Class ByteBuffer>
	//    2    3:invokespecial   #16  <Method void StdScalarDeserializer(Class)>
	//    3    6:return          
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #26  <Method ByteBuffer deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext, (ByteBuffer)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:checkcast       #13  <Class ByteBuffer>
	//    5    7:invokevirtual   #31  <Method ByteBuffer deserialize(JsonParser, DeserializationContext, ByteBuffer)>
	//    6   10:areturn         
	}

	public ByteBuffer deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return ByteBuffer.wrap(jsonparser.getBinaryValue());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #37  <Method byte[] JsonParser.getBinaryValue()>
	//    2    4:invokestatic    #41  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//    3    7:areturn         
	}

	public ByteBuffer deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, ByteBuffer bytebuffer)
		throws IOException
	{
		ByteBufferBackedOutputStream bytebufferbackedoutputstream = new ByteBufferBackedOutputStream(bytebuffer);
	//    0    0:new             #43  <Class ByteBufferBackedOutputStream>
	//    1    3:dup             
	//    2    4:aload_3         
	//    3    5:invokespecial   #46  <Method void ByteBufferBackedOutputStream(ByteBuffer)>
	//    4    8:astore          4
		jsonparser.readBinaryValue(deserializationcontext.getBase64Variant(), ((OutputStream) (bytebufferbackedoutputstream)));
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:invokevirtual   #52  <Method com.fasterxml.jackson.core.Base64Variant DeserializationContext.getBase64Variant()>
	//    8   15:aload           4
	//    9   17:invokevirtual   #56  <Method int JsonParser.readBinaryValue(com.fasterxml.jackson.core.Base64Variant, OutputStream)>
	//   10   20:pop             
		((OutputStream) (bytebufferbackedoutputstream)).close();
	//   11   21:aload           4
	//   12   23:invokevirtual   #61  <Method void OutputStream.close()>
		return bytebuffer;
	//   13   26:aload_3         
	//   14   27:areturn         
	}

	private static final long serialVersionUID = 1L;
}
