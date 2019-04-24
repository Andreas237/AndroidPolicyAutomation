// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//			zzabw, zzabz

private static class zzabz$zza extends zzabw
{

	public void zzcX(int i)
		throws RemoteException
	{
		zzaFq.setResult(((Object) (new Status(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzzv$zzb zzaFq>
	//    2    4:new             #26  <Class Status>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:invokespecial   #28  <Method void Status(int)>
	//    6   12:invokeinterface #34  <Method void zzzv$zzb.setResult(Object)>
	//    7   17:return          
	}

	private final zzzv.zzb zzaFq;

	public zzabz$zza(zzzv.zzb zzb)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzabw()>
		zzaFq = zzb;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field zzzv$zzb zzaFq>
	//    5    9:return          
	}
}
