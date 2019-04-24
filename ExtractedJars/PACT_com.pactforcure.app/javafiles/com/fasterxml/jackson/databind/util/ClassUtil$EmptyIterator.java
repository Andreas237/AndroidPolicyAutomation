// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			ClassUtil

private static final class ClassUtil$EmptyIterator
	implements Iterator
{

	public boolean hasNext()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object next()
	{
		throw new NoSuchElementException();
	//    0    0:new             #23  <Class NoSuchElementException>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void NoSuchElementException()>
	//    3    7:athrow          
	}

	public void remove()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #29  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private ClassUtil$EmptyIterator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	ClassUtil$EmptyIterator(ClassUtil._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void ClassUtil$EmptyIterator()>
	//    2    4:return          
	}
}
