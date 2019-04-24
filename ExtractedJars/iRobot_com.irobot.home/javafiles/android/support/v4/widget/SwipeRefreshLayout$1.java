// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.widget:
//			SwipeRefreshLayout, c, b

class SwipeRefreshLayout$1
	implements android.view.animation.stener
{

	public void onAnimationEnd(Animation animation)
	{
		if(a.b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field SwipeRefreshLayout a>
	//*   2    4:getfield        #24  <Field boolean SwipeRefreshLayout.b>
	//*   3    7:ifeq            83
		{
			a.j.setAlpha(255);
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field SwipeRefreshLayout a>
	//    6   14:getfield        #28  <Field c SwipeRefreshLayout.j>
	//    7   17:sipush          255
	//    8   20:invokevirtual   #34  <Method void c.setAlpha(int)>
			a.j.start();
	//    9   23:aload_0         
	//   10   24:getfield        #14  <Field SwipeRefreshLayout a>
	//   11   27:getfield        #28  <Field c SwipeRefreshLayout.j>
	//   12   30:invokevirtual   #37  <Method void c.start()>
			if(a.k && a.a != null)
	//*  13   33:aload_0         
	//*  14   34:getfield        #14  <Field SwipeRefreshLayout a>
	//*  15   37:getfield        #40  <Field boolean SwipeRefreshLayout.k>
	//*  16   40:ifeq            65
	//*  17   43:aload_0         
	//*  18   44:getfield        #14  <Field SwipeRefreshLayout a>
	//*  19   47:getfield        #43  <Field SwipeRefreshLayout$b SwipeRefreshLayout.a>
	//*  20   50:ifnull          65
				a.a.a();
	//   21   53:aload_0         
	//   22   54:getfield        #14  <Field SwipeRefreshLayout a>
	//   23   57:getfield        #43  <Field SwipeRefreshLayout$b SwipeRefreshLayout.a>
	//   24   60:invokeinterface #47  <Method void SwipeRefreshLayout$b.a()>
			a.c = a.e.getTop();
	//   25   65:aload_0         
	//   26   66:getfield        #14  <Field SwipeRefreshLayout a>
	//   27   69:aload_0         
	//   28   70:getfield        #14  <Field SwipeRefreshLayout a>
	//   29   73:getfield        #51  <Field b SwipeRefreshLayout.e>
	//   30   76:invokevirtual   #57  <Method int b.getTop()>
	//   31   79:putfield        #61  <Field int SwipeRefreshLayout.c>
			return;
	//   32   82:return          
		} else
		{
			a.a();
	//   33   83:aload_0         
	//   34   84:getfield        #14  <Field SwipeRefreshLayout a>
	//   35   87:invokevirtual   #62  <Method void SwipeRefreshLayout.a()>
			return;
	//   36   90:return          
		}
	}

	public void onAnimationRepeat(Animation animation)
	{
	//    0    0:return          
	}

	public void onAnimationStart(Animation animation)
	{
	//    0    0:return          
	}

	final SwipeRefreshLayout a;

	SwipeRefreshLayout$1(SwipeRefreshLayout swiperefreshlayout)
	{
		a = swiperefreshlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field SwipeRefreshLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
