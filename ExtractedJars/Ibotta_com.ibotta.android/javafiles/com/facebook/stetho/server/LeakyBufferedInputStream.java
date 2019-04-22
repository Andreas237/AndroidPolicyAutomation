// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import java.io.*;

// Referenced classes of package com.facebook.stetho.server:
//			CompositeInputStream

public class LeakyBufferedInputStream extends BufferedInputStream
{

	public LeakyBufferedInputStream(InputStream inputstream, int i)
	{
		super(inputstream, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #12  <Method void BufferedInputStream(InputStream, int)>
	//    4    6:return          
	}

	private byte[] clearBufferLocked()
	{
		byte abyte0[] = new byte[count - pos];
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int count>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field int pos>
	//    4    8:isub            
	//    5    9:newarray        byte[]
	//    6   11:astore_1        
		System.arraycopy(((Object) (buf)), pos, ((Object) (abyte0)), 0, abyte0.length);
	//    7   12:aload_0         
	//    8   13:getfield        #26  <Field byte[] buf>
	//    9   16:aload_0         
	//   10   17:getfield        #22  <Field int pos>
	//   11   20:aload_1         
	//   12   21:iconst_0        
	//   13   22:aload_1         
	//   14   23:arraylength     
	//   15   24:invokestatic    #32  <Method void System.arraycopy(Object, int, Object, int, int)>
		pos = 0;
	//   16   27:aload_0         
	//   17   28:iconst_0        
	//   18   29:putfield        #22  <Field int pos>
		count = 0;
	//   19   32:aload_0         
	//   20   33:iconst_0        
	//   21   34:putfield        #19  <Field int count>
		return abyte0;
	//   22   37:aload_1         
	//   23   38:areturn         
	}

	private void throwIfLeaked()
	{
		if(!mLeaked)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field boolean mLeaked>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		else
			throw new IllegalStateException();
	//    4    8:new             #38  <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:invokespecial   #40  <Method void IllegalStateException()>
	//    7   15:athrow          
	}

	private void throwIfMarked()
	{
		if(!mMarked)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field boolean mMarked>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		else
			throw new IllegalStateException();
	//    4    8:new             #38  <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:invokespecial   #40  <Method void IllegalStateException()>
	//    7   15:athrow          
	}

	public InputStream leakBufferAndStream()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		CompositeInputStream compositeinputstream;
		throwIfLeaked();
	//    2    2:aload_0         
	//    3    3:invokespecial   #47  <Method void throwIfLeaked()>
		throwIfMarked();
	//    4    6:aload_0         
	//    5    7:invokespecial   #49  <Method void throwIfMarked()>
		mLeaked = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #36  <Field boolean mLeaked>
		compositeinputstream = new CompositeInputStream(new InputStream[] {
			new ByteArrayInputStream(clearBufferLocked()), in
		});
	//    9   15:new             #51  <Class CompositeInputStream>
	//   10   18:dup             
	//   11   19:iconst_2        
	//   12   20:anewarray       InputStream[]
	//   13   23:dup             
	//   14   24:iconst_0        
	//   15   25:new             #55  <Class ByteArrayInputStream>
	//   16   28:dup             
	//   17   29:aload_0         
	//   18   30:invokespecial   #57  <Method byte[] clearBufferLocked()>
	//   19   33:invokespecial   #60  <Method void ByteArrayInputStream(byte[])>
	//   20   36:aastore         
	//   21   37:dup             
	//   22   38:iconst_1        
	//   23   39:aload_0         
	//   24   40:getfield        #64  <Field InputStream in>
	//   25   43:aastore         
	//   26   44:invokespecial   #67  <Method void CompositeInputStream(InputStream[])>
	//   27   47:astore_1        
		this;
	//   28   48:aload_0         
		JVM INSTR monitorexit ;
	//   29   49:monitorexit     
		return ((InputStream) (compositeinputstream));
	//   30   50:aload_1         
	//   31   51:areturn         
		Exception exception;
		exception;
	//   32   52:astore_1        
	//*  33   53:aload_0         
		throw exception;
	//   34   54:monitorexit     
	//   35   55:aload_1         
	//   36   56:athrow          
	}

	public void mark(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		throwIfLeaked();
	//    2    2:aload_0         
	//    3    3:invokespecial   #47  <Method void throwIfLeaked()>
		mMarked = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #43  <Field boolean mMarked>
		super.mark(i);
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:invokespecial   #71  <Method void BufferedInputStream.mark(int)>
		this;
	//   10   16:aload_0         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		Exception exception;
		exception;
	//   13   19:astore_2        
	//*  14   20:aload_0         
		throw exception;
	//   15   21:monitorexit     
	//   16   22:aload_2         
	//   17   23:athrow          
	}

	public boolean markSupported()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void reset()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		throwIfLeaked();
	//    2    2:aload_0         
	//    3    3:invokespecial   #47  <Method void throwIfLeaked()>
		mMarked = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #43  <Field boolean mMarked>
		super.reset();
	//    7   11:aload_0         
	//    8   12:invokespecial   #78  <Method void BufferedInputStream.reset()>
		this;
	//    9   15:aload_0         
		JVM INSTR monitorexit ;
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		Exception exception;
		exception;
	//   12   18:astore_1        
	//*  13   19:aload_0         
		throw exception;
	//   14   20:monitorexit     
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	private boolean mLeaked;
	private boolean mMarked;
}
