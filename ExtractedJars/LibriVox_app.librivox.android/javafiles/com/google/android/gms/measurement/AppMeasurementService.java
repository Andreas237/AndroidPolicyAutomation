// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.do;
import com.google.android.gms.measurement.internal.dt;

// Referenced classes of package com.google.android.gms.measurement:
//			AppMeasurementReceiver

public final class AppMeasurementService extends Service
	implements dt
{

	public AppMeasurementService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Service()>
	//    2    4:return          
	}

	private final do a()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field do a>
	//*   2    4:ifnonnull       19
			a = new do(((android.content.Context) (this)));
	//    3    7:aload_0         
	//    4    8:new             #18  <Class do>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #21  <Method void do(android.content.Context)>
	//    8   16:putfield        #16  <Field do a>
		return a;
	//    9   19:aload_0         
	//   10   20:getfield        #16  <Field do a>
	//   11   23:areturn         
	}

	public final void a(JobParameters jobparameters, boolean flag)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #24  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final void a(Intent intent)
	{
		AppMeasurementReceiver.a(intent);
	//    0    0:aload_1         
	//    1    1:invokestatic    #31  <Method boolean AppMeasurementReceiver.a(Intent)>
	//    2    4:pop             
	//    3    5:return          
	}

	public final boolean a(int i)
	{
		return stopSelfResult(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #35  <Method boolean stopSelfResult(int)>
	//    3    5:ireturn         
	}

	public final IBinder onBind(Intent intent)
	{
		return a().a(intent);
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method do a()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #41  <Method IBinder do.a(Intent)>
	//    4    8:areturn         
	}

	public final void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Service.onCreate()>
		a().a();
	//    2    4:aload_0         
	//    3    5:invokespecial   #39  <Method do a()>
	//    4    8:invokevirtual   #46  <Method void do.a()>
	//    5   11:return          
	}

	public final void onDestroy()
	{
		a().b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method do a()>
	//    2    4:invokevirtual   #50  <Method void do.b()>
		super.onDestroy();
	//    3    7:aload_0         
	//    4    8:invokespecial   #52  <Method void Service.onDestroy()>
	//    5   11:return          
	}

	public final void onRebind(Intent intent)
	{
		a().c(intent);
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method do a()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #56  <Method void do.c(Intent)>
	//    4    8:return          
	}

	public final int onStartCommand(Intent intent, int i, int j)
	{
		return a().a(intent, i, j);
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method do a()>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #60  <Method int do.a(Intent, int, int)>
	//    6   10:ireturn         
	}

	public final boolean onUnbind(Intent intent)
	{
		return a().b(intent);
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method do a()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #63  <Method boolean do.b(Intent)>
	//    4    8:ireturn         
	}

	private do a;
}
