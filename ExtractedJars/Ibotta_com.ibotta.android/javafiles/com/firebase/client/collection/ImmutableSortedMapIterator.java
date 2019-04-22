// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.collection;

import java.util.*;

// Referenced classes of package com.firebase.client.collection:
//			LLRBNode, LLRBValueNode

public class ImmutableSortedMapIterator
	implements Iterator
{

	ImmutableSortedMapIterator(LLRBNode llrbnode, Object obj, Comparator comparator, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class Stack>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void Stack()>
	//    6   12:putfield        #22  <Field Stack nodeStack>
		isReverse = flag;
	//    7   15:aload_0         
	//    8   16:iload           4
	//    9   18:putfield        #24  <Field boolean isReverse>
		while(!llrbnode.isEmpty()) 
	//*  10   21:aload_1         
	//*  11   22:invokeinterface #30  <Method boolean LLRBNode.isEmpty()>
	//*  12   27:ifne            163
		{
			int i;
			if(obj != null)
	//*  13   30:aload_2         
	//*  14   31:ifnull          75
			{
				if(flag)
	//*  15   34:iload           4
	//*  16   36:ifeq            57
					i = comparator.compare(obj, llrbnode.getKey());
	//   17   39:aload_3         
	//   18   40:aload_2         
	//   19   41:aload_1         
	//   20   42:invokeinterface #34  <Method Object LLRBNode.getKey()>
	//   21   47:invokeinterface #40  <Method int Comparator.compare(Object, Object)>
	//   22   52:istore          5
				else
	//*  23   54:goto            78
					i = comparator.compare(llrbnode.getKey(), obj);
	//   24   57:aload_3         
	//   25   58:aload_1         
	//   26   59:invokeinterface #34  <Method Object LLRBNode.getKey()>
	//   27   64:aload_2         
	//   28   65:invokeinterface #40  <Method int Comparator.compare(Object, Object)>
	//   29   70:istore          5
			} else
	//*  30   72:goto            78
			{
				i = 1;
	//   31   75:iconst_1        
	//   32   76:istore          5
			}
			if(i < 0)
	//*  33   78:iload           5
	//*  34   80:ifge            108
			{
				if(flag)
	//*  35   83:iload           4
	//*  36   85:ifeq            98
					llrbnode = llrbnode.getLeft();
	//   37   88:aload_1         
	//   38   89:invokeinterface #44  <Method LLRBNode LLRBNode.getLeft()>
	//   39   94:astore_1        
				else
	//*  40   95:goto            21
					llrbnode = llrbnode.getRight();
	//   41   98:aload_1         
	//   42   99:invokeinterface #47  <Method LLRBNode LLRBNode.getRight()>
	//   43  104:astore_1        
			} else
	//*  44  105:goto            21
			{
				if(i == 0)
	//*  45  108:iload           5
	//*  46  110:ifne            126
				{
					nodeStack.push(((Object) ((LLRBValueNode)llrbnode)));
	//   47  113:aload_0         
	//   48  114:getfield        #22  <Field Stack nodeStack>
	//   49  117:aload_1         
	//   50  118:checkcast       #49  <Class LLRBValueNode>
	//   51  121:invokevirtual   #53  <Method Object Stack.push(Object)>
	//   52  124:pop             
					return;
	//   53  125:return          
				}
				nodeStack.push(((Object) ((LLRBValueNode)llrbnode)));
	//   54  126:aload_0         
	//   55  127:getfield        #22  <Field Stack nodeStack>
	//   56  130:aload_1         
	//   57  131:checkcast       #49  <Class LLRBValueNode>
	//   58  134:invokevirtual   #53  <Method Object Stack.push(Object)>
	//   59  137:pop             
				if(flag)
	//*  60  138:iload           4
	//*  61  140:ifeq            153
					llrbnode = llrbnode.getRight();
	//   62  143:aload_1         
	//   63  144:invokeinterface #47  <Method LLRBNode LLRBNode.getRight()>
	//   64  149:astore_1        
				else
	//*  65  150:goto            21
					llrbnode = llrbnode.getLeft();
	//   66  153:aload_1         
	//   67  154:invokeinterface #44  <Method LLRBNode LLRBNode.getLeft()>
	//   68  159:astore_1        
			}
		}
	//*  69  160:goto            21
	//   70  163:return          
	}

	public boolean hasNext()
	{
		return nodeStack.size() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Stack nodeStack>
	//    2    4:invokevirtual   #61  <Method int Stack.size()>
	//    3    7:ifle            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public volatile Object next()
	{
		return ((Object) (next()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method java.util.Map$Entry next()>
	//    2    4:areturn         
	}

	public java.util.Map.Entry next()
	{
		EmptyStackException emptystackexception;
label0:
		{
			Object obj = ((Object) ((LLRBValueNode)nodeStack.pop()));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Stack nodeStack>
	//    2    4:invokevirtual   #70  <Method Object Stack.pop()>
	//    3    7:checkcast       #49  <Class LLRBValueNode>
	//    4   10:astore_1        
			java.util.AbstractMap.SimpleEntry simpleentry = new java.util.AbstractMap.SimpleEntry(((LLRBValueNode) (obj)).getKey(), ((LLRBValueNode) (obj)).getValue());
	//    5   11:new             #72  <Class java.util.AbstractMap$SimpleEntry>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokevirtual   #73  <Method Object LLRBValueNode.getKey()>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #76  <Method Object LLRBValueNode.getValue()>
	//   11   23:invokespecial   #79  <Method void java.util.AbstractMap$SimpleEntry(Object, Object)>
	//   12   26:astore_2        
			if(isReverse)
	//*  13   27:aload_0         
	//*  14   28:getfield        #24  <Field boolean isReverse>
	//*  15   31:ifeq            70
			{
				for(obj = ((Object) (((LLRBValueNode) (obj)).getLeft())); !((LLRBNode) (obj)).isEmpty(); obj = ((Object) (((LLRBNode) (obj)).getRight())))
	//*  16   34:aload_1         
	//*  17   35:invokevirtual   #80  <Method LLRBNode LLRBValueNode.getLeft()>
	//*  18   38:astore_1        
	//*  19   39:aload_1         
	//*  20   40:invokeinterface #30  <Method boolean LLRBNode.isEmpty()>
	//*  21   45:ifne            106
					nodeStack.push(((Object) ((LLRBValueNode)obj)));
	//   22   48:aload_0         
	//   23   49:getfield        #22  <Field Stack nodeStack>
	//   24   52:aload_1         
	//   25   53:checkcast       #49  <Class LLRBValueNode>
	//   26   56:invokevirtual   #53  <Method Object Stack.push(Object)>
	//   27   59:pop             

	//   28   60:aload_1         
	//   29   61:invokeinterface #47  <Method LLRBNode LLRBNode.getRight()>
	//   30   66:astore_1        
				break label0;
	//   31   67:goto            39
			}
			try
			{
				for(obj = ((Object) (((LLRBValueNode) (obj)).getRight())); !((LLRBNode) (obj)).isEmpty(); obj = ((Object) (((LLRBNode) (obj)).getLeft())))
	//*  32   70:aload_1         
	//*  33   71:invokevirtual   #81  <Method LLRBNode LLRBValueNode.getRight()>
	//*  34   74:astore_1        
	//*  35   75:aload_1         
	//*  36   76:invokeinterface #30  <Method boolean LLRBNode.isEmpty()>
	//*  37   81:ifne            106
					nodeStack.push(((Object) ((LLRBValueNode)obj)));
	//   38   84:aload_0         
	//   39   85:getfield        #22  <Field Stack nodeStack>
	//   40   88:aload_1         
	//   41   89:checkcast       #49  <Class LLRBValueNode>
	//   42   92:invokevirtual   #53  <Method Object Stack.push(Object)>
	//   43   95:pop             

	//   44   96:aload_1         
	//   45   97:invokeinterface #44  <Method LLRBNode LLRBNode.getLeft()>
	//   46  102:astore_1        
			}
	//*  47  103:goto            75
	//*  48  106:aload_2         
	//*  49  107:areturn         
	//*  50  108:new             #83  <Class NoSuchElementException>
	//*  51  111:dup             
	//*  52  112:invokespecial   #84  <Method void NoSuchElementException()>
	//*  53  115:athrow          
			// Misplaced declaration of an exception variable
			catch(EmptyStackException emptystackexception)
			{
				throw new NoSuchElementException();
			}
		}
		return ((java.util.Map.Entry) (simpleentry));
	//*  54  116:astore_1        
	//*  55  117:goto            108
	}

	public void remove()
	{
		throw new UnsupportedOperationException("remove called on immutable collection");
	//    0    0:new             #88  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #90  <String "remove called on immutable collection">
	//    3    6:invokespecial   #93  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	private final boolean isReverse;
	private final Stack nodeStack = new Stack();
}
