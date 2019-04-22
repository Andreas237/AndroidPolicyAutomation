// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;

import com.firebase.client.core.Path;
import java.util.*;

// Referenced classes of package com.firebase.client.snapshot:
//			ChildrenNode, Node, ChildKey

public class EmptyNode extends ChildrenNode
	implements Node
{

	private EmptyNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void ChildrenNode()>
	//    2    4:return          
	}

	public static EmptyNode Empty()
	{
		return empty;
	//    0    0:getstatic       #15  <Field EmptyNode empty>
	//    1    3:areturn         
	}

	public int compareTo(Node node)
	{
		return !node.isEmpty() ? -1 : 0;
	//    0    0:aload_1         
	//    1    1:invokeinterface #25  <Method boolean Node.isEmpty()>
	//    2    6:ifeq            11
	//    3    9:iconst_0        
	//    4   10:ireturn         
	//    5   11:iconst_m1       
	//    6   12:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((Node)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #6   <Class Node>
	//    3    5:invokevirtual   #28  <Method int compareTo(Node)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof EmptyNode)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class EmptyNode>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(obj instanceof Node)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #6   <Class Node>
	//*   7   13:ifeq            48
		{
			obj = ((Object) ((Node)obj));
	//    8   16:aload_1         
	//    9   17:checkcast       #6   <Class Node>
	//   10   20:astore_1        
			if(((Node) (obj)).isEmpty() && ((Object) (getPriority())).equals(((Object) (((Node) (obj)).getPriority()))))
	//*  11   21:aload_1         
	//*  12   22:invokeinterface #25  <Method boolean Node.isEmpty()>
	//*  13   27:ifeq            48
	//*  14   30:aload_0         
	//*  15   31:invokevirtual   #34  <Method Node getPriority()>
	//*  16   34:aload_1         
	//*  17   35:invokeinterface #35  <Method Node Node.getPriority()>
	//*  18   40:invokevirtual   #39  <Method boolean Object.equals(Object)>
	//*  19   43:ifeq            48
				return true;
	//   20   46:iconst_1        
	//   21   47:ireturn         
		}
		return false;
	//   22   48:iconst_0        
	//   23   49:ireturn         
	}

	public Node getChild(Path path)
	{
		return ((Node) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public int getChildCount()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getHash()
	{
		return "";
	//    0    0:ldc1            #47  <String "">
	//    1    2:areturn         
	}

	public String getHashRepresentation(Node.HashVersion hashversion)
	{
		return "";
	//    0    0:ldc1            #47  <String "">
	//    1    2:areturn         
	}

	public Node getImmediateChild(ChildKey childkey)
	{
		return ((Node) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public ChildKey getPredecessorChildKey(ChildKey childkey)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Node getPriority()
	{
		return ((Node) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public ChildKey getSuccessorChildKey(ChildKey childkey)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getValue()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getValue(boolean flag)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean hasChild(ChildKey childkey)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int hashCode()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isEmpty()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isLeafNode()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Iterator iterator()
	{
		return Collections.emptyList().iterator();
	//    0    0:invokestatic    #69  <Method List Collections.emptyList()>
	//    1    3:invokeinterface #73  <Method Iterator List.iterator()>
	//    2    8:areturn         
	}

	public Iterator reverseIterator()
	{
		return Collections.emptyList().iterator();
	//    0    0:invokestatic    #69  <Method List Collections.emptyList()>
	//    1    3:invokeinterface #73  <Method Iterator List.iterator()>
	//    2    8:areturn         
	}

	public String toString()
	{
		return "<Empty Node>";
	//    0    0:ldc1            #79  <String "<Empty Node>">
	//    1    2:areturn         
	}

	public Node updateChild(Path path, Node node)
	{
		if(path.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #84  <Method boolean Path.isEmpty()>
	//*   2    4:ifeq            9
		{
			return node;
	//    3    7:aload_2         
	//    4    8:areturn         
		} else
		{
			ChildKey childkey = path.getFront();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #88  <Method ChildKey Path.getFront()>
	//    7   13:astore_3        
			return updateImmediateChild(childkey, getImmediateChild(childkey).updateChild(path.popFront(), node));
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:aload_0         
	//   11   17:aload_3         
	//   12   18:invokevirtual   #90  <Method Node getImmediateChild(ChildKey)>
	//   13   21:aload_1         
	//   14   22:invokevirtual   #94  <Method Path Path.popFront()>
	//   15   25:aload_2         
	//   16   26:invokeinterface #96  <Method Node Node.updateChild(Path, Node)>
	//   17   31:invokevirtual   #100 <Method Node updateImmediateChild(ChildKey, Node)>
	//   18   34:areturn         
		}
	}

	public Node updateImmediateChild(ChildKey childkey, Node node)
	{
		if(node.isEmpty())
	//*   0    0:aload_2         
	//*   1    1:invokeinterface #25  <Method boolean Node.isEmpty()>
	//*   2    6:ifeq            11
			return ((Node) (this));
	//    3    9:aload_0         
	//    4   10:areturn         
		if(childkey.isPriorityChildName())
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #105 <Method boolean ChildKey.isPriorityChildName()>
	//*   7   15:ifeq            20
			return ((Node) (this));
	//    8   18:aload_0         
	//    9   19:areturn         
		else
			return (new ChildrenNode()).updateImmediateChild(childkey, node);
	//   10   20:new             #4   <Class ChildrenNode>
	//   11   23:dup             
	//   12   24:invokespecial   #17  <Method void ChildrenNode()>
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #106 <Method Node ChildrenNode.updateImmediateChild(ChildKey, Node)>
	//   16   32:areturn         
	}

	public EmptyNode updatePriority(Node node)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public volatile Node updatePriority(Node node)
	{
		return ((Node) (updatePriority(node)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #111 <Method EmptyNode updatePriority(Node)>
	//    3    5:areturn         
	}

	private static final EmptyNode empty = new EmptyNode();

	static 
	{
	//    0    0:new             #2   <Class EmptyNode>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void EmptyNode()>
	//    3    7:putstatic       #15  <Field EmptyNode empty>
	//*   4   10:return          
	}
}
