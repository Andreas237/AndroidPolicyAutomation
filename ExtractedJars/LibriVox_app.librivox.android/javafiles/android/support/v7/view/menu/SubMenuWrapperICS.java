// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a.c;
import android.view.*;

// Referenced classes of package android.support.v7.view.menu:
//			MenuWrapperICS

class SubMenuWrapperICS extends MenuWrapperICS
	implements SubMenu
{

	SubMenuWrapperICS(Context context, c c1)
	{
		super(context, ((android.support.v4.c.a.a) (c1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void MenuWrapperICS(Context, android.support.v4.c.a.a)>
	//    4    6:return          
	}

	public void clearHeader()
	{
		getWrappedObject().clearHeader();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #18  <Method c getWrappedObject()>
	//    2    4:invokeinterface #22  <Method void c.clearHeader()>
	//    3    9:return          
	}

	public MenuItem getItem()
	{
		return getMenuItemWrapper(getWrappedObject().getItem());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #18  <Method c getWrappedObject()>
	//    3    5:invokeinterface #26  <Method MenuItem c.getItem()>
	//    4   10:invokevirtual   #30  <Method MenuItem getMenuItemWrapper(MenuItem)>
	//    5   13:areturn         
	}

	public c getWrappedObject()
	{
		return (c)mWrappedObject;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Object mWrappedObject>
	//    2    4:checkcast       #20  <Class c>
	//    3    7:areturn         
	}

	public volatile Object getWrappedObject()
	{
		return ((Object) (getWrappedObject()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #18  <Method c getWrappedObject()>
	//    2    4:areturn         
	}

	public SubMenu setHeaderIcon(int i)
	{
		getWrappedObject().setHeaderIcon(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #18  <Method c getWrappedObject()>
	//    2    4:iload_1         
	//    3    5:invokeinterface #39  <Method SubMenu c.setHeaderIcon(int)>
	//    4   10:pop             
		return ((SubMenu) (this));
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public SubMenu setHeaderIcon(Drawable drawable)
	{
		getWrappedObject().setHeaderIcon(drawable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #18  <Method c getWrappedObject()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #42  <Method SubMenu c.setHeaderIcon(Drawable)>
	//    4   10:pop             
		return ((SubMenu) (this));
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public SubMenu setHeaderTitle(int i)
	{
		getWrappedObject().setHeaderTitle(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #18  <Method c getWrappedObject()>
	//    2    4:iload_1         
	//    3    5:invokeinterface #45  <Method SubMenu c.setHeaderTitle(int)>
	//    4   10:pop             
		return ((SubMenu) (this));
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public SubMenu setHeaderTitle(CharSequence charsequence)
	{
		getWrappedObject().setHeaderTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #18  <Method c getWrappedObject()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #48  <Method SubMenu c.setHeaderTitle(CharSequence)>
	//    4   10:pop             
		return ((SubMenu) (this));
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public SubMenu setHeaderView(View view)
	{
		getWrappedObject().setHeaderView(view);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #18  <Method c getWrappedObject()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #52  <Method SubMenu c.setHeaderView(View)>
	//    4   10:pop             
		return ((SubMenu) (this));
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public SubMenu setIcon(int i)
	{
		getWrappedObject().setIcon(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #18  <Method c getWrappedObject()>
	//    2    4:iload_1         
	//    3    5:invokeinterface #55  <Method SubMenu c.setIcon(int)>
	//    4   10:pop             
		return ((SubMenu) (this));
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public SubMenu setIcon(Drawable drawable)
	{
		getWrappedObject().setIcon(drawable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #18  <Method c getWrappedObject()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #57  <Method SubMenu c.setIcon(Drawable)>
	//    4   10:pop             
		return ((SubMenu) (this));
	//    5   11:aload_0         
	//    6   12:areturn         
	}
}
