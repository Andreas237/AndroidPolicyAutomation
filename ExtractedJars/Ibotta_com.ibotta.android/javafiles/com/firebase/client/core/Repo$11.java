// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.snapshot.Node;
import java.util.List;

// Referenced classes of package com.firebase.client.core:
//			Repo, SyncTree, Path

class Repo$11
	implements apshotTree.SparseSnapshotTreeVisitor
{

	public void visitTree(Path path, Node node)
	{
		val$events.addAll(((java.util.Collection) (Repo.access$800(Repo.this).applyServerOverwrite(path, node))));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List val$events>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Repo this$0>
	//    4    8:invokestatic    #30  <Method SyncTree Repo.access$800(Repo)>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #36  <Method List SyncTree.applyServerOverwrite(Path, Node)>
	//    8   16:invokeinterface #42  <Method boolean List.addAll(java.util.Collection)>
	//    9   21:pop             
		path = Repo.access$900(Repo.this, path, -9);
	//   10   22:aload_0         
	//   11   23:getfield        #19  <Field Repo this$0>
	//   12   26:aload_1         
	//   13   27:bipush          -9
	//   14   29:invokestatic    #46  <Method Path Repo.access$900(Repo, Path, int)>
	//   15   32:astore_1        
		Repo.access$1000(Repo.this, path);
	//   16   33:aload_0         
	//   17   34:getfield        #19  <Field Repo this$0>
	//   18   37:aload_1         
	//   19   38:invokestatic    #50  <Method Path Repo.access$1000(Repo, Path)>
	//   20   41:pop             
	//   21   42:return          
	}

	final Repo this$0;
	final List val$events;

	Repo$11()
	{
		this$0 = final_repo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Repo this$0>
		val$events = List.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field List val$events>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
