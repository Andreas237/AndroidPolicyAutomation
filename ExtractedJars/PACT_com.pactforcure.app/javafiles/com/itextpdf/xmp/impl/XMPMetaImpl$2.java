// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.options.PropertyOptions;
import com.itextpdf.xmp.properties.XMPProperty;

// Referenced classes of package com.itextpdf.xmp.impl:
//			XMPMetaImpl, XMPNode

class XMPMetaImpl$2
	implements XMPProperty
{

	public String getLanguage()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public PropertyOptions getOptions()
	{
		return val$propNode.getOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field XMPNode val$propNode>
	//    2    4:invokevirtual   #37  <Method PropertyOptions XMPNode.getOptions()>
	//    3    7:areturn         
	}

	public String getValue()
	{
		if(val$value != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field Object val$value>
	//*   2    4:ifnull          15
			return val$value.toString();
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field Object val$value>
	//    5   11:invokevirtual   #41  <Method String Object.toString()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public String toString()
	{
		return val$value.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Object val$value>
	//    2    4:invokevirtual   #41  <Method String Object.toString()>
	//    3    7:areturn         
	}

	final XMPMetaImpl this$0;
	final XMPNode val$propNode;
	final Object val$value;

	XMPMetaImpl$2()
	{
		this$0 = final_xmpmetaimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field XMPMetaImpl this$0>
		val$value = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Object val$value>
		val$propNode = XMPNode.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field XMPNode val$propNode>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
