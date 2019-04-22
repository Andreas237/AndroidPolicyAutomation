// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.utilities;


// Referenced classes of package com.firebase.client.core.utilities:
//			Tree

class Tree$1
	implements eeVisitor
{

	public void visitTree(Tree tree)
	{
		tree.forEachDescendant(val$visitor, true, val$childrenFirst);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field Tree$TreeVisitor val$visitor>
	//    3    5:iconst_1        
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field boolean val$childrenFirst>
	//    6   10:invokevirtual   #33  <Method void Tree.forEachDescendant(Tree$TreeVisitor, boolean, boolean)>
	//    7   13:return          
	}

	final Tree this$0;
	final boolean val$childrenFirst;
	final eeVisitor val$visitor;

	Tree$1()
	{
		this$0 = final_tree;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field Tree this$0>
		val$visitor = eevisitor;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field Tree$TreeVisitor val$visitor>
		val$childrenFirst = Z.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #26  <Field boolean val$childrenFirst>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #29  <Method void Object()>
	//   11   19:return          
	}
}
