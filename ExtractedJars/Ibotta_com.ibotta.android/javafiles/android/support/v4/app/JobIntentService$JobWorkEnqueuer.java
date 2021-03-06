// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.job.*;
import android.content.*;

// Referenced classes of package android.support.v4.app:
//			JobIntentService

static final class JobIntentService$JobWorkEnqueuer extends JobIntentService.WorkEnqueuer
{

	void enqueueWork(Intent intent)
	{
		mJobScheduler.enqueue(mJobInfo, new JobWorkItem(intent));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field JobScheduler mJobScheduler>
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field JobInfo mJobInfo>
	//    4    8:new             #63  <Class JobWorkItem>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #65  <Method void JobWorkItem(Intent)>
	//    8   16:invokevirtual   #69  <Method int JobScheduler.enqueue(JobInfo, JobWorkItem)>
	//    9   19:pop             
	//   10   20:return          
	}

	private final JobInfo mJobInfo;
	private final JobScheduler mJobScheduler;

	JobIntentService$JobWorkEnqueuer(Context context, ComponentName componentname, int i)
	{
		super(context, componentname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #19  <Method void JobIntentService$WorkEnqueuer(Context, ComponentName)>
		ensureJobId(i);
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:invokevirtual   #23  <Method void ensureJobId(int)>
		mJobInfo = (new android.app.job.JobInfo.Builder(i, mComponentName)).setOverrideDeadline(0L).build();
	//    7   11:aload_0         
	//    8   12:new             #25  <Class android.app.job.JobInfo$Builder>
	//    9   15:dup             
	//   10   16:iload_3         
	//   11   17:aload_0         
	//   12   18:getfield        #29  <Field ComponentName mComponentName>
	//   13   21:invokespecial   #32  <Method void android.app.job.JobInfo$Builder(int, ComponentName)>
	//   14   24:lconst_0        
	//   15   25:invokevirtual   #36  <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setOverrideDeadline(long)>
	//   16   28:invokevirtual   #40  <Method JobInfo android.app.job.JobInfo$Builder.build()>
	//   17   31:putfield        #42  <Field JobInfo mJobInfo>
		mJobScheduler = (JobScheduler)context.getApplicationContext().getSystemService("jobscheduler");
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #48  <Method Context Context.getApplicationContext()>
	//   21   39:ldc1            #50  <String "jobscheduler">
	//   22   41:invokevirtual   #54  <Method Object Context.getSystemService(String)>
	//   23   44:checkcast       #56  <Class JobScheduler>
	//   24   47:putfield        #58  <Field JobScheduler mJobScheduler>
	//   25   50:return          
	}
}
