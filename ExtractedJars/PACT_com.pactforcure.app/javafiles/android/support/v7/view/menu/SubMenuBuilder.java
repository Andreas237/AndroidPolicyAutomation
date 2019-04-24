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
	//    4    6:ifne            21
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field MenuBuilder mParentMenu>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #32  <Method boolean MenuBuilder.dispatchMenuItemSelected(MenuBuilder, MenuItem)>
	//   10   18:ifeq            23
	//   11   21:iconst_1        
	//   12   22:ireturn         
	//   13   23:iconst_0        
	//   14   24:ireturn         
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
		int i;
		if(mItem != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field MenuItemImpl mItem>
	//*   2    4:ifnull          21
			i = mItem.getItemId();
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field MenuItemImpl mItem>
	//    5   11:invokevirtual   #43  <Method int MenuItemImpl.getItemId()>
	//    6   14:istore_1        
		else
	//*   7   15:iload_1         
	//*   8   16:ifne            26
	//*   9   19:aconst_null     
	//*  10   20:areturn         
			i = 0;
	//   11   21:iconst_0        
	//   12   22:istore_1        
		if(i == 0)
			return null;
		else
	//*  13   23:goto            15
			return (new StringBuilder()).append(super.getActionViewStatesKey()).append(":").append(i).toString();
	//   14   26:new             #45  <Class StringBuilder>
	//   15   29:dup             
	//   16   30:invokespecial   #48  <Method void StringBuilder()>
	//   17   33:aload_0         
	//   18   34:invokespecial   #50  <Method String MenuBuilder.getActionViewStatesKey()>
	//   19   37:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:ldc1            #56  <String ":">
	//   21   42:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   22   45:iload_1         
	//   23   46:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   24   49:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   25   52:areturn         
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

	public boolean isQwertyMode()
	{
		return mParentMenu.isQwertyMode();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MenuBuilder mParentMenu>
	//    2    4:invokevirtual   #74  <Method boolean MenuBuilder.isQwertyMode()>
	//    3    7:ireturn         
	}

	public boolean isShortcutsVisible()
	{
		return mParentMenu.isShortcutsVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MenuBuilder mParentMenu>
	//    2    4:invokevirtual   #77  <Method boolean MenuBuilder.isShortcutsVisible()>
	//    3    7:ireturn         
	}

	public void setCallback(MenuBuilder.Callback callback)
	{
		mParentMenu.setCallback(callback);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MenuBuilder mParentMenu>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #81  <Method void MenuBuilder.setCallback(MenuBuilder$Callback)>
	//    4    8:return          
	}

	public SubMenu setHeaderIcon(int i)
	{
		return (SubMenu)super.setHeaderIconInt(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #87  <Method MenuBuilder MenuBuilder.setHeaderIconInt(int)>
	//    3    5:checkcast       #6   <Class SubMenu>
	//    4    8:areturn         
	}

	public SubMenu setHeaderIcon(Drawable drawable)
	{
		return (SubMenu)super.setHeaderIconInt(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #91  <Method MenuBuilder MenuBuilder.setHeaderIconInt(Drawable)>
	//    3    5:checkcast       #6   <Class SubMenu>
	//    4    8:areturn         
	}

	public SubMenu setHeaderTitle(int i)
	{
		return (SubMenu)super.setHeaderTitleInt(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #95  <Method MenuBuilder MenuBuilder.setHeaderTitleInt(int)>
	//    3    5:checkcast       #6   <Class SubMenu>
	//    4    8:areturn         
	}

	public SubMenu setHeaderTitle(CharSequence charsequence)
	{
		return (SubMenu)super.setHeaderTitleInt(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #99  <Method MenuBuilder MenuBuilder.setHeaderTitleInt(CharSequence)>
	//    3    5:checkcast       #6   <Class SubMenu>
	//    4    8:areturn         
	}

	public SubMenu setHeaderView(View view)
	{
		return (SubMenu)super.setHeaderViewInt(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #105 <Method MenuBuilder MenuBuilder.setHeaderViewInt(View)>
	//    3    5:checkcast       #6   <Class SubMenu>
	//    4    8:areturn         
	}

	public SubMenu setIcon(int i)
	{
		mItem.setIcon(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MenuItemImpl mItem>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #109 <Method MenuItem MenuItemImpl.setIcon(int)>
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
	//    3    5:invokevirtual   #112 <Method MenuItem MenuItemImpl.setIcon(Drawable)>
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
	//    3    5:invokevirtual   #116 <Method void MenuBuilder.setQwertyMode(boolean)>
	//    4    8:return          
	}

	public void setShortcutsVisible(boolean flag)
	{
		mParentMenu.setShortcutsVisible(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MenuBuilder mParentMenu>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #119 <Method void MenuBuilder.setShortcutsVisible(boolean)>
	//    4    8:return          
	}

	private MenuItemImpl mItem;
	private MenuBuilder mParentMenu;
}
