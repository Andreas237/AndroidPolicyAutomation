// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model.animation;

import android.view.animation.Interpolator;
import com.autonavi.amap.mapcore.animation.GLAnimation;
import com.autonavi.amap.mapcore.animation.GLAnimationSet;

// Referenced classes of package com.amap.api.maps.model.animation:
//			Animation

public class AnimationSet extends Animation
{

	public AnimationSet(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Animation()>
		glAnimation = ((GLAnimation) (new GLAnimationSet(flag)));
	//    2    4:aload_0         
	//    3    5:new             #11  <Class GLAnimationSet>
	//    4    8:dup             
	//    5    9:iload_1         
	//    6   10:invokespecial   #13  <Method void GLAnimationSet(boolean)>
	//    7   13:putfield        #17  <Field GLAnimation glAnimation>
	//    8   16:return          
	}

	public void addAnimation(Animation animation)
	{
		((GLAnimationSet)glAnimation).addAnimation(animation);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field GLAnimation glAnimation>
	//    2    4:checkcast       #11  <Class GLAnimationSet>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #22  <Method void GLAnimationSet.addAnimation(Animation)>
	//    5   11:return          
	}

	public void cleanAnimation()
	{
		((GLAnimationSet)glAnimation).cleanAnimation();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field GLAnimation glAnimation>
	//    2    4:checkcast       #11  <Class GLAnimationSet>
	//    3    7:invokevirtual   #25  <Method void GLAnimationSet.cleanAnimation()>
	//    4   10:return          
	}

	public void setDuration(long l)
	{
		glAnimation.setDuration(l);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field GLAnimation glAnimation>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #31  <Method void GLAnimation.setDuration(long)>
	//    4    8:return          
	}

	public void setInterpolator(Interpolator interpolator)
	{
		glAnimation.setInterpolator(interpolator);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field GLAnimation glAnimation>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #35  <Method void GLAnimation.setInterpolator(Interpolator)>
	//    4    8:return          
	}
}
