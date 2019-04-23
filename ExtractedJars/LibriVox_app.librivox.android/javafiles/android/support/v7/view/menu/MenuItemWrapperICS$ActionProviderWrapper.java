// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.view.d;
import android.view.*;

// Referenced classes of package android.support.v7.view.menu:
//			MenuItemWrapperICS

class MenuItemWrapperICS$ActionProviderWrapper extends d
{

	public boolean hasSubMenu()
	{
		return mInner.hasSubMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ActionProvider mInner>
	//    2    4:invokevirtual   #24  <Method boolean ActionProvider.hasSubMenu()>
	//    3    7:ireturn         
	}

	public View onCreateActionView()
	{
		return mInner.onCreateActionView();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ActionProvider mInner>
	//    2    4:invokevirtual   #28  <Method View ActionProvider.onCreateActionView()>
	//    3    7:areturn         
	}

	public boolean onPerformDefaultAction()
	{
		return mInner.onPerformDefaultAction();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ActionProvider mInner>
	//    2    4:invokevirtual   #31  <Method boolean ActionProvider.onPerformDefaultAction()>
	//    3    7:ireturn         
	}

	public void onPrepareSubMenu(SubMenu submenu)
	{
		mInner.onPrepareSubMenu(getSubMenuWrapper(submenu));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ActionProvider mInner>
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field MenuItemWrapperICS this$0>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #39  <Method SubMenu MenuItemWrapperICS.getSubMenuWrapper(SubMenu)>
	//    6   12:invokevirtual   #41  <Method void ActionProvider.onPrepareSubMenu(SubMenu)>
	//    7   15:return          
	}

	final ActionProvider mInner;
	final MenuItemWrapperICS this$0;

	public MenuItemWrapperICS$ActionProviderWrapper(Context context, ActionProvider actionprovider)
	{
		this$0 = MenuItemWrapperICS.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MenuItemWrapperICS this$0>
		super(context);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #15  <Method void d(Context)>
		mInner = actionprovider;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #17  <Field ActionProvider mInner>
	//    9   15:return          
	}
}
