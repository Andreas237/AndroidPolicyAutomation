// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view.filter;

import com.firebase.client.core.Path;
import com.firebase.client.core.view.Change;
import com.firebase.client.core.view.QueryParams;
import com.firebase.client.snapshot.*;
import java.util.Iterator;

// Referenced classes of package com.firebase.client.core.view.filter:
//			NodeFilter, RangedFilter, ChildChangeAccumulator

public class LimitedFilter
	implements NodeFilter
{

	public LimitedFilter(QueryParams queryparams)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		rangedFilter = new RangedFilter(queryparams);
	//    2    4:aload_0         
	//    3    5:new             #25  <Class RangedFilter>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #27  <Method void RangedFilter(QueryParams)>
	//    7   13:putfield        #29  <Field RangedFilter rangedFilter>
		index = queryparams.getIndex();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #35  <Method Index QueryParams.getIndex()>
	//   11   21:putfield        #37  <Field Index index>
		limit = queryparams.getLimit();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #41  <Method int QueryParams.getLimit()>
	//   15   29:putfield        #43  <Field int limit>
		reverse = queryparams.isViewFromLeft() ^ true;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #47  <Method boolean QueryParams.isViewFromLeft()>
	//   19   37:iconst_1        
	//   20   38:ixor            
	//   21   39:putfield        #49  <Field boolean reverse>
	//   22   42:return          
	}

	private IndexedNode fullLimitUpdateChild(IndexedNode indexednode, ChildKey childkey, Node node, NodeFilter.CompleteChildSource completechildsource, ChildChangeAccumulator childchangeaccumulator)
	{
		NamedNode namednode1 = new NamedNode(childkey, node);
	//    0    0:new             #53  <Class NamedNode>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:invokespecial   #56  <Method void NamedNode(ChildKey, Node)>
	//    5    9:astore          10
		NamedNode namednode;
		if(reverse)
	//*   6   11:aload_0         
	//*   7   12:getfield        #49  <Field boolean reverse>
	//*   8   15:ifeq            27
			namednode = indexednode.getFirstChild();
	//    9   18:aload_1         
	//   10   19:invokevirtual   #62  <Method NamedNode IndexedNode.getFirstChild()>
	//   11   22:astore          9
		else
	//*  12   24:goto            33
			namednode = indexednode.getLastChild();
	//   13   27:aload_1         
	//   14   28:invokevirtual   #65  <Method NamedNode IndexedNode.getLastChild()>
	//   15   31:astore          9
		boolean flag2 = rangedFilter.matches(namednode1);
	//   16   33:aload_0         
	//   17   34:getfield        #29  <Field RangedFilter rangedFilter>
	//   18   37:aload           10
	//   19   39:invokevirtual   #69  <Method boolean RangedFilter.matches(NamedNode)>
	//   20   42:istore          8
		if(indexednode.getNode().hasChild(childkey))
	//*  21   44:aload_1         
	//*  22   45:invokevirtual   #73  <Method Node IndexedNode.getNode()>
	//*  23   48:aload_2         
	//*  24   49:invokeinterface #79  <Method boolean Node.hasChild(ChildKey)>
	//*  25   54:ifeq            329
		{
			Node node1 = indexednode.getNode().getImmediateChild(childkey);
	//   26   57:aload_1         
	//   27   58:invokevirtual   #73  <Method Node IndexedNode.getNode()>
	//   28   61:aload_2         
	//   29   62:invokeinterface #83  <Method Node Node.getImmediateChild(ChildKey)>
	//   30   67:astore          11
			for(namednode = completechildsource.getChildAfterChild(index, namednode, reverse); namednode != null && (namednode.getName().equals(((Object) (childkey))) || indexednode.getNode().hasChild(namednode.getName())); namednode = completechildsource.getChildAfterChild(index, namednode, reverse));
	//   31   69:aload           4
	//   32   71:aload_0         
	//   33   72:getfield        #37  <Field Index index>
	//   34   75:aload           9
	//   35   77:aload_0         
	//   36   78:getfield        #49  <Field boolean reverse>
	//   37   81:invokeinterface #89  <Method NamedNode NodeFilter$CompleteChildSource.getChildAfterChild(Index, NamedNode, boolean)>
	//   38   86:astore          9
	//   39   88:aload           9
	//   40   90:ifnull          144
	//   41   93:aload           9
	//   42   95:invokevirtual   #93  <Method ChildKey NamedNode.getName()>
	//   43   98:aload_2         
	//   44   99:invokevirtual   #99  <Method boolean ChildKey.equals(Object)>
	//   45  102:ifne            122
	//   46  105:aload_1         
	//   47  106:invokevirtual   #73  <Method Node IndexedNode.getNode()>
	//   48  109:aload           9
	//   49  111:invokevirtual   #93  <Method ChildKey NamedNode.getName()>
	//   50  114:invokeinterface #79  <Method boolean Node.hasChild(ChildKey)>
	//   51  119:ifeq            144
	//   52  122:aload           4
	//   53  124:aload_0         
	//   54  125:getfield        #37  <Field Index index>
	//   55  128:aload           9
	//   56  130:aload_0         
	//   57  131:getfield        #49  <Field boolean reverse>
	//   58  134:invokeinterface #89  <Method NamedNode NodeFilter$CompleteChildSource.getChildAfterChild(Index, NamedNode, boolean)>
	//   59  139:astore          9
	//*  60  141:goto            88
			boolean flag1 = true;
	//   61  144:iconst_1        
	//   62  145:istore          7
			int i;
			if(namednode == null)
	//*  63  147:aload           9
	//*  64  149:ifnonnull       158
				i = 1;
	//   65  152:iconst_1        
	//   66  153:istore          6
			else
	//*  67  155:goto            175
				i = index.compare(namednode, namednode1, reverse);
	//   68  158:aload_0         
	//   69  159:getfield        #37  <Field Index index>
	//   70  162:aload           9
	//   71  164:aload           10
	//   72  166:aload_0         
	//   73  167:getfield        #49  <Field boolean reverse>
	//   74  170:invokevirtual   #105 <Method int Index.compare(NamedNode, NamedNode, boolean)>
	//   75  173:istore          6
			boolean flag;
			if(flag2 && !node.isEmpty() && i >= 0)
	//*  76  175:iload           8
	//*  77  177:ifeq            200
	//*  78  180:aload_3         
	//*  79  181:invokeinterface #108 <Method boolean Node.isEmpty()>
	//*  80  186:ifne            200
	//*  81  189:iload           6
	//*  82  191:iflt            200
				flag = true;
	//   83  194:iconst_1        
	//   84  195:istore          6
			else
	//*  85  197:goto            203
				flag = false;
	//   86  200:iconst_0        
	//   87  201:istore          6
			if(flag)
	//*  88  203:iload           6
	//*  89  205:ifeq            232
			{
				if(childchangeaccumulator != null)
	//*  90  208:aload           5
	//*  91  210:ifnull          225
					childchangeaccumulator.trackChildChange(Change.childChangedChange(childkey, node, node1));
	//   92  213:aload           5
	//   93  215:aload_2         
	//   94  216:aload_3         
	//   95  217:aload           11
	//   96  219:invokestatic    #114 <Method Change Change.childChangedChange(ChildKey, Node, Node)>
	//   97  222:invokevirtual   #120 <Method void ChildChangeAccumulator.trackChildChange(Change)>
				return indexednode.updateChild(childkey, node);
	//   98  225:aload_1         
	//   99  226:aload_2         
	//  100  227:aload_3         
	//  101  228:invokevirtual   #124 <Method IndexedNode IndexedNode.updateChild(ChildKey, Node)>
	//  102  231:areturn         
			}
			if(childchangeaccumulator != null)
	//* 103  232:aload           5
	//* 104  234:ifnull          248
				childchangeaccumulator.trackChildChange(Change.childRemovedChange(childkey, node1));
	//  105  237:aload           5
	//  106  239:aload_2         
	//  107  240:aload           11
	//  108  242:invokestatic    #128 <Method Change Change.childRemovedChange(ChildKey, Node)>
	//  109  245:invokevirtual   #120 <Method void ChildChangeAccumulator.trackChildChange(Change)>
			indexednode = indexednode.updateChild(childkey, ((Node) (EmptyNode.Empty())));
	//  110  248:aload_1         
	//  111  249:aload_2         
	//  112  250:invokestatic    #134 <Method EmptyNode EmptyNode.Empty()>
	//  113  253:invokevirtual   #124 <Method IndexedNode IndexedNode.updateChild(ChildKey, Node)>
	//  114  256:astore_1        
			if(namednode != null && rangedFilter.matches(namednode))
	//* 115  257:aload           9
	//* 116  259:ifnull          281
	//* 117  262:aload_0         
	//* 118  263:getfield        #29  <Field RangedFilter rangedFilter>
	//* 119  266:aload           9
	//* 120  268:invokevirtual   #69  <Method boolean RangedFilter.matches(NamedNode)>
	//* 121  271:ifeq            281
				flag = flag1;
	//  122  274:iload           7
	//  123  276:istore          6
			else
	//* 124  278:goto            284
				flag = false;
	//  125  281:iconst_0        
	//  126  282:istore          6
			if(flag)
	//* 127  284:iload           6
	//* 128  286:ifeq            327
			{
				if(childchangeaccumulator != null)
	//* 129  289:aload           5
	//* 130  291:ifnull          312
					childchangeaccumulator.trackChildChange(Change.childAddedChange(namednode.getName(), namednode.getNode()));
	//  131  294:aload           5
	//  132  296:aload           9
	//  133  298:invokevirtual   #93  <Method ChildKey NamedNode.getName()>
	//  134  301:aload           9
	//  135  303:invokevirtual   #135 <Method Node NamedNode.getNode()>
	//  136  306:invokestatic    #138 <Method Change Change.childAddedChange(ChildKey, Node)>
	//  137  309:invokevirtual   #120 <Method void ChildChangeAccumulator.trackChildChange(Change)>
				return indexednode.updateChild(namednode.getName(), namednode.getNode());
	//  138  312:aload_1         
	//  139  313:aload           9
	//  140  315:invokevirtual   #93  <Method ChildKey NamedNode.getName()>
	//  141  318:aload           9
	//  142  320:invokevirtual   #135 <Method Node NamedNode.getNode()>
	//  143  323:invokevirtual   #124 <Method IndexedNode IndexedNode.updateChild(ChildKey, Node)>
	//  144  326:areturn         
			} else
			{
				return indexednode;
	//  145  327:aload_1         
	//  146  328:areturn         
			}
		}
		if(node.isEmpty())
	//* 147  329:aload_3         
	//* 148  330:invokeinterface #108 <Method boolean Node.isEmpty()>
	//* 149  335:ifeq            340
			return indexednode;
	//  150  338:aload_1         
	//  151  339:areturn         
		if(flag2)
	//* 152  340:iload           8
	//* 153  342:ifeq            416
		{
			if(index.compare(namednode, namednode1, reverse) >= 0)
	//* 154  345:aload_0         
	//* 155  346:getfield        #37  <Field Index index>
	//* 156  349:aload           9
	//* 157  351:aload           10
	//* 158  353:aload_0         
	//* 159  354:getfield        #49  <Field boolean reverse>
	//* 160  357:invokevirtual   #105 <Method int Index.compare(NamedNode, NamedNode, boolean)>
	//* 161  360:iflt            414
			{
				if(childchangeaccumulator != null)
	//* 162  363:aload           5
	//* 163  365:ifnull          396
				{
					childchangeaccumulator.trackChildChange(Change.childRemovedChange(namednode.getName(), namednode.getNode()));
	//  164  368:aload           5
	//  165  370:aload           9
	//  166  372:invokevirtual   #93  <Method ChildKey NamedNode.getName()>
	//  167  375:aload           9
	//  168  377:invokevirtual   #135 <Method Node NamedNode.getNode()>
	//  169  380:invokestatic    #128 <Method Change Change.childRemovedChange(ChildKey, Node)>
	//  170  383:invokevirtual   #120 <Method void ChildChangeAccumulator.trackChildChange(Change)>
					childchangeaccumulator.trackChildChange(Change.childAddedChange(childkey, node));
	//  171  386:aload           5
	//  172  388:aload_2         
	//  173  389:aload_3         
	//  174  390:invokestatic    #138 <Method Change Change.childAddedChange(ChildKey, Node)>
	//  175  393:invokevirtual   #120 <Method void ChildChangeAccumulator.trackChildChange(Change)>
				}
				return indexednode.updateChild(childkey, node).updateChild(namednode.getName(), ((Node) (EmptyNode.Empty())));
	//  176  396:aload_1         
	//  177  397:aload_2         
	//  178  398:aload_3         
	//  179  399:invokevirtual   #124 <Method IndexedNode IndexedNode.updateChild(ChildKey, Node)>
	//  180  402:aload           9
	//  181  404:invokevirtual   #93  <Method ChildKey NamedNode.getName()>
	//  182  407:invokestatic    #134 <Method EmptyNode EmptyNode.Empty()>
	//  183  410:invokevirtual   #124 <Method IndexedNode IndexedNode.updateChild(ChildKey, Node)>
	//  184  413:areturn         
			} else
			{
				return indexednode;
	//  185  414:aload_1         
	//  186  415:areturn         
			}
		} else
		{
			return indexednode;
	//  187  416:aload_1         
	//  188  417:areturn         
		}
	}

	public boolean filtersNodes()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public Index getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Index index>
	//    2    4:areturn         
	}

	public NodeFilter getIndexedFilter()
	{
		return rangedFilter.getIndexedFilter();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field RangedFilter rangedFilter>
	//    2    4:invokevirtual   #143 <Method NodeFilter RangedFilter.getIndexedFilter()>
	//    3    7:areturn         
	}

	public IndexedNode updateChild(IndexedNode indexednode, ChildKey childkey, Node node, Path path, NodeFilter.CompleteChildSource completechildsource, ChildChangeAccumulator childchangeaccumulator)
	{
		if(!rangedFilter.matches(new NamedNode(childkey, node)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field RangedFilter rangedFilter>
	//*   2    4:new             #53  <Class NamedNode>
	//*   3    7:dup             
	//*   4    8:aload_2         
	//*   5    9:aload_3         
	//*   6   10:invokespecial   #56  <Method void NamedNode(ChildKey, Node)>
	//*   7   13:invokevirtual   #69  <Method boolean RangedFilter.matches(NamedNode)>
	//*   8   16:ifne            26
			node = ((Node) (EmptyNode.Empty()));
	//    9   19:invokestatic    #134 <Method EmptyNode EmptyNode.Empty()>
	//   10   22:astore_3        
	//*  11   23:goto            26
		if(((Object) (indexednode.getNode().getImmediateChild(childkey))).equals(((Object) (node))))
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #73  <Method Node IndexedNode.getNode()>
	//*  14   30:aload_2         
	//*  15   31:invokeinterface #83  <Method Node Node.getImmediateChild(ChildKey)>
	//*  16   36:aload_3         
	//*  17   37:invokevirtual   #145 <Method boolean Object.equals(Object)>
	//*  18   40:ifeq            45
			return indexednode;
	//   19   43:aload_1         
	//   20   44:areturn         
		if(indexednode.getNode().getChildCount() < limit)
	//*  21   45:aload_1         
	//*  22   46:invokevirtual   #73  <Method Node IndexedNode.getNode()>
	//*  23   49:invokeinterface #148 <Method int Node.getChildCount()>
	//*  24   54:aload_0         
	//*  25   55:getfield        #43  <Field int limit>
	//*  26   58:icmpge          83
			return rangedFilter.getIndexedFilter().updateChild(indexednode, childkey, node, path, completechildsource, childchangeaccumulator);
	//   27   61:aload_0         
	//   28   62:getfield        #29  <Field RangedFilter rangedFilter>
	//   29   65:invokevirtual   #143 <Method NodeFilter RangedFilter.getIndexedFilter()>
	//   30   68:aload_1         
	//   31   69:aload_2         
	//   32   70:aload_3         
	//   33   71:aload           4
	//   34   73:aload           5
	//   35   75:aload           6
	//   36   77:invokeinterface #150 <Method IndexedNode NodeFilter.updateChild(IndexedNode, ChildKey, Node, Path, NodeFilter$CompleteChildSource, ChildChangeAccumulator)>
	//   37   82:areturn         
		else
			return fullLimitUpdateChild(indexednode, childkey, node, completechildsource, childchangeaccumulator);
	//   38   83:aload_0         
	//   39   84:aload_1         
	//   40   85:aload_2         
	//   41   86:aload_3         
	//   42   87:aload           5
	//   43   89:aload           6
	//   44   91:invokespecial   #152 <Method IndexedNode fullLimitUpdateChild(IndexedNode, ChildKey, Node, NodeFilter$CompleteChildSource, ChildChangeAccumulator)>
	//   45   94:areturn         
	}

	public IndexedNode updateFullNode(IndexedNode indexednode, IndexedNode indexednode1, ChildChangeAccumulator childchangeaccumulator)
	{
		Object obj;
		if(!indexednode1.getNode().isLeafNode() && !indexednode1.getNode().isEmpty())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #73  <Method Node IndexedNode.getNode()>
	//*   2    4:invokeinterface #157 <Method boolean Node.isLeafNode()>
	//*   3    9:ifne            245
	//*   4   12:aload_2         
	//*   5   13:invokevirtual   #73  <Method Node IndexedNode.getNode()>
	//*   6   16:invokeinterface #108 <Method boolean Node.isEmpty()>
	//*   7   21:ifeq            27
	//*   8   24:goto            245
		{
			obj = ((Object) (indexednode1.updatePriority(PriorityUtilities.NullPriority())));
	//    9   27:aload_2         
	//   10   28:invokestatic    #162 <Method Node PriorityUtilities.NullPriority()>
	//   11   31:invokevirtual   #166 <Method IndexedNode IndexedNode.updatePriority(Node)>
	//   12   34:astore          11
			byte byte0;
			NamedNode namednode;
			NamedNode namednode1;
			Iterator iterator;
			if(reverse)
	//*  13   36:aload_0         
	//*  14   37:getfield        #49  <Field boolean reverse>
	//*  15   40:ifeq            73
			{
				iterator = indexednode1.reverseIterator();
	//   16   43:aload_2         
	//   17   44:invokevirtual   #170 <Method Iterator IndexedNode.reverseIterator()>
	//   18   47:astore          10
				namednode = rangedFilter.getEndPost();
	//   19   49:aload_0         
	//   20   50:getfield        #29  <Field RangedFilter rangedFilter>
	//   21   53:invokevirtual   #173 <Method NamedNode RangedFilter.getEndPost()>
	//   22   56:astore          8
				namednode1 = rangedFilter.getStartPost();
	//   23   58:aload_0         
	//   24   59:getfield        #29  <Field RangedFilter rangedFilter>
	//   25   62:invokevirtual   #176 <Method NamedNode RangedFilter.getStartPost()>
	//   26   65:astore          9
				byte0 = -1;
	//   27   67:iconst_m1       
	//   28   68:istore          4
			} else
	//*  29   70:goto            100
			{
				iterator = indexednode1.iterator();
	//   30   73:aload_2         
	//   31   74:invokevirtual   #179 <Method Iterator IndexedNode.iterator()>
	//   32   77:astore          10
				namednode = rangedFilter.getStartPost();
	//   33   79:aload_0         
	//   34   80:getfield        #29  <Field RangedFilter rangedFilter>
	//   35   83:invokevirtual   #176 <Method NamedNode RangedFilter.getStartPost()>
	//   36   86:astore          8
				namednode1 = rangedFilter.getEndPost();
	//   37   88:aload_0         
	//   38   89:getfield        #29  <Field RangedFilter rangedFilter>
	//   39   92:invokevirtual   #173 <Method NamedNode RangedFilter.getEndPost()>
	//   40   95:astore          9
				byte0 = 1;
	//   41   97:iconst_1        
	//   42   98:istore          4
			}
			boolean flag1 = false;
	//   43  100:iconst_0        
	//   44  101:istore          7
			int i = 0;
	//   45  103:iconst_0        
	//   46  104:istore          5
			indexednode1 = ((IndexedNode) (obj));
	//   47  106:aload           11
	//   48  108:astore_2        
			do
			{
				obj = ((Object) (indexednode1));
	//   49  109:aload_2         
	//   50  110:astore          11
				if(!iterator.hasNext())
					break;
	//   51  112:aload           10
	//   52  114:invokeinterface #184 <Method boolean Iterator.hasNext()>
	//   53  119:ifeq            257
				obj = ((Object) ((NamedNode)iterator.next()));
	//   54  122:aload           10
	//   55  124:invokeinterface #188 <Method Object Iterator.next()>
	//   56  129:checkcast       #53  <Class NamedNode>
	//   57  132:astore          11
				boolean flag = flag1;
	//   58  134:iload           7
	//   59  136:istore          6
				if(!flag1)
	//*  60  138:iload           7
	//*  61  140:ifne            167
				{
					flag = flag1;
	//   62  143:iload           7
	//   63  145:istore          6
					if(index.compare(((Object) (namednode)), obj) * byte0 <= 0)
	//*  64  147:aload_0         
	//*  65  148:getfield        #37  <Field Index index>
	//*  66  151:aload           8
	//*  67  153:aload           11
	//*  68  155:invokevirtual   #191 <Method int Index.compare(Object, Object)>
	//*  69  158:iload           4
	//*  70  160:imul            
	//*  71  161:ifgt            167
						flag = true;
	//   72  164:iconst_1        
	//   73  165:istore          6
				}
				if(flag && i < limit && index.compare(obj, ((Object) (namednode1))) * byte0 <= 0)
	//*  74  167:iload           6
	//*  75  169:ifeq            204
	//*  76  172:iload           5
	//*  77  174:aload_0         
	//*  78  175:getfield        #43  <Field int limit>
	//*  79  178:icmpge          204
	//*  80  181:aload_0         
	//*  81  182:getfield        #37  <Field Index index>
	//*  82  185:aload           11
	//*  83  187:aload           9
	//*  84  189:invokevirtual   #191 <Method int Index.compare(Object, Object)>
	//*  85  192:iload           4
	//*  86  194:imul            
	//*  87  195:ifgt            204
					flag1 = true;
	//   88  198:iconst_1        
	//   89  199:istore          7
				else
	//*  90  201:goto            207
					flag1 = false;
	//   91  204:iconst_0        
	//   92  205:istore          7
				if(flag1)
	//*  93  207:iload           7
	//*  94  209:ifeq            225
				{
					i++;
	//   95  212:iload           5
	//   96  214:iconst_1        
	//   97  215:iadd            
	//   98  216:istore          5
					flag1 = flag;
	//   99  218:iload           6
	//  100  220:istore          7
				} else
	//* 101  222:goto            109
				{
					indexednode1 = indexednode1.updateChild(((NamedNode) (obj)).getName(), ((Node) (EmptyNode.Empty())));
	//  102  225:aload_2         
	//  103  226:aload           11
	//  104  228:invokevirtual   #93  <Method ChildKey NamedNode.getName()>
	//  105  231:invokestatic    #134 <Method EmptyNode EmptyNode.Empty()>
	//  106  234:invokevirtual   #124 <Method IndexedNode IndexedNode.updateChild(ChildKey, Node)>
	//  107  237:astore_2        
					flag1 = flag;
	//  108  238:iload           6
	//  109  240:istore          7
				}
			} while(true);
	//  110  242:goto            109
		} else
		{
			obj = ((Object) (IndexedNode.from(((Node) (EmptyNode.Empty())), index)));
	//  111  245:invokestatic    #134 <Method EmptyNode EmptyNode.Empty()>
	//  112  248:aload_0         
	//  113  249:getfield        #37  <Field Index index>
	//  114  252:invokestatic    #195 <Method IndexedNode IndexedNode.from(Node, Index)>
	//  115  255:astore          11
		}
		return rangedFilter.getIndexedFilter().updateFullNode(indexednode, ((IndexedNode) (obj)), childchangeaccumulator);
	//  116  257:aload_0         
	//  117  258:getfield        #29  <Field RangedFilter rangedFilter>
	//  118  261:invokevirtual   #143 <Method NodeFilter RangedFilter.getIndexedFilter()>
	//  119  264:aload_1         
	//  120  265:aload           11
	//  121  267:aload_3         
	//  122  268:invokeinterface #197 <Method IndexedNode NodeFilter.updateFullNode(IndexedNode, IndexedNode, ChildChangeAccumulator)>
	//  123  273:areturn         
	}

	public IndexedNode updatePriority(IndexedNode indexednode, Node node)
	{
		return indexednode;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private final Index index;
	private final int limit;
	private final RangedFilter rangedFilter;
	private final boolean reverse;

	static 
	{
	//    0    0:return          
	}
}
