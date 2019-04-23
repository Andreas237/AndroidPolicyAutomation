// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.internal.view.SupportSubMenu;
import android.support.v4.util.ArrayMap;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.*;

// Referenced classes of package android.support.v7.view.menu:
//			BaseWrapper, MenuWrapperFactory

abstract class BaseMenuWrapper extends BaseWrapper
{

	BaseMenuWrapper(Context context, Object obj)
	{
		super(obj);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #17  <Method void BaseWrapper(Object)>
		mContext = context;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #19  <Field Context mContext>
	//    6   10:return          
	}

	final MenuItem getMenuItemWrapper(MenuItem menuitem)
	{
		if(menuitem instanceof SupportMenuItem)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #26  <Class SupportMenuItem>
	//*   2    4:ifeq            73
		{
			SupportMenuItem supportmenuitem = (SupportMenuItem)menuitem;
	//    3    7:aload_1         
	//    4    8:checkcast       #26  <Class SupportMenuItem>
	//    5   11:astore_3        
			if(mMenuItems == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #28  <Field Map mMenuItems>
	//*   8   16:ifnonnull       30
				mMenuItems = ((Map) (new ArrayMap()));
	//    9   19:aload_0         
	//   10   20:new             #30  <Class ArrayMap>
	//   11   23:dup             
	//   12   24:invokespecial   #33  <Method void ArrayMap()>
	//   13   27:putfield        #28  <Field Map mMenuItems>
			MenuItem menuitem1 = (MenuItem)mMenuItems.get(((Object) (menuitem)));
	//   14   30:aload_0         
	//   15   31:getfield        #28  <Field Map mMenuItems>
	//   16   34:aload_1         
	//   17   35:invokeinterface #39  <Method Object Map.get(Object)>
	//   18   40:checkcast       #41  <Class MenuItem>
	//   19   43:astore_2        
			menuitem = menuitem1;
	//   20   44:aload_2         
	//   21   45:astore_1        
			if(menuitem1 == null)
	//*  22   46:aload_2         
	//*  23   47:ifnonnull       71
			{
				menuitem = MenuWrapperFactory.wrapSupportMenuItem(mContext, supportmenuitem);
	//   24   50:aload_0         
	//   25   51:getfield        #19  <Field Context mContext>
	//   26   54:aload_3         
	//   27   55:invokestatic    #47  <Method MenuItem MenuWrapperFactory.wrapSupportMenuItem(Context, SupportMenuItem)>
	//   28   58:astore_1        
				mMenuItems.put(((Object) (supportmenuitem)), ((Object) (menuitem)));
	//   29   59:aload_0         
	//   30   60:getfield        #28  <Field Map mMenuItems>
	//   31   63:aload_3         
	//   32   64:aload_1         
	//   33   65:invokeinterface #51  <Method Object Map.put(Object, Object)>
	//   34   70:pop             
			}
			return menuitem;
	//   35   71:aload_1         
	//   36   72:areturn         
		} else
		{
			return menuitem;
	//   37   73:aload_1         
	//   38   74:areturn         
		}
	}

	final SubMenu getSubMenuWrapper(SubMenu submenu)
	{
		if(submenu instanceof SupportSubMenu)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #55  <Class SupportSubMenu>
	//*   2    4:ifeq            73
		{
			SupportSubMenu supportsubmenu = (SupportSubMenu)submenu;
	//    3    7:aload_1         
	//    4    8:checkcast       #55  <Class SupportSubMenu>
	//    5   11:astore_3        
			if(mSubMenus == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #57  <Field Map mSubMenus>
	//*   8   16:ifnonnull       30
				mSubMenus = ((Map) (new ArrayMap()));
	//    9   19:aload_0         
	//   10   20:new             #30  <Class ArrayMap>
	//   11   23:dup             
	//   12   24:invokespecial   #33  <Method void ArrayMap()>
	//   13   27:putfield        #57  <Field Map mSubMenus>
			SubMenu submenu1 = (SubMenu)mSubMenus.get(((Object) (supportsubmenu)));
	//   14   30:aload_0         
	//   15   31:getfield        #57  <Field Map mSubMenus>
	//   16   34:aload_3         
	//   17   35:invokeinterface #39  <Method Object Map.get(Object)>
	//   18   40:checkcast       #59  <Class SubMenu>
	//   19   43:astore_2        
			submenu = submenu1;
	//   20   44:aload_2         
	//   21   45:astore_1        
			if(submenu1 == null)
	//*  22   46:aload_2         
	//*  23   47:ifnonnull       71
			{
				submenu = MenuWrapperFactory.wrapSupportSubMenu(mContext, supportsubmenu);
	//   24   50:aload_0         
	//   25   51:getfield        #19  <Field Context mContext>
	//   26   54:aload_3         
	//   27   55:invokestatic    #63  <Method SubMenu MenuWrapperFactory.wrapSupportSubMenu(Context, SupportSubMenu)>
	//   28   58:astore_1        
				mSubMenus.put(((Object) (supportsubmenu)), ((Object) (submenu)));
	//   29   59:aload_0         
	//   30   60:getfield        #57  <Field Map mSubMenus>
	//   31   63:aload_3         
	//   32   64:aload_1         
	//   33   65:invokeinterface #51  <Method Object Map.put(Object, Object)>
	//   34   70:pop             
			}
			return submenu;
	//   35   71:aload_1         
	//   36   72:areturn         
		} else
		{
			return submenu;
	//   37   73:aload_1         
	//   38   74:areturn         
		}
	}

	final void internalClear()
	{
		Map map = mMenuItems;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Map mMenuItems>
	//    2    4:astore_1        
		if(map != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			map.clear();
	//    5    9:aload_1         
	//    6   10:invokeinterface #67  <Method void Map.clear()>
		map = mSubMenus;
	//    7   15:aload_0         
	//    8   16:getfield        #57  <Field Map mSubMenus>
	//    9   19:astore_1        
		if(map != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          30
			map.clear();
	//   12   24:aload_1         
	//   13   25:invokeinterface #67  <Method void Map.clear()>
	//   14   30:return          
	}

	final void internalRemoveGroup(int i)
	{
		Object obj = ((Object) (mMenuItems));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Map mMenuItems>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		obj = ((Object) (((Map) (obj)).keySet().iterator()));
	//    6   10:aload_2         
	//    7   11:invokeinterface #73  <Method Set Map.keySet()>
	//    8   16:invokeinterface #79  <Method Iterator Set.iterator()>
	//    9   21:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   10   22:aload_2         
	//   11   23:invokeinterface #85  <Method boolean Iterator.hasNext()>
	//   12   28:ifeq            58
			if(i == ((MenuItem)((Iterator) (obj)).next()).getGroupId())
	//*  13   31:iload_1         
	//*  14   32:aload_2         
	//*  15   33:invokeinterface #89  <Method Object Iterator.next()>
	//*  16   38:checkcast       #41  <Class MenuItem>
	//*  17   41:invokeinterface #93  <Method int MenuItem.getGroupId()>
	//*  18   46:icmpne          22
				((Iterator) (obj)).remove();
	//   19   49:aload_2         
	//   20   50:invokeinterface #96  <Method void Iterator.remove()>
		} while(true);
	//   21   55:goto            22
	//   22   58:return          
	}

	final void internalRemoveItem(int i)
	{
		Object obj = ((Object) (mMenuItems));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Map mMenuItems>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		obj = ((Object) (((Map) (obj)).keySet().iterator()));
	//    6   10:aload_2         
	//    7   11:invokeinterface #73  <Method Set Map.keySet()>
	//    8   16:invokeinterface #79  <Method Iterator Set.iterator()>
	//    9   21:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   10   22:aload_2         
	//   11   23:invokeinterface #85  <Method boolean Iterator.hasNext()>
	//   12   28:ifeq            55
			if(i != ((MenuItem)((Iterator) (obj)).next()).getItemId())
				continue;
	//   13   31:iload_1         
	//   14   32:aload_2         
	//   15   33:invokeinterface #89  <Method Object Iterator.next()>
	//   16   38:checkcast       #41  <Class MenuItem>
	//   17   41:invokeinterface #100 <Method int MenuItem.getItemId()>
	//   18   46:icmpne          22
			((Iterator) (obj)).remove();
	//   19   49:aload_2         
	//   20   50:invokeinterface #96  <Method void Iterator.remove()>
			break;
		} while(true);
	//   21   55:return          
	}

	final Context mContext;
	private Map mMenuItems;
	private Map mSubMenus;
}
