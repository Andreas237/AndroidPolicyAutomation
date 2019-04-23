// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.do;
import com.google.android.gms.measurement.internal.dt;

public final class AppMeasurementJobService extends JobService
	implements dt
{

	public AppMeasurementJobService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void JobService()>
	//    2    4:return          
	}

	private final do a()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field do a>
	//*   2    4:ifnonnull       19
			a = new do(((android.content.Context) (this)));
	//    3    7:aload_0         
	//    4    8:new             #21  <Class do>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #24  <Method void do(android.content.Context)>
	//    8   16:putfield        #19  <Field do a>
		return a;
	//    9   19:aload_0         
	//   10   20:getfield        #19  <Field do a>
	//   11   23:areturn         
	}

	public final void a(JobParameters jobparameters, boolean flag)
	{
		jobFinished(jobparameters, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #28  <Method void jobFinished(JobParameters, boolean)>
	//    4    6:return          
	}

	public final void a(Intent intent)
	{
	//    0    0:return          
	}

	public final boolean a(int i)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #33  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void JobService.onCreate()>
		a().a();
	//    2    4:aload_0         
	//    3    5:invokespecial   #39  <Method do a()>
	//    4    8:invokevirtual   #41  <Method void do.a()>
	//    5   11:return          
	}

	public final void onDestroy()
	{
		a().b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method do a()>
	//    2    4:invokevirtual   #45  <Method void do.b()>
		super.onDestroy();
	//    3    7:aload_0         
	//    4    8:invokespecial   #47  <Method void JobService.onDestroy()>
	//    5   11:return          
	}

	public final void onRebind(Intent intent)
	{
		a().c(intent);
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method do a()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #51  <Method void do.c(Intent)>
	//    4    8:return          
	}

	public final boolean onStartJob(JobParameters jobparameters)
	{
		return a().a(jobparameters);
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method do a()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #55  <Method boolean do.a(JobParameters)>
	//    4    8:ireturn         
	}

	public final boolean onStopJob(JobParameters jobparameters)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean onUnbind(Intent intent)
	{
		return a().b(intent);
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method do a()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #60  <Method boolean do.b(Intent)>
	//    4    8:ireturn         
	}

	private do a;
}
