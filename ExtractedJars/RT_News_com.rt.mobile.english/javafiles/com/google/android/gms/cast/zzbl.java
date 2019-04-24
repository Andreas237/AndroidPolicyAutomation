// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.zzcn;
import com.google.android.gms.internal.cast.zzdh;

// Referenced classes of package com.google.android.gms.cast:
//			RemoteMediaPlayer

final class zzbl extends RemoteMediaPlayer.zzb
{

	zzbl(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1)
	{
		zzfa = remotemediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field RemoteMediaPlayer zzfa>
		zzfb = googleapiclient1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #14  <Field GoogleApiClient zzfb>
		super(googleapiclient);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #17  <Method void RemoteMediaPlayer$zzb(GoogleApiClient)>
	//    9   15:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((RemoteMediaPlayer.zzb)this).zza((zzcn)anyclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class zzcn>
	//    3    5:invokevirtual   #28  <Method void RemoteMediaPlayer$zzb.zza(zzcn)>
	//    4    8:return          
	}

	protected final void zza(zzcn zzcn1)
	{
		Object obj = RemoteMediaPlayer.zze(zzfa);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field RemoteMediaPlayer zzfa>
	//    2    4:invokestatic    #37  <Method Object RemoteMediaPlayer.zze(RemoteMediaPlayer)>
	//    3    7:astore_2        
		obj;
	//    4    8:aload_2         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		RemoteMediaPlayer.zzf(zzfa).zza(zzfb);
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field RemoteMediaPlayer zzfa>
	//    8   14:invokestatic    #41  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//    9   17:aload_0         
	//   10   18:getfield        #14  <Field GoogleApiClient zzfb>
	//   11   21:invokevirtual   #45  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		RemoteMediaPlayer.zzg(zzfa).zzb(zzgc);
	//   12   24:aload_0         
	//   13   25:getfield        #12  <Field RemoteMediaPlayer zzfa>
	//   14   28:invokestatic    #49  <Method zzdh RemoteMediaPlayer.zzg(RemoteMediaPlayer)>
	//   15   31:aload_0         
	//   16   32:getfield        #53  <Field com.google.android.gms.internal.cast.zzdm zzgc>
	//   17   35:invokevirtual   #59  <Method long zzdh.zzb(com.google.android.gms.internal.cast.zzdm)>
	//   18   38:pop2            
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   19   39:aload_0         
	//   20   40:getfield        #12  <Field RemoteMediaPlayer zzfa>
	//   21   43:invokestatic    #41  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   22   46:astore_1        
_L3:
		((RemoteMediaPlayer.zza) (zzcn1)).zza(((GoogleApiClient) (null)));
	//   23   47:aload_1         
	//   24   48:aconst_null     
	//   25   49:invokevirtual   #45  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		  goto _L1
	//*  26   52:goto            91
		zzcn1;
	//   27   55:astore_1        
		  goto _L2
	//*  28   56:goto            94
_L4:
		setResult(((com.google.android.gms.common.api.Result) ((RemoteMediaPlayer.MediaChannelResult)((RemoteMediaPlayer.zzb)this).createFailedResult(new Status(2100)))));
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:new             #61  <Class Status>
	//   32   64:dup             
	//   33   65:sipush          2100
	//   34   68:invokespecial   #64  <Method void Status(int)>
	//   35   71:invokevirtual   #68  <Method com.google.android.gms.common.api.Result RemoteMediaPlayer$zzb.createFailedResult(Status)>
	//   36   74:checkcast       #70  <Class RemoteMediaPlayer$MediaChannelResult>
	//   37   77:invokevirtual   #74  <Method void setResult(com.google.android.gms.common.api.Result)>
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   38   80:aload_0         
	//   39   81:getfield        #12  <Field RemoteMediaPlayer zzfa>
	//   40   84:invokestatic    #41  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   41   87:astore_1        
		  goto _L3
	//*  42   88:goto            47
_L1:
		obj;
	//   43   91:aload_2         
		JVM INSTR monitorexit ;
	//   44   92:monitorexit     
		return;
	//   45   93:return          
_L2:
		RemoteMediaPlayer.zzf(zzfa).zza(((GoogleApiClient) (null)));
	//   46   94:aload_0         
	//   47   95:getfield        #12  <Field RemoteMediaPlayer zzfa>
	//   48   98:invokestatic    #41  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   49  101:aconst_null     
	//   50  102:invokevirtual   #45  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		throw zzcn1;
	//   51  105:aload_1         
	//   52  106:athrow          
		zzcn1;
	//   53  107:astore_1        
		obj;
	//   54  108:aload_2         
		JVM INSTR monitorexit ;
	//   55  109:monitorexit     
		throw zzcn1;
	//   56  110:aload_1         
	//   57  111:athrow          
		zzcn1;
	//   58  112:astore_1        
		  goto _L4
	//*  59  113:goto            59
	}

	private final RemoteMediaPlayer zzfa;
	private final GoogleApiClient zzfb;
}
