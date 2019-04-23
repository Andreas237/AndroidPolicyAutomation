// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.aw;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abb, abd, abo, aaw, 
//			aax, abj, aav, abe, 
//			aau, aay, p, bwk, 
//			m, wx, wi, aat, 
//			aaz, aba, aan, aao, 
//			aap

public final class aas
{

	public static abb a(Throwable throwable)
	{
		return new abb(throwable);
	//    0    0:new             #9   <Class abb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #13  <Method void abb(Throwable)>
	//    4    8:areturn         
	}

	public static abd a(Object obj)
	{
		return new abd(obj);
	//    0    0:new             #17  <Class abd>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void abd(Object)>
	//    4    8:areturn         
	}

	public static abe a(abe abe1, long l, TimeUnit timeunit, ScheduledExecutorService scheduledexecutorservice)
	{
		abo abo1 = new abo();
	//    0    0:new             #23  <Class abo>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void abo()>
	//    3    7:astore          5
		a(((abe) (abo1)), ((Future) (abe1)));
	//    4    9:aload           5
	//    5   11:aload_0         
	//    6   12:invokestatic    #29  <Method void a(abe, Future)>
		timeunit = ((TimeUnit) (scheduledexecutorservice.schedule(((Runnable) (new aaw(abo1))), l, timeunit)));
	//    7   15:aload           4
	//    8   17:new             #31  <Class aaw>
	//    9   20:dup             
	//   10   21:aload           5
	//   11   23:invokespecial   #34  <Method void aaw(abo)>
	//   12   26:lload_1         
	//   13   27:aload_3         
	//   14   28:invokeinterface #40  <Method java.util.concurrent.ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
	//   15   33:astore_3        
		a(abe1, abo1);
	//   16   34:aload_0         
	//   17   35:aload           5
	//   18   37:invokestatic    #43  <Method void a(abe, abo)>
		abo1.a(((Runnable) (new aax(((Future) (timeunit))))), abj.b);
	//   19   40:aload           5
	//   20   42:new             #45  <Class aax>
	//   21   45:dup             
	//   22   46:aload_3         
	//   23   47:invokespecial   #48  <Method void aax(Future)>
	//   24   50:getstatic       #54  <Field Executor abj.b>
	//   25   53:invokevirtual   #57  <Method void abo.a(Runnable, Executor)>
		return ((abe) (abo1));
	//   26   56:aload           5
	//   27   58:areturn         
	}

	public static abe a(abe abe1, aan aan1, Executor executor)
	{
		abo abo1 = new abo();
	//    0    0:new             #23  <Class abo>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void abo()>
	//    3    7:astore_3        
		abe1.a(((Runnable) (new aav(abo1, aan1, abe1))), executor);
	//    4    8:aload_0         
	//    5    9:new             #60  <Class aav>
	//    6   12:dup             
	//    7   13:aload_3         
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:invokespecial   #63  <Method void aav(abo, aan, abe)>
	//   11   19:aload_2         
	//   12   20:invokeinterface #66  <Method void abe.a(Runnable, Executor)>
		a(((abe) (abo1)), ((Future) (abe1)));
	//   13   25:aload_3         
	//   14   26:aload_0         
	//   15   27:invokestatic    #29  <Method void a(abe, Future)>
		return ((abe) (abo1));
	//   16   30:aload_3         
	//   17   31:areturn         
	}

	public static abe a(abe abe1, aao aao, Executor executor)
	{
		abo abo1 = new abo();
	//    0    0:new             #23  <Class abo>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void abo()>
	//    3    7:astore_3        
		abe1.a(((Runnable) (new aau(abo1, aao, abe1))), executor);
	//    4    8:aload_0         
	//    5    9:new             #69  <Class aau>
	//    6   12:dup             
	//    7   13:aload_3         
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:invokespecial   #72  <Method void aau(abo, aao, abe)>
	//   11   19:aload_2         
	//   12   20:invokeinterface #66  <Method void abe.a(Runnable, Executor)>
		a(((abe) (abo1)), ((Future) (abe1)));
	//   13   25:aload_3         
	//   14   26:aload_0         
	//   15   27:invokestatic    #29  <Method void a(abe, Future)>
		return ((abe) (abo1));
	//   16   30:aload_3         
	//   17   31:areturn         
	}

	public static abe a(abe abe1, Class class1, aan aan1, Executor executor)
	{
		abo abo1 = new abo();
	//    0    0:new             #23  <Class abo>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void abo()>
	//    3    7:astore          4
		a(((abe) (abo1)), ((Future) (abe1)));
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:invokestatic    #29  <Method void a(abe, Future)>
		abe1.a(((Runnable) (new aay(abo1, abe1, class1, aan1, executor))), abj.b);
	//    7   15:aload_0         
	//    8   16:new             #75  <Class aay>
	//    9   19:dup             
	//   10   20:aload           4
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:invokespecial   #78  <Method void aay(abo, abe, Class, aan, Executor)>
	//   16   29:getstatic       #54  <Field Executor abj.b>
	//   17   32:invokeinterface #66  <Method void abe.a(Runnable, Executor)>
		return ((abe) (abo1));
	//   18   37:aload           4
	//   19   39:areturn         
	}

	public static Object a(Future future, Object obj)
	{
		Object obj1;
		try
		{
			obj1 = ((Object) (p.ba));
	//    0    0:getstatic       #89  <Field e p.ba>
	//    1    3:astore_2        
			obj1 = future.get(((Long)bwk.e().a(((e) (obj1)))).longValue(), TimeUnit.MILLISECONDS);
	//    2    4:aload_0         
	//    3    5:invokestatic    #95  <Method m bwk.e()>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #100 <Method Object m.a(e)>
	//    6   12:checkcast       #102 <Class Long>
	//    7   15:invokevirtual   #106 <Method long Long.longValue()>
	//    8   18:getstatic       #112 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    9   21:invokeinterface #118 <Method Object Future.get(long, TimeUnit)>
	//   10   26:astore_2        
		}
	//*  11   27:aload_2         
	//*  12   28:areturn         
	//*  13   29:astore_2        
	//*  14   30:aload_0         
	//*  15   31:iconst_1        
	//*  16   32:invokeinterface #122 <Method boolean Future.cancel(boolean)>
	//*  17   37:pop             
	//*  18   38:ldc1            #124 <String "Error waiting for future.">
	//*  19   40:aload_2         
	//*  20   41:invokestatic    #129 <Method void wx.b(String, Throwable)>
	//*  21   44:invokestatic    #135 <Method wi aw.i()>
	//*  22   47:aload_2         
	//*  23   48:ldc1            #137 <String "Futures.resolveFuture">
	//*  24   50:invokevirtual   #142 <Method void wi.b(Throwable, String)>
	//*  25   53:aload_1         
	//*  26   54:areturn         
		catch(InterruptedException interruptedexception)
	//*  27   55:astore_2        
		{
			future.cancel(true);
	//   28   56:aload_0         
	//   29   57:iconst_1        
	//   30   58:invokeinterface #122 <Method boolean Future.cancel(boolean)>
	//   31   63:pop             
			wx.c("InterruptedException caught while resolving future.", ((Throwable) (interruptedexception)));
	//   32   64:ldc1            #144 <String "InterruptedException caught while resolving future.">
	//   33   66:aload_2         
	//   34   67:invokestatic    #147 <Method void wx.c(String, Throwable)>
			Thread.currentThread().interrupt();
	//   35   70:invokestatic    #153 <Method Thread Thread.currentThread()>
	//   36   73:invokevirtual   #156 <Method void Thread.interrupt()>
			aw.i().b(((Throwable) (interruptedexception)), "Futures.resolveFuture");
	//   37   76:invokestatic    #135 <Method wi aw.i()>
	//   38   79:aload_2         
	//   39   80:ldc1            #137 <String "Futures.resolveFuture">
	//   40   82:invokevirtual   #142 <Method void wi.b(Throwable, String)>
			return obj;
	//   41   85:aload_1         
	//   42   86:areturn         
		}
		catch(Exception exception)
		{
			future.cancel(true);
			wx.b("Error waiting for future.", ((Throwable) (exception)));
			aw.i().b(((Throwable) (exception)), "Futures.resolveFuture");
			return obj;
		}
		return obj1;
	}

	public static Object a(Future future, Object obj, long l, TimeUnit timeunit)
	{
		try
		{
			timeunit = ((TimeUnit) (future.get(l, timeunit)));
	//    0    0:aload_0         
	//    1    1:lload_2         
	//    2    2:aload           4
	//    3    4:invokeinterface #118 <Method Object Future.get(long, TimeUnit)>
	//    4    9:astore          4
		}
	//*   5   11:aload           4
	//*   6   13:areturn         
	//*   7   14:astore          4
	//*   8   16:aload_0         
	//*   9   17:iconst_1        
	//*  10   18:invokeinterface #122 <Method boolean Future.cancel(boolean)>
	//*  11   23:pop             
	//*  12   24:ldc1            #124 <String "Error waiting for future.">
	//*  13   26:aload           4
	//*  14   28:invokestatic    #129 <Method void wx.b(String, Throwable)>
	//*  15   31:invokestatic    #135 <Method wi aw.i()>
	//*  16   34:aload           4
	//*  17   36:ldc1            #137 <String "Futures.resolveFuture">
	//*  18   38:invokevirtual   #142 <Method void wi.b(Throwable, String)>
	//*  19   41:aload_1         
	//*  20   42:areturn         
		// Misplaced declaration of an exception variable
		catch(TimeUnit timeunit)
	//*  21   43:astore          4
		{
			future.cancel(true);
	//   22   45:aload_0         
	//   23   46:iconst_1        
	//   24   47:invokeinterface #122 <Method boolean Future.cancel(boolean)>
	//   25   52:pop             
			wx.c("InterruptedException caught while resolving future.", ((Throwable) (timeunit)));
	//   26   53:ldc1            #144 <String "InterruptedException caught while resolving future.">
	//   27   55:aload           4
	//   28   57:invokestatic    #147 <Method void wx.c(String, Throwable)>
			Thread.currentThread().interrupt();
	//   29   60:invokestatic    #153 <Method Thread Thread.currentThread()>
	//   30   63:invokevirtual   #156 <Method void Thread.interrupt()>
			aw.i().b(((Throwable) (timeunit)), "Futures.resolveFuture");
	//   31   66:invokestatic    #135 <Method wi aw.i()>
	//   32   69:aload           4
	//   33   71:ldc1            #137 <String "Futures.resolveFuture">
	//   34   73:invokevirtual   #142 <Method void wi.b(Throwable, String)>
			return obj;
	//   35   76:aload_1         
	//   36   77:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(TimeUnit timeunit)
		{
			future.cancel(true);
			wx.b("Error waiting for future.", ((Throwable) (timeunit)));
			aw.i().b(((Throwable) (timeunit)), "Futures.resolveFuture");
			return obj;
		}
		return ((Object) (timeunit));
	}

	public static void a(abe abe1, aap aap, Executor executor)
	{
		abe1.a(((Runnable) (new aat(aap, abe1))), executor);
	//    0    0:aload_0         
	//    1    1:new             #160 <Class aat>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokespecial   #163 <Method void aat(aap, abe)>
	//    6   10:aload_2         
	//    7   11:invokeinterface #66  <Method void abe.a(Runnable, Executor)>
	//    8   16:return          
	}

	private static void a(abe abe1, abo abo1)
	{
		a(((abe) (abo1)), ((Future) (abe1)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #29  <Method void a(abe, Future)>
		abe1.a(((Runnable) (new aaz(abo1, abe1))), abj.b);
	//    3    5:aload_0         
	//    4    6:new             #165 <Class aaz>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokespecial   #168 <Method void aaz(abo, abe)>
	//    9   15:getstatic       #54  <Field Executor abj.b>
	//   10   18:invokeinterface #66  <Method void abe.a(Runnable, Executor)>
	//   11   23:return          
	}

	private static void a(abe abe1, Future future)
	{
		abe1.a(((Runnable) (new aba(abe1, future))), abj.b);
	//    0    0:aload_0         
	//    1    1:new             #170 <Class aba>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #172 <Method void aba(abe, Future)>
	//    6   10:getstatic       #54  <Field Executor abj.b>
	//    7   13:invokeinterface #66  <Method void abe.a(Runnable, Executor)>
	//    8   18:return          
	}

	static final void a(abo abo1, aan aan1, abe abe1)
	{
		if(abo1.isCancelled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #180 <Method boolean abo.isCancelled()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		try
		{
			a(aan1.a(abe1.get()), abo1);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #183 <Method Object abe.get()>
	//    7   15:invokeinterface #188 <Method abe aan.a(Object)>
	//    8   20:aload_0         
	//    9   21:invokestatic    #43  <Method void a(abe, abo)>
			return;
	//   10   24:return          
		}
	//*  11   25:astore_1        
	//*  12   26:aload_0         
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #190 <Method void abo.a(Throwable)>
	//*  15   31:return          
	//*  16   32:astore_1        
	//*  17   33:invokestatic    #153 <Method Thread Thread.currentThread()>
	//*  18   36:invokevirtual   #156 <Method void Thread.interrupt()>
	//*  19   39:aload_0         
	//*  20   40:aload_1         
	//*  21   41:invokevirtual   #190 <Method void abo.a(Throwable)>
	//*  22   44:return          
	//*  23   45:astore_1        
	//*  24   46:aload_0         
	//*  25   47:aload_1         
	//*  26   48:invokevirtual   #194 <Method Throwable ExecutionException.getCause()>
	//*  27   51:invokevirtual   #190 <Method void abo.a(Throwable)>
	//*  28   54:return          
	//*  29   55:aload_0         
	//*  30   56:iconst_1        
	//*  31   57:invokevirtual   #195 <Method boolean abo.cancel(boolean)>
	//*  32   60:pop             
	//*  33   61:return          
		// Misplaced declaration of an exception variable
		catch(aan aan1)
		{
			abo1.cancel(true);
		}
		// Misplaced declaration of an exception variable
		catch(aan aan1)
		{
			abo1.a(((ExecutionException) (aan1)).getCause());
			return;
		}
		// Misplaced declaration of an exception variable
		catch(aan aan1)
		{
			Thread.currentThread().interrupt();
			abo1.a(((Throwable) (aan1)));
			return;
		}
		// Misplaced declaration of an exception variable
		catch(aan aan1)
		{
			abo1.a(((Throwable) (aan1)));
			return;
		}
	//*  34   62:astore_1        
	//*  35   63:goto            55
	}

	static final void a(abo abo1, abe abe1, Class class1, aan aan1, Executor executor)
	{
		try
		{
			abo1.b(abe1.get());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #183 <Method Object abe.get()>
	//    3    7:invokevirtual   #197 <Method void abo.b(Object)>
			return;
	//    4   10:return          
		}
	//*   5   11:astore_1        
	//*   6   12:goto            31
	//*   7   15:astore_1        
	//*   8   16:invokestatic    #153 <Method Thread Thread.currentThread()>
	//*   9   19:invokevirtual   #156 <Method void Thread.interrupt()>
	//*  10   22:goto            31
		// Misplaced declaration of an exception variable
		catch(abe abe1)
	//*  11   25:astore_1        
		{
			abe1 = ((abe) (((ExecutionException) (abe1)).getCause()));
	//   12   26:aload_1         
	//   13   27:invokevirtual   #194 <Method Throwable ExecutionException.getCause()>
	//   14   30:astore_1        
		}
		// Misplaced declaration of an exception variable
		catch(abe abe1)
		{
			Thread.currentThread().interrupt();
		}
		// Misplaced declaration of an exception variable
		catch(abe abe1) { }
		if(class1.isInstance(((Object) (abe1))))
	//*  15   31:aload_2         
	//*  16   32:aload_1         
	//*  17   33:invokevirtual   #203 <Method boolean Class.isInstance(Object)>
	//*  18   36:ifeq            54
		{
			a(a(((abe) (a(((Object) (abe1))))), aan1, executor), abo1);
	//   19   39:aload_1         
	//   20   40:invokestatic    #205 <Method abd a(Object)>
	//   21   43:aload_3         
	//   22   44:aload           4
	//   23   46:invokestatic    #207 <Method abe a(abe, aan, Executor)>
	//   24   49:aload_0         
	//   25   50:invokestatic    #43  <Method void a(abe, abo)>
			return;
	//   26   53:return          
		} else
		{
			abo1.a(((Throwable) (abe1)));
	//   27   54:aload_0         
	//   28   55:aload_1         
	//   29   56:invokevirtual   #190 <Method void abo.a(Throwable)>
			return;
	//   30   59:return          
		}
	}
}
