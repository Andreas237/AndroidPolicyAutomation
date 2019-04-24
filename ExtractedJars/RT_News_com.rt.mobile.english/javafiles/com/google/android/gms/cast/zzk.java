// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.cast.*;

final class zzk extends zzcy
{

	zzk(Cast.CastApi.zza zza1, GoogleApiClient googleapiclient)
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
			zzcn1.zza("", ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (this)));
	//    0    0:aload_1         
	//    1    1:ldc1            #25  <String "">
	//    2    3:aload_0         
	//    3    4:invokevirtual   #28  <Method void zzcn.zza(String, com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
			return;
	//    4    7:return          
		}
	//*   5    8:aload_0         
	//*   6    9:sipush          2001
	//*   7   12:invokevirtual   #34  <Method void zzcf.zzk(int)>
	//*   8   15:return          
		// Misplaced declaration of an exception variable
		catch(zzcn zzcn1)
		{
			((zzcf)this).zzk(2001);
		}
	//*   9   16:astore_1        
	//*  10   17:goto            8
	}
}
