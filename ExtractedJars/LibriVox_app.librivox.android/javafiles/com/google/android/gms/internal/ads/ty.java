// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

// Referenced classes of package com.google.android.gms.internal.ads:
//			je

public final class ty extends ByteArrayOutputStream
{

	public ty(je je1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ByteArrayOutputStream()>
		a = je1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field je a>
		buf = a.a(Math.max(i, 256));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #13  <Field je a>
	//    8   14:iload_2         
	//    9   15:sipush          256
	//   10   18:invokestatic    #19  <Method int Math.max(int, int)>
	//   11   21:invokevirtual   #24  <Method byte[] je.a(int)>
	//   12   24:putfield        #28  <Field byte[] buf>
	//   13   27:return          
	}

	private final void a(int i)
	{
		if(count + i <= buf.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field int count>
	//*   2    4:iload_1         
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #28  <Field byte[] buf>
	//*   6   10:arraylength     
	//*   7   11:icmpgt          15
		{
			return;
	//    8   14:return          
		} else
		{
			byte abyte0[] = a.a(count + i << 1);
	//    9   15:aload_0         
	//   10   16:getfield        #13  <Field je a>
	//   11   19:aload_0         
	//   12   20:getfield        #34  <Field int count>
	//   13   23:iload_1         
	//   14   24:iadd            
	//   15   25:iconst_1        
	//   16   26:ishl            
	//   17   27:invokevirtual   #24  <Method byte[] je.a(int)>
	//   18   30:astore_2        
			System.arraycopy(((Object) (buf)), 0, ((Object) (abyte0)), 0, count);
	//   19   31:aload_0         
	//   20   32:getfield        #28  <Field byte[] buf>
	//   21   35:iconst_0        
	//   22   36:aload_2         
	//   23   37:iconst_0        
	//   24   38:aload_0         
	//   25   39:getfield        #34  <Field int count>
	//   26   42:invokestatic    #40  <Method void System.arraycopy(Object, int, Object, int, int)>
			a.a(buf);
	//   27   45:aload_0         
	//   28   46:getfield        #13  <Field je a>
	//   29   49:aload_0         
	//   30   50:getfield        #28  <Field byte[] buf>
	//   31   53:invokevirtual   #43  <Method void je.a(byte[])>
			buf = abyte0;
	//   32   56:aload_0         
	//   33   57:aload_2         
	//   34   58:putfield        #28  <Field byte[] buf>
			return;
	//   35   61:return          
		}
	}

	public final void close()
	{
		a.a(buf);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field je a>
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field byte[] buf>
	//    4    8:invokevirtual   #43  <Method void je.a(byte[])>
		buf = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #28  <Field byte[] buf>
		super.close();
	//    8   16:aload_0         
	//    9   17:invokespecial   #46  <Method void ByteArrayOutputStream.close()>
	//   10   20:return          
	}

	public final void finalize()
	{
		a.a(buf);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field je a>
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field byte[] buf>
	//    4    8:invokevirtual   #43  <Method void je.a(byte[])>
	//    5   11:return          
	}

	public final void write(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		a(1);
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #50  <Method void a(int)>
		super.write(i);
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:invokespecial   #52  <Method void ByteArrayOutputStream.write(int)>
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

	public final void write(byte abyte0[], int i, int j)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		a(j);
	//    2    2:aload_0         
	//    3    3:iload_3         
	//    4    4:invokespecial   #50  <Method void a(int)>
		super.write(abyte0, i, j);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:iload_2         
	//    8   10:iload_3         
	//    9   11:invokespecial   #55  <Method void ByteArrayOutputStream.write(byte[], int, int)>
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

	private final je a;
}
