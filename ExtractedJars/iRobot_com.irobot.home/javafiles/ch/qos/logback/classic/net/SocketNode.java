// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.net;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.ILoggingEvent;
import java.io.*;
import java.net.*;

// Referenced classes of package ch.qos.logback.classic.net:
//			SimpleSocketServer

public class SocketNode
	implements Runnable
{

	public SocketNode(SimpleSocketServer simplesocketserver, Socket socket1, LoggerContext loggercontext)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		closed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #27  <Field boolean closed>
		socketServer = simplesocketserver;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #29  <Field SimpleSocketServer socketServer>
		socket = socket1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #31  <Field Socket socket>
		remoteSocketAddress = socket1.getRemoteSocketAddress();
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:invokevirtual   #37  <Method SocketAddress Socket.getRemoteSocketAddress()>
	//   14   24:putfield        #39  <Field SocketAddress remoteSocketAddress>
		context = loggercontext;
	//   15   27:aload_0         
	//   16   28:aload_3         
	//   17   29:putfield        #41  <Field LoggerContext context>
		logger = loggercontext.getLogger(ch/qos/logback/classic/net/SocketNode);
	//   18   32:aload_0         
	//   19   33:aload_3         
	//   20   34:ldc1            #2   <Class SocketNode>
	//   21   36:invokevirtual   #47  <Method Logger LoggerContext.getLogger(Class)>
	//   22   39:putfield        #49  <Field Logger logger>
	//   23   42:return          
	}

	void close()
	{
		if(closed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean closed>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		closed = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #27  <Field boolean closed>
		if(ois == null)
			break MISSING_BLOCK_LABEL_58;
	//    7   13:aload_0         
	//    8   14:getfield        #55  <Field ObjectInputStream ois>
	//    9   17:ifnull          58
		ois.close();
	//   10   20:aload_0         
	//   11   21:getfield        #55  <Field ObjectInputStream ois>
	//   12   24:invokevirtual   #59  <Method void ObjectInputStream.close()>
_L2:
		ois = null;
	//   13   27:aload_0         
	//   14   28:aconst_null     
	//   15   29:putfield        #55  <Field ObjectInputStream ois>
		return;
	//   16   32:return          
		Object obj;
		obj;
	//   17   33:astore_1        
		break; /* Loop/switch isn't completed */
	//   18   34:goto            51
		obj;
	//   19   37:astore_1        
		logger.warn("Could not close connection.", ((Throwable) (obj)));
	//   20   38:aload_0         
	//   21   39:getfield        #49  <Field Logger logger>
	//   22   42:ldc1            #61  <String "Could not close connection.">
	//   23   44:aload_1         
	//   24   45:invokevirtual   #67  <Method void Logger.warn(String, Throwable)>
		if(true) goto _L2; else goto _L1
	//   25   48:goto            27
_L1:
		ois = null;
	//   26   51:aload_0         
	//   27   52:aconst_null     
	//   28   53:putfield        #55  <Field ObjectInputStream ois>
		throw obj;
	//   29   56:aload_1         
	//   30   57:athrow          
	//   31   58:return          
	}

	public void run()
	{
		try
		{
			ois = new ObjectInputStream(((java.io.InputStream) (new BufferedInputStream(socket.getInputStream()))));
	//    0    0:aload_0         
	//    1    1:new             #57  <Class ObjectInputStream>
	//    2    4:dup             
	//    3    5:new             #76  <Class BufferedInputStream>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field Socket socket>
	//    7   13:invokevirtual   #80  <Method java.io.InputStream Socket.getInputStream()>
	//    8   16:invokespecial   #83  <Method void BufferedInputStream(java.io.InputStream)>
	//    9   19:invokespecial   #84  <Method void ObjectInputStream(java.io.InputStream)>
	//   10   22:putfield        #55  <Field ObjectInputStream ois>
		}
	//*  11   25:goto            72
		catch(Exception exception)
	//*  12   28:astore_1        
		{
			Logger logger2 = logger;
	//   13   29:aload_0         
	//   14   30:getfield        #49  <Field Logger logger>
	//   15   33:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   16   34:new             #86  <Class StringBuilder>
	//   17   37:dup             
	//   18   38:invokespecial   #87  <Method void StringBuilder()>
	//   19   41:astore_3        
			stringbuilder.append("Could not open ObjectInputStream to ");
	//   20   42:aload_3         
	//   21   43:ldc1            #89  <String "Could not open ObjectInputStream to ">
	//   22   45:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
			stringbuilder.append(((Object) (socket)));
	//   24   49:aload_3         
	//   25   50:aload_0         
	//   26   51:getfield        #31  <Field Socket socket>
	//   27   54:invokevirtual   #96  <Method StringBuilder StringBuilder.append(Object)>
	//   28   57:pop             
			logger2.error(stringbuilder.toString(), ((Throwable) (exception)));
	//   29   58:aload_2         
	//   30   59:aload_3         
	//   31   60:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   32   63:aload_1         
	//   33   64:invokevirtual   #103 <Method void Logger.error(String, Throwable)>
			closed = true;
	//   34   67:aload_0         
	//   35   68:iconst_1        
	//   36   69:putfield        #27  <Field boolean closed>
		}
		do
		{
			if(closed)
				break;
	//   37   72:aload_0         
	//   38   73:getfield        #27  <Field boolean closed>
	//   39   76:ifne            209
			ILoggingEvent iloggingevent = (ILoggingEvent)ois.readObject();
	//   40   79:aload_0         
	//   41   80:getfield        #55  <Field ObjectInputStream ois>
	//   42   83:invokevirtual   #107 <Method Object ObjectInputStream.readObject()>
	//   43   86:checkcast       #109 <Class ILoggingEvent>
	//   44   89:astore_1        
			Logger logger3 = context.getLogger(iloggingevent.getLoggerName());
	//   45   90:aload_0         
	//   46   91:getfield        #41  <Field LoggerContext context>
	//   47   94:aload_1         
	//   48   95:invokeinterface #112 <Method String ILoggingEvent.getLoggerName()>
	//   49  100:invokevirtual   #115 <Method Logger LoggerContext.getLogger(String)>
	//   50  103:astore_2        
			if(logger3.isEnabledFor(iloggingevent.getLevel()))
	//*  51  104:aload_2         
	//*  52  105:aload_1         
	//*  53  106:invokeinterface #119 <Method ch.qos.logback.classic.Level ILoggingEvent.getLevel()>
	//*  54  111:invokevirtual   #123 <Method boolean Logger.isEnabledFor(ch.qos.logback.classic.Level)>
	//*  55  114:ifeq            72
				logger3.callAppenders(iloggingevent);
	//   56  117:aload_2         
	//   57  118:aload_1         
	//   58  119:invokevirtual   #127 <Method void Logger.callAppenders(ILoggingEvent)>
		} while(true);
	//   59  122:goto            72
		  goto _L1
		Object obj;
		obj;
	//   60  125:astore_1        
		logger.error("Unexpected exception. Closing connection.", ((Throwable) (obj)));
	//   61  126:aload_0         
	//   62  127:getfield        #49  <Field Logger logger>
	//   63  130:ldc1            #129 <String "Unexpected exception. Closing connection.">
	//   64  132:aload_1         
	//   65  133:invokevirtual   #103 <Method void Logger.error(String, Throwable)>
		  goto _L1
	//*  66  136:goto            209
		obj;
	//   67  139:astore_1        
		Logger logger1;
		Object obj1;
		obj1 = ((Object) (logger));
	//   68  140:aload_0         
	//   69  141:getfield        #49  <Field Logger logger>
	//   70  144:astore_2        
		StringBuilder stringbuilder1 = new StringBuilder();
	//   71  145:new             #86  <Class StringBuilder>
	//   72  148:dup             
	//   73  149:invokespecial   #87  <Method void StringBuilder()>
	//   74  152:astore_3        
		stringbuilder1.append("Caught java.io.IOException: ");
	//   75  153:aload_3         
	//   76  154:ldc1            #131 <String "Caught java.io.IOException: ">
	//   77  156:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   78  159:pop             
		stringbuilder1.append(obj);
	//   79  160:aload_3         
	//   80  161:aload_1         
	//   81  162:invokevirtual   #96  <Method StringBuilder StringBuilder.append(Object)>
	//   82  165:pop             
		((Logger) (obj1)).info(stringbuilder1.toString());
	//   83  166:aload_2         
	//   84  167:aload_3         
	//   85  168:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   86  171:invokevirtual   #135 <Method void Logger.info(String)>
		logger1 = logger;
	//   87  174:aload_0         
	//   88  175:getfield        #49  <Field Logger logger>
	//   89  178:astore_1        
		obj1 = "Closing connection.";
	//   90  179:ldc1            #137 <String "Closing connection.">
	//   91  181:astore_2        
		  goto _L2
	//*  92  182:goto            204
_L6:
		logger1 = logger;
	//   93  185:aload_0         
	//   94  186:getfield        #49  <Field Logger logger>
	//   95  189:astore_1        
		obj1 = "Caught java.net.SocketException closing connection.";
	//   96  190:ldc1            #139 <String "Caught java.net.SocketException closing connection.">
	//   97  192:astore_2        
		  goto _L2
	//*  98  193:goto            204
_L4:
		logger1 = logger;
	//   99  196:aload_0         
	//  100  197:getfield        #49  <Field Logger logger>
	//  101  200:astore_1        
		obj1 = "Caught java.io.EOFException closing connection.";
	//  102  201:ldc1            #141 <String "Caught java.io.EOFException closing connection.">
	//  103  203:astore_2        
_L2:
		logger1.info(((String) (obj1)));
	//  104  204:aload_1         
	//  105  205:aload_2         
	//  106  206:invokevirtual   #135 <Method void Logger.info(String)>
_L1:
		socketServer.socketNodeClosing(this);
	//  107  209:aload_0         
	//  108  210:getfield        #29  <Field SimpleSocketServer socketServer>
	//  109  213:aload_0         
	//  110  214:invokevirtual   #147 <Method void SimpleSocketServer.socketNodeClosing(SocketNode)>
		close();
	//  111  217:aload_0         
	//  112  218:invokevirtual   #148 <Method void close()>
		return;
	//  113  221:return          
		logger1;
	//  114  222:astore_1        
		if(true) goto _L4; else goto _L3
	//  115  223:goto            196
_L3:
		logger1;
	//  116  226:astore_1        
		if(true) goto _L6; else goto _L5
_L5:
	//* 117  227:goto            185
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #86  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Object)this).getClass().getName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #152 <Method Class Object.getClass()>
	//    7   13:invokevirtual   #157 <Method String Class.getName()>
	//    8   16:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(((Object) (remoteSocketAddress)).toString());
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #39  <Field SocketAddress remoteSocketAddress>
	//   13   25:invokevirtual   #158 <Method String Object.toString()>
	//   14   28:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		return stringbuilder.toString();
	//   16   32:aload_1         
	//   17   33:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   18   36:areturn         
	}

	boolean closed;
	LoggerContext context;
	Logger logger;
	ObjectInputStream ois;
	SocketAddress remoteSocketAddress;
	Socket socket;
	SimpleSocketServer socketServer;
}
