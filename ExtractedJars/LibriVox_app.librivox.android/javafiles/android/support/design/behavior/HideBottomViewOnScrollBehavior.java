// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.design.a.a;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.aj;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.design.behavior:
//			a

public class HideBottomViewOnScrollBehavior extends aj
{

	public HideBottomViewOnScrollBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void aj()>
		a = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #15  <Field int a>
		b = 2;
	//    5    9:aload_0         
	//    6   10:iconst_2        
	//    7   11:putfield        #17  <Field int b>
	//    8   14:return          
	}

	public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void aj(Context, AttributeSet)>
		a = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #15  <Field int a>
		b = 2;
	//    7   11:aload_0         
	//    8   12:iconst_2        
	//    9   13:putfield        #17  <Field int b>
	//   10   16:return          
	}

	static ViewPropertyAnimator a(HideBottomViewOnScrollBehavior hidebottomviewonscrollbehavior, ViewPropertyAnimator viewpropertyanimator)
	{
		hidebottomviewonscrollbehavior.c = viewpropertyanimator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field ViewPropertyAnimator c>
		return viewpropertyanimator;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void a(View view, int i, long l, TimeInterpolator timeinterpolator)
	{
		c = view.animate().translationY(i).setInterpolator(timeinterpolator).setDuration(l).setListener(((android.animation.Animator.AnimatorListener) (new android.support.design.behavior.a(this))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #31  <Method ViewPropertyAnimator View.animate()>
	//    3    5:iload_2         
	//    4    6:i2f             
	//    5    7:invokevirtual   #37  <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
	//    6   10:aload           5
	//    7   12:invokevirtual   #41  <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(TimeInterpolator)>
	//    8   15:lload_3         
	//    9   16:invokevirtual   #45  <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   10   19:new             #47  <Class android.support.design.behavior.a>
	//   11   22:dup             
	//   12   23:aload_0         
	//   13   24:invokespecial   #50  <Method void android.support.design.behavior.a(HideBottomViewOnScrollBehavior)>
	//   14   27:invokevirtual   #54  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   15   30:putfield        #24  <Field ViewPropertyAnimator c>
	//   16   33:return          
	}

	public void a(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int k, int l)
	{
		if(b != 1 && j > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field int b>
	//*   2    4:iconst_1        
	//*   3    5:icmpeq          19
	//*   4    8:iload           5
	//*   5   10:ifle            19
		{
			b(view);
	//    6   13:aload_0         
	//    7   14:aload_2         
	//    8   15:invokevirtual   #58  <Method void b(View)>
			return;
	//    9   18:return          
		}
		if(b != 2 && j < 0)
	//*  10   19:aload_0         
	//*  11   20:getfield        #17  <Field int b>
	//*  12   23:iconst_2        
	//*  13   24:icmpeq          37
	//*  14   27:iload           5
	//*  15   29:ifge            37
			a(view);
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:invokevirtual   #60  <Method void a(View)>
	//   19   37:return          
	}

	protected void a(View view)
	{
		ViewPropertyAnimator viewpropertyanimator = c;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ViewPropertyAnimator c>
	//    2    4:astore_2        
		if(viewpropertyanimator != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
		{
			viewpropertyanimator.cancel();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #63  <Method void ViewPropertyAnimator.cancel()>
			view.clearAnimation();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #66  <Method void View.clearAnimation()>
		}
		b = 2;
	//    9   17:aload_0         
	//   10   18:iconst_2        
	//   11   19:putfield        #17  <Field int b>
		a(view, 0, 225L, a.d);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:iconst_0        
	//   15   25:ldc2w           #67  <Long 225L>
	//   16   28:getstatic       #74  <Field TimeInterpolator a.d>
	//   17   31:invokespecial   #76  <Method void a(View, int, long, TimeInterpolator)>
	//   18   34:return          
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		a = view.getMeasuredHeight();
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #81  <Method int View.getMeasuredHeight()>
	//    3    5:putfield        #15  <Field int a>
		return super.a(coordinatorlayout, view, i);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:iload_3         
	//    8   12:invokespecial   #83  <Method boolean aj.a(CoordinatorLayout, View, int)>
	//    9   15:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i)
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

	protected void b(View view)
	{
		ViewPropertyAnimator viewpropertyanimator = c;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ViewPropertyAnimator c>
	//    2    4:astore_2        
		if(viewpropertyanimator != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
		{
			viewpropertyanimator.cancel();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #63  <Method void ViewPropertyAnimator.cancel()>
			view.clearAnimation();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #66  <Method void View.clearAnimation()>
		}
		b = 1;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #17  <Field int b>
		a(view, a, 175L, a.c);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:getfield        #15  <Field int a>
	//   16   28:ldc2w           #85  <Long 175L>
	//   17   31:getstatic       #88  <Field TimeInterpolator a.c>
	//   18   34:invokespecial   #76  <Method void a(View, int, long, TimeInterpolator)>
	//   19   37:return          
	}

	private int a;
	private int b;
	private ViewPropertyAnimator c;
}
