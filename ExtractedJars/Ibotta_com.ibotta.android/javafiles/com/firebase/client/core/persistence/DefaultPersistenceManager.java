// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.persistence;

import com.firebase.client.core.*;
import com.firebase.client.core.view.CacheNode;
import com.firebase.client.core.view.QuerySpec;
import com.firebase.client.snapshot.*;
import com.firebase.client.utilities.*;
import java.util.*;
import java.util.concurrent.Callable;

// Referenced classes of package com.firebase.client.core.persistence:
//			PersistenceManager, TrackedQueryManager, CachePolicy, PersistenceStorageEngine, 
//			PruneForest, TrackedQuery

public class DefaultPersistenceManager
	implements PersistenceManager
{

	public DefaultPersistenceManager(Context context, PersistenceStorageEngine persistencestorageengine, CachePolicy cachepolicy)
	{
		this(context, persistencestorageengine, cachepolicy, ((Clock) (new DefaultClock())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:new             #26  <Class DefaultClock>
	//    5    7:dup             
	//    6    8:invokespecial   #28  <Method void DefaultClock()>
	//    7   11:invokespecial   #31  <Method void DefaultPersistenceManager(Context, PersistenceStorageEngine, CachePolicy, Clock)>
	//    8   14:return          
	}

	public DefaultPersistenceManager(Context context, PersistenceStorageEngine persistencestorageengine, CachePolicy cachepolicy, Clock clock)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		serverCacheUpdatesSinceLastPruneCheck = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #34  <Field long serverCacheUpdatesSinceLastPruneCheck>
		storageLayer = persistencestorageengine;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #36  <Field PersistenceStorageEngine storageLayer>
		logger = context.getLogger("Persistence");
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:ldc1            #38  <String "Persistence">
	//   11   18:invokevirtual   #44  <Method LogWrapper Context.getLogger(String)>
	//   12   21:putfield        #46  <Field LogWrapper logger>
		trackedQueryManager = new TrackedQueryManager(storageLayer, logger, clock);
	//   13   24:aload_0         
	//   14   25:new             #48  <Class TrackedQueryManager>
	//   15   28:dup             
	//   16   29:aload_0         
	//   17   30:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//   18   33:aload_0         
	//   19   34:getfield        #46  <Field LogWrapper logger>
	//   20   37:aload           4
	//   21   39:invokespecial   #51  <Method void TrackedQueryManager(PersistenceStorageEngine, LogWrapper, Clock)>
	//   22   42:putfield        #53  <Field TrackedQueryManager trackedQueryManager>
		cachePolicy = cachepolicy;
	//   23   45:aload_0         
	//   24   46:aload_3         
	//   25   47:putfield        #55  <Field CachePolicy cachePolicy>
	//   26   50:return          
	}

	private void doPruneCheckAfterServerUpdate()
	{
		serverCacheUpdatesSinceLastPruneCheck = serverCacheUpdatesSinceLastPruneCheck + 1L;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field long serverCacheUpdatesSinceLastPruneCheck>
	//    3    5:lconst_1        
	//    4    6:ladd            
	//    5    7:putfield        #34  <Field long serverCacheUpdatesSinceLastPruneCheck>
		if(cachePolicy.shouldCheckCacheSize(serverCacheUpdatesSinceLastPruneCheck))
	//*   6   10:aload_0         
	//*   7   11:getfield        #55  <Field CachePolicy cachePolicy>
	//*   8   14:aload_0         
	//*   9   15:getfield        #34  <Field long serverCacheUpdatesSinceLastPruneCheck>
	//*  10   18:invokeinterface #62  <Method boolean CachePolicy.shouldCheckCacheSize(long)>
	//*  11   23:ifeq            265
		{
			if(logger.logsDebug())
	//*  12   26:aload_0         
	//*  13   27:getfield        #46  <Field LogWrapper logger>
	//*  14   30:invokevirtual   #68  <Method boolean LogWrapper.logsDebug()>
	//*  15   33:ifeq            45
				logger.debug("Reached prune check threshold.");
	//   16   36:aload_0         
	//   17   37:getfield        #46  <Field LogWrapper logger>
	//   18   40:ldc1            #70  <String "Reached prune check threshold.">
	//   19   42:invokevirtual   #74  <Method void LogWrapper.debug(String)>
			serverCacheUpdatesSinceLastPruneCheck = 0L;
	//   20   45:aload_0         
	//   21   46:lconst_0        
	//   22   47:putfield        #34  <Field long serverCacheUpdatesSinceLastPruneCheck>
			boolean flag1 = true;
	//   23   50:iconst_1        
	//   24   51:istore_2        
			long l1 = storageLayer.serverCacheEstimatedSizeInBytes();
	//   25   52:aload_0         
	//   26   53:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//   27   56:invokeinterface #80  <Method long PersistenceStorageEngine.serverCacheEstimatedSizeInBytes()>
	//   28   61:lstore          5
			boolean flag = flag1;
	//   29   63:iload_2         
	//   30   64:istore_1        
			long l = l1;
	//   31   65:lload           5
	//   32   67:lstore_3        
			if(logger.logsDebug())
	//*  33   68:aload_0         
	//*  34   69:getfield        #46  <Field LogWrapper logger>
	//*  35   72:invokevirtual   #68  <Method boolean LogWrapper.logsDebug()>
	//*  36   75:ifeq            124
			{
				LogWrapper logwrapper = logger;
	//   37   78:aload_0         
	//   38   79:getfield        #46  <Field LogWrapper logger>
	//   39   82:astore          7
				StringBuilder stringbuilder = new StringBuilder();
	//   40   84:new             #82  <Class StringBuilder>
	//   41   87:dup             
	//   42   88:invokespecial   #83  <Method void StringBuilder()>
	//   43   91:astore          8
				stringbuilder.append("Cache size: ");
	//   44   93:aload           8
	//   45   95:ldc1            #85  <String "Cache size: ">
	//   46   97:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   47  100:pop             
				stringbuilder.append(l1);
	//   48  101:aload           8
	//   49  103:lload           5
	//   50  105:invokevirtual   #92  <Method StringBuilder StringBuilder.append(long)>
	//   51  108:pop             
				logwrapper.debug(stringbuilder.toString());
	//   52  109:aload           7
	//   53  111:aload           8
	//   54  113:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   55  116:invokevirtual   #74  <Method void LogWrapper.debug(String)>
				l = l1;
	//   56  119:lload           5
	//   57  121:lstore_3        
				flag = flag1;
	//   58  122:iload_2         
	//   59  123:istore_1        
			}
			do
			{
				if(!flag || !cachePolicy.shouldPrune(l, trackedQueryManager.countOfPrunableQueries()))
					break;
	//   60  124:iload_1         
	//   61  125:ifeq            265
	//   62  128:aload_0         
	//   63  129:getfield        #55  <Field CachePolicy cachePolicy>
	//   64  132:lload_3         
	//   65  133:aload_0         
	//   66  134:getfield        #53  <Field TrackedQueryManager trackedQueryManager>
	//   67  137:invokevirtual   #99  <Method long TrackedQueryManager.countOfPrunableQueries()>
	//   68  140:invokeinterface #103 <Method boolean CachePolicy.shouldPrune(long, long)>
	//   69  145:ifeq            265
				PruneForest pruneforest = trackedQueryManager.pruneOldQueries(cachePolicy);
	//   70  148:aload_0         
	//   71  149:getfield        #53  <Field TrackedQueryManager trackedQueryManager>
	//   72  152:aload_0         
	//   73  153:getfield        #55  <Field CachePolicy cachePolicy>
	//   74  156:invokevirtual   #107 <Method PruneForest TrackedQueryManager.pruneOldQueries(CachePolicy)>
	//   75  159:astore          7
				boolean flag2;
				if(pruneforest.prunesAnything())
	//*  76  161:aload           7
	//*  77  163:invokevirtual   #112 <Method boolean PruneForest.prunesAnything()>
	//*  78  166:ifeq            188
				{
					storageLayer.pruneCache(Path.getEmptyPath(), pruneforest);
	//   79  169:aload_0         
	//   80  170:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//   81  173:invokestatic    #118 <Method Path Path.getEmptyPath()>
	//   82  176:aload           7
	//   83  178:invokeinterface #122 <Method void PersistenceStorageEngine.pruneCache(Path, PruneForest)>
					flag2 = flag;
	//   84  183:iload_1         
	//   85  184:istore_2        
				} else
	//*  86  185:goto            190
				{
					flag2 = false;
	//   87  188:iconst_0        
	//   88  189:istore_2        
				}
				long l2 = storageLayer.serverCacheEstimatedSizeInBytes();
	//   89  190:aload_0         
	//   90  191:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//   91  194:invokeinterface #80  <Method long PersistenceStorageEngine.serverCacheEstimatedSizeInBytes()>
	//   92  199:lstore          5
				flag = flag2;
	//   93  201:iload_2         
	//   94  202:istore_1        
				l = l2;
	//   95  203:lload           5
	//   96  205:lstore_3        
				if(logger.logsDebug())
	//*  97  206:aload_0         
	//*  98  207:getfield        #46  <Field LogWrapper logger>
	//*  99  210:invokevirtual   #68  <Method boolean LogWrapper.logsDebug()>
	//* 100  213:ifeq            124
				{
					LogWrapper logwrapper1 = logger;
	//  101  216:aload_0         
	//  102  217:getfield        #46  <Field LogWrapper logger>
	//  103  220:astore          7
					StringBuilder stringbuilder1 = new StringBuilder();
	//  104  222:new             #82  <Class StringBuilder>
	//  105  225:dup             
	//  106  226:invokespecial   #83  <Method void StringBuilder()>
	//  107  229:astore          8
					stringbuilder1.append("Cache size after prune: ");
	//  108  231:aload           8
	//  109  233:ldc1            #124 <String "Cache size after prune: ">
	//  110  235:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//  111  238:pop             
					stringbuilder1.append(l2);
	//  112  239:aload           8
	//  113  241:lload           5
	//  114  243:invokevirtual   #92  <Method StringBuilder StringBuilder.append(long)>
	//  115  246:pop             
					logwrapper1.debug(stringbuilder1.toString());
	//  116  247:aload           7
	//  117  249:aload           8
	//  118  251:invokevirtual   #96  <Method String StringBuilder.toString()>
	//  119  254:invokevirtual   #74  <Method void LogWrapper.debug(String)>
					flag = flag2;
	//  120  257:iload_2         
	//  121  258:istore_1        
					l = l2;
	//  122  259:lload           5
	//  123  261:lstore_3        
				}
			} while(true);
	//  124  262:goto            124
		}
	//  125  265:return          
	}

	public void applyUserWriteToServerCache(Path path, CompoundWrite compoundwrite)
	{
		java.util.Map.Entry entry;
		for(compoundwrite = ((CompoundWrite) (compoundwrite.iterator())); ((Iterator) (compoundwrite)).hasNext(); applyUserWriteToServerCache(path.child((Path)entry.getKey()), (Node)entry.getValue()))
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #132 <Method Iterator CompoundWrite.iterator()>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:invokeinterface #137 <Method boolean Iterator.hasNext()>
	//*   5   11:ifeq            53
			entry = (java.util.Map.Entry)((Iterator) (compoundwrite)).next();
	//    6   14:aload_2         
	//    7   15:invokeinterface #141 <Method Object Iterator.next()>
	//    8   20:checkcast       #143 <Class java.util.Map$Entry>
	//    9   23:astore_3        

	//   10   24:aload_0         
	//   11   25:aload_1         
	//   12   26:aload_3         
	//   13   27:invokeinterface #146 <Method Object java.util.Map$Entry.getKey()>
	//   14   32:checkcast       #114 <Class Path>
	//   15   35:invokevirtual   #150 <Method Path Path.child(Path)>
	//   16   38:aload_3         
	//   17   39:invokeinterface #153 <Method Object java.util.Map$Entry.getValue()>
	//   18   44:checkcast       #155 <Class Node>
	//   19   47:invokevirtual   #158 <Method void applyUserWriteToServerCache(Path, Node)>
	//*  20   50:goto            5
	//   21   53:return          
	}

	public void applyUserWriteToServerCache(Path path, Node node)
	{
		if(!trackedQueryManager.hasActiveDefaultQuery(path))
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field TrackedQueryManager trackedQueryManager>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #162 <Method boolean TrackedQueryManager.hasActiveDefaultQuery(Path)>
	//*   4    8:ifne            30
		{
			storageLayer.overwriteServerCache(path, node);
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:invokeinterface #165 <Method void PersistenceStorageEngine.overwriteServerCache(Path, Node)>
			trackedQueryManager.ensureCompleteTrackedQuery(path);
	//   10   22:aload_0         
	//   11   23:getfield        #53  <Field TrackedQueryManager trackedQueryManager>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #169 <Method void TrackedQueryManager.ensureCompleteTrackedQuery(Path)>
		}
	//   14   30:return          
	}

	public List loadUserWrites()
	{
		return storageLayer.loadUserWrites();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//    2    4:invokeinterface #173 <Method List PersistenceStorageEngine.loadUserWrites()>
	//    3    9:areturn         
	}

	public void removeAllUserWrites()
	{
		storageLayer.removeAllUserWrites();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//    2    4:invokeinterface #178 <Method void PersistenceStorageEngine.removeAllUserWrites()>
	//    3    9:return          
	}

	public void removeUserWrite(long l)
	{
		storageLayer.removeUserWrite(l);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//    2    4:lload_1         
	//    3    5:invokeinterface #182 <Method void PersistenceStorageEngine.removeUserWrite(long)>
	//    4   10:return          
	}

	public Object runInTransaction(Callable callable)
	{
		storageLayer.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//    2    4:invokeinterface #189 <Method void PersistenceStorageEngine.beginTransaction()>
		callable = ((Callable) (callable.call()));
	//    3    9:aload_1         
	//    4   10:invokeinterface #194 <Method Object Callable.call()>
	//    5   15:astore_1        
		storageLayer.setTransactionSuccessful();
	//    6   16:aload_0         
	//    7   17:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//    8   20:invokeinterface #197 <Method void PersistenceStorageEngine.setTransactionSuccessful()>
		storageLayer.endTransaction();
	//    9   25:aload_0         
	//   10   26:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//   11   29:invokeinterface #200 <Method void PersistenceStorageEngine.endTransaction()>
		return ((Object) (callable));
	//   12   34:aload_1         
	//   13   35:areturn         
		callable;
	//   14   36:astore_1        
		break MISSING_BLOCK_LABEL_50;
	//   15   37:goto            50
		callable;
	//   16   40:astore_1        
		throw new RuntimeException(((Throwable) (callable)));
	//   17   41:new             #202 <Class RuntimeException>
	//   18   44:dup             
	//   19   45:aload_1         
	//   20   46:invokespecial   #205 <Method void RuntimeException(Throwable)>
	//   21   49:athrow          
		storageLayer.endTransaction();
	//   22   50:aload_0         
	//   23   51:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//   24   54:invokeinterface #200 <Method void PersistenceStorageEngine.endTransaction()>
		throw callable;
	//   25   59:aload_1         
	//   26   60:athrow          
	}

	public void saveUserMerge(Path path, CompoundWrite compoundwrite, long l)
	{
		storageLayer.saveUserMerge(path, compoundwrite, l);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:lload_3         
	//    5    7:invokeinterface #210 <Method void PersistenceStorageEngine.saveUserMerge(Path, CompoundWrite, long)>
	//    6   12:return          
	}

	public void saveUserOverwrite(Path path, Node node, long l)
	{
		storageLayer.saveUserOverwrite(path, node, l);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:lload_3         
	//    5    7:invokeinterface #214 <Method void PersistenceStorageEngine.saveUserOverwrite(Path, Node, long)>
	//    6   12:return          
	}

	public CacheNode serverCache(QuerySpec queryspec)
	{
		boolean flag;
		Object obj;
		if(trackedQueryManager.isQueryComplete(queryspec))
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field TrackedQueryManager trackedQueryManager>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #220 <Method boolean TrackedQueryManager.isQueryComplete(QuerySpec)>
	//*   4    8:ifeq            62
		{
			obj = ((Object) (trackedQueryManager.findTrackedQuery(queryspec)));
	//    5   11:aload_0         
	//    6   12:getfield        #53  <Field TrackedQueryManager trackedQueryManager>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #224 <Method TrackedQuery TrackedQueryManager.findTrackedQuery(QuerySpec)>
	//    9   19:astore_3        
			if(!queryspec.loadsAllData() && obj != null && ((TrackedQuery) (obj)).complete)
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #229 <Method boolean QuerySpec.loadsAllData()>
	//*  12   24:ifne            55
	//*  13   27:aload_3         
	//*  14   28:ifnull          55
	//*  15   31:aload_3         
	//*  16   32:getfield        #234 <Field boolean TrackedQuery.complete>
	//*  17   35:ifeq            55
				obj = ((Object) (storageLayer.loadTrackedQueryKeys(((TrackedQuery) (obj)).id)));
	//   18   38:aload_0         
	//   19   39:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//   20   42:aload_3         
	//   21   43:getfield        #237 <Field long TrackedQuery.id>
	//   22   46:invokeinterface #241 <Method Set PersistenceStorageEngine.loadTrackedQueryKeys(long)>
	//   23   51:astore_3        
			else
	//*  24   52:goto            57
				obj = null;
	//   25   55:aconst_null     
	//   26   56:astore_3        
			flag = true;
	//   27   57:iconst_1        
	//   28   58:istore_2        
		} else
	//*  29   59:goto            76
		{
			obj = ((Object) (trackedQueryManager.getKnownCompleteChildren(queryspec.getPath())));
	//   30   62:aload_0         
	//   31   63:getfield        #53  <Field TrackedQueryManager trackedQueryManager>
	//   32   66:aload_1         
	//   33   67:invokevirtual   #244 <Method Path QuerySpec.getPath()>
	//   34   70:invokevirtual   #248 <Method Set TrackedQueryManager.getKnownCompleteChildren(Path)>
	//   35   73:astore_3        
			flag = false;
	//   36   74:iconst_0        
	//   37   75:istore_2        
		}
		Node node = storageLayer.serverCache(queryspec.getPath());
	//   38   76:aload_0         
	//   39   77:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//   40   80:aload_1         
	//   41   81:invokevirtual   #244 <Method Path QuerySpec.getPath()>
	//   42   84:invokeinterface #251 <Method Node PersistenceStorageEngine.serverCache(Path)>
	//   43   89:astore          5
		if(obj != null)
	//*  44   91:aload_3         
	//*  45   92:ifnull          172
		{
			Object obj1 = ((Object) (EmptyNode.Empty()));
	//   46   95:invokestatic    #257 <Method EmptyNode EmptyNode.Empty()>
	//   47   98:astore          4
			Iterator iterator = ((Set) (obj)).iterator();
	//   48  100:aload_3         
	//   49  101:invokeinterface #260 <Method Iterator Set.iterator()>
	//   50  106:astore          6
			for(obj = obj1; iterator.hasNext(); obj = ((Object) (((Node) (obj)).updateImmediateChild(((ChildKey) (obj1)), node.getImmediateChild(((ChildKey) (obj1)))))))
	//*  51  108:aload           4
	//*  52  110:astore_3        
	//*  53  111:aload           6
	//*  54  113:invokeinterface #137 <Method boolean Iterator.hasNext()>
	//*  55  118:ifeq            154
				obj1 = ((Object) ((ChildKey)iterator.next()));
	//   56  121:aload           6
	//   57  123:invokeinterface #141 <Method Object Iterator.next()>
	//   58  128:checkcast       #262 <Class ChildKey>
	//   59  131:astore          4

	//   60  133:aload_3         
	//   61  134:aload           4
	//   62  136:aload           5
	//   63  138:aload           4
	//   64  140:invokeinterface #266 <Method Node Node.getImmediateChild(ChildKey)>
	//   65  145:invokeinterface #270 <Method Node Node.updateImmediateChild(ChildKey, Node)>
	//   66  150:astore_3        
	//*  67  151:goto            111
			return new CacheNode(IndexedNode.from(((Node) (obj)), queryspec.getIndex()), flag, true);
	//   68  154:new             #272 <Class CacheNode>
	//   69  157:dup             
	//   70  158:aload_3         
	//   71  159:aload_1         
	//   72  160:invokevirtual   #276 <Method com.firebase.client.snapshot.Index QuerySpec.getIndex()>
	//   73  163:invokestatic    #282 <Method IndexedNode IndexedNode.from(Node, com.firebase.client.snapshot.Index)>
	//   74  166:iload_2         
	//   75  167:iconst_1        
	//   76  168:invokespecial   #285 <Method void CacheNode(IndexedNode, boolean, boolean)>
	//   77  171:areturn         
		} else
		{
			return new CacheNode(IndexedNode.from(node, queryspec.getIndex()), flag, false);
	//   78  172:new             #272 <Class CacheNode>
	//   79  175:dup             
	//   80  176:aload           5
	//   81  178:aload_1         
	//   82  179:invokevirtual   #276 <Method com.firebase.client.snapshot.Index QuerySpec.getIndex()>
	//   83  182:invokestatic    #282 <Method IndexedNode IndexedNode.from(Node, com.firebase.client.snapshot.Index)>
	//   84  185:iload_2         
	//   85  186:iconst_0        
	//   86  187:invokespecial   #285 <Method void CacheNode(IndexedNode, boolean, boolean)>
	//   87  190:areturn         
		}
	}

	public void setQueryActive(QuerySpec queryspec)
	{
		trackedQueryManager.setQueryActive(queryspec);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field TrackedQueryManager trackedQueryManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #289 <Method void TrackedQueryManager.setQueryActive(QuerySpec)>
	//    4    8:return          
	}

	public void setQueryComplete(QuerySpec queryspec)
	{
		if(queryspec.loadsAllData())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #229 <Method boolean QuerySpec.loadsAllData()>
	//*   2    4:ifeq            19
		{
			trackedQueryManager.setQueriesComplete(queryspec.getPath());
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field TrackedQueryManager trackedQueryManager>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #244 <Method Path QuerySpec.getPath()>
	//    7   15:invokevirtual   #293 <Method void TrackedQueryManager.setQueriesComplete(Path)>
			return;
	//    8   18:return          
		} else
		{
			trackedQueryManager.setQueryCompleteIfExists(queryspec);
	//    9   19:aload_0         
	//   10   20:getfield        #53  <Field TrackedQueryManager trackedQueryManager>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #296 <Method void TrackedQueryManager.setQueryCompleteIfExists(QuerySpec)>
			return;
	//   13   27:return          
		}
	}

	public void setQueryInactive(QuerySpec queryspec)
	{
		trackedQueryManager.setQueryInactive(queryspec);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field TrackedQueryManager trackedQueryManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #299 <Method void TrackedQueryManager.setQueryInactive(QuerySpec)>
	//    4    8:return          
	}

	public void setTrackedQueryKeys(QuerySpec queryspec, Set set)
	{
		queryspec = ((QuerySpec) (trackedQueryManager.findTrackedQuery(queryspec)));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field TrackedQueryManager trackedQueryManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #224 <Method TrackedQuery TrackedQueryManager.findTrackedQuery(QuerySpec)>
	//    4    8:astore_1        
		storageLayer.saveTrackedQueryKeys(((TrackedQuery) (queryspec)).id, set);
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//    7   13:aload_1         
	//    8   14:getfield        #237 <Field long TrackedQuery.id>
	//    9   17:aload_2         
	//   10   18:invokeinterface #305 <Method void PersistenceStorageEngine.saveTrackedQueryKeys(long, Set)>
	//   11   23:return          
	}

	public void updateServerCache(Path path, CompoundWrite compoundwrite)
	{
		storageLayer.mergeIntoServerCache(path, compoundwrite);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #310 <Method void PersistenceStorageEngine.mergeIntoServerCache(Path, CompoundWrite)>
		doPruneCheckAfterServerUpdate();
	//    5   11:aload_0         
	//    6   12:invokespecial   #312 <Method void doPruneCheckAfterServerUpdate()>
	//    7   15:return          
	}

	public void updateServerCache(QuerySpec queryspec, Node node)
	{
		if(queryspec.loadsAllData())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #229 <Method boolean QuerySpec.loadsAllData()>
	//*   2    4:ifeq            24
			storageLayer.overwriteServerCache(queryspec.getPath(), node);
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #244 <Method Path QuerySpec.getPath()>
	//    7   15:aload_2         
	//    8   16:invokeinterface #165 <Method void PersistenceStorageEngine.overwriteServerCache(Path, Node)>
		else
	//*   9   21:goto            38
			storageLayer.mergeIntoServerCache(queryspec.getPath(), node);
	//   10   24:aload_0         
	//   11   25:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #244 <Method Path QuerySpec.getPath()>
	//   14   32:aload_2         
	//   15   33:invokeinterface #315 <Method void PersistenceStorageEngine.mergeIntoServerCache(Path, Node)>
		setQueryComplete(queryspec);
	//   16   38:aload_0         
	//   17   39:aload_1         
	//   18   40:invokevirtual   #317 <Method void setQueryComplete(QuerySpec)>
		doPruneCheckAfterServerUpdate();
	//   19   43:aload_0         
	//   20   44:invokespecial   #312 <Method void doPruneCheckAfterServerUpdate()>
	//   21   47:return          
	}

	public void updateTrackedQueryKeys(QuerySpec queryspec, Set set, Set set1)
	{
		queryspec = ((QuerySpec) (trackedQueryManager.findTrackedQuery(queryspec)));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field TrackedQueryManager trackedQueryManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #224 <Method TrackedQuery TrackedQueryManager.findTrackedQuery(QuerySpec)>
	//    4    8:astore_1        
		storageLayer.updateTrackedQueryKeys(((TrackedQuery) (queryspec)).id, set, set1);
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field PersistenceStorageEngine storageLayer>
	//    7   13:aload_1         
	//    8   14:getfield        #237 <Field long TrackedQuery.id>
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:invokeinterface #322 <Method void PersistenceStorageEngine.updateTrackedQueryKeys(long, Set, Set)>
	//   12   24:return          
	}

	static final boolean $assertionsDisabled = false;
	private final CachePolicy cachePolicy;
	private final LogWrapper logger;
	private long serverCacheUpdatesSinceLastPruneCheck;
	private final PersistenceStorageEngine storageLayer;
	private final TrackedQueryManager trackedQueryManager;

	static 
	{
	//    0    0:return          
	}
}
