// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;

import com.firebase.client.collection.ImmutableSortedSet;
import java.util.*;

// Referenced classes of package com.firebase.client.snapshot:
//			KeyIndex, Node, NamedNode, Index, 
//			PriorityIndex, ChildrenNode, ChildKey

public class IndexedNode
	implements Iterable
{

	private IndexedNode(Node node1, Index index1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		index = index1;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #37  <Field Index index>
		node = node1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #39  <Field Node node>
		indexed = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #41  <Field ImmutableSortedSet indexed>
	//   11   19:return          
	}

	private IndexedNode(Node node1, Index index1, ImmutableSortedSet immutablesortedset)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		index = index1;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #37  <Field Index index>
		node = node1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #39  <Field Node node>
		indexed = immutablesortedset;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #41  <Field ImmutableSortedSet indexed>
	//   11   19:return          
	}

	private void ensureIndexed()
	{
		if(indexed == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field ImmutableSortedSet indexed>
	//*   2    4:ifnonnull       152
		{
			if(((Object) (index)).equals(((Object) (KeyIndex.getInstance()))))
	//*   3    7:aload_0         
	//*   4    8:getfield        #37  <Field Index index>
	//*   5   11:invokestatic    #51  <Method KeyIndex KeyIndex.getInstance()>
	//*   6   14:invokevirtual   #55  <Method boolean Object.equals(Object)>
	//*   7   17:ifeq            28
			{
				indexed = FALLBACK_INDEX;
	//    8   20:aload_0         
	//    9   21:getstatic       #31  <Field ImmutableSortedSet FALLBACK_INDEX>
	//   10   24:putfield        #41  <Field ImmutableSortedSet indexed>
				return;
	//   11   27:return          
			}
			ArrayList arraylist = new ArrayList();
	//   12   28:new             #57  <Class ArrayList>
	//   13   31:dup             
	//   14   32:invokespecial   #58  <Method void ArrayList()>
	//   15   35:astore_2        
			Iterator iterator1 = node.iterator();
	//   16   36:aload_0         
	//   17   37:getfield        #39  <Field Node node>
	//   18   40:invokeinterface #64  <Method Iterator Node.iterator()>
	//   19   45:astore_3        
			boolean flag = false;
	//   20   46:iconst_0        
	//   21   47:istore_1        
			NamedNode namednode;
			for(; iterator1.hasNext(); ((List) (arraylist)).add(((Object) (new NamedNode(namednode.getName(), namednode.getNode())))))
	//*  22   48:aload_3         
	//*  23   49:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//*  24   54:ifeq            124
			{
				namednode = (NamedNode)iterator1.next();
	//   25   57:aload_3         
	//   26   58:invokeinterface #74  <Method Object Iterator.next()>
	//   27   63:checkcast       #76  <Class NamedNode>
	//   28   66:astore          4
				if(!flag && !index.isDefinedOn(namednode.getNode()))
	//*  29   68:iload_1         
	//*  30   69:ifne            95
	//*  31   72:aload_0         
	//*  32   73:getfield        #37  <Field Index index>
	//*  33   76:aload           4
	//*  34   78:invokevirtual   #80  <Method Node NamedNode.getNode()>
	//*  35   81:invokevirtual   #86  <Method boolean Index.isDefinedOn(Node)>
	//*  36   84:ifeq            90
	//*  37   87:goto            95
					flag = false;
	//   38   90:iconst_0        
	//   39   91:istore_1        
				else
	//*  40   92:goto            97
					flag = true;
	//   41   95:iconst_1        
	//   42   96:istore_1        
			}

	//   43   97:aload_2         
	//   44   98:new             #76  <Class NamedNode>
	//   45  101:dup             
	//   46  102:aload           4
	//   47  104:invokevirtual   #90  <Method ChildKey NamedNode.getName()>
	//   48  107:aload           4
	//   49  109:invokevirtual   #80  <Method Node NamedNode.getNode()>
	//   50  112:invokespecial   #93  <Method void NamedNode(ChildKey, Node)>
	//   51  115:invokeinterface #98  <Method boolean List.add(Object)>
	//   52  120:pop             
	//*  53  121:goto            48
			if(flag)
	//*  54  124:iload_1         
	//*  55  125:ifeq            145
			{
				indexed = new ImmutableSortedSet(((List) (arraylist)), ((java.util.Comparator) (index)));
	//   56  128:aload_0         
	//   57  129:new             #19  <Class ImmutableSortedSet>
	//   58  132:dup             
	//   59  133:aload_2         
	//   60  134:aload_0         
	//   61  135:getfield        #37  <Field Index index>
	//   62  138:invokespecial   #29  <Method void ImmutableSortedSet(List, java.util.Comparator)>
	//   63  141:putfield        #41  <Field ImmutableSortedSet indexed>
				return;
	//   64  144:return          
			}
			indexed = FALLBACK_INDEX;
	//   65  145:aload_0         
	//   66  146:getstatic       #31  <Field ImmutableSortedSet FALLBACK_INDEX>
	//   67  149:putfield        #41  <Field ImmutableSortedSet indexed>
		}
	//   68  152:return          
	}

	public static IndexedNode from(Node node1)
	{
		return new IndexedNode(node1, ((Index) (PriorityIndex.getInstance())));
	//    0    0:new             #2   <Class IndexedNode>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #105 <Method PriorityIndex PriorityIndex.getInstance()>
	//    4    8:invokespecial   #107 <Method void IndexedNode(Node, Index)>
	//    5   11:areturn         
	}

	public static IndexedNode from(Node node1, Index index1)
	{
		return new IndexedNode(node1, index1);
	//    0    0:new             #2   <Class IndexedNode>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #107 <Method void IndexedNode(Node, Index)>
	//    5    9:areturn         
	}

	public NamedNode getFirstChild()
	{
		if(!(node instanceof ChildrenNode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field Node node>
	//*   2    4:instanceof      #112 <Class ChildrenNode>
	//*   3    7:ifne            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		ensureIndexed();
	//    6   12:aload_0         
	//    7   13:invokespecial   #114 <Method void ensureIndexed()>
		Object obj = ((Object) (indexed));
	//    8   16:aload_0         
	//    9   17:getfield        #41  <Field ImmutableSortedSet indexed>
	//   10   20:astore_1        
		if(obj == FALLBACK_INDEX)
	//*  11   21:aload_1         
	//*  12   22:getstatic       #31  <Field ImmutableSortedSet FALLBACK_INDEX>
	//*  13   25:if_acmpne       58
		{
			obj = ((Object) (((ChildrenNode)node).getFirstChildKey()));
	//   14   28:aload_0         
	//   15   29:getfield        #39  <Field Node node>
	//   16   32:checkcast       #112 <Class ChildrenNode>
	//   17   35:invokevirtual   #117 <Method ChildKey ChildrenNode.getFirstChildKey()>
	//   18   38:astore_1        
			return new NamedNode(((ChildKey) (obj)), node.getImmediateChild(((ChildKey) (obj))));
	//   19   39:new             #76  <Class NamedNode>
	//   20   42:dup             
	//   21   43:aload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #39  <Field Node node>
	//   24   48:aload_1         
	//   25   49:invokeinterface #121 <Method Node Node.getImmediateChild(ChildKey)>
	//   26   54:invokespecial   #93  <Method void NamedNode(ChildKey, Node)>
	//   27   57:areturn         
		} else
		{
			return (NamedNode)((ImmutableSortedSet) (obj)).getMinEntry();
	//   28   58:aload_1         
	//   29   59:invokevirtual   #124 <Method Object ImmutableSortedSet.getMinEntry()>
	//   30   62:checkcast       #76  <Class NamedNode>
	//   31   65:areturn         
		}
	}

	public NamedNode getLastChild()
	{
		if(!(node instanceof ChildrenNode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field Node node>
	//*   2    4:instanceof      #112 <Class ChildrenNode>
	//*   3    7:ifne            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		ensureIndexed();
	//    6   12:aload_0         
	//    7   13:invokespecial   #114 <Method void ensureIndexed()>
		Object obj = ((Object) (indexed));
	//    8   16:aload_0         
	//    9   17:getfield        #41  <Field ImmutableSortedSet indexed>
	//   10   20:astore_1        
		if(obj == FALLBACK_INDEX)
	//*  11   21:aload_1         
	//*  12   22:getstatic       #31  <Field ImmutableSortedSet FALLBACK_INDEX>
	//*  13   25:if_acmpne       58
		{
			obj = ((Object) (((ChildrenNode)node).getLastChildKey()));
	//   14   28:aload_0         
	//   15   29:getfield        #39  <Field Node node>
	//   16   32:checkcast       #112 <Class ChildrenNode>
	//   17   35:invokevirtual   #128 <Method ChildKey ChildrenNode.getLastChildKey()>
	//   18   38:astore_1        
			return new NamedNode(((ChildKey) (obj)), node.getImmediateChild(((ChildKey) (obj))));
	//   19   39:new             #76  <Class NamedNode>
	//   20   42:dup             
	//   21   43:aload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #39  <Field Node node>
	//   24   48:aload_1         
	//   25   49:invokeinterface #121 <Method Node Node.getImmediateChild(ChildKey)>
	//   26   54:invokespecial   #93  <Method void NamedNode(ChildKey, Node)>
	//   27   57:areturn         
		} else
		{
			return (NamedNode)((ImmutableSortedSet) (obj)).getMaxEntry();
	//   28   58:aload_1         
	//   29   59:invokevirtual   #131 <Method Object ImmutableSortedSet.getMaxEntry()>
	//   30   62:checkcast       #76  <Class NamedNode>
	//   31   65:areturn         
		}
	}

	public Node getNode()
	{
		return node;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Node node>
	//    2    4:areturn         
	}

	public ChildKey getPredecessorChildName(ChildKey childkey, Node node1, Index index1)
	{
		if(!((Object) (index)).equals(((Object) (KeyIndex.getInstance()))) && !((Object) (index)).equals(((Object) (index1))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Index index>
	//*   2    4:invokestatic    #51  <Method KeyIndex KeyIndex.getInstance()>
	//*   3    7:invokevirtual   #55  <Method boolean Object.equals(Object)>
	//*   4   10:ifne            37
	//*   5   13:aload_0         
	//*   6   14:getfield        #37  <Field Index index>
	//*   7   17:aload_3         
	//*   8   18:invokevirtual   #55  <Method boolean Object.equals(Object)>
	//*   9   21:ifeq            27
	//*  10   24:goto            37
			throw new IllegalArgumentException("Index not available in IndexedNode!");
	//   11   27:new             #135 <Class IllegalArgumentException>
	//   12   30:dup             
	//   13   31:ldc1            #137 <String "Index not available in IndexedNode!">
	//   14   33:invokespecial   #140 <Method void IllegalArgumentException(String)>
	//   15   36:athrow          
		ensureIndexed();
	//   16   37:aload_0         
	//   17   38:invokespecial   #114 <Method void ensureIndexed()>
		index1 = ((Index) (indexed));
	//   18   41:aload_0         
	//   19   42:getfield        #41  <Field ImmutableSortedSet indexed>
	//   20   45:astore_3        
		if(index1 == FALLBACK_INDEX)
	//*  21   46:aload_3         
	//*  22   47:getstatic       #31  <Field ImmutableSortedSet FALLBACK_INDEX>
	//*  23   50:if_acmpne       64
			return node.getPredecessorChildKey(childkey);
	//   24   53:aload_0         
	//   25   54:getfield        #39  <Field Node node>
	//   26   57:aload_1         
	//   27   58:invokeinterface #144 <Method ChildKey Node.getPredecessorChildKey(ChildKey)>
	//   28   63:areturn         
		childkey = ((ChildKey) ((NamedNode)((ImmutableSortedSet) (index1)).getPredecessorEntry(((Object) (new NamedNode(childkey, node1))))));
	//   29   64:aload_3         
	//   30   65:new             #76  <Class NamedNode>
	//   31   68:dup             
	//   32   69:aload_1         
	//   33   70:aload_2         
	//   34   71:invokespecial   #93  <Method void NamedNode(ChildKey, Node)>
	//   35   74:invokevirtual   #148 <Method Object ImmutableSortedSet.getPredecessorEntry(Object)>
	//   36   77:checkcast       #76  <Class NamedNode>
	//   37   80:astore_1        
		if(childkey != null)
	//*  38   81:aload_1         
	//*  39   82:ifnull          90
			return ((NamedNode) (childkey)).getName();
	//   40   85:aload_1         
	//   41   86:invokevirtual   #90  <Method ChildKey NamedNode.getName()>
	//   42   89:areturn         
		else
			return null;
	//   43   90:aconst_null     
	//   44   91:areturn         
	}

	public boolean hasIndex(Index index1)
	{
		return ((Object) (index)).equals(((Object) (index1)));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Index index>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #55  <Method boolean Object.equals(Object)>
	//    4    8:ireturn         
	}

	public Iterator iterator()
	{
		ensureIndexed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #114 <Method void ensureIndexed()>
		ImmutableSortedSet immutablesortedset = indexed;
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field ImmutableSortedSet indexed>
	//    4    8:astore_1        
		if(immutablesortedset == FALLBACK_INDEX)
	//*   5    9:aload_1         
	//*   6   10:getstatic       #31  <Field ImmutableSortedSet FALLBACK_INDEX>
	//*   7   13:if_acmpne       26
			return node.iterator();
	//    8   16:aload_0         
	//    9   17:getfield        #39  <Field Node node>
	//   10   20:invokeinterface #64  <Method Iterator Node.iterator()>
	//   11   25:areturn         
		else
			return immutablesortedset.iterator();
	//   12   26:aload_1         
	//   13   27:invokevirtual   #151 <Method Iterator ImmutableSortedSet.iterator()>
	//   14   30:areturn         
	}

	public Iterator reverseIterator()
	{
		ensureIndexed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #114 <Method void ensureIndexed()>
		ImmutableSortedSet immutablesortedset = indexed;
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field ImmutableSortedSet indexed>
	//    4    8:astore_1        
		if(immutablesortedset == FALLBACK_INDEX)
	//*   5    9:aload_1         
	//*   6   10:getstatic       #31  <Field ImmutableSortedSet FALLBACK_INDEX>
	//*   7   13:if_acmpne       26
			return node.reverseIterator();
	//    8   16:aload_0         
	//    9   17:getfield        #39  <Field Node node>
	//   10   20:invokeinterface #155 <Method Iterator Node.reverseIterator()>
	//   11   25:areturn         
		else
			return immutablesortedset.reverseIterator();
	//   12   26:aload_1         
	//   13   27:invokevirtual   #156 <Method Iterator ImmutableSortedSet.reverseIterator()>
	//   14   30:areturn         
	}

	public IndexedNode updateChild(ChildKey childkey, Node node1)
	{
		Node node2 = node.updateImmediateChild(childkey, node1);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Node node>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #162 <Method Node Node.updateImmediateChild(ChildKey, Node)>
	//    5   11:astore          5
		if(indexed == FALLBACK_INDEX && !index.isDefinedOn(node1))
	//*   6   13:aload_0         
	//*   7   14:getfield        #41  <Field ImmutableSortedSet indexed>
	//*   8   17:getstatic       #31  <Field ImmutableSortedSet FALLBACK_INDEX>
	//*   9   20:if_acmpne       51
	//*  10   23:aload_0         
	//*  11   24:getfield        #37  <Field Index index>
	//*  12   27:aload_2         
	//*  13   28:invokevirtual   #86  <Method boolean Index.isDefinedOn(Node)>
	//*  14   31:ifne            51
			return new IndexedNode(node2, index, FALLBACK_INDEX);
	//   15   34:new             #2   <Class IndexedNode>
	//   16   37:dup             
	//   17   38:aload           5
	//   18   40:aload_0         
	//   19   41:getfield        #37  <Field Index index>
	//   20   44:getstatic       #31  <Field ImmutableSortedSet FALLBACK_INDEX>
	//   21   47:invokespecial   #164 <Method void IndexedNode(Node, Index, ImmutableSortedSet)>
	//   22   50:areturn         
		ImmutableSortedSet immutablesortedset = indexed;
	//   23   51:aload_0         
	//   24   52:getfield        #41  <Field ImmutableSortedSet indexed>
	//   25   55:astore_3        
		if(immutablesortedset != null && immutablesortedset != FALLBACK_INDEX)
	//*  26   56:aload_3         
	//*  27   57:ifnull          141
	//*  28   60:aload_3         
	//*  29   61:getstatic       #31  <Field ImmutableSortedSet FALLBACK_INDEX>
	//*  30   64:if_acmpne       70
	//*  31   67:goto            141
		{
			Object obj = ((Object) (node.getImmediateChild(childkey)));
	//   32   70:aload_0         
	//   33   71:getfield        #39  <Field Node node>
	//   34   74:aload_1         
	//   35   75:invokeinterface #121 <Method Node Node.getImmediateChild(ChildKey)>
	//   36   80:astore_3        
			ImmutableSortedSet immutablesortedset1 = indexed.remove(((Object) (new NamedNode(childkey, ((Node) (obj))))));
	//   37   81:aload_0         
	//   38   82:getfield        #41  <Field ImmutableSortedSet indexed>
	//   39   85:new             #76  <Class NamedNode>
	//   40   88:dup             
	//   41   89:aload_1         
	//   42   90:aload_3         
	//   43   91:invokespecial   #93  <Method void NamedNode(ChildKey, Node)>
	//   44   94:invokevirtual   #168 <Method ImmutableSortedSet ImmutableSortedSet.remove(Object)>
	//   45   97:astore          4
			obj = ((Object) (immutablesortedset1));
	//   46   99:aload           4
	//   47  101:astore_3        
			if(!node1.isEmpty())
	//*  48  102:aload_2         
	//*  49  103:invokeinterface #171 <Method boolean Node.isEmpty()>
	//*  50  108:ifne            126
				obj = ((Object) (immutablesortedset1.insert(((Object) (new NamedNode(childkey, node1))))));
	//   51  111:aload           4
	//   52  113:new             #76  <Class NamedNode>
	//   53  116:dup             
	//   54  117:aload_1         
	//   55  118:aload_2         
	//   56  119:invokespecial   #93  <Method void NamedNode(ChildKey, Node)>
	//   57  122:invokevirtual   #174 <Method ImmutableSortedSet ImmutableSortedSet.insert(Object)>
	//   58  125:astore_3        
			return new IndexedNode(node2, index, ((ImmutableSortedSet) (obj)));
	//   59  126:new             #2   <Class IndexedNode>
	//   60  129:dup             
	//   61  130:aload           5
	//   62  132:aload_0         
	//   63  133:getfield        #37  <Field Index index>
	//   64  136:aload_3         
	//   65  137:invokespecial   #164 <Method void IndexedNode(Node, Index, ImmutableSortedSet)>
	//   66  140:areturn         
		} else
		{
			return new IndexedNode(node2, index, ((ImmutableSortedSet) (null)));
	//   67  141:new             #2   <Class IndexedNode>
	//   68  144:dup             
	//   69  145:aload           5
	//   70  147:aload_0         
	//   71  148:getfield        #37  <Field Index index>
	//   72  151:aconst_null     
	//   73  152:invokespecial   #164 <Method void IndexedNode(Node, Index, ImmutableSortedSet)>
	//   74  155:areturn         
		}
	}

	public IndexedNode updatePriority(Node node1)
	{
		return new IndexedNode(node.updatePriority(node1), index, indexed);
	//    0    0:new             #2   <Class IndexedNode>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field Node node>
	//    4    8:aload_1         
	//    5    9:invokeinterface #178 <Method Node Node.updatePriority(Node)>
	//    6   14:aload_0         
	//    7   15:getfield        #37  <Field Index index>
	//    8   18:aload_0         
	//    9   19:getfield        #41  <Field ImmutableSortedSet indexed>
	//   10   22:invokespecial   #164 <Method void IndexedNode(Node, Index, ImmutableSortedSet)>
	//   11   25:areturn         
	}

	private static final ImmutableSortedSet FALLBACK_INDEX = new ImmutableSortedSet(Collections.emptyList(), ((java.util.Comparator) (null)));
	private final Index index;
	private ImmutableSortedSet indexed;
	private final Node node;

	static 
	{
	//    0    0:new             #19  <Class ImmutableSortedSet>
	//    1    3:dup             
	//    2    4:invokestatic    #25  <Method List Collections.emptyList()>
	//    3    7:aconst_null     
	//    4    8:invokespecial   #29  <Method void ImmutableSortedSet(List, java.util.Comparator)>
	//    5   11:putstatic       #31  <Field ImmutableSortedSet FALLBACK_INDEX>
	//*   6   14:return          
	}
}
