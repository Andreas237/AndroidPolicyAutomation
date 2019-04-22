// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.snapshot.Node;

// Referenced classes of package com.firebase.client.core:
//			Repo, SparseSnapshotTree, Path

class Repo$8
	implements com.firebase.client.e.CompletionListener
{

	public void onComplete(FirebaseError firebaseerror, Firebase firebase)
	{
		Repo.access$500(Repo.this, "onDisconnect().setValue", val$path, firebaseerror);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Repo this$0>
	//    2    4:ldc1            #37  <String "onDisconnect().setValue">
	//    3    6:aload_0         
	//    4    7:getfield        #25  <Field Path val$path>
	//    5   10:aload_1         
	//    6   11:invokestatic    #41  <Method void Repo.access$500(Repo, String, Path, FirebaseError)>
		if(firebaseerror == null)
	//*   7   14:aload_1         
	//*   8   15:ifnonnull       36
			Repo.access$700(Repo.this).remember(val$path, val$newValue);
	//    9   18:aload_0         
	//   10   19:getfield        #23  <Field Repo this$0>
	//   11   22:invokestatic    #45  <Method SparseSnapshotTree Repo.access$700(Repo)>
	//   12   25:aload_0         
	//   13   26:getfield        #25  <Field Path val$path>
	//   14   29:aload_0         
	//   15   30:getfield        #27  <Field Node val$newValue>
	//   16   33:invokevirtual   #51  <Method void SparseSnapshotTree.remember(Path, Node)>
		callOnComplete(val$onComplete, firebaseerror, val$path);
	//   17   36:aload_0         
	//   18   37:getfield        #23  <Field Repo this$0>
	//   19   40:aload_0         
	//   20   41:getfield        #29  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
	//   21   44:aload_1         
	//   22   45:aload_0         
	//   23   46:getfield        #25  <Field Path val$path>
	//   24   49:invokevirtual   #55  <Method void Repo.callOnComplete(com.firebase.client.Firebase$CompletionListener, FirebaseError, Path)>
	//   25   52:return          
	}

	final Repo this$0;
	final Node val$newValue;
	final com.firebase.client.e.CompletionListener val$onComplete;
	final Path val$path;

	Repo$8()
	{
		this$0 = final_repo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field Repo this$0>
		val$path = path1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field Path val$path>
		val$newValue = node;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field Node val$newValue>
		val$onComplete = com.firebase.client.e.CompletionListener.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
