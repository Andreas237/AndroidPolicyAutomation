// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.OverScroller;

// Referenced classes of package o:
//			s

class s$a
	implements Runnable
{

	public void run()
	{
		if(a != null && c.mScroller != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field View a>
	//*   2    4:ifnull          80
	//*   3    7:aload_0         
	//*   4    8:getfield        #19  <Field s c>
	//*   5   11:getfield        #34  <Field OverScroller s.mScroller>
	//*   6   14:ifnull          80
		{
			if(c.mScroller.computeScrollOffset())
	//*   7   17:aload_0         
	//*   8   18:getfield        #19  <Field s c>
	//*   9   21:getfield        #34  <Field OverScroller s.mScroller>
	//*  10   24:invokevirtual   #40  <Method boolean OverScroller.computeScrollOffset()>
	//*  11   27:ifeq            65
			{
				c.setHeaderTopBottomOffset(e, a, c.mScroller.getCurrY());
	//   12   30:aload_0         
	//   13   31:getfield        #19  <Field s c>
	//   14   34:aload_0         
	//   15   35:getfield        #24  <Field CoordinatorLayout e>
	//   16   38:aload_0         
	//   17   39:getfield        #26  <Field View a>
	//   18   42:aload_0         
	//   19   43:getfield        #19  <Field s c>
	//   20   46:getfield        #34  <Field OverScroller s.mScroller>
	//   21   49:invokevirtual   #44  <Method int OverScroller.getCurrY()>
	//   22   52:invokevirtual   #48  <Method int s.setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
	//   23   55:pop             
				ViewCompat.postOnAnimation(a, ((Runnable) (this)));
	//   24   56:aload_0         
	//   25   57:getfield        #26  <Field View a>
	//   26   60:aload_0         
	//   27   61:invokestatic    #54  <Method void ViewCompat.postOnAnimation(View, Runnable)>
				return;
	//   28   64:return          
			}
			c.onFlingFinished(e, a);
	//   29   65:aload_0         
	//   30   66:getfield        #19  <Field s c>
	//   31   69:aload_0         
	//   32   70:getfield        #24  <Field CoordinatorLayout e>
	//   33   73:aload_0         
	//   34   74:getfield        #26  <Field View a>
	//   35   77:invokevirtual   #58  <Method void s.onFlingFinished(CoordinatorLayout, View)>
		}
	//   36   80:return          
	}

	private final View a;
	final s c;
	private final CoordinatorLayout e;

	s$a(s s1, CoordinatorLayout coordinatorlayout, View view)
	{
		c = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field s c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		e = coordinatorlayout;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field CoordinatorLayout e>
		a = view;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field View a>
	//   11   19:return          
	}
}
