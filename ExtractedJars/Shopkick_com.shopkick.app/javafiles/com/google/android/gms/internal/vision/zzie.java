// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzie
	implements Iterator
{

	zzie()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
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
	//    0    0:new             #18  <Class NoSuchElementException>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void NoSuchElementException()>
	//    3    7:athrow          
	}

	public final void remove()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #22  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}
}
