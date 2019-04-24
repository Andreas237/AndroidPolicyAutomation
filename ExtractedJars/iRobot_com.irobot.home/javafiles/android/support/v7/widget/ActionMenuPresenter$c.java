// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.menu.h;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuPresenter

private class ActionMenuPresenter$c
	implements Runnable
{

	public void run()
	{
		if(ActionMenuPresenter.d(a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field ActionMenuPresenter a>
	//*   2    4:invokestatic    #28  <Method h ActionMenuPresenter.d(ActionMenuPresenter)>
	//*   3    7:ifnull          20
			ActionMenuPresenter.e(a).f();
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field ActionMenuPresenter a>
	//    6   14:invokestatic    #31  <Method h ActionMenuPresenter.e(ActionMenuPresenter)>
	//    7   17:invokevirtual   #36  <Method void h.f()>
		View view = (View)ActionMenuPresenter.f(a);
	//    8   20:aload_0         
	//    9   21:getfield        #17  <Field ActionMenuPresenter a>
	//   10   24:invokestatic    #39  <Method android.support.v7.view.menu.p ActionMenuPresenter.f(ActionMenuPresenter)>
	//   11   27:checkcast       #41  <Class View>
	//   12   30:astore_1        
		if(view != null && view.getWindowToken() != null && b.c())
	//*  13   31:aload_1         
	//*  14   32:ifnull          63
	//*  15   35:aload_1         
	//*  16   36:invokevirtual   #45  <Method android.os.IBinder View.getWindowToken()>
	//*  17   39:ifnull          63
	//*  18   42:aload_0         
	//*  19   43:getfield        #22  <Field ActionMenuPresenter$e b>
	//*  20   46:invokevirtual   #50  <Method boolean ActionMenuPresenter$e.c()>
	//*  21   49:ifeq            63
			a.h = b;
	//   22   52:aload_0         
	//   23   53:getfield        #17  <Field ActionMenuPresenter a>
	//   24   56:aload_0         
	//   25   57:getfield        #22  <Field ActionMenuPresenter$e b>
	//   26   60:putfield        #53  <Field ActionMenuPresenter$e android.support.v7.widget.ActionMenuPresenter.h>
		a.j = null;
	//   27   63:aload_0         
	//   28   64:getfield        #17  <Field ActionMenuPresenter a>
	//   29   67:aconst_null     
	//   30   68:putfield        #57  <Field ActionMenuPresenter$c ActionMenuPresenter.j>
	//   31   71:return          
	}

	final ActionMenuPresenter a;
	private ActionMenuPresenter$e b;

	public ActionMenuPresenter$c(ActionMenuPresenter actionmenupresenter, ActionMenuPresenter$e actionmenupresenter$e)
	{
		a = actionmenupresenter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ActionMenuPresenter a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		b = actionmenupresenter$e;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field ActionMenuPresenter$e b>
	//    8   14:return          
	}
}
