// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.ThreadBound;

// Referenced classes of package com.facebook.stetho.inspector.elements:
//			Descriptor

public static interface Descriptor$Host
	extends ThreadBound
{

	public abstract Descriptor getDescriptor(Object obj);

	public abstract void onAttributeModified(Object obj, String s, String s1);

	public abstract void onAttributeRemoved(Object obj, String s);
}
