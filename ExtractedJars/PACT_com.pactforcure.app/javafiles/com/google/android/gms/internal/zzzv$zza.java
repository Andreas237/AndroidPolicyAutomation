// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.internal:
//			zzzx, zzzv

public static abstract class zzzv$zza extends zzzx
	implements zzzv$zzb
{

	private void zzc(RemoteException remoteexception)
	{
		zzA(new Status(8, remoteexception.getLocalizedMessage(), ((android.app.PendingIntent) (null))));
	//    0    0:aload_0         
	//    1    1:new             #58  <Class Status>
	//    2    4:dup             
	//    3    5:bipush          8
	//    4    7:aload_1         
	//    5    8:invokevirtual   #64  <Method String RemoteException.getLocalizedMessage()>
	//    6   11:aconst_null     
	//    7   12:invokespecial   #67  <Method void Status(int, String, android.app.PendingIntent)>
	//    8   15:invokevirtual   #71  <Method void zzA(Status)>
	//    9   18:return          
	}

	public final Api getApi()
	{
		return zzawb;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Api zzawb>
	//    2    4:areturn         
	}

	public void setResult(Object obj)
	{
		super.zzb((Result)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #78  <Class Result>
	//    3    5:invokespecial   #81  <Method void zzzx.zzb(Result)>
	//    4    8:return          
	}

	public final void zzA(Status status)
	{
		boolean flag;
		if(!status.isSuccess())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #85  <Method boolean Status.isSuccess()>
	//*   2    4:ifne            25
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:iload_2         
	//*   6   10:ldc1            #87  <String "Failed result must not be success">
	//*   7   12:invokestatic    #90  <Method void zzac.zzb(boolean, Object)>
	//*   8   15:aload_0         
	//*   9   16:aload_0         
	//*  10   17:aload_1         
	//*  11   18:invokevirtual   #93  <Method Result zzc(Status)>
	//*  12   21:invokevirtual   #94  <Method void zzb(Result)>
	//*  13   24:return          
			flag = false;
	//   14   25:iconst_0        
	//   15   26:istore_2        
		zzac.zzb(flag, "Failed result must not be success");
		zzb(zzc(status));
	//*  16   27:goto            9
	}

	protected abstract void zza(com.google.android.gms.common.api.Api.zzb zzb1)
		throws RemoteException;

	public final void zzb(com.google.android.gms.common.api.Api.zzb zzb1)
		throws DeadObjectException
	{
		try
		{
			zza(zzb1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #99  <Method void zza(com.google.android.gms.common.api.Api$zzb)>
			return;
	//    3    5:return          
		}
		// Misplaced declaration of an exception variable
		catch(com.google.android.gms.common.api.Api.zzb zzb1)
	//*   4    6:astore_1        
		{
			zzc(((RemoteException) (zzb1)));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokespecial   #101 <Method void zzc(RemoteException)>
			throw zzb1;
	//    8   12:aload_1         
	//    9   13:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(com.google.android.gms.common.api.Api.zzb zzb1)
	//*  10   14:astore_1        
		{
			zzc(((RemoteException) (zzb1)));
	//   11   15:aload_0         
	//   12   16:aload_1         
	//   13   17:invokespecial   #101 <Method void zzc(RemoteException)>
		}
	//   14   20:return          
	}

	public final com.google.android.gms.common.api.Api.zzc zzuH()
	{
		return zzayF;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field com.google.android.gms.common.api.Api$zzc zzayF>
	//    2    4:areturn         
	}

	private final Api zzawb;
	private final com.google.android.gms.common.api.Api.zzc zzayF;

	protected zzzv$zza(com.google.android.gms.common.api.Api.zzc zzc1, GoogleApiClient googleapiclient)
	{
		super((GoogleApiClient)zzac.zzb(((Object) (googleapiclient)), "GoogleApiClient must not be null"));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:ldc1            #21  <String "GoogleApiClient must not be null">
	//    3    4:invokestatic    #27  <Method Object zzac.zzb(Object, Object)>
	//    4    7:checkcast       #29  <Class GoogleApiClient>
	//    5   10:invokespecial   #32  <Method void zzzx(GoogleApiClient)>
		zzayF = (com.google.android.gms.common.api.Api.zzc)zzac.zzw(((Object) (zzc1)));
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokestatic    #36  <Method Object zzac.zzw(Object)>
	//    9   18:checkcast       #38  <Class com.google.android.gms.common.api.Api$zzc>
	//   10   21:putfield        #40  <Field com.google.android.gms.common.api.Api$zzc zzayF>
		zzawb = null;
	//   11   24:aload_0         
	//   12   25:aconst_null     
	//   13   26:putfield        #42  <Field Api zzawb>
	//   14   29:return          
	}

	protected zzzv$zza(Api api, GoogleApiClient googleapiclient)
	{
		super((GoogleApiClient)zzac.zzb(((Object) (googleapiclient)), "GoogleApiClient must not be null"));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:ldc1            #21  <String "GoogleApiClient must not be null">
	//    3    4:invokestatic    #27  <Method Object zzac.zzb(Object, Object)>
	//    4    7:checkcast       #29  <Class GoogleApiClient>
	//    5   10:invokespecial   #32  <Method void zzzx(GoogleApiClient)>
		zzayF = api.zzuH();
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokevirtual   #53  <Method com.google.android.gms.common.api.Api$zzc Api.zzuH()>
	//    9   18:putfield        #40  <Field com.google.android.gms.common.api.Api$zzc zzayF>
		zzawb = api;
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:putfield        #42  <Field Api zzawb>
	//   13   26:return          
	}
}
