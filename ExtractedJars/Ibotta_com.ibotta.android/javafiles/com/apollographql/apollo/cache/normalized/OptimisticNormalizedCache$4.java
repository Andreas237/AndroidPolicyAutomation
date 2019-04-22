// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.api.internal.Function;

// Referenced classes of package com.apollographql.apollo.cache.normalized:
//			OptimisticNormalizedCache, NormalizedCache, CacheKey

class OptimisticNormalizedCache$4
	implements Function
{

	public Boolean apply(NormalizedCache normalizedcache)
	{
		return Boolean.valueOf(normalizedcache.remove(val$cacheKey));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field CacheKey val$cacheKey>
	//    3    5:invokevirtual   #32  <Method boolean NormalizedCache.remove(CacheKey)>
	//    4    8:invokestatic    #38  <Method Boolean Boolean.valueOf(boolean)>
	//    5   11:areturn         
	}

	public volatile Object apply(Object obj)
	{
		return ((Object) (apply((NormalizedCache)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #31  <Class NormalizedCache>
	//    3    5:invokevirtual   #43  <Method Boolean apply(NormalizedCache)>
	//    4    8:areturn         
	}

	final OptimisticNormalizedCache this$0;
	final CacheKey val$cacheKey;

	OptimisticNormalizedCache$4()
	{
		this$0 = final_optimisticnormalizedcache;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field OptimisticNormalizedCache this$0>
		val$cacheKey = CacheKey.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field CacheKey val$cacheKey>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
