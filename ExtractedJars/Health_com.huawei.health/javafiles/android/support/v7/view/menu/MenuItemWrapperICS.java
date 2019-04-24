// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.internal.view.SupportMenuItem;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.view.menu:
//			BaseMenuWrapper, BaseWrapper

public class MenuItemWrapperICS extends BaseMenuWrapper
	implements MenuItem
{
	class ActionProviderWrapper extends android.support.v4.view.ActionProvider
	{

		public boolean hasSubMenu()
		{
			return mInner.hasSubMenu();
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ActionProvider mInner>
		//    2    4:invokevirtual   #27  <Method boolean ActionProvider.hasSubMenu()>
		//    3    7:ireturn         
		}

		public View onCreateActionView()
		{
			return mInner.onCreateActionView();
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ActionProvider mInner>
		//    2    4:invokevirtual   #31  <Method View ActionProvider.onCreateActionView()>
		//    3    7:areturn         
		}

		public boolean onPerformDefaultAction()
		{
			return mInner.onPerformDefaultAction();
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ActionProvider mInner>
		//    2    4:invokevirtual   #34  <Method boolean ActionProvider.onPerformDefaultAction()>
		//    3    7:ireturn         
		}

		public void onPrepareSubMenu(SubMenu submenu)
		{
			mInner.onPrepareSubMenu(getSubMenuWrapper(submenu));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ActionProvider mInner>
		//    2    4:aload_0         
		//    3    5:getfield        #15  <Field MenuItemWrapperICS this$0>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #40  <Method SubMenu MenuItemWrapperICS.getSubMenuWrapper(SubMenu)>
		//    6   12:invokevirtual   #42  <Method void ActionProvider.onPrepareSubMenu(SubMenu)>
		//    7   15:return          
		}

		final ActionProvider mInner;
		final MenuItemWrapperICS this$0;

		public ActionProviderWrapper(Context context, ActionProvider actionprovider)
		{
			this$0 = MenuItemWrapperICS.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field MenuItemWrapperICS this$0>
			super(context);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #18  <Method void android.support.v4.view.ActionProvider(Context)>
			mInner = actionprovider;
		//    6   10:aload_0         
		//    7   11:aload_3         
		//    8   12:putfield        #20  <Field ActionProvider mInner>
		//    9   15:return          
		}
	}

	static class CollapsibleActionViewWrapper extends FrameLayout
		implements android.support.v7.view.CollapsibleActionView
	{

		View getWrappedView()
		{
			return (View)mWrappedView;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field CollapsibleActionView mWrappedView>
		//    2    4:checkcast       #15  <Class View>
		//    3    7:areturn         
		}

		public void onActionViewCollapsed()
		{
			mWrappedView.onActionViewCollapsed();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field CollapsibleActionView mWrappedView>
		//    2    4:invokeinterface #36  <Method void CollapsibleActionView.onActionViewCollapsed()>
		//    3    9:return          
		}

		public void onActionViewExpanded()
		{
			mWrappedView.onActionViewExpanded();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field CollapsibleActionView mWrappedView>
		//    2    4:invokeinterface #39  <Method void CollapsibleActionView.onActionViewExpanded()>
		//    3    9:return          
		}

		final CollapsibleActionView mWrappedView;

		CollapsibleActionViewWrapper(View view)
		{
			super(view.getContext());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #19  <Method Context View.getContext()>
		//    3    5:invokespecial   #22  <Method void FrameLayout(Context)>
			mWrappedView = (CollapsibleActionView)view;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:checkcast       #24  <Class CollapsibleActionView>
		//    7   13:putfield        #26  <Field CollapsibleActionView mWrappedView>
			addView(view);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokevirtual   #29  <Method void addView(View)>
		//   11   21:return          
		}
	}

	class OnActionExpandListenerWrapper extends BaseWrapper
		implements android.view.MenuItem.OnActionExpandListener
	{

		public boolean onMenuItemActionCollapse(MenuItem menuitem)
		{
			return ((android.view.MenuItem.OnActionExpandListener)mWrappedObject).onMenuItemActionCollapse(getMenuItemWrapper(menuitem));
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Object mWrappedObject>
		//    2    4:checkcast       #7   <Class android.view.MenuItem$OnActionExpandListener>
		//    3    7:aload_0         
		//    4    8:getfield        #16  <Field MenuItemWrapperICS this$0>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #30  <Method MenuItem MenuItemWrapperICS.getMenuItemWrapper(MenuItem)>
		//    7   15:invokeinterface #32  <Method boolean android.view.MenuItem$OnActionExpandListener.onMenuItemActionCollapse(MenuItem)>
		//    8   20:ireturn         
		}

		public boolean onMenuItemActionExpand(MenuItem menuitem)
		{
			return ((android.view.MenuItem.OnActionExpandListener)mWrappedObject).onMenuItemActionExpand(getMenuItemWrapper(menuitem));
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Object mWrappedObject>
		//    2    4:checkcast       #7   <Class android.view.MenuItem$OnActionExpandListener>
		//    3    7:aload_0         
		//    4    8:getfield        #16  <Field MenuItemWrapperICS this$0>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #30  <Method MenuItem MenuItemWrapperICS.getMenuItemWrapper(MenuItem)>
		//    7   15:invokeinterface #35  <Method boolean android.view.MenuItem$OnActionExpandListener.onMenuItemActionExpand(MenuItem)>
		//    8   20:ireturn         
		}

		final MenuItemWrapperICS this$0;

		OnActionExpandListenerWrapper(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
		{
			this$0 = MenuItemWrapperICS.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field MenuItemWrapperICS this$0>
			super(((Object) (onactionexpandlistener)));
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #19  <Method void BaseWrapper(Object)>
		//    6   10:return          
		}
	}

	class OnMenuItemClickListenerWrapper extends BaseWrapper
		implements android.view.MenuItem.OnMenuItemClickListener
	{

		public boolean onMenuItemClick(MenuItem menuitem)
		{
			return ((android.view.MenuItem.OnMenuItemClickListener)mWrappedObject).onMenuItemClick(getMenuItemWrapper(menuitem));
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Object mWrappedObject>
		//    2    4:checkcast       #7   <Class android.view.MenuItem$OnMenuItemClickListener>
		//    3    7:aload_0         
		//    4    8:getfield        #16  <Field MenuItemWrapperICS this$0>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #30  <Method MenuItem MenuItemWrapperICS.getMenuItemWrapper(MenuItem)>
		//    7   15:invokeinterface #32  <Method boolean android.view.MenuItem$OnMenuItemClickListener.onMenuItemClick(MenuItem)>
		//    8   20:ireturn         
		}

		final MenuItemWrapperICS this$0;

		OnMenuItemClickListenerWrapper(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
		{
			this$0 = MenuItemWrapperICS.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field MenuItemWrapperICS this$0>
			super(((Object) (onmenuitemclicklistener)));
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #19  <Method void BaseWrapper(Object)>
		//    6   10:return          
		}
	}


	MenuItemWrapperICS(Context context, SupportMenuItem supportmenuitem)
	{
		super(context, ((Object) (supportmenuitem)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #36  <Method void BaseMenuWrapper(Context, Object)>
	//    4    6:return          
	}

	public boolean collapseActionView()
	{
		return ((SupportMenuItem)mWrappedObject).collapseActionView();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #47  <Method boolean SupportMenuItem.collapseActionView()>
	//    4   12:ireturn         
	}

	ActionProviderWrapper createActionProviderWrapper(ActionProvider actionprovider)
	{
		return new ActionProviderWrapper(mContext, actionprovider);
	//    0    0:new             #9   <Class MenuItemWrapperICS$ActionProviderWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #53  <Field Context mContext>
	//    5    9:aload_1         
	//    6   10:invokespecial   #56  <Method void MenuItemWrapperICS$ActionProviderWrapper(MenuItemWrapperICS, Context, ActionProvider)>
	//    7   13:areturn         
	}

	public boolean expandActionView()
	{
		return ((SupportMenuItem)mWrappedObject).expandActionView();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #59  <Method boolean SupportMenuItem.expandActionView()>
	//    4   12:ireturn         
	}

	public ActionProvider getActionProvider()
	{
		android.support.v4.view.ActionProvider actionprovider = ((SupportMenuItem)mWrappedObject).getSupportActionProvider();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #65  <Method android.support.v4.view.ActionProvider SupportMenuItem.getSupportActionProvider()>
	//    4   12:astore_1        
		if(actionprovider instanceof ActionProviderWrapper)
	//*   5   13:aload_1         
	//*   6   14:instanceof      #9   <Class MenuItemWrapperICS$ActionProviderWrapper>
	//*   7   17:ifeq            28
			return ((ActionProviderWrapper)actionprovider).mInner;
	//    8   20:aload_1         
	//    9   21:checkcast       #9   <Class MenuItemWrapperICS$ActionProviderWrapper>
	//   10   24:getfield        #69  <Field ActionProvider MenuItemWrapperICS$ActionProviderWrapper.mInner>
	//   11   27:areturn         
		else
			return null;
	//   12   28:aconst_null     
	//   13   29:areturn         
	}

	public View getActionView()
	{
		View view = ((SupportMenuItem)mWrappedObject).getActionView();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #73  <Method View SupportMenuItem.getActionView()>
	//    4   12:astore_1        
		if(view instanceof CollapsibleActionViewWrapper)
	//*   5   13:aload_1         
	//*   6   14:instanceof      #12  <Class MenuItemWrapperICS$CollapsibleActionViewWrapper>
	//*   7   17:ifeq            28
			return ((CollapsibleActionViewWrapper)view).getWrappedView();
	//    8   20:aload_1         
	//    9   21:checkcast       #12  <Class MenuItemWrapperICS$CollapsibleActionViewWrapper>
	//   10   24:invokevirtual   #76  <Method View MenuItemWrapperICS$CollapsibleActionViewWrapper.getWrappedView()>
	//   11   27:areturn         
		else
			return view;
	//   12   28:aload_1         
	//   13   29:areturn         
	}

	public char getAlphabeticShortcut()
	{
		return ((SupportMenuItem)mWrappedObject).getAlphabeticShortcut();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #80  <Method char SupportMenuItem.getAlphabeticShortcut()>
	//    4   12:ireturn         
	}

	public CharSequence getContentDescription()
	{
		return ((SupportMenuItem)mWrappedObject).getContentDescription();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #84  <Method CharSequence SupportMenuItem.getContentDescription()>
	//    4   12:areturn         
	}

	public int getGroupId()
	{
		return ((SupportMenuItem)mWrappedObject).getGroupId();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #88  <Method int SupportMenuItem.getGroupId()>
	//    4   12:ireturn         
	}

	public Drawable getIcon()
	{
		return ((SupportMenuItem)mWrappedObject).getIcon();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #92  <Method Drawable SupportMenuItem.getIcon()>
	//    4   12:areturn         
	}

	public Intent getIntent()
	{
		return ((SupportMenuItem)mWrappedObject).getIntent();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #96  <Method Intent SupportMenuItem.getIntent()>
	//    4   12:areturn         
	}

	public int getItemId()
	{
		return ((SupportMenuItem)mWrappedObject).getItemId();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #99  <Method int SupportMenuItem.getItemId()>
	//    4   12:ireturn         
	}

	public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
	{
		return ((SupportMenuItem)mWrappedObject).getMenuInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #103 <Method android.view.ContextMenu$ContextMenuInfo SupportMenuItem.getMenuInfo()>
	//    4   12:areturn         
	}

	public char getNumericShortcut()
	{
		return ((SupportMenuItem)mWrappedObject).getNumericShortcut();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #106 <Method char SupportMenuItem.getNumericShortcut()>
	//    4   12:ireturn         
	}

	public int getOrder()
	{
		return ((SupportMenuItem)mWrappedObject).getOrder();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #109 <Method int SupportMenuItem.getOrder()>
	//    4   12:ireturn         
	}

	public SubMenu getSubMenu()
	{
		return getSubMenuWrapper(((SupportMenuItem)mWrappedObject).getSubMenu());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #43  <Field Object mWrappedObject>
	//    3    5:checkcast       #45  <Class SupportMenuItem>
	//    4    8:invokeinterface #113 <Method SubMenu SupportMenuItem.getSubMenu()>
	//    5   13:invokevirtual   #117 <Method SubMenu getSubMenuWrapper(SubMenu)>
	//    6   16:areturn         
	}

	public CharSequence getTitle()
	{
		return ((SupportMenuItem)mWrappedObject).getTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #120 <Method CharSequence SupportMenuItem.getTitle()>
	//    4   12:areturn         
	}

	public CharSequence getTitleCondensed()
	{
		return ((SupportMenuItem)mWrappedObject).getTitleCondensed();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #123 <Method CharSequence SupportMenuItem.getTitleCondensed()>
	//    4   12:areturn         
	}

	public CharSequence getTooltipText()
	{
		return ((SupportMenuItem)mWrappedObject).getTooltipText();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #126 <Method CharSequence SupportMenuItem.getTooltipText()>
	//    4   12:areturn         
	}

	public boolean hasSubMenu()
	{
		return ((SupportMenuItem)mWrappedObject).hasSubMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #129 <Method boolean SupportMenuItem.hasSubMenu()>
	//    4   12:ireturn         
	}

	public boolean isActionViewExpanded()
	{
		return ((SupportMenuItem)mWrappedObject).isActionViewExpanded();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #132 <Method boolean SupportMenuItem.isActionViewExpanded()>
	//    4   12:ireturn         
	}

	public boolean isCheckable()
	{
		return ((SupportMenuItem)mWrappedObject).isCheckable();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #135 <Method boolean SupportMenuItem.isCheckable()>
	//    4   12:ireturn         
	}

	public boolean isChecked()
	{
		return ((SupportMenuItem)mWrappedObject).isChecked();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #138 <Method boolean SupportMenuItem.isChecked()>
	//    4   12:ireturn         
	}

	public boolean isEnabled()
	{
		return ((SupportMenuItem)mWrappedObject).isEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #141 <Method boolean SupportMenuItem.isEnabled()>
	//    4   12:ireturn         
	}

	public boolean isVisible()
	{
		return ((SupportMenuItem)mWrappedObject).isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #144 <Method boolean SupportMenuItem.isVisible()>
	//    4   12:ireturn         
	}

	public MenuItem setActionProvider(ActionProvider actionprovider)
	{
		SupportMenuItem supportmenuitem = (SupportMenuItem)mWrappedObject;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:astore_2        
		if(actionprovider != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          21
			actionprovider = ((ActionProvider) (createActionProviderWrapper(actionprovider)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #148 <Method MenuItemWrapperICS$ActionProviderWrapper createActionProviderWrapper(ActionProvider)>
	//    9   17:astore_1        
		else
	//*  10   18:goto            23
			actionprovider = null;
	//   11   21:aconst_null     
	//   12   22:astore_1        
		supportmenuitem.setSupportActionProvider(((android.support.v4.view.ActionProvider) (actionprovider)));
	//   13   23:aload_2         
	//   14   24:aload_1         
	//   15   25:invokeinterface #152 <Method SupportMenuItem SupportMenuItem.setSupportActionProvider(android.support.v4.view.ActionProvider)>
	//   16   30:pop             
		return ((MenuItem) (this));
	//   17   31:aload_0         
	//   18   32:areturn         
	}

	public MenuItem setActionView(int i)
	{
		((SupportMenuItem)mWrappedObject).setActionView(i);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:iload_1         
	//    4    8:invokeinterface #156 <Method MenuItem SupportMenuItem.setActionView(int)>
	//    5   13:pop             
		View view = ((SupportMenuItem)mWrappedObject).getActionView();
	//    6   14:aload_0         
	//    7   15:getfield        #43  <Field Object mWrappedObject>
	//    8   18:checkcast       #45  <Class SupportMenuItem>
	//    9   21:invokeinterface #73  <Method View SupportMenuItem.getActionView()>
	//   10   26:astore_2        
		if(view instanceof CollapsibleActionView)
	//*  11   27:aload_2         
	//*  12   28:instanceof      #158 <Class CollapsibleActionView>
	//*  13   31:ifeq            55
			((SupportMenuItem)mWrappedObject).setActionView(((View) (new CollapsibleActionViewWrapper(view))));
	//   14   34:aload_0         
	//   15   35:getfield        #43  <Field Object mWrappedObject>
	//   16   38:checkcast       #45  <Class SupportMenuItem>
	//   17   41:new             #12  <Class MenuItemWrapperICS$CollapsibleActionViewWrapper>
	//   18   44:dup             
	//   19   45:aload_2         
	//   20   46:invokespecial   #161 <Method void MenuItemWrapperICS$CollapsibleActionViewWrapper(View)>
	//   21   49:invokeinterface #164 <Method MenuItem SupportMenuItem.setActionView(View)>
	//   22   54:pop             
		return ((MenuItem) (this));
	//   23   55:aload_0         
	//   24   56:areturn         
	}

	public MenuItem setActionView(View view)
	{
		Object obj = ((Object) (view));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(view instanceof CollapsibleActionView)
	//*   2    2:aload_1         
	//*   3    3:instanceof      #158 <Class CollapsibleActionView>
	//*   4    6:ifeq            18
			obj = ((Object) (new CollapsibleActionViewWrapper(view)));
	//    5    9:new             #12  <Class MenuItemWrapperICS$CollapsibleActionViewWrapper>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #161 <Method void MenuItemWrapperICS$CollapsibleActionViewWrapper(View)>
	//    9   17:astore_2        
		((SupportMenuItem)mWrappedObject).setActionView(((View) (obj)));
	//   10   18:aload_0         
	//   11   19:getfield        #43  <Field Object mWrappedObject>
	//   12   22:checkcast       #45  <Class SupportMenuItem>
	//   13   25:aload_2         
	//   14   26:invokeinterface #164 <Method MenuItem SupportMenuItem.setActionView(View)>
	//   15   31:pop             
		return ((MenuItem) (this));
	//   16   32:aload_0         
	//   17   33:areturn         
	}

	public MenuItem setAlphabeticShortcut(char c)
	{
		((SupportMenuItem)mWrappedObject).setAlphabeticShortcut(c);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:iload_1         
	//    4    8:invokeinterface #168 <Method MenuItem SupportMenuItem.setAlphabeticShortcut(char)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setCheckable(boolean flag)
	{
		((SupportMenuItem)mWrappedObject).setCheckable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:iload_1         
	//    4    8:invokeinterface #172 <Method MenuItem SupportMenuItem.setCheckable(boolean)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setChecked(boolean flag)
	{
		((SupportMenuItem)mWrappedObject).setChecked(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:iload_1         
	//    4    8:invokeinterface #175 <Method MenuItem SupportMenuItem.setChecked(boolean)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setContentDescription(CharSequence charsequence)
	{
		((SupportMenuItem)mWrappedObject).setContentDescription(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:aload_1         
	//    4    8:invokeinterface #180 <Method SupportMenuItem SupportMenuItem.setContentDescription(CharSequence)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setEnabled(boolean flag)
	{
		((SupportMenuItem)mWrappedObject).setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:iload_1         
	//    4    8:invokeinterface #183 <Method MenuItem SupportMenuItem.setEnabled(boolean)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public void setExclusiveCheckable(boolean flag)
	{
		try
		{
			if(mSetExclusiveCheckableMethod == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field Method mSetExclusiveCheckableMethod>
	//*   2    4:ifnonnull       36
				mSetExclusiveCheckableMethod = ((Object) ((SupportMenuItem)mWrappedObject)).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] {
					Boolean.TYPE
				});
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #43  <Field Object mWrappedObject>
	//    6   12:checkcast       #45  <Class SupportMenuItem>
	//    7   15:invokevirtual   #195 <Method Class Object.getClass()>
	//    8   18:ldc1            #196 <String "setExclusiveCheckable">
	//    9   20:iconst_1        
	//   10   21:anewarray       Class[]
	//   11   24:dup             
	//   12   25:iconst_0        
	//   13   26:getstatic       #204 <Field Class Boolean.TYPE>
	//   14   29:aastore         
	//   15   30:invokevirtual   #208 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   16   33:putfield        #189 <Field Method mSetExclusiveCheckableMethod>
			mSetExclusiveCheckableMethod.invoke(mWrappedObject, new Object[] {
				Boolean.valueOf(flag)
			});
	//   17   36:aload_0         
	//   18   37:getfield        #189 <Field Method mSetExclusiveCheckableMethod>
	//   19   40:aload_0         
	//   20   41:getfield        #43  <Field Object mWrappedObject>
	//   21   44:iconst_1        
	//   22   45:anewarray       Object[]
	//   23   48:dup             
	//   24   49:iconst_0        
	//   25   50:iload_1         
	//   26   51:invokestatic    #212 <Method Boolean Boolean.valueOf(boolean)>
	//   27   54:aastore         
	//   28   55:invokevirtual   #218 <Method Object Method.invoke(Object, Object[])>
	//   29   58:pop             
			return;
	//   30   59:return          
		}
		catch(Exception exception)
	//*  31   60:astore_2        
		{
			Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", ((Throwable) (exception)));
	//   32   61:ldc1            #29  <String "MenuItemWrapper">
	//   33   63:ldc1            #220 <String "Error while calling setExclusiveCheckable">
	//   34   65:aload_2         
	//   35   66:invokestatic    #226 <Method int Log.w(String, String, Throwable)>
	//   36   69:pop             
		}
	//   37   70:return          
	}

	public MenuItem setIcon(int i)
	{
		((SupportMenuItem)mWrappedObject).setIcon(i);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:iload_1         
	//    4    8:invokeinterface #229 <Method MenuItem SupportMenuItem.setIcon(int)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setIcon(Drawable drawable)
	{
		((SupportMenuItem)mWrappedObject).setIcon(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:aload_1         
	//    4    8:invokeinterface #232 <Method MenuItem SupportMenuItem.setIcon(Drawable)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setIntent(Intent intent)
	{
		((SupportMenuItem)mWrappedObject).setIntent(intent);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:aload_1         
	//    4    8:invokeinterface #236 <Method MenuItem SupportMenuItem.setIntent(Intent)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setNumericShortcut(char c)
	{
		((SupportMenuItem)mWrappedObject).setNumericShortcut(c);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:iload_1         
	//    4    8:invokeinterface #239 <Method MenuItem SupportMenuItem.setNumericShortcut(char)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
	{
		SupportMenuItem supportmenuitem = (SupportMenuItem)mWrappedObject;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:astore_2        
		if(onactionexpandlistener != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          25
			onactionexpandlistener = ((android.view.MenuItem.OnActionExpandListener) (new OnActionExpandListenerWrapper(onactionexpandlistener)));
	//    6   12:new             #15  <Class MenuItemWrapperICS$OnActionExpandListenerWrapper>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #244 <Method void MenuItemWrapperICS$OnActionExpandListenerWrapper(MenuItemWrapperICS, android.view.MenuItem$OnActionExpandListener)>
	//   11   21:astore_1        
		else
	//*  12   22:goto            27
			onactionexpandlistener = null;
	//   13   25:aconst_null     
	//   14   26:astore_1        
		supportmenuitem.setSupportOnActionExpandListener(onactionexpandlistener);
	//   15   27:aload_2         
	//   16   28:aload_1         
	//   17   29:invokeinterface #248 <Method SupportMenuItem SupportMenuItem.setSupportOnActionExpandListener(android.view.MenuItem$OnActionExpandListener)>
	//   18   34:pop             
		return ((MenuItem) (this));
	//   19   35:aload_0         
	//   20   36:areturn         
	}

	public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
	{
		SupportMenuItem supportmenuitem = (SupportMenuItem)mWrappedObject;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:astore_2        
		if(onmenuitemclicklistener != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          25
			onmenuitemclicklistener = ((android.view.MenuItem.OnMenuItemClickListener) (new OnMenuItemClickListenerWrapper(onmenuitemclicklistener)));
	//    6   12:new             #18  <Class MenuItemWrapperICS$OnMenuItemClickListenerWrapper>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #253 <Method void MenuItemWrapperICS$OnMenuItemClickListenerWrapper(MenuItemWrapperICS, android.view.MenuItem$OnMenuItemClickListener)>
	//   11   21:astore_1        
		else
	//*  12   22:goto            27
			onmenuitemclicklistener = null;
	//   13   25:aconst_null     
	//   14   26:astore_1        
		supportmenuitem.setOnMenuItemClickListener(onmenuitemclicklistener);
	//   15   27:aload_2         
	//   16   28:aload_1         
	//   17   29:invokeinterface #255 <Method MenuItem SupportMenuItem.setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener)>
	//   18   34:pop             
		return ((MenuItem) (this));
	//   19   35:aload_0         
	//   20   36:areturn         
	}

	public MenuItem setShortcut(char c, char c1)
	{
		((SupportMenuItem)mWrappedObject).setShortcut(c, c1);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:invokeinterface #259 <Method MenuItem SupportMenuItem.setShortcut(char, char)>
	//    6   14:pop             
		return ((MenuItem) (this));
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public void setShowAsAction(int i)
	{
		((SupportMenuItem)mWrappedObject).setShowAsAction(i);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:iload_1         
	//    4    8:invokeinterface #263 <Method void SupportMenuItem.setShowAsAction(int)>
	//    5   13:return          
	}

	public MenuItem setShowAsActionFlags(int i)
	{
		((SupportMenuItem)mWrappedObject).setShowAsActionFlags(i);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:iload_1         
	//    4    8:invokeinterface #266 <Method MenuItem SupportMenuItem.setShowAsActionFlags(int)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setTitle(int i)
	{
		((SupportMenuItem)mWrappedObject).setTitle(i);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:iload_1         
	//    4    8:invokeinterface #269 <Method MenuItem SupportMenuItem.setTitle(int)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setTitle(CharSequence charsequence)
	{
		((SupportMenuItem)mWrappedObject).setTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:aload_1         
	//    4    8:invokeinterface #271 <Method MenuItem SupportMenuItem.setTitle(CharSequence)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setTitleCondensed(CharSequence charsequence)
	{
		((SupportMenuItem)mWrappedObject).setTitleCondensed(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:aload_1         
	//    4    8:invokeinterface #274 <Method MenuItem SupportMenuItem.setTitleCondensed(CharSequence)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setTooltipText(CharSequence charsequence)
	{
		((SupportMenuItem)mWrappedObject).setTooltipText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:aload_1         
	//    4    8:invokeinterface #277 <Method SupportMenuItem SupportMenuItem.setTooltipText(CharSequence)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setVisible(boolean flag)
	{
		return ((SupportMenuItem)mWrappedObject).setVisible(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:iload_1         
	//    4    8:invokeinterface #280 <Method MenuItem SupportMenuItem.setVisible(boolean)>
	//    5   13:areturn         
	}

	static final String LOG_TAG = "MenuItemWrapper";
	private Method mSetExclusiveCheckableMethod;
}
