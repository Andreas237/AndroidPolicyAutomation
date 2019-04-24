// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//			SwipeRefreshLayout

class SwipeRefreshLayout$8 extends Animation
{

	public void applyTransformation(float f, Transformation transformation)
	{
		float f1 = mStartingScale;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SwipeRefreshLayout this$0>
	//    2    4:getfield        #25  <Field float SwipeRefreshLayout.mStartingScale>
	//    3    7:fstore_3        
		float f2 = -mStartingScale;
	//    4    8:aload_0         
	//    5    9:getfield        #15  <Field SwipeRefreshLayout this$0>
	//    6   12:getfield        #25  <Field float SwipeRefreshLayout.mStartingScale>
	//    7   15:fneg            
	//    8   16:fstore          4
		setAnimationProgress(f1 + f2 * f);
	//    9   18:aload_0         
	//   10   19:getfield        #15  <Field SwipeRefreshLayout this$0>
	//   11   22:fload_3         
	//   12   23:fload           4
	//   13   25:fload_1         
	//   14   26:fmul            
	//   15   27:fadd            
	//   16   28:invokevirtual   #29  <Method void SwipeRefreshLayout.setAnimationProgress(float)>
		moveToStart(f);
	//   17   31:aload_0         
	//   18   32:getfield        #15  <Field SwipeRefreshLayout this$0>
	//   19   35:fload_1         
	//   20   36:invokevirtual   #32  <Method void SwipeRefreshLayout.moveToStart(float)>
	//   21   39:return          
	}

	final SwipeRefreshLayout this$0;

	SwipeRefreshLayout$8()
	{
		this$0 = SwipeRefreshLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field SwipeRefreshLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Animation()>
	//    5    9:return          
	}
}
