// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzcf, zzbl, zzdm

public abstract class zzbt extends zzcf
{

	public zzbt(zzbl zzbl1)
	{
		super(zzbl.zza(zzbl1));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #16  <Method com.google.android.gms.common.api.GoogleApiClient zzbl.zza(zzbl)>
	//    3    5:invokespecial   #19  <Method void zzcf(com.google.android.gms.common.api.GoogleApiClient)>
	//    4    8:return          
	}

	protected void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		execute();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method void execute()>
	//    2    4:return          
	}

	public abstract void execute();

	protected zzdm zztp;
}
