// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			KeyframeAnimation, Keyframe

class SplitDimensionPathKeyframeAnimation extends KeyframeAnimation
{

	SplitDimensionPathKeyframeAnimation(KeyframeAnimation keyframeanimation, KeyframeAnimation keyframeanimation1)
	{
		super(Collections.emptyList());
	//    0    0:aload_0         
	//    1    1:invokestatic    #19  <Method List Collections.emptyList()>
	//    2    4:invokespecial   #22  <Method void KeyframeAnimation(List)>
	//    3    7:aload_0         
	//    4    8:new             #24  <Class PointF>
	//    5   11:dup             
	//    6   12:invokespecial   #27  <Method void PointF()>
	//    7   15:putfield        #29  <Field PointF point>
		xAnimation = keyframeanimation;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #31  <Field KeyframeAnimation xAnimation>
		yAnimation = keyframeanimation1;
	//   11   23:aload_0         
	//   12   24:aload_2         
	//   13   25:putfield        #33  <Field KeyframeAnimation yAnimation>
	//   14   28:return          
	}

	public PointF getValue()
	{
		return getValue(((Keyframe) (null)), 0.0F);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:fconst_0        
	//    3    3:invokevirtual   #41  <Method PointF getValue(Keyframe, float)>
	//    4    6:areturn         
	}

	PointF getValue(Keyframe keyframe, float f)
	{
		return point;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field PointF point>
	//    2    4:areturn         
	}

	public volatile Object getValue()
	{
		return ((Object) (getValue()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method PointF getValue()>
	//    2    4:areturn         
	}

	volatile Object getValue(Keyframe keyframe, float f)
	{
		return ((Object) (getValue(keyframe, f)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:invokevirtual   #41  <Method PointF getValue(Keyframe, float)>
	//    4    6:areturn         
	}

	void setProgress(float f)
	{
		xAnimation.setProgress(f);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field KeyframeAnimation xAnimation>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #50  <Method void KeyframeAnimation.setProgress(float)>
		yAnimation.setProgress(f);
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field KeyframeAnimation yAnimation>
	//    6   12:fload_1         
	//    7   13:invokevirtual   #50  <Method void KeyframeAnimation.setProgress(float)>
		point.set(((Float)xAnimation.getValue()).floatValue(), ((Float)yAnimation.getValue()).floatValue());
	//    8   16:aload_0         
	//    9   17:getfield        #29  <Field PointF point>
	//   10   20:aload_0         
	//   11   21:getfield        #31  <Field KeyframeAnimation xAnimation>
	//   12   24:invokevirtual   #52  <Method Object KeyframeAnimation.getValue()>
	//   13   27:checkcast       #54  <Class Float>
	//   14   30:invokevirtual   #58  <Method float Float.floatValue()>
	//   15   33:aload_0         
	//   16   34:getfield        #33  <Field KeyframeAnimation yAnimation>
	//   17   37:invokevirtual   #52  <Method Object KeyframeAnimation.getValue()>
	//   18   40:checkcast       #54  <Class Float>
	//   19   43:invokevirtual   #58  <Method float Float.floatValue()>
	//   20   46:invokevirtual   #62  <Method void PointF.set(float, float)>
		for(int i = 0; i < listeners.size(); i++)
	//*  21   49:iconst_0        
	//*  22   50:istore_2        
	//*  23   51:iload_2         
	//*  24   52:aload_0         
	//*  25   53:getfield        #66  <Field List listeners>
	//*  26   56:invokeinterface #72  <Method int List.size()>
	//*  27   61:icmpge          89
			((BaseKeyframeAnimation.AnimationListener)listeners.get(i)).onValueChanged();
	//   28   64:aload_0         
	//   29   65:getfield        #66  <Field List listeners>
	//   30   68:iload_2         
	//   31   69:invokeinterface #76  <Method Object List.get(int)>
	//   32   74:checkcast       #78  <Class BaseKeyframeAnimation$AnimationListener>
	//   33   77:invokeinterface #81  <Method void BaseKeyframeAnimation$AnimationListener.onValueChanged()>

	//   34   82:iload_2         
	//   35   83:iconst_1        
	//   36   84:iadd            
	//   37   85:istore_2        
	//*  38   86:goto            51
	//   39   89:return          
	}

	private final PointF point = new PointF();
	private final KeyframeAnimation xAnimation;
	private final KeyframeAnimation yAnimation;
}
