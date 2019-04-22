// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;

// Referenced classes of package com.facebook.stetho.inspector.elements:
//			Document, DocumentView

public static interface Document$UpdateListener
{

	public abstract void onAttributeModified(Object obj, String s, String s1);

	public abstract void onAttributeRemoved(Object obj, String s);

	public abstract void onChildNodeInserted(DocumentView documentview, Object obj, int i, int j, Accumulator accumulator);

	public abstract void onChildNodeRemoved(int i, int j);

	public abstract void onInspectRequested(Object obj);
}
