// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator
	implements Iterator, Iterable
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
		if(_index >= _a.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field int _index>
	//*   2    4:aload_0         
	//*   3    5:getfield        #21  <Field Object[] _a>
	//*   4    8:arraylength     
	//*   5    9:icmplt          20
		{
			throw new NoSuchElementException();
	//    6   12:new             #35  <Class NoSuchElementException>
	//    7   15:dup             
	//    8   16:invokespecial   #36  <Method void NoSuchElementException()>
	//    9   19:athrow          
		} else
		{
			Object aobj[] = _a;
	//   10   20:aload_0         
	//   11   21:getfield        #21  <Field Object[] _a>
	//   12   24:astore_2        
			int i = _index;
	//   13   25:aload_0         
	//   14   26:getfield        #23  <Field int _index>
	//   15   29:istore_1        
			_index = i + 1;
	//   16   30:aload_0         
	//   17   31:iload_1         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:putfield        #23  <Field int _index>
			return aobj[i];
	//   21   37:aload_2         
	//   22   38:iload_1         
	//   23   39:aaload          
	//   24   40:areturn         
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
