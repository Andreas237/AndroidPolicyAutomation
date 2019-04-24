// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//			zzace, zzach

static class zzach$zza extends zzace
{

	public void zzdd(int i)
		throws RemoteException
	{
		zzaGN.setResult(((Object) (new Status(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzaad$zzb zzaGN>
	//    2    4:new             #26  <Class Status>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:invokespecial   #28  <Method void Status(int)>
	//    6   12:invokeinterface #34  <Method void zzaad$zzb.setResult(Object)>
	//    7   17:return          
	}

	private final zzaad$zzb zzaGN;

	public zzach$zza(zzaad$zzb zzaad$zzb1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzace()>
		zzaGN = zzaad$zzb1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field zzaad$zzb zzaGN>
	//    5    9:return          
	}
}
