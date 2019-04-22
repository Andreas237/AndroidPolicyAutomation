// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.behavior;

import android.animation.*;
import android.content.Context;
import android.support.design.animation.AnimationUtils;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;

public class HideBottomViewOnScrollBehavior extends android.support.design.widget.CoordinatorLayout.Behavior
{

	public HideBottomViewOnScrollBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void android.support.design.widget.CoordinatorLayout$Behavior()>
		height = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #18  <Field int height>
		currentState = 2;
	//    5    9:aload_0         
	//    6   10:iconst_2        
	//    7   11:putfield        #20  <Field int currentState>
	//    8   14:return          
	}

	public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #24  <Method void android.support.design.widget.CoordinatorLayout$Behavior(Context, AttributeSet)>
		height = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #18  <Field int height>
		currentState = 2;
	//    7   11:aload_0         
	//    8   12:iconst_2        
	//    9   13:putfield        #20  <Field int currentState>
	//   10   16:return          
	}

	private void animateChildTo(View view, int i, long l, TimeInterpolator timeinterpolator)
	{
		currentAnimator = view.animate().translationY(i).setInterpolator(timeinterpolator).setDuration(l).setListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

			public void onAnimationEnd(Animator animator)
			{
				currentAnimator = null;
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field HideBottomViewOnScrollBehavior this$0>
			//    2    4:aconst_null     
			//    3    5:invokestatic    #25  <Method ViewPropertyAnimator HideBottomViewOnScrollBehavior.access$002(HideBottomViewOnScrollBehavior, ViewPropertyAnimator)>
			//    4    8:pop             
			//    5    9:return          
			}

			final HideBottomViewOnScrollBehavior this$0;

			
			{
				this$0 = HideBottomViewOnScrollBehavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field HideBottomViewOnScrollBehavior this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
		}
)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #36  <Method ViewPropertyAnimator View.animate()>
	//    3    5:iload_2         
	//    4    6:i2f             
	//    5    7:invokevirtual   #42  <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
	//    6   10:aload           5
	//    7   12:invokevirtual   #46  <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(TimeInterpolator)>
	//    8   15:lload_3         
	//    9   16:invokevirtual   #50  <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   10   19:new             #7   <Class HideBottomViewOnScrollBehavior$1>
	//   11   22:dup             
	//   12   23:aload_0         
	//   13   24:invokespecial   #53  <Method void HideBottomViewOnScrollBehavior$1(HideBottomViewOnScrollBehavior)>
	//   14   27:invokevirtual   #57  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   15   30:putfield        #28  <Field ViewPropertyAnimator currentAnimator>
	//   16   33:return          
	}

	public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		height = view.getMeasuredHeight();
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #65  <Method int View.getMeasuredHeight()>
	//    3    5:putfield        #18  <Field int height>
		return super.onLayoutChild(coordinatorlayout, view, i);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:iload_3         
	//    8   12:invokespecial   #67  <Method boolean android.support.design.widget.CoordinatorLayout$Behavior.onLayoutChild(CoordinatorLayout, View, int)>
	//    9   15:ireturn         
	}

	public void onNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int k, int l)
	{
		if(currentState != 1 && j > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field int currentState>
	//*   2    4:iconst_1        
	//*   3    5:icmpeq          19
	//*   4    8:iload           5
	//*   5   10:ifle            19
		{
			slideDown(view);
	//    6   13:aload_0         
	//    7   14:aload_2         
	//    8   15:invokevirtual   #74  <Method void slideDown(View)>
			return;
	//    9   18:return          
		}
		if(currentState != 2 && j < 0)
	//*  10   19:aload_0         
	//*  11   20:getfield        #20  <Field int currentState>
	//*  12   23:iconst_2        
	//*  13   24:icmpeq          37
	//*  14   27:iload           5
	//*  15   29:ifge            37
			slideUp(view);
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:invokevirtual   #77  <Method void slideUp(View)>
	//   19   37:return          
	}

	public boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i)
	{
		return i == 2;
	//    0    0:iload           5
	//    1    2:iconst_2        
	//    2    3:icmpne          8
	//    3    6:iconst_1        
	//    4    7:ireturn         
	//    5    8:iconst_0        
	//    6    9:ireturn         
	}

	protected void slideDown(View view)
	{
		ViewPropertyAnimator viewpropertyanimator = currentAnimator;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ViewPropertyAnimator currentAnimator>
	//    2    4:astore_2        
		if(viewpropertyanimator != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
		{
			viewpropertyanimator.cancel();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #84  <Method void ViewPropertyAnimator.cancel()>
			view.clearAnimation();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #87  <Method void View.clearAnimation()>
		}
		currentState = 1;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #20  <Field int currentState>
		animateChildTo(view, height, 175L, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:getfield        #18  <Field int height>
	//   16   28:ldc2w           #88  <Long 175L>
	//   17   31:getstatic       #95  <Field TimeInterpolator AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR>
	//   18   34:invokespecial   #97  <Method void animateChildTo(View, int, long, TimeInterpolator)>
	//   19   37:return          
	}

	protected void slideUp(View view)
	{
		ViewPropertyAnimator viewpropertyanimator = currentAnimator;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ViewPropertyAnimator currentAnimator>
	//    2    4:astore_2        
		if(viewpropertyanimator != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
		{
			viewpropertyanimator.cancel();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #84  <Method void ViewPropertyAnimator.cancel()>
			view.clearAnimation();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #87  <Method void View.clearAnimation()>
		}
		currentState = 2;
	//    9   17:aload_0         
	//   10   18:iconst_2        
	//   11   19:putfield        #20  <Field int currentState>
		animateChildTo(view, 0, 225L, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:iconst_0        
	//   15   25:ldc2w           #99  <Long 225L>
	//   16   28:getstatic       #103 <Field TimeInterpolator AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR>
	//   17   31:invokespecial   #97  <Method void animateChildTo(View, int, long, TimeInterpolator)>
	//   18   34:return          
	}

	private ViewPropertyAnimator currentAnimator;
	private int currentState;
	private int height;


/*
	static ViewPropertyAnimator access$002(HideBottomViewOnScrollBehavior hidebottomviewonscrollbehavior, ViewPropertyAnimator viewpropertyanimator)
	{
		hidebottomviewonscrollbehavior.currentAnimator = viewpropertyanimator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field ViewPropertyAnimator currentAnimator>
		return viewpropertyanimator;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/
}
