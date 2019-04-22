// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.*;

// Referenced classes of package com.airbnb.lottie:
//			BaseStrokeContent, ShapeStroke, AnimatableColorValue, KeyframeAnimation, 
//			BaseLayer, LottieDrawable

class StrokeContent extends BaseStrokeContent
{

	StrokeContent(LottieDrawable lottiedrawable, BaseLayer baselayer, ShapeStroke shapestroke)
	{
		super(lottiedrawable, baselayer, shapestroke.getCapType().toPaintCap(), shapestroke.getJoinType().toPaintJoin(), shapestroke.getOpacity(), shapestroke.getWidth(), shapestroke.getLineDashPattern(), shapestroke.getDashOffset());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #17  <Method ShapeStroke$LineCapType ShapeStroke.getCapType()>
	//    5    7:invokevirtual   #23  <Method android.graphics.Paint$Cap ShapeStroke$LineCapType.toPaintCap()>
	//    6   10:aload_3         
	//    7   11:invokevirtual   #27  <Method ShapeStroke$LineJoinType ShapeStroke.getJoinType()>
	//    8   14:invokevirtual   #33  <Method android.graphics.Paint$Join ShapeStroke$LineJoinType.toPaintJoin()>
	//    9   17:aload_3         
	//   10   18:invokevirtual   #37  <Method AnimatableIntegerValue ShapeStroke.getOpacity()>
	//   11   21:aload_3         
	//   12   22:invokevirtual   #41  <Method AnimatableFloatValue ShapeStroke.getWidth()>
	//   13   25:aload_3         
	//   14   26:invokevirtual   #45  <Method java.util.List ShapeStroke.getLineDashPattern()>
	//   15   29:aload_3         
	//   16   30:invokevirtual   #48  <Method AnimatableFloatValue ShapeStroke.getDashOffset()>
	//   17   33:invokespecial   #51  <Method void BaseStrokeContent(LottieDrawable, BaseLayer, android.graphics.Paint$Cap, android.graphics.Paint$Join, AnimatableIntegerValue, AnimatableFloatValue, java.util.List, AnimatableFloatValue)>
		name = shapestroke.getName();
	//   18   36:aload_0         
	//   19   37:aload_3         
	//   20   38:invokevirtual   #55  <Method String ShapeStroke.getName()>
	//   21   41:putfield        #57  <Field String name>
		colorAnimation = shapestroke.getColor().createAnimation();
	//   22   44:aload_0         
	//   23   45:aload_3         
	//   24   46:invokevirtual   #61  <Method AnimatableColorValue ShapeStroke.getColor()>
	//   25   49:invokevirtual   #67  <Method KeyframeAnimation AnimatableColorValue.createAnimation()>
	//   26   52:putfield        #69  <Field KeyframeAnimation colorAnimation>
		colorAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   27   55:aload_0         
	//   28   56:getfield        #69  <Field KeyframeAnimation colorAnimation>
	//   29   59:aload_0         
	//   30   60:invokevirtual   #75  <Method void KeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		baselayer.addAnimation(((BaseKeyframeAnimation) (colorAnimation)));
	//   31   63:aload_2         
	//   32   64:aload_0         
	//   33   65:getfield        #69  <Field KeyframeAnimation colorAnimation>
	//   34   68:invokevirtual   #81  <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
	//   35   71:return          
	}

	public void addColorFilter(String s, String s1, ColorFilter colorfilter)
	{
		paint.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Paint paint>
	//    2    4:aload_3         
	//    3    5:invokevirtual   #95  <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void draw(Canvas canvas, Matrix matrix, int i)
	{
		paint.setColor(((Integer)colorAnimation.getValue()).intValue());
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Paint paint>
	//    2    4:aload_0         
	//    3    5:getfield        #69  <Field KeyframeAnimation colorAnimation>
	//    4    8:invokevirtual   #102 <Method Object KeyframeAnimation.getValue()>
	//    5   11:checkcast       #104 <Class Integer>
	//    6   14:invokevirtual   #108 <Method int Integer.intValue()>
	//    7   17:invokevirtual   #112 <Method void Paint.setColor(int)>
		super.draw(canvas, matrix, i);
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:aload_2         
	//   11   23:iload_3         
	//   12   24:invokespecial   #114 <Method void BaseStrokeContent.draw(Canvas, Matrix, int)>
	//   13   27:return          
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String name>
	//    2    4:areturn         
	}

	private final KeyframeAnimation colorAnimation;
	private final String name;
}
