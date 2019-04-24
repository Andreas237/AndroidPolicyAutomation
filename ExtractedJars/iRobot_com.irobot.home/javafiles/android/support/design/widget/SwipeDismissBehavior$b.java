// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.s;
import android.support.v4.widget.p;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			SwipeDismissBehavior

private class SwipeDismissBehavior$b
	implements Runnable
{

	public void run()
	{
		if(a.b != null && a.b.a(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field SwipeDismissBehavior a>
	//*   2    4:getfield        #30  <Field p SwipeDismissBehavior.b>
	//*   3    7:ifnull          33
	//*   4   10:aload_0         
	//*   5   11:getfield        #18  <Field SwipeDismissBehavior a>
	//*   6   14:getfield        #30  <Field p SwipeDismissBehavior.b>
	//*   7   17:iconst_1        
	//*   8   18:invokevirtual   #35  <Method boolean p.a(boolean)>
	//*   9   21:ifeq            33
		{
			s.a(b, ((Runnable) (this)));
	//   10   24:aload_0         
	//   11   25:getfield        #23  <Field View b>
	//   12   28:aload_0         
	//   13   29:invokestatic    #40  <Method void s.a(View, Runnable)>
			return;
	//   14   32:return          
		}
		if(c && a.c != null)
	//*  15   33:aload_0         
	//*  16   34:getfield        #25  <Field boolean c>
	//*  17   37:ifeq            66
	//*  18   40:aload_0         
	//*  19   41:getfield        #18  <Field SwipeDismissBehavior a>
	//*  20   44:getfield        #43  <Field SwipeDismissBehavior$a SwipeDismissBehavior.c>
	//*  21   47:ifnull          66
			a.c.a(b);
	//   22   50:aload_0         
	//   23   51:getfield        #18  <Field SwipeDismissBehavior a>
	//   24   54:getfield        #43  <Field SwipeDismissBehavior$a SwipeDismissBehavior.c>
	//   25   57:aload_0         
	//   26   58:getfield        #23  <Field View b>
	//   27   61:invokeinterface #48  <Method void SwipeDismissBehavior$a.a(View)>
	//   28   66:return          
	}

	final SwipeDismissBehavior a;
	private final View b;
	private final boolean c;

	SwipeDismissBehavior$b(SwipeDismissBehavior swipedismissbehavior, View view, boolean flag)
	{
		a = swipedismissbehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field SwipeDismissBehavior a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		b = view;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field View b>
		c = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #25  <Field boolean c>
	//   11   19:return          
	}
}
