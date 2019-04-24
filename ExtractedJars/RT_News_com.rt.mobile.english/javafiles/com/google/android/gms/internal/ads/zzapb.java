// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaov, zzapf

final class zzapb
	implements Runnable
{

	zzapb(zzaov zzaov1, int i, int j)
	{
		zzcxf = zzaov1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzaov zzcxf>
		zzcxi = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #17  <Field int zzcxi>
		zzcxj = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #19  <Field int zzcxj>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #22  <Method void Object()>
	//   11   19:return          
	}

	public final void run()
	{
		if(zzaov.zza(zzcxf) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field zzaov zzcxf>
	//*   2    4:invokestatic    #30  <Method zzapf zzaov.zza(zzaov)>
	//*   3    7:ifnull          30
			zzaov.zza(zzcxf).zzf(zzcxi, zzcxj);
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field zzaov zzcxf>
	//    6   14:invokestatic    #30  <Method zzapf zzaov.zza(zzaov)>
	//    7   17:aload_0         
	//    8   18:getfield        #17  <Field int zzcxi>
	//    9   21:aload_0         
	//   10   22:getfield        #19  <Field int zzcxj>
	//   11   25:invokeinterface #36  <Method void zzapf.zzf(int, int)>
	//   12   30:return          
	}

	private final zzaov zzcxf;
	private final int zzcxi;
	private final int zzcxj;
}
