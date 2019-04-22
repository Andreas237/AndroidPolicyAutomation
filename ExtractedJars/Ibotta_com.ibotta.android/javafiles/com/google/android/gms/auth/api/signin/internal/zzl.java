// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//			zzp, zzh, zzv, zzm

final class zzl extends zzp
{

	zzl(GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void zzp(GoogleApiClient)>
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
		anyclient = ((com.google.android.gms.common.api.Api.AnyClient) ((zzh)anyclient));
	//    0    0:aload_1         
	//    1    1:checkcast       #18  <Class zzh>
	//    2    4:astore_1        
		((zzv)((zzh) (anyclient)).getService()).zze(((zzt) (new zzm(this))), ((zzh) (anyclient)).zzn());
	//    3    5:aload_1         
	//    4    6:invokevirtual   #22  <Method android.os.IInterface zzh.getService()>
	//    5    9:checkcast       #24  <Class zzv>
	//    6   12:new             #26  <Class zzm>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #29  <Method void zzm(zzl)>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #33  <Method com.google.android.gms.auth.api.signin.GoogleSignInOptions zzh.zzn()>
	//   12   24:invokeinterface #37  <Method void zzv.zze(zzt, com.google.android.gms.auth.api.signin.GoogleSignInOptions)>
	//   13   29:return          
	}
}
