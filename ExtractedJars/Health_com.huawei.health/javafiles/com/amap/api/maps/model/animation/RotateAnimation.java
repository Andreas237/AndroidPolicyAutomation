// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model.animation;

import android.view.animation.Interpolator;
import com.autonavi.amap.mapcore.animation.GLAnimation;
import com.autonavi.amap.mapcore.animation.GLRotateAnimation;

// Referenced classes of package com.amap.api.maps.model.animation:
//			Animation

public class RotateAnimation extends Animation
{

	public RotateAnimation(float f, float f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Animation()>
		glAnimation = ((GLAnimation) (new GLRotateAnimation(f, f1, 0.0F, 0.0F, 0.0F)));
	//    2    4:aload_0         
	//    3    5:new             #11  <Class GLRotateAnimation>
	//    4    8:dup             
	//    5    9:fload_1         
	//    6   10:fload_2         
	//    7   11:fconst_0        
	//    8   12:fconst_0        
	//    9   13:fconst_0        
	//   10   14:invokespecial   #14  <Method void GLRotateAnimation(float, float, float, float, float)>
	//   11   17:putfield        #18  <Field GLAnimation glAnimation>
	//   12   20:return          
	}

	public RotateAnimation(float f, float f1, float f2, float f3, float f4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Animation()>
		glAnimation = ((GLAnimation) (new GLRotateAnimation(f, f1, f2, f3, f4)));
	//    2    4:aload_0         
	//    3    5:new             #11  <Class GLRotateAnimation>
	//    4    8:dup             
	//    5    9:fload_1         
	//    6   10:fload_2         
	//    7   11:fload_3         
	//    8   12:fload           4
	//    9   14:fload           5
	//   10   16:invokespecial   #14  <Method void GLRotateAnimation(float, float, float, float, float)>
	//   11   19:putfield        #18  <Field GLAnimation glAnimation>
	//   12   22:return          
	}

	public void setDuration(long l)
	{
		glAnimation.setDuration(l);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field GLAnimation glAnimation>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #25  <Method void GLAnimation.setDuration(long)>
	//    4    8:return          
	}

	public void setInterpolator(Interpolator interpolator)
	{
		glAnimation.setInterpolator(interpolator);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field GLAnimation glAnimation>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #29  <Method void GLAnimation.setInterpolator(Interpolator)>
	//    4    8:return          
	}
}
