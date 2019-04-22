// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities;

import com.firebase.client.snapshot.*;
import java.util.Iterator;

public class NodeSizeEstimator
{

	public NodeSizeEstimator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	private static long estimateLeafNodeSize(LeafNode leafnode)
	{
label0:
		{
			boolean flag = leafnode instanceof DoubleNode;
	//    0    0:aload_0         
	//    1    1:instanceof      #20  <Class DoubleNode>
	//    2    4:istore_1        
			long l = 8L;
	//    3    5:ldc2w           #21  <Long 8L>
	//    4    8:lstore_2        
			if(!flag && !(leafnode instanceof LongNode))
	//*   5    9:iload_1         
	//*   6   10:ifeq            16
	//*   7   13:goto            61
	//*   8   16:aload_0         
	//*   9   17:instanceof      #24  <Class LongNode>
	//*  10   20:ifeq            26
	//*  11   23:goto            61
				if(leafnode instanceof BooleanNode)
	//*  12   26:aload_0         
	//*  13   27:instanceof      #26  <Class BooleanNode>
	//*  14   30:ifeq            40
				{
					l = 4L;
	//   15   33:ldc2w           #27  <Long 4L>
	//   16   36:lstore_2        
				} else
	//*  17   37:goto            61
				{
					if(!(leafnode instanceof StringNode))
						break label0;
	//   18   40:aload_0         
	//   19   41:instanceof      #30  <Class StringNode>
	//   20   44:ifeq            92
					l = ((String)leafnode.getValue()).length() + 2;
	//   21   47:aload_0         
	//   22   48:invokevirtual   #36  <Method Object LeafNode.getValue()>
	//   23   51:checkcast       #38  <Class String>
	//   24   54:invokevirtual   #42  <Method int String.length()>
	//   25   57:iconst_2        
	//   26   58:iadd            
	//   27   59:i2l             
	//   28   60:lstore_2        
				}
			if(leafnode.getPriority().isEmpty())
	//*  29   61:aload_0         
	//*  30   62:invokevirtual   #46  <Method Node LeafNode.getPriority()>
	//*  31   65:invokeinterface #52  <Method boolean Node.isEmpty()>
	//*  32   70:ifeq            75
				return l;
	//   33   73:lload_2         
	//   34   74:lreturn         
			else
				return l + 24L + estimateLeafNodeSize((LeafNode)leafnode.getPriority());
	//   35   75:lload_2         
	//   36   76:ldc2w           #53  <Long 24L>
	//   37   79:ladd            
	//   38   80:aload_0         
	//   39   81:invokevirtual   #46  <Method Node LeafNode.getPriority()>
	//   40   84:checkcast       #32  <Class LeafNode>
	//   41   87:invokestatic    #56  <Method long estimateLeafNodeSize(LeafNode)>
	//   42   90:ladd            
	//   43   91:lreturn         
		}
		StringBuilder stringbuilder = new StringBuilder();
	//   44   92:new             #58  <Class StringBuilder>
	//   45   95:dup             
	//   46   96:invokespecial   #59  <Method void StringBuilder()>
	//   47   99:astore          4
		stringbuilder.append("Unknown leaf node type: ");
	//   48  101:aload           4
	//   49  103:ldc1            #61  <String "Unknown leaf node type: ">
	//   50  105:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   51  108:pop             
		stringbuilder.append(((Object) (((Object) (leafnode)).getClass())));
	//   52  109:aload           4
	//   53  111:aload_0         
	//   54  112:invokevirtual   #69  <Method Class Object.getClass()>
	//   55  115:invokevirtual   #72  <Method StringBuilder StringBuilder.append(Object)>
	//   56  118:pop             
		throw new IllegalArgumentException(stringbuilder.toString());
	//   57  119:new             #74  <Class IllegalArgumentException>
	//   58  122:dup             
	//   59  123:aload           4
	//   60  125:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   61  128:invokespecial   #81  <Method void IllegalArgumentException(String)>
	//   62  131:athrow          
	}

	public static long estimateSerializedNodeSize(Node node)
	{
		if(node.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #52  <Method boolean Node.isEmpty()>
	//*   2    6:ifeq            13
			return 4L;
	//    3    9:ldc2w           #27  <Long 4L>
	//    4   12:lreturn         
		if(node.isLeafNode())
	//*   5   13:aload_0         
	//*   6   14:invokeinterface #88  <Method boolean Node.isLeafNode()>
	//*   7   19:ifeq            30
			return estimateLeafNodeSize((LeafNode)node);
	//    8   22:aload_0         
	//    9   23:checkcast       #32  <Class LeafNode>
	//   10   26:invokestatic    #56  <Method long estimateLeafNodeSize(LeafNode)>
	//   11   29:lreturn         
		long l = 1L;
	//   12   30:lconst_1        
	//   13   31:lstore_1        
		for(Iterator iterator = node.iterator(); iterator.hasNext();)
	//*  14   32:aload_0         
	//*  15   33:invokeinterface #92  <Method Iterator Node.iterator()>
	//*  16   38:astore          5
	//*  17   40:aload           5
	//*  18   42:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//*  19   47:ifeq            93
		{
			NamedNode namednode = (NamedNode)iterator.next();
	//   20   50:aload           5
	//   21   52:invokeinterface #100 <Method Object Iterator.next()>
	//   22   57:checkcast       #102 <Class NamedNode>
	//   23   60:astore          6
			l = l + (long)namednode.getName().asString().length() + 4L + estimateSerializedNodeSize(namednode.getNode());
	//   24   62:lload_1         
	//   25   63:aload           6
	//   26   65:invokevirtual   #106 <Method ChildKey NamedNode.getName()>
	//   27   68:invokevirtual   #111 <Method String ChildKey.asString()>
	//   28   71:invokevirtual   #42  <Method int String.length()>
	//   29   74:i2l             
	//   30   75:ladd            
	//   31   76:ldc2w           #27  <Long 4L>
	//   32   79:ladd            
	//   33   80:aload           6
	//   34   82:invokevirtual   #114 <Method Node NamedNode.getNode()>
	//   35   85:invokestatic    #116 <Method long estimateSerializedNodeSize(Node)>
	//   36   88:ladd            
	//   37   89:lstore_1        
		}

	//*  38   90:goto            40
		long l1 = l;
	//   39   93:lload_1         
	//   40   94:lstore_3        
		if(!node.getPriority().isEmpty())
	//*  41   95:aload_0         
	//*  42   96:invokeinterface #117 <Method Node Node.getPriority()>
	//*  43  101:invokeinterface #52  <Method boolean Node.isEmpty()>
	//*  44  106:ifne            128
			l1 = l + 12L + estimateLeafNodeSize((LeafNode)node.getPriority());
	//   45  109:lload_1         
	//   46  110:ldc2w           #118 <Long 12L>
	//   47  113:ladd            
	//   48  114:aload_0         
	//   49  115:invokeinterface #117 <Method Node Node.getPriority()>
	//   50  120:checkcast       #32  <Class LeafNode>
	//   51  123:invokestatic    #56  <Method long estimateLeafNodeSize(LeafNode)>
	//   52  126:ladd            
	//   53  127:lstore_3        
		return l1;
	//   54  128:lload_3         
	//   55  129:lreturn         
	}

	public static int nodeCount(Node node)
	{
		boolean flag = node.isEmpty();
	//    0    0:aload_0         
	//    1    1:invokeinterface #52  <Method boolean Node.isEmpty()>
	//    2    6:istore_2        
		int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		if(flag)
	//*   5    9:iload_2         
	//*   6   10:ifeq            15
			return 0;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		if(node.isLeafNode())
	//*   9   15:aload_0         
	//*  10   16:invokeinterface #88  <Method boolean Node.isLeafNode()>
	//*  11   21:ifeq            26
			return 1;
	//   12   24:iconst_1        
	//   13   25:ireturn         
		for(node = ((Node) (node.iterator())); ((Iterator) (node)).hasNext();)
	//*  14   26:aload_0         
	//*  15   27:invokeinterface #92  <Method Iterator Node.iterator()>
	//*  16   32:astore_0        
	//*  17   33:aload_0         
	//*  18   34:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//*  19   39:ifeq            63
			i += nodeCount(((NamedNode)((Iterator) (node)).next()).getNode());
	//   20   42:iload_1         
	//   21   43:aload_0         
	//   22   44:invokeinterface #100 <Method Object Iterator.next()>
	//   23   49:checkcast       #102 <Class NamedNode>
	//   24   52:invokevirtual   #114 <Method Node NamedNode.getNode()>
	//   25   55:invokestatic    #123 <Method int nodeCount(Node)>
	//   26   58:iadd            
	//   27   59:istore_1        

	//*  28   60:goto            33
		return i;
	//   29   63:iload_1         
	//   30   64:ireturn         
	}

	static final boolean $assertionsDisabled = false;
	private static final int LEAF_PRIORITY_OVERHEAD = 24;

	static 
	{
	//    0    0:return          
	}
}
