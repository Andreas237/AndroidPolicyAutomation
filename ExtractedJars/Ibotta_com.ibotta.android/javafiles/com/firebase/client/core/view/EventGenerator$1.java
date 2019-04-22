// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view;

import com.firebase.client.snapshot.*;
import java.util.Comparator;

// Referenced classes of package com.firebase.client.core.view:
//			EventGenerator, Change

class EventGenerator$1
	implements Comparator
{

	public int compare(Change change, Change change1)
	{
		change = ((Change) (new NamedNode(change.getChildKey(), change.getIndexedNode().getNode())));
	//    0    0:new             #30  <Class NamedNode>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #36  <Method com.firebase.client.snapshot.ChildKey Change.getChildKey()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #40  <Method IndexedNode Change.getIndexedNode()>
	//    6   12:invokevirtual   #46  <Method com.firebase.client.snapshot.Node IndexedNode.getNode()>
	//    7   15:invokespecial   #49  <Method void NamedNode(com.firebase.client.snapshot.ChildKey, com.firebase.client.snapshot.Node)>
	//    8   18:astore_1        
		change1 = ((Change) (new NamedNode(change1.getChildKey(), change1.getIndexedNode().getNode())));
	//    9   19:new             #30  <Class NamedNode>
	//   10   22:dup             
	//   11   23:aload_2         
	//   12   24:invokevirtual   #36  <Method com.firebase.client.snapshot.ChildKey Change.getChildKey()>
	//   13   27:aload_2         
	//   14   28:invokevirtual   #40  <Method IndexedNode Change.getIndexedNode()>
	//   15   31:invokevirtual   #46  <Method com.firebase.client.snapshot.Node IndexedNode.getNode()>
	//   16   34:invokespecial   #49  <Method void NamedNode(com.firebase.client.snapshot.ChildKey, com.firebase.client.snapshot.Node)>
	//   17   37:astore_2        
		return EventGenerator.access$000(EventGenerator.this).compare(((Object) (change)), ((Object) (change1)));
	//   18   38:aload_0         
	//   19   39:getfield        #24  <Field EventGenerator this$0>
	//   20   42:invokestatic    #53  <Method Index EventGenerator.access$000(EventGenerator)>
	//   21   45:aload_1         
	//   22   46:aload_2         
	//   23   47:invokevirtual   #58  <Method int Index.compare(Object, Object)>
	//   24   50:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((Change)obj, (Change)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #32  <Class Change>
	//    3    5:aload_2         
	//    4    6:checkcast       #32  <Class Change>
	//    5    9:invokevirtual   #60  <Method int compare(Change, Change)>
	//    6   12:ireturn         
	}

	static final boolean $assertionsDisabled = false;
	final EventGenerator this$0;

	static 
	{
	//    0    0:return          
	}

	EventGenerator$1()
	{
		this$0 = EventGenerator.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field EventGenerator this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #26  <Method void Object()>
	//    5    9:return          
	}
}
