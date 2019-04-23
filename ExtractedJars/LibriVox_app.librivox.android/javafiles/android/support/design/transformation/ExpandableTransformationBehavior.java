// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package android.support.design.transformation:
//			ExpandableBehavior, b

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior
{

	public ExpandableTransformationBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void ExpandableBehavior()>
	//    2    4:return          
	}

	public ExpandableTransformationBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #14  <Method void ExpandableBehavior(Context, AttributeSet)>
	//    4    6:return          
	}

	static AnimatorSet a(ExpandableTransformationBehavior expandabletransformationbehavior, AnimatorSet animatorset)
	{
		expandabletransformationbehavior.a = animatorset;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AnimatorSet a>
		return animatorset;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	protected boolean a(View view, View view1, boolean flag, boolean flag1)
	{
		boolean flag2;
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field AnimatorSet a>
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
			a.cancel();
	//   10   21:aload_0         
	//   11   22:getfield        #17  <Field AnimatorSet a>
	//   12   25:invokevirtual   #23  <Method void AnimatorSet.cancel()>
		a = b(view, view1, flag, flag2);
	//   13   28:aload_0         
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:aload_2         
	//   17   32:iload_3         
	//   18   33:iload           5
	//   19   35:invokevirtual   #27  <Method AnimatorSet b(View, View, boolean, boolean)>
	//   20   38:putfield        #17  <Field AnimatorSet a>
		a.addListener(((android.animation.Animator.AnimatorListener) (new b(this))));
	//   21   41:aload_0         
	//   22   42:getfield        #17  <Field AnimatorSet a>
	//   23   45:new             #29  <Class b>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:invokespecial   #32  <Method void b(ExpandableTransformationBehavior)>
	//   27   53:invokevirtual   #36  <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>
		a.start();
	//   28   56:aload_0         
	//   29   57:getfield        #17  <Field AnimatorSet a>
	//   30   60:invokevirtual   #39  <Method void AnimatorSet.start()>
		if(!flag1)
	//*  31   63:iload           4
	//*  32   65:ifne            75
			a.end();
	//   33   68:aload_0         
	//   34   69:getfield        #17  <Field AnimatorSet a>
	//   35   72:invokevirtual   #42  <Method void AnimatorSet.end()>
		return true;
	//   36   75:iconst_1        
	//   37   76:ireturn         
	}

	protected abstract AnimatorSet b(View view, View view1, boolean flag, boolean flag1);

	private AnimatorSet a;
}
