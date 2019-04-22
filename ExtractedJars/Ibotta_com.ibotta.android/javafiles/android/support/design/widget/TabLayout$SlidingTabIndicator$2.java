// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.design.widget:
//			TabLayout

class TabLayout$SlidingTabIndicator$2 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		animator = ((Animator) (TabLayout.SlidingTabIndicator.this));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field TabLayout$SlidingTabIndicator this$1>
	//    2    4:astore_1        
		animator.selectedPosition = val$position;
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #22  <Field int val$position>
	//    6   10:putfield        #31  <Field int TabLayout$SlidingTabIndicator.selectedPosition>
		animator.selectionOffset = 0.0F;
	//    7   13:aload_1         
	//    8   14:fconst_0        
	//    9   15:putfield        #35  <Field float TabLayout$SlidingTabIndicator.selectionOffset>
	//   10   18:return          
	}

	final TabLayout.SlidingTabIndicator this$1;
	final int val$position;

	TabLayout$SlidingTabIndicator$2()
	{
		this$1 = final_slidingtabindicator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field TabLayout$SlidingTabIndicator this$1>
		val$position = I.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field int val$position>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void AnimatorListenerAdapter()>
	//    8   14:return          
	}
}
