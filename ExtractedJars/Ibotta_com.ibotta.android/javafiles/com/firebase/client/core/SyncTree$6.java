// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.operation.Merge;
import com.firebase.client.core.operation.OperationSource;
import com.firebase.client.core.persistence.PersistenceManager;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

// Referenced classes of package com.firebase.client.core:
//			SyncTree, CompoundWrite, Path

class SyncTree$6
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
		CompoundWrite compoundwrite = CompoundWrite.fromPathMerge(val$changedChildren);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Map val$changedChildren>
	//    2    4:invokestatic    #44  <Method CompoundWrite CompoundWrite.fromPathMerge(Map)>
	//    3    7:astore_1        
		SyncTree.access$200(SyncTree.this).updateServerCache(val$path, compoundwrite);
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field SyncTree this$0>
	//    6   12:invokestatic    #48  <Method PersistenceManager SyncTree.access$200(SyncTree)>
	//    7   15:aload_0         
	//    8   16:getfield        #26  <Field Path val$path>
	//    9   19:aload_1         
	//   10   20:invokeinterface #54  <Method void PersistenceManager.updateServerCache(Path, CompoundWrite)>
		return SyncTree.access$400(SyncTree.this, ((com.firebase.client.core.operation.Operation) (new Merge(OperationSource.SERVER, val$path, compoundwrite))));
	//   11   25:aload_0         
	//   12   26:getfield        #22  <Field SyncTree this$0>
	//   13   29:new             #56  <Class Merge>
	//   14   32:dup             
	//   15   33:getstatic       #62  <Field OperationSource OperationSource.SERVER>
	//   16   36:aload_0         
	//   17   37:getfield        #26  <Field Path val$path>
	//   18   40:aload_1         
	//   19   41:invokespecial   #65  <Method void Merge(OperationSource, Path, CompoundWrite)>
	//   20   44:invokestatic    #69  <Method List SyncTree.access$400(SyncTree, com.firebase.client.core.operation.Operation)>
	//   21   47:areturn         
	}

	final SyncTree this$0;
	final Map val$changedChildren;
	final Path val$path;

	SyncTree$6()
	{
		this$0 = final_synctree;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field SyncTree this$0>
		val$changedChildren = map;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field Map val$changedChildren>
		val$path = Path.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field Path val$path>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #29  <Method void Object()>
	//   11   19:return          
	}
}
