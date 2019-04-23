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

	private static class MainThreadCallback
		implements android.os.Handler.Callback
	{

		public boolean handleMessage(Message message)
		{
			Object obj = ((Object) ((EngineJob)message.obj));
		//    0    0:aload_1         
		//    1    1:getfield        #22  <Field Object Message.obj>
		//    2    4:checkcast       #8   <Class EngineJob>
		//    3    7:astore_2        
			switch(message.what)
		//*   4    8:aload_1         
		//*   5    9:getfield        #26  <Field int Message.what>
			{
		//*   6   12:tableswitch     1 3: default 40
		//		               1 90
		//		               2 83
		//		               3 76
			default:
				obj = ((Object) (new StringBuilder()));
		//    7   40:new             #28  <Class StringBuilder>
		//    8   43:dup             
		//    9   44:invokespecial   #29  <Method void StringBuilder()>
		//   10   47:astore_2        
				((StringBuilder) (obj)).append("Unrecognized message: ");
		//   11   48:aload_2         
		//   12   49:ldc1            #31  <String "Unrecognized message: ">
		//   13   51:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   14   54:pop             
				((StringBuilder) (obj)).append(message.what);
		//   15   55:aload_2         
		//   16   56:aload_1         
		//   17   57:getfield        #26  <Field int Message.what>
		//   18   60:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
		//   19   63:pop             
				throw new IllegalStateException(((StringBuilder) (obj)).toString());
		//   20   64:new             #40  <Class IllegalStateException>
		//   21   67:dup             
		//   22   68:aload_2         
		//   23   69:invokevirtual   #44  <Method String StringBuilder.toString()>
		//   24   72:invokespecial   #47  <Method void IllegalStateException(String)>
		//   25   75:athrow          

			case 3: // '\003'
				((EngineJob) (obj)).handleCancelledOnMainThread();
		//   26   76:aload_2         
		//   27   77:invokevirtual   #50  <Method void EngineJob.handleCancelledOnMainThread()>
				break;

		//*  28   80:goto            94
			case 2: // '\002'
				((EngineJob) (obj)).handleExceptionOnMainThread();
		//   29   83:aload_2         
		//   30   84:invokevirtual   #53  <Method void EngineJob.handleExceptionOnMainThread()>
				break;

		//*  31   87:goto            94
			case 1: // '\001'
				((EngineJob) (obj)).handleResultOnMainThread();
		//   32   90:aload_2         
		//   33   91:invokevirtual   #56  <Method void EngineJob.handleResultOnMainThread()>
				break;
			}
			return true;
		//   34   94:iconst_1        
		//   35   95:ireturn         
		}

		MainThreadCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
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
	//    8   13:invokespecial   #92  <Method void EngineJob(GlideExecutor, GlideExecutor, GlideExecutor, GlideExecutor, EngineJobListener, android.support.v4.util.Pools$Pool, EngineJob$EngineResourceFactory)>
	//    9   16:return          
	}

	EngineJob(GlideExecutor glideexecutor, GlideExecutor glideexecutor1, GlideExecutor glideexecutor2, GlideExecutor glideexecutor3, EngineJobListener enginejoblistener, android.support.v4.util.Pools.Pool pool1, EngineResourceFactory engineresourcefactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method void Object()>
		cbs = ((List) (new ArrayList(2)));
	//    2    4:aload_0         
	//    3    5:new             #98  <Class ArrayList>
	//    4    8:dup             
	//    5    9:iconst_2        
	//    6   10:invokespecial   #101 <Method void ArrayList(int)>
	//    7   13:putfield        #103 <Field List cbs>
		stateVerifier = StateVerifier.newInstance();
	//    8   16:aload_0         
	//    9   17:invokestatic    #109 <Method StateVerifier StateVerifier.newInstance()>
	//   10   20:putfield        #111 <Field StateVerifier stateVerifier>
		diskCacheExecutor = glideexecutor;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #113 <Field GlideExecutor diskCacheExecutor>
		sourceExecutor = glideexecutor1;
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:putfield        #115 <Field GlideExecutor sourceExecutor>
		sourceUnlimitedExecutor = glideexecutor2;
	//   17   33:aload_0         
	//   18   34:aload_3         
	//   19   35:putfield        #117 <Field GlideExecutor sourceUnlimitedExecutor>
		animationExecutor = glideexecutor3;
	//   20   38:aload_0         
	//   21   39:aload           4
	//   22   41:putfield        #119 <Field GlideExecutor animationExecutor>
		listener = enginejoblistener;
	//   23   44:aload_0         
	//   24   45:aload           5
	//   25   47:putfield        #121 <Field EngineJobListener listener>
		pool = pool1;
	//   26   50:aload_0         
	//   27   51:aload           6
	//   28   53:putfield        #123 <Field android.support.v4.util.Pools$Pool pool>
		engineResourceFactory = engineresourcefactory;
	//   29   56:aload_0         
	//   30   57:aload           7
	//   31   59:putfield        #125 <Field EngineJob$EngineResourceFactory engineResourceFactory>
	//   32   62:return          
	}

	private void addIgnoredCallback(ResourceCallback resourcecallback)
	{
		if(ignoredCallbacks == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field List ignoredCallbacks>
	//*   2    4:ifnonnull       19
			ignoredCallbacks = ((List) (new ArrayList(2)));
	//    3    7:aload_0         
	//    4    8:new             #98  <Class ArrayList>
	//    5   11:dup             
	//    6   12:iconst_2        
	//    7   13:invokespecial   #101 <Method void ArrayList(int)>
	//    8   16:putfield        #131 <Field List ignoredCallbacks>
		if(!ignoredCallbacks.contains(((Object) (resourcecallback))))
	//*   9   19:aload_0         
	//*  10   20:getfield        #131 <Field List ignoredCallbacks>
	//*  11   23:aload_1         
	//*  12   24:invokeinterface #137 <Method boolean List.contains(Object)>
	//*  13   29:ifne            43
			ignoredCallbacks.add(((Object) (resourcecallback)));
	//   14   32:aload_0         
	//   15   33:getfield        #131 <Field List ignoredCallbacks>
	//   16   36:aload_1         
	//   17   37:invokeinterface #140 <Method boolean List.add(Object)>
	//   18   42:pop             
	//   19   43:return          
	}

	private GlideExecutor getActiveSourceExecutor()
	{
		if(useUnlimitedSourceGeneratorPool)
	//*   0    0:aload_0         
	//*   1    1:getfield        #144 <Field boolean useUnlimitedSourceGeneratorPool>
	//*   2    4:ifeq            12
			return sourceUnlimitedExecutor;
	//    3    7:aload_0         
	//    4    8:getfield        #117 <Field GlideExecutor sourceUnlimitedExecutor>
	//    5   11:areturn         
		if(useAnimationPool)
	//*   6   12:aload_0         
	//*   7   13:getfield        #146 <Field boolean useAnimationPool>
	//*   8   16:ifeq            24
			return animationExecutor;
	//    9   19:aload_0         
	//   10   20:getfield        #119 <Field GlideExecutor animationExecutor>
	//   11   23:areturn         
		else
			return sourceExecutor;
	//   12   24:aload_0         
	//   13   25:getfield        #115 <Field GlideExecutor sourceExecutor>
	//   14   28:areturn         
	}

	private boolean isInIgnoredCallbacks(ResourceCallback resourcecallback)
	{
		List list = ignoredCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field List ignoredCallbacks>
	//    2    4:astore_2        
		return list != null && list.contains(((Object) (resourcecallback)));
	//    3    5:aload_2         
	//    4    6:ifnull          21
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #137 <Method boolean List.contains(Object)>
	//    8   16:ifeq            21
	//    9   19:iconst_1        
	//   10   20:ireturn         
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	private void release(boolean flag)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #155 <Method void Util.assertMainThread()>
		cbs.clear();
	//    1    3:aload_0         
	//    2    4:getfield        #103 <Field List cbs>
	//    3    7:invokeinterface #158 <Method void List.clear()>
		key = null;
	//    4   12:aload_0         
	//    5   13:aconst_null     
	//    6   14:putfield        #160 <Field Key key>
		engineResource = null;
	//    7   17:aload_0         
	//    8   18:aconst_null     
	//    9   19:putfield        #162 <Field EngineResource engineResource>
		resource = null;
	//   10   22:aload_0         
	//   11   23:aconst_null     
	//   12   24:putfield        #164 <Field Resource resource>
		List list = ignoredCallbacks;
	//   13   27:aload_0         
	//   14   28:getfield        #131 <Field List ignoredCallbacks>
	//   15   31:astore_2        
		if(list != null)
	//*  16   32:aload_2         
	//*  17   33:ifnull          42
			list.clear();
	//   18   36:aload_2         
	//   19   37:invokeinterface #158 <Method void List.clear()>
		hasLoadFailed = false;
	//   20   42:aload_0         
	//   21   43:iconst_0        
	//   22   44:putfield        #166 <Field boolean hasLoadFailed>
		isCancelled = false;
	//   23   47:aload_0         
	//   24   48:iconst_0        
	//   25   49:putfield        #168 <Field boolean isCancelled>
		hasResource = false;
	//   26   52:aload_0         
	//   27   53:iconst_0        
	//   28   54:putfield        #170 <Field boolean hasResource>
		decodeJob.release(flag);
	//   29   57:aload_0         
	//   30   58:getfield        #172 <Field DecodeJob decodeJob>
	//   31   61:iload_1         
	//   32   62:invokevirtual   #176 <Method void DecodeJob.release(boolean)>
		decodeJob = null;
	//   33   65:aload_0         
	//   34   66:aconst_null     
	//   35   67:putfield        #172 <Field DecodeJob decodeJob>
		exception = null;
	//   36   70:aload_0         
	//   37   71:aconst_null     
	//   38   72:putfield        #178 <Field GlideException exception>
		dataSource = null;
	//   39   75:aload_0         
	//   40   76:aconst_null     
	//   41   77:putfield        #180 <Field DataSource dataSource>
		pool.release(((Object) (this)));
	//   42   80:aload_0         
	//   43   81:getfield        #123 <Field android.support.v4.util.Pools$Pool pool>
	//   44   84:aload_0         
	//   45   85:invokeinterface #184 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   46   90:pop             
	//   47   91:return          
	}

	void addCallback(ResourceCallback resourcecallback)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #155 <Method void Util.assertMainThread()>
		stateVerifier.throwIfRecycled();
	//    1    3:aload_0         
	//    2    4:getfield        #111 <Field StateVerifier stateVerifier>
	//    3    7:invokevirtual   #188 <Method void StateVerifier.throwIfRecycled()>
		if(hasResource)
	//*   4   10:aload_0         
	//*   5   11:getfield        #170 <Field boolean hasResource>
	//*   6   14:ifeq            32
		{
			resourcecallback.onResourceReady(((Resource) (engineResource)), dataSource);
	//    7   17:aload_1         
	//    8   18:aload_0         
	//    9   19:getfield        #162 <Field EngineResource engineResource>
	//   10   22:aload_0         
	//   11   23:getfield        #180 <Field DataSource dataSource>
	//   12   26:invokeinterface #194 <Method void ResourceCallback.onResourceReady(Resource, DataSource)>
			return;
	//   13   31:return          
		}
		if(hasLoadFailed)
	//*  14   32:aload_0         
	//*  15   33:getfield        #166 <Field boolean hasLoadFailed>
	//*  16   36:ifeq            50
		{
			resourcecallback.onLoadFailed(exception);
	//   17   39:aload_1         
	//   18   40:aload_0         
	//   19   41:getfield        #178 <Field GlideException exception>
	//   20   44:invokeinterface #198 <Method void ResourceCallback.onLoadFailed(GlideException)>
			return;
	//   21   49:return          
		} else
		{
			cbs.add(((Object) (resourcecallback)));
	//   22   50:aload_0         
	//   23   51:getfield        #103 <Field List cbs>
	//   24   54:aload_1         
	//   25   55:invokeinterface #140 <Method boolean List.add(Object)>
	//   26   60:pop             
			return;
	//   27   61:return          
		}
	}

	void cancel()
	{
		if(!hasLoadFailed && !hasResource)
	//*   0    0:aload_0         
	//*   1    1:getfield        #166 <Field boolean hasLoadFailed>
	//*   2    4:ifne            49
	//*   3    7:aload_0         
	//*   4    8:getfield        #170 <Field boolean hasResource>
	//*   5   11:ifne            49
		{
			if(isCancelled)
	//*   6   14:aload_0         
	//*   7   15:getfield        #168 <Field boolean isCancelled>
	//*   8   18:ifeq            22
			{
				return;
	//    9   21:return          
			} else
			{
				isCancelled = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #168 <Field boolean isCancelled>
				decodeJob.cancel();
	//   13   27:aload_0         
	//   14   28:getfield        #172 <Field DecodeJob decodeJob>
	//   15   31:invokevirtual   #201 <Method void DecodeJob.cancel()>
				listener.onEngineJobCancelled(this, key);
	//   16   34:aload_0         
	//   17   35:getfield        #121 <Field EngineJobListener listener>
	//   18   38:aload_0         
	//   19   39:aload_0         
	//   20   40:getfield        #160 <Field Key key>
	//   21   43:invokeinterface #207 <Method void EngineJobListener.onEngineJobCancelled(EngineJob, Key)>
				return;
	//   22   48:return          
			}
		} else
		{
			return;
	//   23   49:return          
		}
	}

	public StateVerifier getVerifier()
	{
		return stateVerifier;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field StateVerifier stateVerifier>
	//    2    4:areturn         
	}

	void handleCancelledOnMainThread()
	{
		stateVerifier.throwIfRecycled();
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field StateVerifier stateVerifier>
	//    2    4:invokevirtual   #188 <Method void StateVerifier.throwIfRecycled()>
		if(isCancelled)
	//*   3    7:aload_0         
	//*   4    8:getfield        #168 <Field boolean isCancelled>
	//*   5   11:ifeq            34
		{
			listener.onEngineJobCancelled(this, key);
	//    6   14:aload_0         
	//    7   15:getfield        #121 <Field EngineJobListener listener>
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #160 <Field Key key>
	//   11   23:invokeinterface #207 <Method void EngineJobListener.onEngineJobCancelled(EngineJob, Key)>
			release(false);
	//   12   28:aload_0         
	//   13   29:iconst_0        
	//   14   30:invokespecial   #211 <Method void release(boolean)>
			return;
	//   15   33:return          
		} else
		{
			throw new IllegalStateException("Not cancelled");
	//   16   34:new             #213 <Class IllegalStateException>
	//   17   37:dup             
	//   18   38:ldc1            #215 <String "Not cancelled">
	//   19   40:invokespecial   #218 <Method void IllegalStateException(String)>
	//   20   43:athrow          
		}
	}

	void handleExceptionOnMainThread()
	{
		stateVerifier.throwIfRecycled();
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field StateVerifier stateVerifier>
	//    2    4:invokevirtual   #188 <Method void StateVerifier.throwIfRecycled()>
		if(isCancelled)
	//*   3    7:aload_0         
	//*   4    8:getfield        #168 <Field boolean isCancelled>
	//*   5   11:ifeq            20
		{
			release(false);
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:invokespecial   #211 <Method void release(boolean)>
			return;
	//    9   19:return          
		}
		if(!cbs.isEmpty())
	//*  10   20:aload_0         
	//*  11   21:getfield        #103 <Field List cbs>
	//*  12   24:invokeinterface #223 <Method boolean List.isEmpty()>
	//*  13   29:ifne            125
		{
			if(!hasLoadFailed)
	//*  14   32:aload_0         
	//*  15   33:getfield        #166 <Field boolean hasLoadFailed>
	//*  16   36:ifne            115
			{
				hasLoadFailed = true;
	//   17   39:aload_0         
	//   18   40:iconst_1        
	//   19   41:putfield        #166 <Field boolean hasLoadFailed>
				listener.onEngineJobComplete(this, key, ((EngineResource) (null)));
	//   20   44:aload_0         
	//   21   45:getfield        #121 <Field EngineJobListener listener>
	//   22   48:aload_0         
	//   23   49:aload_0         
	//   24   50:getfield        #160 <Field Key key>
	//   25   53:aconst_null     
	//   26   54:invokeinterface #227 <Method void EngineJobListener.onEngineJobComplete(EngineJob, Key, EngineResource)>
				Iterator iterator = cbs.iterator();
	//   27   59:aload_0         
	//   28   60:getfield        #103 <Field List cbs>
	//   29   63:invokeinterface #231 <Method Iterator List.iterator()>
	//   30   68:astore_1        
				do
				{
					if(!iterator.hasNext())
						break;
	//   31   69:aload_1         
	//   32   70:invokeinterface #236 <Method boolean Iterator.hasNext()>
	//   33   75:ifeq            109
					ResourceCallback resourcecallback = (ResourceCallback)iterator.next();
	//   34   78:aload_1         
	//   35   79:invokeinterface #240 <Method Object Iterator.next()>
	//   36   84:checkcast       #190 <Class ResourceCallback>
	//   37   87:astore_2        
					if(!isInIgnoredCallbacks(resourcecallback))
	//*  38   88:aload_0         
	//*  39   89:aload_2         
	//*  40   90:invokespecial   #242 <Method boolean isInIgnoredCallbacks(ResourceCallback)>
	//*  41   93:ifne            69
						resourcecallback.onLoadFailed(exception);
	//   42   96:aload_2         
	//   43   97:aload_0         
	//   44   98:getfield        #178 <Field GlideException exception>
	//   45  101:invokeinterface #198 <Method void ResourceCallback.onLoadFailed(GlideException)>
				} while(true);
	//   46  106:goto            69
				release(false);
	//   47  109:aload_0         
	//   48  110:iconst_0        
	//   49  111:invokespecial   #211 <Method void release(boolean)>
				return;
	//   50  114:return          
			} else
			{
				throw new IllegalStateException("Already failed once");
	//   51  115:new             #213 <Class IllegalStateException>
	//   52  118:dup             
	//   53  119:ldc1            #244 <String "Already failed once">
	//   54  121:invokespecial   #218 <Method void IllegalStateException(String)>
	//   55  124:athrow          
			}
		} else
		{
			throw new IllegalStateException("Received an exception without any callbacks to notify");
	//   56  125:new             #213 <Class IllegalStateException>
	//   57  128:dup             
	//   58  129:ldc1            #246 <String "Received an exception without any callbacks to notify">
	//   59  131:invokespecial   #218 <Method void IllegalStateException(String)>
	//   60  134:athrow          
		}
	}

	void handleResultOnMainThread()
	{
		stateVerifier.throwIfRecycled();
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field StateVerifier stateVerifier>
	//    2    4:invokevirtual   #188 <Method void StateVerifier.throwIfRecycled()>
		if(isCancelled)
	//*   3    7:aload_0         
	//*   4    8:getfield        #168 <Field boolean isCancelled>
	//*   5   11:ifeq            29
		{
			resource.recycle();
	//    6   14:aload_0         
	//    7   15:getfield        #164 <Field Resource resource>
	//    8   18:invokeinterface #252 <Method void Resource.recycle()>
			release(false);
	//    9   23:aload_0         
	//   10   24:iconst_0        
	//   11   25:invokespecial   #211 <Method void release(boolean)>
			return;
	//   12   28:return          
		}
		if(!cbs.isEmpty())
	//*  13   29:aload_0         
	//*  14   30:getfield        #103 <Field List cbs>
	//*  15   33:invokeinterface #223 <Method boolean List.isEmpty()>
	//*  16   38:ifne            188
		{
			if(!hasResource)
	//*  17   41:aload_0         
	//*  18   42:getfield        #170 <Field boolean hasResource>
	//*  19   45:ifne            177
			{
				engineResource = engineResourceFactory.build(resource, isCacheable);
	//   20   48:aload_0         
	//   21   49:aload_0         
	//   22   50:getfield        #125 <Field EngineJob$EngineResourceFactory engineResourceFactory>
	//   23   53:aload_0         
	//   24   54:getfield        #164 <Field Resource resource>
	//   25   57:aload_0         
	//   26   58:getfield        #254 <Field boolean isCacheable>
	//   27   61:invokevirtual   #258 <Method EngineResource EngineJob$EngineResourceFactory.build(Resource, boolean)>
	//   28   64:putfield        #162 <Field EngineResource engineResource>
				hasResource = true;
	//   29   67:aload_0         
	//   30   68:iconst_1        
	//   31   69:putfield        #170 <Field boolean hasResource>
				engineResource.acquire();
	//   32   72:aload_0         
	//   33   73:getfield        #162 <Field EngineResource engineResource>
	//   34   76:invokevirtual   #263 <Method void EngineResource.acquire()>
				listener.onEngineJobComplete(this, key, engineResource);
	//   35   79:aload_0         
	//   36   80:getfield        #121 <Field EngineJobListener listener>
	//   37   83:aload_0         
	//   38   84:aload_0         
	//   39   85:getfield        #160 <Field Key key>
	//   40   88:aload_0         
	//   41   89:getfield        #162 <Field EngineResource engineResource>
	//   42   92:invokeinterface #227 <Method void EngineJobListener.onEngineJobComplete(EngineJob, Key, EngineResource)>
				int j = cbs.size();
	//   43   97:aload_0         
	//   44   98:getfield        #103 <Field List cbs>
	//   45  101:invokeinterface #267 <Method int List.size()>
	//   46  106:istore_2        
				for(int i = 0; i < j; i++)
	//*  47  107:iconst_0        
	//*  48  108:istore_1        
	//*  49  109:iload_1         
	//*  50  110:iload_2         
	//*  51  111:icmpge          164
				{
					ResourceCallback resourcecallback = (ResourceCallback)cbs.get(i);
	//   52  114:aload_0         
	//   53  115:getfield        #103 <Field List cbs>
	//   54  118:iload_1         
	//   55  119:invokeinterface #271 <Method Object List.get(int)>
	//   56  124:checkcast       #190 <Class ResourceCallback>
	//   57  127:astore_3        
					if(!isInIgnoredCallbacks(resourcecallback))
	//*  58  128:aload_0         
	//*  59  129:aload_3         
	//*  60  130:invokespecial   #242 <Method boolean isInIgnoredCallbacks(ResourceCallback)>
	//*  61  133:ifne            157
					{
						engineResource.acquire();
	//   62  136:aload_0         
	//   63  137:getfield        #162 <Field EngineResource engineResource>
	//   64  140:invokevirtual   #263 <Method void EngineResource.acquire()>
						resourcecallback.onResourceReady(((Resource) (engineResource)), dataSource);
	//   65  143:aload_3         
	//   66  144:aload_0         
	//   67  145:getfield        #162 <Field EngineResource engineResource>
	//   68  148:aload_0         
	//   69  149:getfield        #180 <Field DataSource dataSource>
	//   70  152:invokeinterface #194 <Method void ResourceCallback.onResourceReady(Resource, DataSource)>
					}
				}

	//   71  157:iload_1         
	//   72  158:iconst_1        
	//   73  159:iadd            
	//   74  160:istore_1        
	//*  75  161:goto            109
				engineResource.release();
	//   76  164:aload_0         
	//   77  165:getfield        #162 <Field EngineResource engineResource>
	//   78  168:invokevirtual   #273 <Method void EngineResource.release()>
				release(false);
	//   79  171:aload_0         
	//   80  172:iconst_0        
	//   81  173:invokespecial   #211 <Method void release(boolean)>
				return;
	//   82  176:return          
			} else
			{
				throw new IllegalStateException("Already have resource");
	//   83  177:new             #213 <Class IllegalStateException>
	//   84  180:dup             
	//   85  181:ldc2            #275 <String "Already have resource">
	//   86  184:invokespecial   #218 <Method void IllegalStateException(String)>
	//   87  187:athrow          
			}
		} else
		{
			throw new IllegalStateException("Received a resource without any callbacks to notify");
	//   88  188:new             #213 <Class IllegalStateException>
	//   89  191:dup             
	//   90  192:ldc2            #277 <String "Received a resource without any callbacks to notify">
	//   91  195:invokespecial   #218 <Method void IllegalStateException(String)>
	//   92  198:athrow          
		}
	}

	EngineJob init(Key key1, boolean flag, boolean flag1, boolean flag2, boolean flag3)
	{
		key = key1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #160 <Field Key key>
		isCacheable = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #254 <Field boolean isCacheable>
		useUnlimitedSourceGeneratorPool = flag1;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #144 <Field boolean useUnlimitedSourceGeneratorPool>
		useAnimationPool = flag2;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #146 <Field boolean useAnimationPool>
		onlyRetrieveFromCache = flag3;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #281 <Field boolean onlyRetrieveFromCache>
		return this;
	//   15   27:aload_0         
	//   16   28:areturn         
	}

	boolean isCancelled()
	{
		return isCancelled;
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field boolean isCancelled>
	//    2    4:ireturn         
	}

	public void onLoadFailed(GlideException glideexception)
	{
		exception = glideexception;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #178 <Field GlideException exception>
		MAIN_THREAD_HANDLER.obtainMessage(2, ((Object) (this))).sendToTarget();
	//    3    5:getstatic       #87  <Field Handler MAIN_THREAD_HANDLER>
	//    4    8:iconst_2        
	//    5    9:aload_0         
	//    6   10:invokevirtual   #286 <Method Message Handler.obtainMessage(int, Object)>
	//    7   13:invokevirtual   #291 <Method void Message.sendToTarget()>
	//    8   16:return          
	}

	public void onResourceReady(Resource resource1, DataSource datasource)
	{
		resource = resource1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #164 <Field Resource resource>
		dataSource = datasource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #180 <Field DataSource dataSource>
		MAIN_THREAD_HANDLER.obtainMessage(1, ((Object) (this))).sendToTarget();
	//    6   10:getstatic       #87  <Field Handler MAIN_THREAD_HANDLER>
	//    7   13:iconst_1        
	//    8   14:aload_0         
	//    9   15:invokevirtual   #286 <Method Message Handler.obtainMessage(int, Object)>
	//   10   18:invokevirtual   #291 <Method void Message.sendToTarget()>
	//   11   21:return          
	}

	boolean onlyRetrieveFromCache()
	{
		return onlyRetrieveFromCache;
	//    0    0:aload_0         
	//    1    1:getfield        #281 <Field boolean onlyRetrieveFromCache>
	//    2    4:ireturn         
	}

	void removeCallback(ResourceCallback resourcecallback)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #155 <Method void Util.assertMainThread()>
		stateVerifier.throwIfRecycled();
	//    1    3:aload_0         
	//    2    4:getfield        #111 <Field StateVerifier stateVerifier>
	//    3    7:invokevirtual   #188 <Method void StateVerifier.throwIfRecycled()>
		if(!hasResource && !hasLoadFailed)
	//*   4   10:aload_0         
	//*   5   11:getfield        #170 <Field boolean hasResource>
	//*   6   14:ifne            55
	//*   7   17:aload_0         
	//*   8   18:getfield        #166 <Field boolean hasLoadFailed>
	//*   9   21:ifeq            27
	//*  10   24:goto            55
		{
			cbs.remove(((Object) (resourcecallback)));
	//   11   27:aload_0         
	//   12   28:getfield        #103 <Field List cbs>
	//   13   31:aload_1         
	//   14   32:invokeinterface #296 <Method boolean List.remove(Object)>
	//   15   37:pop             
			if(cbs.isEmpty())
	//*  16   38:aload_0         
	//*  17   39:getfield        #103 <Field List cbs>
	//*  18   42:invokeinterface #223 <Method boolean List.isEmpty()>
	//*  19   47:ifeq            60
			{
				cancel();
	//   20   50:aload_0         
	//   21   51:invokevirtual   #297 <Method void cancel()>
				return;
	//   22   54:return          
			}
		} else
		{
			addIgnoredCallback(resourcecallback);
	//   23   55:aload_0         
	//   24   56:aload_1         
	//   25   57:invokespecial   #299 <Method void addIgnoredCallback(ResourceCallback)>
		}
	//   26   60:return          
	}

	public void reschedule(DecodeJob decodejob)
	{
		getActiveSourceExecutor().execute(((Runnable) (decodejob)));
	//    0    0:aload_0         
	//    1    1:invokespecial   #303 <Method GlideExecutor getActiveSourceExecutor()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #309 <Method void GlideExecutor.execute(Runnable)>
	//    4    8:return          
	}

	public void start(DecodeJob decodejob)
	{
		decodeJob = decodejob;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #172 <Field DecodeJob decodeJob>
		GlideExecutor glideexecutor;
		if(decodejob.willDecodeFromCache())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #314 <Method boolean DecodeJob.willDecodeFromCache()>
	//*   5    9:ifeq            20
			glideexecutor = diskCacheExecutor;
	//    6   12:aload_0         
	//    7   13:getfield        #113 <Field GlideExecutor diskCacheExecutor>
	//    8   16:astore_2        
		else
	//*   9   17:goto            25
			glideexecutor = getActiveSourceExecutor();
	//   10   20:aload_0         
	//   11   21:invokespecial   #303 <Method GlideExecutor getActiveSourceExecutor()>
	//   12   24:astore_2        
		glideexecutor.execute(((Runnable) (decodejob)));
	//   13   25:aload_2         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #309 <Method void GlideExecutor.execute(Runnable)>
	//   16   30:return          
	}

	private static final EngineResourceFactory DEFAULT_FACTORY = new EngineResourceFactory();
	private static final Handler MAIN_THREAD_HANDLER = new Handler(Looper.getMainLooper(), ((android.os.Handler.Callback) (new MainThreadCallback())));
	private static final int MSG_CANCELLED = 3;
	private static final int MSG_COMPLETE = 1;
	private static final int MSG_EXCEPTION = 2;
	private final GlideExecutor animationExecutor;
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
	private boolean onlyRetrieveFromCache;
	private final android.support.v4.util.Pools.Pool pool;
	private Resource resource;
	private final GlideExecutor sourceExecutor;
	private final GlideExecutor sourceUnlimitedExecutor;
	private final StateVerifier stateVerifier;
	private boolean useAnimationPool;
	private boolean useUnlimitedSourceGeneratorPool;

	static 
	{
	//    0    0:new             #11  <Class EngineJob$EngineResourceFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #71  <Method void EngineJob$EngineResourceFactory()>
	//    3    7:putstatic       #73  <Field EngineJob$EngineResourceFactory DEFAULT_FACTORY>
	//    4   10:new             #75  <Class Handler>
	//    5   13:dup             
	//    6   14:invokestatic    #81  <Method Looper Looper.getMainLooper()>
	//    7   17:new             #14  <Class EngineJob$MainThreadCallback>
	//    8   20:dup             
	//    9   21:invokespecial   #82  <Method void EngineJob$MainThreadCallback()>
	//   10   24:invokespecial   #85  <Method void Handler(Looper, android.os.Handler$Callback)>
	//   11   27:putstatic       #87  <Field Handler MAIN_THREAD_HANDLER>
	//*  12   30:return          
	}
}
