// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.menu.h;
import android.support.v7.view.menu.u;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuPresenter

private class ActionMenuPresenter$f
	implements android.support.v7.view.menu.o.a
{

	public void a(h h1, boolean flag)
	{
		if(h1 instanceof u)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #22  <Class u>
	//*   2    4:ifeq            15
			h1.p().b(false);
	//    3    7:aload_1         
	//    4    8:invokevirtual   #28  <Method h h.p()>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #32  <Method void h.b(boolean)>
		android.support.v7.view.menu.o.a a1 = a.d();
	//    7   15:aload_0         
	//    8   16:getfield        #15  <Field ActionMenuPresenter a>
	//    9   19:invokevirtual   #36  <Method android.support.v7.view.menu.o$a ActionMenuPresenter.d()>
	//   10   22:astore_3        
		if(a1 != null)
	//*  11   23:aload_3         
	//*  12   24:ifnull          35
			a1.a(h1, flag);
	//   13   27:aload_3         
	//   14   28:aload_1         
	//   15   29:iload_2         
	//   16   30:invokeinterface #38  <Method void android.support.v7.view.menu.o$a.a(h, boolean)>
	//   17   35:return          
	}

	public boolean a(h h1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(h1 == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		a.l = ((u)h1).getItem().getItemId();
	//    6    8:aload_0         
	//    7    9:getfield        #15  <Field ActionMenuPresenter a>
	//    8   12:aload_1         
	//    9   13:checkcast       #22  <Class u>
	//   10   16:invokevirtual   #43  <Method MenuItem u.getItem()>
	//   11   19:invokeinterface #49  <Method int MenuItem.getItemId()>
	//   12   24:putfield        #53  <Field int ActionMenuPresenter.l>
		android.support.v7.view.menu.o.a a1 = a.d();
	//   13   27:aload_0         
	//   14   28:getfield        #15  <Field ActionMenuPresenter a>
	//   15   31:invokevirtual   #36  <Method android.support.v7.view.menu.o$a ActionMenuPresenter.d()>
	//   16   34:astore_3        
		if(a1 != null)
	//*  17   35:aload_3         
	//*  18   36:ifnull          47
			flag = a1.a(h1);
	//   19   39:aload_3         
	//   20   40:aload_1         
	//   21   41:invokeinterface #55  <Method boolean android.support.v7.view.menu.o$a.a(h)>
	//   22   46:istore_2        
		return flag;
	//   23   47:iload_2         
	//   24   48:ireturn         
	}

	final ActionMenuPresenter a;

	ActionMenuPresenter$f(ActionMenuPresenter actionmenupresenter)
	{
		a = actionmenupresenter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ActionMenuPresenter a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
