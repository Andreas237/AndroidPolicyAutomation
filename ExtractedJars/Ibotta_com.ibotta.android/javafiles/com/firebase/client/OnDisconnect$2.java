// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import com.firebase.client.core.Repo;
import java.util.Map;

// Referenced classes of package com.firebase.client:
//			OnDisconnect

class OnDisconnect$2
	implements Runnable
{

	public void run()
	{
		OnDisconnect.access$100(OnDisconnect.this).onDisconnectUpdate(OnDisconnect.access$000(OnDisconnect.this), val$parsedUpdate, val$listener, val$update);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field OnDisconnect this$0>
	//    2    4:invokestatic    #37  <Method Repo OnDisconnect.access$100(OnDisconnect)>
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field OnDisconnect this$0>
	//    5   11:invokestatic    #41  <Method com.firebase.client.core.Path OnDisconnect.access$000(OnDisconnect)>
	//    6   14:aload_0         
	//    7   15:getfield        #24  <Field Map val$parsedUpdate>
	//    8   18:aload_0         
	//    9   19:getfield        #26  <Field Firebase$CompletionListener val$listener>
	//   10   22:aload_0         
	//   11   23:getfield        #28  <Field Map val$update>
	//   12   26:invokevirtual   #47  <Method void Repo.onDisconnectUpdate(com.firebase.client.core.Path, Map, Firebase$CompletionListener, Map)>
	//   13   29:return          
	}

	final OnDisconnect this$0;
	final tionListener val$listener;
	final Map val$parsedUpdate;
	final Map val$update;

	OnDisconnect$2()
	{
		this$0 = final_ondisconnect;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field OnDisconnect this$0>
		val$parsedUpdate = map;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field Map val$parsedUpdate>
		val$listener = tionlistener;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field Firebase$CompletionListener val$listener>
		val$update = Map.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #28  <Field Map val$update>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
