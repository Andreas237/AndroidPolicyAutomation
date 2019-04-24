// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.metaData;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.startapp.common.b.a;

public class PeriodicJobService extends JobService
{

	public PeriodicJobService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void JobService()>
	//    2    4:return          
	}

	public boolean onStartJob(JobParameters jobparameters)
	{
		com.startapp.common.b.a.a(((android.content.Context) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #25  <Method a a.a(android.content.Context)>
	//    2    4:pop             
		boolean flag = com.startapp.common.b.a.a(jobparameters, new com.startapp.common.b.a.b.b(jobparameters) {

			public void a(com.startapp.common.b.a.b.a a1)
			{
				b.jobFinished(a, false);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field PeriodicJobService b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field JobParameters a>
			//    4    8:iconst_0        
			//    5    9:invokevirtual   #30  <Method void PeriodicJobService.jobFinished(JobParameters, boolean)>
			//    6   12:return          
			}

			final JobParameters a;
			final PeriodicJobService b;

			
			{
				b = PeriodicJobService.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field PeriodicJobService b>
				a = jobparameters;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field JobParameters a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    3    5:aload_1         
	//    4    6:new             #6   <Class PeriodicJobService$1>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #28  <Method void PeriodicJobService$1(PeriodicJobService, JobParameters)>
	//    9   15:invokestatic    #31  <Method boolean a.a(JobParameters, com.startapp.common.b.a.b$b)>
	//   10   18:istore_2        
		com.startapp.common.b.a.a(3, "PeriodicJobService", (new StringBuilder()).append("onStartJob: RunnerManager.runJob").append(flag).toString(), ((Throwable) (null)));
	//   11   19:iconst_3        
	//   12   20:ldc1            #13  <String "PeriodicJobService">
	//   13   22:new             #33  <Class StringBuilder>
	//   14   25:dup             
	//   15   26:invokespecial   #34  <Method void StringBuilder()>
	//   16   29:ldc1            #36  <String "onStartJob: RunnerManager.runJob">
	//   17   31:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:iload_2         
	//   19   35:invokevirtual   #43  <Method StringBuilder StringBuilder.append(boolean)>
	//   20   38:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   21   41:aconst_null     
	//   22   42:invokestatic    #50  <Method void a.a(int, String, String, Throwable)>
		return flag;
	//   23   45:iload_2         
	//   24   46:ireturn         
	}

	public boolean onStopJob(JobParameters jobparameters)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final String a = "PeriodicJobService";
}
