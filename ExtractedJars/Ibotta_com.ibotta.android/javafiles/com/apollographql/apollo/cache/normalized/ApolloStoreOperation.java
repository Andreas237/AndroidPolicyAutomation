// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.exception.ApolloException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public abstract class ApolloStoreOperation
{
	public static interface Callback
	{

		public abstract void onFailure(Throwable throwable);

		public abstract void onSuccess(Object obj);
	}


	protected ApolloStoreOperation(Executor executor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		callback = new AtomicReference();
	//    2    4:aload_0         
	//    3    5:new             #24  <Class AtomicReference>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void AtomicReference()>
	//    6   12:putfield        #27  <Field AtomicReference callback>
	//    7   15:aload_0         
	//    8   16:new             #29  <Class AtomicBoolean>
	//    9   19:dup             
	//   10   20:invokespecial   #30  <Method void AtomicBoolean()>
	//   11   23:putfield        #32  <Field AtomicBoolean executed>
		dispatcher = executor;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #34  <Field Executor dispatcher>
	//   15   31:return          
	}

	private void checkIfExecuted()
	{
		if(executed.compareAndSet(false, true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field AtomicBoolean executed>
	//*   2    4:iconst_0        
	//*   3    5:iconst_1        
	//*   4    6:invokevirtual   #40  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   5    9:ifeq            13
			return;
	//    6   12:return          
		else
			throw new IllegalStateException("Already Executed");
	//    7   13:new             #42  <Class IllegalStateException>
	//    8   16:dup             
	//    9   17:ldc1            #44  <String "Already Executed">
	//   10   19:invokespecial   #47  <Method void IllegalStateException(String)>
	//   11   22:athrow          
	}

	public static ApolloStoreOperation emptyOperation(Object obj)
	{
		return ((ApolloStoreOperation) (new ApolloStoreOperation(obj) {

			protected Object perform()
			{
				return result;
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field Object val$result>
			//    2    4:areturn         
			}

			final Object val$result;

			
			{
				result = obj;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #14  <Field Object val$result>
				super(final_executor);
			//    3    5:aload_0         
			//    4    6:aload_1         
			//    5    7:invokespecial   #17  <Method void ApolloStoreOperation(Executor)>
			//    6   10:return          
			}
		}
));
	//    0    0:new             #7   <Class ApolloStoreOperation$1>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_0         
	//    4    6:invokespecial   #52  <Method void ApolloStoreOperation$1(Executor, Object)>
	//    5    9:areturn         
	}

	public final Object execute()
		throws ApolloException
	{
		checkIfExecuted();
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void checkIfExecuted()>
		Object obj;
		try
		{
			obj = perform();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #65  <Method Object perform()>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		catch(Exception exception)
	//*   7   11:astore_1        
		{
			throw new ApolloException("Failed to perform store operation", ((Throwable) (exception)));
	//    8   12:new             #58  <Class ApolloException>
	//    9   15:dup             
	//   10   16:ldc1            #67  <String "Failed to perform store operation">
	//   11   18:aload_1         
	//   12   19:invokespecial   #70  <Method void ApolloException(String, Throwable)>
	//   13   22:athrow          
		}
		return obj;
	}

	protected abstract Object perform();

	private AtomicReference callback;
	private final Executor dispatcher;
	private final AtomicBoolean executed = new AtomicBoolean();
}
