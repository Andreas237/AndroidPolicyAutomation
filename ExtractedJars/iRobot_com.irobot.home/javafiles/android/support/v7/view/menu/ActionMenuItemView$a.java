// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.support.v7.widget.ac;

// Referenced classes of package android.support.v7.view.menu:
//			ActionMenuItemView, s

private class ActionMenuItemView$a extends ac
{

	public s a()
	{
		if(a.c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field ActionMenuItemView a>
	//*   2    4:getfield        #21  <Field ActionMenuItemView$b ActionMenuItemView.c>
	//*   3    7:ifnull          21
			return a.c.a();
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field ActionMenuItemView a>
	//    6   14:getfield        #21  <Field ActionMenuItemView$b ActionMenuItemView.c>
	//    7   17:invokevirtual   #25  <Method s ActionMenuItemView$b.a()>
	//    8   20:areturn         
		else
			return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
	}

	protected boolean b()
	{
		h.b b1 = a.b;
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ActionMenuItemView a>
	//    2    4:getfield        #30  <Field h$b ActionMenuItemView.b>
	//    3    7:astore_3        
		boolean flag1 = false;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		boolean flag = flag1;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(b1 != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          64
		{
			flag = flag1;
	//   10   16:iload_2         
	//   11   17:istore_1        
			if(a.b.a(a.a))
	//*  12   18:aload_0         
	//*  13   19:getfield        #12  <Field ActionMenuItemView a>
	//*  14   22:getfield        #30  <Field h$b ActionMenuItemView.b>
	//*  15   25:aload_0         
	//*  16   26:getfield        #12  <Field ActionMenuItemView a>
	//*  17   29:getfield        #33  <Field j ActionMenuItemView.a>
	//*  18   32:invokeinterface #38  <Method boolean h$b.a(j)>
	//*  19   37:ifeq            64
			{
				s s1 = a();
	//   20   40:aload_0         
	//   21   41:invokevirtual   #39  <Method s a()>
	//   22   44:astore_3        
				flag = flag1;
	//   23   45:iload_2         
	//   24   46:istore_1        
				if(s1 != null)
	//*  25   47:aload_3         
	//*  26   48:ifnull          64
				{
					flag = flag1;
	//   27   51:iload_2         
	//   28   52:istore_1        
					if(s1.f())
	//*  29   53:aload_3         
	//*  30   54:invokeinterface #44  <Method boolean s.f()>
	//*  31   59:ifeq            64
						flag = true;
	//   32   62:iconst_1        
	//   33   63:istore_1        
				}
			}
		}
		return flag;
	//   34   64:iload_1         
	//   35   65:ireturn         
	}

	final ActionMenuItemView a;

	public ActionMenuItemView$a(ActionMenuItemView actionmenuitemview)
	{
		a = actionmenuitemview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ActionMenuItemView a>
		super(((android.view.View) (actionmenuitemview)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #15  <Method void ac(android.view.View)>
	//    6   10:return          
	}
}
