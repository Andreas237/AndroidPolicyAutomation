// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.transformation;

import android.animation.*;
import android.content.Context;
import android.support.design.animation.AnimatorSetCompat;
import android.support.design.animation.MotionTiming;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.design.transformation:
//			ExpandableTransformationBehavior

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior
{

	public FabTransformationScrimBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void ExpandableTransformationBehavior()>
		expandTiming = new MotionTiming(75L, 150L);
	//    2    4:aload_0         
	//    3    5:new             #26  <Class MotionTiming>
	//    4    8:dup             
	//    5    9:ldc2w           #15  <Long 75L>
	//    6   12:ldc2w           #12  <Long 150L>
	//    7   15:invokespecial   #29  <Method void MotionTiming(long, long)>
	//    8   18:putfield        #31  <Field MotionTiming expandTiming>
		collapseTiming = new MotionTiming(0L, 150L);
	//    9   21:aload_0         
	//   10   22:new             #26  <Class MotionTiming>
	//   11   25:dup             
	//   12   26:lconst_0        
	//   13   27:ldc2w           #12  <Long 150L>
	//   14   30:invokespecial   #29  <Method void MotionTiming(long, long)>
	//   15   33:putfield        #33  <Field MotionTiming collapseTiming>
	//   16   36:return          
	}

	public FabTransformationScrimBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #37  <Method void ExpandableTransformationBehavior(Context, AttributeSet)>
		expandTiming = new MotionTiming(75L, 150L);
	//    4    6:aload_0         
	//    5    7:new             #26  <Class MotionTiming>
	//    6   10:dup             
	//    7   11:ldc2w           #15  <Long 75L>
	//    8   14:ldc2w           #12  <Long 150L>
	//    9   17:invokespecial   #29  <Method void MotionTiming(long, long)>
	//   10   20:putfield        #31  <Field MotionTiming expandTiming>
		collapseTiming = new MotionTiming(0L, 150L);
	//   11   23:aload_0         
	//   12   24:new             #26  <Class MotionTiming>
	//   13   27:dup             
	//   14   28:lconst_0        
	//   15   29:ldc2w           #12  <Long 150L>
	//   16   32:invokespecial   #29  <Method void MotionTiming(long, long)>
	//   17   35:putfield        #33  <Field MotionTiming collapseTiming>
	//   18   38:return          
	}

	private void createScrimAnimation(View view, boolean flag, boolean flag1, List list, List list1)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            13
			list1 = ((List) (expandTiming));
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field MotionTiming expandTiming>
	//    4    8:astore          5
		else
	//*   5   10:goto            19
			list1 = ((List) (collapseTiming));
	//    6   13:aload_0         
	//    7   14:getfield        #33  <Field MotionTiming collapseTiming>
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
	//   15   29:invokevirtual   #45  <Method void View.setAlpha(float)>
			view = ((View) (ObjectAnimator.ofFloat(((Object) (view)), View.ALPHA, new float[] {
				1.0F
			})));
	//   16   32:aload_1         
	//   17   33:getstatic       #49  <Field android.util.Property View.ALPHA>
	//   18   36:iconst_1        
	//   19   37:newarray        float[]
	//   20   39:dup             
	//   21   40:iconst_0        
	//   22   41:fconst_1        
	//   23   42:fastore         
	//   24   43:invokestatic    #55  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//   25   46:astore_1        
		} else
	//*  26   47:goto            65
		{
			view = ((View) (ObjectAnimator.ofFloat(((Object) (view)), View.ALPHA, new float[] {
				0.0F
			})));
	//   27   50:aload_1         
	//   28   51:getstatic       #49  <Field android.util.Property View.ALPHA>
	//   29   54:iconst_1        
	//   30   55:newarray        float[]
	//   31   57:dup             
	//   32   58:iconst_0        
	//   33   59:fconst_0        
	//   34   60:fastore         
	//   35   61:invokestatic    #55  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//   36   64:astore_1        
		}
		((MotionTiming) (list1)).apply(((Animator) (view)));
	//   37   65:aload           5
	//   38   67:aload_1         
	//   39   68:invokevirtual   #59  <Method void MotionTiming.apply(Animator)>
		list.add(((Object) (view)));
	//   40   71:aload           4
	//   41   73:aload_1         
	//   42   74:invokeinterface #65  <Method boolean List.add(Object)>
	//   43   79:pop             
	//   44   80:return          
	}

	public boolean layoutDependsOn(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
		return view1 instanceof FloatingActionButton;
	//    0    0:aload_3         
	//    1    1:instanceof      #71  <Class FloatingActionButton>
	//    2    4:ireturn         
	}

	protected AnimatorSet onCreateExpandedStateChangeAnimation(View view, final View child, final boolean expanded, boolean flag)
	{
		view = ((View) (new ArrayList()));
	//    0    0:new             #76  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void ArrayList()>
	//    3    7:astore_1        
		createScrimAnimation(child, expanded, flag, ((List) (view)), ((List) (new ArrayList())));
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:aload_1         
	//    9   14:new             #76  <Class ArrayList>
	//   10   17:dup             
	//   11   18:invokespecial   #77  <Method void ArrayList()>
	//   12   21:invokespecial   #79  <Method void createScrimAnimation(View, boolean, boolean, List, List)>
		AnimatorSet animatorset = new AnimatorSet();
	//   13   24:new             #81  <Class AnimatorSet>
	//   14   27:dup             
	//   15   28:invokespecial   #82  <Method void AnimatorSet()>
	//   16   31:astore          5
		AnimatorSetCompat.playTogether(animatorset, ((List) (view)));
	//   17   33:aload           5
	//   18   35:aload_1         
	//   19   36:invokestatic    #88  <Method void AnimatorSetCompat.playTogether(AnimatorSet, List)>
		animatorset.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

			public void onAnimationEnd(Animator animator)
			{
				if(!expanded)
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field boolean val$expanded>
			//*   2    4:ifne            15
					child.setVisibility(4);
			//    3    7:aload_0         
			//    4    8:getfield        #23  <Field View val$child>
			//    5   11:iconst_4        
			//    6   12:invokevirtual   #35  <Method void View.setVisibility(int)>
			//    7   15:return          
			}

			public void onAnimationStart(Animator animator)
			{
				if(expanded)
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field boolean val$expanded>
			//*   2    4:ifeq            15
					child.setVisibility(0);
			//    3    7:aload_0         
			//    4    8:getfield        #23  <Field View val$child>
			//    5   11:iconst_0        
			//    6   12:invokevirtual   #35  <Method void View.setVisibility(int)>
			//    7   15:return          
			}

			final FabTransformationScrimBehavior this$0;
			final View val$child;
			final boolean val$expanded;

			
			{
				this$0 = FabTransformationScrimBehavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field FabTransformationScrimBehavior this$0>
				expanded = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field boolean val$expanded>
				child = view;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field View val$child>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void AnimatorListenerAdapter()>
			//   11   19:return          
			}
		}
)));
	//   20   39:aload           5
	//   21   41:new             #6   <Class FabTransformationScrimBehavior$1>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:iload_3         
	//   25   47:aload_2         
	//   26   48:invokespecial   #91  <Method void FabTransformationScrimBehavior$1(FabTransformationScrimBehavior, boolean, View)>
	//   27   51:invokevirtual   #95  <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>
		return animatorset;
	//   28   54:aload           5
	//   29   56:areturn         
	}

	public boolean onTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		return super.onTouchEvent(coordinatorlayout, view, motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #100 <Method boolean ExpandableTransformationBehavior.onTouchEvent(CoordinatorLayout, View, MotionEvent)>
	//    5    7:ireturn         
	}

	public static final long COLLAPSE_DELAY = 0L;
	public static final long COLLAPSE_DURATION = 150L;
	public static final long EXPAND_DELAY = 75L;
	public static final long EXPAND_DURATION = 150L;
	private final MotionTiming collapseTiming;
	private final MotionTiming expandTiming;
}
