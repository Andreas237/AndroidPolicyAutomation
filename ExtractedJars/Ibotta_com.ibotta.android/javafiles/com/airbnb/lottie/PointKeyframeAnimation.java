// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.PointF;
import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			KeyframeAnimation, Keyframe

class PointKeyframeAnimation extends KeyframeAnimation
{

	PointKeyframeAnimation(List list)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void KeyframeAnimation(List)>
	//    3    5:aload_0         
	//    4    6:new             #13  <Class PointF>
	//    5    9:dup             
	//    6   10:invokespecial   #16  <Method void PointF()>
	//    7   13:putfield        #18  <Field PointF point>
	//    8   16:return          
	}

	public PointF getValue(Keyframe keyframe, float f)
	{
		if(keyframe.startValue != null && keyframe.endValue != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #29  <Field Object Keyframe.startValue>
	//*   2    4:ifnull          74
	//*   3    7:aload_1         
	//*   4    8:getfield        #32  <Field Object Keyframe.endValue>
	//*   5   11:ifnull          74
		{
			PointF pointf = (PointF)keyframe.startValue;
	//    6   14:aload_1         
	//    7   15:getfield        #29  <Field Object Keyframe.startValue>
	//    8   18:checkcast       #13  <Class PointF>
	//    9   21:astore_3        
			keyframe = ((Keyframe) ((PointF)keyframe.endValue));
	//   10   22:aload_1         
	//   11   23:getfield        #32  <Field Object Keyframe.endValue>
	//   12   26:checkcast       #13  <Class PointF>
	//   13   29:astore_1        
			point.set(pointf.x + (((PointF) (keyframe)).x - pointf.x) * f, pointf.y + f * (((PointF) (keyframe)).y - pointf.y));
	//   14   30:aload_0         
	//   15   31:getfield        #18  <Field PointF point>
	//   16   34:aload_3         
	//   17   35:getfield        #36  <Field float PointF.x>
	//   18   38:aload_1         
	//   19   39:getfield        #36  <Field float PointF.x>
	//   20   42:aload_3         
	//   21   43:getfield        #36  <Field float PointF.x>
	//   22   46:fsub            
	//   23   47:fload_2         
	//   24   48:fmul            
	//   25   49:fadd            
	//   26   50:aload_3         
	//   27   51:getfield        #39  <Field float PointF.y>
	//   28   54:fload_2         
	//   29   55:aload_1         
	//   30   56:getfield        #39  <Field float PointF.y>
	//   31   59:aload_3         
	//   32   60:getfield        #39  <Field float PointF.y>
	//   33   63:fsub            
	//   34   64:fmul            
	//   35   65:fadd            
	//   36   66:invokevirtual   #43  <Method void PointF.set(float, float)>
			return point;
	//   37   69:aload_0         
	//   38   70:getfield        #18  <Field PointF point>
	//   39   73:areturn         
		} else
		{
			throw new IllegalStateException("Missing values for keyframe.");
	//   40   74:new             #45  <Class IllegalStateException>
	//   41   77:dup             
	//   42   78:ldc1            #47  <String "Missing values for keyframe.">
	//   43   80:invokespecial   #50  <Method void IllegalStateException(String)>
	//   44   83:athrow          
		}
	}

	public volatile Object getValue(Keyframe keyframe, float f)
	{
		return ((Object) (getValue(keyframe, f)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:invokevirtual   #54  <Method PointF getValue(Keyframe, float)>
	//    4    6:areturn         
	}

	private final PointF point = new PointF();
}
