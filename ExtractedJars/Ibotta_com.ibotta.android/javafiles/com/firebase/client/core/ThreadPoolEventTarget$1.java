// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.firebase.client.core:
//			ThreadPoolEventTarget, ThreadInitializer

class ThreadPoolEventTarget$1
	implements ThreadFactory
{

	public Thread newThread(Runnable runnable)
	{
		runnable = ((Runnable) (val$wrappedFactory.newThread(runnable)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ThreadFactory val$wrappedFactory>
	//    2    4:aload_1         
	//    3    5:invokeinterface #32  <Method Thread ThreadFactory.newThread(Runnable)>
	//    4   10:astore_1        
		val$threadInitializer.setName(((Thread) (runnable)), "FirebaseEventTarget");
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field ThreadInitializer val$threadInitializer>
	//    7   15:aload_1         
	//    8   16:ldc1            #34  <String "FirebaseEventTarget">
	//    9   18:invokeinterface #40  <Method void ThreadInitializer.setName(Thread, String)>
		val$threadInitializer.setDaemon(((Thread) (runnable)), true);
	//   10   23:aload_0         
	//   11   24:getfield        #24  <Field ThreadInitializer val$threadInitializer>
	//   12   27:aload_1         
	//   13   28:iconst_1        
	//   14   29:invokeinterface #44  <Method void ThreadInitializer.setDaemon(Thread, boolean)>
		return ((Thread) (runnable));
	//   15   34:aload_1         
	//   16   35:areturn         
	}

	final ThreadPoolEventTarget this$0;
	final ThreadInitializer val$threadInitializer;
	final ThreadFactory val$wrappedFactory;

	ThreadPoolEventTarget$1()
	{
		this$0 = final_threadpooleventtarget;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ThreadPoolEventTarget this$0>
		val$wrappedFactory = threadfactory;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field ThreadFactory val$wrappedFactory>
		val$threadInitializer = ThreadInitializer.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field ThreadInitializer val$threadInitializer>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
