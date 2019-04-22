// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.api.internal.*;
import com.apollographql.apollo.cache.CacheHeaders;
import java.util.*;

// Referenced classes of package com.apollographql.apollo.cache.normalized:
//			Record, CacheKey

public abstract class NormalizedCache
{

	public NormalizedCache()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		nextCache = Optional.absent();
	//    2    4:aload_0         
	//    3    5:invokestatic    #21  <Method Optional Optional.absent()>
	//    4    8:putfield        #23  <Field Optional nextCache>
	//    5   11:return          
	}

	public final NormalizedCache chain(NormalizedCache normalizedcache)
	{
		Utils.checkNotNull(((Object) (normalizedcache)), "cache == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #29  <String "cache == null">
	//    2    3:invokestatic    #35  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		NormalizedCache normalizedcache1;
		for(normalizedcache1 = this; normalizedcache1.nextCache.isPresent(); normalizedcache1 = (NormalizedCache)normalizedcache1.nextCache.get());
	//    4    7:aload_0         
	//    5    8:astore_2        
	//    6    9:aload_2         
	//    7   10:getfield        #23  <Field Optional nextCache>
	//    8   13:invokevirtual   #39  <Method boolean Optional.isPresent()>
	//    9   16:ifeq            33
	//   10   19:aload_2         
	//   11   20:getfield        #23  <Field Optional nextCache>
	//   12   23:invokevirtual   #43  <Method Object Optional.get()>
	//   13   26:checkcast       #2   <Class NormalizedCache>
	//   14   29:astore_2        
	//*  15   30:goto            9
		normalizedcache1.nextCache = Optional.of(((Object) (normalizedcache)));
	//   16   33:aload_2         
	//   17   34:aload_1         
	//   18   35:invokestatic    #47  <Method Optional Optional.of(Object)>
	//   19   38:putfield        #23  <Field Optional nextCache>
		return this;
	//   20   41:aload_0         
	//   21   42:areturn         
	}

	public abstract void clearAll();

	public abstract Record loadRecord(String s, CacheHeaders cacheheaders);

	public Collection loadRecords(Collection collection, CacheHeaders cacheheaders)
	{
		ArrayList arraylist = new ArrayList(collection.size());
	//    0    0:new             #56  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokeinterface #62  <Method int Collection.size()>
	//    4   10:invokespecial   #65  <Method void ArrayList(int)>
	//    5   13:astore_3        
		collection = ((Collection) (collection.iterator()));
	//    6   14:aload_1         
	//    7   15:invokeinterface #69  <Method Iterator Collection.iterator()>
	//    8   20:astore_1        
		do
		{
			if(!((Iterator) (collection)).hasNext())
				break;
	//    9   21:aload_1         
	//   10   22:invokeinterface #74  <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            63
			Record record = loadRecord((String)((Iterator) (collection)).next(), cacheheaders);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:invokeinterface #77  <Method Object Iterator.next()>
	//   15   37:checkcast       #79  <Class String>
	//   16   40:aload_2         
	//   17   41:invokevirtual   #81  <Method Record loadRecord(String, CacheHeaders)>
	//   18   44:astore          4
			if(record != null)
	//*  19   46:aload           4
	//*  20   48:ifnull          21
				((List) (arraylist)).add(((Object) (record)));
	//   21   51:aload_3         
	//   22   52:aload           4
	//   23   54:invokeinterface #87  <Method boolean List.add(Object)>
	//   24   59:pop             
		} while(true);
	//   25   60:goto            21
		return ((Collection) (arraylist));
	//   26   63:aload_3         
	//   27   64:areturn         
	}

	public Set merge(final Record record, final CacheHeaders cacheHeaders)
	{
		Utils.checkNotNull(((Object) (record)), "apolloRecord == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #94  <String "apolloRecord == null">
	//    2    3:invokestatic    #35  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		Utils.checkNotNull(((Object) (cacheHeaders)), "cacheHeaders == null");
	//    4    7:aload_2         
	//    5    8:ldc1            #96  <String "cacheHeaders == null">
	//    6   10:invokestatic    #35  <Method Object Utils.checkNotNull(Object, Object)>
	//    7   13:pop             
		if(cacheHeaders.hasHeader("do-not-store"))
	//*   8   14:aload_2         
	//*   9   15:ldc1            #98  <String "do-not-store">
	//*  10   17:invokevirtual   #104 <Method boolean CacheHeaders.hasHeader(String)>
	//*  11   20:ifeq            27
		{
			return Collections.emptySet();
	//   12   23:invokestatic    #110 <Method Set Collections.emptySet()>
	//   13   26:areturn         
		} else
		{
			Set set = (Set)nextCache().map(new Function() {

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
					return normalizedcache.merge(record, cacheHeaders);
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

			
			{
				this$0 = NormalizedCache.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field NormalizedCache this$0>
				record = record1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Record val$record>
				cacheHeaders = cacheheaders;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field CacheHeaders val$cacheHeaders>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void Object()>
			//   11   19:return          
			}
			}
).or(((Object) (Collections.emptySet())));
	//   14   27:aload_0         
	//   15   28:invokevirtual   #112 <Method Optional nextCache()>
	//   16   31:new             #6   <Class NormalizedCache$1>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:aload_2         
	//   21   38:invokespecial   #115 <Method void NormalizedCache$1(NormalizedCache, Record, CacheHeaders)>
	//   22   41:invokevirtual   #119 <Method Optional Optional.map(Function)>
	//   23   44:invokestatic    #110 <Method Set Collections.emptySet()>
	//   24   47:invokevirtual   #123 <Method Object Optional.or(Object)>
	//   25   50:checkcast       #125 <Class Set>
	//   26   53:astore_3        
			record = ((Record) (performMerge(record, cacheHeaders)));
	//   27   54:aload_0         
	//   28   55:aload_1         
	//   29   56:aload_2         
	//   30   57:invokevirtual   #128 <Method Set performMerge(Record, CacheHeaders)>
	//   31   60:astore_1        
			cacheHeaders = ((CacheHeaders) (new HashSet()));
	//   32   61:new             #130 <Class HashSet>
	//   33   64:dup             
	//   34   65:invokespecial   #131 <Method void HashSet()>
	//   35   68:astore_2        
			((Set) (cacheHeaders)).addAll(((Collection) (set)));
	//   36   69:aload_2         
	//   37   70:aload_3         
	//   38   71:invokeinterface #135 <Method boolean Set.addAll(Collection)>
	//   39   76:pop             
			((Set) (cacheHeaders)).addAll(((Collection) (record)));
	//   40   77:aload_2         
	//   41   78:aload_1         
	//   42   79:invokeinterface #135 <Method boolean Set.addAll(Collection)>
	//   43   84:pop             
			return ((Set) (cacheHeaders));
	//   44   85:aload_2         
	//   45   86:areturn         
		}
	}

	public Set merge(final Collection recordSet, final CacheHeaders cacheHeaders)
	{
		Utils.checkNotNull(((Object) (recordSet)), "recordSet == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #139 <String "recordSet == null">
	//    2    3:invokestatic    #35  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		Utils.checkNotNull(((Object) (cacheHeaders)), "cacheHeaders == null");
	//    4    7:aload_2         
	//    5    8:ldc1            #96  <String "cacheHeaders == null">
	//    6   10:invokestatic    #35  <Method Object Utils.checkNotNull(Object, Object)>
	//    7   13:pop             
		if(cacheHeaders.hasHeader("do-not-store"))
	//*   8   14:aload_2         
	//*   9   15:ldc1            #98  <String "do-not-store">
	//*  10   17:invokevirtual   #104 <Method boolean CacheHeaders.hasHeader(String)>
	//*  11   20:ifeq            27
			return Collections.emptySet();
	//   12   23:invokestatic    #110 <Method Set Collections.emptySet()>
	//   13   26:areturn         
		Set set = (Set)nextCache().map(new Function() {

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
				return normalizedcache.merge(recordSet, cacheHeaders);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #24  <Field Collection val$recordSet>
			//    3    5:aload_0         
			//    4    6:getfield        #26  <Field CacheHeaders val$cacheHeaders>
			//    5    9:invokevirtual   #39  <Method Set NormalizedCache.merge(Collection, CacheHeaders)>
			//    6   12:areturn         
			}

			final NormalizedCache this$0;
			final CacheHeaders val$cacheHeaders;
			final Collection val$recordSet;

			
			{
				this$0 = NormalizedCache.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field NormalizedCache this$0>
				recordSet = collection;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Collection val$recordSet>
				cacheHeaders = cacheheaders;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field CacheHeaders val$cacheHeaders>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void Object()>
			//   11   19:return          
			}
		}
).or(((Object) (Collections.emptySet())));
	//   14   27:aload_0         
	//   15   28:invokevirtual   #112 <Method Optional nextCache()>
	//   16   31:new             #8   <Class NormalizedCache$2>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:aload_2         
	//   21   38:invokespecial   #142 <Method void NormalizedCache$2(NormalizedCache, Collection, CacheHeaders)>
	//   22   41:invokevirtual   #119 <Method Optional Optional.map(Function)>
	//   23   44:invokestatic    #110 <Method Set Collections.emptySet()>
	//   24   47:invokevirtual   #123 <Method Object Optional.or(Object)>
	//   25   50:checkcast       #125 <Class Set>
	//   26   53:astore_3        
		HashSet hashset = new HashSet();
	//   27   54:new             #130 <Class HashSet>
	//   28   57:dup             
	//   29   58:invokespecial   #131 <Method void HashSet()>
	//   30   61:astore          4
		for(recordSet = ((Collection) (recordSet.iterator())); ((Iterator) (recordSet)).hasNext(); ((Set) (hashset)).addAll(((Collection) (performMerge((Record)((Iterator) (recordSet)).next(), cacheHeaders)))));
	//   31   63:aload_1         
	//   32   64:invokeinterface #69  <Method Iterator Collection.iterator()>
	//   33   69:astore_1        
	//   34   70:aload_1         
	//   35   71:invokeinterface #74  <Method boolean Iterator.hasNext()>
	//   36   76:ifeq            104
	//   37   79:aload           4
	//   38   81:aload_0         
	//   39   82:aload_1         
	//   40   83:invokeinterface #77  <Method Object Iterator.next()>
	//   41   88:checkcast       #144 <Class Record>
	//   42   91:aload_2         
	//   43   92:invokevirtual   #128 <Method Set performMerge(Record, CacheHeaders)>
	//   44   95:invokeinterface #135 <Method boolean Set.addAll(Collection)>
	//   45  100:pop             
	//*  46  101:goto            70
		recordSet = ((Collection) (new HashSet()));
	//   47  104:new             #130 <Class HashSet>
	//   48  107:dup             
	//   49  108:invokespecial   #131 <Method void HashSet()>
	//   50  111:astore_1        
		((Set) (recordSet)).addAll(((Collection) (set)));
	//   51  112:aload_1         
	//   52  113:aload_3         
	//   53  114:invokeinterface #135 <Method boolean Set.addAll(Collection)>
	//   54  119:pop             
		((Set) (recordSet)).addAll(((Collection) (hashset)));
	//   55  120:aload_1         
	//   56  121:aload           4
	//   57  123:invokeinterface #135 <Method boolean Set.addAll(Collection)>
	//   58  128:pop             
		return ((Set) (recordSet));
	//   59  129:aload_1         
	//   60  130:areturn         
	}

	public final Optional nextCache()
	{
		return nextCache;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Optional nextCache>
	//    2    4:areturn         
	}

	protected abstract Set performMerge(Record record, CacheHeaders cacheheaders);

	public abstract boolean remove(CacheKey cachekey);

	private Optional nextCache;
}
