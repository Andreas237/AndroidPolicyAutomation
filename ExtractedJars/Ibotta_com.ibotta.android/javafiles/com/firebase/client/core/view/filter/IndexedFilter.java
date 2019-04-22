// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view.filter;

import com.firebase.client.core.Path;
import com.firebase.client.core.view.Change;
import com.firebase.client.snapshot.*;
import java.util.Iterator;

// Referenced classes of package com.firebase.client.core.view.filter:
//			NodeFilter, ChildChangeAccumulator

public class IndexedFilter
	implements NodeFilter
{

	public IndexedFilter(Index index1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		index = index1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Index index>
	//    5    9:return          
	}

	public boolean filtersNodes()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Index getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Index index>
	//    2    4:areturn         
	}

	public NodeFilter getIndexedFilter()
	{
		return ((NodeFilter) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public IndexedNode updateChild(IndexedNode indexednode, ChildKey childkey, Node node, Path path, NodeFilter.CompleteChildSource completechildsource, ChildChangeAccumulator childchangeaccumulator)
	{
		completechildsource = ((NodeFilter.CompleteChildSource) (indexednode.getNode()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #34  <Method Node IndexedNode.getNode()>
	//    2    4:astore          5
		Node node1 = ((Node) (completechildsource)).getImmediateChild(childkey);
	//    3    6:aload           5
	//    4    8:aload_2         
	//    5    9:invokeinterface #40  <Method Node Node.getImmediateChild(ChildKey)>
	//    6   14:astore          7
		if(((Object) (node1.getChild(path))).equals(((Object) (node.getChild(path)))) && node1.isEmpty() == node.isEmpty())
	//*   7   16:aload           7
	//*   8   18:aload           4
	//*   9   20:invokeinterface #44  <Method Node Node.getChild(Path)>
	//*  10   25:aload_3         
	//*  11   26:aload           4
	//*  12   28:invokeinterface #44  <Method Node Node.getChild(Path)>
	//*  13   33:invokevirtual   #48  <Method boolean Object.equals(Object)>
	//*  14   36:ifeq            57
	//*  15   39:aload           7
	//*  16   41:invokeinterface #51  <Method boolean Node.isEmpty()>
	//*  17   46:aload_3         
	//*  18   47:invokeinterface #51  <Method boolean Node.isEmpty()>
	//*  19   52:icmpne          57
			return indexednode;
	//   20   55:aload_1         
	//   21   56:areturn         
		if(childchangeaccumulator != null)
	//*  22   57:aload           6
	//*  23   59:ifnull          131
			if(node.isEmpty())
	//*  24   62:aload_3         
	//*  25   63:invokeinterface #51  <Method boolean Node.isEmpty()>
	//*  26   68:ifeq            96
			{
				if(((Node) (completechildsource)).hasChild(childkey))
	//*  27   71:aload           5
	//*  28   73:aload_2         
	//*  29   74:invokeinterface #55  <Method boolean Node.hasChild(ChildKey)>
	//*  30   79:ifeq            131
					childchangeaccumulator.trackChildChange(Change.childRemovedChange(childkey, node1));
	//   31   82:aload           6
	//   32   84:aload_2         
	//   33   85:aload           7
	//   34   87:invokestatic    #61  <Method Change Change.childRemovedChange(ChildKey, Node)>
	//   35   90:invokevirtual   #67  <Method void ChildChangeAccumulator.trackChildChange(Change)>
			} else
	//*  36   93:goto            131
			if(node1.isEmpty())
	//*  37   96:aload           7
	//*  38   98:invokeinterface #51  <Method boolean Node.isEmpty()>
	//*  39  103:ifeq            119
				childchangeaccumulator.trackChildChange(Change.childAddedChange(childkey, node));
	//   40  106:aload           6
	//   41  108:aload_2         
	//   42  109:aload_3         
	//   43  110:invokestatic    #70  <Method Change Change.childAddedChange(ChildKey, Node)>
	//   44  113:invokevirtual   #67  <Method void ChildChangeAccumulator.trackChildChange(Change)>
			else
	//*  45  116:goto            131
				childchangeaccumulator.trackChildChange(Change.childChangedChange(childkey, node, node1));
	//   46  119:aload           6
	//   47  121:aload_2         
	//   48  122:aload_3         
	//   49  123:aload           7
	//   50  125:invokestatic    #74  <Method Change Change.childChangedChange(ChildKey, Node, Node)>
	//   51  128:invokevirtual   #67  <Method void ChildChangeAccumulator.trackChildChange(Change)>
		if(((Node) (completechildsource)).isLeafNode() && node.isEmpty())
	//*  52  131:aload           5
	//*  53  133:invokeinterface #77  <Method boolean Node.isLeafNode()>
	//*  54  138:ifeq            152
	//*  55  141:aload_3         
	//*  56  142:invokeinterface #51  <Method boolean Node.isEmpty()>
	//*  57  147:ifeq            152
			return indexednode;
	//   58  150:aload_1         
	//   59  151:areturn         
		else
			return indexednode.updateChild(childkey, node);
	//   60  152:aload_1         
	//   61  153:aload_2         
	//   62  154:aload_3         
	//   63  155:invokevirtual   #80  <Method IndexedNode IndexedNode.updateChild(ChildKey, Node)>
	//   64  158:areturn         
	}

	public IndexedNode updateFullNode(IndexedNode indexednode, IndexedNode indexednode1, ChildChangeAccumulator childchangeaccumulator)
	{
		if(childchangeaccumulator != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          207
		{
			Iterator iterator = indexednode.getNode().iterator();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method Node IndexedNode.getNode()>
	//    4    8:invokeinterface #86  <Method Iterator Node.iterator()>
	//    5   13:astore          4
			do
			{
				if(!iterator.hasNext())
					break;
	//    6   15:aload           4
	//    7   17:invokeinterface #91  <Method boolean Iterator.hasNext()>
	//    8   22:ifeq            74
				NamedNode namednode = (NamedNode)iterator.next();
	//    9   25:aload           4
	//   10   27:invokeinterface #95  <Method Object Iterator.next()>
	//   11   32:checkcast       #97  <Class NamedNode>
	//   12   35:astore          5
				if(!indexednode1.getNode().hasChild(namednode.getName()))
	//*  13   37:aload_2         
	//*  14   38:invokevirtual   #34  <Method Node IndexedNode.getNode()>
	//*  15   41:aload           5
	//*  16   43:invokevirtual   #101 <Method ChildKey NamedNode.getName()>
	//*  17   46:invokeinterface #55  <Method boolean Node.hasChild(ChildKey)>
	//*  18   51:ifne            15
					childchangeaccumulator.trackChildChange(Change.childRemovedChange(namednode.getName(), namednode.getNode()));
	//   19   54:aload_3         
	//   20   55:aload           5
	//   21   57:invokevirtual   #101 <Method ChildKey NamedNode.getName()>
	//   22   60:aload           5
	//   23   62:invokevirtual   #102 <Method Node NamedNode.getNode()>
	//   24   65:invokestatic    #61  <Method Change Change.childRemovedChange(ChildKey, Node)>
	//   25   68:invokevirtual   #67  <Method void ChildChangeAccumulator.trackChildChange(Change)>
			} while(true);
	//   26   71:goto            15
			if(!indexednode1.getNode().isLeafNode())
	//*  27   74:aload_2         
	//*  28   75:invokevirtual   #34  <Method Node IndexedNode.getNode()>
	//*  29   78:invokeinterface #77  <Method boolean Node.isLeafNode()>
	//*  30   83:ifne            207
			{
				Iterator iterator1 = indexednode1.getNode().iterator();
	//   31   86:aload_2         
	//   32   87:invokevirtual   #34  <Method Node IndexedNode.getNode()>
	//   33   90:invokeinterface #86  <Method Iterator Node.iterator()>
	//   34   95:astore          4
				do
				{
					if(!iterator1.hasNext())
						break;
	//   35   97:aload           4
	//   36   99:invokeinterface #91  <Method boolean Iterator.hasNext()>
	//   37  104:ifeq            207
					NamedNode namednode1 = (NamedNode)iterator1.next();
	//   38  107:aload           4
	//   39  109:invokeinterface #95  <Method Object Iterator.next()>
	//   40  114:checkcast       #97  <Class NamedNode>
	//   41  117:astore          5
					if(indexednode.getNode().hasChild(namednode1.getName()))
	//*  42  119:aload_1         
	//*  43  120:invokevirtual   #34  <Method Node IndexedNode.getNode()>
	//*  44  123:aload           5
	//*  45  125:invokevirtual   #101 <Method ChildKey NamedNode.getName()>
	//*  46  128:invokeinterface #55  <Method boolean Node.hasChild(ChildKey)>
	//*  47  133:ifeq            187
					{
						Node node = indexednode.getNode().getImmediateChild(namednode1.getName());
	//   48  136:aload_1         
	//   49  137:invokevirtual   #34  <Method Node IndexedNode.getNode()>
	//   50  140:aload           5
	//   51  142:invokevirtual   #101 <Method ChildKey NamedNode.getName()>
	//   52  145:invokeinterface #40  <Method Node Node.getImmediateChild(ChildKey)>
	//   53  150:astore          6
						if(!((Object) (node)).equals(((Object) (namednode1.getNode()))))
	//*  54  152:aload           6
	//*  55  154:aload           5
	//*  56  156:invokevirtual   #102 <Method Node NamedNode.getNode()>
	//*  57  159:invokevirtual   #48  <Method boolean Object.equals(Object)>
	//*  58  162:ifne            97
							childchangeaccumulator.trackChildChange(Change.childChangedChange(namednode1.getName(), namednode1.getNode(), node));
	//   59  165:aload_3         
	//   60  166:aload           5
	//   61  168:invokevirtual   #101 <Method ChildKey NamedNode.getName()>
	//   62  171:aload           5
	//   63  173:invokevirtual   #102 <Method Node NamedNode.getNode()>
	//   64  176:aload           6
	//   65  178:invokestatic    #74  <Method Change Change.childChangedChange(ChildKey, Node, Node)>
	//   66  181:invokevirtual   #67  <Method void ChildChangeAccumulator.trackChildChange(Change)>
					} else
	//*  67  184:goto            97
					{
						childchangeaccumulator.trackChildChange(Change.childAddedChange(namednode1.getName(), namednode1.getNode()));
	//   68  187:aload_3         
	//   69  188:aload           5
	//   70  190:invokevirtual   #101 <Method ChildKey NamedNode.getName()>
	//   71  193:aload           5
	//   72  195:invokevirtual   #102 <Method Node NamedNode.getNode()>
	//   73  198:invokestatic    #70  <Method Change Change.childAddedChange(ChildKey, Node)>
	//   74  201:invokevirtual   #67  <Method void ChildChangeAccumulator.trackChildChange(Change)>
					}
				} while(true);
	//   75  204:goto            97
			}
		}
		return indexednode1;
	//   76  207:aload_2         
	//   77  208:areturn         
	}

	public IndexedNode updatePriority(IndexedNode indexednode, Node node)
	{
		if(indexednode.getNode().isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #34  <Method Node IndexedNode.getNode()>
	//*   2    4:invokeinterface #51  <Method boolean Node.isEmpty()>
	//*   3    9:ifeq            14
			return indexednode;
	//    4   12:aload_1         
	//    5   13:areturn         
		else
			return indexednode.updatePriority(node);
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:invokevirtual   #107 <Method IndexedNode IndexedNode.updatePriority(Node)>
	//    9   19:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private final Index index;

	static 
	{
	//    0    0:return          
	}
}
