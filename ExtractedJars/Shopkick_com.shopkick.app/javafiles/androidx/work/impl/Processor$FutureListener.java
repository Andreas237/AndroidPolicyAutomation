// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

// Referenced classes of package androidx.work.impl:
//			Processor, ExecutionListener

private static class Processor$FutureListener
	implements Runnable
{

	public void run()
	{
		Object obj;
		boolean flag;
		try
		{
			flag = ((Boolean)mFuture.get()).booleanValue();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ListenableFuture mFuture>
	//    2    4:invokeinterface #43  <Method Object ListenableFuture.get()>
	//    3    9:checkcast       #45  <Class Boolean>
	//    4   12:invokevirtual   #49  <Method boolean Boolean.booleanValue()>
	//    5   15:istore_1        
		}
	//*   6   16:goto            21
	//*   7   19:iconst_1        
	//*   8   20:istore_1        
	//*   9   21:aload_0         
	//*  10   22:getfield        #24  <Field ExecutionListener mExecutionListener>
	//*  11   25:aload_0         
	//*  12   26:getfield        #26  <Field String mWorkSpecId>
	//*  13   29:iload_1         
	//*  14   30:invokeinterface #55  <Method void ExecutionListener.onExecuted(String, boolean)>
	//*  15   35:return          
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			flag = true;
		}
		mExecutionListener.onExecuted(mWorkSpecId, flag);
	//*  16   36:astore_2        
	//*  17   37:goto            19
	}

	private ExecutionListener mExecutionListener;
	private ListenableFuture mFuture;
	private String mWorkSpecId;

	Processor$FutureListener(ExecutionListener executionlistener, String s, ListenableFuture listenablefuture)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mExecutionListener = executionlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field ExecutionListener mExecutionListener>
		mWorkSpecId = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field String mWorkSpecId>
		mFuture = listenablefuture;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field ListenableFuture mFuture>
	//   11   19:return          
	}
}
