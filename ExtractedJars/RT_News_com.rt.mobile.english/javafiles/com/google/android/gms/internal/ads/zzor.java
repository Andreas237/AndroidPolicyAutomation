// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzoq, zzoz

final class zzor
	implements Runnable
{

	zzor(zzoq zzoq1)
	{
		zzbin = zzoq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzoq zzbin>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		if(zzoq.zzb(zzbin) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field zzoq zzbin>
	//*   2    4:invokestatic    #23  <Method zzoz zzoq.zzb(zzoq)>
	//*   3    7:ifnull          46
		{
			zzoq.zzb(zzbin).zzkq();
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field zzoq zzbin>
	//    6   14:invokestatic    #23  <Method zzoz zzoq.zzb(zzoq)>
	//    7   17:invokeinterface #28  <Method void zzoz.zzkq()>
			zzoq.zzb(zzbin).zzkp();
	//    8   22:aload_0         
	//    9   23:getfield        #12  <Field zzoq zzbin>
	//   10   26:invokestatic    #23  <Method zzoz zzoq.zzb(zzoq)>
	//   11   29:invokeinterface #31  <Method void zzoz.zzkp()>
			zzoq.zzb(zzbin).zzcs();
	//   12   34:aload_0         
	//   13   35:getfield        #12  <Field zzoq zzbin>
	//   14   38:invokestatic    #23  <Method zzoz zzoq.zzb(zzoq)>
	//   15   41:invokeinterface #34  <Method void zzoz.zzcs()>
		}
		zzoq.zza(zzbin, ((zzoz) (null)));
	//   16   46:aload_0         
	//   17   47:getfield        #12  <Field zzoq zzbin>
	//   18   50:aconst_null     
	//   19   51:invokestatic    #38  <Method zzoz zzoq.zza(zzoq, zzoz)>
	//   20   54:pop             
	//   21   55:return          
	}

	private final zzoq zzbin;
}
