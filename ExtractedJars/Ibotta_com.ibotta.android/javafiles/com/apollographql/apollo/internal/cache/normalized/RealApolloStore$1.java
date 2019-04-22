// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.cache.normalized.CacheKey;
import com.apollographql.apollo.cache.normalized.CacheKeyResolver;
import java.util.Map;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			ResponseNormalizer, RealApolloStore

class RealApolloStore$1 extends ResponseNormalizer
{

	public volatile CacheKey resolveCacheKey(ResponseField responsefield, Object obj)
	{
		return resolveCacheKey(responsefield, (Map)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #25  <Class Map>
	//    4    6:invokevirtual   #28  <Method CacheKey resolveCacheKey(ResponseField, Map)>
	//    5    9:areturn         
	}

	public CacheKey resolveCacheKey(ResponseField responsefield, Map map)
	{
		return cacheKeyResolver.fromFieldRecordSet(responsefield, map);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field RealApolloStore this$0>
	//    2    4:getfield        #34  <Field CacheKeyResolver RealApolloStore.cacheKeyResolver>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #39  <Method CacheKey CacheKeyResolver.fromFieldRecordSet(ResponseField, Map)>
	//    6   12:areturn         
	}

	final RealApolloStore this$0;

	RealApolloStore$1()
	{
		this$0 = RealApolloStore.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field RealApolloStore this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void ResponseNormalizer()>
	//    5    9:return          
	}
}
