// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.n;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuPresenter

private class ActionMenuPresenter$e extends n
{

	protected void e()
	{
		if(ActionMenuPresenter.a(a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field ActionMenuPresenter a>
	//*   2    4:invokestatic    #38  <Method h ActionMenuPresenter.a(ActionMenuPresenter)>
	//*   3    7:ifnull          20
			ActionMenuPresenter.b(a).close();
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field ActionMenuPresenter a>
	//    6   14:invokestatic    #41  <Method h ActionMenuPresenter.b(ActionMenuPresenter)>
	//    7   17:invokevirtual   #46  <Method void h.close()>
		a.h = null;
	//    8   20:aload_0         
	//    9   21:getfield        #13  <Field ActionMenuPresenter a>
	//   10   24:aconst_null     
	//   11   25:putfield        #50  <Field ActionMenuPresenter$e android.support.v7.widget.ActionMenuPresenter.h>
		super.e();
	//   12   28:aload_0         
	//   13   29:invokespecial   #52  <Method void n.e()>
	//   14   32:return          
	}

	final ActionMenuPresenter a;

	public ActionMenuPresenter$e(ActionMenuPresenter actionmenupresenter, Context context, h h1, View view, boolean flag)
	{
		a = actionmenupresenter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field ActionMenuPresenter a>
		super(context, h1, view, flag, android.support.v7.a.a.a.actionOverflowMenuStyle);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:iload           5
	//    8   12:getstatic       #19  <Field int android.support.v7.a.a$a.actionOverflowMenuStyle>
	//    9   15:invokespecial   #22  <Method void n(Context, h, View, boolean, int)>
		a(0x800005);
	//   10   18:aload_0         
	//   11   19:ldc1            #23  <Int 0x800005>
	//   12   21:invokevirtual   #26  <Method void a(int)>
		a(((android.support.v7.view.menu.o.a) (actionmenupresenter.k)));
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:getfield        #30  <Field ActionMenuPresenter$f ActionMenuPresenter.k>
	//   16   29:invokevirtual   #33  <Method void a(android.support.v7.view.menu.o$a)>
	//   17   32:return          
	}
}
