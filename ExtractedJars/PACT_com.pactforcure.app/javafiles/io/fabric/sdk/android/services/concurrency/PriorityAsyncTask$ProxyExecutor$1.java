// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency;


// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//			PriorityFutureTask, PriorityAsyncTask, Dependency

class PriorityAsyncTask$ProxyExecutor$1 extends PriorityFutureTask
{

	public Dependency getDelegate()
	{
		return ((Dependency) (PriorityAsyncTask.ProxyExecutor.access$000(PriorityAsyncTask.ProxyExecutor.this)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PriorityAsyncTask$ProxyExecutor this$0>
	//    2    4:invokestatic    #29  <Method PriorityAsyncTask PriorityAsyncTask$ProxyExecutor.access$000(PriorityAsyncTask$ProxyExecutor)>
	//    3    7:areturn         
	}

	final PriorityAsyncTask.ProxyExecutor this$0;

	PriorityAsyncTask$ProxyExecutor$1(Runnable runnable, Object obj)
	{
		this$0 = PriorityAsyncTask.ProxyExecutor.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field PriorityAsyncTask$ProxyExecutor this$0>
		super(runnable, obj);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #22  <Method void PriorityFutureTask(Runnable, Object)>
	//    7   11:return          
	}
}
