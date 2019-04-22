// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import com.firebase.client.core.CompoundWrite;
import com.firebase.client.core.Repo;
import java.util.Map;

// Referenced classes of package com.firebase.client:
//			Firebase

class Firebase$3
	implements Runnable
{

	public void run()
	{
		repo.updateChildren(getPath(), val$merge, val$listener, val$update);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Firebase this$0>
	//    2    4:getfield        #38  <Field Repo Firebase.repo>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field Firebase this$0>
	//    5   11:invokevirtual   #42  <Method com.firebase.client.core.Path Firebase.getPath()>
	//    6   14:aload_0         
	//    7   15:getfield        #25  <Field CompoundWrite val$merge>
	//    8   18:aload_0         
	//    9   19:getfield        #27  <Field Firebase$CompletionListener val$listener>
	//   10   22:aload_0         
	//   11   23:getfield        #29  <Field Map val$update>
	//   12   26:invokevirtual   #47  <Method void Repo.updateChildren(com.firebase.client.core.Path, CompoundWrite, Firebase$CompletionListener, Map)>
	//   13   29:return          
	}

	final Firebase this$0;
	final mpletionListener val$listener;
	final CompoundWrite val$merge;
	final Map val$update;

	Firebase$3()
	{
		this$0 = final_firebase;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field Firebase this$0>
		val$merge = compoundwrite;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field CompoundWrite val$merge>
		val$listener = mpletionlistener;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field Firebase$CompletionListener val$listener>
		val$update = Map.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field Map val$update>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
