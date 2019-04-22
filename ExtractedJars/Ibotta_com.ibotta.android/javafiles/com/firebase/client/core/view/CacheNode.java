// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view;

import com.firebase.client.core.Path;
import com.firebase.client.snapshot.*;

public class CacheNode
{

	public CacheNode(IndexedNode indexednode, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		indexedNode = indexednode;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field IndexedNode indexedNode>
		fullyInitialized = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #18  <Field boolean fullyInitialized>
		filtered = flag1;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #20  <Field boolean filtered>
	//   11   19:return          
	}

	public IndexedNode getIndexedNode()
	{
		return indexedNode;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IndexedNode indexedNode>
	//    2    4:areturn         
	}

	public Node getNode()
	{
		return indexedNode.getNode();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IndexedNode indexedNode>
	//    2    4:invokevirtual   #29  <Method Node IndexedNode.getNode()>
	//    3    7:areturn         
	}

	public boolean isCompleteForChild(ChildKey childkey)
	{
		return isFullyInitialized() && !filtered || indexedNode.getNode().hasChild(childkey);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #35  <Method boolean isFullyInitialized()>
	//    2    4:ifeq            14
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field boolean filtered>
	//    5   11:ifeq            30
	//    6   14:aload_0         
	//    7   15:getfield        #16  <Field IndexedNode indexedNode>
	//    8   18:invokevirtual   #29  <Method Node IndexedNode.getNode()>
	//    9   21:aload_1         
	//   10   22:invokeinterface #40  <Method boolean Node.hasChild(ChildKey)>
	//   11   27:ifeq            32
	//   12   30:iconst_1        
	//   13   31:ireturn         
	//   14   32:iconst_0        
	//   15   33:ireturn         
	}

	public boolean isCompleteForPath(Path path)
	{
		if(path.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #47  <Method boolean Path.isEmpty()>
	//*   2    4:ifeq            25
			return isFullyInitialized() && !filtered;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #35  <Method boolean isFullyInitialized()>
	//    5   11:ifeq            23
	//    6   14:aload_0         
	//    7   15:getfield        #20  <Field boolean filtered>
	//    8   18:ifne            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
		else
			return isCompleteForChild(path.getFront());
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #51  <Method ChildKey Path.getFront()>
	//   16   30:invokevirtual   #53  <Method boolean isCompleteForChild(ChildKey)>
	//   17   33:ireturn         
	}

	public boolean isFiltered()
	{
		return filtered;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field boolean filtered>
	//    2    4:ireturn         
	}

	public boolean isFullyInitialized()
	{
		return fullyInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field boolean fullyInitialized>
	//    2    4:ireturn         
	}

	private final boolean filtered;
	private final boolean fullyInitialized;
	private final IndexedNode indexedNode;
}
