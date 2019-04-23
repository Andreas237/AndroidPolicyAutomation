// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			fm, hr, hq, di

public final class hp extends AbstractList
	implements fm, RandomAccess
{

	public hp(fm fm1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void AbstractList()>
		a = fm1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field fm a>
	//    5    9:return          
	}

	static fm a(hp hp1)
	{
		return hp1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field fm a>
	//    2    4:areturn         
	}

	public final Object a(int i)
	{
		return a.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field fm a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #22  <Method Object fm.a(int)>
	//    4   10:areturn         
	}

	public final void a(di di)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #25  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final List d()
	{
		return a.d();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field fm a>
	//    2    4:invokeinterface #30  <Method List fm.d()>
	//    3    9:areturn         
	}

	public final fm e()
	{
		return ((fm) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final Object get(int i)
	{
		return ((Object) ((String)a.get(i)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field fm a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #35  <Method Object fm.get(int)>
	//    4   10:checkcast       #37  <Class String>
	//    5   13:areturn         
	}

	public final Iterator iterator()
	{
		return ((Iterator) (new hr(this)));
	//    0    0:new             #41  <Class hr>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #44  <Method void hr(hp)>
	//    4    8:areturn         
	}

	public final ListIterator listIterator(int i)
	{
		return ((ListIterator) (new hq(this, i)));
	//    0    0:new             #48  <Class hq>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #51  <Method void hq(hp, int)>
	//    5    9:areturn         
	}

	public final int size()
	{
		return a.size();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field fm a>
	//    2    4:invokeinterface #55  <Method int fm.size()>
	//    3    9:ireturn         
	}

	private final fm a;
}
