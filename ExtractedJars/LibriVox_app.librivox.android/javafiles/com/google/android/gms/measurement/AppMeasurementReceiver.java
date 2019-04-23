// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import android.support.v4.a.u;
import com.google.android.gms.measurement.internal.an;
import com.google.android.gms.measurement.internal.aq;

public final class AppMeasurementReceiver extends u
	implements aq
{

	public AppMeasurementReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void u()>
	//    2    4:return          
	}

	public final android.content.BroadcastReceiver.PendingResult a()
	{
		return goAsync();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method android.content.BroadcastReceiver$PendingResult goAsync()>
	//    2    4:areturn         
	}

	public final void a(Context context, Intent intent)
	{
		a_(context, intent);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #22  <Method android.content.ComponentName a_(Context, Intent)>
	//    3    5:pop             
	//    4    6:return          
	}

	public final void onReceive(Context context, Intent intent)
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field an a>
	//*   2    4:ifnonnull       19
			a = new an(((aq) (this)));
	//    3    7:aload_0         
	//    4    8:new             #27  <Class an>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #30  <Method void an(aq)>
	//    8   16:putfield        #25  <Field an a>
		a.a(context, intent);
	//    9   19:aload_0         
	//   10   20:getfield        #25  <Field an a>
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokevirtual   #32  <Method void an.a(Context, Intent)>
	//   14   28:return          
	}

	private an a;
}
