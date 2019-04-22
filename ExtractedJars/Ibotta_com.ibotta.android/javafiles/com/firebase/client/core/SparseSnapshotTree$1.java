// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.snapshot.ChildKey;
import com.firebase.client.snapshot.Node;

// Referenced classes of package com.firebase.client.core:
//			SparseSnapshotTree, Path

class SparseSnapshotTree$1 extends com.firebase.client.snapshot.itor
{

	public void visitChild(ChildKey childkey, Node node)
	{
		remember(val$path.child(childkey), node);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SparseSnapshotTree this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Path val$path>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #31  <Method Path Path.child(ChildKey)>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #35  <Method void SparseSnapshotTree.remember(Path, Node)>
	//    8   16:return          
	}

	final SparseSnapshotTree this$0;
	final Path val$path;

	SparseSnapshotTree$1()
	{
		this$0 = final_sparsesnapshottree;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field SparseSnapshotTree this$0>
		val$path = Path.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field Path val$path>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void com.firebase.client.snapshot.ChildrenNode$ChildVisitor()>
	//    8   14:return          
	}
}
