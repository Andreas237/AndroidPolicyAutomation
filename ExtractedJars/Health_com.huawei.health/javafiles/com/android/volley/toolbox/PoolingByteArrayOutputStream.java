// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.android.volley.toolbox:
//			ByteArrayPool

public class PoolingByteArrayOutputStream extends ByteArrayOutputStream
{

	public PoolingByteArrayOutputStream(ByteArrayPool bytearraypool)
	{
		this(bytearraypool, 256);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:sipush          256
	//    3    5:invokespecial   #14  <Method void PoolingByteArrayOutputStream(ByteArrayPool, int)>
	//    4    8:return          
	}

	public PoolingByteArrayOutputStream(ByteArrayPool bytearraypool, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void ByteArrayOutputStream()>
		mPool = bytearraypool;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field ByteArrayPool mPool>
		buf = mPool.getBuf(Math.max(i, 256));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #20  <Field ByteArrayPool mPool>
	//    8   14:iload_2         
	//    9   15:sipush          256
	//   10   18:invokestatic    #26  <Method int Math.max(int, int)>
	//   11   21:invokevirtual   #32  <Method byte[] ByteArrayPool.getBuf(int)>
	//   12   24:putfield        #36  <Field byte[] buf>
	//   13   27:return          
	}

	private void expand(int i)
	{
		if(count + i <= buf.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field int count>
	//*   2    4:iload_1         
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #36  <Field byte[] buf>
	//*   6   10:arraylength     
	//*   7   11:icmpgt          15
		{
			return;
	//    8   14:return          
		} else
		{
			byte abyte0[] = mPool.getBuf((count + i) * 2);
	//    9   15:aload_0         
	//   10   16:getfield        #20  <Field ByteArrayPool mPool>
	//   11   19:aload_0         
	//   12   20:getfield        #41  <Field int count>
	//   13   23:iload_1         
	//   14   24:iadd            
	//   15   25:iconst_2        
	//   16   26:imul            
	//   17   27:invokevirtual   #32  <Method byte[] ByteArrayPool.getBuf(int)>
	//   18   30:astore_2        
			System.arraycopy(((Object) (buf)), 0, ((Object) (abyte0)), 0, count);
	//   19   31:aload_0         
	//   20   32:getfield        #36  <Field byte[] buf>
	//   21   35:iconst_0        
	//   22   36:aload_2         
	//   23   37:iconst_0        
	//   24   38:aload_0         
	//   25   39:getfield        #41  <Field int count>
	//   26   42:invokestatic    #47  <Method void System.arraycopy(Object, int, Object, int, int)>
			mPool.returnBuf(buf);
	//   27   45:aload_0         
	//   28   46:getfield        #20  <Field ByteArrayPool mPool>
	//   29   49:aload_0         
	//   30   50:getfield        #36  <Field byte[] buf>
	//   31   53:invokevirtual   #51  <Method void ByteArrayPool.returnBuf(byte[])>
			buf = abyte0;
	//   32   56:aload_0         
	//   33   57:aload_2         
	//   34   58:putfield        #36  <Field byte[] buf>
			return;
	//   35   61:return          
		}
	}

	public void close()
		throws IOException
	{
		mPool.returnBuf(buf);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ByteArrayPool mPool>
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field byte[] buf>
	//    4    8:invokevirtual   #51  <Method void ByteArrayPool.returnBuf(byte[])>
		buf = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #36  <Field byte[] buf>
		super.close();
	//    8   16:aload_0         
	//    9   17:invokespecial   #56  <Method void ByteArrayOutputStream.close()>
	//   10   20:return          
	}

	public void finalize()
	{
		mPool.returnBuf(buf);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ByteArrayPool mPool>
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field byte[] buf>
	//    4    8:invokevirtual   #51  <Method void ByteArrayPool.returnBuf(byte[])>
	//    5   11:return          
	}

	public void write(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		expand(1);
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #61  <Method void expand(int)>
		super.write(i);
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:invokespecial   #63  <Method void ByteArrayOutputStream.write(int)>
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

	public void write(byte abyte0[], int i, int j)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		expand(j);
	//    2    2:aload_0         
	//    3    3:iload_3         
	//    4    4:invokespecial   #61  <Method void expand(int)>
		super.write(abyte0, i, j);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:iload_2         
	//    8   10:iload_3         
	//    9   11:invokespecial   #66  <Method void ByteArrayOutputStream.write(byte[], int, int)>
		this;
	//   10   14:aload_0         
		JVM INSTR monitorexit ;
	//   11   15:monitorexit     
		return;
	//   12   16:return          
		abyte0;
	//   13   17:astore_1        
	//*  14   18:aload_0         
		throw abyte0;
	//   15   19:monitorexit     
	//   16   20:aload_1         
	//   17   21:athrow          
	}

	private static final int DEFAULT_SIZE = 256;
	private final ByteArrayPool mPool;
}
