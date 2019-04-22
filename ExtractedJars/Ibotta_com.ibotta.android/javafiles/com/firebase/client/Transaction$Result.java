// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import com.firebase.client.snapshot.Node;

// Referenced classes of package com.firebase.client:
//			Transaction

public static class Transaction$Result
{

	public Node getNode()
	{
		return data;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Node data>
	//    2    4:areturn         
	}

	public boolean isSuccess()
	{
		return success;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field boolean success>
	//    2    4:ireturn         
	}

	private Node data;
	private boolean success;

	private Transaction$Result(boolean flag, Node node)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		success = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field boolean success>
		data = node;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field Node data>
	//    8   14:return          
	}

	Transaction$Result(boolean flag, Node node, Transaction._cls1 _pcls1)
	{
		this(flag, node);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #24  <Method void Transaction$Result(boolean, Node)>
	//    4    6:return          
	}
}
