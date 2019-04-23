// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuPopupHelper;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuPresenter

private class ActionMenuPresenter$OverflowPopup extends MenuPopupHelper
{

	protected void onDismiss()
	{
		if(ActionMenuPresenter.access$000(ActionMenuPresenter.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field ActionMenuPresenter this$0>
	//*   2    4:invokestatic    #42  <Method MenuBuilder ActionMenuPresenter.access$000(ActionMenuPresenter)>
	//*   3    7:ifnull          20
			ActionMenuPresenter.access$100(ActionMenuPresenter.this).close();
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field ActionMenuPresenter this$0>
	//    6   14:invokestatic    #45  <Method MenuBuilder ActionMenuPresenter.access$100(ActionMenuPresenter)>
	//    7   17:invokevirtual   #50  <Method void MenuBuilder.close()>
		mOverflowPopup = null;
	//    8   20:aload_0         
	//    9   21:getfield        #13  <Field ActionMenuPresenter this$0>
	//   10   24:aconst_null     
	//   11   25:putfield        #54  <Field ActionMenuPresenter$OverflowPopup ActionMenuPresenter.mOverflowPopup>
		super.onDismiss();
	//   12   28:aload_0         
	//   13   29:invokespecial   #56  <Method void MenuPopupHelper.onDismiss()>
	//   14   32:return          
	}

	final ActionMenuPresenter this$0;

	public ActionMenuPresenter$OverflowPopup(Context context, MenuBuilder menubuilder, View view, boolean flag)
	{
		this$0 = ActionMenuPresenter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field ActionMenuPresenter this$0>
		super(context, menubuilder, view, flag, android.support.v7.appcompat.R.attr.actionOverflowMenuStyle);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:iload           5
	//    8   12:getstatic       #19  <Field int android.support.v7.appcompat.R$attr.actionOverflowMenuStyle>
	//    9   15:invokespecial   #22  <Method void MenuPopupHelper(Context, MenuBuilder, View, boolean, int)>
		setGravity(0x800005);
	//   10   18:aload_0         
	//   11   19:ldc1            #23  <Int 0x800005>
	//   12   21:invokevirtual   #27  <Method void setGravity(int)>
		setPresenterCallback(((android.support.v7.view.menu.MenuPresenter.Callback) (mPopupPresenterCallback)));
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:getfield        #31  <Field ActionMenuPresenter$PopupPresenterCallback ActionMenuPresenter.mPopupPresenterCallback>
	//   16   29:invokevirtual   #35  <Method void setPresenterCallback(android.support.v7.view.menu.MenuPresenter$Callback)>
	//   17   32:return          
	}
}
