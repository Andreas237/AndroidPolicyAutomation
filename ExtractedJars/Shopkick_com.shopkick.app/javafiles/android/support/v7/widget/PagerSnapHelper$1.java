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
		 = (() (PagerSnapHelper.this));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field PagerSnapHelper this$0>
	//    2    4:astore_2        
		view = ((View) (((PagerSnapHelper) ()).calculateDistanceToFinalSnap(((PagerSnapHelper) ()).mRecyclerView.getLayoutManager(), view)));
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:getfield        #44  <Field RecyclerView PagerSnapHelper.mRecyclerView>
	//    6   10:invokevirtual   #50  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #54  <Method int[] PagerSnapHelper.calculateDistanceToFinalSnap(RecyclerView$LayoutManager, View)>
	//    9   17:astore_1        
		int i = view[0];
	//   10   18:aload_1         
	//   11   19:iconst_0        
	//   12   20:iaload          
	//   13   21:istore          4
		int j = view[1];
	//   14   23:aload_1         
	//   15   24:iconst_1        
	//   16   25:iaload          
	//   17   26:istore          5
		int k = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(j)));
	//   18   28:aload_0         
	//   19   29:iload           4
	//   20   31:invokestatic    #57  <Method int Math.abs(int)>
	//   21   34:iload           5
	//   22   36:invokestatic    #57  <Method int Math.abs(int)>
	//   23   39:invokestatic    #60  <Method int Math.max(int, int)>
	//   24   42:invokevirtual   #63  <Method int calculateTimeForDeceleration(int)>
	//   25   45:istore          6
		if(k > 0)
	//*  26   47:iload           6
	//*  27   49:ifle            66
			action.update(i, j, k, ((android.view.animation.Interpolator) (mDecelerateInterpolator)));
	//   28   52:aload_3         
	//   29   53:iload           4
	//   30   55:iload           5
	//   31   57:iload           6
	//   32   59:aload_0         
	//   33   60:getfield        #67  <Field android.view.animation.DecelerateInterpolator mDecelerateInterpolator>
	//   34   63:invokevirtual   #73  <Method void RecyclerView$SmoothScroller$Action.update(int, int, int, android.view.animation.Interpolator)>
	//   35   66:return          
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
