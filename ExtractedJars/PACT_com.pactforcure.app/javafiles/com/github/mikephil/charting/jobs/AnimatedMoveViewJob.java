// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.jobs;

import android.animation.ValueAnimator;
import android.view.View;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;

// Referenced classes of package com.github.mikephil.charting.jobs:
//			AnimatedViewPortJob

public class AnimatedMoveViewJob extends AnimatedViewPortJob
{

	public AnimatedMoveViewJob(ViewPortHandler viewporthandler, float f, float f1, Transformer transformer, View view, float f2, float f3, 
			long l)
	{
		super(viewporthandler, f, f1, transformer, view, f2, f3, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:fload           6
	//    7   10:fload           7
	//    8   12:lload           8
	//    9   14:invokespecial   #8   <Method void AnimatedViewPortJob(ViewPortHandler, float, float, Transformer, View, float, float, long)>
	//   10   17:return          
	}

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		pts[0] = xOrigin + (xValue - xOrigin) * phase;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field float[] pts>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field float xOrigin>
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field float xValue>
	//    7   13:aload_0         
	//    8   14:getfield        #19  <Field float xOrigin>
	//    9   17:fsub            
	//   10   18:aload_0         
	//   11   19:getfield        #25  <Field float phase>
	//   12   22:fmul            
	//   13   23:fadd            
	//   14   24:fastore         
		pts[1] = yOrigin + (yValue - yOrigin) * phase;
	//   15   25:aload_0         
	//   16   26:getfield        #15  <Field float[] pts>
	//   17   29:iconst_1        
	//   18   30:aload_0         
	//   19   31:getfield        #28  <Field float yOrigin>
	//   20   34:aload_0         
	//   21   35:getfield        #31  <Field float yValue>
	//   22   38:aload_0         
	//   23   39:getfield        #28  <Field float yOrigin>
	//   24   42:fsub            
	//   25   43:aload_0         
	//   26   44:getfield        #25  <Field float phase>
	//   27   47:fmul            
	//   28   48:fadd            
	//   29   49:fastore         
		mTrans.pointValuesToPixel(pts);
	//   30   50:aload_0         
	//   31   51:getfield        #35  <Field Transformer mTrans>
	//   32   54:aload_0         
	//   33   55:getfield        #15  <Field float[] pts>
	//   34   58:invokevirtual   #41  <Method void Transformer.pointValuesToPixel(float[])>
		mViewPortHandler.centerViewPort(pts, view);
	//   35   61:aload_0         
	//   36   62:getfield        #45  <Field ViewPortHandler mViewPortHandler>
	//   37   65:aload_0         
	//   38   66:getfield        #15  <Field float[] pts>
	//   39   69:aload_0         
	//   40   70:getfield        #49  <Field View view>
	//   41   73:invokevirtual   #55  <Method void ViewPortHandler.centerViewPort(float[], View)>
	//   42   76:return          
	}
}
