// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b;

import java.lang.reflect.Method;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b:
//			k

static final class k$1 extends k
{

	public Object a(Class class1)
		throws Exception
	{
		return a.invoke(b, new Object[] {
			class1
		});
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Method a>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field Object b>
	//    4    8:iconst_1        
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:invokevirtual   #31  <Method Object Method.invoke(Object, Object[])>
	//   11   19:areturn         
	}

	final Method a;
	final Object b;

	k$1(Method method, Object obj)
	{
		a = method;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field Method a>
		b = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field Object b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void k()>
	//    8   14:return          
	}
}
