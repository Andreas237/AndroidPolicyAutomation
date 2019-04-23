// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.ListIterator;

// Referenced classes of package com.google.android.gms.internal.ads:
//			avi, atd

final class avj
	implements ListIterator
{

	avj(avi avi1, int i)
	{
		c = avi1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field avi c>
		b = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #18  <Field int b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void Object()>
		a = avi.a(c).listIterator(b);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #16  <Field avi c>
	//   11   19:invokestatic    #26  <Method atd avi.a(avi)>
	//   12   22:aload_0         
	//   13   23:getfield        #18  <Field int b>
	//   14   26:invokeinterface #32  <Method ListIterator atd.listIterator(int)>
	//   15   31:putfield        #34  <Field ListIterator a>
	//   16   34:return          
	}

	public final void add(Object obj)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #39  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final boolean hasNext()
	{
		return a.hasNext();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ListIterator a>
	//    2    4:invokeinterface #44  <Method boolean ListIterator.hasNext()>
	//    3    9:ireturn         
	}

	public final boolean hasPrevious()
	{
		return a.hasPrevious();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ListIterator a>
	//    2    4:invokeinterface #47  <Method boolean ListIterator.hasPrevious()>
	//    3    9:ireturn         
	}

	public final Object next()
	{
		return ((Object) ((String)a.next()));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ListIterator a>
	//    2    4:invokeinterface #51  <Method Object ListIterator.next()>
	//    3    9:checkcast       #53  <Class String>
	//    4   12:areturn         
	}

	public final int nextIndex()
	{
		return a.nextIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ListIterator a>
	//    2    4:invokeinterface #57  <Method int ListIterator.nextIndex()>
	//    3    9:ireturn         
	}

	public final Object previous()
	{
		return ((Object) ((String)a.previous()));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ListIterator a>
	//    2    4:invokeinterface #60  <Method Object ListIterator.previous()>
	//    3    9:checkcast       #53  <Class String>
	//    4   12:areturn         
	}

	public final int previousIndex()
	{
		return a.previousIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ListIterator a>
	//    2    4:invokeinterface #63  <Method int ListIterator.previousIndex()>
	//    3    9:ireturn         
	}

	public final void remove()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #39  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final void set(Object obj)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #39  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private ListIterator a;
	private final int b;
	private final avi c;
}
