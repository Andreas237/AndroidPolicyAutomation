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
		if(size() + 1 <= 5)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #22  <Method int size()>
	//*   2    4:iconst_1        
	//*   3    5:iadd            
	//*   4    6:iconst_5        
	//*   5    7:icmpgt          49
		{
			stopDispatchingItemsChanged();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #26  <Method void stopDispatchingItemsChanged()>
			charsequence = ((CharSequence) (super.addInternal(i, j, k, charsequence)));
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:iload_2         
	//   11   17:iload_3         
	//   12   18:aload           4
	//   13   20:invokespecial   #28  <Method MenuItem MenuBuilder.addInternal(int, int, int, CharSequence)>
	//   14   23:astore          4
			if(charsequence instanceof MenuItemImpl)
	//*  15   25:aload           4
	//*  16   27:instanceof      #30  <Class MenuItemImpl>
	//*  17   30:ifeq            42
				((MenuItemImpl)charsequence).setExclusiveCheckable(true);
	//   18   33:aload           4
	//   19   35:checkcast       #30  <Class MenuItemImpl>
	//   20   38:iconst_1        
	//   21   39:invokevirtual   #34  <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
			startDispatchingItemsChanged();
	//   22   42:aload_0         
	//   23   43:invokevirtual   #37  <Method void startDispatchingItemsChanged()>
			return ((MenuItem) (charsequence));
	//   24   46:aload           4
	//   25   48:areturn         
		} else
		{
			throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
	//   26   49:new             #39  <Class IllegalArgumentException>
	//   27   52:dup             
	//   28   53:ldc1            #41  <String "Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()">
	//   29   55:invokespecial   #44  <Method void IllegalArgumentException(String)>
	//   30   58:athrow          
		}
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
