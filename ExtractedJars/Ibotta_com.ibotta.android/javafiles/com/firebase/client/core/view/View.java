// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view;

import com.firebase.client.FirebaseError;
import com.firebase.client.core.*;
import com.firebase.client.core.operation.Operation;
import com.firebase.client.core.operation.OperationSource;
import com.firebase.client.core.view.filter.IndexedFilter;
import com.firebase.client.core.view.filter.NodeFilter;
import com.firebase.client.snapshot.*;
import java.util.*;

// Referenced classes of package com.firebase.client.core.view:
//			QuerySpec, QueryParams, ViewProcessor, ViewCache, 
//			CacheNode, EventGenerator, Change, CancelEvent

public class View
{
	public static class OperationResult
	{

		public final List changes;
		public final List events;

		public OperationResult(List list, List list1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			events = list;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field List events>
			changes = list1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field List changes>
		//    8   14:return          
		}
	}


	public View(QuerySpec queryspec, ViewCache viewcache)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		query = queryspec;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field QuerySpec query>
		Object obj = ((Object) (new IndexedFilter(queryspec.getIndex())));
	//    5    9:new             #32  <Class IndexedFilter>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokevirtual   #38  <Method com.firebase.client.snapshot.Index QuerySpec.getIndex()>
	//    9   17:invokespecial   #41  <Method void IndexedFilter(com.firebase.client.snapshot.Index)>
	//   10   20:astore          4
		NodeFilter nodefilter = queryspec.getParams().getNodeFilter();
	//   11   22:aload_1         
	//   12   23:invokevirtual   #45  <Method QueryParams QuerySpec.getParams()>
	//   13   26:invokevirtual   #51  <Method NodeFilter QueryParams.getNodeFilter()>
	//   14   29:astore_3        
		processor = new ViewProcessor(nodefilter);
	//   15   30:aload_0         
	//   16   31:new             #53  <Class ViewProcessor>
	//   17   34:dup             
	//   18   35:aload_3         
	//   19   36:invokespecial   #56  <Method void ViewProcessor(NodeFilter)>
	//   20   39:putfield        #58  <Field ViewProcessor processor>
		CacheNode cachenode = viewcache.getServerCache();
	//   21   42:aload_2         
	//   22   43:invokevirtual   #64  <Method CacheNode ViewCache.getServerCache()>
	//   23   46:astore          5
		viewcache = ((ViewCache) (viewcache.getEventCache()));
	//   24   48:aload_2         
	//   25   49:invokevirtual   #67  <Method CacheNode ViewCache.getEventCache()>
	//   26   52:astore_2        
		IndexedNode indexednode1 = IndexedNode.from(((Node) (EmptyNode.Empty())), queryspec.getIndex());
	//   27   53:invokestatic    #73  <Method EmptyNode EmptyNode.Empty()>
	//   28   56:aload_1         
	//   29   57:invokevirtual   #38  <Method com.firebase.client.snapshot.Index QuerySpec.getIndex()>
	//   30   60:invokestatic    #79  <Method IndexedNode IndexedNode.from(Node, com.firebase.client.snapshot.Index)>
	//   31   63:astore          7
		IndexedNode indexednode = ((IndexedFilter) (obj)).updateFullNode(indexednode1, cachenode.getIndexedNode(), ((com.firebase.client.core.view.filter.ChildChangeAccumulator) (null)));
	//   32   65:aload           4
	//   33   67:aload           7
	//   34   69:aload           5
	//   35   71:invokevirtual   #85  <Method IndexedNode CacheNode.getIndexedNode()>
	//   36   74:aconst_null     
	//   37   75:invokevirtual   #89  <Method IndexedNode IndexedFilter.updateFullNode(IndexedNode, IndexedNode, com.firebase.client.core.view.filter.ChildChangeAccumulator)>
	//   38   78:astore          6
		indexednode1 = nodefilter.updateFullNode(indexednode1, ((CacheNode) (viewcache)).getIndexedNode(), ((com.firebase.client.core.view.filter.ChildChangeAccumulator) (null)));
	//   39   80:aload_3         
	//   40   81:aload           7
	//   41   83:aload_2         
	//   42   84:invokevirtual   #85  <Method IndexedNode CacheNode.getIndexedNode()>
	//   43   87:aconst_null     
	//   44   88:invokeinterface #92  <Method IndexedNode NodeFilter.updateFullNode(IndexedNode, IndexedNode, com.firebase.client.core.view.filter.ChildChangeAccumulator)>
	//   45   93:astore          7
		obj = ((Object) (new CacheNode(indexednode, cachenode.isFullyInitialized(), ((IndexedFilter) (obj)).filtersNodes())));
	//   46   95:new             #81  <Class CacheNode>
	//   47   98:dup             
	//   48   99:aload           6
	//   49  101:aload           5
	//   50  103:invokevirtual   #96  <Method boolean CacheNode.isFullyInitialized()>
	//   51  106:aload           4
	//   52  108:invokevirtual   #99  <Method boolean IndexedFilter.filtersNodes()>
	//   53  111:invokespecial   #102 <Method void CacheNode(IndexedNode, boolean, boolean)>
	//   54  114:astore          4
		viewCache = new ViewCache(new CacheNode(indexednode1, ((CacheNode) (viewcache)).isFullyInitialized(), nodefilter.filtersNodes()), ((CacheNode) (obj)));
	//   55  116:aload_0         
	//   56  117:new             #60  <Class ViewCache>
	//   57  120:dup             
	//   58  121:new             #81  <Class CacheNode>
	//   59  124:dup             
	//   60  125:aload           7
	//   61  127:aload_2         
	//   62  128:invokevirtual   #96  <Method boolean CacheNode.isFullyInitialized()>
	//   63  131:aload_3         
	//   64  132:invokeinterface #103 <Method boolean NodeFilter.filtersNodes()>
	//   65  137:invokespecial   #102 <Method void CacheNode(IndexedNode, boolean, boolean)>
	//   66  140:aload           4
	//   67  142:invokespecial   #106 <Method void ViewCache(CacheNode, CacheNode)>
	//   68  145:putfield        #108 <Field ViewCache viewCache>
	//   69  148:aload_0         
	//   70  149:new             #110 <Class ArrayList>
	//   71  152:dup             
	//   72  153:invokespecial   #111 <Method void ArrayList()>
	//   73  156:putfield        #113 <Field List eventRegistrations>
		eventGenerator = new EventGenerator(queryspec);
	//   74  159:aload_0         
	//   75  160:new             #115 <Class EventGenerator>
	//   76  163:dup             
	//   77  164:aload_1         
	//   78  165:invokespecial   #118 <Method void EventGenerator(QuerySpec)>
	//   79  168:putfield        #120 <Field EventGenerator eventGenerator>
	//   80  171:return          
	}

	private List generateEventsForChanges(List list, IndexedNode indexednode, EventRegistration eventregistration)
	{
		if(eventregistration == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       12
			eventregistration = ((EventRegistration) (eventRegistrations));
	//    2    4:aload_0         
	//    3    5:getfield        #113 <Field List eventRegistrations>
	//    4    8:astore_3        
		else
	//*   5    9:goto            24
			eventregistration = ((EventRegistration) (Arrays.asList(((Object []) (new EventRegistration[] {
				eventregistration
			})))));
	//    6   12:iconst_1        
	//    7   13:anewarray       EventRegistration[]
	//    8   16:dup             
	//    9   17:iconst_0        
	//   10   18:aload_3         
	//   11   19:aastore         
	//   12   20:invokestatic    #130 <Method List Arrays.asList(Object[])>
	//   13   23:astore_3        
		return eventGenerator.generateEventsForChanges(list, indexednode, ((List) (eventregistration)));
	//   14   24:aload_0         
	//   15   25:getfield        #120 <Field EventGenerator eventGenerator>
	//   16   28:aload_1         
	//   17   29:aload_2         
	//   18   30:aload_3         
	//   19   31:invokevirtual   #133 <Method List EventGenerator.generateEventsForChanges(List, IndexedNode, List)>
	//   20   34:areturn         
	}

	public void addEventRegistration(EventRegistration eventregistration)
	{
		eventRegistrations.add(((Object) (eventregistration)));
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field List eventRegistrations>
	//    2    4:aload_1         
	//    3    5:invokeinterface #144 <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public OperationResult applyOperation(Operation operation, WriteTreeRef writetreeref, Node node)
	{
		if(operation.getType() == com.firebase.client.core.operation.Operation.OperationType.Merge)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #153 <Method com.firebase.client.core.operation.Operation$OperationType Operation.getType()>
	//*   2    4:getstatic       #159 <Field com.firebase.client.core.operation.Operation$OperationType com.firebase.client.core.operation.Operation$OperationType.Merge>
	//*   3    7:if_acmpne       18
			operation.getSource().getQueryParams();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #163 <Method OperationSource Operation.getSource()>
	//    6   14:invokevirtual   #168 <Method QueryParams OperationSource.getQueryParams()>
	//    7   17:pop             
		ViewCache viewcache = viewCache;
	//    8   18:aload_0         
	//    9   19:getfield        #108 <Field ViewCache viewCache>
	//   10   22:astore          4
		operation = ((Operation) (processor.applyOperation(viewcache, operation, writetreeref, node)));
	//   11   24:aload_0         
	//   12   25:getfield        #58  <Field ViewProcessor processor>
	//   13   28:aload           4
	//   14   30:aload_1         
	//   15   31:aload_2         
	//   16   32:aload_3         
	//   17   33:invokevirtual   #171 <Method ViewProcessor$ProcessorResult ViewProcessor.applyOperation(ViewCache, Operation, WriteTreeRef, Node)>
	//   18   36:astore_1        
		viewCache = ((ViewProcessor.ProcessorResult) (operation)).viewCache;
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:getfield        #174 <Field ViewCache ViewProcessor$ProcessorResult.viewCache>
	//   22   42:putfield        #108 <Field ViewCache viewCache>
		return new OperationResult(generateEventsForChanges(((ViewProcessor.ProcessorResult) (operation)).changes, ((ViewProcessor.ProcessorResult) (operation)).viewCache.getEventCache().getIndexedNode(), ((EventRegistration) (null))), ((ViewProcessor.ProcessorResult) (operation)).changes);
	//   23   45:new             #6   <Class View$OperationResult>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:getfield        #177 <Field List ViewProcessor$ProcessorResult.changes>
	//   28   54:aload_1         
	//   29   55:getfield        #174 <Field ViewCache ViewProcessor$ProcessorResult.viewCache>
	//   30   58:invokevirtual   #67  <Method CacheNode ViewCache.getEventCache()>
	//   31   61:invokevirtual   #85  <Method IndexedNode CacheNode.getIndexedNode()>
	//   32   64:aconst_null     
	//   33   65:invokespecial   #179 <Method List generateEventsForChanges(List, IndexedNode, EventRegistration)>
	//   34   68:aload_1         
	//   35   69:getfield        #177 <Field List ViewProcessor$ProcessorResult.changes>
	//   36   72:invokespecial   #182 <Method void View$OperationResult(List, List)>
	//   37   75:areturn         
	}

	public Node getCompleteNode()
	{
		return viewCache.getCompleteEventSnap();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field ViewCache viewCache>
	//    2    4:invokevirtual   #187 <Method Node ViewCache.getCompleteEventSnap()>
	//    3    7:areturn         
	}

	public Node getCompleteServerCache(Path path)
	{
		Node node = viewCache.getCompleteServerSnap();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field ViewCache viewCache>
	//    2    4:invokevirtual   #192 <Method Node ViewCache.getCompleteServerSnap()>
	//    3    7:astore_2        
		if(node != null && (query.loadsAllData() || !path.isEmpty() && !node.getImmediateChild(path.getFront()).isEmpty()))
	//*   4    8:aload_2         
	//*   5    9:ifnull          55
	//*   6   12:aload_0         
	//*   7   13:getfield        #30  <Field QuerySpec query>
	//*   8   16:invokevirtual   #195 <Method boolean QuerySpec.loadsAllData()>
	//*   9   19:ifne            47
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #200 <Method boolean Path.isEmpty()>
	//*  12   26:ifne            55
	//*  13   29:aload_2         
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #204 <Method com.firebase.client.snapshot.ChildKey Path.getFront()>
	//*  16   34:invokeinterface #210 <Method Node Node.getImmediateChild(com.firebase.client.snapshot.ChildKey)>
	//*  17   39:invokeinterface #211 <Method boolean Node.isEmpty()>
	//*  18   44:ifne            55
			return node.getChild(path);
	//   19   47:aload_2         
	//   20   48:aload_1         
	//   21   49:invokeinterface #214 <Method Node Node.getChild(Path)>
	//   22   54:areturn         
		else
			return null;
	//   23   55:aconst_null     
	//   24   56:areturn         
	}

	public Node getEventCache()
	{
		return viewCache.getEventCache().getNode();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field ViewCache viewCache>
	//    2    4:invokevirtual   #67  <Method CacheNode ViewCache.getEventCache()>
	//    3    7:invokevirtual   #217 <Method Node CacheNode.getNode()>
	//    4   10:areturn         
	}

	List getEventRegistrations()
	{
		return eventRegistrations;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field List eventRegistrations>
	//    2    4:areturn         
	}

	public List getInitialEvents(EventRegistration eventregistration)
	{
		CacheNode cachenode = viewCache.getEventCache();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field ViewCache viewCache>
	//    2    4:invokevirtual   #67  <Method CacheNode ViewCache.getEventCache()>
	//    3    7:astore_2        
		ArrayList arraylist = new ArrayList();
	//    4    8:new             #110 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #111 <Method void ArrayList()>
	//    7   15:astore_3        
		NamedNode namednode;
		for(Iterator iterator = cachenode.getNode().iterator(); iterator.hasNext(); ((List) (arraylist)).add(((Object) (Change.childAddedChange(namednode.getName(), namednode.getNode())))))
	//*   8   16:aload_2         
	//*   9   17:invokevirtual   #217 <Method Node CacheNode.getNode()>
	//*  10   20:invokeinterface #226 <Method Iterator Node.iterator()>
	//*  11   25:astore          4
	//*  12   27:aload           4
	//*  13   29:invokeinterface #231 <Method boolean Iterator.hasNext()>
	//*  14   34:ifeq            72
			namednode = (NamedNode)iterator.next();
	//   15   37:aload           4
	//   16   39:invokeinterface #235 <Method Object Iterator.next()>
	//   17   44:checkcast       #237 <Class NamedNode>
	//   18   47:astore          5

	//   19   49:aload_3         
	//   20   50:aload           5
	//   21   52:invokevirtual   #240 <Method com.firebase.client.snapshot.ChildKey NamedNode.getName()>
	//   22   55:aload           5
	//   23   57:invokevirtual   #241 <Method Node NamedNode.getNode()>
	//   24   60:invokestatic    #247 <Method Change Change.childAddedChange(com.firebase.client.snapshot.ChildKey, Node)>
	//   25   63:invokeinterface #144 <Method boolean List.add(Object)>
	//   26   68:pop             
	//*  27   69:goto            27
		if(cachenode.isFullyInitialized())
	//*  28   72:aload_2         
	//*  29   73:invokevirtual   #96  <Method boolean CacheNode.isFullyInitialized()>
	//*  30   76:ifeq            93
			((List) (arraylist)).add(((Object) (Change.valueChange(cachenode.getIndexedNode()))));
	//   31   79:aload_3         
	//   32   80:aload_2         
	//   33   81:invokevirtual   #85  <Method IndexedNode CacheNode.getIndexedNode()>
	//   34   84:invokestatic    #251 <Method Change Change.valueChange(IndexedNode)>
	//   35   87:invokeinterface #144 <Method boolean List.add(Object)>
	//   36   92:pop             
		return generateEventsForChanges(((List) (arraylist)), cachenode.getIndexedNode(), eventregistration);
	//   37   93:aload_0         
	//   38   94:aload_3         
	//   39   95:aload_2         
	//   40   96:invokevirtual   #85  <Method IndexedNode CacheNode.getIndexedNode()>
	//   41   99:aload_1         
	//   42  100:invokespecial   #179 <Method List generateEventsForChanges(List, IndexedNode, EventRegistration)>
	//   43  103:areturn         
	}

	public QuerySpec getQuery()
	{
		return query;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field QuerySpec query>
	//    2    4:areturn         
	}

	public Node getServerCache()
	{
		return viewCache.getServerCache().getNode();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field ViewCache viewCache>
	//    2    4:invokevirtual   #64  <Method CacheNode ViewCache.getServerCache()>
	//    3    7:invokevirtual   #217 <Method Node CacheNode.getNode()>
	//    4   10:areturn         
	}

	public boolean isEmpty()
	{
		return eventRegistrations.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field List eventRegistrations>
	//    2    4:invokeinterface #255 <Method boolean List.isEmpty()>
	//    3    9:ireturn         
	}

	public List removeEventRegistration(EventRegistration eventregistration, FirebaseError firebaseerror)
	{
		Object obj;
label0:
		{
label1:
			{
				int i;
label2:
				{
					if(firebaseerror != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          78
					{
						ArrayList arraylist = new ArrayList();
	//    2    4:new             #110 <Class ArrayList>
	//    3    7:dup             
	//    4    8:invokespecial   #111 <Method void ArrayList()>
	//    5   11:astore          6
						Path path = query.getPath();
	//    6   13:aload_0         
	//    7   14:getfield        #30  <Field QuerySpec query>
	//    8   17:invokevirtual   #262 <Method Path QuerySpec.getPath()>
	//    9   20:astore          7
						Iterator iterator = eventRegistrations.iterator();
	//   10   22:aload_0         
	//   11   23:getfield        #113 <Field List eventRegistrations>
	//   12   26:invokeinterface #263 <Method Iterator List.iterator()>
	//   13   31:astore          8
						do
						{
							obj = ((Object) (arraylist));
	//   14   33:aload           6
	//   15   35:astore          5
							if(!iterator.hasNext())
								break;
	//   16   37:aload           8
	//   17   39:invokeinterface #231 <Method boolean Iterator.hasNext()>
	//   18   44:ifeq            83
							((List) (arraylist)).add(((Object) (new CancelEvent((EventRegistration)iterator.next(), firebaseerror, path))));
	//   19   47:aload           6
	//   20   49:new             #265 <Class CancelEvent>
	//   21   52:dup             
	//   22   53:aload           8
	//   23   55:invokeinterface #235 <Method Object Iterator.next()>
	//   24   60:checkcast       #124 <Class EventRegistration>
	//   25   63:aload_2         
	//   26   64:aload           7
	//   27   66:invokespecial   #268 <Method void CancelEvent(EventRegistration, FirebaseError, Path)>
	//   28   69:invokeinterface #144 <Method boolean List.add(Object)>
	//   29   74:pop             
						} while(true);
	//   30   75:goto            33
					} else
					{
						obj = ((Object) (Collections.emptyList()));
	//   31   78:invokestatic    #273 <Method List Collections.emptyList()>
	//   32   81:astore          5
					}
					if(eventregistration == null)
						break label1;
	//   33   83:aload_1         
	//   34   84:ifnull          187
					i = 0;
	//   35   87:iconst_0        
	//   36   88:istore_3        
					int j = -1;
	//   37   89:iconst_m1       
	//   38   90:istore          4
					for(; i < eventRegistrations.size(); i++)
	//*  39   92:iload_3         
	//*  40   93:aload_0         
	//*  41   94:getfield        #113 <Field List eventRegistrations>
	//*  42   97:invokeinterface #277 <Method int List.size()>
	//*  43  102:icmpge          147
					{
						firebaseerror = ((FirebaseError) ((EventRegistration)eventRegistrations.get(i)));
	//   44  105:aload_0         
	//   45  106:getfield        #113 <Field List eventRegistrations>
	//   46  109:iload_3         
	//   47  110:invokeinterface #281 <Method Object List.get(int)>
	//   48  115:checkcast       #124 <Class EventRegistration>
	//   49  118:astore_2        
						if(!((EventRegistration) (firebaseerror)).isSameListener(eventregistration))
							continue;
	//   50  119:aload_2         
	//   51  120:aload_1         
	//   52  121:invokevirtual   #285 <Method boolean EventRegistration.isSameListener(EventRegistration)>
	//   53  124:ifeq            140
						if(((EventRegistration) (firebaseerror)).isZombied())
	//*  54  127:aload_2         
	//*  55  128:invokevirtual   #288 <Method boolean EventRegistration.isZombied()>
	//*  56  131:ifeq            137
							break label2;
	//   57  134:goto            150
						j = i;
	//   58  137:iload_3         
	//   59  138:istore          4
					}

	//   60  140:iload_3         
	//   61  141:iconst_1        
	//   62  142:iadd            
	//   63  143:istore_3        
	//*  64  144:goto            92
					i = j;
	//   65  147:iload           4
	//   66  149:istore_3        
				}
				if(i != -1)
	//*  67  150:iload_3         
	//*  68  151:iconst_m1       
	//*  69  152:icmpeq          230
				{
					eventregistration = (EventRegistration)eventRegistrations.get(i);
	//   70  155:aload_0         
	//   71  156:getfield        #113 <Field List eventRegistrations>
	//   72  159:iload_3         
	//   73  160:invokeinterface #281 <Method Object List.get(int)>
	//   74  165:checkcast       #124 <Class EventRegistration>
	//   75  168:astore_1        
					eventRegistrations.remove(i);
	//   76  169:aload_0         
	//   77  170:getfield        #113 <Field List eventRegistrations>
	//   78  173:iload_3         
	//   79  174:invokeinterface #291 <Method Object List.remove(int)>
	//   80  179:pop             
					eventregistration.zombify();
	//   81  180:aload_1         
	//   82  181:invokevirtual   #294 <Method void EventRegistration.zombify()>
					return ((List) (obj));
	//   83  184:aload           5
	//   84  186:areturn         
				}
				break label0;
			}
			for(eventregistration = ((EventRegistration) (eventRegistrations.iterator())); ((Iterator) (eventregistration)).hasNext(); ((EventRegistration)((Iterator) (eventregistration)).next()).zombify());
	//   85  187:aload_0         
	//   86  188:getfield        #113 <Field List eventRegistrations>
	//   87  191:invokeinterface #263 <Method Iterator List.iterator()>
	//   88  196:astore_1        
	//   89  197:aload_1         
	//   90  198:invokeinterface #231 <Method boolean Iterator.hasNext()>
	//   91  203:ifeq            221
	//   92  206:aload_1         
	//   93  207:invokeinterface #235 <Method Object Iterator.next()>
	//   94  212:checkcast       #124 <Class EventRegistration>
	//   95  215:invokevirtual   #294 <Method void EventRegistration.zombify()>
	//*  96  218:goto            197
			eventRegistrations.clear();
	//   97  221:aload_0         
	//   98  222:getfield        #113 <Field List eventRegistrations>
	//   99  225:invokeinterface #297 <Method void List.clear()>
		}
		return ((List) (obj));
	//  100  230:aload           5
	//  101  232:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private final EventGenerator eventGenerator;
	private final List eventRegistrations = new ArrayList();
	private final ViewProcessor processor;
	private final QuerySpec query;
	private ViewCache viewCache;

	static 
	{
	//    0    0:return          
	}
}
