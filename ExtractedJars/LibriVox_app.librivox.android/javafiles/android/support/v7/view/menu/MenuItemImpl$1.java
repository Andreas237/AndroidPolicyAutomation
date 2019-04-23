// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.support.v4.view.f;

// Referenced classes of package android.support.v7.view.menu:
//			MenuItemImpl, MenuBuilder

class MenuItemImpl$1
	implements f
{

	public void onActionProviderVisibilityChanged(boolean flag)
	{
		mMenu.a(MenuItemImpl.this);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field MenuItemImpl this$0>
	//    2    4:getfield        #24  <Field MenuBuilder MenuItemImpl.mMenu>
	//    3    7:aload_0         
	//    4    8:getfield        #12  <Field MenuItemImpl this$0>
	//    5   11:invokevirtual   #29  <Method void MenuBuilder.a(MenuItemImpl)>
	//    6   14:return          
	}

	final MenuItemImpl this$0;

	MenuItemImpl$1()
	{
		this$0 = MenuItemImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MenuItemImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
