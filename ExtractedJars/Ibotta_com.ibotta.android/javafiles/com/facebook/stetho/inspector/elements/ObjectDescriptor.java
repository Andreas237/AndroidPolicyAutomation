// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;

// Referenced classes of package com.facebook.stetho.inspector.elements:
//			Descriptor, NodeType, AttributeAccumulator, StyleAccumulator

public final class ObjectDescriptor extends Descriptor
{

	public ObjectDescriptor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Descriptor()>
	//    2    4:return          
	}

	public void getAttributes(Object obj, AttributeAccumulator attributeaccumulator)
	{
	//    0    0:return          
	}

	public void getChildren(Object obj, Accumulator accumulator)
	{
	//    0    0:return          
	}

	public String getLocalName(Object obj)
	{
		return getNodeName(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #20  <Method String getNodeName(Object)>
	//    3    5:areturn         
	}

	public String getNodeName(Object obj)
	{
		return obj.getClass().getName();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #32  <Method String Class.getName()>
	//    3    7:areturn         
	}

	public NodeType getNodeType(Object obj)
	{
		return NodeType.ELEMENT_NODE;
	//    0    0:getstatic       #40  <Field NodeType NodeType.ELEMENT_NODE>
	//    1    3:areturn         
	}

	public String getNodeValue(Object obj)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void getStyles(Object obj, StyleAccumulator styleaccumulator)
	{
	//    0    0:return          
	}

	public void hook(Object obj)
	{
	//    0    0:return          
	}

	public void setAttributesAsText(Object obj, String s)
	{
	//    0    0:return          
	}

	public void unhook(Object obj)
	{
	//    0    0:return          
	}
}
