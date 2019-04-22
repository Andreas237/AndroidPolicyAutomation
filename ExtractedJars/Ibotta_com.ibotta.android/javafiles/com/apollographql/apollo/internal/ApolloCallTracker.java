// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;

import com.apollographql.apollo.*;
import com.apollographql.apollo.api.*;
import com.apollographql.apollo.api.internal.Utils;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public final class ApolloCallTracker
{

	public ApolloCallTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void HashMap()>
	//    6   12:putfield        #26  <Field Map activePrefetchCalls>
	//    7   15:aload_0         
	//    8   16:new             #23  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #24  <Method void HashMap()>
	//   11   23:putfield        #28  <Field Map activeQueryCalls>
	//   12   26:aload_0         
	//   13   27:new             #23  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #24  <Method void HashMap()>
	//   16   34:putfield        #30  <Field Map activeMutationCalls>
	//   17   37:aload_0         
	//   18   38:new             #23  <Class HashMap>
	//   19   41:dup             
	//   20   42:invokespecial   #24  <Method void HashMap()>
	//   21   45:putfield        #32  <Field Map activeQueryWatchers>
	//   22   48:aload_0         
	//   23   49:new             #34  <Class AtomicInteger>
	//   24   52:dup             
	//   25   53:invokespecial   #35  <Method void AtomicInteger()>
	//   26   56:putfield        #37  <Field AtomicInteger activeCallCount>
	//   27   59:return          
	}

	private Set activeCalls(Map map, OperationName operationname)
	{
		Utils.checkNotNull(((Object) (operationname)), "operationName == null");
	//    0    0:aload_2         
	//    1    1:ldc1            #43  <String "operationName == null">
	//    2    3:invokestatic    #49  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		map;
	//    4    7:aload_1         
		JVM INSTR monitorenter ;
	//    5    8:monitorenter    
		operationname = ((OperationName) ((Set)map.get(((Object) (operationname)))));
	//    6    9:aload_1         
	//    7   10:aload_2         
	//    8   11:invokeinterface #55  <Method Object Map.get(Object)>
	//    9   16:checkcast       #57  <Class Set>
	//   10   19:astore_2        
		if(operationname == null)
			break MISSING_BLOCK_LABEL_36;
	//   11   20:aload_2         
	//   12   21:ifnull          36
		operationname = ((OperationName) (new HashSet(((java.util.Collection) (operationname)))));
	//   13   24:new             #59  <Class HashSet>
	//   14   27:dup             
	//   15   28:aload_2         
	//   16   29:invokespecial   #62  <Method void HashSet(java.util.Collection)>
	//   17   32:astore_2        
		break MISSING_BLOCK_LABEL_40;
	//   18   33:goto            40
		operationname = ((OperationName) (Collections.emptySet()));
	//   19   36:invokestatic    #68  <Method Set Collections.emptySet()>
	//   20   39:astore_2        
		map;
	//   21   40:aload_1         
		JVM INSTR monitorexit ;
	//   22   41:monitorexit     
		return ((Set) (operationname));
	//   23   42:aload_2         
	//   24   43:areturn         
		operationname;
	//   25   44:astore_2        
		map;
	//   26   45:aload_1         
		JVM INSTR monitorexit ;
	//   27   46:monitorexit     
		throw operationname;
	//   28   47:aload_2         
	//   29   48:athrow          
	}

	private void notifyIdleResource()
	{
		IdleResourceCallback idleresourcecallback = idleResourceCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field IdleResourceCallback idleResourceCallback>
	//    2    4:astore_1        
		if(idleresourcecallback != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			idleresourcecallback.onIdle();
	//    5    9:aload_1         
	//    6   10:invokeinterface #79  <Method void IdleResourceCallback.onIdle()>
	//    7   15:return          
	}

	private void registerCall(Map map, OperationName operationname, Object obj)
	{
		map;
	//    0    0:aload_1         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Set set = (Set)map.get(((Object) (operationname)));
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokeinterface #55  <Method Object Map.get(Object)>
	//    5    9:checkcast       #57  <Class Set>
	//    6   12:astore          5
		Object obj1;
		obj1 = ((Object) (set));
	//    7   14:aload           5
	//    8   16:astore          4
		if(set != null)
			break MISSING_BLOCK_LABEL_42;
	//    9   18:aload           5
	//   10   20:ifnonnull       42
		obj1 = ((Object) (new HashSet()));
	//   11   23:new             #59  <Class HashSet>
	//   12   26:dup             
	//   13   27:invokespecial   #82  <Method void HashSet()>
	//   14   30:astore          4
		map.put(((Object) (operationname)), obj1);
	//   15   32:aload_1         
	//   16   33:aload_2         
	//   17   34:aload           4
	//   18   36:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//   19   41:pop             
		((Set) (obj1)).add(obj);
	//   20   42:aload           4
	//   21   44:aload_3         
	//   22   45:invokeinterface #89  <Method boolean Set.add(Object)>
	//   23   50:pop             
		map;
	//   24   51:aload_1         
		JVM INSTR monitorexit ;
	//   25   52:monitorexit     
		activeCallCount.incrementAndGet();
	//   26   53:aload_0         
	//   27   54:getfield        #37  <Field AtomicInteger activeCallCount>
	//   28   57:invokevirtual   #93  <Method int AtomicInteger.incrementAndGet()>
	//   29   60:pop             
		return;
	//   30   61:return          
		operationname;
	//   31   62:astore_2        
		map;
	//   32   63:aload_1         
		JVM INSTR monitorexit ;
	//   33   64:monitorexit     
		throw operationname;
	//   34   65:aload_2         
	//   35   66:athrow          
	}

	private void unregisterCall(Map map, OperationName operationname, Object obj)
	{
		map;
	//    0    0:aload_1         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Set set = (Set)map.get(((Object) (operationname)));
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokeinterface #55  <Method Object Map.get(Object)>
	//    5    9:checkcast       #57  <Class Set>
	//    6   12:astore          4
		if(set == null)
			break MISSING_BLOCK_LABEL_65;
	//    7   14:aload           4
	//    8   16:ifnull          65
		if(!set.remove(obj))
			break MISSING_BLOCK_LABEL_65;
	//    9   19:aload           4
	//   10   21:aload_3         
	//   11   22:invokeinterface #98  <Method boolean Set.remove(Object)>
	//   12   27:ifeq            65
		if(set.isEmpty())
	//*  13   30:aload           4
	//*  14   32:invokeinterface #102 <Method boolean Set.isEmpty()>
	//*  15   37:ifeq            48
			map.remove(((Object) (operationname)));
	//   16   40:aload_1         
	//   17   41:aload_2         
	//   18   42:invokeinterface #104 <Method Object Map.remove(Object)>
	//   19   47:pop             
		map;
	//   20   48:aload_1         
		JVM INSTR monitorexit ;
	//   21   49:monitorexit     
		if(activeCallCount.decrementAndGet() == 0)
	//*  22   50:aload_0         
	//*  23   51:getfield        #37  <Field AtomicInteger activeCallCount>
	//*  24   54:invokevirtual   #107 <Method int AtomicInteger.decrementAndGet()>
	//*  25   57:ifne            64
			notifyIdleResource();
	//   26   60:aload_0         
	//   27   61:invokespecial   #109 <Method void notifyIdleResource()>
		return;
	//   28   64:return          
		throw new AssertionError("Call wasn't registered before");
	//   29   65:new             #111 <Class AssertionError>
	//   30   68:dup             
	//   31   69:ldc1            #113 <String "Call wasn't registered before">
	//   32   71:invokespecial   #116 <Method void AssertionError(Object)>
	//   33   74:athrow          
		operationname;
	//   34   75:astore_2        
		map;
	//   35   76:aload_1         
		JVM INSTR monitorexit ;
	//   36   77:monitorexit     
		throw operationname;
	//   37   78:aload_2         
	//   38   79:athrow          
	}

	Set activeQueryWatchers(OperationName operationname)
	{
		return activeCalls(activeQueryWatchers, operationname);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #32  <Field Map activeQueryWatchers>
	//    3    5:aload_1         
	//    4    6:invokespecial   #119 <Method Set activeCalls(Map, OperationName)>
	//    5    9:areturn         
	}

	void registerCall(ApolloCall apollocall)
	{
		Utils.checkNotNull(((Object) (apollocall)), "call == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #124 <String "call == null">
	//    2    3:invokestatic    #49  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		Operation operation = apollocall.operation();
	//    4    7:aload_1         
	//    5    8:invokeinterface #130 <Method Operation ApolloCall.operation()>
	//    6   13:astore_2        
		if(operation instanceof Query)
	//*   7   14:aload_2         
	//*   8   15:instanceof      #132 <Class Query>
	//*   9   18:ifeq            30
		{
			registerQueryCall((ApolloQueryCall)apollocall);
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:checkcast       #134 <Class ApolloQueryCall>
	//   13   26:invokevirtual   #138 <Method void registerQueryCall(ApolloQueryCall)>
			return;
	//   14   29:return          
		}
		if(operation instanceof Mutation)
	//*  15   30:aload_2         
	//*  16   31:instanceof      #140 <Class Mutation>
	//*  17   34:ifeq            46
		{
			registerMutationCall((ApolloMutationCall)apollocall);
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:checkcast       #142 <Class ApolloMutationCall>
	//   21   42:invokevirtual   #146 <Method void registerMutationCall(ApolloMutationCall)>
			return;
	//   22   45:return          
		} else
		{
			throw new IllegalArgumentException("Unknown call type");
	//   23   46:new             #148 <Class IllegalArgumentException>
	//   24   49:dup             
	//   25   50:ldc1            #150 <String "Unknown call type">
	//   26   52:invokespecial   #153 <Method void IllegalArgumentException(String)>
	//   27   55:athrow          
		}
	}

	void registerMutationCall(ApolloMutationCall apollomutationcall)
	{
		Utils.checkNotNull(((Object) (apollomutationcall)), "apolloMutationCall == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #155 <String "apolloMutationCall == null">
	//    2    3:invokestatic    #49  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		OperationName operationname = apollomutationcall.operation().name();
	//    4    7:aload_1         
	//    5    8:invokeinterface #156 <Method Operation ApolloMutationCall.operation()>
	//    6   13:invokeinterface #162 <Method OperationName Operation.name()>
	//    7   18:astore_2        
		registerCall(activeMutationCalls, operationname, ((Object) (apollomutationcall)));
	//    8   19:aload_0         
	//    9   20:aload_0         
	//   10   21:getfield        #30  <Field Map activeMutationCalls>
	//   11   24:aload_2         
	//   12   25:aload_1         
	//   13   26:invokespecial   #164 <Method void registerCall(Map, OperationName, Object)>
	//   14   29:return          
	}

	void registerPrefetchCall(ApolloPrefetch apolloprefetch)
	{
		Utils.checkNotNull(((Object) (apolloprefetch)), "apolloPrefetch == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #168 <String "apolloPrefetch == null">
	//    2    3:invokestatic    #49  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		OperationName operationname = apolloprefetch.operation().name();
	//    4    7:aload_1         
	//    5    8:invokeinterface #171 <Method Operation ApolloPrefetch.operation()>
	//    6   13:invokeinterface #162 <Method OperationName Operation.name()>
	//    7   18:astore_2        
		registerCall(activePrefetchCalls, operationname, ((Object) (apolloprefetch)));
	//    8   19:aload_0         
	//    9   20:aload_0         
	//   10   21:getfield        #26  <Field Map activePrefetchCalls>
	//   11   24:aload_2         
	//   12   25:aload_1         
	//   13   26:invokespecial   #164 <Method void registerCall(Map, OperationName, Object)>
	//   14   29:return          
	}

	void registerQueryCall(ApolloQueryCall apolloquerycall)
	{
		Utils.checkNotNull(((Object) (apolloquerycall)), "apolloQueryCall == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #173 <String "apolloQueryCall == null">
	//    2    3:invokestatic    #49  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		OperationName operationname = apolloquerycall.operation().name();
	//    4    7:aload_1         
	//    5    8:invokeinterface #174 <Method Operation ApolloQueryCall.operation()>
	//    6   13:invokeinterface #162 <Method OperationName Operation.name()>
	//    7   18:astore_2        
		registerCall(activeQueryCalls, operationname, ((Object) (apolloquerycall)));
	//    8   19:aload_0         
	//    9   20:aload_0         
	//   10   21:getfield        #28  <Field Map activeQueryCalls>
	//   11   24:aload_2         
	//   12   25:aload_1         
	//   13   26:invokespecial   #164 <Method void registerCall(Map, OperationName, Object)>
	//   14   29:return          
	}

	void registerQueryWatcher(ApolloQueryWatcher apolloquerywatcher)
	{
		Utils.checkNotNull(((Object) (apolloquerywatcher)), "queryWatcher == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #178 <String "queryWatcher == null">
	//    2    3:invokestatic    #49  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		OperationName operationname = apolloquerywatcher.operation().name();
	//    4    7:aload_1         
	//    5    8:invokeinterface #181 <Method Operation ApolloQueryWatcher.operation()>
	//    6   13:invokeinterface #162 <Method OperationName Operation.name()>
	//    7   18:astore_2        
		registerCall(activeQueryWatchers, operationname, ((Object) (apolloquerywatcher)));
	//    8   19:aload_0         
	//    9   20:aload_0         
	//   10   21:getfield        #32  <Field Map activeQueryWatchers>
	//   11   24:aload_2         
	//   12   25:aload_1         
	//   13   26:invokespecial   #164 <Method void registerCall(Map, OperationName, Object)>
	//   14   29:return          
	}

	void unregisterCall(ApolloCall apollocall)
	{
		Utils.checkNotNull(((Object) (apollocall)), "call == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #124 <String "call == null">
	//    2    3:invokestatic    #49  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		Operation operation = apollocall.operation();
	//    4    7:aload_1         
	//    5    8:invokeinterface #130 <Method Operation ApolloCall.operation()>
	//    6   13:astore_2        
		if(operation instanceof Query)
	//*   7   14:aload_2         
	//*   8   15:instanceof      #132 <Class Query>
	//*   9   18:ifeq            30
		{
			unregisterQueryCall((ApolloQueryCall)apollocall);
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:checkcast       #134 <Class ApolloQueryCall>
	//   13   26:invokevirtual   #184 <Method void unregisterQueryCall(ApolloQueryCall)>
			return;
	//   14   29:return          
		}
		if(operation instanceof Mutation)
	//*  15   30:aload_2         
	//*  16   31:instanceof      #140 <Class Mutation>
	//*  17   34:ifeq            46
		{
			unregisterMutationCall((ApolloMutationCall)apollocall);
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:checkcast       #142 <Class ApolloMutationCall>
	//   21   42:invokevirtual   #187 <Method void unregisterMutationCall(ApolloMutationCall)>
			return;
	//   22   45:return          
		} else
		{
			throw new IllegalArgumentException("Unknown call type");
	//   23   46:new             #148 <Class IllegalArgumentException>
	//   24   49:dup             
	//   25   50:ldc1            #150 <String "Unknown call type">
	//   26   52:invokespecial   #153 <Method void IllegalArgumentException(String)>
	//   27   55:athrow          
		}
	}

	void unregisterMutationCall(ApolloMutationCall apollomutationcall)
	{
		Utils.checkNotNull(((Object) (apollomutationcall)), "apolloMutationCall == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #155 <String "apolloMutationCall == null">
	//    2    3:invokestatic    #49  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		OperationName operationname = apollomutationcall.operation().name();
	//    4    7:aload_1         
	//    5    8:invokeinterface #156 <Method Operation ApolloMutationCall.operation()>
	//    6   13:invokeinterface #162 <Method OperationName Operation.name()>
	//    7   18:astore_2        
		unregisterCall(activeMutationCalls, operationname, ((Object) (apollomutationcall)));
	//    8   19:aload_0         
	//    9   20:aload_0         
	//   10   21:getfield        #30  <Field Map activeMutationCalls>
	//   11   24:aload_2         
	//   12   25:aload_1         
	//   13   26:invokespecial   #189 <Method void unregisterCall(Map, OperationName, Object)>
	//   14   29:return          
	}

	void unregisterPrefetchCall(ApolloPrefetch apolloprefetch)
	{
		Utils.checkNotNull(((Object) (apolloprefetch)), "apolloPrefetch == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #168 <String "apolloPrefetch == null">
	//    2    3:invokestatic    #49  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		OperationName operationname = apolloprefetch.operation().name();
	//    4    7:aload_1         
	//    5    8:invokeinterface #171 <Method Operation ApolloPrefetch.operation()>
	//    6   13:invokeinterface #162 <Method OperationName Operation.name()>
	//    7   18:astore_2        
		unregisterCall(activePrefetchCalls, operationname, ((Object) (apolloprefetch)));
	//    8   19:aload_0         
	//    9   20:aload_0         
	//   10   21:getfield        #26  <Field Map activePrefetchCalls>
	//   11   24:aload_2         
	//   12   25:aload_1         
	//   13   26:invokespecial   #189 <Method void unregisterCall(Map, OperationName, Object)>
	//   14   29:return          
	}

	void unregisterQueryCall(ApolloQueryCall apolloquerycall)
	{
		Utils.checkNotNull(((Object) (apolloquerycall)), "apolloQueryCall == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #173 <String "apolloQueryCall == null">
	//    2    3:invokestatic    #49  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		OperationName operationname = apolloquerycall.operation().name();
	//    4    7:aload_1         
	//    5    8:invokeinterface #174 <Method Operation ApolloQueryCall.operation()>
	//    6   13:invokeinterface #162 <Method OperationName Operation.name()>
	//    7   18:astore_2        
		unregisterCall(activeQueryCalls, operationname, ((Object) (apolloquerycall)));
	//    8   19:aload_0         
	//    9   20:aload_0         
	//   10   21:getfield        #28  <Field Map activeQueryCalls>
	//   11   24:aload_2         
	//   12   25:aload_1         
	//   13   26:invokespecial   #189 <Method void unregisterCall(Map, OperationName, Object)>
	//   14   29:return          
	}

	void unregisterQueryWatcher(ApolloQueryWatcher apolloquerywatcher)
	{
		Utils.checkNotNull(((Object) (apolloquerywatcher)), "queryWatcher == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #178 <String "queryWatcher == null">
	//    2    3:invokestatic    #49  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		OperationName operationname = apolloquerywatcher.operation().name();
	//    4    7:aload_1         
	//    5    8:invokeinterface #181 <Method Operation ApolloQueryWatcher.operation()>
	//    6   13:invokeinterface #162 <Method OperationName Operation.name()>
	//    7   18:astore_2        
		unregisterCall(activeQueryWatchers, operationname, ((Object) (apolloquerywatcher)));
	//    8   19:aload_0         
	//    9   20:aload_0         
	//   10   21:getfield        #32  <Field Map activeQueryWatchers>
	//   11   24:aload_2         
	//   12   25:aload_1         
	//   13   26:invokespecial   #189 <Method void unregisterCall(Map, OperationName, Object)>
	//   14   29:return          
	}

	private final AtomicInteger activeCallCount = new AtomicInteger();
	private final Map activeMutationCalls = new HashMap();
	private final Map activePrefetchCalls = new HashMap();
	private final Map activeQueryCalls = new HashMap();
	private final Map activeQueryWatchers = new HashMap();
	private IdleResourceCallback idleResourceCallback;
}
