// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities;

import com.firebase.client.core.ThreadInitializer;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.firebase.client.utilities:
//			DefaultRunLoop

private class DefaultRunLoop$FirebaseThreadFactory
	implements ThreadFactory
{

	public Thread newThread(Runnable runnable)
	{
		runnable = ((Runnable) (getThreadFactory().newThread(runnable)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field DefaultRunLoop this$0>
	//    2    4:invokevirtual   #30  <Method ThreadFactory DefaultRunLoop.getThreadFactory()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #32  <Method Thread ThreadFactory.newThread(Runnable)>
	//    5   13:astore_1        
		ThreadInitializer threadinitializer = getThreadInitializer();
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field DefaultRunLoop this$0>
	//    8   18:invokevirtual   #36  <Method ThreadInitializer DefaultRunLoop.getThreadInitializer()>
	//    9   21:astore_2        
		threadinitializer.setName(((Thread) (runnable)), "FirebaseWorker");
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:ldc1            #38  <String "FirebaseWorker">
	//   13   26:invokeinterface #44  <Method void ThreadInitializer.setName(Thread, String)>
		threadinitializer.setDaemon(((Thread) (runnable)), true);
	//   14   31:aload_2         
	//   15   32:aload_1         
	//   16   33:iconst_1        
	//   17   34:invokeinterface #48  <Method void ThreadInitializer.setDaemon(Thread, boolean)>
		threadinitializer.setUncaughtExceptionHandler(((Thread) (runnable)), new Thread.UncaughtExceptionHandler() {

			public void uncaughtException(Thread thread, Throwable throwable)
			{
				handleException(throwable);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field DefaultRunLoop$FirebaseThreadFactory this$1>
			//    2    4:getfield        #30  <Field DefaultRunLoop DefaultRunLoop$FirebaseThreadFactory.this$0>
			//    3    7:aload_2         
			//    4    8:invokevirtual   #34  <Method void DefaultRunLoop.handleException(Throwable)>
			//    5   11:return          
			}

			final DefaultRunLoop.FirebaseThreadFactory this$1;

			
			{
				this$1 = DefaultRunLoop.FirebaseThreadFactory.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field DefaultRunLoop$FirebaseThreadFactory this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   18   39:aload_2         
	//   19   40:aload_1         
	//   20   41:new             #11  <Class DefaultRunLoop$FirebaseThreadFactory$1>
	//   21   44:dup             
	//   22   45:aload_0         
	//   23   46:invokespecial   #51  <Method void DefaultRunLoop$FirebaseThreadFactory$1(DefaultRunLoop$FirebaseThreadFactory)>
	//   24   49:invokeinterface #55  <Method void ThreadInitializer.setUncaughtExceptionHandler(Thread, Thread$UncaughtExceptionHandler)>
		return ((Thread) (runnable));
	//   25   54:aload_1         
	//   26   55:areturn         
	}

	final DefaultRunLoop this$0;

	private DefaultRunLoop$FirebaseThreadFactory()
	{
		this$0 = DefaultRunLoop.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DefaultRunLoop this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	DefaultRunLoop$FirebaseThreadFactory(DefaultRunLoop._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void DefaultRunLoop$FirebaseThreadFactory(DefaultRunLoop)>
	//    3    5:return          
	}
}
