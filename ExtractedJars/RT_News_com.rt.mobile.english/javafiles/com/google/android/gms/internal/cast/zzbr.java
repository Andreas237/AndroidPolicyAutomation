// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzbt, zzbs, zzbx, zzbl

public abstract class zzbr extends zzbt
{

	public zzbr(zzbl zzbl)
	{
		zzth = zzbl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzbl zzth>
		super(zzbl);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #14  <Method void zzbt(zzbl)>
		zztp = ((zzdm) (new zzbs(this, zzbl)));
	//    6   10:aload_0         
	//    7   11:new             #16  <Class zzbs>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokespecial   #19  <Method void zzbs(zzbr, zzbl)>
	//   12   20:putfield        #23  <Field zzdm zztp>
	//   13   23:return          
	}

	public static com.google.android.gms.cast.games.GameManagerClient.GameManagerResult zzb(Status status)
	{
		return ((com.google.android.gms.cast.games.GameManagerClient.GameManagerResult) (new zzbx(status, ((String) (null)), -1L, ((org.json.JSONObject) (null)))));
	//    0    0:new             #28  <Class zzbx>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:ldc2w           #29  <Long -1L>
	//    5    9:aconst_null     
	//    6   10:invokespecial   #33  <Method void zzbx(Status, String, long, org.json.JSONObject)>
	//    7   13:areturn         
	}

	public Result createFailedResult(Status status)
	{
		return ((Result) (zzb(status)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #37  <Method com.google.android.gms.cast.games.GameManagerClient$GameManagerResult zzb(Status)>
	//    2    4:areturn         
	}

	final zzbl zzth;
}
