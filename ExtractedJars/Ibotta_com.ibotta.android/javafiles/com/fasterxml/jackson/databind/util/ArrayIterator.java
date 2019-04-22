// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator
	implements Iterable, Iterator
{

	public ArrayIterator(Object aobj[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		_a = aobj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Object[] _a>
		_index = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #23  <Field int _index>
	//    8   14:return          
	}

	public boolean hasNext()
	{
		return _index < _a.length;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int _index>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Object[] _a>
	//    4    8:arraylength     
	//    5    9:icmpge          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public Object next()
	{
		int i = _index;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int _index>
	//    2    4:istore_1        
		Object aobj[] = _a;
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field Object[] _a>
	//    5    9:astore_2        
		if(i < aobj.length)
	//*   6   10:iload_1         
	//*   7   11:aload_2         
	//*   8   12:arraylength     
	//*   9   13:icmpge          27
		{
			_index = i + 1;
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:iconst_1        
	//   13   19:iadd            
	//   14   20:putfield        #23  <Field int _index>
			return aobj[i];
	//   15   23:aload_2         
	//   16   24:iload_1         
	//   17   25:aaload          
	//   18   26:areturn         
		} else
		{
			throw new NoSuchElementException();
	//   19   27:new             #35  <Class NoSuchElementException>
	//   20   30:dup             
	//   21   31:invokespecial   #36  <Method void NoSuchElementException()>
	//   22   34:athrow          
		}
	}

	public void remove()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #40  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private final Object _a[];
	private int _index;
}
