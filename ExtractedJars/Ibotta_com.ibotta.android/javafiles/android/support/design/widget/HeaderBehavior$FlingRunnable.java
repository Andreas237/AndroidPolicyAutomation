// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.OverScroller;

// Referenced classes of package android.support.design.widget:
//			HeaderBehavior, CoordinatorLayout

private class HeaderBehavior$FlingRunnable
	implements Runnable
{

	public void run()
	{
		if(layout != null && scroller != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field View layout>
	//*   2    4:ifnull          79
	//*   3    7:aload_0         
	//*   4    8:getfield        #20  <Field HeaderBehavior this$0>
	//*   5   11:getfield        #35  <Field OverScroller HeaderBehavior.scroller>
	//*   6   14:ifnull          79
		{
			if(scroller.computeScrollOffset())
	//*   7   17:aload_0         
	//*   8   18:getfield        #20  <Field HeaderBehavior this$0>
	//*   9   21:getfield        #35  <Field OverScroller HeaderBehavior.scroller>
	//*  10   24:invokevirtual   #41  <Method boolean OverScroller.computeScrollOffset()>
	//*  11   27:ifeq            64
			{
				HeaderBehavior headerbehavior = HeaderBehavior.this;
	//   12   30:aload_0         
	//   13   31:getfield        #20  <Field HeaderBehavior this$0>
	//   14   34:astore_1        
				headerbehavior.setHeaderTopBottomOffset(parent, layout, headerbehavior.scroller.getCurrY());
	//   15   35:aload_1         
	//   16   36:aload_0         
	//   17   37:getfield        #25  <Field CoordinatorLayout parent>
	//   18   40:aload_0         
	//   19   41:getfield        #27  <Field View layout>
	//   20   44:aload_1         
	//   21   45:getfield        #35  <Field OverScroller HeaderBehavior.scroller>
	//   22   48:invokevirtual   #45  <Method int OverScroller.getCurrY()>
	//   23   51:invokevirtual   #49  <Method int HeaderBehavior.setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
	//   24   54:pop             
				ViewCompat.postOnAnimation(layout, ((Runnable) (this)));
	//   25   55:aload_0         
	//   26   56:getfield        #27  <Field View layout>
	//   27   59:aload_0         
	//   28   60:invokestatic    #55  <Method void ViewCompat.postOnAnimation(View, Runnable)>
				return;
	//   29   63:return          
			}
			onFlingFinished(parent, layout);
	//   30   64:aload_0         
	//   31   65:getfield        #20  <Field HeaderBehavior this$0>
	//   32   68:aload_0         
	//   33   69:getfield        #25  <Field CoordinatorLayout parent>
	//   34   72:aload_0         
	//   35   73:getfield        #27  <Field View layout>
	//   36   76:invokevirtual   #59  <Method void HeaderBehavior.onFlingFinished(CoordinatorLayout, View)>
		}
	//   37   79:return          
	}

	private final View layout;
	private final CoordinatorLayout parent;
	final HeaderBehavior this$0;

	HeaderBehavior$FlingRunnable(CoordinatorLayout coordinatorlayout, View view)
	{
		this$0 = HeaderBehavior.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field HeaderBehavior this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
		parent = coordinatorlayout;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field CoordinatorLayout parent>
		layout = view;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field View layout>
	//   11   19:return          
	}
}
