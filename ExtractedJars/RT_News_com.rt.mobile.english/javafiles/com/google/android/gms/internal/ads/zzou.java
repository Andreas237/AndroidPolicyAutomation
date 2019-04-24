// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzos, zzoz

final class zzou
	implements Runnable
{

	zzou(zzos zzos1)
	{
		zzbir = zzos1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzos zzbir>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		if(zzos.zza(zzbir) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field zzos zzbir>
	//*   2    4:invokestatic    #23  <Method zzoz zzos.zza(zzos)>
	//*   3    7:ifnull          34
		{
			zzos.zza(zzbir).zzkq();
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field zzos zzbir>
	//    6   14:invokestatic    #23  <Method zzoz zzos.zza(zzos)>
	//    7   17:invokeinterface #28  <Method void zzoz.zzkq()>
			zzos.zza(zzbir).zzkp();
	//    8   22:aload_0         
	//    9   23:getfield        #12  <Field zzos zzbir>
	//   10   26:invokestatic    #23  <Method zzoz zzos.zza(zzos)>
	//   11   29:invokeinterface #31  <Method void zzoz.zzkp()>
		}
		zzos.zza(zzbir, ((zzoz) (null)));
	//   12   34:aload_0         
	//   13   35:getfield        #12  <Field zzos zzbir>
	//   14   38:aconst_null     
	//   15   39:invokestatic    #34  <Method zzoz zzos.zza(zzos, zzoz)>
	//   16   42:pop             
	//   17   43:return          
	}

	private final zzos zzbir;
}
