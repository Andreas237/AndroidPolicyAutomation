// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//			zzzx, zzaal

public static class zzzx$zzb extends zzzx
{

	public void zza(zzaal zzaal1, boolean flag)
	{
		zzaal1.zza(((zzaaf) (zzazF)), flag);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #16  <Field zzaad$zza zzazF>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #27  <Method void zzaal.zza(zzaaf, boolean)>
	//    5    9:return          
	}

	public void zza( )
		throws DeadObjectException
	{
		zzazF.zzb(((com.google.android.gms.common.api.Api.zzb) (.zzvU())));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzaad$zza zzazF>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #37  <Method com.google.android.gms.common.api.Api$zze zzaax$zza.zzvU()>
	//    4    8:invokevirtual   #42  <Method void zzaad$zza.zzb(com.google.android.gms.common.api.Api$zzb)>
	//    5   11:return          
	}

	public void zzz(Status status)
	{
		zzazF.zzB(status);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzaad$zza zzazF>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #49  <Method void zzaad$zza.zzB(Status)>
	//    4    8:return          
	}

	protected final  zzazF;

	public zzzx$zzb(int i,  )
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #14  <Method void zzzx(int)>
		zzazF = ;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field zzaad$zza zzazF>
	//    6   10:return          
	}
}
