// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.testutils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

// Referenced classes of package com.itextpdf.testutils:
//			CompareTool

private class CompareTool$ObjectPath$DictPathItem extends CompareTool.ObjectPath.PathItem
{

	public boolean equals(Object obj)
	{
		return (obj instanceof CompareTool$ObjectPath$DictPathItem) && key.equals(((Object) (((CompareTool$ObjectPath$DictPathItem)obj).key)));
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class CompareTool$ObjectPath$DictPathItem>
	//    2    4:ifeq            26
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field String key>
	//    5   11:aload_1         
	//    6   12:checkcast       #2   <Class CompareTool$ObjectPath$DictPathItem>
	//    7   15:getfield        #23  <Field String key>
	//    8   18:invokevirtual   #30  <Method boolean String.equals(Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public int hashCode()
	{
		return key.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String key>
	//    2    4:invokevirtual   #34  <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("Dict key: ").append(key).toString();
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void StringBuilder()>
	//    3    7:ldc1            #43  <String "Dict key: ">
	//    4    9:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #23  <Field String key>
	//    7   16:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #49  <Method String StringBuilder.toString()>
	//    9   22:areturn         
	}

	protected Node toXmlNode(Document document)
	{
		org.w3c.dom.Element element = document.createElement("dictKey");
	//    0    0:aload_1         
	//    1    1:ldc1            #53  <String "dictKey">
	//    2    3:invokeinterface #59  <Method org.w3c.dom.Element Document.createElement(String)>
	//    3    8:astore_2        
		((Node) (element)).appendChild(((Node) (document.createTextNode(key))));
	//    4    9:aload_2         
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getfield        #23  <Field String key>
	//    8   15:invokeinterface #63  <Method org.w3c.dom.Text Document.createTextNode(String)>
	//    9   20:invokeinterface #69  <Method Node Node.appendChild(Node)>
	//   10   25:pop             
		return ((Node) (element));
	//   11   26:aload_2         
	//   12   27:areturn         
	}

	String key;
	final CompareTool.ObjectPath this$1;

	public CompareTool$ObjectPath$DictPathItem(String s)
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
		key = s;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #23  <Field String key>
	//   10   16:return          
	}
}
