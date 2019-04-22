// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.operation.Merge;
import com.firebase.client.core.operation.OperationSource;
import com.firebase.client.core.persistence.PersistenceManager;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.firebase.client.core:
//			SyncTree, WriteTree, CompoundWrite, Path

class SyncTree$2
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method List call()>
	//    2    4:areturn         
	}

	public List call()
		throws Exception
	{
		if(val$persist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field boolean val$persist>
	//*   2    4:ifeq            31
			SyncTree.access$200(SyncTree.this).saveUserMerge(val$path, val$unresolvedChildren, val$writeId);
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field SyncTree this$0>
	//    5   11:invokestatic    #53  <Method PersistenceManager SyncTree.access$200(SyncTree)>
	//    6   14:aload_0         
	//    7   15:getfield        #31  <Field Path val$path>
	//    8   18:aload_0         
	//    9   19:getfield        #33  <Field CompoundWrite val$unresolvedChildren>
	//   10   22:aload_0         
	//   11   23:getfield        #35  <Field long val$writeId>
	//   12   26:invokeinterface #59  <Method void PersistenceManager.saveUserMerge(Path, CompoundWrite, long)>
		SyncTree.access$300(SyncTree.this).addMerge(val$path, val$children, Long.valueOf(val$writeId));
	//   13   31:aload_0         
	//   14   32:getfield        #27  <Field SyncTree this$0>
	//   15   35:invokestatic    #63  <Method WriteTree SyncTree.access$300(SyncTree)>
	//   16   38:aload_0         
	//   17   39:getfield        #31  <Field Path val$path>
	//   18   42:aload_0         
	//   19   43:getfield        #37  <Field CompoundWrite val$children>
	//   20   46:aload_0         
	//   21   47:getfield        #35  <Field long val$writeId>
	//   22   50:invokestatic    #69  <Method Long Long.valueOf(long)>
	//   23   53:invokevirtual   #75  <Method void WriteTree.addMerge(Path, CompoundWrite, Long)>
		return SyncTree.access$400(SyncTree.this, ((com.firebase.client.core.operation.Operation) (new Merge(OperationSource.USER, val$path, val$children))));
	//   24   56:aload_0         
	//   25   57:getfield        #27  <Field SyncTree this$0>
	//   26   60:new             #77  <Class Merge>
	//   27   63:dup             
	//   28   64:getstatic       #83  <Field OperationSource OperationSource.USER>
	//   29   67:aload_0         
	//   30   68:getfield        #31  <Field Path val$path>
	//   31   71:aload_0         
	//   32   72:getfield        #37  <Field CompoundWrite val$children>
	//   33   75:invokespecial   #86  <Method void Merge(OperationSource, Path, CompoundWrite)>
	//   34   78:invokestatic    #90  <Method List SyncTree.access$400(SyncTree, com.firebase.client.core.operation.Operation)>
	//   35   81:areturn         
	}

	final SyncTree this$0;
	final CompoundWrite val$children;
	final Path val$path;
	final boolean val$persist;
	final CompoundWrite val$unresolvedChildren;
	final long val$writeId;

	SyncTree$2()
	{
		this$0 = final_synctree;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field SyncTree this$0>
		val$persist = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #29  <Field boolean val$persist>
		val$path = path1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #31  <Field Path val$path>
		val$unresolvedChildren = compoundwrite;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #33  <Field CompoundWrite val$unresolvedChildren>
		val$writeId = l;
	//   12   21:aload_0         
	//   13   22:lload           5
	//   14   24:putfield        #35  <Field long val$writeId>
		val$children = CompoundWrite.this;
	//   15   27:aload_0         
	//   16   28:aload           7
	//   17   30:putfield        #37  <Field CompoundWrite val$children>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #40  <Method void Object()>
	//   20   37:return          
	}
}
