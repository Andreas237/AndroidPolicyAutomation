// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.util.*;

// Referenced classes of package com.google.gson.internal:
//			LinkedTreeMap

abstract class LinkedTreeMap$LinkedTreeMapIterator
	implements Iterator
{

	public final boolean hasNext()
	{
		return next != header;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field LinkedTreeMap$Node next>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field LinkedTreeMap this$0>
	//    4    8:getfield        #28  <Field LinkedTreeMap$Node LinkedTreeMap.header>
	//    5   11:if_acmpeq       16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	final LinkedTreeMap.Node nextNode()
	{
		LinkedTreeMap.Node node = next;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field LinkedTreeMap$Node next>
	//    2    4:astore_1        
		if(node == header)
	//*   3    5:aload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #22  <Field LinkedTreeMap this$0>
	//*   6   10:getfield        #28  <Field LinkedTreeMap$Node LinkedTreeMap.header>
	//*   7   13:if_acmpne       24
			throw new NoSuchElementException();
	//    8   16:new             #47  <Class NoSuchElementException>
	//    9   19:dup             
	//   10   20:invokespecial   #48  <Method void NoSuchElementException()>
	//   11   23:athrow          
		if(modCount != expectedModCount)
	//*  12   24:aload_0         
	//*  13   25:getfield        #22  <Field LinkedTreeMap this$0>
	//*  14   28:getfield        #38  <Field int LinkedTreeMap.modCount>
	//*  15   31:aload_0         
	//*  16   32:getfield        #40  <Field int expectedModCount>
	//*  17   35:icmpeq          46
		{
			throw new ConcurrentModificationException();
	//   18   38:new             #50  <Class ConcurrentModificationException>
	//   19   41:dup             
	//   20   42:invokespecial   #51  <Method void ConcurrentModificationException()>
	//   21   45:athrow          
		} else
		{
			next = node.next;
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:getfield        #32  <Field LinkedTreeMap$Node LinkedTreeMap$Node.next>
	//   25   51:putfield        #33  <Field LinkedTreeMap$Node next>
			lastReturned = node;
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:putfield        #35  <Field LinkedTreeMap$Node lastReturned>
			return node;
	//   29   59:aload_1         
	//   30   60:areturn         
		}
	}

	public final void remove()
	{
		if(lastReturned == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field LinkedTreeMap$Node lastReturned>
	//*   2    4:ifnonnull       15
		{
			throw new IllegalStateException();
	//    3    7:new             #56  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:invokespecial   #57  <Method void IllegalStateException()>
	//    6   14:athrow          
		} else
		{
			removeInternal(lastReturned, true);
	//    7   15:aload_0         
	//    8   16:getfield        #22  <Field LinkedTreeMap this$0>
	//    9   19:aload_0         
	//   10   20:getfield        #35  <Field LinkedTreeMap$Node lastReturned>
	//   11   23:iconst_1        
	//   12   24:invokevirtual   #61  <Method void LinkedTreeMap.removeInternal(LinkedTreeMap$Node, boolean)>
			lastReturned = null;
	//   13   27:aload_0         
	//   14   28:aconst_null     
	//   15   29:putfield        #35  <Field LinkedTreeMap$Node lastReturned>
			expectedModCount = modCount;
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #22  <Field LinkedTreeMap this$0>
	//   19   37:getfield        #38  <Field int LinkedTreeMap.modCount>
	//   20   40:putfield        #40  <Field int expectedModCount>
			return;
	//   21   43:return          
		}
	}

	int expectedModCount;
	LinkedTreeMap.Node lastReturned;
	LinkedTreeMap.Node next;
	final LinkedTreeMap this$0;

	LinkedTreeMap$LinkedTreeMapIterator()
	{
		this$0 = LinkedTreeMap.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field LinkedTreeMap this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void Object()>
		next = header.next;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #22  <Field LinkedTreeMap this$0>
	//    8   14:getfield        #28  <Field LinkedTreeMap$Node LinkedTreeMap.header>
	//    9   17:getfield        #32  <Field LinkedTreeMap$Node LinkedTreeMap$Node.next>
	//   10   20:putfield        #33  <Field LinkedTreeMap$Node next>
		lastReturned = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #35  <Field LinkedTreeMap$Node lastReturned>
		expectedModCount = modCount;
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #22  <Field LinkedTreeMap this$0>
	//   17   33:getfield        #38  <Field int LinkedTreeMap.modCount>
	//   18   36:putfield        #40  <Field int expectedModCount>
	//   19   39:return          
	}
}
