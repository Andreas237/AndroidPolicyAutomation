// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.widget:
//			SwipeRefreshLayout, MaterialProgressDrawable, CircleImageView

class SwipeRefreshLayout$1
	implements android.view.animation.stener
{

	public void onAnimationEnd(Animation animation)
	{
		if(mRefreshing)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field SwipeRefreshLayout this$0>
	//*   2    4:getfield        #27  <Field boolean SwipeRefreshLayout.mRefreshing>
	//*   3    7:ifeq            83
		{
			mProgress.setAlpha(255);
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field SwipeRefreshLayout this$0>
	//    6   14:getfield        #31  <Field MaterialProgressDrawable SwipeRefreshLayout.mProgress>
	//    7   17:sipush          255
	//    8   20:invokevirtual   #37  <Method void MaterialProgressDrawable.setAlpha(int)>
			mProgress.start();
	//    9   23:aload_0         
	//   10   24:getfield        #14  <Field SwipeRefreshLayout this$0>
	//   11   27:getfield        #31  <Field MaterialProgressDrawable SwipeRefreshLayout.mProgress>
	//   12   30:invokevirtual   #40  <Method void MaterialProgressDrawable.start()>
			if(mNotify && mListener != null)
	//*  13   33:aload_0         
	//*  14   34:getfield        #14  <Field SwipeRefreshLayout this$0>
	//*  15   37:getfield        #43  <Field boolean SwipeRefreshLayout.mNotify>
	//*  16   40:ifeq            65
	//*  17   43:aload_0         
	//*  18   44:getfield        #14  <Field SwipeRefreshLayout this$0>
	//*  19   47:getfield        #47  <Field SwipeRefreshLayout$OnRefreshListener SwipeRefreshLayout.mListener>
	//*  20   50:ifnull          65
				mListener.onRefresh();
	//   21   53:aload_0         
	//   22   54:getfield        #14  <Field SwipeRefreshLayout this$0>
	//   23   57:getfield        #47  <Field SwipeRefreshLayout$OnRefreshListener SwipeRefreshLayout.mListener>
	//   24   60:invokeinterface #52  <Method void SwipeRefreshLayout$OnRefreshListener.onRefresh()>
			mCurrentTargetOffsetTop = mCircleView.getTop();
	//   25   65:aload_0         
	//   26   66:getfield        #14  <Field SwipeRefreshLayout this$0>
	//   27   69:aload_0         
	//   28   70:getfield        #14  <Field SwipeRefreshLayout this$0>
	//   29   73:getfield        #56  <Field CircleImageView SwipeRefreshLayout.mCircleView>
	//   30   76:invokevirtual   #62  <Method int CircleImageView.getTop()>
	//   31   79:putfield        #66  <Field int SwipeRefreshLayout.mCurrentTargetOffsetTop>
			return;
	//   32   82:return          
		} else
		{
			reset();
	//   33   83:aload_0         
	//   34   84:getfield        #14  <Field SwipeRefreshLayout this$0>
	//   35   87:invokevirtual   #69  <Method void SwipeRefreshLayout.reset()>
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

	final SwipeRefreshLayout this$0;

	SwipeRefreshLayout$1()
	{
		this$0 = SwipeRefreshLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field SwipeRefreshLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
