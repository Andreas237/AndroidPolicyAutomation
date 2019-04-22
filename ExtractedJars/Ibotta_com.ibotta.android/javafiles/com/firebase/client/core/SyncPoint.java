// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.FirebaseError;
import com.firebase.client.core.operation.Operation;
import com.firebase.client.core.operation.OperationSource;
import com.firebase.client.core.persistence.PersistenceManager;
import com.firebase.client.core.view.CacheNode;
import com.firebase.client.core.view.Change;
import com.firebase.client.core.view.QuerySpec;
import com.firebase.client.core.view.View;
import com.firebase.client.core.view.ViewCache;
import com.firebase.client.snapshot.*;
import com.firebase.client.utilities.Pair;
import java.util.*;

// Referenced classes of package com.firebase.client.core:
//			EventRegistration, WriteTreeRef, Path

public class SyncPoint
{

	public SyncPoint(PersistenceManager persistencemanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void HashMap()>
	//    6   12:putfield        #24  <Field Map views>
		persistenceManager = persistencemanager;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #26  <Field PersistenceManager persistenceManager>
	//   10   20:return          
	}

	private List applyOperationToView(View view, Operation operation, WriteTreeRef writetreeref, Node node)
	{
		operation = ((Operation) (view.applyOperation(operation, writetreeref, node)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokevirtual   #34  <Method com.firebase.client.core.view.View$OperationResult View.applyOperation(Operation, WriteTreeRef, Node)>
	//    5    8:astore_2        
		if(!view.getQuery().loadsAllData())
	//*   6    9:aload_1         
	//*   7   10:invokevirtual   #38  <Method QuerySpec View.getQuery()>
	//*   8   13:invokevirtual   #44  <Method boolean QuerySpec.loadsAllData()>
	//*   9   16:ifne            158
		{
			writetreeref = ((WriteTreeRef) (new HashSet()));
	//   10   19:new             #46  <Class HashSet>
	//   11   22:dup             
	//   12   23:invokespecial   #47  <Method void HashSet()>
	//   13   26:astore_3        
			node = ((Node) (new HashSet()));
	//   14   27:new             #46  <Class HashSet>
	//   15   30:dup             
	//   16   31:invokespecial   #47  <Method void HashSet()>
	//   17   34:astore          4
			Iterator iterator = ((com.firebase.client.core.view.View.OperationResult) (operation)).changes.iterator();
	//   18   36:aload_2         
	//   19   37:getfield        #53  <Field List com.firebase.client.core.view.View$OperationResult.changes>
	//   20   40:invokeinterface #59  <Method Iterator List.iterator()>
	//   21   45:astore          5
			do
			{
				if(!iterator.hasNext())
					break;
	//   22   47:aload           5
	//   23   49:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//   24   54:ifeq            123
				Change change = (Change)iterator.next();
	//   25   57:aload           5
	//   26   59:invokeinterface #68  <Method Object Iterator.next()>
	//   27   64:checkcast       #70  <Class Change>
	//   28   67:astore          6
				com.firebase.client.core.view.Event.EventType eventtype = change.getEventType();
	//   29   69:aload           6
	//   30   71:invokevirtual   #74  <Method com.firebase.client.core.view.Event$EventType Change.getEventType()>
	//   31   74:astore          7
				if(eventtype == com.firebase.client.core.view.Event.EventType.CHILD_ADDED)
	//*  32   76:aload           7
	//*  33   78:getstatic       #80  <Field com.firebase.client.core.view.Event$EventType com.firebase.client.core.view.Event$EventType.CHILD_ADDED>
	//*  34   81:if_acmpne       100
					((Set) (node)).add(((Object) (change.getChildKey())));
	//   35   84:aload           4
	//   36   86:aload           6
	//   37   88:invokevirtual   #84  <Method com.firebase.client.snapshot.ChildKey Change.getChildKey()>
	//   38   91:invokeinterface #90  <Method boolean Set.add(Object)>
	//   39   96:pop             
				else
	//*  40   97:goto            47
				if(eventtype == com.firebase.client.core.view.Event.EventType.CHILD_REMOVED)
	//*  41  100:aload           7
	//*  42  102:getstatic       #93  <Field com.firebase.client.core.view.Event$EventType com.firebase.client.core.view.Event$EventType.CHILD_REMOVED>
	//*  43  105:if_acmpne       47
					((Set) (writetreeref)).add(((Object) (change.getChildKey())));
	//   44  108:aload_3         
	//   45  109:aload           6
	//   46  111:invokevirtual   #84  <Method com.firebase.client.snapshot.ChildKey Change.getChildKey()>
	//   47  114:invokeinterface #90  <Method boolean Set.add(Object)>
	//   48  119:pop             
			} while(true);
	//   49  120:goto            47
			if(!((Set) (node)).isEmpty() || !((Set) (writetreeref)).isEmpty())
	//*  50  123:aload           4
	//*  51  125:invokeinterface #96  <Method boolean Set.isEmpty()>
	//*  52  130:ifeq            142
	//*  53  133:aload_3         
	//*  54  134:invokeinterface #96  <Method boolean Set.isEmpty()>
	//*  55  139:ifne            158
				persistenceManager.updateTrackedQueryKeys(view.getQuery(), ((Set) (node)), ((Set) (writetreeref)));
	//   56  142:aload_0         
	//   57  143:getfield        #26  <Field PersistenceManager persistenceManager>
	//   58  146:aload_1         
	//   59  147:invokevirtual   #38  <Method QuerySpec View.getQuery()>
	//   60  150:aload           4
	//   61  152:aload_3         
	//   62  153:invokeinterface #102 <Method void PersistenceManager.updateTrackedQueryKeys(QuerySpec, Set, Set)>
		}
		return ((com.firebase.client.core.view.View.OperationResult) (operation)).events;
	//   63  158:aload_2         
	//   64  159:getfield        #105 <Field List com.firebase.client.core.view.View$OperationResult.events>
	//   65  162:areturn         
	}

	public List addEventRegistration(EventRegistration eventregistration, WriteTreeRef writetreeref, CacheNode cachenode)
	{
		QuerySpec queryspec = eventregistration.getQuerySpec();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #115 <Method QuerySpec EventRegistration.getQuerySpec()>
	//    2    4:astore          7
		View view = (View)views.get(((Object) (queryspec.getParams())));
	//    3    6:aload_0         
	//    4    7:getfield        #24  <Field Map views>
	//    5   10:aload           7
	//    6   12:invokevirtual   #119 <Method com.firebase.client.core.view.QueryParams QuerySpec.getParams()>
	//    7   15:invokeinterface #125 <Method Object Map.get(Object)>
	//    8   20:checkcast       #30  <Class View>
	//    9   23:astore          6
		Object obj = ((Object) (view));
	//   10   25:aload           6
	//   11   27:astore          5
		if(view == null)
	//*  12   29:aload           6
	//*  13   31:ifnonnull       212
		{
			if(cachenode.isFullyInitialized())
	//*  14   34:aload_3         
	//*  15   35:invokevirtual   #130 <Method boolean CacheNode.isFullyInitialized()>
	//*  16   38:ifeq            50
				obj = ((Object) (cachenode.getNode()));
	//   17   41:aload_3         
	//   18   42:invokevirtual   #134 <Method Node CacheNode.getNode()>
	//   19   45:astore          5
			else
	//*  20   47:goto            53
				obj = null;
	//   21   50:aconst_null     
	//   22   51:astore          5
			obj = ((Object) (writetreeref.calcCompleteEventCache(((Node) (obj)))));
	//   23   53:aload_2         
	//   24   54:aload           5
	//   25   56:invokevirtual   #140 <Method Node WriteTreeRef.calcCompleteEventCache(Node)>
	//   26   59:astore          5
			boolean flag;
			if(obj != null)
	//*  27   61:aload           5
	//*  28   63:ifnull          75
			{
				flag = true;
	//   29   66:iconst_1        
	//   30   67:istore          4
				writetreeref = ((WriteTreeRef) (obj));
	//   31   69:aload           5
	//   32   71:astore_2        
			} else
	//*  33   72:goto            87
			{
				writetreeref = ((WriteTreeRef) (writetreeref.calcCompleteEventChildren(cachenode.getNode())));
	//   34   75:aload_2         
	//   35   76:aload_3         
	//   36   77:invokevirtual   #134 <Method Node CacheNode.getNode()>
	//   37   80:invokevirtual   #143 <Method Node WriteTreeRef.calcCompleteEventChildren(Node)>
	//   38   83:astore_2        
				flag = false;
	//   39   84:iconst_0        
	//   40   85:istore          4
			}
			obj = ((Object) (new View(queryspec, new ViewCache(new CacheNode(IndexedNode.from(((Node) (writetreeref)), queryspec.getIndex()), flag, false), cachenode))));
	//   41   87:new             #30  <Class View>
	//   42   90:dup             
	//   43   91:aload           7
	//   44   93:new             #145 <Class ViewCache>
	//   45   96:dup             
	//   46   97:new             #127 <Class CacheNode>
	//   47  100:dup             
	//   48  101:aload_2         
	//   49  102:aload           7
	//   50  104:invokevirtual   #149 <Method com.firebase.client.snapshot.Index QuerySpec.getIndex()>
	//   51  107:invokestatic    #155 <Method IndexedNode IndexedNode.from(Node, com.firebase.client.snapshot.Index)>
	//   52  110:iload           4
	//   53  112:iconst_0        
	//   54  113:invokespecial   #158 <Method void CacheNode(IndexedNode, boolean, boolean)>
	//   55  116:aload_3         
	//   56  117:invokespecial   #161 <Method void ViewCache(CacheNode, CacheNode)>
	//   57  120:invokespecial   #164 <Method void View(QuerySpec, ViewCache)>
	//   58  123:astore          5
			if(!queryspec.loadsAllData())
	//*  59  125:aload           7
	//*  60  127:invokevirtual   #44  <Method boolean QuerySpec.loadsAllData()>
	//*  61  130:ifne            195
			{
				writetreeref = ((WriteTreeRef) (new HashSet()));
	//   62  133:new             #46  <Class HashSet>
	//   63  136:dup             
	//   64  137:invokespecial   #47  <Method void HashSet()>
	//   65  140:astore_2        
				for(cachenode = ((CacheNode) (((View) (obj)).getEventCache().iterator())); ((Iterator) (cachenode)).hasNext(); ((Set) (writetreeref)).add(((Object) (((NamedNode)((Iterator) (cachenode)).next()).getName()))));
	//   66  141:aload           5
	//   67  143:invokevirtual   #167 <Method Node View.getEventCache()>
	//   68  146:invokeinterface #170 <Method Iterator Node.iterator()>
	//   69  151:astore_3        
	//   70  152:aload_3         
	//   71  153:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//   72  158:ifeq            183
	//   73  161:aload_2         
	//   74  162:aload_3         
	//   75  163:invokeinterface #68  <Method Object Iterator.next()>
	//   76  168:checkcast       #172 <Class NamedNode>
	//   77  171:invokevirtual   #175 <Method com.firebase.client.snapshot.ChildKey NamedNode.getName()>
	//   78  174:invokeinterface #90  <Method boolean Set.add(Object)>
	//   79  179:pop             
	//*  80  180:goto            152
				persistenceManager.setTrackedQueryKeys(queryspec, ((Set) (writetreeref)));
	//   81  183:aload_0         
	//   82  184:getfield        #26  <Field PersistenceManager persistenceManager>
	//   83  187:aload           7
	//   84  189:aload_2         
	//   85  190:invokeinterface #179 <Method void PersistenceManager.setTrackedQueryKeys(QuerySpec, Set)>
			}
			views.put(((Object) (queryspec.getParams())), obj);
	//   86  195:aload_0         
	//   87  196:getfield        #24  <Field Map views>
	//   88  199:aload           7
	//   89  201:invokevirtual   #119 <Method com.firebase.client.core.view.QueryParams QuerySpec.getParams()>
	//   90  204:aload           5
	//   91  206:invokeinterface #183 <Method Object Map.put(Object, Object)>
	//   92  211:pop             
		}
		((View) (obj)).addEventRegistration(eventregistration);
	//   93  212:aload           5
	//   94  214:aload_1         
	//   95  215:invokevirtual   #186 <Method void View.addEventRegistration(EventRegistration)>
		return ((View) (obj)).getInitialEvents(eventregistration);
	//   96  218:aload           5
	//   97  220:aload_1         
	//   98  221:invokevirtual   #190 <Method List View.getInitialEvents(EventRegistration)>
	//   99  224:areturn         
	}

	public List applyOperation(Operation operation, WriteTreeRef writetreeref, Node node)
	{
		Object obj = ((Object) (operation.getSource().getQueryParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #199 <Method OperationSource Operation.getSource()>
	//    2    4:invokevirtual   #204 <Method com.firebase.client.core.view.QueryParams OperationSource.getQueryParams()>
	//    3    7:astore          4
		if(obj != null)
	//*   4    9:aload           4
	//*   5   11:ifnull          36
			return applyOperationToView((View)views.get(obj), operation, writetreeref, node);
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #24  <Field Map views>
	//    9   19:aload           4
	//   10   21:invokeinterface #125 <Method Object Map.get(Object)>
	//   11   26:checkcast       #30  <Class View>
	//   12   29:aload_1         
	//   13   30:aload_2         
	//   14   31:aload_3         
	//   15   32:invokespecial   #206 <Method List applyOperationToView(View, Operation, WriteTreeRef, Node)>
	//   16   35:areturn         
		obj = ((Object) (new ArrayList()));
	//   17   36:new             #208 <Class ArrayList>
	//   18   39:dup             
	//   19   40:invokespecial   #209 <Method void ArrayList()>
	//   20   43:astore          4
		for(Iterator iterator = views.entrySet().iterator(); iterator.hasNext(); ((List) (obj)).addAll(((Collection) (applyOperationToView((View)((java.util.Map.Entry)iterator.next()).getValue(), operation, writetreeref, node)))));
	//   21   45:aload_0         
	//   22   46:getfield        #24  <Field Map views>
	//   23   49:invokeinterface #213 <Method Set Map.entrySet()>
	//   24   54:invokeinterface #214 <Method Iterator Set.iterator()>
	//   25   59:astore          5
	//   26   61:aload           5
	//   27   63:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//   28   68:ifeq            107
	//   29   71:aload           4
	//   30   73:aload_0         
	//   31   74:aload           5
	//   32   76:invokeinterface #68  <Method Object Iterator.next()>
	//   33   81:checkcast       #216 <Class java.util.Map$Entry>
	//   34   84:invokeinterface #219 <Method Object java.util.Map$Entry.getValue()>
	//   35   89:checkcast       #30  <Class View>
	//   36   92:aload_1         
	//   37   93:aload_2         
	//   38   94:aload_3         
	//   39   95:invokespecial   #206 <Method List applyOperationToView(View, Operation, WriteTreeRef, Node)>
	//   40   98:invokeinterface #223 <Method boolean List.addAll(Collection)>
	//   41  103:pop             
	//*  42  104:goto            61
		return ((List) (obj));
	//   43  107:aload           4
	//   44  109:areturn         
	}

	public Node getCompleteServerCache(Path path)
	{
		for(Iterator iterator = views.values().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Map views>
	//*   2    4:invokeinterface #230 <Method Collection Map.values()>
	//*   3    9:invokeinterface #233 <Method Iterator Collection.iterator()>
	//*   4   14:astore_2        
	//*   5   15:aload_2         
	//*   6   16:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//*   7   21:ifeq            48
		{
			View view = (View)iterator.next();
	//    8   24:aload_2         
	//    9   25:invokeinterface #68  <Method Object Iterator.next()>
	//   10   30:checkcast       #30  <Class View>
	//   11   33:astore_3        
			if(view.getCompleteServerCache(path) != null)
	//*  12   34:aload_3         
	//*  13   35:aload_1         
	//*  14   36:invokevirtual   #235 <Method Node View.getCompleteServerCache(Path)>
	//*  15   39:ifnull          15
				return view.getCompleteServerCache(path);
	//   16   42:aload_3         
	//   17   43:aload_1         
	//   18   44:invokevirtual   #235 <Method Node View.getCompleteServerCache(Path)>
	//   19   47:areturn         
		}

		return null;
	//   20   48:aconst_null     
	//   21   49:areturn         
	}

	public View getCompleteView()
	{
		for(Iterator iterator = views.entrySet().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Map views>
	//*   2    4:invokeinterface #213 <Method Set Map.entrySet()>
	//*   3    9:invokeinterface #214 <Method Iterator Set.iterator()>
	//*   4   14:astore_1        
	//*   5   15:aload_1         
	//*   6   16:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//*   7   21:ifeq            54
		{
			View view = (View)((java.util.Map.Entry)iterator.next()).getValue();
	//    8   24:aload_1         
	//    9   25:invokeinterface #68  <Method Object Iterator.next()>
	//   10   30:checkcast       #216 <Class java.util.Map$Entry>
	//   11   33:invokeinterface #219 <Method Object java.util.Map$Entry.getValue()>
	//   12   38:checkcast       #30  <Class View>
	//   13   41:astore_2        
			if(view.getQuery().loadsAllData())
	//*  14   42:aload_2         
	//*  15   43:invokevirtual   #38  <Method QuerySpec View.getQuery()>
	//*  16   46:invokevirtual   #44  <Method boolean QuerySpec.loadsAllData()>
	//*  17   49:ifeq            15
				return view;
	//   18   52:aload_2         
	//   19   53:areturn         
		}

		return null;
	//   20   54:aconst_null     
	//   21   55:areturn         
	}

	public List getQueryViews()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #208 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #209 <Method void ArrayList()>
	//    3    7:astore_1        
		Iterator iterator = views.entrySet().iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field Map views>
	//    6   12:invokeinterface #213 <Method Set Map.entrySet()>
	//    7   17:invokeinterface #214 <Method Iterator Set.iterator()>
	//    8   22:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   23:aload_2         
	//   10   24:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//   11   29:ifeq            71
			View view = (View)((java.util.Map.Entry)iterator.next()).getValue();
	//   12   32:aload_2         
	//   13   33:invokeinterface #68  <Method Object Iterator.next()>
	//   14   38:checkcast       #216 <Class java.util.Map$Entry>
	//   15   41:invokeinterface #219 <Method Object java.util.Map$Entry.getValue()>
	//   16   46:checkcast       #30  <Class View>
	//   17   49:astore_3        
			if(!view.getQuery().loadsAllData())
	//*  18   50:aload_3         
	//*  19   51:invokevirtual   #38  <Method QuerySpec View.getQuery()>
	//*  20   54:invokevirtual   #44  <Method boolean QuerySpec.loadsAllData()>
	//*  21   57:ifne            23
				((List) (arraylist)).add(((Object) (view)));
	//   22   60:aload_1         
	//   23   61:aload_3         
	//   24   62:invokeinterface #240 <Method boolean List.add(Object)>
	//   25   67:pop             
		} while(true);
	//   26   68:goto            23
		return ((List) (arraylist));
	//   27   71:aload_1         
	//   28   72:areturn         
	}

	Map getViews()
	{
		return views;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Map views>
	//    2    4:areturn         
	}

	public boolean hasCompleteView()
	{
		return getCompleteView() != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #247 <Method View getCompleteView()>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isEmpty()
	{
		return views.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Map views>
	//    2    4:invokeinterface #248 <Method boolean Map.isEmpty()>
	//    3    9:ireturn         
	}

	public Pair removeEventRegistration(QuerySpec queryspec, EventRegistration eventregistration, FirebaseError firebaseerror)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #208 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #209 <Method void ArrayList()>
	//    3    7:astore          5
		ArrayList arraylist1 = new ArrayList();
	//    4    9:new             #208 <Class ArrayList>
	//    5   12:dup             
	//    6   13:invokespecial   #209 <Method void ArrayList()>
	//    7   16:astore          6
		boolean flag = hasCompleteView();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #253 <Method boolean hasCompleteView()>
	//   10   22:istore          4
		if(queryspec.isDefault())
	//*  11   24:aload_1         
	//*  12   25:invokevirtual   #256 <Method boolean QuerySpec.isDefault()>
	//*  13   28:ifeq            134
		{
			Iterator iterator = views.entrySet().iterator();
	//   14   31:aload_0         
	//   15   32:getfield        #24  <Field Map views>
	//   16   35:invokeinterface #213 <Method Set Map.entrySet()>
	//   17   40:invokeinterface #214 <Method Iterator Set.iterator()>
	//   18   45:astore          7
			do
			{
				if(!iterator.hasNext())
					break;
	//   19   47:aload           7
	//   20   49:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//   21   54:ifeq            218
				View view1 = (View)((java.util.Map.Entry)iterator.next()).getValue();
	//   22   57:aload           7
	//   23   59:invokeinterface #68  <Method Object Iterator.next()>
	//   24   64:checkcast       #216 <Class java.util.Map$Entry>
	//   25   67:invokeinterface #219 <Method Object java.util.Map$Entry.getValue()>
	//   26   72:checkcast       #30  <Class View>
	//   27   75:astore          8
				((List) (arraylist1)).addAll(((Collection) (view1.removeEventRegistration(eventregistration, firebaseerror))));
	//   28   77:aload           6
	//   29   79:aload           8
	//   30   81:aload_2         
	//   31   82:aload_3         
	//   32   83:invokevirtual   #259 <Method List View.removeEventRegistration(EventRegistration, FirebaseError)>
	//   33   86:invokeinterface #223 <Method boolean List.addAll(Collection)>
	//   34   91:pop             
				if(view1.isEmpty())
	//*  35   92:aload           8
	//*  36   94:invokevirtual   #260 <Method boolean View.isEmpty()>
	//*  37   97:ifeq            47
				{
					iterator.remove();
	//   38  100:aload           7
	//   39  102:invokeinterface #263 <Method void Iterator.remove()>
					if(!view1.getQuery().loadsAllData())
	//*  40  107:aload           8
	//*  41  109:invokevirtual   #38  <Method QuerySpec View.getQuery()>
	//*  42  112:invokevirtual   #44  <Method boolean QuerySpec.loadsAllData()>
	//*  43  115:ifne            47
						((List) (arraylist)).add(((Object) (view1.getQuery())));
	//   44  118:aload           5
	//   45  120:aload           8
	//   46  122:invokevirtual   #38  <Method QuerySpec View.getQuery()>
	//   47  125:invokeinterface #240 <Method boolean List.add(Object)>
	//   48  130:pop             
				}
			} while(true);
	//   49  131:goto            47
		} else
		{
			View view = (View)views.get(((Object) (queryspec.getParams())));
	//   50  134:aload_0         
	//   51  135:getfield        #24  <Field Map views>
	//   52  138:aload_1         
	//   53  139:invokevirtual   #119 <Method com.firebase.client.core.view.QueryParams QuerySpec.getParams()>
	//   54  142:invokeinterface #125 <Method Object Map.get(Object)>
	//   55  147:checkcast       #30  <Class View>
	//   56  150:astore          7
			if(view != null)
	//*  57  152:aload           7
	//*  58  154:ifnull          218
			{
				((List) (arraylist1)).addAll(((Collection) (view.removeEventRegistration(eventregistration, firebaseerror))));
	//   59  157:aload           6
	//   60  159:aload           7
	//   61  161:aload_2         
	//   62  162:aload_3         
	//   63  163:invokevirtual   #259 <Method List View.removeEventRegistration(EventRegistration, FirebaseError)>
	//   64  166:invokeinterface #223 <Method boolean List.addAll(Collection)>
	//   65  171:pop             
				if(view.isEmpty())
	//*  66  172:aload           7
	//*  67  174:invokevirtual   #260 <Method boolean View.isEmpty()>
	//*  68  177:ifeq            218
				{
					views.remove(((Object) (queryspec.getParams())));
	//   69  180:aload_0         
	//   70  181:getfield        #24  <Field Map views>
	//   71  184:aload_1         
	//   72  185:invokevirtual   #119 <Method com.firebase.client.core.view.QueryParams QuerySpec.getParams()>
	//   73  188:invokeinterface #265 <Method Object Map.remove(Object)>
	//   74  193:pop             
					if(!view.getQuery().loadsAllData())
	//*  75  194:aload           7
	//*  76  196:invokevirtual   #38  <Method QuerySpec View.getQuery()>
	//*  77  199:invokevirtual   #44  <Method boolean QuerySpec.loadsAllData()>
	//*  78  202:ifne            218
						((List) (arraylist)).add(((Object) (view.getQuery())));
	//   79  205:aload           5
	//   80  207:aload           7
	//   81  209:invokevirtual   #38  <Method QuerySpec View.getQuery()>
	//   82  212:invokeinterface #240 <Method boolean List.add(Object)>
	//   83  217:pop             
				}
			}
		}
		if(flag && !hasCompleteView())
	//*  84  218:iload           4
	//*  85  220:ifeq            245
	//*  86  223:aload_0         
	//*  87  224:invokevirtual   #253 <Method boolean hasCompleteView()>
	//*  88  227:ifne            245
			((List) (arraylist)).add(((Object) (QuerySpec.defaultQueryAtPath(queryspec.getPath()))));
	//   89  230:aload           5
	//   90  232:aload_1         
	//   91  233:invokevirtual   #269 <Method Path QuerySpec.getPath()>
	//   92  236:invokestatic    #273 <Method QuerySpec QuerySpec.defaultQueryAtPath(Path)>
	//   93  239:invokeinterface #240 <Method boolean List.add(Object)>
	//   94  244:pop             
		return new Pair(((Object) (arraylist)), ((Object) (arraylist1)));
	//   95  245:new             #275 <Class Pair>
	//   96  248:dup             
	//   97  249:aload           5
	//   98  251:aload           6
	//   99  253:invokespecial   #278 <Method void Pair(Object, Object)>
	//  100  256:areturn         
	}

	public boolean viewExistsForQuery(QuerySpec queryspec)
	{
		return viewForQuery(queryspec) != null;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #285 <Method View viewForQuery(QuerySpec)>
	//    3    5:ifnull          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public View viewForQuery(QuerySpec queryspec)
	{
		if(queryspec.loadsAllData())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #44  <Method boolean QuerySpec.loadsAllData()>
	//*   2    4:ifeq            12
			return getCompleteView();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #247 <Method View getCompleteView()>
	//    5   11:areturn         
		else
			return (View)views.get(((Object) (queryspec.getParams())));
	//    6   12:aload_0         
	//    7   13:getfield        #24  <Field Map views>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #119 <Method com.firebase.client.core.view.QueryParams QuerySpec.getParams()>
	//   10   20:invokeinterface #125 <Method Object Map.get(Object)>
	//   11   25:checkcast       #30  <Class View>
	//   12   28:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private final PersistenceManager persistenceManager;
	private final Map views = new HashMap();

	static 
	{
	//    0    0:return          
	}
}
