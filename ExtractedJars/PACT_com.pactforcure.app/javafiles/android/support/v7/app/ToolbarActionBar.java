// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.WindowCallbackWrapper;
import android.support.v7.view.menu.ListMenuPresenter;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.*;
import android.view.*;
import android.widget.SpinnerAdapter;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.app:
//			ActionBar, NavItemSelectedListener

class ToolbarActionBar extends ActionBar
{
	private final class ActionMenuPresenterCallback
		implements android.support.v7.view.menu.MenuPresenter.Callback
	{

		public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
		{
			if(mClosingActionMenu)
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field boolean mClosingActionMenu>
		//*   2    4:ifeq            8
				return;
		//    3    7:return          
			mClosingActionMenu = true;
		//    4    8:aload_0         
		//    5    9:iconst_1        
		//    6   10:putfield        #25  <Field boolean mClosingActionMenu>
			mDecorToolbar.dismissPopupMenus();
		//    7   13:aload_0         
		//    8   14:getfield        #17  <Field ToolbarActionBar this$0>
		//    9   17:getfield        #29  <Field DecorToolbar ToolbarActionBar.mDecorToolbar>
		//   10   20:invokeinterface #34  <Method void DecorToolbar.dismissPopupMenus()>
			if(mWindowCallback != null)
		//*  11   25:aload_0         
		//*  12   26:getfield        #17  <Field ToolbarActionBar this$0>
		//*  13   29:getfield        #38  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
		//*  14   32:ifnull          50
				mWindowCallback.onPanelClosed(108, ((Menu) (menubuilder)));
		//   15   35:aload_0         
		//   16   36:getfield        #17  <Field ToolbarActionBar this$0>
		//   17   39:getfield        #38  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
		//   18   42:bipush          108
		//   19   44:aload_1         
		//   20   45:invokeinterface #44  <Method void android.view.Window$Callback.onPanelClosed(int, Menu)>
			mClosingActionMenu = false;
		//   21   50:aload_0         
		//   22   51:iconst_0        
		//   23   52:putfield        #25  <Field boolean mClosingActionMenu>
		//   24   55:return          
		}

		public boolean onOpenSubMenu(MenuBuilder menubuilder)
		{
			if(mWindowCallback != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field ToolbarActionBar this$0>
		//*   2    4:getfield        #38  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
		//*   3    7:ifnull          28
			{
				mWindowCallback.onMenuOpened(108, ((Menu) (menubuilder)));
		//    4   10:aload_0         
		//    5   11:getfield        #17  <Field ToolbarActionBar this$0>
		//    6   14:getfield        #38  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
		//    7   17:bipush          108
		//    8   19:aload_1         
		//    9   20:invokeinterface #50  <Method boolean android.view.Window$Callback.onMenuOpened(int, Menu)>
		//   10   25:pop             
				return true;
		//   11   26:iconst_1        
		//   12   27:ireturn         
			} else
			{
				return false;
		//   13   28:iconst_0        
		//   14   29:ireturn         
			}
		}

		private boolean mClosingActionMenu;
		final ToolbarActionBar this$0;

		ActionMenuPresenterCallback()
		{
			this$0 = ToolbarActionBar.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field ToolbarActionBar this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}
	}

	private final class MenuBuilderCallback
		implements android.support.v7.view.menu.MenuBuilder.Callback
	{

		public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void onMenuModeChange(MenuBuilder menubuilder)
		{
			if(mWindowCallback != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field ToolbarActionBar this$0>
		//*   2    4:getfield        #27  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
		//*   3    7:ifnull          40
				if(mDecorToolbar.isOverflowMenuShowing())
		//*   4   10:aload_0         
		//*   5   11:getfield        #15  <Field ToolbarActionBar this$0>
		//*   6   14:getfield        #31  <Field DecorToolbar ToolbarActionBar.mDecorToolbar>
		//*   7   17:invokeinterface #37  <Method boolean DecorToolbar.isOverflowMenuShowing()>
		//*   8   22:ifeq            41
					mWindowCallback.onPanelClosed(108, ((Menu) (menubuilder)));
		//    9   25:aload_0         
		//   10   26:getfield        #15  <Field ToolbarActionBar this$0>
		//   11   29:getfield        #27  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
		//   12   32:bipush          108
		//   13   34:aload_1         
		//   14   35:invokeinterface #43  <Method void android.view.Window$Callback.onPanelClosed(int, Menu)>
				else
		//*  15   40:return          
				if(mWindowCallback.onPreparePanel(0, ((View) (null)), ((Menu) (menubuilder))))
		//*  16   41:aload_0         
		//*  17   42:getfield        #15  <Field ToolbarActionBar this$0>
		//*  18   45:getfield        #27  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
		//*  19   48:iconst_0        
		//*  20   49:aconst_null     
		//*  21   50:aload_1         
		//*  22   51:invokeinterface #47  <Method boolean android.view.Window$Callback.onPreparePanel(int, View, Menu)>
		//*  23   56:ifeq            40
				{
					mWindowCallback.onMenuOpened(108, ((Menu) (menubuilder)));
		//   24   59:aload_0         
		//   25   60:getfield        #15  <Field ToolbarActionBar this$0>
		//   26   63:getfield        #27  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
		//   27   66:bipush          108
		//   28   68:aload_1         
		//   29   69:invokeinterface #51  <Method boolean android.view.Window$Callback.onMenuOpened(int, Menu)>
		//   30   74:pop             
					return;
		//   31   75:return          
				}
		}

		final ToolbarActionBar this$0;

		MenuBuilderCallback()
		{
			this$0 = ToolbarActionBar.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ToolbarActionBar this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	private class ToolbarCallbackWrapper extends WindowCallbackWrapper
	{

		public View onCreatePanelView(int i)
		{
			if(i == 0)
		//*   0    0:iload_1         
		//*   1    1:ifne            24
				return new View(mDecorToolbar.getContext());
		//    2    4:new             #21  <Class View>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:getfield        #13  <Field ToolbarActionBar this$0>
		//    6   12:getfield        #25  <Field DecorToolbar ToolbarActionBar.mDecorToolbar>
		//    7   15:invokeinterface #31  <Method Context DecorToolbar.getContext()>
		//    8   20:invokespecial   #34  <Method void View(Context)>
		//    9   23:areturn         
			else
				return super.onCreatePanelView(i);
		//   10   24:aload_0         
		//   11   25:iload_1         
		//   12   26:invokespecial   #36  <Method View WindowCallbackWrapper.onCreatePanelView(int)>
		//   13   29:areturn         
		}

		public boolean onPreparePanel(int i, View view, Menu menu)
		{
			boolean flag = super.onPreparePanel(i, view, menu);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #40  <Method boolean WindowCallbackWrapper.onPreparePanel(int, View, Menu)>
		//    5    7:istore          4
			if(flag && !mToolbarMenuPrepared)
		//*   6    9:iload           4
		//*   7   11:ifeq            44
		//*   8   14:aload_0         
		//*   9   15:getfield        #13  <Field ToolbarActionBar this$0>
		//*  10   18:getfield        #44  <Field boolean ToolbarActionBar.mToolbarMenuPrepared>
		//*  11   21:ifne            44
			{
				mDecorToolbar.setMenuPrepared();
		//   12   24:aload_0         
		//   13   25:getfield        #13  <Field ToolbarActionBar this$0>
		//   14   28:getfield        #25  <Field DecorToolbar ToolbarActionBar.mDecorToolbar>
		//   15   31:invokeinterface #48  <Method void DecorToolbar.setMenuPrepared()>
				mToolbarMenuPrepared = true;
		//   16   36:aload_0         
		//   17   37:getfield        #13  <Field ToolbarActionBar this$0>
		//   18   40:iconst_1        
		//   19   41:putfield        #44  <Field boolean ToolbarActionBar.mToolbarMenuPrepared>
			}
			return flag;
		//   20   44:iload           4
		//   21   46:ireturn         
		}

		final ToolbarActionBar this$0;

		public ToolbarCallbackWrapper(android.view.Window.Callback callback)
		{
			this$0 = ToolbarActionBar.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field ToolbarActionBar this$0>
			super(callback);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #16  <Method void WindowCallbackWrapper(android.view.Window$Callback)>
		//    6   10:return          
		}
	}


	ToolbarActionBar(Toolbar toolbar, CharSequence charsequence, android.view.Window.Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void ActionBar()>
		mMenuVisibilityListeners = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #41  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #42  <Method void ArrayList()>
	//    6   12:putfield        #44  <Field ArrayList mMenuVisibilityListeners>
	//    7   15:aload_0         
	//    8   16:new             #6   <Class ToolbarActionBar$1>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #47  <Method void ToolbarActionBar$1(ToolbarActionBar)>
	//   12   24:putfield        #49  <Field Runnable mMenuInvalidator>
	//   13   27:aload_0         
	//   14   28:new             #8   <Class ToolbarActionBar$2>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #50  <Method void ToolbarActionBar$2(ToolbarActionBar)>
	//   18   36:putfield        #52  <Field android.support.v7.widget.Toolbar$OnMenuItemClickListener mMenuClicker>
		mDecorToolbar = ((DecorToolbar) (new ToolbarWidgetWrapper(toolbar, false)));
	//   19   39:aload_0         
	//   20   40:new             #54  <Class ToolbarWidgetWrapper>
	//   21   43:dup             
	//   22   44:aload_1         
	//   23   45:iconst_0        
	//   24   46:invokespecial   #57  <Method void ToolbarWidgetWrapper(Toolbar, boolean)>
	//   25   49:putfield        #59  <Field DecorToolbar mDecorToolbar>
		mWindowCallback = ((android.view.Window.Callback) (new ToolbarCallbackWrapper(callback)));
	//   26   52:aload_0         
	//   27   53:new             #16  <Class ToolbarActionBar$ToolbarCallbackWrapper>
	//   28   56:dup             
	//   29   57:aload_0         
	//   30   58:aload_3         
	//   31   59:invokespecial   #62  <Method void ToolbarActionBar$ToolbarCallbackWrapper(ToolbarActionBar, android.view.Window$Callback)>
	//   32   62:putfield        #64  <Field android.view.Window$Callback mWindowCallback>
		mDecorToolbar.setWindowCallback(mWindowCallback);
	//   33   65:aload_0         
	//   34   66:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//   35   69:aload_0         
	//   36   70:getfield        #64  <Field android.view.Window$Callback mWindowCallback>
	//   37   73:invokeinterface #70  <Method void DecorToolbar.setWindowCallback(android.view.Window$Callback)>
		toolbar.setOnMenuItemClickListener(mMenuClicker);
	//   38   78:aload_1         
	//   39   79:aload_0         
	//   40   80:getfield        #52  <Field android.support.v7.widget.Toolbar$OnMenuItemClickListener mMenuClicker>
	//   41   83:invokevirtual   #76  <Method void Toolbar.setOnMenuItemClickListener(android.support.v7.widget.Toolbar$OnMenuItemClickListener)>
		mDecorToolbar.setWindowTitle(charsequence);
	//   42   86:aload_0         
	//   43   87:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//   44   90:aload_2         
	//   45   91:invokeinterface #80  <Method void DecorToolbar.setWindowTitle(CharSequence)>
	//   46   96:return          
	}

	private Menu getMenu()
	{
		if(!mMenuCallbackSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field boolean mMenuCallbackSet>
	//*   2    4:ifne            37
		{
			mDecorToolbar.setMenuCallbacks(((android.support.v7.view.menu.MenuPresenter.Callback) (new ActionMenuPresenterCallback())), ((android.support.v7.view.menu.MenuBuilder.Callback) (new MenuBuilderCallback())));
	//    3    7:aload_0         
	//    4    8:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    5   11:new             #10  <Class ToolbarActionBar$ActionMenuPresenterCallback>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #86  <Method void ToolbarActionBar$ActionMenuPresenterCallback(ToolbarActionBar)>
	//    9   19:new             #13  <Class ToolbarActionBar$MenuBuilderCallback>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #87  <Method void ToolbarActionBar$MenuBuilderCallback(ToolbarActionBar)>
	//   13   27:invokeinterface #91  <Method void DecorToolbar.setMenuCallbacks(android.support.v7.view.menu.MenuPresenter$Callback, android.support.v7.view.menu.MenuBuilder$Callback)>
			mMenuCallbackSet = true;
	//   14   32:aload_0         
	//   15   33:iconst_1        
	//   16   34:putfield        #85  <Field boolean mMenuCallbackSet>
		}
		return mDecorToolbar.getMenu();
	//   17   37:aload_0         
	//   18   38:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//   19   41:invokeinterface #93  <Method Menu DecorToolbar.getMenu()>
	//   20   46:areturn         
	}

	public void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
	{
		mMenuVisibilityListeners.add(((Object) (onmenuvisibilitylistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ArrayList mMenuVisibilityListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #99  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void addTab(ActionBar.Tab tab)
	{
		throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
	//    0    0:new             #103 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #105 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #108 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void addTab(ActionBar.Tab tab, int i)
	{
		throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
	//    0    0:new             #103 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #105 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #108 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void addTab(ActionBar.Tab tab, int i, boolean flag)
	{
		throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
	//    0    0:new             #103 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #105 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #108 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void addTab(ActionBar.Tab tab, boolean flag)
	{
		throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
	//    0    0:new             #103 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #105 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #108 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public boolean closeOptionsMenu()
	{
		return mDecorToolbar.hideOverflowMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #116 <Method boolean DecorToolbar.hideOverflowMenu()>
	//    3    9:ireturn         
	}

	public boolean collapseActionView()
	{
		if(mDecorToolbar.hasExpandedActionView())
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//*   2    4:invokeinterface #120 <Method boolean DecorToolbar.hasExpandedActionView()>
	//*   3    9:ifeq            23
		{
			mDecorToolbar.collapseActionView();
	//    4   12:aload_0         
	//    5   13:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    6   16:invokeinterface #122 <Method void DecorToolbar.collapseActionView()>
			return true;
	//    7   21:iconst_1        
	//    8   22:ireturn         
		} else
		{
			return false;
	//    9   23:iconst_0        
	//   10   24:ireturn         
		}
	}

	public void dispatchMenuVisibilityChanged(boolean flag)
	{
		if(flag != mLastMenuVisibility)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #126 <Field boolean mLastMenuVisibility>
	//*   3    5:icmpne          9
	//*   4    8:return          
		{
			mLastMenuVisibility = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #126 <Field boolean mLastMenuVisibility>
			int j = mMenuVisibilityListeners.size();
	//    8   14:aload_0         
	//    9   15:getfield        #44  <Field ArrayList mMenuVisibilityListeners>
	//   10   18:invokevirtual   #130 <Method int ArrayList.size()>
	//   11   21:istore_3        
			int i = 0;
	//   12   22:iconst_0        
	//   13   23:istore_2        
			while(i < j) 
	//*  14   24:iload_2         
	//*  15   25:iload_3         
	//*  16   26:icmpge          8
			{
				((ActionBar.OnMenuVisibilityListener)mMenuVisibilityListeners.get(i)).onMenuVisibilityChanged(flag);
	//   17   29:aload_0         
	//   18   30:getfield        #44  <Field ArrayList mMenuVisibilityListeners>
	//   19   33:iload_2         
	//   20   34:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   21   37:checkcast       #136 <Class ActionBar$OnMenuVisibilityListener>
	//   22   40:iload_1         
	//   23   41:invokeinterface #139 <Method void ActionBar$OnMenuVisibilityListener.onMenuVisibilityChanged(boolean)>
				i++;
	//   24   46:iload_2         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_2        
			}
		}
	//*  28   50:goto            24
	}

	public View getCustomView()
	{
		return mDecorToolbar.getCustomView();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #143 <Method View DecorToolbar.getCustomView()>
	//    3    9:areturn         
	}

	public int getDisplayOptions()
	{
		return mDecorToolbar.getDisplayOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #146 <Method int DecorToolbar.getDisplayOptions()>
	//    3    9:ireturn         
	}

	public float getElevation()
	{
		return ViewCompat.getElevation(((View) (mDecorToolbar.getViewGroup())));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #152 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    3    9:invokestatic    #157 <Method float ViewCompat.getElevation(View)>
	//    4   12:freturn         
	}

	public int getHeight()
	{
		return mDecorToolbar.getHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #160 <Method int DecorToolbar.getHeight()>
	//    3    9:ireturn         
	}

	public int getNavigationItemCount()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getNavigationMode()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getSelectedNavigationIndex()
	{
		return -1;
	//    0    0:iconst_m1       
	//    1    1:ireturn         
	}

	public ActionBar.Tab getSelectedTab()
	{
		throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
	//    0    0:new             #103 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #105 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #108 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public CharSequence getSubtitle()
	{
		return mDecorToolbar.getSubtitle();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #169 <Method CharSequence DecorToolbar.getSubtitle()>
	//    3    9:areturn         
	}

	public ActionBar.Tab getTabAt(int i)
	{
		throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
	//    0    0:new             #103 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #105 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #108 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public int getTabCount()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Context getThemedContext()
	{
		return mDecorToolbar.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #177 <Method Context DecorToolbar.getContext()>
	//    3    9:areturn         
	}

	public CharSequence getTitle()
	{
		return mDecorToolbar.getTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #180 <Method CharSequence DecorToolbar.getTitle()>
	//    3    9:areturn         
	}

	public android.view.Window.Callback getWrappedWindowCallback()
	{
		return mWindowCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field android.view.Window$Callback mWindowCallback>
	//    2    4:areturn         
	}

	public void hide()
	{
		mDecorToolbar.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:bipush          8
	//    3    6:invokeinterface #187 <Method void DecorToolbar.setVisibility(int)>
	//    4   11:return          
	}

	public boolean invalidateOptionsMenu()
	{
		mDecorToolbar.getViewGroup().removeCallbacks(mMenuInvalidator);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #152 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    3    9:aload_0         
	//    4   10:getfield        #49  <Field Runnable mMenuInvalidator>
	//    5   13:invokevirtual   #194 <Method boolean ViewGroup.removeCallbacks(Runnable)>
	//    6   16:pop             
		ViewCompat.postOnAnimation(((View) (mDecorToolbar.getViewGroup())), mMenuInvalidator);
	//    7   17:aload_0         
	//    8   18:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    9   21:invokeinterface #152 <Method ViewGroup DecorToolbar.getViewGroup()>
	//   10   26:aload_0         
	//   11   27:getfield        #49  <Field Runnable mMenuInvalidator>
	//   12   30:invokestatic    #198 <Method void ViewCompat.postOnAnimation(View, Runnable)>
		return true;
	//   13   33:iconst_1        
	//   14   34:ireturn         
	}

	public boolean isShowing()
	{
		return mDecorToolbar.getVisibility() == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #202 <Method int DecorToolbar.getVisibility()>
	//    3    9:ifne            14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	public boolean isTitleTruncated()
	{
		return super.isTitleTruncated();
	//    0    0:aload_0         
	//    1    1:invokespecial   #205 <Method boolean ActionBar.isTitleTruncated()>
	//    2    4:ireturn         
	}

	public ActionBar.Tab newTab()
	{
		throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
	//    0    0:new             #103 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #105 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #108 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #210 <Method void ActionBar.onConfigurationChanged(Configuration)>
	//    3    5:return          
	}

	void onDestroy()
	{
		mDecorToolbar.getViewGroup().removeCallbacks(mMenuInvalidator);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #152 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    3    9:aload_0         
	//    4   10:getfield        #49  <Field Runnable mMenuInvalidator>
	//    5   13:invokevirtual   #194 <Method boolean ViewGroup.removeCallbacks(Runnable)>
	//    6   16:pop             
	//    7   17:return          
	}

	public boolean onKeyShortcut(int i, KeyEvent keyevent)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		Menu menu = getMenu();
	//    2    3:aload_0         
	//    3    4:invokespecial   #214 <Method Menu getMenu()>
	//    4    7:astore          5
		if(menu != null)
	//*   5    9:aload           5
	//*   6   11:ifnull          58
		{
			int j;
			if(keyevent != null)
	//*   7   14:aload_2         
	//*   8   15:ifnull          61
				j = keyevent.getDeviceId();
	//    9   18:aload_2         
	//   10   19:invokevirtual   #219 <Method int KeyEvent.getDeviceId()>
	//   11   22:istore_3        
			else
	//*  12   23:iload_3         
	//*  13   24:invokestatic    #225 <Method KeyCharacterMap KeyCharacterMap.load(int)>
	//*  14   27:invokevirtual   #228 <Method int KeyCharacterMap.getKeyboardType()>
	//*  15   30:iconst_1        
	//*  16   31:icmpeq          66
	//*  17   34:iconst_1        
	//*  18   35:istore          4
	//*  19   37:aload           5
	//*  20   39:iload           4
	//*  21   41:invokeinterface #233 <Method void Menu.setQwertyMode(boolean)>
	//*  22   46:aload           5
	//*  23   48:iload_1         
	//*  24   49:aload_2         
	//*  25   50:iconst_0        
	//*  26   51:invokeinterface #237 <Method boolean Menu.performShortcut(int, KeyEvent, int)>
	//*  27   56:istore          4
	//*  28   58:iload           4
	//*  29   60:ireturn         
				j = -1;
	//   30   61:iconst_m1       
	//   31   62:istore_3        
			if(KeyCharacterMap.load(j).getKeyboardType() != 1)
				flag = true;
			else
	//*  32   63:goto            23
				flag = false;
	//   33   66:iconst_0        
	//   34   67:istore          4
			menu.setQwertyMode(flag);
			flag = menu.performShortcut(i, keyevent, 0);
		}
		return flag;
	//*  35   69:goto            37
	}

	public boolean onMenuKeyEvent(KeyEvent keyevent)
	{
		if(keyevent.getAction() == 1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #242 <Method int KeyEvent.getAction()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			openOptionsMenu();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #245 <Method boolean openOptionsMenu()>
	//    6   12:pop             
		return true;
	//    7   13:iconst_1        
	//    8   14:ireturn         
	}

	public boolean openOptionsMenu()
	{
		return mDecorToolbar.showOverflowMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #248 <Method boolean DecorToolbar.showOverflowMenu()>
	//    3    9:ireturn         
	}

	void populateOptionsMenu()
	{
		MenuBuilder menubuilder;
		Menu menu;
		menubuilder = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		menu = getMenu();
	//    2    2:aload_0         
	//    3    3:invokespecial   #214 <Method Menu getMenu()>
	//    4    6:astore_2        
		if(menu instanceof MenuBuilder)
	//*   5    7:aload_2         
	//*   6    8:instanceof      #251 <Class MenuBuilder>
	//*   7   11:ifeq            19
			menubuilder = (MenuBuilder)menu;
	//    8   14:aload_2         
	//    9   15:checkcast       #251 <Class MenuBuilder>
	//   10   18:astore_1        
		if(menubuilder != null)
	//*  11   19:aload_1         
	//*  12   20:ifnull          27
			menubuilder.stopDispatchingItemsChanged();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #254 <Method void MenuBuilder.stopDispatchingItemsChanged()>
		menu.clear();
	//   15   27:aload_2         
	//   16   28:invokeinterface #257 <Method void Menu.clear()>
		if(!mWindowCallback.onCreatePanelMenu(0, menu) || !mWindowCallback.onPreparePanel(0, ((View) (null)), menu))
	//*  17   33:aload_0         
	//*  18   34:getfield        #64  <Field android.view.Window$Callback mWindowCallback>
	//*  19   37:iconst_0        
	//*  20   38:aload_2         
	//*  21   39:invokeinterface #263 <Method boolean android.view.Window$Callback.onCreatePanelMenu(int, Menu)>
	//*  22   44:ifeq            62
	//*  23   47:aload_0         
	//*  24   48:getfield        #64  <Field android.view.Window$Callback mWindowCallback>
	//*  25   51:iconst_0        
	//*  26   52:aconst_null     
	//*  27   53:aload_2         
	//*  28   54:invokeinterface #267 <Method boolean android.view.Window$Callback.onPreparePanel(int, View, Menu)>
	//*  29   59:ifne            68
			menu.clear();
	//   30   62:aload_2         
	//   31   63:invokeinterface #257 <Method void Menu.clear()>
		if(menubuilder != null)
	//*  32   68:aload_1         
	//*  33   69:ifnull          76
			menubuilder.startDispatchingItemsChanged();
	//   34   72:aload_1         
	//   35   73:invokevirtual   #270 <Method void MenuBuilder.startDispatchingItemsChanged()>
		return;
	//   36   76:return          
		Exception exception;
		exception;
	//   37   77:astore_2        
		if(menubuilder != null)
	//*  38   78:aload_1         
	//*  39   79:ifnull          86
			menubuilder.startDispatchingItemsChanged();
	//   40   82:aload_1         
	//   41   83:invokevirtual   #270 <Method void MenuBuilder.startDispatchingItemsChanged()>
		throw exception;
	//   42   86:aload_2         
	//   43   87:athrow          
	}

	public void removeAllTabs()
	{
		throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
	//    0    0:new             #103 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #105 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #108 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
	{
		mMenuVisibilityListeners.remove(((Object) (onmenuvisibilitylistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ArrayList mMenuVisibilityListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #275 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void removeTab(ActionBar.Tab tab)
	{
		throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
	//    0    0:new             #103 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #105 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #108 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void removeTabAt(int i)
	{
		throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
	//    0    0:new             #103 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #105 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #108 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public boolean requestFocus()
	{
		ViewGroup viewgroup = mDecorToolbar.getViewGroup();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #152 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    3    9:astore_1        
		if(viewgroup != null && !viewgroup.hasFocus())
	//*   4   10:aload_1         
	//*   5   11:ifnull          28
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #281 <Method boolean ViewGroup.hasFocus()>
	//*   8   18:ifne            28
		{
			viewgroup.requestFocus();
	//    9   21:aload_1         
	//   10   22:invokevirtual   #283 <Method boolean ViewGroup.requestFocus()>
	//   11   25:pop             
			return true;
	//   12   26:iconst_1        
	//   13   27:ireturn         
		} else
		{
			return false;
	//   14   28:iconst_0        
	//   15   29:ireturn         
		}
	}

	public void selectTab(ActionBar.Tab tab)
	{
		throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
	//    0    0:new             #103 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #105 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #108 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		mDecorToolbar.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #289 <Method void DecorToolbar.setBackgroundDrawable(Drawable)>
	//    4   10:return          
	}

	public void setCustomView(int i)
	{
		setCustomView(LayoutInflater.from(mDecorToolbar.getContext()).inflate(i, mDecorToolbar.getViewGroup(), false));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    3    5:invokeinterface #177 <Method Context DecorToolbar.getContext()>
	//    4   10:invokestatic    #297 <Method LayoutInflater LayoutInflater.from(Context)>
	//    5   13:iload_1         
	//    6   14:aload_0         
	//    7   15:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    8   18:invokeinterface #152 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    9   23:iconst_0        
	//   10   24:invokevirtual   #301 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   11   27:invokevirtual   #304 <Method void setCustomView(View)>
	//   12   30:return          
	}

	public void setCustomView(View view)
	{
		setCustomView(view, new ActionBar.LayoutParams(-2, -2));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #306 <Class ActionBar$LayoutParams>
	//    3    5:dup             
	//    4    6:bipush          -2
	//    5    8:bipush          -2
	//    6   10:invokespecial   #309 <Method void ActionBar$LayoutParams(int, int)>
	//    7   13:invokevirtual   #312 <Method void setCustomView(View, ActionBar$LayoutParams)>
	//    8   16:return          
	}

	public void setCustomView(View view, ActionBar.LayoutParams layoutparams)
	{
		if(view != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #318 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		mDecorToolbar.setCustomView(view);
	//    5    9:aload_0         
	//    6   10:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    7   13:aload_1         
	//    8   14:invokeinterface #319 <Method void DecorToolbar.setCustomView(View)>
	//    9   19:return          
	}

	public void setDefaultDisplayHomeAsUpEnabled(boolean flag)
	{
	//    0    0:return          
	}

	public void setDisplayHomeAsUpEnabled(boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            13
			byte0 = 4;
	//    2    4:iconst_4        
	//    3    5:istore_2        
		else
	//*   4    6:aload_0         
	//*   5    7:iload_2         
	//*   6    8:iconst_4        
	//*   7    9:invokevirtual   #324 <Method void setDisplayOptions(int, int)>
	//*   8   12:return          
			byte0 = 0;
	//    9   13:iconst_0        
	//   10   14:istore_2        
		setDisplayOptions(((int) (byte0)), 4);
	//*  11   15:goto            6
	}

	public void setDisplayOptions(int i)
	{
		setDisplayOptions(i, -1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #324 <Method void setDisplayOptions(int, int)>
	//    4    6:return          
	}

	public void setDisplayOptions(int i, int j)
	{
		int k = mDecorToolbar.getDisplayOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #146 <Method int DecorToolbar.getDisplayOptions()>
	//    3    9:istore_3        
		mDecorToolbar.setDisplayOptions(i & j | ~j & k);
	//    4   10:aload_0         
	//    5   11:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    6   14:iload_1         
	//    7   15:iload_2         
	//    8   16:iand            
	//    9   17:iload_2         
	//   10   18:iconst_m1       
	//   11   19:ixor            
	//   12   20:iload_3         
	//   13   21:iand            
	//   14   22:ior             
	//   15   23:invokeinterface #326 <Method void DecorToolbar.setDisplayOptions(int)>
	//   16   28:return          
	}

	public void setDisplayShowCustomEnabled(boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            15
			byte0 = 16;
	//    2    4:bipush          16
	//    3    6:istore_2        
		else
	//*   4    7:aload_0         
	//*   5    8:iload_2         
	//*   6    9:bipush          16
	//*   7   11:invokevirtual   #324 <Method void setDisplayOptions(int, int)>
	//*   8   14:return          
			byte0 = 0;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		setDisplayOptions(((int) (byte0)), 16);
	//*  11   17:goto            7
	}

	public void setDisplayShowHomeEnabled(boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            13
			byte0 = 2;
	//    2    4:iconst_2        
	//    3    5:istore_2        
		else
	//*   4    6:aload_0         
	//*   5    7:iload_2         
	//*   6    8:iconst_2        
	//*   7    9:invokevirtual   #324 <Method void setDisplayOptions(int, int)>
	//*   8   12:return          
			byte0 = 0;
	//    9   13:iconst_0        
	//   10   14:istore_2        
		setDisplayOptions(((int) (byte0)), 2);
	//*  11   15:goto            6
	}

	public void setDisplayShowTitleEnabled(boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            15
			byte0 = 8;
	//    2    4:bipush          8
	//    3    6:istore_2        
		else
	//*   4    7:aload_0         
	//*   5    8:iload_2         
	//*   6    9:bipush          8
	//*   7   11:invokevirtual   #324 <Method void setDisplayOptions(int, int)>
	//*   8   14:return          
			byte0 = 0;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		setDisplayOptions(((int) (byte0)), 8);
	//*  11   17:goto            7
	}

	public void setDisplayUseLogoEnabled(boolean flag)
	{
		int i;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            13
			i = 1;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:aload_0         
	//*   5    7:iload_2         
	//*   6    8:iconst_1        
	//*   7    9:invokevirtual   #324 <Method void setDisplayOptions(int, int)>
	//*   8   12:return          
			i = 0;
	//    9   13:iconst_0        
	//   10   14:istore_2        
		setDisplayOptions(i, 1);
	//*  11   15:goto            6
	}

	public void setElevation(float f)
	{
		ViewCompat.setElevation(((View) (mDecorToolbar.getViewGroup())), f);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #152 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    3    9:fload_1         
	//    4   10:invokestatic    #335 <Method void ViewCompat.setElevation(View, float)>
	//    5   13:return          
	}

	public void setHomeActionContentDescription(int i)
	{
		mDecorToolbar.setNavigationContentDescription(i);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #339 <Method void DecorToolbar.setNavigationContentDescription(int)>
	//    4   10:return          
	}

	public void setHomeActionContentDescription(CharSequence charsequence)
	{
		mDecorToolbar.setNavigationContentDescription(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #341 <Method void DecorToolbar.setNavigationContentDescription(CharSequence)>
	//    4   10:return          
	}

	public void setHomeAsUpIndicator(int i)
	{
		mDecorToolbar.setNavigationIcon(i);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #345 <Method void DecorToolbar.setNavigationIcon(int)>
	//    4   10:return          
	}

	public void setHomeAsUpIndicator(Drawable drawable)
	{
		mDecorToolbar.setNavigationIcon(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #347 <Method void DecorToolbar.setNavigationIcon(Drawable)>
	//    4   10:return          
	}

	public void setHomeButtonEnabled(boolean flag)
	{
	//    0    0:return          
	}

	public void setIcon(int i)
	{
		mDecorToolbar.setIcon(i);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #351 <Method void DecorToolbar.setIcon(int)>
	//    4   10:return          
	}

	public void setIcon(Drawable drawable)
	{
		mDecorToolbar.setIcon(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #353 <Method void DecorToolbar.setIcon(Drawable)>
	//    4   10:return          
	}

	public void setListNavigationCallbacks(SpinnerAdapter spinneradapter, ActionBar.OnNavigationListener onnavigationlistener)
	{
		mDecorToolbar.setDropdownParams(spinneradapter, ((android.widget.AdapterView.OnItemSelectedListener) (new NavItemSelectedListener(onnavigationlistener))));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:new             #357 <Class NavItemSelectedListener>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #360 <Method void NavItemSelectedListener(ActionBar$OnNavigationListener)>
	//    7   13:invokeinterface #364 <Method void DecorToolbar.setDropdownParams(SpinnerAdapter, android.widget.AdapterView$OnItemSelectedListener)>
	//    8   18:return          
	}

	public void setLogo(int i)
	{
		mDecorToolbar.setLogo(i);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #367 <Method void DecorToolbar.setLogo(int)>
	//    4   10:return          
	}

	public void setLogo(Drawable drawable)
	{
		mDecorToolbar.setLogo(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #369 <Method void DecorToolbar.setLogo(Drawable)>
	//    4   10:return          
	}

	public void setNavigationMode(int i)
	{
		if(i == 2)
	//*   0    0:iload_1         
	//*   1    1:iconst_2        
	//*   2    2:icmpne          16
		{
			throw new IllegalArgumentException("Tabs not supported in this configuration");
	//    3    5:new             #372 <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:ldc2            #374 <String "Tabs not supported in this configuration">
	//    6   12:invokespecial   #375 <Method void IllegalArgumentException(String)>
	//    7   15:athrow          
		} else
		{
			mDecorToolbar.setNavigationMode(i);
	//    8   16:aload_0         
	//    9   17:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//   10   20:iload_1         
	//   11   21:invokeinterface #377 <Method void DecorToolbar.setNavigationMode(int)>
			return;
	//   12   26:return          
		}
	}

	public void setSelectedNavigationItem(int i)
	{
		switch(mDecorToolbar.getNavigationMode())
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//*   2    4:invokeinterface #380 <Method int DecorToolbar.getNavigationMode()>
		{
	//*   3    9:tableswitch     1 1: default 28
	//	               1 39
		default:
			throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
	//    4   28:new             #382 <Class IllegalStateException>
	//    5   31:dup             
	//    6   32:ldc2            #384 <String "setSelectedNavigationIndex not valid for current navigation mode">
	//    7   35:invokespecial   #385 <Method void IllegalStateException(String)>
	//    8   38:athrow          

		case 1: // '\001'
			mDecorToolbar.setDropdownSelectedPosition(i);
	//    9   39:aload_0         
	//   10   40:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//   11   43:iload_1         
	//   12   44:invokeinterface #388 <Method void DecorToolbar.setDropdownSelectedPosition(int)>
			break;
		}
	//   13   49:return          
	}

	public void setShowHideAnimationEnabled(boolean flag)
	{
	//    0    0:return          
	}

	public void setSplitBackgroundDrawable(Drawable drawable)
	{
	//    0    0:return          
	}

	public void setStackedBackgroundDrawable(Drawable drawable)
	{
	//    0    0:return          
	}

	public void setSubtitle(int i)
	{
		DecorToolbar decortoolbar = mDecorToolbar;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:astore_3        
		CharSequence charsequence;
		if(i != 0)
	//*   3    5:iload_1         
	//*   4    6:ifeq            31
			charsequence = mDecorToolbar.getContext().getText(i);
	//    5    9:aload_0         
	//    6   10:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    7   13:invokeinterface #177 <Method Context DecorToolbar.getContext()>
	//    8   18:iload_1         
	//    9   19:invokevirtual   #398 <Method CharSequence Context.getText(int)>
	//   10   22:astore_2        
		else
	//*  11   23:aload_3         
	//*  12   24:aload_2         
	//*  13   25:invokeinterface #400 <Method void DecorToolbar.setSubtitle(CharSequence)>
	//*  14   30:return          
			charsequence = null;
	//   15   31:aconst_null     
	//   16   32:astore_2        
		decortoolbar.setSubtitle(charsequence);
	//*  17   33:goto            23
	}

	public void setSubtitle(CharSequence charsequence)
	{
		mDecorToolbar.setSubtitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #400 <Method void DecorToolbar.setSubtitle(CharSequence)>
	//    4   10:return          
	}

	public void setTitle(int i)
	{
		DecorToolbar decortoolbar = mDecorToolbar;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:astore_3        
		CharSequence charsequence;
		if(i != 0)
	//*   3    5:iload_1         
	//*   4    6:ifeq            31
			charsequence = mDecorToolbar.getContext().getText(i);
	//    5    9:aload_0         
	//    6   10:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    7   13:invokeinterface #177 <Method Context DecorToolbar.getContext()>
	//    8   18:iload_1         
	//    9   19:invokevirtual   #398 <Method CharSequence Context.getText(int)>
	//   10   22:astore_2        
		else
	//*  11   23:aload_3         
	//*  12   24:aload_2         
	//*  13   25:invokeinterface #403 <Method void DecorToolbar.setTitle(CharSequence)>
	//*  14   30:return          
			charsequence = null;
	//   15   31:aconst_null     
	//   16   32:astore_2        
		decortoolbar.setTitle(charsequence);
	//*  17   33:goto            23
	}

	public void setTitle(CharSequence charsequence)
	{
		mDecorToolbar.setTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #403 <Method void DecorToolbar.setTitle(CharSequence)>
	//    4   10:return          
	}

	public void setWindowTitle(CharSequence charsequence)
	{
		mDecorToolbar.setWindowTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #80  <Method void DecorToolbar.setWindowTitle(CharSequence)>
	//    4   10:return          
	}

	public void show()
	{
		mDecorToolbar.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DecorToolbar mDecorToolbar>
	//    2    4:iconst_0        
	//    3    5:invokeinterface #187 <Method void DecorToolbar.setVisibility(int)>
	//    4   10:return          
	}

	DecorToolbar mDecorToolbar;
	private boolean mLastMenuVisibility;
	private ListMenuPresenter mListMenuPresenter;
	private boolean mMenuCallbackSet;
	private final android.support.v7.widget.Toolbar.OnMenuItemClickListener mMenuClicker = new android.support.v7.widget.Toolbar.OnMenuItemClickListener() {

		public boolean onMenuItemClick(MenuItem menuitem)
		{
			return mWindowCallback.onMenuItemSelected(0, menuitem);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field ToolbarActionBar this$0>
		//    2    4:getfield        #24  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
		//    3    7:iconst_0        
		//    4    8:aload_1         
		//    5    9:invokeinterface #30  <Method boolean android.view.Window$Callback.onMenuItemSelected(int, MenuItem)>
		//    6   14:ireturn         
		}

		final ToolbarActionBar this$0;

			
			{
				this$0 = ToolbarActionBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ToolbarActionBar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final Runnable mMenuInvalidator = new Runnable() {

		public void run()
		{
			populateOptionsMenu();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field ToolbarActionBar this$0>
		//    2    4:invokevirtual   #22  <Method void ToolbarActionBar.populateOptionsMenu()>
		//    3    7:return          
		}

		final ToolbarActionBar this$0;

			
			{
				this$0 = ToolbarActionBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ToolbarActionBar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private ArrayList mMenuVisibilityListeners;
	boolean mToolbarMenuPrepared;
	android.view.Window.Callback mWindowCallback;
}
