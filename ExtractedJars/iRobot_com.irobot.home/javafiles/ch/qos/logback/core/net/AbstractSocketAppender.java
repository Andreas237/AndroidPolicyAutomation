// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import ch.qos.logback.core.util.CloseUtil;
import ch.qos.logback.core.util.Duration;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.*;
import java.util.concurrent.*;
import javax.net.SocketFactory;

// Referenced classes of package ch.qos.logback.core.net:
//			SocketConnector, DefaultSocketConnector

public abstract class AbstractSocketAppender extends AppenderBase
	implements SocketConnector.ExceptionHandler, Runnable
{

	protected AbstractSocketAppender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void AppenderBase()>
		port = 4560;
	//    2    4:aload_0         
	//    3    5:sipush          4560
	//    4    8:putfield        #47  <Field int port>
		reconnectionDelay = new Duration(30000L);
	//    5   11:aload_0         
	//    6   12:new             #49  <Class Duration>
	//    7   15:dup             
	//    8   16:ldc2w           #50  <Long 30000L>
	//    9   19:invokespecial   #54  <Method void Duration(long)>
	//   10   22:putfield        #56  <Field Duration reconnectionDelay>
		queueSize = 128;
	//   11   25:aload_0         
	//   12   26:sipush          128
	//   13   29:putfield        #58  <Field int queueSize>
		acceptConnectionTimeout = 5000;
	//   14   32:aload_0         
	//   15   33:sipush          5000
	//   16   36:putfield        #60  <Field int acceptConnectionTimeout>
		eventDelayLimit = new Duration(100L);
	//   17   39:aload_0         
	//   18   40:new             #49  <Class Duration>
	//   19   43:dup             
	//   20   44:ldc2w           #61  <Long 100L>
	//   21   47:invokespecial   #54  <Method void Duration(long)>
	//   22   50:putfield        #64  <Field Duration eventDelayLimit>
	//   23   53:return          
	}

	protected AbstractSocketAppender(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void AppenderBase()>
		port = 4560;
	//    2    4:aload_0         
	//    3    5:sipush          4560
	//    4    8:putfield        #47  <Field int port>
		reconnectionDelay = new Duration(30000L);
	//    5   11:aload_0         
	//    6   12:new             #49  <Class Duration>
	//    7   15:dup             
	//    8   16:ldc2w           #50  <Long 30000L>
	//    9   19:invokespecial   #54  <Method void Duration(long)>
	//   10   22:putfield        #56  <Field Duration reconnectionDelay>
		queueSize = 128;
	//   11   25:aload_0         
	//   12   26:sipush          128
	//   13   29:putfield        #58  <Field int queueSize>
		acceptConnectionTimeout = 5000;
	//   14   32:aload_0         
	//   15   33:sipush          5000
	//   16   36:putfield        #60  <Field int acceptConnectionTimeout>
		eventDelayLimit = new Duration(100L);
	//   17   39:aload_0         
	//   18   40:new             #49  <Class Duration>
	//   19   43:dup             
	//   20   44:ldc2w           #61  <Long 100L>
	//   21   47:invokespecial   #54  <Method void Duration(long)>
	//   22   50:putfield        #64  <Field Duration eventDelayLimit>
		remoteHost = s;
	//   23   53:aload_0         
	//   24   54:aload_1         
	//   25   55:putfield        #69  <Field String remoteHost>
		port = i;
	//   26   58:aload_0         
	//   27   59:iload_2         
	//   28   60:putfield        #47  <Field int port>
	//   29   63:return          
	}

	private Future activateConnector(SocketConnector socketconnector)
	{
		try
		{
			socketconnector = ((SocketConnector) (getContext().getExecutorService().submit(((java.util.concurrent.Callable) (socketconnector)))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #78  <Method Context getContext()>
	//    2    4:invokeinterface #84  <Method ExecutorService Context.getExecutorService()>
	//    3    9:aload_1         
	//    4   10:invokeinterface #90  <Method Future ExecutorService.submit(java.util.concurrent.Callable)>
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

	private SocketConnector createConnector(InetAddress inetaddress, int i, int j, long l)
	{
		inetaddress = ((InetAddress) (newConnector(inetaddress, i, j, l)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:i2l             
	//    5    5:lload           4
	//    6    7:invokevirtual   #98  <Method SocketConnector newConnector(InetAddress, int, long, long)>
	//    7   10:astore_1        
		((SocketConnector) (inetaddress)).setExceptionHandler(((SocketConnector.ExceptionHandler) (this)));
	//    8   11:aload_1         
	//    9   12:aload_0         
	//   10   13:invokeinterface #104 <Method void SocketConnector.setExceptionHandler(SocketConnector$ExceptionHandler)>
		((SocketConnector) (inetaddress)).setSocketFactory(getSocketFactory());
	//   11   18:aload_1         
	//   12   19:aload_0         
	//   13   20:invokevirtual   #108 <Method SocketFactory getSocketFactory()>
	//   14   23:invokeinterface #112 <Method void SocketConnector.setSocketFactory(SocketFactory)>
		return ((SocketConnector) (inetaddress));
	//   15   28:aload_1         
	//   16   29:areturn         
	}

	private void dispatchEvents()
	{
		ObjectOutputStream objectoutputstream;
		socket.setSoTimeout(acceptConnectionTimeout);
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field Socket socket>
	//    2    4:aload_0         
	//    3    5:getfield        #60  <Field int acceptConnectionTimeout>
	//    4    8:invokevirtual   #123 <Method void Socket.setSoTimeout(int)>
		objectoutputstream = new ObjectOutputStream(socket.getOutputStream());
	//    5   11:new             #125 <Class ObjectOutputStream>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:getfield        #117 <Field Socket socket>
	//    9   19:invokevirtual   #129 <Method java.io.OutputStream Socket.getOutputStream()>
	//   10   22:invokespecial   #132 <Method void ObjectOutputStream(java.io.OutputStream)>
	//   11   25:astore_3        
		socket.setSoTimeout(0);
	//   12   26:aload_0         
	//   13   27:getfield        #117 <Field Socket socket>
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #123 <Method void Socket.setSoTimeout(int)>
		StringBuilder stringbuilder1 = new StringBuilder();
	//   16   34:new             #134 <Class StringBuilder>
	//   17   37:dup             
	//   18   38:invokespecial   #135 <Method void StringBuilder()>
	//   19   41:astore          4
		stringbuilder1.append(peerId);
	//   20   43:aload           4
	//   21   45:aload_0         
	//   22   46:getfield        #137 <Field String peerId>
	//   23   49:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   24   52:pop             
		stringbuilder1.append("connection established");
	//   25   53:aload           4
	//   26   55:ldc1            #143 <String "connection established">
	//   27   57:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:pop             
		addInfo(stringbuilder1.toString());
	//   29   61:aload_0         
	//   30   62:aload           4
	//   31   64:invokevirtual   #147 <Method String StringBuilder.toString()>
	//   32   67:invokevirtual   #151 <Method void addInfo(String)>
		  goto _L1
	//*  33   70:goto            271
_L3:
		Object obj1 = queue.take();
	//   34   73:aload_0         
	//   35   74:getfield        #153 <Field BlockingQueue queue>
	//   36   77:invokeinterface #159 <Method Object BlockingQueue.take()>
	//   37   82:astore          4
		postProcessEvent(obj1);
	//   38   84:aload_0         
	//   39   85:aload           4
	//   40   87:invokevirtual   #163 <Method void postProcessEvent(Object)>
		objectoutputstream.writeObject(((Object) (getPST().transform(obj1))));
	//   41   90:aload_3         
	//   42   91:aload_0         
	//   43   92:invokevirtual   #167 <Method PreSerializationTransformer getPST()>
	//   44   95:aload           4
	//   45   97:invokeinterface #173 <Method java.io.Serializable PreSerializationTransformer.transform(Object)>
	//   46  102:invokevirtual   #176 <Method void ObjectOutputStream.writeObject(Object)>
		objectoutputstream.flush();
	//   47  105:aload_3         
	//   48  106:invokevirtual   #179 <Method void ObjectOutputStream.flush()>
		int i;
		int j = i + 1;
	//   49  109:iload_1         
	//   50  110:iconst_1        
	//   51  111:iadd            
	//   52  112:istore_2        
		i = j;
	//   53  113:iload_2         
	//   54  114:istore_1        
		if(j < 70)
			continue; /* Loop/switch isn't completed */
	//   55  115:iload_2         
	//   56  116:bipush          70
	//   57  118:icmplt          73
		objectoutputstream.reset();
	//   58  121:aload_3         
	//   59  122:invokevirtual   #182 <Method void ObjectOutputStream.reset()>
		  goto _L1
	//*  60  125:goto            271
		Object obj;
		obj;
	//   61  128:astore_3        
		break MISSING_BLOCK_LABEL_221;
	//   62  129:goto            221
		obj;
	//   63  132:astore_3        
		StringBuilder stringbuilder2 = new StringBuilder();
	//   64  133:new             #134 <Class StringBuilder>
	//   65  136:dup             
	//   66  137:invokespecial   #135 <Method void StringBuilder()>
	//   67  140:astore          4
		stringbuilder2.append(peerId);
	//   68  142:aload           4
	//   69  144:aload_0         
	//   70  145:getfield        #137 <Field String peerId>
	//   71  148:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   72  151:pop             
		stringbuilder2.append("connection failed: ");
	//   73  152:aload           4
	//   74  154:ldc1            #184 <String "connection failed: ">
	//   75  156:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   76  159:pop             
		stringbuilder2.append(obj);
	//   77  160:aload           4
	//   78  162:aload_3         
	//   79  163:invokevirtual   #187 <Method StringBuilder StringBuilder.append(Object)>
	//   80  166:pop             
		addInfo(stringbuilder2.toString());
	//   81  167:aload_0         
	//   82  168:aload           4
	//   83  170:invokevirtual   #147 <Method String StringBuilder.toString()>
	//   84  173:invokevirtual   #151 <Method void addInfo(String)>
		CloseUtil.closeQuietly(socket);
	//   85  176:aload_0         
	//   86  177:getfield        #117 <Field Socket socket>
	//   87  180:invokestatic    #193 <Method void CloseUtil.closeQuietly(Socket)>
		socket = null;
	//   88  183:aload_0         
	//   89  184:aconst_null     
	//   90  185:putfield        #117 <Field Socket socket>
		StringBuilder stringbuilder = new StringBuilder();
	//   91  188:new             #134 <Class StringBuilder>
	//   92  191:dup             
	//   93  192:invokespecial   #135 <Method void StringBuilder()>
	//   94  195:astore_3        
		stringbuilder.append(peerId);
	//   95  196:aload_3         
	//   96  197:aload_0         
	//   97  198:getfield        #137 <Field String peerId>
	//   98  201:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   99  204:pop             
		stringbuilder.append("connection closed");
	//  100  205:aload_3         
	//  101  206:ldc1            #195 <String "connection closed">
	//  102  208:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//  103  211:pop             
		addInfo(stringbuilder.toString());
	//  104  212:aload_0         
	//  105  213:aload_3         
	//  106  214:invokevirtual   #147 <Method String StringBuilder.toString()>
	//  107  217:invokevirtual   #151 <Method void addInfo(String)>
		return;
	//  108  220:return          
		CloseUtil.closeQuietly(socket);
	//  109  221:aload_0         
	//  110  222:getfield        #117 <Field Socket socket>
	//  111  225:invokestatic    #193 <Method void CloseUtil.closeQuietly(Socket)>
		socket = null;
	//  112  228:aload_0         
	//  113  229:aconst_null     
	//  114  230:putfield        #117 <Field Socket socket>
		StringBuilder stringbuilder3 = new StringBuilder();
	//  115  233:new             #134 <Class StringBuilder>
	//  116  236:dup             
	//  117  237:invokespecial   #135 <Method void StringBuilder()>
	//  118  240:astore          4
		stringbuilder3.append(peerId);
	//  119  242:aload           4
	//  120  244:aload_0         
	//  121  245:getfield        #137 <Field String peerId>
	//  122  248:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//  123  251:pop             
		stringbuilder3.append("connection closed");
	//  124  252:aload           4
	//  125  254:ldc1            #195 <String "connection closed">
	//  126  256:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//  127  259:pop             
		addInfo(stringbuilder3.toString());
	//  128  260:aload_0         
	//  129  261:aload           4
	//  130  263:invokevirtual   #147 <Method String StringBuilder.toString()>
	//  131  266:invokevirtual   #151 <Method void addInfo(String)>
		throw stringbuilder;
	//  132  269:aload_3         
	//  133  270:athrow          
_L1:
		i = 0;
	//  134  271:iconst_0        
	//  135  272:istore_1        
		if(true) goto _L3; else goto _L2
	//  136  273:goto            73
_L2:
	}

	protected static InetAddress getAddressByName(String s)
	{
		try
		{
			s = ((String) (InetAddress.getByName(s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #204 <Method InetAddress InetAddress.getByName(String)>
	//    2    4:astore_0        
		}
	//*   3    5:aload_0         
	//*   4    6:areturn         
	//*   5    7:aconst_null     
	//*   6    8:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		return ((InetAddress) (s));
	//*   7    9:astore_0        
	//*   8   10:goto            7
	}

	private Socket waitForConnectorToReturnASocket()
	{
		Socket socket1;
		try
		{
			socket1 = (Socket)connectorTask.get();
	//    0    0:aload_0         
	//    1    1:getfield        #210 <Field Future connectorTask>
	//    2    4:invokeinterface #215 <Method Object Future.get()>
	//    3    9:checkcast       #119 <Class Socket>
	//    4   12:astore_1        
			connectorTask = null;
	//    5   13:aload_0         
	//    6   14:aconst_null     
	//    7   15:putfield        #210 <Field Future connectorTask>
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

	protected void append(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          83
		{
			if(!isStarted())
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #221 <Method boolean isStarted()>
	//*   4    8:ifne            12
				return;
	//    5   11:return          
			try
			{
				if(!queue.offer(obj, eventDelayLimit.getMilliseconds(), TimeUnit.MILLISECONDS))
	//*   6   12:aload_0         
	//*   7   13:getfield        #153 <Field BlockingQueue queue>
	//*   8   16:aload_1         
	//*   9   17:aload_0         
	//*  10   18:getfield        #64  <Field Duration eventDelayLimit>
	//*  11   21:invokevirtual   #225 <Method long Duration.getMilliseconds()>
	//*  12   24:getstatic       #231 <Field TimeUnit TimeUnit.MILLISECONDS>
	//*  13   27:invokeinterface #235 <Method boolean BlockingQueue.offer(Object, long, TimeUnit)>
	//*  14   32:ifne            83
				{
					obj = ((Object) (new StringBuilder()));
	//   15   35:new             #134 <Class StringBuilder>
	//   16   38:dup             
	//   17   39:invokespecial   #135 <Method void StringBuilder()>
	//   18   42:astore_1        
					((StringBuilder) (obj)).append("Dropping event due to timeout limit of [");
	//   19   43:aload_1         
	//   20   44:ldc1            #237 <String "Dropping event due to timeout limit of [">
	//   21   46:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   22   49:pop             
					((StringBuilder) (obj)).append(((Object) (eventDelayLimit)));
	//   23   50:aload_1         
	//   24   51:aload_0         
	//   25   52:getfield        #64  <Field Duration eventDelayLimit>
	//   26   55:invokevirtual   #187 <Method StringBuilder StringBuilder.append(Object)>
	//   27   58:pop             
					((StringBuilder) (obj)).append("] milliseconds being exceeded");
	//   28   59:aload_1         
	//   29   60:ldc1            #239 <String "] milliseconds being exceeded">
	//   30   62:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   31   65:pop             
					addInfo(((StringBuilder) (obj)).toString());
	//   32   66:aload_0         
	//   33   67:aload_1         
	//   34   68:invokevirtual   #147 <Method String StringBuilder.toString()>
	//   35   71:invokevirtual   #151 <Method void addInfo(String)>
					return;
	//   36   74:return          
				}
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  37   75:astore_1        
			{
				addError("Interrupted while appending event to SocketAppender", ((Throwable) (obj)));
	//   38   76:aload_0         
	//   39   77:ldc1            #241 <String "Interrupted while appending event to SocketAppender">
	//   40   79:aload_1         
	//   41   80:invokevirtual   #245 <Method void addError(String, Throwable)>
			}
		}
	//   42   83:return          
	}

	public void connectionFailed(SocketConnector socketconnector, Exception exception)
	{
		if(exception instanceof InterruptedException)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #217 <Class InterruptedException>
	//*   2    4:ifeq            16
		{
			socketconnector = "connector interrupted";
	//    3    7:ldc1            #250 <String "connector interrupted">
	//    4    9:astore_1        
		} else
	//*   5   10:aload_0         
	//*   6   11:aload_1         
	//*   7   12:invokevirtual   #151 <Method void addInfo(String)>
	//*   8   15:return          
		{
			if(exception instanceof ConnectException)
	//*   9   16:aload_2         
	//*  10   17:instanceof      #252 <Class ConnectException>
	//*  11   20:ifeq            55
			{
				socketconnector = ((SocketConnector) (new StringBuilder()));
	//   12   23:new             #134 <Class StringBuilder>
	//   13   26:dup             
	//   14   27:invokespecial   #135 <Method void StringBuilder()>
	//   15   30:astore_1        
				((StringBuilder) (socketconnector)).append(peerId);
	//   16   31:aload_1         
	//   17   32:aload_0         
	//   18   33:getfield        #137 <Field String peerId>
	//   19   36:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
				((StringBuilder) (socketconnector)).append("connection refused");
	//   21   40:aload_1         
	//   22   41:ldc1            #254 <String "connection refused">
	//   23   43:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
			} else
	//*  25   47:aload_1         
	//*  26   48:invokevirtual   #147 <Method String StringBuilder.toString()>
	//*  27   51:astore_1        
	//*  28   52:goto            10
			{
				socketconnector = ((SocketConnector) (new StringBuilder()));
	//   29   55:new             #134 <Class StringBuilder>
	//   30   58:dup             
	//   31   59:invokespecial   #135 <Method void StringBuilder()>
	//   32   62:astore_1        
				((StringBuilder) (socketconnector)).append(peerId);
	//   33   63:aload_1         
	//   34   64:aload_0         
	//   35   65:getfield        #137 <Field String peerId>
	//   36   68:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
				((StringBuilder) (socketconnector)).append(((Object) (exception)));
	//   38   72:aload_1         
	//   39   73:aload_2         
	//   40   74:invokevirtual   #187 <Method StringBuilder StringBuilder.append(Object)>
	//   41   77:pop             
			}
			socketconnector = ((SocketConnector) (((StringBuilder) (socketconnector)).toString()));
		}
		addInfo(((String) (socketconnector)));
	//*  42   78:goto            47
	}

	public Duration getEventDelayLimit()
	{
		return eventDelayLimit;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Duration eventDelayLimit>
	//    2    4:areturn         
	}

	protected abstract PreSerializationTransformer getPST();

	public int getPort()
	{
		return port;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int port>
	//    2    4:ireturn         
	}

	public int getQueueSize()
	{
		return queueSize;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int queueSize>
	//    2    4:ireturn         
	}

	public Duration getReconnectionDelay()
	{
		return reconnectionDelay;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Duration reconnectionDelay>
	//    2    4:areturn         
	}

	public String getRemoteHost()
	{
		return remoteHost;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field String remoteHost>
	//    2    4:areturn         
	}

	protected SocketFactory getSocketFactory()
	{
		return SocketFactory.getDefault();
	//    0    0:invokestatic    #266 <Method SocketFactory SocketFactory.getDefault()>
	//    1    3:areturn         
	}

	BlockingQueue newBlockingQueue(int i)
	{
		Object obj;
		if(i <= 0)
	//*   0    0:iload_1         
	//*   1    1:ifgt            15
			obj = ((Object) (new SynchronousQueue()));
	//    2    4:new             #270 <Class SynchronousQueue>
	//    3    7:dup             
	//    4    8:invokespecial   #271 <Method void SynchronousQueue()>
	//    5   11:astore_2        
		else
	//*   6   12:goto            24
			obj = ((Object) (new ArrayBlockingQueue(i)));
	//    7   15:new             #273 <Class ArrayBlockingQueue>
	//    8   18:dup             
	//    9   19:iload_1         
	//   10   20:invokespecial   #275 <Method void ArrayBlockingQueue(int)>
	//   11   23:astore_2        
		return (BlockingQueue)obj;
	//   12   24:aload_2         
	//   13   25:checkcast       #155 <Class BlockingQueue>
	//   14   28:areturn         
	}

	protected SocketConnector newConnector(InetAddress inetaddress, int i, long l, long l1)
	{
		return ((SocketConnector) (new DefaultSocketConnector(inetaddress, i, l, l1)));
	//    0    0:new             #278 <Class DefaultSocketConnector>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:lload_3         
	//    5    7:lload           5
	//    6    9:invokespecial   #281 <Method void DefaultSocketConnector(InetAddress, int, long, long)>
	//    7   12:areturn         
	}

	protected abstract void postProcessEvent(Object obj);

	public final void run()
	{
		signalEntryInRunMethod();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #285 <Method void signalEntryInRunMethod()>
_L2:
		if(Thread.currentThread().isInterrupted())
			break; /* Loop/switch isn't completed */
	//    2    4:invokestatic    #291 <Method Thread Thread.currentThread()>
	//    3    7:invokevirtual   #294 <Method boolean Thread.isInterrupted()>
	//    4   10:ifne            76
		connectorTask = activateConnector(createConnector(address, port, 0, reconnectionDelay.getMilliseconds()));
	//    5   13:aload_0         
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #296 <Field InetAddress address>
	//   10   20:aload_0         
	//   11   21:getfield        #47  <Field int port>
	//   12   24:iconst_0        
	//   13   25:aload_0         
	//   14   26:getfield        #56  <Field Duration reconnectionDelay>
	//   15   29:invokevirtual   #225 <Method long Duration.getMilliseconds()>
	//   16   32:invokespecial   #298 <Method SocketConnector createConnector(InetAddress, int, int, long)>
	//   17   35:invokespecial   #300 <Method Future activateConnector(SocketConnector)>
	//   18   38:putfield        #210 <Field Future connectorTask>
		if(connectorTask == null)
	//*  19   41:aload_0         
	//*  20   42:getfield        #210 <Field Future connectorTask>
	//*  21   45:ifnonnull       51
			break; /* Loop/switch isn't completed */
	//   22   48:goto            76
		socket = waitForConnectorToReturnASocket();
	//   23   51:aload_0         
	//   24   52:aload_0         
	//   25   53:invokespecial   #302 <Method Socket waitForConnectorToReturnASocket()>
	//   26   56:putfield        #117 <Field Socket socket>
		if(socket == null)
	//*  27   59:aload_0         
	//*  28   60:getfield        #117 <Field Socket socket>
	//*  29   63:ifnonnull       69
			break; /* Loop/switch isn't completed */
	//   30   66:goto            76
		dispatchEvents();
	//   31   69:aload_0         
	//   32   70:invokespecial   #304 <Method void dispatchEvents()>
		if(true) goto _L2; else goto _L1
	//   33   73:goto            4
_L1:
		addInfo("shutting down");
	//   34   76:aload_0         
	//   35   77:ldc2            #306 <String "shutting down">
	//   36   80:invokevirtual   #151 <Method void addInfo(String)>
		return;
	//   37   83:return          
		InterruptedException interruptedexception;
		interruptedexception;
	//   38   84:astore_1        
		if(true) goto _L1; else goto _L3
_L3:
	//*  39   85:goto            76
	}

	void setAcceptConnectionTimeout(int i)
	{
		acceptConnectionTimeout = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field int acceptConnectionTimeout>
	//    3    5:return          
	}

	public void setEventDelayLimit(Duration duration)
	{
		eventDelayLimit = duration;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field Duration eventDelayLimit>
	//    3    5:return          
	}

	public void setPort(int i)
	{
		port = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #47  <Field int port>
	//    3    5:return          
	}

	public void setQueueSize(int i)
	{
		queueSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field int queueSize>
	//    3    5:return          
	}

	public void setReconnectionDelay(Duration duration)
	{
		reconnectionDelay = duration;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field Duration reconnectionDelay>
	//    3    5:return          
	}

	public void setRemoteHost(String s)
	{
		remoteHost = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field String remoteHost>
	//    3    5:return          
	}

	protected void signalEntryInRunMethod()
	{
	//    0    0:return          
	}

	public void start()
	{
		int i;
		int j;
		if(isStarted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #221 <Method boolean isStarted()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		j = 0;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		if(port <= 0)
	//*   6   10:aload_0         
	//*   7   11:getfield        #47  <Field int port>
	//*   8   14:ifgt            60
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   17:new             #134 <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #135 <Method void StringBuilder()>
	//   12   24:astore_3        
			stringbuilder.append("No port was configured for appender");
	//   13   25:aload_3         
	//   14   26:ldc2            #318 <String "No port was configured for appender">
	//   15   29:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(name);
	//   17   33:aload_3         
	//   18   34:aload_0         
	//   19   35:getfield        #321 <Field String name>
	//   20   38:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			stringbuilder.append(" For more information, please visit http://logback.qos.ch/codes.html#socket_no_port");
	//   22   42:aload_3         
	//   23   43:ldc2            #323 <String " For more information, please visit http://logback.qos.ch/codes.html#socket_no_port">
	//   24   46:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
			addError(stringbuilder.toString());
	//   26   50:aload_0         
	//   27   51:aload_3         
	//   28   52:invokevirtual   #147 <Method String StringBuilder.toString()>
	//   29   55:invokevirtual   #325 <Method void addError(String)>
			j = 1;
	//   30   58:iconst_1        
	//   31   59:istore_2        
		}
		i = j;
	//   32   60:iload_2         
	//   33   61:istore_1        
		if(remoteHost == null)
	//*  34   62:aload_0         
	//*  35   63:getfield        #69  <Field String remoteHost>
	//*  36   66:ifnonnull       114
		{
			i = j + 1;
	//   37   69:iload_2         
	//   38   70:iconst_1        
	//   39   71:iadd            
	//   40   72:istore_1        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   41   73:new             #134 <Class StringBuilder>
	//   42   76:dup             
	//   43   77:invokespecial   #135 <Method void StringBuilder()>
	//   44   80:astore_3        
			stringbuilder1.append("No remote host was configured for appender");
	//   45   81:aload_3         
	//   46   82:ldc2            #327 <String "No remote host was configured for appender">
	//   47   85:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   48   88:pop             
			stringbuilder1.append(name);
	//   49   89:aload_3         
	//   50   90:aload_0         
	//   51   91:getfield        #321 <Field String name>
	//   52   94:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   53   97:pop             
			stringbuilder1.append(" For more information, please visit http://logback.qos.ch/codes.html#socket_no_host");
	//   54   98:aload_3         
	//   55   99:ldc2            #329 <String " For more information, please visit http://logback.qos.ch/codes.html#socket_no_host">
	//   56  102:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   57  105:pop             
			addError(stringbuilder1.toString());
	//   58  106:aload_0         
	//   59  107:aload_3         
	//   60  108:invokevirtual   #147 <Method String StringBuilder.toString()>
	//   61  111:invokevirtual   #325 <Method void addError(String)>
		}
		j = i;
	//   62  114:iload_1         
	//   63  115:istore_2        
		if(queueSize < 0)
	//*  64  116:aload_0         
	//*  65  117:getfield        #58  <Field int queueSize>
	//*  66  120:ifge            134
		{
			j = i + 1;
	//   67  123:iload_1         
	//   68  124:iconst_1        
	//   69  125:iadd            
	//   70  126:istore_2        
			addError("Queue size must be non-negative");
	//   71  127:aload_0         
	//   72  128:ldc2            #331 <String "Queue size must be non-negative">
	//   73  131:invokevirtual   #325 <Method void addError(String)>
		}
		i = j;
	//   74  134:iload_2         
	//   75  135:istore_1        
		if(j != 0) goto _L2; else goto _L1
	//   76  136:iload_2         
	//   77  137:ifne            193
_L1:
		address = InetAddress.getByName(remoteHost);
	//   78  140:aload_0         
	//   79  141:aload_0         
	//   80  142:getfield        #69  <Field String remoteHost>
	//   81  145:invokestatic    #204 <Method InetAddress InetAddress.getByName(String)>
	//   82  148:putfield        #296 <Field InetAddress address>
		i = j;
	//   83  151:iload_2         
	//   84  152:istore_1        
		  goto _L2
	//*  85  153:goto            193
_L4:
		StringBuilder stringbuilder2 = new StringBuilder();
	//   86  156:new             #134 <Class StringBuilder>
	//   87  159:dup             
	//   88  160:invokespecial   #135 <Method void StringBuilder()>
	//   89  163:astore_3        
		stringbuilder2.append("unknown host: ");
	//   90  164:aload_3         
	//   91  165:ldc2            #333 <String "unknown host: ">
	//   92  168:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   93  171:pop             
		stringbuilder2.append(remoteHost);
	//   94  172:aload_3         
	//   95  173:aload_0         
	//   96  174:getfield        #69  <Field String remoteHost>
	//   97  177:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   98  180:pop             
		addError(stringbuilder2.toString());
	//   99  181:aload_0         
	//  100  182:aload_3         
	//  101  183:invokevirtual   #147 <Method String StringBuilder.toString()>
	//  102  186:invokevirtual   #325 <Method void addError(String)>
		i = j + 1;
	//  103  189:iload_2         
	//  104  190:iconst_1        
	//  105  191:iadd            
	//  106  192:istore_1        
_L2:
		if(i == 0)
	//* 107  193:iload_1         
	//* 108  194:ifne            290
		{
			queue = newBlockingQueue(queueSize);
	//  109  197:aload_0         
	//  110  198:aload_0         
	//  111  199:aload_0         
	//  112  200:getfield        #58  <Field int queueSize>
	//  113  203:invokevirtual   #335 <Method BlockingQueue newBlockingQueue(int)>
	//  114  206:putfield        #153 <Field BlockingQueue queue>
			StringBuilder stringbuilder3 = new StringBuilder();
	//  115  209:new             #134 <Class StringBuilder>
	//  116  212:dup             
	//  117  213:invokespecial   #135 <Method void StringBuilder()>
	//  118  216:astore_3        
			stringbuilder3.append("remote peer ");
	//  119  217:aload_3         
	//  120  218:ldc2            #337 <String "remote peer ">
	//  121  221:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//  122  224:pop             
			stringbuilder3.append(remoteHost);
	//  123  225:aload_3         
	//  124  226:aload_0         
	//  125  227:getfield        #69  <Field String remoteHost>
	//  126  230:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//  127  233:pop             
			stringbuilder3.append(":");
	//  128  234:aload_3         
	//  129  235:ldc2            #339 <String ":">
	//  130  238:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//  131  241:pop             
			stringbuilder3.append(port);
	//  132  242:aload_3         
	//  133  243:aload_0         
	//  134  244:getfield        #47  <Field int port>
	//  135  247:invokevirtual   #342 <Method StringBuilder StringBuilder.append(int)>
	//  136  250:pop             
			stringbuilder3.append(": ");
	//  137  251:aload_3         
	//  138  252:ldc2            #344 <String ": ">
	//  139  255:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//  140  258:pop             
			peerId = stringbuilder3.toString();
	//  141  259:aload_0         
	//  142  260:aload_3         
	//  143  261:invokevirtual   #147 <Method String StringBuilder.toString()>
	//  144  264:putfield        #137 <Field String peerId>
			task = getContext().getExecutorService().submit(((Runnable) (this)));
	//  145  267:aload_0         
	//  146  268:aload_0         
	//  147  269:invokevirtual   #78  <Method Context getContext()>
	//  148  272:invokeinterface #84  <Method ExecutorService Context.getExecutorService()>
	//  149  277:aload_0         
	//  150  278:invokeinterface #347 <Method Future ExecutorService.submit(Runnable)>
	//  151  283:putfield        #349 <Field Future task>
			super.start();
	//  152  286:aload_0         
	//  153  287:invokespecial   #351 <Method void AppenderBase.start()>
		}
		return;
	//  154  290:return          
		UnknownHostException unknownhostexception;
		unknownhostexception;
	//  155  291:astore_3        
		if(true) goto _L4; else goto _L3
_L3:
	//* 156  292:goto            156
	}

	public void stop()
	{
		if(!isStarted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #221 <Method boolean isStarted()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		CloseUtil.closeQuietly(socket);
	//    4    8:aload_0         
	//    5    9:getfield        #117 <Field Socket socket>
	//    6   12:invokestatic    #193 <Method void CloseUtil.closeQuietly(Socket)>
		task.cancel(true);
	//    7   15:aload_0         
	//    8   16:getfield        #349 <Field Future task>
	//    9   19:iconst_1        
	//   10   20:invokeinterface #356 <Method boolean Future.cancel(boolean)>
	//   11   25:pop             
		if(connectorTask != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #210 <Field Future connectorTask>
	//*  14   30:ifnull          44
			connectorTask.cancel(true);
	//   15   33:aload_0         
	//   16   34:getfield        #210 <Field Future connectorTask>
	//   17   37:iconst_1        
	//   18   38:invokeinterface #356 <Method boolean Future.cancel(boolean)>
	//   19   43:pop             
		super.stop();
	//   20   44:aload_0         
	//   21   45:invokespecial   #358 <Method void AppenderBase.stop()>
	//   22   48:return          
	}

	private static final int DEFAULT_ACCEPT_CONNECTION_DELAY = 5000;
	private static final int DEFAULT_EVENT_DELAY_TIMEOUT = 100;
	public static final int DEFAULT_PORT = 4560;
	public static final int DEFAULT_QUEUE_SIZE = 128;
	public static final int DEFAULT_RECONNECTION_DELAY = 30000;
	private int acceptConnectionTimeout;
	private InetAddress address;
	private Future connectorTask;
	private Duration eventDelayLimit;
	private String peerId;
	private int port;
	private BlockingQueue queue;
	private int queueSize;
	private Duration reconnectionDelay;
	private String remoteHost;
	private volatile Socket socket;
	private Future task;
}
