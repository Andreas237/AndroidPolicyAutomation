// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
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

	private class OnActionExpandListenerWrapper extends BaseWrapper
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

	private class OnMenuItemClickListenerWrapper extends BaseWrapper
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
		View view1 = ((SupportMenuItem)mWrappedObject).getActionView();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #73  <Method View SupportMenuItem.getActionView()>
	//    4   12:astore_2        
		View view = view1;
	//    5   13:aload_2         
	//    6   14:astore_1        
		if(view1 instanceof CollapsibleActionViewWrapper)
	//*   7   15:aload_2         
	//*   8   16:instanceof      #12  <Class MenuItemWrapperICS$CollapsibleActionViewWrapper>
	//*   9   19:ifeq            30
			view = ((CollapsibleActionViewWrapper)view1).getWrappedView();
	//   10   22:aload_2         
	//   11   23:checkcast       #12  <Class MenuItemWrapperICS$CollapsibleActionViewWrapper>
	//   12   26:invokevirtual   #76  <Method View MenuItemWrapperICS$CollapsibleActionViewWrapper.getWrappedView()>
	//   13   29:astore_1        
		return view;
	//   14   30:aload_1         
	//   15   31:areturn         
	}

	public int getAlphabeticModifiers()
	{
		return ((SupportMenuItem)mWrappedObject).getAlphabeticModifiers();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #80  <Method int SupportMenuItem.getAlphabeticModifiers()>
	//    4   12:ireturn         
	}

	public char getAlphabeticShortcut()
	{
		return ((SupportMenuItem)mWrappedObject).getAlphabeticShortcut();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #84  <Method char SupportMenuItem.getAlphabeticShortcut()>
	//    4   12:ireturn         
	}

	public CharSequence getContentDescription()
	{
		return ((SupportMenuItem)mWrappedObject).getContentDescription();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #88  <Method CharSequence SupportMenuItem.getContentDescription()>
	//    4   12:areturn         
	}

	public int getGroupId()
	{
		return ((SupportMenuItem)mWrappedObject).getGroupId();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #91  <Method int SupportMenuItem.getGroupId()>
	//    4   12:ireturn         
	}

	public Drawable getIcon()
	{
		return ((SupportMenuItem)mWrappedObject).getIcon();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #95  <Method Drawable SupportMenuItem.getIcon()>
	//    4   12:areturn         
	}

	public ColorStateList getIconTintList()
	{
		return ((SupportMenuItem)mWrappedObject).getIconTintList();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #99  <Method ColorStateList SupportMenuItem.getIconTintList()>
	//    4   12:areturn         
	}

	public android.graphics.PorterDuff.Mode getIconTintMode()
	{
		return ((SupportMenuItem)mWrappedObject).getIconTintMode();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #103 <Method android.graphics.PorterDuff$Mode SupportMenuItem.getIconTintMode()>
	//    4   12:areturn         
	}

	public Intent getIntent()
	{
		return ((SupportMenuItem)mWrappedObject).getIntent();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #107 <Method Intent SupportMenuItem.getIntent()>
	//    4   12:areturn         
	}

	public int getItemId()
	{
		return ((SupportMenuItem)mWrappedObject).getItemId();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #110 <Method int SupportMenuItem.getItemId()>
	//    4   12:ireturn         
	}

	public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
	{
		return ((SupportMenuItem)mWrappedObject).getMenuInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #114 <Method android.view.ContextMenu$ContextMenuInfo SupportMenuItem.getMenuInfo()>
	//    4   12:areturn         
	}

	public int getNumericModifiers()
	{
		return ((SupportMenuItem)mWrappedObject).getNumericModifiers();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #117 <Method int SupportMenuItem.getNumericModifiers()>
	//    4   12:ireturn         
	}

	public char getNumericShortcut()
	{
		return ((SupportMenuItem)mWrappedObject).getNumericShortcut();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #120 <Method char SupportMenuItem.getNumericShortcut()>
	//    4   12:ireturn         
	}

	public int getOrder()
	{
		return ((SupportMenuItem)mWrappedObject).getOrder();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #123 <Method int SupportMenuItem.getOrder()>
	//    4   12:ireturn         
	}

	public SubMenu getSubMenu()
	{
		return getSubMenuWrapper(((SupportMenuItem)mWrappedObject).getSubMenu());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #43  <Field Object mWrappedObject>
	//    3    5:checkcast       #45  <Class SupportMenuItem>
	//    4    8:invokeinterface #127 <Method SubMenu SupportMenuItem.getSubMenu()>
	//    5   13:invokevirtual   #131 <Method SubMenu getSubMenuWrapper(SubMenu)>
	//    6   16:areturn         
	}

	public CharSequence getTitle()
	{
		return ((SupportMenuItem)mWrappedObject).getTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #134 <Method CharSequence SupportMenuItem.getTitle()>
	//    4   12:areturn         
	}

	public CharSequence getTitleCondensed()
	{
		return ((SupportMenuItem)mWrappedObject).getTitleCondensed();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #137 <Method CharSequence SupportMenuItem.getTitleCondensed()>
	//    4   12:areturn         
	}

	public CharSequence getTooltipText()
	{
		return ((SupportMenuItem)mWrappedObject).getTooltipText();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #140 <Method CharSequence SupportMenuItem.getTooltipText()>
	//    4   12:areturn         
	}

	public boolean hasSubMenu()
	{
		return ((SupportMenuItem)mWrappedObject).hasSubMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #143 <Method boolean SupportMenuItem.hasSubMenu()>
	//    4   12:ireturn         
	}

	public boolean isActionViewExpanded()
	{
		return ((SupportMenuItem)mWrappedObject).isActionViewExpanded();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #146 <Method boolean SupportMenuItem.isActionViewExpanded()>
	//    4   12:ireturn         
	}

	public boolean isCheckable()
	{
		return ((SupportMenuItem)mWrappedObject).isCheckable();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #149 <Method boolean SupportMenuItem.isCheckable()>
	//    4   12:ireturn         
	}

	public boolean isChecked()
	{
		return ((SupportMenuItem)mWrappedObject).isChecked();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #152 <Method boolean SupportMenuItem.isChecked()>
	//    4   12:ireturn         
	}

	public boolean isEnabled()
	{
		return ((SupportMenuItem)mWrappedObject).isEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #155 <Method boolean SupportMenuItem.isEnabled()>
	//    4   12:ireturn         
	}

	public boolean isVisible()
	{
		return ((SupportMenuItem)mWrappedObject).isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:invokeinterface #158 <Method boolean SupportMenuItem.isVisible()>
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
	//*   5    9:ifnull          28
			actionprovider = ((ActionProvider) (createActionProviderWrapper(actionprovider)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #162 <Method MenuItemWrapperICS$ActionProviderWrapper createActionProviderWrapper(ActionProvider)>
	//    9   17:astore_1        
		else
	//*  10   18:aload_2         
	//*  11   19:aload_1         
	//*  12   20:invokeinterface #166 <Method SupportMenuItem SupportMenuItem.setSupportActionProvider(android.support.v4.view.ActionProvider)>
	//*  13   25:pop             
	//*  14   26:aload_0         
	//*  15   27:areturn         
			actionprovider = null;
	//   16   28:aconst_null     
	//   17   29:astore_1        
		supportmenuitem.setSupportActionProvider(((android.support.v4.view.ActionProvider) (actionprovider)));
		return ((MenuItem) (this));
	//*  18   30:goto            18
	}

	public MenuItem setActionView(int i)
	{
		((SupportMenuItem)mWrappedObject).setActionView(i);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:iload_1         
	//    4    8:invokeinterface #170 <Method MenuItem SupportMenuItem.setActionView(int)>
	//    5   13:pop             
		View view = ((SupportMenuItem)mWrappedObject).getActionView();
	//    6   14:aload_0         
	//    7   15:getfield        #43  <Field Object mWrappedObject>
	//    8   18:checkcast       #45  <Class SupportMenuItem>
	//    9   21:invokeinterface #73  <Method View SupportMenuItem.getActionView()>
	//   10   26:astore_2        
		if(view instanceof CollapsibleActionView)
	//*  11   27:aload_2         
	//*  12   28:instanceof      #172 <Class CollapsibleActionView>
	//*  13   31:ifeq            55
			((SupportMenuItem)mWrappedObject).setActionView(((View) (new CollapsibleActionViewWrapper(view))));
	//   14   34:aload_0         
	//   15   35:getfield        #43  <Field Object mWrappedObject>
	//   16   38:checkcast       #45  <Class SupportMenuItem>
	//   17   41:new             #12  <Class MenuItemWrapperICS$CollapsibleActionViewWrapper>
	//   18   44:dup             
	//   19   45:aload_2         
	//   20   46:invokespecial   #175 <Method void MenuItemWrapperICS$CollapsibleActionViewWrapper(View)>
	//   21   49:invokeinterface #178 <Method MenuItem SupportMenuItem.setActionView(View)>
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
	//*   3    3:instanceof      #172 <Class CollapsibleActionView>
	//*   4    6:ifeq            18
			obj = ((Object) (new CollapsibleActionViewWrapper(view)));
	//    5    9:new             #12  <Class MenuItemWrapperICS$CollapsibleActionViewWrapper>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #175 <Method void MenuItemWrapperICS$CollapsibleActionViewWrapper(View)>
	//    9   17:astore_2        
		((SupportMenuItem)mWrappedObject).setActionView(((View) (obj)));
	//   10   18:aload_0         
	//   11   19:getfield        #43  <Field Object mWrappedObject>
	//   12   22:checkcast       #45  <Class SupportMenuItem>
	//   13   25:aload_2         
	//   14   26:invokeinterface #178 <Method MenuItem SupportMenuItem.setActionView(View)>
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
	//    4    8:invokeinterface #182 <Method MenuItem SupportMenuItem.setAlphabeticShortcut(char)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setAlphabeticShortcut(char c, int i)
	{
		((SupportMenuItem)mWrappedObject).setAlphabeticShortcut(c, i);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:invokeinterface #185 <Method MenuItem SupportMenuItem.setAlphabeticShortcut(char, int)>
	//    6   14:pop             
		return ((MenuItem) (this));
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public MenuItem setCheckable(boolean flag)
	{
		((SupportMenuItem)mWrappedObject).setCheckable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:iload_1         
	//    4    8:invokeinterface #189 <Method MenuItem SupportMenuItem.setCheckable(boolean)>
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
	//    4    8:invokeinterface #192 <Method MenuItem SupportMenuItem.setChecked(boolean)>
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
	//    4    8:invokeinterface #197 <Method SupportMenuItem SupportMenuItem.setContentDescription(CharSequence)>
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
	//    4    8:invokeinterface #200 <Method MenuItem SupportMenuItem.setEnabled(boolean)>
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
	//*   1    1:getfield        #206 <Field Method mSetExclusiveCheckableMethod>
	//*   2    4:ifnonnull       36
				mSetExclusiveCheckableMethod = ((Object) ((SupportMenuItem)mWrappedObject)).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] {
					Boolean.TYPE
				});
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #43  <Field Object mWrappedObject>
	//    6   12:checkcast       #45  <Class SupportMenuItem>
	//    7   15:invokevirtual   #212 <Method Class Object.getClass()>
	//    8   18:ldc1            #213 <String "setExclusiveCheckable">
	//    9   20:iconst_1        
	//   10   21:anewarray       Class[]
	//   11   24:dup             
	//   12   25:iconst_0        
	//   13   26:getstatic       #221 <Field Class Boolean.TYPE>
	//   14   29:aastore         
	//   15   30:invokevirtual   #225 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   16   33:putfield        #206 <Field Method mSetExclusiveCheckableMethod>
			mSetExclusiveCheckableMethod.invoke(mWrappedObject, new Object[] {
				Boolean.valueOf(flag)
			});
	//   17   36:aload_0         
	//   18   37:getfield        #206 <Field Method mSetExclusiveCheckableMethod>
	//   19   40:aload_0         
	//   20   41:getfield        #43  <Field Object mWrappedObject>
	//   21   44:iconst_1        
	//   22   45:anewarray       Object[]
	//   23   48:dup             
	//   24   49:iconst_0        
	//   25   50:iload_1         
	//   26   51:invokestatic    #229 <Method Boolean Boolean.valueOf(boolean)>
	//   27   54:aastore         
	//   28   55:invokevirtual   #235 <Method Object Method.invoke(Object, Object[])>
	//   29   58:pop             
			return;
	//   30   59:return          
		}
		catch(Exception exception)
	//*  31   60:astore_2        
		{
			Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", ((Throwable) (exception)));
	//   32   61:ldc1            #29  <String "MenuItemWrapper">
	//   33   63:ldc1            #237 <String "Error while calling setExclusiveCheckable">
	//   34   65:aload_2         
	//   35   66:invokestatic    #243 <Method int Log.w(String, String, Throwable)>
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
	//    4    8:invokeinterface #246 <Method MenuItem SupportMenuItem.setIcon(int)>
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
	//    4    8:invokeinterface #249 <Method MenuItem SupportMenuItem.setIcon(Drawable)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setIconTintList(ColorStateList colorstatelist)
	{
		((SupportMenuItem)mWrappedObject).setIconTintList(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:aload_1         
	//    4    8:invokeinterface #253 <Method MenuItem SupportMenuItem.setIconTintList(ColorStateList)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode)
	{
		((SupportMenuItem)mWrappedObject).setIconTintMode(mode);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:aload_1         
	//    4    8:invokeinterface #257 <Method MenuItem SupportMenuItem.setIconTintMode(android.graphics.PorterDuff$Mode)>
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
	//    4    8:invokeinterface #261 <Method MenuItem SupportMenuItem.setIntent(Intent)>
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
	//    4    8:invokeinterface #264 <Method MenuItem SupportMenuItem.setNumericShortcut(char)>
	//    5   13:pop             
		return ((MenuItem) (this));
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public MenuItem setNumericShortcut(char c, int i)
	{
		((SupportMenuItem)mWrappedObject).setNumericShortcut(c, i);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:invokeinterface #266 <Method MenuItem SupportMenuItem.setNumericShortcut(char, int)>
	//    6   14:pop             
		return ((MenuItem) (this));
	//    7   15:aload_0         
	//    8   16:areturn         
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
	//*   5    9:ifnull          32
			onactionexpandlistener = ((android.view.MenuItem.OnActionExpandListener) (new OnActionExpandListenerWrapper(onactionexpandlistener)));
	//    6   12:new             #15  <Class MenuItemWrapperICS$OnActionExpandListenerWrapper>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #271 <Method void MenuItemWrapperICS$OnActionExpandListenerWrapper(MenuItemWrapperICS, android.view.MenuItem$OnActionExpandListener)>
	//   11   21:astore_1        
		else
	//*  12   22:aload_2         
	//*  13   23:aload_1         
	//*  14   24:invokeinterface #273 <Method MenuItem SupportMenuItem.setOnActionExpandListener(android.view.MenuItem$OnActionExpandListener)>
	//*  15   29:pop             
	//*  16   30:aload_0         
	//*  17   31:areturn         
			onactionexpandlistener = null;
	//   18   32:aconst_null     
	//   19   33:astore_1        
		supportmenuitem.setOnActionExpandListener(onactionexpandlistener);
		return ((MenuItem) (this));
	//*  20   34:goto            22
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
	//*   5    9:ifnull          32
			onmenuitemclicklistener = ((android.view.MenuItem.OnMenuItemClickListener) (new OnMenuItemClickListenerWrapper(onmenuitemclicklistener)));
	//    6   12:new             #18  <Class MenuItemWrapperICS$OnMenuItemClickListenerWrapper>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #278 <Method void MenuItemWrapperICS$OnMenuItemClickListenerWrapper(MenuItemWrapperICS, android.view.MenuItem$OnMenuItemClickListener)>
	//   11   21:astore_1        
		else
	//*  12   22:aload_2         
	//*  13   23:aload_1         
	//*  14   24:invokeinterface #280 <Method MenuItem SupportMenuItem.setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener)>
	//*  15   29:pop             
	//*  16   30:aload_0         
	//*  17   31:areturn         
			onmenuitemclicklistener = null;
	//   18   32:aconst_null     
	//   19   33:astore_1        
		supportmenuitem.setOnMenuItemClickListener(onmenuitemclicklistener);
		return ((MenuItem) (this));
	//*  20   34:goto            22
	}

	public MenuItem setShortcut(char c, char c1)
	{
		((SupportMenuItem)mWrappedObject).setShortcut(c, c1);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:invokeinterface #284 <Method MenuItem SupportMenuItem.setShortcut(char, char)>
	//    6   14:pop             
		return ((MenuItem) (this));
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public MenuItem setShortcut(char c, char c1, int i, int j)
	{
		((SupportMenuItem)mWrappedObject).setShortcut(c, c1, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:iload_3         
	//    6   10:iload           4
	//    7   12:invokeinterface #287 <Method MenuItem SupportMenuItem.setShortcut(char, char, int, int)>
	//    8   17:pop             
		return ((MenuItem) (this));
	//    9   18:aload_0         
	//   10   19:areturn         
	}

	public void setShowAsAction(int i)
	{
		((SupportMenuItem)mWrappedObject).setShowAsAction(i);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:iload_1         
	//    4    8:invokeinterface #291 <Method void SupportMenuItem.setShowAsAction(int)>
	//    5   13:return          
	}

	public MenuItem setShowAsActionFlags(int i)
	{
		((SupportMenuItem)mWrappedObject).setShowAsActionFlags(i);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object mWrappedObject>
	//    2    4:checkcast       #45  <Class SupportMenuItem>
	//    3    7:iload_1         
	//    4    8:invokeinterface #294 <Method MenuItem SupportMenuItem.setShowAsActionFlags(int)>
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
	//    4    8:invokeinterface #297 <Method MenuItem SupportMenuItem.setTitle(int)>
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
	//    4    8:invokeinterface #299 <Method MenuItem SupportMenuItem.setTitle(CharSequence)>
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
	//    4    8:invokeinterface #302 <Method MenuItem SupportMenuItem.setTitleCondensed(CharSequence)>
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
	//    4    8:invokeinterface #305 <Method SupportMenuItem SupportMenuItem.setTooltipText(CharSequence)>
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
	//    4    8:invokeinterface #308 <Method MenuItem SupportMenuItem.setVisible(boolean)>
	//    5   13:areturn         
	}

	static final String LOG_TAG = "MenuItemWrapper";
	private Method mSetExclusiveCheckableMethod;
}
