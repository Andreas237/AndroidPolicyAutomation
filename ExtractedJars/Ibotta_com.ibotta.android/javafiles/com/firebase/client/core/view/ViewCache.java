// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view;

import com.firebase.client.snapshot.IndexedNode;
import com.firebase.client.snapshot.Node;

// Referenced classes of package com.firebase.client.core.view:
//			CacheNode

public class ViewCache
{

	public ViewCache(CacheNode cachenode, CacheNode cachenode1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		eventSnap = cachenode;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field CacheNode eventSnap>
		serverSnap = cachenode1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #16  <Field CacheNode serverSnap>
	//    8   14:return          
	}

	public Node getCompleteEventSnap()
	{
		if(eventSnap.isFullyInitialized())
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field CacheNode eventSnap>
	//*   2    4:invokevirtual   #25  <Method boolean CacheNode.isFullyInitialized()>
	//*   3    7:ifeq            18
			return eventSnap.getNode();
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field CacheNode eventSnap>
	//    6   14:invokevirtual   #28  <Method Node CacheNode.getNode()>
	//    7   17:areturn         
		else
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
	}

	public Node getCompleteServerSnap()
	{
		if(serverSnap.isFullyInitialized())
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field CacheNode serverSnap>
	//*   2    4:invokevirtual   #25  <Method boolean CacheNode.isFullyInitialized()>
	//*   3    7:ifeq            18
			return serverSnap.getNode();
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field CacheNode serverSnap>
	//    6   14:invokevirtual   #28  <Method Node CacheNode.getNode()>
	//    7   17:areturn         
		else
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
	}

	public CacheNode getEventCache()
	{
		return eventSnap;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field CacheNode eventSnap>
	//    2    4:areturn         
	}

	public CacheNode getServerCache()
	{
		return serverSnap;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CacheNode serverSnap>
	//    2    4:areturn         
	}

	public ViewCache updateEventSnap(IndexedNode indexednode, boolean flag, boolean flag1)
	{
		return new ViewCache(new CacheNode(indexednode, flag, flag1), serverSnap);
	//    0    0:new             #2   <Class ViewCache>
	//    1    3:dup             
	//    2    4:new             #21  <Class CacheNode>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokespecial   #37  <Method void CacheNode(IndexedNode, boolean, boolean)>
	//    8   14:aload_0         
	//    9   15:getfield        #16  <Field CacheNode serverSnap>
	//   10   18:invokespecial   #39  <Method void ViewCache(CacheNode, CacheNode)>
	//   11   21:areturn         
	}

	public ViewCache updateServerSnap(IndexedNode indexednode, boolean flag, boolean flag1)
	{
		return new ViewCache(eventSnap, new CacheNode(indexednode, flag, flag1));
	//    0    0:new             #2   <Class ViewCache>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field CacheNode eventSnap>
	//    4    8:new             #21  <Class CacheNode>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:iload_3         
	//    9   15:invokespecial   #37  <Method void CacheNode(IndexedNode, boolean, boolean)>
	//   10   18:invokespecial   #39  <Method void ViewCache(CacheNode, CacheNode)>
	//   11   21:areturn         
	}

	private final CacheNode eventSnap;
	private final CacheNode serverSnap;
}
