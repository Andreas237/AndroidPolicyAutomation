// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzaar, zzaau

class zzaar$zzb$2 extends zzaav.zza
{

	public void zzwe()
	{
		zzaBF.zzg(new ConnectionResult(16, ((android.app.PendingIntent) (null))));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field com.google.android.gms.common.internal.zzf$zzf zzaBF>
	//    2    4:new             #24  <Class ConnectionResult>
	//    3    7:dup             
	//    4    8:bipush          16
	//    5   10:aconst_null     
	//    6   11:invokespecial   #27  <Method void ConnectionResult(int, android.app.PendingIntent)>
	//    7   14:invokeinterface #33  <Method void com.google.android.gms.common.internal.zzf$zzf.zzg(ConnectionResult)>
	//    8   19:return          
	}

	final com.google.android.gms.common.internal.zzf.zzf zzaBF;

	zzaar$zzb$2(zzaar.zzb zzb1, zzaau zzaau, com.google.android.gms.common.internal.zzf.zzf zzf)
	{
		zzaBF = zzf;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #18  <Field com.google.android.gms.common.internal.zzf$zzf zzaBF>
		super(zzaau);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #21  <Method void zzaav$zza(zzaau)>
	//    6   10:return          
	}
}
