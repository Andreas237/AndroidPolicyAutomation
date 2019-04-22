// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuPopupHelper;
import android.view.*;

public class PopupMenu
{
	public static interface OnDismissListener
	{

		public abstract void onDismiss(PopupMenu popupmenu);
	}

	public static interface OnMenuItemClickListener
	{

		public abstract boolean onMenuItemClick(MenuItem menuitem);
	}


	public PopupMenu(Context context, View view, int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field Context mContext>
		mAnchor = view;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #38  <Field View mAnchor>
		mMenu = new MenuBuilder(context);
	//    8   14:aload_0         
	//    9   15:new             #40  <Class MenuBuilder>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokespecial   #43  <Method void MenuBuilder(Context)>
	//   13   23:putfield        #45  <Field MenuBuilder mMenu>
		mMenu.setCallback(new android.support.v7.view.menu.MenuBuilder.Callback() {

			public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
			{
				if(mMenuItemClickListener != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #16  <Field PopupMenu this$0>
			//*   2    4:getfield        #26  <Field PopupMenu$OnMenuItemClickListener PopupMenu.mMenuItemClickListener>
			//*   3    7:ifnull          24
					return mMenuItemClickListener.onMenuItemClick(menuitem);
			//    4   10:aload_0         
			//    5   11:getfield        #16  <Field PopupMenu this$0>
			//    6   14:getfield        #26  <Field PopupMenu$OnMenuItemClickListener PopupMenu.mMenuItemClickListener>
			//    7   17:aload_2         
			//    8   18:invokeinterface #32  <Method boolean PopupMenu$OnMenuItemClickListener.onMenuItemClick(MenuItem)>
			//    9   23:ireturn         
				else
					return false;
			//   10   24:iconst_0        
			//   11   25:ireturn         
			}

			public void onMenuModeChange(MenuBuilder menubuilder)
			{
			//    0    0:return          
			}

			final PopupMenu this$0;

			
			{
				this$0 = PopupMenu.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PopupMenu this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   14   26:aload_0         
	//   15   27:getfield        #45  <Field MenuBuilder mMenu>
	//   16   30:new             #6   <Class PopupMenu$1>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:invokespecial   #48  <Method void PopupMenu$1(PopupMenu)>
	//   20   38:invokevirtual   #52  <Method void MenuBuilder.setCallback(android.support.v7.view.menu.MenuBuilder$Callback)>
		mPopup = new MenuPopupHelper(context, mMenu, view, false, j, k);
	//   21   41:aload_0         
	//   22   42:new             #54  <Class MenuPopupHelper>
	//   23   45:dup             
	//   24   46:aload_1         
	//   25   47:aload_0         
	//   26   48:getfield        #45  <Field MenuBuilder mMenu>
	//   27   51:aload_2         
	//   28   52:iconst_0        
	//   29   53:iload           4
	//   30   55:iload           5
	//   31   57:invokespecial   #57  <Method void MenuPopupHelper(Context, MenuBuilder, View, boolean, int, int)>
	//   32   60:putfield        #59  <Field MenuPopupHelper mPopup>
		mPopup.setGravity(i);
	//   33   63:aload_0         
	//   34   64:getfield        #59  <Field MenuPopupHelper mPopup>
	//   35   67:iload_3         
	//   36   68:invokevirtual   #63  <Method void MenuPopupHelper.setGravity(int)>
		mPopup.setOnDismissListener(new android.widget.PopupWindow.OnDismissListener() {

			public void onDismiss()
			{
				if(mOnDismissListener != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #16  <Field PopupMenu this$0>
			//*   2    4:getfield        #25  <Field PopupMenu$OnDismissListener PopupMenu.mOnDismissListener>
			//*   3    7:ifnull          26
					mOnDismissListener.onDismiss(PopupMenu.this);
			//    4   10:aload_0         
			//    5   11:getfield        #16  <Field PopupMenu this$0>
			//    6   14:getfield        #25  <Field PopupMenu$OnDismissListener PopupMenu.mOnDismissListener>
			//    7   17:aload_0         
			//    8   18:getfield        #16  <Field PopupMenu this$0>
			//    9   21:invokeinterface #29  <Method void PopupMenu$OnDismissListener.onDismiss(PopupMenu)>
			//   10   26:return          
			}

			final PopupMenu this$0;

			
			{
				this$0 = PopupMenu.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PopupMenu this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   37   71:aload_0         
	//   38   72:getfield        #59  <Field MenuPopupHelper mPopup>
	//   39   75:new             #8   <Class PopupMenu$2>
	//   40   78:dup             
	//   41   79:aload_0         
	//   42   80:invokespecial   #64  <Method void PopupMenu$2(PopupMenu)>
	//   43   83:invokevirtual   #68  <Method void MenuPopupHelper.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
	//   44   86:return          
	}

	public Menu getMenu()
	{
		return ((Menu) (mMenu));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field MenuBuilder mMenu>
	//    2    4:areturn         
	}

	public void setOnMenuItemClickListener(OnMenuItemClickListener onmenuitemclicklistener)
	{
		mMenuItemClickListener = onmenuitemclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #78  <Field PopupMenu$OnMenuItemClickListener mMenuItemClickListener>
	//    3    5:return          
	}

	public void show()
	{
		mPopup.show();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field MenuPopupHelper mPopup>
	//    2    4:invokevirtual   #81  <Method void MenuPopupHelper.show()>
	//    3    7:return          
	}

	private final View mAnchor;
	private final Context mContext;
	private final MenuBuilder mMenu;
	OnMenuItemClickListener mMenuItemClickListener;
	OnDismissListener mOnDismissListener;
	final MenuPopupHelper mPopup;
}
