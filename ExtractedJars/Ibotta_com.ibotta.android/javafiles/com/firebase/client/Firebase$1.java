// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import com.firebase.client.core.Repo;
import com.firebase.client.snapshot.Node;

// Referenced classes of package com.firebase.client:
//			Firebase

class Firebase$1
	implements Runnable
{

	public void run()
	{
		repo.setValue(getPath(), val$node, val$listener);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Firebase this$0>
	//    2    4:getfield        #34  <Field Repo Firebase.repo>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Firebase this$0>
	//    5   11:invokevirtual   #38  <Method com.firebase.client.core.Path Firebase.getPath()>
	//    6   14:aload_0         
	//    7   15:getfield        #23  <Field Node val$node>
	//    8   18:aload_0         
	//    9   19:getfield        #25  <Field Firebase$CompletionListener val$listener>
	//   10   22:invokevirtual   #44  <Method void Repo.setValue(com.firebase.client.core.Path, Node, Firebase$CompletionListener)>
	//   11   25:return          
	}

	final Firebase this$0;
	final mpletionListener val$listener;
	final Node val$node;

	Firebase$1()
	{
		this$0 = final_firebase;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field Firebase this$0>
		val$node = node1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Node val$node>
		val$listener = mpletionListener.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field Firebase$CompletionListener val$listener>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
