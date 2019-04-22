// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.api.internal.*;

// Referenced classes of package com.apollographql.apollo.cache.normalized:
//			NormalizedCache, RecordFieldJsonAdapter

public abstract class NormalizedCacheFactory
{

	public NormalizedCacheFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		nextFactory = Optional.absent();
	//    2    4:aload_0         
	//    3    5:invokestatic    #20  <Method Optional Optional.absent()>
	//    4    8:putfield        #22  <Field Optional nextFactory>
	//    5   11:return          
	}

	public final NormalizedCacheFactory chain(NormalizedCacheFactory normalizedcachefactory)
	{
		Utils.checkNotNull(((Object) (normalizedcachefactory)), "factory == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #28  <String "factory == null">
	//    2    3:invokestatic    #34  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		NormalizedCacheFactory normalizedcachefactory1;
		for(normalizedcachefactory1 = this; normalizedcachefactory1.nextFactory.isPresent(); normalizedcachefactory1 = (NormalizedCacheFactory)normalizedcachefactory1.nextFactory.get());
	//    4    7:aload_0         
	//    5    8:astore_2        
	//    6    9:aload_2         
	//    7   10:getfield        #22  <Field Optional nextFactory>
	//    8   13:invokevirtual   #38  <Method boolean Optional.isPresent()>
	//    9   16:ifeq            33
	//   10   19:aload_2         
	//   11   20:getfield        #22  <Field Optional nextFactory>
	//   12   23:invokevirtual   #42  <Method Object Optional.get()>
	//   13   26:checkcast       #2   <Class NormalizedCacheFactory>
	//   14   29:astore_2        
	//*  15   30:goto            9
		normalizedcachefactory1.nextFactory = Optional.of(((Object) (normalizedcachefactory)));
	//   16   33:aload_2         
	//   17   34:aload_1         
	//   18   35:invokestatic    #46  <Method Optional Optional.of(Object)>
	//   19   38:putfield        #22  <Field Optional nextFactory>
		return this;
	//   20   41:aload_0         
	//   21   42:areturn         
	}

	public abstract NormalizedCache create(RecordFieldJsonAdapter recordfieldjsonadapter);

	public final NormalizedCache createChain(final RecordFieldJsonAdapter recordFieldAdapter)
	{
		if(nextFactory.isPresent())
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Optional nextFactory>
	//*   2    4:invokevirtual   #38  <Method boolean Optional.isPresent()>
	//*   3    7:ifeq            41
			return create(recordFieldAdapter).chain((NormalizedCache)nextFactory.map(new Function() {

				public NormalizedCache apply(NormalizedCacheFactory normalizedcachefactory)
				{
					return normalizedcachefactory.createChain(recordFieldAdapter);
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

			
			{
				this$0 = NormalizedCacheFactory.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field NormalizedCacheFactory this$0>
				recordFieldAdapter = recordfieldjsonadapter;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field RecordFieldJsonAdapter val$recordFieldAdapter>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
			}
).get());
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokevirtual   #54  <Method NormalizedCache create(RecordFieldJsonAdapter)>
	//    7   15:aload_0         
	//    8   16:getfield        #22  <Field Optional nextFactory>
	//    9   19:new             #7   <Class NormalizedCacheFactory$1>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokespecial   #57  <Method void NormalizedCacheFactory$1(NormalizedCacheFactory, RecordFieldJsonAdapter)>
	//   14   28:invokevirtual   #61  <Method Optional Optional.map(Function)>
	//   15   31:invokevirtual   #42  <Method Object Optional.get()>
	//   16   34:checkcast       #63  <Class NormalizedCache>
	//   17   37:invokevirtual   #66  <Method NormalizedCache NormalizedCache.chain(NormalizedCache)>
	//   18   40:areturn         
		else
			return create(recordFieldAdapter);
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:invokevirtual   #54  <Method NormalizedCache create(RecordFieldJsonAdapter)>
	//   22   46:areturn         
	}

	private Optional nextFactory;
}
