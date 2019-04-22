// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			KeyframeAnimation, Keyframe, GammaEvaluator

class ColorKeyframeAnimation extends KeyframeAnimation
{

	ColorKeyframeAnimation(List list)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void KeyframeAnimation(List)>
	//    3    5:return          
	}

	public Integer getValue(Keyframe keyframe, float f)
	{
		if(keyframe.startValue != null && keyframe.endValue != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #20  <Field Object Keyframe.startValue>
	//*   2    4:ifnull          42
	//*   3    7:aload_1         
	//*   4    8:getfield        #23  <Field Object Keyframe.endValue>
	//*   5   11:ifnull          42
			return Integer.valueOf(GammaEvaluator.evaluate(f, ((Integer)keyframe.startValue).intValue(), ((Integer)keyframe.endValue).intValue()));
	//    6   14:fload_2         
	//    7   15:aload_1         
	//    8   16:getfield        #20  <Field Object Keyframe.startValue>
	//    9   19:checkcast       #25  <Class Integer>
	//   10   22:invokevirtual   #29  <Method int Integer.intValue()>
	//   11   25:aload_1         
	//   12   26:getfield        #23  <Field Object Keyframe.endValue>
	//   13   29:checkcast       #25  <Class Integer>
	//   14   32:invokevirtual   #29  <Method int Integer.intValue()>
	//   15   35:invokestatic    #35  <Method int GammaEvaluator.evaluate(float, int, int)>
	//   16   38:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   17   41:areturn         
		else
			throw new IllegalStateException("Missing values for keyframe.");
	//   18   42:new             #41  <Class IllegalStateException>
	//   19   45:dup             
	//   20   46:ldc1            #43  <String "Missing values for keyframe.">
	//   21   48:invokespecial   #46  <Method void IllegalStateException(String)>
	//   22   51:athrow          
	}

	public volatile Object getValue(Keyframe keyframe, float f)
	{
		return ((Object) (getValue(keyframe, f)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:invokevirtual   #50  <Method Integer getValue(Keyframe, float)>
	//    4    6:areturn         
	}
}
