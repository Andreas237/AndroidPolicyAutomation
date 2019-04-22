// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.os.*;

// Referenced classes of package android.support.v4.content:
//			ModernAsyncTask

private static class ModernAsyncTask$InternalHandler extends Handler
{

	public void handleMessage(Message message)
	{
		ModernAsyncTask$AsyncTaskResult modernasynctask$asynctaskresult = (ModernAsyncTask$AsyncTaskResult)message.obj;
	//    0    0:aload_1         
	//    1    1:getfield        #27  <Field Object Message.obj>
	//    2    4:checkcast       #29  <Class ModernAsyncTask$AsyncTaskResult>
	//    3    7:astore_2        
		switch(message.what)
	//*   4    8:aload_1         
	//*   5    9:getfield        #33  <Field int Message.what>
		{
	//*   6   12:tableswitch     1 2: default 36
	//	               1 49
	//	               2 37
		default:
			return;
	//    7   36:return          

		case 2: // '\002'
			modernasynctask$asynctaskresult.mTask.onProgressUpdate(modernasynctask$asynctaskresult.mData);
	//    8   37:aload_2         
	//    9   38:getfield        #37  <Field ModernAsyncTask ModernAsyncTask$AsyncTaskResult.mTask>
	//   10   41:aload_2         
	//   11   42:getfield        #41  <Field Object[] ModernAsyncTask$AsyncTaskResult.mData>
	//   12   45:invokevirtual   #45  <Method void ModernAsyncTask.onProgressUpdate(Object[])>
			return;
	//   13   48:return          

		case 1: // '\001'
			modernasynctask$asynctaskresult.mTask.finish(modernasynctask$asynctaskresult.mData[0]);
	//   14   49:aload_2         
	//   15   50:getfield        #37  <Field ModernAsyncTask ModernAsyncTask$AsyncTaskResult.mTask>
	//   16   53:aload_2         
	//   17   54:getfield        #41  <Field Object[] ModernAsyncTask$AsyncTaskResult.mData>
	//   18   57:iconst_0        
	//   19   58:aaload          
	//   20   59:invokevirtual   #49  <Method void ModernAsyncTask.finish(Object)>
			return;
	//   21   62:return          
		}
	}

	ModernAsyncTask$InternalHandler()
	{
		super(Looper.getMainLooper());
	//    0    0:aload_0         
	//    1    1:invokestatic    #15  <Method Looper Looper.getMainLooper()>
	//    2    4:invokespecial   #18  <Method void Handler(Looper)>
	//    3    7:return          
	}
}
