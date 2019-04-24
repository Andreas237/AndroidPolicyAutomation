// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.server;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.CloseUtil;
import java.io.*;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package ch.qos.logback.core.net.server:
//			RemoteReceiverClient

class RemoteReceiverStreamClient extends ContextAwareBase
	implements RemoteReceiverClient
{

	RemoteReceiverStreamClient(String s, OutputStream outputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void ContextAwareBase()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #22  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #23  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("client ");
	//    6   12:aload_3         
	//    7   13:ldc1            #25  <String "client ">
	//    8   15:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(s);
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
		stringbuilder.append(": ");
	//   14   25:aload_3         
	//   15   26:ldc1            #31  <String ": ">
	//   16   28:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   17   31:pop             
		clientId = stringbuilder.toString();
	//   18   32:aload_0         
	//   19   33:aload_3         
	//   20   34:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   21   37:putfield        #37  <Field String clientId>
		socket = null;
	//   22   40:aload_0         
	//   23   41:aconst_null     
	//   24   42:putfield        #39  <Field Socket socket>
		outputStream = outputstream;
	//   25   45:aload_0         
	//   26   46:aload_2         
	//   27   47:putfield        #41  <Field OutputStream outputStream>
	//   28   50:return          
	}

	public RemoteReceiverStreamClient(String s, Socket socket1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void ContextAwareBase()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #22  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #23  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("client ");
	//    6   12:aload_3         
	//    7   13:ldc1            #25  <String "client ">
	//    8   15:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(s);
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
		stringbuilder.append(": ");
	//   14   25:aload_3         
	//   15   26:ldc1            #31  <String ": ">
	//   16   28:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   17   31:pop             
		clientId = stringbuilder.toString();
	//   18   32:aload_0         
	//   19   33:aload_3         
	//   20   34:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   21   37:putfield        #37  <Field String clientId>
		socket = socket1;
	//   22   40:aload_0         
	//   23   41:aload_2         
	//   24   42:putfield        #39  <Field Socket socket>
		outputStream = null;
	//   25   45:aload_0         
	//   26   46:aconst_null     
	//   27   47:putfield        #41  <Field OutputStream outputStream>
	//   28   50:return          
	}

	private ObjectOutputStream createObjectOutputStream()
	{
		if(socket == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field Socket socket>
	//*   2    4:ifnonnull       19
			return new ObjectOutputStream(outputStream);
	//    3    7:new             #47  <Class ObjectOutputStream>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #41  <Field OutputStream outputStream>
	//    7   15:invokespecial   #50  <Method void ObjectOutputStream(OutputStream)>
	//    8   18:areturn         
		else
			return new ObjectOutputStream(socket.getOutputStream());
	//    9   19:new             #47  <Class ObjectOutputStream>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:getfield        #39  <Field Socket socket>
	//   13   27:invokevirtual   #56  <Method OutputStream Socket.getOutputStream()>
	//   14   30:invokespecial   #50  <Method void ObjectOutputStream(OutputStream)>
	//   15   33:areturn         
	}

	public void close()
	{
		if(socket == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field Socket socket>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			CloseUtil.closeQuietly(socket);
	//    4    8:aload_0         
	//    5    9:getfield        #39  <Field Socket socket>
	//    6   12:invokestatic    #63  <Method void CloseUtil.closeQuietly(Socket)>
			return;
	//    7   15:return          
		}
	}

	public boolean offer(Serializable serializable)
	{
		if(queue == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field BlockingQueue queue>
	//*   2    4:ifnonnull       17
			throw new IllegalStateException("client has no event queue");
	//    3    7:new             #69  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #71  <String "client has no event queue">
	//    6   13:invokespecial   #74  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return queue.offer(((Object) (serializable)));
	//    8   17:aload_0         
	//    9   18:getfield        #67  <Field BlockingQueue queue>
	//   10   21:aload_1         
	//   11   22:invokeinterface #79  <Method boolean BlockingQueue.offer(Object)>
	//   12   27:ireturn         
	}

	public void run()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #22  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append(clientId);
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:getfield        #37  <Field String clientId>
	//    7   15:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append("connected");
	//    9   19:aload           4
	//   10   21:ldc1            #90  <String "connected">
	//   11   23:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
		addInfo(stringbuilder.toString());
	//   13   27:aload_0         
	//   14   28:aload           4
	//   15   30:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   16   33:invokevirtual   #93  <Method void addInfo(String)>
		Object obj1 = ((Object) (createObjectOutputStream()));
	//   17   36:aload_0         
	//   18   37:invokespecial   #95  <Method ObjectOutputStream createObjectOutputStream()>
	//   19   40:astore          5
_L5:
		int i = 0;
	//   20   42:iconst_0        
	//   21   43:istore_1        
_L4:
		Object obj = obj1;
	//   22   44:aload           5
	//   23   46:astore          4
		boolean flag = Thread.currentThread().isInterrupted();
	//   24   48:invokestatic    #101 <Method Thread Thread.currentThread()>
	//   25   51:invokevirtual   #105 <Method boolean Thread.isInterrupted()>
	//   26   54:istore_3        
		if(flag) goto _L2; else goto _L1
	//   27   55:iload_3         
	//   28   56:ifne            128
_L1:
		obj = obj1;
	//   29   59:aload           5
	//   30   61:astore          4
		((ObjectOutputStream) (obj1)).writeObject(((Object) ((Serializable)queue.take())));
	//   31   63:aload           5
	//   32   65:aload_0         
	//   33   66:getfield        #67  <Field BlockingQueue queue>
	//   34   69:invokeinterface #109 <Method Object BlockingQueue.take()>
	//   35   74:checkcast       #111 <Class Serializable>
	//   36   77:invokevirtual   #115 <Method void ObjectOutputStream.writeObject(Object)>
		obj = obj1;
	//   37   80:aload           5
	//   38   82:astore          4
		((ObjectOutputStream) (obj1)).flush();
	//   39   84:aload           5
	//   40   86:invokevirtual   #118 <Method void ObjectOutputStream.flush()>
		int j;
		j = i + 1;
	//   41   89:iload_1         
	//   42   90:iconst_1        
	//   43   91:iadd            
	//   44   92:istore_2        
		i = j;
	//   45   93:iload_2         
	//   46   94:istore_1        
		if(j < 70) goto _L4; else goto _L3
	//   47   95:iload_2         
	//   48   96:bipush          70
	//   49   98:icmplt          44
_L3:
		obj = obj1;
	//   50  101:aload           5
	//   51  103:astore          4
		((ObjectOutputStream) (obj1)).reset();
	//   52  105:aload           5
	//   53  107:invokevirtual   #121 <Method void ObjectOutputStream.reset()>
		  goto _L5
	//*  54  110:goto            42
_L8:
		i = 0;
	//   55  113:iconst_0        
	//   56  114:istore_1        
_L7:
		obj = obj1;
	//   57  115:aload           5
	//   58  117:astore          4
		Thread.currentThread().interrupt();
	//   59  119:invokestatic    #101 <Method Thread Thread.currentThread()>
	//   60  122:invokevirtual   #124 <Method void Thread.interrupt()>
		  goto _L4
	//*  61  125:goto            44
_L2:
		if(obj1 != null)
	//*  62  128:aload           5
	//*  63  130:ifnull          138
			CloseUtil.closeQuietly(((java.io.Closeable) (obj1)));
	//   64  133:aload           5
	//   65  135:invokestatic    #127 <Method void CloseUtil.closeQuietly(java.io.Closeable)>
		close();
	//   66  138:aload_0         
	//   67  139:invokevirtual   #129 <Method void close()>
		obj = ((Object) (new StringBuilder()));
	//   68  142:new             #22  <Class StringBuilder>
	//   69  145:dup             
	//   70  146:invokespecial   #23  <Method void StringBuilder()>
	//   71  149:astore          4
_L6:
		((StringBuilder) (obj)).append(clientId);
	//   72  151:aload           4
	//   73  153:aload_0         
	//   74  154:getfield        #37  <Field String clientId>
	//   75  157:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   76  160:pop             
		((StringBuilder) (obj)).append("connection closed");
	//   77  161:aload           4
	//   78  163:ldc1            #131 <String "connection closed">
	//   79  165:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   80  168:pop             
		addInfo(((StringBuilder) (obj)).toString());
	//   81  169:aload_0         
	//   82  170:aload           4
	//   83  172:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   84  175:invokevirtual   #93  <Method void addInfo(String)>
		return;
	//   85  178:return          
		Object obj2;
		obj2;
	//   86  179:astore          6
		break MISSING_BLOCK_LABEL_207;
	//   87  181:goto            207
		obj2;
	//   88  184:astore          6
		break MISSING_BLOCK_LABEL_290;
	//   89  186:goto            290
		obj2;
	//   90  189:astore          6
		break MISSING_BLOCK_LABEL_373;
	//   91  191:goto            373
		obj;
	//   92  194:astore          4
		obj1 = null;
	//   93  196:aconst_null     
	//   94  197:astore          5
		break MISSING_BLOCK_LABEL_461;
	//   95  199:goto            461
		obj2;
	//   96  202:astore          6
		obj1 = null;
	//   97  204:aconst_null     
	//   98  205:astore          5
		obj = obj1;
	//   99  207:aload           5
	//  100  209:astore          4
		StringBuilder stringbuilder1 = new StringBuilder();
	//  101  211:new             #22  <Class StringBuilder>
	//  102  214:dup             
	//  103  215:invokespecial   #23  <Method void StringBuilder()>
	//  104  218:astore          7
		obj = obj1;
	//  105  220:aload           5
	//  106  222:astore          4
		stringbuilder1.append(clientId);
	//  107  224:aload           7
	//  108  226:aload_0         
	//  109  227:getfield        #37  <Field String clientId>
	//  110  230:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//  111  233:pop             
		obj = obj1;
	//  112  234:aload           5
	//  113  236:astore          4
		stringbuilder1.append(obj2);
	//  114  238:aload           7
	//  115  240:aload           6
	//  116  242:invokevirtual   #134 <Method StringBuilder StringBuilder.append(Object)>
	//  117  245:pop             
		obj = obj1;
	//  118  246:aload           5
	//  119  248:astore          4
		addError(stringbuilder1.toString());
	//  120  250:aload_0         
	//  121  251:aload           7
	//  122  253:invokevirtual   #35  <Method String StringBuilder.toString()>
	//  123  256:invokevirtual   #137 <Method void addError(String)>
		if(obj1 != null)
	//* 124  259:aload           5
	//* 125  261:ifnull          269
			CloseUtil.closeQuietly(((java.io.Closeable) (obj1)));
	//  126  264:aload           5
	//  127  266:invokestatic    #127 <Method void CloseUtil.closeQuietly(java.io.Closeable)>
		close();
	//  128  269:aload_0         
	//  129  270:invokevirtual   #129 <Method void close()>
		obj = ((Object) (new StringBuilder()));
	//  130  273:new             #22  <Class StringBuilder>
	//  131  276:dup             
	//  132  277:invokespecial   #23  <Method void StringBuilder()>
	//  133  280:astore          4
		  goto _L6
	//* 134  282:goto            151
		obj2;
	//  135  285:astore          6
		obj1 = null;
	//  136  287:aconst_null     
	//  137  288:astore          5
		obj = obj1;
	//  138  290:aload           5
	//  139  292:astore          4
		stringbuilder1 = new StringBuilder();
	//  140  294:new             #22  <Class StringBuilder>
	//  141  297:dup             
	//  142  298:invokespecial   #23  <Method void StringBuilder()>
	//  143  301:astore          7
		obj = obj1;
	//  144  303:aload           5
	//  145  305:astore          4
		stringbuilder1.append(clientId);
	//  146  307:aload           7
	//  147  309:aload_0         
	//  148  310:getfield        #37  <Field String clientId>
	//  149  313:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//  150  316:pop             
		obj = obj1;
	//  151  317:aload           5
	//  152  319:astore          4
		stringbuilder1.append(obj2);
	//  153  321:aload           7
	//  154  323:aload           6
	//  155  325:invokevirtual   #134 <Method StringBuilder StringBuilder.append(Object)>
	//  156  328:pop             
		obj = obj1;
	//  157  329:aload           5
	//  158  331:astore          4
		addError(stringbuilder1.toString());
	//  159  333:aload_0         
	//  160  334:aload           7
	//  161  336:invokevirtual   #35  <Method String StringBuilder.toString()>
	//  162  339:invokevirtual   #137 <Method void addError(String)>
		if(obj1 != null)
	//* 163  342:aload           5
	//* 164  344:ifnull          352
			CloseUtil.closeQuietly(((java.io.Closeable) (obj1)));
	//  165  347:aload           5
	//  166  349:invokestatic    #127 <Method void CloseUtil.closeQuietly(java.io.Closeable)>
		close();
	//  167  352:aload_0         
	//  168  353:invokevirtual   #129 <Method void close()>
		obj = ((Object) (new StringBuilder()));
	//  169  356:new             #22  <Class StringBuilder>
	//  170  359:dup             
	//  171  360:invokespecial   #23  <Method void StringBuilder()>
	//  172  363:astore          4
		  goto _L6
	//* 173  365:goto            151
		obj2;
	//  174  368:astore          6
		obj1 = null;
	//  175  370:aconst_null     
	//  176  371:astore          5
		obj = obj1;
	//  177  373:aload           5
	//  178  375:astore          4
		stringbuilder1 = new StringBuilder();
	//  179  377:new             #22  <Class StringBuilder>
	//  180  380:dup             
	//  181  381:invokespecial   #23  <Method void StringBuilder()>
	//  182  384:astore          7
		obj = obj1;
	//  183  386:aload           5
	//  184  388:astore          4
		stringbuilder1.append(clientId);
	//  185  390:aload           7
	//  186  392:aload_0         
	//  187  393:getfield        #37  <Field String clientId>
	//  188  396:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//  189  399:pop             
		obj = obj1;
	//  190  400:aload           5
	//  191  402:astore          4
		stringbuilder1.append(obj2);
	//  192  404:aload           7
	//  193  406:aload           6
	//  194  408:invokevirtual   #134 <Method StringBuilder StringBuilder.append(Object)>
	//  195  411:pop             
		obj = obj1;
	//  196  412:aload           5
	//  197  414:astore          4
		addInfo(stringbuilder1.toString());
	//  198  416:aload_0         
	//  199  417:aload           7
	//  200  419:invokevirtual   #35  <Method String StringBuilder.toString()>
	//  201  422:invokevirtual   #93  <Method void addInfo(String)>
		if(obj1 != null)
	//* 202  425:aload           5
	//* 203  427:ifnull          435
			CloseUtil.closeQuietly(((java.io.Closeable) (obj1)));
	//  204  430:aload           5
	//  205  432:invokestatic    #127 <Method void CloseUtil.closeQuietly(java.io.Closeable)>
		close();
	//  206  435:aload_0         
	//  207  436:invokevirtual   #129 <Method void close()>
		obj = ((Object) (new StringBuilder()));
	//  208  439:new             #22  <Class StringBuilder>
	//  209  442:dup             
	//  210  443:invokespecial   #23  <Method void StringBuilder()>
	//  211  446:astore          4
		  goto _L6
	//* 212  448:goto            151
		obj2;
	//  213  451:astore          6
		obj1 = obj;
	//  214  453:aload           4
	//  215  455:astore          5
		obj = obj2;
	//  216  457:aload           6
	//  217  459:astore          4
		if(obj1 != null)
	//* 218  461:aload           5
	//* 219  463:ifnull          471
			CloseUtil.closeQuietly(((java.io.Closeable) (obj1)));
	//  220  466:aload           5
	//  221  468:invokestatic    #127 <Method void CloseUtil.closeQuietly(java.io.Closeable)>
		close();
	//  222  471:aload_0         
	//  223  472:invokevirtual   #129 <Method void close()>
		obj1 = ((Object) (new StringBuilder()));
	//  224  475:new             #22  <Class StringBuilder>
	//  225  478:dup             
	//  226  479:invokespecial   #23  <Method void StringBuilder()>
	//  227  482:astore          5
		((StringBuilder) (obj1)).append(clientId);
	//  228  484:aload           5
	//  229  486:aload_0         
	//  230  487:getfield        #37  <Field String clientId>
	//  231  490:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//  232  493:pop             
		((StringBuilder) (obj1)).append("connection closed");
	//  233  494:aload           5
	//  234  496:ldc1            #131 <String "connection closed">
	//  235  498:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//  236  501:pop             
		addInfo(((StringBuilder) (obj1)).toString());
	//  237  502:aload_0         
	//  238  503:aload           5
	//  239  505:invokevirtual   #35  <Method String StringBuilder.toString()>
	//  240  508:invokevirtual   #93  <Method void addInfo(String)>
		throw obj;
	//  241  511:aload           4
	//  242  513:athrow          
		InterruptedException interruptedexception;
		interruptedexception;
	//  243  514:astore          4
		  goto _L7
	//* 244  516:goto            115
		interruptedexception;
	//  245  519:astore          4
		  goto _L8
	//* 246  521:goto            113
	}

	public void setQueue(BlockingQueue blockingqueue)
	{
		queue = blockingqueue;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field BlockingQueue queue>
	//    3    5:return          
	}

	private final String clientId;
	private final OutputStream outputStream;
	private BlockingQueue queue;
	private final Socket socket;
}
