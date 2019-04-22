// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view.filter;

import com.firebase.client.core.Path;
import com.firebase.client.core.view.QueryParams;
import com.firebase.client.snapshot.*;
import java.util.Iterator;

// Referenced classes of package com.firebase.client.core.view.filter:
//			NodeFilter, IndexedFilter, ChildChangeAccumulator

public class RangedFilter
	implements NodeFilter
{

	public RangedFilter(QueryParams queryparams)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		indexedFilter = new IndexedFilter(queryparams.getIndex());
	//    2    4:aload_0         
	//    3    5:new             #20  <Class IndexedFilter>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokevirtual   #26  <Method Index QueryParams.getIndex()>
	//    7   13:invokespecial   #29  <Method void IndexedFilter(Index)>
	//    8   16:putfield        #31  <Field IndexedFilter indexedFilter>
		index = queryparams.getIndex();
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #26  <Method Index QueryParams.getIndex()>
	//   12   24:putfield        #33  <Field Index index>
		startPost = getStartPost(queryparams);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:invokestatic    #37  <Method NamedNode getStartPost(QueryParams)>
	//   16   32:putfield        #39  <Field NamedNode startPost>
		endPost = getEndPost(queryparams);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:invokestatic    #42  <Method NamedNode getEndPost(QueryParams)>
	//   20   40:putfield        #44  <Field NamedNode endPost>
	//   21   43:return          
	}

	private static NamedNode getEndPost(QueryParams queryparams)
	{
		if(queryparams.hasEnd())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #49  <Method boolean QueryParams.hasEnd()>
	//*   2    4:ifeq            25
		{
			ChildKey childkey = queryparams.getIndexEndName();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #53  <Method ChildKey QueryParams.getIndexEndName()>
	//    5   11:astore_1        
			return queryparams.getIndex().makePost(childkey, queryparams.getIndexEndValue());
	//    6   12:aload_0         
	//    7   13:invokevirtual   #26  <Method Index QueryParams.getIndex()>
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #57  <Method Node QueryParams.getIndexEndValue()>
	//   11   21:invokevirtual   #63  <Method NamedNode Index.makePost(ChildKey, Node)>
	//   12   24:areturn         
		} else
		{
			return queryparams.getIndex().maxPost();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #26  <Method Index QueryParams.getIndex()>
	//   15   29:invokevirtual   #67  <Method NamedNode Index.maxPost()>
	//   16   32:areturn         
		}
	}

	private static NamedNode getStartPost(QueryParams queryparams)
	{
		if(queryparams.hasStart())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #70  <Method boolean QueryParams.hasStart()>
	//*   2    4:ifeq            25
		{
			ChildKey childkey = queryparams.getIndexStartName();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #73  <Method ChildKey QueryParams.getIndexStartName()>
	//    5   11:astore_1        
			return queryparams.getIndex().makePost(childkey, queryparams.getIndexStartValue());
	//    6   12:aload_0         
	//    7   13:invokevirtual   #26  <Method Index QueryParams.getIndex()>
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #76  <Method Node QueryParams.getIndexStartValue()>
	//   11   21:invokevirtual   #63  <Method NamedNode Index.makePost(ChildKey, Node)>
	//   12   24:areturn         
		} else
		{
			return queryparams.getIndex().minPost();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #26  <Method Index QueryParams.getIndex()>
	//   15   29:invokevirtual   #79  <Method NamedNode Index.minPost()>
	//   16   32:areturn         
		}
	}

	public boolean filtersNodes()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public NamedNode getEndPost()
	{
		return endPost;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field NamedNode endPost>
	//    2    4:areturn         
	}

	public Index getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Index index>
	//    2    4:areturn         
	}

	public NodeFilter getIndexedFilter()
	{
		return ((NodeFilter) (indexedFilter));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field IndexedFilter indexedFilter>
	//    2    4:areturn         
	}

	public NamedNode getStartPost()
	{
		return startPost;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field NamedNode startPost>
	//    2    4:areturn         
	}

	public boolean matches(NamedNode namednode)
	{
		return index.compare(((Object) (getStartPost())), ((Object) (namednode))) <= 0 && index.compare(((Object) (namednode)), ((Object) (getEndPost()))) <= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Index index>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #86  <Method NamedNode getStartPost()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #90  <Method int Index.compare(Object, Object)>
	//    6   12:ifgt            32
	//    7   15:aload_0         
	//    8   16:getfield        #33  <Field Index index>
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #92  <Method NamedNode getEndPost()>
	//   12   24:invokevirtual   #90  <Method int Index.compare(Object, Object)>
	//   13   27:ifgt            32
	//   14   30:iconst_1        
	//   15   31:ireturn         
	//   16   32:iconst_0        
	//   17   33:ireturn         
	}

	public IndexedNode updateChild(IndexedNode indexednode, ChildKey childkey, Node node, Path path, NodeFilter.CompleteChildSource completechildsource, ChildChangeAccumulator childchangeaccumulator)
	{
		if(!matches(new NamedNode(childkey, node)))
	//*   0    0:aload_0         
	//*   1    1:new             #96  <Class NamedNode>
	//*   2    4:dup             
	//*   3    5:aload_2         
	//*   4    6:aload_3         
	//*   5    7:invokespecial   #99  <Method void NamedNode(ChildKey, Node)>
	//*   6   10:invokevirtual   #101 <Method boolean matches(NamedNode)>
	//*   7   13:ifne            23
			node = ((Node) (EmptyNode.Empty()));
	//    8   16:invokestatic    #107 <Method EmptyNode EmptyNode.Empty()>
	//    9   19:astore_3        
	//*  10   20:goto            23
		return indexedFilter.updateChild(indexednode, childkey, node, path, completechildsource, childchangeaccumulator);
	//   11   23:aload_0         
	//   12   24:getfield        #31  <Field IndexedFilter indexedFilter>
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:aload_3         
	//   16   30:aload           4
	//   17   32:aload           5
	//   18   34:aload           6
	//   19   36:invokevirtual   #109 <Method IndexedNode IndexedFilter.updateChild(IndexedNode, ChildKey, Node, Path, NodeFilter$CompleteChildSource, ChildChangeAccumulator)>
	//   20   39:areturn         
	}

	public IndexedNode updateFullNode(IndexedNode indexednode, IndexedNode indexednode1, ChildChangeAccumulator childchangeaccumulator)
	{
		if(indexednode1.getNode().isLeafNode())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #116 <Method Node IndexedNode.getNode()>
	//*   2    4:invokeinterface #121 <Method boolean Node.isLeafNode()>
	//*   3    9:ifeq            26
		{
			indexednode1 = IndexedNode.from(((Node) (EmptyNode.Empty())), index);
	//    4   12:invokestatic    #107 <Method EmptyNode EmptyNode.Empty()>
	//    5   15:aload_0         
	//    6   16:getfield        #33  <Field Index index>
	//    7   19:invokestatic    #125 <Method IndexedNode IndexedNode.from(Node, Index)>
	//    8   22:astore_2        
		} else
	//*   9   23:goto            91
		{
			IndexedNode indexednode2 = indexednode1.updatePriority(PriorityUtilities.NullPriority());
	//   10   26:aload_2         
	//   11   27:invokestatic    #130 <Method Node PriorityUtilities.NullPriority()>
	//   12   30:invokevirtual   #134 <Method IndexedNode IndexedNode.updatePriority(Node)>
	//   13   33:astore          4
			Iterator iterator = indexednode1.iterator();
	//   14   35:aload_2         
	//   15   36:invokevirtual   #138 <Method Iterator IndexedNode.iterator()>
	//   16   39:astore          5
			indexednode1 = indexednode2;
	//   17   41:aload           4
	//   18   43:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//   19   44:aload           5
	//   20   46:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//   21   51:ifeq            91
				NamedNode namednode = (NamedNode)iterator.next();
	//   22   54:aload           5
	//   23   56:invokeinterface #147 <Method Object Iterator.next()>
	//   24   61:checkcast       #96  <Class NamedNode>
	//   25   64:astore          4
				if(!matches(namednode))
	//*  26   66:aload_0         
	//*  27   67:aload           4
	//*  28   69:invokevirtual   #101 <Method boolean matches(NamedNode)>
	//*  29   72:ifne            44
					indexednode1 = indexednode1.updateChild(namednode.getName(), ((Node) (EmptyNode.Empty())));
	//   30   75:aload_2         
	//   31   76:aload           4
	//   32   78:invokevirtual   #150 <Method ChildKey NamedNode.getName()>
	//   33   81:invokestatic    #107 <Method EmptyNode EmptyNode.Empty()>
	//   34   84:invokevirtual   #153 <Method IndexedNode IndexedNode.updateChild(ChildKey, Node)>
	//   35   87:astore_2        
			} while(true);
	//   36   88:goto            44
		}
		return indexedFilter.updateFullNode(indexednode, indexednode1, childchangeaccumulator);
	//   37   91:aload_0         
	//   38   92:getfield        #31  <Field IndexedFilter indexedFilter>
	//   39   95:aload_1         
	//   40   96:aload_2         
	//   41   97:aload_3         
	//   42   98:invokevirtual   #155 <Method IndexedNode IndexedFilter.updateFullNode(IndexedNode, IndexedNode, ChildChangeAccumulator)>
	//   43  101:areturn         
	}

	public IndexedNode updatePriority(IndexedNode indexednode, Node node)
	{
		return indexednode;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	private final NamedNode endPost;
	private final Index index;
	private final IndexedFilter indexedFilter;
	private final NamedNode startPost;
}
