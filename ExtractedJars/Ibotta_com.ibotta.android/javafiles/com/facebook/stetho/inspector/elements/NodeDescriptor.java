// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.ThreadBound;

// Referenced classes of package com.facebook.stetho.inspector.elements:
//			AttributeAccumulator, NodeType, StyleAccumulator

public interface NodeDescriptor
	extends ThreadBound
{

	public abstract void getAttributes(Object obj, AttributeAccumulator attributeaccumulator);

	public abstract void getChildren(Object obj, Accumulator accumulator);

	public abstract String getLocalName(Object obj);

	public abstract String getNodeName(Object obj);

	public abstract NodeType getNodeType(Object obj);

	public abstract String getNodeValue(Object obj);

	public abstract void getStyles(Object obj, StyleAccumulator styleaccumulator);

	public abstract void hook(Object obj);

	public abstract void setAttributesAsText(Object obj, String s);

	public abstract void unhook(Object obj);
}
