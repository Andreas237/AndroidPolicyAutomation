// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.core;

import android.content.Context;
import com.birbit.android.jobqueue.JobManager;
import com.birbit.android.jobqueue.scheduling.FrameworkJobSchedulerService;
import com.birbit.android.jobqueue.scheduling.GcmJobSchedulerService;
import com.google.android.gms.common.GoogleApiAvailability;

// Referenced classes of package com.pactforcure.app.core:
//			JobService, GcmJobService

public class JobManagerFactory
{

	public JobManagerFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static JobManager buildJobManager(Context context)
	{
		com.birbit.android.jobqueue.config.Configuration.Builder builder = new com.birbit.android.jobqueue.config.Configuration.Builder(context);
	//    0    0:new             #13  <Class com.birbit.android.jobqueue.config.Configuration$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #16  <Method void com.birbit.android.jobqueue.config.Configuration$Builder(Context)>
	//    4    8:astore_1        
		if(android.os.Build.VERSION.SDK_INT < 21) goto _L2; else goto _L1
	//    5    9:getstatic       #22  <Field int android.os.Build$VERSION.SDK_INT>
	//    6   12:bipush          21
	//    7   14:icmplt          41
_L1:
		builder.scheduler(((com.birbit.android.jobqueue.scheduling.Scheduler) (FrameworkJobSchedulerService.createSchedulerFor(context, com/pactforcure/app/core/JobService))), true);
	//    8   17:aload_1         
	//    9   18:aload_0         
	//   10   19:ldc1            #24  <Class JobService>
	//   11   21:invokestatic    #30  <Method com.birbit.android.jobqueue.scheduling.FrameworkScheduler FrameworkJobSchedulerService.createSchedulerFor(Context, Class)>
	//   12   24:iconst_1        
	//   13   25:invokevirtual   #34  <Method com.birbit.android.jobqueue.config.Configuration$Builder com.birbit.android.jobqueue.config.Configuration$Builder.scheduler(com.birbit.android.jobqueue.scheduling.Scheduler, boolean)>
	//   14   28:pop             
_L4:
		return new JobManager(builder.build());
	//   15   29:new             #36  <Class JobManager>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:invokevirtual   #40  <Method com.birbit.android.jobqueue.config.Configuration com.birbit.android.jobqueue.config.Configuration$Builder.build()>
	//   19   37:invokespecial   #43  <Method void JobManager(com.birbit.android.jobqueue.config.Configuration)>
	//   20   40:areturn         
_L2:
		if(GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0)
	//*  21   41:invokestatic    #49  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//*  22   44:aload_0         
	//*  23   45:invokevirtual   #53  <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(Context)>
	//*  24   48:ifne            29
			builder.scheduler(((com.birbit.android.jobqueue.scheduling.Scheduler) (GcmJobSchedulerService.createSchedulerFor(context, com/pactforcure/app/core/GcmJobService))), true);
	//   25   51:aload_1         
	//   26   52:aload_0         
	//   27   53:ldc1            #55  <Class GcmJobService>
	//   28   55:invokestatic    #60  <Method com.birbit.android.jobqueue.scheduling.GcmScheduler GcmJobSchedulerService.createSchedulerFor(Context, Class)>
	//   29   58:iconst_1        
	//   30   59:invokevirtual   #34  <Method com.birbit.android.jobqueue.config.Configuration$Builder com.birbit.android.jobqueue.config.Configuration$Builder.scheduler(com.birbit.android.jobqueue.scheduling.Scheduler, boolean)>
	//   31   62:pop             
		if(true) goto _L4; else goto _L3
	//   32   63:goto            29
_L3:
	}
}
