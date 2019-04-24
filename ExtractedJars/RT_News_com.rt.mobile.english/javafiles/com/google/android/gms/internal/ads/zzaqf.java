// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaqg, zzaqe

final class zzaqf
	implements Runnable
{

	zzaqf(zzaqe zzaqe)
	{
		zzdax = zzaqe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzaqe zzdax>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		zzbv.zzff().zzb(zzdax);
	//    0    0:invokestatic    #23  <Method zzaqg zzbv.zzff()>
	//    1    3:aload_0         
	//    2    4:getfield        #12  <Field zzaqe zzdax>
	//    3    7:invokevirtual   #28  <Method void zzaqg.zzb(zzaqe)>
	//    4   10:return          
	}

	private final zzaqe zzdax;
}
