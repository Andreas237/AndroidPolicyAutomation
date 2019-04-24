// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.tasks:
//			Task, TaskExecutors, zzu, zzv, 
//			zzx, zzw, OnCanceledListener, OnFailureListener, 
//			OnSuccessListener

public final class Tasks
{
	private static final class zza
		implements zzb
	{

		public final void await()
		{
			zzaf.await();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field CountDownLatch zzaf>
		//    2    4:invokevirtual   #28  <Method void CountDownLatch.await()>
		//    3    7:return          
		}

		public final boolean await(long l, TimeUnit timeunit)
		{
			return zzaf.await(l, timeunit);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field CountDownLatch zzaf>
		//    2    4:lload_1         
		//    3    5:aload_3         
		//    4    6:invokevirtual   #31  <Method boolean CountDownLatch.await(long, TimeUnit)>
		//    5    9:ireturn         
		}

		public final void onCanceled()
		{
			zzaf.countDown();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field CountDownLatch zzaf>
		//    2    4:invokevirtual   #35  <Method void CountDownLatch.countDown()>
		//    3    7:return          
		}

		public final void onFailure(Exception exception)
		{
			zzaf.countDown();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field CountDownLatch zzaf>
		//    2    4:invokevirtual   #35  <Method void CountDownLatch.countDown()>
		//    3    7:return          
		}

		public final void onSuccess(Object obj)
		{
			zzaf.countDown();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field CountDownLatch zzaf>
		//    2    4:invokevirtual   #35  <Method void CountDownLatch.countDown()>
		//    3    7:return          
		}

		private final CountDownLatch zzaf;

		private zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			zzaf = new CountDownLatch(1);
		//    2    4:aload_0         
		//    3    5:new             #17  <Class CountDownLatch>
		//    4    8:dup             
		//    5    9:iconst_1        
		//    6   10:invokespecial   #20  <Method void CountDownLatch(int)>
		//    7   13:putfield        #22  <Field CountDownLatch zzaf>
		//    8   16:return          
		}

		zza(zzv zzv1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Tasks$zza()>
		//    2    4:return          
		}
	}

	static interface zzb
		extends OnCanceledListener, OnFailureListener, OnSuccessListener
	{
	}

	private static final class zzc
		implements zzb
	{

		private final void zzf()
		{
			if(zzah + zzai + zzaj == zzag)
		//*   0    0:aload_0         
		//*   1    1:getfield        #42  <Field int zzah>
		//*   2    4:aload_0         
		//*   3    5:getfield        #44  <Field int zzai>
		//*   4    8:iadd            
		//*   5    9:aload_0         
		//*   6   10:getfield        #46  <Field int zzaj>
		//*   7   13:iadd            
		//*   8   14:aload_0         
		//*   9   15:getfield        #34  <Field int zzag>
		//*  10   18:icmpne          129
			{
				if(zzab != null)
		//*  11   21:aload_0         
		//*  12   22:getfield        #48  <Field Exception zzab>
		//*  13   25:ifnull          105
				{
					zzu zzu1 = zza;
		//   14   28:aload_0         
		//   15   29:getfield        #36  <Field zzu zza>
		//   16   32:astore_3        
					int i = zzai;
		//   17   33:aload_0         
		//   18   34:getfield        #44  <Field int zzai>
		//   19   37:istore_1        
					int j = zzag;
		//   20   38:aload_0         
		//   21   39:getfield        #34  <Field int zzag>
		//   22   42:istore_2        
					StringBuilder stringbuilder = new StringBuilder(54);
		//   23   43:new             #50  <Class StringBuilder>
		//   24   46:dup             
		//   25   47:bipush          54
		//   26   49:invokespecial   #53  <Method void StringBuilder(int)>
		//   27   52:astore          4
					stringbuilder.append(i);
		//   28   54:aload           4
		//   29   56:iload_1         
		//   30   57:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
		//   31   60:pop             
					stringbuilder.append(" out of ");
		//   32   61:aload           4
		//   33   63:ldc1            #59  <String " out of ">
		//   34   65:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//   35   68:pop             
					stringbuilder.append(j);
		//   36   69:aload           4
		//   37   71:iload_2         
		//   38   72:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
		//   39   75:pop             
					stringbuilder.append(" underlying tasks failed");
		//   40   76:aload           4
		//   41   78:ldc1            #64  <String " underlying tasks failed">
		//   42   80:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//   43   83:pop             
					zzu1.setException(((Exception) (new ExecutionException(stringbuilder.toString(), ((Throwable) (zzab))))));
		//   44   84:aload_3         
		//   45   85:new             #66  <Class ExecutionException>
		//   46   88:dup             
		//   47   89:aload           4
		//   48   91:invokevirtual   #70  <Method String StringBuilder.toString()>
		//   49   94:aload_0         
		//   50   95:getfield        #48  <Field Exception zzab>
		//   51   98:invokespecial   #73  <Method void ExecutionException(String, Throwable)>
		//   52  101:invokevirtual   #79  <Method void zzu.setException(Exception)>
					return;
		//   53  104:return          
				}
				if(zzak)
		//*  54  105:aload_0         
		//*  55  106:getfield        #81  <Field boolean zzak>
		//*  56  109:ifeq            121
				{
					zza.zza();
		//   57  112:aload_0         
		//   58  113:getfield        #36  <Field zzu zza>
		//   59  116:invokevirtual   #84  <Method boolean zzu.zza()>
		//   60  119:pop             
					return;
		//   61  120:return          
				}
				zza.setResult(((Object) (null)));
		//   62  121:aload_0         
		//   63  122:getfield        #36  <Field zzu zza>
		//   64  125:aconst_null     
		//   65  126:invokevirtual   #88  <Method void zzu.setResult(Object)>
			}
		//   66  129:return          
		}

		public final void onCanceled()
		{
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #32  <Field Object mLock>
		//*   2    4:astore_1        
		//*   3    5:aload_1         
		//*   4    6:monitorenter    
			{
				zzaj = zzaj + 1;
		//    5    7:aload_0         
		//    6    8:aload_0         
		//    7    9:getfield        #46  <Field int zzaj>
		//    8   12:iconst_1        
		//    9   13:iadd            
		//   10   14:putfield        #46  <Field int zzaj>
				zzak = true;
		//   11   17:aload_0         
		//   12   18:iconst_1        
		//   13   19:putfield        #81  <Field boolean zzak>
				zzf();
		//   14   22:aload_0         
		//   15   23:invokespecial   #92  <Method void zzf()>
			}
		//   16   26:aload_1         
		//   17   27:monitorexit     
			return;
		//   18   28:return          
			exception;
		//   19   29:astore_2        
			obj;
		//   20   30:aload_1         
			JVM INSTR monitorexit ;
		//   21   31:monitorexit     
			throw exception;
		//   22   32:aload_2         
		//   23   33:athrow          
		}

		public final void onFailure(Exception exception)
		{
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #32  <Field Object mLock>
		//*   2    4:astore_2        
		//*   3    5:aload_2         
		//*   4    6:monitorenter    
			{
				zzai = zzai + 1;
		//    5    7:aload_0         
		//    6    8:aload_0         
		//    7    9:getfield        #44  <Field int zzai>
		//    8   12:iconst_1        
		//    9   13:iadd            
		//   10   14:putfield        #44  <Field int zzai>
				zzab = exception;
		//   11   17:aload_0         
		//   12   18:aload_1         
		//   13   19:putfield        #48  <Field Exception zzab>
				zzf();
		//   14   22:aload_0         
		//   15   23:invokespecial   #92  <Method void zzf()>
			}
		//   16   26:aload_2         
		//   17   27:monitorexit     
			return;
		//   18   28:return          
			exception;
		//   19   29:astore_1        
			obj;
		//   20   30:aload_2         
			JVM INSTR monitorexit ;
		//   21   31:monitorexit     
			throw exception;
		//   22   32:aload_1         
		//   23   33:athrow          
		}

		public final void onSuccess(Object obj)
		{
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #32  <Field Object mLock>
		//*   2    4:astore_1        
		//*   3    5:aload_1         
		//*   4    6:monitorenter    
			{
				zzah = zzah + 1;
		//    5    7:aload_0         
		//    6    8:aload_0         
		//    7    9:getfield        #42  <Field int zzah>
		//    8   12:iconst_1        
		//    9   13:iadd            
		//   10   14:putfield        #42  <Field int zzah>
				zzf();
		//   11   17:aload_0         
		//   12   18:invokespecial   #92  <Method void zzf()>
			}
		//   13   21:aload_1         
		//   14   22:monitorexit     
			return;
		//   15   23:return          
			exception;
		//   16   24:astore_2        
			obj;
		//   17   25:aload_1         
			JVM INSTR monitorexit ;
		//   18   26:monitorexit     
			throw exception;
		//   19   27:aload_2         
		//   20   28:athrow          
		}

		private final Object mLock = new Object();
		private final zzu zza;
		private Exception zzab;
		private final int zzag;
		private int zzah;
		private int zzai;
		private int zzaj;
		private boolean zzak;

		public zzc(int i, zzu zzu1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #4   <Class Object>
		//    4    8:dup             
		//    5    9:invokespecial   #30  <Method void Object()>
		//    6   12:putfield        #32  <Field Object mLock>
			zzag = i;
		//    7   15:aload_0         
		//    8   16:iload_1         
		//    9   17:putfield        #34  <Field int zzag>
			zza = zzu1;
		//   10   20:aload_0         
		//   11   21:aload_2         
		//   12   22:putfield        #36  <Field zzu zza>
		//   13   25:return          
		}
	}


	private Tasks()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static Object await(Task task)
	{
		Preconditions.checkNotMainThread();
	//    0    0:invokestatic    #25  <Method void Preconditions.checkNotMainThread()>
		Preconditions.checkNotNull(((Object) (task)), "Task must not be null");
	//    1    3:aload_0         
	//    2    4:ldc1            #27  <String "Task must not be null">
	//    3    6:invokestatic    #31  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4    9:pop             
		if(task.isComplete())
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #37  <Method boolean Task.isComplete()>
	//*   7   14:ifeq            22
		{
			return zzb(task);
	//    8   17:aload_0         
	//    9   18:invokestatic    #39  <Method Object zzb(Task)>
	//   10   21:areturn         
		} else
		{
			zza zza1 = new zza(((zzv) (null)));
	//   11   22:new             #6   <Class Tasks$zza>
	//   12   25:dup             
	//   13   26:aconst_null     
	//   14   27:invokespecial   #42  <Method void Tasks$zza(zzv)>
	//   15   30:astore_1        
			zza(task, ((zzb) (zza1)));
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:invokestatic    #45  <Method void zza(Task, Tasks$zzb)>
			zza1.await();
	//   19   36:aload_1         
	//   20   37:invokevirtual   #47  <Method void Tasks$zza.await()>
			return zzb(task);
	//   21   40:aload_0         
	//   22   41:invokestatic    #39  <Method Object zzb(Task)>
	//   23   44:areturn         
		}
	}

	public static Object await(Task task, long l, TimeUnit timeunit)
	{
		Preconditions.checkNotMainThread();
	//    0    0:invokestatic    #25  <Method void Preconditions.checkNotMainThread()>
		Preconditions.checkNotNull(((Object) (task)), "Task must not be null");
	//    1    3:aload_0         
	//    2    4:ldc1            #27  <String "Task must not be null">
	//    3    6:invokestatic    #31  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4    9:pop             
		Preconditions.checkNotNull(((Object) (timeunit)), "TimeUnit must not be null");
	//    5   10:aload_3         
	//    6   11:ldc1            #52  <String "TimeUnit must not be null">
	//    7   13:invokestatic    #31  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    8   16:pop             
		if(task.isComplete())
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #37  <Method boolean Task.isComplete()>
	//*  11   21:ifeq            29
			return zzb(task);
	//   12   24:aload_0         
	//   13   25:invokestatic    #39  <Method Object zzb(Task)>
	//   14   28:areturn         
		zza zza1 = new zza(((zzv) (null)));
	//   15   29:new             #6   <Class Tasks$zza>
	//   16   32:dup             
	//   17   33:aconst_null     
	//   18   34:invokespecial   #42  <Method void Tasks$zza(zzv)>
	//   19   37:astore          4
		zza(task, ((zzb) (zza1)));
	//   20   39:aload_0         
	//   21   40:aload           4
	//   22   42:invokestatic    #45  <Method void zza(Task, Tasks$zzb)>
		if(!zza1.await(l, timeunit))
	//*  23   45:aload           4
	//*  24   47:lload_1         
	//*  25   48:aload_3         
	//*  26   49:invokevirtual   #55  <Method boolean Tasks$zza.await(long, TimeUnit)>
	//*  27   52:ifne            65
			throw new TimeoutException("Timed out waiting for Task");
	//   28   55:new             #57  <Class TimeoutException>
	//   29   58:dup             
	//   30   59:ldc1            #59  <String "Timed out waiting for Task">
	//   31   61:invokespecial   #62  <Method void TimeoutException(String)>
	//   32   64:athrow          
		else
			return zzb(task);
	//   33   65:aload_0         
	//   34   66:invokestatic    #39  <Method Object zzb(Task)>
	//   35   69:areturn         
	}

	public static Task call(Callable callable)
	{
		return call(TaskExecutors.MAIN_THREAD, callable);
	//    0    0:getstatic       #71  <Field Executor TaskExecutors.MAIN_THREAD>
	//    1    3:aload_0         
	//    2    4:invokestatic    #74  <Method Task call(Executor, Callable)>
	//    3    7:areturn         
	}

	public static Task call(Executor executor, Callable callable)
	{
		Preconditions.checkNotNull(((Object) (executor)), "Executor must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #77  <String "Executor must not be null">
	//    2    3:invokestatic    #31  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		Preconditions.checkNotNull(((Object) (callable)), "Callback must not be null");
	//    4    7:aload_1         
	//    5    8:ldc1            #79  <String "Callback must not be null">
	//    6   10:invokestatic    #31  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    7   13:pop             
		zzu zzu1 = new zzu();
	//    8   14:new             #81  <Class zzu>
	//    9   17:dup             
	//   10   18:invokespecial   #82  <Method void zzu()>
	//   11   21:astore_2        
		executor.execute(((Runnable) (new zzv(zzu1, callable))));
	//   12   22:aload_0         
	//   13   23:new             #84  <Class zzv>
	//   14   26:dup             
	//   15   27:aload_2         
	//   16   28:aload_1         
	//   17   29:invokespecial   #87  <Method void zzv(zzu, Callable)>
	//   18   32:invokeinterface #93  <Method void Executor.execute(Runnable)>
		return ((Task) (zzu1));
	//   19   37:aload_2         
	//   20   38:areturn         
	}

	public static Task forCanceled()
	{
		zzu zzu1 = new zzu();
	//    0    0:new             #81  <Class zzu>
	//    1    3:dup             
	//    2    4:invokespecial   #82  <Method void zzu()>
	//    3    7:astore_0        
		zzu1.zza();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #98  <Method boolean zzu.zza()>
	//    6   12:pop             
		return ((Task) (zzu1));
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public static Task forException(Exception exception)
	{
		zzu zzu1 = new zzu();
	//    0    0:new             #81  <Class zzu>
	//    1    3:dup             
	//    2    4:invokespecial   #82  <Method void zzu()>
	//    3    7:astore_1        
		zzu1.setException(exception);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #105 <Method void zzu.setException(Exception)>
		return ((Task) (zzu1));
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public static Task forResult(Object obj)
	{
		zzu zzu1 = new zzu();
	//    0    0:new             #81  <Class zzu>
	//    1    3:dup             
	//    2    4:invokespecial   #82  <Method void zzu()>
	//    3    7:astore_1        
		zzu1.setResult(obj);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #112 <Method void zzu.setResult(Object)>
		return ((Task) (zzu1));
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public static Task whenAll(Collection collection)
	{
		if(collection.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #120 <Method boolean Collection.isEmpty()>
	//*   2    6:ifeq            14
			return forResult(((Object) (null)));
	//    3    9:aconst_null     
	//    4   10:invokestatic    #122 <Method Task forResult(Object)>
	//    5   13:areturn         
		for(Iterator iterator = collection.iterator(); iterator.hasNext();)
	//*   6   14:aload_0         
	//*   7   15:invokeinterface #126 <Method Iterator Collection.iterator()>
	//*   8   20:astore_1        
	//*   9   21:aload_1         
	//*  10   22:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            52
			if((Task)iterator.next() == null)
	//*  12   30:aload_1         
	//*  13   31:invokeinterface #135 <Method Object Iterator.next()>
	//*  14   36:checkcast       #33  <Class Task>
	//*  15   39:ifnonnull       21
				throw new NullPointerException("null tasks are not accepted");
	//   16   42:new             #137 <Class NullPointerException>
	//   17   45:dup             
	//   18   46:ldc1            #139 <String "null tasks are not accepted">
	//   19   48:invokespecial   #140 <Method void NullPointerException(String)>
	//   20   51:athrow          

		zzu zzu1 = new zzu();
	//   21   52:new             #81  <Class zzu>
	//   22   55:dup             
	//   23   56:invokespecial   #82  <Method void zzu()>
	//   24   59:astore_1        
		zzc zzc1 = new zzc(collection.size(), zzu1);
	//   25   60:new             #12  <Class Tasks$zzc>
	//   26   63:dup             
	//   27   64:aload_0         
	//   28   65:invokeinterface #144 <Method int Collection.size()>
	//   29   70:aload_1         
	//   30   71:invokespecial   #147 <Method void Tasks$zzc(int, zzu)>
	//   31   74:astore_2        
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); zza((Task)((Iterator) (collection)).next(), ((zzb) (zzc1))));
	//   32   75:aload_0         
	//   33   76:invokeinterface #126 <Method Iterator Collection.iterator()>
	//   34   81:astore_0        
	//   35   82:aload_0         
	//   36   83:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//   37   88:ifeq            107
	//   38   91:aload_0         
	//   39   92:invokeinterface #135 <Method Object Iterator.next()>
	//   40   97:checkcast       #33  <Class Task>
	//   41  100:aload_2         
	//   42  101:invokestatic    #45  <Method void zza(Task, Tasks$zzb)>
	//*  43  104:goto            82
		return ((Task) (zzu1));
	//   44  107:aload_1         
	//   45  108:areturn         
	}

	public static transient Task whenAll(Task atask[])
	{
		if(atask.length == 0)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:ifne            10
			return forResult(((Object) (null)));
	//    3    5:aconst_null     
	//    4    6:invokestatic    #122 <Method Task forResult(Object)>
	//    5    9:areturn         
		else
			return whenAll(((Collection) (Arrays.asList(((Object []) (atask))))));
	//    6   10:aload_0         
	//    7   11:invokestatic    #155 <Method java.util.List Arrays.asList(Object[])>
	//    8   14:invokestatic    #157 <Method Task whenAll(Collection)>
	//    9   17:areturn         
	}

	public static Task whenAllComplete(Collection collection)
	{
		return whenAll(collection).continueWithTask(((Continuation) (new zzx(collection))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #157 <Method Task whenAll(Collection)>
	//    2    4:new             #161 <Class zzx>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #164 <Method void zzx(Collection)>
	//    6   12:invokevirtual   #168 <Method Task Task.continueWithTask(Continuation)>
	//    7   15:areturn         
	}

	public static transient Task whenAllComplete(Task atask[])
	{
		return whenAllComplete(((Collection) (Arrays.asList(((Object []) (atask))))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #155 <Method java.util.List Arrays.asList(Object[])>
	//    2    4:invokestatic    #171 <Method Task whenAllComplete(Collection)>
	//    3    7:areturn         
	}

	public static Task whenAllSuccess(Collection collection)
	{
		return whenAll(collection).continueWith(((Continuation) (new zzw(collection))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #157 <Method Task whenAll(Collection)>
	//    2    4:new             #175 <Class zzw>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #176 <Method void zzw(Collection)>
	//    6   12:invokevirtual   #179 <Method Task Task.continueWith(Continuation)>
	//    7   15:areturn         
	}

	public static transient Task whenAllSuccess(Task atask[])
	{
		return whenAllSuccess(((Collection) (Arrays.asList(((Object []) (atask))))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #155 <Method java.util.List Arrays.asList(Object[])>
	//    2    4:invokestatic    #182 <Method Task whenAllSuccess(Collection)>
	//    3    7:areturn         
	}

	private static void zza(Task task, zzb zzb1)
	{
		task.addOnSuccessListener(TaskExecutors.zzw, ((OnSuccessListener) (zzb1)));
	//    0    0:aload_0         
	//    1    1:getstatic       #186 <Field Executor TaskExecutors.zzw>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #190 <Method Task Task.addOnSuccessListener(Executor, OnSuccessListener)>
	//    4    8:pop             
		task.addOnFailureListener(TaskExecutors.zzw, ((OnFailureListener) (zzb1)));
	//    5    9:aload_0         
	//    6   10:getstatic       #186 <Field Executor TaskExecutors.zzw>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #194 <Method Task Task.addOnFailureListener(Executor, OnFailureListener)>
	//    9   17:pop             
		task.addOnCanceledListener(TaskExecutors.zzw, ((OnCanceledListener) (zzb1)));
	//   10   18:aload_0         
	//   11   19:getstatic       #186 <Field Executor TaskExecutors.zzw>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #198 <Method Task Task.addOnCanceledListener(Executor, OnCanceledListener)>
	//   14   26:pop             
	//   15   27:return          
	}

	private static Object zzb(Task task)
	{
		if(task.isSuccessful())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #202 <Method boolean Task.isSuccessful()>
	//*   2    4:ifeq            12
			return task.getResult();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #205 <Method Object Task.getResult()>
	//    5   11:areturn         
		if(task.isCanceled())
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #208 <Method boolean Task.isCanceled()>
	//*   8   16:ifeq            29
			throw new CancellationException("Task is already canceled");
	//    9   19:new             #210 <Class CancellationException>
	//   10   22:dup             
	//   11   23:ldc1            #212 <String "Task is already canceled">
	//   12   25:invokespecial   #213 <Method void CancellationException(String)>
	//   13   28:athrow          
		else
			throw new ExecutionException(((Throwable) (task.getException())));
	//   14   29:new             #215 <Class ExecutionException>
	//   15   32:dup             
	//   16   33:aload_0         
	//   17   34:invokevirtual   #219 <Method Exception Task.getException()>
	//   18   37:invokespecial   #222 <Method void ExecutionException(Throwable)>
	//   19   40:athrow          
	}
}
