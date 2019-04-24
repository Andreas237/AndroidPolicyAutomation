// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.testutils;


// Referenced classes of package com.itextpdf.testutils:
//			CompareTool

private class CompareTool$ObjectPath$Pair
{

	public boolean equals(Object obj)
	{
		return (obj instanceof CompareTool$ObjectPath$Pair) && first.equals(((CompareTool$ObjectPath$Pair)obj).first) && second.equals(((CompareTool$ObjectPath$Pair)obj).second);
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class CompareTool$ObjectPath$Pair>
	//    2    4:ifeq            43
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field Object first>
	//    5   11:aload_1         
	//    6   12:checkcast       #2   <Class CompareTool$ObjectPath$Pair>
	//    7   15:getfield        #26  <Field Object first>
	//    8   18:invokevirtual   #35  <Method boolean Object.equals(Object)>
	//    9   21:ifeq            43
	//   10   24:aload_0         
	//   11   25:getfield        #28  <Field Object second>
	//   12   28:aload_1         
	//   13   29:checkcast       #2   <Class CompareTool$ObjectPath$Pair>
	//   14   32:getfield        #28  <Field Object second>
	//   15   35:invokevirtual   #35  <Method boolean Object.equals(Object)>
	//   16   38:ifeq            43
	//   17   41:iconst_1        
	//   18   42:ireturn         
	//   19   43:iconst_0        
	//   20   44:ireturn         
	}

	public int hashCode()
	{
		return first.hashCode() * 31 + second.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Object first>
	//    2    4:invokevirtual   #39  <Method int Object.hashCode()>
	//    3    7:bipush          31
	//    4    9:imul            
	//    5   10:aload_0         
	//    6   11:getfield        #28  <Field Object second>
	//    7   14:invokevirtual   #39  <Method int Object.hashCode()>
	//    8   17:iadd            
	//    9   18:ireturn         
	}

	private Object first;
	private Object second;
	final CompareTool.ObjectPath this$1;

	public CompareTool$ObjectPath$Pair(Object obj, Object obj1)
	{
		this$1 = CompareTool.ObjectPath.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field CompareTool$ObjectPath this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		first = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field Object first>
		second = obj1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field Object second>
	//   11   19:return          
	}
}
