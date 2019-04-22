// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.snapshot.Node;
import java.util.Map;

// Referenced classes of package com.firebase.client.core:
//			ServerValues, SparseSnapshotTree, Path

static final class ServerValues$1
	implements ree.SparseSnapshotTreeVisitor
{

	public void visitTree(Path path, Node node)
	{
		val$resolvedTree.remember(path, ServerValues.resolveDeferredValueSnapshot(node, val$serverValues));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field SparseSnapshotTree val$resolvedTree>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #21  <Field Map val$serverValues>
	//    6   10:invokestatic    #31  <Method Node ServerValues.resolveDeferredValueSnapshot(Node, Map)>
	//    7   13:invokevirtual   #36  <Method void SparseSnapshotTree.remember(Path, Node)>
	//    8   16:return          
	}

	final SparseSnapshotTree val$resolvedTree;
	final Map val$serverValues;

	ServerValues$1(SparseSnapshotTree sparsesnapshottree, Map map)
	{
		val$resolvedTree = sparsesnapshottree;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field SparseSnapshotTree val$resolvedTree>
		val$serverValues = map;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Map val$serverValues>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
