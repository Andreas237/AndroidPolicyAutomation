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

final class zzbc extends RemoteMediaPlayer.zzb
{

	zzbc(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, int i, GoogleApiClient googleapiclient1, JSONObject jsonobject)
	{
		zzfa = remotemediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field RemoteMediaPlayer zzfa>
		zzfs = i;
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:putfield        #18  <Field int zzfs>
		zzfb = googleapiclient1;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #20  <Field GoogleApiClient zzfb>
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
label0:
		{
			synchronized(RemoteMediaPlayer.zze(zzfa))
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//*   2    4:invokestatic    #47  <Method Object RemoteMediaPlayer.zze(RemoteMediaPlayer)>
	//*   3    7:astore_3        
	//*   4    8:aload_3         
	//*   5    9:monitorenter    
			{
				if(RemoteMediaPlayer.zza(zzfa, zzfs) != -1)
					break label0;
	//    6   10:aload_0         
	//    7   11:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//    8   14:aload_0         
	//    9   15:getfield        #18  <Field int zzfs>
	//   10   18:invokestatic    #50  <Method int RemoteMediaPlayer.zza(RemoteMediaPlayer, int)>
	//   11   21:iconst_m1       
	//   12   22:icmpne          47
				setResult(((com.google.android.gms.common.api.Result) ((RemoteMediaPlayer.MediaChannelResult)((RemoteMediaPlayer.zzb)this).createFailedResult(new Status(0)))));
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:new             #52  <Class Status>
	//   16   30:dup             
	//   17   31:iconst_0        
	//   18   32:invokespecial   #55  <Method void Status(int)>
	//   19   35:invokevirtual   #59  <Method com.google.android.gms.common.api.Result RemoteMediaPlayer$zzb.createFailedResult(Status)>
	//   20   38:checkcast       #61  <Class RemoteMediaPlayer$MediaChannelResult>
	//   21   41:invokevirtual   #65  <Method void setResult(com.google.android.gms.common.api.Result)>
			}
	//   22   44:aload_3         
	//   23   45:monitorexit     
			return;
	//   24   46:return          
		}
		RemoteMediaPlayer.zzf(zzfa).zza(zzfb);
	//   25   47:aload_0         
	//   26   48:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//   27   51:invokestatic    #69  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   28   54:aload_0         
	//   29   55:getfield        #20  <Field GoogleApiClient zzfb>
	//   30   58:invokevirtual   #73  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzg(zzfa)));
	//   31   61:aload_0         
	//   32   62:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//   33   65:invokestatic    #77  <Method zzdh RemoteMediaPlayer.zzg(RemoteMediaPlayer)>
	//   34   68:astore_1        
		com.google.android.gms.internal.cast.zzdm zzdm = zzgc;
	//   35   69:aload_0         
	//   36   70:getfield        #81  <Field com.google.android.gms.internal.cast.zzdm zzgc>
	//   37   73:astore          4
		int i = zzfs;
	//   38   75:aload_0         
	//   39   76:getfield        #18  <Field int zzfs>
	//   40   79:istore_2        
		JSONObject jsonobject = zzfi;
	//   41   80:aload_0         
	//   42   81:getfield        #22  <Field JSONObject zzfi>
	//   43   84:astore          5
		((zzdh) (zzcn1)).zza(zzdm, new int[] {
			i
		}, jsonobject);
	//   44   86:aload_1         
	//   45   87:aload           4
	//   46   89:iconst_1        
	//   47   90:newarray        int[]
	//   48   92:dup             
	//   49   93:iconst_0        
	//   50   94:iload_2         
	//   51   95:iastore         
	//   52   96:aload           5
	//   53   98:invokevirtual   #86  <Method long zzdh.zza(com.google.android.gms.internal.cast.zzdm, int[], JSONObject)>
	//   54  101:pop2            
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   55  102:aload_0         
	//   56  103:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//   57  106:invokestatic    #69  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   58  109:astore_1        
_L3:
		((RemoteMediaPlayer.zza) (zzcn1)).zza(((GoogleApiClient) (null)));
	//   59  110:aload_1         
	//   60  111:aconst_null     
	//   61  112:invokevirtual   #73  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		  goto _L1
	//*  62  115:goto            154
		zzcn1;
	//   63  118:astore_1        
		  goto _L2
	//*  64  119:goto            157
_L4:
		setResult(((com.google.android.gms.common.api.Result) ((RemoteMediaPlayer.MediaChannelResult)((RemoteMediaPlayer.zzb)this).createFailedResult(new Status(2100)))));
	//   65  122:aload_0         
	//   66  123:aload_0         
	//   67  124:new             #52  <Class Status>
	//   68  127:dup             
	//   69  128:sipush          2100
	//   70  131:invokespecial   #55  <Method void Status(int)>
	//   71  134:invokevirtual   #59  <Method com.google.android.gms.common.api.Result RemoteMediaPlayer$zzb.createFailedResult(Status)>
	//   72  137:checkcast       #61  <Class RemoteMediaPlayer$MediaChannelResult>
	//   73  140:invokevirtual   #65  <Method void setResult(com.google.android.gms.common.api.Result)>
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   74  143:aload_0         
	//   75  144:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//   76  147:invokestatic    #69  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   77  150:astore_1        
		  goto _L3
	//*  78  151:goto            110
_L1:
		obj;
	//   79  154:aload_3         
		JVM INSTR monitorexit ;
	//   80  155:monitorexit     
		return;
	//   81  156:return          
_L2:
		RemoteMediaPlayer.zzf(zzfa).zza(((GoogleApiClient) (null)));
	//   82  157:aload_0         
	//   83  158:getfield        #16  <Field RemoteMediaPlayer zzfa>
	//   84  161:invokestatic    #69  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   85  164:aconst_null     
	//   86  165:invokevirtual   #73  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		throw zzcn1;
	//   87  168:aload_1         
	//   88  169:athrow          
		zzcn1;
	//   89  170:astore_1        
		obj;
	//   90  171:aload_3         
		JVM INSTR monitorexit ;
	//   91  172:monitorexit     
		throw zzcn1;
	//   92  173:aload_1         
	//   93  174:athrow          
		zzcn1;
	//   94  175:astore_1        
		  goto _L4
	//*  95  176:goto            122
	}

	private final RemoteMediaPlayer zzfa;
	private final GoogleApiClient zzfb;
	private final JSONObject zzfi;
	private final int zzfs;
}
