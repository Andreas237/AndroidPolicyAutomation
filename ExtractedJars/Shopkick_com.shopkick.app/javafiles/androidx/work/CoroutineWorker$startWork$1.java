// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import androidx.work.impl.utils.futures.SettableFuture;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

// Referenced classes of package androidx.work:
//			CoroutineWorker

static final class CoroutineWorker$startWork$1 extends SuspendLambda
	implements Function2
{

	public final Continuation create(Object obj, Continuation continuation)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (continuation)), "completion");
	//    0    0:aload_2         
	//    1    1:ldc1            #59  <String "completion">
	//    2    3:invokestatic    #65  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		continuation = ((Continuation) (new CoroutineWorker$startWork$1(CoroutineWorker.this, continuation)));
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
		return ((CoroutineWorker$startWork$1)create(obj, (Continuation)obj1)).invokeSuspend(((Object) (Unit.INSTANCE)));
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
	//	               0 64
	//	               1 42;
	//    4    8:tableswitch     0 1: default 32
	//	               0 64
	//	               1 42
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

	CoroutineWorker$startWork$1(CoroutineWorker coroutineworker, Continuation continuation)
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
