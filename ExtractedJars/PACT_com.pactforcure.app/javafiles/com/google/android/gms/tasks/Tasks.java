// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.zzac;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.tasks:
//			Task, TaskExecutors, zzh, OnFailureListener, 
//			OnSuccessListener

public final class Tasks
{
	private static final class zza
		implements zzb
	{

		public void await()
			throws InterruptedException
		{
			zzth.await();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field CountDownLatch zzth>
		//    2    4:invokevirtual   #30  <Method void CountDownLatch.await()>
		//    3    7:return          
		}

		public boolean await(long l, TimeUnit timeunit)
			throws InterruptedException
		{
			return zzth.await(l, timeunit);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field CountDownLatch zzth>
		//    2    4:lload_1         
		//    3    5:aload_3         
		//    4    6:invokevirtual   #34  <Method boolean CountDownLatch.await(long, TimeUnit)>
		//    5    9:ireturn         
		}

		public void onFailure(Exception exception)
		{
			zzth.countDown();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field CountDownLatch zzth>
		//    2    4:invokevirtual   #40  <Method void CountDownLatch.countDown()>
		//    3    7:return          
		}

		public void onSuccess(Object obj)
		{
			zzth.countDown();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field CountDownLatch zzth>
		//    2    4:invokevirtual   #40  <Method void CountDownLatch.countDown()>
		//    3    7:return          
		}

		private final CountDownLatch zzth;

		private zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			zzth = new CountDownLatch(1);
		//    2    4:aload_0         
		//    3    5:new             #17  <Class CountDownLatch>
		//    4    8:dup             
		//    5    9:iconst_1        
		//    6   10:invokespecial   #20  <Method void CountDownLatch(int)>
		//    7   13:putfield        #22  <Field CountDownLatch zzth>
		//    8   16:return          
		}

	}

	static interface zzb
		extends OnFailureListener, OnSuccessListener
	{
	}

	private static final class zzc
		implements zzb
	{

		private void zzSh()
		{
label0:
			{
				if(zzbLN + zzbLO == zzbLM)
		//*   0    0:aload_0         
		//*   1    1:getfield        #37  <Field int zzbLN>
		//*   2    4:aload_0         
		//*   3    5:getfield        #39  <Field int zzbLO>
		//*   4    8:iadd            
		//*   5    9:aload_0         
		//*   6   10:getfield        #29  <Field int zzbLM>
		//*   7   13:icmpne          31
				{
					if(zzbLK != null)
						break label0;
		//    8   16:aload_0         
		//    9   17:getfield        #41  <Field Exception zzbLK>
		//   10   20:ifnonnull       32
					zzbLF.setResult(((Object) (null)));
		//   11   23:aload_0         
		//   12   24:getfield        #31  <Field zzh zzbLF>
		//   13   27:aconst_null     
		//   14   28:invokevirtual   #47  <Method void zzh.setResult(Object)>
				}
				return;
		//   15   31:return          
			}
			zzh zzh1 = zzbLF;
		//   16   32:aload_0         
		//   17   33:getfield        #31  <Field zzh zzbLF>
		//   18   36:astore_3        
			int i = zzbLO;
		//   19   37:aload_0         
		//   20   38:getfield        #39  <Field int zzbLO>
		//   21   41:istore_1        
			int j = zzbLM;
		//   22   42:aload_0         
		//   23   43:getfield        #29  <Field int zzbLM>
		//   24   46:istore_2        
			zzh1.setException(((Exception) (new ExecutionException((new StringBuilder(54)).append(i).append(" out of ").append(j).append(" underlying tasks failed").toString(), ((Throwable) (zzbLK))))));
		//   25   47:aload_3         
		//   26   48:new             #49  <Class ExecutionException>
		//   27   51:dup             
		//   28   52:new             #51  <Class StringBuilder>
		//   29   55:dup             
		//   30   56:bipush          54
		//   31   58:invokespecial   #54  <Method void StringBuilder(int)>
		//   32   61:iload_1         
		//   33   62:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
		//   34   65:ldc1            #60  <String " out of ">
		//   35   67:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
		//   36   70:iload_2         
		//   37   71:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
		//   38   74:ldc1            #65  <String " underlying tasks failed">
		//   39   76:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
		//   40   79:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   41   82:aload_0         
		//   42   83:getfield        #41  <Field Exception zzbLK>
		//   43   86:invokespecial   #72  <Method void ExecutionException(String, Throwable)>
		//   44   89:invokevirtual   #76  <Method void zzh.setException(Exception)>
		//   45   92:return          
		}

		public void onFailure(Exception exception)
		{
			synchronized(zzrN)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field Object zzrN>
		//*   2    4:astore_2        
		//*   3    5:aload_2         
		//*   4    6:monitorenter    
			{
				zzbLO = zzbLO + 1;
		//    5    7:aload_0         
		//    6    8:aload_0         
		//    7    9:getfield        #39  <Field int zzbLO>
		//    8   12:iconst_1        
		//    9   13:iadd            
		//   10   14:putfield        #39  <Field int zzbLO>
				zzbLK = exception;
		//   11   17:aload_0         
		//   12   18:aload_1         
		//   13   19:putfield        #41  <Field Exception zzbLK>
				zzSh();
		//   14   22:aload_0         
		//   15   23:invokespecial   #80  <Method void zzSh()>
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

		public void onSuccess(Object obj)
		{
			synchronized(zzrN)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field Object zzrN>
		//*   2    4:astore_1        
		//*   3    5:aload_1         
		//*   4    6:monitorenter    
			{
				zzbLN = zzbLN + 1;
		//    5    7:aload_0         
		//    6    8:aload_0         
		//    7    9:getfield        #37  <Field int zzbLN>
		//    8   12:iconst_1        
		//    9   13:iadd            
		//   10   14:putfield        #37  <Field int zzbLN>
				zzSh();
		//   11   17:aload_0         
		//   12   18:invokespecial   #80  <Method void zzSh()>
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

		private final zzh zzbLF;
		private Exception zzbLK;
		private final int zzbLM;
		private int zzbLN;
		private int zzbLO;
		private final Object zzrN = new Object();

		public zzc(int i, zzh zzh1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #4   <Class Object>
		//    4    8:dup             
		//    5    9:invokespecial   #25  <Method void Object()>
		//    6   12:putfield        #27  <Field Object zzrN>
			zzbLM = i;
		//    7   15:aload_0         
		//    8   16:iload_1         
		//    9   17:putfield        #29  <Field int zzbLM>
			zzbLF = zzh1;
		//   10   20:aload_0         
		//   11   21:aload_2         
		//   12   22:putfield        #31  <Field zzh zzbLF>
		//   13   25:return          
		}
	}


	private Tasks()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public static Object await(Task task)
		throws ExecutionException, InterruptedException
	{
		zzac.zzxx();
	//    0    0:invokestatic    #32  <Method void zzac.zzxx()>
		zzac.zzb(((Object) (task)), "Task must not be null");
	//    1    3:aload_0         
	//    2    4:ldc1            #34  <String "Task must not be null">
	//    3    6:invokestatic    #37  <Method Object zzac.zzb(Object, Object)>
	//    4    9:pop             
		if(task.isComplete())
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #43  <Method boolean Task.isComplete()>
	//*   7   14:ifeq            22
		{
			return zzb(task);
	//    8   17:aload_0         
	//    9   18:invokestatic    #45  <Method Object zzb(Task)>
	//   10   21:areturn         
		} else
		{
			zza zza1 = new zza();
	//   11   22:new             #8   <Class Tasks$zza>
	//   12   25:dup             
	//   13   26:aconst_null     
	//   14   27:invokespecial   #48  <Method void Tasks$zza(Tasks$1)>
	//   15   30:astore_1        
			zza(task, ((zzb) (zza1)));
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:invokestatic    #51  <Method void zza(Task, Tasks$zzb)>
			zza1.await();
	//   19   36:aload_1         
	//   20   37:invokevirtual   #53  <Method void Tasks$zza.await()>
			return zzb(task);
	//   21   40:aload_0         
	//   22   41:invokestatic    #45  <Method Object zzb(Task)>
	//   23   44:areturn         
		}
	}

	public static Object await(Task task, long l, TimeUnit timeunit)
		throws ExecutionException, InterruptedException, TimeoutException
	{
		zzac.zzxx();
	//    0    0:invokestatic    #32  <Method void zzac.zzxx()>
		zzac.zzb(((Object) (task)), "Task must not be null");
	//    1    3:aload_0         
	//    2    4:ldc1            #34  <String "Task must not be null">
	//    3    6:invokestatic    #37  <Method Object zzac.zzb(Object, Object)>
	//    4    9:pop             
		zzac.zzb(((Object) (timeunit)), "TimeUnit must not be null");
	//    5   10:aload_3         
	//    6   11:ldc1            #62  <String "TimeUnit must not be null">
	//    7   13:invokestatic    #37  <Method Object zzac.zzb(Object, Object)>
	//    8   16:pop             
		if(task.isComplete())
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #43  <Method boolean Task.isComplete()>
	//*  11   21:ifeq            29
			return zzb(task);
	//   12   24:aload_0         
	//   13   25:invokestatic    #45  <Method Object zzb(Task)>
	//   14   28:areturn         
		zza zza1 = new zza();
	//   15   29:new             #8   <Class Tasks$zza>
	//   16   32:dup             
	//   17   33:aconst_null     
	//   18   34:invokespecial   #48  <Method void Tasks$zza(Tasks$1)>
	//   19   37:astore          4
		zza(task, ((zzb) (zza1)));
	//   20   39:aload_0         
	//   21   40:aload           4
	//   22   42:invokestatic    #51  <Method void zza(Task, Tasks$zzb)>
		if(!zza1.await(l, timeunit))
	//*  23   45:aload           4
	//*  24   47:lload_1         
	//*  25   48:aload_3         
	//*  26   49:invokevirtual   #65  <Method boolean Tasks$zza.await(long, TimeUnit)>
	//*  27   52:ifne            65
			throw new TimeoutException("Timed out waiting for Task");
	//   28   55:new             #60  <Class TimeoutException>
	//   29   58:dup             
	//   30   59:ldc1            #67  <String "Timed out waiting for Task">
	//   31   61:invokespecial   #70  <Method void TimeoutException(String)>
	//   32   64:athrow          
		else
			return zzb(task);
	//   33   65:aload_0         
	//   34   66:invokestatic    #45  <Method Object zzb(Task)>
	//   35   69:areturn         
	}

	public static Task call(Callable callable)
	{
		return call(TaskExecutors.MAIN_THREAD, callable);
	//    0    0:getstatic       #79  <Field Executor TaskExecutors.MAIN_THREAD>
	//    1    3:aload_0         
	//    2    4:invokestatic    #82  <Method Task call(Executor, Callable)>
	//    3    7:areturn         
	}

	public static Task call(Executor executor, Callable callable)
	{
		zzac.zzb(((Object) (executor)), "Executor must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #85  <String "Executor must not be null">
	//    2    3:invokestatic    #37  <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		zzac.zzb(((Object) (callable)), "Callback must not be null");
	//    4    7:aload_1         
	//    5    8:ldc1            #87  <String "Callback must not be null">
	//    6   10:invokestatic    #37  <Method Object zzac.zzb(Object, Object)>
	//    7   13:pop             
		zzh zzh1 = new zzh();
	//    8   14:new             #89  <Class zzh>
	//    9   17:dup             
	//   10   18:invokespecial   #90  <Method void zzh()>
	//   11   21:astore_2        
		executor.execute(new Runnable(zzh1, callable) {

			public void run()
			{
				try
				{
					zzbLL.setResult(zzWN.call());
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field zzh zzbLL>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field Callable zzWN>
			//    4    8:invokeinterface #33  <Method Object Callable.call()>
			//    5   13:invokevirtual   #39  <Method void zzh.setResult(Object)>
					return;
			//    6   16:return          
				}
				catch(Exception exception)
			//*   7   17:astore_1        
				{
					zzbLL.setException(exception);
			//    8   18:aload_0         
			//    9   19:getfield        #19  <Field zzh zzbLL>
			//   10   22:aload_1         
			//   11   23:invokevirtual   #43  <Method void zzh.setException(Exception)>
				}
			//   12   26:return          
			}

			final Callable zzWN;
			final zzh zzbLL;

			
			{
				zzbLL = zzh1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field zzh zzbLL>
				zzWN = callable;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Callable zzWN>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   12   22:aload_0         
	//   13   23:new             #6   <Class Tasks$1>
	//   14   26:dup             
	//   15   27:aload_2         
	//   16   28:aload_1         
	//   17   29:invokespecial   #93  <Method void Tasks$1(zzh, Callable)>
	//   18   32:invokeinterface #99  <Method void Executor.execute(Runnable)>
		return ((Task) (zzh1));
	//   19   37:aload_2         
	//   20   38:areturn         
	}

	public static Task forException(Exception exception)
	{
		zzh zzh1 = new zzh();
	//    0    0:new             #89  <Class zzh>
	//    1    3:dup             
	//    2    4:invokespecial   #90  <Method void zzh()>
	//    3    7:astore_1        
		zzh1.setException(exception);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #106 <Method void zzh.setException(Exception)>
		return ((Task) (zzh1));
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public static Task forResult(Object obj)
	{
		zzh zzh1 = new zzh();
	//    0    0:new             #89  <Class zzh>
	//    1    3:dup             
	//    2    4:invokespecial   #90  <Method void zzh()>
	//    3    7:astore_1        
		zzh1.setResult(obj);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #113 <Method void zzh.setResult(Object)>
		return ((Task) (zzh1));
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public static Task whenAll(Collection collection)
	{
		if(collection.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #121 <Method boolean Collection.isEmpty()>
	//*   2    6:ifeq            14
			return forResult(((Object) (null)));
	//    3    9:aconst_null     
	//    4   10:invokestatic    #123 <Method Task forResult(Object)>
	//    5   13:areturn         
		for(Iterator iterator = collection.iterator(); iterator.hasNext();)
	//*   6   14:aload_0         
	//*   7   15:invokeinterface #127 <Method Iterator Collection.iterator()>
	//*   8   20:astore_1        
	//*   9   21:aload_1         
	//*  10   22:invokeinterface #132 <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            52
			if((Task)iterator.next() == null)
	//*  12   30:aload_1         
	//*  13   31:invokeinterface #136 <Method Object Iterator.next()>
	//*  14   36:checkcast       #39  <Class Task>
	//*  15   39:ifnonnull       21
				throw new NullPointerException("null tasks are not accepted");
	//   16   42:new             #138 <Class NullPointerException>
	//   17   45:dup             
	//   18   46:ldc1            #140 <String "null tasks are not accepted">
	//   19   48:invokespecial   #141 <Method void NullPointerException(String)>
	//   20   51:athrow          

		zzh zzh1 = new zzh();
	//   21   52:new             #89  <Class zzh>
	//   22   55:dup             
	//   23   56:invokespecial   #90  <Method void zzh()>
	//   24   59:astore_1        
		zzc zzc1 = new zzc(collection.size(), zzh1);
	//   25   60:new             #14  <Class Tasks$zzc>
	//   26   63:dup             
	//   27   64:aload_0         
	//   28   65:invokeinterface #145 <Method int Collection.size()>
	//   29   70:aload_1         
	//   30   71:invokespecial   #148 <Method void Tasks$zzc(int, zzh)>
	//   31   74:astore_2        
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); zza((Task)((Iterator) (collection)).next(), ((zzb) (zzc1))));
	//   32   75:aload_0         
	//   33   76:invokeinterface #127 <Method Iterator Collection.iterator()>
	//   34   81:astore_0        
	//   35   82:aload_0         
	//   36   83:invokeinterface #132 <Method boolean Iterator.hasNext()>
	//   37   88:ifeq            107
	//   38   91:aload_0         
	//   39   92:invokeinterface #136 <Method Object Iterator.next()>
	//   40   97:checkcast       #39  <Class Task>
	//   41  100:aload_2         
	//   42  101:invokestatic    #51  <Method void zza(Task, Tasks$zzb)>
	//*  43  104:goto            82
		return ((Task) (zzh1));
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
	//    4    6:invokestatic    #123 <Method Task forResult(Object)>
	//    5    9:areturn         
		else
			return whenAll(((Collection) (Arrays.asList(((Object []) (atask))))));
	//    6   10:aload_0         
	//    7   11:invokestatic    #156 <Method java.util.List Arrays.asList(Object[])>
	//    8   14:invokestatic    #158 <Method Task whenAll(Collection)>
	//    9   17:areturn         
	}

	private static void zza(Task task, zzb zzb1)
	{
		task.addOnSuccessListener(TaskExecutors.zzbLG, ((OnSuccessListener) (zzb1)));
	//    0    0:aload_0         
	//    1    1:getstatic       #162 <Field Executor TaskExecutors.zzbLG>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #166 <Method Task Task.addOnSuccessListener(Executor, OnSuccessListener)>
	//    4    8:pop             
		task.addOnFailureListener(TaskExecutors.zzbLG, ((OnFailureListener) (zzb1)));
	//    5    9:aload_0         
	//    6   10:getstatic       #162 <Field Executor TaskExecutors.zzbLG>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #170 <Method Task Task.addOnFailureListener(Executor, OnFailureListener)>
	//    9   17:pop             
	//   10   18:return          
	}

	private static Object zzb(Task task)
		throws ExecutionException
	{
		if(task.isSuccessful())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #174 <Method boolean Task.isSuccessful()>
	//*   2    4:ifeq            12
			return task.getResult();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #177 <Method Object Task.getResult()>
	//    5   11:areturn         
		else
			throw new ExecutionException(((Throwable) (task.getException())));
	//    6   12:new             #24  <Class ExecutionException>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokevirtual   #181 <Method Exception Task.getException()>
	//   10   20:invokespecial   #184 <Method void ExecutionException(Throwable)>
	//   11   23:athrow          
	}
}
