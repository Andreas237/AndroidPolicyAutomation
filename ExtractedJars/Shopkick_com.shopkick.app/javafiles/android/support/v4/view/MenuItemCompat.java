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
	public static interface OnActionExpandListener
	{

		public abstract boolean onMenuItemActionCollapse(MenuItem menuitem);

		public abstract boolean onMenuItemActionExpand(MenuItem menuitem);
	}


	private MenuItemCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}

	public static boolean collapseActionView(MenuItem menuitem)
	{
		return menuitem.collapseActionView();
	//    0    0:aload_0         
	//    1    1:invokeinterface #37  <Method boolean MenuItem.collapseActionView()>
	//    2    6:ireturn         
	}

	public static boolean expandActionView(MenuItem menuitem)
	{
		return menuitem.expandActionView();
	//    0    0:aload_0         
	//    1    1:invokeinterface #41  <Method boolean MenuItem.expandActionView()>
	//    2    6:ireturn         
	}

	public static ActionProvider getActionProvider(MenuItem menuitem)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #45  <Class SupportMenuItem>
	//*   2    4:ifeq            17
		{
			return ((SupportMenuItem)menuitem).getSupportActionProvider();
	//    3    7:aload_0         
	//    4    8:checkcast       #45  <Class SupportMenuItem>
	//    5   11:invokeinterface #49  <Method ActionProvider SupportMenuItem.getSupportActionProvider()>
	//    6   16:areturn         
		} else
		{
			Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
	//    7   17:ldc1            #25  <String "MenuItemCompat">
	//    8   19:ldc1            #51  <String "getActionProvider: item does not implement SupportMenuItem; returning null">
	//    9   21:invokestatic    #57  <Method int Log.w(String, String)>
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
	//    1    1:invokeinterface #62  <Method View MenuItem.getActionView()>
	//    2    6:areturn         
	}

	public static int getAlphabeticModifiers(MenuItem menuitem)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #45  <Class SupportMenuItem>
	//*   2    4:ifeq            17
			return ((SupportMenuItem)menuitem).getAlphabeticModifiers();
	//    3    7:aload_0         
	//    4    8:checkcast       #45  <Class SupportMenuItem>
	//    5   11:invokeinterface #67  <Method int SupportMenuItem.getAlphabeticModifiers()>
	//    6   16:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   7   17:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   20:bipush          26
	//*   9   22:icmplt          32
			return menuitem.getAlphabeticModifiers();
	//   10   25:aload_0         
	//   11   26:invokeinterface #73  <Method int MenuItem.getAlphabeticModifiers()>
	//   12   31:ireturn         
		else
			return 0;
	//   13   32:iconst_0        
	//   14   33:ireturn         
	}

	public static CharSequence getContentDescription(MenuItem menuitem)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #45  <Class SupportMenuItem>
	//*   2    4:ifeq            17
			return ((SupportMenuItem)menuitem).getContentDescription();
	//    3    7:aload_0         
	//    4    8:checkcast       #45  <Class SupportMenuItem>
	//    5   11:invokeinterface #78  <Method CharSequence SupportMenuItem.getContentDescription()>
	//    6   16:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   7   17:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   20:bipush          26
	//*   9   22:icmplt          32
			return menuitem.getContentDescription();
	//   10   25:aload_0         
	//   11   26:invokeinterface #79  <Method CharSequence MenuItem.getContentDescription()>
	//   12   31:areturn         
		else
			return null;
	//   13   32:aconst_null     
	//   14   33:areturn         
	}

	public static ColorStateList getIconTintList(MenuItem menuitem)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #45  <Class SupportMenuItem>
	//*   2    4:ifeq            17
			return ((SupportMenuItem)menuitem).getIconTintList();
	//    3    7:aload_0         
	//    4    8:checkcast       #45  <Class SupportMenuItem>
	//    5   11:invokeinterface #84  <Method ColorStateList SupportMenuItem.getIconTintList()>
	//    6   16:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   7   17:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   20:bipush          26
	//*   9   22:icmplt          32
			return menuitem.getIconTintList();
	//   10   25:aload_0         
	//   11   26:invokeinterface #85  <Method ColorStateList MenuItem.getIconTintList()>
	//   12   31:areturn         
		else
			return null;
	//   13   32:aconst_null     
	//   14   33:areturn         
	}

	public static android.graphics.PorterDuff.Mode getIconTintMode(MenuItem menuitem)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #45  <Class SupportMenuItem>
	//*   2    4:ifeq            17
			return ((SupportMenuItem)menuitem).getIconTintMode();
	//    3    7:aload_0         
	//    4    8:checkcast       #45  <Class SupportMenuItem>
	//    5   11:invokeinterface #90  <Method android.graphics.PorterDuff$Mode SupportMenuItem.getIconTintMode()>
	//    6   16:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   7   17:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   20:bipush          26
	//*   9   22:icmplt          32
			return menuitem.getIconTintMode();
	//   10   25:aload_0         
	//   11   26:invokeinterface #91  <Method android.graphics.PorterDuff$Mode MenuItem.getIconTintMode()>
	//   12   31:areturn         
		else
			return null;
	//   13   32:aconst_null     
	//   14   33:areturn         
	}

	public static int getNumericModifiers(MenuItem menuitem)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #45  <Class SupportMenuItem>
	//*   2    4:ifeq            17
			return ((SupportMenuItem)menuitem).getNumericModifiers();
	//    3    7:aload_0         
	//    4    8:checkcast       #45  <Class SupportMenuItem>
	//    5   11:invokeinterface #94  <Method int SupportMenuItem.getNumericModifiers()>
	//    6   16:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   7   17:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   20:bipush          26
	//*   9   22:icmplt          32
			return menuitem.getNumericModifiers();
	//   10   25:aload_0         
	//   11   26:invokeinterface #95  <Method int MenuItem.getNumericModifiers()>
	//   12   31:ireturn         
		else
			return 0;
	//   13   32:iconst_0        
	//   14   33:ireturn         
	}

	public static CharSequence getTooltipText(MenuItem menuitem)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #45  <Class SupportMenuItem>
	//*   2    4:ifeq            17
			return ((SupportMenuItem)menuitem).getTooltipText();
	//    3    7:aload_0         
	//    4    8:checkcast       #45  <Class SupportMenuItem>
	//    5   11:invokeinterface #98  <Method CharSequence SupportMenuItem.getTooltipText()>
	//    6   16:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   7   17:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   20:bipush          26
	//*   9   22:icmplt          32
			return menuitem.getTooltipText();
	//   10   25:aload_0         
	//   11   26:invokeinterface #99  <Method CharSequence MenuItem.getTooltipText()>
	//   12   31:areturn         
		else
			return null;
	//   13   32:aconst_null     
	//   14   33:areturn         
	}

	public static boolean isActionViewExpanded(MenuItem menuitem)
	{
		return menuitem.isActionViewExpanded();
	//    0    0:aload_0         
	//    1    1:invokeinterface #102 <Method boolean MenuItem.isActionViewExpanded()>
	//    2    6:ireturn         
	}

	public static MenuItem setActionProvider(MenuItem menuitem, ActionProvider actionprovider)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #45  <Class SupportMenuItem>
	//*   2    4:ifeq            18
		{
			return ((MenuItem) (((SupportMenuItem)menuitem).setSupportActionProvider(actionprovider)));
	//    3    7:aload_0         
	//    4    8:checkcast       #45  <Class SupportMenuItem>
	//    5   11:aload_1         
	//    6   12:invokeinterface #108 <Method SupportMenuItem SupportMenuItem.setSupportActionProvider(ActionProvider)>
	//    7   17:areturn         
		} else
		{
			Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
	//    8   18:ldc1            #25  <String "MenuItemCompat">
	//    9   20:ldc1            #110 <String "setActionProvider: item does not implement SupportMenuItem; ignoring">
	//   10   22:invokestatic    #57  <Method int Log.w(String, String)>
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
	//    2    2:invokeinterface #115 <Method MenuItem MenuItem.setActionView(int)>
	//    3    7:areturn         
	}

	public static MenuItem setActionView(MenuItem menuitem, View view)
	{
		return menuitem.setActionView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #119 <Method MenuItem MenuItem.setActionView(View)>
	//    3    7:areturn         
	}

	public static void setAlphabeticShortcut(MenuItem menuitem, char c, int i)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #45  <Class SupportMenuItem>
	//*   2    4:ifeq            20
		{
			((SupportMenuItem)menuitem).setAlphabeticShortcut(c, i);
	//    3    7:aload_0         
	//    4    8:checkcast       #45  <Class SupportMenuItem>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokeinterface #124 <Method MenuItem SupportMenuItem.setAlphabeticShortcut(char, int)>
	//    8   18:pop             
			return;
	//    9   19:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  10   20:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   23:bipush          26
	//*  12   25:icmplt          37
			menuitem.setAlphabeticShortcut(c, i);
	//   13   28:aload_0         
	//   14   29:iload_1         
	//   15   30:iload_2         
	//   16   31:invokeinterface #125 <Method MenuItem MenuItem.setAlphabeticShortcut(char, int)>
	//   17   36:pop             
	//   18   37:return          
	}

	public static void setContentDescription(MenuItem menuitem, CharSequence charsequence)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #45  <Class SupportMenuItem>
	//*   2    4:ifeq            19
		{
			((SupportMenuItem)menuitem).setContentDescription(charsequence);
	//    3    7:aload_0         
	//    4    8:checkcast       #45  <Class SupportMenuItem>
	//    5   11:aload_1         
	//    6   12:invokeinterface #130 <Method SupportMenuItem SupportMenuItem.setContentDescription(CharSequence)>
	//    7   17:pop             
			return;
	//    8   18:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   9   19:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   22:bipush          26
	//*  11   24:icmplt          35
			menuitem.setContentDescription(charsequence);
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:invokeinterface #133 <Method MenuItem MenuItem.setContentDescription(CharSequence)>
	//   15   34:pop             
	//   16   35:return          
	}

	public static void setIconTintList(MenuItem menuitem, ColorStateList colorstatelist)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #45  <Class SupportMenuItem>
	//*   2    4:ifeq            19
		{
			((SupportMenuItem)menuitem).setIconTintList(colorstatelist);
	//    3    7:aload_0         
	//    4    8:checkcast       #45  <Class SupportMenuItem>
	//    5   11:aload_1         
	//    6   12:invokeinterface #138 <Method MenuItem SupportMenuItem.setIconTintList(ColorStateList)>
	//    7   17:pop             
			return;
	//    8   18:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   9   19:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   22:bipush          26
	//*  11   24:icmplt          35
			menuitem.setIconTintList(colorstatelist);
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:invokeinterface #139 <Method MenuItem MenuItem.setIconTintList(ColorStateList)>
	//   15   34:pop             
	//   16   35:return          
	}

	public static void setIconTintMode(MenuItem menuitem, android.graphics.PorterDuff.Mode mode)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #45  <Class SupportMenuItem>
	//*   2    4:ifeq            19
		{
			((SupportMenuItem)menuitem).setIconTintMode(mode);
	//    3    7:aload_0         
	//    4    8:checkcast       #45  <Class SupportMenuItem>
	//    5   11:aload_1         
	//    6   12:invokeinterface #144 <Method MenuItem SupportMenuItem.setIconTintMode(android.graphics.PorterDuff$Mode)>
	//    7   17:pop             
			return;
	//    8   18:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   9   19:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   22:bipush          26
	//*  11   24:icmplt          35
			menuitem.setIconTintMode(mode);
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:invokeinterface #145 <Method MenuItem MenuItem.setIconTintMode(android.graphics.PorterDuff$Mode)>
	//   15   34:pop             
	//   16   35:return          
	}

	public static void setNumericShortcut(MenuItem menuitem, char c, int i)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #45  <Class SupportMenuItem>
	//*   2    4:ifeq            20
		{
			((SupportMenuItem)menuitem).setNumericShortcut(c, i);
	//    3    7:aload_0         
	//    4    8:checkcast       #45  <Class SupportMenuItem>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokeinterface #148 <Method MenuItem SupportMenuItem.setNumericShortcut(char, int)>
	//    8   18:pop             
			return;
	//    9   19:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  10   20:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   23:bipush          26
	//*  12   25:icmplt          37
			menuitem.setNumericShortcut(c, i);
	//   13   28:aload_0         
	//   14   29:iload_1         
	//   15   30:iload_2         
	//   16   31:invokeinterface #149 <Method MenuItem MenuItem.setNumericShortcut(char, int)>
	//   17   36:pop             
	//   18   37:return          
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
	//    4    6:invokespecial   #154 <Method void MenuItemCompat$1(MenuItemCompat$OnActionExpandListener)>
	//    5    9:invokeinterface #157 <Method MenuItem MenuItem.setOnActionExpandListener(android.view.MenuItem$OnActionExpandListener)>
	//    6   14:areturn         
	}

	public static void setShortcut(MenuItem menuitem, char c, char c1, int i, int j)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #45  <Class SupportMenuItem>
	//*   2    4:ifeq            23
		{
			((SupportMenuItem)menuitem).setShortcut(c, c1, i, j);
	//    3    7:aload_0         
	//    4    8:checkcast       #45  <Class SupportMenuItem>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:iload           4
	//    9   16:invokeinterface #162 <Method MenuItem SupportMenuItem.setShortcut(char, char, int, int)>
	//   10   21:pop             
			return;
	//   11   22:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  12   23:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*  13   26:bipush          26
	//*  14   28:icmplt          43
			menuitem.setShortcut(c, c1, i, j);
	//   15   31:aload_0         
	//   16   32:iload_1         
	//   17   33:iload_2         
	//   18   34:iload_3         
	//   19   35:iload           4
	//   20   37:invokeinterface #163 <Method MenuItem MenuItem.setShortcut(char, char, int, int)>
	//   21   42:pop             
	//   22   43:return          
	}

	public static void setShowAsAction(MenuItem menuitem, int i)
	{
		menuitem.setShowAsAction(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokeinterface #168 <Method void MenuItem.setShowAsAction(int)>
	//    3    7:return          
	}

	public static void setTooltipText(MenuItem menuitem, CharSequence charsequence)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #45  <Class SupportMenuItem>
	//*   2    4:ifeq            19
		{
			((SupportMenuItem)menuitem).setTooltipText(charsequence);
	//    3    7:aload_0         
	//    4    8:checkcast       #45  <Class SupportMenuItem>
	//    5   11:aload_1         
	//    6   12:invokeinterface #171 <Method SupportMenuItem SupportMenuItem.setTooltipText(CharSequence)>
	//    7   17:pop             
			return;
	//    8   18:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   9   19:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   22:bipush          26
	//*  11   24:icmplt          35
			menuitem.setTooltipText(charsequence);
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:invokeinterface #173 <Method MenuItem MenuItem.setTooltipText(CharSequence)>
	//   15   34:pop             
	//   16   35:return          
	}

	public static final int SHOW_AS_ACTION_ALWAYS = 2;
	public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
	public static final int SHOW_AS_ACTION_IF_ROOM = 1;
	public static final int SHOW_AS_ACTION_NEVER = 0;
	public static final int SHOW_AS_ACTION_WITH_TEXT = 4;
	private static final String TAG = "MenuItemCompat";
}
