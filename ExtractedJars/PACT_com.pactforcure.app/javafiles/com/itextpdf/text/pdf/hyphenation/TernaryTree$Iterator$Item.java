// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.hyphenation;


// Referenced classes of package com.itextpdf.text.pdf.hyphenation:
//			TernaryTree

private class TernaryTree$Iterator$Item
	implements Cloneable
{

	public TernaryTree$Iterator$Item clone()
	{
		return new TernaryTree$Iterator$Item(parent, child);
	//    0    0:new             #2   <Class TernaryTree$Iterator$Item>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field TernaryTree$Iterator this$1>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field char parent>
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field char child>
	//    8   16:invokespecial   #34  <Method void TernaryTree$Iterator$Item(TernaryTree$Iterator, char, char)>
	//    9   19:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method TernaryTree$Iterator$Item clone()>
	//    2    4:areturn         
	}

	char child;
	char parent;
	final TernaryTree.Iterator this$1;

	public TernaryTree$Iterator$Item()
	{
		this$1 = TernaryTree.Iterator.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field TernaryTree$Iterator this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		parent = '\0';
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #26  <Field char parent>
		child = '\0';
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #28  <Field char child>
	//   11   19:return          
	}

	public TernaryTree$Iterator$Item(char c, char c1)
	{
		this$1 = TernaryTree.Iterator.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field TernaryTree$Iterator this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		parent = c;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #26  <Field char parent>
		child = c1;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #28  <Field char child>
	//   11   19:return          
	}
}
