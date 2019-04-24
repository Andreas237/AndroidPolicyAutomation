// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.*;

// Referenced classes of package kotlinx.coroutines.scheduling:
//			TasksKt, CoroutineScheduler, LimitingDispatcher, TaskMode, 
//			TaskContext

public class ExperimentalCoroutineDispatcher extends ExecutorCoroutineDispatcher
{

	public ExperimentalCoroutineDispatcher(int i, int j)
	{
		this(i, j, TasksKt.IDLE_WORKER_KEEP_ALIVE_NS, ((String) (null)), 8, ((DefaultConstructorMarker) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:getstatic       #73  <Field long TasksKt.IDLE_WORKER_KEEP_ALIVE_NS>
	//    4    6:aconst_null     
	//    5    7:bipush          8
	//    6    9:aconst_null     
	//    7   10:invokespecial   #76  <Method void ExperimentalCoroutineDispatcher(int, int, long, String, int, DefaultConstructorMarker)>
	//    8   13:return          
	}

	public ExperimentalCoroutineDispatcher(int i, int j, int k, DefaultConstructorMarker defaultconstructormarker)
	{
		if((k & 1) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            10
			i = TasksKt.CORE_POOL_SIZE;
	//    4    6:getstatic       #82  <Field int TasksKt.CORE_POOL_SIZE>
	//    5    9:istore_1        
		if((k & 2) != 0)
	//*   6   10:iload_3         
	//*   7   11:iconst_2        
	//*   8   12:iand            
	//*   9   13:ifeq            20
			j = TasksKt.MAX_POOL_SIZE;
	//   10   16:getstatic       #85  <Field int TasksKt.MAX_POOL_SIZE>
	//   11   19:istore_2        
		this(i, j);
	//   12   20:aload_0         
	//   13   21:iload_1         
	//   14   22:iload_2         
	//   15   23:invokespecial   #87  <Method void ExperimentalCoroutineDispatcher(int, int)>
	//   16   26:return          
	}

	public ExperimentalCoroutineDispatcher(int i, int j, long l, String s)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "schedulerName");
	//    0    0:aload           5
	//    1    2:ldc1            #89  <String "schedulerName">
	//    2    4:invokestatic    #95  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super();
	//    3    7:aload_0         
	//    4    8:invokespecial   #98  <Method void ExecutorCoroutineDispatcher()>
		corePoolSize = i;
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:putfield        #100 <Field int corePoolSize>
		maxPoolSize = j;
	//    8   16:aload_0         
	//    9   17:iload_2         
	//   10   18:putfield        #102 <Field int maxPoolSize>
		idleWorkerKeepAliveNs = l;
	//   11   21:aload_0         
	//   12   22:lload_3         
	//   13   23:putfield        #104 <Field long idleWorkerKeepAliveNs>
		schedulerName = s;
	//   14   26:aload_0         
	//   15   27:aload           5
	//   16   29:putfield        #106 <Field String schedulerName>
		coroutineScheduler = createScheduler();
	//   17   32:aload_0         
	//   18   33:aload_0         
	//   19   34:invokespecial   #109 <Method CoroutineScheduler createScheduler()>
	//   20   37:putfield        #111 <Field CoroutineScheduler coroutineScheduler>
	//   21   40:return          
	}

	public ExperimentalCoroutineDispatcher(int i, int j, long l, String s, int k, DefaultConstructorMarker defaultconstructormarker)
	{
		if((k & 8) != 0)
	//*   0    0:iload           6
	//*   1    2:bipush          8
	//*   2    4:iand            
	//*   3    5:ifeq            12
			s = "CoroutineScheduler";
	//    4    8:ldc1            #114 <String "CoroutineScheduler">
	//    5   10:astore          5
		this(i, j, l, s);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:iload_2         
	//    9   15:lload_3         
	//   10   16:aload           5
	//   11   18:invokespecial   #116 <Method void ExperimentalCoroutineDispatcher(int, int, long, String)>
	//   12   21:return          
	}

	public ExperimentalCoroutineDispatcher(int i, int j, String s)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "schedulerName");
	//    0    0:aload_3         
	//    1    1:ldc1            #89  <String "schedulerName">
	//    2    3:invokestatic    #95  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		this(i, j, TasksKt.IDLE_WORKER_KEEP_ALIVE_NS, s);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:iload_2         
	//    6    9:getstatic       #73  <Field long TasksKt.IDLE_WORKER_KEEP_ALIVE_NS>
	//    7   12:aload_3         
	//    8   13:invokespecial   #116 <Method void ExperimentalCoroutineDispatcher(int, int, long, String)>
	//    9   16:return          
	}

	public ExperimentalCoroutineDispatcher(int i, int j, String s, int k, DefaultConstructorMarker defaultconstructormarker)
	{
		if((k & 1) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_1        
	//*   2    3:iand            
	//*   3    4:ifeq            11
			i = TasksKt.CORE_POOL_SIZE;
	//    4    7:getstatic       #82  <Field int TasksKt.CORE_POOL_SIZE>
	//    5   10:istore_1        
		if((k & 2) != 0)
	//*   6   11:iload           4
	//*   7   13:iconst_2        
	//*   8   14:iand            
	//*   9   15:ifeq            22
			j = TasksKt.MAX_POOL_SIZE;
	//   10   18:getstatic       #85  <Field int TasksKt.MAX_POOL_SIZE>
	//   11   21:istore_2        
		if((k & 4) != 0)
	//*  12   22:iload           4
	//*  13   24:iconst_4        
	//*  14   25:iand            
	//*  15   26:ifeq            32
			s = "DefaultDispatcher";
	//   16   29:ldc1            #119 <String "DefaultDispatcher">
	//   17   31:astore_3        
		this(i, j, s);
	//   18   32:aload_0         
	//   19   33:iload_1         
	//   20   34:iload_2         
	//   21   35:aload_3         
	//   22   36:invokespecial   #121 <Method void ExperimentalCoroutineDispatcher(int, int, String)>
	//   23   39:return          
	}

	public static CoroutineDispatcher blocking$default(ExperimentalCoroutineDispatcher experimentalcoroutinedispatcher, int i, int j, Object obj)
	{
		if(obj != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          14
			throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blocking");
	//    2    4:new             #125 <Class UnsupportedOperationException>
	//    3    7:dup             
	//    4    8:ldc1            #127 <String "Super calls with default arguments not supported in this target, function: blocking">
	//    5   10:invokespecial   #130 <Method void UnsupportedOperationException(String)>
	//    6   13:athrow          
		if((j & 1) != 0)
	//*   7   14:iload_2         
	//*   8   15:iconst_1        
	//*   9   16:iand            
	//*  10   17:ifeq            24
			i = TasksKt.BLOCKING_DEFAULT_PARALLELISM;
	//   11   20:getstatic       #133 <Field int TasksKt.BLOCKING_DEFAULT_PARALLELISM>
	//   12   23:istore_1        
		return experimentalcoroutinedispatcher.blocking(i);
	//   13   24:aload_0         
	//   14   25:iload_1         
	//   15   26:invokevirtual   #136 <Method CoroutineDispatcher blocking(int)>
	//   16   29:areturn         
	}

	private final CoroutineScheduler createScheduler()
	{
		return new CoroutineScheduler(corePoolSize, maxPoolSize, idleWorkerKeepAliveNs, schedulerName);
	//    0    0:new             #139 <Class CoroutineScheduler>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #100 <Field int corePoolSize>
	//    4    8:aload_0         
	//    5    9:getfield        #102 <Field int maxPoolSize>
	//    6   12:aload_0         
	//    7   13:getfield        #104 <Field long idleWorkerKeepAliveNs>
	//    8   16:aload_0         
	//    9   17:getfield        #106 <Field String schedulerName>
	//   10   20:invokespecial   #140 <Method void CoroutineScheduler(int, int, long, String)>
	//   11   23:areturn         
	}

	public final CoroutineDispatcher blocking(int i)
	{
		boolean flag;
		if(i > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            9
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		if(!flag)
	//*   7   11:iload_2         
	//*   8   12:ifne            54
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   15:new             #142 <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #143 <Method void StringBuilder()>
	//   12   22:astore_3        
			stringbuilder.append("Expected positive parallelism level, but have ");
	//   13   23:aload_3         
	//   14   24:ldc1            #145 <String "Expected positive parallelism level, but have ">
	//   15   26:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
			stringbuilder.append(i);
	//   17   30:aload_3         
	//   18   31:iload_1         
	//   19   32:invokevirtual   #152 <Method StringBuilder StringBuilder.append(int)>
	//   20   35:pop             
			throw (Throwable)new IllegalArgumentException(((Object) (stringbuilder.toString())).toString());
	//   21   36:new             #154 <Class IllegalArgumentException>
	//   22   39:dup             
	//   23   40:aload_3         
	//   24   41:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   25   44:invokevirtual   #160 <Method String Object.toString()>
	//   26   47:invokespecial   #161 <Method void IllegalArgumentException(String)>
	//   27   50:checkcast       #163 <Class Throwable>
	//   28   53:athrow          
		} else
		{
			return (CoroutineDispatcher)new LimitingDispatcher(this, i, TaskMode.PROBABLY_BLOCKING);
	//   29   54:new             #165 <Class LimitingDispatcher>
	//   30   57:dup             
	//   31   58:aload_0         
	//   32   59:iload_1         
	//   33   60:getstatic       #171 <Field TaskMode TaskMode.PROBABLY_BLOCKING>
	//   34   63:invokespecial   #174 <Method void LimitingDispatcher(ExperimentalCoroutineDispatcher, int, TaskMode)>
	//   35   66:checkcast       #176 <Class CoroutineDispatcher>
	//   36   69:areturn         
		}
	}

	public void close()
	{
		coroutineScheduler.close();
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field CoroutineScheduler coroutineScheduler>
	//    2    4:invokevirtual   #178 <Method void CoroutineScheduler.close()>
	//    3    7:return          
	}

	public void dispatch(CoroutineContext coroutinecontext, Runnable runnable)
	{
		RejectedExecutionException rejectedexecutionexception;
		Intrinsics.checkParameterIsNotNull(((Object) (coroutinecontext)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #182 <String "context">
	//    2    3:invokestatic    #95  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (runnable)), "block");
	//    3    6:aload_2         
	//    4    7:ldc1            #183 <String "block">
	//    5    9:invokestatic    #95  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		try
		{
			CoroutineScheduler.dispatch$default(coroutineScheduler, runnable, ((TaskContext) (null)), false, 6, ((Object) (null)));
	//    6   12:aload_0         
	//    7   13:getfield        #111 <Field CoroutineScheduler coroutineScheduler>
	//    8   16:aload_2         
	//    9   17:aconst_null     
	//   10   18:iconst_0        
	//   11   19:bipush          6
	//   12   21:aconst_null     
	//   13   22:invokestatic    #187 <Method void CoroutineScheduler.dispatch$default(CoroutineScheduler, Runnable, TaskContext, boolean, int, Object)>
			return;
	//   14   25:return          
		}
	//*  15   26:getstatic       #193 <Field DefaultExecutor DefaultExecutor.INSTANCE>
	//*  16   29:aload_1         
	//*  17   30:aload_2         
	//*  18   31:invokevirtual   #195 <Method void DefaultExecutor.dispatch(CoroutineContext, Runnable)>
	//*  19   34:return          
		// Misplaced declaration of an exception variable
		catch(RejectedExecutionException rejectedexecutionexception)
		{
			DefaultExecutor.INSTANCE.dispatch(coroutinecontext, runnable);
		}
	//*  20   35:astore_3        
	//*  21   36:goto            26
	}

	public final void dispatchWithContext$kotlinx_coroutines_core(Runnable runnable, TaskContext taskcontext, boolean flag)
	{
		RejectedExecutionException rejectedexecutionexception;
		Intrinsics.checkParameterIsNotNull(((Object) (runnable)), "block");
	//    0    0:aload_1         
	//    1    1:ldc1            #183 <String "block">
	//    2    3:invokestatic    #95  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (taskcontext)), "context");
	//    3    6:aload_2         
	//    4    7:ldc1            #182 <String "context">
	//    5    9:invokestatic    #95  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		try
		{
			coroutineScheduler.dispatch(runnable, taskcontext, flag);
	//    6   12:aload_0         
	//    7   13:getfield        #111 <Field CoroutineScheduler coroutineScheduler>
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:iload_3         
	//   11   19:invokevirtual   #198 <Method void CoroutineScheduler.dispatch(Runnable, TaskContext, boolean)>
			return;
	//   12   22:return          
		}
	//*  13   23:getstatic       #193 <Field DefaultExecutor DefaultExecutor.INSTANCE>
	//*  14   26:aload_0         
	//*  15   27:getfield        #111 <Field CoroutineScheduler coroutineScheduler>
	//*  16   30:aload_1         
	//*  17   31:aload_2         
	//*  18   32:invokevirtual   #202 <Method Task CoroutineScheduler.createTask$kotlinx_coroutines_core(Runnable, TaskContext)>
	//*  19   35:checkcast       #204 <Class Runnable>
	//*  20   38:invokevirtual   #208 <Method void DefaultExecutor.execute$kotlinx_coroutines_core(Runnable)>
	//*  21   41:return          
		// Misplaced declaration of an exception variable
		catch(RejectedExecutionException rejectedexecutionexception)
		{
			DefaultExecutor.INSTANCE.execute$kotlinx_coroutines_core((Runnable)coroutineScheduler.createTask$kotlinx_coroutines_core(runnable, taskcontext));
		}
	//*  22   42:astore          4
	//*  23   44:goto            23
	}

	public void dispatchYield(CoroutineContext coroutinecontext, Runnable runnable)
	{
		RejectedExecutionException rejectedexecutionexception;
		Intrinsics.checkParameterIsNotNull(((Object) (coroutinecontext)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #182 <String "context">
	//    2    3:invokestatic    #95  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (runnable)), "block");
	//    3    6:aload_2         
	//    4    7:ldc1            #183 <String "block">
	//    5    9:invokestatic    #95  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		try
		{
			CoroutineScheduler.dispatch$default(coroutineScheduler, runnable, ((TaskContext) (null)), true, 2, ((Object) (null)));
	//    6   12:aload_0         
	//    7   13:getfield        #111 <Field CoroutineScheduler coroutineScheduler>
	//    8   16:aload_2         
	//    9   17:aconst_null     
	//   10   18:iconst_1        
	//   11   19:iconst_2        
	//   12   20:aconst_null     
	//   13   21:invokestatic    #187 <Method void CoroutineScheduler.dispatch$default(CoroutineScheduler, Runnable, TaskContext, boolean, int, Object)>
			return;
	//   14   24:return          
		}
	//*  15   25:getstatic       #193 <Field DefaultExecutor DefaultExecutor.INSTANCE>
	//*  16   28:aload_1         
	//*  17   29:aload_2         
	//*  18   30:invokevirtual   #210 <Method void DefaultExecutor.dispatchYield(CoroutineContext, Runnable)>
	//*  19   33:return          
		// Misplaced declaration of an exception variable
		catch(RejectedExecutionException rejectedexecutionexception)
		{
			DefaultExecutor.INSTANCE.dispatchYield(coroutinecontext, runnable);
		}
	//*  20   34:astore_3        
	//*  21   35:goto            25
	}

	public Executor getExecutor()
	{
		return (Executor)coroutineScheduler;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field CoroutineScheduler coroutineScheduler>
	//    2    4:checkcast       #212 <Class Executor>
	//    3    7:areturn         
	}

	public final CoroutineDispatcher limited(int i)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag;
		if(i > 0)
	//*   2    2:iload_1         
	//*   3    3:ifle            11
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore_2        
		else
	//*   6    8:goto            13
			flag = false;
	//    7   11:iconst_0        
	//    8   12:istore_2        
		if(!flag)
	//*   9   13:iload_2         
	//*  10   14:ifne            60
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   17:new             #142 <Class StringBuilder>
	//   12   20:dup             
	//   13   21:invokespecial   #143 <Method void StringBuilder()>
	//   14   24:astore          4
			stringbuilder.append("Expected positive parallelism level, but have ");
	//   15   26:aload           4
	//   16   28:ldc1            #145 <String "Expected positive parallelism level, but have ">
	//   17   30:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
			stringbuilder.append(i);
	//   19   34:aload           4
	//   20   36:iload_1         
	//   21   37:invokevirtual   #152 <Method StringBuilder StringBuilder.append(int)>
	//   22   40:pop             
			throw (Throwable)new IllegalArgumentException(((Object) (stringbuilder.toString())).toString());
	//   23   41:new             #154 <Class IllegalArgumentException>
	//   24   44:dup             
	//   25   45:aload           4
	//   26   47:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   27   50:invokevirtual   #160 <Method String Object.toString()>
	//   28   53:invokespecial   #161 <Method void IllegalArgumentException(String)>
	//   29   56:checkcast       #163 <Class Throwable>
	//   30   59:athrow          
		}
		flag = flag1;
	//   31   60:iload_3         
	//   32   61:istore_2        
		if(i <= corePoolSize)
	//*  33   62:iload_1         
	//*  34   63:aload_0         
	//*  35   64:getfield        #100 <Field int corePoolSize>
	//*  36   67:icmpgt          72
			flag = true;
	//   37   70:iconst_1        
	//   38   71:istore_2        
		if(!flag)
	//*  39   72:iload_2         
	//*  40   73:ifne            137
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   41   76:new             #142 <Class StringBuilder>
	//   42   79:dup             
	//   43   80:invokespecial   #143 <Method void StringBuilder()>
	//   44   83:astore          4
			stringbuilder1.append("Expected parallelism level lesser than core pool size (");
	//   45   85:aload           4
	//   46   87:ldc1            #214 <String "Expected parallelism level lesser than core pool size (">
	//   47   89:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   48   92:pop             
			stringbuilder1.append(corePoolSize);
	//   49   93:aload           4
	//   50   95:aload_0         
	//   51   96:getfield        #100 <Field int corePoolSize>
	//   52   99:invokevirtual   #152 <Method StringBuilder StringBuilder.append(int)>
	//   53  102:pop             
			stringbuilder1.append("), but have ");
	//   54  103:aload           4
	//   55  105:ldc1            #216 <String "), but have ">
	//   56  107:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   57  110:pop             
			stringbuilder1.append(i);
	//   58  111:aload           4
	//   59  113:iload_1         
	//   60  114:invokevirtual   #152 <Method StringBuilder StringBuilder.append(int)>
	//   61  117:pop             
			throw (Throwable)new IllegalArgumentException(((Object) (stringbuilder1.toString())).toString());
	//   62  118:new             #154 <Class IllegalArgumentException>
	//   63  121:dup             
	//   64  122:aload           4
	//   65  124:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   66  127:invokevirtual   #160 <Method String Object.toString()>
	//   67  130:invokespecial   #161 <Method void IllegalArgumentException(String)>
	//   68  133:checkcast       #163 <Class Throwable>
	//   69  136:athrow          
		} else
		{
			return (CoroutineDispatcher)new LimitingDispatcher(this, i, TaskMode.NON_BLOCKING);
	//   70  137:new             #165 <Class LimitingDispatcher>
	//   71  140:dup             
	//   72  141:aload_0         
	//   73  142:iload_1         
	//   74  143:getstatic       #219 <Field TaskMode TaskMode.NON_BLOCKING>
	//   75  146:invokespecial   #174 <Method void LimitingDispatcher(ExperimentalCoroutineDispatcher, int, TaskMode)>
	//   76  149:checkcast       #176 <Class CoroutineDispatcher>
	//   77  152:areturn         
		}
	}

	public final void restore$kotlinx_coroutines_core()
	{
		usePrivateScheduler$kotlinx_coroutines_core();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #221 <Method void usePrivateScheduler$kotlinx_coroutines_core()>
	//    2    4:return          
	}

	public final void shutdown$kotlinx_coroutines_core(long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		coroutineScheduler.shutdown(l);
	//    2    2:aload_0         
	//    3    3:getfield        #111 <Field CoroutineScheduler coroutineScheduler>
	//    4    6:lload_1         
	//    5    7:invokevirtual   #224 <Method void CoroutineScheduler.shutdown(long)>
		this;
	//    6   10:aload_0         
		JVM INSTR monitorexit ;
	//    7   11:monitorexit     
		return;
	//    8   12:return          
		Exception exception;
		exception;
	//    9   13:astore_3        
	//*  10   14:aload_0         
		throw exception;
	//   11   15:monitorexit     
	//   12   16:aload_3         
	//   13   17:athrow          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #142 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #143 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(super.toString());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokespecial   #225 <Method String ExecutorCoroutineDispatcher.toString()>
	//    7   13:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append("[scheduler = ");
	//    9   17:aload_1         
	//   10   18:ldc1            #227 <String "[scheduler = ">
	//   11   20:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(((Object) (coroutineScheduler)));
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #111 <Field CoroutineScheduler coroutineScheduler>
	//   16   29:invokevirtual   #230 <Method StringBuilder StringBuilder.append(Object)>
	//   17   32:pop             
		stringbuilder.append(']');
	//   18   33:aload_1         
	//   19   34:bipush          93
	//   20   36:invokevirtual   #233 <Method StringBuilder StringBuilder.append(char)>
	//   21   39:pop             
		return stringbuilder.toString();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   24   44:areturn         
	}

	public final void usePrivateScheduler$kotlinx_coroutines_core()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		coroutineScheduler.shutdown(10000L);
	//    2    2:aload_0         
	//    3    3:getfield        #111 <Field CoroutineScheduler coroutineScheduler>
	//    4    6:ldc2w           #234 <Long 10000L>
	//    5    9:invokevirtual   #224 <Method void CoroutineScheduler.shutdown(long)>
		coroutineScheduler = createScheduler();
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:invokespecial   #109 <Method CoroutineScheduler createScheduler()>
	//    9   17:putfield        #111 <Field CoroutineScheduler coroutineScheduler>
		this;
	//   10   20:aload_0         
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return;
	//   12   22:return          
		Exception exception;
		exception;
	//   13   23:astore_1        
	//*  14   24:aload_0         
		throw exception;
	//   15   25:monitorexit     
	//   16   26:aload_1         
	//   17   27:athrow          
	}

	private final int corePoolSize;
	private CoroutineScheduler coroutineScheduler;
	private final long idleWorkerKeepAliveNs;
	private final int maxPoolSize;
	private final String schedulerName;
}
