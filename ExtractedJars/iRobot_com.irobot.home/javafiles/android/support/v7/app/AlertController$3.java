// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.View;

// Referenced classes of package android.support.v7.app:
//			AlertController

class AlertController$3
	implements Runnable
{

	public void run()
	{
		AlertController.a(((View) (c.i)), a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AlertController c>
	//    2    4:getfield        #32  <Field android.support.v4.widget.NestedScrollView AlertController.i>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field View a>
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field View b>
	//    7   15:invokestatic    #35  <Method void AlertController.a(View, View, View)>
	//    8   18:return          
	}

	final View a;
	final View b;
	final AlertController c;

	AlertController$3(AlertController alertcontroller, View view, View view1)
	{
		c = alertcontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AlertController c>
		a = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field View a>
		b = view1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field View b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void Object()>
	//   11   19:return          
	}
}
