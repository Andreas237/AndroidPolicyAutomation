// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;


// Referenced classes of package com.facebook.stetho.inspector.elements:
//			ElementInfo

public interface DocumentView
{

	public abstract ElementInfo getElementInfo(Object obj);

	public abstract Object getRootElement();
}
