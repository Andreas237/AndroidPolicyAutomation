// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.zzcn;
import com.google.android.gms.internal.cast.zzdh;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			RemoteMediaPlayer, MediaInfo

final class zzba extends RemoteMediaPlayer.zzb
{

	zzba(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1, boolean flag, long l, long al[], 
			JSONObject jsonobject, MediaInfo mediainfo)
	{
		zzfa = remotemediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field RemoteMediaPlayer zzfa>
		zzfb = googleapiclient1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #24  <Field GoogleApiClient zzfb>
		zzfp = flag;
	//    6   10:aload_0         
	//    7   11:iload           4
	//    8   13:putfield        #26  <Field boolean zzfp>
		zzfh = l;
	//    9   16:aload_0         
	//   10   17:lload           5
	//   11   19:putfield        #28  <Field long zzfh>
		zzfq = al;
	//   12   22:aload_0         
	//   13   23:aload           7
	//   14   25:putfield        #30  <Field long[] zzfq>
		zzfi = jsonobject;
	//   15   28:aload_0         
	//   16   29:aload           8
	//   17   31:putfield        #32  <Field JSONObject zzfi>
		zzfr = mediainfo;
	//   18   34:aload_0         
	//   19   35:aload           9
	//   20   37:putfield        #34  <Field MediaInfo zzfr>
		super(googleapiclient);
	//   21   40:aload_0         
	//   22   41:aload_2         
	//   23   42:invokespecial   #37  <Method void RemoteMediaPlayer$zzb(GoogleApiClient)>
	//   24   45:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((RemoteMediaPlayer.zzb)this).zza((zzcn)anyclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #44  <Class zzcn>
	//    3    5:invokevirtual   #48  <Method void RemoteMediaPlayer$zzb.zza(zzcn)>
	//    4    8:return          
	}

	protected final void zza(zzcn zzcn1)
	{
		Object obj = RemoteMediaPlayer.zze(zzfa);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field RemoteMediaPlayer zzfa>
	//    2    4:invokestatic    #57  <Method Object RemoteMediaPlayer.zze(RemoteMediaPlayer)>
	//    3    7:astore_2        
		obj;
	//    4    8:aload_2         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		RemoteMediaPlayer.zzf(zzfa).zza(zzfb);
	//    6   10:aload_0         
	//    7   11:getfield        #22  <Field RemoteMediaPlayer zzfa>
	//    8   14:invokestatic    #61  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//    9   17:aload_0         
	//   10   18:getfield        #24  <Field GoogleApiClient zzfb>
	//   11   21:invokevirtual   #65  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		zzcn1 = ((zzcn) ((new MediaLoadOptions.Builder()).setAutoplay(zzfp).setPlayPosition(zzfh).setActiveTrackIds(zzfq).setCustomData(zzfi).build()));
	//   12   24:new             #67  <Class MediaLoadOptions$Builder>
	//   13   27:dup             
	//   14   28:invokespecial   #70  <Method void MediaLoadOptions$Builder()>
	//   15   31:aload_0         
	//   16   32:getfield        #26  <Field boolean zzfp>
	//   17   35:invokevirtual   #74  <Method MediaLoadOptions$Builder MediaLoadOptions$Builder.setAutoplay(boolean)>
	//   18   38:aload_0         
	//   19   39:getfield        #28  <Field long zzfh>
	//   20   42:invokevirtual   #78  <Method MediaLoadOptions$Builder MediaLoadOptions$Builder.setPlayPosition(long)>
	//   21   45:aload_0         
	//   22   46:getfield        #30  <Field long[] zzfq>
	//   23   49:invokevirtual   #82  <Method MediaLoadOptions$Builder MediaLoadOptions$Builder.setActiveTrackIds(long[])>
	//   24   52:aload_0         
	//   25   53:getfield        #32  <Field JSONObject zzfi>
	//   26   56:invokevirtual   #86  <Method MediaLoadOptions$Builder MediaLoadOptions$Builder.setCustomData(JSONObject)>
	//   27   59:invokevirtual   #90  <Method MediaLoadOptions MediaLoadOptions$Builder.build()>
	//   28   62:astore_1        
		RemoteMediaPlayer.zzg(zzfa).zza(zzgc, zzfr, ((MediaLoadOptions) (zzcn1)));
	//   29   63:aload_0         
	//   30   64:getfield        #22  <Field RemoteMediaPlayer zzfa>
	//   31   67:invokestatic    #94  <Method zzdh RemoteMediaPlayer.zzg(RemoteMediaPlayer)>
	//   32   70:aload_0         
	//   33   71:getfield        #98  <Field com.google.android.gms.internal.cast.zzdm zzgc>
	//   34   74:aload_0         
	//   35   75:getfield        #34  <Field MediaInfo zzfr>
	//   36   78:aload_1         
	//   37   79:invokevirtual   #103 <Method long zzdh.zza(com.google.android.gms.internal.cast.zzdm, MediaInfo, MediaLoadOptions)>
	//   38   82:pop2            
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   39   83:aload_0         
	//   40   84:getfield        #22  <Field RemoteMediaPlayer zzfa>
	//   41   87:invokestatic    #61  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   42   90:astore_1        
_L1:
		((RemoteMediaPlayer.zza) (zzcn1)).zza(((GoogleApiClient) (null)));
	//   43   91:aload_1         
	//   44   92:aconst_null     
	//   45   93:invokevirtual   #65  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		break MISSING_BLOCK_LABEL_145;
	//   46   96:goto            145
		zzcn1;
	//   47   99:astore_1        
		break MISSING_BLOCK_LABEL_148;
	//   48  100:goto            148
		zzcn1;
	//   49  103:astore_1        
		Log.e("RemoteMediaPlayer", "load - channel error", ((Throwable) (zzcn1)));
	//   50  104:ldc1            #105 <String "RemoteMediaPlayer">
	//   51  106:ldc1            #107 <String "load - channel error">
	//   52  108:aload_1         
	//   53  109:invokestatic    #113 <Method int Log.e(String, String, Throwable)>
	//   54  112:pop             
		setResult(((com.google.android.gms.common.api.Result) ((RemoteMediaPlayer.MediaChannelResult)((RemoteMediaPlayer.zzb)this).createFailedResult(new Status(2100)))));
	//   55  113:aload_0         
	//   56  114:aload_0         
	//   57  115:new             #115 <Class Status>
	//   58  118:dup             
	//   59  119:sipush          2100
	//   60  122:invokespecial   #118 <Method void Status(int)>
	//   61  125:invokevirtual   #122 <Method com.google.android.gms.common.api.Result RemoteMediaPlayer$zzb.createFailedResult(Status)>
	//   62  128:checkcast       #124 <Class RemoteMediaPlayer$MediaChannelResult>
	//   63  131:invokevirtual   #128 <Method void setResult(com.google.android.gms.common.api.Result)>
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   64  134:aload_0         
	//   65  135:getfield        #22  <Field RemoteMediaPlayer zzfa>
	//   66  138:invokestatic    #61  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   67  141:astore_1        
		  goto _L1
	//*  68  142:goto            91
		obj;
	//   69  145:aload_2         
		JVM INSTR monitorexit ;
	//   70  146:monitorexit     
		return;
	//   71  147:return          
		RemoteMediaPlayer.zzf(zzfa).zza(((GoogleApiClient) (null)));
	//   72  148:aload_0         
	//   73  149:getfield        #22  <Field RemoteMediaPlayer zzfa>
	//   74  152:invokestatic    #61  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   75  155:aconst_null     
	//   76  156:invokevirtual   #65  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		throw zzcn1;
	//   77  159:aload_1         
	//   78  160:athrow          
		zzcn1;
	//   79  161:astore_1        
		obj;
	//   80  162:aload_2         
		JVM INSTR monitorexit ;
	//   81  163:monitorexit     
		throw zzcn1;
	//   82  164:aload_1         
	//   83  165:athrow          
	}

	private final RemoteMediaPlayer zzfa;
	private final GoogleApiClient zzfb;
	private final long zzfh;
	private final JSONObject zzfi;
	private final boolean zzfp;
	private final long zzfq[];
	private final MediaInfo zzfr;
}
