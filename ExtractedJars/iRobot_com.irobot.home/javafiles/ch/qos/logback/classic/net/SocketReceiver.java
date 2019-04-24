// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.net;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.net.DefaultSocketConnector;
import ch.qos.logback.core.net.SocketConnector;
import ch.qos.logback.core.util.CloseUtil;
import java.io.*;
import java.net.*;
import java.util.concurrent.*;
import javax.net.SocketFactory;

// Referenced classes of package ch.qos.logback.classic.net:
//			ReceiverBase

public class SocketReceiver extends ReceiverBase
	implements ch.qos.logback.core.net.SocketConnector.ExceptionHandler, Runnable
{

	public SocketReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void ReceiverBase()>
		acceptConnectionTimeout = 5000;
	//    2    4:aload_0         
	//    3    5:sipush          5000
	//    4    8:putfield        #30  <Field int acceptConnectionTimeout>
	//    5   11:return          
	}

	private Future activateConnector(SocketConnector socketconnector)
	{
		try
		{
			socketconnector = ((SocketConnector) (getContext().getExecutorService().submit(((java.util.concurrent.Callable) (socketconnector)))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method Context getContext()>
	//    2    4:invokeinterface #45  <Method ExecutorService Context.getExecutorService()>
	//    3    9:aload_1         
	//    4   10:invokeinterface #51  <Method Future ExecutorService.submit(java.util.concurrent.Callable)>
	//    5   15:astore_1        
		}
	//*   6   16:aload_1         
	//*   7   17:areturn         
	//*   8   18:aconst_null     
	//*   9   19:areturn         
		// Misplaced declaration of an exception variable
		catch(SocketConnector socketconnector)
		{
			return null;
		}
		return ((Future) (socketconnector));
	//*  10   20:astore_1        
	//*  11   21:goto            18
	}

	private SocketConnector createConnector(InetAddress inetaddress, int i, int j, int k)
	{
		inetaddress = ((InetAddress) (newConnector(inetaddress, i, j, k)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokevirtual   #58  <Method SocketConnector newConnector(InetAddress, int, int, int)>
	//    6    9:astore_1        
		((SocketConnector) (inetaddress)).setExceptionHandler(((ch.qos.logback.core.net.SocketConnector.ExceptionHandler) (this)));
	//    7   10:aload_1         
	//    8   11:aload_0         
	//    9   12:invokeinterface #64  <Method void SocketConnector.setExceptionHandler(ch.qos.logback.core.net.SocketConnector$ExceptionHandler)>
		((SocketConnector) (inetaddress)).setSocketFactory(getSocketFactory());
	//   10   17:aload_1         
	//   11   18:aload_0         
	//   12   19:invokevirtual   #68  <Method SocketFactory getSocketFactory()>
	//   13   22:invokeinterface #72  <Method void SocketConnector.setSocketFactory(SocketFactory)>
		return ((SocketConnector) (inetaddress));
	//   14   27:aload_1         
	//   15   28:areturn         
	}

	private void dispatchEvents(LoggerContext loggercontext)
	{
		socket.setSoTimeout(acceptConnectionTimeout);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Socket socket>
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field int acceptConnectionTimeout>
	//    4    8:invokevirtual   #88  <Method void Socket.setSoTimeout(int)>
		ObjectInputStream objectinputstream = new ObjectInputStream(socket.getInputStream());
	//    5   11:new             #90  <Class ObjectInputStream>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:getfield        #82  <Field Socket socket>
	//    9   19:invokevirtual   #94  <Method java.io.InputStream Socket.getInputStream()>
	//   10   22:invokespecial   #97  <Method void ObjectInputStream(java.io.InputStream)>
	//   11   25:astore_2        
		socket.setSoTimeout(0);
	//   12   26:aload_0         
	//   13   27:getfield        #82  <Field Socket socket>
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #88  <Method void Socket.setSoTimeout(int)>
		StringBuilder stringbuilder3 = new StringBuilder();
	//   16   34:new             #99  <Class StringBuilder>
	//   17   37:dup             
	//   18   38:invokespecial   #100 <Method void StringBuilder()>
	//   19   41:astore_3        
		stringbuilder3.append(receiverId);
	//   20   42:aload_3         
	//   21   43:aload_0         
	//   22   44:getfield        #102 <Field String receiverId>
	//   23   47:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
		stringbuilder3.append("connection established");
	//   25   51:aload_3         
	//   26   52:ldc1            #108 <String "connection established">
	//   27   54:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   28   57:pop             
		addInfo(stringbuilder3.toString());
	//   29   58:aload_0         
	//   30   59:aload_3         
	//   31   60:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   32   63:invokevirtual   #116 <Method void addInfo(String)>
		do
		{
			ILoggingEvent iloggingevent;
			Logger logger;
			do
			{
				iloggingevent = (ILoggingEvent)objectinputstream.readObject();
	//   33   66:aload_2         
	//   34   67:invokevirtual   #120 <Method Object ObjectInputStream.readObject()>
	//   35   70:checkcast       #122 <Class ILoggingEvent>
	//   36   73:astore_3        
				logger = loggercontext.getLogger(iloggingevent.getLoggerName());
	//   37   74:aload_1         
	//   38   75:aload_3         
	//   39   76:invokeinterface #125 <Method String ILoggingEvent.getLoggerName()>
	//   40   81:invokevirtual   #131 <Method Logger LoggerContext.getLogger(String)>
	//   41   84:astore          4
			} while(!logger.isEnabledFor(iloggingevent.getLevel()));
	//   42   86:aload           4
	//   43   88:aload_3         
	//   44   89:invokeinterface #135 <Method ch.qos.logback.classic.Level ILoggingEvent.getLevel()>
	//   45   94:invokevirtual   #141 <Method boolean Logger.isEnabledFor(ch.qos.logback.classic.Level)>
	//   46   97:ifeq            66
			logger.callAppenders(iloggingevent);
	//   47  100:aload           4
	//   48  102:aload_3         
	//   49  103:invokevirtual   #145 <Method void Logger.callAppenders(ILoggingEvent)>
		} while(true);
	//   50  106:goto            66
		loggercontext;
	//   51  109:astore_1        
		  goto _L1
	//*  52  110:goto            314
		loggercontext;
	//   53  113:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   54  114:new             #99  <Class StringBuilder>
	//   55  117:dup             
	//   56  118:invokespecial   #100 <Method void StringBuilder()>
	//   57  121:astore_2        
		stringbuilder.append(receiverId);
	//   58  122:aload_2         
	//   59  123:aload_0         
	//   60  124:getfield        #102 <Field String receiverId>
	//   61  127:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   62  130:pop             
		stringbuilder.append("unknown event class: ");
	//   63  131:aload_2         
	//   64  132:ldc1            #147 <String "unknown event class: ">
	//   65  134:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   66  137:pop             
		stringbuilder.append(((Object) (loggercontext)));
	//   67  138:aload_2         
	//   68  139:aload_1         
	//   69  140:invokevirtual   #150 <Method StringBuilder StringBuilder.append(Object)>
	//   70  143:pop             
		addInfo(stringbuilder.toString());
	//   71  144:aload_0         
	//   72  145:aload_2         
	//   73  146:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   74  149:invokevirtual   #116 <Method void addInfo(String)>
		CloseUtil.closeQuietly(socket);
	//   75  152:aload_0         
	//   76  153:getfield        #82  <Field Socket socket>
	//   77  156:invokestatic    #156 <Method void CloseUtil.closeQuietly(Socket)>
		socket = null;
	//   78  159:aload_0         
	//   79  160:aconst_null     
	//   80  161:putfield        #82  <Field Socket socket>
		loggercontext = ((LoggerContext) (new StringBuilder()));
	//   81  164:new             #99  <Class StringBuilder>
	//   82  167:dup             
	//   83  168:invokespecial   #100 <Method void StringBuilder()>
	//   84  171:astore_1        
		  goto _L2
	//*  85  172:goto            289
		loggercontext;
	//   86  175:astore_1        
		StringBuilder stringbuilder1 = new StringBuilder();
	//   87  176:new             #99  <Class StringBuilder>
	//   88  179:dup             
	//   89  180:invokespecial   #100 <Method void StringBuilder()>
	//   90  183:astore_2        
		stringbuilder1.append(receiverId);
	//   91  184:aload_2         
	//   92  185:aload_0         
	//   93  186:getfield        #102 <Field String receiverId>
	//   94  189:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   95  192:pop             
		stringbuilder1.append("connection failed: ");
	//   96  193:aload_2         
	//   97  194:ldc1            #158 <String "connection failed: ">
	//   98  196:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   99  199:pop             
		stringbuilder1.append(((Object) (loggercontext)));
	//  100  200:aload_2         
	//  101  201:aload_1         
	//  102  202:invokevirtual   #150 <Method StringBuilder StringBuilder.append(Object)>
	//  103  205:pop             
		addInfo(stringbuilder1.toString());
	//  104  206:aload_0         
	//  105  207:aload_2         
	//  106  208:invokevirtual   #112 <Method String StringBuilder.toString()>
	//  107  211:invokevirtual   #116 <Method void addInfo(String)>
		CloseUtil.closeQuietly(socket);
	//  108  214:aload_0         
	//  109  215:getfield        #82  <Field Socket socket>
	//  110  218:invokestatic    #156 <Method void CloseUtil.closeQuietly(Socket)>
		socket = null;
	//  111  221:aload_0         
	//  112  222:aconst_null     
	//  113  223:putfield        #82  <Field Socket socket>
		loggercontext = ((LoggerContext) (new StringBuilder()));
	//  114  226:new             #99  <Class StringBuilder>
	//  115  229:dup             
	//  116  230:invokespecial   #100 <Method void StringBuilder()>
	//  117  233:astore_1        
		  goto _L2
	//* 118  234:goto            289
_L4:
		loggercontext = ((LoggerContext) (new StringBuilder()));
	//  119  237:new             #99  <Class StringBuilder>
	//  120  240:dup             
	//  121  241:invokespecial   #100 <Method void StringBuilder()>
	//  122  244:astore_1        
		((StringBuilder) (loggercontext)).append(receiverId);
	//  123  245:aload_1         
	//  124  246:aload_0         
	//  125  247:getfield        #102 <Field String receiverId>
	//  126  250:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  127  253:pop             
		((StringBuilder) (loggercontext)).append("end-of-stream detected");
	//  128  254:aload_1         
	//  129  255:ldc1            #160 <String "end-of-stream detected">
	//  130  257:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  131  260:pop             
		addInfo(((StringBuilder) (loggercontext)).toString());
	//  132  261:aload_0         
	//  133  262:aload_1         
	//  134  263:invokevirtual   #112 <Method String StringBuilder.toString()>
	//  135  266:invokevirtual   #116 <Method void addInfo(String)>
		CloseUtil.closeQuietly(socket);
	//  136  269:aload_0         
	//  137  270:getfield        #82  <Field Socket socket>
	//  138  273:invokestatic    #156 <Method void CloseUtil.closeQuietly(Socket)>
		socket = null;
	//  139  276:aload_0         
	//  140  277:aconst_null     
	//  141  278:putfield        #82  <Field Socket socket>
		loggercontext = ((LoggerContext) (new StringBuilder()));
	//  142  281:new             #99  <Class StringBuilder>
	//  143  284:dup             
	//  144  285:invokespecial   #100 <Method void StringBuilder()>
	//  145  288:astore_1        
_L2:
		((StringBuilder) (loggercontext)).append(receiverId);
	//  146  289:aload_1         
	//  147  290:aload_0         
	//  148  291:getfield        #102 <Field String receiverId>
	//  149  294:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  150  297:pop             
		((StringBuilder) (loggercontext)).append("connection closed");
	//  151  298:aload_1         
	//  152  299:ldc1            #162 <String "connection closed">
	//  153  301:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  154  304:pop             
		addInfo(((StringBuilder) (loggercontext)).toString());
	//  155  305:aload_0         
	//  156  306:aload_1         
	//  157  307:invokevirtual   #112 <Method String StringBuilder.toString()>
	//  158  310:invokevirtual   #116 <Method void addInfo(String)>
		return;
	//  159  313:return          
_L1:
		CloseUtil.closeQuietly(socket);
	//  160  314:aload_0         
	//  161  315:getfield        #82  <Field Socket socket>
	//  162  318:invokestatic    #156 <Method void CloseUtil.closeQuietly(Socket)>
		socket = null;
	//  163  321:aload_0         
	//  164  322:aconst_null     
	//  165  323:putfield        #82  <Field Socket socket>
		StringBuilder stringbuilder2 = new StringBuilder();
	//  166  326:new             #99  <Class StringBuilder>
	//  167  329:dup             
	//  168  330:invokespecial   #100 <Method void StringBuilder()>
	//  169  333:astore_2        
		stringbuilder2.append(receiverId);
	//  170  334:aload_2         
	//  171  335:aload_0         
	//  172  336:getfield        #102 <Field String receiverId>
	//  173  339:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  174  342:pop             
		stringbuilder2.append("connection closed");
	//  175  343:aload_2         
	//  176  344:ldc1            #162 <String "connection closed">
	//  177  346:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  178  349:pop             
		addInfo(stringbuilder2.toString());
	//  179  350:aload_0         
	//  180  351:aload_2         
	//  181  352:invokevirtual   #112 <Method String StringBuilder.toString()>
	//  182  355:invokevirtual   #116 <Method void addInfo(String)>
		throw loggercontext;
	//  183  358:aload_1         
	//  184  359:athrow          
		loggercontext;
	//  185  360:astore_1        
		if(true) goto _L4; else goto _L3
_L3:
	//* 186  361:goto            237
	}

	private Socket waitForConnectorToReturnASocket()
	{
		Socket socket1;
		try
		{
			socket1 = (Socket)connectorTask.get();
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field Future connectorTask>
	//    2    4:invokeinterface #173 <Method Object Future.get()>
	//    3    9:checkcast       #84  <Class Socket>
	//    4   12:astore_1        
			connectorTask = null;
	//    5   13:aload_0         
	//    6   14:aconst_null     
	//    7   15:putfield        #168 <Field Future connectorTask>
		}
	//*   8   18:aload_1         
	//*   9   19:areturn         
		catch(ExecutionException executionexception)
	//*  10   20:astore_1        
		{
			return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
		}
		return socket1;
	}

	public void connectionFailed(SocketConnector socketconnector, Exception exception)
	{
		if(exception instanceof InterruptedException)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #177 <Class InterruptedException>
	//*   2    4:ifeq            16
		{
			socketconnector = "connector interrupted";
	//    3    7:ldc1            #179 <String "connector interrupted">
	//    4    9:astore_1        
		} else
	//*   5   10:aload_0         
	//*   6   11:aload_1         
	//*   7   12:invokevirtual   #116 <Method void addInfo(String)>
	//*   8   15:return          
		{
			if(exception instanceof ConnectException)
	//*   9   16:aload_2         
	//*  10   17:instanceof      #181 <Class ConnectException>
	//*  11   20:ifeq            55
			{
				socketconnector = ((SocketConnector) (new StringBuilder()));
	//   12   23:new             #99  <Class StringBuilder>
	//   13   26:dup             
	//   14   27:invokespecial   #100 <Method void StringBuilder()>
	//   15   30:astore_1        
				((StringBuilder) (socketconnector)).append(receiverId);
	//   16   31:aload_1         
	//   17   32:aload_0         
	//   18   33:getfield        #102 <Field String receiverId>
	//   19   36:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
				((StringBuilder) (socketconnector)).append("connection refused");
	//   21   40:aload_1         
	//   22   41:ldc1            #183 <String "connection refused">
	//   23   43:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
			} else
	//*  25   47:aload_1         
	//*  26   48:invokevirtual   #112 <Method String StringBuilder.toString()>
	//*  27   51:astore_1        
	//*  28   52:goto            10
			{
				socketconnector = ((SocketConnector) (new StringBuilder()));
	//   29   55:new             #99  <Class StringBuilder>
	//   30   58:dup             
	//   31   59:invokespecial   #100 <Method void StringBuilder()>
	//   32   62:astore_1        
				((StringBuilder) (socketconnector)).append(receiverId);
	//   33   63:aload_1         
	//   34   64:aload_0         
	//   35   65:getfield        #102 <Field String receiverId>
	//   36   68:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
				((StringBuilder) (socketconnector)).append(((Object) (exception)));
	//   38   72:aload_1         
	//   39   73:aload_2         
	//   40   74:invokevirtual   #150 <Method StringBuilder StringBuilder.append(Object)>
	//   41   77:pop             
			}
			socketconnector = ((SocketConnector) (((StringBuilder) (socketconnector)).toString()));
		}
		addInfo(((String) (socketconnector)));
	//*  42   78:goto            47
	}

	protected Runnable getRunnableTask()
	{
		return ((Runnable) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	protected SocketFactory getSocketFactory()
	{
		return SocketFactory.getDefault();
	//    0    0:invokestatic    #190 <Method SocketFactory SocketFactory.getDefault()>
	//    1    3:areturn         
	}

	protected SocketConnector newConnector(InetAddress inetaddress, int i, int j, int k)
	{
		return ((SocketConnector) (new DefaultSocketConnector(inetaddress, i, j, k)));
	//    0    0:new             #192 <Class DefaultSocketConnector>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:i2l             
	//    6    8:iload           4
	//    7   10:i2l             
	//    8   11:invokespecial   #195 <Method void DefaultSocketConnector(InetAddress, int, long, long)>
	//    9   14:areturn         
	}

	protected void onStop()
	{
		if(socket != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field Socket socket>
	//*   2    4:ifnull          14
			CloseUtil.closeQuietly(socket);
	//    3    7:aload_0         
	//    4    8:getfield        #82  <Field Socket socket>
	//    5   11:invokestatic    #156 <Method void CloseUtil.closeQuietly(Socket)>
	//    6   14:return          
	}

	public void run()
	{
		LoggerContext loggercontext = (LoggerContext)getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method Context getContext()>
	//    2    4:checkcast       #127 <Class LoggerContext>
	//    3    7:astore_1        
_L2:
		if(Thread.currentThread().isInterrupted())
			break MISSING_BLOCK_LABEL_78;
	//    4    8:invokestatic    #203 <Method Thread Thread.currentThread()>
	//    5   11:invokevirtual   #207 <Method boolean Thread.isInterrupted()>
	//    6   14:ifne            78
		connectorTask = activateConnector(createConnector(address, port, 0, reconnectionDelay));
	//    7   17:aload_0         
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #209 <Field InetAddress address>
	//   12   24:aload_0         
	//   13   25:getfield        #211 <Field int port>
	//   14   28:iconst_0        
	//   15   29:aload_0         
	//   16   30:getfield        #213 <Field int reconnectionDelay>
	//   17   33:invokespecial   #215 <Method SocketConnector createConnector(InetAddress, int, int, int)>
	//   18   36:invokespecial   #217 <Method Future activateConnector(SocketConnector)>
	//   19   39:putfield        #168 <Field Future connectorTask>
		if(connectorTask == null)
	//*  20   42:aload_0         
	//*  21   43:getfield        #168 <Field Future connectorTask>
	//*  22   46:ifnonnull       52
			break MISSING_BLOCK_LABEL_78;
	//   23   49:goto            78
		socket = waitForConnectorToReturnASocket();
	//   24   52:aload_0         
	//   25   53:aload_0         
	//   26   54:invokespecial   #219 <Method Socket waitForConnectorToReturnASocket()>
	//   27   57:putfield        #82  <Field Socket socket>
		if(socket == null)
	//*  28   60:aload_0         
	//*  29   61:getfield        #82  <Field Socket socket>
	//*  30   64:ifnonnull       70
			break MISSING_BLOCK_LABEL_78;
	//   31   67:goto            78
		dispatchEvents(loggercontext);
	//   32   70:aload_0         
	//   33   71:aload_1         
	//   34   72:invokespecial   #221 <Method void dispatchEvents(LoggerContext)>
		if(true) goto _L2; else goto _L1
	//   35   75:goto            8
_L1:
		addInfo("shutting down");
	//   36   78:aload_0         
	//   37   79:ldc1            #223 <String "shutting down">
	//   38   81:invokevirtual   #116 <Method void addInfo(String)>
		return;
	//   39   84:return          
		InterruptedException interruptedexception;
		interruptedexception;
	//   40   85:astore_1        
		if(true) goto _L1; else goto _L3
_L3:
	//*  41   86:goto            78
	}

	public void setAcceptConnectionTimeout(int i)
	{
		acceptConnectionTimeout = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int acceptConnectionTimeout>
	//    3    5:return          
	}

	public void setPort(int i)
	{
		port = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #211 <Field int port>
	//    3    5:return          
	}

	public void setReconnectionDelay(int i)
	{
		reconnectionDelay = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #213 <Field int reconnectionDelay>
	//    3    5:return          
	}

	public void setRemoteHost(String s)
	{
		remoteHost = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #229 <Field String remoteHost>
	//    3    5:return          
	}

	protected boolean shouldStart()
	{
		int i;
		int j;
		boolean flag;
		i = port;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field int port>
	//    2    4:istore_1        
		flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(i == 0)
	//*   5    7:iload_1         
	//*   6    8:ifne            22
		{
			addError("No port was configured for receiver. For more information, please visit http://logback.qos.ch/codes.html#receiver_no_port");
	//    7   11:aload_0         
	//    8   12:ldc1            #234 <String "No port was configured for receiver. For more information, please visit http://logback.qos.ch/codes.html#receiver_no_port">
	//    9   14:invokevirtual   #237 <Method void addError(String)>
			j = 1;
	//   10   17:iconst_1        
	//   11   18:istore_2        
		} else
	//*  12   19:goto            24
		{
			j = 0;
	//   13   22:iconst_0        
	//   14   23:istore_2        
		}
		i = j;
	//   15   24:iload_2         
	//   16   25:istore_1        
		if(remoteHost == null)
	//*  17   26:aload_0         
	//*  18   27:getfield        #229 <Field String remoteHost>
	//*  19   30:ifnonnull       43
		{
			i = j + 1;
	//   20   33:iload_2         
	//   21   34:iconst_1        
	//   22   35:iadd            
	//   23   36:istore_1        
			addError("No host name or address was configured for receiver. For more information, please visit http://logback.qos.ch/codes.html#receiver_no_host");
	//   24   37:aload_0         
	//   25   38:ldc1            #239 <String "No host name or address was configured for receiver. For more information, please visit http://logback.qos.ch/codes.html#receiver_no_host">
	//   26   40:invokevirtual   #237 <Method void addError(String)>
		}
		if(reconnectionDelay == 0)
	//*  27   43:aload_0         
	//*  28   44:getfield        #213 <Field int reconnectionDelay>
	//*  29   47:ifne            57
			reconnectionDelay = 30000;
	//   30   50:aload_0         
	//   31   51:sipush          30000
	//   32   54:putfield        #213 <Field int reconnectionDelay>
		j = i;
	//   33   57:iload_1         
	//   34   58:istore_2        
		if(i != 0) goto _L2; else goto _L1
	//   35   59:iload_1         
	//   36   60:ifne            119
_L1:
		address = InetAddress.getByName(remoteHost);
	//   37   63:aload_0         
	//   38   64:aload_0         
	//   39   65:getfield        #229 <Field String remoteHost>
	//   40   68:invokestatic    #245 <Method InetAddress InetAddress.getByName(String)>
	//   41   71:putfield        #209 <Field InetAddress address>
		j = i;
	//   42   74:iload_1         
	//   43   75:istore_2        
		  goto _L2
	//*  44   76:goto            119
_L4:
		StringBuilder stringbuilder = new StringBuilder();
	//   45   79:new             #99  <Class StringBuilder>
	//   46   82:dup             
	//   47   83:invokespecial   #100 <Method void StringBuilder()>
	//   48   86:astore          4
		stringbuilder.append("unknown host: ");
	//   49   88:aload           4
	//   50   90:ldc1            #247 <String "unknown host: ">
	//   51   92:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   52   95:pop             
		stringbuilder.append(remoteHost);
	//   53   96:aload           4
	//   54   98:aload_0         
	//   55   99:getfield        #229 <Field String remoteHost>
	//   56  102:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   57  105:pop             
		addError(stringbuilder.toString());
	//   58  106:aload_0         
	//   59  107:aload           4
	//   60  109:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   61  112:invokevirtual   #237 <Method void addError(String)>
		j = i + 1;
	//   62  115:iload_1         
	//   63  116:iconst_1        
	//   64  117:iadd            
	//   65  118:istore_2        
_L2:
		if(j == 0)
	//*  66  119:iload_2         
	//*  67  120:ifne            186
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   68  123:new             #99  <Class StringBuilder>
	//   69  126:dup             
	//   70  127:invokespecial   #100 <Method void StringBuilder()>
	//   71  130:astore          4
			stringbuilder1.append("receiver ");
	//   72  132:aload           4
	//   73  134:ldc1            #249 <String "receiver ">
	//   74  136:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   75  139:pop             
			stringbuilder1.append(remoteHost);
	//   76  140:aload           4
	//   77  142:aload_0         
	//   78  143:getfield        #229 <Field String remoteHost>
	//   79  146:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   80  149:pop             
			stringbuilder1.append(":");
	//   81  150:aload           4
	//   82  152:ldc1            #251 <String ":">
	//   83  154:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   84  157:pop             
			stringbuilder1.append(port);
	//   85  158:aload           4
	//   86  160:aload_0         
	//   87  161:getfield        #211 <Field int port>
	//   88  164:invokevirtual   #254 <Method StringBuilder StringBuilder.append(int)>
	//   89  167:pop             
			stringbuilder1.append(": ");
	//   90  168:aload           4
	//   91  170:ldc2            #256 <String ": ">
	//   92  173:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   93  176:pop             
			receiverId = stringbuilder1.toString();
	//   94  177:aload_0         
	//   95  178:aload           4
	//   96  180:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   97  183:putfield        #102 <Field String receiverId>
		}
		if(j == 0)
	//*  98  186:iload_2         
	//*  99  187:ifne            192
			flag = true;
	//  100  190:iconst_1        
	//  101  191:istore_3        
		return flag;
	//  102  192:iload_3         
	//  103  193:ireturn         
		UnknownHostException unknownhostexception;
		unknownhostexception;
	//  104  194:astore          4
		if(true) goto _L4; else goto _L3
	//  105  196:goto            79
_L3:
	}

	private static final int DEFAULT_ACCEPT_CONNECTION_DELAY = 5000;
	private int acceptConnectionTimeout;
	private InetAddress address;
	private Future connectorTask;
	private int port;
	private String receiverId;
	private int reconnectionDelay;
	private String remoteHost;
	private volatile Socket socket;
}
