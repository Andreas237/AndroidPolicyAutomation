// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.*;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCacheAdapter;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.*;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.bumptech.glide.load.engine:
//			EngineJobListener, ActiveResources, EngineKeyFactory, Jobs, 
//			ResourceRecycler, EngineResource, EngineJob, DiskCacheStrategy, 
//			Resource, DecodeJob, EngineKey

public class Engine
	implements EngineJobListener, com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener, EngineResource.ResourceListener
{
	static class DecodeJobFactory
	{

		DecodeJob build(GlideContext glidecontext, Object obj, EngineKey enginekey, Key key, int i, int j, Class class1, 
				Class class2, Priority priority, DiskCacheStrategy diskcachestrategy, Map map, boolean flag, boolean flag1, boolean flag2, 
				Options options, DecodeJob.Callback callback)
		{
			DecodeJob decodejob = (DecodeJob)Preconditions.checkNotNull(((Object) ((DecodeJob)pool.acquire())));
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field android.support.v4.util.Pools$Pool pool>
		//    2    4:invokeinterface #44  <Method Object android.support.v4.util.Pools$Pool.acquire()>
		//    3    9:checkcast       #46  <Class DecodeJob>
		//    4   12:invokestatic    #52  <Method Object Preconditions.checkNotNull(Object)>
		//    5   15:checkcast       #46  <Class DecodeJob>
		//    6   18:astore          18
			int k = creationOrder;
		//    7   20:aload_0         
		//    8   21:getfield        #54  <Field int creationOrder>
		//    9   24:istore          17
			creationOrder = k + 1;
		//   10   26:aload_0         
		//   11   27:iload           17
		//   12   29:iconst_1        
		//   13   30:iadd            
		//   14   31:putfield        #54  <Field int creationOrder>
			return decodejob.init(glidecontext, obj, enginekey, key, i, j, class1, class2, priority, diskcachestrategy, map, flag, flag1, flag2, options, callback, k);
		//   15   34:aload           18
		//   16   36:aload_1         
		//   17   37:aload_2         
		//   18   38:aload_3         
		//   19   39:aload           4
		//   20   41:iload           5
		//   21   43:iload           6
		//   22   45:aload           7
		//   23   47:aload           8
		//   24   49:aload           9
		//   25   51:aload           10
		//   26   53:aload           11
		//   27   55:iload           12
		//   28   57:iload           13
		//   29   59:iload           14
		//   30   61:aload           15
		//   31   63:aload           16
		//   32   65:iload           17
		//   33   67:invokevirtual   #58  <Method DecodeJob DecodeJob.init(GlideContext, Object, EngineKey, Key, int, int, Class, Class, Priority, DiskCacheStrategy, Map, boolean, boolean, boolean, Options, DecodeJob$Callback, int)>
		//   34   70:areturn         
		}

		private int creationOrder;
		final DecodeJob.DiskCacheProvider diskCacheProvider;
		final android.support.v4.util.Pools.Pool pool = FactoryPools.simple(150, new _cls1());

		DecodeJobFactory(DecodeJob.DiskCacheProvider diskcacheprovider)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:sipush          150
		//    4    8:new             #9   <Class Engine$DecodeJobFactory$1>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:invokespecial   #25  <Method void Engine$DecodeJobFactory$1(Engine$DecodeJobFactory)>
		//    8   16:invokestatic    #31  <Method android.support.v4.util.Pools$Pool FactoryPools.simple(int, com.bumptech.glide.util.pool.FactoryPools$Factory)>
		//    9   19:putfield        #33  <Field android.support.v4.util.Pools$Pool pool>
			diskCacheProvider = diskcacheprovider;
		//   10   22:aload_0         
		//   11   23:aload_1         
		//   12   24:putfield        #35  <Field DecodeJob$DiskCacheProvider diskCacheProvider>
		//   13   27:return          
		}
	}

	static class EngineJobFactory
	{

		private static void shutdownAndAwaitTermination(ExecutorService executorservice)
		{
			executorservice.shutdown();
		//    0    0:aload_0         
		//    1    1:invokeinterface #56  <Method void ExecutorService.shutdown()>
			try
			{
				if(executorservice.awaitTermination(5L, TimeUnit.SECONDS))
					break MISSING_BLOCK_LABEL_54;
		//    2    6:aload_0         
		//    3    7:ldc2w           #57  <Long 5L>
		//    4   10:getstatic       #64  <Field TimeUnit TimeUnit.SECONDS>
		//    5   13:invokeinterface #68  <Method boolean ExecutorService.awaitTermination(long, TimeUnit)>
		//    6   18:ifne            54
				executorservice.shutdownNow();
		//    7   21:aload_0         
		//    8   22:invokeinterface #72  <Method java.util.List ExecutorService.shutdownNow()>
		//    9   27:pop             
				if(executorservice.awaitTermination(5L, TimeUnit.SECONDS))
		//*  10   28:aload_0         
		//*  11   29:ldc2w           #57  <Long 5L>
		//*  12   32:getstatic       #64  <Field TimeUnit TimeUnit.SECONDS>
		//*  13   35:invokeinterface #68  <Method boolean ExecutorService.awaitTermination(long, TimeUnit)>
		//*  14   40:ifeq            44
					return;
		//   15   43:return          
			}
		//*  16   44:new             #74  <Class RuntimeException>
		//*  17   47:dup             
		//*  18   48:ldc1            #76  <String "Failed to shutdown">
		//*  19   50:invokespecial   #79  <Method void RuntimeException(String)>
		//*  20   53:athrow          
		//*  21   54:return          
			// Misplaced declaration of an exception variable
			catch(ExecutorService executorservice)
		//*  22   55:astore_0        
			{
				throw new RuntimeException(((Throwable) (executorservice)));
		//   23   56:new             #74  <Class RuntimeException>
		//   24   59:dup             
		//   25   60:aload_0         
		//   26   61:invokespecial   #82  <Method void RuntimeException(Throwable)>
		//   27   64:athrow          
			}
			throw new RuntimeException("Failed to shutdown");
		}

		EngineJob build(Key key, boolean flag, boolean flag1, boolean flag2, boolean flag3)
		{
			return ((EngineJob)Preconditions.checkNotNull(((Object) ((EngineJob)pool.acquire())))).init(key, flag, flag1, flag2, flag3);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field android.support.v4.util.Pools$Pool pool>
		//    2    4:invokeinterface #90  <Method Object android.support.v4.util.Pools$Pool.acquire()>
		//    3    9:checkcast       #92  <Class EngineJob>
		//    4   12:invokestatic    #98  <Method Object Preconditions.checkNotNull(Object)>
		//    5   15:checkcast       #92  <Class EngineJob>
		//    6   18:aload_1         
		//    7   19:iload_2         
		//    8   20:iload_3         
		//    9   21:iload           4
		//   10   23:iload           5
		//   11   25:invokevirtual   #101 <Method EngineJob EngineJob.init(Key, boolean, boolean, boolean, boolean)>
		//   12   28:areturn         
		}

		void shutdown()
		{
			shutdownAndAwaitTermination(((ExecutorService) (diskCacheExecutor)));
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field GlideExecutor diskCacheExecutor>
		//    2    4:invokestatic    #105 <Method void shutdownAndAwaitTermination(ExecutorService)>
			shutdownAndAwaitTermination(((ExecutorService) (sourceExecutor)));
		//    3    7:aload_0         
		//    4    8:getfield        #40  <Field GlideExecutor sourceExecutor>
		//    5   11:invokestatic    #105 <Method void shutdownAndAwaitTermination(ExecutorService)>
			shutdownAndAwaitTermination(((ExecutorService) (sourceUnlimitedExecutor)));
		//    6   14:aload_0         
		//    7   15:getfield        #42  <Field GlideExecutor sourceUnlimitedExecutor>
		//    8   18:invokestatic    #105 <Method void shutdownAndAwaitTermination(ExecutorService)>
			shutdownAndAwaitTermination(((ExecutorService) (animationExecutor)));
		//    9   21:aload_0         
		//   10   22:getfield        #44  <Field GlideExecutor animationExecutor>
		//   11   25:invokestatic    #105 <Method void shutdownAndAwaitTermination(ExecutorService)>
		//   12   28:return          
		}

		final GlideExecutor animationExecutor;
		final GlideExecutor diskCacheExecutor;
		final EngineJobListener listener;
		final android.support.v4.util.Pools.Pool pool = FactoryPools.simple(150, new _cls1());
		final GlideExecutor sourceExecutor;
		final GlideExecutor sourceUnlimitedExecutor;

		EngineJobFactory(GlideExecutor glideexecutor, GlideExecutor glideexecutor1, GlideExecutor glideexecutor2, GlideExecutor glideexecutor3, EngineJobListener enginejoblistener)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:sipush          150
		//    4    8:new             #9   <Class Engine$EngineJobFactory$1>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:invokespecial   #28  <Method void Engine$EngineJobFactory$1(Engine$EngineJobFactory)>
		//    8   16:invokestatic    #34  <Method android.support.v4.util.Pools$Pool FactoryPools.simple(int, com.bumptech.glide.util.pool.FactoryPools$Factory)>
		//    9   19:putfield        #36  <Field android.support.v4.util.Pools$Pool pool>
			diskCacheExecutor = glideexecutor;
		//   10   22:aload_0         
		//   11   23:aload_1         
		//   12   24:putfield        #38  <Field GlideExecutor diskCacheExecutor>
			sourceExecutor = glideexecutor1;
		//   13   27:aload_0         
		//   14   28:aload_2         
		//   15   29:putfield        #40  <Field GlideExecutor sourceExecutor>
			sourceUnlimitedExecutor = glideexecutor2;
		//   16   32:aload_0         
		//   17   33:aload_3         
		//   18   34:putfield        #42  <Field GlideExecutor sourceUnlimitedExecutor>
			animationExecutor = glideexecutor3;
		//   19   37:aload_0         
		//   20   38:aload           4
		//   21   40:putfield        #44  <Field GlideExecutor animationExecutor>
			listener = enginejoblistener;
		//   22   43:aload_0         
		//   23   44:aload           5
		//   24   46:putfield        #46  <Field EngineJobListener listener>
		//   25   49:return          
		}
	}

	private static class LazyDiskCacheProvider
		implements DecodeJob.DiskCacheProvider
	{

		void clearDiskCacheIfCreated()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			DiskCache diskcache = diskCache;
		//    2    2:aload_0         
		//    3    3:getfield        #25  <Field DiskCache diskCache>
		//    4    6:astore_1        
			if(diskcache != null)
				break MISSING_BLOCK_LABEL_14;
		//    5    7:aload_1         
		//    6    8:ifnonnull       14
			this;
		//    7   11:aload_0         
			JVM INSTR monitorexit ;
		//    8   12:monitorexit     
			return;
		//    9   13:return          
			diskCache.clear();
		//   10   14:aload_0         
		//   11   15:getfield        #25  <Field DiskCache diskCache>
		//   12   18:invokeinterface #30  <Method void DiskCache.clear()>
			this;
		//   13   23:aload_0         
			JVM INSTR monitorexit ;
		//   14   24:monitorexit     
			return;
		//   15   25:return          
			Exception exception;
			exception;
		//   16   26:astore_1        
		//*  17   27:aload_0         
			throw exception;
		//   18   28:monitorexit     
		//   19   29:aload_1         
		//   20   30:athrow          
		}

		public DiskCache getDiskCache()
		{
			if(diskCache != null)
				break MISSING_BLOCK_LABEL_57;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field DiskCache diskCache>
		//    2    4:ifnonnull       57
			this;
		//    3    7:aload_0         
			JVM INSTR monitorenter ;
		//    4    8:monitorenter    
			if(diskCache == null)
		//*   5    9:aload_0         
		//*   6   10:getfield        #25  <Field DiskCache diskCache>
		//*   7   13:ifnonnull       29
				diskCache = factory.build();
		//    8   16:aload_0         
		//    9   17:aload_0         
		//   10   18:getfield        #20  <Field com.bumptech.glide.load.engine.cache.DiskCache$Factory factory>
		//   11   21:invokeinterface #38  <Method DiskCache com.bumptech.glide.load.engine.cache.DiskCache$Factory.build()>
		//   12   26:putfield        #25  <Field DiskCache diskCache>
			if(diskCache == null)
		//*  13   29:aload_0         
		//*  14   30:getfield        #25  <Field DiskCache diskCache>
		//*  15   33:ifnonnull       47
				diskCache = ((DiskCache) (new DiskCacheAdapter()));
		//   16   36:aload_0         
		//   17   37:new             #40  <Class DiskCacheAdapter>
		//   18   40:dup             
		//   19   41:invokespecial   #41  <Method void DiskCacheAdapter()>
		//   20   44:putfield        #25  <Field DiskCache diskCache>
			this;
		//   21   47:aload_0         
			JVM INSTR monitorexit ;
		//   22   48:monitorexit     
			break MISSING_BLOCK_LABEL_57;
		//   23   49:goto            57
			Exception exception;
			exception;
		//   24   52:astore_1        
			this;
		//   25   53:aload_0         
			JVM INSTR monitorexit ;
		//   26   54:monitorexit     
			throw exception;
		//   27   55:aload_1         
		//   28   56:athrow          
			return diskCache;
		//   29   57:aload_0         
		//   30   58:getfield        #25  <Field DiskCache diskCache>
		//   31   61:areturn         
		}

		private volatile DiskCache diskCache;
		private final com.bumptech.glide.load.engine.cache.DiskCache.Factory factory;

		LazyDiskCacheProvider(com.bumptech.glide.load.engine.cache.DiskCache.Factory factory1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			factory = factory1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field com.bumptech.glide.load.engine.cache.DiskCache$Factory factory>
		//    5    9:return          
		}
	}

	public static class LoadStatus
	{

		public void cancel()
		{
			engineJob.removeCallback(cb);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field EngineJob engineJob>
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field ResourceCallback cb>
		//    4    8:invokevirtual   #31  <Method void EngineJob.removeCallback(ResourceCallback)>
		//    5   11:return          
		}

		private final ResourceCallback cb;
		private final EngineJob engineJob;

		LoadStatus(ResourceCallback resourcecallback, EngineJob enginejob)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			cb = resourcecallback;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field ResourceCallback cb>
			engineJob = enginejob;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field EngineJob engineJob>
		//    8   14:return          
		}
	}


	Engine(MemoryCache memorycache, com.bumptech.glide.load.engine.cache.DiskCache.Factory factory, GlideExecutor glideexecutor, GlideExecutor glideexecutor1, GlideExecutor glideexecutor2, GlideExecutor glideexecutor3, Jobs jobs1, 
			EngineKeyFactory enginekeyfactory, ActiveResources activeresources, EngineJobFactory enginejobfactory, DecodeJobFactory decodejobfactory, ResourceRecycler resourcerecycler, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void Object()>
		cache = memorycache;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #69  <Field MemoryCache cache>
		diskCacheProvider = new LazyDiskCacheProvider(factory);
	//    5    9:aload_0         
	//    6   10:new             #22  <Class Engine$LazyDiskCacheProvider>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #72  <Method void Engine$LazyDiskCacheProvider(com.bumptech.glide.load.engine.cache.DiskCache$Factory)>
	//   10   18:putfield        #74  <Field Engine$LazyDiskCacheProvider diskCacheProvider>
		if(activeresources == null)
	//*  11   21:aload           9
	//*  12   23:ifnonnull       40
			activeresources = new ActiveResources(flag);
	//   13   26:new             #76  <Class ActiveResources>
	//   14   29:dup             
	//   15   30:iload           13
	//   16   32:invokespecial   #79  <Method void ActiveResources(boolean)>
	//   17   35:astore          9
	//*  18   37:goto            40
		activeResources = activeresources;
	//   19   40:aload_0         
	//   20   41:aload           9
	//   21   43:putfield        #81  <Field ActiveResources activeResources>
		activeresources.setListener(((EngineResource.ResourceListener) (this)));
	//   22   46:aload           9
	//   23   48:aload_0         
	//   24   49:invokevirtual   #85  <Method void ActiveResources.setListener(EngineResource$ResourceListener)>
		if(enginekeyfactory == null)
	//*  25   52:aload           8
	//*  26   54:ifnonnull       69
			enginekeyfactory = new EngineKeyFactory();
	//   27   57:new             #87  <Class EngineKeyFactory>
	//   28   60:dup             
	//   29   61:invokespecial   #88  <Method void EngineKeyFactory()>
	//   30   64:astore          8
	//*  31   66:goto            69
		keyFactory = enginekeyfactory;
	//   32   69:aload_0         
	//   33   70:aload           8
	//   34   72:putfield        #90  <Field EngineKeyFactory keyFactory>
		if(jobs1 == null)
	//*  35   75:aload           7
	//*  36   77:ifnonnull       92
			jobs1 = new Jobs();
	//   37   80:new             #92  <Class Jobs>
	//   38   83:dup             
	//   39   84:invokespecial   #93  <Method void Jobs()>
	//   40   87:astore          7
	//*  41   89:goto            92
		jobs = jobs1;
	//   42   92:aload_0         
	//   43   93:aload           7
	//   44   95:putfield        #95  <Field Jobs jobs>
		if(enginejobfactory == null)
	//*  45   98:aload           10
	//*  46  100:ifnonnull       123
			enginejobfactory = new EngineJobFactory(glideexecutor, glideexecutor1, glideexecutor2, glideexecutor3, ((EngineJobListener) (this)));
	//   47  103:new             #17  <Class Engine$EngineJobFactory>
	//   48  106:dup             
	//   49  107:aload_3         
	//   50  108:aload           4
	//   51  110:aload           5
	//   52  112:aload           6
	//   53  114:aload_0         
	//   54  115:invokespecial   #98  <Method void Engine$EngineJobFactory(GlideExecutor, GlideExecutor, GlideExecutor, GlideExecutor, EngineJobListener)>
	//   55  118:astore          10
	//*  56  120:goto            123
		engineJobFactory = enginejobfactory;
	//   57  123:aload_0         
	//   58  124:aload           10
	//   59  126:putfield        #100 <Field Engine$EngineJobFactory engineJobFactory>
		if(decodejobfactory == null)
	//*  60  129:aload           11
	//*  61  131:ifnonnull       150
			decodejobfactory = new DecodeJobFactory(((DecodeJob.DiskCacheProvider) (diskCacheProvider)));
	//   62  134:new             #12  <Class Engine$DecodeJobFactory>
	//   63  137:dup             
	//   64  138:aload_0         
	//   65  139:getfield        #74  <Field Engine$LazyDiskCacheProvider diskCacheProvider>
	//   66  142:invokespecial   #103 <Method void Engine$DecodeJobFactory(DecodeJob$DiskCacheProvider)>
	//   67  145:astore          11
	//*  68  147:goto            150
		decodeJobFactory = decodejobfactory;
	//   69  150:aload_0         
	//   70  151:aload           11
	//   71  153:putfield        #105 <Field Engine$DecodeJobFactory decodeJobFactory>
		if(resourcerecycler == null)
	//*  72  156:aload           12
	//*  73  158:ifnonnull       173
			resourcerecycler = new ResourceRecycler();
	//   74  161:new             #107 <Class ResourceRecycler>
	//   75  164:dup             
	//   76  165:invokespecial   #108 <Method void ResourceRecycler()>
	//   77  168:astore          12
	//*  78  170:goto            173
		resourceRecycler = resourcerecycler;
	//   79  173:aload_0         
	//   80  174:aload           12
	//   81  176:putfield        #110 <Field ResourceRecycler resourceRecycler>
		memorycache.setResourceRemovedListener(((com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener) (this)));
	//   82  179:aload_1         
	//   83  180:aload_0         
	//   84  181:invokeinterface #116 <Method void MemoryCache.setResourceRemovedListener(com.bumptech.glide.load.engine.cache.MemoryCache$ResourceRemovedListener)>
	//   85  186:return          
	}

	public Engine(MemoryCache memorycache, com.bumptech.glide.load.engine.cache.DiskCache.Factory factory, GlideExecutor glideexecutor, GlideExecutor glideexecutor1, GlideExecutor glideexecutor2, GlideExecutor glideexecutor3, boolean flag)
	{
		this(memorycache, factory, glideexecutor, glideexecutor1, glideexecutor2, glideexecutor3, ((Jobs) (null)), ((EngineKeyFactory) (null)), ((ActiveResources) (null)), ((EngineJobFactory) (null)), ((DecodeJobFactory) (null)), ((ResourceRecycler) (null)), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aconst_null     
	//    8   11:aconst_null     
	//    9   12:aconst_null     
	//   10   13:aconst_null     
	//   11   14:aconst_null     
	//   12   15:aconst_null     
	//   13   16:iload           7
	//   14   18:invokespecial   #120 <Method void Engine(MemoryCache, com.bumptech.glide.load.engine.cache.DiskCache$Factory, GlideExecutor, GlideExecutor, GlideExecutor, GlideExecutor, Jobs, EngineKeyFactory, ActiveResources, Engine$EngineJobFactory, Engine$DecodeJobFactory, ResourceRecycler, boolean)>
	//   15   21:return          
	}

	private EngineResource getEngineResourceFromCache(Key key)
	{
		key = ((Key) (cache.remove(key)));
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field MemoryCache cache>
	//    2    4:aload_1         
	//    3    5:invokeinterface #126 <Method Resource MemoryCache.remove(Key)>
	//    4   10:astore_1        
		if(key == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       17
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		if(key instanceof EngineResource)
	//*   9   17:aload_1         
	//*  10   18:instanceof      #128 <Class EngineResource>
	//*  11   21:ifeq            29
			return (EngineResource)key;
	//   12   24:aload_1         
	//   13   25:checkcast       #128 <Class EngineResource>
	//   14   28:areturn         
		else
			return new EngineResource(((Resource) (key)), true, true);
	//   15   29:new             #128 <Class EngineResource>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:iconst_1        
	//   19   35:iconst_1        
	//   20   36:invokespecial   #131 <Method void EngineResource(Resource, boolean, boolean)>
	//   21   39:areturn         
	}

	private EngineResource loadFromActiveResources(Key key, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_2         
	//*   1    1:ifne            6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		key = ((Key) (activeResources.get(key)));
	//    4    6:aload_0         
	//    5    7:getfield        #81  <Field ActiveResources activeResources>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #139 <Method EngineResource ActiveResources.get(Key)>
	//    8   14:astore_1        
		if(key != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          23
			((EngineResource) (key)).acquire();
	//   11   19:aload_1         
	//   12   20:invokevirtual   #142 <Method void EngineResource.acquire()>
		return ((EngineResource) (key));
	//   13   23:aload_1         
	//   14   24:areturn         
	}

	private EngineResource loadFromCache(Key key, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_2         
	//*   1    1:ifne            6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		EngineResource engineresource = getEngineResourceFromCache(key);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #146 <Method EngineResource getEngineResourceFromCache(Key)>
	//    7   11:astore_3        
		if(engineresource != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          29
		{
			engineresource.acquire();
	//   10   16:aload_3         
	//   11   17:invokevirtual   #142 <Method void EngineResource.acquire()>
			activeResources.activate(key, engineresource);
	//   12   20:aload_0         
	//   13   21:getfield        #81  <Field ActiveResources activeResources>
	//   14   24:aload_1         
	//   15   25:aload_3         
	//   16   26:invokevirtual   #150 <Method void ActiveResources.activate(Key, EngineResource)>
		}
		return engineresource;
	//   17   29:aload_3         
	//   18   30:areturn         
	}

	private static void logWithTimeAndKey(String s, long l, Key key)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #154 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #155 <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append(s);
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(" in ");
	//    8   16:aload           4
	//    9   18:ldc1            #161 <String " in ">
	//   10   20:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(LogTime.getElapsedMillis(l));
	//   12   24:aload           4
	//   13   26:lload_1         
	//   14   27:invokestatic    #167 <Method double LogTime.getElapsedMillis(long)>
	//   15   30:invokevirtual   #170 <Method StringBuilder StringBuilder.append(double)>
	//   16   33:pop             
		stringbuilder.append("ms, key: ");
	//   17   34:aload           4
	//   18   36:ldc1            #172 <String "ms, key: ">
	//   19   38:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
		stringbuilder.append(((Object) (key)));
	//   21   42:aload           4
	//   22   44:aload_3         
	//   23   45:invokevirtual   #175 <Method StringBuilder StringBuilder.append(Object)>
	//   24   48:pop             
		Log.v("Engine", stringbuilder.toString());
	//   25   49:ldc1            #33  <String "Engine">
	//   26   51:aload           4
	//   27   53:invokevirtual   #179 <Method String StringBuilder.toString()>
	//   28   56:invokestatic    #183 <Method int Log.v(String, String)>
	//   29   59:pop             
	//   30   60:return          
	}

	public void clearDiskCache()
	{
		diskCacheProvider.getDiskCache().clear();
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Engine$LazyDiskCacheProvider diskCacheProvider>
	//    2    4:invokevirtual   #188 <Method DiskCache Engine$LazyDiskCacheProvider.getDiskCache()>
	//    3    7:invokeinterface #193 <Method void DiskCache.clear()>
	//    4   12:return          
	}

	public LoadStatus load(GlideContext glidecontext, Object obj, Key key, int i, int j, Class class1, Class class2, 
			Priority priority, DiskCacheStrategy diskcachestrategy, Map map, boolean flag, boolean flag1, Options options, boolean flag2, 
			boolean flag3, boolean flag4, boolean flag5, ResourceCallback resourcecallback)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #200 <Method void Util.assertMainThread()>
		long l;
		if(VERBOSE_IS_LOGGABLE)
	//*   1    3:getstatic       #61  <Field boolean VERBOSE_IS_LOGGABLE>
	//*   2    6:ifeq            17
			l = LogTime.getLogTime();
	//    3    9:invokestatic    #204 <Method long LogTime.getLogTime()>
	//    4   12:lstore          19
		else
	//*   5   14:goto            20
			l = 0L;
	//    6   17:lconst_0        
	//    7   18:lstore          19
		EngineKey enginekey = keyFactory.buildKey(obj, key, i, j, map, class1, class2, options);
	//    8   20:aload_0         
	//    9   21:getfield        #90  <Field EngineKeyFactory keyFactory>
	//   10   24:aload_2         
	//   11   25:aload_3         
	//   12   26:iload           4
	//   13   28:iload           5
	//   14   30:aload           10
	//   15   32:aload           6
	//   16   34:aload           7
	//   17   36:aload           13
	//   18   38:invokevirtual   #208 <Method EngineKey EngineKeyFactory.buildKey(Object, Key, int, int, Map, Class, Class, Options)>
	//   19   41:astore          21
		Object obj1 = ((Object) (loadFromActiveResources(((Key) (enginekey)), flag2)));
	//   20   43:aload_0         
	//   21   44:aload           21
	//   22   46:iload           14
	//   23   48:invokespecial   #210 <Method EngineResource loadFromActiveResources(Key, boolean)>
	//   24   51:astore          22
		if(obj1 != null)
	//*  25   53:aload           22
	//*  26   55:ifnull          87
		{
			resourcecallback.onResourceReady(((Resource) (obj1)), DataSource.MEMORY_CACHE);
	//   27   58:aload           18
	//   28   60:aload           22
	//   29   62:getstatic       #216 <Field DataSource DataSource.MEMORY_CACHE>
	//   30   65:invokeinterface #222 <Method void ResourceCallback.onResourceReady(Resource, DataSource)>
			if(VERBOSE_IS_LOGGABLE)
	//*  31   70:getstatic       #61  <Field boolean VERBOSE_IS_LOGGABLE>
	//*  32   73:ifeq            85
				logWithTimeAndKey("Loaded resource from active resources", l, ((Key) (enginekey)));
	//   33   76:ldc1            #224 <String "Loaded resource from active resources">
	//   34   78:lload           19
	//   35   80:aload           21
	//   36   82:invokestatic    #226 <Method void logWithTimeAndKey(String, long, Key)>
			return null;
	//   37   85:aconst_null     
	//   38   86:areturn         
		}
		obj1 = ((Object) (loadFromCache(((Key) (enginekey)), flag2)));
	//   39   87:aload_0         
	//   40   88:aload           21
	//   41   90:iload           14
	//   42   92:invokespecial   #228 <Method EngineResource loadFromCache(Key, boolean)>
	//   43   95:astore          22
		if(obj1 != null)
	//*  44   97:aload           22
	//*  45   99:ifnull          131
		{
			resourcecallback.onResourceReady(((Resource) (obj1)), DataSource.MEMORY_CACHE);
	//   46  102:aload           18
	//   47  104:aload           22
	//   48  106:getstatic       #216 <Field DataSource DataSource.MEMORY_CACHE>
	//   49  109:invokeinterface #222 <Method void ResourceCallback.onResourceReady(Resource, DataSource)>
			if(VERBOSE_IS_LOGGABLE)
	//*  50  114:getstatic       #61  <Field boolean VERBOSE_IS_LOGGABLE>
	//*  51  117:ifeq            129
				logWithTimeAndKey("Loaded resource from cache", l, ((Key) (enginekey)));
	//   52  120:ldc1            #230 <String "Loaded resource from cache">
	//   53  122:lload           19
	//   54  124:aload           21
	//   55  126:invokestatic    #226 <Method void logWithTimeAndKey(String, long, Key)>
			return null;
	//   56  129:aconst_null     
	//   57  130:areturn         
		}
		obj1 = ((Object) (jobs.get(((Key) (enginekey)), flag5)));
	//   58  131:aload_0         
	//   59  132:getfield        #95  <Field Jobs jobs>
	//   60  135:aload           21
	//   61  137:iload           17
	//   62  139:invokevirtual   #233 <Method EngineJob Jobs.get(Key, boolean)>
	//   63  142:astore          22
		if(obj1 != null)
	//*  64  144:aload           22
	//*  65  146:ifnull          183
		{
			((EngineJob) (obj1)).addCallback(resourcecallback);
	//   66  149:aload           22
	//   67  151:aload           18
	//   68  153:invokevirtual   #239 <Method void EngineJob.addCallback(ResourceCallback)>
			if(VERBOSE_IS_LOGGABLE)
	//*  69  156:getstatic       #61  <Field boolean VERBOSE_IS_LOGGABLE>
	//*  70  159:ifeq            171
				logWithTimeAndKey("Added to existing load", l, ((Key) (enginekey)));
	//   71  162:ldc1            #241 <String "Added to existing load">
	//   72  164:lload           19
	//   73  166:aload           21
	//   74  168:invokestatic    #226 <Method void logWithTimeAndKey(String, long, Key)>
			return new LoadStatus(resourcecallback, ((EngineJob) (obj1)));
	//   75  171:new             #25  <Class Engine$LoadStatus>
	//   76  174:dup             
	//   77  175:aload           18
	//   78  177:aload           22
	//   79  179:invokespecial   #244 <Method void Engine$LoadStatus(ResourceCallback, EngineJob)>
	//   80  182:areturn         
		}
		obj1 = ((Object) (engineJobFactory.build(((Key) (enginekey)), flag2, flag3, flag4, flag5)));
	//   81  183:aload_0         
	//   82  184:getfield        #100 <Field Engine$EngineJobFactory engineJobFactory>
	//   83  187:aload           21
	//   84  189:iload           14
	//   85  191:iload           15
	//   86  193:iload           16
	//   87  195:iload           17
	//   88  197:invokevirtual   #248 <Method EngineJob Engine$EngineJobFactory.build(Key, boolean, boolean, boolean, boolean)>
	//   89  200:astore          22
		glidecontext = ((GlideContext) (decodeJobFactory.build(glidecontext, obj, enginekey, key, i, j, class1, class2, priority, diskcachestrategy, map, flag, flag1, flag5, options, ((DecodeJob.Callback) (obj1)))));
	//   90  202:aload_0         
	//   91  203:getfield        #105 <Field Engine$DecodeJobFactory decodeJobFactory>
	//   92  206:aload_1         
	//   93  207:aload_2         
	//   94  208:aload           21
	//   95  210:aload_3         
	//   96  211:iload           4
	//   97  213:iload           5
	//   98  215:aload           6
	//   99  217:aload           7
	//  100  219:aload           8
	//  101  221:aload           9
	//  102  223:aload           10
	//  103  225:iload           11
	//  104  227:iload           12
	//  105  229:iload           17
	//  106  231:aload           13
	//  107  233:aload           22
	//  108  235:invokevirtual   #251 <Method DecodeJob Engine$DecodeJobFactory.build(GlideContext, Object, EngineKey, Key, int, int, Class, Class, Priority, DiskCacheStrategy, Map, boolean, boolean, boolean, Options, DecodeJob$Callback)>
	//  109  238:astore_1        
		jobs.put(((Key) (enginekey)), ((EngineJob) (obj1)));
	//  110  239:aload_0         
	//  111  240:getfield        #95  <Field Jobs jobs>
	//  112  243:aload           21
	//  113  245:aload           22
	//  114  247:invokevirtual   #255 <Method void Jobs.put(Key, EngineJob)>
		((EngineJob) (obj1)).addCallback(resourcecallback);
	//  115  250:aload           22
	//  116  252:aload           18
	//  117  254:invokevirtual   #239 <Method void EngineJob.addCallback(ResourceCallback)>
		((EngineJob) (obj1)).start(((DecodeJob) (glidecontext)));
	//  118  257:aload           22
	//  119  259:aload_1         
	//  120  260:invokevirtual   #259 <Method void EngineJob.start(DecodeJob)>
		if(VERBOSE_IS_LOGGABLE)
	//* 121  263:getstatic       #61  <Field boolean VERBOSE_IS_LOGGABLE>
	//* 122  266:ifeq            279
			logWithTimeAndKey("Started new load", l, ((Key) (enginekey)));
	//  123  269:ldc2            #261 <String "Started new load">
	//  124  272:lload           19
	//  125  274:aload           21
	//  126  276:invokestatic    #226 <Method void logWithTimeAndKey(String, long, Key)>
		return new LoadStatus(resourcecallback, ((EngineJob) (obj1)));
	//  127  279:new             #25  <Class Engine$LoadStatus>
	//  128  282:dup             
	//  129  283:aload           18
	//  130  285:aload           22
	//  131  287:invokespecial   #244 <Method void Engine$LoadStatus(ResourceCallback, EngineJob)>
	//  132  290:areturn         
	}

	public void onEngineJobCancelled(EngineJob enginejob, Key key)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #200 <Method void Util.assertMainThread()>
		jobs.removeIfCurrent(key, enginejob);
	//    1    3:aload_0         
	//    2    4:getfield        #95  <Field Jobs jobs>
	//    3    7:aload_2         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #267 <Method void Jobs.removeIfCurrent(Key, EngineJob)>
	//    6   12:return          
	}

	public void onEngineJobComplete(EngineJob enginejob, Key key, EngineResource engineresource)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #200 <Method void Util.assertMainThread()>
		if(engineresource != null)
	//*   1    3:aload_3         
	//*   2    4:ifnull          29
		{
			engineresource.setResourceListener(key, ((EngineResource.ResourceListener) (this)));
	//    3    7:aload_3         
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #274 <Method void EngineResource.setResourceListener(Key, EngineResource$ResourceListener)>
			if(engineresource.isCacheable())
	//*   7   13:aload_3         
	//*   8   14:invokevirtual   #278 <Method boolean EngineResource.isCacheable()>
	//*   9   17:ifeq            29
				activeResources.activate(key, engineresource);
	//   10   20:aload_0         
	//   11   21:getfield        #81  <Field ActiveResources activeResources>
	//   12   24:aload_2         
	//   13   25:aload_3         
	//   14   26:invokevirtual   #150 <Method void ActiveResources.activate(Key, EngineResource)>
		}
		jobs.removeIfCurrent(key, enginejob);
	//   15   29:aload_0         
	//   16   30:getfield        #95  <Field Jobs jobs>
	//   17   33:aload_2         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #267 <Method void Jobs.removeIfCurrent(Key, EngineJob)>
	//   20   38:return          
	}

	public void onResourceReleased(Key key, EngineResource engineresource)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #200 <Method void Util.assertMainThread()>
		activeResources.deactivate(key);
	//    1    3:aload_0         
	//    2    4:getfield        #81  <Field ActiveResources activeResources>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #284 <Method void ActiveResources.deactivate(Key)>
		if(engineresource.isCacheable())
	//*   5   11:aload_2         
	//*   6   12:invokevirtual   #278 <Method boolean EngineResource.isCacheable()>
	//*   7   15:ifeq            31
		{
			cache.put(key, ((Resource) (engineresource)));
	//    8   18:aload_0         
	//    9   19:getfield        #69  <Field MemoryCache cache>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokeinterface #287 <Method Resource MemoryCache.put(Key, Resource)>
	//   13   29:pop             
			return;
	//   14   30:return          
		} else
		{
			resourceRecycler.recycle(((Resource) (engineresource)));
	//   15   31:aload_0         
	//   16   32:getfield        #110 <Field ResourceRecycler resourceRecycler>
	//   17   35:aload_2         
	//   18   36:invokevirtual   #291 <Method void ResourceRecycler.recycle(Resource)>
			return;
	//   19   39:return          
		}
	}

	public void onResourceRemoved(Resource resource)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #200 <Method void Util.assertMainThread()>
		resourceRecycler.recycle(resource);
	//    1    3:aload_0         
	//    2    4:getfield        #110 <Field ResourceRecycler resourceRecycler>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #291 <Method void ResourceRecycler.recycle(Resource)>
	//    5   11:return          
	}

	public void release(Resource resource)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #200 <Method void Util.assertMainThread()>
		if(resource instanceof EngineResource)
	//*   1    3:aload_1         
	//*   2    4:instanceof      #128 <Class EngineResource>
	//*   3    7:ifeq            18
		{
			((EngineResource)resource).release();
	//    4   10:aload_1         
	//    5   11:checkcast       #128 <Class EngineResource>
	//    6   14:invokevirtual   #299 <Method void EngineResource.release()>
			return;
	//    7   17:return          
		} else
		{
			throw new IllegalArgumentException("Cannot release anything but an EngineResource");
	//    8   18:new             #301 <Class IllegalArgumentException>
	//    9   21:dup             
	//   10   22:ldc2            #303 <String "Cannot release anything but an EngineResource">
	//   11   25:invokespecial   #306 <Method void IllegalArgumentException(String)>
	//   12   28:athrow          
		}
	}

	public void shutdown()
	{
		engineJobFactory.shutdown();
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Engine$EngineJobFactory engineJobFactory>
	//    2    4:invokevirtual   #309 <Method void Engine$EngineJobFactory.shutdown()>
		diskCacheProvider.clearDiskCacheIfCreated();
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field Engine$LazyDiskCacheProvider diskCacheProvider>
	//    5   11:invokevirtual   #312 <Method void Engine$LazyDiskCacheProvider.clearDiskCacheIfCreated()>
		activeResources.shutdown();
	//    6   14:aload_0         
	//    7   15:getfield        #81  <Field ActiveResources activeResources>
	//    8   18:invokevirtual   #313 <Method void ActiveResources.shutdown()>
	//    9   21:return          
	}

	private static final int JOB_POOL_SIZE = 150;
	private static final String TAG = "Engine";
	private static final boolean VERBOSE_IS_LOGGABLE = Log.isLoggable("Engine", 2);
	private final ActiveResources activeResources;
	private final MemoryCache cache;
	private final DecodeJobFactory decodeJobFactory;
	private final LazyDiskCacheProvider diskCacheProvider;
	private final EngineJobFactory engineJobFactory;
	private final Jobs jobs;
	private final EngineKeyFactory keyFactory;
	private final ResourceRecycler resourceRecycler;

	static 
	{
	//    0    0:ldc1            #33  <String "Engine">
	//    1    2:iconst_2        
	//    2    3:invokestatic    #59  <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #61  <Field boolean VERBOSE_IS_LOGGABLE>
	//*   4    9:return          
	}

	// Unreferenced inner class com/bumptech/glide/load/engine/Engine$DecodeJobFactory$1

/* anonymous class */
	class DecodeJobFactory._cls1
		implements com.bumptech.glide.util.pool.FactoryPools.Factory
	{

		public DecodeJob create()
		{
			return new DecodeJob(diskCacheProvider, pool);
		//    0    0:new             #26  <Class DecodeJob>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field Engine$DecodeJobFactory this$0>
		//    4    8:getfield        #30  <Field DecodeJob$DiskCacheProvider Engine$DecodeJobFactory.diskCacheProvider>
		//    5   11:aload_0         
		//    6   12:getfield        #18  <Field Engine$DecodeJobFactory this$0>
		//    7   15:getfield        #34  <Field android.support.v4.util.Pools$Pool Engine$DecodeJobFactory.pool>
		//    8   18:invokespecial   #37  <Method void DecodeJob(DecodeJob$DiskCacheProvider, android.support.v4.util.Pools$Pool)>
		//    9   21:areturn         
		}

		public volatile Object create()
		{
			return ((Object) (create()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #42  <Method DecodeJob create()>
		//    2    4:areturn         
		}

		final DecodeJobFactory this$0;

			
			{
				this$0 = DecodeJobFactory.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Engine$DecodeJobFactory this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
	}


	// Unreferenced inner class com/bumptech/glide/load/engine/Engine$EngineJobFactory$1

/* anonymous class */
	class EngineJobFactory._cls1
		implements com.bumptech.glide.util.pool.FactoryPools.Factory
	{

		public EngineJob create()
		{
			return new EngineJob(diskCacheExecutor, sourceExecutor, sourceUnlimitedExecutor, animationExecutor, listener, pool);
		//    0    0:new             #26  <Class EngineJob>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field Engine$EngineJobFactory this$0>
		//    4    8:getfield        #30  <Field GlideExecutor Engine$EngineJobFactory.diskCacheExecutor>
		//    5   11:aload_0         
		//    6   12:getfield        #18  <Field Engine$EngineJobFactory this$0>
		//    7   15:getfield        #33  <Field GlideExecutor Engine$EngineJobFactory.sourceExecutor>
		//    8   18:aload_0         
		//    9   19:getfield        #18  <Field Engine$EngineJobFactory this$0>
		//   10   22:getfield        #36  <Field GlideExecutor Engine$EngineJobFactory.sourceUnlimitedExecutor>
		//   11   25:aload_0         
		//   12   26:getfield        #18  <Field Engine$EngineJobFactory this$0>
		//   13   29:getfield        #39  <Field GlideExecutor Engine$EngineJobFactory.animationExecutor>
		//   14   32:aload_0         
		//   15   33:getfield        #18  <Field Engine$EngineJobFactory this$0>
		//   16   36:getfield        #43  <Field EngineJobListener Engine$EngineJobFactory.listener>
		//   17   39:aload_0         
		//   18   40:getfield        #18  <Field Engine$EngineJobFactory this$0>
		//   19   43:getfield        #47  <Field android.support.v4.util.Pools$Pool Engine$EngineJobFactory.pool>
		//   20   46:invokespecial   #50  <Method void EngineJob(GlideExecutor, GlideExecutor, GlideExecutor, GlideExecutor, EngineJobListener, android.support.v4.util.Pools$Pool)>
		//   21   49:areturn         
		}

		public volatile Object create()
		{
			return ((Object) (create()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #55  <Method EngineJob create()>
		//    2    4:areturn         
		}

		final EngineJobFactory this$0;

			
			{
				this$0 = EngineJobFactory.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Engine$EngineJobFactory this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
	}

}
