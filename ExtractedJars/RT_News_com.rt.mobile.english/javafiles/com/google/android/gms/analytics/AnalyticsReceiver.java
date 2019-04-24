// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;

import android.content.*;
import com.google.android.gms.internal.measurement.zzct;

public final class AnalyticsReceiver extends BroadcastReceiver
{

	public AnalyticsReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	public final void onReceive(Context context, Intent intent)
	{
		if(zzqp == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field zzct zzqp>
	//*   2    4:ifnonnull       18
			zzqp = new zzct();
	//    3    7:aload_0         
	//    4    8:new             #21  <Class zzct>
	//    5   11:dup             
	//    6   12:invokespecial   #22  <Method void zzct()>
	//    7   15:putfield        #19  <Field zzct zzqp>
		zzct.onReceive(context, intent);
	//    8   18:aload_1         
	//    9   19:aload_2         
	//   10   20:invokestatic    #24  <Method void zzct.onReceive(Context, Intent)>
	//   11   23:return          
	}

	private zzct zzqp;
}
