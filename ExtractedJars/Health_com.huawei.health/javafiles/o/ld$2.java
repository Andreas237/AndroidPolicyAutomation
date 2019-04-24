// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.animation.ValueAnimator;

// Referenced classes of package o:
//			ld

class ld$2
	implements android.animation.Animator.AnimatorUpdateListener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		d.postInvalidate();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ld d>
	//    2    4:invokevirtual   #25  <Method void ld.postInvalidate()>
	//    3    7:return          
	}

	final ld d;

	ld$2(ld ld1)
	{
		d = ld1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ld d>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
