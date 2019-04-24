// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			SwipeDismissBehavior

class SwipeDismissBehavior$b
	implements Runnable
{

	public void run()
	{
		if(a.mViewDragHelper != null && a.mViewDragHelper.continueSettling(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field SwipeDismissBehavior a>
	//*   2    4:getfield        #31  <Field ViewDragHelper SwipeDismissBehavior.mViewDragHelper>
	//*   3    7:ifnull          33
	//*   4   10:aload_0         
	//*   5   11:getfield        #18  <Field SwipeDismissBehavior a>
	//*   6   14:getfield        #31  <Field ViewDragHelper SwipeDismissBehavior.mViewDragHelper>
	//*   7   17:iconst_1        
	//*   8   18:invokevirtual   #37  <Method boolean ViewDragHelper.continueSettling(boolean)>
	//*   9   21:ifeq            33
		{
			ViewCompat.postOnAnimation(d, ((Runnable) (this)));
	//   10   24:aload_0         
	//   11   25:getfield        #23  <Field View d>
	//   12   28:aload_0         
	//   13   29:invokestatic    #43  <Method void ViewCompat.postOnAnimation(View, Runnable)>
			return;
	//   14   32:return          
		}
		if(b && a.mListener != null)
	//*  15   33:aload_0         
	//*  16   34:getfield        #25  <Field boolean b>
	//*  17   37:ifeq            66
	//*  18   40:aload_0         
	//*  19   41:getfield        #18  <Field SwipeDismissBehavior a>
	//*  20   44:getfield        #47  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.mListener>
	//*  21   47:ifnull          66
			a.mListener.onDismiss(d);
	//   22   50:aload_0         
	//   23   51:getfield        #18  <Field SwipeDismissBehavior a>
	//   24   54:getfield        #47  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.mListener>
	//   25   57:aload_0         
	//   26   58:getfield        #23  <Field View d>
	//   27   61:invokeinterface #53  <Method void SwipeDismissBehavior$OnDismissListener.onDismiss(View)>
	//   28   66:return          
	}

	final SwipeDismissBehavior a;
	private final boolean b;
	private final View d;

	SwipeDismissBehavior$b(SwipeDismissBehavior swipedismissbehavior, View view, boolean flag)
	{
		a = swipedismissbehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field SwipeDismissBehavior a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		d = view;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field View d>
		b = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #25  <Field boolean b>
	//   11   19:return          
	}
}
