// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;


// Referenced classes of package com.irobot.home.fragments:
//			ch

class ch$1
	implements Runnable
{

	public void run()
	{
		ch.a(a, ((android.widget.TextView) (a.k)), ((android.widget.TextView) (a.l)), a.p);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ch a>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field ch a>
	//    4    8:getfield        #25  <Field com.irobot.home.view.CustomTextView ch.k>
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field ch a>
	//    7   15:getfield        #28  <Field com.irobot.home.view.CustomTextView ch.l>
	//    8   18:aload_0         
	//    9   19:getfield        #17  <Field ch a>
	//   10   22:getfield        #32  <Field android.widget.ImageView ch.p>
	//   11   25:invokestatic    #35  <Method void ch.a(ch, android.widget.TextView, android.widget.TextView, android.widget.ImageView)>
	//   12   28:return          
	}

	final ch a;

	ch$1(ch ch1)
	{
		a = ch1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ch a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
