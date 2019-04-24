// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;

// Referenced classes of package android.support.design.widget:
//			AppBarLayout, CoordinatorLayout

class AppBarLayout$Behavior$1
	implements android.animation.dateListener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		c.a_(a, ((android.view.View) (b)), ((Integer)valueanimator.getAnimatedValue()).intValue());
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AppBarLayout$Behavior c>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field CoordinatorLayout a>
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field AppBarLayout b>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #39  <Method Object ValueAnimator.getAnimatedValue()>
	//    8   16:checkcast       #41  <Class Integer>
	//    9   19:invokevirtual   #45  <Method int Integer.intValue()>
	//   10   22:invokevirtual   #49  <Method int AppBarLayout$Behavior.a_(CoordinatorLayout, android.view.View, int)>
	//   11   25:pop             
	//   12   26:return          
	}

	final CoordinatorLayout a;
	final AppBarLayout b;
	final AppBarLayout.Behavior c;

	AppBarLayout$Behavior$1(AppBarLayout.Behavior behavior, CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
	{
		c = behavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field AppBarLayout$Behavior c>
		a = coordinatorlayout;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field CoordinatorLayout a>
		b = appbarlayout;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field AppBarLayout b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #30  <Method void Object()>
	//   11   19:return          
	}
}
