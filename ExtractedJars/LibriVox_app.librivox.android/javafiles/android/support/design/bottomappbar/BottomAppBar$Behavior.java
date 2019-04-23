// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.a.a;
import android.support.design.behavior.HideBottomViewOnScrollBehavior;
import android.support.design.widget.*;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.design.bottomappbar:
//			BottomAppBar

public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior
{

	private boolean a(FloatingActionButton floatingactionbutton, BottomAppBar bottomappbar)
	{
		((am)floatingactionbutton.getLayoutParams()).d = 17;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
	//    2    4:checkcast       #28  <Class am>
	//    3    7:bipush          17
	//    4    9:putfield        #32  <Field int am.d>
		android.support.design.bottomappbar.BottomAppBar.a(bottomappbar, floatingactionbutton);
	//    5   12:aload_2         
	//    6   13:aload_1         
	//    7   14:invokestatic    #37  <Method void android.support.design.bottomappbar.BottomAppBar.a(BottomAppBar, FloatingActionButton)>
		return true;
	//    8   17:iconst_1        
	//    9   18:ireturn         
	}

	protected void a(BottomAppBar bottomappbar)
	{
		super.a(((View) (bottomappbar)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void HideBottomViewOnScrollBehavior.a(View)>
		FloatingActionButton floatingactionbutton = BottomAppBar.c(bottomappbar);
	//    3    5:aload_1         
	//    4    6:invokestatic    #45  <Method FloatingActionButton BottomAppBar.c(BottomAppBar)>
	//    5    9:astore_2        
		if(floatingactionbutton != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          42
		{
			floatingactionbutton.clearAnimation();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #48  <Method void FloatingActionButton.clearAnimation()>
			floatingactionbutton.animate().translationY(BottomAppBar.f(bottomappbar)).setInterpolator(a.d).setDuration(225L);
	//   10   18:aload_2         
	//   11   19:invokevirtual   #52  <Method ViewPropertyAnimator FloatingActionButton.animate()>
	//   12   22:aload_1         
	//   13   23:invokestatic    #56  <Method float BottomAppBar.f(BottomAppBar)>
	//   14   26:invokevirtual   #62  <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
	//   15   29:getstatic       #67  <Field android.animation.TimeInterpolator a.d>
	//   16   32:invokevirtual   #71  <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   17   35:ldc2w           #72  <Long 225L>
	//   18   38:invokevirtual   #77  <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   19   41:pop             
		}
	//   20   42:return          
	}

	protected volatile void a(View view)
	{
		a((BottomAppBar)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #34  <Class BottomAppBar>
	//    3    5:invokevirtual   #79  <Method void a(BottomAppBar)>
	//    4    8:return          
	}

	public boolean a(CoordinatorLayout coordinatorlayout, BottomAppBar bottomappbar, int i)
	{
		FloatingActionButton floatingactionbutton = BottomAppBar.c(bottomappbar);
	//    0    0:aload_2         
	//    1    1:invokestatic    #45  <Method FloatingActionButton BottomAppBar.c(BottomAppBar)>
	//    2    4:astore          4
		if(floatingactionbutton != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          39
		{
			a(floatingactionbutton, bottomappbar);
	//    5   11:aload_0         
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokespecial   #82  <Method boolean a(FloatingActionButton, BottomAppBar)>
	//    9   18:pop             
			floatingactionbutton.b(a);
	//   10   19:aload           4
	//   11   21:aload_0         
	//   12   22:getfield        #15  <Field Rect a>
	//   13   25:invokevirtual   #86  <Method void FloatingActionButton.b(Rect)>
			bottomappbar.setFabDiameter(a.height());
	//   14   28:aload_2         
	//   15   29:aload_0         
	//   16   30:getfield        #15  <Field Rect a>
	//   17   33:invokevirtual   #90  <Method int Rect.height()>
	//   18   36:invokevirtual   #94  <Method void BottomAppBar.setFabDiameter(int)>
		}
		if(!BottomAppBar.d(bottomappbar))
	//*  19   39:aload_2         
	//*  20   40:invokestatic    #97  <Method boolean BottomAppBar.d(BottomAppBar)>
	//*  21   43:ifne            50
			BottomAppBar.e(bottomappbar);
	//   22   46:aload_2         
	//   23   47:invokestatic    #100 <Method void BottomAppBar.e(BottomAppBar)>
		coordinatorlayout.a(((View) (bottomappbar)), i);
	//   24   50:aload_1         
	//   25   51:aload_2         
	//   26   52:iload_3         
	//   27   53:invokevirtual   #105 <Method void CoordinatorLayout.a(View, int)>
		return super.a(coordinatorlayout, ((View) (bottomappbar)), i);
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:aload_2         
	//   31   59:iload_3         
	//   32   60:invokespecial   #108 <Method boolean HideBottomViewOnScrollBehavior.a(CoordinatorLayout, View, int)>
	//   33   63:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, BottomAppBar bottomappbar, View view, View view1, int i, int j)
	{
		return bottomappbar.getHideOnScroll() && super.a(coordinatorlayout, ((View) (bottomappbar)), view, view1, i, j);
	//    0    0:aload_2         
	//    1    1:invokevirtual   #113 <Method boolean BottomAppBar.getHideOnScroll()>
	//    2    4:ifeq            25
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:iload           5
	//    9   15:iload           6
	//   10   17:invokespecial   #116 <Method boolean HideBottomViewOnScrollBehavior.a(CoordinatorLayout, View, View, View, int, int)>
	//   11   20:ifeq            25
	//   12   23:iconst_1        
	//   13   24:ireturn         
	//   14   25:iconst_0        
	//   15   26:ireturn         
	}

	public volatile boolean a(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		return a(coordinatorlayout, (BottomAppBar)view, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #34  <Class BottomAppBar>
	//    4    6:iload_3         
	//    5    7:invokevirtual   #118 <Method boolean a(CoordinatorLayout, BottomAppBar, int)>
	//    6   10:ireturn         
	}

	public volatile boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i, int j)
	{
		return a(coordinatorlayout, (BottomAppBar)view, view1, view2, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #34  <Class BottomAppBar>
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:iload           5
	//    7   11:iload           6
	//    8   13:invokevirtual   #120 <Method boolean a(CoordinatorLayout, BottomAppBar, View, View, int, int)>
	//    9   16:ireturn         
	}

	protected void b(BottomAppBar bottomappbar)
	{
		super.b(((View) (bottomappbar)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #122 <Method void HideBottomViewOnScrollBehavior.b(View)>
		bottomappbar = ((BottomAppBar) (BottomAppBar.c(bottomappbar)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #45  <Method FloatingActionButton BottomAppBar.c(BottomAppBar)>
	//    5    9:astore_1        
		if(bottomappbar != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          69
		{
			((FloatingActionButton) (bottomappbar)).a(a);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #15  <Field Rect a>
	//   11   19:invokevirtual   #125 <Method boolean FloatingActionButton.a(Rect)>
	//   12   22:pop             
			float f = ((FloatingActionButton) (bottomappbar)).getMeasuredHeight() - a.height();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #128 <Method int FloatingActionButton.getMeasuredHeight()>
	//   15   27:aload_0         
	//   16   28:getfield        #15  <Field Rect a>
	//   17   31:invokevirtual   #90  <Method int Rect.height()>
	//   18   34:isub            
	//   19   35:i2f             
	//   20   36:fstore_2        
			((FloatingActionButton) (bottomappbar)).clearAnimation();
	//   21   37:aload_1         
	//   22   38:invokevirtual   #48  <Method void FloatingActionButton.clearAnimation()>
			((FloatingActionButton) (bottomappbar)).animate().translationY((float)(-((FloatingActionButton) (bottomappbar)).getPaddingBottom()) + f).setInterpolator(a.c).setDuration(175L);
	//   23   41:aload_1         
	//   24   42:invokevirtual   #52  <Method ViewPropertyAnimator FloatingActionButton.animate()>
	//   25   45:aload_1         
	//   26   46:invokevirtual   #131 <Method int FloatingActionButton.getPaddingBottom()>
	//   27   49:ineg            
	//   28   50:i2f             
	//   29   51:fload_2         
	//   30   52:fadd            
	//   31   53:invokevirtual   #62  <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
	//   32   56:getstatic       #133 <Field android.animation.TimeInterpolator a.c>
	//   33   59:invokevirtual   #71  <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   34   62:ldc2w           #134 <Long 175L>
	//   35   65:invokevirtual   #77  <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   36   68:pop             
		}
	//   37   69:return          
	}

	protected volatile void b(View view)
	{
		b((BottomAppBar)view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #34  <Class BottomAppBar>
	//    3    5:invokevirtual   #137 <Method void b(BottomAppBar)>
	//    4    8:return          
	}

	private final Rect a;

	public BottomAppBar$Behavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void HideBottomViewOnScrollBehavior()>
		a = new Rect();
	//    2    4:aload_0         
	//    3    5:new             #12  <Class Rect>
	//    4    8:dup             
	//    5    9:invokespecial   #13  <Method void Rect()>
	//    6   12:putfield        #15  <Field Rect a>
	//    7   15:return          
	}

	public BottomAppBar$Behavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #19  <Method void HideBottomViewOnScrollBehavior(Context, AttributeSet)>
		a = new Rect();
	//    4    6:aload_0         
	//    5    7:new             #12  <Class Rect>
	//    6   10:dup             
	//    7   11:invokespecial   #13  <Method void Rect()>
	//    8   14:putfield        #15  <Field Rect a>
	//    9   17:return          
	}
}
