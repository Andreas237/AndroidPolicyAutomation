// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import java.io.*;

class CountingOutputStream extends FilterOutputStream
{

	public CountingOutputStream(OutputStream outputstream)
	{
		super(outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void FilterOutputStream(OutputStream)>
	//    3    5:return          
	}

	public long getCount()
	{
		return mCount;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field long mCount>
	//    2    4:lreturn         
	}

	public void write(int i)
		throws IOException
	{
		out.write(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field OutputStream out>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #27  <Method void OutputStream.write(int)>
		mCount = mCount + 1L;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field long mCount>
	//    7   13:lconst_1        
	//    8   14:ladd            
	//    9   15:putfield        #15  <Field long mCount>
	//   10   18:return          
	}

	public void write(byte abyte0[])
		throws IOException
	{
		write(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #32  <Method void write(byte[], int, int)>
	//    6    8:return          
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		out.write(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field OutputStream out>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #33  <Method void OutputStream.write(byte[], int, int)>
		mCount = mCount + (long)j;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #15  <Field long mCount>
	//    9   15:iload_3         
	//   10   16:i2l             
	//   11   17:ladd            
	//   12   18:putfield        #15  <Field long mCount>
	//   13   21:return          
	}

	private long mCount;
}
