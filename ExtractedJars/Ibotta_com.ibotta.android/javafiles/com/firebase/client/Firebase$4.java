// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import com.firebase.client.core.Repo;

// Referenced classes of package com.firebase.client:
//			Firebase

class Firebase$4
	implements Runnable
{

	public void run()
	{
		repo.startTransaction(getPath(), val$handler, val$fireLocalEvents);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Firebase this$0>
	//    2    4:getfield        #34  <Field Repo Firebase.repo>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Firebase this$0>
	//    5   11:invokevirtual   #38  <Method com.firebase.client.core.Path Firebase.getPath()>
	//    6   14:aload_0         
	//    7   15:getfield        #23  <Field Transaction$Handler val$handler>
	//    8   18:aload_0         
	//    9   19:getfield        #25  <Field boolean val$fireLocalEvents>
	//   10   22:invokevirtual   #44  <Method void Repo.startTransaction(com.firebase.client.core.Path, Transaction$Handler, boolean)>
	//   11   25:return          
	}

	final Firebase this$0;
	final boolean val$fireLocalEvents;
	final .Handler val$handler;

	Firebase$4()
	{
		this$0 = final_firebase;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field Firebase this$0>
		val$handler = handler1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Transaction$Handler val$handler>
		val$fireLocalEvents = Z.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #25  <Field boolean val$fireLocalEvents>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
