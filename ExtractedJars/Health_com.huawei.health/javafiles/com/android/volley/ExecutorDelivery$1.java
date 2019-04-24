// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.android.volley:
//			ExecutorDelivery

class ExecutorDelivery$1
	implements Executor
{

	public void execute(Runnable runnable)
	{
		val$handler.post(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Handler val$handler>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #32  <Method boolean Handler.post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	final ExecutorDelivery this$0;
	final Handler val$handler;

	ExecutorDelivery$1()
	{
		this$0 = final_executordelivery;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ExecutorDelivery this$0>
		val$handler = Handler.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field Handler val$handler>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
