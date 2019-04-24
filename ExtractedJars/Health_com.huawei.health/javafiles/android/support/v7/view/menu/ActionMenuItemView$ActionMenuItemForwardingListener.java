// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.support.v7.widget.ForwardingListener;

// Referenced classes of package android.support.v7.view.menu:
//			ActionMenuItemView, ShowableListMenu

class ActionMenuItemView$ActionMenuItemForwardingListener extends ForwardingListener
{

	public ShowableListMenu getPopup()
	{
		if(mPopupCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field ActionMenuItemView this$0>
	//*   2    4:getfield        #23  <Field ActionMenuItemView$PopupCallback ActionMenuItemView.mPopupCallback>
	//*   3    7:ifnull          21
			return mPopupCallback.getPopup();
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field ActionMenuItemView this$0>
	//    6   14:getfield        #23  <Field ActionMenuItemView$PopupCallback ActionMenuItemView.mPopupCallback>
	//    7   17:invokevirtual   #27  <Method ShowableListMenu ActionMenuItemView$PopupCallback.getPopup()>
	//    8   20:areturn         
		else
			return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
	}

	public boolean onForwardingStarted()
	{
		if(mItemInvoker != null && mItemInvoker.invokeItem(mItemData))
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field ActionMenuItemView this$0>
	//*   2    4:getfield        #33  <Field MenuBuilder$ItemInvoker ActionMenuItemView.mItemInvoker>
	//*   3    7:ifnull          54
	//*   4   10:aload_0         
	//*   5   11:getfield        #13  <Field ActionMenuItemView this$0>
	//*   6   14:getfield        #33  <Field MenuBuilder$ItemInvoker ActionMenuItemView.mItemInvoker>
	//*   7   17:aload_0         
	//*   8   18:getfield        #13  <Field ActionMenuItemView this$0>
	//*   9   21:getfield        #37  <Field MenuItemImpl ActionMenuItemView.mItemData>
	//*  10   24:invokeinterface #43  <Method boolean MenuBuilder$ItemInvoker.invokeItem(MenuItemImpl)>
	//*  11   29:ifeq            54
		{
			ShowableListMenu showablelistmenu = getPopup();
	//   12   32:aload_0         
	//   13   33:invokevirtual   #44  <Method ShowableListMenu getPopup()>
	//   14   36:astore_1        
			return showablelistmenu != null && showablelistmenu.isShowing();
	//   15   37:aload_1         
	//   16   38:ifnull          52
	//   17   41:aload_1         
	//   18   42:invokeinterface #49  <Method boolean ShowableListMenu.isShowing()>
	//   19   47:ifeq            52
	//   20   50:iconst_1        
	//   21   51:ireturn         
	//   22   52:iconst_0        
	//   23   53:ireturn         
		} else
		{
			return false;
	//   24   54:iconst_0        
	//   25   55:ireturn         
		}
	}

	final ActionMenuItemView this$0;

	public ActionMenuItemView$ActionMenuItemForwardingListener()
	{
		this$0 = ActionMenuItemView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field ActionMenuItemView this$0>
		super(((android.view.View) (ActionMenuItemView.this)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #16  <Method void ForwardingListener(android.view.View)>
	//    6   10:return          
	}
}
