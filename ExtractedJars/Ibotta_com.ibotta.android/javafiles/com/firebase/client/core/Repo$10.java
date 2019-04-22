// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

// Referenced classes of package com.firebase.client.core:
//			Repo, SparseSnapshotTree, Path

class Repo$10
	implements com.firebase.client..CompletionListener
{

	public void onComplete(FirebaseError firebaseerror, Firebase firebase)
	{
		if(firebaseerror == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       19
			Repo.access$700(Repo.this).forget(val$path);
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Repo this$0>
	//    4    8:invokestatic    #35  <Method SparseSnapshotTree Repo.access$700(Repo)>
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field Path val$path>
	//    7   15:invokevirtual   #41  <Method boolean SparseSnapshotTree.forget(Path)>
	//    8   18:pop             
		callOnComplete(val$onComplete, firebaseerror, val$path);
	//    9   19:aload_0         
	//   10   20:getfield        #21  <Field Repo this$0>
	//   11   23:aload_0         
	//   12   24:getfield        #25  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #23  <Field Path val$path>
	//   16   32:invokevirtual   #45  <Method void Repo.callOnComplete(com.firebase.client.Firebase$CompletionListener, FirebaseError, Path)>
	//   17   35:return          
	}

	final Repo this$0;
	final com.firebase.client..CompletionListener val$onComplete;
	final Path val$path;

	Repo$10()
	{
		this$0 = final_repo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field Repo this$0>
		val$path = path1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Path val$path>
		val$onComplete = com.firebase.client..CompletionListener.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
