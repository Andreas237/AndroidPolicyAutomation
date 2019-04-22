// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;


// Referenced classes of package com.firebase.client.snapshot:
//			Index, NamedNode, Node, ChildKey

public class ValueIndex extends Index
{

	private ValueIndex()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Index()>
	//    2    4:return          
	}

	public static ValueIndex getInstance()
	{
		return INSTANCE;
	//    0    0:getstatic       #13  <Field ValueIndex INSTANCE>
	//    1    3:areturn         
	}

	public int compare(NamedNode namednode, NamedNode namednode1)
	{
		int i = namednode.getNode().compareTo(((Object) (namednode1.getNode())));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method Node NamedNode.getNode()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #25  <Method Node NamedNode.getNode()>
	//    4    8:invokeinterface #31  <Method int Node.compareTo(Object)>
	//    5   13:istore_3        
		if(i == 0)
	//*   6   14:iload_3         
	//*   7   15:ifne            30
			return namednode.getName().compareTo(namednode1.getName());
	//    8   18:aload_1         
	//    9   19:invokevirtual   #35  <Method ChildKey NamedNode.getName()>
	//   10   22:aload_2         
	//   11   23:invokevirtual   #35  <Method ChildKey NamedNode.getName()>
	//   12   26:invokevirtual   #40  <Method int ChildKey.compareTo(ChildKey)>
	//   13   29:ireturn         
		else
			return i;
	//   14   30:iload_3         
	//   15   31:ireturn         
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
		return obj instanceof ValueIndex;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class ValueIndex>
	//    2    4:ireturn         
	}

	public String getQueryDefinition()
	{
		return ".value";
	//    0    0:ldc1            #49  <String ".value">
	//    1    2:areturn         
	}

	public int hashCode()
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public boolean isDefinedOn(Node node)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public NamedNode makePost(ChildKey childkey, Node node)
	{
		return new NamedNode(childkey, node);
	//    0    0:new             #21  <Class NamedNode>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #58  <Method void NamedNode(ChildKey, Node)>
	//    5    9:areturn         
	}

	public NamedNode maxPost()
	{
		return new NamedNode(ChildKey.getMaxName(), ((Node) (Node.MAX_NODE)));
	//    0    0:new             #21  <Class NamedNode>
	//    1    3:dup             
	//    2    4:invokestatic    #63  <Method ChildKey ChildKey.getMaxName()>
	//    3    7:getstatic       #67  <Field ChildrenNode Node.MAX_NODE>
	//    4   10:invokespecial   #58  <Method void NamedNode(ChildKey, Node)>
	//    5   13:areturn         
	}

	public String toString()
	{
		return "ValueIndex";
	//    0    0:ldc1            #70  <String "ValueIndex">
	//    1    2:areturn         
	}

	private static final ValueIndex INSTANCE = new ValueIndex();

	static 
	{
	//    0    0:new             #2   <Class ValueIndex>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void ValueIndex()>
	//    3    7:putstatic       #13  <Field ValueIndex INSTANCE>
	//*   4   10:return          
	}
}
