// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzey;
import com.google.android.gms.measurement.internal.zzfc;

public final class AppMeasurementJobService extends JobService
	implements zzfc
{

	public AppMeasurementJobService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void JobService()>
	//    2    4:return          
	}

	private final zzey zzfz()
	{
		if(zzadc == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field zzey zzadc>
	//*   2    4:ifnonnull       19
			zzadc = new zzey(((android.content.Context) (this)));
	//    3    7:aload_0         
	//    4    8:new             #23  <Class zzey>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #26  <Method void zzey(android.content.Context)>
	//    8   16:putfield        #21  <Field zzey zzadc>
		return zzadc;
	//    9   19:aload_0         
	//   10   20:getfield        #21  <Field zzey zzadc>
	//   11   23:areturn         
	}

	public final boolean callServiceStopSelfResult(int i)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #32  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void JobService.onCreate()>
		zzfz().onCreate();
	//    2    4:aload_0         
	//    3    5:invokespecial   #39  <Method zzey zzfz()>
	//    4    8:invokevirtual   #40  <Method void zzey.onCreate()>
	//    5   11:return          
	}

	public final void onDestroy()
	{
		zzfz().onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method zzey zzfz()>
	//    2    4:invokevirtual   #44  <Method void zzey.onDestroy()>
		super.onDestroy();
	//    3    7:aload_0         
	//    4    8:invokespecial   #45  <Method void JobService.onDestroy()>
	//    5   11:return          
	}

	public final void onRebind(Intent intent)
	{
		zzfz().onRebind(intent);
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method zzey zzfz()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #49  <Method void zzey.onRebind(Intent)>
	//    4    8:return          
	}

	public final boolean onStartJob(JobParameters jobparameters)
	{
		return zzfz().onStartJob(jobparameters);
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method zzey zzfz()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #53  <Method boolean zzey.onStartJob(JobParameters)>
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
		return zzfz().onUnbind(intent);
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method zzey zzfz()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #58  <Method boolean zzey.onUnbind(Intent)>
	//    4    8:ireturn         
	}

	public final void zza(JobParameters jobparameters, boolean flag)
	{
		jobFinished(jobparameters, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #63  <Method void jobFinished(JobParameters, boolean)>
	//    4    6:return          
	}

	public final void zza(Intent intent)
	{
	//    0    0:return          
	}

	private zzey zzadc;
}
