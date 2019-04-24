// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.XMPMetaFactory;
import com.itextpdf.xmp.XMPSchemaRegistry;
import com.itextpdf.xmp.options.PropertyOptions;
import com.itextpdf.xmp.properties.XMPPropertyInfo;

// Referenced classes of package com.itextpdf.xmp.impl:
//			XMPIteratorImpl, XMPNode, QName

class XMPIteratorImpl$NodeIterator$1
	implements XMPPropertyInfo
{

	public String getLanguage()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String getNamespace()
	{
		if(!val$node.getOptions().isSchemaNode())
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field XMPNode val$node>
	//*   2    4:invokevirtual   #47  <Method PropertyOptions XMPNode.getOptions()>
	//*   3    7:invokevirtual   #53  <Method boolean PropertyOptions.isSchemaNode()>
	//*   4   10:ifne            41
		{
			QName qname = new QName(val$node.getName());
	//    5   13:new             #55  <Class QName>
	//    6   16:dup             
	//    7   17:aload_0         
	//    8   18:getfield        #28  <Field XMPNode val$node>
	//    9   21:invokevirtual   #58  <Method String XMPNode.getName()>
	//   10   24:invokespecial   #61  <Method void QName(String)>
	//   11   27:astore_1        
			return XMPMetaFactory.getSchemaRegistry().getNamespaceURI(qname.getPrefix());
	//   12   28:invokestatic    #67  <Method XMPSchemaRegistry XMPMetaFactory.getSchemaRegistry()>
	//   13   31:aload_1         
	//   14   32:invokevirtual   #70  <Method String QName.getPrefix()>
	//   15   35:invokeinterface #76  <Method String XMPSchemaRegistry.getNamespaceURI(String)>
	//   16   40:areturn         
		} else
		{
			return val$baseNS;
	//   17   41:aload_0         
	//   18   42:getfield        #30  <Field String val$baseNS>
	//   19   45:areturn         
		}
	}

	public PropertyOptions getOptions()
	{
		return val$node.getOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field XMPNode val$node>
	//    2    4:invokevirtual   #47  <Method PropertyOptions XMPNode.getOptions()>
	//    3    7:areturn         
	}

	public String getPath()
	{
		return val$path;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String val$path>
	//    2    4:areturn         
	}

	public String getValue()
	{
		return val$value;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String val$value>
	//    2    4:areturn         
	}

	final XMPIteratorImpl.NodeIterator this$1;
	final String val$baseNS;
	final XMPNode val$node;
	final String val$path;
	final String val$value;

	XMPIteratorImpl$NodeIterator$1()
	{
		this$1 = final_nodeiterator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field XMPIteratorImpl$NodeIterator this$1>
		val$node = xmpnode;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field XMPNode val$node>
		val$baseNS = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field String val$baseNS>
		val$path = s1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #32  <Field String val$path>
		val$value = String.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #34  <Field String val$value>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #37  <Method void Object()>
	//   17   31:return          
	}
}
