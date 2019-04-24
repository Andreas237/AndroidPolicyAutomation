// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.games.GameManagerClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzbt, zzbv, zzbw, zzbl

public abstract class zzbu extends zzbt
{

	public zzbu(zzbl zzbl, GameManagerClient gamemanagerclient)
	{
		zzth = zzbl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzbl zzth>
		super(zzbl);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #17  <Method void zzbt(zzbl)>
		zztq = gamemanagerclient;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #19  <Field GameManagerClient zztq>
		zztp = ((zzdm) (new zzbv(this, zzbl)));
	//    9   15:aload_0         
	//   10   16:new             #21  <Class zzbv>
	//   11   19:dup             
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokespecial   #24  <Method void zzbv(zzbu, zzbl)>
	//   15   25:putfield        #28  <Field zzdm zztp>
	//   16   28:return          
	}

	static GameManagerClient zza(zzbu zzbu1)
	{
		return zzbu1.zztq;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field GameManagerClient zztq>
	//    2    4:areturn         
	}

	public static com.google.android.gms.cast.games.GameManagerClient.GameManagerInstanceResult zzc(Status status)
	{
		return ((com.google.android.gms.cast.games.GameManagerClient.GameManagerInstanceResult) (new zzbw(status, ((GameManagerClient) (null)))));
	//    0    0:new             #35  <Class zzbw>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #38  <Method void zzbw(Status, GameManagerClient)>
	//    5    9:areturn         
	}

	public Result createFailedResult(Status status)
	{
		return ((Result) (zzc(status)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #42  <Method com.google.android.gms.cast.games.GameManagerClient$GameManagerInstanceResult zzc(Status)>
	//    2    4:areturn         
	}

	final zzbl zzth;
	private GameManagerClient zztq;
}
