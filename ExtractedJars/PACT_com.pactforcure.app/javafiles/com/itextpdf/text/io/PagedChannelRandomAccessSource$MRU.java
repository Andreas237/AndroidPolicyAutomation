// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.io;

import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.itextpdf.text.io:
//			PagedChannelRandomAccessSource

private static class PagedChannelRandomAccessSource$MRU
{

	public Object enqueue(Object obj)
	{
		if(queue.size() <= 0 || queue.getFirst() != obj)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field LinkedList queue>
	//*   2    4:invokevirtual   #32  <Method int LinkedList.size()>
	//*   3    7:ifle            23
	//*   4   10:aload_0         
	//*   5   11:getfield        #23  <Field LinkedList queue>
	//*   6   14:invokevirtual   #36  <Method Object LinkedList.getFirst()>
	//*   7   17:aload_1         
	//*   8   18:if_acmpne       23
	//*   9   21:aconst_null     
	//*  10   22:areturn         
		{
			for(Iterator iterator = queue.iterator(); iterator.hasNext();)
	//*  11   23:aload_0         
	//*  12   24:getfield        #23  <Field LinkedList queue>
	//*  13   27:invokevirtual   #40  <Method Iterator LinkedList.iterator()>
	//*  14   30:astore_2        
	//*  15   31:aload_2         
	//*  16   32:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//*  17   37:ifeq            66
				if(obj == iterator.next())
	//*  18   40:aload_1         
	//*  19   41:aload_2         
	//*  20   42:invokeinterface #49  <Method Object Iterator.next()>
	//*  21   47:if_acmpne       31
				{
					iterator.remove();
	//   22   50:aload_2         
	//   23   51:invokeinterface #52  <Method void Iterator.remove()>
					queue.addFirst(obj);
	//   24   56:aload_0         
	//   25   57:getfield        #23  <Field LinkedList queue>
	//   26   60:aload_1         
	//   27   61:invokevirtual   #56  <Method void LinkedList.addFirst(Object)>
					return ((Object) (null));
	//   28   64:aconst_null     
	//   29   65:areturn         
				}

			queue.addFirst(obj);
	//   30   66:aload_0         
	//   31   67:getfield        #23  <Field LinkedList queue>
	//   32   70:aload_1         
	//   33   71:invokevirtual   #56  <Method void LinkedList.addFirst(Object)>
			if(queue.size() > limit)
	//*  34   74:aload_0         
	//*  35   75:getfield        #23  <Field LinkedList queue>
	//*  36   78:invokevirtual   #32  <Method int LinkedList.size()>
	//*  37   81:aload_0         
	//*  38   82:getfield        #25  <Field int limit>
	//*  39   85:icmple          21
				return queue.removeLast();
	//   40   88:aload_0         
	//   41   89:getfield        #23  <Field LinkedList queue>
	//   42   92:invokevirtual   #59  <Method Object LinkedList.removeLast()>
	//   43   95:areturn         
		}
		return ((Object) (null));
	}

	private final int limit;
	private LinkedList queue;

	public PagedChannelRandomAccessSource$MRU(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		queue = new LinkedList();
	//    2    4:aload_0         
	//    3    5:new             #20  <Class LinkedList>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void LinkedList()>
	//    6   12:putfield        #23  <Field LinkedList queue>
		limit = i;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #25  <Field int limit>
	//   10   20:return          
	}
}
