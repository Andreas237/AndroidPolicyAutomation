// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.options.IteratorOptions;
import com.itextpdf.xmp.options.PropertyOptions;
import java.util.Iterator;

// Referenced classes of package com.itextpdf.xmp.impl:
//			XMPIteratorImpl, XMPNode

private class XMPIteratorImpl$NodeIteratorChildren extends XMPIteratorImpl.NodeIterator
{

	public boolean hasNext()
	{
		if(getReturnProperty() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #62  <Method com.itextpdf.xmp.properties.XMPPropertyInfo getReturnProperty()>
	//*   2    4:ifnull          9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(skipSiblings)
	//*   5    9:aload_0         
	//*   6   10:getfield        #19  <Field XMPIteratorImpl this$0>
	//*   7   13:getfield        #66  <Field boolean XMPIteratorImpl.skipSiblings>
	//*   8   16:ifeq            21
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		if(childrenIterator.hasNext())
	//*  11   21:aload_0         
	//*  12   22:getfield        #56  <Field Iterator childrenIterator>
	//*  13   25:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//*  14   30:ifeq            147
		{
			XMPNode xmpnode = (XMPNode)childrenIterator.next();
	//   15   33:aload_0         
	//   16   34:getfield        #56  <Field Iterator childrenIterator>
	//   17   37:invokeinterface #74  <Method Object Iterator.next()>
	//   18   42:checkcast       #26  <Class XMPNode>
	//   19   45:astore_2        
			index = index + 1;
	//   20   46:aload_0         
	//   21   47:aload_0         
	//   22   48:getfield        #24  <Field int index>
	//   23   51:iconst_1        
	//   24   52:iadd            
	//   25   53:putfield        #24  <Field int index>
			String s = null;
	//   26   56:aconst_null     
	//   27   57:astore_1        
			if(xmpnode.getOptions().isSchemaNode())
	//*  28   58:aload_2         
	//*  29   59:invokevirtual   #30  <Method PropertyOptions XMPNode.getOptions()>
	//*  30   62:invokevirtual   #36  <Method boolean PropertyOptions.isSchemaNode()>
	//*  31   65:ifeq            118
				setBaseNS(xmpnode.getName());
	//   32   68:aload_0         
	//   33   69:getfield        #19  <Field XMPIteratorImpl this$0>
	//   34   72:aload_2         
	//   35   73:invokevirtual   #40  <Method String XMPNode.getName()>
	//   36   76:invokevirtual   #44  <Method void XMPIteratorImpl.setBaseNS(String)>
			else
	//*  37   79:aload_0         
	//*  38   80:getfield        #19  <Field XMPIteratorImpl this$0>
	//*  39   83:invokevirtual   #77  <Method IteratorOptions XMPIteratorImpl.getOptions()>
	//*  40   86:invokevirtual   #82  <Method boolean IteratorOptions.isJustLeafnodes()>
	//*  41   89:ifeq            99
	//*  42   92:aload_2         
	//*  43   93:invokevirtual   #85  <Method boolean XMPNode.hasChildren()>
	//*  44   96:ifne            142
	//*  45   99:aload_0         
	//*  46  100:aload_0         
	//*  47  101:aload_2         
	//*  48  102:aload_0         
	//*  49  103:getfield        #19  <Field XMPIteratorImpl this$0>
	//*  50  106:invokevirtual   #88  <Method String XMPIteratorImpl.getBaseNS()>
	//*  51  109:aload_1         
	//*  52  110:invokevirtual   #92  <Method com.itextpdf.xmp.properties.XMPPropertyInfo createPropertyInfo(XMPNode, String, String)>
	//*  53  113:invokevirtual   #96  <Method void setReturnProperty(com.itextpdf.xmp.properties.XMPPropertyInfo)>
	//*  54  116:iconst_1        
	//*  55  117:ireturn         
			if(xmpnode.getParent() != null)
	//*  56  118:aload_2         
	//*  57  119:invokevirtual   #100 <Method XMPNode XMPNode.getParent()>
	//*  58  122:ifnull          79
				s = accumulatePath(xmpnode, parentPath, index);
	//   59  125:aload_0         
	//   60  126:aload_2         
	//   61  127:aload_0         
	//   62  128:getfield        #50  <Field String parentPath>
	//   63  131:aload_0         
	//   64  132:getfield        #24  <Field int index>
	//   65  135:invokevirtual   #48  <Method String accumulatePath(XMPNode, String, int)>
	//   66  138:astore_1        
			if(!getOptions().isJustLeafnodes() || !xmpnode.hasChildren())
			{
				setReturnProperty(createPropertyInfo(xmpnode, getBaseNS(), s));
				return true;
			} else
	//*  67  139:goto            79
			{
				return hasNext();
	//   68  142:aload_0         
	//   69  143:invokevirtual   #101 <Method boolean hasNext()>
	//   70  146:ireturn         
			}
		} else
		{
			return false;
	//   71  147:iconst_0        
	//   72  148:ireturn         
		}
	}

	private Iterator childrenIterator;
	private int index;
	private String parentPath;
	final XMPIteratorImpl this$0;

	public XMPIteratorImpl$NodeIteratorChildren(XMPNode xmpnode, String s)
	{
		this$0 = XMPIteratorImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field XMPIteratorImpl this$0>
		super(XMPIteratorImpl.this);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #22  <Method void XMPIteratorImpl$NodeIterator(XMPIteratorImpl)>
		index = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #24  <Field int index>
		if(xmpnode.getOptions().isSchemaNode())
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #30  <Method PropertyOptions XMPNode.getOptions()>
	//*  11   19:invokevirtual   #36  <Method boolean PropertyOptions.isSchemaNode()>
	//*  12   22:ifeq            33
			setBaseNS(xmpnode.getName());
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:invokevirtual   #40  <Method String XMPNode.getName()>
	//   16   30:invokevirtual   #44  <Method void XMPIteratorImpl.setBaseNS(String)>
		parentPath = accumulatePath(xmpnode, s, 1);
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:aload_3         
	//   21   37:iconst_1        
	//   22   38:invokevirtual   #48  <Method String accumulatePath(XMPNode, String, int)>
	//   23   41:putfield        #50  <Field String parentPath>
		childrenIterator = xmpnode.iterateChildren();
	//   24   44:aload_0         
	//   25   45:aload_2         
	//   26   46:invokevirtual   #54  <Method Iterator XMPNode.iterateChildren()>
	//   27   49:putfield        #56  <Field Iterator childrenIterator>
	//   28   52:return          
	}
}
