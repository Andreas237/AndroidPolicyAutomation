// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//			AsyncTask

class AsyncTask$2 extends rkerRunnable
{

	public Object call()
		throws Exception
	{
		AsyncTask.access$200(AsyncTask.this).set(true);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AsyncTask this$0>
	//    2    4:invokestatic    #27  <Method AtomicBoolean AsyncTask.access$200(AsyncTask)>
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #33  <Method void AtomicBoolean.set(boolean)>
		Process.setThreadPriority(10);
	//    5   11:bipush          10
	//    6   13:invokestatic    #39  <Method void Process.setThreadPriority(int)>
		return AsyncTask.access$300(AsyncTask.this, doInBackground(params));
	//    7   16:aload_0         
	//    8   17:getfield        #15  <Field AsyncTask this$0>
	//    9   20:aload_0         
	//   10   21:getfield        #15  <Field AsyncTask this$0>
	//   11   24:aload_0         
	//   12   25:getfield        #43  <Field Object[] params>
	//   13   28:invokevirtual   #47  <Method Object AsyncTask.doInBackground(Object[])>
	//   14   31:invokestatic    #51  <Method Object AsyncTask.access$300(AsyncTask, Object)>
	//   15   34:areturn         
	}

	final AsyncTask this$0;

	AsyncTask$2()
	{
		this$0 = AsyncTask.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AsyncTask this$0>
		super(((AsyncTask$1) (null)));
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #18  <Method void AsyncTask$WorkerRunnable(AsyncTask$1)>
	//    6   10:return          
	}
}
