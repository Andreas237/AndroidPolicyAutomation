// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamCounter extends OutputStream
{

	public OutputStreamCounter(OutputStream outputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void OutputStream()>
		counter = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #15  <Field long counter>
		out = outputstream;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #17  <Field OutputStream out>
	//    8   14:return          
	}

	public void close()
		throws IOException
	{
		out.close();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field OutputStream out>
	//    2    4:invokevirtual   #23  <Method void OutputStream.close()>
	//    3    7:return          
	}

	public void flush()
		throws IOException
	{
		out.flush();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field OutputStream out>
	//    2    4:invokevirtual   #27  <Method void OutputStream.flush()>
	//    3    7:return          
	}

	public long getCounter()
	{
		return counter;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field long counter>
	//    2    4:lreturn         
	}

	public void resetCounter()
	{
		counter = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #15  <Field long counter>
	//    3    5:return          
	}

	public void write(int i)
		throws IOException
	{
		counter = counter + 1L;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field long counter>
	//    3    5:lconst_1        
	//    4    6:ladd            
	//    5    7:putfield        #15  <Field long counter>
		out.write(i);
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field OutputStream out>
	//    8   14:iload_1         
	//    9   15:invokevirtual   #34  <Method void OutputStream.write(int)>
	//   10   18:return          
	}

	public void write(byte abyte0[])
		throws IOException
	{
		counter = counter + (long)abyte0.length;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field long counter>
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:i2l             
	//    6    8:ladd            
	//    7    9:putfield        #15  <Field long counter>
		out.write(abyte0);
	//    8   12:aload_0         
	//    9   13:getfield        #17  <Field OutputStream out>
	//   10   16:aload_1         
	//   11   17:invokevirtual   #37  <Method void OutputStream.write(byte[])>
	//   12   20:return          
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		counter = counter + (long)j;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field long counter>
	//    3    5:iload_3         
	//    4    6:i2l             
	//    5    7:ladd            
	//    6    8:putfield        #15  <Field long counter>
		out.write(abyte0, i, j);
	//    7   11:aload_0         
	//    8   12:getfield        #17  <Field OutputStream out>
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:iload_3         
	//   12   18:invokevirtual   #40  <Method void OutputStream.write(byte[], int, int)>
	//   13   21:return          
	}

	protected long counter;
	protected OutputStream out;
}
