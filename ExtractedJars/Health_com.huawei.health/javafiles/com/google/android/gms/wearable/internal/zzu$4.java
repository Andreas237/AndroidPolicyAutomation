// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzm, zzu, zzcx

class zzu$4 extends zzm
{

	public volatile void zza(com.google.android.gms.common.api.b b)
		throws RemoteException
	{
		zza((zzcx)b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class zzcx>
	//    3    5:invokevirtual   #29  <Method void zza(zzcx)>
	//    4    8:return          
	}

	protected void zza(zzcx zzcx1)
		throws RemoteException
	{
		zzcx1.zzz(((com.google.android.gms.internal.zzb) (this)), zzu.zza(zzbTX));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field zzu zzbTX>
	//    4    6:invokestatic    #33  <Method String zzu.zza(zzu)>
	//    5    9:invokevirtual   #37  <Method void zzcx.zzz(com.google.android.gms.internal.zzaad$zzb, String)>
	//    6   12:return          
	}

	public com.google.android.gms.wearable.l.GetOutputStreamResult zzbV(Status status)
	{
		return ((com.google.android.gms.wearable.l.GetOutputStreamResult) (new b(status, ((java.io.OutputStream) (null)))));
	//    0    0:new             #41  <Class zzu$zzb>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #44  <Method void zzu$zzb(Status, java.io.OutputStream)>
	//    5    9:areturn         
	}

	public Result zzc(Status status)
	{
		return ((Result) (zzbV(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #48  <Method com.google.android.gms.wearable.Channel$GetOutputStreamResult zzbV(Status)>
	//    3    5:areturn         
	}

	final zzu zzbTX;

	zzu$4(zzu zzu1, GoogleApiClient googleapiclient)
	{
		zzbTX = zzu1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzu zzbTX>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #19  <Method void zzm(GoogleApiClient)>
	//    6   10:return          
	}
}
