// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.ac;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//			ListPopupWindow, DropDownListView

class ListPopupWindow$ResizePopupRunnable
	implements Runnable
{

	public void run()
	{
		if(mDropDownList != null && ac.A(((android.view.View) (mDropDownList))) && mDropDownList.getCount() > mDropDownList.getChildCount() && mDropDownList.getChildCount() <= mListItemExpandMaximum)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field ListPopupWindow this$0>
	//*   2    4:getfield        #23  <Field DropDownListView ListPopupWindow.mDropDownList>
	//*   3    7:ifnull          84
	//*   4   10:aload_0         
	//*   5   11:getfield        #12  <Field ListPopupWindow this$0>
	//*   6   14:getfield        #23  <Field DropDownListView ListPopupWindow.mDropDownList>
	//*   7   17:invokestatic    #29  <Method boolean ac.A(android.view.View)>
	//*   8   20:ifeq            84
	//*   9   23:aload_0         
	//*  10   24:getfield        #12  <Field ListPopupWindow this$0>
	//*  11   27:getfield        #23  <Field DropDownListView ListPopupWindow.mDropDownList>
	//*  12   30:invokevirtual   #35  <Method int DropDownListView.getCount()>
	//*  13   33:aload_0         
	//*  14   34:getfield        #12  <Field ListPopupWindow this$0>
	//*  15   37:getfield        #23  <Field DropDownListView ListPopupWindow.mDropDownList>
	//*  16   40:invokevirtual   #38  <Method int DropDownListView.getChildCount()>
	//*  17   43:icmple          84
	//*  18   46:aload_0         
	//*  19   47:getfield        #12  <Field ListPopupWindow this$0>
	//*  20   50:getfield        #23  <Field DropDownListView ListPopupWindow.mDropDownList>
	//*  21   53:invokevirtual   #38  <Method int DropDownListView.getChildCount()>
	//*  22   56:aload_0         
	//*  23   57:getfield        #12  <Field ListPopupWindow this$0>
	//*  24   60:getfield        #42  <Field int ListPopupWindow.mListItemExpandMaximum>
	//*  25   63:icmpgt          84
		{
			mPopup.setInputMethodMode(2);
	//   26   66:aload_0         
	//   27   67:getfield        #12  <Field ListPopupWindow this$0>
	//   28   70:getfield        #46  <Field PopupWindow ListPopupWindow.mPopup>
	//   29   73:iconst_2        
	//   30   74:invokevirtual   #52  <Method void PopupWindow.setInputMethodMode(int)>
			show();
	//   31   77:aload_0         
	//   32   78:getfield        #12  <Field ListPopupWindow this$0>
	//   33   81:invokevirtual   #55  <Method void ListPopupWindow.show()>
		}
	//   34   84:return          
	}

	final ListPopupWindow this$0;

	ListPopupWindow$ResizePopupRunnable()
	{
		this$0 = ListPopupWindow.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ListPopupWindow this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
