// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package bo.app:
//			bt

public abstract class az extends ThreadPoolExecutor
{
	class a
		implements RejectedExecutionHandler
	{

		public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadpoolexecutor)
		{
			String s;
			s = az.a();
		//    0    0:invokestatic    #28  <Method String az.a()>
		//    1    3:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
		//    2    4:new             #30  <Class StringBuilder>
		//    3    7:dup             
		//    4    8:invokespecial   #31  <Method void StringBuilder()>
		//    5   11:astore          4
			stringbuilder.append("Rejected execution on runnable: ");
		//    6   13:aload           4
		//    7   15:ldc1            #33  <String "Rejected execution on runnable: ">
		//    8   17:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//    9   20:pop             
			stringbuilder.append(((Object) (runnable)));
		//   10   21:aload           4
		//   11   23:aload_1         
		//   12   24:invokevirtual   #40  <Method StringBuilder StringBuilder.append(Object)>
		//   13   27:pop             
			stringbuilder.append(" . ID: ");
		//   14   28:aload           4
		//   15   30:ldc1            #42  <String " . ID: ">
		//   16   32:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   17   35:pop             
			stringbuilder.append(az.a(a));
		//   18   36:aload           4
		//   19   38:aload_0         
		//   20   39:getfield        #14  <Field az a>
		//   21   42:invokestatic    #45  <Method String az.a(az)>
		//   22   45:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   23   48:pop             
			AppboyLogger.d(s, stringbuilder.toString());
		//   24   49:aload_3         
		//   25   50:aload           4
		//   26   52:invokevirtual   #48  <Method String StringBuilder.toString()>
		//   27   55:invokestatic    #54  <Method int AppboyLogger.d(String, String)>
		//   28   58:pop             
			if(threadpoolexecutor.isShutdown() || threadpoolexecutor.isTerminating())
		//*  29   59:aload_2         
		//*  30   60:invokevirtual   #60  <Method boolean ThreadPoolExecutor.isShutdown()>
		//*  31   63:ifne            433
		//*  32   66:aload_2         
		//*  33   67:invokevirtual   #63  <Method boolean ThreadPoolExecutor.isTerminating()>
		//*  34   70:ifeq            76
				break MISSING_BLOCK_LABEL_433;
		//   35   73:goto            433
			s = az.b(a);
		//   36   76:aload_0         
		//   37   77:getfield        #14  <Field az a>
		//   38   80:invokestatic    #66  <Method String az.b(az)>
		//   39   83:astore_3        
			Runnable runnable1;
			if(!az.c(a).isEmpty())
		//*  40   84:aload_0         
		//*  41   85:getfield        #14  <Field az a>
		//*  42   88:invokestatic    #70  <Method List az.c(az)>
		//*  43   91:invokeinterface #75  <Method boolean List.isEmpty()>
		//*  44   96:ifne            156
			{
				Future future = (Future)az.c(a).get(0);
		//   45   99:aload_0         
		//   46  100:getfield        #14  <Field az a>
		//   47  103:invokestatic    #70  <Method List az.c(az)>
		//   48  106:iconst_0        
		//   49  107:invokeinterface #79  <Method Object List.get(int)>
		//   50  112:checkcast       #81  <Class Future>
		//   51  115:astore          4
				future.cancel(true);
		//   52  117:aload           4
		//   53  119:iconst_1        
		//   54  120:invokeinterface #85  <Method boolean Future.cancel(boolean)>
		//   55  125:pop             
				az.c(a).remove(((Object) (future)));
		//   56  126:aload_0         
		//   57  127:getfield        #14  <Field az a>
		//   58  130:invokestatic    #70  <Method List az.c(az)>
		//   59  133:aload           4
		//   60  135:invokeinterface #89  <Method boolean List.remove(Object)>
		//   61  140:pop             
				az.d(a).remove(((Object) (future)));
		//   62  141:aload_0         
		//   63  142:getfield        #14  <Field az a>
		//   64  145:invokestatic    #92  <Method Map az.d(az)>
		//   65  148:aload           4
		//   66  150:invokeinterface #97  <Method Object Map.remove(Object)>
		//   67  155:pop             
			}
			runnable1 = (Runnable)threadpoolexecutor.getQueue().poll();
		//   68  156:aload_2         
		//   69  157:invokevirtual   #101 <Method BlockingQueue ThreadPoolExecutor.getQueue()>
		//   70  160:invokeinterface #107 <Method Object BlockingQueue.poll()>
		//   71  165:checkcast       #109 <Class Runnable>
		//   72  168:astore          4
			if(runnable1 == null)
				break MISSING_BLOCK_LABEL_260;
		//   73  170:aload           4
		//   74  172:ifnull          260
			String s3 = az.a();
		//   75  175:invokestatic    #28  <Method String az.a()>
		//   76  178:astore          5
			StringBuilder stringbuilder3 = new StringBuilder();
		//   77  180:new             #30  <Class StringBuilder>
		//   78  183:dup             
		//   79  184:invokespecial   #31  <Method void StringBuilder()>
		//   80  187:astore          6
			stringbuilder3.append("Running head of queue on caller thread: ");
		//   81  189:aload           6
		//   82  191:ldc1            #111 <String "Running head of queue on caller thread: ">
		//   83  193:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   84  196:pop             
			stringbuilder3.append(((Object) (runnable1)));
		//   85  197:aload           6
		//   86  199:aload           4
		//   87  201:invokevirtual   #40  <Method StringBuilder StringBuilder.append(Object)>
		//   88  204:pop             
			stringbuilder3.append(" . ID: ");
		//   89  205:aload           6
		//   90  207:ldc1            #42  <String " . ID: ">
		//   91  209:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   92  212:pop             
			stringbuilder3.append(az.a(a));
		//   93  213:aload           6
		//   94  215:aload_0         
		//   95  216:getfield        #14  <Field az a>
		//   96  219:invokestatic    #45  <Method String az.a(az)>
		//   97  222:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   98  225:pop             
			AppboyLogger.v(s3, stringbuilder3.toString());
		//   99  226:aload           5
		//  100  228:aload           6
		//  101  230:invokevirtual   #48  <Method String StringBuilder.toString()>
		//  102  233:invokestatic    #114 <Method int AppboyLogger.v(String, String)>
		//  103  236:pop             
			Executors.newSingleThreadExecutor().invokeAll(((Collection) (Collections.singletonList(((Object) (Executors.callable(runnable1)))))), 200L, TimeUnit.MILLISECONDS);
		//  104  237:invokestatic    #120 <Method ExecutorService Executors.newSingleThreadExecutor()>
		//  105  240:aload           4
		//  106  242:invokestatic    #124 <Method java.util.concurrent.Callable Executors.callable(Runnable)>
		//  107  245:invokestatic    #130 <Method List Collections.singletonList(Object)>
		//  108  248:ldc2w           #131 <Long 200L>
		//  109  251:getstatic       #138 <Field TimeUnit TimeUnit.MILLISECONDS>
		//  110  254:invokeinterface #144 <Method List ExecutorService.invokeAll(Collection, long, TimeUnit)>
		//  111  259:pop             
			String s1 = az.a();
		//  112  260:invokestatic    #28  <Method String az.a()>
		//  113  263:astore          4
			StringBuilder stringbuilder1 = new StringBuilder();
		//  114  265:new             #30  <Class StringBuilder>
		//  115  268:dup             
		//  116  269:invokespecial   #31  <Method void StringBuilder()>
		//  117  272:astore          5
			stringbuilder1.append("Re-adding rejected task to queue: ");
		//  118  274:aload           5
		//  119  276:ldc1            #146 <String "Re-adding rejected task to queue: ">
		//  120  278:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//  121  281:pop             
			stringbuilder1.append(((Object) (runnable)));
		//  122  282:aload           5
		//  123  284:aload_1         
		//  124  285:invokevirtual   #40  <Method StringBuilder StringBuilder.append(Object)>
		//  125  288:pop             
			stringbuilder1.append(" . ID: ");
		//  126  289:aload           5
		//  127  291:ldc1            #42  <String " . ID: ">
		//  128  293:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//  129  296:pop             
			stringbuilder1.append(az.a(a));
		//  130  297:aload           5
		//  131  299:aload_0         
		//  132  300:getfield        #14  <Field az a>
		//  133  303:invokestatic    #45  <Method String az.a(az)>
		//  134  306:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//  135  309:pop             
			AppboyLogger.v(s1, stringbuilder1.toString());
		//  136  310:aload           4
		//  137  312:aload           5
		//  138  314:invokevirtual   #48  <Method String StringBuilder.toString()>
		//  139  317:invokestatic    #114 <Method int AppboyLogger.v(String, String)>
		//  140  320:pop             
			threadpoolexecutor.submit(runnable);
		//  141  321:aload_2         
		//  142  322:aload_1         
		//  143  323:invokevirtual   #150 <Method Future ThreadPoolExecutor.submit(Runnable)>
		//  144  326:pop             
			break MISSING_BLOCK_LABEL_387;
		//  145  327:goto            387
			threadpoolexecutor;
		//  146  330:astore_2        
			String s2 = az.a();
		//  147  331:invokestatic    #28  <Method String az.a()>
		//  148  334:astore          4
			StringBuilder stringbuilder2 = new StringBuilder();
		//  149  336:new             #30  <Class StringBuilder>
		//  150  339:dup             
		//  151  340:invokespecial   #31  <Method void StringBuilder()>
		//  152  343:astore          5
			stringbuilder2.append("Caught exception in rejected execution handler for incoming task: ");
		//  153  345:aload           5
		//  154  347:ldc1            #152 <String "Caught exception in rejected execution handler for incoming task: ">
		//  155  349:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//  156  352:pop             
			stringbuilder2.append(((Object) (runnable)));
		//  157  353:aload           5
		//  158  355:aload_1         
		//  159  356:invokevirtual   #40  <Method StringBuilder StringBuilder.append(Object)>
		//  160  359:pop             
			stringbuilder2.append(" . Running tasks description: ");
		//  161  360:aload           5
		//  162  362:ldc1            #154 <String " . Running tasks description: ">
		//  163  364:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//  164  367:pop             
			stringbuilder2.append(s);
		//  165  368:aload           5
		//  166  370:aload_3         
		//  167  371:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//  168  374:pop             
			AppboyLogger.d(s2, stringbuilder2.toString(), ((Throwable) (threadpoolexecutor)));
		//  169  375:aload           4
		//  170  377:aload           5
		//  171  379:invokevirtual   #48  <Method String StringBuilder.toString()>
		//  172  382:aload_2         
		//  173  383:invokestatic    #157 <Method int AppboyLogger.d(String, String, Throwable)>
		//  174  386:pop             
			if(s != null)
		//* 175  387:aload_3         
		//* 176  388:ifnull          432
			{
				runnable = ((Runnable) (a));
		//  177  391:aload_0         
		//  178  392:getfield        #14  <Field az a>
		//  179  395:astore_1        
				threadpoolexecutor = ((ThreadPoolExecutor) (new StringBuilder()));
		//  180  396:new             #30  <Class StringBuilder>
		//  181  399:dup             
		//  182  400:invokespecial   #31  <Method void StringBuilder()>
		//  183  403:astore_2        
				((StringBuilder) (threadpoolexecutor)).append("Handled rejected execution on incoming task: ");
		//  184  404:aload_2         
		//  185  405:ldc1            #159 <String "Handled rejected execution on incoming task: ">
		//  186  407:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//  187  410:pop             
				((StringBuilder) (threadpoolexecutor)).append(s);
		//  188  411:aload_2         
		//  189  412:aload_3         
		//  190  413:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//  191  416:pop             
				az.a(((az) (runnable)), new Exception(((StringBuilder) (threadpoolexecutor)).toString()));
		//  192  417:aload_1         
		//  193  418:new             #25  <Class Exception>
		//  194  421:dup             
		//  195  422:aload_2         
		//  196  423:invokevirtual   #48  <Method String StringBuilder.toString()>
		//  197  426:invokespecial   #162 <Method void Exception(String)>
		//  198  429:invokestatic    #165 <Method void az.a(az, Exception)>
			}
			return;
		//  199  432:return          
			runnable = ((Runnable) (az.a()));
		//  200  433:invokestatic    #28  <Method String az.a()>
		//  201  436:astore_1        
			threadpoolexecutor = ((ThreadPoolExecutor) (new StringBuilder()));
		//  202  437:new             #30  <Class StringBuilder>
		//  203  440:dup             
		//  204  441:invokespecial   #31  <Method void StringBuilder()>
		//  205  444:astore_2        
			((StringBuilder) (threadpoolexecutor)).append("ThreadPoolExecutor is shutdown. Dropping rejected task. ID: ");
		//  206  445:aload_2         
		//  207  446:ldc1            #167 <String "ThreadPoolExecutor is shutdown. Dropping rejected task. ID: ">
		//  208  448:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//  209  451:pop             
			((StringBuilder) (threadpoolexecutor)).append(az.a(a));
		//  210  452:aload_2         
		//  211  453:aload_0         
		//  212  454:getfield        #14  <Field az a>
		//  213  457:invokestatic    #45  <Method String az.a(az)>
		//  214  460:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//  215  463:pop             
			AppboyLogger.i(((String) (runnable)), ((StringBuilder) (threadpoolexecutor)).toString());
		//  216  464:aload_1         
		//  217  465:aload_2         
		//  218  466:invokevirtual   #48  <Method String StringBuilder.toString()>
		//  219  469:invokestatic    #170 <Method int AppboyLogger.i(String, String)>
		//  220  472:pop             
			return;
		//  221  473:return          
		}

		final az a;

		private a()
		{
			a = az.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field az a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void Object()>
		//    5    9:return          
		}

	}


	public az(String s, int i, int j, long l, TimeUnit timeunit, BlockingQueue blockingqueue)
	{
		super(i, j, l, timeunit, blockingqueue);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:lload           4
	//    4    5:aload           6
	//    5    7:aload           7
	//    6    9:invokespecial   #36  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, BlockingQueue)>
		c = ((List) (new CopyOnWriteArrayList()));
	//    7   12:aload_0         
	//    8   13:new             #38  <Class CopyOnWriteArrayList>
	//    9   16:dup             
	//   10   17:invokespecial   #40  <Method void CopyOnWriteArrayList()>
	//   11   20:putfield        #42  <Field List c>
		d = ((Map) (new HashMap()));
	//   12   23:aload_0         
	//   13   24:new             #44  <Class HashMap>
	//   14   27:dup             
	//   15   28:invokespecial   #45  <Method void HashMap()>
	//   16   31:putfield        #47  <Field Map d>
		e = s;
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:putfield        #49  <Field String e>
		setRejectedExecutionHandler(((RejectedExecutionHandler) (new a())));
	//   20   39:aload_0         
	//   21   40:new             #8   <Class az$a>
	//   22   43:dup             
	//   23   44:aload_0         
	//   24   45:aconst_null     
	//   25   46:invokespecial   #52  <Method void az$a(az, az$1)>
	//   26   49:invokevirtual   #56  <Method void setRejectedExecutionHandler(RejectedExecutionHandler)>
	//   27   52:return          
	}

	public az(String s, int i, int j, long l, TimeUnit timeunit, BlockingQueue blockingqueue, 
			ThreadFactory threadfactory)
	{
		super(i, j, l, timeunit, blockingqueue, threadfactory);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:lload           4
	//    4    5:aload           6
	//    5    7:aload           7
	//    6    9:aload           8
	//    7   11:invokespecial   #62  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, BlockingQueue, ThreadFactory)>
		c = ((List) (new CopyOnWriteArrayList()));
	//    8   14:aload_0         
	//    9   15:new             #38  <Class CopyOnWriteArrayList>
	//   10   18:dup             
	//   11   19:invokespecial   #40  <Method void CopyOnWriteArrayList()>
	//   12   22:putfield        #42  <Field List c>
		d = ((Map) (new HashMap()));
	//   13   25:aload_0         
	//   14   26:new             #44  <Class HashMap>
	//   15   29:dup             
	//   16   30:invokespecial   #45  <Method void HashMap()>
	//   17   33:putfield        #47  <Field Map d>
		e = s;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #49  <Field String e>
		setRejectedExecutionHandler(((RejectedExecutionHandler) (new a())));
	//   21   41:aload_0         
	//   22   42:new             #8   <Class az$a>
	//   23   45:dup             
	//   24   46:aload_0         
	//   25   47:aconst_null     
	//   26   48:invokespecial   #52  <Method void az$a(az, az$1)>
	//   27   51:invokevirtual   #56  <Method void setRejectedExecutionHandler(RejectedExecutionHandler)>
	//   28   54:return          
	}

	static String a()
	{
		return a;
	//    0    0:getstatic       #30  <Field String a>
	//    1    3:areturn         
	}

	static String a(az az1)
	{
		return az1.e;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String e>
	//    2    4:areturn         
	}

	private static String a(StackTraceElement astacktraceelement[])
	{
		if(astacktraceelement.length == 0)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:ifne            8
			return "";
	//    3    5:ldc1            #69  <String "">
	//    4    7:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//    5    8:new             #71  <Class StringBuilder>
	//    6   11:dup             
	//    7   12:invokespecial   #72  <Method void StringBuilder()>
	//    8   15:astore_3        
		int j = astacktraceelement.length;
	//    9   16:aload_0         
	//   10   17:arraylength     
	//   11   18:istore_2        
		for(int i = 0; i < j; i++)
	//*  12   19:iconst_0        
	//*  13   20:istore_1        
	//*  14   21:iload_1         
	//*  15   22:iload_2         
	//*  16   23:icmpge          52
		{
			StackTraceElement stacktraceelement = astacktraceelement[i];
	//   17   26:aload_0         
	//   18   27:iload_1         
	//   19   28:aaload          
	//   20   29:astore          4
			stringbuilder.append("\nat ");
	//   21   31:aload_3         
	//   22   32:ldc1            #74  <String "\nat ">
	//   23   34:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   24   37:pop             
			stringbuilder.append(((Object) (stacktraceelement)));
	//   25   38:aload_3         
	//   26   39:aload           4
	//   27   41:invokevirtual   #81  <Method StringBuilder StringBuilder.append(Object)>
	//   28   44:pop             
		}

	//   29   45:iload_1         
	//   30   46:iconst_1        
	//   31   47:iadd            
	//   32   48:istore_1        
	//*  33   49:goto            21
		return stringbuilder.toString();
	//   34   52:aload_3         
	//   35   53:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   36   56:areturn         
	}

	static void a(az az1, Exception exception)
	{
		az1.a(exception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #89  <Method void a(Exception)>
	//    3    5:return          
	}

	private void a(Exception exception)
	{
		Object obj = ((Object) (a));
	//    0    0:getstatic       #30  <Field String a>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #71  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #72  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Attempting to publish exception. ID: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #91  <String "Attempting to publish exception. ID: ">
	//    8   15:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(e);
	//   10   19:aload_3         
	//   11   20:aload_0         
	//   12   21:getfield        #49  <Field String e>
	//   13   24:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		AppboyLogger.e(((String) (obj)), stringbuilder.toString(), ((Throwable) (exception)));
	//   15   28:aload_2         
	//   16   29:aload_3         
	//   17   30:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   18   33:aload_1         
	//   19   34:invokestatic    #94  <Method int AppboyLogger.e(String, String, Throwable)>
	//   20   37:pop             
		obj = ((Object) (b));
	//   21   38:aload_0         
	//   22   39:getfield        #96  <Field bt b>
	//   23   42:astore_2        
		if(obj != null)
	//*  24   43:aload_2         
	//*  25   44:ifnull          54
			((bt) (obj)).b(((Throwable) (exception)));
	//   26   47:aload_2         
	//   27   48:aload_1         
	//   28   49:invokeinterface #101 <Method void bt.b(Throwable)>
	//   29   54:return          
	}

	private String b()
	{
		if(c.size() == getActiveCount())
			break MISSING_BLOCK_LABEL_92;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field List c>
	//    2    4:invokeinterface #109 <Method int List.size()>
	//    3    9:aload_0         
	//    4   10:invokevirtual   #112 <Method int getActiveCount()>
	//    5   13:icmpeq          92
		String s = a;
	//    6   16:getstatic       #30  <Field String a>
	//    7   19:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    8   20:new             #71  <Class StringBuilder>
	//    9   23:dup             
	//   10   24:invokespecial   #72  <Method void StringBuilder()>
	//   11   27:astore_2        
		stringbuilder.append("Running task count does not match ThreadPoolExecutor active count. Returning null description.  runningTasks.size(): ");
	//   12   28:aload_2         
	//   13   29:ldc1            #114 <String "Running task count does not match ThreadPoolExecutor active count. Returning null description.  runningTasks.size(): ">
	//   14   31:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   15   34:pop             
		stringbuilder.append(c.size());
	//   16   35:aload_2         
	//   17   36:aload_0         
	//   18   37:getfield        #42  <Field List c>
	//   19   40:invokeinterface #109 <Method int List.size()>
	//   20   45:invokevirtual   #117 <Method StringBuilder StringBuilder.append(int)>
	//   21   48:pop             
		stringbuilder.append(" getActiveCount(): ");
	//   22   49:aload_2         
	//   23   50:ldc1            #119 <String " getActiveCount(): ">
	//   24   52:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   25   55:pop             
		stringbuilder.append(getActiveCount());
	//   26   56:aload_2         
	//   27   57:aload_0         
	//   28   58:invokevirtual   #112 <Method int getActiveCount()>
	//   29   61:invokevirtual   #117 <Method StringBuilder StringBuilder.append(int)>
	//   30   64:pop             
		stringbuilder.append(" ID: ");
	//   31   65:aload_2         
	//   32   66:ldc1            #121 <String " ID: ">
	//   33   68:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   34   71:pop             
		stringbuilder.append(e);
	//   35   72:aload_2         
	//   36   73:aload_0         
	//   37   74:getfield        #49  <Field String e>
	//   38   77:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   39   80:pop             
		AppboyLogger.d(s, stringbuilder.toString());
	//   40   81:aload_1         
	//   41   82:aload_2         
	//   42   83:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   43   86:invokestatic    #124 <Method int AppboyLogger.d(String, String)>
	//   44   89:pop             
		return null;
	//   45   90:aconst_null     
	//   46   91:areturn         
		Object obj;
		Iterator iterator;
		obj = ((Object) (new StringBuilder(1024)));
	//   47   92:new             #71  <Class StringBuilder>
	//   48   95:dup             
	//   49   96:sipush          1024
	//   50   99:invokespecial   #127 <Method void StringBuilder(int)>
	//   51  102:astore_1        
		((StringBuilder) (obj)).append("There are ");
	//   52  103:aload_1         
	//   53  104:ldc1            #129 <String "There are ">
	//   54  106:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   55  109:pop             
		((StringBuilder) (obj)).append(c.size());
	//   56  110:aload_1         
	//   57  111:aload_0         
	//   58  112:getfield        #42  <Field List c>
	//   59  115:invokeinterface #109 <Method int List.size()>
	//   60  120:invokevirtual   #117 <Method StringBuilder StringBuilder.append(int)>
	//   61  123:pop             
		((StringBuilder) (obj)).append(" known running tasks. Active thread dumps: [\n");
	//   62  124:aload_1         
	//   63  125:ldc1            #131 <String " known running tasks. Active thread dumps: [\n">
	//   64  127:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   65  130:pop             
		iterator = d.values().iterator();
	//   66  131:aload_0         
	//   67  132:getfield        #47  <Field Map d>
	//   68  135:invokeinterface #137 <Method Collection Map.values()>
	//   69  140:invokeinterface #143 <Method Iterator Collection.iterator()>
	//   70  145:astore_2        
_L1:
		Thread thread;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_252;
	//   71  146:aload_2         
	//   72  147:invokeinterface #149 <Method boolean Iterator.hasNext()>
	//   73  152:ifeq            252
		thread = (Thread)iterator.next();
	//   74  155:aload_2         
	//   75  156:invokeinterface #153 <Method Object Iterator.next()>
	//   76  161:checkcast       #155 <Class Thread>
	//   77  164:astore_3        
		try
		{
			((StringBuilder) (obj)).append(a(thread.getStackTrace()));
	//   78  165:aload_1         
	//   79  166:aload_3         
	//   80  167:invokevirtual   #159 <Method StackTraceElement[] Thread.getStackTrace()>
	//   81  170:invokestatic    #161 <Method String a(StackTraceElement[])>
	//   82  173:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   83  176:pop             
			((StringBuilder) (obj)).append("\n,");
	//   84  177:aload_1         
	//   85  178:ldc1            #163 <String "\n,">
	//   86  180:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   87  183:pop             
		}
	//*  88  184:goto            146
		catch(Exception exception1)
	//*  89  187:astore          4
		{
			try
			{
				String s2 = a;
	//   90  189:getstatic       #30  <Field String a>
	//   91  192:astore          5
				StringBuilder stringbuilder2 = new StringBuilder();
	//   92  194:new             #71  <Class StringBuilder>
	//   93  197:dup             
	//   94  198:invokespecial   #72  <Method void StringBuilder()>
	//   95  201:astore          6
				stringbuilder2.append("Failed to create description for active thread: ");
	//   96  203:aload           6
	//   97  205:ldc1            #165 <String "Failed to create description for active thread: ">
	//   98  207:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   99  210:pop             
				stringbuilder2.append(((Object) (thread)));
	//  100  211:aload           6
	//  101  213:aload_3         
	//  102  214:invokevirtual   #81  <Method StringBuilder StringBuilder.append(Object)>
	//  103  217:pop             
				stringbuilder2.append(" ID: ");
	//  104  218:aload           6
	//  105  220:ldc1            #121 <String " ID: ">
	//  106  222:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//  107  225:pop             
				stringbuilder2.append(e);
	//  108  226:aload           6
	//  109  228:aload_0         
	//  110  229:getfield        #49  <Field String e>
	//  111  232:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//  112  235:pop             
				AppboyLogger.e(s2, stringbuilder2.toString(), ((Throwable) (exception1)));
	//  113  236:aload           5
	//  114  238:aload           6
	//  115  240:invokevirtual   #84  <Method String StringBuilder.toString()>
	//  116  243:aload           4
	//  117  245:invokestatic    #94  <Method int AppboyLogger.e(String, String, Throwable)>
	//  118  248:pop             
			}
	//* 119  249:goto            146
	//* 120  252:aload_1         
	//* 121  253:ldc1            #167 <String "]\nExecutor ID: ">
	//* 122  255:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//* 123  258:pop             
	//* 124  259:aload_1         
	//* 125  260:aload_0         
	//* 126  261:getfield        #49  <Field String e>
	//* 127  264:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//* 128  267:pop             
	//* 129  268:aload_1         
	//* 130  269:ldc1            #169 <String " state: ">
	//* 131  271:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//* 132  274:pop             
	//* 133  275:aload_1         
	//* 134  276:aload_0         
	//* 135  277:invokevirtual   #170 <Method String toString()>
	//* 136  280:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//* 137  283:pop             
	//* 138  284:aload_1         
	//* 139  285:invokevirtual   #84  <Method String StringBuilder.toString()>
	//* 140  288:astore_1        
	//* 141  289:aload_1         
	//* 142  290:areturn         
			catch(Exception exception)
	//* 143  291:astore_1        
			{
				String s1 = a;
	//  144  292:getstatic       #30  <Field String a>
	//  145  295:astore_2        
				StringBuilder stringbuilder1 = new StringBuilder();
	//  146  296:new             #71  <Class StringBuilder>
	//  147  299:dup             
	//  148  300:invokespecial   #72  <Method void StringBuilder()>
	//  149  303:astore_3        
				stringbuilder1.append("Failed to create running tasks description. ID: ");
	//  150  304:aload_3         
	//  151  305:ldc1            #172 <String "Failed to create running tasks description. ID: ">
	//  152  307:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//  153  310:pop             
				stringbuilder1.append(e);
	//  154  311:aload_3         
	//  155  312:aload_0         
	//  156  313:getfield        #49  <Field String e>
	//  157  316:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//  158  319:pop             
				AppboyLogger.e(s1, stringbuilder1.toString(), ((Throwable) (exception)));
	//  159  320:aload_2         
	//  160  321:aload_3         
	//  161  322:invokevirtual   #84  <Method String StringBuilder.toString()>
	//  162  325:aload_1         
	//  163  326:invokestatic    #94  <Method int AppboyLogger.e(String, String, Throwable)>
	//  164  329:pop             
				return null;
	//  165  330:aconst_null     
	//  166  331:areturn         
			}
		}
		  goto _L1
		((StringBuilder) (obj)).append("]\nExecutor ID: ");
		((StringBuilder) (obj)).append(e);
		((StringBuilder) (obj)).append(" state: ");
		((StringBuilder) (obj)).append(toString());
		obj = ((Object) (((StringBuilder) (obj)).toString()));
		return ((String) (obj));
	}

	static String b(az az1)
	{
		return az1.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #174 <Method String b()>
	//    2    4:areturn         
	}

	static List c(az az1)
	{
		return az1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field List c>
	//    2    4:areturn         
	}

	static Map d(az az1)
	{
		return az1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Map d>
	//    2    4:areturn         
	}

	public void a(bt bt1)
	{
		b = bt1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #96  <Field bt b>
	//    3    5:return          
	}

	protected void afterExecute(Runnable runnable, Throwable throwable)
	{
		if(runnable instanceof Future)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #181 <Class Future>
	//*   2    4:ifeq            29
		{
			c.remove(((Object) (runnable)));
	//    3    7:aload_0         
	//    4    8:getfield        #42  <Field List c>
	//    5   11:aload_1         
	//    6   12:invokeinterface #185 <Method boolean List.remove(Object)>
	//    7   17:pop             
			d.remove(((Object) (runnable)));
	//    8   18:aload_0         
	//    9   19:getfield        #47  <Field Map d>
	//   10   22:aload_1         
	//   11   23:invokeinterface #188 <Method Object Map.remove(Object)>
	//   12   28:pop             
		}
		super.afterExecute(runnable, throwable);
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:aload_2         
	//   16   32:invokespecial   #190 <Method void ThreadPoolExecutor.afterExecute(Runnable, Throwable)>
	//   17   35:return          
	}

	protected void beforeExecute(Thread thread, Runnable runnable)
	{
		if(runnable instanceof Future)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #181 <Class Future>
	//*   2    4:ifeq            35
		{
			Future future = (Future)runnable;
	//    3    7:aload_2         
	//    4    8:checkcast       #181 <Class Future>
	//    5   11:astore_3        
			c.add(((Object) (future)));
	//    6   12:aload_0         
	//    7   13:getfield        #42  <Field List c>
	//    8   16:aload_3         
	//    9   17:invokeinterface #195 <Method boolean List.add(Object)>
	//   10   22:pop             
			d.put(((Object) (future)), ((Object) (thread)));
	//   11   23:aload_0         
	//   12   24:getfield        #47  <Field Map d>
	//   13   27:aload_3         
	//   14   28:aload_1         
	//   15   29:invokeinterface #199 <Method Object Map.put(Object, Object)>
	//   16   34:pop             
		}
		super.beforeExecute(thread, runnable);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:invokespecial   #201 <Method void ThreadPoolExecutor.beforeExecute(Thread, Runnable)>
	//   21   41:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/az);
	private bt b;
	private List c;
	private Map d;
	private String e;

	static 
	{
	//    0    0:ldc1            #2   <Class az>
	//    1    2:invokestatic    #28  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #30  <Field String a>
	//*   3    8:return          
	}
}
