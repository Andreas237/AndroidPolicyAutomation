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
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		boolean flag = flag1;
	//    2    2:iload_2         
	//    3    3:istore_1        
		if(mItemInvoker != null)
	//*   4    4:aload_0         
	//*   5    5:getfield        #13  <Field ActionMenuItemView this$0>
	//*   6    8:getfield        #33  <Field MenuBuilder$ItemInvoker ActionMenuItemView.mItemInvoker>
	//*   7   11:ifnull          62
		{
			flag = flag1;
	//    8   14:iload_2         
	//    9   15:istore_1        
			if(mItemInvoker.invokeItem(mItemData))
	//*  10   16:aload_0         
	//*  11   17:getfield        #13  <Field ActionMenuItemView this$0>
	//*  12   20:getfield        #33  <Field MenuBuilder$ItemInvoker ActionMenuItemView.mItemInvoker>
	//*  13   23:aload_0         
	//*  14   24:getfield        #13  <Field ActionMenuItemView this$0>
	//*  15   27:getfield        #37  <Field MenuItemImpl ActionMenuItemView.mItemData>
	//*  16   30:invokeinterface #43  <Method boolean MenuBuilder$ItemInvoker.invokeItem(MenuItemImpl)>
	//*  17   35:ifeq            62
			{
				ShowableListMenu showablelistmenu = getPopup();
	//   18   38:aload_0         
	//   19   39:invokevirtual   #44  <Method ShowableListMenu getPopup()>
	//   20   42:astore_3        
				flag = flag1;
	//   21   43:iload_2         
	//   22   44:istore_1        
				if(showablelistmenu != null)
	//*  23   45:aload_3         
	//*  24   46:ifnull          62
				{
					flag = flag1;
	//   25   49:iload_2         
	//   26   50:istore_1        
					if(showablelistmenu.isShowing())
	//*  27   51:aload_3         
	//*  28   52:invokeinterface #49  <Method boolean ShowableListMenu.isShowing()>
	//*  29   57:ifeq            62
						flag = true;
	//   30   60:iconst_1        
	//   31   61:istore_1        
				}
			}
		}
		return flag;
	//   32   62:iload_1         
	//   33   63:ireturn         
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
