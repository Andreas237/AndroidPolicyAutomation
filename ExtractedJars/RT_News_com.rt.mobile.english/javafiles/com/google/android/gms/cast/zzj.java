// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.cast.*;

final class zzj extends zzcy
{

	zzj(Cast.CastApi.zza zza1, GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #9   <Method void zzcy(GoogleApiClient)>
	//    3    5:return          
	}

	public final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((zzcy)this).zza((zzcn)anyclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class zzcn>
	//    3    5:invokevirtual   #20  <Method void zzcy.zza(zzcn)>
	//    4    8:return          
	}

	public final void zza(zzcn zzcn1)
		throws RemoteException
	{
		try
		{
			zzcn1.zzb(((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #27  <Method void zzcn.zzb(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
			return;
	//    3    5:return          
		}
	//*   4    6:aload_0         
	//*   5    7:sipush          2001
	//*   6   10:invokevirtual   #33  <Method void zzcf.zzk(int)>
	//*   7   13:return          
		// Misplaced declaration of an exception variable
		catch(zzcn zzcn1)
		{
			((zzcf)this).zzk(2001);
		}
	//*   8   14:astore_1        
	//*   9   15:goto            6
	}
}
