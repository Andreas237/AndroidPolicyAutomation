// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			jd, dx, ja

final class jg extends jd
{

	jg(jd jd1, int i, int j)
	{
		c = jd1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field jd c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void jd()>
		a = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #18  <Field int a>
		b = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #20  <Field int b>
	//   11   19:return          
	}

	public final jd a(int i, int j)
	{
		dx.a(i, j, b);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:aload_0         
	//    3    3:getfield        #20  <Field int b>
	//    4    6:invokestatic    #27  <Method void dx.a(int, int, int)>
		jd jd1 = c;
	//    5    9:aload_0         
	//    6   10:getfield        #13  <Field jd c>
	//    7   13:astore          4
		int k = a;
	//    8   15:aload_0         
	//    9   16:getfield        #18  <Field int a>
	//   10   19:istore_3        
		return (jd)jd1.subList(i + k, j + k);
	//   11   20:aload           4
	//   12   22:iload_1         
	//   13   23:iload_3         
	//   14   24:iadd            
	//   15   25:iload_2         
	//   16   26:iload_3         
	//   17   27:iadd            
	//   18   28:invokevirtual   #31  <Method List jd.subList(int, int)>
	//   19   31:checkcast       #4   <Class jd>
	//   20   34:areturn         
	}

	final Object[] c()
	{
		return ((ja) (c)).c();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field jd c>
	//    2    4:invokevirtual   #36  <Method Object[] ja.c()>
	//    3    7:areturn         
	}

	final int d()
	{
		return ((ja) (c)).d() + a;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field jd c>
	//    2    4:invokevirtual   #40  <Method int ja.d()>
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field int a>
	//    5   11:iadd            
	//    6   12:ireturn         
	}

	final int e()
	{
		return ((ja) (c)).d() + a + b;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field jd c>
	//    2    4:invokevirtual   #40  <Method int ja.d()>
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field int a>
	//    5   11:iadd            
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field int b>
	//    8   16:iadd            
	//    9   17:ireturn         
	}

	public final Object get(int i)
	{
		dx.a(i, b);
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field int b>
	//    3    5:invokestatic    #46  <Method int dx.a(int, int)>
	//    4    8:pop             
		return c.get(i + a);
	//    5    9:aload_0         
	//    6   10:getfield        #13  <Field jd c>
	//    7   13:iload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #18  <Field int a>
	//   10   18:iadd            
	//   11   19:invokevirtual   #48  <Method Object jd.get(int)>
	//   12   22:areturn         
	}

	public final int size()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int b>
	//    2    4:ireturn         
	}

	public final List subList(int i, int j)
	{
		return ((List) (((jd)this).a(i, j)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #51  <Method jd jd.a(int, int)>
	//    4    6:areturn         
	}

	private final transient int a;
	private final transient int b;
	private final jd c;
}
