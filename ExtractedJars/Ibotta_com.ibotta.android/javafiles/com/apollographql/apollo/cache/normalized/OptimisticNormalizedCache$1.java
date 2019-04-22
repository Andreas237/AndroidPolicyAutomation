// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.api.internal.Function;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.cache.CacheHeaders;

// Referenced classes of package com.apollographql.apollo.cache.normalized:
//			OptimisticNormalizedCache, NormalizedCache

class OptimisticNormalizedCache$1
	implements Function
{

	public Optional apply(NormalizedCache normalizedcache)
	{
		return Optional.fromNullable(((Object) (normalizedcache.loadRecord(val$key, val$cacheHeaders))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field String val$key>
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field CacheHeaders val$cacheHeaders>
	//    5    9:invokevirtual   #36  <Method Record NormalizedCache.loadRecord(String, CacheHeaders)>
	//    6   12:invokestatic    #42  <Method Optional Optional.fromNullable(Object)>
	//    7   15:areturn         
	}

	public volatile Object apply(Object obj)
	{
		return ((Object) (apply((NormalizedCache)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class NormalizedCache>
	//    3    5:invokevirtual   #49  <Method Optional apply(NormalizedCache)>
	//    4    8:areturn         
	}

	final OptimisticNormalizedCache this$0;
	final CacheHeaders val$cacheHeaders;
	final String val$key;

	OptimisticNormalizedCache$1()
	{
		this$0 = final_optimisticnormalizedcache;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field OptimisticNormalizedCache this$0>
		val$key = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field String val$key>
		val$cacheHeaders = CacheHeaders.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field CacheHeaders val$cacheHeaders>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #29  <Method void Object()>
	//   11   19:return          
	}
}
