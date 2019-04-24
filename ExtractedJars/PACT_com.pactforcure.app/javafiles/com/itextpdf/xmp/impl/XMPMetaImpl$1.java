// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.options.PropertyOptions;
import com.itextpdf.xmp.properties.XMPProperty;

// Referenced classes of package com.itextpdf.xmp.impl:
//			XMPMetaImpl, XMPNode

class XMPMetaImpl$1
	implements XMPProperty
{

	public String getLanguage()
	{
		return val$itemNode.getQualifier(1).getValue();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field XMPNode val$itemNode>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #33  <Method XMPNode XMPNode.getQualifier(int)>
	//    4    8:invokevirtual   #36  <Method String XMPNode.getValue()>
	//    5   11:areturn         
	}

	public PropertyOptions getOptions()
	{
		return val$itemNode.getOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field XMPNode val$itemNode>
	//    2    4:invokevirtual   #40  <Method PropertyOptions XMPNode.getOptions()>
	//    3    7:areturn         
	}

	public String getValue()
	{
		return val$itemNode.getValue();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field XMPNode val$itemNode>
	//    2    4:invokevirtual   #36  <Method String XMPNode.getValue()>
	//    3    7:areturn         
	}

	public String toString()
	{
		return val$itemNode.getValue().toString();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field XMPNode val$itemNode>
	//    2    4:invokevirtual   #36  <Method String XMPNode.getValue()>
	//    3    7:invokevirtual   #45  <Method String String.toString()>
	//    4   10:areturn         
	}

	final XMPMetaImpl this$0;
	final XMPNode val$itemNode;

	XMPMetaImpl$1()
	{
		this$0 = final_xmpmetaimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field XMPMetaImpl this$0>
		val$itemNode = XMPNode.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field XMPNode val$itemNode>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
