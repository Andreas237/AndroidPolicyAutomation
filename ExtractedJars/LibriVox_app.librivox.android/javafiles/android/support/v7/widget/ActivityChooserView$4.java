// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.menu.ShowableListMenu;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ForwardingListener, ActivityChooserView

class ActivityChooserView$4 extends ForwardingListener
{

	public ShowableListMenu getPopup()
	{
		return ((ShowableListMenu) (getListPopupWindow()));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field ActivityChooserView this$0>
	//    2    4:invokevirtual   #22  <Method ListPopupWindow ActivityChooserView.getListPopupWindow()>
	//    3    7:areturn         
	}

	protected boolean onForwardingStarted()
	{
		showPopup();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field ActivityChooserView this$0>
	//    2    4:invokevirtual   #27  <Method boolean ActivityChooserView.showPopup()>
	//    3    7:pop             
		return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
	}

	protected boolean onForwardingStopped()
	{
		dismissPopup();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field ActivityChooserView this$0>
	//    2    4:invokevirtual   #31  <Method boolean ActivityChooserView.dismissPopup()>
	//    3    7:pop             
		return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
	}

	final ActivityChooserView this$0;

	ActivityChooserView$4(View view)
	{
		this$0 = ActivityChooserView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field ActivityChooserView this$0>
		super(view);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void ForwardingListener(View)>
	//    6   10:return          
	}
}
