// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;


// Referenced classes of package com.firebase.client.snapshot:
//			ChildrenNode, ChildKey, Node

class ChildrenNode$2 extends com.firebase.client.collection.sitor
{

	public void visitEntry(ChildKey childkey, Node node)
	{
		if(!passedPriorityKey && childkey.compareTo(ChildKey.getPriorityKey()) > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean passedPriorityKey>
	//*   2    4:ifne            39
	//*   3    7:aload_1         
	//*   4    8:invokestatic    #36  <Method ChildKey ChildKey.getPriorityKey()>
	//*   5   11:invokevirtual   #40  <Method int ChildKey.compareTo(ChildKey)>
	//*   6   14:ifle            39
		{
			passedPriorityKey = true;
	//    7   17:aload_0         
	//    8   18:iconst_1        
	//    9   19:putfield        #27  <Field boolean passedPriorityKey>
			val$visitor.visitChild(ChildKey.getPriorityKey(), getPriority());
	//   10   22:aload_0         
	//   11   23:getfield        #22  <Field ChildrenNode$ChildVisitor val$visitor>
	//   12   26:invokestatic    #36  <Method ChildKey ChildKey.getPriorityKey()>
	//   13   29:aload_0         
	//   14   30:getfield        #20  <Field ChildrenNode this$0>
	//   15   33:invokevirtual   #44  <Method Node ChildrenNode.getPriority()>
	//   16   36:invokevirtual   #49  <Method void ChildrenNode$ChildVisitor.visitChild(ChildKey, Node)>
		}
		val$visitor.visitChild(childkey, node);
	//   17   39:aload_0         
	//   18   40:getfield        #22  <Field ChildrenNode$ChildVisitor val$visitor>
	//   19   43:aload_1         
	//   20   44:aload_2         
	//   21   45:invokevirtual   #49  <Method void ChildrenNode$ChildVisitor.visitChild(ChildKey, Node)>
	//   22   48:return          
	}

	public volatile void visitEntry(Object obj, Object obj1)
	{
		visitEntry((ChildKey)obj, (Node)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #32  <Class ChildKey>
	//    3    5:aload_2         
	//    4    6:checkcast       #52  <Class Node>
	//    5    9:invokevirtual   #54  <Method void visitEntry(ChildKey, Node)>
	//    6   12:return          
	}

	boolean passedPriorityKey;
	final ChildrenNode this$0;
	final ildVisitor val$visitor;

	ChildrenNode$2()
	{
		this$0 = final_childrennode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ChildrenNode this$0>
		val$visitor = ildVisitor.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field ChildrenNode$ChildVisitor val$visitor>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void com.firebase.client.collection.LLRBNode$NodeVisitor()>
		passedPriorityKey = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #27  <Field boolean passedPriorityKey>
	//   11   19:return          
	}
}
