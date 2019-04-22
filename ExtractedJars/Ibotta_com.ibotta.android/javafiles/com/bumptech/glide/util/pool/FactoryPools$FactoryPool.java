// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util.pool;

import android.util.Log;

// Referenced classes of package com.bumptech.glide.util.pool:
//			FactoryPools, StateVerifier

private static final class FactoryPools$FactoryPool
	implements android.support.v4.util.Pools.Pool
{

	public Object acquire()
	{
		Object obj1 = pool.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field android.support.v4.util.Pools$Pool pool>
	//    2    4:invokeinterface #39  <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    3    9:astore_2        
		Object obj = obj1;
	//    4   10:aload_2         
	//    5   11:astore_1        
		if(obj1 == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       73
		{
			Object obj2 = factory.create();
	//    8   16:aload_0         
	//    9   17:getfield        #29  <Field FactoryPools$Factory factory>
	//   10   20:invokeinterface #44  <Method Object FactoryPools$Factory.create()>
	//   11   25:astore_2        
			obj = obj2;
	//   12   26:aload_2         
	//   13   27:astore_1        
			if(Log.isLoggable("FactoryPools", 2))
	//*  14   28:ldc1            #46  <String "FactoryPools">
	//*  15   30:iconst_2        
	//*  16   31:invokestatic    #52  <Method boolean Log.isLoggable(String, int)>
	//*  17   34:ifeq            73
			{
				obj = ((Object) (new StringBuilder()));
	//   18   37:new             #54  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #55  <Method void StringBuilder()>
	//   21   44:astore_1        
				((StringBuilder) (obj)).append("Created new ");
	//   22   45:aload_1         
	//   23   46:ldc1            #57  <String "Created new ">
	//   24   48:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
				((StringBuilder) (obj)).append(((Object) (obj2.getClass())));
	//   26   52:aload_1         
	//   27   53:aload_2         
	//   28   54:invokevirtual   #65  <Method Class Object.getClass()>
	//   29   57:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
	//   30   60:pop             
				Log.v("FactoryPools", ((StringBuilder) (obj)).toString());
	//   31   61:ldc1            #46  <String "FactoryPools">
	//   32   63:aload_1         
	//   33   64:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   34   67:invokestatic    #76  <Method int Log.v(String, String)>
	//   35   70:pop             
				obj = obj2;
	//   36   71:aload_2         
	//   37   72:astore_1        
			}
		}
		if(obj instanceof FactoryPools.Poolable)
	//*  38   73:aload_1         
	//*  39   74:instanceof      #78  <Class FactoryPools$Poolable>
	//*  40   77:ifeq            93
			((FactoryPools.Poolable)obj).getVerifier().setRecycled(false);
	//   41   80:aload_1         
	//   42   81:checkcast       #78  <Class FactoryPools$Poolable>
	//   43   84:invokeinterface #82  <Method StateVerifier FactoryPools$Poolable.getVerifier()>
	//   44   89:iconst_0        
	//   45   90:invokevirtual   #88  <Method void StateVerifier.setRecycled(boolean)>
		return obj;
	//   46   93:aload_1         
	//   47   94:areturn         
	}

	public boolean release(Object obj)
	{
		if(obj instanceof FactoryPools.Poolable)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #78  <Class FactoryPools$Poolable>
	//*   2    4:ifeq            20
			((FactoryPools.Poolable)obj).getVerifier().setRecycled(true);
	//    3    7:aload_1         
	//    4    8:checkcast       #78  <Class FactoryPools$Poolable>
	//    5   11:invokeinterface #82  <Method StateVerifier FactoryPools$Poolable.getVerifier()>
	//    6   16:iconst_1        
	//    7   17:invokevirtual   #88  <Method void StateVerifier.setRecycled(boolean)>
		resetter.reset(obj);
	//    8   20:aload_0         
	//    9   21:getfield        #31  <Field FactoryPools$Resetter resetter>
	//   10   24:aload_1         
	//   11   25:invokeinterface #97  <Method void FactoryPools$Resetter.reset(Object)>
		return pool.release(obj);
	//   12   30:aload_0         
	//   13   31:getfield        #27  <Field android.support.v4.util.Pools$Pool pool>
	//   14   34:aload_1         
	//   15   35:invokeinterface #99  <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   16   40:ireturn         
	}

	private final FactoryPools.Factory factory;
	private final android.support.v4.util.Pools.Pool pool;
	private final FactoryPools.Resetter resetter;

	FactoryPools$FactoryPool(android.support.v4.util.Pools.Pool pool1, FactoryPools.Factory factory1, FactoryPools.Resetter resetter1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		pool = pool1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field android.support.v4.util.Pools$Pool pool>
		factory = factory1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field FactoryPools$Factory factory>
		resetter = resetter1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #31  <Field FactoryPools$Resetter resetter>
	//   11   19:return          
	}
}
