// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzm, zzby, zzcx

class zzby$1 extends zzm
{

	public volatile void zza(com.google.android.gms.common.api. )
		throws RemoteException
	{
		zza((zzcx));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #33  <Class zzcx>
	//    3    5:invokevirtual   #36  <Method void zza(zzcx)>
	//    4    8:return          
	}

	protected void zza(zzcx zzcx1)
		throws RemoteException
	{
		zzcx1.zza(((com.google.android.gms.internal.zb) (this)), zzbTR, zzbUG, zzbMo);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #19  <Field String zzbTR>
	//    4    6:aload_0         
	//    5    7:getfield        #21  <Field String zzbUG>
	//    6   10:aload_0         
	//    7   11:getfield        #23  <Field byte[] zzbMo>
	//    8   14:invokevirtual   #40  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, String, String, byte[])>
	//    9   17:return          
	}

	public Result zzc(Status status)
	{
		return ((Result) (zzca(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #46  <Method com.google.android.gms.wearable.MessageApi$SendMessageResult zzca(Status)>
	//    3    5:areturn         
	}

	protected com.google.android.gms.wearable.Api.SendMessageResult zzca(Status status)
	{
		return ((com.google.android.gms.wearable.Api.SendMessageResult) (new b(status, -1)));
	//    0    0:new             #48  <Class zzby$zzb>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iconst_m1       
	//    4    6:invokespecial   #51  <Method void zzby$zzb(Status, int)>
	//    5    9:areturn         
	}

	final byte zzbMo[];
	final String zzbTR;
	final String zzbUG;

	zzby$1(zzby zzby1, GoogleApiClient googleapiclient, String s, String s1, byte abyte0[])
	{
		zzbTR = s;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #19  <Field String zzbTR>
		zzbUG = s1;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #21  <Field String zzbUG>
		zzbMo = abyte0;
	//    6   11:aload_0         
	//    7   12:aload           5
	//    8   14:putfield        #23  <Field byte[] zzbMo>
		super(googleapiclient);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:invokespecial   #26  <Method void zzm(GoogleApiClient)>
	//   12   22:return          
	}
}
