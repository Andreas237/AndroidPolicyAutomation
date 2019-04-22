// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view.filter;

import com.firebase.client.core.Path;
import com.firebase.client.snapshot.*;

// Referenced classes of package com.firebase.client.core.view.filter:
//			ChildChangeAccumulator

public interface NodeFilter
{
	public static interface CompleteChildSource
	{

		public abstract NamedNode getChildAfterChild(Index index, NamedNode namednode, boolean flag);

		public abstract Node getCompleteChild(ChildKey childkey);
	}


	public abstract boolean filtersNodes();

	public abstract Index getIndex();

	public abstract NodeFilter getIndexedFilter();

	public abstract IndexedNode updateChild(IndexedNode indexednode, ChildKey childkey, Node node, Path path, CompleteChildSource completechildsource, ChildChangeAccumulator childchangeaccumulator);

	public abstract IndexedNode updateFullNode(IndexedNode indexednode, IndexedNode indexednode1, ChildChangeAccumulator childchangeaccumulator);

	public abstract IndexedNode updatePriority(IndexedNode indexednode, Node node);
}
