// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model.animation;

import android.view.animation.Interpolator;
import com.amap.api.maps.model.LatLng;
import com.autonavi.amap.mapcore.animation.GLAnimation;
import com.autonavi.amap.mapcore.animation.GLTranslateAnimation;

// Referenced classes of package com.amap.api.maps.model.animation:
//			Animation

public class TranslateAnimation extends Animation
{

	public TranslateAnimation(LatLng latlng)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Animation()>
		glAnimation = ((GLAnimation) (new GLTranslateAnimation(latlng)));
	//    2    4:aload_0         
	//    3    5:new             #11  <Class GLTranslateAnimation>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #13  <Method void GLTranslateAnimation(LatLng)>
	//    7   13:putfield        #17  <Field GLAnimation glAnimation>
	//    8   16:return          
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
