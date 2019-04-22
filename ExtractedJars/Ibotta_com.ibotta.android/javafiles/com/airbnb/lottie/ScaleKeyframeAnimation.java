// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			KeyframeAnimation, Keyframe, ScaleXY, MiscUtils

class ScaleKeyframeAnimation extends KeyframeAnimation
{

	ScaleKeyframeAnimation(List list)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void KeyframeAnimation(List)>
	//    3    5:return          
	}

	public ScaleXY getValue(Keyframe keyframe, float f)
	{
		if(keyframe.startValue != null && keyframe.endValue != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #20  <Field Object Keyframe.startValue>
	//*   2    4:ifnull          62
	//*   3    7:aload_1         
	//*   4    8:getfield        #23  <Field Object Keyframe.endValue>
	//*   5   11:ifnull          62
		{
			ScaleXY scalexy = (ScaleXY)keyframe.startValue;
	//    6   14:aload_1         
	//    7   15:getfield        #20  <Field Object Keyframe.startValue>
	//    8   18:checkcast       #25  <Class ScaleXY>
	//    9   21:astore_3        
			keyframe = ((Keyframe) ((ScaleXY)keyframe.endValue));
	//   10   22:aload_1         
	//   11   23:getfield        #23  <Field Object Keyframe.endValue>
	//   12   26:checkcast       #25  <Class ScaleXY>
	//   13   29:astore_1        
			return new ScaleXY(MiscUtils.lerp(scalexy.getScaleX(), ((ScaleXY) (keyframe)).getScaleX(), f), MiscUtils.lerp(scalexy.getScaleY(), ((ScaleXY) (keyframe)).getScaleY(), f));
	//   14   30:new             #25  <Class ScaleXY>
	//   15   33:dup             
	//   16   34:aload_3         
	//   17   35:invokevirtual   #29  <Method float ScaleXY.getScaleX()>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #29  <Method float ScaleXY.getScaleX()>
	//   20   42:fload_2         
	//   21   43:invokestatic    #35  <Method float MiscUtils.lerp(float, float, float)>
	//   22   46:aload_3         
	//   23   47:invokevirtual   #38  <Method float ScaleXY.getScaleY()>
	//   24   50:aload_1         
	//   25   51:invokevirtual   #38  <Method float ScaleXY.getScaleY()>
	//   26   54:fload_2         
	//   27   55:invokestatic    #35  <Method float MiscUtils.lerp(float, float, float)>
	//   28   58:invokespecial   #41  <Method void ScaleXY(float, float)>
	//   29   61:areturn         
		} else
		{
			throw new IllegalStateException("Missing values for keyframe.");
	//   30   62:new             #43  <Class IllegalStateException>
	//   31   65:dup             
	//   32   66:ldc1            #45  <String "Missing values for keyframe.">
	//   33   68:invokespecial   #48  <Method void IllegalStateException(String)>
	//   34   71:athrow          
		}
	}

	public volatile Object getValue(Keyframe keyframe, float f)
	{
		return ((Object) (getValue(keyframe, f)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:invokevirtual   #52  <Method ScaleXY getValue(Keyframe, float)>
	//    4    6:areturn         
	}
}
