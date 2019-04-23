// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.*;

// Referenced classes of package android.support.design.internal:
//			NavigationMenu

public class NavigationSubMenu extends SubMenuBuilder
{

	public NavigationSubMenu(Context context, NavigationMenu navigationmenu, MenuItemImpl menuitemimpl)
	{
		super(context, ((MenuBuilder) (navigationmenu)), menuitemimpl);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #13  <Method void SubMenuBuilder(Context, MenuBuilder, MenuItemImpl)>
	//    5    7:return          
	}

	public void onItemsChanged(boolean flag)
	{
		super.onItemsChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #18  <Method void SubMenuBuilder.onItemsChanged(boolean)>
		((MenuBuilder)getParentMenu()).onItemsChanged(flag);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #22  <Method android.view.Menu getParentMenu()>
	//    5    9:checkcast       #24  <Class MenuBuilder>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #25  <Method void MenuBuilder.onItemsChanged(boolean)>
	//    8   16:return          
	}
}
