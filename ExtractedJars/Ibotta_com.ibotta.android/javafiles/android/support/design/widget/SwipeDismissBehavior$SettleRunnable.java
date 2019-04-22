// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			SwipeDismissBehavior

private class SwipeDismissBehavior$SettleRunnable
	implements Runnable
{

	public void run()
	{
		if(viewDragHelper != null && viewDragHelper.continueSettling(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field SwipeDismissBehavior this$0>
	//*   2    4:getfield        #32  <Field ViewDragHelper SwipeDismissBehavior.viewDragHelper>
	//*   3    7:ifnull          33
	//*   4   10:aload_0         
	//*   5   11:getfield        #19  <Field SwipeDismissBehavior this$0>
	//*   6   14:getfield        #32  <Field ViewDragHelper SwipeDismissBehavior.viewDragHelper>
	//*   7   17:iconst_1        
	//*   8   18:invokevirtual   #38  <Method boolean ViewDragHelper.continueSettling(boolean)>
	//*   9   21:ifeq            33
		{
			ViewCompat.postOnAnimation(view, ((Runnable) (this)));
	//   10   24:aload_0         
	//   11   25:getfield        #24  <Field View view>
	//   12   28:aload_0         
	//   13   29:invokestatic    #44  <Method void ViewCompat.postOnAnimation(View, Runnable)>
			return;
	//   14   32:return          
		}
		if(dismiss && listener != null)
	//*  15   33:aload_0         
	//*  16   34:getfield        #26  <Field boolean dismiss>
	//*  17   37:ifeq            66
	//*  18   40:aload_0         
	//*  19   41:getfield        #19  <Field SwipeDismissBehavior this$0>
	//*  20   44:getfield        #48  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.listener>
	//*  21   47:ifnull          66
			listener.onDismiss(view);
	//   22   50:aload_0         
	//   23   51:getfield        #19  <Field SwipeDismissBehavior this$0>
	//   24   54:getfield        #48  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.listener>
	//   25   57:aload_0         
	//   26   58:getfield        #24  <Field View view>
	//   27   61:invokeinterface #54  <Method void SwipeDismissBehavior$OnDismissListener.onDismiss(View)>
	//   28   66:return          
	}

	private final boolean dismiss;
	final SwipeDismissBehavior this$0;
	private final View view;

	SwipeDismissBehavior$SettleRunnable(View view1, boolean flag)
	{
		this$0 = SwipeDismissBehavior.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field SwipeDismissBehavior this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		view = view1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field View view>
		dismiss = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #26  <Field boolean dismiss>
	//   11   19:return          
	}
}
