// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;


// Referenced classes of package com.google.gson.internal:
//			LinkedHashTreeMap

static class LinkedHashTreeMap$AvlIterator
{

	public LinkedHashTreeMap.Node next()
	{
		LinkedHashTreeMap.Node node2 = stackTop;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field LinkedHashTreeMap$Node stackTop>
	//    2    4:astore_3        
		if(node2 == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		LinkedHashTreeMap.Node node1 = node2.parent;
	//    7   11:aload_3         
	//    8   12:getfield        #25  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//    9   15:astore_2        
		node2.parent = null;
	//   10   16:aload_3         
	//   11   17:aconst_null     
	//   12   18:putfield        #25  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		for(LinkedHashTreeMap.Node node = node2.right; node != null; node = node.left)
	//*  13   21:aload_3         
	//*  14   22:getfield        #28  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//*  15   25:astore_1        
	//*  16   26:aload_1         
	//*  17   27:ifnull          45
		{
			node.parent = node1;
	//   18   30:aload_1         
	//   19   31:aload_2         
	//   20   32:putfield        #25  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
			node1 = node;
	//   21   35:aload_1         
	//   22   36:astore_2        
		}

	//   23   37:aload_1         
	//   24   38:getfield        #31  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//   25   41:astore_1        
	//*  26   42:goto            26
		stackTop = node1;
	//   27   45:aload_0         
	//   28   46:aload_2         
	//   29   47:putfield        #20  <Field LinkedHashTreeMap$Node stackTop>
		return node2;
	//   30   50:aload_3         
	//   31   51:areturn         
	}

	void reset(LinkedHashTreeMap.Node node)
	{
		LinkedHashTreeMap.Node node1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		for(; node != null; node = node.left)
	//*   2    2:aload_1         
	//*   3    3:ifnull          21
		{
			node.parent = node1;
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:putfield        #25  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
			node1 = node;
	//    7   11:aload_1         
	//    8   12:astore_2        
		}

	//    9   13:aload_1         
	//   10   14:getfield        #31  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//   11   17:astore_1        
	//*  12   18:goto            2
		stackTop = node1;
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:putfield        #20  <Field LinkedHashTreeMap$Node stackTop>
	//   16   26:return          
	}

	private LinkedHashTreeMap.Node stackTop;

	LinkedHashTreeMap$AvlIterator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
