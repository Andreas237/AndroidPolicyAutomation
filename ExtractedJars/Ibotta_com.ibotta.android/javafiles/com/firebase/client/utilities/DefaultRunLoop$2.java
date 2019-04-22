// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities;


// Referenced classes of package com.firebase.client.utilities:
//			DefaultRunLoop

class DefaultRunLoop$2
	implements Runnable
{

	public void run()
	{
		try
		{
			val$runnable.run();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Runnable val$runnable>
	//    2    4:invokeinterface #30  <Method void Runnable.run()>
			return;
	//    3    9:return          
		}
		catch(Throwable throwable)
	//*   4   10:astore_1        
		{
			handleException(throwable);
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field DefaultRunLoop this$0>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #34  <Method void DefaultRunLoop.handleException(Throwable)>
		}
	//    9   19:return          
	}

	final DefaultRunLoop this$0;
	final Runnable val$runnable;

	DefaultRunLoop$2()
	{
		this$0 = final_defaultrunloop;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field DefaultRunLoop this$0>
		val$runnable = Runnable.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Runnable val$runnable>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
