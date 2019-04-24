// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.menu.*;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuPresenter

private class ActionMenuPresenter$a extends n
{

	protected void e()
	{
		a.i = null;
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ActionMenuPresenter a>
	//    2    4:aconst_null     
	//    3    5:putfield        #60  <Field ActionMenuPresenter$a ActionMenuPresenter.i>
		a.l = 0;
	//    4    8:aload_0         
	//    5    9:getfield        #12  <Field ActionMenuPresenter a>
	//    6   12:iconst_0        
	//    7   13:putfield        #63  <Field int ActionMenuPresenter.l>
		super.e();
	//    8   16:aload_0         
	//    9   17:invokespecial   #65  <Method void n.e()>
	//   10   20:return          
	}

	final ActionMenuPresenter a;

	public ActionMenuPresenter$a(ActionMenuPresenter actionmenupresenter, Context context, u u1, View view)
	{
		a = actionmenupresenter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ActionMenuPresenter a>
		super(context, ((android.support.v7.view.menu.h) (u1)), view, false, android.support.v7.a.a.a.actionOverflowMenuStyle);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:iconst_0        
	//    8   11:getstatic       #18  <Field int android.support.v7.a.a$a.actionOverflowMenuStyle>
	//    9   14:invokespecial   #21  <Method void n(Context, android.support.v7.view.menu.h, View, boolean, int)>
		if(!((j)u1.getItem()).j())
	//*  10   17:aload_3         
	//*  11   18:invokevirtual   #27  <Method android.view.MenuItem u.getItem()>
	//*  12   21:checkcast       #29  <Class j>
	//*  13   24:invokevirtual   #33  <Method boolean j.j()>
	//*  14   27:ifne            58
		{
			if(actionmenupresenter.g == null)
	//*  15   30:aload_1         
	//*  16   31:getfield        #37  <Field ActionMenuPresenter$d ActionMenuPresenter.g>
	//*  17   34:ifnonnull       48
				context = ((Context) ((View)ActionMenuPresenter.c(actionmenupresenter)));
	//   18   37:aload_1         
	//   19   38:invokestatic    #41  <Method android.support.v7.view.menu.p ActionMenuPresenter.c(ActionMenuPresenter)>
	//   20   41:checkcast       #43  <Class View>
	//   21   44:astore_2        
			else
	//*  22   45:goto            53
				context = ((Context) (actionmenupresenter.g));
	//   23   48:aload_1         
	//   24   49:getfield        #37  <Field ActionMenuPresenter$d ActionMenuPresenter.g>
	//   25   52:astore_2        
			a(((View) (context)));
	//   26   53:aload_0         
	//   27   54:aload_2         
	//   28   55:invokevirtual   #46  <Method void a(View)>
		}
		a(((android.support.v7.view.menu.o.a) (actionmenupresenter.k)));
	//   29   58:aload_0         
	//   30   59:aload_1         
	//   31   60:getfield        #50  <Field ActionMenuPresenter$f ActionMenuPresenter.k>
	//   32   63:invokevirtual   #53  <Method void a(android.support.v7.view.menu.o$a)>
	//   33   66:return          
	}
}
