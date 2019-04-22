// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;


// Referenced classes of package com.firebase.client.snapshot:
//			ChildKey, EmptyNode, Node

public class NamedNode
{

	public NamedNode(ChildKey childkey, Node node1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		name = childkey;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #46  <Field ChildKey name>
		node = node1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #48  <Field Node node>
	//    8   14:return          
	}

	public static NamedNode getMaxNode()
	{
		return MAX_NODE;
	//    0    0:getstatic       #41  <Field NamedNode MAX_NODE>
	//    1    3:areturn         
	}

	public static NamedNode getMinNode()
	{
		return MIN_NODE;
	//    0    0:getstatic       #31  <Field NamedNode MIN_NODE>
	//    1    3:areturn         
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
	//*   6    8:ifnull          63
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #57  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #57  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((NamedNode)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class NamedNode>
	//   16   28:astore_1        
			if(!name.equals(((Object) (((NamedNode) (obj)).name))))
	//*  17   29:aload_0         
	//*  18   30:getfield        #46  <Field ChildKey name>
	//*  19   33:aload_1         
	//*  20   34:getfield        #46  <Field ChildKey name>
	//*  21   37:invokevirtual   #59  <Method boolean ChildKey.equals(Object)>
	//*  22   40:ifne            45
				return false;
	//   23   43:iconst_0        
	//   24   44:ireturn         
			return ((Object) (node)).equals(((Object) (((NamedNode) (obj)).node)));
	//   25   45:aload_0         
	//   26   46:getfield        #48  <Field Node node>
	//   27   49:aload_1         
	//   28   50:getfield        #48  <Field Node node>
	//   29   53:invokevirtual   #60  <Method boolean Object.equals(Object)>
	//   30   56:ifne            61
	//   31   59:iconst_0        
	//   32   60:ireturn         
	//   33   61:iconst_1        
	//   34   62:ireturn         
		} else
		{
			return false;
	//   35   63:iconst_0        
	//   36   64:ireturn         
		}
	}

	public ChildKey getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field ChildKey name>
	//    2    4:areturn         
	}

	public Node getNode()
	{
		return node;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Node node>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return name.hashCode() * 31 + ((Object) (node)).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field ChildKey name>
	//    2    4:invokevirtual   #67  <Method int ChildKey.hashCode()>
	//    3    7:bipush          31
	//    4    9:imul            
	//    5   10:aload_0         
	//    6   11:getfield        #48  <Field Node node>
	//    7   14:invokevirtual   #68  <Method int Object.hashCode()>
	//    8   17:iadd            
	//    9   18:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #72  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #73  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("NamedNode{name=");
	//    4    8:aload_1         
	//    5    9:ldc1            #75  <String "NamedNode{name=">
	//    6   11:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (name)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #46  <Field ChildKey name>
	//   11   20:invokevirtual   #82  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", node=");
	//   13   24:aload_1         
	//   14   25:ldc1            #84  <String ", node=">
	//   15   27:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (node)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #48  <Field Node node>
	//   20   36:invokevirtual   #82  <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append('}');
	//   22   40:aload_1         
	//   23   41:bipush          125
	//   24   43:invokevirtual   #87  <Method StringBuilder StringBuilder.append(char)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	private static final NamedNode MAX_NODE;
	private static final NamedNode MIN_NODE = new NamedNode(ChildKey.getMinName(), ((Node) (EmptyNode.Empty())));
	private final ChildKey name;
	private final Node node;

	static 
	{
	//    0    0:new             #2   <Class NamedNode>
	//    1    3:dup             
	//    2    4:invokestatic    #19  <Method ChildKey ChildKey.getMinName()>
	//    3    7:invokestatic    #25  <Method EmptyNode EmptyNode.Empty()>
	//    4   10:invokespecial   #29  <Method void NamedNode(ChildKey, Node)>
	//    5   13:putstatic       #31  <Field NamedNode MIN_NODE>
		MAX_NODE = new NamedNode(ChildKey.getMaxName(), ((Node) (Node.MAX_NODE)));
	//    6   16:new             #2   <Class NamedNode>
	//    7   19:dup             
	//    8   20:invokestatic    #34  <Method ChildKey ChildKey.getMaxName()>
	//    9   23:getstatic       #39  <Field ChildrenNode Node.MAX_NODE>
	//   10   26:invokespecial   #29  <Method void NamedNode(ChildKey, Node)>
	//   11   29:putstatic       #41  <Field NamedNode MAX_NODE>
	//*  12   32:return          
	}
}
