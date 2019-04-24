// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.design.widget:
//			TabLayout

class TabLayout$SlidingTabStrip$2 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		mSelectedPosition = val$position;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field TabLayout$SlidingTabStrip this$1>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field int val$position>
	//    4    8:putfield        #31  <Field int TabLayout$SlidingTabStrip.mSelectedPosition>
		mSelectionOffset = 0.0F;
	//    5   11:aload_0         
	//    6   12:getfield        #20  <Field TabLayout$SlidingTabStrip this$1>
	//    7   15:fconst_0        
	//    8   16:putfield        #35  <Field float TabLayout$SlidingTabStrip.mSelectionOffset>
	//    9   19:return          
	}

	final TabLayout.SlidingTabStrip this$1;
	final int val$position;

	TabLayout$SlidingTabStrip$2()
	{
		this$1 = final_slidingtabstrip;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field TabLayout$SlidingTabStrip this$1>
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
