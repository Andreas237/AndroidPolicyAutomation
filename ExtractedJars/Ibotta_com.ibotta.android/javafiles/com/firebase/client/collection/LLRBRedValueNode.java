// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.collection;


// Referenced classes of package com.firebase.client.collection:
//			LLRBValueNode, LLRBEmptyNode, LLRBNode

public class LLRBRedValueNode extends LLRBValueNode
{

	LLRBRedValueNode(Object obj, Object obj1)
	{
		super(obj, obj1, ((LLRBNode) (LLRBEmptyNode.getInstance())), ((LLRBNode) (LLRBEmptyNode.getInstance())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #13  <Method LLRBEmptyNode LLRBEmptyNode.getInstance()>
	//    4    6:invokestatic    #13  <Method LLRBEmptyNode LLRBEmptyNode.getInstance()>
	//    5    9:invokespecial   #16  <Method void LLRBValueNode(Object, Object, LLRBNode, LLRBNode)>
	//    6   12:return          
	}

	LLRBRedValueNode(Object obj, Object obj1, LLRBNode llrbnode, LLRBNode llrbnode1)
	{
		super(obj, obj1, llrbnode, llrbnode1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #16  <Method void LLRBValueNode(Object, Object, LLRBNode, LLRBNode)>
	//    6    9:return          
	}

	protected LLRBValueNode copy(Object obj, Object obj1, LLRBNode llrbnode, LLRBNode llrbnode1)
	{
		Object obj2 = obj;
	//    0    0:aload_1         
	//    1    1:astore          5
		if(obj == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       13
			obj2 = getKey();
	//    4    7:aload_0         
	//    5    8:invokevirtual   #26  <Method Object getKey()>
	//    6   11:astore          5
		obj = obj1;
	//    7   13:aload_2         
	//    8   14:astore_1        
		if(obj1 == null)
	//*   9   15:aload_2         
	//*  10   16:ifnonnull       24
			obj = getValue();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #29  <Method Object getValue()>
	//   13   23:astore_1        
		obj1 = ((Object) (llrbnode));
	//   14   24:aload_3         
	//   15   25:astore_2        
		if(llrbnode == null)
	//*  16   26:aload_3         
	//*  17   27:ifnonnull       35
			obj1 = ((Object) (getLeft()));
	//   18   30:aload_0         
	//   19   31:invokevirtual   #33  <Method LLRBNode getLeft()>
	//   20   34:astore_2        
		llrbnode = llrbnode1;
	//   21   35:aload           4
	//   22   37:astore_3        
		if(llrbnode1 == null)
	//*  23   38:aload           4
	//*  24   40:ifnonnull       48
			llrbnode = getRight();
	//   25   43:aload_0         
	//   26   44:invokevirtual   #36  <Method LLRBNode getRight()>
	//   27   47:astore_3        
		return ((LLRBValueNode) (new LLRBRedValueNode(obj2, obj, ((LLRBNode) (obj1)), llrbnode)));
	//   28   48:new             #2   <Class LLRBRedValueNode>
	//   29   51:dup             
	//   30   52:aload           5
	//   31   54:aload_1         
	//   32   55:aload_2         
	//   33   56:aload_3         
	//   34   57:invokespecial   #37  <Method void LLRBRedValueNode(Object, Object, LLRBNode, LLRBNode)>
	//   35   60:areturn         
	}

	protected LLRBNode.Color getColor()
	{
		return LLRBNode.Color.RED;
	//    0    0:getstatic       #46  <Field LLRBNode$Color LLRBNode$Color.RED>
	//    1    3:areturn         
	}

	public boolean isRed()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}
}
