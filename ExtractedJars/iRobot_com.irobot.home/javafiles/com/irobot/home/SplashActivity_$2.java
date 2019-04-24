// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;


// Referenced classes of package com.irobot.home:
//			SplashActivity_

class SplashActivity_$2
	implements Runnable
{

	public void run()
	{
		SplashActivity_.a(e, a, b, c, d);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SplashActivity_ e>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field int a>
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field int b>
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field android.content.DialogInterface$OnClickListener c>
	//    8   16:aload_0         
	//    9   17:getfield        #31  <Field boolean d>
	//   10   20:invokestatic    #38  <Method void SplashActivity_.a(SplashActivity_, int, int, android.content.DialogInterface$OnClickListener, boolean)>
	//   11   23:return          
	}

	final int a;
	final int b;
	final android.content.ClickListener c;
	final boolean d;
	final SplashActivity_ e;

	SplashActivity_$2(SplashActivity_ splashactivity_, int i, int j, android.content.ClickListener clicklistener, boolean flag)
	{
		e = splashactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field SplashActivity_ e>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #25  <Field int a>
		b = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #27  <Field int b>
		c = clicklistener;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field android.content.DialogInterface$OnClickListener c>
		d = flag;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #31  <Field boolean d>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #34  <Method void Object()>
	//   17   31:return          
	}
}
