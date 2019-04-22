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
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.Map;
import java.util.concurrent.Executor;

// Referenced classes of package com.bumptech.glide.load.engine:
//			EngineJobListener, ActiveResources, EngineKeyFactory, Jobs, 
//			ResourceRecycler, EngineResource, EngineJob, DiskCacheStrategy, 
//			Resource, DecodeJob, EngineKey

public class Engine
	implements EngineJobListener, EngineResource.ResourceListener, com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener
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
		final android.support.v4.util.Pools.Pool pool = FactoryPools.threadSafe(150, new _cls1());

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
		//    8   16:invokestatic    #31  <Method android.support.v4.util.Pools$Pool FactoryPools.threadSafe(int, com.bumptech.glide.util.pool.FactoryPools$Factory)>
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

		EngineJob build(Key key, boolean flag, boolean flag1, boolean flag2, boolean flag3)
		{
			return ((EngineJob)Preconditions.checkNotNull(((Object) ((EngineJob)pool.acquire())))).init(key, flag, flag1, flag2, flag3);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field android.support.v4.util.Pools$Pool pool>
		//    2    4:invokeinterface #55  <Method Object android.support.v4.util.Pools$Pool.acquire()>
		//    3    9:checkcast       #57  <Class EngineJob>
		//    4   12:invokestatic    #63  <Method Object Preconditions.checkNotNull(Object)>
		//    5   15:checkcast       #57  <Class EngineJob>
		//    6   18:aload_1         
		//    7   19:iload_2         
		//    8   20:iload_3         
		//    9   21:iload           4
		//   10   23:iload           5
		//   11   25:invokevirtual   #66  <Method EngineJob EngineJob.init(Key, boolean, boolean, boolean, boolean)>
		//   12   28:areturn         
		}

		final GlideExecutor animationExecutor;
		final GlideExecutor diskCacheExecutor;
		final EngineJobListener listener;
		final android.support.v4.util.Pools.Pool pool = FactoryPools.threadSafe(150, new _cls1());
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
		//    8   16:invokestatic    #34  <Method android.support.v4.util.Pools$Pool FactoryPools.threadSafe(int, com.bumptech.glide.util.pool.FactoryPools$Factory)>
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

	public class LoadStatus
	{

		public void cancel()
		{
			synchronized(Engine.this)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field Engine this$0>
		//*   2    4:astore_1        
		//*   3    5:aload_1         
		//*   4    6:monitorenter    
			{
				engineJob.removeCallback(cb);
		//    5    7:aload_0         
		//    6    8:getfield        #25  <Field EngineJob engineJob>
		//    7   11:aload_0         
		//    8   12:getfield        #23  <Field ResourceCallback cb>
		//    9   15:invokevirtual   #35  <Method void EngineJob.removeCallback(ResourceCallback)>
			}
		//   10   18:aload_1         
		//   11   19:monitorexit     
			return;
		//   12   20:return          
			exception;
		//   13   21:astore_2        
			engine;
		//   14   22:aload_1         
			JVM INSTR monitorexit ;
		//   15   23:monitorexit     
			throw exception;
		//   16   24:aload_2         
		//   17   25:athrow          
		}

		private final ResourceCallback cb;
		private final EngineJob engineJob;
		final Engine this$0;

		LoadStatus(ResourceCallback resourcecallback, EngineJob enginejob)
		{
			this$0 = Engine.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field Engine this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
			cb = resourcecallback;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field ResourceCallback cb>
			engineJob = enginejob;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #25  <Field EngineJob engineJob>
		//   11   19:return          
		}
	}


	Engine(MemoryCache memorycache, com.bumptech.glide.load.engine.cache.DiskCache.Factory factory, GlideExecutor glideexecutor, GlideExecutor glideexecutor1, GlideExecutor glideexecutor2, GlideExecutor glideexecutor3, Jobs jobs1, 
			EngineKeyFactory enginekeyfactory, ActiveResources activeresources, EngineJobFactory enginejobfactory, DecodeJobFactory decodejobfactory, ResourceRecycler resourcerecycler, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void Object()>
		cache = memorycache;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #64  <Field MemoryCache cache>
		diskCacheProvider = new LazyDiskCacheProvider(factory);
	//    5    9:aload_0         
	//    6   10:new             #22  <Class Engine$LazyDiskCacheProvider>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #67  <Method void Engine$LazyDiskCacheProvider(com.bumptech.glide.load.engine.cache.DiskCache$Factory)>
	//   10   18:putfield        #69  <Field Engine$LazyDiskCacheProvider diskCacheProvider>
		if(activeresources == null)
	//*  11   21:aload           9
	//*  12   23:ifnonnull       40
			activeresources = new ActiveResources(flag);
	//   13   26:new             #71  <Class ActiveResources>
	//   14   29:dup             
	//   15   30:iload           13
	//   16   32:invokespecial   #74  <Method void ActiveResources(boolean)>
	//   17   35:astore          9
	//*  18   37:goto            40
		activeResources = activeresources;
	//   19   40:aload_0         
	//   20   41:aload           9
	//   21   43:putfield        #76  <Field ActiveResources activeResources>
		activeresources.setListener(((EngineResource.ResourceListener) (this)));
	//   22   46:aload           9
	//   23   48:aload_0         
	//   24   49:invokevirtual   #80  <Method void ActiveResources.setListener(EngineResource$ResourceListener)>
		if(enginekeyfactory == null)
	//*  25   52:aload           8
	//*  26   54:ifnonnull       69
			enginekeyfactory = new EngineKeyFactory();
	//   27   57:new             #82  <Class EngineKeyFactory>
	//   28   60:dup             
	//   29   61:invokespecial   #83  <Method void EngineKeyFactory()>
	//   30   64:astore          8
	//*  31   66:goto            69
		keyFactory = enginekeyfactory;
	//   32   69:aload_0         
	//   33   70:aload           8
	//   34   72:putfield        #85  <Field EngineKeyFactory keyFactory>
		if(jobs1 == null)
	//*  35   75:aload           7
	//*  36   77:ifnonnull       92
			jobs1 = new Jobs();
	//   37   80:new             #87  <Class Jobs>
	//   38   83:dup             
	//   39   84:invokespecial   #88  <Method void Jobs()>
	//   40   87:astore          7
	//*  41   89:goto            92
		jobs = jobs1;
	//   42   92:aload_0         
	//   43   93:aload           7
	//   44   95:putfield        #90  <Field Jobs jobs>
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
	//   54  115:invokespecial   #93  <Method void Engine$EngineJobFactory(GlideExecutor, GlideExecutor, GlideExecutor, GlideExecutor, EngineJobListener)>
	//   55  118:astore          10
	//*  56  120:goto            123
		engineJobFactory = enginejobfactory;
	//   57  123:aload_0         
	//   58  124:aload           10
	//   59  126:putfield        #95  <Field Engine$EngineJobFactory engineJobFactory>
		if(decodejobfactory == null)
	//*  60  129:aload           11
	//*  61  131:ifnonnull       150
			decodejobfactory = new DecodeJobFactory(((DecodeJob.DiskCacheProvider) (diskCacheProvider)));
	//   62  134:new             #12  <Class Engine$DecodeJobFactory>
	//   63  137:dup             
	//   64  138:aload_0         
	//   65  139:getfield        #69  <Field Engine$LazyDiskCacheProvider diskCacheProvider>
	//   66  142:invokespecial   #98  <Method void Engine$DecodeJobFactory(DecodeJob$DiskCacheProvider)>
	//   67  145:astore          11
	//*  68  147:goto            150
		decodeJobFactory = decodejobfactory;
	//   69  150:aload_0         
	//   70  151:aload           11
	//   71  153:putfield        #100 <Field Engine$DecodeJobFactory decodeJobFactory>
		if(resourcerecycler == null)
	//*  72  156:aload           12
	//*  73  158:ifnonnull       173
			resourcerecycler = new ResourceRecycler();
	//   74  161:new             #102 <Class ResourceRecycler>
	//   75  164:dup             
	//   76  165:invokespecial   #103 <Method void ResourceRecycler()>
	//   77  168:astore          12
	//*  78  170:goto            173
		resourceRecycler = resourcerecycler;
	//   79  173:aload_0         
	//   80  174:aload           12
	//   81  176:putfield        #105 <Field ResourceRecycler resourceRecycler>
		memorycache.setResourceRemovedListener(((com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener) (this)));
	//   82  179:aload_1         
	//   83  180:aload_0         
	//   84  181:invokeinterface #111 <Method void MemoryCache.setResourceRemovedListener(com.bumptech.glide.load.engine.cache.MemoryCache$ResourceRemovedListener)>
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
	//   14   18:invokespecial   #115 <Method void Engine(MemoryCache, com.bumptech.glide.load.engine.cache.DiskCache$Factory, GlideExecutor, GlideExecutor, GlideExecutor, GlideExecutor, Jobs, EngineKeyFactory, ActiveResources, Engine$EngineJobFactory, Engine$DecodeJobFactory, ResourceRecycler, boolean)>
	//   15   21:return          
	}

	private EngineResource getEngineResourceFromCache(Key key)
	{
		key = ((Key) (cache.remove(key)));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field MemoryCache cache>
	//    2    4:aload_1         
	//    3    5:invokeinterface #121 <Method Resource MemoryCache.remove(Key)>
	//    4   10:astore_1        
		if(key == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       17
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		if(key instanceof EngineResource)
	//*   9   17:aload_1         
	//*  10   18:instanceof      #123 <Class EngineResource>
	//*  11   21:ifeq            29
			return (EngineResource)key;
	//   12   24:aload_1         
	//   13   25:checkcast       #123 <Class EngineResource>
	//   14   28:areturn         
		else
			return new EngineResource(((Resource) (key)), true, true);
	//   15   29:new             #123 <Class EngineResource>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:iconst_1        
	//   19   35:iconst_1        
	//   20   36:invokespecial   #126 <Method void EngineResource(Resource, boolean, boolean)>
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
	//    5    7:getfield        #76  <Field ActiveResources activeResources>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #134 <Method EngineResource ActiveResources.get(Key)>
	//    8   14:astore_1        
		if(key != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          23
			((EngineResource) (key)).acquire();
	//   11   19:aload_1         
	//   12   20:invokevirtual   #137 <Method void EngineResource.acquire()>
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
	//    6    8:invokespecial   #141 <Method EngineResource getEngineResourceFromCache(Key)>
	//    7   11:astore_3        
		if(engineresource != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          29
		{
			engineresource.acquire();
	//   10   16:aload_3         
	//   11   17:invokevirtual   #137 <Method void EngineResource.acquire()>
			activeResources.activate(key, engineresource);
	//   12   20:aload_0         
	//   13   21:getfield        #76  <Field ActiveResources activeResources>
	//   14   24:aload_1         
	//   15   25:aload_3         
	//   16   26:invokevirtual   #145 <Method void ActiveResources.activate(Key, EngineResource)>
		}
		return engineresource;
	//   17   29:aload_3         
	//   18   30:areturn         
	}

	private static void logWithTimeAndKey(String s, long l, Key key)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #149 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #150 <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append(s);
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(" in ");
	//    8   16:aload           4
	//    9   18:ldc1            #156 <String " in ">
	//   10   20:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(LogTime.getElapsedMillis(l));
	//   12   24:aload           4
	//   13   26:lload_1         
	//   14   27:invokestatic    #162 <Method double LogTime.getElapsedMillis(long)>
	//   15   30:invokevirtual   #165 <Method StringBuilder StringBuilder.append(double)>
	//   16   33:pop             
		stringbuilder.append("ms, key: ");
	//   17   34:aload           4
	//   18   36:ldc1            #167 <String "ms, key: ">
	//   19   38:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
		stringbuilder.append(((Object) (key)));
	//   21   42:aload           4
	//   22   44:aload_3         
	//   23   45:invokevirtual   #170 <Method StringBuilder StringBuilder.append(Object)>
	//   24   48:pop             
		Log.v("Engine", stringbuilder.toString());
	//   25   49:ldc1            #48  <String "Engine">
	//   26   51:aload           4
	//   27   53:invokevirtual   #174 <Method String StringBuilder.toString()>
	//   28   56:invokestatic    #178 <Method int Log.v(String, String)>
	//   29   59:pop             
	//   30   60:return          
	}

	public LoadStatus load(GlideContext glidecontext, Object obj, Key key, int i, int j, Class class1, Class class2, 
			Priority priority, DiskCacheStrategy diskcachestrategy, Map map, boolean flag, boolean flag1, Options options, boolean flag2, 
			boolean flag3, boolean flag4, boolean flag5, ResourceCallback resourcecallback, Executor executor)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!VERBOSE_IS_LOGGABLE) goto _L2; else goto _L1
	//    2    2:getstatic       #56  <Field boolean VERBOSE_IS_LOGGABLE>
	//    3    5:ifeq            309
_L1:
		long l = LogTime.getLogTime();
	//    4    8:invokestatic    #184 <Method long LogTime.getLogTime()>
	//    5   11:lstore          20
	//*   6   13:goto            16
_L4:
		EngineKey enginekey;
		Object obj1;
		enginekey = keyFactory.buildKey(obj, key, i, j, map, class1, class2, options);
	//    7   16:aload_0         
	//    8   17:getfield        #85  <Field EngineKeyFactory keyFactory>
	//    9   20:aload_2         
	//   10   21:aload_3         
	//   11   22:iload           4
	//   12   24:iload           5
	//   13   26:aload           10
	//   14   28:aload           6
	//   15   30:aload           7
	//   16   32:aload           13
	//   17   34:invokevirtual   #188 <Method EngineKey EngineKeyFactory.buildKey(Object, Key, int, int, Map, Class, Class, Options)>
	//   18   37:astore          22
		obj1 = ((Object) (loadFromActiveResources(((Key) (enginekey)), flag2)));
	//   19   39:aload_0         
	//   20   40:aload           22
	//   21   42:iload           14
	//   22   44:invokespecial   #190 <Method EngineResource loadFromActiveResources(Key, boolean)>
	//   23   47:astore          23
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_85;
	//   24   49:aload           23
	//   25   51:ifnull          85
		resourcecallback.onResourceReady(((Resource) (obj1)), DataSource.MEMORY_CACHE);
	//   26   54:aload           18
	//   27   56:aload           23
	//   28   58:getstatic       #196 <Field DataSource DataSource.MEMORY_CACHE>
	//   29   61:invokeinterface #202 <Method void ResourceCallback.onResourceReady(Resource, DataSource)>
		if(VERBOSE_IS_LOGGABLE)
	//*  30   66:getstatic       #56  <Field boolean VERBOSE_IS_LOGGABLE>
	//*  31   69:ifeq            81
			logWithTimeAndKey("Loaded resource from active resources", l, ((Key) (enginekey)));
	//   32   72:ldc1            #204 <String "Loaded resource from active resources">
	//   33   74:lload           20
	//   34   76:aload           22
	//   35   78:invokestatic    #206 <Method void logWithTimeAndKey(String, long, Key)>
		this;
	//   36   81:aload_0         
		JVM INSTR monitorexit ;
	//   37   82:monitorexit     
		return null;
	//   38   83:aconst_null     
	//   39   84:areturn         
		obj1 = ((Object) (loadFromCache(((Key) (enginekey)), flag2)));
	//   40   85:aload_0         
	//   41   86:aload           22
	//   42   88:iload           14
	//   43   90:invokespecial   #208 <Method EngineResource loadFromCache(Key, boolean)>
	//   44   93:astore          23
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_131;
	//   45   95:aload           23
	//   46   97:ifnull          131
		resourcecallback.onResourceReady(((Resource) (obj1)), DataSource.MEMORY_CACHE);
	//   47  100:aload           18
	//   48  102:aload           23
	//   49  104:getstatic       #196 <Field DataSource DataSource.MEMORY_CACHE>
	//   50  107:invokeinterface #202 <Method void ResourceCallback.onResourceReady(Resource, DataSource)>
		if(VERBOSE_IS_LOGGABLE)
	//*  51  112:getstatic       #56  <Field boolean VERBOSE_IS_LOGGABLE>
	//*  52  115:ifeq            127
			logWithTimeAndKey("Loaded resource from cache", l, ((Key) (enginekey)));
	//   53  118:ldc1            #210 <String "Loaded resource from cache">
	//   54  120:lload           20
	//   55  122:aload           22
	//   56  124:invokestatic    #206 <Method void logWithTimeAndKey(String, long, Key)>
		this;
	//   57  127:aload_0         
		JVM INSTR monitorexit ;
	//   58  128:monitorexit     
		return null;
	//   59  129:aconst_null     
	//   60  130:areturn         
		obj1 = ((Object) (jobs.get(((Key) (enginekey)), flag5)));
	//   61  131:aload_0         
	//   62  132:getfield        #90  <Field Jobs jobs>
	//   63  135:aload           22
	//   64  137:iload           17
	//   65  139:invokevirtual   #213 <Method EngineJob Jobs.get(Key, boolean)>
	//   66  142:astore          23
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_190;
	//   67  144:aload           23
	//   68  146:ifnull          190
		((EngineJob) (obj1)).addCallback(resourcecallback, executor);
	//   69  149:aload           23
	//   70  151:aload           18
	//   71  153:aload           19
	//   72  155:invokevirtual   #219 <Method void EngineJob.addCallback(ResourceCallback, Executor)>
		if(VERBOSE_IS_LOGGABLE)
	//*  73  158:getstatic       #56  <Field boolean VERBOSE_IS_LOGGABLE>
	//*  74  161:ifeq            173
			logWithTimeAndKey("Added to existing load", l, ((Key) (enginekey)));
	//   75  164:ldc1            #221 <String "Added to existing load">
	//   76  166:lload           20
	//   77  168:aload           22
	//   78  170:invokestatic    #206 <Method void logWithTimeAndKey(String, long, Key)>
		glidecontext = ((GlideContext) (new LoadStatus(resourcecallback, ((EngineJob) (obj1)))));
	//   79  173:new             #25  <Class Engine$LoadStatus>
	//   80  176:dup             
	//   81  177:aload_0         
	//   82  178:aload           18
	//   83  180:aload           23
	//   84  182:invokespecial   #224 <Method void Engine$LoadStatus(Engine, ResourceCallback, EngineJob)>
	//   85  185:astore_1        
		this;
	//   86  186:aload_0         
		JVM INSTR monitorexit ;
	//   87  187:monitorexit     
		return ((LoadStatus) (glidecontext));
	//   88  188:aload_1         
	//   89  189:areturn         
		EngineJob enginejob = engineJobFactory.build(((Key) (enginekey)), flag2, flag3, flag4, flag5);
	//   90  190:aload_0         
	//   91  191:getfield        #95  <Field Engine$EngineJobFactory engineJobFactory>
	//   92  194:aload           22
	//   93  196:iload           14
	//   94  198:iload           15
	//   95  200:iload           16
	//   96  202:iload           17
	//   97  204:invokevirtual   #228 <Method EngineJob Engine$EngineJobFactory.build(Key, boolean, boolean, boolean, boolean)>
	//   98  207:astore          23
		glidecontext = ((GlideContext) (decodeJobFactory.build(glidecontext, obj, enginekey, key, i, j, class1, class2, priority, diskcachestrategy, map, flag, flag1, flag5, options, ((DecodeJob.Callback) (enginejob)))));
	//   99  209:aload_0         
	//  100  210:getfield        #100 <Field Engine$DecodeJobFactory decodeJobFactory>
	//  101  213:aload_1         
	//  102  214:aload_2         
	//  103  215:aload           22
	//  104  217:aload_3         
	//  105  218:iload           4
	//  106  220:iload           5
	//  107  222:aload           6
	//  108  224:aload           7
	//  109  226:aload           8
	//  110  228:aload           9
	//  111  230:aload           10
	//  112  232:iload           11
	//  113  234:iload           12
	//  114  236:iload           17
	//  115  238:aload           13
	//  116  240:aload           23
	//  117  242:invokevirtual   #231 <Method DecodeJob Engine$DecodeJobFactory.build(GlideContext, Object, EngineKey, Key, int, int, Class, Class, Priority, DiskCacheStrategy, Map, boolean, boolean, boolean, Options, DecodeJob$Callback)>
	//  118  245:astore_1        
		jobs.put(((Key) (enginekey)), enginejob);
	//  119  246:aload_0         
	//  120  247:getfield        #90  <Field Jobs jobs>
	//  121  250:aload           22
	//  122  252:aload           23
	//  123  254:invokevirtual   #235 <Method void Jobs.put(Key, EngineJob)>
		enginejob.addCallback(resourcecallback, executor);
	//  124  257:aload           23
	//  125  259:aload           18
	//  126  261:aload           19
	//  127  263:invokevirtual   #219 <Method void EngineJob.addCallback(ResourceCallback, Executor)>
		enginejob.start(((DecodeJob) (glidecontext)));
	//  128  266:aload           23
	//  129  268:aload_1         
	//  130  269:invokevirtual   #239 <Method void EngineJob.start(DecodeJob)>
		if(VERBOSE_IS_LOGGABLE)
	//* 131  272:getstatic       #56  <Field boolean VERBOSE_IS_LOGGABLE>
	//* 132  275:ifeq            287
			logWithTimeAndKey("Started new load", l, ((Key) (enginekey)));
	//  133  278:ldc1            #241 <String "Started new load">
	//  134  280:lload           20
	//  135  282:aload           22
	//  136  284:invokestatic    #206 <Method void logWithTimeAndKey(String, long, Key)>
		glidecontext = ((GlideContext) (new LoadStatus(resourcecallback, enginejob)));
	//  137  287:new             #25  <Class Engine$LoadStatus>
	//  138  290:dup             
	//  139  291:aload_0         
	//  140  292:aload           18
	//  141  294:aload           23
	//  142  296:invokespecial   #224 <Method void Engine$LoadStatus(Engine, ResourceCallback, EngineJob)>
	//  143  299:astore_1        
		this;
	//  144  300:aload_0         
		JVM INSTR monitorexit ;
	//  145  301:monitorexit     
		return ((LoadStatus) (glidecontext));
	//  146  302:aload_1         
	//  147  303:areturn         
		glidecontext;
	//  148  304:astore_1        
	//* 149  305:aload_0         
		throw glidecontext;
	//  150  306:monitorexit     
	//  151  307:aload_1         
	//  152  308:athrow          
_L2:
		l = 0L;
	//  153  309:lconst_0        
	//  154  310:lstore          20
		if(true) goto _L4; else goto _L3
	//  155  312:goto            16
_L3:
	}

	public void onEngineJobCancelled(EngineJob enginejob, Key key)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		jobs.removeIfCurrent(key, enginejob);
	//    2    2:aload_0         
	//    3    3:getfield        #90  <Field Jobs jobs>
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #247 <Method void Jobs.removeIfCurrent(Key, EngineJob)>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		enginejob;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw enginejob;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public void onEngineJobComplete(EngineJob enginejob, Key key, EngineResource engineresource)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(engineresource == null)
			break MISSING_BLOCK_LABEL_28;
	//    2    2:aload_3         
	//    3    3:ifnull          28
		engineresource.setResourceListener(key, ((EngineResource.ResourceListener) (this)));
	//    4    6:aload_3         
	//    5    7:aload_2         
	//    6    8:aload_0         
	//    7    9:invokevirtual   #254 <Method void EngineResource.setResourceListener(Key, EngineResource$ResourceListener)>
		if(engineresource.isCacheable())
	//*   8   12:aload_3         
	//*   9   13:invokevirtual   #258 <Method boolean EngineResource.isCacheable()>
	//*  10   16:ifeq            28
			activeResources.activate(key, engineresource);
	//   11   19:aload_0         
	//   12   20:getfield        #76  <Field ActiveResources activeResources>
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:invokevirtual   #145 <Method void ActiveResources.activate(Key, EngineResource)>
		jobs.removeIfCurrent(key, enginejob);
	//   16   28:aload_0         
	//   17   29:getfield        #90  <Field Jobs jobs>
	//   18   32:aload_2         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #247 <Method void Jobs.removeIfCurrent(Key, EngineJob)>
		this;
	//   21   37:aload_0         
		JVM INSTR monitorexit ;
	//   22   38:monitorexit     
		return;
	//   23   39:return          
		enginejob;
	//   24   40:astore_1        
	//*  25   41:aload_0         
		throw enginejob;
	//   26   42:monitorexit     
	//   27   43:aload_1         
	//   28   44:athrow          
	}

	public void onResourceReleased(Key key, EngineResource engineresource)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		activeResources.deactivate(key);
	//    2    2:aload_0         
	//    3    3:getfield        #76  <Field ActiveResources activeResources>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #264 <Method void ActiveResources.deactivate(Key)>
		if(engineresource.isCacheable())
	//*   6   10:aload_2         
	//*   7   11:invokevirtual   #258 <Method boolean EngineResource.isCacheable()>
	//*   8   14:ifeq            32
		{
			cache.put(key, ((Resource) (engineresource)));
	//    9   17:aload_0         
	//   10   18:getfield        #64  <Field MemoryCache cache>
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokeinterface #267 <Method Resource MemoryCache.put(Key, Resource)>
	//   14   28:pop             
			break MISSING_BLOCK_LABEL_40;
	//   15   29:goto            40
		}
		resourceRecycler.recycle(((Resource) (engineresource)));
	//   16   32:aload_0         
	//   17   33:getfield        #105 <Field ResourceRecycler resourceRecycler>
	//   18   36:aload_2         
	//   19   37:invokevirtual   #271 <Method void ResourceRecycler.recycle(Resource)>
		this;
	//   20   40:aload_0         
		JVM INSTR monitorexit ;
	//   21   41:monitorexit     
		return;
	//   22   42:return          
		key;
	//   23   43:astore_1        
	//*  24   44:aload_0         
		throw key;
	//   25   45:monitorexit     
	//   26   46:aload_1         
	//   27   47:athrow          
	}

	public void onResourceRemoved(Resource resource)
	{
		resourceRecycler.recycle(resource);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field ResourceRecycler resourceRecycler>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #271 <Method void ResourceRecycler.recycle(Resource)>
	//    4    8:return          
	}

	public void release(Resource resource)
	{
		if(resource instanceof EngineResource)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #123 <Class EngineResource>
	//*   2    4:ifeq            15
		{
			((EngineResource)resource).release();
	//    3    7:aload_1         
	//    4    8:checkcast       #123 <Class EngineResource>
	//    5   11:invokevirtual   #279 <Method void EngineResource.release()>
			return;
	//    6   14:return          
		} else
		{
			throw new IllegalArgumentException("Cannot release anything but an EngineResource");
	//    7   15:new             #281 <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:ldc2            #283 <String "Cannot release anything but an EngineResource">
	//   10   22:invokespecial   #286 <Method void IllegalArgumentException(String)>
	//   11   25:athrow          
		}
	}

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
	//    0    0:ldc1            #48  <String "Engine">
	//    1    2:iconst_2        
	//    2    3:invokestatic    #54  <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #56  <Field boolean VERBOSE_IS_LOGGABLE>
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
