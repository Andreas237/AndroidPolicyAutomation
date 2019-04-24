// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzcx;
import com.google.android.gms.internal.measurement.zzdb;

public final class AnalyticsJobService extends JobService
	implements zzdb
{

	public AnalyticsJobService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void JobService()>
	//    2    4:return          
	}

	private final zzcx zzn()
	{
		if(zzqz == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field zzcx zzqz>
	//*   2    4:ifnonnull       19
			zzqz = new zzcx(((android.content.Context) (this)));
	//    3    7:aload_0         
	//    4    8:new             #23  <Class zzcx>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #26  <Method void zzcx(android.content.Context)>
	//    8   16:putfield        #21  <Field zzcx zzqz>
		return zzqz;
	//    9   19:aload_0         
	//   10   20:getfield        #21  <Field zzcx zzqz>
	//   11   23:areturn         
	}

	public final boolean callServiceStopSelfResult(int i)
	{
		return stopSelfResult(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #33  <Method boolean stopSelfResult(int)>
	//    3    5:ireturn         
	}

	public final void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void JobService.onCreate()>
		zzn().onCreate();
	//    2    4:aload_0         
	//    3    5:invokespecial   #38  <Method zzcx zzn()>
	//    4    8:invokevirtual   #39  <Method void zzcx.onCreate()>
	//    5   11:return          
	}

	public final void onDestroy()
	{
		zzn().onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method zzcx zzn()>
	//    2    4:invokevirtual   #42  <Method void zzcx.onDestroy()>
		super.onDestroy();
	//    3    7:aload_0         
	//    4    8:invokespecial   #43  <Method void JobService.onDestroy()>
	//    5   11:return          
	}

	public final int onStartCommand(Intent intent, int i, int j)
	{
		return zzn().onStartCommand(intent, i, j);
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method zzcx zzn()>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #47  <Method int zzcx.onStartCommand(Intent, int, int)>
	//    6   10:ireturn         
	}

	public final boolean onStartJob(JobParameters jobparameters)
	{
		return zzn().onStartJob(jobparameters);
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method zzcx zzn()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #51  <Method boolean zzcx.onStartJob(JobParameters)>
	//    4    8:ireturn         
	}

	public final boolean onStopJob(JobParameters jobparameters)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final void zza(JobParameters jobparameters, boolean flag)
	{
		jobFinished(jobparameters, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #57  <Method void jobFinished(JobParameters, boolean)>
	//    4    6:return          
	}

	private zzcx zzqz;
}
