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

final class zzbb extends RemoteMediaPlayer.zzb
{

	zzbb(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1, int i, JSONObject jsonobject)
	{
		zzfa = remotemediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field RemoteMediaPlayer zzfa>
		zzfb = googleapiclient1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #18  <Field GoogleApiClient zzfb>
		zzfg = i;
	//    6   10:aload_0         
	//    7   11:iload           4
	//    8   13:putfield        #20  <Field int zzfg>
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
		RemoteMediaPlayer.zzg(zzfa).zza(zzgc, 0, -1L, ((MediaQueueItem []) (null)), 0, Integer.valueOf(zzfg), zzfi);
	//   12   24:aload_0         
	//   13   25:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//   14   28:invokestatic    #59  <Method zzdh RemoteMediaPlayer.zzg(RemoteMediaPlayer)>
	//   15   31:aload_0         
	//   16   32:getfield        #63  <Field com.google.android.gms.internal.cast.zzdm zzgc>
	//   17   35:iconst_0        
	//   18   36:ldc2w           #64  <Long -1L>
	//   19   39:aconst_null     
	//   20   40:iconst_0        
	//   21   41:aload_0         
	//   22   42:getfield        #20  <Field int zzfg>
	//   23   45:invokestatic    #71  <Method Integer Integer.valueOf(int)>
	//   24   48:aload_0         
	//   25   49:getfield        #22  <Field JSONObject zzfi>
	//   26   52:invokevirtual   #76  <Method long zzdh.zza(com.google.android.gms.internal.cast.zzdm, int, long, MediaQueueItem[], int, Integer, JSONObject)>
	//   27   55:pop2            
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   28   56:aload_0         
	//   29   57:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//   30   60:invokestatic    #51  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   31   63:astore_1        
_L3:
		((RemoteMediaPlayer.zza) (zzcn1)).zza(((GoogleApiClient) (null)));
	//   32   64:aload_1         
	//   33   65:aconst_null     
	//   34   66:invokevirtual   #55  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
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
	//   40   78:new             #78  <Class Status>
	//   41   81:dup             
	//   42   82:sipush          2100
	//   43   85:invokespecial   #81  <Method void Status(int)>
	//   44   88:invokevirtual   #85  <Method com.google.android.gms.common.api.Result RemoteMediaPlayer$zzb.createFailedResult(Status)>
	//   45   91:checkcast       #87  <Class RemoteMediaPlayer$MediaChannelResult>
	//   46   94:invokevirtual   #91  <Method void setResult(com.google.android.gms.common.api.Result)>
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   47   97:aload_0         
	//   48   98:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//   49  101:invokestatic    #51  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
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
	//   56  112:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//   57  115:invokestatic    #51  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   58  118:aconst_null     
	//   59  119:invokevirtual   #55  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
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
	private final int zzfg;
	private final JSONObject zzfi;
}
