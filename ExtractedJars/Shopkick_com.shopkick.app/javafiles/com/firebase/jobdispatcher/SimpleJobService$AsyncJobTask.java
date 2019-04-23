// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.os.AsyncTask;

// Referenced classes of package com.firebase.jobdispatcher:
//			SimpleJobService, JobParameters

private static class SimpleJobService$AsyncJobTask extends AsyncTask
{

	protected transient Integer doInBackground(Void avoid[])
	{
		return Integer.valueOf(jobService.onRunJob(jobParameters));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field SimpleJobService jobService>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field JobParameters jobParameters>
	//    4    8:invokevirtual   #31  <Method int SimpleJobService.onRunJob(JobParameters)>
	//    5   11:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//    6   14:areturn         
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((Void[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #40  <Class Void[]>
	//    3    5:invokevirtual   #42  <Method Integer doInBackground(Void[])>
	//    4    8:areturn         
	}

	protected void onPostExecute(Integer integer)
	{
		SimpleJobService simplejobservice = jobService;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field SimpleJobService jobService>
	//    2    4:astore          4
		JobParameters jobparameters = jobParameters;
	//    3    6:aload_0         
	//    4    7:getfield        #21  <Field JobParameters jobParameters>
	//    5   10:astore          5
		int i = integer.intValue();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #48  <Method int Integer.intValue()>
	//    8   16:istore_2        
		boolean flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_3        
		if(i != 1)
	//*  11   19:iload_2         
	//*  12   20:iconst_1        
	//*  13   21:icmpne          27
	//*  14   24:goto            29
			flag = false;
	//   15   27:iconst_0        
	//   16   28:istore_3        
		SimpleJobService.access$100(simplejobservice, jobparameters, flag);
	//   17   29:aload           4
	//   18   31:aload           5
	//   19   33:iload_3         
	//   20   34:invokestatic    #52  <Method void SimpleJobService.access$100(SimpleJobService, JobParameters, boolean)>
	//   21   37:return          
	}

	protected volatile void onPostExecute(Object obj)
	{
		onPostExecute((Integer)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #33  <Class Integer>
	//    3    5:invokevirtual   #55  <Method void onPostExecute(Integer)>
	//    4    8:return          
	}

	private final JobParameters jobParameters;
	private final SimpleJobService jobService;

	private SimpleJobService$AsyncJobTask(SimpleJobService simplejobservice, JobParameters jobparameters)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void AsyncTask()>
		jobService = simplejobservice;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field SimpleJobService jobService>
		jobParameters = jobparameters;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field JobParameters jobParameters>
	//    8   14:return          
	}

	SimpleJobService$AsyncJobTask(SimpleJobService simplejobservice, JobParameters jobparameters, SimpleJobService._cls1 _pcls1)
	{
		this(simplejobservice, jobparameters);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #25  <Method void SimpleJobService$AsyncJobTask(SimpleJobService, JobParameters)>
	//    4    6:return          
	}
}
