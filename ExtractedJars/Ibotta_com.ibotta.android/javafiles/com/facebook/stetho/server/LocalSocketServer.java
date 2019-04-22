// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.Util;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.BindException;
import java.net.SocketException;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.facebook.stetho.server:
//			SocketHandler

public class LocalSocketServer
{
	private static class WorkerThread extends Thread
	{

		public void run()
		{
			mSocketHandler.onAccepted(mSocket);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field SocketHandler mSocketHandler>
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field LocalSocket mSocket>
		//    4    8:invokeinterface #30  <Method void SocketHandler.onAccepted(LocalSocket)>
_L1:
			Object obj;
			try
			{
				mSocket.close();
		//    5   13:aload_0         
		//    6   14:getfield        #18  <Field LocalSocket mSocket>
		//    7   17:invokevirtual   #35  <Method void LocalSocket.close()>
				return;
		//    8   20:return          
			}
		//*   9   21:astore_1        
		//*  10   22:goto            42
		//*  11   25:astore_1        
		//*  12   26:ldc1            #37  <String "I/O error: %s">
		//*  13   28:iconst_1        
		//*  14   29:anewarray       Object[]
		//*  15   32:dup             
		//*  16   33:iconst_0        
		//*  17   34:aload_1         
		//*  18   35:aastore         
		//*  19   36:invokestatic    #45  <Method void LogUtil.w(String, Object[])>
		//*  20   39:goto            13
		//*  21   42:aload_0         
		//*  22   43:getfield        #18  <Field LocalSocket mSocket>
		//*  23   46:invokevirtual   #35  <Method void LocalSocket.close()>
		//*  24   49:aload_1         
		//*  25   50:athrow          
			catch(IOException ioexception)
		//*  26   51:astore_1        
			{
				return;
		//   27   52:return          
			}
			obj;
			break MISSING_BLOCK_LABEL_42;
			obj;
			LogUtil.w("I/O error: %s", new Object[] {
				obj
			});
			  goto _L1
			try
			{
				mSocket.close();
			}
			catch(IOException ioexception1) { }
		//   28   53:astore_2        
			throw obj;
		//*  29   54:goto            49
		}

		private final LocalSocket mSocket;
		private final SocketHandler mSocketHandler;

		public WorkerThread(LocalSocket localsocket, SocketHandler sockethandler)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Thread()>
			mSocket = localsocket;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field LocalSocket mSocket>
			mSocketHandler = sockethandler;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field SocketHandler mSocketHandler>
		//    8   14:return          
		}
	}


	public LocalSocketServer(String s, String s1, SocketHandler sockethandler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #35  <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void AtomicInteger()>
	//    6   12:putfield        #38  <Field AtomicInteger mThreadId>
		mFriendlyName = (String)Util.throwIfNull(((Object) (s)));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokestatic    #44  <Method Object Util.throwIfNull(Object)>
	//   10   20:checkcast       #46  <Class String>
	//   11   23:putfield        #48  <Field String mFriendlyName>
		mAddress = (String)Util.throwIfNull(((Object) (s1)));
	//   12   26:aload_0         
	//   13   27:aload_2         
	//   14   28:invokestatic    #44  <Method Object Util.throwIfNull(Object)>
	//   15   31:checkcast       #46  <Class String>
	//   16   34:putfield        #50  <Field String mAddress>
		mSocketHandler = sockethandler;
	//   17   37:aload_0         
	//   18   38:aload_3         
	//   19   39:putfield        #52  <Field SocketHandler mSocketHandler>
	//   20   42:return          
	}

	private static LocalServerSocket bindToSocket(String s)
		throws IOException
	{
		int i;
		BindException bindexception;
		i = 2;
	//    0    0:iconst_2        
	//    1    1:istore_1        
		bindexception = null;
	//    2    2:aconst_null     
	//    3    3:astore_2        
_L2:
		LocalServerSocket localserversocket;
		if(LogUtil.isLoggable(3))
	//*   4    4:iconst_3        
	//*   5    5:invokestatic    #66  <Method boolean LogUtil.isLoggable(int)>
	//*   6    8:ifeq            39
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #68  <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #69  <Method void StringBuilder()>
	//   10   18:astore_3        
			stringbuilder.append("Trying to bind to @");
	//   11   19:aload_3         
	//   12   20:ldc1            #71  <String "Trying to bind to @">
	//   13   22:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
			stringbuilder.append(s);
	//   15   26:aload_3         
	//   16   27:aload_0         
	//   17   28:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   18   31:pop             
			LogUtil.d(stringbuilder.toString());
	//   19   32:aload_3         
	//   20   33:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   21   36:invokestatic    #83  <Method void LogUtil.d(String)>
		}
		localserversocket = new LocalServerSocket(s);
	//   22   39:new             #85  <Class LocalServerSocket>
	//   23   42:dup             
	//   24   43:aload_0         
	//   25   44:invokespecial   #87  <Method void LocalServerSocket(String)>
	//   26   47:astore_3        
		return localserversocket;
	//   27   48:aload_3         
	//   28   49:areturn         
		BindException bindexception2;
		bindexception2;
	//   29   50:astore          4
		LogUtil.w(((Throwable) (bindexception2)), "Binding error, sleep 1000 ms...");
	//   30   52:aload           4
	//   31   54:ldc1            #89  <String "Binding error, sleep 1000 ms...">
	//   32   56:invokestatic    #93  <Method void LogUtil.w(Throwable, String)>
		BindException bindexception1 = bindexception;
	//   33   59:aload_2         
	//   34   60:astore_3        
		if(bindexception == null)
	//*  35   61:aload_2         
	//*  36   62:ifnonnull       68
			bindexception1 = bindexception2;
	//   37   65:aload           4
	//   38   67:astore_3        
		Util.sleepUninterruptibly(1000L);
	//   39   68:ldc2w           #94  <Long 1000L>
	//   40   71:invokestatic    #99  <Method void Util.sleepUninterruptibly(long)>
		if(i > 0)
	//*  41   74:iload_1         
	//*  42   75:ifle            87
		{
			i--;
	//   43   78:iload_1         
	//   44   79:iconst_1        
	//   45   80:isub            
	//   46   81:istore_1        
			bindexception = bindexception1;
	//   47   82:aload_3         
	//   48   83:astore_2        
		} else
	//*  49   84:goto            4
		{
			throw bindexception1;
	//   50   87:aload_3         
	//   51   88:athrow          
		}
		if(true) goto _L2; else goto _L1
_L1:
	}

	private void listenOnAddress(String s)
		throws IOException
	{
		mServerSocket = bindToSocket(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #108 <Method LocalServerSocket bindToSocket(String)>
	//    3    5:putfield        #110 <Field LocalServerSocket mServerSocket>
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #68  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #69  <Method void StringBuilder()>
	//    7   15:astore_2        
		stringbuilder.append("Listening on @");
	//    8   16:aload_2         
	//    9   17:ldc1            #112 <String "Listening on @">
	//   10   19:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append(s);
	//   12   23:aload_2         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
		LogUtil.i(stringbuilder.toString());
	//   16   29:aload_2         
	//   17   30:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   18   33:invokestatic    #115 <Method void LogUtil.i(String)>
_L2:
		if(Thread.interrupted())
			break; /* Loop/switch isn't completed */
	//   19   36:invokestatic    #121 <Method boolean Thread.interrupted()>
	//   20   39:ifne            153
		WorkerThread workerthread = new WorkerThread(mServerSocket.accept(), mSocketHandler);
	//   21   42:new             #6   <Class LocalSocketServer$WorkerThread>
	//   22   45:dup             
	//   23   46:aload_0         
	//   24   47:getfield        #110 <Field LocalServerSocket mServerSocket>
	//   25   50:invokevirtual   #125 <Method LocalSocket LocalServerSocket.accept()>
	//   26   53:aload_0         
	//   27   54:getfield        #52  <Field SocketHandler mSocketHandler>
	//   28   57:invokespecial   #128 <Method void LocalSocketServer$WorkerThread(LocalSocket, SocketHandler)>
	//   29   60:astore_2        
		StringBuilder stringbuilder2 = new StringBuilder();
	//   30   61:new             #68  <Class StringBuilder>
	//   31   64:dup             
	//   32   65:invokespecial   #69  <Method void StringBuilder()>
	//   33   68:astore_3        
		stringbuilder2.append("StethoWorker-");
	//   34   69:aload_3         
	//   35   70:ldc1            #130 <String "StethoWorker-">
	//   36   72:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   37   75:pop             
		stringbuilder2.append(mFriendlyName);
	//   38   76:aload_3         
	//   39   77:aload_0         
	//   40   78:getfield        #48  <Field String mFriendlyName>
	//   41   81:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   42   84:pop             
		stringbuilder2.append("-");
	//   43   85:aload_3         
	//   44   86:ldc1            #132 <String "-">
	//   45   88:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   46   91:pop             
		stringbuilder2.append(mThreadId.incrementAndGet());
	//   47   92:aload_3         
	//   48   93:aload_0         
	//   49   94:getfield        #38  <Field AtomicInteger mThreadId>
	//   50   97:invokevirtual   #136 <Method int AtomicInteger.incrementAndGet()>
	//   51  100:invokevirtual   #139 <Method StringBuilder StringBuilder.append(int)>
	//   52  103:pop             
		((Thread) (workerthread)).setName(stringbuilder2.toString());
	//   53  104:aload_2         
	//   54  105:aload_3         
	//   55  106:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   56  109:invokevirtual   #142 <Method void Thread.setName(String)>
		((Thread) (workerthread)).setDaemon(true);
	//   57  112:aload_2         
	//   58  113:iconst_1        
	//   59  114:invokevirtual   #146 <Method void Thread.setDaemon(boolean)>
		((Thread) (workerthread)).start();
	//   60  117:aload_2         
	//   61  118:invokevirtual   #149 <Method void Thread.start()>
		continue; /* Loop/switch isn't completed */
	//   62  121:goto            36
		Object obj;
		obj;
	//   63  124:astore_2        
		LogUtil.w(((Throwable) (obj)), "I/O error initialising connection thread");
	//   64  125:aload_2         
	//   65  126:ldc1            #151 <String "I/O error initialising connection thread">
	//   66  128:invokestatic    #93  <Method void LogUtil.w(Throwable, String)>
		break; /* Loop/switch isn't completed */
	//   67  131:goto            153
		obj;
	//   68  134:astore_2        
		if(Thread.interrupted())
	//*  69  135:invokestatic    #121 <Method boolean Thread.interrupted()>
	//*  70  138:ifeq            144
			break; /* Loop/switch isn't completed */
	//   71  141:goto            153
		LogUtil.w(((Throwable) (obj)), "I/O error");
	//   72  144:aload_2         
	//   73  145:ldc1            #153 <String "I/O error">
	//   74  147:invokestatic    #93  <Method void LogUtil.w(Throwable, String)>
		if(true) goto _L2; else goto _L1
	//   75  150:goto            36
_L1:
		StringBuilder stringbuilder1 = new StringBuilder();
	//   76  153:new             #68  <Class StringBuilder>
	//   77  156:dup             
	//   78  157:invokespecial   #69  <Method void StringBuilder()>
	//   79  160:astore_2        
		stringbuilder1.append("Server shutdown on @");
	//   80  161:aload_2         
	//   81  162:ldc1            #155 <String "Server shutdown on @">
	//   82  164:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   83  167:pop             
		stringbuilder1.append(s);
	//   84  168:aload_2         
	//   85  169:aload_1         
	//   86  170:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   87  173:pop             
		LogUtil.i(stringbuilder1.toString());
	//   88  174:aload_2         
	//   89  175:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   90  178:invokestatic    #115 <Method void LogUtil.i(String)>
		return;
	//   91  181:return          
		stringbuilder1;
	//   92  182:astore_2        
		if(true) goto _L1; else goto _L3
_L3:
	//*  93  183:goto            153
	}

	public String getName()
	{
		return mFriendlyName;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String mFriendlyName>
	//    2    4:areturn         
	}

	public void run()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!mStopped)
			break MISSING_BLOCK_LABEL_12;
	//    2    2:aload_0         
	//    3    3:getfield        #159 <Field boolean mStopped>
	//    4    6:ifeq            12
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		mListenerThread = Thread.currentThread();
	//    8   12:aload_0         
	//    9   13:invokestatic    #163 <Method Thread Thread.currentThread()>
	//   10   16:putfield        #165 <Field Thread mListenerThread>
		this;
	//   11   19:aload_0         
		JVM INSTR monitorexit ;
	//   12   20:monitorexit     
		listenOnAddress(mAddress);
	//   13   21:aload_0         
	//   14   22:aload_0         
	//   15   23:getfield        #50  <Field String mAddress>
	//   16   26:invokespecial   #167 <Method void listenOnAddress(String)>
		return;
	//   17   29:return          
		Exception exception;
		exception;
	//   18   30:astore_1        
		this;
	//   19   31:aload_0         
		JVM INSTR monitorexit ;
	//   20   32:monitorexit     
		throw exception;
	//   21   33:aload_1         
	//   22   34:athrow          
	}

	public void stop()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mStopped = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #159 <Field boolean mStopped>
		if(mListenerThread != null)
			break MISSING_BLOCK_LABEL_17;
	//    5    7:aload_0         
	//    6    8:getfield        #165 <Field Thread mListenerThread>
	//    7   11:ifnonnull       17
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		this;
	//   11   17:aload_0         
		JVM INSTR monitorexit ;
	//   12   18:monitorexit     
		mListenerThread.interrupt();
	//   13   19:aload_0         
	//   14   20:getfield        #165 <Field Thread mListenerThread>
	//   15   23:invokevirtual   #171 <Method void Thread.interrupt()>
		Exception exception;
		try
		{
			if(mServerSocket != null)
	//*  16   26:aload_0         
	//*  17   27:getfield        #110 <Field LocalServerSocket mServerSocket>
	//*  18   30:ifnull          40
				mServerSocket.close();
	//   19   33:aload_0         
	//   20   34:getfield        #110 <Field LocalServerSocket mServerSocket>
	//   21   37:invokevirtual   #174 <Method void LocalServerSocket.close()>
			return;
	//   22   40:return          
		}
	//*  23   41:astore_1        
	//*  24   42:aload_0         
	//*  25   43:monitorexit     
	//*  26   44:aload_1         
	//*  27   45:athrow          
		catch(IOException ioexception)
	//*  28   46:astore_1        
		{
			return;
	//   29   47:return          
		}
		exception;
		this;
		JVM INSTR monitorexit ;
		throw exception;
	}

	private static final int MAX_BIND_RETRIES = 2;
	private static final int TIME_BETWEEN_BIND_RETRIES_MS = 1000;
	private static final String WORKER_THREAD_NAME_PREFIX = "StethoWorker";
	private final String mAddress;
	private final String mFriendlyName;
	private Thread mListenerThread;
	private LocalServerSocket mServerSocket;
	private final SocketHandler mSocketHandler;
	private boolean mStopped;
	private final AtomicInteger mThreadId = new AtomicInteger();
}
