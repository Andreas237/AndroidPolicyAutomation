// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.menu.ShowableListMenu;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ForwardingListener, ListPopupWindow

class ListPopupWindow$1 extends ForwardingListener
{

	public volatile ShowableListMenu getPopup()
	{
		return ((ShowableListMenu) (getPopup()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method ListPopupWindow getPopup()>
	//    2    4:areturn         
	}

	public ListPopupWindow getPopup()
	{
		return ListPopupWindow.this;
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field ListPopupWindow this$0>
	//    2    4:areturn         
	}

	final ListPopupWindow this$0;

	ListPopupWindow$1(View view)
	{
		this$0 = ListPopupWindow.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field ListPopupWindow this$0>
		super(view);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void ForwardingListener(View)>
	//    6   10:return          
	}
}
