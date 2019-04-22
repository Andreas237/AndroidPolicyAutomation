// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.api.internal.Function;

// Referenced classes of package com.apollographql.apollo.cache.normalized:
//			NormalizedCacheFactory, RecordFieldJsonAdapter, NormalizedCache

class NormalizedCacheFactory$1
	implements Function
{

	public NormalizedCache apply(NormalizedCacheFactory normalizedcachefactory)
	{
		return normalizedcachefactory.createChain(val$recordFieldAdapter);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field RecordFieldJsonAdapter val$recordFieldAdapter>
	//    3    5:invokevirtual   #30  <Method NormalizedCache NormalizedCacheFactory.createChain(RecordFieldJsonAdapter)>
	//    4    8:areturn         
	}

	public volatile Object apply(Object obj)
	{
		return ((Object) (apply((NormalizedCacheFactory)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class NormalizedCacheFactory>
	//    3    5:invokevirtual   #35  <Method NormalizedCache apply(NormalizedCacheFactory)>
	//    4    8:areturn         
	}

	final NormalizedCacheFactory this$0;
	final RecordFieldJsonAdapter val$recordFieldAdapter;

	NormalizedCacheFactory$1()
	{
		this$0 = final_normalizedcachefactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field NormalizedCacheFactory this$0>
		val$recordFieldAdapter = RecordFieldJsonAdapter.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field RecordFieldJsonAdapter val$recordFieldAdapter>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
