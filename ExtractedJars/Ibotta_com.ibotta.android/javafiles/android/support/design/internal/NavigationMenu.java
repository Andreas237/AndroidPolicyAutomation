// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.view.SubMenu;

// Referenced classes of package android.support.design.internal:
//			NavigationSubMenu

public class NavigationMenu extends MenuBuilder
{

	public SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
	{
		charsequence = ((CharSequence) ((MenuItemImpl)addInternal(i, j, k, charsequence)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #14  <Method android.view.MenuItem addInternal(int, int, int, CharSequence)>
	//    6    9:checkcast       #16  <Class MenuItemImpl>
	//    7   12:astore          4
		NavigationSubMenu navigationsubmenu = new NavigationSubMenu(getContext(), this, ((MenuItemImpl) (charsequence)));
	//    8   14:new             #18  <Class NavigationSubMenu>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokevirtual   #22  <Method android.content.Context getContext()>
	//   12   22:aload_0         
	//   13   23:aload           4
	//   14   25:invokespecial   #26  <Method void NavigationSubMenu(android.content.Context, NavigationMenu, MenuItemImpl)>
	//   15   28:astore          5
		((MenuItemImpl) (charsequence)).setSubMenu(((android.support.v7.view.menu.SubMenuBuilder) (navigationsubmenu)));
	//   16   30:aload           4
	//   17   32:aload           5
	//   18   34:invokevirtual   #30  <Method void MenuItemImpl.setSubMenu(android.support.v7.view.menu.SubMenuBuilder)>
		return ((SubMenu) (navigationsubmenu));
	//   19   37:aload           5
	//   20   39:areturn         
	}
}
