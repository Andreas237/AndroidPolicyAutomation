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
		state = ((State) (SnapHelper.this));
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field SnapHelper this$0>
	//    7   15:astore_2        
		view = ((View) (((SnapHelper) (state)).calculateDistanceToFinalSnap(((SnapHelper) (state)).mRecyclerView.getLayoutManager(), view)));
	//    8   16:aload_2         
	//    9   17:aload_2         
	//   10   18:getfield        #34  <Field RecyclerView SnapHelper.mRecyclerView>
	//   11   21:invokevirtual   #40  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #44  <Method int[] SnapHelper.calculateDistanceToFinalSnap(RecyclerView$LayoutManager, View)>
	//   14   28:astore_1        
		int i = view[0];
	//   15   29:aload_1         
	//   16   30:iconst_0        
	//   17   31:iaload          
	//   18   32:istore          4
		int j = view[1];
	//   19   34:aload_1         
	//   20   35:iconst_1        
	//   21   36:iaload          
	//   22   37:istore          5
		int k = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(j)));
	//   23   39:aload_0         
	//   24   40:iload           4
	//   25   42:invokestatic    #50  <Method int Math.abs(int)>
	//   26   45:iload           5
	//   27   47:invokestatic    #50  <Method int Math.abs(int)>
	//   28   50:invokestatic    #54  <Method int Math.max(int, int)>
	//   29   53:invokevirtual   #57  <Method int calculateTimeForDeceleration(int)>
	//   30   56:istore          6
		if(k > 0)
	//*  31   58:iload           6
	//*  32   60:ifle            77
			action.update(i, j, k, ((android.view.animation.Interpolator) (mDecelerateInterpolator)));
	//   33   63:aload_3         
	//   34   64:iload           4
	//   35   66:iload           5
	//   36   68:iload           6
	//   37   70:aload_0         
	//   38   71:getfield        #61  <Field android.view.animation.DecelerateInterpolator mDecelerateInterpolator>
	//   39   74:invokevirtual   #67  <Method void RecyclerView$SmoothScroller$Action.update(int, int, int, android.view.animation.Interpolator)>
	//   40   77:return          
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
