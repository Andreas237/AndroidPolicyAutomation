// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//			zzp, zzh, zzv, zzk

final class zzj extends zzp
{

	zzj(GoogleApiClient googleapiclient, Context context, GoogleSignInOptions googlesigninoptions)
	{
		val$context = context;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #13  <Field Context val$context>
		zzew = googlesigninoptions;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #15  <Field GoogleSignInOptions zzew>
		super(googleapiclient);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #18  <Method void zzp(GoogleApiClient)>
	//    9   15:return          
	}

	protected final Result createFailedResult(Status status)
	{
		return ((Result) (new GoogleSignInResult(((com.google.android.gms.auth.api.signin.GoogleSignInAccount) (null)), status)));
	//    0    0:new             #23  <Class GoogleSignInResult>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_1         
	//    4    6:invokespecial   #26  <Method void GoogleSignInResult(com.google.android.gms.auth.api.signin.GoogleSignInAccount, Status)>
	//    5    9:areturn         
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((zzv)((zzh)anyclient).getService()).zzd(((zzt) (new zzk(this))), zzew);
	//    0    0:aload_1         
	//    1    1:checkcast       #32  <Class zzh>
	//    2    4:invokevirtual   #36  <Method android.os.IInterface zzh.getService()>
	//    3    7:checkcast       #38  <Class zzv>
	//    4   10:new             #40  <Class zzk>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #43  <Method void zzk(zzj)>
	//    8   18:aload_0         
	//    9   19:getfield        #15  <Field GoogleSignInOptions zzew>
	//   10   22:invokeinterface #47  <Method void zzv.zzd(zzt, GoogleSignInOptions)>
	//   11   27:return          
	}

	final Context val$context;
	final GoogleSignInOptions zzew;
}
