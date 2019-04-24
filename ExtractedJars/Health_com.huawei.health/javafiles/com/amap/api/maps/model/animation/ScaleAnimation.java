// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model.animation;

import android.view.animation.Interpolator;
import com.autonavi.amap.mapcore.animation.GLAnimation;
import com.autonavi.amap.mapcore.animation.GLScaleAnimation;

// Referenced classes of package com.amap.api.maps.model.animation:
//			Animation

public class ScaleAnimation extends Animation
{

	public ScaleAnimation(float f, float f1, float f2, float f3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Animation()>
		glAnimation = ((GLAnimation) (new GLScaleAnimation(f, f1, f2, f3)));
	//    2    4:aload_0         
	//    3    5:new             #11  <Class GLScaleAnimation>
	//    4    8:dup             
	//    5    9:fload_1         
	//    6   10:fload_2         
	//    7   11:fload_3         
	//    8   12:fload           4
	//    9   14:invokespecial   #13  <Method void GLScaleAnimation(float, float, float, float)>
	//   10   17:putfield        #17  <Field GLAnimation glAnimation>
	//   11   20:return          
	}

	public void setDuration(long l)
	{
		glAnimation.setDuration(l);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field GLAnimation glAnimation>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #24  <Method void GLAnimation.setDuration(long)>
	//    4    8:return          
	}

	public void setInterpolator(Interpolator interpolator)
	{
		glAnimation.setInterpolator(interpolator);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field GLAnimation glAnimation>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method void GLAnimation.setInterpolator(Interpolator)>
	//    4    8:return          
	}
}
