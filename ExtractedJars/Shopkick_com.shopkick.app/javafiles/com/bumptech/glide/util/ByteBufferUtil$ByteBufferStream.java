// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.bumptech.glide.util:
//			ByteBufferUtil

private static class ByteBufferUtil$ByteBufferStream extends InputStream
{

	public int available()
	{
		return byteBuffer.remaining();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ByteBuffer byteBuffer>
	//    2    4:invokevirtual   #32  <Method int ByteBuffer.remaining()>
	//    3    7:ireturn         
	}

	public void mark(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		markPos = byteBuffer.position();
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #23  <Field ByteBuffer byteBuffer>
	//    5    7:invokevirtual   #37  <Method int ByteBuffer.position()>
	//    6   10:putfield        #21  <Field int markPos>
		this;
	//    7   13:aload_0         
		JVM INSTR monitorexit ;
	//    8   14:monitorexit     
		return;
	//    9   15:return          
		Exception exception;
		exception;
	//   10   16:astore_2        
	//*  11   17:aload_0         
		throw exception;
	//   12   18:monitorexit     
	//   13   19:aload_2         
	//   14   20:athrow          
	}

	public boolean markSupported()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public int read()
	{
		if(!byteBuffer.hasRemaining())
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field ByteBuffer byteBuffer>
	//*   2    4:invokevirtual   #43  <Method boolean ByteBuffer.hasRemaining()>
	//*   3    7:ifne            12
			return -1;
	//    4   10:iconst_m1       
	//    5   11:ireturn         
		else
			return ((int) (byteBuffer.get()));
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field ByteBuffer byteBuffer>
	//    8   16:invokevirtual   #47  <Method byte ByteBuffer.get()>
	//    9   19:ireturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		if(!byteBuffer.hasRemaining())
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field ByteBuffer byteBuffer>
	//*   2    4:invokevirtual   #43  <Method boolean ByteBuffer.hasRemaining()>
	//*   3    7:ifne            12
		{
			return -1;
	//    4   10:iconst_m1       
	//    5   11:ireturn         
		} else
		{
			j = Math.min(j, available());
	//    6   12:iload_3         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #52  <Method int available()>
	//    9   17:invokestatic    #58  <Method int Math.min(int, int)>
	//   10   20:istore_3        
			byteBuffer.get(abyte0, i, j);
	//   11   21:aload_0         
	//   12   22:getfield        #23  <Field ByteBuffer byteBuffer>
	//   13   25:aload_1         
	//   14   26:iload_2         
	//   15   27:iload_3         
	//   16   28:invokevirtual   #61  <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//   17   31:pop             
			return j;
	//   18   32:iload_3         
	//   19   33:ireturn         
		}
	}

	public void reset()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(markPos == -1)
			break MISSING_BLOCK_LABEL_25;
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field int markPos>
	//    4    6:iconst_m1       
	//    5    7:icmpeq          25
		byteBuffer.position(markPos);
	//    6   10:aload_0         
	//    7   11:getfield        #23  <Field ByteBuffer byteBuffer>
	//    8   14:aload_0         
	//    9   15:getfield        #21  <Field int markPos>
	//   10   18:invokevirtual   #66  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   11   21:pop             
		this;
	//   12   22:aload_0         
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		throw new IOException("Cannot reset to unset mark position");
	//   15   25:new             #50  <Class IOException>
	//   16   28:dup             
	//   17   29:ldc1            #68  <String "Cannot reset to unset mark position">
	//   18   31:invokespecial   #71  <Method void IOException(String)>
	//   19   34:athrow          
		Exception exception;
		exception;
	//   20   35:astore_1        
		this;
	//   21   36:aload_0         
		JVM INSTR monitorexit ;
	//   22   37:monitorexit     
		throw exception;
	//   23   38:aload_1         
	//   24   39:athrow          
	}

	public long skip(long l)
		throws IOException
	{
		if(!byteBuffer.hasRemaining())
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field ByteBuffer byteBuffer>
	//*   2    4:invokevirtual   #43  <Method boolean ByteBuffer.hasRemaining()>
	//*   3    7:ifne            14
		{
			return -1L;
	//    4   10:ldc2w           #74  <Long -1L>
	//    5   13:lreturn         
		} else
		{
			l = Math.min(l, available());
	//    6   14:lload_1         
	//    7   15:aload_0         
	//    8   16:invokevirtual   #52  <Method int available()>
	//    9   19:i2l             
	//   10   20:invokestatic    #78  <Method long Math.min(long, long)>
	//   11   23:lstore_1        
			ByteBuffer bytebuffer = byteBuffer;
	//   12   24:aload_0         
	//   13   25:getfield        #23  <Field ByteBuffer byteBuffer>
	//   14   28:astore_3        
			bytebuffer.position((int)((long)bytebuffer.position() + l));
	//   15   29:aload_3         
	//   16   30:aload_3         
	//   17   31:invokevirtual   #37  <Method int ByteBuffer.position()>
	//   18   34:i2l             
	//   19   35:lload_1         
	//   20   36:ladd            
	//   21   37:l2i             
	//   22   38:invokevirtual   #66  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   23   41:pop             
			return l;
	//   24   42:lload_1         
	//   25   43:lreturn         
		}
	}

	private static final int UNSET = -1;
	private final ByteBuffer byteBuffer;
	private int markPos;

	ByteBufferUtil$ByteBufferStream(ByteBuffer bytebuffer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void InputStream()>
		markPos = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #21  <Field int markPos>
		byteBuffer = bytebuffer;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #23  <Field ByteBuffer byteBuffer>
	//    8   14:return          
	}
}
