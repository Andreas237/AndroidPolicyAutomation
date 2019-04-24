// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.core;

import com.birbit.android.jobqueue.JobManager;
import com.birbit.android.jobqueue.scheduling.GcmJobSchedulerService;

// Referenced classes of package com.pactforcure.app.core:
//			BackboneApplication

public class GcmJobService extends GcmJobSchedulerService
{

	public GcmJobService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void GcmJobSchedulerService()>
	//    2    4:return          
	}

	protected JobManager getJobManager()
	{
		return BackboneApplication.get().getJobManager();
	//    0    0:invokestatic    #17  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:invokevirtual   #19  <Method JobManager BackboneApplication.getJobManager()>
	//    2    6:areturn         
	}
}
