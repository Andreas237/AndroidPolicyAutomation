// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.dynamic:
//			zza, LifecycleDelegate

class zza$3
	implements a
{

	public int getState()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void zzb(LifecycleDelegate lifecycledelegate)
	{
		zza.zzb(zzaRE).onCreate(zzxo);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zza zzaRE>
	//    2    4:invokestatic    #32  <Method LifecycleDelegate zza.zzb(zza)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Bundle zzxo>
	//    5   11:invokeinterface #35  <Method void LifecycleDelegate.onCreate(Bundle)>
	//    6   16:return          
	}

	final zza zzaRE;
	final Bundle zzxo;

	zza$3(zza zza1, Bundle bundle)
	{
		zzaRE = zza1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field zza zzaRE>
		zzxo = bundle;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Bundle zzxo>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
