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

final class ImageManager$zze
	implements Runnable
{

	private void zza(eReceiver ereceiver, boolean flag)
	{
		ereceiver = ((eReceiver) (eReceiver.zza(ereceiver)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #42  <Method ArrayList ImageManager$ImageReceiver.zza(ImageManager$ImageReceiver)>
	//    2    4:astore_1        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		for(int j = ((ArrayList) (ereceiver)).size(); i < j; i++)
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #48  <Method int ArrayList.size()>
	//*   7   11:istore          4
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
	//*  17   30:ifeq            53
			{
				zza1.zza(ImageManager.zzb(zzaEq), mBitmap, false);
	//   18   33:aload           5
	//   19   35:aload_0         
	//   20   36:getfield        #23  <Field ImageManager zzaEq>
	//   21   39:invokestatic    #58  <Method android.content.Context ImageManager.zzb(ImageManager)>
	//   22   42:aload_0         
	//   23   43:getfield        #30  <Field Bitmap mBitmap>
	//   24   46:iconst_0        
	//   25   47:invokevirtual   #61  <Method void zza.zza(android.content.Context, Bitmap, boolean)>
			} else
	//*  26   50:goto            96
			{
				ImageManager.zzd(zzaEq).put(((Object) (mUri)), ((Object) (Long.valueOf(SystemClock.elapsedRealtime()))));
	//   27   53:aload_0         
	//   28   54:getfield        #23  <Field ImageManager zzaEq>
	//   29   57:invokestatic    #65  <Method Map ImageManager.zzd(ImageManager)>
	//   30   60:aload_0         
	//   31   61:getfield        #28  <Field Uri mUri>
	//   32   64:invokestatic    #71  <Method long SystemClock.elapsedRealtime()>
	//   33   67:invokestatic    #77  <Method Long Long.valueOf(long)>
	//   34   70:invokeinterface #83  <Method Object Map.put(Object, Object)>
	//   35   75:pop             
				zza1.zza(ImageManager.zzb(zzaEq), com.google.android.gms.common.images.ImageManager.zzc(zzaEq), false);
	//   36   76:aload           5
	//   37   78:aload_0         
	//   38   79:getfield        #23  <Field ImageManager zzaEq>
	//   39   82:invokestatic    #58  <Method android.content.Context ImageManager.zzb(ImageManager)>
	//   40   85:aload_0         
	//   41   86:getfield        #23  <Field ImageManager zzaEq>
	//   42   89:invokestatic    #87  <Method com.google.android.gms.internal.zzacd com.google.android.gms.common.images.ImageManager.zzc(ImageManager)>
	//   43   92:iconst_0        
	//   44   93:invokevirtual   #90  <Method void zza.zza(android.content.Context, com.google.android.gms.internal.zzacd, boolean)>
			}
			if(!(zza1 instanceof zza.zzc))
	//*  45   96:aload           5
	//*  46   98:instanceof      #92  <Class zza$zzc>
	//*  47  101:ifne            119
				ImageManager.zza(zzaEq).remove(((Object) (zza1)));
	//   48  104:aload_0         
	//   49  105:getfield        #23  <Field ImageManager zzaEq>
	//   50  108:invokestatic    #94  <Method Map ImageManager.zza(ImageManager)>
	//   51  111:aload           5
	//   52  113:invokeinterface #98  <Method Object Map.remove(Object)>
	//   53  118:pop             
		}

	//   54  119:iload_3         
	//   55  120:iconst_1        
	//   56  121:iadd            
	//   57  122:istore_3        
	//*  58  123:goto            13
	//   59  126:return          
	}

	public void run()
	{
		zzc.zzdj("OnBitmapLoadedRunnable must be executed in the main thread");
	//    0    0:ldc1            #101 <String "OnBitmapLoadedRunnable must be executed in the main thread">
	//    1    2:invokestatic    #107 <Method void zzc.zzdj(String)>
		boolean flag;
		if(mBitmap != null)
	//*   2    5:aload_0         
	//*   3    6:getfield        #30  <Field Bitmap mBitmap>
	//*   4    9:ifnull          17
			flag = true;
	//    5   12:iconst_1        
	//    6   13:istore_1        
		else
	//*   7   14:goto            19
			flag = false;
	//    8   17:iconst_0        
	//    9   18:istore_1        
		if(ImageManager.zzh(zzaEq) != null)
	//*  10   19:aload_0         
	//*  11   20:getfield        #23  <Field ImageManager zzaEq>
	//*  12   23:invokestatic    #111 <Method ImageManager$zza ImageManager.zzh(ImageManager)>
	//*  13   26:ifnull          97
		{
			if(zzaEt)
	//*  14   29:aload_0         
	//*  15   30:getfield        #32  <Field boolean zzaEt>
	//*  16   33:ifeq            67
			{
				ImageManager.zzh(zzaEq).evictAll();
	//   17   36:aload_0         
	//   18   37:getfield        #23  <Field ImageManager zzaEq>
	//   19   40:invokestatic    #111 <Method ImageManager$zza ImageManager.zzh(ImageManager)>
	//   20   43:invokevirtual   #116 <Method void ImageManager$zza.evictAll()>
				System.gc();
	//   21   46:invokestatic    #121 <Method void System.gc()>
				zzaEt = false;
	//   22   49:aload_0         
	//   23   50:iconst_0        
	//   24   51:putfield        #32  <Field boolean zzaEt>
				ImageManager.zzg(zzaEq).post(((Runnable) (this)));
	//   25   54:aload_0         
	//   26   55:getfield        #23  <Field ImageManager zzaEq>
	//   27   58:invokestatic    #125 <Method Handler ImageManager.zzg(ImageManager)>
	//   28   61:aload_0         
	//   29   62:invokevirtual   #131 <Method boolean Handler.post(Runnable)>
	//   30   65:pop             
				return;
	//   31   66:return          
			}
			if(flag)
	//*  32   67:iload_1         
	//*  33   68:ifeq            97
				ImageManager.zzh(zzaEq).put(((Object) (new zza.zza(mUri))), ((Object) (mBitmap)));
	//   34   71:aload_0         
	//   35   72:getfield        #23  <Field ImageManager zzaEq>
	//   36   75:invokestatic    #111 <Method ImageManager$zza ImageManager.zzh(ImageManager)>
	//   37   78:new             #133 <Class zza$zza>
	//   38   81:dup             
	//   39   82:aload_0         
	//   40   83:getfield        #28  <Field Uri mUri>
	//   41   86:invokespecial   #136 <Method void zza$zza(Uri)>
	//   42   89:aload_0         
	//   43   90:getfield        #30  <Field Bitmap mBitmap>
	//   44   93:invokevirtual   #137 <Method Object ImageManager$zza.put(Object, Object)>
	//   45   96:pop             
		}
		eReceiver ereceiver = (eReceiver)ImageManager.zze(zzaEq).remove(((Object) (mUri)));
	//   46   97:aload_0         
	//   47   98:getfield        #23  <Field ImageManager zzaEq>
	//   48  101:invokestatic    #139 <Method Map ImageManager.zze(ImageManager)>
	//   49  104:aload_0         
	//   50  105:getfield        #28  <Field Uri mUri>
	//   51  108:invokeinterface #98  <Method Object Map.remove(Object)>
	//   52  113:checkcast       #39  <Class ImageManager$ImageReceiver>
	//   53  116:astore_2        
		if(ereceiver != null)
	//*  54  117:aload_2         
	//*  55  118:ifnull          127
			zza(ereceiver, flag);
	//   56  121:aload_0         
	//   57  122:aload_2         
	//   58  123:iload_1         
	//   59  124:invokespecial   #141 <Method void zza(ImageManager$ImageReceiver, boolean)>
		zztj.countDown();
	//   60  127:aload_0         
	//   61  128:getfield        #34  <Field CountDownLatch zztj>
	//   62  131:invokevirtual   #146 <Method void CountDownLatch.countDown()>
		Object obj = ImageManager.zzuH();
	//   63  134:invokestatic    #150 <Method Object ImageManager.zzuH()>
	//   64  137:astore_2        
		obj;
	//   65  138:aload_2         
		JVM INSTR monitorenter ;
	//   66  139:monitorenter    
		ImageManager.zzxq().remove(((Object) (mUri)));
	//   67  140:invokestatic    #154 <Method HashSet ImageManager.zzxq()>
	//   68  143:aload_0         
	//   69  144:getfield        #28  <Field Uri mUri>
	//   70  147:invokevirtual   #159 <Method boolean HashSet.remove(Object)>
	//   71  150:pop             
		obj;
	//   72  151:aload_2         
		JVM INSTR monitorexit ;
	//   73  152:monitorexit     
		return;
	//   74  153:return          
		Exception exception;
		exception;
	//   75  154:astore_3        
	//*  76  155:aload_2         
		throw exception;
	//   77  156:monitorexit     
	//   78  157:aload_3         
	//   79  158:athrow          
	}

	private final Bitmap mBitmap;
	private final Uri mUri;
	final ImageManager zzaEq;
	private boolean zzaEt;
	private final CountDownLatch zztj;

	public ImageManager$zze(ImageManager imagemanager, Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
	{
		zzaEq = imagemanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field ImageManager zzaEq>
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
		zzaEt = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #32  <Field boolean zzaEt>
		zztj = countdownlatch;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #34  <Field CountDownLatch zztj>
	//   17   31:return          
	}
}
