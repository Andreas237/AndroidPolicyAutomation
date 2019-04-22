// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp;

import com.facebook.stetho.common.LogUtil;
import java.io.*;
import java.nio.charset.Charset;

// Referenced classes of package com.facebook.stetho.dumpapp:
//			DumpappFramingException, UnexpectedFrameException, DumpappOutputBrokenException

class Framer
{
	private static class ClosedHelper
	{

		public void close()
		{
			mClosed = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #19  <Field boolean mClosed>
		//    3    5:return          
		}

		public void throwIfClosed()
			throws IOException
		{
			if(!mClosed)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field boolean mClosed>
		//*   2    4:ifne            8
				return;
		//    3    7:return          
			else
				throw new IOException("Stream is closed");
		//    4    8:new             #22  <Class IOException>
		//    5   11:dup             
		//    6   12:ldc1            #24  <String "Stream is closed">
		//    7   14:invokespecial   #27  <Method void IOException(String)>
		//    8   17:athrow          
		}

		private volatile boolean mClosed;

		private ClosedHelper()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private class FramingInputStream extends InputStream
	{

		public void close()
			throws IOException
		{
			mClosedHelper.close();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Framer$ClosedHelper mClosedHelper>
		//    2    4:invokevirtual   #34  <Method void Framer$ClosedHelper.close()>
		//    3    7:return          
		}

		public int read()
			throws IOException
		{
			byte abyte0[] = new byte[1];
		//    0    0:iconst_1        
		//    1    1:newarray        byte[]
		//    2    3:astore_1        
			if(read(abyte0) == 0)
		//*   3    4:aload_0         
		//*   4    5:aload_1         
		//*   5    6:invokevirtual   #40  <Method int read(byte[])>
		//*   6    9:ifne            14
				return -1;
		//    7   12:iconst_m1       
		//    8   13:ireturn         
			else
				return ((int) (abyte0[0]));
		//    9   14:aload_1         
		//   10   15:iconst_0        
		//   11   16:baload          
		//   12   17:ireturn         
		}

		public int read(byte abyte0[])
			throws IOException
		{
			return read(abyte0, 0, abyte0.length);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iconst_0        
		//    3    3:aload_1         
		//    4    4:arraylength     
		//    5    5:invokevirtual   #43  <Method int read(byte[], int, int)>
		//    6    8:ireturn         
		}

		public int read(byte abyte0[], int i, int j)
			throws IOException
		{
			mClosedHelper.throwIfClosed();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Framer$ClosedHelper mClosedHelper>
		//    2    4:invokevirtual   #46  <Method void Framer$ClosedHelper.throwIfClosed()>
			Framer framer = Framer.this;
		//    3    7:aload_0         
		//    4    8:getfield        #15  <Field Framer this$0>
		//    5   11:astore          6
			framer;
		//    6   13:aload           6
			JVM INSTR monitorenter ;
		//    7   15:monitorenter    
			byte byte0;
			writeIntFrame((byte)95, j);
		//    8   16:aload_0         
		//    9   17:getfield        #15  <Field Framer this$0>
		//   10   20:bipush          95
		//   11   22:iload_3         
		//   12   23:invokevirtual   #50  <Method void Framer.writeIntFrame(byte, int)>
			byte0 = readFrameType();
		//   13   26:aload_0         
		//   14   27:getfield        #15  <Field Framer this$0>
		//   15   30:invokevirtual   #54  <Method byte Framer.readFrameType()>
		//   16   33:istore          4
			if(byte0 != 45)
				break MISSING_BLOCK_LABEL_132;
		//   17   35:iload           4
		//   18   37:bipush          45
		//   19   39:icmpne          132
			int k = readInt();
		//   20   42:aload_0         
		//   21   43:getfield        #15  <Field Framer this$0>
		//   22   46:invokevirtual   #57  <Method int Framer.readInt()>
		//   23   49:istore          5
			if(k <= 0)
				break MISSING_BLOCK_LABEL_126;
		//   24   51:iload           5
		//   25   53:ifle            126
			if(k > j)
				break MISSING_BLOCK_LABEL_79;
		//   26   56:iload           5
		//   27   58:iload_3         
		//   28   59:icmpgt          79
			mInput.readFully(abyte0, i, k);
		//   29   62:aload_0         
		//   30   63:getfield        #15  <Field Framer this$0>
		//   31   66:invokestatic    #61  <Method DataInputStream Framer.access$200(Framer)>
		//   32   69:aload_1         
		//   33   70:iload_2         
		//   34   71:iload           5
		//   35   73:invokevirtual   #67  <Method void DataInputStream.readFully(byte[], int, int)>
			break MISSING_BLOCK_LABEL_126;
		//   36   76:goto            126
			abyte0 = ((byte []) (new StringBuilder()));
		//   37   79:new             #69  <Class StringBuilder>
		//   38   82:dup             
		//   39   83:invokespecial   #70  <Method void StringBuilder()>
		//   40   86:astore_1        
			((StringBuilder) (abyte0)).append("Expected at most ");
		//   41   87:aload_1         
		//   42   88:ldc1            #72  <String "Expected at most ">
		//   43   90:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
		//   44   93:pop             
			((StringBuilder) (abyte0)).append(j);
		//   45   94:aload_1         
		//   46   95:iload_3         
		//   47   96:invokevirtual   #79  <Method StringBuilder StringBuilder.append(int)>
		//   48   99:pop             
			((StringBuilder) (abyte0)).append(" bytes, got: ");
		//   49  100:aload_1         
		//   50  101:ldc1            #81  <String " bytes, got: ">
		//   51  103:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
		//   52  106:pop             
			((StringBuilder) (abyte0)).append(k);
		//   53  107:aload_1         
		//   54  108:iload           5
		//   55  110:invokevirtual   #79  <Method StringBuilder StringBuilder.append(int)>
		//   56  113:pop             
			throw new DumpappFramingException(((StringBuilder) (abyte0)).toString());
		//   57  114:new             #83  <Class DumpappFramingException>
		//   58  117:dup             
		//   59  118:aload_1         
		//   60  119:invokevirtual   #87  <Method String StringBuilder.toString()>
		//   61  122:invokespecial   #90  <Method void DumpappFramingException(String)>
		//   62  125:athrow          
			framer;
		//   63  126:aload           6
			JVM INSTR monitorexit ;
		//   64  128:monitorexit     
			return k;
		//   65  129:iload           5
		//   66  131:ireturn         
			throw new UnexpectedFrameException((byte)45, byte0);
		//   67  132:new             #92  <Class UnexpectedFrameException>
		//   68  135:dup             
		//   69  136:bipush          45
		//   70  138:iload           4
		//   71  140:invokespecial   #95  <Method void UnexpectedFrameException(byte, byte)>
		//   72  143:athrow          
			abyte0;
		//   73  144:astore_1        
			framer;
		//   74  145:aload           6
			JVM INSTR monitorexit ;
		//   75  147:monitorexit     
			throw abyte0;
		//   76  148:aload_1         
		//   77  149:athrow          
		}

		public long skip(long l)
			throws IOException
		{
			byte abyte0[] = new byte[(int)Math.min(l, 2048L)];
		//    0    0:lload_1         
		//    1    1:ldc2w           #98  <Long 2048L>
		//    2    4:invokestatic    #105 <Method long Math.min(long, long)>
		//    3    7:l2i             
		//    4    8:newarray        byte[]
		//    5   10:astore          7
			Framer framer = Framer.this;
		//    6   12:aload_0         
		//    7   13:getfield        #15  <Field Framer this$0>
		//    8   16:astore          6
			framer;
		//    9   18:aload           6
			JVM INSTR monitorenter ;
		//   10   20:monitorenter    
			long l1 = 0L;
		//   11   21:lconst_0        
		//   12   22:lstore          4
_L2:
			if(l1 >= l)
				break MISSING_BLOCK_LABEL_45;
		//   13   24:lload           4
		//   14   26:lload_1         
		//   15   27:lcmp            
		//   16   28:ifge            45
			int i = read(abyte0);
		//   17   31:aload_0         
		//   18   32:aload           7
		//   19   34:invokevirtual   #40  <Method int read(byte[])>
		//   20   37:istore_3        
			if(i >= 0)
		//*  21   38:iload_3         
		//*  22   39:ifge            59
				break MISSING_BLOCK_LABEL_59;
		//   23   42:goto            45
			framer;
		//   24   45:aload           6
			JVM INSTR monitorexit ;
		//   25   47:monitorexit     
			return l1;
		//   26   48:lload           4
		//   27   50:lreturn         
			Exception exception;
			exception;
		//   28   51:astore          7
			framer;
		//   29   53:aload           6
			JVM INSTR monitorexit ;
		//   30   55:monitorexit     
			throw exception;
		//   31   56:aload           7
		//   32   58:athrow          
			l1 += i;
		//   33   59:lload           4
		//   34   61:iload_3         
		//   35   62:i2l             
		//   36   63:ladd            
		//   37   64:lstore          4
			if(true) goto _L2; else goto _L1
		//   38   66:goto            24
_L1:
		}

		private final ClosedHelper mClosedHelper;
		final Framer this$0;

		private FramingInputStream()
		{
			this$0 = Framer.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field Framer this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void InputStream()>
			mClosedHelper = new ClosedHelper();
		//    5    9:aload_0         
		//    6   10:new             #20  <Class Framer$ClosedHelper>
		//    7   13:dup             
		//    8   14:aconst_null     
		//    9   15:invokespecial   #23  <Method void Framer$ClosedHelper(Framer$1)>
		//   10   18:putfield        #25  <Field Framer$ClosedHelper mClosedHelper>
		//   11   21:return          
		}

	}

	private class FramingOutputStream extends OutputStream
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
				mMultiplexedOutputStream.flush();
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

		private final ClosedHelper mClosedHelper = new ClosedHelper();
		private final byte mPrefix;
		final Framer this$0;

		public FramingOutputStream(byte byte0)
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


	public Framer(InputStream inputstream, OutputStream outputstream)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		mInput = new DataInputStream(inputstream);
	//    2    4:aload_0         
	//    3    5:new             #50  <Class DataInputStream>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #53  <Method void DataInputStream(InputStream)>
	//    7   13:putfield        #55  <Field DataInputStream mInput>
		mMultiplexedOutputStream = new DataOutputStream(outputstream);
	//    8   16:aload_0         
	//    9   17:new             #57  <Class DataOutputStream>
	//   10   20:dup             
	//   11   21:aload_2         
	//   12   22:invokespecial   #60  <Method void DataOutputStream(OutputStream)>
	//   13   25:putfield        #62  <Field DataOutputStream mMultiplexedOutputStream>
	//   14   28:aload_0         
	//   15   29:new             #11  <Class Framer$FramingInputStream>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:aconst_null     
	//   19   35:invokespecial   #65  <Method void Framer$FramingInputStream(Framer, Framer$1)>
	//   20   38:putfield        #67  <Field InputStream mStdin>
	//   21   41:aload_0         
	//   22   42:new             #69  <Class PrintStream>
	//   23   45:dup             
	//   24   46:new             #71  <Class BufferedOutputStream>
	//   25   49:dup             
	//   26   50:new             #14  <Class Framer$FramingOutputStream>
	//   27   53:dup             
	//   28   54:aload_0         
	//   29   55:bipush          49
	//   30   57:invokespecial   #74  <Method void Framer$FramingOutputStream(Framer, byte)>
	//   31   60:invokespecial   #75  <Method void BufferedOutputStream(OutputStream)>
	//   32   63:invokespecial   #76  <Method void PrintStream(OutputStream)>
	//   33   66:putfield        #78  <Field PrintStream mStdout>
	//   34   69:aload_0         
	//   35   70:new             #69  <Class PrintStream>
	//   36   73:dup             
	//   37   74:new             #14  <Class Framer$FramingOutputStream>
	//   38   77:dup             
	//   39   78:aload_0         
	//   40   79:bipush          50
	//   41   81:invokespecial   #74  <Method void Framer$FramingOutputStream(Framer, byte)>
	//   42   84:invokespecial   #76  <Method void PrintStream(OutputStream)>
	//   43   87:putfield        #80  <Field PrintStream mStderr>
	//   44   90:return          
	}

	private static Throwable handleSuppression(Throwable throwable, Throwable throwable1)
	{
		if(throwable == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
		{
			return throwable1;
	//    2    4:aload_1         
	//    3    5:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    6:new             #91  <Class StringBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #92  <Method void StringBuilder()>
	//    7   13:astore_2        
			stringbuilder.append("Suppressed while handling ");
	//    8   14:aload_2         
	//    9   15:ldc1            #94  <String "Suppressed while handling ">
	//   10   17:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
			stringbuilder.append(((Object) (throwable)));
	//   12   21:aload_2         
	//   13   22:aload_0         
	//   14   23:invokevirtual   #101 <Method StringBuilder StringBuilder.append(Object)>
	//   15   26:pop             
			LogUtil.i("FramingSocket", new Object[] {
				throwable1, stringbuilder.toString()
			});
	//   16   27:ldc1            #32  <String "FramingSocket">
	//   17   29:iconst_2        
	//   18   30:anewarray       Object[]
	//   19   33:dup             
	//   20   34:iconst_0        
	//   21   35:aload_1         
	//   22   36:aastore         
	//   23   37:dup             
	//   24   38:iconst_1        
	//   25   39:aload_2         
	//   26   40:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   27   43:aastore         
	//   28   44:invokestatic    #111 <Method void LogUtil.i(String, Object[])>
			return throwable;
	//   29   47:aload_0         
	//   30   48:areturn         
		}
	}

	public PrintStream getStderr()
	{
		return mStderr;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field PrintStream mStderr>
	//    2    4:areturn         
	}

	public InputStream getStdin()
	{
		return mStdin;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field InputStream mStdin>
	//    2    4:areturn         
	}

	public PrintStream getStdout()
	{
		return mStdout;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field PrintStream mStdout>
	//    2    4:areturn         
	}

	public byte readFrameType()
		throws IOException
	{
		return mInput.readByte();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field DataInputStream mInput>
	//    2    4:invokevirtual   #124 <Method byte DataInputStream.readByte()>
	//    3    7:ireturn         
	}

	public int readInt()
		throws IOException
	{
		return mInput.readInt();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field DataInputStream mInput>
	//    2    4:invokevirtual   #128 <Method int DataInputStream.readInt()>
	//    3    7:ireturn         
	}

	public String readString()
		throws IOException
	{
		byte abyte0[] = new byte[mInput.readUnsignedShort()];
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field DataInputStream mInput>
	//    2    4:invokevirtual   #132 <Method int DataInputStream.readUnsignedShort()>
	//    3    7:newarray        byte[]
	//    4    9:astore_1        
		mInput.readFully(abyte0);
	//    5   10:aload_0         
	//    6   11:getfield        #55  <Field DataInputStream mInput>
	//    7   14:aload_1         
	//    8   15:invokevirtual   #136 <Method void DataInputStream.readFully(byte[])>
		return new String(abyte0, Charset.forName("UTF-8"));
	//    9   18:new             #138 <Class String>
	//   10   21:dup             
	//   11   22:aload_1         
	//   12   23:ldc1            #140 <String "UTF-8">
	//   13   25:invokestatic    #146 <Method Charset Charset.forName(String)>
	//   14   28:invokespecial   #149 <Method void String(byte[], Charset)>
	//   15   31:areturn         
	}

	public void writeBlob(byte abyte0[], int i, int j)
		throws IOException
	{
		mMultiplexedOutputStream.write(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DataOutputStream mMultiplexedOutputStream>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #154 <Method void DataOutputStream.write(byte[], int, int)>
	//    6   10:return          
	}

	public void writeExitCode(int i)
		throws IOException
	{
		mStdout.flush();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field PrintStream mStdout>
	//    2    4:invokevirtual   #159 <Method void PrintStream.flush()>
		mStderr.flush();
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field PrintStream mStderr>
	//    5   11:invokevirtual   #159 <Method void PrintStream.flush()>
		writeIntFrame((byte)120, i);
	//    6   14:aload_0         
	//    7   15:bipush          120
	//    8   17:iload_1         
	//    9   18:invokevirtual   #163 <Method void writeIntFrame(byte, int)>
	//   10   21:return          
	}

	public void writeIntFrame(byte byte0, int i)
		throws IOException
	{
		mMultiplexedOutputStream.write(((int) (byte0)));
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DataOutputStream mMultiplexedOutputStream>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #165 <Method void DataOutputStream.write(int)>
		mMultiplexedOutputStream.writeInt(i);
	//    4    8:aload_0         
	//    5    9:getfield        #62  <Field DataOutputStream mMultiplexedOutputStream>
	//    6   12:iload_2         
	//    7   13:invokevirtual   #168 <Method void DataOutputStream.writeInt(int)>
	//    8   16:return          
	}

	public static final byte ENTER_FRAME_PREFIX = 33;
	public static final byte EXIT_FRAME_PREFIX = 120;
	public static final byte STDERR_FRAME_PREFIX = 50;
	public static final byte STDIN_FRAME_PREFIX = 45;
	public static final byte STDIN_REQUEST_FRAME_PREFIX = 95;
	public static final byte STDOUT_FRAME_PREFIX = 49;
	private static final String TAG = "FramingSocket";
	private final DataInputStream mInput;
	private final DataOutputStream mMultiplexedOutputStream;
	private final PrintStream mStderr = new PrintStream(((OutputStream) (new FramingOutputStream((byte)50))));
	private final InputStream mStdin = new FramingInputStream();
	private final PrintStream mStdout = new PrintStream(((OutputStream) (new BufferedOutputStream(((OutputStream) (new FramingOutputStream((byte)49)))))));


/*
	static DataInputStream access$200(Framer framer)
	{
		return framer.mInput;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field DataInputStream mInput>
	//    2    4:areturn         
	}

*/


/*
	static DataOutputStream access$300(Framer framer)
	{
		return framer.mMultiplexedOutputStream;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DataOutputStream mMultiplexedOutputStream>
	//    2    4:areturn         
	}

*/
}
