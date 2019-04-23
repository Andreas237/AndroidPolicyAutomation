// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.zzey;
import com.google.android.gms.measurement.internal.zzfc;

// Referenced classes of package com.google.android.gms.measurement:
//			AppMeasurementReceiver

public final class AppMeasurementService extends Service
	implements zzfc
{

	public AppMeasurementService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Service()>
	//    2    4:return          
	}

	private final zzey zzfz()
	{
		if(zzadc == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field zzey zzadc>
	//*   2    4:ifnonnull       19
			zzadc = new zzey(((android.content.Context) (this)));
	//    3    7:aload_0         
	//    4    8:new             #20  <Class zzey>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #23  <Method void zzey(android.content.Context)>
	//    8   16:putfield        #18  <Field zzey zzadc>
		return zzadc;
	//    9   19:aload_0         
	//   10   20:getfield        #18  <Field zzey zzadc>
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
		return zzfz().onBind(intent);
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method zzey zzfz()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #37  <Method IBinder zzey.onBind(Intent)>
	//    4    8:areturn         
	}

	public final void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Service.onCreate()>
		zzfz().onCreate();
	//    2    4:aload_0         
	//    3    5:invokespecial   #35  <Method zzey zzfz()>
	//    4    8:invokevirtual   #42  <Method void zzey.onCreate()>
	//    5   11:return          
	}

	public final void onDestroy()
	{
		zzfz().onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method zzey zzfz()>
	//    2    4:invokevirtual   #45  <Method void zzey.onDestroy()>
		super.onDestroy();
	//    3    7:aload_0         
	//    4    8:invokespecial   #46  <Method void Service.onDestroy()>
	//    5   11:return          
	}

	public final void onRebind(Intent intent)
	{
		zzfz().onRebind(intent);
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method zzey zzfz()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #50  <Method void zzey.onRebind(Intent)>
	//    4    8:return          
	}

	public final int onStartCommand(Intent intent, int i, int j)
	{
		return zzfz().onStartCommand(intent, i, j);
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method zzey zzfz()>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #54  <Method int zzey.onStartCommand(Intent, int, int)>
	//    6   10:ireturn         
	}

	public final boolean onUnbind(Intent intent)
	{
		return zzfz().onUnbind(intent);
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method zzey zzfz()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #58  <Method boolean zzey.onUnbind(Intent)>
	//    4    8:ireturn         
	}

	public final void zza(JobParameters jobparameters, boolean flag)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #62  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final void zza(Intent intent)
	{
		AppMeasurementReceiver.completeWakefulIntent(intent);
	//    0    0:aload_1         
	//    1    1:invokestatic    #68  <Method boolean AppMeasurementReceiver.completeWakefulIntent(Intent)>
	//    2    4:pop             
	//    3    5:return          
	}

	private zzey zzadc;
}
