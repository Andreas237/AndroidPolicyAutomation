// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.menu.ShowableListMenu;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ForwardingListener, ActionMenuPresenter

class ActionMenuPresenter$OverflowMenuButton$1 extends ForwardingListener
{

	public ShowableListMenu getPopup()
	{
		if(mOverflowPopup == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ActionMenuPresenter$OverflowMenuButton this$1>
	//*   2    4:getfield        #30  <Field ActionMenuPresenter ActionMenuPresenter$OverflowMenuButton.this$0>
	//*   3    7:getfield        #34  <Field ActionMenuPresenter$OverflowPopup ActionMenuPresenter.mOverflowPopup>
	//*   4   10:ifnonnull       15
			return null;
	//    5   13:aconst_null     
	//    6   14:areturn         
		else
			return ((ShowableListMenu) (mOverflowPopup.getPopup()));
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field ActionMenuPresenter$OverflowMenuButton this$1>
	//    9   19:getfield        #30  <Field ActionMenuPresenter ActionMenuPresenter$OverflowMenuButton.this$0>
	//   10   22:getfield        #34  <Field ActionMenuPresenter$OverflowPopup ActionMenuPresenter.mOverflowPopup>
	//   11   25:invokevirtual   #39  <Method android.support.v7.view.menu.MenuPopup ActionMenuPresenter$OverflowPopup.getPopup()>
	//   12   28:areturn         
	}

	public boolean onForwardingStarted()
	{
		showOverflowMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ActionMenuPresenter$OverflowMenuButton this$1>
	//    2    4:getfield        #30  <Field ActionMenuPresenter ActionMenuPresenter$OverflowMenuButton.this$0>
	//    3    7:invokevirtual   #44  <Method boolean ActionMenuPresenter.showOverflowMenu()>
	//    4   10:pop             
		return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
	}

	public boolean onForwardingStopped()
	{
		if(mPostedOpenRunnable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ActionMenuPresenter$OverflowMenuButton this$1>
	//*   2    4:getfield        #30  <Field ActionMenuPresenter ActionMenuPresenter$OverflowMenuButton.this$0>
	//*   3    7:getfield        #49  <Field ActionMenuPresenter$OpenOverflowRunnable ActionMenuPresenter.mPostedOpenRunnable>
	//*   4   10:ifnull          15
		{
			return false;
	//    5   13:iconst_0        
	//    6   14:ireturn         
		} else
		{
			hideOverflowMenu();
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field ActionMenuPresenter$OverflowMenuButton this$1>
	//    9   19:getfield        #30  <Field ActionMenuPresenter ActionMenuPresenter$OverflowMenuButton.this$0>
	//   10   22:invokevirtual   #52  <Method boolean ActionMenuPresenter.hideOverflowMenu()>
	//   11   25:pop             
			return true;
	//   12   26:iconst_1        
	//   13   27:ireturn         
		}
	}

	final ActionMenuPresenter.OverflowMenuButton this$1;
	final ActionMenuPresenter val$this$0;

	ActionMenuPresenter$OverflowMenuButton$1(ActionMenuPresenter actionmenupresenter)
	{
		this$1 = final_overflowmenubutton;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ActionMenuPresenter$OverflowMenuButton this$1>
		val$this$0 = actionmenupresenter;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #21  <Field ActionMenuPresenter val$this$0>
		super(View.this);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #24  <Method void ForwardingListener(View)>
	//    9   15:return          
	}
}
