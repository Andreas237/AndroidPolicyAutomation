// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import java.io.IOException;
import java.io.OutputStream;

public final class CountOutputStream extends OutputStream
{

	CountOutputStream(OutputStream outputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void OutputStream()>
		bytesWritten = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #15  <Field int bytesWritten>
		out = outputstream;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #17  <Field OutputStream out>
	//    8   14:return          
	}

	public int getBytesWritten()
	{
		return bytesWritten;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int bytesWritten>
	//    2    4:ireturn         
	}

	public void write(int i)
		throws IOException
	{
		out.write(i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field OutputStream out>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #26  <Method void OutputStream.write(int)>
		bytesWritten = bytesWritten + 1;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field int bytesWritten>
	//    7   13:iconst_1        
	//    8   14:iadd            
	//    9   15:putfield        #15  <Field int bytesWritten>
	//   10   18:return          
	}

	public void write(byte abyte0[])
		throws IOException
	{
		out.write(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field OutputStream out>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #30  <Method void OutputStream.write(byte[])>
		bytesWritten = bytesWritten + abyte0.length;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field int bytesWritten>
	//    7   13:aload_1         
	//    8   14:arraylength     
	//    9   15:iadd            
	//   10   16:putfield        #15  <Field int bytesWritten>
	//   11   19:return          
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		out.write(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field OutputStream out>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #33  <Method void OutputStream.write(byte[], int, int)>
		bytesWritten = bytesWritten + j;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #15  <Field int bytesWritten>
	//    9   15:iload_3         
	//   10   16:iadd            
	//   11   17:putfield        #15  <Field int bytesWritten>
	//   12   20:return          
	}

	private int bytesWritten;
	private final OutputStream out;
}
