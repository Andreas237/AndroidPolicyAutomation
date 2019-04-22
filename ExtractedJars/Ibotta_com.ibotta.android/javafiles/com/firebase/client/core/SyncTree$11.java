// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.collection.ImmutableSortedMap;
import com.firebase.client.core.persistence.PersistenceManager;
import com.firebase.client.core.utilities.ImmutableTree;
import com.firebase.client.core.view.CacheNode;
import com.firebase.client.core.view.QuerySpec;
import com.firebase.client.snapshot.*;
import java.util.*;
import java.util.concurrent.Callable;

// Referenced classes of package com.firebase.client.core:
//			SyncTree, EventRegistration, SyncPoint, Path, 
//			WriteTree

class SyncTree$11
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method List call()>
	//    2    4:areturn         
	}

	public List call()
	{
		QuerySpec queryspec = val$eventRegistration.getQuerySpec();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field EventRegistration val$eventRegistration>
	//    2    4:invokevirtual   #44  <Method QuerySpec EventRegistration.getQuerySpec()>
	//    3    7:astore          10
		Path path = queryspec.getPath();
	//    4    9:aload           10
	//    5   11:invokevirtual   #50  <Method Path QuerySpec.getPath()>
	//    6   14:astore          9
		Object obj2 = ((Object) (SyncTree.access$700(SyncTree.this)));
	//    7   16:aload_0         
	//    8   17:getfield        #26  <Field SyncTree this$0>
	//    9   20:invokestatic    #54  <Method ImmutableTree SyncTree.access$700(SyncTree)>
	//   10   23:astore          7
		Object obj1 = ((Object) (path));
	//   11   25:aload           9
	//   12   27:astore          6
		Object obj = null;
	//   13   29:aconst_null     
	//   14   30:astore          5
		boolean flag = false;
	//   15   32:iconst_0        
	//   16   33:istore_1        
		do
		{
			boolean flag3 = ((ImmutableTree) (obj2)).isEmpty();
	//   17   34:aload           7
	//   18   36:invokevirtual   #60  <Method boolean ImmutableTree.isEmpty()>
	//   19   39:istore          4
			boolean flag2 = true;
	//   20   41:iconst_1        
	//   21   42:istore_3        
			if(flag3)
				break;
	//   22   43:iload           4
	//   23   45:ifne            161
			SyncPoint syncpoint = (SyncPoint)((ImmutableTree) (obj2)).getValue();
	//   24   48:aload           7
	//   25   50:invokevirtual   #63  <Method Object ImmutableTree.getValue()>
	//   26   53:checkcast       #65  <Class SyncPoint>
	//   27   56:astore          11
			boolean flag1 = flag;
	//   28   58:iload_1         
	//   29   59:istore_2        
			Object obj3 = obj;
	//   30   60:aload           5
	//   31   62:astore          8
			if(syncpoint != null)
	//*  32   64:aload           11
	//*  33   66:ifnull          111
			{
				if(obj == null)
	//*  34   69:aload           5
	//*  35   71:ifnull          77
	//*  36   74:goto            86
					obj = ((Object) (syncpoint.getCompleteServerCache(((Path) (obj1)))));
	//   37   77:aload           11
	//   38   79:aload           6
	//   39   81:invokevirtual   #69  <Method Node SyncPoint.getCompleteServerCache(Path)>
	//   40   84:astore          5
				flag1 = flag2;
	//   41   86:iload_3         
	//   42   87:istore_2        
				if(!flag)
	//*  43   88:iload_1         
	//*  44   89:ifne            107
					if(syncpoint.hasCompleteView())
	//*  45   92:aload           11
	//*  46   94:invokevirtual   #72  <Method boolean SyncPoint.hasCompleteView()>
	//*  47   97:ifeq            105
						flag1 = flag2;
	//   48  100:iload_3         
	//   49  101:istore_2        
					else
	//*  50  102:goto            107
						flag1 = false;
	//   51  105:iconst_0        
	//   52  106:istore_2        
				obj3 = obj;
	//   53  107:aload           5
	//   54  109:astore          8
			}
			if(((Path) (obj1)).isEmpty())
	//*  55  111:aload           6
	//*  56  113:invokevirtual   #75  <Method boolean Path.isEmpty()>
	//*  57  116:ifeq            129
				obj = ((Object) (ChildKey.fromString("")));
	//   58  119:ldc1            #77  <String "">
	//   59  121:invokestatic    #83  <Method ChildKey ChildKey.fromString(String)>
	//   60  124:astore          5
			else
	//*  61  126:goto            136
				obj = ((Object) (((Path) (obj1)).getFront()));
	//   62  129:aload           6
	//   63  131:invokevirtual   #87  <Method ChildKey Path.getFront()>
	//   64  134:astore          5
			obj2 = ((Object) (((ImmutableTree) (obj2)).getChild(((ChildKey) (obj)))));
	//   65  136:aload           7
	//   66  138:aload           5
	//   67  140:invokevirtual   #91  <Method ImmutableTree ImmutableTree.getChild(ChildKey)>
	//   68  143:astore          7
			obj1 = ((Object) (((Path) (obj1)).popFront()));
	//   69  145:aload           6
	//   70  147:invokevirtual   #94  <Method Path Path.popFront()>
	//   71  150:astore          6
			flag = flag1;
	//   72  152:iload_2         
	//   73  153:istore_1        
			obj = obj3;
	//   74  154:aload           8
	//   75  156:astore          5
		} while(true);
	//   76  158:goto            34
		obj1 = ((Object) ((SyncPoint)SyncTree.access$700(SyncTree.this).get(path)));
	//   77  161:aload_0         
	//   78  162:getfield        #26  <Field SyncTree this$0>
	//   79  165:invokestatic    #54  <Method ImmutableTree SyncTree.access$700(SyncTree)>
	//   80  168:aload           9
	//   81  170:invokevirtual   #98  <Method Object ImmutableTree.get(Path)>
	//   82  173:checkcast       #65  <Class SyncPoint>
	//   83  176:astore          6
		if(obj1 == null)
	//*  84  178:aload           6
	//*  85  180:ifnonnull       226
		{
			obj1 = ((Object) (new SyncPoint(SyncTree.access$200(SyncTree.this))));
	//   86  183:new             #65  <Class SyncPoint>
	//   87  186:dup             
	//   88  187:aload_0         
	//   89  188:getfield        #26  <Field SyncTree this$0>
	//   90  191:invokestatic    #102 <Method PersistenceManager SyncTree.access$200(SyncTree)>
	//   91  194:invokespecial   #105 <Method void SyncPoint(PersistenceManager)>
	//   92  197:astore          6
			obj2 = ((Object) (SyncTree.this));
	//   93  199:aload_0         
	//   94  200:getfield        #26  <Field SyncTree this$0>
	//   95  203:astore          7
			SyncTree.access$702(((SyncTree) (obj2)), SyncTree.access$700(((SyncTree) (obj2))).set(path, obj1));
	//   96  205:aload           7
	//   97  207:aload           7
	//   98  209:invokestatic    #54  <Method ImmutableTree SyncTree.access$700(SyncTree)>
	//   99  212:aload           9
	//  100  214:aload           6
	//  101  216:invokevirtual   #109 <Method ImmutableTree ImmutableTree.set(Path, Object)>
	//  102  219:invokestatic    #113 <Method ImmutableTree SyncTree.access$702(SyncTree, ImmutableTree)>
	//  103  222:pop             
		} else
	//* 104  223:goto            266
		{
			if(!flag && !((SyncPoint) (obj1)).hasCompleteView())
	//* 105  226:iload_1         
	//* 106  227:ifne            246
	//* 107  230:aload           6
	//* 108  232:invokevirtual   #72  <Method boolean SyncPoint.hasCompleteView()>
	//* 109  235:ifeq            241
	//* 110  238:goto            246
				flag = false;
	//  111  241:iconst_0        
	//  112  242:istore_1        
			else
	//* 113  243:goto            248
				flag = true;
	//  114  246:iconst_1        
	//  115  247:istore_1        
			if(obj == null)
	//* 116  248:aload           5
	//* 117  250:ifnull          256
	//* 118  253:goto            266
				obj = ((Object) (((SyncPoint) (obj1)).getCompleteServerCache(Path.getEmptyPath())));
	//  119  256:aload           6
	//  120  258:invokestatic    #116 <Method Path Path.getEmptyPath()>
	//  121  261:invokevirtual   #69  <Method Node SyncPoint.getCompleteServerCache(Path)>
	//  122  264:astore          5
		}
		SyncTree.access$200(SyncTree.this).setQueryActive(queryspec);
	//  123  266:aload_0         
	//  124  267:getfield        #26  <Field SyncTree this$0>
	//  125  270:invokestatic    #102 <Method PersistenceManager SyncTree.access$200(SyncTree)>
	//  126  273:aload           10
	//  127  275:invokeinterface #122 <Method void PersistenceManager.setQueryActive(QuerySpec)>
		if(obj != null)
	//* 128  280:aload           5
	//* 129  282:ifnull          309
		{
			obj = ((Object) (new CacheNode(IndexedNode.from(((Node) (obj)), queryspec.getIndex()), true, false)));
	//  130  285:new             #124 <Class CacheNode>
	//  131  288:dup             
	//  132  289:aload           5
	//  133  291:aload           10
	//  134  293:invokevirtual   #128 <Method com.firebase.client.snapshot.Index QuerySpec.getIndex()>
	//  135  296:invokestatic    #134 <Method IndexedNode IndexedNode.from(Node, com.firebase.client.snapshot.Index)>
	//  136  299:iconst_1        
	//  137  300:iconst_0        
	//  138  301:invokespecial   #137 <Method void CacheNode(IndexedNode, boolean, boolean)>
	//  139  304:astore          5
		} else
	//* 140  306:goto            541
		{
			obj2 = ((Object) (SyncTree.access$200(SyncTree.this).serverCache(queryspec)));
	//  141  309:aload_0         
	//  142  310:getfield        #26  <Field SyncTree this$0>
	//  143  313:invokestatic    #102 <Method PersistenceManager SyncTree.access$200(SyncTree)>
	//  144  316:aload           10
	//  145  318:invokeinterface #141 <Method CacheNode PersistenceManager.serverCache(QuerySpec)>
	//  146  323:astore          7
			if(((CacheNode) (obj2)).isFullyInitialized())
	//* 147  325:aload           7
	//* 148  327:invokevirtual   #144 <Method boolean CacheNode.isFullyInitialized()>
	//* 149  330:ifeq            340
			{
				obj = obj2;
	//  150  333:aload           7
	//  151  335:astore          5
			} else
	//* 152  337:goto            541
			{
				obj = ((Object) (EmptyNode.Empty()));
	//  153  340:invokestatic    #150 <Method EmptyNode EmptyNode.Empty()>
	//  154  343:astore          5
				Iterator iterator = SyncTree.access$700(SyncTree.this).subtree(path).getChildren().iterator();
	//  155  345:aload_0         
	//  156  346:getfield        #26  <Field SyncTree this$0>
	//  157  349:invokestatic    #54  <Method ImmutableTree SyncTree.access$700(SyncTree)>
	//  158  352:aload           9
	//  159  354:invokevirtual   #154 <Method ImmutableTree ImmutableTree.subtree(Path)>
	//  160  357:invokevirtual   #158 <Method ImmutableSortedMap ImmutableTree.getChildren()>
	//  161  360:invokevirtual   #164 <Method Iterator ImmutableSortedMap.iterator()>
	//  162  363:astore          8
				do
				{
					if(!iterator.hasNext())
						break;
	//  163  365:aload           8
	//  164  367:invokeinterface #169 <Method boolean Iterator.hasNext()>
	//  165  372:ifeq            449
					java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//  166  375:aload           8
	//  167  377:invokeinterface #172 <Method Object Iterator.next()>
	//  168  382:checkcast       #174 <Class java.util.Map$Entry>
	//  169  385:astore          11
					Object obj4 = ((Object) ((SyncPoint)((ImmutableTree)entry.getValue()).getValue()));
	//  170  387:aload           11
	//  171  389:invokeinterface #175 <Method Object java.util.Map$Entry.getValue()>
	//  172  394:checkcast       #56  <Class ImmutableTree>
	//  173  397:invokevirtual   #63  <Method Object ImmutableTree.getValue()>
	//  174  400:checkcast       #65  <Class SyncPoint>
	//  175  403:astore          12
					if(obj4 != null)
	//* 176  405:aload           12
	//* 177  407:ifnull          365
					{
						obj4 = ((Object) (((SyncPoint) (obj4)).getCompleteServerCache(Path.getEmptyPath())));
	//  178  410:aload           12
	//  179  412:invokestatic    #116 <Method Path Path.getEmptyPath()>
	//  180  415:invokevirtual   #69  <Method Node SyncPoint.getCompleteServerCache(Path)>
	//  181  418:astore          12
						if(obj4 != null)
	//* 182  420:aload           12
	//* 183  422:ifnull          365
							obj = ((Object) (((Node) (obj)).updateImmediateChild((ChildKey)entry.getKey(), ((Node) (obj4)))));
	//  184  425:aload           5
	//  185  427:aload           11
	//  186  429:invokeinterface #178 <Method Object java.util.Map$Entry.getKey()>
	//  187  434:checkcast       #79  <Class ChildKey>
	//  188  437:aload           12
	//  189  439:invokeinterface #184 <Method Node Node.updateImmediateChild(ChildKey, Node)>
	//  190  444:astore          5
					}
				} while(true);
	//  191  446:goto            365
				obj2 = ((Object) (((CacheNode) (obj2)).getNode().iterator()));
	//  192  449:aload           7
	//  193  451:invokevirtual   #188 <Method Node CacheNode.getNode()>
	//  194  454:invokeinterface #189 <Method Iterator Node.iterator()>
	//  195  459:astore          7
				do
				{
					if(!((Iterator) (obj2)).hasNext())
						break;
	//  196  461:aload           7
	//  197  463:invokeinterface #169 <Method boolean Iterator.hasNext()>
	//  198  468:ifeq            520
					NamedNode namednode = (NamedNode)((Iterator) (obj2)).next();
	//  199  471:aload           7
	//  200  473:invokeinterface #172 <Method Object Iterator.next()>
	//  201  478:checkcast       #191 <Class NamedNode>
	//  202  481:astore          8
					if(!((Node) (obj)).hasChild(namednode.getName()))
	//* 203  483:aload           5
	//* 204  485:aload           8
	//* 205  487:invokevirtual   #194 <Method ChildKey NamedNode.getName()>
	//* 206  490:invokeinterface #198 <Method boolean Node.hasChild(ChildKey)>
	//* 207  495:ifne            461
						obj = ((Object) (((Node) (obj)).updateImmediateChild(namednode.getName(), namednode.getNode())));
	//  208  498:aload           5
	//  209  500:aload           8
	//  210  502:invokevirtual   #194 <Method ChildKey NamedNode.getName()>
	//  211  505:aload           8
	//  212  507:invokevirtual   #199 <Method Node NamedNode.getNode()>
	//  213  510:invokeinterface #184 <Method Node Node.updateImmediateChild(ChildKey, Node)>
	//  214  515:astore          5
				} while(true);
	//  215  517:goto            461
				obj = ((Object) (new CacheNode(IndexedNode.from(((Node) (obj)), queryspec.getIndex()), false, false)));
	//  216  520:new             #124 <Class CacheNode>
	//  217  523:dup             
	//  218  524:aload           5
	//  219  526:aload           10
	//  220  528:invokevirtual   #128 <Method com.firebase.client.snapshot.Index QuerySpec.getIndex()>
	//  221  531:invokestatic    #134 <Method IndexedNode IndexedNode.from(Node, com.firebase.client.snapshot.Index)>
	//  222  534:iconst_0        
	//  223  535:iconst_0        
	//  224  536:invokespecial   #137 <Method void CacheNode(IndexedNode, boolean, boolean)>
	//  225  539:astore          5
			}
		}
		boolean flag4 = ((SyncPoint) (obj1)).viewExistsForQuery(queryspec);
	//  226  541:aload           6
	//  227  543:aload           10
	//  228  545:invokevirtual   #203 <Method boolean SyncPoint.viewExistsForQuery(QuerySpec)>
	//  229  548:istore          4
		if(!flag4 && !queryspec.loadsAllData())
	//* 230  550:iload           4
	//* 231  552:ifne            606
	//* 232  555:aload           10
	//* 233  557:invokevirtual   #206 <Method boolean QuerySpec.loadsAllData()>
	//* 234  560:ifne            606
		{
			obj2 = ((Object) (SyncTree.access$900(SyncTree.this)));
	//  235  563:aload_0         
	//  236  564:getfield        #26  <Field SyncTree this$0>
	//  237  567:invokestatic    #210 <Method Tag SyncTree.access$900(SyncTree)>
	//  238  570:astore          7
			SyncTree.access$800(SyncTree.this).put(((Object) (queryspec)), obj2);
	//  239  572:aload_0         
	//  240  573:getfield        #26  <Field SyncTree this$0>
	//  241  576:invokestatic    #214 <Method Map SyncTree.access$800(SyncTree)>
	//  242  579:aload           10
	//  243  581:aload           7
	//  244  583:invokeinterface #220 <Method Object Map.put(Object, Object)>
	//  245  588:pop             
			SyncTree.access$1000(SyncTree.this).put(obj2, ((Object) (queryspec)));
	//  246  589:aload_0         
	//  247  590:getfield        #26  <Field SyncTree this$0>
	//  248  593:invokestatic    #223 <Method Map SyncTree.access$1000(SyncTree)>
	//  249  596:aload           7
	//  250  598:aload           10
	//  251  600:invokeinterface #220 <Method Object Map.put(Object, Object)>
	//  252  605:pop             
		}
		obj2 = ((Object) (SyncTree.access$300(SyncTree.this).childWrites(path)));
	//  253  606:aload_0         
	//  254  607:getfield        #26  <Field SyncTree this$0>
	//  255  610:invokestatic    #227 <Method WriteTree SyncTree.access$300(SyncTree)>
	//  256  613:aload           9
	//  257  615:invokevirtual   #233 <Method WriteTreeRef WriteTree.childWrites(Path)>
	//  258  618:astore          7
		obj = ((Object) (((SyncPoint) (obj1)).addEventRegistration(val$eventRegistration, ((WriteTreeRef) (obj2)), ((CacheNode) (obj)))));
	//  259  620:aload           6
	//  260  622:aload_0         
	//  261  623:getfield        #28  <Field EventRegistration val$eventRegistration>
	//  262  626:aload           7
	//  263  628:aload           5
	//  264  630:invokevirtual   #236 <Method List SyncPoint.addEventRegistration(EventRegistration, WriteTreeRef, CacheNode)>
	//  265  633:astore          5
		if(!flag4 && !flag)
	//* 266  635:iload           4
	//* 267  637:ifne            664
	//* 268  640:iload_1         
	//* 269  641:ifne            664
		{
			obj1 = ((Object) (((SyncPoint) (obj1)).viewForQuery(queryspec)));
	//  270  644:aload           6
	//  271  646:aload           10
	//  272  648:invokevirtual   #240 <Method com.firebase.client.core.view.View SyncPoint.viewForQuery(QuerySpec)>
	//  273  651:astore          6
			SyncTree.access$1100(SyncTree.this, queryspec, ((com.firebase.client.core.view.View) (obj1)));
	//  274  653:aload_0         
	//  275  654:getfield        #26  <Field SyncTree this$0>
	//  276  657:aload           10
	//  277  659:aload           6
	//  278  661:invokestatic    #244 <Method void SyncTree.access$1100(SyncTree, QuerySpec, com.firebase.client.core.view.View)>
		}
		return ((List) (obj));
	//  279  664:aload           5
	//  280  666:areturn         
	}

	static final boolean $assertionsDisabled = false;
	final SyncTree this$0;
	final EventRegistration val$eventRegistration;

	static 
	{
	//    0    0:return          
	}

	SyncTree$11()
	{
		this$0 = final_synctree;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field SyncTree this$0>
		val$eventRegistration = EventRegistration.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field EventRegistration val$eventRegistration>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #30  <Method void Object()>
	//    8   14:return          
	}
}
