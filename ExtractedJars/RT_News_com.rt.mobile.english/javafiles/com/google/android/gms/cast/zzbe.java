// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.*;
import java.util.Locale;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			RemoteMediaPlayer, MediaStatus, MediaQueueItem

final class zzbe extends RemoteMediaPlayer.zzb
{

	zzbe(RemoteMediaPlayer remotemediaplayer, GoogleApiClient googleapiclient, int i, int j, GoogleApiClient googleapiclient1, JSONObject jsonobject)
	{
		zzfa = remotemediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field RemoteMediaPlayer zzfa>
		zzfs = i;
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:putfield        #19  <Field int zzfs>
		zzft = j;
	//    6   10:aload_0         
	//    7   11:iload           4
	//    8   13:putfield        #21  <Field int zzft>
		zzfb = googleapiclient1;
	//    9   16:aload_0         
	//   10   17:aload           5
	//   11   19:putfield        #23  <Field GoogleApiClient zzfb>
		zzfi = jsonobject;
	//   12   22:aload_0         
	//   13   23:aload           6
	//   14   25:putfield        #25  <Field JSONObject zzfi>
		super(googleapiclient);
	//   15   28:aload_0         
	//   16   29:aload_2         
	//   17   30:invokespecial   #28  <Method void RemoteMediaPlayer$zzb(GoogleApiClient)>
	//   18   33:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((RemoteMediaPlayer.zzb)this).zza((zzcn)anyclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class zzcn>
	//    3    5:invokevirtual   #39  <Method void RemoteMediaPlayer$zzb.zza(zzcn)>
	//    4    8:return          
	}

	protected final void zza(zzcn zzcn1)
	{
		Object obj = RemoteMediaPlayer.zze(zzfa);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RemoteMediaPlayer zzfa>
	//    2    4:invokestatic    #50  <Method Object RemoteMediaPlayer.zze(RemoteMediaPlayer)>
	//    3    7:astore          4
		obj;
	//    4    9:aload           4
		JVM INSTR monitorenter ;
	//    5   11:monitorenter    
		int i = RemoteMediaPlayer.zza(zzfa, zzfs);
	//    6   12:aload_0         
	//    7   13:getfield        #17  <Field RemoteMediaPlayer zzfa>
	//    8   16:aload_0         
	//    9   17:getfield        #19  <Field int zzfs>
	//   10   20:invokestatic    #53  <Method int RemoteMediaPlayer.zza(RemoteMediaPlayer, int)>
	//   11   23:istore_2        
		if(i != -1)
			break MISSING_BLOCK_LABEL_52;
	//   12   24:iload_2         
	//   13   25:iconst_m1       
	//   14   26:icmpne          52
		setResult(((com.google.android.gms.common.api.Result) ((RemoteMediaPlayer.MediaChannelResult)((RemoteMediaPlayer.zzb)this).createFailedResult(new Status(0)))));
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:new             #55  <Class Status>
	//   18   34:dup             
	//   19   35:iconst_0        
	//   20   36:invokespecial   #58  <Method void Status(int)>
	//   21   39:invokevirtual   #62  <Method com.google.android.gms.common.api.Result RemoteMediaPlayer$zzb.createFailedResult(Status)>
	//   22   42:checkcast       #64  <Class RemoteMediaPlayer$MediaChannelResult>
	//   23   45:invokevirtual   #68  <Method void setResult(com.google.android.gms.common.api.Result)>
		obj;
	//   24   48:aload           4
		JVM INSTR monitorexit ;
	//   25   50:monitorexit     
		return;
	//   26   51:return          
		if(zzft >= 0)
			break MISSING_BLOCK_LABEL_106;
	//   27   52:aload_0         
	//   28   53:getfield        #21  <Field int zzft>
	//   29   56:ifge            106
		setResult(((com.google.android.gms.common.api.Result) ((RemoteMediaPlayer.MediaChannelResult)((RemoteMediaPlayer.zzb)this).createFailedResult(new Status(2001, String.format(Locale.ROOT, "Invalid request: Invalid newIndex %d.", new Object[] {
			Integer.valueOf(zzft)
		}))))));
	//   30   59:aload_0         
	//   31   60:aload_0         
	//   32   61:new             #55  <Class Status>
	//   33   64:dup             
	//   34   65:sipush          2001
	//   35   68:getstatic       #74  <Field Locale Locale.ROOT>
	//   36   71:ldc1            #76  <String "Invalid request: Invalid newIndex %d.">
	//   37   73:iconst_1        
	//   38   74:anewarray       Object[]
	//   39   77:dup             
	//   40   78:iconst_0        
	//   41   79:aload_0         
	//   42   80:getfield        #21  <Field int zzft>
	//   43   83:invokestatic    #84  <Method Integer Integer.valueOf(int)>
	//   44   86:aastore         
	//   45   87:invokestatic    #90  <Method String String.format(Locale, String, Object[])>
	//   46   90:invokespecial   #93  <Method void Status(int, String)>
	//   47   93:invokevirtual   #62  <Method com.google.android.gms.common.api.Result RemoteMediaPlayer$zzb.createFailedResult(Status)>
	//   48   96:checkcast       #64  <Class RemoteMediaPlayer$MediaChannelResult>
	//   49   99:invokevirtual   #68  <Method void setResult(com.google.android.gms.common.api.Result)>
		obj;
	//   50  102:aload           4
		JVM INSTR monitorexit ;
	//   51  104:monitorexit     
		return;
	//   52  105:return          
		if(i != zzft)
			break MISSING_BLOCK_LABEL_137;
	//   53  106:iload_2         
	//   54  107:aload_0         
	//   55  108:getfield        #21  <Field int zzft>
	//   56  111:icmpne          137
		setResult(((com.google.android.gms.common.api.Result) ((RemoteMediaPlayer.MediaChannelResult)((RemoteMediaPlayer.zzb)this).createFailedResult(new Status(0)))));
	//   57  114:aload_0         
	//   58  115:aload_0         
	//   59  116:new             #55  <Class Status>
	//   60  119:dup             
	//   61  120:iconst_0        
	//   62  121:invokespecial   #58  <Method void Status(int)>
	//   63  124:invokevirtual   #62  <Method com.google.android.gms.common.api.Result RemoteMediaPlayer$zzb.createFailedResult(Status)>
	//   64  127:checkcast       #64  <Class RemoteMediaPlayer$MediaChannelResult>
	//   65  130:invokevirtual   #68  <Method void setResult(com.google.android.gms.common.api.Result)>
		obj;
	//   66  133:aload           4
		JVM INSTR monitorexit ;
	//   67  135:monitorexit     
		return;
	//   68  136:return          
		if(zzft > i)
	//*  69  137:aload_0         
	//*  70  138:getfield        #21  <Field int zzft>
	//*  71  141:iload_2         
	//*  72  142:icmple          155
		{
			i = zzft + 1;
	//   73  145:aload_0         
	//   74  146:getfield        #21  <Field int zzft>
	//   75  149:iconst_1        
	//   76  150:iadd            
	//   77  151:istore_2        
			break MISSING_BLOCK_LABEL_160;
	//   78  152:goto            160
		}
		i = zzft;
	//   79  155:aload_0         
	//   80  156:getfield        #21  <Field int zzft>
	//   81  159:istore_2        
		zzcn1 = ((zzcn) (zzfa.getMediaStatus().getQueueItem(i)));
	//   82  160:aload_0         
	//   83  161:getfield        #17  <Field RemoteMediaPlayer zzfa>
	//   84  164:invokevirtual   #97  <Method MediaStatus RemoteMediaPlayer.getMediaStatus()>
	//   85  167:iload_2         
	//   86  168:invokevirtual   #103 <Method MediaQueueItem MediaStatus.getQueueItem(int)>
	//   87  171:astore_1        
		if(zzcn1 == null) goto _L2; else goto _L1
	//   88  172:aload_1         
	//   89  173:ifnull          319
_L1:
		i = ((MediaQueueItem) (zzcn1)).getItemId();
	//   90  176:aload_1         
	//   91  177:invokevirtual   #109 <Method int MediaQueueItem.getItemId()>
	//   92  180:istore_2        
	//*  93  181:goto            184
_L8:
		RemoteMediaPlayer.zzf(zzfa).zza(zzfb);
	//   94  184:aload_0         
	//   95  185:getfield        #17  <Field RemoteMediaPlayer zzfa>
	//   96  188:invokestatic    #113 <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//   97  191:aload_0         
	//   98  192:getfield        #23  <Field GoogleApiClient zzfb>
	//   99  195:invokevirtual   #117 <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzg(zzfa)));
	//  100  198:aload_0         
	//  101  199:getfield        #17  <Field RemoteMediaPlayer zzfa>
	//  102  202:invokestatic    #121 <Method zzdh RemoteMediaPlayer.zzg(RemoteMediaPlayer)>
	//  103  205:astore_1        
		com.google.android.gms.internal.cast.zzdm zzdm = zzgc;
	//  104  206:aload_0         
	//  105  207:getfield        #125 <Field com.google.android.gms.internal.cast.zzdm zzgc>
	//  106  210:astore          5
		int j = zzfs;
	//  107  212:aload_0         
	//  108  213:getfield        #19  <Field int zzfs>
	//  109  216:istore_3        
		JSONObject jsonobject = zzfi;
	//  110  217:aload_0         
	//  111  218:getfield        #25  <Field JSONObject zzfi>
	//  112  221:astore          6
		((zzdh) (zzcn1)).zza(zzdm, new int[] {
			j
		}, i, jsonobject);
	//  113  223:aload_1         
	//  114  224:aload           5
	//  115  226:iconst_1        
	//  116  227:newarray        int[]
	//  117  229:dup             
	//  118  230:iconst_0        
	//  119  231:iload_3         
	//  120  232:iastore         
	//  121  233:iload_2         
	//  122  234:aload           6
	//  123  236:invokevirtual   #130 <Method long zzdh.zza(com.google.android.gms.internal.cast.zzdm, int[], int, JSONObject)>
	//  124  239:pop2            
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//  125  240:aload_0         
	//  126  241:getfield        #17  <Field RemoteMediaPlayer zzfa>
	//  127  244:invokestatic    #113 <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//  128  247:astore_1        
_L5:
		((RemoteMediaPlayer.zza) (zzcn1)).zza(((GoogleApiClient) (null)));
	//  129  248:aload_1         
	//  130  249:aconst_null     
	//  131  250:invokevirtual   #117 <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		  goto _L3
	//* 132  253:goto            292
		zzcn1;
	//  133  256:astore_1        
		  goto _L4
	//* 134  257:goto            296
_L6:
		setResult(((com.google.android.gms.common.api.Result) ((RemoteMediaPlayer.MediaChannelResult)((RemoteMediaPlayer.zzb)this).createFailedResult(new Status(2100)))));
	//  135  260:aload_0         
	//  136  261:aload_0         
	//  137  262:new             #55  <Class Status>
	//  138  265:dup             
	//  139  266:sipush          2100
	//  140  269:invokespecial   #58  <Method void Status(int)>
	//  141  272:invokevirtual   #62  <Method com.google.android.gms.common.api.Result RemoteMediaPlayer$zzb.createFailedResult(Status)>
	//  142  275:checkcast       #64  <Class RemoteMediaPlayer$MediaChannelResult>
	//  143  278:invokevirtual   #68  <Method void setResult(com.google.android.gms.common.api.Result)>
		zzcn1 = ((zzcn) (RemoteMediaPlayer.zzf(zzfa)));
	//  144  281:aload_0         
	//  145  282:getfield        #17  <Field RemoteMediaPlayer zzfa>
	//  146  285:invokestatic    #113 <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//  147  288:astore_1        
		  goto _L5
	//* 148  289:goto            248
_L3:
		obj;
	//  149  292:aload           4
		JVM INSTR monitorexit ;
	//  150  294:monitorexit     
		return;
	//  151  295:return          
_L4:
		RemoteMediaPlayer.zzf(zzfa).zza(((GoogleApiClient) (null)));
	//  152  296:aload_0         
	//  153  297:getfield        #17  <Field RemoteMediaPlayer zzfa>
	//  154  300:invokestatic    #113 <Method RemoteMediaPlayer$zza RemoteMediaPlayer.zzf(RemoteMediaPlayer)>
	//  155  303:aconst_null     
	//  156  304:invokevirtual   #117 <Method void RemoteMediaPlayer$zza.zza(GoogleApiClient)>
		throw zzcn1;
	//  157  307:aload_1         
	//  158  308:athrow          
		zzcn1;
	//  159  309:astore_1        
		obj;
	//  160  310:aload           4
		JVM INSTR monitorexit ;
	//  161  312:monitorexit     
		throw zzcn1;
	//  162  313:aload_1         
	//  163  314:athrow          
		zzcn1;
	//  164  315:astore_1        
		  goto _L6
	//* 165  316:goto            260
_L2:
		i = 0;
	//  166  319:iconst_0        
	//  167  320:istore_2        
		if(true) goto _L8; else goto _L7
	//  168  321:goto            184
_L7:
	}

	private final RemoteMediaPlayer zzfa;
	private final GoogleApiClient zzfb;
	private final JSONObject zzfi;
	private final int zzfs;
	private final int zzft;
}
