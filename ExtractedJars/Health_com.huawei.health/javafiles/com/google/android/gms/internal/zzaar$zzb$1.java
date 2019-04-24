// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzaar, zzaau

class zzaar$zzb$1 extends zzaav.zza
{

	public void zzwe()
	{
		zzaar.zza(zzaBE.zzaBA, zzaBD);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field zzaar$zzb zzaBE>
	//    2    4:getfield        #30  <Field zzaar zzaar$zzb.zzaBA>
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field ConnectionResult zzaBD>
	//    5   11:invokestatic    #34  <Method void zzaar.zza(zzaar, ConnectionResult)>
	//    6   14:return          
	}

	final ConnectionResult zzaBD;
	final zzaar.zzb zzaBE;

	zzaar$zzb$1(zzaar.zzb zzb1, zzaau zzaau, ConnectionResult connectionresult)
	{
		zzaBE = zzb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field zzaar$zzb zzaBE>
		zzaBD = connectionresult;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #22  <Field ConnectionResult zzaBD>
		super(zzaau);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #25  <Method void zzaav$zza(zzaau)>
	//    9   15:return          
	}
}
