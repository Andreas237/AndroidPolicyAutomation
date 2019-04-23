// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;
import android.support.design.animation.AnimationUtils;

// Referenced classes of package android.support.design.widget:
//			TabLayout

class TabLayout$SlidingTabIndicator$1
	implements android.animation.ener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		float f = valueanimator.getAnimatedFraction();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #45  <Method float ValueAnimator.getAnimatedFraction()>
	//    2    4:fstore_2        
		setIndicatorPosition(AnimationUtils.lerp(val$startLeft, val$finalTargetLeft, f), AnimationUtils.lerp(val$startRight, val$finalTargetRight, f));
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field TabLayout$SlidingTabIndicator this$1>
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field int val$startLeft>
	//    7   13:aload_0         
	//    8   14:getfield        #29  <Field int val$finalTargetLeft>
	//    9   17:fload_2         
	//   10   18:invokestatic    #51  <Method int AnimationUtils.lerp(int, int, float)>
	//   11   21:aload_0         
	//   12   22:getfield        #31  <Field int val$startRight>
	//   13   25:aload_0         
	//   14   26:getfield        #33  <Field int val$finalTargetRight>
	//   15   29:fload_2         
	//   16   30:invokestatic    #51  <Method int AnimationUtils.lerp(int, int, float)>
	//   17   33:invokevirtual   #54  <Method void TabLayout$SlidingTabIndicator.setIndicatorPosition(int, int)>
	//   18   36:return          
	}

	final TabLayout.SlidingTabIndicator this$1;
	final int val$finalTargetLeft;
	final int val$finalTargetRight;
	final int val$startLeft;
	final int val$startRight;

	TabLayout$SlidingTabIndicator$1()
	{
		this$1 = final_slidingtabindicator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field TabLayout$SlidingTabIndicator this$1>
		val$startLeft = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #27  <Field int val$startLeft>
		val$finalTargetLeft = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #29  <Field int val$finalTargetLeft>
		val$startRight = k;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #31  <Field int val$startRight>
		val$finalTargetRight = I.this;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #33  <Field int val$finalTargetRight>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #36  <Method void Object()>
	//   17   31:return          
	}
}
