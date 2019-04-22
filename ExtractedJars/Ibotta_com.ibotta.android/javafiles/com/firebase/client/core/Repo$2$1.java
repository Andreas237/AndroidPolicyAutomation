// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.view.QuerySpec;
import com.firebase.client.snapshot.Node;

// Referenced classes of package com.firebase.client.core:
//			Repo, SnapshotHolder, SyncTree, Tag

class Repo$2$1
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) (Repo.access$100(this$0).getNode(val$query.getPath())));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Repo$2 this$1>
	//    2    4:getfield        #34  <Field Repo Repo$2.this$0>
	//    3    7:invokestatic    #40  <Method SnapshotHolder Repo.access$100(Repo)>
	//    4   10:aload_0         
	//    5   11:getfield        #23  <Field QuerySpec val$query>
	//    6   14:invokevirtual   #46  <Method Path QuerySpec.getPath()>
	//    7   17:invokevirtual   #52  <Method Node SnapshotHolder.getNode(Path)>
	//    8   20:astore_1        
		if(!((Node) (obj)).isEmpty())
	//*   9   21:aload_1         
	//*  10   22:invokeinterface #58  <Method boolean Node.isEmpty()>
	//*  11   27:ifne            74
		{
			obj = ((Object) (Repo.access$200(this$0).applyServerOverwrite(val$query.getPath(), ((Node) (obj)))));
	//   12   30:aload_0         
	//   13   31:getfield        #21  <Field Repo$2 this$1>
	//   14   34:getfield        #34  <Field Repo Repo$2.this$0>
	//   15   37:invokestatic    #62  <Method SyncTree Repo.access$200(Repo)>
	//   16   40:aload_0         
	//   17   41:getfield        #23  <Field QuerySpec val$query>
	//   18   44:invokevirtual   #46  <Method Path QuerySpec.getPath()>
	//   19   47:aload_1         
	//   20   48:invokevirtual   #68  <Method java.util.List SyncTree.applyServerOverwrite(Path, Node)>
	//   21   51:astore_1        
			Repo.access$300(this$0, ((java.util.List) (obj)));
	//   22   52:aload_0         
	//   23   53:getfield        #21  <Field Repo$2 this$1>
	//   24   56:getfield        #34  <Field Repo Repo$2.this$0>
	//   25   59:aload_1         
	//   26   60:invokestatic    #72  <Method void Repo.access$300(Repo, java.util.List)>
			val$onComplete.onListenComplete(((com.firebase.client.FirebaseError) (null)));
	//   27   63:aload_0         
	//   28   64:getfield        #25  <Field SyncTree$CompletionListener val$onComplete>
	//   29   67:aconst_null     
	//   30   68:invokeinterface #78  <Method java.util.List SyncTree$CompletionListener.onListenComplete(com.firebase.client.FirebaseError)>
	//   31   73:pop             
		}
	//   32   74:return          
	}

	final Repo._cls2 this$1;
	final CompletionListener val$onComplete;
	final QuerySpec val$query;

	Repo$2$1()
	{
		this$1 = final__pcls2;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field Repo$2 this$1>
		val$query = queryspec;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field QuerySpec val$query>
		val$onComplete = CompletionListener.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field SyncTree$CompletionListener val$onComplete>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}

	// Unreferenced inner class com/firebase/client/core/Repo$2

/* anonymous class */
	class Repo._cls2
		implements SyncTree.ListenProvider
	{

		public void startListening(final QuerySpec query, Tag tag, SyncTree.SyncTreeHash synctreehash, SyncTree.CompletionListener completionlistener)
		{
			scheduleNow(((Runnable) (((Repo._cls2._cls1) (completionlistener)). new Repo._cls2._cls1())));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Repo this$0>
		//    2    4:new             #13  <Class Repo$2$1>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:aload           4
		//    7   12:invokespecial   #27  <Method void Repo$2$1(Repo$2, QuerySpec, SyncTree$CompletionListener)>
		//    8   15:invokevirtual   #31  <Method void Repo.scheduleNow(Runnable)>
		//    9   18:return          
		}

		public void stopListening(QuerySpec queryspec, Tag tag)
		{
		//    0    0:return          
		}

		final Repo this$0;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Repo this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
	}

}
