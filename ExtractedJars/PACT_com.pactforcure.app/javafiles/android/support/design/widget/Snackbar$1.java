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
		val$listener.onClick(view);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field android.view.View$OnClickListener val$listener>
	//    2    4:aload_1         
	//    3    5:invokeinterface #29  <Method void android.view.View$OnClickListener.onClick(View)>
		dispatchDismiss(1);
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field Snackbar this$0>
	//    6   14:iconst_1        
	//    7   15:invokevirtual   #33  <Method void Snackbar.dispatchDismiss(int)>
	//    8   18:return          
	}

	final Snackbar this$0;
	final android.view.kListener val$listener;

	Snackbar$1()
	{
		this$0 = final_snackbar;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Snackbar this$0>
		val$listener = android.view.kListener.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field android.view.View$OnClickListener val$listener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
