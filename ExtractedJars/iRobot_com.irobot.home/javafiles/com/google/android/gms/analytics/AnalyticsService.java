// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzcx;
import com.google.android.gms.internal.measurement.zzdb;

public final class AnalyticsService extends Service
	implements zzdb
{

	public AnalyticsService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Service()>
	//    2    4:return          
	}

	private final zzcx zzn()
	{
		if(zzqz == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field zzcx zzqz>
	//*   2    4:ifnonnull       19
			zzqz = new zzcx(((android.content.Context) (this)));
	//    3    7:aload_0         
	//    4    8:new             #20  <Class zzcx>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #23  <Method void zzcx(android.content.Context)>
	//    8   16:putfield        #18  <Field zzcx zzqz>
		return zzqz;
	//    9   19:aload_0         
	//   10   20:getfield        #18  <Field zzcx zzqz>
	//   11   23:areturn         
	}

	public final boolean callServiceStopSelfResult(int i)
	{
		return stopSelfResult(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #30  <Method boolean stopSelfResult(int)>
	//    3    5:ireturn         
	}

	public final IBinder onBind(Intent intent)
	{
		zzn();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method zzcx zzn()>
	//    2    4:pop             
		return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
	}

	public final void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Service.onCreate()>
		zzn().onCreate();
	//    2    4:aload_0         
	//    3    5:invokespecial   #34  <Method zzcx zzn()>
	//    4    8:invokevirtual   #38  <Method void zzcx.onCreate()>
	//    5   11:return          
	}

	public final void onDestroy()
	{
		zzn().onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method zzcx zzn()>
	//    2    4:invokevirtual   #41  <Method void zzcx.onDestroy()>
		super.onDestroy();
	//    3    7:aload_0         
	//    4    8:invokespecial   #42  <Method void Service.onDestroy()>
	//    5   11:return          
	}

	public final int onStartCommand(Intent intent, int i, int j)
	{
		return zzn().onStartCommand(intent, i, j);
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method zzcx zzn()>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #46  <Method int zzcx.onStartCommand(Intent, int, int)>
	//    6   10:ireturn         
	}

	public final void zza(JobParameters jobparameters, boolean flag)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #50  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private zzcx zzqz;
}
