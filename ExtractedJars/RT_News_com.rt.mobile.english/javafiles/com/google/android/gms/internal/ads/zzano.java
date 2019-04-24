// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaoj, zzans, zzant, zzaoe, 
//			zzanr, zzanz, zzanq, zzanu, 
//			zznk, zzkb, zzni, zzakb, 
//			zzajm, zzanp, zzanv, zzanw, 
//			zzanj, zzanx, zzany, zzank, 
//			zzanl

public final class zzano
{

	public static zzanz zza(zzanz zzanz1, long l, TimeUnit timeunit, ScheduledExecutorService scheduledexecutorservice)
	{
		zzaoj zzaoj1 = new zzaoj();
	//    0    0:new             #9   <Class zzaoj>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void zzaoj()>
	//    3    7:astore          5
		zza(((zzanz) (zzaoj1)), ((Future) (zzanz1)));
	//    4    9:aload           5
	//    5   11:aload_0         
	//    6   12:invokestatic    #16  <Method void zza(zzanz, Future)>
		timeunit = ((TimeUnit) (scheduledexecutorservice.schedule(((Runnable) (new zzans(zzaoj1))), l, timeunit)));
	//    7   15:aload           4
	//    8   17:new             #18  <Class zzans>
	//    9   20:dup             
	//   10   21:aload           5
	//   11   23:invokespecial   #21  <Method void zzans(zzaoj)>
	//   12   26:lload_1         
	//   13   27:aload_3         
	//   14   28:invokeinterface #27  <Method java.util.concurrent.ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
	//   15   33:astore_3        
		zza(zzanz1, zzaoj1);
	//   16   34:aload_0         
	//   17   35:aload           5
	//   18   37:invokestatic    #30  <Method void zza(zzanz, zzaoj)>
		zzaoj1.zza(((Runnable) (new zzant(((Future) (timeunit))))), zzaoe.zzcvz);
	//   19   40:aload           5
	//   20   42:new             #32  <Class zzant>
	//   21   45:dup             
	//   22   46:aload_3         
	//   23   47:invokespecial   #35  <Method void zzant(Future)>
	//   24   50:getstatic       #41  <Field Executor zzaoe.zzcvz>
	//   25   53:invokevirtual   #44  <Method void zzaoj.zza(Runnable, Executor)>
		return ((zzanz) (zzaoj1));
	//   26   56:aload           5
	//   27   58:areturn         
	}

	public static zzanz zza(zzanz zzanz1, zzanj zzanj1, Executor executor)
	{
		zzaoj zzaoj1 = new zzaoj();
	//    0    0:new             #9   <Class zzaoj>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void zzaoj()>
	//    3    7:astore_3        
		zzanz1.zza(((Runnable) (new zzanr(zzaoj1, zzanj1, zzanz1))), executor);
	//    4    8:aload_0         
	//    5    9:new             #50  <Class zzanr>
	//    6   12:dup             
	//    7   13:aload_3         
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:invokespecial   #53  <Method void zzanr(zzaoj, zzanj, zzanz)>
	//   11   19:aload_2         
	//   12   20:invokeinterface #56  <Method void zzanz.zza(Runnable, Executor)>
		zza(((zzanz) (zzaoj1)), ((Future) (zzanz1)));
	//   13   25:aload_3         
	//   14   26:aload_0         
	//   15   27:invokestatic    #16  <Method void zza(zzanz, Future)>
		return ((zzanz) (zzaoj1));
	//   16   30:aload_3         
	//   17   31:areturn         
	}

	public static zzanz zza(zzanz zzanz1, zzank zzank, Executor executor)
	{
		zzaoj zzaoj1 = new zzaoj();
	//    0    0:new             #9   <Class zzaoj>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void zzaoj()>
	//    3    7:astore_3        
		zzanz1.zza(((Runnable) (new zzanq(zzaoj1, zzank, zzanz1))), executor);
	//    4    8:aload_0         
	//    5    9:new             #60  <Class zzanq>
	//    6   12:dup             
	//    7   13:aload_3         
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:invokespecial   #63  <Method void zzanq(zzaoj, zzank, zzanz)>
	//   11   19:aload_2         
	//   12   20:invokeinterface #56  <Method void zzanz.zza(Runnable, Executor)>
		zza(((zzanz) (zzaoj1)), ((Future) (zzanz1)));
	//   13   25:aload_3         
	//   14   26:aload_0         
	//   15   27:invokestatic    #16  <Method void zza(zzanz, Future)>
		return ((zzanz) (zzaoj1));
	//   16   30:aload_3         
	//   17   31:areturn         
	}

	public static zzanz zza(zzanz zzanz1, Class class1, zzanj zzanj1, Executor executor)
	{
		zzaoj zzaoj1 = new zzaoj();
	//    0    0:new             #9   <Class zzaoj>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void zzaoj()>
	//    3    7:astore          4
		zza(((zzanz) (zzaoj1)), ((Future) (zzanz1)));
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:invokestatic    #16  <Method void zza(zzanz, Future)>
		zzanz1.zza(((Runnable) (new zzanu(zzaoj1, zzanz1, class1, zzanj1, executor))), zzaoe.zzcvz);
	//    7   15:aload_0         
	//    8   16:new             #67  <Class zzanu>
	//    9   19:dup             
	//   10   20:aload           4
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:invokespecial   #70  <Method void zzanu(zzaoj, zzanz, Class, zzanj, Executor)>
	//   16   29:getstatic       #41  <Field Executor zzaoe.zzcvz>
	//   17   32:invokeinterface #56  <Method void zzanz.zza(Runnable, Executor)>
		return ((zzanz) (zzaoj1));
	//   18   37:aload           4
	//   19   39:areturn         
	}

	public static Object zza(Future future, Object obj)
	{
		Object obj1;
		obj1 = ((Object) (zznk.zzbam));
	//    0    0:getstatic       #82  <Field zzna zznk.zzbam>
	//    1    3:astore_2        
		obj1 = future.get(((Long)zzkb.zzik().zzd(((zzna) (obj1)))).longValue(), TimeUnit.MILLISECONDS);
	//    2    4:aload_0         
	//    3    5:invokestatic    #88  <Method zzni zzkb.zzik()>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #94  <Method Object zzni.zzd(zzna)>
	//    6   12:checkcast       #96  <Class Long>
	//    7   15:invokevirtual   #100 <Method long Long.longValue()>
	//    8   18:getstatic       #106 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    9   21:invokeinterface #112 <Method Object Future.get(long, TimeUnit)>
	//   10   26:astore_2        
		return obj1;
	//   11   27:aload_2         
	//   12   28:areturn         
		Object obj2;
		obj2;
	//   13   29:astore_2        
		future.cancel(true);
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:invokeinterface #116 <Method boolean Future.cancel(boolean)>
	//   17   37:pop             
		zzakb.zzb("Error waiting for future.", ((Throwable) (obj2)));
	//   18   38:ldc1            #118 <String "Error waiting for future.">
	//   19   40:aload_2         
	//   20   41:invokestatic    #124 <Method void zzakb.zzb(String, Throwable)>
		future = ((Future) (obj2));
	//   21   44:aload_2         
	//   22   45:astore_0        
_L2:
		zzbv.zzeo().zzb(((Throwable) (future)), "Futures.resolveFuture");
	//   23   46:invokestatic    #130 <Method zzajm zzbv.zzeo()>
	//   24   49:aload_0         
	//   25   50:ldc1            #132 <String "Futures.resolveFuture">
	//   26   52:invokevirtual   #137 <Method void zzajm.zzb(Throwable, String)>
		return obj;
	//   27   55:aload_1         
	//   28   56:areturn         
		obj2;
	//   29   57:astore_2        
		future.cancel(true);
	//   30   58:aload_0         
	//   31   59:iconst_1        
	//   32   60:invokeinterface #116 <Method boolean Future.cancel(boolean)>
	//   33   65:pop             
		zzakb.zzc("InterruptedException caught while resolving future.", ((Throwable) (obj2)));
	//   34   66:ldc1            #139 <String "InterruptedException caught while resolving future.">
	//   35   68:aload_2         
	//   36   69:invokestatic    #142 <Method void zzakb.zzc(String, Throwable)>
		Thread.currentThread().interrupt();
	//   37   72:invokestatic    #148 <Method Thread Thread.currentThread()>
	//   38   75:invokevirtual   #151 <Method void Thread.interrupt()>
		future = ((Future) (obj2));
	//   39   78:aload_2         
	//   40   79:astore_0        
		if(true) goto _L2; else goto _L1
	//   41   80:goto            46
_L1:
	}

	public static Object zza(Future future, Object obj, long l, TimeUnit timeunit)
	{
		timeunit = ((TimeUnit) (future.get(l, timeunit)));
	//    0    0:aload_0         
	//    1    1:lload_2         
	//    2    2:aload           4
	//    3    4:invokeinterface #112 <Method Object Future.get(long, TimeUnit)>
	//    4    9:astore          4
		return ((Object) (timeunit));
	//    5   11:aload           4
	//    6   13:areturn         
		timeunit;
	//    7   14:astore          4
		future.cancel(true);
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:invokeinterface #116 <Method boolean Future.cancel(boolean)>
	//   11   23:pop             
		zzakb.zzb("Error waiting for future.", ((Throwable) (timeunit)));
	//   12   24:ldc1            #118 <String "Error waiting for future.">
	//   13   26:aload           4
	//   14   28:invokestatic    #124 <Method void zzakb.zzb(String, Throwable)>
		future = ((Future) (timeunit));
	//   15   31:aload           4
	//   16   33:astore_0        
_L2:
		zzbv.zzeo().zza(((Throwable) (future)), "Futures.resolveFuture");
	//   17   34:invokestatic    #130 <Method zzajm zzbv.zzeo()>
	//   18   37:aload_0         
	//   19   38:ldc1            #132 <String "Futures.resolveFuture">
	//   20   40:invokevirtual   #155 <Method void zzajm.zza(Throwable, String)>
		return obj;
	//   21   43:aload_1         
	//   22   44:areturn         
		timeunit;
	//   23   45:astore          4
		future.cancel(true);
	//   24   47:aload_0         
	//   25   48:iconst_1        
	//   26   49:invokeinterface #116 <Method boolean Future.cancel(boolean)>
	//   27   54:pop             
		zzakb.zzc("InterruptedException caught while resolving future.", ((Throwable) (timeunit)));
	//   28   55:ldc1            #139 <String "InterruptedException caught while resolving future.">
	//   29   57:aload           4
	//   30   59:invokestatic    #142 <Method void zzakb.zzc(String, Throwable)>
		Thread.currentThread().interrupt();
	//   31   62:invokestatic    #148 <Method Thread Thread.currentThread()>
	//   32   65:invokevirtual   #151 <Method void Thread.interrupt()>
		future = ((Future) (timeunit));
	//   33   68:aload           4
	//   34   70:astore_0        
		if(true) goto _L2; else goto _L1
	//   35   71:goto            34
_L1:
	}

	public static void zza(zzanz zzanz1, zzanl zzanl, Executor executor)
	{
		zzanz1.zza(((Runnable) (new zzanp(zzanl, zzanz1))), executor);
	//    0    0:aload_0         
	//    1    1:new             #159 <Class zzanp>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokespecial   #162 <Method void zzanp(zzanl, zzanz)>
	//    6   10:aload_2         
	//    7   11:invokeinterface #56  <Method void zzanz.zza(Runnable, Executor)>
	//    8   16:return          
	}

	private static void zza(zzanz zzanz1, zzaoj zzaoj1)
	{
		zza(((zzanz) (zzaoj1)), ((Future) (zzanz1)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #16  <Method void zza(zzanz, Future)>
		zzanz1.zza(((Runnable) (new zzanv(zzaoj1, zzanz1))), zzaoe.zzcvz);
	//    3    5:aload_0         
	//    4    6:new             #165 <Class zzanv>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokespecial   #168 <Method void zzanv(zzaoj, zzanz)>
	//    9   15:getstatic       #41  <Field Executor zzaoe.zzcvz>
	//   10   18:invokeinterface #56  <Method void zzanz.zza(Runnable, Executor)>
	//   11   23:return          
	}

	private static void zza(zzanz zzanz1, Future future)
	{
		zzanz1.zza(((Runnable) (new zzanw(zzanz1, future))), zzaoe.zzcvz);
	//    0    0:aload_0         
	//    1    1:new             #171 <Class zzanw>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #173 <Method void zzanw(zzanz, Future)>
	//    6   10:getstatic       #41  <Field Executor zzaoe.zzcvz>
	//    7   13:invokeinterface #56  <Method void zzanz.zza(Runnable, Executor)>
	//    8   18:return          
	}

	static final void zza(zzaoj zzaoj1, zzanj zzanj1, zzanz zzanz1)
	{
		if(zzaoj1.isCancelled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #182 <Method boolean zzaoj.isCancelled()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		try
		{
			zza(zzanj1.zzc(zzanz1.get()), zzaoj1);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #185 <Method Object zzanz.get()>
	//    7   15:invokeinterface #190 <Method zzanz zzanj.zzc(Object)>
	//    8   20:aload_0         
	//    9   21:invokestatic    #30  <Method void zza(zzanz, zzaoj)>
			return;
	//   10   24:return          
		}
	//*  11   25:astore_1        
	//*  12   26:aload_0         
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #194 <Method void zzaoj.setException(Throwable)>
	//*  15   31:return          
	//*  16   32:astore_1        
	//*  17   33:invokestatic    #148 <Method Thread Thread.currentThread()>
	//*  18   36:invokevirtual   #151 <Method void Thread.interrupt()>
	//*  19   39:aload_0         
	//*  20   40:aload_1         
	//*  21   41:invokevirtual   #194 <Method void zzaoj.setException(Throwable)>
	//*  22   44:return          
	//*  23   45:astore_1        
	//*  24   46:aload_0         
	//*  25   47:aload_1         
	//*  26   48:invokevirtual   #198 <Method Throwable ExecutionException.getCause()>
	//*  27   51:invokevirtual   #194 <Method void zzaoj.setException(Throwable)>
	//*  28   54:return          
	//*  29   55:aload_0         
	//*  30   56:iconst_1        
	//*  31   57:invokevirtual   #199 <Method boolean zzaoj.cancel(boolean)>
	//*  32   60:pop             
	//*  33   61:return          
		// Misplaced declaration of an exception variable
		catch(zzanj zzanj1)
		{
			zzaoj1.cancel(true);
		}
		// Misplaced declaration of an exception variable
		catch(zzanj zzanj1)
		{
			zzaoj1.setException(((ExecutionException) (zzanj1)).getCause());
			return;
		}
		// Misplaced declaration of an exception variable
		catch(zzanj zzanj1)
		{
			Thread.currentThread().interrupt();
			zzaoj1.setException(((Throwable) (zzanj1)));
			return;
		}
		// Misplaced declaration of an exception variable
		catch(zzanj zzanj1)
		{
			zzaoj1.setException(((Throwable) (zzanj1)));
			return;
		}
	//*  34   62:astore_1        
	//*  35   63:goto            55
	}

	static final void zza(zzaoj zzaoj1, zzanz zzanz1, Class class1, zzanj zzanj1, Executor executor)
	{
		try
		{
			zzaoj1.set(zzanz1.get());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #185 <Method Object zzanz.get()>
	//    3    7:invokevirtual   #203 <Method void zzaoj.set(Object)>
			return;
	//    4   10:return          
		}
	//*   5   11:astore_1        
	//*   6   12:goto            31
	//*   7   15:astore_1        
	//*   8   16:invokestatic    #148 <Method Thread Thread.currentThread()>
	//*   9   19:invokevirtual   #151 <Method void Thread.interrupt()>
	//*  10   22:goto            31
		// Misplaced declaration of an exception variable
		catch(zzanz zzanz1)
	//*  11   25:astore_1        
		{
			zzanz1 = ((zzanz) (((ExecutionException) (zzanz1)).getCause()));
	//   12   26:aload_1         
	//   13   27:invokevirtual   #198 <Method Throwable ExecutionException.getCause()>
	//   14   30:astore_1        
		}
		// Misplaced declaration of an exception variable
		catch(zzanz zzanz1)
		{
			Thread.currentThread().interrupt();
		}
		// Misplaced declaration of an exception variable
		catch(zzanz zzanz1) { }
		if(class1.isInstance(((Object) (zzanz1))))
	//*  15   31:aload_2         
	//*  16   32:aload_1         
	//*  17   33:invokevirtual   #209 <Method boolean Class.isInstance(Object)>
	//*  18   36:ifeq            54
		{
			zza(zza(((zzanz) (zzi(((Object) (zzanz1))))), zzanj1, executor), zzaoj1);
	//   19   39:aload_1         
	//   20   40:invokestatic    #213 <Method zzany zzi(Object)>
	//   21   43:aload_3         
	//   22   44:aload           4
	//   23   46:invokestatic    #215 <Method zzanz zza(zzanz, zzanj, Executor)>
	//   24   49:aload_0         
	//   25   50:invokestatic    #30  <Method void zza(zzanz, zzaoj)>
			return;
	//   26   53:return          
		} else
		{
			zzaoj1.setException(((Throwable) (zzanz1)));
	//   27   54:aload_0         
	//   28   55:aload_1         
	//   29   56:invokevirtual   #194 <Method void zzaoj.setException(Throwable)>
			return;
	//   30   59:return          
		}
	}

	public static zzanx zzd(Throwable throwable)
	{
		return new zzanx(throwable);
	//    0    0:new             #218 <Class zzanx>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #220 <Method void zzanx(Throwable)>
	//    4    8:areturn         
	}

	public static zzany zzi(Object obj)
	{
		return new zzany(obj);
	//    0    0:new             #223 <Class zzany>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #225 <Method void zzany(Object)>
	//    4    8:areturn         
	}
}
