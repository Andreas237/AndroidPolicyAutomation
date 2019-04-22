// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.snapshot.Node;

// Referenced classes of package com.firebase.client.core:
//			SparseSnapshotTree, Path

public static interface SparseSnapshotTree$SparseSnapshotTreeVisitor
{

	public abstract void visitTree(Path path, Node node);
}
