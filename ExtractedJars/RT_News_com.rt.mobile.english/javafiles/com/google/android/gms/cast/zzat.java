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

final class zzat extends RemoteMediaPlayer.zzb
{

	zzat(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1, MediaQueueItem amediaqueueitem[], int i, JSONObject jsonobject)
	{
		zzfa = remotemediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field RemoteMediaPlayer zzfa>
		zzfb = googleapiclient1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #20  <Field GoogleApiClient zzfb>
		zzfj = amediaqueueitem;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #22  <Field MediaQueueItem[] zzfj>
		zzfk = i;
	//    9   16:aload_0         
	//   10   17:iload           5
	//   11   19:putfield        #24  <Field int zzfk>
		zzfi = jsonobject;
	//   12   22:aload_0         
	//   13   23:aload           6
	//   14   25:putfield        #26  <Field JSONObject zzfi>
		super(googleapiclient);
	//   15   28:aload_0         
	//   16   29:aload_2         
	//   17   30:invokespecial   #29  <Method void RemoteMediaPlayer$zzb(GoogleApiClient)>
	//   18   33:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((RemoteMediaPlayer.zzb)this).zza((zzcn)anyclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class zzcn>
	//    3    5:invokevirtual   #40  <Method void RemoteMediaPlayer$zzb.zza(zzcn)>
	//    4    8:return          
	}

	protected final void zza(zzcn zzcn1)
	{
		Object obj = RemoteMediaPlayer.zze(zzfa);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field RemoteMediaPlayer zzfa>
	//    2    4:invokestatic    #51  <Method Object RemoteMediaPlayer.zze(RemoteMediaPlayer)>
	//    3    7:astore_2        
		obj;
	//    4    8:aload_2         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		RemoteMediaPlayer.zzf(zzfa).zza(zzfb);
	//    6   10:aload_0         
	//    7   11:getfield        #18  <Field RemoteMediaPlayer zzfa>
	//    8   14:invokestatic    #55  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//    9   17:aload_0         
	//   10   18:getfield        #20  <Field GoogleApiClient zzfb>
	//   11   21:invokevirtual   #59  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		RemoteMediaPlayer.zzg(zzfa).zza(zzgc, zzfj, zzfk, 0, -1, -1L, zzfi);
	//   12   24:aload_0         
	//   13   25:getfield        #18  <Field RemoteMediaPlayer zzfa>
	//   14   28:invokestatic    #63  <Method zzdh RemoteMediaPlayer.zzg(RemoteMediaPlayer)>
	//   15   31:aload_0         
	//   16   32:getfield        #67  <Field com.google.android.gms.internal.cast.zzdm zzgc>
	//   17   35:aload_0         
	//   18   36:getfield        #22  <Field MediaQueueItem[] zzfj>
	//   19   39:aload_0         
	//   20   40:getfield        #24  <Field int zzfk>
	//   21   43:iconst_0        
	//   22   44:iconst_m1       
	//   23   45:ldc2w           #68  <Long -1L>
	//   24   48:aload_0         
	//   25   49:getfield        #26  <Field JSONObject zzfi>
	//   26   52:invokevirtual   #74  <Method long zzdh.zza(com.google.android.gms.internal.cast.zzdm, MediaQueueItem[], int, int, int, long, JSONObject)>
	//   27   55:pop2            
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   28   56:aload_0         
	//   29   57:getfield        #18  <Field RemoteMediaPlayer zzfa>
	//   30   60:invokestatic    #55  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   31   63:astore_1        
_L3:
		((RemoteMediaPlayer.zza) (zzcn1)).zza(((GoogleApiClient) (null)));
	//   32   64:aload_1         
	//   33   65:aconst_null     
	//   34   66:invokevirtual   #59  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		  goto _L1
	//*  35   69:goto            108
		zzcn1;
	//   36   72:astore_1        
		  goto _L2
	//*  37   73:goto            111
_L4:
		setResult(((com.google.android.gms.common.api.Result) ((RemoteMediaPlayer.MediaChannelResult)((RemoteMediaPlayer.zzb)this).createFailedResult(new Status(2100)))));
	//   38   76:aload_0         
	//   39   77:aload_0         
	//   40   78:new             #76  <Class Status>
	//   41   81:dup             
	//   42   82:sipush          2100
	//   43   85:invokespecial   #79  <Method void Status(int)>
	//   44   88:invokevirtual   #83  <Method com.google.android.gms.common.api.Result RemoteMediaPlayer$zzb.createFailedResult(Status)>
	//   45   91:checkcast       #85  <Class RemoteMediaPlayer$MediaChannelResult>
	//   46   94:invokevirtual   #89  <Method void setResult(com.google.android.gms.common.api.Result)>
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   47   97:aload_0         
	//   48   98:getfield        #18  <Field RemoteMediaPlayer zzfa>
	//   49  101:invokestatic    #55  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   50  104:astore_1        
		  goto _L3
	//*  51  105:goto            64
_L1:
		obj;
	//   52  108:aload_2         
		JVM INSTR monitorexit ;
	//   53  109:monitorexit     
		return;
	//   54  110:return          
_L2:
		RemoteMediaPlayer.zzf(zzfa).zza(((GoogleApiClient) (null)));
	//   55  111:aload_0         
	//   56  112:getfield        #18  <Field RemoteMediaPlayer zzfa>
	//   57  115:invokestatic    #55  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   58  118:aconst_null     
	//   59  119:invokevirtual   #59  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		throw zzcn1;
	//   60  122:aload_1         
	//   61  123:athrow          
		zzcn1;
	//   62  124:astore_1        
		obj;
	//   63  125:aload_2         
		JVM INSTR monitorexit ;
	//   64  126:monitorexit     
		throw zzcn1;
	//   65  127:aload_1         
	//   66  128:athrow          
		zzcn1;
	//   67  129:astore_1        
		  goto _L4
	//*  68  130:goto            76
	}

	private final RemoteMediaPlayer zzfa;
	private final GoogleApiClient zzfb;
	private final JSONObject zzfi;
	private final MediaQueueItem zzfj[];
	private final int zzfk;
}
