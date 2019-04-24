// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.menu.*;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuPresenter

private class ActionMenuPresenter$ActionButtonSubmenu extends MenuPopupHelper
{

	protected void onDismiss()
	{
		mActionButtonPopup = null;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ActionMenuPresenter this$0>
	//    2    4:aconst_null     
	//    3    5:putfield        #63  <Field ActionMenuPresenter$ActionButtonSubmenu ActionMenuPresenter.mActionButtonPopup>
		mOpenSubMenuId = 0;
	//    4    8:aload_0         
	//    5    9:getfield        #13  <Field ActionMenuPresenter this$0>
	//    6   12:iconst_0        
	//    7   13:putfield        #66  <Field int ActionMenuPresenter.mOpenSubMenuId>
		super.onDismiss();
	//    8   16:aload_0         
	//    9   17:invokespecial   #68  <Method void MenuPopupHelper.onDismiss()>
	//   10   20:return          
	}

	final ActionMenuPresenter this$0;

	public ActionMenuPresenter$ActionButtonSubmenu(Context context, SubMenuBuilder submenubuilder, View view)
	{
		this$0 = ActionMenuPresenter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field ActionMenuPresenter this$0>
		super(context, ((android.support.v7.view.menu.MenuBuilder) (submenubuilder)), view, false, android.support.v7.appcompat.R.attr.actionOverflowMenuStyle);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:iconst_0        
	//    8   11:getstatic       #19  <Field int android.support.v7.appcompat.R$attr.actionOverflowMenuStyle>
	//    9   14:invokespecial   #22  <Method void MenuPopupHelper(Context, android.support.v7.view.menu.MenuBuilder, View, boolean, int)>
		if(!((MenuItemImpl)submenubuilder.getItem()).isActionButton())
	//*  10   17:aload_3         
	//*  11   18:invokevirtual   #28  <Method android.view.MenuItem SubMenuBuilder.getItem()>
	//*  12   21:checkcast       #30  <Class MenuItemImpl>
	//*  13   24:invokevirtual   #34  <Method boolean MenuItemImpl.isActionButton()>
	//*  14   27:ifne            58
		{
			if(mOverflowButton == null)
	//*  15   30:aload_1         
	//*  16   31:getfield        #38  <Field ActionMenuPresenter$OverflowMenuButton ActionMenuPresenter.mOverflowButton>
	//*  17   34:ifnonnull       48
				context = ((Context) ((View)ActionMenuPresenter.access$200(ActionMenuPresenter.this)));
	//   18   37:aload_1         
	//   19   38:invokestatic    #42  <Method android.support.v7.view.menu.MenuView ActionMenuPresenter.access$200(ActionMenuPresenter)>
	//   20   41:checkcast       #44  <Class View>
	//   21   44:astore_2        
			else
	//*  22   45:goto            53
				context = ((Context) (mOverflowButton));
	//   23   48:aload_1         
	//   24   49:getfield        #38  <Field ActionMenuPresenter$OverflowMenuButton ActionMenuPresenter.mOverflowButton>
	//   25   52:astore_2        
			setAnchorView(((View) (context)));
	//   26   53:aload_0         
	//   27   54:aload_2         
	//   28   55:invokevirtual   #48  <Method void setAnchorView(View)>
		}
		setPresenterCallback(((android.support.v7.view.menu.MenuPresenter.Callback) (mPopupPresenterCallback)));
	//   29   58:aload_0         
	//   30   59:aload_1         
	//   31   60:getfield        #52  <Field ActionMenuPresenter$PopupPresenterCallback ActionMenuPresenter.mPopupPresenterCallback>
	//   32   63:invokevirtual   #56  <Method void setPresenterCallback(android.support.v7.view.menu.MenuPresenter$Callback)>
	//   33   66:return          
	}
}
