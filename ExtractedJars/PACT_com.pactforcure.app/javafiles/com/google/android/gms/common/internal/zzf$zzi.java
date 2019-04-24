// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzf

protected class zzf$zzi
	implements zzf$zzf
{

	public void zzg(ConnectionResult connectionresult)
	{
		if(connectionresult.isSuccess())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #28  <Method boolean ConnectionResult.isSuccess()>
	//*   2    4:ifeq            23
			zzaDV.zza(((zzr) (null)), zzaDV.zzwY());
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field zzf zzaDV>
	//    5   11:aconst_null     
	//    6   12:aload_0         
	//    7   13:getfield        #15  <Field zzf zzaDV>
	//    8   16:invokevirtual   #32  <Method java.util.Set zzf.zzwY()>
	//    9   19:invokevirtual   #36  <Method void zzf.zza(zzr, java.util.Set)>
		else
	//*  10   22:return          
		if(zzf.zzd(zzaDV) != null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #15  <Field zzf zzaDV>
	//*  13   27:invokestatic    #40  <Method zzf$zzc zzf.zzd(zzf)>
	//*  14   30:ifnull          22
		{
			zzf.zzd(zzaDV).onConnectionFailed(connectionresult);
	//   15   33:aload_0         
	//   16   34:getfield        #15  <Field zzf zzaDV>
	//   17   37:invokestatic    #40  <Method zzf$zzc zzf.zzd(zzf)>
	//   18   40:aload_1         
	//   19   41:invokeinterface #45  <Method void zzf$zzc.onConnectionFailed(ConnectionResult)>
			return;
	//   20   46:return          
		}
	}

	final zzf zzaDV;

	public zzf$zzi(zzf zzf1)
	{
		zzaDV = zzf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzf zzaDV>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
