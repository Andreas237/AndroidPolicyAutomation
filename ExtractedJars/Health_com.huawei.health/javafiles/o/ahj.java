// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.os.Message;
import java.util.HashMap;
import java.util.concurrent.*;

// Referenced classes of package o:
//			ahm

public class ahj
{

	private ahj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		b = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #31  <Field Context b>
		c = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #33  <Field ScheduledThreadPoolExecutor c>
		a = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #35  <Field ExecutorService a>
		h = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #37  <Field ExecutorService h>
		g = new HashMap();
	//   14   24:aload_0         
	//   15   25:new             #39  <Class HashMap>
	//   16   28:dup             
	//   17   29:invokespecial   #40  <Method void HashMap()>
	//   18   32:putfield        #42  <Field HashMap g>
		c = new ScheduledThreadPoolExecutor(15);
	//   19   35:aload_0         
	//   20   36:new             #44  <Class ScheduledThreadPoolExecutor>
	//   21   39:dup             
	//   22   40:bipush          15
	//   23   42:invokespecial   #47  <Method void ScheduledThreadPoolExecutor(int)>
	//   24   45:putfield        #33  <Field ScheduledThreadPoolExecutor c>
		a = Executors.newSingleThreadExecutor();
	//   25   48:aload_0         
	//   26   49:invokestatic    #53  <Method ExecutorService Executors.newSingleThreadExecutor()>
	//   27   52:putfield        #35  <Field ExecutorService a>
		h = ((ExecutorService) (new ThreadPoolExecutor(5, 20, 30L, TimeUnit.SECONDS, ((java.util.concurrent.BlockingQueue) (new PriorityBlockingQueue())))));
	//   28   55:aload_0         
	//   29   56:new             #55  <Class ThreadPoolExecutor>
	//   30   59:dup             
	//   31   60:iconst_5        
	//   32   61:bipush          20
	//   33   63:ldc2w           #56  <Long 30L>
	//   34   66:getstatic       #63  <Field TimeUnit TimeUnit.SECONDS>
	//   35   69:new             #65  <Class PriorityBlockingQueue>
	//   36   72:dup             
	//   37   73:invokespecial   #66  <Method void PriorityBlockingQueue()>
	//   38   76:invokespecial   #69  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue)>
	//   39   79:putfield        #37  <Field ExecutorService h>
	//   40   82:return          
	}

	public static ScheduledFuture a(Runnable runnable, int i)
	{
		if(runnable != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          20
			return c().c.schedule(runnable, i, TimeUnit.MILLISECONDS);
	//    2    4:invokestatic    #73  <Method ahj c()>
	//    3    7:getfield        #33  <Field ScheduledThreadPoolExecutor c>
	//    4   10:aload_0         
	//    5   11:iload_1         
	//    6   12:i2l             
	//    7   13:getstatic       #76  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    8   16:invokevirtual   #80  <Method ScheduledFuture ScheduledThreadPoolExecutor.schedule(Runnable, long, TimeUnit)>
	//    9   19:areturn         
		else
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
	}

	public static boolean a(Runnable runnable)
	{
		if(runnable != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          15
			return c().c.remove(runnable);
	//    2    4:invokestatic    #73  <Method ahj c()>
	//    3    7:getfield        #33  <Field ScheduledThreadPoolExecutor c>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #86  <Method boolean ScheduledThreadPoolExecutor.remove(Runnable)>
	//    6   14:ireturn         
		else
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public static Context b()
	{
		return c().b;
	//    0    0:invokestatic    #73  <Method ahj c()>
	//    1    3:getfield        #31  <Field Context b>
	//    2    6:areturn         
	}

	public static void b(Context context)
	{
		if(c().b == null)
	//*   0    0:invokestatic    #73  <Method ahj c()>
	//*   1    3:getfield        #31  <Field Context b>
	//*   2    6:ifnonnull       19
			c().b = context.getApplicationContext();
	//    3    9:invokestatic    #73  <Method ahj c()>
	//    4   12:aload_0         
	//    5   13:invokevirtual   #93  <Method Context Context.getApplicationContext()>
	//    6   16:putfield        #31  <Field Context b>
	//    7   19:return          
	}

	public static void b(Runnable runnable)
	{
		c().h.execute(runnable);
	//    0    0:invokestatic    #73  <Method ahj c()>
	//    1    3:getfield        #37  <Field ExecutorService h>
	//    2    6:aload_0         
	//    3    7:invokeinterface #99  <Method void ExecutorService.execute(Runnable)>
	//    4   12:return          
	}

	public static void b(String s, ahm ahm1)
	{
		ahm1 = ((ahm) (e));
	//    0    0:getstatic       #28  <Field Object e>
	//    1    3:astore_1        
		ahm1;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(s == null)
			break MISSING_BLOCK_LABEL_21;
	//    4    6:aload_0         
	//    5    7:ifnull          21
		c().g.remove(((Object) (s)));
	//    6   10:invokestatic    #73  <Method ahj c()>
	//    7   13:getfield        #42  <Field HashMap g>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #103 <Method Object HashMap.remove(Object)>
	//   10   20:pop             
		ahm1;
	//   11   21:aload_1         
		JVM INSTR monitorexit ;
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		s;
	//   14   24:astore_0        
	//*  15   25:aload_1         
		throw s;
	//   16   26:monitorexit     
	//   17   27:aload_0         
	//   18   28:athrow          
	}

	private static ahj c()
	{
		o/ahj;
	//    0    0:ldc1            #2   <Class ahj>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		ahj ahj1;
		if(d == null)
	//*   2    3:getstatic       #25  <Field ahj d>
	//*   3    6:ifnonnull       19
			d = new ahj();
	//    4    9:new             #2   <Class ahj>
	//    5   12:dup             
	//    6   13:invokespecial   #23  <Method void ahj()>
	//    7   16:putstatic       #25  <Field ahj d>
		ahj1 = d;
	//    8   19:getstatic       #25  <Field ahj d>
	//    9   22:astore_0        
		o/ahj;
	//   10   23:ldc1            #2   <Class ahj>
		JVM INSTR monitorexit ;
	//   11   25:monitorexit     
		return ahj1;
	//   12   26:aload_0         
	//   13   27:areturn         
		Exception exception;
		exception;
	//   14   28:astore_0        
	//*  15   29:ldc1            #2   <Class ahj>
		throw exception;
	//   16   31:monitorexit     
	//   17   32:aload_0         
	//   18   33:athrow          
	}

	public static void c(Runnable runnable)
	{
		c().c.execute(runnable);
	//    0    0:invokestatic    #73  <Method ahj c()>
	//    1    3:getfield        #33  <Field ScheduledThreadPoolExecutor c>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #104 <Method void ScheduledThreadPoolExecutor.execute(Runnable)>
	//    4   10:return          
	}

	public static void c(String s, ahm ahm1)
	{
		Object obj = e;
	//    0    0:getstatic       #28  <Field Object e>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(s == null)
			break MISSING_BLOCK_LABEL_49;
	//    4    6:aload_0         
	//    5    7:ifnull          49
		if(s.trim().length() <= 0 || ahm1 == null)
			break MISSING_BLOCK_LABEL_49;
	//    6   10:aload_0         
	//    7   11:invokevirtual   #110 <Method String String.trim()>
	//    8   14:invokevirtual   #114 <Method int String.length()>
	//    9   17:ifle            49
	//   10   20:aload_1         
	//   11   21:ifnull          49
		if(!c().g.containsKey(((Object) (s))))
	//*  12   24:invokestatic    #73  <Method ahj c()>
	//*  13   27:getfield        #42  <Field HashMap g>
	//*  14   30:aload_0         
	//*  15   31:invokevirtual   #118 <Method boolean HashMap.containsKey(Object)>
	//*  16   34:ifne            49
			c().g.put(((Object) (s)), ((Object) (ahm1)));
	//   17   37:invokestatic    #73  <Method ahj c()>
	//   18   40:getfield        #42  <Field HashMap g>
	//   19   43:aload_0         
	//   20   44:aload_1         
	//   21   45:invokevirtual   #122 <Method Object HashMap.put(Object, Object)>
	//   22   48:pop             
		obj;
	//   23   49:aload_2         
		JVM INSTR monitorexit ;
	//   24   50:monitorexit     
		return;
	//   25   51:return          
		s;
	//   26   52:astore_0        
	//*  27   53:aload_2         
		throw s;
	//   28   54:monitorexit     
	//   29   55:aload_0         
	//   30   56:athrow          
	}

	public static void d(Runnable runnable)
	{
		c().a.execute(runnable);
	//    0    0:invokestatic    #73  <Method ahj c()>
	//    1    3:getfield        #35  <Field ExecutorService a>
	//    2    6:aload_0         
	//    3    7:invokeinterface #99  <Method void ExecutorService.execute(Runnable)>
	//    4   12:return          
	}

	public static void d(String s, Message message)
	{
		Object obj = e;
	//    0    0:getstatic       #28  <Field Object e>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		s = ((String) ((ahm)c().g.get(((Object) (s)))));
	//    4    6:invokestatic    #73  <Method ahj c()>
	//    5    9:getfield        #42  <Field HashMap g>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #126 <Method Object HashMap.get(Object)>
	//    8   16:checkcast       #128 <Class ahm>
	//    9   19:astore_0        
		if(s == null)
			break MISSING_BLOCK_LABEL_31;
	//   10   20:aload_0         
	//   11   21:ifnull          31
		((ahm) (s)).b(message);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokeinterface #131 <Method void ahm.b(Message)>
		obj;
	//   15   31:aload_2         
		JVM INSTR monitorexit ;
	//   16   32:monitorexit     
		return;
	//   17   33:return          
		s;
	//   18   34:astore_0        
	//*  19   35:aload_2         
		throw s;
	//   20   36:monitorexit     
	//   21   37:aload_0         
	//   22   38:athrow          
	}

	private static ahj d = new ahj();
	private static final Object e = new Object();
	private ExecutorService a;
	private Context b;
	private ScheduledThreadPoolExecutor c;
	private HashMap g;
	private ExecutorService h;

	static 
	{
	//    0    0:new             #2   <Class ahj>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void ahj()>
	//    3    7:putstatic       #25  <Field ahj d>
	//    4   10:new             #4   <Class Object>
	//    5   13:dup             
	//    6   14:invokespecial   #26  <Method void Object()>
	//    7   17:putstatic       #28  <Field Object e>
	//*   8   20:return          
	}
}
