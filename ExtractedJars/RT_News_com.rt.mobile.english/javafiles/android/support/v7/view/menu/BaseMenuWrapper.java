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
		if(mMenuItems != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Map mMenuItems>
	//*   2    4:ifnull          16
			mMenuItems.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field Map mMenuItems>
	//    5   11:invokeinterface #67  <Method void Map.clear()>
		if(mSubMenus != null)
	//*   6   16:aload_0         
	//*   7   17:getfield        #57  <Field Map mSubMenus>
	//*   8   20:ifnull          32
			mSubMenus.clear();
	//    9   23:aload_0         
	//   10   24:getfield        #57  <Field Map mSubMenus>
	//   11   27:invokeinterface #67  <Method void Map.clear()>
	//   12   32:return          
	}

	final void internalRemoveGroup(int i)
	{
		if(mMenuItems == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Map mMenuItems>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		Iterator iterator = mMenuItems.keySet().iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field Map mMenuItems>
	//    6   12:invokeinterface #73  <Method Set Map.keySet()>
	//    7   17:invokeinterface #79  <Method Iterator Set.iterator()>
	//    8   22:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   23:aload_2         
	//   10   24:invokeinterface #85  <Method boolean Iterator.hasNext()>
	//   11   29:ifeq            59
			if(i == ((MenuItem)iterator.next()).getGroupId())
	//*  12   32:iload_1         
	//*  13   33:aload_2         
	//*  14   34:invokeinterface #89  <Method Object Iterator.next()>
	//*  15   39:checkcast       #41  <Class MenuItem>
	//*  16   42:invokeinterface #93  <Method int MenuItem.getGroupId()>
	//*  17   47:icmpne          23
				iterator.remove();
	//   18   50:aload_2         
	//   19   51:invokeinterface #96  <Method void Iterator.remove()>
		} while(true);
	//   20   56:goto            23
	//   21   59:return          
	}

	final void internalRemoveItem(int i)
	{
		if(mMenuItems == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Map mMenuItems>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		Iterator iterator = mMenuItems.keySet().iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field Map mMenuItems>
	//    6   12:invokeinterface #73  <Method Set Map.keySet()>
	//    7   17:invokeinterface #79  <Method Iterator Set.iterator()>
	//    8   22:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   23:aload_2         
	//   10   24:invokeinterface #85  <Method boolean Iterator.hasNext()>
	//   11   29:ifeq            56
			if(i != ((MenuItem)iterator.next()).getItemId())
				continue;
	//   12   32:iload_1         
	//   13   33:aload_2         
	//   14   34:invokeinterface #89  <Method Object Iterator.next()>
	//   15   39:checkcast       #41  <Class MenuItem>
	//   16   42:invokeinterface #100 <Method int MenuItem.getItemId()>
	//   17   47:icmpne          23
			iterator.remove();
	//   18   50:aload_2         
	//   19   51:invokeinterface #96  <Method void Iterator.remove()>
			break;
		} while(true);
	//   20   56:return          
	}

	final Context mContext;
	private Map mMenuItems;
	private Map mSubMenus;
}
