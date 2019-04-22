// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class ByteBufferBackedOutputStream extends OutputStream
{

	public ByteBufferBackedOutputStream(ByteBuffer bytebuffer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void OutputStream()>
		_b = bytebuffer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field ByteBuffer _b>
	//    5    9:return          
	}

	public void write(int i)
		throws IOException
	{
		_b.put((byte)i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ByteBuffer _b>
	//    2    4:iload_1         
	//    3    5:int2byte        
	//    4    6:invokevirtual   #24  <Method ByteBuffer ByteBuffer.put(byte)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		_b.put(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ByteBuffer _b>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #29  <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//    6   10:pop             
	//    7   11:return          
	}

	protected final ByteBuffer _b;
}
