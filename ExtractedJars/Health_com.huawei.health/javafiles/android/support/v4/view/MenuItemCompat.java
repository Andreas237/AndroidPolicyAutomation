// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.os.BuildCompat;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//			ActionProvider

public final class MenuItemCompat
{
	static class MenuItemCompatApi26Impl extends MenuItemCompatBaseImpl
	{

		public CharSequence getContentDescription(MenuItem menuitem)
		{
			return menuitem.getContentDescription();
		//    0    0:aload_1         
		//    1    1:invokeinterface #22  <Method CharSequence MenuItem.getContentDescription()>
		//    2    6:areturn         
		}

		public CharSequence getTooltipText(MenuItem menuitem)
		{
			return menuitem.getTooltipText();
		//    0    0:aload_1         
		//    1    1:invokeinterface #25  <Method CharSequence MenuItem.getTooltipText()>
		//    2    6:areturn         
		}

		public void setContentDescription(MenuItem menuitem, CharSequence charsequence)
		{
			menuitem.setContentDescription(charsequence);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokeinterface #30  <Method MenuItem MenuItem.setContentDescription(CharSequence)>
		//    3    7:pop             
		//    4    8:return          
		}

		public void setTooltipText(MenuItem menuitem, CharSequence charsequence)
		{
			menuitem.setTooltipText(charsequence);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokeinterface #33  <Method MenuItem MenuItem.setTooltipText(CharSequence)>
		//    3    7:pop             
		//    4    8:return          
		}

		MenuItemCompatApi26Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void MenuItemCompat$MenuItemCompatBaseImpl()>
		//    2    4:return          
		}
	}

	static class MenuItemCompatBaseImpl
		implements MenuVersionImpl
	{

		public CharSequence getContentDescription(MenuItem menuitem)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public CharSequence getTooltipText(MenuItem menuitem)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void setContentDescription(MenuItem menuitem, CharSequence charsequence)
		{
		//    0    0:return          
		}

		public void setTooltipText(MenuItem menuitem, CharSequence charsequence)
		{
		//    0    0:return          
		}

		MenuItemCompatBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static interface MenuVersionImpl
	{

		public abstract CharSequence getContentDescription(MenuItem menuitem);

		public abstract CharSequence getTooltipText(MenuItem menuitem);

		public abstract void setContentDescription(MenuItem menuitem, CharSequence charsequence);

		public abstract void setTooltipText(MenuItem menuitem, CharSequence charsequence);
	}

	public static interface OnActionExpandListener
	{

		public abstract boolean onMenuItemActionCollapse(MenuItem menuitem);

		public abstract boolean onMenuItemActionExpand(MenuItem menuitem);
	}


	private MenuItemCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
	//    2    4:return          
	}

	public static boolean collapseActionView(MenuItem menuitem)
	{
		return menuitem.collapseActionView();
	//    0    0:aload_0         
	//    1    1:invokeinterface #58  <Method boolean MenuItem.collapseActionView()>
	//    2    6:ireturn         
	}

	public static boolean expandActionView(MenuItem menuitem)
	{
		return menuitem.expandActionView();
	//    0    0:aload_0         
	//    1    1:invokeinterface #62  <Method boolean MenuItem.expandActionView()>
	//    2    6:ireturn         
	}

	public static ActionProvider getActionProvider(MenuItem menuitem)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #66  <Class SupportMenuItem>
	//*   2    4:ifeq            17
		{
			return ((SupportMenuItem)menuitem).getSupportActionProvider();
	//    3    7:aload_0         
	//    4    8:checkcast       #66  <Class SupportMenuItem>
	//    5   11:invokeinterface #70  <Method ActionProvider SupportMenuItem.getSupportActionProvider()>
	//    6   16:areturn         
		} else
		{
			Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
	//    7   17:ldc1            #36  <String "MenuItemCompat">
	//    8   19:ldc1            #72  <String "getActionProvider: item does not implement SupportMenuItem; returning null">
	//    9   21:invokestatic    #78  <Method int Log.w(String, String)>
	//   10   24:pop             
			return null;
	//   11   25:aconst_null     
	//   12   26:areturn         
		}
	}

	public static View getActionView(MenuItem menuitem)
	{
		return menuitem.getActionView();
	//    0    0:aload_0         
	//    1    1:invokeinterface #83  <Method View MenuItem.getActionView()>
	//    2    6:areturn         
	}

	public static CharSequence getContentDescription(MenuItem menuitem)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #66  <Class SupportMenuItem>
	//*   2    4:ifeq            17
			return ((SupportMenuItem)menuitem).getContentDescription();
	//    3    7:aload_0         
	//    4    8:checkcast       #66  <Class SupportMenuItem>
	//    5   11:invokeinterface #88  <Method CharSequence SupportMenuItem.getContentDescription()>
	//    6   16:areturn         
		else
			return IMPL.getContentDescription(menuitem);
	//    7   17:getstatic       #49  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//    8   20:aload_0         
	//    9   21:invokeinterface #90  <Method CharSequence MenuItemCompat$MenuVersionImpl.getContentDescription(MenuItem)>
	//   10   26:areturn         
	}

	public static CharSequence getTooltipText(MenuItem menuitem)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #66  <Class SupportMenuItem>
	//*   2    4:ifeq            17
			return ((SupportMenuItem)menuitem).getTooltipText();
	//    3    7:aload_0         
	//    4    8:checkcast       #66  <Class SupportMenuItem>
	//    5   11:invokeinterface #93  <Method CharSequence SupportMenuItem.getTooltipText()>
	//    6   16:areturn         
		else
			return IMPL.getTooltipText(menuitem);
	//    7   17:getstatic       #49  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//    8   20:aload_0         
	//    9   21:invokeinterface #95  <Method CharSequence MenuItemCompat$MenuVersionImpl.getTooltipText(MenuItem)>
	//   10   26:areturn         
	}

	public static boolean isActionViewExpanded(MenuItem menuitem)
	{
		return menuitem.isActionViewExpanded();
	//    0    0:aload_0         
	//    1    1:invokeinterface #98  <Method boolean MenuItem.isActionViewExpanded()>
	//    2    6:ireturn         
	}

	public static MenuItem setActionProvider(MenuItem menuitem, ActionProvider actionprovider)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #66  <Class SupportMenuItem>
	//*   2    4:ifeq            18
		{
			return ((MenuItem) (((SupportMenuItem)menuitem).setSupportActionProvider(actionprovider)));
	//    3    7:aload_0         
	//    4    8:checkcast       #66  <Class SupportMenuItem>
	//    5   11:aload_1         
	//    6   12:invokeinterface #104 <Method SupportMenuItem SupportMenuItem.setSupportActionProvider(ActionProvider)>
	//    7   17:areturn         
		} else
		{
			Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
	//    8   18:ldc1            #36  <String "MenuItemCompat">
	//    9   20:ldc1            #106 <String "setActionProvider: item does not implement SupportMenuItem; ignoring">
	//   10   22:invokestatic    #78  <Method int Log.w(String, String)>
	//   11   25:pop             
			return menuitem;
	//   12   26:aload_0         
	//   13   27:areturn         
		}
	}

	public static MenuItem setActionView(MenuItem menuitem, int i)
	{
		return menuitem.setActionView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokeinterface #111 <Method MenuItem MenuItem.setActionView(int)>
	//    3    7:areturn         
	}

	public static MenuItem setActionView(MenuItem menuitem, View view)
	{
		return menuitem.setActionView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #115 <Method MenuItem MenuItem.setActionView(View)>
	//    3    7:areturn         
	}

	public static void setContentDescription(MenuItem menuitem, CharSequence charsequence)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #66  <Class SupportMenuItem>
	//*   2    4:ifeq            19
		{
			((SupportMenuItem)menuitem).setContentDescription(charsequence);
	//    3    7:aload_0         
	//    4    8:checkcast       #66  <Class SupportMenuItem>
	//    5   11:aload_1         
	//    6   12:invokeinterface #120 <Method SupportMenuItem SupportMenuItem.setContentDescription(CharSequence)>
	//    7   17:pop             
			return;
	//    8   18:return          
		} else
		{
			IMPL.setContentDescription(menuitem, charsequence);
	//    9   19:getstatic       #49  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokeinterface #122 <Method void MenuItemCompat$MenuVersionImpl.setContentDescription(MenuItem, CharSequence)>
			return;
	//   13   29:return          
		}
	}

	public static MenuItem setOnActionExpandListener(MenuItem menuitem, OnActionExpandListener onactionexpandlistener)
	{
		return menuitem.setOnActionExpandListener(new android.view.MenuItem.OnActionExpandListener(onactionexpandlistener) {

			public boolean onMenuItemActionCollapse(MenuItem menuitem1)
			{
				return listener.onMenuItemActionCollapse(menuitem1);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MenuItemCompat$OnActionExpandListener val$listener>
			//    2    4:aload_1         
			//    3    5:invokeinterface #27  <Method boolean MenuItemCompat$OnActionExpandListener.onMenuItemActionCollapse(MenuItem)>
			//    4   10:ireturn         
			}

			public boolean onMenuItemActionExpand(MenuItem menuitem1)
			{
				return listener.onMenuItemActionExpand(menuitem1);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MenuItemCompat$OnActionExpandListener val$listener>
			//    2    4:aload_1         
			//    3    5:invokeinterface #30  <Method boolean MenuItemCompat$OnActionExpandListener.onMenuItemActionExpand(MenuItem)>
			//    4   10:ireturn         
			}

			final OnActionExpandListener val$listener;

			
			{
				listener = onactionexpandlistener;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MenuItemCompat$OnActionExpandListener val$listener>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #6   <Class MenuItemCompat$1>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #127 <Method void MenuItemCompat$1(MenuItemCompat$OnActionExpandListener)>
	//    5    9:invokeinterface #130 <Method MenuItem MenuItem.setOnActionExpandListener(android.view.MenuItem$OnActionExpandListener)>
	//    6   14:areturn         
	}

	public static void setShowAsAction(MenuItem menuitem, int i)
	{
		menuitem.setShowAsAction(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokeinterface #135 <Method void MenuItem.setShowAsAction(int)>
	//    3    7:return          
	}

	public static void setTooltipText(MenuItem menuitem, CharSequence charsequence)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #66  <Class SupportMenuItem>
	//*   2    4:ifeq            19
		{
			((SupportMenuItem)menuitem).setTooltipText(charsequence);
	//    3    7:aload_0         
	//    4    8:checkcast       #66  <Class SupportMenuItem>
	//    5   11:aload_1         
	//    6   12:invokeinterface #138 <Method SupportMenuItem SupportMenuItem.setTooltipText(CharSequence)>
	//    7   17:pop             
			return;
	//    8   18:return          
		} else
		{
			IMPL.setTooltipText(menuitem, charsequence);
	//    9   19:getstatic       #49  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokeinterface #140 <Method void MenuItemCompat$MenuVersionImpl.setTooltipText(MenuItem, CharSequence)>
			return;
	//   13   29:return          
		}
	}

	static final MenuVersionImpl IMPL;
	public static final int SHOW_AS_ACTION_ALWAYS = 2;
	public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
	public static final int SHOW_AS_ACTION_IF_ROOM = 1;
	public static final int SHOW_AS_ACTION_NEVER = 0;
	public static final int SHOW_AS_ACTION_WITH_TEXT = 4;
	private static final String TAG = "MenuItemCompat";

	static 
	{
		if(BuildCompat.isAtLeastO())
	//*   0    0:invokestatic    #44  <Method boolean BuildCompat.isAtLeastO()>
	//*   1    3:ifeq            17
			IMPL = ((MenuVersionImpl) (new MenuItemCompatApi26Impl()));
	//    2    6:new             #8   <Class MenuItemCompat$MenuItemCompatApi26Impl>
	//    3    9:dup             
	//    4   10:invokespecial   #47  <Method void MenuItemCompat$MenuItemCompatApi26Impl()>
	//    5   13:putstatic       #49  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//    6   16:return          
		else
			IMPL = ((MenuVersionImpl) (new MenuItemCompatBaseImpl()));
	//    7   17:new             #11  <Class MenuItemCompat$MenuItemCompatBaseImpl>
	//    8   20:dup             
	//    9   21:invokespecial   #50  <Method void MenuItemCompat$MenuItemCompatBaseImpl()>
	//   10   24:putstatic       #49  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//*  11   27:return          
	}
}
