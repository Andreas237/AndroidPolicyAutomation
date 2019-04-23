// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			atd, avk, avj, aqq

public final class avi extends AbstractList
	implements atd, RandomAccess
{

	public avi(atd atd1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void AbstractList()>
		a = atd1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field atd a>
	//    5    9:return          
	}

	static atd a(avi avi1)
	{
		return avi1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field atd a>
	//    2    4:areturn         
	}

	public final void a(aqq aqq)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #22  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final Object b(int i)
	{
		return a.b(i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field atd a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #27  <Method Object atd.b(int)>
	//    4   10:areturn         
	}

	public final List d()
	{
		return a.d();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field atd a>
	//    2    4:invokeinterface #31  <Method List atd.d()>
	//    3    9:areturn         
	}

	public final atd e()
	{
		return ((atd) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final Object get(int i)
	{
		return ((Object) ((String)a.get(i)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field atd a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #36  <Method Object atd.get(int)>
	//    4   10:checkcast       #38  <Class String>
	//    5   13:areturn         
	}

	public final Iterator iterator()
	{
		return ((Iterator) (new avk(this)));
	//    0    0:new             #42  <Class avk>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #45  <Method void avk(avi)>
	//    4    8:areturn         
	}

	public final ListIterator listIterator(int i)
	{
		return ((ListIterator) (new avj(this, i)));
	//    0    0:new             #49  <Class avj>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #52  <Method void avj(avi, int)>
	//    5    9:areturn         
	}

	public final int size()
	{
		return a.size();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field atd a>
	//    2    4:invokeinterface #56  <Method int atd.size()>
	//    3    9:ireturn         
	}

	private final atd a;
}
