// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video;


// Referenced classes of package com.startapp.android.publish.ads.video:
//			d

class d$3
	implements c$a
{

	public void a(String s)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field c$a a>
	//*   2    4:ifnull          17
			a.a(s);
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field c$a a>
	//    5   11:aload_1         
	//    6   12:invokeinterface #27  <Method void c$a.a(String)>
	//    7   17:return          
	}

	final c$a a;
	final d b;

	d$3(d d1, c$a c$a1)
	{
		b = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field d b>
		a = c$a1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field c$a a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
