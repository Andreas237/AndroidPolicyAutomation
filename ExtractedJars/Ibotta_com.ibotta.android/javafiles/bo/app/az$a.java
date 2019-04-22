// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package bo.app:
//			az

class az$a
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
		Executors.newSingleThreadExecutor().invokeAll(((java.util.Collection) (Collections.singletonList(((Object) (Executors.callable(runnable1)))))), 200L, TimeUnit.MILLISECONDS);
	//  104  237:invokestatic    #120 <Method ExecutorService Executors.newSingleThreadExecutor()>
	//  105  240:aload           4
	//  106  242:invokestatic    #124 <Method java.util.concurrent.Callable Executors.callable(Runnable)>
	//  107  245:invokestatic    #130 <Method List Collections.singletonList(Object)>
	//  108  248:ldc2w           #131 <Long 200L>
	//  109  251:getstatic       #138 <Field TimeUnit TimeUnit.MILLISECONDS>
	//  110  254:invokeinterface #144 <Method List ExecutorService.invokeAll(java.util.Collection, long, TimeUnit)>
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

	private az$a(az az1)
	{
		a = az1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field az a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}

	az$a(az az1, az$1 az$1)
	{
		this(az1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void az$a(az)>
	//    3    5:return          
	}
}
