// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.Executors;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.bumptech.glide.load.engine:
//			DecodeJob, CallbackException, EngineJobListener, EngineResource, 
//			Resource, GlideException

class EngineJob
	implements DecodeJob.Callback, com.bumptech.glide.util.pool.FactoryPools.Poolable
{
	private class CallLoadFailed
		implements Runnable
	{

		public void run()
		{
			synchronized(EngineJob.this)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field EngineJob this$0>
		//*   2    4:astore_1        
		//*   3    5:aload_1         
		//*   4    6:monitorenter    
			{
				if(cbs.contains(cb))
		//*   5    7:aload_0         
		//*   6    8:getfield        #17  <Field EngineJob this$0>
		//*   7   11:getfield        #28  <Field EngineJob$ResourceCallbacksAndExecutors EngineJob.cbs>
		//*   8   14:aload_0         
		//*   9   15:getfield        #22  <Field ResourceCallback cb>
		//*  10   18:invokevirtual   #34  <Method boolean EngineJob$ResourceCallbacksAndExecutors.contains(ResourceCallback)>
		//*  11   21:ifeq            35
					callCallbackOnLoadFailed(cb);
		//   12   24:aload_0         
		//   13   25:getfield        #17  <Field EngineJob this$0>
		//   14   28:aload_0         
		//   15   29:getfield        #22  <Field ResourceCallback cb>
		//   16   32:invokevirtual   #38  <Method void EngineJob.callCallbackOnLoadFailed(ResourceCallback)>
				decrementPendingCallbacks();
		//   17   35:aload_0         
		//   18   36:getfield        #17  <Field EngineJob this$0>
		//   19   39:invokevirtual   #41  <Method void EngineJob.decrementPendingCallbacks()>
			}
		//   20   42:aload_1         
		//   21   43:monitorexit     
			return;
		//   22   44:return          
			exception1;
		//   23   45:astore_2        
			enginejob;
		//   24   46:aload_1         
			JVM INSTR monitorexit ;
		//   25   47:monitorexit     
			throw exception1;
		//   26   48:aload_2         
		//   27   49:athrow          
		}

		private final ResourceCallback cb;
		final EngineJob this$0;

		CallLoadFailed(ResourceCallback resourcecallback)
		{
			this$0 = EngineJob.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field EngineJob this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			cb = resourcecallback;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field ResourceCallback cb>
		//    8   14:return          
		}
	}

	private class CallResourceReady
		implements Runnable
	{

		public void run()
		{
			synchronized(EngineJob.this)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field EngineJob this$0>
		//*   2    4:astore_1        
		//*   3    5:aload_1         
		//*   4    6:monitorenter    
			{
				if(cbs.contains(cb))
		//*   5    7:aload_0         
		//*   6    8:getfield        #17  <Field EngineJob this$0>
		//*   7   11:getfield        #28  <Field EngineJob$ResourceCallbacksAndExecutors EngineJob.cbs>
		//*   8   14:aload_0         
		//*   9   15:getfield        #22  <Field ResourceCallback cb>
		//*  10   18:invokevirtual   #34  <Method boolean EngineJob$ResourceCallbacksAndExecutors.contains(ResourceCallback)>
		//*  11   21:ifeq            56
				{
					engineResource.acquire();
		//   12   24:aload_0         
		//   13   25:getfield        #17  <Field EngineJob this$0>
		//   14   28:getfield        #38  <Field EngineResource EngineJob.engineResource>
		//   15   31:invokevirtual   #43  <Method void EngineResource.acquire()>
					callCallbackOnResourceReady(cb);
		//   16   34:aload_0         
		//   17   35:getfield        #17  <Field EngineJob this$0>
		//   18   38:aload_0         
		//   19   39:getfield        #22  <Field ResourceCallback cb>
		//   20   42:invokevirtual   #47  <Method void EngineJob.callCallbackOnResourceReady(ResourceCallback)>
					removeCallback(cb);
		//   21   45:aload_0         
		//   22   46:getfield        #17  <Field EngineJob this$0>
		//   23   49:aload_0         
		//   24   50:getfield        #22  <Field ResourceCallback cb>
		//   25   53:invokevirtual   #50  <Method void EngineJob.removeCallback(ResourceCallback)>
				}
				decrementPendingCallbacks();
		//   26   56:aload_0         
		//   27   57:getfield        #17  <Field EngineJob this$0>
		//   28   60:invokevirtual   #53  <Method void EngineJob.decrementPendingCallbacks()>
			}
		//   29   63:aload_1         
		//   30   64:monitorexit     
			return;
		//   31   65:return          
			exception1;
		//   32   66:astore_2        
			enginejob;
		//   33   67:aload_1         
			JVM INSTR monitorexit ;
		//   34   68:monitorexit     
			throw exception1;
		//   35   69:aload_2         
		//   36   70:athrow          
		}

		private final ResourceCallback cb;
		final EngineJob this$0;

		CallResourceReady(ResourceCallback resourcecallback)
		{
			this$0 = EngineJob.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field EngineJob this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			cb = resourcecallback;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field ResourceCallback cb>
		//    8   14:return          
		}
	}

	static class EngineResourceFactory
	{

		public EngineResource build(Resource resource1, boolean flag)
		{
			return new EngineResource(resource1, flag, true);
		//    0    0:new             #17  <Class EngineResource>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:iconst_1        
		//    5    7:invokespecial   #20  <Method void EngineResource(Resource, boolean, boolean)>
		//    6   10:areturn         
		}

		EngineResourceFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
		//    2    4:return          
		}
	}

	static final class ResourceCallbackAndExecutor
	{

		public boolean equals(Object obj)
		{
			if(obj instanceof ResourceCallbackAndExecutor)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class EngineJob$ResourceCallbackAndExecutor>
		//*   2    4:ifeq            24
			{
				obj = ((Object) ((ResourceCallbackAndExecutor)obj));
		//    3    7:aload_1         
		//    4    8:checkcast       #2   <Class EngineJob$ResourceCallbackAndExecutor>
		//    5   11:astore_1        
				return ((Object) (cb)).equals(((Object) (((ResourceCallbackAndExecutor) (obj)).cb)));
		//    6   12:aload_0         
		//    7   13:getfield        #18  <Field ResourceCallback cb>
		//    8   16:aload_1         
		//    9   17:getfield        #18  <Field ResourceCallback cb>
		//   10   20:invokevirtual   #25  <Method boolean Object.equals(Object)>
		//   11   23:ireturn         
			} else
			{
				return false;
		//   12   24:iconst_0        
		//   13   25:ireturn         
			}
		}

		public int hashCode()
		{
			return ((Object) (cb)).hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ResourceCallback cb>
		//    2    4:invokevirtual   #29  <Method int Object.hashCode()>
		//    3    7:ireturn         
		}

		final ResourceCallback cb;
		final Executor executor;

		ResourceCallbackAndExecutor(ResourceCallback resourcecallback, Executor executor1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			cb = resourcecallback;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field ResourceCallback cb>
			executor = executor1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field Executor executor>
		//    8   14:return          
		}
	}

	static final class ResourceCallbacksAndExecutors
		implements Iterable
	{

		private static ResourceCallbackAndExecutor defaultCallbackAndExecutor(ResourceCallback resourcecallback)
		{
			return new ResourceCallbackAndExecutor(resourcecallback, Executors.directExecutor());
		//    0    0:new             #34  <Class EngineJob$ResourceCallbackAndExecutor>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokestatic    #40  <Method Executor Executors.directExecutor()>
		//    4    8:invokespecial   #43  <Method void EngineJob$ResourceCallbackAndExecutor(ResourceCallback, Executor)>
		//    5   11:areturn         
		}

		void add(ResourceCallback resourcecallback, Executor executor)
		{
			callbacksAndExecutors.add(((Object) (new ResourceCallbackAndExecutor(resourcecallback, executor))));
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field List callbacksAndExecutors>
		//    2    4:new             #34  <Class EngineJob$ResourceCallbackAndExecutor>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokespecial   #43  <Method void EngineJob$ResourceCallbackAndExecutor(ResourceCallback, Executor)>
		//    7   13:invokeinterface #49  <Method boolean List.add(Object)>
		//    8   18:pop             
		//    9   19:return          
		}

		void clear()
		{
			callbacksAndExecutors.clear();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field List callbacksAndExecutors>
		//    2    4:invokeinterface #52  <Method void List.clear()>
		//    3    9:return          
		}

		boolean contains(ResourceCallback resourcecallback)
		{
			return callbacksAndExecutors.contains(((Object) (defaultCallbackAndExecutor(resourcecallback))));
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field List callbacksAndExecutors>
		//    2    4:aload_1         
		//    3    5:invokestatic    #56  <Method EngineJob$ResourceCallbackAndExecutor defaultCallbackAndExecutor(ResourceCallback)>
		//    4    8:invokeinterface #58  <Method boolean List.contains(Object)>
		//    5   13:ireturn         
		}

		ResourceCallbacksAndExecutors copy()
		{
			return new ResourceCallbacksAndExecutors(((List) (new ArrayList(((java.util.Collection) (callbacksAndExecutors))))));
		//    0    0:new             #2   <Class EngineJob$ResourceCallbacksAndExecutors>
		//    1    3:dup             
		//    2    4:new             #17  <Class ArrayList>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:getfield        #28  <Field List callbacksAndExecutors>
		//    6   12:invokespecial   #63  <Method void ArrayList(java.util.Collection)>
		//    7   15:invokespecial   #23  <Method void EngineJob$ResourceCallbacksAndExecutors(List)>
		//    8   18:areturn         
		}

		boolean isEmpty()
		{
			return callbacksAndExecutors.isEmpty();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field List callbacksAndExecutors>
		//    2    4:invokeinterface #67  <Method boolean List.isEmpty()>
		//    3    9:ireturn         
		}

		public Iterator iterator()
		{
			return callbacksAndExecutors.iterator();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field List callbacksAndExecutors>
		//    2    4:invokeinterface #72  <Method Iterator List.iterator()>
		//    3    9:areturn         
		}

		void remove(ResourceCallback resourcecallback)
		{
			callbacksAndExecutors.remove(((Object) (defaultCallbackAndExecutor(resourcecallback))));
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field List callbacksAndExecutors>
		//    2    4:aload_1         
		//    3    5:invokestatic    #56  <Method EngineJob$ResourceCallbackAndExecutor defaultCallbackAndExecutor(ResourceCallback)>
		//    4    8:invokeinterface #78  <Method boolean List.remove(Object)>
		//    5   13:pop             
		//    6   14:return          
		}

		int size()
		{
			return callbacksAndExecutors.size();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field List callbacksAndExecutors>
		//    2    4:invokeinterface #82  <Method int List.size()>
		//    3    9:ireturn         
		}

		private final List callbacksAndExecutors;

		ResourceCallbacksAndExecutors()
		{
			this(((List) (new ArrayList(2))));
		//    0    0:aload_0         
		//    1    1:new             #17  <Class ArrayList>
		//    2    4:dup             
		//    3    5:iconst_2        
		//    4    6:invokespecial   #20  <Method void ArrayList(int)>
		//    5    9:invokespecial   #23  <Method void EngineJob$ResourceCallbacksAndExecutors(List)>
		//    6   12:return          
		}

		ResourceCallbacksAndExecutors(List list)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			callbacksAndExecutors = list;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #28  <Field List callbacksAndExecutors>
		//    5    9:return          
		}
	}


	EngineJob(GlideExecutor glideexecutor, GlideExecutor glideexecutor1, GlideExecutor glideexecutor2, GlideExecutor glideexecutor3, EngineJobListener enginejoblistener, android.support.v4.util.Pools.Pool pool1)
	{
		this(glideexecutor, glideexecutor1, glideexecutor2, glideexecutor3, enginejoblistener, pool1, DEFAULT_FACTORY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:getstatic       #73  <Field EngineJob$EngineResourceFactory DEFAULT_FACTORY>
	//    8   13:invokespecial   #78  <Method void EngineJob(GlideExecutor, GlideExecutor, GlideExecutor, GlideExecutor, EngineJobListener, android.support.v4.util.Pools$Pool, EngineJob$EngineResourceFactory)>
	//    9   16:return          
	}

	EngineJob(GlideExecutor glideexecutor, GlideExecutor glideexecutor1, GlideExecutor glideexecutor2, GlideExecutor glideexecutor3, EngineJobListener enginejoblistener, android.support.v4.util.Pools.Pool pool1, EngineResourceFactory engineresourcefactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Object()>
		cbs = new ResourceCallbacksAndExecutors();
	//    2    4:aload_0         
	//    3    5:new             #23  <Class EngineJob$ResourceCallbacksAndExecutors>
	//    4    8:dup             
	//    5    9:invokespecial   #83  <Method void EngineJob$ResourceCallbacksAndExecutors()>
	//    6   12:putfield        #85  <Field EngineJob$ResourceCallbacksAndExecutors cbs>
		stateVerifier = StateVerifier.newInstance();
	//    7   15:aload_0         
	//    8   16:invokestatic    #91  <Method StateVerifier StateVerifier.newInstance()>
	//    9   19:putfield        #93  <Field StateVerifier stateVerifier>
		pendingCallbacks = new AtomicInteger();
	//   10   22:aload_0         
	//   11   23:new             #95  <Class AtomicInteger>
	//   12   26:dup             
	//   13   27:invokespecial   #96  <Method void AtomicInteger()>
	//   14   30:putfield        #98  <Field AtomicInteger pendingCallbacks>
		diskCacheExecutor = glideexecutor;
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:putfield        #100 <Field GlideExecutor diskCacheExecutor>
		sourceExecutor = glideexecutor1;
	//   18   38:aload_0         
	//   19   39:aload_2         
	//   20   40:putfield        #102 <Field GlideExecutor sourceExecutor>
		sourceUnlimitedExecutor = glideexecutor2;
	//   21   43:aload_0         
	//   22   44:aload_3         
	//   23   45:putfield        #104 <Field GlideExecutor sourceUnlimitedExecutor>
		animationExecutor = glideexecutor3;
	//   24   48:aload_0         
	//   25   49:aload           4
	//   26   51:putfield        #106 <Field GlideExecutor animationExecutor>
		listener = enginejoblistener;
	//   27   54:aload_0         
	//   28   55:aload           5
	//   29   57:putfield        #108 <Field EngineJobListener listener>
		pool = pool1;
	//   30   60:aload_0         
	//   31   61:aload           6
	//   32   63:putfield        #110 <Field android.support.v4.util.Pools$Pool pool>
		engineResourceFactory = engineresourcefactory;
	//   33   66:aload_0         
	//   34   67:aload           7
	//   35   69:putfield        #112 <Field EngineJob$EngineResourceFactory engineResourceFactory>
	//   36   72:return          
	}

	private GlideExecutor getActiveSourceExecutor()
	{
		if(useUnlimitedSourceGeneratorPool)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field boolean useUnlimitedSourceGeneratorPool>
	//*   2    4:ifeq            12
			return sourceUnlimitedExecutor;
	//    3    7:aload_0         
	//    4    8:getfield        #104 <Field GlideExecutor sourceUnlimitedExecutor>
	//    5   11:areturn         
		if(useAnimationPool)
	//*   6   12:aload_0         
	//*   7   13:getfield        #120 <Field boolean useAnimationPool>
	//*   8   16:ifeq            24
			return animationExecutor;
	//    9   19:aload_0         
	//   10   20:getfield        #106 <Field GlideExecutor animationExecutor>
	//   11   23:areturn         
		else
			return sourceExecutor;
	//   12   24:aload_0         
	//   13   25:getfield        #102 <Field GlideExecutor sourceExecutor>
	//   14   28:areturn         
	}

	private boolean isDone()
	{
		return hasLoadFailed || hasResource || isCancelled;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field boolean hasLoadFailed>
	//    2    4:ifne            26
	//    3    7:aload_0         
	//    4    8:getfield        #126 <Field boolean hasResource>
	//    5   11:ifne            26
	//    6   14:aload_0         
	//    7   15:getfield        #128 <Field boolean isCancelled>
	//    8   18:ifeq            24
	//    9   21:goto            26
	//   10   24:iconst_0        
	//   11   25:ireturn         
	//   12   26:iconst_1        
	//   13   27:ireturn         
	}

	private void release()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(key == null)
			break MISSING_BLOCK_LABEL_83;
	//    2    2:aload_0         
	//    3    3:getfield        #131 <Field Key key>
	//    4    6:ifnull          83
		cbs.clear();
	//    5    9:aload_0         
	//    6   10:getfield        #85  <Field EngineJob$ResourceCallbacksAndExecutors cbs>
	//    7   13:invokevirtual   #134 <Method void EngineJob$ResourceCallbacksAndExecutors.clear()>
		key = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #131 <Field Key key>
		engineResource = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #136 <Field EngineResource engineResource>
		resource = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #138 <Field Resource resource>
		hasLoadFailed = false;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #124 <Field boolean hasLoadFailed>
		isCancelled = false;
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:putfield        #128 <Field boolean isCancelled>
		hasResource = false;
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:putfield        #126 <Field boolean hasResource>
		decodeJob.release(false);
	//   26   46:aload_0         
	//   27   47:getfield        #140 <Field DecodeJob decodeJob>
	//   28   50:iconst_0        
	//   29   51:invokevirtual   #145 <Method void DecodeJob.release(boolean)>
		decodeJob = null;
	//   30   54:aload_0         
	//   31   55:aconst_null     
	//   32   56:putfield        #140 <Field DecodeJob decodeJob>
		exception = null;
	//   33   59:aload_0         
	//   34   60:aconst_null     
	//   35   61:putfield        #147 <Field GlideException exception>
		dataSource = null;
	//   36   64:aload_0         
	//   37   65:aconst_null     
	//   38   66:putfield        #149 <Field DataSource dataSource>
		pool.release(((Object) (this)));
	//   39   69:aload_0         
	//   40   70:getfield        #110 <Field android.support.v4.util.Pools$Pool pool>
	//   41   73:aload_0         
	//   42   74:invokeinterface #154 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   43   79:pop             
		this;
	//   44   80:aload_0         
		JVM INSTR monitorexit ;
	//   45   81:monitorexit     
		return;
	//   46   82:return          
		throw new IllegalArgumentException();
	//   47   83:new             #156 <Class IllegalArgumentException>
	//   48   86:dup             
	//   49   87:invokespecial   #157 <Method void IllegalArgumentException()>
	//   50   90:athrow          
		Exception exception1;
		exception1;
	//   51   91:astore_1        
		this;
	//   52   92:aload_0         
		JVM INSTR monitorexit ;
	//   53   93:monitorexit     
		throw exception1;
	//   54   94:aload_1         
	//   55   95:athrow          
	}

	void addCallback(ResourceCallback resourcecallback, Executor executor)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag1;
		stateVerifier.throwIfRecycled();
	//    2    2:aload_0         
	//    3    3:getfield        #93  <Field StateVerifier stateVerifier>
	//    4    6:invokevirtual   #162 <Method void StateVerifier.throwIfRecycled()>
		cbs.add(resourcecallback, executor);
	//    5    9:aload_0         
	//    6   10:getfield        #85  <Field EngineJob$ResourceCallbacksAndExecutors cbs>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #165 <Method void EngineJob$ResourceCallbacksAndExecutors.add(ResourceCallback, Executor)>
		flag1 = hasResource;
	//   10   18:aload_0         
	//   11   19:getfield        #126 <Field boolean hasResource>
	//   12   22:istore          4
		boolean flag;
		flag = true;
	//   13   24:iconst_1        
	//   14   25:istore_3        
		if(!flag1)
			break MISSING_BLOCK_LABEL_54;
	//   15   26:iload           4
	//   16   28:ifeq            54
		incrementPendingCallbacks(1);
	//   17   31:aload_0         
	//   18   32:iconst_1        
	//   19   33:invokevirtual   #169 <Method void incrementPendingCallbacks(int)>
		executor.execute(((Runnable) (new CallResourceReady(resourcecallback))));
	//   20   36:aload_2         
	//   21   37:new             #14  <Class EngineJob$CallResourceReady>
	//   22   40:dup             
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:invokespecial   #172 <Method void EngineJob$CallResourceReady(EngineJob, ResourceCallback)>
	//   26   46:invokeinterface #178 <Method void Executor.execute(Runnable)>
		break MISSING_BLOCK_LABEL_100;
	//   27   51:goto            100
		if(hasLoadFailed)
	//*  28   54:aload_0         
	//*  29   55:getfield        #124 <Field boolean hasLoadFailed>
	//*  30   58:ifeq            84
		{
			incrementPendingCallbacks(1);
	//   31   61:aload_0         
	//   32   62:iconst_1        
	//   33   63:invokevirtual   #169 <Method void incrementPendingCallbacks(int)>
			executor.execute(((Runnable) (new CallLoadFailed(resourcecallback))));
	//   34   66:aload_2         
	//   35   67:new             #11  <Class EngineJob$CallLoadFailed>
	//   36   70:dup             
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:invokespecial   #179 <Method void EngineJob$CallLoadFailed(EngineJob, ResourceCallback)>
	//   40   76:invokeinterface #178 <Method void Executor.execute(Runnable)>
			break MISSING_BLOCK_LABEL_100;
	//   41   81:goto            100
		}
		if(isCancelled)
	//*  42   84:aload_0         
	//*  43   85:getfield        #128 <Field boolean isCancelled>
	//*  44   88:ifne            108
	//*  45   91:goto            94
	//*  46   94:iload_3         
	//*  47   95:ldc1            #181 <String "Cannot add callbacks to a cancelled EngineJob">
	//*  48   97:invokestatic    #187 <Method void Preconditions.checkArgument(boolean, String)>
	//*  49  100:aload_0         
	//*  50  101:monitorexit     
	//*  51  102:return          
	//*  52  103:astore_1        
	//*  53  104:aload_0         
	//*  54  105:monitorexit     
	//*  55  106:aload_1         
	//*  56  107:athrow          
			flag = false;
	//   57  108:iconst_0        
	//   58  109:istore_3        
		Preconditions.checkArgument(flag, "Cannot add callbacks to a cancelled EngineJob");
		this;
		JVM INSTR monitorexit ;
		return;
		resourcecallback;
		throw resourcecallback;
	//*  59  110:goto            94
	}

	void callCallbackOnLoadFailed(ResourceCallback resourcecallback)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		resourcecallback.onLoadFailed(exception);
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:getfield        #147 <Field GlideException exception>
	//    5    7:invokeinterface #197 <Method void ResourceCallback.onLoadFailed(GlideException)>
		this;
	//    6   12:aload_0         
		JVM INSTR monitorexit ;
	//    7   13:monitorexit     
		return;
	//    8   14:return          
		resourcecallback;
	//    9   15:astore_1        
		break MISSING_BLOCK_LABEL_30;
	//   10   16:goto            29
		resourcecallback;
	//   11   19:astore_1        
		throw new CallbackException(((Throwable) (resourcecallback)));
	//   12   20:new             #199 <Class CallbackException>
	//   13   23:dup             
	//   14   24:aload_1         
	//   15   25:invokespecial   #202 <Method void CallbackException(Throwable)>
	//   16   28:athrow          
	//*  17   29:aload_0         
		throw resourcecallback;
	//   18   30:monitorexit     
	//   19   31:aload_1         
	//   20   32:athrow          
	}

	void callCallbackOnResourceReady(ResourceCallback resourcecallback)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		resourcecallback.onResourceReady(((Resource) (engineResource)), dataSource);
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:getfield        #136 <Field EngineResource engineResource>
	//    5    7:aload_0         
	//    6    8:getfield        #149 <Field DataSource dataSource>
	//    7   11:invokeinterface #207 <Method void ResourceCallback.onResourceReady(Resource, DataSource)>
		this;
	//    8   16:aload_0         
		JVM INSTR monitorexit ;
	//    9   17:monitorexit     
		return;
	//   10   18:return          
		resourcecallback;
	//   11   19:astore_1        
		break MISSING_BLOCK_LABEL_34;
	//   12   20:goto            33
		resourcecallback;
	//   13   23:astore_1        
		throw new CallbackException(((Throwable) (resourcecallback)));
	//   14   24:new             #199 <Class CallbackException>
	//   15   27:dup             
	//   16   28:aload_1         
	//   17   29:invokespecial   #202 <Method void CallbackException(Throwable)>
	//   18   32:athrow          
	//*  19   33:aload_0         
		throw resourcecallback;
	//   20   34:monitorexit     
	//   21   35:aload_1         
	//   22   36:athrow          
	}

	void cancel()
	{
		if(isDone())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #210 <Method boolean isDone()>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			isCancelled = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #128 <Field boolean isCancelled>
			decodeJob.cancel();
	//    7   13:aload_0         
	//    8   14:getfield        #140 <Field DecodeJob decodeJob>
	//    9   17:invokevirtual   #212 <Method void DecodeJob.cancel()>
			listener.onEngineJobCancelled(this, key);
	//   10   20:aload_0         
	//   11   21:getfield        #108 <Field EngineJobListener listener>
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #131 <Field Key key>
	//   15   29:invokeinterface #218 <Method void EngineJobListener.onEngineJobCancelled(EngineJob, Key)>
			return;
	//   16   34:return          
		}
	}

	void decrementPendingCallbacks()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		stateVerifier.throwIfRecycled();
	//    2    2:aload_0         
	//    3    3:getfield        #93  <Field StateVerifier stateVerifier>
	//    4    6:invokevirtual   #162 <Method void StateVerifier.throwIfRecycled()>
		Preconditions.checkArgument(isDone(), "Not yet complete!");
	//    5    9:aload_0         
	//    6   10:invokespecial   #210 <Method boolean isDone()>
	//    7   13:ldc1            #221 <String "Not yet complete!">
	//    8   15:invokestatic    #187 <Method void Preconditions.checkArgument(boolean, String)>
		i = pendingCallbacks.decrementAndGet();
	//    9   18:aload_0         
	//   10   19:getfield        #98  <Field AtomicInteger pendingCallbacks>
	//   11   22:invokevirtual   #225 <Method int AtomicInteger.decrementAndGet()>
	//   12   25:istore_1        
		boolean flag;
		Exception exception1;
		if(i >= 0)
	//*  13   26:iload_1         
	//*  14   27:iflt            71
			flag = true;
	//   15   30:iconst_1        
	//   16   31:istore_2        
		else
	//*  17   32:goto            35
	//*  18   35:iload_2         
	//*  19   36:ldc1            #227 <String "Can't decrement below 0">
	//*  20   38:invokestatic    #187 <Method void Preconditions.checkArgument(boolean, String)>
	//*  21   41:iload_1         
	//*  22   42:ifne            63
	//*  23   45:aload_0         
	//*  24   46:getfield        #136 <Field EngineResource engineResource>
	//*  25   49:ifnull          59
	//*  26   52:aload_0         
	//*  27   53:getfield        #136 <Field EngineResource engineResource>
	//*  28   56:invokevirtual   #231 <Method void EngineResource.release()>
	//*  29   59:aload_0         
	//*  30   60:invokespecial   #232 <Method void release()>
	//*  31   63:aload_0         
	//*  32   64:monitorexit     
	//*  33   65:return          
	//*  34   66:astore_3        
	//*  35   67:aload_0         
	//*  36   68:monitorexit     
	//*  37   69:aload_3         
	//*  38   70:athrow          
			flag = false;
	//   39   71:iconst_0        
	//   40   72:istore_2        
		Preconditions.checkArgument(flag, "Can't decrement below 0");
		if(i != 0)
			break MISSING_BLOCK_LABEL_63;
		if(engineResource != null)
			engineResource.release();
		release();
		this;
		JVM INSTR monitorexit ;
		return;
		exception1;
		throw exception1;
	//*  41   73:goto            35
	}

	public StateVerifier getVerifier()
	{
		return stateVerifier;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field StateVerifier stateVerifier>
	//    2    4:areturn         
	}

	void incrementPendingCallbacks(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Preconditions.checkArgument(isDone(), "Not yet complete!");
	//    2    2:aload_0         
	//    3    3:invokespecial   #210 <Method boolean isDone()>
	//    4    6:ldc1            #221 <String "Not yet complete!">
	//    5    8:invokestatic    #187 <Method void Preconditions.checkArgument(boolean, String)>
		if(pendingCallbacks.getAndAdd(i) == 0 && engineResource != null)
	//*   6   11:aload_0         
	//*   7   12:getfield        #98  <Field AtomicInteger pendingCallbacks>
	//*   8   15:iload_1         
	//*   9   16:invokevirtual   #238 <Method int AtomicInteger.getAndAdd(int)>
	//*  10   19:ifne            36
	//*  11   22:aload_0         
	//*  12   23:getfield        #136 <Field EngineResource engineResource>
	//*  13   26:ifnull          36
			engineResource.acquire();
	//   14   29:aload_0         
	//   15   30:getfield        #136 <Field EngineResource engineResource>
	//   16   33:invokevirtual   #241 <Method void EngineResource.acquire()>
		this;
	//   17   36:aload_0         
		JVM INSTR monitorexit ;
	//   18   37:monitorexit     
		return;
	//   19   38:return          
		Exception exception1;
		exception1;
	//   20   39:astore_2        
	//*  21   40:aload_0         
		throw exception1;
	//   22   41:monitorexit     
	//   23   42:aload_2         
	//   24   43:athrow          
	}

	EngineJob init(Key key1, boolean flag, boolean flag1, boolean flag2, boolean flag3)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		key = key1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #131 <Field Key key>
		isCacheable = flag;
	//    5    7:aload_0         
	//    6    8:iload_2         
	//    7    9:putfield        #245 <Field boolean isCacheable>
		useUnlimitedSourceGeneratorPool = flag1;
	//    8   12:aload_0         
	//    9   13:iload_3         
	//   10   14:putfield        #118 <Field boolean useUnlimitedSourceGeneratorPool>
		useAnimationPool = flag2;
	//   11   17:aload_0         
	//   12   18:iload           4
	//   13   20:putfield        #120 <Field boolean useAnimationPool>
		onlyRetrieveFromCache = flag3;
	//   14   23:aload_0         
	//   15   24:iload           5
	//   16   26:putfield        #247 <Field boolean onlyRetrieveFromCache>
		this;
	//   17   29:aload_0         
		JVM INSTR monitorexit ;
	//   18   30:monitorexit     
		return this;
	//   19   31:aload_0         
	//   20   32:areturn         
		key1;
	//   21   33:astore_1        
	//*  22   34:aload_0         
		throw key1;
	//   23   35:monitorexit     
	//   24   36:aload_1         
	//   25   37:athrow          
	}

	void notifyCallbacksOfException()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		stateVerifier.throwIfRecycled();
	//    2    2:aload_0         
	//    3    3:getfield        #93  <Field StateVerifier stateVerifier>
	//    4    6:invokevirtual   #162 <Method void StateVerifier.throwIfRecycled()>
		if(!isCancelled)
			break MISSING_BLOCK_LABEL_23;
	//    5    9:aload_0         
	//    6   10:getfield        #128 <Field boolean isCancelled>
	//    7   13:ifeq            23
		release();
	//    8   16:aload_0         
	//    9   17:invokespecial   #232 <Method void release()>
		this;
	//   10   20:aload_0         
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return;
	//   12   22:return          
		Key key1;
		Object obj;
		if(cbs.isEmpty())
			break MISSING_BLOCK_LABEL_146;
	//   13   23:aload_0         
	//   14   24:getfield        #85  <Field EngineJob$ResourceCallbacksAndExecutors cbs>
	//   15   27:invokevirtual   #252 <Method boolean EngineJob$ResourceCallbacksAndExecutors.isEmpty()>
	//   16   30:ifne            146
		if(hasLoadFailed)
			break MISSING_BLOCK_LABEL_135;
	//   17   33:aload_0         
	//   18   34:getfield        #124 <Field boolean hasLoadFailed>
	//   19   37:ifne            135
		hasLoadFailed = true;
	//   20   40:aload_0         
	//   21   41:iconst_1        
	//   22   42:putfield        #124 <Field boolean hasLoadFailed>
		key1 = key;
	//   23   45:aload_0         
	//   24   46:getfield        #131 <Field Key key>
	//   25   49:astore_1        
		obj = ((Object) (cbs.copy()));
	//   26   50:aload_0         
	//   27   51:getfield        #85  <Field EngineJob$ResourceCallbacksAndExecutors cbs>
	//   28   54:invokevirtual   #256 <Method EngineJob$ResourceCallbacksAndExecutors EngineJob$ResourceCallbacksAndExecutors.copy()>
	//   29   57:astore_2        
		incrementPendingCallbacks(((ResourceCallbacksAndExecutors) (obj)).size() + 1);
	//   30   58:aload_0         
	//   31   59:aload_2         
	//   32   60:invokevirtual   #259 <Method int EngineJob$ResourceCallbacksAndExecutors.size()>
	//   33   63:iconst_1        
	//   34   64:iadd            
	//   35   65:invokevirtual   #169 <Method void incrementPendingCallbacks(int)>
		this;
	//   36   68:aload_0         
		JVM INSTR monitorexit ;
	//   37   69:monitorexit     
		listener.onEngineJobComplete(this, key1, ((EngineResource) (null)));
	//   38   70:aload_0         
	//   39   71:getfield        #108 <Field EngineJobListener listener>
	//   40   74:aload_0         
	//   41   75:aload_1         
	//   42   76:aconst_null     
	//   43   77:invokeinterface #263 <Method void EngineJobListener.onEngineJobComplete(EngineJob, Key, EngineResource)>
		for(Iterator iterator = ((ResourceCallbacksAndExecutors) (obj)).iterator(); iterator.hasNext(); ((ResourceCallbackAndExecutor) (obj)).executor.execute(((Runnable) (new CallLoadFailed(((ResourceCallbackAndExecutor) (obj)).cb)))))
	//*  44   82:aload_2         
	//*  45   83:invokevirtual   #267 <Method Iterator EngineJob$ResourceCallbacksAndExecutors.iterator()>
	//*  46   86:astore_1        
	//*  47   87:aload_1         
	//*  48   88:invokeinterface #272 <Method boolean Iterator.hasNext()>
	//*  49   93:ifeq            130
			obj = ((Object) ((ResourceCallbackAndExecutor)iterator.next()));
	//   50   96:aload_1         
	//   51   97:invokeinterface #276 <Method Object Iterator.next()>
	//   52  102:checkcast       #20  <Class EngineJob$ResourceCallbackAndExecutor>
	//   53  105:astore_2        

	//   54  106:aload_2         
	//   55  107:getfield        #280 <Field Executor EngineJob$ResourceCallbackAndExecutor.executor>
	//   56  110:new             #11  <Class EngineJob$CallLoadFailed>
	//   57  113:dup             
	//   58  114:aload_0         
	//   59  115:aload_2         
	//   60  116:getfield        #284 <Field ResourceCallback EngineJob$ResourceCallbackAndExecutor.cb>
	//   61  119:invokespecial   #179 <Method void EngineJob$CallLoadFailed(EngineJob, ResourceCallback)>
	//   62  122:invokeinterface #178 <Method void Executor.execute(Runnable)>
	//*  63  127:goto            87
		decrementPendingCallbacks();
	//   64  130:aload_0         
	//   65  131:invokevirtual   #286 <Method void decrementPendingCallbacks()>
		return;
	//   66  134:return          
		throw new IllegalStateException("Already failed once");
	//   67  135:new             #288 <Class IllegalStateException>
	//   68  138:dup             
	//   69  139:ldc2            #290 <String "Already failed once">
	//   70  142:invokespecial   #293 <Method void IllegalStateException(String)>
	//   71  145:athrow          
		throw new IllegalStateException("Received an exception without any callbacks to notify");
	//   72  146:new             #288 <Class IllegalStateException>
	//   73  149:dup             
	//   74  150:ldc2            #295 <String "Received an exception without any callbacks to notify">
	//   75  153:invokespecial   #293 <Method void IllegalStateException(String)>
	//   76  156:athrow          
		Exception exception1;
		exception1;
	//   77  157:astore_1        
		this;
	//   78  158:aload_0         
		JVM INSTR monitorexit ;
	//   79  159:monitorexit     
		throw exception1;
	//   80  160:aload_1         
	//   81  161:athrow          
	}

	void notifyCallbacksOfResult()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		stateVerifier.throwIfRecycled();
	//    2    2:aload_0         
	//    3    3:getfield        #93  <Field StateVerifier stateVerifier>
	//    4    6:invokevirtual   #162 <Method void StateVerifier.throwIfRecycled()>
		if(!isCancelled)
			break MISSING_BLOCK_LABEL_32;
	//    5    9:aload_0         
	//    6   10:getfield        #128 <Field boolean isCancelled>
	//    7   13:ifeq            32
		resource.recycle();
	//    8   16:aload_0         
	//    9   17:getfield        #138 <Field Resource resource>
	//   10   20:invokeinterface #301 <Method void Resource.recycle()>
		release();
	//   11   25:aload_0         
	//   12   26:invokespecial   #232 <Method void release()>
		this;
	//   13   29:aload_0         
		JVM INSTR monitorexit ;
	//   14   30:monitorexit     
		return;
	//   15   31:return          
		Object obj;
		Key key1;
		EngineResource engineresource;
		if(cbs.isEmpty())
			break MISSING_BLOCK_LABEL_179;
	//   16   32:aload_0         
	//   17   33:getfield        #85  <Field EngineJob$ResourceCallbacksAndExecutors cbs>
	//   18   36:invokevirtual   #252 <Method boolean EngineJob$ResourceCallbacksAndExecutors.isEmpty()>
	//   19   39:ifne            179
		if(hasResource)
			break MISSING_BLOCK_LABEL_168;
	//   20   42:aload_0         
	//   21   43:getfield        #126 <Field boolean hasResource>
	//   22   46:ifne            168
		engineResource = engineResourceFactory.build(resource, isCacheable);
	//   23   49:aload_0         
	//   24   50:aload_0         
	//   25   51:getfield        #112 <Field EngineJob$EngineResourceFactory engineResourceFactory>
	//   26   54:aload_0         
	//   27   55:getfield        #138 <Field Resource resource>
	//   28   58:aload_0         
	//   29   59:getfield        #245 <Field boolean isCacheable>
	//   30   62:invokevirtual   #305 <Method EngineResource EngineJob$EngineResourceFactory.build(Resource, boolean)>
	//   31   65:putfield        #136 <Field EngineResource engineResource>
		hasResource = true;
	//   32   68:aload_0         
	//   33   69:iconst_1        
	//   34   70:putfield        #126 <Field boolean hasResource>
		obj = ((Object) (cbs.copy()));
	//   35   73:aload_0         
	//   36   74:getfield        #85  <Field EngineJob$ResourceCallbacksAndExecutors cbs>
	//   37   77:invokevirtual   #256 <Method EngineJob$ResourceCallbacksAndExecutors EngineJob$ResourceCallbacksAndExecutors.copy()>
	//   38   80:astore_1        
		incrementPendingCallbacks(((ResourceCallbacksAndExecutors) (obj)).size() + 1);
	//   39   81:aload_0         
	//   40   82:aload_1         
	//   41   83:invokevirtual   #259 <Method int EngineJob$ResourceCallbacksAndExecutors.size()>
	//   42   86:iconst_1        
	//   43   87:iadd            
	//   44   88:invokevirtual   #169 <Method void incrementPendingCallbacks(int)>
		key1 = key;
	//   45   91:aload_0         
	//   46   92:getfield        #131 <Field Key key>
	//   47   95:astore_2        
		engineresource = engineResource;
	//   48   96:aload_0         
	//   49   97:getfield        #136 <Field EngineResource engineResource>
	//   50  100:astore_3        
		this;
	//   51  101:aload_0         
		JVM INSTR monitorexit ;
	//   52  102:monitorexit     
		listener.onEngineJobComplete(this, key1, engineresource);
	//   53  103:aload_0         
	//   54  104:getfield        #108 <Field EngineJobListener listener>
	//   55  107:aload_0         
	//   56  108:aload_2         
	//   57  109:aload_3         
	//   58  110:invokeinterface #263 <Method void EngineJobListener.onEngineJobComplete(EngineJob, Key, EngineResource)>
		ResourceCallbackAndExecutor resourcecallbackandexecutor;
		for(obj = ((Object) (((ResourceCallbacksAndExecutors) (obj)).iterator())); ((Iterator) (obj)).hasNext(); resourcecallbackandexecutor.executor.execute(((Runnable) (new CallResourceReady(resourcecallbackandexecutor.cb)))))
	//*  59  115:aload_1         
	//*  60  116:invokevirtual   #267 <Method Iterator EngineJob$ResourceCallbacksAndExecutors.iterator()>
	//*  61  119:astore_1        
	//*  62  120:aload_1         
	//*  63  121:invokeinterface #272 <Method boolean Iterator.hasNext()>
	//*  64  126:ifeq            163
			resourcecallbackandexecutor = (ResourceCallbackAndExecutor)((Iterator) (obj)).next();
	//   65  129:aload_1         
	//   66  130:invokeinterface #276 <Method Object Iterator.next()>
	//   67  135:checkcast       #20  <Class EngineJob$ResourceCallbackAndExecutor>
	//   68  138:astore_2        

	//   69  139:aload_2         
	//   70  140:getfield        #280 <Field Executor EngineJob$ResourceCallbackAndExecutor.executor>
	//   71  143:new             #14  <Class EngineJob$CallResourceReady>
	//   72  146:dup             
	//   73  147:aload_0         
	//   74  148:aload_2         
	//   75  149:getfield        #284 <Field ResourceCallback EngineJob$ResourceCallbackAndExecutor.cb>
	//   76  152:invokespecial   #172 <Method void EngineJob$CallResourceReady(EngineJob, ResourceCallback)>
	//   77  155:invokeinterface #178 <Method void Executor.execute(Runnable)>
	//*  78  160:goto            120
		decrementPendingCallbacks();
	//   79  163:aload_0         
	//   80  164:invokevirtual   #286 <Method void decrementPendingCallbacks()>
		return;
	//   81  167:return          
		throw new IllegalStateException("Already have resource");
	//   82  168:new             #288 <Class IllegalStateException>
	//   83  171:dup             
	//   84  172:ldc2            #307 <String "Already have resource">
	//   85  175:invokespecial   #293 <Method void IllegalStateException(String)>
	//   86  178:athrow          
		throw new IllegalStateException("Received a resource without any callbacks to notify");
	//   87  179:new             #288 <Class IllegalStateException>
	//   88  182:dup             
	//   89  183:ldc2            #309 <String "Received a resource without any callbacks to notify">
	//   90  186:invokespecial   #293 <Method void IllegalStateException(String)>
	//   91  189:athrow          
		Exception exception1;
		exception1;
	//   92  190:astore_1        
		this;
	//   93  191:aload_0         
		JVM INSTR monitorexit ;
	//   94  192:monitorexit     
		throw exception1;
	//   95  193:aload_1         
	//   96  194:athrow          
	}

	public void onLoadFailed(GlideException glideexception)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		exception = glideexception;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #147 <Field GlideException exception>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		notifyCallbacksOfException();
	//    7    9:aload_0         
	//    8   10:invokevirtual   #311 <Method void notifyCallbacksOfException()>
		return;
	//    9   13:return          
		glideexception;
	//   10   14:astore_1        
		this;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		throw glideexception;
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public void onResourceReady(Resource resource1, DataSource datasource)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		resource = resource1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #138 <Field Resource resource>
		dataSource = datasource;
	//    5    7:aload_0         
	//    6    8:aload_2         
	//    7    9:putfield        #149 <Field DataSource dataSource>
		this;
	//    8   12:aload_0         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		notifyCallbacksOfResult();
	//   10   14:aload_0         
	//   11   15:invokevirtual   #313 <Method void notifyCallbacksOfResult()>
		return;
	//   12   18:return          
		resource1;
	//   13   19:astore_1        
		this;
	//   14   20:aload_0         
		JVM INSTR monitorexit ;
	//   15   21:monitorexit     
		throw resource1;
	//   16   22:aload_1         
	//   17   23:athrow          
	}

	boolean onlyRetrieveFromCache()
	{
		return onlyRetrieveFromCache;
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field boolean onlyRetrieveFromCache>
	//    2    4:ireturn         
	}

	void removeCallback(ResourceCallback resourcecallback)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		stateVerifier.throwIfRecycled();
	//    2    2:aload_0         
	//    3    3:getfield        #93  <Field StateVerifier stateVerifier>
	//    4    6:invokevirtual   #162 <Method void StateVerifier.throwIfRecycled()>
		cbs.remove(resourcecallback);
	//    5    9:aload_0         
	//    6   10:getfield        #85  <Field EngineJob$ResourceCallbacksAndExecutors cbs>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #318 <Method void EngineJob$ResourceCallbacksAndExecutors.remove(ResourceCallback)>
		if(!cbs.isEmpty())
			break MISSING_BLOCK_LABEL_66;
	//    9   17:aload_0         
	//   10   18:getfield        #85  <Field EngineJob$ResourceCallbacksAndExecutors cbs>
	//   11   21:invokevirtual   #252 <Method boolean EngineJob$ResourceCallbacksAndExecutors.isEmpty()>
	//   12   24:ifeq            66
		cancel();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #319 <Method void cancel()>
		boolean flag;
		if(!hasResource && !hasLoadFailed)
	//*  15   31:aload_0         
	//*  16   32:getfield        #126 <Field boolean hasResource>
	//*  17   35:ifne            79
	//*  18   38:aload_0         
	//*  19   39:getfield        #124 <Field boolean hasLoadFailed>
	//*  20   42:ifeq            74
	//*  21   45:goto            79
	//*  22   48:iload_2         
	//*  23   49:ifeq            66
	//*  24   52:aload_0         
	//*  25   53:getfield        #98  <Field AtomicInteger pendingCallbacks>
	//*  26   56:invokevirtual   #322 <Method int AtomicInteger.get()>
	//*  27   59:ifne            66
	//*  28   62:aload_0         
	//*  29   63:invokespecial   #232 <Method void release()>
	//*  30   66:aload_0         
	//*  31   67:monitorexit     
	//*  32   68:return          
	//*  33   69:astore_1        
	//*  34   70:aload_0         
	//*  35   71:monitorexit     
	//*  36   72:aload_1         
	//*  37   73:athrow          
			flag = false;
	//   38   74:iconst_0        
	//   39   75:istore_2        
		else
	//*  40   76:goto            48
			flag = true;
	//   41   79:iconst_1        
	//   42   80:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_66;
		if(pendingCallbacks.get() == 0)
			release();
		this;
		JVM INSTR monitorexit ;
		return;
		resourcecallback;
		throw resourcecallback;
	//*  43   81:goto            48
	}

	public void reschedule(DecodeJob decodejob)
	{
		getActiveSourceExecutor().execute(((Runnable) (decodejob)));
	//    0    0:aload_0         
	//    1    1:invokespecial   #326 <Method GlideExecutor getActiveSourceExecutor()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #329 <Method void GlideExecutor.execute(Runnable)>
	//    4    8:return          
	}

	public void start(DecodeJob decodejob)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		GlideExecutor glideexecutor;
		decodeJob = decodejob;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #140 <Field DecodeJob decodeJob>
		if(decodejob.willDecodeFromCache())
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #334 <Method boolean DecodeJob.willDecodeFromCache()>
	//*   7   11:ifeq            22
		{
			glideexecutor = diskCacheExecutor;
	//    8   14:aload_0         
	//    9   15:getfield        #100 <Field GlideExecutor diskCacheExecutor>
	//   10   18:astore_2        
			break MISSING_BLOCK_LABEL_27;
	//   11   19:goto            27
		}
		glideexecutor = getActiveSourceExecutor();
	//   12   22:aload_0         
	//   13   23:invokespecial   #326 <Method GlideExecutor getActiveSourceExecutor()>
	//   14   26:astore_2        
		glideexecutor.execute(((Runnable) (decodejob)));
	//   15   27:aload_2         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #329 <Method void GlideExecutor.execute(Runnable)>
		this;
	//   18   32:aload_0         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		return;
	//   20   34:return          
		decodejob;
	//   21   35:astore_1        
	//*  22   36:aload_0         
		throw decodejob;
	//   23   37:monitorexit     
	//   24   38:aload_1         
	//   25   39:athrow          
	}

	private static final EngineResourceFactory DEFAULT_FACTORY = new EngineResourceFactory();
	private final GlideExecutor animationExecutor;
	final ResourceCallbacksAndExecutors cbs;
	DataSource dataSource;
	private DecodeJob decodeJob;
	private final GlideExecutor diskCacheExecutor;
	EngineResource engineResource;
	private final EngineResourceFactory engineResourceFactory;
	GlideException exception;
	private boolean hasLoadFailed;
	private boolean hasResource;
	private boolean isCacheable;
	private volatile boolean isCancelled;
	private Key key;
	private final EngineJobListener listener;
	private boolean onlyRetrieveFromCache;
	private final AtomicInteger pendingCallbacks;
	private final android.support.v4.util.Pools.Pool pool;
	private Resource resource;
	private final GlideExecutor sourceExecutor;
	private final GlideExecutor sourceUnlimitedExecutor;
	private final StateVerifier stateVerifier;
	private boolean useAnimationPool;
	private boolean useUnlimitedSourceGeneratorPool;

	static 
	{
	//    0    0:new             #17  <Class EngineJob$EngineResourceFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #71  <Method void EngineJob$EngineResourceFactory()>
	//    3    7:putstatic       #73  <Field EngineJob$EngineResourceFactory DEFAULT_FACTORY>
	//*   4   10:return          
	}
}
