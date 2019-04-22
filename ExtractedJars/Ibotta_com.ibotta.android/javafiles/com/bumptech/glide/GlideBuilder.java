// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import android.content.Context;
import android.support.v4.util.ArrayMap;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.DefaultConnectivityMonitorFactory;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.request.RequestOptions;
import java.util.*;

// Referenced classes of package com.bumptech.glide:
//			Glide

public final class GlideBuilder
{

	public GlideBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #44  <Class ArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #45  <Method void ArrayMap()>
	//    6   12:putfield        #47  <Field Map defaultTransitionOptions>
		logLevel = 4;
	//    7   15:aload_0         
	//    8   16:iconst_4        
	//    9   17:putfield        #49  <Field int logLevel>
		defaultRequestOptions = new RequestOptions();
	//   10   20:aload_0         
	//   11   21:new             #51  <Class RequestOptions>
	//   12   24:dup             
	//   13   25:invokespecial   #52  <Method void RequestOptions()>
	//   14   28:putfield        #54  <Field RequestOptions defaultRequestOptions>
	//   15   31:return          
	}

	Glide build(Context context)
	{
		if(sourceExecutor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field GlideExecutor sourceExecutor>
	//*   2    4:ifnonnull       14
			sourceExecutor = GlideExecutor.newSourceExecutor();
	//    3    7:aload_0         
	//    4    8:invokestatic    #66  <Method GlideExecutor GlideExecutor.newSourceExecutor()>
	//    5   11:putfield        #60  <Field GlideExecutor sourceExecutor>
		if(diskCacheExecutor == null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #68  <Field GlideExecutor diskCacheExecutor>
	//*   8   18:ifnonnull       28
			diskCacheExecutor = GlideExecutor.newDiskCacheExecutor();
	//    9   21:aload_0         
	//   10   22:invokestatic    #71  <Method GlideExecutor GlideExecutor.newDiskCacheExecutor()>
	//   11   25:putfield        #68  <Field GlideExecutor diskCacheExecutor>
		if(animationExecutor == null)
	//*  12   28:aload_0         
	//*  13   29:getfield        #73  <Field GlideExecutor animationExecutor>
	//*  14   32:ifnonnull       42
			animationExecutor = GlideExecutor.newAnimationExecutor();
	//   15   35:aload_0         
	//   16   36:invokestatic    #76  <Method GlideExecutor GlideExecutor.newAnimationExecutor()>
	//   17   39:putfield        #73  <Field GlideExecutor animationExecutor>
		if(memorySizeCalculator == null)
	//*  18   42:aload_0         
	//*  19   43:getfield        #78  <Field MemorySizeCalculator memorySizeCalculator>
	//*  20   46:ifnonnull       64
			memorySizeCalculator = (new com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder(context)).build();
	//   21   49:aload_0         
	//   22   50:new             #80  <Class com.bumptech.glide.load.engine.cache.MemorySizeCalculator$Builder>
	//   23   53:dup             
	//   24   54:aload_1         
	//   25   55:invokespecial   #83  <Method void com.bumptech.glide.load.engine.cache.MemorySizeCalculator$Builder(Context)>
	//   26   58:invokevirtual   #86  <Method MemorySizeCalculator com.bumptech.glide.load.engine.cache.MemorySizeCalculator$Builder.build()>
	//   27   61:putfield        #78  <Field MemorySizeCalculator memorySizeCalculator>
		if(connectivityMonitorFactory == null)
	//*  28   64:aload_0         
	//*  29   65:getfield        #88  <Field ConnectivityMonitorFactory connectivityMonitorFactory>
	//*  30   68:ifnonnull       82
			connectivityMonitorFactory = ((ConnectivityMonitorFactory) (new DefaultConnectivityMonitorFactory()));
	//   31   71:aload_0         
	//   32   72:new             #90  <Class DefaultConnectivityMonitorFactory>
	//   33   75:dup             
	//   34   76:invokespecial   #91  <Method void DefaultConnectivityMonitorFactory()>
	//   35   79:putfield        #88  <Field ConnectivityMonitorFactory connectivityMonitorFactory>
		if(bitmapPool == null)
	//*  36   82:aload_0         
	//*  37   83:getfield        #93  <Field BitmapPool bitmapPool>
	//*  38   86:ifnonnull       128
		{
			int i = memorySizeCalculator.getBitmapPoolSize();
	//   39   89:aload_0         
	//   40   90:getfield        #78  <Field MemorySizeCalculator memorySizeCalculator>
	//   41   93:invokevirtual   #99  <Method int MemorySizeCalculator.getBitmapPoolSize()>
	//   42   96:istore_2        
			if(i > 0)
	//*  43   97:iload_2         
	//*  44   98:ifle            117
				bitmapPool = ((BitmapPool) (new LruBitmapPool(i)));
	//   45  101:aload_0         
	//   46  102:new             #101 <Class LruBitmapPool>
	//   47  105:dup             
	//   48  106:iload_2         
	//   49  107:i2l             
	//   50  108:invokespecial   #104 <Method void LruBitmapPool(long)>
	//   51  111:putfield        #93  <Field BitmapPool bitmapPool>
			else
	//*  52  114:goto            128
				bitmapPool = ((BitmapPool) (new BitmapPoolAdapter()));
	//   53  117:aload_0         
	//   54  118:new             #106 <Class BitmapPoolAdapter>
	//   55  121:dup             
	//   56  122:invokespecial   #107 <Method void BitmapPoolAdapter()>
	//   57  125:putfield        #93  <Field BitmapPool bitmapPool>
		}
		if(arrayPool == null)
	//*  58  128:aload_0         
	//*  59  129:getfield        #109 <Field ArrayPool arrayPool>
	//*  60  132:ifnonnull       153
			arrayPool = ((ArrayPool) (new LruArrayPool(memorySizeCalculator.getArrayPoolSizeInBytes())));
	//   61  135:aload_0         
	//   62  136:new             #111 <Class LruArrayPool>
	//   63  139:dup             
	//   64  140:aload_0         
	//   65  141:getfield        #78  <Field MemorySizeCalculator memorySizeCalculator>
	//   66  144:invokevirtual   #114 <Method int MemorySizeCalculator.getArrayPoolSizeInBytes()>
	//   67  147:invokespecial   #117 <Method void LruArrayPool(int)>
	//   68  150:putfield        #109 <Field ArrayPool arrayPool>
		if(memoryCache == null)
	//*  69  153:aload_0         
	//*  70  154:getfield        #119 <Field MemoryCache memoryCache>
	//*  71  157:ifnonnull       179
			memoryCache = ((MemoryCache) (new LruResourceCache(memorySizeCalculator.getMemoryCacheSize())));
	//   72  160:aload_0         
	//   73  161:new             #121 <Class LruResourceCache>
	//   74  164:dup             
	//   75  165:aload_0         
	//   76  166:getfield        #78  <Field MemorySizeCalculator memorySizeCalculator>
	//   77  169:invokevirtual   #124 <Method int MemorySizeCalculator.getMemoryCacheSize()>
	//   78  172:i2l             
	//   79  173:invokespecial   #125 <Method void LruResourceCache(long)>
	//   80  176:putfield        #119 <Field MemoryCache memoryCache>
		if(diskCacheFactory == null)
	//*  81  179:aload_0         
	//*  82  180:getfield        #127 <Field com.bumptech.glide.load.engine.cache.DiskCache$Factory diskCacheFactory>
	//*  83  183:ifnonnull       198
			diskCacheFactory = ((com.bumptech.glide.load.engine.cache.DiskCache.Factory) (new InternalCacheDiskCacheFactory(context)));
	//   84  186:aload_0         
	//   85  187:new             #129 <Class InternalCacheDiskCacheFactory>
	//   86  190:dup             
	//   87  191:aload_1         
	//   88  192:invokespecial   #130 <Method void InternalCacheDiskCacheFactory(Context)>
	//   89  195:putfield        #127 <Field com.bumptech.glide.load.engine.cache.DiskCache$Factory diskCacheFactory>
		if(engine == null)
	//*  90  198:aload_0         
	//*  91  199:getfield        #132 <Field Engine engine>
	//*  92  202:ifnonnull       242
			engine = new Engine(memoryCache, diskCacheFactory, diskCacheExecutor, sourceExecutor, GlideExecutor.newUnlimitedSourceExecutor(), GlideExecutor.newAnimationExecutor(), isActiveResourceRetentionAllowed);
	//   93  205:aload_0         
	//   94  206:new             #134 <Class Engine>
	//   95  209:dup             
	//   96  210:aload_0         
	//   97  211:getfield        #119 <Field MemoryCache memoryCache>
	//   98  214:aload_0         
	//   99  215:getfield        #127 <Field com.bumptech.glide.load.engine.cache.DiskCache$Factory diskCacheFactory>
	//  100  218:aload_0         
	//  101  219:getfield        #68  <Field GlideExecutor diskCacheExecutor>
	//  102  222:aload_0         
	//  103  223:getfield        #60  <Field GlideExecutor sourceExecutor>
	//  104  226:invokestatic    #137 <Method GlideExecutor GlideExecutor.newUnlimitedSourceExecutor()>
	//  105  229:invokestatic    #76  <Method GlideExecutor GlideExecutor.newAnimationExecutor()>
	//  106  232:aload_0         
	//  107  233:getfield        #139 <Field boolean isActiveResourceRetentionAllowed>
	//  108  236:invokespecial   #142 <Method void Engine(MemoryCache, com.bumptech.glide.load.engine.cache.DiskCache$Factory, GlideExecutor, GlideExecutor, GlideExecutor, GlideExecutor, boolean)>
	//  109  239:putfield        #132 <Field Engine engine>
		Object obj = ((Object) (defaultRequestListeners));
	//  110  242:aload_0         
	//  111  243:getfield        #144 <Field List defaultRequestListeners>
	//  112  246:astore_3        
		if(obj == null)
	//* 113  247:aload_3         
	//* 114  248:ifnonnull       261
			defaultRequestListeners = Collections.emptyList();
	//  115  251:aload_0         
	//  116  252:invokestatic    #150 <Method List Collections.emptyList()>
	//  117  255:putfield        #144 <Field List defaultRequestListeners>
		else
	//* 118  258:goto            269
			defaultRequestListeners = Collections.unmodifiableList(((List) (obj)));
	//  119  261:aload_0         
	//  120  262:aload_3         
	//  121  263:invokestatic    #154 <Method List Collections.unmodifiableList(List)>
	//  122  266:putfield        #144 <Field List defaultRequestListeners>
		obj = ((Object) (new RequestManagerRetriever(requestManagerFactory)));
	//  123  269:new             #156 <Class RequestManagerRetriever>
	//  124  272:dup             
	//  125  273:aload_0         
	//  126  274:getfield        #158 <Field com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory requestManagerFactory>
	//  127  277:invokespecial   #161 <Method void RequestManagerRetriever(com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory)>
	//  128  280:astore_3        
		return new Glide(context, engine, memoryCache, bitmapPool, arrayPool, ((RequestManagerRetriever) (obj)), connectivityMonitorFactory, logLevel, (RequestOptions)defaultRequestOptions.lock(), defaultTransitionOptions, defaultRequestListeners, isLoggingRequestOriginsEnabled);
	//  129  281:new             #163 <Class Glide>
	//  130  284:dup             
	//  131  285:aload_1         
	//  132  286:aload_0         
	//  133  287:getfield        #132 <Field Engine engine>
	//  134  290:aload_0         
	//  135  291:getfield        #119 <Field MemoryCache memoryCache>
	//  136  294:aload_0         
	//  137  295:getfield        #93  <Field BitmapPool bitmapPool>
	//  138  298:aload_0         
	//  139  299:getfield        #109 <Field ArrayPool arrayPool>
	//  140  302:aload_3         
	//  141  303:aload_0         
	//  142  304:getfield        #88  <Field ConnectivityMonitorFactory connectivityMonitorFactory>
	//  143  307:aload_0         
	//  144  308:getfield        #49  <Field int logLevel>
	//  145  311:aload_0         
	//  146  312:getfield        #54  <Field RequestOptions defaultRequestOptions>
	//  147  315:invokevirtual   #167 <Method com.bumptech.glide.request.BaseRequestOptions RequestOptions.lock()>
	//  148  318:checkcast       #51  <Class RequestOptions>
	//  149  321:aload_0         
	//  150  322:getfield        #47  <Field Map defaultTransitionOptions>
	//  151  325:aload_0         
	//  152  326:getfield        #144 <Field List defaultRequestListeners>
	//  153  329:aload_0         
	//  154  330:getfield        #169 <Field boolean isLoggingRequestOriginsEnabled>
	//  155  333:invokespecial   #172 <Method void Glide(Context, Engine, MemoryCache, BitmapPool, ArrayPool, RequestManagerRetriever, ConnectivityMonitorFactory, int, RequestOptions, Map, List, boolean)>
	//  156  336:areturn         
	}

	void setRequestManagerFactory(com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory requestmanagerfactory)
	{
		requestManagerFactory = requestmanagerfactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #158 <Field com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory requestManagerFactory>
	//    3    5:return          
	}

	private GlideExecutor animationExecutor;
	private ArrayPool arrayPool;
	private BitmapPool bitmapPool;
	private ConnectivityMonitorFactory connectivityMonitorFactory;
	private List defaultRequestListeners;
	private RequestOptions defaultRequestOptions;
	private final Map defaultTransitionOptions = new ArrayMap();
	private GlideExecutor diskCacheExecutor;
	private com.bumptech.glide.load.engine.cache.DiskCache.Factory diskCacheFactory;
	private Engine engine;
	private boolean isActiveResourceRetentionAllowed;
	private boolean isLoggingRequestOriginsEnabled;
	private int logLevel;
	private MemoryCache memoryCache;
	private MemorySizeCalculator memorySizeCalculator;
	private com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory requestManagerFactory;
	private GlideExecutor sourceExecutor;
}
