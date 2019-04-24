// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.os.SystemClock;
import com.google.android.gms.common.internal.Asserts;
import java.util.HashSet;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.images:
//			ImageManager, ImageRequest

private final class ImageManager$zzc
	implements Runnable
{

	public final void run()
	{
		Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
	//    0    0:ldc1            #26  <String "LoadImageRunnable must be executed on the main thread">
	//    1    2:invokestatic    #32  <Method void Asserts.checkMainThread(String)>
		Object obj = ((Object) ((eReceiver)ImageManager.zza(zzpg).get(((Object) (zzpi)))));
	//    2    5:aload_0         
	//    3    6:getfield        #17  <Field ImageManager zzpg>
	//    4    9:invokestatic    #36  <Method Map ImageManager.zza(ImageManager)>
	//    5   12:aload_0         
	//    6   13:getfield        #22  <Field ImageRequest zzpi>
	//    7   16:invokeinterface #42  <Method Object Map.get(Object)>
	//    8   21:checkcast       #44  <Class ImageManager$ImageReceiver>
	//    9   24:astore_1        
		if(obj != null)
	//*  10   25:aload_1         
	//*  11   26:ifnull          54
		{
			ImageManager.zza(zzpg).remove(((Object) (zzpi)));
	//   12   29:aload_0         
	//   13   30:getfield        #17  <Field ImageManager zzpg>
	//   14   33:invokestatic    #36  <Method Map ImageManager.zza(ImageManager)>
	//   15   36:aload_0         
	//   16   37:getfield        #22  <Field ImageRequest zzpi>
	//   17   40:invokeinterface #47  <Method Object Map.remove(Object)>
	//   18   45:pop             
			((eReceiver) (obj)).zzb(zzpi);
	//   19   46:aload_1         
	//   20   47:aload_0         
	//   21   48:getfield        #22  <Field ImageRequest zzpi>
	//   22   51:invokevirtual   #51  <Method void ImageManager$ImageReceiver.zzb(ImageRequest)>
		}
		ImageRequest$zza imagerequest$zza = zzpi.zzpk;
	//   23   54:aload_0         
	//   24   55:getfield        #22  <Field ImageRequest zzpi>
	//   25   58:getfield        #57  <Field ImageRequest$zza ImageRequest.zzpk>
	//   26   61:astore_3        
		if(imagerequest$zza.uri == null)
	//*  27   62:aload_3         
	//*  28   63:getfield        #63  <Field android.net.Uri ImageRequest$zza.uri>
	//*  29   66:ifnonnull       92
		{
			zzpi.zza(ImageManager.zzb(zzpg), ImageManager.zzc(zzpg), true);
	//   30   69:aload_0         
	//   31   70:getfield        #22  <Field ImageRequest zzpi>
	//   32   73:aload_0         
	//   33   74:getfield        #17  <Field ImageManager zzpg>
	//   34   77:invokestatic    #66  <Method android.content.Context ImageManager.zzb(ImageManager)>
	//   35   80:aload_0         
	//   36   81:getfield        #17  <Field ImageManager zzpg>
	//   37   84:invokestatic    #69  <Method com.google.android.gms.common.images.internal.PostProcessedResourceCache ImageManager.zzc(ImageManager)>
	//   38   87:iconst_1        
	//   39   88:invokevirtual   #72  <Method void ImageRequest.zza(android.content.Context, com.google.android.gms.common.images.internal.PostProcessedResourceCache, boolean)>
			return;
	//   40   91:return          
		}
		obj = ((Object) (ImageManager.zza(zzpg, imagerequest$zza)));
	//   41   92:aload_0         
	//   42   93:getfield        #17  <Field ImageManager zzpg>
	//   43   96:aload_3         
	//   44   97:invokestatic    #75  <Method android.graphics.Bitmap ImageManager.zza(ImageManager, ImageRequest$zza)>
	//   45  100:astore_1        
		if(obj != null)
	//*  46  101:aload_1         
	//*  47  102:ifnull          122
		{
			zzpi.zza(ImageManager.zzb(zzpg), ((android.graphics.Bitmap) (obj)), true);
	//   48  105:aload_0         
	//   49  106:getfield        #22  <Field ImageRequest zzpi>
	//   50  109:aload_0         
	//   51  110:getfield        #17  <Field ImageManager zzpg>
	//   52  113:invokestatic    #66  <Method android.content.Context ImageManager.zzb(ImageManager)>
	//   53  116:aload_1         
	//   54  117:iconst_1        
	//   55  118:invokevirtual   #78  <Method void ImageRequest.zza(android.content.Context, android.graphics.Bitmap, boolean)>
			return;
	//   56  121:return          
		}
		obj = ((Object) ((Long)ImageManager.zzd(zzpg).get(((Object) (imagerequest$zza.uri)))));
	//   57  122:aload_0         
	//   58  123:getfield        #17  <Field ImageManager zzpg>
	//   59  126:invokestatic    #81  <Method Map ImageManager.zzd(ImageManager)>
	//   60  129:aload_3         
	//   61  130:getfield        #63  <Field android.net.Uri ImageRequest$zza.uri>
	//   62  133:invokeinterface #42  <Method Object Map.get(Object)>
	//   63  138:checkcast       #83  <Class Long>
	//   64  141:astore_1        
		if(obj != null)
	//*  65  142:aload_1         
	//*  66  143:ifnull          201
		{
			if(SystemClock.elapsedRealtime() - ((Long) (obj)).longValue() < 0x36ee80L)
	//*  67  146:invokestatic    #89  <Method long SystemClock.elapsedRealtime()>
	//*  68  149:aload_1         
	//*  69  150:invokevirtual   #92  <Method long Long.longValue()>
	//*  70  153:lsub            
	//*  71  154:ldc2w           #93  <Long 0x36ee80L>
	//*  72  157:lcmp            
	//*  73  158:ifge            184
			{
				zzpi.zza(ImageManager.zzb(zzpg), ImageManager.zzc(zzpg), true);
	//   74  161:aload_0         
	//   75  162:getfield        #22  <Field ImageRequest zzpi>
	//   76  165:aload_0         
	//   77  166:getfield        #17  <Field ImageManager zzpg>
	//   78  169:invokestatic    #66  <Method android.content.Context ImageManager.zzb(ImageManager)>
	//   79  172:aload_0         
	//   80  173:getfield        #17  <Field ImageManager zzpg>
	//   81  176:invokestatic    #69  <Method com.google.android.gms.common.images.internal.PostProcessedResourceCache ImageManager.zzc(ImageManager)>
	//   82  179:iconst_1        
	//   83  180:invokevirtual   #72  <Method void ImageRequest.zza(android.content.Context, com.google.android.gms.common.images.internal.PostProcessedResourceCache, boolean)>
				return;
	//   84  183:return          
			}
			ImageManager.zzd(zzpg).remove(((Object) (imagerequest$zza.uri)));
	//   85  184:aload_0         
	//   86  185:getfield        #17  <Field ImageManager zzpg>
	//   87  188:invokestatic    #81  <Method Map ImageManager.zzd(ImageManager)>
	//   88  191:aload_3         
	//   89  192:getfield        #63  <Field android.net.Uri ImageRequest$zza.uri>
	//   90  195:invokeinterface #47  <Method Object Map.remove(Object)>
	//   91  200:pop             
		}
		zzpi.zza(ImageManager.zzb(zzpg), ImageManager.zzc(zzpg));
	//   92  201:aload_0         
	//   93  202:getfield        #22  <Field ImageRequest zzpi>
	//   94  205:aload_0         
	//   95  206:getfield        #17  <Field ImageManager zzpg>
	//   96  209:invokestatic    #66  <Method android.content.Context ImageManager.zzb(ImageManager)>
	//   97  212:aload_0         
	//   98  213:getfield        #17  <Field ImageManager zzpg>
	//   99  216:invokestatic    #69  <Method com.google.android.gms.common.images.internal.PostProcessedResourceCache ImageManager.zzc(ImageManager)>
	//  100  219:invokevirtual   #97  <Method void ImageRequest.zza(android.content.Context, com.google.android.gms.common.images.internal.PostProcessedResourceCache)>
		eReceiver ereceiver = (eReceiver)ImageManager.zze(zzpg).get(((Object) (imagerequest$zza.uri)));
	//  101  222:aload_0         
	//  102  223:getfield        #17  <Field ImageManager zzpg>
	//  103  226:invokestatic    #100 <Method Map ImageManager.zze(ImageManager)>
	//  104  229:aload_3         
	//  105  230:getfield        #63  <Field android.net.Uri ImageRequest$zza.uri>
	//  106  233:invokeinterface #42  <Method Object Map.get(Object)>
	//  107  238:checkcast       #44  <Class ImageManager$ImageReceiver>
	//  108  241:astore_2        
		obj = ((Object) (ereceiver));
	//  109  242:aload_2         
	//  110  243:astore_1        
		if(ereceiver == null)
	//* 111  244:aload_2         
	//* 112  245:ifnonnull       282
		{
			obj = ((Object) (new eReceiver(zzpg, imagerequest$zza.uri)));
	//  113  248:new             #44  <Class ImageManager$ImageReceiver>
	//  114  251:dup             
	//  115  252:aload_0         
	//  116  253:getfield        #17  <Field ImageManager zzpg>
	//  117  256:aload_3         
	//  118  257:getfield        #63  <Field android.net.Uri ImageRequest$zza.uri>
	//  119  260:invokespecial   #103 <Method void ImageManager$ImageReceiver(ImageManager, android.net.Uri)>
	//  120  263:astore_1        
			ImageManager.zze(zzpg).put(((Object) (imagerequest$zza.uri)), obj);
	//  121  264:aload_0         
	//  122  265:getfield        #17  <Field ImageManager zzpg>
	//  123  268:invokestatic    #100 <Method Map ImageManager.zze(ImageManager)>
	//  124  271:aload_3         
	//  125  272:getfield        #63  <Field android.net.Uri ImageRequest$zza.uri>
	//  126  275:aload_1         
	//  127  276:invokeinterface #107 <Method Object Map.put(Object, Object)>
	//  128  281:pop             
		}
		((eReceiver) (obj)).zza(zzpi);
	//  129  282:aload_1         
	//  130  283:aload_0         
	//  131  284:getfield        #22  <Field ImageRequest zzpi>
	//  132  287:invokevirtual   #109 <Method void ImageManager$ImageReceiver.zza(ImageRequest)>
		if(!(zzpi instanceof enerImageRequest))
	//* 133  290:aload_0         
	//* 134  291:getfield        #22  <Field ImageRequest zzpi>
	//* 135  294:instanceof      #111 <Class ImageRequest$ListenerImageRequest>
	//* 136  297:ifne            318
			ImageManager.zza(zzpg).put(((Object) (zzpi)), obj);
	//  137  300:aload_0         
	//  138  301:getfield        #17  <Field ImageManager zzpg>
	//  139  304:invokestatic    #36  <Method Map ImageManager.zza(ImageManager)>
	//  140  307:aload_0         
	//  141  308:getfield        #22  <Field ImageRequest zzpi>
	//  142  311:aload_1         
	//  143  312:invokeinterface #107 <Method Object Map.put(Object, Object)>
	//  144  317:pop             
		synchronized(ImageManager.zzcm())
	//* 145  318:invokestatic    #115 <Method Object ImageManager.zzcm()>
	//* 146  321:astore_2        
	//* 147  322:aload_2         
	//* 148  323:monitorenter    
		{
			if(!ImageManager.zzcn().contains(((Object) (imagerequest$zza.uri))))
	//* 149  324:invokestatic    #119 <Method HashSet ImageManager.zzcn()>
	//* 150  327:aload_3         
	//* 151  328:getfield        #63  <Field android.net.Uri ImageRequest$zza.uri>
	//* 152  331:invokevirtual   #125 <Method boolean HashSet.contains(Object)>
	//* 153  334:ifne            352
			{
				ImageManager.zzcn().add(((Object) (imagerequest$zza.uri)));
	//  154  337:invokestatic    #119 <Method HashSet ImageManager.zzcn()>
	//  155  340:aload_3         
	//  156  341:getfield        #63  <Field android.net.Uri ImageRequest$zza.uri>
	//  157  344:invokevirtual   #128 <Method boolean HashSet.add(Object)>
	//  158  347:pop             
				((eReceiver) (obj)).zzco();
	//  159  348:aload_1         
	//  160  349:invokevirtual   #131 <Method void ImageManager$ImageReceiver.zzco()>
			}
		}
	//  161  352:aload_2         
	//  162  353:monitorexit     
		return;
	//  163  354:return          
		exception;
	//  164  355:astore_1        
		obj1;
	//  165  356:aload_2         
		JVM INSTR monitorexit ;
	//  166  357:monitorexit     
		throw exception;
	//  167  358:aload_1         
	//  168  359:athrow          
	}

	private final ImageManager zzpg;
	private final ImageRequest zzpi;

	public ImageManager$zzc(ImageManager imagemanager, ImageRequest imagerequest)
	{
		zzpg = imagemanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ImageManager zzpg>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		zzpi = imagerequest;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field ImageRequest zzpi>
	//    8   14:return          
	}
}
