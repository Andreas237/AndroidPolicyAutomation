// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.FirebaseError;
import com.firebase.client.core.view.QuerySpec;

// Referenced classes of package com.firebase.client.core:
//			Repo, PersistentConnection, Tag

class Repo$3$1
	implements tConnection.RequestResultListener
{

	public void onRequestResult(FirebaseError firebaseerror)
	{
		firebaseerror = ((FirebaseError) (val$onListenComplete.onListenComplete(firebaseerror)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SyncTree$CompletionListener val$onListenComplete>
	//    2    4:aload_1         
	//    3    5:invokeinterface #33  <Method java.util.List SyncTree$CompletionListener.onListenComplete(FirebaseError)>
	//    4   10:astore_1        
		Repo.access$300(this$0, ((java.util.List) (firebaseerror)));
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field Repo$3 this$1>
	//    7   15:getfield        #37  <Field Repo Repo$3.this$0>
	//    8   18:aload_1         
	//    9   19:invokestatic    #43  <Method void Repo.access$300(Repo, java.util.List)>
	//   10   22:return          
	}

	final Repo._cls3 this$1;
	final CompletionListener val$onListenComplete;

	Repo$3$1()
	{
		this$1 = final__pcls3;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Repo$3 this$1>
		val$onListenComplete = CompletionListener.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field SyncTree$CompletionListener val$onListenComplete>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}

	// Unreferenced inner class com/firebase/client/core/Repo$3

/* anonymous class */
	class Repo._cls3
		implements SyncTree.ListenProvider
	{

		public void startListening(QuerySpec queryspec, Tag tag, SyncTree.SyncTreeHash synctreehash, SyncTree.CompletionListener completionlistener)
		{
			Repo.access$400(Repo.this).listen(queryspec, synctreehash, tag, ((PersistentConnection.RequestResultListener) (((Repo._cls3._cls1) (completionlistener)). new Repo._cls3._cls1())));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Repo this$0>
		//    2    4:invokestatic    #28  <Method PersistentConnection Repo.access$400(Repo)>
		//    3    7:aload_1         
		//    4    8:aload_3         
		//    5    9:aload_2         
		//    6   10:new             #13  <Class Repo$3$1>
		//    7   13:dup             
		//    8   14:aload_0         
		//    9   15:aload           4
		//   10   17:invokespecial   #31  <Method void Repo$3$1(Repo$3, SyncTree$CompletionListener)>
		//   11   20:invokevirtual   #37  <Method void PersistentConnection.listen(QuerySpec, SyncTree$SyncTreeHash, Tag, PersistentConnection$RequestResultListener)>
		//   12   23:return          
		}

		public void stopListening(QuerySpec queryspec, Tag tag)
		{
			Repo.access$400(Repo.this).unlisten(queryspec);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Repo this$0>
		//    2    4:invokestatic    #28  <Method PersistentConnection Repo.access$400(Repo)>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #43  <Method void PersistentConnection.unlisten(QuerySpec)>
		//    5   11:return          
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
