// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.v;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			AlertController

class AlertController$2
	implements v
{

	public void onScrollChange(NestedScrollView nestedscrollview, int i, int j, int k, int l)
	{
		AlertController.manageScrollIndicators(((View) (nestedscrollview)), val$top, val$bottom);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #17  <Field View val$top>
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field View val$bottom>
	//    5    9:invokestatic    #31  <Method void AlertController.manageScrollIndicators(View, View, View)>
	//    6   12:return          
	}

	final AlertController this$0;
	final View val$bottom;
	final View val$top;

	AlertController$2()
	{
		this$0 = final_alertcontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AlertController this$0>
		val$top = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field View val$top>
		val$bottom = View.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #19  <Field View val$bottom>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #22  <Method void Object()>
	//   11   19:return          
	}
}
