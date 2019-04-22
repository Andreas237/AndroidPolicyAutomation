// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			KeyframeAnimation, Keyframe, MiscUtils

class IntegerKeyframeAnimation extends KeyframeAnimation
{

	IntegerKeyframeAnimation(List list)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void KeyframeAnimation(List)>
	//    3    5:return          
	}

	Integer getValue(Keyframe keyframe, float f)
	{
		if(keyframe.startValue != null && keyframe.endValue != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #20  <Field Object Keyframe.startValue>
	//*   2    4:ifnull          42
	//*   3    7:aload_1         
	//*   4    8:getfield        #23  <Field Object Keyframe.endValue>
	//*   5   11:ifnull          42
			return Integer.valueOf(MiscUtils.lerp(((Integer)keyframe.startValue).intValue(), ((Integer)keyframe.endValue).intValue(), f));
	//    6   14:aload_1         
	//    7   15:getfield        #20  <Field Object Keyframe.startValue>
	//    8   18:checkcast       #25  <Class Integer>
	//    9   21:invokevirtual   #29  <Method int Integer.intValue()>
	//   10   24:aload_1         
	//   11   25:getfield        #23  <Field Object Keyframe.endValue>
	//   12   28:checkcast       #25  <Class Integer>
	//   13   31:invokevirtual   #29  <Method int Integer.intValue()>
	//   14   34:fload_2         
	//   15   35:invokestatic    #35  <Method int MiscUtils.lerp(int, int, float)>
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

	volatile Object getValue(Keyframe keyframe, float f)
	{
		return ((Object) (getValue(keyframe, f)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:invokevirtual   #50  <Method Integer getValue(Keyframe, float)>
	//    4    6:areturn         
	}
}
