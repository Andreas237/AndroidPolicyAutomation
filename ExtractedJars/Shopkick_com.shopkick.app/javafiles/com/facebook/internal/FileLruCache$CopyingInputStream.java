// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.io.*;

// Referenced classes of package com.facebook.internal:
//			FileLruCache

private static final class FileLruCache$CopyingInputStream extends InputStream
{

	public int available()
		throws IOException
	{
		return input.available();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field InputStream input>
	//    2    4:invokevirtual   #27  <Method int InputStream.available()>
	//    3    7:ireturn         
	}

	public void close()
		throws IOException
	{
		input.close();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field InputStream input>
	//    2    4:invokevirtual   #31  <Method void InputStream.close()>
		output.close();
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field OutputStream output>
	//    5   11:invokevirtual   #34  <Method void OutputStream.close()>
		return;
	//    6   14:return          
		Exception exception;
		exception;
	//    7   15:astore_1        
		output.close();
	//    8   16:aload_0         
	//    9   17:getfield        #20  <Field OutputStream output>
	//   10   20:invokevirtual   #34  <Method void OutputStream.close()>
		throw exception;
	//   11   23:aload_1         
	//   12   24:athrow          
	}

	public void mark(int i)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #38  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean markSupported()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int read()
		throws IOException
	{
		int i = input.read();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field InputStream input>
	//    2    4:invokevirtual   #44  <Method int InputStream.read()>
	//    3    7:istore_1        
		if(i >= 0)
	//*   4    8:iload_1         
	//*   5    9:iflt            20
			output.write(i);
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field OutputStream output>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #47  <Method void OutputStream.write(int)>
		return i;
	//   10   20:iload_1         
	//   11   21:ireturn         
	}

	public int read(byte abyte0[])
		throws IOException
	{
		int i = input.read(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field InputStream input>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #50  <Method int InputStream.read(byte[])>
	//    4    8:istore_2        
		if(i > 0)
	//*   5    9:iload_2         
	//*   6   10:ifle            23
			output.write(abyte0, 0, i);
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field OutputStream output>
	//    9   17:aload_1         
	//   10   18:iconst_0        
	//   11   19:iload_2         
	//   12   20:invokevirtual   #53  <Method void OutputStream.write(byte[], int, int)>
		return i;
	//   13   23:iload_2         
	//   14   24:ireturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		j = input.read(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field InputStream input>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #56  <Method int InputStream.read(byte[], int, int)>
	//    6   10:istore_3        
		if(j > 0)
	//*   7   11:iload_3         
	//*   8   12:ifle            25
			output.write(abyte0, i, j);
	//    9   15:aload_0         
	//   10   16:getfield        #20  <Field OutputStream output>
	//   11   19:aload_1         
	//   12   20:iload_2         
	//   13   21:iload_3         
	//   14   22:invokevirtual   #53  <Method void OutputStream.write(byte[], int, int)>
		return j;
	//   15   25:iload_3         
	//   16   26:ireturn         
	}

	public void reset()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		throw new UnsupportedOperationException();
	//    2    2:new             #38  <Class UnsupportedOperationException>
	//    3    5:dup             
	//    4    6:invokespecial   #39  <Method void UnsupportedOperationException()>
	//    5    9:athrow          
		Exception exception;
		exception;
	//    6   10:astore_1        
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		throw exception;
	//    9   13:aload_1         
	//   10   14:athrow          
	}

	public long skip(long l)
		throws IOException
	{
		byte abyte0[] = new byte[1024];
	//    0    0:sipush          1024
	//    1    3:newarray        byte[]
	//    2    5:astore          6
		int i;
		long l1;
		for(l1 = 0L; l1 < l; l1 += i)
	//*   3    7:lconst_0        
	//*   4    8:lstore          4
	//*   5   10:lload           4
	//*   6   12:lload_1         
	//*   7   13:lcmp            
	//*   8   14:ifge            54
		{
			i = read(abyte0, 0, (int)Math.min(l - l1, abyte0.length));
	//    9   17:aload_0         
	//   10   18:aload           6
	//   11   20:iconst_0        
	//   12   21:lload_1         
	//   13   22:lload           4
	//   14   24:lsub            
	//   15   25:aload           6
	//   16   27:arraylength     
	//   17   28:i2l             
	//   18   29:invokestatic    #65  <Method long Math.min(long, long)>
	//   19   32:l2i             
	//   20   33:invokevirtual   #66  <Method int read(byte[], int, int)>
	//   21   36:istore_3        
			if(i < 0)
	//*  22   37:iload_3         
	//*  23   38:ifge            44
				return l1;
	//   24   41:lload           4
	//   25   43:lreturn         
		}

	//   26   44:lload           4
	//   27   46:iload_3         
	//   28   47:i2l             
	//   29   48:ladd            
	//   30   49:lstore          4
	//*  31   51:goto            10
		return l1;
	//   32   54:lload           4
	//   33   56:lreturn         
	}

	final InputStream input;
	final OutputStream output;

	FileLruCache$CopyingInputStream(InputStream inputstream, OutputStream outputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void InputStream()>
		input = inputstream;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field InputStream input>
		output = outputstream;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field OutputStream output>
	//    8   14:return          
	}
}
