// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.s;
import android.view.View;
import android.widget.OverScroller;

// Referenced classes of package android.support.design.widget:
//			HeaderBehavior, CoordinatorLayout

private class HeaderBehavior$a
	implements Runnable
{

	public void run()
	{
		if(c != null && a.a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field View c>
	//*   2    4:ifnull          80
	//*   3    7:aload_0         
	//*   4    8:getfield        #19  <Field HeaderBehavior a>
	//*   5   11:getfield        #33  <Field OverScroller HeaderBehavior.a>
	//*   6   14:ifnull          80
		{
			if(a.a.computeScrollOffset())
	//*   7   17:aload_0         
	//*   8   18:getfield        #19  <Field HeaderBehavior a>
	//*   9   21:getfield        #33  <Field OverScroller HeaderBehavior.a>
	//*  10   24:invokevirtual   #39  <Method boolean OverScroller.computeScrollOffset()>
	//*  11   27:ifeq            65
			{
				a.a_(b, c, a.a.getCurrY());
	//   12   30:aload_0         
	//   13   31:getfield        #19  <Field HeaderBehavior a>
	//   14   34:aload_0         
	//   15   35:getfield        #24  <Field CoordinatorLayout b>
	//   16   38:aload_0         
	//   17   39:getfield        #26  <Field View c>
	//   18   42:aload_0         
	//   19   43:getfield        #19  <Field HeaderBehavior a>
	//   20   46:getfield        #33  <Field OverScroller HeaderBehavior.a>
	//   21   49:invokevirtual   #43  <Method int OverScroller.getCurrY()>
	//   22   52:invokevirtual   #47  <Method int HeaderBehavior.a_(CoordinatorLayout, View, int)>
	//   23   55:pop             
				s.a(c, ((Runnable) (this)));
	//   24   56:aload_0         
	//   25   57:getfield        #26  <Field View c>
	//   26   60:aload_0         
	//   27   61:invokestatic    #52  <Method void s.a(View, Runnable)>
				return;
	//   28   64:return          
			}
			a.a(b, c);
	//   29   65:aload_0         
	//   30   66:getfield        #19  <Field HeaderBehavior a>
	//   31   69:aload_0         
	//   32   70:getfield        #24  <Field CoordinatorLayout b>
	//   33   73:aload_0         
	//   34   74:getfield        #26  <Field View c>
	//   35   77:invokevirtual   #55  <Method void HeaderBehavior.a(CoordinatorLayout, View)>
		}
	//   36   80:return          
	}

	final HeaderBehavior a;
	private final CoordinatorLayout b;
	private final View c;

	HeaderBehavior$a(HeaderBehavior headerbehavior, CoordinatorLayout coordinatorlayout, View view)
	{
		a = headerbehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field HeaderBehavior a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		b = coordinatorlayout;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field CoordinatorLayout b>
		c = view;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field View c>
	//   11   19:return          
	}
}
