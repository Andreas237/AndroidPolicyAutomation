// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;


// Referenced classes of package com.bumptech.glide.load.engine:
//			Engine, EngineJob

class Engine$EngineJobFactory$1
	implements com.bumptech.glide.util.pool.FactoryPools.Factory
{

	public EngineJob create()
	{
		return new EngineJob(diskCacheExecutor, sourceExecutor, sourceUnlimitedExecutor, animationExecutor, listener, pool);
	//    0    0:new             #26  <Class EngineJob>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field Engine$EngineJobFactory this$0>
	//    4    8:getfield        #30  <Field com.bumptech.glide.load.engine.executor.GlideExecutor Engine$EngineJobFactory.diskCacheExecutor>
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field Engine$EngineJobFactory this$0>
	//    7   15:getfield        #33  <Field com.bumptech.glide.load.engine.executor.GlideExecutor Engine$EngineJobFactory.sourceExecutor>
	//    8   18:aload_0         
	//    9   19:getfield        #18  <Field Engine$EngineJobFactory this$0>
	//   10   22:getfield        #36  <Field com.bumptech.glide.load.engine.executor.GlideExecutor Engine$EngineJobFactory.sourceUnlimitedExecutor>
	//   11   25:aload_0         
	//   12   26:getfield        #18  <Field Engine$EngineJobFactory this$0>
	//   13   29:getfield        #39  <Field com.bumptech.glide.load.engine.executor.GlideExecutor Engine$EngineJobFactory.animationExecutor>
	//   14   32:aload_0         
	//   15   33:getfield        #18  <Field Engine$EngineJobFactory this$0>
	//   16   36:getfield        #43  <Field EngineJobListener Engine$EngineJobFactory.listener>
	//   17   39:aload_0         
	//   18   40:getfield        #18  <Field Engine$EngineJobFactory this$0>
	//   19   43:getfield        #47  <Field android.support.v4.util.Pools$Pool Engine$EngineJobFactory.pool>
	//   20   46:invokespecial   #50  <Method void EngineJob(com.bumptech.glide.load.engine.executor.GlideExecutor, com.bumptech.glide.load.engine.executor.GlideExecutor, com.bumptech.glide.load.engine.executor.GlideExecutor, com.bumptech.glide.load.engine.executor.GlideExecutor, EngineJobListener, android.support.v4.util.Pools$Pool)>
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

	Engine$EngineJobFactory$1()
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
