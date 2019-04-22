// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities.tuple;

import com.firebase.client.core.Path;
import com.firebase.client.snapshot.Node;

public class NodeAndPath
{

	public NodeAndPath(Node node1, Path path1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		node = node1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Node node>
		path = path1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field Path path>
	//    8   14:return          
	}

	public Node getNode()
	{
		return node;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Node node>
	//    2    4:areturn         
	}

	public Path getPath()
	{
		return path;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Path path>
	//    2    4:areturn         
	}

	public void setNode(Node node1)
	{
		node = node1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field Node node>
	//    3    5:return          
	}

	public void setPath(Path path1)
	{
		path = path1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Path path>
	//    3    5:return          
	}

	private Node node;
	private Path path;
}
