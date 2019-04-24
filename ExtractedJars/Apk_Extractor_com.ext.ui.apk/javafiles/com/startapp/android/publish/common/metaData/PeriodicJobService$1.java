// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.metaData;

import android.app.job.JobParameters;

// Referenced classes of package com.startapp.android.publish.common.metaData:
//			PeriodicJobService

class PeriodicJobService$1
	implements com.startapp.common.b.a.b.b
{

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

	PeriodicJobService$1(PeriodicJobService periodicjobservice, JobParameters jobparameters)
	{
		b = periodicjobservice;
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
