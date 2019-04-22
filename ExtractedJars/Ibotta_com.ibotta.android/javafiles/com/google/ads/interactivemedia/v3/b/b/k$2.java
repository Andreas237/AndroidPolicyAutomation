// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b;

import java.lang.reflect.Method;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b:
//			k

static final class k$2 extends k
{

	public Object a(Class class1)
		throws Exception
	{
		return a.invoke(((Object) (null)), new Object[] {
			class1, Integer.valueOf(b)
		});
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Method a>
	//    2    4:aconst_null     
	//    3    5:iconst_2        
	//    4    6:anewarray       Object[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:aastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:aload_0         
	//   12   16:getfield        #16  <Field int b>
	//   13   19:invokestatic    #31  <Method Integer Integer.valueOf(int)>
	//   14   22:aastore         
	//   15   23:invokevirtual   #37  <Method Object Method.invoke(Object, Object[])>
	//   16   26:areturn         
	}

	final Method a;
	final int b;

	k$2(Method method, int i)
	{
		a = method;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field Method a>
		b = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #16  <Field int b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void k()>
	//    8   14:return          
	}
}
