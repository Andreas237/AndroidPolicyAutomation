// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.operation.Merge;
import com.firebase.client.core.operation.OperationSource;
import com.firebase.client.core.persistence.PersistenceManager;
import com.firebase.client.core.view.QuerySpec;
import java.util.*;
import java.util.concurrent.Callable;

// Referenced classes of package com.firebase.client.core:
//			SyncTree, Path, CompoundWrite, Tag

class SyncTree$10
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method List call()>
	//    2    4:areturn         
	}

	public List call()
	{
		QuerySpec queryspec = SyncTree.access$500(SyncTree.this, val$tag);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field SyncTree this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field Tag val$tag>
	//    4    8:invokestatic    #46  <Method QuerySpec SyncTree.access$500(SyncTree, Tag)>
	//    5   11:astore_1        
		if(queryspec != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          80
		{
			Object obj = ((Object) (Path.getRelative(queryspec.getPath(), val$path)));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #52  <Method Path QuerySpec.getPath()>
	//   10   20:aload_0         
	//   11   21:getfield        #28  <Field Path val$path>
	//   12   24:invokestatic    #58  <Method Path Path.getRelative(Path, Path)>
	//   13   27:astore_2        
			CompoundWrite compoundwrite = CompoundWrite.fromPathMerge(val$changedChildren);
	//   14   28:aload_0         
	//   15   29:getfield        #30  <Field Map val$changedChildren>
	//   16   32:invokestatic    #64  <Method CompoundWrite CompoundWrite.fromPathMerge(Map)>
	//   17   35:astore_3        
			SyncTree.access$200(SyncTree.this).updateServerCache(val$path, compoundwrite);
	//   18   36:aload_0         
	//   19   37:getfield        #24  <Field SyncTree this$0>
	//   20   40:invokestatic    #68  <Method PersistenceManager SyncTree.access$200(SyncTree)>
	//   21   43:aload_0         
	//   22   44:getfield        #28  <Field Path val$path>
	//   23   47:aload_3         
	//   24   48:invokeinterface #74  <Method void PersistenceManager.updateServerCache(Path, CompoundWrite)>
			obj = ((Object) (new Merge(OperationSource.forServerTaggedQuery(queryspec.getParams()), ((Path) (obj)), compoundwrite)));
	//   25   53:new             #76  <Class Merge>
	//   26   56:dup             
	//   27   57:aload_1         
	//   28   58:invokevirtual   #80  <Method com.firebase.client.core.view.QueryParams QuerySpec.getParams()>
	//   29   61:invokestatic    #86  <Method OperationSource OperationSource.forServerTaggedQuery(com.firebase.client.core.view.QueryParams)>
	//   30   64:aload_2         
	//   31   65:aload_3         
	//   32   66:invokespecial   #89  <Method void Merge(OperationSource, Path, CompoundWrite)>
	//   33   69:astore_2        
			return SyncTree.access$600(SyncTree.this, queryspec, ((com.firebase.client.core.operation.Operation) (obj)));
	//   34   70:aload_0         
	//   35   71:getfield        #24  <Field SyncTree this$0>
	//   36   74:aload_1         
	//   37   75:aload_2         
	//   38   76:invokestatic    #93  <Method List SyncTree.access$600(SyncTree, QuerySpec, com.firebase.client.core.operation.Operation)>
	//   39   79:areturn         
		} else
		{
			return Collections.emptyList();
	//   40   80:invokestatic    #98  <Method List Collections.emptyList()>
	//   41   83:areturn         
		}
	}

	final SyncTree this$0;
	final Map val$changedChildren;
	final Path val$path;
	final Tag val$tag;

	SyncTree$10()
	{
		this$0 = final_synctree;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field SyncTree this$0>
		val$tag = tag1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field Tag val$tag>
		val$path = path1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field Path val$path>
		val$changedChildren = Map.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field Map val$changedChildren>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #33  <Method void Object()>
	//   14   25:return          
	}
}
