// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view;

import com.firebase.client.core.WriteTreeRef;
import com.firebase.client.snapshot.*;

// Referenced classes of package com.firebase.client.core.view:
//			ViewProcessor, ViewCache, CacheNode

private static class ViewProcessor$WriteTreeCompleteChildSource
	implements com.firebase.client.core.view.filter.NodeFilter.CompleteChildSource
{

	public NamedNode getChildAfterChild(Index index, NamedNode namednode, boolean flag)
	{
		Node node = optCompleteServerCache;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Node optCompleteServerCache>
	//    2    4:astore          4
		if(node == null)
	//*   3    6:aload           4
	//*   4    8:ifnull          14
	//*   5   11:goto            23
			node = viewCache.getCompleteServerSnap();
	//    6   14:aload_0         
	//    7   15:getfield        #24  <Field ViewCache viewCache>
	//    8   18:invokevirtual   #35  <Method Node ViewCache.getCompleteServerSnap()>
	//    9   21:astore          4
		return writes.calcNextNodeAfterPost(node, namednode, flag, index);
	//   10   23:aload_0         
	//   11   24:getfield        #22  <Field WriteTreeRef writes>
	//   12   27:aload           4
	//   13   29:aload_2         
	//   14   30:iload_3         
	//   15   31:aload_1         
	//   16   32:invokevirtual   #41  <Method NamedNode WriteTreeRef.calcNextNodeAfterPost(Node, NamedNode, boolean, Index)>
	//   17   35:areturn         
	}

	public Node getCompleteChild(ChildKey childkey)
	{
		Object obj = ((Object) (viewCache.getEventCache()));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ViewCache viewCache>
	//    2    4:invokevirtual   #47  <Method CacheNode ViewCache.getEventCache()>
	//    3    7:astore_2        
		if(((CacheNode) (obj)).isCompleteForChild(childkey))
	//*   4    8:aload_2         
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #53  <Method boolean CacheNode.isCompleteForChild(ChildKey)>
	//*   7   13:ifeq            27
			return ((CacheNode) (obj)).getNode().getImmediateChild(childkey);
	//    8   16:aload_2         
	//    9   17:invokevirtual   #56  <Method Node CacheNode.getNode()>
	//   10   20:aload_1         
	//   11   21:invokeinterface #61  <Method Node Node.getImmediateChild(ChildKey)>
	//   12   26:areturn         
		obj = ((Object) (optCompleteServerCache));
	//   13   27:aload_0         
	//   14   28:getfield        #26  <Field Node optCompleteServerCache>
	//   15   31:astore_2        
		if(obj != null)
	//*  16   32:aload_2         
	//*  17   33:ifnull          56
			obj = ((Object) (new CacheNode(IndexedNode.from(((Node) (obj)), ((Index) (KeyIndex.getInstance()))), true, false)));
	//   18   36:new             #49  <Class CacheNode>
	//   19   39:dup             
	//   20   40:aload_2         
	//   21   41:invokestatic    #67  <Method KeyIndex KeyIndex.getInstance()>
	//   22   44:invokestatic    #73  <Method IndexedNode IndexedNode.from(Node, Index)>
	//   23   47:iconst_1        
	//   24   48:iconst_0        
	//   25   49:invokespecial   #76  <Method void CacheNode(IndexedNode, boolean, boolean)>
	//   26   52:astore_2        
		else
	//*  27   53:goto            64
			obj = ((Object) (viewCache.getServerCache()));
	//   28   56:aload_0         
	//   29   57:getfield        #24  <Field ViewCache viewCache>
	//   30   60:invokevirtual   #79  <Method CacheNode ViewCache.getServerCache()>
	//   31   63:astore_2        
		return writes.calcCompleteChild(childkey, ((CacheNode) (obj)));
	//   32   64:aload_0         
	//   33   65:getfield        #22  <Field WriteTreeRef writes>
	//   34   68:aload_1         
	//   35   69:aload_2         
	//   36   70:invokevirtual   #83  <Method Node WriteTreeRef.calcCompleteChild(ChildKey, CacheNode)>
	//   37   73:areturn         
	}

	private final Node optCompleteServerCache;
	private final ViewCache viewCache;
	private final WriteTreeRef writes;

	public ViewProcessor$WriteTreeCompleteChildSource(WriteTreeRef writetreeref, ViewCache viewcache, Node node)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		writes = writetreeref;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field WriteTreeRef writes>
		viewCache = viewcache;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field ViewCache viewCache>
		optCompleteServerCache = node;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field Node optCompleteServerCache>
	//   11   19:return          
	}
}
