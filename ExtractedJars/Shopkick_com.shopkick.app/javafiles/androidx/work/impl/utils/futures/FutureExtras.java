// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils.futures;

import android.arch.core.util.Function;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// Referenced classes of package androidx.work.impl.utils.futures:
//			SettableFuture

public class FutureExtras
{

	private FutureExtras()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static ListenableFuture flatMap(ListenableFuture listenablefuture, Executor executor, Function function)
	{
		SettableFuture settablefuture = SettableFuture.create();
	//    0    0:invokestatic    #26  <Method SettableFuture SettableFuture.create()>
	//    1    3:astore_3        
		listenablefuture.addListener(new Runnable(listenablefuture, function, settablefuture) {

			public void run()
			{
				try
				{
					Object obj = inputFuture.get();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field ListenableFuture val$inputFuture>
			//    2    4:invokeinterface #38  <Method Object ListenableFuture.get()>
			//    3    9:astore_1        
					obj = ((Object) ((ListenableFuture)transformation.apply(obj)));
			//    4   10:aload_0         
			//    5   11:getfield        #23  <Field Function val$transformation>
			//    6   14:aload_1         
			//    7   15:invokeinterface #44  <Method Object Function.apply(Object)>
			//    8   20:checkcast       #34  <Class ListenableFuture>
			//    9   23:astore_1        
					outputFuture.setFuture(((ListenableFuture) (obj)));
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
					outputFuture.setException(throwable);
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

			
			{
				inputFuture = listenablefuture;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ListenableFuture val$inputFuture>
				transformation = function;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Function val$transformation>
				outputFuture = settablefuture;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field SettableFuture val$outputFuture>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
, executor);
	//    2    4:aload_0         
	//    3    5:new             #8   <Class FutureExtras$2>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #29  <Method void FutureExtras$2(ListenableFuture, Function, SettableFuture)>
	//    9   15:aload_1         
	//   10   16:invokeinterface #35  <Method void ListenableFuture.addListener(Runnable, Executor)>
		return ((ListenableFuture) (settablefuture));
	//   11   21:aload_3         
	//   12   22:areturn         
	}

	public static ListenableFuture map(ListenableFuture listenablefuture, Executor executor, Function function)
	{
		SettableFuture settablefuture = SettableFuture.create();
	//    0    0:invokestatic    #26  <Method SettableFuture SettableFuture.create()>
	//    1    3:astore_3        
		listenablefuture.addListener(new Runnable(listenablefuture, function, settablefuture) {

			public void run()
			{
				try
				{
					Object obj = inputFuture.get();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field ListenableFuture val$inputFuture>
			//    2    4:invokeinterface #38  <Method Object ListenableFuture.get()>
			//    3    9:astore_1        
					obj = transformation.apply(obj);
			//    4   10:aload_0         
			//    5   11:getfield        #23  <Field Function val$transformation>
			//    6   14:aload_1         
			//    7   15:invokeinterface #44  <Method Object Function.apply(Object)>
			//    8   20:astore_1        
					outputFuture.set(obj);
			//    9   21:aload_0         
			//   10   22:getfield        #25  <Field SettableFuture val$outputFuture>
			//   11   25:aload_1         
			//   12   26:invokevirtual   #50  <Method boolean SettableFuture.set(Object)>
			//   13   29:pop             
					return;
			//   14   30:return          
				}
				catch(Throwable throwable)
			//*  15   31:astore_1        
				{
					outputFuture.setException(throwable);
			//   16   32:aload_0         
			//   17   33:getfield        #25  <Field SettableFuture val$outputFuture>
			//   18   36:aload_1         
			//   19   37:invokevirtual   #54  <Method boolean SettableFuture.setException(Throwable)>
			//   20   40:pop             
				}
			//   21   41:return          
			}

			final ListenableFuture val$inputFuture;
			final SettableFuture val$outputFuture;
			final Function val$transformation;

			
			{
				inputFuture = listenablefuture;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ListenableFuture val$inputFuture>
				transformation = function;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Function val$transformation>
				outputFuture = settablefuture;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field SettableFuture val$outputFuture>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
, executor);
	//    2    4:aload_0         
	//    3    5:new             #6   <Class FutureExtras$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #40  <Method void FutureExtras$1(ListenableFuture, Function, SettableFuture)>
	//    9   15:aload_1         
	//   10   16:invokeinterface #35  <Method void ListenableFuture.addListener(Runnable, Executor)>
		return ((ListenableFuture) (settablefuture));
	//   11   21:aload_3         
	//   12   22:areturn         
	}
}
