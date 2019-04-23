// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.animation.AnimationUtils;
import android.support.design.behavior.HideBottomViewOnScrollBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.design.bottomappbar:
//			BottomAppBar

public static class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior
{

	private boolean updateFabPositionAndVisibility(FloatingActionButton floatingactionbutton, BottomAppBar bottomappbar)
	{
		((android.support.design.widget.utParams)floatingactionbutton.getLayoutParams()).anchorGravity = 17;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #31  <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
	//    2    4:checkcast       #33  <Class android.support.design.widget.CoordinatorLayout$LayoutParams>
	//    3    7:bipush          17
	//    4    9:putfield        #37  <Field int android.support.design.widget.CoordinatorLayout$LayoutParams.anchorGravity>
		BottomAppBar.access$1000(bottomappbar, floatingactionbutton);
	//    5   12:aload_2         
	//    6   13:aload_1         
	//    7   14:invokestatic    #41  <Method void BottomAppBar.access$1000(BottomAppBar, FloatingActionButton)>
		return true;
	//    8   17:iconst_1        
	//    9   18:ireturn         
	}

	public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, BottomAppBar bottomappbar, int i)
	{
		FloatingActionButton floatingactionbutton = BottomAppBar.access$1100(bottomappbar);
	//    0    0:aload_2         
	//    1    1:invokestatic    #47  <Method FloatingActionButton BottomAppBar.access$1100(BottomAppBar)>
	//    2    4:astore          4
		if(floatingactionbutton != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          39
		{
			updateFabPositionAndVisibility(floatingactionbutton, bottomappbar);
	//    5   11:aload_0         
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokespecial   #49  <Method boolean updateFabPositionAndVisibility(FloatingActionButton, BottomAppBar)>
	//    9   18:pop             
			floatingactionbutton.getMeasuredContentRect(fabContentRect);
	//   10   19:aload           4
	//   11   21:aload_0         
	//   12   22:getfield        #19  <Field Rect fabContentRect>
	//   13   25:invokevirtual   #53  <Method void FloatingActionButton.getMeasuredContentRect(Rect)>
			bottomappbar.setFabDiameter(fabContentRect.height());
	//   14   28:aload_2         
	//   15   29:aload_0         
	//   16   30:getfield        #19  <Field Rect fabContentRect>
	//   17   33:invokevirtual   #57  <Method int Rect.height()>
	//   18   36:invokevirtual   #61  <Method void BottomAppBar.setFabDiameter(int)>
		}
		if(!BottomAppBar.access$1200(bottomappbar))
	//*  19   39:aload_2         
	//*  20   40:invokestatic    #65  <Method boolean BottomAppBar.access$1200(BottomAppBar)>
	//*  21   43:ifne            50
			BottomAppBar.access$1300(bottomappbar);
	//   22   46:aload_2         
	//   23   47:invokestatic    #69  <Method void BottomAppBar.access$1300(BottomAppBar)>
		coordinatorlayout.onLayoutChild(((View) (bottomappbar)), i);
	//   24   50:aload_1         
	//   25   51:aload_2         
	//   26   52:iload_3         
	//   27   53:invokevirtual   #74  <Method void CoordinatorLayout.onLayoutChild(View, int)>
		return super.onLayoutChild(coordinatorlayout, ((View) (bottomappbar)), i);
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:aload_2         
	//   31   59:iload_3         
	//   32   60:invokespecial   #77  <Method boolean HideBottomViewOnScrollBehavior.onLayoutChild(CoordinatorLayout, View, int)>
	//   33   63:ireturn         
	}

	public volatile boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		return onLayoutChild(coordinatorlayout, (BottomAppBar)view, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class BottomAppBar>
	//    4    6:iload_3         
	//    5    7:invokevirtual   #79  <Method boolean onLayoutChild(CoordinatorLayout, BottomAppBar, int)>
	//    6   10:ireturn         
	}

	public boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, BottomAppBar bottomappbar, View view, View view1, int i, int j)
	{
		return bottomappbar.getHideOnScroll() && super.onStartNestedScroll(coordinatorlayout, ((View) (bottomappbar)), view, view1, i, j);
	//    0    0:aload_2         
	//    1    1:invokevirtual   #86  <Method boolean BottomAppBar.getHideOnScroll()>
	//    2    4:ifeq            25
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:iload           5
	//    9   15:iload           6
	//   10   17:invokespecial   #89  <Method boolean HideBottomViewOnScrollBehavior.onStartNestedScroll(CoordinatorLayout, View, View, View, int, int)>
	//   11   20:ifeq            25
	//   12   23:iconst_1        
	//   13   24:ireturn         
	//   14   25:iconst_0        
	//   15   26:ireturn         
	}

	public volatile boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i, int j)
	{
		return onStartNestedScroll(coordinatorlayout, (BottomAppBar)view, view1, view2, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class BottomAppBar>
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:iload           5
	//    7   11:iload           6
	//    8   13:invokevirtual   #92  <Method boolean onStartNestedScroll(CoordinatorLayout, BottomAppBar, View, View, int, int)>
	//    9   16:ireturn         
	}

	protected void slideDown(BottomAppBar bottomappbar)
	{
		super.slideDown(((View) (bottomappbar)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #96  <Method void HideBottomViewOnScrollBehavior.slideDown(View)>
		bottomappbar = ((BottomAppBar) (BottomAppBar.access$1100(bottomappbar)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #47  <Method FloatingActionButton BottomAppBar.access$1100(BottomAppBar)>
	//    5    9:astore_1        
		if(bottomappbar != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          69
		{
			((FloatingActionButton) (bottomappbar)).getContentRect(fabContentRect);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #19  <Field Rect fabContentRect>
	//   11   19:invokevirtual   #100 <Method boolean FloatingActionButton.getContentRect(Rect)>
	//   12   22:pop             
			float f = ((FloatingActionButton) (bottomappbar)).getMeasuredHeight() - fabContentRect.height();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #103 <Method int FloatingActionButton.getMeasuredHeight()>
	//   15   27:aload_0         
	//   16   28:getfield        #19  <Field Rect fabContentRect>
	//   17   31:invokevirtual   #57  <Method int Rect.height()>
	//   18   34:isub            
	//   19   35:i2f             
	//   20   36:fstore_2        
			((FloatingActionButton) (bottomappbar)).clearAnimation();
	//   21   37:aload_1         
	//   22   38:invokevirtual   #106 <Method void FloatingActionButton.clearAnimation()>
			((FloatingActionButton) (bottomappbar)).animate().translationY((float)(-((FloatingActionButton) (bottomappbar)).getPaddingBottom()) + f).setInterpolator(AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR).setDuration(175L);
	//   23   41:aload_1         
	//   24   42:invokevirtual   #110 <Method ViewPropertyAnimator FloatingActionButton.animate()>
	//   25   45:aload_1         
	//   26   46:invokevirtual   #113 <Method int FloatingActionButton.getPaddingBottom()>
	//   27   49:ineg            
	//   28   50:i2f             
	//   29   51:fload_2         
	//   30   52:fadd            
	//   31   53:invokevirtual   #119 <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
	//   32   56:getstatic       #125 <Field android.animation.TimeInterpolator AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR>
	//   33   59:invokevirtual   #129 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   34   62:ldc2w           #130 <Long 175L>
	//   35   65:invokevirtual   #135 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   36   68:pop             
		}
	//   37   69:return          
	}

	protected volatile void slideDown(View view)
	{
		slideDown((BottomAppBar)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class BottomAppBar>
	//    3    5:invokevirtual   #137 <Method void slideDown(BottomAppBar)>
	//    4    8:return          
	}

	protected void slideUp(BottomAppBar bottomappbar)
	{
		super.slideUp(((View) (bottomappbar)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #140 <Method void HideBottomViewOnScrollBehavior.slideUp(View)>
		FloatingActionButton floatingactionbutton = BottomAppBar.access$1100(bottomappbar);
	//    3    5:aload_1         
	//    4    6:invokestatic    #47  <Method FloatingActionButton BottomAppBar.access$1100(BottomAppBar)>
	//    5    9:astore_2        
		if(floatingactionbutton != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          42
		{
			floatingactionbutton.clearAnimation();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #106 <Method void FloatingActionButton.clearAnimation()>
			floatingactionbutton.animate().translationY(BottomAppBar.access$1400(bottomappbar)).setInterpolator(AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR).setDuration(225L);
	//   10   18:aload_2         
	//   11   19:invokevirtual   #110 <Method ViewPropertyAnimator FloatingActionButton.animate()>
	//   12   22:aload_1         
	//   13   23:invokestatic    #144 <Method float BottomAppBar.access$1400(BottomAppBar)>
	//   14   26:invokevirtual   #119 <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
	//   15   29:getstatic       #147 <Field android.animation.TimeInterpolator AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR>
	//   16   32:invokevirtual   #129 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   17   35:ldc2w           #148 <Long 225L>
	//   18   38:invokevirtual   #135 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   19   41:pop             
		}
	//   20   42:return          
	}

	protected volatile void slideUp(View view)
	{
		slideUp((BottomAppBar)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class BottomAppBar>
	//    3    5:invokevirtual   #151 <Method void slideUp(BottomAppBar)>
	//    4    8:return          
	}

	private final Rect fabContentRect;

	public BottomAppBar$Behavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void HideBottomViewOnScrollBehavior()>
		fabContentRect = new Rect();
	//    2    4:aload_0         
	//    3    5:new             #16  <Class Rect>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void Rect()>
	//    6   12:putfield        #19  <Field Rect fabContentRect>
	//    7   15:return          
	}

	public BottomAppBar$Behavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #23  <Method void HideBottomViewOnScrollBehavior(Context, AttributeSet)>
		fabContentRect = new Rect();
	//    4    6:aload_0         
	//    5    7:new             #16  <Class Rect>
	//    6   10:dup             
	//    7   11:invokespecial   #17  <Method void Rect()>
	//    8   14:putfield        #19  <Field Rect fabContentRect>
	//    9   17:return          
	}
}
