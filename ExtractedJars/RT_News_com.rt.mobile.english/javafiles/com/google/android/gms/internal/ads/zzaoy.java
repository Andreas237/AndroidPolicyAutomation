// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaov, zzapf

final class zzaoy
	implements Runnable
{

	zzaoy(zzaov zzaov1)
	{
		zzcxf = zzaov1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzaov zzcxf>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		if(zzaov.zza(zzcxf) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field zzaov zzcxf>
	//*   2    4:invokestatic    #23  <Method zzapf zzaov.zza(zzaov)>
	//*   3    7:ifnull          22
			zzaov.zza(zzcxf).zzsx();
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field zzaov zzcxf>
	//    6   14:invokestatic    #23  <Method zzapf zzaov.zza(zzaov)>
	//    7   17:invokeinterface #28  <Method void zzapf.zzsx()>
	//    8   22:return          
	}

	private final zzaov zzcxf;
}
