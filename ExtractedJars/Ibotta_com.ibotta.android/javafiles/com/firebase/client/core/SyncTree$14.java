// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.operation.Operation;
import com.firebase.client.core.utilities.ImmutableTree;
import com.firebase.client.snapshot.ChildKey;
import com.firebase.client.snapshot.Node;
import java.util.List;

// Referenced classes of package com.firebase.client.core:
//			SyncTree, WriteTreeRef

class SyncTree$14 extends com.firebase.client.collection.eVisitor
{

	public void visitEntry(ChildKey childkey, ImmutableTree immutabletree)
	{
		Node node = val$resolvedServerCache;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Node val$resolvedServerCache>
	//    2    4:astore_3        
		if(node != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          20
			node = node.getImmediateChild(childkey);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:invokeinterface #44  <Method Node Node.getImmediateChild(ChildKey)>
	//    8   16:astore_3        
		else
	//*   9   17:goto            22
			node = null;
	//   10   20:aconst_null     
	//   11   21:astore_3        
		WriteTreeRef writetreeref = val$writesCache.child(childkey);
	//   12   22:aload_0         
	//   13   23:getfield        #28  <Field WriteTreeRef val$writesCache>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #50  <Method WriteTreeRef WriteTreeRef.child(ChildKey)>
	//   16   30:astore          4
		childkey = ((ChildKey) (val$operation.operationForChild(childkey)));
	//   17   32:aload_0         
	//   18   33:getfield        #30  <Field Operation val$operation>
	//   19   36:aload_1         
	//   20   37:invokevirtual   #56  <Method Operation Operation.operationForChild(ChildKey)>
	//   21   40:astore_1        
		if(childkey != null)
	//*  22   41:aload_1         
	//*  23   42:ifnull          67
			val$events.addAll(((java.util.Collection) (SyncTree.access$1700(SyncTree.this, ((Operation) (childkey)), immutabletree, node, writetreeref))));
	//   24   45:aload_0         
	//   25   46:getfield        #32  <Field List val$events>
	//   26   49:aload_0         
	//   27   50:getfield        #24  <Field SyncTree this$0>
	//   28   53:aload_1         
	//   29   54:aload_2         
	//   30   55:aload_3         
	//   31   56:aload           4
	//   32   58:invokestatic    #60  <Method List SyncTree.access$1700(SyncTree, Operation, ImmutableTree, Node, WriteTreeRef)>
	//   33   61:invokeinterface #66  <Method boolean List.addAll(java.util.Collection)>
	//   34   66:pop             
	//   35   67:return          
	}

	public volatile void visitEntry(Object obj, Object obj1)
	{
		visitEntry((ChildKey)obj, (ImmutableTree)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #71  <Class ChildKey>
	//    3    5:aload_2         
	//    4    6:checkcast       #73  <Class ImmutableTree>
	//    5    9:invokevirtual   #75  <Method void visitEntry(ChildKey, ImmutableTree)>
	//    6   12:return          
	}

	final SyncTree this$0;
	final List val$events;
	final Operation val$operation;
	final Node val$resolvedServerCache;
	final WriteTreeRef val$writesCache;

	SyncTree$14()
	{
		this$0 = final_synctree;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field SyncTree this$0>
		val$resolvedServerCache = node;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field Node val$resolvedServerCache>
		val$writesCache = writetreeref;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field WriteTreeRef val$writesCache>
		val$operation = operation1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field Operation val$operation>
		val$events = List.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #32  <Field List val$events>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #35  <Method void com.firebase.client.collection.LLRBNode$NodeVisitor()>
	//   17   31:return          
	}
}
