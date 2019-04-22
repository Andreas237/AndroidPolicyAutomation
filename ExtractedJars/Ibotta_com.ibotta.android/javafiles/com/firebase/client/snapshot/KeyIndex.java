// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;


// Referenced classes of package com.firebase.client.snapshot:
//			Index, NamedNode, ChildKey, Node, 
//			EmptyNode

public class KeyIndex extends Index
{

	private KeyIndex()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Index()>
	//    2    4:return          
	}

	public static KeyIndex getInstance()
	{
		return INSTANCE;
	//    0    0:getstatic       #16  <Field KeyIndex INSTANCE>
	//    1    3:areturn         
	}

	public int compare(NamedNode namednode, NamedNode namednode1)
	{
		return namednode.getName().compareTo(namednode1.getName());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method ChildKey NamedNode.getName()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #28  <Method ChildKey NamedNode.getName()>
	//    4    8:invokevirtual   #34  <Method int ChildKey.compareTo(ChildKey)>
	//    5   11:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((NamedNode)obj, (NamedNode)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class NamedNode>
	//    3    5:aload_2         
	//    4    6:checkcast       #24  <Class NamedNode>
	//    5    9:invokevirtual   #37  <Method int compare(NamedNode, NamedNode)>
	//    6   12:ireturn         
	}

	public boolean equals(Object obj)
	{
		return obj instanceof KeyIndex;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class KeyIndex>
	//    2    4:ireturn         
	}

	public String getQueryDefinition()
	{
		return ".key";
	//    0    0:ldc1            #43  <String ".key">
	//    1    2:areturn         
	}

	public int hashCode()
	{
		return 37;
	//    0    0:bipush          37
	//    1    2:ireturn         
	}

	public boolean isDefinedOn(Node node)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public NamedNode makePost(ChildKey childkey, Node node)
	{
		return new NamedNode(ChildKey.fromString((String)node.getValue()), ((Node) (EmptyNode.Empty())));
	//    0    0:new             #24  <Class NamedNode>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokeinterface #55  <Method Object Node.getValue()>
	//    4   10:checkcast       #57  <Class String>
	//    5   13:invokestatic    #61  <Method ChildKey ChildKey.fromString(String)>
	//    6   16:invokestatic    #67  <Method EmptyNode EmptyNode.Empty()>
	//    7   19:invokespecial   #70  <Method void NamedNode(ChildKey, Node)>
	//    8   22:areturn         
	}

	public NamedNode maxPost()
	{
		return NamedNode.getMaxNode();
	//    0    0:invokestatic    #75  <Method NamedNode NamedNode.getMaxNode()>
	//    1    3:areturn         
	}

	public String toString()
	{
		return "KeyIndex";
	//    0    0:ldc1            #78  <String "KeyIndex">
	//    1    2:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private static final KeyIndex INSTANCE = new KeyIndex();

	static 
	{
	//    0    0:new             #2   <Class KeyIndex>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void KeyIndex()>
	//    3    7:putstatic       #16  <Field KeyIndex INSTANCE>
	//*   4   10:return          
	}
}
