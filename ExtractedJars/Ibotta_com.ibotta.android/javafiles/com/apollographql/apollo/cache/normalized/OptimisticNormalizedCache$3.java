// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.api.internal.Action;

// Referenced classes of package com.apollographql.apollo.cache.normalized:
//			OptimisticNormalizedCache, NormalizedCache

class OptimisticNormalizedCache$3
	implements Action
{

	public void apply(NormalizedCache normalizedcache)
	{
		normalizedcache.clearAll();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method void NormalizedCache.clearAll()>
	//    2    4:return          
	}

	public volatile void apply(Object obj)
	{
		apply((NormalizedCache)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class NormalizedCache>
	//    3    5:invokevirtual   #31  <Method void apply(NormalizedCache)>
	//    4    8:return          
	}

	final OptimisticNormalizedCache this$0;

	OptimisticNormalizedCache$3()
	{
		this$0 = OptimisticNormalizedCache.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field OptimisticNormalizedCache this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
