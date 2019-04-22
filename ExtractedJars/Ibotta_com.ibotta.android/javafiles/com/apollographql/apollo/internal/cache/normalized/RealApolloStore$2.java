// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.cache.normalized.CacheKey;
import com.apollographql.apollo.cache.normalized.Record;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			ResponseNormalizer, RealApolloStore

class RealApolloStore$2 extends ResponseNormalizer
{

	public CacheKey resolveCacheKey(ResponseField responsefield, Record record)
	{
		return CacheKey.from(record.key());
	//    0    0:aload_2         
	//    1    1:invokevirtual   #29  <Method String Record.key()>
	//    2    4:invokestatic    #35  <Method CacheKey CacheKey.from(String)>
	//    3    7:areturn         
	}

	public volatile CacheKey resolveCacheKey(ResponseField responsefield, Object obj)
	{
		return resolveCacheKey(responsefield, (Record)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #25  <Class Record>
	//    4    6:invokevirtual   #40  <Method CacheKey resolveCacheKey(ResponseField, Record)>
	//    5    9:areturn         
	}

	final RealApolloStore this$0;

	RealApolloStore$2()
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
