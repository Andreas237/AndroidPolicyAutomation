// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.operation.ListenComplete;
import com.firebase.client.core.operation.OperationSource;
import com.firebase.client.core.persistence.PersistenceManager;
import com.firebase.client.core.view.QuerySpec;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.firebase.client.core:
//			SyncTree, Path, Tag

class SyncTree$8
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
		QuerySpec queryspec = SyncTree.access$500(SyncTree.this, val$tag);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SyncTree this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field Tag val$tag>
	//    4    8:invokestatic    #38  <Method QuerySpec SyncTree.access$500(SyncTree, Tag)>
	//    5   11:astore_1        
		if(queryspec != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          57
		{
			SyncTree.access$200(SyncTree.this).setQueryComplete(queryspec);
	//    8   16:aload_0         
	//    9   17:getfield        #20  <Field SyncTree this$0>
	//   10   20:invokestatic    #42  <Method PersistenceManager SyncTree.access$200(SyncTree)>
	//   11   23:aload_1         
	//   12   24:invokeinterface #48  <Method void PersistenceManager.setQueryComplete(QuerySpec)>
			ListenComplete listencomplete = new ListenComplete(OperationSource.forServerTaggedQuery(queryspec.getParams()), Path.getEmptyPath());
	//   13   29:new             #50  <Class ListenComplete>
	//   14   32:dup             
	//   15   33:aload_1         
	//   16   34:invokevirtual   #56  <Method com.firebase.client.core.view.QueryParams QuerySpec.getParams()>
	//   17   37:invokestatic    #62  <Method OperationSource OperationSource.forServerTaggedQuery(com.firebase.client.core.view.QueryParams)>
	//   18   40:invokestatic    #68  <Method Path Path.getEmptyPath()>
	//   19   43:invokespecial   #71  <Method void ListenComplete(OperationSource, Path)>
	//   20   46:astore_2        
			return SyncTree.access$600(SyncTree.this, queryspec, ((com.firebase.client.core.operation.Operation) (listencomplete)));
	//   21   47:aload_0         
	//   22   48:getfield        #20  <Field SyncTree this$0>
	//   23   51:aload_1         
	//   24   52:aload_2         
	//   25   53:invokestatic    #75  <Method List SyncTree.access$600(SyncTree, QuerySpec, com.firebase.client.core.operation.Operation)>
	//   26   56:areturn         
		} else
		{
			return Collections.emptyList();
	//   27   57:invokestatic    #80  <Method List Collections.emptyList()>
	//   28   60:areturn         
		}
	}

	final SyncTree this$0;
	final Tag val$tag;

	SyncTree$8()
	{
		this$0 = final_synctree;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field SyncTree this$0>
		val$tag = Tag.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Tag val$tag>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
