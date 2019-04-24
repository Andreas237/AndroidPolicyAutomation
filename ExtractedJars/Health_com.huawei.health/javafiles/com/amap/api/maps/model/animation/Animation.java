// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model.animation;

import android.view.animation.Interpolator;
import com.autonavi.amap.mapcore.animation.GLAnimation;

public abstract class Animation
{
	public static interface AnimationListener
	{

		public abstract void onAnimationEnd();

		public abstract void onAnimationStart();
	}


	public Animation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		glAnimation = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #15  <Field GLAnimation glAnimation>
		glAnimation = new GLAnimation();
	//    5    9:aload_0         
	//    6   10:new             #17  <Class GLAnimation>
	//    7   13:dup             
	//    8   14:invokespecial   #18  <Method void GLAnimation()>
	//    9   17:putfield        #15  <Field GLAnimation glAnimation>
	//   10   20:return          
	}

	public void setAnimationListener(AnimationListener animationlistener)
	{
		glAnimation.setAnimationListener(animationlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GLAnimation glAnimation>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #23  <Method void GLAnimation.setAnimationListener(Animation$AnimationListener)>
	//    4    8:return          
	}

	public abstract void setDuration(long l);

	public abstract void setInterpolator(Interpolator interpolator);

	public GLAnimation glAnimation;
}
