// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.view.View;

// Referenced classes of package android.support.design.widget:
//			Snackbar

class Snackbar$1
	implements android.view.kListener
{

	public void onClick(View view)
	{
		a.onClick(view);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field android.view.View$OnClickListener a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #28  <Method void android.view.View$OnClickListener.onClick(View)>
		b.b(1);
	//    4   10:aload_0         
	//    5   11:getfield        #18  <Field Snackbar b>
	//    6   14:iconst_1        
	//    7   15:invokevirtual   #31  <Method void Snackbar.b(int)>
	//    8   18:return          
	}

	final android.view.kListener a;
	final Snackbar b;

	Snackbar$1(Snackbar snackbar, android.view.kListener klistener)
	{
		b = snackbar;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Snackbar b>
		a = klistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field android.view.View$OnClickListener a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
