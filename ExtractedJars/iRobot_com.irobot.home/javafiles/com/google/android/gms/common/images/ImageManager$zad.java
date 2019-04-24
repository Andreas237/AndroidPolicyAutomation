// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Asserts;
import java.util.*;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.images:
//			ImageManager, zab, zaa, zad

private final class ImageManager$zad
	implements Runnable
{

	public final void run()
	{
		Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
	//    0    0:ldc1            #38  <String "OnBitmapLoadedRunnable must be executed in the main thread">
	//    1    2:invokestatic    #44  <Method void Asserts.checkMainThread(String)>
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
		if(ImageManager.zah(zamq) != null)
	//*  10   19:aload_0         
	//*  11   20:getfield        #23  <Field ImageManager zamq>
	//*  12   23:invokestatic    #48  <Method ImageManager$zaa ImageManager.zah(ImageManager)>
	//*  13   26:ifnull          97
		{
			if(zamt)
	//*  14   29:aload_0         
	//*  15   30:getfield        #32  <Field boolean zamt>
	//*  16   33:ifeq            67
			{
				ImageManager.zah(zamq).evictAll();
	//   17   36:aload_0         
	//   18   37:getfield        #23  <Field ImageManager zamq>
	//   19   40:invokestatic    #48  <Method ImageManager$zaa ImageManager.zah(ImageManager)>
	//   20   43:invokevirtual   #53  <Method void ImageManager$zaa.evictAll()>
				System.gc();
	//   21   46:invokestatic    #58  <Method void System.gc()>
				zamt = false;
	//   22   49:aload_0         
	//   23   50:iconst_0        
	//   24   51:putfield        #32  <Field boolean zamt>
				ImageManager.zag(zamq).post(((Runnable) (this)));
	//   25   54:aload_0         
	//   26   55:getfield        #23  <Field ImageManager zamq>
	//   27   58:invokestatic    #62  <Method Handler ImageManager.zag(ImageManager)>
	//   28   61:aload_0         
	//   29   62:invokevirtual   #68  <Method boolean Handler.post(Runnable)>
	//   30   65:pop             
				return;
	//   31   66:return          
			}
			if(flag)
	//*  32   67:iload_1         
	//*  33   68:ifeq            97
				ImageManager.zah(zamq).put(((Object) (new zab(mUri))), ((Object) (mBitmap)));
	//   34   71:aload_0         
	//   35   72:getfield        #23  <Field ImageManager zamq>
	//   36   75:invokestatic    #48  <Method ImageManager$zaa ImageManager.zah(ImageManager)>
	//   37   78:new             #70  <Class zab>
	//   38   81:dup             
	//   39   82:aload_0         
	//   40   83:getfield        #28  <Field Uri mUri>
	//   41   86:invokespecial   #73  <Method void zab(Uri)>
	//   42   89:aload_0         
	//   43   90:getfield        #30  <Field Bitmap mBitmap>
	//   44   93:invokevirtual   #77  <Method Object ImageManager$zaa.put(Object, Object)>
	//   45   96:pop             
		}
		Object obj = ((Object) ((eReceiver)ImageManager.zae(zamq).remove(((Object) (mUri)))));
	//   46   97:aload_0         
	//   47   98:getfield        #23  <Field ImageManager zamq>
	//   48  101:invokestatic    #81  <Method Map ImageManager.zae(ImageManager)>
	//   49  104:aload_0         
	//   50  105:getfield        #28  <Field Uri mUri>
	//   51  108:invokeinterface #87  <Method Object Map.remove(Object)>
	//   52  113:checkcast       #89  <Class ImageManager$ImageReceiver>
	//   53  116:astore          4
		if(obj != null)
	//*  54  118:aload           4
	//*  55  120:ifnull          251
		{
			obj = ((Object) (eReceiver.zaa(((eReceiver) (obj)))));
	//   56  123:aload           4
	//   57  125:invokestatic    #93  <Method ArrayList ImageManager$ImageReceiver.zaa(ImageManager$ImageReceiver)>
	//   58  128:astore          4
			int j = ((ArrayList) (obj)).size();
	//   59  130:aload           4
	//   60  132:invokevirtual   #99  <Method int ArrayList.size()>
	//   61  135:istore_3        
			for(int i = 0; i < j; i++)
	//*  62  136:iconst_0        
	//*  63  137:istore_2        
	//*  64  138:iload_2         
	//*  65  139:iload_3         
	//*  66  140:icmpge          251
			{
				zaa zaa1 = (zaa)((ArrayList) (obj)).get(i);
	//   67  143:aload           4
	//   68  145:iload_2         
	//   69  146:invokevirtual   #103 <Method Object ArrayList.get(int)>
	//   70  149:checkcast       #105 <Class zaa>
	//   71  152:astore          5
				if(flag)
	//*  72  154:iload_1         
	//*  73  155:ifeq            178
				{
					zaa1.zaa(ImageManager.zab(zamq), mBitmap, false);
	//   74  158:aload           5
	//   75  160:aload_0         
	//   76  161:getfield        #23  <Field ImageManager zamq>
	//   77  164:invokestatic    #109 <Method android.content.Context ImageManager.zab(ImageManager)>
	//   78  167:aload_0         
	//   79  168:getfield        #30  <Field Bitmap mBitmap>
	//   80  171:iconst_0        
	//   81  172:invokevirtual   #112 <Method void zaa.zaa(android.content.Context, Bitmap, boolean)>
				} else
	//*  82  175:goto            221
				{
					ImageManager.zad(zamq).put(((Object) (mUri)), ((Object) (Long.valueOf(SystemClock.elapsedRealtime()))));
	//   83  178:aload_0         
	//   84  179:getfield        #23  <Field ImageManager zamq>
	//   85  182:invokestatic    #114 <Method Map ImageManager.zad(ImageManager)>
	//   86  185:aload_0         
	//   87  186:getfield        #28  <Field Uri mUri>
	//   88  189:invokestatic    #120 <Method long SystemClock.elapsedRealtime()>
	//   89  192:invokestatic    #126 <Method Long Long.valueOf(long)>
	//   90  195:invokeinterface #127 <Method Object Map.put(Object, Object)>
	//   91  200:pop             
					zaa1.zaa(ImageManager.zab(zamq), ImageManager.zac(zamq), false);
	//   92  201:aload           5
	//   93  203:aload_0         
	//   94  204:getfield        #23  <Field ImageManager zamq>
	//   95  207:invokestatic    #109 <Method android.content.Context ImageManager.zab(ImageManager)>
	//   96  210:aload_0         
	//   97  211:getfield        #23  <Field ImageManager zamq>
	//   98  214:invokestatic    #131 <Method com.google.android.gms.internal.base.zak ImageManager.zac(ImageManager)>
	//   99  217:iconst_0        
	//  100  218:invokevirtual   #134 <Method void zaa.zaa(android.content.Context, com.google.android.gms.internal.base.zak, boolean)>
				}
				if(!(zaa1 instanceof zad))
	//* 101  221:aload           5
	//* 102  223:instanceof      #136 <Class zad>
	//* 103  226:ifne            244
					ImageManager.zaa(zamq).remove(((Object) (zaa1)));
	//  104  229:aload_0         
	//  105  230:getfield        #23  <Field ImageManager zamq>
	//  106  233:invokestatic    #138 <Method Map ImageManager.zaa(ImageManager)>
	//  107  236:aload           5
	//  108  238:invokeinterface #87  <Method Object Map.remove(Object)>
	//  109  243:pop             
			}

	//  110  244:iload_2         
	//  111  245:iconst_1        
	//  112  246:iadd            
	//  113  247:istore_2        
		}
	//* 114  248:goto            138
		zadq.countDown();
	//  115  251:aload_0         
	//  116  252:getfield        #34  <Field CountDownLatch zadq>
	//  117  255:invokevirtual   #143 <Method void CountDownLatch.countDown()>
		synchronized(ImageManager.zacc())
	//* 118  258:invokestatic    #147 <Method Object ImageManager.zacc()>
	//* 119  261:astore          4
	//* 120  263:aload           4
	//* 121  265:monitorenter    
		{
			ImageManager.zacd().remove(((Object) (mUri)));
	//  122  266:invokestatic    #151 <Method HashSet ImageManager.zacd()>
	//  123  269:aload_0         
	//  124  270:getfield        #28  <Field Uri mUri>
	//  125  273:invokevirtual   #156 <Method boolean HashSet.remove(Object)>
	//  126  276:pop             
		}
	//  127  277:aload           4
	//  128  279:monitorexit     
		return;
	//  129  280:return          
		exception;
	//  130  281:astore          5
		obj1;
	//  131  283:aload           4
		JVM INSTR monitorexit ;
	//  132  285:monitorexit     
		throw exception;
	//  133  286:aload           5
	//  134  288:athrow          
	}

	private final Bitmap mBitmap;
	private final Uri mUri;
	private final CountDownLatch zadq;
	private final ImageManager zamq;
	private boolean zamt;

	public ImageManager$zad(ImageManager imagemanager, Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
	{
		zamq = imagemanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field ImageManager zamq>
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
		zamt = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #32  <Field boolean zamt>
		zadq = countdownlatch;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #34  <Field CountDownLatch zadq>
	//   17   31:return          
	}
}
