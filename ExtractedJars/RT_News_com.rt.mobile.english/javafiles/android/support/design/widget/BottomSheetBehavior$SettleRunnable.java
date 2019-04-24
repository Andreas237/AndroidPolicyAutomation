// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			BottomSheetBehavior

private class BottomSheetBehavior$SettleRunnable
	implements Runnable
{

	public void run()
	{
		if(mViewDragHelper != null && mViewDragHelper.continueSettling(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field BottomSheetBehavior this$0>
	//*   2    4:getfield        #32  <Field ViewDragHelper BottomSheetBehavior.mViewDragHelper>
	//*   3    7:ifnull          33
	//*   4   10:aload_0         
	//*   5   11:getfield        #19  <Field BottomSheetBehavior this$0>
	//*   6   14:getfield        #32  <Field ViewDragHelper BottomSheetBehavior.mViewDragHelper>
	//*   7   17:iconst_1        
	//*   8   18:invokevirtual   #38  <Method boolean ViewDragHelper.continueSettling(boolean)>
	//*   9   21:ifeq            33
		{
			ViewCompat.postOnAnimation(mView, ((Runnable) (this)));
	//   10   24:aload_0         
	//   11   25:getfield        #24  <Field View mView>
	//   12   28:aload_0         
	//   13   29:invokestatic    #44  <Method void ViewCompat.postOnAnimation(View, Runnable)>
			return;
	//   14   32:return          
		} else
		{
			setStateInternal(mTargetState);
	//   15   33:aload_0         
	//   16   34:getfield        #19  <Field BottomSheetBehavior this$0>
	//   17   37:aload_0         
	//   18   38:getfield        #26  <Field int mTargetState>
	//   19   41:invokevirtual   #48  <Method void BottomSheetBehavior.setStateInternal(int)>
			return;
	//   20   44:return          
		}
	}

	private final int mTargetState;
	private final View mView;
	final BottomSheetBehavior this$0;

	BottomSheetBehavior$SettleRunnable(View view, int i)
	{
		this$0 = BottomSheetBehavior.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BottomSheetBehavior this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		mView = view;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field View mView>
		mTargetState = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #26  <Field int mTargetState>
	//   11   19:return          
	}
}
