// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			LinearSmoothScroller, PagerSnapHelper, RecyclerView

class PagerSnapHelper$1 extends LinearSmoothScroller
{

	protected float calculateSpeedPerPixel(DisplayMetrics displaymetrics)
	{
		return 100F / (float)displaymetrics.densityDpi;
	//    0    0:ldc1            #22  <Float 100F>
	//    1    2:aload_1         
	//    2    3:getfield        #28  <Field int DisplayMetrics.densityDpi>
	//    3    6:i2f             
	//    4    7:fdiv            
	//    5    8:freturn         
	}

	protected int calculateTimeForScrolling(int i)
	{
		return Math.min(100, super.calculateTimeForScrolling(i));
	//    0    0:bipush          100
	//    1    2:aload_0         
	//    2    3:iload_1         
	//    3    4:invokespecial   #32  <Method int LinearSmoothScroller.calculateTimeForScrolling(int)>
	//    4    7:invokestatic    #38  <Method int Math.min(int, int)>
	//    5   10:ireturn         
	}

	protected void onTargetFound(View view,  , hScroller.Action action)
	{
		view = ((View) (calculateDistanceToFinalSnap(mRecyclerView.getLayoutManager(), view)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field PagerSnapHelper this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field PagerSnapHelper this$0>
	//    4    8:getfield        #44  <Field RecyclerView PagerSnapHelper.mRecyclerView>
	//    5   11:invokevirtual   #50  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #54  <Method int[] PagerSnapHelper.calculateDistanceToFinalSnap(RecyclerView$LayoutManager, View)>
	//    8   18:astore_1        
		int i = view[0];
	//    9   19:aload_1         
	//   10   20:iconst_0        
	//   11   21:iaload          
	//   12   22:istore          4
		int j = view[1];
	//   13   24:aload_1         
	//   14   25:iconst_1        
	//   15   26:iaload          
	//   16   27:istore          5
		int k = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(j)));
	//   17   29:aload_0         
	//   18   30:iload           4
	//   19   32:invokestatic    #57  <Method int Math.abs(int)>
	//   20   35:iload           5
	//   21   37:invokestatic    #57  <Method int Math.abs(int)>
	//   22   40:invokestatic    #60  <Method int Math.max(int, int)>
	//   23   43:invokevirtual   #63  <Method int calculateTimeForDeceleration(int)>
	//   24   46:istore          6
		if(k > 0)
	//*  25   48:iload           6
	//*  26   50:ifle            67
			action.update(i, j, k, ((android.view.animation.Interpolator) (mDecelerateInterpolator)));
	//   27   53:aload_3         
	//   28   54:iload           4
	//   29   56:iload           5
	//   30   58:iload           6
	//   31   60:aload_0         
	//   32   61:getfield        #67  <Field android.view.animation.DecelerateInterpolator mDecelerateInterpolator>
	//   33   64:invokevirtual   #73  <Method void RecyclerView$SmoothScroller$Action.update(int, int, int, android.view.animation.Interpolator)>
	//   34   67:return          
	}

	final PagerSnapHelper this$0;

	PagerSnapHelper$1(Context context)
	{
		this$0 = PagerSnapHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field PagerSnapHelper this$0>
		super(context);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void LinearSmoothScroller(Context)>
	//    6   10:return          
	}
}
