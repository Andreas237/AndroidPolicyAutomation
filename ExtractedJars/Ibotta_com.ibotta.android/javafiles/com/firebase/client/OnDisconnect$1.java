// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import com.firebase.client.core.Repo;
import com.firebase.client.snapshot.Node;

// Referenced classes of package com.firebase.client:
//			OnDisconnect

class OnDisconnect$1
	implements Runnable
{

	public void run()
	{
		OnDisconnect.access$100(OnDisconnect.this).onDisconnectSetValue(OnDisconnect.access$000(OnDisconnect.this), val$node, val$onComplete);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field OnDisconnect this$0>
	//    2    4:invokestatic    #34  <Method Repo OnDisconnect.access$100(OnDisconnect)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field OnDisconnect this$0>
	//    5   11:invokestatic    #38  <Method com.firebase.client.core.Path OnDisconnect.access$000(OnDisconnect)>
	//    6   14:aload_0         
	//    7   15:getfield        #23  <Field Node val$node>
	//    8   18:aload_0         
	//    9   19:getfield        #25  <Field Firebase$CompletionListener val$onComplete>
	//   10   22:invokevirtual   #44  <Method void Repo.onDisconnectSetValue(com.firebase.client.core.Path, Node, Firebase$CompletionListener)>
	//   11   25:return          
	}

	final OnDisconnect this$0;
	final Node val$node;
	final tionListener val$onComplete;

	OnDisconnect$1()
	{
		this$0 = final_ondisconnect;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field OnDisconnect this$0>
		val$node = node1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Node val$node>
		val$onComplete = tionListener.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field Firebase$CompletionListener val$onComplete>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
