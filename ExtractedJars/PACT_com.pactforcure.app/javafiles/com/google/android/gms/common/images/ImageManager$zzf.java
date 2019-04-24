// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.internal.zzc;
import java.util.*;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.images:
//			ImageManager, zza

private final class ImageManager$zzf
	implements Runnable
{

	private void zza(eReceiver ereceiver, boolean flag)
	{
		ereceiver = ((eReceiver) (eReceiver.zza(ereceiver)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #42  <Method ArrayList ImageManager$ImageReceiver.zza(ImageManager$ImageReceiver)>
	//    2    4:astore_1        
		int j = ((ArrayList) (ereceiver)).size();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #48  <Method int ArrayList.size()>
	//    5    9:istore          4
		int i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_3        
		while(i < j) 
	//*   8   13:iload_3         
	//*   9   14:iload           4
	//*  10   16:icmpge          126
		{
			zza zza1 = (zza)((ArrayList) (ereceiver)).get(i);
	//   11   19:aload_1         
	//   12   20:iload_3         
	//   13   21:invokevirtual   #52  <Method Object ArrayList.get(int)>
	//   14   24:checkcast       #54  <Class zza>
	//   15   27:astore          5
			if(flag)
	//*  16   29:iload_2         
	//*  17   30:ifeq            80
			{
				zza1.zza(ImageManager.zzb(zzaCR), mBitmap, false);
	//   18   33:aload           5
	//   19   35:aload_0         
	//   20   36:getfield        #23  <Field ImageManager zzaCR>
	//   21   39:invokestatic    #58  <Method android.content.Context ImageManager.zzb(ImageManager)>
	//   22   42:aload_0         
	//   23   43:getfield        #30  <Field Bitmap mBitmap>
	//   24   46:iconst_0        
	//   25   47:invokevirtual   #61  <Method void zza.zza(android.content.Context, Bitmap, boolean)>
			} else
	//*  26   50:aload           5
	//*  27   52:instanceof      #63  <Class zza$zzc>
	//*  28   55:ifne            73
	//*  29   58:aload_0         
	//*  30   59:getfield        #23  <Field ImageManager zzaCR>
	//*  31   62:invokestatic    #66  <Method Map ImageManager.zza(ImageManager)>
	//*  32   65:aload           5
	//*  33   67:invokeinterface #72  <Method Object Map.remove(Object)>
	//*  34   72:pop             
	//*  35   73:iload_3         
	//*  36   74:iconst_1        
	//*  37   75:iadd            
	//*  38   76:istore_3        
	//*  39   77:goto            13
			{
				ImageManager.zzd(zzaCR).put(((Object) (mUri)), ((Object) (Long.valueOf(SystemClock.elapsedRealtime()))));
	//   40   80:aload_0         
	//   41   81:getfield        #23  <Field ImageManager zzaCR>
	//   42   84:invokestatic    #75  <Method Map ImageManager.zzd(ImageManager)>
	//   43   87:aload_0         
	//   44   88:getfield        #28  <Field Uri mUri>
	//   45   91:invokestatic    #81  <Method long SystemClock.elapsedRealtime()>
	//   46   94:invokestatic    #87  <Method Long Long.valueOf(long)>
	//   47   97:invokeinterface #91  <Method Object Map.put(Object, Object)>
	//   48  102:pop             
				zza1.zza(ImageManager.zzb(zzaCR), com.google.android.gms.common.images.ImageManager.zzc(zzaCR), false);
	//   49  103:aload           5
	//   50  105:aload_0         
	//   51  106:getfield        #23  <Field ImageManager zzaCR>
	//   52  109:invokestatic    #58  <Method android.content.Context ImageManager.zzb(ImageManager)>
	//   53  112:aload_0         
	//   54  113:getfield        #23  <Field ImageManager zzaCR>
	//   55  116:invokestatic    #95  <Method com.google.android.gms.internal.zzabv com.google.android.gms.common.images.ImageManager.zzc(ImageManager)>
	//   56  119:iconst_0        
	//   57  120:invokevirtual   #98  <Method void zza.zza(android.content.Context, com.google.android.gms.internal.zzabv, boolean)>
			}
			if(!(zza1 instanceof zza.zzc))
				ImageManager.zza(zzaCR).remove(((Object) (zza1)));
			i++;
		}
	//*  58  123:goto            50
	//   59  126:return          
	}

	public void run()
	{
		zzc.zzdn("OnBitmapLoadedRunnable must be executed in the main thread");
	//    0    0:ldc1            #101 <String "OnBitmapLoadedRunnable must be executed in the main thread">
	//    1    2:invokestatic    #107 <Method void zzc.zzdn(String)>
		boolean flag;
		if(mBitmap != null)
	//*   2    5:aload_0         
	//*   3    6:getfield        #30  <Field Bitmap mBitmap>
	//*   4    9:ifnull          62
			flag = true;
	//    5   12:iconst_1        
	//    6   13:istore_1        
		else
	//*   7   14:aload_0         
	//*   8   15:getfield        #23  <Field ImageManager zzaCR>
	//*   9   18:invokestatic    #111 <Method ImageManager$zzb ImageManager.zzh(ImageManager)>
	//*  10   21:ifnull          97
	//*  11   24:aload_0         
	//*  12   25:getfield        #32  <Field boolean zzaCU>
	//*  13   28:ifeq            67
	//*  14   31:aload_0         
	//*  15   32:getfield        #23  <Field ImageManager zzaCR>
	//*  16   35:invokestatic    #111 <Method ImageManager$zzb ImageManager.zzh(ImageManager)>
	//*  17   38:invokevirtual   #116 <Method void ImageManager$zzb.evictAll()>
	//*  18   41:invokestatic    #121 <Method void System.gc()>
	//*  19   44:aload_0         
	//*  20   45:iconst_0        
	//*  21   46:putfield        #32  <Field boolean zzaCU>
	//*  22   49:aload_0         
	//*  23   50:getfield        #23  <Field ImageManager zzaCR>
	//*  24   53:invokestatic    #125 <Method Handler ImageManager.zzg(ImageManager)>
	//*  25   56:aload_0         
	//*  26   57:invokevirtual   #131 <Method boolean Handler.post(Runnable)>
	//*  27   60:pop             
	//*  28   61:return          
			flag = false;
	//   29   62:iconst_0        
	//   30   63:istore_1        
		if(ImageManager.zzh(zzaCR) != null)
		{
			if(zzaCU)
			{
				ImageManager.zzh(zzaCR).evictAll();
				System.gc();
				zzaCU = false;
				ImageManager.zzg(zzaCR).post(((Runnable) (this)));
				return;
			}
	//*  31   64:goto            14
			if(flag)
	//*  32   67:iload_1         
	//*  33   68:ifeq            97
				ImageManager.zzh(zzaCR).put(((Object) (new zza.zza(mUri))), ((Object) (mBitmap)));
	//   34   71:aload_0         
	//   35   72:getfield        #23  <Field ImageManager zzaCR>
	//   36   75:invokestatic    #111 <Method ImageManager$zzb ImageManager.zzh(ImageManager)>
	//   37   78:new             #133 <Class zza$zza>
	//   38   81:dup             
	//   39   82:aload_0         
	//   40   83:getfield        #28  <Field Uri mUri>
	//   41   86:invokespecial   #136 <Method void zza$zza(Uri)>
	//   42   89:aload_0         
	//   43   90:getfield        #30  <Field Bitmap mBitmap>
	//   44   93:invokevirtual   #137 <Method Object ImageManager$zzb.put(Object, Object)>
	//   45   96:pop             
		}
		eReceiver ereceiver = (eReceiver)ImageManager.zze(zzaCR).remove(((Object) (mUri)));
	//   46   97:aload_0         
	//   47   98:getfield        #23  <Field ImageManager zzaCR>
	//   48  101:invokestatic    #140 <Method Map ImageManager.zze(ImageManager)>
	//   49  104:aload_0         
	//   50  105:getfield        #28  <Field Uri mUri>
	//   51  108:invokeinterface #72  <Method Object Map.remove(Object)>
	//   52  113:checkcast       #39  <Class ImageManager$ImageReceiver>
	//   53  116:astore_2        
		if(ereceiver != null)
	//*  54  117:aload_2         
	//*  55  118:ifnull          127
			zza(ereceiver, flag);
	//   56  121:aload_0         
	//   57  122:aload_2         
	//   58  123:iload_1         
	//   59  124:invokespecial   #142 <Method void zza(ImageManager$ImageReceiver, boolean)>
		zzth.countDown();
	//   60  127:aload_0         
	//   61  128:getfield        #34  <Field CountDownLatch zzth>
	//   62  131:invokevirtual   #147 <Method void CountDownLatch.countDown()>
		synchronized(ImageManager.zzui())
	//*  63  134:invokestatic    #151 <Method Object ImageManager.zzui()>
	//*  64  137:astore_2        
	//*  65  138:aload_2         
	//*  66  139:monitorenter    
		{
			ImageManager.zzwK().remove(((Object) (mUri)));
	//   67  140:invokestatic    #155 <Method HashSet ImageManager.zzwK()>
	//   68  143:aload_0         
	//   69  144:getfield        #28  <Field Uri mUri>
	//   70  147:invokevirtual   #160 <Method boolean HashSet.remove(Object)>
	//   71  150:pop             
		}
	//   72  151:aload_2         
	//   73  152:monitorexit     
		return;
	//   74  153:return          
		exception;
	//   75  154:astore_3        
		obj;
	//   76  155:aload_2         
		JVM INSTR monitorexit ;
	//   77  156:monitorexit     
		throw exception;
	//   78  157:aload_3         
	//   79  158:athrow          
	}

	private final Bitmap mBitmap;
	private final Uri mUri;
	final ImageManager zzaCR;
	private boolean zzaCU;
	private final CountDownLatch zzth;

	public ImageManager$zzf(ImageManager imagemanager, Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
	{
		zzaCR = imagemanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field ImageManager zzaCR>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #26  <Method void Object()>
		mUri = uri;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field Uri mUri>
		mBitmap = bitmap;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #30  <Field Bitmap mBitmap>
		zzaCU = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #32  <Field boolean zzaCU>
		zzth = countdownlatch;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #34  <Field CountDownLatch zzth>
	//   17   31:return          
	}
}
