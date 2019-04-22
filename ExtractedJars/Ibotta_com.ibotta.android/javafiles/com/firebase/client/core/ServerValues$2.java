// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.snapshot.ChildKey;
import com.firebase.client.snapshot.Node;
import java.util.Map;

// Referenced classes of package com.firebase.client.core:
//			ServerValues, Path, SnapshotHolder

static final class ServerValues$2 extends com.firebase.client.snapshot.ildVisitor
{

	public void visitChild(ChildKey childkey, Node node)
	{
		Node node1 = ServerValues.resolveDeferredValueSnapshot(node, val$serverValues);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #17  <Field Map val$serverValues>
	//    3    5:invokestatic    #26  <Method Node ServerValues.resolveDeferredValueSnapshot(Node, Map)>
	//    4    8:astore_3        
		if(node1 != node)
	//*   5    9:aload_3         
	//*   6   10:aload_2         
	//*   7   11:if_acmpeq       33
			val$holder.update(new Path(childkey.asString()), node1);
	//    8   14:aload_0         
	//    9   15:getfield        #19  <Field SnapshotHolder val$holder>
	//   10   18:new             #28  <Class Path>
	//   11   21:dup             
	//   12   22:aload_1         
	//   13   23:invokevirtual   #34  <Method String ChildKey.asString()>
	//   14   26:invokespecial   #37  <Method void Path(String)>
	//   15   29:aload_3         
	//   16   30:invokevirtual   #43  <Method void SnapshotHolder.update(Path, Node)>
	//   17   33:return          
	}

	final SnapshotHolder val$holder;
	final Map val$serverValues;

	ServerValues$2(Map map, SnapshotHolder snapshotholder)
	{
		val$serverValues = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Map val$serverValues>
		val$holder = snapshotholder;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field SnapshotHolder val$holder>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void com.firebase.client.snapshot.ChildrenNode$ChildVisitor()>
	//    8   14:return          
	}
}
