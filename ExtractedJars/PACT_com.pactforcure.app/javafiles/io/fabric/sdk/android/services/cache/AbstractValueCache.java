// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.cache;

import android.content.Context;

// Referenced classes of package io.fabric.sdk.android.services.cache:
//			ValueCache, ValueLoader

public abstract class AbstractValueCache
	implements ValueCache
{

	public AbstractValueCache()
	{
		this(((ValueCache) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #15  <Method void AbstractValueCache(ValueCache)>
	//    3    5:return          
	}

	public AbstractValueCache(ValueCache valuecache)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		childCache = valuecache;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field ValueCache childCache>
	//    5    9:return          
	}

	private void cache(Context context, Object obj)
	{
		if(obj == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #26  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #27  <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			cacheValue(context, obj);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #30  <Method void cacheValue(Context, Object)>
			return;
	//   10   18:return          
		}
	}

	protected abstract void cacheValue(Context context, Object obj);

	protected abstract void doInvalidate(Context context);

	public final Object get(Context context, ValueLoader valueloader)
		throws Exception
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj1 = getCached(context);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #41  <Method Object getCached(Context)>
	//    5    7:astore          4
		Object obj = obj1;
	//    6    9:aload           4
	//    7   11:astore_3        
		if(obj1 != null) goto _L2; else goto _L1
	//    8   12:aload           4
	//    9   14:ifnonnull       44
_L1:
		if(childCache == null)
			break MISSING_BLOCK_LABEL_48;
	//   10   17:aload_0         
	//   11   18:getfield        #20  <Field ValueCache childCache>
	//   12   21:ifnull          48
		valueloader = ((ValueLoader) (childCache.get(context, valueloader)));
	//   13   24:aload_0         
	//   14   25:getfield        #20  <Field ValueCache childCache>
	//   15   28:aload_1         
	//   16   29:aload_2         
	//   17   30:invokeinterface #43  <Method Object ValueCache.get(Context, ValueLoader)>
	//   18   35:astore_2        
_L3:
		cache(context, ((Object) (valueloader)));
	//   19   36:aload_0         
	//   20   37:aload_1         
	//   21   38:aload_2         
	//   22   39:invokespecial   #45  <Method void cache(Context, Object)>
		obj = ((Object) (valueloader));
	//   23   42:aload_2         
	//   24   43:astore_3        
_L2:
		this;
	//   25   44:aload_0         
		JVM INSTR monitorexit ;
	//   26   45:monitorexit     
		return obj;
	//   27   46:aload_3         
	//   28   47:areturn         
		valueloader = ((ValueLoader) (valueloader.load(context)));
	//   29   48:aload_2         
	//   30   49:aload_1         
	//   31   50:invokeinterface #50  <Method Object ValueLoader.load(Context)>
	//   32   55:astore_2        
		  goto _L3
	//*  33   56:goto            36
		context;
	//   34   59:astore_1        
	//*  35   60:aload_0         
		throw context;
	//   36   61:monitorexit     
	//   37   62:aload_1         
	//   38   63:athrow          
	}

	protected abstract Object getCached(Context context);

	public final void invalidate(Context context)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		doInvalidate(context);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #55  <Method void doInvalidate(Context)>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		context;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw context;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	private final ValueCache childCache;
}
