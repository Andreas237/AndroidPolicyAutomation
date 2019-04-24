// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency;

import android.os.*;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//			AsyncTask

private static class AsyncTask$InternalHandler extends Handler
{

	public void handleMessage(Message message)
	{
		AsyncTask$AsyncTaskResult asynctask$asynctaskresult = (AsyncTask$AsyncTaskResult)message.obj;
	//    0    0:aload_1         
	//    1    1:getfield        #27  <Field Object Message.obj>
	//    2    4:checkcast       #29  <Class AsyncTask$AsyncTaskResult>
	//    3    7:astore_2        
		switch(message.what)
	//*   4    8:aload_1         
	//*   5    9:getfield        #33  <Field int Message.what>
		{
	//*   6   12:tableswitch     1 2: default 36
	//	               1 37
	//	               2 51
		default:
			return;
	//    7   36:return          

		case 1: // '\001'
			AsyncTask.access$500(asynctask$asynctaskresult.task, asynctask$asynctaskresult.data[0]);
	//    8   37:aload_2         
	//    9   38:getfield        #37  <Field AsyncTask AsyncTask$AsyncTaskResult.task>
	//   10   41:aload_2         
	//   11   42:getfield        #41  <Field Object[] AsyncTask$AsyncTaskResult.data>
	//   12   45:iconst_0        
	//   13   46:aaload          
	//   14   47:invokestatic    #45  <Method void AsyncTask.access$500(AsyncTask, Object)>
			return;
	//   15   50:return          

		case 2: // '\002'
			asynctask$asynctaskresult.task.onProgressUpdate(asynctask$asynctaskresult.data);
	//   16   51:aload_2         
	//   17   52:getfield        #37  <Field AsyncTask AsyncTask$AsyncTaskResult.task>
	//   18   55:aload_2         
	//   19   56:getfield        #41  <Field Object[] AsyncTask$AsyncTaskResult.data>
	//   20   59:invokevirtual   #49  <Method void AsyncTask.onProgressUpdate(Object[])>
			break;
		}
	//   21   62:return          
	}

	public AsyncTask$InternalHandler()
	{
		super(Looper.getMainLooper());
	//    0    0:aload_0         
	//    1    1:invokestatic    #15  <Method Looper Looper.getMainLooper()>
	//    2    4:invokespecial   #18  <Method void Handler(Looper)>
	//    3    7:return          
	}
}
