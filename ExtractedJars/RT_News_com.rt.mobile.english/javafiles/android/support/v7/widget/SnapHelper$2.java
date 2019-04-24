// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			LinearSmoothScroller, SnapHelper, RecyclerView

class SnapHelper$2 extends LinearSmoothScroller
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

	protected void onTargetFound(View view, State state, SmoothScroller.Action action)
	{
		if(mRecyclerView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field SnapHelper this$0>
	//*   2    4:getfield        #34  <Field RecyclerView SnapHelper.mRecyclerView>
	//*   3    7:ifnonnull       11
			return;
	//    4   10:return          
		view = ((View) (calculateDistanceToFinalSnap(mRecyclerView.getLayoutManager(), view)));
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field SnapHelper this$0>
	//    7   15:aload_0         
	//    8   16:getfield        #15  <Field SnapHelper this$0>
	//    9   19:getfield        #34  <Field RecyclerView SnapHelper.mRecyclerView>
	//   10   22:invokevirtual   #40  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #44  <Method int[] SnapHelper.calculateDistanceToFinalSnap(RecyclerView$LayoutManager, View)>
	//   13   29:astore_1        
		int i = view[0];
	//   14   30:aload_1         
	//   15   31:iconst_0        
	//   16   32:iaload          
	//   17   33:istore          4
		int j = view[1];
	//   18   35:aload_1         
	//   19   36:iconst_1        
	//   20   37:iaload          
	//   21   38:istore          5
		int k = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(j)));
	//   22   40:aload_0         
	//   23   41:iload           4
	//   24   43:invokestatic    #50  <Method int Math.abs(int)>
	//   25   46:iload           5
	//   26   48:invokestatic    #50  <Method int Math.abs(int)>
	//   27   51:invokestatic    #54  <Method int Math.max(int, int)>
	//   28   54:invokevirtual   #57  <Method int calculateTimeForDeceleration(int)>
	//   29   57:istore          6
		if(k > 0)
	//*  30   59:iload           6
	//*  31   61:ifle            78
			action.update(i, j, k, ((android.view.animation.Interpolator) (mDecelerateInterpolator)));
	//   32   64:aload_3         
	//   33   65:iload           4
	//   34   67:iload           5
	//   35   69:iload           6
	//   36   71:aload_0         
	//   37   72:getfield        #61  <Field android.view.animation.DecelerateInterpolator mDecelerateInterpolator>
	//   38   75:invokevirtual   #67  <Method void RecyclerView$SmoothScroller$Action.update(int, int, int, android.view.animation.Interpolator)>
	//   39   78:return          
	}

	final SnapHelper this$0;

	SnapHelper$2(Context context)
	{
		this$0 = SnapHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field SnapHelper this$0>
		super(context);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void LinearSmoothScroller(Context)>
	//    6   10:return          
	}
}
