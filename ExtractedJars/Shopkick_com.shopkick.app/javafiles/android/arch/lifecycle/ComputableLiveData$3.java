// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package android.arch.lifecycle:
//			ComputableLiveData, LiveData

class ComputableLiveData$3
	implements Runnable
{

	public void run()
	{
		boolean flag = ComputableLiveData.access$300(ComputableLiveData.this).hasActiveObservers();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ComputableLiveData this$0>
	//    2    4:invokestatic    #24  <Method LiveData ComputableLiveData.access$300(ComputableLiveData)>
	//    3    7:invokevirtual   #30  <Method boolean LiveData.hasActiveObservers()>
	//    4   10:istore_1        
		if(ComputableLiveData.access$200(ComputableLiveData.this).compareAndSet(false, true) && flag)
	//*   5   11:aload_0         
	//*   6   12:getfield        #14  <Field ComputableLiveData this$0>
	//*   7   15:invokestatic    #34  <Method AtomicBoolean ComputableLiveData.access$200(ComputableLiveData)>
	//*   8   18:iconst_0        
	//*   9   19:iconst_1        
	//*  10   20:invokevirtual   #40  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*  11   23:ifeq            49
	//*  12   26:iload_1         
	//*  13   27:ifeq            49
			ComputableLiveData.access$000(ComputableLiveData.this).execute(mRefreshRunnable);
	//   14   30:aload_0         
	//   15   31:getfield        #14  <Field ComputableLiveData this$0>
	//   16   34:invokestatic    #44  <Method Executor ComputableLiveData.access$000(ComputableLiveData)>
	//   17   37:aload_0         
	//   18   38:getfield        #14  <Field ComputableLiveData this$0>
	//   19   41:getfield        #48  <Field Runnable ComputableLiveData.mRefreshRunnable>
	//   20   44:invokeinterface #54  <Method void Executor.execute(Runnable)>
	//   21   49:return          
	}

	final ComputableLiveData this$0;

	ComputableLiveData$3()
	{
		this$0 = ComputableLiveData.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ComputableLiveData this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
