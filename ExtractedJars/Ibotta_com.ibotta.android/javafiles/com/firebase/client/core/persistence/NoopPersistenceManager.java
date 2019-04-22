// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.persistence;

import com.firebase.client.core.CompoundWrite;
import com.firebase.client.core.Path;
import com.firebase.client.core.view.CacheNode;
import com.firebase.client.core.view.QuerySpec;
import com.firebase.client.snapshot.*;
import com.firebase.client.utilities.Utilities;
import java.util.*;
import java.util.concurrent.Callable;

// Referenced classes of package com.firebase.client.core.persistence:
//			PersistenceManager

public class NoopPersistenceManager
	implements PersistenceManager
{

	public NoopPersistenceManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		insideTransaction = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #14  <Field boolean insideTransaction>
	//    5    9:return          
	}

	private void verifyInsideTransaction()
	{
		Utilities.hardAssert(insideTransaction, "Transaction expected to already be in progress.");
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field boolean insideTransaction>
	//    2    4:ldc1            #18  <String "Transaction expected to already be in progress.">
	//    3    6:invokestatic    #24  <Method void Utilities.hardAssert(boolean, String)>
	//    4    9:return          
	}

	public void applyUserWriteToServerCache(Path path, CompoundWrite compoundwrite)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void verifyInsideTransaction()>
	//    2    4:return          
	}

	public void applyUserWriteToServerCache(Path path, Node node)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void verifyInsideTransaction()>
	//    2    4:return          
	}

	public List loadUserWrites()
	{
		return Collections.emptyList();
	//    0    0:invokestatic    #36  <Method List Collections.emptyList()>
	//    1    3:areturn         
	}

	public void removeAllUserWrites()
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void verifyInsideTransaction()>
	//    2    4:return          
	}

	public void removeUserWrite(long l)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void verifyInsideTransaction()>
	//    2    4:return          
	}

	public Object runInTransaction(Callable callable)
	{
		Utilities.hardAssert(insideTransaction ^ true, "runInTransaction called when an existing transaction is already in progress.");
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field boolean insideTransaction>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ldc1            #47  <String "runInTransaction called when an existing transaction is already in progress.">
	//    5    8:invokestatic    #24  <Method void Utilities.hardAssert(boolean, String)>
		insideTransaction = true;
	//    6   11:aload_0         
	//    7   12:iconst_1        
	//    8   13:putfield        #14  <Field boolean insideTransaction>
		callable = ((Callable) (callable.call()));
	//    9   16:aload_1         
	//   10   17:invokeinterface #53  <Method Object Callable.call()>
	//   11   22:astore_1        
		insideTransaction = false;
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:putfield        #14  <Field boolean insideTransaction>
		return ((Object) (callable));
	//   15   28:aload_1         
	//   16   29:areturn         
		callable;
	//   17   30:astore_1        
		break MISSING_BLOCK_LABEL_44;
	//   18   31:goto            44
		callable;
	//   19   34:astore_1        
		throw new RuntimeException(((Throwable) (callable)));
	//   20   35:new             #55  <Class RuntimeException>
	//   21   38:dup             
	//   22   39:aload_1         
	//   23   40:invokespecial   #58  <Method void RuntimeException(Throwable)>
	//   24   43:athrow          
		insideTransaction = false;
	//   25   44:aload_0         
	//   26   45:iconst_0        
	//   27   46:putfield        #14  <Field boolean insideTransaction>
		throw callable;
	//   28   49:aload_1         
	//   29   50:athrow          
	}

	public void saveUserMerge(Path path, CompoundWrite compoundwrite, long l)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void verifyInsideTransaction()>
	//    2    4:return          
	}

	public void saveUserOverwrite(Path path, Node node, long l)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void verifyInsideTransaction()>
	//    2    4:return          
	}

	public CacheNode serverCache(QuerySpec queryspec)
	{
		return new CacheNode(IndexedNode.from(((Node) (EmptyNode.Empty())), queryspec.getIndex()), false, false);
	//    0    0:new             #67  <Class CacheNode>
	//    1    3:dup             
	//    2    4:invokestatic    #73  <Method EmptyNode EmptyNode.Empty()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #79  <Method com.firebase.client.snapshot.Index QuerySpec.getIndex()>
	//    5   11:invokestatic    #85  <Method IndexedNode IndexedNode.from(Node, com.firebase.client.snapshot.Index)>
	//    6   14:iconst_0        
	//    7   15:iconst_0        
	//    8   16:invokespecial   #88  <Method void CacheNode(IndexedNode, boolean, boolean)>
	//    9   19:areturn         
	}

	public void setQueryActive(QuerySpec queryspec)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void verifyInsideTransaction()>
	//    2    4:return          
	}

	public void setQueryComplete(QuerySpec queryspec)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void verifyInsideTransaction()>
	//    2    4:return          
	}

	public void setQueryInactive(QuerySpec queryspec)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void verifyInsideTransaction()>
	//    2    4:return          
	}

	public void setTrackedQueryKeys(QuerySpec queryspec, Set set)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void verifyInsideTransaction()>
	//    2    4:return          
	}

	public void updateServerCache(Path path, CompoundWrite compoundwrite)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void verifyInsideTransaction()>
	//    2    4:return          
	}

	public void updateServerCache(QuerySpec queryspec, Node node)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void verifyInsideTransaction()>
	//    2    4:return          
	}

	public void updateTrackedQueryKeys(QuerySpec queryspec, Set set, Set set1)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void verifyInsideTransaction()>
	//    2    4:return          
	}

	private boolean insideTransaction;
}
