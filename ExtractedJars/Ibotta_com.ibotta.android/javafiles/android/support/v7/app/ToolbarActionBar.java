// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.WindowCallbackWrapper;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.*;
import android.view.*;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.app:
//			ActionBar

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
		//*   3    7:ifnull          75
			{
				if(mDecorToolbar.isOverflowMenuShowing())
		//*   4   10:aload_0         
		//*   5   11:getfield        #15  <Field ToolbarActionBar this$0>
		//*   6   14:getfield        #31  <Field DecorToolbar ToolbarActionBar.mDecorToolbar>
		//*   7   17:invokeinterface #37  <Method boolean DecorToolbar.isOverflowMenuShowing()>
		//*   8   22:ifeq            41
				{
					mWindowCallback.onPanelClosed(108, ((Menu) (menubuilder)));
		//    9   25:aload_0         
		//   10   26:getfield        #15  <Field ToolbarActionBar this$0>
		//   11   29:getfield        #27  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
		//   12   32:bipush          108
		//   13   34:aload_1         
		//   14   35:invokeinterface #43  <Method void android.view.Window$Callback.onPanelClosed(int, Menu)>
					return;
		//   15   40:return          
				}
				if(mWindowCallback.onPreparePanel(0, ((View) (null)), ((Menu) (menubuilder))))
		//*  16   41:aload_0         
		//*  17   42:getfield        #15  <Field ToolbarActionBar this$0>
		//*  18   45:getfield        #27  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
		//*  19   48:iconst_0        
		//*  20   49:aconst_null     
		//*  21   50:aload_1         
		//*  22   51:invokeinterface #47  <Method boolean android.view.Window$Callback.onPreparePanel(int, View, Menu)>
		//*  23   56:ifeq            75
					mWindowCallback.onMenuOpened(108, ((Menu) (menubuilder)));
		//   24   59:aload_0         
		//   25   60:getfield        #15  <Field ToolbarActionBar this$0>
		//   26   63:getfield        #27  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
		//   27   66:bipush          108
		//   28   68:aload_1         
		//   29   69:invokeinterface #51  <Method boolean android.view.Window$Callback.onMenuOpened(int, Menu)>
		//   30   74:pop             
			}
		//   31   75:return          
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
	//    1    1:invokespecial   #37  <Method void ActionBar()>
		mMenuVisibilityListeners = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #39  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #40  <Method void ArrayList()>
	//    6   12:putfield        #42  <Field ArrayList mMenuVisibilityListeners>
	//    7   15:aload_0         
	//    8   16:new             #6   <Class ToolbarActionBar$1>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #45  <Method void ToolbarActionBar$1(ToolbarActionBar)>
	//   12   24:putfield        #47  <Field Runnable mMenuInvalidator>
	//   13   27:aload_0         
	//   14   28:new             #8   <Class ToolbarActionBar$2>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #48  <Method void ToolbarActionBar$2(ToolbarActionBar)>
	//   18   36:putfield        #50  <Field android.support.v7.widget.Toolbar$OnMenuItemClickListener mMenuClicker>
		mDecorToolbar = ((DecorToolbar) (new ToolbarWidgetWrapper(toolbar, false)));
	//   19   39:aload_0         
	//   20   40:new             #52  <Class ToolbarWidgetWrapper>
	//   21   43:dup             
	//   22   44:aload_1         
	//   23   45:iconst_0        
	//   24   46:invokespecial   #55  <Method void ToolbarWidgetWrapper(Toolbar, boolean)>
	//   25   49:putfield        #57  <Field DecorToolbar mDecorToolbar>
		mWindowCallback = ((android.view.Window.Callback) (new ToolbarCallbackWrapper(callback)));
	//   26   52:aload_0         
	//   27   53:new             #16  <Class ToolbarActionBar$ToolbarCallbackWrapper>
	//   28   56:dup             
	//   29   57:aload_0         
	//   30   58:aload_3         
	//   31   59:invokespecial   #60  <Method void ToolbarActionBar$ToolbarCallbackWrapper(ToolbarActionBar, android.view.Window$Callback)>
	//   32   62:putfield        #62  <Field android.view.Window$Callback mWindowCallback>
		mDecorToolbar.setWindowCallback(mWindowCallback);
	//   33   65:aload_0         
	//   34   66:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//   35   69:aload_0         
	//   36   70:getfield        #62  <Field android.view.Window$Callback mWindowCallback>
	//   37   73:invokeinterface #68  <Method void DecorToolbar.setWindowCallback(android.view.Window$Callback)>
		toolbar.setOnMenuItemClickListener(mMenuClicker);
	//   38   78:aload_1         
	//   39   79:aload_0         
	//   40   80:getfield        #50  <Field android.support.v7.widget.Toolbar$OnMenuItemClickListener mMenuClicker>
	//   41   83:invokevirtual   #74  <Method void Toolbar.setOnMenuItemClickListener(android.support.v7.widget.Toolbar$OnMenuItemClickListener)>
		mDecorToolbar.setWindowTitle(charsequence);
	//   42   86:aload_0         
	//   43   87:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//   44   90:aload_2         
	//   45   91:invokeinterface #78  <Method void DecorToolbar.setWindowTitle(CharSequence)>
	//   46   96:return          
	}

	private Menu getMenu()
	{
		if(!mMenuCallbackSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field boolean mMenuCallbackSet>
	//*   2    4:ifne            37
		{
			mDecorToolbar.setMenuCallbacks(((android.support.v7.view.menu.MenuPresenter.Callback) (new ActionMenuPresenterCallback())), ((android.support.v7.view.menu.MenuBuilder.Callback) (new MenuBuilderCallback())));
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//    5   11:new             #10  <Class ToolbarActionBar$ActionMenuPresenterCallback>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #84  <Method void ToolbarActionBar$ActionMenuPresenterCallback(ToolbarActionBar)>
	//    9   19:new             #13  <Class ToolbarActionBar$MenuBuilderCallback>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #85  <Method void ToolbarActionBar$MenuBuilderCallback(ToolbarActionBar)>
	//   13   27:invokeinterface #89  <Method void DecorToolbar.setMenuCallbacks(android.support.v7.view.menu.MenuPresenter$Callback, android.support.v7.view.menu.MenuBuilder$Callback)>
			mMenuCallbackSet = true;
	//   14   32:aload_0         
	//   15   33:iconst_1        
	//   16   34:putfield        #83  <Field boolean mMenuCallbackSet>
		}
		return mDecorToolbar.getMenu();
	//   17   37:aload_0         
	//   18   38:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//   19   41:invokeinterface #91  <Method Menu DecorToolbar.getMenu()>
	//   20   46:areturn         
	}

	public boolean closeOptionsMenu()
	{
		return mDecorToolbar.hideOverflowMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #96  <Method boolean DecorToolbar.hideOverflowMenu()>
	//    3    9:ireturn         
	}

	public boolean collapseActionView()
	{
		if(mDecorToolbar.hasExpandedActionView())
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//*   2    4:invokeinterface #100 <Method boolean DecorToolbar.hasExpandedActionView()>
	//*   3    9:ifeq            23
		{
			mDecorToolbar.collapseActionView();
	//    4   12:aload_0         
	//    5   13:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//    6   16:invokeinterface #102 <Method void DecorToolbar.collapseActionView()>
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
		if(flag == mLastMenuVisibility)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #106 <Field boolean mLastMenuVisibility>
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mLastMenuVisibility = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #106 <Field boolean mLastMenuVisibility>
		int j = mMenuVisibilityListeners.size();
	//    8   14:aload_0         
	//    9   15:getfield        #42  <Field ArrayList mMenuVisibilityListeners>
	//   10   18:invokevirtual   #110 <Method int ArrayList.size()>
	//   11   21:istore_3        
		for(int i = 0; i < j; i++)
	//*  12   22:iconst_0        
	//*  13   23:istore_2        
	//*  14   24:iload_2         
	//*  15   25:iload_3         
	//*  16   26:icmpge          53
			((ActionBar.OnMenuVisibilityListener)mMenuVisibilityListeners.get(i)).onMenuVisibilityChanged(flag);
	//   17   29:aload_0         
	//   18   30:getfield        #42  <Field ArrayList mMenuVisibilityListeners>
	//   19   33:iload_2         
	//   20   34:invokevirtual   #114 <Method Object ArrayList.get(int)>
	//   21   37:checkcast       #116 <Class ActionBar$OnMenuVisibilityListener>
	//   22   40:iload_1         
	//   23   41:invokeinterface #119 <Method void ActionBar$OnMenuVisibilityListener.onMenuVisibilityChanged(boolean)>

	//   24   46:iload_2         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_2        
	//*  28   50:goto            24
	//   29   53:return          
	}

	public int getDisplayOptions()
	{
		return mDecorToolbar.getDisplayOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #122 <Method int DecorToolbar.getDisplayOptions()>
	//    3    9:ireturn         
	}

	public Context getThemedContext()
	{
		return mDecorToolbar.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #127 <Method Context DecorToolbar.getContext()>
	//    3    9:areturn         
	}

	public android.view.Window.Callback getWrappedWindowCallback()
	{
		return mWindowCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field android.view.Window$Callback mWindowCallback>
	//    2    4:areturn         
	}

	public boolean invalidateOptionsMenu()
	{
		mDecorToolbar.getViewGroup().removeCallbacks(mMenuInvalidator);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #134 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    3    9:aload_0         
	//    4   10:getfield        #47  <Field Runnable mMenuInvalidator>
	//    5   13:invokevirtual   #140 <Method boolean ViewGroup.removeCallbacks(Runnable)>
	//    6   16:pop             
		ViewCompat.postOnAnimation(((View) (mDecorToolbar.getViewGroup())), mMenuInvalidator);
	//    7   17:aload_0         
	//    8   18:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//    9   21:invokeinterface #134 <Method ViewGroup DecorToolbar.getViewGroup()>
	//   10   26:aload_0         
	//   11   27:getfield        #47  <Field Runnable mMenuInvalidator>
	//   12   30:invokestatic    #146 <Method void ViewCompat.postOnAnimation(View, Runnable)>
		return true;
	//   13   33:iconst_1        
	//   14   34:ireturn         
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #150 <Method void ActionBar.onConfigurationChanged(Configuration)>
	//    3    5:return          
	}

	void onDestroy()
	{
		mDecorToolbar.getViewGroup().removeCallbacks(mMenuInvalidator);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #134 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    3    9:aload_0         
	//    4   10:getfield        #47  <Field Runnable mMenuInvalidator>
	//    5   13:invokevirtual   #140 <Method boolean ViewGroup.removeCallbacks(Runnable)>
	//    6   16:pop             
	//    7   17:return          
	}

	public boolean onKeyShortcut(int i, KeyEvent keyevent)
	{
		Menu menu = getMenu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #154 <Method Menu getMenu()>
	//    2    4:astore          5
		if(menu != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          67
		{
			int j;
			if(keyevent != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          23
				j = keyevent.getDeviceId();
	//    7   15:aload_2         
	//    8   16:invokevirtual   #159 <Method int KeyEvent.getDeviceId()>
	//    9   19:istore_3        
			else
	//*  10   20:goto            25
				j = -1;
	//   11   23:iconst_m1       
	//   12   24:istore_3        
			j = KeyCharacterMap.load(j).getKeyboardType();
	//   13   25:iload_3         
	//   14   26:invokestatic    #165 <Method KeyCharacterMap KeyCharacterMap.load(int)>
	//   15   29:invokevirtual   #168 <Method int KeyCharacterMap.getKeyboardType()>
	//   16   32:istore_3        
			boolean flag = true;
	//   17   33:iconst_1        
	//   18   34:istore          4
			if(j == 1)
	//*  19   36:iload_3         
	//*  20   37:iconst_1        
	//*  21   38:icmpeq          44
	//*  22   41:goto            47
				flag = false;
	//   23   44:iconst_0        
	//   24   45:istore          4
			menu.setQwertyMode(flag);
	//   25   47:aload           5
	//   26   49:iload           4
	//   27   51:invokeinterface #173 <Method void Menu.setQwertyMode(boolean)>
			return menu.performShortcut(i, keyevent, 0);
	//   28   56:aload           5
	//   29   58:iload_1         
	//   30   59:aload_2         
	//   31   60:iconst_0        
	//   32   61:invokeinterface #177 <Method boolean Menu.performShortcut(int, KeyEvent, int)>
	//   33   66:ireturn         
		} else
		{
			return false;
	//   34   67:iconst_0        
	//   35   68:ireturn         
		}
	}

	public boolean onMenuKeyEvent(KeyEvent keyevent)
	{
		if(keyevent.getAction() == 1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #182 <Method int KeyEvent.getAction()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			openOptionsMenu();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #185 <Method boolean openOptionsMenu()>
	//    6   12:pop             
		return true;
	//    7   13:iconst_1        
	//    8   14:ireturn         
	}

	public boolean openOptionsMenu()
	{
		return mDecorToolbar.showOverflowMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #188 <Method boolean DecorToolbar.showOverflowMenu()>
	//    3    9:ireturn         
	}

	void populateOptionsMenu()
	{
		MenuBuilder menubuilder;
		Menu menu;
		menu = getMenu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #154 <Method Menu getMenu()>
	//    2    4:astore_2        
		if(menu instanceof MenuBuilder)
	//*   3    5:aload_2         
	//*   4    6:instanceof      #191 <Class MenuBuilder>
	//*   5    9:ifeq            20
			menubuilder = (MenuBuilder)menu;
	//    6   12:aload_2         
	//    7   13:checkcast       #191 <Class MenuBuilder>
	//    8   16:astore_1        
		else
	//*   9   17:goto            22
			menubuilder = null;
	//   10   20:aconst_null     
	//   11   21:astore_1        
		if(menubuilder != null)
	//*  12   22:aload_1         
	//*  13   23:ifnull          30
			menubuilder.stopDispatchingItemsChanged();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #194 <Method void MenuBuilder.stopDispatchingItemsChanged()>
		menu.clear();
	//   16   30:aload_2         
	//   17   31:invokeinterface #197 <Method void Menu.clear()>
		if(!mWindowCallback.onCreatePanelMenu(0, menu) || !mWindowCallback.onPreparePanel(0, ((View) (null)), menu))
	//*  18   36:aload_0         
	//*  19   37:getfield        #62  <Field android.view.Window$Callback mWindowCallback>
	//*  20   40:iconst_0        
	//*  21   41:aload_2         
	//*  22   42:invokeinterface #203 <Method boolean android.view.Window$Callback.onCreatePanelMenu(int, Menu)>
	//*  23   47:ifeq            65
	//*  24   50:aload_0         
	//*  25   51:getfield        #62  <Field android.view.Window$Callback mWindowCallback>
	//*  26   54:iconst_0        
	//*  27   55:aconst_null     
	//*  28   56:aload_2         
	//*  29   57:invokeinterface #207 <Method boolean android.view.Window$Callback.onPreparePanel(int, View, Menu)>
	//*  30   62:ifne            71
			menu.clear();
	//   31   65:aload_2         
	//   32   66:invokeinterface #197 <Method void Menu.clear()>
		if(menubuilder != null)
	//*  33   71:aload_1         
	//*  34   72:ifnull          79
			menubuilder.startDispatchingItemsChanged();
	//   35   75:aload_1         
	//   36   76:invokevirtual   #210 <Method void MenuBuilder.startDispatchingItemsChanged()>
		return;
	//   37   79:return          
		Exception exception;
		exception;
	//   38   80:astore_2        
		if(menubuilder != null)
	//*  39   81:aload_1         
	//*  40   82:ifnull          89
			menubuilder.startDispatchingItemsChanged();
	//   41   85:aload_1         
	//   42   86:invokevirtual   #210 <Method void MenuBuilder.startDispatchingItemsChanged()>
		throw exception;
	//   43   89:aload_2         
	//   44   90:athrow          
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
	//*   1    1:ifeq            9
			byte0 = 4;
	//    2    4:iconst_4        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			byte0 = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		setDisplayOptions(((int) (byte0)), 4);
	//    7   11:aload_0         
	//    8   12:iload_2         
	//    9   13:iconst_4        
	//   10   14:invokevirtual   #216 <Method void setDisplayOptions(int, int)>
	//   11   17:return          
	}

	public void setDisplayOptions(int i, int j)
	{
		int k = mDecorToolbar.getDisplayOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #122 <Method int DecorToolbar.getDisplayOptions()>
	//    3    9:istore_3        
		mDecorToolbar.setDisplayOptions(i & j | j & k);
	//    4   10:aload_0         
	//    5   11:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//    6   14:iload_1         
	//    7   15:iload_2         
	//    8   16:iand            
	//    9   17:iload_2         
	//   10   18:iload_3         
	//   11   19:iand            
	//   12   20:ior             
	//   13   21:invokeinterface #219 <Method void DecorToolbar.setDisplayOptions(int)>
	//   14   26:return          
	}

	public void setDisplayShowHomeEnabled(boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			byte0 = 2;
	//    2    4:iconst_2        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			byte0 = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		setDisplayOptions(((int) (byte0)), 2);
	//    7   11:aload_0         
	//    8   12:iload_2         
	//    9   13:iconst_2        
	//   10   14:invokevirtual   #216 <Method void setDisplayOptions(int, int)>
	//   11   17:return          
	}

	public void setDisplayShowTitleEnabled(boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
			byte0 = 8;
	//    2    4:bipush          8
	//    3    6:istore_2        
		else
	//*   4    7:goto            12
			byte0 = 0;
	//    5   10:iconst_0        
	//    6   11:istore_2        
		setDisplayOptions(((int) (byte0)), 8);
	//    7   12:aload_0         
	//    8   13:iload_2         
	//    9   14:bipush          8
	//   10   16:invokevirtual   #216 <Method void setDisplayOptions(int, int)>
	//   11   19:return          
	}

	public void setDisplayUseLogoEnabled(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #224 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #226 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #231 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public void setElevation(float f)
	{
		ViewCompat.setElevation(((View) (mDecorToolbar.getViewGroup())), f);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #134 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    3    9:fload_1         
	//    4   10:invokestatic    #236 <Method void ViewCompat.setElevation(View, float)>
	//    5   13:return          
	}

	public void setHomeActionContentDescription(int i)
	{
		mDecorToolbar.setNavigationContentDescription(i);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #240 <Method void DecorToolbar.setNavigationContentDescription(int)>
	//    4   10:return          
	}

	public void setHomeAsUpIndicator(Drawable drawable)
	{
		mDecorToolbar.setNavigationIcon(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #245 <Method void DecorToolbar.setNavigationIcon(Drawable)>
	//    4   10:return          
	}

	public void setHomeButtonEnabled(boolean flag)
	{
	//    0    0:return          
	}

	public void setLogo(int i)
	{
		mDecorToolbar.setLogo(i);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #249 <Method void DecorToolbar.setLogo(int)>
	//    4   10:return          
	}

	public void setLogo(Drawable drawable)
	{
		mDecorToolbar.setLogo(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #251 <Method void DecorToolbar.setLogo(Drawable)>
	//    4   10:return          
	}

	public void setShowHideAnimationEnabled(boolean flag)
	{
	//    0    0:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
		mDecorToolbar.setSubtitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #255 <Method void DecorToolbar.setSubtitle(CharSequence)>
	//    4   10:return          
	}

	public void setTitle(int i)
	{
		DecorToolbar decortoolbar = mDecorToolbar;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//    2    4:astore_3        
		CharSequence charsequence;
		if(i != 0)
	//*   3    5:iload_1         
	//*   4    6:ifeq            23
			charsequence = decortoolbar.getContext().getText(i);
	//    5    9:aload_3         
	//    6   10:invokeinterface #127 <Method Context DecorToolbar.getContext()>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #262 <Method CharSequence Context.getText(int)>
	//    9   19:astore_2        
		else
	//*  10   20:goto            25
			charsequence = null;
	//   11   23:aconst_null     
	//   12   24:astore_2        
		decortoolbar.setTitle(charsequence);
	//   13   25:aload_3         
	//   14   26:aload_2         
	//   15   27:invokeinterface #264 <Method void DecorToolbar.setTitle(CharSequence)>
	//   16   32:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mDecorToolbar.setTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #264 <Method void DecorToolbar.setTitle(CharSequence)>
	//    4   10:return          
	}

	public void setWindowTitle(CharSequence charsequence)
	{
		mDecorToolbar.setWindowTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #78  <Method void DecorToolbar.setWindowTitle(CharSequence)>
	//    4   10:return          
	}

	DecorToolbar mDecorToolbar;
	private boolean mLastMenuVisibility;
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
