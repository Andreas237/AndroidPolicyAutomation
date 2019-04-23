// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuPopupHelper;
import android.view.*;
import android.widget.ListView;

public class PopupMenu
{

	public PopupMenu(Context context, View view)
	{
		this(context, view, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #23  <Method void PopupMenu(Context, View, int)>
	//    5    7:return          
	}

	public PopupMenu(Context context, View view, int i)
	{
		this(context, view, i, android.support.v7.appcompat.R.attr.popupMenuStyle, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:getstatic       #30  <Field int android.support.v7.appcompat.R$attr.popupMenuStyle>
	//    5    7:iconst_0        
	//    6    8:invokespecial   #33  <Method void PopupMenu(Context, View, int, int, int)>
	//    7   11:return          
	}

	public PopupMenu(Context context, View view, int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field Context mContext>
		mAnchor = view;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #40  <Field View mAnchor>
		mMenu = new MenuBuilder(context);
	//    8   14:aload_0         
	//    9   15:new             #42  <Class MenuBuilder>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokespecial   #45  <Method void MenuBuilder(Context)>
	//   13   23:putfield        #47  <Field MenuBuilder mMenu>
		mMenu.a(((android.support.v7.view.menu.MenuBuilder.Callback) (new _cls1())));
	//   14   26:aload_0         
	//   15   27:getfield        #47  <Field MenuBuilder mMenu>
	//   16   30:new             #49  <Class PopupMenu$1>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:invokespecial   #52  <Method void PopupMenu$1(PopupMenu)>
	//   20   38:invokevirtual   #56  <Method void MenuBuilder.a(android.support.v7.view.menu.MenuBuilder$Callback)>
		mPopup = new MenuPopupHelper(context, mMenu, view, false, j, k);
	//   21   41:aload_0         
	//   22   42:new             #58  <Class MenuPopupHelper>
	//   23   45:dup             
	//   24   46:aload_1         
	//   25   47:aload_0         
	//   26   48:getfield        #47  <Field MenuBuilder mMenu>
	//   27   51:aload_2         
	//   28   52:iconst_0        
	//   29   53:iload           4
	//   30   55:iload           5
	//   31   57:invokespecial   #61  <Method void MenuPopupHelper(Context, MenuBuilder, View, boolean, int, int)>
	//   32   60:putfield        #63  <Field MenuPopupHelper mPopup>
		mPopup.setGravity(i);
	//   33   63:aload_0         
	//   34   64:getfield        #63  <Field MenuPopupHelper mPopup>
	//   35   67:iload_3         
	//   36   68:invokevirtual   #67  <Method void MenuPopupHelper.setGravity(int)>
		mPopup.setOnDismissListener(((android.widget.PopupWindow.OnDismissListener) (new _cls2())));
	//   37   71:aload_0         
	//   38   72:getfield        #63  <Field MenuPopupHelper mPopup>
	//   39   75:new             #69  <Class PopupMenu$2>
	//   40   78:dup             
	//   41   79:aload_0         
	//   42   80:invokespecial   #70  <Method void PopupMenu$2(PopupMenu)>
	//   43   83:invokevirtual   #74  <Method void MenuPopupHelper.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
	//   44   86:return          
	}

	public void dismiss()
	{
		mPopup.dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field MenuPopupHelper mPopup>
	//    2    4:invokevirtual   #77  <Method void MenuPopupHelper.dismiss()>
	//    3    7:return          
	}

	public android.view.View.OnTouchListener getDragToOpenListener()
	{
		if(mDragListener == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field android.view.View$OnTouchListener mDragListener>
	//*   2    4:ifnonnull       23
			mDragListener = ((android.view.View.OnTouchListener) (new _cls3(mAnchor)));
	//    3    7:aload_0         
	//    4    8:new             #83  <Class PopupMenu$3>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #40  <Field View mAnchor>
	//    9   17:invokespecial   #86  <Method void PopupMenu$3(PopupMenu, View)>
	//   10   20:putfield        #81  <Field android.view.View$OnTouchListener mDragListener>
		return mDragListener;
	//   11   23:aload_0         
	//   12   24:getfield        #81  <Field android.view.View$OnTouchListener mDragListener>
	//   13   27:areturn         
	}

	public int getGravity()
	{
		return mPopup.getGravity();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field MenuPopupHelper mPopup>
	//    2    4:invokevirtual   #90  <Method int MenuPopupHelper.getGravity()>
	//    3    7:ireturn         
	}

	public Menu getMenu()
	{
		return ((Menu) (mMenu));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field MenuBuilder mMenu>
	//    2    4:areturn         
	}

	public MenuInflater getMenuInflater()
	{
		return ((MenuInflater) (new SupportMenuInflater(mContext)));
	//    0    0:new             #96  <Class SupportMenuInflater>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field Context mContext>
	//    4    8:invokespecial   #97  <Method void SupportMenuInflater(Context)>
	//    5   11:areturn         
	}

	ListView getMenuListView()
	{
		if(!mPopup.isShowing())
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field MenuPopupHelper mPopup>
	//*   2    4:invokevirtual   #103 <Method boolean MenuPopupHelper.isShowing()>
	//*   3    7:ifne            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		else
			return mPopup.getListView();
	//    6   12:aload_0         
	//    7   13:getfield        #63  <Field MenuPopupHelper mPopup>
	//    8   16:invokevirtual   #106 <Method ListView MenuPopupHelper.getListView()>
	//    9   19:areturn         
	}

	public void inflate(int i)
	{
		getMenuInflater().inflate(i, ((Menu) (mMenu)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #109 <Method MenuInflater getMenuInflater()>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field MenuBuilder mMenu>
	//    5    9:invokevirtual   #114 <Method void MenuInflater.inflate(int, Menu)>
	//    6   12:return          
	}

	public void setGravity(int i)
	{
		mPopup.setGravity(i);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field MenuPopupHelper mPopup>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #67  <Method void MenuPopupHelper.setGravity(int)>
	//    4    8:return          
	}

	public void setOnDismissListener(OnDismissListener ondismisslistener)
	{
		mOnDismissListener = ondismisslistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #117 <Field PopupMenu$OnDismissListener mOnDismissListener>
	//    3    5:return          
	}

	public void setOnMenuItemClickListener(OnMenuItemClickListener onmenuitemclicklistener)
	{
		mMenuItemClickListener = onmenuitemclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #121 <Field PopupMenu$OnMenuItemClickListener mMenuItemClickListener>
	//    3    5:return          
	}

	public void show()
	{
		mPopup.show();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field MenuPopupHelper mPopup>
	//    2    4:invokevirtual   #124 <Method void MenuPopupHelper.show()>
	//    3    7:return          
	}

	private final View mAnchor;
	private final Context mContext;
	private android.view.View.OnTouchListener mDragListener;
	private final MenuBuilder mMenu;
	OnMenuItemClickListener mMenuItemClickListener;
	OnDismissListener mOnDismissListener;
	final MenuPopupHelper mPopup;

	private class _cls1
		implements android.support.v7.view.menu.MenuBuilder.Callback
	{

		public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
		{
			if(mMenuItemClickListener != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field PopupMenu this$0>
		//*   2    4:getfield        #24  <Field PopupMenu$OnMenuItemClickListener PopupMenu.mMenuItemClickListener>
		//*   3    7:ifnull          24
				return mMenuItemClickListener.onMenuItemClick(menuitem);
		//    4   10:aload_0         
		//    5   11:getfield        #12  <Field PopupMenu this$0>
		//    6   14:getfield        #24  <Field PopupMenu$OnMenuItemClickListener PopupMenu.mMenuItemClickListener>
		//    7   17:aload_2         
		//    8   18:invokeinterface #30  <Method boolean PopupMenu$OnMenuItemClickListener.onMenuItemClick(MenuItem)>
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

		_cls1()
		{
			this$0 = PopupMenu.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field PopupMenu this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}

		private class OnMenuItemClickListener
		{

			public abstract boolean onMenuItemClick(MenuItem menuitem);
		}

	}


	private class _cls2
		implements android.widget.PopupWindow.OnDismissListener
	{

		public void onDismiss()
		{
			if(mOnDismissListener != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field PopupMenu this$0>
		//*   2    4:getfield        #23  <Field PopupMenu$OnDismissListener PopupMenu.mOnDismissListener>
		//*   3    7:ifnull          26
				mOnDismissListener.onDismiss(PopupMenu.this);
		//    4   10:aload_0         
		//    5   11:getfield        #12  <Field PopupMenu this$0>
		//    6   14:getfield        #23  <Field PopupMenu$OnDismissListener PopupMenu.mOnDismissListener>
		//    7   17:aload_0         
		//    8   18:getfield        #12  <Field PopupMenu this$0>
		//    9   21:invokeinterface #27  <Method void PopupMenu$OnDismissListener.onDismiss(PopupMenu)>
		//   10   26:return          
		}

		final PopupMenu this$0;

		_cls2()
		{
			this$0 = PopupMenu.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field PopupMenu this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}

		private class OnDismissListener
		{

			public abstract void onDismiss(PopupMenu popupmenu);
		}

	}


	private class _cls3 extends ForwardingListener
	{

		public ShowableListMenu getPopup()
		{
			return ((ShowableListMenu) (mPopup.getPopup()));
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field PopupMenu this$0>
		//    2    4:getfield        #22  <Field MenuPopupHelper PopupMenu.mPopup>
		//    3    7:invokevirtual   #27  <Method android.support.v7.view.menu.MenuPopup MenuPopupHelper.getPopup()>
		//    4   10:areturn         
		}

		protected boolean onForwardingStarted()
		{
			show();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field PopupMenu this$0>
		//    2    4:invokevirtual   #33  <Method void PopupMenu.show()>
			return true;
		//    3    7:iconst_1        
		//    4    8:ireturn         
		}

		protected boolean onForwardingStopped()
		{
			dismiss();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field PopupMenu this$0>
		//    2    4:invokevirtual   #37  <Method void PopupMenu.dismiss()>
			return true;
		//    3    7:iconst_1        
		//    4    8:ireturn         
		}

		final PopupMenu this$0;

		_cls3(View view)
		{
			this$0 = PopupMenu.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #10  <Field PopupMenu this$0>
			super(view);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #13  <Method void ForwardingListener(View)>
		//    6   10:return          
		}
	}

}
