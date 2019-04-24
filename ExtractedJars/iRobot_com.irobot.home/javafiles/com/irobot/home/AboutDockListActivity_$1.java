// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;


// Referenced classes of package com.irobot.home:
//			AboutDockListActivity_

class AboutDockListActivity_$1
	implements Runnable
{

	public void run()
	{
		AboutDockListActivity_.a(c, a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AboutDockListActivity_ c>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field String a>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field String b>
	//    6   12:invokestatic    #30  <Method void AboutDockListActivity_.a(AboutDockListActivity_, String, String)>
	//    7   15:return          
	}

	final String a;
	final String b;
	final AboutDockListActivity_ c;

	AboutDockListActivity_$1(AboutDockListActivity_ aboutdocklistactivity_, String s, String s1)
	{
		c = aboutdocklistactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AboutDockListActivity_ c>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String a>
		b = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field String b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void Object()>
	//   11   19:return          
	}
}
