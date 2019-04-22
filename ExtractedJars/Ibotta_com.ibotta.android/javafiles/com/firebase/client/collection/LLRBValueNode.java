// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.collection;

import java.util.Comparator;

// Referenced classes of package com.firebase.client.collection:
//			LLRBNode, LLRBEmptyNode, LLRBRedValueNode, LLRBBlackValueNode

public abstract class LLRBValueNode
	implements LLRBNode
{

	LLRBValueNode(Object obj, Object obj1, LLRBNode llrbnode, LLRBNode llrbnode1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		key = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Object key>
		value = obj1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field Object value>
		obj = ((Object) (llrbnode));
	//    8   14:aload_3         
	//    9   15:astore_1        
		if(llrbnode == null)
	//*  10   16:aload_3         
	//*  11   17:ifnonnull       24
			obj = ((Object) (LLRBEmptyNode.getInstance()));
	//   12   20:invokestatic    #31  <Method LLRBEmptyNode LLRBEmptyNode.getInstance()>
	//   13   23:astore_1        
		left = ((LLRBNode) (obj));
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:putfield        #33  <Field LLRBNode left>
		obj = ((Object) (llrbnode1));
	//   17   29:aload           4
	//   18   31:astore_1        
		if(llrbnode1 == null)
	//*  19   32:aload           4
	//*  20   34:ifnonnull       41
			obj = ((Object) (LLRBEmptyNode.getInstance()));
	//   21   37:invokestatic    #31  <Method LLRBEmptyNode LLRBEmptyNode.getInstance()>
	//   22   40:astore_1        
		right = ((LLRBNode) (obj));
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:putfield        #35  <Field LLRBNode right>
	//   26   46:return          
	}

	private LLRBValueNode colorFlip()
	{
		LLRBNode llrbnode = left;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field LLRBNode left>
	//    2    4:astore_1        
		llrbnode = llrbnode.copy(((Object) (null)), ((Object) (null)), oppositeColor(llrbnode), ((LLRBNode) (null)), ((LLRBNode) (null)));
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:aload_1         
	//    7    9:invokestatic    #44  <Method LLRBNode$Color oppositeColor(LLRBNode)>
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokeinterface #48  <Method LLRBNode LLRBNode.copy(Object, Object, LLRBNode$Color, LLRBNode, LLRBNode)>
	//   11   19:astore_1        
		LLRBNode llrbnode1 = right;
	//   12   20:aload_0         
	//   13   21:getfield        #35  <Field LLRBNode right>
	//   14   24:astore_2        
		llrbnode1 = llrbnode1.copy(((Object) (null)), ((Object) (null)), oppositeColor(llrbnode1), ((LLRBNode) (null)), ((LLRBNode) (null)));
	//   15   25:aload_2         
	//   16   26:aconst_null     
	//   17   27:aconst_null     
	//   18   28:aload_2         
	//   19   29:invokestatic    #44  <Method LLRBNode$Color oppositeColor(LLRBNode)>
	//   20   32:aconst_null     
	//   21   33:aconst_null     
	//   22   34:invokeinterface #48  <Method LLRBNode LLRBNode.copy(Object, Object, LLRBNode$Color, LLRBNode, LLRBNode)>
	//   23   39:astore_2        
		return copy(((Object) (null)), ((Object) (null)), oppositeColor(((LLRBNode) (this))), llrbnode, llrbnode1);
	//   24   40:aload_0         
	//   25   41:aconst_null     
	//   26   42:aconst_null     
	//   27   43:aload_0         
	//   28   44:invokestatic    #44  <Method LLRBNode$Color oppositeColor(LLRBNode)>
	//   29   47:aload_1         
	//   30   48:aload_2         
	//   31   49:invokevirtual   #51  <Method LLRBValueNode copy(Object, Object, LLRBNode$Color, LLRBNode, LLRBNode)>
	//   32   52:areturn         
	}

	private LLRBValueNode fixUp()
	{
		LLRBValueNode llrbvaluenode1;
		if(right.isRed() && !left.isRed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field LLRBNode right>
	//*   2    4:invokeinterface #57  <Method boolean LLRBNode.isRed()>
	//*   3    9:ifeq            32
	//*   4   12:aload_0         
	//*   5   13:getfield        #33  <Field LLRBNode left>
	//*   6   16:invokeinterface #57  <Method boolean LLRBNode.isRed()>
	//*   7   21:ifne            32
			llrbvaluenode1 = rotateLeft();
	//    8   24:aload_0         
	//    9   25:invokespecial   #60  <Method LLRBValueNode rotateLeft()>
	//   10   28:astore_2        
		else
	//*  11   29:goto            34
			llrbvaluenode1 = this;
	//   12   32:aload_0         
	//   13   33:astore_2        
		LLRBValueNode llrbvaluenode = llrbvaluenode1;
	//   14   34:aload_2         
	//   15   35:astore_1        
		if(llrbvaluenode1.left.isRed())
	//*  16   36:aload_2         
	//*  17   37:getfield        #33  <Field LLRBNode left>
	//*  18   40:invokeinterface #57  <Method boolean LLRBNode.isRed()>
	//*  19   45:ifeq            73
		{
			llrbvaluenode = llrbvaluenode1;
	//   20   48:aload_2         
	//   21   49:astore_1        
			if(((LLRBValueNode)llrbvaluenode1.left).left.isRed())
	//*  22   50:aload_2         
	//*  23   51:getfield        #33  <Field LLRBNode left>
	//*  24   54:checkcast       #2   <Class LLRBValueNode>
	//*  25   57:getfield        #33  <Field LLRBNode left>
	//*  26   60:invokeinterface #57  <Method boolean LLRBNode.isRed()>
	//*  27   65:ifeq            73
				llrbvaluenode = llrbvaluenode1.rotateRight();
	//   28   68:aload_2         
	//   29   69:invokespecial   #63  <Method LLRBValueNode rotateRight()>
	//   30   72:astore_1        
		}
		llrbvaluenode1 = llrbvaluenode;
	//   31   73:aload_1         
	//   32   74:astore_2        
		if(llrbvaluenode.left.isRed())
	//*  33   75:aload_1         
	//*  34   76:getfield        #33  <Field LLRBNode left>
	//*  35   79:invokeinterface #57  <Method boolean LLRBNode.isRed()>
	//*  36   84:ifeq            106
		{
			llrbvaluenode1 = llrbvaluenode;
	//   37   87:aload_1         
	//   38   88:astore_2        
			if(llrbvaluenode.right.isRed())
	//*  39   89:aload_1         
	//*  40   90:getfield        #35  <Field LLRBNode right>
	//*  41   93:invokeinterface #57  <Method boolean LLRBNode.isRed()>
	//*  42   98:ifeq            106
				llrbvaluenode1 = llrbvaluenode.colorFlip();
	//   43  101:aload_1         
	//   44  102:invokespecial   #65  <Method LLRBValueNode colorFlip()>
	//   45  105:astore_2        
		}
		return llrbvaluenode1;
	//   46  106:aload_2         
	//   47  107:areturn         
	}

	private LLRBValueNode moveRedLeft()
	{
		LLRBValueNode llrbvaluenode1 = colorFlip();
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method LLRBValueNode colorFlip()>
	//    2    4:astore_2        
		LLRBValueNode llrbvaluenode = llrbvaluenode1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(llrbvaluenode1.getRight().getLeft().isRed())
	//*   5    7:aload_2         
	//*   6    8:invokevirtual   #70  <Method LLRBNode getRight()>
	//*   7   11:invokeinterface #73  <Method LLRBNode LLRBNode.getLeft()>
	//*   8   16:invokeinterface #57  <Method boolean LLRBNode.isRed()>
	//*   9   21:ifeq            48
			llrbvaluenode = llrbvaluenode1.copy(((Object) (null)), ((Object) (null)), ((LLRBNode) (null)), ((LLRBNode) (((LLRBValueNode)llrbvaluenode1.getRight()).rotateRight()))).rotateLeft().colorFlip();
	//   10   24:aload_2         
	//   11   25:aconst_null     
	//   12   26:aconst_null     
	//   13   27:aconst_null     
	//   14   28:aload_2         
	//   15   29:invokevirtual   #70  <Method LLRBNode getRight()>
	//   16   32:checkcast       #2   <Class LLRBValueNode>
	//   17   35:invokespecial   #63  <Method LLRBValueNode rotateRight()>
	//   18   38:invokevirtual   #76  <Method LLRBValueNode copy(Object, Object, LLRBNode, LLRBNode)>
	//   19   41:invokespecial   #60  <Method LLRBValueNode rotateLeft()>
	//   20   44:invokespecial   #65  <Method LLRBValueNode colorFlip()>
	//   21   47:astore_1        
		return llrbvaluenode;
	//   22   48:aload_1         
	//   23   49:areturn         
	}

	private LLRBValueNode moveRedRight()
	{
		LLRBValueNode llrbvaluenode1 = colorFlip();
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method LLRBValueNode colorFlip()>
	//    2    4:astore_2        
		LLRBValueNode llrbvaluenode = llrbvaluenode1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(llrbvaluenode1.getLeft().getLeft().isRed())
	//*   5    7:aload_2         
	//*   6    8:invokevirtual   #78  <Method LLRBNode getLeft()>
	//*   7   11:invokeinterface #73  <Method LLRBNode LLRBNode.getLeft()>
	//*   8   16:invokeinterface #57  <Method boolean LLRBNode.isRed()>
	//*   9   21:ifeq            32
			llrbvaluenode = llrbvaluenode1.rotateRight().colorFlip();
	//   10   24:aload_2         
	//   11   25:invokespecial   #63  <Method LLRBValueNode rotateRight()>
	//   12   28:invokespecial   #65  <Method LLRBValueNode colorFlip()>
	//   13   31:astore_1        
		return llrbvaluenode;
	//   14   32:aload_1         
	//   15   33:areturn         
	}

	private static LLRBNode.Color oppositeColor(LLRBNode llrbnode)
	{
		if(llrbnode.isRed())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #57  <Method boolean LLRBNode.isRed()>
	//*   2    6:ifeq            13
			return LLRBNode.Color.BLACK;
	//    3    9:getstatic       #84  <Field LLRBNode$Color LLRBNode$Color.BLACK>
	//    4   12:areturn         
		else
			return LLRBNode.Color.RED;
	//    5   13:getstatic       #87  <Field LLRBNode$Color LLRBNode$Color.RED>
	//    6   16:areturn         
	}

	private LLRBNode removeMin()
	{
		if(left.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field LLRBNode left>
	//*   2    4:invokeinterface #91  <Method boolean LLRBNode.isEmpty()>
	//*   3    9:ifeq            16
			return ((LLRBNode) (LLRBEmptyNode.getInstance()));
	//    4   12:invokestatic    #31  <Method LLRBEmptyNode LLRBEmptyNode.getInstance()>
	//    5   15:areturn         
		LLRBValueNode llrbvaluenode;
		if(!getLeft().isRed() && !getLeft().getLeft().isRed())
	//*   6   16:aload_0         
	//*   7   17:invokevirtual   #78  <Method LLRBNode getLeft()>
	//*   8   20:invokeinterface #57  <Method boolean LLRBNode.isRed()>
	//*   9   25:ifne            53
	//*  10   28:aload_0         
	//*  11   29:invokevirtual   #78  <Method LLRBNode getLeft()>
	//*  12   32:invokeinterface #73  <Method LLRBNode LLRBNode.getLeft()>
	//*  13   37:invokeinterface #57  <Method boolean LLRBNode.isRed()>
	//*  14   42:ifne            53
			llrbvaluenode = moveRedLeft();
	//   15   45:aload_0         
	//   16   46:invokespecial   #93  <Method LLRBValueNode moveRedLeft()>
	//   17   49:astore_1        
		else
	//*  18   50:goto            55
			llrbvaluenode = this;
	//   19   53:aload_0         
	//   20   54:astore_1        
		return ((LLRBNode) (llrbvaluenode.copy(((Object) (null)), ((Object) (null)), ((LLRBValueNode)llrbvaluenode.left).removeMin(), ((LLRBNode) (null))).fixUp()));
	//   21   55:aload_1         
	//   22   56:aconst_null     
	//   23   57:aconst_null     
	//   24   58:aload_1         
	//   25   59:getfield        #33  <Field LLRBNode left>
	//   26   62:checkcast       #2   <Class LLRBValueNode>
	//   27   65:invokespecial   #95  <Method LLRBNode removeMin()>
	//   28   68:aconst_null     
	//   29   69:invokevirtual   #76  <Method LLRBValueNode copy(Object, Object, LLRBNode, LLRBNode)>
	//   30   72:invokespecial   #97  <Method LLRBValueNode fixUp()>
	//   31   75:areturn         
	}

	private LLRBValueNode rotateLeft()
	{
		LLRBValueNode llrbvaluenode = copy(((Object) (null)), ((Object) (null)), LLRBNode.Color.RED, ((LLRBNode) (null)), ((LLRBValueNode)right).left);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:getstatic       #87  <Field LLRBNode$Color LLRBNode$Color.RED>
	//    4    6:aconst_null     
	//    5    7:aload_0         
	//    6    8:getfield        #35  <Field LLRBNode right>
	//    7   11:checkcast       #2   <Class LLRBValueNode>
	//    8   14:getfield        #33  <Field LLRBNode left>
	//    9   17:invokevirtual   #51  <Method LLRBValueNode copy(Object, Object, LLRBNode$Color, LLRBNode, LLRBNode)>
	//   10   20:astore_1        
		return (LLRBValueNode)right.copy(((Object) (null)), ((Object) (null)), getColor(), ((LLRBNode) (llrbvaluenode)), ((LLRBNode) (null)));
	//   11   21:aload_0         
	//   12   22:getfield        #35  <Field LLRBNode right>
	//   13   25:aconst_null     
	//   14   26:aconst_null     
	//   15   27:aload_0         
	//   16   28:invokevirtual   #102 <Method LLRBNode$Color getColor()>
	//   17   31:aload_1         
	//   18   32:aconst_null     
	//   19   33:invokeinterface #48  <Method LLRBNode LLRBNode.copy(Object, Object, LLRBNode$Color, LLRBNode, LLRBNode)>
	//   20   38:checkcast       #2   <Class LLRBValueNode>
	//   21   41:areturn         
	}

	private LLRBValueNode rotateRight()
	{
		LLRBValueNode llrbvaluenode = copy(((Object) (null)), ((Object) (null)), LLRBNode.Color.RED, ((LLRBValueNode)left).right, ((LLRBNode) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:getstatic       #87  <Field LLRBNode$Color LLRBNode$Color.RED>
	//    4    6:aload_0         
	//    5    7:getfield        #33  <Field LLRBNode left>
	//    6   10:checkcast       #2   <Class LLRBValueNode>
	//    7   13:getfield        #35  <Field LLRBNode right>
	//    8   16:aconst_null     
	//    9   17:invokevirtual   #51  <Method LLRBValueNode copy(Object, Object, LLRBNode$Color, LLRBNode, LLRBNode)>
	//   10   20:astore_1        
		return (LLRBValueNode)left.copy(((Object) (null)), ((Object) (null)), getColor(), ((LLRBNode) (null)), ((LLRBNode) (llrbvaluenode)));
	//   11   21:aload_0         
	//   12   22:getfield        #33  <Field LLRBNode left>
	//   13   25:aconst_null     
	//   14   26:aconst_null     
	//   15   27:aload_0         
	//   16   28:invokevirtual   #102 <Method LLRBNode$Color getColor()>
	//   17   31:aconst_null     
	//   18   32:aload_1         
	//   19   33:invokeinterface #48  <Method LLRBNode LLRBNode.copy(Object, Object, LLRBNode$Color, LLRBNode, LLRBNode)>
	//   20   38:checkcast       #2   <Class LLRBValueNode>
	//   21   41:areturn         
	}

	public volatile LLRBNode copy(Object obj, Object obj1, LLRBNode.Color color, LLRBNode llrbnode, LLRBNode llrbnode1)
	{
		return ((LLRBNode) (copy(obj, obj1, color, llrbnode, llrbnode1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokevirtual   #51  <Method LLRBValueNode copy(Object, Object, LLRBNode$Color, LLRBNode, LLRBNode)>
	//    7   11:areturn         
	}

	public LLRBValueNode copy(Object obj, Object obj1, LLRBNode.Color color, LLRBNode llrbnode, LLRBNode llrbnode1)
	{
		Object obj2 = obj;
	//    0    0:aload_1         
	//    1    1:astore          6
		if(obj == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       13
			obj2 = key;
	//    4    7:aload_0         
	//    5    8:getfield        #23  <Field Object key>
	//    6   11:astore          6
		obj = obj1;
	//    7   13:aload_2         
	//    8   14:astore_1        
		if(obj1 == null)
	//*   9   15:aload_2         
	//*  10   16:ifnonnull       24
			obj = value;
	//   11   19:aload_0         
	//   12   20:getfield        #25  <Field Object value>
	//   13   23:astore_1        
		obj1 = ((Object) (llrbnode));
	//   14   24:aload           4
	//   15   26:astore_2        
		if(llrbnode == null)
	//*  16   27:aload           4
	//*  17   29:ifnonnull       37
			obj1 = ((Object) (left));
	//   18   32:aload_0         
	//   19   33:getfield        #33  <Field LLRBNode left>
	//   20   36:astore_2        
		llrbnode = llrbnode1;
	//   21   37:aload           5
	//   22   39:astore          4
		if(llrbnode1 == null)
	//*  23   41:aload           5
	//*  24   43:ifnonnull       52
			llrbnode = right;
	//   25   46:aload_0         
	//   26   47:getfield        #35  <Field LLRBNode right>
	//   27   50:astore          4
		if(color == LLRBNode.Color.RED)
	//*  28   52:aload_3         
	//*  29   53:getstatic       #87  <Field LLRBNode$Color LLRBNode$Color.RED>
	//*  30   56:if_acmpne       73
			return ((LLRBValueNode) (new LLRBRedValueNode(obj2, obj, ((LLRBNode) (obj1)), llrbnode)));
	//   31   59:new             #104 <Class LLRBRedValueNode>
	//   32   62:dup             
	//   33   63:aload           6
	//   34   65:aload_1         
	//   35   66:aload_2         
	//   36   67:aload           4
	//   37   69:invokespecial   #106 <Method void LLRBRedValueNode(Object, Object, LLRBNode, LLRBNode)>
	//   38   72:areturn         
		else
			return ((LLRBValueNode) (new LLRBBlackValueNode(obj2, obj, ((LLRBNode) (obj1)), llrbnode)));
	//   39   73:new             #108 <Class LLRBBlackValueNode>
	//   40   76:dup             
	//   41   77:aload           6
	//   42   79:aload_1         
	//   43   80:aload_2         
	//   44   81:aload           4
	//   45   83:invokespecial   #109 <Method void LLRBBlackValueNode(Object, Object, LLRBNode, LLRBNode)>
	//   46   86:areturn         
	}

	protected abstract LLRBValueNode copy(Object obj, Object obj1, LLRBNode llrbnode, LLRBNode llrbnode1);

	public int count()
	{
		return left.count() + 1 + right.count();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field LLRBNode left>
	//    2    4:invokeinterface #114 <Method int LLRBNode.count()>
	//    3    9:iconst_1        
	//    4   10:iadd            
	//    5   11:aload_0         
	//    6   12:getfield        #35  <Field LLRBNode right>
	//    7   15:invokeinterface #114 <Method int LLRBNode.count()>
	//    8   20:iadd            
	//    9   21:ireturn         
	}

	protected abstract LLRBNode.Color getColor();

	public Object getKey()
	{
		return key;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Object key>
	//    2    4:areturn         
	}

	public LLRBNode getLeft()
	{
		return left;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field LLRBNode left>
	//    2    4:areturn         
	}

	public LLRBNode getMax()
	{
		if(right.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field LLRBNode right>
	//*   2    4:invokeinterface #91  <Method boolean LLRBNode.isEmpty()>
	//*   3    9:ifeq            14
			return ((LLRBNode) (this));
	//    4   12:aload_0         
	//    5   13:areturn         
		else
			return right.getMax();
	//    6   14:aload_0         
	//    7   15:getfield        #35  <Field LLRBNode right>
	//    8   18:invokeinterface #120 <Method LLRBNode LLRBNode.getMax()>
	//    9   23:areturn         
	}

	public LLRBNode getMin()
	{
		if(left.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field LLRBNode left>
	//*   2    4:invokeinterface #91  <Method boolean LLRBNode.isEmpty()>
	//*   3    9:ifeq            14
			return ((LLRBNode) (this));
	//    4   12:aload_0         
	//    5   13:areturn         
		else
			return left.getMin();
	//    6   14:aload_0         
	//    7   15:getfield        #33  <Field LLRBNode left>
	//    8   18:invokeinterface #123 <Method LLRBNode LLRBNode.getMin()>
	//    9   23:areturn         
	}

	public LLRBNode getRight()
	{
		return right;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field LLRBNode right>
	//    2    4:areturn         
	}

	public Object getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object value>
	//    2    4:areturn         
	}

	public void inOrderTraversal(LLRBNode.NodeVisitor nodevisitor)
	{
		left.inOrderTraversal(nodevisitor);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field LLRBNode left>
	//    2    4:aload_1         
	//    3    5:invokeinterface #129 <Method void LLRBNode.inOrderTraversal(LLRBNode$NodeVisitor)>
		nodevisitor.visitEntry(key, value);
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field Object key>
	//    7   15:aload_0         
	//    8   16:getfield        #25  <Field Object value>
	//    9   19:invokevirtual   #135 <Method void LLRBNode$NodeVisitor.visitEntry(Object, Object)>
		right.inOrderTraversal(nodevisitor);
	//   10   22:aload_0         
	//   11   23:getfield        #35  <Field LLRBNode right>
	//   12   26:aload_1         
	//   13   27:invokeinterface #129 <Method void LLRBNode.inOrderTraversal(LLRBNode$NodeVisitor)>
	//   14   32:return          
	}

	public LLRBNode insert(Object obj, Object obj1, Comparator comparator)
	{
		int i = comparator.compare(obj, key);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #23  <Field Object key>
	//    4    6:invokeinterface #144 <Method int Comparator.compare(Object, Object)>
	//    5   11:istore          4
		if(i < 0)
	//*   6   13:iload           4
	//*   7   15:ifge            41
			obj = ((Object) (copy(((Object) (null)), ((Object) (null)), left.insert(obj, obj1, comparator), ((LLRBNode) (null)))));
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:aconst_null     
	//   11   21:aload_0         
	//   12   22:getfield        #33  <Field LLRBNode left>
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:aload_3         
	//   16   28:invokeinterface #146 <Method LLRBNode LLRBNode.insert(Object, Object, Comparator)>
	//   17   33:aconst_null     
	//   18   34:invokevirtual   #76  <Method LLRBValueNode copy(Object, Object, LLRBNode, LLRBNode)>
	//   19   37:astore_1        
		else
	//*  20   38:goto            78
		if(i == 0)
	//*  21   41:iload           4
	//*  22   43:ifne            58
			obj = ((Object) (copy(obj, obj1, ((LLRBNode) (null)), ((LLRBNode) (null)))));
	//   23   46:aload_0         
	//   24   47:aload_1         
	//   25   48:aload_2         
	//   26   49:aconst_null     
	//   27   50:aconst_null     
	//   28   51:invokevirtual   #76  <Method LLRBValueNode copy(Object, Object, LLRBNode, LLRBNode)>
	//   29   54:astore_1        
		else
	//*  30   55:goto            78
			obj = ((Object) (copy(((Object) (null)), ((Object) (null)), ((LLRBNode) (null)), right.insert(obj, obj1, comparator))));
	//   31   58:aload_0         
	//   32   59:aconst_null     
	//   33   60:aconst_null     
	//   34   61:aconst_null     
	//   35   62:aload_0         
	//   36   63:getfield        #35  <Field LLRBNode right>
	//   37   66:aload_1         
	//   38   67:aload_2         
	//   39   68:aload_3         
	//   40   69:invokeinterface #146 <Method LLRBNode LLRBNode.insert(Object, Object, Comparator)>
	//   41   74:invokevirtual   #76  <Method LLRBValueNode copy(Object, Object, LLRBNode, LLRBNode)>
	//   42   77:astore_1        
		return ((LLRBNode) (((LLRBValueNode) (obj)).fixUp()));
	//   43   78:aload_1         
	//   44   79:invokespecial   #97  <Method LLRBValueNode fixUp()>
	//   45   82:areturn         
	}

	public boolean isEmpty()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public LLRBNode remove(Object obj, Comparator comparator)
	{
		if(comparator.compare(obj, key) < 0)
	//*   0    0:aload_2         
	//*   1    1:aload_1         
	//*   2    2:aload_0         
	//*   3    3:getfield        #23  <Field Object key>
	//*   4    6:invokeinterface #144 <Method int Comparator.compare(Object, Object)>
	//*   5   11:ifge            88
		{
			LLRBValueNode llrbvaluenode;
			if(!left.isEmpty() && !left.isRed() && !((LLRBValueNode)left).left.isRed())
	//*   6   14:aload_0         
	//*   7   15:getfield        #33  <Field LLRBNode left>
	//*   8   18:invokeinterface #91  <Method boolean LLRBNode.isEmpty()>
	//*   9   23:ifne            64
	//*  10   26:aload_0         
	//*  11   27:getfield        #33  <Field LLRBNode left>
	//*  12   30:invokeinterface #57  <Method boolean LLRBNode.isRed()>
	//*  13   35:ifne            64
	//*  14   38:aload_0         
	//*  15   39:getfield        #33  <Field LLRBNode left>
	//*  16   42:checkcast       #2   <Class LLRBValueNode>
	//*  17   45:getfield        #33  <Field LLRBNode left>
	//*  18   48:invokeinterface #57  <Method boolean LLRBNode.isRed()>
	//*  19   53:ifne            64
				llrbvaluenode = moveRedLeft();
	//   20   56:aload_0         
	//   21   57:invokespecial   #93  <Method LLRBValueNode moveRedLeft()>
	//   22   60:astore_3        
			else
	//*  23   61:goto            66
				llrbvaluenode = this;
	//   24   64:aload_0         
	//   25   65:astore_3        
			obj = ((Object) (llrbvaluenode.copy(((Object) (null)), ((Object) (null)), llrbvaluenode.left.remove(obj, comparator), ((LLRBNode) (null)))));
	//   26   66:aload_3         
	//   27   67:aconst_null     
	//   28   68:aconst_null     
	//   29   69:aload_3         
	//   30   70:getfield        #33  <Field LLRBNode left>
	//   31   73:aload_1         
	//   32   74:aload_2         
	//   33   75:invokeinterface #151 <Method LLRBNode LLRBNode.remove(Object, Comparator)>
	//   34   80:aconst_null     
	//   35   81:invokevirtual   #76  <Method LLRBValueNode copy(Object, Object, LLRBNode, LLRBNode)>
	//   36   84:astore_1        
		} else
	//*  37   85:goto            268
		{
			Object obj1;
			if(left.isRed())
	//*  38   88:aload_0         
	//*  39   89:getfield        #33  <Field LLRBNode left>
	//*  40   92:invokeinterface #57  <Method boolean LLRBNode.isRed()>
	//*  41   97:ifeq            109
				obj1 = ((Object) (rotateRight()));
	//   42  100:aload_0         
	//   43  101:invokespecial   #63  <Method LLRBValueNode rotateRight()>
	//   44  104:astore          4
			else
	//*  45  106:goto            112
				obj1 = ((Object) (this));
	//   46  109:aload_0         
	//   47  110:astore          4
			LLRBValueNode llrbvaluenode1 = ((LLRBValueNode) (obj1));
	//   48  112:aload           4
	//   49  114:astore_3        
			if(!((LLRBValueNode) (obj1)).right.isEmpty())
	//*  50  115:aload           4
	//*  51  117:getfield        #35  <Field LLRBNode right>
	//*  52  120:invokeinterface #91  <Method boolean LLRBNode.isEmpty()>
	//*  53  125:ifne            172
			{
				llrbvaluenode1 = ((LLRBValueNode) (obj1));
	//   54  128:aload           4
	//   55  130:astore_3        
				if(!((LLRBValueNode) (obj1)).right.isRed())
	//*  56  131:aload           4
	//*  57  133:getfield        #35  <Field LLRBNode right>
	//*  58  136:invokeinterface #57  <Method boolean LLRBNode.isRed()>
	//*  59  141:ifne            172
				{
					llrbvaluenode1 = ((LLRBValueNode) (obj1));
	//   60  144:aload           4
	//   61  146:astore_3        
					if(!((LLRBValueNode)((LLRBValueNode) (obj1)).right).left.isRed())
	//*  62  147:aload           4
	//*  63  149:getfield        #35  <Field LLRBNode right>
	//*  64  152:checkcast       #2   <Class LLRBValueNode>
	//*  65  155:getfield        #33  <Field LLRBNode left>
	//*  66  158:invokeinterface #57  <Method boolean LLRBNode.isRed()>
	//*  67  163:ifne            172
						llrbvaluenode1 = ((LLRBValueNode) (obj1)).moveRedRight();
	//   68  166:aload           4
	//   69  168:invokespecial   #153 <Method LLRBValueNode moveRedRight()>
	//   70  171:astore_3        
				}
			}
			obj1 = ((Object) (llrbvaluenode1));
	//   71  172:aload_3         
	//   72  173:astore          4
			if(comparator.compare(obj, llrbvaluenode1.key) == 0)
	//*  73  175:aload_2         
	//*  74  176:aload_1         
	//*  75  177:aload_3         
	//*  76  178:getfield        #23  <Field Object key>
	//*  77  181:invokeinterface #144 <Method int Comparator.compare(Object, Object)>
	//*  78  186:ifne            247
			{
				if(llrbvaluenode1.right.isEmpty())
	//*  79  189:aload_3         
	//*  80  190:getfield        #35  <Field LLRBNode right>
	//*  81  193:invokeinterface #91  <Method boolean LLRBNode.isEmpty()>
	//*  82  198:ifeq            205
					return ((LLRBNode) (LLRBEmptyNode.getInstance()));
	//   83  201:invokestatic    #31  <Method LLRBEmptyNode LLRBEmptyNode.getInstance()>
	//   84  204:areturn         
				obj1 = ((Object) (llrbvaluenode1.right.getMin()));
	//   85  205:aload_3         
	//   86  206:getfield        #35  <Field LLRBNode right>
	//   87  209:invokeinterface #123 <Method LLRBNode LLRBNode.getMin()>
	//   88  214:astore          4
				obj1 = ((Object) (llrbvaluenode1.copy(((LLRBNode) (obj1)).getKey(), ((LLRBNode) (obj1)).getValue(), ((LLRBNode) (null)), ((LLRBValueNode)llrbvaluenode1.right).removeMin())));
	//   89  216:aload_3         
	//   90  217:aload           4
	//   91  219:invokeinterface #155 <Method Object LLRBNode.getKey()>
	//   92  224:aload           4
	//   93  226:invokeinterface #157 <Method Object LLRBNode.getValue()>
	//   94  231:aconst_null     
	//   95  232:aload_3         
	//   96  233:getfield        #35  <Field LLRBNode right>
	//   97  236:checkcast       #2   <Class LLRBValueNode>
	//   98  239:invokespecial   #95  <Method LLRBNode removeMin()>
	//   99  242:invokevirtual   #76  <Method LLRBValueNode copy(Object, Object, LLRBNode, LLRBNode)>
	//  100  245:astore          4
			}
			obj = ((Object) (((LLRBValueNode) (obj1)).copy(((Object) (null)), ((Object) (null)), ((LLRBNode) (null)), ((LLRBValueNode) (obj1)).right.remove(obj, comparator))));
	//  101  247:aload           4
	//  102  249:aconst_null     
	//  103  250:aconst_null     
	//  104  251:aconst_null     
	//  105  252:aload           4
	//  106  254:getfield        #35  <Field LLRBNode right>
	//  107  257:aload_1         
	//  108  258:aload_2         
	//  109  259:invokeinterface #151 <Method LLRBNode LLRBNode.remove(Object, Comparator)>
	//  110  264:invokevirtual   #76  <Method LLRBValueNode copy(Object, Object, LLRBNode, LLRBNode)>
	//  111  267:astore_1        
		}
		return ((LLRBNode) (((LLRBValueNode) (obj)).fixUp()));
	//  112  268:aload_1         
	//  113  269:invokespecial   #97  <Method LLRBValueNode fixUp()>
	//  114  272:areturn         
	}

	void setLeft(LLRBNode llrbnode)
	{
		left = llrbnode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field LLRBNode left>
	//    3    5:return          
	}

	public boolean shortCircuitingInOrderTraversal(LLRBNode.ShortCircuitingNodeVisitor shortcircuitingnodevisitor)
	{
		if(left.shortCircuitingInOrderTraversal(shortcircuitingnodevisitor) && shortcircuitingnodevisitor.shouldContinue(key, value))
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field LLRBNode left>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #165 <Method boolean LLRBNode.shortCircuitingInOrderTraversal(LLRBNode$ShortCircuitingNodeVisitor)>
	//*   4   10:ifeq            41
	//*   5   13:aload_1         
	//*   6   14:aload_0         
	//*   7   15:getfield        #23  <Field Object key>
	//*   8   18:aload_0         
	//*   9   19:getfield        #25  <Field Object value>
	//*  10   22:invokeinterface #171 <Method boolean LLRBNode$ShortCircuitingNodeVisitor.shouldContinue(Object, Object)>
	//*  11   27:ifeq            41
			return right.shortCircuitingInOrderTraversal(shortcircuitingnodevisitor);
	//   12   30:aload_0         
	//   13   31:getfield        #35  <Field LLRBNode right>
	//   14   34:aload_1         
	//   15   35:invokeinterface #165 <Method boolean LLRBNode.shortCircuitingInOrderTraversal(LLRBNode$ShortCircuitingNodeVisitor)>
	//   16   40:ireturn         
		else
			return false;
	//   17   41:iconst_0        
	//   18   42:ireturn         
	}

	public boolean shortCircuitingReverseOrderTraversal(LLRBNode.ShortCircuitingNodeVisitor shortcircuitingnodevisitor)
	{
		if(right.shortCircuitingReverseOrderTraversal(shortcircuitingnodevisitor) && shortcircuitingnodevisitor.shouldContinue(key, value))
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field LLRBNode right>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #175 <Method boolean LLRBNode.shortCircuitingReverseOrderTraversal(LLRBNode$ShortCircuitingNodeVisitor)>
	//*   4   10:ifeq            41
	//*   5   13:aload_1         
	//*   6   14:aload_0         
	//*   7   15:getfield        #23  <Field Object key>
	//*   8   18:aload_0         
	//*   9   19:getfield        #25  <Field Object value>
	//*  10   22:invokeinterface #171 <Method boolean LLRBNode$ShortCircuitingNodeVisitor.shouldContinue(Object, Object)>
	//*  11   27:ifeq            41
			return left.shortCircuitingReverseOrderTraversal(shortcircuitingnodevisitor);
	//   12   30:aload_0         
	//   13   31:getfield        #33  <Field LLRBNode left>
	//   14   34:aload_1         
	//   15   35:invokeinterface #175 <Method boolean LLRBNode.shortCircuitingReverseOrderTraversal(LLRBNode$ShortCircuitingNodeVisitor)>
	//   16   40:ireturn         
		else
			return false;
	//   17   41:iconst_0        
	//   18   42:ireturn         
	}

	private final Object key;
	private LLRBNode left;
	private final LLRBNode right;
	private final Object value;
}
