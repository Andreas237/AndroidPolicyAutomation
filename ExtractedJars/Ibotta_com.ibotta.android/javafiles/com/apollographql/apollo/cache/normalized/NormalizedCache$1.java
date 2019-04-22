// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.api.internal.Function;
import com.apollographql.apollo.cache.CacheHeaders;
import java.util.Set;

// Referenced classes of package com.apollographql.apollo.cache.normalized:
//			NormalizedCache, Record

class NormalizedCache$1
	implements Function
{

	public volatile Object apply(Object obj)
	{
		return ((Object) (apply((NormalizedCache)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class NormalizedCache>
	//    3    5:invokevirtual   #36  <Method Set apply(NormalizedCache)>
	//    4    8:areturn         
	}

	public Set apply(NormalizedCache normalizedcache)
	{
		return normalizedcache.merge(val$record, val$cacheHeaders);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field Record val$record>
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field CacheHeaders val$cacheHeaders>
	//    5    9:invokevirtual   #39  <Method Set NormalizedCache.merge(Record, CacheHeaders)>
	//    6   12:areturn         
	}

	final NormalizedCache this$0;
	final CacheHeaders val$cacheHeaders;
	final Record val$record;

	NormalizedCache$1()
	{
		this$0 = final_normalizedcache;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field NormalizedCache this$0>
		val$record = record1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field Record val$record>
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
