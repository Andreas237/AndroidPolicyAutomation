// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.zzcn;
import com.google.android.gms.internal.cast.zzdh;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			RemoteMediaPlayer, MediaQueueItem

final class zzas extends RemoteMediaPlayer.zzb
{

	zzas(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1, MediaQueueItem amediaqueueitem[], int i, int j, long l, JSONObject jsonobject)
	{
		zzfa = remotemediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field RemoteMediaPlayer zzfa>
		zzfb = googleapiclient1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #23  <Field GoogleApiClient zzfb>
		zzfe = amediaqueueitem;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #25  <Field MediaQueueItem[] zzfe>
		zzff = i;
	//    9   16:aload_0         
	//   10   17:iload           5
	//   11   19:putfield        #27  <Field int zzff>
		zzfg = j;
	//   12   22:aload_0         
	//   13   23:iload           6
	//   14   25:putfield        #29  <Field int zzfg>
		zzfh = l;
	//   15   28:aload_0         
	//   16   29:lload           7
	//   17   31:putfield        #31  <Field long zzfh>
		zzfi = jsonobject;
	//   18   34:aload_0         
	//   19   35:aload           9
	//   20   37:putfield        #33  <Field JSONObject zzfi>
		super(googleapiclient);
	//   21   40:aload_0         
	//   22   41:aload_2         
	//   23   42:invokespecial   #36  <Method void RemoteMediaPlayer$zzb(GoogleApiClient)>
	//   24   45:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((RemoteMediaPlayer.zzb)this).zza((zzcn)anyclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #43  <Class zzcn>
	//    3    5:invokevirtual   #47  <Method void RemoteMediaPlayer$zzb.zza(zzcn)>
	//    4    8:return          
	}

	protected final void zza(zzcn zzcn1)
	{
		Object obj = RemoteMediaPlayer.zze(zzfa);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RemoteMediaPlayer zzfa>
	//    2    4:invokestatic    #56  <Method Object RemoteMediaPlayer.zze(RemoteMediaPlayer)>
	//    3    7:astore_2        
		obj;
	//    4    8:aload_2         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		RemoteMediaPlayer.zzf(zzfa).zza(zzfb);
	//    6   10:aload_0         
	//    7   11:getfield        #21  <Field RemoteMediaPlayer zzfa>
	//    8   14:invokestatic    #60  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//    9   17:aload_0         
	//   10   18:getfield        #23  <Field GoogleApiClient zzfb>
	//   11   21:invokevirtual   #64  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		RemoteMediaPlayer.zzg(zzfa).zza(zzgc, zzfe, zzff, zzfg, zzfh, zzfi);
	//   12   24:aload_0         
	//   13   25:getfield        #21  <Field RemoteMediaPlayer zzfa>
	//   14   28:invokestatic    #68  <Method zzdh RemoteMediaPlayer.zzg(RemoteMediaPlayer)>
	//   15   31:aload_0         
	//   16   32:getfield        #72  <Field com.google.android.gms.internal.cast.zzdm zzgc>
	//   17   35:aload_0         
	//   18   36:getfield        #25  <Field MediaQueueItem[] zzfe>
	//   19   39:aload_0         
	//   20   40:getfield        #27  <Field int zzff>
	//   21   43:aload_0         
	//   22   44:getfield        #29  <Field int zzfg>
	//   23   47:aload_0         
	//   24   48:getfield        #31  <Field long zzfh>
	//   25   51:aload_0         
	//   26   52:getfield        #33  <Field JSONObject zzfi>
	//   27   55:invokevirtual   #77  <Method long zzdh.zza(com.google.android.gms.internal.cast.zzdm, MediaQueueItem[], int, int, long, JSONObject)>
	//   28   58:pop2            
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   29   59:aload_0         
	//   30   60:getfield        #21  <Field RemoteMediaPlayer zzfa>
	//   31   63:invokestatic    #60  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   32   66:astore_1        
_L3:
		((RemoteMediaPlayer.zza) (zzcn1)).zza(((GoogleApiClient) (null)));
	//   33   67:aload_1         
	//   34   68:aconst_null     
	//   35   69:invokevirtual   #64  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		  goto _L1
	//*  36   72:goto            111
		zzcn1;
	//   37   75:astore_1        
		  goto _L2
	//*  38   76:goto            114
_L4:
		setResult(((com.google.android.gms.common.api.Result) ((RemoteMediaPlayer.MediaChannelResult)((RemoteMediaPlayer.zzb)this).createFailedResult(new Status(2100)))));
	//   39   79:aload_0         
	//   40   80:aload_0         
	//   41   81:new             #79  <Class Status>
	//   42   84:dup             
	//   43   85:sipush          2100
	//   44   88:invokespecial   #82  <Method void Status(int)>
	//   45   91:invokevirtual   #86  <Method com.google.android.gms.common.api.Result RemoteMediaPlayer$zzb.createFailedResult(Status)>
	//   46   94:checkcast       #88  <Class RemoteMediaPlayer$MediaChannelResult>
	//   47   97:invokevirtual   #92  <Method void setResult(com.google.android.gms.common.api.Result)>
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   48  100:aload_0         
	//   49  101:getfield        #21  <Field RemoteMediaPlayer zzfa>
	//   50  104:invokestatic    #60  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   51  107:astore_1        
		  goto _L3
	//*  52  108:goto            67
_L1:
		obj;
	//   53  111:aload_2         
		JVM INSTR monitorexit ;
	//   54  112:monitorexit     
		return;
	//   55  113:return          
_L2:
		RemoteMediaPlayer.zzf(zzfa).zza(((GoogleApiClient) (null)));
	//   56  114:aload_0         
	//   57  115:getfield        #21  <Field RemoteMediaPlayer zzfa>
	//   58  118:invokestatic    #60  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   59  121:aconst_null     
	//   60  122:invokevirtual   #64  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		throw zzcn1;
	//   61  125:aload_1         
	//   62  126:athrow          
		zzcn1;
	//   63  127:astore_1        
		obj;
	//   64  128:aload_2         
		JVM INSTR monitorexit ;
	//   65  129:monitorexit     
		throw zzcn1;
	//   66  130:aload_1         
	//   67  131:athrow          
		zzcn1;
	//   68  132:astore_1        
		  goto _L4
	//*  69  133:goto            79
	}

	private final RemoteMediaPlayer zzfa;
	private final GoogleApiClient zzfb;
	private final MediaQueueItem zzfe[];
	private final int zzff;
	private final int zzfg;
	private final long zzfh;
	private final JSONObject zzfi;
}
