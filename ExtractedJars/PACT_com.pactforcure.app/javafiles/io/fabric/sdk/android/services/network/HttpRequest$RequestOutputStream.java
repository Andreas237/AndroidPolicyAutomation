// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

// Referenced classes of package io.fabric.sdk.android.services.network:
//			HttpRequest

public static class HttpRequest$RequestOutputStream extends BufferedOutputStream
{

	public HttpRequest$RequestOutputStream write(String s)
		throws IOException
	{
		s = ((String) (encoder.encode(CharBuffer.wrap(((CharSequence) (s))))));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field CharsetEncoder encoder>
	//    2    4:aload_1         
	//    3    5:invokestatic    #43  <Method CharBuffer CharBuffer.wrap(CharSequence)>
	//    4    8:invokevirtual   #49  <Method ByteBuffer CharsetEncoder.encode(CharBuffer)>
	//    5   11:astore_1        
		super.write(((ByteBuffer) (s)).array(), 0, ((ByteBuffer) (s)).limit());
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #55  <Method byte[] ByteBuffer.array()>
	//    9   17:iconst_0        
	//   10   18:aload_1         
	//   11   19:invokevirtual   #59  <Method int ByteBuffer.limit()>
	//   12   22:invokespecial   #62  <Method void BufferedOutputStream.write(byte[], int, int)>
		return this;
	//   13   25:aload_0         
	//   14   26:areturn         
	}

	private final CharsetEncoder encoder;


/*
	static CharsetEncoder access$200(HttpRequest$RequestOutputStream httprequest$requestoutputstream)
	{
		return httprequest$requestoutputstream.encoder;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field CharsetEncoder encoder>
	//    2    4:areturn         
	}

*/

	public HttpRequest$RequestOutputStream(OutputStream outputstream, String s, int i)
	{
		super(outputstream, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_3         
	//    3    3:invokespecial   #14  <Method void BufferedOutputStream(OutputStream, int)>
		encoder = Charset.forName(HttpRequest.access$000(s)).newEncoder();
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokestatic    #18  <Method String HttpRequest.access$000(String)>
	//    7   11:invokestatic    #24  <Method Charset Charset.forName(String)>
	//    8   14:invokevirtual   #28  <Method CharsetEncoder Charset.newEncoder()>
	//    9   17:putfield        #30  <Field CharsetEncoder encoder>
	//   10   20:return          
	}
}
