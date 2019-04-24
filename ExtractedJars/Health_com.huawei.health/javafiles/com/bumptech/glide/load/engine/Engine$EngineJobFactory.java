// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.util.pool.FactoryPools;

// Referenced classes of package com.bumptech.glide.load.engine:
//			Engine, EngineJob, EngineJobListener

static class Engine$EngineJobFactory
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
	final android.support.v4.util.Pools.Pool pool = FactoryPools.simple(150, new com.bumptech.glide.util.pool.FactoryPools.Factory() {

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

	Engine$EngineJobFactory(GlideExecutor glideexecutor, GlideExecutor glideexecutor1, GlideExecutor glideexecutor2, EngineJobListener enginejoblistener)
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
