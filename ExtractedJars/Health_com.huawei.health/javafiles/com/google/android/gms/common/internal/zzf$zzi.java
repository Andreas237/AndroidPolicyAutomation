// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzf

public class zzf$zzi
	implements zzf$zzf
{

	public void zzg(ConnectionResult connectionresult)
	{
		if(connectionresult.isSuccess())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #28  <Method boolean ConnectionResult.isSuccess()>
	//*   2    4:ifeq            23
		{
			zzaFu.zza(((zzr) (null)), zzaFu.zzxF());
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field zzf zzaFu>
	//    5   11:aconst_null     
	//    6   12:aload_0         
	//    7   13:getfield        #15  <Field zzf zzaFu>
	//    8   16:invokevirtual   #32  <Method java.util.Set zzf.zzxF()>
	//    9   19:invokevirtual   #36  <Method void zzf.zza(zzr, java.util.Set)>
			return;
	//   10   22:return          
		}
		if(zzf.zzd(zzaFu) != null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #15  <Field zzf zzaFu>
	//*  13   27:invokestatic    #40  <Method zzf$zzc zzf.zzd(zzf)>
	//*  14   30:ifnull          46
			zzf.zzd(zzaFu).onConnectionFailed(connectionresult);
	//   15   33:aload_0         
	//   16   34:getfield        #15  <Field zzf zzaFu>
	//   17   37:invokestatic    #40  <Method zzf$zzc zzf.zzd(zzf)>
	//   18   40:aload_1         
	//   19   41:invokeinterface #45  <Method void zzf$zzc.onConnectionFailed(ConnectionResult)>
	//   20   46:return          
	}

	final zzf zzaFu;

	public zzf$zzi(zzf zzf1)
	{
		zzaFu = zzf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzf zzaFu>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
