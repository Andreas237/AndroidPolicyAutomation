// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.support.v7.widget.ForwardingListener;

// Referenced classes of package android.support.v7.view.menu:
//			ActionMenuItemView, ShowableListMenu

private class ActionMenuItemView$ActionMenuItemForwardingListener extends ForwardingListener
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

	protected boolean onForwardingStarted()
	{
		MenuBuilder.ItemInvoker iteminvoker = mItemInvoker;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ActionMenuItemView this$0>
	//    2    4:getfield        #33  <Field MenuBuilder$ItemInvoker ActionMenuItemView.mItemInvoker>
	//    3    7:astore_3        
		boolean flag1 = false;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		if(iteminvoker != null && mItemInvoker.invokeItem(mItemData))
	//*   6   10:aload_3         
	//*   7   11:ifnull          62
	//*   8   14:aload_0         
	//*   9   15:getfield        #13  <Field ActionMenuItemView this$0>
	//*  10   18:getfield        #33  <Field MenuBuilder$ItemInvoker ActionMenuItemView.mItemInvoker>
	//*  11   21:aload_0         
	//*  12   22:getfield        #13  <Field ActionMenuItemView this$0>
	//*  13   25:getfield        #37  <Field MenuItemImpl ActionMenuItemView.mItemData>
	//*  14   28:invokeinterface #43  <Method boolean MenuBuilder$ItemInvoker.invokeItem(MenuItemImpl)>
	//*  15   33:ifeq            62
		{
			ShowableListMenu showablelistmenu = getPopup();
	//   16   36:aload_0         
	//   17   37:invokevirtual   #44  <Method ShowableListMenu getPopup()>
	//   18   40:astore_3        
			boolean flag = flag1;
	//   19   41:iload_2         
	//   20   42:istore_1        
			if(showablelistmenu != null)
	//*  21   43:aload_3         
	//*  22   44:ifnull          60
			{
				flag = flag1;
	//   23   47:iload_2         
	//   24   48:istore_1        
				if(showablelistmenu.isShowing())
	//*  25   49:aload_3         
	//*  26   50:invokeinterface #49  <Method boolean ShowableListMenu.isShowing()>
	//*  27   55:ifeq            60
					flag = true;
	//   28   58:iconst_1        
	//   29   59:istore_1        
			}
			return flag;
	//   30   60:iload_1         
	//   31   61:ireturn         
		} else
		{
			return false;
	//   32   62:iconst_0        
	//   33   63:ireturn         
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
