// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.View;

// Referenced classes of package com.irobot.home:
//			ContactTableViewActivity_

class ContactTableViewActivity_$5
	implements Runnable
{

	public void run()
	{
		ContactTableViewActivity_.a(d, a, b, c);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ContactTableViewActivity_ d>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field String a>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field View b>
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field View c>
	//    8   16:invokestatic    #34  <Method void ContactTableViewActivity_.a(ContactTableViewActivity_, String, View, View)>
	//    9   19:return          
	}

	final String a;
	final View b;
	final View c;
	final ContactTableViewActivity_ d;

	ContactTableViewActivity_$5(ContactTableViewActivity_ contacttableviewactivity_, String s, View view, View view1)
	{
		d = contacttableviewactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field ContactTableViewActivity_ d>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field String a>
		b = view;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field View b>
		c = view1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #27  <Field View c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #30  <Method void Object()>
	//   14   25:return          
	}
}
