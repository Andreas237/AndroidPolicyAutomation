// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;


// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzbe, zzag, zzbd, zzbq, 
//			zzbc

final class zzai extends zzbe
{

	zzai(zzag zzag1, zzbc zzbc)
	{
		zzhh = zzag1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zzag zzhh>
		super(zzbc);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void zzbe(zzbc)>
	//    6   10:return          
	}

	public final void zzaq()
	{
		zzag.zza(zzhh).zzjf.zzb(((android.os.Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzag zzhh>
	//    2    4:invokestatic    #22  <Method zzbd zzag.zza(zzag)>
	//    3    7:getfield        #28  <Field zzbq zzbd.zzjf>
	//    4   10:aconst_null     
	//    5   11:invokeinterface #34  <Method void zzbq.zzb(android.os.Bundle)>
	//    6   16:return          
	}

	private final zzag zzhh;
}
