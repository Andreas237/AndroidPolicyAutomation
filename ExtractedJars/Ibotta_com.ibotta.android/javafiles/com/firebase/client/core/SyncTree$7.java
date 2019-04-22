// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.operation.ListenComplete;
import com.firebase.client.core.operation.OperationSource;
import com.firebase.client.core.persistence.PersistenceManager;
import com.firebase.client.core.view.QuerySpec;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.firebase.client.core:
//			SyncTree, Path

class SyncTree$7
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method List call()>
	//    2    4:areturn         
	}

	public List call()
	{
		SyncTree.access$200(SyncTree.this).setQueryComplete(QuerySpec.defaultQueryAtPath(val$path));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SyncTree this$0>
	//    2    4:invokestatic    #38  <Method PersistenceManager SyncTree.access$200(SyncTree)>
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field Path val$path>
	//    5   11:invokestatic    #44  <Method QuerySpec QuerySpec.defaultQueryAtPath(Path)>
	//    6   14:invokeinterface #50  <Method void PersistenceManager.setQueryComplete(QuerySpec)>
		return SyncTree.access$400(SyncTree.this, ((com.firebase.client.core.operation.Operation) (new ListenComplete(OperationSource.SERVER, val$path))));
	//    7   19:aload_0         
	//    8   20:getfield        #20  <Field SyncTree this$0>
	//    9   23:new             #52  <Class ListenComplete>
	//   10   26:dup             
	//   11   27:getstatic       #58  <Field OperationSource OperationSource.SERVER>
	//   12   30:aload_0         
	//   13   31:getfield        #22  <Field Path val$path>
	//   14   34:invokespecial   #61  <Method void ListenComplete(OperationSource, Path)>
	//   15   37:invokestatic    #65  <Method List SyncTree.access$400(SyncTree, com.firebase.client.core.operation.Operation)>
	//   16   40:areturn         
	}

	final SyncTree this$0;
	final Path val$path;

	SyncTree$7()
	{
		this$0 = final_synctree;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field SyncTree this$0>
		val$path = Path.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Path val$path>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
