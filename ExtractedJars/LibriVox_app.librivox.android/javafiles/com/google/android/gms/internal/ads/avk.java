// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.ads:
//			avi, atd

final class avk
	implements Iterator
{

	avk(avi avi1)
	{
		b = avi1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field avi b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
		a = avi.a(b).iterator();
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #14  <Field avi b>
	//    8   14:invokestatic    #22  <Method atd avi.a(avi)>
	//    9   17:invokeinterface #28  <Method Iterator atd.iterator()>
	//   10   22:putfield        #30  <Field Iterator a>
	//   11   25:return          
	}

	public final boolean hasNext()
	{
		return a.hasNext();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Iterator a>
	//    2    4:invokeinterface #35  <Method boolean Iterator.hasNext()>
	//    3    9:ireturn         
	}

	public final Object next()
	{
		return ((Object) ((String)a.next()));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Iterator a>
	//    2    4:invokeinterface #39  <Method Object Iterator.next()>
	//    3    9:checkcast       #41  <Class String>
	//    4   12:areturn         
	}

	public final void remove()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #44  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private Iterator a;
	private final avi b;
}
