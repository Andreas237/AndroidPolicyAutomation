// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.transformation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.design.a.b;
import android.support.design.a.i;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.design.transformation:
//			ExpandableTransformationBehavior, h

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior
{

	public FabTransformationScrimBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ExpandableTransformationBehavior()>
		a = new i(75L, 150L);
	//    2    4:aload_0         
	//    3    5:new             #13  <Class i>
	//    4    8:dup             
	//    5    9:ldc2w           #14  <Long 75L>
	//    6   12:ldc2w           #16  <Long 150L>
	//    7   15:invokespecial   #20  <Method void i(long, long)>
	//    8   18:putfield        #22  <Field i a>
		b = new i(0L, 150L);
	//    9   21:aload_0         
	//   10   22:new             #13  <Class i>
	//   11   25:dup             
	//   12   26:lconst_0        
	//   13   27:ldc2w           #16  <Long 150L>
	//   14   30:invokespecial   #20  <Method void i(long, long)>
	//   15   33:putfield        #24  <Field i b>
	//   16   36:return          
	}

	public FabTransformationScrimBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void ExpandableTransformationBehavior(Context, AttributeSet)>
		a = new i(75L, 150L);
	//    4    6:aload_0         
	//    5    7:new             #13  <Class i>
	//    6   10:dup             
	//    7   11:ldc2w           #14  <Long 75L>
	//    8   14:ldc2w           #16  <Long 150L>
	//    9   17:invokespecial   #20  <Method void i(long, long)>
	//   10   20:putfield        #22  <Field i a>
		b = new i(0L, 150L);
	//   11   23:aload_0         
	//   12   24:new             #13  <Class i>
	//   13   27:dup             
	//   14   28:lconst_0        
	//   15   29:ldc2w           #16  <Long 150L>
	//   16   32:invokespecial   #20  <Method void i(long, long)>
	//   17   35:putfield        #24  <Field i b>
	//   18   38:return          
	}

	private void a(View view, boolean flag, boolean flag1, List list, List list1)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            13
			list1 = ((List) (a));
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field i a>
	//    4    8:astore          5
		else
	//*   5   10:goto            19
			list1 = ((List) (b));
	//    6   13:aload_0         
	//    7   14:getfield        #24  <Field i b>
	//    8   17:astore          5
		if(flag)
	//*   9   19:iload_2         
	//*  10   20:ifeq            50
		{
			if(!flag1)
	//*  11   23:iload_3         
	//*  12   24:ifne            32
				view.setAlpha(0.0F);
	//   13   27:aload_1         
	//   14   28:fconst_0        
	//   15   29:invokevirtual   #35  <Method void View.setAlpha(float)>
			view = ((View) (ObjectAnimator.ofFloat(((Object) (view)), View.ALPHA, new float[] {
				1.0F
			})));
	//   16   32:aload_1         
	//   17   33:getstatic       #39  <Field android.util.Property View.ALPHA>
	//   18   36:iconst_1        
	//   19   37:newarray        float[]
	//   20   39:dup             
	//   21   40:iconst_0        
	//   22   41:fconst_1        
	//   23   42:fastore         
	//   24   43:invokestatic    #45  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//   25   46:astore_1        
		} else
	//*  26   47:goto            65
		{
			view = ((View) (ObjectAnimator.ofFloat(((Object) (view)), View.ALPHA, new float[] {
				0.0F
			})));
	//   27   50:aload_1         
	//   28   51:getstatic       #39  <Field android.util.Property View.ALPHA>
	//   29   54:iconst_1        
	//   30   55:newarray        float[]
	//   31   57:dup             
	//   32   58:iconst_0        
	//   33   59:fconst_0        
	//   34   60:fastore         
	//   35   61:invokestatic    #45  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//   36   64:astore_1        
		}
		((i) (list1)).a(((android.animation.Animator) (view)));
	//   37   65:aload           5
	//   38   67:aload_1         
	//   39   68:invokevirtual   #48  <Method void i.a(android.animation.Animator)>
		list.add(((Object) (view)));
	//   40   71:aload           4
	//   41   73:aload_1         
	//   42   74:invokeinterface #54  <Method boolean List.add(Object)>
	//   43   79:pop             
	//   44   80:return          
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		return super.a(coordinatorlayout, view, motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #57  <Method boolean ExpandableTransformationBehavior.a(CoordinatorLayout, View, MotionEvent)>
	//    5    7:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
		return view1 instanceof FloatingActionButton;
	//    0    0:aload_3         
	//    1    1:instanceof      #60  <Class FloatingActionButton>
	//    2    4:ireturn         
	}

	protected AnimatorSet b(View view, View view1, boolean flag, boolean flag1)
	{
		view = ((View) (new ArrayList()));
	//    0    0:new             #63  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void ArrayList()>
	//    3    7:astore_1        
		a(view1, flag, flag1, ((List) (view)), ((List) (new ArrayList())));
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:aload_1         
	//    9   14:new             #63  <Class ArrayList>
	//   10   17:dup             
	//   11   18:invokespecial   #64  <Method void ArrayList()>
	//   12   21:invokespecial   #66  <Method void a(View, boolean, boolean, List, List)>
		AnimatorSet animatorset = new AnimatorSet();
	//   13   24:new             #68  <Class AnimatorSet>
	//   14   27:dup             
	//   15   28:invokespecial   #69  <Method void AnimatorSet()>
	//   16   31:astore          5
		android.support.design.a.b.a(animatorset, ((List) (view)));
	//   17   33:aload           5
	//   18   35:aload_1         
	//   19   36:invokestatic    #74  <Method void b.a(AnimatorSet, List)>
		animatorset.addListener(((android.animation.Animator.AnimatorListener) (new h(this, flag, view1))));
	//   20   39:aload           5
	//   21   41:new             #76  <Class h>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:iload_3         
	//   25   47:aload_2         
	//   26   48:invokespecial   #79  <Method void h(FabTransformationScrimBehavior, boolean, View)>
	//   27   51:invokevirtual   #83  <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>
		return animatorset;
	//   28   54:aload           5
	//   29   56:areturn         
	}

	private final i a;
	private final i b;
}
