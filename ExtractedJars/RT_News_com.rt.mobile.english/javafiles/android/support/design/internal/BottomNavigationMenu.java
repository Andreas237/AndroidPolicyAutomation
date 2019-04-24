// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.view.MenuItem;
import android.view.SubMenu;

public final class BottomNavigationMenu extends MenuBuilder
{

	public BottomNavigationMenu(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void MenuBuilder(Context)>
	//    3    5:return          
	}

	protected MenuItem addInternal(int i, int j, int k, CharSequence charsequence)
	{
		if(size() + 1 > 5)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #22  <Method int size()>
	//*   2    4:iconst_1        
	//*   3    5:iadd            
	//*   4    6:iconst_5        
	//*   5    7:icmple          20
			throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
	//    6   10:new             #24  <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:ldc1            #26  <String "Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()">
	//    9   16:invokespecial   #29  <Method void IllegalArgumentException(String)>
	//   10   19:athrow          
		stopDispatchingItemsChanged();
	//   11   20:aload_0         
	//   12   21:invokevirtual   #33  <Method void stopDispatchingItemsChanged()>
		charsequence = ((CharSequence) (super.addInternal(i, j, k, charsequence)));
	//   13   24:aload_0         
	//   14   25:iload_1         
	//   15   26:iload_2         
	//   16   27:iload_3         
	//   17   28:aload           4
	//   18   30:invokespecial   #35  <Method MenuItem MenuBuilder.addInternal(int, int, int, CharSequence)>
	//   19   33:astore          4
		if(charsequence instanceof MenuItemImpl)
	//*  20   35:aload           4
	//*  21   37:instanceof      #37  <Class MenuItemImpl>
	//*  22   40:ifeq            52
			((MenuItemImpl)charsequence).setExclusiveCheckable(true);
	//   23   43:aload           4
	//   24   45:checkcast       #37  <Class MenuItemImpl>
	//   25   48:iconst_1        
	//   26   49:invokevirtual   #41  <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
		startDispatchingItemsChanged();
	//   27   52:aload_0         
	//   28   53:invokevirtual   #44  <Method void startDispatchingItemsChanged()>
		return ((MenuItem) (charsequence));
	//   29   56:aload           4
	//   30   58:areturn         
	}

	public SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
	{
		throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
	//    0    0:new             #48  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #50  <String "BottomNavigationView does not support submenus">
	//    3    6:invokespecial   #51  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public static final int MAX_ITEM_COUNT = 5;
}
