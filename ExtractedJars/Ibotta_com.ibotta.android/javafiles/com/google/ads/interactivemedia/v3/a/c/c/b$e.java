// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.c.c;

import com.google.ads.interactivemedia.v3.a.f.m;

// Referenced classes of package com.google.ads.interactivemedia.v3.a.c.c:
//			b

static final class b$e
	implements b$c
{

	public int a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int b>
	//    2    4:ireturn         
	}

	public int b()
	{
		int j = a;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int a>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            19
			i = c.s();
	//    7   11:aload_0         
	//    8   12:getfield        #26  <Field m c>
	//    9   15:invokevirtual   #35  <Method int m.s()>
	//   10   18:istore_1        
		return i;
	//   11   19:iload_1         
	//   12   20:ireturn         
	}

	public boolean c()
	{
		return a != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int a>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private final int a;
	private final int b;
	private final m c;

	public b$e(a$b a$b1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		c = a$b1.aP;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #24  <Field m a$b.aP>
	//    5    9:putfield        #26  <Field m c>
		c.c(12);
	//    6   12:aload_0         
	//    7   13:getfield        #26  <Field m c>
	//    8   16:bipush          12
	//    9   18:invokevirtual   #31  <Method void m.c(int)>
		a = c.s();
	//   10   21:aload_0         
	//   11   22:aload_0         
	//   12   23:getfield        #26  <Field m c>
	//   13   26:invokevirtual   #35  <Method int m.s()>
	//   14   29:putfield        #37  <Field int a>
		b = c.s();
	//   15   32:aload_0         
	//   16   33:aload_0         
	//   17   34:getfield        #26  <Field m c>
	//   18   37:invokevirtual   #35  <Method int m.s()>
	//   19   40:putfield        #39  <Field int b>
	//   20   43:return          
	}
}
