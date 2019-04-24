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

final class zzaw extends RemoteMediaPlayer.zzb
{

	zzaw(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1, int ai[], JSONObject jsonobject)
	{
		zzfa = remotemediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field RemoteMediaPlayer zzfa>
		zzfb = googleapiclient1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #18  <Field GoogleApiClient zzfb>
		zzfn = ai;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #20  <Field int[] zzfn>
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
		RemoteMediaPlayer.zzg(zzfa).zza(zzgc, zzfn, zzfi);
	//   12   24:aload_0         
	//   13   25:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//   14   28:invokestatic    #59  <Method zzdh RemoteMediaPlayer.zzg(RemoteMediaPlayer)>
	//   15   31:aload_0         
	//   16   32:getfield        #63  <Field com.google.android.gms.internal.cast.zzdm zzgc>
	//   17   35:aload_0         
	//   18   36:getfield        #20  <Field int[] zzfn>
	//   19   39:aload_0         
	//   20   40:getfield        #22  <Field JSONObject zzfi>
	//   21   43:invokevirtual   #68  <Method long zzdh.zza(com.google.android.gms.internal.cast.zzdm, int[], JSONObject)>
	//   22   46:pop2            
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   23   47:aload_0         
	//   24   48:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//   25   51:invokestatic    #51  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   26   54:astore_1        
_L3:
		((RemoteMediaPlayer.zza) (zzcn1)).zza(((GoogleApiClient) (null)));
	//   27   55:aload_1         
	//   28   56:aconst_null     
	//   29   57:invokevirtual   #55  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		  goto _L1
	//*  30   60:goto            99
		zzcn1;
	//   31   63:astore_1        
		  goto _L2
	//*  32   64:goto            102
_L4:
		setResult(((com.google.android.gms.common.api.Result) ((RemoteMediaPlayer.MediaChannelResult)((RemoteMediaPlayer.zzb)this).createFailedResult(new Status(2100)))));
	//   33   67:aload_0         
	//   34   68:aload_0         
	//   35   69:new             #70  <Class Status>
	//   36   72:dup             
	//   37   73:sipush          2100
	//   38   76:invokespecial   #73  <Method void Status(int)>
	//   39   79:invokevirtual   #77  <Method com.google.android.gms.common.api.Result RemoteMediaPlayer$zzb.createFailedResult(Status)>
	//   40   82:checkcast       #79  <Class RemoteMediaPlayer$MediaChannelResult>
	//   41   85:invokevirtual   #83  <Method void setResult(com.google.android.gms.common.api.Result)>
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   42   88:aload_0         
	//   43   89:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//   44   92:invokestatic    #51  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   45   95:astore_1        
		  goto _L3
	//*  46   96:goto            55
_L1:
		obj;
	//   47   99:aload_2         
		JVM INSTR monitorexit ;
	//   48  100:monitorexit     
		return;
	//   49  101:return          
_L2:
		RemoteMediaPlayer.zzf(zzfa).zza(((GoogleApiClient) (null)));
	//   50  102:aload_0         
	//   51  103:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//   52  106:invokestatic    #51  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   53  109:aconst_null     
	//   54  110:invokevirtual   #55  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		throw zzcn1;
	//   55  113:aload_1         
	//   56  114:athrow          
		zzcn1;
	//   57  115:astore_1        
		obj;
	//   58  116:aload_2         
		JVM INSTR monitorexit ;
	//   59  117:monitorexit     
		throw zzcn1;
	//   60  118:aload_1         
	//   61  119:athrow          
		zzcn1;
	//   62  120:astore_1        
		  goto _L4
	//*  63  121:goto            67
	}

	private final RemoteMediaPlayer zzfa;
	private final GoogleApiClient zzfb;
	private final JSONObject zzfi;
	private final int zzfn[];
}
