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

final class zzau extends RemoteMediaPlayer.zzb
{

	zzau(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1, MediaQueueItem mediaqueueitem, int i, long l, 
			JSONObject jsonobject)
	{
		zzfa = remotemediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field RemoteMediaPlayer zzfa>
		zzfb = googleapiclient1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #22  <Field GoogleApiClient zzfb>
		zzfl = mediaqueueitem;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #24  <Field MediaQueueItem zzfl>
		zzfk = i;
	//    9   16:aload_0         
	//   10   17:iload           5
	//   11   19:putfield        #26  <Field int zzfk>
		zzfh = l;
	//   12   22:aload_0         
	//   13   23:lload           6
	//   14   25:putfield        #28  <Field long zzfh>
		zzfi = jsonobject;
	//   15   28:aload_0         
	//   16   29:aload           8
	//   17   31:putfield        #30  <Field JSONObject zzfi>
		super(googleapiclient);
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:invokespecial   #33  <Method void RemoteMediaPlayer$zzb(GoogleApiClient)>
	//   21   39:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((RemoteMediaPlayer.zzb)this).zza((zzcn)anyclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #40  <Class zzcn>
	//    3    5:invokevirtual   #44  <Method void RemoteMediaPlayer$zzb.zza(zzcn)>
	//    4    8:return          
	}

	protected final void zza(zzcn zzcn1)
	{
		Object obj = RemoteMediaPlayer.zze(zzfa);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field RemoteMediaPlayer zzfa>
	//    2    4:invokestatic    #55  <Method Object RemoteMediaPlayer.zze(RemoteMediaPlayer)>
	//    3    7:astore          5
		obj;
	//    4    9:aload           5
		JVM INSTR monitorenter ;
	//    5   11:monitorenter    
		RemoteMediaPlayer.zzf(zzfa).zza(zzfb);
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field RemoteMediaPlayer zzfa>
	//    8   16:invokestatic    #59  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//    9   19:aload_0         
	//   10   20:getfield        #22  <Field GoogleApiClient zzfb>
	//   11   23:invokevirtual   #63  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzg(zzfa)));
	//   12   26:aload_0         
	//   13   27:getfield        #20  <Field RemoteMediaPlayer zzfa>
	//   14   30:invokestatic    #67  <Method zzdh RemoteMediaPlayer.zzg(RemoteMediaPlayer)>
	//   15   33:astore_1        
		com.google.android.gms.internal.cast.zzdm zzdm = zzgc;
	//   16   34:aload_0         
	//   17   35:getfield        #71  <Field com.google.android.gms.internal.cast.zzdm zzgc>
	//   18   38:astore          6
		MediaQueueItem mediaqueueitem = zzfl;
	//   19   40:aload_0         
	//   20   41:getfield        #24  <Field MediaQueueItem zzfl>
	//   21   44:astore          7
		int i = zzfk;
	//   22   46:aload_0         
	//   23   47:getfield        #26  <Field int zzfk>
	//   24   50:istore_2        
		long l = zzfh;
	//   25   51:aload_0         
	//   26   52:getfield        #28  <Field long zzfh>
	//   27   55:lstore_3        
		JSONObject jsonobject = zzfi;
	//   28   56:aload_0         
	//   29   57:getfield        #30  <Field JSONObject zzfi>
	//   30   60:astore          8
		((zzdh) (zzcn1)).zza(zzdm, new MediaQueueItem[] {
			mediaqueueitem
		}, i, 0, 0, l, jsonobject);
	//   31   62:aload_1         
	//   32   63:aload           6
	//   33   65:iconst_1        
	//   34   66:anewarray       MediaQueueItem[]
	//   35   69:dup             
	//   36   70:iconst_0        
	//   37   71:aload           7
	//   38   73:aastore         
	//   39   74:iload_2         
	//   40   75:iconst_0        
	//   41   76:iconst_0        
	//   42   77:lload_3         
	//   43   78:aload           8
	//   44   80:invokevirtual   #78  <Method long zzdh.zza(com.google.android.gms.internal.cast.zzdm, MediaQueueItem[], int, int, int, long, JSONObject)>
	//   45   83:pop2            
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   46   84:aload_0         
	//   47   85:getfield        #20  <Field RemoteMediaPlayer zzfa>
	//   48   88:invokestatic    #59  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   49   91:astore_1        
_L3:
		((RemoteMediaPlayer.zza) (zzcn1)).zza(((GoogleApiClient) (null)));
	//   50   92:aload_1         
	//   51   93:aconst_null     
	//   52   94:invokevirtual   #63  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		  goto _L1
	//*  53   97:goto            136
		zzcn1;
	//   54  100:astore_1        
		  goto _L2
	//*  55  101:goto            140
_L4:
		setResult(((com.google.android.gms.common.api.Result) ((RemoteMediaPlayer.MediaChannelResult)((RemoteMediaPlayer.zzb)this).createFailedResult(new Status(2100)))));
	//   56  104:aload_0         
	//   57  105:aload_0         
	//   58  106:new             #80  <Class Status>
	//   59  109:dup             
	//   60  110:sipush          2100
	//   61  113:invokespecial   #83  <Method void Status(int)>
	//   62  116:invokevirtual   #87  <Method com.google.android.gms.common.api.Result RemoteMediaPlayer$zzb.createFailedResult(Status)>
	//   63  119:checkcast       #89  <Class RemoteMediaPlayer$MediaChannelResult>
	//   64  122:invokevirtual   #93  <Method void setResult(com.google.android.gms.common.api.Result)>
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   65  125:aload_0         
	//   66  126:getfield        #20  <Field RemoteMediaPlayer zzfa>
	//   67  129:invokestatic    #59  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   68  132:astore_1        
		  goto _L3
	//*  69  133:goto            92
_L1:
		obj;
	//   70  136:aload           5
		JVM INSTR monitorexit ;
	//   71  138:monitorexit     
		return;
	//   72  139:return          
_L2:
		RemoteMediaPlayer.zzf(zzfa).zza(((GoogleApiClient) (null)));
	//   73  140:aload_0         
	//   74  141:getfield        #20  <Field RemoteMediaPlayer zzfa>
	//   75  144:invokestatic    #59  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   76  147:aconst_null     
	//   77  148:invokevirtual   #63  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		throw zzcn1;
	//   78  151:aload_1         
	//   79  152:athrow          
		zzcn1;
	//   80  153:astore_1        
		obj;
	//   81  154:aload           5
		JVM INSTR monitorexit ;
	//   82  156:monitorexit     
		throw zzcn1;
	//   83  157:aload_1         
	//   84  158:athrow          
		zzcn1;
	//   85  159:astore_1        
		  goto _L4
	//*  86  160:goto            104
	}

	private final RemoteMediaPlayer zzfa;
	private final GoogleApiClient zzfb;
	private final long zzfh;
	private final JSONObject zzfi;
	private final int zzfk;
	private final MediaQueueItem zzfl;
}
