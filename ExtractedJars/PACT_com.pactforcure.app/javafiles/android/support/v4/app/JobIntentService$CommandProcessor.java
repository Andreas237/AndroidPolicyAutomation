// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.AsyncTask;

// Referenced classes of package android.support.v4.app:
//			JobIntentService

final class JobIntentService$CommandProcessor extends AsyncTask
{

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((Void[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class Void[]>
	//    3    5:invokevirtual   #25  <Method Void doInBackground(Void[])>
	//    4    8:areturn         
	}

	protected transient Void doInBackground(Void avoid[])
	{
		do
		{
			avoid = ((Void []) (dequeueWork()));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field JobIntentService this$0>
	//    2    4:invokevirtual   #29  <Method JobIntentService$GenericWorkItem JobIntentService.dequeueWork()>
	//    3    7:astore_1        
			if(avoid != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          34
			{
				onHandleWork(((JobIntentService.GenericWorkItem) (avoid)).getIntent());
	//    6   12:aload_0         
	//    7   13:getfield        #14  <Field JobIntentService this$0>
	//    8   16:aload_1         
	//    9   17:invokeinterface #35  <Method android.content.Intent JobIntentService$GenericWorkItem.getIntent()>
	//   10   22:invokevirtual   #39  <Method void JobIntentService.onHandleWork(android.content.Intent)>
				((JobIntentService.GenericWorkItem) (avoid)).complete();
	//   11   25:aload_1         
	//   12   26:invokeinterface #42  <Method void JobIntentService$GenericWorkItem.complete()>
			} else
	//*  13   31:goto            0
			{
				return null;
	//   14   34:aconst_null     
	//   15   35:areturn         
			}
		} while(true);
	}

	protected volatile void onCancelled(Object obj)
	{
		onCancelled((Void)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #46  <Class Void>
	//    3    5:invokevirtual   #49  <Method void onCancelled(Void)>
	//    4    8:return          
	}

	protected void onCancelled(Void void1)
	{
		processorFinished();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field JobIntentService this$0>
	//    2    4:invokevirtual   #52  <Method void JobIntentService.processorFinished()>
	//    3    7:return          
	}

	protected volatile void onPostExecute(Object obj)
	{
		onPostExecute((Void)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #46  <Class Void>
	//    3    5:invokevirtual   #55  <Method void onPostExecute(Void)>
	//    4    8:return          
	}

	protected void onPostExecute(Void void1)
	{
		processorFinished();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field JobIntentService this$0>
	//    2    4:invokevirtual   #52  <Method void JobIntentService.processorFinished()>
	//    3    7:return          
	}

	final JobIntentService this$0;

	JobIntentService$CommandProcessor()
	{
		this$0 = JobIntentService.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field JobIntentService this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void AsyncTask()>
	//    5    9:return          
	}
}
