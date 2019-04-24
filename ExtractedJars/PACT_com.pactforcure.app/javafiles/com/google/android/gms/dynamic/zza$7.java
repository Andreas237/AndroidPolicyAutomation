// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;


// Referenced classes of package com.google.android.gms.dynamic:
//			zza, LifecycleDelegate

class zza$7
	implements a
{

	public int getState()
	{
		return 5;
	//    0    0:iconst_5        
	//    1    1:ireturn         
	}

	public void zzb(LifecycleDelegate lifecycledelegate)
	{
		zza.zzb(zzaQh).onResume();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zza zzaQh>
	//    2    4:invokestatic    #27  <Method LifecycleDelegate zza.zzb(zza)>
	//    3    7:invokeinterface #30  <Method void LifecycleDelegate.onResume()>
	//    4   12:return          
	}

	final zza zzaQh;

	zza$7(zza zza1)
	{
		zzaQh = zza1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field zza zzaQh>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
