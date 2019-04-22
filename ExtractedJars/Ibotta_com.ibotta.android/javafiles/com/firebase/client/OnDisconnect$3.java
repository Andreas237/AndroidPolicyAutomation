// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import com.firebase.client.core.Repo;

// Referenced classes of package com.firebase.client:
//			OnDisconnect

class OnDisconnect$3
	implements Runnable
{

	public void run()
	{
		OnDisconnect.access$100(OnDisconnect.this).onDisconnectCancel(OnDisconnect.access$000(OnDisconnect.this), val$listener);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field OnDisconnect this$0>
	//    2    4:invokestatic    #30  <Method Repo OnDisconnect.access$100(OnDisconnect)>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field OnDisconnect this$0>
	//    5   11:invokestatic    #34  <Method com.firebase.client.core.Path OnDisconnect.access$000(OnDisconnect)>
	//    6   14:aload_0         
	//    7   15:getfield        #21  <Field Firebase$CompletionListener val$listener>
	//    8   18:invokevirtual   #40  <Method void Repo.onDisconnectCancel(com.firebase.client.core.Path, Firebase$CompletionListener)>
	//    9   21:return          
	}

	final OnDisconnect this$0;
	final tionListener val$listener;

	OnDisconnect$3()
	{
		this$0 = final_ondisconnect;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field OnDisconnect this$0>
		val$listener = tionListener.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Firebase$CompletionListener val$listener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
