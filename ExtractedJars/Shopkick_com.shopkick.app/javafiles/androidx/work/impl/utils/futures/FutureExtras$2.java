// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils.futures;

import android.arch.core.util.Function;
import com.google.common.util.concurrent.ListenableFuture;

// Referenced classes of package androidx.work.impl.utils.futures:
//			FutureExtras, SettableFuture

static final class FutureExtras$2
	implements Runnable
{

	public void run()
	{
		try
		{
			Object obj = val$inputFuture.get();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ListenableFuture val$inputFuture>
	//    2    4:invokeinterface #38  <Method Object ListenableFuture.get()>
	//    3    9:astore_1        
			obj = ((Object) ((ListenableFuture)val$transformation.apply(obj)));
	//    4   10:aload_0         
	//    5   11:getfield        #23  <Field Function val$transformation>
	//    6   14:aload_1         
	//    7   15:invokeinterface #44  <Method Object Function.apply(Object)>
	//    8   20:checkcast       #34  <Class ListenableFuture>
	//    9   23:astore_1        
			val$outputFuture.setFuture(((ListenableFuture) (obj)));
	//   10   24:aload_0         
	//   11   25:getfield        #25  <Field SettableFuture val$outputFuture>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #50  <Method boolean SettableFuture.setFuture(ListenableFuture)>
	//   14   32:pop             
			return;
	//   15   33:return          
		}
		catch(Throwable throwable)
	//*  16   34:astore_1        
		{
			val$outputFuture.setException(throwable);
	//   17   35:aload_0         
	//   18   36:getfield        #25  <Field SettableFuture val$outputFuture>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #54  <Method boolean SettableFuture.setException(Throwable)>
	//   21   43:pop             
		}
	//   22   44:return          
	}

	final ListenableFuture val$inputFuture;
	final SettableFuture val$outputFuture;
	final Function val$transformation;

	FutureExtras$2(ListenableFuture listenablefuture, Function function, SettableFuture settablefuture)
	{
		val$inputFuture = listenablefuture;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field ListenableFuture val$inputFuture>
		val$transformation = function;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Function val$transformation>
		val$outputFuture = settablefuture;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field SettableFuture val$outputFuture>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
