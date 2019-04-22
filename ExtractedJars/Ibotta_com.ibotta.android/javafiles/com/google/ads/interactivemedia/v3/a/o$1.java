// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a;


// Referenced classes of package com.google.ads.interactivemedia.v3.a:
//			o

class o$1
	implements Runnable
{

	public void run()
	{
		o.a(e).a(a, b, c, d);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field o e>
	//    2    4:invokestatic    #37  <Method o$a o.a(o)>
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field int a>
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field int b>
	//    7   15:aload_0         
	//    8   16:getfield        #28  <Field int c>
	//    9   19:aload_0         
	//   10   20:getfield        #30  <Field float d>
	//   11   23:invokeinterface #42  <Method void o$a.a(int, int, int, float)>
	//   12   28:return          
	}

	final int a;
	final int b;
	final int c;
	final float d;
	final o e;

	o$1(o o1, int i, int j, int k, float f)
	{
		e = o1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field o e>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #24  <Field int a>
		b = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #26  <Field int b>
		c = k;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #28  <Field int c>
		d = f;
	//   12   21:aload_0         
	//   13   22:fload           5
	//   14   24:putfield        #30  <Field float d>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #32  <Method void Object()>
	//   17   31:return          
	}
}
