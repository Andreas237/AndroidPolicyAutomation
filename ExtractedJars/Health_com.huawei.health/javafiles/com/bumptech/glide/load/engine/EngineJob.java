// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.os.*;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.engine:
//			DecodeJob, EngineJobListener, Resource, EngineResource, 
//			GlideException

class EngineJob
	implements DecodeJob.Callback, com.bumptech.glide.util.pool.FactoryPools.Poolable
{
	static class EngineResourceFactory
	{

		public EngineResource build(Resource resource1, boolean flag)
		{
			return new EngineResource(resource1, flag);
		//    0    0:new             #16  <Class EngineResource>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokespecial   #19  <Method void EngineResource(Resource, boolean)>
		//    5    9:areturn         
		}

		EngineResourceFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	static class MainThreadCallback
		implements android.os.Handler.Callback
	{

		public boolean handleMessage(Message message)
		{
			EngineJob enginejob = (EngineJob)message.obj;
		//    0    0:aload_1         
		//    1    1:getfield        #22  <Field Object Message.obj>
		//    2    4:checkcast       #8   <Class EngineJob>
		//    3    7:astore_2        
			switch(message.what)
		//*   4    8:aload_1         
		//*   5    9:getfield        #26  <Field int Message.what>
			{
		//*   6   12:tableswitch     1 3: default 40
		//		               1 43
		//		               2 50
		//		               3 57
		//*   7   40:goto            64
			case 1: // '\001'
				enginejob.handleResultOnMainThread();
		//    8   43:aload_2         
		//    9   44:invokevirtual   #29  <Method void EngineJob.handleResultOnMainThread()>
				break;

		//*  10   47:goto            94
			case 2: // '\002'
				enginejob.handleExceptionOnMainThread();
		//   11   50:aload_2         
		//   12   51:invokevirtual   #32  <Method void EngineJob.handleExceptionOnMainThread()>
				break;

		//*  13   54:goto            94
			case 3: // '\003'
				enginejob.handleCancelledOnMainThread();
		//   14   57:aload_2         
		//   15   58:invokevirtual   #35  <Method void EngineJob.handleCancelledOnMainThread()>
				break;

		//*  16   61:goto            94
			default:
				throw new IllegalStateException((new StringBuilder()).append("Unrecognized message: ").append(message.what).toString());
		//   17   64:new             #37  <Class IllegalStateException>
		//   18   67:dup             
		//   19   68:new             #39  <Class StringBuilder>
		//   20   71:dup             
		//   21   72:invokespecial   #40  <Method void StringBuilder()>
		//   22   75:ldc1            #42  <String "Unrecognized message: ">
		//   23   77:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   24   80:aload_1         
		//   25   81:getfield        #26  <Field int Message.what>
		//   26   84:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
		//   27   87:invokevirtual   #53  <Method String StringBuilder.toString()>
		//   28   90:invokespecial   #56  <Method void IllegalStateException(String)>
		//   29   93:athrow          
			}
			return true;
		//   30   94:iconst_1        
		//   31   95:ireturn         
		}

		MainThreadCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	EngineJob(GlideExecutor glideexecutor, GlideExecutor glideexecutor1, GlideExecutor glideexecutor2, EngineJobListener enginejoblistener, android.support.v4.util.Pools.Pool pool1)
	{
		this(glideexecutor, glideexecutor1, glideexecutor2, enginejoblistener, pool1, DEFAULT_FACTORY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:getstatic       #70  <Field EngineJob$EngineResourceFactory DEFAULT_FACTORY>
	//    7   11:invokespecial   #89  <Method void EngineJob(GlideExecutor, GlideExecutor, GlideExecutor, EngineJobListener, android.support.v4.util.Pools$Pool, EngineJob$EngineResourceFactory)>
	//    8   14:return          
	}

	EngineJob(GlideExecutor glideexecutor, GlideExecutor glideexecutor1, GlideExecutor glideexecutor2, EngineJobListener enginejoblistener, android.support.v4.util.Pools.Pool pool1, EngineResourceFactory engineresourcefactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method void Object()>
		cbs = ((List) (new ArrayList(2)));
	//    2    4:aload_0         
	//    3    5:new             #94  <Class ArrayList>
	//    4    8:dup             
	//    5    9:iconst_2        
	//    6   10:invokespecial   #97  <Method void ArrayList(int)>
	//    7   13:putfield        #99  <Field List cbs>
		stateVerifier = StateVerifier.newInstance();
	//    8   16:aload_0         
	//    9   17:invokestatic    #105 <Method StateVerifier StateVerifier.newInstance()>
	//   10   20:putfield        #107 <Field StateVerifier stateVerifier>
		diskCacheExecutor = glideexecutor;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #109 <Field GlideExecutor diskCacheExecutor>
		sourceExecutor = glideexecutor1;
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:putfield        #111 <Field GlideExecutor sourceExecutor>
		sourceUnlimitedExecutor = glideexecutor2;
	//   17   33:aload_0         
	//   18   34:aload_3         
	//   19   35:putfield        #113 <Field GlideExecutor sourceUnlimitedExecutor>
		listener = enginejoblistener;
	//   20   38:aload_0         
	//   21   39:aload           4
	//   22   41:putfield        #115 <Field EngineJobListener listener>
		pool = pool1;
	//   23   44:aload_0         
	//   24   45:aload           5
	//   25   47:putfield        #117 <Field android.support.v4.util.Pools$Pool pool>
		engineResourceFactory = engineresourcefactory;
	//   26   50:aload_0         
	//   27   51:aload           6
	//   28   53:putfield        #119 <Field EngineJob$EngineResourceFactory engineResourceFactory>
	//   29   56:return          
	}

	private void addIgnoredCallback(ResourceCallback resourcecallback)
	{
		if(ignoredCallbacks == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #124 <Field List ignoredCallbacks>
	//*   2    4:ifnonnull       19
			ignoredCallbacks = ((List) (new ArrayList(2)));
	//    3    7:aload_0         
	//    4    8:new             #94  <Class ArrayList>
	//    5   11:dup             
	//    6   12:iconst_2        
	//    7   13:invokespecial   #97  <Method void ArrayList(int)>
	//    8   16:putfield        #124 <Field List ignoredCallbacks>
		if(!ignoredCallbacks.contains(((Object) (resourcecallback))))
	//*   9   19:aload_0         
	//*  10   20:getfield        #124 <Field List ignoredCallbacks>
	//*  11   23:aload_1         
	//*  12   24:invokeinterface #130 <Method boolean List.contains(Object)>
	//*  13   29:ifne            43
			ignoredCallbacks.add(((Object) (resourcecallback)));
	//   14   32:aload_0         
	//   15   33:getfield        #124 <Field List ignoredCallbacks>
	//   16   36:aload_1         
	//   17   37:invokeinterface #133 <Method boolean List.add(Object)>
	//   18   42:pop             
	//   19   43:return          
	}

	private GlideExecutor getActiveSourceExecutor()
	{
		if(useUnlimitedSourceGeneratorPool)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field boolean useUnlimitedSourceGeneratorPool>
	//*   2    4:ifeq            12
			return sourceUnlimitedExecutor;
	//    3    7:aload_0         
	//    4    8:getfield        #113 <Field GlideExecutor sourceUnlimitedExecutor>
	//    5   11:areturn         
		else
			return sourceExecutor;
	//    6   12:aload_0         
	//    7   13:getfield        #111 <Field GlideExecutor sourceExecutor>
	//    8   16:areturn         
	}

	private boolean isInIgnoredCallbacks(ResourceCallback resourcecallback)
	{
		return ignoredCallbacks != null && ignoredCallbacks.contains(((Object) (resourcecallback)));
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field List ignoredCallbacks>
	//    2    4:ifnull          22
	//    3    7:aload_0         
	//    4    8:getfield        #124 <Field List ignoredCallbacks>
	//    5   11:aload_1         
	//    6   12:invokeinterface #130 <Method boolean List.contains(Object)>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	private void release(boolean flag)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #146 <Method void Util.assertMainThread()>
		cbs.clear();
	//    1    3:aload_0         
	//    2    4:getfield        #99  <Field List cbs>
	//    3    7:invokeinterface #149 <Method void List.clear()>
		key = null;
	//    4   12:aload_0         
	//    5   13:aconst_null     
	//    6   14:putfield        #151 <Field Key key>
		engineResource = null;
	//    7   17:aload_0         
	//    8   18:aconst_null     
	//    9   19:putfield        #153 <Field EngineResource engineResource>
		resource = null;
	//   10   22:aload_0         
	//   11   23:aconst_null     
	//   12   24:putfield        #155 <Field Resource resource>
		if(ignoredCallbacks != null)
	//*  13   27:aload_0         
	//*  14   28:getfield        #124 <Field List ignoredCallbacks>
	//*  15   31:ifnull          43
			ignoredCallbacks.clear();
	//   16   34:aload_0         
	//   17   35:getfield        #124 <Field List ignoredCallbacks>
	//   18   38:invokeinterface #149 <Method void List.clear()>
		hasLoadFailed = false;
	//   19   43:aload_0         
	//   20   44:iconst_0        
	//   21   45:putfield        #157 <Field boolean hasLoadFailed>
		isCancelled = false;
	//   22   48:aload_0         
	//   23   49:iconst_0        
	//   24   50:putfield        #159 <Field boolean isCancelled>
		hasResource = false;
	//   25   53:aload_0         
	//   26   54:iconst_0        
	//   27   55:putfield        #161 <Field boolean hasResource>
		decodeJob.release(flag);
	//   28   58:aload_0         
	//   29   59:getfield        #163 <Field DecodeJob decodeJob>
	//   30   62:iload_1         
	//   31   63:invokevirtual   #167 <Method void DecodeJob.release(boolean)>
		decodeJob = null;
	//   32   66:aload_0         
	//   33   67:aconst_null     
	//   34   68:putfield        #163 <Field DecodeJob decodeJob>
		exception = null;
	//   35   71:aload_0         
	//   36   72:aconst_null     
	//   37   73:putfield        #169 <Field GlideException exception>
		dataSource = null;
	//   38   76:aload_0         
	//   39   77:aconst_null     
	//   40   78:putfield        #171 <Field DataSource dataSource>
		pool.release(((Object) (this)));
	//   41   81:aload_0         
	//   42   82:getfield        #117 <Field android.support.v4.util.Pools$Pool pool>
	//   43   85:aload_0         
	//   44   86:invokeinterface #175 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   45   91:pop             
	//   46   92:return          
	}

	public void addCallback(ResourceCallback resourcecallback)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #146 <Method void Util.assertMainThread()>
		stateVerifier.throwIfRecycled();
	//    1    3:aload_0         
	//    2    4:getfield        #107 <Field StateVerifier stateVerifier>
	//    3    7:invokevirtual   #179 <Method void StateVerifier.throwIfRecycled()>
		if(hasResource)
	//*   4   10:aload_0         
	//*   5   11:getfield        #161 <Field boolean hasResource>
	//*   6   14:ifeq            32
		{
			resourcecallback.onResourceReady(((Resource) (engineResource)), dataSource);
	//    7   17:aload_1         
	//    8   18:aload_0         
	//    9   19:getfield        #153 <Field EngineResource engineResource>
	//   10   22:aload_0         
	//   11   23:getfield        #171 <Field DataSource dataSource>
	//   12   26:invokeinterface #185 <Method void ResourceCallback.onResourceReady(Resource, DataSource)>
			return;
	//   13   31:return          
		}
		if(hasLoadFailed)
	//*  14   32:aload_0         
	//*  15   33:getfield        #157 <Field boolean hasLoadFailed>
	//*  16   36:ifeq            50
		{
			resourcecallback.onLoadFailed(exception);
	//   17   39:aload_1         
	//   18   40:aload_0         
	//   19   41:getfield        #169 <Field GlideException exception>
	//   20   44:invokeinterface #189 <Method void ResourceCallback.onLoadFailed(GlideException)>
			return;
	//   21   49:return          
		} else
		{
			cbs.add(((Object) (resourcecallback)));
	//   22   50:aload_0         
	//   23   51:getfield        #99  <Field List cbs>
	//   24   54:aload_1         
	//   25   55:invokeinterface #133 <Method boolean List.add(Object)>
	//   26   60:pop             
			return;
	//   27   61:return          
		}
	}

	void cancel()
	{
		if(hasLoadFailed || hasResource || isCancelled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #157 <Field boolean hasLoadFailed>
	//*   2    4:ifne            21
	//*   3    7:aload_0         
	//*   4    8:getfield        #161 <Field boolean hasResource>
	//*   5   11:ifne            21
	//*   6   14:aload_0         
	//*   7   15:getfield        #159 <Field boolean isCancelled>
	//*   8   18:ifeq            22
		{
			return;
	//    9   21:return          
		} else
		{
			isCancelled = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #159 <Field boolean isCancelled>
			decodeJob.cancel();
	//   13   27:aload_0         
	//   14   28:getfield        #163 <Field DecodeJob decodeJob>
	//   15   31:invokevirtual   #192 <Method void DecodeJob.cancel()>
			listener.onEngineJobCancelled(this, key);
	//   16   34:aload_0         
	//   17   35:getfield        #115 <Field EngineJobListener listener>
	//   18   38:aload_0         
	//   19   39:aload_0         
	//   20   40:getfield        #151 <Field Key key>
	//   21   43:invokeinterface #198 <Method void EngineJobListener.onEngineJobCancelled(EngineJob, Key)>
			return;
	//   22   48:return          
		}
	}

	public StateVerifier getVerifier()
	{
		return stateVerifier;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field StateVerifier stateVerifier>
	//    2    4:areturn         
	}

	void handleCancelledOnMainThread()
	{
		stateVerifier.throwIfRecycled();
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field StateVerifier stateVerifier>
	//    2    4:invokevirtual   #179 <Method void StateVerifier.throwIfRecycled()>
		if(!isCancelled)
	//*   3    7:aload_0         
	//*   4    8:getfield        #159 <Field boolean isCancelled>
	//*   5   11:ifne            24
		{
			throw new IllegalStateException("Not cancelled");
	//    6   14:new             #202 <Class IllegalStateException>
	//    7   17:dup             
	//    8   18:ldc1            #204 <String "Not cancelled">
	//    9   20:invokespecial   #207 <Method void IllegalStateException(String)>
	//   10   23:athrow          
		} else
		{
			listener.onEngineJobCancelled(this, key);
	//   11   24:aload_0         
	//   12   25:getfield        #115 <Field EngineJobListener listener>
	//   13   28:aload_0         
	//   14   29:aload_0         
	//   15   30:getfield        #151 <Field Key key>
	//   16   33:invokeinterface #198 <Method void EngineJobListener.onEngineJobCancelled(EngineJob, Key)>
			release(false);
	//   17   38:aload_0         
	//   18   39:iconst_0        
	//   19   40:invokespecial   #208 <Method void release(boolean)>
			return;
	//   20   43:return          
		}
	}

	void handleExceptionOnMainThread()
	{
		stateVerifier.throwIfRecycled();
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field StateVerifier stateVerifier>
	//    2    4:invokevirtual   #179 <Method void StateVerifier.throwIfRecycled()>
		if(isCancelled)
	//*   3    7:aload_0         
	//*   4    8:getfield        #159 <Field boolean isCancelled>
	//*   5   11:ifeq            20
		{
			release(false);
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:invokespecial   #208 <Method void release(boolean)>
			return;
	//    9   19:return          
		}
		if(cbs.isEmpty())
	//*  10   20:aload_0         
	//*  11   21:getfield        #99  <Field List cbs>
	//*  12   24:invokeinterface #213 <Method boolean List.isEmpty()>
	//*  13   29:ifeq            42
			throw new IllegalStateException("Received an exception without any callbacks to notify");
	//   14   32:new             #202 <Class IllegalStateException>
	//   15   35:dup             
	//   16   36:ldc1            #215 <String "Received an exception without any callbacks to notify">
	//   17   38:invokespecial   #207 <Method void IllegalStateException(String)>
	//   18   41:athrow          
		if(hasLoadFailed)
	//*  19   42:aload_0         
	//*  20   43:getfield        #157 <Field boolean hasLoadFailed>
	//*  21   46:ifeq            59
			throw new IllegalStateException("Already failed once");
	//   22   49:new             #202 <Class IllegalStateException>
	//   23   52:dup             
	//   24   53:ldc1            #217 <String "Already failed once">
	//   25   55:invokespecial   #207 <Method void IllegalStateException(String)>
	//   26   58:athrow          
		hasLoadFailed = true;
	//   27   59:aload_0         
	//   28   60:iconst_1        
	//   29   61:putfield        #157 <Field boolean hasLoadFailed>
		listener.onEngineJobComplete(key, ((EngineResource) (null)));
	//   30   64:aload_0         
	//   31   65:getfield        #115 <Field EngineJobListener listener>
	//   32   68:aload_0         
	//   33   69:getfield        #151 <Field Key key>
	//   34   72:aconst_null     
	//   35   73:invokeinterface #221 <Method void EngineJobListener.onEngineJobComplete(Key, EngineResource)>
		Iterator iterator = cbs.iterator();
	//   36   78:aload_0         
	//   37   79:getfield        #99  <Field List cbs>
	//   38   82:invokeinterface #225 <Method Iterator List.iterator()>
	//   39   87:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//   40   88:aload_1         
	//   41   89:invokeinterface #230 <Method boolean Iterator.hasNext()>
	//   42   94:ifeq            128
			ResourceCallback resourcecallback = (ResourceCallback)iterator.next();
	//   43   97:aload_1         
	//   44   98:invokeinterface #234 <Method Object Iterator.next()>
	//   45  103:checkcast       #181 <Class ResourceCallback>
	//   46  106:astore_2        
			if(!isInIgnoredCallbacks(resourcecallback))
	//*  47  107:aload_0         
	//*  48  108:aload_2         
	//*  49  109:invokespecial   #236 <Method boolean isInIgnoredCallbacks(ResourceCallback)>
	//*  50  112:ifne            125
				resourcecallback.onLoadFailed(exception);
	//   51  115:aload_2         
	//   52  116:aload_0         
	//   53  117:getfield        #169 <Field GlideException exception>
	//   54  120:invokeinterface #189 <Method void ResourceCallback.onLoadFailed(GlideException)>
		} while(true);
	//   55  125:goto            88
		release(false);
	//   56  128:aload_0         
	//   57  129:iconst_0        
	//   58  130:invokespecial   #208 <Method void release(boolean)>
	//   59  133:return          
	}

	void handleResultOnMainThread()
	{
		stateVerifier.throwIfRecycled();
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field StateVerifier stateVerifier>
	//    2    4:invokevirtual   #179 <Method void StateVerifier.throwIfRecycled()>
		if(isCancelled)
	//*   3    7:aload_0         
	//*   4    8:getfield        #159 <Field boolean isCancelled>
	//*   5   11:ifeq            29
		{
			resource.recycle();
	//    6   14:aload_0         
	//    7   15:getfield        #155 <Field Resource resource>
	//    8   18:invokeinterface #242 <Method void Resource.recycle()>
			release(false);
	//    9   23:aload_0         
	//   10   24:iconst_0        
	//   11   25:invokespecial   #208 <Method void release(boolean)>
			return;
	//   12   28:return          
		}
		if(cbs.isEmpty())
	//*  13   29:aload_0         
	//*  14   30:getfield        #99  <Field List cbs>
	//*  15   33:invokeinterface #213 <Method boolean List.isEmpty()>
	//*  16   38:ifeq            51
			throw new IllegalStateException("Received a resource without any callbacks to notify");
	//   17   41:new             #202 <Class IllegalStateException>
	//   18   44:dup             
	//   19   45:ldc1            #244 <String "Received a resource without any callbacks to notify">
	//   20   47:invokespecial   #207 <Method void IllegalStateException(String)>
	//   21   50:athrow          
		if(hasResource)
	//*  22   51:aload_0         
	//*  23   52:getfield        #161 <Field boolean hasResource>
	//*  24   55:ifeq            68
			throw new IllegalStateException("Already have resource");
	//   25   58:new             #202 <Class IllegalStateException>
	//   26   61:dup             
	//   27   62:ldc1            #246 <String "Already have resource">
	//   28   64:invokespecial   #207 <Method void IllegalStateException(String)>
	//   29   67:athrow          
		engineResource = engineResourceFactory.build(resource, isCacheable);
	//   30   68:aload_0         
	//   31   69:aload_0         
	//   32   70:getfield        #119 <Field EngineJob$EngineResourceFactory engineResourceFactory>
	//   33   73:aload_0         
	//   34   74:getfield        #155 <Field Resource resource>
	//   35   77:aload_0         
	//   36   78:getfield        #248 <Field boolean isCacheable>
	//   37   81:invokevirtual   #252 <Method EngineResource EngineJob$EngineResourceFactory.build(Resource, boolean)>
	//   38   84:putfield        #153 <Field EngineResource engineResource>
		hasResource = true;
	//   39   87:aload_0         
	//   40   88:iconst_1        
	//   41   89:putfield        #161 <Field boolean hasResource>
		engineResource.acquire();
	//   42   92:aload_0         
	//   43   93:getfield        #153 <Field EngineResource engineResource>
	//   44   96:invokevirtual   #257 <Method void EngineResource.acquire()>
		listener.onEngineJobComplete(key, engineResource);
	//   45   99:aload_0         
	//   46  100:getfield        #115 <Field EngineJobListener listener>
	//   47  103:aload_0         
	//   48  104:getfield        #151 <Field Key key>
	//   49  107:aload_0         
	//   50  108:getfield        #153 <Field EngineResource engineResource>
	//   51  111:invokeinterface #221 <Method void EngineJobListener.onEngineJobComplete(Key, EngineResource)>
		Iterator iterator = cbs.iterator();
	//   52  116:aload_0         
	//   53  117:getfield        #99  <Field List cbs>
	//   54  120:invokeinterface #225 <Method Iterator List.iterator()>
	//   55  125:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//   56  126:aload_1         
	//   57  127:invokeinterface #230 <Method boolean Iterator.hasNext()>
	//   58  132:ifeq            177
			ResourceCallback resourcecallback = (ResourceCallback)iterator.next();
	//   59  135:aload_1         
	//   60  136:invokeinterface #234 <Method Object Iterator.next()>
	//   61  141:checkcast       #181 <Class ResourceCallback>
	//   62  144:astore_2        
			if(!isInIgnoredCallbacks(resourcecallback))
	//*  63  145:aload_0         
	//*  64  146:aload_2         
	//*  65  147:invokespecial   #236 <Method boolean isInIgnoredCallbacks(ResourceCallback)>
	//*  66  150:ifne            174
			{
				engineResource.acquire();
	//   67  153:aload_0         
	//   68  154:getfield        #153 <Field EngineResource engineResource>
	//   69  157:invokevirtual   #257 <Method void EngineResource.acquire()>
				resourcecallback.onResourceReady(((Resource) (engineResource)), dataSource);
	//   70  160:aload_2         
	//   71  161:aload_0         
	//   72  162:getfield        #153 <Field EngineResource engineResource>
	//   73  165:aload_0         
	//   74  166:getfield        #171 <Field DataSource dataSource>
	//   75  169:invokeinterface #185 <Method void ResourceCallback.onResourceReady(Resource, DataSource)>
			}
		} while(true);
	//   76  174:goto            126
		engineResource.release();
	//   77  177:aload_0         
	//   78  178:getfield        #153 <Field EngineResource engineResource>
	//   79  181:invokevirtual   #259 <Method void EngineResource.release()>
		release(false);
	//   80  184:aload_0         
	//   81  185:iconst_0        
	//   82  186:invokespecial   #208 <Method void release(boolean)>
	//   83  189:return          
	}

	EngineJob init(Key key1, boolean flag, boolean flag1)
	{
		key = key1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #151 <Field Key key>
		isCacheable = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #248 <Field boolean isCacheable>
		useUnlimitedSourceGeneratorPool = flag1;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #137 <Field boolean useUnlimitedSourceGeneratorPool>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	boolean isCancelled()
	{
		return isCancelled;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field boolean isCancelled>
	//    2    4:ireturn         
	}

	public void onLoadFailed(GlideException glideexception)
	{
		exception = glideexception;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #169 <Field GlideException exception>
		MAIN_THREAD_HANDLER.obtainMessage(2, ((Object) (this))).sendToTarget();
	//    3    5:getstatic       #84  <Field Handler MAIN_THREAD_HANDLER>
	//    4    8:iconst_2        
	//    5    9:aload_0         
	//    6   10:invokevirtual   #266 <Method Message Handler.obtainMessage(int, Object)>
	//    7   13:invokevirtual   #271 <Method void Message.sendToTarget()>
	//    8   16:return          
	}

	public void onResourceReady(Resource resource1, DataSource datasource)
	{
		resource = resource1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #155 <Field Resource resource>
		dataSource = datasource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #171 <Field DataSource dataSource>
		MAIN_THREAD_HANDLER.obtainMessage(1, ((Object) (this))).sendToTarget();
	//    6   10:getstatic       #84  <Field Handler MAIN_THREAD_HANDLER>
	//    7   13:iconst_1        
	//    8   14:aload_0         
	//    9   15:invokevirtual   #266 <Method Message Handler.obtainMessage(int, Object)>
	//   10   18:invokevirtual   #271 <Method void Message.sendToTarget()>
	//   11   21:return          
	}

	public void removeCallback(ResourceCallback resourcecallback)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #146 <Method void Util.assertMainThread()>
		stateVerifier.throwIfRecycled();
	//    1    3:aload_0         
	//    2    4:getfield        #107 <Field StateVerifier stateVerifier>
	//    3    7:invokevirtual   #179 <Method void StateVerifier.throwIfRecycled()>
		if(hasResource || hasLoadFailed)
	//*   4   10:aload_0         
	//*   5   11:getfield        #161 <Field boolean hasResource>
	//*   6   14:ifne            24
	//*   7   17:aload_0         
	//*   8   18:getfield        #157 <Field boolean hasLoadFailed>
	//*   9   21:ifeq            30
		{
			addIgnoredCallback(resourcecallback);
	//   10   24:aload_0         
	//   11   25:aload_1         
	//   12   26:invokespecial   #275 <Method void addIgnoredCallback(ResourceCallback)>
			return;
	//   13   29:return          
		}
		cbs.remove(((Object) (resourcecallback)));
	//   14   30:aload_0         
	//   15   31:getfield        #99  <Field List cbs>
	//   16   34:aload_1         
	//   17   35:invokeinterface #278 <Method boolean List.remove(Object)>
	//   18   40:pop             
		if(cbs.isEmpty())
	//*  19   41:aload_0         
	//*  20   42:getfield        #99  <Field List cbs>
	//*  21   45:invokeinterface #213 <Method boolean List.isEmpty()>
	//*  22   50:ifeq            57
			cancel();
	//   23   53:aload_0         
	//   24   54:invokevirtual   #279 <Method void cancel()>
	//   25   57:return          
	}

	public void reschedule(DecodeJob decodejob)
	{
		getActiveSourceExecutor().execute(((Runnable) (decodejob)));
	//    0    0:aload_0         
	//    1    1:invokespecial   #283 <Method GlideExecutor getActiveSourceExecutor()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #289 <Method void GlideExecutor.execute(Runnable)>
	//    4    8:return          
	}

	public void start(DecodeJob decodejob)
	{
		decodeJob = decodejob;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #163 <Field DecodeJob decodeJob>
		GlideExecutor glideexecutor;
		if(decodejob.willDecodeFromCache())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #294 <Method boolean DecodeJob.willDecodeFromCache()>
	//*   5    9:ifeq            20
			glideexecutor = diskCacheExecutor;
	//    6   12:aload_0         
	//    7   13:getfield        #109 <Field GlideExecutor diskCacheExecutor>
	//    8   16:astore_2        
		else
	//*   9   17:goto            25
			glideexecutor = getActiveSourceExecutor();
	//   10   20:aload_0         
	//   11   21:invokespecial   #283 <Method GlideExecutor getActiveSourceExecutor()>
	//   12   24:astore_2        
		glideexecutor.execute(((Runnable) (decodejob)));
	//   13   25:aload_2         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #289 <Method void GlideExecutor.execute(Runnable)>
	//   16   30:return          
	}

	private static final EngineResourceFactory DEFAULT_FACTORY = new EngineResourceFactory();
	private static final Handler MAIN_THREAD_HANDLER = new Handler(Looper.getMainLooper(), ((android.os.Handler.Callback) (new MainThreadCallback())));
	private static final int MSG_CANCELLED = 3;
	private static final int MSG_COMPLETE = 1;
	private static final int MSG_EXCEPTION = 2;
	private final List cbs;
	private DataSource dataSource;
	private DecodeJob decodeJob;
	private final GlideExecutor diskCacheExecutor;
	private EngineResource engineResource;
	private final EngineResourceFactory engineResourceFactory;
	private GlideException exception;
	private boolean hasLoadFailed;
	private boolean hasResource;
	private List ignoredCallbacks;
	private boolean isCacheable;
	private volatile boolean isCancelled;
	private Key key;
	private final EngineJobListener listener;
	private final android.support.v4.util.Pools.Pool pool;
	private Resource resource;
	private final GlideExecutor sourceExecutor;
	private final GlideExecutor sourceUnlimitedExecutor;
	private final StateVerifier stateVerifier;
	private boolean useUnlimitedSourceGeneratorPool;

	static 
	{
	//    0    0:new             #11  <Class EngineJob$EngineResourceFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void EngineJob$EngineResourceFactory()>
	//    3    7:putstatic       #70  <Field EngineJob$EngineResourceFactory DEFAULT_FACTORY>
	//    4   10:new             #72  <Class Handler>
	//    5   13:dup             
	//    6   14:invokestatic    #78  <Method Looper Looper.getMainLooper()>
	//    7   17:new             #14  <Class EngineJob$MainThreadCallback>
	//    8   20:dup             
	//    9   21:invokespecial   #79  <Method void EngineJob$MainThreadCallback()>
	//   10   24:invokespecial   #82  <Method void Handler(Looper, android.os.Handler$Callback)>
	//   11   27:putstatic       #84  <Field Handler MAIN_THREAD_HANDLER>
	//*  12   30:return          
	}
}
