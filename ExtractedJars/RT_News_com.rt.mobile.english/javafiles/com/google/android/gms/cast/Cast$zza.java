// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.internal.cast.zzcf;
import com.google.android.gms.internal.cast.zzcn;

// Referenced classes of package com.google.android.gms.cast:
//			Cast, zzm

static class Cast$zza extends zzcf
{

	public Result createFailedResult(Status status)
	{
		return ((Result) (new zzm(this, status)));
	//    0    0:new             #18  <Class zzm>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #21  <Method void zzm(Cast$zza, Status)>
	//    5    9:areturn         
	}

	public void doExecute(com.google.android.gms.common.api.ient ient)
		throws RemoteException
	{
		zza((zzcn)ient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class zzcn>
	//    3    5:invokevirtual   #30  <Method void zza(zzcn)>
	//    4    8:return          
	}

	public void zza(zzcn zzcn1)
		throws RemoteException
	{
	//    0    0:return          
	}

	public Cast$zza(GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void zzcf(GoogleApiClient)>
	//    3    5:return          
	}
}
