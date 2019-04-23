// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.util.Iterator;

// Referenced classes of package com.facebook.internal:
//			CollectionMapper

public static interface CollectionMapper$Collection
{

	public abstract Object get(Object obj);

	public abstract Iterator keyIterator();

	public abstract void set(Object obj, Object obj1, ener ener);
}
