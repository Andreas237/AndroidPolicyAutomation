// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuation;

// Referenced classes of package androidx.work:
//			ListenableFutureKt

public static final class ListenableFutureKt$await$$inlined$suspendCancellableCoroutine$lambda$1
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

	public ListenableFutureKt$await$$inlined$suspendCancellableCoroutine$lambda$1(CancellableContinuation cancellablecontinuation, ListenableFuture listenablefuture)
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
