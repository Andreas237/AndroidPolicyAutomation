// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.inappbrowser;

import android.animation.ValueAnimator;

// Referenced classes of package com.startapp.android.publish.inappbrowser:
//			AnimatingProgressBar

class AnimatingProgressBar$1
	implements android.animation.pdateListener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		a = (Integer)valueanimator.getAnimatedValue();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #31  <Method Object ValueAnimator.getAnimatedValue()>
	//    3    5:checkcast       #33  <Class Integer>
	//    4    8:putfield        #35  <Field Integer a>
		AnimatingProgressBar.a(b, a.intValue());
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field AnimatingProgressBar b>
	//    7   15:aload_0         
	//    8   16:getfield        #35  <Field Integer a>
	//    9   19:invokevirtual   #39  <Method int Integer.intValue()>
	//   10   22:invokestatic    #42  <Method void AnimatingProgressBar.a(AnimatingProgressBar, int)>
	//   11   25:return          
	}

	Integer a;
	final AnimatingProgressBar b;

	AnimatingProgressBar$1(AnimatingProgressBar animatingprogressbar)
	{
		b = animatingprogressbar;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AnimatingProgressBar b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}
}
