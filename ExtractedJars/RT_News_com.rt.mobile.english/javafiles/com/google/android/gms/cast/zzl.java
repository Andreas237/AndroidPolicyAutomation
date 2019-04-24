// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.*;

final class zzl extends zzcy
{

	zzl(Cast.CastApi.zza zza1, GoogleApiClient googleapiclient, String s)
	{
		val$sessionId = s;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #10  <Field String val$sessionId>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void zzcy(GoogleApiClient)>
	//    6   10:return          
	}

	public final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((zzcy)this).zza((zzcn)anyclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #20  <Class zzcn>
	//    3    5:invokevirtual   #24  <Method void zzcy.zza(zzcn)>
	//    4    8:return          
	}

	public final void zza(zzcn zzcn1)
		throws RemoteException
	{
		if(TextUtils.isEmpty(((CharSequence) (val$sessionId))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #10  <Field String val$sessionId>
	//*   2    4:invokestatic    #33  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifeq            32
		{
			((zzcf)this).setResult(((zzcf)this).createFailedResult(new Status(2001, "IllegalArgument: sessionId cannot be null or empty", ((android.app.PendingIntent) (null)))));
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:new             #35  <Class Status>
	//    7   15:dup             
	//    8   16:sipush          2001
	//    9   19:ldc1            #37  <String "IllegalArgument: sessionId cannot be null or empty">
	//   10   21:aconst_null     
	//   11   22:invokespecial   #40  <Method void Status(int, String, android.app.PendingIntent)>
	//   12   25:invokevirtual   #46  <Method com.google.android.gms.common.api.Result zzcf.createFailedResult(Status)>
	//   13   28:invokevirtual   #50  <Method void zzcf.setResult(com.google.android.gms.common.api.Result)>
			return;
	//   14   31:return          
		}
		try
		{
			zzcn1.zza(val$sessionId, ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (this)));
	//   15   32:aload_1         
	//   16   33:aload_0         
	//   17   34:getfield        #10  <Field String val$sessionId>
	//   18   37:aload_0         
	//   19   38:invokevirtual   #53  <Method void zzcn.zza(String, com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
			return;
	//   20   41:return          
		}
	//*  21   42:aload_0         
	//*  22   43:sipush          2001
	//*  23   46:invokevirtual   #57  <Method void zzcf.zzk(int)>
	//*  24   49:return          
		// Misplaced declaration of an exception variable
		catch(zzcn zzcn1)
		{
			((zzcf)this).zzk(2001);
		}
	//*  25   50:astore_1        
	//*  26   51:goto            42
	}

	private final String val$sessionId;
}
