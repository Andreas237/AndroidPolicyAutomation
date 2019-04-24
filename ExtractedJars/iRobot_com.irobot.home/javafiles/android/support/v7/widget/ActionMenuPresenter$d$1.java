// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.menu.s;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ac, ActionMenuPresenter

class ActionMenuPresenter$d$1 extends ac
{

	public s a()
	{
		if(b.a.h == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ActionMenuPresenter$d b>
	//*   2    4:getfield        #27  <Field ActionMenuPresenter ActionMenuPresenter$d.a>
	//*   3    7:getfield        #31  <Field ActionMenuPresenter$e ActionMenuPresenter.h>
	//*   4   10:ifnonnull       15
			return null;
	//    5   13:aconst_null     
	//    6   14:areturn         
		else
			return ((s) (b.a.h.b()));
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field ActionMenuPresenter$d b>
	//    9   19:getfield        #27  <Field ActionMenuPresenter ActionMenuPresenter$d.a>
	//   10   22:getfield        #31  <Field ActionMenuPresenter$e ActionMenuPresenter.h>
	//   11   25:invokevirtual   #36  <Method android.support.v7.view.menu.m ActionMenuPresenter$e.b()>
	//   12   28:areturn         
	}

	public boolean b()
	{
		b.a.f();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ActionMenuPresenter$d b>
	//    2    4:getfield        #27  <Field ActionMenuPresenter ActionMenuPresenter$d.a>
	//    3    7:invokevirtual   #40  <Method boolean ActionMenuPresenter.f()>
	//    4   10:pop             
		return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
	}

	public boolean c()
	{
		if(b.a.j != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ActionMenuPresenter$d b>
	//*   2    4:getfield        #27  <Field ActionMenuPresenter ActionMenuPresenter$d.a>
	//*   3    7:getfield        #45  <Field ActionMenuPresenter$c ActionMenuPresenter.j>
	//*   4   10:ifnull          15
		{
			return false;
	//    5   13:iconst_0        
	//    6   14:ireturn         
		} else
		{
			b.a.g();
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field ActionMenuPresenter$d b>
	//    9   19:getfield        #27  <Field ActionMenuPresenter ActionMenuPresenter$d.a>
	//   10   22:invokevirtual   #48  <Method boolean ActionMenuPresenter.g()>
	//   11   25:pop             
			return true;
	//   12   26:iconst_1        
	//   13   27:ireturn         
		}
	}

	final ActionMenuPresenter a;
	final ActionMenuPresenter.d b;

	ActionMenuPresenter$d$1(ActionMenuPresenter.d d1, View view, ActionMenuPresenter actionmenupresenter)
	{
		b = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ActionMenuPresenter$d b>
		a = actionmenupresenter;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #21  <Field ActionMenuPresenter a>
		super(view);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #24  <Method void ac(View)>
	//    9   15:return          
	}
}
