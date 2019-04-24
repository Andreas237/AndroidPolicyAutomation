// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;


// Referenced classes of package com.bumptech.glide.load.engine:
//			Engine, DecodeJob

class Engine$DecodeJobFactory$1
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

	final Engine.DecodeJobFactory this$0;

	Engine$DecodeJobFactory$1()
	{
		this$0 = Engine.DecodeJobFactory.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Engine$DecodeJobFactory this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
