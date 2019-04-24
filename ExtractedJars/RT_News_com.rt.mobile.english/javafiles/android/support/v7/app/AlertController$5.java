// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.View;

// Referenced classes of package android.support.v7.app:
//			AlertController

class AlertController$5
	implements Runnable
{

	public void run()
	{
		AlertController.manageScrollIndicators(((View) (mListView)), val$top, val$bottom);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AlertController this$0>
	//    2    4:getfield        #33  <Field android.widget.ListView AlertController.mListView>
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field View val$top>
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field View val$bottom>
	//    7   15:invokestatic    #37  <Method void AlertController.manageScrollIndicators(View, View, View)>
	//    8   18:return          
	}

	final AlertController this$0;
	final View val$bottom;
	final View val$top;

	AlertController$5()
	{
		this$0 = final_alertcontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field AlertController this$0>
		val$top = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field View val$top>
		val$bottom = View.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field View val$bottom>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
