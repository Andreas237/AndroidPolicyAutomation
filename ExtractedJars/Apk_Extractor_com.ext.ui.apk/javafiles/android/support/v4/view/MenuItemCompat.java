// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.res.ColorStateList;
import android.support.v4.internal.view.SupportMenuItem;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//			ActionProvider

public final class MenuItemCompat
{
	static class MenuItemCompatApi26Impl extends MenuItemCompatBaseImpl
	{

		public int getAlphabeticModifiers(MenuItem menuitem)
		{
			return menuitem.getAlphabeticModifiers();
		//    0    0:aload_1         
		//    1    1:invokeinterface #22  <Method int MenuItem.getAlphabeticModifiers()>
		//    2    6:ireturn         
		}

		public CharSequence getContentDescription(MenuItem menuitem)
		{
			return menuitem.getContentDescription();
		//    0    0:aload_1         
		//    1    1:invokeinterface #27  <Method CharSequence MenuItem.getContentDescription()>
		//    2    6:areturn         
		}

		public ColorStateList getIconTintList(MenuItem menuitem)
		{
			return menuitem.getIconTintList();
		//    0    0:aload_1         
		//    1    1:invokeinterface #32  <Method ColorStateList MenuItem.getIconTintList()>
		//    2    6:areturn         
		}

		public android.graphics.PorterDuff.Mode getIconTintMode(MenuItem menuitem)
		{
			return menuitem.getIconTintMode();
		//    0    0:aload_1         
		//    1    1:invokeinterface #37  <Method android.graphics.PorterDuff$Mode MenuItem.getIconTintMode()>
		//    2    6:areturn         
		}

		public int getNumericModifiers(MenuItem menuitem)
		{
			return menuitem.getNumericModifiers();
		//    0    0:aload_1         
		//    1    1:invokeinterface #40  <Method int MenuItem.getNumericModifiers()>
		//    2    6:ireturn         
		}

		public CharSequence getTooltipText(MenuItem menuitem)
		{
			return menuitem.getTooltipText();
		//    0    0:aload_1         
		//    1    1:invokeinterface #43  <Method CharSequence MenuItem.getTooltipText()>
		//    2    6:areturn         
		}

		public void setAlphabeticShortcut(MenuItem menuitem, char c, int i)
		{
			menuitem.setAlphabeticShortcut(c, i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:iload_3         
		//    3    3:invokeinterface #48  <Method MenuItem MenuItem.setAlphabeticShortcut(char, int)>
		//    4    8:pop             
		//    5    9:return          
		}

		public void setContentDescription(MenuItem menuitem, CharSequence charsequence)
		{
			menuitem.setContentDescription(charsequence);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokeinterface #53  <Method MenuItem MenuItem.setContentDescription(CharSequence)>
		//    3    7:pop             
		//    4    8:return          
		}

		public void setIconTintList(MenuItem menuitem, ColorStateList colorstatelist)
		{
			menuitem.setIconTintList(colorstatelist);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokeinterface #58  <Method MenuItem MenuItem.setIconTintList(ColorStateList)>
		//    3    7:pop             
		//    4    8:return          
		}

		public void setIconTintMode(MenuItem menuitem, android.graphics.PorterDuff.Mode mode)
		{
			menuitem.setIconTintMode(mode);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokeinterface #63  <Method MenuItem MenuItem.setIconTintMode(android.graphics.PorterDuff$Mode)>
		//    3    7:pop             
		//    4    8:return          
		}

		public void setNumericShortcut(MenuItem menuitem, char c, int i)
		{
			menuitem.setNumericShortcut(c, i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:iload_3         
		//    3    3:invokeinterface #66  <Method MenuItem MenuItem.setNumericShortcut(char, int)>
		//    4    8:pop             
		//    5    9:return          
		}

		public void setShortcut(MenuItem menuitem, char c, char c1, int i, int j)
		{
			menuitem.setShortcut(c, c1, i, j);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:iload_3         
		//    3    3:iload           4
		//    4    5:iload           5
		//    5    7:invokeinterface #71  <Method MenuItem MenuItem.setShortcut(char, char, int, int)>
		//    6   12:pop             
		//    7   13:return          
		}

		public void setTooltipText(MenuItem menuitem, CharSequence charsequence)
		{
			menuitem.setTooltipText(charsequence);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokeinterface #74  <Method MenuItem MenuItem.setTooltipText(CharSequence)>
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

		public int getAlphabeticModifiers(MenuItem menuitem)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public CharSequence getContentDescription(MenuItem menuitem)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public ColorStateList getIconTintList(MenuItem menuitem)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public android.graphics.PorterDuff.Mode getIconTintMode(MenuItem menuitem)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public int getNumericModifiers(MenuItem menuitem)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public CharSequence getTooltipText(MenuItem menuitem)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void setAlphabeticShortcut(MenuItem menuitem, char c, int i)
		{
		//    0    0:return          
		}

		public void setContentDescription(MenuItem menuitem, CharSequence charsequence)
		{
		//    0    0:return          
		}

		public void setIconTintList(MenuItem menuitem, ColorStateList colorstatelist)
		{
		//    0    0:return          
		}

		public void setIconTintMode(MenuItem menuitem, android.graphics.PorterDuff.Mode mode)
		{
		//    0    0:return          
		}

		public void setNumericShortcut(MenuItem menuitem, char c, int i)
		{
		//    0    0:return          
		}

		public void setShortcut(MenuItem menuitem, char c, char c1, int i, int j)
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

		public abstract int getAlphabeticModifiers(MenuItem menuitem);

		public abstract CharSequence getContentDescription(MenuItem menuitem);

		public abstract ColorStateList getIconTintList(MenuItem menuitem);

		public abstract android.graphics.PorterDuff.Mode getIconTintMode(MenuItem menuitem);

		public abstract int getNumericModifiers(MenuItem menuitem);

		public abstract CharSequence getTooltipText(MenuItem menuitem);

		public abstract void setAlphabeticShortcut(MenuItem menuitem, char c, int i);

		public abstract void setContentDescription(MenuItem menuitem, CharSequence charsequence);

		public abstract void setIconTintList(MenuItem menuitem, ColorStateList colorstatelist);

		public abstract void setIconTintMode(MenuItem menuitem, android.graphics.PorterDuff.Mode mode);

		public abstract void setNumericShortcut(MenuItem menuitem, char c, int i);

		public abstract void setShortcut(MenuItem menuitem, char c, char c1, int i, int j);

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
	//    1    1:invokespecial   #51  <Method void Object()>
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

	public static int getAlphabeticModifiers(MenuItem menuitem)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #66  <Class SupportMenuItem>
	//*   2    4:ifeq            17
			return ((SupportMenuItem)menuitem).getAlphabeticModifiers();
	//    3    7:aload_0         
	//    4    8:checkcast       #66  <Class SupportMenuItem>
	//    5   11:invokeinterface #88  <Method int SupportMenuItem.getAlphabeticModifiers()>
	//    6   16:ireturn         
		else
			return IMPL.getAlphabeticModifiers(menuitem);
	//    7   17:getstatic       #48  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//    8   20:aload_0         
	//    9   21:invokeinterface #90  <Method int MenuItemCompat$MenuVersionImpl.getAlphabeticModifiers(MenuItem)>
	//   10   26:ireturn         
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
	//    5   11:invokeinterface #95  <Method CharSequence SupportMenuItem.getContentDescription()>
	//    6   16:areturn         
		else
			return IMPL.getContentDescription(menuitem);
	//    7   17:getstatic       #48  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//    8   20:aload_0         
	//    9   21:invokeinterface #97  <Method CharSequence MenuItemCompat$MenuVersionImpl.getContentDescription(MenuItem)>
	//   10   26:areturn         
	}

	public static ColorStateList getIconTintList(MenuItem menuitem)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #66  <Class SupportMenuItem>
	//*   2    4:ifeq            17
			return ((SupportMenuItem)menuitem).getIconTintList();
	//    3    7:aload_0         
	//    4    8:checkcast       #66  <Class SupportMenuItem>
	//    5   11:invokeinterface #102 <Method ColorStateList SupportMenuItem.getIconTintList()>
	//    6   16:areturn         
		else
			return IMPL.getIconTintList(menuitem);
	//    7   17:getstatic       #48  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//    8   20:aload_0         
	//    9   21:invokeinterface #104 <Method ColorStateList MenuItemCompat$MenuVersionImpl.getIconTintList(MenuItem)>
	//   10   26:areturn         
	}

	public static android.graphics.PorterDuff.Mode getIconTintMode(MenuItem menuitem)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #66  <Class SupportMenuItem>
	//*   2    4:ifeq            17
			return ((SupportMenuItem)menuitem).getIconTintMode();
	//    3    7:aload_0         
	//    4    8:checkcast       #66  <Class SupportMenuItem>
	//    5   11:invokeinterface #109 <Method android.graphics.PorterDuff$Mode SupportMenuItem.getIconTintMode()>
	//    6   16:areturn         
		else
			return IMPL.getIconTintMode(menuitem);
	//    7   17:getstatic       #48  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//    8   20:aload_0         
	//    9   21:invokeinterface #111 <Method android.graphics.PorterDuff$Mode MenuItemCompat$MenuVersionImpl.getIconTintMode(MenuItem)>
	//   10   26:areturn         
	}

	public static int getNumericModifiers(MenuItem menuitem)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #66  <Class SupportMenuItem>
	//*   2    4:ifeq            17
			return ((SupportMenuItem)menuitem).getNumericModifiers();
	//    3    7:aload_0         
	//    4    8:checkcast       #66  <Class SupportMenuItem>
	//    5   11:invokeinterface #114 <Method int SupportMenuItem.getNumericModifiers()>
	//    6   16:ireturn         
		else
			return IMPL.getNumericModifiers(menuitem);
	//    7   17:getstatic       #48  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//    8   20:aload_0         
	//    9   21:invokeinterface #116 <Method int MenuItemCompat$MenuVersionImpl.getNumericModifiers(MenuItem)>
	//   10   26:ireturn         
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
	//    5   11:invokeinterface #119 <Method CharSequence SupportMenuItem.getTooltipText()>
	//    6   16:areturn         
		else
			return IMPL.getTooltipText(menuitem);
	//    7   17:getstatic       #48  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//    8   20:aload_0         
	//    9   21:invokeinterface #121 <Method CharSequence MenuItemCompat$MenuVersionImpl.getTooltipText(MenuItem)>
	//   10   26:areturn         
	}

	public static boolean isActionViewExpanded(MenuItem menuitem)
	{
		return menuitem.isActionViewExpanded();
	//    0    0:aload_0         
	//    1    1:invokeinterface #124 <Method boolean MenuItem.isActionViewExpanded()>
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
	//    6   12:invokeinterface #130 <Method SupportMenuItem SupportMenuItem.setSupportActionProvider(ActionProvider)>
	//    7   17:areturn         
		} else
		{
			Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
	//    8   18:ldc1            #36  <String "MenuItemCompat">
	//    9   20:ldc1            #132 <String "setActionProvider: item does not implement SupportMenuItem; ignoring">
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
	//    2    2:invokeinterface #137 <Method MenuItem MenuItem.setActionView(int)>
	//    3    7:areturn         
	}

	public static MenuItem setActionView(MenuItem menuitem, View view)
	{
		return menuitem.setActionView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #141 <Method MenuItem MenuItem.setActionView(View)>
	//    3    7:areturn         
	}

	public static void setAlphabeticShortcut(MenuItem menuitem, char c, int i)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #66  <Class SupportMenuItem>
	//*   2    4:ifeq            20
		{
			((SupportMenuItem)menuitem).setAlphabeticShortcut(c, i);
	//    3    7:aload_0         
	//    4    8:checkcast       #66  <Class SupportMenuItem>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokeinterface #146 <Method MenuItem SupportMenuItem.setAlphabeticShortcut(char, int)>
	//    8   18:pop             
			return;
	//    9   19:return          
		} else
		{
			IMPL.setAlphabeticShortcut(menuitem, c, i);
	//   10   20:getstatic       #48  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//   11   23:aload_0         
	//   12   24:iload_1         
	//   13   25:iload_2         
	//   14   26:invokeinterface #148 <Method void MenuItemCompat$MenuVersionImpl.setAlphabeticShortcut(MenuItem, char, int)>
			return;
	//   15   31:return          
		}
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
	//    6   12:invokeinterface #153 <Method SupportMenuItem SupportMenuItem.setContentDescription(CharSequence)>
	//    7   17:pop             
			return;
	//    8   18:return          
		} else
		{
			IMPL.setContentDescription(menuitem, charsequence);
	//    9   19:getstatic       #48  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokeinterface #155 <Method void MenuItemCompat$MenuVersionImpl.setContentDescription(MenuItem, CharSequence)>
			return;
	//   13   29:return          
		}
	}

	public static void setIconTintList(MenuItem menuitem, ColorStateList colorstatelist)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #66  <Class SupportMenuItem>
	//*   2    4:ifeq            19
		{
			((SupportMenuItem)menuitem).setIconTintList(colorstatelist);
	//    3    7:aload_0         
	//    4    8:checkcast       #66  <Class SupportMenuItem>
	//    5   11:aload_1         
	//    6   12:invokeinterface #160 <Method MenuItem SupportMenuItem.setIconTintList(ColorStateList)>
	//    7   17:pop             
			return;
	//    8   18:return          
		} else
		{
			IMPL.setIconTintList(menuitem, colorstatelist);
	//    9   19:getstatic       #48  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokeinterface #162 <Method void MenuItemCompat$MenuVersionImpl.setIconTintList(MenuItem, ColorStateList)>
			return;
	//   13   29:return          
		}
	}

	public static void setIconTintMode(MenuItem menuitem, android.graphics.PorterDuff.Mode mode)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #66  <Class SupportMenuItem>
	//*   2    4:ifeq            19
		{
			((SupportMenuItem)menuitem).setIconTintMode(mode);
	//    3    7:aload_0         
	//    4    8:checkcast       #66  <Class SupportMenuItem>
	//    5   11:aload_1         
	//    6   12:invokeinterface #167 <Method MenuItem SupportMenuItem.setIconTintMode(android.graphics.PorterDuff$Mode)>
	//    7   17:pop             
			return;
	//    8   18:return          
		} else
		{
			IMPL.setIconTintMode(menuitem, mode);
	//    9   19:getstatic       #48  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokeinterface #169 <Method void MenuItemCompat$MenuVersionImpl.setIconTintMode(MenuItem, android.graphics.PorterDuff$Mode)>
			return;
	//   13   29:return          
		}
	}

	public static void setNumericShortcut(MenuItem menuitem, char c, int i)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #66  <Class SupportMenuItem>
	//*   2    4:ifeq            20
		{
			((SupportMenuItem)menuitem).setNumericShortcut(c, i);
	//    3    7:aload_0         
	//    4    8:checkcast       #66  <Class SupportMenuItem>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokeinterface #172 <Method MenuItem SupportMenuItem.setNumericShortcut(char, int)>
	//    8   18:pop             
			return;
	//    9   19:return          
		} else
		{
			IMPL.setNumericShortcut(menuitem, c, i);
	//   10   20:getstatic       #48  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//   11   23:aload_0         
	//   12   24:iload_1         
	//   13   25:iload_2         
	//   14   26:invokeinterface #174 <Method void MenuItemCompat$MenuVersionImpl.setNumericShortcut(MenuItem, char, int)>
			return;
	//   15   31:return          
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
	//    4    6:invokespecial   #179 <Method void MenuItemCompat$1(MenuItemCompat$OnActionExpandListener)>
	//    5    9:invokeinterface #182 <Method MenuItem MenuItem.setOnActionExpandListener(android.view.MenuItem$OnActionExpandListener)>
	//    6   14:areturn         
	}

	public static void setShortcut(MenuItem menuitem, char c, char c1, int i, int j)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #66  <Class SupportMenuItem>
	//*   2    4:ifeq            23
		{
			((SupportMenuItem)menuitem).setShortcut(c, c1, i, j);
	//    3    7:aload_0         
	//    4    8:checkcast       #66  <Class SupportMenuItem>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:iload           4
	//    9   16:invokeinterface #187 <Method MenuItem SupportMenuItem.setShortcut(char, char, int, int)>
	//   10   21:pop             
			return;
	//   11   22:return          
		} else
		{
			IMPL.setShortcut(menuitem, c, c1, i, j);
	//   12   23:getstatic       #48  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//   13   26:aload_0         
	//   14   27:iload_1         
	//   15   28:iload_2         
	//   16   29:iload_3         
	//   17   30:iload           4
	//   18   32:invokeinterface #189 <Method void MenuItemCompat$MenuVersionImpl.setShortcut(MenuItem, char, char, int, int)>
			return;
	//   19   37:return          
		}
	}

	public static void setShowAsAction(MenuItem menuitem, int i)
	{
		menuitem.setShowAsAction(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokeinterface #194 <Method void MenuItem.setShowAsAction(int)>
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
	//    6   12:invokeinterface #197 <Method SupportMenuItem SupportMenuItem.setTooltipText(CharSequence)>
	//    7   17:pop             
			return;
	//    8   18:return          
		} else
		{
			IMPL.setTooltipText(menuitem, charsequence);
	//    9   19:getstatic       #48  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokeinterface #199 <Method void MenuItemCompat$MenuVersionImpl.setTooltipText(MenuItem, CharSequence)>
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
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          19
			IMPL = ((MenuVersionImpl) (new MenuItemCompatApi26Impl()));
	//    3    8:new             #8   <Class MenuItemCompat$MenuItemCompatApi26Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #46  <Method void MenuItemCompat$MenuItemCompatApi26Impl()>
	//    6   15:putstatic       #48  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//    7   18:return          
		else
			IMPL = ((MenuVersionImpl) (new MenuItemCompatBaseImpl()));
	//    8   19:new             #11  <Class MenuItemCompat$MenuItemCompatBaseImpl>
	//    9   22:dup             
	//   10   23:invokespecial   #49  <Method void MenuItemCompat$MenuItemCompatBaseImpl()>
	//   11   26:putstatic       #48  <Field MenuItemCompat$MenuVersionImpl IMPL>
	//*  12   29:return          
	}
}
