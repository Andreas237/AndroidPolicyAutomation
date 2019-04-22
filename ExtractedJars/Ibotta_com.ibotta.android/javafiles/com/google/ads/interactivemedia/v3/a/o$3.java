// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a;


// Referenced classes of package com.google.ads.interactivemedia.v3.a:
//			o

class o$3
	implements Runnable
{

	public void run()
	{
		o.a(c).a(a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field o c>
	//    2    4:invokestatic    #32  <Method o$a o.a(o)>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field int a>
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field long b>
	//    7   15:invokeinterface #37  <Method void o$a.a(int, long)>
	//    8   20:return          
	}

	final int a;
	final long b;
	final o c;

	o$3(o o1, int i, long l)
	{
		c = o1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field o c>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #23  <Field int a>
		b = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #25  <Field long b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
