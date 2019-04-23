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

		long now()
		{
			return SystemClock.currentThreadTimeMillis();
		//    0    0:invokestatic    #20  <Method long SystemClock.currentThreadTimeMillis()>
		//    1    3:lreturn         
		}

		Clock()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
		//    2    4:return          
		}
	}

	private static final class UniqueKey
		implements Key
	{

		public void updateDiskCacheKey(MessageDigest messagedigest)
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #19  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void UnsupportedOperationException()>
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
	//    4    4:getstatic       #52  <Field BitmapPreFillRunner$Clock DEFAULT_CLOCK>
	//    5    7:new             #68  <Class Handler>
	//    6   10:dup             
	//    7   11:invokestatic    #74  <Method Looper Looper.getMainLooper()>
	//    8   14:invokespecial   #77  <Method void Handler(Looper)>
	//    9   17:invokespecial   #80  <Method void BitmapPreFillRunner(BitmapPool, MemoryCache, PreFillQueue, BitmapPreFillRunner$Clock, Handler)>
	//   10   20:return          
	}

	BitmapPreFillRunner(BitmapPool bitmappool, MemoryCache memorycache, PreFillQueue prefillqueue, Clock clock1, Handler handler1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void Object()>
		seenTypes = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #83  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #84  <Method void HashSet()>
	//    6   12:putfield        #86  <Field Set seenTypes>
		currentDelay = 40L;
	//    7   15:aload_0         
	//    8   16:ldc2w           #20  <Long 40L>
	//    9   19:putfield        #88  <Field long currentDelay>
		bitmapPool = bitmappool;
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:putfield        #90  <Field BitmapPool bitmapPool>
		memoryCache = memorycache;
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:putfield        #92  <Field MemoryCache memoryCache>
		toPrefill = prefillqueue;
	//   16   32:aload_0         
	//   17   33:aload_3         
	//   18   34:putfield        #94  <Field PreFillQueue toPrefill>
		clock = clock1;
	//   19   37:aload_0         
	//   20   38:aload           4
	//   21   40:putfield        #96  <Field BitmapPreFillRunner$Clock clock>
		handler = handler1;
	//   22   43:aload_0         
	//   23   44:aload           5
	//   24   46:putfield        #98  <Field Handler handler>
	//   25   49:return          
	}

	private long getFreeMemoryCacheBytes()
	{
		return memoryCache.getMaxSize() - memoryCache.getCurrentSize();
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field MemoryCache memoryCache>
	//    2    4:invokeinterface #106 <Method long MemoryCache.getMaxSize()>
	//    3    9:aload_0         
	//    4   10:getfield        #92  <Field MemoryCache memoryCache>
	//    5   13:invokeinterface #109 <Method long MemoryCache.getCurrentSize()>
	//    6   18:lsub            
	//    7   19:lreturn         
	}

	private long getNextDelay()
	{
		long l = currentDelay;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field long currentDelay>
	//    2    4:lstore_1        
		currentDelay = Math.min(4L * l, MAX_BACKOFF_MS);
	//    3    5:aload_0         
	//    4    6:ldc2w           #111 <Long 4L>
	//    5    9:lload_1         
	//    6   10:lmul            
	//    7   11:getstatic       #64  <Field long MAX_BACKOFF_MS>
	//    8   14:invokestatic    #118 <Method long Math.min(long, long)>
	//    9   17:putfield        #88  <Field long currentDelay>
		return l;
	//   10   20:lload_1         
	//   11   21:lreturn         
	}

	private boolean isGcDetected(long l)
	{
		return clock.now() - l >= 32L;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field BitmapPreFillRunner$Clock clock>
	//    2    4:invokevirtual   #123 <Method long BitmapPreFillRunner$Clock.now()>
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

	boolean allocate()
	{
		long l = clock.now();
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field BitmapPreFillRunner$Clock clock>
	//    2    4:invokevirtual   #123 <Method long BitmapPreFillRunner$Clock.now()>
	//    3    7:lstore_2        
		do
		{
			if(toPrefill.isEmpty() || isGcDetected(l))
				break;
	//    4    8:aload_0         
	//    5    9:getfield        #94  <Field PreFillQueue toPrefill>
	//    6   12:invokevirtual   #130 <Method boolean PreFillQueue.isEmpty()>
	//    7   15:ifne            274
	//    8   18:aload_0         
	//    9   19:lload_2         
	//   10   20:invokespecial   #132 <Method boolean isGcDetected(long)>
	//   11   23:ifne            274
			PreFillType prefilltype = toPrefill.remove();
	//   12   26:aload_0         
	//   13   27:getfield        #94  <Field PreFillQueue toPrefill>
	//   14   30:invokevirtual   #136 <Method PreFillType PreFillQueue.remove()>
	//   15   33:astore          5
			Bitmap bitmap;
			if(!seenTypes.contains(((Object) (prefilltype))))
	//*  16   35:aload_0         
	//*  17   36:getfield        #86  <Field Set seenTypes>
	//*  18   39:aload           5
	//*  19   41:invokeinterface #142 <Method boolean Set.contains(Object)>
	//*  20   46:ifne            90
			{
				seenTypes.add(((Object) (prefilltype)));
	//   21   49:aload_0         
	//   22   50:getfield        #86  <Field Set seenTypes>
	//   23   53:aload           5
	//   24   55:invokeinterface #145 <Method boolean Set.add(Object)>
	//   25   60:pop             
				bitmap = bitmapPool.getDirty(prefilltype.getWidth(), prefilltype.getHeight(), prefilltype.getConfig());
	//   26   61:aload_0         
	//   27   62:getfield        #90  <Field BitmapPool bitmapPool>
	//   28   65:aload           5
	//   29   67:invokevirtual   #151 <Method int PreFillType.getWidth()>
	//   30   70:aload           5
	//   31   72:invokevirtual   #154 <Method int PreFillType.getHeight()>
	//   32   75:aload           5
	//   33   77:invokevirtual   #158 <Method android.graphics.Bitmap$Config PreFillType.getConfig()>
	//   34   80:invokeinterface #164 <Method Bitmap BitmapPool.getDirty(int, int, android.graphics.Bitmap$Config)>
	//   35   85:astore          4
			} else
	//*  36   87:goto            110
			{
				bitmap = Bitmap.createBitmap(prefilltype.getWidth(), prefilltype.getHeight(), prefilltype.getConfig());
	//   37   90:aload           5
	//   38   92:invokevirtual   #151 <Method int PreFillType.getWidth()>
	//   39   95:aload           5
	//   40   97:invokevirtual   #154 <Method int PreFillType.getHeight()>
	//   41  100:aload           5
	//   42  102:invokevirtual   #158 <Method android.graphics.Bitmap$Config PreFillType.getConfig()>
	//   43  105:invokestatic    #169 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   44  108:astore          4
			}
			int i = Util.getBitmapByteSize(bitmap);
	//   45  110:aload           4
	//   46  112:invokestatic    #175 <Method int Util.getBitmapByteSize(Bitmap)>
	//   47  115:istore_1        
			if(getFreeMemoryCacheBytes() >= (long)i)
	//*  48  116:aload_0         
	//*  49  117:invokespecial   #177 <Method long getFreeMemoryCacheBytes()>
	//*  50  120:iload_1         
	//*  51  121:i2l             
	//*  52  122:lcmp            
	//*  53  123:iflt            159
			{
				UniqueKey uniquekey = new UniqueKey();
	//   54  126:new             #11  <Class BitmapPreFillRunner$UniqueKey>
	//   55  129:dup             
	//   56  130:invokespecial   #178 <Method void BitmapPreFillRunner$UniqueKey()>
	//   57  133:astore          6
				memoryCache.put(((Key) (uniquekey)), ((com.bumptech.glide.load.engine.Resource) (BitmapResource.obtain(bitmap, bitmapPool))));
	//   58  135:aload_0         
	//   59  136:getfield        #92  <Field MemoryCache memoryCache>
	//   60  139:aload           6
	//   61  141:aload           4
	//   62  143:aload_0         
	//   63  144:getfield        #90  <Field BitmapPool bitmapPool>
	//   64  147:invokestatic    #184 <Method BitmapResource BitmapResource.obtain(Bitmap, BitmapPool)>
	//   65  150:invokeinterface #188 <Method com.bumptech.glide.load.engine.Resource MemoryCache.put(Key, com.bumptech.glide.load.engine.Resource)>
	//   66  155:pop             
			} else
	//*  67  156:goto            170
			{
				bitmapPool.put(bitmap);
	//   68  159:aload_0         
	//   69  160:getfield        #90  <Field BitmapPool bitmapPool>
	//   70  163:aload           4
	//   71  165:invokeinterface #191 <Method void BitmapPool.put(Bitmap)>
			}
			if(Log.isLoggable("PreFillRunner", 3))
	//*  72  170:ldc1            #29  <String "PreFillRunner">
	//*  73  172:iconst_3        
	//*  74  173:invokestatic    #197 <Method boolean Log.isLoggable(String, int)>
	//*  75  176:ifeq            8
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   76  179:new             #199 <Class StringBuilder>
	//   77  182:dup             
	//   78  183:invokespecial   #200 <Method void StringBuilder()>
	//   79  186:astore          4
				stringbuilder.append("allocated [");
	//   80  188:aload           4
	//   81  190:ldc1            #202 <String "allocated [">
	//   82  192:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   83  195:pop             
				stringbuilder.append(prefilltype.getWidth());
	//   84  196:aload           4
	//   85  198:aload           5
	//   86  200:invokevirtual   #151 <Method int PreFillType.getWidth()>
	//   87  203:invokevirtual   #209 <Method StringBuilder StringBuilder.append(int)>
	//   88  206:pop             
				stringbuilder.append("x");
	//   89  207:aload           4
	//   90  209:ldc1            #211 <String "x">
	//   91  211:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   92  214:pop             
				stringbuilder.append(prefilltype.getHeight());
	//   93  215:aload           4
	//   94  217:aload           5
	//   95  219:invokevirtual   #154 <Method int PreFillType.getHeight()>
	//   96  222:invokevirtual   #209 <Method StringBuilder StringBuilder.append(int)>
	//   97  225:pop             
				stringbuilder.append("] ");
	//   98  226:aload           4
	//   99  228:ldc1            #213 <String "] ">
	//  100  230:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  101  233:pop             
				stringbuilder.append(((Object) (prefilltype.getConfig())));
	//  102  234:aload           4
	//  103  236:aload           5
	//  104  238:invokevirtual   #158 <Method android.graphics.Bitmap$Config PreFillType.getConfig()>
	//  105  241:invokevirtual   #216 <Method StringBuilder StringBuilder.append(Object)>
	//  106  244:pop             
				stringbuilder.append(" size: ");
	//  107  245:aload           4
	//  108  247:ldc1            #218 <String " size: ">
	//  109  249:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  110  252:pop             
				stringbuilder.append(i);
	//  111  253:aload           4
	//  112  255:iload_1         
	//  113  256:invokevirtual   #209 <Method StringBuilder StringBuilder.append(int)>
	//  114  259:pop             
				Log.d("PreFillRunner", stringbuilder.toString());
	//  115  260:ldc1            #29  <String "PreFillRunner">
	//  116  262:aload           4
	//  117  264:invokevirtual   #222 <Method String StringBuilder.toString()>
	//  118  267:invokestatic    #226 <Method int Log.d(String, String)>
	//  119  270:pop             
			}
		} while(true);
	//  120  271:goto            8
		return !isCancelled && !toPrefill.isEmpty();
	//  121  274:aload_0         
	//  122  275:getfield        #228 <Field boolean isCancelled>
	//  123  278:ifne            293
	//  124  281:aload_0         
	//  125  282:getfield        #94  <Field PreFillQueue toPrefill>
	//  126  285:invokevirtual   #130 <Method boolean PreFillQueue.isEmpty()>
	//  127  288:ifne            293
	//  128  291:iconst_1        
	//  129  292:ireturn         
	//  130  293:iconst_0        
	//  131  294:ireturn         
	}

	public void cancel()
	{
		isCancelled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #228 <Field boolean isCancelled>
	//    3    5:return          
	}

	public void run()
	{
		if(allocate())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #232 <Method boolean allocate()>
	//*   2    4:ifeq            20
			handler.postDelayed(((Runnable) (this)), getNextDelay());
	//    3    7:aload_0         
	//    4    8:getfield        #98  <Field Handler handler>
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokespecial   #234 <Method long getNextDelay()>
	//    8   16:invokevirtual   #238 <Method boolean Handler.postDelayed(Runnable, long)>
	//    9   19:pop             
	//   10   20:return          
	}

	static final int BACKOFF_RATIO = 4;
	private static final Clock DEFAULT_CLOCK = new Clock();
	static final long INITIAL_BACKOFF_MS = 40L;
	static final long MAX_BACKOFF_MS;
	static final long MAX_DURATION_MS = 32L;
	static final String TAG = "PreFillRunner";
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
	//    2    4:invokespecial   #50  <Method void BitmapPreFillRunner$Clock()>
	//    3    7:putstatic       #52  <Field BitmapPreFillRunner$Clock DEFAULT_CLOCK>
		MAX_BACKOFF_MS = TimeUnit.SECONDS.toMillis(1L);
	//    4   10:getstatic       #58  <Field TimeUnit TimeUnit.SECONDS>
	//    5   13:lconst_1        
	//    6   14:invokevirtual   #62  <Method long TimeUnit.toMillis(long)>
	//    7   17:putstatic       #64  <Field long MAX_BACKOFF_MS>
	//*   8   20:return          
	}
}
