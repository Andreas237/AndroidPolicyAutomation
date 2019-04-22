// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.collection;

import java.util.Comparator;

// Referenced classes of package com.firebase.client.collection:
//			LLRBNode, LLRBRedValueNode

public class LLRBEmptyNode
	implements LLRBNode
{

	private LLRBEmptyNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static LLRBEmptyNode getInstance()
	{
		return INSTANCE;
	//    0    0:getstatic       #16  <Field LLRBEmptyNode INSTANCE>
	//    1    3:areturn         
	}

	public LLRBNode copy(Object obj, Object obj1, LLRBNode.Color color, LLRBNode llrbnode, LLRBNode llrbnode1)
	{
		return ((LLRBNode) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public int count()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object getKey()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public LLRBNode getLeft()
	{
		return ((LLRBNode) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public LLRBNode getMax()
	{
		return ((LLRBNode) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public LLRBNode getMin()
	{
		return ((LLRBNode) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public LLRBNode getRight()
	{
		return ((LLRBNode) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public Object getValue()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void inOrderTraversal(LLRBNode.NodeVisitor nodevisitor)
	{
	//    0    0:return          
	}

	public LLRBNode insert(Object obj, Object obj1, Comparator comparator)
	{
		return ((LLRBNode) (new LLRBRedValueNode(obj, obj1)));
	//    0    0:new             #45  <Class LLRBRedValueNode>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #48  <Method void LLRBRedValueNode(Object, Object)>
	//    5    9:areturn         
	}

	public boolean isEmpty()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isRed()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public LLRBNode remove(Object obj, Comparator comparator)
	{
		return ((LLRBNode) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean shortCircuitingInOrderTraversal(LLRBNode.ShortCircuitingNodeVisitor shortcircuitingnodevisitor)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean shortCircuitingReverseOrderTraversal(LLRBNode.ShortCircuitingNodeVisitor shortcircuitingnodevisitor)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final LLRBEmptyNode INSTANCE = new LLRBEmptyNode();

	static 
	{
	//    0    0:new             #2   <Class LLRBEmptyNode>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void LLRBEmptyNode()>
	//    3    7:putstatic       #16  <Field LLRBEmptyNode INSTANCE>
	//*   4   10:return          
	}
}
