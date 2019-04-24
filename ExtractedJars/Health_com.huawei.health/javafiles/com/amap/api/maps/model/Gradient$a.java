// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;


// Referenced classes of package com.amap.api.maps.model:
//			Gradient

static class Gradient$a
{

	static float a(Gradient$a gradient$a)
	{
		return gradient$a.c;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field float c>
	//    2    4:freturn         
	}

	static int b(Gradient$a gradient$a)
	{
		return gradient$a.a;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int a>
	//    2    4:ireturn         
	}

	static int c(Gradient$a gradient$a)
	{
		return gradient$a.b;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int b>
	//    2    4:ireturn         
	}

	private final int a;
	private final int b;
	private final float c;

	private Gradient$a(int i, int j, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field int a>
		b = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field int b>
		c = f;
	//    8   14:aload_0         
	//    9   15:fload_3         
	//   10   16:putfield        #22  <Field float c>
	//   11   19:return          
	}

	Gradient$a(int i, int j, float f, Gradient$1 gradient$1)
	{
		this(i, j, f);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:fload_3         
	//    4    4:invokespecial   #26  <Method void Gradient$a(int, int, float)>
	//    5    7:return          
	}
}
