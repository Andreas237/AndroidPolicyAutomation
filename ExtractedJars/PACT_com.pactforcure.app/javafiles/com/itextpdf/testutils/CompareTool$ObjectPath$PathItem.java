// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.testutils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

// Referenced classes of package com.itextpdf.testutils:
//			CompareTool

private abstract class CompareTool$ObjectPath$PathItem
{

	protected abstract Node toXmlNode(Document document);

	final CompareTool.ObjectPath this$1;

	private CompareTool$ObjectPath$PathItem()
	{
		this$1 = CompareTool.ObjectPath.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field CompareTool$ObjectPath this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	CompareTool$ObjectPath$PathItem(CompareTool._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void CompareTool$ObjectPath$PathItem(CompareTool$ObjectPath)>
	//    3    5:return          
	}
}
