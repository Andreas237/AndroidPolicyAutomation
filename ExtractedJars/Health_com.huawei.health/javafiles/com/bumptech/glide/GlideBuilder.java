// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import android.content.Context;
import android.support.v4.util.ArrayMap;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool;
import com.bumptech.glide.load.engine.cache.DiskCache;
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
	//    1    1:invokespecial   #37  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #39  <Class ArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #40  <Method void ArrayMap()>
	//    6   12:putfield        #42  <Field Map defaultTransitionOptions>
		logLevel = 4;
	//    7   15:aload_0         
	//    8   16:iconst_4        
	//    9   17:putfield        #44  <Field int logLevel>
		defaultRequestOptions = new RequestOptions();
	//   10   20:aload_0         
	//   11   21:new             #46  <Class RequestOptions>
	//   12   24:dup             
	//   13   25:invokespecial   #47  <Method void RequestOptions()>
	//   14   28:putfield        #49  <Field RequestOptions defaultRequestOptions>
	//   15   31:return          
	}

	public Glide build(Context context)
	{
		if(sourceExecutor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field GlideExecutor sourceExecutor>
	//*   2    4:ifnonnull       14
			sourceExecutor = GlideExecutor.newSourceExecutor();
	//    3    7:aload_0         
	//    4    8:invokestatic    #60  <Method GlideExecutor GlideExecutor.newSourceExecutor()>
	//    5   11:putfield        #54  <Field GlideExecutor sourceExecutor>
		if(diskCacheExecutor == null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #62  <Field GlideExecutor diskCacheExecutor>
	//*   8   18:ifnonnull       28
			diskCacheExecutor = GlideExecutor.newDiskCacheExecutor();
	//    9   21:aload_0         
	//   10   22:invokestatic    #65  <Method GlideExecutor GlideExecutor.newDiskCacheExecutor()>
	//   11   25:putfield        #62  <Field GlideExecutor diskCacheExecutor>
		if(memorySizeCalculator == null)
	//*  12   28:aload_0         
	//*  13   29:getfield        #67  <Field MemorySizeCalculator memorySizeCalculator>
	//*  14   32:ifnonnull       50
			memorySizeCalculator = (new com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder(context)).build();
	//   15   35:aload_0         
	//   16   36:new             #69  <Class com.bumptech.glide.load.engine.cache.MemorySizeCalculator$Builder>
	//   17   39:dup             
	//   18   40:aload_1         
	//   19   41:invokespecial   #72  <Method void com.bumptech.glide.load.engine.cache.MemorySizeCalculator$Builder(Context)>
	//   20   44:invokevirtual   #75  <Method MemorySizeCalculator com.bumptech.glide.load.engine.cache.MemorySizeCalculator$Builder.build()>
	//   21   47:putfield        #67  <Field MemorySizeCalculator memorySizeCalculator>
		if(connectivityMonitorFactory == null)
	//*  22   50:aload_0         
	//*  23   51:getfield        #77  <Field ConnectivityMonitorFactory connectivityMonitorFactory>
	//*  24   54:ifnonnull       68
			connectivityMonitorFactory = ((ConnectivityMonitorFactory) (new DefaultConnectivityMonitorFactory()));
	//   25   57:aload_0         
	//   26   58:new             #79  <Class DefaultConnectivityMonitorFactory>
	//   27   61:dup             
	//   28   62:invokespecial   #80  <Method void DefaultConnectivityMonitorFactory()>
	//   29   65:putfield        #77  <Field ConnectivityMonitorFactory connectivityMonitorFactory>
		if(bitmapPool == null)
	//*  30   68:aload_0         
	//*  31   69:getfield        #82  <Field BitmapPool bitmapPool>
	//*  32   72:ifnonnull       113
		{
			int i = memorySizeCalculator.getBitmapPoolSize();
	//   33   75:aload_0         
	//   34   76:getfield        #67  <Field MemorySizeCalculator memorySizeCalculator>
	//   35   79:invokevirtual   #88  <Method int MemorySizeCalculator.getBitmapPoolSize()>
	//   36   82:istore_2        
			if(i > 0)
	//*  37   83:iload_2         
	//*  38   84:ifle            102
				bitmapPool = ((BitmapPool) (new LruBitmapPool(i)));
	//   39   87:aload_0         
	//   40   88:new             #90  <Class LruBitmapPool>
	//   41   91:dup             
	//   42   92:iload_2         
	//   43   93:invokespecial   #93  <Method void LruBitmapPool(int)>
	//   44   96:putfield        #82  <Field BitmapPool bitmapPool>
			else
	//*  45   99:goto            113
				bitmapPool = ((BitmapPool) (new BitmapPoolAdapter()));
	//   46  102:aload_0         
	//   47  103:new             #95  <Class BitmapPoolAdapter>
	//   48  106:dup             
	//   49  107:invokespecial   #96  <Method void BitmapPoolAdapter()>
	//   50  110:putfield        #82  <Field BitmapPool bitmapPool>
		}
		if(arrayPool == null)
	//*  51  113:aload_0         
	//*  52  114:getfield        #98  <Field ArrayPool arrayPool>
	//*  53  117:ifnonnull       138
			arrayPool = ((ArrayPool) (new LruArrayPool(memorySizeCalculator.getArrayPoolSizeInBytes())));
	//   54  120:aload_0         
	//   55  121:new             #100 <Class LruArrayPool>
	//   56  124:dup             
	//   57  125:aload_0         
	//   58  126:getfield        #67  <Field MemorySizeCalculator memorySizeCalculator>
	//   59  129:invokevirtual   #103 <Method int MemorySizeCalculator.getArrayPoolSizeInBytes()>
	//   60  132:invokespecial   #104 <Method void LruArrayPool(int)>
	//   61  135:putfield        #98  <Field ArrayPool arrayPool>
		if(memoryCache == null)
	//*  62  138:aload_0         
	//*  63  139:getfield        #106 <Field MemoryCache memoryCache>
	//*  64  142:ifnonnull       163
			memoryCache = ((MemoryCache) (new LruResourceCache(memorySizeCalculator.getMemoryCacheSize())));
	//   65  145:aload_0         
	//   66  146:new             #108 <Class LruResourceCache>
	//   67  149:dup             
	//   68  150:aload_0         
	//   69  151:getfield        #67  <Field MemorySizeCalculator memorySizeCalculator>
	//   70  154:invokevirtual   #111 <Method int MemorySizeCalculator.getMemoryCacheSize()>
	//   71  157:invokespecial   #112 <Method void LruResourceCache(int)>
	//   72  160:putfield        #106 <Field MemoryCache memoryCache>
		if(diskCacheFactory == null)
	//*  73  163:aload_0         
	//*  74  164:getfield        #114 <Field com.bumptech.glide.load.engine.cache.DiskCache$Factory diskCacheFactory>
	//*  75  167:ifnonnull       182
			diskCacheFactory = ((com.bumptech.glide.load.engine.cache.DiskCache.Factory) (new InternalCacheDiskCacheFactory(context)));
	//   76  170:aload_0         
	//   77  171:new             #116 <Class InternalCacheDiskCacheFactory>
	//   78  174:dup             
	//   79  175:aload_1         
	//   80  176:invokespecial   #117 <Method void InternalCacheDiskCacheFactory(Context)>
	//   81  179:putfield        #114 <Field com.bumptech.glide.load.engine.cache.DiskCache$Factory diskCacheFactory>
		if(engine == null)
	//*  82  182:aload_0         
	//*  83  183:getfield        #119 <Field Engine engine>
	//*  84  186:ifnonnull       219
			engine = new Engine(memoryCache, diskCacheFactory, diskCacheExecutor, sourceExecutor, GlideExecutor.newUnlimitedSourceExecutor());
	//   85  189:aload_0         
	//   86  190:new             #121 <Class Engine>
	//   87  193:dup             
	//   88  194:aload_0         
	//   89  195:getfield        #106 <Field MemoryCache memoryCache>
	//   90  198:aload_0         
	//   91  199:getfield        #114 <Field com.bumptech.glide.load.engine.cache.DiskCache$Factory diskCacheFactory>
	//   92  202:aload_0         
	//   93  203:getfield        #62  <Field GlideExecutor diskCacheExecutor>
	//   94  206:aload_0         
	//   95  207:getfield        #54  <Field GlideExecutor sourceExecutor>
	//   96  210:invokestatic    #124 <Method GlideExecutor GlideExecutor.newUnlimitedSourceExecutor()>
	//   97  213:invokespecial   #127 <Method void Engine(MemoryCache, com.bumptech.glide.load.engine.cache.DiskCache$Factory, GlideExecutor, GlideExecutor, GlideExecutor)>
	//   98  216:putfield        #119 <Field Engine engine>
		RequestManagerRetriever requestmanagerretriever = new RequestManagerRetriever(requestManagerFactory);
	//   99  219:new             #129 <Class RequestManagerRetriever>
	//  100  222:dup             
	//  101  223:aload_0         
	//  102  224:getfield        #131 <Field com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory requestManagerFactory>
	//  103  227:invokespecial   #134 <Method void RequestManagerRetriever(com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory)>
	//  104  230:astore_3        
		return new Glide(context, engine, memoryCache, bitmapPool, arrayPool, requestmanagerretriever, connectivityMonitorFactory, logLevel, defaultRequestOptions.lock(), defaultTransitionOptions);
	//  105  231:new             #136 <Class Glide>
	//  106  234:dup             
	//  107  235:aload_1         
	//  108  236:aload_0         
	//  109  237:getfield        #119 <Field Engine engine>
	//  110  240:aload_0         
	//  111  241:getfield        #106 <Field MemoryCache memoryCache>
	//  112  244:aload_0         
	//  113  245:getfield        #82  <Field BitmapPool bitmapPool>
	//  114  248:aload_0         
	//  115  249:getfield        #98  <Field ArrayPool arrayPool>
	//  116  252:aload_3         
	//  117  253:aload_0         
	//  118  254:getfield        #77  <Field ConnectivityMonitorFactory connectivityMonitorFactory>
	//  119  257:aload_0         
	//  120  258:getfield        #44  <Field int logLevel>
	//  121  261:aload_0         
	//  122  262:getfield        #49  <Field RequestOptions defaultRequestOptions>
	//  123  265:invokevirtual   #140 <Method RequestOptions RequestOptions.lock()>
	//  124  268:aload_0         
	//  125  269:getfield        #42  <Field Map defaultTransitionOptions>
	//  126  272:invokespecial   #143 <Method void Glide(Context, Engine, MemoryCache, BitmapPool, ArrayPool, RequestManagerRetriever, ConnectivityMonitorFactory, int, RequestOptions, Map)>
	//  127  275:areturn         
	}

	public GlideBuilder setArrayPool(ArrayPool arraypool)
	{
		arrayPool = arraypool;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #98  <Field ArrayPool arrayPool>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GlideBuilder setBitmapPool(BitmapPool bitmappool)
	{
		bitmapPool = bitmappool;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #82  <Field BitmapPool bitmapPool>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GlideBuilder setConnectivityMonitorFactory(ConnectivityMonitorFactory connectivitymonitorfactory)
	{
		connectivityMonitorFactory = connectivitymonitorfactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field ConnectivityMonitorFactory connectivityMonitorFactory>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GlideBuilder setDecodeFormat(DecodeFormat decodeformat)
	{
		defaultRequestOptions = defaultRequestOptions.apply((new RequestOptions()).format(decodeformat));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #49  <Field RequestOptions defaultRequestOptions>
	//    3    5:new             #46  <Class RequestOptions>
	//    4    8:dup             
	//    5    9:invokespecial   #47  <Method void RequestOptions()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #156 <Method RequestOptions RequestOptions.format(DecodeFormat)>
	//    8   16:invokevirtual   #160 <Method RequestOptions RequestOptions.apply(RequestOptions)>
	//    9   19:putfield        #49  <Field RequestOptions defaultRequestOptions>
		return this;
	//   10   22:aload_0         
	//   11   23:areturn         
	}

	public GlideBuilder setDefaultRequestOptions(RequestOptions requestoptions)
	{
		defaultRequestOptions = requestoptions;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field RequestOptions defaultRequestOptions>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GlideBuilder setDefaultTransitionOptions(Class class1, TransitionOptions transitionoptions)
	{
		defaultTransitionOptions.put(((Object) (class1)), ((Object) (transitionoptions)));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Map defaultTransitionOptions>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #172 <Method Object Map.put(Object, Object)>
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
	//    2    2:putfield        #114 <Field com.bumptech.glide.load.engine.cache.DiskCache$Factory diskCacheFactory>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GlideBuilder setDiskCache(final DiskCache diskCache)
	{
		return setDiskCache(new com.bumptech.glide.load.engine.cache.DiskCache.Factory() {

			public DiskCache build()
			{
				return diskCache;
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field DiskCache val$diskCache>
			//    2    4:areturn         
			}

			final GlideBuilder this$0;
			final DiskCache val$diskCache;

			
			{
				this$0 = GlideBuilder.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GlideBuilder this$0>
				diskCache = diskcache;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field DiskCache val$diskCache>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #6   <Class GlideBuilder$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #181 <Method void GlideBuilder$1(GlideBuilder, DiskCache)>
	//    6   10:invokevirtual   #183 <Method GlideBuilder setDiskCache(com.bumptech.glide.load.engine.cache.DiskCache$Factory)>
	//    7   13:areturn         
	}

	public GlideBuilder setDiskCacheExecutor(GlideExecutor glideexecutor)
	{
		diskCacheExecutor = glideexecutor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field GlideExecutor diskCacheExecutor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	GlideBuilder setEngine(Engine engine1)
	{
		engine = engine1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #119 <Field Engine engine>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GlideBuilder setLogLevel(int i)
	{
		if(i < 2 || i > 6)
	//*   0    0:iload_1         
	//*   1    1:iconst_2        
	//*   2    2:icmplt          11
	//*   3    5:iload_1         
	//*   4    6:bipush          6
	//*   5    8:icmple          21
		{
			throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
	//    6   11:new             #191 <Class IllegalArgumentException>
	//    7   14:dup             
	//    8   15:ldc1            #193 <String "Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR">
	//    9   17:invokespecial   #196 <Method void IllegalArgumentException(String)>
	//   10   20:athrow          
		} else
		{
			logLevel = i;
	//   11   21:aload_0         
	//   12   22:iload_1         
	//   13   23:putfield        #44  <Field int logLevel>
			return this;
	//   14   26:aload_0         
	//   15   27:areturn         
		}
	}

	public GlideBuilder setMemoryCache(MemoryCache memorycache)
	{
		memoryCache = memorycache;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field MemoryCache memoryCache>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GlideBuilder setMemorySizeCalculator(com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder builder)
	{
		return setMemorySizeCalculator(builder.build());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #75  <Method MemorySizeCalculator com.bumptech.glide.load.engine.cache.MemorySizeCalculator$Builder.build()>
	//    3    5:invokevirtual   #203 <Method GlideBuilder setMemorySizeCalculator(MemorySizeCalculator)>
	//    4    8:areturn         
	}

	public GlideBuilder setMemorySizeCalculator(MemorySizeCalculator memorysizecalculator)
	{
		memorySizeCalculator = memorysizecalculator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field MemorySizeCalculator memorySizeCalculator>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	GlideBuilder setRequestManagerFactory(com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory requestmanagerfactory)
	{
		requestManagerFactory = requestmanagerfactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #131 <Field com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory requestManagerFactory>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GlideBuilder setResizeExecutor(GlideExecutor glideexecutor)
	{
		sourceExecutor = glideexecutor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field GlideExecutor sourceExecutor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private ArrayPool arrayPool;
	private BitmapPool bitmapPool;
	private ConnectivityMonitorFactory connectivityMonitorFactory;
	private RequestOptions defaultRequestOptions;
	private final Map defaultTransitionOptions = new ArrayMap();
	private GlideExecutor diskCacheExecutor;
	private com.bumptech.glide.load.engine.cache.DiskCache.Factory diskCacheFactory;
	private Engine engine;
	private int logLevel;
	private MemoryCache memoryCache;
	private MemorySizeCalculator memorySizeCalculator;
	private com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory requestManagerFactory;
	private GlideExecutor sourceExecutor;
}
