// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.testutils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

// Referenced classes of package com.itextpdf.testutils:
//			CompareTool

private class CompareTool$ObjectPath$OffsetPathItem extends CompareTool.ObjectPath.PathItem
{

	public boolean equals(Object obj)
	{
		return (obj instanceof CompareTool$ObjectPath$OffsetPathItem) && offset == ((CompareTool$ObjectPath$OffsetPathItem)obj).offset;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class CompareTool$ObjectPath$OffsetPathItem>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field int offset>
	//    5   11:aload_1         
	//    6   12:checkcast       #2   <Class CompareTool$ObjectPath$OffsetPathItem>
	//    7   15:getfield        #23  <Field int offset>
	//    8   18:icmpne          23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public int hashCode()
	{
		return offset;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int offset>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("Offset: ").append(String.valueOf(offset)).toString();
	//    0    0:new             #32  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void StringBuilder()>
	//    3    7:ldc1            #37  <String "Offset: ">
	//    4    9:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #23  <Field int offset>
	//    7   16:invokestatic    #47  <Method String String.valueOf(int)>
	//    8   19:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   10   25:areturn         
	}

	protected Node toXmlNode(Document document)
	{
		org.w3c.dom.Element element = document.createElement("offset");
	//    0    0:aload_1         
	//    1    1:ldc1            #52  <String "offset">
	//    2    3:invokeinterface #58  <Method org.w3c.dom.Element Document.createElement(String)>
	//    3    8:astore_2        
		((Node) (element)).appendChild(((Node) (document.createTextNode(String.valueOf(offset)))));
	//    4    9:aload_2         
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getfield        #23  <Field int offset>
	//    8   15:invokestatic    #47  <Method String String.valueOf(int)>
	//    9   18:invokeinterface #62  <Method org.w3c.dom.Text Document.createTextNode(String)>
	//   10   23:invokeinterface #68  <Method Node Node.appendChild(Node)>
	//   11   28:pop             
		return ((Node) (element));
	//   12   29:aload_2         
	//   13   30:areturn         
	}

	int offset;
	final CompareTool.ObjectPath this$1;

	public CompareTool$ObjectPath$OffsetPathItem(int i)
	{
		this$1 = CompareTool.ObjectPath.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field CompareTool$ObjectPath this$1>
		super(CompareTool.ObjectPath.this, ((CompareTool._cls1) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokespecial   #21  <Method void CompareTool$ObjectPath$PathItem(CompareTool$ObjectPath, CompareTool$1)>
		offset = i;
	//    7   11:aload_0         
	//    8   12:iload_2         
	//    9   13:putfield        #23  <Field int offset>
	//   10   16:return          
	}
}
