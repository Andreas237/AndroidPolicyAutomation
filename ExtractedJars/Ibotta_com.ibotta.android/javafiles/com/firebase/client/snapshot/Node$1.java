// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;


// Referenced classes of package com.firebase.client.snapshot:
//			ChildrenNode, Node, ChildKey, EmptyNode

static final class Node$1 extends ChildrenNode
{

	public int compareTo(Node node)
	{
		return node != this ? 1 : 0;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:if_acmpne       7
	//    3    5:iconst_0        
	//    4    6:ireturn         
	//    5    7:iconst_1        
	//    6    8:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((Node)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #6   <Class Node>
	//    3    5:invokevirtual   #16  <Method int compareTo(Node)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
		return obj == this;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:if_acmpne       7
	//    3    5:iconst_1        
	//    4    6:ireturn         
	//    5    7:iconst_0        
	//    6    8:ireturn         
	}

	public Node getImmediateChild(ChildKey childkey)
	{
		if(childkey.isPriorityChildName())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #26  <Method boolean ChildKey.isPriorityChildName()>
	//*   2    4:ifeq            12
			return getPriority();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #30  <Method Node getPriority()>
	//    5   11:areturn         
		else
			return ((Node) (EmptyNode.Empty()));
	//    6   12:invokestatic    #36  <Method EmptyNode EmptyNode.Empty()>
	//    7   15:areturn         
	}

	public Node getPriority()
	{
		return ((Node) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean hasChild(ChildKey childkey)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isEmpty()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String toString()
	{
		return "<Max Node>";
	//    0    0:ldc1            #43  <String "<Max Node>">
	//    1    2:areturn         
	}

	Node$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void ChildrenNode()>
	//    2    4:return          
	}
}
