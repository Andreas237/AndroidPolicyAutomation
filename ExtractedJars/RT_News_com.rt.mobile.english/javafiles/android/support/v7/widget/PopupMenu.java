// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.menu.*;
import android.view.*;
import android.widget.ListView;

// Referenced classes of package android.support.v7.widget:
//			ForwardingListener

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


	public PopupMenu(Context context, View view)
	{
		this(context, view, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #36  <Method void PopupMenu(Context, View, int)>
	//    5    7:return          
	}

	public PopupMenu(Context context, View view, int i)
	{
		this(context, view, i, android.support.v7.appcompat.R.attr.popupMenuStyle, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:getstatic       #44  <Field int android.support.v7.appcompat.R$attr.popupMenuStyle>
	//    5    7:iconst_0        
	//    6    8:invokespecial   #47  <Method void PopupMenu(Context, View, int, int, int)>
	//    7   11:return          
	}

	public PopupMenu(Context context, View view, int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #54  <Field Context mContext>
		mAnchor = view;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #56  <Field View mAnchor>
		mMenu = new MenuBuilder(context);
	//    8   14:aload_0         
	//    9   15:new             #58  <Class MenuBuilder>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokespecial   #61  <Method void MenuBuilder(Context)>
	//   13   23:putfield        #63  <Field MenuBuilder mMenu>
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
	//   15   27:getfield        #63  <Field MenuBuilder mMenu>
	//   16   30:new             #6   <Class PopupMenu$1>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:invokespecial   #66  <Method void PopupMenu$1(PopupMenu)>
	//   20   38:invokevirtual   #70  <Method void MenuBuilder.setCallback(android.support.v7.view.menu.MenuBuilder$Callback)>
		mPopup = new MenuPopupHelper(context, mMenu, view, false, j, k);
	//   21   41:aload_0         
	//   22   42:new             #72  <Class MenuPopupHelper>
	//   23   45:dup             
	//   24   46:aload_1         
	//   25   47:aload_0         
	//   26   48:getfield        #63  <Field MenuBuilder mMenu>
	//   27   51:aload_2         
	//   28   52:iconst_0        
	//   29   53:iload           4
	//   30   55:iload           5
	//   31   57:invokespecial   #75  <Method void MenuPopupHelper(Context, MenuBuilder, View, boolean, int, int)>
	//   32   60:putfield        #77  <Field MenuPopupHelper mPopup>
		mPopup.setGravity(i);
	//   33   63:aload_0         
	//   34   64:getfield        #77  <Field MenuPopupHelper mPopup>
	//   35   67:iload_3         
	//   36   68:invokevirtual   #81  <Method void MenuPopupHelper.setGravity(int)>
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
	//   38   72:getfield        #77  <Field MenuPopupHelper mPopup>
	//   39   75:new             #8   <Class PopupMenu$2>
	//   40   78:dup             
	//   41   79:aload_0         
	//   42   80:invokespecial   #82  <Method void PopupMenu$2(PopupMenu)>
	//   43   83:invokevirtual   #86  <Method void MenuPopupHelper.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
	//   44   86:return          
	}

	public void dismiss()
	{
		mPopup.dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field MenuPopupHelper mPopup>
	//    2    4:invokevirtual   #89  <Method void MenuPopupHelper.dismiss()>
	//    3    7:return          
	}

	public android.view.View.OnTouchListener getDragToOpenListener()
	{
		if(mDragListener == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field android.view.View$OnTouchListener mDragListener>
	//*   2    4:ifnonnull       23
			mDragListener = ((android.view.View.OnTouchListener) (new ForwardingListener(mAnchor) {

				public ShowableListMenu getPopup()
				{
					return ((ShowableListMenu) (mPopup.getPopup()));
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field PopupMenu this$0>
				//    2    4:getfield        #25  <Field MenuPopupHelper PopupMenu.mPopup>
				//    3    7:invokevirtual   #30  <Method android.support.v7.view.menu.MenuPopup MenuPopupHelper.getPopup()>
				//    4   10:areturn         
				}

				protected boolean onForwardingStarted()
				{
					show();
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field PopupMenu this$0>
				//    2    4:invokevirtual   #36  <Method void PopupMenu.show()>
					return true;
				//    3    7:iconst_1        
				//    4    8:ireturn         
				}

				protected boolean onForwardingStopped()
				{
					dismiss();
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field PopupMenu this$0>
				//    2    4:invokevirtual   #40  <Method void PopupMenu.dismiss()>
					return true;
				//    3    7:iconst_1        
				//    4    8:ireturn         
				}

				final PopupMenu this$0;

			
			{
				this$0 = PopupMenu.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field PopupMenu this$0>
				super(view);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void ForwardingListener(View)>
			//    6   10:return          
			}
			}
));
	//    3    7:aload_0         
	//    4    8:new             #10  <Class PopupMenu$3>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #56  <Field View mAnchor>
	//    9   17:invokespecial   #96  <Method void PopupMenu$3(PopupMenu, View)>
	//   10   20:putfield        #93  <Field android.view.View$OnTouchListener mDragListener>
		return mDragListener;
	//   11   23:aload_0         
	//   12   24:getfield        #93  <Field android.view.View$OnTouchListener mDragListener>
	//   13   27:areturn         
	}

	public int getGravity()
	{
		return mPopup.getGravity();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field MenuPopupHelper mPopup>
	//    2    4:invokevirtual   #101 <Method int MenuPopupHelper.getGravity()>
	//    3    7:ireturn         
	}

	public Menu getMenu()
	{
		return ((Menu) (mMenu));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field MenuBuilder mMenu>
	//    2    4:areturn         
	}

	public MenuInflater getMenuInflater()
	{
		return ((MenuInflater) (new SupportMenuInflater(mContext)));
	//    0    0:new             #107 <Class SupportMenuInflater>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field Context mContext>
	//    4    8:invokespecial   #108 <Method void SupportMenuInflater(Context)>
	//    5   11:areturn         
	}

	ListView getMenuListView()
	{
		if(!mPopup.isShowing())
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field MenuPopupHelper mPopup>
	//*   2    4:invokevirtual   #118 <Method boolean MenuPopupHelper.isShowing()>
	//*   3    7:ifne            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		else
			return mPopup.getListView();
	//    6   12:aload_0         
	//    7   13:getfield        #77  <Field MenuPopupHelper mPopup>
	//    8   16:invokevirtual   #121 <Method ListView MenuPopupHelper.getListView()>
	//    9   19:areturn         
	}

	public void inflate(int i)
	{
		getMenuInflater().inflate(i, ((Menu) (mMenu)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #125 <Method MenuInflater getMenuInflater()>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #63  <Field MenuBuilder mMenu>
	//    5    9:invokevirtual   #130 <Method void MenuInflater.inflate(int, Menu)>
	//    6   12:return          
	}

	public void setGravity(int i)
	{
		mPopup.setGravity(i);
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field MenuPopupHelper mPopup>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #81  <Method void MenuPopupHelper.setGravity(int)>
	//    4    8:return          
	}

	public void setOnDismissListener(OnDismissListener ondismisslistener)
	{
		mOnDismissListener = ondismisslistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #134 <Field PopupMenu$OnDismissListener mOnDismissListener>
	//    3    5:return          
	}

	public void setOnMenuItemClickListener(OnMenuItemClickListener onmenuitemclicklistener)
	{
		mMenuItemClickListener = onmenuitemclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #138 <Field PopupMenu$OnMenuItemClickListener mMenuItemClickListener>
	//    3    5:return          
	}

	public void show()
	{
		mPopup.show();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field MenuPopupHelper mPopup>
	//    2    4:invokevirtual   #141 <Method void MenuPopupHelper.show()>
	//    3    7:return          
	}

	private final View mAnchor;
	private final Context mContext;
	private android.view.View.OnTouchListener mDragListener;
	private final MenuBuilder mMenu;
	OnMenuItemClickListener mMenuItemClickListener;
	OnDismissListener mOnDismissListener;
	final MenuPopupHelper mPopup;
}
