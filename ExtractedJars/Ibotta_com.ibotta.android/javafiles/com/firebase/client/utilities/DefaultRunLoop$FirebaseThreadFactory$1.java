// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities;


// Referenced classes of package com.firebase.client.utilities:
//			DefaultRunLoop

class DefaultRunLoop$FirebaseThreadFactory$1
	implements Thread.UncaughtExceptionHandler
{

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

	DefaultRunLoop$FirebaseThreadFactory$1()
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
