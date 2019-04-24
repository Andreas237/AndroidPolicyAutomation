// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.WindowCallbackWrapper;
import android.support.v7.view.menu.ListMenuPresenter;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.*;
import android.util.TypedValue;
import android.view.*;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.app:
//			ActionBar, NavItemSelectedListener

class ToolbarActionBar extends ActionBar
{
	final class ActionMenuPresenterCallback
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

	final class MenuBuilderCallback
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

	final class PanelMenuPresenterCallback
		implements android.support.v7.view.menu.MenuPresenter.Callback
	{

		public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
		{
			if(mWindowCallback != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field ToolbarActionBar this$0>
		//*   2    4:getfield        #25  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
		//*   3    7:ifnull          24
				mWindowCallback.onPanelClosed(0, ((Menu) (menubuilder)));
		//    4   10:aload_0         
		//    5   11:getfield        #15  <Field ToolbarActionBar this$0>
		//    6   14:getfield        #25  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
		//    7   17:iconst_0        
		//    8   18:aload_1         
		//    9   19:invokeinterface #31  <Method void android.view.Window$Callback.onPanelClosed(int, Menu)>
		//   10   24:return          
		}

		public boolean onOpenSubMenu(MenuBuilder menubuilder)
		{
			if(menubuilder == null && mWindowCallback != null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       29
		//*   2    4:aload_0         
		//*   3    5:getfield        #15  <Field ToolbarActionBar this$0>
		//*   4    8:getfield        #25  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
		//*   5   11:ifnull          29
				mWindowCallback.onMenuOpened(0, ((Menu) (menubuilder)));
		//    6   14:aload_0         
		//    7   15:getfield        #15  <Field ToolbarActionBar this$0>
		//    8   18:getfield        #25  <Field android.view.Window$Callback ToolbarActionBar.mWindowCallback>
		//    9   21:iconst_0        
		//   10   22:aload_1         
		//   11   23:invokeinterface #37  <Method boolean android.view.Window$Callback.onMenuOpened(int, Menu)>
		//   12   28:pop             
			return true;
		//   13   29:iconst_1        
		//   14   30:ireturn         
		}

		final ToolbarActionBar this$0;

		PanelMenuPresenterCallback()
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

	class ToolbarCallbackWrapper extends WindowCallbackWrapper
	{

		public View onCreatePanelView(int i)
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    1: default 20
		//		               0: 23
		//*   2   20:goto            64
			case 0: // '\0'
				Menu menu = mDecorToolbar.getMenu();
		//    3   23:aload_0         
		//    4   24:getfield        #13  <Field ToolbarActionBar this$0>
		//    5   27:getfield        #23  <Field DecorToolbar ToolbarActionBar.mDecorToolbar>
		//    6   30:invokeinterface #29  <Method Menu DecorToolbar.getMenu()>
		//    7   35:astore_2        
				if(onPreparePanel(i, ((View) (null)), menu) && onMenuOpened(i, menu))
		//*   8   36:aload_0         
		//*   9   37:iload_1         
		//*  10   38:aconst_null     
		//*  11   39:aload_2         
		//*  12   40:invokevirtual   #33  <Method boolean onPreparePanel(int, View, Menu)>
		//*  13   43:ifeq            64
		//*  14   46:aload_0         
		//*  15   47:iload_1         
		//*  16   48:aload_2         
		//*  17   49:invokevirtual   #37  <Method boolean onMenuOpened(int, Menu)>
		//*  18   52:ifeq            64
					return getListMenuView(menu);
		//   19   55:aload_0         
		//   20   56:getfield        #13  <Field ToolbarActionBar this$0>
		//   21   59:aload_2         
		//   22   60:invokevirtual   #41  <Method View ToolbarActionBar.getListMenuView(Menu)>
		//   23   63:areturn         
				break;
			}
			return super.onCreatePanelView(i);
		//   24   64:aload_0         
		//   25   65:iload_1         
		//   26   66:invokespecial   #43  <Method View WindowCallbackWrapper.onCreatePanelView(int)>
		//   27   69:areturn         
		}

		public boolean onPreparePanel(int i, View view, Menu menu)
		{
			boolean flag = super.onPreparePanel(i, view, menu);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #44  <Method boolean WindowCallbackWrapper.onPreparePanel(int, View, Menu)>
		//    5    7:istore          4
			if(flag && !mToolbarMenuPrepared)
		//*   6    9:iload           4
		//*   7   11:ifeq            44
		//*   8   14:aload_0         
		//*   9   15:getfield        #13  <Field ToolbarActionBar this$0>
		//*  10   18:getfield        #48  <Field boolean ToolbarActionBar.mToolbarMenuPrepared>
		//*  11   21:ifne            44
			{
				mDecorToolbar.setMenuPrepared();
		//   12   24:aload_0         
		//   13   25:getfield        #13  <Field ToolbarActionBar this$0>
		//   14   28:getfield        #23  <Field DecorToolbar ToolbarActionBar.mDecorToolbar>
		//   15   31:invokeinterface #52  <Method void DecorToolbar.setMenuPrepared()>
				mToolbarMenuPrepared = true;
		//   16   36:aload_0         
		//   17   37:getfield        #13  <Field ToolbarActionBar this$0>
		//   18   40:iconst_1        
		//   19   41:putfield        #48  <Field boolean ToolbarActionBar.mToolbarMenuPrepared>
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


	public ToolbarActionBar(Toolbar toolbar, CharSequence charsequence, android.view.Window.Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void ActionBar()>
		mMenuVisibilityListeners = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #44  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #45  <Method void ArrayList()>
	//    6   12:putfield        #47  <Field ArrayList mMenuVisibilityListeners>
	//    7   15:aload_0         
	//    8   16:new             #6   <Class ToolbarActionBar$1>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #50  <Method void ToolbarActionBar$1(ToolbarActionBar)>
	//   12   24:putfield        #52  <Field Runnable mMenuInvalidator>
	//   13   27:aload_0         
	//   14   28:new             #8   <Class ToolbarActionBar$2>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #53  <Method void ToolbarActionBar$2(ToolbarActionBar)>
	//   18   36:putfield        #55  <Field android.support.v7.widget.Toolbar$OnMenuItemClickListener mMenuClicker>
		mDecorToolbar = ((DecorToolbar) (new ToolbarWidgetWrapper(toolbar, false)));
	//   19   39:aload_0         
	//   20   40:new             #57  <Class ToolbarWidgetWrapper>
	//   21   43:dup             
	//   22   44:aload_1         
	//   23   45:iconst_0        
	//   24   46:invokespecial   #60  <Method void ToolbarWidgetWrapper(Toolbar, boolean)>
	//   25   49:putfield        #62  <Field DecorToolbar mDecorToolbar>
		mWindowCallback = ((android.view.Window.Callback) (new ToolbarCallbackWrapper(callback)));
	//   26   52:aload_0         
	//   27   53:new             #19  <Class ToolbarActionBar$ToolbarCallbackWrapper>
	//   28   56:dup             
	//   29   57:aload_0         
	//   30   58:aload_3         
	//   31   59:invokespecial   #65  <Method void ToolbarActionBar$ToolbarCallbackWrapper(ToolbarActionBar, android.view.Window$Callback)>
	//   32   62:putfield        #67  <Field android.view.Window$Callback mWindowCallback>
		mDecorToolbar.setWindowCallback(mWindowCallback);
	//   33   65:aload_0         
	//   34   66:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//   35   69:aload_0         
	//   36   70:getfield        #67  <Field android.view.Window$Callback mWindowCallback>
	//   37   73:invokeinterface #73  <Method void DecorToolbar.setWindowCallback(android.view.Window$Callback)>
		toolbar.setOnMenuItemClickListener(mMenuClicker);
	//   38   78:aload_1         
	//   39   79:aload_0         
	//   40   80:getfield        #55  <Field android.support.v7.widget.Toolbar$OnMenuItemClickListener mMenuClicker>
	//   41   83:invokevirtual   #79  <Method void Toolbar.setOnMenuItemClickListener(android.support.v7.widget.Toolbar$OnMenuItemClickListener)>
		mDecorToolbar.setWindowTitle(charsequence);
	//   42   86:aload_0         
	//   43   87:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//   44   90:aload_2         
	//   45   91:invokeinterface #83  <Method void DecorToolbar.setWindowTitle(CharSequence)>
	//   46   96:return          
	}

	private void ensureListMenuPresenter(Menu menu)
	{
		if(mListMenuPresenter == null && (menu instanceof MenuBuilder))
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field ListMenuPresenter mListMenuPresenter>
	//*   2    4:ifnonnull       179
	//*   3    7:aload_1         
	//*   4    8:instanceof      #90  <Class MenuBuilder>
	//*   5   11:ifeq            179
		{
			menu = ((Menu) ((MenuBuilder)menu));
	//    6   14:aload_1         
	//    7   15:checkcast       #90  <Class MenuBuilder>
	//    8   18:astore_1        
			Object obj = ((Object) (mDecorToolbar.getContext()));
	//    9   19:aload_0         
	//   10   20:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//   11   23:invokeinterface #94  <Method Context DecorToolbar.getContext()>
	//   12   28:astore_3        
			TypedValue typedvalue = new TypedValue();
	//   13   29:new             #96  <Class TypedValue>
	//   14   32:dup             
	//   15   33:invokespecial   #97  <Method void TypedValue()>
	//   16   36:astore          4
			android.content.res.Resources.Theme theme = ((Context) (obj)).getResources().newTheme();
	//   17   38:aload_3         
	//   18   39:invokevirtual   #103 <Method Resources Context.getResources()>
	//   19   42:invokevirtual   #109 <Method android.content.res.Resources$Theme Resources.newTheme()>
	//   20   45:astore_2        
			theme.setTo(((Context) (obj)).getTheme());
	//   21   46:aload_2         
	//   22   47:aload_3         
	//   23   48:invokevirtual   #112 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   24   51:invokevirtual   #118 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
			theme.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarPopupTheme, typedvalue, true);
	//   25   54:aload_2         
	//   26   55:getstatic       #124 <Field int android.support.v7.appcompat.R$attr.actionBarPopupTheme>
	//   27   58:aload           4
	//   28   60:iconst_1        
	//   29   61:invokevirtual   #128 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   30   64:pop             
			if(typedvalue.resourceId != 0)
	//*  31   65:aload           4
	//*  32   67:getfield        #131 <Field int TypedValue.resourceId>
	//*  33   70:ifeq            83
				theme.applyStyle(typedvalue.resourceId, true);
	//   34   73:aload_2         
	//   35   74:aload           4
	//   36   76:getfield        #131 <Field int TypedValue.resourceId>
	//   37   79:iconst_1        
	//   38   80:invokevirtual   #135 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
			theme.resolveAttribute(android.support.v7.appcompat.R.attr.panelMenuListTheme, typedvalue, true);
	//   39   83:aload_2         
	//   40   84:getstatic       #138 <Field int android.support.v7.appcompat.R$attr.panelMenuListTheme>
	//   41   87:aload           4
	//   42   89:iconst_1        
	//   43   90:invokevirtual   #128 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   44   93:pop             
			if(typedvalue.resourceId != 0)
	//*  45   94:aload           4
	//*  46   96:getfield        #131 <Field int TypedValue.resourceId>
	//*  47   99:ifeq            115
				theme.applyStyle(typedvalue.resourceId, true);
	//   48  102:aload_2         
	//   49  103:aload           4
	//   50  105:getfield        #131 <Field int TypedValue.resourceId>
	//   51  108:iconst_1        
	//   52  109:invokevirtual   #135 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
			else
	//*  53  112:goto            123
				theme.applyStyle(android.support.v7.appcompat.R.style.Theme_AppCompat_CompactMenu, true);
	//   54  115:aload_2         
	//   55  116:getstatic       #143 <Field int android.support.v7.appcompat.R$style.Theme_AppCompat_CompactMenu>
	//   56  119:iconst_1        
	//   57  120:invokevirtual   #135 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
			obj = ((Object) (new ContextThemeWrapper(((Context) (obj)), 0)));
	//   58  123:new             #145 <Class ContextThemeWrapper>
	//   59  126:dup             
	//   60  127:aload_3         
	//   61  128:iconst_0        
	//   62  129:invokespecial   #148 <Method void ContextThemeWrapper(Context, int)>
	//   63  132:astore_3        
			((Context) (obj)).getTheme().setTo(theme);
	//   64  133:aload_3         
	//   65  134:invokevirtual   #112 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   66  137:aload_2         
	//   67  138:invokevirtual   #118 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
			mListMenuPresenter = new ListMenuPresenter(((Context) (obj)), android.support.v7.appcompat.R.layout.abc_list_menu_item_layout);
	//   68  141:aload_0         
	//   69  142:new             #150 <Class ListMenuPresenter>
	//   70  145:dup             
	//   71  146:aload_3         
	//   72  147:getstatic       #155 <Field int android.support.v7.appcompat.R$layout.abc_list_menu_item_layout>
	//   73  150:invokespecial   #156 <Method void ListMenuPresenter(Context, int)>
	//   74  153:putfield        #88  <Field ListMenuPresenter mListMenuPresenter>
			mListMenuPresenter.setCallback(((android.support.v7.view.menu.MenuPresenter.Callback) (new PanelMenuPresenterCallback())));
	//   75  156:aload_0         
	//   76  157:getfield        #88  <Field ListMenuPresenter mListMenuPresenter>
	//   77  160:new             #16  <Class ToolbarActionBar$PanelMenuPresenterCallback>
	//   78  163:dup             
	//   79  164:aload_0         
	//   80  165:invokespecial   #157 <Method void ToolbarActionBar$PanelMenuPresenterCallback(ToolbarActionBar)>
	//   81  168:invokevirtual   #161 <Method void ListMenuPresenter.setCallback(android.support.v7.view.menu.MenuPresenter$Callback)>
			((MenuBuilder) (menu)).addMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (mListMenuPresenter)));
	//   82  171:aload_1         
	//   83  172:aload_0         
	//   84  173:getfield        #88  <Field ListMenuPresenter mListMenuPresenter>
	//   85  176:invokevirtual   #165 <Method void MenuBuilder.addMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
		}
	//   86  179:return          
	}

	private Menu getMenu()
	{
		if(!mMenuCallbackSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field boolean mMenuCallbackSet>
	//*   2    4:ifne            37
		{
			mDecorToolbar.setMenuCallbacks(((android.support.v7.view.menu.MenuPresenter.Callback) (new ActionMenuPresenterCallback())), ((android.support.v7.view.menu.MenuBuilder.Callback) (new MenuBuilderCallback())));
	//    3    7:aload_0         
	//    4    8:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    5   11:new             #10  <Class ToolbarActionBar$ActionMenuPresenterCallback>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #170 <Method void ToolbarActionBar$ActionMenuPresenterCallback(ToolbarActionBar)>
	//    9   19:new             #13  <Class ToolbarActionBar$MenuBuilderCallback>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #171 <Method void ToolbarActionBar$MenuBuilderCallback(ToolbarActionBar)>
	//   13   27:invokeinterface #175 <Method void DecorToolbar.setMenuCallbacks(android.support.v7.view.menu.MenuPresenter$Callback, android.support.v7.view.menu.MenuBuilder$Callback)>
			mMenuCallbackSet = true;
	//   14   32:aload_0         
	//   15   33:iconst_1        
	//   16   34:putfield        #169 <Field boolean mMenuCallbackSet>
		}
		return mDecorToolbar.getMenu();
	//   17   37:aload_0         
	//   18   38:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//   19   41:invokeinterface #177 <Method Menu DecorToolbar.getMenu()>
	//   20   46:areturn         
	}

	public void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
	{
		mMenuVisibilityListeners.add(((Object) (onmenuvisibilitylistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ArrayList mMenuVisibilityListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #183 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void addTab(ActionBar.Tab tab)
	{
		throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
	//    0    0:new             #187 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #189 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #192 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void addTab(ActionBar.Tab tab, int i)
	{
		throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
	//    0    0:new             #187 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #189 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #192 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void addTab(ActionBar.Tab tab, int i, boolean flag)
	{
		throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
	//    0    0:new             #187 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #189 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #192 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void addTab(ActionBar.Tab tab, boolean flag)
	{
		throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
	//    0    0:new             #187 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #189 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #192 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public boolean collapseActionView()
	{
		if(mDecorToolbar.hasExpandedActionView())
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//*   2    4:invokeinterface #200 <Method boolean DecorToolbar.hasExpandedActionView()>
	//*   3    9:ifeq            23
		{
			mDecorToolbar.collapseActionView();
	//    4   12:aload_0         
	//    5   13:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    6   16:invokeinterface #202 <Method void DecorToolbar.collapseActionView()>
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
	//*   2    2:getfield        #206 <Field boolean mLastMenuVisibility>
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mLastMenuVisibility = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #206 <Field boolean mLastMenuVisibility>
		int j = mMenuVisibilityListeners.size();
	//    8   14:aload_0         
	//    9   15:getfield        #47  <Field ArrayList mMenuVisibilityListeners>
	//   10   18:invokevirtual   #210 <Method int ArrayList.size()>
	//   11   21:istore_3        
		for(int i = 0; i < j; i++)
	//*  12   22:iconst_0        
	//*  13   23:istore_2        
	//*  14   24:iload_2         
	//*  15   25:iload_3         
	//*  16   26:icmpge          53
			((ActionBar.OnMenuVisibilityListener)mMenuVisibilityListeners.get(i)).onMenuVisibilityChanged(flag);
	//   17   29:aload_0         
	//   18   30:getfield        #47  <Field ArrayList mMenuVisibilityListeners>
	//   19   33:iload_2         
	//   20   34:invokevirtual   #214 <Method Object ArrayList.get(int)>
	//   21   37:checkcast       #216 <Class ActionBar$OnMenuVisibilityListener>
	//   22   40:iload_1         
	//   23   41:invokeinterface #219 <Method void ActionBar$OnMenuVisibilityListener.onMenuVisibilityChanged(boolean)>

	//   24   46:iload_2         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_2        
	//*  28   50:goto            24
	//   29   53:return          
	}

	public View getCustomView()
	{
		return mDecorToolbar.getCustomView();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #223 <Method View DecorToolbar.getCustomView()>
	//    3    9:areturn         
	}

	public int getDisplayOptions()
	{
		return mDecorToolbar.getDisplayOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #226 <Method int DecorToolbar.getDisplayOptions()>
	//    3    9:ireturn         
	}

	public float getElevation()
	{
		return ViewCompat.getElevation(((View) (mDecorToolbar.getViewGroup())));
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #232 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    3    9:invokestatic    #237 <Method float ViewCompat.getElevation(View)>
	//    4   12:freturn         
	}

	public int getHeight()
	{
		return mDecorToolbar.getHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #240 <Method int DecorToolbar.getHeight()>
	//    3    9:ireturn         
	}

	View getListMenuView(Menu menu)
	{
		ensureListMenuPresenter(menu);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #244 <Method void ensureListMenuPresenter(Menu)>
		if(menu == null || mListMenuPresenter == null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
	//*   5    9:aload_0         
	//*   6   10:getfield        #88  <Field ListMenuPresenter mListMenuPresenter>
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		if(mListMenuPresenter.getAdapter().getCount() > 0)
	//*  10   18:aload_0         
	//*  11   19:getfield        #88  <Field ListMenuPresenter mListMenuPresenter>
	//*  12   22:invokevirtual   #248 <Method ListAdapter ListMenuPresenter.getAdapter()>
	//*  13   25:invokeinterface #253 <Method int ListAdapter.getCount()>
	//*  14   30:ifle            53
			return (View)mListMenuPresenter.getMenuView(mDecorToolbar.getViewGroup());
	//   15   33:aload_0         
	//   16   34:getfield        #88  <Field ListMenuPresenter mListMenuPresenter>
	//   17   37:aload_0         
	//   18   38:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//   19   41:invokeinterface #232 <Method ViewGroup DecorToolbar.getViewGroup()>
	//   20   46:invokevirtual   #257 <Method android.support.v7.view.menu.MenuView ListMenuPresenter.getMenuView(ViewGroup)>
	//   21   49:checkcast       #259 <Class View>
	//   22   52:areturn         
		else
			return null;
	//   23   53:aconst_null     
	//   24   54:areturn         
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
	//    0    0:new             #187 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #189 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #192 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public CharSequence getSubtitle()
	{
		return mDecorToolbar.getSubtitle();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #268 <Method CharSequence DecorToolbar.getSubtitle()>
	//    3    9:areturn         
	}

	public ActionBar.Tab getTabAt(int i)
	{
		throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
	//    0    0:new             #187 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #189 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #192 <Method void UnsupportedOperationException(String)>
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
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #94  <Method Context DecorToolbar.getContext()>
	//    3    9:areturn         
	}

	public CharSequence getTitle()
	{
		return mDecorToolbar.getTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #275 <Method CharSequence DecorToolbar.getTitle()>
	//    3    9:areturn         
	}

	public android.view.Window.Callback getWrappedWindowCallback()
	{
		return mWindowCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field android.view.Window$Callback mWindowCallback>
	//    2    4:areturn         
	}

	public void hide()
	{
		mDecorToolbar.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:bipush          8
	//    3    6:invokeinterface #282 <Method void DecorToolbar.setVisibility(int)>
	//    4   11:return          
	}

	public boolean invalidateOptionsMenu()
	{
		mDecorToolbar.getViewGroup().removeCallbacks(mMenuInvalidator);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #232 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    3    9:aload_0         
	//    4   10:getfield        #52  <Field Runnable mMenuInvalidator>
	//    5   13:invokevirtual   #289 <Method boolean ViewGroup.removeCallbacks(Runnable)>
	//    6   16:pop             
		ViewCompat.postOnAnimation(((View) (mDecorToolbar.getViewGroup())), mMenuInvalidator);
	//    7   17:aload_0         
	//    8   18:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    9   21:invokeinterface #232 <Method ViewGroup DecorToolbar.getViewGroup()>
	//   10   26:aload_0         
	//   11   27:getfield        #52  <Field Runnable mMenuInvalidator>
	//   12   30:invokestatic    #293 <Method void ViewCompat.postOnAnimation(View, Runnable)>
		return true;
	//   13   33:iconst_1        
	//   14   34:ireturn         
	}

	public boolean isShowing()
	{
		return mDecorToolbar.getVisibility() == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #297 <Method int DecorToolbar.getVisibility()>
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
	//    1    1:invokespecial   #300 <Method boolean ActionBar.isTitleTruncated()>
	//    2    4:ireturn         
	}

	public ActionBar.Tab newTab()
	{
		throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
	//    0    0:new             #187 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #189 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #192 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #305 <Method void ActionBar.onConfigurationChanged(Configuration)>
	//    3    5:return          
	}

	void onDestroy()
	{
		mDecorToolbar.getViewGroup().removeCallbacks(mMenuInvalidator);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #232 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    3    9:aload_0         
	//    4   10:getfield        #52  <Field Runnable mMenuInvalidator>
	//    5   13:invokevirtual   #289 <Method boolean ViewGroup.removeCallbacks(Runnable)>
	//    6   16:pop             
	//    7   17:return          
	}

	public boolean onKeyShortcut(int i, KeyEvent keyevent)
	{
		Menu menu = getMenu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #309 <Method Menu getMenu()>
	//    2    4:astore          5
		if(menu != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          65
		{
			int j;
			if(keyevent != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          23
				j = keyevent.getDeviceId();
	//    7   15:aload_2         
	//    8   16:invokevirtual   #314 <Method int KeyEvent.getDeviceId()>
	//    9   19:istore_3        
			else
	//*  10   20:goto            25
				j = -1;
	//   11   23:iconst_m1       
	//   12   24:istore_3        
			boolean flag;
			if(KeyCharacterMap.load(j).getKeyboardType() != 1)
	//*  13   25:iload_3         
	//*  14   26:invokestatic    #320 <Method KeyCharacterMap KeyCharacterMap.load(int)>
	//*  15   29:invokevirtual   #323 <Method int KeyCharacterMap.getKeyboardType()>
	//*  16   32:iconst_1        
	//*  17   33:icmpeq          42
				flag = true;
	//   18   36:iconst_1        
	//   19   37:istore          4
			else
	//*  20   39:goto            45
				flag = false;
	//   21   42:iconst_0        
	//   22   43:istore          4
			menu.setQwertyMode(flag);
	//   23   45:aload           5
	//   24   47:iload           4
	//   25   49:invokeinterface #328 <Method void Menu.setQwertyMode(boolean)>
			menu.performShortcut(i, keyevent, 0);
	//   26   54:aload           5
	//   27   56:iload_1         
	//   28   57:aload_2         
	//   29   58:iconst_0        
	//   30   59:invokeinterface #332 <Method boolean Menu.performShortcut(int, KeyEvent, int)>
	//   31   64:pop             
		}
		return true;
	//   32   65:iconst_1        
	//   33   66:ireturn         
	}

	public boolean onMenuKeyEvent(KeyEvent keyevent)
	{
		if(keyevent.getAction() == 1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #337 <Method int KeyEvent.getAction()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			openOptionsMenu();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #340 <Method boolean openOptionsMenu()>
	//    6   12:pop             
		return true;
	//    7   13:iconst_1        
	//    8   14:ireturn         
	}

	public boolean openOptionsMenu()
	{
		return mDecorToolbar.showOverflowMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #343 <Method boolean DecorToolbar.showOverflowMenu()>
	//    3    9:ireturn         
	}

	void populateOptionsMenu()
	{
		MenuBuilder menubuilder;
		Menu menu;
		menu = getMenu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #309 <Method Menu getMenu()>
	//    2    4:astore_2        
		if(menu instanceof MenuBuilder)
	//*   3    5:aload_2         
	//*   4    6:instanceof      #90  <Class MenuBuilder>
	//*   5    9:ifeq            20
			menubuilder = (MenuBuilder)menu;
	//    6   12:aload_2         
	//    7   13:checkcast       #90  <Class MenuBuilder>
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
	//   15   27:invokevirtual   #347 <Method void MenuBuilder.stopDispatchingItemsChanged()>
		menu.clear();
	//   16   30:aload_2         
	//   17   31:invokeinterface #350 <Method void Menu.clear()>
		if(!mWindowCallback.onCreatePanelMenu(0, menu) || !mWindowCallback.onPreparePanel(0, ((View) (null)), menu))
	//*  18   36:aload_0         
	//*  19   37:getfield        #67  <Field android.view.Window$Callback mWindowCallback>
	//*  20   40:iconst_0        
	//*  21   41:aload_2         
	//*  22   42:invokeinterface #356 <Method boolean android.view.Window$Callback.onCreatePanelMenu(int, Menu)>
	//*  23   47:ifeq            65
	//*  24   50:aload_0         
	//*  25   51:getfield        #67  <Field android.view.Window$Callback mWindowCallback>
	//*  26   54:iconst_0        
	//*  27   55:aconst_null     
	//*  28   56:aload_2         
	//*  29   57:invokeinterface #360 <Method boolean android.view.Window$Callback.onPreparePanel(int, View, Menu)>
	//*  30   62:ifne            71
			menu.clear();
	//   31   65:aload_2         
	//   32   66:invokeinterface #350 <Method void Menu.clear()>
		Exception exception;
		if(menubuilder != null)
	//*  33   71:aload_1         
	//*  34   72:ifnull          91
		{
			menubuilder.startDispatchingItemsChanged();
	//   35   75:aload_1         
	//   36   76:invokevirtual   #363 <Method void MenuBuilder.startDispatchingItemsChanged()>
			return;
	//   37   79:return          
		} else
	//*  38   80:astore_2        
	//*  39   81:aload_1         
	//*  40   82:ifnull          89
	//*  41   85:aload_1         
	//*  42   86:invokevirtual   #363 <Method void MenuBuilder.startDispatchingItemsChanged()>
	//*  43   89:aload_2         
	//*  44   90:athrow          
		{
			return;
	//   45   91:return          
		}
		exception;
		if(menubuilder != null)
			menubuilder.startDispatchingItemsChanged();
		throw exception;
	}

	public void removeAllTabs()
	{
		throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
	//    0    0:new             #187 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #189 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #192 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
	{
		mMenuVisibilityListeners.remove(((Object) (onmenuvisibilitylistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ArrayList mMenuVisibilityListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #368 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void removeTab(ActionBar.Tab tab)
	{
		throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
	//    0    0:new             #187 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #189 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #192 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void removeTabAt(int i)
	{
		throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
	//    0    0:new             #187 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #189 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #192 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public boolean requestFocus()
	{
		ViewGroup viewgroup = mDecorToolbar.getViewGroup();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #232 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    3    9:astore_1        
		if(viewgroup != null && !viewgroup.hasFocus())
	//*   4   10:aload_1         
	//*   5   11:ifnull          28
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #374 <Method boolean ViewGroup.hasFocus()>
	//*   8   18:ifne            28
		{
			viewgroup.requestFocus();
	//    9   21:aload_1         
	//   10   22:invokevirtual   #376 <Method boolean ViewGroup.requestFocus()>
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
	//    0    0:new             #187 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #189 <String "Tabs are not supported in toolbar action bars">
	//    3    6:invokespecial   #192 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		mDecorToolbar.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #382 <Method void DecorToolbar.setBackgroundDrawable(Drawable)>
	//    4   10:return          
	}

	public void setCustomView(int i)
	{
		setCustomView(LayoutInflater.from(mDecorToolbar.getContext()).inflate(i, mDecorToolbar.getViewGroup(), false));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    3    5:invokeinterface #94  <Method Context DecorToolbar.getContext()>
	//    4   10:invokestatic    #390 <Method LayoutInflater LayoutInflater.from(Context)>
	//    5   13:iload_1         
	//    6   14:aload_0         
	//    7   15:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    8   18:invokeinterface #232 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    9   23:iconst_0        
	//   10   24:invokevirtual   #394 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   11   27:invokevirtual   #397 <Method void setCustomView(View)>
	//   12   30:return          
	}

	public void setCustomView(View view)
	{
		setCustomView(view, new ActionBar.LayoutParams(-2, -2));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #399 <Class ActionBar$LayoutParams>
	//    3    5:dup             
	//    4    6:bipush          -2
	//    5    8:bipush          -2
	//    6   10:invokespecial   #402 <Method void ActionBar$LayoutParams(int, int)>
	//    7   13:invokevirtual   #405 <Method void setCustomView(View, ActionBar$LayoutParams)>
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
	//    4    6:invokevirtual   #409 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		mDecorToolbar.setCustomView(view);
	//    5    9:aload_0         
	//    6   10:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    7   13:aload_1         
	//    8   14:invokeinterface #410 <Method void DecorToolbar.setCustomView(View)>
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
	//   10   14:invokevirtual   #415 <Method void setDisplayOptions(int, int)>
	//   11   17:return          
	}

	public void setDisplayOptions(int i)
	{
		setDisplayOptions(i, -1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #415 <Method void setDisplayOptions(int, int)>
	//    4    6:return          
	}

	public void setDisplayOptions(int i, int j)
	{
		int k = mDecorToolbar.getDisplayOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #226 <Method int DecorToolbar.getDisplayOptions()>
	//    3    9:istore_3        
		mDecorToolbar.setDisplayOptions(i & j | ~j & k);
	//    4   10:aload_0         
	//    5   11:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    6   14:iload_1         
	//    7   15:iload_2         
	//    8   16:iand            
	//    9   17:iload_2         
	//   10   18:iconst_m1       
	//   11   19:ixor            
	//   12   20:iload_3         
	//   13   21:iand            
	//   14   22:ior             
	//   15   23:invokeinterface #417 <Method void DecorToolbar.setDisplayOptions(int)>
	//   16   28:return          
	}

	public void setDisplayShowCustomEnabled(boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
			byte0 = 16;
	//    2    4:bipush          16
	//    3    6:istore_2        
		else
	//*   4    7:goto            12
			byte0 = 0;
	//    5   10:iconst_0        
	//    6   11:istore_2        
		setDisplayOptions(((int) (byte0)), 16);
	//    7   12:aload_0         
	//    8   13:iload_2         
	//    9   14:bipush          16
	//   10   16:invokevirtual   #415 <Method void setDisplayOptions(int, int)>
	//   11   19:return          
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
	//   10   14:invokevirtual   #415 <Method void setDisplayOptions(int, int)>
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
	//   10   16:invokevirtual   #415 <Method void setDisplayOptions(int, int)>
	//   11   19:return          
	}

	public void setDisplayUseLogoEnabled(boolean flag)
	{
		int i;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			i = 1;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		setDisplayOptions(i, 1);
	//    7   11:aload_0         
	//    8   12:iload_2         
	//    9   13:iconst_1        
	//   10   14:invokevirtual   #415 <Method void setDisplayOptions(int, int)>
	//   11   17:return          
	}

	public void setElevation(float f)
	{
		ViewCompat.setElevation(((View) (mDecorToolbar.getViewGroup())), f);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #232 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    3    9:fload_1         
	//    4   10:invokestatic    #426 <Method void ViewCompat.setElevation(View, float)>
	//    5   13:return          
	}

	public void setHomeActionContentDescription(int i)
	{
		mDecorToolbar.setNavigationContentDescription(i);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #430 <Method void DecorToolbar.setNavigationContentDescription(int)>
	//    4   10:return          
	}

	public void setHomeActionContentDescription(CharSequence charsequence)
	{
		mDecorToolbar.setNavigationContentDescription(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #432 <Method void DecorToolbar.setNavigationContentDescription(CharSequence)>
	//    4   10:return          
	}

	public void setHomeAsUpIndicator(int i)
	{
		mDecorToolbar.setNavigationIcon(i);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #436 <Method void DecorToolbar.setNavigationIcon(int)>
	//    4   10:return          
	}

	public void setHomeAsUpIndicator(Drawable drawable)
	{
		mDecorToolbar.setNavigationIcon(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #438 <Method void DecorToolbar.setNavigationIcon(Drawable)>
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
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #442 <Method void DecorToolbar.setIcon(int)>
	//    4   10:return          
	}

	public void setIcon(Drawable drawable)
	{
		mDecorToolbar.setIcon(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #444 <Method void DecorToolbar.setIcon(Drawable)>
	//    4   10:return          
	}

	public void setListNavigationCallbacks(SpinnerAdapter spinneradapter, ActionBar.OnNavigationListener onnavigationlistener)
	{
		mDecorToolbar.setDropdownParams(spinneradapter, ((android.widget.AdapterView.OnItemSelectedListener) (new NavItemSelectedListener(onnavigationlistener))));
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:new             #448 <Class NavItemSelectedListener>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #451 <Method void NavItemSelectedListener(ActionBar$OnNavigationListener)>
	//    7   13:invokeinterface #455 <Method void DecorToolbar.setDropdownParams(SpinnerAdapter, android.widget.AdapterView$OnItemSelectedListener)>
	//    8   18:return          
	}

	public void setLogo(int i)
	{
		mDecorToolbar.setLogo(i);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #458 <Method void DecorToolbar.setLogo(int)>
	//    4   10:return          
	}

	public void setLogo(Drawable drawable)
	{
		mDecorToolbar.setLogo(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #460 <Method void DecorToolbar.setLogo(Drawable)>
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
	//    3    5:new             #463 <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:ldc2            #465 <String "Tabs not supported in this configuration">
	//    6   12:invokespecial   #466 <Method void IllegalArgumentException(String)>
	//    7   15:athrow          
		} else
		{
			mDecorToolbar.setNavigationMode(i);
	//    8   16:aload_0         
	//    9   17:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//   10   20:iload_1         
	//   11   21:invokeinterface #468 <Method void DecorToolbar.setNavigationMode(int)>
			return;
	//   12   26:return          
		}
	}

	public void setSelectedNavigationItem(int i)
	{
		switch(mDecorToolbar.getNavigationMode())
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//*   2    4:invokeinterface #471 <Method int DecorToolbar.getNavigationMode()>
		{
	//*   3    9:lookupswitch    1: default 28
	//	               1: 31
	//*   4   28:goto            42
		case 1: // '\001'
			mDecorToolbar.setDropdownSelectedPosition(i);
	//    5   31:aload_0         
	//    6   32:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    7   35:iload_1         
	//    8   36:invokeinterface #474 <Method void DecorToolbar.setDropdownSelectedPosition(int)>
			return;
	//    9   41:return          
		}
		throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
	//   10   42:new             #476 <Class IllegalStateException>
	//   11   45:dup             
	//   12   46:ldc2            #478 <String "setSelectedNavigationIndex not valid for current navigation mode">
	//   13   49:invokespecial   #479 <Method void IllegalStateException(String)>
	//   14   52:athrow          
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
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:astore_3        
		CharSequence charsequence;
		if(i != 0)
	//*   3    5:iload_1         
	//*   4    6:ifeq            26
			charsequence = mDecorToolbar.getContext().getText(i);
	//    5    9:aload_0         
	//    6   10:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    7   13:invokeinterface #94  <Method Context DecorToolbar.getContext()>
	//    8   18:iload_1         
	//    9   19:invokevirtual   #487 <Method CharSequence Context.getText(int)>
	//   10   22:astore_2        
		else
	//*  11   23:goto            28
			charsequence = null;
	//   12   26:aconst_null     
	//   13   27:astore_2        
		decortoolbar.setSubtitle(charsequence);
	//   14   28:aload_3         
	//   15   29:aload_2         
	//   16   30:invokeinterface #489 <Method void DecorToolbar.setSubtitle(CharSequence)>
	//   17   35:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
		mDecorToolbar.setSubtitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #489 <Method void DecorToolbar.setSubtitle(CharSequence)>
	//    4   10:return          
	}

	public void setTitle(int i)
	{
		DecorToolbar decortoolbar = mDecorToolbar;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:astore_3        
		CharSequence charsequence;
		if(i != 0)
	//*   3    5:iload_1         
	//*   4    6:ifeq            26
			charsequence = mDecorToolbar.getContext().getText(i);
	//    5    9:aload_0         
	//    6   10:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    7   13:invokeinterface #94  <Method Context DecorToolbar.getContext()>
	//    8   18:iload_1         
	//    9   19:invokevirtual   #487 <Method CharSequence Context.getText(int)>
	//   10   22:astore_2        
		else
	//*  11   23:goto            28
			charsequence = null;
	//   12   26:aconst_null     
	//   13   27:astore_2        
		decortoolbar.setTitle(charsequence);
	//   14   28:aload_3         
	//   15   29:aload_2         
	//   16   30:invokeinterface #492 <Method void DecorToolbar.setTitle(CharSequence)>
	//   17   35:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mDecorToolbar.setTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #492 <Method void DecorToolbar.setTitle(CharSequence)>
	//    4   10:return          
	}

	public void setWindowTitle(CharSequence charsequence)
	{
		mDecorToolbar.setWindowTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #83  <Method void DecorToolbar.setWindowTitle(CharSequence)>
	//    4   10:return          
	}

	public void show()
	{
		mDecorToolbar.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field DecorToolbar mDecorToolbar>
	//    2    4:iconst_0        
	//    3    5:invokeinterface #282 <Method void DecorToolbar.setVisibility(int)>
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
