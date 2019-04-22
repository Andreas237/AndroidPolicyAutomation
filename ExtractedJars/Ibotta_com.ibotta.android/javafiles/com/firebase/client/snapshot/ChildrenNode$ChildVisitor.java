// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;


// Referenced classes of package com.firebase.client.snapshot:
//			ChildrenNode, ChildKey, Node

public static abstract class ChildrenNode$ChildVisitor extends com.firebase.client.collection.LLRBNode.NodeVisitor
{

	public abstract void visitChild(ChildKey childkey, Node node);

	public void visitEntry(ChildKey childkey, Node node)
	{
		visitChild(childkey, node);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #18  <Method void visitChild(ChildKey, Node)>
	//    4    6:return          
	}

	public volatile void visitEntry(Object obj, Object obj1)
	{
		visitEntry((ChildKey)obj, (Node)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class ChildKey>
	//    3    5:aload_2         
	//    4    6:checkcast       #23  <Class Node>
	//    5    9:invokevirtual   #25  <Method void visitEntry(ChildKey, Node)>
	//    6   12:return          
	}

	public ChildrenNode$ChildVisitor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void com.firebase.client.collection.LLRBNode$NodeVisitor()>
	//    2    4:return          
	}
}
