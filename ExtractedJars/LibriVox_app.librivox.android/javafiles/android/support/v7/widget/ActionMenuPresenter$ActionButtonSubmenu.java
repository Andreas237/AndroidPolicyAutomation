// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.menu.*;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuPresenter

class ActionMenuPresenter$ActionButtonSubmenu extends MenuPopupHelper
{

	protected void onDismiss()
	{
		ActionMenuPresenter actionmenupresenter = ActionMenuPresenter.this;
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field ActionMenuPresenter this$0>
	//    2    4:astore_1        
		actionmenupresenter.mActionButtonPopup = null;
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:putfield        #62  <Field ActionMenuPresenter$ActionButtonSubmenu ActionMenuPresenter.mActionButtonPopup>
		actionmenupresenter.mOpenSubMenuId = 0;
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:putfield        #65  <Field int ActionMenuPresenter.mOpenSubMenuId>
		super.onDismiss();
	//    9   15:aload_0         
	//   10   16:invokespecial   #67  <Method void MenuPopupHelper.onDismiss()>
	//   11   19:return          
	}

	final ActionMenuPresenter this$0;

	public ActionMenuPresenter$ActionButtonSubmenu(Context context, a a1, View view)
	{
		this$0 = ActionMenuPresenter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field ActionMenuPresenter this$0>
		super(context, ((android.support.v7.view.menu.MenuBuilder) (a1)), view, false, android.support.v7.appcompat.R.attr.actionOverflowMenuStyle);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:iconst_0        
	//    8   11:getstatic       #16  <Field int android.support.v7.appcompat.R$attr.actionOverflowMenuStyle>
	//    9   14:invokespecial   #19  <Method void MenuPopupHelper(Context, android.support.v7.view.menu.MenuBuilder, View, boolean, int)>
		if(!((MenuItemImpl)a1.getItem()).isActionButton())
	//*  10   17:aload_3         
	//*  11   18:invokevirtual   #25  <Method android.view.MenuItem a.getItem()>
	//*  12   21:checkcast       #27  <Class MenuItemImpl>
	//*  13   24:invokevirtual   #31  <Method boolean MenuItemImpl.isActionButton()>
	//*  14   27:ifne            58
		{
			if(mOverflowButton == null)
	//*  15   30:aload_1         
	//*  16   31:getfield        #37  <Field ActionMenuPresenter$OverflowMenuButton ActionMenuPresenter.mOverflowButton>
	//*  17   34:ifnonnull       48
				context = ((Context) ((View)ActionMenuPresenter.access$200(ActionMenuPresenter.this)));
	//   18   37:aload_1         
	//   19   38:invokestatic    #41  <Method android.support.v7.view.menu.MenuView ActionMenuPresenter.access$200(ActionMenuPresenter)>
	//   20   41:checkcast       #43  <Class View>
	//   21   44:astore_2        
			else
	//*  22   45:goto            53
				context = ((Context) (mOverflowButton));
	//   23   48:aload_1         
	//   24   49:getfield        #37  <Field ActionMenuPresenter$OverflowMenuButton ActionMenuPresenter.mOverflowButton>
	//   25   52:astore_2        
			setAnchorView(((View) (context)));
	//   26   53:aload_0         
	//   27   54:aload_2         
	//   28   55:invokevirtual   #47  <Method void setAnchorView(View)>
		}
		setPresenterCallback(((android.support.v7.view.menu.MenuPresenter.Callback) (mPopupPresenterCallback)));
	//   29   58:aload_0         
	//   30   59:aload_1         
	//   31   60:getfield        #51  <Field ActionMenuPresenter$PopupPresenterCallback ActionMenuPresenter.mPopupPresenterCallback>
	//   32   63:invokevirtual   #55  <Method void setPresenterCallback(android.support.v7.view.menu.MenuPresenter$Callback)>
	//   33   66:return          
	}
}
