// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class auv
	implements Iterator
{

	auv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final boolean hasNext()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final Object next()
	{
		throw new NoSuchElementException();
	//    0    0:new             #17  <Class NoSuchElementException>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void NoSuchElementException()>
	//    3    7:athrow          
	}

	public final void remove()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #21  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}
}
