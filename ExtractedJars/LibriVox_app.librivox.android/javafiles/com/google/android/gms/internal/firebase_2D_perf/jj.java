// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			ja, e, jd

public abstract class jj extends ja
	implements Set
{

	jj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void ja()>
	//    2    4:return          
	}

	public jd b()
	{
		jd jd2 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field jd a>
	//    2    4:astore_2        
		jd jd1 = jd2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(jd2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       21
		{
			jd1 = f();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #21  <Method jd f()>
	//    9   15:astore_1        
			a = jd1;
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:putfield        #18  <Field jd a>
		}
		return jd1;
	//   13   21:aload_1         
	//   14   22:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		else
			return e.a(((Set) (this)), obj);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokestatic    #28  <Method boolean e.a(Set, Object)>
	//    8   12:ireturn         
	}

	jd f()
	{
		return jd.a(((ja)this).toArray());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method Object[] ja.toArray()>
	//    2    4:invokestatic    #38  <Method jd jd.a(Object[])>
	//    3    7:areturn         
	}

	public int hashCode()
	{
		return e.a(((Set) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #43  <Method int e.a(Set)>
	//    2    4:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (((ja)this).a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method f ja.a()>
	//    2    4:areturn         
	}

	private transient jd a;
}
