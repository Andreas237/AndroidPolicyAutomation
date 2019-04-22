// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view;

import com.firebase.client.core.*;
import com.firebase.client.core.operation.*;
import com.firebase.client.core.utilities.ImmutableTree;
import com.firebase.client.core.view.filter.ChildChangeAccumulator;
import com.firebase.client.core.view.filter.NodeFilter;
import com.firebase.client.snapshot.*;
import java.util.*;

// Referenced classes of package com.firebase.client.core.view:
//			ViewCache, CacheNode, Change

public class ViewProcessor
{
	public static class ProcessorResult
	{

		public final List changes;
		public final ViewCache viewCache;

		public ProcessorResult(ViewCache viewcache, List list)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			viewCache = viewcache;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field ViewCache viewCache>
			changes = list;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field List changes>
		//    8   14:return          
		}
	}

	private static class WriteTreeCompleteChildSource
		implements com.firebase.client.core.view.filter.NodeFilter.CompleteChildSource
	{

		public NamedNode getChildAfterChild(Index index, NamedNode namednode, boolean flag)
		{
			Node node = optCompleteServerCache;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Node optCompleteServerCache>
		//    2    4:astore          4
			if(node == null)
		//*   3    6:aload           4
		//*   4    8:ifnull          14
		//*   5   11:goto            23
				node = viewCache.getCompleteServerSnap();
		//    6   14:aload_0         
		//    7   15:getfield        #24  <Field ViewCache viewCache>
		//    8   18:invokevirtual   #35  <Method Node ViewCache.getCompleteServerSnap()>
		//    9   21:astore          4
			return writes.calcNextNodeAfterPost(node, namednode, flag, index);
		//   10   23:aload_0         
		//   11   24:getfield        #22  <Field WriteTreeRef writes>
		//   12   27:aload           4
		//   13   29:aload_2         
		//   14   30:iload_3         
		//   15   31:aload_1         
		//   16   32:invokevirtual   #41  <Method NamedNode WriteTreeRef.calcNextNodeAfterPost(Node, NamedNode, boolean, Index)>
		//   17   35:areturn         
		}

		public Node getCompleteChild(ChildKey childkey)
		{
			Object obj = ((Object) (viewCache.getEventCache()));
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field ViewCache viewCache>
		//    2    4:invokevirtual   #47  <Method CacheNode ViewCache.getEventCache()>
		//    3    7:astore_2        
			if(((CacheNode) (obj)).isCompleteForChild(childkey))
		//*   4    8:aload_2         
		//*   5    9:aload_1         
		//*   6   10:invokevirtual   #53  <Method boolean CacheNode.isCompleteForChild(ChildKey)>
		//*   7   13:ifeq            27
				return ((CacheNode) (obj)).getNode().getImmediateChild(childkey);
		//    8   16:aload_2         
		//    9   17:invokevirtual   #56  <Method Node CacheNode.getNode()>
		//   10   20:aload_1         
		//   11   21:invokeinterface #61  <Method Node Node.getImmediateChild(ChildKey)>
		//   12   26:areturn         
			obj = ((Object) (optCompleteServerCache));
		//   13   27:aload_0         
		//   14   28:getfield        #26  <Field Node optCompleteServerCache>
		//   15   31:astore_2        
			if(obj != null)
		//*  16   32:aload_2         
		//*  17   33:ifnull          56
				obj = ((Object) (new CacheNode(IndexedNode.from(((Node) (obj)), ((Index) (KeyIndex.getInstance()))), true, false)));
		//   18   36:new             #49  <Class CacheNode>
		//   19   39:dup             
		//   20   40:aload_2         
		//   21   41:invokestatic    #67  <Method KeyIndex KeyIndex.getInstance()>
		//   22   44:invokestatic    #73  <Method IndexedNode IndexedNode.from(Node, Index)>
		//   23   47:iconst_1        
		//   24   48:iconst_0        
		//   25   49:invokespecial   #76  <Method void CacheNode(IndexedNode, boolean, boolean)>
		//   26   52:astore_2        
			else
		//*  27   53:goto            64
				obj = ((Object) (viewCache.getServerCache()));
		//   28   56:aload_0         
		//   29   57:getfield        #24  <Field ViewCache viewCache>
		//   30   60:invokevirtual   #79  <Method CacheNode ViewCache.getServerCache()>
		//   31   63:astore_2        
			return writes.calcCompleteChild(childkey, ((CacheNode) (obj)));
		//   32   64:aload_0         
		//   33   65:getfield        #22  <Field WriteTreeRef writes>
		//   34   68:aload_1         
		//   35   69:aload_2         
		//   36   70:invokevirtual   #83  <Method Node WriteTreeRef.calcCompleteChild(ChildKey, CacheNode)>
		//   37   73:areturn         
		}

		private final Node optCompleteServerCache;
		private final ViewCache viewCache;
		private final WriteTreeRef writes;

		public WriteTreeCompleteChildSource(WriteTreeRef writetreeref, ViewCache viewcache, Node node)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			writes = writetreeref;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field WriteTreeRef writes>
			viewCache = viewcache;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field ViewCache viewCache>
			optCompleteServerCache = node;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field Node optCompleteServerCache>
		//   11   19:return          
		}
	}


	public ViewProcessor(NodeFilter nodefilter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		filter = nodefilter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field NodeFilter filter>
	//    5    9:return          
	}

	private ViewCache ackUserWrite(ViewCache viewcache, Path path, ImmutableTree immutabletree, WriteTreeRef writetreeref, Node node, ChildChangeAccumulator childchangeaccumulator)
	{
		if(writetreeref.shadowingWrite(path) != null)
	//*   0    0:aload           4
	//*   1    2:aload_2         
	//*   2    3:invokevirtual   #41  <Method Node WriteTreeRef.shadowingWrite(Path)>
	//*   3    6:ifnull          11
			return viewcache;
	//    4    9:aload_1         
	//    5   10:areturn         
		boolean flag = viewcache.getServerCache().isFiltered();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #47  <Method CacheNode ViewCache.getServerCache()>
	//    8   15:invokevirtual   #53  <Method boolean CacheNode.isFiltered()>
	//    9   18:istore          7
		Object obj = ((Object) (viewcache.getServerCache()));
	//   10   20:aload_1         
	//   11   21:invokevirtual   #47  <Method CacheNode ViewCache.getServerCache()>
	//   12   24:astore          9
		if(immutabletree.getValue() != null)
	//*  13   26:aload_3         
	//*  14   27:invokevirtual   #59  <Method Object ImmutableTree.getValue()>
	//*  15   30:ifnull          164
		{
			if(path.isEmpty() && ((CacheNode) (obj)).isFullyInitialized() || ((CacheNode) (obj)).isCompleteForPath(path))
	//*  16   33:aload_2         
	//*  17   34:invokevirtual   #64  <Method boolean Path.isEmpty()>
	//*  18   37:ifeq            48
	//*  19   40:aload           9
	//*  20   42:invokevirtual   #67  <Method boolean CacheNode.isFullyInitialized()>
	//*  21   45:ifne            57
	//*  22   48:aload           9
	//*  23   50:aload_2         
	//*  24   51:invokevirtual   #71  <Method boolean CacheNode.isCompleteForPath(Path)>
	//*  25   54:ifeq            83
				return applyServerOverwrite(viewcache, path, ((CacheNode) (obj)).getNode().getChild(path), writetreeref, node, flag, childchangeaccumulator);
	//   26   57:aload_0         
	//   27   58:aload_1         
	//   28   59:aload_2         
	//   29   60:aload           9
	//   30   62:invokevirtual   #75  <Method Node CacheNode.getNode()>
	//   31   65:aload_2         
	//   32   66:invokeinterface #80  <Method Node Node.getChild(Path)>
	//   33   71:aload           4
	//   34   73:aload           5
	//   35   75:iload           7
	//   36   77:aload           6
	//   37   79:invokespecial   #84  <Method ViewCache applyServerOverwrite(ViewCache, Path, Node, WriteTreeRef, Node, boolean, ChildChangeAccumulator)>
	//   38   82:areturn         
			if(path.isEmpty())
	//*  39   83:aload_2         
	//*  40   84:invokevirtual   #64  <Method boolean Path.isEmpty()>
	//*  41   87:ifeq            162
			{
				immutabletree = ((ImmutableTree) (CompoundWrite.emptyWrite()));
	//   42   90:invokestatic    #90  <Method CompoundWrite CompoundWrite.emptyWrite()>
	//   43   93:astore_3        
				for(Iterator iterator = ((CacheNode) (obj)).getNode().iterator(); iterator.hasNext();)
	//*  44   94:aload           9
	//*  45   96:invokevirtual   #75  <Method Node CacheNode.getNode()>
	//*  46   99:invokeinterface #94  <Method Iterator Node.iterator()>
	//*  47  104:astore          8
	//*  48  106:aload           8
	//*  49  108:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//*  50  113:ifeq            146
				{
					obj = ((Object) ((NamedNode)iterator.next()));
	//   51  116:aload           8
	//   52  118:invokeinterface #102 <Method Object Iterator.next()>
	//   53  123:checkcast       #104 <Class NamedNode>
	//   54  126:astore          9
					immutabletree = ((ImmutableTree) (((CompoundWrite) (immutabletree)).addWrite(((NamedNode) (obj)).getName(), ((NamedNode) (obj)).getNode())));
	//   55  128:aload_3         
	//   56  129:aload           9
	//   57  131:invokevirtual   #108 <Method ChildKey NamedNode.getName()>
	//   58  134:aload           9
	//   59  136:invokevirtual   #109 <Method Node NamedNode.getNode()>
	//   60  139:invokevirtual   #113 <Method CompoundWrite CompoundWrite.addWrite(ChildKey, Node)>
	//   61  142:astore_3        
				}

	//*  62  143:goto            106
				return applyServerMerge(viewcache, path, ((CompoundWrite) (immutabletree)), writetreeref, node, flag, childchangeaccumulator);
	//   63  146:aload_0         
	//   64  147:aload_1         
	//   65  148:aload_2         
	//   66  149:aload_3         
	//   67  150:aload           4
	//   68  152:aload           5
	//   69  154:iload           7
	//   70  156:aload           6
	//   71  158:invokespecial   #117 <Method ViewCache applyServerMerge(ViewCache, Path, CompoundWrite, WriteTreeRef, Node, boolean, ChildChangeAccumulator)>
	//   72  161:areturn         
			} else
			{
				return viewcache;
	//   73  162:aload_1         
	//   74  163:areturn         
			}
		}
		CompoundWrite compoundwrite = CompoundWrite.emptyWrite();
	//   75  164:invokestatic    #90  <Method CompoundWrite CompoundWrite.emptyWrite()>
	//   76  167:astore          8
		Iterator iterator1 = immutabletree.iterator();
	//   77  169:aload_3         
	//   78  170:invokevirtual   #118 <Method Iterator ImmutableTree.iterator()>
	//   79  173:astore          10
		immutabletree = ((ImmutableTree) (compoundwrite));
	//   80  175:aload           8
	//   81  177:astore_3        
		do
		{
			if(!iterator1.hasNext())
				break;
	//   82  178:aload           10
	//   83  180:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//   84  185:ifeq            248
			Path path1 = (Path)((java.util.Map.Entry)iterator1.next()).getKey();
	//   85  188:aload           10
	//   86  190:invokeinterface #102 <Method Object Iterator.next()>
	//   87  195:checkcast       #120 <Class java.util.Map$Entry>
	//   88  198:invokeinterface #123 <Method Object java.util.Map$Entry.getKey()>
	//   89  203:checkcast       #61  <Class Path>
	//   90  206:astore          8
			Path path2 = path.child(path1);
	//   91  208:aload_2         
	//   92  209:aload           8
	//   93  211:invokevirtual   #127 <Method Path Path.child(Path)>
	//   94  214:astore          11
			if(((CacheNode) (obj)).isCompleteForPath(path2))
	//*  95  216:aload           9
	//*  96  218:aload           11
	//*  97  220:invokevirtual   #71  <Method boolean CacheNode.isCompleteForPath(Path)>
	//*  98  223:ifeq            178
				immutabletree = ((ImmutableTree) (((CompoundWrite) (immutabletree)).addWrite(path1, ((CacheNode) (obj)).getNode().getChild(path2))));
	//   99  226:aload_3         
	//  100  227:aload           8
	//  101  229:aload           9
	//  102  231:invokevirtual   #75  <Method Node CacheNode.getNode()>
	//  103  234:aload           11
	//  104  236:invokeinterface #80  <Method Node Node.getChild(Path)>
	//  105  241:invokevirtual   #130 <Method CompoundWrite CompoundWrite.addWrite(Path, Node)>
	//  106  244:astore_3        
		} while(true);
	//  107  245:goto            178
		return applyServerMerge(viewcache, path, ((CompoundWrite) (immutabletree)), writetreeref, node, flag, childchangeaccumulator);
	//  108  248:aload_0         
	//  109  249:aload_1         
	//  110  250:aload_2         
	//  111  251:aload_3         
	//  112  252:aload           4
	//  113  254:aload           5
	//  114  256:iload           7
	//  115  258:aload           6
	//  116  260:invokespecial   #117 <Method ViewCache applyServerMerge(ViewCache, Path, CompoundWrite, WriteTreeRef, Node, boolean, ChildChangeAccumulator)>
	//  117  263:areturn         
	}

	private ViewCache applyServerMerge(ViewCache viewcache, Path path, CompoundWrite compoundwrite, WriteTreeRef writetreeref, Node node, boolean flag, ChildChangeAccumulator childchangeaccumulator)
	{
		if(viewcache.getServerCache().getNode().isEmpty() && !viewcache.getServerCache().isFullyInitialized())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #47  <Method CacheNode ViewCache.getServerCache()>
	//*   2    4:invokevirtual   #75  <Method Node CacheNode.getNode()>
	//*   3    7:invokeinterface #133 <Method boolean Node.isEmpty()>
	//*   4   12:ifeq            27
	//*   5   15:aload_1         
	//*   6   16:invokevirtual   #47  <Method CacheNode ViewCache.getServerCache()>
	//*   7   19:invokevirtual   #67  <Method boolean CacheNode.isFullyInitialized()>
	//*   8   22:ifne            27
			return viewcache;
	//    9   25:aload_1         
	//   10   26:areturn         
		if(path.isEmpty())
	//*  11   27:aload_2         
	//*  12   28:invokevirtual   #64  <Method boolean Path.isEmpty()>
	//*  13   31:ifeq            39
			path = ((Path) (compoundwrite));
	//   14   34:aload_3         
	//   15   35:astore_2        
		else
	//*  16   36:goto            48
			path = ((Path) (CompoundWrite.emptyWrite().addWrites(path, compoundwrite)));
	//   17   39:invokestatic    #90  <Method CompoundWrite CompoundWrite.emptyWrite()>
	//   18   42:aload_2         
	//   19   43:aload_3         
	//   20   44:invokevirtual   #137 <Method CompoundWrite CompoundWrite.addWrites(Path, CompoundWrite)>
	//   21   47:astore_2        
		compoundwrite = ((CompoundWrite) (viewcache.getServerCache().getNode()));
	//   22   48:aload_1         
	//   23   49:invokevirtual   #47  <Method CacheNode ViewCache.getServerCache()>
	//   24   52:invokevirtual   #75  <Method Node CacheNode.getNode()>
	//   25   55:astore_3        
		Object obj = ((Object) (((CompoundWrite) (path)).childCompoundWrites()));
	//   26   56:aload_2         
	//   27   57:invokevirtual   #141 <Method Map CompoundWrite.childCompoundWrites()>
	//   28   60:astore          9
		Iterator iterator = ((Map) (obj)).entrySet().iterator();
	//   29   62:aload           9
	//   30   64:invokeinterface #147 <Method Set Map.entrySet()>
	//   31   69:invokeinterface #150 <Method Iterator Set.iterator()>
	//   32   74:astore          10
		path = ((Path) (viewcache));
	//   33   76:aload_1         
	//   34   77:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   35   78:aload           10
	//   36   80:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//   37   85:ifeq            185
			Object obj2 = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   38   88:aload           10
	//   39   90:invokeinterface #102 <Method Object Iterator.next()>
	//   40   95:checkcast       #120 <Class java.util.Map$Entry>
	//   41   98:astore          12
			ChildKey childkey1 = (ChildKey)((java.util.Map.Entry) (obj2)).getKey();
	//   42  100:aload           12
	//   43  102:invokeinterface #123 <Method Object java.util.Map$Entry.getKey()>
	//   44  107:checkcast       #152 <Class ChildKey>
	//   45  110:astore          11
			if(((Node) (compoundwrite)).hasChild(childkey1))
	//*  46  112:aload_3         
	//*  47  113:aload           11
	//*  48  115:invokeinterface #156 <Method boolean Node.hasChild(ChildKey)>
	//*  49  120:ifeq            78
			{
				Node node2 = ((Node) (compoundwrite)).getImmediateChild(childkey1);
	//   50  123:aload_3         
	//   51  124:aload           11
	//   52  126:invokeinterface #160 <Method Node Node.getImmediateChild(ChildKey)>
	//   53  131:astore          13
				obj2 = ((Object) (((CompoundWrite)((java.util.Map.Entry) (obj2)).getValue()).apply(node2)));
	//   54  133:aload           12
	//   55  135:invokeinterface #161 <Method Object java.util.Map$Entry.getValue()>
	//   56  140:checkcast       #86  <Class CompoundWrite>
	//   57  143:aload           13
	//   58  145:invokevirtual   #165 <Method Node CompoundWrite.apply(Node)>
	//   59  148:astore          12
				path = ((Path) (applyServerOverwrite(((ViewCache) (path)), new Path(new ChildKey[] {
					childkey1
				}), ((Node) (obj2)), writetreeref, node, flag, childchangeaccumulator)));
	//   60  150:aload_0         
	//   61  151:aload_2         
	//   62  152:new             #61  <Class Path>
	//   63  155:dup             
	//   64  156:iconst_1        
	//   65  157:anewarray       ChildKey[]
	//   66  160:dup             
	//   67  161:iconst_0        
	//   68  162:aload           11
	//   69  164:aastore         
	//   70  165:invokespecial   #168 <Method void Path(ChildKey[])>
	//   71  168:aload           12
	//   72  170:aload           4
	//   73  172:aload           5
	//   74  174:iload           6
	//   75  176:aload           7
	//   76  178:invokespecial   #84  <Method ViewCache applyServerOverwrite(ViewCache, Path, Node, WriteTreeRef, Node, boolean, ChildChangeAccumulator)>
	//   77  181:astore_2        
			}
		} while(true);
	//   78  182:goto            78
		obj = ((Object) (((Map) (obj)).entrySet().iterator()));
	//   79  185:aload           9
	//   80  187:invokeinterface #147 <Method Set Map.entrySet()>
	//   81  192:invokeinterface #150 <Method Iterator Set.iterator()>
	//   82  197:astore          9
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   83  199:aload           9
	//   84  201:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//   85  206:ifeq            352
			Object obj1 = ((Object) ((java.util.Map.Entry)((Iterator) (obj)).next()));
	//   86  209:aload           9
	//   87  211:invokeinterface #102 <Method Object Iterator.next()>
	//   88  216:checkcast       #120 <Class java.util.Map$Entry>
	//   89  219:astore          11
			ChildKey childkey = (ChildKey)((java.util.Map.Entry) (obj1)).getKey();
	//   90  221:aload           11
	//   91  223:invokeinterface #123 <Method Object java.util.Map$Entry.getKey()>
	//   92  228:checkcast       #152 <Class ChildKey>
	//   93  231:astore          10
			CompoundWrite compoundwrite1 = (CompoundWrite)((java.util.Map.Entry) (obj1)).getValue();
	//   94  233:aload           11
	//   95  235:invokeinterface #161 <Method Object java.util.Map$Entry.getValue()>
	//   96  240:checkcast       #86  <Class CompoundWrite>
	//   97  243:astore          12
			boolean flag1;
			if(!viewcache.getServerCache().isCompleteForChild(childkey) && compoundwrite1.rootWrite() == null)
	//*  98  245:aload_1         
	//*  99  246:invokevirtual   #47  <Method CacheNode ViewCache.getServerCache()>
	//* 100  249:aload           10
	//* 101  251:invokevirtual   #171 <Method boolean CacheNode.isCompleteForChild(ChildKey)>
	//* 102  254:ifne            271
	//* 103  257:aload           12
	//* 104  259:invokevirtual   #174 <Method Node CompoundWrite.rootWrite()>
	//* 105  262:ifnonnull       271
				flag1 = true;
	//  106  265:iconst_1        
	//  107  266:istore          8
			else
	//* 108  268:goto            274
				flag1 = false;
	//  109  271:iconst_0        
	//  110  272:istore          8
			if(!((Node) (compoundwrite)).hasChild(childkey) && !flag1)
	//* 111  274:aload_3         
	//* 112  275:aload           10
	//* 113  277:invokeinterface #156 <Method boolean Node.hasChild(ChildKey)>
	//* 114  282:ifne            199
	//* 115  285:iload           8
	//* 116  287:ifne            199
			{
				Node node1 = ((Node) (compoundwrite)).getImmediateChild(childkey);
	//  117  290:aload_3         
	//  118  291:aload           10
	//  119  293:invokeinterface #160 <Method Node Node.getImmediateChild(ChildKey)>
	//  120  298:astore          12
				obj1 = ((Object) (((CompoundWrite)((java.util.Map.Entry) (obj1)).getValue()).apply(node1)));
	//  121  300:aload           11
	//  122  302:invokeinterface #161 <Method Object java.util.Map$Entry.getValue()>
	//  123  307:checkcast       #86  <Class CompoundWrite>
	//  124  310:aload           12
	//  125  312:invokevirtual   #165 <Method Node CompoundWrite.apply(Node)>
	//  126  315:astore          11
				path = ((Path) (applyServerOverwrite(((ViewCache) (path)), new Path(new ChildKey[] {
					childkey
				}), ((Node) (obj1)), writetreeref, node, flag, childchangeaccumulator)));
	//  127  317:aload_0         
	//  128  318:aload_2         
	//  129  319:new             #61  <Class Path>
	//  130  322:dup             
	//  131  323:iconst_1        
	//  132  324:anewarray       ChildKey[]
	//  133  327:dup             
	//  134  328:iconst_0        
	//  135  329:aload           10
	//  136  331:aastore         
	//  137  332:invokespecial   #168 <Method void Path(ChildKey[])>
	//  138  335:aload           11
	//  139  337:aload           4
	//  140  339:aload           5
	//  141  341:iload           6
	//  142  343:aload           7
	//  143  345:invokespecial   #84  <Method ViewCache applyServerOverwrite(ViewCache, Path, Node, WriteTreeRef, Node, boolean, ChildChangeAccumulator)>
	//  144  348:astore_2        
			}
		} while(true);
	//  145  349:goto            199
		return ((ViewCache) (path));
	//  146  352:aload_2         
	//  147  353:areturn         
	}

	private ViewCache applyServerOverwrite(ViewCache viewcache, Path path, Node node, WriteTreeRef writetreeref, Node node1, boolean flag, ChildChangeAccumulator childchangeaccumulator)
	{
		CacheNode cachenode = viewcache.getServerCache();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #47  <Method CacheNode ViewCache.getServerCache()>
	//    2    4:astore          10
		NodeFilter nodefilter;
		if(flag)
	//*   3    6:iload           6
	//*   4    8:ifeq            20
			nodefilter = filter;
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field NodeFilter filter>
	//    7   15:astore          9
		else
	//*   8   17:goto            31
			nodefilter = filter.getIndexedFilter();
	//    9   20:aload_0         
	//   10   21:getfield        #33  <Field NodeFilter filter>
	//   11   24:invokeinterface #180 <Method NodeFilter NodeFilter.getIndexedFilter()>
	//   12   29:astore          9
		flag = path.isEmpty();
	//   13   31:aload_2         
	//   14   32:invokevirtual   #64  <Method boolean Path.isEmpty()>
	//   15   35:istore          6
		boolean flag1 = true;
	//   16   37:iconst_1        
	//   17   38:istore          8
		if(flag)
	//*  18   40:iload           6
	//*  19   42:ifeq            73
			node = ((Node) (nodefilter.updateFullNode(cachenode.getIndexedNode(), IndexedNode.from(node, nodefilter.getIndex()), ((ChildChangeAccumulator) (null)))));
	//   20   45:aload           9
	//   21   47:aload           10
	//   22   49:invokevirtual   #184 <Method IndexedNode CacheNode.getIndexedNode()>
	//   23   52:aload_3         
	//   24   53:aload           9
	//   25   55:invokeinterface #188 <Method Index NodeFilter.getIndex()>
	//   26   60:invokestatic    #194 <Method IndexedNode IndexedNode.from(Node, Index)>
	//   27   63:aconst_null     
	//   28   64:invokeinterface #198 <Method IndexedNode NodeFilter.updateFullNode(IndexedNode, IndexedNode, ChildChangeAccumulator)>
	//   29   69:astore_3        
		else
	//*  30   70:goto            253
		if(nodefilter.filtersNodes() && !cachenode.isFiltered())
	//*  31   73:aload           9
	//*  32   75:invokeinterface #201 <Method boolean NodeFilter.filtersNodes()>
	//*  33   80:ifeq            154
	//*  34   83:aload           10
	//*  35   85:invokevirtual   #53  <Method boolean CacheNode.isFiltered()>
	//*  36   88:ifne            154
		{
			ChildKey childkey = path.getFront();
	//   37   91:aload_2         
	//   38   92:invokevirtual   #204 <Method ChildKey Path.getFront()>
	//   39   95:astore          11
			Path path1 = path.popFront();
	//   40   97:aload_2         
	//   41   98:invokevirtual   #208 <Method Path Path.popFront()>
	//   42  101:astore          12
			node = cachenode.getNode().getImmediateChild(childkey).updateChild(path1, node);
	//   43  103:aload           10
	//   44  105:invokevirtual   #75  <Method Node CacheNode.getNode()>
	//   45  108:aload           11
	//   46  110:invokeinterface #160 <Method Node Node.getImmediateChild(ChildKey)>
	//   47  115:aload           12
	//   48  117:aload_3         
	//   49  118:invokeinterface #212 <Method Node Node.updateChild(Path, Node)>
	//   50  123:astore_3        
			node = ((Node) (cachenode.getIndexedNode().updateChild(childkey, node)));
	//   51  124:aload           10
	//   52  126:invokevirtual   #184 <Method IndexedNode CacheNode.getIndexedNode()>
	//   53  129:aload           11
	//   54  131:aload_3         
	//   55  132:invokevirtual   #215 <Method IndexedNode IndexedNode.updateChild(ChildKey, Node)>
	//   56  135:astore_3        
			node = ((Node) (nodefilter.updateFullNode(cachenode.getIndexedNode(), ((IndexedNode) (node)), ((ChildChangeAccumulator) (null)))));
	//   57  136:aload           9
	//   58  138:aload           10
	//   59  140:invokevirtual   #184 <Method IndexedNode CacheNode.getIndexedNode()>
	//   60  143:aload_3         
	//   61  144:aconst_null     
	//   62  145:invokeinterface #198 <Method IndexedNode NodeFilter.updateFullNode(IndexedNode, IndexedNode, ChildChangeAccumulator)>
	//   63  150:astore_3        
		} else
	//*  64  151:goto            253
		{
			ChildKey childkey1 = path.getFront();
	//   65  154:aload_2         
	//   66  155:invokevirtual   #204 <Method ChildKey Path.getFront()>
	//   67  158:astore          11
			if(!cachenode.isCompleteForPath(path) && path.size() > 1)
	//*  68  160:aload           10
	//*  69  162:aload_2         
	//*  70  163:invokevirtual   #71  <Method boolean CacheNode.isCompleteForPath(Path)>
	//*  71  166:ifne            179
	//*  72  169:aload_2         
	//*  73  170:invokevirtual   #219 <Method int Path.size()>
	//*  74  173:iconst_1        
	//*  75  174:icmple          179
				return viewcache;
	//   76  177:aload_1         
	//   77  178:areturn         
			Path path2 = path.popFront();
	//   78  179:aload_2         
	//   79  180:invokevirtual   #208 <Method Path Path.popFront()>
	//   80  183:astore          12
			node = cachenode.getNode().getImmediateChild(childkey1).updateChild(path2, node);
	//   81  185:aload           10
	//   82  187:invokevirtual   #75  <Method Node CacheNode.getNode()>
	//   83  190:aload           11
	//   84  192:invokeinterface #160 <Method Node Node.getImmediateChild(ChildKey)>
	//   85  197:aload           12
	//   86  199:aload_3         
	//   87  200:invokeinterface #212 <Method Node Node.updateChild(Path, Node)>
	//   88  205:astore_3        
			if(childkey1.isPriorityChildName())
	//*  89  206:aload           11
	//*  90  208:invokevirtual   #222 <Method boolean ChildKey.isPriorityChildName()>
	//*  91  211:ifeq            231
				node = ((Node) (nodefilter.updatePriority(cachenode.getIndexedNode(), node)));
	//   92  214:aload           9
	//   93  216:aload           10
	//   94  218:invokevirtual   #184 <Method IndexedNode CacheNode.getIndexedNode()>
	//   95  221:aload_3         
	//   96  222:invokeinterface #226 <Method IndexedNode NodeFilter.updatePriority(IndexedNode, Node)>
	//   97  227:astore_3        
			else
	//*  98  228:goto            253
				node = ((Node) (nodefilter.updateChild(cachenode.getIndexedNode(), childkey1, node, path2, NO_COMPLETE_SOURCE, ((ChildChangeAccumulator) (null)))));
	//   99  231:aload           9
	//  100  233:aload           10
	//  101  235:invokevirtual   #184 <Method IndexedNode CacheNode.getIndexedNode()>
	//  102  238:aload           11
	//  103  240:aload_3         
	//  104  241:aload           12
	//  105  243:getstatic       #28  <Field com.firebase.client.core.view.filter.NodeFilter$CompleteChildSource NO_COMPLETE_SOURCE>
	//  106  246:aconst_null     
	//  107  247:invokeinterface #229 <Method IndexedNode NodeFilter.updateChild(IndexedNode, ChildKey, Node, Path, com.firebase.client.core.view.filter.NodeFilter$CompleteChildSource, ChildChangeAccumulator)>
	//  108  252:astore_3        
		}
		flag = flag1;
	//  109  253:iload           8
	//  110  255:istore          6
		if(!cachenode.isFullyInitialized())
	//* 111  257:aload           10
	//* 112  259:invokevirtual   #67  <Method boolean CacheNode.isFullyInitialized()>
	//* 113  262:ifne            282
			if(path.isEmpty())
	//* 114  265:aload_2         
	//* 115  266:invokevirtual   #64  <Method boolean Path.isEmpty()>
	//* 116  269:ifeq            279
				flag = flag1;
	//  117  272:iload           8
	//  118  274:istore          6
			else
	//* 119  276:goto            282
				flag = false;
	//  120  279:iconst_0        
	//  121  280:istore          6
		viewcache = viewcache.updateServerSnap(((IndexedNode) (node)), flag, nodefilter.filtersNodes());
	//  122  282:aload_1         
	//  123  283:aload_3         
	//  124  284:iload           6
	//  125  286:aload           9
	//  126  288:invokeinterface #201 <Method boolean NodeFilter.filtersNodes()>
	//  127  293:invokevirtual   #233 <Method ViewCache ViewCache.updateServerSnap(IndexedNode, boolean, boolean)>
	//  128  296:astore_1        
		return generateEventCacheAfterServerEvent(viewcache, path, writetreeref, ((com.firebase.client.core.view.filter.NodeFilter.CompleteChildSource) (new WriteTreeCompleteChildSource(writetreeref, viewcache, node1))), childchangeaccumulator);
	//  129  297:aload_0         
	//  130  298:aload_1         
	//  131  299:aload_2         
	//  132  300:aload           4
	//  133  302:new             #13  <Class ViewProcessor$WriteTreeCompleteChildSource>
	//  134  305:dup             
	//  135  306:aload           4
	//  136  308:aload_1         
	//  137  309:aload           5
	//  138  311:invokespecial   #236 <Method void ViewProcessor$WriteTreeCompleteChildSource(WriteTreeRef, ViewCache, Node)>
	//  139  314:aload           7
	//  140  316:invokespecial   #240 <Method ViewCache generateEventCacheAfterServerEvent(ViewCache, Path, WriteTreeRef, com.firebase.client.core.view.filter.NodeFilter$CompleteChildSource, ChildChangeAccumulator)>
	//  141  319:areturn         
	}

	private ViewCache applyUserMerge(ViewCache viewcache, Path path, CompoundWrite compoundwrite, WriteTreeRef writetreeref, Node node, ChildChangeAccumulator childchangeaccumulator)
	{
		Iterator iterator = compoundwrite.iterator();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #243 <Method Iterator CompoundWrite.iterator()>
	//    2    4:astore          8
		ViewCache viewcache1 = viewcache;
	//    3    6:aload_1         
	//    4    7:astore          7
		do
		{
			if(!iterator.hasNext())
				break;
	//    5    9:aload           8
	//    6   11:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//    7   16:ifeq            88
			java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
	//    8   19:aload           8
	//    9   21:invokeinterface #102 <Method Object Iterator.next()>
	//   10   26:checkcast       #120 <Class java.util.Map$Entry>
	//   11   29:astore          9
			Path path2 = path.child((Path)entry1.getKey());
	//   12   31:aload_2         
	//   13   32:aload           9
	//   14   34:invokeinterface #123 <Method Object java.util.Map$Entry.getKey()>
	//   15   39:checkcast       #61  <Class Path>
	//   16   42:invokevirtual   #127 <Method Path Path.child(Path)>
	//   17   45:astore          10
			if(cacheHasChild(viewcache, path2.getFront()))
	//*  18   47:aload_1         
	//*  19   48:aload           10
	//*  20   50:invokevirtual   #204 <Method ChildKey Path.getFront()>
	//*  21   53:invokestatic    #247 <Method boolean cacheHasChild(ViewCache, ChildKey)>
	//*  22   56:ifeq            9
				viewcache1 = applyUserOverwrite(viewcache1, path2, (Node)entry1.getValue(), writetreeref, node, childchangeaccumulator);
	//   23   59:aload_0         
	//   24   60:aload           7
	//   25   62:aload           10
	//   26   64:aload           9
	//   27   66:invokeinterface #161 <Method Object java.util.Map$Entry.getValue()>
	//   28   71:checkcast       #77  <Class Node>
	//   29   74:aload           4
	//   30   76:aload           5
	//   31   78:aload           6
	//   32   80:invokespecial   #251 <Method ViewCache applyUserOverwrite(ViewCache, Path, Node, WriteTreeRef, Node, ChildChangeAccumulator)>
	//   33   83:astore          7
		} while(true);
	//   34   85:goto            9
		iterator = compoundwrite.iterator();
	//   35   88:aload_3         
	//   36   89:invokevirtual   #243 <Method Iterator CompoundWrite.iterator()>
	//   37   92:astore          8
		compoundwrite = ((CompoundWrite) (viewcache1));
	//   38   94:aload           7
	//   39   96:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   40   97:aload           8
	//   41   99:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//   42  104:ifeq            174
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   43  107:aload           8
	//   44  109:invokeinterface #102 <Method Object Iterator.next()>
	//   45  114:checkcast       #120 <Class java.util.Map$Entry>
	//   46  117:astore          7
			Path path1 = path.child((Path)entry.getKey());
	//   47  119:aload_2         
	//   48  120:aload           7
	//   49  122:invokeinterface #123 <Method Object java.util.Map$Entry.getKey()>
	//   50  127:checkcast       #61  <Class Path>
	//   51  130:invokevirtual   #127 <Method Path Path.child(Path)>
	//   52  133:astore          9
			if(!cacheHasChild(viewcache, path1.getFront()))
	//*  53  135:aload_1         
	//*  54  136:aload           9
	//*  55  138:invokevirtual   #204 <Method ChildKey Path.getFront()>
	//*  56  141:invokestatic    #247 <Method boolean cacheHasChild(ViewCache, ChildKey)>
	//*  57  144:ifne            97
				compoundwrite = ((CompoundWrite) (applyUserOverwrite(((ViewCache) (compoundwrite)), path1, (Node)entry.getValue(), writetreeref, node, childchangeaccumulator)));
	//   58  147:aload_0         
	//   59  148:aload_3         
	//   60  149:aload           9
	//   61  151:aload           7
	//   62  153:invokeinterface #161 <Method Object java.util.Map$Entry.getValue()>
	//   63  158:checkcast       #77  <Class Node>
	//   64  161:aload           4
	//   65  163:aload           5
	//   66  165:aload           6
	//   67  167:invokespecial   #251 <Method ViewCache applyUserOverwrite(ViewCache, Path, Node, WriteTreeRef, Node, ChildChangeAccumulator)>
	//   68  170:astore_3        
		} while(true);
	//   69  171:goto            97
		return ((ViewCache) (compoundwrite));
	//   70  174:aload_3         
	//   71  175:areturn         
	}

	private ViewCache applyUserOverwrite(ViewCache viewcache, Path path, Node node, WriteTreeRef writetreeref, Node node1, ChildChangeAccumulator childchangeaccumulator)
	{
		CacheNode cachenode = viewcache.getEventCache();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #254 <Method CacheNode ViewCache.getEventCache()>
	//    2    4:astore          7
		writetreeref = ((WriteTreeRef) (new WriteTreeCompleteChildSource(writetreeref, viewcache, node1)));
	//    3    6:new             #13  <Class ViewProcessor$WriteTreeCompleteChildSource>
	//    4    9:dup             
	//    5   10:aload           4
	//    6   12:aload_1         
	//    7   13:aload           5
	//    8   15:invokespecial   #236 <Method void ViewProcessor$WriteTreeCompleteChildSource(WriteTreeRef, ViewCache, Node)>
	//    9   18:astore          4
		if(path.isEmpty())
	//*  10   20:aload_2         
	//*  11   21:invokevirtual   #64  <Method boolean Path.isEmpty()>
	//*  12   24:ifeq            75
		{
			path = ((Path) (IndexedNode.from(node, filter.getIndex())));
	//   13   27:aload_3         
	//   14   28:aload_0         
	//   15   29:getfield        #33  <Field NodeFilter filter>
	//   16   32:invokeinterface #188 <Method Index NodeFilter.getIndex()>
	//   17   37:invokestatic    #194 <Method IndexedNode IndexedNode.from(Node, Index)>
	//   18   40:astore_2        
			return viewcache.updateEventSnap(filter.updateFullNode(viewcache.getEventCache().getIndexedNode(), ((IndexedNode) (path)), childchangeaccumulator), true, filter.filtersNodes());
	//   19   41:aload_1         
	//   20   42:aload_0         
	//   21   43:getfield        #33  <Field NodeFilter filter>
	//   22   46:aload_1         
	//   23   47:invokevirtual   #254 <Method CacheNode ViewCache.getEventCache()>
	//   24   50:invokevirtual   #184 <Method IndexedNode CacheNode.getIndexedNode()>
	//   25   53:aload_2         
	//   26   54:aload           6
	//   27   56:invokeinterface #198 <Method IndexedNode NodeFilter.updateFullNode(IndexedNode, IndexedNode, ChildChangeAccumulator)>
	//   28   61:iconst_1        
	//   29   62:aload_0         
	//   30   63:getfield        #33  <Field NodeFilter filter>
	//   31   66:invokeinterface #201 <Method boolean NodeFilter.filtersNodes()>
	//   32   71:invokevirtual   #257 <Method ViewCache ViewCache.updateEventSnap(IndexedNode, boolean, boolean)>
	//   33   74:areturn         
		}
		node1 = ((Node) (path.getFront()));
	//   34   75:aload_2         
	//   35   76:invokevirtual   #204 <Method ChildKey Path.getFront()>
	//   36   79:astore          5
		if(((ChildKey) (node1)).isPriorityChildName())
	//*  37   81:aload           5
	//*  38   83:invokevirtual   #222 <Method boolean ChildKey.isPriorityChildName()>
	//*  39   86:ifeq            121
			return viewcache.updateEventSnap(filter.updatePriority(viewcache.getEventCache().getIndexedNode(), node), cachenode.isFullyInitialized(), cachenode.isFiltered());
	//   40   89:aload_1         
	//   41   90:aload_0         
	//   42   91:getfield        #33  <Field NodeFilter filter>
	//   43   94:aload_1         
	//   44   95:invokevirtual   #254 <Method CacheNode ViewCache.getEventCache()>
	//   45   98:invokevirtual   #184 <Method IndexedNode CacheNode.getIndexedNode()>
	//   46  101:aload_3         
	//   47  102:invokeinterface #226 <Method IndexedNode NodeFilter.updatePriority(IndexedNode, Node)>
	//   48  107:aload           7
	//   49  109:invokevirtual   #67  <Method boolean CacheNode.isFullyInitialized()>
	//   50  112:aload           7
	//   51  114:invokevirtual   #53  <Method boolean CacheNode.isFiltered()>
	//   52  117:invokevirtual   #257 <Method ViewCache ViewCache.updateEventSnap(IndexedNode, boolean, boolean)>
	//   53  120:areturn         
		Path path1 = path.popFront();
	//   54  121:aload_2         
	//   55  122:invokevirtual   #208 <Method Path Path.popFront()>
	//   56  125:astore          8
		Node node2 = cachenode.getNode().getImmediateChild(((ChildKey) (node1)));
	//   57  127:aload           7
	//   58  129:invokevirtual   #75  <Method Node CacheNode.getNode()>
	//   59  132:aload           5
	//   60  134:invokeinterface #160 <Method Node Node.getImmediateChild(ChildKey)>
	//   61  139:astore          9
		if(path1.isEmpty())
	//*  62  141:aload           8
	//*  63  143:invokevirtual   #64  <Method boolean Path.isEmpty()>
	//*  64  146:ifeq            154
		{
			path = ((Path) (node));
	//   65  149:aload_3         
	//   66  150:astore_2        
		} else
	//*  67  151:goto            218
		{
			path = ((Path) (((com.firebase.client.core.view.filter.NodeFilter.CompleteChildSource) (writetreeref)).getCompleteChild(((ChildKey) (node1)))));
	//   68  154:aload           4
	//   69  156:aload           5
	//   70  158:invokeinterface #262 <Method Node com.firebase.client.core.view.filter.NodeFilter$CompleteChildSource.getCompleteChild(ChildKey)>
	//   71  163:astore_2        
			if(path != null)
	//*  72  164:aload_2         
	//*  73  165:ifnull          214
			{
				if(!path1.getBack().isPriorityChildName() || !((Node) (path)).getChild(path1.getParent()).isEmpty())
	//*  74  168:aload           8
	//*  75  170:invokevirtual   #265 <Method ChildKey Path.getBack()>
	//*  76  173:invokevirtual   #222 <Method boolean ChildKey.isPriorityChildName()>
	//*  77  176:ifeq            201
	//*  78  179:aload_2         
	//*  79  180:aload           8
	//*  80  182:invokevirtual   #268 <Method Path Path.getParent()>
	//*  81  185:invokeinterface #80  <Method Node Node.getChild(Path)>
	//*  82  190:invokeinterface #133 <Method boolean Node.isEmpty()>
	//*  83  195:ifeq            201
	//*  84  198:goto            218
					path = ((Path) (((Node) (path)).updateChild(path1, node)));
	//   85  201:aload_2         
	//   86  202:aload           8
	//   87  204:aload_3         
	//   88  205:invokeinterface #212 <Method Node Node.updateChild(Path, Node)>
	//   89  210:astore_2        
			} else
	//*  90  211:goto            218
			{
				path = ((Path) (EmptyNode.Empty()));
	//   91  214:invokestatic    #274 <Method EmptyNode EmptyNode.Empty()>
	//   92  217:astore_2        
			}
		}
		node = ((Node) (viewcache));
	//   93  218:aload_1         
	//   94  219:astore_3        
		if(!((Object) (node2)).equals(((Object) (path))))
	//*  95  220:aload           9
	//*  96  222:aload_2         
	//*  97  223:invokevirtual   #278 <Method boolean Object.equals(Object)>
	//*  98  226:ifne            271
			node = ((Node) (viewcache.updateEventSnap(filter.updateChild(cachenode.getIndexedNode(), ((ChildKey) (node1)), ((Node) (path)), path1, ((com.firebase.client.core.view.filter.NodeFilter.CompleteChildSource) (writetreeref)), childchangeaccumulator), cachenode.isFullyInitialized(), filter.filtersNodes())));
	//   99  229:aload_1         
	//  100  230:aload_0         
	//  101  231:getfield        #33  <Field NodeFilter filter>
	//  102  234:aload           7
	//  103  236:invokevirtual   #184 <Method IndexedNode CacheNode.getIndexedNode()>
	//  104  239:aload           5
	//  105  241:aload_2         
	//  106  242:aload           8
	//  107  244:aload           4
	//  108  246:aload           6
	//  109  248:invokeinterface #229 <Method IndexedNode NodeFilter.updateChild(IndexedNode, ChildKey, Node, Path, com.firebase.client.core.view.filter.NodeFilter$CompleteChildSource, ChildChangeAccumulator)>
	//  110  253:aload           7
	//  111  255:invokevirtual   #67  <Method boolean CacheNode.isFullyInitialized()>
	//  112  258:aload_0         
	//  113  259:getfield        #33  <Field NodeFilter filter>
	//  114  262:invokeinterface #201 <Method boolean NodeFilter.filtersNodes()>
	//  115  267:invokevirtual   #257 <Method ViewCache ViewCache.updateEventSnap(IndexedNode, boolean, boolean)>
	//  116  270:astore_3        
		return ((ViewCache) (node));
	//  117  271:aload_3         
	//  118  272:areturn         
	}

	private static boolean cacheHasChild(ViewCache viewcache, ChildKey childkey)
	{
		return viewcache.getEventCache().isCompleteForChild(childkey);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method CacheNode ViewCache.getEventCache()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #171 <Method boolean CacheNode.isCompleteForChild(ChildKey)>
	//    4    8:ireturn         
	}

	private ViewCache generateEventCacheAfterServerEvent(ViewCache viewcache, Path path, WriteTreeRef writetreeref, com.firebase.client.core.view.filter.NodeFilter.CompleteChildSource completechildsource, ChildChangeAccumulator childchangeaccumulator)
	{
		CacheNode cachenode = viewcache.getEventCache();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #254 <Method CacheNode ViewCache.getEventCache()>
	//    2    4:astore          7
		if(writetreeref.shadowingWrite(path) != null)
	//*   3    6:aload_3         
	//*   4    7:aload_2         
	//*   5    8:invokevirtual   #41  <Method Node WriteTreeRef.shadowingWrite(Path)>
	//*   6   11:ifnull          16
			return viewcache;
	//    7   14:aload_1         
	//    8   15:areturn         
		if(path.isEmpty())
	//*   9   16:aload_2         
	//*  10   17:invokevirtual   #64  <Method boolean Path.isEmpty()>
	//*  11   20:ifeq            111
		{
			if(viewcache.getServerCache().isFiltered())
	//*  12   23:aload_1         
	//*  13   24:invokevirtual   #47  <Method CacheNode ViewCache.getServerCache()>
	//*  14   27:invokevirtual   #53  <Method boolean CacheNode.isFiltered()>
	//*  15   30:ifeq            65
			{
				completechildsource = ((com.firebase.client.core.view.filter.NodeFilter.CompleteChildSource) (viewcache.getCompleteServerSnap()));
	//   16   33:aload_1         
	//   17   34:invokevirtual   #281 <Method Node ViewCache.getCompleteServerSnap()>
	//   18   37:astore          4
				if(!(completechildsource instanceof ChildrenNode))
	//*  19   39:aload           4
	//*  20   41:instanceof      #283 <Class ChildrenNode>
	//*  21   44:ifeq            50
	//*  22   47:goto            55
					completechildsource = ((com.firebase.client.core.view.filter.NodeFilter.CompleteChildSource) (EmptyNode.Empty()));
	//   23   50:invokestatic    #274 <Method EmptyNode EmptyNode.Empty()>
	//   24   53:astore          4
				writetreeref = ((WriteTreeRef) (writetreeref.calcCompleteEventChildren(((Node) (completechildsource)))));
	//   25   55:aload_3         
	//   26   56:aload           4
	//   27   58:invokevirtual   #286 <Method Node WriteTreeRef.calcCompleteEventChildren(Node)>
	//   28   61:astore_3        
			} else
	//*  29   62:goto            74
			{
				writetreeref = ((WriteTreeRef) (writetreeref.calcCompleteEventCache(viewcache.getCompleteServerSnap())));
	//   30   65:aload_3         
	//   31   66:aload_1         
	//   32   67:invokevirtual   #281 <Method Node ViewCache.getCompleteServerSnap()>
	//   33   70:invokevirtual   #289 <Method Node WriteTreeRef.calcCompleteEventCache(Node)>
	//   34   73:astore_3        
			}
			writetreeref = ((WriteTreeRef) (IndexedNode.from(((Node) (writetreeref)), filter.getIndex())));
	//   35   74:aload_3         
	//   36   75:aload_0         
	//   37   76:getfield        #33  <Field NodeFilter filter>
	//   38   79:invokeinterface #188 <Method Index NodeFilter.getIndex()>
	//   39   84:invokestatic    #194 <Method IndexedNode IndexedNode.from(Node, Index)>
	//   40   87:astore_3        
			writetreeref = ((WriteTreeRef) (filter.updateFullNode(viewcache.getEventCache().getIndexedNode(), ((IndexedNode) (writetreeref)), childchangeaccumulator)));
	//   41   88:aload_0         
	//   42   89:getfield        #33  <Field NodeFilter filter>
	//   43   92:aload_1         
	//   44   93:invokevirtual   #254 <Method CacheNode ViewCache.getEventCache()>
	//   45   96:invokevirtual   #184 <Method IndexedNode CacheNode.getIndexedNode()>
	//   46   99:aload_3         
	//   47  100:aload           5
	//   48  102:invokeinterface #198 <Method IndexedNode NodeFilter.updateFullNode(IndexedNode, IndexedNode, ChildChangeAccumulator)>
	//   49  107:astore_3        
		} else
	//*  50  108:goto            305
		{
			ChildKey childkey = path.getFront();
	//   51  111:aload_2         
	//   52  112:invokevirtual   #204 <Method ChildKey Path.getFront()>
	//   53  115:astore          8
			if(childkey.isPriorityChildName())
	//*  54  117:aload           8
	//*  55  119:invokevirtual   #222 <Method boolean ChildKey.isPriorityChildName()>
	//*  56  122:ifeq            175
			{
				writetreeref = ((WriteTreeRef) (writetreeref.calcEventCacheAfterServerOverwrite(path, cachenode.getNode(), viewcache.getServerCache().getNode())));
	//   57  125:aload_3         
	//   58  126:aload_2         
	//   59  127:aload           7
	//   60  129:invokevirtual   #75  <Method Node CacheNode.getNode()>
	//   61  132:aload_1         
	//   62  133:invokevirtual   #47  <Method CacheNode ViewCache.getServerCache()>
	//   63  136:invokevirtual   #75  <Method Node CacheNode.getNode()>
	//   64  139:invokevirtual   #293 <Method Node WriteTreeRef.calcEventCacheAfterServerOverwrite(Path, Node, Node)>
	//   65  142:astore_3        
				if(writetreeref != null)
	//*  66  143:aload_3         
	//*  67  144:ifnull          166
					writetreeref = ((WriteTreeRef) (filter.updatePriority(cachenode.getIndexedNode(), ((Node) (writetreeref)))));
	//   68  147:aload_0         
	//   69  148:getfield        #33  <Field NodeFilter filter>
	//   70  151:aload           7
	//   71  153:invokevirtual   #184 <Method IndexedNode CacheNode.getIndexedNode()>
	//   72  156:aload_3         
	//   73  157:invokeinterface #226 <Method IndexedNode NodeFilter.updatePriority(IndexedNode, Node)>
	//   74  162:astore_3        
				else
	//*  75  163:goto            305
					writetreeref = ((WriteTreeRef) (cachenode.getIndexedNode()));
	//   76  166:aload           7
	//   77  168:invokevirtual   #184 <Method IndexedNode CacheNode.getIndexedNode()>
	//   78  171:astore_3        
			} else
	//*  79  172:goto            305
			{
				Path path1 = path.popFront();
	//   80  175:aload_2         
	//   81  176:invokevirtual   #208 <Method Path Path.popFront()>
	//   82  179:astore          9
				if(cachenode.isCompleteForChild(childkey))
	//*  83  181:aload           7
	//*  84  183:aload           8
	//*  85  185:invokevirtual   #171 <Method boolean CacheNode.isCompleteForChild(ChildKey)>
	//*  86  188:ifeq            257
				{
					Node node = viewcache.getServerCache().getNode();
	//   87  191:aload_1         
	//   88  192:invokevirtual   #47  <Method CacheNode ViewCache.getServerCache()>
	//   89  195:invokevirtual   #75  <Method Node CacheNode.getNode()>
	//   90  198:astore          10
					writetreeref = ((WriteTreeRef) (writetreeref.calcEventCacheAfterServerOverwrite(path, cachenode.getNode(), node)));
	//   91  200:aload_3         
	//   92  201:aload_2         
	//   93  202:aload           7
	//   94  204:invokevirtual   #75  <Method Node CacheNode.getNode()>
	//   95  207:aload           10
	//   96  209:invokevirtual   #293 <Method Node WriteTreeRef.calcEventCacheAfterServerOverwrite(Path, Node, Node)>
	//   97  212:astore_3        
					if(writetreeref != null)
	//*  98  213:aload_3         
	//*  99  214:ifnull          241
						writetreeref = ((WriteTreeRef) (cachenode.getNode().getImmediateChild(childkey).updateChild(path1, ((Node) (writetreeref)))));
	//  100  217:aload           7
	//  101  219:invokevirtual   #75  <Method Node CacheNode.getNode()>
	//  102  222:aload           8
	//  103  224:invokeinterface #160 <Method Node Node.getImmediateChild(ChildKey)>
	//  104  229:aload           9
	//  105  231:aload_3         
	//  106  232:invokeinterface #212 <Method Node Node.updateChild(Path, Node)>
	//  107  237:astore_3        
					else
	//* 108  238:goto            254
						writetreeref = ((WriteTreeRef) (cachenode.getNode().getImmediateChild(childkey)));
	//  109  241:aload           7
	//  110  243:invokevirtual   #75  <Method Node CacheNode.getNode()>
	//  111  246:aload           8
	//  112  248:invokeinterface #160 <Method Node Node.getImmediateChild(ChildKey)>
	//  113  253:astore_3        
				} else
	//* 114  254:goto            268
				{
					writetreeref = ((WriteTreeRef) (writetreeref.calcCompleteChild(childkey, viewcache.getServerCache())));
	//  115  257:aload_3         
	//  116  258:aload           8
	//  117  260:aload_1         
	//  118  261:invokevirtual   #47  <Method CacheNode ViewCache.getServerCache()>
	//  119  264:invokevirtual   #297 <Method Node WriteTreeRef.calcCompleteChild(ChildKey, CacheNode)>
	//  120  267:astore_3        
				}
				if(writetreeref != null)
	//* 121  268:aload_3         
	//* 122  269:ifnull          299
					writetreeref = ((WriteTreeRef) (filter.updateChild(cachenode.getIndexedNode(), childkey, ((Node) (writetreeref)), path1, completechildsource, childchangeaccumulator)));
	//  123  272:aload_0         
	//  124  273:getfield        #33  <Field NodeFilter filter>
	//  125  276:aload           7
	//  126  278:invokevirtual   #184 <Method IndexedNode CacheNode.getIndexedNode()>
	//  127  281:aload           8
	//  128  283:aload_3         
	//  129  284:aload           9
	//  130  286:aload           4
	//  131  288:aload           5
	//  132  290:invokeinterface #229 <Method IndexedNode NodeFilter.updateChild(IndexedNode, ChildKey, Node, Path, com.firebase.client.core.view.filter.NodeFilter$CompleteChildSource, ChildChangeAccumulator)>
	//  133  295:astore_3        
				else
	//* 134  296:goto            305
					writetreeref = ((WriteTreeRef) (cachenode.getIndexedNode()));
	//  135  299:aload           7
	//  136  301:invokevirtual   #184 <Method IndexedNode CacheNode.getIndexedNode()>
	//  137  304:astore_3        
			}
		}
		boolean flag;
		if(!cachenode.isFullyInitialized() && !path.isEmpty())
	//* 138  305:aload           7
	//* 139  307:invokevirtual   #67  <Method boolean CacheNode.isFullyInitialized()>
	//* 140  310:ifne            329
	//* 141  313:aload_2         
	//* 142  314:invokevirtual   #64  <Method boolean Path.isEmpty()>
	//* 143  317:ifeq            323
	//* 144  320:goto            329
			flag = false;
	//  145  323:iconst_0        
	//  146  324:istore          6
		else
	//* 147  326:goto            332
			flag = true;
	//  148  329:iconst_1        
	//  149  330:istore          6
		return viewcache.updateEventSnap(((IndexedNode) (writetreeref)), flag, filter.filtersNodes());
	//  150  332:aload_1         
	//  151  333:aload_3         
	//  152  334:iload           6
	//  153  336:aload_0         
	//  154  337:getfield        #33  <Field NodeFilter filter>
	//  155  340:invokeinterface #201 <Method boolean NodeFilter.filtersNodes()>
	//  156  345:invokevirtual   #257 <Method ViewCache ViewCache.updateEventSnap(IndexedNode, boolean, boolean)>
	//  157  348:areturn         
	}

	private ViewCache listenComplete(ViewCache viewcache, Path path, WriteTreeRef writetreeref, Node node, ChildChangeAccumulator childchangeaccumulator)
	{
		node = ((Node) (viewcache.getServerCache()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #47  <Method CacheNode ViewCache.getServerCache()>
	//    2    4:astore          4
		IndexedNode indexednode = ((CacheNode) (node)).getIndexedNode();
	//    3    6:aload           4
	//    4    8:invokevirtual   #184 <Method IndexedNode CacheNode.getIndexedNode()>
	//    5   11:astore          7
		boolean flag;
		if(!((CacheNode) (node)).isFullyInitialized() && !path.isEmpty())
	//*   6   13:aload           4
	//*   7   15:invokevirtual   #67  <Method boolean CacheNode.isFullyInitialized()>
	//*   8   18:ifne            37
	//*   9   21:aload_2         
	//*  10   22:invokevirtual   #64  <Method boolean Path.isEmpty()>
	//*  11   25:ifeq            31
	//*  12   28:goto            37
			flag = false;
	//   13   31:iconst_0        
	//   14   32:istore          6
		else
	//*  15   34:goto            40
			flag = true;
	//   16   37:iconst_1        
	//   17   38:istore          6
		return generateEventCacheAfterServerEvent(viewcache.updateServerSnap(indexednode, flag, ((CacheNode) (node)).isFiltered()), path, writetreeref, NO_COMPLETE_SOURCE, childchangeaccumulator);
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:aload           7
	//   21   44:iload           6
	//   22   46:aload           4
	//   23   48:invokevirtual   #53  <Method boolean CacheNode.isFiltered()>
	//   24   51:invokevirtual   #233 <Method ViewCache ViewCache.updateServerSnap(IndexedNode, boolean, boolean)>
	//   25   54:aload_2         
	//   26   55:aload_3         
	//   27   56:getstatic       #28  <Field com.firebase.client.core.view.filter.NodeFilter$CompleteChildSource NO_COMPLETE_SOURCE>
	//   28   59:aload           5
	//   29   61:invokespecial   #240 <Method ViewCache generateEventCacheAfterServerEvent(ViewCache, Path, WriteTreeRef, com.firebase.client.core.view.filter.NodeFilter$CompleteChildSource, ChildChangeAccumulator)>
	//   30   64:areturn         
	}

	private void maybeAddValueEvent(ViewCache viewcache, ViewCache viewcache1, List list)
	{
		viewcache1 = ((ViewCache) (viewcache1.getEventCache()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #254 <Method CacheNode ViewCache.getEventCache()>
	//    2    4:astore_2        
		if(((CacheNode) (viewcache1)).isFullyInitialized())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #67  <Method boolean CacheNode.isFullyInitialized()>
	//*   5    9:ifeq            124
		{
			boolean flag;
			if(!((CacheNode) (viewcache1)).getNode().isLeafNode() && !((CacheNode) (viewcache1)).getNode().isEmpty())
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #75  <Method Node CacheNode.getNode()>
	//*   8   16:invokeinterface #304 <Method boolean Node.isLeafNode()>
	//*   9   21:ifne            45
	//*  10   24:aload_2         
	//*  11   25:invokevirtual   #75  <Method Node CacheNode.getNode()>
	//*  12   28:invokeinterface #133 <Method boolean Node.isEmpty()>
	//*  13   33:ifeq            39
	//*  14   36:goto            45
				flag = false;
	//   15   39:iconst_0        
	//   16   40:istore          4
			else
	//*  17   42:goto            48
				flag = true;
	//   18   45:iconst_1        
	//   19   46:istore          4
			if(!list.isEmpty() || !viewcache.getEventCache().isFullyInitialized() || flag && !((Object) (((CacheNode) (viewcache1)).getNode())).equals(((Object) (viewcache.getCompleteEventSnap()))) || !((Object) (((CacheNode) (viewcache1)).getNode().getPriority())).equals(((Object) (viewcache.getCompleteEventSnap().getPriority()))))
	//*  20   48:aload_3         
	//*  21   49:invokeinterface #307 <Method boolean List.isEmpty()>
	//*  22   54:ifeq            110
	//*  23   57:aload_1         
	//*  24   58:invokevirtual   #254 <Method CacheNode ViewCache.getEventCache()>
	//*  25   61:invokevirtual   #67  <Method boolean CacheNode.isFullyInitialized()>
	//*  26   64:ifeq            110
	//*  27   67:iload           4
	//*  28   69:ifeq            86
	//*  29   72:aload_2         
	//*  30   73:invokevirtual   #75  <Method Node CacheNode.getNode()>
	//*  31   76:aload_1         
	//*  32   77:invokevirtual   #310 <Method Node ViewCache.getCompleteEventSnap()>
	//*  33   80:invokevirtual   #278 <Method boolean Object.equals(Object)>
	//*  34   83:ifeq            110
	//*  35   86:aload_2         
	//*  36   87:invokevirtual   #75  <Method Node CacheNode.getNode()>
	//*  37   90:invokeinterface #313 <Method Node Node.getPriority()>
	//*  38   95:aload_1         
	//*  39   96:invokevirtual   #310 <Method Node ViewCache.getCompleteEventSnap()>
	//*  40   99:invokeinterface #313 <Method Node Node.getPriority()>
	//*  41  104:invokevirtual   #278 <Method boolean Object.equals(Object)>
	//*  42  107:ifne            124
				list.add(((Object) (Change.valueChange(((CacheNode) (viewcache1)).getIndexedNode()))));
	//   43  110:aload_3         
	//   44  111:aload_2         
	//   45  112:invokevirtual   #184 <Method IndexedNode CacheNode.getIndexedNode()>
	//   46  115:invokestatic    #319 <Method Change Change.valueChange(IndexedNode)>
	//   47  118:invokeinterface #322 <Method boolean List.add(Object)>
	//   48  123:pop             
		}
	//   49  124:return          
	}

	public ProcessorResult applyOperation(ViewCache viewcache, Operation operation, WriteTreeRef writetreeref, Node node)
	{
		ChildChangeAccumulator childchangeaccumulator = new ChildChangeAccumulator();
	//    0    0:new             #327 <Class ChildChangeAccumulator>
	//    1    3:dup             
	//    2    4:invokespecial   #328 <Method void ChildChangeAccumulator()>
	//    3    7:astore          6
		static class _cls2
		{

			static final int $SwitchMap$com$firebase$client$core$operation$Operation$OperationType[];

			static 
			{
				$SwitchMap$com$firebase$client$core$operation$Operation$OperationType = new int[com.firebase.client.core.operation.Operation.OperationType.values().length];
			//    0    0:invokestatic    #18  <Method com.firebase.client.core.operation.Operation$OperationType[] com.firebase.client.core.operation.Operation$OperationType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$firebase$client$core$operation$Operation$OperationType>
				try
				{
					$SwitchMap$com$firebase$client$core$operation$Operation$OperationType[com.firebase.client.core.operation.Operation.OperationType.Overwrite.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$core$operation$Operation$OperationType>
			//    5   12:getstatic       #24  <Field com.firebase.client.core.operation.Operation$OperationType com.firebase.client.core.operation.Operation$OperationType.Overwrite>
			//    6   15:invokevirtual   #28  <Method int com.firebase.client.core.operation.Operation$OperationType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$core$operation$Operation$OperationType>
			//*  10   23:getstatic       #31  <Field com.firebase.client.core.operation.Operation$OperationType com.firebase.client.core.operation.Operation$OperationType.Merge>
			//*  11   26:invokevirtual   #28  <Method int com.firebase.client.core.operation.Operation$OperationType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$core$operation$Operation$OperationType>
			//*  15   34:getstatic       #34  <Field com.firebase.client.core.operation.Operation$OperationType com.firebase.client.core.operation.Operation$OperationType.AckUserWrite>
			//*  16   37:invokevirtual   #28  <Method int com.firebase.client.core.operation.Operation$OperationType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$core$operation$Operation$OperationType>
			//*  20   45:getstatic       #37  <Field com.firebase.client.core.operation.Operation$OperationType com.firebase.client.core.operation.Operation$OperationType.ListenComplete>
			//*  21   48:invokevirtual   #28  <Method int com.firebase.client.core.operation.Operation$OperationType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   25   54:astore_0        
				try
				{
					$SwitchMap$com$firebase$client$core$operation$Operation$OperationType[com.firebase.client.core.operation.Operation.OperationType.Merge.ordinal()] = 2;
				}
			//*  26   55:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   27   58:astore_0        
				try
				{
					$SwitchMap$com$firebase$client$core$operation$Operation$OperationType[com.firebase.client.core.operation.Operation.OperationType.AckUserWrite.ordinal()] = 3;
				}
			//*  28   59:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   29   62:astore_0        
				try
				{
					$SwitchMap$com$firebase$client$core$operation$Operation$OperationType[com.firebase.client.core.operation.Operation.OperationType.ListenComplete.ordinal()] = 4;
				}
			//*  30   63:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   66:astore_0        
			//*  32   67:return          
			}
		}

		switch(_cls2..SwitchMap.com.firebase.client.core.operation.Operation.OperationType[operation.getType().ordinal()])
	//*   4    9:getstatic       #332 <Field int[] ViewProcessor$2.$SwitchMap$com$firebase$client$core$operation$Operation$OperationType>
	//*   5   12:aload_2         
	//*   6   13:invokevirtual   #338 <Method com.firebase.client.core.operation.Operation$OperationType Operation.getType()>
	//*   7   16:invokevirtual   #343 <Method int com.firebase.client.core.operation.Operation$OperationType.ordinal()>
	//*   8   19:iaload          
		{
	//*   9   20:tableswitch     1 4: default 52
	//	               1 252
	//	               2 159
	//	               3 107
	//	               4 89
		default:
			viewcache = ((ViewCache) (new StringBuilder()));
	//   10   52:new             #345 <Class StringBuilder>
	//   11   55:dup             
	//   12   56:invokespecial   #346 <Method void StringBuilder()>
	//   13   59:astore_1        
			((StringBuilder) (viewcache)).append("Unknown operation: ");
	//   14   60:aload_1         
	//   15   61:ldc2            #348 <String "Unknown operation: ">
	//   16   64:invokevirtual   #352 <Method StringBuilder StringBuilder.append(String)>
	//   17   67:pop             
			((StringBuilder) (viewcache)).append(((Object) (operation.getType())));
	//   18   68:aload_1         
	//   19   69:aload_2         
	//   20   70:invokevirtual   #338 <Method com.firebase.client.core.operation.Operation$OperationType Operation.getType()>
	//   21   73:invokevirtual   #355 <Method StringBuilder StringBuilder.append(Object)>
	//   22   76:pop             
			throw new AssertionError(((Object) (((StringBuilder) (viewcache)).toString())));
	//   23   77:new             #357 <Class AssertionError>
	//   24   80:dup             
	//   25   81:aload_1         
	//   26   82:invokevirtual   #361 <Method String StringBuilder.toString()>
	//   27   85:invokespecial   #364 <Method void AssertionError(Object)>
	//   28   88:athrow          

		case 4: // '\004'
			operation = ((Operation) (listenComplete(viewcache, operation.getPath(), writetreeref, node, childchangeaccumulator)));
	//   29   89:aload_0         
	//   30   90:aload_1         
	//   31   91:aload_2         
	//   32   92:invokevirtual   #367 <Method Path Operation.getPath()>
	//   33   95:aload_3         
	//   34   96:aload           4
	//   35   98:aload           6
	//   36  100:invokespecial   #369 <Method ViewCache listenComplete(ViewCache, Path, WriteTreeRef, Node, ChildChangeAccumulator)>
	//   37  103:astore_2        
			break;
	//   38  104:goto            352

		case 3: // '\003'
			operation = ((Operation) ((AckUserWrite)operation));
	//   39  107:aload_2         
	//   40  108:checkcast       #371 <Class AckUserWrite>
	//   41  111:astore_2        
			if(!((AckUserWrite) (operation)).isRevert())
	//*  42  112:aload_2         
	//*  43  113:invokevirtual   #374 <Method boolean AckUserWrite.isRevert()>
	//*  44  116:ifne            141
				operation = ((Operation) (ackUserWrite(viewcache, ((AckUserWrite) (operation)).getPath(), ((AckUserWrite) (operation)).getAffectedTree(), writetreeref, node, childchangeaccumulator)));
	//   45  119:aload_0         
	//   46  120:aload_1         
	//   47  121:aload_2         
	//   48  122:invokevirtual   #375 <Method Path AckUserWrite.getPath()>
	//   49  125:aload_2         
	//   50  126:invokevirtual   #379 <Method ImmutableTree AckUserWrite.getAffectedTree()>
	//   51  129:aload_3         
	//   52  130:aload           4
	//   53  132:aload           6
	//   54  134:invokespecial   #381 <Method ViewCache ackUserWrite(ViewCache, Path, ImmutableTree, WriteTreeRef, Node, ChildChangeAccumulator)>
	//   55  137:astore_2        
			else
	//*  56  138:goto            352
				operation = ((Operation) (revertUserWrite(viewcache, ((AckUserWrite) (operation)).getPath(), writetreeref, node, childchangeaccumulator)));
	//   57  141:aload_0         
	//   58  142:aload_1         
	//   59  143:aload_2         
	//   60  144:invokevirtual   #375 <Method Path AckUserWrite.getPath()>
	//   61  147:aload_3         
	//   62  148:aload           4
	//   63  150:aload           6
	//   64  152:invokevirtual   #384 <Method ViewCache revertUserWrite(ViewCache, Path, WriteTreeRef, Node, ChildChangeAccumulator)>
	//   65  155:astore_2        
			break;
	//   66  156:goto            352

		case 2: // '\002'
			operation = ((Operation) ((Merge)operation));
	//   67  159:aload_2         
	//   68  160:checkcast       #386 <Class Merge>
	//   69  163:astore_2        
			if(((Merge) (operation)).getSource().isFromUser())
	//*  70  164:aload_2         
	//*  71  165:invokevirtual   #390 <Method OperationSource Merge.getSource()>
	//*  72  168:invokevirtual   #395 <Method boolean OperationSource.isFromUser()>
	//*  73  171:ifeq            196
			{
				operation = ((Operation) (applyUserMerge(viewcache, ((Merge) (operation)).getPath(), ((Merge) (operation)).getChildren(), writetreeref, node, childchangeaccumulator)));
	//   74  174:aload_0         
	//   75  175:aload_1         
	//   76  176:aload_2         
	//   77  177:invokevirtual   #396 <Method Path Merge.getPath()>
	//   78  180:aload_2         
	//   79  181:invokevirtual   #399 <Method CompoundWrite Merge.getChildren()>
	//   80  184:aload_3         
	//   81  185:aload           4
	//   82  187:aload           6
	//   83  189:invokespecial   #401 <Method ViewCache applyUserMerge(ViewCache, Path, CompoundWrite, WriteTreeRef, Node, ChildChangeAccumulator)>
	//   84  192:astore_2        
				break;
	//   85  193:goto            352
			}
			boolean flag;
			if(!((Merge) (operation)).getSource().isTagged() && !viewcache.getServerCache().isFiltered())
	//*  86  196:aload_2         
	//*  87  197:invokevirtual   #390 <Method OperationSource Merge.getSource()>
	//*  88  200:invokevirtual   #404 <Method boolean OperationSource.isTagged()>
	//*  89  203:ifne            225
	//*  90  206:aload_1         
	//*  91  207:invokevirtual   #47  <Method CacheNode ViewCache.getServerCache()>
	//*  92  210:invokevirtual   #53  <Method boolean CacheNode.isFiltered()>
	//*  93  213:ifeq            219
	//*  94  216:goto            225
				flag = false;
	//   95  219:iconst_0        
	//   96  220:istore          5
			else
	//*  97  222:goto            228
				flag = true;
	//   98  225:iconst_1        
	//   99  226:istore          5
			operation = ((Operation) (applyServerMerge(viewcache, ((Merge) (operation)).getPath(), ((Merge) (operation)).getChildren(), writetreeref, node, flag, childchangeaccumulator)));
	//  100  228:aload_0         
	//  101  229:aload_1         
	//  102  230:aload_2         
	//  103  231:invokevirtual   #396 <Method Path Merge.getPath()>
	//  104  234:aload_2         
	//  105  235:invokevirtual   #399 <Method CompoundWrite Merge.getChildren()>
	//  106  238:aload_3         
	//  107  239:aload           4
	//  108  241:iload           5
	//  109  243:aload           6
	//  110  245:invokespecial   #117 <Method ViewCache applyServerMerge(ViewCache, Path, CompoundWrite, WriteTreeRef, Node, boolean, ChildChangeAccumulator)>
	//  111  248:astore_2        
			break;
	//  112  249:goto            352

		case 1: // '\001'
			operation = ((Operation) ((Overwrite)operation));
	//  113  252:aload_2         
	//  114  253:checkcast       #406 <Class Overwrite>
	//  115  256:astore_2        
			if(((Overwrite) (operation)).getSource().isFromUser())
	//* 116  257:aload_2         
	//* 117  258:invokevirtual   #407 <Method OperationSource Overwrite.getSource()>
	//* 118  261:invokevirtual   #395 <Method boolean OperationSource.isFromUser()>
	//* 119  264:ifeq            289
			{
				operation = ((Operation) (applyUserOverwrite(viewcache, ((Overwrite) (operation)).getPath(), ((Overwrite) (operation)).getSnapshot(), writetreeref, node, childchangeaccumulator)));
	//  120  267:aload_0         
	//  121  268:aload_1         
	//  122  269:aload_2         
	//  123  270:invokevirtual   #408 <Method Path Overwrite.getPath()>
	//  124  273:aload_2         
	//  125  274:invokevirtual   #411 <Method Node Overwrite.getSnapshot()>
	//  126  277:aload_3         
	//  127  278:aload           4
	//  128  280:aload           6
	//  129  282:invokespecial   #251 <Method ViewCache applyUserOverwrite(ViewCache, Path, Node, WriteTreeRef, Node, ChildChangeAccumulator)>
	//  130  285:astore_2        
				break;
	//  131  286:goto            352
			}
			boolean flag1;
			if(!((Overwrite) (operation)).getSource().isTagged() && (!viewcache.getServerCache().isFiltered() || ((Overwrite) (operation)).getPath().isEmpty()))
	//* 132  289:aload_2         
	//* 133  290:invokevirtual   #407 <Method OperationSource Overwrite.getSource()>
	//* 134  293:invokevirtual   #404 <Method boolean OperationSource.isTagged()>
	//* 135  296:ifne            328
	//* 136  299:aload_1         
	//* 137  300:invokevirtual   #47  <Method CacheNode ViewCache.getServerCache()>
	//* 138  303:invokevirtual   #53  <Method boolean CacheNode.isFiltered()>
	//* 139  306:ifeq            322
	//* 140  309:aload_2         
	//* 141  310:invokevirtual   #408 <Method Path Overwrite.getPath()>
	//* 142  313:invokevirtual   #64  <Method boolean Path.isEmpty()>
	//* 143  316:ifne            322
	//* 144  319:goto            328
				flag1 = false;
	//  145  322:iconst_0        
	//  146  323:istore          5
			else
	//* 147  325:goto            331
				flag1 = true;
	//  148  328:iconst_1        
	//  149  329:istore          5
			operation = ((Operation) (applyServerOverwrite(viewcache, ((Overwrite) (operation)).getPath(), ((Overwrite) (operation)).getSnapshot(), writetreeref, node, flag1, childchangeaccumulator)));
	//  150  331:aload_0         
	//  151  332:aload_1         
	//  152  333:aload_2         
	//  153  334:invokevirtual   #408 <Method Path Overwrite.getPath()>
	//  154  337:aload_2         
	//  155  338:invokevirtual   #411 <Method Node Overwrite.getSnapshot()>
	//  156  341:aload_3         
	//  157  342:aload           4
	//  158  344:iload           5
	//  159  346:aload           6
	//  160  348:invokespecial   #84  <Method ViewCache applyServerOverwrite(ViewCache, Path, Node, WriteTreeRef, Node, boolean, ChildChangeAccumulator)>
	//  161  351:astore_2        
			break;
		}
		writetreeref = ((WriteTreeRef) (new ArrayList(((java.util.Collection) (childchangeaccumulator.getChanges())))));
	//  162  352:new             #413 <Class ArrayList>
	//  163  355:dup             
	//  164  356:aload           6
	//  165  358:invokevirtual   #417 <Method List ChildChangeAccumulator.getChanges()>
	//  166  361:invokespecial   #420 <Method void ArrayList(java.util.Collection)>
	//  167  364:astore_3        
		maybeAddValueEvent(viewcache, ((ViewCache) (operation)), ((List) (writetreeref)));
	//  168  365:aload_0         
	//  169  366:aload_1         
	//  170  367:aload_2         
	//  171  368:aload_3         
	//  172  369:invokespecial   #422 <Method void maybeAddValueEvent(ViewCache, ViewCache, List)>
		return new ProcessorResult(((ViewCache) (operation)), ((List) (writetreeref)));
	//  173  372:new             #10  <Class ViewProcessor$ProcessorResult>
	//  174  375:dup             
	//  175  376:aload_2         
	//  176  377:aload_3         
	//  177  378:invokespecial   #425 <Method void ViewProcessor$ProcessorResult(ViewCache, List)>
	//  178  381:areturn         
	}

	public ViewCache revertUserWrite(ViewCache viewcache, Path path, WriteTreeRef writetreeref, Node node, ChildChangeAccumulator childchangeaccumulator)
	{
		if(writetreeref.shadowingWrite(path) != null)
	//*   0    0:aload_3         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #41  <Method Node WriteTreeRef.shadowingWrite(Path)>
	//*   3    5:ifnull          10
			return viewcache;
	//    4    8:aload_1         
	//    5    9:areturn         
		WriteTreeCompleteChildSource writetreecompletechildsource = new WriteTreeCompleteChildSource(writetreeref, viewcache, node);
	//    6   10:new             #13  <Class ViewProcessor$WriteTreeCompleteChildSource>
	//    7   13:dup             
	//    8   14:aload_3         
	//    9   15:aload_1         
	//   10   16:aload           4
	//   11   18:invokespecial   #236 <Method void ViewProcessor$WriteTreeCompleteChildSource(WriteTreeRef, ViewCache, Node)>
	//   12   21:astore          9
		IndexedNode indexednode = viewcache.getEventCache().getIndexedNode();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #254 <Method CacheNode ViewCache.getEventCache()>
	//   15   27:invokevirtual   #184 <Method IndexedNode CacheNode.getIndexedNode()>
	//   16   30:astore          8
		if(!path.isEmpty() && !path.getFront().isPriorityChildName())
	//*  17   32:aload_2         
	//*  18   33:invokevirtual   #64  <Method boolean Path.isEmpty()>
	//*  19   36:ifne            278
	//*  20   39:aload_2         
	//*  21   40:invokevirtual   #204 <Method ChildKey Path.getFront()>
	//*  22   43:invokevirtual   #222 <Method boolean ChildKey.isPriorityChildName()>
	//*  23   46:ifeq            52
	//*  24   49:goto            278
		{
			ChildKey childkey = path.getFront();
	//   25   52:aload_2         
	//   26   53:invokevirtual   #204 <Method ChildKey Path.getFront()>
	//   27   56:astore          10
			Node node1 = writetreeref.calcCompleteChild(childkey, viewcache.getServerCache());
	//   28   58:aload_3         
	//   29   59:aload           10
	//   30   61:aload_1         
	//   31   62:invokevirtual   #47  <Method CacheNode ViewCache.getServerCache()>
	//   32   65:invokevirtual   #297 <Method Node WriteTreeRef.calcCompleteChild(ChildKey, CacheNode)>
	//   33   68:astore          7
			if(node1 == null && viewcache.getServerCache().isCompleteForChild(childkey))
	//*  34   70:aload           7
	//*  35   72:ifnonnull       104
	//*  36   75:aload_1         
	//*  37   76:invokevirtual   #47  <Method CacheNode ViewCache.getServerCache()>
	//*  38   79:aload           10
	//*  39   81:invokevirtual   #171 <Method boolean CacheNode.isCompleteForChild(ChildKey)>
	//*  40   84:ifeq            104
				node1 = indexednode.getNode().getImmediateChild(childkey);
	//   41   87:aload           8
	//   42   89:invokevirtual   #426 <Method Node IndexedNode.getNode()>
	//   43   92:aload           10
	//   44   94:invokeinterface #160 <Method Node Node.getImmediateChild(ChildKey)>
	//   45   99:astore          7
	//*  46  101:goto            104
			if(node1 != null)
	//*  47  104:aload           7
	//*  48  106:ifnull          137
			{
				node = ((Node) (filter.updateChild(indexednode, childkey, node1, path.popFront(), ((com.firebase.client.core.view.filter.NodeFilter.CompleteChildSource) (writetreecompletechildsource)), childchangeaccumulator)));
	//   49  109:aload_0         
	//   50  110:getfield        #33  <Field NodeFilter filter>
	//   51  113:aload           8
	//   52  115:aload           10
	//   53  117:aload           7
	//   54  119:aload_2         
	//   55  120:invokevirtual   #208 <Method Path Path.popFront()>
	//   56  123:aload           9
	//   57  125:aload           5
	//   58  127:invokeinterface #229 <Method IndexedNode NodeFilter.updateChild(IndexedNode, ChildKey, Node, Path, com.firebase.client.core.view.filter.NodeFilter$CompleteChildSource, ChildChangeAccumulator)>
	//   59  132:astore          4
			} else
	//*  60  134:goto            193
			{
				node = ((Node) (indexednode));
	//   61  137:aload           8
	//   62  139:astore          4
				if(node1 == null)
	//*  63  141:aload           7
	//*  64  143:ifnonnull       193
				{
					node = ((Node) (indexednode));
	//   65  146:aload           8
	//   66  148:astore          4
					if(viewcache.getEventCache().getNode().hasChild(childkey))
	//*  67  150:aload_1         
	//*  68  151:invokevirtual   #254 <Method CacheNode ViewCache.getEventCache()>
	//*  69  154:invokevirtual   #75  <Method Node CacheNode.getNode()>
	//*  70  157:aload           10
	//*  71  159:invokeinterface #156 <Method boolean Node.hasChild(ChildKey)>
	//*  72  164:ifeq            193
						node = ((Node) (filter.updateChild(indexednode, childkey, ((Node) (EmptyNode.Empty())), path.popFront(), ((com.firebase.client.core.view.filter.NodeFilter.CompleteChildSource) (writetreecompletechildsource)), childchangeaccumulator)));
	//   73  167:aload_0         
	//   74  168:getfield        #33  <Field NodeFilter filter>
	//   75  171:aload           8
	//   76  173:aload           10
	//   77  175:invokestatic    #274 <Method EmptyNode EmptyNode.Empty()>
	//   78  178:aload_2         
	//   79  179:invokevirtual   #208 <Method Path Path.popFront()>
	//   80  182:aload           9
	//   81  184:aload           5
	//   82  186:invokeinterface #229 <Method IndexedNode NodeFilter.updateChild(IndexedNode, ChildKey, Node, Path, com.firebase.client.core.view.filter.NodeFilter$CompleteChildSource, ChildChangeAccumulator)>
	//   83  191:astore          4
				}
			}
			path = ((Path) (node));
	//   84  193:aload           4
	//   85  195:astore_2        
			if(((IndexedNode) (node)).getNode().isEmpty())
	//*  86  196:aload           4
	//*  87  198:invokevirtual   #426 <Method Node IndexedNode.getNode()>
	//*  88  201:invokeinterface #133 <Method boolean Node.isEmpty()>
	//*  89  206:ifeq            341
			{
				path = ((Path) (node));
	//   90  209:aload           4
	//   91  211:astore_2        
				if(viewcache.getServerCache().isFullyInitialized())
	//*  92  212:aload_1         
	//*  93  213:invokevirtual   #47  <Method CacheNode ViewCache.getServerCache()>
	//*  94  216:invokevirtual   #67  <Method boolean CacheNode.isFullyInitialized()>
	//*  95  219:ifeq            341
				{
					Node node2 = writetreeref.calcCompleteEventCache(viewcache.getCompleteServerSnap());
	//   96  222:aload_3         
	//   97  223:aload_1         
	//   98  224:invokevirtual   #281 <Method Node ViewCache.getCompleteServerSnap()>
	//   99  227:invokevirtual   #289 <Method Node WriteTreeRef.calcCompleteEventCache(Node)>
	//  100  230:astore          7
					path = ((Path) (node));
	//  101  232:aload           4
	//  102  234:astore_2        
					if(node2.isLeafNode())
	//* 103  235:aload           7
	//* 104  237:invokeinterface #304 <Method boolean Node.isLeafNode()>
	//* 105  242:ifeq            341
					{
						path = ((Path) (IndexedNode.from(node2, filter.getIndex())));
	//  106  245:aload           7
	//  107  247:aload_0         
	//  108  248:getfield        #33  <Field NodeFilter filter>
	//  109  251:invokeinterface #188 <Method Index NodeFilter.getIndex()>
	//  110  256:invokestatic    #194 <Method IndexedNode IndexedNode.from(Node, Index)>
	//  111  259:astore_2        
						path = ((Path) (filter.updateFullNode(((IndexedNode) (node)), ((IndexedNode) (path)), childchangeaccumulator)));
	//  112  260:aload_0         
	//  113  261:getfield        #33  <Field NodeFilter filter>
	//  114  264:aload           4
	//  115  266:aload_2         
	//  116  267:aload           5
	//  117  269:invokeinterface #198 <Method IndexedNode NodeFilter.updateFullNode(IndexedNode, IndexedNode, ChildChangeAccumulator)>
	//  118  274:astore_2        
					}
				}
			}
		} else
	//* 119  275:goto            341
		{
			if(viewcache.getServerCache().isFullyInitialized())
	//* 120  278:aload_1         
	//* 121  279:invokevirtual   #47  <Method CacheNode ViewCache.getServerCache()>
	//* 122  282:invokevirtual   #67  <Method boolean CacheNode.isFullyInitialized()>
	//* 123  285:ifeq            300
				path = ((Path) (writetreeref.calcCompleteEventCache(viewcache.getCompleteServerSnap())));
	//  124  288:aload_3         
	//  125  289:aload_1         
	//  126  290:invokevirtual   #281 <Method Node ViewCache.getCompleteServerSnap()>
	//  127  293:invokevirtual   #289 <Method Node WriteTreeRef.calcCompleteEventCache(Node)>
	//  128  296:astore_2        
			else
	//* 129  297:goto            312
				path = ((Path) (writetreeref.calcCompleteEventChildren(viewcache.getServerCache().getNode())));
	//  130  300:aload_3         
	//  131  301:aload_1         
	//  132  302:invokevirtual   #47  <Method CacheNode ViewCache.getServerCache()>
	//  133  305:invokevirtual   #75  <Method Node CacheNode.getNode()>
	//  134  308:invokevirtual   #286 <Method Node WriteTreeRef.calcCompleteEventChildren(Node)>
	//  135  311:astore_2        
			path = ((Path) (IndexedNode.from(((Node) (path)), filter.getIndex())));
	//  136  312:aload_2         
	//  137  313:aload_0         
	//  138  314:getfield        #33  <Field NodeFilter filter>
	//  139  317:invokeinterface #188 <Method Index NodeFilter.getIndex()>
	//  140  322:invokestatic    #194 <Method IndexedNode IndexedNode.from(Node, Index)>
	//  141  325:astore_2        
			path = ((Path) (filter.updateFullNode(indexednode, ((IndexedNode) (path)), childchangeaccumulator)));
	//  142  326:aload_0         
	//  143  327:getfield        #33  <Field NodeFilter filter>
	//  144  330:aload           8
	//  145  332:aload_2         
	//  146  333:aload           5
	//  147  335:invokeinterface #198 <Method IndexedNode NodeFilter.updateFullNode(IndexedNode, IndexedNode, ChildChangeAccumulator)>
	//  148  340:astore_2        
		}
		boolean flag;
		if(!viewcache.getServerCache().isFullyInitialized() && writetreeref.shadowingWrite(Path.getEmptyPath()) == null)
	//* 149  341:aload_1         
	//* 150  342:invokevirtual   #47  <Method CacheNode ViewCache.getServerCache()>
	//* 151  345:invokevirtual   #67  <Method boolean CacheNode.isFullyInitialized()>
	//* 152  348:ifne            370
	//* 153  351:aload_3         
	//* 154  352:invokestatic    #429 <Method Path Path.getEmptyPath()>
	//* 155  355:invokevirtual   #41  <Method Node WriteTreeRef.shadowingWrite(Path)>
	//* 156  358:ifnull          364
	//* 157  361:goto            370
			flag = false;
	//  158  364:iconst_0        
	//  159  365:istore          6
		else
	//* 160  367:goto            373
			flag = true;
	//  161  370:iconst_1        
	//  162  371:istore          6
		return viewcache.updateEventSnap(((IndexedNode) (path)), flag, filter.filtersNodes());
	//  163  373:aload_1         
	//  164  374:aload_2         
	//  165  375:iload           6
	//  166  377:aload_0         
	//  167  378:getfield        #33  <Field NodeFilter filter>
	//  168  381:invokeinterface #201 <Method boolean NodeFilter.filtersNodes()>
	//  169  386:invokevirtual   #257 <Method ViewCache ViewCache.updateEventSnap(IndexedNode, boolean, boolean)>
	//  170  389:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private static com.firebase.client.core.view.filter.NodeFilter.CompleteChildSource NO_COMPLETE_SOURCE = new com.firebase.client.core.view.filter.NodeFilter.CompleteChildSource() {

		public NamedNode getChildAfterChild(Index index, NamedNode namednode, boolean flag)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public Node getCompleteChild(ChildKey childkey)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

	}
;
	private final NodeFilter filter;

	static 
	{
	//    0    0:new             #6   <Class ViewProcessor$1>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void ViewProcessor$1()>
	//    3    7:putstatic       #28  <Field com.firebase.client.core.view.filter.NodeFilter$CompleteChildSource NO_COMPLETE_SOURCE>
	//*   4   10:return          
	}
}
