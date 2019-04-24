// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;


// Referenced classes of package com.irobot.home:
//			SplashActivity_

class SplashActivity_$3
	implements Runnable
{

	public void run()
	{
		SplashActivity_.a(d, a, b, c);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SplashActivity_ d>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field String a>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field String b>
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field boolean c>
	//    8   16:invokestatic    #34  <Method void SplashActivity_.a(SplashActivity_, String, String, boolean)>
	//    9   19:return          
	}

	final String a;
	final String b;
	final boolean c;
	final SplashActivity_ d;

	SplashActivity_$3(SplashActivity_ splashactivity_, String s, String s1, boolean flag)
	{
		d = splashactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field SplashActivity_ d>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field String a>
		b = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field String b>
		c = flag;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #27  <Field boolean c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #30  <Method void Object()>
	//   14   25:return          
	}
}
