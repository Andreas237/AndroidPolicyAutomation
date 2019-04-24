// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;

import android.content.*;
import com.google.android.gms.internal.measurement.zzcw;

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
		if(zzra == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field zzcw zzra>
	//*   2    4:ifnonnull       18
			zzra = new zzcw();
	//    3    7:aload_0         
	//    4    8:new             #17  <Class zzcw>
	//    5   11:dup             
	//    6   12:invokespecial   #18  <Method void zzcw()>
	//    7   15:putfield        #15  <Field zzcw zzra>
		zzcw.onReceive(context, intent);
	//    8   18:aload_1         
	//    9   19:aload_2         
	//   10   20:invokestatic    #20  <Method void zzcw.onReceive(Context, Intent)>
	//   11   23:return          
	}

	private zzcw zzra;
}
