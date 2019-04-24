// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util;

import java.io.*;

public class MarkEnforcingInputStream extends FilterInputStream
{

	public MarkEnforcingInputStream(InputStream inputstream)
	{
		super(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void FilterInputStream(InputStream)>
		availableBytes = 0x80000000;
	//    3    5:aload_0         
	//    4    6:ldc1            #9   <Int 0x80000000>
	//    5    8:putfield        #16  <Field int availableBytes>
	//    6   11:return          
	}

	private long getBytesToRead(long l)
	{
		if(availableBytes == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field int availableBytes>
	//*   2    4:ifne            11
			return -1L;
	//    3    7:ldc2w           #20  <Long -1L>
	//    4   10:lreturn         
		if(availableBytes != 0x80000000 && l > (long)availableBytes)
	//*   5   11:aload_0         
	//*   6   12:getfield        #16  <Field int availableBytes>
	//*   7   15:ldc1            #9   <Int 0x80000000>
	//*   8   17:icmpeq          36
	//*   9   20:lload_1         
	//*  10   21:aload_0         
	//*  11   22:getfield        #16  <Field int availableBytes>
	//*  12   25:i2l             
	//*  13   26:lcmp            
	//*  14   27:ifle            36
			return (long)availableBytes;
	//   15   30:aload_0         
	//   16   31:getfield        #16  <Field int availableBytes>
	//   17   34:i2l             
	//   18   35:lreturn         
		else
			return l;
	//   19   36:lload_1         
	//   20   37:lreturn         
	}

	private void updateAvailableBytesAfterRead(long l)
	{
		if(availableBytes != 0x80000000 && l != -1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field int availableBytes>
	//*   2    4:ldc1            #9   <Int 0x80000000>
	//*   3    6:icmpeq          29
	//*   4    9:lload_1         
	//*   5   10:ldc2w           #20  <Long -1L>
	//*   6   13:lcmp            
	//*   7   14:ifeq            29
			availableBytes = (int)((long)availableBytes - l);
	//    8   17:aload_0         
	//    9   18:aload_0         
	//   10   19:getfield        #16  <Field int availableBytes>
	//   11   22:i2l             
	//   12   23:lload_1         
	//   13   24:lsub            
	//   14   25:l2i             
	//   15   26:putfield        #16  <Field int availableBytes>
	//   16   29:return          
	}

	public int available()
		throws IOException
	{
		if(availableBytes == 0x80000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field int availableBytes>
	//*   2    4:ldc1            #9   <Int 0x80000000>
	//*   3    6:icmpne          14
			return super.available();
	//    4    9:aload_0         
	//    5   10:invokespecial   #29  <Method int FilterInputStream.available()>
	//    6   13:ireturn         
		else
			return Math.min(availableBytes, super.available());
	//    7   14:aload_0         
	//    8   15:getfield        #16  <Field int availableBytes>
	//    9   18:aload_0         
	//   10   19:invokespecial   #29  <Method int FilterInputStream.available()>
	//   11   22:invokestatic    #35  <Method int Math.min(int, int)>
	//   12   25:ireturn         
	}

	public void mark(int i)
	{
		super.mark(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #40  <Method void FilterInputStream.mark(int)>
		availableBytes = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #16  <Field int availableBytes>
	//    6   10:return          
	}

	public int read()
		throws IOException
	{
		if(getBytesToRead(1L) == -1L)
	//*   0    0:aload_0         
	//*   1    1:lconst_1        
	//*   2    2:invokespecial   #43  <Method long getBytesToRead(long)>
	//*   3    5:ldc2w           #20  <Long -1L>
	//*   4    8:lcmp            
	//*   5    9:ifne            14
		{
			return -1;
	//    6   12:iconst_m1       
	//    7   13:ireturn         
		} else
		{
			int i = super.read();
	//    8   14:aload_0         
	//    9   15:invokespecial   #45  <Method int FilterInputStream.read()>
	//   10   18:istore_1        
			updateAvailableBytesAfterRead(1L);
	//   11   19:aload_0         
	//   12   20:lconst_1        
	//   13   21:invokespecial   #47  <Method void updateAvailableBytesAfterRead(long)>
			return i;
	//   14   24:iload_1         
	//   15   25:ireturn         
		}
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		j = (int)getBytesToRead(j);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:i2l             
	//    3    3:invokespecial   #43  <Method long getBytesToRead(long)>
	//    4    6:l2i             
	//    5    7:istore_3        
		if(j == -1)
	//*   6    8:iload_3         
	//*   7    9:iconst_m1       
	//*   8   10:icmpne          15
		{
			return -1;
	//    9   13:iconst_m1       
	//   10   14:ireturn         
		} else
		{
			i = super.read(abyte0, i, j);
	//   11   15:aload_0         
	//   12   16:aload_1         
	//   13   17:iload_2         
	//   14   18:iload_3         
	//   15   19:invokespecial   #50  <Method int FilterInputStream.read(byte[], int, int)>
	//   16   22:istore_2        
			updateAvailableBytesAfterRead(i);
	//   17   23:aload_0         
	//   18   24:iload_2         
	//   19   25:i2l             
	//   20   26:invokespecial   #47  <Method void updateAvailableBytesAfterRead(long)>
			return i;
	//   21   29:iload_2         
	//   22   30:ireturn         
		}
	}

	public void reset()
		throws IOException
	{
		super.reset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void FilterInputStream.reset()>
		availableBytes = 0x80000000;
	//    2    4:aload_0         
	//    3    5:ldc1            #9   <Int 0x80000000>
	//    4    7:putfield        #16  <Field int availableBytes>
	//    5   10:return          
	}

	public long skip(long l)
		throws IOException
	{
		l = getBytesToRead(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #43  <Method long getBytesToRead(long)>
	//    3    5:lstore_1        
		if(l == -1L)
	//*   4    6:lload_1         
	//*   5    7:ldc2w           #20  <Long -1L>
	//*   6   10:lcmp            
	//*   7   11:ifne            18
		{
			return -1L;
	//    8   14:ldc2w           #20  <Long -1L>
	//    9   17:lreturn         
		} else
		{
			l = super.skip(l);
	//   10   18:aload_0         
	//   11   19:lload_1         
	//   12   20:invokespecial   #57  <Method long FilterInputStream.skip(long)>
	//   13   23:lstore_1        
			updateAvailableBytesAfterRead(l);
	//   14   24:aload_0         
	//   15   25:lload_1         
	//   16   26:invokespecial   #47  <Method void updateAvailableBytesAfterRead(long)>
			return l;
	//   17   29:lload_1         
	//   18   30:lreturn         
		}
	}

	private static final int END_OF_STREAM = -1;
	private static final int UNSET = 0x80000000;
	private int availableBytes;
}
