// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//			ListPopupWindow

class ListPopupWindow$PopupScrollListener
	implements android.widget.AbsListView.OnScrollListener
{

	public void onScroll(AbsListView abslistview, int i, int j, int k)
	{
	//    0    0:return          
	}

	public void onScrollStateChanged(AbsListView abslistview, int i)
	{
		if(i == 1 && !isInputMethodNotNeeded() && mPopup.getContentView() != null)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          55
	//*   3    5:aload_0         
	//*   4    6:getfield        #15  <Field ListPopupWindow this$0>
	//*   5    9:invokevirtual   #27  <Method boolean ListPopupWindow.isInputMethodNotNeeded()>
	//*   6   12:ifne            55
	//*   7   15:aload_0         
	//*   8   16:getfield        #15  <Field ListPopupWindow this$0>
	//*   9   19:getfield        #31  <Field PopupWindow ListPopupWindow.mPopup>
	//*  10   22:invokevirtual   #37  <Method android.view.View PopupWindow.getContentView()>
	//*  11   25:ifnull          55
		{
			mHandler.removeCallbacks(((Runnable) (mResizePopupRunnable)));
	//   12   28:aload_0         
	//   13   29:getfield        #15  <Field ListPopupWindow this$0>
	//   14   32:getfield        #41  <Field Handler ListPopupWindow.mHandler>
	//   15   35:aload_0         
	//   16   36:getfield        #15  <Field ListPopupWindow this$0>
	//   17   39:getfield        #45  <Field ListPopupWindow$ResizePopupRunnable ListPopupWindow.mResizePopupRunnable>
	//   18   42:invokevirtual   #51  <Method void Handler.removeCallbacks(Runnable)>
			mResizePopupRunnable.run();
	//   19   45:aload_0         
	//   20   46:getfield        #15  <Field ListPopupWindow this$0>
	//   21   49:getfield        #45  <Field ListPopupWindow$ResizePopupRunnable ListPopupWindow.mResizePopupRunnable>
	//   22   52:invokevirtual   #56  <Method void ListPopupWindow$ResizePopupRunnable.run()>
		}
	//   23   55:return          
	}

	final ListPopupWindow this$0;

	ListPopupWindow$PopupScrollListener()
	{
		this$0 = ListPopupWindow.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ListPopupWindow this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
