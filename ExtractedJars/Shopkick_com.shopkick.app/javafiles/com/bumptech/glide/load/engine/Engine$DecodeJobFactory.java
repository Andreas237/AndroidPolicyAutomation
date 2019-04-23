// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.load.engine:
//			Engine, DecodeJob, EngineKey, DiskCacheStrategy

static class Engine$DecodeJobFactory
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
	final der diskCacheProvider;
	final android.support.v4.util.Pools.Pool pool = FactoryPools.simple(150, new com.bumptech.glide.util.pool.FactoryPools.Factory() {

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
);

	Engine$DecodeJobFactory(der der)
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
		diskCacheProvider = der;
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:putfield        #35  <Field DecodeJob$DiskCacheProvider diskCacheProvider>
	//   13   27:return          
	}
}
