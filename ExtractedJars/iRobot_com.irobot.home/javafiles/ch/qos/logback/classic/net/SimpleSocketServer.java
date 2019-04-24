// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.net;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.CountDownLatch;
import javax.net.ServerSocketFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Referenced classes of package ch.qos.logback.classic.net:
//			SocketNode

public class SimpleSocketServer extends Thread
{

	public SimpleSocketServer(LoggerContext loggercontext, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Thread()>
		logger = LoggerFactory.getLogger(ch/qos/logback/classic/net/SimpleSocketServer);
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class SimpleSocketServer>
	//    4    7:invokestatic    #30  <Method Logger LoggerFactory.getLogger(Class)>
	//    5   10:putfield        #32  <Field Logger logger>
		closed = false;
	//    6   13:aload_0         
	//    7   14:iconst_0        
	//    8   15:putfield        #34  <Field boolean closed>
		socketNodeList = ((List) (new ArrayList()));
	//    9   18:aload_0         
	//   10   19:new             #36  <Class ArrayList>
	//   11   22:dup             
	//   12   23:invokespecial   #37  <Method void ArrayList()>
	//   13   26:putfield        #39  <Field List socketNodeList>
		lc = loggercontext;
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:putfield        #41  <Field LoggerContext lc>
		port = i;
	//   17   34:aload_0         
	//   18   35:iload_2         
	//   19   36:putfield        #43  <Field int port>
	//   20   39:return          
	}

	public static void configureLC(LoggerContext loggercontext, String s)
	{
		JoranConfigurator joranconfigurator = new JoranConfigurator();
	//    0    0:new             #48  <Class JoranConfigurator>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void JoranConfigurator()>
	//    3    7:astore_2        
		loggercontext.reset();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #54  <Method void LoggerContext.reset()>
		joranconfigurator.setContext(((ch.qos.logback.core.Context) (loggercontext)));
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #58  <Method void JoranConfigurator.setContext(ch.qos.logback.core.Context)>
		joranconfigurator.doConfigure(s);
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #62  <Method void JoranConfigurator.doConfigure(String)>
	//   12   22:return          
	}

	protected static void doMain(Class class1, String as[])
	{
		int i;
		if(as.length == 2)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:iconst_2        
	//*   3    3:icmpne          16
		{
			i = parsePortNumber(as[0]);
	//    4    6:aload_1         
	//    5    7:iconst_0        
	//    6    8:aaload          
	//    7    9:invokestatic    #68  <Method int parsePortNumber(String)>
	//    8   12:istore_2        
		} else
	//*   9   13:goto            23
		{
			usage("Wrong number of arguments.");
	//   10   16:ldc1            #70  <String "Wrong number of arguments.">
	//   11   18:invokestatic    #73  <Method void usage(String)>
			i = -1;
	//   12   21:iconst_m1       
	//   13   22:istore_2        
		}
		class1 = ((Class) (as[1]));
	//   14   23:aload_1         
	//   15   24:iconst_1        
	//   16   25:aaload          
	//   17   26:astore_0        
		as = ((String []) ((LoggerContext)LoggerFactory.getILoggerFactory()));
	//   18   27:invokestatic    #77  <Method org.slf4j.ILoggerFactory LoggerFactory.getILoggerFactory()>
	//   19   30:checkcast       #51  <Class LoggerContext>
	//   20   33:astore_1        
		configureLC(((LoggerContext) (as)), ((String) (class1)));
	//   21   34:aload_1         
	//   22   35:aload_0         
	//   23   36:invokestatic    #79  <Method void configureLC(LoggerContext, String)>
		(new SimpleSocketServer(((LoggerContext) (as)), i)).start();
	//   24   39:new             #2   <Class SimpleSocketServer>
	//   25   42:dup             
	//   26   43:aload_1         
	//   27   44:iload_2         
	//   28   45:invokespecial   #81  <Method void SimpleSocketServer(LoggerContext, int)>
	//   29   48:invokevirtual   #84  <Method void start()>
	//   30   51:return          
	}

	public static void main(String args[])
	{
		doMain(ch/qos/logback/classic/net/SimpleSocketServer, args);
	//    0    0:ldc1            #2   <Class SimpleSocketServer>
	//    1    2:aload_0         
	//    2    3:invokestatic    #90  <Method void doMain(Class, String[])>
	//    3    6:return          
	}

	static int parsePortNumber(String s)
	{
		int i;
		try
		{
			i = Integer.parseInt(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #97  <Method int Integer.parseInt(String)>
	//    2    4:istore_1        
		}
	//*   3    5:iload_1         
	//*   4    6:ireturn         
		catch(NumberFormatException numberformatexception)
	//*   5    7:astore_2        
		{
			numberformatexception.printStackTrace();
	//    6    8:aload_2         
	//    7    9:invokevirtual   #100 <Method void NumberFormatException.printStackTrace()>
			StringBuilder stringbuilder = new StringBuilder();
	//    8   12:new             #102 <Class StringBuilder>
	//    9   15:dup             
	//   10   16:invokespecial   #103 <Method void StringBuilder()>
	//   11   19:astore_2        
			stringbuilder.append("Could not interpret port number [");
	//   12   20:aload_2         
	//   13   21:ldc1            #105 <String "Could not interpret port number [">
	//   14   23:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   15   26:pop             
			stringbuilder.append(s);
	//   16   27:aload_2         
	//   17   28:aload_0         
	//   18   29:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   19   32:pop             
			stringbuilder.append("].");
	//   20   33:aload_2         
	//   21   34:ldc1            #111 <String "].">
	//   22   36:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   23   39:pop             
			usage(stringbuilder.toString());
	//   24   40:aload_2         
	//   25   41:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   26   44:invokestatic    #73  <Method void usage(String)>
			return -1;
	//   27   47:iconst_m1       
	//   28   48:ireturn         
		}
		return i;
	}

	static void usage(String s)
	{
		System.err.println(s);
	//    0    0:getstatic       #121 <Field PrintStream System.err>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #126 <Method void PrintStream.println(String)>
		s = ((String) (System.err));
	//    3    7:getstatic       #121 <Field PrintStream System.err>
	//    4   10:astore_0        
		StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #102 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #103 <Method void StringBuilder()>
	//    8   18:astore_1        
		stringbuilder.append("Usage: java ");
	//    9   19:aload_1         
	//   10   20:ldc1            #128 <String "Usage: java ">
	//   11   22:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		stringbuilder.append(((Class) (ch/qos/logback/classic/net/SimpleSocketServer)).getName());
	//   13   26:aload_1         
	//   14   27:ldc1            #2   <Class SimpleSocketServer>
	//   15   29:invokevirtual   #133 <Method String Class.getName()>
	//   16   32:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		stringbuilder.append(" port configFile");
	//   18   36:aload_1         
	//   19   37:ldc1            #135 <String " port configFile">
	//   20   39:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
		((PrintStream) (s)).println(stringbuilder.toString());
	//   22   43:aload_0         
	//   23   44:aload_1         
	//   24   45:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   25   48:invokevirtual   #126 <Method void PrintStream.println(String)>
		System.exit(1);
	//   26   51:iconst_1        
	//   27   52:invokestatic    #139 <Method void System.exit(int)>
	//   28   55:return          
	}

	public void close()
	{
		closed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #34  <Field boolean closed>
		if(serverSocket == null)
			break MISSING_BLOCK_LABEL_54;
	//    3    5:aload_0         
	//    4    6:getfield        #144 <Field ServerSocket serverSocket>
	//    5    9:ifnull          54
		serverSocket.close();
	//    6   12:aload_0         
	//    7   13:getfield        #144 <Field ServerSocket serverSocket>
	//    8   16:invokevirtual   #148 <Method void ServerSocket.close()>
_L2:
		serverSocket = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #144 <Field ServerSocket serverSocket>
		break MISSING_BLOCK_LABEL_54;
	//   12   24:goto            54
		Object obj;
		obj;
	//   13   27:astore_1        
		break; /* Loop/switch isn't completed */
	//   14   28:goto            47
		obj;
	//   15   31:astore_1        
		logger.error("Failed to close serverSocket", ((Throwable) (obj)));
	//   16   32:aload_0         
	//   17   33:getfield        #32  <Field Logger logger>
	//   18   36:ldc1            #150 <String "Failed to close serverSocket">
	//   19   38:aload_1         
	//   20   39:invokeinterface #156 <Method void Logger.error(String, Throwable)>
		if(true) goto _L2; else goto _L1
	//   21   44:goto            19
_L1:
		serverSocket = null;
	//   22   47:aload_0         
	//   23   48:aconst_null     
	//   24   49:putfield        #144 <Field ServerSocket serverSocket>
		throw obj;
	//   25   52:aload_1         
	//   26   53:athrow          
		logger.info("closing this server");
	//   27   54:aload_0         
	//   28   55:getfield        #32  <Field Logger logger>
	//   29   58:ldc1            #158 <String "closing this server">
	//   30   60:invokeinterface #161 <Method void Logger.info(String)>
		List list = socketNodeList;
	//   31   65:aload_0         
	//   32   66:getfield        #39  <Field List socketNodeList>
	//   33   69:astore_1        
		list;
	//   34   70:aload_1         
		JVM INSTR monitorenter ;
	//   35   71:monitorenter    
		for(Iterator iterator = socketNodeList.iterator(); iterator.hasNext(); ((SocketNode)iterator.next()).close());
	//   36   72:aload_0         
	//   37   73:getfield        #39  <Field List socketNodeList>
	//   38   76:invokeinterface #167 <Method Iterator List.iterator()>
	//   39   81:astore_2        
	//   40   82:aload_2         
	//   41   83:invokeinterface #173 <Method boolean Iterator.hasNext()>
	//   42   88:ifeq            106
	//   43   91:aload_2         
	//   44   92:invokeinterface #177 <Method Object Iterator.next()>
	//   45   97:checkcast       #179 <Class SocketNode>
	//   46  100:invokevirtual   #180 <Method void SocketNode.close()>
	//*  47  103:goto            82
		list;
	//   48  106:aload_1         
		JVM INSTR monitorexit ;
	//   49  107:monitorexit     
		if(socketNodeList.size() != 0)
	//*  50  108:aload_0         
	//*  51  109:getfield        #39  <Field List socketNodeList>
	//*  52  112:invokeinterface #184 <Method int List.size()>
	//*  53  117:ifeq            131
			logger.warn("Was expecting a 0-sized socketNodeList after server shutdown");
	//   54  120:aload_0         
	//   55  121:getfield        #32  <Field Logger logger>
	//   56  124:ldc1            #186 <String "Was expecting a 0-sized socketNodeList after server shutdown">
	//   57  126:invokeinterface #189 <Method void Logger.warn(String)>
		return;
	//   58  131:return          
		Exception exception;
		exception;
	//   59  132:astore_2        
		list;
	//   60  133:aload_1         
		JVM INSTR monitorexit ;
	//   61  134:monitorexit     
		throw exception;
	//   62  135:aload_2         
	//   63  136:athrow          
	}

	protected String getClientThreadName(Socket socket)
	{
		return String.format("Logback SocketNode (client: %s)", new Object[] {
			socket.getRemoteSocketAddress()
		});
	//    0    0:ldc1            #193 <String "Logback SocketNode (client: %s)">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_1         
	//    6    9:invokevirtual   #201 <Method java.net.SocketAddress Socket.getRemoteSocketAddress()>
	//    7   12:aastore         
	//    8   13:invokestatic    #207 <Method String String.format(String, Object[])>
	//    9   16:areturn         
	}

	public CountDownLatch getLatch()
	{
		return latch;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field CountDownLatch latch>
	//    2    4:areturn         
	}

	protected ServerSocketFactory getServerSocketFactory()
	{
		return ServerSocketFactory.getDefault();
	//    0    0:invokestatic    #218 <Method ServerSocketFactory ServerSocketFactory.getDefault()>
	//    1    3:areturn         
	}

	protected String getServerThreadName()
	{
		return String.format("Logback %s (port %d)", new Object[] {
			((Object)this).getClass().getSimpleName(), Integer.valueOf(port)
		});
	//    0    0:ldc1            #221 <String "Logback %s (port %d)">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:invokevirtual   #225 <Method Class Object.getClass()>
	//    7   12:invokevirtual   #228 <Method String Class.getSimpleName()>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:getfield        #43  <Field int port>
	//   13   22:invokestatic    #232 <Method Integer Integer.valueOf(int)>
	//   14   25:aastore         
	//   15   26:invokestatic    #207 <Method String String.format(String, Object[])>
	//   16   29:areturn         
	}

	public boolean isClosed()
	{
		return closed;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean closed>
	//    2    4:ireturn         
	}

	public void run()
	{
		String s = Thread.currentThread().getName();
	//    0    0:invokestatic    #240 <Method Thread Thread.currentThread()>
	//    1    3:invokevirtual   #241 <Method String Thread.getName()>
	//    2    6:astore_1        
		Object obj = ((Object) (getServerThreadName()));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #243 <Method String getServerThreadName()>
	//    5   11:astore_2        
		Thread.currentThread().setName(((String) (obj)));
	//    6   12:invokestatic    #240 <Method Thread Thread.currentThread()>
	//    7   15:aload_2         
	//    8   16:invokevirtual   #246 <Method void Thread.setName(String)>
		obj = ((Object) (logger));
	//    9   19:aload_0         
	//   10   20:getfield        #32  <Field Logger logger>
	//   11   23:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   12   24:new             #102 <Class StringBuilder>
	//   13   27:dup             
	//   14   28:invokespecial   #103 <Method void StringBuilder()>
	//   15   31:astore_3        
		stringbuilder.append("Listening on port ");
	//   16   32:aload_3         
	//   17   33:ldc1            #248 <String "Listening on port ">
	//   18   35:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
		stringbuilder.append(port);
	//   20   39:aload_3         
	//   21   40:aload_0         
	//   22   41:getfield        #43  <Field int port>
	//   23   44:invokevirtual   #251 <Method StringBuilder StringBuilder.append(int)>
	//   24   47:pop             
		((Logger) (obj)).info(stringbuilder.toString());
	//   25   48:aload_2         
	//   26   49:aload_3         
	//   27   50:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   28   53:invokeinterface #161 <Method void Logger.info(String)>
		serverSocket = getServerSocketFactory().createServerSocket(port);
	//   29   58:aload_0         
	//   30   59:aload_0         
	//   31   60:invokevirtual   #253 <Method ServerSocketFactory getServerSocketFactory()>
	//   32   63:aload_0         
	//   33   64:getfield        #43  <Field int port>
	//   34   67:invokevirtual   #257 <Method ServerSocket ServerSocketFactory.createServerSocket(int)>
	//   35   70:putfield        #144 <Field ServerSocket serverSocket>
_L1:
		Socket socket;
		Object obj2;
		if(closed)
			break MISSING_BLOCK_LABEL_261;
	//   36   73:aload_0         
	//   37   74:getfield        #34  <Field boolean closed>
	//   38   77:ifne            261
		logger.info("Waiting to accept a new client.");
	//   39   80:aload_0         
	//   40   81:getfield        #32  <Field Logger logger>
	//   41   84:ldc2            #259 <String "Waiting to accept a new client.">
	//   42   87:invokeinterface #161 <Method void Logger.info(String)>
		signalAlmostReadiness();
	//   43   92:aload_0         
	//   44   93:invokevirtual   #262 <Method void signalAlmostReadiness()>
		socket = serverSocket.accept();
	//   45   96:aload_0         
	//   46   97:getfield        #144 <Field ServerSocket serverSocket>
	//   47  100:invokevirtual   #266 <Method Socket ServerSocket.accept()>
	//   48  103:astore_2        
		Logger logger1 = logger;
	//   49  104:aload_0         
	//   50  105:getfield        #32  <Field Logger logger>
	//   51  108:astore_3        
		obj2 = ((Object) (new StringBuilder()));
	//   52  109:new             #102 <Class StringBuilder>
	//   53  112:dup             
	//   54  113:invokespecial   #103 <Method void StringBuilder()>
	//   55  116:astore          4
		((StringBuilder) (obj2)).append("Connected to client at ");
	//   56  118:aload           4
	//   57  120:ldc2            #268 <String "Connected to client at ">
	//   58  123:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   59  126:pop             
		((StringBuilder) (obj2)).append(((Object) (socket.getInetAddress())));
	//   60  127:aload           4
	//   61  129:aload_2         
	//   62  130:invokevirtual   #272 <Method java.net.InetAddress Socket.getInetAddress()>
	//   63  133:invokevirtual   #275 <Method StringBuilder StringBuilder.append(Object)>
	//   64  136:pop             
		logger1.info(((StringBuilder) (obj2)).toString());
	//   65  137:aload_3         
	//   66  138:aload           4
	//   67  140:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   68  143:invokeinterface #161 <Method void Logger.info(String)>
		logger.info("Starting new socket node.");
	//   69  148:aload_0         
	//   70  149:getfield        #32  <Field Logger logger>
	//   71  152:ldc2            #277 <String "Starting new socket node.">
	//   72  155:invokeinterface #161 <Method void Logger.info(String)>
		obj2 = ((Object) (new SocketNode(this, socket, lc)));
	//   73  160:new             #179 <Class SocketNode>
	//   74  163:dup             
	//   75  164:aload_0         
	//   76  165:aload_2         
	//   77  166:aload_0         
	//   78  167:getfield        #41  <Field LoggerContext lc>
	//   79  170:invokespecial   #280 <Method void SocketNode(SimpleSocketServer, Socket, LoggerContext)>
	//   80  173:astore          4
		synchronized(socketNodeList)
	//*  81  175:aload_0         
	//*  82  176:getfield        #39  <Field List socketNodeList>
	//*  83  179:astore_3        
	//*  84  180:aload_3         
	//*  85  181:monitorenter    
		{
			socketNodeList.add(obj2);
	//   86  182:aload_0         
	//   87  183:getfield        #39  <Field List socketNodeList>
	//   88  186:aload           4
	//   89  188:invokeinterface #284 <Method boolean List.add(Object)>
	//   90  193:pop             
		}
	//   91  194:aload_3         
	//   92  195:monitorexit     
		(new Thread(((Runnable) (obj2)), getClientThreadName(socket))).start();
	//   93  196:new             #4   <Class Thread>
	//   94  199:dup             
	//   95  200:aload           4
	//   96  202:aload_0         
	//   97  203:aload_2         
	//   98  204:invokevirtual   #286 <Method String getClientThreadName(Socket)>
	//   99  207:invokespecial   #289 <Method void Thread(Runnable, String)>
	//  100  210:invokevirtual   #290 <Method void Thread.start()>
		  goto _L1
	//* 101  213:goto            73
		exception;
	//  102  216:astore_2        
		list;
	//  103  217:aload_3         
		JVM INSTR monitorexit ;
	//  104  218:monitorexit     
		Object obj1;
		try
		{
			throw exception;
	//  105  219:aload_2         
	//  106  220:athrow          
		}
	//* 107  221:astore_2        
	//* 108  222:goto            269
		// Misplaced declaration of an exception variable
		catch(Object obj1) { }
	//  109  225:astore_2        
		break MISSING_BLOCK_LABEL_226;
		obj1;
		break MISSING_BLOCK_LABEL_269;
		if(closed)
	//* 110  226:aload_0         
	//* 111  227:getfield        #34  <Field boolean closed>
	//* 112  230:ifeq            248
		{
			logger.info("Exception in run method for a closed server. This is normal.");
	//  113  233:aload_0         
	//  114  234:getfield        #32  <Field Logger logger>
	//  115  237:ldc2            #292 <String "Exception in run method for a closed server. This is normal.">
	//  116  240:invokeinterface #161 <Method void Logger.info(String)>
			break MISSING_BLOCK_LABEL_261;
	//  117  245:goto            261
		}
		logger.error("Unexpected failure in run method", ((Throwable) (obj1)));
	//  118  248:aload_0         
	//  119  249:getfield        #32  <Field Logger logger>
	//  120  252:ldc2            #294 <String "Unexpected failure in run method">
	//  121  255:aload_2         
	//  122  256:invokeinterface #156 <Method void Logger.error(String, Throwable)>
		Thread.currentThread().setName(s);
	//  123  261:invokestatic    #240 <Method Thread Thread.currentThread()>
	//  124  264:aload_1         
	//  125  265:invokevirtual   #246 <Method void Thread.setName(String)>
		return;
	//  126  268:return          
		Thread.currentThread().setName(s);
	//  127  269:invokestatic    #240 <Method Thread Thread.currentThread()>
	//  128  272:aload_1         
	//  129  273:invokevirtual   #246 <Method void Thread.setName(String)>
		throw obj1;
	//  130  276:aload_2         
	//  131  277:athrow          
	}

	void setLatch(CountDownLatch countdownlatch)
	{
		latch = countdownlatch;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #211 <Field CountDownLatch latch>
	//    3    5:return          
	}

	void signalAlmostReadiness()
	{
		if(latch != null && latch.getCount() != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #211 <Field CountDownLatch latch>
	//*   2    4:ifnull          26
	//*   3    7:aload_0         
	//*   4    8:getfield        #211 <Field CountDownLatch latch>
	//*   5   11:invokevirtual   #302 <Method long CountDownLatch.getCount()>
	//*   6   14:lconst_0        
	//*   7   15:lcmp            
	//*   8   16:ifeq            26
			latch.countDown();
	//    9   19:aload_0         
	//   10   20:getfield        #211 <Field CountDownLatch latch>
	//   11   23:invokevirtual   #305 <Method void CountDownLatch.countDown()>
	//   12   26:return          
	}

	public void socketNodeClosing(SocketNode socketnode)
	{
		logger.debug("Removing {}", ((Object) (socketnode)));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Logger logger>
	//    2    4:ldc2            #309 <String "Removing {}">
	//    3    7:aload_1         
	//    4    8:invokeinterface #313 <Method void Logger.debug(String, Object)>
		synchronized(socketNodeList)
	//*   5   13:aload_0         
	//*   6   14:getfield        #39  <Field List socketNodeList>
	//*   7   17:astore_2        
	//*   8   18:aload_2         
	//*   9   19:monitorenter    
		{
			socketNodeList.remove(((Object) (socketnode)));
	//   10   20:aload_0         
	//   11   21:getfield        #39  <Field List socketNodeList>
	//   12   24:aload_1         
	//   13   25:invokeinterface #316 <Method boolean List.remove(Object)>
	//   14   30:pop             
		}
	//   15   31:aload_2         
	//   16   32:monitorexit     
		return;
	//   17   33:return          
		socketnode;
	//   18   34:astore_1        
		list;
	//   19   35:aload_2         
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		throw socketnode;
	//   21   37:aload_1         
	//   22   38:athrow          
	}

	private boolean closed;
	private CountDownLatch latch;
	private final LoggerContext lc;
	Logger logger;
	private final int port;
	private ServerSocket serverSocket;
	private List socketNodeList;
}
