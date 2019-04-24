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
//			RemoteMediaPlayer, MediaQueueItem

final class zzav extends RemoteMediaPlayer.zzb
{

	zzav(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1, MediaQueueItem amediaqueueitem[], JSONObject jsonobject)
	{
		zzfa = remotemediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field RemoteMediaPlayer zzfa>
		zzfb = googleapiclient1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #18  <Field GoogleApiClient zzfb>
		zzfm = amediaqueueitem;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #20  <Field MediaQueueItem[] zzfm>
		zzfi = jsonobject;
	//    9   16:aload_0         
	//   10   17:aload           5
	//   11   19:putfield        #22  <Field JSONObject zzfi>
		super(googleapiclient);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokespecial   #25  <Method void RemoteMediaPlayer$zzb(GoogleApiClient)>
	//   15   27:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((RemoteMediaPlayer.zzb)this).zza((zzcn)anyclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #32  <Class zzcn>
	//    3    5:invokevirtual   #36  <Method void RemoteMediaPlayer$zzb.zza(zzcn)>
	//    4    8:return          
	}

	protected final void zza(zzcn zzcn1)
	{
		Object obj = RemoteMediaPlayer.zze(zzfa);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//    2    4:invokestatic    #47  <Method Object RemoteMediaPlayer.zze(RemoteMediaPlayer)>
	//    3    7:astore_2        
		obj;
	//    4    8:aload_2         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		RemoteMediaPlayer.zzf(zzfa).zza(zzfb);
	//    6   10:aload_0         
	//    7   11:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//    8   14:invokestatic    #51  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//    9   17:aload_0         
	//   10   18:getfield        #18  <Field GoogleApiClient zzfb>
	//   11   21:invokevirtual   #55  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		RemoteMediaPlayer.zzg(zzfa).zza(zzgc, 0, -1L, zzfm, 0, ((Integer) (null)), zzfi);
	//   12   24:aload_0         
	//   13   25:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//   14   28:invokestatic    #59  <Method zzdh RemoteMediaPlayer.zzg(RemoteMediaPlayer)>
	//   15   31:aload_0         
	//   16   32:getfield        #63  <Field com.google.android.gms.internal.cast.zzdm zzgc>
	//   17   35:iconst_0        
	//   18   36:ldc2w           #64  <Long -1L>
	//   19   39:aload_0         
	//   20   40:getfield        #20  <Field MediaQueueItem[] zzfm>
	//   21   43:iconst_0        
	//   22   44:aconst_null     
	//   23   45:aload_0         
	//   24   46:getfield        #22  <Field JSONObject zzfi>
	//   25   49:invokevirtual   #70  <Method long zzdh.zza(com.google.android.gms.internal.cast.zzdm, int, long, MediaQueueItem[], int, Integer, JSONObject)>
	//   26   52:pop2            
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   27   53:aload_0         
	//   28   54:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//   29   57:invokestatic    #51  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   30   60:astore_1        
_L3:
		((RemoteMediaPlayer.zza) (zzcn1)).zza(((GoogleApiClient) (null)));
	//   31   61:aload_1         
	//   32   62:aconst_null     
	//   33   63:invokevirtual   #55  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		  goto _L1
	//*  34   66:goto            105
		zzcn1;
	//   35   69:astore_1        
		  goto _L2
	//*  36   70:goto            108
_L4:
		setResult(((com.google.android.gms.common.api.Result) ((RemoteMediaPlayer.MediaChannelResult)((RemoteMediaPlayer.zzb)this).createFailedResult(new Status(2100)))));
	//   37   73:aload_0         
	//   38   74:aload_0         
	//   39   75:new             #72  <Class Status>
	//   40   78:dup             
	//   41   79:sipush          2100
	//   42   82:invokespecial   #75  <Method void Status(int)>
	//   43   85:invokevirtual   #79  <Method com.google.android.gms.common.api.Result RemoteMediaPlayer$zzb.createFailedResult(Status)>
	//   44   88:checkcast       #81  <Class RemoteMediaPlayer$MediaChannelResult>
	//   45   91:invokevirtual   #85  <Method void setResult(com.google.android.gms.common.api.Result)>
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   46   94:aload_0         
	//   47   95:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//   48   98:invokestatic    #51  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   49  101:astore_1        
		  goto _L3
	//*  50  102:goto            61
_L1:
		obj;
	//   51  105:aload_2         
		JVM INSTR monitorexit ;
	//   52  106:monitorexit     
		return;
	//   53  107:return          
_L2:
		RemoteMediaPlayer.zzf(zzfa).zza(((GoogleApiClient) (null)));
	//   54  108:aload_0         
	//   55  109:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//   56  112:invokestatic    #51  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   57  115:aconst_null     
	//   58  116:invokevirtual   #55  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		throw zzcn1;
	//   59  119:aload_1         
	//   60  120:athrow          
		zzcn1;
	//   61  121:astore_1        
		obj;
	//   62  122:aload_2         
		JVM INSTR monitorexit ;
	//   63  123:monitorexit     
		throw zzcn1;
	//   64  124:aload_1         
	//   65  125:athrow          
		zzcn1;
	//   66  126:astore_1        
		  goto _L4
	//*  67  127:goto            73
	}

	private final RemoteMediaPlayer zzfa;
	private final GoogleApiClient zzfb;
	private final JSONObject zzfi;
	private final MediaQueueItem zzfm[];
}
