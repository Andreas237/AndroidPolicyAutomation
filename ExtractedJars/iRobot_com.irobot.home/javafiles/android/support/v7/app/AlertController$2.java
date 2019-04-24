// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.widget.NestedScrollView;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			AlertController

class AlertController$2
	implements android.support.v4.widget.
{

	public void a(NestedScrollView nestedscrollview, int i, int j, int k, int l)
	{
		AlertController.a(((View) (nestedscrollview)), a, b);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field View a>
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field View b>
	//    5    9:invokestatic    #31  <Method void AlertController.a(View, View, View)>
	//    6   12:return          
	}

	final View a;
	final View b;
	final AlertController c;

	AlertController$2(AlertController alertcontroller, View view, View view1)
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
