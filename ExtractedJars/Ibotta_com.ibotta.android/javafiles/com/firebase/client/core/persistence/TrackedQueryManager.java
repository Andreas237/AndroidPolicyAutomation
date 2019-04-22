// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.persistence;

import com.firebase.client.collection.ImmutableSortedMap;
import com.firebase.client.core.Path;
import com.firebase.client.core.utilities.ImmutableTree;
import com.firebase.client.core.utilities.Predicate;
import com.firebase.client.core.view.QueryParams;
import com.firebase.client.core.view.QuerySpec;
import com.firebase.client.snapshot.ChildKey;
import com.firebase.client.utilities.*;
import java.util.*;

// Referenced classes of package com.firebase.client.core.persistence:
//			PersistenceStorageEngine, TrackedQuery, CachePolicy, PruneForest

public class TrackedQueryManager
{

	public TrackedQueryManager(PersistenceStorageEngine persistencestorageengine, LogWrapper logwrapper, Clock clock1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void Object()>
		currentQueryId = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #62  <Field long currentQueryId>
		storageLayer = persistencestorageengine;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #64  <Field PersistenceStorageEngine storageLayer>
		logger = logwrapper;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #66  <Field LogWrapper logger>
		clock = clock1;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #68  <Field Clock clock>
		trackedQueryTree = new ImmutableTree(((Object) (null)));
	//   14   24:aload_0         
	//   15   25:new             #70  <Class ImmutableTree>
	//   16   28:dup             
	//   17   29:aconst_null     
	//   18   30:invokespecial   #73  <Method void ImmutableTree(Object)>
	//   19   33:putfield        #75  <Field ImmutableTree trackedQueryTree>
		resetPreviouslyActiveTrackedQueries();
	//   20   36:aload_0         
	//   21   37:invokespecial   #78  <Method void resetPreviouslyActiveTrackedQueries()>
		for(persistencestorageengine = ((PersistenceStorageEngine) (storageLayer.loadTrackedQueries().iterator())); ((Iterator) (persistencestorageengine)).hasNext(); cacheTrackedQuery(((TrackedQuery) (logwrapper))))
	//*  22   40:aload_0         
	//*  23   41:getfield        #64  <Field PersistenceStorageEngine storageLayer>
	//*  24   44:invokeinterface #84  <Method List PersistenceStorageEngine.loadTrackedQueries()>
	//*  25   49:invokeinterface #90  <Method Iterator List.iterator()>
	//*  26   54:astore_1        
	//*  27   55:aload_1         
	//*  28   56:invokeinterface #96  <Method boolean Iterator.hasNext()>
	//*  29   61:ifeq            99
		{
			logwrapper = ((LogWrapper) ((TrackedQuery)((Iterator) (persistencestorageengine)).next()));
	//   30   64:aload_1         
	//   31   65:invokeinterface #100 <Method Object Iterator.next()>
	//   32   70:checkcast       #102 <Class TrackedQuery>
	//   33   73:astore_2        
			currentQueryId = Math.max(((TrackedQuery) (logwrapper)).id + 1L, currentQueryId);
	//   34   74:aload_0         
	//   35   75:aload_2         
	//   36   76:getfield        #105 <Field long TrackedQuery.id>
	//   37   79:lconst_1        
	//   38   80:ladd            
	//   39   81:aload_0         
	//   40   82:getfield        #62  <Field long currentQueryId>
	//   41   85:invokestatic    #111 <Method long Math.max(long, long)>
	//   42   88:putfield        #62  <Field long currentQueryId>
		}

	//   43   91:aload_0         
	//   44   92:aload_2         
	//   45   93:invokespecial   #115 <Method void cacheTrackedQuery(TrackedQuery)>
	//*  46   96:goto            55
	//   47   99:return          
	}

	private static void assertValidTrackedQuery(QuerySpec queryspec)
	{
		boolean flag;
		if(queryspec.loadsAllData() && !queryspec.isDefault())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #129 <Method boolean QuerySpec.loadsAllData()>
	//*   2    4:ifeq            22
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #132 <Method boolean QuerySpec.isDefault()>
	//*   5   11:ifeq            17
	//*   6   14:goto            22
			flag = false;
	//    7   17:iconst_0        
	//    8   18:istore_1        
		else
	//*   9   19:goto            24
			flag = true;
	//   10   22:iconst_1        
	//   11   23:istore_1        
		Utilities.hardAssert(flag, "Can't have tracked non-default query that loads all data");
	//   12   24:iload_1         
	//   13   25:ldc1            #134 <String "Can't have tracked non-default query that loads all data">
	//   14   27:invokestatic    #140 <Method void Utilities.hardAssert(boolean, String)>
	//   15   30:return          
	}

	private void cacheTrackedQuery(TrackedQuery trackedquery)
	{
		assertValidTrackedQuery(trackedquery.querySpec);
	//    0    0:aload_1         
	//    1    1:getfield        #144 <Field QuerySpec TrackedQuery.querySpec>
	//    2    4:invokestatic    #146 <Method void assertValidTrackedQuery(QuerySpec)>
		Object obj1 = ((Object) ((Map)trackedQueryTree.get(trackedquery.querySpec.getPath())));
	//    3    7:aload_0         
	//    4    8:getfield        #75  <Field ImmutableTree trackedQueryTree>
	//    5   11:aload_1         
	//    6   12:getfield        #144 <Field QuerySpec TrackedQuery.querySpec>
	//    7   15:invokevirtual   #150 <Method Path QuerySpec.getPath()>
	//    8   18:invokevirtual   #154 <Method Object ImmutableTree.get(Path)>
	//    9   21:checkcast       #156 <Class Map>
	//   10   24:astore          4
		Object obj = obj1;
	//   11   26:aload           4
	//   12   28:astore_3        
		if(obj1 == null)
	//*  13   29:aload           4
	//*  14   31:ifnonnull       61
		{
			obj = ((Object) (new HashMap()));
	//   15   34:new             #158 <Class HashMap>
	//   16   37:dup             
	//   17   38:invokespecial   #159 <Method void HashMap()>
	//   18   41:astore_3        
			trackedQueryTree = trackedQueryTree.set(trackedquery.querySpec.getPath(), obj);
	//   19   42:aload_0         
	//   20   43:aload_0         
	//   21   44:getfield        #75  <Field ImmutableTree trackedQueryTree>
	//   22   47:aload_1         
	//   23   48:getfield        #144 <Field QuerySpec TrackedQuery.querySpec>
	//   24   51:invokevirtual   #150 <Method Path QuerySpec.getPath()>
	//   25   54:aload_3         
	//   26   55:invokevirtual   #163 <Method ImmutableTree ImmutableTree.set(Path, Object)>
	//   27   58:putfield        #75  <Field ImmutableTree trackedQueryTree>
		}
		obj1 = ((Object) ((TrackedQuery)((Map) (obj)).get(((Object) (trackedquery.querySpec.getParams())))));
	//   28   61:aload_3         
	//   29   62:aload_1         
	//   30   63:getfield        #144 <Field QuerySpec TrackedQuery.querySpec>
	//   31   66:invokevirtual   #167 <Method QueryParams QuerySpec.getParams()>
	//   32   69:invokeinterface #170 <Method Object Map.get(Object)>
	//   33   74:checkcast       #102 <Class TrackedQuery>
	//   34   77:astore          4
		boolean flag;
		if(obj1 != null && ((TrackedQuery) (obj1)).id != trackedquery.id)
	//*  35   79:aload           4
	//*  36   81:ifnull          105
	//*  37   84:aload           4
	//*  38   86:getfield        #105 <Field long TrackedQuery.id>
	//*  39   89:aload_1         
	//*  40   90:getfield        #105 <Field long TrackedQuery.id>
	//*  41   93:lcmp            
	//*  42   94:ifne            100
	//*  43   97:goto            105
			flag = false;
	//   44  100:iconst_0        
	//   45  101:istore_2        
		else
	//*  46  102:goto            107
			flag = true;
	//   47  105:iconst_1        
	//   48  106:istore_2        
		Utilities.hardAssert(flag);
	//   49  107:iload_2         
	//   50  108:invokestatic    #173 <Method void Utilities.hardAssert(boolean)>
		((Map) (obj)).put(((Object) (trackedquery.querySpec.getParams())), ((Object) (trackedquery)));
	//   51  111:aload_3         
	//   52  112:aload_1         
	//   53  113:getfield        #144 <Field QuerySpec TrackedQuery.querySpec>
	//   54  116:invokevirtual   #167 <Method QueryParams QuerySpec.getParams()>
	//   55  119:aload_1         
	//   56  120:invokeinterface #177 <Method Object Map.put(Object, Object)>
	//   57  125:pop             
	//   58  126:return          
	}

	private static long calculateCountToPrune(CachePolicy cachepolicy, long l)
	{
		float f = cachepolicy.getPercentOfQueriesToPruneAtOnce();
	//    0    0:aload_0         
	//    1    1:invokeinterface #185 <Method float CachePolicy.getPercentOfQueriesToPruneAtOnce()>
	//    2    6:fstore_3        
		return l - Math.min((long)Math.floor((float)l * (1.0F - f)), cachepolicy.getMaxNumberOfQueriesToKeep());
	//    3    7:lload_1         
	//    4    8:lload_1         
	//    5    9:l2f             
	//    6   10:fconst_1        
	//    7   11:fload_3         
	//    8   12:fsub            
	//    9   13:fmul            
	//   10   14:f2d             
	//   11   15:invokestatic    #189 <Method double Math.floor(double)>
	//   12   18:d2l             
	//   13   19:aload_0         
	//   14   20:invokeinterface #193 <Method long CachePolicy.getMaxNumberOfQueriesToKeep()>
	//   15   25:invokestatic    #196 <Method long Math.min(long, long)>
	//   16   28:lsub            
	//   17   29:lreturn         
	}

	private Set filteredQueryIdsAtPath(Path path)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #200 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #201 <Method void HashSet()>
	//    3    7:astore_2        
		path = ((Path) ((Map)trackedQueryTree.get(path)));
	//    4    8:aload_0         
	//    5    9:getfield        #75  <Field ImmutableTree trackedQueryTree>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #154 <Method Object ImmutableTree.get(Path)>
	//    8   16:checkcast       #156 <Class Map>
	//    9   19:astore_1        
		if(path != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          82
		{
			path = ((Path) (((Map) (path)).values().iterator()));
	//   12   24:aload_1         
	//   13   25:invokeinterface #205 <Method Collection Map.values()>
	//   14   30:invokeinterface #208 <Method Iterator Collection.iterator()>
	//   15   35:astore_1        
			do
			{
				if(!((Iterator) (path)).hasNext())
					break;
	//   16   36:aload_1         
	//   17   37:invokeinterface #96  <Method boolean Iterator.hasNext()>
	//   18   42:ifeq            82
				TrackedQuery trackedquery = (TrackedQuery)((Iterator) (path)).next();
	//   19   45:aload_1         
	//   20   46:invokeinterface #100 <Method Object Iterator.next()>
	//   21   51:checkcast       #102 <Class TrackedQuery>
	//   22   54:astore_3        
				if(!trackedquery.querySpec.loadsAllData())
	//*  23   55:aload_3         
	//*  24   56:getfield        #144 <Field QuerySpec TrackedQuery.querySpec>
	//*  25   59:invokevirtual   #129 <Method boolean QuerySpec.loadsAllData()>
	//*  26   62:ifne            36
					((Set) (hashset)).add(((Object) (Long.valueOf(trackedquery.id))));
	//   27   65:aload_2         
	//   28   66:aload_3         
	//   29   67:getfield        #105 <Field long TrackedQuery.id>
	//   30   70:invokestatic    #214 <Method Long Long.valueOf(long)>
	//   31   73:invokeinterface #220 <Method boolean Set.add(Object)>
	//   32   78:pop             
			} while(true);
	//   33   79:goto            36
		}
		return ((Set) (hashset));
	//   34   82:aload_2         
	//   35   83:areturn         
	}

	private List getQueriesMatching(Predicate predicate)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #226 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #227 <Method void ArrayList()>
	//    3    7:astore_2        
		for(Iterator iterator = trackedQueryTree.iterator(); iterator.hasNext();)
	//*   4    8:aload_0         
	//*   5    9:getfield        #75  <Field ImmutableTree trackedQueryTree>
	//*   6   12:invokevirtual   #228 <Method Iterator ImmutableTree.iterator()>
	//*   7   15:astore_3        
	//*   8   16:aload_3         
	//*   9   17:invokeinterface #96  <Method boolean Iterator.hasNext()>
	//*  10   22:ifeq            99
		{
			Iterator iterator1 = ((Map)((java.util.Map.Entry)iterator.next()).getValue()).values().iterator();
	//   11   25:aload_3         
	//   12   26:invokeinterface #100 <Method Object Iterator.next()>
	//   13   31:checkcast       #230 <Class java.util.Map$Entry>
	//   14   34:invokeinterface #233 <Method Object java.util.Map$Entry.getValue()>
	//   15   39:checkcast       #156 <Class Map>
	//   16   42:invokeinterface #205 <Method Collection Map.values()>
	//   17   47:invokeinterface #208 <Method Iterator Collection.iterator()>
	//   18   52:astore          4
			while(iterator1.hasNext()) 
	//*  19   54:aload           4
	//*  20   56:invokeinterface #96  <Method boolean Iterator.hasNext()>
	//*  21   61:ifeq            16
			{
				TrackedQuery trackedquery = (TrackedQuery)iterator1.next();
	//   22   64:aload           4
	//   23   66:invokeinterface #100 <Method Object Iterator.next()>
	//   24   71:checkcast       #102 <Class TrackedQuery>
	//   25   74:astore          5
				if(predicate.evaluate(((Object) (trackedquery))))
	//*  26   76:aload_1         
	//*  27   77:aload           5
	//*  28   79:invokeinterface #238 <Method boolean Predicate.evaluate(Object)>
	//*  29   84:ifeq            54
					((List) (arraylist)).add(((Object) (trackedquery)));
	//   30   87:aload_2         
	//   31   88:aload           5
	//   32   90:invokeinterface #239 <Method boolean List.add(Object)>
	//   33   95:pop             
			}
		}

	//*  34   96:goto            54
		return ((List) (arraylist));
	//   35   99:aload_2         
	//   36  100:areturn         
	}

	private boolean includedInDefaultCompleteQuery(Path path)
	{
		return trackedQueryTree.findRootMostMatchingPath(path, HAS_DEFAULT_COMPLETE_PREDICATE) != null;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field ImmutableTree trackedQueryTree>
	//    2    4:aload_1         
	//    3    5:getstatic       #48  <Field Predicate HAS_DEFAULT_COMPLETE_PREDICATE>
	//    4    8:invokevirtual   #246 <Method Path ImmutableTree.findRootMostMatchingPath(Path, Predicate)>
	//    5   11:ifnull          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private static QuerySpec normalizeQuery(QuerySpec queryspec)
	{
		QuerySpec queryspec1 = queryspec;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(queryspec.loadsAllData())
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #129 <Method boolean QuerySpec.loadsAllData()>
	//*   4    6:ifeq            17
			queryspec1 = QuerySpec.defaultQueryAtPath(queryspec.getPath());
	//    5    9:aload_0         
	//    6   10:invokevirtual   #150 <Method Path QuerySpec.getPath()>
	//    7   13:invokestatic    #252 <Method QuerySpec QuerySpec.defaultQueryAtPath(Path)>
	//    8   16:astore_1        
		return queryspec1;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	private void resetPreviouslyActiveTrackedQueries()
	{
		storageLayer.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field PersistenceStorageEngine storageLayer>
	//    2    4:invokeinterface #255 <Method void PersistenceStorageEngine.beginTransaction()>
		storageLayer.resetPreviouslyActiveTrackedQueries(clock.millis());
	//    3    9:aload_0         
	//    4   10:getfield        #64  <Field PersistenceStorageEngine storageLayer>
	//    5   13:aload_0         
	//    6   14:getfield        #68  <Field Clock clock>
	//    7   17:invokeinterface #260 <Method long Clock.millis()>
	//    8   22:invokeinterface #263 <Method void PersistenceStorageEngine.resetPreviouslyActiveTrackedQueries(long)>
		storageLayer.setTransactionSuccessful();
	//    9   27:aload_0         
	//   10   28:getfield        #64  <Field PersistenceStorageEngine storageLayer>
	//   11   31:invokeinterface #266 <Method void PersistenceStorageEngine.setTransactionSuccessful()>
		storageLayer.endTransaction();
	//   12   36:aload_0         
	//   13   37:getfield        #64  <Field PersistenceStorageEngine storageLayer>
	//   14   40:invokeinterface #269 <Method void PersistenceStorageEngine.endTransaction()>
		return;
	//   15   45:return          
		Exception exception;
		exception;
	//   16   46:astore_1        
		storageLayer.endTransaction();
	//   17   47:aload_0         
	//   18   48:getfield        #64  <Field PersistenceStorageEngine storageLayer>
	//   19   51:invokeinterface #269 <Method void PersistenceStorageEngine.endTransaction()>
		throw exception;
	//   20   56:aload_1         
	//   21   57:athrow          
	}

	private void saveTrackedQuery(TrackedQuery trackedquery)
	{
		cacheTrackedQuery(trackedquery);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #115 <Method void cacheTrackedQuery(TrackedQuery)>
		storageLayer.saveTrackedQuery(trackedquery);
	//    3    5:aload_0         
	//    4    6:getfield        #64  <Field PersistenceStorageEngine storageLayer>
	//    5    9:aload_1         
	//    6   10:invokeinterface #270 <Method void PersistenceStorageEngine.saveTrackedQuery(TrackedQuery)>
	//    7   15:return          
	}

	private void setQueryActiveFlag(QuerySpec queryspec, boolean flag)
	{
		queryspec = normalizeQuery(queryspec);
	//    0    0:aload_1         
	//    1    1:invokestatic    #274 <Method QuerySpec normalizeQuery(QuerySpec)>
	//    2    4:astore_1        
		TrackedQuery trackedquery = findTrackedQuery(queryspec);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #278 <Method TrackedQuery findTrackedQuery(QuerySpec)>
	//    6   10:astore          7
		long l = clock.millis();
	//    7   12:aload_0         
	//    8   13:getfield        #68  <Field Clock clock>
	//    9   16:invokeinterface #260 <Method long Clock.millis()>
	//   10   21:lstore_3        
		if(trackedquery != null)
	//*  11   22:aload           7
	//*  12   24:ifnull          41
		{
			queryspec = ((QuerySpec) (trackedquery.updateLastUse(l).setActiveState(flag)));
	//   13   27:aload           7
	//   14   29:lload_3         
	//   15   30:invokevirtual   #282 <Method TrackedQuery TrackedQuery.updateLastUse(long)>
	//   16   33:iload_2         
	//   17   34:invokevirtual   #286 <Method TrackedQuery TrackedQuery.setActiveState(boolean)>
	//   18   37:astore_1        
		} else
	//*  19   38:goto            69
		{
			long l1 = currentQueryId;
	//   20   41:aload_0         
	//   21   42:getfield        #62  <Field long currentQueryId>
	//   22   45:lstore          5
			currentQueryId = 1L + l1;
	//   23   47:aload_0         
	//   24   48:lconst_1        
	//   25   49:lload           5
	//   26   51:ladd            
	//   27   52:putfield        #62  <Field long currentQueryId>
			queryspec = ((QuerySpec) (new TrackedQuery(l1, queryspec, l, false, flag)));
	//   28   55:new             #102 <Class TrackedQuery>
	//   29   58:dup             
	//   30   59:lload           5
	//   31   61:aload_1         
	//   32   62:lload_3         
	//   33   63:iconst_0        
	//   34   64:iload_2         
	//   35   65:invokespecial   #289 <Method void TrackedQuery(long, QuerySpec, long, boolean, boolean)>
	//   36   68:astore_1        
		}
		saveTrackedQuery(((TrackedQuery) (queryspec)));
	//   37   69:aload_0         
	//   38   70:aload_1         
	//   39   71:invokespecial   #122 <Method void saveTrackedQuery(TrackedQuery)>
	//   40   74:return          
	}

	public long countOfPrunableQueries()
	{
		return (long)getQueriesMatching(IS_QUERY_PRUNABLE_PREDICATE).size();
	//    0    0:aload_0         
	//    1    1:getstatic       #54  <Field Predicate IS_QUERY_PRUNABLE_PREDICATE>
	//    2    4:invokespecial   #292 <Method List getQueriesMatching(Predicate)>
	//    3    7:invokeinterface #296 <Method int List.size()>
	//    4   12:i2l             
	//    5   13:lreturn         
	}

	public void ensureCompleteTrackedQuery(Path path)
	{
		if(!includedInDefaultCompleteQuery(path))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #300 <Method boolean includedInDefaultCompleteQuery(Path)>
	//*   3    5:ifne            72
		{
			path = ((Path) (QuerySpec.defaultQueryAtPath(path)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #252 <Method QuerySpec QuerySpec.defaultQueryAtPath(Path)>
	//    6   12:astore_1        
			TrackedQuery trackedquery = findTrackedQuery(((QuerySpec) (path)));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #278 <Method TrackedQuery findTrackedQuery(QuerySpec)>
	//   10   18:astore          4
			if(trackedquery == null)
	//*  11   20:aload           4
	//*  12   22:ifnonnull       61
			{
				long l = currentQueryId;
	//   13   25:aload_0         
	//   14   26:getfield        #62  <Field long currentQueryId>
	//   15   29:lstore_2        
				currentQueryId = 1L + l;
	//   16   30:aload_0         
	//   17   31:lconst_1        
	//   18   32:lload_2         
	//   19   33:ladd            
	//   20   34:putfield        #62  <Field long currentQueryId>
				path = ((Path) (new TrackedQuery(l, ((QuerySpec) (path)), clock.millis(), true, false)));
	//   21   37:new             #102 <Class TrackedQuery>
	//   22   40:dup             
	//   23   41:lload_2         
	//   24   42:aload_1         
	//   25   43:aload_0         
	//   26   44:getfield        #68  <Field Clock clock>
	//   27   47:invokeinterface #260 <Method long Clock.millis()>
	//   28   52:iconst_1        
	//   29   53:iconst_0        
	//   30   54:invokespecial   #289 <Method void TrackedQuery(long, QuerySpec, long, boolean, boolean)>
	//   31   57:astore_1        
			} else
	//*  32   58:goto            67
			{
				path = ((Path) (trackedquery.setComplete()));
	//   33   61:aload           4
	//   34   63:invokevirtual   #304 <Method TrackedQuery TrackedQuery.setComplete()>
	//   35   66:astore_1        
			}
			saveTrackedQuery(((TrackedQuery) (path)));
	//   36   67:aload_0         
	//   37   68:aload_1         
	//   38   69:invokespecial   #122 <Method void saveTrackedQuery(TrackedQuery)>
		}
	//   39   72:return          
	}

	public TrackedQuery findTrackedQuery(QuerySpec queryspec)
	{
		queryspec = normalizeQuery(queryspec);
	//    0    0:aload_1         
	//    1    1:invokestatic    #274 <Method QuerySpec normalizeQuery(QuerySpec)>
	//    2    4:astore_1        
		Map map = (Map)trackedQueryTree.get(queryspec.getPath());
	//    3    5:aload_0         
	//    4    6:getfield        #75  <Field ImmutableTree trackedQueryTree>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #150 <Method Path QuerySpec.getPath()>
	//    7   13:invokevirtual   #154 <Method Object ImmutableTree.get(Path)>
	//    8   16:checkcast       #156 <Class Map>
	//    9   19:astore_2        
		if(map != null)
	//*  10   20:aload_2         
	//*  11   21:ifnull          38
			return (TrackedQuery)map.get(((Object) (queryspec.getParams())));
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #167 <Method QueryParams QuerySpec.getParams()>
	//   15   29:invokeinterface #170 <Method Object Map.get(Object)>
	//   16   34:checkcast       #102 <Class TrackedQuery>
	//   17   37:areturn         
		else
			return null;
	//   18   38:aconst_null     
	//   19   39:areturn         
	}

	public Set getKnownCompleteChildren(Path path)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #200 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #201 <Method void HashSet()>
	//    3    7:astore_2        
		Set set = filteredQueryIdsAtPath(path);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #307 <Method Set filteredQueryIdsAtPath(Path)>
	//    7   13:astore_3        
		if(!set.isEmpty())
	//*   8   14:aload_3         
	//*   9   15:invokeinterface #310 <Method boolean Set.isEmpty()>
	//*  10   20:ifne            40
			((Set) (hashset)).addAll(((Collection) (storageLayer.loadTrackedQueryKeys(set))));
	//   11   23:aload_2         
	//   12   24:aload_0         
	//   13   25:getfield        #64  <Field PersistenceStorageEngine storageLayer>
	//   14   28:aload_3         
	//   15   29:invokeinterface #314 <Method Set PersistenceStorageEngine.loadTrackedQueryKeys(Set)>
	//   16   34:invokeinterface #318 <Method boolean Set.addAll(Collection)>
	//   17   39:pop             
		path = ((Path) (trackedQueryTree.subtree(path).getChildren().iterator()));
	//   18   40:aload_0         
	//   19   41:getfield        #75  <Field ImmutableTree trackedQueryTree>
	//   20   44:aload_1         
	//   21   45:invokevirtual   #322 <Method ImmutableTree ImmutableTree.subtree(Path)>
	//   22   48:invokevirtual   #326 <Method ImmutableSortedMap ImmutableTree.getChildren()>
	//   23   51:invokevirtual   #329 <Method Iterator ImmutableSortedMap.iterator()>
	//   24   54:astore_1        
		do
		{
			if(!((Iterator) (path)).hasNext())
				break;
	//   25   55:aload_1         
	//   26   56:invokeinterface #96  <Method boolean Iterator.hasNext()>
	//   27   61:ifeq            133
			Object obj = ((Object) ((java.util.Map.Entry)((Iterator) (path)).next()));
	//   28   64:aload_1         
	//   29   65:invokeinterface #100 <Method Object Iterator.next()>
	//   30   70:checkcast       #230 <Class java.util.Map$Entry>
	//   31   73:astore          4
			ChildKey childkey = (ChildKey)((java.util.Map.Entry) (obj)).getKey();
	//   32   75:aload           4
	//   33   77:invokeinterface #332 <Method Object java.util.Map$Entry.getKey()>
	//   34   82:checkcast       #334 <Class ChildKey>
	//   35   85:astore_3        
			obj = ((Object) ((ImmutableTree)((java.util.Map.Entry) (obj)).getValue()));
	//   36   86:aload           4
	//   37   88:invokeinterface #233 <Method Object java.util.Map$Entry.getValue()>
	//   38   93:checkcast       #70  <Class ImmutableTree>
	//   39   96:astore          4
			if(((ImmutableTree) (obj)).getValue() != null && HAS_DEFAULT_COMPLETE_PREDICATE.evaluate(((ImmutableTree) (obj)).getValue()))
	//*  40   98:aload           4
	//*  41  100:invokevirtual   #335 <Method Object ImmutableTree.getValue()>
	//*  42  103:ifnull          55
	//*  43  106:getstatic       #48  <Field Predicate HAS_DEFAULT_COMPLETE_PREDICATE>
	//*  44  109:aload           4
	//*  45  111:invokevirtual   #335 <Method Object ImmutableTree.getValue()>
	//*  46  114:invokeinterface #238 <Method boolean Predicate.evaluate(Object)>
	//*  47  119:ifeq            55
				((Set) (hashset)).add(((Object) (childkey)));
	//   48  122:aload_2         
	//   49  123:aload_3         
	//   50  124:invokeinterface #220 <Method boolean Set.add(Object)>
	//   51  129:pop             
		} while(true);
	//   52  130:goto            55
		return ((Set) (hashset));
	//   53  133:aload_2         
	//   54  134:areturn         
	}

	public boolean hasActiveDefaultQuery(Path path)
	{
		return trackedQueryTree.rootMostValueMatching(path, HAS_ACTIVE_DEFAULT_PREDICATE) != null;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field ImmutableTree trackedQueryTree>
	//    2    4:aload_1         
	//    3    5:getstatic       #51  <Field Predicate HAS_ACTIVE_DEFAULT_PREDICATE>
	//    4    8:invokevirtual   #341 <Method Object ImmutableTree.rootMostValueMatching(Path, Predicate)>
	//    5   11:ifnull          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean isQueryComplete(QuerySpec queryspec)
	{
		if(includedInDefaultCompleteQuery(queryspec.getPath()))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #150 <Method Path QuerySpec.getPath()>
	//*   3    5:invokespecial   #300 <Method boolean includedInDefaultCompleteQuery(Path)>
	//*   4    8:ifeq            13
			return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
		if(queryspec.loadsAllData())
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #129 <Method boolean QuerySpec.loadsAllData()>
	//*   9   17:ifeq            22
			return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
		Map map = (Map)trackedQueryTree.get(queryspec.getPath());
	//   12   22:aload_0         
	//   13   23:getfield        #75  <Field ImmutableTree trackedQueryTree>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #150 <Method Path QuerySpec.getPath()>
	//   16   30:invokevirtual   #154 <Method Object ImmutableTree.get(Path)>
	//   17   33:checkcast       #156 <Class Map>
	//   18   36:astore_2        
		return map != null && map.containsKey(((Object) (queryspec.getParams()))) && ((TrackedQuery)map.get(((Object) (queryspec.getParams())))).complete;
	//   19   37:aload_2         
	//   20   38:ifnull          75
	//   21   41:aload_2         
	//   22   42:aload_1         
	//   23   43:invokevirtual   #167 <Method QueryParams QuerySpec.getParams()>
	//   24   46:invokeinterface #346 <Method boolean Map.containsKey(Object)>
	//   25   51:ifeq            75
	//   26   54:aload_2         
	//   27   55:aload_1         
	//   28   56:invokevirtual   #167 <Method QueryParams QuerySpec.getParams()>
	//   29   59:invokeinterface #170 <Method Object Map.get(Object)>
	//   30   64:checkcast       #102 <Class TrackedQuery>
	//   31   67:getfield        #349 <Field boolean TrackedQuery.complete>
	//   32   70:ifeq            75
	//   33   73:iconst_1        
	//   34   74:ireturn         
	//   35   75:iconst_0        
	//   36   76:ireturn         
	}

	public PruneForest pruneOldQueries(CachePolicy cachepolicy)
	{
		Object obj = ((Object) (getQueriesMatching(IS_QUERY_PRUNABLE_PREDICATE)));
	//    0    0:aload_0         
	//    1    1:getstatic       #54  <Field Predicate IS_QUERY_PRUNABLE_PREDICATE>
	//    2    4:invokespecial   #292 <Method List getQueriesMatching(Predicate)>
	//    3    7:astore          5
		long l = calculateCountToPrune(cachepolicy, ((List) (obj)).size());
	//    4    9:aload_1         
	//    5   10:aload           5
	//    6   12:invokeinterface #296 <Method int List.size()>
	//    7   17:i2l             
	//    8   18:invokestatic    #353 <Method long calculateCountToPrune(CachePolicy, long)>
	//    9   21:lstore_3        
		cachepolicy = ((CachePolicy) (new PruneForest()));
	//   10   22:new             #355 <Class PruneForest>
	//   11   25:dup             
	//   12   26:invokespecial   #356 <Method void PruneForest()>
	//   13   29:astore_1        
		if(logger.logsDebug())
	//*  14   30:aload_0         
	//*  15   31:getfield        #66  <Field LogWrapper logger>
	//*  16   34:invokevirtual   #361 <Method boolean LogWrapper.logsDebug()>
	//*  17   37:ifeq            103
		{
			LogWrapper logwrapper = logger;
	//   18   40:aload_0         
	//   19   41:getfield        #66  <Field LogWrapper logger>
	//   20   44:astore          6
			StringBuilder stringbuilder = new StringBuilder();
	//   21   46:new             #363 <Class StringBuilder>
	//   22   49:dup             
	//   23   50:invokespecial   #364 <Method void StringBuilder()>
	//   24   53:astore          7
			stringbuilder.append("Pruning old queries.  Prunable: ");
	//   25   55:aload           7
	//   26   57:ldc2            #366 <String "Pruning old queries.  Prunable: ">
	//   27   60:invokevirtual   #370 <Method StringBuilder StringBuilder.append(String)>
	//   28   63:pop             
			stringbuilder.append(((List) (obj)).size());
	//   29   64:aload           7
	//   30   66:aload           5
	//   31   68:invokeinterface #296 <Method int List.size()>
	//   32   73:invokevirtual   #373 <Method StringBuilder StringBuilder.append(int)>
	//   33   76:pop             
			stringbuilder.append(" Count to prune: ");
	//   34   77:aload           7
	//   35   79:ldc2            #375 <String " Count to prune: ">
	//   36   82:invokevirtual   #370 <Method StringBuilder StringBuilder.append(String)>
	//   37   85:pop             
			stringbuilder.append(l);
	//   38   86:aload           7
	//   39   88:lload_3         
	//   40   89:invokevirtual   #378 <Method StringBuilder StringBuilder.append(long)>
	//   41   92:pop             
			logwrapper.debug(stringbuilder.toString());
	//   42   93:aload           6
	//   43   95:aload           7
	//   44   97:invokevirtual   #382 <Method String StringBuilder.toString()>
	//   45  100:invokevirtual   #386 <Method void LogWrapper.debug(String)>
		}
		Collections.sort(((List) (obj)), new Comparator() {

			public int compare(TrackedQuery trackedquery1, TrackedQuery trackedquery2)
			{
				return Utilities.compareLongs(trackedquery1.lastUse, trackedquery2.lastUse);
			//    0    0:aload_1         
			//    1    1:getfield        #30  <Field long TrackedQuery.lastUse>
			//    2    4:aload_2         
			//    3    5:getfield        #30  <Field long TrackedQuery.lastUse>
			//    4    8:invokestatic    #36  <Method int Utilities.compareLongs(long, long)>
			//    5   11:ireturn         
			}

			public volatile int compare(Object obj1, Object obj2)
			{
				return compare((TrackedQuery)obj1, (TrackedQuery)obj2);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class TrackedQuery>
			//    3    5:aload_2         
			//    4    6:checkcast       #26  <Class TrackedQuery>
			//    5    9:invokevirtual   #39  <Method int compare(TrackedQuery, TrackedQuery)>
			//    6   12:ireturn         
			}

			final TrackedQueryManager this$0;

			
			{
				this$0 = TrackedQueryManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field TrackedQueryManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   46  103:aload           5
	//   47  105:new             #16  <Class TrackedQueryManager$6>
	//   48  108:dup             
	//   49  109:aload_0         
	//   50  110:invokespecial   #389 <Method void TrackedQueryManager$6(TrackedQueryManager)>
	//   51  113:invokestatic    #395 <Method void Collections.sort(List, Comparator)>
		for(int i = 0; (long)i < l; i++)
	//*  52  116:iconst_0        
	//*  53  117:istore_2        
	//*  54  118:iload_2         
	//*  55  119:i2l             
	//*  56  120:lload_3         
	//*  57  121:lcmp            
	//*  58  122:ifge            167
		{
			TrackedQuery trackedquery = (TrackedQuery)((List) (obj)).get(i);
	//   59  125:aload           5
	//   60  127:iload_2         
	//   61  128:invokeinterface #398 <Method Object List.get(int)>
	//   62  133:checkcast       #102 <Class TrackedQuery>
	//   63  136:astore          6
			cachepolicy = ((CachePolicy) (((PruneForest) (cachepolicy)).prune(trackedquery.querySpec.getPath())));
	//   64  138:aload_1         
	//   65  139:aload           6
	//   66  141:getfield        #144 <Field QuerySpec TrackedQuery.querySpec>
	//   67  144:invokevirtual   #150 <Method Path QuerySpec.getPath()>
	//   68  147:invokevirtual   #402 <Method PruneForest PruneForest.prune(Path)>
	//   69  150:astore_1        
			removeTrackedQuery(trackedquery.querySpec);
	//   70  151:aload_0         
	//   71  152:aload           6
	//   72  154:getfield        #144 <Field QuerySpec TrackedQuery.querySpec>
	//   73  157:invokevirtual   #405 <Method void removeTrackedQuery(QuerySpec)>
		}

	//   74  160:iload_2         
	//   75  161:iconst_1        
	//   76  162:iadd            
	//   77  163:istore_2        
	//*  78  164:goto            118
		for(int j = (int)l; j < ((List) (obj)).size(); j++)
	//*  79  167:lload_3         
	//*  80  168:l2i             
	//*  81  169:istore_2        
	//*  82  170:iload_2         
	//*  83  171:aload           5
	//*  84  173:invokeinterface #296 <Method int List.size()>
	//*  85  178:icmpge          210
			cachepolicy = ((CachePolicy) (((PruneForest) (cachepolicy)).keep(((TrackedQuery)((List) (obj)).get(j)).querySpec.getPath())));
	//   86  181:aload_1         
	//   87  182:aload           5
	//   88  184:iload_2         
	//   89  185:invokeinterface #398 <Method Object List.get(int)>
	//   90  190:checkcast       #102 <Class TrackedQuery>
	//   91  193:getfield        #144 <Field QuerySpec TrackedQuery.querySpec>
	//   92  196:invokevirtual   #150 <Method Path QuerySpec.getPath()>
	//   93  199:invokevirtual   #408 <Method PruneForest PruneForest.keep(Path)>
	//   94  202:astore_1        

	//   95  203:iload_2         
	//   96  204:iconst_1        
	//   97  205:iadd            
	//   98  206:istore_2        
	//*  99  207:goto            170
		obj = ((Object) (getQueriesMatching(IS_QUERY_UNPRUNABLE_PREDICATE)));
	//  100  210:aload_0         
	//  101  211:getstatic       #57  <Field Predicate IS_QUERY_UNPRUNABLE_PREDICATE>
	//  102  214:invokespecial   #292 <Method List getQueriesMatching(Predicate)>
	//  103  217:astore          5
		if(logger.logsDebug())
	//* 104  219:aload_0         
	//* 105  220:getfield        #66  <Field LogWrapper logger>
	//* 106  223:invokevirtual   #361 <Method boolean LogWrapper.logsDebug()>
	//* 107  226:ifeq            276
		{
			LogWrapper logwrapper1 = logger;
	//  108  229:aload_0         
	//  109  230:getfield        #66  <Field LogWrapper logger>
	//  110  233:astore          6
			StringBuilder stringbuilder1 = new StringBuilder();
	//  111  235:new             #363 <Class StringBuilder>
	//  112  238:dup             
	//  113  239:invokespecial   #364 <Method void StringBuilder()>
	//  114  242:astore          7
			stringbuilder1.append("Unprunable queries: ");
	//  115  244:aload           7
	//  116  246:ldc2            #410 <String "Unprunable queries: ">
	//  117  249:invokevirtual   #370 <Method StringBuilder StringBuilder.append(String)>
	//  118  252:pop             
			stringbuilder1.append(((List) (obj)).size());
	//  119  253:aload           7
	//  120  255:aload           5
	//  121  257:invokeinterface #296 <Method int List.size()>
	//  122  262:invokevirtual   #373 <Method StringBuilder StringBuilder.append(int)>
	//  123  265:pop             
			logwrapper1.debug(stringbuilder1.toString());
	//  124  266:aload           6
	//  125  268:aload           7
	//  126  270:invokevirtual   #382 <Method String StringBuilder.toString()>
	//  127  273:invokevirtual   #386 <Method void LogWrapper.debug(String)>
		}
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//* 128  276:aload           5
	//* 129  278:invokeinterface #90  <Method Iterator List.iterator()>
	//* 130  283:astore          5
	//* 131  285:aload           5
	//* 132  287:invokeinterface #96  <Method boolean Iterator.hasNext()>
	//* 133  292:ifeq            319
			cachepolicy = ((CachePolicy) (((PruneForest) (cachepolicy)).keep(((TrackedQuery)((Iterator) (obj)).next()).querySpec.getPath())));
	//  134  295:aload_1         
	//  135  296:aload           5
	//  136  298:invokeinterface #100 <Method Object Iterator.next()>
	//  137  303:checkcast       #102 <Class TrackedQuery>
	//  138  306:getfield        #144 <Field QuerySpec TrackedQuery.querySpec>
	//  139  309:invokevirtual   #150 <Method Path QuerySpec.getPath()>
	//  140  312:invokevirtual   #408 <Method PruneForest PruneForest.keep(Path)>
	//  141  315:astore_1        

	//* 142  316:goto            285
		return ((PruneForest) (cachepolicy));
	//  143  319:aload_1         
	//  144  320:areturn         
	}

	public void removeTrackedQuery(QuerySpec queryspec)
	{
		queryspec = normalizeQuery(queryspec);
	//    0    0:aload_1         
	//    1    1:invokestatic    #274 <Method QuerySpec normalizeQuery(QuerySpec)>
	//    2    4:astore_1        
		Object obj = ((Object) (findTrackedQuery(queryspec)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #278 <Method TrackedQuery findTrackedQuery(QuerySpec)>
	//    6   10:astore_2        
		storageLayer.deleteTrackedQuery(((TrackedQuery) (obj)).id);
	//    7   11:aload_0         
	//    8   12:getfield        #64  <Field PersistenceStorageEngine storageLayer>
	//    9   15:aload_2         
	//   10   16:getfield        #105 <Field long TrackedQuery.id>
	//   11   19:invokeinterface #413 <Method void PersistenceStorageEngine.deleteTrackedQuery(long)>
		obj = ((Object) ((Map)trackedQueryTree.get(queryspec.getPath())));
	//   12   24:aload_0         
	//   13   25:getfield        #75  <Field ImmutableTree trackedQueryTree>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #150 <Method Path QuerySpec.getPath()>
	//   16   32:invokevirtual   #154 <Method Object ImmutableTree.get(Path)>
	//   17   35:checkcast       #156 <Class Map>
	//   18   38:astore_2        
		((Map) (obj)).remove(((Object) (queryspec.getParams())));
	//   19   39:aload_2         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #167 <Method QueryParams QuerySpec.getParams()>
	//   22   44:invokeinterface #416 <Method Object Map.remove(Object)>
	//   23   49:pop             
		if(((Map) (obj)).isEmpty())
	//*  24   50:aload_2         
	//*  25   51:invokeinterface #417 <Method boolean Map.isEmpty()>
	//*  26   56:ifeq            74
			trackedQueryTree = trackedQueryTree.remove(queryspec.getPath());
	//   27   59:aload_0         
	//   28   60:aload_0         
	//   29   61:getfield        #75  <Field ImmutableTree trackedQueryTree>
	//   30   64:aload_1         
	//   31   65:invokevirtual   #150 <Method Path QuerySpec.getPath()>
	//   32   68:invokevirtual   #419 <Method ImmutableTree ImmutableTree.remove(Path)>
	//   33   71:putfield        #75  <Field ImmutableTree trackedQueryTree>
	//   34   74:return          
	}

	public void setQueriesComplete(Path path)
	{
		trackedQueryTree.subtree(path).foreach(new com.firebase.client.core.utilities.ImmutableTree.TreeVisitor() {

			public volatile Object onNodeValue(Path path1, Object obj, Object obj1)
			{
				return ((Object) (onNodeValue(path1, (Map)obj, (Void)obj1)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #26  <Class Map>
			//    4    6:aload_3         
			//    5    7:checkcast       #28  <Class Void>
			//    6   10:invokevirtual   #31  <Method Void onNodeValue(Path, Map, Void)>
			//    7   13:areturn         
			}

			public Void onNodeValue(Path path1, Map map, Void void1)
			{
				path1 = ((Path) (map.entrySet().iterator()));
			//    0    0:aload_2         
			//    1    1:invokeinterface #35  <Method Set Map.entrySet()>
			//    2    6:invokeinterface #41  <Method Iterator Set.iterator()>
			//    3   11:astore_1        
				do
				{
					if(!((Iterator) (path1)).hasNext())
						break;
			//    4   12:aload_1         
			//    5   13:invokeinterface #47  <Method boolean Iterator.hasNext()>
			//    6   18:ifeq            60
					map = ((Map) ((TrackedQuery)((java.util.Map.Entry)((Iterator) (path1)).next()).getValue()));
			//    7   21:aload_1         
			//    8   22:invokeinterface #51  <Method Object Iterator.next()>
			//    9   27:checkcast       #53  <Class java.util.Map$Entry>
			//   10   30:invokeinterface #56  <Method Object java.util.Map$Entry.getValue()>
			//   11   35:checkcast       #58  <Class TrackedQuery>
			//   12   38:astore_2        
					if(!((TrackedQuery) (map)).complete)
			//*  13   39:aload_2         
			//*  14   40:getfield        #62  <Field boolean TrackedQuery.complete>
			//*  15   43:ifne            12
						saveTrackedQuery(((TrackedQuery) (map)).setComplete());
			//   16   46:aload_0         
			//   17   47:getfield        #18  <Field TrackedQueryManager this$0>
			//   18   50:aload_2         
			//   19   51:invokevirtual   #66  <Method TrackedQuery TrackedQuery.setComplete()>
			//   20   54:invokestatic    #70  <Method void TrackedQueryManager.access$100(TrackedQueryManager, TrackedQuery)>
				} while(true);
			//   21   57:goto            12
				return null;
			//   22   60:aconst_null     
			//   23   61:areturn         
			}

			final TrackedQueryManager this$0;

			
			{
				this$0 = TrackedQueryManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field TrackedQueryManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field ImmutableTree trackedQueryTree>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #322 <Method ImmutableTree ImmutableTree.subtree(Path)>
	//    4    8:new             #14  <Class TrackedQueryManager$5>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #421 <Method void TrackedQueryManager$5(TrackedQueryManager)>
	//    8   16:invokevirtual   #425 <Method void ImmutableTree.foreach(com.firebase.client.core.utilities.ImmutableTree$TreeVisitor)>
	//    9   19:return          
	}

	public void setQueryActive(QuerySpec queryspec)
	{
		setQueryActiveFlag(queryspec, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #428 <Method void setQueryActiveFlag(QuerySpec, boolean)>
	//    4    6:return          
	}

	public void setQueryCompleteIfExists(QuerySpec queryspec)
	{
		queryspec = ((QuerySpec) (findTrackedQuery(normalizeQuery(queryspec))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #274 <Method QuerySpec normalizeQuery(QuerySpec)>
	//    3    5:invokevirtual   #278 <Method TrackedQuery findTrackedQuery(QuerySpec)>
	//    4    8:astore_1        
		if(queryspec != null && !((TrackedQuery) (queryspec)).complete)
	//*   5    9:aload_1         
	//*   6   10:ifnull          28
	//*   7   13:aload_1         
	//*   8   14:getfield        #349 <Field boolean TrackedQuery.complete>
	//*   9   17:ifne            28
			saveTrackedQuery(((TrackedQuery) (queryspec)).setComplete());
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #304 <Method TrackedQuery TrackedQuery.setComplete()>
	//   13   25:invokespecial   #122 <Method void saveTrackedQuery(TrackedQuery)>
	//   14   28:return          
	}

	public void setQueryInactive(QuerySpec queryspec)
	{
		setQueryActiveFlag(queryspec, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #428 <Method void setQueryActiveFlag(QuerySpec, boolean)>
	//    4    6:return          
	}

	void verifyCache()
	{
		List list = storageLayer.loadTrackedQueries();
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field PersistenceStorageEngine storageLayer>
	//    2    4:invokeinterface #84  <Method List PersistenceStorageEngine.loadTrackedQueries()>
	//    3    9:astore_2        
		final ArrayList trackedQueries = new ArrayList();
	//    4   10:new             #226 <Class ArrayList>
	//    5   13:dup             
	//    6   14:invokespecial   #227 <Method void ArrayList()>
	//    7   17:astore_3        
		trackedQueryTree.foreach(new com.firebase.client.core.utilities.ImmutableTree.TreeVisitor() {

			public volatile Object onNodeValue(Path path, Object obj, Object obj1)
			{
				return ((Object) (onNodeValue(path, (Map)obj, (Void)obj1)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #29  <Class Map>
			//    4    6:aload_3         
			//    5    7:checkcast       #31  <Class Void>
			//    6   10:invokevirtual   #34  <Method Void onNodeValue(Path, Map, Void)>
			//    7   13:areturn         
			}

			public Void onNodeValue(Path path, Map map, Void void1)
			{
				for(path = ((Path) (map.values().iterator())); ((Iterator) (path)).hasNext(); trackedQueries.add(((Object) (map))))
			//*   0    0:aload_2         
			//*   1    1:invokeinterface #38  <Method Collection Map.values()>
			//*   2    6:invokeinterface #44  <Method Iterator Collection.iterator()>
			//*   3   11:astore_1        
			//*   4   12:aload_1         
			//*   5   13:invokeinterface #50  <Method boolean Iterator.hasNext()>
			//*   6   18:ifeq            45
					map = ((Map) ((TrackedQuery)((Iterator) (path)).next()));
			//    7   21:aload_1         
			//    8   22:invokeinterface #54  <Method Object Iterator.next()>
			//    9   27:checkcast       #56  <Class TrackedQuery>
			//   10   30:astore_2        

			//   11   31:aload_0         
			//   12   32:getfield        #22  <Field List val$trackedQueries>
			//   13   35:aload_2         
			//   14   36:invokeinterface #62  <Method boolean List.add(Object)>
			//   15   41:pop             
			//*  16   42:goto            12
				return null;
			//   17   45:aconst_null     
			//   18   46:areturn         
			}

			final TrackedQueryManager this$0;
			final List val$trackedQueries;

			
			{
				this$0 = TrackedQueryManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field TrackedQueryManager this$0>
				trackedQueries = list;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field List val$trackedQueries>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    8   18:aload_0         
	//    9   19:getfield        #75  <Field ImmutableTree trackedQueryTree>
	//   10   22:new             #18  <Class TrackedQueryManager$7>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:aload_3         
	//   14   28:invokespecial   #434 <Method void TrackedQueryManager$7(TrackedQueryManager, List)>
	//   15   31:invokevirtual   #425 <Method void ImmutableTree.foreach(com.firebase.client.core.utilities.ImmutableTree$TreeVisitor)>
		Collections.sort(((List) (trackedQueries)), new Comparator() {

			public int compare(TrackedQuery trackedquery, TrackedQuery trackedquery1)
			{
				return Utilities.compareLongs(trackedquery.id, trackedquery1.id);
			//    0    0:aload_1         
			//    1    1:getfield        #29  <Field long TrackedQuery.id>
			//    2    4:aload_2         
			//    3    5:getfield        #29  <Field long TrackedQuery.id>
			//    4    8:invokestatic    #35  <Method int Utilities.compareLongs(long, long)>
			//    5   11:ireturn         
			}

			public volatile int compare(Object obj, Object obj1)
			{
				return compare((TrackedQuery)obj, (TrackedQuery)obj1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class TrackedQuery>
			//    3    5:aload_2         
			//    4    6:checkcast       #25  <Class TrackedQuery>
			//    5    9:invokevirtual   #38  <Method int compare(TrackedQuery, TrackedQuery)>
			//    6   12:ireturn         
			}

			final TrackedQueryManager this$0;

			
			{
				this$0 = TrackedQueryManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field TrackedQueryManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   16   34:aload_3         
	//   17   35:new             #20  <Class TrackedQueryManager$8>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:invokespecial   #435 <Method void TrackedQueryManager$8(TrackedQueryManager)>
	//   21   43:invokestatic    #395 <Method void Collections.sort(List, Comparator)>
		boolean flag = list.equals(((Object) (trackedQueries)));
	//   22   46:aload_2         
	//   23   47:aload_3         
	//   24   48:invokeinterface #438 <Method boolean List.equals(Object)>
	//   25   53:istore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   26   54:new             #363 <Class StringBuilder>
	//   27   57:dup             
	//   28   58:invokespecial   #364 <Method void StringBuilder()>
	//   29   61:astore          4
		stringbuilder.append("Tracked queries out of sync.  Tracked queries: ");
	//   30   63:aload           4
	//   31   65:ldc2            #440 <String "Tracked queries out of sync.  Tracked queries: ">
	//   32   68:invokevirtual   #370 <Method StringBuilder StringBuilder.append(String)>
	//   33   71:pop             
		stringbuilder.append(((Object) (trackedQueries)));
	//   34   72:aload           4
	//   35   74:aload_3         
	//   36   75:invokevirtual   #443 <Method StringBuilder StringBuilder.append(Object)>
	//   37   78:pop             
		stringbuilder.append(" Stored queries: ");
	//   38   79:aload           4
	//   39   81:ldc2            #445 <String " Stored queries: ">
	//   40   84:invokevirtual   #370 <Method StringBuilder StringBuilder.append(String)>
	//   41   87:pop             
		stringbuilder.append(((Object) (list)));
	//   42   88:aload           4
	//   43   90:aload_2         
	//   44   91:invokevirtual   #443 <Method StringBuilder StringBuilder.append(Object)>
	//   45   94:pop             
		Utilities.hardAssert(flag, stringbuilder.toString());
	//   46   95:iload_1         
	//   47   96:aload           4
	//   48   98:invokevirtual   #382 <Method String StringBuilder.toString()>
	//   49  101:invokestatic    #140 <Method void Utilities.hardAssert(boolean, String)>
	//   50  104:return          
	}

	static final boolean $assertionsDisabled = false;
	private static final Predicate HAS_ACTIVE_DEFAULT_PREDICATE = new Predicate() {

		public volatile boolean evaluate(Object obj)
		{
			return evaluate((Map)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class Map>
		//    3    5:invokevirtual   #21  <Method boolean evaluate(Map)>
		//    4    8:ireturn         
		}

		public boolean evaluate(Map map)
		{
			map = ((Map) ((TrackedQuery)map.get(((Object) (QueryParams.DEFAULT_PARAMS)))));
		//    0    0:aload_1         
		//    1    1:getstatic       #27  <Field QueryParams QueryParams.DEFAULT_PARAMS>
		//    2    4:invokeinterface #31  <Method Object Map.get(Object)>
		//    3    9:checkcast       #33  <Class TrackedQuery>
		//    4   12:astore_1        
			return map != null && ((TrackedQuery) (map)).active;
		//    5   13:aload_1         
		//    6   14:ifnull          26
		//    7   17:aload_1         
		//    8   18:getfield        #37  <Field boolean TrackedQuery.active>
		//    9   21:ifeq            26
		//   10   24:iconst_1        
		//   11   25:ireturn         
		//   12   26:iconst_0        
		//   13   27:ireturn         
		}

	}
;
	private static final Predicate HAS_DEFAULT_COMPLETE_PREDICATE = new Predicate() {

		public volatile boolean evaluate(Object obj)
		{
			return evaluate((Map)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class Map>
		//    3    5:invokevirtual   #21  <Method boolean evaluate(Map)>
		//    4    8:ireturn         
		}

		public boolean evaluate(Map map)
		{
			map = ((Map) ((TrackedQuery)map.get(((Object) (QueryParams.DEFAULT_PARAMS)))));
		//    0    0:aload_1         
		//    1    1:getstatic       #27  <Field QueryParams QueryParams.DEFAULT_PARAMS>
		//    2    4:invokeinterface #31  <Method Object Map.get(Object)>
		//    3    9:checkcast       #33  <Class TrackedQuery>
		//    4   12:astore_1        
			return map != null && ((TrackedQuery) (map)).complete;
		//    5   13:aload_1         
		//    6   14:ifnull          26
		//    7   17:aload_1         
		//    8   18:getfield        #37  <Field boolean TrackedQuery.complete>
		//    9   21:ifeq            26
		//   10   24:iconst_1        
		//   11   25:ireturn         
		//   12   26:iconst_0        
		//   13   27:ireturn         
		}

	}
;
	private static final Predicate IS_QUERY_PRUNABLE_PREDICATE = new Predicate() {

		public boolean evaluate(TrackedQuery trackedquery)
		{
			return trackedquery.active ^ true;
		//    0    0:aload_1         
		//    1    1:getfield        #22  <Field boolean TrackedQuery.active>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:ireturn         
		}

		public volatile boolean evaluate(Object obj)
		{
			return evaluate((TrackedQuery)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class TrackedQuery>
		//    3    5:invokevirtual   #25  <Method boolean evaluate(TrackedQuery)>
		//    4    8:ireturn         
		}

	}
;
	private static final Predicate IS_QUERY_UNPRUNABLE_PREDICATE = new Predicate() {

		public boolean evaluate(TrackedQuery trackedquery)
		{
			return TrackedQueryManager.IS_QUERY_PRUNABLE_PREDICATE.evaluate(((Object) (trackedquery))) ^ true;
		//    0    0:invokestatic    #20  <Method Predicate TrackedQueryManager.access$000()>
		//    1    3:aload_1         
		//    2    4:invokeinterface #23  <Method boolean Predicate.evaluate(Object)>
		//    3    9:iconst_1        
		//    4   10:ixor            
		//    5   11:ireturn         
		}

		public volatile boolean evaluate(Object obj)
		{
			return evaluate((TrackedQuery)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #25  <Class TrackedQuery>
		//    3    5:invokevirtual   #27  <Method boolean evaluate(TrackedQuery)>
		//    4    8:ireturn         
		}

	}
;
	private final Clock clock;
	private long currentQueryId;
	private final LogWrapper logger;
	private final PersistenceStorageEngine storageLayer;
	private ImmutableTree trackedQueryTree;

	static 
	{
	//    0    0:new             #6   <Class TrackedQueryManager$1>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void TrackedQueryManager$1()>
	//    3    7:putstatic       #48  <Field Predicate HAS_DEFAULT_COMPLETE_PREDICATE>
	//    4   10:new             #8   <Class TrackedQueryManager$2>
	//    5   13:dup             
	//    6   14:invokespecial   #49  <Method void TrackedQueryManager$2()>
	//    7   17:putstatic       #51  <Field Predicate HAS_ACTIVE_DEFAULT_PREDICATE>
	//    8   20:new             #10  <Class TrackedQueryManager$3>
	//    9   23:dup             
	//   10   24:invokespecial   #52  <Method void TrackedQueryManager$3()>
	//   11   27:putstatic       #54  <Field Predicate IS_QUERY_PRUNABLE_PREDICATE>
	//   12   30:new             #12  <Class TrackedQueryManager$4>
	//   13   33:dup             
	//   14   34:invokespecial   #55  <Method void TrackedQueryManager$4()>
	//   15   37:putstatic       #57  <Field Predicate IS_QUERY_UNPRUNABLE_PREDICATE>
	//*  16   40:return          
	}


/*
	static Predicate access$000()
	{
		return IS_QUERY_PRUNABLE_PREDICATE;
	//    0    0:getstatic       #54  <Field Predicate IS_QUERY_PRUNABLE_PREDICATE>
	//    1    3:areturn         
	}

*/


/*
	static void access$100(TrackedQueryManager trackedquerymanager, TrackedQuery trackedquery)
	{
		trackedquerymanager.saveTrackedQuery(trackedquery);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #122 <Method void saveTrackedQuery(TrackedQuery)>
		return;
	//    3    5:return          
	}

*/
}
