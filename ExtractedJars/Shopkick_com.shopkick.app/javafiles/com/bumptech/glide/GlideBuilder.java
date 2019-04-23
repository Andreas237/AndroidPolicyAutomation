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
import java.util.Map;

// Referenced classes of package com.bumptech.glide:
//			Glide, TransitionOptions

public final class GlideBuilder
{

	public GlideBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #40  <Class ArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #41  <Method void ArrayMap()>
	//    6   12:putfield        #43  <Field Map defaultTransitionOptions>
		logLevel = 4;
	//    7   15:aload_0         
	//    8   16:iconst_4        
	//    9   17:putfield        #45  <Field int logLevel>
		defaultRequestOptions = new RequestOptions();
	//   10   20:aload_0         
	//   11   21:new             #47  <Class RequestOptions>
	//   12   24:dup             
	//   13   25:invokespecial   #48  <Method void RequestOptions()>
	//   14   28:putfield        #50  <Field RequestOptions defaultRequestOptions>
	//   15   31:return          
	}

	Glide build(Context context)
	{
		if(sourceExecutor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field GlideExecutor sourceExecutor>
	//*   2    4:ifnonnull       14
			sourceExecutor = GlideExecutor.newSourceExecutor();
	//    3    7:aload_0         
	//    4    8:invokestatic    #62  <Method GlideExecutor GlideExecutor.newSourceExecutor()>
	//    5   11:putfield        #56  <Field GlideExecutor sourceExecutor>
		if(diskCacheExecutor == null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #64  <Field GlideExecutor diskCacheExecutor>
	//*   8   18:ifnonnull       28
			diskCacheExecutor = GlideExecutor.newDiskCacheExecutor();
	//    9   21:aload_0         
	//   10   22:invokestatic    #67  <Method GlideExecutor GlideExecutor.newDiskCacheExecutor()>
	//   11   25:putfield        #64  <Field GlideExecutor diskCacheExecutor>
		if(animationExecutor == null)
	//*  12   28:aload_0         
	//*  13   29:getfield        #69  <Field GlideExecutor animationExecutor>
	//*  14   32:ifnonnull       42
			animationExecutor = GlideExecutor.newAnimationExecutor();
	//   15   35:aload_0         
	//   16   36:invokestatic    #72  <Method GlideExecutor GlideExecutor.newAnimationExecutor()>
	//   17   39:putfield        #69  <Field GlideExecutor animationExecutor>
		if(memorySizeCalculator == null)
	//*  18   42:aload_0         
	//*  19   43:getfield        #74  <Field MemorySizeCalculator memorySizeCalculator>
	//*  20   46:ifnonnull       64
			memorySizeCalculator = (new com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder(context)).build();
	//   21   49:aload_0         
	//   22   50:new             #76  <Class com.bumptech.glide.load.engine.cache.MemorySizeCalculator$Builder>
	//   23   53:dup             
	//   24   54:aload_1         
	//   25   55:invokespecial   #79  <Method void com.bumptech.glide.load.engine.cache.MemorySizeCalculator$Builder(Context)>
	//   26   58:invokevirtual   #82  <Method MemorySizeCalculator com.bumptech.glide.load.engine.cache.MemorySizeCalculator$Builder.build()>
	//   27   61:putfield        #74  <Field MemorySizeCalculator memorySizeCalculator>
		if(connectivityMonitorFactory == null)
	//*  28   64:aload_0         
	//*  29   65:getfield        #84  <Field ConnectivityMonitorFactory connectivityMonitorFactory>
	//*  30   68:ifnonnull       82
			connectivityMonitorFactory = ((ConnectivityMonitorFactory) (new DefaultConnectivityMonitorFactory()));
	//   31   71:aload_0         
	//   32   72:new             #86  <Class DefaultConnectivityMonitorFactory>
	//   33   75:dup             
	//   34   76:invokespecial   #87  <Method void DefaultConnectivityMonitorFactory()>
	//   35   79:putfield        #84  <Field ConnectivityMonitorFactory connectivityMonitorFactory>
		if(bitmapPool == null)
	//*  36   82:aload_0         
	//*  37   83:getfield        #89  <Field BitmapPool bitmapPool>
	//*  38   86:ifnonnull       128
		{
			int i = memorySizeCalculator.getBitmapPoolSize();
	//   39   89:aload_0         
	//   40   90:getfield        #74  <Field MemorySizeCalculator memorySizeCalculator>
	//   41   93:invokevirtual   #95  <Method int MemorySizeCalculator.getBitmapPoolSize()>
	//   42   96:istore_2        
			if(i > 0)
	//*  43   97:iload_2         
	//*  44   98:ifle            117
				bitmapPool = ((BitmapPool) (new LruBitmapPool(i)));
	//   45  101:aload_0         
	//   46  102:new             #97  <Class LruBitmapPool>
	//   47  105:dup             
	//   48  106:iload_2         
	//   49  107:i2l             
	//   50  108:invokespecial   #100 <Method void LruBitmapPool(long)>
	//   51  111:putfield        #89  <Field BitmapPool bitmapPool>
			else
	//*  52  114:goto            128
				bitmapPool = ((BitmapPool) (new BitmapPoolAdapter()));
	//   53  117:aload_0         
	//   54  118:new             #102 <Class BitmapPoolAdapter>
	//   55  121:dup             
	//   56  122:invokespecial   #103 <Method void BitmapPoolAdapter()>
	//   57  125:putfield        #89  <Field BitmapPool bitmapPool>
		}
		if(arrayPool == null)
	//*  58  128:aload_0         
	//*  59  129:getfield        #105 <Field ArrayPool arrayPool>
	//*  60  132:ifnonnull       153
			arrayPool = ((ArrayPool) (new LruArrayPool(memorySizeCalculator.getArrayPoolSizeInBytes())));
	//   61  135:aload_0         
	//   62  136:new             #107 <Class LruArrayPool>
	//   63  139:dup             
	//   64  140:aload_0         
	//   65  141:getfield        #74  <Field MemorySizeCalculator memorySizeCalculator>
	//   66  144:invokevirtual   #110 <Method int MemorySizeCalculator.getArrayPoolSizeInBytes()>
	//   67  147:invokespecial   #113 <Method void LruArrayPool(int)>
	//   68  150:putfield        #105 <Field ArrayPool arrayPool>
		if(memoryCache == null)
	//*  69  153:aload_0         
	//*  70  154:getfield        #115 <Field MemoryCache memoryCache>
	//*  71  157:ifnonnull       179
			memoryCache = ((MemoryCache) (new LruResourceCache(memorySizeCalculator.getMemoryCacheSize())));
	//   72  160:aload_0         
	//   73  161:new             #117 <Class LruResourceCache>
	//   74  164:dup             
	//   75  165:aload_0         
	//   76  166:getfield        #74  <Field MemorySizeCalculator memorySizeCalculator>
	//   77  169:invokevirtual   #120 <Method int MemorySizeCalculator.getMemoryCacheSize()>
	//   78  172:i2l             
	//   79  173:invokespecial   #121 <Method void LruResourceCache(long)>
	//   80  176:putfield        #115 <Field MemoryCache memoryCache>
		if(diskCacheFactory == null)
	//*  81  179:aload_0         
	//*  82  180:getfield        #123 <Field com.bumptech.glide.load.engine.cache.DiskCache$Factory diskCacheFactory>
	//*  83  183:ifnonnull       198
			diskCacheFactory = ((com.bumptech.glide.load.engine.cache.DiskCache.Factory) (new InternalCacheDiskCacheFactory(context)));
	//   84  186:aload_0         
	//   85  187:new             #125 <Class InternalCacheDiskCacheFactory>
	//   86  190:dup             
	//   87  191:aload_1         
	//   88  192:invokespecial   #126 <Method void InternalCacheDiskCacheFactory(Context)>
	//   89  195:putfield        #123 <Field com.bumptech.glide.load.engine.cache.DiskCache$Factory diskCacheFactory>
		if(engine == null)
	//*  90  198:aload_0         
	//*  91  199:getfield        #128 <Field Engine engine>
	//*  92  202:ifnonnull       242
			engine = new Engine(memoryCache, diskCacheFactory, diskCacheExecutor, sourceExecutor, GlideExecutor.newUnlimitedSourceExecutor(), GlideExecutor.newAnimationExecutor(), isActiveResourceRetentionAllowed);
	//   93  205:aload_0         
	//   94  206:new             #130 <Class Engine>
	//   95  209:dup             
	//   96  210:aload_0         
	//   97  211:getfield        #115 <Field MemoryCache memoryCache>
	//   98  214:aload_0         
	//   99  215:getfield        #123 <Field com.bumptech.glide.load.engine.cache.DiskCache$Factory diskCacheFactory>
	//  100  218:aload_0         
	//  101  219:getfield        #64  <Field GlideExecutor diskCacheExecutor>
	//  102  222:aload_0         
	//  103  223:getfield        #56  <Field GlideExecutor sourceExecutor>
	//  104  226:invokestatic    #133 <Method GlideExecutor GlideExecutor.newUnlimitedSourceExecutor()>
	//  105  229:invokestatic    #72  <Method GlideExecutor GlideExecutor.newAnimationExecutor()>
	//  106  232:aload_0         
	//  107  233:getfield        #135 <Field boolean isActiveResourceRetentionAllowed>
	//  108  236:invokespecial   #138 <Method void Engine(MemoryCache, com.bumptech.glide.load.engine.cache.DiskCache$Factory, GlideExecutor, GlideExecutor, GlideExecutor, GlideExecutor, boolean)>
	//  109  239:putfield        #128 <Field Engine engine>
		RequestManagerRetriever requestmanagerretriever = new RequestManagerRetriever(requestManagerFactory);
	//  110  242:new             #140 <Class RequestManagerRetriever>
	//  111  245:dup             
	//  112  246:aload_0         
	//  113  247:getfield        #142 <Field com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory requestManagerFactory>
	//  114  250:invokespecial   #145 <Method void RequestManagerRetriever(com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory)>
	//  115  253:astore_3        
		return new Glide(context, engine, memoryCache, bitmapPool, arrayPool, requestmanagerretriever, connectivityMonitorFactory, logLevel, defaultRequestOptions.lock(), defaultTransitionOptions);
	//  116  254:new             #147 <Class Glide>
	//  117  257:dup             
	//  118  258:aload_1         
	//  119  259:aload_0         
	//  120  260:getfield        #128 <Field Engine engine>
	//  121  263:aload_0         
	//  122  264:getfield        #115 <Field MemoryCache memoryCache>
	//  123  267:aload_0         
	//  124  268:getfield        #89  <Field BitmapPool bitmapPool>
	//  125  271:aload_0         
	//  126  272:getfield        #105 <Field ArrayPool arrayPool>
	//  127  275:aload_3         
	//  128  276:aload_0         
	//  129  277:getfield        #84  <Field ConnectivityMonitorFactory connectivityMonitorFactory>
	//  130  280:aload_0         
	//  131  281:getfield        #45  <Field int logLevel>
	//  132  284:aload_0         
	//  133  285:getfield        #50  <Field RequestOptions defaultRequestOptions>
	//  134  288:invokevirtual   #151 <Method RequestOptions RequestOptions.lock()>
	//  135  291:aload_0         
	//  136  292:getfield        #43  <Field Map defaultTransitionOptions>
	//  137  295:invokespecial   #154 <Method void Glide(Context, Engine, MemoryCache, BitmapPool, ArrayPool, RequestManagerRetriever, ConnectivityMonitorFactory, int, RequestOptions, Map)>
	//  138  298:areturn         
	}

	public GlideBuilder setAnimationExecutor(GlideExecutor glideexecutor)
	{
		animationExecutor = glideexecutor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field GlideExecutor animationExecutor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GlideBuilder setArrayPool(ArrayPool arraypool)
	{
		arrayPool = arraypool;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #105 <Field ArrayPool arrayPool>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GlideBuilder setBitmapPool(BitmapPool bitmappool)
	{
		bitmapPool = bitmappool;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #89  <Field BitmapPool bitmapPool>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GlideBuilder setConnectivityMonitorFactory(ConnectivityMonitorFactory connectivitymonitorfactory)
	{
		connectivityMonitorFactory = connectivitymonitorfactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field ConnectivityMonitorFactory connectivityMonitorFactory>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GlideBuilder setDefaultRequestOptions(RequestOptions requestoptions)
	{
		defaultRequestOptions = requestoptions;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field RequestOptions defaultRequestOptions>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GlideBuilder setDefaultTransitionOptions(Class class1, TransitionOptions transitionoptions)
	{
		defaultTransitionOptions.put(((Object) (class1)), ((Object) (transitionoptions)));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Map defaultTransitionOptions>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #174 <Method Object Map.put(Object, Object)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public GlideBuilder setDiskCache(com.bumptech.glide.load.engine.cache.DiskCache.Factory factory)
	{
		diskCacheFactory = factory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #123 <Field com.bumptech.glide.load.engine.cache.DiskCache$Factory diskCacheFactory>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GlideBuilder setDiskCacheExecutor(GlideExecutor glideexecutor)
	{
		diskCacheExecutor = glideexecutor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field GlideExecutor diskCacheExecutor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	GlideBuilder setEngine(Engine engine1)
	{
		engine = engine1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #128 <Field Engine engine>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GlideBuilder setIsActiveResourceRetentionAllowed(boolean flag)
	{
		isActiveResourceRetentionAllowed = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #135 <Field boolean isActiveResourceRetentionAllowed>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GlideBuilder setLogLevel(int i)
	{
		if(i >= 2 && i <= 6)
	//*   0    0:iload_1         
	//*   1    1:iconst_2        
	//*   2    2:icmplt          18
	//*   3    5:iload_1         
	//*   4    6:bipush          6
	//*   5    8:icmpgt          18
		{
			logLevel = i;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #45  <Field int logLevel>
			return this;
	//    9   16:aload_0         
	//   10   17:areturn         
		} else
		{
			throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
	//   11   18:new             #187 <Class IllegalArgumentException>
	//   12   21:dup             
	//   13   22:ldc1            #189 <String "Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR">
	//   14   24:invokespecial   #192 <Method void IllegalArgumentException(String)>
	//   15   27:athrow          
		}
	}

	public GlideBuilder setMemoryCache(MemoryCache memorycache)
	{
		memoryCache = memorycache;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #115 <Field MemoryCache memoryCache>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GlideBuilder setMemorySizeCalculator(com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder builder)
	{
		return setMemorySizeCalculator(builder.build());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #82  <Method MemorySizeCalculator com.bumptech.glide.load.engine.cache.MemorySizeCalculator$Builder.build()>
	//    3    5:invokevirtual   #199 <Method GlideBuilder setMemorySizeCalculator(MemorySizeCalculator)>
	//    4    8:areturn         
	}

	public GlideBuilder setMemorySizeCalculator(MemorySizeCalculator memorysizecalculator)
	{
		memorySizeCalculator = memorysizecalculator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #74  <Field MemorySizeCalculator memorySizeCalculator>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	void setRequestManagerFactory(com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory requestmanagerfactory)
	{
		requestManagerFactory = requestmanagerfactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #142 <Field com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory requestManagerFactory>
	//    3    5:return          
	}

	public GlideBuilder setResizeExecutor(GlideExecutor glideexecutor)
	{
		return setSourceExecutor(glideexecutor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #205 <Method GlideBuilder setSourceExecutor(GlideExecutor)>
	//    3    5:areturn         
	}

	public GlideBuilder setSourceExecutor(GlideExecutor glideexecutor)
	{
		sourceExecutor = glideexecutor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field GlideExecutor sourceExecutor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private GlideExecutor animationExecutor;
	private ArrayPool arrayPool;
	private BitmapPool bitmapPool;
	private ConnectivityMonitorFactory connectivityMonitorFactory;
	private RequestOptions defaultRequestOptions;
	private final Map defaultTransitionOptions = new ArrayMap();
	private GlideExecutor diskCacheExecutor;
	private com.bumptech.glide.load.engine.cache.DiskCache.Factory diskCacheFactory;
	private Engine engine;
	private boolean isActiveResourceRetentionAllowed;
	private int logLevel;
	private MemoryCache memoryCache;
	private MemorySizeCalculator memorySizeCalculator;
	private com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory requestManagerFactory;
	private GlideExecutor sourceExecutor;
}
