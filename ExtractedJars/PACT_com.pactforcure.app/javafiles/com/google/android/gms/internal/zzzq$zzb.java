// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//			zzzq, zzaad

public static class zzzq$zzb extends zzzq
{

	public void zza(zzaad zzaad1, boolean flag)
	{
		zzaad1.zza(((zzzx) (zzayp)), flag);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #16  <Field zzzv$zza zzayp>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #27  <Method void zzaad.zza(zzzx, boolean)>
	//    5    9:return          
	}

	public void zza( )
		throws DeadObjectException
	{
		zzayp.zzb(((com.google.android.gms.common.api.Api.zzb) (.zzvr())));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzzv$zza zzayp>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #37  <Method com.google.android.gms.common.api.Api$zze zzaap$zza.zzvr()>
	//    4    8:invokevirtual   #42  <Method void zzzv$zza.zzb(com.google.android.gms.common.api.Api$zzb)>
	//    5   11:return          
	}

	public void zzy(Status status)
	{
		zzayp.zzA(status);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzzv$zza zzayp>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #49  <Method void zzzv$zza.zzA(Status)>
	//    4    8:return          
	}

	protected final zzzv$zza zzayp;

	public zzzq$zzb(int i, zzzv$zza zzzv$zza1)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #14  <Method void zzzq(int)>
		zzayp = zzzv$zza1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field zzzv$zza zzayp>
	//    6   10:return          
	}
}
