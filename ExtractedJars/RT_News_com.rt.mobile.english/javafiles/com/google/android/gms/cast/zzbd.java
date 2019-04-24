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

final class zzbd extends RemoteMediaPlayer.zzb
{

	zzbd(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, int i, GoogleApiClient googleapiclient1, long l, JSONObject jsonobject)
	{
		zzfa = remotemediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field RemoteMediaPlayer zzfa>
		zzfs = i;
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:putfield        #20  <Field int zzfs>
		zzfb = googleapiclient1;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #22  <Field GoogleApiClient zzfb>
		zzfh = l;
	//    9   16:aload_0         
	//   10   17:lload           5
	//   11   19:putfield        #24  <Field long zzfh>
		zzfi = jsonobject;
	//   12   22:aload_0         
	//   13   23:aload           7
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
label0:
		{
			synchronized(RemoteMediaPlayer.zze(zzfa))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field RemoteMediaPlayer zzfa>
	//*   2    4:invokestatic    #51  <Method Object RemoteMediaPlayer.zze(RemoteMediaPlayer)>
	//*   3    7:astore_2        
	//*   4    8:aload_2         
	//*   5    9:monitorenter    
			{
				if(RemoteMediaPlayer.zza(zzfa, zzfs) != -1)
					break label0;
	//    6   10:aload_0         
	//    7   11:getfield        #18  <Field RemoteMediaPlayer zzfa>
	//    8   14:aload_0         
	//    9   15:getfield        #20  <Field int zzfs>
	//   10   18:invokestatic    #54  <Method int RemoteMediaPlayer.zza(RemoteMediaPlayer, int)>
	//   11   21:iconst_m1       
	//   12   22:icmpne          47
				setResult(((com.google.android.gms.common.api.Result) ((RemoteMediaPlayer.MediaChannelResult)((RemoteMediaPlayer.zzb)this).createFailedResult(new Status(0)))));
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:new             #56  <Class Status>
	//   16   30:dup             
	//   17   31:iconst_0        
	//   18   32:invokespecial   #59  <Method void Status(int)>
	//   19   35:invokevirtual   #63  <Method com.google.android.gms.common.api.Result RemoteMediaPlayer$zzb.createFailedResult(Status)>
	//   20   38:checkcast       #65  <Class RemoteMediaPlayer$MediaChannelResult>
	//   21   41:invokevirtual   #69  <Method void setResult(com.google.android.gms.common.api.Result)>
			}
	//   22   44:aload_2         
	//   23   45:monitorexit     
			return;
	//   24   46:return          
		}
		RemoteMediaPlayer.zzf(zzfa).zza(zzfb);
	//   25   47:aload_0         
	//   26   48:getfield        #18  <Field RemoteMediaPlayer zzfa>
	//   27   51:invokestatic    #73  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   28   54:aload_0         
	//   29   55:getfield        #22  <Field GoogleApiClient zzfb>
	//   30   58:invokevirtual   #77  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		RemoteMediaPlayer.zzg(zzfa).zza(zzgc, zzfs, zzfh, ((MediaQueueItem []) (null)), 0, ((Integer) (null)), zzfi);
	//   31   61:aload_0         
	//   32   62:getfield        #18  <Field RemoteMediaPlayer zzfa>
	//   33   65:invokestatic    #81  <Method zzdh RemoteMediaPlayer.zzg(RemoteMediaPlayer)>
	//   34   68:aload_0         
	//   35   69:getfield        #85  <Field com.google.android.gms.internal.cast.zzdm zzgc>
	//   36   72:aload_0         
	//   37   73:getfield        #20  <Field int zzfs>
	//   38   76:aload_0         
	//   39   77:getfield        #24  <Field long zzfh>
	//   40   80:aconst_null     
	//   41   81:iconst_0        
	//   42   82:aconst_null     
	//   43   83:aload_0         
	//   44   84:getfield        #26  <Field JSONObject zzfi>
	//   45   87:invokevirtual   #90  <Method long zzdh.zza(com.google.android.gms.internal.cast.zzdm, int, long, MediaQueueItem[], int, Integer, JSONObject)>
	//   46   90:pop2            
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   47   91:aload_0         
	//   48   92:getfield        #18  <Field RemoteMediaPlayer zzfa>
	//   49   95:invokestatic    #73  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   50   98:astore_1        
_L3:
		((RemoteMediaPlayer.zza) (zzcn1)).zza(((GoogleApiClient) (null)));
	//   51   99:aload_1         
	//   52  100:aconst_null     
	//   53  101:invokevirtual   #77  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		  goto _L1
	//*  54  104:goto            143
		zzcn1;
	//   55  107:astore_1        
		  goto _L2
	//*  56  108:goto            146
_L4:
		setResult(((com.google.android.gms.common.api.Result) ((RemoteMediaPlayer.MediaChannelResult)((RemoteMediaPlayer.zzb)this).createFailedResult(new Status(2100)))));
	//   57  111:aload_0         
	//   58  112:aload_0         
	//   59  113:new             #56  <Class Status>
	//   60  116:dup             
	//   61  117:sipush          2100
	//   62  120:invokespecial   #59  <Method void Status(int)>
	//   63  123:invokevirtual   #63  <Method com.google.android.gms.common.api.Result RemoteMediaPlayer$zzb.createFailedResult(Status)>
	//   64  126:checkcast       #65  <Class RemoteMediaPlayer$MediaChannelResult>
	//   65  129:invokevirtual   #69  <Method void setResult(com.google.android.gms.common.api.Result)>
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//   66  132:aload_0         
	//   67  133:getfield        #18  <Field RemoteMediaPlayer zzfa>
	//   68  136:invokestatic    #73  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   69  139:astore_1        
		  goto _L3
	//*  70  140:goto            99
_L1:
		obj;
	//   71  143:aload_2         
		JVM INSTR monitorexit ;
	//   72  144:monitorexit     
		return;
	//   73  145:return          
_L2:
		RemoteMediaPlayer.zzf(zzfa).zza(((GoogleApiClient) (null)));
	//   74  146:aload_0         
	//   75  147:getfield        #18  <Field RemoteMediaPlayer zzfa>
	//   76  150:invokestatic    #73  <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   77  153:aconst_null     
	//   78  154:invokevirtual   #77  <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		throw zzcn1;
	//   79  157:aload_1         
	//   80  158:athrow          
		zzcn1;
	//   81  159:astore_1        
		obj;
	//   82  160:aload_2         
		JVM INSTR monitorexit ;
	//   83  161:monitorexit     
		throw zzcn1;
	//   84  162:aload_1         
	//   85  163:athrow          
		zzcn1;
	//   86  164:astore_1        
		  goto _L4
	//*  87  165:goto            111
	}

	private final RemoteMediaPlayer zzfa;
	private final GoogleApiClient zzfb;
	private final long zzfh;
	private final JSONObject zzfi;
	private final int zzfs;
}
