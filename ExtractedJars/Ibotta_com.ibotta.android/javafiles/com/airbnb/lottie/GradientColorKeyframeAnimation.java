// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			KeyframeAnimation, Keyframe, GradientColor

class GradientColorKeyframeAnimation extends KeyframeAnimation
{

	GradientColorKeyframeAnimation(List list)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void KeyframeAnimation(List)>
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		list = ((List) ((GradientColor)((Keyframe)list.get(0)).startValue));
	//    5    7:aload_1         
	//    6    8:iconst_0        
	//    7    9:invokeinterface #17  <Method Object List.get(int)>
	//    8   14:checkcast       #19  <Class Keyframe>
	//    9   17:getfield        #23  <Field Object Keyframe.startValue>
	//   10   20:checkcast       #25  <Class GradientColor>
	//   11   23:astore_1        
		if(list != null)
	//*  12   24:aload_1         
	//*  13   25:ifnonnull       31
	//*  14   28:goto            36
			i = ((GradientColor) (list)).getSize();
	//   15   31:aload_1         
	//   16   32:invokevirtual   #29  <Method int GradientColor.getSize()>
	//   17   35:istore_2        
		gradientColor = new GradientColor(new float[i], new int[i]);
	//   18   36:aload_0         
	//   19   37:new             #25  <Class GradientColor>
	//   20   40:dup             
	//   21   41:iload_2         
	//   22   42:newarray        float[]
	//   23   44:iload_2         
	//   24   45:newarray        int[]
	//   25   47:invokespecial   #32  <Method void GradientColor(float[], int[])>
	//   26   50:putfield        #34  <Field GradientColor gradientColor>
	//   27   53:return          
	}

	GradientColor getValue(Keyframe keyframe, float f)
	{
		gradientColor.lerp((GradientColor)keyframe.startValue, (GradientColor)keyframe.endValue, f);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field GradientColor gradientColor>
	//    2    4:aload_1         
	//    3    5:getfield        #23  <Field Object Keyframe.startValue>
	//    4    8:checkcast       #25  <Class GradientColor>
	//    5   11:aload_1         
	//    6   12:getfield        #42  <Field Object Keyframe.endValue>
	//    7   15:checkcast       #25  <Class GradientColor>
	//    8   18:fload_2         
	//    9   19:invokevirtual   #46  <Method void GradientColor.lerp(GradientColor, GradientColor, float)>
		return gradientColor;
	//   10   22:aload_0         
	//   11   23:getfield        #34  <Field GradientColor gradientColor>
	//   12   26:areturn         
	}

	volatile Object getValue(Keyframe keyframe, float f)
	{
		return ((Object) (getValue(keyframe, f)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:invokevirtual   #50  <Method GradientColor getValue(Keyframe, float)>
	//    4    6:areturn         
	}

	private final GradientColor gradientColor;
}
