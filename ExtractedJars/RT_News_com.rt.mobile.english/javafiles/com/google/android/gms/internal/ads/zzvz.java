// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaoo, zzuu, zzaoe, zzwa, 
//			zzvw

final class zzvz
	implements zzaoo
{

	zzvz(zzvw zzvw)
	{
		zzbqw = zzvw;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzvw zzbqw>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final void zze(Object obj)
	{
		obj = ((Object) ((zzuu)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzuu>
	//    2    4:astore_1        
		zzaoe.zzcvy.execute(((Runnable) (new zzwa(this, ((zzuu) (obj))))));
	//    3    5:getstatic       #27  <Field Executor zzaoe.zzcvy>
	//    4    8:new             #29  <Class zzwa>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #32  <Method void zzwa(zzvz, zzuu)>
	//    9   17:invokeinterface #38  <Method void Executor.execute(Runnable)>
	//   10   22:return          
	}

	final zzvw zzbqw;
}
