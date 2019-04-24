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

final class zzax extends RemoteMediaPlayer.zzb
{

	zzax(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1, int ai[], int i, JSONObject jsonobject)
	{
		zzfa = remotemediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field RemoteMediaPlayer zzfa>
		zzfb = googleapiclient1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #20  <Field GoogleApiClient zzfb>
		zzfo = ai;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #22  <Field int[] zzfo>
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
		RemoteMediaPlayer.zzg(zzfa).zza(zzgc, zzfo, zzfk, zzfi);
	//   12   24:aload_0         
	//   13   25:getfield        #18  <Field RemoteMediaPlayer zzfa>
	//   14   28:invokestatic    #63  <Method zzdh RemoteMediaPlayer.zzg(RemoteMediaPlayer)>
	//   15   31:aload_0         
	//   16   32:getfield        #67  <Field com.google.android.gms.internal.cast.zzdm zzgc>
	//   17   35:aload_0         
	//   18   36:getfield        #22  <Field int[] zzfo>
	//   19   39:aload_0         
	//   20   40:getfield        #24  <Field int zzfk>
	//   21   43:aload_0         
	//   22   44:getfield        #26  <Field JSONObject zzfi>
	//   23   47:invokevirtual   #72  <Method long zzdh.zza(com.google.android.gms.internal.cast.zzdm, int[], int, JSONObject)>
	//   24   50:pop2            
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   25   51:aload_0         
	//   26   52:getfield        #18  <Field RemoteMediaPlayer zzfa>
	//   27   55:invokestatic    #55  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   28   58:astore_1        
_L3:
		((RemoteMediaPlayer.zza) (zzcn1)).zza(((GoogleApiClient) (null)));
	//   29   59:aload_1         
	//   30   60:aconst_null     
	//   31   61:invokevirtual   #59  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		  goto _L1
	//*  32   64:goto            103
		zzcn1;
	//   33   67:astore_1        
		  goto _L2
	//*  34   68:goto            106
_L4:
		setResult(((com.google.android.gms.common.api.Result) ((RemoteMediaPlayer.MediaChannelResult)((RemoteMediaPlayer.zzb)this).createFailedResult(new Status(2100)))));
	//   35   71:aload_0         
	//   36   72:aload_0         
	//   37   73:new             #74  <Class Status>
	//   38   76:dup             
	//   39   77:sipush          2100
	//   40   80:invokespecial   #77  <Method void Status(int)>
	//   41   83:invokevirtual   #81  <Method com.google.android.gms.common.api.Result RemoteMediaPlayer$zzb.createFailedResult(Status)>
	//   42   86:checkcast       #83  <Class RemoteMediaPlayer$MediaChannelResult>
	//   43   89:invokevirtual   #87  <Method void setResult(com.google.android.gms.common.api.Result)>
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   44   92:aload_0         
	//   45   93:getfield        #18  <Field RemoteMediaPlayer zzfa>
	//   46   96:invokestatic    #55  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   47   99:astore_1        
		  goto _L3
	//*  48  100:goto            59
_L1:
		obj;
	//   49  103:aload_2         
		JVM INSTR monitorexit ;
	//   50  104:monitorexit     
		return;
	//   51  105:return          
_L2:
		RemoteMediaPlayer.zzf(zzfa).zza(((GoogleApiClient) (null)));
	//   52  106:aload_0         
	//   53  107:getfield        #18  <Field RemoteMediaPlayer zzfa>
	//   54  110:invokestatic    #55  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   55  113:aconst_null     
	//   56  114:invokevirtual   #59  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		throw zzcn1;
	//   57  117:aload_1         
	//   58  118:athrow          
		zzcn1;
	//   59  119:astore_1        
		obj;
	//   60  120:aload_2         
		JVM INSTR monitorexit ;
	//   61  121:monitorexit     
		throw zzcn1;
	//   62  122:aload_1         
	//   63  123:athrow          
		zzcn1;
	//   64  124:astore_1        
		  goto _L4
	//*  65  125:goto            71
	}

	private final RemoteMediaPlayer zzfa;
	private final GoogleApiClient zzfb;
	private final JSONObject zzfi;
	private final int zzfk;
	private final int zzfo[];
}
