// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.snapshot.ChildKey;

// Referenced classes of package com.firebase.client.core:
//			SparseSnapshotTree, Path

class SparseSnapshotTree$2
	implements arseSnapshotChildVisitor
{

	public void visitChild(ChildKey childkey, SparseSnapshotTree sparsesnapshottree)
	{
		sparsesnapshottree.forEachTree(val$prefixPath.child(childkey), val$visitor);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #23  <Field Path val$prefixPath>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #37  <Method Path Path.child(ChildKey)>
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field SparseSnapshotTree$SparseSnapshotTreeVisitor val$visitor>
	//    7   13:invokevirtual   #38  <Method void SparseSnapshotTree.forEachTree(Path, SparseSnapshotTree$SparseSnapshotTreeVisitor)>
	//    8   16:return          
	}

	final SparseSnapshotTree this$0;
	final Path val$prefixPath;
	final arseSnapshotTreeVisitor val$visitor;

	SparseSnapshotTree$2()
	{
		this$0 = final_sparsesnapshottree;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field SparseSnapshotTree this$0>
		val$prefixPath = path;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Path val$prefixPath>
		val$visitor = arseSnapshotTreeVisitor.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field SparseSnapshotTree$SparseSnapshotTreeVisitor val$visitor>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
