// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import android.os.*;
import android.util.Log;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.util.Util;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.bumptech.glide.load.engine.prefill:
//			PreFillQueue, PreFillType

final class BitmapPreFillRunner
	implements Runnable
{
	static class Clock
	{

		public long now()
		{
			return SystemClock.currentThreadTimeMillis();
		//    0    0:invokestatic    #19  <Method long SystemClock.currentThreadTimeMillis()>
		//    1    3:lreturn         
		}

		Clock()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	static class UniqueKey
		implements Key
	{

		public void updateDiskCacheKey(MessageDigest messagedigest)
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #18  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		UniqueKey()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	public BitmapPreFillRunner(BitmapPool bitmappool, MemoryCache memorycache, PreFillQueue prefillqueue)
	{
		this(bitmappool, memorycache, prefillqueue, DEFAULT_CLOCK, new Handler(Looper.getMainLooper()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:getstatic       #51  <Field BitmapPreFillRunner$Clock DEFAULT_CLOCK>
	//    5    7:new             #67  <Class Handler>
	//    6   10:dup             
	//    7   11:invokestatic    #73  <Method Looper Looper.getMainLooper()>
	//    8   14:invokespecial   #76  <Method void Handler(Looper)>
	//    9   17:invokespecial   #79  <Method void BitmapPreFillRunner(BitmapPool, MemoryCache, PreFillQueue, BitmapPreFillRunner$Clock, Handler)>
	//   10   20:return          
	}

	BitmapPreFillRunner(BitmapPool bitmappool, MemoryCache memorycache, PreFillQueue prefillqueue, Clock clock1, Handler handler1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method void Object()>
		seenTypes = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #82  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #83  <Method void HashSet()>
	//    6   12:putfield        #85  <Field Set seenTypes>
		currentDelay = 40L;
	//    7   15:aload_0         
	//    8   16:ldc2w           #20  <Long 40L>
	//    9   19:putfield        #87  <Field long currentDelay>
		bitmapPool = bitmappool;
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:putfield        #89  <Field BitmapPool bitmapPool>
		memoryCache = memorycache;
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:putfield        #91  <Field MemoryCache memoryCache>
		toPrefill = prefillqueue;
	//   16   32:aload_0         
	//   17   33:aload_3         
	//   18   34:putfield        #93  <Field PreFillQueue toPrefill>
		clock = clock1;
	//   19   37:aload_0         
	//   20   38:aload           4
	//   21   40:putfield        #95  <Field BitmapPreFillRunner$Clock clock>
		handler = handler1;
	//   22   43:aload_0         
	//   23   44:aload           5
	//   24   46:putfield        #97  <Field Handler handler>
	//   25   49:return          
	}

	private boolean allocate()
	{
		long l = clock.now();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field BitmapPreFillRunner$Clock clock>
	//    2    4:invokevirtual   #103 <Method long BitmapPreFillRunner$Clock.now()>
	//    3    7:lstore_1        
		do
		{
			if(toPrefill.isEmpty() || isGcDetected(l))
				break;
	//    4    8:aload_0         
	//    5    9:getfield        #93  <Field PreFillQueue toPrefill>
	//    6   12:invokevirtual   #108 <Method boolean PreFillQueue.isEmpty()>
	//    7   15:ifne            236
	//    8   18:aload_0         
	//    9   19:lload_1         
	//   10   20:invokespecial   #112 <Method boolean isGcDetected(long)>
	//   11   23:ifne            236
			PreFillType prefilltype = toPrefill.remove();
	//   12   26:aload_0         
	//   13   27:getfield        #93  <Field PreFillQueue toPrefill>
	//   14   30:invokevirtual   #116 <Method PreFillType PreFillQueue.remove()>
	//   15   33:astore          4
			Bitmap bitmap;
			if(!seenTypes.contains(((Object) (prefilltype))))
	//*  16   35:aload_0         
	//*  17   36:getfield        #85  <Field Set seenTypes>
	//*  18   39:aload           4
	//*  19   41:invokeinterface #122 <Method boolean Set.contains(Object)>
	//*  20   46:ifne            89
			{
				seenTypes.add(((Object) (prefilltype)));
	//   21   49:aload_0         
	//   22   50:getfield        #85  <Field Set seenTypes>
	//   23   53:aload           4
	//   24   55:invokeinterface #125 <Method boolean Set.add(Object)>
	//   25   60:pop             
				bitmap = bitmapPool.getDirty(prefilltype.getWidth(), prefilltype.getHeight(), prefilltype.getConfig());
	//   26   61:aload_0         
	//   27   62:getfield        #89  <Field BitmapPool bitmapPool>
	//   28   65:aload           4
	//   29   67:invokevirtual   #131 <Method int PreFillType.getWidth()>
	//   30   70:aload           4
	//   31   72:invokevirtual   #134 <Method int PreFillType.getHeight()>
	//   32   75:aload           4
	//   33   77:invokevirtual   #138 <Method android.graphics.Bitmap$Config PreFillType.getConfig()>
	//   34   80:invokeinterface #144 <Method Bitmap BitmapPool.getDirty(int, int, android.graphics.Bitmap$Config)>
	//   35   85:astore_3        
			} else
	//*  36   86:goto            108
			{
				bitmap = Bitmap.createBitmap(prefilltype.getWidth(), prefilltype.getHeight(), prefilltype.getConfig());
	//   37   89:aload           4
	//   38   91:invokevirtual   #131 <Method int PreFillType.getWidth()>
	//   39   94:aload           4
	//   40   96:invokevirtual   #134 <Method int PreFillType.getHeight()>
	//   41   99:aload           4
	//   42  101:invokevirtual   #138 <Method android.graphics.Bitmap$Config PreFillType.getConfig()>
	//   43  104:invokestatic    #149 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   44  107:astore_3        
			}
			if(getFreeMemoryCacheBytes() >= Util.getBitmapByteSize(bitmap))
	//*  45  108:aload_0         
	//*  46  109:invokespecial   #152 <Method int getFreeMemoryCacheBytes()>
	//*  47  112:aload_3         
	//*  48  113:invokestatic    #158 <Method int Util.getBitmapByteSize(Bitmap)>
	//*  49  116:icmplt          147
				memoryCache.put(((Key) (new UniqueKey())), ((com.bumptech.glide.load.engine.Resource) (BitmapResource.obtain(bitmap, bitmapPool))));
	//   50  119:aload_0         
	//   51  120:getfield        #91  <Field MemoryCache memoryCache>
	//   52  123:new             #11  <Class BitmapPreFillRunner$UniqueKey>
	//   53  126:dup             
	//   54  127:invokespecial   #159 <Method void BitmapPreFillRunner$UniqueKey()>
	//   55  130:aload_3         
	//   56  131:aload_0         
	//   57  132:getfield        #89  <Field BitmapPool bitmapPool>
	//   58  135:invokestatic    #165 <Method BitmapResource BitmapResource.obtain(Bitmap, BitmapPool)>
	//   59  138:invokeinterface #171 <Method com.bumptech.glide.load.engine.Resource MemoryCache.put(Key, com.bumptech.glide.load.engine.Resource)>
	//   60  143:pop             
			else
	//*  61  144:goto            157
				bitmapPool.put(bitmap);
	//   62  147:aload_0         
	//   63  148:getfield        #89  <Field BitmapPool bitmapPool>
	//   64  151:aload_3         
	//   65  152:invokeinterface #174 <Method void BitmapPool.put(Bitmap)>
			if(Log.isLoggable("PreFillRunner", 3))
	//*  66  157:ldc1            #29  <String "PreFillRunner">
	//*  67  159:iconst_3        
	//*  68  160:invokestatic    #180 <Method boolean Log.isLoggable(String, int)>
	//*  69  163:ifeq            233
				Log.d("PreFillRunner", (new StringBuilder()).append("allocated [").append(prefilltype.getWidth()).append("x").append(prefilltype.getHeight()).append("] ").append(((Object) (prefilltype.getConfig()))).append(" size: ").append(Util.getBitmapByteSize(bitmap)).toString());
	//   70  166:ldc1            #29  <String "PreFillRunner">
	//   71  168:new             #182 <Class StringBuilder>
	//   72  171:dup             
	//   73  172:invokespecial   #183 <Method void StringBuilder()>
	//   74  175:ldc1            #185 <String "allocated [">
	//   75  177:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   76  180:aload           4
	//   77  182:invokevirtual   #131 <Method int PreFillType.getWidth()>
	//   78  185:invokevirtual   #192 <Method StringBuilder StringBuilder.append(int)>
	//   79  188:ldc1            #194 <String "x">
	//   80  190:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   81  193:aload           4
	//   82  195:invokevirtual   #134 <Method int PreFillType.getHeight()>
	//   83  198:invokevirtual   #192 <Method StringBuilder StringBuilder.append(int)>
	//   84  201:ldc1            #196 <String "] ">
	//   85  203:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   86  206:aload           4
	//   87  208:invokevirtual   #138 <Method android.graphics.Bitmap$Config PreFillType.getConfig()>
	//   88  211:invokevirtual   #199 <Method StringBuilder StringBuilder.append(Object)>
	//   89  214:ldc1            #201 <String " size: ">
	//   90  216:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   91  219:aload_3         
	//   92  220:invokestatic    #158 <Method int Util.getBitmapByteSize(Bitmap)>
	//   93  223:invokevirtual   #192 <Method StringBuilder StringBuilder.append(int)>
	//   94  226:invokevirtual   #205 <Method String StringBuilder.toString()>
	//   95  229:invokestatic    #209 <Method int Log.d(String, String)>
	//   96  232:pop             
		} while(true);
	//   97  233:goto            8
		return !isCancelled && !toPrefill.isEmpty();
	//   98  236:aload_0         
	//   99  237:getfield        #211 <Field boolean isCancelled>
	//  100  240:ifne            255
	//  101  243:aload_0         
	//  102  244:getfield        #93  <Field PreFillQueue toPrefill>
	//  103  247:invokevirtual   #108 <Method boolean PreFillQueue.isEmpty()>
	//  104  250:ifne            255
	//  105  253:iconst_1        
	//  106  254:ireturn         
	//  107  255:iconst_0        
	//  108  256:ireturn         
	}

	private int getFreeMemoryCacheBytes()
	{
		return memoryCache.getMaxSize() - memoryCache.getCurrentSize();
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field MemoryCache memoryCache>
	//    2    4:invokeinterface #214 <Method int MemoryCache.getMaxSize()>
	//    3    9:aload_0         
	//    4   10:getfield        #91  <Field MemoryCache memoryCache>
	//    5   13:invokeinterface #217 <Method int MemoryCache.getCurrentSize()>
	//    6   18:isub            
	//    7   19:ireturn         
	}

	private long getNextDelay()
	{
		long l = currentDelay;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field long currentDelay>
	//    2    4:lstore_1        
		currentDelay = Math.min(currentDelay * 4L, MAX_BACKOFF_MS);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #87  <Field long currentDelay>
	//    6   10:ldc2w           #219 <Long 4L>
	//    7   13:lmul            
	//    8   14:getstatic       #63  <Field long MAX_BACKOFF_MS>
	//    9   17:invokestatic    #226 <Method long Math.min(long, long)>
	//   10   20:putfield        #87  <Field long currentDelay>
		return l;
	//   11   23:lload_1         
	//   12   24:lreturn         
	}

	private boolean isGcDetected(long l)
	{
		return clock.now() - l >= 32L;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field BitmapPreFillRunner$Clock clock>
	//    2    4:invokevirtual   #103 <Method long BitmapPreFillRunner$Clock.now()>
	//    3    7:lload_1         
	//    4    8:lsub            
	//    5    9:ldc2w           #24  <Long 32L>
	//    6   12:lcmp            
	//    7   13:iflt            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public void cancel()
	{
		isCancelled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #211 <Field boolean isCancelled>
	//    3    5:return          
	}

	public void run()
	{
		if(allocate())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #230 <Method boolean allocate()>
	//*   2    4:ifeq            20
			handler.postDelayed(((Runnable) (this)), getNextDelay());
	//    3    7:aload_0         
	//    4    8:getfield        #97  <Field Handler handler>
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokespecial   #232 <Method long getNextDelay()>
	//    8   16:invokevirtual   #236 <Method boolean Handler.postDelayed(Runnable, long)>
	//    9   19:pop             
	//   10   20:return          
	}

	static final int BACKOFF_RATIO = 4;
	private static final Clock DEFAULT_CLOCK = new Clock();
	static final long INITIAL_BACKOFF_MS = 40L;
	static final long MAX_BACKOFF_MS;
	static final long MAX_DURATION_MS = 32L;
	private static final String TAG = "PreFillRunner";
	private final BitmapPool bitmapPool;
	private final Clock clock;
	private long currentDelay;
	private final Handler handler;
	private boolean isCancelled;
	private final MemoryCache memoryCache;
	private final Set seenTypes;
	private final PreFillQueue toPrefill;

	static 
	{
	//    0    0:new             #8   <Class BitmapPreFillRunner$Clock>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void BitmapPreFillRunner$Clock()>
	//    3    7:putstatic       #51  <Field BitmapPreFillRunner$Clock DEFAULT_CLOCK>
		MAX_BACKOFF_MS = TimeUnit.SECONDS.toMillis(1L);
	//    4   10:getstatic       #57  <Field TimeUnit TimeUnit.SECONDS>
	//    5   13:lconst_1        
	//    6   14:invokevirtual   #61  <Method long TimeUnit.toMillis(long)>
	//    7   17:putstatic       #63  <Field long MAX_BACKOFF_MS>
	//*   8   20:return          
	}
}
