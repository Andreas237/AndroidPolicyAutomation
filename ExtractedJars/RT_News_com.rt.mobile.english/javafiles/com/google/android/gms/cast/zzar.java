// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.*;

// Referenced classes of package com.google.android.gms.cast:
//			RemoteMediaPlayer, TextTrackStyle

final class zzar extends RemoteMediaPlayer.zzb
{

	zzar(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1, TextTrackStyle texttrackstyle)
	{
		zzfa = remotemediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field RemoteMediaPlayer zzfa>
		zzfb = googleapiclient1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #16  <Field GoogleApiClient zzfb>
		zzfd = texttrackstyle;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #18  <Field TextTrackStyle zzfd>
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
		RemoteMediaPlayer.zzg(zzfa).zza(zzgc, zzfd);
	//   12   24:aload_0         
	//   13   25:getfield        #14  <Field RemoteMediaPlayer zzfa>
	//   14   28:invokestatic    #55  <Method zzdh RemoteMediaPlayer.zzg(RemoteMediaPlayer)>
	//   15   31:aload_0         
	//   16   32:getfield        #59  <Field com.google.android.gms.internal.cast.zzdm zzgc>
	//   17   35:aload_0         
	//   18   36:getfield        #18  <Field TextTrackStyle zzfd>
	//   19   39:invokevirtual   #64  <Method long zzdh.zza(com.google.android.gms.internal.cast.zzdm, TextTrackStyle)>
	//   20   42:pop2            
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   21   43:aload_0         
	//   22   44:getfield        #14  <Field RemoteMediaPlayer zzfa>
	//   23   47:invokestatic    #47  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   24   50:astore_1        
_L3:
		((RemoteMediaPlayer.zza) (zzcn1)).zza(((GoogleApiClient) (null)));
	//   25   51:aload_1         
	//   26   52:aconst_null     
	//   27   53:invokevirtual   #51  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		  goto _L1
	//*  28   56:goto            95
		zzcn1;
	//   29   59:astore_1        
		  goto _L2
	//*  30   60:goto            98
_L4:
		setResult(((com.google.android.gms.common.api.Result) ((RemoteMediaPlayer.MediaChannelResult)((RemoteMediaPlayer.zzb)this).createFailedResult(new Status(2100)))));
	//   31   63:aload_0         
	//   32   64:aload_0         
	//   33   65:new             #66  <Class Status>
	//   34   68:dup             
	//   35   69:sipush          2100
	//   36   72:invokespecial   #69  <Method void Status(int)>
	//   37   75:invokevirtual   #73  <Method com.google.android.gms.common.api.Result RemoteMediaPlayer$zzb.createFailedResult(Status)>
	//   38   78:checkcast       #75  <Class RemoteMediaPlayer$MediaChannelResult>
	//   39   81:invokevirtual   #79  <Method void setResult(com.google.android.gms.common.api.Result)>
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   40   84:aload_0         
	//   41   85:getfield        #14  <Field RemoteMediaPlayer zzfa>
	//   42   88:invokestatic    #47  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   43   91:astore_1        
		  goto _L3
	//*  44   92:goto            51
_L1:
		obj;
	//   45   95:aload_2         
		JVM INSTR monitorexit ;
	//   46   96:monitorexit     
		return;
	//   47   97:return          
_L2:
		RemoteMediaPlayer.zzf(zzfa).zza(((GoogleApiClient) (null)));
	//   48   98:aload_0         
	//   49   99:getfield        #14  <Field RemoteMediaPlayer zzfa>
	//   50  102:invokestatic    #47  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   51  105:aconst_null     
	//   52  106:invokevirtual   #51  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		throw zzcn1;
	//   53  109:aload_1         
	//   54  110:athrow          
		zzcn1;
	//   55  111:astore_1        
		obj;
	//   56  112:aload_2         
		JVM INSTR monitorexit ;
	//   57  113:monitorexit     
		throw zzcn1;
	//   58  114:aload_1         
	//   59  115:athrow          
		zzcn1;
	//   60  116:astore_1        
		  goto _L4
	//*  61  117:goto            63
	}

	private final RemoteMediaPlayer zzfa;
	private final GoogleApiClient zzfb;
	private final TextTrackStyle zzfd;
}
