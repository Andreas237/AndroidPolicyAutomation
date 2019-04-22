// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;

import com.firebase.client.core.Path;

// Referenced classes of package com.firebase.client.snapshot:
//			Index, ChildKey, NamedNode, Node, 
//			EmptyNode

public class PathIndex extends Index
{

	public PathIndex(Path path)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Index()>
		if(path.size() == 1 && path.getFront().isPriorityChildName())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #17  <Method int Path.size()>
	//*   4    8:iconst_1        
	//*   5    9:icmpne          35
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #21  <Method ChildKey Path.getFront()>
	//*   8   16:invokevirtual   #27  <Method boolean ChildKey.isPriorityChildName()>
	//*   9   19:ifne            25
	//*  10   22:goto            35
		{
			throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
	//   11   25:new             #29  <Class IllegalArgumentException>
	//   12   28:dup             
	//   13   29:ldc1            #31  <String "Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!">
	//   14   31:invokespecial   #34  <Method void IllegalArgumentException(String)>
	//   15   34:athrow          
		} else
		{
			indexPath = path;
	//   16   35:aload_0         
	//   17   36:aload_1         
	//   18   37:putfield        #36  <Field Path indexPath>
			return;
	//   19   40:return          
		}
	}

	public int compare(NamedNode namednode, NamedNode namednode1)
	{
		int i = namednode.getNode().getChild(indexPath).compareTo(((Object) (namednode1.getNode().getChild(indexPath))));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #45  <Method Node NamedNode.getNode()>
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field Path indexPath>
	//    4    8:invokeinterface #51  <Method Node Node.getChild(Path)>
	//    5   13:aload_2         
	//    6   14:invokevirtual   #45  <Method Node NamedNode.getNode()>
	//    7   17:aload_0         
	//    8   18:getfield        #36  <Field Path indexPath>
	//    9   21:invokeinterface #51  <Method Node Node.getChild(Path)>
	//   10   26:invokeinterface #55  <Method int Node.compareTo(Object)>
	//   11   31:istore_3        
		if(i == 0)
	//*  12   32:iload_3         
	//*  13   33:ifne            48
			return namednode.getName().compareTo(namednode1.getName());
	//   14   36:aload_1         
	//   15   37:invokevirtual   #58  <Method ChildKey NamedNode.getName()>
	//   16   40:aload_2         
	//   17   41:invokevirtual   #58  <Method ChildKey NamedNode.getName()>
	//   18   44:invokevirtual   #61  <Method int ChildKey.compareTo(ChildKey)>
	//   19   47:ireturn         
		else
			return i;
	//   20   48:iload_3         
	//   21   49:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((NamedNode)obj, (NamedNode)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #41  <Class NamedNode>
	//    3    5:aload_2         
	//    4    6:checkcast       #41  <Class NamedNode>
	//    5    9:invokevirtual   #64  <Method int compare(NamedNode, NamedNode)>
	//    6   12:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          47
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #72  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #72  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((PathIndex)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class PathIndex>
	//   16   28:astore_1        
			return indexPath.equals(((Object) (((PathIndex) (obj)).indexPath)));
	//   17   29:aload_0         
	//   18   30:getfield        #36  <Field Path indexPath>
	//   19   33:aload_1         
	//   20   34:getfield        #36  <Field Path indexPath>
	//   21   37:invokevirtual   #74  <Method boolean Path.equals(Object)>
	//   22   40:ifne            45
	//   23   43:iconst_0        
	//   24   44:ireturn         
	//   25   45:iconst_1        
	//   26   46:ireturn         
		} else
		{
			return false;
	//   27   47:iconst_0        
	//   28   48:ireturn         
		}
	}

	public String getQueryDefinition()
	{
		return indexPath.wireFormat();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Path indexPath>
	//    2    4:invokevirtual   #79  <Method String Path.wireFormat()>
	//    3    7:areturn         
	}

	public int hashCode()
	{
		return indexPath.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Path indexPath>
	//    2    4:invokevirtual   #82  <Method int Path.hashCode()>
	//    3    7:ireturn         
	}

	public boolean isDefinedOn(Node node)
	{
		return node.getChild(indexPath).isEmpty() ^ true;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #36  <Field Path indexPath>
	//    3    5:invokeinterface #51  <Method Node Node.getChild(Path)>
	//    4   10:invokeinterface #87  <Method boolean Node.isEmpty()>
	//    5   15:iconst_1        
	//    6   16:ixor            
	//    7   17:ireturn         
	}

	public NamedNode makePost(ChildKey childkey, Node node)
	{
		return new NamedNode(childkey, EmptyNode.Empty().updateChild(indexPath, node));
	//    0    0:new             #41  <Class NamedNode>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #95  <Method EmptyNode EmptyNode.Empty()>
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field Path indexPath>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #99  <Method Node EmptyNode.updateChild(Path, Node)>
	//    8   16:invokespecial   #102 <Method void NamedNode(ChildKey, Node)>
	//    9   19:areturn         
	}

	public NamedNode maxPost()
	{
		Node node = EmptyNode.Empty().updateChild(indexPath, ((Node) (Node.MAX_NODE)));
	//    0    0:invokestatic    #95  <Method EmptyNode EmptyNode.Empty()>
	//    1    3:aload_0         
	//    2    4:getfield        #36  <Field Path indexPath>
	//    3    7:getstatic       #108 <Field ChildrenNode Node.MAX_NODE>
	//    4   10:invokevirtual   #99  <Method Node EmptyNode.updateChild(Path, Node)>
	//    5   13:astore_1        
		return new NamedNode(ChildKey.getMaxName(), node);
	//    6   14:new             #41  <Class NamedNode>
	//    7   17:dup             
	//    8   18:invokestatic    #111 <Method ChildKey ChildKey.getMaxName()>
	//    9   21:aload_1         
	//   10   22:invokespecial   #102 <Method void NamedNode(ChildKey, Node)>
	//   11   25:areturn         
	}

	private final Path indexPath;
}
