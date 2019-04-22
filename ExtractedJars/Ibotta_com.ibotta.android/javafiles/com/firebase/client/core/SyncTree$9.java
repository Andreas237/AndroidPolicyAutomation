// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.operation.OperationSource;
import com.firebase.client.core.operation.Overwrite;
import com.firebase.client.core.persistence.PersistenceManager;
import com.firebase.client.core.view.QuerySpec;
import com.firebase.client.snapshot.Node;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.firebase.client.core:
//			SyncTree, Path, Tag

class SyncTree$9
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
	//    5   11:astore_2        
		if(queryspec != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          95
		{
			Path path1 = Path.getRelative(queryspec.getPath(), val$path);
	//    8   16:aload_2         
	//    9   17:invokevirtual   #52  <Method Path QuerySpec.getPath()>
	//   10   20:aload_0         
	//   11   21:getfield        #28  <Field Path val$path>
	//   12   24:invokestatic    #58  <Method Path Path.getRelative(Path, Path)>
	//   13   27:astore_3        
			Object obj;
			if(path1.isEmpty())
	//*  14   28:aload_3         
	//*  15   29:invokevirtual   #62  <Method boolean Path.isEmpty()>
	//*  16   32:ifeq            40
				obj = ((Object) (queryspec));
	//   17   35:aload_2         
	//   18   36:astore_1        
			else
	//*  19   37:goto            48
				obj = ((Object) (QuerySpec.defaultQueryAtPath(val$path)));
	//   20   40:aload_0         
	//   21   41:getfield        #28  <Field Path val$path>
	//   22   44:invokestatic    #66  <Method QuerySpec QuerySpec.defaultQueryAtPath(Path)>
	//   23   47:astore_1        
			SyncTree.access$200(SyncTree.this).updateServerCache(((QuerySpec) (obj)), val$snap);
	//   24   48:aload_0         
	//   25   49:getfield        #24  <Field SyncTree this$0>
	//   26   52:invokestatic    #70  <Method PersistenceManager SyncTree.access$200(SyncTree)>
	//   27   55:aload_1         
	//   28   56:aload_0         
	//   29   57:getfield        #30  <Field Node val$snap>
	//   30   60:invokeinterface #76  <Method void PersistenceManager.updateServerCache(QuerySpec, Node)>
			obj = ((Object) (new Overwrite(OperationSource.forServerTaggedQuery(queryspec.getParams()), path1, val$snap)));
	//   31   65:new             #78  <Class Overwrite>
	//   32   68:dup             
	//   33   69:aload_2         
	//   34   70:invokevirtual   #82  <Method com.firebase.client.core.view.QueryParams QuerySpec.getParams()>
	//   35   73:invokestatic    #88  <Method OperationSource OperationSource.forServerTaggedQuery(com.firebase.client.core.view.QueryParams)>
	//   36   76:aload_3         
	//   37   77:aload_0         
	//   38   78:getfield        #30  <Field Node val$snap>
	//   39   81:invokespecial   #91  <Method void Overwrite(OperationSource, Path, Node)>
	//   40   84:astore_1        
			return SyncTree.access$600(SyncTree.this, queryspec, ((com.firebase.client.core.operation.Operation) (obj)));
	//   41   85:aload_0         
	//   42   86:getfield        #24  <Field SyncTree this$0>
	//   43   89:aload_2         
	//   44   90:aload_1         
	//   45   91:invokestatic    #95  <Method List SyncTree.access$600(SyncTree, QuerySpec, com.firebase.client.core.operation.Operation)>
	//   46   94:areturn         
		} else
		{
			return Collections.emptyList();
	//   47   95:invokestatic    #100 <Method List Collections.emptyList()>
	//   48   98:areturn         
		}
	}

	final SyncTree this$0;
	final Path val$path;
	final Node val$snap;
	final Tag val$tag;

	SyncTree$9()
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
		val$snap = Node.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field Node val$snap>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #33  <Method void Object()>
	//   14   25:return          
	}
}
