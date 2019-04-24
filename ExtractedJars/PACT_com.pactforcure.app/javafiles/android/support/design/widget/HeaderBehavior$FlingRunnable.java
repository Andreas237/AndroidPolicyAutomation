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
label0:
		{
			if(mLayout != null && mScroller != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field View mLayout>
	//*   2    4:ifnull          64
	//*   3    7:aload_0         
	//*   4    8:getfield        #20  <Field HeaderBehavior this$0>
	//*   5   11:getfield        #35  <Field OverScroller HeaderBehavior.mScroller>
	//*   6   14:ifnull          64
			{
				if(!mScroller.computeScrollOffset())
					break label0;
	//    7   17:aload_0         
	//    8   18:getfield        #20  <Field HeaderBehavior this$0>
	//    9   21:getfield        #35  <Field OverScroller HeaderBehavior.mScroller>
	//   10   24:invokevirtual   #41  <Method boolean OverScroller.computeScrollOffset()>
	//   11   27:ifeq            65
				setHeaderTopBottomOffset(mParent, mLayout, mScroller.getCurrY());
	//   12   30:aload_0         
	//   13   31:getfield        #20  <Field HeaderBehavior this$0>
	//   14   34:aload_0         
	//   15   35:getfield        #25  <Field CoordinatorLayout mParent>
	//   16   38:aload_0         
	//   17   39:getfield        #27  <Field View mLayout>
	//   18   42:aload_0         
	//   19   43:getfield        #20  <Field HeaderBehavior this$0>
	//   20   46:getfield        #35  <Field OverScroller HeaderBehavior.mScroller>
	//   21   49:invokevirtual   #45  <Method int OverScroller.getCurrY()>
	//   22   52:invokevirtual   #49  <Method int HeaderBehavior.setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
	//   23   55:pop             
				ViewCompat.postOnAnimation(mLayout, ((Runnable) (this)));
	//   24   56:aload_0         
	//   25   57:getfield        #27  <Field View mLayout>
	//   26   60:aload_0         
	//   27   61:invokestatic    #55  <Method void ViewCompat.postOnAnimation(View, Runnable)>
			}
			return;
	//   28   64:return          
		}
		onFlingFinished(mParent, mLayout);
	//   29   65:aload_0         
	//   30   66:getfield        #20  <Field HeaderBehavior this$0>
	//   31   69:aload_0         
	//   32   70:getfield        #25  <Field CoordinatorLayout mParent>
	//   33   73:aload_0         
	//   34   74:getfield        #27  <Field View mLayout>
	//   35   77:invokevirtual   #59  <Method void HeaderBehavior.onFlingFinished(CoordinatorLayout, View)>
	//   36   80:return          
	}

	private final View mLayout;
	private final CoordinatorLayout mParent;
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
		mParent = coordinatorlayout;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field CoordinatorLayout mParent>
		mLayout = view;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field View mLayout>
	//   11   19:return          
	}
}
