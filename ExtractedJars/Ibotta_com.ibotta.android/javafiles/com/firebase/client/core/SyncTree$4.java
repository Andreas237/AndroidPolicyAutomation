// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.operation.AckUserWrite;
import com.firebase.client.core.persistence.PersistenceManager;
import com.firebase.client.core.utilities.ImmutableTree;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.firebase.client.core:
//			SyncTree, WriteTree, Path

class SyncTree$4
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method List call()>
	//    2    4:areturn         
	}

	public List call()
		throws Exception
	{
		SyncTree.access$200(SyncTree.this).removeAllUserWrites();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field SyncTree this$0>
	//    2    4:invokestatic    #33  <Method PersistenceManager SyncTree.access$200(SyncTree)>
	//    3    7:invokeinterface #38  <Method void PersistenceManager.removeAllUserWrites()>
		if(SyncTree.access$300(SyncTree.this).purgeAllWrites().isEmpty())
	//*   4   12:aload_0         
	//*   5   13:getfield        #18  <Field SyncTree this$0>
	//*   6   16:invokestatic    #42  <Method WriteTree SyncTree.access$300(SyncTree)>
	//*   7   19:invokevirtual   #47  <Method List WriteTree.purgeAllWrites()>
	//*   8   22:invokeinterface #53  <Method boolean List.isEmpty()>
	//*   9   27:ifeq            34
		{
			return Collections.emptyList();
	//   10   30:invokestatic    #58  <Method List Collections.emptyList()>
	//   11   33:areturn         
		} else
		{
			ImmutableTree immutabletree = new ImmutableTree(((Object) (Boolean.valueOf(true))));
	//   12   34:new             #60  <Class ImmutableTree>
	//   13   37:dup             
	//   14   38:iconst_1        
	//   15   39:invokestatic    #66  <Method Boolean Boolean.valueOf(boolean)>
	//   16   42:invokespecial   #69  <Method void ImmutableTree(Object)>
	//   17   45:astore_1        
			return SyncTree.access$400(SyncTree.this, ((com.firebase.client.core.operation.Operation) (new AckUserWrite(Path.getEmptyPath(), immutabletree, true))));
	//   18   46:aload_0         
	//   19   47:getfield        #18  <Field SyncTree this$0>
	//   20   50:new             #71  <Class AckUserWrite>
	//   21   53:dup             
	//   22   54:invokestatic    #77  <Method Path Path.getEmptyPath()>
	//   23   57:aload_1         
	//   24   58:iconst_1        
	//   25   59:invokespecial   #80  <Method void AckUserWrite(Path, ImmutableTree, boolean)>
	//   26   62:invokestatic    #84  <Method List SyncTree.access$400(SyncTree, com.firebase.client.core.operation.Operation)>
	//   27   65:areturn         
		}
	}

	final SyncTree this$0;

	SyncTree$4()
	{
		this$0 = SyncTree.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field SyncTree this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
