// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import android.content.Context;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.*;

// Referenced classes of package androidx.work:
//			ListenableWorker, WorkerParameters

public abstract class CoroutineWorker extends ListenableWorker
{

	public CoroutineWorker(Context context, WorkerParameters workerparameters)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context)), "appContext");
	//    0    0:aload_1         
	//    1    1:ldc1            #50  <String "appContext">
	//    2    3:invokestatic    #56  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (workerparameters)), "params");
	//    3    6:aload_2         
	//    4    7:ldc1            #57  <String "params">
	//    5    9:invokestatic    #56  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super(context, workerparameters);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokespecial   #59  <Method void ListenableWorker(Context, WorkerParameters)>
	//   10   18:aload_0         
	//   11   19:aconst_null     
	//   12   20:iconst_1        
	//   13   21:aconst_null     
	//   14   22:invokestatic    #65  <Method Job JobKt.Job$default(Job, int, Object)>
	//   15   25:putfield        #67  <Field Job job>
		context = ((Context) (SettableFuture.create()));
	//   16   28:invokestatic    #72  <Method SettableFuture SettableFuture.create()>
	//   17   31:astore_1        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (context)), "SettableFuture.create()");
	//   18   32:aload_1         
	//   19   33:ldc1            #74  <String "SettableFuture.create()">
	//   20   35:invokestatic    #77  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		future = ((SettableFuture) (context));
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:putfield        #79  <Field SettableFuture future>
		context = ((Context) (future));
	//   24   43:aload_0         
	//   25   44:getfield        #79  <Field SettableFuture future>
	//   26   47:astore_1        
		workerparameters = ((WorkerParameters) ((Runnable)new Runnable(this) {

			public final void run()
			{
				if(getFuture$work_runtime_ktx_release().isCancelled())
			//*   0    0:aload_0         
			//*   1    1:getfield        #30  <Field CoroutineWorker this$0>
			//*   2    4:invokevirtual   #38  <Method SettableFuture CoroutineWorker.getFuture$work_runtime_ktx_release()>
			//*   3    7:invokevirtual   #44  <Method boolean SettableFuture.isCancelled()>
			//*   4   10:ifeq            25
					getJob$work_runtime_ktx_release().cancel();
			//    5   13:aload_0         
			//    6   14:getfield        #30  <Field CoroutineWorker this$0>
			//    7   17:invokevirtual   #48  <Method Job CoroutineWorker.getJob$work_runtime_ktx_release()>
			//    8   20:invokeinterface #53  <Method void Job.cancel()>
			//    9   25:return          
			}

			final CoroutineWorker this$0;

			
			{
				this$0 = coroutineworker;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #30  <Field CoroutineWorker this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #33  <Method void Object()>
			//    5    9:return          
			}
		}
));
	//   27   48:new             #6   <Class CoroutineWorker$1>
	//   28   51:dup             
	//   29   52:aload_0         
	//   30   53:invokespecial   #82  <Method void CoroutineWorker$1(CoroutineWorker)>
	//   31   56:checkcast       #84  <Class Runnable>
	//   32   59:astore_2        
		TaskExecutor taskexecutor = getTaskExecutor();
	//   33   60:aload_0         
	//   34   61:invokevirtual   #88  <Method TaskExecutor getTaskExecutor()>
	//   35   64:astore_3        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (taskexecutor)), "taskExecutor");
	//   36   65:aload_3         
	//   37   66:ldc1            #90  <String "taskExecutor">
	//   38   68:invokestatic    #77  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		((SettableFuture) (context)).addListener(((Runnable) (workerparameters)), taskexecutor.getBackgroundExecutor());
	//   39   71:aload_1         
	//   40   72:aload_2         
	//   41   73:aload_3         
	//   42   74:invokeinterface #96  <Method java.util.concurrent.Executor TaskExecutor.getBackgroundExecutor()>
	//   43   79:invokevirtual   #100 <Method void SettableFuture.addListener(Runnable, java.util.concurrent.Executor)>
	//   44   82:aload_0         
	//   45   83:invokestatic    #105 <Method CoroutineDispatcher Dispatchers.getDefault()>
	//   46   86:putfield        #107 <Field CoroutineDispatcher coroutineContext>
	//   47   89:return          
	}

	public abstract Object doWork(Continuation continuation);

	public CoroutineDispatcher getCoroutineContext()
	{
		return coroutineContext;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field CoroutineDispatcher coroutineContext>
	//    2    4:areturn         
	}

	public final SettableFuture getFuture$work_runtime_ktx_release()
	{
		return future;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field SettableFuture future>
	//    2    4:areturn         
	}

	public final Job getJob$work_runtime_ktx_release()
	{
		return job;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Job job>
	//    2    4:areturn         
	}

	public final void onStopped()
	{
		super.onStopped();
	//    0    0:aload_0         
	//    1    1:invokespecial   #116 <Method void ListenableWorker.onStopped()>
		future.cancel(false);
	//    2    4:aload_0         
	//    3    5:getfield        #79  <Field SettableFuture future>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #120 <Method boolean SettableFuture.cancel(boolean)>
	//    6   12:pop             
	//    7   13:return          
	}

	public final ListenableFuture startWork()
	{
		BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(getCoroutineContext().plus((CoroutineContext)job)), ((CoroutineContext) (null)), ((kotlinx.coroutines.CoroutineStart) (null)), (Function2)new Function2(this, ((Continuation) (null))) {

			public final Continuation create(Object obj, Continuation continuation)
			{
				Intrinsics.checkParameterIsNotNull(((Object) (continuation)), "completion");
			//    0    0:aload_2         
			//    1    1:ldc1            #59  <String "completion">
			//    2    3:invokestatic    #65  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
				continuation = ((Continuation) (new startWork._cls1(CoroutineWorker.this, continuation)));
			//    3    6:new             #2   <Class CoroutineWorker$startWork$1>
			//    4    9:dup             
			//    5   10:aload_0         
			//    6   11:getfield        #49  <Field CoroutineWorker this$0>
			//    7   14:aload_2         
			//    8   15:invokespecial   #67  <Method void CoroutineWorker$startWork$1(CoroutineWorker, Continuation)>
			//    9   18:astore_2        
				continuation.p$ = (CoroutineScope)obj;
			//   10   19:aload_2         
			//   11   20:aload_1         
			//   12   21:checkcast       #69  <Class CoroutineScope>
			//   13   24:putfield        #71  <Field CoroutineScope p$>
				return continuation;
			//   14   27:aload_2         
			//   15   28:areturn         
			}

			public final Object invoke(Object obj, Object obj1)
			{
				return ((startWork._cls1)create(obj, (Continuation)obj1)).invokeSuspend(((Object) (Unit.INSTANCE)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #77  <Class Continuation>
			//    4    6:invokevirtual   #79  <Method Continuation create(Object, Continuation)>
			//    5    9:checkcast       #2   <Class CoroutineWorker$startWork$1>
			//    6   12:getstatic       #85  <Field Unit Unit.INSTANCE>
			//    7   15:invokevirtual   #88  <Method Object invokeSuspend(Object)>
			//    8   18:areturn         
			}

			public final Object invokeSuspend(Object obj)
			{
				Object obj2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
			//    0    0:invokestatic    #96  <Method Object IntrinsicsKt.getCOROUTINE_SUSPENDED()>
			//    1    3:astore_3        
				label;
			//    2    4:aload_0         
			//    3    5:getfield        #98  <Field int label>
				JVM INSTR tableswitch 0 1: default 32
			//			               0 64
			//			               1 42;
			//    4    8:tableswitch     0 1: default 32
			//			               0 64
			//			               1 42
				   goto _L1 _L2 _L3
_L1:
				throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
			//    5   32:new             #100 <Class IllegalStateException>
			//    6   35:dup             
			//    7   36:ldc1            #102 <String "call to 'resume' before 'invoke' with coroutine">
			//    8   38:invokespecial   #105 <Method void IllegalStateException(String)>
			//    9   41:athrow          
_L3:
				if(obj instanceof kotlin.Result.Failure)
			//*  10   42:aload_1         
			//*  11   43:instanceof      #107 <Class kotlin.Result$Failure>
			//*  12   46:ifne            52
			//*  13   49:goto            101
				{
					Object obj1;
					try
					{
						throw ((kotlin.Result.Failure)obj).exception;
			//   14   52:aload_1         
			//   15   53:checkcast       #107 <Class kotlin.Result$Failure>
			//   16   56:getfield        #111 <Field Throwable kotlin.Result$Failure.exception>
			//   17   59:athrow          
					}
					// Misplaced declaration of an exception variable
					catch(Object obj)
			//*  18   60:astore_1        
			//*  19   61:goto            121
			//*  20   64:aload_1         
			//*  21   65:instanceof      #107 <Class kotlin.Result$Failure>
			//*  22   68:ifne            137
			//*  23   71:aload_0         
			//*  24   72:getfield        #71  <Field CoroutineScope p$>
			//*  25   75:astore_1        
			//*  26   76:aload_0         
			//*  27   77:getfield        #49  <Field CoroutineWorker this$0>
			//*  28   80:astore_1        
			//*  29   81:aload_0         
			//*  30   82:iconst_1        
			//*  31   83:putfield        #98  <Field int label>
			//*  32   86:aload_1         
			//*  33   87:aload_0         
			//*  34   88:invokevirtual   #115 <Method Object CoroutineWorker.doWork(Continuation)>
			//*  35   91:astore_2        
			//*  36   92:aload_2         
			//*  37   93:astore_1        
			//*  38   94:aload_2         
			//*  39   95:aload_3         
			//*  40   96:if_acmpne       101
			//*  41   99:aload_3         
			//*  42  100:areturn         
			//*  43  101:aload_1         
			//*  44  102:checkcast       #117 <Class ListenableWorker$Result>
			//*  45  105:astore_1        
			//*  46  106:aload_0         
			//*  47  107:getfield        #49  <Field CoroutineWorker this$0>
			//*  48  110:invokevirtual   #121 <Method SettableFuture CoroutineWorker.getFuture$work_runtime_ktx_release()>
			//*  49  113:aload_1         
			//*  50  114:invokevirtual   #127 <Method boolean SettableFuture.set(Object)>
			//*  51  117:pop             
			//*  52  118:goto            133
					{
						getFuture$work_runtime_ktx_release().setException(((Throwable) (obj)));
			//   53  121:aload_0         
			//   54  122:getfield        #49  <Field CoroutineWorker this$0>
			//   55  125:invokevirtual   #121 <Method SettableFuture CoroutineWorker.getFuture$work_runtime_ktx_release()>
			//   56  128:aload_1         
			//   57  129:invokevirtual   #131 <Method boolean SettableFuture.setException(Throwable)>
			//   58  132:pop             
					}
					break; /* Loop/switch isn't completed */
				}
				break MISSING_BLOCK_LABEL_101;
_L2:
				if(obj instanceof kotlin.Result.Failure)
					break MISSING_BLOCK_LABEL_137;
				obj = ((Object) (p$));
				obj = ((Object) (CoroutineWorker.this));
				label = 1;
				obj1 = ((CoroutineWorker) (obj)).doWork(((Continuation) (this)));
				obj = obj1;
				if(obj1 == obj2)
					return obj2;
				obj = ((Object) ((ListenableWorker.Result)obj));
				getFuture$work_runtime_ktx_release().set(obj);
				return ((Object) (Unit.INSTANCE));
			//   59  133:getstatic       #85  <Field Unit Unit.INSTANCE>
			//   60  136:areturn         
				throw ((kotlin.Result.Failure)obj).exception;
			//   61  137:aload_1         
			//   62  138:checkcast       #107 <Class kotlin.Result$Failure>
			//   63  141:getfield        #111 <Field Throwable kotlin.Result$Failure.exception>
			//   64  144:athrow          
			}

			int label;
			private CoroutineScope p$;
			final CoroutineWorker this$0;

			
			{
				this$0 = coroutineworker;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #49  <Field CoroutineWorker this$0>
				super(2, continuation);
			//    3    5:aload_0         
			//    4    6:iconst_2        
			//    5    7:aload_2         
			//    6    8:invokespecial   #52  <Method void SuspendLambda(int, Continuation)>
			//    7   11:return          
			}
		}
, 3, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #123 <Method CoroutineDispatcher getCoroutineContext()>
	//    2    4:aload_0         
	//    3    5:getfield        #67  <Field Job job>
	//    4    8:checkcast       #125 <Class CoroutineContext>
	//    5   11:invokevirtual   #131 <Method CoroutineContext CoroutineDispatcher.plus(CoroutineContext)>
	//    6   14:invokestatic    #137 <Method CoroutineScope CoroutineScopeKt.CoroutineScope(CoroutineContext)>
	//    7   17:aconst_null     
	//    8   18:aconst_null     
	//    9   19:new             #8   <Class CoroutineWorker$startWork$1>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:invokespecial   #140 <Method void CoroutineWorker$startWork$1(CoroutineWorker, Continuation)>
	//   14   28:checkcast       #142 <Class Function2>
	//   15   31:iconst_3        
	//   16   32:aconst_null     
	//   17   33:invokestatic    #148 <Method Job BuildersKt.launch$default(CoroutineScope, CoroutineContext, kotlinx.coroutines.CoroutineStart, Function2, int, Object)>
	//   18   36:pop             
		return (ListenableFuture)future;
	//   19   37:aload_0         
	//   20   38:getfield        #79  <Field SettableFuture future>
	//   21   41:checkcast       #150 <Class ListenableFuture>
	//   22   44:areturn         
	}

	private final CoroutineDispatcher coroutineContext = Dispatchers.getDefault();
	private final SettableFuture future;
	private final Job job = JobKt.Job$default(((Job) (null)), 1, ((Object) (null)));
}
