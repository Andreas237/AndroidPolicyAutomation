// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp;

import java.io.*;

// Referenced classes of package com.facebook.stetho.dumpapp:
//			StreamFramer, DumpappOutputBrokenException

private class StreamFramer$FramingOutputStream extends FilterOutputStream
{

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
	//   13   14:invokevirtual   #28  <Method void write(byte[], int, int)>
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
	//    5    5:invokevirtual   #28  <Method void write(byte[], int, int)>
	//    6    8:return          
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		if(j <= 0)
			break MISSING_BLOCK_LABEL_68;
	//    0    0:iload_3         
	//    1    1:ifle            68
		synchronized(StreamFramer.this)
	//*   2    4:aload_0         
	//*   3    5:getfield        #15  <Field StreamFramer this$0>
	//*   4    8:astore          4
	//*   5   10:aload           4
	//*   6   12:monitorenter    
		{
			StreamFramer.access$000(StreamFramer.this, mPrefix, j);
	//    7   13:aload_0         
	//    8   14:getfield        #15  <Field StreamFramer this$0>
	//    9   17:aload_0         
	//   10   18:getfield        #20  <Field byte mPrefix>
	//   11   21:iload_3         
	//   12   22:invokestatic    #34  <Method void StreamFramer.access$000(StreamFramer, byte, int)>
			StreamFramer.access$100(StreamFramer.this).write(abyte0, i, j);
	//   13   25:aload_0         
	//   14   26:getfield        #15  <Field StreamFramer this$0>
	//   15   29:invokestatic    #38  <Method DataOutputStream StreamFramer.access$100(StreamFramer)>
	//   16   32:aload_1         
	//   17   33:iload_2         
	//   18   34:iload_3         
	//   19   35:invokevirtual   #41  <Method void DataOutputStream.write(byte[], int, int)>
			StreamFramer.access$100(StreamFramer.this).flush();
	//   20   38:aload_0         
	//   21   39:getfield        #15  <Field StreamFramer this$0>
	//   22   42:invokestatic    #38  <Method DataOutputStream StreamFramer.access$100(StreamFramer)>
	//   23   45:invokevirtual   #45  <Method void DataOutputStream.flush()>
		}
	//   24   48:aload           4
	//   25   50:monitorexit     
		return;
	//   26   51:return          
		abyte0;
	//   27   52:astore_1        
		streamframer;
	//   28   53:aload           4
		JVM INSTR monitorexit ;
	//   29   55:monitorexit     
		try
		{
			throw abyte0;
	//   30   56:aload_1         
	//   31   57:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  32   58:astore_1        
		{
			throw new DumpappOutputBrokenException(((Throwable) (abyte0)));
	//   33   59:new             #47  <Class DumpappOutputBrokenException>
	//   34   62:dup             
	//   35   63:aload_1         
	//   36   64:invokespecial   #50  <Method void DumpappOutputBrokenException(Throwable)>
	//   37   67:athrow          
		}
	//   38   68:return          
	}

	private final byte mPrefix;
	final StreamFramer this$0;

	StreamFramer$FramingOutputStream(DataOutputStream dataoutputstream, byte byte0)
	{
		this$0 = StreamFramer.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field StreamFramer this$0>
		super(((java.io.OutputStream) (dataoutputstream)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void FilterOutputStream(java.io.OutputStream)>
		mPrefix = byte0;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #20  <Field byte mPrefix>
	//    9   15:return          
	}
}
