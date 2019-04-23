// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

// Referenced classes of package androidx.work:
//			Operation, DirectExecutor

public final class OperationKt
{

	public static final Object await(Operation operation, Continuation continuation)
	{
label0:
		{
			if(continuation instanceof await._cls1)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #6   <Class OperationKt$await$1>
	//*   2    4:ifeq            38
			{
				await._cls1 _lcls1 = (await._cls1)continuation;
	//    3    7:aload_1         
	//    4    8:checkcast       #6   <Class OperationKt$await$1>
	//    5   11:astore_2        
				if((_lcls1.label & 0x80000000) != 0)
	//*   6   12:aload_2         
	//*   7   13:getfield        #32  <Field int OperationKt$await$1.label>
	//*   8   16:ldc1            #33  <Int 0x80000000>
	//*   9   18:iand            
	//*  10   19:ifeq            38
				{
					_lcls1.label = _lcls1.label + 0x80000000;
	//   11   22:aload_2         
	//   12   23:aload_2         
	//   13   24:getfield        #32  <Field int OperationKt$await$1.label>
	//   14   27:ldc1            #33  <Int 0x80000000>
	//   15   29:iadd            
	//   16   30:putfield        #32  <Field int OperationKt$await$1.label>
					continuation = ((Continuation) (_lcls1));
	//   17   33:aload_2         
	//   18   34:astore_1        
					break label0;
	//   19   35:goto            47
				}
			}
			continuation = ((Continuation) (new ContinuationImpl(continuation) {

				public final Object invokeSuspend(Object obj2)
				{
					result = obj2;
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:putfield        #56  <Field Object result>
					label = label | 0x80000000;
				//    3    5:aload_0         
				//    4    6:aload_0         
				//    5    7:getfield        #58  <Field int label>
				//    6   10:ldc1            #59  <Int 0x80000000>
				//    7   12:ior             
				//    8   13:putfield        #58  <Field int label>
					return OperationKt.await(((Operation) (null)), ((Continuation) (this)));
				//    9   16:aconst_null     
				//   10   17:aload_0         
				//   11   18:invokestatic    #60  <Method Object OperationKt.await(Operation, Continuation)>
				//   12   21:areturn         
				}

				Object L$0;
				Object L$1;
				int label;
				Object result;

			public 
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokespecial   #49  <Method void ContinuationImpl(Continuation)>
			//    3    5:return          
			}
			}
));
	//   20   38:new             #6   <Class OperationKt$await$1>
	//   21   41:dup             
	//   22   42:aload_1         
	//   23   43:invokespecial   #37  <Method void OperationKt$await$1(Continuation)>
	//   24   46:astore_1        
		}
		Object obj1 = ((await._cls1) (continuation)).result;
	//   25   47:aload_1         
	//   26   48:getfield        #41  <Field Object OperationKt$await$1.result>
	//   27   51:astore_3        
		Object obj = IntrinsicsKt.getCOROUTINE_SUSPENDED();
	//   28   52:invokestatic    #47  <Method Object IntrinsicsKt.getCOROUTINE_SUSPENDED()>
	//   29   55:astore_2        
		switch(((await._cls1) (continuation)).label)
	//*  30   56:aload_1         
	//*  31   57:getfield        #32  <Field int OperationKt$await$1.label>
		{
	//*  32   60:tableswitch     0 1: default 84
	//	               0 127
	//	               1 94
		default:
			throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
	//   33   84:new             #49  <Class IllegalStateException>
	//   34   87:dup             
	//   35   88:ldc1            #51  <String "call to 'resume' before 'invoke' with coroutine">
	//   36   90:invokespecial   #54  <Method void IllegalStateException(String)>
	//   37   93:athrow          

		case 1: // '\001'
			operation = ((Operation) ((ListenableFuture)((await._cls1) (continuation))._fld1));
	//   38   94:aload_1         
	//   39   95:getfield        #57  <Field Object OperationKt$await$1.L$1>
	//   40   98:checkcast       #59  <Class ListenableFuture>
	//   41  101:astore_0        
			operation = (Operation)((await._cls1) (continuation))._fld0;
	//   42  102:aload_1         
	//   43  103:getfield        #62  <Field Object OperationKt$await$1.L$0>
	//   44  106:checkcast       #64  <Class Operation>
	//   45  109:astore_0        
			if(!(obj1 instanceof kotlin.Result.Failure))
	//*  46  110:aload_3         
	//*  47  111:instanceof      #66  <Class kotlin.Result$Failure>
	//*  48  114:ifne            119
				return obj1;
	//   49  117:aload_3         
	//   50  118:areturn         
			else
				throw ((kotlin.Result.Failure)obj1).exception;
	//   51  119:aload_3         
	//   52  120:checkcast       #66  <Class kotlin.Result$Failure>
	//   53  123:getfield        #70  <Field Throwable kotlin.Result$Failure.exception>
	//   54  126:athrow          

		case 0: // '\0'
			break;
		}
		if(!(obj1 instanceof kotlin.Result.Failure))
	//*  55  127:aload_3         
	//*  56  128:instanceof      #66  <Class kotlin.Result$Failure>
	//*  57  131:ifne            269
		{
			obj1 = ((Object) (operation.getResult()));
	//   58  134:aload_0         
	//   59  135:invokeinterface #74  <Method ListenableFuture Operation.getResult()>
	//   60  140:astore_3        
			Intrinsics.checkExpressionValueIsNotNull(obj1, "result");
	//   61  141:aload_3         
	//   62  142:ldc1            #75  <String "result">
	//   63  144:invokestatic    #81  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			if(((ListenableFuture) (obj1)).isDone())
	//*  64  147:aload_3         
	//*  65  148:invokeinterface #85  <Method boolean ListenableFuture.isDone()>
	//*  66  153:ifeq            185
			{
				try
				{
					operation = ((Operation) (((ListenableFuture) (obj1)).get()));
	//   67  156:aload_3         
	//   68  157:invokeinterface #88  <Method Object ListenableFuture.get()>
	//   69  162:astore_0        
				}
	//*  70  163:aload_0         
	//*  71  164:areturn         
				// Misplaced declaration of an exception variable
				catch(Continuation continuation)
	//*  72  165:astore_1        
				{
					operation = ((Operation) (((ExecutionException) (continuation)).getCause()));
	//   73  166:aload_1         
	//   74  167:invokevirtual   #92  <Method Throwable ExecutionException.getCause()>
	//   75  170:astore_0        
					if(operation == null)
	//*  76  171:aload_0         
	//*  77  172:ifnull          178
	//*  78  175:goto            183
						operation = ((Operation) ((Throwable)continuation));
	//   79  178:aload_1         
	//   80  179:checkcast       #94  <Class Throwable>
	//   81  182:astore_0        
					throw operation;
	//   82  183:aload_0         
	//   83  184:athrow          
				}
				return ((Object) (operation));
			}
			continuation._fld0 = ((Object) (operation));
	//   84  185:aload_1         
	//   85  186:aload_0         
	//   86  187:putfield        #62  <Field Object OperationKt$await$1.L$0>
			continuation._fld1 = obj1;
	//   87  190:aload_1         
	//   88  191:aload_3         
	//   89  192:putfield        #57  <Field Object OperationKt$await$1.L$1>
			continuation.label = 1;
	//   90  195:aload_1         
	//   91  196:iconst_1        
	//   92  197:putfield        #32  <Field int OperationKt$await$1.label>
			operation = ((Operation) (new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1)));
	//   93  200:new             #96  <Class CancellableContinuationImpl>
	//   94  203:dup             
	//   95  204:aload_1         
	//   96  205:invokestatic    #100 <Method Continuation IntrinsicsKt.intercepted(Continuation)>
	//   97  208:iconst_1        
	//   98  209:invokespecial   #103 <Method void CancellableContinuationImpl(Continuation, int)>
	//   99  212:astore_0        
			((CancellableContinuationImpl) (operation)).initCancellability();
	//  100  213:aload_0         
	//  101  214:invokevirtual   #107 <Method void CancellableContinuationImpl.initCancellability()>
			class await..inlined.suspendCancellableCoroutine.lambda._cls1
				implements Runnable
			{

				public final void run()
				{
					try
					{
						Continuation continuation1 = (Continuation)$cancellableContinuation;
				//    0    0:aload_0         
				//    1    1:getfield        #35  <Field CancellableContinuation $cancellableContinuation>
				//    2    4:checkcast       #45  <Class Continuation>
				//    3    7:astore_1        
						Object obj2 = $this_await$inlined.get();
				//    4    8:aload_0         
				//    5    9:getfield        #37  <Field ListenableFuture $this_await$inlined>
				//    6   12:invokeinterface #51  <Method Object ListenableFuture.get()>
				//    7   17:astore_2        
						kotlin.Result.Companion companion = Result.Companion;
				//    8   18:getstatic       #57  <Field kotlin.Result$Companion Result.Companion>
				//    9   21:astore_3        
						continuation1.resumeWith(Result.constructor_2D_impl(obj2));
				//   10   22:aload_1         
				//   11   23:aload_2         
				//   12   24:invokestatic    #61  <Method Object Result.constructor_2D_impl(Object)>
				//   13   27:invokeinterface #65  <Method void Continuation.resumeWith(Object)>
						return;
				//   14   32:return          
					}
					catch(Throwable throwable1)
				//*  15   33:astore_2        
					{
						Throwable throwable = throwable1.getCause();
				//   16   34:aload_2         
				//   17   35:invokevirtual   #69  <Method Throwable Throwable.getCause()>
				//   18   38:astore_1        
						if(throwable == null)
				//*  19   39:aload_1         
				//*  20   40:ifnull          46
				//*  21   43:goto            48
							throwable = throwable1;
				//   22   46:aload_2         
				//   23   47:astore_1        
						if(throwable1 instanceof CancellationException)
				//*  24   48:aload_2         
				//*  25   49:instanceof      #71  <Class CancellationException>
				//*  26   52:ifeq            67
						{
							$cancellableContinuation.cancel(throwable);
				//   27   55:aload_0         
				//   28   56:getfield        #35  <Field CancellableContinuation $cancellableContinuation>
				//   29   59:aload_1         
				//   30   60:invokeinterface #77  <Method boolean CancellableContinuation.cancel(Throwable)>
				//   31   65:pop             
							return;
				//   32   66:return          
						} else
						{
							Continuation continuation2 = (Continuation)$cancellableContinuation;
				//   33   67:aload_0         
				//   34   68:getfield        #35  <Field CancellableContinuation $cancellableContinuation>
				//   35   71:checkcast       #45  <Class Continuation>
				//   36   74:astore_2        
							kotlin.Result.Companion companion1 = Result.Companion;
				//   37   75:getstatic       #57  <Field kotlin.Result$Companion Result.Companion>
				//   38   78:astore_3        
							continuation2.resumeWith(Result.constructor_2D_impl(ResultKt.createFailure(throwable)));
				//   39   79:aload_2         
				//   40   80:aload_1         
				//   41   81:invokestatic    #83  <Method Object ResultKt.createFailure(Throwable)>
				//   42   84:invokestatic    #61  <Method Object Result.constructor_2D_impl(Object)>
				//   43   87:invokeinterface #65  <Method void Continuation.resumeWith(Object)>
							return;
				//   44   92:return          
						}
					}
				}

				final CancellableContinuation $cancellableContinuation;
				final ListenableFuture $this_await$inlined;

			public await..inlined.suspendCancellableCoroutine.lambda._cls1(CancellableContinuation cancellablecontinuation, ListenableFuture listenablefuture)
			{
				$cancellableContinuation = cancellablecontinuation;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #35  <Field CancellableContinuation $cancellableContinuation>
				$this_await$inlined = listenablefuture;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #37  <Field ListenableFuture $this_await$inlined>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #40  <Method void Object()>
			//    8   14:return          
			}
			}

			((ListenableFuture) (obj1)).addListener((Runnable)new await..inlined.suspendCancellableCoroutine.lambda._cls1((CancellableContinuation)operation, ((ListenableFuture) (obj1))), (Executor)DirectExecutor.INSTANCE);
	//  102  217:aload_3         
	//  103  218:new             #109 <Class OperationKt$await$$inlined$suspendCancellableCoroutine$lambda$1>
	//  104  221:dup             
	//  105  222:aload_0         
	//  106  223:checkcast       #111 <Class CancellableContinuation>
	//  107  226:aload_3         
	//  108  227:invokespecial   #114 <Method void OperationKt$await$$inlined$suspendCancellableCoroutine$lambda$1(CancellableContinuation, ListenableFuture)>
	//  109  230:checkcast       #116 <Class Runnable>
	//  110  233:getstatic       #122 <Field DirectExecutor DirectExecutor.INSTANCE>
	//  111  236:checkcast       #124 <Class Executor>
	//  112  239:invokeinterface #128 <Method void ListenableFuture.addListener(Runnable, Executor)>
			operation = ((Operation) (((CancellableContinuationImpl) (operation)).getResult()));
	//  113  244:aload_0         
	//  114  245:invokevirtual   #130 <Method Object CancellableContinuationImpl.getResult()>
	//  115  248:astore_0        
			if(operation == IntrinsicsKt.getCOROUTINE_SUSPENDED())
	//* 116  249:aload_0         
	//* 117  250:invokestatic    #47  <Method Object IntrinsicsKt.getCOROUTINE_SUSPENDED()>
	//* 118  253:if_acmpne       260
				DebugProbesKt.probeCoroutineSuspended(continuation);
	//  119  256:aload_1         
	//  120  257:invokestatic    #135 <Method void DebugProbesKt.probeCoroutineSuspended(Continuation)>
			if(operation == obj)
	//* 121  260:aload_0         
	//* 122  261:aload_2         
	//* 123  262:if_acmpne       267
				return obj;
	//  124  265:aload_2         
	//  125  266:areturn         
			else
				return ((Object) (operation));
	//  126  267:aload_0         
	//  127  268:areturn         
		} else
		{
			throw ((kotlin.Result.Failure)obj1).exception;
	//  128  269:aload_3         
	//  129  270:checkcast       #66  <Class kotlin.Result$Failure>
	//  130  273:getfield        #70  <Field Throwable kotlin.Result$Failure.exception>
	//  131  276:athrow          
		}
	}

	private static final Object await$$forInline(Operation operation, Continuation continuation)
	{
		operation = ((Operation) (operation.getResult()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #74  <Method ListenableFuture Operation.getResult()>
	//    2    6:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (operation)), "result");
	//    3    7:aload_0         
	//    4    8:ldc1            #75  <String "result">
	//    5   10:invokestatic    #81  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		if(((ListenableFuture) (operation)).isDone())
	//*   6   13:aload_0         
	//*   7   14:invokeinterface #85  <Method boolean ListenableFuture.isDone()>
	//*   8   19:ifeq            51
		{
			try
			{
				operation = ((Operation) (((ListenableFuture) (operation)).get()));
	//    9   22:aload_0         
	//   10   23:invokeinterface #88  <Method Object ListenableFuture.get()>
	//   11   28:astore_0        
			}
	//*  12   29:aload_0         
	//*  13   30:areturn         
			// Misplaced declaration of an exception variable
			catch(Continuation continuation)
	//*  14   31:astore_1        
			{
				operation = ((Operation) (((ExecutionException) (continuation)).getCause()));
	//   15   32:aload_1         
	//   16   33:invokevirtual   #92  <Method Throwable ExecutionException.getCause()>
	//   17   36:astore_0        
				if(operation == null)
	//*  18   37:aload_0         
	//*  19   38:ifnull          44
	//*  20   41:goto            49
					operation = ((Operation) ((Throwable)continuation));
	//   21   44:aload_1         
	//   22   45:checkcast       #94  <Class Throwable>
	//   23   48:astore_0        
				throw operation;
	//   24   49:aload_0         
	//   25   50:athrow          
			}
			return ((Object) (operation));
		}
		InlineMarker.mark(0);
	//   26   51:iconst_0        
	//   27   52:invokestatic    #147 <Method void InlineMarker.mark(int)>
		CancellableContinuationImpl cancellablecontinuationimpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
	//   28   55:new             #96  <Class CancellableContinuationImpl>
	//   29   58:dup             
	//   30   59:aload_1         
	//   31   60:invokestatic    #100 <Method Continuation IntrinsicsKt.intercepted(Continuation)>
	//   32   63:iconst_1        
	//   33   64:invokespecial   #103 <Method void CancellableContinuationImpl(Continuation, int)>
	//   34   67:astore_2        
		cancellablecontinuationimpl.initCancellability();
	//   35   68:aload_2         
	//   36   69:invokevirtual   #107 <Method void CancellableContinuationImpl.initCancellability()>
		((ListenableFuture) (operation)).addListener((Runnable)new await..inlined.suspendCancellableCoroutine.lambda._cls1((CancellableContinuation)cancellablecontinuationimpl, ((ListenableFuture) (operation))), (Executor)DirectExecutor.INSTANCE);
	//   37   72:aload_0         
	//   38   73:new             #109 <Class OperationKt$await$$inlined$suspendCancellableCoroutine$lambda$1>
	//   39   76:dup             
	//   40   77:aload_2         
	//   41   78:checkcast       #111 <Class CancellableContinuation>
	//   42   81:aload_0         
	//   43   82:invokespecial   #114 <Method void OperationKt$await$$inlined$suspendCancellableCoroutine$lambda$1(CancellableContinuation, ListenableFuture)>
	//   44   85:checkcast       #116 <Class Runnable>
	//   45   88:getstatic       #122 <Field DirectExecutor DirectExecutor.INSTANCE>
	//   46   91:checkcast       #124 <Class Executor>
	//   47   94:invokeinterface #128 <Method void ListenableFuture.addListener(Runnable, Executor)>
		operation = ((Operation) (cancellablecontinuationimpl.getResult()));
	//   48   99:aload_2         
	//   49  100:invokevirtual   #130 <Method Object CancellableContinuationImpl.getResult()>
	//   50  103:astore_0        
		if(operation == IntrinsicsKt.getCOROUTINE_SUSPENDED())
	//*  51  104:aload_0         
	//*  52  105:invokestatic    #47  <Method Object IntrinsicsKt.getCOROUTINE_SUSPENDED()>
	//*  53  108:if_acmpne       115
			DebugProbesKt.probeCoroutineSuspended(continuation);
	//   54  111:aload_1         
	//   55  112:invokestatic    #135 <Method void DebugProbesKt.probeCoroutineSuspended(Continuation)>
		InlineMarker.mark(1);
	//   56  115:iconst_1        
	//   57  116:invokestatic    #147 <Method void InlineMarker.mark(int)>
		return ((Object) (operation));
	//   58  119:aload_0         
	//   59  120:areturn         
	}
}
