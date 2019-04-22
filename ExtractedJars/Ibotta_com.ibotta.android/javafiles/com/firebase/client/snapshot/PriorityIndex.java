// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;


// Referenced classes of package com.firebase.client.snapshot:
//			Index, NamedNode, Node, NodeUtilities, 
//			StringNode, ChildKey

public class PriorityIndex extends Index
{

	private PriorityIndex()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Index()>
	//    2    4:return          
	}

	public static PriorityIndex getInstance()
	{
		return INSTANCE;
	//    0    0:getstatic       #13  <Field PriorityIndex INSTANCE>
	//    1    3:areturn         
	}

	public int compare(NamedNode namednode, NamedNode namednode1)
	{
		Node node = namednode.getNode().getPriority();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method Node NamedNode.getNode()>
	//    2    4:invokeinterface #30  <Method Node Node.getPriority()>
	//    3    9:astore_3        
		Node node1 = namednode1.getNode().getPriority();
	//    4   10:aload_2         
	//    5   11:invokevirtual   #25  <Method Node NamedNode.getNode()>
	//    6   14:invokeinterface #30  <Method Node Node.getPriority()>
	//    7   19:astore          4
		return NodeUtilities.nameAndPriorityCompare(namednode.getName(), node, namednode1.getName(), node1);
	//    8   21:aload_1         
	//    9   22:invokevirtual   #34  <Method ChildKey NamedNode.getName()>
	//   10   25:aload_3         
	//   11   26:aload_2         
	//   12   27:invokevirtual   #34  <Method ChildKey NamedNode.getName()>
	//   13   30:aload           4
	//   14   32:invokestatic    #40  <Method int NodeUtilities.nameAndPriorityCompare(ChildKey, Node, ChildKey, Node)>
	//   15   35:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((NamedNode)obj, (NamedNode)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class NamedNode>
	//    3    5:aload_2         
	//    4    6:checkcast       #21  <Class NamedNode>
	//    5    9:invokevirtual   #43  <Method int compare(NamedNode, NamedNode)>
	//    6   12:ireturn         
	}

	public boolean equals(Object obj)
	{
		return obj instanceof PriorityIndex;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class PriorityIndex>
	//    2    4:ireturn         
	}

	public String getQueryDefinition()
	{
		throw new IllegalArgumentException("Can't get query definition on priority index!");
	//    0    0:new             #49  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:ldc1            #51  <String "Can't get query definition on priority index!">
	//    3    6:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//    4    9:athrow          
	}

	public int hashCode()
	{
		return 0x302679;
	//    0    0:ldc1            #57  <Int 0x302679>
	//    1    2:ireturn         
	}

	public boolean isDefinedOn(Node node)
	{
		return node.getPriority().isEmpty() ^ true;
	//    0    0:aload_1         
	//    1    1:invokeinterface #30  <Method Node Node.getPriority()>
	//    2    6:invokeinterface #63  <Method boolean Node.isEmpty()>
	//    3   11:iconst_1        
	//    4   12:ixor            
	//    5   13:ireturn         
	}

	public NamedNode makePost(ChildKey childkey, Node node)
	{
		return new NamedNode(childkey, ((Node) (new StringNode("[PRIORITY-POST]", node))));
	//    0    0:new             #21  <Class NamedNode>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:new             #67  <Class StringNode>
	//    4    8:dup             
	//    5    9:ldc1            #69  <String "[PRIORITY-POST]">
	//    6   11:aload_2         
	//    7   12:invokespecial   #72  <Method void StringNode(String, Node)>
	//    8   15:invokespecial   #75  <Method void NamedNode(ChildKey, Node)>
	//    9   18:areturn         
	}

	public NamedNode maxPost()
	{
		return makePost(ChildKey.getMaxName(), ((Node) (Node.MAX_NODE)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #82  <Method ChildKey ChildKey.getMaxName()>
	//    2    4:getstatic       #86  <Field ChildrenNode Node.MAX_NODE>
	//    3    7:invokevirtual   #88  <Method NamedNode makePost(ChildKey, Node)>
	//    4   10:areturn         
	}

	public String toString()
	{
		return "PriorityIndex";
	//    0    0:ldc1            #91  <String "PriorityIndex">
	//    1    2:areturn         
	}

	private static final PriorityIndex INSTANCE = new PriorityIndex();

	static 
	{
	//    0    0:new             #2   <Class PriorityIndex>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void PriorityIndex()>
	//    3    7:putstatic       #13  <Field PriorityIndex INSTANCE>
	//*   4   10:return          
	}
}
