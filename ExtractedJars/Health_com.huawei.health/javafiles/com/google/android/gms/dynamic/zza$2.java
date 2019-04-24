// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.dynamic:
//			zza, LifecycleDelegate

class zza$2
	implements a
{

	public int getState()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void zzb(LifecycleDelegate lifecycledelegate)
	{
		zza.zzb(zzaRE).onInflate(val$activity, zzaRF, zzxo);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zza zzaRE>
	//    2    4:invokestatic    #39  <Method LifecycleDelegate zza.zzb(zza)>
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field Activity val$activity>
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field Bundle zzaRF>
	//    7   15:aload_0         
	//    8   16:getfield        #28  <Field Bundle zzxo>
	//    9   19:invokeinterface #42  <Method void LifecycleDelegate.onInflate(Activity, Bundle, Bundle)>
	//   10   24:return          
	}

	final Activity val$activity;
	final zza zzaRE;
	final Bundle zzaRF;
	final Bundle zzxo;

	zza$2(Activity activity1, Bundle bundle, Bundle bundle1)
	{
		zzaRE = final_zza1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field zza zzaRE>
		val$activity = activity1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field Activity val$activity>
		zzaRF = bundle;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field Bundle zzaRF>
		zzxo = bundle1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #28  <Field Bundle zzxo>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
