// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//			zzo, zzg, zzu, zzl

final class zzk extends zzo
{

	zzk(GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void zzo(GoogleApiClient)>
	//    3    5:return          
	}

	protected final Result createFailedResult(Status status)
	{
		return ((Result) (status));
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		anyclient = ((com.google.android.gms.common.api.Api.AnyClient) ((zzg)anyclient));
	//    0    0:aload_1         
	//    1    1:checkcast       #18  <Class zzg>
	//    2    4:astore_1        
		((zzu)((zzg) (anyclient)).getService()).zzd(((zzs) (new zzl(this))), ((zzg) (anyclient)).zzg());
	//    3    5:aload_1         
	//    4    6:invokevirtual   #22  <Method android.os.IInterface zzg.getService()>
	//    5    9:checkcast       #24  <Class zzu>
	//    6   12:new             #26  <Class zzl>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #29  <Method void zzl(zzk)>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #33  <Method com.google.android.gms.auth.api.signin.GoogleSignInOptions zzg.zzg()>
	//   12   24:invokeinterface #37  <Method void zzu.zzd(zzs, com.google.android.gms.auth.api.signin.GoogleSignInOptions)>
	//   13   29:return          
	}
}
