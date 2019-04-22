// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.ThreadBound;

// Referenced classes of package com.facebook.stetho.inspector.elements:
//			NodeDescriptor, DocumentProviderListener

public interface DocumentProvider
	extends ThreadBound
{

	public abstract void dispose();

	public abstract NodeDescriptor getNodeDescriptor(Object obj);

	public abstract Object getRootElement();

	public abstract void hideHighlight();

	public abstract void highlightElement(Object obj, int i);

	public abstract void setAttributesAsText(Object obj, String s);

	public abstract void setInspectModeEnabled(boolean flag);

	public abstract void setListener(DocumentProviderListener documentproviderlistener);
}
