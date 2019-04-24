// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.res.ColorStateList;
import android.view.MenuItem;

// Referenced classes of package android.support.v4.view:
//			MenuItemCompat

static class MenuItemCompat$MenuItemCompatApi26Impl extends MenuItemCompat.MenuItemCompatBaseImpl
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

	MenuItemCompat$MenuItemCompatApi26Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void MenuItemCompat$MenuItemCompatBaseImpl()>
	//    2    4:return          
	}
}
