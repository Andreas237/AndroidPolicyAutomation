// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.menu.s;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuPresenter

private class ActionMenuPresenter$b extends android.support.v7.view.menu.ActionMenuItemView.b
{

	public s a()
	{
		if(a.i != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field ActionMenuPresenter a>
	//*   2    4:getfield        #22  <Field ActionMenuPresenter$a ActionMenuPresenter.i>
	//*   3    7:ifnull          21
			return ((s) (a.i.b()));
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field ActionMenuPresenter a>
	//    6   14:getfield        #22  <Field ActionMenuPresenter$a ActionMenuPresenter.i>
	//    7   17:invokevirtual   #27  <Method android.support.v7.view.menu.m ActionMenuPresenter$a.b()>
	//    8   20:areturn         
		else
			return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
	}

	final ActionMenuPresenter a;

	ActionMenuPresenter$b(ActionMenuPresenter actionmenupresenter)
	{
		a = actionmenupresenter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field ActionMenuPresenter a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void android.support.v7.view.menu.ActionMenuItemView$b()>
	//    5    9:return          
	}
}
