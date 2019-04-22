// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.res.ColorStateList;
import android.support.v4.internal.view.SupportMenuItem;
import android.util.Log;
import android.view.MenuItem;

// Referenced classes of package android.support.v4.view:
//			ActionProvider

public final class MenuItemCompat
{
	public static interface OnActionExpandListener
	{

		public abstract boolean onMenuItemActionCollapse(MenuItem menuitem);

		public abstract boolean onMenuItemActionExpand(MenuItem menuitem);
	}


	public static MenuItem setActionProvider(MenuItem menuitem, ActionProvider actionprovider)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #11  <Class SupportMenuItem>
	//*   2    4:ifeq            18
		{
			return ((MenuItem) (((SupportMenuItem)menuitem).setSupportActionProvider(actionprovider)));
	//    3    7:aload_0         
	//    4    8:checkcast       #11  <Class SupportMenuItem>
	//    5   11:aload_1         
	//    6   12:invokeinterface #15  <Method SupportMenuItem SupportMenuItem.setSupportActionProvider(ActionProvider)>
	//    7   17:areturn         
		} else
		{
			Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
	//    8   18:ldc1            #17  <String "MenuItemCompat">
	//    9   20:ldc1            #19  <String "setActionProvider: item does not implement SupportMenuItem; ignoring">
	//   10   22:invokestatic    #25  <Method int Log.w(String, String)>
	//   11   25:pop             
			return menuitem;
	//   12   26:aload_0         
	//   13   27:areturn         
		}
	}

	public static void setAlphabeticShortcut(MenuItem menuitem, char c, int i)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #11  <Class SupportMenuItem>
	//*   2    4:ifeq            20
		{
			((SupportMenuItem)menuitem).setAlphabeticShortcut(c, i);
	//    3    7:aload_0         
	//    4    8:checkcast       #11  <Class SupportMenuItem>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokeinterface #31  <Method MenuItem SupportMenuItem.setAlphabeticShortcut(char, int)>
	//    8   18:pop             
			return;
	//    9   19:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  10   20:getstatic       #37  <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   23:bipush          26
	//*  12   25:icmplt          37
			menuitem.setAlphabeticShortcut(c, i);
	//   13   28:aload_0         
	//   14   29:iload_1         
	//   15   30:iload_2         
	//   16   31:invokeinterface #40  <Method MenuItem MenuItem.setAlphabeticShortcut(char, int)>
	//   17   36:pop             
	//   18   37:return          
	}

	public static void setContentDescription(MenuItem menuitem, CharSequence charsequence)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #11  <Class SupportMenuItem>
	//*   2    4:ifeq            19
		{
			((SupportMenuItem)menuitem).setContentDescription(charsequence);
	//    3    7:aload_0         
	//    4    8:checkcast       #11  <Class SupportMenuItem>
	//    5   11:aload_1         
	//    6   12:invokeinterface #45  <Method SupportMenuItem SupportMenuItem.setContentDescription(CharSequence)>
	//    7   17:pop             
			return;
	//    8   18:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   9   19:getstatic       #37  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   22:bipush          26
	//*  11   24:icmplt          35
			menuitem.setContentDescription(charsequence);
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:invokeinterface #48  <Method MenuItem MenuItem.setContentDescription(CharSequence)>
	//   15   34:pop             
	//   16   35:return          
	}

	public static void setIconTintList(MenuItem menuitem, ColorStateList colorstatelist)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #11  <Class SupportMenuItem>
	//*   2    4:ifeq            19
		{
			((SupportMenuItem)menuitem).setIconTintList(colorstatelist);
	//    3    7:aload_0         
	//    4    8:checkcast       #11  <Class SupportMenuItem>
	//    5   11:aload_1         
	//    6   12:invokeinterface #53  <Method MenuItem SupportMenuItem.setIconTintList(ColorStateList)>
	//    7   17:pop             
			return;
	//    8   18:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   9   19:getstatic       #37  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   22:bipush          26
	//*  11   24:icmplt          35
			menuitem.setIconTintList(colorstatelist);
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:invokeinterface #54  <Method MenuItem MenuItem.setIconTintList(ColorStateList)>
	//   15   34:pop             
	//   16   35:return          
	}

	public static void setIconTintMode(MenuItem menuitem, android.graphics.PorterDuff.Mode mode)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #11  <Class SupportMenuItem>
	//*   2    4:ifeq            19
		{
			((SupportMenuItem)menuitem).setIconTintMode(mode);
	//    3    7:aload_0         
	//    4    8:checkcast       #11  <Class SupportMenuItem>
	//    5   11:aload_1         
	//    6   12:invokeinterface #59  <Method MenuItem SupportMenuItem.setIconTintMode(android.graphics.PorterDuff$Mode)>
	//    7   17:pop             
			return;
	//    8   18:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   9   19:getstatic       #37  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   22:bipush          26
	//*  11   24:icmplt          35
			menuitem.setIconTintMode(mode);
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:invokeinterface #60  <Method MenuItem MenuItem.setIconTintMode(android.graphics.PorterDuff$Mode)>
	//   15   34:pop             
	//   16   35:return          
	}

	public static void setNumericShortcut(MenuItem menuitem, char c, int i)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #11  <Class SupportMenuItem>
	//*   2    4:ifeq            20
		{
			((SupportMenuItem)menuitem).setNumericShortcut(c, i);
	//    3    7:aload_0         
	//    4    8:checkcast       #11  <Class SupportMenuItem>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokeinterface #63  <Method MenuItem SupportMenuItem.setNumericShortcut(char, int)>
	//    8   18:pop             
			return;
	//    9   19:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  10   20:getstatic       #37  <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   23:bipush          26
	//*  12   25:icmplt          37
			menuitem.setNumericShortcut(c, i);
	//   13   28:aload_0         
	//   14   29:iload_1         
	//   15   30:iload_2         
	//   16   31:invokeinterface #64  <Method MenuItem MenuItem.setNumericShortcut(char, int)>
	//   17   36:pop             
	//   18   37:return          
	}

	public static void setShowAsAction(MenuItem menuitem, int i)
	{
		menuitem.setShowAsAction(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokeinterface #70  <Method void MenuItem.setShowAsAction(int)>
	//    3    7:return          
	}

	public static void setTooltipText(MenuItem menuitem, CharSequence charsequence)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #11  <Class SupportMenuItem>
	//*   2    4:ifeq            19
		{
			((SupportMenuItem)menuitem).setTooltipText(charsequence);
	//    3    7:aload_0         
	//    4    8:checkcast       #11  <Class SupportMenuItem>
	//    5   11:aload_1         
	//    6   12:invokeinterface #74  <Method SupportMenuItem SupportMenuItem.setTooltipText(CharSequence)>
	//    7   17:pop             
			return;
	//    8   18:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   9   19:getstatic       #37  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   22:bipush          26
	//*  11   24:icmplt          35
			menuitem.setTooltipText(charsequence);
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:invokeinterface #76  <Method MenuItem MenuItem.setTooltipText(CharSequence)>
	//   15   34:pop             
	//   16   35:return          
	}
}
