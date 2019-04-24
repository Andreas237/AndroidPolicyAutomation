// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon.adinformation;

import android.view.ViewGroup;
import android.widget.RelativeLayout;

// Referenced classes of package com.startapp.android.publish.adsCommon.adinformation:
//			b

class b$5
	implements Runnable
{

	public void run()
	{
		c.c.addView(((android.view.View) (a)), ((android.view.Group.LayoutParams) (b)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field b c>
	//    2    4:getfield        #32  <Field RelativeLayout b.c>
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field ViewGroup a>
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field android.widget.RelativeLayout$LayoutParams b>
	//    7   15:invokevirtual   #38  <Method void RelativeLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
	//    8   18:return          
	}

	final ViewGroup a;
	final android.widget.tiveLayout.LayoutParams b;
	final b c;

	b$5(b b1, ViewGroup viewgroup, android.widget.tiveLayout.LayoutParams layoutparams)
	{
		c = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field b c>
		a = viewgroup;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field ViewGroup a>
		b = layoutparams;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field android.widget.RelativeLayout$LayoutParams b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
