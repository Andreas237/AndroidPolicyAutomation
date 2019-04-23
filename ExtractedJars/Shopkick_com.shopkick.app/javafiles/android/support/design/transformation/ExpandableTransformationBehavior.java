// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.transformation;

import android.animation.*;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package android.support.design.transformation:
//			ExpandableBehavior

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior
{

	public ExpandableTransformationBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void ExpandableBehavior()>
	//    2    4:return          
	}

	public ExpandableTransformationBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #17  <Method void ExpandableBehavior(Context, AttributeSet)>
	//    4    6:return          
	}

	protected abstract AnimatorSet onCreateExpandedStateChangeAnimation(View view, View view1, boolean flag, boolean flag1);

	protected boolean onExpandedStateChange(View view, View view1, boolean flag, boolean flag1)
	{
		boolean flag2;
		if(currentAnimation != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field AnimatorSet currentAnimation>
	//*   2    4:ifnull          13
			flag2 = true;
	//    3    7:iconst_1        
	//    4    8:istore          5
		else
	//*   5   10:goto            16
			flag2 = false;
	//    6   13:iconst_0        
	//    7   14:istore          5
		if(flag2)
	//*   8   16:iload           5
	//*   9   18:ifeq            28
			currentAnimation.cancel();
	//   10   21:aload_0         
	//   11   22:getfield        #21  <Field AnimatorSet currentAnimation>
	//   12   25:invokevirtual   #32  <Method void AnimatorSet.cancel()>
		currentAnimation = onCreateExpandedStateChangeAnimation(view, view1, flag, flag2);
	//   13   28:aload_0         
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:aload_2         
	//   17   32:iload_3         
	//   18   33:iload           5
	//   19   35:invokevirtual   #34  <Method AnimatorSet onCreateExpandedStateChangeAnimation(View, View, boolean, boolean)>
	//   20   38:putfield        #21  <Field AnimatorSet currentAnimation>
		currentAnimation.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

			public void onAnimationEnd(Animator animator)
			{
				currentAnimation = null;
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ExpandableTransformationBehavior this$0>
			//    2    4:aconst_null     
			//    3    5:invokestatic    #25  <Method AnimatorSet ExpandableTransformationBehavior.access$002(ExpandableTransformationBehavior, AnimatorSet)>
			//    4    8:pop             
			//    5    9:return          
			}

			final ExpandableTransformationBehavior this$0;

			
			{
				this$0 = ExpandableTransformationBehavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ExpandableTransformationBehavior this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
		}
)));
	//   21   41:aload_0         
	//   22   42:getfield        #21  <Field AnimatorSet currentAnimation>
	//   23   45:new             #6   <Class ExpandableTransformationBehavior$1>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:invokespecial   #37  <Method void ExpandableTransformationBehavior$1(ExpandableTransformationBehavior)>
	//   27   53:invokevirtual   #41  <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>
		currentAnimation.start();
	//   28   56:aload_0         
	//   29   57:getfield        #21  <Field AnimatorSet currentAnimation>
	//   30   60:invokevirtual   #44  <Method void AnimatorSet.start()>
		if(!flag1)
	//*  31   63:iload           4
	//*  32   65:ifne            75
			currentAnimation.end();
	//   33   68:aload_0         
	//   34   69:getfield        #21  <Field AnimatorSet currentAnimation>
	//   35   72:invokevirtual   #47  <Method void AnimatorSet.end()>
		return true;
	//   36   75:iconst_1        
	//   37   76:ireturn         
	}

	private AnimatorSet currentAnimation;


/*
	static AnimatorSet access$002(ExpandableTransformationBehavior expandabletransformationbehavior, AnimatorSet animatorset)
	{
		expandabletransformationbehavior.currentAnimation = animatorset;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field AnimatorSet currentAnimation>
		return animatorset;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/
}
