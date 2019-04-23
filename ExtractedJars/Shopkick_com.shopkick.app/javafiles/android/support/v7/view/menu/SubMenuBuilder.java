// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.*;

// Referenced classes of package android.support.v7.view.menu:
//			MenuBuilder, MenuItemImpl

public class SubMenuBuilder extends MenuBuilder
	implements SubMenu
{

	public SubMenuBuilder(Context context, MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void MenuBuilder(Context)>
		mParentMenu = menubuilder;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field MenuBuilder mParentMenu>
		mItem = menuitemimpl;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field MenuItemImpl mItem>
	//    9   15:return          
	}

	public boolean collapseItemActionView(MenuItemImpl menuitemimpl)
	{
		return mParentMenu.collapseItemActionView(menuitemimpl);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MenuBuilder mParentMenu>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method boolean MenuBuilder.collapseItemActionView(MenuItemImpl)>
	//    4    8:ireturn         
	}

	boolean dispatchMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
	{
		return super.dispatchMenuItemSelected(menubuilder, menuitem) || mParentMenu.dispatchMenuItemSelected(menubuilder, menuitem);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #32  <Method boolean MenuBuilder.dispatchMenuItemSelected(MenuBuilder, MenuItem)>
	//    4    6:ifne            26
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field MenuBuilder mParentMenu>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #32  <Method boolean MenuBuilder.dispatchMenuItemSelected(MenuBuilder, MenuItem)>
	//   10   18:ifeq            24
	//   11   21:goto            26
	//   12   24:iconst_0        
	//   13   25:ireturn         
	//   14   26:iconst_1        
	//   15   27:ireturn         
	}

	public boolean expandItemActionView(MenuItemImpl menuitemimpl)
	{
		return mParentMenu.expandItemActionView(menuitemimpl);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MenuBuilder mParentMenu>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #35  <Method boolean MenuBuilder.expandItemActionView(MenuItemImpl)>
	//    4    8:ireturn         
	}

	public String getActionViewStatesKey()
	{
		MenuItemImpl menuitemimpl = mItem;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MenuItemImpl mItem>
	//    2    4:astore_2        
		int i;
		if(menuitemimpl != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			i = menuitemimpl.getItemId();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #43  <Method int MenuItemImpl.getItemId()>
	//    7   13:istore_1        
		else
	//*   8   14:goto            19
			i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_1        
		if(i == 0)
	//*  11   19:iload_1         
	//*  12   20:ifne            25
		{
			return null;
	//   13   23:aconst_null     
	//   14   24:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   15   25:new             #45  <Class StringBuilder>
	//   16   28:dup             
	//   17   29:invokespecial   #48  <Method void StringBuilder()>
	//   18   32:astore_2        
			stringbuilder.append(super.getActionViewStatesKey());
	//   19   33:aload_2         
	//   20   34:aload_0         
	//   21   35:invokespecial   #50  <Method String MenuBuilder.getActionViewStatesKey()>
	//   22   38:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   23   41:pop             
			stringbuilder.append(":");
	//   24   42:aload_2         
	//   25   43:ldc1            #56  <String ":">
	//   26   45:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   27   48:pop             
			stringbuilder.append(i);
	//   28   49:aload_2         
	//   29   50:iload_1         
	//   30   51:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   31   54:pop             
			return stringbuilder.toString();
	//   32   55:aload_2         
	//   33   56:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   34   59:areturn         
		}
	}

	public MenuItem getItem()
	{
		return ((MenuItem) (mItem));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MenuItemImpl mItem>
	//    2    4:areturn         
	}

	public Menu getParentMenu()
	{
		return ((Menu) (mParentMenu));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MenuBuilder mParentMenu>
	//    2    4:areturn         
	}

	public MenuBuilder getRootMenu()
	{
		return mParentMenu.getRootMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MenuBuilder mParentMenu>
	//    2    4:invokevirtual   #70  <Method MenuBuilder MenuBuilder.getRootMenu()>
	//    3    7:areturn         
	}

	public boolean isGroupDividerEnabled()
	{
		return mParentMenu.isGroupDividerEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MenuBuilder mParentMenu>
	//    2    4:invokevirtual   #74  <Method boolean MenuBuilder.isGroupDividerEnabled()>
	//    3    7:ireturn         
	}

	public boolean isQwertyMode()
	{
		return mParentMenu.isQwertyMode();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MenuBuilder mParentMenu>
	//    2    4:invokevirtual   #77  <Method boolean MenuBuilder.isQwertyMode()>
	//    3    7:ireturn         
	}

	public boolean isShortcutsVisible()
	{
		return mParentMenu.isShortcutsVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MenuBuilder mParentMenu>
	//    2    4:invokevirtual   #80  <Method boolean MenuBuilder.isShortcutsVisible()>
	//    3    7:ireturn         
	}

	public void setCallback(MenuBuilder.Callback callback)
	{
		mParentMenu.setCallback(callback);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MenuBuilder mParentMenu>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #84  <Method void MenuBuilder.setCallback(MenuBuilder$Callback)>
	//    4    8:return          
	}

	public void setGroupDividerEnabled(boolean flag)
	{
		mParentMenu.setGroupDividerEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MenuBuilder mParentMenu>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #88  <Method void MenuBuilder.setGroupDividerEnabled(boolean)>
	//    4    8:return          
	}

	public SubMenu setHeaderIcon(int i)
	{
		return (SubMenu)super.setHeaderIconInt(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #94  <Method MenuBuilder MenuBuilder.setHeaderIconInt(int)>
	//    3    5:checkcast       #6   <Class SubMenu>
	//    4    8:areturn         
	}

	public SubMenu setHeaderIcon(Drawable drawable)
	{
		return (SubMenu)super.setHeaderIconInt(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #98  <Method MenuBuilder MenuBuilder.setHeaderIconInt(Drawable)>
	//    3    5:checkcast       #6   <Class SubMenu>
	//    4    8:areturn         
	}

	public SubMenu setHeaderTitle(int i)
	{
		return (SubMenu)super.setHeaderTitleInt(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #102 <Method MenuBuilder MenuBuilder.setHeaderTitleInt(int)>
	//    3    5:checkcast       #6   <Class SubMenu>
	//    4    8:areturn         
	}

	public SubMenu setHeaderTitle(CharSequence charsequence)
	{
		return (SubMenu)super.setHeaderTitleInt(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #106 <Method MenuBuilder MenuBuilder.setHeaderTitleInt(CharSequence)>
	//    3    5:checkcast       #6   <Class SubMenu>
	//    4    8:areturn         
	}

	public SubMenu setHeaderView(View view)
	{
		return (SubMenu)super.setHeaderViewInt(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #112 <Method MenuBuilder MenuBuilder.setHeaderViewInt(View)>
	//    3    5:checkcast       #6   <Class SubMenu>
	//    4    8:areturn         
	}

	public SubMenu setIcon(int i)
	{
		mItem.setIcon(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MenuItemImpl mItem>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #116 <Method MenuItem MenuItemImpl.setIcon(int)>
	//    4    8:pop             
		return ((SubMenu) (this));
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public SubMenu setIcon(Drawable drawable)
	{
		mItem.setIcon(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MenuItemImpl mItem>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #119 <Method MenuItem MenuItemImpl.setIcon(Drawable)>
	//    4    8:pop             
		return ((SubMenu) (this));
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public void setQwertyMode(boolean flag)
	{
		mParentMenu.setQwertyMode(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MenuBuilder mParentMenu>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #122 <Method void MenuBuilder.setQwertyMode(boolean)>
	//    4    8:return          
	}

	public void setShortcutsVisible(boolean flag)
	{
		mParentMenu.setShortcutsVisible(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MenuBuilder mParentMenu>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #125 <Method void MenuBuilder.setShortcutsVisible(boolean)>
	//    4    8:return          
	}

	private MenuItemImpl mItem;
	private MenuBuilder mParentMenu;
}
