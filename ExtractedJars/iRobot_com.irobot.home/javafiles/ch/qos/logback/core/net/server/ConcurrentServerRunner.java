// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.server;

import ch.qos.logback.core.spi.ContextAwareBase;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package ch.qos.logback.core.net.server:
//			ServerRunner, Client, ClientVisitor, ServerListener

public abstract class ConcurrentServerRunner extends ContextAwareBase
	implements ServerRunner, Runnable
{
	private class ClientWrapper
		implements Client
	{

		public void close()
		{
			_flddelegate.close();
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field Client _flddelegate>
		//    2    4:invokeinterface #29  <Method void Client.close()>
		//    3    9:return          
		}

		public void run()
		{
			addClient(_flddelegate);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ConcurrentServerRunner this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field Client _flddelegate>
		//    4    8:invokestatic    #33  <Method void ConcurrentServerRunner.access$000(ConcurrentServerRunner, Client)>
			_flddelegate.run();
		//    5   11:aload_0         
		//    6   12:getfield        #23  <Field Client _flddelegate>
		//    7   15:invokeinterface #35  <Method void Client.run()>
			removeClient(_flddelegate);
		//    8   20:aload_0         
		//    9   21:getfield        #18  <Field ConcurrentServerRunner this$0>
		//   10   24:aload_0         
		//   11   25:getfield        #23  <Field Client _flddelegate>
		//   12   28:invokestatic    #38  <Method void ConcurrentServerRunner.access$100(ConcurrentServerRunner, Client)>
			return;
		//   13   31:return          
			Exception exception;
			exception;
		//   14   32:astore_1        
			removeClient(_flddelegate);
		//   15   33:aload_0         
		//   16   34:getfield        #18  <Field ConcurrentServerRunner this$0>
		//   17   37:aload_0         
		//   18   38:getfield        #23  <Field Client _flddelegate>
		//   19   41:invokestatic    #38  <Method void ConcurrentServerRunner.access$100(ConcurrentServerRunner, Client)>
			throw exception;
		//   20   44:aload_1         
		//   21   45:athrow          
		}

		private final Client _flddelegate;
		final ConcurrentServerRunner this$0;

		public ClientWrapper(Client client)
		{
			this$0 = ConcurrentServerRunner.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field ConcurrentServerRunner this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
			_flddelegate = client;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field Client _flddelegate>
		//    8   14:return          
		}
	}


	public ConcurrentServerRunner(ServerListener serverlistener, Executor executor1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void ContextAwareBase()>
	//    2    4:aload_0         
	//    3    5:new             #33  <Class ReentrantLock>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void ReentrantLock()>
	//    6   12:putfield        #36  <Field Lock clientsLock>
	//    7   15:aload_0         
	//    8   16:new             #38  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #39  <Method void ArrayList()>
	//   11   23:putfield        #41  <Field Collection clients>
		listener = serverlistener;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #43  <Field ServerListener listener>
		executor = executor1;
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:putfield        #45  <Field Executor executor>
	//   18   36:return          
	}

	private void addClient(Client client)
	{
		clientsLock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Lock clientsLock>
	//    2    4:invokeinterface #63  <Method void Lock.lock()>
		clients.add(((Object) (client)));
	//    3    9:aload_0         
	//    4   10:getfield        #41  <Field Collection clients>
	//    5   13:aload_1         
	//    6   14:invokeinterface #69  <Method boolean Collection.add(Object)>
	//    7   19:pop             
		clientsLock.unlock();
	//    8   20:aload_0         
	//    9   21:getfield        #36  <Field Lock clientsLock>
	//   10   24:invokeinterface #72  <Method void Lock.unlock()>
		return;
	//   11   29:return          
		client;
	//   12   30:astore_1        
		clientsLock.unlock();
	//   13   31:aload_0         
	//   14   32:getfield        #36  <Field Lock clientsLock>
	//   15   35:invokeinterface #72  <Method void Lock.unlock()>
		throw client;
	//   16   40:aload_1         
	//   17   41:athrow          
	}

	private Collection copyClients()
	{
		clientsLock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Lock clientsLock>
	//    2    4:invokeinterface #63  <Method void Lock.lock()>
		ArrayList arraylist = new ArrayList(clients);
	//    3    9:new             #38  <Class ArrayList>
	//    4   12:dup             
	//    5   13:aload_0         
	//    6   14:getfield        #41  <Field Collection clients>
	//    7   17:invokespecial   #78  <Method void ArrayList(Collection)>
	//    8   20:astore_1        
		clientsLock.unlock();
	//    9   21:aload_0         
	//   10   22:getfield        #36  <Field Lock clientsLock>
	//   11   25:invokeinterface #72  <Method void Lock.unlock()>
		return ((Collection) (arraylist));
	//   12   30:aload_1         
	//   13   31:areturn         
		Exception exception;
		exception;
	//   14   32:astore_1        
		clientsLock.unlock();
	//   15   33:aload_0         
	//   16   34:getfield        #36  <Field Lock clientsLock>
	//   17   37:invokeinterface #72  <Method void Lock.unlock()>
		throw exception;
	//   18   42:aload_1         
	//   19   43:athrow          
	}

	private void removeClient(Client client)
	{
		clientsLock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Lock clientsLock>
	//    2    4:invokeinterface #63  <Method void Lock.lock()>
		clients.remove(((Object) (client)));
	//    3    9:aload_0         
	//    4   10:getfield        #41  <Field Collection clients>
	//    5   13:aload_1         
	//    6   14:invokeinterface #82  <Method boolean Collection.remove(Object)>
	//    7   19:pop             
		clientsLock.unlock();
	//    8   20:aload_0         
	//    9   21:getfield        #36  <Field Lock clientsLock>
	//   10   24:invokeinterface #72  <Method void Lock.unlock()>
		return;
	//   11   29:return          
		client;
	//   12   30:astore_1        
		clientsLock.unlock();
	//   13   31:aload_0         
	//   14   32:getfield        #36  <Field Lock clientsLock>
	//   15   35:invokeinterface #72  <Method void Lock.unlock()>
		throw client;
	//   16   40:aload_1         
	//   17   41:athrow          
	}

	public void accept(ClientVisitor clientvisitor)
	{
		for(Iterator iterator = copyClients().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #88  <Method Collection copyClients()>
	//*   2    4:invokeinterface #92  <Method Iterator Collection.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #98  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            85
		{
			Client client = (Client)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #102 <Method Object Iterator.next()>
	//    9   25:checkcast       #104 <Class Client>
	//   10   28:astore_3        
			try
			{
				clientvisitor.visit(client);
	//   11   29:aload_1         
	//   12   30:aload_3         
	//   13   31:invokeinterface #109 <Method void ClientVisitor.visit(Client)>
			}
	//*  14   36:goto            10
			catch(RuntimeException runtimeexception)
	//*  15   39:astore          4
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   16   41:new             #111 <Class StringBuilder>
	//   17   44:dup             
	//   18   45:invokespecial   #112 <Method void StringBuilder()>
	//   19   48:astore          5
				stringbuilder.append(((Object) (client)));
	//   20   50:aload           5
	//   21   52:aload_3         
	//   22   53:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
	//   23   56:pop             
				stringbuilder.append(": ");
	//   24   57:aload           5
	//   25   59:ldc1            #118 <String ": ">
	//   26   61:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   27   64:pop             
				stringbuilder.append(((Object) (runtimeexception)));
	//   28   65:aload           5
	//   29   67:aload           4
	//   30   69:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
	//   31   72:pop             
				addError(stringbuilder.toString());
	//   32   73:aload_0         
	//   33   74:aload           5
	//   34   76:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   35   79:invokevirtual   #129 <Method void addError(String)>
			}
		}

	//*  36   82:goto            10
	//   37   85:return          
	}

	protected abstract boolean configureClient(Client client);

	public boolean isRunning()
	{
		return running;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field boolean running>
	//    2    4:ireturn         
	}

	public void run()
	{
		setRunning(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #146 <Method void setRunning(boolean)>
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #111 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #112 <Method void StringBuilder()>
	//    6   12:astore_1        
		stringbuilder.append("listening on ");
	//    7   13:aload_1         
	//    8   14:ldc1            #148 <String "listening on ">
	//    9   16:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   19:pop             
		stringbuilder.append(((Object) (listener)));
	//   11   20:aload_1         
	//   12   21:aload_0         
	//   13   22:getfield        #43  <Field ServerListener listener>
	//   14   25:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
	//   15   28:pop             
		addInfo(stringbuilder.toString());
	//   16   29:aload_0         
	//   17   30:aload_1         
	//   18   31:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   19   34:invokevirtual   #151 <Method void addInfo(String)>
_L5:
		if(Thread.currentThread().isInterrupted()) goto _L2; else goto _L1
	//   20   37:invokestatic    #157 <Method Thread Thread.currentThread()>
	//   21   40:invokevirtual   #160 <Method boolean Thread.isInterrupted()>
	//   22   43:ifne            185
_L1:
		Client client = listener.acceptClient();
	//   23   46:aload_0         
	//   24   47:getfield        #43  <Field ServerListener listener>
	//   25   50:invokeinterface #166 <Method Client ServerListener.acceptClient()>
	//   26   55:astore_1        
		if(configureClient(client)) goto _L4; else goto _L3
	//   27   56:aload_0         
	//   28   57:aload_1         
	//   29   58:invokevirtual   #168 <Method boolean configureClient(Client)>
	//   30   61:ifne            102
_L3:
		StringBuilder stringbuilder1 = new StringBuilder();
	//   31   64:new             #111 <Class StringBuilder>
	//   32   67:dup             
	//   33   68:invokespecial   #112 <Method void StringBuilder()>
	//   34   71:astore_2        
		stringbuilder1.append(((Object) (client)));
	//   35   72:aload_2         
	//   36   73:aload_1         
	//   37   74:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
	//   38   77:pop             
		stringbuilder1.append(": connection dropped");
	//   39   78:aload_2         
	//   40   79:ldc1            #170 <String ": connection dropped">
	//   41   81:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   42   84:pop             
		addError(stringbuilder1.toString());
	//   43   85:aload_0         
	//   44   86:aload_2         
	//   45   87:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   46   90:invokevirtual   #129 <Method void addError(String)>
_L6:
		client.close();
	//   47   93:aload_1         
	//   48   94:invokeinterface #173 <Method void Client.close()>
		  goto _L5
	//*  49   99:goto            37
_L4:
		executor.execute(((Runnable) (new ClientWrapper(client))));
	//   50  102:aload_0         
	//   51  103:getfield        #45  <Field Executor executor>
	//   52  106:new             #13  <Class ConcurrentServerRunner$ClientWrapper>
	//   53  109:dup             
	//   54  110:aload_0         
	//   55  111:aload_1         
	//   56  112:invokespecial   #175 <Method void ConcurrentServerRunner$ClientWrapper(ConcurrentServerRunner, Client)>
	//   57  115:invokeinterface #181 <Method void Executor.execute(Runnable)>
		  goto _L5
	//*  58  120:goto            37
_L8:
		StringBuilder stringbuilder2 = new StringBuilder();
	//   59  123:new             #111 <Class StringBuilder>
	//   60  126:dup             
	//   61  127:invokespecial   #112 <Method void StringBuilder()>
	//   62  130:astore_2        
		stringbuilder2.append(((Object) (client)));
	//   63  131:aload_2         
	//   64  132:aload_1         
	//   65  133:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
	//   66  136:pop             
		stringbuilder2.append(": connection dropped");
	//   67  137:aload_2         
	//   68  138:ldc1            #170 <String ": connection dropped">
	//   69  140:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   70  143:pop             
		addError(stringbuilder2.toString());
	//   71  144:aload_0         
	//   72  145:aload_2         
	//   73  146:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   74  149:invokevirtual   #129 <Method void addError(String)>
		  goto _L6
	//*  75  152:goto            93
		Object obj;
		obj;
	//   76  155:astore_1        
		StringBuilder stringbuilder3 = new StringBuilder();
	//   77  156:new             #111 <Class StringBuilder>
	//   78  159:dup             
	//   79  160:invokespecial   #112 <Method void StringBuilder()>
	//   80  163:astore_2        
		stringbuilder3.append("listener: ");
	//   81  164:aload_2         
	//   82  165:ldc1            #183 <String "listener: ">
	//   83  167:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   84  170:pop             
		stringbuilder3.append(obj);
	//   85  171:aload_2         
	//   86  172:aload_1         
	//   87  173:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
	//   88  176:pop             
		addError(stringbuilder3.toString());
	//   89  177:aload_0         
	//   90  178:aload_2         
	//   91  179:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   92  182:invokevirtual   #129 <Method void addError(String)>
_L2:
		setRunning(false);
	//   93  185:aload_0         
	//   94  186:iconst_0        
	//   95  187:invokevirtual   #146 <Method void setRunning(boolean)>
		addInfo("shutting down");
	//   96  190:aload_0         
	//   97  191:ldc1            #185 <String "shutting down">
	//   98  193:invokevirtual   #151 <Method void addInfo(String)>
		listener.close();
	//   99  196:aload_0         
	//  100  197:getfield        #43  <Field ServerListener listener>
	//  101  200:invokeinterface #186 <Method void ServerListener.close()>
		return;
	//  102  205:return          
		obj;
	//  103  206:astore_1        
		if(true) goto _L2; else goto _L7
	//  104  207:goto            185
_L7:
		RejectedExecutionException rejectedexecutionexception;
		rejectedexecutionexception;
	//  105  210:astore_2        
		  goto _L8
	//* 106  211:goto            123
	}

	protected void setRunning(boolean flag)
	{
		running = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #135 <Field boolean running>
	//    3    5:return          
	}

	public void stop()
	{
		listener.close();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ServerListener listener>
	//    2    4:invokeinterface #186 <Method void ServerListener.close()>
		accept(new ClientVisitor() {

			public void visit(Client client)
			{
				client.close();
			//    0    0:aload_1         
			//    1    1:invokeinterface #28  <Method void Client.close()>
			//    2    6:return          
			}

			final ConcurrentServerRunner this$0;

			
			{
				this$0 = ConcurrentServerRunner.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ConcurrentServerRunner this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    3    9:aload_0         
	//    4   10:new             #11  <Class ConcurrentServerRunner$1>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #190 <Method void ConcurrentServerRunner$1(ConcurrentServerRunner)>
	//    8   18:invokevirtual   #192 <Method void accept(ClientVisitor)>
	//    9   21:return          
	}

	private final Collection clients = new ArrayList();
	private final Lock clientsLock = new ReentrantLock();
	private final Executor executor;
	private final ServerListener listener;
	private boolean running;


/*
	static void access$000(ConcurrentServerRunner concurrentserverrunner, Client client)
	{
		concurrentserverrunner.addClient(client);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #54  <Method void addClient(Client)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$100(ConcurrentServerRunner concurrentserverrunner, Client client)
	{
		concurrentserverrunner.removeClient(client);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #58  <Method void removeClient(Client)>
		return;
	//    3    5:return          
	}

*/
}
