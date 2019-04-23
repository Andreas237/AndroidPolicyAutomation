// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package com.firebase.jobdispatcher:
//			JobService, GooglePlayReceiver, JobCoder, IJobCallback, 
//			JobParameters

private static final class JobService$JobCallback
{

	void sendResult(int i)
	{
		try
		{
			remoteCallback.jobFinished(GooglePlayReceiver.getJobCoder().encode(job, new Bundle()), i);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field IJobCallback remoteCallback>
	//    2    4:invokestatic    #34  <Method JobCoder GooglePlayReceiver.getJobCoder()>
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field JobParameters job>
	//    5   11:new             #36  <Class Bundle>
	//    6   14:dup             
	//    7   15:invokespecial   #37  <Method void Bundle()>
	//    8   18:invokevirtual   #43  <Method Bundle JobCoder.encode(JobParameters, Bundle)>
	//    9   21:iload_1         
	//   10   22:invokeinterface #49  <Method void IJobCallback.jobFinished(Bundle, int)>
			return;
	//   11   27:return          
		}
		catch(RemoteException remoteexception)
	//*  12   28:astore_2        
		{
			Log.e("FJD.JobService", "Failed to send result to driver", ((Throwable) (remoteexception)));
	//   13   29:ldc1            #51  <String "FJD.JobService">
	//   14   31:ldc1            #53  <String "Failed to send result to driver">
	//   15   33:aload_2         
	//   16   34:invokestatic    #59  <Method int Log.e(String, String, Throwable)>
	//   17   37:pop             
		}
	//   18   38:return          
	}

	final JobParameters job;
	final IJobCallback remoteCallback;

	private JobService$JobCallback(JobParameters jobparameters, IJobCallback ijobcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		job = jobparameters;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field JobParameters job>
		remoteCallback = ijobcallback;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field IJobCallback remoteCallback>
	//    8   14:return          
	}

	JobService$JobCallback(JobParameters jobparameters, IJobCallback ijobcallback, JobService._cls1 _pcls1)
	{
		this(jobparameters, ijobcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #24  <Method void JobService$JobCallback(JobParameters, IJobCallback)>
	//    4    6:return          
	}
}
