// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.*;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			RemoteMediaPlayer

final class zzaz extends RemoteMediaPlayer.zzb
{

	zzaz(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1, JSONObject jsonobject)
	{
		zzfa = remotemediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field RemoteMediaPlayer zzfa>
		zzfb = googleapiclient1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #16  <Field GoogleApiClient zzfb>
		zzfi = jsonobject;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #18  <Field JSONObject zzfi>
		super(googleapiclient);
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:invokespecial   #21  <Method void RemoteMediaPlayer$zzb(GoogleApiClient)>
	//   12   21:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((RemoteMediaPlayer.zzb)this).zza((zzcn)anyclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #28  <Class zzcn>
	//    3    5:invokevirtual   #32  <Method void RemoteMediaPlayer$zzb.zza(zzcn)>
	//    4    8:return          
	}

	protected final void zza(zzcn zzcn1)
	{
		Object obj = RemoteMediaPlayer.zze(zzfa);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field RemoteMediaPlayer zzfa>
	//    2    4:invokestatic    #43  <Method Object RemoteMediaPlayer.zze(RemoteMediaPlayer)>
	//    3    7:astore_2        
		obj;
	//    4    8:aload_2         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		RemoteMediaPlayer.zzf(zzfa).zza(zzfb);
	//    6   10:aload_0         
	//    7   11:getfield        #14  <Field RemoteMediaPlayer zzfa>
	//    8   14:invokestatic    #47  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//    9   17:aload_0         
	//   10   18:getfield        #16  <Field GoogleApiClient zzfb>
	//   11   21:invokevirtual   #51  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		RemoteMediaPlayer.zzg(zzfa).zza(zzgc, 0, -1L, ((MediaQueueItem []) (null)), 1, ((Integer) (null)), zzfi);
	//   12   24:aload_0         
	//   13   25:getfield        #14  <Field RemoteMediaPlayer zzfa>
	//   14   28:invokestatic    #55  <Method zzdh RemoteMediaPlayer.zzg(RemoteMediaPlayer)>
	//   15   31:aload_0         
	//   16   32:getfield        #59  <Field com.google.android.gms.internal.cast.zzdm zzgc>
	//   17   35:iconst_0        
	//   18   36:ldc2w           #60  <Long -1L>
	//   19   39:aconst_null     
	//   20   40:iconst_1        
	//   21   41:aconst_null     
	//   22   42:aload_0         
	//   23   43:getfield        #18  <Field JSONObject zzfi>
	//   24   46:invokevirtual   #66  <Method long zzdh.zza(com.google.android.gms.internal.cast.zzdm, int, long, MediaQueueItem[], int, Integer, JSONObject)>
	//   25   49:pop2            
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   26   50:aload_0         
	//   27   51:getfield        #14  <Field RemoteMediaPlayer zzfa>
	//   28   54:invokestatic    #47  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   29   57:astore_1        
_L3:
		((RemoteMediaPlayer.zza) (zzcn1)).zza(((GoogleApiClient) (null)));
	//   30   58:aload_1         
	//   31   59:aconst_null     
	//   32   60:invokevirtual   #51  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		  goto _L1
	//*  33   63:goto            102
		zzcn1;
	//   34   66:astore_1        
		  goto _L2
	//*  35   67:goto            105
_L4:
		setResult(((com.google.android.gms.common.api.Result) ((RemoteMediaPlayer.MediaChannelResult)((RemoteMediaPlayer.zzb)this).createFailedResult(new Status(2100)))));
	//   36   70:aload_0         
	//   37   71:aload_0         
	//   38   72:new             #68  <Class Status>
	//   39   75:dup             
	//   40   76:sipush          2100
	//   41   79:invokespecial   #71  <Method void Status(int)>
	//   42   82:invokevirtual   #75  <Method com.google.android.gms.common.api.Result RemoteMediaPlayer$zzb.createFailedResult(Status)>
	//   43   85:checkcast       #77  <Class RemoteMediaPlayer$MediaChannelResult>
	//   44   88:invokevirtual   #81  <Method void setResult(com.google.android.gms.common.api.Result)>
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   45   91:aload_0         
	//   46   92:getfield        #14  <Field RemoteMediaPlayer zzfa>
	//   47   95:invokestatic    #47  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   48   98:astore_1        
		  goto _L3
	//*  49   99:goto            58
_L1:
		obj;
	//   50  102:aload_2         
		JVM INSTR monitorexit ;
	//   51  103:monitorexit     
		return;
	//   52  104:return          
_L2:
		RemoteMediaPlayer.zzf(zzfa).zza(((GoogleApiClient) (null)));
	//   53  105:aload_0         
	//   54  106:getfield        #14  <Field RemoteMediaPlayer zzfa>
	//   55  109:invokestatic    #47  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   56  112:aconst_null     
	//   57  113:invokevirtual   #51  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		throw zzcn1;
	//   58  116:aload_1         
	//   59  117:athrow          
		zzcn1;
	//   60  118:astore_1        
		obj;
	//   61  119:aload_2         
		JVM INSTR monitorexit ;
	//   62  120:monitorexit     
		throw zzcn1;
	//   63  121:aload_1         
	//   64  122:athrow          
		zzcn1;
	//   65  123:astore_1        
		  goto _L4
	//*  66  124:goto            70
	}

	private final RemoteMediaPlayer zzfa;
	private final GoogleApiClient zzfb;
	private final JSONObject zzfi;
}
