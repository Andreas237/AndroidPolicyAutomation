// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.os.Looper;
import android.os.MessageQueue;
import android.util.Log;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.*;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCacheAdapter;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.load.engine:
//			EngineJobListener, EngineKeyFactory, ResourceRecycler, EngineResource, 
//			EngineJob, DiskCacheStrategy, Resource, DecodeJob, 
//			EngineKey

public class Engine
	implements EngineJobListener, com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener, EngineResource.ResourceListener
{
	static class DecodeJobFactory
	{

		DecodeJob build(GlideContext glidecontext, Object obj, EngineKey enginekey, Key key, int i, int j, Class class1, 
				Class class2, Priority priority, DiskCacheStrategy diskcachestrategy, Map map, boolean flag, boolean flag1, boolean flag2, 
				Options options, DecodeJob.Callback callback)
		{
			DecodeJob decodejob = (DecodeJob)pool.acquire();
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field android.support.v4.util.Pools$Pool pool>
		//    2    4:invokeinterface #43  <Method Object android.support.v4.util.Pools$Pool.acquire()>
		//    3    9:checkcast       #45  <Class DecodeJob>
		//    4   12:astore          18
			int k = creationOrder;
		//    5   14:aload_0         
		//    6   15:getfield        #47  <Field int creationOrder>
		//    7   18:istore          17
			creationOrder = k + 1;
		//    8   20:aload_0         
		//    9   21:iload           17
		//   10   23:iconst_1        
		//   11   24:iadd            
		//   12   25:putfield        #47  <Field int creationOrder>
			return decodejob.init(glidecontext, obj, enginekey, key, i, j, class1, class2, priority, diskcachestrategy, map, flag, flag1, flag2, options, callback, k);
		//   13   28:aload           18
		//   14   30:aload_1         
		//   15   31:aload_2         
		//   16   32:aload_3         
		//   17   33:aload           4
		//   18   35:iload           5
		//   19   37:iload           6
		//   20   39:aload           7
		//   21   41:aload           8
		//   22   43:aload           9
		//   23   45:aload           10
		//   24   47:aload           11
		//   25   49:iload           12
		//   26   51:iload           13
		//   27   53:iload           14
		//   28   55:aload           15
		//   29   57:aload           16
		//   30   59:iload           17
		//   31   61:invokevirtual   #51  <Method DecodeJob DecodeJob.init(GlideContext, Object, EngineKey, Key, int, int, Class, Class, Priority, DiskCacheStrategy, Map, boolean, boolean, boolean, Options, DecodeJob$Callback, int)>
		//   32   64:areturn         
		}

		private int creationOrder;
		final DecodeJob.DiskCacheProvider diskCacheProvider;
		final android.support.v4.util.Pools.Pool pool = FactoryPools.simple(150, new _cls1());

		DecodeJobFactory(DecodeJob.DiskCacheProvider diskcacheprovider)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:sipush          150
		//    4    8:new             #9   <Class Engine$DecodeJobFactory$1>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:invokespecial   #24  <Method void Engine$DecodeJobFactory$1(Engine$DecodeJobFactory)>
		//    8   16:invokestatic    #30  <Method android.support.v4.util.Pools$Pool FactoryPools.simple(int, com.bumptech.glide.util.pool.FactoryPools$Factory)>
		//    9   19:putfield        #32  <Field android.support.v4.util.Pools$Pool pool>
			diskCacheProvider = diskcacheprovider;
		//   10   22:aload_0         
		//   11   23:aload_1         
		//   12   24:putfield        #34  <Field DecodeJob$DiskCacheProvider diskCacheProvider>
		//   13   27:return          
		}
	}

	static class EngineJobFactory
	{

		EngineJob build(Key key, boolean flag, boolean flag1)
		{
			return ((EngineJob)pool.acquire()).init(key, flag, flag1);
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field android.support.v4.util.Pools$Pool pool>
		//    2    4:invokeinterface #51  <Method Object android.support.v4.util.Pools$Pool.acquire()>
		//    3    9:checkcast       #53  <Class EngineJob>
		//    4   12:aload_1         
		//    5   13:iload_2         
		//    6   14:iload_3         
		//    7   15:invokevirtual   #56  <Method EngineJob EngineJob.init(Key, boolean, boolean)>
		//    8   18:areturn         
		}

		final GlideExecutor diskCacheExecutor;
		final EngineJobListener listener;
		final android.support.v4.util.Pools.Pool pool = FactoryPools.simple(150, new _cls1());
		final GlideExecutor sourceExecutor;
		final GlideExecutor sourceUnlimitedExecutor;

		EngineJobFactory(GlideExecutor glideexecutor, GlideExecutor glideexecutor1, GlideExecutor glideexecutor2, EngineJobListener enginejoblistener)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:sipush          150
		//    4    8:new             #9   <Class Engine$EngineJobFactory$1>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:invokespecial   #26  <Method void Engine$EngineJobFactory$1(Engine$EngineJobFactory)>
		//    8   16:invokestatic    #32  <Method android.support.v4.util.Pools$Pool FactoryPools.simple(int, com.bumptech.glide.util.pool.FactoryPools$Factory)>
		//    9   19:putfield        #34  <Field android.support.v4.util.Pools$Pool pool>
			diskCacheExecutor = glideexecutor;
		//   10   22:aload_0         
		//   11   23:aload_1         
		//   12   24:putfield        #36  <Field GlideExecutor diskCacheExecutor>
			sourceExecutor = glideexecutor1;
		//   13   27:aload_0         
		//   14   28:aload_2         
		//   15   29:putfield        #38  <Field GlideExecutor sourceExecutor>
			sourceUnlimitedExecutor = glideexecutor2;
		//   16   32:aload_0         
		//   17   33:aload_3         
		//   18   34:putfield        #40  <Field GlideExecutor sourceUnlimitedExecutor>
			listener = enginejoblistener;
		//   19   37:aload_0         
		//   20   38:aload           4
		//   21   40:putfield        #42  <Field EngineJobListener listener>
		//   22   43:return          
		}
	}

	static class LazyDiskCacheProvider
		implements DecodeJob.DiskCacheProvider
	{

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
		//   11   21:invokeinterface #30  <Method DiskCache com.bumptech.glide.load.engine.cache.DiskCache$Factory.build()>
		//   12   26:putfield        #25  <Field DiskCache diskCache>
			if(diskCache == null)
		//*  13   29:aload_0         
		//*  14   30:getfield        #25  <Field DiskCache diskCache>
		//*  15   33:ifnonnull       47
				diskCache = ((DiskCache) (new DiskCacheAdapter()));
		//   16   36:aload_0         
		//   17   37:new             #32  <Class DiskCacheAdapter>
		//   18   40:dup             
		//   19   41:invokespecial   #33  <Method void DiskCacheAdapter()>
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
		//*  25   53:aload_0         
			throw exception;
		//   26   54:monitorexit     
		//   27   55:aload_1         
		//   28   56:athrow          
			return diskCache;
		//   29   57:aload_0         
		//   30   58:getfield        #25  <Field DiskCache diskCache>
		//   31   61:areturn         
		}

		private volatile DiskCache diskCache;
		private final com.bumptech.glide.load.engine.cache.DiskCache.Factory factory;

		public LazyDiskCacheProvider(com.bumptech.glide.load.engine.cache.DiskCache.Factory factory1)
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

		public LoadStatus(ResourceCallback resourcecallback, EngineJob enginejob)
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

	static class RefQueueIdleHandler
		implements android.os.MessageQueue.IdleHandler
	{

		public boolean queueIdle()
		{
			ResourceWeakReference resourceweakreference = (ResourceWeakReference)queue.poll();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field ReferenceQueue queue>
		//    2    4:invokevirtual   #35  <Method java.lang.ref.Reference ReferenceQueue.poll()>
		//    3    7:checkcast       #37  <Class Engine$ResourceWeakReference>
		//    4   10:astore_1        
			if(resourceweakreference != null)
		//*   5   11:aload_1         
		//*   6   12:ifnull          29
				activeResources.remove(((Object) (resourceweakreference.key)));
		//    7   15:aload_0         
		//    8   16:getfield        #22  <Field Map activeResources>
		//    9   19:aload_1         
		//   10   20:getfield        #41  <Field Key Engine$ResourceWeakReference.key>
		//   11   23:invokeinterface #47  <Method Object Map.remove(Object)>
		//   12   28:pop             
			return true;
		//   13   29:iconst_1        
		//   14   30:ireturn         
		}

		private final Map activeResources;
		private final ReferenceQueue queue;

		public RefQueueIdleHandler(Map map, ReferenceQueue referencequeue)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			activeResources = map;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field Map activeResources>
			queue = referencequeue;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field ReferenceQueue queue>
		//    8   14:return          
		}
	}

	static class ResourceWeakReference extends WeakReference
	{

		final Key key;

		public ResourceWeakReference(Key key1, EngineResource engineresource, ReferenceQueue referencequeue)
		{
			super(((Object) (engineresource)), referencequeue);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:invokespecial   #15  <Method void WeakReference(Object, ReferenceQueue)>
			key = key1;
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:putfield        #17  <Field Key key>
		//    7   11:return          
		}
	}


	public Engine(MemoryCache memorycache, com.bumptech.glide.load.engine.cache.DiskCache.Factory factory, GlideExecutor glideexecutor, GlideExecutor glideexecutor1, GlideExecutor glideexecutor2)
	{
		this(memorycache, factory, glideexecutor, glideexecutor1, glideexecutor2, ((Map) (null)), ((EngineKeyFactory) (null)), ((Map) (null)), ((EngineJobFactory) (null)), ((DecodeJobFactory) (null)), ((ResourceRecycler) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aconst_null     
	//    7    9:aconst_null     
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:aconst_null     
	//   11   13:aconst_null     
	//   12   14:invokespecial   #64  <Method void Engine(MemoryCache, com.bumptech.glide.load.engine.cache.DiskCache$Factory, GlideExecutor, GlideExecutor, GlideExecutor, Map, EngineKeyFactory, Map, Engine$EngineJobFactory, Engine$DecodeJobFactory, ResourceRecycler)>
	//   13   17:return          
	}

	Engine(MemoryCache memorycache, com.bumptech.glide.load.engine.cache.DiskCache.Factory factory, GlideExecutor glideexecutor, GlideExecutor glideexecutor1, GlideExecutor glideexecutor2, Map map, EngineKeyFactory enginekeyfactory, 
			Map map1, EngineJobFactory enginejobfactory, DecodeJobFactory decodejobfactory, ResourceRecycler resourcerecycler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void Object()>
		cache = memorycache;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #70  <Field MemoryCache cache>
		diskCacheProvider = new LazyDiskCacheProvider(factory);
	//    5    9:aload_0         
	//    6   10:new             #22  <Class Engine$LazyDiskCacheProvider>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #73  <Method void Engine$LazyDiskCacheProvider(com.bumptech.glide.load.engine.cache.DiskCache$Factory)>
	//   10   18:putfield        #75  <Field Engine$LazyDiskCacheProvider diskCacheProvider>
		factory = ((com.bumptech.glide.load.engine.cache.DiskCache.Factory) (map1));
	//   11   21:aload           8
	//   12   23:astore_2        
		if(map1 == null)
	//*  13   24:aload           8
	//*  14   26:ifnonnull       37
			factory = ((com.bumptech.glide.load.engine.cache.DiskCache.Factory) (new HashMap()));
	//   15   29:new             #77  <Class HashMap>
	//   16   32:dup             
	//   17   33:invokespecial   #78  <Method void HashMap()>
	//   18   36:astore_2        
		activeResources = ((Map) (factory));
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:putfield        #80  <Field Map activeResources>
		factory = ((com.bumptech.glide.load.engine.cache.DiskCache.Factory) (enginekeyfactory));
	//   22   42:aload           7
	//   23   44:astore_2        
		if(enginekeyfactory == null)
	//*  24   45:aload           7
	//*  25   47:ifnonnull       58
			factory = ((com.bumptech.glide.load.engine.cache.DiskCache.Factory) (new EngineKeyFactory()));
	//   26   50:new             #82  <Class EngineKeyFactory>
	//   27   53:dup             
	//   28   54:invokespecial   #83  <Method void EngineKeyFactory()>
	//   29   57:astore_2        
		keyFactory = ((EngineKeyFactory) (factory));
	//   30   58:aload_0         
	//   31   59:aload_2         
	//   32   60:putfield        #85  <Field EngineKeyFactory keyFactory>
		factory = ((com.bumptech.glide.load.engine.cache.DiskCache.Factory) (map));
	//   33   63:aload           6
	//   34   65:astore_2        
		if(map == null)
	//*  35   66:aload           6
	//*  36   68:ifnonnull       79
			factory = ((com.bumptech.glide.load.engine.cache.DiskCache.Factory) (new HashMap()));
	//   37   71:new             #77  <Class HashMap>
	//   38   74:dup             
	//   39   75:invokespecial   #78  <Method void HashMap()>
	//   40   78:astore_2        
		jobs = ((Map) (factory));
	//   41   79:aload_0         
	//   42   80:aload_2         
	//   43   81:putfield        #87  <Field Map jobs>
		factory = ((com.bumptech.glide.load.engine.cache.DiskCache.Factory) (enginejobfactory));
	//   44   84:aload           9
	//   45   86:astore_2        
		if(enginejobfactory == null)
	//*  46   87:aload           9
	//*  47   89:ifnonnull       106
			factory = ((com.bumptech.glide.load.engine.cache.DiskCache.Factory) (new EngineJobFactory(glideexecutor, glideexecutor1, glideexecutor2, ((EngineJobListener) (this)))));
	//   48   92:new             #17  <Class Engine$EngineJobFactory>
	//   49   95:dup             
	//   50   96:aload_3         
	//   51   97:aload           4
	//   52   99:aload           5
	//   53  101:aload_0         
	//   54  102:invokespecial   #90  <Method void Engine$EngineJobFactory(GlideExecutor, GlideExecutor, GlideExecutor, EngineJobListener)>
	//   55  105:astore_2        
		engineJobFactory = ((EngineJobFactory) (factory));
	//   56  106:aload_0         
	//   57  107:aload_2         
	//   58  108:putfield        #92  <Field Engine$EngineJobFactory engineJobFactory>
		factory = ((com.bumptech.glide.load.engine.cache.DiskCache.Factory) (decodejobfactory));
	//   59  111:aload           10
	//   60  113:astore_2        
		if(decodejobfactory == null)
	//*  61  114:aload           10
	//*  62  116:ifnonnull       131
			factory = ((com.bumptech.glide.load.engine.cache.DiskCache.Factory) (new DecodeJobFactory(((DecodeJob.DiskCacheProvider) (diskCacheProvider)))));
	//   63  119:new             #12  <Class Engine$DecodeJobFactory>
	//   64  122:dup             
	//   65  123:aload_0         
	//   66  124:getfield        #75  <Field Engine$LazyDiskCacheProvider diskCacheProvider>
	//   67  127:invokespecial   #95  <Method void Engine$DecodeJobFactory(DecodeJob$DiskCacheProvider)>
	//   68  130:astore_2        
		decodeJobFactory = ((DecodeJobFactory) (factory));
	//   69  131:aload_0         
	//   70  132:aload_2         
	//   71  133:putfield        #97  <Field Engine$DecodeJobFactory decodeJobFactory>
		factory = ((com.bumptech.glide.load.engine.cache.DiskCache.Factory) (resourcerecycler));
	//   72  136:aload           11
	//   73  138:astore_2        
		if(resourcerecycler == null)
	//*  74  139:aload           11
	//*  75  141:ifnonnull       152
			factory = ((com.bumptech.glide.load.engine.cache.DiskCache.Factory) (new ResourceRecycler()));
	//   76  144:new             #99  <Class ResourceRecycler>
	//   77  147:dup             
	//   78  148:invokespecial   #100 <Method void ResourceRecycler()>
	//   79  151:astore_2        
		resourceRecycler = ((ResourceRecycler) (factory));
	//   80  152:aload_0         
	//   81  153:aload_2         
	//   82  154:putfield        #102 <Field ResourceRecycler resourceRecycler>
		memorycache.setResourceRemovedListener(((com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener) (this)));
	//   83  157:aload_1         
	//   84  158:aload_0         
	//   85  159:invokeinterface #108 <Method void MemoryCache.setResourceRemovedListener(com.bumptech.glide.load.engine.cache.MemoryCache$ResourceRemovedListener)>
	//   86  164:return          
	}

	private EngineResource getEngineResourceFromCache(Key key)
	{
		key = ((Key) (cache.remove(key)));
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field MemoryCache cache>
	//    2    4:aload_1         
	//    3    5:invokeinterface #116 <Method Resource MemoryCache.remove(Key)>
	//    4   10:astore_1        
		if(key == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       17
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		if(key instanceof EngineResource)
	//*   9   17:aload_1         
	//*  10   18:instanceof      #118 <Class EngineResource>
	//*  11   21:ifeq            29
			return (EngineResource)key;
	//   12   24:aload_1         
	//   13   25:checkcast       #118 <Class EngineResource>
	//   14   28:areturn         
		else
			return new EngineResource(((Resource) (key)), true);
	//   15   29:new             #118 <Class EngineResource>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:iconst_1        
	//   19   35:invokespecial   #121 <Method void EngineResource(Resource, boolean)>
	//   20   38:areturn         
	}

	private ReferenceQueue getReferenceQueue()
	{
		if(resourceReferenceQueue == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field ReferenceQueue resourceReferenceQueue>
	//*   2    4:ifnonnull       39
		{
			resourceReferenceQueue = new ReferenceQueue();
	//    3    7:aload_0         
	//    4    8:new             #128 <Class ReferenceQueue>
	//    5   11:dup             
	//    6   12:invokespecial   #129 <Method void ReferenceQueue()>
	//    7   15:putfield        #126 <Field ReferenceQueue resourceReferenceQueue>
			Looper.myQueue().addIdleHandler(((android.os.MessageQueue.IdleHandler) (new RefQueueIdleHandler(activeResources, resourceReferenceQueue))));
	//    8   18:invokestatic    #135 <Method MessageQueue Looper.myQueue()>
	//    9   21:new             #28  <Class Engine$RefQueueIdleHandler>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:getfield        #80  <Field Map activeResources>
	//   13   29:aload_0         
	//   14   30:getfield        #126 <Field ReferenceQueue resourceReferenceQueue>
	//   15   33:invokespecial   #138 <Method void Engine$RefQueueIdleHandler(Map, ReferenceQueue)>
	//   16   36:invokevirtual   #144 <Method void MessageQueue.addIdleHandler(android.os.MessageQueue$IdleHandler)>
		}
		return resourceReferenceQueue;
	//   17   39:aload_0         
	//   18   40:getfield        #126 <Field ReferenceQueue resourceReferenceQueue>
	//   19   43:areturn         
	}

	private EngineResource loadFromActiveResources(Key key, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_2         
	//*   1    1:ifne            6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		EngineResource engineresource = null;
	//    4    6:aconst_null     
	//    5    7:astore_3        
		WeakReference weakreference = (WeakReference)activeResources.get(((Object) (key)));
	//    6    8:aload_0         
	//    7    9:getfield        #80  <Field Map activeResources>
	//    8   12:aload_1         
	//    9   13:invokeinterface #153 <Method Object Map.get(Object)>
	//   10   18:checkcast       #155 <Class WeakReference>
	//   11   21:astore          4
		if(weakreference != null)
	//*  12   23:aload           4
	//*  13   25:ifnull          58
		{
			engineresource = (EngineResource)weakreference.get();
	//   14   28:aload           4
	//   15   30:invokevirtual   #158 <Method Object WeakReference.get()>
	//   16   33:checkcast       #118 <Class EngineResource>
	//   17   36:astore_3        
			if(engineresource != null)
	//*  18   37:aload_3         
	//*  19   38:ifnull          47
			{
				engineresource.acquire();
	//   20   41:aload_3         
	//   21   42:invokevirtual   #161 <Method void EngineResource.acquire()>
				return engineresource;
	//   22   45:aload_3         
	//   23   46:areturn         
			}
			activeResources.remove(((Object) (key)));
	//   24   47:aload_0         
	//   25   48:getfield        #80  <Field Map activeResources>
	//   26   51:aload_1         
	//   27   52:invokeinterface #163 <Method Object Map.remove(Object)>
	//   28   57:pop             
		}
		return engineresource;
	//   29   58:aload_3         
	//   30   59:areturn         
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
	//    6    8:invokespecial   #167 <Method EngineResource getEngineResourceFromCache(Key)>
	//    7   11:astore_3        
		if(engineresource != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          44
		{
			engineresource.acquire();
	//   10   16:aload_3         
	//   11   17:invokevirtual   #161 <Method void EngineResource.acquire()>
			activeResources.put(((Object) (key)), ((Object) (new ResourceWeakReference(key, engineresource, getReferenceQueue()))));
	//   12   20:aload_0         
	//   13   21:getfield        #80  <Field Map activeResources>
	//   14   24:aload_1         
	//   15   25:new             #31  <Class Engine$ResourceWeakReference>
	//   16   28:dup             
	//   17   29:aload_1         
	//   18   30:aload_3         
	//   19   31:aload_0         
	//   20   32:invokespecial   #169 <Method ReferenceQueue getReferenceQueue()>
	//   21   35:invokespecial   #172 <Method void Engine$ResourceWeakReference(Key, EngineResource, ReferenceQueue)>
	//   22   38:invokeinterface #176 <Method Object Map.put(Object, Object)>
	//   23   43:pop             
		}
		return engineresource;
	//   24   44:aload_3         
	//   25   45:areturn         
	}

	private static void logWithTimeAndKey(String s, long l, Key key)
	{
		Log.v("Engine", (new StringBuilder()).append(s).append(" in ").append(LogTime.getElapsedMillis(l)).append("ms, key: ").append(((Object) (key))).toString());
	//    0    0:ldc1            #39  <String "Engine">
	//    1    2:new             #180 <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #181 <Method void StringBuilder()>
	//    4    9:aload_0         
	//    5   10:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//    6   13:ldc1            #187 <String " in ">
	//    7   15:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:lload_1         
	//    9   19:invokestatic    #193 <Method double LogTime.getElapsedMillis(long)>
	//   10   22:invokevirtual   #196 <Method StringBuilder StringBuilder.append(double)>
	//   11   25:ldc1            #198 <String "ms, key: ">
	//   12   27:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   13   30:aload_3         
	//   14   31:invokevirtual   #201 <Method StringBuilder StringBuilder.append(Object)>
	//   15   34:invokevirtual   #205 <Method String StringBuilder.toString()>
	//   16   37:invokestatic    #211 <Method int Log.v(String, String)>
	//   17   40:pop             
	//   18   41:return          
	}

	public void clearDiskCache()
	{
		diskCacheProvider.getDiskCache().clear();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field Engine$LazyDiskCacheProvider diskCacheProvider>
	//    2    4:invokevirtual   #216 <Method DiskCache Engine$LazyDiskCacheProvider.getDiskCache()>
	//    3    7:invokeinterface #221 <Method void DiskCache.clear()>
	//    4   12:return          
	}

	public LoadStatus load(GlideContext glidecontext, Object obj, Key key, int i, int j, Class class1, Class class2, 
			Priority priority, DiskCacheStrategy diskcachestrategy, Map map, boolean flag, boolean flag1, Options options, boolean flag2, 
			boolean flag3, boolean flag4, ResourceCallback resourcecallback)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #228 <Method void Util.assertMainThread()>
		long l = LogTime.getLogTime();
	//    1    3:invokestatic    #232 <Method long LogTime.getLogTime()>
	//    2    6:lstore          18
		EngineKey enginekey = keyFactory.buildKey(obj, key, i, j, map, class1, class2, options);
	//    3    8:aload_0         
	//    4    9:getfield        #85  <Field EngineKeyFactory keyFactory>
	//    5   12:aload_2         
	//    6   13:aload_3         
	//    7   14:iload           4
	//    8   16:iload           5
	//    9   18:aload           10
	//   10   20:aload           6
	//   11   22:aload           7
	//   12   24:aload           13
	//   13   26:invokevirtual   #236 <Method EngineKey EngineKeyFactory.buildKey(Object, Key, int, int, Map, Class, Class, Options)>
	//   14   29:astore          20
		Object obj1 = ((Object) (loadFromCache(((Key) (enginekey)), flag2)));
	//   15   31:aload_0         
	//   16   32:aload           20
	//   17   34:iload           14
	//   18   36:invokespecial   #238 <Method EngineResource loadFromCache(Key, boolean)>
	//   19   39:astore          21
		if(obj1 != null)
	//*  20   41:aload           21
	//*  21   43:ifnull          79
		{
			resourcecallback.onResourceReady(((Resource) (obj1)), DataSource.MEMORY_CACHE);
	//   22   46:aload           17
	//   23   48:aload           21
	//   24   50:getstatic       #244 <Field DataSource DataSource.MEMORY_CACHE>
	//   25   53:invokeinterface #250 <Method void ResourceCallback.onResourceReady(Resource, DataSource)>
			if(Log.isLoggable("Engine", 2))
	//*  26   58:ldc1            #39  <String "Engine">
	//*  27   60:iconst_2        
	//*  28   61:invokestatic    #254 <Method boolean Log.isLoggable(String, int)>
	//*  29   64:ifeq            77
				logWithTimeAndKey("Loaded resource from cache", l, ((Key) (enginekey)));
	//   30   67:ldc2            #256 <String "Loaded resource from cache">
	//   31   70:lload           18
	//   32   72:aload           20
	//   33   74:invokestatic    #258 <Method void logWithTimeAndKey(String, long, Key)>
			return null;
	//   34   77:aconst_null     
	//   35   78:areturn         
		}
		obj1 = ((Object) (loadFromActiveResources(((Key) (enginekey)), flag2)));
	//   36   79:aload_0         
	//   37   80:aload           20
	//   38   82:iload           14
	//   39   84:invokespecial   #260 <Method EngineResource loadFromActiveResources(Key, boolean)>
	//   40   87:astore          21
		if(obj1 != null)
	//*  41   89:aload           21
	//*  42   91:ifnull          127
		{
			resourcecallback.onResourceReady(((Resource) (obj1)), DataSource.MEMORY_CACHE);
	//   43   94:aload           17
	//   44   96:aload           21
	//   45   98:getstatic       #244 <Field DataSource DataSource.MEMORY_CACHE>
	//   46  101:invokeinterface #250 <Method void ResourceCallback.onResourceReady(Resource, DataSource)>
			if(Log.isLoggable("Engine", 2))
	//*  47  106:ldc1            #39  <String "Engine">
	//*  48  108:iconst_2        
	//*  49  109:invokestatic    #254 <Method boolean Log.isLoggable(String, int)>
	//*  50  112:ifeq            125
				logWithTimeAndKey("Loaded resource from active resources", l, ((Key) (enginekey)));
	//   51  115:ldc2            #262 <String "Loaded resource from active resources">
	//   52  118:lload           18
	//   53  120:aload           20
	//   54  122:invokestatic    #258 <Method void logWithTimeAndKey(String, long, Key)>
			return null;
	//   55  125:aconst_null     
	//   56  126:areturn         
		}
		obj1 = ((Object) ((EngineJob)jobs.get(((Object) (enginekey)))));
	//   57  127:aload_0         
	//   58  128:getfield        #87  <Field Map jobs>
	//   59  131:aload           20
	//   60  133:invokeinterface #153 <Method Object Map.get(Object)>
	//   61  138:checkcast       #264 <Class EngineJob>
	//   62  141:astore          21
		if(obj1 != null)
	//*  63  143:aload           21
	//*  64  145:ifnull          186
		{
			((EngineJob) (obj1)).addCallback(resourcecallback);
	//   65  148:aload           21
	//   66  150:aload           17
	//   67  152:invokevirtual   #268 <Method void EngineJob.addCallback(ResourceCallback)>
			if(Log.isLoggable("Engine", 2))
	//*  68  155:ldc1            #39  <String "Engine">
	//*  69  157:iconst_2        
	//*  70  158:invokestatic    #254 <Method boolean Log.isLoggable(String, int)>
	//*  71  161:ifeq            174
				logWithTimeAndKey("Added to existing load", l, ((Key) (enginekey)));
	//   72  164:ldc2            #270 <String "Added to existing load">
	//   73  167:lload           18
	//   74  169:aload           20
	//   75  171:invokestatic    #258 <Method void logWithTimeAndKey(String, long, Key)>
			return new LoadStatus(resourcecallback, ((EngineJob) (obj1)));
	//   76  174:new             #25  <Class Engine$LoadStatus>
	//   77  177:dup             
	//   78  178:aload           17
	//   79  180:aload           21
	//   80  182:invokespecial   #273 <Method void Engine$LoadStatus(ResourceCallback, EngineJob)>
	//   81  185:areturn         
		}
		obj1 = ((Object) (engineJobFactory.build(((Key) (enginekey)), flag2, flag3)));
	//   82  186:aload_0         
	//   83  187:getfield        #92  <Field Engine$EngineJobFactory engineJobFactory>
	//   84  190:aload           20
	//   85  192:iload           14
	//   86  194:iload           15
	//   87  196:invokevirtual   #277 <Method EngineJob Engine$EngineJobFactory.build(Key, boolean, boolean)>
	//   88  199:astore          21
		glidecontext = ((GlideContext) (decodeJobFactory.build(glidecontext, obj, enginekey, key, i, j, class1, class2, priority, diskcachestrategy, map, flag, flag1, flag4, options, ((DecodeJob.Callback) (obj1)))));
	//   89  201:aload_0         
	//   90  202:getfield        #97  <Field Engine$DecodeJobFactory decodeJobFactory>
	//   91  205:aload_1         
	//   92  206:aload_2         
	//   93  207:aload           20
	//   94  209:aload_3         
	//   95  210:iload           4
	//   96  212:iload           5
	//   97  214:aload           6
	//   98  216:aload           7
	//   99  218:aload           8
	//  100  220:aload           9
	//  101  222:aload           10
	//  102  224:iload           11
	//  103  226:iload           12
	//  104  228:iload           16
	//  105  230:aload           13
	//  106  232:aload           21
	//  107  234:invokevirtual   #280 <Method DecodeJob Engine$DecodeJobFactory.build(GlideContext, Object, EngineKey, Key, int, int, Class, Class, Priority, DiskCacheStrategy, Map, boolean, boolean, boolean, Options, DecodeJob$Callback)>
	//  108  237:astore_1        
		jobs.put(((Object) (enginekey)), obj1);
	//  109  238:aload_0         
	//  110  239:getfield        #87  <Field Map jobs>
	//  111  242:aload           20
	//  112  244:aload           21
	//  113  246:invokeinterface #176 <Method Object Map.put(Object, Object)>
	//  114  251:pop             
		((EngineJob) (obj1)).addCallback(resourcecallback);
	//  115  252:aload           21
	//  116  254:aload           17
	//  117  256:invokevirtual   #268 <Method void EngineJob.addCallback(ResourceCallback)>
		((EngineJob) (obj1)).start(((DecodeJob) (glidecontext)));
	//  118  259:aload           21
	//  119  261:aload_1         
	//  120  262:invokevirtual   #284 <Method void EngineJob.start(DecodeJob)>
		if(Log.isLoggable("Engine", 2))
	//* 121  265:ldc1            #39  <String "Engine">
	//* 122  267:iconst_2        
	//* 123  268:invokestatic    #254 <Method boolean Log.isLoggable(String, int)>
	//* 124  271:ifeq            284
			logWithTimeAndKey("Started new load", l, ((Key) (enginekey)));
	//  125  274:ldc2            #286 <String "Started new load">
	//  126  277:lload           18
	//  127  279:aload           20
	//  128  281:invokestatic    #258 <Method void logWithTimeAndKey(String, long, Key)>
		return new LoadStatus(resourcecallback, ((EngineJob) (obj1)));
	//  129  284:new             #25  <Class Engine$LoadStatus>
	//  130  287:dup             
	//  131  288:aload           17
	//  132  290:aload           21
	//  133  292:invokespecial   #273 <Method void Engine$LoadStatus(ResourceCallback, EngineJob)>
	//  134  295:areturn         
	}

	public void onEngineJobCancelled(EngineJob enginejob, Key key)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #228 <Method void Util.assertMainThread()>
		if(((Object) (enginejob)).equals(((Object) ((EngineJob)jobs.get(((Object) (key)))))))
	//*   1    3:aload_1         
	//*   2    4:aload_0         
	//*   3    5:getfield        #87  <Field Map jobs>
	//*   4    8:aload_2         
	//*   5    9:invokeinterface #153 <Method Object Map.get(Object)>
	//*   6   14:checkcast       #264 <Class EngineJob>
	//*   7   17:invokevirtual   #293 <Method boolean Object.equals(Object)>
	//*   8   20:ifeq            34
			jobs.remove(((Object) (key)));
	//    9   23:aload_0         
	//   10   24:getfield        #87  <Field Map jobs>
	//   11   27:aload_2         
	//   12   28:invokeinterface #163 <Method Object Map.remove(Object)>
	//   13   33:pop             
	//   14   34:return          
	}

	public void onEngineJobComplete(Key key, EngineResource engineresource)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #228 <Method void Util.assertMainThread()>
		if(engineresource != null)
	//*   1    3:aload_2         
	//*   2    4:ifnull          44
		{
			engineresource.setResourceListener(key, ((EngineResource.ResourceListener) (this)));
	//    3    7:aload_2         
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #299 <Method void EngineResource.setResourceListener(Key, EngineResource$ResourceListener)>
			if(engineresource.isCacheable())
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #303 <Method boolean EngineResource.isCacheable()>
	//*   9   17:ifeq            44
				activeResources.put(((Object) (key)), ((Object) (new ResourceWeakReference(key, engineresource, getReferenceQueue()))));
	//   10   20:aload_0         
	//   11   21:getfield        #80  <Field Map activeResources>
	//   12   24:aload_1         
	//   13   25:new             #31  <Class Engine$ResourceWeakReference>
	//   14   28:dup             
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:aload_0         
	//   18   32:invokespecial   #169 <Method ReferenceQueue getReferenceQueue()>
	//   19   35:invokespecial   #172 <Method void Engine$ResourceWeakReference(Key, EngineResource, ReferenceQueue)>
	//   20   38:invokeinterface #176 <Method Object Map.put(Object, Object)>
	//   21   43:pop             
		}
		jobs.remove(((Object) (key)));
	//   22   44:aload_0         
	//   23   45:getfield        #87  <Field Map jobs>
	//   24   48:aload_1         
	//   25   49:invokeinterface #163 <Method Object Map.remove(Object)>
	//   26   54:pop             
	//   27   55:return          
	}

	public void onResourceReleased(Key key, EngineResource engineresource)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #228 <Method void Util.assertMainThread()>
		activeResources.remove(((Object) (key)));
	//    1    3:aload_0         
	//    2    4:getfield        #80  <Field Map activeResources>
	//    3    7:aload_1         
	//    4    8:invokeinterface #163 <Method Object Map.remove(Object)>
	//    5   13:pop             
		if(engineresource.isCacheable())
	//*   6   14:aload_2         
	//*   7   15:invokevirtual   #303 <Method boolean EngineResource.isCacheable()>
	//*   8   18:ifeq            34
		{
			cache.put(key, ((Resource) (engineresource)));
	//    9   21:aload_0         
	//   10   22:getfield        #70  <Field MemoryCache cache>
	//   11   25:aload_1         
	//   12   26:aload_2         
	//   13   27:invokeinterface #308 <Method Resource MemoryCache.put(Key, Resource)>
	//   14   32:pop             
			return;
	//   15   33:return          
		} else
		{
			resourceRecycler.recycle(((Resource) (engineresource)));
	//   16   34:aload_0         
	//   17   35:getfield        #102 <Field ResourceRecycler resourceRecycler>
	//   18   38:aload_2         
	//   19   39:invokevirtual   #312 <Method void ResourceRecycler.recycle(Resource)>
			return;
	//   20   42:return          
		}
	}

	public void onResourceRemoved(Resource resource)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #228 <Method void Util.assertMainThread()>
		resourceRecycler.recycle(resource);
	//    1    3:aload_0         
	//    2    4:getfield        #102 <Field ResourceRecycler resourceRecycler>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #312 <Method void ResourceRecycler.recycle(Resource)>
	//    5   11:return          
	}

	public void release(Resource resource)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #228 <Method void Util.assertMainThread()>
		if(resource instanceof EngineResource)
	//*   1    3:aload_1         
	//*   2    4:instanceof      #118 <Class EngineResource>
	//*   3    7:ifeq            18
		{
			((EngineResource)resource).release();
	//    4   10:aload_1         
	//    5   11:checkcast       #118 <Class EngineResource>
	//    6   14:invokevirtual   #317 <Method void EngineResource.release()>
			return;
	//    7   17:return          
		} else
		{
			throw new IllegalArgumentException("Cannot release anything but an EngineResource");
	//    8   18:new             #319 <Class IllegalArgumentException>
	//    9   21:dup             
	//   10   22:ldc2            #321 <String "Cannot release anything but an EngineResource">
	//   11   25:invokespecial   #324 <Method void IllegalArgumentException(String)>
	//   12   28:athrow          
		}
	}

	private static final int JOB_POOL_SIZE = 150;
	private static final String TAG = "Engine";
	private final Map activeResources;
	private final MemoryCache cache;
	private final DecodeJobFactory decodeJobFactory;
	private final LazyDiskCacheProvider diskCacheProvider;
	private final EngineJobFactory engineJobFactory;
	private final Map jobs;
	private final EngineKeyFactory keyFactory;
	private final ResourceRecycler resourceRecycler;
	private ReferenceQueue resourceReferenceQueue;

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
			return new EngineJob(diskCacheExecutor, sourceExecutor, sourceUnlimitedExecutor, listener, pool);
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
		//   13   29:getfield        #40  <Field EngineJobListener Engine$EngineJobFactory.listener>
		//   14   32:aload_0         
		//   15   33:getfield        #18  <Field Engine$EngineJobFactory this$0>
		//   16   36:getfield        #44  <Field android.support.v4.util.Pools$Pool Engine$EngineJobFactory.pool>
		//   17   39:invokespecial   #47  <Method void EngineJob(GlideExecutor, GlideExecutor, GlideExecutor, EngineJobListener, android.support.v4.util.Pools$Pool)>
		//   18   42:areturn         
		}

		public volatile Object create()
		{
			return ((Object) (create()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #52  <Method EngineJob create()>
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
