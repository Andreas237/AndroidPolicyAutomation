// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp;

import java.io.*;

// Referenced classes of package com.facebook.stetho.dumpapp:
//			Framer, DumpappOutputBrokenException

private class Framer$FramingOutputStream extends OutputStream
{

	public void close()
		throws IOException
	{
		mClosedHelper.close();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Framer$ClosedHelper mClosedHelper>
	//    2    4:invokevirtual   #35  <Method void Framer$ClosedHelper.close()>
	//    3    7:return          
	}

	public void write(int i)
		throws IOException
	{
		byte abyte0[] = new byte[1];
	//    0    0:iconst_1        
	//    1    1:newarray        byte[]
	//    2    3:astore_2        
		abyte0[0] = (byte)i;
	//    3    4:aload_2         
	//    4    5:iconst_0        
	//    5    6:iload_1         
	//    6    7:int2byte        
	//    7    8:bastore         
		write(abyte0, 0, abyte0.length);
	//    8    9:aload_0         
	//    9   10:aload_2         
	//   10   11:iconst_0        
	//   11   12:aload_2         
	//   12   13:arraylength     
	//   13   14:invokevirtual   #41  <Method void write(byte[], int, int)>
	//   14   17:return          
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
	//    5    5:invokevirtual   #41  <Method void write(byte[], int, int)>
	//    6    8:return          
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		mClosedHelper.throwIfClosed();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Framer$ClosedHelper mClosedHelper>
	//    2    4:invokevirtual   #45  <Method void Framer$ClosedHelper.throwIfClosed()>
		if(j <= 0)
			break MISSING_BLOCK_LABEL_72;
	//    3    7:iload_3         
	//    4    8:ifle            72
		synchronized(Framer.this)
	//*   5   11:aload_0         
	//*   6   12:getfield        #17  <Field Framer this$0>
	//*   7   15:astore          4
	//*   8   17:aload           4
	//*   9   19:monitorenter    
		{
			writeIntFrame(mPrefix, j);
	//   10   20:aload_0         
	//   11   21:getfield        #17  <Field Framer this$0>
	//   12   24:aload_0         
	//   13   25:getfield        #29  <Field byte mPrefix>
	//   14   28:iload_3         
	//   15   29:invokevirtual   #49  <Method void Framer.writeIntFrame(byte, int)>
			writeBlob(abyte0, i, j);
	//   16   32:aload_0         
	//   17   33:getfield        #17  <Field Framer this$0>
	//   18   36:aload_1         
	//   19   37:iload_2         
	//   20   38:iload_3         
	//   21   39:invokevirtual   #52  <Method void Framer.writeBlob(byte[], int, int)>
			Framer.access$300(Framer.this).flush();
	//   22   42:aload_0         
	//   23   43:getfield        #17  <Field Framer this$0>
	//   24   46:invokestatic    #56  <Method DataOutputStream Framer.access$300(Framer)>
	//   25   49:invokevirtual   #61  <Method void DataOutputStream.flush()>
		}
	//   26   52:aload           4
	//   27   54:monitorexit     
		return;
	//   28   55:return          
		abyte0;
	//   29   56:astore_1        
		framer;
	//   30   57:aload           4
		JVM INSTR monitorexit ;
	//   31   59:monitorexit     
		try
		{
			throw abyte0;
	//   32   60:aload_1         
	//   33   61:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  34   62:astore_1        
		{
			throw new DumpappOutputBrokenException(((Throwable) (abyte0)));
	//   35   63:new             #63  <Class DumpappOutputBrokenException>
	//   36   66:dup             
	//   37   67:aload_1         
	//   38   68:invokespecial   #66  <Method void DumpappOutputBrokenException(Throwable)>
	//   39   71:athrow          
		}
	//   40   72:return          
	}

	private final Framer.ClosedHelper mClosedHelper = new Framer.ClosedHelper(((Framer._cls1) (null)));
	private final byte mPrefix;
	final Framer this$0;

	public Framer$FramingOutputStream(byte byte0)
	{
		this$0 = Framer.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Framer this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void OutputStream()>
	//    5    9:aload_0         
	//    6   10:new             #22  <Class Framer$ClosedHelper>
	//    7   13:dup             
	//    8   14:aconst_null     
	//    9   15:invokespecial   #25  <Method void Framer$ClosedHelper(Framer$1)>
	//   10   18:putfield        #27  <Field Framer$ClosedHelper mClosedHelper>
		mPrefix = byte0;
	//   11   21:aload_0         
	//   12   22:iload_2         
	//   13   23:putfield        #29  <Field byte mPrefix>
	//   14   26:return          
	}
}
