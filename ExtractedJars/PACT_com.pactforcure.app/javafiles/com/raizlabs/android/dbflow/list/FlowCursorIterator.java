// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.list;

import android.database.Cursor;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

// Referenced classes of package com.raizlabs.android.dbflow.list:
//			IFlowCursorIterator

public class FlowCursorIterator
	implements ListIterator
{

	public FlowCursorIterator(IFlowCursorIterator iflowcursoriterator)
	{
		this(iflowcursoriterator, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #18  <Method void FlowCursorIterator(IFlowCursorIterator, int)>
	//    4    6:return          
	}

	public FlowCursorIterator(IFlowCursorIterator iflowcursoriterator, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		cursorList = iflowcursoriterator;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field IFlowCursorIterator cursorList>
		iflowcursoriterator = ((IFlowCursorIterator) (iflowcursoriterator.cursor()));
	//    5    9:aload_1         
	//    6   10:invokeinterface #32  <Method Cursor IFlowCursorIterator.cursor()>
	//    7   15:astore_1        
		if(iflowcursoriterator != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          69
		{
			((Cursor) (iflowcursoriterator)).moveToPosition(i - 1);
	//   10   20:aload_1         
	//   11   21:iload_2         
	//   12   22:iconst_1        
	//   13   23:isub            
	//   14   24:invokeinterface #38  <Method boolean Cursor.moveToPosition(int)>
	//   15   29:pop             
			int j = ((Cursor) (iflowcursoriterator)).getCount();
	//   16   30:aload_1         
	//   17   31:invokeinterface #42  <Method int Cursor.getCount()>
	//   18   36:istore_3        
			startingCount = j;
	//   19   37:aload_0         
	//   20   38:iload_3         
	//   21   39:putfield        #44  <Field int startingCount>
			reverseIndex = j;
	//   22   42:aload_0         
	//   23   43:iload_3         
	//   24   44:putfield        #46  <Field int reverseIndex>
			reverseIndex = reverseIndex - i;
	//   25   47:aload_0         
	//   26   48:aload_0         
	//   27   49:getfield        #46  <Field int reverseIndex>
	//   28   52:iload_2         
	//   29   53:isub            
	//   30   54:putfield        #46  <Field int reverseIndex>
			if(reverseIndex < 0)
	//*  31   57:aload_0         
	//*  32   58:getfield        #46  <Field int reverseIndex>
	//*  33   61:ifge            69
				reverseIndex = 0;
	//   34   64:aload_0         
	//   35   65:iconst_0        
	//   36   66:putfield        #46  <Field int reverseIndex>
		}
	//   37   69:return          
	}

	private void checkSizes()
	{
		if(startingCount != cursorList.getCount())
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int startingCount>
	//*   2    4:aload_0         
	//*   3    5:getfield        #26  <Field IFlowCursorIterator cursorList>
	//*   4    8:invokeinterface #49  <Method int IFlowCursorIterator.getCount()>
	//*   5   13:icmpeq          26
			throw new ConcurrentModificationException("Cannot change Cursor data during iteration.");
	//    6   16:new             #51  <Class ConcurrentModificationException>
	//    7   19:dup             
	//    8   20:ldc1            #53  <String "Cannot change Cursor data during iteration.">
	//    9   22:invokespecial   #56  <Method void ConcurrentModificationException(String)>
	//   10   25:athrow          
		else
			return;
	//   11   26:return          
	}

	public void add(Object obj)
	{
		throw new UnsupportedOperationException("Cursor Iterator: Cannot add a model in the iterator");
	//    0    0:new             #60  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #62  <String "Cursor Iterator: Cannot add a model in the iterator">
	//    3    6:invokespecial   #63  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public boolean hasNext()
	{
		checkSizes();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void checkSizes()>
		return reverseIndex > 0;
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field int reverseIndex>
	//    4    8:ifle            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public boolean hasPrevious()
	{
		checkSizes();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void checkSizes()>
		return reverseIndex < cursorList.getCount();
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field int reverseIndex>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field IFlowCursorIterator cursorList>
	//    6   12:invokeinterface #49  <Method int IFlowCursorIterator.getCount()>
	//    7   17:icmpge          22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public Object next()
	{
		checkSizes();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void checkSizes()>
		Object obj = cursorList.getItem(cursorList.getCount() - reverseIndex);
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field IFlowCursorIterator cursorList>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field IFlowCursorIterator cursorList>
	//    6   12:invokeinterface #49  <Method int IFlowCursorIterator.getCount()>
	//    7   17:aload_0         
	//    8   18:getfield        #46  <Field int reverseIndex>
	//    9   21:isub            
	//   10   22:i2l             
	//   11   23:invokeinterface #75  <Method Object IFlowCursorIterator.getItem(long)>
	//   12   28:astore_1        
		reverseIndex = reverseIndex - 1;
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:getfield        #46  <Field int reverseIndex>
	//   16   34:iconst_1        
	//   17   35:isub            
	//   18   36:putfield        #46  <Field int reverseIndex>
		return obj;
	//   19   39:aload_1         
	//   20   40:areturn         
	}

	public int nextIndex()
	{
		return reverseIndex + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int reverseIndex>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public Object previous()
	{
		checkSizes();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void checkSizes()>
		Object obj = cursorList.getItem(cursorList.getCount() - reverseIndex);
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field IFlowCursorIterator cursorList>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field IFlowCursorIterator cursorList>
	//    6   12:invokeinterface #49  <Method int IFlowCursorIterator.getCount()>
	//    7   17:aload_0         
	//    8   18:getfield        #46  <Field int reverseIndex>
	//    9   21:isub            
	//   10   22:i2l             
	//   11   23:invokeinterface #75  <Method Object IFlowCursorIterator.getItem(long)>
	//   12   28:astore_1        
		reverseIndex = reverseIndex + 1;
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:getfield        #46  <Field int reverseIndex>
	//   16   34:iconst_1        
	//   17   35:iadd            
	//   18   36:putfield        #46  <Field int reverseIndex>
		return obj;
	//   19   39:aload_1         
	//   20   40:areturn         
	}

	public int previousIndex()
	{
		return reverseIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int reverseIndex>
	//    2    4:ireturn         
	}

	public void remove()
	{
		throw new UnsupportedOperationException("Cursor Iterator: cannot remove from an active Iterator ");
	//    0    0:new             #60  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #82  <String "Cursor Iterator: cannot remove from an active Iterator ">
	//    3    6:invokespecial   #63  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void set(Object obj)
	{
		throw new UnsupportedOperationException("Cursor Iterator: cannot set on an active Iterator ");
	//    0    0:new             #60  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #85  <String "Cursor Iterator: cannot set on an active Iterator ">
	//    3    6:invokespecial   #63  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	private final IFlowCursorIterator cursorList;
	private int reverseIndex;
	private int startingCount;
}
