// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;

import com.firebase.client.FirebaseException;

// Referenced classes of package com.firebase.client.snapshot:
//			EmptyNode, Node, DoubleNode, StringNode, 
//			DeferredValueNode, NodeUtilities, LongNode

public class PriorityUtilities
{

	public PriorityUtilities()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Node NullPriority()
	{
		return ((Node) (EmptyNode.Empty()));
	//    0    0:invokestatic    #17  <Method EmptyNode EmptyNode.Empty()>
	//    1    3:areturn         
	}

	public static boolean isValidPriority(Node node)
	{
		return node.getPriority().isEmpty() && (node.isEmpty() || (node instanceof DoubleNode) || (node instanceof StringNode) || (node instanceof DeferredValueNode));
	//    0    0:aload_0         
	//    1    1:invokeinterface #24  <Method Node Node.getPriority()>
	//    2    6:invokeinterface #28  <Method boolean Node.isEmpty()>
	//    3   11:ifeq            46
	//    4   14:aload_0         
	//    5   15:invokeinterface #28  <Method boolean Node.isEmpty()>
	//    6   20:ifne            44
	//    7   23:aload_0         
	//    8   24:instanceof      #30  <Class DoubleNode>
	//    9   27:ifne            44
	//   10   30:aload_0         
	//   11   31:instanceof      #32  <Class StringNode>
	//   12   34:ifne            44
	//   13   37:aload_0         
	//   14   38:instanceof      #34  <Class DeferredValueNode>
	//   15   41:ifeq            46
	//   16   44:iconst_1        
	//   17   45:ireturn         
	//   18   46:iconst_0        
	//   19   47:ireturn         
	}

	public static Node parsePriority(Object obj)
	{
		Node node = NodeUtilities.NodeFromJSON(obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #41  <Method Node NodeUtilities.NodeFromJSON(Object)>
	//    2    4:astore_1        
		obj = ((Object) (node));
	//    3    5:aload_1         
	//    4    6:astore_0        
		if(node instanceof LongNode)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #43  <Class LongNode>
	//*   7   11:ifeq            41
			obj = ((Object) (new DoubleNode(Double.valueOf(((Long)node.getValue()).longValue()), NullPriority())));
	//    8   14:new             #30  <Class DoubleNode>
	//    9   17:dup             
	//   10   18:aload_1         
	//   11   19:invokeinterface #47  <Method Object Node.getValue()>
	//   12   24:checkcast       #49  <Class Long>
	//   13   27:invokevirtual   #53  <Method long Long.longValue()>
	//   14   30:l2d             
	//   15   31:invokestatic    #59  <Method Double Double.valueOf(double)>
	//   16   34:invokestatic    #61  <Method Node NullPriority()>
	//   17   37:invokespecial   #64  <Method void DoubleNode(Double, Node)>
	//   18   40:astore_0        
		if(isValidPriority(((Node) (obj))))
	//*  19   41:aload_0         
	//*  20   42:invokestatic    #66  <Method boolean isValidPriority(Node)>
	//*  21   45:ifeq            50
			return ((Node) (obj));
	//   22   48:aload_0         
	//   23   49:areturn         
		else
			throw new FirebaseException("Invalid Firebase priority (must be a string, double, ServerValue, or null)");
	//   24   50:new             #68  <Class FirebaseException>
	//   25   53:dup             
	//   26   54:ldc1            #70  <String "Invalid Firebase priority (must be a string, double, ServerValue, or null)">
	//   27   56:invokespecial   #73  <Method void FirebaseException(String)>
	//   28   59:athrow          
	}
}
