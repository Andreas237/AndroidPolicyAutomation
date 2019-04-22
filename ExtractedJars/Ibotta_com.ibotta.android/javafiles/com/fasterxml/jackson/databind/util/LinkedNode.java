// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;


public final class LinkedNode
{

	public LinkedNode(Object obj, LinkedNode linkednode)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		value = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Object value>
		next = linkednode;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field LinkedNode next>
	//    8   14:return          
	}

	public static boolean contains(LinkedNode linkednode, Object obj)
	{
		for(; linkednode != null; linkednode = linkednode.next())
	//*   0    0:aload_0         
	//*   1    1:ifnull          22
			if(linkednode.value() == obj)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #28  <Method Object value()>
	//*   4    8:aload_1         
	//*   5    9:if_acmpne       14
				return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         

	//    8   14:aload_0         
	//    9   15:invokevirtual   #31  <Method LinkedNode next()>
	//   10   18:astore_0        
	//*  11   19:goto            0
		return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	public void linkNext(LinkedNode linkednode)
	{
		if(next == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field LinkedNode next>
	//*   2    4:ifnonnull       13
		{
			next = linkednode;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #20  <Field LinkedNode next>
			return;
	//    6   12:return          
		} else
		{
			throw new IllegalStateException();
	//    7   13:new             #36  <Class IllegalStateException>
	//    8   16:dup             
	//    9   17:invokespecial   #37  <Method void IllegalStateException()>
	//   10   20:athrow          
		}
	}

	public LinkedNode next()
	{
		return next;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field LinkedNode next>
	//    2    4:areturn         
	}

	public Object value()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object value>
	//    2    4:areturn         
	}

	private LinkedNode next;
	private final Object value;
}
