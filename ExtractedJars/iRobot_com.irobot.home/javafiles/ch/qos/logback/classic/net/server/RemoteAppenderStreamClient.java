// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.net.server;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.util.CloseUtil;
import java.io.*;
import java.net.Socket;

// Referenced classes of package ch.qos.logback.classic.net.server:
//			RemoteAppenderClient

class RemoteAppenderStreamClient
	implements RemoteAppenderClient
{

	public RemoteAppenderStreamClient(String s, InputStream inputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		id = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field String id>
		socket = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #25  <Field Socket socket>
		inputStream = inputstream;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #27  <Field InputStream inputStream>
	//   11   19:return          
	}

	public RemoteAppenderStreamClient(String s, Socket socket1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		id = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field String id>
		socket = socket1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field Socket socket>
		inputStream = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #27  <Field InputStream inputStream>
	//   11   19:return          
	}

	private ObjectInputStream createObjectInputStream()
	{
		if(inputStream != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field InputStream inputStream>
	//*   2    4:ifnull          19
			return new ObjectInputStream(inputStream);
	//    3    7:new             #33  <Class ObjectInputStream>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field InputStream inputStream>
	//    7   15:invokespecial   #36  <Method void ObjectInputStream(InputStream)>
	//    8   18:areturn         
		else
			return new ObjectInputStream(socket.getInputStream());
	//    9   19:new             #33  <Class ObjectInputStream>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:getfield        #25  <Field Socket socket>
	//   13   27:invokevirtual   #42  <Method InputStream Socket.getInputStream()>
	//   14   30:invokespecial   #36  <Method void ObjectInputStream(InputStream)>
	//   15   33:areturn         
	}

	public void close()
	{
		if(socket == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field Socket socket>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			CloseUtil.closeQuietly(socket);
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field Socket socket>
	//    6   12:invokestatic    #49  <Method void CloseUtil.closeQuietly(Socket)>
			return;
	//    7   15:return          
		}
	}

	public void run()
	{
		Object obj2;
		Object obj4;
		Logger logger1 = logger;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Logger logger>
	//    2    4:astore_1        
		obj2 = ((Object) (new StringBuilder()));
	//    3    5:new             #62  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #63  <Method void StringBuilder()>
	//    6   12:astore_2        
		((StringBuilder) (obj2)).append(((Object) (this)));
	//    7   13:aload_2         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   10   18:pop             
		((StringBuilder) (obj2)).append(": connected");
	//   11   19:aload_2         
	//   12   20:ldc1            #69  <String ": connected">
	//   13   22:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
		logger1.info(((StringBuilder) (obj2)).toString());
	//   15   26:aload_1         
	//   16   27:aload_2         
	//   17   28:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   18   31:invokevirtual   #82  <Method void Logger.info(String)>
		obj4 = null;
	//   19   34:aconst_null     
	//   20   35:astore_3        
		obj2 = null;
	//   21   36:aconst_null     
	//   22   37:astore_2        
		Object obj = ((Object) (createObjectInputStream()));
	//   23   38:aload_0         
	//   24   39:invokespecial   #84  <Method ObjectInputStream createObjectInputStream()>
	//   25   42:astore_1        
_L2:
		obj2 = obj;
	//   26   43:aload_1         
	//   27   44:astore_2        
		obj4 = ((Object) ((ILoggingEvent)((ObjectInputStream) (obj)).readObject()));
	//   28   45:aload_1         
	//   29   46:invokevirtual   #88  <Method Object ObjectInputStream.readObject()>
	//   30   49:checkcast       #90  <Class ILoggingEvent>
	//   31   52:astore_3        
		obj2 = obj;
	//   32   53:aload_1         
	//   33   54:astore_2        
		Object obj5 = ((Object) (lc.getLogger(((ILoggingEvent) (obj4)).getLoggerName())));
	//   34   55:aload_0         
	//   35   56:getfield        #92  <Field LoggerContext lc>
	//   36   59:aload_3         
	//   37   60:invokeinterface #95  <Method String ILoggingEvent.getLoggerName()>
	//   38   65:invokevirtual   #101 <Method Logger LoggerContext.getLogger(String)>
	//   39   68:astore          4
		obj2 = obj;
	//   40   70:aload_1         
	//   41   71:astore_2        
		if(!((Logger) (obj5)).isEnabledFor(((ILoggingEvent) (obj4)).getLevel())) goto _L2; else goto _L1
	//   42   72:aload           4
	//   43   74:aload_3         
	//   44   75:invokeinterface #105 <Method ch.qos.logback.classic.Level ILoggingEvent.getLevel()>
	//   45   80:invokevirtual   #109 <Method boolean Logger.isEnabledFor(ch.qos.logback.classic.Level)>
	//   46   83:ifeq            43
_L1:
		obj2 = obj;
	//   47   86:aload_1         
	//   48   87:astore_2        
		((Logger) (obj5)).callAppenders(((ILoggingEvent) (obj4)));
	//   49   88:aload           4
	//   50   90:aload_3         
	//   51   91:invokevirtual   #113 <Method void Logger.callAppenders(ILoggingEvent)>
		  goto _L2
	//*  52   94:goto            43
		obj4;
	//   53   97:astore_3        
		  goto _L3
	//*  54   98:goto            115
	//*  55  101:goto            202
		obj4;
	//   56  104:astore_3        
		  goto _L4
	//*  57  105:goto            281
		obj;
	//   58  108:astore_1        
		  goto _L5
	//*  59  109:goto            369
		obj4;
	//   60  112:astore_3        
		obj = null;
	//   61  113:aconst_null     
	//   62  114:astore_1        
_L3:
		obj2 = obj;
	//   63  115:aload_1         
	//   64  116:astore_2        
		obj5 = ((Object) (logger));
	//   65  117:aload_0         
	//   66  118:getfield        #60  <Field Logger logger>
	//   67  121:astore          4
		obj2 = obj;
	//   68  123:aload_1         
	//   69  124:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   70  125:new             #62  <Class StringBuilder>
	//   71  128:dup             
	//   72  129:invokespecial   #63  <Method void StringBuilder()>
	//   73  132:astore          5
		obj2 = obj;
	//   74  134:aload_1         
	//   75  135:astore_2        
		stringbuilder.append(((Object) (this)));
	//   76  136:aload           5
	//   77  138:aload_0         
	//   78  139:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   79  142:pop             
		obj2 = obj;
	//   80  143:aload_1         
	//   81  144:astore_2        
		stringbuilder.append(": ");
	//   82  145:aload           5
	//   83  147:ldc1            #115 <String ": ">
	//   84  149:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   85  152:pop             
		obj2 = obj;
	//   86  153:aload_1         
	//   87  154:astore_2        
		stringbuilder.append(obj4);
	//   88  155:aload           5
	//   89  157:aload_3         
	//   90  158:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   91  161:pop             
		obj2 = obj;
	//   92  162:aload_1         
	//   93  163:astore_2        
		((Logger) (obj5)).error(stringbuilder.toString());
	//   94  164:aload           4
	//   95  166:aload           5
	//   96  168:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   97  171:invokevirtual   #118 <Method void Logger.error(String)>
		if(obj != null)
	//*  98  174:aload_1         
	//*  99  175:ifnull          182
			CloseUtil.closeQuietly(((java.io.Closeable) (obj)));
	//  100  178:aload_1         
	//  101  179:invokestatic    #121 <Method void CloseUtil.closeQuietly(java.io.Closeable)>
		close();
	//  102  182:aload_0         
	//  103  183:invokevirtual   #123 <Method void close()>
		obj = ((Object) (logger));
	//  104  186:aload_0         
	//  105  187:getfield        #60  <Field Logger logger>
	//  106  190:astore_1        
		obj2 = ((Object) (new StringBuilder()));
	//  107  191:new             #62  <Class StringBuilder>
	//  108  194:dup             
	//  109  195:invokespecial   #63  <Method void StringBuilder()>
	//  110  198:astore_2        
		  goto _L6
	//* 111  199:goto            444
_L10:
		obj2 = obj;
	//  112  202:aload_1         
	//  113  203:astore_2        
		obj4 = ((Object) (logger));
	//  114  204:aload_0         
	//  115  205:getfield        #60  <Field Logger logger>
	//  116  208:astore_3        
		obj2 = obj;
	//  117  209:aload_1         
	//  118  210:astore_2        
		obj5 = ((Object) (new StringBuilder()));
	//  119  211:new             #62  <Class StringBuilder>
	//  120  214:dup             
	//  121  215:invokespecial   #63  <Method void StringBuilder()>
	//  122  218:astore          4
		obj2 = obj;
	//  123  220:aload_1         
	//  124  221:astore_2        
		((StringBuilder) (obj5)).append(((Object) (this)));
	//  125  222:aload           4
	//  126  224:aload_0         
	//  127  225:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//  128  228:pop             
		obj2 = obj;
	//  129  229:aload_1         
	//  130  230:astore_2        
		((StringBuilder) (obj5)).append(": unknown event class");
	//  131  231:aload           4
	//  132  233:ldc1            #125 <String ": unknown event class">
	//  133  235:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//  134  238:pop             
		obj2 = obj;
	//  135  239:aload_1         
	//  136  240:astore_2        
		((Logger) (obj4)).error(((StringBuilder) (obj5)).toString());
	//  137  241:aload_3         
	//  138  242:aload           4
	//  139  244:invokevirtual   #76  <Method String StringBuilder.toString()>
	//  140  247:invokevirtual   #118 <Method void Logger.error(String)>
		if(obj != null)
	//* 141  250:aload_1         
	//* 142  251:ifnull          258
			CloseUtil.closeQuietly(((java.io.Closeable) (obj)));
	//  143  254:aload_1         
	//  144  255:invokestatic    #121 <Method void CloseUtil.closeQuietly(java.io.Closeable)>
		close();
	//  145  258:aload_0         
	//  146  259:invokevirtual   #123 <Method void close()>
		obj = ((Object) (logger));
	//  147  262:aload_0         
	//  148  263:getfield        #60  <Field Logger logger>
	//  149  266:astore_1        
		obj2 = ((Object) (new StringBuilder()));
	//  150  267:new             #62  <Class StringBuilder>
	//  151  270:dup             
	//  152  271:invokespecial   #63  <Method void StringBuilder()>
	//  153  274:astore_2        
		  goto _L6
	//* 154  275:goto            444
		obj4;
	//  155  278:astore_3        
		obj = null;
	//  156  279:aconst_null     
	//  157  280:astore_1        
_L4:
		obj2 = obj;
	//  158  281:aload_1         
	//  159  282:astore_2        
		obj5 = ((Object) (logger));
	//  160  283:aload_0         
	//  161  284:getfield        #60  <Field Logger logger>
	//  162  287:astore          4
		obj2 = obj;
	//  163  289:aload_1         
	//  164  290:astore_2        
		stringbuilder = new StringBuilder();
	//  165  291:new             #62  <Class StringBuilder>
	//  166  294:dup             
	//  167  295:invokespecial   #63  <Method void StringBuilder()>
	//  168  298:astore          5
		obj2 = obj;
	//  169  300:aload_1         
	//  170  301:astore_2        
		stringbuilder.append(((Object) (this)));
	//  171  302:aload           5
	//  172  304:aload_0         
	//  173  305:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//  174  308:pop             
		obj2 = obj;
	//  175  309:aload_1         
	//  176  310:astore_2        
		stringbuilder.append(": ");
	//  177  311:aload           5
	//  178  313:ldc1            #115 <String ": ">
	//  179  315:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//  180  318:pop             
		obj2 = obj;
	//  181  319:aload_1         
	//  182  320:astore_2        
		stringbuilder.append(obj4);
	//  183  321:aload           5
	//  184  323:aload_3         
	//  185  324:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//  186  327:pop             
		obj2 = obj;
	//  187  328:aload_1         
	//  188  329:astore_2        
		((Logger) (obj5)).info(stringbuilder.toString());
	//  189  330:aload           4
	//  190  332:aload           5
	//  191  334:invokevirtual   #76  <Method String StringBuilder.toString()>
	//  192  337:invokevirtual   #82  <Method void Logger.info(String)>
		if(obj != null)
	//* 193  340:aload_1         
	//* 194  341:ifnull          348
			CloseUtil.closeQuietly(((java.io.Closeable) (obj)));
	//  195  344:aload_1         
	//  196  345:invokestatic    #121 <Method void CloseUtil.closeQuietly(java.io.Closeable)>
		close();
	//  197  348:aload_0         
	//  198  349:invokevirtual   #123 <Method void close()>
		obj = ((Object) (logger));
	//  199  352:aload_0         
	//  200  353:getfield        #60  <Field Logger logger>
	//  201  356:astore_1        
		obj2 = ((Object) (new StringBuilder()));
	//  202  357:new             #62  <Class StringBuilder>
	//  203  360:dup             
	//  204  361:invokespecial   #63  <Method void StringBuilder()>
	//  205  364:astore_2        
		  goto _L6
	//* 206  365:goto            444
		obj;
	//  207  368:astore_1        
_L5:
		if(obj2 != null)
	//* 208  369:aload_2         
	//* 209  370:ifnull          377
			CloseUtil.closeQuietly(((java.io.Closeable) (obj2)));
	//  210  373:aload_2         
	//  211  374:invokestatic    #121 <Method void CloseUtil.closeQuietly(java.io.Closeable)>
		close();
	//  212  377:aload_0         
	//  213  378:invokevirtual   #123 <Method void close()>
		obj2 = ((Object) (logger));
	//  214  381:aload_0         
	//  215  382:getfield        #60  <Field Logger logger>
	//  216  385:astore_2        
		obj4 = ((Object) (new StringBuilder()));
	//  217  386:new             #62  <Class StringBuilder>
	//  218  389:dup             
	//  219  390:invokespecial   #63  <Method void StringBuilder()>
	//  220  393:astore_3        
		((StringBuilder) (obj4)).append(((Object) (this)));
	//  221  394:aload_3         
	//  222  395:aload_0         
	//  223  396:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//  224  399:pop             
		((StringBuilder) (obj4)).append(": connection closed");
	//  225  400:aload_3         
	//  226  401:ldc1            #127 <String ": connection closed">
	//  227  403:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//  228  406:pop             
		((Logger) (obj2)).info(((StringBuilder) (obj4)).toString());
	//  229  407:aload_2         
	//  230  408:aload_3         
	//  231  409:invokevirtual   #76  <Method String StringBuilder.toString()>
	//  232  412:invokevirtual   #82  <Method void Logger.info(String)>
		throw obj;
	//  233  415:aload_1         
	//  234  416:athrow          
_L7:
		obj = null;
	//  235  417:aconst_null     
	//  236  418:astore_1        
_L8:
		if(obj != null)
	//* 237  419:aload_1         
	//* 238  420:ifnull          427
			CloseUtil.closeQuietly(((java.io.Closeable) (obj)));
	//  239  423:aload_1         
	//  240  424:invokestatic    #121 <Method void CloseUtil.closeQuietly(java.io.Closeable)>
		close();
	//  241  427:aload_0         
	//  242  428:invokevirtual   #123 <Method void close()>
		obj = ((Object) (logger));
	//  243  431:aload_0         
	//  244  432:getfield        #60  <Field Logger logger>
	//  245  435:astore_1        
		obj2 = ((Object) (new StringBuilder()));
	//  246  436:new             #62  <Class StringBuilder>
	//  247  439:dup             
	//  248  440:invokespecial   #63  <Method void StringBuilder()>
	//  249  443:astore_2        
_L6:
		((StringBuilder) (obj2)).append(((Object) (this)));
	//  250  444:aload_2         
	//  251  445:aload_0         
	//  252  446:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//  253  449:pop             
		((StringBuilder) (obj2)).append(": connection closed");
	//  254  450:aload_2         
	//  255  451:ldc1            #127 <String ": connection closed">
	//  256  453:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//  257  456:pop             
		((Logger) (obj)).info(((StringBuilder) (obj2)).toString());
	//  258  457:aload_1         
	//  259  458:aload_2         
	//  260  459:invokevirtual   #76  <Method String StringBuilder.toString()>
	//  261  462:invokevirtual   #82  <Method void Logger.info(String)>
		return;
	//  262  465:return          
		Object obj1;
		obj1;
	//  263  466:astore_1        
		  goto _L7
	//* 264  467:goto            417
		obj1;
	//  265  470:astore_1        
		obj1 = obj4;
	//  266  471:aload_3         
	//  267  472:astore_1        
		continue; /* Loop/switch isn't completed */
	//  268  473:goto            202
		Object obj3;
		obj3;
	//  269  476:astore_2        
		  goto _L8
	//* 270  477:goto            419
		obj3;
	//  271  480:astore_2        
		if(true) goto _L10; else goto _L9
_L9:
	//* 272  481:goto            101
	}

	public void setLoggerContext(LoggerContext loggercontext)
	{
		lc = loggercontext;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #92  <Field LoggerContext lc>
		logger = loggercontext.getLogger(((Object)this).getClass().getPackage().getName());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #133 <Method Class Object.getClass()>
	//    7   11:invokevirtual   #139 <Method Package Class.getPackage()>
	//    8   14:invokevirtual   #144 <Method String Package.getName()>
	//    9   17:invokevirtual   #101 <Method Logger LoggerContext.getLogger(String)>
	//   10   20:putfield        #60  <Field Logger logger>
	//   11   23:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #62  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("client ");
	//    4    8:aload_1         
	//    5    9:ldc1            #146 <String "client ">
	//    6   11:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(id);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #23  <Field String id>
	//   11   20:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		return stringbuilder.toString();
	//   13   24:aload_1         
	//   14   25:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   15   28:areturn         
	}

	private final String id;
	private final InputStream inputStream;
	private LoggerContext lc;
	private Logger logger;
	private final Socket socket;
}
