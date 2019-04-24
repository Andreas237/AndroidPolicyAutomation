// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.cache;

import android.content.Context;

// Referenced classes of package io.fabric.sdk.android.services.cache:
//			AbstractValueCache, ValueCache

public class MemoryValueCache extends AbstractValueCache
{

	public MemoryValueCache()
	{
		this(((ValueCache) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #13  <Method void MemoryValueCache(ValueCache)>
	//    3    5:return          
	}

	public MemoryValueCache(ValueCache valuecache)
	{
		super(valuecache);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void AbstractValueCache(ValueCache)>
	//    3    5:return          
	}

	protected void cacheValue(Context context, Object obj)
	{
		value = obj;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #21  <Field Object value>
	//    3    5:return          
	}

	protected void doInvalidate(Context context)
	{
		value = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #21  <Field Object value>
	//    3    5:return          
	}

	protected Object getCached(Context context)
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object value>
	//    2    4:areturn         
	}

	private Object value;
}
