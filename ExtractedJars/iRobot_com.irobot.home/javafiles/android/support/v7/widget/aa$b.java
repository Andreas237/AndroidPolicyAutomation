// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

// Referenced classes of package android.support.v7.widget:
//			aa

private class aa$b
	implements android.animation.Animator.AnimatorUpdateListener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		int i = (int)(((Float)valueanimator.getAnimatedValue()).floatValue() * 255F);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #30  <Method Object ValueAnimator.getAnimatedValue()>
	//    2    4:checkcast       #32  <Class Float>
	//    3    7:invokevirtual   #36  <Method float Float.floatValue()>
	//    4   10:ldc1            #37  <Float 255F>
	//    5   12:fmul            
	//    6   13:f2i             
	//    7   14:istore_2        
		aa.c(a).setAlpha(i);
	//    8   15:aload_0         
	//    9   16:getfield        #15  <Field aa a>
	//   10   19:invokestatic    #41  <Method StateListDrawable aa.c(aa)>
	//   11   22:iload_2         
	//   12   23:invokevirtual   #47  <Method void StateListDrawable.setAlpha(int)>
		aa.d(a).setAlpha(i);
	//   13   26:aload_0         
	//   14   27:getfield        #15  <Field aa a>
	//   15   30:invokestatic    #51  <Method Drawable aa.d(aa)>
	//   16   33:iload_2         
	//   17   34:invokevirtual   #54  <Method void Drawable.setAlpha(int)>
		aa.b(a);
	//   18   37:aload_0         
	//   19   38:getfield        #15  <Field aa a>
	//   20   41:invokestatic    #56  <Method void aa.b(aa)>
	//   21   44:return          
	}

	final aa a;

	private aa$b(aa aa1)
	{
		a = aa1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field aa a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	aa$b(aa aa1, aa$1 aa$1)
	{
		this(aa1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void aa$b(aa)>
	//    3    5:return          
	}
}
