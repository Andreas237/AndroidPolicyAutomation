// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.testutils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

// Referenced classes of package com.itextpdf.testutils:
//			CompareTool

private class CompareTool$ObjectPath$ArrayPathItem extends CompareTool.ObjectPath.PathItem
{

	public boolean equals(Object obj)
	{
		return (obj instanceof CompareTool$ObjectPath$ArrayPathItem) && index == ((CompareTool$ObjectPath$ArrayPathItem)obj).index;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class CompareTool$ObjectPath$ArrayPathItem>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field int index>
	//    5   11:aload_1         
	//    6   12:checkcast       #2   <Class CompareTool$ObjectPath$ArrayPathItem>
	//    7   15:getfield        #23  <Field int index>
	//    8   18:icmpne          23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public int hashCode()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int index>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("Array index: ").append(String.valueOf(index)).toString();
	//    0    0:new             #32  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void StringBuilder()>
	//    3    7:ldc1            #37  <String "Array index: ">
	//    4    9:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #23  <Field int index>
	//    7   16:invokestatic    #47  <Method String String.valueOf(int)>
	//    8   19:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   10   25:areturn         
	}

	protected Node toXmlNode(Document document)
	{
		org.w3c.dom.Element element = document.createElement("arrayIndex");
	//    0    0:aload_1         
	//    1    1:ldc1            #53  <String "arrayIndex">
	//    2    3:invokeinterface #59  <Method org.w3c.dom.Element Document.createElement(String)>
	//    3    8:astore_2        
		((Node) (element)).appendChild(((Node) (document.createTextNode(String.valueOf(index)))));
	//    4    9:aload_2         
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getfield        #23  <Field int index>
	//    8   15:invokestatic    #47  <Method String String.valueOf(int)>
	//    9   18:invokeinterface #63  <Method org.w3c.dom.Text Document.createTextNode(String)>
	//   10   23:invokeinterface #69  <Method Node Node.appendChild(Node)>
	//   11   28:pop             
		return ((Node) (element));
	//   12   29:aload_2         
	//   13   30:areturn         
	}

	int index;
	final CompareTool.ObjectPath this$1;

	public CompareTool$ObjectPath$ArrayPathItem(int i)
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
		index = i;
	//    7   11:aload_0         
	//    8   12:iload_2         
	//    9   13:putfield        #23  <Field int index>
	//   10   16:return          
	}
}
