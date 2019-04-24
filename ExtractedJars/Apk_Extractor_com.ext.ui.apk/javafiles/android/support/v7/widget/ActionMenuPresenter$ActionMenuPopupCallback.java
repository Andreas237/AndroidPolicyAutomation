// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.menu.ShowableListMenu;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuPresenter

private class ActionMenuPresenter$ActionMenuPopupCallback extends android.support.v7.view.menu.ActionMenuItemView.PopupCallback
{

	public ShowableListMenu getPopup()
	{
		if(mActionButtonPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field ActionMenuPresenter this$0>
	//*   2    4:getfield        #23  <Field ActionMenuPresenter$ActionButtonSubmenu ActionMenuPresenter.mActionButtonPopup>
	//*   3    7:ifnull          21
			return ((ShowableListMenu) (mActionButtonPopup.getPopup()));
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field ActionMenuPresenter this$0>
	//    6   14:getfield        #23  <Field ActionMenuPresenter$ActionButtonSubmenu ActionMenuPresenter.mActionButtonPopup>
	//    7   17:invokevirtual   #28  <Method android.support.v7.view.menu.MenuPopup ActionMenuPresenter$ActionButtonSubmenu.getPopup()>
	//    8   20:areturn         
		else
			return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
	}

	final ActionMenuPresenter this$0;

	ActionMenuPresenter$ActionMenuPopupCallback()
	{
		this$0 = ActionMenuPresenter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field ActionMenuPresenter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void android.support.v7.view.menu.ActionMenuItemView$PopupCallback()>
	//    5    9:return          
	}
}
