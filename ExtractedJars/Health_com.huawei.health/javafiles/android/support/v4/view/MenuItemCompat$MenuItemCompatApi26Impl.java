// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.MenuItem;

// Referenced classes of package android.support.v4.view:
//			MenuItemCompat

static class MenuItemCompat$MenuItemCompatApi26Impl extends MenuItemCompat.MenuItemCompatBaseImpl
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

	MenuItemCompat$MenuItemCompatApi26Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void MenuItemCompat$MenuItemCompatBaseImpl()>
	//    2    4:return          
	}
}
