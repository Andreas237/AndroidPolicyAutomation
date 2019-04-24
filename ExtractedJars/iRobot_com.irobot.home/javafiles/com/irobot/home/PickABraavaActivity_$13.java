// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;


// Referenced classes of package com.irobot.home:
//			PickABraavaActivity_

class PickABraavaActivity_$13
	implements Runnable
{

	public void run()
	{
		PickABraavaActivity_.a(g, a, b, c, d, e, f);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field PickABraavaActivity_ g>
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field int a>
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field String b>
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field boolean c>
	//    8   16:aload_0         
	//    9   17:getfield        #34  <Field boolean d>
	//   10   20:aload_0         
	//   11   21:getfield        #36  <Field com.irobot.home.g.a$a e>
	//   12   24:aload_0         
	//   13   25:getfield        #38  <Field String f>
	//   14   28:invokestatic    #45  <Method void PickABraavaActivity_.a(PickABraavaActivity_, int, String, boolean, boolean, com.irobot.home.g.a$a, String)>
	//   15   31:return          
	}

	final int a;
	final String b;
	final boolean c;
	final boolean d;
	final com.irobot.home.g.a.a e;
	final String f;
	final PickABraavaActivity_ g;

	PickABraavaActivity_$13(PickABraavaActivity_ pickabraavaactivity_, int i, String s, boolean flag, boolean flag1, com.irobot.home.g.a.a a1, String s1)
	{
		g = pickabraavaactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field PickABraavaActivity_ g>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #28  <Field int a>
		b = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field String b>
		c = flag;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #32  <Field boolean c>
		d = flag1;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #34  <Field boolean d>
		e = a1;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #36  <Field com.irobot.home.g.a$a e>
		f = s1;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #38  <Field String f>
		super();
	//   21   39:aload_0         
	//   22   40:invokespecial   #41  <Method void Object()>
	//   23   43:return          
	}
}
