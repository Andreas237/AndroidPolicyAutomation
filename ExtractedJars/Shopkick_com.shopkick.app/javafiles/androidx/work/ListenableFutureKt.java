// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.*;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

// Referenced classes of package androidx.work:
//			DirectExecutor

public final class ListenableFutureKt
{

	public static final Object await(ListenableFuture listenablefuture, Continuation continuation)
	{
		if(listenablefuture.isDone())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #43  <Method boolean ListenableFuture.isDone()>
	//*   2    6:ifeq            38
		{
			try
			{
				listenablefuture = ((ListenableFuture) (listenablefuture.get()));
	//    3    9:aload_0         
	//    4   10:invokeinterface #47  <Method Object ListenableFuture.get()>
	//    5   15:astore_0        
			}
	//*   6   16:aload_0         
	//*   7   17:areturn         
			// Misplaced declaration of an exception variable
			catch(Continuation continuation)
	//*   8   18:astore_1        
			{
				listenablefuture = ((ListenableFuture) (((ExecutionException) (continuation)).getCause()));
	//    9   19:aload_1         
	//   10   20:invokevirtual   #51  <Method Throwable ExecutionException.getCause()>
	//   11   23:astore_0        
				if(listenablefuture == null)
	//*  12   24:aload_0         
	//*  13   25:ifnull          31
	//*  14   28:goto            36
					listenablefuture = ((ListenableFuture) ((Throwable)continuation));
	//   15   31:aload_1         
	//   16   32:checkcast       #53  <Class Throwable>
	//   17   35:astore_0        
				throw listenablefuture;
	//   18   36:aload_0         
	//   19   37:athrow          
			}
			return ((Object) (listenablefuture));
		}
		CancellableContinuationImpl cancellablecontinuationimpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
	//   20   38:new             #55  <Class CancellableContinuationImpl>
	//   21   41:dup             
	//   22   42:aload_1         
	//   23   43:invokestatic    #61  <Method Continuation IntrinsicsKt.intercepted(Continuation)>
	//   24   46:iconst_1        
	//   25   47:invokespecial   #65  <Method void CancellableContinuationImpl(Continuation, int)>
	//   26   50:astore_2        
		cancellablecontinuationimpl.initCancellability();
	//   27   51:aload_2         
	//   28   52:invokevirtual   #69  <Method void CancellableContinuationImpl.initCancellability()>
		listenablefuture.addListener((Runnable)new Runnable((CancellableContinuation)cancellablecontinuationimpl, listenablefuture) {

			public final void run()
			{
				try
				{
					Continuation continuation1 = (Continuation)$cancellableContinuation;
			//    0    0:aload_0         
			//    1    1:getfield        #35  <Field CancellableContinuation $cancellableContinuation>
			//    2    4:checkcast       #45  <Class Continuation>
			//    3    7:astore_1        
					Object obj = $this_await$inlined.get();
			//    4    8:aload_0         
			//    5    9:getfield        #37  <Field ListenableFuture $this_await$inlined>
			//    6   12:invokeinterface #51  <Method Object ListenableFuture.get()>
			//    7   17:astore_2        
					kotlin.Result.Companion companion = Result.Companion;
			//    8   18:getstatic       #57  <Field kotlin.Result$Companion Result.Companion>
			//    9   21:astore_3        
					continuation1.resumeWith(Result.constructor_2D_impl(obj));
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

			public 
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
, (Executor)DirectExecutor.INSTANCE);
	//   29   55:aload_0         
	//   30   56:new             #6   <Class ListenableFutureKt$await$$inlined$suspendCancellableCoroutine$lambda$1>
	//   31   59:dup             
	//   32   60:aload_2         
	//   33   61:checkcast       #71  <Class CancellableContinuation>
	//   34   64:aload_0         
	//   35   65:invokespecial   #74  <Method void ListenableFutureKt$await$$inlined$suspendCancellableCoroutine$lambda$1(CancellableContinuation, ListenableFuture)>
	//   36   68:checkcast       #76  <Class Runnable>
	//   37   71:getstatic       #82  <Field DirectExecutor DirectExecutor.INSTANCE>
	//   38   74:checkcast       #84  <Class Executor>
	//   39   77:invokeinterface #88  <Method void ListenableFuture.addListener(Runnable, Executor)>
		listenablefuture = ((ListenableFuture) (cancellablecontinuationimpl.getResult()));
	//   40   82:aload_2         
	//   41   83:invokevirtual   #91  <Method Object CancellableContinuationImpl.getResult()>
	//   42   86:astore_0        
		if(listenablefuture == IntrinsicsKt.getCOROUTINE_SUSPENDED())
	//*  43   87:aload_0         
	//*  44   88:invokestatic    #94  <Method Object IntrinsicsKt.getCOROUTINE_SUSPENDED()>
	//*  45   91:if_acmpne       98
			DebugProbesKt.probeCoroutineSuspended(continuation);
	//   46   94:aload_1         
	//   47   95:invokestatic    #100 <Method void DebugProbesKt.probeCoroutineSuspended(Continuation)>
		return ((Object) (listenablefuture));
	//   48   98:aload_0         
	//   49   99:areturn         
	}

	private static final Object await$$forInline(ListenableFuture listenablefuture, Continuation continuation)
	{
		if(listenablefuture.isDone())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #43  <Method boolean ListenableFuture.isDone()>
	//*   2    6:ifeq            38
		{
			try
			{
				listenablefuture = ((ListenableFuture) (listenablefuture.get()));
	//    3    9:aload_0         
	//    4   10:invokeinterface #47  <Method Object ListenableFuture.get()>
	//    5   15:astore_0        
			}
	//*   6   16:aload_0         
	//*   7   17:areturn         
			// Misplaced declaration of an exception variable
			catch(Continuation continuation)
	//*   8   18:astore_1        
			{
				listenablefuture = ((ListenableFuture) (((ExecutionException) (continuation)).getCause()));
	//    9   19:aload_1         
	//   10   20:invokevirtual   #51  <Method Throwable ExecutionException.getCause()>
	//   11   23:astore_0        
				if(listenablefuture == null)
	//*  12   24:aload_0         
	//*  13   25:ifnull          31
	//*  14   28:goto            36
					listenablefuture = ((ListenableFuture) ((Throwable)continuation));
	//   15   31:aload_1         
	//   16   32:checkcast       #53  <Class Throwable>
	//   17   35:astore_0        
				throw listenablefuture;
	//   18   36:aload_0         
	//   19   37:athrow          
			}
			return ((Object) (listenablefuture));
		}
		InlineMarker.mark(0);
	//   20   38:iconst_0        
	//   21   39:invokestatic    #112 <Method void InlineMarker.mark(int)>
		CancellableContinuationImpl cancellablecontinuationimpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
	//   22   42:new             #55  <Class CancellableContinuationImpl>
	//   23   45:dup             
	//   24   46:aload_1         
	//   25   47:invokestatic    #61  <Method Continuation IntrinsicsKt.intercepted(Continuation)>
	//   26   50:iconst_1        
	//   27   51:invokespecial   #65  <Method void CancellableContinuationImpl(Continuation, int)>
	//   28   54:astore_2        
		cancellablecontinuationimpl.initCancellability();
	//   29   55:aload_2         
	//   30   56:invokevirtual   #69  <Method void CancellableContinuationImpl.initCancellability()>
		listenablefuture.addListener((Runnable)new await..inlined.suspendCancellableCoroutine.lambda._cls1((CancellableContinuation)cancellablecontinuationimpl, listenablefuture), (Executor)DirectExecutor.INSTANCE);
	//   31   59:aload_0         
	//   32   60:new             #6   <Class ListenableFutureKt$await$$inlined$suspendCancellableCoroutine$lambda$1>
	//   33   63:dup             
	//   34   64:aload_2         
	//   35   65:checkcast       #71  <Class CancellableContinuation>
	//   36   68:aload_0         
	//   37   69:invokespecial   #74  <Method void ListenableFutureKt$await$$inlined$suspendCancellableCoroutine$lambda$1(CancellableContinuation, ListenableFuture)>
	//   38   72:checkcast       #76  <Class Runnable>
	//   39   75:getstatic       #82  <Field DirectExecutor DirectExecutor.INSTANCE>
	//   40   78:checkcast       #84  <Class Executor>
	//   41   81:invokeinterface #88  <Method void ListenableFuture.addListener(Runnable, Executor)>
		listenablefuture = ((ListenableFuture) (cancellablecontinuationimpl.getResult()));
	//   42   86:aload_2         
	//   43   87:invokevirtual   #91  <Method Object CancellableContinuationImpl.getResult()>
	//   44   90:astore_0        
		if(listenablefuture == IntrinsicsKt.getCOROUTINE_SUSPENDED())
	//*  45   91:aload_0         
	//*  46   92:invokestatic    #94  <Method Object IntrinsicsKt.getCOROUTINE_SUSPENDED()>
	//*  47   95:if_acmpne       102
			DebugProbesKt.probeCoroutineSuspended(continuation);
	//   48   98:aload_1         
	//   49   99:invokestatic    #100 <Method void DebugProbesKt.probeCoroutineSuspended(Continuation)>
		InlineMarker.mark(1);
	//   50  102:iconst_1        
	//   51  103:invokestatic    #112 <Method void InlineMarker.mark(int)>
		return ((Object) (listenablefuture));
	//   52  106:aload_0         
	//   53  107:areturn         
	}

	// Unreferenced inner class androidx/work/ListenableFutureKt$await$$inlined$suspendCancellableCoroutine$lambda$2

/* anonymous class */
	public static final class await..inlined.suspendCancellableCoroutine.lambda._cls2
		implements Runnable
	{

		public final void run()
		{
			try
			{
				Continuation continuation = (Continuation)$cancellableContinuation;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field CancellableContinuation $cancellableContinuation>
		//    2    4:checkcast       #45  <Class Continuation>
		//    3    7:astore_1        
				Object obj = $this_await$inlined.get();
		//    4    8:aload_0         
		//    5    9:getfield        #37  <Field ListenableFuture $this_await$inlined>
		//    6   12:invokeinterface #51  <Method Object ListenableFuture.get()>
		//    7   17:astore_2        
				kotlin.Result.Companion companion = Result.Companion;
		//    8   18:getstatic       #57  <Field kotlin.Result$Companion Result.Companion>
		//    9   21:astore_3        
				continuation.resumeWith(Result.constructor_2D_impl(obj));
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
					Continuation continuation1 = (Continuation)$cancellableContinuation;
		//   33   67:aload_0         
		//   34   68:getfield        #35  <Field CancellableContinuation $cancellableContinuation>
		//   35   71:checkcast       #45  <Class Continuation>
		//   36   74:astore_2        
					kotlin.Result.Companion companion1 = Result.Companion;
		//   37   75:getstatic       #57  <Field kotlin.Result$Companion Result.Companion>
		//   38   78:astore_3        
					continuation1.resumeWith(Result.constructor_2D_impl(ResultKt.createFailure(throwable)));
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

			public 
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


	// Unreferenced inner class androidx/work/OperationKt$await$$inlined$suspendCancellableCoroutine$lambda$1

/* anonymous class */
	public static final class OperationKt.await..inlined.suspendCancellableCoroutine.lambda._cls1
		implements Runnable
	{

		public final void run()
		{
			try
			{
				Continuation continuation = (Continuation)$cancellableContinuation;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field CancellableContinuation $cancellableContinuation>
		//    2    4:checkcast       #45  <Class Continuation>
		//    3    7:astore_1        
				Object obj = $this_await$inlined.get();
		//    4    8:aload_0         
		//    5    9:getfield        #37  <Field ListenableFuture $this_await$inlined>
		//    6   12:invokeinterface #51  <Method Object ListenableFuture.get()>
		//    7   17:astore_2        
				kotlin.Result.Companion companion = Result.Companion;
		//    8   18:getstatic       #57  <Field kotlin.Result$Companion Result.Companion>
		//    9   21:astore_3        
				continuation.resumeWith(Result.constructor_2D_impl(obj));
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
					Continuation continuation1 = (Continuation)$cancellableContinuation;
		//   33   67:aload_0         
		//   34   68:getfield        #35  <Field CancellableContinuation $cancellableContinuation>
		//   35   71:checkcast       #45  <Class Continuation>
		//   36   74:astore_2        
					kotlin.Result.Companion companion1 = Result.Companion;
		//   37   75:getstatic       #57  <Field kotlin.Result$Companion Result.Companion>
		//   38   78:astore_3        
					continuation1.resumeWith(Result.constructor_2D_impl(ResultKt.createFailure(throwable)));
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

			public 
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


	// Unreferenced inner class androidx/work/OperationKt$await$$inlined$suspendCancellableCoroutine$lambda$2

/* anonymous class */
	public static final class OperationKt.await..inlined.suspendCancellableCoroutine.lambda._cls2
		implements Runnable
	{

		public final void run()
		{
			try
			{
				Continuation continuation = (Continuation)$cancellableContinuation;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field CancellableContinuation $cancellableContinuation>
		//    2    4:checkcast       #45  <Class Continuation>
		//    3    7:astore_1        
				Object obj = $this_await$inlined.get();
		//    4    8:aload_0         
		//    5    9:getfield        #37  <Field ListenableFuture $this_await$inlined>
		//    6   12:invokeinterface #51  <Method Object ListenableFuture.get()>
		//    7   17:astore_2        
				kotlin.Result.Companion companion = Result.Companion;
		//    8   18:getstatic       #57  <Field kotlin.Result$Companion Result.Companion>
		//    9   21:astore_3        
				continuation.resumeWith(Result.constructor_2D_impl(obj));
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
					Continuation continuation1 = (Continuation)$cancellableContinuation;
		//   33   67:aload_0         
		//   34   68:getfield        #35  <Field CancellableContinuation $cancellableContinuation>
		//   35   71:checkcast       #45  <Class Continuation>
		//   36   74:astore_2        
					kotlin.Result.Companion companion1 = Result.Companion;
		//   37   75:getstatic       #57  <Field kotlin.Result$Companion Result.Companion>
		//   38   78:astore_3        
					continuation1.resumeWith(Result.constructor_2D_impl(ResultKt.createFailure(throwable)));
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

			public 
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

}
