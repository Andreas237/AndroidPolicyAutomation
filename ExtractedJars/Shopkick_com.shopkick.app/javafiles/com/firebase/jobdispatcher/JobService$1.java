// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.util.Log;

// Referenced classes of package com.firebase.jobdispatcher:
//			JobService, GooglePlayReceiver, JobCoder, IJobCallback

class JobService$1 extends vice.Stub
{

	public void start(Bundle bundle, IJobCallback ijobcallback)
	{
		bundle = ((Bundle) (GooglePlayReceiver.getJobCoder().decode(bundle)));
	//    0    0:invokestatic    #24  <Method JobCoder GooglePlayReceiver.getJobCoder()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #30  <Method JobInvocation$Builder JobCoder.decode(Bundle)>
	//    3    7:astore_1        
		if(bundle == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       21
		{
			Log.wtf("FJD.JobService", "start: unknown invocation provided");
	//    6   12:ldc1            #32  <String "FJD.JobService">
	//    7   14:ldc1            #34  <String "start: unknown invocation provided">
	//    8   16:invokestatic    #40  <Method int Log.wtf(String, String)>
	//    9   19:pop             
			return;
	//   10   20:return          
		} else
		{
			JobService.this.start(((JobParameters) (((.Builder) (bundle)).build())), ijobcallback);
	//   11   21:aload_0         
	//   12   22:getfield        #12  <Field JobService this$0>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #46  <Method JobInvocation JobInvocation$Builder.build()>
	//   15   29:aload_2         
	//   16   30:invokevirtual   #49  <Method void JobService.start(JobParameters, IJobCallback)>
			return;
	//   17   33:return          
		}
	}

	public void stop(Bundle bundle, boolean flag)
	{
		bundle = ((Bundle) (GooglePlayReceiver.getJobCoder().decode(bundle)));
	//    0    0:invokestatic    #24  <Method JobCoder GooglePlayReceiver.getJobCoder()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #30  <Method JobInvocation$Builder JobCoder.decode(Bundle)>
	//    3    7:astore_1        
		if(bundle == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       21
		{
			Log.wtf("FJD.JobService", "stop: unknown invocation provided");
	//    6   12:ldc1            #32  <String "FJD.JobService">
	//    7   14:ldc1            #53  <String "stop: unknown invocation provided">
	//    8   16:invokestatic    #40  <Method int Log.wtf(String, String)>
	//    9   19:pop             
			return;
	//   10   20:return          
		} else
		{
			JobService.this.stop(((JobParameters) (((.Builder) (bundle)).build())), flag);
	//   11   21:aload_0         
	//   12   22:getfield        #12  <Field JobService this$0>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #46  <Method JobInvocation JobInvocation$Builder.build()>
	//   15   29:iload_2         
	//   16   30:invokevirtual   #56  <Method void JobService.stop(JobParameters, boolean)>
			return;
	//   17   33:return          
		}
	}

	final JobService this$0;

	JobService$1()
	{
		this$0 = JobService.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field JobService this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void IRemoteJobService$Stub()>
	//    5    9:return          
	}
}
