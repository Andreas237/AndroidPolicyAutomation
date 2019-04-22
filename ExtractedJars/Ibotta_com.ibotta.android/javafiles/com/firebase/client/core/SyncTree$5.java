// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.operation.OperationSource;
import com.firebase.client.core.operation.Overwrite;
import com.firebase.client.core.persistence.PersistenceManager;
import com.firebase.client.core.view.QuerySpec;
import com.firebase.client.snapshot.Node;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.firebase.client.core:
//			SyncTree, Path

class SyncTree$5
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method List call()>
	//    2    4:areturn         
	}

	public List call()
	{
		SyncTree.access$200(SyncTree.this).updateServerCache(QuerySpec.defaultQueryAtPath(val$path), val$newData);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field SyncTree this$0>
	//    2    4:invokestatic    #42  <Method PersistenceManager SyncTree.access$200(SyncTree)>
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field Path val$path>
	//    5   11:invokestatic    #48  <Method QuerySpec QuerySpec.defaultQueryAtPath(Path)>
	//    6   14:aload_0         
	//    7   15:getfield        #26  <Field Node val$newData>
	//    8   18:invokeinterface #54  <Method void PersistenceManager.updateServerCache(QuerySpec, Node)>
		return SyncTree.access$400(SyncTree.this, ((com.firebase.client.core.operation.Operation) (new Overwrite(OperationSource.SERVER, val$path, val$newData))));
	//    9   23:aload_0         
	//   10   24:getfield        #22  <Field SyncTree this$0>
	//   11   27:new             #56  <Class Overwrite>
	//   12   30:dup             
	//   13   31:getstatic       #62  <Field OperationSource OperationSource.SERVER>
	//   14   34:aload_0         
	//   15   35:getfield        #24  <Field Path val$path>
	//   16   38:aload_0         
	//   17   39:getfield        #26  <Field Node val$newData>
	//   18   42:invokespecial   #65  <Method void Overwrite(OperationSource, Path, Node)>
	//   19   45:invokestatic    #69  <Method List SyncTree.access$400(SyncTree, com.firebase.client.core.operation.Operation)>
	//   20   48:areturn         
	}

	final SyncTree this$0;
	final Node val$newData;
	final Path val$path;

	SyncTree$5()
	{
		this$0 = final_synctree;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field SyncTree this$0>
		val$path = path1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field Path val$path>
		val$newData = Node.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field Node val$newData>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #29  <Method void Object()>
	//   11   19:return          
	}
}
