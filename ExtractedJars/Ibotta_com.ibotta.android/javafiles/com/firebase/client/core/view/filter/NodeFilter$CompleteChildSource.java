// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view.filter;

import com.firebase.client.snapshot.*;

// Referenced classes of package com.firebase.client.core.view.filter:
//			NodeFilter

public static interface NodeFilter$CompleteChildSource
{

	public abstract NamedNode getChildAfterChild(Index index, NamedNode namednode, boolean flag);

	public abstract Node getCompleteChild(ChildKey childkey);
}
