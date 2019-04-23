// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;

// Referenced classes of package android.support.design.widget:
//			AppBarLayout, CoordinatorLayout

class AppBarLayout$BaseBehavior$1
	implements android.animation.Listener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		setHeaderTopBottomOffset(val$coordinatorLayout, ((android.view.View) (val$child)), ((Integer)valueanimator.getAnimatedValue()).intValue());
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AppBarLayout$BaseBehavior this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field CoordinatorLayout val$coordinatorLayout>
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field AppBarLayout val$child>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #40  <Method Object ValueAnimator.getAnimatedValue()>
	//    8   16:checkcast       #42  <Class Integer>
	//    9   19:invokevirtual   #46  <Method int Integer.intValue()>
	//   10   22:invokevirtual   #50  <Method int AppBarLayout$BaseBehavior.setHeaderTopBottomOffset(CoordinatorLayout, android.view.View, int)>
	//   11   25:pop             
	//   12   26:return          
	}

	final AppBarLayout.BaseBehavior this$0;
	final AppBarLayout val$child;
	final CoordinatorLayout val$coordinatorLayout;

	AppBarLayout$BaseBehavior$1()
	{
		this$0 = final_basebehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field AppBarLayout$BaseBehavior this$0>
		val$coordinatorLayout = coordinatorlayout;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field CoordinatorLayout val$coordinatorLayout>
		val$child = AppBarLayout.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field AppBarLayout val$child>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #31  <Method void Object()>
	//   11   19:return          
	}
}
