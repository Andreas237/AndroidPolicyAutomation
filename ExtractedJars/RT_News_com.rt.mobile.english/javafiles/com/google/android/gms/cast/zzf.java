// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.cast.*;

final class zzf extends zzcy
{

	zzf(Cast.CastApi.zza zza1, GoogleApiClient googleapiclient, String s, String s1)
	{
		zzad = s;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #11  <Field String zzad>
		zzae = s1;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #13  <Field String zzae>
		super(googleapiclient);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:invokespecial   #16  <Method void zzcy(GoogleApiClient)>
	//    9   16:return          
	}

	public final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((zzcy)this).zza((zzcn)anyclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class zzcn>
	//    3    5:invokevirtual   #27  <Method void zzcy.zza(zzcn)>
	//    4    8:return          
	}

	public final void zza(zzcn zzcn1)
		throws RemoteException
	{
		try
		{
			zzcn1.zza(zzad, zzae, ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #11  <Field String zzad>
	//    3    5:aload_0         
	//    4    6:getfield        #13  <Field String zzae>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #35  <Method void zzcn.zza(String, String, com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
			return;
	//    7   13:return          
		}
	//*   8   14:aload_0         
	//*   9   15:sipush          2001
	//*  10   18:invokevirtual   #41  <Method void zzcf.zzk(int)>
	//*  11   21:return          
		// Misplaced declaration of an exception variable
		catch(zzcn zzcn1)
		{
			((zzcf)this).zzk(2001);
		}
	//*  12   22:astore_1        
	//*  13   23:goto            14
	}

	private final String zzad;
	private final String zzae;
}
