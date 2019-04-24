// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class ByteOutput
{

	public ByteOutput()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract void write(byte byte0)
		throws IOException;

	public abstract void write(ByteBuffer bytebuffer)
		throws IOException;

	public abstract void write(byte abyte0[], int i, int j)
		throws IOException;

	public abstract void writeLazy(ByteBuffer bytebuffer)
		throws IOException;

	public abstract void writeLazy(byte abyte0[], int i, int j)
		throws IOException;
}
