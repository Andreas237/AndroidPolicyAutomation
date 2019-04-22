// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.snapshot.EmptyNode;
import com.firebase.client.snapshot.Node;

// Referenced classes of package com.firebase.client.core:
//			Path

public class SnapshotHolder
{

	SnapshotHolder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
		rootNode = ((Node) (EmptyNode.Empty()));
	//    2    4:aload_0         
	//    3    5:invokestatic    #16  <Method EmptyNode EmptyNode.Empty()>
	//    4    8:putfield        #18  <Field Node rootNode>
	//    5   11:return          
	}

	public SnapshotHolder(Node node)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
		rootNode = node;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Node rootNode>
	//    5    9:return          
	}

	public Node getNode(Path path)
	{
		return rootNode.getChild(path);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Node rootNode>
	//    2    4:aload_1         
	//    3    5:invokeinterface #27  <Method Node Node.getChild(Path)>
	//    4   10:areturn         
	}

	public Node getRootNode()
	{
		return rootNode;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Node rootNode>
	//    2    4:areturn         
	}

	public void update(Path path, Node node)
	{
		rootNode = rootNode.updateChild(path, node);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field Node rootNode>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokeinterface #35  <Method Node Node.updateChild(Path, Node)>
	//    6   12:putfield        #18  <Field Node rootNode>
	//    7   15:return          
	}

	private Node rootNode;
}
