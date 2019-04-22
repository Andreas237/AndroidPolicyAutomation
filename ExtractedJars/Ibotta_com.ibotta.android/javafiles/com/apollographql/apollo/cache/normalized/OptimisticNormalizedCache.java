// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.api.internal.*;
import com.apollographql.apollo.cache.CacheHeaders;
import com.nytimes.android.external.cache.Cache;
import com.nytimes.android.external.cache.CacheBuilder;
import java.util.*;

// Referenced classes of package com.apollographql.apollo.cache.normalized:
//			NormalizedCache, Record, CacheKey

public final class OptimisticNormalizedCache extends NormalizedCache
{
	private static final class RecordJournal
	{

		Set commit(Record record)
		{
			List list = history;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field List history>
		//    2    4:astore_2        
			list.add(list.size(), ((Object) (record.clone())));
		//    3    5:aload_2         
		//    4    6:aload_2         
		//    5    7:invokeinterface #43  <Method int List.size()>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #28  <Method Record Record.clone()>
		//    8   16:invokeinterface #46  <Method void List.add(int, Object)>
			return snapshot.mergeWith(record);
		//    9   21:aload_0         
		//   10   22:getfield        #30  <Field Record snapshot>
		//   11   25:aload_1         
		//   12   26:invokevirtual   #49  <Method Set Record.mergeWith(Record)>
		//   13   29:areturn         
		}

		Set revert(UUID uuid)
		{
			int i;
label0:
			{
				for(i = 0; i < history.size(); i++)
		//*   0    0:iconst_0        
		//*   1    1:istore_2        
		//*   2    2:iload_2         
		//*   3    3:aload_0         
		//*   4    4:getfield        #22  <Field List history>
		//*   5    7:invokeinterface #43  <Method int List.size()>
		//*   6   12:icmpge          48
					if(uuid.equals(((Object) (((Record)history.get(i)).mutationId()))))
		//*   7   15:aload_1         
		//*   8   16:aload_0         
		//*   9   17:getfield        #22  <Field List history>
		//*  10   20:iload_2         
		//*  11   21:invokeinterface #57  <Method Object List.get(int)>
		//*  12   26:checkcast       #24  <Class Record>
		//*  13   29:invokevirtual   #61  <Method UUID Record.mutationId()>
		//*  14   32:invokevirtual   #66  <Method boolean UUID.equals(Object)>
		//*  15   35:ifeq            41
						break label0;
		//   16   38:goto            50

		//   17   41:iload_2         
		//   18   42:iconst_1        
		//   19   43:iadd            
		//   20   44:istore_2        
		//*  21   45:goto            2
				i = -1;
		//   22   48:iconst_m1       
		//   23   49:istore_2        
			}
			if(i == -1)
		//*  24   50:iload_2         
		//*  25   51:iconst_m1       
		//*  26   52:icmpne          59
				return Collections.emptySet();
		//   27   55:invokestatic    #72  <Method Set Collections.emptySet()>
		//   28   58:areturn         
			uuid = ((UUID) (new HashSet()));
		//   29   59:new             #74  <Class HashSet>
		//   30   62:dup             
		//   31   63:invokespecial   #75  <Method void HashSet()>
		//   32   66:astore_1        
			((Set) (uuid)).add(((Object) (((Record)history.remove(i)).key())));
		//   33   67:aload_1         
		//   34   68:aload_0         
		//   35   69:getfield        #22  <Field List history>
		//   36   72:iload_2         
		//   37   73:invokeinterface #78  <Method Object List.remove(int)>
		//   38   78:checkcast       #24  <Class Record>
		//   39   81:invokevirtual   #82  <Method String Record.key()>
		//   40   84:invokeinterface #85  <Method boolean Set.add(Object)>
		//   41   89:pop             
			int k = i - 1;
		//   42   90:iload_2         
		//   43   91:iconst_1        
		//   44   92:isub            
		//   45   93:istore_3        
			for(int j = Math.max(0, k); j < history.size(); j++)
		//*  46   94:iconst_0        
		//*  47   95:iload_3         
		//*  48   96:invokestatic    #91  <Method int Math.max(int, int)>
		//*  49   99:istore_2        
		//*  50  100:iload_2         
		//*  51  101:aload_0         
		//*  52  102:getfield        #22  <Field List history>
		//*  53  105:invokeinterface #43  <Method int List.size()>
		//*  54  110:icmpge          172
			{
				Record record = (Record)history.get(j);
		//   55  113:aload_0         
		//   56  114:getfield        #22  <Field List history>
		//   57  117:iload_2         
		//   58  118:invokeinterface #57  <Method Object List.get(int)>
		//   59  123:checkcast       #24  <Class Record>
		//   60  126:astore          4
				if(j == Math.max(0, k))
		//*  61  128:iload_2         
		//*  62  129:iconst_0        
		//*  63  130:iload_3         
		//*  64  131:invokestatic    #91  <Method int Math.max(int, int)>
		//*  65  134:icmpne          149
					snapshot = record.clone();
		//   66  137:aload_0         
		//   67  138:aload           4
		//   68  140:invokevirtual   #28  <Method Record Record.clone()>
		//   69  143:putfield        #30  <Field Record snapshot>
				else
		//*  70  146:goto            165
					((Set) (uuid)).addAll(((Collection) (snapshot.mergeWith(record))));
		//   71  149:aload_1         
		//   72  150:aload_0         
		//   73  151:getfield        #30  <Field Record snapshot>
		//   74  154:aload           4
		//   75  156:invokevirtual   #49  <Method Set Record.mergeWith(Record)>
		//   76  159:invokeinterface #95  <Method boolean Set.addAll(Collection)>
		//   77  164:pop             
			}

		//   78  165:iload_2         
		//   79  166:iconst_1        
		//   80  167:iadd            
		//   81  168:istore_2        
		//*  82  169:goto            100
			return ((Set) (uuid));
		//   83  172:aload_1         
		//   84  173:areturn         
		}

		final List history = new ArrayList();
		Record snapshot;

		RecordJournal(Record record)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #19  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #20  <Method void ArrayList()>
		//    6   12:putfield        #22  <Field List history>
			snapshot = record.clone();
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #28  <Method Record Record.clone()>
		//   10   20:putfield        #30  <Field Record snapshot>
			history.add(((Object) (record.clone())));
		//   11   23:aload_0         
		//   12   24:getfield        #22  <Field List history>
		//   13   27:aload_1         
		//   14   28:invokevirtual   #28  <Method Record Record.clone()>
		//   15   31:invokeinterface #36  <Method boolean List.add(Object)>
		//   16   36:pop             
		//   17   37:return          
		}
	}


	public OptimisticNormalizedCache()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void NormalizedCache()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #28  <Method CacheBuilder CacheBuilder.newBuilder()>
	//    4    8:invokevirtual   #32  <Method Cache CacheBuilder.build()>
	//    5   11:putfield        #34  <Field Cache lruCache>
	//    6   14:return          
	}

	public void clearAll()
	{
		lruCache.invalidateAll();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Cache lruCache>
	//    2    4:invokeinterface #41  <Method void Cache.invalidateAll()>
		nextCache().apply(new Action() {

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
);
	//    3    9:aload_0         
	//    4   10:invokevirtual   #45  <Method Optional nextCache()>
	//    5   13:new             #10  <Class OptimisticNormalizedCache$3>
	//    6   16:dup             
	//    7   17:aload_0         
	//    8   18:invokespecial   #48  <Method void OptimisticNormalizedCache$3(OptimisticNormalizedCache)>
	//    9   21:invokevirtual   #54  <Method Optional Optional.apply(Action)>
	//   10   24:pop             
	//   11   25:return          
	}

	public Record loadRecord(final String key, final CacheHeaders cacheHeaders)
	{
		Utils.checkNotNull(((Object) (key)), "key == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #62  <String "key == null">
	//    2    3:invokestatic    #68  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		Utils.checkNotNull(((Object) (cacheHeaders)), "cacheHeaders == null");
	//    4    7:aload_2         
	//    5    8:ldc1            #70  <String "cacheHeaders == null">
	//    6   10:invokestatic    #68  <Method Object Utils.checkNotNull(Object, Object)>
	//    7   13:pop             
		try
		{
			cacheHeaders = ((CacheHeaders) (nextCache().flatMap(new Function() {

				public Optional apply(NormalizedCache normalizedcache)
				{
					return Optional.fromNullable(((Object) (normalizedcache.loadRecord(key, cacheHeaders))));
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

			
			{
				this$0 = OptimisticNormalizedCache.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field OptimisticNormalizedCache this$0>
				key = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field String val$key>
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
)));
	//    8   14:aload_0         
	//    9   15:invokevirtual   #45  <Method Optional nextCache()>
	//   10   18:new             #6   <Class OptimisticNormalizedCache$1>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:aload_2         
	//   15   25:invokespecial   #73  <Method void OptimisticNormalizedCache$1(OptimisticNormalizedCache, String, CacheHeaders)>
	//   16   28:invokevirtual   #77  <Method Optional Optional.flatMap(Function)>
	//   17   31:astore_2        
			key = ((String) ((RecordJournal)lruCache.getIfPresent(((Object) (key)))));
	//   18   32:aload_0         
	//   19   33:getfield        #34  <Field Cache lruCache>
	//   20   36:aload_1         
	//   21   37:invokeinterface #81  <Method Object Cache.getIfPresent(Object)>
	//   22   42:checkcast       #14  <Class OptimisticNormalizedCache$RecordJournal>
	//   23   45:astore_1        
		}
	//*  24   46:aload_1         
	//*  25   47:ifnull          77
	//*  26   50:aload_2         
	//*  27   51:new             #8   <Class OptimisticNormalizedCache$2>
	//*  28   54:dup             
	//*  29   55:aload_0         
	//*  30   56:aload_1         
	//*  31   57:invokespecial   #84  <Method void OptimisticNormalizedCache$2(OptimisticNormalizedCache, OptimisticNormalizedCache$RecordJournal)>
	//*  32   60:invokevirtual   #87  <Method Optional Optional.map(Function)>
	//*  33   63:aload_1         
	//*  34   64:getfield        #91  <Field Record OptimisticNormalizedCache$RecordJournal.snapshot>
	//*  35   67:invokevirtual   #97  <Method Record Record.clone()>
	//*  36   70:invokevirtual   #100 <Method Object Optional.or(Object)>
	//*  37   73:checkcast       #93  <Class Record>
	//*  38   76:areturn         
	//*  39   77:aload_2         
	//*  40   78:invokevirtual   #104 <Method Object Optional.orNull()>
	//*  41   81:checkcast       #93  <Class Record>
	//*  42   84:astore_1        
	//*  43   85:aload_1         
	//*  44   86:areturn         
	//*  45   87:aconst_null     
	//*  46   88:areturn         
		// Misplaced declaration of an exception variable
		catch(final String key)
		{
			return null;
		}
		if(key == null)
			break MISSING_BLOCK_LABEL_77;
		return (Record)((Optional) (cacheHeaders)).map(new Function() {

			public Record apply(Record record)
			{
				record = record.clone();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #35  <Method Record Record.clone()>
			//    2    4:astore_1        
				record.mergeWith(journal.snapshot);
			//    3    5:aload_1         
			//    4    6:aload_0         
			//    5    7:getfield        #22  <Field OptimisticNormalizedCache$RecordJournal val$journal>
			//    6   10:getfield        #41  <Field Record OptimisticNormalizedCache$RecordJournal.snapshot>
			//    7   13:invokevirtual   #45  <Method Set Record.mergeWith(Record)>
			//    8   16:pop             
				return record;
			//    9   17:aload_1         
			//   10   18:areturn         
			}

			public volatile Object apply(Object obj)
			{
				return ((Object) (apply((Record)obj)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #31  <Class Record>
			//    3    5:invokevirtual   #50  <Method Record apply(Record)>
			//    4    8:areturn         
			}

			final OptimisticNormalizedCache this$0;
			final RecordJournal val$journal;

			
			{
				this$0 = OptimisticNormalizedCache.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field OptimisticNormalizedCache this$0>
				journal = recordjournal;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field OptimisticNormalizedCache$RecordJournal val$journal>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
).or(((Object) (((RecordJournal) (key)).snapshot.clone())));
		key = ((String) ((Record)((Optional) (cacheHeaders)).orNull()));
		return ((Record) (key));
	//*  47   89:astore_1        
	//*  48   90:goto            87
	}

	public Set mergeOptimisticUpdate(Record record)
	{
		Utils.checkNotNull(((Object) (record)), "record == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #110 <String "record == null">
	//    2    3:invokestatic    #68  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		RecordJournal recordjournal = (RecordJournal)lruCache.getIfPresent(((Object) (record.key())));
	//    4    7:aload_0         
	//    5    8:getfield        #34  <Field Cache lruCache>
	//    6   11:aload_1         
	//    7   12:invokevirtual   #114 <Method String Record.key()>
	//    8   15:invokeinterface #81  <Method Object Cache.getIfPresent(Object)>
	//    9   20:checkcast       #14  <Class OptimisticNormalizedCache$RecordJournal>
	//   10   23:astore_2        
		if(recordjournal == null)
	//*  11   24:aload_2         
	//*  12   25:ifnonnull       57
		{
			lruCache.put(((Object) (record.key())), ((Object) (new RecordJournal(record))));
	//   13   28:aload_0         
	//   14   29:getfield        #34  <Field Cache lruCache>
	//   15   32:aload_1         
	//   16   33:invokevirtual   #114 <Method String Record.key()>
	//   17   36:new             #14  <Class OptimisticNormalizedCache$RecordJournal>
	//   18   39:dup             
	//   19   40:aload_1         
	//   20   41:invokespecial   #117 <Method void OptimisticNormalizedCache$RecordJournal(Record)>
	//   21   44:invokeinterface #121 <Method void Cache.put(Object, Object)>
			return Collections.singleton(((Object) (record.key())));
	//   22   49:aload_1         
	//   23   50:invokevirtual   #114 <Method String Record.key()>
	//   24   53:invokestatic    #127 <Method Set Collections.singleton(Object)>
	//   25   56:areturn         
		} else
		{
			return recordjournal.commit(record);
	//   26   57:aload_2         
	//   27   58:aload_1         
	//   28   59:invokevirtual   #130 <Method Set OptimisticNormalizedCache$RecordJournal.commit(Record)>
	//   29   62:areturn         
		}
	}

	public Set mergeOptimisticUpdates(Collection collection)
	{
		LinkedHashSet linkedhashset = new LinkedHashSet();
	//    0    0:new             #136 <Class LinkedHashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #137 <Method void LinkedHashSet()>
	//    3    7:astore_2        
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); ((Set) (linkedhashset)).addAll(((Collection) (mergeOptimisticUpdate((Record)((Iterator) (collection)).next())))));
	//    4    8:aload_1         
	//    5    9:invokeinterface #143 <Method Iterator Collection.iterator()>
	//    6   14:astore_1        
	//    7   15:aload_1         
	//    8   16:invokeinterface #149 <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            47
	//   10   24:aload_2         
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:invokeinterface #152 <Method Object Iterator.next()>
	//   14   32:checkcast       #93  <Class Record>
	//   15   35:invokevirtual   #154 <Method Set mergeOptimisticUpdate(Record)>
	//   16   38:invokeinterface #160 <Method boolean Set.addAll(Collection)>
	//   17   43:pop             
	//*  18   44:goto            15
		return ((Set) (linkedhashset));
	//   19   47:aload_2         
	//   20   48:areturn         
	}

	protected Set performMerge(Record record, CacheHeaders cacheheaders)
	{
		return Collections.emptySet();
	//    0    0:invokestatic    #167 <Method Set Collections.emptySet()>
	//    1    3:areturn         
	}

	public boolean remove(final CacheKey cacheKey)
	{
		Utils.checkNotNull(((Object) (cacheKey)), "cacheKey == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #172 <String "cacheKey == null">
	//    2    3:invokestatic    #68  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		boolean flag = ((Boolean)nextCache().map(new Function() {

			public Boolean apply(NormalizedCache normalizedcache)
			{
				return Boolean.valueOf(normalizedcache.remove(cacheKey));
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

			
			{
				this$0 = OptimisticNormalizedCache.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field OptimisticNormalizedCache this$0>
				cacheKey = cachekey;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field CacheKey val$cacheKey>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
).or(((Object) (Boolean.FALSE)))).booleanValue();
	//    4    7:aload_0         
	//    5    8:invokevirtual   #45  <Method Optional nextCache()>
	//    6   11:new             #12  <Class OptimisticNormalizedCache$4>
	//    7   14:dup             
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokespecial   #175 <Method void OptimisticNormalizedCache$4(OptimisticNormalizedCache, CacheKey)>
	//   11   20:invokevirtual   #87  <Method Optional Optional.map(Function)>
	//   12   23:getstatic       #181 <Field Boolean Boolean.FALSE>
	//   13   26:invokevirtual   #100 <Method Object Optional.or(Object)>
	//   14   29:checkcast       #177 <Class Boolean>
	//   15   32:invokevirtual   #184 <Method boolean Boolean.booleanValue()>
	//   16   35:istore_2        
		if(lruCache.getIfPresent(((Object) (cacheKey.key()))) != null)
	//*  17   36:aload_0         
	//*  18   37:getfield        #34  <Field Cache lruCache>
	//*  19   40:aload_1         
	//*  20   41:invokevirtual   #187 <Method String CacheKey.key()>
	//*  21   44:invokeinterface #81  <Method Object Cache.getIfPresent(Object)>
	//*  22   49:ifnull          67
		{
			lruCache.invalidate(((Object) (cacheKey.key())));
	//   23   52:aload_0         
	//   24   53:getfield        #34  <Field Cache lruCache>
	//   25   56:aload_1         
	//   26   57:invokevirtual   #187 <Method String CacheKey.key()>
	//   27   60:invokeinterface #191 <Method void Cache.invalidate(Object)>
			flag = true;
	//   28   65:iconst_1        
	//   29   66:istore_2        
		}
		return flag;
	//   30   67:iload_2         
	//   31   68:ireturn         
	}

	public Set removeOptimisticUpdates(UUID uuid)
	{
		Utils.checkNotNull(((Object) (uuid)), "mutationId == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #195 <String "mutationId == null">
	//    2    3:invokestatic    #68  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		HashSet hashset = new HashSet();
	//    4    7:new             #197 <Class HashSet>
	//    5   10:dup             
	//    6   11:invokespecial   #198 <Method void HashSet()>
	//    7   14:astore_2        
		HashSet hashset1 = new HashSet();
	//    8   15:new             #197 <Class HashSet>
	//    9   18:dup             
	//   10   19:invokespecial   #198 <Method void HashSet()>
	//   11   22:astore_3        
		Iterator iterator = ((Map) (lruCache.asMap())).entrySet().iterator();
	//   12   23:aload_0         
	//   13   24:getfield        #34  <Field Cache lruCache>
	//   14   27:invokeinterface #202 <Method java.util.concurrent.ConcurrentMap Cache.asMap()>
	//   15   32:invokeinterface #207 <Method Set Map.entrySet()>
	//   16   37:invokeinterface #208 <Method Iterator Set.iterator()>
	//   17   42:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   18   44:aload           4
	//   19   46:invokeinterface #149 <Method boolean Iterator.hasNext()>
	//   20   51:ifeq            128
			Object obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   21   54:aload           4
	//   22   56:invokeinterface #152 <Method Object Iterator.next()>
	//   23   61:checkcast       #210 <Class java.util.Map$Entry>
	//   24   64:astore          6
			String s = (String)((java.util.Map.Entry) (obj)).getKey();
	//   25   66:aload           6
	//   26   68:invokeinterface #213 <Method Object java.util.Map$Entry.getKey()>
	//   27   73:checkcast       #215 <Class String>
	//   28   76:astore          5
			obj = ((Object) ((RecordJournal)((java.util.Map.Entry) (obj)).getValue()));
	//   29   78:aload           6
	//   30   80:invokeinterface #218 <Method Object java.util.Map$Entry.getValue()>
	//   31   85:checkcast       #14  <Class OptimisticNormalizedCache$RecordJournal>
	//   32   88:astore          6
			((Set) (hashset)).addAll(((Collection) (((RecordJournal) (obj)).revert(uuid))));
	//   33   90:aload_2         
	//   34   91:aload           6
	//   35   93:aload_1         
	//   36   94:invokevirtual   #221 <Method Set OptimisticNormalizedCache$RecordJournal.revert(UUID)>
	//   37   97:invokeinterface #160 <Method boolean Set.addAll(Collection)>
	//   38  102:pop             
			if(((RecordJournal) (obj)).history.isEmpty())
	//*  39  103:aload           6
	//*  40  105:getfield        #225 <Field List OptimisticNormalizedCache$RecordJournal.history>
	//*  41  108:invokeinterface #230 <Method boolean List.isEmpty()>
	//*  42  113:ifeq            44
				((Set) (hashset1)).add(((Object) (s)));
	//   43  116:aload_3         
	//   44  117:aload           5
	//   45  119:invokeinterface #234 <Method boolean Set.add(Object)>
	//   46  124:pop             
		} while(true);
	//   47  125:goto            44
		lruCache.invalidateAll(((Iterable) (hashset1)));
	//   48  128:aload_0         
	//   49  129:getfield        #34  <Field Cache lruCache>
	//   50  132:aload_3         
	//   51  133:invokeinterface #237 <Method void Cache.invalidateAll(Iterable)>
		return ((Set) (hashset));
	//   52  138:aload_2         
	//   53  139:areturn         
	}

	private final Cache lruCache = CacheBuilder.newBuilder().build();
}
