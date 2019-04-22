// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class ByteBufferBackedInputStream extends InputStream
{

	public ByteBufferBackedInputStream(ByteBuffer bytebuffer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void InputStream()>
		_b = bytebuffer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field ByteBuffer _b>
	//    5    9:return          
	}

	public int available()
	{
		return _b.remaining();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ByteBuffer _b>
	//    2    4:invokevirtual   #21  <Method int ByteBuffer.remaining()>
	//    3    7:ireturn         
	}

	public int read()
		throws IOException
	{
		if(_b.hasRemaining())
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field ByteBuffer _b>
	//*   2    4:invokevirtual   #28  <Method boolean ByteBuffer.hasRemaining()>
	//*   3    7:ifeq            22
			return _b.get() & 0xff;
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field ByteBuffer _b>
	//    6   14:invokevirtual   #32  <Method byte ByteBuffer.get()>
	//    7   17:sipush          255
	//    8   20:iand            
	//    9   21:ireturn         
		else
			return -1;
	//   10   22:iconst_m1       
	//   11   23:ireturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		if(!_b.hasRemaining())
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field ByteBuffer _b>
	//*   2    4:invokevirtual   #28  <Method boolean ByteBuffer.hasRemaining()>
	//*   3    7:ifne            12
		{
			return -1;
	//    4   10:iconst_m1       
	//    5   11:ireturn         
		} else
		{
			j = Math.min(j, _b.remaining());
	//    6   12:iload_3         
	//    7   13:aload_0         
	//    8   14:getfield        #13  <Field ByteBuffer _b>
	//    9   17:invokevirtual   #21  <Method int ByteBuffer.remaining()>
	//   10   20:invokestatic    #40  <Method int Math.min(int, int)>
	//   11   23:istore_3        
			_b.get(abyte0, i, j);
	//   12   24:aload_0         
	//   13   25:getfield        #13  <Field ByteBuffer _b>
	//   14   28:aload_1         
	//   15   29:iload_2         
	//   16   30:iload_3         
	//   17   31:invokevirtual   #43  <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//   18   34:pop             
			return j;
	//   19   35:iload_3         
	//   20   36:ireturn         
		}
	}

	protected final ByteBuffer _b;
}
