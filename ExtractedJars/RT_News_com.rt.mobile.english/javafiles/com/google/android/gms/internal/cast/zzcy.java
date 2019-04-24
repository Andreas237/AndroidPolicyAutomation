// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzcf, zzcn

public class zzcy extends zzcf
{

	public zzcy(GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void zzcf(GoogleApiClient)>
	//    3    5:return          
	}

	public Result createFailedResult(Status status)
	{
		return ((Result) (status));
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	public void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		zza((zzcn)anyclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class zzcn>
	//    3    5:invokevirtual   #22  <Method void zza(zzcn)>
	//    4    8:return          
	}

	public void zza(zzcn zzcn1)
		throws RemoteException
	{
	//    0    0:return          
	}
}
