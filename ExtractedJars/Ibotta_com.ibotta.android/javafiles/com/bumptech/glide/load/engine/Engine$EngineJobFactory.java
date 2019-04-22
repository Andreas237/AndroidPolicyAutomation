// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;

// Referenced classes of package com.bumptech.glide.load.engine:
//			Engine, EngineJob, EngineJobListener

static class Engine$EngineJobFactory
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
	final android.support.v4.util.Pools.Pool pool = FactoryPools.threadSafe(150, new com.bumptech.glide.util.pool.FactoryPools.Factory() {

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

		final Engine.EngineJobFactory this$0;

			
			{
				this$0 = Engine.EngineJobFactory.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Engine$EngineJobFactory this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
	}
);
	final GlideExecutor sourceExecutor;
	final GlideExecutor sourceUnlimitedExecutor;

	Engine$EngineJobFactory(GlideExecutor glideexecutor, GlideExecutor glideexecutor1, GlideExecutor glideexecutor2, GlideExecutor glideexecutor3, EngineJobListener enginejoblistener)
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
