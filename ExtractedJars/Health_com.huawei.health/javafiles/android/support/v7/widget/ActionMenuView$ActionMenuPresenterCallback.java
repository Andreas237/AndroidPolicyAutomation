// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.menu.MenuBuilder;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuView

class ActionMenuView$ActionMenuPresenterCallback
	implements android.support.v7.view.menu.MenuPresenter.Callback
{

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
	//    0    0:return          
	}

	public boolean onOpenSubMenu(MenuBuilder menubuilder)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	final ActionMenuView this$0;

	ActionMenuView$ActionMenuPresenterCallback()
	{
		this$0 = ActionMenuView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ActionMenuView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
