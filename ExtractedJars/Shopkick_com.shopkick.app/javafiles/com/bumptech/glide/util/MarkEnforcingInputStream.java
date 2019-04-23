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
	//    2    2:invokespecial   #15  <Method void FilterInputStream(InputStream)>
		availableBytes = 0x80000000;
	//    3    5:aload_0         
	//    4    6:ldc1            #9   <Int 0x80000000>
	//    5    8:putfield        #17  <Field int availableBytes>
	//    6   11:return          
	}

	private long getBytesToRead(long l)
	{
		int i = availableBytes;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int availableBytes>
	//    2    4:istore_3        
		if(i == 0)
	//*   3    5:iload_3         
	//*   4    6:ifne            13
			return -1L;
	//    5    9:ldc2w           #22  <Long -1L>
	//    6   12:lreturn         
		if(i != 0x80000000 && l > (long)i)
	//*   7   13:iload_3         
	//*   8   14:ldc1            #9   <Int 0x80000000>
	//*   9   16:icmpeq          29
	//*  10   19:lload_1         
	//*  11   20:iload_3         
	//*  12   21:i2l             
	//*  13   22:lcmp            
	//*  14   23:ifle            29
			return (long)i;
	//   15   26:iload_3         
	//   16   27:i2l             
	//   17   28:lreturn         
		else
			return l;
	//   18   29:lload_1         
	//   19   30:lreturn         
	}

	private void updateAvailableBytesAfterRead(long l)
	{
		int i = availableBytes;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int availableBytes>
	//    2    4:istore_3        
		if(i != 0x80000000 && l != -1L)
	//*   3    5:iload_3         
	//*   4    6:ldc1            #9   <Int 0x80000000>
	//*   5    8:icmpeq          28
	//*   6   11:lload_1         
	//*   7   12:ldc2w           #22  <Long -1L>
	//*   8   15:lcmp            
	//*   9   16:ifeq            28
			availableBytes = (int)((long)i - l);
	//   10   19:aload_0         
	//   11   20:iload_3         
	//   12   21:i2l             
	//   13   22:lload_1         
	//   14   23:lsub            
	//   15   24:l2i             
	//   16   25:putfield        #17  <Field int availableBytes>
	//   17   28:return          
	}

	public int available()
		throws IOException
	{
		int i = availableBytes;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int availableBytes>
	//    2    4:istore_1        
		if(i == 0x80000000)
	//*   3    5:iload_1         
	//*   4    6:ldc1            #9   <Int 0x80000000>
	//*   5    8:icmpne          16
			return super.available();
	//    6   11:aload_0         
	//    7   12:invokespecial   #31  <Method int FilterInputStream.available()>
	//    8   15:ireturn         
		else
			return Math.min(i, super.available());
	//    9   16:iload_1         
	//   10   17:aload_0         
	//   11   18:invokespecial   #31  <Method int FilterInputStream.available()>
	//   12   21:invokestatic    #37  <Method int Math.min(int, int)>
	//   13   24:ireturn         
	}

	public void mark(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		super.mark(i);
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:invokespecial   #42  <Method void FilterInputStream.mark(int)>
		availableBytes = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #17  <Field int availableBytes>
		this;
	//    8   12:aload_0         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		Exception exception;
		exception;
	//   11   15:astore_2        
	//*  12   16:aload_0         
		throw exception;
	//   13   17:monitorexit     
	//   14   18:aload_2         
	//   15   19:athrow          
	}

	public int read()
		throws IOException
	{
		if(getBytesToRead(1L) == -1L)
	//*   0    0:aload_0         
	//*   1    1:lconst_1        
	//*   2    2:invokespecial   #45  <Method long getBytesToRead(long)>
	//*   3    5:ldc2w           #22  <Long -1L>
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
	//    9   15:invokespecial   #47  <Method int FilterInputStream.read()>
	//   10   18:istore_1        
			updateAvailableBytesAfterRead(1L);
	//   11   19:aload_0         
	//   12   20:lconst_1        
	//   13   21:invokespecial   #49  <Method void updateAvailableBytesAfterRead(long)>
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
	//    3    3:invokespecial   #45  <Method long getBytesToRead(long)>
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
	//   15   19:invokespecial   #52  <Method int FilterInputStream.read(byte[], int, int)>
	//   16   22:istore_2        
			updateAvailableBytesAfterRead(i);
	//   17   23:aload_0         
	//   18   24:iload_2         
	//   19   25:i2l             
	//   20   26:invokespecial   #49  <Method void updateAvailableBytesAfterRead(long)>
			return i;
	//   21   29:iload_2         
	//   22   30:ireturn         
		}
	}

	public void reset()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		super.reset();
	//    2    2:aload_0         
	//    3    3:invokespecial   #56  <Method void FilterInputStream.reset()>
		availableBytes = 0x80000000;
	//    4    6:aload_0         
	//    5    7:ldc1            #9   <Int 0x80000000>
	//    6    9:putfield        #17  <Field int availableBytes>
		this;
	//    7   12:aload_0         
		JVM INSTR monitorexit ;
	//    8   13:monitorexit     
		return;
	//    9   14:return          
		Exception exception;
		exception;
	//   10   15:astore_1        
	//*  11   16:aload_0         
		throw exception;
	//   12   17:monitorexit     
	//   13   18:aload_1         
	//   14   19:athrow          
	}

	public long skip(long l)
		throws IOException
	{
		l = getBytesToRead(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #45  <Method long getBytesToRead(long)>
	//    3    5:lstore_1        
		if(l == -1L)
	//*   4    6:lload_1         
	//*   5    7:ldc2w           #22  <Long -1L>
	//*   6   10:lcmp            
	//*   7   11:ifne            16
		{
			return 0L;
	//    8   14:lconst_0        
	//    9   15:lreturn         
		} else
		{
			l = super.skip(l);
	//   10   16:aload_0         
	//   11   17:lload_1         
	//   12   18:invokespecial   #59  <Method long FilterInputStream.skip(long)>
	//   13   21:lstore_1        
			updateAvailableBytesAfterRead(l);
	//   14   22:aload_0         
	//   15   23:lload_1         
	//   16   24:invokespecial   #49  <Method void updateAvailableBytesAfterRead(long)>
			return l;
	//   17   27:lload_1         
	//   18   28:lreturn         
		}
	}

	private static final int END_OF_STREAM = -1;
	private static final int UNSET = 0x80000000;
	private int availableBytes;
}
