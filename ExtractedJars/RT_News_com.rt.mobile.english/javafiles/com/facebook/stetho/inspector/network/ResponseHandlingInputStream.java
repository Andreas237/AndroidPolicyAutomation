// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import com.facebook.stetho.inspector.console.CLog;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import java.io.*;

// Referenced classes of package com.facebook.stetho.inspector.network:
//			ResponseHandler, CountingOutputStream

public final class ResponseHandlingInputStream extends FilterInputStream
{

	public ResponseHandlingInputStream(InputStream inputstream, String s, OutputStream outputstream, CountingOutputStream countingoutputstream, ChromePeerManager chromepeermanager, ResponseHandler responsehandler)
	{
		super(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method void FilterInputStream(InputStream)>
		mLastDecompressedCount = 0L;
	//    3    5:aload_0         
	//    4    6:lconst_0        
	//    5    7:putfield        #38  <Field long mLastDecompressedCount>
		mRequestId = s;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #40  <Field String mRequestId>
		mOutputStream = outputstream;
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:putfield        #42  <Field OutputStream mOutputStream>
		mDecompressedCounter = countingoutputstream;
	//   12   20:aload_0         
	//   13   21:aload           4
	//   14   23:putfield        #44  <Field CountingOutputStream mDecompressedCounter>
		mNetworkPeerManager = chromepeermanager;
	//   15   26:aload_0         
	//   16   27:aload           5
	//   17   29:putfield        #46  <Field ChromePeerManager mNetworkPeerManager>
		mResponseHandler = responsehandler;
	//   18   32:aload_0         
	//   19   33:aload           6
	//   20   35:putfield        #48  <Field ResponseHandler mResponseHandler>
		mClosed = false;
	//   21   38:aload_0         
	//   22   39:iconst_0        
	//   23   40:putfield        #50  <Field boolean mClosed>
	//   24   43:return          
	}

	private int checkEOF(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(i != -1)
			break MISSING_BLOCK_LABEL_33;
	//    2    2:iload_1         
	//    3    3:iconst_m1       
	//    4    4:icmpne          33
		closeOutputStreamQuietly();
	//    5    7:aload_0         
	//    6    8:invokespecial   #58  <Method void closeOutputStreamQuietly()>
		mResponseHandler.onEOF();
	//    7   11:aload_0         
	//    8   12:getfield        #48  <Field ResponseHandler mResponseHandler>
	//    9   15:invokeinterface #63  <Method void ResponseHandler.onEOF()>
		mEofSeen = true;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #65  <Field boolean mEofSeen>
		break MISSING_BLOCK_LABEL_33;
	//   13   25:goto            33
		Exception exception;
		exception;
	//   14   28:astore_2        
	//*  15   29:aload_0         
		throw exception;
	//   16   30:monitorexit     
	//   17   31:aload_2         
	//   18   32:athrow          
		this;
	//   19   33:aload_0         
		JVM INSTR monitorexit ;
	//   20   34:monitorexit     
		return i;
	//   21   35:iload_1         
	//   22   36:ireturn         
	}

	private void closeOutputStreamQuietly()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = mClosed;
	//    2    2:aload_0         
	//    3    3:getfield        #50  <Field boolean mClosed>
	//    4    6:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_97;
	//    5    7:iload_1         
	//    6    8:ifne            97
		mOutputStream.close();
	//    7   11:aload_0         
	//    8   12:getfield        #42  <Field OutputStream mOutputStream>
	//    9   15:invokevirtual   #72  <Method void OutputStream.close()>
		reportDecodedSizeIfApplicable();
	//   10   18:aload_0         
	//   11   19:invokespecial   #75  <Method void reportDecodedSizeIfApplicable()>
_L1:
		mClosed = true;
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:putfield        #50  <Field boolean mClosed>
		break MISSING_BLOCK_LABEL_97;
	//   15   27:goto            97
		Object obj;
		obj;
	//   16   30:astore_2        
		break MISSING_BLOCK_LABEL_90;
	//   17   31:goto            90
		obj;
	//   18   34:astore_2        
		ChromePeerManager chromepeermanager = mNetworkPeerManager;
	//   19   35:aload_0         
	//   20   36:getfield        #46  <Field ChromePeerManager mNetworkPeerManager>
	//   21   39:astore_3        
		com.facebook.stetho.inspector.protocol.module.Console.MessageLevel messagelevel = com.facebook.stetho.inspector.protocol.module.Console.MessageLevel.ERROR;
	//   22   40:getstatic       #81  <Field com.facebook.stetho.inspector.protocol.module.Console$MessageLevel com.facebook.stetho.inspector.protocol.module.Console$MessageLevel.ERROR>
	//   23   43:astore          4
		com.facebook.stetho.inspector.protocol.module.Console.MessageSource messagesource = com.facebook.stetho.inspector.protocol.module.Console.MessageSource.NETWORK;
	//   24   45:getstatic       #87  <Field com.facebook.stetho.inspector.protocol.module.Console$MessageSource com.facebook.stetho.inspector.protocol.module.Console$MessageSource.NETWORK>
	//   25   48:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//   26   50:new             #89  <Class StringBuilder>
	//   27   53:dup             
	//   28   54:invokespecial   #91  <Method void StringBuilder()>
	//   29   57:astore          6
		stringbuilder.append("Could not close the output stream");
	//   30   59:aload           6
	//   31   61:ldc1            #93  <String "Could not close the output stream">
	//   32   63:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   33   66:pop             
		stringbuilder.append(obj);
	//   34   67:aload           6
	//   35   69:aload_2         
	//   36   70:invokevirtual   #100 <Method StringBuilder StringBuilder.append(Object)>
	//   37   73:pop             
		CLog.writeToConsole(chromepeermanager, messagelevel, messagesource, stringbuilder.toString());
	//   38   74:aload_3         
	//   39   75:aload           4
	//   40   77:aload           5
	//   41   79:aload           6
	//   42   81:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   43   84:invokestatic    #110 <Method void CLog.writeToConsole(ChromePeerManager, com.facebook.stetho.inspector.protocol.module.Console$MessageLevel, com.facebook.stetho.inspector.protocol.module.Console$MessageSource, String)>
		  goto _L1
	//*  44   87:goto            22
		mClosed = true;
	//   45   90:aload_0         
	//   46   91:iconst_1        
	//   47   92:putfield        #50  <Field boolean mClosed>
		throw obj;
	//   48   95:aload_2         
	//   49   96:athrow          
		this;
	//   50   97:aload_0         
		JVM INSTR monitorexit ;
	//   51   98:monitorexit     
		return;
	//   52   99:return          
		obj;
	//   53  100:astore_2        
	//*  54  101:aload_0         
		throw obj;
	//   55  102:monitorexit     
	//   56  103:aload_2         
	//   57  104:athrow          
	}

	private byte[] getSkipBufferLocked()
	{
		if(mSkipBuffer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field byte[] mSkipBuffer>
	//*   2    4:ifnonnull       16
			mSkipBuffer = new byte[1024];
	//    3    7:aload_0         
	//    4    8:sipush          1024
	//    5   11:newarray        byte[]
	//    6   13:putfield        #115 <Field byte[] mSkipBuffer>
		return mSkipBuffer;
	//    7   16:aload_0         
	//    8   17:getfield        #115 <Field byte[] mSkipBuffer>
	//    9   20:areturn         
	}

	private IOException handleIOException(IOException ioexception)
	{
		mResponseHandler.onError(ioexception);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field ResponseHandler mResponseHandler>
	//    2    4:aload_1         
	//    3    5:invokeinterface #122 <Method void ResponseHandler.onError(IOException)>
		return ioexception;
	//    4   10:aload_1         
	//    5   11:areturn         
	}

	private void handleIOExceptionWritingToStream(IOException ioexception)
	{
		ChromePeerManager chromepeermanager = mNetworkPeerManager;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field ChromePeerManager mNetworkPeerManager>
	//    2    4:astore_2        
		com.facebook.stetho.inspector.protocol.module.Console.MessageLevel messagelevel = com.facebook.stetho.inspector.protocol.module.Console.MessageLevel.ERROR;
	//    3    5:getstatic       #81  <Field com.facebook.stetho.inspector.protocol.module.Console$MessageLevel com.facebook.stetho.inspector.protocol.module.Console$MessageLevel.ERROR>
	//    4    8:astore_3        
		com.facebook.stetho.inspector.protocol.module.Console.MessageSource messagesource = com.facebook.stetho.inspector.protocol.module.Console.MessageSource.NETWORK;
	//    5    9:getstatic       #87  <Field com.facebook.stetho.inspector.protocol.module.Console$MessageSource com.facebook.stetho.inspector.protocol.module.Console$MessageSource.NETWORK>
	//    6   12:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    7   14:new             #89  <Class StringBuilder>
	//    8   17:dup             
	//    9   18:invokespecial   #91  <Method void StringBuilder()>
	//   10   21:astore          5
		stringbuilder.append("Could not write response body to the stream ");
	//   11   23:aload           5
	//   12   25:ldc1            #125 <String "Could not write response body to the stream ">
	//   13   27:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		stringbuilder.append(((Object) (ioexception)));
	//   15   31:aload           5
	//   16   33:aload_1         
	//   17   34:invokevirtual   #100 <Method StringBuilder StringBuilder.append(Object)>
	//   18   37:pop             
		CLog.writeToConsole(chromepeermanager, messagelevel, messagesource, stringbuilder.toString());
	//   19   38:aload_2         
	//   20   39:aload_3         
	//   21   40:aload           4
	//   22   42:aload           5
	//   23   44:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   24   47:invokestatic    #110 <Method void CLog.writeToConsole(ChromePeerManager, com.facebook.stetho.inspector.protocol.module.Console$MessageLevel, com.facebook.stetho.inspector.protocol.module.Console$MessageSource, String)>
		closeOutputStreamQuietly();
	//   25   50:aload_0         
	//   26   51:invokespecial   #58  <Method void closeOutputStreamQuietly()>
	//   27   54:return          
	}

	private void reportDecodedSizeIfApplicable()
	{
		if(mDecompressedCounter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field CountingOutputStream mDecompressedCounter>
	//*   2    4:ifnull          38
		{
			long l = mDecompressedCounter.getCount();
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field CountingOutputStream mDecompressedCounter>
	//    5   11:invokevirtual   #131 <Method long CountingOutputStream.getCount()>
	//    6   14:lstore_2        
			int i = (int)(l - mLastDecompressedCount);
	//    7   15:lload_2         
	//    8   16:aload_0         
	//    9   17:getfield        #38  <Field long mLastDecompressedCount>
	//   10   20:lsub            
	//   11   21:l2i             
	//   12   22:istore_1        
			mResponseHandler.onReadDecoded(i);
	//   13   23:aload_0         
	//   14   24:getfield        #48  <Field ResponseHandler mResponseHandler>
	//   15   27:iload_1         
	//   16   28:invokeinterface #135 <Method void ResponseHandler.onReadDecoded(int)>
			mLastDecompressedCount = l;
	//   17   33:aload_0         
	//   18   34:lload_2         
	//   19   35:putfield        #38  <Field long mLastDecompressedCount>
		}
	//   20   38:return          
	}

	private void writeToOutputStream(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = mClosed;
	//    2    2:aload_0         
	//    3    3:getfield        #50  <Field boolean mClosed>
	//    4    6:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:iload_2         
	//    6    8:ifeq            14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		mOutputStream.write(i);
	//   10   14:aload_0         
	//   11   15:getfield        #42  <Field OutputStream mOutputStream>
	//   12   18:iload_1         
	//   13   19:invokevirtual   #139 <Method void OutputStream.write(int)>
		reportDecodedSizeIfApplicable();
	//   14   22:aload_0         
	//   15   23:invokespecial   #75  <Method void reportDecodedSizeIfApplicable()>
		break MISSING_BLOCK_LABEL_35;
	//   16   26:goto            35
		Object obj;
		obj;
	//   17   29:astore_3        
		handleIOExceptionWritingToStream(((IOException) (obj)));
	//   18   30:aload_0         
	//   19   31:aload_3         
	//   20   32:invokespecial   #141 <Method void handleIOExceptionWritingToStream(IOException)>
		this;
	//   21   35:aload_0         
		JVM INSTR monitorexit ;
	//   22   36:monitorexit     
		return;
	//   23   37:return          
		obj;
	//   24   38:astore_3        
	//*  25   39:aload_0         
		throw obj;
	//   26   40:monitorexit     
	//   27   41:aload_3         
	//   28   42:athrow          
	}

	private void writeToOutputStream(byte abyte0[], int i, int j)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = mClosed;
	//    2    2:aload_0         
	//    3    3:getfield        #50  <Field boolean mClosed>
	//    4    6:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_16;
	//    5    8:iload           4
	//    6   10:ifeq            16
		this;
	//    7   13:aload_0         
		JVM INSTR monitorexit ;
	//    8   14:monitorexit     
		return;
	//    9   15:return          
		try
		{
			mOutputStream.write(abyte0, i, j);
	//   10   16:aload_0         
	//   11   17:getfield        #42  <Field OutputStream mOutputStream>
	//   12   20:aload_1         
	//   13   21:iload_2         
	//   14   22:iload_3         
	//   15   23:invokevirtual   #144 <Method void OutputStream.write(byte[], int, int)>
			reportDecodedSizeIfApplicable();
	//   16   26:aload_0         
	//   17   27:invokespecial   #75  <Method void reportDecodedSizeIfApplicable()>
			break MISSING_BLOCK_LABEL_39;
	//   18   30:goto            39
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[]) { }
	//   19   33:astore_1        
		handleIOExceptionWritingToStream(((IOException) (abyte0)));
	//   20   34:aload_0         
	//   21   35:aload_1         
	//   22   36:invokespecial   #141 <Method void handleIOExceptionWritingToStream(IOException)>
		this;
	//   23   39:aload_0         
		JVM INSTR monitorexit ;
	//   24   40:monitorexit     
		return;
	//   25   41:return          
		abyte0;
	//   26   42:astore_1        
	//*  27   43:aload_0         
		throw abyte0;
	//   28   44:monitorexit     
	//   29   45:aload_1         
	//   30   46:athrow          
	}

	public void close()
		throws IOException
	{
		if(mEofSeen) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field boolean mEofSeen>
	//    2    4:ifne            152
_L1:
		byte abyte0[] = new byte[1024];
	//    3    7:sipush          1024
	//    4   10:newarray        byte[]
	//    5   12:astore          6
		long l = 0L;
	//    6   14:lconst_0        
	//    7   15:lstore_2        
_L4:
		int i = read(abyte0);
	//    8   16:aload_0         
	//    9   17:aload           6
	//   10   19:invokevirtual   #148 <Method int read(byte[])>
	//   11   22:istore_1        
		long l1;
		l1 = l;
	//   12   23:lload_2         
	//   13   24:lstore          4
		if(i == -1)
			break; /* Loop/switch isn't completed */
	//   14   26:iload_1         
	//   15   27:iconst_m1       
	//   16   28:icmpeq          39
		l += i;
	//   17   31:lload_2         
	//   18   32:iload_1         
	//   19   33:i2l             
	//   20   34:ladd            
	//   21   35:lstore_2        
		if(true) goto _L4; else goto _L3
	//   22   36:goto            16
_L3:
		if(l1 <= 0L)
			break MISSING_BLOCK_LABEL_130;
	//   23   39:lload           4
	//   24   41:lconst_0        
	//   25   42:lcmp            
	//   26   43:ifle            130
		ChromePeerManager chromepeermanager = mNetworkPeerManager;
	//   27   46:aload_0         
	//   28   47:getfield        #46  <Field ChromePeerManager mNetworkPeerManager>
	//   29   50:astore          6
		com.facebook.stetho.inspector.protocol.module.Console.MessageLevel messagelevel = com.facebook.stetho.inspector.protocol.module.Console.MessageLevel.ERROR;
	//   30   52:getstatic       #81  <Field com.facebook.stetho.inspector.protocol.module.Console$MessageLevel com.facebook.stetho.inspector.protocol.module.Console$MessageLevel.ERROR>
	//   31   55:astore          7
		com.facebook.stetho.inspector.protocol.module.Console.MessageSource messagesource = com.facebook.stetho.inspector.protocol.module.Console.MessageSource.NETWORK;
	//   32   57:getstatic       #87  <Field com.facebook.stetho.inspector.protocol.module.Console$MessageSource com.facebook.stetho.inspector.protocol.module.Console$MessageSource.NETWORK>
	//   33   60:astore          8
		StringBuilder stringbuilder = new StringBuilder();
	//   34   62:new             #89  <Class StringBuilder>
	//   35   65:dup             
	//   36   66:invokespecial   #91  <Method void StringBuilder()>
	//   37   69:astore          9
		stringbuilder.append("There were ");
	//   38   71:aload           9
	//   39   73:ldc1            #150 <String "There were ">
	//   40   75:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   41   78:pop             
		stringbuilder.append(String.valueOf(l1));
	//   42   79:aload           9
	//   43   81:lload           4
	//   44   83:invokestatic    #156 <Method String String.valueOf(long)>
	//   45   86:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   46   89:pop             
		stringbuilder.append(" bytes that were not consumed while ");
	//   47   90:aload           9
	//   48   92:ldc1            #158 <String " bytes that were not consumed while ">
	//   49   94:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   50   97:pop             
		stringbuilder.append("processing request ");
	//   51   98:aload           9
	//   52  100:ldc1            #160 <String "processing request ">
	//   53  102:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   54  105:pop             
		stringbuilder.append(mRequestId);
	//   55  106:aload           9
	//   56  108:aload_0         
	//   57  109:getfield        #40  <Field String mRequestId>
	//   58  112:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   59  115:pop             
		CLog.writeToConsole(chromepeermanager, messagelevel, messagesource, stringbuilder.toString());
	//   60  116:aload           6
	//   61  118:aload           7
	//   62  120:aload           8
	//   63  122:aload           9
	//   64  124:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   65  127:invokestatic    #110 <Method void CLog.writeToConsole(ChromePeerManager, com.facebook.stetho.inspector.protocol.module.Console$MessageLevel, com.facebook.stetho.inspector.protocol.module.Console$MessageSource, String)>
		super.close();
	//   66  130:aload_0         
	//   67  131:invokespecial   #161 <Method void FilterInputStream.close()>
		closeOutputStreamQuietly();
	//   68  134:aload_0         
	//   69  135:invokespecial   #58  <Method void closeOutputStreamQuietly()>
		return;
	//   70  138:return          
		Exception exception;
		exception;
	//   71  139:astore          6
		super.close();
	//   72  141:aload_0         
	//   73  142:invokespecial   #161 <Method void FilterInputStream.close()>
		closeOutputStreamQuietly();
	//   74  145:aload_0         
	//   75  146:invokespecial   #58  <Method void closeOutputStreamQuietly()>
		throw exception;
	//   76  149:aload           6
	//   77  151:athrow          
_L2:
		l1 = 0L;
	//   78  152:lconst_0        
	//   79  153:lstore          4
		if(true) goto _L3; else goto _L5
	//   80  155:goto            39
_L5:
	}

	public void mark(int i)
	{
	//    0    0:return          
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
		int i;
		try
		{
			i = checkEOF(in.read());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #170 <Field InputStream in>
	//    3    5:invokevirtual   #174 <Method int InputStream.read()>
	//    4    8:invokespecial   #176 <Method int checkEOF(int)>
	//    5   11:istore_1        
		}
	//*   6   12:iload_1         
	//*   7   13:iconst_m1       
	//*   8   14:icmpeq          32
	//*   9   17:aload_0         
	//*  10   18:getfield        #48  <Field ResponseHandler mResponseHandler>
	//*  11   21:iconst_1        
	//*  12   22:invokeinterface #179 <Method void ResponseHandler.onRead(int)>
	//*  13   27:aload_0         
	//*  14   28:iload_1         
	//*  15   29:invokespecial   #181 <Method void writeToOutputStream(int)>
	//*  16   32:iload_1         
	//*  17   33:ireturn         
		catch(IOException ioexception)
	//*  18   34:astore_2        
		{
			throw handleIOException(ioexception);
	//   19   35:aload_0         
	//   20   36:aload_2         
	//   21   37:invokespecial   #183 <Method IOException handleIOException(IOException)>
	//   22   40:athrow          
		}
		if(i == -1)
			break MISSING_BLOCK_LABEL_32;
		mResponseHandler.onRead(1);
		writeToOutputStream(i);
		return i;
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
	//    5    5:invokevirtual   #186 <Method int read(byte[], int, int)>
	//    6    8:ireturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		try
		{
			j = checkEOF(in.read(abyte0, i, j));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #170 <Field InputStream in>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokevirtual   #187 <Method int InputStream.read(byte[], int, int)>
	//    7   11:invokespecial   #176 <Method int checkEOF(int)>
	//    8   14:istore_3        
		}
	//*   9   15:iload_3         
	//*  10   16:iconst_m1       
	//*  11   17:icmpeq          37
	//*  12   20:aload_0         
	//*  13   21:getfield        #48  <Field ResponseHandler mResponseHandler>
	//*  14   24:iload_3         
	//*  15   25:invokeinterface #179 <Method void ResponseHandler.onRead(int)>
	//*  16   30:aload_0         
	//*  17   31:aload_1         
	//*  18   32:iload_2         
	//*  19   33:iload_3         
	//*  20   34:invokespecial   #189 <Method void writeToOutputStream(byte[], int, int)>
	//*  21   37:iload_3         
	//*  22   38:ireturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  23   39:astore_1        
		{
			throw handleIOException(((IOException) (abyte0)));
	//   24   40:aload_0         
	//   25   41:aload_1         
	//   26   42:invokespecial   #183 <Method IOException handleIOException(IOException)>
	//   27   45:athrow          
		}
		if(j == -1)
			break MISSING_BLOCK_LABEL_37;
		mResponseHandler.onRead(j);
		writeToOutputStream(abyte0, i, j);
		return j;
	}

	public void reset()
		throws IOException
	{
		throw new UnsupportedOperationException("Mark not supported");
	//    0    0:new             #192 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #194 <String "Mark not supported">
	//    3    6:invokespecial   #197 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public long skip(long l)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		byte abyte0[] = getSkipBufferLocked();
	//    2    2:aload_0         
	//    3    3:invokespecial   #201 <Method byte[] getSkipBufferLocked()>
	//    4    6:astore          6
		long l1 = 0L;
	//    5    8:lconst_0        
	//    6    9:lstore          4
_L2:
		if(l1 >= l)
			break; /* Loop/switch isn't completed */
	//    7   11:lload           4
	//    8   13:lload_1         
	//    9   14:lcmp            
	//   10   15:ifge            56
		int i = read(abyte0, 0, (int)Math.min(abyte0.length, l - l1));
	//   11   18:aload_0         
	//   12   19:aload           6
	//   13   21:iconst_0        
	//   14   22:aload           6
	//   15   24:arraylength     
	//   16   25:i2l             
	//   17   26:lload_1         
	//   18   27:lload           4
	//   19   29:lsub            
	//   20   30:invokestatic    #207 <Method long Math.min(long, long)>
	//   21   33:l2i             
	//   22   34:invokevirtual   #186 <Method int read(byte[], int, int)>
	//   23   37:istore_3        
		if(i == -1)
	//*  24   38:iload_3         
	//*  25   39:iconst_m1       
	//*  26   40:icmpne          46
			break; /* Loop/switch isn't completed */
	//   27   43:goto            56
		l1 += i;
	//   28   46:lload           4
	//   29   48:iload_3         
	//   30   49:i2l             
	//   31   50:ladd            
	//   32   51:lstore          4
		if(true) goto _L2; else goto _L1
	//   33   53:goto            11
	//*  34   56:aload_0         
_L1:
		return l1;
	//   35   57:monitorexit     
	//   36   58:lload           4
	//   37   60:lreturn         
		Exception exception;
		exception;
	//   38   61:astore          6
	//*  39   63:aload_0         
		throw exception;
	//   40   64:monitorexit     
	//   41   65:aload           6
	//   42   67:athrow          
	}

	private static final int BUFFER_SIZE = 1024;
	public static final String TAG = "ResponseHandlingInputStream";
	private boolean mClosed;
	private final CountingOutputStream mDecompressedCounter;
	private boolean mEofSeen;
	private long mLastDecompressedCount;
	private final ChromePeerManager mNetworkPeerManager;
	private final OutputStream mOutputStream;
	private final String mRequestId;
	private final ResponseHandler mResponseHandler;
	private byte mSkipBuffer[];
}
