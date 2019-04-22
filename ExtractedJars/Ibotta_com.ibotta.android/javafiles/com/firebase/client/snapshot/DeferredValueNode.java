// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;

import java.util.Map;

// Referenced classes of package com.firebase.client.snapshot:
//			LeafNode, Node

public class DeferredValueNode extends LeafNode
{

	public DeferredValueNode(Map map, Node node)
	{
		super(node);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #19  <Method void LeafNode(Node)>
		value = map;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #21  <Field Map value>
	//    6   10:return          
	}

	protected int compareLeafValues(DeferredValueNode deferredvaluenode)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected volatile int compareLeafValues(LeafNode leafnode)
	{
		return compareLeafValues((DeferredValueNode)leafnode);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class DeferredValueNode>
	//    3    5:invokevirtual   #28  <Method int compareLeafValues(DeferredValueNode)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof DeferredValueNode;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class DeferredValueNode>
	//    2    4:istore_2        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(!flag)
	//*   5    7:iload_2         
	//*   6    8:ifne            13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		obj = ((Object) ((DeferredValueNode)obj));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class DeferredValueNode>
	//   11   17:astore_1        
		flag = flag1;
	//   12   18:iload_3         
	//   13   19:istore_2        
		if(value.equals(((Object) (((DeferredValueNode) (obj)).value))))
	//*  14   20:aload_0         
	//*  15   21:getfield        #21  <Field Map value>
	//*  16   24:aload_1         
	//*  17   25:getfield        #21  <Field Map value>
	//*  18   28:invokeinterface #34  <Method boolean Map.equals(Object)>
	//*  19   33:ifeq            54
		{
			flag = flag1;
	//   20   36:iload_3         
	//   21   37:istore_2        
			if(((Object) (priority)).equals(((Object) (((DeferredValueNode) (obj)).priority))))
	//*  22   38:aload_0         
	//*  23   39:getfield        #38  <Field Node priority>
	//*  24   42:aload_1         
	//*  25   43:getfield        #38  <Field Node priority>
	//*  26   46:invokevirtual   #41  <Method boolean Object.equals(Object)>
	//*  27   49:ifeq            54
				flag = true;
	//   28   52:iconst_1        
	//   29   53:istore_2        
		}
		return flag;
	//   30   54:iload_2         
	//   31   55:ireturn         
	}

	public String getHashRepresentation(Node.HashVersion hashversion)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #45  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(getPriorityHash(hashversion));
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #50  <Method String getPriorityHash(Node$HashVersion)>
	//    8   14:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    9   17:pop             
		stringbuilder.append("deferredValue:");
	//   10   18:aload_2         
	//   11   19:ldc1            #56  <String "deferredValue:">
	//   12   21:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
		stringbuilder.append(((Object) (value)));
	//   14   25:aload_2         
	//   15   26:aload_0         
	//   16   27:getfield        #21  <Field Map value>
	//   17   30:invokevirtual   #59  <Method StringBuilder StringBuilder.append(Object)>
	//   18   33:pop             
		return stringbuilder.toString();
	//   19   34:aload_2         
	//   20   35:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   21   38:areturn         
	}

	protected LeafNode.LeafType getLeafType()
	{
		return LeafNode.LeafType.DeferredValue;
	//    0    0:getstatic       #71  <Field LeafNode$LeafType LeafNode$LeafType.DeferredValue>
	//    1    3:areturn         
	}

	public Object getValue()
	{
		return ((Object) (value));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Map value>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return value.hashCode() + ((Object) (priority)).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Map value>
	//    2    4:invokeinterface #77  <Method int Map.hashCode()>
	//    3    9:aload_0         
	//    4   10:getfield        #38  <Field Node priority>
	//    5   13:invokevirtual   #78  <Method int Object.hashCode()>
	//    6   16:iadd            
	//    7   17:ireturn         
	}

	public DeferredValueNode updatePriority(Node node)
	{
		return new DeferredValueNode(value, node);
	//    0    0:new             #2   <Class DeferredValueNode>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Map value>
	//    4    8:aload_1         
	//    5    9:invokespecial   #82  <Method void DeferredValueNode(Map, Node)>
	//    6   12:areturn         
	}

	public volatile Node updatePriority(Node node)
	{
		return ((Node) (updatePriority(node)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #85  <Method DeferredValueNode updatePriority(Node)>
	//    3    5:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private Map value;

	static 
	{
	//    0    0:return          
	}
}
