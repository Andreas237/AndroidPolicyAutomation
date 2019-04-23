// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzbm;
import com.google.android.gms.measurement.internal.zzbp;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver
	implements zzbp
{

	public AppMeasurementReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void WakefulBroadcastReceiver()>
	//    2    4:return          
	}

	public final android.content.BroadcastReceiver.PendingResult doGoAsync()
	{
		return goAsync();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #18  <Method android.content.BroadcastReceiver$PendingResult goAsync()>
	//    2    4:areturn         
	}

	public final void doStartService(Context context, Intent intent)
	{
		startWakefulService(context, intent);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #25  <Method android.content.ComponentName startWakefulService(Context, Intent)>
	//    3    5:pop             
	//    4    6:return          
	}

	public final void onReceive(Context context, Intent intent)
	{
		if(zzadb == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field zzbm zzadb>
	//*   2    4:ifnonnull       19
			zzadb = new zzbm(((zzbp) (this)));
	//    3    7:aload_0         
	//    4    8:new             #31  <Class zzbm>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #34  <Method void zzbm(zzbp)>
	//    8   16:putfield        #29  <Field zzbm zzadb>
		zzadb.onReceive(context, intent);
	//    9   19:aload_0         
	//   10   20:getfield        #29  <Field zzbm zzadb>
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokevirtual   #36  <Method void zzbm.onReceive(Context, Intent)>
	//   14   28:return          
	}

	private zzbm zzadb;
}
