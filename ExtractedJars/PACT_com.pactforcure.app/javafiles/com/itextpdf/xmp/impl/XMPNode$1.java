// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import java.util.Iterator;

// Referenced classes of package com.itextpdf.xmp.impl:
//			XMPNode

class XMPNode$1
	implements Iterator
{

	public boolean hasNext()
	{
		return val$it.hasNext();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Iterator val$it>
	//    2    4:invokeinterface #29  <Method boolean Iterator.hasNext()>
	//    3    9:ireturn         
	}

	public Object next()
	{
		return val$it.next();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Iterator val$it>
	//    2    4:invokeinterface #33  <Method Object Iterator.next()>
	//    3    9:areturn         
	}

	public void remove()
	{
		throw new UnsupportedOperationException("remove() is not allowed due to the internal contraints");
	//    0    0:new             #36  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #38  <String "remove() is not allowed due to the internal contraints">
	//    3    6:invokespecial   #41  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	final XMPNode this$0;
	final Iterator val$it;

	XMPNode$1()
	{
		this$0 = final_xmpnode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field XMPNode this$0>
		val$it = Iterator.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Iterator val$it>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
