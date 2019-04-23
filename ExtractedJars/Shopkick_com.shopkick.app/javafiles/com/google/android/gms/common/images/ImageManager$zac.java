// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.os.SystemClock;
import com.google.android.gms.common.internal.Asserts;
import java.util.HashSet;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.images:
//			ImageManager, zaa, zab, zad

private final class ImageManager$zac
	implements Runnable
{

	public final void run()
	{
		Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
	//    0    0:ldc1            #26  <String "LoadImageRunnable must be executed on the main thread">
	//    1    2:invokestatic    #32  <Method void Asserts.checkMainThread(String)>
		Object obj = ((Object) ((eReceiver)ImageManager.zaa(zamq).get(((Object) (zams)))));
	//    2    5:aload_0         
	//    3    6:getfield        #17  <Field ImageManager zamq>
	//    4    9:invokestatic    #36  <Method Map ImageManager.zaa(ImageManager)>
	//    5   12:aload_0         
	//    6   13:getfield        #22  <Field zaa zams>
	//    7   16:invokeinterface #42  <Method Object Map.get(Object)>
	//    8   21:checkcast       #44  <Class ImageManager$ImageReceiver>
	//    9   24:astore_1        
		if(obj != null)
	//*  10   25:aload_1         
	//*  11   26:ifnull          54
		{
			ImageManager.zaa(zamq).remove(((Object) (zams)));
	//   12   29:aload_0         
	//   13   30:getfield        #17  <Field ImageManager zamq>
	//   14   33:invokestatic    #36  <Method Map ImageManager.zaa(ImageManager)>
	//   15   36:aload_0         
	//   16   37:getfield        #22  <Field zaa zams>
	//   17   40:invokeinterface #47  <Method Object Map.remove(Object)>
	//   18   45:pop             
			((eReceiver) (obj)).zac(zams);
	//   19   46:aload_1         
	//   20   47:aload_0         
	//   21   48:getfield        #22  <Field zaa zams>
	//   22   51:invokevirtual   #50  <Method void ImageManager$ImageReceiver.zac(zaa)>
		}
		zab zab1 = zams.zamu;
	//   23   54:aload_0         
	//   24   55:getfield        #22  <Field zaa zams>
	//   25   58:getfield        #56  <Field zab zaa.zamu>
	//   26   61:astore_3        
		if(zab1.uri == null)
	//*  27   62:aload_3         
	//*  28   63:getfield        #62  <Field android.net.Uri zab.uri>
	//*  29   66:ifnonnull       92
		{
			zams.zaa(ImageManager.zab(zamq), ImageManager.zac(zamq), true);
	//   30   69:aload_0         
	//   31   70:getfield        #22  <Field zaa zams>
	//   32   73:aload_0         
	//   33   74:getfield        #17  <Field ImageManager zamq>
	//   34   77:invokestatic    #66  <Method android.content.Context ImageManager.zab(ImageManager)>
	//   35   80:aload_0         
	//   36   81:getfield        #17  <Field ImageManager zamq>
	//   37   84:invokestatic    #69  <Method com.google.android.gms.internal.base.zak ImageManager.zac(ImageManager)>
	//   38   87:iconst_1        
	//   39   88:invokevirtual   #72  <Method void zaa.zaa(android.content.Context, com.google.android.gms.internal.base.zak, boolean)>
			return;
	//   40   91:return          
		}
		obj = ((Object) (ImageManager.zaa(zamq, zab1)));
	//   41   92:aload_0         
	//   42   93:getfield        #17  <Field ImageManager zamq>
	//   43   96:aload_3         
	//   44   97:invokestatic    #75  <Method android.graphics.Bitmap ImageManager.zaa(ImageManager, zab)>
	//   45  100:astore_1        
		if(obj != null)
	//*  46  101:aload_1         
	//*  47  102:ifnull          122
		{
			zams.zaa(ImageManager.zab(zamq), ((android.graphics.Bitmap) (obj)), true);
	//   48  105:aload_0         
	//   49  106:getfield        #22  <Field zaa zams>
	//   50  109:aload_0         
	//   51  110:getfield        #17  <Field ImageManager zamq>
	//   52  113:invokestatic    #66  <Method android.content.Context ImageManager.zab(ImageManager)>
	//   53  116:aload_1         
	//   54  117:iconst_1        
	//   55  118:invokevirtual   #78  <Method void zaa.zaa(android.content.Context, android.graphics.Bitmap, boolean)>
			return;
	//   56  121:return          
		}
		obj = ((Object) ((Long)ImageManager.zad(zamq).get(((Object) (zab1.uri)))));
	//   57  122:aload_0         
	//   58  123:getfield        #17  <Field ImageManager zamq>
	//   59  126:invokestatic    #81  <Method Map ImageManager.zad(ImageManager)>
	//   60  129:aload_3         
	//   61  130:getfield        #62  <Field android.net.Uri zab.uri>
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
				zams.zaa(ImageManager.zab(zamq), ImageManager.zac(zamq), true);
	//   74  161:aload_0         
	//   75  162:getfield        #22  <Field zaa zams>
	//   76  165:aload_0         
	//   77  166:getfield        #17  <Field ImageManager zamq>
	//   78  169:invokestatic    #66  <Method android.content.Context ImageManager.zab(ImageManager)>
	//   79  172:aload_0         
	//   80  173:getfield        #17  <Field ImageManager zamq>
	//   81  176:invokestatic    #69  <Method com.google.android.gms.internal.base.zak ImageManager.zac(ImageManager)>
	//   82  179:iconst_1        
	//   83  180:invokevirtual   #72  <Method void zaa.zaa(android.content.Context, com.google.android.gms.internal.base.zak, boolean)>
				return;
	//   84  183:return          
			}
			ImageManager.zad(zamq).remove(((Object) (zab1.uri)));
	//   85  184:aload_0         
	//   86  185:getfield        #17  <Field ImageManager zamq>
	//   87  188:invokestatic    #81  <Method Map ImageManager.zad(ImageManager)>
	//   88  191:aload_3         
	//   89  192:getfield        #62  <Field android.net.Uri zab.uri>
	//   90  195:invokeinterface #47  <Method Object Map.remove(Object)>
	//   91  200:pop             
		}
		zams.zaa(ImageManager.zab(zamq), ImageManager.zac(zamq));
	//   92  201:aload_0         
	//   93  202:getfield        #22  <Field zaa zams>
	//   94  205:aload_0         
	//   95  206:getfield        #17  <Field ImageManager zamq>
	//   96  209:invokestatic    #66  <Method android.content.Context ImageManager.zab(ImageManager)>
	//   97  212:aload_0         
	//   98  213:getfield        #17  <Field ImageManager zamq>
	//   99  216:invokestatic    #69  <Method com.google.android.gms.internal.base.zak ImageManager.zac(ImageManager)>
	//  100  219:invokevirtual   #97  <Method void zaa.zaa(android.content.Context, com.google.android.gms.internal.base.zak)>
		eReceiver ereceiver = (eReceiver)ImageManager.zae(zamq).get(((Object) (zab1.uri)));
	//  101  222:aload_0         
	//  102  223:getfield        #17  <Field ImageManager zamq>
	//  103  226:invokestatic    #100 <Method Map ImageManager.zae(ImageManager)>
	//  104  229:aload_3         
	//  105  230:getfield        #62  <Field android.net.Uri zab.uri>
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
			obj = ((Object) (new eReceiver(zamq, zab1.uri)));
	//  113  248:new             #44  <Class ImageManager$ImageReceiver>
	//  114  251:dup             
	//  115  252:aload_0         
	//  116  253:getfield        #17  <Field ImageManager zamq>
	//  117  256:aload_3         
	//  118  257:getfield        #62  <Field android.net.Uri zab.uri>
	//  119  260:invokespecial   #103 <Method void ImageManager$ImageReceiver(ImageManager, android.net.Uri)>
	//  120  263:astore_1        
			ImageManager.zae(zamq).put(((Object) (zab1.uri)), obj);
	//  121  264:aload_0         
	//  122  265:getfield        #17  <Field ImageManager zamq>
	//  123  268:invokestatic    #100 <Method Map ImageManager.zae(ImageManager)>
	//  124  271:aload_3         
	//  125  272:getfield        #62  <Field android.net.Uri zab.uri>
	//  126  275:aload_1         
	//  127  276:invokeinterface #107 <Method Object Map.put(Object, Object)>
	//  128  281:pop             
		}
		((eReceiver) (obj)).zab(zams);
	//  129  282:aload_1         
	//  130  283:aload_0         
	//  131  284:getfield        #22  <Field zaa zams>
	//  132  287:invokevirtual   #109 <Method void ImageManager$ImageReceiver.zab(zaa)>
		if(!(zams instanceof zad))
	//* 133  290:aload_0         
	//* 134  291:getfield        #22  <Field zaa zams>
	//* 135  294:instanceof      #111 <Class zad>
	//* 136  297:ifne            318
			ImageManager.zaa(zamq).put(((Object) (zams)), obj);
	//  137  300:aload_0         
	//  138  301:getfield        #17  <Field ImageManager zamq>
	//  139  304:invokestatic    #36  <Method Map ImageManager.zaa(ImageManager)>
	//  140  307:aload_0         
	//  141  308:getfield        #22  <Field zaa zams>
	//  142  311:aload_1         
	//  143  312:invokeinterface #107 <Method Object Map.put(Object, Object)>
	//  144  317:pop             
		synchronized(ImageManager.zacc())
	//* 145  318:invokestatic    #115 <Method Object ImageManager.zacc()>
	//* 146  321:astore_2        
	//* 147  322:aload_2         
	//* 148  323:monitorenter    
		{
			if(!ImageManager.zacd().contains(((Object) (zab1.uri))))
	//* 149  324:invokestatic    #119 <Method HashSet ImageManager.zacd()>
	//* 150  327:aload_3         
	//* 151  328:getfield        #62  <Field android.net.Uri zab.uri>
	//* 152  331:invokevirtual   #125 <Method boolean HashSet.contains(Object)>
	//* 153  334:ifne            352
			{
				ImageManager.zacd().add(((Object) (zab1.uri)));
	//  154  337:invokestatic    #119 <Method HashSet ImageManager.zacd()>
	//  155  340:aload_3         
	//  156  341:getfield        #62  <Field android.net.Uri zab.uri>
	//  157  344:invokevirtual   #128 <Method boolean HashSet.add(Object)>
	//  158  347:pop             
				((eReceiver) (obj)).zace();
	//  159  348:aload_1         
	//  160  349:invokevirtual   #131 <Method void ImageManager$ImageReceiver.zace()>
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

	private final ImageManager zamq;
	private final zaa zams;

	public ImageManager$zac(ImageManager imagemanager, zaa zaa1)
	{
		zamq = imagemanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ImageManager zamq>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		zams = zaa1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field zaa zams>
	//    8   14:return          
	}
}
