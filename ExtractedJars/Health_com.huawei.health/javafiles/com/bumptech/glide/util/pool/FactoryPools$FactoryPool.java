// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util.pool;

import android.util.Log;

// Referenced classes of package com.bumptech.glide.util.pool:
//			FactoryPools, StateVerifier

static final class FactoryPools$FactoryPool
	implements android.support.v4.util.Pools.Pool
{

	public Object acquire()
	{
		Object obj1 = pool.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field android.support.v4.util.Pools$Pool pool>
	//    2    4:invokeinterface #37  <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    3    9:astore_2        
		Object obj = obj1;
	//    4   10:aload_2         
	//    5   11:astore_1        
		if(obj1 == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       67
		{
			Object obj2 = factory.create();
	//    8   16:aload_0         
	//    9   17:getfield        #28  <Field FactoryPools$Factory factory>
	//   10   20:invokeinterface #42  <Method Object FactoryPools$Factory.create()>
	//   11   25:astore_2        
			obj = obj2;
	//   12   26:aload_2         
	//   13   27:astore_1        
			if(Log.isLoggable("FactoryPools", 2))
	//*  14   28:ldc1            #44  <String "FactoryPools">
	//*  15   30:iconst_2        
	//*  16   31:invokestatic    #50  <Method boolean Log.isLoggable(String, int)>
	//*  17   34:ifeq            67
			{
				Log.v("FactoryPools", (new StringBuilder()).append("Created new ").append(((Object) (obj2.getClass()))).toString());
	//   18   37:ldc1            #44  <String "FactoryPools">
	//   19   39:new             #52  <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #53  <Method void StringBuilder()>
	//   22   46:ldc1            #55  <String "Created new ">
	//   23   48:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   24   51:aload_2         
	//   25   52:invokevirtual   #63  <Method Class Object.getClass()>
	//   26   55:invokevirtual   #66  <Method StringBuilder StringBuilder.append(Object)>
	//   27   58:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   28   61:invokestatic    #74  <Method int Log.v(String, String)>
	//   29   64:pop             
				obj = obj2;
	//   30   65:aload_2         
	//   31   66:astore_1        
			}
		}
		if(obj instanceof FactoryPools.Poolable)
	//*  32   67:aload_1         
	//*  33   68:instanceof      #76  <Class FactoryPools$Poolable>
	//*  34   71:ifeq            87
			((FactoryPools.Poolable)obj).getVerifier().setRecycled(false);
	//   35   74:aload_1         
	//   36   75:checkcast       #76  <Class FactoryPools$Poolable>
	//   37   78:invokeinterface #80  <Method StateVerifier FactoryPools$Poolable.getVerifier()>
	//   38   83:iconst_0        
	//   39   84:invokevirtual   #86  <Method void StateVerifier.setRecycled(boolean)>
		return obj;
	//   40   87:aload_1         
	//   41   88:areturn         
	}

	public boolean release(Object obj)
	{
		if(obj instanceof FactoryPools.Poolable)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #76  <Class FactoryPools$Poolable>
	//*   2    4:ifeq            20
			((FactoryPools.Poolable)obj).getVerifier().setRecycled(true);
	//    3    7:aload_1         
	//    4    8:checkcast       #76  <Class FactoryPools$Poolable>
	//    5   11:invokeinterface #80  <Method StateVerifier FactoryPools$Poolable.getVerifier()>
	//    6   16:iconst_1        
	//    7   17:invokevirtual   #86  <Method void StateVerifier.setRecycled(boolean)>
		resetter.reset(obj);
	//    8   20:aload_0         
	//    9   21:getfield        #30  <Field FactoryPools$Resetter resetter>
	//   10   24:aload_1         
	//   11   25:invokeinterface #95  <Method void FactoryPools$Resetter.reset(Object)>
		return pool.release(obj);
	//   12   30:aload_0         
	//   13   31:getfield        #26  <Field android.support.v4.util.Pools$Pool pool>
	//   14   34:aload_1         
	//   15   35:invokeinterface #97  <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   16   40:ireturn         
	}

	private final FactoryPools.Factory factory;
	private final android.support.v4.util.Pools.Pool pool;
	private final FactoryPools.Resetter resetter;

	FactoryPools$FactoryPool(android.support.v4.util.Pools.Pool pool1, FactoryPools.Factory factory1, FactoryPools.Resetter resetter1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		pool = pool1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field android.support.v4.util.Pools$Pool pool>
		factory = factory1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field FactoryPools$Factory factory>
		resetter = resetter1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #30  <Field FactoryPools$Resetter resetter>
	//   11   19:return          
	}
}
