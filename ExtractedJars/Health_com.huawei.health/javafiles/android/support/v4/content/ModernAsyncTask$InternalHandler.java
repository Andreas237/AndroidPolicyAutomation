// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.os.*;

// Referenced classes of package android.support.v4.content:
//			ModernAsyncTask

static class ModernAsyncTask$InternalHandler extends Handler
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
	//*   6   12:lookupswitch    2: default 40
	//	               1: 41
	//	               2: 55
		default:
			return;
	//    7   40:return          

		case 1: // '\001'
			modernasynctask$asynctaskresult.mTask.finish(modernasynctask$asynctaskresult.mData[0]);
	//    8   41:aload_2         
	//    9   42:getfield        #37  <Field ModernAsyncTask ModernAsyncTask$AsyncTaskResult.mTask>
	//   10   45:aload_2         
	//   11   46:getfield        #41  <Field Object[] ModernAsyncTask$AsyncTaskResult.mData>
	//   12   49:iconst_0        
	//   13   50:aaload          
	//   14   51:invokevirtual   #45  <Method void ModernAsyncTask.finish(Object)>
			return;
	//   15   54:return          

		case 2: // '\002'
			modernasynctask$asynctaskresult.mTask.onProgressUpdate(modernasynctask$asynctaskresult.mData);
	//   16   55:aload_2         
	//   17   56:getfield        #37  <Field ModernAsyncTask ModernAsyncTask$AsyncTaskResult.mTask>
	//   18   59:aload_2         
	//   19   60:getfield        #41  <Field Object[] ModernAsyncTask$AsyncTaskResult.mData>
	//   20   63:invokevirtual   #49  <Method void ModernAsyncTask.onProgressUpdate(Object[])>
			break;
		}
	//   21   66:return          
	}

	public ModernAsyncTask$InternalHandler()
	{
		super(Looper.getMainLooper());
	//    0    0:aload_0         
	//    1    1:invokestatic    #15  <Method Looper Looper.getMainLooper()>
	//    2    4:invokespecial   #18  <Method void Handler(Looper)>
	//    3    7:return          
	}
}
