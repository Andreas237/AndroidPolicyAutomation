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
		LinkedHashTreeMap.Node node3 = stackTop;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field LinkedHashTreeMap$Node stackTop>
	//    2    4:astore          4
		if(node3 == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		LinkedHashTreeMap.Node node1 = node3.parent;
	//    7   13:aload           4
	//    8   15:getfield        #25  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//    9   18:astore_2        
		node3.parent = null;
	//   10   19:aload           4
	//   11   21:aconst_null     
	//   12   22:putfield        #25  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		LinkedHashTreeMap.Node node = node3.right;
	//   13   25:aload           4
	//   14   27:getfield        #28  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//   15   30:astore_1        
		do
		{
			LinkedHashTreeMap.Node node2 = node1;
	//   16   31:aload_2         
	//   17   32:astore_3        
			node1 = node;
	//   18   33:aload_1         
	//   19   34:astore_2        
			if(node1 != null)
	//*  20   35:aload_2         
	//*  21   36:ifnull          52
			{
				node1.parent = node2;
	//   22   39:aload_2         
	//   23   40:aload_3         
	//   24   41:putfield        #25  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
				node = node1.left;
	//   25   44:aload_2         
	//   26   45:getfield        #31  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//   27   48:astore_1        
			} else
	//*  28   49:goto            31
			{
				stackTop = node2;
	//   29   52:aload_0         
	//   30   53:aload_3         
	//   31   54:putfield        #20  <Field LinkedHashTreeMap$Node stackTop>
				return node3;
	//   32   57:aload           4
	//   33   59:areturn         
			}
		} while(true);
	}

	void reset(LinkedHashTreeMap.Node node)
	{
		LinkedHashTreeMap.Node node1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		LinkedHashTreeMap.Node node2;
		for(; node != null; node = node2)
	//*   2    2:aload_1         
	//*   3    3:ifnull          23
		{
			node.parent = node1;
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:putfield        #25  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
			node2 = node.left;
	//    7   11:aload_1         
	//    8   12:getfield        #31  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//    9   15:astore_3        
			node1 = node;
	//   10   16:aload_1         
	//   11   17:astore_2        
		}

	//   12   18:aload_3         
	//   13   19:astore_1        
	//*  14   20:goto            2
		stackTop = node1;
	//   15   23:aload_0         
	//   16   24:aload_2         
	//   17   25:putfield        #20  <Field LinkedHashTreeMap$Node stackTop>
	//   18   28:return          
	}

	private LinkedHashTreeMap.Node stackTop;

	LinkedHashTreeMap$AvlIterator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
