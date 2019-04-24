// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.internal.view.SupportSubMenu;
import android.view.*;

// Referenced classes of package android.support.v7.view.menu:
//			MenuWrapperICS

class SubMenuWrapperICS extends MenuWrapperICS
	implements SubMenu
{

	SubMenuWrapperICS(Context context, SupportSubMenu supportsubmenu)
	{
		super(context, ((android.support.v4.internal.view.SupportMenu) (supportsubmenu)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void MenuWrapperICS(Context, android.support.v4.internal.view.SupportMenu)>
	//    4    6:return          
	}

	public void clearHeader()
	{
		getWrappedObject().clearHeader();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SupportSubMenu getWrappedObject()>
	//    2    4:invokeinterface #26  <Method void SupportSubMenu.clearHeader()>
	//    3    9:return          
	}

	public MenuItem getItem()
	{
		return getMenuItemWrapper(getWrappedObject().getItem());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #22  <Method SupportSubMenu getWrappedObject()>
	//    3    5:invokeinterface #30  <Method MenuItem SupportSubMenu.getItem()>
	//    4   10:invokevirtual   #34  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//    5   13:areturn         
	}

	public SupportSubMenu getWrappedObject()
	{
		return (SupportSubMenu)mWrappedObject;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Object mWrappedObject>
	//    2    4:checkcast       #24  <Class SupportSubMenu>
	//    3    7:areturn         
	}

	public volatile Object getWrappedObject()
	{
		return ((Object) (getWrappedObject()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SupportSubMenu getWrappedObject()>
	//    2    4:areturn         
	}

	public SubMenu setHeaderIcon(int i)
	{
		getWrappedObject().setHeaderIcon(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SupportSubMenu getWrappedObject()>
	//    2    4:iload_1         
	//    3    5:invokeinterface #43  <Method SubMenu SupportSubMenu.setHeaderIcon(int)>
	//    4   10:pop             
		return ((SubMenu) (this));
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public SubMenu setHeaderIcon(Drawable drawable)
	{
		getWrappedObject().setHeaderIcon(drawable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SupportSubMenu getWrappedObject()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #46  <Method SubMenu SupportSubMenu.setHeaderIcon(Drawable)>
	//    4   10:pop             
		return ((SubMenu) (this));
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public SubMenu setHeaderTitle(int i)
	{
		getWrappedObject().setHeaderTitle(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SupportSubMenu getWrappedObject()>
	//    2    4:iload_1         
	//    3    5:invokeinterface #49  <Method SubMenu SupportSubMenu.setHeaderTitle(int)>
	//    4   10:pop             
		return ((SubMenu) (this));
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public SubMenu setHeaderTitle(CharSequence charsequence)
	{
		getWrappedObject().setHeaderTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SupportSubMenu getWrappedObject()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #52  <Method SubMenu SupportSubMenu.setHeaderTitle(CharSequence)>
	//    4   10:pop             
		return ((SubMenu) (this));
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public SubMenu setHeaderView(View view)
	{
		getWrappedObject().setHeaderView(view);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SupportSubMenu getWrappedObject()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #56  <Method SubMenu SupportSubMenu.setHeaderView(View)>
	//    4   10:pop             
		return ((SubMenu) (this));
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public SubMenu setIcon(int i)
	{
		getWrappedObject().setIcon(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SupportSubMenu getWrappedObject()>
	//    2    4:iload_1         
	//    3    5:invokeinterface #59  <Method SubMenu SupportSubMenu.setIcon(int)>
	//    4   10:pop             
		return ((SubMenu) (this));
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public SubMenu setIcon(Drawable drawable)
	{
		getWrappedObject().setIcon(drawable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SupportSubMenu getWrappedObject()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #61  <Method SubMenu SupportSubMenu.setIcon(Drawable)>
	//    4   10:pop             
		return ((SubMenu) (this));
	//    5   11:aload_0         
	//    6   12:areturn         
	}
}