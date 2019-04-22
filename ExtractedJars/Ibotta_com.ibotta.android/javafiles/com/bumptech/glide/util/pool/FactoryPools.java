// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util.pool;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.bumptech.glide.util.pool:
//			StateVerifier

public final class FactoryPools
{
	public static interface Factory
	{

		public abstract Object create();
	}

	private static final class FactoryPool
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
			if(obj instanceof Poolable)
		//*  38   73:aload_1         
		//*  39   74:instanceof      #78  <Class FactoryPools$Poolable>
		//*  40   77:ifeq            93
				((Poolable)obj).getVerifier().setRecycled(false);
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
			if(obj instanceof Poolable)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #78  <Class FactoryPools$Poolable>
		//*   2    4:ifeq            20
				((Poolable)obj).getVerifier().setRecycled(true);
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

		private final Factory factory;
		private final android.support.v4.util.Pools.Pool pool;
		private final Resetter resetter;

		FactoryPool(android.support.v4.util.Pools.Pool pool1, Factory factory1, Resetter resetter1)
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

	public static interface Poolable
	{

		public abstract StateVerifier getVerifier();
	}

	public static interface Resetter
	{

		public abstract void reset(Object obj);
	}


	private static android.support.v4.util.Pools.Pool build(android.support.v4.util.Pools.Pool pool, Factory factory)
	{
		return build(pool, factory, emptyResetter());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #40  <Method FactoryPools$Resetter emptyResetter()>
	//    3    5:invokestatic    #43  <Method android.support.v4.util.Pools$Pool build(android.support.v4.util.Pools$Pool, FactoryPools$Factory, FactoryPools$Resetter)>
	//    4    8:areturn         
	}

	private static android.support.v4.util.Pools.Pool build(android.support.v4.util.Pools.Pool pool, Factory factory, Resetter resetter)
	{
		return ((android.support.v4.util.Pools.Pool) (new FactoryPool(pool, factory, resetter)));
	//    0    0:new             #15  <Class FactoryPools$FactoryPool>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #50  <Method void FactoryPools$FactoryPool(android.support.v4.util.Pools$Pool, FactoryPools$Factory, FactoryPools$Resetter)>
	//    6   10:areturn         
	}

	private static Resetter emptyResetter()
	{
		return EMPTY_RESETTER;
	//    0    0:getstatic       #32  <Field FactoryPools$Resetter EMPTY_RESETTER>
	//    1    3:areturn         
	}

	public static android.support.v4.util.Pools.Pool threadSafe(int i, Factory factory)
	{
		return build(((android.support.v4.util.Pools.Pool) (new android.support.v4.util.Pools.SynchronizedPool(i))), factory);
	//    0    0:new             #56  <Class android.support.v4.util.Pools$SynchronizedPool>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokespecial   #59  <Method void android.support.v4.util.Pools$SynchronizedPool(int)>
	//    4    8:aload_1         
	//    5    9:invokestatic    #61  <Method android.support.v4.util.Pools$Pool build(android.support.v4.util.Pools$Pool, FactoryPools$Factory)>
	//    6   12:areturn         
	}

	public static android.support.v4.util.Pools.Pool threadSafeList()
	{
		return threadSafeList(20);
	//    0    0:bipush          20
	//    1    2:invokestatic    #67  <Method android.support.v4.util.Pools$Pool threadSafeList(int)>
	//    2    5:areturn         
	}

	public static android.support.v4.util.Pools.Pool threadSafeList(int i)
	{
		return build(((android.support.v4.util.Pools.Pool) (new android.support.v4.util.Pools.SynchronizedPool(i))), new Factory() {

			public volatile Object create()
			{
				return ((Object) (create()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #23  <Method List create()>
			//    2    4:areturn         
			}

			public List create()
			{
				return ((List) (new ArrayList()));
			//    0    0:new             #26  <Class ArrayList>
			//    1    3:dup             
			//    2    4:invokespecial   #27  <Method void ArrayList()>
			//    3    7:areturn         
			}

		}
, new Resetter() {

			public volatile void reset(Object obj)
			{
				reset((List)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #22  <Class List>
			//    3    5:invokevirtual   #25  <Method void reset(List)>
			//    4    8:return          
			}

			public void reset(List list)
			{
				list.clear();
			//    0    0:aload_1         
			//    1    1:invokeinterface #29  <Method void List.clear()>
			//    2    6:return          
			}

		}
);
	//    0    0:new             #56  <Class android.support.v4.util.Pools$SynchronizedPool>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokespecial   #59  <Method void android.support.v4.util.Pools$SynchronizedPool(int)>
	//    4    8:new             #8   <Class FactoryPools$2>
	//    5   11:dup             
	//    6   12:invokespecial   #69  <Method void FactoryPools$2()>
	//    7   15:new             #10  <Class FactoryPools$3>
	//    8   18:dup             
	//    9   19:invokespecial   #70  <Method void FactoryPools$3()>
	//   10   22:invokestatic    #43  <Method android.support.v4.util.Pools$Pool build(android.support.v4.util.Pools$Pool, FactoryPools$Factory, FactoryPools$Resetter)>
	//   11   25:areturn         
	}

	private static final Resetter EMPTY_RESETTER = new Resetter() {

		public void reset(Object obj)
		{
		//    0    0:return          
		}

	}
;

	static 
	{
	//    0    0:new             #6   <Class FactoryPools$1>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void FactoryPools$1()>
	//    3    7:putstatic       #32  <Field FactoryPools$Resetter EMPTY_RESETTER>
	//*   4   10:return          
	}
}
