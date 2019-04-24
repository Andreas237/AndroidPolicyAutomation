// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp;

import java.io.*;

// Referenced classes of package com.facebook.stetho.dumpapp:
//			DumpappOutputBrokenException

public class StreamFramer
	implements Closeable
{
	private class FramingOutputStream extends FilterOutputStream
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
				writeIntFrame(mPrefix, j);
		//    7   13:aload_0         
		//    8   14:getfield        #15  <Field StreamFramer this$0>
		//    9   17:aload_0         
		//   10   18:getfield        #20  <Field byte mPrefix>
		//   11   21:iload_3         
		//   12   22:invokestatic    #34  <Method void StreamFramer.access$000(StreamFramer, byte, int)>
				mMultiplexedOutputStream.write(abyte0, i, j);
		//   13   25:aload_0         
		//   14   26:getfield        #15  <Field StreamFramer this$0>
		//   15   29:invokestatic    #38  <Method DataOutputStream StreamFramer.access$100(StreamFramer)>
		//   16   32:aload_1         
		//   17   33:iload_2         
		//   18   34:iload_3         
		//   19   35:invokevirtual   #41  <Method void DataOutputStream.write(byte[], int, int)>
				mMultiplexedOutputStream.flush();
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

		FramingOutputStream(DataOutputStream dataoutputstream, byte byte0)
		{
			this$0 = StreamFramer.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field StreamFramer this$0>
			super(((OutputStream) (dataoutputstream)));
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #18  <Method void FilterOutputStream(OutputStream)>
			mPrefix = byte0;
		//    6   10:aload_0         
		//    7   11:iload_3         
		//    8   12:putfield        #20  <Field byte mPrefix>
		//    9   15:return          
		}
	}


	public StreamFramer(OutputStream outputstream)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		mMultiplexedOutputStream = new DataOutputStream(outputstream);
	//    2    4:aload_0         
	//    3    5:new             #30  <Class DataOutputStream>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #32  <Method void DataOutputStream(OutputStream)>
	//    7   13:putfield        #34  <Field DataOutputStream mMultiplexedOutputStream>
		mStdout = new PrintStream(((OutputStream) (new BufferedOutputStream(((OutputStream) (new FramingOutputStream(mMultiplexedOutputStream, (byte)49)))))));
	//    8   16:aload_0         
	//    9   17:new             #36  <Class PrintStream>
	//   10   20:dup             
	//   11   21:new             #38  <Class BufferedOutputStream>
	//   12   24:dup             
	//   13   25:new             #8   <Class StreamFramer$FramingOutputStream>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #34  <Field DataOutputStream mMultiplexedOutputStream>
	//   18   34:bipush          49
	//   19   36:invokespecial   #41  <Method void StreamFramer$FramingOutputStream(StreamFramer, DataOutputStream, byte)>
	//   20   39:invokespecial   #42  <Method void BufferedOutputStream(OutputStream)>
	//   21   42:invokespecial   #43  <Method void PrintStream(OutputStream)>
	//   22   45:putfield        #45  <Field PrintStream mStdout>
		mStderr = new PrintStream(((OutputStream) (new FramingOutputStream(mMultiplexedOutputStream, (byte)50))));
	//   23   48:aload_0         
	//   24   49:new             #36  <Class PrintStream>
	//   25   52:dup             
	//   26   53:new             #8   <Class StreamFramer$FramingOutputStream>
	//   27   56:dup             
	//   28   57:aload_0         
	//   29   58:aload_0         
	//   30   59:getfield        #34  <Field DataOutputStream mMultiplexedOutputStream>
	//   31   62:bipush          50
	//   32   64:invokespecial   #41  <Method void StreamFramer$FramingOutputStream(StreamFramer, DataOutputStream, byte)>
	//   33   67:invokespecial   #43  <Method void PrintStream(OutputStream)>
	//   34   70:putfield        #47  <Field PrintStream mStderr>
	//   35   73:return          
	}

	private void writeIntFrame(byte byte0, int i)
		throws IOException
	{
		mMultiplexedOutputStream.write(((int) (byte0)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field DataOutputStream mMultiplexedOutputStream>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #61  <Method void DataOutputStream.write(int)>
		mMultiplexedOutputStream.writeInt(i);
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field DataOutputStream mMultiplexedOutputStream>
	//    6   12:iload_2         
	//    7   13:invokevirtual   #64  <Method void DataOutputStream.writeInt(int)>
	//    8   16:return          
	}

	public void close()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mMultiplexedOutputStream.close();
	//    2    2:aload_0         
	//    3    3:getfield        #34  <Field DataOutputStream mMultiplexedOutputStream>
	//    4    6:invokevirtual   #67  <Method void DataOutputStream.close()>
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		Exception exception;
		exception;
	//    8   12:astore_1        
	//*   9   13:aload_0         
		throw exception;
	//   10   14:monitorexit     
	//   11   15:aload_1         
	//   12   16:athrow          
	}

	public PrintStream getStderr()
	{
		return mStderr;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field PrintStream mStderr>
	//    2    4:areturn         
	}

	public PrintStream getStdout()
	{
		return mStdout;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field PrintStream mStdout>
	//    2    4:areturn         
	}

	public void writeExitCode(int i)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mStdout.flush();
	//    2    2:aload_0         
	//    3    3:getfield        #45  <Field PrintStream mStdout>
	//    4    6:invokevirtual   #74  <Method void PrintStream.flush()>
		mStderr.flush();
	//    5    9:aload_0         
	//    6   10:getfield        #47  <Field PrintStream mStderr>
	//    7   13:invokevirtual   #74  <Method void PrintStream.flush()>
		writeIntFrame((byte)120, i);
	//    8   16:aload_0         
	//    9   17:bipush          120
	//   10   19:iload_1         
	//   11   20:invokespecial   #55  <Method void writeIntFrame(byte, int)>
		this;
	//   12   23:aload_0         
		JVM INSTR monitorexit ;
	//   13   24:monitorexit     
		return;
	//   14   25:return          
		Exception exception;
		exception;
	//   15   26:astore_2        
	//*  16   27:aload_0         
		throw exception;
	//   17   28:monitorexit     
	//   18   29:aload_2         
	//   19   30:athrow          
	}

	private static final byte EXIT_FRAME_PREFIX = 120;
	private static final byte STDERR_FRAME_PREFIX = 50;
	private static final byte STDOUT_FRAME_PREFIX = 49;
	private final DataOutputStream mMultiplexedOutputStream;
	private final PrintStream mStderr;
	private final PrintStream mStdout;


/*
	static void access$000(StreamFramer streamframer, byte byte0, int i)
		throws IOException
	{
		streamframer.writeIntFrame(byte0, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #55  <Method void writeIntFrame(byte, int)>
		return;
	//    4    6:return          
	}

*/


/*
	static DataOutputStream access$100(StreamFramer streamframer)
	{
		return streamframer.mMultiplexedOutputStream;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field DataOutputStream mMultiplexedOutputStream>
	//    2    4:areturn         
	}

*/
}
